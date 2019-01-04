package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.cyc_testing.inference_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nlp_tests extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nlp_tests";
    public static final String myFingerPrint = "512718550c84fdb9043fa6cdac72b0855b38de788c65c626ade68454bfd1f5e3";
    private static final SubLSymbol $sym0$RUN_LEX_ACCESS_TESTS;
    private static final SubLSymbol $sym1$DENOTS_OF_STRING;
    private static final SubLSymbol $sym2$DENOTATION_MAPPER;
    private static final SubLSymbol $sym3$DONE;
    private static final SubLSymbol $kw4$NONE;
    private static final SubLSymbol $sym5$KEYWORDP;
    private static final SubLString $str6$lexical_semantics;
    private static final SubLSymbol $kw7$LEXICAL_SEMANTICS;
    private static final SubLSymbol $kw8$ALL;
    private static final SubLSymbol $kw9$FAIL;
    private static final SubLString $str10$regular_morphological_forms;
    private static final SubLSymbol $sym11$AES_DO_ORTHOGRAPHIC_CHANGES;
    private static final SubLString $str12$regular_morphology;
    private static final SubLSymbol $kw13$REGULAR_MORPHOLOGY;
    private static final SubLSymbol $sym14$RUN_LINK_PARSER_TESTS;
    private static final SubLSymbol $sym15$LINK_PARSE;
    private static final SubLSymbol $sym16$RUN_PSP_TESTS;
    private static final SubLSymbol $sym17$PS_GET_CYCLS_FOR_PHRASE;
    private static final SubLSymbol $sym18$PS_GET_CYCLS_FOR_NP;
    private static final SubLSymbol $sym19$PS_HARVEST_NPS;
    private static final SubLSymbol $sym20$PARSE_A_SENTENCE_COMPLETELY;
    private static final SubLSymbol $sym21$PARSE_A_QUESTION_COMPLETELY;
    private static final SubLString $str22$pred_strengthener;
    private static final SubLSymbol $kw23$PRED_STRENGTHENER;
    private static final SubLString $str24$rkf_term_reader;
    private static final SubLSymbol $kw25$RKF_TERM_READER;
    private static final SubLSymbol $kw26$RKF_SENTENCE_READER;
    private static final SubLSymbol $kw27$RKF_MTS;
    private static final SubLString $str28$rtp_test;
    private static final SubLSymbol $kw29$RTP;
    private static final SubLSymbol $sym30$RUN_TP_TESTS;
    private static final SubLSymbol $sym31$RUN_PPH_TESTS;
    private static final SubLSymbol $sym32$GENERATE_TEXT_W_SENTENTIAL_FORCE;
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 1609L)
    public static SubLObject run_lex_access_tests(SubLObject verbose) {
        if (verbose == nlp_tests.UNPROVIDED) {
            verbose = (SubLObject)nlp_tests.NIL;
        }
        generic_testing.run_test_case_table((SubLObject)nlp_tests.$sym1$DENOTS_OF_STRING, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        generic_testing.run_test_case_table((SubLObject)nlp_tests.$sym2$DENOTATION_MAPPER, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 2133L)
    public static SubLObject run_lex_semantics_tests(SubLObject verbose) {
        if (verbose == nlp_tests.UNPROVIDED) {
            verbose = (SubLObject)nlp_tests.$kw4$NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_tests.NIL != Types.keywordp(verbose) : verbose;
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename((SubLObject)nlp_tests.$str6$lexical_semantics, (SubLObject)nlp_tests.UNPROVIDED));
        final SubLObject pcase_var = verbose;
        if (pcase_var.eql((SubLObject)nlp_tests.$kw4$NONE)) {
            inference_testing.run_test((SubLObject)nlp_tests.$kw7$LEXICAL_SEMANTICS, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        else if (pcase_var.eql((SubLObject)nlp_tests.$kw8$ALL)) {
            inference_testing.run_test((SubLObject)nlp_tests.$kw7$LEXICAL_SEMANTICS, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        else if (pcase_var.eql((SubLObject)nlp_tests.$kw9$FAIL)) {
            final SubLObject _prev_bind_0 = inference_testing.$debug_continue$.currentBinding(thread);
            final SubLObject _prev_bind_2 = inference_testing.$it_show_all_failures$.currentBinding(thread);
            try {
                inference_testing.$debug_continue$.bind((SubLObject)nlp_tests.T, thread);
                inference_testing.$it_show_all_failures$.bind((SubLObject)nlp_tests.T, thread);
                inference_testing.clear_inference_test_results();
                inference_testing.run_test((SubLObject)nlp_tests.$kw7$LEXICAL_SEMANTICS, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
            }
            finally {
                inference_testing.$it_show_all_failures$.rebind(_prev_bind_2, thread);
                inference_testing.$debug_continue$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 2990L)
    public static SubLObject test_aes_do_orthographic_changes() {
        Eval.load(inference_testing.construct_cyc_test_filename((SubLObject)nlp_tests.$str10$regular_morphological_forms, (SubLObject)nlp_tests.UNPROVIDED));
        generic_testing.run_test_case_table((SubLObject)nlp_tests.$sym11$AES_DO_ORTHOGRAPHIC_CHANGES, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 3249L)
    public static SubLObject run_regular_morph_tests(SubLObject verbose) {
        if (verbose == nlp_tests.UNPROVIDED) {
            verbose = (SubLObject)nlp_tests.NIL;
        }
        test_aes_do_orthographic_changes();
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename((SubLObject)nlp_tests.$str12$regular_morphology, (SubLObject)nlp_tests.UNPROVIDED));
        if (nlp_tests.NIL != verbose) {
            inference_testing.run_test((SubLObject)nlp_tests.$kw13$REGULAR_MORPHOLOGY, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        else {
            inference_testing.run_test((SubLObject)nlp_tests.$kw13$REGULAR_MORPHOLOGY, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 3732L)
    public static SubLObject run_link_parser_tests() {
        return generic_testing.run_test_case_table((SubLObject)nlp_tests.$sym15$LINK_PARSE, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 3867L)
    public static SubLObject run_psp_tests(SubLObject verbose) {
        if (verbose == nlp_tests.UNPROVIDED) {
            verbose = (SubLObject)nlp_tests.NIL;
        }
        generic_testing.run_test_case_table((SubLObject)nlp_tests.$sym17$PS_GET_CYCLS_FOR_PHRASE, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        generic_testing.run_test_case_table((SubLObject)nlp_tests.$sym18$PS_GET_CYCLS_FOR_NP, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        generic_testing.run_test_case_table((SubLObject)nlp_tests.$sym19$PS_HARVEST_NPS, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 4851L)
    public static SubLObject test_parse_a_sentence_completely() {
        generic_testing.run_test_case_table((SubLObject)nlp_tests.$sym20$PARSE_A_SENTENCE_COMPLETELY, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 5082L)
    public static SubLObject test_parse_a_question_completely() {
        generic_testing.run_test_case_table((SubLObject)nlp_tests.$sym21$PARSE_A_QUESTION_COMPLETELY, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 5252L)
    public static SubLObject run_pred_strengthener_tests(SubLObject verbose) {
        if (verbose == nlp_tests.UNPROVIDED) {
            verbose = (SubLObject)nlp_tests.NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename((SubLObject)nlp_tests.$str22$pred_strengthener, (SubLObject)nlp_tests.UNPROVIDED));
        if (nlp_tests.NIL != verbose) {
            inference_testing.run_test((SubLObject)nlp_tests.$kw23$PRED_STRENGTHENER, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        else {
            inference_testing.run_test((SubLObject)nlp_tests.$kw23$PRED_STRENGTHENER, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 5669L)
    public static SubLObject run_rkf_term_reader_tests(SubLObject verbose) {
        if (verbose == nlp_tests.UNPROVIDED) {
            verbose = (SubLObject)nlp_tests.NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename((SubLObject)nlp_tests.$str24$rkf_term_reader, (SubLObject)nlp_tests.UNPROVIDED));
        if (nlp_tests.NIL != verbose) {
            inference_testing.run_test((SubLObject)nlp_tests.$kw25$RKF_TERM_READER, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        else {
            inference_testing.run_test((SubLObject)nlp_tests.$kw25$RKF_TERM_READER, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 6053L)
    public static SubLObject run_rkf_sentence_reader_tests(SubLObject verbose) {
        if (verbose == nlp_tests.UNPROVIDED) {
            verbose = (SubLObject)nlp_tests.NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename((SubLObject)nlp_tests.$str24$rkf_term_reader, (SubLObject)nlp_tests.UNPROVIDED));
        if (nlp_tests.NIL != verbose) {
            inference_testing.run_test((SubLObject)nlp_tests.$kw26$RKF_SENTENCE_READER, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        else {
            inference_testing.run_test((SubLObject)nlp_tests.$kw26$RKF_SENTENCE_READER, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 6449L)
    public static SubLObject run_rkf_mts_tests(SubLObject verbose) {
        if (verbose == nlp_tests.UNPROVIDED) {
            verbose = (SubLObject)nlp_tests.NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename((SubLObject)nlp_tests.$str24$rkf_term_reader, (SubLObject)nlp_tests.UNPROVIDED));
        if (nlp_tests.NIL != verbose) {
            inference_testing.run_test((SubLObject)nlp_tests.$kw27$RKF_MTS, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        else {
            inference_testing.run_test((SubLObject)nlp_tests.$kw27$RKF_MTS, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 6809L)
    public static SubLObject run_rtp_tests(SubLObject verbose) {
        if (verbose == nlp_tests.UNPROVIDED) {
            verbose = (SubLObject)nlp_tests.NIL;
        }
        inference_testing.load_inference_tests(inference_testing.construct_cyc_test_filename((SubLObject)nlp_tests.$str28$rtp_test, (SubLObject)nlp_tests.UNPROVIDED));
        if (nlp_tests.NIL != verbose) {
            inference_testing.run_test((SubLObject)nlp_tests.$kw29$RTP, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.T, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        else {
            inference_testing.run_test((SubLObject)nlp_tests.$kw29$RTP, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        }
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 7103L)
    public static SubLObject run_tp_tests(SubLObject verbose) {
        if (verbose == nlp_tests.UNPROVIDED) {
            verbose = (SubLObject)nlp_tests.NIL;
        }
        test_parse_a_sentence_completely();
        test_parse_a_question_completely();
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 7508L)
    public static SubLObject run_pph_tests(SubLObject verbose) {
        if (verbose == nlp_tests.UNPROVIDED) {
            verbose = (SubLObject)nlp_tests.NIL;
        }
        generic_testing.run_test_case_table((SubLObject)nlp_tests.$sym32$GENERATE_TEXT_W_SENTENTIAL_FORCE, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED, (SubLObject)nlp_tests.UNPROVIDED);
        return (SubLObject)nlp_tests.$sym3$DONE;
    }
    
    public static SubLObject declare_nlp_tests_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_lex_access_tests", "RUN-LEX-ACCESS-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_lex_semantics_tests", "RUN-LEX-SEMANTICS-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "test_aes_do_orthographic_changes", "TEST-AES-DO-ORTHOGRAPHIC-CHANGES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_regular_morph_tests", "RUN-REGULAR-MORPH-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_link_parser_tests", "RUN-LINK-PARSER-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_psp_tests", "RUN-PSP-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "test_parse_a_sentence_completely", "TEST-PARSE-A-SENTENCE-COMPLETELY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "test_parse_a_question_completely", "TEST-PARSE-A-QUESTION-COMPLETELY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_pred_strengthener_tests", "RUN-PRED-STRENGTHENER-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_rkf_term_reader_tests", "RUN-RKF-TERM-READER-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_rkf_sentence_reader_tests", "RUN-RKF-SENTENCE-READER-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_rkf_mts_tests", "RUN-RKF-MTS-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_rtp_tests", "RUN-RTP-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_tp_tests", "RUN-TP-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_tests", "run_pph_tests", "RUN-PPH-TESTS", 0, 1, false);
        return (SubLObject)nlp_tests.NIL;
    }
    
    public static SubLObject init_nlp_tests_file() {
        return (SubLObject)nlp_tests.NIL;
    }
    
    public static SubLObject setup_nlp_tests_file() {
        access_macros.register_external_symbol((SubLObject)nlp_tests.$sym0$RUN_LEX_ACCESS_TESTS);
        access_macros.register_external_symbol((SubLObject)nlp_tests.$sym14$RUN_LINK_PARSER_TESTS);
        access_macros.register_external_symbol((SubLObject)nlp_tests.$sym16$RUN_PSP_TESTS);
        access_macros.register_external_symbol((SubLObject)nlp_tests.$sym30$RUN_TP_TESTS);
        access_macros.register_external_symbol((SubLObject)nlp_tests.$sym31$RUN_PPH_TESTS);
        return (SubLObject)nlp_tests.NIL;
    }
    
    public void declareFunctions() {
        declare_nlp_tests_file();
    }
    
    public void initializeVariables() {
        init_nlp_tests_file();
    }
    
    public void runTopLevelForms() {
        setup_nlp_tests_file();
    }
    
    static {
        me = (SubLFile)new nlp_tests();
        $sym0$RUN_LEX_ACCESS_TESTS = SubLObjectFactory.makeSymbol("RUN-LEX-ACCESS-TESTS");
        $sym1$DENOTS_OF_STRING = SubLObjectFactory.makeSymbol("DENOTS-OF-STRING");
        $sym2$DENOTATION_MAPPER = SubLObjectFactory.makeSymbol("DENOTATION-MAPPER");
        $sym3$DONE = SubLObjectFactory.makeSymbol("DONE");
        $kw4$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym5$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $str6$lexical_semantics = SubLObjectFactory.makeString("lexical-semantics");
        $kw7$LEXICAL_SEMANTICS = SubLObjectFactory.makeKeyword("LEXICAL-SEMANTICS");
        $kw8$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw9$FAIL = SubLObjectFactory.makeKeyword("FAIL");
        $str10$regular_morphological_forms = SubLObjectFactory.makeString("regular-morphological-forms");
        $sym11$AES_DO_ORTHOGRAPHIC_CHANGES = SubLObjectFactory.makeSymbol("AES-DO-ORTHOGRAPHIC-CHANGES");
        $str12$regular_morphology = SubLObjectFactory.makeString("regular-morphology");
        $kw13$REGULAR_MORPHOLOGY = SubLObjectFactory.makeKeyword("REGULAR-MORPHOLOGY");
        $sym14$RUN_LINK_PARSER_TESTS = SubLObjectFactory.makeSymbol("RUN-LINK-PARSER-TESTS");
        $sym15$LINK_PARSE = SubLObjectFactory.makeSymbol("LINK-PARSE");
        $sym16$RUN_PSP_TESTS = SubLObjectFactory.makeSymbol("RUN-PSP-TESTS");
        $sym17$PS_GET_CYCLS_FOR_PHRASE = SubLObjectFactory.makeSymbol("PS-GET-CYCLS-FOR-PHRASE");
        $sym18$PS_GET_CYCLS_FOR_NP = SubLObjectFactory.makeSymbol("PS-GET-CYCLS-FOR-NP");
        $sym19$PS_HARVEST_NPS = SubLObjectFactory.makeSymbol("PS-HARVEST-NPS");
        $sym20$PARSE_A_SENTENCE_COMPLETELY = SubLObjectFactory.makeSymbol("PARSE-A-SENTENCE-COMPLETELY");
        $sym21$PARSE_A_QUESTION_COMPLETELY = SubLObjectFactory.makeSymbol("PARSE-A-QUESTION-COMPLETELY");
        $str22$pred_strengthener = SubLObjectFactory.makeString("pred-strengthener");
        $kw23$PRED_STRENGTHENER = SubLObjectFactory.makeKeyword("PRED-STRENGTHENER");
        $str24$rkf_term_reader = SubLObjectFactory.makeString("rkf-term-reader");
        $kw25$RKF_TERM_READER = SubLObjectFactory.makeKeyword("RKF-TERM-READER");
        $kw26$RKF_SENTENCE_READER = SubLObjectFactory.makeKeyword("RKF-SENTENCE-READER");
        $kw27$RKF_MTS = SubLObjectFactory.makeKeyword("RKF-MTS");
        $str28$rtp_test = SubLObjectFactory.makeString("rtp-test");
        $kw29$RTP = SubLObjectFactory.makeKeyword("RTP");
        $sym30$RUN_TP_TESTS = SubLObjectFactory.makeSymbol("RUN-TP-TESTS");
        $sym31$RUN_PPH_TESTS = SubLObjectFactory.makeSymbol("RUN-PPH-TESTS");
        $sym32$GENERATE_TEXT_W_SENTENTIAL_FORCE = SubLObjectFactory.makeSymbol("GENERATE-TEXT-W/SENTENTIAL-FORCE");
    }
}

/*

	Total time: 110 ms
	
*/