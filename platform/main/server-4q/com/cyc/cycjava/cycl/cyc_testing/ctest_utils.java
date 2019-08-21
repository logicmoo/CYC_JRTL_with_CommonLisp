package com.cyc.cycjava.cycl.cyc_testing;


import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_testing.ctest_utils;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_identifier;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.ctest_utils.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINETEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class ctest_utils extends SubLTranslatedFile {
    public static final SubLFile me = new ctest_utils();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.ctest_utils";

    public static final String myFingerPrint = "0ad818adf251d98a103d124a4b13fd2ef70b07d8ea2de1448134e943fcdc23c3";









    // deflexical
    public static final SubLSymbol $default_binding_set2$ = makeSymbol("*DEFAULT-BINDING-SET2*");



    // deflexical
    public static final SubLSymbol $default_set_of_binding_sets2$ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS2*");

    // deflexical
    public static final SubLSymbol $default_set_of_binding_sets3$ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS3*");





    // deflexical
    public static final SubLSymbol $default_module_mt2$ = makeSymbol("*DEFAULT-MODULE-MT2*");



    // deflexical
    public static final SubLSymbol $default_dependency_test_id2$ = makeSymbol("*DEFAULT-DEPENDENCY-TEST-ID2*");



    // deflexical
    public static final SubLSymbol $default_isa_id2$ = makeSymbol("*DEFAULT-ISA-ID2*");







    // defconstant
    public static final SubLSymbol $ctest_output_formats$ = makeSymbol("*CTEST-OUTPUT-FORMATS*");

    // defconstant
    public static final SubLSymbol $ctest_output_styles$ = makeSymbol("*CTEST-OUTPUT-STYLES*");

    // defconstant
    public static final SubLSymbol $max_test_retry_time$ = makeSymbol("*MAX-TEST-RETRY-TIME*");

    // defconstant
    public static final SubLSymbol $csc_table_name$ = makeSymbol("*CSC-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_image_type_len$ = makeSymbol("*MAX-IMAGE-TYPE-LEN*");

    // defconstant
    public static final SubLSymbol $max_image_version_len$ = makeSymbol("*MAX-IMAGE-VERSION-LEN*");

    // defconstant
    public static final SubLSymbol $max_system_version_num_len$ = makeSymbol("*MAX-SYSTEM-VERSION-NUM-LEN*");

    // defconstant
    public static final SubLSymbol $max_kb_number_len$ = makeSymbol("*MAX-KB-NUMBER-LEN*");

    // defconstant
    public static final SubLSymbol $mc_table_name$ = makeSymbol("*MC-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_machine_name_len$ = makeSymbol("*MAX-MACHINE-NAME-LEN*");

    // defconstant
    public static final SubLSymbol $max_machine_type_len$ = makeSymbol("*MAX-MACHINE-TYPE-LEN*");

    // defconstant
    public static final SubLSymbol $max_machine_hardware_type_len$ = makeSymbol("*MAX-MACHINE-HARDWARE-TYPE-LEN*");

    // defconstant
    public static final SubLSymbol $max_os_type_len$ = makeSymbol("*MAX-OS-TYPE-LEN*");

    // defconstant
    public static final SubLSymbol $te_table_name$ = makeSymbol("*TE-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_test_id_len$ = makeSymbol("*MAX-TEST-ID-LEN*");

    // defconstant
    public static final SubLSymbol $max_test_type_len$ = makeSymbol("*MAX-TEST-TYPE-LEN*");

    // defconstant
    public static final SubLSymbol $max_date_len$ = makeSymbol("*MAX-DATE-LEN*");

    // defconstant
    public static final SubLSymbol $max_test_status_len$ = makeSymbol("*MAX-TEST-STATUS-LEN*");

    // defconstant
    public static final SubLSymbol $max_test_execution_type_len$ = makeSymbol("*MAX-TEST-EXECUTION-TYPE-LEN*");

    // defconstant
    public static final SubLSymbol $ctest_test_types$ = makeSymbol("*CTEST-TEST-TYPES*");

    // defconstant
    public static final SubLSymbol $ctest_test_statuses$ = makeSymbol("*CTEST-TEST-STATUSES*");

    // defconstant
    public static final SubLSymbol $ctest_success_status$ = makeSymbol("*CTEST-SUCCESS-STATUS*");

    // defconstant
    public static final SubLSymbol $ctest_failure_status$ = makeSymbol("*CTEST-FAILURE-STATUS*");

    // defconstant
    public static final SubLSymbol $ctest_dfailure_status$ = makeSymbol("*CTEST-DFAILURE-STATUS*");

    // defconstant
    public static final SubLSymbol $ctest_error_status$ = makeSymbol("*CTEST-ERROR-STATUS*");

    // defconstant
    public static final SubLSymbol $ctest_skipped_status$ = makeSymbol("*CTEST-SKIPPED-STATUS*");

    // defconstant
    public static final SubLSymbol $ctest_problem_status$ = makeSymbol("*CTEST-PROBLEM-STATUS*");

    // defconstant
    public static final SubLSymbol $kct_test_type$ = makeSymbol("*KCT-TEST-TYPE*");

    // defconstant
    public static final SubLSymbol $tcmr_table_name$ = makeSymbol("*TCMR-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_metric_id_len$ = makeSymbol("*MAX-METRIC-ID-LEN*");

    // defconstant
    public static final SubLSymbol $tmr_table_name$ = makeSymbol("*TMR-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $tem_table_name$ = makeSymbol("*TEM-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $kcte_table_name$ = makeSymbol("*KCTE-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_exec_type_len$ = makeSymbol("*MAX-EXEC-TYPE-LEN*");

    // defconstant
    public static final SubLSymbol $collection_execution_type$ = makeSymbol("*COLLECTION-EXECUTION-TYPE*");

    // defconstant
    public static final SubLSymbol $individual_execution_type$ = makeSymbol("*INDIVIDUAL-EXECUTION-TYPE*");

    // defconstant
    public static final SubLSymbol $kctem_table_name$ = makeSymbol("*KCTEM-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_exec_mode_len$ = makeSymbol("*MAX-EXEC-MODE-LEN*");

    // defconstant
    /**
     * Tests having query formulas which are in the form of an implication, which
     * are run by locating existing objects in the KB that satisfy the LHS,
     * substituting them into the RHS, and performing a query using the substituted
     * RHS.
     */
    public static final SubLSymbol $sampling_execution_mode$ = makeSymbol("*SAMPLING-EXECUTION-MODE*");

    // defconstant
    /**
     * Tests having query formulas which are in the form of an implication, which
     * are run by hypothesizing terms to satisfy the LHS, substituting them into the
     * RHS, and performing a query using the substituted RHS.
     */
    public static final SubLSymbol $hypothesize_execution_mode$ = makeSymbol("*HYPOTHESIZE-EXECUTION-MODE*");

    // defconstant
    /**
     * Tests having query formulas which are not in the form of an implication,
     * which are run by performing a query using the query formula.
     */
    public static final SubLSymbol $simple_execution_mode$ = makeSymbol("*SIMPLE-EXECUTION-MODE*");

    // defconstant
    public static final SubLSymbol $kctc_table_name$ = makeSymbol("*KCTC-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $kcts_project_desc$ = makeSymbol("*KCTS-PROJECT-DESC*");

    // defconstant
    public static final SubLSymbol $kctcc_table_name$ = makeSymbol("*KCTCC-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_collection_type_len$ = makeSymbol("*MAX-COLLECTION-TYPE-LEN*");

    // defconstant
    // A C collection type denotes a collection of KB Content Tests.
    public static final SubLSymbol $collection_test_collection_type$ = makeSymbol("*COLLECTION-TEST-COLLECTION-TYPE*");

    // defconstant
    /**
     * An S collection type denotes a system wide collection of KB Content Tests.
     */
    public static final SubLSymbol $system_test_collection_type$ = makeSymbol("*SYSTEM-TEST-COLLECTION-TYPE*");

    // defconstant
    public static final SubLSymbol $tcrc_table_name$ = makeSymbol("*TCRC-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_cyclist_id_len$ = makeSymbol("*MAX-CYCLIST-ID-LEN*");

    // defconstant
    public static final SubLSymbol $max_email_notify_style_id_len$ = makeSymbol("*MAX-EMAIL-NOTIFY-STYLE-ID-LEN*");

    // defconstant
    public static final SubLSymbol $kctccbs_table_name$ = makeSymbol("*KCTCCBS-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_binding_designation_len$ = makeSymbol("*MAX-BINDING-DESIGNATION-LEN*");

    // defconstant
    public static final SubLSymbol $kct_exact_binding_set_designation$ = makeSymbol("*KCT-EXACT-BINDING-SET-DESIGNATION*");

    // defconstant
    public static final SubLSymbol $kct_wanted_binding_set_designation$ = makeSymbol("*KCT-WANTED-BINDING-SET-DESIGNATION*");

    // defconstant
    public static final SubLSymbol $kct_unwanted_binding_set_designation$ = makeSymbol("*KCT-UNWANTED-BINDING-SET-DESIGNATION*");

    // defconstant
    public static final SubLSymbol $kct_unimportant_binding_set_designation$ = makeSymbol("*KCT-UNIMPORTANT-BINDING-SET-DESIGNATION*");

    // defconstant
    public static final SubLSymbol $kct_binding_set_designations$ = makeSymbol("*KCT-BINDING-SET-DESIGNATIONS*");

    // defconstant
    public static final SubLSymbol $kctcas_table_name$ = makeSymbol("*KCTCAS-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_support_type_len$ = makeSymbol("*MAX-SUPPORT-TYPE-LEN*");

    // defconstant
    public static final SubLSymbol $max_support_designation_len$ = makeSymbol("*MAX-SUPPORT-DESIGNATION-LEN*");

    // defconstant
    public static final SubLSymbol $ctest_support_types$ = makeSymbol("*CTEST-SUPPORT-TYPES*");

    // defconstant
    public static final SubLSymbol $ctest_support_designations$ = makeSymbol("*CTEST-SUPPORT-DESIGNATIONS*");

    // defconstant
    public static final SubLSymbol $kct_wanted_support_designation$ = makeSymbol("*KCT-WANTED-SUPPORT-DESIGNATION*");

    // defconstant
    public static final SubLSymbol $kct_unwanted_support_designation$ = makeSymbol("*KCT-UNWANTED-SUPPORT-DESIGNATION*");

    // defconstant
    public static final SubLSymbol $kct_support_support_type$ = makeSymbol("*KCT-SUPPORT-SUPPORT-TYPE*");

    // defconstant
    public static final SubLSymbol $kct_module_support_type$ = makeSymbol("*KCT-MODULE-SUPPORT-TYPE*");

    // defconstant
    public static final SubLSymbol $ipc_table_name$ = makeSymbol("*IPC-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_inference_param_id_len$ = makeSymbol("*MAX-INFERENCE-PARAM-ID-LEN*");

    // defconstant
    public static final SubLSymbol $tmc_table_name$ = makeSymbol("*TMC-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $max_test_metric_type_len$ = makeSymbol("*MAX-TEST-METRIC-TYPE-LEN*");

    // defconstant
    public static final SubLSymbol $ctest_metric_types$ = makeSymbol("*CTEST-METRIC-TYPES*");

    // defconstant
    // Type designator for test collection level metrics.
    public static final SubLSymbol $ctest_collection_level_metric$ = makeSymbol("*CTEST-COLLECTION-LEVEL-METRIC*");

    // defconstant
    // Type designator for query level metrics.
    public static final SubLSymbol $ctest_query_level_metric$ = makeSymbol("*CTEST-QUERY-LEVEL-METRIC*");

    // defconstant
    // Type designator for query level metrics.
    public static final SubLSymbol $ctest_binding_level_metric$ = makeSymbol("*CTEST-BINDING-LEVEL-METRIC*");

    // defconstant
    public static final SubLSymbol $tdc_table_name$ = makeSymbol("*TDC-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $kctcg_table_name$ = makeSymbol("*KCTCG-TABLE-NAME*");

    // defconstant
    public static final SubLSymbol $kctci_table_name$ = makeSymbol("*KCTCI-TABLE-NAME*");

    // defparameter
    /**
     * If T, we are in a test running environment in which we are storing to the Cyc
     * Test Repository.
     */
    public static final SubLSymbol $ctest_storing_p$ = makeSymbol("*CTEST-STORING-P*");

    // defparameter
    /**
     * If T, we maintain, in the repository, a versioned history of how tests were
     * configured. This was the default until October 2004, but was disabled due to
     * problems with completing the storage of config info within the 4-hour SDBC
     * timeout.
     */
    public static final SubLSymbol $ctest_storing_configs_p$ = makeSymbol("*CTEST-STORING-CONFIGS-P*");

    // defparameter
    /**
     * NIL or a list of #$IndividualTestMetric instances. Metrics in this list will
     * be collected for every individual test, whether the test is configured to
     * collect them or not.
     */
    public static final SubLSymbol $ctest_required_metrics$ = makeSymbol("*CTEST-REQUIRED-METRICS*");

    // defparameter
    /**
     * Index of guids for tests and test collections which are currently being
     * constructed. This will help avoid tests in the same collection from
     * attempting to insert config records for the same test or same parent
     * collection when that test and/or test collection is currently being saved to
     * the Repository.
     */
    public static final SubLSymbol $tests_in_process$ = makeSymbol("*TESTS-IN-PROCESS*");

    // defparameter
    private static final SubLSymbol $ctest_field_maxima$ = makeSymbol("*CTEST-FIELD-MAXIMA*");

    // Internal Constants
    public static final SubLSymbol $default_email_notify_style_id$ = makeSymbol("*DEFAULT-EMAIL-NOTIFY-STYLE-ID*");

    public static final SubLSymbol $default_test_id$ = makeSymbol("*DEFAULT-TEST-ID*");

    public static final SubLSymbol $default_string_binding_set$ = makeSymbol("*DEFAULT-STRING-BINDING-SET*");

    public static final SubLSymbol $default_binding_set$ = makeSymbol("*DEFAULT-BINDING-SET*");

    public static final SubLSymbol $sym4$_DEFAULT_BINDING_SET2_ = makeSymbol("*DEFAULT-BINDING-SET2*");

    public static final SubLSymbol $default_set_of_binding_sets$ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS*");

    public static final SubLSymbol $sym6$_DEFAULT_SET_OF_BINDING_SETS2_ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS2*");

    public static final SubLSymbol $sym7$_DEFAULT_SET_OF_BINDING_SETS3_ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS3*");

    public static final SubLSymbol $default_module_sentence$ = makeSymbol("*DEFAULT-MODULE-SENTENCE*");

    public static final SubLSymbol $default_module_mt$ = makeSymbol("*DEFAULT-MODULE-MT*");

    public static final SubLSymbol $sym10$_DEFAULT_MODULE_MT2_ = makeSymbol("*DEFAULT-MODULE-MT2*");

    public static final SubLSymbol $default_dependency_test_id$ = makeSymbol("*DEFAULT-DEPENDENCY-TEST-ID*");

    public static final SubLSymbol $sym12$_DEFAULT_DEPENDENCY_TEST_ID2_ = makeSymbol("*DEFAULT-DEPENDENCY-TEST-ID2*");

    public static final SubLSymbol $default_isa_id$ = makeSymbol("*DEFAULT-ISA-ID*");

    public static final SubLSymbol $sym14$_DEFAULT_ISA_ID2_ = makeSymbol("*DEFAULT-ISA-ID2*");

    public static final SubLSymbol $default_test_query$ = makeSymbol("*DEFAULT-TEST-QUERY*");

    public static final SubLSymbol $default_test_mt$ = makeSymbol("*DEFAULT-TEST-MT*");

    public static final SubLSymbol $default_collection_id$ = makeSymbol("*DEFAULT-COLLECTION-ID*");

    private static final SubLObject $$TestResultNotification_EmailBrief = reader_make_constant_shell(makeString("TestResultNotification-EmailBrief"));

    private static final SubLObject $$TKBTemplateTestForMissingMt = reader_make_constant_shell(makeString("TKBTemplateTestForMissingMt"));

    public static final SubLString $str20$___TheSet____ELInferenceBindingFn = makeString("(#$TheSet (#$ELInferenceBindingFn ?SOMETHING \"A SOMETHING\"))");

    public static final SubLSymbol $sym21$_SOMETHING = makeSymbol("?SOMETHING");

    public static final SubLString $$$A_SOMETHING = makeString("A SOMETHING");

    public static final SubLSymbol $sym23$_OTHERTHING = makeSymbol("?OTHERTHING");

    public static final SubLString $$$ANOTHER_THING = makeString("ANOTHER THING");

    public static final SubLSymbol $sym25$_ANOTHERTHING = makeSymbol("?ANOTHERTHING");

    public static final SubLString $$$YET_ANOTHER_THING = makeString("YET ANOTHER THING");

    public static final SubLList $list27 = list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("Thing")));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLObject $const30$TKBTemplateTestForMissingExplanat = reader_make_constant_shell(makeString("TKBTemplateTestForMissingExplanation"));

    private static final SubLObject $$TKBTemplateTestForMissingExample = reader_make_constant_shell(makeString("TKBTemplateTestForMissingExample"));

    private static final SubLObject $$TKBTemplateIntegrityTest = reader_make_constant_shell(makeString("TKBTemplateIntegrityTest"));

    private static final SubLObject $$TKB_RTVQueries = reader_make_constant_shell(makeString("TKB-RTVQueries"));

    public static final SubLList $list34 = list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("Collection")), makeSymbol("?WHAT"));











    private static final SubLInteger $int$60 = makeInteger(60);

    public static final SubLString $str41$cyc_system_config = makeString("cyc_system_config");

    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLString $str43$machine_config = makeString("machine_config");



    public static final SubLString $str45$test_execution = makeString("test_execution");

    public static final SubLString $$$KBCONTENT = makeString("KBCONTENT");

    public static final SubLString $$$SUCCESS = makeString("SUCCESS");

    public static final SubLString $$$FAILURE = makeString("FAILURE");

    public static final SubLString $$$DFAILURE = makeString("DFAILURE");

    public static final SubLString $$$ERROR = makeString("ERROR");

    public static final SubLString $$$SKIPPED = makeString("SKIPPED");

    public static final SubLString $$$PROBLEM = makeString("PROBLEM");

    public static final SubLString $str53$test_collection_metric_result = makeString("test_collection_metric_result");

    public static final SubLString $str54$test_metric_result = makeString("test_metric_result");

    public static final SubLString $str55$test_execution_member = makeString("test_execution_member");

    public static final SubLString $str56$kct_execution = makeString("kct_execution");

    public static final SubLString $$$C = makeString("C");

    public static final SubLString $$$I = makeString("I");

    public static final SubLString $str59$kct_execution_member = makeString("kct_execution_member");

    public static final SubLString $$$S = makeString("S");

    public static final SubLString $$$H = makeString("H");

    public static final SubLString $$$X = makeString("X");

    public static final SubLString $str63$kct_config = makeString("kct_config");

    public static final SubLString $$$KB_Content_Test_System = makeString("KB Content Test System");

    public static final SubLString $str65$kct_collection_config = makeString("kct_collection_config");

    public static final SubLString $str66$test_cyclist_responsible_config = makeString("test_cyclist_responsible_config");

    public static final SubLString $str67$kct_config_cycl_binding_set = makeString("kct_config_cycl_binding_set");

    public static final SubLString $$$E = makeString("E");

    public static final SubLString $$$W = makeString("W");

    public static final SubLString $$$N = makeString("N");

    public static final SubLString $$$U = makeString("U");

    public static final SubLString $str72$kct_config_answer_support = makeString("kct_config_answer_support");

    public static final SubLString $$$M = makeString("M");

    public static final SubLString $str74$inference_param_config = makeString("inference_param_config");

    public static final SubLString $str75$test_metric_config = makeString("test_metric_config");

    public static final SubLString $$$Q = makeString("Q");

    public static final SubLString $$$B = makeString("B");

    public static final SubLString $str78$test_dependency_config = makeString("test_dependency_config");

    public static final SubLString $str79$kct_config_genls = makeString("kct_config_genls");

    public static final SubLString $str80$kct_config_isas = makeString("kct_config_isas");

    public static final SubLString $str81$Test_or_test_collection_GUID_must = makeString("Test or test collection GUID must be supplied.");

    public static final SubLString $str82$binding_designation = makeString("binding_designation");

    public static final SubLString $str83$cyclist_id = makeString("cyclist_id");

    public static final SubLString $str84$email_notify_style_id = makeString("email_notify_style_id");

    public static final SubLString $str85$execution_type = makeString("execution_type");

    public static final SubLString $str86$genls_id = makeString("genls_id");

    public static final SubLString $str87$image_type = makeString("image_type");

    public static final SubLString $str88$image_version = makeString("image_version");

    public static final SubLString $str89$inference_metric_id = makeString("inference_metric_id");

    public static final SubLString $str90$isa_id = makeString("isa_id");

    public static final SubLString $str91$kb_number = makeString("kb_number");

    public static final SubLString $str92$machine_hardware_type = makeString("machine_hardware_type");

    public static final SubLString $str93$machine_name = makeString("machine_name");

    public static final SubLString $str94$machine_type = makeString("machine_type");

    public static final SubLString $str95$os_type = makeString("os_type");

    public static final SubLString $str96$support_type = makeString("support-type");

    public static final SubLString $str97$system_version_num = makeString("system_version_num");

    public static final SubLString $str98$test_id = makeString("test_id");

    public static final SubLString $str99$test_status = makeString("test_status");

    public static final SubLString $str100$test_type = makeString("test_type");















    private static final SubLObject $$IndividualTestMetric = reader_make_constant_shell(makeString("IndividualTestMetric"));

    private static final SubLObject $$CollectionTestMetric = reader_make_constant_shell(makeString("CollectionTestMetric"));



    private static final SubLObject $$TestMetric = reader_make_constant_shell(makeString("TestMetric"));

    private static final SubLObject $$UnsupportedTestMetric = reader_make_constant_shell(makeString("UnsupportedTestMetric"));

    public static final SubLSymbol $sym113$CTEST_UNSUPPORTED_METRIC_ = makeSymbol("CTEST-UNSUPPORTED-METRIC?");

    public static SubLObject initialize_ctest() {
        $default_email_notify_style_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TestResultNotification_EmailBrief)));
        $default_test_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TKBTemplateTestForMissingMt)));
        $default_string_binding_set$.setGlobalValue($str20$___TheSet____ELInferenceBindingFn);
        $default_binding_set$.setGlobalValue(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym21$_SOMETHING, $$$A_SOMETHING))));
        $default_binding_set2$.setGlobalValue(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym23$_OTHERTHING, $$$ANOTHER_THING))));
        $default_set_of_binding_sets$.setGlobalValue(bindings.make_kb_set_of_binding_sets(list(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym21$_SOMETHING, $$$A_SOMETHING))))));
        $default_set_of_binding_sets2$.setGlobalValue(bindings.make_kb_set_of_binding_sets(list(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym23$_OTHERTHING, $$$ANOTHER_THING))))));
        $default_set_of_binding_sets3$.setGlobalValue(bindings.make_kb_set_of_binding_sets(list(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym25$_ANOTHERTHING, $$$YET_ANOTHER_THING))))));
        $default_module_sentence$.setGlobalValue($list27);
        $default_module_mt$.setGlobalValue($$BaseKB);
        $default_module_mt2$.setGlobalValue($$UniversalVocabularyMt);
        $default_dependency_test_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($const30$TKBTemplateTestForMissingExplanat)));
        $default_dependency_test_id2$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TKBTemplateTestForMissingExample)));
        $default_isa_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TKBTemplateIntegrityTest)));
        $default_isa_id2$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TKB_RTVQueries)));
        $default_test_query$.setGlobalValue($list34);
        $default_test_mt$.setGlobalValue($$BaseKB);
        $default_collection_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TKBTemplateIntegrityTest)));
        return T;
    }

    public static SubLObject kct_valid_execution_type(final SubLObject v_object) {
        return makeBoolean(v_object.equalp($collection_execution_type$.getGlobalValue()) || v_object.equalp($individual_execution_type$.getGlobalValue()));
    }

    public static SubLObject kct_valid_execution_mode(final SubLObject v_object) {
        return makeBoolean((v_object.equalp($sampling_execution_mode$.getGlobalValue()) || v_object.equalp($hypothesize_execution_mode$.getGlobalValue())) || v_object.equalp($simple_execution_mode$.getGlobalValue()));
    }

    public static SubLObject kct_valid_collection_type(final SubLObject type) {
        return makeBoolean(type.equalp($collection_test_collection_type$.getGlobalValue()) || type.equalp($system_test_collection_type$.getGlobalValue()));
    }

    public static SubLObject add_in_process_test(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == id)) {
            Errors.error($str81$Test_or_test_collection_GUID_must);
        }
        if (NIL != find_in_process_test(id)) {
            return T;
        }
        return dictionary.dictionary_enter($tests_in_process$.getDynamicValue(thread), id, T);
    }

    public static SubLObject find_in_process_test(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup($tests_in_process$.getDynamicValue(thread), id, UNPROVIDED);
    }

    public static SubLObject ctest_truncate_value_for_field(SubLObject value, final SubLObject field_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max_length = second(assoc(field_name, $ctest_field_maxima$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED));
        if (NIL != max_length) {
            value = string_utilities.string_first_n(max_length, string_utilities.trim_whitespace(value));
        }
        if (value.isString()) {
            return string_utilities.trim_whitespace(value);
        }
        return value;
    }

    public static SubLObject valid_ctest_output_format(final SubLObject format) {
        return member(format, $ctest_output_formats$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject valid_ctest_output_style(final SubLObject style) {
        return member(style, $ctest_output_styles$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject valid_ctest_type(final SubLObject type) {
        return member(type, $ctest_test_types$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject valid_ctest_status(final SubLObject status) {
        return member(status, $ctest_test_statuses$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject valid_ctest_support_type(final SubLObject type) {
        return member(type, $ctest_support_types$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject valid_ctest_support_designation(final SubLObject designation) {
        return member(designation, $ctest_support_designations$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject valid_ctest_suppport_tv(final SubLObject v_object) {
        if (((((v_object.eql($TRUE) || v_object.eql($FALSE)) || v_object.eql($TRUE_DEF)) || v_object.eql($TRUE_MON)) || v_object.eql($FALSE_DEF)) || v_object.eql($FALSE_MON)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject valid_ctest_binding_designation(final SubLObject v_object) {
        return member(v_object, $kct_binding_set_designations$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject add_leading_and_trailing_text(SubLObject string, final SubLObject leading, final SubLObject trailing) {
        if (NIL != leading) {
            string = string_utilities.pre_fix(string, leading);
        }
        if (NIL != trailing) {
            string = string_utilities.post_fix(string, trailing);
        }
        return string;
    }

    public static SubLObject escape_double_quotes(final SubLObject string) {
        return string_utilities.to_lisp_string(string_utilities.to_lisp_string(string));
    }

    public static SubLObject kct_test_metric_from_keyword(final SubLObject keyword) {
        assert NIL != keywordp(keyword) : "Types.keywordp(keyword) " + "CommonSymbols.NIL != Types.keywordp(keyword) " + keyword;
        return subl_identifier.cyc_entity_from_sublid(keyword, $$IndividualTestMetric);
    }

    public static SubLObject kct_collection_test_metric_from_keyword(final SubLObject keyword) {
        assert NIL != keywordp(keyword) : "Types.keywordp(keyword) " + "CommonSymbols.NIL != Types.keywordp(keyword) " + keyword;
        return subl_identifier.cyc_entity_from_sublid(keyword, $$CollectionTestMetric);
    }

    public static SubLObject kct_keyword_from_test_metric(final SubLObject metric) {
        assert NIL != constant_p(metric) : "constant_handles.constant_p(metric) " + "CommonSymbols.NIL != constant_handles.constant_p(metric) " + metric;
        return subl_identifier.sublid_from_cyc_entity(metric);
    }

    public static SubLObject ctest_kb_test_metric_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != isa.isa_in_any_mtP(v_object, $$TestMetric)));
    }

    public static SubLObject ctest_unsupported_metricP(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != isa.isa_in_any_mtP(v_object, $$UnsupportedTestMetric)));
    }

    public static SubLObject ctest_all_kb_test_metric_constants() {
        SubLObject result = list_utilities.remove_if_not(symbol_function(CONSTANT_P), isa.all_fort_instances_in_all_mts($$IndividualTestMetric), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        result = remove_if(symbol_function($sym113$CTEST_UNSUPPORTED_METRIC_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static SubLObject ctest_all_kb_collection_test_metric_constants() {
        SubLObject result = list_utilities.remove_if_not(symbol_function(CONSTANT_P), isa.all_fort_instances_in_all_mts($$CollectionTestMetric), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        result = remove_if(symbol_function($sym113$CTEST_UNSUPPORTED_METRIC_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static SubLObject declare_ctest_utils_file() {
        declareFunction(me, "initialize_ctest", "INITIALIZE-CTEST", 0, 0, false);
        declareFunction(me, "kct_valid_execution_type", "KCT-VALID-EXECUTION-TYPE", 1, 0, false);
        declareFunction(me, "kct_valid_execution_mode", "KCT-VALID-EXECUTION-MODE", 1, 0, false);
        declareFunction(me, "kct_valid_collection_type", "KCT-VALID-COLLECTION-TYPE", 1, 0, false);
        declareFunction(me, "add_in_process_test", "ADD-IN-PROCESS-TEST", 1, 0, false);
        declareFunction(me, "find_in_process_test", "FIND-IN-PROCESS-TEST", 1, 0, false);
        declareFunction(me, "ctest_truncate_value_for_field", "CTEST-TRUNCATE-VALUE-FOR-FIELD", 2, 0, false);
        declareFunction(me, "valid_ctest_output_format", "VALID-CTEST-OUTPUT-FORMAT", 1, 0, false);
        declareFunction(me, "valid_ctest_output_style", "VALID-CTEST-OUTPUT-STYLE", 1, 0, false);
        declareFunction(me, "valid_ctest_type", "VALID-CTEST-TYPE", 1, 0, false);
        declareFunction(me, "valid_ctest_status", "VALID-CTEST-STATUS", 1, 0, false);
        declareFunction(me, "valid_ctest_support_type", "VALID-CTEST-SUPPORT-TYPE", 1, 0, false);
        declareFunction(me, "valid_ctest_support_designation", "VALID-CTEST-SUPPORT-DESIGNATION", 1, 0, false);
        declareFunction(me, "valid_ctest_suppport_tv", "VALID-CTEST-SUPPPORT-TV", 1, 0, false);
        declareFunction(me, "valid_ctest_binding_designation", "VALID-CTEST-BINDING-DESIGNATION", 1, 0, false);
        declareFunction(me, "add_leading_and_trailing_text", "ADD-LEADING-AND-TRAILING-TEXT", 3, 0, false);
        declareFunction(me, "escape_double_quotes", "ESCAPE-DOUBLE-QUOTES", 1, 0, false);
        declareFunction(me, "kct_test_metric_from_keyword", "KCT-TEST-METRIC-FROM-KEYWORD", 1, 0, false);
        declareFunction(me, "kct_collection_test_metric_from_keyword", "KCT-COLLECTION-TEST-METRIC-FROM-KEYWORD", 1, 0, false);
        declareFunction(me, "kct_keyword_from_test_metric", "KCT-KEYWORD-FROM-TEST-METRIC", 1, 0, false);
        declareFunction(me, "ctest_kb_test_metric_p", "CTEST-KB-TEST-METRIC-P", 1, 0, false);
        declareFunction(me, "ctest_unsupported_metricP", "CTEST-UNSUPPORTED-METRIC?", 1, 0, false);
        declareFunction(me, "ctest_all_kb_test_metric_constants", "CTEST-ALL-KB-TEST-METRIC-CONSTANTS", 0, 0, false);
        declareFunction(me, "ctest_all_kb_collection_test_metric_constants", "CTEST-ALL-KB-COLLECTION-TEST-METRIC-CONSTANTS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_ctest_utils_file() {
        deflexical("*DEFAULT-EMAIL-NOTIFY-STYLE-ID*", SubLTrampolineFile.maybeDefault($default_email_notify_style_id$, $default_email_notify_style_id$, NIL));
        deflexical("*DEFAULT-TEST-ID*", SubLTrampolineFile.maybeDefault($default_test_id$, $default_test_id$, NIL));
        deflexical("*DEFAULT-STRING-BINDING-SET*", SubLTrampolineFile.maybeDefault($default_string_binding_set$, $default_string_binding_set$, NIL));
        deflexical("*DEFAULT-BINDING-SET*", SubLTrampolineFile.maybeDefault($default_binding_set$, $default_binding_set$, NIL));
        deflexical("*DEFAULT-BINDING-SET2*", SubLTrampolineFile.maybeDefault($sym4$_DEFAULT_BINDING_SET2_, $default_binding_set2$, NIL));
        deflexical("*DEFAULT-SET-OF-BINDING-SETS*", SubLTrampolineFile.maybeDefault($default_set_of_binding_sets$, $default_set_of_binding_sets$, NIL));
        deflexical("*DEFAULT-SET-OF-BINDING-SETS2*", SubLTrampolineFile.maybeDefault($sym6$_DEFAULT_SET_OF_BINDING_SETS2_, $default_set_of_binding_sets2$, NIL));
        deflexical("*DEFAULT-SET-OF-BINDING-SETS3*", SubLTrampolineFile.maybeDefault($sym7$_DEFAULT_SET_OF_BINDING_SETS3_, $default_set_of_binding_sets3$, NIL));
        deflexical("*DEFAULT-MODULE-SENTENCE*", SubLTrampolineFile.maybeDefault($default_module_sentence$, $default_module_sentence$, NIL));
        deflexical("*DEFAULT-MODULE-MT*", SubLTrampolineFile.maybeDefault($default_module_mt$, $default_module_mt$, NIL));
        deflexical("*DEFAULT-MODULE-MT2*", SubLTrampolineFile.maybeDefault($sym10$_DEFAULT_MODULE_MT2_, $default_module_mt2$, NIL));
        deflexical("*DEFAULT-DEPENDENCY-TEST-ID*", SubLTrampolineFile.maybeDefault($default_dependency_test_id$, $default_dependency_test_id$, NIL));
        deflexical("*DEFAULT-DEPENDENCY-TEST-ID2*", SubLTrampolineFile.maybeDefault($sym12$_DEFAULT_DEPENDENCY_TEST_ID2_, $default_dependency_test_id2$, NIL));
        deflexical("*DEFAULT-ISA-ID*", SubLTrampolineFile.maybeDefault($default_isa_id$, $default_isa_id$, NIL));
        deflexical("*DEFAULT-ISA-ID2*", SubLTrampolineFile.maybeDefault($sym14$_DEFAULT_ISA_ID2_, $default_isa_id2$, NIL));
        deflexical("*DEFAULT-TEST-QUERY*", SubLTrampolineFile.maybeDefault($default_test_query$, $default_test_query$, NIL));
        deflexical("*DEFAULT-TEST-MT*", SubLTrampolineFile.maybeDefault($default_test_mt$, $default_test_mt$, NIL));
        deflexical("*DEFAULT-COLLECTION-ID*", SubLTrampolineFile.maybeDefault($default_collection_id$, $default_collection_id$, NIL));
        defconstant("*CTEST-OUTPUT-FORMATS*", list($TEXT, $HTML));
        defconstant("*CTEST-OUTPUT-STYLES*", list($BRIEF, $VERBOSE, $POST_BUILD));
        defconstant("*MAX-TEST-RETRY-TIME*", $int$60);
        defconstant("*CSC-TABLE-NAME*", $str41$cyc_system_config);
        defconstant("*MAX-IMAGE-TYPE-LEN*", $int$50);
        defconstant("*MAX-IMAGE-VERSION-LEN*", $int$50);
        defconstant("*MAX-SYSTEM-VERSION-NUM-LEN*", TEN_INTEGER);
        defconstant("*MAX-KB-NUMBER-LEN*", TWELVE_INTEGER);
        defconstant("*MC-TABLE-NAME*", $str43$machine_config);
        defconstant("*MAX-MACHINE-NAME-LEN*", $int$100);
        defconstant("*MAX-MACHINE-TYPE-LEN*", $int$50);
        defconstant("*MAX-MACHINE-HARDWARE-TYPE-LEN*", TWENTY_INTEGER);
        defconstant("*MAX-OS-TYPE-LEN*", $int$50);
        defconstant("*TE-TABLE-NAME*", $str45$test_execution);
        defconstant("*MAX-TEST-ID-LEN*", $int$100);
        defconstant("*MAX-TEST-TYPE-LEN*", TWENTY_INTEGER);
        defconstant("*MAX-DATE-LEN*", NINETEEN_INTEGER);
        defconstant("*MAX-TEST-STATUS-LEN*", TEN_INTEGER);
        defconstant("*MAX-TEST-EXECUTION-TYPE-LEN*", ONE_INTEGER);
        defconstant("*CTEST-TEST-TYPES*", list($$$KBCONTENT));
        defconstant("*CTEST-TEST-STATUSES*", list($$$SUCCESS, $$$FAILURE, $$$DFAILURE, $$$ERROR, $$$SKIPPED, $$$PROBLEM));
        defconstant("*CTEST-SUCCESS-STATUS*", $$$SUCCESS);
        defconstant("*CTEST-FAILURE-STATUS*", $$$FAILURE);
        defconstant("*CTEST-DFAILURE-STATUS*", $$$DFAILURE);
        defconstant("*CTEST-ERROR-STATUS*", $$$ERROR);
        defconstant("*CTEST-SKIPPED-STATUS*", $$$SKIPPED);
        defconstant("*CTEST-PROBLEM-STATUS*", $$$PROBLEM);
        defconstant("*KCT-TEST-TYPE*", $$$KBCONTENT);
        defconstant("*TCMR-TABLE-NAME*", $str53$test_collection_metric_result);
        defconstant("*MAX-METRIC-ID-LEN*", $int$100);
        defconstant("*TMR-TABLE-NAME*", $str54$test_metric_result);
        defconstant("*TEM-TABLE-NAME*", $str55$test_execution_member);
        defconstant("*KCTE-TABLE-NAME*", $str56$kct_execution);
        defconstant("*MAX-EXEC-TYPE-LEN*", ONE_INTEGER);
        defconstant("*COLLECTION-EXECUTION-TYPE*", $$$C);
        defconstant("*INDIVIDUAL-EXECUTION-TYPE*", $$$I);
        defconstant("*KCTEM-TABLE-NAME*", $str59$kct_execution_member);
        defconstant("*MAX-EXEC-MODE-LEN*", ONE_INTEGER);
        defconstant("*SAMPLING-EXECUTION-MODE*", $$$S);
        defconstant("*HYPOTHESIZE-EXECUTION-MODE*", $$$H);
        defconstant("*SIMPLE-EXECUTION-MODE*", $$$X);
        defconstant("*KCTC-TABLE-NAME*", $str63$kct_config);
        defconstant("*KCTS-PROJECT-DESC*", $$$KB_Content_Test_System);
        defconstant("*KCTCC-TABLE-NAME*", $str65$kct_collection_config);
        defconstant("*MAX-COLLECTION-TYPE-LEN*", ONE_INTEGER);
        defconstant("*COLLECTION-TEST-COLLECTION-TYPE*", $$$C);
        defconstant("*SYSTEM-TEST-COLLECTION-TYPE*", $$$S);
        defconstant("*TCRC-TABLE-NAME*", $str66$test_cyclist_responsible_config);
        defconstant("*MAX-CYCLIST-ID-LEN*", $int$100);
        defconstant("*MAX-EMAIL-NOTIFY-STYLE-ID-LEN*", $int$100);
        defconstant("*KCTCCBS-TABLE-NAME*", $str67$kct_config_cycl_binding_set);
        defconstant("*MAX-BINDING-DESIGNATION-LEN*", ONE_INTEGER);
        defconstant("*KCT-EXACT-BINDING-SET-DESIGNATION*", $$$E);
        defconstant("*KCT-WANTED-BINDING-SET-DESIGNATION*", $$$W);
        defconstant("*KCT-UNWANTED-BINDING-SET-DESIGNATION*", $$$N);
        defconstant("*KCT-UNIMPORTANT-BINDING-SET-DESIGNATION*", $$$U);
        defconstant("*KCT-BINDING-SET-DESIGNATIONS*", list($$$E, $$$W, $$$N, $$$U));
        defconstant("*KCTCAS-TABLE-NAME*", $str72$kct_config_answer_support);
        defconstant("*MAX-SUPPORT-TYPE-LEN*", ONE_INTEGER);
        defconstant("*MAX-SUPPORT-DESIGNATION-LEN*", ONE_INTEGER);
        defconstant("*CTEST-SUPPORT-TYPES*", list($$$M, $$$S));
        defconstant("*CTEST-SUPPORT-DESIGNATIONS*", list($$$W, $$$N));
        defconstant("*KCT-WANTED-SUPPORT-DESIGNATION*", $$$W);
        defconstant("*KCT-UNWANTED-SUPPORT-DESIGNATION*", $$$N);
        defconstant("*KCT-SUPPORT-SUPPORT-TYPE*", $$$S);
        defconstant("*KCT-MODULE-SUPPORT-TYPE*", $$$M);
        defconstant("*IPC-TABLE-NAME*", $str74$inference_param_config);
        defconstant("*MAX-INFERENCE-PARAM-ID-LEN*", $int$100);
        defconstant("*TMC-TABLE-NAME*", $str75$test_metric_config);
        defconstant("*MAX-TEST-METRIC-TYPE-LEN*", ONE_INTEGER);
        defconstant("*CTEST-METRIC-TYPES*", list($$$C, $$$Q, $$$B));
        defconstant("*CTEST-COLLECTION-LEVEL-METRIC*", $$$C);
        defconstant("*CTEST-QUERY-LEVEL-METRIC*", $$$Q);
        defconstant("*CTEST-BINDING-LEVEL-METRIC*", $$$B);
        defconstant("*TDC-TABLE-NAME*", $str78$test_dependency_config);
        defconstant("*KCTCG-TABLE-NAME*", $str79$kct_config_genls);
        defconstant("*KCTCI-TABLE-NAME*", $str80$kct_config_isas);
        defparameter("*CTEST-STORING-P*", NIL);
        defparameter("*CTEST-STORING-CONFIGS-P*", NIL);
        defparameter("*CTEST-REQUIRED-METRICS*", NIL);
        defparameter("*TESTS-IN-PROCESS*", NIL);
        defparameter("*CTEST-FIELD-MAXIMA*", list(new SubLObject[]{ list($str82$binding_designation, $max_binding_designation_len$.getGlobalValue()), list($str83$cyclist_id, $max_cyclist_id_len$.getGlobalValue()), list($str84$email_notify_style_id, $max_email_notify_style_id_len$.getGlobalValue()), list($str85$execution_type, $max_exec_type_len$.getGlobalValue()), list($str86$genls_id, $max_test_id_len$.getGlobalValue()), list($str87$image_type, $max_image_type_len$.getGlobalValue()), list($str88$image_version, $max_image_version_len$.getGlobalValue()), list($str89$inference_metric_id, $max_metric_id_len$.getGlobalValue()), list($str90$isa_id, $max_test_id_len$.getGlobalValue()), list($str91$kb_number, $max_kb_number_len$.getGlobalValue()), list($str92$machine_hardware_type, $max_machine_hardware_type_len$.getGlobalValue()), list($str93$machine_name, $max_machine_name_len$.getGlobalValue()), list($str94$machine_type, $max_machine_type_len$.getGlobalValue()), list($str95$os_type, $max_os_type_len$.getGlobalValue()), list($str96$support_type, $max_support_type_len$.getGlobalValue()), list($str97$system_version_num, $max_system_version_num_len$.getGlobalValue()), list($str98$test_id, $max_test_id_len$.getGlobalValue()), list($str99$test_status, $max_test_status_len$.getGlobalValue()), list($str100$test_type, $max_test_type_len$.getGlobalValue()) }));
        return NIL;
    }

    public static SubLObject setup_ctest_utils_file() {
        declare_defglobal($default_email_notify_style_id$);
        declare_defglobal($default_test_id$);
        declare_defglobal($default_string_binding_set$);
        declare_defglobal($default_binding_set$);
        declare_defglobal($sym4$_DEFAULT_BINDING_SET2_);
        declare_defglobal($default_set_of_binding_sets$);
        declare_defglobal($sym6$_DEFAULT_SET_OF_BINDING_SETS2_);
        declare_defglobal($sym7$_DEFAULT_SET_OF_BINDING_SETS3_);
        declare_defglobal($default_module_sentence$);
        declare_defglobal($default_module_mt$);
        declare_defglobal($sym10$_DEFAULT_MODULE_MT2_);
        declare_defglobal($default_dependency_test_id$);
        declare_defglobal($sym12$_DEFAULT_DEPENDENCY_TEST_ID2_);
        declare_defglobal($default_isa_id$);
        declare_defglobal($sym14$_DEFAULT_ISA_ID2_);
        declare_defglobal($default_test_query$);
        declare_defglobal($default_test_mt$);
        declare_defglobal($default_collection_id$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ctest_utils_file();
    }

    @Override
    public void initializeVariables() {
        init_ctest_utils_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ctest_utils_file();
    }

    static {























































































































































































































    }
}

/**
 * Total time: 493 ms
 */
