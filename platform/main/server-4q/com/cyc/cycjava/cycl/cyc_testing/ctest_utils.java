/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyc_testing;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constants_high;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CTEST-UTILS
 * source file: /cyc/top/cycl/cyc-testing/ctest-utils.lisp
 * created:     2019/07/03 17:37:56
 */
public final class ctest_utils extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new ctest_utils();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.ctest_utils";


    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_binding_set2$ = makeSymbol("*DEFAULT-BINDING-SET2*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_set_of_binding_sets2$ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS2*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_set_of_binding_sets3$ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS3*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_module_mt2$ = makeSymbol("*DEFAULT-MODULE-MT2*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_dependency_test_id2$ = makeSymbol("*DEFAULT-DEPENDENCY-TEST-ID2*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_isa_id2$ = makeSymbol("*DEFAULT-ISA-ID2*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_output_formats$ = makeSymbol("*CTEST-OUTPUT-FORMATS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_output_styles$ = makeSymbol("*CTEST-OUTPUT-STYLES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_test_retry_time$ = makeSymbol("*MAX-TEST-RETRY-TIME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $csc_table_name$ = makeSymbol("*CSC-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_image_type_len$ = makeSymbol("*MAX-IMAGE-TYPE-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_image_version_len$ = makeSymbol("*MAX-IMAGE-VERSION-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_system_version_num_len$ = makeSymbol("*MAX-SYSTEM-VERSION-NUM-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_kb_number_len$ = makeSymbol("*MAX-KB-NUMBER-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $mc_table_name$ = makeSymbol("*MC-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_machine_name_len$ = makeSymbol("*MAX-MACHINE-NAME-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_machine_type_len$ = makeSymbol("*MAX-MACHINE-TYPE-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_machine_hardware_type_len$ = makeSymbol("*MAX-MACHINE-HARDWARE-TYPE-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_os_type_len$ = makeSymbol("*MAX-OS-TYPE-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $te_table_name$ = makeSymbol("*TE-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_test_id_len$ = makeSymbol("*MAX-TEST-ID-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_test_type_len$ = makeSymbol("*MAX-TEST-TYPE-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_date_len$ = makeSymbol("*MAX-DATE-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_test_status_len$ = makeSymbol("*MAX-TEST-STATUS-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_test_execution_type_len$ = makeSymbol("*MAX-TEST-EXECUTION-TYPE-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_test_types$ = makeSymbol("*CTEST-TEST-TYPES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_test_statuses$ = makeSymbol("*CTEST-TEST-STATUSES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_success_status$ = makeSymbol("*CTEST-SUCCESS-STATUS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_failure_status$ = makeSymbol("*CTEST-FAILURE-STATUS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_dfailure_status$ = makeSymbol("*CTEST-DFAILURE-STATUS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_error_status$ = makeSymbol("*CTEST-ERROR-STATUS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_skipped_status$ = makeSymbol("*CTEST-SKIPPED-STATUS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_problem_status$ = makeSymbol("*CTEST-PROBLEM-STATUS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_test_type$ = makeSymbol("*KCT-TEST-TYPE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $tcmr_table_name$ = makeSymbol("*TCMR-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_metric_id_len$ = makeSymbol("*MAX-METRIC-ID-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $tmr_table_name$ = makeSymbol("*TMR-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $tem_table_name$ = makeSymbol("*TEM-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kcte_table_name$ = makeSymbol("*KCTE-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_exec_type_len$ = makeSymbol("*MAX-EXEC-TYPE-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $collection_execution_type$ = makeSymbol("*COLLECTION-EXECUTION-TYPE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $individual_execution_type$ = makeSymbol("*INDIVIDUAL-EXECUTION-TYPE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kctem_table_name$ = makeSymbol("*KCTEM-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_exec_mode_len$ = makeSymbol("*MAX-EXEC-MODE-LEN*");

    // defconstant
    /**
     * Tests having query formulas which are in the form of an implication, which
     * are run by locating existing objects in the KB that satisfy the LHS,
     * substituting them into the RHS, and performing a query using the substituted
     * RHS.
     */
    @LispMethod(comment = "Tests having query formulas which are in the form of an implication, which\r\nare run by locating existing objects in the KB that satisfy the LHS,\r\nsubstituting them into the RHS, and performing a query using the substituted\r\nRHS.\ndefconstant\nTests having query formulas which are in the form of an implication, which\nare run by locating existing objects in the KB that satisfy the LHS,\nsubstituting them into the RHS, and performing a query using the substituted\nRHS.")
    public static final SubLSymbol $sampling_execution_mode$ = makeSymbol("*SAMPLING-EXECUTION-MODE*");

    // defconstant
    /**
     * Tests having query formulas which are in the form of an implication, which
     * are run by hypothesizing terms to satisfy the LHS, substituting them into the
     * RHS, and performing a query using the substituted RHS.
     */
    @LispMethod(comment = "Tests having query formulas which are in the form of an implication, which\r\nare run by hypothesizing terms to satisfy the LHS, substituting them into the\r\nRHS, and performing a query using the substituted RHS.\ndefconstant\nTests having query formulas which are in the form of an implication, which\nare run by hypothesizing terms to satisfy the LHS, substituting them into the\nRHS, and performing a query using the substituted RHS.")
    public static final SubLSymbol $hypothesize_execution_mode$ = makeSymbol("*HYPOTHESIZE-EXECUTION-MODE*");

    // defconstant
    /**
     * Tests having query formulas which are not in the form of an implication,
     * which are run by performing a query using the query formula.
     */
    @LispMethod(comment = "Tests having query formulas which are not in the form of an implication,\r\nwhich are run by performing a query using the query formula.\ndefconstant\nTests having query formulas which are not in the form of an implication,\nwhich are run by performing a query using the query formula.")
    public static final SubLSymbol $simple_execution_mode$ = makeSymbol("*SIMPLE-EXECUTION-MODE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kctc_table_name$ = makeSymbol("*KCTC-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kcts_project_desc$ = makeSymbol("*KCTS-PROJECT-DESC*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kctcc_table_name$ = makeSymbol("*KCTCC-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_collection_type_len$ = makeSymbol("*MAX-COLLECTION-TYPE-LEN*");

    // defconstant
    // A C collection type denotes a collection of KB Content Tests.
    /**
     * A C collection type denotes a collection of KB Content Tests.
     */
    @LispMethod(comment = "A C collection type denotes a collection of KB Content Tests.\ndefconstant")
    public static final SubLSymbol $collection_test_collection_type$ = makeSymbol("*COLLECTION-TEST-COLLECTION-TYPE*");

    // defconstant
    /**
     * An S collection type denotes a system wide collection of KB Content Tests.
     */
    @LispMethod(comment = "An S collection type denotes a system wide collection of KB Content Tests.\ndefconstant")
    public static final SubLSymbol $system_test_collection_type$ = makeSymbol("*SYSTEM-TEST-COLLECTION-TYPE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $tcrc_table_name$ = makeSymbol("*TCRC-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_cyclist_id_len$ = makeSymbol("*MAX-CYCLIST-ID-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_email_notify_style_id_len$ = makeSymbol("*MAX-EMAIL-NOTIFY-STYLE-ID-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kctccbs_table_name$ = makeSymbol("*KCTCCBS-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_binding_designation_len$ = makeSymbol("*MAX-BINDING-DESIGNATION-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_exact_binding_set_designation$ = makeSymbol("*KCT-EXACT-BINDING-SET-DESIGNATION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_wanted_binding_set_designation$ = makeSymbol("*KCT-WANTED-BINDING-SET-DESIGNATION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_unwanted_binding_set_designation$ = makeSymbol("*KCT-UNWANTED-BINDING-SET-DESIGNATION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_unimportant_binding_set_designation$ = makeSymbol("*KCT-UNIMPORTANT-BINDING-SET-DESIGNATION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_binding_set_designations$ = makeSymbol("*KCT-BINDING-SET-DESIGNATIONS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kctcas_table_name$ = makeSymbol("*KCTCAS-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_support_type_len$ = makeSymbol("*MAX-SUPPORT-TYPE-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_support_designation_len$ = makeSymbol("*MAX-SUPPORT-DESIGNATION-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_support_types$ = makeSymbol("*CTEST-SUPPORT-TYPES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_support_designations$ = makeSymbol("*CTEST-SUPPORT-DESIGNATIONS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_wanted_support_designation$ = makeSymbol("*KCT-WANTED-SUPPORT-DESIGNATION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_unwanted_support_designation$ = makeSymbol("*KCT-UNWANTED-SUPPORT-DESIGNATION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_support_support_type$ = makeSymbol("*KCT-SUPPORT-SUPPORT-TYPE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_module_support_type$ = makeSymbol("*KCT-MODULE-SUPPORT-TYPE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ipc_table_name$ = makeSymbol("*IPC-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_inference_param_id_len$ = makeSymbol("*MAX-INFERENCE-PARAM-ID-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $tmc_table_name$ = makeSymbol("*TMC-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $max_test_metric_type_len$ = makeSymbol("*MAX-TEST-METRIC-TYPE-LEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $ctest_metric_types$ = makeSymbol("*CTEST-METRIC-TYPES*");

    // defconstant
    // Type designator for test collection level metrics.
    /**
     * Type designator for test collection level metrics.
     */
    @LispMethod(comment = "Type designator for test collection level metrics.\ndefconstant")
    public static final SubLSymbol $ctest_collection_level_metric$ = makeSymbol("*CTEST-COLLECTION-LEVEL-METRIC*");

    // defconstant
    // Type designator for query level metrics.
    /**
     * Type designator for query level metrics.
     */
    @LispMethod(comment = "Type designator for query level metrics.\ndefconstant")
    public static final SubLSymbol $ctest_query_level_metric$ = makeSymbol("*CTEST-QUERY-LEVEL-METRIC*");

    // defconstant
    // Type designator for query level metrics.
    /**
     * Type designator for query level metrics.
     */
    @LispMethod(comment = "Type designator for query level metrics.\ndefconstant")
    public static final SubLSymbol $ctest_binding_level_metric$ = makeSymbol("*CTEST-BINDING-LEVEL-METRIC*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $tdc_table_name$ = makeSymbol("*TDC-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kctcg_table_name$ = makeSymbol("*KCTCG-TABLE-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kctci_table_name$ = makeSymbol("*KCTCI-TABLE-NAME*");

    // defparameter
    /**
     * If T, we are in a test running environment in which we are storing to the Cyc
     * Test Repository.
     */
    @LispMethod(comment = "If T, we are in a test running environment in which we are storing to the Cyc\r\nTest Repository.\ndefparameter\nIf T, we are in a test running environment in which we are storing to the Cyc\nTest Repository.")
    public static final SubLSymbol $ctest_storing_p$ = makeSymbol("*CTEST-STORING-P*");

    // defparameter
    /**
     * If T, we maintain, in the repository, a versioned history of how tests were
     * configured. This was the default until October 2004, but was disabled due to
     * problems with completing the storage of config info within the 4-hour SDBC
     * timeout.
     */
    @LispMethod(comment = "If T, we maintain, in the repository, a versioned history of how tests were\r\nconfigured. This was the default until October 2004, but was disabled due to\r\nproblems with completing the storage of config info within the 4-hour SDBC\r\ntimeout.\ndefparameter\nIf T, we maintain, in the repository, a versioned history of how tests were\nconfigured. This was the default until October 2004, but was disabled due to\nproblems with completing the storage of config info within the 4-hour SDBC\ntimeout.")
    public static final SubLSymbol $ctest_storing_configs_p$ = makeSymbol("*CTEST-STORING-CONFIGS-P*");

    // defparameter
    /**
     * NIL or a list of #$IndividualTestMetric instances. Metrics in this list will
     * be collected for every individual test, whether the test is configured to
     * collect them or not.
     */
    @LispMethod(comment = "NIL or a list of #$IndividualTestMetric instances. Metrics in this list will\r\nbe collected for every individual test, whether the test is configured to\r\ncollect them or not.\ndefparameter\nNIL or a list of #$IndividualTestMetric instances. Metrics in this list will\nbe collected for every individual test, whether the test is configured to\ncollect them or not.")
    public static final SubLSymbol $ctest_required_metrics$ = makeSymbol("*CTEST-REQUIRED-METRICS*");

    // defparameter
    /**
     * Index of guids for tests and test collections which are currently being
     * constructed. This will help avoid tests in the same collection from
     * attempting to insert config records for the same test or same parent
     * collection when that test and/or test collection is currently being saved to
     * the Repository.
     */
    @LispMethod(comment = "Index of guids for tests and test collections which are currently being\r\nconstructed. This will help avoid tests in the same collection from\r\nattempting to insert config records for the same test or same parent\r\ncollection when that test and/or test collection is currently being saved to\r\nthe Repository.\ndefparameter\nIndex of guids for tests and test collections which are currently being\nconstructed. This will help avoid tests in the same collection from\nattempting to insert config records for the same test or same parent\ncollection when that test and/or test collection is currently being saved to\nthe Repository.")
    public static final SubLSymbol $tests_in_process$ = makeSymbol("*TESTS-IN-PROCESS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ctest_field_maxima$ = makeSymbol("*CTEST-FIELD-MAXIMA*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $default_email_notify_style_id$ = makeSymbol("*DEFAULT-EMAIL-NOTIFY-STYLE-ID*");

    public static final SubLSymbol $default_test_id$ = makeSymbol("*DEFAULT-TEST-ID*");

    public static final SubLSymbol $default_string_binding_set$ = makeSymbol("*DEFAULT-STRING-BINDING-SET*");

    public static final SubLSymbol $default_binding_set$ = makeSymbol("*DEFAULT-BINDING-SET*");

    static private final SubLSymbol $sym4$_DEFAULT_BINDING_SET2_ = makeSymbol("*DEFAULT-BINDING-SET2*");

    public static final SubLSymbol $default_set_of_binding_sets$ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS*");

    static private final SubLSymbol $sym6$_DEFAULT_SET_OF_BINDING_SETS2_ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS2*");

    static private final SubLSymbol $sym7$_DEFAULT_SET_OF_BINDING_SETS3_ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS3*");

    public static final SubLSymbol $default_module_sentence$ = makeSymbol("*DEFAULT-MODULE-SENTENCE*");

    public static final SubLSymbol $default_module_mt$ = makeSymbol("*DEFAULT-MODULE-MT*");

    static private final SubLSymbol $sym10$_DEFAULT_MODULE_MT2_ = makeSymbol("*DEFAULT-MODULE-MT2*");

    public static final SubLSymbol $default_dependency_test_id$ = makeSymbol("*DEFAULT-DEPENDENCY-TEST-ID*");

    static private final SubLSymbol $sym12$_DEFAULT_DEPENDENCY_TEST_ID2_ = makeSymbol("*DEFAULT-DEPENDENCY-TEST-ID2*");

    public static final SubLSymbol $default_isa_id$ = makeSymbol("*DEFAULT-ISA-ID*");

    static private final SubLSymbol $sym14$_DEFAULT_ISA_ID2_ = makeSymbol("*DEFAULT-ISA-ID2*");

    public static final SubLSymbol $default_test_query$ = makeSymbol("*DEFAULT-TEST-QUERY*");

    public static final SubLSymbol $default_test_mt$ = makeSymbol("*DEFAULT-TEST-MT*");

    public static final SubLSymbol $default_collection_id$ = makeSymbol("*DEFAULT-COLLECTION-ID*");

    private static final SubLObject $$TestResultNotification_EmailBrief = reader_make_constant_shell("TestResultNotification-EmailBrief");



    static private final SubLString $str20$___TheSet____ELInferenceBindingFn = makeString("(#$TheSet (#$ELInferenceBindingFn ?SOMETHING \"A SOMETHING\"))");

    static private final SubLSymbol $sym21$_SOMETHING = makeSymbol("?SOMETHING");

    static private final SubLString $$$A_SOMETHING = makeString("A SOMETHING");

    static private final SubLSymbol $sym23$_OTHERTHING = makeSymbol("?OTHERTHING");

    static private final SubLString $$$ANOTHER_THING = makeString("ANOTHER THING");

    static private final SubLSymbol $sym25$_ANOTHERTHING = makeSymbol("?ANOTHERTHING");

    static private final SubLString $$$YET_ANOTHER_THING = makeString("YET ANOTHER THING");

    static private final SubLList $list27 = list(reader_make_constant_shell("genls"), reader_make_constant_shell("Collection"), reader_make_constant_shell("Thing"));





    private static final SubLObject $const30$TKBTemplateTestForMissingExplanat = reader_make_constant_shell("TKBTemplateTestForMissingExplanation");





    private static final SubLObject $$TKB_RTVQueries = reader_make_constant_shell("TKB-RTVQueries");

    static private final SubLList $list34 = list(reader_make_constant_shell("genls"), reader_make_constant_shell("Collection"), makeSymbol("?WHAT"));

    private static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $str41$cyc_system_config = makeString("cyc_system_config");

    private static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLString $str43$machine_config = makeString("machine_config");

    static private final SubLString $str45$test_execution = makeString("test_execution");

    static private final SubLString $$$KBCONTENT = makeString("KBCONTENT");

    static private final SubLString $$$SUCCESS = makeString("SUCCESS");

    static private final SubLString $$$FAILURE = makeString("FAILURE");

    static private final SubLString $$$DFAILURE = makeString("DFAILURE");

    static private final SubLString $$$ERROR = makeString("ERROR");

    static private final SubLString $$$SKIPPED = makeString("SKIPPED");

    static private final SubLString $$$PROBLEM = makeString("PROBLEM");

    static private final SubLString $str53$test_collection_metric_result = makeString("test_collection_metric_result");

    static private final SubLString $str54$test_metric_result = makeString("test_metric_result");

    static private final SubLString $str55$test_execution_member = makeString("test_execution_member");

    static private final SubLString $str56$kct_execution = makeString("kct_execution");

    static private final SubLString $$$C = makeString("C");

    static private final SubLString $$$I = makeString("I");

    static private final SubLString $str59$kct_execution_member = makeString("kct_execution_member");

    static private final SubLString $$$S = makeString("S");

    static private final SubLString $$$H = makeString("H");

    static private final SubLString $$$X = makeString("X");

    static private final SubLString $str63$kct_config = makeString("kct_config");

    static private final SubLString $$$KB_Content_Test_System = makeString("KB Content Test System");

    static private final SubLString $str65$kct_collection_config = makeString("kct_collection_config");

    static private final SubLString $str66$test_cyclist_responsible_config = makeString("test_cyclist_responsible_config");

    static private final SubLString $str67$kct_config_cycl_binding_set = makeString("kct_config_cycl_binding_set");

    static private final SubLString $$$E = makeString("E");

    static private final SubLString $$$W = makeString("W");

    static private final SubLString $$$N = makeString("N");

    static private final SubLString $$$U = makeString("U");

    static private final SubLString $str72$kct_config_answer_support = makeString("kct_config_answer_support");

    static private final SubLString $$$M = makeString("M");

    static private final SubLString $str74$inference_param_config = makeString("inference_param_config");

    static private final SubLString $str75$test_metric_config = makeString("test_metric_config");

    static private final SubLString $$$Q = makeString("Q");

    static private final SubLString $$$B = makeString("B");

    static private final SubLString $str78$test_dependency_config = makeString("test_dependency_config");

    static private final SubLString $str79$kct_config_genls = makeString("kct_config_genls");

    static private final SubLString $str80$kct_config_isas = makeString("kct_config_isas");

    static private final SubLString $str81$Test_or_test_collection_GUID_must = makeString("Test or test collection GUID must be supplied.");

    static private final SubLString $str82$binding_designation = makeString("binding_designation");

    static private final SubLString $str83$cyclist_id = makeString("cyclist_id");

    static private final SubLString $str84$email_notify_style_id = makeString("email_notify_style_id");

    static private final SubLString $str85$execution_type = makeString("execution_type");

    static private final SubLString $str86$genls_id = makeString("genls_id");

    static private final SubLString $str87$image_type = makeString("image_type");

    static private final SubLString $str88$image_version = makeString("image_version");

    static private final SubLString $str89$inference_metric_id = makeString("inference_metric_id");

    static private final SubLString $str90$isa_id = makeString("isa_id");

    static private final SubLString $str91$kb_number = makeString("kb_number");

    static private final SubLString $str92$machine_hardware_type = makeString("machine_hardware_type");

    static private final SubLString $str93$machine_name = makeString("machine_name");

    static private final SubLString $str94$machine_type = makeString("machine_type");

    static private final SubLString $str95$os_type = makeString("os_type");

    static private final SubLString $str96$support_type = makeString("support-type");

    static private final SubLString $str97$system_version_num = makeString("system_version_num");

    static private final SubLString $str98$test_id = makeString("test_id");

    static private final SubLString $str99$test_status = makeString("test_status");

    static private final SubLString $str100$test_type = makeString("test_type");









    static private final SubLSymbol $sym113$CTEST_UNSUPPORTED_METRIC_ = makeSymbol("CTEST-UNSUPPORTED-METRIC?");

    public static final SubLObject initialize_ctest_alt() {
        $default_email_notify_style_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TestResultNotification_EmailBrief)));
        $default_test_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TKBTemplateTestForMissingMt)));
        $default_string_binding_set$.setGlobalValue($str_alt20$___TheSet____ELInferenceBindingFn);
        $default_binding_set$.setGlobalValue(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym21$_SOMETHING, $$$A_SOMETHING))));
        $default_binding_set2$.setGlobalValue(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym23$_OTHERTHING, $$$ANOTHER_THING))));
        $default_set_of_binding_sets$.setGlobalValue(bindings.make_kb_set_of_binding_sets(list(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym21$_SOMETHING, $$$A_SOMETHING))))));
        $default_set_of_binding_sets2$.setGlobalValue(bindings.make_kb_set_of_binding_sets(list(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym23$_OTHERTHING, $$$ANOTHER_THING))))));
        $default_set_of_binding_sets3$.setGlobalValue(bindings.make_kb_set_of_binding_sets(list(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym25$_ANOTHERTHING, $$$YET_ANOTHER_THING))))));
        $default_module_sentence$.setGlobalValue($list_alt27);
        $default_module_mt$.setGlobalValue($$BaseKB);
        $default_module_mt2$.setGlobalValue($$UniversalVocabularyMt);
        $default_dependency_test_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($const30$TKBTemplateTestForMissingExplanat)));
        $default_dependency_test_id2$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TKBTemplateTestForMissingExample)));
        $default_isa_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TKBTemplateIntegrityTest)));
        $default_isa_id2$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TKB_RTVQueries)));
        $default_test_query$.setGlobalValue($list_alt34);
        $default_test_mt$.setGlobalValue($$BaseKB);
        $default_collection_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($$TKBTemplateIntegrityTest)));
        return T;
    }

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

    public static final SubLObject kct_valid_execution_type_alt(SubLObject v_object) {
        return makeBoolean(v_object.equalp($collection_execution_type$.getGlobalValue()) || v_object.equalp($individual_execution_type$.getGlobalValue()));
    }

    public static SubLObject kct_valid_execution_type(final SubLObject v_object) {
        return makeBoolean(v_object.equalp($collection_execution_type$.getGlobalValue()) || v_object.equalp($individual_execution_type$.getGlobalValue()));
    }

    public static final SubLObject kct_valid_execution_mode_alt(SubLObject v_object) {
        return makeBoolean((v_object.equalp($sampling_execution_mode$.getGlobalValue()) || v_object.equalp($hypothesize_execution_mode$.getGlobalValue())) || v_object.equalp($simple_execution_mode$.getGlobalValue()));
    }

    public static SubLObject kct_valid_execution_mode(final SubLObject v_object) {
        return makeBoolean((v_object.equalp($sampling_execution_mode$.getGlobalValue()) || v_object.equalp($hypothesize_execution_mode$.getGlobalValue())) || v_object.equalp($simple_execution_mode$.getGlobalValue()));
    }

    public static final SubLObject kct_valid_collection_type_alt(SubLObject type) {
        return makeBoolean(type.equalp($collection_test_collection_type$.getGlobalValue()) || type.equalp($system_test_collection_type$.getGlobalValue()));
    }

    public static SubLObject kct_valid_collection_type(final SubLObject type) {
        return makeBoolean(type.equalp($collection_test_collection_type$.getGlobalValue()) || type.equalp($system_test_collection_type$.getGlobalValue()));
    }

    public static final SubLObject add_in_process_test_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == id) {
                    Errors.error($str_alt81$Test_or_test_collection_GUID_must);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.cyc_testing.ctest_utils.find_in_process_test(id)) {
                return T;
            } else {
                return dictionary.dictionary_enter($tests_in_process$.getDynamicValue(thread), id, T);
            }
        }
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

    public static final SubLObject find_in_process_test_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return dictionary.dictionary_lookup($tests_in_process$.getDynamicValue(thread), id, UNPROVIDED);
        }
    }

    public static SubLObject find_in_process_test(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup($tests_in_process$.getDynamicValue(thread), id, UNPROVIDED);
    }

    /**
     * After removing whitespace, trim VALUE to the length appropriate for FIELD-NAME.
     * If no max is specified, the original value, with white space stripped, is returned.
     */
    @LispMethod(comment = "After removing whitespace, trim VALUE to the length appropriate for FIELD-NAME.\r\nIf no max is specified, the original value, with white space stripped, is returned.\nAfter removing whitespace, trim VALUE to the length appropriate for FIELD-NAME.\nIf no max is specified, the original value, with white space stripped, is returned.")
    public static final SubLObject ctest_truncate_value_for_field_alt(SubLObject value, SubLObject field_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max_length = second(assoc(field_name, $ctest_field_maxima$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED));
                if (NIL != max_length) {
                    value = string_utilities.string_first_n(max_length, string_utilities.trim_whitespace(value));
                }
                if (value.isString()) {
                    return string_utilities.trim_whitespace(value);
                } else {
                    return value;
                }
            }
        }
    }

    /**
     * After removing whitespace, trim VALUE to the length appropriate for FIELD-NAME.
     * If no max is specified, the original value, with white space stripped, is returned.
     */
    @LispMethod(comment = "After removing whitespace, trim VALUE to the length appropriate for FIELD-NAME.\r\nIf no max is specified, the original value, with white space stripped, is returned.\nAfter removing whitespace, trim VALUE to the length appropriate for FIELD-NAME.\nIf no max is specified, the original value, with white space stripped, is returned.")
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

    /**
     * Validates the passed in test results output format
     */
    @LispMethod(comment = "Validates the passed in test results output format")
    public static final SubLObject valid_ctest_output_format_alt(SubLObject format) {
        return member(format, $ctest_output_formats$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Validates the passed in test results output format
     */
    @LispMethod(comment = "Validates the passed in test results output format")
    public static SubLObject valid_ctest_output_format(final SubLObject format) {
        return member(format, $ctest_output_formats$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Validates the passed in test results output style
     */
    @LispMethod(comment = "Validates the passed in test results output style")
    public static final SubLObject valid_ctest_output_style_alt(SubLObject style) {
        return member(style, $ctest_output_styles$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Validates the passed in test results output style
     */
    @LispMethod(comment = "Validates the passed in test results output style")
    public static SubLObject valid_ctest_output_style(final SubLObject style) {
        return member(style, $ctest_output_styles$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Validates the passed in test type
     */
    @LispMethod(comment = "Validates the passed in test type")
    public static final SubLObject valid_ctest_type_alt(SubLObject type) {
        return member(type, $ctest_test_types$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Validates the passed in test type
     */
    @LispMethod(comment = "Validates the passed in test type")
    public static SubLObject valid_ctest_type(final SubLObject type) {
        return member(type, $ctest_test_types$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Validates the passed in test status
     */
    @LispMethod(comment = "Validates the passed in test status")
    public static final SubLObject valid_ctest_status_alt(SubLObject status) {
        return member(status, $ctest_test_statuses$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Validates the passed in test status
     */
    @LispMethod(comment = "Validates the passed in test status")
    public static SubLObject valid_ctest_status(final SubLObject status) {
        return member(status, $ctest_test_statuses$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Validates the passed in answer support type
     */
    @LispMethod(comment = "Validates the passed in answer support type")
    public static final SubLObject valid_ctest_support_type_alt(SubLObject type) {
        return member(type, $ctest_support_types$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Validates the passed in answer support type
     */
    @LispMethod(comment = "Validates the passed in answer support type")
    public static SubLObject valid_ctest_support_type(final SubLObject type) {
        return member(type, $ctest_support_types$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Validates the passed in answer support designation
     */
    @LispMethod(comment = "Validates the passed in answer support designation")
    public static final SubLObject valid_ctest_support_designation_alt(SubLObject designation) {
        return member(designation, $ctest_support_designations$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Validates the passed in answer support designation
     */
    @LispMethod(comment = "Validates the passed in answer support designation")
    public static SubLObject valid_ctest_support_designation(final SubLObject designation) {
        return member(designation, $ctest_support_designations$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject valid_ctest_suppport_tv_alt(SubLObject v_object) {
        {
            SubLObject pcase_var = v_object;
            if (((((pcase_var.eql($TRUE) || pcase_var.eql($FALSE)) || pcase_var.eql($TRUE_DEF)) || pcase_var.eql($TRUE_MON)) || pcase_var.eql($FALSE_DEF)) || pcase_var.eql($FALSE_MON)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject valid_ctest_suppport_tv(final SubLObject v_object) {
        if (((((v_object.eql($TRUE) || v_object.eql($FALSE)) || v_object.eql($TRUE_DEF)) || v_object.eql($TRUE_MON)) || v_object.eql($FALSE_DEF)) || v_object.eql($FALSE_MON)) {
            return T;
        }
        return NIL;
    }

    /**
     * Returns T iff OBJECT is one of the known binding designations.
     */
    @LispMethod(comment = "Returns T iff OBJECT is one of the known binding designations.")
    public static final SubLObject valid_ctest_binding_designation_alt(SubLObject v_object) {
        return member(v_object, $kct_binding_set_designations$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Returns T iff OBJECT is one of the known binding designations.
     */
    @LispMethod(comment = "Returns T iff OBJECT is one of the known binding designations.")
    public static SubLObject valid_ctest_binding_designation(final SubLObject v_object) {
        return member(v_object, $kct_binding_set_designations$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Returns the supplied string, with leading and trailing text added.
     * If the leading, trailing, or both params are nil, they are simply not
     * pre or post-pended to the string.
     */
    @LispMethod(comment = "Returns the supplied string, with leading and trailing text added.\r\nIf the leading, trailing, or both params are nil, they are simply not\r\npre or post-pended to the string.\nReturns the supplied string, with leading and trailing text added.\nIf the leading, trailing, or both params are nil, they are simply not\npre or post-pended to the string.")
    public static final SubLObject add_leading_and_trailing_text_alt(SubLObject string, SubLObject leading, SubLObject trailing) {
        if (NIL != leading) {
            string = string_utilities.pre_fix(string, leading);
        }
        if (NIL != trailing) {
            string = string_utilities.post_fix(string, trailing);
        }
        return string;
    }

    /**
     * Returns the supplied string, with leading and trailing text added.
     * If the leading, trailing, or both params are nil, they are simply not
     * pre or post-pended to the string.
     */
    @LispMethod(comment = "Returns the supplied string, with leading and trailing text added.\r\nIf the leading, trailing, or both params are nil, they are simply not\r\npre or post-pended to the string.\nReturns the supplied string, with leading and trailing text added.\nIf the leading, trailing, or both params are nil, they are simply not\npre or post-pended to the string.")
    public static SubLObject add_leading_and_trailing_text(SubLObject string, final SubLObject leading, final SubLObject trailing) {
        if (NIL != leading) {
            string = string_utilities.pre_fix(string, leading);
        }
        if (NIL != trailing) {
            string = string_utilities.post_fix(string, trailing);
        }
        return string;
    }

    /**
     * Escapes double quotes in STRING, in preparation for interaction with the db via SDBC.
     */
    @LispMethod(comment = "Escapes double quotes in STRING, in preparation for interaction with the db via SDBC.")
    public static final SubLObject escape_double_quotes_alt(SubLObject string) {
        return string_utilities.to_lisp_string(string_utilities.to_lisp_string(string));
    }

    /**
     * Escapes double quotes in STRING, in preparation for interaction with the db via SDBC.
     */
    @LispMethod(comment = "Escapes double quotes in STRING, in preparation for interaction with the db via SDBC.")
    public static SubLObject escape_double_quotes(final SubLObject string) {
        return string_utilities.to_lisp_string(string_utilities.to_lisp_string(string));
    }

    public static final SubLObject kct_test_metric_from_keyword_alt(SubLObject keyword) {
        SubLTrampolineFile.checkType(keyword, KEYWORDP);
        return subl_identifier.cyc_entity_from_sublid(keyword, $$IndividualTestMetric);
    }

    public static SubLObject kct_test_metric_from_keyword(final SubLObject keyword) {
        assert NIL != keywordp(keyword) : "! keywordp(keyword) " + ("Types.keywordp(keyword) " + "CommonSymbols.NIL != Types.keywordp(keyword) ") + keyword;
        return subl_identifier.cyc_entity_from_sublid(keyword, $$IndividualTestMetric);
    }

    public static final SubLObject kct_collection_test_metric_from_keyword_alt(SubLObject keyword) {
        SubLTrampolineFile.checkType(keyword, KEYWORDP);
        return subl_identifier.cyc_entity_from_sublid(keyword, $$CollectionTestMetric);
    }

    public static SubLObject kct_collection_test_metric_from_keyword(final SubLObject keyword) {
        assert NIL != keywordp(keyword) : "! keywordp(keyword) " + ("Types.keywordp(keyword) " + "CommonSymbols.NIL != Types.keywordp(keyword) ") + keyword;
        return subl_identifier.cyc_entity_from_sublid(keyword, $$CollectionTestMetric);
    }

    public static final SubLObject kct_keyword_from_test_metric_alt(SubLObject metric) {
        SubLTrampolineFile.checkType(metric, CONSTANT_P);
        return subl_identifier.sublid_from_cyc_entity(metric);
    }

    public static SubLObject kct_keyword_from_test_metric(final SubLObject metric) {
        assert NIL != constant_p(metric) : "! constant_handles.constant_p(metric) " + ("constant_handles.constant_p(metric) " + "CommonSymbols.NIL != constant_handles.constant_p(metric) ") + metric;
        return subl_identifier.sublid_from_cyc_entity(metric);
    }

    public static final SubLObject ctest_kb_test_metric_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != isa.isa_in_any_mtP(v_object, $$TestMetric)));
    }

    public static SubLObject ctest_kb_test_metric_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != isa.isa_in_any_mtP(v_object, $$TestMetric)));
    }

    /**
     * Return T if OBJECT is an instance of #$UnsupportedTestMetric.
     */
    @LispMethod(comment = "Return T if OBJECT is an instance of #$UnsupportedTestMetric.")
    public static final SubLObject ctest_unsupported_metricP_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != isa.isa_in_any_mtP(v_object, $$UnsupportedTestMetric)));
    }

    /**
     * Return T if OBJECT is an instance of #$UnsupportedTestMetric.
     */
    @LispMethod(comment = "Return T if OBJECT is an instance of #$UnsupportedTestMetric.")
    public static SubLObject ctest_unsupported_metricP(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != isa.isa_in_any_mtP(v_object, $$UnsupportedTestMetric)));
    }

    public static final SubLObject ctest_all_kb_test_metric_constants_alt() {
        {
            SubLObject result = list_utilities.remove_if_not(symbol_function(CONSTANT_P), isa.all_fort_instances_in_all_mts($$IndividualTestMetric), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            result = remove_if(symbol_function($sym113$CTEST_UNSUPPORTED_METRIC_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    public static SubLObject ctest_all_kb_test_metric_constants() {
        SubLObject result = list_utilities.remove_if_not(symbol_function(CONSTANT_P), isa.all_fort_instances_in_all_mts($$IndividualTestMetric), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        result = remove_if(symbol_function($sym113$CTEST_UNSUPPORTED_METRIC_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static final SubLObject ctest_all_kb_collection_test_metric_constants_alt() {
        {
            SubLObject result = list_utilities.remove_if_not(symbol_function(CONSTANT_P), isa.all_fort_instances_in_all_mts($$CollectionTestMetric), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            result = remove_if(symbol_function($sym113$CTEST_UNSUPPORTED_METRIC_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    public static SubLObject ctest_all_kb_collection_test_metric_constants() {
        SubLObject result = list_utilities.remove_if_not(symbol_function(CONSTANT_P), isa.all_fort_instances_in_all_mts($$CollectionTestMetric), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        result = remove_if(symbol_function($sym113$CTEST_UNSUPPORTED_METRIC_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static SubLObject declare_ctest_utils_file() {
        declareFunction("initialize_ctest", "INITIALIZE-CTEST", 0, 0, false);
        declareFunction("kct_valid_execution_type", "KCT-VALID-EXECUTION-TYPE", 1, 0, false);
        declareFunction("kct_valid_execution_mode", "KCT-VALID-EXECUTION-MODE", 1, 0, false);
        declareFunction("kct_valid_collection_type", "KCT-VALID-COLLECTION-TYPE", 1, 0, false);
        declareFunction("add_in_process_test", "ADD-IN-PROCESS-TEST", 1, 0, false);
        declareFunction("find_in_process_test", "FIND-IN-PROCESS-TEST", 1, 0, false);
        declareFunction("ctest_truncate_value_for_field", "CTEST-TRUNCATE-VALUE-FOR-FIELD", 2, 0, false);
        declareFunction("valid_ctest_output_format", "VALID-CTEST-OUTPUT-FORMAT", 1, 0, false);
        declareFunction("valid_ctest_output_style", "VALID-CTEST-OUTPUT-STYLE", 1, 0, false);
        declareFunction("valid_ctest_type", "VALID-CTEST-TYPE", 1, 0, false);
        declareFunction("valid_ctest_status", "VALID-CTEST-STATUS", 1, 0, false);
        declareFunction("valid_ctest_support_type", "VALID-CTEST-SUPPORT-TYPE", 1, 0, false);
        declareFunction("valid_ctest_support_designation", "VALID-CTEST-SUPPORT-DESIGNATION", 1, 0, false);
        declareFunction("valid_ctest_suppport_tv", "VALID-CTEST-SUPPPORT-TV", 1, 0, false);
        declareFunction("valid_ctest_binding_designation", "VALID-CTEST-BINDING-DESIGNATION", 1, 0, false);
        declareFunction("add_leading_and_trailing_text", "ADD-LEADING-AND-TRAILING-TEXT", 3, 0, false);
        declareFunction("escape_double_quotes", "ESCAPE-DOUBLE-QUOTES", 1, 0, false);
        declareFunction("kct_test_metric_from_keyword", "KCT-TEST-METRIC-FROM-KEYWORD", 1, 0, false);
        declareFunction("kct_collection_test_metric_from_keyword", "KCT-COLLECTION-TEST-METRIC-FROM-KEYWORD", 1, 0, false);
        declareFunction("kct_keyword_from_test_metric", "KCT-KEYWORD-FROM-TEST-METRIC", 1, 0, false);
        declareFunction("ctest_kb_test_metric_p", "CTEST-KB-TEST-METRIC-P", 1, 0, false);
        declareFunction("ctest_unsupported_metricP", "CTEST-UNSUPPORTED-METRIC?", 1, 0, false);
        declareFunction("ctest_all_kb_test_metric_constants", "CTEST-ALL-KB-TEST-METRIC-CONSTANTS", 0, 0, false);
        declareFunction("ctest_all_kb_collection_test_metric_constants", "CTEST-ALL-KB-COLLECTION-TEST-METRIC-CONSTANTS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_ctest_utils_file_alt() {
        deflexical("*DEFAULT-EMAIL-NOTIFY-STYLE-ID*", NIL != boundp($default_email_notify_style_id$) ? ((SubLObject) ($default_email_notify_style_id$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-TEST-ID*", NIL != boundp($default_test_id$) ? ((SubLObject) ($default_test_id$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-STRING-BINDING-SET*", NIL != boundp($default_string_binding_set$) ? ((SubLObject) ($default_string_binding_set$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-BINDING-SET*", NIL != boundp($default_binding_set$) ? ((SubLObject) ($default_binding_set$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-BINDING-SET2*", NIL != boundp($sym4$_DEFAULT_BINDING_SET2_) ? ((SubLObject) ($default_binding_set2$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-SET-OF-BINDING-SETS*", NIL != boundp($default_set_of_binding_sets$) ? ((SubLObject) ($default_set_of_binding_sets$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-SET-OF-BINDING-SETS2*", NIL != boundp($sym6$_DEFAULT_SET_OF_BINDING_SETS2_) ? ((SubLObject) ($default_set_of_binding_sets2$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-SET-OF-BINDING-SETS3*", NIL != boundp($sym7$_DEFAULT_SET_OF_BINDING_SETS3_) ? ((SubLObject) ($default_set_of_binding_sets3$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-MODULE-SENTENCE*", NIL != boundp($default_module_sentence$) ? ((SubLObject) ($default_module_sentence$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-MODULE-MT*", NIL != boundp($default_module_mt$) ? ((SubLObject) ($default_module_mt$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-MODULE-MT2*", NIL != boundp($sym10$_DEFAULT_MODULE_MT2_) ? ((SubLObject) ($default_module_mt2$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-DEPENDENCY-TEST-ID*", NIL != boundp($default_dependency_test_id$) ? ((SubLObject) ($default_dependency_test_id$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-DEPENDENCY-TEST-ID2*", NIL != boundp($sym12$_DEFAULT_DEPENDENCY_TEST_ID2_) ? ((SubLObject) ($default_dependency_test_id2$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-ISA-ID*", NIL != boundp($default_isa_id$) ? ((SubLObject) ($default_isa_id$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-ISA-ID2*", NIL != boundp($sym14$_DEFAULT_ISA_ID2_) ? ((SubLObject) ($default_isa_id2$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-TEST-QUERY*", NIL != boundp($default_test_query$) ? ((SubLObject) ($default_test_query$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-TEST-MT*", NIL != boundp($default_test_mt$) ? ((SubLObject) ($default_test_mt$.getGlobalValue())) : NIL);
        deflexical("*DEFAULT-COLLECTION-ID*", NIL != boundp($default_collection_id$) ? ((SubLObject) ($default_collection_id$.getGlobalValue())) : NIL);
        defconstant("*CTEST-OUTPUT-FORMATS*", list($TEXT, $HTML));
        defconstant("*CTEST-OUTPUT-STYLES*", list($BRIEF, $VERBOSE, $POST_BUILD));
        defconstant("*MAX-TEST-RETRY-TIME*", $int$60);
        defconstant("*CSC-TABLE-NAME*", $str_alt41$cyc_system_config);
        defconstant("*MAX-IMAGE-TYPE-LEN*", $int$50);
        defconstant("*MAX-IMAGE-VERSION-LEN*", $int$50);
        defconstant("*MAX-SYSTEM-VERSION-NUM-LEN*", TEN_INTEGER);
        defconstant("*MAX-KB-NUMBER-LEN*", TWELVE_INTEGER);
        defconstant("*MC-TABLE-NAME*", $str_alt43$machine_config);
        defconstant("*MAX-MACHINE-NAME-LEN*", $int$100);
        defconstant("*MAX-MACHINE-TYPE-LEN*", $int$50);
        defconstant("*MAX-MACHINE-HARDWARE-TYPE-LEN*", TWENTY_INTEGER);
        defconstant("*MAX-OS-TYPE-LEN*", $int$50);
        defconstant("*TE-TABLE-NAME*", $str_alt45$test_execution);
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
        defconstant("*TCMR-TABLE-NAME*", $str_alt53$test_collection_metric_result);
        defconstant("*MAX-METRIC-ID-LEN*", $int$100);
        defconstant("*TMR-TABLE-NAME*", $str_alt54$test_metric_result);
        defconstant("*TEM-TABLE-NAME*", $str_alt55$test_execution_member);
        defconstant("*KCTE-TABLE-NAME*", $str_alt56$kct_execution);
        defconstant("*MAX-EXEC-TYPE-LEN*", ONE_INTEGER);
        defconstant("*COLLECTION-EXECUTION-TYPE*", $$$C);
        defconstant("*INDIVIDUAL-EXECUTION-TYPE*", $$$I);
        defconstant("*KCTEM-TABLE-NAME*", $str_alt59$kct_execution_member);
        defconstant("*MAX-EXEC-MODE-LEN*", ONE_INTEGER);
        defconstant("*SAMPLING-EXECUTION-MODE*", $$$S);
        defconstant("*HYPOTHESIZE-EXECUTION-MODE*", $$$H);
        defconstant("*SIMPLE-EXECUTION-MODE*", $$$X);
        defconstant("*KCTC-TABLE-NAME*", $str_alt63$kct_config);
        defconstant("*KCTS-PROJECT-DESC*", $$$KB_Content_Test_System);
        defconstant("*KCTCC-TABLE-NAME*", $str_alt65$kct_collection_config);
        defconstant("*MAX-COLLECTION-TYPE-LEN*", ONE_INTEGER);
        defconstant("*COLLECTION-TEST-COLLECTION-TYPE*", $$$C);
        defconstant("*SYSTEM-TEST-COLLECTION-TYPE*", $$$S);
        defconstant("*TCRC-TABLE-NAME*", $str_alt66$test_cyclist_responsible_config);
        defconstant("*MAX-CYCLIST-ID-LEN*", $int$100);
        defconstant("*MAX-EMAIL-NOTIFY-STYLE-ID-LEN*", $int$100);
        defconstant("*KCTCCBS-TABLE-NAME*", $str_alt67$kct_config_cycl_binding_set);
        defconstant("*MAX-BINDING-DESIGNATION-LEN*", ONE_INTEGER);
        defconstant("*KCT-EXACT-BINDING-SET-DESIGNATION*", $$$E);
        defconstant("*KCT-WANTED-BINDING-SET-DESIGNATION*", $$$W);
        defconstant("*KCT-UNWANTED-BINDING-SET-DESIGNATION*", $$$N);
        defconstant("*KCT-UNIMPORTANT-BINDING-SET-DESIGNATION*", $$$U);
        defconstant("*KCT-BINDING-SET-DESIGNATIONS*", list($$$E, $$$W, $$$N, $$$U));
        defconstant("*KCTCAS-TABLE-NAME*", $str_alt72$kct_config_answer_support);
        defconstant("*MAX-SUPPORT-TYPE-LEN*", ONE_INTEGER);
        defconstant("*MAX-SUPPORT-DESIGNATION-LEN*", ONE_INTEGER);
        defconstant("*CTEST-SUPPORT-TYPES*", list($$$M, $$$S));
        defconstant("*CTEST-SUPPORT-DESIGNATIONS*", list($$$W, $$$N));
        defconstant("*KCT-WANTED-SUPPORT-DESIGNATION*", $$$W);
        defconstant("*KCT-UNWANTED-SUPPORT-DESIGNATION*", $$$N);
        defconstant("*KCT-SUPPORT-SUPPORT-TYPE*", $$$S);
        defconstant("*KCT-MODULE-SUPPORT-TYPE*", $$$M);
        defconstant("*IPC-TABLE-NAME*", $str_alt74$inference_param_config);
        defconstant("*MAX-INFERENCE-PARAM-ID-LEN*", $int$100);
        defconstant("*TMC-TABLE-NAME*", $str_alt75$test_metric_config);
        defconstant("*MAX-TEST-METRIC-TYPE-LEN*", ONE_INTEGER);
        defconstant("*CTEST-METRIC-TYPES*", list($$$C, $$$Q, $$$B));
        defconstant("*CTEST-COLLECTION-LEVEL-METRIC*", $$$C);
        defconstant("*CTEST-QUERY-LEVEL-METRIC*", $$$Q);
        defconstant("*CTEST-BINDING-LEVEL-METRIC*", $$$B);
        defconstant("*TDC-TABLE-NAME*", $str_alt78$test_dependency_config);
        defconstant("*KCTCG-TABLE-NAME*", $str_alt79$kct_config_genls);
        defconstant("*KCTCI-TABLE-NAME*", $str_alt80$kct_config_isas);
        defparameter("*CTEST-STORING-P*", NIL);
        defparameter("*CTEST-STORING-CONFIGS-P*", NIL);
        defparameter("*CTEST-REQUIRED-METRICS*", NIL);
        defparameter("*TESTS-IN-PROCESS*", NIL);
        defparameter("*CTEST-FIELD-MAXIMA*", list(new SubLObject[]{ list($str_alt82$binding_designation, $max_binding_designation_len$.getGlobalValue()), list($str_alt83$cyclist_id, $max_cyclist_id_len$.getGlobalValue()), list($str_alt84$email_notify_style_id, $max_email_notify_style_id_len$.getGlobalValue()), list($str_alt85$execution_type, $max_exec_type_len$.getGlobalValue()), list($str_alt86$genls_id, $max_test_id_len$.getGlobalValue()), list($str_alt87$image_type, $max_image_type_len$.getGlobalValue()), list($str_alt88$image_version, $max_image_version_len$.getGlobalValue()), list($str_alt89$inference_metric_id, $max_metric_id_len$.getGlobalValue()), list($str_alt90$isa_id, $max_test_id_len$.getGlobalValue()), list($str_alt91$kb_number, $max_kb_number_len$.getGlobalValue()), list($str_alt92$machine_hardware_type, $max_machine_hardware_type_len$.getGlobalValue()), list($str_alt93$machine_name, $max_machine_name_len$.getGlobalValue()), list($str_alt94$machine_type, $max_machine_type_len$.getGlobalValue()), list($str_alt95$os_type, $max_os_type_len$.getGlobalValue()), list($str_alt96$support_type, $max_support_type_len$.getGlobalValue()), list($str_alt97$system_version_num, $max_system_version_num_len$.getGlobalValue()), list($str_alt98$test_id, $max_test_id_len$.getGlobalValue()), list($str_alt99$test_status, $max_test_status_len$.getGlobalValue()), list($str_alt100$test_type, $max_test_type_len$.getGlobalValue()) }));
        return NIL;
    }

    public static SubLObject init_ctest_utils_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            deflexical("*DEFAULT-EMAIL-NOTIFY-STYLE-ID*", NIL != boundp($default_email_notify_style_id$) ? ((SubLObject) ($default_email_notify_style_id$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-TEST-ID*", NIL != boundp($default_test_id$) ? ((SubLObject) ($default_test_id$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-STRING-BINDING-SET*", NIL != boundp($default_string_binding_set$) ? ((SubLObject) ($default_string_binding_set$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-BINDING-SET*", NIL != boundp($default_binding_set$) ? ((SubLObject) ($default_binding_set$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-BINDING-SET2*", NIL != boundp($sym4$_DEFAULT_BINDING_SET2_) ? ((SubLObject) ($default_binding_set2$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-SET-OF-BINDING-SETS*", NIL != boundp($default_set_of_binding_sets$) ? ((SubLObject) ($default_set_of_binding_sets$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-SET-OF-BINDING-SETS2*", NIL != boundp($sym6$_DEFAULT_SET_OF_BINDING_SETS2_) ? ((SubLObject) ($default_set_of_binding_sets2$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-SET-OF-BINDING-SETS3*", NIL != boundp($sym7$_DEFAULT_SET_OF_BINDING_SETS3_) ? ((SubLObject) ($default_set_of_binding_sets3$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-MODULE-SENTENCE*", NIL != boundp($default_module_sentence$) ? ((SubLObject) ($default_module_sentence$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-MODULE-MT*", NIL != boundp($default_module_mt$) ? ((SubLObject) ($default_module_mt$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-MODULE-MT2*", NIL != boundp($sym10$_DEFAULT_MODULE_MT2_) ? ((SubLObject) ($default_module_mt2$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-DEPENDENCY-TEST-ID*", NIL != boundp($default_dependency_test_id$) ? ((SubLObject) ($default_dependency_test_id$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-DEPENDENCY-TEST-ID2*", NIL != boundp($sym12$_DEFAULT_DEPENDENCY_TEST_ID2_) ? ((SubLObject) ($default_dependency_test_id2$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-ISA-ID*", NIL != boundp($default_isa_id$) ? ((SubLObject) ($default_isa_id$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-ISA-ID2*", NIL != boundp($sym14$_DEFAULT_ISA_ID2_) ? ((SubLObject) ($default_isa_id2$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-TEST-QUERY*", NIL != boundp($default_test_query$) ? ((SubLObject) ($default_test_query$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-TEST-MT*", NIL != boundp($default_test_mt$) ? ((SubLObject) ($default_test_mt$.getGlobalValue())) : NIL);
            deflexical("*DEFAULT-COLLECTION-ID*", NIL != boundp($default_collection_id$) ? ((SubLObject) ($default_collection_id$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_ctest_utils_file_Previous() {
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

    static private final SubLString $str_alt20$___TheSet____ELInferenceBindingFn = makeString("(#$TheSet (#$ELInferenceBindingFn ?SOMETHING \"A SOMETHING\"))");

    static private final SubLList $list_alt27 = list(reader_make_constant_shell("genls"), reader_make_constant_shell("Collection"), reader_make_constant_shell("Thing"));

    static private final SubLList $list_alt34 = list(reader_make_constant_shell("genls"), reader_make_constant_shell("Collection"), makeSymbol("?WHAT"));

    static private final SubLString $str_alt41$cyc_system_config = makeString("cyc_system_config");

    static private final SubLString $str_alt43$machine_config = makeString("machine_config");

    static private final SubLString $str_alt45$test_execution = makeString("test_execution");

    static private final SubLString $str_alt53$test_collection_metric_result = makeString("test_collection_metric_result");

    static private final SubLString $str_alt54$test_metric_result = makeString("test_metric_result");

    static private final SubLString $str_alt55$test_execution_member = makeString("test_execution_member");

    static private final SubLString $str_alt56$kct_execution = makeString("kct_execution");

    static private final SubLString $str_alt59$kct_execution_member = makeString("kct_execution_member");

    static private final SubLString $str_alt63$kct_config = makeString("kct_config");

    static private final SubLString $str_alt65$kct_collection_config = makeString("kct_collection_config");

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

    static private final SubLString $str_alt66$test_cyclist_responsible_config = makeString("test_cyclist_responsible_config");

    static private final SubLString $str_alt67$kct_config_cycl_binding_set = makeString("kct_config_cycl_binding_set");

    static private final SubLString $str_alt72$kct_config_answer_support = makeString("kct_config_answer_support");

    static private final SubLString $str_alt74$inference_param_config = makeString("inference_param_config");

    static private final SubLString $str_alt75$test_metric_config = makeString("test_metric_config");

    static private final SubLString $str_alt78$test_dependency_config = makeString("test_dependency_config");

    @Override
    public void declareFunctions() {
        declare_ctest_utils_file();
    }

    @Override
    public void initializeVariables() {
        init_ctest_utils_file();
    }

    static private final SubLString $str_alt79$kct_config_genls = makeString("kct_config_genls");

    @Override
    public void runTopLevelForms() {
        setup_ctest_utils_file();
    }

    static private final SubLString $str_alt80$kct_config_isas = makeString("kct_config_isas");

    static {
    }

    static private final SubLString $str_alt81$Test_or_test_collection_GUID_must = makeString("Test or test collection GUID must be supplied.");

    static private final SubLString $str_alt82$binding_designation = makeString("binding_designation");

    static private final SubLString $str_alt83$cyclist_id = makeString("cyclist_id");

    static private final SubLString $str_alt84$email_notify_style_id = makeString("email_notify_style_id");

    static private final SubLString $str_alt85$execution_type = makeString("execution_type");

    static private final SubLString $str_alt86$genls_id = makeString("genls_id");

    static private final SubLString $str_alt87$image_type = makeString("image_type");

    static private final SubLString $str_alt88$image_version = makeString("image_version");

    static private final SubLString $str_alt89$inference_metric_id = makeString("inference_metric_id");

    static private final SubLString $str_alt90$isa_id = makeString("isa_id");

    static private final SubLString $str_alt91$kb_number = makeString("kb_number");

    static private final SubLString $str_alt92$machine_hardware_type = makeString("machine_hardware_type");

    static private final SubLString $str_alt93$machine_name = makeString("machine_name");

    static private final SubLString $str_alt94$machine_type = makeString("machine_type");

    static private final SubLString $str_alt95$os_type = makeString("os_type");

    static private final SubLString $str_alt96$support_type = makeString("support-type");

    static private final SubLString $str_alt97$system_version_num = makeString("system_version_num");

    static private final SubLString $str_alt98$test_id = makeString("test_id");

    static private final SubLString $str_alt99$test_status = makeString("test_status");

    static private final SubLString $str_alt100$test_type = makeString("test_type");
}

/**
 * Total time: 493 ms
 */
