package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cyc_testing.inference_testing;
import com.cyc.cycjava.cycl.nlp_tests;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.nlp_tests.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class nlp_tests extends SubLTranslatedFile {
    public static final SubLFile me = new nlp_tests();

    public static final String myName = "com.cyc.cycjava.cycl.nlp_tests";

    public static final String myFingerPrint = "512718550c84fdb9043fa6cdac72b0855b38de788c65c626ade68454bfd1f5e3";

    // Internal Constants
    public static final SubLSymbol RUN_LEX_ACCESS_TESTS = makeSymbol("RUN-LEX-ACCESS-TESTS");

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

    public static SubLObject run_lex_access_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        run_test_case_table(DENOTS_OF_STRING, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        run_test_case_table(DENOTATION_MAPPER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    public static SubLObject run_lex_semantics_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = $NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != keywordp(verbose) : "Types.keywordp(verbose) " + "CommonSymbols.NIL != Types.keywordp(verbose) " + verbose;
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

    public static SubLObject test_aes_do_orthographic_changes() {
        load(inference_testing.construct_cyc_test_filename($str10$regular_morphological_forms, UNPROVIDED));
        run_test_case_table(AES_DO_ORTHOGRAPHIC_CHANGES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

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

    public static SubLObject run_link_parser_tests() {
        return run_test_case_table(LINK_PARSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject run_psp_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        run_test_case_table(PS_GET_CYCLS_FOR_PHRASE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        run_test_case_table(PS_GET_CYCLS_FOR_NP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        run_test_case_table(PS_HARVEST_NPS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    public static SubLObject test_parse_a_sentence_completely() {
        run_test_case_table(PARSE_A_SENTENCE_COMPLETELY, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    public static SubLObject test_parse_a_question_completely() {
        run_test_case_table(PARSE_A_QUESTION_COMPLETELY, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

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
    }

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
    }

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
    }

    public static SubLObject run_tp_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        test_parse_a_sentence_completely();
        test_parse_a_question_completely();
        return DONE;
    }

    public static SubLObject run_pph_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        run_test_case_table($sym32$GENERATE_TEXT_W_SENTENTIAL_FORCE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return DONE;
    }

    public static SubLObject declare_nlp_tests_file() {
        declareFunction(me, "run_lex_access_tests", "RUN-LEX-ACCESS-TESTS", 0, 1, false);
        declareFunction(me, "run_lex_semantics_tests", "RUN-LEX-SEMANTICS-TESTS", 0, 1, false);
        declareFunction(me, "test_aes_do_orthographic_changes", "TEST-AES-DO-ORTHOGRAPHIC-CHANGES", 0, 0, false);
        declareFunction(me, "run_regular_morph_tests", "RUN-REGULAR-MORPH-TESTS", 0, 1, false);
        declareFunction(me, "run_link_parser_tests", "RUN-LINK-PARSER-TESTS", 0, 0, false);
        declareFunction(me, "run_psp_tests", "RUN-PSP-TESTS", 0, 1, false);
        declareFunction(me, "test_parse_a_sentence_completely", "TEST-PARSE-A-SENTENCE-COMPLETELY", 0, 0, false);
        declareFunction(me, "test_parse_a_question_completely", "TEST-PARSE-A-QUESTION-COMPLETELY", 0, 0, false);
        declareFunction(me, "run_pred_strengthener_tests", "RUN-PRED-STRENGTHENER-TESTS", 0, 1, false);
        declareFunction(me, "run_rkf_term_reader_tests", "RUN-RKF-TERM-READER-TESTS", 0, 1, false);
        declareFunction(me, "run_rkf_sentence_reader_tests", "RUN-RKF-SENTENCE-READER-TESTS", 0, 1, false);
        declareFunction(me, "run_rkf_mts_tests", "RUN-RKF-MTS-TESTS", 0, 1, false);
        declareFunction(me, "run_rtp_tests", "RUN-RTP-TESTS", 0, 1, false);
        declareFunction(me, "run_tp_tests", "RUN-TP-TESTS", 0, 1, false);
        declareFunction(me, "run_pph_tests", "RUN-PPH-TESTS", 0, 1, false);
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

    static {


































    }
}

/**
 * Total time: 110 ms
 */
