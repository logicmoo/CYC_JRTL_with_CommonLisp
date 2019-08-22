package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class ebmt_tests extends SubLTranslatedFile {
    public static final SubLFile me = new ebmt_tests();

    public static final String myName = "com.cyc.cycjava.cycl.ebmt_tests";

    public static final String myFingerPrint = "0b04504d3878a0f26d7ace58ffdb9d528003f67b879c048d375e834f2d8ded50";

    // deflexical
    private static final SubLSymbol $ebmt_training_output_filename$ = makeSymbol("*EBMT-TRAINING-OUTPUT-FILENAME*");

    // deflexical
    private static final SubLSymbol $ebmt_testing_output_filename$ = makeSymbol("*EBMT-TESTING-OUTPUT-FILENAME*");

    // deflexical
    private static final SubLSymbol $ebmt_not_yet_scored_lines_filename$ = makeSymbol("*EBMT-NOT-YET-SCORED-LINES-FILENAME*");

    // deflexical
    private static final SubLSymbol $ebmt_scored_lines_filename$ = makeSymbol("*EBMT-SCORED-LINES-FILENAME*");

    // deflexical
    private static final SubLSymbol $ebmt_scored_data_filename$ = makeSymbol("*EBMT-SCORED-DATA-FILENAME*");

    // defparameter
    private static final SubLSymbol $ebmt_keepalive_enabledP$ = makeSymbol("*EBMT-KEEPALIVE-ENABLED?*");

    // defparameter
    /**
     * The file that will contain summary information for all test-runs conducted to
     * evaluate the EBMT system
     */
    private static final SubLSymbol $ebmt_global_summary_file$ = makeSymbol("*EBMT-GLOBAL-SUMMARY-FILE*");

    // defparameter
    // The graph that represents the EBMT training results to date
    private static final SubLSymbol $ebmt_training_recall_graph$ = makeSymbol("*EBMT-TRAINING-RECALL-GRAPH*");

    // defparameter
    // The graph that represents the EBMT parsing-test results to date
    private static final SubLSymbol $ebmt_parsing_results_graph$ = makeSymbol("*EBMT-PARSING-RESULTS-GRAPH*");

    // defparameter
    /**
     * This graph displays the precision and recall for the EBMT parsing-tests to
     * date
     */
    private static final SubLSymbol $ebmt_accuracy_graph$ = makeSymbol("*EBMT-ACCURACY-GRAPH*");

    // defparameter
    private static final SubLSymbol $ebmt_plot_params$ = makeSymbol("*EBMT-PLOT-PARAMS*");

    // Internal Constants
    public static final SubLString $str0$training_output_txt = makeString("training-output.txt");

    public static final SubLString $str1$testing_output_txt = makeString("testing-output.txt");

    public static final SubLString $str2$to_be_scored_lines_txt = makeString("to-be-scored-lines.txt");

    public static final SubLString $str3$scored_lines_txt = makeString("scored-lines.txt");

    public static final SubLString $str4$scored_data_txt = makeString("scored-data.txt");

    public static final SubLString $str5$ = makeString("");

    public static final SubLList $list6 = list(makeSymbol("TEST-DIR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym7$TEST_DIR_VAR = makeUninternedSymbol("TEST-DIR-VAR");

    public static final SubLSymbol $sym8$OS_PROCESS = makeUninternedSymbol("OS-PROCESS");



    public static final SubLList $list10 = list(makeSymbol("*EBMT-INDEX-HOST*"), makeString("localhost"));

    public static final SubLSymbol $ebmt_index_content$ = makeSymbol("*EBMT-INDEX-CONTENT*");



    public static final SubLString $str13$_A_ebmt_index_txt = makeString("~A/ebmt-index.txt");

    public static final SubLSymbol $ebmt_index_log$ = makeSymbol("*EBMT-INDEX-LOG*");

    public static final SubLString $str15$_A_ebmt_index_log = makeString("~A/ebmt-index.log");

    public static final SubLSymbol EBMT_INDEX_SERVER_PROCESS = makeSymbol("EBMT-INDEX-SERVER-PROCESS");

    public static final SubLSymbol WITHOUT_PRETTY_PRINTING = makeSymbol("WITHOUT-PRETTY-PRINTING");

    public static final SubLSymbol KILL_OS_PROCESS = makeSymbol("KILL-OS-PROCESS");

    public static final SubLList $list19 = list(list(makeSymbol("NL"), makeSymbol("CYCL"), makeSymbol("SOURCE"), makeSymbol("&KEY"), list(makeSymbol("EVERY-NTH"), ONE_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list20 = list(makeKeyword("EVERY-NTH"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLSymbol $sym23$PAIR = makeUninternedSymbol("PAIR");

    public static final SubLSymbol $sym24$SOURCE_VAR = makeUninternedSymbol("SOURCE-VAR");

    public static final SubLSymbol PROGRESS_CDOLIST = makeSymbol("PROGRESS-CDOLIST");

    public static final SubLSymbol EBMT_NL_CYCL_PAIRS_FROM_SOURCE = makeSymbol("EBMT-NL-CYCL-PAIRS-FROM-SOURCE");

    public static final SubLString $str27$Processing_EBMT_data_from__a____ = makeString("Processing EBMT data from ~a ...");



    public static final SubLList $list29 = list(list(new SubLObject[]{ makeSymbol("NL"), makeSymbol("CYCL"), makeSymbol("NUM-INTERPS-PER-EXAMPLE"), makeSymbol("TEST-RESULT"), makeSymbol("TIME-TAKEN"), makeSymbol("MATCH-LIST"), makeSymbol("PARSED-CYCLS"), makeSymbol("WEIGHTS"), makeSymbol("TESTING-OUTPUT-FILE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym30$LINE = makeUninternedSymbol("LINE");

    public static final SubLSymbol $sym31$DATUM = makeUninternedSymbol("DATUM");

    public static final SubLSymbol DO_FILE_LINES = makeSymbol("DO-FILE-LINES");



    public static final SubLList $list34 = list(NIL);





    public static final SubLSymbol EBMT_TESTING_OUTPUT_DATUM_P = makeSymbol("EBMT-TESTING-OUTPUT-DATUM-P");



    public static final SubLString $str39$Got_a_malformed_EBMT_testing_outp = makeString("Got a malformed EBMT testing output line ~s");

    public static final SubLSymbol EBMT_CANONICALIZE_EL_SENTENCE = makeSymbol("EBMT-CANONICALIZE-EL-SENTENCE");













    private static final SubLList $list47 = list(list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?X"), reader_make_constant_shell(makeString("Lebanon"))), list(reader_make_constant_shell(makeString("intendedAttackTargets")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("CarBombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("GovernmentalBuilding"))), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), reader_make_constant_shell(makeString("InferencePSC"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?VAR1"), reader_make_constant_shell(makeString("Lebanon"))), list(reader_make_constant_shell(makeString("intendedAttackTargets")), makeSymbol("?VAR1"), makeSymbol("?VAR0")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR1"), reader_make_constant_shell(makeString("CarBombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR0"), reader_make_constant_shell(makeString("GovernmentalBuilding"))), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), makeSymbol("?VAR1"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))));

    private static final SubLSymbol $sym48$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLSymbol EBMT_PARSE = makeSymbol("EBMT-PARSE");

    private static final SubLSymbol EBMT_TEST_FUNC = makeSymbol("EBMT-TEST-FUNC");

    private static final SubLList $list51 = list(list(list(makeString("Which terrorist groups have carried out suicide bombings in Israel?")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?ASSASSINATION-1"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ASSASSINATION-1"), reader_make_constant_shell(makeString("TerroristSuicideBombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?GROUP"), reader_make_constant_shell(makeString("TerroristGroup"))), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?ASSASSINATION-1"), reader_make_constant_shell(makeString("Israel"))), list(reader_make_constant_shell(makeString("perpetrator")), makeSymbol("?ASSASSINATION-1"), makeSymbol("?GROUP"))))), list(list(makeString("What types of attacks has Hezbollah performed?")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?ACTION"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TYPE-OF-ATTACK"), reader_make_constant_shell(makeString("AttackType"))), list(reader_make_constant_shell(makeString("nearestIsa")), makeSymbol("?ACTION"), makeSymbol("?TYPE-OF-ATTACK")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?ACTION"), reader_make_constant_shell(makeString("LebaneseHizballah")))))), list(list(makeString("Where were the members of Hizballah born?")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?MEMBER-1"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?MEMBER-1")), list(reader_make_constant_shell(makeString("birthPlace")), makeSymbol("?MEMBER-1"), makeSymbol("?PLACE"))))), list(list(makeString("Where do members of Hizballah live?")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?INHABITANT"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?INHABITANT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?INHABITANT"), reader_make_constant_shell(makeString("Agent-Generic"))), list(reader_make_constant_shell(makeString("residesInRegion")), makeSymbol("?INHABITANT"), makeSymbol("?GEOGRAPHICAL-REGION"))))), list(list(makeString("What terrorist groups is Hezbollah financially linked to?")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("TerroristGroup"))), list(reader_make_constant_shell(makeString("relatedToVia")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("financiallyLinked"))), THREE_INTEGER))), list(list(makeString("What types of financial links are there?")), list(reader_make_constant_shell(makeString("genlPreds")), makeSymbol("?PRED"), reader_make_constant_shell(makeString("financiallyLinked")))));

    private static final SubLString $str52$_error_output_txt = makeString("/error-output.txt");



    private static final SubLString $str54$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str55$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/");

    private static final SubLString $str56$_ = makeString("/");

    private static final SubLString $str57$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/summary.txt");

    public static final SubLString $str58$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-training-recall-report");

    private static final SubLString $str59$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-parsing-results");

    public static final SubLString $str60$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-accuracy-report");

    private static final SubLObject $$EBMTTrainingExamplesFromQLMt = reader_make_constant_shell(makeString("EBMTTrainingExamplesFromQLMt"));

    private static final SubLString $str62$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/");

    private static final SubLString $str63$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/summary.txt");

    private static final SubLString $str64$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-training-recall-report");

    public static final SubLString $str65$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-parsing-results");

    public static final SubLString $str66$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-accuracy-report");

    private static final SubLObject $const67$EBMTTrainingExamplesForWesternBus = reader_make_constant_shell(makeString("EBMTTrainingExamplesForWesternBusinessPracticesMt"));

    public static final SubLString $str68$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/");

    public static final SubLString $str69$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/summary.txt");

    private static final SubLString $str70$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-training-recall-report");

    public static final SubLString $str71$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-parsing-results");

    public static final SubLString $str72$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-accuracy-report");

    public static final SubLString $str73$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/testing-input.txt");

    private static final SubLString $str74$_opt_local_pkg_j2sdk1_4_2_bin_jav = makeString("/opt/local/pkg/j2sdk1.4.2/bin/java");

    private static final SubLString $str75$_home_shah_cvs_head_cycorp_cyc_ja = makeString("/home/shah/cvs/head/cycorp/cyc/java/com/cyc/common/cyc-common.jar:/cyc/java/lib/xercesImpl-2.2.1.jar:/cyc/java/lib/lucene-core-1.9.1.jar");

    private static final SubLString $str76$_cp = makeString("-cp");

    private static final SubLString $str77$com_cyc_common_nlp_EBMTTemplateIn = makeString("com.cyc.common.nlp.EBMTTemplateIndexServer");

    private static final SubLString $str78$_i = makeString("-i");

    private static final SubLString $str79$_ebmt_index_ = makeString("/ebmt-index/");

    private static final SubLString $$$EBMT_Template_Index_Server = makeString("EBMT Template Index Server");

    private static final SubLSymbol EBMT_TESTING_SOURCE_P = makeSymbol("EBMT-TESTING-SOURCE-P");



    private static final SubLList $list83 = list(makeSymbol("?NL"), makeSymbol("?CYCL"));

    private static final SubLList $list84 = list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?QUOTEDCYCL"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ebmtNLToCycLTrainingExample")), makeSymbol("?NL"), makeSymbol("?QUOTEDCYCL")), list(reader_make_constant_shell(makeString("means")), makeSymbol("?QUOTEDCYCL"), makeSymbol("?CYCL"))));



    private static final SubLString $$$localhost = makeString("localhost");

    private static final SubLString $str87$_ebmt_index_txt = makeString("/ebmt-index.txt");

    private static final SubLString $str88$_ebmt_index_log = makeString("/ebmt-index.log");

    private static final SubLString $$$Processing_EBMT_data_from_ = makeString("Processing EBMT data from ");

    private static final SubLString $str90$____ = makeString(" ...");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLList $list92 = list(makeSymbol("NL"), makeSymbol("CYCL"));

    private static final SubLString $$$Added = makeString("Added");





    private static final SubLString $str96$Unexpected_type_of_EBMT_template_ = makeString("Unexpected type of EBMT template: ~S~%");

    private static final SubLString $$$Already_indexed = makeString("Already indexed");

    private static final SubLString $str98$Unexpected_indexing_result_of_EBM = makeString("Unexpected indexing-result of EBMT template: ~s");

    private static final SubLString $str99$_S__ = makeString("~S~%");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));









    private static final SubLString $str105$Summarizing_EBMT_training_details = makeString("Summarizing EBMT training details ...");

    private static final SubLSymbol $TRAINING_INPUT_MT = makeKeyword("TRAINING-INPUT-MT");

    private static final SubLSymbol $USER_TRAINING_EXAMPLES = makeKeyword("USER-TRAINING-EXAMPLES");





    private static final SubLSymbol $GENERAL_TEMPLATES_PC = makeKeyword("GENERAL-TEMPLATES-PC");



    private static final SubLSymbol $SPECIFIC_TEMPLATES_PC = makeKeyword("SPECIFIC-TEMPLATES-PC");



    private static final SubLSymbol $NO_TEMPLATES_PC = makeKeyword("NO-TEMPLATES-PC");



    private static final SubLSymbol $DUPLICATE_TEMPLATES_PC = makeKeyword("DUPLICATE-TEMPLATES-PC");

    private static final SubLSymbol $TOTAL_TRAINING_TIME = makeKeyword("TOTAL-TRAINING-TIME");

    private static final SubLSymbol $MIN_TRAINING_TIME = makeKeyword("MIN-TRAINING-TIME");

    private static final SubLSymbol $MAX_TRAINING_TIME = makeKeyword("MAX-TRAINING-TIME");

    private static final SubLList $list120 = list(makeSymbol("NL"), makeSymbol("CYCL"), makeSymbol("NUM-INTERPS-PER-EXAMPLE"), makeSymbol("TEST-RESULT"), makeSymbol("TIME-TAKEN"), makeSymbol("MATCH-LIST"), makeSymbol("PARSED-CYCLS"), makeSymbol("WEIGHTS"));





    private static final SubLString $str123$Unexpected_EBMT_result__s = makeString("Unexpected EBMT result ~s");

    private static final SubLList $list124 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));



    private static final SubLSymbol $TESTING_INPUT_SOURCE = makeKeyword("TESTING-INPUT-SOURCE");





    private static final SubLSymbol $SUCCESSFUL_TESTS_PC = makeKeyword("SUCCESSFUL-TESTS-PC");

    private static final SubLSymbol $ALMOST_SUCCESSFUL_TESTS = makeKeyword("ALMOST-SUCCESSFUL-TESTS");

    private static final SubLSymbol $ALMOST_SUCCESSFUL_TESTS_PC = makeKeyword("ALMOST-SUCCESSFUL-TESTS-PC");



    private static final SubLSymbol $UNKNOWN_TESTS_PC = makeKeyword("UNKNOWN-TESTS-PC");



    private static final SubLSymbol $FAILED_TESTS_PC = makeKeyword("FAILED-TESTS-PC");

    private static final SubLSymbol $TOTAL_UNIQUE_INTERPS = makeKeyword("TOTAL-UNIQUE-INTERPS");

    private static final SubLSymbol $MAX_INTERPS_PER_EXAMPLE = makeKeyword("MAX-INTERPS-PER-EXAMPLE");

    private static final SubLSymbol $MEAN_INTERPS_PER_EXAMPLE = makeKeyword("MEAN-INTERPS-PER-EXAMPLE");

    private static final SubLSymbol $MEDIAN_INTERPS_PER_EXAMPLE = makeKeyword("MEDIAN-INTERPS-PER-EXAMPLE");

    private static final SubLSymbol $TOTAL_TESTING_TIME = makeKeyword("TOTAL-TESTING-TIME");

    private static final SubLSymbol $TOTAL_SUCCESSFUL_TIME = makeKeyword("TOTAL-SUCCESSFUL-TIME");

    private static final SubLSymbol $TOTAL_ALMOST_SUCCESSFUL_TIME = makeKeyword("TOTAL-ALMOST-SUCCESSFUL-TIME");

    private static final SubLSymbol $TOTAL_UNKNOWN_TIME = makeKeyword("TOTAL-UNKNOWN-TIME");

    private static final SubLSymbol $TOTAL_FAILED_TIME = makeKeyword("TOTAL-FAILED-TIME");

    private static final SubLSymbol $MAX_TIME_PER_EXAMPLE = makeKeyword("MAX-TIME-PER-EXAMPLE");

    private static final SubLSymbol $MEAN_TIME_PER_EXAMPLE = makeKeyword("MEAN-TIME-PER-EXAMPLE");

    private static final SubLSymbol $MEDIAN_TIME_PER_EXAMPLE = makeKeyword("MEDIAN-TIME-PER-EXAMPLE");



















    private static final SubLString $str157$summary_txt = makeString("summary.txt");

    private static final SubLString $str158$summary_plist_lisp = makeString("summary-plist.lisp");

    private static final SubLString $str159$_s__ = makeString("~s~%");





    private static final SubLSymbol GET_EBMT_PLOT_VALUE = makeSymbol("GET-EBMT-PLOT-VALUE");

    private static final SubLSymbol $RAW_DATA_TYPES = makeKeyword("RAW-DATA-TYPES");

    private static final SubLSymbol $COMPUTED_DATA_TYPES = makeKeyword("COMPUTED-DATA-TYPES");

    private static final SubLList $list165 = list(makeKeyword("XLABEL"), makeString("Cyc KB\\nDate"), makeKeyword("YORIGIN"), ZERO_INTEGER);

    private static final SubLList $list166 = list(makeKeyword("XLABEL"), makeKeyword("YLABEL"), makeKeyword("PLOT-TITLE"), makeKeyword("YORIGIN"), makeKeyword("YMAX"), makeKeyword("KEY-LOCATION"), makeKeyword("KEY-JUSTIFY"));



    public static final SubLList $list168 = list(makeSymbol("LINE-LABEL"), makeSymbol("FORMULA"));





    private static final SubLString $str171$_n = makeString("\\n");



    private static final SubLList $list173 = list(makeSymbol("KEYWORD"), makeSymbol("FORMULA"));

    private static final SubLList $list174 = list(makeKeyword("YLABEL"), makeString("% of training examples"), makeKeyword("PLOT-TITLE"), list(makeString("EBMT Training Recall")), makeKeyword("COMPUTED-DATA-TYPES"), list(makeKeyword("FAILED-EXAMPLE-PERCENTAGE"), list(makeString("no templates"), makeKeyword("NO-TEMPLATES-PC")), makeKeyword("DUPLICATES"), list(makeString("duplicate templates"), makeKeyword("DUPLICATE-TEMPLATES-PC")), makeKeyword("SPECIFIC-TEMPLATE-RECALL"), list(makeString("non-generalized templates"), makeKeyword("SPECIFIC-TEMPLATES-PC")), makeKeyword("GENERAL-TEMPLATE-RECALL"), list(makeString("generalized, unique templates"), makeKeyword("GENERAL-TEMPLATES-PC"))));

    public static final SubLList $list175 = list(makeKeyword("YLABEL"), makeString("Time (seconds)"), makeKeyword("PLOT-TITLE"), list(makeString("EBMT Parsing Times")), makeKeyword("RAW-DATA-TYPES"), list(makeKeyword("MEAN-TIME-PER-EXAMPLE"), makeString("Mean Time per Sentence"), makeKeyword("MEDIAN-TIME-PER-EXAMPLE"), makeString("Median Time per Sentence")));

    public static final SubLList $list176 = list(makeKeyword("PLOT-TITLE"), makeString("EBMT Parsing Accuracy"), makeKeyword("YLABEL"), makeString("Value (in %)"), makeKeyword("YMAX"), makeInteger(100), makeKeyword("COMPUTED-DATA-TYPES"), list(makeKeyword("PRECISION"), list(makeString("Precision"), list(makeSymbol("PERCENT"), makeKeyword("SUCCESSFUL-TESTS"), makeKeyword("TOTAL-UNIQUE-INTERPS"))), makeKeyword("SUCCESSFUL-TESTS-PC"), list(makeString("Recall"), makeKeyword("SUCCESSFUL-TESTS-PC"))));

    public static final SubLList $list177 = list(makeKeyword("PLOT-TITLE"), makeString("EBMT Parsing Results"), makeKeyword("YLABEL"), makeString("% of tests"), makeKeyword("YMAX"), makeInteger(100), makeKeyword("COMPUTED-DATA-TYPES"), list(makeKeyword("FAILED"), list(makeString("Failed"), makeKeyword("FAILED-TESTS-PC")), makeKeyword("UNKNOWN"), list(makeString("Unknown"), makeKeyword("UNKNOWN-TESTS-PC")), makeKeyword("ALMOST-SUCCESSFUL"), list(makeString("Almost Successful"), makeKeyword("ALMOST-SUCCESSFUL-TESTS-PC")), makeKeyword("SUCCESSFUL"), list(makeString("Successful"), makeKeyword("SUCCESSFUL-TESTS-PC"))));

    private static final SubLSymbol $EBMT_GRAPHS_UPDATED = makeKeyword("EBMT-GRAPHS-UPDATED");

    public static SubLObject with_standard_ebmt_testing_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test_dir = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        test_dir = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject test_dir_var = $sym7$TEST_DIR_VAR;
        final SubLObject os_process = $sym8$OS_PROCESS;
        return list(CLET, list(list(test_dir_var, test_dir)), list(CLET, list($list10, list($ebmt_index_content$, list(FORMAT_NIL, $str13$_A_ebmt_index_txt, test_dir_var)), list($ebmt_index_log$, list(FORMAT_NIL, $str15$_A_ebmt_index_log, test_dir_var))), list(CLET, list(list(os_process, list(EBMT_INDEX_SERVER_PROCESS, test_dir_var))), bq_cons(WITHOUT_PRETTY_PRINTING, append(body, NIL)), list(KILL_OS_PROCESS, os_process))));
    }

    public static SubLObject do_ebmt_nl_cycl_pairs_from_source(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nl = NIL;
        SubLObject cycl = NIL;
        SubLObject source = NIL;
        destructuring_bind_must_consp(current, datum, $list19);
        nl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        cycl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        source = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list19);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list19);
            if (NIL == member(current_$1, $list20, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list19);
        }
        final SubLObject every_nth_tail = property_list_member($EVERY_NTH, current);
        final SubLObject every_nth = (NIL != every_nth_tail) ? cadr(every_nth_tail) : ONE_INTEGER;
        final SubLObject body;
        current = body = temp;
        final SubLObject pair = $sym23$PAIR;
        final SubLObject source_var = $sym24$SOURCE_VAR;
        return list(CLET, list(list(source_var, source)), list(PROGRESS_CDOLIST, list(pair, list(EBMT_NL_CYCL_PAIRS_FROM_SOURCE, source_var, every_nth), list(FORMAT_NIL, $str27$Processing_EBMT_data_from__a____, source_var)), listS(CDESTRUCTURING_BIND, list(nl, cycl), pair, append(body, NIL))));
    }

    public static SubLObject ebmt_do_testing_output_data_from_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nl = NIL;
        SubLObject cycl = NIL;
        SubLObject num_interps_per_example = NIL;
        SubLObject test_result = NIL;
        SubLObject time_taken = NIL;
        SubLObject match_list = NIL;
        SubLObject parsed_cycls = NIL;
        SubLObject weights = NIL;
        SubLObject testing_output_file = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        nl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        cycl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        num_interps_per_example = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        test_result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        time_taken = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        match_list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        parsed_cycls = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        weights = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        testing_output_file = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject line = $sym30$LINE;
            final SubLObject datum_$2 = $sym31$DATUM;
            return list(DO_FILE_LINES, list(line, testing_output_file), list(CLET, list(list(datum_$2, listS(READ_FROM_STRING_IGNORING_ERRORS, line, $list34))), list(PIF, list(CNOT, list(EBMT_TESTING_OUTPUT_DATUM_P, datum_$2)), list(WARN, $str39$Got_a_malformed_EBMT_testing_outp, line), listS(CDESTRUCTURING_BIND, list(nl, cycl, num_interps_per_example, test_result, time_taken, match_list, parsed_cycls, weights), datum_$2, append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list29);
        return NIL;
    }

    public static SubLObject ebmt_test_func(final SubLObject actual_ans, final SubLObject expected_ans) {
        return subl_promotions.memberP(expected_ans, actual_ans, $sym48$EQUALS_EL_, UNPROVIDED);
    }

    public static SubLObject ebmt_test_loop_single_corpus(final SubLObject test_dir, final SubLObject training_mt, final SubLObject testing_source, SubLObject training_every_nth, SubLObject testing_every_nth, SubLObject global_summaryP, SubLObject update_graphsP, SubLObject f_summary, SubLObject verboseP) {
        if (training_every_nth == UNPROVIDED) {
            training_every_nth = ONE_INTEGER;
        }
        if (testing_every_nth == UNPROVIDED) {
            testing_every_nth = ONE_INTEGER;
        }
        if (global_summaryP == UNPROVIDED) {
            global_summaryP = NIL;
        }
        if (update_graphsP == UNPROVIDED) {
            update_graphsP = NIL;
        }
        if (f_summary == UNPROVIDED) {
            f_summary = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Filesys.directory_p(test_dir)) {
            Filesys.make_directory(test_dir, UNPROVIDED, UNPROVIDED);
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str52$_error_output_txt), $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str54$Unable_to_open__S, cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str52$_error_output_txt));
            }
            final SubLObject s_out = stream;
            final SubLObject _prev_bind_0 = StreamsLow.$error_output$.currentBinding(thread);
            try {
                StreamsLow.$error_output$.bind(s_out, thread);
                ebmt_test_index_creation(test_dir, training_mt, training_every_nth, verboseP);
                ebmt_test_parsing_with_index(test_dir, testing_source, testing_every_nth);
            } finally {
                StreamsLow.$error_output$.rebind(_prev_bind_0, thread);
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
        if (testing_source.isString()) {
            f_summary = ebmt_create_summary(test_dir, training_mt, testing_source, global_summaryP, f_summary, $ebmt_scored_data_filename$.getGlobalValue());
        } else {
            f_summary = ebmt_create_summary(test_dir, training_mt, testing_source, global_summaryP, f_summary, UNPROVIDED);
        }
        return f_summary;
    }

    public static SubLObject ebmt_evaluation_ql_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_dir = cconcatenate($str55$_cyc_top_data_ebmt_testing_query_, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str56$_ });
        final SubLObject _prev_bind_0 = $ebmt_global_summary_file$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ebmt_training_recall_graph$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $ebmt_parsing_results_graph$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $ebmt_accuracy_graph$.currentBinding(thread);
        try {
            $ebmt_global_summary_file$.bind($str57$_cyc_top_data_ebmt_testing_query_, thread);
            $ebmt_training_recall_graph$.bind($str58$_cyc_top_data_ebmt_testing_query_, thread);
            $ebmt_parsing_results_graph$.bind($str59$_cyc_top_data_ebmt_testing_query_, thread);
            $ebmt_accuracy_graph$.bind($str60$_cyc_top_data_ebmt_testing_query_, thread);
            ebmt_test_loop_single_corpus(test_dir, $$EBMTTrainingExamplesFromQLMt, $$EBMTTrainingExamplesFromQLMt, ONE_INTEGER, ONE_INTEGER, T, T, UNPROVIDED, UNPROVIDED);
        } finally {
            $ebmt_accuracy_graph$.rebind(_prev_bind_4, thread);
            $ebmt_parsing_results_graph$.rebind(_prev_bind_3, thread);
            $ebmt_training_recall_graph$.rebind(_prev_bind_2, thread);
            $ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
        }
        return test_dir;
    }

    public static SubLObject ebmt_evaluation_financial_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_dir = cconcatenate($str62$_cyc_top_data_ebmt_testing_financ, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str56$_ });
        final SubLObject _prev_bind_0 = $ebmt_global_summary_file$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ebmt_training_recall_graph$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $ebmt_parsing_results_graph$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $ebmt_accuracy_graph$.currentBinding(thread);
        try {
            $ebmt_global_summary_file$.bind($str63$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_training_recall_graph$.bind($str64$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_parsing_results_graph$.bind($str65$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_accuracy_graph$.bind($str66$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_test_loop_single_corpus(test_dir, $const67$EBMTTrainingExamplesForWesternBus, $const67$EBMTTrainingExamplesForWesternBus, ONE_INTEGER, ONE_INTEGER, T, T, UNPROVIDED, UNPROVIDED);
        } finally {
            $ebmt_accuracy_graph$.rebind(_prev_bind_4, thread);
            $ebmt_parsing_results_graph$.rebind(_prev_bind_3, thread);
            $ebmt_training_recall_graph$.rebind(_prev_bind_2, thread);
            $ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
        }
        return test_dir;
    }

    public static SubLObject ebmt_evaluation_financial_file() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_dir = cconcatenate($str68$_cyc_top_data_ebmt_testing_financ, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str56$_ });
        final SubLObject _prev_bind_0 = $ebmt_global_summary_file$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ebmt_training_recall_graph$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $ebmt_parsing_results_graph$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $ebmt_accuracy_graph$.currentBinding(thread);
        try {
            $ebmt_global_summary_file$.bind($str69$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_training_recall_graph$.bind($str70$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_parsing_results_graph$.bind($str71$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_accuracy_graph$.bind($str72$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_test_loop_single_corpus(test_dir, $const67$EBMTTrainingExamplesForWesternBus, $str73$_cyc_top_data_ebmt_testing_financ, ONE_INTEGER, ONE_INTEGER, T, T, UNPROVIDED, UNPROVIDED);
        } finally {
            $ebmt_accuracy_graph$.rebind(_prev_bind_4, thread);
            $ebmt_parsing_results_graph$.rebind(_prev_bind_3, thread);
            $ebmt_training_recall_graph$.rebind(_prev_bind_2, thread);
            $ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
        }
        return test_dir;
    }

    public static SubLObject ebmt_possibly_update_keepalive_file() {
        return file_utilities.possibly_update_keepalive_file(ebmt_keepalive_filename());
    }

    public static SubLObject ebmt_keepalive_filename() {
        return NIL;
    }

    public static SubLObject ebmt_index_server_process(final SubLObject index_path) {
        final SubLObject program = $str74$_opt_local_pkg_j2sdk1_4_2_bin_jav;
        final SubLObject classpath = $str75$_home_shah_cvs_head_cycorp_cyc_ja;
        final SubLObject args = list($str76$_cp, classpath, $str77$com_cyc_common_nlp_EBMTTemplateIn, $str78$_i, cconcatenate(format_nil.format_nil_a_no_copy(index_path), $str79$_ebmt_index_));
        final SubLObject os_process = os_process_utilities.make_os_process($$$EBMT_Template_Index_Server, program, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sleep(FIVE_INTEGER);
        return os_process;
    }

    public static SubLObject ebmt_nl_cycl_pairs_from_source(SubLObject source, final SubLObject every_nth) {
        assert NIL != ebmt_testing_source_p(source) : "ebmt_tests.ebmt_testing_source_p(source) " + "CommonSymbols.NIL != ebmt_tests.ebmt_testing_source_p(source) " + source;
        if (source.isString()) {
            return ebmt_nl_cycl_pairs_from_file(source, every_nth);
        }
        return ebmt_nl_cycl_pairs_from_kb(source, every_nth);
    }

    public static SubLObject ebmt_nl_cycl_pairs_from_file(final SubLObject file, final SubLObject every_nth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pairs = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str54$Unable_to_open__S, file);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$3 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$3); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$3)) {
                    pairs = cons(list(line, NIL), pairs);
                    line_number_var = number_utilities.f_1X(line_number_var);
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
        return list_utilities.every_nth(every_nth, nreverse(pairs));
    }

    public static SubLObject ebmt_nl_cycl_pairs_from_kb(final SubLObject mt, final SubLObject every_nth) {
        return list_utilities.every_nth(every_nth, ask_utilities.query_template($list83, $list84, mt, UNPROVIDED));
    }

    public static SubLObject ebmt_test_index_creation(final SubLObject test_dir, final SubLObject training_mt, final SubLObject every_nth, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(test_dir) : "Types.stringp(test_dir) " + "CommonSymbols.NIL != Types.stringp(test_dir) " + test_dir;
        final SubLObject f_out = cconcatenate(test_dir, $ebmt_training_output_filename$.getGlobalValue());
        final SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lucene_index.$ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lucene_index.$ebmt_index_log$.currentBinding(thread);
        try {
            lucene_index.$ebmt_index_host$.bind($$$localhost, thread);
            lucene_index.$ebmt_index_content$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str87$_ebmt_index_txt), thread);
            lucene_index.$ebmt_index_log$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str88$_ebmt_index_log), thread);
            final SubLObject os_process = ebmt_index_server_process(test_dir);
            final SubLObject _prev_bind_0_$4 = $print_pretty$.currentBinding(thread);
            final SubLObject _prev_bind_1_$5 = $print_length$.currentBinding(thread);
            final SubLObject _prev_bind_2_$6 = $print_level$.currentBinding(thread);
            try {
                $print_pretty$.bind(NIL, thread);
                $print_length$.bind(NIL, thread);
                $print_level$.bind(NIL, thread);
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(f_out, $OUTPUT);
                    if (!stream.isStream()) {
                        Errors.error($str54$Unable_to_open__S, f_out);
                    }
                    final SubLObject s_out = stream;
                    final SubLObject list_var = ebmt_nl_cycl_pairs_from_source(training_mt, every_nth);
                    final SubLObject _prev_bind_0_$5 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$6 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$7 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind(NIL != cconcatenate($$$Processing_EBMT_data_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(training_mt), $str90$____ }) ? cconcatenate($$$Processing_EBMT_data_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(training_mt), $str90$____ }) : $$$cdolist, thread);
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
                            SubLObject pair = NIL;
                            pair = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = pair;
                                SubLObject nl = NIL;
                                SubLObject cycl = NIL;
                                destructuring_bind_must_consp(current, datum, $list92);
                                nl = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list92);
                                cycl = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    ebmt_possibly_update_keepalive_file();
                                    SubLObject num_general_templates = ZERO_INTEGER;
                                    SubLObject num_specific_templates = ZERO_INTEGER;
                                    SubLObject num_already_indexed_templates = ZERO_INTEGER;
                                    SubLObject num_failed_templates = ZERO_INTEGER;
                                    SubLObject templates = NIL;
                                    SubLObject nl_cycl_pairs = NIL;
                                    SubLObject time_taken = NIL;
                                    final SubLObject time_var = get_internal_real_time();
                                    templates = ebmt_template_parser.ebmt_create_and_add_templates(nl, cycl, ebmt_template_parser.new_ebmt_lexicon(UNPROVIDED), NIL, verboseP);
                                    time_taken = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    if (NIL == templates) {
                                        num_failed_templates = add(num_failed_templates, ONE_INTEGER);
                                    }
                                    SubLObject cdolist_list_var = templates;
                                    SubLObject template = NIL;
                                    template = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        nl_cycl_pairs = cons(ebmt_template_parser.ebmt_template_nl_cycl_pair(template), nl_cycl_pairs);
                                        final SubLObject indexing_result = ebmt_template_parser.ebmt_template_indexing_result(template);
                                        if (indexing_result.equal($$$Added)) {
                                            final SubLObject pcase_var = ebmt_template_parser.ebmt_template_type(template);
                                            if (pcase_var.eql($GENERAL)) {
                                                num_general_templates = add(num_general_templates, ONE_INTEGER);
                                            } else
                                                if (pcase_var.eql($SPECIFIC)) {
                                                    num_specific_templates = add(num_specific_templates, ONE_INTEGER);
                                                } else {
                                                    Errors.error($str96$Unexpected_type_of_EBMT_template_, ebmt_template_parser.ebmt_template_type(template));
                                                }

                                        } else
                                            if (indexing_result.equal($$$Already_indexed)) {
                                                num_already_indexed_templates = add(num_already_indexed_templates, ONE_INTEGER);
                                            } else {
                                                Errors.error($str98$Unexpected_indexing_result_of_EBM, indexing_result);
                                            }

                                        cdolist_list_var = cdolist_list_var.rest();
                                        template = cdolist_list_var.first();
                                    } 
                                    format(s_out, $str99$_S__, list(nl, cycl, nl_cycl_pairs, list(num_general_templates, num_specific_templates, num_already_indexed_templates, num_failed_templates), time_taken));
                                } else {
                                    cdestructuring_bind_error(datum, $list92);
                                }
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                pair = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_2_$7, thread);
                        $progress_start_time$.rebind(_prev_bind_1_$6, thread);
                        $progress_note$.rebind(_prev_bind_0_$5, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            } finally {
                $print_level$.rebind(_prev_bind_2_$6, thread);
                $print_length$.rebind(_prev_bind_1_$5, thread);
                $print_pretty$.rebind(_prev_bind_0_$4, thread);
            }
            os_process_utilities.kill_os_process(os_process);
        } finally {
            lucene_index.$ebmt_index_log$.rebind(_prev_bind_3, thread);
            lucene_index.$ebmt_index_content$.rebind(_prev_bind_2, thread);
            lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        return f_out;
    }

    public static SubLObject ebmt_test_parsing_with_index(final SubLObject test_dir, SubLObject source, final SubLObject every_nth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(test_dir) : "Types.stringp(test_dir) " + "CommonSymbols.NIL != Types.stringp(test_dir) " + test_dir;
        assert NIL != ebmt_testing_source_p(source) : "ebmt_tests.ebmt_testing_source_p(source) " + "CommonSymbols.NIL != ebmt_tests.ebmt_testing_source_p(source) " + source;
        final SubLObject f_out = cconcatenate(test_dir, $ebmt_testing_output_filename$.getGlobalValue());
        final SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lucene_index.$ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lucene_index.$ebmt_index_log$.currentBinding(thread);
        try {
            lucene_index.$ebmt_index_host$.bind($$$localhost, thread);
            lucene_index.$ebmt_index_content$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str87$_ebmt_index_txt), thread);
            lucene_index.$ebmt_index_log$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str88$_ebmt_index_log), thread);
            final SubLObject os_process = ebmt_index_server_process(test_dir);
            final SubLObject _prev_bind_0_$12 = $print_pretty$.currentBinding(thread);
            final SubLObject _prev_bind_1_$13 = $print_length$.currentBinding(thread);
            final SubLObject _prev_bind_2_$14 = $print_level$.currentBinding(thread);
            try {
                $print_pretty$.bind(NIL, thread);
                $print_length$.bind(NIL, thread);
                $print_level$.bind(NIL, thread);
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(f_out, $OUTPUT);
                    if (!stream.isStream()) {
                        Errors.error($str54$Unable_to_open__S, f_out);
                    }
                    final SubLObject s_out = stream;
                    final SubLObject list_var = ebmt_nl_cycl_pairs_from_source(source, every_nth);
                    final SubLObject _prev_bind_0_$13 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$14 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$15 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind(NIL != cconcatenate($$$Processing_EBMT_data_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(source), $str90$____ }) ? cconcatenate($$$Processing_EBMT_data_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(source), $str90$____ }) : $$$cdolist, thread);
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
                            SubLObject pair = NIL;
                            pair = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = pair;
                                SubLObject nl = NIL;
                                SubLObject cycl = NIL;
                                destructuring_bind_must_consp(current, datum, $list92);
                                nl = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list92);
                                cycl = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    ebmt_possibly_update_keepalive_file();
                                    final SubLObject target_cycl = (NIL != cycl) ? ebmt_template_parser.ebmt_canonicalize_el_sentence(cycl, $$InferencePSC) : NIL;
                                    SubLObject parsed_cycls = NIL;
                                    SubLObject justifications = NIL;
                                    SubLObject weights = NIL;
                                    SubLObject time_taken = NIL;
                                    final SubLObject time_var = get_internal_real_time();
                                    thread.resetMultipleValues();
                                    final SubLObject parsed_cycls_$18 = ebmt_template_parser.ebmt_parse(ebmt_template_parser.ebmt_remove_ignore_markers(nl), UNPROVIDED, UNPROVIDED);
                                    final SubLObject justifications_$19 = thread.secondMultipleValue();
                                    final SubLObject weights_$20 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    parsed_cycls = parsed_cycls_$18;
                                    justifications = justifications_$19;
                                    weights = weights_$20;
                                    time_taken = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    parsed_cycls = Mapping.mapcar(HL_TO_EL, parsed_cycls);
                                    final SubLObject unique_interpretation_count = length(remove_duplicates(parsed_cycls, symbol_function($sym48$EQUALS_EL_), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    thread.resetMultipleValues();
                                    final SubLObject match_list = ebmt_compute_match_list_and_result(parsed_cycls, target_cycl);
                                    final SubLObject result = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    write_one_line_to_ebmt_testing_output_file(s_out, nl, cycl, unique_interpretation_count, result, time_taken, match_list, parsed_cycls, weights);
                                } else {
                                    cdestructuring_bind_error(datum, $list92);
                                }
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                pair = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_2_$15, thread);
                        $progress_start_time$.rebind(_prev_bind_1_$14, thread);
                        $progress_note$.rebind(_prev_bind_0_$13, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                $print_level$.rebind(_prev_bind_2_$14, thread);
                $print_length$.rebind(_prev_bind_1_$13, thread);
                $print_pretty$.rebind(_prev_bind_0_$12, thread);
            }
            os_process_utilities.kill_os_process(os_process);
        } finally {
            lucene_index.$ebmt_index_log$.rebind(_prev_bind_3, thread);
            lucene_index.$ebmt_index_content$.rebind(_prev_bind_2, thread);
            lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        return f_out;
    }

    public static SubLObject ebmt_testing_source_p(final SubLObject v_object) {
        return makeBoolean((NIL != hlmt.hlmtP(v_object)) || (NIL != file_utilities.file_existsP(v_object)));
    }

    public static SubLObject ebmt_compute_match_list_and_result(final SubLObject parsed_cycls, final SubLObject target_cycl) {
        SubLObject match_list = NIL;
        SubLObject result = $FAILURE;
        SubLObject cdolist_list_var = parsed_cycls;
        SubLObject parsed_cycl = NIL;
        parsed_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != czer_utilities.equals_elP(target_cycl, parsed_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                result = $SUCCESS;
                match_list = cons(ONE_INTEGER, match_list);
            } else {
                match_list = cons(ZERO_INTEGER, match_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parsed_cycl = cdolist_list_var.first();
        } 
        match_list = nreverse(match_list);
        return values(match_list, result);
    }

    public static SubLObject write_one_line_to_ebmt_testing_output_file(final SubLObject s_out, final SubLObject nl, final SubLObject cycl, final SubLObject unique_interpretation_count, final SubLObject result, final SubLObject time, final SubLObject match_list, final SubLObject parsed_cycls, final SubLObject weights) {
        final SubLObject out_line = list(nl, cycl, unique_interpretation_count, result, time, match_list, parsed_cycls, weights);
        format(s_out, $str99$_S__, out_line);
        return NIL;
    }

    public static SubLObject ebmt_training_summary_plist(final SubLObject test_dir, final SubLObject training_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num_user_training_examples = ZERO_INTEGER;
        SubLObject num_training_examples = ZERO_INTEGER;
        SubLObject num_failed_templates = ZERO_INTEGER;
        SubLObject num_already_indexed_templates = ZERO_INTEGER;
        SubLObject num_specific_templates = ZERO_INTEGER;
        SubLObject num_general_templates = ZERO_INTEGER;
        SubLObject total_training_time = ZERO_INTEGER;
        SubLObject min_training_time = $int$100;
        SubLObject max_training_time = ZERO_INTEGER;
        final SubLObject training_output = cconcatenate(test_dir, $ebmt_training_output_filename$.getGlobalValue());
        SubLObject num_templates = NIL;
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
                noting_percent_progress_preamble($str105$Summarizing_EBMT_training_details);
                final SubLObject file_var = training_output;
                SubLObject stream = NIL;
                try {
                    final SubLObject _prev_bind_0_$23 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream = compatibility.open_text(file_var, $INPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$23, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error($str54$Unable_to_open__S, file_var);
                    }
                    final SubLObject stream_var = stream;
                    if (stream_var.isStream()) {
                        final SubLObject length_var = file_length(stream_var);
                        final SubLObject stream_var_$24 = stream_var;
                        SubLObject line_number_var = NIL;
                        SubLObject file_line = NIL;
                        line_number_var = ZERO_INTEGER;
                        for (file_line = file_utilities.do_stream_lines_get_next_line(stream_var_$24); NIL != file_line; file_line = file_utilities.do_stream_lines_get_next_line(stream_var_$24)) {
                            final SubLObject line = read_from_string(file_line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject all_training_examples = third(line);
                            final SubLObject num_template_types = fourth(line);
                            final SubLObject time_taken = fifth(line);
                            num_user_training_examples = add(num_user_training_examples, ONE_INTEGER);
                            num_training_examples = add(num_training_examples, length(all_training_examples));
                            num_general_templates = add(num_general_templates, num_template_types.first());
                            num_specific_templates = add(num_specific_templates, second(num_template_types));
                            num_already_indexed_templates = add(num_already_indexed_templates, third(num_template_types));
                            num_failed_templates = add(num_failed_templates, fourth(num_template_types));
                            total_training_time = add(total_training_time, time_taken);
                            if (time_taken.numL(min_training_time)) {
                                min_training_time = time_taken;
                            }
                            if (time_taken.numG(max_training_time)) {
                                max_training_time = time_taken;
                            }
                            note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
                            line_number_var = number_utilities.f_1X(line_number_var);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        num_templates = add(new SubLObject[]{ num_general_templates, num_specific_templates, num_already_indexed_templates, num_failed_templates });
        return list(new SubLObject[]{ $TRAINING_INPUT_MT, training_mt, $USER_TRAINING_EXAMPLES, num_user_training_examples, $TRAINING_EXAMPLES, num_training_examples, $GENERAL_TEMPLATES, num_general_templates, $GENERAL_TEMPLATES_PC, number_utilities.percent(num_general_templates, num_templates, UNPROVIDED), $SPECIFIC_TEMPLATES, num_specific_templates, $SPECIFIC_TEMPLATES_PC, number_utilities.percent(num_specific_templates, num_templates, UNPROVIDED), $NO_TEMPLATES, num_failed_templates, $NO_TEMPLATES_PC, number_utilities.percent(num_failed_templates, num_templates, UNPROVIDED), $DUPLICATE_TEMPLATES, num_already_indexed_templates, $DUPLICATE_TEMPLATES_PC, number_utilities.percent(num_already_indexed_templates, num_templates, UNPROVIDED), $TOTAL_TRAINING_TIME, total_training_time, $MIN_TRAINING_TIME, min_training_time, $MAX_TRAINING_TIME, max_training_time });
    }

    public static SubLObject ebmt_testing_output_datum_p(final SubLObject v_object) {
        return list_utilities.list_of_length_p(v_object, EIGHT_INTEGER, UNPROVIDED);
    }

    public static SubLObject ebmt_testing_summary_plist(final SubLObject test_dir, final SubLObject testing_source, final SubLObject testing_output_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num_examples = ZERO_INTEGER;
        SubLObject num_successful = ZERO_INTEGER;
        SubLObject num_almost_successful = ZERO_INTEGER;
        SubLObject num_unknown = ZERO_INTEGER;
        SubLObject num_failed = ZERO_INTEGER;
        SubLObject num_interps = ZERO_INTEGER;
        SubLObject max_interps_per_example = ZERO_INTEGER;
        SubLObject interps_per_example = NIL;
        final SubLObject num_top = make_vector(FIVE_INTEGER, ZERO_INTEGER);
        SubLObject total_testing_time = ZERO_INTEGER;
        SubLObject total_successful_time = ZERO_INTEGER;
        SubLObject total_almost_successful_time = ZERO_INTEGER;
        SubLObject total_unknown_time = ZERO_INTEGER;
        SubLObject total_failed_time = ZERO_INTEGER;
        SubLObject max_time_per_example = ZERO_INTEGER;
        SubLObject time_per_example = NIL;
        final SubLObject file_var;
        final SubLObject testing_output = file_var = cconcatenate(test_dir, testing_output_filename);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file_var, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str54$Unable_to_open__S, file_var);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$27 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$27); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$27)) {
                    final SubLObject datum = read_from_string_ignoring_errors(line, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == ebmt_testing_output_datum_p(datum)) {
                        Errors.warn($str39$Got_a_malformed_EBMT_testing_outp, line);
                    } else {
                        SubLObject current;
                        final SubLObject datum_$28 = current = datum;
                        SubLObject nl = NIL;
                        SubLObject cycl = NIL;
                        SubLObject num_interps_per_example = NIL;
                        SubLObject test_result = NIL;
                        SubLObject time_taken = NIL;
                        SubLObject match_list = NIL;
                        SubLObject parsed_cycls = NIL;
                        SubLObject weights = NIL;
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        nl = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        cycl = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        num_interps_per_example = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        test_result = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        time_taken = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        match_list = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        parsed_cycls = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        weights = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            SubLObject doneP = NIL;
                            SubLObject match_value = NIL;
                            num_examples = add(num_examples, ONE_INTEGER);
                            final SubLObject pcase_var = test_result;
                            if (pcase_var.eql($SUCCESS)) {
                                num_successful = add(num_successful, ONE_INTEGER);
                                total_successful_time = add(total_successful_time, time_taken);
                            } else
                                if (pcase_var.eql($ALMOST)) {
                                    num_almost_successful = add(num_almost_successful, ONE_INTEGER);
                                    total_almost_successful_time = add(total_almost_successful_time, time_taken);
                                } else
                                    if (pcase_var.eql($UNKNOWN)) {
                                        num_unknown = add(num_unknown, ONE_INTEGER);
                                        total_unknown_time = add(total_unknown_time, time_taken);
                                    } else
                                        if (pcase_var.eql($FAILURE)) {
                                            num_failed = add(num_failed, ONE_INTEGER);
                                            total_failed_time = add(total_failed_time, time_taken);
                                        } else {
                                            Errors.error($str123$Unexpected_EBMT_result__s, test_result);
                                        }



                            num_interps = add(num_interps, num_interps_per_example);
                            if (num_interps_per_example.numG(max_interps_per_example)) {
                                max_interps_per_example = num_interps_per_example;
                            }
                            interps_per_example = cons(num_interps_per_example, interps_per_example);
                            SubLObject list_var = NIL;
                            SubLObject match_item = NIL;
                            SubLObject i = NIL;
                            list_var = match_list;
                            match_item = list_var.first();
                            for (i = ZERO_INTEGER; (NIL == doneP) && (NIL != list_var); list_var = list_var.rest() , match_item = list_var.first() , i = add(ONE_INTEGER, i)) {
                                if (match_item.numE(ONE_INTEGER)) {
                                    doneP = T;
                                    match_value = i;
                                }
                            }
                            doneP = NIL;
                            if ((NIL != match_value) && match_value.numL(FIVE_INTEGER)) {
                                final SubLObject vector_var = num_top;
                                final SubLObject backwardP_var = T;
                                final SubLObject length = length(vector_var);
                                SubLObject current_$30;
                                final SubLObject datum_$29 = current_$30 = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                                SubLObject start = NIL;
                                SubLObject end = NIL;
                                SubLObject delta = NIL;
                                destructuring_bind_must_consp(current_$30, datum_$29, $list124);
                                start = current_$30.first();
                                current_$30 = current_$30.rest();
                                destructuring_bind_must_consp(current_$30, datum_$29, $list124);
                                end = current_$30.first();
                                current_$30 = current_$30.rest();
                                destructuring_bind_must_consp(current_$30, datum_$29, $list124);
                                delta = current_$30.first();
                                current_$30 = current_$30.rest();
                                if (NIL == current_$30) {
                                    if (NIL == doneP) {
                                        SubLObject end_var;
                                        SubLObject key;
                                        SubLObject value;
                                        for (end_var = end, key = NIL, key = start; (NIL == doneP) && (NIL == subl_macros.do_numbers_endtest(key, delta, end_var)); key = add(key, delta)) {
                                            value = aref(vector_var, key);
                                            value = add(value, ONE_INTEGER);
                                            set_aref(num_top, key, value);
                                            if (key.numE(match_value)) {
                                                doneP = T;
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_$29, $list124);
                                }
                            }
                            total_testing_time = add(total_testing_time, time_taken);
                            if (time_taken.numG(max_time_per_example)) {
                                max_time_per_example = time_taken;
                            }
                            time_per_example = cons(time_taken, time_per_example);
                        } else {
                            cdestructuring_bind_error(datum_$28, $list120);
                        }
                    }
                    line_number_var = number_utilities.f_1X(line_number_var);
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
        final SubLObject plist = list(new SubLObject[]{ $FUNCTION, EBMT_PARSE, $TESTING_INPUT_SOURCE, testing_source, $TEST_EXAMPLES, num_examples, $SUCCESSFUL_TESTS, num_successful, $SUCCESSFUL_TESTS_PC, number_utilities.percent(num_successful, num_examples, UNPROVIDED), $ALMOST_SUCCESSFUL_TESTS, num_almost_successful, $ALMOST_SUCCESSFUL_TESTS_PC, number_utilities.percent(num_almost_successful, num_examples, UNPROVIDED), $UNKNOWN_TESTS, num_unknown, $UNKNOWN_TESTS_PC, number_utilities.percent(num_unknown, num_examples, UNPROVIDED), $FAILED_TESTS, num_failed, $FAILED_TESTS_PC, number_utilities.percent(num_failed, num_examples, UNPROVIDED), $TOTAL_UNIQUE_INTERPS, num_interps, $MAX_INTERPS_PER_EXAMPLE, max_interps_per_example, $MEAN_INTERPS_PER_EXAMPLE, number_utilities.mean(interps_per_example), $MEDIAN_INTERPS_PER_EXAMPLE, number_utilities.median(interps_per_example, UNPROVIDED, UNPROVIDED), $TOTAL_TESTING_TIME, total_testing_time, $TOTAL_SUCCESSFUL_TIME, total_successful_time, $TOTAL_ALMOST_SUCCESSFUL_TIME, total_almost_successful_time, $TOTAL_UNKNOWN_TIME, total_unknown_time, $TOTAL_FAILED_TIME, total_failed_time, $MAX_TIME_PER_EXAMPLE, max_time_per_example, $MEAN_TIME_PER_EXAMPLE, number_utilities.mean(time_per_example), $MEDIAN_TIME_PER_EXAMPLE, number_utilities.median(time_per_example, UNPROVIDED, UNPROVIDED), $TOP1, aref(num_top, ZERO_INTEGER), $TOP2, aref(num_top, ONE_INTEGER), $TOP3, aref(num_top, TWO_INTEGER), $TOP4, aref(num_top, THREE_INTEGER), $TOP5, aref(num_top, FOUR_INTEGER) });
        return plist;
    }

    public static SubLObject ebmt_create_summary(final SubLObject test_dir, final SubLObject training_mt, final SubLObject testing_source, final SubLObject global_summaryP, final SubLObject f_summary, SubLObject testing_output_filename) {
        if (testing_output_filename == UNPROVIDED) {
            testing_output_filename = $ebmt_testing_output_filename$.getGlobalValue();
        }
        final SubLObject summary_plist = ebmt_summary_plist(test_dir, training_mt, testing_source, testing_output_filename);
        return ebmt_output_summary_plist(summary_plist, test_dir, global_summaryP, f_summary);
    }

    public static SubLObject ebmt_summary_plist(final SubLObject test_dir, final SubLObject training_mt, final SubLObject testing_source, final SubLObject testing_output_filename) {
        SubLObject summary_plist = NIL;
        summary_plist = putf(summary_plist, $TIMESTAMP, numeric_date_utilities.universal_timestring(UNPROVIDED));
        summary_plist = putf(summary_plist, $KB, kb_loaded());
        summary_plist = putf(summary_plist, $SYSTEM, system_info.cyc_revision_string());
        summary_plist = putf(summary_plist, $HOST, Environment.get_machine_name(UNPROVIDED));
        summary_plist = putf(summary_plist, $BOGOMIPS, misc_utilities.machine_bogomips());
        summary_plist = list_utilities.merge_plist(summary_plist, ebmt_training_summary_plist(test_dir, training_mt));
        summary_plist = list_utilities.merge_plist(summary_plist, ebmt_testing_summary_plist(test_dir, testing_source, testing_output_filename));
        return summary_plist;
    }

    public static SubLObject ebmt_output_summary_plist(final SubLObject summary_plist, final SubLObject test_dir, final SubLObject global_summaryP, SubLObject f_summary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == f_summary) {
            f_summary = cconcatenate(test_dir, $str157$summary_txt);
        }
        final SubLObject f_summary_plist = cconcatenate(test_dir, $str158$summary_plist_lisp);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_level$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(f_summary_plist, $OUTPUT);
                if (!stream.isStream()) {
                    Errors.error($str54$Unable_to_open__S, f_summary_plist);
                }
                final SubLObject s_summary_plist = stream;
                format(s_summary_plist, $str159$_s__, summary_plist);
            } finally {
                final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        } finally {
            $print_level$.rebind(_prev_bind_3, thread);
            $print_length$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        SubLObject stream2 = NIL;
        try {
            stream2 = compatibility.open_text(f_summary, $APPEND);
            if (!stream2.isStream()) {
                Errors.error($str54$Unable_to_open__S, f_summary);
            }
            final SubLObject s_summary = stream2;
            list_utilities.pretty_print_plist(summary_plist, s_summary);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream2.isStream()) {
                    close(stream2, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        if (NIL != global_summaryP) {
            final SubLObject _prev_bind_5 = $print_pretty$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $print_length$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $print_level$.currentBinding(thread);
            try {
                $print_pretty$.bind(NIL, thread);
                $print_length$.bind(NIL, thread);
                $print_level$.bind(NIL, thread);
                SubLObject stream3 = NIL;
                try {
                    stream3 = compatibility.open_text($ebmt_global_summary_file$.getDynamicValue(thread), $APPEND);
                    if (!stream3.isStream()) {
                        Errors.error($str54$Unable_to_open__S, $ebmt_global_summary_file$.getDynamicValue(thread));
                    }
                    final SubLObject s_summary2 = stream3;
                    format(s_summary2, $str159$_s__, summary_plist);
                } finally {
                    final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        if (stream3.isStream()) {
                            close(stream3, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            } finally {
                $print_level$.rebind(_prev_bind_7, thread);
                $print_length$.rebind(_prev_bind_6, thread);
                $print_pretty$.rebind(_prev_bind_5, thread);
            }
        }
        return f_summary;
    }

    public static SubLObject get_ebmt_plot_value(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return getf($ebmt_plot_params$.getDynamicValue(thread), keyword, UNPROVIDED);
    }

    public static SubLObject ground_plot_data_formula(SubLObject formula, final SubLObject plot_params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $ebmt_plot_params$.currentBinding(thread);
        try {
            $ebmt_plot_params$.bind(plot_params, thread);
            formula = transform_list_utilities.transform(formula, KEYWORDP, GET_EBMT_PLOT_VALUE, UNPROVIDED);
            result = eval(formula);
        } finally {
            $ebmt_plot_params$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject ebmt_report(final SubLObject input_file, final SubLObject report_data, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_data_types = getf(report_data, $RAW_DATA_TYPES, UNPROVIDED);
        final SubLObject computed_data_types = getf(report_data, $COMPUTED_DATA_TYPES, UNPROVIDED);
        final SubLObject defaults = $list165;
        final SubLObject augmented_report_data = list_utilities.augment_plist_with_defaults(report_data, defaults);
        SubLObject plot_properties = list_utilities.plist_restricted_to_indicators(augmented_report_data, $list166);
        final SubLObject data = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject data_keywords = NIL;
        SubLObject computed_data_type_data = NIL;
        SubLObject line_labels = NIL;
        SubLObject plot_data = NIL;
        if (NIL != output_file) {
            plot_properties = putf(plot_properties, $OUTPUT_FILE, output_file);
        }
        SubLObject remainder;
        SubLObject keyword;
        SubLObject line_label;
        for (remainder = NIL, remainder = raw_data_types; NIL != remainder; remainder = cddr(remainder)) {
            keyword = remainder.first();
            line_label = cadr(remainder);
            line_labels = cons(line_label, line_labels);
            data_keywords = cons(keyword, data_keywords);
        }
        SubLObject label_and_formula;
        SubLObject current;
        SubLObject datum;
        SubLObject line_label2;
        SubLObject formula;
        for (remainder = NIL, remainder = computed_data_types; NIL != remainder; remainder = cddr(remainder)) {
            keyword = remainder.first();
            label_and_formula = cadr(remainder);
            datum = current = label_and_formula;
            line_label2 = NIL;
            formula = NIL;
            destructuring_bind_must_consp(current, datum, $list168);
            line_label2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list168);
            formula = current.first();
            current = current.rest();
            if (NIL == current) {
                line_labels = cons(line_label2, line_labels);
                data_keywords = cons(keyword, data_keywords);
                computed_data_type_data = cons(list(keyword, formula), computed_data_type_data);
            } else {
                cdestructuring_bind_error(datum, $list168);
            }
        }
        plot_properties = putf(plot_properties, $LINE_LABELS, line_labels);
        SubLObject line_number = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(input_file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str54$Unable_to_open__S, input_file);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject test_run_summary;
                SubLObject test_run_plist;
                SubLObject kb;
                SubLObject test_run_id;
                SubLObject plot_xtic_string;
                SubLObject remainder2;
                SubLObject keyword2;
                SubLObject value;
                SubLObject cdolist_list_var;
                SubLObject computed_data;
                SubLObject current2;
                SubLObject datum2;
                SubLObject keyword3;
                SubLObject formula2;
                SubLObject value2;
                for (test_run_summary = NIL, test_run_summary = file_utilities.cdolines_get_next_line(infile); NIL != test_run_summary; test_run_summary = file_utilities.cdolines_get_next_line(infile)) {
                    line_number = add(line_number, ONE_INTEGER);
                    test_run_plist = read_from_string_ignoring_errors(test_run_summary, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (test_run_plist != $EOF) {
                        kb = getf(test_run_plist, $KB, UNPROVIDED);
                        test_run_id = line_number;
                        plot_xtic_string = cconcatenate(format_nil.format_nil_a_no_copy(kb), new SubLObject[]{ $str171$_n, format_nil.format_nil_a_no_copy(getf(test_run_plist, $TIMESTAMP, UNPROVIDED)) });
                        plot_properties = putf(plot_properties, $XTICS, cons(list(plot_xtic_string, line_number), getf(plot_properties, $XTICS, UNPROVIDED)));
                        for (remainder2 = NIL, remainder2 = raw_data_types; NIL != remainder2; remainder2 = cddr(remainder2)) {
                            keyword2 = remainder2.first();
                            value = cadr(remainder2);
                            dictionary_utilities.dictionary_push(data, keyword2, list(test_run_id, getf(test_run_plist, keyword2, UNPROVIDED)));
                        }
                        cdolist_list_var = computed_data_type_data;
                        computed_data = NIL;
                        computed_data = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            datum2 = current2 = computed_data;
                            keyword3 = NIL;
                            formula2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list173);
                            keyword3 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list173);
                            formula2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                value2 = list(test_run_id, ground_plot_data_formula(formula2, test_run_plist));
                                dictionary_utilities.dictionary_push(data, keyword3, value2);
                            } else {
                                cdestructuring_bind_error(datum2, $list173);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            computed_data = cdolist_list_var.first();
                        } 
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
        SubLObject cdolist_list_var2 = data_keywords;
        SubLObject data_keyword = NIL;
        data_keyword = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            plot_data = cons(dictionary.dictionary_lookup(data, data_keyword, UNPROVIDED), plot_data);
            cdolist_list_var2 = cdolist_list_var2.rest();
            data_keyword = cdolist_list_var2.first();
        } 
        plot_data = nreverse(plot_data);
        return plot_generation.generate_lines_graph(plot_data, plot_properties);
    }

    public static SubLObject ebmt_training_recall_report(final SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return ebmt_report(input_file, $list174, output_file);
    }

    public static SubLObject ebmt_timing_report(final SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return ebmt_report(input_file, $list175, output_file);
    }

    public static SubLObject ebmt_accuracy_report(final SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return ebmt_report(input_file, $list176, output_file);
    }

    public static SubLObject ebmt_parsing_results(final SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return ebmt_report(input_file, $list177, output_file);
    }

    public static SubLObject ebmt_update_evaluation_graphs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ebmt_training_recall_report($ebmt_global_summary_file$.getDynamicValue(thread), $ebmt_training_recall_graph$.getDynamicValue(thread));
        ebmt_accuracy_report($ebmt_global_summary_file$.getDynamicValue(thread), $ebmt_accuracy_graph$.getDynamicValue(thread));
        ebmt_parsing_results($ebmt_global_summary_file$.getDynamicValue(thread), $ebmt_parsing_results_graph$.getDynamicValue(thread));
        return $EBMT_GRAPHS_UPDATED;
    }

    public static SubLObject declare_ebmt_tests_file() {
        declareMacro(me, "with_standard_ebmt_testing_state", "WITH-STANDARD-EBMT-TESTING-STATE");
        declareMacro(me, "do_ebmt_nl_cycl_pairs_from_source", "DO-EBMT-NL-CYCL-PAIRS-FROM-SOURCE");
        declareMacro(me, "ebmt_do_testing_output_data_from_file", "EBMT-DO-TESTING-OUTPUT-DATA-FROM-FILE");
        declareFunction(me, "ebmt_test_func", "EBMT-TEST-FUNC", 2, 0, false);
        declareFunction(me, "ebmt_test_loop_single_corpus", "EBMT-TEST-LOOP-SINGLE-CORPUS", 3, 6, false);
        declareFunction(me, "ebmt_evaluation_ql_mt", "EBMT-EVALUATION-QL-MT", 0, 0, false);
        declareFunction(me, "ebmt_evaluation_financial_mt", "EBMT-EVALUATION-FINANCIAL-MT", 0, 0, false);
        declareFunction(me, "ebmt_evaluation_financial_file", "EBMT-EVALUATION-FINANCIAL-FILE", 0, 0, false);
        declareFunction(me, "ebmt_possibly_update_keepalive_file", "EBMT-POSSIBLY-UPDATE-KEEPALIVE-FILE", 0, 0, false);
        declareFunction(me, "ebmt_keepalive_filename", "EBMT-KEEPALIVE-FILENAME", 0, 0, false);
        declareFunction(me, "ebmt_index_server_process", "EBMT-INDEX-SERVER-PROCESS", 1, 0, false);
        declareFunction(me, "ebmt_nl_cycl_pairs_from_source", "EBMT-NL-CYCL-PAIRS-FROM-SOURCE", 2, 0, false);
        declareFunction(me, "ebmt_nl_cycl_pairs_from_file", "EBMT-NL-CYCL-PAIRS-FROM-FILE", 2, 0, false);
        declareFunction(me, "ebmt_nl_cycl_pairs_from_kb", "EBMT-NL-CYCL-PAIRS-FROM-KB", 2, 0, false);
        declareFunction(me, "ebmt_test_index_creation", "EBMT-TEST-INDEX-CREATION", 3, 1, false);
        declareFunction(me, "ebmt_test_parsing_with_index", "EBMT-TEST-PARSING-WITH-INDEX", 3, 0, false);
        declareFunction(me, "ebmt_testing_source_p", "EBMT-TESTING-SOURCE-P", 1, 0, false);
        declareFunction(me, "ebmt_compute_match_list_and_result", "EBMT-COMPUTE-MATCH-LIST-AND-RESULT", 2, 0, false);
        declareFunction(me, "write_one_line_to_ebmt_testing_output_file", "WRITE-ONE-LINE-TO-EBMT-TESTING-OUTPUT-FILE", 9, 0, false);
        declareFunction(me, "ebmt_training_summary_plist", "EBMT-TRAINING-SUMMARY-PLIST", 2, 0, false);
        declareFunction(me, "ebmt_testing_output_datum_p", "EBMT-TESTING-OUTPUT-DATUM-P", 1, 0, false);
        declareFunction(me, "ebmt_testing_summary_plist", "EBMT-TESTING-SUMMARY-PLIST", 3, 0, false);
        declareFunction(me, "ebmt_create_summary", "EBMT-CREATE-SUMMARY", 5, 1, false);
        declareFunction(me, "ebmt_summary_plist", "EBMT-SUMMARY-PLIST", 4, 0, false);
        declareFunction(me, "ebmt_output_summary_plist", "EBMT-OUTPUT-SUMMARY-PLIST", 4, 0, false);
        declareFunction(me, "get_ebmt_plot_value", "GET-EBMT-PLOT-VALUE", 1, 0, false);
        declareFunction(me, "ground_plot_data_formula", "GROUND-PLOT-DATA-FORMULA", 2, 0, false);
        declareFunction(me, "ebmt_report", "EBMT-REPORT", 2, 1, false);
        declareFunction(me, "ebmt_training_recall_report", "EBMT-TRAINING-RECALL-REPORT", 1, 1, false);
        declareFunction(me, "ebmt_timing_report", "EBMT-TIMING-REPORT", 1, 1, false);
        declareFunction(me, "ebmt_accuracy_report", "EBMT-ACCURACY-REPORT", 1, 1, false);
        declareFunction(me, "ebmt_parsing_results", "EBMT-PARSING-RESULTS", 1, 1, false);
        declareFunction(me, "ebmt_update_evaluation_graphs", "EBMT-UPDATE-EVALUATION-GRAPHS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_ebmt_tests_file() {
        deflexical("*EBMT-TRAINING-OUTPUT-FILENAME*", $str0$training_output_txt);
        deflexical("*EBMT-TESTING-OUTPUT-FILENAME*", $str1$testing_output_txt);
        deflexical("*EBMT-NOT-YET-SCORED-LINES-FILENAME*", $str2$to_be_scored_lines_txt);
        deflexical("*EBMT-SCORED-LINES-FILENAME*", $str3$scored_lines_txt);
        deflexical("*EBMT-SCORED-DATA-FILENAME*", $str4$scored_data_txt);
        defparameter("*EBMT-KEEPALIVE-ENABLED?*", NIL);
        defparameter("*EBMT-GLOBAL-SUMMARY-FILE*", $str5$);
        defparameter("*EBMT-TRAINING-RECALL-GRAPH*", $str5$);
        defparameter("*EBMT-PARSING-RESULTS-GRAPH*", $str5$);
        defparameter("*EBMT-ACCURACY-GRAPH*", $str5$);
        defparameter("*EBMT-PLOT-PARAMS*", NIL);
        return NIL;
    }

    public static SubLObject setup_ebmt_tests_file() {
        define_test_case_table_int(EBMT_CANONICALIZE_EL_SENTENCE, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list47);
        define_test_case_table_int(EBMT_PARSE, list(new SubLObject[]{ $TEST, symbol_function(EBMT_TEST_FUNC), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list51);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ebmt_tests_file();
    }

    @Override
    public void initializeVariables() {
        init_ebmt_tests_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ebmt_tests_file();
    }

    
}

/**
 * Total time: 882 ms
 */
