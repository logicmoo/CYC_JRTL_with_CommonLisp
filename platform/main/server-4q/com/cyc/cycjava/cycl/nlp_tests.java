package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class nlp_tests
    extends
      SubLTranslatedFile
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
  public static SubLObject run_lex_access_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    generic_testing.run_test_case_table( $sym1$DENOTS_OF_STRING, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    generic_testing.run_test_case_table( $sym2$DENOTATION_MAPPER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 2133L)
  public static SubLObject run_lex_semantics_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = $kw4$NONE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.keywordp( verbose ) : verbose;
    inference_testing.load_inference_tests( inference_testing.construct_cyc_test_filename( $str6$lexical_semantics, UNPROVIDED ) );
    final SubLObject pcase_var = verbose;
    if( pcase_var.eql( $kw4$NONE ) )
    {
      inference_testing.run_test( $kw7$LEXICAL_SEMANTICS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( pcase_var.eql( $kw8$ALL ) )
    {
      inference_testing.run_test( $kw7$LEXICAL_SEMANTICS, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( pcase_var.eql( $kw9$FAIL ) )
    {
      final SubLObject _prev_bind_0 = inference_testing.$debug_continue$.currentBinding( thread );
      final SubLObject _prev_bind_2 = inference_testing.$it_show_all_failures$.currentBinding( thread );
      try
      {
        inference_testing.$debug_continue$.bind( T, thread );
        inference_testing.$it_show_all_failures$.bind( T, thread );
        inference_testing.clear_inference_test_results();
        inference_testing.run_test( $kw7$LEXICAL_SEMANTICS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        inference_testing.$it_show_all_failures$.rebind( _prev_bind_2, thread );
        inference_testing.$debug_continue$.rebind( _prev_bind_0, thread );
      }
    }
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 2990L)
  public static SubLObject test_aes_do_orthographic_changes()
  {
    Eval.load( inference_testing.construct_cyc_test_filename( $str10$regular_morphological_forms, UNPROVIDED ) );
    generic_testing.run_test_case_table( $sym11$AES_DO_ORTHOGRAPHIC_CHANGES, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 3249L)
  public static SubLObject run_regular_morph_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    test_aes_do_orthographic_changes();
    inference_testing.load_inference_tests( inference_testing.construct_cyc_test_filename( $str12$regular_morphology, UNPROVIDED ) );
    if( NIL != verbose )
    {
      inference_testing.run_test( $kw13$REGULAR_MORPHOLOGY, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      inference_testing.run_test( $kw13$REGULAR_MORPHOLOGY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 3732L)
  public static SubLObject run_link_parser_tests()
  {
    return generic_testing.run_test_case_table( $sym15$LINK_PARSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 3867L)
  public static SubLObject run_psp_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    generic_testing.run_test_case_table( $sym17$PS_GET_CYCLS_FOR_PHRASE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    generic_testing.run_test_case_table( $sym18$PS_GET_CYCLS_FOR_NP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    generic_testing.run_test_case_table( $sym19$PS_HARVEST_NPS, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 4851L)
  public static SubLObject test_parse_a_sentence_completely()
  {
    generic_testing.run_test_case_table( $sym20$PARSE_A_SENTENCE_COMPLETELY, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 5082L)
  public static SubLObject test_parse_a_question_completely()
  {
    generic_testing.run_test_case_table( $sym21$PARSE_A_QUESTION_COMPLETELY, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 5252L)
  public static SubLObject run_pred_strengthener_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    inference_testing.load_inference_tests( inference_testing.construct_cyc_test_filename( $str22$pred_strengthener, UNPROVIDED ) );
    if( NIL != verbose )
    {
      inference_testing.run_test( $kw23$PRED_STRENGTHENER, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      inference_testing.run_test( $kw23$PRED_STRENGTHENER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 5669L)
  public static SubLObject run_rkf_term_reader_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    inference_testing.load_inference_tests( inference_testing.construct_cyc_test_filename( $str24$rkf_term_reader, UNPROVIDED ) );
    if( NIL != verbose )
    {
      inference_testing.run_test( $kw25$RKF_TERM_READER, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      inference_testing.run_test( $kw25$RKF_TERM_READER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 6053L)
  public static SubLObject run_rkf_sentence_reader_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    inference_testing.load_inference_tests( inference_testing.construct_cyc_test_filename( $str24$rkf_term_reader, UNPROVIDED ) );
    if( NIL != verbose )
    {
      inference_testing.run_test( $kw26$RKF_SENTENCE_READER, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      inference_testing.run_test( $kw26$RKF_SENTENCE_READER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 6449L)
  public static SubLObject run_rkf_mts_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    inference_testing.load_inference_tests( inference_testing.construct_cyc_test_filename( $str24$rkf_term_reader, UNPROVIDED ) );
    if( NIL != verbose )
    {
      inference_testing.run_test( $kw27$RKF_MTS, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      inference_testing.run_test( $kw27$RKF_MTS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 6809L)
  public static SubLObject run_rtp_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    inference_testing.load_inference_tests( inference_testing.construct_cyc_test_filename( $str28$rtp_test, UNPROVIDED ) );
    if( NIL != verbose )
    {
      inference_testing.run_test( $kw29$RTP, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      inference_testing.run_test( $kw29$RTP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 7103L)
  public static SubLObject run_tp_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    test_parse_a_sentence_completely();
    test_parse_a_question_completely();
    return $sym3$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-tests.lisp", position = 7508L)
  public static SubLObject run_pph_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    generic_testing.run_test_case_table( $sym32$GENERATE_TEXT_W_SENTENTIAL_FORCE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return $sym3$DONE;
  }

  public static SubLObject declare_nlp_tests_file()
  {
    SubLFiles.declareFunction( me, "run_lex_access_tests", "RUN-LEX-ACCESS-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "run_lex_semantics_tests", "RUN-LEX-SEMANTICS-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "test_aes_do_orthographic_changes", "TEST-AES-DO-ORTHOGRAPHIC-CHANGES", 0, 0, false );
    SubLFiles.declareFunction( me, "run_regular_morph_tests", "RUN-REGULAR-MORPH-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "run_link_parser_tests", "RUN-LINK-PARSER-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "run_psp_tests", "RUN-PSP-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "test_parse_a_sentence_completely", "TEST-PARSE-A-SENTENCE-COMPLETELY", 0, 0, false );
    SubLFiles.declareFunction( me, "test_parse_a_question_completely", "TEST-PARSE-A-QUESTION-COMPLETELY", 0, 0, false );
    SubLFiles.declareFunction( me, "run_pred_strengthener_tests", "RUN-PRED-STRENGTHENER-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "run_rkf_term_reader_tests", "RUN-RKF-TERM-READER-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "run_rkf_sentence_reader_tests", "RUN-RKF-SENTENCE-READER-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "run_rkf_mts_tests", "RUN-RKF-MTS-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "run_rtp_tests", "RUN-RTP-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "run_tp_tests", "RUN-TP-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "run_pph_tests", "RUN-PPH-TESTS", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_nlp_tests_file()
  {
    return NIL;
  }

  public static SubLObject setup_nlp_tests_file()
  {
    access_macros.register_external_symbol( $sym0$RUN_LEX_ACCESS_TESTS );
    access_macros.register_external_symbol( $sym14$RUN_LINK_PARSER_TESTS );
    access_macros.register_external_symbol( $sym16$RUN_PSP_TESTS );
    access_macros.register_external_symbol( $sym30$RUN_TP_TESTS );
    access_macros.register_external_symbol( $sym31$RUN_PPH_TESTS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nlp_tests_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nlp_tests_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nlp_tests_file();
  }
  static
  {
    me = new nlp_tests();
    $sym0$RUN_LEX_ACCESS_TESTS = makeSymbol( "RUN-LEX-ACCESS-TESTS" );
    $sym1$DENOTS_OF_STRING = makeSymbol( "DENOTS-OF-STRING" );
    $sym2$DENOTATION_MAPPER = makeSymbol( "DENOTATION-MAPPER" );
    $sym3$DONE = makeSymbol( "DONE" );
    $kw4$NONE = makeKeyword( "NONE" );
    $sym5$KEYWORDP = makeSymbol( "KEYWORDP" );
    $str6$lexical_semantics = makeString( "lexical-semantics" );
    $kw7$LEXICAL_SEMANTICS = makeKeyword( "LEXICAL-SEMANTICS" );
    $kw8$ALL = makeKeyword( "ALL" );
    $kw9$FAIL = makeKeyword( "FAIL" );
    $str10$regular_morphological_forms = makeString( "regular-morphological-forms" );
    $sym11$AES_DO_ORTHOGRAPHIC_CHANGES = makeSymbol( "AES-DO-ORTHOGRAPHIC-CHANGES" );
    $str12$regular_morphology = makeString( "regular-morphology" );
    $kw13$REGULAR_MORPHOLOGY = makeKeyword( "REGULAR-MORPHOLOGY" );
    $sym14$RUN_LINK_PARSER_TESTS = makeSymbol( "RUN-LINK-PARSER-TESTS" );
    $sym15$LINK_PARSE = makeSymbol( "LINK-PARSE" );
    $sym16$RUN_PSP_TESTS = makeSymbol( "RUN-PSP-TESTS" );
    $sym17$PS_GET_CYCLS_FOR_PHRASE = makeSymbol( "PS-GET-CYCLS-FOR-PHRASE" );
    $sym18$PS_GET_CYCLS_FOR_NP = makeSymbol( "PS-GET-CYCLS-FOR-NP" );
    $sym19$PS_HARVEST_NPS = makeSymbol( "PS-HARVEST-NPS" );
    $sym20$PARSE_A_SENTENCE_COMPLETELY = makeSymbol( "PARSE-A-SENTENCE-COMPLETELY" );
    $sym21$PARSE_A_QUESTION_COMPLETELY = makeSymbol( "PARSE-A-QUESTION-COMPLETELY" );
    $str22$pred_strengthener = makeString( "pred-strengthener" );
    $kw23$PRED_STRENGTHENER = makeKeyword( "PRED-STRENGTHENER" );
    $str24$rkf_term_reader = makeString( "rkf-term-reader" );
    $kw25$RKF_TERM_READER = makeKeyword( "RKF-TERM-READER" );
    $kw26$RKF_SENTENCE_READER = makeKeyword( "RKF-SENTENCE-READER" );
    $kw27$RKF_MTS = makeKeyword( "RKF-MTS" );
    $str28$rtp_test = makeString( "rtp-test" );
    $kw29$RTP = makeKeyword( "RTP" );
    $sym30$RUN_TP_TESTS = makeSymbol( "RUN-TP-TESTS" );
    $sym31$RUN_PPH_TESTS = makeSymbol( "RUN-PPH-TESTS" );
    $sym32$GENERATE_TEXT_W_SENTENTIAL_FORCE = makeSymbol( "GENERATE-TEXT-W/SENTENTIAL-FORCE" );
  }
}
/*
 * 
 * Total time: 110 ms
 * 
 */