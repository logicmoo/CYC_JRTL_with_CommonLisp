/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.run_test_case_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.load;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.cyc_testing.inference_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NLP-TESTS
 * source file: /cyc/top/cycl/nlp-tests.lisp
 * created:     2019/07/03 17:39:02
 */
public final class nlp_tests extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new nlp_tests();

 public static final String myName = "com.cyc.cycjava.cycl.nlp_tests";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol RUN_LEX_ACCESS_TESTS = makeSymbol("RUN-LEX-ACCESS-TESTS");

    private static final SubLSymbol DENOTS_OF_STRING = makeSymbol("DENOTS-OF-STRING");

    private static final SubLSymbol DENOTATION_MAPPER = makeSymbol("DENOTATION-MAPPER");

    private static final SubLString $str6$lexical_semantics = makeString("lexical-semantics");

    private static final SubLString $str10$regular_morphological_forms = makeString("regular-morphological-forms");

    private static final SubLSymbol AES_DO_ORTHOGRAPHIC_CHANGES = makeSymbol("AES-DO-ORTHOGRAPHIC-CHANGES");

    private static final SubLString $str12$regular_morphology = makeString("regular-morphology");

    private static final SubLSymbol RUN_LINK_PARSER_TESTS = makeSymbol("RUN-LINK-PARSER-TESTS");

    private static final SubLSymbol LINK_PARSE = makeSymbol("LINK-PARSE");

    private static final SubLSymbol RUN_PSP_TESTS = makeSymbol("RUN-PSP-TESTS");

    private static final SubLSymbol PS_GET_CYCLS_FOR_PHRASE = makeSymbol("PS-GET-CYCLS-FOR-PHRASE");

    private static final SubLSymbol PS_GET_CYCLS_FOR_NP = makeSymbol("PS-GET-CYCLS-FOR-NP");

    private static final SubLSymbol PS_HARVEST_NPS = makeSymbol("PS-HARVEST-NPS");

    private static final SubLSymbol PARSE_A_SENTENCE_COMPLETELY = makeSymbol("PARSE-A-SENTENCE-COMPLETELY");

    private static final SubLSymbol PARSE_A_QUESTION_COMPLETELY = makeSymbol("PARSE-A-QUESTION-COMPLETELY");

    private static final SubLString $str22$pred_strengthener = makeString("pred-strengthener");

    private static final SubLString $str24$rkf_term_reader = makeString("rkf-term-reader");

    private static final SubLSymbol $RKF_TERM_READER = makeKeyword("RKF-TERM-READER");

    private static final SubLSymbol $RKF_SENTENCE_READER = makeKeyword("RKF-SENTENCE-READER");

    private static final SubLString $str28$rtp_test = makeString("rtp-test");

    private static final SubLSymbol RUN_TP_TESTS = makeSymbol("RUN-TP-TESTS");

    private static final SubLSymbol RUN_PPH_TESTS = makeSymbol("RUN-PPH-TESTS");

    private static final SubLSymbol $sym32$GENERATE_TEXT_W_SENTENTIAL_FORCE = makeSymbol("GENERATE-TEXT-W/SENTENTIAL-FORCE");

    // Definitions
    /**
     * This function runs the tests for Lexicon Accessors defined in
     * '~/cvs/head/cycorp/cyc/top/tests/lexicon-access.lisp'.
     */
    @LispMethod(comment = "This function runs the tests for Lexicon Accessors defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/lexicon-access.lisp\'.\nThis function runs the tests for Lexicon Accessors defined in\n\'~/cvs/head/cycorp/cyc/top/tests/lexicon-access.lisp\'.")
    public static final SubLObject run_lex_access_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str_alt1$lexicon_access, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($LEXICAL_ACCESS, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($LEXICAL_ACCESS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        run_test_case_table(DENOTS_OF_STRING, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        run_test_case_table(DENOTATION_MAPPER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    // Definitions
    /**
     * This function runs the tests for Lexicon Accessors defined in
     * '~/cvs/head/cycorp/cyc/top/tests/lexicon-access.lisp'.
     */
    @LispMethod(comment = "This function runs the tests for Lexicon Accessors defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/lexicon-access.lisp\'.\nThis function runs the tests for Lexicon Accessors defined in\n\'~/cvs/head/cycorp/cyc/top/tests/lexicon-access.lisp\'.")
    public static SubLObject run_lex_access_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        run_test_case_table(DENOTS_OF_STRING, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        run_test_case_table(DENOTATION_MAPPER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    /**
     * This function runs the tests for Lexicon Semantics defined in
     * '~/cvs/head/cycorp/cyc/top/tests/lexical-semantics.lisp'.
     *
     * @param VERBOSE
     * 		keywordp; it should be one of the following:
     * 		:none -> individual tests are not displayed,
     * 		:all  -> all individual tests (both successes and failures) are displayed,
     * 		:fail -> only failed tests are displayed.
     */
    @LispMethod(comment = "This function runs the tests for Lexicon Semantics defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/lexical-semantics.lisp\'.\r\n\r\n@param VERBOSE\r\n\t\tkeywordp; it should be one of the following:\r\n\t\t:none -> individual tests are not displayed,\r\n\t\t:all  -> all individual tests (both successes and failures) are displayed,\r\n\t\t:fail -> only failed tests are displayed.\nThis function runs the tests for Lexicon Semantics defined in\n\'~/cvs/head/cycorp/cyc/top/tests/lexical-semantics.lisp\'.")
    public static final SubLObject run_lex_semantics_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = $NONE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(verbose, KEYWORDP);
            inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str_alt8$lexical_semantics, UNPROVIDED));
            {
                SubLObject pcase_var = verbose;
                if (pcase_var.eql($NONE)) {
                    inference_testing.run_test($LEXICAL_SEMANTICS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if (pcase_var.eql($ALL)) {
                        inference_testing.run_test($LEXICAL_SEMANTICS, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        if (pcase_var.eql($FAIL)) {
                            {
                                SubLObject _prev_bind_0 = inference_testing.$debug_continue$.currentBinding(thread);
                                SubLObject _prev_bind_1 = inference_testing.$it_show_all_failures$.currentBinding(thread);
                                try {
                                    inference_testing.$debug_continue$.bind(T, thread);
                                    inference_testing.$it_show_all_failures$.bind(T, thread);
                                    inference_testing.clear_inference_test_results();
                                    inference_testing.run_test($LEXICAL_SEMANTICS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    inference_testing.$it_show_all_failures$.rebind(_prev_bind_1, thread);
                                    inference_testing.$debug_continue$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
            }
            return DONE;
        }
    }

    /**
     * This function runs the tests for Lexicon Semantics defined in
     * '~/cvs/head/cycorp/cyc/top/tests/lexical-semantics.lisp'.
     *
     * @param VERBOSE
     * 		keywordp; it should be one of the following:
     * 		:none -> individual tests are not displayed,
     * 		:all  -> all individual tests (both successes and failures) are displayed,
     * 		:fail -> only failed tests are displayed.
     */
    @LispMethod(comment = "This function runs the tests for Lexicon Semantics defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/lexical-semantics.lisp\'.\r\n\r\n@param VERBOSE\r\n\t\tkeywordp; it should be one of the following:\r\n\t\t:none -> individual tests are not displayed,\r\n\t\t:all  -> all individual tests (both successes and failures) are displayed,\r\n\t\t:fail -> only failed tests are displayed.\nThis function runs the tests for Lexicon Semantics defined in\n\'~/cvs/head/cycorp/cyc/top/tests/lexical-semantics.lisp\'.")
    public static SubLObject run_lex_semantics_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = $NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != keywordp(verbose) : "! keywordp(verbose) " + ("Types.keywordp(verbose) " + "CommonSymbols.NIL != Types.keywordp(verbose) ") + verbose;
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str6$lexical_semantics, UNPROVIDED));
        final SubLObject pcase_var = verbose;
        if (pcase_var.eql($NONE)) {
            inference_testing.run_test($LEXICAL_SEMANTICS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (pcase_var.eql($ALL)) {
                inference_testing.run_test($LEXICAL_SEMANTICS, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($FAIL)) {
                    final SubLObject _prev_bind_0 = inference_testing.$debug_continue$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = inference_testing.$it_show_all_failures$.currentBinding(thread);
                    try {
                        inference_testing.$debug_continue$.bind(T, thread);
                        inference_testing.$it_show_all_failures$.bind(T, thread);
                        inference_testing.clear_inference_test_results();
                        inference_testing.run_test($LEXICAL_SEMANTICS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        inference_testing.$it_show_all_failures$.rebind(_prev_bind_2, thread);
                        inference_testing.$debug_continue$.rebind(_prev_bind_0, thread);
                    }
                }


        return DONE;
    }

    public static final SubLObject test_aes_do_orthographic_changes_alt() {
        load(inference_testing.construct_cyc_test_filename($str_alt12$regular_morphological_forms, UNPROVIDED));
        run_test_case_table(AES_DO_ORTHOGRAPHIC_CHANGES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    public static SubLObject test_aes_do_orthographic_changes() {
        load(inference_testing.construct_cyc_test_filename($str10$regular_morphological_forms, UNPROVIDED));
        run_test_case_table(AES_DO_ORTHOGRAPHIC_CHANGES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    /**
     * This function runs the regular morphology tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/regular-morphological-forms.lisp' and
     * '~/cvs/head/cycorp/cyc/top/tests/regular-morphology.lisp'.
     */
    @LispMethod(comment = "This function runs the regular morphology tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/regular-morphological-forms.lisp\' and\r\n\'~/cvs/head/cycorp/cyc/top/tests/regular-morphology.lisp\'.\nThis function runs the regular morphology tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/regular-morphological-forms.lisp\' and\n\'~/cvs/head/cycorp/cyc/top/tests/regular-morphology.lisp\'.")
    public static final SubLObject run_regular_morph_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        com.cyc.cycjava.cycl.nlp_tests.test_aes_do_orthographic_changes();
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str_alt14$regular_morphology, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($REGULAR_MORPHOLOGY, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($REGULAR_MORPHOLOGY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }

    /**
     * This function runs the regular morphology tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/regular-morphological-forms.lisp' and
     * '~/cvs/head/cycorp/cyc/top/tests/regular-morphology.lisp'.
     */
    @LispMethod(comment = "This function runs the regular morphology tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/regular-morphological-forms.lisp\' and\r\n\'~/cvs/head/cycorp/cyc/top/tests/regular-morphology.lisp\'.\nThis function runs the regular morphology tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/regular-morphological-forms.lisp\' and\n\'~/cvs/head/cycorp/cyc/top/tests/regular-morphology.lisp\'.")
    public static SubLObject run_regular_morph_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        test_aes_do_orthographic_changes();
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str12$regular_morphology, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($REGULAR_MORPHOLOGY, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($REGULAR_MORPHOLOGY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }

    public static final SubLObject run_link_parser_tests_alt() {
        return run_test_case_table(LINK_PARSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject run_link_parser_tests() {
        return run_test_case_table(LINK_PARSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * This function runs the Phrase Structure Parser tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/phrase-structure-parser.lisp'.
     */
    @LispMethod(comment = "This function runs the Phrase Structure Parser tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/phrase-structure-parser.lisp\'.\nThis function runs the Phrase Structure Parser tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/phrase-structure-parser.lisp\'.")
    public static final SubLObject run_psp_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str_alt19$phrase_structure_parser, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($PHRASE_STRUCTURE_PARSER, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($PHRASE_STRUCTURE_PARSER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        run_test_case_table(PS_GET_CYCLS_FOR_PHRASE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        run_test_case_table(PS_GET_CYCLS_FOR_NP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        run_test_case_table(PS_HARVEST_NPS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    /**
     * This function runs the Phrase Structure Parser tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/phrase-structure-parser.lisp'.
     */
    @LispMethod(comment = "This function runs the Phrase Structure Parser tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/phrase-structure-parser.lisp\'.\nThis function runs the Phrase Structure Parser tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/phrase-structure-parser.lisp\'.")
    public static SubLObject run_psp_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        run_test_case_table(PS_GET_CYCLS_FOR_PHRASE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        run_test_case_table(PS_GET_CYCLS_FOR_NP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        run_test_case_table(PS_HARVEST_NPS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    /**
     * Test the function PARSE-A-SENTENCE-COMPLETELY
     */
    @LispMethod(comment = "Test the function PARSE-A-SENTENCE-COMPLETELY")
    public static final SubLObject test_parse_a_sentence_completely_alt() {
        run_test_case_table(PARSE_A_SENTENCE_COMPLETELY, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    /**
     * Test the function PARSE-A-SENTENCE-COMPLETELY
     */
    @LispMethod(comment = "Test the function PARSE-A-SENTENCE-COMPLETELY")
    public static SubLObject test_parse_a_sentence_completely() {
        run_test_case_table(PARSE_A_SENTENCE_COMPLETELY, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    /**
     * Test the function PARSE-A-QUESTION-COMPLETELY
     */
    @LispMethod(comment = "Test the function PARSE-A-QUESTION-COMPLETELY")
    public static final SubLObject test_parse_a_question_completely_alt() {
        run_test_case_table(PARSE_A_QUESTION_COMPLETELY, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    /**
     * Test the function PARSE-A-QUESTION-COMPLETELY
     */
    @LispMethod(comment = "Test the function PARSE-A-QUESTION-COMPLETELY")
    public static SubLObject test_parse_a_question_completely() {
        run_test_case_table(PARSE_A_QUESTION_COMPLETELY, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }/**
     * Test the function PARSE-A-QUESTION-COMPLETELY
     */


    /**
     * This function runs the predicate-strengthener tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/pred-strengthener.lisp'.
     */
    @LispMethod(comment = "This function runs the predicate-strengthener tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/pred-strengthener.lisp\'.\nThis function runs the predicate-strengthener tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/pred-strengthener.lisp\'.")
    public static final SubLObject run_pred_strengthener_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str_alt26$pred_strengthener, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($PRED_STRENGTHENER, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($PRED_STRENGTHENER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }

    /**
     * This function runs the predicate-strengthener tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/pred-strengthener.lisp'.
     */
    @LispMethod(comment = "This function runs the predicate-strengthener tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/pred-strengthener.lisp\'.\nThis function runs the predicate-strengthener tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/pred-strengthener.lisp\'.")
    public static SubLObject run_pred_strengthener_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str22$pred_strengthener, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($PRED_STRENGTHENER, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($PRED_STRENGTHENER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }

    /**
     * This function runs the tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp'.
     */
    @LispMethod(comment = "This function runs the tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.\nThis function runs the tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.")
    public static final SubLObject run_rkf_term_reader_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str_alt28$rkf_term_reader, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($RKF_TERM_READER, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($RKF_TERM_READER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }

    /**
     * This function runs the tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp'.
     */
    @LispMethod(comment = "This function runs the tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.\nThis function runs the tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.")
    public static SubLObject run_rkf_term_reader_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str24$rkf_term_reader, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($RKF_TERM_READER, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($RKF_TERM_READER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }

    /**
     * This function runs the tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp'.
     */
    @LispMethod(comment = "This function runs the tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.\nThis function runs the tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.")
    public static final SubLObject run_rkf_sentence_reader_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str_alt28$rkf_term_reader, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($RKF_SENTENCE_READER, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($RKF_SENTENCE_READER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }

    /**
     * This function runs the tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp'.
     */
    @LispMethod(comment = "This function runs the tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.\nThis function runs the tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.")
    public static SubLObject run_rkf_sentence_reader_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str24$rkf_term_reader, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($RKF_SENTENCE_READER, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($RKF_SENTENCE_READER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }/**
     * This function runs the tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp'.
     */


    /**
     * This function runs the tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp'.
     */
    @LispMethod(comment = "This function runs the tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.\nThis function runs the tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.")
    public static final SubLObject run_rkf_mts_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str_alt28$rkf_term_reader, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($RKF_MTS, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($RKF_MTS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }

    @LispMethod(comment = "This function runs the tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.\nThis function runs the tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp\'.")
    public static SubLObject run_rkf_mts_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str24$rkf_term_reader, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($RKF_MTS, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($RKF_MTS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }/**
     * This function runs the tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/rkf-term-reader.lisp'.
     */


    /**
     * This function runs the tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/rtp-test.lisp'.
     */
    @LispMethod(comment = "This function runs the tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/rtp-test.lisp\'.\nThis function runs the tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/rtp-test.lisp\'.")
    public static final SubLObject run_rtp_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str_alt32$rtp_test, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($RTP, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($RTP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }

    @LispMethod(comment = "This function runs the tests defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/rtp-test.lisp\'.\nThis function runs the tests defined in\n\'~/cvs/head/cycorp/cyc/top/tests/rtp-test.lisp\'.")
    public static SubLObject run_rtp_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($str28$rtp_test, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($RTP, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($RTP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return DONE;
    }/**
     * This function runs the tests defined in
     * '~/cvs/head/cycorp/cyc/top/tests/rtp-test.lisp'.
     */


    /**
     * This function runs the Template Parser tests.
     */
    @LispMethod(comment = "This function runs the Template Parser tests.")
    public static final SubLObject run_tp_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        com.cyc.cycjava.cycl.nlp_tests.run_pred_strengthener_tests(verbose);
        com.cyc.cycjava.cycl.nlp_tests.run_rkf_term_reader_tests(verbose);
        com.cyc.cycjava.cycl.nlp_tests.run_rkf_sentence_reader_tests(verbose);
        com.cyc.cycjava.cycl.nlp_tests.run_rkf_mts_tests(verbose);
        com.cyc.cycjava.cycl.nlp_tests.run_rtp_tests(verbose);
        com.cyc.cycjava.cycl.nlp_tests.test_parse_a_sentence_completely();
        com.cyc.cycjava.cycl.nlp_tests.test_parse_a_question_completely();
        return DONE;
    }

    @LispMethod(comment = "This function runs the Template Parser tests.")
    public static SubLObject run_tp_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        test_parse_a_sentence_completely();
        test_parse_a_question_completely();
        return DONE;
    }/**
     * This function runs the Template Parser tests.
     */


    /**
     * This function runs the tests for NL generation defined in
     * '~/cvs/head/cycorp/cyc/top/tests/paraphrase.lisp'.
     */
    @LispMethod(comment = "This function runs the tests for NL generation defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/paraphrase.lisp\'.\nThis function runs the tests for NL generation defined in\n\'~/cvs/head/cycorp/cyc/top/tests/paraphrase.lisp\'.")
    public static final SubLObject run_pph_tests_alt(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename($$$paraphrase, UNPROVIDED));
        if (NIL != verbose) {
            inference_testing.run_test($PARAPHRASE, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            inference_testing.run_test($PARAPHRASE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        run_test_case_table($sym38$GENERATE_TEXT_W_SENTENTIAL_FORCE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    @LispMethod(comment = "This function runs the tests for NL generation defined in\r\n\'~/cvs/head/cycorp/cyc/top/tests/paraphrase.lisp\'.\nThis function runs the tests for NL generation defined in\n\'~/cvs/head/cycorp/cyc/top/tests/paraphrase.lisp\'.")
    public static SubLObject run_pph_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        run_test_case_table($sym32$GENERATE_TEXT_W_SENTENTIAL_FORCE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }/**
     * This function runs the tests for NL generation defined in
     * '~/cvs/head/cycorp/cyc/top/tests/paraphrase.lisp'.
     */


    public static SubLObject declare_nlp_tests_file() {
        declareFunction("run_lex_access_tests", "RUN-LEX-ACCESS-TESTS", 0, 1, false);
        declareFunction("run_lex_semantics_tests", "RUN-LEX-SEMANTICS-TESTS", 0, 1, false);
        declareFunction("test_aes_do_orthographic_changes", "TEST-AES-DO-ORTHOGRAPHIC-CHANGES", 0, 0, false);
        declareFunction("run_regular_morph_tests", "RUN-REGULAR-MORPH-TESTS", 0, 1, false);
        declareFunction("run_link_parser_tests", "RUN-LINK-PARSER-TESTS", 0, 0, false);
        declareFunction("run_psp_tests", "RUN-PSP-TESTS", 0, 1, false);
        declareFunction("test_parse_a_sentence_completely", "TEST-PARSE-A-SENTENCE-COMPLETELY", 0, 0, false);
        declareFunction("test_parse_a_question_completely", "TEST-PARSE-A-QUESTION-COMPLETELY", 0, 0, false);
        declareFunction("run_pred_strengthener_tests", "RUN-PRED-STRENGTHENER-TESTS", 0, 1, false);
        declareFunction("run_rkf_term_reader_tests", "RUN-RKF-TERM-READER-TESTS", 0, 1, false);
        declareFunction("run_rkf_sentence_reader_tests", "RUN-RKF-SENTENCE-READER-TESTS", 0, 1, false);
        declareFunction("run_rkf_mts_tests", "RUN-RKF-MTS-TESTS", 0, 1, false);
        declareFunction("run_rtp_tests", "RUN-RTP-TESTS", 0, 1, false);
        declareFunction("run_tp_tests", "RUN-TP-TESTS", 0, 1, false);
        declareFunction("run_pph_tests", "RUN-PPH-TESTS", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_nlp_tests_file() {
        return NIL;
    }

    public static SubLObject setup_nlp_tests_file() {
        register_external_symbol(RUN_LEX_ACCESS_TESTS);
        register_external_symbol(RUN_LINK_PARSER_TESTS);
        register_external_symbol(RUN_PSP_TESTS);
        register_external_symbol(RUN_TP_TESTS);
        register_external_symbol(RUN_PPH_TESTS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nlp_tests_file();
    }

    @Override
    public void initializeVariables() {
        init_nlp_tests_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nlp_tests_file();
    }

    

    static private final SubLString $str_alt1$lexicon_access = makeString("lexicon-access");

    private static final SubLSymbol $LEXICAL_ACCESS = makeKeyword("LEXICAL-ACCESS");

    static private final SubLString $str_alt8$lexical_semantics = makeString("lexical-semantics");

    static private final SubLString $str_alt12$regular_morphological_forms = makeString("regular-morphological-forms");

    static private final SubLString $str_alt14$regular_morphology = makeString("regular-morphology");

    static private final SubLString $str_alt19$phrase_structure_parser = makeString("phrase-structure-parser");

    private static final SubLSymbol $PHRASE_STRUCTURE_PARSER = makeKeyword("PHRASE-STRUCTURE-PARSER");

    static private final SubLString $str_alt26$pred_strengthener = makeString("pred-strengthener");

    static private final SubLString $str_alt28$rkf_term_reader = makeString("rkf-term-reader");

    static private final SubLString $str_alt32$rtp_test = makeString("rtp-test");

    static private final SubLString $$$paraphrase = makeString("paraphrase");

    private static final SubLSymbol $PARAPHRASE = makeKeyword("PARAPHRASE");

    static private final SubLSymbol $sym38$GENERATE_TEXT_W_SENTENTIAL_FORCE = makeSymbol("GENERATE-TEXT-W/SENTENTIAL-FORCE");
}

/**
 * Total time: 110 ms
 */
