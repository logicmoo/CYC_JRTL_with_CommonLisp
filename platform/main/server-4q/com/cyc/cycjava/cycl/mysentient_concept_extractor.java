/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.nl_stats.noun_learner;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      MYSENTIENT-CONCEPT-EXTRACTOR
 *  source file: /cyc/top/cycl/mysentient-concept-extractor.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class mysentient_concept_extractor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private mysentient_concept_extractor() {
    }

    public static final SubLFile me = new mysentient_concept_extractor();


    // // Definitions
    /**
     * Find the terms that occur in the sentencified corpus at CORPUS-PATH and write them, along with the number of occurrences,
     * to a file at OUTPUT-PATH, in order of prevalence.
     * This is the so-called 'A' that writes to a file.
     */
    public static final SubLObject mysentient_ce_find_terms_output_to_file(SubLObject corpus_path, SubLObject output_path) {
        {
            SubLObject learned = noun_learner.learn_unknown_nouns_from_sentencified_corpus(corpus_path, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
            return methods.funcall_instance_method_with_1_args(learned, DUMP_NOUN_STRINGS_ORDERED_BY_PREVALENCE, output_path);
        }
    }

    /**
     * Find the terms known by Cyc that occur in the sentencified corpus at CORPUS-PATH and write them, along with the best Cyc denotation,
     * to a file at OUTPUT-PATH, in order of prevalence.
     * This is the so-called 'B' that writes to a file.
     */
    public static final SubLObject mysentient_ce_map_recognized_terms_output_to_file(SubLObject corpus_path, SubLObject output_path) {
        {
            SubLObject learned = noun_learner.learn_unknown_nouns_from_sentencified_corpus(corpus_path, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
            return methods.funcall_instance_method_with_1_args(learned, DUMP_KNOWN_NOUNS_WITH_MEANINGS, output_path);
        }
    }

    /**
     * This does the work of @xref MYSENTIENT-CE-FIND-TERMS and @xref MYSENTIENT-CE-MAP-RECOGNIZED-TERMS-OUTPUT-TO-FILE, and writes the corresponding
     * output to ALL-TERMS-PATH and RECOGNIZED-TERMS-PATH, respectively, and also writes the unrecognized terms along with suggested definitions
     * to a file at UNRECOGNIZED-TERMS-PATH, in order of prevalence.
     * This is the so-called 'A/B/C' that writes to files.
     */
    public static final SubLObject mysentient_ce_extract_concepts_to_files(SubLObject corpus_path, SubLObject all_terms_path, SubLObject recognized_terms_path, SubLObject unrecognized_terms_path) {
        {
            SubLObject learned = noun_learner.learn_unknown_nouns_from_sentencified_corpus(corpus_path, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
            methods.funcall_instance_method_with_1_args(learned, DUMP_NOUN_STRINGS_ORDERED_BY_PREVALENCE, all_terms_path);
            methods.funcall_instance_method_with_1_args(learned, DUMP_KNOWN_NOUNS_WITH_MEANINGS, recognized_terms_path);
            methods.funcall_instance_method_with_1_args(learned, DUMP_UNKNOWN_NOUNS_WITH_CONJECTURES, unrecognized_terms_path);
        }
        return NIL;
    }

    /**
     * Find the terms that occur in the sentencified corpus at CORPUS-PATH and the number of occurrences of each.
     * Returns an s-expression of the form ((STRING0 COUNT0) (STRING1 COUNT1) ... (STRINGn COUNTn))
     * where each STRINGx is a term that occurs in the corpus (sorted from most to least prevalent)
     * and COUNTx is the number of occurrences of the term STRINGx.
     * This is the so-called 'A' that returns an s-expression.
     */
    public static final SubLObject mysentient_ce_find_terms(SubLObject corpus_path) {
        {
            SubLObject learned = noun_learner.learn_unknown_nouns_from_sentencified_corpus(corpus_path, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
            return methods.funcall_instance_method_with_0_args(learned, LISTIFY_ALL_NOUNS_WITH_COUNTS_FOR_MYSENTIENT);
        }
    }

    /**
     * Find the terms known by Cyc that occur in the sentencified corpus at CORPUS-PATH and find the best Cyc denotation for each of them.
     * Returns an s-expression of the form ((STRING0 TERM0) (STRING1 TERM1) ... (STRINGn TERMn))
     * where each STRINGx is a string that occurs in the corpus (sorted from most to least prevalent)
     * and TERMx is the best Cyc denotation for STRINGx
     * This is the so-called 'B' that returns an s-expression.
     */
    public static final SubLObject mysentient_ce_map_recognized_terms(SubLObject corpus_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject learned = noun_learner.learn_unknown_nouns_from_sentencified_corpus(corpus_path, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject corpus = mysentient_find_or_create_corpus(corpus_path);
                    SubLObject corpus_mt = thread.secondMultipleValue();
                    SubLObject graphing_mt = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    return methods.funcall_instance_method_with_3_args(learned, LISTIFY_KNOWN_NOUNS_WITH_MEANINGS_FOR_MYSENTIENT, corpus, corpus_mt, graphing_mt);
                }
            }
        }
    }

    /**
     * Find the terms unknown to Cyc that occur in the sentencified corpus at CORPUS-PATH and conjecture a meaning for each of them.
     * Returns an s-expression of the form ((STRING0 CONJECTURES0) (STRING1 CONJECTURES1) ... (STRINGn CONJECTURESn))
     * where each STRINGx is a string that occurs in the corpus (sorted from most to least prevalent)
     * and CONJECTURESx is a list of CycL atomic sentences in which the keyword :meaning stands in for the non-existent Cyc term that would represent the meaning of STRINGx.  The sentences collectively amount to a conjecture of the string's meaning.
     * This is the so-called 'C' that returns an s-expression.
     */
    public static final SubLObject mysentient_ce_conjecture_meanings_for_unrecognized_terms(SubLObject corpus_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject learned = noun_learner.learn_unknown_nouns_from_sentencified_corpus(corpus_path, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject corpus = mysentient_find_or_create_corpus(corpus_path);
                    SubLObject corpus_mt = thread.secondMultipleValue();
                    SubLObject graphing_mt = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    return methods.funcall_instance_method_with_3_args(learned, LISTIFY_UNKNOWN_NOUNS_WITH_CONJECTURES_FOR_MYSENTIENT, corpus, corpus_mt, graphing_mt);
                }
            }
        }
    }

    /**
     * This does the same work as @xref MYSENTIENT-CE-EXTRACT-CONCEPTS-TO-FILES but instead of writing the results to files, it returns
     * an s-expression containing the known terms with their best Cyc denotation and the unknown terms with suggested definitions.
     * The form of the s-expression is (KNOWN-TERMS UNKNOWN-TERMS)
     * where KNOWN-TERMS is a list whose elements each have the form (STRING TERM)
     * where STRING is a string
     * and TERM is a Cyc term
     * and UNKNOWN-TERMS is a list whose elements each have the form (STRING CONJECTURES)
     * where STRING is a string
     * and CONJECTURES is a list of CycL atomic sentences in which the keyword :meaning stands in for the non-existent Cyc term that would represent the meaning of the string
     * This is the so-called 'B/C' that returns an s-expression.
     */
    public static final SubLObject mysentient_ce_extract_concepts(SubLObject corpus_path) {
        {
            SubLObject learned = noun_learner.learn_unknown_nouns_from_sentencified_corpus(corpus_path, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
            return methods.funcall_instance_method_with_0_args(learned, LISTIFY_FOR_MYSENTIENT);
        }
    }

    /**
     * Create a text file at OUTPUT-PATH containing the strings in STRING-LIST, each on its own line.
     */
    public static final SubLObject print_strings_to_file_one_per_line(SubLObject string_list, SubLObject output_path) {
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(output_path, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt16$Unable_to_open__S, output_path);
                }
                {
                    SubLObject stream_1 = stream;
                    SubLObject cdolist_list_var = string_list;
                    SubLObject string = NIL;
                    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                        format(stream_1, $str_alt17$___A, string);
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
        return output_path;
    }

    /**
     * Create a text file at OUTPUT-PATH containing all the same sentences as the text file at INPUT-PATH, but with each sentence on its own line.
     */
    public static final SubLObject text_file_to_sentencified_text_file(SubLObject input_path, SubLObject output_path) {
        {
            SubLObject string_list = document.sentencify_file(input_path);
            return print_strings_to_file_one_per_line(string_list, output_path);
        }
    }

    public static final SubLObject mysentient_find_or_create_corpus(SubLObject corpus_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject corpus = mysentient_find_corpus(corpus_path);
                SubLObject corpus_mt = thread.secondMultipleValue();
                SubLObject graphing_mt = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL == corpus) {
                    thread.resetMultipleValues();
                    {
                        SubLObject corpus_2 = mysentient_create_corpus(corpus_path);
                        SubLObject corpus_mt_3 = thread.secondMultipleValue();
                        SubLObject graphing_mt_4 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        corpus = corpus_2;
                        corpus_mt = corpus_mt_3;
                        graphing_mt = graphing_mt_4;
                    }
                }
                return values(corpus, corpus_mt, graphing_mt);
            }
        }
    }

    public static final SubLObject mysentient_find_corpus(SubLObject corpus_path) {
        {
            SubLObject results = mysentient_utilities.myse_query_template($list_alt19, el_utilities.make_conjunction(list(el_utilities.make_binary_formula($$aisFileAbsolutePathname, el_utilities.make_unary_formula($$AISForFn, $sym22$_CORPUS), corpus_path), el_utilities.make_binary_formula($$mtSource, $sym24$_CORPUS_MT, $sym22$_CORPUS), el_utilities.make_binary_formula($$sourceWorkForSOEMt, $sym22$_CORPUS, $sym26$_GRAPHING_MT))), $$EverythingPSC, $list_alt28);
            if (NIL != list_utilities.empty_list_p(results)) {
                return values(NIL, NIL, NIL);
            } else {
                return apply(symbol_function(VALUES), results.first());
            }
        }
    }

    public static final SubLObject mysentient_create_corpus(SubLObject corpus_path) {
        {
            SubLObject corpus = NIL;
            SubLObject corpus_mt = NIL;
            SubLObject graphing_mt = NIL;
            SubLObject old_cyclist = operation_communication.the_cyclist();
            try {
                operation_communication.set_the_cyclist($$TheMySentientSystem);
                corpus = mysentient_utilities.myse_create($$$corpus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                corpus_mt = mysentient_utilities.myse_create(constants_high.constant_name(corpus), NIL, NIL, $$$Mt);
                graphing_mt = mysentient_utilities.myse_create(constants_high.constant_name(corpus), NIL, NIL, $$$SOEMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$isa, corpus, $$Individual), $$UniversalVocabularyMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$isa, corpus, $$Corpus), $$InformationGMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$isa, corpus, $$TextualPCW), $$InformationGMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$isa, corpus, $$HighlyRelevantThing), $$MySentientAuthoringMt);
                {
                    SubLObject ais_for_corpus = ais_for(corpus);
                    mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$isa, ais_for_corpus, $$ComputerFile_AIS), $$InformationGMt);
                    mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$aisFileAbsolutePathname, ais_for_corpus, corpus_path), $$PCWDataMt);
                }
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$isa, corpus_mt, $$ApplicationContext), $$UniversalVocabularyMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$genlMt, corpus_mt, $const46$CurrentWorldDataCollectorMt_NonHo), $$UniversalVocabularyMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$genlMt, $$MySentientUserProfileGMt, corpus_mt), $$UniversalVocabularyMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$mtJustificationType, corpus_mt, $$JustifiedByAuthority), $$BaseKB);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$mtSource, corpus_mt, corpus), $$BookkeepingMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$isa, graphing_mt, $$SOEGLFGraphDefiningMicrotheory), $$UniversalVocabularyMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$genlMt, graphing_mt, $$BaseKB), $$UniversalVocabularyMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$genlMt, graphing_mt, $$SOEGlfMt), $$UniversalVocabularyMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$genlMt, graphing_mt, corpus_mt), $$UniversalVocabularyMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$genlMt, $$MySentientAuthoringMt, graphing_mt), $$UniversalVocabularyMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$soeMtFocalGraph, graphing_mt, $$TheCycOntologyGraph), $$SOEGlfMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$soeMtForGraphStructure, graphing_mt, ais_for($$TheCycOntologyGraph)), $$SOEGlfMt);
                mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$sourceWorkForSOEMt, corpus, graphing_mt), $$SOEGlfMt);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        operation_communication.set_the_cyclist(old_cyclist);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return values(corpus, corpus_mt, graphing_mt);
        }
    }

    public static final SubLObject ais_for(SubLObject cw) {
        return czer_main.canonicalize_term(el_utilities.make_unary_formula($$AISForFn, cw), UNPROVIDED);
    }

    public static final SubLObject subloop_reserved_initialize_concept_extractor_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_concept_extractor_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject concept_extractor_test_case_p(SubLObject concept_extractor_test_case) {
        return classes.subloop_instanceof_class(concept_extractor_test_case, CONCEPT_EXTRACTOR_TEST_CASE);
    }

    public static final SubLObject declare_mysentient_concept_extractor_file() {
        declareFunction("mysentient_ce_find_terms_output_to_file", "MYSENTIENT-CE-FIND-TERMS-OUTPUT-TO-FILE", 2, 0, false);
        declareFunction("mysentient_ce_map_recognized_terms_output_to_file", "MYSENTIENT-CE-MAP-RECOGNIZED-TERMS-OUTPUT-TO-FILE", 2, 0, false);
        declareFunction("mysentient_ce_extract_concepts_to_files", "MYSENTIENT-CE-EXTRACT-CONCEPTS-TO-FILES", 4, 0, false);
        declareFunction("mysentient_ce_find_terms", "MYSENTIENT-CE-FIND-TERMS", 1, 0, false);
        declareFunction("mysentient_ce_map_recognized_terms", "MYSENTIENT-CE-MAP-RECOGNIZED-TERMS", 1, 0, false);
        declareFunction("mysentient_ce_conjecture_meanings_for_unrecognized_terms", "MYSENTIENT-CE-CONJECTURE-MEANINGS-FOR-UNRECOGNIZED-TERMS", 1, 0, false);
        declareFunction("mysentient_ce_extract_concepts", "MYSENTIENT-CE-EXTRACT-CONCEPTS", 1, 0, false);
        declareFunction("print_strings_to_file_one_per_line", "PRINT-STRINGS-TO-FILE-ONE-PER-LINE", 2, 0, false);
        declareFunction("text_file_to_sentencified_text_file", "TEXT-FILE-TO-SENTENCIFIED-TEXT-FILE", 2, 0, false);
        declareFunction("mysentient_find_or_create_corpus", "MYSENTIENT-FIND-OR-CREATE-CORPUS", 1, 0, false);
        declareFunction("mysentient_find_corpus", "MYSENTIENT-FIND-CORPUS", 1, 0, false);
        declareFunction("mysentient_create_corpus", "MYSENTIENT-CREATE-CORPUS", 1, 0, false);
        declareFunction("ais_for", "AIS-FOR", 1, 0, false);
        declareFunction("subloop_reserved_initialize_concept_extractor_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-CONCEPT-EXTRACTOR-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_concept_extractor_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-CONCEPT-EXTRACTOR-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("concept_extractor_test_case_p", "CONCEPT-EXTRACTOR-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_mysentient_concept_extractor_file() {
        return NIL;
    }

    public static final SubLObject setup_mysentient_concept_extractor_file() {
                access_macros.register_external_symbol(MYSENTIENT_CE_FIND_TERMS_OUTPUT_TO_FILE);
        access_macros.register_external_symbol(MYSENTIENT_CE_MAP_RECOGNIZED_TERMS_OUTPUT_TO_FILE);
        access_macros.register_external_symbol(MYSENTIENT_CE_EXTRACT_CONCEPTS_TO_FILES);
        access_macros.register_external_symbol(MYSENTIENT_CE_FIND_TERMS);
        access_macros.register_external_symbol(MYSENTIENT_CE_MAP_RECOGNIZED_TERMS);
        access_macros.register_external_symbol(MYSENTIENT_CE_CONJECTURE_MEANINGS_FOR_UNRECOGNIZED_TERMS);
        access_macros.register_external_symbol(MYSENTIENT_CE_EXTRACT_CONCEPTS);
        access_macros.register_external_symbol(PRINT_STRINGS_TO_FILE_ONE_PER_LINE);
        access_macros.register_external_symbol(TEXT_FILE_TO_SENTENCIFIED_TEXT_FILE);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(CONCEPT_EXTRACTOR_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(CONCEPT_EXTRACTOR_TEST_CASE);
        classes.subloop_new_class(CONCEPT_EXTRACTOR_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt59);
        classes.class_set_implements_slot_listeners(CONCEPT_EXTRACTOR_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(CONCEPT_EXTRACTOR_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_CONCEPT_EXTRACTOR_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(CONCEPT_EXTRACTOR_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_CONCEPT_EXTRACTOR_TEST_CASE_INSTANCE);
        subloop_reserved_initialize_concept_extractor_test_case_class(CONCEPT_EXTRACTOR_TEST_CASE);
        sunit_macros.define_test_case_postamble(CONCEPT_EXTRACTOR_TEST_CASE, $str_alt74$mysentient_concept_extractor, $$$cycl, NIL);
        sunit_macros.def_test_method_register(CONCEPT_EXTRACTOR_TEST_CASE, TEST_A);
        sunit_macros.def_test_method_register(CONCEPT_EXTRACTOR_TEST_CASE, TEST_B);
        sunit_macros.def_test_method_register(CONCEPT_EXTRACTOR_TEST_CASE, TEST_C);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol MYSENTIENT_CE_FIND_TERMS_OUTPUT_TO_FILE = makeSymbol("MYSENTIENT-CE-FIND-TERMS-OUTPUT-TO-FILE");

    private static final SubLSymbol DUMP_NOUN_STRINGS_ORDERED_BY_PREVALENCE = makeSymbol("DUMP-NOUN-STRINGS-ORDERED-BY-PREVALENCE");

    private static final SubLSymbol MYSENTIENT_CE_MAP_RECOGNIZED_TERMS_OUTPUT_TO_FILE = makeSymbol("MYSENTIENT-CE-MAP-RECOGNIZED-TERMS-OUTPUT-TO-FILE");

    private static final SubLSymbol DUMP_KNOWN_NOUNS_WITH_MEANINGS = makeSymbol("DUMP-KNOWN-NOUNS-WITH-MEANINGS");

    private static final SubLSymbol MYSENTIENT_CE_EXTRACT_CONCEPTS_TO_FILES = makeSymbol("MYSENTIENT-CE-EXTRACT-CONCEPTS-TO-FILES");

    private static final SubLSymbol DUMP_UNKNOWN_NOUNS_WITH_CONJECTURES = makeSymbol("DUMP-UNKNOWN-NOUNS-WITH-CONJECTURES");

    private static final SubLSymbol MYSENTIENT_CE_FIND_TERMS = makeSymbol("MYSENTIENT-CE-FIND-TERMS");

    private static final SubLSymbol LISTIFY_ALL_NOUNS_WITH_COUNTS_FOR_MYSENTIENT = makeSymbol("LISTIFY-ALL-NOUNS-WITH-COUNTS-FOR-MYSENTIENT");

    private static final SubLSymbol MYSENTIENT_CE_MAP_RECOGNIZED_TERMS = makeSymbol("MYSENTIENT-CE-MAP-RECOGNIZED-TERMS");

    private static final SubLSymbol LISTIFY_KNOWN_NOUNS_WITH_MEANINGS_FOR_MYSENTIENT = makeSymbol("LISTIFY-KNOWN-NOUNS-WITH-MEANINGS-FOR-MYSENTIENT");

    private static final SubLSymbol MYSENTIENT_CE_CONJECTURE_MEANINGS_FOR_UNRECOGNIZED_TERMS = makeSymbol("MYSENTIENT-CE-CONJECTURE-MEANINGS-FOR-UNRECOGNIZED-TERMS");

    private static final SubLSymbol LISTIFY_UNKNOWN_NOUNS_WITH_CONJECTURES_FOR_MYSENTIENT = makeSymbol("LISTIFY-UNKNOWN-NOUNS-WITH-CONJECTURES-FOR-MYSENTIENT");

    private static final SubLSymbol MYSENTIENT_CE_EXTRACT_CONCEPTS = makeSymbol("MYSENTIENT-CE-EXTRACT-CONCEPTS");

    private static final SubLSymbol LISTIFY_FOR_MYSENTIENT = makeSymbol("LISTIFY-FOR-MYSENTIENT");

    private static final SubLSymbol PRINT_STRINGS_TO_FILE_ONE_PER_LINE = makeSymbol("PRINT-STRINGS-TO-FILE-ONE-PER-LINE");



    static private final SubLString $str_alt16$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt17$___A = makeString("~%~A");

    private static final SubLSymbol TEXT_FILE_TO_SENTENCIFIED_TEXT_FILE = makeSymbol("TEXT-FILE-TO-SENTENCIFIED-TEXT-FILE");

    static private final SubLList $list_alt19 = list(makeSymbol("?CORPUS"), makeSymbol("?CORPUS-MT"), makeSymbol("?GRAPHING-MT"));

    public static final SubLObject $$aisFileAbsolutePathname = constant_handles.reader_make_constant_shell(makeString("aisFileAbsolutePathname"));

    public static final SubLObject $$AISForFn = constant_handles.reader_make_constant_shell(makeString("AISForFn"));

    static private final SubLSymbol $sym22$_CORPUS = makeSymbol("?CORPUS");

    public static final SubLObject $$mtSource = constant_handles.reader_make_constant_shell(makeString("mtSource"));

    static private final SubLSymbol $sym24$_CORPUS_MT = makeSymbol("?CORPUS-MT");

    public static final SubLObject $$sourceWorkForSOEMt = constant_handles.reader_make_constant_shell(makeString("sourceWorkForSOEMt"));

    static private final SubLSymbol $sym26$_GRAPHING_MT = makeSymbol("?GRAPHING-MT");

    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLList $list_alt28 = list(makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0));



    public static final SubLObject $$TheMySentientSystem = constant_handles.reader_make_constant_shell(makeString("TheMySentientSystem"));

    static private final SubLString $$$corpus = makeString("corpus");

    static private final SubLString $$$Mt = makeString("Mt");

    static private final SubLString $$$SOEMt = makeString("SOEMt");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    public static final SubLObject $$Individual = constant_handles.reader_make_constant_shell(makeString("Individual"));

    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    public static final SubLObject $$Corpus = constant_handles.reader_make_constant_shell(makeString("Corpus"));

    public static final SubLObject $$InformationGMt = constant_handles.reader_make_constant_shell(makeString("InformationGMt"));

    public static final SubLObject $$TextualPCW = constant_handles.reader_make_constant_shell(makeString("TextualPCW"));

    public static final SubLObject $$HighlyRelevantThing = constant_handles.reader_make_constant_shell(makeString("HighlyRelevantThing"));

    public static final SubLObject $$MySentientAuthoringMt = constant_handles.reader_make_constant_shell(makeString("MySentientAuthoringMt"));

    public static final SubLObject $$ComputerFile_AIS = constant_handles.reader_make_constant_shell(makeString("ComputerFile-AIS"));

    public static final SubLObject $$PCWDataMt = constant_handles.reader_make_constant_shell(makeString("PCWDataMt"));

    public static final SubLObject $$ApplicationContext = constant_handles.reader_make_constant_shell(makeString("ApplicationContext"));

    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    public static final SubLObject $const46$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric"));

    public static final SubLObject $$MySentientUserProfileGMt = constant_handles.reader_make_constant_shell(makeString("MySentientUserProfileGMt"));

    public static final SubLObject $$mtJustificationType = constant_handles.reader_make_constant_shell(makeString("mtJustificationType"));

    public static final SubLObject $$JustifiedByAuthority = constant_handles.reader_make_constant_shell(makeString("JustifiedByAuthority"));

    public static final SubLObject $$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));

    public static final SubLObject $$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));

    public static final SubLObject $$SOEGLFGraphDefiningMicrotheory = constant_handles.reader_make_constant_shell(makeString("SOEGLFGraphDefiningMicrotheory"));

    public static final SubLObject $$SOEGlfMt = constant_handles.reader_make_constant_shell(makeString("SOEGlfMt"));

    public static final SubLObject $$soeMtFocalGraph = constant_handles.reader_make_constant_shell(makeString("soeMtFocalGraph"));

    public static final SubLObject $$TheCycOntologyGraph = constant_handles.reader_make_constant_shell(makeString("TheCycOntologyGraph"));

    public static final SubLObject $$soeMtForGraphStructure = constant_handles.reader_make_constant_shell(makeString("soeMtForGraphStructure"));

    private static final SubLSymbol CONCEPT_EXTRACTOR_TEST_CASE = makeSymbol("CONCEPT-EXTRACTOR-TEST-CASE");



    static private final SubLList $list_alt59 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-A"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-B"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-C"), NIL, makeKeyword("PROTECTED")));

















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CONCEPT_EXTRACTOR_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONCEPT-EXTRACTOR-TEST-CASE-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CONCEPT_EXTRACTOR_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONCEPT-EXTRACTOR-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt74$mysentient_concept_extractor = makeString("mysentient-concept-extractor");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol TEST_A = makeSymbol("TEST-A");

    private static final SubLSymbol TEST_B = makeSymbol("TEST-B");

    private static final SubLSymbol TEST_C = makeSymbol("TEST-C");

    // // Initializers
    public void declareFunctions() {
        declare_mysentient_concept_extractor_file();
    }

    public void initializeVariables() {
        init_mysentient_concept_extractor_file();
    }

    public void runTopLevelForms() {
        setup_mysentient_concept_extractor_file();
    }
}

