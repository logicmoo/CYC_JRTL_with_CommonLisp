/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.cycl_grammar.cycl_denotational_term_p;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.inference.harness.forward.creation_template_allowable_rules;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference.inference_answer_count;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference.inference_elapsed_universal_time_since_start;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference.inference_hl_query;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference.running_inference_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.destroy_problem_store;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.new_problem_store;
import static com.cyc.cycjava.cycl.inference.harness.inference_metrics.clear_forward_inference_metrics;
import static com.cyc.cycjava.cycl.inference.harness.inference_utilities.latest_inference;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities.ensure_wn_sks_registered;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_escape;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LEARNING-READER
 * source file: /cyc/top/cycl/learning-reader.lisp
 * created:     2019/07/03 17:38:59
 */
public final class learning_reader extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt371$ = makeString("");

    public static final SubLFile me = new learning_reader();



    // deflexical
    @LispMethod(comment = "deflexical")
    // Definitions
    private static final SubLSymbol $learning_reader_timestamp$ = makeSymbol("*LEARNING-READER-TIMESTAMP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $l2r_ebmt_index_host$ = makeSymbol("*L2R-EBMT-INDEX-HOST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $l2r_ebmt_index_port$ = makeSymbol("*L2R-EBMT-INDEX-PORT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $l2r_ebmt_index_content$ = makeSymbol("*L2R-EBMT-INDEX-CONTENT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $l2r_ebmt_index_log$ = makeSymbol("*L2R-EBMT-INDEX-LOG*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $l2r_transmit_operationsP$ = makeSymbol("*L2R-TRANSMIT-OPERATIONS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $l2r_reader_unstable_inside_stepsP$ = makeSymbol("*L2R-READER-UNSTABLE-INSIDE-STEPS?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_l2r_paragraph_reader$ = makeSymbol("*DTP-L2R-PARAGRAPH-READER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $l2r_finalization_problem_store$ = makeSymbol("*L2R-FINALIZATION-PROBLEM-STORE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $long_inference_cutoff$ = makeSymbol("*LONG-INFERENCE-CUTOFF*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $current_long_inference_info$ = makeSymbol("*CURRENT-LONG-INFERENCE-INFO*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_l2r_document_reader$ = makeSymbol("*DTP-L2R-DOCUMENT-READER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_reader_image_document_reader$ = makeSymbol("*L2R-READER-IMAGE-DOCUMENT-READER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_sentence_level_peg_creation_template_caching_state$ = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_sentence_level_peg_exemplar_caching_state$ = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-EXEMPLAR-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_sentence_level_peg_creation_template_sentences_caching_state$ = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_document_indexical_caching_state$ = makeSymbol("*L2R-DOCUMENT-INDEXICAL-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_sentence_indexical_caching_state$ = makeSymbol("*L2R-SENTENCE-INDEXICAL-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_supertext_indexical_caching_state$ = makeSymbol("*L2R-SUPERTEXT-INDEXICAL-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_sentence_string_indexical_caching_state$ = makeSymbol("*L2R-SENTENCE-STRING-INDEXICAL-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_sentence_number_indexical_caching_state$ = makeSymbol("*L2R-SENTENCE-NUMBER-INDEXICAL-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_sentence_string_number_indexical_caching_state$ = makeSymbol("*L2R-SENTENCE-STRING-NUMBER-INDEXICAL-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_document_sentence_finder_kbq_caching_state$ = makeSymbol("*L2R-DOCUMENT-SENTENCE-FINDER-KBQ-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $html_implicit_eos_tags$ = makeSymbol("*HTML-IMPLICIT-EOS-TAGS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $html_eos_open_tags$ = makeSymbol("*HTML-EOS-OPEN-TAGS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $html_eos_close_tags$ = makeSymbol("*HTML-EOS-CLOSE-TAGS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $wikipedia_meta_strings$ = makeSymbol("*WIKIPEDIA-META-STRINGS*");

    // deflexical
    /**
     * LISTP of WORD-P vectors, whose categories define candidate noun compound
     * patterns.
     */
    @LispMethod(comment = "LISTP of WORD-P vectors, whose categories define candidate noun compound\r\npatterns.\ndeflexical\nLISTP of WORD-P vectors, whose categories define candidate noun compound\npatterns.")
    private static final SubLSymbol $l2r_noun_compound_patterns$ = makeSymbol("*L2R-NOUN-COMPOUND-PATTERNS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_noun_compound_category_pairs$ = makeSymbol("*L2R-NOUN-COMPOUND-CATEGORY-PAIRS");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $l2r_noun_compound_tagger$ = makeSymbol("*L2R-NOUN-COMPOUND-TAGGER*");





    static private final SubLString $str2$L2R__Failed_asserting____S___in__ = makeString("L2R: Failed asserting~% ~S~% in ~S:~% ~S");

    static private final SubLString $str3$L2R_ = makeString("L2R-");

    static private final SubLString $str4$cyc8_cyc_com = makeString("cyc8.cyc.com");

    private static final SubLInteger $int$7779 = makeInteger(7779);

    static private final SubLString $str6$_cyc_projects_reading_learning_da = makeString("/cyc/projects/reading-learning/data/ebmt-index.txt");

    static private final SubLString $str7$_cyc_projects_reading_learning_da = makeString("/cyc/projects/reading-learning/data/ebmt-index.log");

    static private final SubLList $list8 = list(makeSymbol("NL-SENT"), makeSymbol("CYCL-SENT"));

    private static final SubLSymbol ADD_TEXT_LEARNER_EBMT_TRAINING_EXAMPLE = makeSymbol("ADD-TEXT-LEARNER-EBMT-TRAINING-EXAMPLE");

    static private final SubLString $str10$_A_now___ = makeString("~A now...");

    static private final SubLString $$$Halting_image = makeString("Halting image");

    static private final SubLString $str13$Finished_reading__S_ = makeString("Finished reading ~S.");



    static private final SubLString $str15$The_TextLearner_can_only_read_ins = makeString("The TextLearner can only read instances of #$PropositionalConceptualWork, which ~S does not appear to be.");

    static private final SubLString $$$Reading_ = makeString("Reading ");

    static private final SubLString $str17$Couldn_t_find_any_paragraphs_reif = makeString("Couldn't find any paragraphs reified for ~S");

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

    static private final SubLList $list34 = list(new SubLObject[]{ makeSymbol("PARAGRAPH"), makeSymbol("DOCUMENT"), makeSymbol("PARAGRAPH-SOURCE-HTML"), makeSymbol("SENTENCE-VECTOR"), makeSymbol("SENTENCE-PEGS"), makeSymbol("SENTENCE-NON-HTML-TEXTS"), makeSymbol("SENTENCE-NUMBER"), makeSymbol("LINKAGE"), makeSymbol("LINKAGE-FORT"), makeSymbol("INITIAL-ASSERTION-COUNT"), makeSymbol("TOTAL-TIME"), makeSymbol("TOTAL-CPU-TIME"), makeSymbol("SENTENCE-TIME"), makeSymbol("SENTENCE-CPU-TIME"), makeSymbol("STATE") });

    static private final SubLList $list35 = list(new SubLObject[]{ makeKeyword("PARAGRAPH"), makeKeyword("DOCUMENT"), makeKeyword("PARAGRAPH-SOURCE-HTML"), makeKeyword("SENTENCE-VECTOR"), makeKeyword("SENTENCE-PEGS"), makeKeyword("SENTENCE-NON-HTML-TEXTS"), makeKeyword("SENTENCE-NUMBER"), makeKeyword("LINKAGE"), makeKeyword("LINKAGE-FORT"), makeKeyword("INITIAL-ASSERTION-COUNT"), makeKeyword("TOTAL-TIME"), makeKeyword("TOTAL-CPU-TIME"), makeKeyword("SENTENCE-TIME"), makeKeyword("SENTENCE-CPU-TIME"), makeKeyword("STATE") });

    static private final SubLList $list36 = list(new SubLObject[]{ makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH"), makeSymbol("L2R-PARAGRAPH-READER-DOCUMENT"), makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-VECTOR"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-PEGS"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NUMBER"), makeSymbol("L2R-PARAGRAPH-READER-LINKAGE"), makeSymbol("L2R-PARAGRAPH-READER-LINKAGE-FORT"), makeSymbol("L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT"), makeSymbol("L2R-PARAGRAPH-READER-TOTAL-TIME"), makeSymbol("L2R-PARAGRAPH-READER-TOTAL-CPU-TIME"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-TIME"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME"), makeSymbol("L2R-PARAGRAPH-READER-STATE") });

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



    private static final SubLList $list98 = list(makeSymbol("?SOURCE"));



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

    static private final SubLList $list120 = list(list(makeSymbol("READER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym121$THIS_TIME = makeUninternedSymbol("THIS-TIME");

    private static final SubLSymbol $sym122$THIS_CPU_TIME = makeUninternedSymbol("THIS-CPU-TIME");

    private static final SubLString $str125$__This_step_took__A___A_of_CPU_ti = makeString("~&This step took ~A (~A of CPU time)~%");

    private static final SubLSymbol L2R_READABLE_TIME_STRING = makeSymbol("L2R-READABLE-TIME-STRING");

    private static final SubLList $list127 = list(TWO_INTEGER);

    private static final SubLList $list130 = list(ZERO_INTEGER);

    static private final SubLList $list131 = list(makeString("unknown amount"));

    private static final SubLString $str134$__Total_time_for_this_sentence___ = makeString("~&Total time for this sentence: ~A (~A of CPU time)~%");

    private static final SubLString $str135$__Total_time_for_this_reader___A_ = makeString("~&Total time for this reader: ~A (~A of CPU time)~%");

    static private final SubLList $list136 = list(list(makeSymbol("STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym137$OLD_TRANSMIT_STATE = makeUninternedSymbol("OLD-TRANSMIT-STATE");

    private static final SubLList $list138 = list(list(makeSymbol("GET-TRANSMIT-STATE")));

    private static final SubLSymbol SET_TRANSMIT_STATE = makeSymbol("SET-TRANSMIT-STATE");

    private static final SubLSymbol $sym142$OLD_RECEIVE_STATE = makeUninternedSymbol("OLD-RECEIVE-STATE");

    private static final SubLList $list143 = list(list(makeSymbol("GET-RECEIVE-STATE")));

    private static final SubLSymbol SET_RECEIVE_STATE = makeSymbol("SET-RECEIVE-STATE");

    private static final SubLString $$$transmit = makeString("transmit");

    private static final SubLString $$$store = makeString("store");

    private static final SubLString $$$ReadingEvent = makeString("ReadingEvent");



    private static final SubLList $list149 = list(reader_make_constant_shell("Reading"));











    private static final SubLList $list155 = list(reader_make_constant_shell("Cyc"));

    private static final SubLSymbol $sym156$_READING = makeSymbol("?READING");



    private static final SubLList $list158 = list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("thereExists"), makeSymbol("?END"), list(reader_make_constant_shell("endingDate"), makeSymbol("?READING"), makeSymbol("?END"))));

    private static final SubLList $list159 = list(list(reader_make_constant_shell("performedBy"), makeSymbol("?READING"), reader_make_constant_shell("Cyc")));







    private static final SubLString $$$none = makeString("none");

    private static final SubLString $$$no = makeString("no");



    private static final SubLString $$$unknown_amount = makeString("unknown amount");





    private static final SubLString $str170$Couldn_t_find_linkage_for__S = makeString("Couldn't find linkage for ~S");

    private static final SubLString $str171$Couldn_t_find_linkage_FORT_for__S = makeString("Couldn't find linkage FORT for ~S");

    private static final SubLString $str172$Couldn_t_find_content_mt_for__S = makeString("Couldn't find content-mt for ~S");

    private static final SubLString $str173$Couldn_t_find_tokenization_for__S = makeString("Couldn't find tokenization for ~S");

    private static final SubLObject $$ist_Asserted = reader_make_constant_shell("ist-Asserted");



    private static final SubLSymbol $sym176$_PARSE_TREE = makeSymbol("?PARSE-TREE");

    private static final SubLList $list177 = list(list(reader_make_constant_shell("syntacticRootOfParseTree"), makeSymbol("?PARSE-TREE"), makeSymbol("?ROOT-NODE")));

    private static final SubLObject $$LinguisticObject_NoParseAvailable = reader_make_constant_shell("LinguisticObject-NoParseAvailable");



    private static final SubLString $str180$__Asserting_Cyclifier_results_for = makeString("~&Asserting Cyclifier results for ~S...~%");

    private static final SubLString $str181$__Read_sentence___S_in__A___A_of_ = makeString("~&Read sentence #~S in ~A (~A of CPU time)~%");

    private static final SubLString $str182$__After__S_sentences__assertion_c = makeString("~&After ~S sentences, assertion count increased ~S from ~S to ~S~%");

    private static final SubLSymbol CYC_FIND_OR_CREATE_NEW_PERMANENT = makeSymbol("CYC-FIND-OR-CREATE-NEW-PERMANENT");

    private static final SubLString $str185$Don_t_know_what_to_do_with_finali = makeString("Don't know what to do with finalization term~% ~S");

    private static final SubLString $str186$__Asserting_distillation_sentence = makeString("~%Asserting distillation sentence:~% ~S~%");

    private static final SubLObject $const187$TextLearnerQuery_WhatAreTheRequir = reader_make_constant_shell("TextLearnerQuery-WhatAreTheRequiredScenesOfFinalization");

    private static final SubLSymbol KBQ_FROM_QUERY_RUNNING = makeSymbol("KBQ-FROM-QUERY-RUNNING");

    private static final SubLObject $const189$TextLearnerGarbageCollectionQuery = reader_make_constant_shell("TextLearnerGarbageCollectionQuerySpecification");

    private static final SubLObject $const190$TextLearnerDisambiguationResultsD = reader_make_constant_shell("TextLearnerDisambiguationResultsDistillationQuerySpecification");



    private static final SubLList $list192 = list(reader_make_constant_shell("TheFn"), reader_make_constant_shell("LinguisticExpressionPeg"));

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



    private static final SubLString $$$Tokenization = makeString("Tokenization");

    private static final SubLList $list208 = list(reader_make_constant_shell("CycTokenization"));







    private static final SubLSymbol $sym212$_TOKENIZATION = makeSymbol("?TOKENIZATION");

    static private final SubLList $list213 = list(makeSymbol("?TOKENIZATION"));

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

    private static final SubLObject $const243$TextLearnerQuery_FindWikipediaArt = reader_make_constant_shell("TextLearnerQuery-FindWikipediaArticleToRead");

    private static final SubLSymbol FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT = makeSymbol("FIND-UNFINISHED-L2R-READING-EVENT-FOR-DOCUMENT");

    private static final SubLSymbol $sym245$STARTS_BEFORE_STARTING_OF_ = makeSymbol("STARTS-BEFORE-STARTING-OF?");

    private static final SubLString $str246$_host_ = makeString("/host/");

    private static final SubLString $str247$_scratch_ = makeString("/scratch/");

    private static final SubLString $str249$l2r_images_ = makeString("l2r-images/");

    private static final SubLString $str250$done_ = makeString("done/");

    private static final SubLString $str251$ongoing_ = makeString("ongoing/");



    private static final SubLString $$$load = makeString("load");

    private static final SubLString $str255$Saved_image_file_to__S = makeString("Saved image file to ~S");

    private static final SubLSymbol $sym256$_AIS = makeSymbol("?AIS");



    private static final SubLList $list258 = list(makeSymbol("?AIS"));

    private static final SubLList $list259 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLObject $$WorldWideWebPage_PCW = reader_make_constant_shell("WorldWideWebPage-PCW");

    private static final SubLList $list261 = list(reader_make_constant_shell("retainTerm"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("AISForFn"), makeSymbol("DOCUMENT")));



    private static final SubLString $str263$Don_t_know_how_to_read__S_ = makeString("Don't know how to read ~S.");



    private static final SubLString $str267$_S___has_already_been_downloaded_ = makeString("~S~% has already been downloaded: ~S");



    private static final SubLString $$$WebpageDownload = makeString("WebpageDownload");

    private static final SubLString $str270$_S_doesn_t_have_a___webPageURL_as = makeString("~S doesn't have a #$webPageURL assertion.");











    private static final SubLList $list276 = cons(makeSymbol("?PARAGRAPH"), makeSymbol("?N"));

    private static final SubLObject $const277$nthOccurrenceOfStructureTypeInStr = reader_make_constant_shell("nthOccurrenceOfStructureTypeInStructure");

    private static final SubLSymbol $sym278$_PARAGRAPH = makeSymbol("?PARAGRAPH");

    private static final SubLSymbol $sym279$_N = makeSymbol("?N");



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

    private static final SubLObject $const293$NthOccurrenceOfStructureTypeInStr = reader_make_constant_shell("NthOccurrenceOfStructureTypeInStructureFn");

    private static final SubLString $str294$___S___S__ = makeString("~&~S: ~S~%");

    private static final SubLString $$$SentenceLevelPeg = makeString("SentenceLevelPeg");

    private static final SubLSymbol STRING_OR_UNICODE_NAUT_P = makeSymbol("STRING-OR-UNICODE-NAUT-P");

    private static final SubLSymbol $sym298$_PEG = makeSymbol("?PEG");

    private static final SubLList $list299 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLSymbol L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE = makeSymbol("L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE");

    private static final SubLObject $const301$SentenceLevelPegCreationTemplateF = reader_make_constant_shell("SentenceLevelPegCreationTemplateForDocumentSlurper");

    private static final SubLString $str302$Failed_to_validate___SentenceLeve = makeString("Failed to validate #$SentenceLevelPegCreationTemplateForDocumentSlurper");

    private static final SubLSymbol $sym303$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-CACHING-STATE*");

    private static final SubLSymbol L2R_SENTENCE_LEVEL_PEG_EXEMPLAR = makeSymbol("L2R-SENTENCE-LEVEL-PEG-EXEMPLAR");



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

    static private final SubLList $list316 = list(reader_make_constant_shell("TheFn"), reader_make_constant_shell("LearnByReadingDocument"));

    private static final SubLString $str317$Failed_to_validate_L2R_DOCUMENT_I = makeString("Failed to validate L2R-DOCUMENT-INDEXICAL: ~S");

    private static final SubLSymbol $sym318$_L2R_DOCUMENT_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-DOCUMENT-INDEXICAL-CACHING-STATE*");

    private static final SubLSymbol L2R_SENTENCE_INDEXICAL = makeSymbol("L2R-SENTENCE-INDEXICAL");

    static private final SubLList $list320 = list(reader_make_constant_shell("TheFn"), list(reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), reader_make_constant_shell("TextualPCW"), reader_make_constant_shell("infoStructureOfCW"), reader_make_constant_shell("NLSentence")));

    private static final SubLString $str321$Failed_to_validate_L2R_SENTENCE_I = makeString("Failed to validate L2R-SENTENCE-INDEXICAL: ~S");

    private static final SubLSymbol $sym322$_L2R_SENTENCE_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-INDEXICAL-CACHING-STATE*");

    private static final SubLSymbol L2R_SUPERTEXT_INDEXICAL = makeSymbol("L2R-SUPERTEXT-INDEXICAL");

    static private final SubLList $list324 = list(reader_make_constant_shell("TheFn"), reader_make_constant_shell("GraphicalStructure"));

    private static final SubLString $str325$Failed_to_validate_L2R_SUPERTEXT_ = makeString("Failed to validate L2R-SUPERTEXT-INDEXICAL: ~S");

    private static final SubLSymbol $sym326$_L2R_SUPERTEXT_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SUPERTEXT-INDEXICAL-CACHING-STATE*");

    private static final SubLSymbol L2R_SENTENCE_STRING_INDEXICAL = makeSymbol("L2R-SENTENCE-STRING-INDEXICAL");

    static private final SubLList $list328 = list(reader_make_constant_shell("TheFn"), reader_make_constant_shell("ControlCharacterFreeString"));

    static private final SubLString $str329$Failed_to_validate_L2R_SENTENCE_S = makeString("Failed to validate L2R-SENTENCE-STRING-INDEXICAL: ~S");

    private static final SubLSymbol $sym330$_L2R_SENTENCE_STRING_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-STRING-INDEXICAL-CACHING-STATE*");

    private static final SubLSymbol L2R_SENTENCE_NUMBER_INDEXICAL = makeSymbol("L2R-SENTENCE-NUMBER-INDEXICAL");

    private static final SubLList $list332 = list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("PositiveInteger"), TWO_INTEGER);

    private static final SubLString $str333$Failed_to_validate_L2R_SENTENCE_N = makeString("Failed to validate L2R-SENTENCE-NUMBER-INDEXICAL: ~S");

    private static final SubLSymbol $sym334$_L2R_SENTENCE_NUMBER_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-NUMBER-INDEXICAL-CACHING-STATE*");

    private static final SubLSymbol L2R_SENTENCE_STRING_NUMBER_INDEXICAL = makeSymbol("L2R-SENTENCE-STRING-NUMBER-INDEXICAL");

    private static final SubLList $list336 = list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("PositiveInteger"), ONE_INTEGER);

    private static final SubLString $str337$Failed_to_validate_L2R_SENTENCE_S = makeString("Failed to validate L2R-SENTENCE-STRING-NUMBER-INDEXICAL: ~S");

    private static final SubLSymbol $sym338$_L2R_SENTENCE_STRING_NUMBER_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-STRING-NUMBER-INDEXICAL-CACHING-STATE*");

    private static final SubLList $list339 = list(makeSymbol("?HIGHER"), makeSymbol("?LOWER"));



    private static final SubLSymbol $sym341$_HIGHER = makeSymbol("?HIGHER");

    private static final SubLSymbol $sym342$_LOWER = makeSymbol("?LOWER");

    private static final SubLList $list343 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLSymbol ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");

    private static final SubLSymbol HTML_STRING_WORDIFY = makeSymbol("HTML-STRING-WORDIFY");

    private static final SubLString $str347$Couldn_t_make_UTF8_string_from__S = makeString("Couldn't make UTF8 string from ~S");

    private static final SubLSymbol NON_ASCII_CHAR_P = makeSymbol("NON-ASCII-CHAR-P");

    private static final SubLList $list353 = list(makeSymbol("HTML"), makeSymbol("THIS-HTML-OFFSET"), makeSymbol("THIS-NON-HTML-OFFSET"));





    private static final SubLString $str358$_a = makeString("<a");

    private static final SubLString $$$href = makeString("href");

    private static final SubLString $str360$__a = makeString("</a");

    private static final SubLString $str361$Bad_offset___S_at_offset__S_of__S = makeString("Bad offset: ~S at offset ~S of ~S");

    private static final SubLSymbol L2R_DOCUMENT_SENTENCE_FINDER_KBQ = makeSymbol("L2R-DOCUMENT-SENTENCE-FINDER-KBQ");

    private static final SubLObject $const364$ReifySentencePegQuery_FindSentenc = reader_make_constant_shell("ReifySentencePegQuery-FindSentences");

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

    public static final SubLObject default_learning_reader_cyclist_alt() {
        return $$Cyc;
    }

    public static SubLObject default_learning_reader_cyclist() {
        return learning_reader.$$Cyc;
    }

    public static final SubLObject l2r_assert_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BaseKB;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(com.cyc.cycjava.cycl.learning_reader.default_learning_reader_cyclist(), thread);
                    thread.resetMultipleValues();
                    {
                        SubLObject successP = ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED);
                        SubLObject problem = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == successP) {
                            Errors.warn($str_alt2$L2R__Failed_asserting____S___in__, sentence, mt, problem);
                        }
                    }
                } finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                }
            }
            return sentence;
        }
    }

    public static SubLObject l2r_assert(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = learning_reader.$$BaseKB;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(learning_reader.default_learning_reader_cyclist(), thread);
            thread.resetMultipleValues();
            final SubLObject successP = ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED);
            final SubLObject problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == successP) {
                Errors.warn(learning_reader.$str2$L2R__Failed_asserting____S___in__, sentence, mt, problem);
            }
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return sentence;
    }

    public static final SubLObject l2r_unassert_assertion_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(com.cyc.cycjava.cycl.learning_reader.default_learning_reader_cyclist(), thread);
                    ke.ke_unassert_assertion(assertion);
                } finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject l2r_unassert_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(learning_reader.default_learning_reader_cyclist(), thread);
            ke.ke_unassert_assertion(assertion);
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject l2r_create_alt(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_constant = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(com.cyc.cycjava.cycl.learning_reader.default_learning_reader_cyclist(), thread);
                        new_constant = ke.ke_create_now(cconcatenate($str_alt3$L2R_, name), UNPROVIDED);
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_constant;
            }
        }
    }

    public static SubLObject l2r_create(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_constant = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(learning_reader.default_learning_reader_cyclist(), thread);
            new_constant = ke.ke_create_now(cconcatenate(learning_reader.$str3$L2R_, name), UNPROVIDED);
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return new_constant;
    }

    public static final SubLObject add_text_learner_ebmt_training_example_alt(SubLObject argument, SubLObject assertion) {
        {
            SubLObject datum = assertions_high.gaf_args(assertion);
            SubLObject current = datum;
            SubLObject nl_sent = NIL;
            SubLObject cycl_sent = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            nl_sent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt8);
            cycl_sent = current.first();
            current = current.rest();
            if (NIL == current) {
                com.cyc.cycjava.cycl.learning_reader.create_and_add_l2r_ebmt_template(nl_sent, cycl_sent);
            } else {
                cdestructuring_bind_error(datum, $list_alt8);
            }
        }
        return NIL;
    }

    public static SubLObject add_text_learner_ebmt_training_example(final SubLObject argument, final SubLObject assertion) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args(assertion);
        SubLObject nl_sent = NIL;
        SubLObject cycl_sent = NIL;
        destructuring_bind_must_consp(current, datum, learning_reader.$list8);
        nl_sent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, learning_reader.$list8);
        cycl_sent = current.first();
        current = current.rest();
        if (NIL == current) {
            learning_reader.create_and_add_l2r_ebmt_template(nl_sent, cycl_sent);
        } else {
            cdestructuring_bind_error(datum, learning_reader.$list8);
        }
        return NIL;
    }

    public static final SubLObject create_and_add_l2r_ebmt_template_alt(SubLObject nl_sent, SubLObject cycl_sent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
                SubLObject _prev_bind_1 = lucene_index.$ebmt_index_port$.currentBinding(thread);
                SubLObject _prev_bind_2 = lucene_index.$ebmt_index_content$.currentBinding(thread);
                SubLObject _prev_bind_3 = lucene_index.$ebmt_index_log$.currentBinding(thread);
                try {
                    lucene_index.$ebmt_index_host$.bind($l2r_ebmt_index_host$.getGlobalValue(), thread);
                    lucene_index.$ebmt_index_port$.bind($l2r_ebmt_index_port$.getGlobalValue(), thread);
                    lucene_index.$ebmt_index_content$.bind($l2r_ebmt_index_content$.getGlobalValue(), thread);
                    lucene_index.$ebmt_index_log$.bind($l2r_ebmt_index_log$.getGlobalValue(), thread);
                    ebmt_template_parser.ebmt_create_and_add_templates(nl_sent, cycl_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    lucene_index.$ebmt_index_log$.rebind(_prev_bind_3, thread);
                    lucene_index.$ebmt_index_content$.rebind(_prev_bind_2, thread);
                    lucene_index.$ebmt_index_port$.rebind(_prev_bind_1, thread);
                    lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
                }
            }
            return nl_sent;
        }
    }

    public static SubLObject create_and_add_l2r_ebmt_template(final SubLObject nl_sent, final SubLObject cycl_sent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lucene_index.$ebmt_index_port$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lucene_index.$ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_4 = lucene_index.$ebmt_index_log$.currentBinding(thread);
        try {
            lucene_index.$ebmt_index_host$.bind(learning_reader.$l2r_ebmt_index_host$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_port$.bind(learning_reader.$l2r_ebmt_index_port$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_content$.bind(learning_reader.$l2r_ebmt_index_content$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_log$.bind(learning_reader.$l2r_ebmt_index_log$.getGlobalValue(), thread);
            ebmt_template_parser.ebmt_create_and_add_templates(nl_sent, cycl_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            lucene_index.$ebmt_index_log$.rebind(_prev_bind_4, thread);
            lucene_index.$ebmt_index_content$.rebind(_prev_bind_3, thread);
            lucene_index.$ebmt_index_port$.rebind(_prev_bind_2, thread);
            lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        return nl_sent;
    }

    public static final SubLObject l2r_ebmt_parse_alt(SubLObject nl_sent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parses = NIL;
                SubLObject justifications = NIL;
                SubLObject weights = NIL;
                {
                    SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
                    SubLObject _prev_bind_1 = lucene_index.$ebmt_index_port$.currentBinding(thread);
                    SubLObject _prev_bind_2 = lucene_index.$ebmt_index_content$.currentBinding(thread);
                    SubLObject _prev_bind_3 = lucene_index.$ebmt_index_log$.currentBinding(thread);
                    try {
                        lucene_index.$ebmt_index_host$.bind($l2r_ebmt_index_host$.getGlobalValue(), thread);
                        lucene_index.$ebmt_index_port$.bind($l2r_ebmt_index_port$.getGlobalValue(), thread);
                        lucene_index.$ebmt_index_content$.bind($l2r_ebmt_index_content$.getGlobalValue(), thread);
                        lucene_index.$ebmt_index_log$.bind($l2r_ebmt_index_log$.getGlobalValue(), thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject parses_1 = ebmt_template_parser.ebmt_parse(nl_sent, UNPROVIDED, UNPROVIDED);
                            SubLObject justifications_2 = thread.secondMultipleValue();
                            SubLObject weights_3 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            parses = parses_1;
                            justifications = justifications_2;
                            weights = weights_3;
                        }
                    } finally {
                        lucene_index.$ebmt_index_log$.rebind(_prev_bind_3, thread);
                        lucene_index.$ebmt_index_content$.rebind(_prev_bind_2, thread);
                        lucene_index.$ebmt_index_port$.rebind(_prev_bind_1, thread);
                        lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(parses, justifications, weights);
            }
        }
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
            lucene_index.$ebmt_index_host$.bind(learning_reader.$l2r_ebmt_index_host$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_port$.bind(learning_reader.$l2r_ebmt_index_port$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_content$.bind(learning_reader.$l2r_ebmt_index_content$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_log$.bind(learning_reader.$l2r_ebmt_index_log$.getGlobalValue(), thread);
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

    /**
     * Function to be run by dedicated L2R image.
     */
    @LispMethod(comment = "Function to be run by dedicated L2R image.")
    public static final SubLObject l2r_reader_image_run_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject document_reader = com.cyc.cycjava.cycl.learning_reader.l2r_reader_image_find_or_create_document_reader();
                com.cyc.cycjava.cycl.learning_reader.set_l2r_reader_image_document_reader(document_reader);
                {
                    SubLObject _prev_bind_0 = $l2r_transmit_operationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $l2r_reader_unstable_inside_stepsP$.currentBinding(thread);
                    try {
                        $l2r_transmit_operationsP$.bind(T, thread);
                        $l2r_reader_unstable_inside_stepsP$.bind(NIL, thread);
                        com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_read_document(document_reader);
                    } finally {
                        $l2r_reader_unstable_inside_stepsP$.rebind(_prev_bind_1, thread);
                        $l2r_transmit_operationsP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            format(T, $str_alt10$_A_now___, $$$Halting_image);
            operation_communication.halt_cyc_image(UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Function to be run by dedicated L2R image.
     */
    @LispMethod(comment = "Function to be run by dedicated L2R image.")
    public static SubLObject l2r_reader_image_run() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject document_reader = learning_reader.l2r_reader_image_find_or_create_document_reader();
        learning_reader.set_l2r_reader_image_document_reader(document_reader);
        final SubLObject _prev_bind_0 = learning_reader.$l2r_transmit_operationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = learning_reader.$l2r_reader_unstable_inside_stepsP$.currentBinding(thread);
        try {
            learning_reader.$l2r_transmit_operationsP$.bind(T, thread);
            learning_reader.$l2r_reader_unstable_inside_stepsP$.bind(NIL, thread);
            learning_reader.l2r_document_reader_read_document(document_reader);
        } finally {
            learning_reader.$l2r_reader_unstable_inside_stepsP$.rebind(_prev_bind_2, thread);
            learning_reader.$l2r_transmit_operationsP$.rebind(_prev_bind_0, thread);
        }
        format(T, learning_reader.$str10$_A_now___, learning_reader.$$$Halting_image);
        operation_communication.halt_cyc_image(UNPROVIDED);
        return NIL;
    }

    /**
     * Function to be run by dedicated L2R image.
     */
    @LispMethod(comment = "Function to be run by dedicated L2R image.")
    public static final SubLObject l2r_reader_image_read_document_alt(SubLObject v_document) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_document, CYCL_DENOTATIONAL_TERM_P);
            {
                SubLObject _prev_bind_0 = $l2r_transmit_operationsP$.currentBinding(thread);
                try {
                    $l2r_transmit_operationsP$.bind(T, thread);
                    {
                        SubLObject document_reader = com.cyc.cycjava.cycl.learning_reader.l2r_new_reader_for_document(v_document);
                        com.cyc.cycjava.cycl.learning_reader.set_l2r_reader_image_document_reader(document_reader);
                        com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_read_document(document_reader);
                        com.cyc.cycjava.cycl.learning_reader.set_l2r_reader_image_document_reader(NIL);
                    }
                } finally {
                    $l2r_transmit_operationsP$.rebind(_prev_bind_0, thread);
                }
            }
            format(T, $str_alt13$Finished_reading__S_, v_document);
            return NIL;
        }
    }

    /**
     * Function to be run by dedicated L2R image.
     */
    @LispMethod(comment = "Function to be run by dedicated L2R image.")
    public static SubLObject l2r_reader_image_read_document(final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "! cycl_grammar.cycl_denotational_term_p(v_document) " + ("cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) ") + v_document;
        final SubLObject _prev_bind_0 = learning_reader.$l2r_transmit_operationsP$.currentBinding(thread);
        try {
            learning_reader.$l2r_transmit_operationsP$.bind(T, thread);
            final SubLObject document_reader = learning_reader.l2r_new_reader_for_document(v_document);
            learning_reader.set_l2r_reader_image_document_reader(document_reader);
            learning_reader.l2r_document_reader_read_document(document_reader);
            learning_reader.set_l2r_reader_image_document_reader(NIL);
        } finally {
            learning_reader.$l2r_transmit_operationsP$.rebind(_prev_bind_0, thread);
        }
        format(T, learning_reader.$str13$Finished_reading__S_, v_document);
        return NIL;
    }

    /**
     * Read DOCUMENT, asserting information about it into the KB.
     */
    @LispMethod(comment = "Read DOCUMENT, asserting information about it into the KB.")
    public static final SubLObject l2r_read_document_alt(SubLObject v_document, SubLObject reading_event) {
        if (reading_event == UNPROVIDED) {
            reading_event = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_document, CYCL_DENOTATIONAL_TERM_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == isa.isa_in_any_mtP(v_document, $$PropositionalConceptualWork)) {
                    Errors.error($str_alt15$The_TextLearner_can_only_read_ins, v_document);
                }
            }
            {
                SubLObject message = cconcatenate($str_alt16$Reading_, format_nil.format_nil_s_no_copy(v_document));
                SubLObject paragraphs = com.cyc.cycjava.cycl.learning_reader.l2r_find_or_create_document_paragraphs(v_document, UNPROVIDED);
                if (NIL == list_utilities.non_empty_list_p(paragraphs)) {
                    Errors.warn($str_alt17$Couldn_t_find_any_paragraphs_reif, v_document);
                }
                if (NIL != cycl_denotational_term_p(reading_event)) {
                    com.cyc.cycjava.cycl.learning_reader.note_l2r_reading_event_ongoing(reading_event);
                }
                {
                    SubLObject list_var = paragraphs;
                    $progress_note$.setDynamicValue(message, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(length(list_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject paragraph = NIL;
                                for (paragraph = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , paragraph = csome_list_var.first()) {
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    operation_queues.clear_local_operation_storage_queue();
                                    com.cyc.cycjava.cycl.learning_reader.l2r_read_paragraph(paragraph, v_document, UNPROVIDED);
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
                }
                if (NIL != cycl_denotational_term_p(reading_event)) {
                    com.cyc.cycjava.cycl.learning_reader.note_l2r_reading_event_done(reading_event);
                }
            }
            return v_document;
        }
    }

    /**
     * Read DOCUMENT, asserting information about it into the KB.
     */
    @LispMethod(comment = "Read DOCUMENT, asserting information about it into the KB.")
    public static SubLObject l2r_read_document(final SubLObject v_document, SubLObject reading_event) {
        if (reading_event == UNPROVIDED) {
            reading_event = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "! cycl_grammar.cycl_denotational_term_p(v_document) " + ("cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) ") + v_document;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == isa.isa_in_any_mtP(v_document, learning_reader.$$PropositionalConceptualWork))) {
            Errors.error(learning_reader.$str15$The_TextLearner_can_only_read_ins, v_document);
        }
        final SubLObject message = cconcatenate(learning_reader.$$$Reading_, format_nil.format_nil_s_no_copy(v_document));
        final SubLObject paragraphs = learning_reader.l2r_find_or_create_document_paragraphs(v_document, UNPROVIDED);
        if (NIL == list_utilities.non_empty_list_p(paragraphs)) {
            Errors.warn(learning_reader.$str17$Couldn_t_find_any_paragraphs_reif, v_document);
        }
        if (NIL != cycl_grammar.cycl_denotational_term_p(reading_event)) {
            learning_reader.note_l2r_reading_event_ongoing(reading_event);
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
            $progress_note$.bind(NIL != message ? message : learning_reader.$$$cdolist, thread);
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
                    learning_reader.l2r_read_paragraph(paragraph, v_document, UNPROVIDED);
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
            learning_reader.note_l2r_reading_event_done(reading_event);
        }
        return v_document;
    }

    public static final SubLObject l2r_computing_cpu_time_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt18);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject start = $sym19$START;
                SubLObject end = $sym20$END;
                return listS(CLET, list(bq_cons(start, $list_alt22)), append(body, list(list(CLET, list(list(end, listS(FWHEN, start, $list_alt22))), list(CSETQ, var, list(FWHEN, end, list($sym25$_, end, start)))))));
            }
        }
    }

    public static SubLObject l2r_computing_cpu_time(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, learning_reader.$list19);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject start = learning_reader.$sym20$START;
        final SubLObject end = learning_reader.$sym21$END;
        return listS(CLET, list(bq_cons(start, learning_reader.$list23)), append(body, list(list(CLET, list(list(end, listS(FWHEN, start, learning_reader.$list23))), list(CSETQ, var, list(FWHEN, end, list(learning_reader.$sym26$_, end, start)))))));
    }

    public static final SubLObject l2r_image_elapsed_cpu_time_alt() {
        return pph_diagnostics.image_elapsed_cpu_time();
    }

    public static SubLObject l2r_image_elapsed_cpu_time() {
        return NIL;
    }

    public static final SubLObject l2r_read_paragraph_alt(SubLObject paragraph, SubLObject v_document, SubLObject reading_event) {
        if (reading_event == UNPROVIDED) {
            reading_event = NIL;
        }
        if (NIL == operation_queues.local_operation_storage_queue_empty()) {
            Errors.warn($str_alt28$Please_clear_the_local_transcript);
            return NIL;
        }
        if (NIL == operation_queues.local_queue_empty()) {
            Errors.warn($str_alt29$The_Text_Learner_can_t_be_run_whi);
            return NIL;
        }
        {
            SubLObject communication_mode = operation_communication.communication_mode();
            try {
                com.cyc.cycjava.cycl.learning_reader.l2r_read_paragraph_internal(paragraph, v_document, reading_event, UNPROVIDED);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        operation_communication.set_communication_mode(communication_mode);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return $DONE;
    }

    public static SubLObject l2r_read_paragraph(final SubLObject paragraph, final SubLObject v_document, SubLObject reading_event) {
        if (reading_event == UNPROVIDED) {
            reading_event = NIL;
        }
        if (NIL == operation_queues.local_operation_storage_queue_empty()) {
            Errors.warn(learning_reader.$str29$Please_clear_the_local_transcript);
            return NIL;
        }
        if (NIL == operation_queues.local_queue_empty()) {
            Errors.warn(learning_reader.$str30$The_Text_Learner_can_t_be_run_whi);
            return NIL;
        }
        final SubLObject communication_mode = operation_communication.communication_mode();
        try {
            learning_reader.l2r_read_paragraph_internal(paragraph, v_document, reading_event, UNPROVIDED);
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

    public static final SubLObject l2r_paragraph_reader_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.learning_reader.print_l2r_paragraph_reader(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject l2r_paragraph_reader_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        learning_reader.print_l2r_paragraph_reader(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject l2r_paragraph_reader_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.learning_reader.$l2r_paragraph_reader_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject l2r_paragraph_reader_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.learning_reader.$l2r_paragraph_reader_native.class ? T : NIL;
    }

    public static final SubLObject l2r_paragraph_reader_paragraph_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField2();
    }

    public static SubLObject l2r_paragraph_reader_paragraph(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject l2r_paragraph_reader_document_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField3();
    }

    public static SubLObject l2r_paragraph_reader_document(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject l2r_paragraph_reader_paragraph_source_html_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField4();
    }

    public static SubLObject l2r_paragraph_reader_paragraph_source_html(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject l2r_paragraph_reader_sentence_vector_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField5();
    }

    public static SubLObject l2r_paragraph_reader_sentence_vector(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject l2r_paragraph_reader_sentence_pegs_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField6();
    }

    public static SubLObject l2r_paragraph_reader_sentence_pegs(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject l2r_paragraph_reader_sentence_non_html_texts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField7();
    }

    public static SubLObject l2r_paragraph_reader_sentence_non_html_texts(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject l2r_paragraph_reader_sentence_number_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField8();
    }

    public static SubLObject l2r_paragraph_reader_sentence_number(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject l2r_paragraph_reader_linkage_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField9();
    }

    public static SubLObject l2r_paragraph_reader_linkage(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject l2r_paragraph_reader_linkage_fort_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField10();
    }

    public static SubLObject l2r_paragraph_reader_linkage_fort(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject l2r_paragraph_reader_initial_assertion_count_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField11();
    }

    public static SubLObject l2r_paragraph_reader_initial_assertion_count(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject l2r_paragraph_reader_total_time_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField12();
    }

    public static SubLObject l2r_paragraph_reader_total_time(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject l2r_paragraph_reader_total_cpu_time_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField13();
    }

    public static SubLObject l2r_paragraph_reader_total_cpu_time(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject l2r_paragraph_reader_sentence_time_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField14();
    }

    public static SubLObject l2r_paragraph_reader_sentence_time(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject l2r_paragraph_reader_sentence_cpu_time_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField15();
    }

    public static SubLObject l2r_paragraph_reader_sentence_cpu_time(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField15();
    }

    public static final SubLObject l2r_paragraph_reader_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.getField16();
    }

    public static SubLObject l2r_paragraph_reader_state(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.getField16();
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_paragraph_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_paragraph(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_document_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_document(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_paragraph_source_html_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_paragraph_source_html(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_sentence_vector_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_vector(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_sentence_pegs_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_pegs(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_sentence_non_html_texts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_non_html_texts(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_sentence_number_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_linkage_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_linkage(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_linkage_fort_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_linkage_fort(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_initial_assertion_count_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_initial_assertion_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_total_time_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_total_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_total_cpu_time_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_total_cpu_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_sentence_time_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_sentence_cpu_time_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_cpu_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_l2r_paragraph_reader_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_PARAGRAPH_READER_P);
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_paragraph_reader_p(v_object) : "! learning_reader.l2r_paragraph_reader_p(v_object) " + "learning_reader.l2r_paragraph_reader_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static final SubLObject make_l2r_paragraph_reader_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.learning_reader.$l2r_paragraph_reader_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PARAGRAPH)) {
                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_paragraph(v_new, current_value);
                    } else {
                        if (pcase_var.eql($DOCUMENT)) {
                            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_document(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PARAGRAPH_SOURCE_HTML)) {
                                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_paragraph_source_html(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SENTENCE_VECTOR)) {
                                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_vector(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($SENTENCE_PEGS)) {
                                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_pegs(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($SENTENCE_NON_HTML_TEXTS)) {
                                            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_non_html_texts(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($SENTENCE_NUMBER)) {
                                                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_number(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($LINKAGE)) {
                                                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_linkage(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($LINKAGE_FORT)) {
                                                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_linkage_fort(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($INITIAL_ASSERTION_COUNT)) {
                                                            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_initial_assertion_count(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($TOTAL_TIME)) {
                                                                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_time(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($TOTAL_CPU_TIME)) {
                                                                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($SENTENCE_TIME)) {
                                                                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_time(v_new, current_value);
                                                                    } else {
                                                                        if (pcase_var.eql($SENTENCE_CPU_TIME)) {
                                                                            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(v_new, current_value);
                                                                        } else {
                                                                            if (pcase_var.eql($STATE)) {
                                                                                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_state(v_new, current_value);
                                                                            } else {
                                                                                Errors.error($str_alt84$Invalid_slot__S_for_construction_, current_arg);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
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

    public static SubLObject make_l2r_paragraph_reader(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.learning_reader.$l2r_paragraph_reader_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PARAGRAPH)) {
                learning_reader._csetf_l2r_paragraph_reader_paragraph(v_new, current_value);
            } else
                if (pcase_var.eql($DOCUMENT)) {
                    learning_reader._csetf_l2r_paragraph_reader_document(v_new, current_value);
                } else
                    if (pcase_var.eql(learning_reader.$PARAGRAPH_SOURCE_HTML)) {
                        learning_reader._csetf_l2r_paragraph_reader_paragraph_source_html(v_new, current_value);
                    } else
                        if (pcase_var.eql($SENTENCE_VECTOR)) {
                            learning_reader._csetf_l2r_paragraph_reader_sentence_vector(v_new, current_value);
                        } else
                            if (pcase_var.eql($SENTENCE_PEGS)) {
                                learning_reader._csetf_l2r_paragraph_reader_sentence_pegs(v_new, current_value);
                            } else
                                if (pcase_var.eql(learning_reader.$SENTENCE_NON_HTML_TEXTS)) {
                                    learning_reader._csetf_l2r_paragraph_reader_sentence_non_html_texts(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SENTENCE_NUMBER)) {
                                        learning_reader._csetf_l2r_paragraph_reader_sentence_number(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($LINKAGE)) {
                                            learning_reader._csetf_l2r_paragraph_reader_linkage(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($LINKAGE_FORT)) {
                                                learning_reader._csetf_l2r_paragraph_reader_linkage_fort(v_new, current_value);
                                            } else
                                                if (pcase_var.eql(learning_reader.$INITIAL_ASSERTION_COUNT)) {
                                                    learning_reader._csetf_l2r_paragraph_reader_initial_assertion_count(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($TOTAL_TIME)) {
                                                        learning_reader._csetf_l2r_paragraph_reader_total_time(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql(learning_reader.$TOTAL_CPU_TIME)) {
                                                            learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($SENTENCE_TIME)) {
                                                                learning_reader._csetf_l2r_paragraph_reader_sentence_time(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql(learning_reader.$SENTENCE_CPU_TIME)) {
                                                                    learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($STATE)) {
                                                                        learning_reader._csetf_l2r_paragraph_reader_state(v_new, current_value);
                                                                    } else {
                                                                        Errors.error(learning_reader.$str86$Invalid_slot__S_for_construction_, current_arg);
                                                                    }














        }
        return v_new;
    }

    public static SubLObject visit_defstruct_l2r_paragraph_reader(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, learning_reader.MAKE_L2R_PARAGRAPH_READER, FIFTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PARAGRAPH, learning_reader.l2r_paragraph_reader_paragraph(obj));
        funcall(visitor_fn, obj, $SLOT, $DOCUMENT, learning_reader.l2r_paragraph_reader_document(obj));
        funcall(visitor_fn, obj, $SLOT, learning_reader.$PARAGRAPH_SOURCE_HTML, learning_reader.l2r_paragraph_reader_paragraph_source_html(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_VECTOR, learning_reader.l2r_paragraph_reader_sentence_vector(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_PEGS, learning_reader.l2r_paragraph_reader_sentence_pegs(obj));
        funcall(visitor_fn, obj, $SLOT, learning_reader.$SENTENCE_NON_HTML_TEXTS, learning_reader.l2r_paragraph_reader_sentence_non_html_texts(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_NUMBER, learning_reader.l2r_paragraph_reader_sentence_number(obj));
        funcall(visitor_fn, obj, $SLOT, $LINKAGE, learning_reader.l2r_paragraph_reader_linkage(obj));
        funcall(visitor_fn, obj, $SLOT, $LINKAGE_FORT, learning_reader.l2r_paragraph_reader_linkage_fort(obj));
        funcall(visitor_fn, obj, $SLOT, learning_reader.$INITIAL_ASSERTION_COUNT, learning_reader.l2r_paragraph_reader_initial_assertion_count(obj));
        funcall(visitor_fn, obj, $SLOT, $TOTAL_TIME, learning_reader.l2r_paragraph_reader_total_time(obj));
        funcall(visitor_fn, obj, $SLOT, learning_reader.$TOTAL_CPU_TIME, learning_reader.l2r_paragraph_reader_total_cpu_time(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_TIME, learning_reader.l2r_paragraph_reader_sentence_time(obj));
        funcall(visitor_fn, obj, $SLOT, learning_reader.$SENTENCE_CPU_TIME, learning_reader.l2r_paragraph_reader_sentence_cpu_time(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, learning_reader.l2r_paragraph_reader_state(obj));
        funcall(visitor_fn, obj, $END, learning_reader.MAKE_L2R_PARAGRAPH_READER, FIFTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_l2r_paragraph_reader_method(final SubLObject obj, final SubLObject visitor_fn) {
        return learning_reader.visit_defstruct_l2r_paragraph_reader(obj, visitor_fn);
    }

    public static final SubLObject print_l2r_paragraph_reader_alt(SubLObject reader, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt85$_L2R_PARAGRAPH_READER__S__S_, com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_paragraph(reader), com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_state(reader));
        return NIL;
    }

    public static SubLObject print_l2r_paragraph_reader(final SubLObject reader, final SubLObject stream, final SubLObject depth) {
        format(stream, learning_reader.$str92$_L2R_PARAGRAPH_READER__S__S_, learning_reader.l2r_paragraph_reader_paragraph(reader), learning_reader.l2r_paragraph_reader_state(reader));
        return NIL;
    }

    public static final SubLObject new_l2r_paragraph_reader_alt(SubLObject paragraph, SubLObject v_document) {
        {
            SubLObject reader = com.cyc.cycjava.cycl.learning_reader.make_l2r_paragraph_reader(UNPROVIDED);
            SubLObject source_html = com.cyc.cycjava.cycl.learning_reader.l2r_get_source_html(paragraph);
            if (!source_html.isString()) {
                Errors.warn($str_alt86$Couldn_t_find_source_HTML_for__S, paragraph);
            }
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_paragraph(reader, paragraph);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_document(reader, v_document);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_paragraph_source_html(reader, source_html);
            if (source_html.isString()) {
                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_vector(reader, com.cyc.cycjava.cycl.learning_reader.sentencify_l2r_paragraph(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_paragraph_source_html(reader)));
            }
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_pegs(reader, NIL);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_non_html_texts(reader, NIL);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_number(reader, ZERO_INTEGER);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_initial_assertion_count(reader, assertion_handles.assertion_count());
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_time(reader, ZERO_INTEGER);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, ZERO_INTEGER);
            com.cyc.cycjava.cycl.learning_reader.reset_l2r_paragraph_reader_sentence_times(reader);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_state(reader, source_html.isString() ? ((SubLObject) ($INITIALIZED)) : $EXHAUSTED);
            return reader;
        }
    }

    public static SubLObject new_l2r_paragraph_reader(final SubLObject paragraph, final SubLObject v_document) {
        final SubLObject reader = learning_reader.make_l2r_paragraph_reader(UNPROVIDED);
        final SubLObject source_html = learning_reader.l2r_get_source_html(paragraph);
        if (!source_html.isString()) {
            Errors.warn(learning_reader.$str93$Couldn_t_find_source_HTML_for__S, paragraph);
        }
        learning_reader._csetf_l2r_paragraph_reader_paragraph(reader, paragraph);
        learning_reader._csetf_l2r_paragraph_reader_document(reader, v_document);
        learning_reader._csetf_l2r_paragraph_reader_paragraph_source_html(reader, source_html);
        if (source_html.isString()) {
            learning_reader._csetf_l2r_paragraph_reader_sentence_vector(reader, learning_reader.sentencify_l2r_paragraph(learning_reader.l2r_paragraph_reader_paragraph_source_html(reader)));
        }
        learning_reader._csetf_l2r_paragraph_reader_sentence_pegs(reader, NIL);
        learning_reader._csetf_l2r_paragraph_reader_sentence_non_html_texts(reader, NIL);
        learning_reader._csetf_l2r_paragraph_reader_sentence_number(reader, ZERO_INTEGER);
        learning_reader._csetf_l2r_paragraph_reader_initial_assertion_count(reader, assertion_handles.assertion_count());
        learning_reader._csetf_l2r_paragraph_reader_total_time(reader, ZERO_INTEGER);
        learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, ZERO_INTEGER);
        learning_reader.reset_l2r_paragraph_reader_sentence_times(reader);
        learning_reader._csetf_l2r_paragraph_reader_state(reader, source_html.isString() ? $INITIALIZED : $EXHAUSTED);
        return reader;
    }

    public static final SubLObject l2r_get_source_html_alt(SubLObject structure) {
        return backward.removal_ask_variable($sym89$_SOURCE, listS($$asHtmlSourceString, structure, $list_alt91), $$EverythingPSC, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject l2r_get_source_html(final SubLObject structure) {
        return backward.removal_ask_variable(learning_reader.$sym96$_SOURCE, listS(learning_reader.$$asHtmlSourceString, structure, learning_reader.$list98), learning_reader.$$EverythingPSC, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject l2r_assert_source_html_alt(SubLObject structure, SubLObject source_html, SubLObject mt, SubLObject proprietaryP) {
        if (proprietaryP == UNPROVIDED) {
            proprietaryP = T;
        }
        {
            SubLObject proprietary_pred = constants_high.find_constant($str_alt93$asHtmlSourceString_ProprietaryVer);
            SubLObject pred = ((NIL != proprietaryP) && (NIL != valid_constantP(proprietary_pred, UNPROVIDED))) ? ((SubLObject) (proprietary_pred)) : $$asHtmlSourceString;
            return com.cyc.cycjava.cycl.learning_reader.l2r_assert(list(pred, structure, source_html), mt);
        }
    }

    public static SubLObject l2r_assert_source_html(final SubLObject structure, final SubLObject source_html, final SubLObject mt, SubLObject proprietaryP) {
        if (proprietaryP == UNPROVIDED) {
            proprietaryP = T;
        }
        final SubLObject proprietary_pred = constants_high.find_constant(learning_reader.$str100$asHtmlSourceString_ProprietaryVer);
        final SubLObject pred = ((NIL != proprietaryP) && (NIL != valid_constantP(proprietary_pred, UNPROVIDED))) ? proprietary_pred : learning_reader.$$asHtmlSourceString;
        return learning_reader.l2r_assert(list(pred, structure, source_html), mt);
    }

    public static final SubLObject l2r_paragraph_reader_next_in_separate_thread_alt(SubLObject reader) {
        return process_utilities.make_cyc_server_process_with_args($$$L2R_Paragraph_Reader, L2R_PARAGRAPH_READER_NEXT, list(reader));
    }

    public static SubLObject l2r_paragraph_reader_next_in_separate_thread(final SubLObject reader) {
        return process_utilities.make_cyc_server_process_with_args(learning_reader.$$$L2R_Paragraph_Reader, learning_reader.L2R_PARAGRAPH_READER_NEXT, list(reader));
    }

    public static final SubLObject l2r_paragraph_reader_next_alt(SubLObject reader) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state = com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_state(reader);
                SubLObject action = com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_next_action(reader);
                format(T, $str_alt96$___A__A_Performing_L2R_reader_act, new SubLObject[]{ numeric_date_utilities.datestring(UNPROVIDED), numeric_date_utilities.secondstring(UNPROVIDED), action });
                force_output(T);
                if (NIL != $l2r_reader_unstable_inside_stepsP$.getDynamicValue(thread)) {
                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_state(reader, $UNSTABLE);
                }
                inference_metrics.clear_forward_inference_metrics();
                {
                    SubLObject pcase_var = action;
                    if (pcase_var.eql($FIND_OR_CREATE_PEGS_FOR_SENTENCE)) {
                        com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_find_or_create_pegs_for_sentence(reader);
                    } else {
                        if (pcase_var.eql($ASSERT_LINKAGE)) {
                            com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_find_or_assert_linkage(reader);
                        } else {
                            if (pcase_var.eql($ASSERT_PARSE_TREE_FOR_LINKAGE)) {
                                com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_maybe_assert_parse_tree_for_linkage(reader);
                            } else {
                                if (pcase_var.eql($ADD_PARSING_RESULTS)) {
                                    com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_maybe_add_parsing_results(reader);
                                } else {
                                    if (pcase_var.eql($FINALIZE_SENTENCE)) {
                                        com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_finalize_sentence(reader);
                                    } else {
                                        if (pcase_var.eql($COLLECT_GARBAGE)) {
                                            com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_collect_garbage(reader);
                                        } else {
                                            {
                                                SubLObject pcase_var_4 = state;
                                                if (pcase_var_4.eql($EXHAUSTED)) {
                                                    com.cyc.cycjava.cycl.learning_reader.destroy_l2r_paragraph_reader(reader);
                                                    return $EXHAUSTED;
                                                } else {
                                                    if (pcase_var_4.eql($UNSTABLE)) {
                                                        Errors.warn($str_alt104$L2R_reader_was_unable_to_complete);
                                                        com.cyc.cycjava.cycl.learning_reader.destroy_l2r_paragraph_reader(reader);
                                                        return $ABORTED;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            format(T, $str_alt106$__Next_L2R_reader_action___S__, com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_next_action(reader));
            force_output(T);
            return com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_state(reader);
        }
    }

    public static SubLObject l2r_paragraph_reader_next(final SubLObject reader) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = learning_reader.l2r_paragraph_reader_state(reader);
        final SubLObject action = learning_reader.l2r_paragraph_reader_next_action(reader);
        format(T, learning_reader.$str103$___A__A_Performing_L2R_reader_act, new SubLObject[]{ numeric_date_utilities.datestring(UNPROVIDED), numeric_date_utilities.secondstring(UNPROVIDED), action });
        force_output(T);
        if (NIL != learning_reader.$l2r_reader_unstable_inside_stepsP$.getDynamicValue(thread)) {
            learning_reader._csetf_l2r_paragraph_reader_state(reader, $UNSTABLE);
        }
        clear_forward_inference_metrics();
        final SubLObject pcase_var = action;
        if (pcase_var.eql(learning_reader.$FIND_OR_CREATE_PEGS_FOR_SENTENCE)) {
            learning_reader.l2r_paragraph_reader_find_or_create_pegs_for_sentence(reader);
        } else
            if (pcase_var.eql($ASSERT_LINKAGE)) {
                learning_reader.l2r_paragraph_reader_find_or_assert_linkage(reader);
            } else
                if (pcase_var.eql(learning_reader.$ASSERT_PARSE_TREE_FOR_LINKAGE)) {
                    learning_reader.l2r_paragraph_reader_maybe_assert_parse_tree_for_linkage(reader);
                } else
                    if (pcase_var.eql(learning_reader.$ADD_PARSING_RESULTS)) {
                        learning_reader.l2r_paragraph_reader_maybe_add_parsing_results(reader);
                    } else
                        if (pcase_var.eql($FINALIZE_SENTENCE)) {
                            learning_reader.l2r_paragraph_reader_finalize_sentence(reader);
                        } else
                            if (pcase_var.eql($COLLECT_GARBAGE)) {
                                learning_reader.l2r_paragraph_reader_collect_garbage(reader);
                            } else {
                                final SubLObject pcase_var_$5 = state;
                                if (pcase_var_$5.eql($EXHAUSTED)) {
                                    learning_reader.destroy_l2r_paragraph_reader(reader);
                                    return $EXHAUSTED;
                                }
                                if (pcase_var_$5.eql($UNSTABLE)) {
                                    Errors.warn(learning_reader.$str111$L2R_reader_was_unable_to_complete);
                                    learning_reader.destroy_l2r_paragraph_reader(reader);
                                    return $ABORTED;
                                }
                            }





        format(T, learning_reader.$str113$__Next_L2R_reader_action___S__, learning_reader.l2r_paragraph_reader_next_action(reader));
        force_output(T);
        return learning_reader.l2r_paragraph_reader_state(reader);
    }

    public static final SubLObject l2r_paragraph_reader_next_action_alt(SubLObject reader) {
        {
            SubLObject state = com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_state(reader);
            SubLObject pcase_var = state;
            if (pcase_var.eql($INITIALIZED) || pcase_var.eql($DONE_WITH_SENTENCE)) {
                return $FIND_OR_CREATE_PEGS_FOR_SENTENCE;
            } else {
                if (pcase_var.eql($CREATED_OR_FOUND_SENTENCE_PEGS)) {
                    return $ASSERT_LINKAGE;
                } else {
                    if (pcase_var.eql($ASSERTED_LINKAGE)) {
                        return $ASSERT_PARSE_TREE_FOR_LINKAGE;
                    } else {
                        if (pcase_var.eql($ASSERTED_PARSE_TREE_FOR_LINKAGE)) {
                            return $ADD_PARSING_RESULTS;
                        } else {
                            if (pcase_var.eql($PARSED)) {
                                return $FINALIZE_SENTENCE;
                            } else {
                                if (pcase_var.eql($DONE_WITH_ALL_SENTENCES)) {
                                    return $COLLECT_GARBAGE;
                                } else {
                                    return NIL;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject l2r_paragraph_reader_next_action(final SubLObject reader) {
        final SubLObject pcase_var;
        final SubLObject state = pcase_var = learning_reader.l2r_paragraph_reader_state(reader);
        if (pcase_var.eql($INITIALIZED) || pcase_var.eql(learning_reader.$DONE_WITH_SENTENCE)) {
            return learning_reader.$FIND_OR_CREATE_PEGS_FOR_SENTENCE;
        }
        if (pcase_var.eql(learning_reader.$CREATED_OR_FOUND_SENTENCE_PEGS)) {
            return $ASSERT_LINKAGE;
        }
        if (pcase_var.eql($ASSERTED_LINKAGE)) {
            return learning_reader.$ASSERT_PARSE_TREE_FOR_LINKAGE;
        }
        if (pcase_var.eql(learning_reader.$ASSERTED_PARSE_TREE_FOR_LINKAGE)) {
            return learning_reader.$ADD_PARSING_RESULTS;
        }
        if (pcase_var.eql($PARSED)) {
            return $FINALIZE_SENTENCE;
        }
        if (pcase_var.eql(learning_reader.$DONE_WITH_ALL_SENTENCES)) {
            return $COLLECT_GARBAGE;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject destroy_l2r_paragraph_reader_alt(SubLObject reader) {
        return reader;
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject destroy_l2r_paragraph_reader(final SubLObject reader) {
        return reader;
    }

    public static final SubLObject updating_l2r_paragraph_reader_times_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt113);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject reader = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    reader = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject this_time = $sym114$THIS_TIME;
                            SubLObject this_cpu_time = $sym115$THIS_CPU_TIME;
                            return list(new SubLObject[]{ CLET, list(this_time, this_cpu_time), list(L2R_COMPUTING_CPU_TIME, this_cpu_time, listS(CTIME, this_time, append(body, NIL))), list(FORMAT, T, $str_alt118$__This_step_took__A___A_of_CPU_ti, listS(L2R_READABLE_TIME_STRING, this_time, $list_alt120), listS(FIF, list(NUMBERP, this_cpu_time), listS(L2R_READABLE_TIME_STRING, this_cpu_time, $list_alt123), $list_alt124)), list(CINC, list(L2R_PARAGRAPH_READER_TOTAL_TIME, reader), this_time), list(CINC, list(L2R_PARAGRAPH_READER_SENTENCE_TIME, reader), this_time), list(PWHEN, this_cpu_time, list(CINC, list(L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, reader), this_cpu_time), list(CINC, list(L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, reader), this_cpu_time)), list(FORMAT, T, $str_alt127$__Total_time_for_this_sentence___, listS(L2R_READABLE_TIME_STRING, list(L2R_PARAGRAPH_READER_SENTENCE_TIME, reader), $list_alt120), listS(L2R_READABLE_TIME_STRING, list(L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, reader), $list_alt123)), list(FORMAT, T, $str_alt128$__Total_time_for_this_reader___A_, listS(L2R_READABLE_TIME_STRING, list(L2R_PARAGRAPH_READER_TOTAL_TIME, reader), $list_alt120), listS(L2R_READABLE_TIME_STRING, list(L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, reader), $list_alt123)) });
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt113);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject updating_l2r_paragraph_reader_times(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, learning_reader.$list120);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject reader = NIL;
        destructuring_bind_must_consp(current, datum, learning_reader.$list120);
        reader = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject this_time = learning_reader.$sym121$THIS_TIME;
            final SubLObject this_cpu_time = learning_reader.$sym122$THIS_CPU_TIME;
            return list(new SubLObject[]{ CLET, list(this_time, this_cpu_time), list(learning_reader.L2R_COMPUTING_CPU_TIME, this_cpu_time, listS(CTIME, this_time, append(body, NIL))), list(FORMAT, T, learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, listS(learning_reader.L2R_READABLE_TIME_STRING, this_time, learning_reader.$list127), listS(FIF, list(NUMBERP, this_cpu_time), listS(learning_reader.L2R_READABLE_TIME_STRING, this_cpu_time, learning_reader.$list130), learning_reader.$list131)), list(CINC, list(learning_reader.L2R_PARAGRAPH_READER_TOTAL_TIME, reader), this_time), list(CINC, list(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_TIME, reader), this_time), list(PWHEN, this_cpu_time, list(CINC, list(learning_reader.L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, reader), this_cpu_time), list(CINC, list(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, reader), this_cpu_time)), list(FORMAT, T, learning_reader.$str134$__Total_time_for_this_sentence___, listS(learning_reader.L2R_READABLE_TIME_STRING, list(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_TIME, reader), learning_reader.$list127), listS(learning_reader.L2R_READABLE_TIME_STRING, list(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, reader), learning_reader.$list130)), list(FORMAT, T, learning_reader.$str135$__Total_time_for_this_reader___A_, listS(learning_reader.L2R_READABLE_TIME_STRING, list(learning_reader.L2R_PARAGRAPH_READER_TOTAL_TIME, reader), learning_reader.$list127), listS(learning_reader.L2R_READABLE_TIME_STRING, list(learning_reader.L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, reader), learning_reader.$list130)) });
        }
        cdestructuring_bind_error(datum, learning_reader.$list120);
        return NIL;
    }

    public static final SubLObject with_temporary_transmit_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt129);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject state = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt129);
                    state = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject old_transmit_state = $sym130$OLD_TRANSMIT_STATE;
                            return list(CLET, list(bq_cons(old_transmit_state, $list_alt131)), list(CUNWIND_PROTECT, listS(PROGN, list(SET_TRANSMIT_STATE, state), append(body, NIL)), list(SET_TRANSMIT_STATE, old_transmit_state)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt129);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_temporary_transmit_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, learning_reader.$list136);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = NIL;
        destructuring_bind_must_consp(current, datum, learning_reader.$list136);
        state = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject old_transmit_state = learning_reader.$sym137$OLD_TRANSMIT_STATE;
            return list(CLET, list(bq_cons(old_transmit_state, learning_reader.$list138)), list(CUNWIND_PROTECT, listS(PROGN, list(learning_reader.SET_TRANSMIT_STATE, state), append(body, NIL)), list(learning_reader.SET_TRANSMIT_STATE, old_transmit_state)));
        }
        cdestructuring_bind_error(datum, learning_reader.$list136);
        return NIL;
    }

    public static final SubLObject with_temporary_receive_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt129);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject state = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt129);
                    state = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject old_receive_state = $sym135$OLD_RECEIVE_STATE;
                            return list(CLET, list(bq_cons(old_receive_state, $list_alt136)), list(CUNWIND_PROTECT, listS(PROGN, list(SET_RECEIVE_STATE, state), append(body, NIL)), list(SET_RECEIVE_STATE, old_receive_state)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt129);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_temporary_receive_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, learning_reader.$list136);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = NIL;
        destructuring_bind_must_consp(current, datum, learning_reader.$list136);
        state = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject old_receive_state = learning_reader.$sym142$OLD_RECEIVE_STATE;
            return list(CLET, list(bq_cons(old_receive_state, learning_reader.$list143)), list(CUNWIND_PROTECT, listS(PROGN, list(learning_reader.SET_RECEIVE_STATE, state), append(body, NIL)), list(learning_reader.SET_RECEIVE_STATE, old_receive_state)));
        }
        cdestructuring_bind_error(datum, learning_reader.$list136);
        return NIL;
    }

    public static final SubLObject reset_l2r_paragraph_reader_sentence_times_alt(SubLObject reader) {
        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, ZERO_INTEGER);
        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, ZERO_INTEGER);
        return reader;
    }

    public static SubLObject reset_l2r_paragraph_reader_sentence_times(final SubLObject reader) {
        learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, ZERO_INTEGER);
        learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, ZERO_INTEGER);
        return reader;
    }

    public static final SubLObject new_l2r_reading_event_for_document_alt(SubLObject v_document) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject reading_event = NIL;
                SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                try {
                    operation_communication.set_transmit_state(NIL != $l2r_transmit_operationsP$.getDynamicValue(thread) ? ((SubLObject) ($$$transmit)) : $$$store);
                    reading_event = com.cyc.cycjava.cycl.learning_reader.l2r_create($$$ReadingEvent);
                    com.cyc.cycjava.cycl.learning_reader.l2r_assert(listS($$isa, reading_event, $list_alt142), $$UniversalVocabularyMt);
                    com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$startingDate, reading_event, date_utilities.indexical_now()), $$UniversalVocabularyMt);
                    com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$pcwRead, reading_event, v_document), $$LearnByReadingDocumentDataMt);
                    com.cyc.cycjava.cycl.learning_reader.l2r_assert(listS($$performedBy, reading_event, $list_alt148), $$LearnByReadingDocumentDataMt);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            operation_communication.set_transmit_state(old_transmit_state);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return reading_event;
            }
        }
    }

    public static SubLObject new_l2r_reading_event_for_document(final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reading_event = NIL;
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(NIL != learning_reader.$l2r_transmit_operationsP$.getDynamicValue(thread) ? learning_reader.$$$transmit : learning_reader.$$$store);
            reading_event = learning_reader.l2r_create(learning_reader.$$$ReadingEvent);
            learning_reader.l2r_assert(listS(learning_reader.$$isa, reading_event, learning_reader.$list149), learning_reader.$$UniversalVocabularyMt);
            learning_reader.l2r_assert(list(learning_reader.$$startingDate, reading_event, date_utilities.indexical_now()), learning_reader.$$UniversalVocabularyMt);
            learning_reader.l2r_assert(list(learning_reader.$$pcwRead, reading_event, v_document), learning_reader.$$LearnByReadingDocumentDataMt);
            learning_reader.l2r_assert(listS(learning_reader.$$performedBy, reading_event, learning_reader.$list155), learning_reader.$$LearnByReadingDocumentDataMt);
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

    public static final SubLObject find_unfinished_l2r_reading_event_for_document_alt(SubLObject v_document) {
        return ask_utilities.query_variable($sym149$_READING, listS($$and, $list_alt151, list($$pcwRead, $sym149$_READING, v_document), $list_alt152), $$InferencePSC, UNPROVIDED).first();
    }

    public static SubLObject find_unfinished_l2r_reading_event_for_document(final SubLObject v_document) {
        return ask_utilities.query_variable(learning_reader.$sym156$_READING, listS(learning_reader.$$and, learning_reader.$list158, list(learning_reader.$$pcwRead, learning_reader.$sym156$_READING, v_document), learning_reader.$list159), learning_reader.$$InferencePSC, UNPROVIDED).first();
    }

    public static final SubLObject note_l2r_reading_event_ongoing_alt(SubLObject reading_event) {
        {
            SubLObject now = date_utilities.indexical_now();
            com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$temporallySubsumes, reading_event, now), $$UniversalVocabularyMt);
            {
                SubLObject pred_var = $$temporallySubsumes;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reading_event, ONE_INTEGER, pred_var)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reading_event, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                if (NIL != valid) {
                                    {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            {
                                                SubLObject done_var_5 = NIL;
                                                SubLObject token_var_6 = NIL;
                                                while (NIL == done_var_5) {
                                                    {
                                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                        SubLObject valid_7 = makeBoolean(token_var_6 != gaf);
                                                        if (NIL != valid_7) {
                                                            if (!assertions_high.gaf_arg2(gaf).equal(now)) {
                                                                com.cyc.cycjava.cycl.learning_reader.l2r_unassert_assertion(gaf);
                                                            }
                                                        }
                                                        done_var_5 = makeBoolean(NIL == valid_7);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                }
            }
        }
        return reading_event;
    }

    public static SubLObject note_l2r_reading_event_ongoing(final SubLObject reading_event) {
        final SubLObject now = date_utilities.indexical_now();
        learning_reader.l2r_assert(list(learning_reader.$$temporallySubsumes, reading_event, now), learning_reader.$$UniversalVocabularyMt);
        final SubLObject pred_var = learning_reader.$$temporallySubsumes;
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
                                learning_reader.l2r_unassert_assertion(gaf);
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

    public static final SubLObject note_l2r_reading_event_done_alt(SubLObject reading_event) {
        {
            SubLObject now = date_utilities.indexical_now();
            com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$endingDate, reading_event, now), $$UniversalVocabularyMt);
            {
                SubLObject pred_var = $$temporallySubsumes;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reading_event, ONE_INTEGER, pred_var)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reading_event, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                if (NIL != valid) {
                                    {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            {
                                                SubLObject done_var_8 = NIL;
                                                SubLObject token_var_9 = NIL;
                                                while (NIL == done_var_8) {
                                                    {
                                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_9);
                                                        SubLObject valid_10 = makeBoolean(token_var_9 != gaf);
                                                        if (NIL != valid_10) {
                                                            com.cyc.cycjava.cycl.learning_reader.l2r_unassert_assertion(gaf);
                                                        }
                                                        done_var_8 = makeBoolean(NIL == valid_10);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                }
            }
        }
        return reading_event;
    }

    public static SubLObject note_l2r_reading_event_done(final SubLObject reading_event) {
        final SubLObject now = date_utilities.indexical_now();
        learning_reader.l2r_assert(list(learning_reader.$$endingDate, reading_event, now), learning_reader.$$UniversalVocabularyMt);
        final SubLObject pred_var = learning_reader.$$temporallySubsumes;
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
                                learning_reader.l2r_unassert_assertion(gaf);
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

    public static final SubLObject l2r_paragraph_reader_find_or_create_pegs_for_sentence_alt(SubLObject reader) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence = aref(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_vector(reader), com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_number(reader));
                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_number(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_number(reader), ONE_INTEGER));
                com.cyc.cycjava.cycl.learning_reader.reset_l2r_paragraph_reader_sentence_times(reader);
                {
                    SubLObject this_time = NIL;
                    SubLObject this_cpu_time = NIL;
                    SubLObject start = com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time();
                    SubLObject time_var = get_internal_real_time();
                    {
                        SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                        try {
                            operation_communication.set_transmit_state($$$none);
                            {
                                SubLObject old_receive_state = operation_communication.get_receive_state(UNPROVIDED);
                                try {
                                    operation_communication.set_receive_state($$$no);
                                    {
                                        SubLObject sentence_html_text = document.sentence_string(sentence);
                                        SubLObject sentence_non_html_text = evaluation_defns.cyc_remove_html_tags(sentence_html_text);
                                        SubLObject sentence_string_number = number_utilities.f_1X(count(sentence_non_html_text, com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_non_html_texts(reader), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                        SubLObject sentence_peg = com.cyc.cycjava.cycl.learning_reader.l2r_find_or_reify_peg_for_sentence_string(sentence_non_html_text, com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_document(reader), com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_paragraph(reader), com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_number(reader), sentence_string_number);
                                        {
                                            SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                                            try {
                                                kb_control_vars.$forward_inference_allowed_rules$.bind(com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_creation_rules(), thread);
                                                com.cyc.cycjava.cycl.learning_reader.l2r_assert_source_html(sentence_peg, sentence_html_text, list($$InterpretingDocumentMtFn, com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_document(reader)), UNPROVIDED);
                                                com.cyc.cycjava.cycl.learning_reader.l2r_assert_subexpression_links(sentence, sentence_peg, com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_document(reader));
                                            } finally {
                                                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_pegs(reader, cons(sentence_peg, com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_pegs(reader)));
                                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_non_html_texts(reader, cons(sentence_non_html_text, com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_non_html_texts(reader)));
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            operation_communication.set_receive_state(old_receive_state);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    operation_communication.set_transmit_state(old_transmit_state);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                    this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    {
                        SubLObject end = (NIL != start) ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time())) : NIL;
                        this_cpu_time = (NIL != end) ? ((SubLObject) (subtract(end, start))) : NIL;
                    }
                    format(T, $str_alt118$__This_step_took__A___A_of_CPU_ti, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER))) : $$$unknown_amount);
                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
                    if (NIL != this_cpu_time) {
                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
                    }
                    format(T, $str_alt127$__Total_time_for_this_sentence___, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
                    format(T, $str_alt128$__Total_time_for_this_reader___A_, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
                }
            }
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_state(reader, $CREATED_OR_FOUND_SENTENCE_PEGS);
            return com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_pegs(reader).first();
        }
    }

    public static SubLObject l2r_paragraph_reader_find_or_create_pegs_for_sentence(final SubLObject reader) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = aref(learning_reader.l2r_paragraph_reader_sentence_vector(reader), learning_reader.l2r_paragraph_reader_sentence_number(reader));
        learning_reader._csetf_l2r_paragraph_reader_sentence_number(reader, add(learning_reader.l2r_paragraph_reader_sentence_number(reader), ONE_INTEGER));
        learning_reader.reset_l2r_paragraph_reader_sentence_times(reader);
        SubLObject this_time = NIL;
        SubLObject this_cpu_time = NIL;
        final SubLObject start = learning_reader.l2r_image_elapsed_cpu_time();
        final SubLObject time_var = get_internal_real_time();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(learning_reader.$$$none);
            final SubLObject old_receive_state = operation_communication.get_receive_state(UNPROVIDED);
            try {
                operation_communication.set_receive_state(learning_reader.$$$no);
                final SubLObject sentence_html_text = document.sentence_string(sentence);
                final SubLObject sentence_non_html_text = evaluation_defns.cyc_remove_html_tags(sentence_html_text);
                final SubLObject sentence_string_number = number_utilities.f_1X(count(sentence_non_html_text, learning_reader.l2r_paragraph_reader_sentence_non_html_texts(reader), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                final SubLObject sentence_peg = learning_reader.l2r_find_or_reify_peg_for_sentence_string(sentence_non_html_text, learning_reader.l2r_paragraph_reader_document(reader), learning_reader.l2r_paragraph_reader_paragraph(reader), learning_reader.l2r_paragraph_reader_sentence_number(reader), sentence_string_number);
                final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_allowed_rules$.bind(learning_reader.l2r_sentence_level_peg_creation_rules(), thread);
                    learning_reader.l2r_assert_source_html(sentence_peg, sentence_html_text, list(learning_reader.$$InterpretingDocumentMtFn, learning_reader.l2r_paragraph_reader_document(reader)), UNPROVIDED);
                    learning_reader.l2r_assert_subexpression_links(sentence, sentence_peg, learning_reader.l2r_paragraph_reader_document(reader));
                } finally {
                    kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                }
                learning_reader._csetf_l2r_paragraph_reader_sentence_pegs(reader, cons(sentence_peg, learning_reader.l2r_paragraph_reader_sentence_pegs(reader)));
                learning_reader._csetf_l2r_paragraph_reader_sentence_non_html_texts(reader, cons(sentence_non_html_text, learning_reader.l2r_paragraph_reader_sentence_non_html_texts(reader)));
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
        final SubLObject end = (NIL != start) ? learning_reader.l2r_image_elapsed_cpu_time() : NIL;
        this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
        format(T, learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : learning_reader.$$$unknown_amount);
        learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
        learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
        if (NIL != this_cpu_time) {
            learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        format(T, learning_reader.$str134$__Total_time_for_this_sentence___, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
        format(T, learning_reader.$str135$__Total_time_for_this_reader___A_, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        learning_reader._csetf_l2r_paragraph_reader_state(reader, learning_reader.$CREATED_OR_FOUND_SENTENCE_PEGS);
        return learning_reader.l2r_paragraph_reader_sentence_pegs(reader).first();
    }

    public static final SubLObject l2r_paragraph_reader_find_or_assert_linkage_alt(SubLObject reader) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence_peg = com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_pegs(reader).first();
                SubLObject linkage_or_linkage_fort = NIL;
                SubLObject content_mt = NIL;
                SubLObject this_time = NIL;
                SubLObject this_cpu_time = NIL;
                SubLObject start = com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time();
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                    try {
                        operation_communication.set_transmit_state($$$none);
                        thread.resetMultipleValues();
                        {
                            SubLObject linkage_or_linkage_fort_11 = com.cyc.cycjava.cycl.learning_reader.l2r_find_or_assert_linkage_for_peg(sentence_peg);
                            SubLObject content_mt_12 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            linkage_or_linkage_fort = linkage_or_linkage_fort_11;
                            content_mt = content_mt_12;
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                operation_communication.set_transmit_state(old_transmit_state);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                {
                    SubLObject end = (NIL != start) ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time())) : NIL;
                    this_cpu_time = (NIL != end) ? ((SubLObject) (subtract(end, start))) : NIL;
                }
                format(T, $str_alt118$__This_step_took__A___A_of_CPU_ti, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER))) : $$$unknown_amount);
                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
                if (NIL != this_cpu_time) {
                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
                }
                format(T, $str_alt127$__Total_time_for_this_sentence___, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
                format(T, $str_alt128$__Total_time_for_this_reader___A_, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
                if ((NIL != linkage.linkage_p(linkage_or_linkage_fort)) && (NIL != content_mt)) {
                    {
                        SubLObject linkage_fort = kb_mapping_utilities.fpred_value_in_any_mt(content_mt, $$contentMtOfLinkage, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_linkage(reader, linkage_or_linkage_fort);
                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_linkage_fort(reader, linkage_fort);
                    }
                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_state(reader, $ASSERTED_LINKAGE);
                } else {
                    if ((NIL != forts.fort_p(linkage_or_linkage_fort)) && (NIL != content_mt)) {
                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_linkage_fort(reader, linkage_or_linkage_fort);
                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_state(reader, $ASSERTED_PARSE_TREE_FOR_LINKAGE);
                    }
                }
                return sentence_peg;
            }
        }
    }

    public static SubLObject l2r_paragraph_reader_find_or_assert_linkage(final SubLObject reader) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_peg = learning_reader.l2r_paragraph_reader_sentence_pegs(reader).first();
        SubLObject linkage_or_linkage_fort = NIL;
        SubLObject content_mt = NIL;
        SubLObject this_time = NIL;
        SubLObject this_cpu_time = NIL;
        final SubLObject start = learning_reader.l2r_image_elapsed_cpu_time();
        final SubLObject time_var = get_internal_real_time();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(learning_reader.$$$none);
            thread.resetMultipleValues();
            final SubLObject linkage_or_linkage_fort_$12 = learning_reader.l2r_find_or_assert_linkage_for_peg(sentence_peg);
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
        final SubLObject end = (NIL != start) ? learning_reader.l2r_image_elapsed_cpu_time() : NIL;
        this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
        format(T, learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : learning_reader.$$$unknown_amount);
        learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
        learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
        if (NIL != this_cpu_time) {
            learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        format(T, learning_reader.$str134$__Total_time_for_this_sentence___, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
        format(T, learning_reader.$str135$__Total_time_for_this_reader___A_, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        if ((NIL != linkage.linkage_p(linkage_or_linkage_fort)) && (NIL != content_mt)) {
            final SubLObject linkage_fort = kb_mapping_utilities.fpred_value_in_any_mt(content_mt, learning_reader.$$contentMtOfLinkage, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            learning_reader._csetf_l2r_paragraph_reader_linkage(reader, linkage_or_linkage_fort);
            learning_reader._csetf_l2r_paragraph_reader_linkage_fort(reader, linkage_fort);
            learning_reader._csetf_l2r_paragraph_reader_state(reader, $ASSERTED_LINKAGE);
        } else
            if ((NIL != forts.fort_p(linkage_or_linkage_fort)) && (NIL != content_mt)) {
                learning_reader._csetf_l2r_paragraph_reader_linkage_fort(reader, linkage_or_linkage_fort);
                learning_reader._csetf_l2r_paragraph_reader_state(reader, learning_reader.$ASSERTED_PARSE_TREE_FOR_LINKAGE);
            }

        return sentence_peg;
    }

    public static final SubLObject l2r_paragraph_reader_maybe_assert_parse_tree_for_linkage_alt(SubLObject reader) {
        {
            SubLObject v_linkage = com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_linkage(reader);
            SubLObject linkage_fort = com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_linkage_fort(reader);
            SubLObject content_mt = linkage_assertion.content_mt_of_linkage(cycl_utilities.hl_to_el(linkage_fort));
            SubLObject tokenization = kb_mapping_utilities.fpred_value_in_any_mt(linkage_fort, $$linkageTokenization, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == v_linkage) {
                Errors.warn($str_alt163$Couldn_t_find_linkage_for__S, reader);
            } else {
                if (NIL == linkage_fort) {
                    Errors.warn($str_alt164$Couldn_t_find_linkage_FORT_for__S, reader);
                } else {
                    if (NIL == content_mt) {
                        Errors.warn($str_alt165$Couldn_t_find_content_mt_for__S, linkage_fort);
                    } else {
                        if (NIL == tokenization) {
                            Errors.warn($str_alt166$Couldn_t_find_tokenization_for__S, linkage_fort);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.learning_reader.l2r_tokenization_has_parse_treeP(tokenization, content_mt)) {
                                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_state(reader, $ASSERTED_PARSE_TREE_FOR_LINKAGE);
                            } else {
                                {
                                    SubLObject this_time = NIL;
                                    SubLObject this_cpu_time = NIL;
                                    SubLObject start = com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time();
                                    SubLObject time_var = get_internal_real_time();
                                    {
                                        SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                                        try {
                                            operation_communication.set_transmit_state($$$none);
                                            com.cyc.cycjava.cycl.learning_reader.l2r_assert_parse_tree_for_linkage(v_linkage, tokenization, content_mt);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    operation_communication.set_transmit_state(old_transmit_state);
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                }
                                            }
                                        }
                                    }
                                    this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    {
                                        SubLObject end = (NIL != start) ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time())) : NIL;
                                        this_cpu_time = (NIL != end) ? ((SubLObject) (subtract(end, start))) : NIL;
                                    }
                                    format(T, $str_alt118$__This_step_took__A___A_of_CPU_ti, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER))) : $$$unknown_amount);
                                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
                                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
                                    if (NIL != this_cpu_time) {
                                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
                                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
                                    }
                                    format(T, $str_alt127$__Total_time_for_this_sentence___, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
                                    format(T, $str_alt128$__Total_time_for_this_reader___A_, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
                                }
                                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_state(reader, $ASSERTED_PARSE_TREE_FOR_LINKAGE);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject l2r_paragraph_reader_maybe_assert_parse_tree_for_linkage(final SubLObject reader) {
        final SubLObject v_linkage = learning_reader.l2r_paragraph_reader_linkage(reader);
        final SubLObject linkage_fort = learning_reader.l2r_paragraph_reader_linkage_fort(reader);
        final SubLObject content_mt = linkage_assertion.content_mt_of_linkage(cycl_utilities.hl_to_el(linkage_fort));
        final SubLObject tokenization = kb_mapping_utilities.fpred_value_in_any_mt(linkage_fort, learning_reader.$$linkageTokenization, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == v_linkage) {
            Errors.warn(learning_reader.$str170$Couldn_t_find_linkage_for__S, reader);
        } else
            if (NIL == linkage_fort) {
                Errors.warn(learning_reader.$str171$Couldn_t_find_linkage_FORT_for__S, reader);
            } else
                if (NIL == content_mt) {
                    Errors.warn(learning_reader.$str172$Couldn_t_find_content_mt_for__S, linkage_fort);
                } else
                    if (NIL == tokenization) {
                        Errors.warn(learning_reader.$str173$Couldn_t_find_tokenization_for__S, linkage_fort);
                    } else
                        if (NIL != learning_reader.l2r_tokenization_has_parse_treeP(tokenization, content_mt)) {
                            learning_reader._csetf_l2r_paragraph_reader_state(reader, learning_reader.$ASSERTED_PARSE_TREE_FOR_LINKAGE);
                        } else {
                            SubLObject this_time = NIL;
                            SubLObject this_cpu_time = NIL;
                            final SubLObject start = learning_reader.l2r_image_elapsed_cpu_time();
                            final SubLObject time_var = get_internal_real_time();
                            final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                            try {
                                operation_communication.set_transmit_state(learning_reader.$$$none);
                                learning_reader.l2r_assert_parse_tree_for_linkage(v_linkage, tokenization, content_mt);
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
                            final SubLObject end = (NIL != start) ? learning_reader.l2r_image_elapsed_cpu_time() : NIL;
                            this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
                            format(T, learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : learning_reader.$$$unknown_amount);
                            learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
                            learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
                            if (NIL != this_cpu_time) {
                                learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
                                learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
                            }
                            format(T, learning_reader.$str134$__Total_time_for_this_sentence___, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
                            format(T, learning_reader.$str135$__Total_time_for_this_reader___A_, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
                            learning_reader._csetf_l2r_paragraph_reader_state(reader, learning_reader.$ASSERTED_PARSE_TREE_FOR_LINKAGE);
                        }




        return NIL;
    }

    public static final SubLObject l2r_tokenization_has_parse_treeP_alt(SubLObject tokenization, SubLObject content_mt) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(listS($$and, list($$ist_Asserted, content_mt, list($$parseTreeOfTokenization, $sym169$_PARSE_TREE, tokenization)), $list_alt170), $$InferencePSC, UNPROVIDED));
    }

    public static SubLObject l2r_tokenization_has_parse_treeP(final SubLObject tokenization, final SubLObject content_mt) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(listS(learning_reader.$$and, list(learning_reader.$$ist_Asserted, content_mt, list(learning_reader.$$parseTreeOfTokenization, learning_reader.$sym176$_PARSE_TREE, tokenization)), learning_reader.$list177), learning_reader.$$InferencePSC, UNPROVIDED));
    }

    public static final SubLObject l2r_paragraph_reader_maybe_add_parsing_results_alt(SubLObject reader) {
        {
            SubLObject sentence_peg = com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_pegs(reader).first();
            if (!((NIL != isa.isa_in_any_mtP(sentence_peg, $$LinguisticObject_NoParseAvailable)) || (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(sentence_peg, $$pegInterpretationMts, ONE_INTEGER, UNPROVIDED)))) {
                com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_add_parsing_results(reader);
            }
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_state(reader, $PARSED);
            return sentence_peg;
        }
    }

    public static SubLObject l2r_paragraph_reader_maybe_add_parsing_results(final SubLObject reader) {
        final SubLObject sentence_peg = learning_reader.l2r_paragraph_reader_sentence_pegs(reader).first();
        if ((NIL == isa.isa_in_any_mtP(sentence_peg, learning_reader.$$LinguisticObject_NoParseAvailable)) && (NIL == kb_mapping_utilities.some_pred_value_in_any_mt(sentence_peg, learning_reader.$$pegInterpretationMts, ONE_INTEGER, UNPROVIDED))) {
            learning_reader.l2r_paragraph_reader_add_parsing_results(reader);
        }
        learning_reader._csetf_l2r_paragraph_reader_state(reader, $PARSED);
        return sentence_peg;
    }

    public static final SubLObject l2r_paragraph_reader_add_parsing_results_alt(SubLObject reader) {
        {
            SubLObject sentence_peg = com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_pegs(reader).first();
            format(T, $str_alt173$__Asserting_Cyclifier_results_for, sentence_peg);
            {
                SubLObject this_time = NIL;
                SubLObject this_cpu_time = NIL;
                SubLObject start = com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time();
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                    try {
                        operation_communication.set_transmit_state($$$none);
                        parsing_utilities.get_cyclifier_interps_for_expression_peg(sentence_peg);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                operation_communication.set_transmit_state(old_transmit_state);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
                this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                {
                    SubLObject end = (NIL != start) ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time())) : NIL;
                    this_cpu_time = (NIL != end) ? ((SubLObject) (subtract(end, start))) : NIL;
                }
                format(T, $str_alt118$__This_step_took__A___A_of_CPU_ti, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER))) : $$$unknown_amount);
                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
                if (NIL != this_cpu_time) {
                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
                }
                format(T, $str_alt127$__Total_time_for_this_sentence___, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
                format(T, $str_alt128$__Total_time_for_this_reader___A_, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
            }
            return sentence_peg;
        }
    }

    public static SubLObject l2r_paragraph_reader_add_parsing_results(final SubLObject reader) {
        final SubLObject sentence_peg = learning_reader.l2r_paragraph_reader_sentence_pegs(reader).first();
        format(T, learning_reader.$str180$__Asserting_Cyclifier_results_for, sentence_peg);
        SubLObject this_time = NIL;
        SubLObject this_cpu_time = NIL;
        final SubLObject start = learning_reader.l2r_image_elapsed_cpu_time();
        final SubLObject time_var = get_internal_real_time();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(learning_reader.$$$none);
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
        final SubLObject end = (NIL != start) ? learning_reader.l2r_image_elapsed_cpu_time() : NIL;
        this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
        format(T, learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : learning_reader.$$$unknown_amount);
        learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
        learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
        if (NIL != this_cpu_time) {
            learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        format(T, learning_reader.$str134$__Total_time_for_this_sentence___, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
        format(T, learning_reader.$str135$__Total_time_for_this_reader___A_, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        return sentence_peg;
    }

    public static final SubLObject l2r_paragraph_reader_finalize_sentence_alt(SubLObject reader) {
        {
            SubLObject this_time = NIL;
            SubLObject this_cpu_time = NIL;
            SubLObject start = com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time();
            SubLObject time_var = get_internal_real_time();
            com.cyc.cycjava.cycl.learning_reader.l2r_finalize_sentence_peg(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_pegs(reader));
            this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            {
                SubLObject end = (NIL != start) ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time())) : NIL;
                this_cpu_time = (NIL != end) ? ((SubLObject) (subtract(end, start))) : NIL;
            }
            format(T, $str_alt118$__This_step_took__A___A_of_CPU_ti, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER))) : $$$unknown_amount);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
            if (NIL != this_cpu_time) {
                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
            }
            format(T, $str_alt127$__Total_time_for_this_sentence___, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
            format(T, $str_alt128$__Total_time_for_this_reader___A_, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        }
        format(T, $str_alt174$__Read_sentence___S_in__A___A_of_, new SubLObject[]{ com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_number(reader), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), UNPROVIDED), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER) });
        {
            SubLObject new_assertion_count = assertion_handles.assertion_count();
            format(T, $str_alt175$__After__S_sentences__assertion_c, new SubLObject[]{ com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_number(reader), subtract(new_assertion_count, com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_initial_assertion_count(reader)), com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_initial_assertion_count(reader), new_assertion_count });
        }
        com.cyc.cycjava.cycl.learning_reader.write_l2r_image_for_document(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_document(reader), NIL);
        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_state(reader, NIL != list_utilities.lengthG(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_vector(reader), com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_number(reader), UNPROVIDED) ? ((SubLObject) ($DONE_WITH_SENTENCE)) : $DONE_WITH_ALL_SENTENCES);
        return reader;
    }

    public static SubLObject l2r_paragraph_reader_finalize_sentence(final SubLObject reader) {
        SubLObject this_time = NIL;
        SubLObject this_cpu_time = NIL;
        final SubLObject start = learning_reader.l2r_image_elapsed_cpu_time();
        final SubLObject time_var = get_internal_real_time();
        learning_reader.l2r_finalize_sentence_peg(learning_reader.l2r_paragraph_reader_sentence_pegs(reader));
        this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (NIL != start) ? learning_reader.l2r_image_elapsed_cpu_time() : NIL;
        this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
        format(T, learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : learning_reader.$$$unknown_amount);
        learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
        learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
        if (NIL != this_cpu_time) {
            learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        format(T, learning_reader.$str134$__Total_time_for_this_sentence___, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
        format(T, learning_reader.$str135$__Total_time_for_this_reader___A_, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        format(T, learning_reader.$str181$__Read_sentence___S_in__A___A_of_, new SubLObject[]{ learning_reader.l2r_paragraph_reader_sentence_number(reader), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_time(reader), UNPROVIDED), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER) });
        final SubLObject new_assertion_count = assertion_handles.assertion_count();
        format(T, learning_reader.$str182$__After__S_sentences__assertion_c, new SubLObject[]{ learning_reader.l2r_paragraph_reader_sentence_number(reader), subtract(new_assertion_count, learning_reader.l2r_paragraph_reader_initial_assertion_count(reader)), learning_reader.l2r_paragraph_reader_initial_assertion_count(reader), new_assertion_count });
        learning_reader.write_l2r_image_for_document(learning_reader.l2r_paragraph_reader_document(reader), NIL);
        learning_reader._csetf_l2r_paragraph_reader_state(reader, NIL != list_utilities.lengthG(learning_reader.l2r_paragraph_reader_sentence_vector(reader), learning_reader.l2r_paragraph_reader_sentence_number(reader), UNPROVIDED) ? learning_reader.$DONE_WITH_SENTENCE : learning_reader.$DONE_WITH_ALL_SENTENCES);
        return reader;
    }

    public static final SubLObject l2r_finalize_sentence_peg_alt(SubLObject sentence_pegs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $l2r_finalization_problem_store$.currentBinding(thread);
                try {
                    $l2r_finalization_problem_store$.bind(NIL, thread);
                    try {
                        $l2r_finalization_problem_store$.setDynamicValue(inference_datastructures_problem_store.new_problem_store(NIL), thread);
                        com.cyc.cycjava.cycl.learning_reader.l2r_assert_sentence_peg_results(sentence_pegs.first());
                        {
                            SubLObject cdolist_list_var = sentence_pegs.rest();
                            SubLObject previous_sentence_peg = NIL;
                            for (previous_sentence_peg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , previous_sentence_peg = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.learning_reader.l2r_assert_distillation_query_results(previous_sentence_peg);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                inference_datastructures_problem_store.destroy_problem_store($l2r_finalization_problem_store$.getDynamicValue(thread));
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                            }
                        }
                    }
                } finally {
                    $l2r_finalization_problem_store$.rebind(_prev_bind_0, thread);
                }
            }
            return sentence_pegs;
        }
    }

    public static SubLObject l2r_finalize_sentence_peg(final SubLObject sentence_pegs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = learning_reader.$l2r_finalization_problem_store$.currentBinding(thread);
        try {
            learning_reader.$l2r_finalization_problem_store$.bind(NIL, thread);
            try {
                learning_reader.$l2r_finalization_problem_store$.setDynamicValue(new_problem_store(NIL), thread);
                learning_reader.l2r_assert_sentence_peg_results(sentence_pegs.first());
                SubLObject cdolist_list_var = sentence_pegs.rest();
                SubLObject previous_sentence_peg = NIL;
                previous_sentence_peg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    learning_reader.l2r_assert_distillation_query_results(previous_sentence_peg);
                    cdolist_list_var = cdolist_list_var.rest();
                    previous_sentence_peg = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    destroy_problem_store(learning_reader.$l2r_finalization_problem_store$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            learning_reader.$l2r_finalization_problem_store$.rebind(_prev_bind_0, thread);
        }
        return sentence_pegs;
    }

    public static final SubLObject l2r_paragraph_reader_collect_garbage_alt(SubLObject reader) {
        {
            SubLObject this_time = NIL;
            SubLObject this_cpu_time = NIL;
            SubLObject start = com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time();
            SubLObject time_var = get_internal_real_time();
            com.cyc.cycjava.cycl.learning_reader.l2r_collect_garbage_for_sentence_pegs(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_pegs(reader));
            this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            {
                SubLObject end = (NIL != start) ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_image_elapsed_cpu_time())) : NIL;
                this_cpu_time = (NIL != end) ? ((SubLObject) (subtract(end, start))) : NIL;
            }
            format(T, $str_alt118$__This_step_took__A___A_of_CPU_ti, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER))) : $$$unknown_amount);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
            if (NIL != this_cpu_time) {
                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
            }
            format(T, $str_alt127$__Total_time_for_this_sentence___, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
            format(T, $str_alt128$__Total_time_for_this_reader___A_, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        }
        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_paragraph_reader_state(reader, $EXHAUSTED);
        return reader;
    }

    public static SubLObject l2r_paragraph_reader_collect_garbage(final SubLObject reader) {
        SubLObject this_time = NIL;
        SubLObject this_cpu_time = NIL;
        final SubLObject start = learning_reader.l2r_image_elapsed_cpu_time();
        final SubLObject time_var = get_internal_real_time();
        learning_reader.l2r_collect_garbage_for_sentence_pegs(learning_reader.l2r_paragraph_reader_sentence_pegs(reader));
        this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (NIL != start) ? learning_reader.l2r_image_elapsed_cpu_time() : NIL;
        this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
        format(T, learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, learning_reader.l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? learning_reader.l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : learning_reader.$$$unknown_amount);
        learning_reader._csetf_l2r_paragraph_reader_total_time(reader, add(learning_reader.l2r_paragraph_reader_total_time(reader), this_time));
        learning_reader._csetf_l2r_paragraph_reader_sentence_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_time(reader), this_time));
        if (NIL != this_cpu_time) {
            learning_reader._csetf_l2r_paragraph_reader_total_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            learning_reader._csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        format(T, learning_reader.$str134$__Total_time_for_this_sentence___, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
        format(T, learning_reader.$str135$__Total_time_for_this_reader___A_, learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_time(reader), TWO_INTEGER), learning_reader.l2r_readable_time_string(learning_reader.l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        learning_reader._csetf_l2r_paragraph_reader_state(reader, $EXHAUSTED);
        return reader;
    }

    public static final SubLObject l2r_collect_garbage_for_sentence_pegs_alt(SubLObject sentence_pegs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $l2r_finalization_problem_store$.currentBinding(thread);
                try {
                    $l2r_finalization_problem_store$.bind(NIL, thread);
                    try {
                        $l2r_finalization_problem_store$.setDynamicValue(inference_datastructures_problem_store.new_problem_store(NIL), thread);
                        {
                            SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                            try {
                                operation_communication.set_transmit_state(NIL != $l2r_transmit_operationsP$.getDynamicValue(thread) ? ((SubLObject) ($$$transmit)) : $$$store);
                                {
                                    SubLObject cdolist_list_var = sentence_pegs;
                                    SubLObject sentence_peg = NIL;
                                    for (sentence_peg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence_peg = cdolist_list_var.first()) {
                                        {
                                            SubLObject cdolist_list_var_14 = com.cyc.cycjava.cycl.learning_reader.l2r_garbage_collection_query_specs();
                                            SubLObject query_spec = NIL;
                                            for (query_spec = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , query_spec = cdolist_list_var_14.first()) {
                                                com.cyc.cycjava.cycl.learning_reader.l2r_assert_query_spec_results_for_sentence_peg(query_spec, sentence_peg);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        operation_communication.set_transmit_state(old_transmit_state);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                inference_datastructures_problem_store.destroy_problem_store($l2r_finalization_problem_store$.getDynamicValue(thread));
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                            }
                        }
                    }
                } finally {
                    $l2r_finalization_problem_store$.rebind(_prev_bind_0, thread);
                }
            }
            return sentence_pegs;
        }
    }

    public static SubLObject l2r_collect_garbage_for_sentence_pegs(final SubLObject sentence_pegs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = learning_reader.$l2r_finalization_problem_store$.currentBinding(thread);
        try {
            learning_reader.$l2r_finalization_problem_store$.bind(NIL, thread);
            try {
                learning_reader.$l2r_finalization_problem_store$.setDynamicValue(new_problem_store(NIL), thread);
                final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                try {
                    operation_communication.set_transmit_state(NIL != learning_reader.$l2r_transmit_operationsP$.getDynamicValue(thread) ? learning_reader.$$$transmit : learning_reader.$$$store);
                    SubLObject cdolist_list_var = sentence_pegs;
                    SubLObject sentence_peg = NIL;
                    sentence_peg = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$15 = learning_reader.l2r_garbage_collection_query_specs();
                        SubLObject query_spec = NIL;
                        query_spec = cdolist_list_var_$15.first();
                        while (NIL != cdolist_list_var_$15) {
                            learning_reader.l2r_assert_query_spec_results_for_sentence_peg(query_spec, sentence_peg);
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
                    destroy_problem_store(learning_reader.$l2r_finalization_problem_store$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        } finally {
            learning_reader.$l2r_finalization_problem_store$.rebind(_prev_bind_0, thread);
        }
        return sentence_pegs;
    }

    public static final SubLObject l2r_read_paragraph_internal_alt(SubLObject paragraph, SubLObject v_document, SubLObject reading_event, SubLObject reader) {
        if (reading_event == UNPROVIDED) {
            reading_event = NIL;
        }
        if (reader == UNPROVIDED) {
            reader = com.cyc.cycjava.cycl.learning_reader.new_l2r_paragraph_reader(paragraph, v_document);
        }
        while (NIL != com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_next_action(reader)) {
            com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_next(reader);
            if (NIL != cycl_denotational_term_p(reading_event)) {
                com.cyc.cycjava.cycl.learning_reader.note_l2r_reading_event_ongoing(reading_event);
            }
        } 
        {
            SubLObject pegs = nreverse(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_pegs(reader));
            SubLObject texts = nreverse(com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_sentence_non_html_texts(reader));
            return values(pegs, texts);
        }
    }

    public static SubLObject l2r_read_paragraph_internal(final SubLObject paragraph, final SubLObject v_document, SubLObject reading_event, SubLObject reader) {
        if (reading_event == UNPROVIDED) {
            reading_event = NIL;
        }
        if (reader == UNPROVIDED) {
            reader = learning_reader.new_l2r_paragraph_reader(paragraph, v_document);
        }
        while (NIL != learning_reader.l2r_paragraph_reader_next_action(reader)) {
            learning_reader.l2r_paragraph_reader_next(reader);
            if (NIL != cycl_grammar.cycl_denotational_term_p(reading_event)) {
                learning_reader.note_l2r_reading_event_ongoing(reading_event);
            }
        } 
        final SubLObject pegs = nreverse(learning_reader.l2r_paragraph_reader_sentence_pegs(reader));
        final SubLObject texts = nreverse(learning_reader.l2r_paragraph_reader_sentence_non_html_texts(reader));
        return values(pegs, texts);
    }

    /**
     * Assert the knowledge we want to keep around after reading SENTENCE-PEG.
     */
    @LispMethod(comment = "Assert the knowledge we want to keep around after reading SENTENCE-PEG.")
    public static final SubLObject l2r_assert_sentence_peg_results_alt(SubLObject sentence_peg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                try {
                    operation_communication.set_transmit_state(NIL != $l2r_transmit_operationsP$.getDynamicValue(thread) ? ((SubLObject) ($$$transmit)) : $$$store);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.learning_reader.l2r_finalization_query_specs();
                                SubLObject query_spec = NIL;
                                for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.learning_reader.l2r_assert_query_spec_results_for_sentence_peg(query_spec, sentence_peg);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            operation_communication.set_transmit_state(old_transmit_state);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return sentence_peg;
        }
    }

    /**
     * Assert the knowledge we want to keep around after reading SENTENCE-PEG.
     */
    @LispMethod(comment = "Assert the knowledge we want to keep around after reading SENTENCE-PEG.")
    public static SubLObject l2r_assert_sentence_peg_results(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(NIL != learning_reader.$l2r_transmit_operationsP$.getDynamicValue(thread) ? learning_reader.$$$transmit : learning_reader.$$$store);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(learning_reader.$$InferencePSC, thread);
                SubLObject cdolist_list_var = learning_reader.l2r_finalization_query_specs();
                SubLObject query_spec = NIL;
                query_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    learning_reader.l2r_assert_query_spec_results_for_sentence_peg(query_spec, sentence_peg);
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

    public static final SubLObject l2r_assert_query_spec_results_for_sentence_peg_alt(SubLObject query_spec, SubLObject sentence_peg) {
        {
            SubLObject new_terms = com.cyc.cycjava.cycl.learning_reader.l2r_run_finalization_query_for_sentence_peg(query_spec, sentence_peg);
            SubLObject cdolist_list_var = new_terms;
            SubLObject new_term = NIL;
            for (new_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_term = cdolist_list_var.first()) {
                if (NIL != constant_p(new_term)) {
                    fi.fi_eval(list(CYC_FIND_OR_CREATE_NEW_PERMANENT, constants_high.constant_name(new_term)));
                } else {
                    if (NIL != ist_sentence_p(new_term)) {
                        com.cyc.cycjava.cycl.learning_reader.l2r_assert(new_term, UNPROVIDED);
                    } else {
                        Errors.warn($str_alt178$Don_t_know_what_to_do_with_finali, new_term);
                    }
                }
            }
        }
        return query_spec;
    }

    public static SubLObject l2r_assert_query_spec_results_for_sentence_peg(final SubLObject query_spec, final SubLObject sentence_peg) {
        SubLObject cdolist_list_var;
        final SubLObject new_terms = cdolist_list_var = learning_reader.l2r_run_finalization_query_for_sentence_peg(query_spec, sentence_peg);
        SubLObject new_term = NIL;
        new_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != constant_p(new_term)) {
                fi.fi_eval(list(learning_reader.CYC_FIND_OR_CREATE_NEW_PERMANENT, constants_high.constant_name(new_term)));
            } else
                if (NIL != ist_sentence_p(new_term, UNPROVIDED)) {
                    learning_reader.l2r_assert(new_term, UNPROVIDED);
                } else {
                    Errors.warn(learning_reader.$str185$Don_t_know_what_to_do_with_finali, new_term);
                }

            cdolist_list_var = cdolist_list_var.rest();
            new_term = cdolist_list_var.first();
        } 
        return query_spec;
    }

    public static final SubLObject l2r_assert_distillation_query_results_alt(SubLObject sentence_peg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                try {
                    operation_communication.set_transmit_state(NIL != $l2r_transmit_operationsP$.getDynamicValue(thread) ? ((SubLObject) ($$$transmit)) : $$$store);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.learning_reader.l2r_distillation_query_specs();
                                SubLObject query_spec = NIL;
                                for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                                    {
                                        SubLObject new_terms = com.cyc.cycjava.cycl.learning_reader.l2r_run_finalization_query_for_sentence_peg(query_spec, sentence_peg);
                                        SubLObject cdolist_list_var_17 = new_terms;
                                        SubLObject new_term = NIL;
                                        for (new_term = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , new_term = cdolist_list_var_17.first()) {
                                            if (NIL != constant_p(new_term)) {
                                                fi.fi_eval(list(CYC_FIND_OR_CREATE_NEW_PERMANENT, constants_high.constant_name(new_term)));
                                            } else {
                                                if (NIL != ist_sentence_p(new_term)) {
                                                    format(T, $str_alt179$__Asserting_distillation_sentence, new_term);
                                                    com.cyc.cycjava.cycl.learning_reader.l2r_assert(new_term, UNPROVIDED);
                                                } else {
                                                    Errors.warn($str_alt178$Don_t_know_what_to_do_with_finali, new_term);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            operation_communication.set_transmit_state(old_transmit_state);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return sentence_peg;
        }
    }

    public static SubLObject l2r_assert_distillation_query_results(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(NIL != learning_reader.$l2r_transmit_operationsP$.getDynamicValue(thread) ? learning_reader.$$$transmit : learning_reader.$$$store);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(learning_reader.$$InferencePSC, thread);
                SubLObject cdolist_list_var = learning_reader.l2r_distillation_query_specs();
                SubLObject query_spec = NIL;
                query_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$18;
                    final SubLObject new_terms = cdolist_list_var_$18 = learning_reader.l2r_run_finalization_query_for_sentence_peg(query_spec, sentence_peg);
                    SubLObject new_term = NIL;
                    new_term = cdolist_list_var_$18.first();
                    while (NIL != cdolist_list_var_$18) {
                        if (NIL != constant_p(new_term)) {
                            fi.fi_eval(list(learning_reader.CYC_FIND_OR_CREATE_NEW_PERMANENT, constants_high.constant_name(new_term)));
                        } else
                            if (NIL != ist_sentence_p(new_term, UNPROVIDED)) {
                                format(T, learning_reader.$str186$__Asserting_distillation_sentence, new_term);
                                learning_reader.l2r_assert(new_term, UNPROVIDED);
                            } else {
                                Errors.warn(learning_reader.$str185$Don_t_know_what_to_do_with_finali, new_term);
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

    /**
     *
     *
     * @return LISTP ; an ordered list of KBQs for finalization.
     */
    @LispMethod(comment = "@return LISTP ; an ordered list of KBQs for finalization.")
    public static final SubLObject l2r_finalization_query_specs_alt() {
        {
            SubLObject kbq = $const180$TextLearnerQuery_WhatAreTheRequir;
            SubLObject el_list = (NIL != valid_constantP(kbq, UNPROVIDED)) ? ((SubLObject) (kb_query.new_cyc_query_from_kbq(kbq, UNPROVIDED).first())) : NIL;
            return NIL != el_list ? ((SubLObject) (remove(NIL, Mapping.mapcar(KBQ_FROM_QUERY_RUNNING, el_list_items(el_list)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
        }
    }

    /**
     *
     *
     * @return LISTP ; an ordered list of KBQs for finalization.
     */
    @LispMethod(comment = "@return LISTP ; an ordered list of KBQs for finalization.")
    public static SubLObject l2r_finalization_query_specs() {
        final SubLObject kbq = learning_reader.$const187$TextLearnerQuery_WhatAreTheRequir;
        final SubLObject el_list = (NIL != valid_constantP(kbq, UNPROVIDED)) ? kb_query.new_cyc_query_from_kbq(kbq, UNPROVIDED, UNPROVIDED).first() : NIL;
        return NIL != el_list ? remove(NIL, Mapping.mapcar(learning_reader.KBQ_FROM_QUERY_RUNNING, el_list_items(el_list)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
    }

    /**
     *
     *
     * @return LISTP ; an unordered list of KBQs for garbage collection
     */
    @LispMethod(comment = "@return LISTP ; an unordered list of KBQs for garbage collection")
    public static final SubLObject l2r_garbage_collection_query_specs_alt() {
        return isa.all_fort_instances_in_all_mts($const182$TextLearnerGarbageCollectionQuery);
    }

    /**
     *
     *
     * @return LISTP ; an unordered list of KBQs for garbage collection
     */
    @LispMethod(comment = "@return LISTP ; an unordered list of KBQs for garbage collection")
    public static SubLObject l2r_garbage_collection_query_specs() {
        return isa.all_fort_instances_in_all_mts(learning_reader.$const189$TextLearnerGarbageCollectionQuery);
    }

    /**
     *
     *
     * @return LISTP ; an unordered list of KBQs for distillation
     */
    @LispMethod(comment = "@return LISTP ; an unordered list of KBQs for distillation")
    public static final SubLObject l2r_distillation_query_specs_alt() {
        return isa.all_fort_instances_in_all_mts($const183$TextLearnerDisambiguationResultsD);
    }

    /**
     *
     *
     * @return LISTP ; an unordered list of KBQs for distillation
     */
    @LispMethod(comment = "@return LISTP ; an unordered list of KBQs for distillation")
    public static SubLObject l2r_distillation_query_specs() {
        return isa.all_fort_instances_in_all_mts(learning_reader.$const190$TextLearnerDisambiguationResultsD);
    }

    public static final SubLObject kbq_from_query_running_alt(SubLObject query_running) {
        return kb_mapping_utilities.fpred_value_in_any_mt(query_running, $$cycLQueryTypeSpecification, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static SubLObject kbq_from_query_running(final SubLObject query_running) {
        return kb_mapping_utilities.fpred_value_in_any_mt(query_running, learning_reader.$$cycLQueryTypeSpecification, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static final SubLObject l2r_run_finalization_query_for_sentence_peg_alt(SubLObject query_spec, SubLObject sentence_peg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject indexical_sentence = kb_query.kbq_sentence(query_spec);
                SubLObject sentence_peg_indexical = $list_alt185;
                SubLObject dereferenced = cycl_utilities.expression_subst(sentence_peg, sentence_peg_indexical, indexical_sentence, symbol_function(EQUAL), UNPROVIDED);
                SubLObject mt = kb_query.kbq_mt(query_spec);
                SubLObject v_properties = putf(kb_query.kbq_query_properties(query_spec), $PROBLEM_STORE, $l2r_finalization_problem_store$.getDynamicValue(thread));
                return inference_kernel.new_cyc_query(dereferenced, mt, v_properties);
            }
        }
    }

    public static SubLObject l2r_run_finalization_query_for_sentence_peg(final SubLObject query_spec, final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexical_sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject sentence_peg_indexical = learning_reader.$list192;
        final SubLObject dereferenced = cycl_utilities.expression_subst(sentence_peg, sentence_peg_indexical, indexical_sentence, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject mt = kb_query.kbq_mt(query_spec);
        final SubLObject v_properties = putf(kb_query.kbq_query_properties(query_spec), $PROBLEM_STORE, learning_reader.$l2r_finalization_problem_store$.getDynamicValue(thread));
        return inference_kernel.new_cyc_query(dereferenced, mt, v_properties);
    }

    public static final SubLObject l2r_print_total_time_alt(SubLObject total_time, SubLObject sentence_count, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        format(stream, $str_alt187$__Read__S_sentences_in__A___, sentence_count, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(total_time, UNPROVIDED));
        return total_time;
    }

    public static SubLObject l2r_print_total_time(final SubLObject total_time, final SubLObject sentence_count, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        format(stream, learning_reader.$str194$__Read__S_sentences_in__A___, sentence_count, learning_reader.l2r_readable_time_string(total_time, UNPROVIDED));
        return total_time;
    }

    public static final SubLObject l2r_readable_time_string_alt(SubLObject seconds, SubLObject decimal_precision) {
        if (decimal_precision == UNPROVIDED) {
            decimal_precision = TWO_INTEGER;
        }
        return numeric_date_utilities.readable_elapsed_time_string(seconds, decimal_precision);
    }

    public static SubLObject l2r_readable_time_string(final SubLObject seconds, SubLObject decimal_precision) {
        if (decimal_precision == UNPROVIDED) {
            decimal_precision = TWO_INTEGER;
        }
        return numeric_date_utilities.readable_elapsed_time_string(seconds, decimal_precision);
    }

    public static final SubLObject launch_long_inference_warner_alt() {
        return process_utilities.make_cyc_server_process_with_args($$$Long_Inference_Warner, WARN_ABOUT_LONG_INFERENCES, UNPROVIDED);
    }

    public static SubLObject launch_long_inference_warner() {
        return process_utilities.make_cyc_server_process_with_args(learning_reader.$$$Long_Inference_Warner, learning_reader.WARN_ABOUT_LONG_INFERENCES, UNPROVIDED);
    }

    public static final SubLObject warn_about_long_inferences_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            while (true) {
                {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    {
                                        SubLObject current_long_inference = $current_long_inference_info$.getDynamicValue(thread).first();
                                        SubLObject current_inference_runningP = inference_datastructures_inference.running_inference_p(current_long_inference);
                                        SubLObject inference = (NIL != current_inference_runningP) ? ((SubLObject) (current_long_inference)) : inference_utilities.latest_inference();
                                        SubLObject elapsed_time = (NIL != inference_datastructures_inference.running_inference_p(inference)) ? ((SubLObject) (inference_datastructures_inference.inference_elapsed_universal_time_since_start(inference))) : ZERO_INTEGER;
                                        if ((NIL != $current_long_inference_info$.getDynamicValue(thread)) && (inference != $current_long_inference_info$.getDynamicValue(thread).first())) {
                                            Errors.warn($str_alt193$_S_finished_after__A_with__S_answ, current_long_inference, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(second($current_long_inference_info$.getDynamicValue(thread)), UNPROVIDED), third($current_long_inference_info$.getDynamicValue(thread)));
                                            $current_long_inference_info$.setDynamicValue(NIL, thread);
                                        }
                                        if (elapsed_time.numL($long_inference_cutoff$.getGlobalValue())) {
                                        } else {
                                            if (inference == $current_long_inference_info$.getDynamicValue(thread).first()) {
                                                rplacd($current_long_inference_info$.getDynamicValue(thread), list(elapsed_time, inference_datastructures_inference.inference_answer_count(inference)));
                                            } else {
                                                Errors.warn($str_alt194$_S_has_taken__A_so_far____HL_quer, new SubLObject[]{ inference, com.cyc.cycjava.cycl.learning_reader.l2r_readable_time_string(elapsed_time, UNPROVIDED), inference_datastructures_inference.inference_hl_query(inference), inference_datastructures_inference.inference_answer_count(inference) });
                                                $current_long_inference_info$.setDynamicValue(list(inference, elapsed_time, inference_datastructures_inference.inference_answer_count(inference)), thread);
                                            }
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    }
                }
                sleep(divide($long_inference_cutoff$.getGlobalValue(), TWO_INTEGER));
            } 
        }
    }

    public static SubLObject warn_about_long_inferences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (true) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push(learning_reader.$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(learning_reader.IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject current_long_inference = learning_reader.$current_long_inference_info$.getDynamicValue(thread).first();
                        final SubLObject current_inference_runningP = running_inference_p(current_long_inference);
                        final SubLObject inference = (NIL != current_inference_runningP) ? current_long_inference : latest_inference();
                        final SubLObject elapsed_time = (NIL != running_inference_p(inference)) ? inference_elapsed_universal_time_since_start(inference) : ZERO_INTEGER;
                        if ((NIL != learning_reader.$current_long_inference_info$.getDynamicValue(thread)) && (!inference.eql(learning_reader.$current_long_inference_info$.getDynamicValue(thread).first()))) {
                            Errors.warn(learning_reader.$str200$_S_finished_after__A_with__S_answ, current_long_inference, learning_reader.l2r_readable_time_string(second(learning_reader.$current_long_inference_info$.getDynamicValue(thread)), UNPROVIDED), third(learning_reader.$current_long_inference_info$.getDynamicValue(thread)));
                            learning_reader.$current_long_inference_info$.setDynamicValue(NIL, thread);
                        }
                        if (!elapsed_time.numL(learning_reader.$long_inference_cutoff$.getGlobalValue())) {
                            if (inference.eql(learning_reader.$current_long_inference_info$.getDynamicValue(thread).first())) {
                                rplacd(learning_reader.$current_long_inference_info$.getDynamicValue(thread), list(elapsed_time, inference_answer_count(inference)));
                            } else {
                                Errors.warn(learning_reader.$str201$_S_has_taken__A_so_far____HL_quer, new SubLObject[]{ inference, learning_reader.l2r_readable_time_string(elapsed_time, UNPROVIDED), inference_hl_query(inference), inference_answer_count(inference) });
                                learning_reader.$current_long_inference_info$.setDynamicValue(list(inference, elapsed_time, inference_answer_count(inference)), thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, learning_reader.$IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            sleep(divide(learning_reader.$long_inference_cutoff$.getGlobalValue(), TWO_INTEGER));
        } 
    }

    /**
     * Read SENTENCE in DOCUMENT, asserting information about it into the KB.
     */
    @LispMethod(comment = "Read SENTENCE in DOCUMENT, asserting information about it into the KB.")
    public static final SubLObject l2r_read_document_sentence_alt(SubLObject sentence, SubLObject v_document) {
        SubLTrampolineFile.checkType(sentence, CYCL_DENOTATIONAL_TERM_P);
        SubLTrampolineFile.checkType(v_document, CYCL_DENOTATIONAL_TERM_P);
        {
            SubLObject sentence_peg = com.cyc.cycjava.cycl.learning_reader.l2r_reify_peg_for_sentence(sentence, v_document);
            SubLObject result = com.cyc.cycjava.cycl.learning_reader.l2r_read_sentence_for_peg(sentence_peg);
            com.cyc.cycjava.cycl.learning_reader.write_l2r_image_for_document(v_document, NIL);
            return result;
        }
    }

    /**
     * Read SENTENCE in DOCUMENT, asserting information about it into the KB.
     */
    @LispMethod(comment = "Read SENTENCE in DOCUMENT, asserting information about it into the KB.")
    public static SubLObject l2r_read_document_sentence(final SubLObject sentence, final SubLObject v_document) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(sentence) : "! cycl_grammar.cycl_denotational_term_p(sentence) " + ("cycl_grammar.cycl_denotational_term_p(sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(sentence) ") + sentence;
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "! cycl_grammar.cycl_denotational_term_p(v_document) " + ("cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) ") + v_document;
        final SubLObject sentence_peg = learning_reader.l2r_reify_peg_for_sentence(sentence, v_document);
        final SubLObject result = learning_reader.l2r_read_sentence_for_peg(sentence_peg);
        learning_reader.write_l2r_image_for_document(v_document, NIL);
        return result;
    }

    /**
     * Read the text of SENTENCE-PEG, asserting information about it into the KB.
     */
    @LispMethod(comment = "Read the text of SENTENCE-PEG, asserting information about it into the KB.")
    public static final SubLObject l2r_read_sentence_for_peg_alt(SubLObject sentence_peg) {
        com.cyc.cycjava.cycl.learning_reader.l2r_assert_linkage_for_peg(sentence_peg);
        format(T, $str_alt173$__Asserting_Cyclifier_results_for, sentence_peg);
        parsing_utilities.get_cyclifier_interps_for_expression_peg(sentence_peg);
        return sentence_peg;
    }

    /**
     * Read the text of SENTENCE-PEG, asserting information about it into the KB.
     */
    @LispMethod(comment = "Read the text of SENTENCE-PEG, asserting information about it into the KB.")
    public static SubLObject l2r_read_sentence_for_peg(final SubLObject sentence_peg) {
        learning_reader.l2r_assert_linkage_for_peg(sentence_peg);
        format(T, learning_reader.$str180$__Asserting_Cyclifier_results_for, sentence_peg);
        parsing_utilities.get_cyclifier_interps_for_expression_peg(sentence_peg);
        return sentence_peg;
    }

    public static final SubLObject l2r_find_or_assert_linkage_for_peg_alt(SubLObject sentence_peg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence_peg, INDEXED_TERM_P);
            thread.resetMultipleValues();
            {
                SubLObject v_linkage = com.cyc.cycjava.cycl.learning_reader.l2r_find_linkage_for_peg(sentence_peg);
                SubLObject content_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (!((NIL != v_linkage) && (NIL != content_mt))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_linkage_18 = com.cyc.cycjava.cycl.learning_reader.l2r_assert_linkage_for_peg(sentence_peg);
                        SubLObject content_mt_19 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        v_linkage = v_linkage_18;
                        content_mt = content_mt_19;
                    }
                }
                return values(v_linkage, content_mt);
            }
        }
    }

    public static SubLObject l2r_find_or_assert_linkage_for_peg(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(sentence_peg) : "! kb_indexing_datastructures.indexed_term_p(sentence_peg) " + ("kb_indexing_datastructures.indexed_term_p(sentence_peg) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(sentence_peg) ") + sentence_peg;
        thread.resetMultipleValues();
        SubLObject v_linkage = learning_reader.l2r_find_linkage_for_peg(sentence_peg);
        SubLObject content_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == v_linkage) || (NIL == content_mt)) {
            thread.resetMultipleValues();
            final SubLObject v_linkage_$19 = learning_reader.l2r_assert_linkage_for_peg(sentence_peg);
            final SubLObject content_mt_$20 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_linkage = v_linkage_$19;
            content_mt = content_mt_$20;
        }
        return values(v_linkage, content_mt);
    }

    public static final SubLObject l2r_find_linkage_for_peg_alt(SubLObject sentence_peg) {
        SubLTrampolineFile.checkType(sentence_peg, INDEXED_TERM_P);
        {
            SubLObject tokenization = com.cyc.cycjava.cycl.learning_reader.l2r_find_tokenization_for_peg(sentence_peg);
            SubLObject linkage_fort = (NIL != indexed_term_p(tokenization)) ? ((SubLObject) (kb_mapping_utilities.fpred_value_in_any_mt(tokenization, $$linkageTokenization, TWO_INTEGER, ONE_INTEGER, UNPROVIDED))) : NIL;
            SubLObject content_mt = (NIL != linkage_fort) ? ((SubLObject) (linkage_assertion.content_mt_of_linkage(cycl_utilities.hl_to_el(linkage_fort)))) : NIL;
            return NIL != com.cyc.cycjava.cycl.learning_reader.l2r_tokenization_has_parse_treeP(tokenization, content_mt) ? ((SubLObject) (values(linkage_fort, content_mt))) : values(NIL, NIL);
        }
    }

    public static SubLObject l2r_find_linkage_for_peg(final SubLObject sentence_peg) {
        assert NIL != indexed_term_p(sentence_peg) : "! kb_indexing_datastructures.indexed_term_p(sentence_peg) " + ("kb_indexing_datastructures.indexed_term_p(sentence_peg) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(sentence_peg) ") + sentence_peg;
        final SubLObject tokenization = learning_reader.l2r_find_tokenization_for_peg(sentence_peg);
        final SubLObject linkage_fort = (NIL != indexed_term_p(tokenization)) ? kb_mapping_utilities.fpred_value_in_any_mt(tokenization, learning_reader.$$linkageTokenization, TWO_INTEGER, ONE_INTEGER, UNPROVIDED) : NIL;
        final SubLObject content_mt = (NIL != linkage_fort) ? linkage_assertion.content_mt_of_linkage(cycl_utilities.hl_to_el(linkage_fort)) : NIL;
        return NIL != learning_reader.l2r_tokenization_has_parse_treeP(tokenization, content_mt) ? values(linkage_fort, content_mt) : values(NIL, NIL);
    }

    public static final SubLObject l2r_assert_linkage_for_peg_alt(SubLObject sentence_peg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence_peg, INDEXED_TERM_P);
            cb_wordnet_utilities.ensure_wn_sks_registered();
            {
                SubLObject v_linkage = NIL;
                SubLObject content_mt = NIL;
                SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                try {
                    operation_communication.set_transmit_state($$$none);
                    {
                        SubLObject sentence_text = com.cyc.cycjava.cycl.learning_reader.l2r_sentence_peg_text(sentence_peg);
                        SubLObject linkage_tokenization = com.cyc.cycjava.cycl.learning_reader.l2r_new_tokenization_shell_for_peg(sentence_peg, sentence_text);
                        {
                            SubLObject _prev_bind_0 = parsing_vars.$linkage_creation_rules$.currentBinding(thread);
                            try {
                                parsing_vars.$linkage_creation_rules$.bind(com.cyc.cycjava.cycl.learning_reader.l2r_linkage_creation_rules(), thread);
                                {
                                    SubLObject link_parse_options = putf(copy_list(linkage.$link_parse_options$.getDynamicValue(thread)), $MAX_PARSE_TIME, $int$180);
                                    format(T, $str_alt198$__Asserting_linkage_for__S___S___, sentence_peg, sentence_text);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject v_linkage_20 = linkage_assertion.assert_linkage(sentence_text, NIL, NIL, linkage_tokenization, link_parse_options);
                                        SubLObject content_mt_21 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        v_linkage = v_linkage_20;
                                        content_mt = content_mt_21;
                                    }
                                }
                            } finally {
                                parsing_vars.$linkage_creation_rules$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            operation_communication.set_transmit_state(old_transmit_state);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return values(v_linkage, content_mt);
            }
        }
    }

    public static SubLObject l2r_assert_linkage_for_peg(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(sentence_peg) : "! kb_indexing_datastructures.indexed_term_p(sentence_peg) " + ("kb_indexing_datastructures.indexed_term_p(sentence_peg) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(sentence_peg) ") + sentence_peg;
        ensure_wn_sks_registered();
        SubLObject v_linkage = NIL;
        SubLObject content_mt = NIL;
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(learning_reader.$$$none);
            final SubLObject sentence_text = learning_reader.l2r_sentence_peg_text(sentence_peg);
            final SubLObject linkage_tokenization = learning_reader.l2r_new_tokenization_shell_for_peg(sentence_peg, sentence_text);
            final SubLObject _prev_bind_0 = parsing_vars.$linkage_creation_rules$.currentBinding(thread);
            try {
                parsing_vars.$linkage_creation_rules$.bind(learning_reader.l2r_linkage_creation_rules(), thread);
                final SubLObject link_parse_options = putf(copy_list(linkage.$link_parse_options$.getDynamicValue(thread)), learning_reader.$MAX_PARSE_TIME, learning_reader.$int$180);
                format(T, learning_reader.$str205$__Asserting_linkage_for__S___S___, sentence_peg, sentence_text);
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

    public static final SubLObject l2r_assert_parse_tree_for_linkage_alt(SubLObject v_linkage, SubLObject tokenization, SubLObject content_mt) {
        return linkage_assertion.assert_link_parse_tree(v_linkage, tokenization, content_mt);
    }

    public static SubLObject l2r_assert_parse_tree_for_linkage(final SubLObject v_linkage, final SubLObject tokenization, final SubLObject content_mt) {
        return linkage_assertion.assert_link_parse_tree(v_linkage, tokenization, content_mt);
    }

    public static final SubLObject l2r_linkage_creation_rules_alt() {
        return forward.creation_template_allowable_rules($$L2RLinkageReificationTemplate);
    }

    public static SubLObject l2r_linkage_creation_rules() {
        return creation_template_allowable_rules(learning_reader.$$L2RLinkageReificationTemplate);
    }

    public static final SubLObject l2r_new_tokenization_shell_for_peg_alt(SubLObject sentence_peg, SubLObject sentence_text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tokenization = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
                        tokenization = com.cyc.cycjava.cycl.learning_reader.l2r_create($$$Tokenization);
                        com.cyc.cycjava.cycl.learning_reader.l2r_assert(listS($$isa, tokenization, $list_alt201), $$UniversalVocabularyMt);
                        com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$tokenizationInputString, tokenization, sentence_text), UNPROVIDED);
                        com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$pegTokenizations, sentence_peg, tokenization), list($$ContentModelForPegFn, sentence_peg));
                    } finally {
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                    }
                }
                return tokenization;
            }
        }
    }

    public static SubLObject l2r_new_tokenization_shell_for_peg(final SubLObject sentence_peg, final SubLObject sentence_text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokenization = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
            tokenization = learning_reader.l2r_create(learning_reader.$$$Tokenization);
            learning_reader.l2r_assert(listS(learning_reader.$$isa, tokenization, learning_reader.$list208), learning_reader.$$UniversalVocabularyMt);
            learning_reader.l2r_assert(list(learning_reader.$$tokenizationInputString, tokenization, sentence_text), UNPROVIDED);
            learning_reader.l2r_assert(list(learning_reader.$$pegTokenizations, sentence_peg, tokenization), list(learning_reader.$$ContentModelForPegFn, sentence_peg));
        } finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return tokenization;
    }

    public static final SubLObject l2r_find_tokenization_for_peg_alt(SubLObject sentence_peg) {
        return ask_utilities.query_variable($sym205$_TOKENIZATION, listS($$pegTokenizations, sentence_peg, $list_alt206), list($$ContentModelForPegFn, sentence_peg), UNPROVIDED).first();
    }

    public static SubLObject l2r_find_tokenization_for_peg(final SubLObject sentence_peg) {
        return ask_utilities.query_variable(learning_reader.$sym212$_TOKENIZATION, listS(learning_reader.$$pegTokenizations, sentence_peg, learning_reader.$list213), list(learning_reader.$$ContentModelForPegFn, sentence_peg), UNPROVIDED).first();
    }

    public static final SubLObject l2r_sentence_peg_text_alt(SubLObject sentence_peg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject text = parsing_utilities.peg_text(sentence_peg);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == unicode_nauts.string_or_unicode_naut_p(text)) {
                        Errors.error($str_alt207$Couldn_t_find_string_for__S, sentence_peg);
                    }
                }
                return text;
            }
        }
    }

    public static SubLObject l2r_sentence_peg_text(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject text = parsing_utilities.peg_text(sentence_peg);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == unicode_nauts.string_or_unicode_naut_p(text))) {
            Errors.error(learning_reader.$str214$Couldn_t_find_string_for__S, sentence_peg);
        }
        return text;
    }

    public static final SubLObject l2r_reader_image_find_or_create_document_reader_alt() {
        {
            SubLObject document_reader = com.cyc.cycjava.cycl.learning_reader.get_l2r_reader_image_document_reader();
            if (NIL == com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_p(document_reader)) {
                {
                    SubLObject v_document = com.cyc.cycjava.cycl.learning_reader.l2r_pick_document_to_read();
                    if (NIL == cycl_denotational_term_p(v_document)) {
                        Errors.warn($str_alt208$Couldn_t_find_L2R_document_to_rea);
                        return NIL;
                    }
                    document_reader = com.cyc.cycjava.cycl.learning_reader.l2r_new_reader_for_document(v_document);
                }
            }
            return document_reader;
        }
    }

    public static SubLObject l2r_reader_image_find_or_create_document_reader() {
        SubLObject document_reader = learning_reader.get_l2r_reader_image_document_reader();
        if (NIL == learning_reader.l2r_document_reader_p(document_reader)) {
            final SubLObject v_document = learning_reader.l2r_pick_document_to_read();
            if (NIL == cycl_grammar.cycl_denotational_term_p(v_document)) {
                Errors.warn(learning_reader.$str215$Couldn_t_find_L2R_document_to_rea);
                return NIL;
            }
            document_reader = learning_reader.l2r_new_reader_for_document(v_document);
        }
        return document_reader;
    }

    public static final SubLObject l2r_new_reader_for_document_alt(SubLObject v_document) {
        SubLTrampolineFile.checkType(v_document, CYCL_DENOTATIONAL_TERM_P);
        {
            SubLObject existing_reading_event = com.cyc.cycjava.cycl.learning_reader.find_unfinished_l2r_reading_event_for_document(v_document);
            SubLObject reading_event = (NIL != existing_reading_event) ? ((SubLObject) (existing_reading_event)) : com.cyc.cycjava.cycl.learning_reader.new_l2r_reading_event_for_document(v_document);
            SubLObject document_reader = com.cyc.cycjava.cycl.learning_reader.new_l2r_document_reader(v_document, reading_event);
            return document_reader;
        }
    }

    public static SubLObject l2r_new_reader_for_document(final SubLObject v_document) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "! cycl_grammar.cycl_denotational_term_p(v_document) " + ("cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) ") + v_document;
        final SubLObject existing_reading_event = learning_reader.find_unfinished_l2r_reading_event_for_document(v_document);
        final SubLObject reading_event = (NIL != existing_reading_event) ? existing_reading_event : learning_reader.new_l2r_reading_event_for_document(v_document);
        final SubLObject document_reader = learning_reader.new_l2r_document_reader(v_document, reading_event);
        return document_reader;
    }

    public static final SubLObject l2r_document_reader_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.learning_reader.print_l2r_document_reader(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject l2r_document_reader_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        learning_reader.print_l2r_document_reader(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject l2r_document_reader_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.learning_reader.$l2r_document_reader_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject l2r_document_reader_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.learning_reader.$l2r_document_reader_native.class ? T : NIL;
    }

    public static final SubLObject l2r_document_reader_document_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_DOCUMENT_READER_P);
        return v_object.getField2();
    }

    public static SubLObject l2r_document_reader_document(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_document_reader_p(v_object) : "! learning_reader.l2r_document_reader_p(v_object) " + "learning_reader.l2r_document_reader_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject l2r_document_reader_remaining_paragraphs_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_DOCUMENT_READER_P);
        return v_object.getField3();
    }

    public static SubLObject l2r_document_reader_remaining_paragraphs(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_document_reader_p(v_object) : "! learning_reader.l2r_document_reader_p(v_object) " + "learning_reader.l2r_document_reader_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject l2r_document_reader_read_paragraphs_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_DOCUMENT_READER_P);
        return v_object.getField4();
    }

    public static SubLObject l2r_document_reader_read_paragraphs(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_document_reader_p(v_object) : "! learning_reader.l2r_document_reader_p(v_object) " + "learning_reader.l2r_document_reader_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject l2r_document_reader_paragraph_reader_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_DOCUMENT_READER_P);
        return v_object.getField5();
    }

    public static SubLObject l2r_document_reader_paragraph_reader(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_document_reader_p(v_object) : "! learning_reader.l2r_document_reader_p(v_object) " + "learning_reader.l2r_document_reader_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject l2r_document_reader_reading_event_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, L2R_DOCUMENT_READER_P);
        return v_object.getField6();
    }

    public static SubLObject l2r_document_reader_reading_event(final SubLObject v_object) {
        assert NIL != learning_reader.l2r_document_reader_p(v_object) : "! learning_reader.l2r_document_reader_p(v_object) " + "learning_reader.l2r_document_reader_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_l2r_document_reader_document_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_DOCUMENT_READER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_l2r_document_reader_document(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_document_reader_p(v_object) : "! learning_reader.l2r_document_reader_p(v_object) " + "learning_reader.l2r_document_reader_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_l2r_document_reader_remaining_paragraphs_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_DOCUMENT_READER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_l2r_document_reader_remaining_paragraphs(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_document_reader_p(v_object) : "! learning_reader.l2r_document_reader_p(v_object) " + "learning_reader.l2r_document_reader_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_l2r_document_reader_read_paragraphs_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_DOCUMENT_READER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_l2r_document_reader_read_paragraphs(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_document_reader_p(v_object) : "! learning_reader.l2r_document_reader_p(v_object) " + "learning_reader.l2r_document_reader_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_l2r_document_reader_paragraph_reader_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_DOCUMENT_READER_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_l2r_document_reader_paragraph_reader(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_document_reader_p(v_object) : "! learning_reader.l2r_document_reader_p(v_object) " + "learning_reader.l2r_document_reader_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_l2r_document_reader_reading_event_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, L2R_DOCUMENT_READER_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_l2r_document_reader_reading_event(final SubLObject v_object, final SubLObject value) {
        assert NIL != learning_reader.l2r_document_reader_p(v_object) : "! learning_reader.l2r_document_reader_p(v_object) " + "learning_reader.l2r_document_reader_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_l2r_document_reader_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.learning_reader.$l2r_document_reader_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($DOCUMENT)) {
                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_document_reader_document(v_new, current_value);
                    } else {
                        if (pcase_var.eql($REMAINING_PARAGRAPHS)) {
                            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_document_reader_remaining_paragraphs(v_new, current_value);
                        } else {
                            if (pcase_var.eql($READ_PARAGRAPHS)) {
                                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_document_reader_read_paragraphs(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PARAGRAPH_READER)) {
                                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_document_reader_paragraph_reader(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($READING_EVENT)) {
                                        com.cyc.cycjava.cycl.learning_reader._csetf_l2r_document_reader_reading_event(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt84$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_l2r_document_reader(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.learning_reader.$l2r_document_reader_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($DOCUMENT)) {
                learning_reader._csetf_l2r_document_reader_document(v_new, current_value);
            } else
                if (pcase_var.eql($REMAINING_PARAGRAPHS)) {
                    learning_reader._csetf_l2r_document_reader_remaining_paragraphs(v_new, current_value);
                } else
                    if (pcase_var.eql($READ_PARAGRAPHS)) {
                        learning_reader._csetf_l2r_document_reader_read_paragraphs(v_new, current_value);
                    } else
                        if (pcase_var.eql($PARAGRAPH_READER)) {
                            learning_reader._csetf_l2r_document_reader_paragraph_reader(v_new, current_value);
                        } else
                            if (pcase_var.eql($READING_EVENT)) {
                                learning_reader._csetf_l2r_document_reader_reading_event(v_new, current_value);
                            } else {
                                Errors.error(learning_reader.$str86$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_l2r_document_reader(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, learning_reader.MAKE_L2R_DOCUMENT_READER, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $DOCUMENT, learning_reader.l2r_document_reader_document(obj));
        funcall(visitor_fn, obj, $SLOT, $REMAINING_PARAGRAPHS, learning_reader.l2r_document_reader_remaining_paragraphs(obj));
        funcall(visitor_fn, obj, $SLOT, $READ_PARAGRAPHS, learning_reader.l2r_document_reader_read_paragraphs(obj));
        funcall(visitor_fn, obj, $SLOT, $PARAGRAPH_READER, learning_reader.l2r_document_reader_paragraph_reader(obj));
        funcall(visitor_fn, obj, $SLOT, $READING_EVENT, learning_reader.l2r_document_reader_reading_event(obj));
        funcall(visitor_fn, obj, $END, learning_reader.MAKE_L2R_DOCUMENT_READER, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_l2r_document_reader_method(final SubLObject obj, final SubLObject visitor_fn) {
        return learning_reader.visit_defstruct_l2r_document_reader(obj, visitor_fn);
    }

    public static final SubLObject print_l2r_document_reader_alt(SubLObject reader, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt231$_L2R_DOCUMENT_READER__S_, com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_document(reader));
        return NIL;
    }

    public static SubLObject print_l2r_document_reader(final SubLObject reader, final SubLObject stream, final SubLObject depth) {
        format(stream, learning_reader.$str241$_L2R_DOCUMENT_READER__S_, learning_reader.l2r_document_reader_document(reader));
        return NIL;
    }

    public static final SubLObject new_l2r_document_reader_alt(SubLObject v_document, SubLObject reading_event) {
        {
            SubLObject reader = com.cyc.cycjava.cycl.learning_reader.make_l2r_document_reader(UNPROVIDED);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_document_reader_document(reader, v_document);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_document_reader_reading_event(reader, reading_event);
            com.cyc.cycjava.cycl.learning_reader._csetf_l2r_document_reader_remaining_paragraphs(reader, com.cyc.cycjava.cycl.learning_reader.l2r_find_or_create_document_paragraphs(v_document, UNPROVIDED));
            return reader;
        }
    }

    public static SubLObject new_l2r_document_reader(final SubLObject v_document, final SubLObject reading_event) {
        final SubLObject reader = learning_reader.make_l2r_document_reader(UNPROVIDED);
        learning_reader._csetf_l2r_document_reader_document(reader, v_document);
        learning_reader._csetf_l2r_document_reader_reading_event(reader, reading_event);
        learning_reader._csetf_l2r_document_reader_remaining_paragraphs(reader, learning_reader.l2r_find_or_create_document_paragraphs(v_document, UNPROVIDED));
        return reader;
    }

    public static final SubLObject get_l2r_reader_image_document_reader_alt() {
        return $l2r_reader_image_document_reader$.getGlobalValue();
    }

    public static SubLObject get_l2r_reader_image_document_reader() {
        return learning_reader.$l2r_reader_image_document_reader$.getGlobalValue();
    }

    public static final SubLObject set_l2r_reader_image_document_reader_alt(SubLObject reader) {
        $l2r_reader_image_document_reader$.setGlobalValue(reader);
        return $l2r_reader_image_document_reader$.getGlobalValue();
    }

    public static SubLObject set_l2r_reader_image_document_reader(final SubLObject reader) {
        learning_reader.$l2r_reader_image_document_reader$.setGlobalValue(reader);
        return learning_reader.$l2r_reader_image_document_reader$.getGlobalValue();
    }

    public static final SubLObject l2r_document_reader_read_document_alt(SubLObject document_reader) {
        {
            SubLObject paragraph_reader = com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_find_or_create_paragraph_reader(document_reader);
            SubLObject reading_event = com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_reading_event(document_reader);
            SubLObject v_document = com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_document(document_reader);
            while (NIL != com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_p(paragraph_reader)) {
                {
                    SubLObject paragraph = com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_paragraph(paragraph_reader);
                    com.cyc.cycjava.cycl.learning_reader.l2r_read_paragraph_internal(paragraph, v_document, reading_event, paragraph_reader);
                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_document_reader_read_paragraphs(document_reader, cons(paragraph, com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_read_paragraphs(document_reader)));
                }
                com.cyc.cycjava.cycl.learning_reader._csetf_l2r_document_reader_remaining_paragraphs(document_reader, com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_remaining_paragraphs(document_reader).rest());
                paragraph_reader = com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_get_new_paragraph_reader(document_reader);
            } 
            com.cyc.cycjava.cycl.learning_reader.set_l2r_reader_image_document_reader(NIL);
            com.cyc.cycjava.cycl.learning_reader.write_l2r_image_for_document(v_document, T);
            return document_reader;
        }
    }

    public static SubLObject l2r_document_reader_read_document(final SubLObject document_reader) {
        SubLObject paragraph_reader = learning_reader.l2r_document_reader_find_or_create_paragraph_reader(document_reader);
        final SubLObject reading_event = learning_reader.l2r_document_reader_reading_event(document_reader);
        final SubLObject v_document = learning_reader.l2r_document_reader_document(document_reader);
        while (NIL != learning_reader.l2r_paragraph_reader_p(paragraph_reader)) {
            final SubLObject paragraph = learning_reader.l2r_paragraph_reader_paragraph(paragraph_reader);
            learning_reader.l2r_read_paragraph_internal(paragraph, v_document, reading_event, paragraph_reader);
            learning_reader._csetf_l2r_document_reader_read_paragraphs(document_reader, cons(paragraph, learning_reader.l2r_document_reader_read_paragraphs(document_reader)));
            learning_reader._csetf_l2r_document_reader_remaining_paragraphs(document_reader, learning_reader.l2r_document_reader_remaining_paragraphs(document_reader).rest());
            paragraph_reader = learning_reader.l2r_document_reader_get_new_paragraph_reader(document_reader);
        } 
        learning_reader.set_l2r_reader_image_document_reader(NIL);
        learning_reader.write_l2r_image_for_document(v_document, T);
        return document_reader;
    }

    public static final SubLObject l2r_document_reader_find_or_create_paragraph_reader_alt(SubLObject document_reader) {
        {
            SubLObject paragraph_reader = com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_paragraph_reader(document_reader);
            if (NIL == com.cyc.cycjava.cycl.learning_reader.l2r_paragraph_reader_p(paragraph_reader)) {
                paragraph_reader = com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_get_new_paragraph_reader(document_reader);
            }
            return paragraph_reader;
        }
    }

    public static SubLObject l2r_document_reader_find_or_create_paragraph_reader(final SubLObject document_reader) {
        SubLObject paragraph_reader = learning_reader.l2r_document_reader_paragraph_reader(document_reader);
        if (NIL == learning_reader.l2r_paragraph_reader_p(paragraph_reader)) {
            paragraph_reader = learning_reader.l2r_document_reader_get_new_paragraph_reader(document_reader);
        }
        return paragraph_reader;
    }

    public static final SubLObject l2r_document_reader_get_new_paragraph_reader_alt(SubLObject document_reader) {
        {
            SubLObject paragraph_reader = NIL;
            SubLObject remaining_paragraphs = com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_remaining_paragraphs(document_reader);
            if (NIL == list_utilities.empty_list_p(remaining_paragraphs)) {
                {
                    SubLObject paragraph = remaining_paragraphs.first();
                    SubLObject v_document = com.cyc.cycjava.cycl.learning_reader.l2r_document_reader_document(document_reader);
                    paragraph_reader = com.cyc.cycjava.cycl.learning_reader.new_l2r_paragraph_reader(paragraph, v_document);
                    com.cyc.cycjava.cycl.learning_reader._csetf_l2r_document_reader_paragraph_reader(document_reader, paragraph_reader);
                }
            }
            return paragraph_reader;
        }
    }

    public static SubLObject l2r_document_reader_get_new_paragraph_reader(final SubLObject document_reader) {
        SubLObject paragraph_reader = NIL;
        final SubLObject remaining_paragraphs = learning_reader.l2r_document_reader_remaining_paragraphs(document_reader);
        if (NIL == list_utilities.empty_list_p(remaining_paragraphs)) {
            final SubLObject paragraph = remaining_paragraphs.first();
            final SubLObject v_document = learning_reader.l2r_document_reader_document(document_reader);
            paragraph_reader = learning_reader.new_l2r_paragraph_reader(paragraph, v_document);
            learning_reader._csetf_l2r_document_reader_paragraph_reader(document_reader, paragraph_reader);
        }
        return paragraph_reader;
    }

    public static final SubLObject l2r_pick_document_to_read_alt() {
        {
            SubLObject all_articles = kb_query.new_cyc_query_from_kbq($const233$TextLearnerQuery_FindWikipediaArt, UNPROVIDED);
            SubLObject articles_already_started = list_utilities.find_all_if(FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT, all_articles, UNPROVIDED);
            SubLObject picked_document = (NIL != list_utilities.non_empty_list_p(articles_already_started)) ? ((SubLObject) (list_utilities.extremal(articles_already_started, $sym235$STARTS_BEFORE_STARTING_OF_, FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT))) : all_articles.first();
            return picked_document;
        }
    }

    public static SubLObject l2r_pick_document_to_read() {
        final SubLObject all_articles = kb_query.new_cyc_query_from_kbq(learning_reader.$const243$TextLearnerQuery_FindWikipediaArt, UNPROVIDED, UNPROVIDED);
        final SubLObject articles_already_started = list_utilities.find_all_if(learning_reader.FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT, all_articles, UNPROVIDED);
        final SubLObject picked_document = (NIL != list_utilities.non_empty_list_p(articles_already_started)) ? list_utilities.extremal(articles_already_started, learning_reader.$sym245$STARTS_BEFORE_STARTING_OF_, learning_reader.FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT) : all_articles.first();
        return picked_document;
    }

    public static final SubLObject starts_before_starting_ofP_alt(SubLObject temp_thing1, SubLObject temp_thing2) {
        return sbhl_time_modules.starts_after_starting_ofP(temp_thing2, temp_thing1, UNPROVIDED);
    }

    public static SubLObject starts_before_starting_ofP(final SubLObject temp_thing1, final SubLObject temp_thing2) {
        return sbhl_time_modules.starts_after_starting_ofP(temp_thing2, temp_thing1, UNPROVIDED);
    }

    public static final SubLObject l2r_image_file_alt(SubLObject v_document, SubLObject doneP) {
        if (doneP == UNPROVIDED) {
            doneP = NIL;
        }
        {
            SubLObject machine_name = misc_utilities.machine_name();
            SubLObject directory = cconcatenate($str_alt236$_host_, new SubLObject[]{ format_nil.format_nil_a_no_copy(machine_name), $str_alt237$_scratch_ });
            SubLTrampolineFile.checkType(directory, DIRECTORY_P);
            {
                SubLObject parent_directory = file_utilities.relative_filename(directory, $str_alt239$l2r_images_, UNPROVIDED);
                SubLObject subdirectory = file_utilities.relative_filename(parent_directory, NIL != doneP ? ((SubLObject) ($str_alt240$done_)) : $str_alt241$ongoing_, UNPROVIDED);
                if (NIL == Filesys.directory_p(subdirectory)) {
                    file_utilities.make_directory_recursive(subdirectory, NIL, UNPROVIDED);
                }
                if (NIL == Filesys.directory_p(subdirectory)) {
                    sleep(ONE_INTEGER);
                    SubLTrampolineFile.checkType(subdirectory, DIRECTORY_P);
                }
                {
                    SubLObject document_title = kb_mapping_utilities.fpred_value_in_any_mt(v_document, $$referenceWorkEntryTitle, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject local_filename = Strings.string_downcase(document_title.isString() ? ((SubLObject) (list_utilities.remove_if_not(ALPHA_CHAR_P, document_title, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL != constant_p(v_document) ? ((SubLObject) (constants_high.constant_name(v_document))) : list_utilities.remove_if_not(ALPHA_CHAR_P, princ_to_string(v_document), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    return file_utilities.relative_filename(subdirectory, local_filename, $$$load);
                }
            }
        }
    }

    public static SubLObject l2r_image_file(final SubLObject v_document, SubLObject doneP) {
        if (doneP == UNPROVIDED) {
            doneP = NIL;
        }
        final SubLObject machine_name = misc_utilities.machine_name();
        final SubLObject directory = cconcatenate(learning_reader.$str246$_host_, new SubLObject[]{ format_nil.format_nil_a_no_copy(machine_name), learning_reader.$str247$_scratch_ });
        assert NIL != Filesys.directory_p(directory) : "! Filesys.directory_p(directory) " + ("Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) ") + directory;
        final SubLObject parent_directory = file_utilities.relative_filename(directory, learning_reader.$str249$l2r_images_, UNPROVIDED);
        final SubLObject subdirectory = file_utilities.relative_filename(parent_directory, NIL != doneP ? learning_reader.$str250$done_ : learning_reader.$str251$ongoing_, UNPROVIDED);
        if (NIL == Filesys.directory_p(subdirectory)) {
            file_utilities.make_directory_recursive(subdirectory, NIL, UNPROVIDED);
        }
        if (NIL == Filesys.directory_p(subdirectory)) {
            sleep(ONE_INTEGER);
            assert NIL != Filesys.directory_p(subdirectory) : "! Filesys.directory_p(subdirectory) " + ("Filesys.directory_p(subdirectory) " + "CommonSymbols.NIL != Filesys.directory_p(subdirectory) ") + subdirectory;
        }
        final SubLObject document_title = kb_mapping_utilities.fpred_value_in_any_mt(v_document, learning_reader.$$referenceWorkEntryTitle, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject local_filename = Strings.string_downcase(document_title.isString() ? list_utilities.remove_if_not(ALPHA_CHAR_P, document_title, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL != constant_p(v_document) ? constants_high.constant_name(v_document) : list_utilities.remove_if_not(ALPHA_CHAR_P, princ_to_string(v_document), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        return file_utilities.relative_filename(subdirectory, local_filename, learning_reader.$$$load);
    }

    public static final SubLObject write_l2r_image_for_document_alt(SubLObject v_document, SubLObject doneP) {
        if (doneP == UNPROVIDED) {
            doneP = NIL;
        }
        {
            SubLObject image_file = com.cyc.cycjava.cycl.learning_reader.l2r_image_file(v_document, doneP);
            SubLObject communication_mode = operation_communication.communication_mode();
            operation_communication.write_cyc_image(image_file, UNPROVIDED);
            operation_communication.set_communication_mode(communication_mode);
            agenda.restart_agenda(UNPROVIDED);
            format(T, $str_alt245$Saved_image_file_to__S, image_file);
            return image_file;
        }
    }

    public static SubLObject write_l2r_image_for_document(final SubLObject v_document, SubLObject doneP) {
        if (doneP == UNPROVIDED) {
            doneP = NIL;
        }
        final SubLObject image_file = learning_reader.l2r_image_file(v_document, doneP);
        final SubLObject communication_mode = operation_communication.communication_mode();
        operation_communication.write_cyc_image(image_file, UNPROVIDED);
        operation_communication.set_communication_mode(communication_mode);
        agenda.restart_agenda(UNPROVIDED);
        format(T, learning_reader.$str255$Saved_image_file_to__S, image_file);
        return image_file;
    }

    public static final SubLObject l2r_find_or_create_document_paragraphs_alt(SubLObject v_document, SubLObject download) {
        if (download == UNPROVIDED) {
            download = NIL;
        }
        {
            SubLObject ais = ask_utilities.query_variable($sym246$_AIS, listS($$correspondingAIS, v_document, $list_alt248), $$InferencePSC, $list_alt249).first();
            SubLObject webpageP = isa.isa_in_any_mtP(v_document, $$WorldWideWebPage_PCW);
            if ((NIL != webpageP) && (NIL == ais)) {
                com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$retainTerm, list($$AISForFn, v_document)), UNPROVIDED);
                ais = narts_high.find_nart(list($$AISForFn, v_document));
            }
            if ((NIL != ais) && (NIL != webpageP)) {
                return com.cyc.cycjava.cycl.learning_reader.l2r_find_or_create_webpage_paragraphs(v_document, ais, download);
            } else {
                Errors.warn($str_alt253$Don_t_know_how_to_read__S_, v_document);
                return NIL;
            }
        }
    }

    public static SubLObject l2r_find_or_create_document_paragraphs(final SubLObject v_document, SubLObject download) {
        if (download == UNPROVIDED) {
            download = NIL;
        }
        SubLObject ais = ask_utilities.query_variable(learning_reader.$sym256$_AIS, listS(learning_reader.$$correspondingAIS, v_document, learning_reader.$list258), learning_reader.$$InferencePSC, learning_reader.$list259).first();
        final SubLObject webpageP = isa.isa_in_any_mtP(v_document, learning_reader.$$WorldWideWebPage_PCW);
        if ((NIL != webpageP) && (NIL == ais)) {
            learning_reader.l2r_assert(learning_reader.$list261, UNPROVIDED);
            ais = narts_high.find_nart(list(learning_reader.$$AISForFn, v_document));
        }
        if ((NIL != ais) && (NIL != webpageP)) {
            return learning_reader.l2r_find_or_create_webpage_paragraphs(v_document, ais, download);
        }
        Errors.warn(learning_reader.$str263$Don_t_know_how_to_read__S_, v_document);
        return NIL;
    }

    public static final SubLObject l2r_find_or_create_webpage_paragraphs_alt(SubLObject webpage_pcw, SubLObject ais, SubLObject download) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == download) {
                download = com.cyc.cycjava.cycl.learning_reader.l2r_most_recent_webpage_download(ais);
            }
            {
                SubLObject already_downloadedP = list_utilities.sublisp_boolean(download);
                SubLObject interpretation_mt = narts_high.nart_substitute(list($$InterpretingDocumentMtFn, webpage_pcw));
                SubLObject paragraphs = NIL;
                SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                try {
                    operation_communication.set_transmit_state(NIL != $l2r_transmit_operationsP$.getDynamicValue(thread) ? ((SubLObject) ($$$transmit)) : $$$store);
                    if (NIL == nart_handles.nart_p(interpretation_mt)) {
                        com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$retainTerm, interpretation_mt), UNPROVIDED);
                        interpretation_mt = narts_high.find_nart(interpretation_mt);
                    }
                    SubLTrampolineFile.checkType(interpretation_mt, NART_P);
                    if (NIL == download) {
                        download = com.cyc.cycjava.cycl.learning_reader.l2r_download_webpage(ais);
                    }
                    paragraphs = (NIL != already_downloadedP) ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_find_webpage_paragraphs(ais, download, interpretation_mt))) : NIL;
                    if (NIL != list_utilities.empty_list_p(paragraphs)) {
                        paragraphs = com.cyc.cycjava.cycl.learning_reader.l2r_reify_webpage_paragraphs(ais, download, interpretation_mt);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            operation_communication.set_transmit_state(old_transmit_state);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return paragraphs;
            }
        }
    }

    public static SubLObject l2r_find_or_create_webpage_paragraphs(final SubLObject webpage_pcw, final SubLObject ais, SubLObject download) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == download) {
            download = learning_reader.l2r_most_recent_webpage_download(ais);
        }
        final SubLObject already_downloadedP = list_utilities.sublisp_boolean(download);
        SubLObject interpretation_mt = narts_high.nart_substitute(list(learning_reader.$$InterpretingDocumentMtFn, webpage_pcw));
        SubLObject paragraphs = NIL;
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(NIL != learning_reader.$l2r_transmit_operationsP$.getDynamicValue(thread) ? learning_reader.$$$transmit : learning_reader.$$$store);
            if (NIL == nart_handles.nart_p(interpretation_mt)) {
                learning_reader.l2r_assert(list(learning_reader.$$retainTerm, interpretation_mt), UNPROVIDED);
                interpretation_mt = narts_high.find_nart(interpretation_mt);
            }
            assert NIL != nart_handles.nart_p(interpretation_mt) : "! nart_handles.nart_p(interpretation_mt) " + ("nart_handles.nart_p(interpretation_mt) " + "CommonSymbols.NIL != nart_handles.nart_p(interpretation_mt) ") + interpretation_mt;
            if (NIL == download) {
                download = learning_reader.l2r_download_webpage(ais);
            }
            paragraphs = (NIL != already_downloadedP) ? learning_reader.l2r_find_webpage_paragraphs(ais, download, interpretation_mt) : NIL;
            if (NIL != list_utilities.empty_list_p(paragraphs)) {
                paragraphs = learning_reader.l2r_reify_webpage_paragraphs(ais, download, interpretation_mt);
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

    /**
     * Create a new reified event of downloading the source HTML of WEBPAGE-AIS.
     */
    @LispMethod(comment = "Create a new reified event of downloading the source HTML of WEBPAGE-AIS.")
    public static final SubLObject l2r_download_webpage_alt(SubLObject webpage_ais) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(webpage_ais, FORT_P);
            {
                SubLObject existing = com.cyc.cycjava.cycl.learning_reader.l2r_most_recent_webpage_download(webpage_ais);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL != existing) {
                        Errors.error($str_alt256$_S___has_already_been_downloaded_, webpage_ais, existing);
                    }
                }
            }
            {
                SubLObject url = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, $$webPageURL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject download_time = date_utilities.indexical_now();
                SubLObject html_source = (NIL != url) ? ((SubLObject) (evaluation_defns.cyc_url_source(url))) : NIL;
                SubLObject downloading_event = (NIL != html_source) ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.l2r_create($$$WebpageDownload))) : NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == url) {
                        Errors.error($str_alt259$_S_doesn_t_have_a___webPageURL_as, webpage_ais);
                    }
                }
                if (NIL != downloading_event) {
                    com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$isa, downloading_event, list($$DownloadTypeOfAISFn, webpage_ais)), $$UniversalVocabularyMt);
                    com.cyc.cycjava.cycl.learning_reader.l2r_assert(listS($$quotedIsa, downloading_event, $list_alt262), $$UniversalVocabularyMt);
                    com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$dateOfEvent, downloading_event, download_time), $$BaseKB);
                    if (NIL == ke.cyclist_is_guest()) {
                        com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$directingAgent, downloading_event, operation_communication.the_cyclist()), $$CyclistsMt);
                    }
                    com.cyc.cycjava.cycl.learning_reader.l2r_assert(list($$transferredAIS, downloading_event, html_source), $$BaseKB);
                }
                return downloading_event;
            }
        }
    }

    /**
     * Create a new reified event of downloading the source HTML of WEBPAGE-AIS.
     */
    @LispMethod(comment = "Create a new reified event of downloading the source HTML of WEBPAGE-AIS.")
    public static SubLObject l2r_download_webpage(final SubLObject webpage_ais) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(webpage_ais) : "! forts.fort_p(webpage_ais) " + ("forts.fort_p(webpage_ais) " + "CommonSymbols.NIL != forts.fort_p(webpage_ais) ") + webpage_ais;
        final SubLObject existing = learning_reader.l2r_most_recent_webpage_download(webpage_ais);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != existing)) {
            Errors.error(learning_reader.$str267$_S___has_already_been_downloaded_, webpage_ais, existing);
        }
        final SubLObject url = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, learning_reader.$$webPageURL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject download_time = date_utilities.indexical_now();
        final SubLObject html_source = (NIL != url) ? evaluation_defns.cyc_url_source(url) : NIL;
        final SubLObject downloading_event = (NIL != html_source) ? learning_reader.l2r_create(learning_reader.$$$WebpageDownload) : NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == url)) {
            Errors.error(learning_reader.$str270$_S_doesn_t_have_a___webPageURL_as, webpage_ais);
        }
        if (NIL != downloading_event) {
            learning_reader.l2r_assert(list(learning_reader.$$isa, downloading_event, list(learning_reader.$$DownloadTypeOfAISFn, webpage_ais)), learning_reader.$$UniversalVocabularyMt);
            learning_reader.l2r_assert(list(learning_reader.$$dateOfEvent, downloading_event, download_time), learning_reader.$$BaseKB);
            if (NIL == ke.cyclist_is_guest()) {
                learning_reader.l2r_assert(list(learning_reader.$$directingAgent, downloading_event, operation_communication.the_cyclist()), learning_reader.$$CyclistsMt);
            }
            learning_reader.l2r_assert(list(learning_reader.$$transferredAIS, downloading_event, html_source), learning_reader.$$BaseKB);
        }
        return downloading_event;
    }

    public static final SubLObject l2r_most_recent_webpage_download_alt(SubLObject webpage_ais) {
        {
            SubLObject download_type = narts_high.find_nart(list($$DownloadTypeOfAISFn, webpage_ais));
            SubLObject all_downloads = (NIL != download_type) ? ((SubLObject) (isa.all_fort_instances_in_all_mts(download_type))) : NIL;
            SubLObject most_recent_date = NIL;
            SubLObject most_recent_download = NIL;
            SubLObject cdolist_list_var = all_downloads;
            SubLObject download = NIL;
            for (download = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , download = cdolist_list_var.first()) {
                {
                    SubLObject this_download_date = kb_mapping_utilities.fpred_value_in_any_mt(download, $$dateOfEvent, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                    if ((NIL == most_recent_download) || (NIL == most_recent_date)) {
                        most_recent_download = download;
                        most_recent_date = this_download_date;
                    } else {
                        if ((NIL != this_download_date) && (NIL != date_utilities.dateL(most_recent_date, this_download_date))) {
                            most_recent_download = download;
                            most_recent_date = this_download_date;
                        }
                    }
                }
            }
            return values(most_recent_download, most_recent_date);
        }
    }

    public static SubLObject l2r_most_recent_webpage_download(final SubLObject webpage_ais) {
        final SubLObject download_type = narts_high.find_nart(list(learning_reader.$$DownloadTypeOfAISFn, webpage_ais));
        final SubLObject all_downloads = (NIL != download_type) ? isa.all_fort_instances_in_all_mts(download_type) : NIL;
        SubLObject most_recent_date = NIL;
        SubLObject most_recent_download = NIL;
        SubLObject cdolist_list_var = all_downloads;
        SubLObject download = NIL;
        download = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject this_download_date = kb_mapping_utilities.fpred_value_in_any_mt(download, learning_reader.$$dateOfEvent, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
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

    public static final SubLObject l2r_find_webpage_paragraphs_alt(SubLObject webpage_ais, SubLObject download, SubLObject mt) {
        if (download == UNPROVIDED) {
            download = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(webpage_ais, FORT_P);
        if (NIL == download) {
            download = com.cyc.cycjava.cycl.learning_reader.l2r_most_recent_webpage_download(webpage_ais);
        }
        {
            SubLObject paragraphs = NIL;
            if (NIL != download) {
                if (NIL == mt) {
                    {
                        SubLObject v_document = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, $$correspondingAIS, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                        SubLTrampolineFile.checkType(v_document, FORT_P);
                        mt = narts_high.find_nart(list($$InterpretingDocumentMtFn, v_document));
                        SubLTrampolineFile.checkType(mt, NART_P);
                    }
                }
                {
                    SubLObject data = ask_utilities.query_template($list_alt267, list($const268$nthOccurrenceOfStructureTypeInStr, $sym269$_PARAGRAPH, $sym270$_N, $$NLParagraph, webpage_ais), mt, $list_alt272);
                    paragraphs = Mapping.mapcar(symbol_function(CAR), list_utilities.sort_alist_by_values(data, symbol_function($sym274$_)));
                }
            }
            return paragraphs;
        }
    }

    public static SubLObject l2r_find_webpage_paragraphs(final SubLObject webpage_ais, SubLObject download, SubLObject mt) {
        if (download == UNPROVIDED) {
            download = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(webpage_ais) : "! forts.fort_p(webpage_ais) " + ("forts.fort_p(webpage_ais) " + "CommonSymbols.NIL != forts.fort_p(webpage_ais) ") + webpage_ais;
        if (NIL == download) {
            download = learning_reader.l2r_most_recent_webpage_download(webpage_ais);
        }
        SubLObject paragraphs = NIL;
        if (NIL != download) {
            if (NIL == mt) {
                final SubLObject v_document = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, learning_reader.$$correspondingAIS, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                assert NIL != forts.fort_p(v_document) : "! forts.fort_p(v_document) " + ("forts.fort_p(v_document) " + "CommonSymbols.NIL != forts.fort_p(v_document) ") + v_document;
                mt = narts_high.find_nart(list(learning_reader.$$InterpretingDocumentMtFn, v_document));
                assert NIL != nart_handles.nart_p(mt) : "! nart_handles.nart_p(mt) " + ("nart_handles.nart_p(mt) " + "CommonSymbols.NIL != nart_handles.nart_p(mt) ") + mt;
            }
            final SubLObject data = ask_utilities.query_template(learning_reader.$list276, list(learning_reader.$const277$nthOccurrenceOfStructureTypeInStr, learning_reader.$sym278$_PARAGRAPH, learning_reader.$sym279$_N, learning_reader.$$NLParagraph, webpage_ais), mt, learning_reader.$list281);
            paragraphs = Mapping.mapcar(symbol_function(CAR), list_utilities.sort_alist_by_values(data, symbol_function(learning_reader.$sym283$_)));
        }
        return paragraphs;
    }

    public static final SubLObject l2r_reify_webpage_paragraphs_alt(SubLObject webpage_ais, SubLObject download, SubLObject mt) {
        if (download == UNPROVIDED) {
            download = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(webpage_ais, FORT_P);
            if (NIL == download) {
                download = com.cyc.cycjava.cycl.learning_reader.l2r_most_recent_webpage_download(webpage_ais);
            }
            if (NIL == download) {
                download = com.cyc.cycjava.cycl.learning_reader.l2r_download_webpage(webpage_ais);
            }
            {
                SubLObject source_html = com.cyc.cycjava.cycl.learning_reader.l2r_best_webpage_source(webpage_ais, download);
                SubLObject paragraphs = NIL;
                if (NIL != source_html) {
                    {
                        SubLObject paragraph_texts = com.cyc.cycjava.cycl.learning_reader.l2r_identify_webpage_paragraphs(source_html, webpage_ais);
                        if (NIL == mt) {
                            {
                                SubLObject v_document = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, $$correspondingAIS, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                SubLTrampolineFile.checkType(v_document, FORT_P);
                                mt = list($$InterpretingDocumentMtFn, v_document);
                            }
                        }
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
                                noting_percent_progress_preamble(cconcatenate($str_alt275$Reifying_paragraphs_in_, new SubLObject[]{ format_nil.format_nil_s_no_copy(webpage_ais), $str_alt276$___ }));
                                {
                                    SubLObject paragraph_num = ONE_INTEGER;
                                    SubLObject paragraph_count = length(paragraph_texts);
                                    SubLObject cdolist_list_var = paragraph_texts;
                                    SubLObject paragraph_text = NIL;
                                    for (paragraph_text = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , paragraph_text = cdolist_list_var.first()) {
                                        {
                                            SubLObject paragraph = com.cyc.cycjava.cycl.learning_reader.l2r_reify_one_webpage_paragraph(paragraph_num, paragraph_text, webpage_ais, mt);
                                            if (NIL != forts.fort_p(paragraph)) {
                                                paragraphs = cons(paragraph, paragraphs);
                                            }
                                        }
                                        note_percent_progress(paragraph_num, paragraph_count);
                                        paragraph_num = add(paragraph_num, ONE_INTEGER);
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
                    }
                }
                return nreverse(paragraphs);
            }
        }
    }

    public static SubLObject l2r_reify_webpage_paragraphs(final SubLObject webpage_ais, SubLObject download, SubLObject mt) {
        if (download == UNPROVIDED) {
            download = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(webpage_ais) : "! forts.fort_p(webpage_ais) " + ("forts.fort_p(webpage_ais) " + "CommonSymbols.NIL != forts.fort_p(webpage_ais) ") + webpage_ais;
        if (NIL == download) {
            download = learning_reader.l2r_most_recent_webpage_download(webpage_ais);
        }
        if (NIL == download) {
            download = learning_reader.l2r_download_webpage(webpage_ais);
        }
        final SubLObject source_html = learning_reader.l2r_best_webpage_source(webpage_ais, download);
        SubLObject paragraphs = NIL;
        if (NIL != source_html) {
            final SubLObject paragraph_texts = learning_reader.l2r_identify_webpage_paragraphs(source_html, webpage_ais);
            if (NIL == mt) {
                final SubLObject v_document = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, learning_reader.$$correspondingAIS, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                assert NIL != forts.fort_p(v_document) : "! forts.fort_p(v_document) " + ("forts.fort_p(v_document) " + "CommonSymbols.NIL != forts.fort_p(v_document) ") + v_document;
                mt = list(learning_reader.$$InterpretingDocumentMtFn, v_document);
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
                    noting_percent_progress_preamble(cconcatenate(learning_reader.$$$Reifying_paragraphs_in_, new SubLObject[]{ format_nil.format_nil_s_no_copy(webpage_ais), learning_reader.$str285$___ }));
                    SubLObject paragraph_num = ONE_INTEGER;
                    final SubLObject paragraph_count = length(paragraph_texts);
                    SubLObject cdolist_list_var = paragraph_texts;
                    SubLObject paragraph_text = NIL;
                    paragraph_text = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject paragraph = learning_reader.l2r_reify_one_webpage_paragraph(paragraph_num, paragraph_text, webpage_ais, mt);
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

    public static final SubLObject l2r_identify_webpage_paragraphs_alt(SubLObject source_html, SubLObject webpage_ais) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unicodeP = unicode_nauts.unicode_naut_p(source_html);
                SubLObject source_subl_string = (NIL != unicodeP) ? ((SubLObject) (cycl_utilities.nat_arg1(source_html, UNPROVIDED))) : source_html;
                SubLObject paragraph_texts = NIL;
                SubLObject doneP = sublisp_null(source_html);
                if (NIL == string_utilities.substringP($str_alt277$_p_, source_subl_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    Errors.warn($str_alt278$_S_doesn_t_have_any_recognizable_, webpage_ais);
                    doneP = T;
                }
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
                        noting_percent_progress_preamble(cconcatenate($str_alt279$Identifying_paragraphs_in_, new SubLObject[]{ format_nil.format_nil_s_no_copy(webpage_ais), $str_alt276$___ }));
                        {
                            SubLObject start = ZERO_INTEGER;
                            SubLObject total_length = length(source_subl_string);
                            SubLObject paragraph_text = NIL;
                            while (NIL == doneP) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject paragraph_text_22 = com.cyc.cycjava.cycl.learning_reader.l2r_find_next_webpage_paragraph(source_subl_string, webpage_ais, unicodeP, start);
                                    SubLObject start_23 = thread.secondMultipleValue();
                                    SubLObject doneP_24 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    paragraph_text = paragraph_text_22;
                                    start = start_23;
                                    doneP = doneP_24;
                                }
                                if (NIL != unicode_nauts.string_or_unicode_naut_p(paragraph_text)) {
                                    paragraph_texts = cons(paragraph_text, paragraph_texts);
                                }
                                if (NIL == doneP) {
                                    note_percent_progress(start, total_length);
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
                return nreverse(paragraph_texts);
            }
        }
    }

    public static SubLObject l2r_identify_webpage_paragraphs(final SubLObject source_html, final SubLObject webpage_ais) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(source_html, UNPROVIDED);
        final SubLObject source_subl_string = (NIL != unicodeP) ? cycl_utilities.nat_arg1(source_html, UNPROVIDED) : source_html;
        SubLObject paragraph_texts = NIL;
        SubLObject doneP = sublisp_null(source_html);
        if (NIL == string_utilities.substringP(learning_reader.$str286$_p_, source_subl_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            Errors.warn(learning_reader.$str287$_S_doesn_t_have_any_recognizable_, webpage_ais);
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
                noting_percent_progress_preamble(cconcatenate(learning_reader.$$$Identifying_paragraphs_in_, new SubLObject[]{ format_nil.format_nil_s_no_copy(webpage_ais), learning_reader.$str285$___ }));
                SubLObject start = ZERO_INTEGER;
                final SubLObject total_length = length(source_subl_string);
                SubLObject paragraph_text = NIL;
                while (NIL == doneP) {
                    thread.resetMultipleValues();
                    final SubLObject paragraph_text_$24 = learning_reader.l2r_find_next_webpage_paragraph(source_subl_string, webpage_ais, unicodeP, start);
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

    public static final SubLObject l2r_find_next_webpage_paragraph_alt(SubLObject source_subl_string, SubLObject webpage_ais, SubLObject unicodeP, SubLObject start) {
        {
            SubLObject start_pos = search($str_alt277$_p_, source_subl_string, symbol_function(EQUALP), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, NIL);
            SubLObject end_pos = (NIL != start_pos) ? ((SubLObject) (search($str_alt280$__p_, source_subl_string, symbol_function(EQUALP), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start_pos, NIL))) : NIL;
            SubLObject new_start = NIL;
            SubLObject recurseP = NIL;
            if (NIL == end_pos) {
                return values(NIL, new_start, T);
            } else {
                if (NIL != string_utilities.substringP($$$script, source_subl_string, symbol_function(EQUALP), start_pos, end_pos)) {
                    recurseP = T;
                } else {
                    {
                        SubLObject raw_paragraph_text = string_utilities.substring(source_subl_string, add(start_pos, THREE_INTEGER), subtract(end_pos, ZERO_INTEGER));
                        SubLObject paragraph_text = (NIL != unicodeP) ? ((SubLObject) (unicode_nauts.display_vector_string_to_cycl_safe_string(raw_paragraph_text))) : raw_paragraph_text;
                        SubLObject tagless_text = evaluation_defns.cyc_remove_html_tags(paragraph_text);
                        if (NIL != string_utilities.empty_string_p(tagless_text)) {
                            Errors.warn($str_alt282$No_non_tagged_text_in__S, paragraph_text);
                            recurseP = T;
                        } else {
                            if (NIL == lexicon_accessors.contains_closed_lexical_class_wordP(NIL != unicode_nauts.unicode_naut_p(tagless_text) ? ((SubLObject) (cycl_utilities.nat_arg1(tagless_text, UNPROVIDED))) : tagless_text)) {
                                Errors.warn($str_alt283$No_closed_class_words_in__S, tagless_text);
                                recurseP = T;
                            } else {
                                return values(paragraph_text, end_pos, NIL);
                            }
                        }
                    }
                }
            }
            if (NIL != recurseP) {
                return com.cyc.cycjava.cycl.learning_reader.l2r_find_next_webpage_paragraph(source_subl_string, webpage_ais, unicodeP, end_pos);
            }
        }
        return NIL;
    }

    public static SubLObject l2r_find_next_webpage_paragraph(final SubLObject source_subl_string, final SubLObject webpage_ais, final SubLObject unicodeP, final SubLObject start) {
        final SubLObject start_pos = search(learning_reader.$str286$_p_, source_subl_string, symbol_function(EQUALP), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, NIL);
        final SubLObject end_pos = (NIL != start_pos) ? search(learning_reader.$str289$__p_, source_subl_string, symbol_function(EQUALP), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start_pos, NIL) : NIL;
        final SubLObject new_start = NIL;
        SubLObject recurseP = NIL;
        if (NIL == end_pos) {
            return values(NIL, new_start, T);
        }
        if (NIL != string_utilities.substringP(learning_reader.$$$script, source_subl_string, symbol_function(EQUALP), start_pos, end_pos)) {
            recurseP = T;
        } else {
            final SubLObject raw_paragraph_text = string_utilities.substring(source_subl_string, add(start_pos, THREE_INTEGER), subtract(end_pos, ZERO_INTEGER));
            final SubLObject paragraph_text = (NIL != unicodeP) ? unicode_nauts.display_vector_string_to_cycl_safe_string(raw_paragraph_text) : raw_paragraph_text;
            final SubLObject tagless_text = evaluation_defns.cyc_remove_html_tags(paragraph_text);
            if (NIL != string_utilities.empty_string_p(tagless_text)) {
                Errors.warn(learning_reader.$str291$No_non_tagged_text_in__S, paragraph_text);
                recurseP = T;
            } else {
                if (NIL != lexicon_accessors.contains_closed_lexical_class_wordP(NIL != unicode_nauts.unicode_naut_p(tagless_text, UNPROVIDED) ? cycl_utilities.nat_arg1(tagless_text, UNPROVIDED) : tagless_text)) {
                    return values(paragraph_text, end_pos, NIL);
                }
                Errors.warn(learning_reader.$str292$No_closed_class_words_in__S, tagless_text);
                recurseP = T;
            }
        }
        if (NIL != recurseP) {
            return learning_reader.l2r_find_next_webpage_paragraph(source_subl_string, webpage_ais, unicodeP, end_pos);
        }
        return NIL;
    }

    public static final SubLObject l2r_reify_one_webpage_paragraph_alt(SubLObject paragraph_num, SubLObject paragraph_text, SubLObject webpage_ais, SubLObject mt) {
        {
            SubLObject paragraph_naut = list($const284$NthOccurrenceOfStructureTypeInStr, paragraph_num, $$NLParagraph, webpage_ais);
            com.cyc.cycjava.cycl.learning_reader.l2r_assert_source_html(paragraph_naut, paragraph_text, mt, T);
            format(T, $str_alt285$___S___S__, paragraph_num, evaluation_defns.cyc_remove_html_tags(paragraph_text));
            return narts_high.find_nart(paragraph_naut);
        }
    }

    public static SubLObject l2r_reify_one_webpage_paragraph(final SubLObject paragraph_num, final SubLObject paragraph_text, final SubLObject webpage_ais, final SubLObject mt) {
        final SubLObject paragraph_naut = list(learning_reader.$const293$NthOccurrenceOfStructureTypeInStr, paragraph_num, learning_reader.$$NLParagraph, webpage_ais);
        learning_reader.l2r_assert_source_html(paragraph_naut, paragraph_text, mt, T);
        format(T, learning_reader.$str294$___S___S__, paragraph_num, evaluation_defns.cyc_remove_html_tags(paragraph_text));
        return narts_high.find_nart(paragraph_naut);
    }

    public static final SubLObject l2r_best_webpage_source_alt(SubLObject webpage_ais, SubLObject download) {
        if (download == UNPROVIDED) {
            download = com.cyc.cycjava.cycl.learning_reader.l2r_most_recent_webpage_download(webpage_ais);
        }
        {
            SubLObject download_text = (NIL != download) ? ((SubLObject) (kb_mapping_utilities.fpred_value_in_any_mt(download, $$transferredAIS, ONE_INTEGER, TWO_INTEGER, UNPROVIDED))) : NIL;
            SubLObject source_html = (NIL != download_text) ? ((SubLObject) (download_text)) : com.cyc.cycjava.cycl.learning_reader.l2r_get_source_html(webpage_ais);
            return source_html;
        }
    }

    public static SubLObject l2r_best_webpage_source(final SubLObject webpage_ais, SubLObject download) {
        if (download == UNPROVIDED) {
            download = learning_reader.l2r_most_recent_webpage_download(webpage_ais);
        }
        final SubLObject download_text = (NIL != download) ? kb_mapping_utilities.fpred_value_in_any_mt(download, learning_reader.$$transferredAIS, ONE_INTEGER, TWO_INTEGER, UNPROVIDED) : NIL;
        final SubLObject source_html = (NIL != download_text) ? download_text : learning_reader.l2r_get_source_html(webpage_ais);
        return source_html;
    }

    public static final SubLObject l2r_reify_sentence_level_pegs_for_document_alt(SubLObject v_document) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentences = com.cyc.cycjava.cycl.learning_reader.l2r_sentences_for_document(v_document);
                SubLObject rules = com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_creation_rules();
                SubLObject sentence_pegs = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                        api_control_vars.$the_cyclist$.bind(com.cyc.cycjava.cycl.learning_reader.default_learning_reader_cyclist(), thread);
                        {
                            SubLObject cdolist_list_var = sentences;
                            SubLObject sentence = NIL;
                            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                {
                                    SubLObject new_peg = com.cyc.cycjava.cycl.learning_reader.l2r_create($$$SentenceLevelPeg);
                                    SubLObject cdolist_list_var_25 = com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_creation_template_sentences();
                                    SubLObject template_sentence = NIL;
                                    for (template_sentence = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , template_sentence = cdolist_list_var_25.first()) {
                                        {
                                            SubLObject dereferenced = com.cyc.cycjava.cycl.learning_reader.l2r_dereference_sentence_level_peg_assertion_sentence(new_peg, sentence, v_document, template_sentence, NIL, NIL, NIL);
                                            com.cyc.cycjava.cycl.learning_reader.l2r_assert(dereferenced, UNPROVIDED);
                                        }
                                    }
                                    sentence_pegs = cons(new_peg, sentence_pegs);
                                }
                            }
                        }
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(sentence_pegs);
            }
        }
    }

    public static SubLObject l2r_reify_sentence_level_pegs_for_document(final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentences = learning_reader.l2r_sentences_for_document(v_document);
        final SubLObject rules = learning_reader.l2r_sentence_level_peg_creation_rules();
        SubLObject sentence_pegs = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
            api_control_vars.$the_cyclist$.bind(learning_reader.default_learning_reader_cyclist(), thread);
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject new_peg = learning_reader.l2r_create(learning_reader.$$$SentenceLevelPeg);
                SubLObject cdolist_list_var_$28 = learning_reader.l2r_sentence_level_peg_creation_template_sentences();
                SubLObject template_sentence = NIL;
                template_sentence = cdolist_list_var_$28.first();
                while (NIL != cdolist_list_var_$28) {
                    final SubLObject dereferenced = learning_reader.l2r_dereference_sentence_level_peg_assertion_sentence(new_peg, sentence, v_document, template_sentence, NIL, NIL, NIL);
                    learning_reader.l2r_assert(dereferenced, UNPROVIDED);
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

    public static final SubLObject l2r_reify_peg_for_sentence_alt(SubLObject sentence, SubLObject v_document) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence, CYCL_DENOTATIONAL_TERM_P);
            {
                SubLObject rules = com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_creation_rules();
                SubLObject new_peg = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                        {
                            SubLObject _prev_bind_0_26 = api_control_vars.$the_cyclist$.currentBinding(thread);
                            try {
                                api_control_vars.$the_cyclist$.bind(com.cyc.cycjava.cycl.learning_reader.default_learning_reader_cyclist(), thread);
                                new_peg = com.cyc.cycjava.cycl.learning_reader.l2r_create($$$SentenceLevelPeg);
                            } finally {
                                api_control_vars.$the_cyclist$.rebind(_prev_bind_0_26, thread);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_creation_template_sentences();
                            SubLObject template_sentence = NIL;
                            for (template_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_sentence = cdolist_list_var.first()) {
                                {
                                    SubLObject dereferenced = com.cyc.cycjava.cycl.learning_reader.l2r_dereference_sentence_level_peg_assertion_sentence(new_peg, sentence, v_document, template_sentence, NIL, NIL, NIL);
                                    com.cyc.cycjava.cycl.learning_reader.l2r_assert(dereferenced, UNPROVIDED);
                                }
                            }
                        }
                    } finally {
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_peg;
            }
        }
    }

    public static SubLObject l2r_reify_peg_for_sentence(final SubLObject sentence, final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_denotational_term_p(sentence) : "! cycl_grammar.cycl_denotational_term_p(sentence) " + ("cycl_grammar.cycl_denotational_term_p(sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(sentence) ") + sentence;
        final SubLObject rules = learning_reader.l2r_sentence_level_peg_creation_rules();
        SubLObject new_peg = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
            final SubLObject _prev_bind_0_$29 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(learning_reader.default_learning_reader_cyclist(), thread);
                new_peg = learning_reader.l2r_create(learning_reader.$$$SentenceLevelPeg);
            } finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0_$29, thread);
            }
            SubLObject cdolist_list_var = learning_reader.l2r_sentence_level_peg_creation_template_sentences();
            SubLObject template_sentence = NIL;
            template_sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject dereferenced = learning_reader.l2r_dereference_sentence_level_peg_assertion_sentence(new_peg, sentence, v_document, template_sentence, NIL, NIL, NIL);
                learning_reader.l2r_assert(dereferenced, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                template_sentence = cdolist_list_var.first();
            } 
        } finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return new_peg;
    }

    public static final SubLObject l2r_find_or_reify_peg_for_sentence_string_alt(SubLObject sentence_string, SubLObject v_document, SubLObject supertext, SubLObject sentence_number, SubLObject sentence_string_number) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence_string, STRING_OR_UNICODE_NAUT_P);
            SubLTrampolineFile.checkType(v_document, CYCL_DENOTATIONAL_TERM_P);
            SubLTrampolineFile.checkType(supertext, CYCL_DENOTATIONAL_TERM_P);
            SubLTrampolineFile.checkType(sentence_number, POSITIVE_INTEGER_P);
            {
                SubLObject rules = com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_creation_rules();
                SubLObject dereferenced_sentences = NIL;
                SubLObject peg_var = $sym289$_PEG;
                SubLObject peg = NIL;
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_creation_template_sentences();
                    SubLObject template_sentence = NIL;
                    for (template_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_sentence = cdolist_list_var.first()) {
                        {
                            SubLObject dereferenced = com.cyc.cycjava.cycl.learning_reader.l2r_dereference_sentence_level_peg_assertion_sentence(peg_var, sentence_string, v_document, supertext, sentence_number, sentence_string_number, template_sentence);
                            dereferenced_sentences = cons(dereferenced, dereferenced_sentences);
                        }
                    }
                }
                peg = com.cyc.cycjava.cycl.learning_reader.l2r_find_sentence_peg_from_sentences(peg_var, dereferenced_sentences);
                if (NIL == peg) {
                    {
                        SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                        try {
                            kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                            {
                                SubLObject _prev_bind_0_27 = api_control_vars.$the_cyclist$.currentBinding(thread);
                                try {
                                    api_control_vars.$the_cyclist$.bind(com.cyc.cycjava.cycl.learning_reader.default_learning_reader_cyclist(), thread);
                                    peg = com.cyc.cycjava.cycl.learning_reader.l2r_create($$$SentenceLevelPeg);
                                } finally {
                                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0_27, thread);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = nreverse(dereferenced_sentences);
                                SubLObject dereferenced = NIL;
                                for (dereferenced = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dereferenced = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.learning_reader.l2r_assert(cycl_utilities.expression_subst(peg, peg_var, dereferenced, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                }
                            }
                        } finally {
                            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return peg;
            }
        }
    }

    public static SubLObject l2r_find_or_reify_peg_for_sentence_string(final SubLObject sentence_string, final SubLObject v_document, final SubLObject supertext, final SubLObject sentence_number, final SubLObject sentence_string_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != unicode_nauts.string_or_unicode_naut_p(sentence_string) : "! unicode_nauts.string_or_unicode_naut_p(sentence_string) " + ("unicode_nauts.string_or_unicode_naut_p(sentence_string) " + "CommonSymbols.NIL != unicode_nauts.string_or_unicode_naut_p(sentence_string) ") + sentence_string;
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "! cycl_grammar.cycl_denotational_term_p(v_document) " + ("cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) ") + v_document;
        assert NIL != cycl_grammar.cycl_denotational_term_p(supertext) : "! cycl_grammar.cycl_denotational_term_p(supertext) " + ("cycl_grammar.cycl_denotational_term_p(supertext) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(supertext) ") + supertext;
        assert NIL != subl_promotions.positive_integer_p(sentence_number) : "! subl_promotions.positive_integer_p(sentence_number) " + ("subl_promotions.positive_integer_p(sentence_number) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(sentence_number) ") + sentence_number;
        final SubLObject rules = learning_reader.l2r_sentence_level_peg_creation_rules();
        SubLObject dereferenced_sentences = NIL;
        final SubLObject peg_var = learning_reader.$sym298$_PEG;
        SubLObject peg = NIL;
        SubLObject cdolist_list_var = learning_reader.l2r_sentence_level_peg_creation_template_sentences();
        SubLObject template_sentence = NIL;
        template_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject dereferenced = learning_reader.l2r_dereference_sentence_level_peg_assertion_sentence(peg_var, sentence_string, v_document, supertext, sentence_number, sentence_string_number, template_sentence);
            dereferenced_sentences = cons(dereferenced, dereferenced_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            template_sentence = cdolist_list_var.first();
        } 
        peg = learning_reader.l2r_find_sentence_peg_from_sentences(peg_var, dereferenced_sentences);
        if (NIL == peg) {
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                final SubLObject _prev_bind_0_$30 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(learning_reader.default_learning_reader_cyclist(), thread);
                    peg = learning_reader.l2r_create(learning_reader.$$$SentenceLevelPeg);
                } finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0_$30, thread);
                }
                SubLObject cdolist_list_var2 = nreverse(dereferenced_sentences);
                SubLObject dereferenced = NIL;
                dereferenced = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    learning_reader.l2r_assert(cycl_utilities.expression_subst(peg, peg_var, dereferenced, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    dereferenced = cdolist_list_var2.first();
                } 
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
            }
        }
        return peg;
    }

    public static final SubLObject l2r_find_sentence_peg_from_sentences_alt(SubLObject peg_var, SubLObject dereferenced_sentences) {
        return ask_utilities.query_variable(peg_var, simplifier.conjoin(dereferenced_sentences, UNPROVIDED), $$BaseKB, $list_alt290).first();
    }

    public static SubLObject l2r_find_sentence_peg_from_sentences(final SubLObject peg_var, final SubLObject dereferenced_sentences) {
        return ask_utilities.query_variable(peg_var, simplifier.conjoin(dereferenced_sentences, UNPROVIDED), learning_reader.$$BaseKB, learning_reader.$list299).first();
    }

    public static final SubLObject clear_l2r_sentence_level_peg_creation_template_alt() {
        {
            SubLObject cs = $l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_l2r_sentence_level_peg_creation_template() {
        final SubLObject cs = learning_reader.$l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_l2r_sentence_level_peg_creation_template_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_l2r_sentence_level_peg_creation_template() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject l2r_sentence_level_peg_creation_template_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template = $const292$SentenceLevelPegCreationTemplateF;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == valid_constantP(template, T)) {
                        Errors.error($str_alt293$Failed_to_validate___SentenceLeve);
                    }
                }
                return template;
            }
        }
    }

    public static SubLObject l2r_sentence_level_peg_creation_template_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template = learning_reader.$const301$SentenceLevelPegCreationTemplateF;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == valid_constantP(template, T))) {
            Errors.error(learning_reader.$str302$Failed_to_validate___SentenceLeve);
        }
        return template;
    }

    public static final SubLObject l2r_sentence_level_peg_creation_template_alt() {
        {
            SubLObject caching_state = $l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE, $sym294$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw295$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_creation_template_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject l2r_sentence_level_peg_creation_template() {
        SubLObject caching_state = learning_reader.$l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(learning_reader.L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE, learning_reader.$sym303$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(learning_reader.l2r_sentence_level_peg_creation_template_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_l2r_sentence_level_peg_exemplar_alt() {
        {
            SubLObject cs = $l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_l2r_sentence_level_peg_exemplar() {
        final SubLObject cs = learning_reader.$l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_l2r_sentence_level_peg_exemplar_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_l2r_sentence_level_peg_exemplar() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject l2r_sentence_level_peg_exemplar_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject exemplar = $$TheExemplarSentenceLevelPeg;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == valid_constantP(exemplar, T)) {
                        Errors.error($str_alt298$Failed_to_validate___TheExemplarS);
                    }
                }
                return exemplar;
            }
        }
    }

    public static SubLObject l2r_sentence_level_peg_exemplar_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject exemplar = learning_reader.$$TheExemplarSentenceLevelPeg;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == valid_constantP(exemplar, T))) {
            Errors.error(learning_reader.$str306$Failed_to_validate___TheExemplarS);
        }
        return exemplar;
    }

    public static final SubLObject l2r_sentence_level_peg_exemplar_alt() {
        {
            SubLObject caching_state = $l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_LEVEL_PEG_EXEMPLAR, $sym299$_L2R_SENTENCE_LEVEL_PEG_EXEMPLAR_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw295$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_exemplar_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject l2r_sentence_level_peg_exemplar() {
        SubLObject caching_state = learning_reader.$l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(learning_reader.L2R_SENTENCE_LEVEL_PEG_EXEMPLAR, learning_reader.$sym307$_L2R_SENTENCE_LEVEL_PEG_EXEMPLAR_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(learning_reader.l2r_sentence_level_peg_exemplar_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject l2r_sentence_level_peg_creation_rules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rules = forward.creation_template_allowable_rules(com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_creation_template());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.non_empty_list_of_type_p($sym300$RULE_ASSERTION_, rules)) {
                        Errors.error($str_alt301$Failed_to_find_good_L2R_SENTENCE_, rules);
                    }
                }
                return rules;
            }
        }
    }

    public static SubLObject l2r_sentence_level_peg_creation_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rules = creation_template_allowable_rules(learning_reader.l2r_sentence_level_peg_creation_template());
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.non_empty_list_of_type_p(learning_reader.$sym308$RULE_ASSERTION_, rules))) {
            Errors.error(learning_reader.$str309$Failed_to_find_good_L2R_SENTENCE_, rules);
        }
        return rules;
    }

    public static final SubLObject clear_l2r_sentence_level_peg_creation_template_sentences_alt() {
        {
            SubLObject cs = $l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_l2r_sentence_level_peg_creation_template_sentences() {
        final SubLObject cs = learning_reader.$l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_l2r_sentence_level_peg_creation_template_sentences_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_l2r_sentence_level_peg_creation_template_sentences() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject l2r_sentence_level_peg_creation_template_sentences_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentences = com.cyc.cycjava.cycl.learning_reader.get_l2r_sentence_level_peg_creation_template_sentences();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.non_empty_list_of_type_p(IST_SENTENCE_P, sentences)) {
                        Errors.error($str_alt304$Failed_to_initialize_L2R_SENTENCE, sentences);
                    }
                }
                return sentences;
            }
        }
    }

    public static SubLObject l2r_sentence_level_peg_creation_template_sentences_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentences = learning_reader.get_l2r_sentence_level_peg_creation_template_sentences();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.non_empty_list_of_type_p(learning_reader.IST_SENTENCE_P, sentences))) {
            Errors.error(learning_reader.$str312$Failed_to_initialize_L2R_SENTENCE, sentences);
        }
        return sentences;
    }

    public static final SubLObject l2r_sentence_level_peg_creation_template_sentences_alt() {
        {
            SubLObject caching_state = $l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES, $sym305$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES_CACHING_STATE, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw295$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_creation_template_sentences_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject l2r_sentence_level_peg_creation_template_sentences() {
        SubLObject caching_state = learning_reader.$l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(learning_reader.L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES, learning_reader.$sym313$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES_CACHING_STATE, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(learning_reader.l2r_sentence_level_peg_creation_template_sentences_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject l2r_dereference_sentence_level_peg_assertion_sentence_alt(SubLObject new_peg, SubLObject sentence_string, SubLObject v_document, SubLObject supertext, SubLObject sentence_number, SubLObject sentence_string_number, SubLObject template_sentence) {
        SubLTrampolineFile.checkType(new_peg, CYCL_DENOTATIONAL_TERM_P);
        {
            SubLObject ans = copy_expression(template_sentence);
            SubLObject pairs = list(list(new_peg, com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_exemplar()), list(sentence_string, com.cyc.cycjava.cycl.learning_reader.l2r_sentence_string_indexical()), list(v_document, com.cyc.cycjava.cycl.learning_reader.l2r_document_indexical()), list(supertext, com.cyc.cycjava.cycl.learning_reader.l2r_supertext_indexical()), list(sentence_number, com.cyc.cycjava.cycl.learning_reader.l2r_sentence_number_indexical()), list(sentence_string_number, com.cyc.cycjava.cycl.learning_reader.l2r_sentence_string_number_indexical()));
            SubLObject cdolist_list_var = pairs;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject in = NIL;
                    SubLObject out = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt306);
                    in = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt306);
                    out = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        ans = cycl_utilities.expression_subst(in, out, ans, symbol_function(EQUAL), UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt306);
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject l2r_dereference_sentence_level_peg_assertion_sentence(final SubLObject new_peg, final SubLObject sentence_string, final SubLObject v_document, final SubLObject supertext, final SubLObject sentence_number, final SubLObject sentence_string_number, final SubLObject template_sentence) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(new_peg) : "! cycl_grammar.cycl_denotational_term_p(new_peg) " + ("cycl_grammar.cycl_denotational_term_p(new_peg) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(new_peg) ") + new_peg;
        SubLObject ans = copy_expression(template_sentence);
        SubLObject cdolist_list_var;
        final SubLObject pairs = cdolist_list_var = list(list(new_peg, learning_reader.l2r_sentence_level_peg_exemplar()), list(sentence_string, learning_reader.l2r_sentence_string_indexical()), list(v_document, learning_reader.l2r_document_indexical()), list(supertext, learning_reader.l2r_supertext_indexical()), list(sentence_number, learning_reader.l2r_sentence_number_indexical()), list(sentence_string_number, learning_reader.l2r_sentence_string_number_indexical()));
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject in = NIL;
            SubLObject out = NIL;
            destructuring_bind_must_consp(current, datum, learning_reader.$list314);
            in = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, learning_reader.$list314);
            out = current.first();
            current = current.rest();
            if (NIL == current) {
                ans = cycl_utilities.expression_subst(in, out, ans, symbol_function(EQUAL), UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, learning_reader.$list314);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return ans;
    }

    public static final SubLObject clear_l2r_document_indexical_alt() {
        {
            SubLObject cs = $l2r_document_indexical_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_l2r_document_indexical() {
        final SubLObject cs = learning_reader.$l2r_document_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_l2r_document_indexical_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_document_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_l2r_document_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_document_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Indexical for the document
     */
    @LispMethod(comment = "Indexical for the document")
    public static final SubLObject l2r_document_indexical_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject document_naut = $list_alt308;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == narts_high.find_nart(document_naut)) {
                        Errors.error($str_alt309$Failed_to_validate_L2R_DOCUMENT_I, document_naut);
                    }
                }
                return document_naut;
            }
        }
    }

    /**
     * Indexical for the document
     */
    @LispMethod(comment = "Indexical for the document")
    public static SubLObject l2r_document_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject document_naut = learning_reader.$list316;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(document_naut))) {
            Errors.error(learning_reader.$str317$Failed_to_validate_L2R_DOCUMENT_I, document_naut);
        }
        return document_naut;
    }

    public static final SubLObject l2r_document_indexical_alt() {
        {
            SubLObject caching_state = $l2r_document_indexical_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(L2R_DOCUMENT_INDEXICAL, $sym310$_L2R_DOCUMENT_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw295$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.learning_reader.l2r_document_indexical_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject l2r_document_indexical() {
        SubLObject caching_state = learning_reader.$l2r_document_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(learning_reader.L2R_DOCUMENT_INDEXICAL, learning_reader.$sym318$_L2R_DOCUMENT_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(learning_reader.l2r_document_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_l2r_sentence_indexical_alt() {
        {
            SubLObject cs = $l2r_sentence_indexical_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_l2r_sentence_indexical() {
        final SubLObject cs = learning_reader.$l2r_sentence_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_l2r_sentence_indexical_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_l2r_sentence_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Indexical for the sentence term
     */
    @LispMethod(comment = "Indexical for the sentence term")
    public static final SubLObject l2r_sentence_indexical_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence_naut = $list_alt312;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == narts_high.find_nart(sentence_naut)) {
                        Errors.error($str_alt313$Failed_to_validate_L2R_SENTENCE_I, sentence_naut);
                    }
                }
                return sentence_naut;
            }
        }
    }

    /**
     * Indexical for the sentence term
     */
    @LispMethod(comment = "Indexical for the sentence term")
    public static SubLObject l2r_sentence_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_naut = learning_reader.$list320;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(sentence_naut))) {
            Errors.error(learning_reader.$str321$Failed_to_validate_L2R_SENTENCE_I, sentence_naut);
        }
        return sentence_naut;
    }

    public static final SubLObject l2r_sentence_indexical_alt() {
        {
            SubLObject caching_state = $l2r_sentence_indexical_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_INDEXICAL, $sym314$_L2R_SENTENCE_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw295$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.learning_reader.l2r_sentence_indexical_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject l2r_sentence_indexical() {
        SubLObject caching_state = learning_reader.$l2r_sentence_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(learning_reader.L2R_SENTENCE_INDEXICAL, learning_reader.$sym322$_L2R_SENTENCE_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(learning_reader.l2r_sentence_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_l2r_supertext_indexical_alt() {
        {
            SubLObject cs = $l2r_supertext_indexical_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_l2r_supertext_indexical() {
        final SubLObject cs = learning_reader.$l2r_supertext_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_l2r_supertext_indexical_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_supertext_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_l2r_supertext_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_supertext_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Indexical for the minimal reified larger text in which the sentence appears
     */
    @LispMethod(comment = "Indexical for the minimal reified larger text in which the sentence appears")
    public static final SubLObject l2r_supertext_indexical_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supertext_naut = $list_alt316;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == narts_high.find_nart(supertext_naut)) {
                        Errors.error($str_alt317$Failed_to_validate_L2R_SUPERTEXT_, supertext_naut);
                    }
                }
                return supertext_naut;
            }
        }
    }

    /**
     * Indexical for the minimal reified larger text in which the sentence appears
     */
    @LispMethod(comment = "Indexical for the minimal reified larger text in which the sentence appears")
    public static SubLObject l2r_supertext_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supertext_naut = learning_reader.$list324;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(supertext_naut))) {
            Errors.error(learning_reader.$str325$Failed_to_validate_L2R_SUPERTEXT_, supertext_naut);
        }
        return supertext_naut;
    }

    public static final SubLObject l2r_supertext_indexical_alt() {
        {
            SubLObject caching_state = $l2r_supertext_indexical_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(L2R_SUPERTEXT_INDEXICAL, $sym318$_L2R_SUPERTEXT_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw295$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.learning_reader.l2r_supertext_indexical_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject l2r_supertext_indexical() {
        SubLObject caching_state = learning_reader.$l2r_supertext_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(learning_reader.L2R_SUPERTEXT_INDEXICAL, learning_reader.$sym326$_L2R_SUPERTEXT_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(learning_reader.l2r_supertext_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_l2r_sentence_string_indexical_alt() {
        {
            SubLObject cs = $l2r_sentence_string_indexical_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_l2r_sentence_string_indexical() {
        final SubLObject cs = learning_reader.$l2r_sentence_string_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_l2r_sentence_string_indexical_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_string_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_l2r_sentence_string_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_string_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Indexical for the string of the sentence
     */
    @LispMethod(comment = "Indexical for the string of the sentence")
    public static final SubLObject l2r_sentence_string_indexical_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence_naut = $list_alt320;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == narts_high.find_nart(sentence_naut)) {
                        Errors.error($str_alt321$Failed_to_validate_L2R_SENTENCE_S, sentence_naut);
                    }
                }
                return sentence_naut;
            }
        }
    }

    /**
     * Indexical for the string of the sentence
     */
    @LispMethod(comment = "Indexical for the string of the sentence")
    public static SubLObject l2r_sentence_string_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_naut = learning_reader.$list328;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(sentence_naut))) {
            Errors.error(learning_reader.$str329$Failed_to_validate_L2R_SENTENCE_S, sentence_naut);
        }
        return sentence_naut;
    }

    public static final SubLObject l2r_sentence_string_indexical_alt() {
        {
            SubLObject caching_state = $l2r_sentence_string_indexical_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_STRING_INDEXICAL, $sym322$_L2R_SENTENCE_STRING_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw295$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.learning_reader.l2r_sentence_string_indexical_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject l2r_sentence_string_indexical() {
        SubLObject caching_state = learning_reader.$l2r_sentence_string_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(learning_reader.L2R_SENTENCE_STRING_INDEXICAL, learning_reader.$sym330$_L2R_SENTENCE_STRING_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(learning_reader.l2r_sentence_string_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_l2r_sentence_number_indexical_alt() {
        {
            SubLObject cs = $l2r_sentence_number_indexical_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_l2r_sentence_number_indexical() {
        final SubLObject cs = learning_reader.$l2r_sentence_number_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_l2r_sentence_number_indexical_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_number_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_l2r_sentence_number_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_number_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Indexical for the number of the sentence within its supertext
     */
    @LispMethod(comment = "Indexical for the number of the sentence within its supertext")
    public static final SubLObject l2r_sentence_number_indexical_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject naut = $list_alt324;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == narts_high.find_nart(naut)) {
                        Errors.error($str_alt325$Failed_to_validate_L2R_SENTENCE_N, naut);
                    }
                }
                return naut;
            }
        }
    }

    /**
     * Indexical for the number of the sentence within its supertext
     */
    @LispMethod(comment = "Indexical for the number of the sentence within its supertext")
    public static SubLObject l2r_sentence_number_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject naut = learning_reader.$list332;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(naut))) {
            Errors.error(learning_reader.$str333$Failed_to_validate_L2R_SENTENCE_N, naut);
        }
        return naut;
    }

    public static final SubLObject l2r_sentence_number_indexical_alt() {
        {
            SubLObject caching_state = $l2r_sentence_number_indexical_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_NUMBER_INDEXICAL, $sym326$_L2R_SENTENCE_NUMBER_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw295$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.learning_reader.l2r_sentence_number_indexical_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject l2r_sentence_number_indexical() {
        SubLObject caching_state = learning_reader.$l2r_sentence_number_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(learning_reader.L2R_SENTENCE_NUMBER_INDEXICAL, learning_reader.$sym334$_L2R_SENTENCE_NUMBER_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(learning_reader.l2r_sentence_number_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_l2r_sentence_string_number_indexical_alt() {
        {
            SubLObject cs = $l2r_sentence_string_number_indexical_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_l2r_sentence_string_number_indexical() {
        final SubLObject cs = learning_reader.$l2r_sentence_string_number_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_l2r_sentence_string_number_indexical_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_string_number_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_l2r_sentence_string_number_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_string_number_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Indexical for indicating which occurrence of its string the sentence we're focusing
     * on is. Unless the same string occurs earlier in the minimal supertext, it's 1.
     */
    @LispMethod(comment = "Indexical for indicating which occurrence of its string the sentence we\'re focusing\r\non is. Unless the same string occurs earlier in the minimal supertext, it\'s 1.\nIndexical for indicating which occurrence of its string the sentence we\'re focusing\non is. Unless the same string occurs earlier in the minimal supertext, it\'s 1.")
    public static final SubLObject l2r_sentence_string_number_indexical_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject naut = $list_alt328;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == narts_high.find_nart(naut)) {
                        Errors.error($str_alt329$Failed_to_validate_L2R_SENTENCE_S, naut);
                    }
                }
                return naut;
            }
        }
    }

    /**
     * Indexical for indicating which occurrence of its string the sentence we're focusing
     * on is. Unless the same string occurs earlier in the minimal supertext, it's 1.
     */
    @LispMethod(comment = "Indexical for indicating which occurrence of its string the sentence we\'re focusing\r\non is. Unless the same string occurs earlier in the minimal supertext, it\'s 1.\nIndexical for indicating which occurrence of its string the sentence we\'re focusing\non is. Unless the same string occurs earlier in the minimal supertext, it\'s 1.")
    public static SubLObject l2r_sentence_string_number_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject naut = learning_reader.$list336;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(naut))) {
            Errors.error(learning_reader.$str337$Failed_to_validate_L2R_SENTENCE_S, naut);
        }
        return naut;
    }

    public static final SubLObject l2r_sentence_string_number_indexical_alt() {
        {
            SubLObject caching_state = $l2r_sentence_string_number_indexical_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_STRING_NUMBER_INDEXICAL, $sym330$_L2R_SENTENCE_STRING_NUMBER_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw295$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.learning_reader.l2r_sentence_string_number_indexical_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject l2r_sentence_string_number_indexical() {
        SubLObject caching_state = learning_reader.$l2r_sentence_string_number_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(learning_reader.L2R_SENTENCE_STRING_NUMBER_INDEXICAL, learning_reader.$sym338$_L2R_SENTENCE_STRING_NUMBER_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(learning_reader.l2r_sentence_string_number_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject get_l2r_sentence_level_peg_creation_template_sentences_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template = com.cyc.cycjava.cycl.learning_reader.l2r_sentence_level_peg_creation_template();
                SubLObject tuples = ask_utilities.query_template($list_alt331, list($$assertPriorToInCreationTemplate, $sym333$_HIGHER, $sym334$_LOWER, template), $$InferencePSC, $list_alt335);
                thread.resetMultipleValues();
                {
                    SubLObject high_to_low = formula_templates.construct_highXlow_information_from_prioritizing_ordering(tuples);
                    SubLObject low_to_high = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return Mapping.mapcar(symbol_function(HL_TO_EL), Mapping.mapcar(symbol_function(ASSERTION_IST_FORMULA), formula_templates.apply_prioritizing_ordering_to_kb_objects(high_to_low, low_to_high)));
                }
            }
        }
    }

    public static SubLObject get_l2r_sentence_level_peg_creation_template_sentences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template = learning_reader.l2r_sentence_level_peg_creation_template();
        final SubLObject tuples = ask_utilities.query_template(learning_reader.$list339, list(learning_reader.$$assertPriorToInCreationTemplate, learning_reader.$sym341$_HIGHER, learning_reader.$sym342$_LOWER, template), learning_reader.$$InferencePSC, learning_reader.$list343);
        thread.resetMultipleValues();
        final SubLObject high_to_low = formula_templates.construct_highXlow_information_from_prioritizing_ordering(tuples);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Mapping.mapcar(symbol_function(HL_TO_EL), Mapping.mapcar(symbol_function(learning_reader.ASSERTION_IST_FORMULA), formula_templates.apply_prioritizing_ordering_to_kb_objects(high_to_low, low_to_high)));
    }

    public static final SubLObject sentencify_l2r_paragraph_alt(SubLObject html_source) {
        {
            SubLObject unicodeP = unicode_nauts.unicode_naut_p(html_source);
            SubLObject string = (NIL != unicodeP) ? ((SubLObject) (unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(html_source, UNPROVIDED)))) : html_source;
            SubLObject sentence_vector = document.string_sentencify(string, HTML_STRING_WORDIFY);
            SubLObject vector_var = sentence_vector;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject sentence = aref(vector_var, element_num);
                    com.cyc.cycjava.cycl.learning_reader.set_l2r_sentence_string(sentence, unicodeP);
                }
            }
            return sentence_vector;
        }
    }

    public static SubLObject sentencify_l2r_paragraph(final SubLObject html_source) {
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(html_source, UNPROVIDED);
        final SubLObject string = (NIL != unicodeP) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(html_source, UNPROVIDED)) : html_source;
        final SubLObject vector_var;
        final SubLObject sentence_vector = vector_var = document.string_sentencify(string, learning_reader.HTML_STRING_WORDIFY);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            learning_reader.set_l2r_sentence_string(sentence, unicodeP);
        }
        return sentence_vector;
    }

    /**
     * Set the STRING value of SENTENCE, including its HTML tags and whitespace.
     */
    @LispMethod(comment = "Set the STRING value of SENTENCE, including its HTML tags and whitespace.")
    public static final SubLObject set_l2r_sentence_string_alt(SubLObject sentence, SubLObject unicodeP) {
        if (unicodeP == UNPROVIDED) {
            unicodeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = NIL;
                SubLObject first_wordP = T;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject vector_var = document.sentence_yield(sentence);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject word = aref(vector_var, element_num);
                                SubLObject whole_string = com.cyc.cycjava.cycl.learning_reader.l2r_reconstruct_word_string(word, makeBoolean(NIL == first_wordP));
                                princ(whole_string, stream);
                                first_wordP = NIL;
                            }
                        }
                    }
                    string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != unicodeP) {
                    {
                        SubLObject utf8_string = unicode_strings.html_escaped_to_utf8_string(string);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!utf8_string.isString()) {
                                Errors.error($str_alt339$Couldn_t_make_UTF8_string_from__S, string);
                            }
                        }
                        string = (NIL != find_if(NON_ASCII_CHAR_P, utf8_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (unicode_nauts.make_unicode_naut(unicode_strings.utf8_string_to_display(utf8_string)))) : utf8_string;
                    }
                }
                document._csetf_sign_string(sentence, string);
                return string;
            }
        }
    }

    /**
     * Set the STRING value of SENTENCE, including its HTML tags and whitespace.
     */
    @LispMethod(comment = "Set the STRING value of SENTENCE, including its HTML tags and whitespace.")
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
                final SubLObject whole_string = learning_reader.l2r_reconstruct_word_string(word, makeBoolean(NIL == first_wordP));
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
                Errors.error(learning_reader.$str347$Couldn_t_make_UTF8_string_from__S, string);
            }
            string = (NIL != find_if(learning_reader.NON_ASCII_CHAR_P, utf8_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? unicode_nauts.make_unicode_naut(unicode_strings.utf8_string_to_display(utf8_string)) : utf8_string;
        }
        document._csetf_sign_string(sentence, string);
        return string;
    }

    public static final SubLObject l2r_reconstruct_word_string_alt(SubLObject word, SubLObject include_leading_whitespaceP) {
        if (include_leading_whitespaceP == UNPROVIDED) {
            include_leading_whitespaceP = NIL;
        }
        {
            SubLObject main_string = document.word_string(word);
            SubLObject info = document.word_info(word);
            SubLObject leading_tags = getf(info, $LEADING_TAGS, string_utilities.$empty_string$.getGlobalValue());
            SubLObject following_tags = getf(info, $FOLLOWING_TAGS, string_utilities.$empty_string$.getGlobalValue());
            SubLObject leading_whitespace = (NIL != include_leading_whitespaceP) ? ((SubLObject) (getf(info, $LEADING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue()))) : string_utilities.$empty_string$.getGlobalValue();
            SubLObject following_whitespace = getf(info, $FOLLOWING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue());
            SubLObject whole_string = cconcatenate(leading_whitespace, new SubLObject[]{ leading_tags, main_string, following_tags, following_whitespace });
            return whole_string;
        }
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

    public static final SubLObject l2r_word_length_alt(SubLObject word, SubLObject include_tagsP) {
        if (include_tagsP == UNPROVIDED) {
            include_tagsP = NIL;
        }
        {
            SubLObject main_string = document.word_string(word);
            SubLObject info = document.word_info(word);
            SubLObject length = length(unicode_strings.display_to_unicode_vector(unicode_strings.utf8_string_to_display(unicode_strings.html_escaped_to_utf8_string(main_string))));
            length = add(length, length(com.cyc.cycjava.cycl.learning_reader.l2r_word_leading_whitespace(word)));
            if (NIL != include_tagsP) {
                length = add(length, length(getf(info, $LEADING_TAGS, string_utilities.$empty_string$.getGlobalValue())));
                length = add(length, length(getf(info, $FOLLOWING_TAGS, string_utilities.$empty_string$.getGlobalValue())));
            }
            length = add(length, length(getf(info, $FOLLOWING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue())));
            return length;
        }
    }

    public static SubLObject l2r_word_length(final SubLObject word, SubLObject include_tagsP) {
        if (include_tagsP == UNPROVIDED) {
            include_tagsP = NIL;
        }
        final SubLObject main_string = document.word_string(word);
        final SubLObject info = document.word_info(word);
        SubLObject length = length(unicode_strings.display_to_unicode_vector(unicode_strings.utf8_string_to_display(unicode_strings.html_escaped_to_utf8_string(main_string))));
        length = add(length, length(learning_reader.l2r_word_leading_whitespace(word)));
        if (NIL != include_tagsP) {
            length = add(length, length(getf(info, $LEADING_TAGS, string_utilities.$empty_string$.getGlobalValue())));
            length = add(length, length(getf(info, $FOLLOWING_TAGS, string_utilities.$empty_string$.getGlobalValue())));
        }
        length = add(length, length(getf(info, $FOLLOWING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue())));
        return length;
    }

    public static final SubLObject l2r_word_leading_whitespace_alt(SubLObject word) {
        {
            SubLObject info = document.word_info(word);
            return getf(info, $LEADING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue());
        }
    }

    public static SubLObject l2r_word_leading_whitespace(final SubLObject word) {
        final SubLObject info = document.word_info(word);
        return getf(info, $LEADING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue());
    }

    public static final SubLObject l2r_assert_subexpression_links_alt(SubLObject sentence, SubLObject sentence_peg, SubLObject v_document) {
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.learning_reader.l2r_extract_links_from_sentence(sentence, UNPROVIDED);
            SubLObject data = NIL;
            for (data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , data = cdolist_list_var.first()) {
                {
                    SubLObject datum = data;
                    SubLObject current = datum;
                    SubLObject html = NIL;
                    SubLObject this_html_offset = NIL;
                    SubLObject this_non_html_offset = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt345);
                    html = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt345);
                    this_html_offset = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt345);
                    this_non_html_offset = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject non_html = evaluation_defns.cyc_remove_html_tags(html);
                            SubLObject subexpression = list($$SubExpressionAtOffsetFn, sentence_peg, non_html, this_non_html_offset);
                            SubLObject mt = list($$InterpretingDocumentMtFn, v_document);
                            SubLObject sentence_28 = list($$subExpressionWithStringAtOffset, subexpression, sentence_peg, non_html, this_non_html_offset);
                            com.cyc.cycjava.cycl.learning_reader.l2r_assert(sentence_28, mt);
                            com.cyc.cycjava.cycl.learning_reader.l2r_assert_source_html(subexpression, html, mt, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt345);
                    }
                }
            }
        }
        return sentence;
    }

    public static SubLObject l2r_assert_subexpression_links(final SubLObject sentence, final SubLObject sentence_peg, final SubLObject v_document) {
        SubLObject cdolist_list_var = learning_reader.l2r_extract_links_from_sentence(sentence, UNPROVIDED);
        SubLObject data = NIL;
        data = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = data;
            SubLObject html = NIL;
            SubLObject this_html_offset = NIL;
            SubLObject this_non_html_offset = NIL;
            destructuring_bind_must_consp(current, datum, learning_reader.$list353);
            html = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, learning_reader.$list353);
            this_html_offset = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, learning_reader.$list353);
            this_non_html_offset = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject non_html = evaluation_defns.cyc_remove_html_tags(html);
                final SubLObject subexpression = list(learning_reader.$$SubExpressionAtOffsetFn, sentence_peg, non_html, this_non_html_offset);
                final SubLObject mt = list(learning_reader.$$InterpretingDocumentMtFn, v_document);
                final SubLObject sentence_$31 = list(learning_reader.$$subExpressionWithStringAtOffset, subexpression, sentence_peg, non_html, this_non_html_offset);
                learning_reader.l2r_assert(sentence_$31, mt);
                learning_reader.l2r_assert_source_html(subexpression, html, mt, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, learning_reader.$list353);
            }
            cdolist_list_var = cdolist_list_var.rest();
            data = cdolist_list_var.first();
        } 
        return sentence;
    }

    public static final SubLObject l2r_extract_links_from_sentence_alt(SubLObject sentence, SubLObject sanity_checkP) {
        if (sanity_checkP == UNPROVIDED) {
            sanity_checkP = T;
        }
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        {
            SubLObject links = NIL;
            SubLObject leading_whitespace_length = length(com.cyc.cycjava.cycl.learning_reader.l2r_word_leading_whitespace(document.sentence_get(sentence, ZERO_INTEGER)));
            SubLObject full_offset = minus(leading_whitespace_length);
            SubLObject non_html_offset = minus(leading_whitespace_length);
            SubLObject this_html_offset = $NONE;
            SubLObject this_non_html_offset = $NONE;
            SubLObject sentence_string = document.sentence_string(sentence);
            SubLObject full_string = (NIL != unicode_nauts.unicode_naut_p(sentence_string)) ? ((SubLObject) (unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(sentence_string, UNPROVIDED)))) : unicode_strings.unicode_display_to_html(sentence_string);
            SubLObject non_html_string = (NIL != sanity_checkP) ? ((SubLObject) (evaluation_defns.cyc_remove_html_tags(sentence_string))) : NIL;
            SubLObject inside_tagP = NIL;
            SubLObject html = string_utilities.$empty_string$.getGlobalValue();
            SubLObject vector_var = document.sentence_yield(sentence);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    SubLObject leading_tags = getf(document.word_info(word), $LEADING_TAGS, string_utilities.$empty_string$.getGlobalValue());
                    SubLObject first_wordP = (NIL != inside_tagP) ? ((SubLObject) (NIL)) : makeBoolean((NIL != search($str_alt350$_a, leading_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != search($$$href, leading_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                    inside_tagP = makeBoolean((NIL != first_wordP) || (NIL != inside_tagP));
                    if (NIL != first_wordP) {
                        {
                            SubLObject leading_whitespace_length_29 = length(com.cyc.cycjava.cycl.learning_reader.l2r_word_leading_whitespace(word));
                            this_html_offset = add(full_offset, leading_whitespace_length_29);
                            this_non_html_offset = add(non_html_offset, leading_whitespace_length_29);
                        }
                    }
                    if (NIL != inside_tagP) {
                        html = cconcatenate(html, com.cyc.cycjava.cycl.learning_reader.l2r_reconstruct_word_string(word, makeBoolean(NIL == first_wordP)));
                        if (NIL != search($str_alt352$__a, getf(document.word_info(word), $FOLLOWING_TAGS, string_utilities.$empty_string$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            if (NIL != sanity_checkP) {
                                com.cyc.cycjava.cycl.learning_reader.l2r_sanity_check_subexpression(html, non_html_string, this_non_html_offset, sentence_string, this_html_offset);
                            }
                            links = cons(list(html, this_html_offset, this_non_html_offset), links);
                            inside_tagP = NIL;
                            html = string_utilities.$empty_string$.getGlobalValue();
                        }
                    }
                    full_offset = add(full_offset, com.cyc.cycjava.cycl.learning_reader.l2r_word_length(word, T));
                    non_html_offset = add(non_html_offset, com.cyc.cycjava.cycl.learning_reader.l2r_word_length(word, NIL));
                }
            }
            return nreverse(links);
        }
    }

    public static SubLObject l2r_extract_links_from_sentence(final SubLObject sentence, SubLObject sanity_checkP) {
        if (sanity_checkP == UNPROVIDED) {
            sanity_checkP = T;
        }
        assert NIL != document.sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        SubLObject links = NIL;
        final SubLObject leading_whitespace_length = length(learning_reader.l2r_word_leading_whitespace(document.sentence_get(sentence, ZERO_INTEGER)));
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
            final SubLObject first_wordP = (NIL != inside_tagP) ? NIL : makeBoolean((NIL != search(learning_reader.$str358$_a, leading_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != search(learning_reader.$$$href, leading_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            inside_tagP = makeBoolean((NIL != first_wordP) || (NIL != inside_tagP));
            if (NIL != first_wordP) {
                final SubLObject leading_whitespace_length_$32 = length(learning_reader.l2r_word_leading_whitespace(word));
                this_html_offset = add(full_offset, leading_whitespace_length_$32);
                this_non_html_offset = add(non_html_offset, leading_whitespace_length_$32);
            }
            if (NIL != inside_tagP) {
                html = cconcatenate(html, learning_reader.l2r_reconstruct_word_string(word, makeBoolean(NIL == first_wordP)));
                if (NIL != search(learning_reader.$str360$__a, getf(document.word_info(word), $FOLLOWING_TAGS, string_utilities.$empty_string$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    if (NIL != sanity_checkP) {
                        learning_reader.l2r_sanity_check_subexpression(html, non_html_string, this_non_html_offset, sentence_string, this_html_offset);
                    }
                    links = cons(list(html, this_html_offset, this_non_html_offset), links);
                    inside_tagP = NIL;
                    html = string_utilities.$empty_string$.getGlobalValue();
                }
            }
            full_offset = add(full_offset, learning_reader.l2r_word_length(word, T));
            non_html_offset = add(non_html_offset, learning_reader.l2r_word_length(word, NIL));
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return nreverse(links);
    }

    public static final SubLObject l2r_sanity_check_subexpression_alt(SubLObject html, SubLObject non_html_string, SubLObject this_non_html_offset, SubLObject sentence_string, SubLObject this_html_offset) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject non_html = evaluation_defns.cyc_remove_html_tags(html);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!non_html.equal(evaluation_defns.cyc_substring(non_html_string, this_non_html_offset, add(this_non_html_offset, length(non_html))))) {
                        Errors.error($str_alt353$Bad_offset___S_at_offset__S_of__S, non_html, this_non_html_offset, non_html_string);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!html.equal(evaluation_defns.cyc_substring(sentence_string, this_html_offset, add(this_html_offset, length(html))))) {
                        Errors.error($str_alt353$Bad_offset___S_at_offset__S_of__S, html, this_html_offset, sentence_string);
                    }
                }
            }
            return $OK;
        }
    }

    public static SubLObject l2r_sanity_check_subexpression(final SubLObject html, final SubLObject non_html_string, final SubLObject this_non_html_offset, final SubLObject sentence_string, final SubLObject this_html_offset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject non_html = evaluation_defns.cyc_remove_html_tags(html);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!non_html.equal(evaluation_defns.cyc_substring(non_html_string, this_non_html_offset, add(this_non_html_offset, length(non_html)))))) {
            Errors.error(learning_reader.$str361$Bad_offset___S_at_offset__S_of__S, non_html, this_non_html_offset, non_html_string);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!html.equal(evaluation_defns.cyc_substring(sentence_string, this_html_offset, add(this_html_offset, length(html)))))) {
            Errors.error(learning_reader.$str361$Bad_offset___S_at_offset__S_of__S, html, this_html_offset, sentence_string);
        }
        return $OK;
    }

    /**
     *
     *
     * @return LISTP of the sentences of DOCUMENT.
     */
    @LispMethod(comment = "@return LISTP of the sentences of DOCUMENT.")
    public static final SubLObject l2r_sentences_for_document_alt(SubLObject v_document) {
        SubLTrampolineFile.checkType(v_document, CYCL_DENOTATIONAL_TERM_P);
        {
            SubLObject query_sentence = com.cyc.cycjava.cycl.learning_reader.l2r_document_sentence_finder_query_sentence(v_document);
            SubLObject kbq = com.cyc.cycjava.cycl.learning_reader.l2r_document_sentence_finder_kbq();
            SubLObject query_properties = kb_query.kbq_query_properties(kbq);
            SubLObject mt = kb_query.kbq_mt(kbq);
            return inference_kernel.new_cyc_query(query_sentence, mt, query_properties);
        }
    }

    /**
     *
     *
     * @return LISTP of the sentences of DOCUMENT.
     */
    @LispMethod(comment = "@return LISTP of the sentences of DOCUMENT.")
    public static SubLObject l2r_sentences_for_document(final SubLObject v_document) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "! cycl_grammar.cycl_denotational_term_p(v_document) " + ("cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) ") + v_document;
        final SubLObject query_sentence = learning_reader.l2r_document_sentence_finder_query_sentence(v_document);
        final SubLObject kbq = learning_reader.l2r_document_sentence_finder_kbq();
        final SubLObject query_properties = kb_query.kbq_query_properties(kbq);
        final SubLObject mt = kb_query.kbq_mt(kbq);
        return inference_kernel.new_cyc_query(query_sentence, mt, query_properties);
    }

    public static final SubLObject clear_l2r_document_sentence_finder_kbq_alt() {
        {
            SubLObject cs = $l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_l2r_document_sentence_finder_kbq() {
        final SubLObject cs = learning_reader.$l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_l2r_document_sentence_finder_kbq_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_l2r_document_sentence_finder_kbq() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject l2r_document_sentence_finder_kbq_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject kbq = $const356$ReifySentencePegQuery_FindSentenc;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == valid_constantP(kbq, T)) {
                        Errors.error($str_alt357$Failed_to_validate___ReifySentenc);
                    }
                }
                return kbq;
            }
        }
    }

    public static SubLObject l2r_document_sentence_finder_kbq_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kbq = learning_reader.$const364$ReifySentencePegQuery_FindSentenc;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == valid_constantP(kbq, T))) {
            Errors.error(learning_reader.$str365$Failed_to_validate___ReifySentenc);
        }
        return kbq;
    }

    public static final SubLObject l2r_document_sentence_finder_kbq_alt() {
        {
            SubLObject caching_state = $l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(L2R_DOCUMENT_SENTENCE_FINDER_KBQ, $sym358$_L2R_DOCUMENT_SENTENCE_FINDER_KBQ_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw295$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.learning_reader.l2r_document_sentence_finder_kbq_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject l2r_document_sentence_finder_kbq() {
        SubLObject caching_state = learning_reader.$l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(learning_reader.L2R_DOCUMENT_SENTENCE_FINDER_KBQ, learning_reader.$sym366$_L2R_DOCUMENT_SENTENCE_FINDER_KBQ_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(learning_reader.l2r_document_sentence_finder_kbq_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject l2r_document_sentence_finder_query_sentence_alt(SubLObject v_document) {
        SubLTrampolineFile.checkType(v_document, CYCL_DENOTATIONAL_TERM_P);
        {
            SubLObject kbq = com.cyc.cycjava.cycl.learning_reader.l2r_document_sentence_finder_kbq();
            SubLObject indexical_sentence = kb_query.kbq_sentence(kbq);
            SubLObject document_indexical = com.cyc.cycjava.cycl.learning_reader.l2r_document_indexical();
            SubLObject dereferenced_sentence = cycl_utilities.expression_subst(v_document, document_indexical, indexical_sentence, symbol_function($sym359$EQUALS_EL_), UNPROVIDED);
            return dereferenced_sentence;
        }
    }

    public static SubLObject l2r_document_sentence_finder_query_sentence(final SubLObject v_document) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "! cycl_grammar.cycl_denotational_term_p(v_document) " + ("cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) ") + v_document;
        final SubLObject kbq = learning_reader.l2r_document_sentence_finder_kbq();
        final SubLObject indexical_sentence = kb_query.kbq_sentence(kbq);
        final SubLObject document_indexical = learning_reader.l2r_document_indexical();
        final SubLObject dereferenced_sentence = cycl_utilities.expression_subst(v_document, document_indexical, indexical_sentence, symbol_function(learning_reader.$sym367$EQUALS_EL_), UNPROVIDED);
        return dereferenced_sentence;
    }

    /**
     * Given a URL, gets a bunch of non-marked up sentences, then tries to
     * assert linkages for each of those sentences that appears to have
     * real content via simple mechanisms.  When the 'wikipedia' flag is
     * set, the heuristics for determining what has 'content' are very
     * Wikipedia-specific, and we're erring on the side of throwing things
     * out.  By default, we assume it's a wikipedia page; nothing will break
     * if it isn't, but content may be unexpectedly stripped.
     */
    @LispMethod(comment = "Given a URL, gets a bunch of non-marked up sentences, then tries to\r\nassert linkages for each of those sentences that appears to have\r\nreal content via simple mechanisms.  When the \'wikipedia\' flag is\r\nset, the heuristics for determining what has \'content\' are very\r\nWikipedia-specific, and we\'re erring on the side of throwing things\r\nout.  By default, we assume it\'s a wikipedia page; nothing will break\r\nif it isn\'t, but content may be unexpectedly stripped.\nGiven a URL, gets a bunch of non-marked up sentences, then tries to\nassert linkages for each of those sentences that appears to have\nreal content via simple mechanisms.  When the \'wikipedia\' flag is\nset, the heuristics for determining what has \'content\' are very\nWikipedia-specific, and we\'re erring on the side of throwing things\nout.  By default, we assume it\'s a wikipedia page; nothing will break\nif it isn\'t, but content may be unexpectedly stripped.")
    public static final SubLObject simple_assert_linkages_for_page_alt(SubLObject url, SubLObject wikipedia_pageP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = T;
        }
        SubLTrampolineFile.checkType(url, NON_EMPTY_STRING_P);
        format(T, $str_alt361$Asserting_linkages_for____);
        {
            SubLObject cdolist_list_var = reverse(com.cyc.cycjava.cycl.learning_reader.page_to_detagged_sentence_strings(url, wikipedia_pageP, UNPROVIDED));
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                if (!((NIL == lexicon_accessors.contains_closed_lexical_class_wordP(sentence)) || ((NIL != wikipedia_pageP) && (NIL != com.cyc.cycjava.cycl.learning_reader.probably_wikipedia_meta_sentence_p(sentence))))) {
                    {
                        SubLObject cycl_sentence = unicode_nauts.display_vector_string_to_cycl_safe_string(unicode_strings.html_escaped_to_display(sentence));
                        format(T, $str_alt362$_____A__, cycl_sentence);
                        linkage_assertion.assert_linkage(cycl_sentence, T, NIL, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Given a URL, gets a bunch of non-marked up sentences, then tries to
     * assert linkages for each of those sentences that appears to have
     * real content via simple mechanisms.  When the 'wikipedia' flag is
     * set, the heuristics for determining what has 'content' are very
     * Wikipedia-specific, and we're erring on the side of throwing things
     * out.  By default, we assume it's a wikipedia page; nothing will break
     * if it isn't, but content may be unexpectedly stripped.
     */
    @LispMethod(comment = "Given a URL, gets a bunch of non-marked up sentences, then tries to\r\nassert linkages for each of those sentences that appears to have\r\nreal content via simple mechanisms.  When the \'wikipedia\' flag is\r\nset, the heuristics for determining what has \'content\' are very\r\nWikipedia-specific, and we\'re erring on the side of throwing things\r\nout.  By default, we assume it\'s a wikipedia page; nothing will break\r\nif it isn\'t, but content may be unexpectedly stripped.\nGiven a URL, gets a bunch of non-marked up sentences, then tries to\nassert linkages for each of those sentences that appears to have\nreal content via simple mechanisms.  When the \'wikipedia\' flag is\nset, the heuristics for determining what has \'content\' are very\nWikipedia-specific, and we\'re erring on the side of throwing things\nout.  By default, we assume it\'s a wikipedia page; nothing will break\nif it isn\'t, but content may be unexpectedly stripped.")
    public static SubLObject simple_assert_linkages_for_page(final SubLObject url, SubLObject wikipedia_pageP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = T;
        }
        assert NIL != string_utilities.non_empty_string_p(url) : "! string_utilities.non_empty_string_p(url) " + ("string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) ") + url;
        format(T, learning_reader.$str369$Asserting_linkages_for____);
        SubLObject cdolist_list_var = reverse(learning_reader.page_to_detagged_sentence_strings(url, wikipedia_pageP, UNPROVIDED));
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != lexicon_accessors.contains_closed_lexical_class_wordP(sentence)) && ((NIL == wikipedia_pageP) || (NIL == learning_reader.probably_wikipedia_meta_sentence_p(sentence)))) {
                final SubLObject cycl_sentence = unicode_nauts.display_vector_string_to_cycl_safe_string(unicode_strings.html_escaped_to_display(sentence));
                format(T, learning_reader.$str370$_____A__, cycl_sentence);
                linkage_assertion.assert_linkage(cycl_sentence, T, NIL, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Given a URL, gets a bunch of non-marked up sentences, then tries to
     * parse each of them with the Cyclifier in :l2r mode.
     *
     * @param WIKIPEDIA-PAGE?
     * 		booleanp; When non-NIL, the heuristics for determining
     * 		what has 'content' are very Wikipedia-specific, and we're erring on the side of
     * 		throwing things out.
     * 		By default, we assume it's a wikipedia page; nothing will break
     * 		if it isn't, but content may be unexpectedly stripped.
     */
    @LispMethod(comment = "Given a URL, gets a bunch of non-marked up sentences, then tries to\r\nparse each of them with the Cyclifier in :l2r mode.\r\n\r\n@param WIKIPEDIA-PAGE?\r\n\t\tbooleanp; When non-NIL, the heuristics for determining\r\n\t\twhat has \'content\' are very Wikipedia-specific, and we\'re erring on the side of\r\n\t\tthrowing things out.\r\n\t\tBy default, we assume it\'s a wikipedia page; nothing will break\r\n\t\tif it isn\'t, but content may be unexpectedly stripped.\nGiven a URL, gets a bunch of non-marked up sentences, then tries to\nparse each of them with the Cyclifier in :l2r mode.")
    public static final SubLObject l2r_cyclify_webpage_alt(SubLObject url, SubLObject directory, SubLObject wikipedia_pageP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(url, NON_EMPTY_STRING_P);
            format(T, $str_alt363$Using_L2R_Webpage_Cyclifier_with_, $learning_reader_timestamp$.getGlobalValue());
            force_output(T);
            if (NIL == Filesys.directory_p(directory)) {
                file_utilities.make_directory_recursive(directory, NIL, UNPROVIDED);
            }
            {
                SubLObject sentences_directory = file_utilities.relative_filename(directory, $str_alt364$sentences_, UNPROVIDED);
                SubLObject sentences_directory_existsP = Filesys.directory_p(sentences_directory);
                if (NIL == sentences_directory_existsP) {
                    Filesys.make_directory(sentences_directory, NIL, $int$511);
                }
                {
                    SubLObject links_file = file_utilities.relative_filename(directory, $$$links, UNPROVIDED);
                    SubLObject get_linksP = makeBoolean(NIL == Filesys.probe_file(links_file));
                    thread.resetMultipleValues();
                    {
                        SubLObject sentences = com.cyc.cycjava.cycl.learning_reader.page_to_detagged_sentence_strings(url, wikipedia_pageP, get_linksP);
                        SubLObject links = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != links) {
                            com.cyc.cycjava.cycl.learning_reader.l2r_write_webpage_links(links, url, links_file);
                        }
                        com.cyc.cycjava.cycl.learning_reader.l2r_save_new_webpage_sentences(sentences, sentences_directory, url, wikipedia_pageP);
                    }
                }
                com.cyc.cycjava.cycl.learning_reader.l2r_cyclify_unparsed_sentences(sentences_directory);
            }
            return NIL;
        }
    }

    /**
     * Given a URL, gets a bunch of non-marked up sentences, then tries to
     * parse each of them with the Cyclifier in :l2r mode.
     *
     * @param WIKIPEDIA-PAGE?
     * 		booleanp; When non-NIL, the heuristics for determining
     * 		what has 'content' are very Wikipedia-specific, and we're erring on the side of
     * 		throwing things out.
     * 		By default, we assume it's a wikipedia page; nothing will break
     * 		if it isn't, but content may be unexpectedly stripped.
     */
    @LispMethod(comment = "Given a URL, gets a bunch of non-marked up sentences, then tries to\r\nparse each of them with the Cyclifier in :l2r mode.\r\n\r\n@param WIKIPEDIA-PAGE?\r\n\t\tbooleanp; When non-NIL, the heuristics for determining\r\n\t\twhat has \'content\' are very Wikipedia-specific, and we\'re erring on the side of\r\n\t\tthrowing things out.\r\n\t\tBy default, we assume it\'s a wikipedia page; nothing will break\r\n\t\tif it isn\'t, but content may be unexpectedly stripped.\nGiven a URL, gets a bunch of non-marked up sentences, then tries to\nparse each of them with the Cyclifier in :l2r mode.")
    public static SubLObject l2r_cyclify_webpage(final SubLObject url, final SubLObject directory, SubLObject wikipedia_pageP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != string_utilities.non_empty_string_p(url) : "! string_utilities.non_empty_string_p(url) " + ("string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) ") + url;
        format(T, learning_reader.$str371$Using_L2R_Webpage_Cyclifier_with_, learning_reader.$learning_reader_timestamp$.getGlobalValue());
        force_output(T);
        if (NIL == Filesys.directory_p(directory)) {
            file_utilities.make_directory_recursive(directory, NIL, UNPROVIDED);
        }
        final SubLObject sentences_directory = file_utilities.relative_filename(directory, learning_reader.$str372$sentences_, UNPROVIDED);
        final SubLObject sentences_directory_existsP = Filesys.directory_p(sentences_directory);
        if (NIL == sentences_directory_existsP) {
            Filesys.make_directory(sentences_directory, NIL, learning_reader.$int$511);
        }
        final SubLObject links_file = file_utilities.relative_filename(directory, learning_reader.$$$links, UNPROVIDED);
        final SubLObject get_linksP = makeBoolean(NIL == Filesys.probe_file(links_file));
        thread.resetMultipleValues();
        final SubLObject sentences = learning_reader.page_to_detagged_sentence_strings(url, wikipedia_pageP, get_linksP);
        final SubLObject links = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != links) {
            learning_reader.l2r_write_webpage_links(links, url, links_file);
        }
        learning_reader.l2r_save_new_webpage_sentences(sentences, sentences_directory, url, wikipedia_pageP);
        learning_reader.l2r_cyclify_unparsed_sentences(sentences_directory);
        return NIL;
    }

    public static final SubLObject l2r_write_webpage_links_alt(SubLObject links, SubLObject url, SubLObject links_file) {
        format(T, $str_alt367$__Writing__S_links_from__S_to__S_, new SubLObject[]{ length(links), url, links_file });
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(links_file, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt369$Unable_to_open__S, links_file);
                }
                {
                    SubLObject stream_30 = stream;
                    SubLObject cdolist_list_var = links;
                    SubLObject link = NIL;
                    for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                        princ(link, stream_30);
                        terpri(stream_30);
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
        return links_file;
    }

    public static SubLObject l2r_write_webpage_links(final SubLObject links, final SubLObject url, final SubLObject links_file) {
        format(T, learning_reader.$str375$__Writing__S_links_from__S_to__S_, new SubLObject[]{ length(links), url, links_file });
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(links_file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error(learning_reader.$str377$Unable_to_open__S, links_file);
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

    public static final SubLObject l2r_cyclify_wikipedia_pages_for_unknown_phrases_alt(SubLObject links_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unknown_phrase_links = com.cyc.cycjava.cycl.learning_reader.l2r_get_unknown_phrase_wikipedia_links_from_file(links_file);
                if (NIL != list_utilities.non_empty_list_p(unknown_phrase_links)) {
                    {
                        SubLObject path = file_utilities.deconstruct_path(links_file);
                        SubLObject base_uri_string = $str_alt370$http___en_wikipedia_org_;
                        SubLObject directory = file_utilities.reconstruct_path(butlast(path, UNPROVIDED), $str_alt371$, UNPROVIDED);
                        SubLObject message = cconcatenate($$$Following_unknown_phrase_links_in, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $str_alt373$_, format_nil.format_nil_s_no_copy(links_file) });
                        SubLObject done = ZERO_INTEGER;
                        SubLObject total = length(unknown_phrase_links);
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
                                noting_percent_progress_preamble(message);
                                {
                                    SubLObject cdolist_list_var = unknown_phrase_links;
                                    SubLObject link = NIL;
                                    for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                                        {
                                            SubLObject link_relative_url = com.cyc.cycjava.cycl.learning_reader.extract_link_relative_url(link);
                                            SubLObject subdirectory_name = cconcatenate(list_utilities.last_one(string_utilities.string_tokenize(link_relative_url, $list_alt374, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), $str_alt375$_);
                                            SubLObject new_directory = file_utilities.relative_filename(directory, subdirectory_name, UNPROVIDED);
                                            SubLObject link_url = web_utilities.absolute_url_from_relative_url_and_base(link_relative_url, base_uri_string);
                                            if (link_url.isString()) {
                                                com.cyc.cycjava.cycl.learning_reader.l2r_cyclify_webpage(link_url, new_directory, T);
                                            }
                                        }
                                        done = add(done, ONE_INTEGER);
                                        note_percent_progress(done, total);
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
                    }
                }
                return unknown_phrase_links;
            }
        }
    }

    public static SubLObject l2r_cyclify_wikipedia_pages_for_unknown_phrases(final SubLObject links_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unknown_phrase_links = learning_reader.l2r_get_unknown_phrase_wikipedia_links_from_file(links_file);
        if (NIL != list_utilities.non_empty_list_p(unknown_phrase_links)) {
            final SubLObject path = file_utilities.deconstruct_path(links_file);
            final SubLObject base_uri_string = learning_reader.$str378$http___en_wikipedia_org_;
            final SubLObject directory = file_utilities.reconstruct_path(butlast(path, UNPROVIDED), learning_reader.$str379$, UNPROVIDED);
            final SubLObject message = cconcatenate(learning_reader.$$$Following_unknown_phrase_links_in, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), learning_reader.$$$_, format_nil.format_nil_s_no_copy(links_file) });
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
                        final SubLObject link_relative_url = learning_reader.extract_link_relative_url(link);
                        final SubLObject subdirectory_name = cconcatenate(list_utilities.last_one(string_utilities.string_tokenize(link_relative_url, learning_reader.$list382, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), learning_reader.$str383$_);
                        final SubLObject new_directory = file_utilities.relative_filename(directory, subdirectory_name, UNPROVIDED);
                        final SubLObject link_url = web_utilities.absolute_url_from_relative_url_and_base(link_relative_url, base_uri_string);
                        if (link_url.isString()) {
                            learning_reader.l2r_cyclify_webpage(link_url, new_directory, T);
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

    public static final SubLObject l2r_get_unknown_phrase_wikipedia_links_from_file_alt(SubLObject links_file) {
        {
            SubLObject unknown_phrase_links = NIL;
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(links_file, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt369$Unable_to_open__S, links_file);
                }
                {
                    SubLObject stream_31 = stream;
                    SubLObject line = read_line(stream_31, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    while (line.isString()) {
                        if (NIL != com.cyc.cycjava.cycl.learning_reader.unknown_phrase_wikipedia_linkP(line)) {
                            unknown_phrase_links = cons(line, unknown_phrase_links);
                        }
                        line = read_line(stream_31, NIL, NIL, UNPROVIDED);
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
            return nreverse(unknown_phrase_links);
        }
    }

    public static SubLObject l2r_get_unknown_phrase_wikipedia_links_from_file(final SubLObject links_file) {
        SubLObject unknown_phrase_links = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(links_file, $INPUT);
            if (!stream.isStream()) {
                Errors.error(learning_reader.$str377$Unable_to_open__S, links_file);
            }
            for (SubLObject stream_$35 = stream, line = read_line(stream_$35, UNPROVIDED, UNPROVIDED, UNPROVIDED); line.isString(); line = read_line(stream_$35, NIL, NIL, UNPROVIDED)) {
                if (NIL != learning_reader.unknown_phrase_wikipedia_linkP(line)) {
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

    public static final SubLObject extract_link_relative_url_alt(SubLObject link) {
        {
            SubLObject quoted = string_utilities.string_tokenize(link, $list_alt377, NIL, NIL, T, UNPROVIDED, UNPROVIDED).first();
            return quoted.isString() ? ((SubLObject) (read_from_string(quoted, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
        }
    }

    public static SubLObject extract_link_relative_url(final SubLObject link) {
        final SubLObject quoted = string_utilities.string_tokenize(link, learning_reader.$list385, NIL, NIL, T, UNPROVIDED, UNPROVIDED).first();
        return quoted.isString() ? read_from_string(quoted, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static final SubLObject unknown_phrase_wikipedia_linkP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.learning_reader.unknown_phrase_linkP(v_object)) && (NIL != string_utilities.starts_with(v_object, $str_alt378$_a_href___wiki_)));
    }

    public static SubLObject unknown_phrase_wikipedia_linkP(final SubLObject v_object) {
        return makeBoolean((NIL != learning_reader.unknown_phrase_linkP(v_object)) && (NIL != string_utilities.starts_with(v_object, learning_reader.$str386$_a_href___wiki_)));
    }

    /**
     *
     *
     * @return T iff OBJECT is an html link whose text is not a known phrase.
     */
    @LispMethod(comment = "@return T iff OBJECT is an html link whose text is not a known phrase.")
    public static final SubLObject unknown_phrase_linkP_alt(SubLObject v_object) {
        {
            SubLObject ans = NIL;
            if (((NIL != string_utilities.non_empty_string_p(v_object)) && (NIL != search($str_alt379$a_href_, v_object, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == search($str_alt380$_img_, v_object, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                {
                    SubLObject stripped = evaluation_defns.cyc_remove_html_tags(v_object);
                    ans = makeBoolean((((NIL == lexicon_accessors.denots_of_string(stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find_if(PUNCTUATION_P, stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != find(CHAR_space, stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == psp_main.ps_get_cycls_for_phrase(stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return T iff OBJECT is an html link whose text is not a known phrase.
     */
    @LispMethod(comment = "@return T iff OBJECT is an html link whose text is not a known phrase.")
    public static SubLObject unknown_phrase_linkP(final SubLObject v_object) {
        SubLObject ans = NIL;
        if (((NIL != string_utilities.non_empty_string_p(v_object)) && (NIL != search(learning_reader.$str387$a_href_, v_object, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == search(learning_reader.$str388$_img_, v_object, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            final SubLObject stripped = evaluation_defns.cyc_remove_html_tags(v_object);
            ans = makeBoolean((((NIL == lexicon_accessors.denots_of_string(stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find_if(learning_reader.PUNCTUATION_P, stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != find(CHAR_space, stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == psp_main.ps_get_cycls_for_phrase(stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return ans;
    }

    public static final SubLObject l2r_save_new_webpage_sentences_alt(SubLObject sentences, SubLObject sentences_directory, SubLObject url, SubLObject wikipedia_pageP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence_num = ZERO_INTEGER;
                SubLObject sentence_directories = NIL;
                SubLObject list_var = sentences;
                $progress_note$.setDynamicValue(cconcatenate($str_alt382$Logging_cyclifications_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(url), $str_alt383$__, format_nil.$format_nil_percent$.getGlobalValue() }), thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject cycl_sentence = NIL;
                            for (cycl_sentence = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , cycl_sentence = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject subl_sentence = (NIL != unicode_nauts.unicode_naut_p(cycl_sentence)) ? ((SubLObject) (unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(cycl_sentence, UNPROVIDED)))) : cycl_sentence;
                                    if (!((NIL == lexicon_accessors.contains_closed_lexical_class_wordP(subl_sentence)) || ((NIL != wikipedia_pageP) && (NIL != com.cyc.cycjava.cycl.learning_reader.probably_wikipedia_meta_sentence_p(subl_sentence))))) {
                                        {
                                            SubLObject sentence_directory_name = format(NIL, $str_alt384$sentence__3__0D_, sentence_num);
                                            SubLObject sentence_directory = file_utilities.relative_filename(sentences_directory, sentence_directory_name, UNPROVIDED);
                                            if (NIL == Filesys.directory_p(sentence_directory)) {
                                                Filesys.make_directory(sentence_directory, NIL, $int$511);
                                                if (NIL == Filesys.directory_p(sentence_directory)) {
                                                    sleep(ONE_INTEGER);
                                                    if (NIL == Filesys.directory_p(sentence_directory)) {
                                                        Errors.error($str_alt385$Couldn_t_make_directory_____S, sentence_directory);
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject output_file = file_utilities.relative_filename(sentence_directory, $str_alt386$sentence_text_lisp, UNPROVIDED);
                                                if (NIL == Filesys.probe_file(output_file)) {
                                                    {
                                                        SubLObject stream = NIL;
                                                        try {
                                                            stream = compatibility.open_text(output_file, $OUTPUT, NIL);
                                                            if (!stream.isStream()) {
                                                                Errors.error($str_alt369$Unable_to_open__S, output_file);
                                                            }
                                                            {
                                                                SubLObject stream_32 = stream;
                                                                print(cycl_sentence, stream_32);
                                                                force_output(stream_32);
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (stream.isStream()) {
                                                                        close(stream, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_33, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                sentence_directories = cons(sentence_directory, sentence_directories);
                                            }
                                        }
                                        sentence_num = add(sentence_num, ONE_INTEGER);
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
                return sentence_directories;
            }
        }
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
            $progress_note$.bind(NIL != cconcatenate(learning_reader.$$$Logging_cyclifications_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(url), learning_reader.$str391$__, format_nil.$format_nil_percent$.getGlobalValue() }) ? cconcatenate(learning_reader.$$$Logging_cyclifications_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(url), learning_reader.$str391$__, format_nil.$format_nil_percent$.getGlobalValue() }) : learning_reader.$$$cdolist, thread);
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
                    if ((NIL != lexicon_accessors.contains_closed_lexical_class_wordP(subl_sentence)) && ((NIL == wikipedia_pageP) || (NIL == learning_reader.probably_wikipedia_meta_sentence_p(subl_sentence)))) {
                        final SubLObject sentence_directory_name = format(NIL, learning_reader.$str392$sentence__3__0D_, sentence_num);
                        final SubLObject sentence_directory = file_utilities.relative_filename(sentences_directory, sentence_directory_name, UNPROVIDED);
                        if (NIL == Filesys.directory_p(sentence_directory)) {
                            Filesys.make_directory(sentence_directory, NIL, learning_reader.$int$511);
                            if (NIL == Filesys.directory_p(sentence_directory)) {
                                sleep(ONE_INTEGER);
                                if (NIL == Filesys.directory_p(sentence_directory)) {
                                    Errors.error(learning_reader.$str393$Couldn_t_make_directory_____S, sentence_directory);
                                }
                            }
                        }
                        final SubLObject output_file = file_utilities.relative_filename(sentence_directory, learning_reader.$str394$sentence_text_lisp, UNPROVIDED);
                        if (NIL == Filesys.probe_file(output_file)) {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(output_file, $OUTPUT);
                                if (!stream.isStream()) {
                                    Errors.error(learning_reader.$str377$Unable_to_open__S, output_file);
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

    public static final SubLObject l2r_cyclify_unparsed_sentences_alt(SubLObject sentences_directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(T, $str_alt387$__Cyclifying_unparsed_sentences_f, sentences_directory);
            SubLTrampolineFile.checkType(sentences_directory, DIRECTORY_P);
            {
                SubLObject directory_contents_var = Filesys.directory(sentences_directory, T);
                SubLObject progress_message_var = NIL;
                {
                    SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
                    try {
                        $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                        {
                            SubLObject list_var = directory_contents_var;
                            $progress_note$.setDynamicValue(progress_message_var, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_34 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject sentence_directory = NIL;
                                        for (sentence_directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , sentence_directory = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            if ((NIL != Filesys.directory_p(sentence_directory)) && (NIL != string_utilities.starts_with(nth_value_step_2(nth_value_step_1(ONE_INTEGER), file_utilities.deconstruct_path(sentence_directory)), $str_alt388$sentence_))) {
                                                if (NIL == string_utilities.ends_with(sentence_directory, $str_alt375$_, UNPROVIDED)) {
                                                    sentence_directory = cconcatenate(sentence_directory, $str_alt375$_);
                                                }
                                                com.cyc.cycjava.cycl.learning_reader.l2r_log_cyclifications_for_unparsed_sentences(sentence_directory);
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_34, thread);
                                }
                            }
                        }
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return sentences_directory;
        }
    }

    public static SubLObject l2r_cyclify_unparsed_sentences(final SubLObject sentences_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, learning_reader.$str395$__Cyclifying_unparsed_sentences_f, sentences_directory);
        assert NIL != Filesys.directory_p(sentences_directory) : "! Filesys.directory_p(sentences_directory) " + ("Filesys.directory_p(sentences_directory) " + "CommonSymbols.NIL != Filesys.directory_p(sentences_directory) ") + sentences_directory;
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
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : learning_reader.$$$cdolist, thread);
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
                        if ((NIL != Filesys.directory_p(sentence_directory)) && (NIL != string_utilities.starts_with(nth_value_step_2(nth_value_step_1(ONE_INTEGER), file_utilities.deconstruct_path(sentence_directory)), learning_reader.$str396$sentence_))) {
                            if (NIL == string_utilities.ends_with(sentence_directory, learning_reader.$str383$_, UNPROVIDED)) {
                                sentence_directory = cconcatenate(sentence_directory, learning_reader.$str383$_);
                            }
                            learning_reader.l2r_log_cyclifications_for_unparsed_sentences(sentence_directory);
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

    public static final SubLObject l2r_log_cyclifications_for_unparsed_sentences_alt(SubLObject sentence_directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence_file = file_utilities.relative_filename(sentence_directory, $str_alt386$sentence_text_lisp, UNPROVIDED);
                SubLObject parsed_sentence_file = file_utilities.relative_filename(sentence_directory, $str_alt389$sentence_parsed_lisp, UNPROVIDED);
                SubLObject parses = NIL;
                SubLObject cycl_sentence = NIL;
                if (NIL != Filesys.probe_file(parsed_sentence_file)) {
                    format(T, $str_alt390$__Skipping_already_parsed__S__, parsed_sentence_file);
                } else {
                    if (NIL != Filesys.probe_file(sentence_file)) {
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(sentence_file, $INPUT, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt369$Unable_to_open__S, sentence_file);
                                }
                                {
                                    SubLObject stream_35 = stream;
                                    cycl_sentence = read(stream_35, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                        format(T, $str_alt391$__Parsing__S__, cycl_sentence);
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(sentence_file, $OUTPUT, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt369$Unable_to_open__S, sentence_file);
                                }
                                {
                                    SubLObject stream_36 = stream;
                                    print(cycl_sentence, stream_36);
                                    force_output(stream_36);
                                    {
                                        SubLObject _prev_bind_0 = cyclifier.$cyclifier_catch_errorsP$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = textual_entailments.$ti_catch_errorsP$.currentBinding(thread);
                                        try {
                                            cyclifier.$cyclifier_catch_errorsP$.bind(T, thread);
                                            textual_entailments.$ti_catch_errorsP$.bind(T, thread);
                                            parses = (evaluation_defns.cyc_length(cycl_sentence).isPositive()) ? ((SubLObject) (textual_entailments.ti_get_best_interps_for_string(cycl_sentence, $L2R))) : NIL;
                                        } finally {
                                            textual_entailments.$ti_catch_errorsP$.rebind(_prev_bind_1, thread);
                                            cyclifier.$cyclifier_catch_errorsP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    print(Mapping.mapcar(HL_TO_EL, parses), stream_36);
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                        file_utilities.move_file(sentence_file, parsed_sentence_file);
                        format(T, $str_alt393$___Logged__S_sentence_parses_to__, length(parses), parsed_sentence_file);
                    } else {
                        Errors.error($str_alt394$No_sentence_to_parse_in__S, sentence_directory);
                    }
                }
                return parses;
            }
        }
    }

    public static SubLObject l2r_log_cyclifications_for_unparsed_sentences(final SubLObject sentence_directory) {
        final SubLObject sentence_file = file_utilities.relative_filename(sentence_directory, learning_reader.$str394$sentence_text_lisp, UNPROVIDED);
        final SubLObject parsed_sentence_file = file_utilities.relative_filename(sentence_directory, learning_reader.$str397$sentence_parsed_lisp, UNPROVIDED);
        final SubLObject parses = NIL;
        SubLObject cycl_sentence = NIL;
        if (NIL != Filesys.probe_file(parsed_sentence_file)) {
            format(T, learning_reader.$str398$__Skipping_already_parsed__S__, parsed_sentence_file);
        } else
            if (NIL != Filesys.probe_file(sentence_file)) {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(sentence_file, $INPUT);
                    if (!stream.isStream()) {
                        Errors.error(learning_reader.$str377$Unable_to_open__S, sentence_file);
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
                format(T, learning_reader.$str399$__Parsing__S__, cycl_sentence);
                stream = NIL;
                try {
                    stream = compatibility.open_text(sentence_file, $OUTPUT);
                    if (!stream.isStream()) {
                        Errors.error(learning_reader.$str377$Unable_to_open__S, sentence_file);
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
                format(T, learning_reader.$str400$___Logged__S_sentence_parses_to__, length(parses), parsed_sentence_file);
            } else {
                Errors.error(learning_reader.$str401$No_sentence_to_parse_in__S, sentence_directory);
            }

        return parses;
    }

    public static final SubLObject html_eos_open_tags_alt() {
        if (NIL != $html_eos_open_tags$.getGlobalValue()) {
            return $html_eos_open_tags$.getGlobalValue();
        } else {
            $html_eos_open_tags$.setGlobalValue(list_utilities.mapcar_product(symbol_function(CCONCATENATE), $list_alt397, union(string_utilities.string_list_upcase($html_implicit_eos_tags$.getGlobalValue()), string_utilities.string_list_downcase($html_implicit_eos_tags$.getGlobalValue()), UNPROVIDED, UNPROVIDED)));
            return $html_eos_open_tags$.getGlobalValue();
        }
    }

    public static SubLObject html_eos_open_tags() {
        if (NIL != learning_reader.$html_eos_open_tags$.getGlobalValue()) {
            return learning_reader.$html_eos_open_tags$.getGlobalValue();
        }
        learning_reader.$html_eos_open_tags$.setGlobalValue(list_utilities.mapcar_product(symbol_function(CCONCATENATE), learning_reader.$list404, union(string_utilities.string_list_upcase(learning_reader.$html_implicit_eos_tags$.getGlobalValue()), string_utilities.string_list_downcase(learning_reader.$html_implicit_eos_tags$.getGlobalValue()), UNPROVIDED, UNPROVIDED)));
        return learning_reader.$html_eos_open_tags$.getGlobalValue();
    }

    public static final SubLObject html_eos_close_tags_alt() {
        if (NIL != $html_eos_close_tags$.getGlobalValue()) {
            return $html_eos_close_tags$.getGlobalValue();
        } else {
            $html_eos_close_tags$.setGlobalValue(list_utilities.mapcar_product(symbol_function(CCONCATENATE), list_utilities.mapcar_product(symbol_function(CCONCATENATE), $list_alt398, union(string_utilities.string_list_upcase($html_implicit_eos_tags$.getGlobalValue()), string_utilities.string_list_downcase($html_implicit_eos_tags$.getGlobalValue()), UNPROVIDED, UNPROVIDED)), $list_alt399));
            return $html_eos_close_tags$.getGlobalValue();
        }
    }

    public static SubLObject html_eos_close_tags() {
        if (NIL != learning_reader.$html_eos_close_tags$.getGlobalValue()) {
            return learning_reader.$html_eos_close_tags$.getGlobalValue();
        }
        learning_reader.$html_eos_close_tags$.setGlobalValue(list_utilities.mapcar_product(symbol_function(CCONCATENATE), list_utilities.mapcar_product(symbol_function(CCONCATENATE), learning_reader.$list405, union(string_utilities.string_list_upcase(learning_reader.$html_implicit_eos_tags$.getGlobalValue()), string_utilities.string_list_downcase(learning_reader.$html_implicit_eos_tags$.getGlobalValue()), UNPROVIDED, UNPROVIDED)), learning_reader.$list406));
        return learning_reader.$html_eos_close_tags$.getGlobalValue();
    }

    public static final SubLObject wikipedia_meta_strings_alt() {
        return $wikipedia_meta_strings$.getGlobalValue();
    }

    public static SubLObject wikipedia_meta_strings() {
        return learning_reader.$wikipedia_meta_strings$.getGlobalValue();
    }

    /**
     * Replace anything that might represent an end-of-thought with
     * esc, which sentencify-string will treat as an EOS.  Takes a
     * list of tokens, returns a substituted list.
     */
    @LispMethod(comment = "Replace anything that might represent an end-of-thought with\r\nesc, which sentencify-string will treat as an EOS.  Takes a\r\nlist of tokens, returns a substituted list.\nReplace anything that might represent an end-of-thought with\nesc, which sentencify-string will treat as an EOS.  Takes a\nlist of tokens, returns a substituted list.")
    public static final SubLObject replace_separator_tags_with_eos_alt(SubLObject list_of_token_strings) {
        {
            SubLObject retlist = NIL;
            SubLObject cdolist_list_var = list_of_token_strings;
            SubLObject tok = NIL;
            for (tok = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tok = cdolist_list_var.first()) {
                if ((NIL != string_utilities.ends_with_one_of(tok, com.cyc.cycjava.cycl.learning_reader.html_eos_close_tags())) || (NIL != string_utilities.starts_with_one_of(tok, com.cyc.cycjava.cycl.learning_reader.html_eos_open_tags()))) {
                    retlist = cons(format(NIL, $str_alt401$_C, CHAR_escape), retlist);
                } else {
                    retlist = cons(tok, retlist);
                }
            }
            return nreverse(retlist);
        }
    }

    /**
     * Replace anything that might represent an end-of-thought with
     * esc, which sentencify-string will treat as an EOS.  Takes a
     * list of tokens, returns a substituted list.
     */
    @LispMethod(comment = "Replace anything that might represent an end-of-thought with\r\nesc, which sentencify-string will treat as an EOS.  Takes a\r\nlist of tokens, returns a substituted list.\nReplace anything that might represent an end-of-thought with\nesc, which sentencify-string will treat as an EOS.  Takes a\nlist of tokens, returns a substituted list.")
    public static SubLObject replace_separator_tags_with_eos(final SubLObject list_of_token_strings) {
        SubLObject retlist = NIL;
        SubLObject cdolist_list_var = list_of_token_strings;
        SubLObject tok = NIL;
        tok = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != string_utilities.ends_with_one_of(tok, learning_reader.html_eos_close_tags())) || (NIL != string_utilities.starts_with_one_of(tok, learning_reader.html_eos_open_tags()))) {
                retlist = cons(format(NIL, learning_reader.$str408$_C, CHAR_escape), retlist);
            } else {
                retlist = cons(tok, retlist);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tok = cdolist_list_var.first();
        } 
        return nreverse(retlist);
    }

    /**
     *
     *
     * @param STRING:
     * 		string to be operated on
     * @param TAG:
     * 		a tag to remove, such as 'ul'
     * 		Non-case-sensitively removes all occurrences of a XML tag (such as UL or TT)
     * 		and the text between those tags.
     */
    @LispMethod(comment = "@param STRING:\r\n\t\tstring to be operated on\r\n@param TAG:\r\n\t\ta tag to remove, such as \'ul\'\r\n\t\tNon-case-sensitively removes all occurrences of a XML tag (such as UL or TT)\r\n\t\tand the text between those tags.")
    public static final SubLObject strip_text_between_tags_of_type_alt(SubLObject string, SubLObject tag) {
        {
            SubLObject retstr = string;
            SubLObject otag = cconcatenate($str_alt402$_, tag);
            SubLObject ctag = cconcatenate($str_alt403$__, new SubLObject[]{ tag, $str_alt404$_ });
            retstr = string_utilities.string_substitute(otag, otag, retstr, symbol_function(EQUALP));
            retstr = string_utilities.string_substitute(ctag, ctag, retstr, symbol_function(EQUALP));
            while (NIL != string_utilities.get_substring_between_tags(retstr, otag, ctag, UNPROVIDED, UNPROVIDED)) {
                retstr = string_utilities.replace_substring_once(retstr, cconcatenate(otag, new SubLObject[]{ string_utilities.get_substring_between_tags(retstr, otag, ctag, UNPROVIDED, UNPROVIDED), ctag }), $str_alt371$, UNPROVIDED);
            } 
            return retstr;
        }
    }

    /**
     *
     *
     * @param STRING:
     * 		string to be operated on
     * @param TAG:
     * 		a tag to remove, such as 'ul'
     * 		Non-case-sensitively removes all occurrences of a XML tag (such as UL or TT)
     * 		and the text between those tags.
     */
    @LispMethod(comment = "@param STRING:\r\n\t\tstring to be operated on\r\n@param TAG:\r\n\t\ta tag to remove, such as \'ul\'\r\n\t\tNon-case-sensitively removes all occurrences of a XML tag (such as UL or TT)\r\n\t\tand the text between those tags.")
    public static SubLObject strip_text_between_tags_of_type(final SubLObject string, final SubLObject tag) {
        SubLObject otag;
        SubLObject ctag;
        SubLObject retstr;
        for (otag = cconcatenate(learning_reader.$str409$_, tag), ctag = cconcatenate(learning_reader.$str410$__, new SubLObject[]{ tag, learning_reader.$str411$_ }), retstr = string_utilities.string_substitute(otag, otag, string, symbol_function(EQUALP)), retstr = string_utilities.string_substitute(ctag, ctag, retstr, symbol_function(EQUALP)); NIL != string_utilities.get_substring_between_tags(retstr, otag, ctag, UNPROVIDED, UNPROVIDED); retstr = string_utilities.replace_substring_once(retstr, cconcatenate(otag, new SubLObject[]{ string_utilities.get_substring_between_tags(retstr, otag, ctag, UNPROVIDED, UNPROVIDED), ctag }), learning_reader.$str379$, UNPROVIDED)) {
        }
        return retstr;
    }

    /**
     * Removes everything not bracketed by content tags, lists, and any other
     * strings that are *usually* not usefully related to page content and
     * parseable.  Sometimes throws out good stuff as well.
     */
    @LispMethod(comment = "Removes everything not bracketed by content tags, lists, and any other\r\nstrings that are *usually* not usefully related to page content and\r\nparseable.  Sometimes throws out good stuff as well.\nRemoves everything not bracketed by content tags, lists, and any other\nstrings that are *usually* not usefully related to page content and\nparseable.  Sometimes throws out good stuff as well.")
    public static final SubLObject strip_wikipedia_page_alt(SubLObject pagetext) {
        SubLTrampolineFile.checkType(pagetext, NON_EMPTY_STRING_P);
        {
            SubLObject returned_text = pagetext;
            returned_text = string_utilities.string_subst($str_alt405$_ul_, $str_alt405$_ul_, returned_text, symbol_function(EQUALP));
            returned_text = string_utilities.string_subst($str_alt406$__ul_, $str_alt406$__ul_, returned_text, symbol_function(EQUALP));
            if (NIL != string_utilities.substringP($str_alt407$_____start_content____, returned_text, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                returned_text = string_utilities.get_substring_between_tags(returned_text, $str_alt407$_____start_content____, $str_alt408$_____end_content____, UNPROVIDED, UNPROVIDED);
            }
            returned_text = com.cyc.cycjava.cycl.learning_reader.strip_text_between_tags_of_type(returned_text, $$$ul);
            returned_text = com.cyc.cycjava.cycl.learning_reader.strip_text_between_tags_of_type(returned_text, $$$ol);
            returned_text = com.cyc.cycjava.cycl.learning_reader.strip_text_between_tags_of_type(returned_text, $$$table);
            returned_text = com.cyc.cycjava.cycl.learning_reader.strip_text_between_tags_of_type(returned_text, $$$h1);
            returned_text = com.cyc.cycjava.cycl.learning_reader.strip_text_between_tags_of_type(returned_text, $$$h2);
            returned_text = com.cyc.cycjava.cycl.learning_reader.strip_text_between_tags_of_type(returned_text, $$$h3);
            return returned_text;
        }
    }

    /**
     * Removes everything not bracketed by content tags, lists, and any other
     * strings that are *usually* not usefully related to page content and
     * parseable.  Sometimes throws out good stuff as well.
     */
    @LispMethod(comment = "Removes everything not bracketed by content tags, lists, and any other\r\nstrings that are *usually* not usefully related to page content and\r\nparseable.  Sometimes throws out good stuff as well.\nRemoves everything not bracketed by content tags, lists, and any other\nstrings that are *usually* not usefully related to page content and\nparseable.  Sometimes throws out good stuff as well.")
    public static SubLObject strip_wikipedia_page(final SubLObject pagetext) {
        assert NIL != string_utilities.non_empty_string_p(pagetext) : "! string_utilities.non_empty_string_p(pagetext) " + ("string_utilities.non_empty_string_p(pagetext) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(pagetext) ") + pagetext;
        SubLObject returned_text = string_utilities.string_subst(learning_reader.$str412$_ul_, learning_reader.$str412$_ul_, pagetext, symbol_function(EQUALP));
        returned_text = string_utilities.string_subst(learning_reader.$str413$__ul_, learning_reader.$str413$__ul_, returned_text, symbol_function(EQUALP));
        if (NIL != string_utilities.substringP(learning_reader.$str414$_____start_content____, returned_text, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            returned_text = string_utilities.get_substring_between_tags(returned_text, learning_reader.$str414$_____start_content____, learning_reader.$str415$_____end_content____, UNPROVIDED, UNPROVIDED);
        }
        returned_text = learning_reader.strip_text_between_tags_of_type(returned_text, learning_reader.$$$ul);
        returned_text = learning_reader.strip_text_between_tags_of_type(returned_text, learning_reader.$$$ol);
        returned_text = learning_reader.strip_text_between_tags_of_type(returned_text, learning_reader.$$$table);
        returned_text = learning_reader.strip_text_between_tags_of_type(returned_text, learning_reader.$$$h1);
        returned_text = learning_reader.strip_text_between_tags_of_type(returned_text, learning_reader.$$$h2);
        returned_text = learning_reader.strip_text_between_tags_of_type(returned_text, learning_reader.$$$h3);
        return returned_text;
    }

    /**
     * Looks for strings in a sentence that suggest we're trying to operate
     * on a meta-sentence, per some WIKIPEDIA SPECIFIC characteristics.
     */
    @LispMethod(comment = "Looks for strings in a sentence that suggest we\'re trying to operate\r\non a meta-sentence, per some WIKIPEDIA SPECIFIC characteristics.\nLooks for strings in a sentence that suggest we\'re trying to operate\non a meta-sentence, per some WIKIPEDIA SPECIFIC characteristics.")
    public static final SubLObject probably_wikipedia_meta_sentence_p_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, NON_EMPTY_STRING_P);
        if ((NIL != string_utilities.some_are_substringsP(com.cyc.cycjava.cycl.learning_reader.wikipedia_meta_strings(), sentence, UNPROVIDED)) || THREE_INTEGER.numG(string_utilities.number_of_words(sentence))) {
            return T;
        } else {
            return NIL;
        }
    }

    /**
     * Looks for strings in a sentence that suggest we're trying to operate
     * on a meta-sentence, per some WIKIPEDIA SPECIFIC characteristics.
     */
    @LispMethod(comment = "Looks for strings in a sentence that suggest we\'re trying to operate\r\non a meta-sentence, per some WIKIPEDIA SPECIFIC characteristics.\nLooks for strings in a sentence that suggest we\'re trying to operate\non a meta-sentence, per some WIKIPEDIA SPECIFIC characteristics.")
    public static SubLObject probably_wikipedia_meta_sentence_p(final SubLObject sentence) {
        assert NIL != string_utilities.non_empty_string_p(sentence) : "! string_utilities.non_empty_string_p(sentence) " + ("string_utilities.non_empty_string_p(sentence) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(sentence) ") + sentence;
        if ((NIL != string_utilities.some_are_substringsP(learning_reader.wikipedia_meta_strings(), sentence, UNPROVIDED)) || THREE_INTEGER.numG(string_utilities.number_of_words(sentence))) {
            return T;
        }
        return NIL;
    }

    /**
     * Given a URL, retrieves the web page, tokenizes it, and strips
     * out everything that looks like an HTML/XML tag.  Should return
     * a long string representing the un-marked-up text.
     */
    @LispMethod(comment = "Given a URL, retrieves the web page, tokenizes it, and strips\r\nout everything that looks like an HTML/XML tag.  Should return\r\na long string representing the un-marked-up text.\nGiven a URL, retrieves the web page, tokenizes it, and strips\nout everything that looks like an HTML/XML tag.  Should return\na long string representing the un-marked-up text.")
    public static final SubLObject detagged_page_as_string_alt(SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = NIL;
        }
        if (return_linksP == UNPROVIDED) {
            return_linksP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(url, NON_EMPTY_STRING_P);
            {
                SubLObject links = (NIL != return_linksP) ? ((SubLObject) (set.new_set(symbol_function(EQUAL), UNPROVIDED))) : NIL;
                SubLObject retstr = $str_alt371$;
                SubLObject html_source = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                html_source = evaluation_defns.cyc_url_source(url);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    Errors.warn(error_message);
                    return retstr;
                }
                {
                    SubLObject unicodeP = unicode_nauts.unicode_naut_p(html_source);
                    SubLObject orig_pagetext = (NIL != unicodeP) ? ((SubLObject) (unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(html_source, UNPROVIDED)))) : html_source;
                    SubLObject pagetext = (NIL != wikipedia_pageP) ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.strip_wikipedia_page(orig_pagetext))) : orig_pagetext;
                    SubLObject dirtyP = NIL;
                    SubLObject paragraph_text = NIL;
                    SubLObject start_pos = ZERO_INTEGER;
                    SubLObject output_string_stream = NIL;
                    try {
                        output_string_stream = make_private_string_output_stream();
                        while ((NIL == dirtyP) || (NIL != paragraph_text)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject paragraph_text_37 = string_utilities.get_substring_between_tags(pagetext, $str_alt277$_p_, $str_alt280$__p_, start_pos, UNPROVIDED);
                                SubLObject start_pos_38 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                paragraph_text = paragraph_text_37;
                                start_pos = start_pos_38;
                            }
                            if (paragraph_text.isString() && (NIL != find_if(ALPHA_CHAR_P, evaluation_defns.cyc_remove_html_tags(paragraph_text), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                dirtyP = T;
                                com.cyc.cycjava.cycl.learning_reader.l2r_stringify_one_paragraph(paragraph_text, output_string_stream, links, unicodeP);
                            }
                        } 
                        if (NIL == dirtyP) {
                            Errors.warn($str_alt416$Couldn_t_find_paragraphs_in__S, url);
                            com.cyc.cycjava.cycl.learning_reader.l2r_stringify_one_paragraph(pagetext, output_string_stream, links, unicodeP);
                        }
                        retstr = get_output_stream_string(output_string_stream);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                close(output_string_stream, UNPROVIDED);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return values(string_utilities.remove_last_char(retstr, UNPROVIDED), NIL != links ? ((SubLObject) (set.set_element_list(links))) : NIL);
                }
            }
        }
    }

    /**
     * Given a URL, retrieves the web page, tokenizes it, and strips
     * out everything that looks like an HTML/XML tag.  Should return
     * a long string representing the un-marked-up text.
     */
    @LispMethod(comment = "Given a URL, retrieves the web page, tokenizes it, and strips\r\nout everything that looks like an HTML/XML tag.  Should return\r\na long string representing the un-marked-up text.\nGiven a URL, retrieves the web page, tokenizes it, and strips\nout everything that looks like an HTML/XML tag.  Should return\na long string representing the un-marked-up text.")
    public static SubLObject detagged_page_as_string(final SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = NIL;
        }
        if (return_linksP == UNPROVIDED) {
            return_linksP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != string_utilities.non_empty_string_p(url) : "! string_utilities.non_empty_string_p(url) " + ("string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) ") + url;
        final SubLObject links = (NIL != return_linksP) ? set.new_set(symbol_function(EQUAL), UNPROVIDED) : NIL;
        SubLObject retstr = learning_reader.$str379$;
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
        final SubLObject pagetext = (NIL != wikipedia_pageP) ? learning_reader.strip_wikipedia_page(orig_pagetext) : orig_pagetext;
        SubLObject dirtyP = NIL;
        SubLObject paragraph_text = NIL;
        SubLObject start_pos = ZERO_INTEGER;
        SubLObject output_string_stream = NIL;
        try {
            output_string_stream = make_private_string_output_stream();
            while ((NIL == dirtyP) || (NIL != paragraph_text)) {
                thread.resetMultipleValues();
                final SubLObject paragraph_text_$43 = string_utilities.get_substring_between_tags(pagetext, learning_reader.$str286$_p_, learning_reader.$str289$__p_, start_pos, UNPROVIDED);
                final SubLObject start_pos_$44 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                paragraph_text = paragraph_text_$43;
                start_pos = start_pos_$44;
                if (paragraph_text.isString() && (NIL != find_if(ALPHA_CHAR_P, evaluation_defns.cyc_remove_html_tags(paragraph_text), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    dirtyP = T;
                    learning_reader.l2r_stringify_one_paragraph(paragraph_text, output_string_stream, links, unicodeP);
                }
            } 
            if (NIL == dirtyP) {
                Errors.warn(learning_reader.$str423$Couldn_t_find_paragraphs_in__S, url);
                learning_reader.l2r_stringify_one_paragraph(pagetext, output_string_stream, links, unicodeP);
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

    public static final SubLObject l2r_stringify_one_paragraph_alt(SubLObject paragraph_text, SubLObject output_string_stream, SubLObject links, SubLObject unicodeP) {
        {
            SubLObject cycl_text = (NIL != unicodeP) ? ((SubLObject) (unicode_nauts.make_unicode_naut(unicode_strings.html_escaped_to_display(paragraph_text)))) : paragraph_text;
            SubLObject sentence_vector = com.cyc.cycjava.cycl.learning_reader.sentencify_l2r_paragraph(cycl_text);
            SubLObject vector_var = sentence_vector;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject sentence = aref(vector_var, element_num);
                    if (NIL == document.sentence_string(sentence)) {
                        Errors.error($str_alt417$No_sentence_string_for__S, sentence);
                    }
                    com.cyc.cycjava.cycl.learning_reader.l2r_stringify_one_sentence(sentence, output_string_stream);
                    if (NIL != set.set_p(links)) {
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.learning_reader.l2r_extract_links_from_sentence(sentence, NIL);
                            SubLObject link_info = NIL;
                            for (link_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link_info = cdolist_list_var.first()) {
                                set.set_add(link_info.first(), links);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject l2r_stringify_one_paragraph(final SubLObject paragraph_text, final SubLObject output_string_stream, final SubLObject links, final SubLObject unicodeP) {
        final SubLObject cycl_text = (NIL != unicodeP) ? unicode_nauts.make_unicode_naut(unicode_strings.html_escaped_to_display(paragraph_text)) : paragraph_text;
        final SubLObject vector_var;
        final SubLObject sentence_vector = vector_var = learning_reader.sentencify_l2r_paragraph(cycl_text);
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
                Errors.error(learning_reader.$str424$No_sentence_string_for__S, sentence);
            }
            learning_reader.l2r_stringify_one_sentence(sentence, output_string_stream);
            if (NIL != set.set_p(links)) {
                cdolist_list_var = learning_reader.l2r_extract_links_from_sentence(sentence, NIL);
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

    public static final SubLObject l2r_stringify_one_sentence_alt(SubLObject sentence, SubLObject output_string_stream) {
        {
            SubLObject stripped = evaluation_defns.cyc_remove_html_tags(document.sentence_string(sentence));
            format(output_string_stream, $str_alt418$_A_, stripped);
        }
        return NIL;
    }

    public static SubLObject l2r_stringify_one_sentence(final SubLObject sentence, final SubLObject output_string_stream) {
        final SubLObject stripped = evaluation_defns.cyc_remove_html_tags(document.sentence_string(sentence));
        format(output_string_stream, learning_reader.$str425$_A_, stripped);
        return NIL;
    }

    /**
     * Given a URL, retrieves the web page, tokenizes it, and strips
     * out everything that looks like an HTML/XML tag.  Should return
     * a long string representing the un-marked-up text.
     */
    @LispMethod(comment = "Given a URL, retrieves the web page, tokenizes it, and strips\r\nout everything that looks like an HTML/XML tag.  Should return\r\na long string representing the un-marked-up text.\nGiven a URL, retrieves the web page, tokenizes it, and strips\nout everything that looks like an HTML/XML tag.  Should return\na long string representing the un-marked-up text.")
    public static final SubLObject detagged_page_as_string_old_alt(SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = NIL;
        }
        if (return_linksP == UNPROVIDED) {
            return_linksP = NIL;
        }
        SubLTrampolineFile.checkType(url, NON_EMPTY_STRING_P);
        {
            SubLObject retlist = NIL;
            SubLObject links = NIL;
            SubLObject retstr = $str_alt371$;
            SubLObject html_source = evaluation_defns.cyc_url_source(url);
            SubLObject orig_pagetext = (NIL != unicode_nauts.unicode_naut_p(html_source)) ? ((SubLObject) (unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(html_source, UNPROVIDED)))) : html_source;
            SubLObject pagetext = (NIL != wikipedia_pageP) ? ((SubLObject) (com.cyc.cycjava.cycl.learning_reader.strip_wikipedia_page(orig_pagetext))) : orig_pagetext;
            SubLObject xml_tokens = com.cyc.cycjava.cycl.learning_reader.replace_separator_tags_with_eos(web_utilities.xml_string_tokenize(pagetext, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            {
                SubLObject cdolist_list_var = xml_tokens;
                SubLObject token = NIL;
                for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                    if (NIL != web_utilities.xml_token_starts_with(token, $str_alt402$_)) {
                        if ((NIL != return_linksP) && (NIL != search($str_alt350$_a, token, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            {
                                SubLObject prefix_string = $str_alt419$href__;
                                SubLObject prefix_start_pos = search(prefix_string, token, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject start_pos = (NIL != prefix_start_pos) ? ((SubLObject) (add(prefix_start_pos, length(prefix_string)))) : NIL;
                                SubLObject end_pos = (NIL != start_pos) ? ((SubLObject) (search($str_alt420$_, token, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start_pos, UNPROVIDED))) : NIL;
                                SubLObject relative_url = (NIL != end_pos) ? ((SubLObject) (string_utilities.substring(token, start_pos, end_pos))) : NIL;
                                if (relative_url.isString()) {
                                    links = cons(relative_url, links);
                                }
                            }
                        }
                    } else {
                        if ((NIL != web_utilities.xml_token_starts_with(token, $str_alt421$_)) || (NIL != string_utilities.empty_stringP(string_utilities.trim_whitespace(token)))) {
                        } else {
                            retlist = cons(token, retlist);
                        }
                    }
                }
            }
            {
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject cdolist_list_var = nreverse(retlist);
                        SubLObject token = NIL;
                        for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                            princ(token, stream);
                            princ($str_alt373$_, stream);
                        }
                    }
                    retstr = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            close(stream, UNPROVIDED);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            retstr = string_utilities.remove_last_char(string_utilities.string_subst($str_alt373$_, $str_alt422$_u0a_, retstr, UNPROVIDED), UNPROVIDED);
            return values(retstr, links);
        }
    }

    /**
     * Given a URL, retrieves the web page, tokenizes it, and strips
     * out everything that looks like an HTML/XML tag.  Should return
     * a long string representing the un-marked-up text.
     */
    @LispMethod(comment = "Given a URL, retrieves the web page, tokenizes it, and strips\r\nout everything that looks like an HTML/XML tag.  Should return\r\na long string representing the un-marked-up text.\nGiven a URL, retrieves the web page, tokenizes it, and strips\nout everything that looks like an HTML/XML tag.  Should return\na long string representing the un-marked-up text.")
    public static SubLObject detagged_page_as_string_old(final SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = NIL;
        }
        if (return_linksP == UNPROVIDED) {
            return_linksP = NIL;
        }
        assert NIL != string_utilities.non_empty_string_p(url) : "! string_utilities.non_empty_string_p(url) " + ("string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) ") + url;
        SubLObject retlist = NIL;
        SubLObject links = NIL;
        SubLObject retstr = learning_reader.$str379$;
        final SubLObject html_source = evaluation_defns.cyc_url_source(url);
        final SubLObject orig_pagetext = (NIL != unicode_nauts.unicode_naut_p(html_source, UNPROVIDED)) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(html_source, UNPROVIDED)) : html_source;
        final SubLObject pagetext = (NIL != wikipedia_pageP) ? learning_reader.strip_wikipedia_page(orig_pagetext) : orig_pagetext;
        SubLObject cdolist_list_var;
        final SubLObject xml_tokens = cdolist_list_var = learning_reader.replace_separator_tags_with_eos(xml_parsing_utilities.xml_string_tokenize(pagetext, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != xml_parsing_utilities.xml_token_starts_with(token, learning_reader.$str409$_)) {
                if ((NIL != return_linksP) && (NIL != search(learning_reader.$str358$_a, token, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    final SubLObject prefix_string = learning_reader.$str426$href__;
                    final SubLObject prefix_start_pos = search(prefix_string, token, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject start_pos = (NIL != prefix_start_pos) ? add(prefix_start_pos, length(prefix_string)) : NIL;
                    final SubLObject end_pos = (NIL != start_pos) ? search(learning_reader.$str427$_, token, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start_pos, UNPROVIDED) : NIL;
                    final SubLObject relative_url = (NIL != end_pos) ? string_utilities.substring(token, start_pos, end_pos) : NIL;
                    if (relative_url.isString()) {
                        links = cons(relative_url, links);
                    }
                }
            } else
                if (NIL == xml_parsing_utilities.xml_token_starts_with(token, learning_reader.$str428$_)) {
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
                princ(learning_reader.$$$_, stream);
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
        retstr = string_utilities.remove_last_char(string_utilities.string_subst(learning_reader.$$$_, learning_reader.$str429$_u0a_, retstr, UNPROVIDED), UNPROVIDED);
        return values(retstr, links);
    }

    /**
     * Given a URL, calls detagged-page-as-string to get the
     * de-marked-up version, then splits it up into individual sentences
     * and returns a long list of those.
     */
    @LispMethod(comment = "Given a URL, calls detagged-page-as-string to get the\r\nde-marked-up version, then splits it up into individual sentences\r\nand returns a long list of those.\nGiven a URL, calls detagged-page-as-string to get the\nde-marked-up version, then splits it up into individual sentences\nand returns a long list of those.")
    public static final SubLObject page_to_detagged_sentence_strings_alt(SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = NIL;
        }
        if (return_linksP == UNPROVIDED) {
            return_linksP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(url, NON_EMPTY_STRING_P);
            Errors.warn($str_alt423$Downloading_and_sentencifying_tex, url);
            thread.resetMultipleValues();
            {
                SubLObject page_text = com.cyc.cycjava.cycl.learning_reader.detagged_page_as_string(url, wikipedia_pageP, return_linksP);
                SubLObject links = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(document.sentencify_string(page_text), links);
            }
        }
    }

    /**
     * Given a URL, calls detagged-page-as-string to get the
     * de-marked-up version, then splits it up into individual sentences
     * and returns a long list of those.
     */
    @LispMethod(comment = "Given a URL, calls detagged-page-as-string to get the\r\nde-marked-up version, then splits it up into individual sentences\r\nand returns a long list of those.\nGiven a URL, calls detagged-page-as-string to get the\nde-marked-up version, then splits it up into individual sentences\nand returns a long list of those.")
    public static SubLObject page_to_detagged_sentence_strings(final SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = NIL;
        }
        if (return_linksP == UNPROVIDED) {
            return_linksP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != string_utilities.non_empty_string_p(url) : "! string_utilities.non_empty_string_p(url) " + ("string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) ") + url;
        Errors.warn(learning_reader.$str430$Downloading_and_sentencifying_tex, url);
        thread.resetMultipleValues();
        final SubLObject page_text = learning_reader.detagged_page_as_string(url, wikipedia_pageP, return_linksP);
        final SubLObject links = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(document.sentencify_string(page_text), links);
    }

    public static final SubLObject parse_and_partition_document_file_alt(SubLObject file, SubLObject results_directory, SubLObject domain_mt, SubLObject max_parses, SubLObject max_time) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $$CurrentWorldDataCollectorMt;
        }
        if (max_parses == UNPROVIDED) {
            max_parses = NIL;
        }
        if (max_time == UNPROVIDED) {
            max_time = $int$30;
        }
        {
            SubLObject paragraph_texts = com.cyc.cycjava.cycl.learning_reader.read_topic_struct_paragraphs_from_file(file);
            return com.cyc.cycjava.cycl.learning_reader.parse_and_partition_paragraph_texts(paragraph_texts, results_directory, domain_mt, max_parses, max_time);
        }
    }

    public static SubLObject parse_and_partition_document_file(final SubLObject file, final SubLObject results_directory, SubLObject domain_mt, SubLObject max_parses, SubLObject max_time) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = learning_reader.$$CurrentWorldDataCollectorMt;
        }
        if (max_parses == UNPROVIDED) {
            max_parses = NIL;
        }
        if (max_time == UNPROVIDED) {
            max_time = learning_reader.$int$30;
        }
        final SubLObject paragraph_texts = learning_reader.read_topic_struct_paragraphs_from_file(file);
        return learning_reader.parse_and_partition_paragraph_texts(paragraph_texts, results_directory, domain_mt, max_parses, max_time);
    }

    public static final SubLObject read_topic_struct_paragraphs_from_file_alt(SubLObject file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paragraph_texts = NIL;
                SubLObject doneP = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(file, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt369$Unable_to_open__S, file);
                    }
                    {
                        SubLObject in = stream;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!in.isStream()) {
                                Errors.error($str_alt426$__Cannot_open_input_stream_for__A, file);
                            }
                        }
                        while (NIL == doneP) {
                            {
                                SubLObject next = read_ignoring_errors(in, NIL, $EOF);
                                if (next == $EOF) {
                                    doneP = T;
                                } else {
                                    if (NIL != unicode_nauts.string_or_unicode_naut_p(next)) {
                                        paragraph_texts = cons(next, paragraph_texts);
                                    } else {
                                        Errors.warn($str_alt428$Non_string_in__S_____S__, file, next);
                                    }
                                }
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(paragraph_texts);
            }
        }
    }

    public static SubLObject read_topic_struct_paragraphs_from_file(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paragraph_texts = NIL;
        SubLObject doneP = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(file, $INPUT);
            if (!stream.isStream()) {
                Errors.error(learning_reader.$str377$Unable_to_open__S, file);
            }
            final SubLObject in = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!in.isStream())) {
                Errors.error(learning_reader.$str433$__Cannot_open_input_stream_for__A, file);
            }
            while (NIL == doneP) {
                final SubLObject next = read_ignoring_errors(in, NIL, $EOF);
                if (next == $EOF) {
                    doneP = T;
                } else
                    if (NIL != unicode_nauts.string_or_unicode_naut_p(next)) {
                        paragraph_texts = cons(next, paragraph_texts);
                    } else {
                        Errors.warn(learning_reader.$str435$Non_string_in__S_____S__, file, next);
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

    public static final SubLObject parse_and_partition_paragraph_texts_alt(SubLObject paragraph_texts, SubLObject results_directory, SubLObject domain_mt, SubLObject max_parses, SubLObject max_time) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $$CurrentWorldDataCollectorMt;
        }
        if (max_parses == UNPROVIDED) {
            max_parses = NIL;
        }
        if (max_time == UNPROVIDED) {
            max_time = $int$30;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Filesys.directory_p(results_directory)) {
                file_utilities.make_directory_recursive(results_directory, NIL, $$$775);
            } else {
                if (NIL != Filesys.directory(results_directory, UNPROVIDED)) {
                    Errors.error($str_alt430$_S_is_not_empty, results_directory);
                }
            }
            {
                SubLObject results_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject results_dictionary_file = file_utilities.relative_filename(results_directory, $str_alt431$results_dictionary_cfasl, UNPROVIDED);
                SubLObject paragraph_num = ZERO_INTEGER;
                SubLObject list_var = paragraph_texts;
                $progress_note$.setDynamicValue($str_alt432$Parsing_and_partioning_paragraphs, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject paragraph_text = NIL;
                            for (paragraph_text = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , paragraph_text = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject subl_paragraph_text = (NIL != unicode_nauts.unicode_naut_p(paragraph_text)) ? ((SubLObject) (unicode_strings.display_to_subl_string(cycl_utilities.nat_arg1(paragraph_text, UNPROVIDED), UNPROVIDED, UNPROVIDED))) : paragraph_text;
                                    SubLObject results = NIL;
                                    {
                                        SubLObject list_var_39 = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject sentence_num = NIL;
                                        for (list_var_39 = document.sentencify_string(subl_paragraph_text), sentence = list_var_39.first(), sentence_num = ZERO_INTEGER; NIL != list_var_39; list_var_39 = list_var_39.rest() , sentence = list_var_39.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                            {
                                                SubLObject good = NIL;
                                                SubLObject maybe = NIL;
                                                SubLObject bad = NIL;
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject good_40 = textual_entailments.parse_and_partition_sentence_parses(sentence, domain_mt, max_parses, max_time);
                                                    SubLObject maybe_41 = thread.secondMultipleValue();
                                                    SubLObject bad_42 = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    good = good_40;
                                                    maybe = maybe_41;
                                                    bad = bad_42;
                                                }
                                                if (((NIL != good) || (NIL != maybe)) || (NIL != bad)) {
                                                    results = list_utilities.alist_enter(results, sentence, list(good, maybe, bad), UNPROVIDED);
                                                    dictionary.dictionary_enter(results_dictionary, list(paragraph_num, sentence_num), list($SENTENCE, sentence, $GOOD, good, $BAD, bad, $MAYBE, maybe));
                                                    cfasl_utilities.cfasl_save_externalized(results_dictionary, results_dictionary_file);
                                                }
                                            }
                                        }
                                    }
                                    if (NIL != results) {
                                        {
                                            SubLObject results_file = file_utilities.relative_filename(results_directory, com.cyc.cycjava.cycl.learning_reader.partioned_parse_results_file_name(subl_paragraph_text, results_directory), UNPROVIDED);
                                            Errors.warn($str_alt437$Writing_results_to__S, results_file);
                                            {
                                                SubLObject stream = NIL;
                                                try {
                                                    stream = compatibility.open_text(results_file, $OUTPUT, NIL);
                                                    if (!stream.isStream()) {
                                                        Errors.error($str_alt369$Unable_to_open__S, results_file);
                                                    }
                                                    {
                                                        SubLObject results_stream = stream;
                                                        SubLObject cdolist_list_var = results;
                                                        SubLObject cons = NIL;
                                                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject datum = cons;
                                                                SubLObject current = datum;
                                                                SubLObject sentence = NIL;
                                                                SubLObject partitioned_parses = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list_alt438);
                                                                sentence = current.first();
                                                                current = current.rest();
                                                                partitioned_parses = current;
                                                                {
                                                                    SubLObject datum_43 = partitioned_parses;
                                                                    SubLObject current_44 = datum_43;
                                                                    SubLObject good = NIL;
                                                                    SubLObject maybe = NIL;
                                                                    SubLObject bad = NIL;
                                                                    destructuring_bind_must_consp(current_44, datum_43, $list_alt439);
                                                                    good = current_44.first();
                                                                    current_44 = current_44.rest();
                                                                    destructuring_bind_must_consp(current_44, datum_43, $list_alt439);
                                                                    maybe = current_44.first();
                                                                    current_44 = current_44.rest();
                                                                    destructuring_bind_must_consp(current_44, datum_43, $list_alt439);
                                                                    bad = current_44.first();
                                                                    current_44 = current_44.rest();
                                                                    if (NIL == current_44) {
                                                                        com.cyc.cycjava.cycl.learning_reader.write_partioned_parse_results(results_stream, sentence, good, maybe, bad);
                                                                    } else {
                                                                        cdestructuring_bind_error(datum_43, $list_alt439);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (stream.isStream()) {
                                                                close(stream, UNPROVIDED);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_45, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                paragraph_num = add(paragraph_num, ONE_INTEGER);
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
            }
            return results_directory;
        }
    }

    public static SubLObject parse_and_partition_paragraph_texts(final SubLObject paragraph_texts, final SubLObject results_directory, SubLObject domain_mt, SubLObject max_parses, SubLObject max_time) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = learning_reader.$$CurrentWorldDataCollectorMt;
        }
        if (max_parses == UNPROVIDED) {
            max_parses = NIL;
        }
        if (max_time == UNPROVIDED) {
            max_time = learning_reader.$int$30;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Filesys.directory_p(results_directory)) {
            file_utilities.make_directory_recursive(results_directory, NIL, learning_reader.$$$775);
        } else
            if (NIL != Filesys.directory(results_directory, UNPROVIDED)) {
                Errors.error(learning_reader.$str437$_S_is_not_empty, results_directory);
            }

        final SubLObject results_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject results_dictionary_file = file_utilities.relative_filename(results_directory, learning_reader.$str438$results_dictionary_cfasl, UNPROVIDED);
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
            $progress_note$.bind(learning_reader.$str439$Parsing_and_partioning_paragraphs, thread);
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
                        final SubLObject results_file = file_utilities.relative_filename(results_directory, learning_reader.partioned_parse_results_file_name(subl_paragraph_text, results_directory), UNPROVIDED);
                        Errors.warn(learning_reader.$str444$Writing_results_to__S, results_file);
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(results_file, $OUTPUT);
                            if (!stream.isStream()) {
                                Errors.error(learning_reader.$str377$Unable_to_open__S, results_file);
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
                                destructuring_bind_must_consp(current, datum, learning_reader.$list445);
                                sentence2 = current.first();
                                current = partitioned_parses = current.rest();
                                SubLObject current_$47;
                                final SubLObject datum_$46 = current_$47 = partitioned_parses;
                                SubLObject good2 = NIL;
                                SubLObject maybe2 = NIL;
                                SubLObject bad2 = NIL;
                                destructuring_bind_must_consp(current_$47, datum_$46, learning_reader.$list446);
                                good2 = current_$47.first();
                                current_$47 = current_$47.rest();
                                destructuring_bind_must_consp(current_$47, datum_$46, learning_reader.$list446);
                                maybe2 = current_$47.first();
                                current_$47 = current_$47.rest();
                                destructuring_bind_must_consp(current_$47, datum_$46, learning_reader.$list446);
                                bad2 = current_$47.first();
                                current_$47 = current_$47.rest();
                                if (NIL == current_$47) {
                                    learning_reader.write_partioned_parse_results(results_stream, sentence2, good2, maybe2, bad2);
                                } else {
                                    cdestructuring_bind_error(datum_$46, learning_reader.$list446);
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

    public static final SubLObject partioned_parse_results_file_name_alt(SubLObject subl_paragraph_text, SubLObject directory) {
        {
            SubLObject length = TEN_INTEGER;
            SubLObject name = list_utilities.remove_if_not(ALPHANUMERICP, string_utilities.substring(subl_paragraph_text, ZERO_INTEGER, length), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject base = name;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject ext = NIL;
                    for (ext = ONE_INTEGER; NIL == doneP; ext = number_utilities.f_1X(ext)) {
                        name = format(NIL, $str_alt441$_A__3__0D, base, ext);
                        if (NIL == Filesys.probe_file(file_utilities.relative_filename(directory, name, UNPROVIDED))) {
                            doneP = T;
                        }
                    }
                }
            }
            return name;
        }
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
                name = format(NIL, learning_reader.$str448$_A__3__0D, base, ext);
                if (NIL == Filesys.probe_file(file_utilities.relative_filename(directory, name, UNPROVIDED))) {
                    doneP = T;
                }
                ext = number_utilities.f_1X(ext);
            } 
        }
        return name;
    }

    /**
     * Print results to RESULTS-STREAM in human-readable form.
     */
    @LispMethod(comment = "Print results to RESULTS-STREAM in human-readable form.")
    public static final SubLObject write_partioned_parse_results_alt(SubLObject results_stream, SubLObject sentence, SubLObject good, SubLObject maybe, SubLObject bad) {
        if (((NIL != good) || (NIL != bad)) || (NIL != maybe)) {
            print(sentence, results_stream);
            terpri(results_stream);
        }
        if (NIL != good) {
            princ($str_alt442$Known_bindings_, results_stream);
            {
                SubLObject cdolist_list_var = good;
                SubLObject good_one = NIL;
                for (good_one = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , good_one = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.learning_reader.write_partioned_parse_result(good_one, results_stream);
                }
            }
            terpri(results_stream);
        }
        if (NIL != maybe) {
            princ($str_alt443$Consistent_, results_stream);
            {
                SubLObject cdolist_list_var = maybe;
                SubLObject parse = NIL;
                for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.learning_reader.write_partioned_parse_result(parse, results_stream);
                }
            }
            terpri(results_stream);
        }
        if (NIL != bad) {
            princ($str_alt444$Known_false_, results_stream);
            {
                SubLObject cdolist_list_var = bad;
                SubLObject parse = NIL;
                for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.learning_reader.write_partioned_parse_result(parse, results_stream);
                }
            }
        }
        return results_stream;
    }

    @LispMethod(comment = "Print results to RESULTS-STREAM in human-readable form.")
    public static SubLObject write_partioned_parse_results(final SubLObject results_stream, final SubLObject sentence, final SubLObject good, final SubLObject maybe, final SubLObject bad) {
        if (((NIL != good) || (NIL != bad)) || (NIL != maybe)) {
            print(sentence, results_stream);
            terpri(results_stream);
        }
        if (NIL != good) {
            princ(learning_reader.$str449$Known_bindings_, results_stream);
            SubLObject cdolist_list_var = good;
            SubLObject good_one = NIL;
            good_one = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                learning_reader.write_partioned_parse_result(good_one, results_stream);
                cdolist_list_var = cdolist_list_var.rest();
                good_one = cdolist_list_var.first();
            } 
            terpri(results_stream);
        }
        if (NIL != maybe) {
            princ(learning_reader.$str450$Consistent_, results_stream);
            SubLObject cdolist_list_var = maybe;
            SubLObject parse = NIL;
            parse = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                learning_reader.write_partioned_parse_result(parse, results_stream);
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            } 
            terpri(results_stream);
        }
        if (NIL != bad) {
            princ(learning_reader.$str451$Known_false_, results_stream);
            SubLObject cdolist_list_var = bad;
            SubLObject parse = NIL;
            parse = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                learning_reader.write_partioned_parse_result(parse, results_stream);
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            } 
        }
        return results_stream;
    }

    public static final SubLObject write_partioned_parse_result_alt(SubLObject parse, SubLObject results_stream) {
        print(cycl_utilities.expression_transform(parse, NART_P, NART_HL_FORMULA, UNPROVIDED, UNPROVIDED), results_stream);
        return results_stream;
    }

    public static SubLObject write_partioned_parse_result(final SubLObject parse, final SubLObject results_stream) {
        print(cycl_utilities.expression_transform(parse, NART_P, learning_reader.NART_HL_FORMULA, UNPROVIDED, UNPROVIDED), results_stream);
        return results_stream;
    }

    /**
     *
     *
     * @return LISTP of potential noun-compound strings from PARAGRAPH.
     */
    @LispMethod(comment = "@return LISTP of potential noun-compound strings from PARAGRAPH.")
    public static final SubLObject l2r_paragraph_candidate_noun_compounds_alt(SubLObject paragraph) {
        SubLTrampolineFile.checkType(paragraph, FORT_P);
        {
            SubLObject candidate_noun_compounds = NIL;
            SubLObject html_source = com.cyc.cycjava.cycl.learning_reader.l2r_get_source_html(paragraph);
            SubLObject sentence_vector = com.cyc.cycjava.cycl.learning_reader.sentencify_l2r_paragraph(html_source);
            SubLObject vector_var = sentence_vector;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject sentence = aref(vector_var, element_num);
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.learning_reader.l2r_sentence_candidate_noun_compounds(sentence);
                    SubLObject candidate_noun_compound = NIL;
                    for (candidate_noun_compound = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_noun_compound = cdolist_list_var.first()) {
                        {
                            SubLObject item_var = candidate_noun_compound;
                            if (NIL == member(item_var, candidate_noun_compounds, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                candidate_noun_compounds = cons(item_var, candidate_noun_compounds);
                            }
                        }
                    }
                }
            }
            return candidate_noun_compounds;
        }
    }

    /**
     *
     *
     * @return LISTP of potential noun-compound strings from PARAGRAPH.
     */
    @LispMethod(comment = "@return LISTP of potential noun-compound strings from PARAGRAPH.")
    public static SubLObject l2r_paragraph_candidate_noun_compounds(final SubLObject paragraph) {
        assert NIL != forts.fort_p(paragraph) : "! forts.fort_p(paragraph) " + ("forts.fort_p(paragraph) " + "CommonSymbols.NIL != forts.fort_p(paragraph) ") + paragraph;
        SubLObject candidate_noun_compounds = NIL;
        final SubLObject html_source = learning_reader.l2r_get_source_html(paragraph);
        final SubLObject vector_var;
        final SubLObject sentence_vector = vector_var = learning_reader.sentencify_l2r_paragraph(html_source);
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
            cdolist_list_var = learning_reader.l2r_sentence_candidate_noun_compounds(sentence);
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

    /**
     *
     *
     * @return LISTP of potential noun-compound strings from SENTENCE.
     */
    @LispMethod(comment = "@return LISTP of potential noun-compound strings from SENTENCE.")
    public static final SubLObject l2r_sentence_candidate_noun_compounds_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        pos_tagger.tagger_tag_sentence(com.cyc.cycjava.cycl.learning_reader.l2r_noun_compound_tagger(), sentence);
        {
            SubLObject words = document.sentence_constituents(sentence);
            SubLObject candidate_noun_compounds = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.learning_reader.l2r_noun_compound_patterns();
            SubLObject pattern = NIL;
            for (pattern = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pattern = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_46 = string_utilities.search_all(pattern, words, symbol_function(EQL), symbol_function(WORD_CATEGORY));
                    SubLObject start_pos = NIL;
                    for (start_pos = cdolist_list_var_46.first(); NIL != cdolist_list_var_46; cdolist_list_var_46 = cdolist_list_var_46.rest() , start_pos = cdolist_list_var_46.first()) {
                        {
                            SubLObject strings = NIL;
                            SubLObject cdotimes_end_var = length(pattern);
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                strings = cons(document.word_string(aref(words, add(i, start_pos))), strings);
                            }
                            if (NIL == list_utilities.find_if_not($sym446$ALPHANUMERIC_STRING_, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject candidate_noun_compound = string_utilities.bunge(nreverse(strings), UNPROVIDED);
                                    SubLObject item_var = candidate_noun_compound;
                                    if (NIL == member(item_var, candidate_noun_compounds, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        candidate_noun_compounds = cons(item_var, candidate_noun_compounds);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return candidate_noun_compounds;
        }
    }

    /**
     *
     *
     * @return LISTP of potential noun-compound strings from SENTENCE.
     */
    @LispMethod(comment = "@return LISTP of potential noun-compound strings from SENTENCE.")
    public static SubLObject l2r_sentence_candidate_noun_compounds(final SubLObject sentence) {
        assert NIL != document.sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        pos_tagger.tagger_tag_sentence(learning_reader.l2r_noun_compound_tagger(), sentence);
        final SubLObject words = document.sentence_constituents(sentence);
        SubLObject candidate_noun_compounds = NIL;
        SubLObject cdolist_list_var = learning_reader.l2r_noun_compound_patterns();
        SubLObject pattern = NIL;
        pattern = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$50 = string_utilities.search_all(pattern, words, symbol_function(EQL), symbol_function(learning_reader.WORD_CATEGORY));
            SubLObject start_pos = NIL;
            start_pos = cdolist_list_var_$50.first();
            while (NIL != cdolist_list_var_$50) {
                SubLObject strings = NIL;
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = length(pattern), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    strings = cons(document.word_string(aref(words, add(i, start_pos))), strings);
                }
                if (NIL == list_utilities.find_if_not(learning_reader.$sym453$ALPHANUMERIC_STRING_, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
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

    public static final SubLObject initialize_l2r_noun_compound_patterns_alt() {
        {
            SubLObject patterns = NIL;
            SubLObject cdolist_list_var = $l2r_noun_compound_category_pairs$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject pattern = make_vector(length(pair), UNPROVIDED);
                    SubLObject list_var = NIL;
                    SubLObject tag = NIL;
                    SubLObject n = NIL;
                    for (list_var = pair, tag = list_var.first(), n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tag = list_var.first() , n = add(ONE_INTEGER, n)) {
                        set_aref(pattern, n, document.new_word(list($STRING, $str_alt371$, $CATEGORY, tag)));
                    }
                    patterns = cons(pattern, patterns);
                }
            }
            $l2r_noun_compound_patterns$.setGlobalValue(patterns);
            return $l2r_noun_compound_patterns$.getGlobalValue();
        }
    }

    public static SubLObject initialize_l2r_noun_compound_patterns() {
        SubLObject patterns = NIL;
        SubLObject cdolist_list_var = learning_reader.$l2r_noun_compound_category_pairs$.getGlobalValue();
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
                set_aref(pattern, n, document.new_word(list($STRING, learning_reader.$str379$, $CATEGORY, tag)));
            }
            patterns = cons(pattern, patterns);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        learning_reader.$l2r_noun_compound_patterns$.setGlobalValue(patterns);
        return learning_reader.$l2r_noun_compound_patterns$.getGlobalValue();
    }

    public static final SubLObject l2r_noun_compound_patterns_alt() {
        if (!$l2r_noun_compound_patterns$.getGlobalValue().isList()) {
            com.cyc.cycjava.cycl.learning_reader.initialize_l2r_noun_compound_patterns();
        }
        return $l2r_noun_compound_patterns$.getGlobalValue();
    }

    public static SubLObject l2r_noun_compound_patterns() {
        if (!learning_reader.$l2r_noun_compound_patterns$.getGlobalValue().isList()) {
            learning_reader.initialize_l2r_noun_compound_patterns();
        }
        return learning_reader.$l2r_noun_compound_patterns$.getGlobalValue();
    }

    public static final SubLObject initialize_l2r_noun_compound_tagger_alt() {
        $l2r_noun_compound_tagger$.setGlobalValue(pos_tagger.new_tagger(UNPROVIDED));
        return $l2r_noun_compound_tagger$.getGlobalValue();
    }

    public static SubLObject initialize_l2r_noun_compound_tagger() {
        learning_reader.$l2r_noun_compound_tagger$.setGlobalValue(pos_tagger.new_tagger(UNPROVIDED));
        return learning_reader.$l2r_noun_compound_tagger$.getGlobalValue();
    }

    public static final SubLObject l2r_noun_compound_tagger_alt() {
        if (NIL == pos_tagger.tagger_p($l2r_noun_compound_tagger$.getGlobalValue())) {
            com.cyc.cycjava.cycl.learning_reader.initialize_l2r_noun_compound_tagger();
        }
        return $l2r_noun_compound_tagger$.getGlobalValue();
    }

    public static SubLObject l2r_noun_compound_tagger() {
        if (NIL == pos_tagger.tagger_p(learning_reader.$l2r_noun_compound_tagger$.getGlobalValue())) {
            learning_reader.initialize_l2r_noun_compound_tagger();
        }
        return learning_reader.$l2r_noun_compound_tagger$.getGlobalValue();
    }

    public static SubLObject declare_learning_reader_file() {
        declareFunction("default_learning_reader_cyclist", "DEFAULT-LEARNING-READER-CYCLIST", 0, 0, false);
        declareFunction("l2r_assert", "L2R-ASSERT", 1, 1, false);
        declareFunction("l2r_unassert_assertion", "L2R-UNASSERT-ASSERTION", 1, 0, false);
        declareFunction("l2r_create", "L2R-CREATE", 1, 0, false);
        declareFunction("add_text_learner_ebmt_training_example", "ADD-TEXT-LEARNER-EBMT-TRAINING-EXAMPLE", 2, 0, false);
        declareFunction("create_and_add_l2r_ebmt_template", "CREATE-AND-ADD-L2R-EBMT-TEMPLATE", 2, 0, false);
        declareFunction("l2r_ebmt_parse", "L2R-EBMT-PARSE", 1, 0, false);
        declareFunction("l2r_reader_image_run", "L2R-READER-IMAGE-RUN", 0, 0, false);
        declareFunction("l2r_reader_image_read_document", "L2R-READER-IMAGE-READ-DOCUMENT", 1, 0, false);
        declareFunction("l2r_read_document", "L2R-READ-DOCUMENT", 1, 1, false);
        declareMacro("l2r_computing_cpu_time", "L2R-COMPUTING-CPU-TIME");
        declareFunction("l2r_image_elapsed_cpu_time", "L2R-IMAGE-ELAPSED-CPU-TIME", 0, 0, false);
        declareFunction("l2r_read_paragraph", "L2R-READ-PARAGRAPH", 2, 1, false);
        declareFunction("l2r_paragraph_reader_print_function_trampoline", "L2R-PARAGRAPH-READER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("l2r_paragraph_reader_p", "L2R-PARAGRAPH-READER-P", 1, 0, false);
        new learning_reader.$l2r_paragraph_reader_p$UnaryFunction();
        declareFunction("l2r_paragraph_reader_paragraph", "L2R-PARAGRAPH-READER-PARAGRAPH", 1, 0, false);
        declareFunction("l2r_paragraph_reader_document", "L2R-PARAGRAPH-READER-DOCUMENT", 1, 0, false);
        declareFunction("l2r_paragraph_reader_paragraph_source_html", "L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML", 1, 0, false);
        declareFunction("l2r_paragraph_reader_sentence_vector", "L2R-PARAGRAPH-READER-SENTENCE-VECTOR", 1, 0, false);
        declareFunction("l2r_paragraph_reader_sentence_pegs", "L2R-PARAGRAPH-READER-SENTENCE-PEGS", 1, 0, false);
        declareFunction("l2r_paragraph_reader_sentence_non_html_texts", "L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS", 1, 0, false);
        declareFunction("l2r_paragraph_reader_sentence_number", "L2R-PARAGRAPH-READER-SENTENCE-NUMBER", 1, 0, false);
        declareFunction("l2r_paragraph_reader_linkage", "L2R-PARAGRAPH-READER-LINKAGE", 1, 0, false);
        declareFunction("l2r_paragraph_reader_linkage_fort", "L2R-PARAGRAPH-READER-LINKAGE-FORT", 1, 0, false);
        declareFunction("l2r_paragraph_reader_initial_assertion_count", "L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT", 1, 0, false);
        declareFunction("l2r_paragraph_reader_total_time", "L2R-PARAGRAPH-READER-TOTAL-TIME", 1, 0, false);
        declareFunction("l2r_paragraph_reader_total_cpu_time", "L2R-PARAGRAPH-READER-TOTAL-CPU-TIME", 1, 0, false);
        declareFunction("l2r_paragraph_reader_sentence_time", "L2R-PARAGRAPH-READER-SENTENCE-TIME", 1, 0, false);
        declareFunction("l2r_paragraph_reader_sentence_cpu_time", "L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME", 1, 0, false);
        declareFunction("l2r_paragraph_reader_state", "L2R-PARAGRAPH-READER-STATE", 1, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_paragraph", "_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_document", "_CSETF-L2R-PARAGRAPH-READER-DOCUMENT", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_paragraph_source_html", "_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_sentence_vector", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-VECTOR", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_sentence_pegs", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-PEGS", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_sentence_non_html_texts", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_sentence_number", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NUMBER", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_linkage", "_CSETF-L2R-PARAGRAPH-READER-LINKAGE", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_linkage_fort", "_CSETF-L2R-PARAGRAPH-READER-LINKAGE-FORT", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_initial_assertion_count", "_CSETF-L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_total_time", "_CSETF-L2R-PARAGRAPH-READER-TOTAL-TIME", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_total_cpu_time", "_CSETF-L2R-PARAGRAPH-READER-TOTAL-CPU-TIME", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_sentence_time", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-TIME", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_sentence_cpu_time", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME", 2, 0, false);
        declareFunction("_csetf_l2r_paragraph_reader_state", "_CSETF-L2R-PARAGRAPH-READER-STATE", 2, 0, false);
        declareFunction("make_l2r_paragraph_reader", "MAKE-L2R-PARAGRAPH-READER", 0, 1, false);
        declareFunction("visit_defstruct_l2r_paragraph_reader", "VISIT-DEFSTRUCT-L2R-PARAGRAPH-READER", 2, 0, false);
        declareFunction("visit_defstruct_object_l2r_paragraph_reader_method", "VISIT-DEFSTRUCT-OBJECT-L2R-PARAGRAPH-READER-METHOD", 2, 0, false);
        declareFunction("print_l2r_paragraph_reader", "PRINT-L2R-PARAGRAPH-READER", 3, 0, false);
        declareFunction("new_l2r_paragraph_reader", "NEW-L2R-PARAGRAPH-READER", 2, 0, false);
        declareFunction("l2r_get_source_html", "L2R-GET-SOURCE-HTML", 1, 0, false);
        declareFunction("l2r_assert_source_html", "L2R-ASSERT-SOURCE-HTML", 3, 1, false);
        declareFunction("l2r_paragraph_reader_next_in_separate_thread", "L2R-PARAGRAPH-READER-NEXT-IN-SEPARATE-THREAD", 1, 0, false);
        declareFunction("l2r_paragraph_reader_next", "L2R-PARAGRAPH-READER-NEXT", 1, 0, false);
        declareFunction("l2r_paragraph_reader_next_action", "L2R-PARAGRAPH-READER-NEXT-ACTION", 1, 0, false);
        declareFunction("destroy_l2r_paragraph_reader", "DESTROY-L2R-PARAGRAPH-READER", 1, 0, false);
        declareMacro("updating_l2r_paragraph_reader_times", "UPDATING-L2R-PARAGRAPH-READER-TIMES");
        declareMacro("with_temporary_transmit_state", "WITH-TEMPORARY-TRANSMIT-STATE");
        declareMacro("with_temporary_receive_state", "WITH-TEMPORARY-RECEIVE-STATE");
        declareFunction("reset_l2r_paragraph_reader_sentence_times", "RESET-L2R-PARAGRAPH-READER-SENTENCE-TIMES", 1, 0, false);
        declareFunction("new_l2r_reading_event_for_document", "NEW-L2R-READING-EVENT-FOR-DOCUMENT", 1, 0, false);
        declareFunction("find_unfinished_l2r_reading_event_for_document", "FIND-UNFINISHED-L2R-READING-EVENT-FOR-DOCUMENT", 1, 0, false);
        declareFunction("note_l2r_reading_event_ongoing", "NOTE-L2R-READING-EVENT-ONGOING", 1, 0, false);
        declareFunction("note_l2r_reading_event_done", "NOTE-L2R-READING-EVENT-DONE", 1, 0, false);
        declareFunction("l2r_paragraph_reader_find_or_create_pegs_for_sentence", "L2R-PARAGRAPH-READER-FIND-OR-CREATE-PEGS-FOR-SENTENCE", 1, 0, false);
        declareFunction("l2r_paragraph_reader_find_or_assert_linkage", "L2R-PARAGRAPH-READER-FIND-OR-ASSERT-LINKAGE", 1, 0, false);
        declareFunction("l2r_paragraph_reader_maybe_assert_parse_tree_for_linkage", "L2R-PARAGRAPH-READER-MAYBE-ASSERT-PARSE-TREE-FOR-LINKAGE", 1, 0, false);
        declareFunction("l2r_tokenization_has_parse_treeP", "L2R-TOKENIZATION-HAS-PARSE-TREE?", 2, 0, false);
        declareFunction("l2r_paragraph_reader_maybe_add_parsing_results", "L2R-PARAGRAPH-READER-MAYBE-ADD-PARSING-RESULTS", 1, 0, false);
        declareFunction("l2r_paragraph_reader_add_parsing_results", "L2R-PARAGRAPH-READER-ADD-PARSING-RESULTS", 1, 0, false);
        declareFunction("l2r_paragraph_reader_finalize_sentence", "L2R-PARAGRAPH-READER-FINALIZE-SENTENCE", 1, 0, false);
        declareFunction("l2r_finalize_sentence_peg", "L2R-FINALIZE-SENTENCE-PEG", 1, 0, false);
        declareFunction("l2r_paragraph_reader_collect_garbage", "L2R-PARAGRAPH-READER-COLLECT-GARBAGE", 1, 0, false);
        declareFunction("l2r_collect_garbage_for_sentence_pegs", "L2R-COLLECT-GARBAGE-FOR-SENTENCE-PEGS", 1, 0, false);
        declareFunction("l2r_read_paragraph_internal", "L2R-READ-PARAGRAPH-INTERNAL", 2, 2, false);
        declareFunction("l2r_assert_sentence_peg_results", "L2R-ASSERT-SENTENCE-PEG-RESULTS", 1, 0, false);
        declareFunction("l2r_assert_query_spec_results_for_sentence_peg", "L2R-ASSERT-QUERY-SPEC-RESULTS-FOR-SENTENCE-PEG", 2, 0, false);
        declareFunction("l2r_assert_distillation_query_results", "L2R-ASSERT-DISTILLATION-QUERY-RESULTS", 1, 0, false);
        declareFunction("l2r_finalization_query_specs", "L2R-FINALIZATION-QUERY-SPECS", 0, 0, false);
        declareFunction("l2r_garbage_collection_query_specs", "L2R-GARBAGE-COLLECTION-QUERY-SPECS", 0, 0, false);
        declareFunction("l2r_distillation_query_specs", "L2R-DISTILLATION-QUERY-SPECS", 0, 0, false);
        declareFunction("kbq_from_query_running", "KBQ-FROM-QUERY-RUNNING", 1, 0, false);
        declareFunction("l2r_run_finalization_query_for_sentence_peg", "L2R-RUN-FINALIZATION-QUERY-FOR-SENTENCE-PEG", 2, 0, false);
        declareFunction("l2r_print_total_time", "L2R-PRINT-TOTAL-TIME", 2, 1, false);
        declareFunction("l2r_readable_time_string", "L2R-READABLE-TIME-STRING", 1, 1, false);
        declareFunction("launch_long_inference_warner", "LAUNCH-LONG-INFERENCE-WARNER", 0, 0, false);
        declareFunction("warn_about_long_inferences", "WARN-ABOUT-LONG-INFERENCES", 0, 0, false);
        declareFunction("l2r_read_document_sentence", "L2R-READ-DOCUMENT-SENTENCE", 2, 0, false);
        declareFunction("l2r_read_sentence_for_peg", "L2R-READ-SENTENCE-FOR-PEG", 1, 0, false);
        declareFunction("l2r_find_or_assert_linkage_for_peg", "L2R-FIND-OR-ASSERT-LINKAGE-FOR-PEG", 1, 0, false);
        declareFunction("l2r_find_linkage_for_peg", "L2R-FIND-LINKAGE-FOR-PEG", 1, 0, false);
        declareFunction("l2r_assert_linkage_for_peg", "L2R-ASSERT-LINKAGE-FOR-PEG", 1, 0, false);
        declareFunction("l2r_assert_parse_tree_for_linkage", "L2R-ASSERT-PARSE-TREE-FOR-LINKAGE", 3, 0, false);
        declareFunction("l2r_linkage_creation_rules", "L2R-LINKAGE-CREATION-RULES", 0, 0, false);
        declareFunction("l2r_new_tokenization_shell_for_peg", "L2R-NEW-TOKENIZATION-SHELL-FOR-PEG", 2, 0, false);
        declareFunction("l2r_find_tokenization_for_peg", "L2R-FIND-TOKENIZATION-FOR-PEG", 1, 0, false);
        declareFunction("l2r_sentence_peg_text", "L2R-SENTENCE-PEG-TEXT", 1, 0, false);
        declareFunction("l2r_reader_image_find_or_create_document_reader", "L2R-READER-IMAGE-FIND-OR-CREATE-DOCUMENT-READER", 0, 0, false);
        declareFunction("l2r_new_reader_for_document", "L2R-NEW-READER-FOR-DOCUMENT", 1, 0, false);
        declareFunction("l2r_document_reader_print_function_trampoline", "L2R-DOCUMENT-READER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("l2r_document_reader_p", "L2R-DOCUMENT-READER-P", 1, 0, false);
        new learning_reader.$l2r_document_reader_p$UnaryFunction();
        declareFunction("l2r_document_reader_document", "L2R-DOCUMENT-READER-DOCUMENT", 1, 0, false);
        declareFunction("l2r_document_reader_remaining_paragraphs", "L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS", 1, 0, false);
        declareFunction("l2r_document_reader_read_paragraphs", "L2R-DOCUMENT-READER-READ-PARAGRAPHS", 1, 0, false);
        declareFunction("l2r_document_reader_paragraph_reader", "L2R-DOCUMENT-READER-PARAGRAPH-READER", 1, 0, false);
        declareFunction("l2r_document_reader_reading_event", "L2R-DOCUMENT-READER-READING-EVENT", 1, 0, false);
        declareFunction("_csetf_l2r_document_reader_document", "_CSETF-L2R-DOCUMENT-READER-DOCUMENT", 2, 0, false);
        declareFunction("_csetf_l2r_document_reader_remaining_paragraphs", "_CSETF-L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS", 2, 0, false);
        declareFunction("_csetf_l2r_document_reader_read_paragraphs", "_CSETF-L2R-DOCUMENT-READER-READ-PARAGRAPHS", 2, 0, false);
        declareFunction("_csetf_l2r_document_reader_paragraph_reader", "_CSETF-L2R-DOCUMENT-READER-PARAGRAPH-READER", 2, 0, false);
        declareFunction("_csetf_l2r_document_reader_reading_event", "_CSETF-L2R-DOCUMENT-READER-READING-EVENT", 2, 0, false);
        declareFunction("make_l2r_document_reader", "MAKE-L2R-DOCUMENT-READER", 0, 1, false);
        declareFunction("visit_defstruct_l2r_document_reader", "VISIT-DEFSTRUCT-L2R-DOCUMENT-READER", 2, 0, false);
        declareFunction("visit_defstruct_object_l2r_document_reader_method", "VISIT-DEFSTRUCT-OBJECT-L2R-DOCUMENT-READER-METHOD", 2, 0, false);
        declareFunction("print_l2r_document_reader", "PRINT-L2R-DOCUMENT-READER", 3, 0, false);
        declareFunction("new_l2r_document_reader", "NEW-L2R-DOCUMENT-READER", 2, 0, false);
        declareFunction("get_l2r_reader_image_document_reader", "GET-L2R-READER-IMAGE-DOCUMENT-READER", 0, 0, false);
        declareFunction("set_l2r_reader_image_document_reader", "SET-L2R-READER-IMAGE-DOCUMENT-READER", 1, 0, false);
        declareFunction("l2r_document_reader_read_document", "L2R-DOCUMENT-READER-READ-DOCUMENT", 1, 0, false);
        declareFunction("l2r_document_reader_find_or_create_paragraph_reader", "L2R-DOCUMENT-READER-FIND-OR-CREATE-PARAGRAPH-READER", 1, 0, false);
        declareFunction("l2r_document_reader_get_new_paragraph_reader", "L2R-DOCUMENT-READER-GET-NEW-PARAGRAPH-READER", 1, 0, false);
        declareFunction("l2r_pick_document_to_read", "L2R-PICK-DOCUMENT-TO-READ", 0, 0, false);
        declareFunction("starts_before_starting_ofP", "STARTS-BEFORE-STARTING-OF?", 2, 0, false);
        declareFunction("l2r_image_file", "L2R-IMAGE-FILE", 1, 1, false);
        declareFunction("write_l2r_image_for_document", "WRITE-L2R-IMAGE-FOR-DOCUMENT", 1, 1, false);
        declareFunction("l2r_find_or_create_document_paragraphs", "L2R-FIND-OR-CREATE-DOCUMENT-PARAGRAPHS", 1, 1, false);
        declareFunction("l2r_find_or_create_webpage_paragraphs", "L2R-FIND-OR-CREATE-WEBPAGE-PARAGRAPHS", 3, 0, false);
        declareFunction("l2r_download_webpage", "L2R-DOWNLOAD-WEBPAGE", 1, 0, false);
        declareFunction("l2r_most_recent_webpage_download", "L2R-MOST-RECENT-WEBPAGE-DOWNLOAD", 1, 0, false);
        declareFunction("l2r_find_webpage_paragraphs", "L2R-FIND-WEBPAGE-PARAGRAPHS", 1, 2, false);
        declareFunction("l2r_reify_webpage_paragraphs", "L2R-REIFY-WEBPAGE-PARAGRAPHS", 1, 2, false);
        declareFunction("l2r_identify_webpage_paragraphs", "L2R-IDENTIFY-WEBPAGE-PARAGRAPHS", 2, 0, false);
        declareFunction("l2r_find_next_webpage_paragraph", "L2R-FIND-NEXT-WEBPAGE-PARAGRAPH", 4, 0, false);
        declareFunction("l2r_reify_one_webpage_paragraph", "L2R-REIFY-ONE-WEBPAGE-PARAGRAPH", 4, 0, false);
        declareFunction("l2r_best_webpage_source", "L2R-BEST-WEBPAGE-SOURCE", 1, 1, false);
        declareFunction("l2r_reify_sentence_level_pegs_for_document", "L2R-REIFY-SENTENCE-LEVEL-PEGS-FOR-DOCUMENT", 1, 0, false);
        declareFunction("l2r_reify_peg_for_sentence", "L2R-REIFY-PEG-FOR-SENTENCE", 2, 0, false);
        declareFunction("l2r_find_or_reify_peg_for_sentence_string", "L2R-FIND-OR-REIFY-PEG-FOR-SENTENCE-STRING", 5, 0, false);
        declareFunction("l2r_find_sentence_peg_from_sentences", "L2R-FIND-SENTENCE-PEG-FROM-SENTENCES", 2, 0, false);
        declareFunction("clear_l2r_sentence_level_peg_creation_template", "CLEAR-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE", 0, 0, false);
        declareFunction("remove_l2r_sentence_level_peg_creation_template", "REMOVE-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE", 0, 0, false);
        declareFunction("l2r_sentence_level_peg_creation_template_internal", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-INTERNAL", 0, 0, false);
        declareFunction("l2r_sentence_level_peg_creation_template", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE", 0, 0, false);
        declareFunction("clear_l2r_sentence_level_peg_exemplar", "CLEAR-L2R-SENTENCE-LEVEL-PEG-EXEMPLAR", 0, 0, false);
        declareFunction("remove_l2r_sentence_level_peg_exemplar", "REMOVE-L2R-SENTENCE-LEVEL-PEG-EXEMPLAR", 0, 0, false);
        declareFunction("l2r_sentence_level_peg_exemplar_internal", "L2R-SENTENCE-LEVEL-PEG-EXEMPLAR-INTERNAL", 0, 0, false);
        declareFunction("l2r_sentence_level_peg_exemplar", "L2R-SENTENCE-LEVEL-PEG-EXEMPLAR", 0, 0, false);
        declareFunction("l2r_sentence_level_peg_creation_rules", "L2R-SENTENCE-LEVEL-PEG-CREATION-RULES", 0, 0, false);
        declareFunction("clear_l2r_sentence_level_peg_creation_template_sentences", "CLEAR-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        declareFunction("remove_l2r_sentence_level_peg_creation_template_sentences", "REMOVE-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        declareFunction("l2r_sentence_level_peg_creation_template_sentences_internal", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES-INTERNAL", 0, 0, false);
        declareFunction("l2r_sentence_level_peg_creation_template_sentences", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        declareFunction("l2r_dereference_sentence_level_peg_assertion_sentence", "L2R-DEREFERENCE-SENTENCE-LEVEL-PEG-ASSERTION-SENTENCE", 7, 0, false);
        declareFunction("clear_l2r_document_indexical", "CLEAR-L2R-DOCUMENT-INDEXICAL", 0, 0, false);
        declareFunction("remove_l2r_document_indexical", "REMOVE-L2R-DOCUMENT-INDEXICAL", 0, 0, false);
        declareFunction("l2r_document_indexical_internal", "L2R-DOCUMENT-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction("l2r_document_indexical", "L2R-DOCUMENT-INDEXICAL", 0, 0, false);
        declareFunction("clear_l2r_sentence_indexical", "CLEAR-L2R-SENTENCE-INDEXICAL", 0, 0, false);
        declareFunction("remove_l2r_sentence_indexical", "REMOVE-L2R-SENTENCE-INDEXICAL", 0, 0, false);
        declareFunction("l2r_sentence_indexical_internal", "L2R-SENTENCE-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction("l2r_sentence_indexical", "L2R-SENTENCE-INDEXICAL", 0, 0, false);
        declareFunction("clear_l2r_supertext_indexical", "CLEAR-L2R-SUPERTEXT-INDEXICAL", 0, 0, false);
        declareFunction("remove_l2r_supertext_indexical", "REMOVE-L2R-SUPERTEXT-INDEXICAL", 0, 0, false);
        declareFunction("l2r_supertext_indexical_internal", "L2R-SUPERTEXT-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction("l2r_supertext_indexical", "L2R-SUPERTEXT-INDEXICAL", 0, 0, false);
        declareFunction("clear_l2r_sentence_string_indexical", "CLEAR-L2R-SENTENCE-STRING-INDEXICAL", 0, 0, false);
        declareFunction("remove_l2r_sentence_string_indexical", "REMOVE-L2R-SENTENCE-STRING-INDEXICAL", 0, 0, false);
        declareFunction("l2r_sentence_string_indexical_internal", "L2R-SENTENCE-STRING-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction("l2r_sentence_string_indexical", "L2R-SENTENCE-STRING-INDEXICAL", 0, 0, false);
        declareFunction("clear_l2r_sentence_number_indexical", "CLEAR-L2R-SENTENCE-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction("remove_l2r_sentence_number_indexical", "REMOVE-L2R-SENTENCE-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction("l2r_sentence_number_indexical_internal", "L2R-SENTENCE-NUMBER-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction("l2r_sentence_number_indexical", "L2R-SENTENCE-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction("clear_l2r_sentence_string_number_indexical", "CLEAR-L2R-SENTENCE-STRING-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction("remove_l2r_sentence_string_number_indexical", "REMOVE-L2R-SENTENCE-STRING-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction("l2r_sentence_string_number_indexical_internal", "L2R-SENTENCE-STRING-NUMBER-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction("l2r_sentence_string_number_indexical", "L2R-SENTENCE-STRING-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction("get_l2r_sentence_level_peg_creation_template_sentences", "GET-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        declareFunction("sentencify_l2r_paragraph", "SENTENCIFY-L2R-PARAGRAPH", 1, 0, false);
        declareFunction("set_l2r_sentence_string", "SET-L2R-SENTENCE-STRING", 1, 1, false);
        declareFunction("l2r_reconstruct_word_string", "L2R-RECONSTRUCT-WORD-STRING", 1, 1, false);
        declareFunction("l2r_word_length", "L2R-WORD-LENGTH", 1, 1, false);
        declareFunction("l2r_word_leading_whitespace", "L2R-WORD-LEADING-WHITESPACE", 1, 0, false);
        declareFunction("l2r_assert_subexpression_links", "L2R-ASSERT-SUBEXPRESSION-LINKS", 3, 0, false);
        declareFunction("l2r_extract_links_from_sentence", "L2R-EXTRACT-LINKS-FROM-SENTENCE", 1, 1, false);
        declareFunction("l2r_sanity_check_subexpression", "L2R-SANITY-CHECK-SUBEXPRESSION", 5, 0, false);
        declareFunction("l2r_sentences_for_document", "L2R-SENTENCES-FOR-DOCUMENT", 1, 0, false);
        declareFunction("clear_l2r_document_sentence_finder_kbq", "CLEAR-L2R-DOCUMENT-SENTENCE-FINDER-KBQ", 0, 0, false);
        declareFunction("remove_l2r_document_sentence_finder_kbq", "REMOVE-L2R-DOCUMENT-SENTENCE-FINDER-KBQ", 0, 0, false);
        declareFunction("l2r_document_sentence_finder_kbq_internal", "L2R-DOCUMENT-SENTENCE-FINDER-KBQ-INTERNAL", 0, 0, false);
        declareFunction("l2r_document_sentence_finder_kbq", "L2R-DOCUMENT-SENTENCE-FINDER-KBQ", 0, 0, false);
        declareFunction("l2r_document_sentence_finder_query_sentence", "L2R-DOCUMENT-SENTENCE-FINDER-QUERY-SENTENCE", 1, 0, false);
        declareFunction("simple_assert_linkages_for_page", "SIMPLE-ASSERT-LINKAGES-FOR-PAGE", 1, 1, false);
        declareFunction("l2r_cyclify_webpage", "L2R-CYCLIFY-WEBPAGE", 2, 1, false);
        declareFunction("l2r_write_webpage_links", "L2R-WRITE-WEBPAGE-LINKS", 3, 0, false);
        declareFunction("l2r_cyclify_wikipedia_pages_for_unknown_phrases", "L2R-CYCLIFY-WIKIPEDIA-PAGES-FOR-UNKNOWN-PHRASES", 1, 0, false);
        declareFunction("l2r_get_unknown_phrase_wikipedia_links_from_file", "L2R-GET-UNKNOWN-PHRASE-WIKIPEDIA-LINKS-FROM-FILE", 1, 0, false);
        declareFunction("extract_link_relative_url", "EXTRACT-LINK-RELATIVE-URL", 1, 0, false);
        declareFunction("unknown_phrase_wikipedia_linkP", "UNKNOWN-PHRASE-WIKIPEDIA-LINK?", 1, 0, false);
        declareFunction("unknown_phrase_linkP", "UNKNOWN-PHRASE-LINK?", 1, 0, false);
        declareFunction("l2r_save_new_webpage_sentences", "L2R-SAVE-NEW-WEBPAGE-SENTENCES", 4, 0, false);
        declareFunction("l2r_cyclify_unparsed_sentences", "L2R-CYCLIFY-UNPARSED-SENTENCES", 1, 0, false);
        declareFunction("l2r_log_cyclifications_for_unparsed_sentences", "L2R-LOG-CYCLIFICATIONS-FOR-UNPARSED-SENTENCES", 1, 0, false);
        declareFunction("html_eos_open_tags", "HTML-EOS-OPEN-TAGS", 0, 0, false);
        declareFunction("html_eos_close_tags", "HTML-EOS-CLOSE-TAGS", 0, 0, false);
        declareFunction("wikipedia_meta_strings", "WIKIPEDIA-META-STRINGS", 0, 0, false);
        declareFunction("replace_separator_tags_with_eos", "REPLACE-SEPARATOR-TAGS-WITH-EOS", 1, 0, false);
        declareFunction("strip_text_between_tags_of_type", "STRIP-TEXT-BETWEEN-TAGS-OF-TYPE", 2, 0, false);
        declareFunction("strip_wikipedia_page", "STRIP-WIKIPEDIA-PAGE", 1, 0, false);
        declareFunction("probably_wikipedia_meta_sentence_p", "PROBABLY-WIKIPEDIA-META-SENTENCE-P", 1, 0, false);
        declareFunction("detagged_page_as_string", "DETAGGED-PAGE-AS-STRING", 1, 2, false);
        declareFunction("l2r_stringify_one_paragraph", "L2R-STRINGIFY-ONE-PARAGRAPH", 4, 0, false);
        declareFunction("l2r_stringify_one_sentence", "L2R-STRINGIFY-ONE-SENTENCE", 2, 0, false);
        declareFunction("detagged_page_as_string_old", "DETAGGED-PAGE-AS-STRING-OLD", 1, 2, false);
        declareFunction("page_to_detagged_sentence_strings", "PAGE-TO-DETAGGED-SENTENCE-STRINGS", 1, 2, false);
        declareFunction("parse_and_partition_document_file", "PARSE-AND-PARTITION-DOCUMENT-FILE", 2, 3, false);
        declareFunction("read_topic_struct_paragraphs_from_file", "READ-TOPIC-STRUCT-PARAGRAPHS-FROM-FILE", 1, 0, false);
        declareFunction("parse_and_partition_paragraph_texts", "PARSE-AND-PARTITION-PARAGRAPH-TEXTS", 2, 3, false);
        declareFunction("partioned_parse_results_file_name", "PARTIONED-PARSE-RESULTS-FILE-NAME", 2, 0, false);
        declareFunction("write_partioned_parse_results", "WRITE-PARTIONED-PARSE-RESULTS", 5, 0, false);
        declareFunction("write_partioned_parse_result", "WRITE-PARTIONED-PARSE-RESULT", 2, 0, false);
        declareFunction("l2r_paragraph_candidate_noun_compounds", "L2R-PARAGRAPH-CANDIDATE-NOUN-COMPOUNDS", 1, 0, false);
        declareFunction("l2r_sentence_candidate_noun_compounds", "L2R-SENTENCE-CANDIDATE-NOUN-COMPOUNDS", 1, 0, false);
        declareFunction("initialize_l2r_noun_compound_patterns", "INITIALIZE-L2R-NOUN-COMPOUND-PATTERNS", 0, 0, false);
        declareFunction("l2r_noun_compound_patterns", "L2R-NOUN-COMPOUND-PATTERNS", 0, 0, false);
        declareFunction("initialize_l2r_noun_compound_tagger", "INITIALIZE-L2R-NOUN-COMPOUND-TAGGER", 0, 0, false);
        declareFunction("l2r_noun_compound_tagger", "L2R-NOUN-COMPOUND-TAGGER", 0, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt2$L2R__Failed_asserting____S___in__ = makeString("L2R: Failed asserting~% ~S~% in ~S:~% ~S");

    static private final SubLString $str_alt3$L2R_ = makeString("L2R-");

    static private final SubLString $str_alt4$cyc8_cyc_com = makeString("cyc8.cyc.com");

    static private final SubLString $str_alt6$_cyc_projects_reading_learning_da = makeString("/cyc/projects/reading-learning/data/ebmt-index.txt");

    static private final SubLString $str_alt7$_cyc_projects_reading_learning_da = makeString("/cyc/projects/reading-learning/data/ebmt-index.log");

    static private final SubLList $list_alt8 = list(makeSymbol("NL-SENT"), makeSymbol("CYCL-SENT"));

    static private final SubLString $str_alt10$_A_now___ = makeString("~A now...");

    static private final SubLString $str_alt13$Finished_reading__S_ = makeString("Finished reading ~S.");

    static private final SubLString $str_alt15$The_TextLearner_can_only_read_ins = makeString("The TextLearner can only read instances of #$PropositionalConceptualWork, which ~S does not appear to be.");

    static private final SubLString $str_alt16$Reading_ = makeString("Reading ");

    static private final SubLString $str_alt17$Couldn_t_find_any_paragraphs_reif = makeString("Couldn't find any paragraphs reified for ~S");

    static private final SubLList $list_alt18 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym19$START = makeUninternedSymbol("START");

    static private final SubLSymbol $sym20$END = makeUninternedSymbol("END");

    static private final SubLList $list_alt22 = list(list(makeSymbol("L2R-IMAGE-ELAPSED-CPU-TIME")));

    static private final SubLSymbol $sym25$_ = makeSymbol("-");

    static private final SubLString $str_alt28$Please_clear_the_local_transcript = makeString("Please clear the local transcript before running the Text Learner.");

    static private final SubLString $str_alt29$The_Text_Learner_can_t_be_run_whi = makeString("The Text Learner can't be run while there are operations on the local queue.");

    static private final SubLList $list_alt33 = list(new SubLObject[]{ makeSymbol("PARAGRAPH"), makeSymbol("DOCUMENT"), makeSymbol("PARAGRAPH-SOURCE-HTML"), makeSymbol("SENTENCE-VECTOR"), makeSymbol("SENTENCE-PEGS"), makeSymbol("SENTENCE-NON-HTML-TEXTS"), makeSymbol("SENTENCE-NUMBER"), makeSymbol("LINKAGE"), makeSymbol("LINKAGE-FORT"), makeSymbol("INITIAL-ASSERTION-COUNT"), makeSymbol("TOTAL-TIME"), makeSymbol("TOTAL-CPU-TIME"), makeSymbol("SENTENCE-TIME"), makeSymbol("SENTENCE-CPU-TIME"), makeSymbol("STATE") });

    public static final SubLObject init_learning_reader_file_alt() {
        deflexical("*LEARNING-READER-TIMESTAMP*", numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
        deflexical("*L2R-EBMT-INDEX-HOST*", $str_alt4$cyc8_cyc_com);
        deflexical("*L2R-EBMT-INDEX-PORT*", $int$7779);
        deflexical("*L2R-EBMT-INDEX-CONTENT*", $str_alt6$_cyc_projects_reading_learning_da);
        deflexical("*L2R-EBMT-INDEX-LOG*", $str_alt7$_cyc_projects_reading_learning_da);
        defparameter("*L2R-TRANSMIT-OPERATIONS?*", NIL);
        defparameter("*L2R-READER-UNSTABLE-INSIDE-STEPS?*", T);
        defconstant("*DTP-L2R-PARAGRAPH-READER*", L2R_PARAGRAPH_READER);
        defparameter("*L2R-FINALIZATION-PROBLEM-STORE*", NIL);
        deflexical("*LONG-INFERENCE-CUTOFF*", $int$600);
        defparameter("*CURRENT-LONG-INFERENCE-INFO*", NIL);
        defconstant("*DTP-L2R-DOCUMENT-READER*", L2R_DOCUMENT_READER);
        deflexical("*L2R-READER-IMAGE-DOCUMENT-READER*", NIL != boundp($sym232$_L2R_READER_IMAGE_DOCUMENT_READER_) ? ((SubLObject) ($l2r_reader_image_document_reader$.getGlobalValue())) : NIL);
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
        deflexical("*HTML-IMPLICIT-EOS-TAGS*", $list_alt395);
        deflexical("*HTML-EOS-OPEN-TAGS*", NIL);
        deflexical("*HTML-EOS-CLOSE-TAGS*", NIL);
        deflexical("*WIKIPEDIA-META-STRINGS*", $list_alt400);
        deflexical("*L2R-NOUN-COMPOUND-PATTERNS*", $UNINITIALIZED);
        deflexical("*L2R-NOUN-COMPOUND-CATEGORY-PAIRS", $list_alt449);
        deflexical("*L2R-NOUN-COMPOUND-TAGGER*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject init_learning_reader_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*LEARNING-READER-TIMESTAMP*", numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
            deflexical("*L2R-EBMT-INDEX-HOST*", learning_reader.$str4$cyc8_cyc_com);
            deflexical("*L2R-EBMT-INDEX-PORT*", learning_reader.$int$7779);
            deflexical("*L2R-EBMT-INDEX-CONTENT*", learning_reader.$str6$_cyc_projects_reading_learning_da);
            deflexical("*L2R-EBMT-INDEX-LOG*", learning_reader.$str7$_cyc_projects_reading_learning_da);
            defparameter("*L2R-TRANSMIT-OPERATIONS?*", NIL);
            defparameter("*L2R-READER-UNSTABLE-INSIDE-STEPS?*", T);
            defconstant("*DTP-L2R-PARAGRAPH-READER*", learning_reader.L2R_PARAGRAPH_READER);
            defparameter("*L2R-FINALIZATION-PROBLEM-STORE*", NIL);
            deflexical("*LONG-INFERENCE-CUTOFF*", learning_reader.$int$600);
            defparameter("*CURRENT-LONG-INFERENCE-INFO*", NIL);
            defconstant("*DTP-L2R-DOCUMENT-READER*", learning_reader.L2R_DOCUMENT_READER);
            deflexical("*L2R-READER-IMAGE-DOCUMENT-READER*", SubLTrampolineFile.maybeDefault(learning_reader.$sym242$_L2R_READER_IMAGE_DOCUMENT_READER_, learning_reader.$l2r_reader_image_document_reader$, NIL));
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
            deflexical("*HTML-IMPLICIT-EOS-TAGS*", learning_reader.$list402);
            deflexical("*HTML-EOS-OPEN-TAGS*", NIL);
            deflexical("*HTML-EOS-CLOSE-TAGS*", NIL);
            deflexical("*WIKIPEDIA-META-STRINGS*", learning_reader.$list407);
            deflexical("*L2R-NOUN-COMPOUND-PATTERNS*", $UNINITIALIZED);
            deflexical("*L2R-NOUN-COMPOUND-CATEGORY-PAIRS", learning_reader.$list456);
            deflexical("*L2R-NOUN-COMPOUND-TAGGER*", $UNINITIALIZED);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*L2R-READER-IMAGE-DOCUMENT-READER*", NIL != boundp($sym232$_L2R_READER_IMAGE_DOCUMENT_READER_) ? ((SubLObject) ($l2r_reader_image_document_reader$.getGlobalValue())) : NIL);
            deflexical("*HTML-IMPLICIT-EOS-TAGS*", $list_alt395);
            deflexical("*WIKIPEDIA-META-STRINGS*", $list_alt400);
            deflexical("*L2R-NOUN-COMPOUND-CATEGORY-PAIRS", $list_alt449);
        }
        return NIL;
    }

    public static SubLObject init_learning_reader_file_Previous() {
        deflexical("*LEARNING-READER-TIMESTAMP*", numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
        deflexical("*L2R-EBMT-INDEX-HOST*", learning_reader.$str4$cyc8_cyc_com);
        deflexical("*L2R-EBMT-INDEX-PORT*", learning_reader.$int$7779);
        deflexical("*L2R-EBMT-INDEX-CONTENT*", learning_reader.$str6$_cyc_projects_reading_learning_da);
        deflexical("*L2R-EBMT-INDEX-LOG*", learning_reader.$str7$_cyc_projects_reading_learning_da);
        defparameter("*L2R-TRANSMIT-OPERATIONS?*", NIL);
        defparameter("*L2R-READER-UNSTABLE-INSIDE-STEPS?*", T);
        defconstant("*DTP-L2R-PARAGRAPH-READER*", learning_reader.L2R_PARAGRAPH_READER);
        defparameter("*L2R-FINALIZATION-PROBLEM-STORE*", NIL);
        deflexical("*LONG-INFERENCE-CUTOFF*", learning_reader.$int$600);
        defparameter("*CURRENT-LONG-INFERENCE-INFO*", NIL);
        defconstant("*DTP-L2R-DOCUMENT-READER*", learning_reader.L2R_DOCUMENT_READER);
        deflexical("*L2R-READER-IMAGE-DOCUMENT-READER*", SubLTrampolineFile.maybeDefault(learning_reader.$sym242$_L2R_READER_IMAGE_DOCUMENT_READER_, learning_reader.$l2r_reader_image_document_reader$, NIL));
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
        deflexical("*HTML-IMPLICIT-EOS-TAGS*", learning_reader.$list402);
        deflexical("*HTML-EOS-OPEN-TAGS*", NIL);
        deflexical("*HTML-EOS-CLOSE-TAGS*", NIL);
        deflexical("*WIKIPEDIA-META-STRINGS*", learning_reader.$list407);
        deflexical("*L2R-NOUN-COMPOUND-PATTERNS*", $UNINITIALIZED);
        deflexical("*L2R-NOUN-COMPOUND-CATEGORY-PAIRS", learning_reader.$list456);
        deflexical("*L2R-NOUN-COMPOUND-TAGGER*", $UNINITIALIZED);
        return NIL;
    }

    static private final SubLList $list_alt34 = list(new SubLObject[]{ makeKeyword("PARAGRAPH"), makeKeyword("DOCUMENT"), makeKeyword("PARAGRAPH-SOURCE-HTML"), makeKeyword("SENTENCE-VECTOR"), makeKeyword("SENTENCE-PEGS"), makeKeyword("SENTENCE-NON-HTML-TEXTS"), makeKeyword("SENTENCE-NUMBER"), makeKeyword("LINKAGE"), makeKeyword("LINKAGE-FORT"), makeKeyword("INITIAL-ASSERTION-COUNT"), makeKeyword("TOTAL-TIME"), makeKeyword("TOTAL-CPU-TIME"), makeKeyword("SENTENCE-TIME"), makeKeyword("SENTENCE-CPU-TIME"), makeKeyword("STATE") });

    static private final SubLList $list_alt35 = list(new SubLObject[]{ makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH"), makeSymbol("L2R-PARAGRAPH-READER-DOCUMENT"), makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-VECTOR"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-PEGS"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NUMBER"), makeSymbol("L2R-PARAGRAPH-READER-LINKAGE"), makeSymbol("L2R-PARAGRAPH-READER-LINKAGE-FORT"), makeSymbol("L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT"), makeSymbol("L2R-PARAGRAPH-READER-TOTAL-TIME"), makeSymbol("L2R-PARAGRAPH-READER-TOTAL-CPU-TIME"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-TIME"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME"), makeSymbol("L2R-PARAGRAPH-READER-STATE") });

    static private final SubLList $list_alt36 = list(new SubLObject[]{ makeSymbol("_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-DOCUMENT"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-VECTOR"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-PEGS"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NUMBER"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-LINKAGE"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-LINKAGE-FORT"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-TOTAL-TIME"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-TOTAL-CPU-TIME"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-TIME"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-STATE") });

    public static final SubLObject setup_learning_reader_file_alt() {
        register_kb_function(ADD_TEXT_LEARNER_EBMT_TRAINING_EXAMPLE);
        register_macro_helper(L2R_IMAGE_ELAPSED_CPU_TIME, L2R_COMPUTING_CPU_TIME);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_l2r_paragraph_reader$.getGlobalValue(), symbol_function(L2R_PARAGRAPH_READER_PRINT_FUNCTION_TRAMPOLINE));
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
        register_method($print_object_method_table$.getGlobalValue(), $dtp_l2r_document_reader$.getGlobalValue(), symbol_function(L2R_DOCUMENT_READER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(L2R_DOCUMENT_READER_DOCUMENT, _CSETF_L2R_DOCUMENT_READER_DOCUMENT);
        def_csetf(L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS, _CSETF_L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS);
        def_csetf(L2R_DOCUMENT_READER_READ_PARAGRAPHS, _CSETF_L2R_DOCUMENT_READER_READ_PARAGRAPHS);
        def_csetf(L2R_DOCUMENT_READER_PARAGRAPH_READER, _CSETF_L2R_DOCUMENT_READER_PARAGRAPH_READER);
        def_csetf(L2R_DOCUMENT_READER_READING_EVENT, _CSETF_L2R_DOCUMENT_READER_READING_EVENT);
        identity(L2R_DOCUMENT_READER);
        declare_defglobal($sym232$_L2R_READER_IMAGE_DOCUMENT_READER_);
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

    public static SubLObject setup_learning_reader_file() {
        if (SubLFiles.USE_V1) {
            register_kb_function(learning_reader.ADD_TEXT_LEARNER_EBMT_TRAINING_EXAMPLE);
            register_macro_helper(learning_reader.L2R_IMAGE_ELAPSED_CPU_TIME, learning_reader.L2R_COMPUTING_CPU_TIME);
            register_method($print_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_paragraph_reader$.getGlobalValue(), symbol_function(learning_reader.L2R_PARAGRAPH_READER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(learning_reader.$list40);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_PARAGRAPH, learning_reader._CSETF_L2R_PARAGRAPH_READER_PARAGRAPH);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_DOCUMENT, learning_reader._CSETF_L2R_PARAGRAPH_READER_DOCUMENT);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML, learning_reader._CSETF_L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_VECTOR, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_VECTOR);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_PEGS, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_PEGS);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_NUMBER, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_NUMBER);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_LINKAGE, learning_reader._CSETF_L2R_PARAGRAPH_READER_LINKAGE);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_LINKAGE_FORT, learning_reader._CSETF_L2R_PARAGRAPH_READER_LINKAGE_FORT);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT, learning_reader._CSETF_L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_TOTAL_TIME, learning_reader._CSETF_L2R_PARAGRAPH_READER_TOTAL_TIME);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, learning_reader._CSETF_L2R_PARAGRAPH_READER_TOTAL_CPU_TIME);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_TIME, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_TIME);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME);
            def_csetf(learning_reader.L2R_PARAGRAPH_READER_STATE, learning_reader._CSETF_L2R_PARAGRAPH_READER_STATE);
            identity(learning_reader.L2R_PARAGRAPH_READER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_paragraph_reader$.getGlobalValue(), symbol_function(learning_reader.VISIT_DEFSTRUCT_OBJECT_L2R_PARAGRAPH_READER_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_document_reader$.getGlobalValue(), symbol_function(learning_reader.L2R_DOCUMENT_READER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(learning_reader.$list224);
            def_csetf(learning_reader.L2R_DOCUMENT_READER_DOCUMENT, learning_reader._CSETF_L2R_DOCUMENT_READER_DOCUMENT);
            def_csetf(learning_reader.L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS, learning_reader._CSETF_L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS);
            def_csetf(learning_reader.L2R_DOCUMENT_READER_READ_PARAGRAPHS, learning_reader._CSETF_L2R_DOCUMENT_READER_READ_PARAGRAPHS);
            def_csetf(learning_reader.L2R_DOCUMENT_READER_PARAGRAPH_READER, learning_reader._CSETF_L2R_DOCUMENT_READER_PARAGRAPH_READER);
            def_csetf(learning_reader.L2R_DOCUMENT_READER_READING_EVENT, learning_reader._CSETF_L2R_DOCUMENT_READER_READING_EVENT);
            identity(learning_reader.L2R_DOCUMENT_READER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_document_reader$.getGlobalValue(), symbol_function(learning_reader.VISIT_DEFSTRUCT_OBJECT_L2R_DOCUMENT_READER_METHOD));
            declare_defglobal(learning_reader.$sym242$_L2R_READER_IMAGE_DOCUMENT_READER_);
            memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE);
            memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_LEVEL_PEG_EXEMPLAR);
            memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES);
            memoization_state.note_globally_cached_function(learning_reader.L2R_DOCUMENT_INDEXICAL);
            memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_INDEXICAL);
            memoization_state.note_globally_cached_function(learning_reader.L2R_SUPERTEXT_INDEXICAL);
            memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_STRING_INDEXICAL);
            memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_NUMBER_INDEXICAL);
            memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_STRING_NUMBER_INDEXICAL);
            memoization_state.note_globally_cached_function(learning_reader.L2R_DOCUMENT_SENTENCE_FINDER_KBQ);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($sym232$_L2R_READER_IMAGE_DOCUMENT_READER_);
        }
        return NIL;
    }

    public static SubLObject setup_learning_reader_file_Previous() {
        register_kb_function(learning_reader.ADD_TEXT_LEARNER_EBMT_TRAINING_EXAMPLE);
        register_macro_helper(learning_reader.L2R_IMAGE_ELAPSED_CPU_TIME, learning_reader.L2R_COMPUTING_CPU_TIME);
        register_method($print_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_paragraph_reader$.getGlobalValue(), symbol_function(learning_reader.L2R_PARAGRAPH_READER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(learning_reader.$list40);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_PARAGRAPH, learning_reader._CSETF_L2R_PARAGRAPH_READER_PARAGRAPH);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_DOCUMENT, learning_reader._CSETF_L2R_PARAGRAPH_READER_DOCUMENT);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML, learning_reader._CSETF_L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_VECTOR, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_VECTOR);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_PEGS, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_PEGS);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_NUMBER, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_NUMBER);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_LINKAGE, learning_reader._CSETF_L2R_PARAGRAPH_READER_LINKAGE);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_LINKAGE_FORT, learning_reader._CSETF_L2R_PARAGRAPH_READER_LINKAGE_FORT);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT, learning_reader._CSETF_L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_TOTAL_TIME, learning_reader._CSETF_L2R_PARAGRAPH_READER_TOTAL_TIME);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, learning_reader._CSETF_L2R_PARAGRAPH_READER_TOTAL_CPU_TIME);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_TIME, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_TIME);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, learning_reader._CSETF_L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME);
        def_csetf(learning_reader.L2R_PARAGRAPH_READER_STATE, learning_reader._CSETF_L2R_PARAGRAPH_READER_STATE);
        identity(learning_reader.L2R_PARAGRAPH_READER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_paragraph_reader$.getGlobalValue(), symbol_function(learning_reader.VISIT_DEFSTRUCT_OBJECT_L2R_PARAGRAPH_READER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_document_reader$.getGlobalValue(), symbol_function(learning_reader.L2R_DOCUMENT_READER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(learning_reader.$list224);
        def_csetf(learning_reader.L2R_DOCUMENT_READER_DOCUMENT, learning_reader._CSETF_L2R_DOCUMENT_READER_DOCUMENT);
        def_csetf(learning_reader.L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS, learning_reader._CSETF_L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS);
        def_csetf(learning_reader.L2R_DOCUMENT_READER_READ_PARAGRAPHS, learning_reader._CSETF_L2R_DOCUMENT_READER_READ_PARAGRAPHS);
        def_csetf(learning_reader.L2R_DOCUMENT_READER_PARAGRAPH_READER, learning_reader._CSETF_L2R_DOCUMENT_READER_PARAGRAPH_READER);
        def_csetf(learning_reader.L2R_DOCUMENT_READER_READING_EVENT, learning_reader._CSETF_L2R_DOCUMENT_READER_READING_EVENT);
        identity(learning_reader.L2R_DOCUMENT_READER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_document_reader$.getGlobalValue(), symbol_function(learning_reader.VISIT_DEFSTRUCT_OBJECT_L2R_DOCUMENT_READER_METHOD));
        declare_defglobal(learning_reader.$sym242$_L2R_READER_IMAGE_DOCUMENT_READER_);
        memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE);
        memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_LEVEL_PEG_EXEMPLAR);
        memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES);
        memoization_state.note_globally_cached_function(learning_reader.L2R_DOCUMENT_INDEXICAL);
        memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_INDEXICAL);
        memoization_state.note_globally_cached_function(learning_reader.L2R_SUPERTEXT_INDEXICAL);
        memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_STRING_INDEXICAL);
        memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_NUMBER_INDEXICAL);
        memoization_state.note_globally_cached_function(learning_reader.L2R_SENTENCE_STRING_NUMBER_INDEXICAL);
        memoization_state.note_globally_cached_function(learning_reader.L2R_DOCUMENT_SENTENCE_FINDER_KBQ);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        learning_reader.declare_learning_reader_file();
    }

    @Override
    public void initializeVariables() {
        learning_reader.init_learning_reader_file();
    }

    @Override
    public void runTopLevelForms() {
        learning_reader.setup_learning_reader_file();
    }

    static {
    }

    static private final SubLString $str_alt84$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt85$_L2R_PARAGRAPH_READER__S__S_ = makeString("<L2R-PARAGRAPH-READER ~S ~S>");

    static private final SubLString $str_alt86$Couldn_t_find_source_HTML_for__S = makeString("Couldn't find source HTML for ~S");

    static private final SubLSymbol $sym89$_SOURCE = makeSymbol("?SOURCE");

    static private final SubLList $list_alt91 = list(makeSymbol("?SOURCE"));

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
            learning_reader.$l2r_paragraph_reader_native.this.$paragraph = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$document = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$paragraph_source_html = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$sentence_vector = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$sentence_pegs = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$sentence_non_html_texts = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$sentence_number = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$linkage = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$linkage_fort = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$initial_assertion_count = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$total_time = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$total_cpu_time = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$sentence_time = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$sentence_cpu_time = Lisp.NIL;
            learning_reader.$l2r_paragraph_reader_native.this.$state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return learning_reader.$l2r_paragraph_reader_native.this.$paragraph;
        }

        @Override
        public SubLObject getField3() {
            return learning_reader.$l2r_paragraph_reader_native.this.$document;
        }

        @Override
        public SubLObject getField4() {
            return learning_reader.$l2r_paragraph_reader_native.this.$paragraph_source_html;
        }

        @Override
        public SubLObject getField5() {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_vector;
        }

        @Override
        public SubLObject getField6() {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_pegs;
        }

        @Override
        public SubLObject getField7() {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_non_html_texts;
        }

        @Override
        public SubLObject getField8() {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_number;
        }

        @Override
        public SubLObject getField9() {
            return learning_reader.$l2r_paragraph_reader_native.this.$linkage;
        }

        @Override
        public SubLObject getField10() {
            return learning_reader.$l2r_paragraph_reader_native.this.$linkage_fort;
        }

        @Override
        public SubLObject getField11() {
            return learning_reader.$l2r_paragraph_reader_native.this.$initial_assertion_count;
        }

        @Override
        public SubLObject getField12() {
            return learning_reader.$l2r_paragraph_reader_native.this.$total_time;
        }

        @Override
        public SubLObject getField13() {
            return learning_reader.$l2r_paragraph_reader_native.this.$total_cpu_time;
        }

        @Override
        public SubLObject getField14() {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_time;
        }

        @Override
        public SubLObject getField15() {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_cpu_time;
        }

        @Override
        public SubLObject getField16() {
            return learning_reader.$l2r_paragraph_reader_native.this.$state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$paragraph = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$document = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$paragraph_source_html = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_vector = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_pegs = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_non_html_texts = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_number = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$linkage = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$linkage_fort = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$initial_assertion_count = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$total_time = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$total_cpu_time = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_time = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$sentence_cpu_time = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return learning_reader.$l2r_paragraph_reader_native.this.$state = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.learning_reader.$l2r_paragraph_reader_native.class, learning_reader.L2R_PARAGRAPH_READER, learning_reader.L2R_PARAGRAPH_READER_P, learning_reader.$list34, learning_reader.$list35, new String[]{ "$paragraph", "$document", "$paragraph_source_html", "$sentence_vector", "$sentence_pegs", "$sentence_non_html_texts", "$sentence_number", "$linkage", "$linkage_fort", "$initial_assertion_count", "$total_time", "$total_cpu_time", "$sentence_time", "$sentence_cpu_time", "$state" }, learning_reader.$list36, learning_reader.$list37, learning_reader.PRINT_L2R_PARAGRAPH_READER);
        }
    }

    static private final SubLString $str_alt93$asHtmlSourceString_ProprietaryVer = makeString("asHtmlSourceString-ProprietaryVersion");

    static private final SubLString $str_alt96$___A__A_Performing_L2R_reader_act = makeString("~&~A ~A Performing L2R reader action: ~S~%");

    static private final SubLString $str_alt104$L2R_reader_was_unable_to_complete = makeString("L2R reader was unable to complete its previous step. Unable to continue.");

    static private final SubLString $str_alt106$__Next_L2R_reader_action___S__ = makeString("~&Next L2R reader action: ~S~%");

    static private final SubLList $list_alt113 = list(list(makeSymbol("READER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym114$THIS_TIME = makeUninternedSymbol("THIS-TIME");

    static private final SubLSymbol $sym115$THIS_CPU_TIME = makeUninternedSymbol("THIS-CPU-TIME");

    static private final SubLString $str_alt118$__This_step_took__A___A_of_CPU_ti = makeString("~&This step took ~A (~A of CPU time)~%");

    static private final SubLList $list_alt120 = list(TWO_INTEGER);

    static private final SubLList $list_alt123 = list(ZERO_INTEGER);

    static private final SubLList $list_alt124 = list(makeString("unknown amount"));

    static private final SubLString $str_alt127$__Total_time_for_this_sentence___ = makeString("~&Total time for this sentence: ~A (~A of CPU time)~%");

    static private final SubLString $str_alt128$__Total_time_for_this_reader___A_ = makeString("~&Total time for this reader: ~A (~A of CPU time)~%");

    static private final SubLList $list_alt129 = list(list(makeSymbol("STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym130$OLD_TRANSMIT_STATE = makeUninternedSymbol("OLD-TRANSMIT-STATE");

    static private final SubLList $list_alt131 = list(list(makeSymbol("GET-TRANSMIT-STATE")));

    static private final SubLSymbol $sym135$OLD_RECEIVE_STATE = makeUninternedSymbol("OLD-RECEIVE-STATE");

    static private final SubLList $list_alt136 = list(list(makeSymbol("GET-RECEIVE-STATE")));

    static private final SubLList $list_alt142 = list(reader_make_constant_shell("Reading"));

    static private final SubLList $list_alt148 = list(reader_make_constant_shell("Cyc"));

    static private final SubLSymbol $sym149$_READING = makeSymbol("?READING");

    static private final SubLList $list_alt151 = list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("thereExists"), makeSymbol("?END"), list(reader_make_constant_shell("endingDate"), makeSymbol("?READING"), makeSymbol("?END"))));

    static private final SubLList $list_alt152 = list(list(reader_make_constant_shell("performedBy"), makeSymbol("?READING"), reader_make_constant_shell("Cyc")));

    public static final class $l2r_paragraph_reader_p$UnaryFunction extends UnaryFunction {
        public $l2r_paragraph_reader_p$UnaryFunction() {
            super(extractFunctionNamed("L2R-PARAGRAPH-READER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return learning_reader.l2r_paragraph_reader_p(arg1);
        }
    }

    static private final SubLString $str_alt163$Couldn_t_find_linkage_for__S = makeString("Couldn't find linkage for ~S");

    public static final class $l2r_document_reader_native extends SubLStructNative {
        public SubLObject $document;

        public SubLObject $remaining_paragraphs;

        public SubLObject $read_paragraphs;

        public SubLObject $paragraph_reader;

        public SubLObject $reading_event;

        private static final SubLStructDeclNative structDecl;

        public $l2r_document_reader_native() {
            learning_reader.$l2r_document_reader_native.this.$document = Lisp.NIL;
            learning_reader.$l2r_document_reader_native.this.$remaining_paragraphs = Lisp.NIL;
            learning_reader.$l2r_document_reader_native.this.$read_paragraphs = Lisp.NIL;
            learning_reader.$l2r_document_reader_native.this.$paragraph_reader = Lisp.NIL;
            learning_reader.$l2r_document_reader_native.this.$reading_event = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return learning_reader.$l2r_document_reader_native.this.$document;
        }

        @Override
        public SubLObject getField3() {
            return learning_reader.$l2r_document_reader_native.this.$remaining_paragraphs;
        }

        @Override
        public SubLObject getField4() {
            return learning_reader.$l2r_document_reader_native.this.$read_paragraphs;
        }

        @Override
        public SubLObject getField5() {
            return learning_reader.$l2r_document_reader_native.this.$paragraph_reader;
        }

        @Override
        public SubLObject getField6() {
            return learning_reader.$l2r_document_reader_native.this.$reading_event;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return learning_reader.$l2r_document_reader_native.this.$document = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return learning_reader.$l2r_document_reader_native.this.$remaining_paragraphs = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return learning_reader.$l2r_document_reader_native.this.$read_paragraphs = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return learning_reader.$l2r_document_reader_native.this.$paragraph_reader = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return learning_reader.$l2r_document_reader_native.this.$reading_event = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.learning_reader.$l2r_document_reader_native.class, learning_reader.L2R_DOCUMENT_READER, learning_reader.L2R_DOCUMENT_READER_P, learning_reader.$list218, learning_reader.$list219, new String[]{ "$document", "$remaining_paragraphs", "$read_paragraphs", "$paragraph_reader", "$reading_event" }, learning_reader.$list220, learning_reader.$list221, learning_reader.PRINT_L2R_DOCUMENT_READER);
        }
    }

    static private final SubLString $str_alt164$Couldn_t_find_linkage_FORT_for__S = makeString("Couldn't find linkage FORT for ~S");

    static private final SubLString $str_alt165$Couldn_t_find_content_mt_for__S = makeString("Couldn't find content-mt for ~S");

    static private final SubLString $str_alt166$Couldn_t_find_tokenization_for__S = makeString("Couldn't find tokenization for ~S");

    static private final SubLSymbol $sym169$_PARSE_TREE = makeSymbol("?PARSE-TREE");

    static private final SubLList $list_alt170 = list(list(reader_make_constant_shell("syntacticRootOfParseTree"), makeSymbol("?PARSE-TREE"), makeSymbol("?ROOT-NODE")));

    static private final SubLString $str_alt173$__Asserting_Cyclifier_results_for = makeString("~&Asserting Cyclifier results for ~S...~%");

    static private final SubLString $str_alt174$__Read_sentence___S_in__A___A_of_ = makeString("~&Read sentence #~S in ~A (~A of CPU time)~%");

    static private final SubLString $str_alt175$__After__S_sentences__assertion_c = makeString("~&After ~S sentences, assertion count increased ~S from ~S to ~S~%");

    static private final SubLString $str_alt178$Don_t_know_what_to_do_with_finali = makeString("Don't know what to do with finalization term~% ~S");

    static private final SubLString $str_alt179$__Asserting_distillation_sentence = makeString("~%Asserting distillation sentence:~% ~S~%");

    public static final SubLObject $const180$TextLearnerQuery_WhatAreTheRequir = reader_make_constant_shell("TextLearnerQuery-WhatAreTheRequiredScenesOfFinalization");

    public static final class $l2r_document_reader_p$UnaryFunction extends UnaryFunction {
        public $l2r_document_reader_p$UnaryFunction() {
            super(extractFunctionNamed("L2R-DOCUMENT-READER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return learning_reader.l2r_document_reader_p(arg1);
        }
    }

    public static final SubLObject $const182$TextLearnerGarbageCollectionQuery = reader_make_constant_shell("TextLearnerGarbageCollectionQuerySpecification");

    public static final SubLObject $const183$TextLearnerDisambiguationResultsD = reader_make_constant_shell("TextLearnerDisambiguationResultsDistillationQuerySpecification");

    static private final SubLList $list_alt185 = list(reader_make_constant_shell("TheFn"), reader_make_constant_shell("LinguisticExpressionPeg"));

    static private final SubLString $str_alt187$__Read__S_sentences_in__A___ = makeString("~&Read ~S sentences in ~A.~%");

    static private final SubLString $str_alt193$_S_finished_after__A_with__S_answ = makeString("~S finished after ~A with ~S answers.");

    static private final SubLString $str_alt194$_S_has_taken__A_so_far____HL_quer = makeString("~S has taken ~A so far.~% HL query: ~S. Answer count: ~S");

    static private final SubLString $str_alt198$__Asserting_linkage_for__S___S___ = makeString("~&Asserting linkage for ~S (~S)...~%");

    static private final SubLList $list_alt201 = list(reader_make_constant_shell("CycTokenization"));

    static private final SubLSymbol $sym205$_TOKENIZATION = makeSymbol("?TOKENIZATION");

    static private final SubLList $list_alt206 = list(makeSymbol("?TOKENIZATION"));

    static private final SubLString $str_alt207$Couldn_t_find_string_for__S = makeString("Couldn't find string for ~S");

    static private final SubLString $str_alt208$Couldn_t_find_L2R_document_to_rea = makeString("Couldn't find L2R document to read.");

    static private final SubLList $list_alt211 = list(makeSymbol("DOCUMENT"), makeSymbol("REMAINING-PARAGRAPHS"), makeSymbol("READ-PARAGRAPHS"), makeSymbol("PARAGRAPH-READER"), makeSymbol("READING-EVENT"));

    static private final SubLList $list_alt212 = list(makeKeyword("DOCUMENT"), makeKeyword("REMAINING-PARAGRAPHS"), makeKeyword("READ-PARAGRAPHS"), makeKeyword("PARAGRAPH-READER"), makeKeyword("READING-EVENT"));

    static private final SubLList $list_alt213 = list(makeSymbol("L2R-DOCUMENT-READER-DOCUMENT"), makeSymbol("L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS"), makeSymbol("L2R-DOCUMENT-READER-READ-PARAGRAPHS"), makeSymbol("L2R-DOCUMENT-READER-PARAGRAPH-READER"), makeSymbol("L2R-DOCUMENT-READER-READING-EVENT"));

    static private final SubLList $list_alt214 = list(makeSymbol("_CSETF-L2R-DOCUMENT-READER-DOCUMENT"), makeSymbol("_CSETF-L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS"), makeSymbol("_CSETF-L2R-DOCUMENT-READER-READ-PARAGRAPHS"), makeSymbol("_CSETF-L2R-DOCUMENT-READER-PARAGRAPH-READER"), makeSymbol("_CSETF-L2R-DOCUMENT-READER-READING-EVENT"));

    static private final SubLString $str_alt231$_L2R_DOCUMENT_READER__S_ = makeString("<L2R-DOCUMENT-READER ~S>");

    static private final SubLSymbol $sym232$_L2R_READER_IMAGE_DOCUMENT_READER_ = makeSymbol("*L2R-READER-IMAGE-DOCUMENT-READER*");

    public static final SubLObject $const233$TextLearnerQuery_FindWikipediaArt = reader_make_constant_shell("TextLearnerQuery-FindWikipediaArticleToRead");

    static private final SubLSymbol $sym235$STARTS_BEFORE_STARTING_OF_ = makeSymbol("STARTS-BEFORE-STARTING-OF?");

    static private final SubLString $str_alt236$_host_ = makeString("/host/");

    static private final SubLString $str_alt237$_scratch_ = makeString("/scratch/");

    static private final SubLString $str_alt239$l2r_images_ = makeString("l2r-images/");

    static private final SubLString $str_alt240$done_ = makeString("done/");

    static private final SubLString $str_alt241$ongoing_ = makeString("ongoing/");

    static private final SubLString $str_alt245$Saved_image_file_to__S = makeString("Saved image file to ~S");

    static private final SubLSymbol $sym246$_AIS = makeSymbol("?AIS");

    static private final SubLList $list_alt248 = list(makeSymbol("?AIS"));

    static private final SubLList $list_alt249 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLString $str_alt253$Don_t_know_how_to_read__S_ = makeString("Don't know how to read ~S.");

    static private final SubLString $str_alt256$_S___has_already_been_downloaded_ = makeString("~S~% has already been downloaded: ~S");

    static private final SubLString $str_alt259$_S_doesn_t_have_a___webPageURL_as = makeString("~S doesn't have a #$webPageURL assertion.");



    static private final SubLList $list_alt262 = list(reader_make_constant_shell("ProprietaryConstant"));

    static private final SubLList $list_alt267 = cons(makeSymbol("?PARAGRAPH"), makeSymbol("?N"));

    public static final SubLObject $const268$nthOccurrenceOfStructureTypeInStr = reader_make_constant_shell("nthOccurrenceOfStructureTypeInStructure");

    static private final SubLSymbol $sym269$_PARAGRAPH = makeSymbol("?PARAGRAPH");

    static private final SubLSymbol $sym270$_N = makeSymbol("?N");

    static private final SubLList $list_alt272 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    static private final SubLSymbol $sym274$_ = makeSymbol("<");

    static private final SubLString $str_alt275$Reifying_paragraphs_in_ = makeString("Reifying paragraphs in ");

    static private final SubLString $str_alt276$___ = makeString("...");

    static private final SubLString $str_alt277$_p_ = makeString("<p>");

    static private final SubLString $str_alt278$_S_doesn_t_have_any_recognizable_ = makeString("~S doesn't have any recognizable paragraphs.");

    static private final SubLString $str_alt279$Identifying_paragraphs_in_ = makeString("Identifying paragraphs in ");

    static private final SubLString $str_alt280$__p_ = makeString("</p>");

    static private final SubLString $str_alt282$No_non_tagged_text_in__S = makeString("No non-tagged text in ~S");

    static private final SubLString $str_alt283$No_closed_class_words_in__S = makeString("No closed-class words in ~S");

    public static final SubLObject $const284$NthOccurrenceOfStructureTypeInStr = reader_make_constant_shell("NthOccurrenceOfStructureTypeInStructureFn");

    static private final SubLString $str_alt285$___S___S__ = makeString("~&~S: ~S~%");

    static private final SubLSymbol $sym289$_PEG = makeSymbol("?PEG");

    static private final SubLList $list_alt290 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    public static final SubLObject $const292$SentenceLevelPegCreationTemplateF = reader_make_constant_shell("SentenceLevelPegCreationTemplateForDocumentSlurper");

    static private final SubLString $str_alt293$Failed_to_validate___SentenceLeve = makeString("Failed to validate #$SentenceLevelPegCreationTemplateForDocumentSlurper");

    static private final SubLSymbol $sym294$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-CACHING-STATE*");

    public static final SubLSymbol $kw295$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt298$Failed_to_validate___TheExemplarS = makeString("Failed to validate #$TheExemplarSentenceLevelPeg");

    static private final SubLSymbol $sym299$_L2R_SENTENCE_LEVEL_PEG_EXEMPLAR_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-EXEMPLAR-CACHING-STATE*");

    static private final SubLSymbol $sym300$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    static private final SubLString $str_alt301$Failed_to_find_good_L2R_SENTENCE_ = makeString("Failed to find good L2R-SENTENCE-LEVEL-PEG-CREATION-RULES:~% ~S~% Must be a non-empty list of forward rules.");

    static private final SubLString $str_alt304$Failed_to_initialize_L2R_SENTENCE = makeString("Failed to initialize L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES:~% ~S~% Must be a non-empty list of #$ist sentences.");

    static private final SubLSymbol $sym305$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES_CACHING_STATE = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES-CACHING-STATE*");

    static private final SubLList $list_alt306 = list(makeSymbol("IN"), makeSymbol("OUT"));

    static private final SubLList $list_alt308 = list(reader_make_constant_shell("TheFn"), reader_make_constant_shell("LearnByReadingDocument"));

    static private final SubLString $str_alt309$Failed_to_validate_L2R_DOCUMENT_I = makeString("Failed to validate L2R-DOCUMENT-INDEXICAL: ~S");

    static private final SubLSymbol $sym310$_L2R_DOCUMENT_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-DOCUMENT-INDEXICAL-CACHING-STATE*");

    static private final SubLList $list_alt312 = list(reader_make_constant_shell("TheFn"), list(reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), reader_make_constant_shell("TextualPCW"), reader_make_constant_shell("infoStructureOfCW"), reader_make_constant_shell("NLSentence")));

    static private final SubLString $str_alt313$Failed_to_validate_L2R_SENTENCE_I = makeString("Failed to validate L2R-SENTENCE-INDEXICAL: ~S");

    static private final SubLSymbol $sym314$_L2R_SENTENCE_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-INDEXICAL-CACHING-STATE*");

    static private final SubLList $list_alt316 = list(reader_make_constant_shell("TheFn"), reader_make_constant_shell("GraphicalStructure"));

    static private final SubLString $str_alt317$Failed_to_validate_L2R_SUPERTEXT_ = makeString("Failed to validate L2R-SUPERTEXT-INDEXICAL: ~S");

    static private final SubLSymbol $sym318$_L2R_SUPERTEXT_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SUPERTEXT-INDEXICAL-CACHING-STATE*");

    static private final SubLList $list_alt320 = list(reader_make_constant_shell("TheFn"), reader_make_constant_shell("ControlCharacterFreeString"));

    static private final SubLString $str_alt321$Failed_to_validate_L2R_SENTENCE_S = makeString("Failed to validate L2R-SENTENCE-STRING-INDEXICAL: ~S");

    static private final SubLSymbol $sym322$_L2R_SENTENCE_STRING_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-STRING-INDEXICAL-CACHING-STATE*");

    static private final SubLList $list_alt324 = list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("PositiveInteger"), TWO_INTEGER);

    static private final SubLString $str_alt325$Failed_to_validate_L2R_SENTENCE_N = makeString("Failed to validate L2R-SENTENCE-NUMBER-INDEXICAL: ~S");

    static private final SubLSymbol $sym326$_L2R_SENTENCE_NUMBER_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-NUMBER-INDEXICAL-CACHING-STATE*");

    static private final SubLList $list_alt328 = list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("PositiveInteger"), ONE_INTEGER);

    static private final SubLString $str_alt329$Failed_to_validate_L2R_SENTENCE_S = makeString("Failed to validate L2R-SENTENCE-STRING-NUMBER-INDEXICAL: ~S");

    static private final SubLSymbol $sym330$_L2R_SENTENCE_STRING_NUMBER_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-STRING-NUMBER-INDEXICAL-CACHING-STATE*");

    static private final SubLList $list_alt331 = list(makeSymbol("?HIGHER"), makeSymbol("?LOWER"));

    static private final SubLSymbol $sym333$_HIGHER = makeSymbol("?HIGHER");

    static private final SubLSymbol $sym334$_LOWER = makeSymbol("?LOWER");

    static private final SubLList $list_alt335 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    static private final SubLString $str_alt339$Couldn_t_make_UTF8_string_from__S = makeString("Couldn't make UTF8 string from ~S");

    static private final SubLList $list_alt345 = list(makeSymbol("HTML"), makeSymbol("THIS-HTML-OFFSET"), makeSymbol("THIS-NON-HTML-OFFSET"));

    static private final SubLString $str_alt350$_a = makeString("<a");

    static private final SubLString $str_alt352$__a = makeString("</a");

    static private final SubLString $str_alt353$Bad_offset___S_at_offset__S_of__S = makeString("Bad offset: ~S at offset ~S of ~S");

    public static final SubLObject $const356$ReifySentencePegQuery_FindSentenc = reader_make_constant_shell("ReifySentencePegQuery-FindSentences");

    static private final SubLString $str_alt357$Failed_to_validate___ReifySentenc = makeString("Failed to validate #$ReifySentencePegQuery-FindSentences");

    static private final SubLSymbol $sym358$_L2R_DOCUMENT_SENTENCE_FINDER_KBQ_CACHING_STATE_ = makeSymbol("*L2R-DOCUMENT-SENTENCE-FINDER-KBQ-CACHING-STATE*");

    static private final SubLSymbol $sym359$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    static private final SubLString $str_alt361$Asserting_linkages_for____ = makeString("Asserting linkages for: ~%");

    static private final SubLString $str_alt362$_____A__ = makeString("... ~A~%");

    static private final SubLString $str_alt363$Using_L2R_Webpage_Cyclifier_with_ = makeString("Using L2R Webpage Cyclifier with timestamp ~S.");

    static private final SubLString $str_alt364$sentences_ = makeString("sentences/");

    static private final SubLString $str_alt367$__Writing__S_links_from__S_to__S_ = makeString("~&Writing ~S links from ~S to ~S~%");

    static private final SubLString $str_alt369$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt370$http___en_wikipedia_org_ = makeString("http://en.wikipedia.org/");

    static private final SubLString $str_alt373$_ = makeString(" ");

    static private final SubLList $list_alt374 = list(makeString("/"));

    static private final SubLString $str_alt375$_ = makeString("/");

    static private final SubLList $list_alt377 = list(makeString("<a href="), makeString(">"), makeString(" "));

    static private final SubLString $str_alt378$_a_href___wiki_ = makeString("<a href=\"/wiki/");

    static private final SubLString $str_alt379$a_href_ = makeString("a href=");

    static private final SubLString $str_alt380$_img_ = makeString("<img ");

    static private final SubLString $str_alt382$Logging_cyclifications_for_ = makeString("Logging cyclifications for ");

    static private final SubLString $str_alt383$__ = makeString(": ");

    static private final SubLString $str_alt384$sentence__3__0D_ = makeString("sentence-~3,'0D/");

    static private final SubLString $str_alt385$Couldn_t_make_directory_____S = makeString("Couldn't make directory:~% ~S");

    static private final SubLString $str_alt386$sentence_text_lisp = makeString("sentence-text.lisp");

    static private final SubLString $str_alt387$__Cyclifying_unparsed_sentences_f = makeString("~&Cyclifying unparsed sentences from ~S~%");

    static private final SubLString $str_alt388$sentence_ = makeString("sentence-");

    static private final SubLString $str_alt389$sentence_parsed_lisp = makeString("sentence-parsed.lisp");

    static private final SubLString $str_alt390$__Skipping_already_parsed__S__ = makeString("~&Skipping already-parsed ~S~%");

    static private final SubLString $str_alt391$__Parsing__S__ = makeString("~&Parsing ~S~%");

    static private final SubLString $str_alt393$___Logged__S_sentence_parses_to__ = makeString("~& Logged ~S sentence parses to ~S.~%");

    static private final SubLString $str_alt394$No_sentence_to_parse_in__S = makeString("No sentence to parse in ~S");

    static private final SubLList $list_alt395 = list(makeString("P"), makeString("H1"), makeString("H2"), makeString("H3"), makeString("H4"), makeString("TABLE"), makeString("DIV"));

    static private final SubLList $list_alt397 = list(makeString("<"));

    static private final SubLList $list_alt398 = list(makeString("</"));

    static private final SubLList $list_alt399 = list(makeString(">"));

    static private final SubLList $list_alt400 = list(new SubLObject[]{ makeString(" | "), makeString("@import"), makeString("Wikipedia"), makeString(" is a stub."), makeString("Edit this page"), makeString("For other uses, see"), makeString("Create account"), makeString("All text is available under the terms of"), makeString("You can help by expanding it."), makeString("This page was last modified"), makeString("fixalpha"), makeString("Wikimedia"), makeString("Wiktionary"), makeString("Main Article:"), makeString("Main Articles:"), makeString("Wikibooks") });

    static private final SubLString $str_alt401$_C = makeString("~C");

    static private final SubLString $str_alt402$_ = makeString("<");

    static private final SubLString $str_alt403$__ = makeString("</");

    static private final SubLString $str_alt404$_ = makeString(">");

    static private final SubLString $str_alt405$_ul_ = makeString("<ul>");

    static private final SubLString $str_alt406$__ul_ = makeString("</ul>");

    static private final SubLString $str_alt407$_____start_content____ = makeString("<!-- start content -->");

    static private final SubLString $str_alt408$_____end_content____ = makeString("<!-- end content -->");

    static private final SubLString $str_alt416$Couldn_t_find_paragraphs_in__S = makeString("Couldn't find paragraphs in ~S");

    static private final SubLString $str_alt417$No_sentence_string_for__S = makeString("No sentence string for ~S");

    static private final SubLString $str_alt418$_A_ = makeString("~A ");

    static private final SubLString $str_alt419$href__ = makeString("href=\"");

    static private final SubLString $str_alt420$_ = makeString("\"");

    static private final SubLString $str_alt421$_ = makeString("&");

    static private final SubLString $str_alt422$_u0a_ = makeString("&u0a;");

    static private final SubLString $str_alt423$Downloading_and_sentencifying_tex = makeString("Downloading and sentencifying text of ~S");

    static private final SubLString $str_alt426$__Cannot_open_input_stream_for__A = makeString("~%Cannot open input stream for ~A");

    static private final SubLString $str_alt428$Non_string_in__S_____S__ = makeString("Non-string in ~S:~% ~S~%");

    static private final SubLString $str_alt430$_S_is_not_empty = makeString("~S is not empty");

    static private final SubLString $str_alt431$results_dictionary_cfasl = makeString("results-dictionary.cfasl");

    static private final SubLString $str_alt432$Parsing_and_partioning_paragraphs = makeString("Parsing and partioning paragraphs...");

    static private final SubLString $str_alt437$Writing_results_to__S = makeString("Writing results to ~S");

    static private final SubLList $list_alt438 = cons(makeSymbol("SENTENCE"), makeSymbol("PARTITIONED-PARSES"));

    static private final SubLList $list_alt439 = list(makeSymbol("GOOD"), makeSymbol("MAYBE"), makeSymbol("BAD"));

    static private final SubLString $str_alt441$_A__3__0D = makeString("~A-~3,'0D");

    static private final SubLString $str_alt442$Known_bindings_ = makeString("Known bindings:");

    static private final SubLString $str_alt443$Consistent_ = makeString("Consistent:");

    static private final SubLString $str_alt444$Known_false_ = makeString("Known false:");

    static private final SubLSymbol $sym446$ALPHANUMERIC_STRING_ = makeSymbol("ALPHANUMERIC-STRING?");

    static private final SubLList $list_alt449 = list(new SubLObject[]{ list(makeKeyword("NN"), makeKeyword("NNS")), list(makeKeyword("VBP"), makeKeyword("NN")), list(makeKeyword("VBG"), makeKeyword("NN")), list(makeKeyword("VBZ"), makeKeyword("NN")), list(makeKeyword("VBD"), makeKeyword("NN")), list(makeKeyword("VB"), makeKeyword("NN")), list(makeKeyword("JJS"), makeKeyword("NNS")), list(makeKeyword("JJR"), makeKeyword("NNS")), list(makeKeyword("JJ"), makeKeyword("NNS")), list(makeKeyword("JJS"), makeKeyword("NN")), list(makeKeyword("JJR"), makeKeyword("NN")), list(makeKeyword("JJ"), makeKeyword("NN")), list(makeKeyword("NNS"), makeKeyword("NNS")), list(makeKeyword("NN"), makeKeyword("NN")), list(makeKeyword("VBN"), makeKeyword("NN")) });
}

/**
 * Total time: 2097 ms
 */
