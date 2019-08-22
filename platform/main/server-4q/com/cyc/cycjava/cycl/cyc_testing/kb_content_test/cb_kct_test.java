package com.cyc.cycjava.cycl.cyc_testing.kb_content_test;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.cb_assertion_editor;
import com.cyc.cycjava.cycl.cb_editor;
import com.cyc.cycjava.cycl.cb_form_widgets;
import com.cyc.cycjava.cycl.cb_tools;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.cyc_testing.ctest_utils;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query_state;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.browser.cb_query_browser;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
 public final class cb_kct_test extends SubLTranslatedFile {
    public static final SubLFile me = new cb_kct_test();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.cb_kct_test";

    public static final String myFingerPrint = "109ed2b2c707701970e2ebf837cd62ef2090a97130ff272c0847c949cc6f68be";

    // defparameter
    public static final SubLSymbol $cb_kct_refreshP$ = makeSymbol("*CB-KCT-REFRESH?*");

    // defparameter
    private static final SubLSymbol $kct_inference_test_spec_map$ = makeSymbol("*KCT-INFERENCE-TEST-SPEC-MAP*");

    // defconstant
    public static final SubLSymbol $dtp_kct_test_state$ = makeSymbol("*DTP-KCT-TEST-STATE*");



    // defconstant
    public static final SubLSymbol $dtp_kct_answer$ = makeSymbol("*DTP-KCT-ANSWER*");



    // Internal Constants
    public static final SubLString $str0$_Run_Test_ = makeString("[Run Test]");



    public static final SubLString $str2$cb_kct_test_run__a = makeString("cb-kct-test-run&~a");



    public static final SubLSymbol CB_LINK_KCT_TEST = makeSymbol("CB-LINK-KCT-TEST");

    public static final SubLSymbol CB_KCT_TEST_RUN = makeSymbol("CB-KCT-TEST-RUN");



    private static final SubLString $str7$_Run_Test_Set_ = makeString("[Run Test Set]");

    private static final SubLString $str8$cb_kct_test_set_run__a = makeString("cb-kct-test-set-run&~a");

    private static final SubLSymbol $KCT_TEST_SET = makeKeyword("KCT-TEST-SET");

    private static final SubLSymbol CB_LINK_KCT_TEST_SET = makeSymbol("CB-LINK-KCT-TEST-SET");

    private static final SubLSymbol CB_KCT_TEST_SET_RUN = makeSymbol("CB-KCT-TEST-SET-RUN");



    private static final SubLString $$$KB_Content_Test_Monitor = makeString("KB Content Test Monitor");

    private static final SubLString $$$KCTRun = makeString("KCTRun");

    private static final SubLString $str15$View_status_of_running_and_comple = makeString("View status of running and completed KB Content Tests");

    private static final SubLString $str16$_KCTRun_ = makeString("[KCTRun]");

    private static final SubLString $str17$cb_kct_main = makeString("cb-kct-main");

    private static final SubLSymbol CB_LINK_KCT = makeSymbol("CB-LINK-KCT");

    private static final SubLSymbol $sym19$_CB_KCT_REFRESH__ = makeSymbol("*CB-KCT-REFRESH?*");

    private static final SubLString $str20$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str21$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLString $$$Refresh = makeString("Refresh");

    private static final SubLString $str25$5__URL_cg_cb_kct_main = makeString("5; URL=cg?cb-kct-main");

    private static final SubLString $str26$_9999ff = makeString("#9999ff");

    private static final SubLString $str27$_ffffff = makeString("#ffffff");



    private static final SubLSymbol $KCT_TOGGLE_REFRESH = makeKeyword("KCT-TOGGLE-REFRESH");

    private static final SubLList $list30 = list(makeString("main"));

    private static final SubLString $str31$None_running_ = makeString("None running.");

    private static final SubLString $$$Individual_Tests = makeString("Individual Tests");

    private static final SubLString $$$Test_Categories = makeString("Test Categories");

    private static final SubLString $str34$There_are_no_running_or_finished_ = makeString("There are no running or finished tests at this time.");

    private static final SubLSymbol CB_KCT_MAIN = makeSymbol("CB-KCT-MAIN");

    private static final SubLString $str36$_99ccff = makeString("#99ccff");

    private static final SubLString $$$TEST = makeString("TEST");

    private static final SubLString $$$TASK_STATUS = makeString("TASK STATUS");

    private static final SubLString $$$TASK_ACTIONS = makeString("TASK ACTIONS");

    private static final SubLString $$$TEST_RESULT = makeString("TEST RESULT");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str42$cb_kct_start_test = makeString("cb-kct-start-test");

    private static final SubLString $str43$Enter_test_to_run___ = makeString("Enter test to run : ");

    private static final SubLString $str44$kct_test = makeString("kct-test");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLObject $$KBContentTest_FullySpecified = reader_make_constant_shell(makeString("KBContentTest-FullySpecified"));

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLString $$$Run_Test = makeString("Run Test");

    private static final SubLString $str50$cb_kct_start_test_collection = makeString("cb-kct-start-test-collection");

    private static final SubLString $str51$Enter_test_category_to_run___ = makeString("Enter test category to run : ");

    private static final SubLString $str52$kct_coll = makeString("kct-coll");

    private static final SubLObject $$KBContentTestSpecificationType = reader_make_constant_shell(makeString("KBContentTestSpecificationType"));

    private static final SubLString $str54$_A_is_not_the_name_of_a___KBConte = makeString("~A is not the name of a #$KBContentTest-FullySpecified.");

    private static final SubLSymbol CB_KCT_START_TEST = makeSymbol("CB-KCT-START-TEST");

    private static final SubLString $str56$_A_is_not_the_name_of_a___KBConte = makeString("~A is not the name of a #$KBContentTestSpecificationType.");

    private static final SubLSymbol CB_KCT_START_TEST_COLLECTION = makeSymbol("CB-KCT-START-TEST-COLLECTION");





    private static final SubLString $str60$_99ffff = makeString("#99ffff");





    private static final SubLString $str63$_cccccc = makeString("#cccccc");



    private static final SubLString $str65$_ff6666 = makeString("#ff6666");















    private static final SubLString $str73$_Edit_Test_ = makeString("[Edit Test]");









    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str79$Task_is_just_starting_ = makeString("Task is just starting.");

    private static final SubLString $str80$Test_halted_with_this_error___A = makeString("Test halted with this error: ~A");

    private static final SubLString $str81$Task_was_halted_before_completion = makeString("Task was halted before completion.");



    private static final SubLString $str83$Test_is_un_executable_due_to_conf = makeString("Test is un-executable due to configuration errors.  Email detailing problems has been sent to the responsible cyclist.  Problems:  ~A");



    private static final SubLString $str85$Task_was_never_begun_ = makeString("Task was never begun.");

    private static final SubLString $str86$Unknown_thinking_status__A = makeString("Unknown thinking status ~A");

    private static final SubLString $str87$_Halt_Auto_Refresh_ = makeString("[Halt Auto Refresh]");

    private static final SubLString $str88$_Start_Auto_Refresh_ = makeString("[Start Auto Refresh]");

    private static final SubLString $str89$cb_kct_toggle_refresh = makeString("cb-kct-toggle-refresh");

    private static final SubLString $str90$_ = makeString("|");

    private static final SubLSymbol CB_LINK_KCT_TOGGLE_REFRESH = makeSymbol("CB-LINK-KCT-TOGGLE-REFRESH");

    private static final SubLString $$$main = makeString("main");

    private static final SubLString $$$members = makeString("members");

    private static final SubLSymbol CB_KCT_TOGGLE_REFRESH = makeSymbol("CB-KCT-TOGGLE-REFRESH");

    private static final SubLString $str95$_Forget_ = makeString("[Forget]");

    private static final SubLString $str96$cb_kct_thinking_forget__a = makeString("cb-kct-thinking-forget&~a");

    private static final SubLSymbol CB_LINK_KCT_FORGET = makeSymbol("CB-LINK-KCT-FORGET");

    private static final SubLSymbol CB_KCT_THINKING_FORGET = makeSymbol("CB-KCT-THINKING-FORGET");

    private static final SubLString $str99$_Abort_ = makeString("[Abort]");

    private static final SubLString $str100$cb_kct_thinking_abort__a = makeString("cb-kct-thinking-abort&~a");

    private static final SubLSymbol CB_LINK_KCT_ABORT = makeSymbol("CB-LINK-KCT-ABORT");

    private static final SubLSymbol CB_KCT_THINKING_ABORT = makeSymbol("CB-KCT-THINKING-ABORT");

    private static final SubLString $str103$_View_Results_ = makeString("[View Results]");

    private static final SubLString $str104$cb_kct_thinking_results__a = makeString("cb-kct-thinking-results&~a");

    private static final SubLSymbol CB_LINK_KCT_RESULTS = makeSymbol("CB-LINK-KCT-RESULTS");





    private static final SubLString $str108$Wrong_type_of_KCT_Thinking_Task__ = makeString("Wrong type of KCT Thinking Task: ~A!");

    private static final SubLSymbol CB_KCT_THINKING_RESULTS = makeSymbol("CB-KCT-THINKING-RESULTS");

    private static final SubLString $str110$_View_Member_Tests_ = makeString("[View Member Tests]");

    private static final SubLString $str111$cb_kct_thinking_members__a = makeString("cb-kct-thinking-members&~a");

    private static final SubLSymbol CB_LINK_KCT_MEMBERS = makeSymbol("CB-LINK-KCT-MEMBERS");

    private static final SubLString $str113$Member_test_status_for__A = makeString("Member test status for ~A");

    private static final SubLString $str114$5__URL_cg_cb_kct_thinking_members = makeString("5; URL=cg?cb-kct-thinking-members&~A");

    private static final SubLString $str115$This_test_category_has_no_member_ = makeString("This test category has no member tests!");

    private static final SubLString $str116$The_test_was_stopped_before_all_m = makeString("The test was stopped before all member tests could finish.");

    private static final SubLString $str117$All_member_tests_have_finished_ = makeString("All member tests have finished.");

    private static final SubLString $str118$_bbbbbb = makeString("#bbbbbb");

    private static final SubLSymbol CB_KCT_THINKING_MEMBERS = makeSymbol("CB-KCT-THINKING-MEMBERS");

    private static final SubLSymbol $CB_KCT_TEST_SET = makeKeyword("CB-KCT-TEST-SET");

    private static final SubLString $str121$cb_kct_test_set_html = makeString("cb-kct-test-set.html");

    private static final SubLString $$$Test_Category_Results = makeString("Test Category Results");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str125$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str130$Test_Category__ = makeString("Test Category: ");

    private static final SubLString $str131$First_test_in_set_started__ = makeString("First test in set started: ");

    private static final SubLString $str132$_unimplemented_ = makeString("[unimplemented]");

    private static final SubLString $str133$Last_test_in_set_ended__ = makeString("Last test in set ended: ");

    private static final SubLString $str134$Overall_status__ = makeString("Overall status: ");

    private static final SubLString $str135$Explanation__ = makeString("Explanation: ");

    private static final SubLString $str136$Results_for_member_tests_ = makeString("Results for member tests:");

    private static final SubLSymbol KCT_RUNSTATE_P = makeSymbol("KCT-RUNSTATE-P");

    private static final SubLString $$$Test_Results_for_ = makeString("Test Results for ");

    private static final SubLString $str139$Query__ = makeString("Query: ");

    private static final SubLString $str140$Query_Formula__ = makeString("Query Formula: ");

    private static final SubLString $str141$Test_Status__ = makeString("Test Status: ");

    private static final SubLString $str142$_B40000 = makeString("#B40000");

    private static final SubLString $str143$_228b22 = makeString("#228b22");

    private static final SubLInteger $int$1024 = makeInteger(1024);



    private static final SubLSymbol KCT_TEST_SPEC_P = makeSymbol("KCT-TEST-SPEC-P");

    private static final SubLSymbol KCT_TEST_STATE = makeSymbol("KCT-TEST-STATE");

    private static final SubLSymbol KCT_TEST_STATE_P = makeSymbol("KCT-TEST-STATE-P");

    private static final SubLList $list149 = list(new SubLObject[]{ makeSymbol("TEST-SPEC"), makeSymbol("NAME"), makeSymbol("COMMENTS"), makeSymbol("QUERY-STATE"), makeSymbol("SAVE-MT"), makeSymbol("ANSWER-STATUS"), makeSymbol("ANSWER-OPTIONS-INDEX"), makeSymbol("ANSWER-OPTIONS-BINDINGS-INDEX"), makeSymbol("CATEGORIES"), makeSymbol("METRICS"), makeSymbol("CYCLISTS"), makeSymbol("NOTES"), makeSymbol("ANSWER-CARDINALITY") });

    private static final SubLList $list150 = list(new SubLObject[]{ makeKeyword("TEST-SPEC"), makeKeyword("NAME"), makeKeyword("COMMENTS"), makeKeyword("QUERY-STATE"), makeKeyword("SAVE-MT"), makeKeyword("ANSWER-STATUS"), makeKeyword("ANSWER-OPTIONS-INDEX"), makeKeyword("ANSWER-OPTIONS-BINDINGS-INDEX"), makeKeyword("CATEGORIES"), makeKeyword("METRICS"), makeKeyword("CYCLISTS"), makeKeyword("NOTES"), makeKeyword("ANSWER-CARDINALITY") });

    private static final SubLList $list151 = list(new SubLObject[]{ makeSymbol("KCT-TEST-STATE-TEST-SPEC"), makeSymbol("KCT-TEST-STATE-NAME"), makeSymbol("KCT-TEST-STATE-COMMENTS"), makeSymbol("KCT-TEST-STATE-QUERY-STATE"), makeSymbol("KCT-TEST-STATE-SAVE-MT"), makeSymbol("KCT-TEST-STATE-ANSWER-STATUS"), makeSymbol("KCT-TEST-STATE-ANSWER-OPTIONS-INDEX"), makeSymbol("KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX"), makeSymbol("KCT-TEST-STATE-CATEGORIES"), makeSymbol("KCT-TEST-STATE-METRICS"), makeSymbol("KCT-TEST-STATE-CYCLISTS"), makeSymbol("KCT-TEST-STATE-NOTES"), makeSymbol("KCT-TEST-STATE-ANSWER-CARDINALITY") });

    private static final SubLList $list152 = list(new SubLObject[]{ makeSymbol("_CSETF-KCT-TEST-STATE-TEST-SPEC"), makeSymbol("_CSETF-KCT-TEST-STATE-NAME"), makeSymbol("_CSETF-KCT-TEST-STATE-COMMENTS"), makeSymbol("_CSETF-KCT-TEST-STATE-QUERY-STATE"), makeSymbol("_CSETF-KCT-TEST-STATE-SAVE-MT"), makeSymbol("_CSETF-KCT-TEST-STATE-ANSWER-STATUS"), makeSymbol("_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-INDEX"), makeSymbol("_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX"), makeSymbol("_CSETF-KCT-TEST-STATE-CATEGORIES"), makeSymbol("_CSETF-KCT-TEST-STATE-METRICS"), makeSymbol("_CSETF-KCT-TEST-STATE-CYCLISTS"), makeSymbol("_CSETF-KCT-TEST-STATE-NOTES"), makeSymbol("_CSETF-KCT-TEST-STATE-ANSWER-CARDINALITY") });



    private static final SubLSymbol KCT_TEST_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KCT-TEST-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list155 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KCT-TEST-STATE-P"));

    private static final SubLSymbol KCT_TEST_STATE_TEST_SPEC = makeSymbol("KCT-TEST-STATE-TEST-SPEC");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_TEST_SPEC = makeSymbol("_CSETF-KCT-TEST-STATE-TEST-SPEC");

    private static final SubLSymbol KCT_TEST_STATE_NAME = makeSymbol("KCT-TEST-STATE-NAME");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_NAME = makeSymbol("_CSETF-KCT-TEST-STATE-NAME");

    private static final SubLSymbol KCT_TEST_STATE_COMMENTS = makeSymbol("KCT-TEST-STATE-COMMENTS");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_COMMENTS = makeSymbol("_CSETF-KCT-TEST-STATE-COMMENTS");

    private static final SubLSymbol KCT_TEST_STATE_QUERY_STATE = makeSymbol("KCT-TEST-STATE-QUERY-STATE");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_QUERY_STATE = makeSymbol("_CSETF-KCT-TEST-STATE-QUERY-STATE");

    private static final SubLSymbol KCT_TEST_STATE_SAVE_MT = makeSymbol("KCT-TEST-STATE-SAVE-MT");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_SAVE_MT = makeSymbol("_CSETF-KCT-TEST-STATE-SAVE-MT");

    private static final SubLSymbol KCT_TEST_STATE_ANSWER_STATUS = makeSymbol("KCT-TEST-STATE-ANSWER-STATUS");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_ANSWER_STATUS = makeSymbol("_CSETF-KCT-TEST-STATE-ANSWER-STATUS");

    private static final SubLSymbol KCT_TEST_STATE_ANSWER_OPTIONS_INDEX = makeSymbol("KCT-TEST-STATE-ANSWER-OPTIONS-INDEX");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_ANSWER_OPTIONS_INDEX = makeSymbol("_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-INDEX");

    private static final SubLSymbol KCT_TEST_STATE_ANSWER_OPTIONS_BINDINGS_INDEX = makeSymbol("KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_ANSWER_OPTIONS_BINDINGS_INDEX = makeSymbol("_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX");

    private static final SubLSymbol KCT_TEST_STATE_CATEGORIES = makeSymbol("KCT-TEST-STATE-CATEGORIES");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_CATEGORIES = makeSymbol("_CSETF-KCT-TEST-STATE-CATEGORIES");

    private static final SubLSymbol KCT_TEST_STATE_METRICS = makeSymbol("KCT-TEST-STATE-METRICS");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_METRICS = makeSymbol("_CSETF-KCT-TEST-STATE-METRICS");

    private static final SubLSymbol KCT_TEST_STATE_CYCLISTS = makeSymbol("KCT-TEST-STATE-CYCLISTS");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_CYCLISTS = makeSymbol("_CSETF-KCT-TEST-STATE-CYCLISTS");

    private static final SubLSymbol KCT_TEST_STATE_NOTES = makeSymbol("KCT-TEST-STATE-NOTES");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_NOTES = makeSymbol("_CSETF-KCT-TEST-STATE-NOTES");

    private static final SubLSymbol KCT_TEST_STATE_ANSWER_CARDINALITY = makeSymbol("KCT-TEST-STATE-ANSWER-CARDINALITY");

    private static final SubLSymbol _CSETF_KCT_TEST_STATE_ANSWER_CARDINALITY = makeSymbol("_CSETF-KCT-TEST-STATE-ANSWER-CARDINALITY");













    private static final SubLSymbol $ANSWER_OPTIONS_INDEX = makeKeyword("ANSWER-OPTIONS-INDEX");

    private static final SubLSymbol $ANSWER_OPTIONS_BINDINGS_INDEX = makeKeyword("ANSWER-OPTIONS-BINDINGS-INDEX");











    private static final SubLString $str195$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_KCT_TEST_STATE = makeSymbol("MAKE-KCT-TEST-STATE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KCT_TEST_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KCT-TEST-STATE-METHOD");





    public static final SubLList $list203 = list(makeKeyword("N"), makeKeyword("MIN"), makeKeyword("MAX"));

    private static final SubLString $str204$_A_is_not_a_known_answer_cardinal = makeString("~A is not a known answer cardinality type.");

    public static final SubLList $list205 = list(NIL, NIL, NIL);















    private static final SubLString $str213$The_wanted_binding_set__ = makeString("The wanted binding set, ");

    private static final SubLString $str214$__was_not_a_KB_BINDING_SET_P____d = makeString(", was not a KB-BINDING-SET-P -- dropping it.");



    private static final SubLString $str216$The_unwanted_binding_set__ = makeString("The unwanted binding set, ");





    public static final SubLSymbol $cb_kct_test_being_saved$ = makeSymbol("*CB-KCT-TEST-BEING-SAVED*");

    private static final SubLSymbol KCT_ANSWER = makeSymbol("KCT-ANSWER");

    private static final SubLSymbol KCT_ANSWER_P = makeSymbol("KCT-ANSWER-P");

    private static final SubLList $list222 = list(makeSymbol("BINDING-SET"), makeSymbol("STATUS"), makeSymbol("ID"));

    private static final SubLList $list223 = list(makeKeyword("BINDING-SET"), makeKeyword("STATUS"), makeKeyword("ID"));

    private static final SubLList $list224 = list(makeSymbol("KCT-ANSWER-BINDING-SET"), makeSymbol("KCT-ANSWER-STATUS"), makeSymbol("KCT-ANSWER-ID"));

    private static final SubLList $list225 = list(makeSymbol("_CSETF-KCT-ANSWER-BINDING-SET"), makeSymbol("_CSETF-KCT-ANSWER-STATUS"), makeSymbol("_CSETF-KCT-ANSWER-ID"));

    private static final SubLSymbol KCT_ANSWER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KCT-ANSWER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list227 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KCT-ANSWER-P"));

    private static final SubLSymbol KCT_ANSWER_BINDING_SET = makeSymbol("KCT-ANSWER-BINDING-SET");

    private static final SubLSymbol _CSETF_KCT_ANSWER_BINDING_SET = makeSymbol("_CSETF-KCT-ANSWER-BINDING-SET");

    private static final SubLSymbol KCT_ANSWER_STATUS = makeSymbol("KCT-ANSWER-STATUS");

    private static final SubLSymbol _CSETF_KCT_ANSWER_STATUS = makeSymbol("_CSETF-KCT-ANSWER-STATUS");

    private static final SubLSymbol KCT_ANSWER_ID = makeSymbol("KCT-ANSWER-ID");

    private static final SubLSymbol _CSETF_KCT_ANSWER_ID = makeSymbol("_CSETF-KCT-ANSWER-ID");







    private static final SubLSymbol MAKE_KCT_ANSWER = makeSymbol("MAKE-KCT-ANSWER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KCT_ANSWER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KCT-ANSWER-METHOD");

    private static final SubLSymbol KB_BINDING_SET_P = makeSymbol("KB-BINDING-SET-P");





    private static final SubLString $str242$Edit_this_instance_of___KBContent = makeString("Edit this instance of #$KBContentTest-FullySpecified.");

    private static final SubLString $str243$cb_edit_test__A = makeString("cb-edit-test&~A");

    private static final SubLString $str244$nd___ = makeString("nd();");

    private static final SubLSymbol CB_LINK_KCT_EDIT = makeSymbol("CB-LINK-KCT-EDIT");

    private static final SubLString $str246$_A_does_not_denote_a_test_specifi = makeString("~A does not denote a test specification");

    private static final SubLSymbol CB_EDIT_TEST = makeSymbol("CB-EDIT-TEST");

    private static final SubLString $str248$_Save_As_Test_ = makeString("[Save As Test]");



    private static final SubLString $str250$Create_an_instance_of___KBContent = makeString("Create an instance of #$KBContentTest-FullySpecified having a query specification with the sentence, microtheory and inference settings of the focal inference, and with expected results based on those obtained by the focal inference.");

    private static final SubLString $str251$cb_save_as_test__A__A = makeString("cb-save-as-test&~A&~A");



    private static final SubLSymbol CB_LINK_KCT_SAVE = makeSymbol("CB-LINK-KCT-SAVE");

    private static final SubLList $list254 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"));

    private static final SubLString $str255$Inference__S_in_problem_store__S_ = makeString("Inference ~S in problem store ~S is no longer available.");

    private static final SubLSymbol CB_SAVE_AS_TEST = makeSymbol("CB-SAVE-AS-TEST");

    private static final SubLString $$$Edit_Test_Specification = makeString("Edit Test Specification");

    private static final SubLString $str258$Save_Inference_Settings_and_Resul = makeString("Save Inference Settings and Results as Test Specification");

    private static final SubLString $str259$cb_handle_confirm_save_as_test = makeString("cb-handle-confirm-save-as-test");

    private static final SubLString $str260$An_interface_for_creating_and_edi = makeString("An interface for creating and editing KBContentTest-FullySpecified instances.  Hover over the various headers for context-sensitive help.");

    private static final SubLString $$$Save_As_Test = makeString("Save As Test");

    private static final SubLString $str262$Goto_section__ = makeString("Goto section :");

    private static final SubLString $str263$Shortcut_links_to_sections_that_a = makeString("Shortcut links to sections that appear further down on this page.");

    private static final SubLString $str264$mt_section = makeString("mt-section");

    private static final SubLString $str265$_Mt_ = makeString("[Mt]");

    private static final SubLString $str266$Change_the_Microtheory_settings_t = makeString("Change the Microtheory settings to be used for the saved test's query.");

    private static final SubLString $str267$sentence_section = makeString("sentence-section");

    private static final SubLString $str268$_Sentence_ = makeString("[Sentence]");

    private static final SubLString $str269$Change_the_CycL_sentence_to_be_us = makeString("Change the CycL sentence to be used for the saved test's query.");

    private static final SubLString $str270$parameters_section = makeString("parameters-section");

    private static final SubLString $str271$_Inference_Parameters_ = makeString("[Inference Parameters]");

    private static final SubLString $str272$Adjust_the_inference_parameters_a = makeString("Adjust the inference parameters and resource constraints that will be used when saving the query for this test.");

    private static final SubLString $str273$categories_section = makeString("categories-section");

    private static final SubLString $str274$_Test_Categories_ = makeString("[Test Categories]");

    private static final SubLString $str275$Specify_instances_of_KBContentTes = makeString("Specify instances of KBContentTestSpecificationType that this test belongs to.");

    private static final SubLString $str276$metrics_section = makeString("metrics-section");

    private static final SubLString $str277$_Test_Metrics_ = makeString("[Test Metrics]");

    private static final SubLString $str278$Specify_metrics_that_should_be_co = makeString("Specify metrics that should be collected for this test.");

    private static final SubLString $str279$cyclists_section = makeString("cyclists-section");

    private static final SubLString $str280$_Responsible_Cyclists_ = makeString("[Responsible Cyclists]");

    private static final SubLString $str281$Specify_cyclists_that_are_respons = makeString("Specify cyclists that are responsible for this test.");

    private static final SubLString $str282$Notes_ = makeString("Notes:");

    private static final SubLString $str283$Test_Name__ = makeString("Test Name: ");

    private static final SubLString $str284$The_constant_name_to_save_the_tes = makeString("The constant name to save the test specification as.");

    private static final SubLString $$$name = makeString("name");

    private static final SubLString $str286$Next__Specify_Expected_Results_ = makeString("Next (Specify Expected Results)");

    private static final SubLString $str287$Store_the_specified_sentence__mt_ = makeString("Store the specified sentence, mt, inference settings and so on in a temporary area, and then take you to a page where you can specify the bindings the test query should return.");

    private static final SubLString $$$new = makeString("new");

    private static final SubLString $$$Reset_Values = makeString("Reset Values");

    private static final SubLString $str290$cb_kct_save_mt = makeString("cb-kct-save-mt");

    private static final SubLString $$$Show = makeString("Show");

    private static final SubLString $$$Hide = makeString("Hide");



    private static final SubLString $str294$Save_In_Mt__ = makeString("Save In Mt: ");

    private static final SubLString $str295$The_microtheory_in_which_to_save_ = makeString("The microtheory in which to save the assertions about the test specification.  Should be a spec-mt of #$TestVocabularyMt.");



    private static final SubLList $list297 = list(makeKeyword("INPUT-NAME"), makeString("defining-mt"));

    private static final SubLString $str298$test_categories = makeString("test-categories");

    private static final SubLString $str299$Test_Categories__optional_ = makeString("Test Categories (optional)");

    private static final SubLString $str300$Instances_of_KBContentTestSpecifi = makeString("Instances of KBContentTestSpecificationType which the test should be an instance of.");



    private static final SubLObject $$KBContentRegressionTest = reader_make_constant_shell(makeString("KBContentRegressionTest"));

    private static final SubLString $$$category = makeString("category");



    private static final SubLString $str305$category_name = makeString("category-name");

    private static final SubLString $str306$Add_a_Test_Category__ = makeString("Add a Test Category: ");

    private static final SubLString $str307$category_id = makeString("category-id");

    private static final SubLSymbol $sym308$STRING_ = makeSymbol("STRING<");



    private static final SubLString $str310$test_metrics = makeString("test-metrics");

    private static final SubLString $$$Test_Metrics_to_Gather = makeString("Test Metrics to Gather");

    private static final SubLString $str312$The_metrics_that_should_be_gather = makeString("The metrics that should be gathered and reported when the test is run.");

    private static final SubLString $str313$None_selected_ = makeString("None selected.");

    private static final SubLString $$$metric = makeString("metric");

    private static final SubLString $$$cyclists = makeString("cyclists");

    private static final SubLString $str316$Responsible_Cyclists__required_ = makeString("Responsible Cyclists (required)");

    private static final SubLString $str317$The_cyclists_who_are_responsible_ = makeString("The cyclists who are responsible for this test.");



    private static final SubLString $str319$Selected_ = makeString("Selected?");

    private static final SubLString $$$Cyclist = makeString("Cyclist");

    private static final SubLString $$$cyclist = makeString("cyclist");

    private static final SubLString $str322$cyclist_name = makeString("cyclist-name");

    private static final SubLObject $$HumanCyclist = reader_make_constant_shell(makeString("HumanCyclist"));

    private static final SubLString $str324$Add_a_Cyclist__ = makeString("Add a Cyclist: ");

    private static final SubLString $str325$_A = makeString("~A");

    private static final SubLList $list326 = list(makeKeyword("INPUT-NAME"), makeString("sentence"));

    private static final SubLList $list327 = list(makeKeyword("INPUT-NAME"), makeString("non_exp_sentence"), makeKeyword("REQUIRED?"), NIL);

    private static final SubLList $list328 = list(makeKeyword("LOCATION"), makeString("Pragmatics"));

    private static final SubLSymbol CB_HANDLE_CONFIRM_SAVE_AS_TEST = makeSymbol("CB-HANDLE-CONFIRM-SAVE-AS-TEST");

    private static final SubLString $str330$The_ID___A__did_not_yield_a_KBCon = makeString("The ID, ~A, did not yield a KBContentTestSpecificationType.");

    private static final SubLString $str331$The_name___S__did_not_denote_a_KB = makeString("The name, ~S, did not denote a KBContentTestSpecificationType.");

    private static final SubLString $str332$The_object___S__extracted_from_th = makeString("The object, ~S, extracted from the test category selector, is not a KBContentTestSpecificationType.");

    private static final SubLString $str333$The_ID___A__did_not_yield_a_Test_ = makeString("The ID, ~A, did not yield a Test Metric constant.");

    private static final SubLString $str334$The_ID___A__did_not_yield_a_Human = makeString("The ID, ~A, did not yield a HumanCyclist.");

    private static final SubLString $str335$The_name___A__did_not_denote_a_Hu = makeString("The name, ~A, did not denote a HumanCyclist.");

    public static final SubLSymbol $cb_kct_rowcolor$ = makeSymbol("*CB-KCT-ROWCOLOR*");

    private static final SubLString $str337$_ccccff = makeString("#ccccff");

    private static final SubLString $$$Specify_Test_Expectations = makeString("Specify Test Expectations");

    private static final SubLString $str339$reloadCurrentFrame__reloadFrameBu = makeString("reloadCurrentFrame('reloadFrameButton');");

    private static final SubLString $str340$cb_handle_specify_test_results = makeString("cb-handle-specify-test-results");

    private static final SubLString $str341$The_interface_for_stating_test_ex = makeString("The interface for stating test expectations for a KB Content Test");



    private static final SubLString $$$Exactly_ = makeString("Exactly ");

    private static final SubLString $$$cardinality = makeString("cardinality");

    private static final SubLString $str345$_answers_should_be_found_ = makeString(" answers should be found.");

    private static final SubLString $$$At_least_ = makeString("At least ");

    private static final SubLString $str347$min_cardinality = makeString("min-cardinality");

    private static final SubLString $$$At_most_ = makeString("At most ");

    private static final SubLString $str349$max_cardinality = makeString("max-cardinality");

    private static final SubLString $$$bindings = makeString("bindings");

    private static final SubLString $$$unimportant = makeString("unimportant");

    private static final SubLString $str352$The_bindings_obtained_are_unimpor = makeString("The bindings obtained are unimportant.");

    private static final SubLString $$$proven = makeString("proven");

    private static final SubLString $str354$The_query__with_no_free_variables = makeString("The query (with no free variables) should be proven.");

    private static final SubLString $$$none = makeString("none");

    private static final SubLString $str356$No_bindings_should_be_found_ = makeString("No bindings should be found.");

    private static final SubLString $str357$The_query__with_no_free_variables = makeString("The query (with no free variables) should not be proven.");

    private static final SubLString $$$exact = makeString("exact");

    private static final SubLString $str359$Require_all_and_only_the_wanted_b = makeString("Require all and only the wanted bindings below (exact match).");

    private static final SubLString $$$inexact = makeString("inexact");

    private static final SubLString $str361$Specify_wanted_and_or_unwanted_bi = makeString("Specify wanted and/or unwanted bindings below (inexact match).");

    private static final SubLString $str362$Check_wanted_and_unwanted_binding = makeString("Check wanted and unwanted bindings:");



    private static final SubLString $$$Wanted = makeString("Wanted");

    private static final SubLString $$$Not_Wanted = makeString("Not Wanted");

    private static final SubLString $$$Unspecified = makeString("Unspecified");

    private static final SubLString $$$Save_New_Test = makeString("Save New Test");

    private static final SubLString $str368$Creates_a_new___KBContentTest_Ful = makeString("Creates a new #$KBContentTest-FullySpecified instance and associated #$CycLQuerySpecification, having the specified sentence, mt, inference settings and expected results.");

    private static final SubLString $str369$save_new = makeString("save-new");

    private static final SubLString $$$Overwrite_Existing_Test = makeString("Overwrite Existing Test");

    private static final SubLString $str371$Overwrites_the_existing_test_spec = makeString("Overwrites the existing test specification with the sentence, mt, inference settings and expected results specified here.");

    private static final SubLString $$$overwrite = makeString("overwrite");

    private static final SubLString $$$Test_Definition_So_Far = makeString("Test Definition So Far");

    private static final SubLString $str374$The_currently_specified_propertie = makeString("The currently specified properties of the test being saved.  These values will be stored in the KB when you finish specifying results and choose either \"Save New Test\" or \"Overwrite Existing Test\".");

    private static final SubLString $str375$Specify_a_binding_set_ = makeString("Specify a binding set:");

    private static final SubLString $str376$Enter_values_for_each_free_variab = makeString("Enter values for each free variable, choose Wanted or Unwanted, and click Add to add the binding set to the expected results.");

    private static final SubLString $str377$Wanted_ = makeString("Wanted:");

    private static final SubLString $$$wanted = makeString("wanted");

    private static final SubLString $str379$Unwanted_ = makeString("Unwanted:");

    private static final SubLString $$$unwanted = makeString("unwanted");

    private static final SubLString $$$Add_this_binding_set = makeString("Add this binding set");

    private static final SubLString $str382$Updates_the_state_of_the_test_bei = makeString("Updates the state of the test being defined or edited, and displays this page again so another binding set may be added to the expected results.");

    private static final SubLString $$$add = makeString("add");

    private static final SubLString $str384$new__A = makeString("new-~A");

    private static final SubLString $$$top = makeString("top");





    private static final SubLString $str388$wanted__A = makeString("wanted-~A");

    private static final SubLString $$$yes = makeString("yes");

    private static final SubLString $$$no = makeString("no");

    private static final SubLString $$$unspecified = makeString("unspecified");







    private static final SubLString $str395$Unknown_test_save_method__A = makeString("Unknown test save method ~A");

    private static final SubLSymbol CB_HANDLE_SPECIFY_TEST_RESULTS = makeSymbol("CB-HANDLE-SPECIFY-TEST-RESULTS");





    private static final SubLString $str399$_is_not_an_integer_ = makeString(" is not an integer.");



    public static final SubLList $list401 = list(makeKeyword("AUTO-CYCLIFY"), T);

    private static final SubLString $str402$The_value___A__is_not_a_known_exa = makeString("The value, ~A, is not a known exactness.");

    private static final SubLString $str403$test_spec = makeString("test-spec");

    private static final SubLString $str404$_A_does_not_denote_a_test_specifi = makeString("~A does not denote a test specification.");

    private static final SubLString $str405$You_need_to_make_a_choice_for_Exp = makeString("You need to make a choice for Expected Test Results.");

    private static final SubLString $str406$Problem_extracting_exact_answers_ = makeString("Problem extracting exact answers.");

    private static final SubLString $str407$The_ID__A_does_not_denote_a_kct_a = makeString("The ID ~A does not denote a kct answer.");

    private static final SubLString $$$Save_Test_Specification = makeString("Save Test Specification");

    private static final SubLString $str409$_A_is_not_a_valid_constant_name_ = makeString("~A is not a valid constant name.");

    private static final SubLString $str410$Already_a_constant_named__A = makeString("Already a constant named ~A");

    private static final SubLString $str411$Constant__S_already_exists_which_ = makeString("Constant ~S already exists which differs from ~S only by case");

    private static final SubLObject $$TestQueryFn = reader_make_constant_shell(makeString("TestQueryFn"));

    private static final SubLString $str413$Save_New_Test_Specification_finis = makeString("Save New Test Specification finished with these problems: ~A");

    private static final SubLString $str414$Save_New_Test_Specification_finis = makeString("Save New Test Specification finished successfully.");

    private static final SubLString $$$Overwrite_Test_Specification = makeString("Overwrite Test Specification");

    private static final SubLString $str416$_A_is_not_the_name_of_a_KBContent = makeString("~A is not the name of a KBContentTest-FullySpecified.");

    private static final SubLString $str417$Edit_Test_Specification_finished_ = makeString("Edit Test Specification finished with these problems: ~A");

    private static final SubLString $str418$Edit_Test_Specification_finished_ = makeString("Edit Test Specification finished successfully.");







    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list423 = list(reader_make_constant_shell(makeString("MultipleChoiceKBContentTest")));

    public static final SubLList $list424 = list(reader_make_constant_shell(makeString("KBContentTest-FullySpecified")));

    private static final SubLObject $$testQuerySpecification = reader_make_constant_shell(makeString("testQuerySpecification"));

    private static final SubLString $str426$Remember_to_state_expected_result = makeString("Remember to state expected results using the Cyc Browser.");

    public static final SubLList $list427 = list(makeSymbol("OPTION-NUM"), makeSymbol("FULL-LABEL"), makeSymbol("INDEX-LABEL"), makeSymbol("KB-BINDINGS"));

    private static final SubLString $str428$Some_item_in__A_was_not_a_KB_BIND = makeString("Some item in ~A was not a KB-BINDING-SET-P");

    private static final SubLObject $$testAnswers_Cardinality_Exact = reader_make_constant_shell(makeString("testAnswers-Cardinality-Exact"));

    private static final SubLObject $$testAnswers_Cardinality_Min = reader_make_constant_shell(makeString("testAnswers-Cardinality-Min"));

    private static final SubLObject $$testAnswers_Cardinality_Max = reader_make_constant_shell(makeString("testAnswers-Cardinality-Max"));

    private static final SubLObject $$testAnswersCycL_Exact = reader_make_constant_shell(makeString("testAnswersCycL-Exact"));

    private static final SubLObject $$testAnswersCycL_Wanted = reader_make_constant_shell(makeString("testAnswersCycL-Wanted"));

    private static final SubLObject $$testAnswersCycL_NotWanted = reader_make_constant_shell(makeString("testAnswersCycL-NotWanted"));

    private static final SubLObject $$testAnswersCycLUnimportant = reader_make_constant_shell(makeString("testAnswersCycLUnimportant"));



    private static final SubLObject $$MCQuestionNthOptionFn = reader_make_constant_shell(makeString("MCQuestionNthOptionFn"));

    private static final SubLObject $$testAnswer_MultipleChoice = reader_make_constant_shell(makeString("testAnswer-MultipleChoice"));

    private static final SubLObject $$testMetricsToGather = reader_make_constant_shell(makeString("testMetricsToGather"));

    private static final SubLObject $$testResponsibleCyclist = reader_make_constant_shell(makeString("testResponsibleCyclist"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));





    private static final SubLObject $$StartFn = reader_make_constant_shell(makeString("StartFn"));

    private static final SubLObject $$TimeIntervalInclusiveFn = reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"));

    private static final SubLList $list447 = list(reader_make_constant_shell(makeString("IndexicalReferentFn-EvaluateAtEL")), reader_make_constant_shell(makeString("Now")));

    private static final SubLObject $$IntervalEndedByFn_Inclusive = reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive"));



    private static final SubLObject $const450$temporallyQualifiablePredicateInI = reader_make_constant_shell(makeString("temporallyQualifiablePredicateInInterface"));

    private static final SubLList $list451 = list(reader_make_constant_shell(makeString("CycTestAndQuerySavingAndEditingTool")));

    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell(makeString("Null-TimeParameter"));

    private static final SubLObject $$TimePoint = reader_make_constant_shell(makeString("TimePoint"));

    private static final SubLList $list454 = list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("IndexicalReferentFn-EvaluateAtEL")), reader_make_constant_shell(makeString("Now"))), reader_make_constant_shell(makeString("Now")));

    private static final SubLSymbol $KCT_CONTROL_PANEL = makeKeyword("KCT-CONTROL-PANEL");

    private static final SubLString $$$KB_Content_Test_Control_Panel = makeString("KB Content Test Control Panel");

    private static final SubLString $$$KCT = makeString("KCT");

    private static final SubLString $str458$View_and_edit_your_KB_Content_Tes = makeString("View and edit your KB Content Tests");

    private static final SubLString $str459$_KCT_ = makeString("[KCT]");

    private static final SubLString $str460$cb_kct_control_panel = makeString("cb-kct-control-panel");

    private static final SubLSymbol CB_LINK_KCT_CONTROL_PANEL = makeSymbol("CB-LINK-KCT-CONTROL-PANEL");

    private static final SubLString $str462$cb_kct_control_panel_handler = makeString("cb-kct-control-panel-handler");

    private static final SubLString $$$KB_Content_Tests_owned_by_ = makeString("KB Content Tests owned by ");

    private static final SubLString $str464$_ = makeString(":");

    private static final SubLString $str465$No_tests_ = makeString("No tests.");

    private static final SubLSymbol CB_KCT_CONTROL_PANEL = makeSymbol("CB-KCT-CONTROL-PANEL");

    private static final SubLString $str467$_Refresh_ = makeString("[Refresh]");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $$$save = makeString("save");

    private static final SubLString $str470$_Edit_ = makeString("[Edit]");

    private static final SubLString $str471$_Run_ = makeString("[Run]");

    private static final SubLString $$$Edit = makeString("Edit");

    private static final SubLString $$$Run = makeString("Run");

    private static final SubLString $$$Name = makeString("Name");

    private static final SubLString $str475$Regression_Test_ = makeString("Regression Test?");

    private static final SubLString $$$Save_Interface = makeString("Save Interface");

    private static final SubLString $str477$Tests__Regression_Status_Modified = makeString("Tests' Regression Status Modified");

    private static final SubLSymbol CB_KCT_CONTROL_PANEL_HANDLER = makeSymbol("CB-KCT-CONTROL-PANEL-HANDLER");

    private static final SubLList $list479 = list(reader_make_constant_shell(makeString("KBContentRegressionTest")));

    public static SubLObject cb_link_kct_test(final SubLObject test_constant, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str0$_Run_Test_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str2$cb_kct_test_run__a, cb_fort_identifier(test_constant));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return test_constant;
    }

    public static SubLObject cb_kct_test_run(final SubLObject args) {
        final SubLObject test_constant = cb_guess_fort(args, UNPROVIDED);
        kct_thinking.kct_run_test_in_thinker(test_constant, T);
        cb_kct_main(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_kct_test_set(final SubLObject test_collection, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str7$_Run_Test_Set_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str8$cb_kct_test_set_run__a, cb_fort_identifier(test_collection));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return test_collection;
    }

    public static SubLObject cb_kct_test_set_run(final SubLObject args) {
        final SubLObject test_collection = cb_guess_fort(args, UNPROVIDED);
        kct_thinking.kct_run_test_set_in_thinker(test_collection, T);
        cb_kct_main(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_kct(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str16$_KCTRun_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str17$cb_kct_main);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_kct_main(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = $$$KB_Content_Test_Monitor;
        html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str21$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(title);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            if (NIL != $cb_kct_refreshP$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_meta_head$.getGlobalValue());
                html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$Refresh);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_meta_content$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str25$5__URL_cg_cb_kct_main);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
            }
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ(title);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_hr(UNPROVIDED, UNPROVIDED);
                    cb_kct_enter_test_section(UNPROVIDED, UNPROVIDED);
                    html_hr(UNPROVIDED, UNPROVIDED);
                    if (NIL != kct_thinking.kct_all_thinkings()) {
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(THREE_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str26$_9999ff);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str27$_ffffff);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(FOUR_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != kct_thinking.kct_any_thinking_runningP()) {
                                        cb_link($KCT_TOGGLE_REFRESH, $list30, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        html_princ_strong($str31$None_running_);
                                        $cb_kct_refreshP$.setDynamicValue(NIL, thread);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            thread.resetMultipleValues();
                            final SubLObject individual_tests = kct_thinking.kct_classify_thinkings_by_type(kct_thinking.kct_all_thinkings());
                            final SubLObject collection_tests = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != individual_tests) {
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str27$_ffffff);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(FOUR_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ_strong($$$Individual_Tests);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                cb_kct_status_table_header();
                                SubLObject cdolist_list_var = individual_tests;
                                SubLObject thinking = NIL;
                                thinking = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    cb_kct_show_status(thinking);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    thinking = cdolist_list_var.first();
                                } 
                            }
                            if (NIL != collection_tests) {
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str27$_ffffff);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(FOUR_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ_strong($$$Test_Categories);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                cb_kct_status_table_header();
                                SubLObject cdolist_list_var = collection_tests;
                                SubLObject thinking = NIL;
                                thinking = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    cb_kct_show_status(thinking);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    thinking = cdolist_list_var.first();
                                } 
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } else {
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str34$There_are_no_running_or_finished_);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_kct_status_table_header() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str36$_99ccff);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ_strong($$$TEST);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ_strong($$$TASK_STATUS);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ_strong($$$TASK_ACTIONS);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ_strong($$$TEST_RESULT);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_kct_enter_test_section(SubLObject last_kct, SubLObject last_kct_col) {
        if (last_kct == UNPROVIDED) {
            last_kct = NIL;
        }
        if (last_kct_col == UNPROVIDED) {
            last_kct_col = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject frame_name_var = cb_frame_name(NIL);
        html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$post);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$within_html_form$.bind(T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_hidden_input($str42$cb_kct_start_test, T, UNPROVIDED);
            html_princ_strong($str43$Enter_test_to_run___);
            html_newline(UNPROVIDED);
            html_complete.html_complete_button($str44$kct_test, $$$Complete, $$KBContentTest_FullySpecified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            html_script_utilities.html_clear_input_button($str44$kct_test, $$$Clear, UNPROVIDED);
            html_indent(UNPROVIDED);
            html_text_input($str44$kct_test, NIL != last_kct ? constants_high.constant_name(last_kct) : NIL, $int$40);
            html_submit_input($$$Run_Test, UNPROVIDED, UNPROVIDED);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_form_tail$.getGlobalValue());
        frame_name_var = cb_frame_name(NIL);
        html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$post);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$within_html_form$.bind(T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_hidden_input($str50$cb_kct_start_test_collection, T, UNPROVIDED);
            html_princ_strong($str51$Enter_test_category_to_run___);
            html_newline(UNPROVIDED);
            html_complete.html_complete_button($str52$kct_coll, $$$Complete, $$KBContentTestSpecificationType, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            html_script_utilities.html_clear_input_button($str52$kct_coll, $$$Clear, UNPROVIDED);
            html_indent(UNPROVIDED);
            html_text_input($str52$kct_coll, NIL != last_kct_col ? constants_high.constant_name(last_kct_col) : NIL, $int$40);
            html_submit_input($$$Run_Test, UNPROVIDED, UNPROVIDED);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_kct_start_test(final SubLObject args) {
        final SubLObject test_constant_name = html_extract_input($str44$kct_test, args);
        final SubLObject test_constant = cb_guess_term(test_constant_name, UNPROVIDED);
        if (NIL == kct_utils.kct_test_spec_p(test_constant, UNPROVIDED)) {
            return cb_error($str54$_A_is_not_the_name_of_a___KBConte, test_constant_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        kct_thinking.kct_run_test_in_thinker(test_constant, T);
        return cb_kct_main(UNPROVIDED);
    }

    public static SubLObject cb_kct_start_test_collection(final SubLObject args) {
        final SubLObject test_constant_name = html_extract_input($str52$kct_coll, args);
        final SubLObject test_constant = cb_guess_term(test_constant_name, UNPROVIDED);
        if (NIL == kct_utils.kct_test_collection_p(test_constant, UNPROVIDED)) {
            return cb_error($str56$_A_is_not_the_name_of_a___KBConte, test_constant_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        kct_thinking.kct_run_test_set_in_thinker(test_constant, T);
        return cb_kct_main(UNPROVIDED);
    }

    public static SubLObject cb_kct_thinking_status_row_color(final SubLObject thinking) {
        final SubLObject runstate = kct_thinking.kct_thinking_runstate(thinking);
        final SubLObject thinking_status = process_utilities.thinking_status(thinking);
        final SubLObject test_status = (NIL != runstate) ? kbq_query_run.runstate_result_status(runstate) : NIL;
        SubLObject row_color = NIL;
        final SubLObject pcase_var = thinking_status;
        if (pcase_var.eql($RUNNING) || pcase_var.eql($STARTED)) {
            row_color = $str60$_99ffff;
        } else
            if (pcase_var.eql($STOPPED) || pcase_var.eql($NONE)) {
                row_color = $str63$_cccccc;
            } else
                if (pcase_var.eql($ERROR)) {
                    row_color = $str65$_ff6666;
                } else
                    if (pcase_var.eql($FINISHED)) {
                        if (test_status.equal($SUCCESS)) {
                            row_color = $str60$_99ffff;
                        } else
                            if ((test_status.equal($FAILURE) || test_status.equal($ERROR)) || test_status.equal($PROBLEM)) {
                                row_color = $str65$_ff6666;
                            } else
                                if (test_status.equal($SKIPPED)) {
                                    row_color = $str63$_cccccc;
                                }


                    }



        return row_color;
    }

    public static SubLObject cb_kct_show_status(final SubLObject thinking) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constant = kct_thinking.kct_thinking_test_constant(thinking);
        final SubLObject runstate = kct_thinking.kct_thinking_runstate(thinking);
        final SubLObject type = kct_thinking.kct_thinking_type(thinking);
        final SubLObject member_runstates = ((NIL != kbq_query_run.kct_set_runstate_p(runstate)) && (type == $COLLECTION)) ? kbq_query_run.kct_set_runstate_test_runstates(runstate) : NIL;
        final SubLObject status = process_utilities.thinking_status(thinking);
        final SubLObject row_color = cb_kct_thinking_status_row_color(thinking);
        SubLObject config_status = NIL;
        SubLObject config_text = NIL;
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        if (NIL != row_color) {
            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(row_color);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_form(constant, UNPROVIDED, UNPROVIDED);
                if (NIL != kct_utils.kct_test_spec_p(constant, UNPROVIDED)) {
                    html_newline(UNPROVIDED);
                    cb_link($KCT_EDIT, constant, $str73$_Edit_Test_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(status);
                if (type == $COLLECTION) {
                    html_br();
                    cb_link($KCT_MEMBERS, thinking, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    final SubLObject inference = (NIL != kbq_query_run.kct_runstate_p(runstate)) ? kbq_query_run.kct_runstate_inference(runstate) : NIL;
                    if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                        html_br();
                        cb_link($INFERENCE, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                if ((status == $RUNNING) || (status == $STARTED)) {
                    cb_link($KCT_ABORT, thinking, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    cb_link($KCT_FORGET, thinking, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject pcase_var = status;
                if (pcase_var.eql($RUNNING)) {
                    html_princ($$$_);
                } else
                    if (pcase_var.eql($STARTED)) {
                        html_princ($str79$Task_is_just_starting_);
                    } else
                        if (pcase_var.eql($ERROR)) {
                            final SubLObject error_message = process_utilities.thinking_error_message(thinking);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str80$Test_halted_with_this_error___A, error_message);
                        } else
                            if (pcase_var.eql($STOPPED)) {
                                html_princ($str81$Task_was_halted_before_completion);
                            } else
                                if (pcase_var.eql($FINISHED)) {
                                    if (NIL != kct_utils.kct_test_spec_p(constant, UNPROVIDED)) {
                                        thread.resetMultipleValues();
                                        final SubLObject problem_status = kct_utils.why_not_kct_test_valid(constant);
                                        final SubLObject problem_text = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        config_status = problem_status;
                                        config_text = problem_text;
                                    } else
                                        if (NIL != kct_utils.kct_test_collection_p(constant, UNPROVIDED)) {
                                            thread.resetMultipleValues();
                                            final SubLObject problem_status = kct_utils.why_not_kct_test_collection_valid(constant);
                                            final SubLObject problem_text = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            config_status = problem_status;
                                            config_text = problem_text;
                                        }

                                    if (config_status == $SEVERE) {
                                        html_princ(format(NIL, $str83$Test_is_un_executable_due_to_conf, config_text));
                                    } else {
                                        html_princ(kbq_query_run.runstate_result_status(runstate));
                                        html_indent(THREE_INTEGER);
                                        cb_link($KCT_RESULTS, thinking, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } else
                                    if (pcase_var.eql($NONE)) {
                                        html_princ($str85$Task_was_never_begun_);
                                    } else {
                                        Errors.error($str86$Unknown_thinking_status__A, status);
                                    }





            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_kct_toggle_refresh(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject linktext = (NIL != $cb_kct_refreshP$.getDynamicValue(thread)) ? $str87$_Halt_Auto_Refresh_ : $str88$_Start_Auto_Refresh_;
        final SubLObject arg1 = nth(ZERO_INTEGER, args);
        final SubLObject arg2 = nth(ONE_INTEGER, args);
        final SubLObject arg3 = nth(TWO_INTEGER, args);
        SubLObject link = $str89$cb_kct_toggle_refresh;
        if (NIL != arg1) {
            link = cconcatenate(link, new SubLObject[]{ $str90$_, format(NIL, arg1) });
            if (NIL != arg2) {
                link = cconcatenate(link, new SubLObject[]{ $str90$_, format(NIL, arg2) });
                if (NIL != arg3) {
                    link = cconcatenate(link, new SubLObject[]{ $str90$_, format(NIL, arg3) });
                }
            }
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ(link);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_kct_toggle_refresh(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject page = args.first();
        if (NIL != $cb_kct_refreshP$.getDynamicValue(thread)) {
            $cb_kct_refreshP$.setDynamicValue(NIL, thread);
        } else {
            $cb_kct_refreshP$.setDynamicValue(T, thread);
        }
        if (page.equal($$$main)) {
            return cb_kct_main(UNPROVIDED);
        }
        if (page.equal($$$members)) {
            return cb_kct_thinking_members(args.rest());
        }
        return NIL;
    }

    public static SubLObject cb_link_kct_forget(final SubLObject thinking, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str95$_Forget_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str96$cb_kct_thinking_forget__a, kct_thinking.kct_thinking_id(thinking));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return thinking;
    }

    public static SubLObject cb_kct_thinking_forget(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject id_string = args.first();
        final SubLObject id = (length(string_utilities.trim_whitespace(id_string)).numG(ZERO_INTEGER)) ? read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject thinking = (NIL != id) ? kct_thinking.kct_lookup_thinking(id) : NIL;
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            kct_thinking.kct_remove_thinking(thinking);
        }
        cb_kct_main(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_kct_abort(final SubLObject thinking, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str99$_Abort_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str100$cb_kct_thinking_abort__a, kct_thinking.kct_thinking_id(thinking));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return thinking;
    }

    public static SubLObject cb_kct_thinking_abort(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject id_string = args.first();
        final SubLObject id = (length(string_utilities.trim_whitespace(id_string)).numG(ZERO_INTEGER)) ? read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject thinking = (NIL != id) ? kct_thinking.kct_lookup_thinking(id) : NIL;
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            kct_thinking.kct_thinking_stop(thinking);
        }
        cb_kct_main(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_kct_results(final SubLObject thinking, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str103$_View_Results_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str104$cb_kct_thinking_results__a, kct_thinking.kct_thinking_id(thinking));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return thinking;
    }

    public static SubLObject cb_kct_thinking_results(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject id_string = args.first();
        final SubLObject id = (length(string_utilities.trim_whitespace(id_string)).numG(ZERO_INTEGER)) ? read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject thinking = (NIL != id) ? kct_thinking.kct_lookup_thinking(id) : NIL;
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            final SubLObject runstate = kct_thinking.kct_thinking_runstate(thinking);
            final SubLObject pcase_var;
            final SubLObject type = pcase_var = kct_thinking.kct_thinking_type(thinking);
            if (pcase_var.eql($INDIVIDUAL)) {
                return cb_kct_individual_runstate_results(runstate, $BRIEF);
            }
            if (pcase_var.eql($COLLECTION)) {
                return cb_kct_collection_results(runstate, $BRIEF);
            }
            Errors.error($str108$Wrong_type_of_KCT_Thinking_Task__, type);
        }
        return NIL;
    }

    public static SubLObject cb_link_kct_members(final SubLObject thinking, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str110$_View_Member_Tests_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str111$cb_kct_thinking_members__a, kct_thinking.kct_thinking_id(thinking));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return thinking;
    }

    public static SubLObject cb_kct_thinking_members(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id_string = args.first();
        final SubLObject id = (length(string_utilities.trim_whitespace(id_string)).numG(ZERO_INTEGER)) ? read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject thinking = (NIL != id) ? kct_thinking.kct_lookup_thinking(id) : NIL;
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            final SubLObject runstate = kct_thinking.kct_thinking_runstate(thinking);
            final SubLObject constant = kbq_query_run.runstate_constant(runstate);
            final SubLObject member_runstates = (NIL != kbq_query_run.kct_set_runstate_p(runstate)) ? kbq_query_run.kct_set_runstate_test_runstates(runstate) : NIL;
            final SubLObject title = format(NIL, $str113$Member_test_status_for__A, constant);
            html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str21$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ(title);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                if (NIL != $cb_kct_refreshP$.getDynamicValue(thread)) {
                    final SubLObject content_string = format(NIL, $str114$5__URL_cg_cb_kct_thinking_members, id);
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_meta_head$.getGlobalValue());
                    html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$Refresh);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != content_string) {
                        html_markup(html_macros.$html_meta_content$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(content_string);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$18 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != color_value) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(color_value));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_princ(title);
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        if (NIL == member_runstates) {
                            html_princ_strong($str115$This_test_category_has_no_member_);
                        } else {
                            html_terpri(UNPROVIDED);
                            final SubLObject pcase_var = process_utilities.thinking_status(thinking);
                            if (pcase_var.eql($RUNNING) || pcase_var.eql($STARTED)) {
                                cb_link($KCT_TOGGLE_REFRESH, cons($$$members, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($STOPPED)) {
                                    html_princ_strong($str116$The_test_was_stopped_before_all_m);
                                    $cb_kct_refreshP$.setDynamicValue(NIL, thread);
                                } else {
                                    html_princ_strong($str117$All_member_tests_have_finished_);
                                    $cb_kct_refreshP$.setDynamicValue(NIL, thread);
                                }

                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(THREE_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str26$_9999ff);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject bgcolor = NIL;
                                SubLObject color_toggle = NIL;
                                SubLObject list_var = NIL;
                                SubLObject member_runstate = NIL;
                                SubLObject ignore_me = NIL;
                                list_var = member_runstates;
                                member_runstate = list_var.first();
                                for (ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , member_runstate = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                    if (NIL != color_toggle) {
                                        color_toggle = NIL;
                                    } else {
                                        color_toggle = T;
                                    }
                                    bgcolor = (NIL != color_toggle) ? $str118$_bbbbbb : $str27$_ffffff;
                                    final SubLObject constant_$21 = kbq_query_run.kct_runstate_test_spec(member_runstate);
                                    final SubLObject inference = kbq_query_run.kct_runstate_inference(member_runstate);
                                    final SubLObject run_status = kbq_query_run.runstate_run_status(member_runstate);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    if (NIL != bgcolor) {
                                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(bgcolor);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_form(constant_$21, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ(run_status);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != inference) {
                                                cb_link($INFERENCE, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    if (run_status == $FINISHED) {
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (NIL != bgcolor) {
                                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(bgcolor);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(THREE_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_kct_individual_runstate_results(member_runstate, $BRIEF);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$18, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_kct_collection_results(final SubLObject runstate, final SubLObject output_style) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Test_Category_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str21$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$28 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str125$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        cb_help_preamble($CB_KCT_TEST_SET, UNPROVIDED, UNPROVIDED);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str130$Test_Category__);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(kbq_query_run.runstate_constant(runstate));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str131$First_test_in_set_started__);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str132$_unimplemented_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str133$Last_test_in_set_ended__);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str132$_unimplemented_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str134$Overall_status__);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(kbq_query_run.runstate_result_status(runstate));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str135$Explanation__);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(kbq_query_run.runstate_result_text(runstate));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str136$Results_for_member_tests_);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = kbq_query_run.kct_set_runstate_test_runstates(runstate);
                        SubLObject kct_runstate = NIL;
                        kct_runstate = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cb_kct_individual_runstate_results(kct_runstate, output_style);
                            cdolist_list_var = cdolist_list_var.rest();
                            kct_runstate = cdolist_list_var.first();
                        } 
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$29, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$28, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_kct_individual_runstate_results(final SubLObject kct_runstate, final SubLObject output_style) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != kbq_query_run.kct_runstate_p(kct_runstate) : "kbq_query_run.kct_runstate_p(kct_runstate) " + "CommonSymbols.NIL != kbq_query_run.kct_runstate_p(kct_runstate) " + kct_runstate;
        final SubLObject test = kbq_query_run.runstate_constant(kct_runstate);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($$$Test_Results_for_);
        cb_form(test, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_br();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(TWO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str139$Query__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_form(kct_utils.kct_query_specification(test, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str140$Query_Formula__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_form(kb_query.kbq_sentences(kct_utils.kct_query_specification(test, UNPROVIDED)).first(), UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str141$Test_Status__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject status = kbq_query_run.runstate_result_status(kct_runstate);
                    if ($FAILURE == status) {
                        final SubLObject color_val = $str142$_B40000;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != color_val) {
                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(color_val));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ(status);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    } else
                        if ($SUCCESS == status) {
                            final SubLObject color_val = $str143$_228b22;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ(status);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        } else {
                            html_princ(status);
                        }

                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (kbq_query_run.runstate_result_status(kct_runstate) == $FAILURE) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str135$Explanation__);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.verify_not_within_html_pre();
                        html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                        final SubLObject _prev_bind_0_$62 = html_macros.$within_html_pre$.currentBinding(thread);
                        try {
                            html_macros.$within_html_pre$.bind(T, thread);
                            html_princ(kbq_query_run.kct_runstate_failure_explanation(kct_runstate));
                        } finally {
                            html_macros.$within_html_pre$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            SubLObject cdolist_list_var = kbq_query_run.kb_test_metrics_to_query_metrics(kct_utils.kct_test_metrics(kbq_query_run.kct_runstate_test_spec(kct_runstate), UNPROVIDED));
            SubLObject metric = NIL;
            metric = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject metric_value = kbq_query_run.kct_runstate_metric_value(kct_runstate, metric);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(metric);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(metric_value);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                metric = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject kct_register_test_spec_of_inference(final SubLObject inference, final SubLObject test_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        assert NIL != kct_utils.kct_test_spec_p(test_spec, UNPROVIDED) : "kct_utils.kct_test_spec_p(test_spec, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != kct_utils.kct_test_spec_p(test_spec, CommonSymbols.UNPROVIDED) " + test_spec;
        return sethash(inference, $kct_inference_test_spec_map$.getDynamicValue(thread), test_spec);
    }

    public static SubLObject kct_deregister_test_spec_of_inference(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        return remhash(inference, $kct_inference_test_spec_map$.getDynamicValue(thread));
    }

    public static SubLObject kct_lookup_test_spec_by_inference(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        return gethash(inference, $kct_inference_test_spec_map$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject kct_test_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject kct_test_state_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$kct_test_state_native.class ? T : NIL;
    }

    public static SubLObject kct_test_state_test_spec(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject kct_test_state_name(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject kct_test_state_comments(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject kct_test_state_query_state(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject kct_test_state_save_mt(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject kct_test_state_answer_status(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject kct_test_state_answer_options_index(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject kct_test_state_answer_options_bindings_index(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject kct_test_state_categories(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject kct_test_state_metrics(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject kct_test_state_cyclists(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject kct_test_state_notes(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject kct_test_state_answer_cardinality(final SubLObject v_object) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.getField14();
    }

    public static SubLObject _csetf_kct_test_state_test_spec(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_kct_test_state_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_kct_test_state_comments(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_kct_test_state_query_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_kct_test_state_save_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_kct_test_state_answer_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_kct_test_state_answer_options_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_kct_test_state_answer_options_bindings_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_kct_test_state_categories(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_kct_test_state_metrics(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_kct_test_state_cyclists(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_kct_test_state_notes(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_kct_test_state_answer_cardinality(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_test_state_p(v_object) : "cb_kct_test.kct_test_state_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject make_kct_test_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $kct_test_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TEST_SPEC)) {
                _csetf_kct_test_state_test_spec(v_new, current_value);
            } else
                if (pcase_var.eql($NAME)) {
                    _csetf_kct_test_state_name(v_new, current_value);
                } else
                    if (pcase_var.eql($COMMENTS)) {
                        _csetf_kct_test_state_comments(v_new, current_value);
                    } else
                        if (pcase_var.eql($QUERY_STATE)) {
                            _csetf_kct_test_state_query_state(v_new, current_value);
                        } else
                            if (pcase_var.eql($SAVE_MT)) {
                                _csetf_kct_test_state_save_mt(v_new, current_value);
                            } else
                                if (pcase_var.eql($ANSWER_STATUS)) {
                                    _csetf_kct_test_state_answer_status(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ANSWER_OPTIONS_INDEX)) {
                                        _csetf_kct_test_state_answer_options_index(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ANSWER_OPTIONS_BINDINGS_INDEX)) {
                                            _csetf_kct_test_state_answer_options_bindings_index(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($CATEGORIES)) {
                                                _csetf_kct_test_state_categories(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($METRICS)) {
                                                    _csetf_kct_test_state_metrics(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($CYCLISTS)) {
                                                        _csetf_kct_test_state_cyclists(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($NOTES)) {
                                                            _csetf_kct_test_state_notes(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($ANSWER_CARDINALITY)) {
                                                                _csetf_kct_test_state_answer_cardinality(v_new, current_value);
                                                            } else {
                                                                Errors.error($str195$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_kct_test_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_KCT_TEST_STATE, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TEST_SPEC, kct_test_state_test_spec(obj));
        funcall(visitor_fn, obj, $SLOT, $NAME, kct_test_state_name(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENTS, kct_test_state_comments(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERY_STATE, kct_test_state_query_state(obj));
        funcall(visitor_fn, obj, $SLOT, $SAVE_MT, kct_test_state_save_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $ANSWER_STATUS, kct_test_state_answer_status(obj));
        funcall(visitor_fn, obj, $SLOT, $ANSWER_OPTIONS_INDEX, kct_test_state_answer_options_index(obj));
        funcall(visitor_fn, obj, $SLOT, $ANSWER_OPTIONS_BINDINGS_INDEX, kct_test_state_answer_options_bindings_index(obj));
        funcall(visitor_fn, obj, $SLOT, $CATEGORIES, kct_test_state_categories(obj));
        funcall(visitor_fn, obj, $SLOT, $METRICS, kct_test_state_metrics(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCLISTS, kct_test_state_cyclists(obj));
        funcall(visitor_fn, obj, $SLOT, $NOTES, kct_test_state_notes(obj));
        funcall(visitor_fn, obj, $SLOT, $ANSWER_CARDINALITY, kct_test_state_answer_cardinality(obj));
        funcall(visitor_fn, obj, $END, MAKE_KCT_TEST_STATE, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_kct_test_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kct_test_state(obj, visitor_fn);
    }

    public static SubLObject kct_test_state_add_note(final SubLObject test_state, final SubLObject note) {
        assert NIL != kct_test_state_p(test_state) : "cb_kct_test.kct_test_state_p(test_state) " + "CommonSymbols.NIL != cb_kct_test.kct_test_state_p(test_state) " + test_state;
        assert NIL != stringp(note) : "Types.stringp(note) " + "CommonSymbols.NIL != Types.stringp(note) " + note;
        _csetf_kct_test_state_notes(test_state, cons(note, kct_test_state_notes(test_state)));
        return kct_test_state_notes(test_state);
    }

    public static SubLObject kct_test_state_set_cardinality(final SubLObject test_state, final SubLObject type, final SubLObject num) {
        assert NIL != kct_test_state_p(test_state) : "cb_kct_test.kct_test_state_p(test_state) " + "CommonSymbols.NIL != cb_kct_test.kct_test_state_p(test_state) " + test_state;
        if (((NIL != num) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(num))) {
            throw new AssertionError(num);
        }
        if (NIL == subl_promotions.memberP(type, $list203, UNPROVIDED, UNPROVIDED)) {
            Errors.error($str204$_A_is_not_a_known_answer_cardinal, type);
        }
        _csetf_kct_test_state_answer_cardinality(test_state, putf(kct_test_state_answer_cardinality(test_state), type, num));
        return kct_test_state_answer_cardinality(test_state);
    }

    public static SubLObject cb_kct_new_test_state_from_test_spec(final SubLObject test_spec) {
        assert NIL != kct_utils.kct_test_spec_p(test_spec, UNPROVIDED) : "kct_utils.kct_test_spec_p(test_spec, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != kct_utils.kct_test_spec_p(test_spec, CommonSymbols.UNPROVIDED) " + test_spec;
        final SubLObject test_state = make_kct_test_state(UNPROVIDED);
        final SubLObject query_spec = kct_utils.kct_query_specification(test_spec, UNPROVIDED);
        final SubLObject query_state = cb_kb_query_state.cb_kbq_new_query_state_from_query_spec(query_spec, test_state);
        final SubLObject defining_mt = kct_utils.kct_defining_mt(test_spec);
        _csetf_kct_test_state_test_spec(test_state, test_spec);
        _csetf_kct_test_state_name(test_state, cb_string_for_fort(test_spec));
        _csetf_kct_test_state_comments(test_state, kct_utils.kct_comments(test_spec, UNPROVIDED));
        _csetf_kct_test_state_query_state(test_state, query_state);
        _csetf_kct_test_state_save_mt(test_state, defining_mt);
        _csetf_kct_test_state_answer_options_index(test_state, new_id_index(UNPROVIDED, UNPROVIDED));
        _csetf_kct_test_state_answer_options_bindings_index(test_state, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        _csetf_kct_test_state_answer_cardinality(test_state, list_utilities.make_plist($list203, $list205));
        final SubLObject exact_bindings = kct_utils.kct_exact_binding_sets(test_spec, defining_mt);
        final SubLObject wanted_bindings = kct_utils.kct_wanted_binding_sets(test_spec, defining_mt);
        final SubLObject unwanted_bindings = kct_utils.kct_unwanted_binding_sets(test_spec, defining_mt);
        final SubLObject bindings_unimportantP = kct_utils.kct_bindings_unimportantP(test_spec, defining_mt);
        final SubLObject answers_cardinality = kct_utils.kct_binding_sets_cardinality(test_spec, defining_mt);
        final SubLObject answers_min_cardinality = kct_utils.kct_binding_sets_min_cardinality(test_spec, defining_mt);
        final SubLObject answers_max_cardinality = kct_utils.kct_binding_sets_max_cardinality(test_spec, defining_mt);
        kct_test_state_set_cardinality(test_state, $N, answers_cardinality);
        kct_test_state_set_cardinality(test_state, $MIN, answers_min_cardinality);
        kct_test_state_set_cardinality(test_state, $MAX, answers_max_cardinality);
        if (NIL != bindings_unimportantP) {
            _csetf_kct_test_state_answer_status(test_state, $UNIMPORTANT);
        } else
            if ((NIL != exact_bindings) || (NIL != kct_utils.kct_exact_set_of_binding_sets(test_spec, defining_mt))) {
                _csetf_kct_test_state_answer_status(test_state, $EXACT);
                SubLObject cdolist_list_var = exact_bindings;
                SubLObject binding_set = NIL;
                binding_set = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    new_kct_answer(binding_set, test_state, $WANTED);
                    cdolist_list_var = cdolist_list_var.rest();
                    binding_set = cdolist_list_var.first();
                } 
            } else
                if ((NIL != wanted_bindings) || (NIL != unwanted_bindings)) {
                    _csetf_kct_test_state_answer_status(test_state, $INEXACT);
                    SubLObject cdolist_list_var = wanted_bindings;
                    SubLObject binding_set = NIL;
                    binding_set = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != bindings.kb_binding_set_p(binding_set)) {
                            new_kct_answer(binding_set, test_state, $WANTED);
                        } else {
                            kct_test_state_add_note(test_state, cconcatenate($str213$The_wanted_binding_set__, new SubLObject[]{ format_nil.format_nil_a_no_copy(binding_set), $str214$__was_not_a_KB_BINDING_SET_P____d }));
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        binding_set = cdolist_list_var.first();
                    } 
                    cdolist_list_var = unwanted_bindings;
                    binding_set = NIL;
                    binding_set = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != bindings.kb_binding_set_p(binding_set)) {
                            new_kct_answer(binding_set, test_state, $UNWANTED);
                        } else {
                            kct_test_state_add_note(test_state, cconcatenate($str216$The_unwanted_binding_set__, new SubLObject[]{ format_nil.format_nil_a_no_copy(binding_set), $str214$__was_not_a_KB_BINDING_SET_P____d }));
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        binding_set = cdolist_list_var.first();
                    } 
                } else {
                    _csetf_kct_test_state_answer_status(test_state, $UNSPECIFIED);
                }


        _csetf_kct_test_state_categories(test_state, kct_utils.kct_asserted_test_collections(test_spec, defining_mt));
        _csetf_kct_test_state_metrics(test_state, kct_utils.kct_test_metrics(test_spec, defining_mt));
        _csetf_kct_test_state_cyclists(test_state, kct_utils.kct_responsible_cyclists(test_spec, UNPROVIDED));
        return test_state;
    }

    public static SubLObject cb_kct_new_test_state_from_inference(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject test_state = make_kct_test_state(UNPROVIDED);
        final SubLObject query_state = cb_kb_query_state.cb_kbq_new_query_state_from_inference(inference, test_state);
        _csetf_kct_test_state_test_spec(test_state, kct_lookup_test_spec_by_inference(inference));
        _csetf_kct_test_state_query_state(test_state, query_state);
        _csetf_kct_test_state_save_mt(test_state, kct_variables.kct_mt());
        _csetf_kct_test_state_answer_options_index(test_state, new_id_index(UNPROVIDED, UNPROVIDED));
        _csetf_kct_test_state_answer_options_bindings_index(test_state, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        _csetf_kct_test_state_answer_cardinality(test_state, list_utilities.make_plist($list203, $list205));
        return test_state;
    }

    public static SubLObject kct_test_state_exact_bindings(final SubLObject test_state) {
        return kct_test_state_bindings_of_type(test_state, $EXACT, $WANTED);
    }

    public static SubLObject kct_test_state_wanted_bindings(final SubLObject test_state) {
        return kct_test_state_bindings_of_type(test_state, $INEXACT, $WANTED);
    }

    public static SubLObject kct_test_state_unwanted_bindings(final SubLObject test_state) {
        return kct_test_state_bindings_of_type(test_state, $INEXACT, $UNWANTED);
    }

    public static SubLObject kct_test_state_unspecified_bindings(final SubLObject test_state) {
        return kct_test_state_bindings_of_type(test_state, NIL, $UNSPECIFIED);
    }

    public static SubLObject kct_test_state_bindings_unimportantP(final SubLObject test_state) {
        return eq(kct_test_state_answer_status(test_state), $UNIMPORTANT);
    }

    public static SubLObject kct_test_state_no_answersP(final SubLObject test_state) {
        return makeBoolean((kct_test_state_answer_status(test_state) == $EXACT) && (NIL == kct_test_state_exact_bindings(test_state)));
    }

    public static SubLObject kct_test_state_bindings_of_type(final SubLObject test_state, final SubLObject exactness, final SubLObject wantedness) {
        if ((NIL != exactness) && (!kct_test_state_answer_status(test_state).eql(exactness))) {
            return NIL;
        }
        SubLObject binding_sets = NIL;
        final SubLObject idx;
        final SubLObject v_id_index = idx = kct_test_state_answer_options_index(test_state);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$66 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$66, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$66);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject kct_answer;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    kct_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(kct_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(kct_answer)) {
                            kct_answer = $SKIP;
                        }
                        if (kct_answer_status(kct_answer).eql(wantedness)) {
                            binding_sets = cons(kct_answer_binding_set(kct_answer), binding_sets);
                        }
                    }
                }
            }
            final SubLObject idx_$67 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$67)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$67);
                SubLObject id2 = NIL;
                SubLObject kct_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        kct_answer2 = getEntryValue(cdohash_entry);
                        if (kct_answer_status(kct_answer2).eql(wantedness)) {
                            binding_sets = cons(kct_answer_binding_set(kct_answer2), binding_sets);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return nreverse(binding_sets);
    }

    public static SubLObject cb_clear_kct_test_being_saved() {
        $cb_kct_test_being_saved$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject cb_kct_test_being_saved() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_kct_test_being_saved$.getDynamicValue(thread);
    }

    public static SubLObject cb_set_kct_test_being_saved(final SubLObject kct_test_state) {
        $cb_kct_test_being_saved$.setDynamicValue(kct_test_state);
        return kct_test_state;
    }

    public static SubLObject kct_answer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject kct_answer_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$kct_answer_native.class ? T : NIL;
    }

    public static SubLObject kct_answer_binding_set(final SubLObject v_object) {
        assert NIL != kct_answer_p(v_object) : "cb_kct_test.kct_answer_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject kct_answer_status(final SubLObject v_object) {
        assert NIL != kct_answer_p(v_object) : "cb_kct_test.kct_answer_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject kct_answer_id(final SubLObject v_object) {
        assert NIL != kct_answer_p(v_object) : "cb_kct_test.kct_answer_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_kct_answer_binding_set(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_answer_p(v_object) : "cb_kct_test.kct_answer_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_kct_answer_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_answer_p(v_object) : "cb_kct_test.kct_answer_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_kct_answer_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != kct_answer_p(v_object) : "cb_kct_test.kct_answer_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_kct_answer(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $kct_answer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($BINDING_SET)) {
                _csetf_kct_answer_binding_set(v_new, current_value);
            } else
                if (pcase_var.eql($STATUS)) {
                    _csetf_kct_answer_status(v_new, current_value);
                } else
                    if (pcase_var.eql($ID)) {
                        _csetf_kct_answer_id(v_new, current_value);
                    } else {
                        Errors.error($str195$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_kct_answer(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_KCT_ANSWER, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $BINDING_SET, kct_answer_binding_set(obj));
        funcall(visitor_fn, obj, $SLOT, $STATUS, kct_answer_status(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, kct_answer_id(obj));
        funcall(visitor_fn, obj, $END, MAKE_KCT_ANSWER, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_kct_answer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kct_answer(obj, visitor_fn);
    }

    public static SubLObject new_kct_answer(final SubLObject binding_set, final SubLObject test_state, SubLObject status) {
        if (status == UNPROVIDED) {
            status = $UNSPECIFIED;
        }
        assert NIL != bindings.kb_binding_set_p(binding_set) : "bindings.kb_binding_set_p(binding_set) " + "CommonSymbols.NIL != bindings.kb_binding_set_p(binding_set) " + binding_set;
        assert NIL != kct_test_state_p(test_state) : "cb_kct_test.kct_test_state_p(test_state) " + "CommonSymbols.NIL != cb_kct_test.kct_test_state_p(test_state) " + test_state;
        assert NIL != keywordp(status) : "Types.keywordp(status) " + "CommonSymbols.NIL != Types.keywordp(status) " + status;
        final SubLObject v_id_index = kct_test_state_answer_options_index(test_state);
        final SubLObject bindings_index = kct_test_state_answer_options_bindings_index(test_state);
        final SubLObject id = id_index_reserve(v_id_index);
        final SubLObject kct_answer = make_kct_answer(UNPROVIDED);
        _csetf_kct_answer_binding_set(kct_answer, binding_set);
        _csetf_kct_answer_status(kct_answer, status);
        _csetf_kct_answer_id(kct_answer, id);
        id_index_enter(v_id_index, id, kct_answer);
        dictionary.dictionary_enter(bindings_index, binding_set, kct_answer);
        return kct_answer;
    }

    public static SubLObject kct_answer_id_count(final SubLObject test_state) {
        assert NIL != kct_test_state_p(test_state) : "cb_kct_test.kct_test_state_p(test_state) " + "CommonSymbols.NIL != cb_kct_test.kct_test_state_p(test_state) " + test_state;
        final SubLObject v_id_index = kct_test_state_answer_options_index(test_state);
        return id_index_count(v_id_index);
    }

    public static SubLObject kct_answer_id_lookup(final SubLObject test_state, final SubLObject id) {
        assert NIL != kct_test_state_p(test_state) : "cb_kct_test.kct_test_state_p(test_state) " + "CommonSymbols.NIL != cb_kct_test.kct_test_state_p(test_state) " + test_state;
        final SubLObject v_id_index = kct_test_state_answer_options_index(test_state);
        return id_index_lookup(v_id_index, id, UNPROVIDED);
    }

    public static SubLObject kct_answer_bindings_lookup(final SubLObject test_state, final SubLObject binding_set) {
        assert NIL != kct_test_state_p(test_state) : "cb_kct_test.kct_test_state_p(test_state) " + "CommonSymbols.NIL != cb_kct_test.kct_test_state_p(test_state) " + test_state;
        assert NIL != bindings.kb_binding_set_p(binding_set) : "bindings.kb_binding_set_p(binding_set) " + "CommonSymbols.NIL != bindings.kb_binding_set_p(binding_set) " + binding_set;
        final SubLObject bindings_index = kct_test_state_answer_options_bindings_index(test_state);
        return dictionary.dictionary_lookup(bindings_index, binding_set, UNPROVIDED);
    }

    public static SubLObject kct_answer_id_remove(final SubLObject test_state, final SubLObject id) {
        assert NIL != kct_test_state_p(test_state) : "cb_kct_test.kct_test_state_p(test_state) " + "CommonSymbols.NIL != cb_kct_test.kct_test_state_p(test_state) " + test_state;
        final SubLObject v_id_index = kct_test_state_answer_options_index(test_state);
        return id_index_remove(v_id_index, id);
    }

    public static SubLObject set_kct_answer_status(final SubLObject kct_answer, final SubLObject status) {
        assert NIL != kct_answer_p(kct_answer) : "cb_kct_test.kct_answer_p(kct_answer) " + "CommonSymbols.NIL != cb_kct_test.kct_answer_p(kct_answer) " + kct_answer;
        assert NIL != keywordp(status) : "Types.keywordp(status) " + "CommonSymbols.NIL != Types.keywordp(status) " + status;
        _csetf_kct_answer_status(kct_answer, status);
        return kct_answer;
    }

    public static SubLObject cb_link_kct_edit(final SubLObject test_spec, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str73$_Edit_Test_;
        }
        assert NIL != kct_utils.kct_test_spec_p(test_spec, UNPROVIDED) : "kct_utils.kct_test_spec_p(test_spec, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != kct_utils.kct_test_spec_p(test_spec, CommonSymbols.UNPROVIDED) " + test_spec;
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str242$Edit_this_instance_of___KBContent.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str242$Edit_this_instance_of___KBContent, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str243$cb_edit_test__A, cb_fort_identifier(test_spec));
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str244$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_edit_test(final SubLObject args) {
        final SubLObject test_spec = cb_guess_fort(args.first(), UNPROVIDED);
        if (NIL == kct_utils.kct_test_spec_p(test_spec, UNPROVIDED)) {
            return cb_error($str246$_A_does_not_denote_a_test_specifi, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_set_kct_test_being_saved(cb_kct_new_test_state_from_test_spec(test_spec));
        cb_kb_query_state.cb_set_kb_query_being_saved(kct_test_state_query_state(cb_kct_test_being_saved()));
        cb_confirm_save_as_test(test_spec);
        return NIL;
    }

    public static SubLObject cb_link_kct_save(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str248$_Save_As_Test_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject frame_name_var = cb_frame_name($SELF);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str250$Create_an_instance_of___KBContent.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str250$Create_an_instance_of___KBContent, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str251$cb_save_as_test__A__A, inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(inference)), inference_datastructures_inference.inference_suid(inference));
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str244$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_save_as_test(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list254);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list254);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list254);
            return NIL;
        }
        final SubLObject store_id = parse_integer(store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject inference_id = parse_integer(inference_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(store_id, inference_id);
        final SubLObject test_spec = (NIL != inference) ? kct_lookup_test_spec_by_inference(inference) : NIL;
        if (NIL == inference) {
            return cb_error($str255$Inference__S_in_problem_store__S_, inference_id, store_id, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_set_kct_test_being_saved(cb_kct_new_test_state_from_inference(inference));
        cb_kb_query_state.cb_set_kb_query_being_saved(kct_test_state_query_state(cb_kct_test_being_saved()));
        if (NIL != kct_utils.kct_test_spec_p(test_spec, UNPROVIDED)) {
            _csetf_kct_test_state_test_spec(cb_kct_test_being_saved(), test_spec);
        }
        return cb_confirm_save_as_test(test_spec);
    }

    public static SubLObject cb_confirm_save_as_test(SubLObject test_spec) {
        if (test_spec == UNPROVIDED) {
            test_spec = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = (NIL != test_spec) ? $$$Edit_Test_Specification : $str258$Save_Inference_Settings_and_Resul;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str21$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$68 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ(title);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_complete.html_complete_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$69 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_script_utilities.cb_hoverover_page_init();
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str259$cb_handle_confirm_save_as_test, NIL, UNPROVIDED);
                            cb_show_save_as_test_header(title);
                            html_newline(UNPROVIDED);
                            cb_save_as_test_submit_section(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_query.cb_query_new_inference_mt_section(cb_kb_query_state.kb_query_state_best_sentence(cb_kb_query_state.cb_kb_query_being_saved()), cb_kb_query_state.kb_query_state_best_mt(cb_kb_query_state.cb_kb_query_being_saved()), NIL);
                            html_newline(UNPROVIDED);
                            cb_kb_query.cb_kb_query_warn_of_extra_mt();
                            html_newline(UNPROVIDED);
                            cb_query.cb_query_new_inference_sentence_section(cb_kb_query_state.kb_query_state_best_sentence(cb_kb_query_state.cb_kb_query_being_saved()), NIL);
                            html_newline(UNPROVIDED);
                            cb_kb_query.cb_kb_query_warn_of_extra_sentence();
                            html_newline(UNPROVIDED);
                            cb_query.cb_query_new_inference_non_explanatory_sentence_section(cb_kb_query_state.kb_query_state_non_explanatory_sentence(cb_kb_query_state.cb_kb_query_being_saved()), NIL);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_kb_query.cb_kb_query_parameters_section(UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_kct_test_categories_section(UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_kct_test_metrics_section(UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_kct_responsible_cyclists_section(UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$69, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$68, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_show_save_as_test_header(final SubLObject title) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject size_val = FIVE_INTEGER;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_query.cb_princ_strong_with_explanation(title, $str260$An_interface_for_creating_and_edi, $$$Save_As_Test, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        cb_query.cb_princ_strong_with_explanation($str262$Goto_section__, $str263$Shortcut_links_to_sections_that_a, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_query.cb_princ_with_target_reference_and_explanation($str264$mt_section, $str265$_Mt_, $str266$Change_the_Microtheory_settings_t, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_query.cb_princ_with_target_reference_and_explanation($str267$sentence_section, $str268$_Sentence_, $str269$Change_the_CycL_sentence_to_be_us, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_query.cb_princ_with_target_reference_and_explanation($str270$parameters_section, $str271$_Inference_Parameters_, $str272$Adjust_the_inference_parameters_a, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_query.cb_princ_with_target_reference_and_explanation($str273$categories_section, $str274$_Test_Categories_, $str275$Specify_instances_of_KBContentTes, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_query.cb_princ_with_target_reference_and_explanation($str276$metrics_section, $str277$_Test_Metrics_, $str278$Specify_metrics_that_should_be_co, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_query.cb_princ_with_target_reference_and_explanation($str279$cyclists_section, $str280$_Responsible_Cyclists_, $str281$Specify_cyclists_that_are_respons, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != kct_test_state_notes(cb_kct_test_being_saved())) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str282$Notes_);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            SubLObject cdolist_list_var = kct_test_state_notes(cb_kct_test_being_saved());
            SubLObject note = NIL;
            note = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_princ(note);
                html_newline(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                note = cdolist_list_var.first();
            } 
        }
        html_hr(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_save_as_test_submit_section(SubLObject allow_editP) {
        if (allow_editP == UNPROVIDED) {
            allow_editP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_newline(UNPROVIDED);
        final SubLObject name = kct_test_state_name(cb_kct_test_being_saved());
        final SubLObject test_spec = kct_test_state_test_spec(cb_kct_test_being_saved());
        html_indent(UNPROVIDED);
        cb_query.cb_princ_strong_with_explanation($str283$Test_Name__, $str284$The_constant_name_to_save_the_tes, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != allow_editP) {
            html_text_input($$$name, name, $int$40);
        } else {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            if (NIL != test_spec) {
                cb_form(test_spec, UNPROVIDED, UNPROVIDED);
            } else {
                html_princ(name);
            }
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        if (NIL != allow_editP) {
            html_indent(UNPROVIDED);
            cb_query.cb_submit_input_with_explanation($str286$Next__Specify_Expected_Results_, $str287$Store_the_specified_sentence__mt_, $$$new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_newline(TWO_INTEGER);
        if (NIL != allow_editP) {
            html_reset_input($$$Reset_Values);
            html_newline(UNPROVIDED);
        }
        dhtml_macros.dhtml_switch_visibility_links($str290$cb_kct_save_mt, $$$Show, $$$Hide);
        final SubLObject initial_visibility = $INVISIBLE;
        final SubLObject size_val = FOUR_INTEGER;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_query.cb_princ_strong_with_explanation($str294$Save_In_Mt__, $str295$The_microtheory_in_which_to_save_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        dhtml_macros.dhtml_set_switched_visibility($str290$cb_kct_save_mt, initial_visibility, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str290$cb_kct_save_mt);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != allow_editP) {
                cb_form_widgets.cb_mt_input_section(kct_test_state_save_mt(cb_kct_test_being_saved()), $list297);
            } else {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                cb_form(kct_test_state_save_mt(cb_kct_test_being_saved()), UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_kct_test_categories_section(SubLObject allow_editP) {
        if (allow_editP == UNPROVIDED) {
            allow_editP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_target_definition($str273$categories_section);
        dhtml_macros.dhtml_switch_visibility_links($str298$test_categories, $$$Show, $$$Hide);
        final SubLObject size_val = FOUR_INTEGER;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_query.cb_princ_strong_with_explanation($str299$Test_Categories__optional_, $str300$Instances_of_KBContentTestSpecifi, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        dhtml_macros.dhtml_set_switched_visibility($str298$test_categories, $VISIBLE, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str298$test_categories);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject current_categories = kct_test_state_categories(cb_kct_test_being_saved());
            final SubLObject kct_regression_test_checkedP = list_utilities.member_eqP($$KBContentRegressionTest, current_categories);
            if (NIL == kct_regression_test_checkedP) {
                current_categories = cons($$KBContentRegressionTest, current_categories);
            }
            SubLObject cdolist_list_var = current_categories;
            SubLObject category = NIL;
            category = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_newline(UNPROVIDED);
                if (NIL != allow_editP) {
                    final SubLObject checkedP = makeBoolean((NIL == kb_utilities.kbeq(category, $$KBContentRegressionTest)) || (NIL != kct_regression_test_checkedP));
                    html_checkbox_input($$$category, cb_fort_identifier(category), checkedP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(TWO_INTEGER);
                    cb_form(category, UNPROVIDED, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                category = cdolist_list_var.first();
            } 
            if (NIL != allow_editP) {
                final SubLObject candidates = isa.all_fort_instances_in_all_mts($$KBContentTestSpecificationType);
                if (length(candidates).numG($int$100)) {
                    html_newline(UNPROVIDED);
                    html_complete.html_complete_button($str305$category_name, $$$Complete, $$KBContentTestSpecificationType, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ_strong($str306$Add_a_Test_Category__);
                    html_indent(UNPROVIDED);
                    html_text_input($str305$category_name, UNPROVIDED, UNPROVIDED);
                } else {
                    html_newline(UNPROVIDED);
                    html_princ_strong($str306$Add_a_Test_Category__);
                    html_indent(UNPROVIDED);
                    cb_fort_list_selector($str307$category_id, Sort.sort(candidates, symbol_function($sym308$STRING_), symbol_function(FORT_NAME)), NIL, ONE_INTEGER, symbol_function(IDENTITY), T, UNPROVIDED);
                }
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_kct_test_metrics_section(SubLObject allow_editP) {
        if (allow_editP == UNPROVIDED) {
            allow_editP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_target_definition($str276$metrics_section);
        dhtml_macros.dhtml_switch_visibility_links($str310$test_metrics, $$$Show, $$$Hide);
        final SubLObject size_val = FOUR_INTEGER;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_query.cb_princ_strong_with_explanation($$$Test_Metrics_to_Gather, $str312$The_metrics_that_should_be_gather, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        dhtml_macros.dhtml_set_switched_visibility($str310$test_metrics, $VISIBLE, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str310$test_metrics);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_newline(UNPROVIDED);
            final SubLObject current_metrics = kct_test_state_metrics(cb_kct_test_being_saved());
            if ((NIL == current_metrics) && (NIL == allow_editP)) {
                html_princ_strong($str313$None_selected_);
            }
            SubLObject cdolist_list_var = ctest_utils.ctest_all_kb_test_metric_constants();
            SubLObject metric_constant = NIL;
            metric_constant = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject selected = member(metric_constant, current_metrics, UNPROVIDED, UNPROVIDED);
                if (NIL != allow_editP) {
                    html_checkbox_input($$$metric, cb_fort_identifier(metric_constant), selected, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(TWO_INTEGER);
                }
                if ((NIL != allow_editP) || (NIL != selected)) {
                    cb_form(metric_constant, UNPROVIDED, UNPROVIDED);
                    html_newline(UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                metric_constant = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_kct_responsible_cyclists_section(SubLObject allow_editP) {
        if (allow_editP == UNPROVIDED) {
            allow_editP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_target_definition($str279$cyclists_section);
        dhtml_macros.dhtml_switch_visibility_links($$$cyclists, $$$Show, $$$Hide);
        final SubLObject size_val = FOUR_INTEGER;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_query.cb_princ_strong_with_explanation($str316$Responsible_Cyclists__required_, $str317$The_cyclists_who_are_responsible_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        dhtml_macros.dhtml_set_switched_visibility($$$cyclists, $VISIBLE, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$cyclists);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject cyclists = kct_test_state_cyclists(cb_kct_test_being_saved());
            if (NIL != cyclists) {
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != allow_editP) {
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($CENTER));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ_strong($str319$Selected_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ_strong($$$Cyclist);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    SubLObject cdolist_list_var = cyclists;
                    SubLObject cyclist = NIL;
                    cyclist = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != allow_editP) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_checkbox_input($$$cyclist, cb_fort_identifier(cyclist), T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($CENTER));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form(cyclist, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        cyclist = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            if (NIL != allow_editP) {
                html_newline(UNPROVIDED);
                html_complete.html_complete_button($str322$cyclist_name, $$$Complete, $$HumanCyclist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                html_princ_strong($str324$Add_a_Cyclist__);
                html_indent(UNPROVIDED);
                html_text_input($str322$cyclist_name, NIL != cyclists ? NIL : operation_communication.the_cyclist(), UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_handle_confirm_save_as_test(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject glosses = cb_kb_query.cb_kb_query_extract_glosses(args);
        thread.resetMultipleValues();
        final SubLObject name = cb_kb_query.cb_kb_query_extract_name(args);
        final SubLObject name_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != name_error) {
            return cb_error($str325$_A, name_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject defining_mt = cb_kb_query.cb_kb_query_extract_defining_mt(args);
        final SubLObject defining_mt_error = thread.secondMultipleValue();
        final SubLObject defining_mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != defining_mt_error) {
            return cb_error($str325$_A, defining_mt_error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject v_inference_parameters = cb_query.cb_query_extract_parameters(args, NIL, UNPROVIDED);
        final SubLObject parameter_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != parameter_error) {
            return cb_error($str325$_A, parameter_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != mt_error) {
            cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list326);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject non_explanatory_sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list327);
        final SubLObject non_explanatory_sentence_error = thread.secondMultipleValue();
        final SubLObject non_explanatory_sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != non_explanatory_sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(non_explanatory_sentence_error, non_explanatory_sentence_error_string, $list328);
        }
        thread.resetMultipleValues();
        final SubLObject test_categories = cb_kct_extract_test_categories(args);
        final SubLObject category_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != category_error) {
            return cb_error($str325$_A, category_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject metric_constants = cb_kct_extract_test_metrics(args);
        final SubLObject metric_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != metric_error) {
            return cb_error($str325$_A, metric_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject responsible_cyclists = cb_kct_extract_responsible_cyclists(args);
        final SubLObject cyclist_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != cyclist_error) {
            return cb_error($str325$_A, cyclist_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject folder_mt_pairs = cb_kb_query.cb_kb_query_extract_folder_mt_pairs(args);
        final SubLObject folder_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != folder_error) {
            return cb_error($str325$_A, folder_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        _csetf_kct_test_state_name(cb_kct_test_being_saved(), name);
        _csetf_kct_test_state_save_mt(cb_kct_test_being_saved(), defining_mt);
        _csetf_kct_test_state_categories(cb_kct_test_being_saved(), test_categories);
        _csetf_kct_test_state_metrics(cb_kct_test_being_saved(), metric_constants);
        _csetf_kct_test_state_cyclists(cb_kct_test_being_saved(), responsible_cyclists);
        cb_kb_query_state._csetf_kb_query_state_template_glosses(cb_kb_query_state.cb_kb_query_being_saved(), glosses);
        cb_kb_query_state._csetf_kb_query_state_save_mt(cb_kb_query_state.cb_kb_query_being_saved(), defining_mt);
        cb_kb_query_state._csetf_kb_query_state_query_properties(cb_kb_query_state.cb_kb_query_being_saved(), v_inference_parameters);
        cb_kb_query_state._csetf_kb_query_state_query_mts(cb_kb_query_state.cb_kb_query_being_saved(), list(mt));
        cb_kb_query_state._csetf_kb_query_state_sentences(cb_kb_query_state.cb_kb_query_being_saved(), list(sentence));
        cb_kb_query_state._csetf_kb_query_state_non_explanatory_sentence(cb_kb_query_state.cb_kb_query_being_saved(), non_explanatory_sentence);
        cb_kb_query_state._csetf_kb_query_state_template_folder_mt_pairs(cb_kb_query_state.cb_kb_query_being_saved(), folder_mt_pairs);
        _csetf_kct_test_state_query_state(cb_kct_test_being_saved(), cb_kb_query_state.cb_kb_query_being_saved());
        cb_kb_query_state._csetf_kb_query_state_test_state(cb_kb_query_state.cb_kb_query_being_saved(), cb_kct_test_being_saved());
        final SubLObject test_spec = kct_test_state_test_spec(cb_kct_test_being_saved());
        final SubLObject existing_name = (NIL != constant_p(test_spec)) ? constants_high.constant_name(test_spec) : NIL;
        if (((NIL != constant_completion_high.valid_constant_name_p(name)) && (NIL != constant_completion_high.valid_constant_name_p(existing_name))) && (!name.equal(existing_name))) {
            _csetf_kct_test_state_test_spec(cb_kct_test_being_saved(), NIL);
        }
        final SubLObject inference = cb_kb_query_state.kb_query_state_inference(cb_kb_query_state.cb_kb_query_being_saved());
        if ((NIL != inference_datastructures_inference.inference_p(inference)) && inference_datastructures_inference.inference_input_el_query(inference).equal(sentence)) {
            thread.resetMultipleValues();
            final SubLObject current_answers = cb_query_browser.cb_inference_current_answers(inference);
            final SubLObject free = thread.secondMultipleValue();
            final SubLObject ignore = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = current_answers;
            SubLObject inference_answer = NIL;
            inference_answer = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject binding_set = bindings.kbify_inference_binding_set(inference_datastructures_inference.inference_answer_bindings(inference_answer));
                if (NIL == kct_answer_bindings_lookup(cb_kct_test_being_saved(), binding_set)) {
                    new_kct_answer(binding_set, cb_kct_test_being_saved(), UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inference_answer = cdolist_list_var.first();
            } 
        }
        cb_kct_prune_test_state_answers_for_sentence(cb_kct_test_being_saved());
        return cb_kct_specify_test_results(cb_kct_test_being_saved());
    }

    public static SubLObject cb_kct_prune_test_state_answers_for_sentence(final SubLObject test_state) {
        final SubLObject query_state = kct_test_state_query_state(test_state);
        final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence(query_state);
        final SubLObject free_variables = (NIL != el_implication_p(sentence)) ? conditional_sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED) : sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject idx;
        final SubLObject answer_index = idx = kct_test_state_answer_options_index(test_state);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$79 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$79, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$79);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject kct_answer;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    kct_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(kct_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(kct_answer)) {
                            kct_answer = $SKIP;
                        }
                        if (NIL == list_utilities.sets_equalP(bindings.kb_binding_set_variables(kct_answer_binding_set(kct_answer)), free_variables, UNPROVIDED)) {
                            kct_answer_id_remove(test_state, id);
                        }
                    }
                }
            }
            final SubLObject idx_$80 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$80)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$80);
                SubLObject id2 = NIL;
                SubLObject kct_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        kct_answer2 = getEntryValue(cdohash_entry);
                        if (NIL == list_utilities.sets_equalP(bindings.kb_binding_set_variables(kct_answer_binding_set(kct_answer2)), free_variables, UNPROVIDED)) {
                            kct_answer_id_remove(test_state, id2);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return test_state;
    }

    public static SubLObject cb_kct_extract_test_categories(final SubLObject args) {
        final SubLObject category_id_strings = html_extract_input_values($$$category, args);
        SubLObject category_name = html_extract_input($str305$category_name, args);
        final SubLObject category_from_select = cb_decode_fort_list_selector_result($str307$category_id, args);
        SubLObject new_category = NIL;
        SubLObject all_categories = NIL;
        SubLObject error = NIL;
        if (NIL != string_utilities.empty_stringP(category_name)) {
            category_name = NIL;
        }
        if (NIL != constant_completion_high.valid_constant_name_p(category_name)) {
            new_category = constants_high.find_constant(category_name);
        }
        SubLObject cdolist_list_var = category_id_strings;
        SubLObject category_id_string = NIL;
        category_id_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == string_utilities.empty_stringP(category_id_string)) {
                final SubLObject category = cb_guess_term(category_id_string, UNPROVIDED);
                if (NIL == kct_utils.kct_test_collection_p(category, UNPROVIDED)) {
                    error = format(NIL, $str330$The_ID___A__did_not_yield_a_KBCon, category_id_string);
                }
                if (NIL == error) {
                    all_categories = cons(category, all_categories);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            category_id_string = cdolist_list_var.first();
        } 
        if ((NIL != new_category) && (NIL != kct_utils.kct_test_collection_p(new_category, UNPROVIDED))) {
            all_categories = cons(new_category, all_categories);
        } else
            if (NIL != category_name) {
                error = format(NIL, $str331$The_name___S__did_not_denote_a_KB, category_name);
            }

        if (NIL == cb_fort_list_none_selected_p(category_from_select)) {
            if (NIL != kct_utils.kct_test_collection_p(category_from_select, UNPROVIDED)) {
                all_categories = cons(category_from_select, all_categories);
            } else {
                error = format(NIL, $str332$The_object___S__extracted_from_th, category_from_select);
            }
        }
        return values(all_categories, error);
    }

    public static SubLObject cb_kct_extract_test_metrics(final SubLObject args) {
        final SubLObject metric_id_strings = html_extract_input_values($$$metric, args);
        SubLObject metric_constants = NIL;
        SubLObject error = NIL;
        SubLObject cdolist_list_var = metric_id_strings;
        SubLObject metric_id_string = NIL;
        metric_id_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == string_utilities.empty_stringP(metric_id_string)) {
                final SubLObject metric_constant = cb_guess_term(metric_id_string, UNPROVIDED);
                if (NIL == ctest_utils.ctest_kb_test_metric_p(metric_constant)) {
                    error = format(NIL, $str333$The_ID___A__did_not_yield_a_Test_, metric_id_string);
                }
                if (NIL == error) {
                    metric_constants = cons(metric_constant, metric_constants);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            metric_id_string = cdolist_list_var.first();
        } 
        return values(metric_constants, error);
    }

    public static SubLObject cb_kct_extract_responsible_cyclists(final SubLObject args) {
        final SubLObject cyclist_id_strings = html_extract_input_values($$$cyclist, args);
        final SubLObject cyclist_name = html_extract_input($str322$cyclist_name, args);
        final SubLObject new_cyclist = (NIL != constant_completion_high.valid_constant_name_p(cyclist_name)) ? constants_high.find_constant(cyclist_name) : NIL;
        SubLObject all_cyclists = NIL;
        SubLObject error = NIL;
        SubLObject cdolist_list_var = cyclist_id_strings;
        SubLObject cyclist_id_string = NIL;
        cyclist_id_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == string_utilities.empty_stringP(cyclist_id_string)) {
                final SubLObject cyclist = cb_guess_term(cyclist_id_string, UNPROVIDED);
                if (NIL == kb_accessors.cyclistP(cyclist)) {
                    error = format(NIL, $str334$The_ID___A__did_not_yield_a_Human, cyclist_id_string);
                }
                if (NIL == error) {
                    all_cyclists = cons(cyclist, all_cyclists);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cyclist_id_string = cdolist_list_var.first();
        } 
        if (NIL != kb_accessors.cyclistP(new_cyclist)) {
            all_cyclists = cons(new_cyclist, all_cyclists);
        } else
            if (NIL == all_cyclists) {
                error = format(NIL, $str335$The_name___A__did_not_denote_a_Hu, cyclist_name);
            }

        return values(all_cyclists, error);
    }

    public static SubLObject cb_kct_toggle_rowcolor() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($cb_kct_rowcolor$.getDynamicValue(thread).equal($str337$_ccccff)) {
            $cb_kct_rowcolor$.setDynamicValue($str27$_ffffff, thread);
        } else {
            $cb_kct_rowcolor$.setDynamicValue($str337$_ccccff, thread);
        }
        return $cb_kct_rowcolor$.getDynamicValue(thread);
    }

    public static SubLObject cb_kct_specify_test_results(final SubLObject test_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_state = kct_test_state_query_state(test_state);
        final SubLObject exact_bindings = kct_test_state_exact_bindings(test_state);
        final SubLObject wanted_bindings = kct_test_state_wanted_bindings(test_state);
        final SubLObject unwanted_bindings = kct_test_state_unwanted_bindings(test_state);
        final SubLObject unspecified_bindings = kct_test_state_unspecified_bindings(test_state);
        final SubLObject bindings_unimportantP = kct_test_state_bindings_unimportantP(test_state);
        final SubLObject answer_cardinality = getf(kct_test_state_answer_cardinality(test_state), $N, UNPROVIDED);
        final SubLObject answer_min_cardinality = getf(kct_test_state_answer_cardinality(test_state), $MIN, UNPROVIDED);
        final SubLObject answer_max_cardinality = getf(kct_test_state_answer_cardinality(test_state), $MAX, UNPROVIDED);
        final SubLObject title = $$$Specify_Test_Expectations;
        final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence(query_state);
        final SubLObject mt = cb_kb_query_state.kb_query_state_best_mt(query_state);
        final SubLObject free_el_variables = (NIL != el_implication_p(sentence)) ? conditional_sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED) : sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject no_free_vars_sentence = sublisp_null(free_el_variables);
        final SubLObject title_var = title;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str21$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$81 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                dhtml_macros.html_basic_cb_scripts();
                html_complete.html_complete_script();
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$82 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str125$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str339$reloadCurrentFrame__reloadFrameBu);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_script_utilities.cb_hoverover_page_init();
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str340$cb_handle_specify_test_results, T, UNPROVIDED);
                            final SubLObject size_val = FIVE_INTEGER;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != size_val) {
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(size_val);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_query.cb_princ_strong_with_explanation(title, $str341$The_interface_for_stating_test_ex, $$$Specify_Test_Expectations, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Exactly_);
                                        html_text_input($$$cardinality, answer_cardinality, FIVE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str345$_answers_should_be_found_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$At_least_);
                                        html_text_input($str347$min_cardinality, answer_min_cardinality, FIVE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str345$_answers_should_be_found_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$At_most_);
                                        html_text_input($str349$max_cardinality, answer_max_cardinality, FIVE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str345$_answers_should_be_found_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_radio_input($$$bindings, $$$unimportant, bindings_unimportantP, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str352$The_bindings_obtained_are_unimpor);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                if (NIL != no_free_vars_sentence) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_radio_input($$$bindings, $$$proven, makeBoolean(length(exact_bindings).numE(ONE_INTEGER) && (NIL == bindings.kb_binding_set_values(exact_bindings.first()))), UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str354$The_query__with_no_free_variables);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_radio_input($$$bindings, $$$none, makeBoolean((NIL == exact_bindings) && (kct_test_state_answer_status(test_state) == $EXACT)), UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != free_el_variables) {
                                            html_princ($str356$No_bindings_should_be_found_);
                                        } else {
                                            html_princ($str357$The_query__with_no_free_variables);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                if (NIL == no_free_vars_sentence) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_radio_input($$$bindings, $$$exact, exact_bindings, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(TWO_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str359$Require_all_and_only_the_wanted_b);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    final SubLObject checkedP = makeBoolean((NIL != wanted_bindings) || (NIL != unwanted_bindings));
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_input_radio$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($$$bindings);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_princ($$$inexact);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != checkedP) {
                                                html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
                                            }
                                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(TWO_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str361$Specify_wanted_and_or_unwanted_bi);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    if ((((NIL != exact_bindings) || (NIL != wanted_bindings)) || (NIL != unwanted_bindings)) || (NIL != unspecified_bindings)) {
                                        final SubLObject span = add(THREE_INTEGER, length(free_el_variables));
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (NIL != span) {
                                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(span);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ_strong($str362$Check_wanted_and_unwanted_binding);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ_strong($$$Wanted);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ_strong($$$Not_Wanted);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ_strong($$$Unspecified);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            cb_query_browser.cb_show_bindings_horizontal_variable_row(free_el_variables, NIL, T);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        $cb_kct_rowcolor$.setDynamicValue($str337$_ccccff, thread);
                                        cb_kct_show_wanted_answers(test_state, free_el_variables);
                                        cb_kct_show_unwanted_answers(test_state, free_el_variables);
                                        cb_kct_show_unspecified_answers(test_state, free_el_variables);
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            if (NIL != free_el_variables) {
                                html_newline(UNPROVIDED);
                                cb_kct_specify_new_binding_section(sentence, mt, free_el_variables);
                            }
                            html_newline(TWO_INTEGER);
                            cb_query.cb_submit_input_with_explanation($$$Save_New_Test, $str368$Creates_a_new___KBContentTest_Ful, $str369$save_new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != kct_test_state_test_spec(cb_kct_test_being_saved())) {
                                cb_query.cb_submit_input_with_explanation($$$Overwrite_Existing_Test, $str371$Overwrites_the_existing_test_spec, $$$overwrite, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_kb_query.cb_multiple_choice_query_options_section(cb_kb_query_state.cb_kb_query_being_saved());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        final SubLObject size_val2 = FOUR_INTEGER;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val2) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val2);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_query.cb_princ_strong_with_explanation($$$Test_Definition_So_Far, $str374$The_currently_specified_propertie, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        cb_save_as_test_submit_section(NIL);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_kb_query.cb_kb_query_show_mt();
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_kb_query.cb_kb_query_show_sentence();
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_kb_query.cb_kb_query_show_pragmatics();
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_kb_query.cb_kb_query_parameters_section(NIL);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_kct_test_categories_section(NIL);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_kct_test_metrics_section(NIL);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_kct_responsible_cyclists_section(NIL);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$82, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$81, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_kct_specify_new_binding_section(final SubLObject sentence, final SubLObject mt, final SubLObject free_el_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_query.cb_princ_strong_with_explanation($str375$Specify_a_binding_set_, $str376$Enter_values_for_each_free_variab, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(TWO_INTEGER);
        html_princ_strong($str377$Wanted_);
        html_indent(ONE_INTEGER);
        html_radio_input($$$new, $$$wanted, NIL, UNPROVIDED);
        html_indent(FOUR_INTEGER);
        html_princ_strong($str379$Unwanted_);
        html_indent(ONE_INTEGER);
        html_radio_input($$$new, $$$unwanted, NIL, UNPROVIDED);
        html_indent(FOUR_INTEGER);
        cb_query.cb_submit_input_with_explanation($$$Add_this_binding_set, $str382$Updates_the_state_of_the_test_bei, $$$add, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject types_dictionary = at_var_types.formula_variables_arg_constraints_dict(sentence, mt, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(TWO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject name;
            SubLObject variable;
            SubLObject types;
            SubLObject type;
            SubLObject _prev_bind_0_$119;
            SubLObject _prev_bind_0_$120;
            SubLObject _prev_bind_0_$121;
            for (cdotimes_end_var = length(free_el_variables), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                name = format(NIL, $str384$new__A, i);
                variable = elt(free_el_variables, i);
                types = genls.min_cols(dictionary.dictionary_lookup(types_dictionary, variable, UNPROVIDED).first(), mt, UNPROVIDED);
                type = (NIL != list_utilities.singletonP(types)) ? types.first() : NIL;
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($$$top));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong(variable);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($$$top));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_form_widgets.cb_el_term_input_section(NIL, list($INPUT_NAME, name, $COMPLETE_TYPE, type));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_kct_show_answer_inputs(final SubLObject kct_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = kct_answer_id(kct_answer);
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_radio_input(format(NIL, $str388$wanted__A, id), $$$yes, eq(kct_answer_status(kct_answer), $WANTED), UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_radio_input(format(NIL, $str388$wanted__A, id), $$$no, eq(kct_answer_status(kct_answer), $UNWANTED), UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_radio_input(format(NIL, $str388$wanted__A, id), $$$unspecified, eq(kct_answer_status(kct_answer), $UNSPECIFIED), UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_kct_show_wanted_answers(final SubLObject test_state, final SubLObject free_el_variables) {
        return cb_kct_show_answers_of_type(test_state, free_el_variables, $WANTED);
    }

    public static SubLObject cb_kct_show_unwanted_answers(final SubLObject test_state, final SubLObject free_el_variables) {
        return cb_kct_show_answers_of_type(test_state, free_el_variables, $UNWANTED);
    }

    public static SubLObject cb_kct_show_unspecified_answers(final SubLObject test_state, final SubLObject free_el_variables) {
        return cb_kct_show_answers_of_type(test_state, free_el_variables, $UNSPECIFIED);
    }

    public static SubLObject cb_kct_show_answers_of_type(final SubLObject test_state, final SubLObject free_el_variables, final SubLObject status) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx;
        final SubLObject v_id_index = idx = kct_test_state_answer_options_index(test_state);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$122 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$122, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$122);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject kct_answer;
                SubLObject binding_set;
                SubLObject _prev_bind_0;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    kct_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(kct_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(kct_answer)) {
                            kct_answer = $SKIP;
                        }
                        if (kct_answer_status(kct_answer).eql(status)) {
                            binding_set = bindings.inferencify_kb_binding_set(kct_answer_binding_set(kct_answer));
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (NIL != $cb_kct_rowcolor$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($cb_kct_rowcolor$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_kct_show_answer_inputs(kct_answer);
                                cb_query_browser.cb_show_bindings_horizontal_value_row(binding_set, free_el_variables);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            cb_kct_toggle_rowcolor();
                        }
                    }
                }
            }
            final SubLObject idx_$123 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$123)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$123);
                SubLObject id2 = NIL;
                SubLObject kct_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        kct_answer2 = getEntryValue(cdohash_entry);
                        if (kct_answer_status(kct_answer2).eql(status)) {
                            final SubLObject binding_set2 = bindings.inferencify_kb_binding_set(kct_answer_binding_set(kct_answer2));
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (NIL != $cb_kct_rowcolor$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($cb_kct_rowcolor$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_kct_show_answer_inputs(kct_answer2);
                                cb_query_browser.cb_show_bindings_horizontal_value_row(binding_set2, free_el_variables);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            cb_kct_toggle_rowcolor();
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_handle_specify_test_results(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence(cb_kb_query_state.cb_kb_query_being_saved());
        final SubLObject mc_option_specs = cb_kb_query.cb_kb_query_extract_multiple_choice_option_specs(args, sentence);
        final SubLObject submit_mode = cb_kct_extract_submit_mode(args);
        cb_kb_query_state._csetf_kb_query_state_multiple_choice_option_specs(cb_kb_query_state.cb_kb_query_being_saved(), mc_option_specs);
        thread.resetMultipleValues();
        final SubLObject cardinality_successP = cb_kct_update_answer_cardinality(args);
        final SubLObject cardinality_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == cardinality_successP) {
            return cb_error($str325$_A, cardinality_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject successP = cb_kct_update_answer_options(args);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            return cb_error($str325$_A, error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject pcase_var = submit_mode;
        if (pcase_var.eql($ADD)) {
            cb_kct_specify_test_results(cb_kct_test_being_saved());
            return NIL;
        }
        if (pcase_var.eql($SAVE_NEW)) {
            final SubLObject result = cb_kct_save_new_test(cb_kct_test_being_saved());
            if (NIL != result) {
                cb_kb_query_state.cb_clear_kb_query_being_saved();
                cb_clear_kct_test_being_saved();
            }
            return result;
        }
        if (pcase_var.eql($OVERWRITE)) {
            final SubLObject result = cb_kct_overwrite_test(cb_kct_test_being_saved());
            if (NIL != result) {
                cb_kb_query_state.cb_clear_kb_query_being_saved();
                cb_clear_kct_test_being_saved();
            }
            return result;
        }
        return cb_error($str395$Unknown_test_save_method__A, submit_mode, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_kct_extract_submit_mode(final SubLObject args) {
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($$$add, args))) {
            return $ADD;
        }
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($str369$save_new, args))) {
            return $SAVE_NEW;
        }
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($$$overwrite, args))) {
            return $OVERWRITE;
        }
        return $UNKNOWN;
    }

    public static SubLObject cb_kct_update_answer_cardinality(final SubLObject args) {
        SubLObject answer_cardinality = html_extract_input($$$cardinality, args);
        SubLObject answer_min_cardinality = html_extract_input($str347$min_cardinality, args);
        SubLObject answer_max_cardinality = html_extract_input($str349$max_cardinality, args);
        if (NIL != string_utilities.empty_string_p(answer_cardinality)) {
            kct_test_state_set_cardinality(cb_kct_test_being_saved(), $N, NIL);
        } else {
            answer_cardinality = read_from_string_ignoring_errors(answer_cardinality, NIL, $EOF, UNPROVIDED, UNPROVIDED);
            if (!answer_cardinality.isInteger()) {
                return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(answer_cardinality), $str399$_is_not_an_integer_));
            }
            kct_test_state_set_cardinality(cb_kct_test_being_saved(), $N, answer_cardinality);
        }
        if (NIL != string_utilities.empty_string_p(answer_min_cardinality)) {
            kct_test_state_set_cardinality(cb_kct_test_being_saved(), $MIN, NIL);
        } else {
            answer_min_cardinality = read_from_string_ignoring_errors(answer_min_cardinality, NIL, $EOF, UNPROVIDED, UNPROVIDED);
            if (!answer_min_cardinality.isInteger()) {
                return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(answer_cardinality), $str399$_is_not_an_integer_));
            }
            kct_test_state_set_cardinality(cb_kct_test_being_saved(), $MIN, answer_min_cardinality);
        }
        if (NIL != string_utilities.empty_string_p(answer_max_cardinality)) {
            kct_test_state_set_cardinality(cb_kct_test_being_saved(), $MAX, NIL);
        } else {
            answer_max_cardinality = read_from_string_ignoring_errors(answer_max_cardinality, NIL, $EOF, UNPROVIDED, UNPROVIDED);
            if (!answer_max_cardinality.isInteger()) {
                return values(NIL, cconcatenate(format_nil.format_nil_a_no_copy(answer_cardinality), $str399$_is_not_an_integer_));
            }
            kct_test_state_set_cardinality(cb_kct_test_being_saved(), $MAX, answer_max_cardinality);
        }
        return values(T, NIL);
    }

    public static SubLObject cb_kct_update_answer_options(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject exact = cb_kct_extract_answers(args);
        final SubLObject wanted = thread.secondMultipleValue();
        final SubLObject unwanted = thread.thirdMultipleValue();
        final SubLObject unimportantP = thread.fourthMultipleValue();
        final SubLObject answers_error = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != answers_error) {
            return values(NIL, answers_error);
        }
        final SubLObject idx;
        final SubLObject v_id_index = idx = kct_test_state_answer_options_index(cb_kct_test_being_saved());
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$124 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$124, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$124);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject kct_answer;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    kct_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(kct_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(kct_answer)) {
                            kct_answer = $SKIP;
                        }
                        set_kct_answer_status(kct_answer, $UNSPECIFIED);
                    }
                }
            }
            final SubLObject idx_$125 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$125)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$125);
                SubLObject id2 = NIL;
                SubLObject kct_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        kct_answer2 = getEntryValue(cdohash_entry);
                        set_kct_answer_status(kct_answer2, $UNSPECIFIED);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        if (NIL != unimportantP) {
            _csetf_kct_test_state_answer_status(cb_kct_test_being_saved(), $UNIMPORTANT);
        } else
            if (NIL != exact) {
                _csetf_kct_test_state_answer_status(cb_kct_test_being_saved(), $EXACT);
                if (exact != $NONE) {
                    SubLObject cdolist_list_var = exact;
                    SubLObject exact_answer = NIL;
                    exact_answer = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        set_kct_answer_status(exact_answer, $WANTED);
                        cdolist_list_var = cdolist_list_var.rest();
                        exact_answer = cdolist_list_var.first();
                    } 
                }
            } else
                if ((NIL != wanted) || (NIL != unwanted)) {
                    _csetf_kct_test_state_answer_status(cb_kct_test_being_saved(), $INEXACT);
                    SubLObject cdolist_list_var = wanted;
                    SubLObject wanted_answer = NIL;
                    wanted_answer = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        set_kct_answer_status(wanted_answer, $WANTED);
                        cdolist_list_var = cdolist_list_var.rest();
                        wanted_answer = cdolist_list_var.first();
                    } 
                    cdolist_list_var = unwanted;
                    SubLObject unwanted_answer = NIL;
                    unwanted_answer = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        set_kct_answer_status(unwanted_answer, $UNWANTED);
                        cdolist_list_var = cdolist_list_var.rest();
                        unwanted_answer = cdolist_list_var.first();
                    } 
                }


        thread.resetMultipleValues();
        final SubLObject status = cb_kct_extract_new_binding_status(args);
        final SubLObject new_binding_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == status) {
            return values(T, NIL);
        }
        if (NIL != new_binding_error) {
            return values(NIL, new_binding_error);
        }
        thread.resetMultipleValues();
        final SubLObject exactness = cb_kct_extract_exactness(args);
        final SubLObject exactness_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != exactness_error) {
            return values(NIL, exactness_error);
        }
        _csetf_kct_test_state_answer_status(cb_kct_test_being_saved(), exactness);
        if (exactness == $UNIMPORTANT) {
            return values(T, NIL);
        }
        final SubLObject query_state = kct_test_state_query_state(cb_kct_test_being_saved());
        final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence(query_state);
        final SubLObject free_el_variables = (NIL != el_implication_p(sentence)) ? conditional_sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED) : sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject v_bindings = NIL;
        SubLObject binding_set = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject value;
        SubLObject binding;
        for (cdotimes_end_var = length(free_el_variables), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            value = cb_kct_extract_binding_value(format(NIL, $str384$new__A, i), args);
            binding = (NIL != value) ? bindings.make_kb_binding(elt(free_el_variables, i), value) : NIL;
            if (NIL != bindings.kb_binding_p(binding)) {
                v_bindings = cons(binding, v_bindings);
            }
        }
        if (NIL != list_utilities.same_length_p(v_bindings, free_el_variables)) {
            binding_set = bindings.make_kb_binding_set(v_bindings);
            if (NIL == kct_answer_bindings_lookup(cb_kct_test_being_saved(), binding_set)) {
                new_kct_answer(binding_set, cb_kct_test_being_saved(), status);
            }
        }
        return values(T, NIL);
    }

    public static SubLObject cb_kct_extract_binding_value(final SubLObject html_key, final SubLObject args) {
        return cb_form_widgets.cb_extract_el_term_input(args, listS($REQUIRED_, T, $INPUT_NAME, html_key, $list401));
    }

    public static SubLObject cb_kct_extract_new_binding_status(final SubLObject args) {
        final SubLObject v_new = html_extract_input($$$new, args);
        final SubLObject error = NIL;
        if (NIL != error) {
            return NIL;
        }
        if (v_new.equal($$$wanted)) {
            return $WANTED;
        }
        if (v_new.equal($$$unwanted)) {
            return $UNWANTED;
        }
        return NIL;
    }

    public static SubLObject cb_kct_extract_exactness(final SubLObject args) {
        final SubLObject exactness = html_extract_input($$$bindings, args);
        if (exactness.equal($$$unimportant)) {
            return values($UNIMPORTANT, NIL);
        }
        if (exactness.equal($$$none)) {
            return values($EXACT, NIL);
        }
        if (exactness.equal($$$proven)) {
            return values($EXACT, NIL);
        }
        if (exactness.equal($$$exact)) {
            return values($EXACT, NIL);
        }
        if (exactness.equal($$$inexact)) {
            return values($INEXACT, NIL);
        }
        return values(NIL, format(NIL, $str402$The_value___A__is_not_a_known_exa, exactness));
    }

    public static SubLObject cb_kct_extract_test_spec(final SubLObject args) {
        final SubLObject test_spec_id_string = html_extract_input($str403$test_spec, args);
        final SubLObject test_spec = cb_guess_fort(test_spec_id_string, UNPROVIDED);
        SubLObject error = NIL;
        if (NIL == kct_utils.kct_test_spec_p(test_spec, UNPROVIDED)) {
            error = format(NIL, $str404$_A_does_not_denote_a_test_specifi, test_spec_id_string);
        }
        return values(test_spec, error);
    }

    public static SubLObject cb_kct_extract_answers(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject exactness = cb_kct_extract_exactness(args);
        SubLObject exact = NIL;
        SubLObject wanted = NIL;
        SubLObject unwanted = NIL;
        SubLObject unimportant = NIL;
        SubLObject error = NIL;
        final SubLObject pcase_var = exactness;
        if (pcase_var.eql($EXACT)) {
            thread.resetMultipleValues();
            final SubLObject ex = cb_kct_extract_exact_answers(args);
            final SubLObject er = thread.secondMultipleValue();
            thread.resetMultipleValues();
            exact = ex;
            error = er;
        } else
            if (pcase_var.eql($INEXACT)) {
                thread.resetMultipleValues();
                final SubLObject wan = cb_kct_extract_wanted_answers(args);
                SubLObject er = thread.secondMultipleValue();
                thread.resetMultipleValues();
                wanted = wan;
                error = er;
                thread.resetMultipleValues();
                final SubLObject unwan = cb_kct_extract_unwanted_answers(args);
                er = thread.secondMultipleValue();
                thread.resetMultipleValues();
                unwanted = unwan;
                error = er;
            } else
                if (pcase_var.eql($UNIMPORTANT)) {
                    unimportant = T;
                } else {
                    error = $str405$You_need_to_make_a_choice_for_Exp;
                }


        return values(exact, wanted, unwanted, unimportant, error);
    }

    public static SubLObject cb_kct_extract_exact_answers(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject exactness = html_extract_input($$$bindings, args);
        if (exactness.equalp($$$exact)) {
            thread.resetMultipleValues();
            final SubLObject wanted_kct_answers = cb_kct_gather_answers_internal($$$yes, args);
            final SubLObject error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(wanted_kct_answers, error);
        }
        if (exactness.equalp($$$proven)) {
            SubLObject v_answer = kct_answer_bindings_lookup(cb_kct_test_being_saved(), bindings.proven_kb_binding_set());
            if (NIL == v_answer) {
                v_answer = new_kct_answer(bindings.proven_kb_binding_set(), cb_kct_test_being_saved(), $WANTED);
            }
            return values(list(v_answer), NIL);
        }
        if (exactness.equalp($$$none)) {
            return values($NONE, NIL);
        }
        return values(NIL, $str406$Problem_extracting_exact_answers_);
    }

    public static SubLObject cb_kct_extract_wanted_answers(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject wanted_kct_answers = cb_kct_gather_answers_internal($$$yes, args);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(wanted_kct_answers, error);
    }

    public static SubLObject cb_kct_extract_unwanted_answers(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unwanted_kct_answers = cb_kct_gather_answers_internal($$$no, args);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(unwanted_kct_answers, error);
    }

    public static SubLObject cb_kct_gather_answers_internal(final SubLObject value, final SubLObject args) {
        final SubLObject v_id_index = kct_test_state_answer_options_index(cb_kct_test_being_saved());
        SubLObject error = NIL;
        SubLObject answers = NIL;
        final SubLObject idx = v_id_index;
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$126 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$126, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$126);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject kct_answer;
                SubLObject wanted;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    kct_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(kct_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(kct_answer)) {
                            kct_answer = $SKIP;
                        }
                        wanted = html_extract_input(format(NIL, $str388$wanted__A, id), args);
                        if (wanted.equal(value)) {
                            if (NIL == kct_answer_p(kct_answer)) {
                                error = format(NIL, $str407$The_ID__A_does_not_denote_a_kct_a, id);
                            }
                            if (NIL == error) {
                                answers = cons(kct_answer, answers);
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$127 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$127)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$127);
                SubLObject id2 = NIL;
                SubLObject kct_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        kct_answer2 = getEntryValue(cdohash_entry);
                        final SubLObject wanted2 = html_extract_input(format(NIL, $str388$wanted__A, id2), args);
                        if (wanted2.equal(value)) {
                            if (NIL == kct_answer_p(kct_answer2)) {
                                error = format(NIL, $str407$The_ID__A_does_not_denote_a_kct_a, id2);
                            }
                            if (NIL != error) {
                                continue;
                            }
                            answers = cons(kct_answer2, answers);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return values(answers, error);
    }

    public static SubLObject cb_kct_save_new_test(final SubLObject test_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$Save_Test_Specification);
            return NIL;
        }
        SubLObject successP = NIL;
        final SubLObject name = kct_test_state_name(test_state);
        final SubLObject defining_mt = kct_test_state_save_mt(test_state);
        final SubLObject exact_bindings = kct_test_state_exact_bindings(test_state);
        final SubLObject wanted_bindings = kct_test_state_wanted_bindings(test_state);
        final SubLObject unwanted_bindings = kct_test_state_unwanted_bindings(test_state);
        final SubLObject bindings_unimportantP = kct_test_state_bindings_unimportantP(test_state);
        final SubLObject no_answersP = kct_test_state_no_answersP(test_state);
        final SubLObject answer_cardinality = getf(kct_test_state_answer_cardinality(test_state), $N, UNPROVIDED);
        final SubLObject answer_min_cardinality = getf(kct_test_state_answer_cardinality(test_state), $MIN, UNPROVIDED);
        final SubLObject answer_max_cardinality = getf(kct_test_state_answer_cardinality(test_state), $MAX, UNPROVIDED);
        final SubLObject metric_constants = kct_test_state_metrics(test_state);
        final SubLObject responsible_cyclists = kct_test_state_cyclists(test_state);
        final SubLObject test_categories = kct_test_state_categories(test_state);
        final SubLObject query_state = kct_test_state_query_state(test_state);
        final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence(query_state);
        final SubLObject non_explanatory_sentence = cb_kb_query_state.kb_query_state_non_explanatory_sentence(query_state);
        final SubLObject mt = cb_kb_query_state.kb_query_state_best_mt(query_state);
        final SubLObject v_inference_parameters = cb_kb_query_state.kb_query_state_query_properties(query_state);
        final SubLObject glosses = cb_kb_query_state.kb_query_state_template_glosses(query_state);
        final SubLObject folder_mt_pairs = cb_kb_query_state.kb_query_state_template_folder_mt_pairs(query_state);
        final SubLObject multiple_choice_option_specs = cb_kb_query_state.kb_query_state_multiple_choice_option_specs(query_state);
        if (NIL == constant_completion_high.valid_constant_name_p(name)) {
            return cb_error($str409$_A_is_not_a_valid_constant_name_, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject exact_constant = constants_high.find_constant(name);
        SubLObject new_test_spec = NIL;
        SubLObject new_query_spec_nat = NIL;
        if (NIL != exact_constant) {
            return cb_error($str410$Already_a_constant_named__A, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject inexact_constants = constant_completion_high.constant_complete(name, NIL, T, UNPROVIDED, UNPROVIDED);
        if (NIL != inexact_constants) {
            return cb_error($str411$Constant__S_already_exists_which_, inexact_constants.first(), name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        new_test_spec = cb_editor.cb_create_hook(name);
        new_query_spec_nat = make_formula($$TestQueryFn, list(new_test_spec), UNPROVIDED);
        kct_assert_test_spec_definition(new_test_spec, new_query_spec_nat, answer_cardinality, answer_min_cardinality, answer_max_cardinality, exact_bindings, wanted_bindings, unwanted_bindings, bindings_unimportantP, no_answersP, metric_constants, responsible_cyclists, test_categories, defining_mt, multiple_choice_option_specs);
        new_query_spec_nat = narts_high.find_nart(new_query_spec_nat);
        kb_query.kbq_assert_query_spec_definition(new_query_spec_nat, sentence, mt, inference_parameters.explicify_query_tool_query_property_defaults(v_inference_parameters, sentence), defining_mt, non_explanatory_sentence, multiple_choice_option_specs);
        kb_query.kbq_assert_template_definition(new_query_spec_nat, NIL, glosses, folder_mt_pairs, defining_mt);
        SubLObject cdolist_list_var = list(new_test_spec, new_query_spec_nat);
        SubLObject new_term = NIL;
        new_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != constant_p(new_term)) {
                cb_tools.cb_add_to_constant_history(new_term);
            } else
                if (NIL != nart_handles.nart_p(new_term)) {
                    cb_tools.cb_add_to_nat_history(new_term);
                }

            cdolist_list_var = cdolist_list_var.rest();
            new_term = cdolist_list_var.first();
        } 
        thread.resetMultipleValues();
        final SubLObject status = kct_utils.why_not_kct_test_valid(new_test_spec);
        final SubLObject problems = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject message = NIL;
        if (NIL != status) {
            message = format(NIL, $str413$Save_New_Test_Specification_finis, problems);
        } else {
            message = $str414$Save_New_Test_Specification_finis;
            successP = T;
        }
        cb_assertion_editor.cb_note_edit_change(message, NIL, UNPROVIDED, UNPROVIDED);
        return successP;
    }

    public static SubLObject cb_kct_overwrite_test(final SubLObject test_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$Overwrite_Test_Specification);
            return NIL;
        }
        SubLObject successP = NIL;
        final SubLObject name = kct_test_state_name(test_state);
        SubLObject test_spec = kct_test_state_test_spec(test_state);
        final SubLObject test_defining_mt = kct_test_state_save_mt(test_state);
        final SubLObject answer_cardinality = getf(kct_test_state_answer_cardinality(test_state), $N, UNPROVIDED);
        final SubLObject answer_min_cardinality = getf(kct_test_state_answer_cardinality(test_state), $MIN, UNPROVIDED);
        final SubLObject answer_max_cardinality = getf(kct_test_state_answer_cardinality(test_state), $MAX, UNPROVIDED);
        final SubLObject exact_bindings = kct_test_state_exact_bindings(test_state);
        final SubLObject wanted_bindings = kct_test_state_wanted_bindings(test_state);
        final SubLObject unwanted_bindings = kct_test_state_unwanted_bindings(test_state);
        final SubLObject bindings_unimportantP = kct_test_state_bindings_unimportantP(test_state);
        final SubLObject no_answersP = kct_test_state_no_answersP(test_state);
        final SubLObject metric_constants = kct_test_state_metrics(test_state);
        final SubLObject responsible_cyclists = kct_test_state_cyclists(test_state);
        final SubLObject test_categories = kct_test_state_categories(test_state);
        final SubLObject query_state = kct_test_state_query_state(test_state);
        SubLObject query_spec = cb_kb_query_state.kb_query_state_query_spec(query_state);
        final SubLObject query_defining_mt = cb_kb_query_state.kb_query_state_save_mt(query_state);
        final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence(query_state);
        final SubLObject non_explanatory_sentence = cb_kb_query_state.kb_query_state_non_explanatory_sentence(query_state);
        final SubLObject mt = cb_kb_query_state.kb_query_state_best_mt(query_state);
        final SubLObject v_inference_parameters = cb_kb_query_state.kb_query_state_query_properties(query_state);
        final SubLObject template = cb_kb_query_state.kb_query_state_template(query_state);
        final SubLObject glosses = cb_kb_query_state.kb_query_state_template_glosses(query_state);
        final SubLObject folder_mt_pairs = cb_kb_query_state.kb_query_state_template_folder_mt_pairs(query_state);
        final SubLObject multiple_choice_option_specs = cb_kb_query_state.kb_query_state_multiple_choice_option_specs(query_state);
        if (NIL != name) {
            final SubLObject test_spec_to_edit = cb_guess_term(name, UNPROVIDED);
            if (NIL == kct_utils.kct_test_spec_p(test_spec_to_edit, UNPROVIDED)) {
                return cb_error($str416$_A_is_not_the_name_of_a_KBContent, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            test_spec = test_spec_to_edit;
        }
        query_spec = kct_utils.kct_query_specification(test_spec, test_defining_mt);
        if (NIL == query_spec) {
            query_spec = make_formula($$TestQueryFn, list(test_spec), UNPROVIDED);
        }
        kb_query.kbq_ensure_query_spec_definition(query_spec, sentence, mt, inference_parameters.explicify_query_tool_query_property_defaults(v_inference_parameters, sentence), query_defining_mt, non_explanatory_sentence, multiple_choice_option_specs);
        kb_query.kbq_ensure_template_definition(query_spec, template, glosses, folder_mt_pairs, query_defining_mt);
        kct_ensure_test_spec_definition(test_spec, query_spec, answer_cardinality, answer_min_cardinality, answer_max_cardinality, exact_bindings, wanted_bindings, unwanted_bindings, bindings_unimportantP, no_answersP, metric_constants, responsible_cyclists, test_categories, test_defining_mt, multiple_choice_option_specs);
        thread.resetMultipleValues();
        final SubLObject status = kct_utils.why_not_kct_test_valid(test_spec);
        final SubLObject problems = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject message = NIL;
        if (NIL != status) {
            message = format(NIL, $str417$Edit_Test_Specification_finished_, problems);
        } else {
            message = $str418$Edit_Test_Specification_finished_;
            successP = T;
        }
        cb_assertion_editor.cb_note_edit_change(message, NIL, UNPROVIDED, UNPROVIDED);
        return successP;
    }

    public static SubLObject kct_assert_test_spec_definition(final SubLObject test_spec, final SubLObject query_spec, final SubLObject answer_cardinality, final SubLObject answer_min_cardinality, final SubLObject answer_max_cardinality, final SubLObject exact_bindings, final SubLObject wanted_bindings, final SubLObject unwanted_bindings, final SubLObject unimportant_bindings, final SubLObject no_answers, final SubLObject metric_constants, final SubLObject responsible_cyclists, final SubLObject test_categories, final SubLObject defining_mt, final SubLObject multiple_choice_option_specs) {
        assert NIL != constant_p(test_spec) : "constant_handles.constant_p(test_spec) " + "CommonSymbols.NIL != constant_handles.constant_p(test_spec) " + test_spec;
        if (((NIL != answer_cardinality) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(answer_cardinality))) {
            throw new AssertionError(answer_cardinality);
        }
        if (((NIL != answer_min_cardinality) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(answer_min_cardinality))) {
            throw new AssertionError(answer_min_cardinality);
        }
        if (((NIL != answer_max_cardinality) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(answer_max_cardinality))) {
            throw new AssertionError(answer_max_cardinality);
        }
        if (((NIL != exact_bindings) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == listp(exact_bindings))) {
            throw new AssertionError(exact_bindings);
        }
        if (((NIL != wanted_bindings) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == listp(wanted_bindings))) {
            throw new AssertionError(wanted_bindings);
        }
        if (((NIL != unwanted_bindings) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == listp(unwanted_bindings))) {
            throw new AssertionError(unwanted_bindings);
        }
        assert NIL != listp(metric_constants) : "Types.listp(metric_constants) " + "CommonSymbols.NIL != Types.listp(metric_constants) " + metric_constants;
        assert NIL != listp(responsible_cyclists) : "Types.listp(responsible_cyclists) " + "CommonSymbols.NIL != Types.listp(responsible_cyclists) " + responsible_cyclists;
        assert NIL != hlmt.possibly_mt_p(defining_mt) : "hlmt.possibly_mt_p(defining_mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(defining_mt) " + defining_mt;
        if (NIL != multiple_choice_option_specs_non_trivialP(multiple_choice_option_specs)) {
            ke.ke_assert_now(listS($$isa, test_spec, $list423), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        } else {
            ke.ke_assert_now(listS($$isa, test_spec, $list424), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        }
        ke.ke_assert_now(list($$testQuerySpecification, test_spec, query_spec), defining_mt, UNPROVIDED, UNPROVIDED);
        SubLObject message = NIL;
        if ((NIL != exact_bindings) || (NIL != no_answers)) {
            kct_assert_exact_bindings(test_spec, exact_bindings, defining_mt, multiple_choice_option_specs);
        } else
            if ((NIL != wanted_bindings) || (NIL != unwanted_bindings)) {
                if (NIL != wanted_bindings) {
                    SubLObject cdolist_list_var = wanted_bindings;
                    SubLObject wanted_binding = NIL;
                    wanted_binding = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        kct_assert_wanted_binding(test_spec, wanted_binding, defining_mt);
                        cdolist_list_var = cdolist_list_var.rest();
                        wanted_binding = cdolist_list_var.first();
                    } 
                }
                if (NIL != unwanted_bindings) {
                    SubLObject cdolist_list_var = unwanted_bindings;
                    SubLObject unwanted_binding = NIL;
                    unwanted_binding = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        kct_assert_unwanted_binding(test_spec, unwanted_binding, defining_mt);
                        cdolist_list_var = cdolist_list_var.rest();
                        unwanted_binding = cdolist_list_var.first();
                    } 
                }
            } else
                if (NIL != unimportant_bindings) {
                    kct_assert_unimportant_bindings(test_spec, defining_mt);
                } else {
                    message = $str426$Remember_to_state_expected_result;
                }


        if (NIL != answer_cardinality) {
            kct_assert_answer_cardinality(test_spec, answer_cardinality, defining_mt);
        }
        if (NIL != answer_min_cardinality) {
            kct_assert_answer_min_cardinality(test_spec, answer_min_cardinality, defining_mt);
        }
        if (NIL != answer_max_cardinality) {
            kct_assert_answer_max_cardinality(test_spec, answer_max_cardinality, defining_mt);
        }
        SubLObject cdolist_list_var = test_categories;
        SubLObject test_category = NIL;
        test_category = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            kct_assert_test_category(test_spec, test_category, defining_mt);
            cdolist_list_var = cdolist_list_var.rest();
            test_category = cdolist_list_var.first();
        } 
        cdolist_list_var = metric_constants;
        SubLObject metric_constant = NIL;
        metric_constant = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            kct_assert_test_metric(test_spec, metric_constant, defining_mt);
            cdolist_list_var = cdolist_list_var.rest();
            metric_constant = cdolist_list_var.first();
        } 
        cdolist_list_var = responsible_cyclists;
        SubLObject cyclist = NIL;
        cyclist = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            kct_assert_responsible_cyclist(test_spec, cyclist, defining_mt);
            cdolist_list_var = cdolist_list_var.rest();
            cyclist = cdolist_list_var.first();
        } 
        return values(test_spec, message);
    }

    public static SubLObject multiple_choice_option_specs_non_trivialP(final SubLObject multiple_choice_option_specs) {
        SubLObject cdolist_list_var = multiple_choice_option_specs;
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = spec;
            SubLObject option_num = NIL;
            SubLObject full_label = NIL;
            SubLObject index_label = NIL;
            SubLObject kb_bindings = NIL;
            destructuring_bind_must_consp(current, datum, $list427);
            option_num = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list427);
            full_label = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list427);
            index_label = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list427);
            kb_bindings = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != kb_bindings) {
                    return T;
                }
            } else {
                cdestructuring_bind_error(datum, $list427);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject kct_ensure_test_spec_definition(final SubLObject test_spec, final SubLObject query_spec, final SubLObject answer_cardinality, final SubLObject answer_min_cardinality, final SubLObject answer_max_cardinality, final SubLObject exact_bindings, final SubLObject wanted_bindings, final SubLObject unwanted_bindings, final SubLObject unimportant_bindings, final SubLObject no_answers, final SubLObject metric_constants, final SubLObject responsible_cyclists, final SubLObject test_categories, final SubLObject defining_mt, final SubLObject multiple_choice_option_specs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != constant_p(test_spec) : "constant_handles.constant_p(test_spec) " + "CommonSymbols.NIL != constant_handles.constant_p(test_spec) " + test_spec;
        if (((NIL != answer_cardinality) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(answer_cardinality))) {
            throw new AssertionError(answer_cardinality);
        }
        if (((NIL != answer_min_cardinality) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(answer_min_cardinality))) {
            throw new AssertionError(answer_min_cardinality);
        }
        if (((NIL != answer_max_cardinality) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(answer_max_cardinality))) {
            throw new AssertionError(answer_max_cardinality);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.every_in_list(KB_BINDING_SET_P, wanted_bindings, UNPROVIDED))) {
            Errors.error($str428$Some_item_in__A_was_not_a_KB_BIND, exact_bindings);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.every_in_list(KB_BINDING_SET_P, wanted_bindings, UNPROVIDED))) {
            Errors.error($str428$Some_item_in__A_was_not_a_KB_BIND, wanted_bindings);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.every_in_list(KB_BINDING_SET_P, unwanted_bindings, UNPROVIDED))) {
            Errors.error($str428$Some_item_in__A_was_not_a_KB_BIND, unwanted_bindings);
        }
        assert NIL != listp(metric_constants) : "Types.listp(metric_constants) " + "CommonSymbols.NIL != Types.listp(metric_constants) " + metric_constants;
        assert NIL != listp(responsible_cyclists) : "Types.listp(responsible_cyclists) " + "CommonSymbols.NIL != Types.listp(responsible_cyclists) " + responsible_cyclists;
        assert NIL != hlmt.possibly_mt_p(defining_mt) : "hlmt.possibly_mt_p(defining_mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(defining_mt) " + defining_mt;
        if (NIL != multiple_choice_option_specs) {
            ke.ke_assert_now(listS($$isa, test_spec, $list423), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        } else {
            ke.ke_assert_now(listS($$isa, test_spec, $list424), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        }
        ke.ke_assert_now(list($$testQuerySpecification, test_spec, query_spec), defining_mt, UNPROVIDED, UNPROVIDED);
        kct_ensure_answer_cardinality(test_spec, answer_cardinality, defining_mt);
        kct_ensure_answer_min_cardinality(test_spec, answer_min_cardinality, defining_mt);
        kct_ensure_answer_max_cardinality(test_spec, answer_max_cardinality, defining_mt);
        if ((NIL != exact_bindings) || (NIL != no_answers)) {
            kct_ensure_exact_bindings(test_spec, exact_bindings, defining_mt, multiple_choice_option_specs);
        } else
            if ((NIL != wanted_bindings) || (NIL != unwanted_bindings)) {
                kct_ensure_wanted_unwanted_bindings(test_spec, wanted_bindings, unwanted_bindings, defining_mt);
            } else
                if (NIL != unimportant_bindings) {
                    kct_ensure_unimportant_bindings(test_spec, defining_mt);
                }


        kct_ensure_test_categories(test_spec, test_categories, defining_mt);
        kct_ensure_test_metrics(test_spec, metric_constants, defining_mt);
        kct_ensure_responsible_cyclists(test_spec, responsible_cyclists, defining_mt);
        return test_spec;
    }

    public static SubLObject kct_ensure_answer_cardinality(final SubLObject test_spec, final SubLObject answer_cardinality, final SubLObject defining_mt) {
        final SubLObject current = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswers_Cardinality_Exact).first();
        final SubLObject current_val = (NIL != current) ? assertions_high.gaf_arg2(current) : NIL;
        if (!current_val.eql(answer_cardinality)) {
            if (NIL != assertion_handles.assertion_p(current)) {
                ke.ke_unassert_assertion_now(current);
            }
            if (NIL != answer_cardinality) {
                return kct_assert_answer_cardinality(test_spec, answer_cardinality, defining_mt);
            }
        }
        return NIL;
    }

    public static SubLObject kct_ensure_answer_min_cardinality(final SubLObject test_spec, final SubLObject answer_min_cardinality, final SubLObject defining_mt) {
        final SubLObject current = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswers_Cardinality_Min).first();
        final SubLObject current_val = (NIL != current) ? assertions_high.gaf_arg2(current) : NIL;
        if (!current_val.eql(answer_min_cardinality)) {
            if (NIL != assertion_handles.assertion_p(current)) {
                ke.ke_unassert_assertion_now(current);
            }
            if (NIL != answer_min_cardinality) {
                return kct_assert_answer_min_cardinality(test_spec, answer_min_cardinality, defining_mt);
            }
        }
        return NIL;
    }

    public static SubLObject kct_ensure_answer_max_cardinality(final SubLObject test_spec, final SubLObject answer_max_cardinality, final SubLObject defining_mt) {
        final SubLObject current = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswers_Cardinality_Max).first();
        final SubLObject current_val = (NIL != current) ? assertions_high.gaf_arg2(current) : NIL;
        if (!current_val.eql(answer_max_cardinality)) {
            if (NIL != assertion_handles.assertion_p(current)) {
                ke.ke_unassert_assertion_now(current);
            }
            if (NIL != answer_max_cardinality) {
                return kct_assert_answer_max_cardinality(test_spec, answer_max_cardinality, defining_mt);
            }
        }
        return NIL;
    }

    public static SubLObject kct_assert_answer_cardinality(final SubLObject test_spec, final SubLObject answer_cardinality, final SubLObject defining_mt) {
        return kct_assert_test_spec_pred_arg2_possibly_starting_now(test_spec, $$testAnswers_Cardinality_Exact, answer_cardinality, defining_mt);
    }

    public static SubLObject kct_assert_answer_min_cardinality(final SubLObject test_spec, final SubLObject answer_min_cardinality, final SubLObject defining_mt) {
        return kct_assert_test_spec_pred_arg2_possibly_starting_now(test_spec, $$testAnswers_Cardinality_Min, answer_min_cardinality, defining_mt);
    }

    public static SubLObject kct_assert_answer_max_cardinality(final SubLObject test_spec, final SubLObject answer_max_cardinality, final SubLObject defining_mt) {
        return kct_assert_test_spec_pred_arg2_possibly_starting_now(test_spec, $$testAnswers_Cardinality_Max, answer_max_cardinality, defining_mt);
    }

    public static SubLObject kct_ensure_exact_bindings(final SubLObject test_spec, final SubLObject exact_bindings, final SubLObject defining_mt, final SubLObject multiple_choice_option_specs) {
        final SubLObject current_exact_assertions = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswersCycL_Exact);
        final SubLObject current_wanted_assertions = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswersCycL_Wanted);
        final SubLObject current_unwanted_assertions = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswersCycL_NotWanted);
        final SubLObject current_unimportant_assertions = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswersCycLUnimportant);
        final SubLObject kb_set_of_binding_sets = bindings.make_kb_set_of_binding_sets(exact_bindings);
        SubLObject result = T;
        SubLObject cdolist_list_var = current_wanted_assertions;
        SubLObject wanted_assertion = NIL;
        wanted_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke.ke_unassert_assertion_now(wanted_assertion);
            cdolist_list_var = cdolist_list_var.rest();
            wanted_assertion = cdolist_list_var.first();
        } 
        cdolist_list_var = current_unwanted_assertions;
        SubLObject unwanted_assertion = NIL;
        unwanted_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke.ke_unassert_assertion_now(unwanted_assertion);
            cdolist_list_var = cdolist_list_var.rest();
            unwanted_assertion = cdolist_list_var.first();
        } 
        cdolist_list_var = current_exact_assertions;
        SubLObject exact_assertion = NIL;
        exact_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current_exact_bindings = assertions_high.gaf_arg2(exact_assertion);
            final SubLObject current_exact_mt = assertions_high.assertion_mt(exact_assertion);
            if ((!current_exact_mt.eql(defining_mt)) || (!current_exact_bindings.equal(kb_set_of_binding_sets))) {
                ke.ke_unassert_assertion_now(exact_assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            exact_assertion = cdolist_list_var.first();
        } 
        cdolist_list_var = current_unimportant_assertions;
        SubLObject unimportant_assertion = NIL;
        unimportant_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke.ke_unassert_assertion_now(unimportant_assertion);
            cdolist_list_var = cdolist_list_var.rest();
            unimportant_assertion = cdolist_list_var.first();
        } 
        if (NIL == kb_mapping_utilities.tuple_holds_in_mt(list($$testAnswersCycL_Exact, test_spec, kb_set_of_binding_sets), defining_mt, UNPROVIDED, UNPROVIDED)) {
            result = kct_assert_exact_bindings(test_spec, exact_bindings, defining_mt, multiple_choice_option_specs);
        }
        return result;
    }

    public static SubLObject kct_ensure_wanted_unwanted_bindings(final SubLObject test_spec, final SubLObject wanted_bindings, final SubLObject unwanted_bindings, final SubLObject defining_mt) {
        final SubLObject current_exact_assertions = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswersCycL_Exact);
        final SubLObject current_unimportant_assertions = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswersCycLUnimportant);
        SubLObject cdolist_list_var = current_exact_assertions;
        SubLObject exact_assertion = NIL;
        exact_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke.ke_unassert_assertion_now(exact_assertion);
            cdolist_list_var = cdolist_list_var.rest();
            exact_assertion = cdolist_list_var.first();
        } 
        cdolist_list_var = current_unimportant_assertions;
        SubLObject unimportant_assertion = NIL;
        unimportant_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke.ke_unassert_assertion_now(unimportant_assertion);
            cdolist_list_var = cdolist_list_var.rest();
            unimportant_assertion = cdolist_list_var.first();
        } 
        kct_ensure_test_spec_exact_arg2s_for_pred(test_spec, $$testAnswersCycL_Wanted, wanted_bindings, defining_mt);
        kct_ensure_test_spec_exact_arg2s_for_pred(test_spec, $$testAnswersCycL_NotWanted, unwanted_bindings, defining_mt);
        return test_spec;
    }

    public static SubLObject kct_ensure_unimportant_bindings(final SubLObject test_spec, final SubLObject defining_mt) {
        final SubLObject current_exact_assertions = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswersCycL_Exact);
        final SubLObject current_wanted_assertions = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswersCycL_Wanted);
        final SubLObject current_unwanted_assertions = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$testAnswersCycL_NotWanted);
        SubLObject cdolist_list_var;
        final SubLObject assertions_to_delete = cdolist_list_var = append(current_exact_assertions, current_wanted_assertions, current_unwanted_assertions);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke.ke_unassert_assertion_now(assertion);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        if (NIL == kb_mapping_utilities.tuple_holds_in_mt(list($$testAnswersCycLUnimportant, test_spec), defining_mt, UNPROVIDED, UNPROVIDED)) {
            kct_assert_unimportant_bindings(test_spec, defining_mt);
        }
        return test_spec;
    }

    public static SubLObject kct_assert_exact_bindings(final SubLObject test_spec, final SubLObject exact_bindings, final SubLObject defining_mt, final SubLObject multiple_choice_option_specs) {
        final SubLObject kb_bindings = bindings.make_kb_set_of_binding_sets(exact_bindings);
        if (NIL != multiple_choice_option_specs) {
            final SubLObject pos = position(kb_bindings, multiple_choice_option_specs, symbol_function(EQUAL), symbol_function(FOURTH), UNPROVIDED, UNPROVIDED);
            if (NIL != pos) {
                final SubLObject option_num = nth(pos, multiple_choice_option_specs).first();
                final SubLObject query_spec = kct_utils.kct_query_specification(test_spec, UNPROVIDED);
                final SubLObject option = list($$MCQuestionNthOptionFn, query_spec, option_num);
                kct_assert_test_spec_pred_arg2_possibly_starting_now(test_spec, $$testAnswer_MultipleChoice, option, defining_mt);
            }
        }
        return kct_assert_test_spec_pred_arg2_possibly_starting_now(test_spec, $$testAnswersCycL_Exact, kb_bindings, defining_mt);
    }

    public static SubLObject kct_assert_wanted_binding(final SubLObject test_spec, final SubLObject wanted_binding, final SubLObject defining_mt) {
        assert NIL != bindings.kb_binding_set_p(wanted_binding) : "bindings.kb_binding_set_p(wanted_binding) " + "CommonSymbols.NIL != bindings.kb_binding_set_p(wanted_binding) " + wanted_binding;
        return kct_assert_test_spec_pred_arg2_possibly_starting_now(test_spec, $$testAnswersCycL_Wanted, wanted_binding, defining_mt);
    }

    public static SubLObject kct_assert_unwanted_binding(final SubLObject test_spec, final SubLObject unwanted_binding, final SubLObject defining_mt) {
        assert NIL != bindings.kb_binding_set_p(unwanted_binding) : "bindings.kb_binding_set_p(unwanted_binding) " + "CommonSymbols.NIL != bindings.kb_binding_set_p(unwanted_binding) " + unwanted_binding;
        return kct_assert_test_spec_pred_arg2_possibly_starting_now(test_spec, $$testAnswersCycL_NotWanted, unwanted_binding, defining_mt);
    }

    public static SubLObject kct_assert_unimportant_bindings(final SubLObject test_spec, final SubLObject defining_mt) {
        return ke.ke_assert_now(list($$testAnswersCycLUnimportant, test_spec), defining_mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject kct_ensure_test_categories(final SubLObject test_spec, final SubLObject test_categories, final SubLObject defining_mt) {
        SubLObject cdolist_list_var;
        final SubLObject current = cdolist_list_var = kct_current_test_spec_arg1_assertions_for_pred(test_spec, $$isa);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current_category = assertions_high.gaf_arg2(assertion);
            final SubLObject current_mt = assertions_high.assertion_mt(assertion);
            if ((NIL == kb_utilities.kbeq(current_category, $$KBContentTest_FullySpecified)) && (((NIL == kb_utilities.kbeq(current_mt, mt_vars.$anect_mt$.getGlobalValue())) && (NIL == kb_utilities.kbeq(current_mt, defining_mt))) || (NIL == member(current_category, test_categories, UNPROVIDED, UNPROVIDED)))) {
                ke.ke_unassert_assertion_now(assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        cdolist_list_var = test_categories;
        SubLObject category = NIL;
        category = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == kb_mapping_utilities.tuple_holds_in_relevant_mts(list($$isa, test_spec, category), defining_mt, UNPROVIDED, UNPROVIDED)) {
                kct_assert_test_category(test_spec, category, defining_mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            category = cdolist_list_var.first();
        } 
        return test_spec;
    }

    public static SubLObject kct_assert_test_category(final SubLObject test_spec, final SubLObject test_category, final SubLObject defining_mt) {
        return kct_assert_test_spec_pred_arg2_possibly_starting_now(test_spec, $$isa, test_category, defining_mt);
    }

    public static SubLObject kct_ensure_test_metrics(final SubLObject test_spec, final SubLObject metric_constants, final SubLObject defining_mt) {
        return kct_ensure_test_spec_exact_arg2s_for_pred(test_spec, $$testMetricsToGather, metric_constants, defining_mt);
    }

    public static SubLObject kct_assert_test_metric(final SubLObject test_spec, final SubLObject metric_constant, final SubLObject defining_mt) {
        return kct_assert_test_spec_pred_arg2_possibly_starting_now(test_spec, $$testMetricsToGather, metric_constant, defining_mt);
    }

    public static SubLObject kct_ensure_responsible_cyclists(final SubLObject test_spec, final SubLObject cyclists, final SubLObject defining_mt) {
        return kct_ensure_test_spec_exact_arg2s_for_pred(test_spec, $$testResponsibleCyclist, cyclists, defining_mt);
    }

    public static SubLObject kct_assert_responsible_cyclist(final SubLObject test_spec, final SubLObject cyclist, final SubLObject defining_mt) {
        return kct_assert_test_spec_pred_arg2_possibly_starting_now(test_spec, $$testResponsibleCyclist, cyclist, defining_mt);
    }

    public static SubLObject kct_current_test_spec_arg1_assertions_for_pred(final SubLObject test_spec, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(test_spec, ONE_INTEGER, predicate)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(test_spec, ONE_INTEGER, predicate);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$128 = NIL;
                            final SubLObject token_var_$129 = NIL;
                            while (NIL == done_var_$128) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$129);
                                final SubLObject valid_$130 = makeBoolean(!token_var_$129.eql(assertion));
                                if (NIL != valid_$130) {
                                    result = cons(assertion, result);
                                }
                                done_var_$128 = makeBoolean(NIL == valid_$130);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$131 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject kct_temporal_object_starting_point(final SubLObject temporal_object) {
        SubLObject start = (NIL != time_interval_utilities.date_interval_p(temporal_object)) ? time_interval_utilities.cycl_interval_initial_second(temporal_object) : hlmt_relevance.starting_date(temporal_object, UNPROVIDED);
        if (NIL == start) {
            start = make_unary_formula($$StartFn, temporal_object);
        }
        return start;
    }

    public static SubLObject kct_interval_ending_now_started_by_temporal_object(final SubLObject temporal_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(kct_variables.kct_mt());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != hlmt.temporal_objectP(temporal_object)) {
                result = make_binary_formula($$TimeIntervalInclusiveFn, kct_temporal_object_starting_point(temporal_object), $list447);
            } else {
                result = make_unary_formula($$IntervalEndedByFn_Inclusive, $list447);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject kct_temporally_qualifiable_predicateP(final SubLObject predicate) {
        return list_utilities.sublisp_boolean(ask_utilities.query_variable($IGNORE, listS($const450$temporallyQualifiablePredicateInI, predicate, $list451), kct_variables.kct_mt(), UNPROVIDED));
    }

    public static SubLObject kct_cycl_time_from_creation_time(final SubLObject fort) {
        final SubLObject creation_time = bookkeeping_store.creation_time(fort, UNPROVIDED);
        if (creation_time.isInteger()) {
            return date_utilities.universal_date_to_cycl_date(creation_time);
        }
        return NIL;
    }

    public static SubLObject kct_ensure_test_spec_exact_arg2s_for_pred(final SubLObject test_spec, final SubLObject predicate, final SubLObject arg2s, final SubLObject defining_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject temporally_qualifiableP = kct_temporally_qualifiable_predicateP(predicate);
        final SubLObject current_arg2_assertions = kct_current_test_spec_arg1_assertions_for_pred(test_spec, predicate);
        final SubLObject mt_for_now = (NIL != temporally_qualifiableP) ? kct_variables.kct_mt_for_now(defining_mt) : defining_mt;
        SubLObject cdolist_list_var = current_arg2_assertions;
        SubLObject arg2_assertion = NIL;
        arg2_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current_arg2_term = assertions_high.gaf_arg2(arg2_assertion);
            final SubLObject current_mt = assertions_high.assertion_mt(arg2_assertion);
            final SubLObject current_monad_mt = hlmt.hlmt_monad_mt(current_mt);
            if (((NIL == kb_utilities.kbeq(current_monad_mt, defining_mt)) || (NIL == member(current_arg2_term, arg2s, UNPROVIDED, UNPROVIDED))) && ((NIL == temporally_qualifiableP) || (NIL != ask_utilities.query_variable($IGNORE, list(predicate, test_spec, current_arg2_term), mt_for_now, UNPROVIDED)))) {
                ke.ke_unassert_assertion_now(arg2_assertion);
                if (NIL != temporally_qualifiableP) {
                    final SubLObject time_dim = hlmt.hlmt_temporal_mt(current_mt);
                    SubLObject temporal_object = NIL;
                    SubLObject time_param = NIL;
                    thread.resetMultipleValues();
                    final SubLObject temporal_object_$132 = hlmt.mt_time_dim_nat_temporal_values(time_dim);
                    final SubLObject time_param_$133 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    temporal_object = temporal_object_$132;
                    time_param = time_param_$133;
                    if (NIL != kb_utilities.kbeq(time_param, $$Null_TimeParameter)) {
                        time_param = $$TimePoint;
                    }
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(kct_variables.kct_mt());
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject reference_object = (NIL != hlmt.temporal_objectP(temporal_object)) ? temporal_object : kct_cycl_time_from_creation_time(test_spec);
                        final SubLObject interval = kct_interval_ending_now_started_by_temporal_object(reference_object);
                        final SubLObject restricted_mt = kct_utils.kct_new_hlmt(current_monad_mt, interval, time_param);
                        kct_assert_test_spec_pred_arg2_basic(test_spec, predicate, current_arg2_term, restricted_mt);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg2_assertion = cdolist_list_var.first();
        } 
        cdolist_list_var = arg2s;
        SubLObject arg2_term = NIL;
        arg2_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == ask_utilities.query_variable($IGNORE, list(predicate, test_spec, arg2_term), mt_for_now, UNPROVIDED)) {
                kct_assert_test_spec_pred_arg2_possibly_starting_now(test_spec, predicate, arg2_term, defining_mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg2_term = cdolist_list_var.first();
        } 
        return test_spec;
    }

    public static SubLObject kct_assert_test_spec_pred_arg2_possibly_starting_now(final SubLObject test_spec, final SubLObject predicate, final SubLObject arg2_term, SubLObject defining_mt) {
        if (NIL != kct_temporally_qualifiable_predicateP(predicate)) {
            defining_mt = hlmt.new_hlmt(list(defining_mt, hlmt.new_time_dimension($list454, $$TimePoint)));
        }
        return kct_assert_test_spec_pred_arg2_basic(test_spec, predicate, arg2_term, defining_mt);
    }

    public static SubLObject kct_assert_test_spec_pred_arg2_basic(final SubLObject test_spec, final SubLObject predicate, final SubLObject arg2_term, final SubLObject mt) {
        return ke.ke_assert_now(list(predicate, test_spec, arg2_term), mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_link_kct_control_panel(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str459$_KCT_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str460$cb_kct_control_panel);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_kct_control_panel(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$KB_Content_Test_Control_Panel;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str21$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$134 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$135 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str125$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str462$cb_kct_control_panel_handler, T, UNPROVIDED);
                            final SubLObject tests = sorted_kcts_owned_by(operation_communication.the_cyclist());
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($$$KB_Content_Tests_owned_by_);
                            cb_form(operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED);
                            html_princ($str464$_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            if (NIL != tests) {
                                kctcp_refresh_submit_helper();
                                cb_kct_control_panel_table(tests);
                                kctcp_refresh_submit_helper();
                            } else {
                                html_princ_strong($str465$No_tests_);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$135, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$134, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sorted_kcts_owned_by(final SubLObject cyclist) {
        return kb_utilities.sort_terms(kct_cyc_testing.kcts_owned_by(cyclist), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject kctcp_refresh_submit_helper() {
        cb_link($KCT_CONTROL_PANEL, $str467$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_submit_input($$$Submit, $$$save, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_kct_control_panel_table(final SubLObject tests) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(TWO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(THREE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_kct_control_panel_table_header();
            SubLObject cdolist_list_var = tests;
            SubLObject test = NIL;
            test = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject is_regression_testP = isa.isaP(test, $$KBContentRegressionTest, kct_variables.kct_mt(), UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$140 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_link($KCT_EDIT, test, $str470$_Edit_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$140, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_link($KCT_TEST, test, $str471$_Run_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$141, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_form(test, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$142, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject disabledP = makeBoolean((NIL != is_regression_testP) && (NIL == kct_asserted_regression_mts(test)));
                        html_checkbox_input(cb_fort_identifier(test), is_regression_testP, is_regression_testP, NIL, NIL, disabledP);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$143, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$139, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                test = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_kct_control_panel_table_header() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ_strong($$$Edit);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$144, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ_strong($$$Run);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$145, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ_strong($$$Name);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$146, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$147 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ_strong($str475$Regression_Test_);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$147, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_kct_control_panel_handler(SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        args = args.rest();
        final SubLObject all_kct_lst = sorted_kcts_owned_by(operation_communication.the_cyclist());
        SubLObject save_settingsP = NIL;
        SubLObject are_regression_kcts = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject field = arg.first();
            if (field.equal($$$save)) {
                save_settingsP = T;
            } else {
                final SubLObject kct = cb_guess_fort(field, UNPROVIDED);
                if (NIL != kct) {
                    are_regression_kcts = cons(kct, are_regression_kcts);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        if (NIL != save_settingsP) {
            final SubLObject non_regression_kcts = list_utilities.fast_set_difference(all_kct_lst, are_regression_kcts, UNPROVIDED);
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$Save_Interface);
            } else {
                SubLObject cdolist_list_var2 = are_regression_kcts;
                SubLObject kct2 = NIL;
                kct2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    update_regression_test_status(kct2, T);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    kct2 = cdolist_list_var2.first();
                } 
                cdolist_list_var2 = non_regression_kcts;
                kct2 = NIL;
                kct2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    update_regression_test_status(kct2, NIL);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    kct2 = cdolist_list_var2.first();
                } 
            }
            html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str21$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ($str477$Tests__Regression_Status_Modified);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$148 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != color_value) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(color_value));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_big_head$.getGlobalValue());
                        html_princ_strong($str477$Tests__Regression_Status_Modified);
                        html_markup(html_macros.$html_big_tail$.getGlobalValue());
                        cb_frame_update_message_page_info($$$KB_Content_Test_Control_Panel);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$148, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject update_regression_test_status(final SubLObject kct, final SubLObject rt_desiredP) {
        final SubLObject mts = kct_asserted_regression_mts(kct);
        if (NIL != rt_desiredP) {
            if (NIL == mts) {
                ke.ke_assert(listS($$isa, kct, $list479), kct_variables.kct_mt(), UNPROVIDED, UNPROVIDED);
            }
        } else {
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke.ke_unassert_now(listS($$isa, kct, $list479), mt);
                if (NIL == kct_utils.kct_test_spec_p(kct, UNPROVIDED)) {
                    ke.ke_assert(listS($$isa, kct, $list424), kct_variables.kct_mt(), UNPROVIDED, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject kct_asserted_regression_mts(final SubLObject kct) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = czer_meta.find_visible_assertions_cycl(listS($$isa, kct, $list479), UNPROVIDED);
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != assertions_high.asserted_assertionP(ass)) {
                    mts = cons(assertions_high.assertion_mt(ass), mts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return nreverse(mts);
    }

    public static SubLObject declare_cb_kct_test_file() {
        declareFunction(me, "cb_link_kct_test", "CB-LINK-KCT-TEST", 1, 1, false);
        declareFunction(me, "cb_kct_test_run", "CB-KCT-TEST-RUN", 1, 0, false);
        declareFunction(me, "cb_link_kct_test_set", "CB-LINK-KCT-TEST-SET", 1, 1, false);
        declareFunction(me, "cb_kct_test_set_run", "CB-KCT-TEST-SET-RUN", 1, 0, false);
        declareFunction(me, "cb_link_kct", "CB-LINK-KCT", 0, 1, false);
        declareFunction(me, "cb_kct_main", "CB-KCT-MAIN", 0, 1, false);
        declareFunction(me, "cb_kct_status_table_header", "CB-KCT-STATUS-TABLE-HEADER", 0, 0, false);
        declareFunction(me, "cb_kct_enter_test_section", "CB-KCT-ENTER-TEST-SECTION", 0, 2, false);
        declareFunction(me, "cb_kct_start_test", "CB-KCT-START-TEST", 1, 0, false);
        declareFunction(me, "cb_kct_start_test_collection", "CB-KCT-START-TEST-COLLECTION", 1, 0, false);
        declareFunction(me, "cb_kct_thinking_status_row_color", "CB-KCT-THINKING-STATUS-ROW-COLOR", 1, 0, false);
        declareFunction(me, "cb_kct_show_status", "CB-KCT-SHOW-STATUS", 1, 0, false);
        declareFunction(me, "cb_link_kct_toggle_refresh", "CB-LINK-KCT-TOGGLE-REFRESH", 1, 0, false);
        declareFunction(me, "cb_kct_toggle_refresh", "CB-KCT-TOGGLE-REFRESH", 0, 1, false);
        declareFunction(me, "cb_link_kct_forget", "CB-LINK-KCT-FORGET", 1, 1, false);
        declareFunction(me, "cb_kct_thinking_forget", "CB-KCT-THINKING-FORGET", 0, 1, false);
        declareFunction(me, "cb_link_kct_abort", "CB-LINK-KCT-ABORT", 1, 1, false);
        declareFunction(me, "cb_kct_thinking_abort", "CB-KCT-THINKING-ABORT", 0, 1, false);
        declareFunction(me, "cb_link_kct_results", "CB-LINK-KCT-RESULTS", 1, 1, false);
        declareFunction(me, "cb_kct_thinking_results", "CB-KCT-THINKING-RESULTS", 0, 1, false);
        declareFunction(me, "cb_link_kct_members", "CB-LINK-KCT-MEMBERS", 1, 1, false);
        declareFunction(me, "cb_kct_thinking_members", "CB-KCT-THINKING-MEMBERS", 0, 1, false);
        declareFunction(me, "cb_kct_collection_results", "CB-KCT-COLLECTION-RESULTS", 2, 0, false);
        declareFunction(me, "cb_kct_individual_runstate_results", "CB-KCT-INDIVIDUAL-RUNSTATE-RESULTS", 2, 0, false);
        declareFunction(me, "kct_register_test_spec_of_inference", "KCT-REGISTER-TEST-SPEC-OF-INFERENCE", 2, 0, false);
        declareFunction(me, "kct_deregister_test_spec_of_inference", "KCT-DEREGISTER-TEST-SPEC-OF-INFERENCE", 1, 0, false);
        declareFunction(me, "kct_lookup_test_spec_by_inference", "KCT-LOOKUP-TEST-SPEC-BY-INFERENCE", 1, 0, false);
        declareFunction(me, "kct_test_state_print_function_trampoline", "KCT-TEST-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "kct_test_state_p", "KCT-TEST-STATE-P", 1, 0, false);
        new cb_kct_test.$kct_test_state_p$UnaryFunction();
        declareFunction(me, "kct_test_state_test_spec", "KCT-TEST-STATE-TEST-SPEC", 1, 0, false);
        declareFunction(me, "kct_test_state_name", "KCT-TEST-STATE-NAME", 1, 0, false);
        declareFunction(me, "kct_test_state_comments", "KCT-TEST-STATE-COMMENTS", 1, 0, false);
        declareFunction(me, "kct_test_state_query_state", "KCT-TEST-STATE-QUERY-STATE", 1, 0, false);
        declareFunction(me, "kct_test_state_save_mt", "KCT-TEST-STATE-SAVE-MT", 1, 0, false);
        declareFunction(me, "kct_test_state_answer_status", "KCT-TEST-STATE-ANSWER-STATUS", 1, 0, false);
        declareFunction(me, "kct_test_state_answer_options_index", "KCT-TEST-STATE-ANSWER-OPTIONS-INDEX", 1, 0, false);
        declareFunction(me, "kct_test_state_answer_options_bindings_index", "KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX", 1, 0, false);
        declareFunction(me, "kct_test_state_categories", "KCT-TEST-STATE-CATEGORIES", 1, 0, false);
        declareFunction(me, "kct_test_state_metrics", "KCT-TEST-STATE-METRICS", 1, 0, false);
        declareFunction(me, "kct_test_state_cyclists", "KCT-TEST-STATE-CYCLISTS", 1, 0, false);
        declareFunction(me, "kct_test_state_notes", "KCT-TEST-STATE-NOTES", 1, 0, false);
        declareFunction(me, "kct_test_state_answer_cardinality", "KCT-TEST-STATE-ANSWER-CARDINALITY", 1, 0, false);
        declareFunction(me, "_csetf_kct_test_state_test_spec", "_CSETF-KCT-TEST-STATE-TEST-SPEC", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_name", "_CSETF-KCT-TEST-STATE-NAME", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_comments", "_CSETF-KCT-TEST-STATE-COMMENTS", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_query_state", "_CSETF-KCT-TEST-STATE-QUERY-STATE", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_save_mt", "_CSETF-KCT-TEST-STATE-SAVE-MT", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_answer_status", "_CSETF-KCT-TEST-STATE-ANSWER-STATUS", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_answer_options_index", "_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_answer_options_bindings_index", "_CSETF-KCT-TEST-STATE-ANSWER-OPTIONS-BINDINGS-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_categories", "_CSETF-KCT-TEST-STATE-CATEGORIES", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_metrics", "_CSETF-KCT-TEST-STATE-METRICS", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_cyclists", "_CSETF-KCT-TEST-STATE-CYCLISTS", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_notes", "_CSETF-KCT-TEST-STATE-NOTES", 2, 0, false);
        declareFunction(me, "_csetf_kct_test_state_answer_cardinality", "_CSETF-KCT-TEST-STATE-ANSWER-CARDINALITY", 2, 0, false);
        declareFunction(me, "make_kct_test_state", "MAKE-KCT-TEST-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_kct_test_state", "VISIT-DEFSTRUCT-KCT-TEST-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_kct_test_state_method", "VISIT-DEFSTRUCT-OBJECT-KCT-TEST-STATE-METHOD", 2, 0, false);
        declareFunction(me, "kct_test_state_add_note", "KCT-TEST-STATE-ADD-NOTE", 2, 0, false);
        declareFunction(me, "kct_test_state_set_cardinality", "KCT-TEST-STATE-SET-CARDINALITY", 3, 0, false);
        declareFunction(me, "cb_kct_new_test_state_from_test_spec", "CB-KCT-NEW-TEST-STATE-FROM-TEST-SPEC", 1, 0, false);
        declareFunction(me, "cb_kct_new_test_state_from_inference", "CB-KCT-NEW-TEST-STATE-FROM-INFERENCE", 1, 0, false);
        declareFunction(me, "kct_test_state_exact_bindings", "KCT-TEST-STATE-EXACT-BINDINGS", 1, 0, false);
        declareFunction(me, "kct_test_state_wanted_bindings", "KCT-TEST-STATE-WANTED-BINDINGS", 1, 0, false);
        declareFunction(me, "kct_test_state_unwanted_bindings", "KCT-TEST-STATE-UNWANTED-BINDINGS", 1, 0, false);
        declareFunction(me, "kct_test_state_unspecified_bindings", "KCT-TEST-STATE-UNSPECIFIED-BINDINGS", 1, 0, false);
        declareFunction(me, "kct_test_state_bindings_unimportantP", "KCT-TEST-STATE-BINDINGS-UNIMPORTANT?", 1, 0, false);
        declareFunction(me, "kct_test_state_no_answersP", "KCT-TEST-STATE-NO-ANSWERS?", 1, 0, false);
        declareFunction(me, "kct_test_state_bindings_of_type", "KCT-TEST-STATE-BINDINGS-OF-TYPE", 3, 0, false);
        declareFunction(me, "cb_clear_kct_test_being_saved", "CB-CLEAR-KCT-TEST-BEING-SAVED", 0, 0, false);
        declareFunction(me, "cb_kct_test_being_saved", "CB-KCT-TEST-BEING-SAVED", 0, 0, false);
        declareFunction(me, "cb_set_kct_test_being_saved", "CB-SET-KCT-TEST-BEING-SAVED", 1, 0, false);
        declareFunction(me, "kct_answer_print_function_trampoline", "KCT-ANSWER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "kct_answer_p", "KCT-ANSWER-P", 1, 0, false);
        new cb_kct_test.$kct_answer_p$UnaryFunction();
        declareFunction(me, "kct_answer_binding_set", "KCT-ANSWER-BINDING-SET", 1, 0, false);
        declareFunction(me, "kct_answer_status", "KCT-ANSWER-STATUS", 1, 0, false);
        declareFunction(me, "kct_answer_id", "KCT-ANSWER-ID", 1, 0, false);
        declareFunction(me, "_csetf_kct_answer_binding_set", "_CSETF-KCT-ANSWER-BINDING-SET", 2, 0, false);
        declareFunction(me, "_csetf_kct_answer_status", "_CSETF-KCT-ANSWER-STATUS", 2, 0, false);
        declareFunction(me, "_csetf_kct_answer_id", "_CSETF-KCT-ANSWER-ID", 2, 0, false);
        declareFunction(me, "make_kct_answer", "MAKE-KCT-ANSWER", 0, 1, false);
        declareFunction(me, "visit_defstruct_kct_answer", "VISIT-DEFSTRUCT-KCT-ANSWER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_kct_answer_method", "VISIT-DEFSTRUCT-OBJECT-KCT-ANSWER-METHOD", 2, 0, false);
        declareFunction(me, "new_kct_answer", "NEW-KCT-ANSWER", 2, 1, false);
        declareFunction(me, "kct_answer_id_count", "KCT-ANSWER-ID-COUNT", 1, 0, false);
        declareFunction(me, "kct_answer_id_lookup", "KCT-ANSWER-ID-LOOKUP", 2, 0, false);
        declareFunction(me, "kct_answer_bindings_lookup", "KCT-ANSWER-BINDINGS-LOOKUP", 2, 0, false);
        declareFunction(me, "kct_answer_id_remove", "KCT-ANSWER-ID-REMOVE", 2, 0, false);
        declareFunction(me, "set_kct_answer_status", "SET-KCT-ANSWER-STATUS", 2, 0, false);
        declareFunction(me, "cb_link_kct_edit", "CB-LINK-KCT-EDIT", 1, 1, false);
        declareFunction(me, "cb_edit_test", "CB-EDIT-TEST", 1, 0, false);
        declareFunction(me, "cb_link_kct_save", "CB-LINK-KCT-SAVE", 1, 1, false);
        declareFunction(me, "cb_save_as_test", "CB-SAVE-AS-TEST", 1, 0, false);
        declareFunction(me, "cb_confirm_save_as_test", "CB-CONFIRM-SAVE-AS-TEST", 0, 1, false);
        declareFunction(me, "cb_show_save_as_test_header", "CB-SHOW-SAVE-AS-TEST-HEADER", 1, 0, false);
        declareFunction(me, "cb_save_as_test_submit_section", "CB-SAVE-AS-TEST-SUBMIT-SECTION", 0, 1, false);
        declareFunction(me, "cb_kct_test_categories_section", "CB-KCT-TEST-CATEGORIES-SECTION", 0, 1, false);
        declareFunction(me, "cb_kct_test_metrics_section", "CB-KCT-TEST-METRICS-SECTION", 0, 1, false);
        declareFunction(me, "cb_kct_responsible_cyclists_section", "CB-KCT-RESPONSIBLE-CYCLISTS-SECTION", 0, 1, false);
        declareFunction(me, "cb_handle_confirm_save_as_test", "CB-HANDLE-CONFIRM-SAVE-AS-TEST", 1, 0, false);
        declareFunction(me, "cb_kct_prune_test_state_answers_for_sentence", "CB-KCT-PRUNE-TEST-STATE-ANSWERS-FOR-SENTENCE", 1, 0, false);
        declareFunction(me, "cb_kct_extract_test_categories", "CB-KCT-EXTRACT-TEST-CATEGORIES", 1, 0, false);
        declareFunction(me, "cb_kct_extract_test_metrics", "CB-KCT-EXTRACT-TEST-METRICS", 1, 0, false);
        declareFunction(me, "cb_kct_extract_responsible_cyclists", "CB-KCT-EXTRACT-RESPONSIBLE-CYCLISTS", 1, 0, false);
        declareFunction(me, "cb_kct_toggle_rowcolor", "CB-KCT-TOGGLE-ROWCOLOR", 0, 0, false);
        declareFunction(me, "cb_kct_specify_test_results", "CB-KCT-SPECIFY-TEST-RESULTS", 1, 0, false);
        declareFunction(me, "cb_kct_specify_new_binding_section", "CB-KCT-SPECIFY-NEW-BINDING-SECTION", 3, 0, false);
        declareFunction(me, "cb_kct_show_answer_inputs", "CB-KCT-SHOW-ANSWER-INPUTS", 1, 0, false);
        declareFunction(me, "cb_kct_show_wanted_answers", "CB-KCT-SHOW-WANTED-ANSWERS", 2, 0, false);
        declareFunction(me, "cb_kct_show_unwanted_answers", "CB-KCT-SHOW-UNWANTED-ANSWERS", 2, 0, false);
        declareFunction(me, "cb_kct_show_unspecified_answers", "CB-KCT-SHOW-UNSPECIFIED-ANSWERS", 2, 0, false);
        declareFunction(me, "cb_kct_show_answers_of_type", "CB-KCT-SHOW-ANSWERS-OF-TYPE", 3, 0, false);
        declareFunction(me, "cb_handle_specify_test_results", "CB-HANDLE-SPECIFY-TEST-RESULTS", 1, 0, false);
        declareFunction(me, "cb_kct_extract_submit_mode", "CB-KCT-EXTRACT-SUBMIT-MODE", 1, 0, false);
        declareFunction(me, "cb_kct_update_answer_cardinality", "CB-KCT-UPDATE-ANSWER-CARDINALITY", 1, 0, false);
        declareFunction(me, "cb_kct_update_answer_options", "CB-KCT-UPDATE-ANSWER-OPTIONS", 1, 0, false);
        declareFunction(me, "cb_kct_extract_binding_value", "CB-KCT-EXTRACT-BINDING-VALUE", 2, 0, false);
        declareFunction(me, "cb_kct_extract_new_binding_status", "CB-KCT-EXTRACT-NEW-BINDING-STATUS", 1, 0, false);
        declareFunction(me, "cb_kct_extract_exactness", "CB-KCT-EXTRACT-EXACTNESS", 1, 0, false);
        declareFunction(me, "cb_kct_extract_test_spec", "CB-KCT-EXTRACT-TEST-SPEC", 1, 0, false);
        declareFunction(me, "cb_kct_extract_answers", "CB-KCT-EXTRACT-ANSWERS", 1, 0, false);
        declareFunction(me, "cb_kct_extract_exact_answers", "CB-KCT-EXTRACT-EXACT-ANSWERS", 1, 0, false);
        declareFunction(me, "cb_kct_extract_wanted_answers", "CB-KCT-EXTRACT-WANTED-ANSWERS", 1, 0, false);
        declareFunction(me, "cb_kct_extract_unwanted_answers", "CB-KCT-EXTRACT-UNWANTED-ANSWERS", 1, 0, false);
        declareFunction(me, "cb_kct_gather_answers_internal", "CB-KCT-GATHER-ANSWERS-INTERNAL", 2, 0, false);
        declareFunction(me, "cb_kct_save_new_test", "CB-KCT-SAVE-NEW-TEST", 1, 0, false);
        declareFunction(me, "cb_kct_overwrite_test", "CB-KCT-OVERWRITE-TEST", 1, 0, false);
        declareFunction(me, "kct_assert_test_spec_definition", "KCT-ASSERT-TEST-SPEC-DEFINITION", 15, 0, false);
        declareFunction(me, "multiple_choice_option_specs_non_trivialP", "MULTIPLE-CHOICE-OPTION-SPECS-NON-TRIVIAL?", 1, 0, false);
        declareFunction(me, "kct_ensure_test_spec_definition", "KCT-ENSURE-TEST-SPEC-DEFINITION", 15, 0, false);
        declareFunction(me, "kct_ensure_answer_cardinality", "KCT-ENSURE-ANSWER-CARDINALITY", 3, 0, false);
        declareFunction(me, "kct_ensure_answer_min_cardinality", "KCT-ENSURE-ANSWER-MIN-CARDINALITY", 3, 0, false);
        declareFunction(me, "kct_ensure_answer_max_cardinality", "KCT-ENSURE-ANSWER-MAX-CARDINALITY", 3, 0, false);
        declareFunction(me, "kct_assert_answer_cardinality", "KCT-ASSERT-ANSWER-CARDINALITY", 3, 0, false);
        declareFunction(me, "kct_assert_answer_min_cardinality", "KCT-ASSERT-ANSWER-MIN-CARDINALITY", 3, 0, false);
        declareFunction(me, "kct_assert_answer_max_cardinality", "KCT-ASSERT-ANSWER-MAX-CARDINALITY", 3, 0, false);
        declareFunction(me, "kct_ensure_exact_bindings", "KCT-ENSURE-EXACT-BINDINGS", 4, 0, false);
        declareFunction(me, "kct_ensure_wanted_unwanted_bindings", "KCT-ENSURE-WANTED-UNWANTED-BINDINGS", 4, 0, false);
        declareFunction(me, "kct_ensure_unimportant_bindings", "KCT-ENSURE-UNIMPORTANT-BINDINGS", 2, 0, false);
        declareFunction(me, "kct_assert_exact_bindings", "KCT-ASSERT-EXACT-BINDINGS", 4, 0, false);
        declareFunction(me, "kct_assert_wanted_binding", "KCT-ASSERT-WANTED-BINDING", 3, 0, false);
        declareFunction(me, "kct_assert_unwanted_binding", "KCT-ASSERT-UNWANTED-BINDING", 3, 0, false);
        declareFunction(me, "kct_assert_unimportant_bindings", "KCT-ASSERT-UNIMPORTANT-BINDINGS", 2, 0, false);
        declareFunction(me, "kct_ensure_test_categories", "KCT-ENSURE-TEST-CATEGORIES", 3, 0, false);
        declareFunction(me, "kct_assert_test_category", "KCT-ASSERT-TEST-CATEGORY", 3, 0, false);
        declareFunction(me, "kct_ensure_test_metrics", "KCT-ENSURE-TEST-METRICS", 3, 0, false);
        declareFunction(me, "kct_assert_test_metric", "KCT-ASSERT-TEST-METRIC", 3, 0, false);
        declareFunction(me, "kct_ensure_responsible_cyclists", "KCT-ENSURE-RESPONSIBLE-CYCLISTS", 3, 0, false);
        declareFunction(me, "kct_assert_responsible_cyclist", "KCT-ASSERT-RESPONSIBLE-CYCLIST", 3, 0, false);
        declareFunction(me, "kct_current_test_spec_arg1_assertions_for_pred", "KCT-CURRENT-TEST-SPEC-ARG1-ASSERTIONS-FOR-PRED", 2, 0, false);
        declareFunction(me, "kct_temporal_object_starting_point", "KCT-TEMPORAL-OBJECT-STARTING-POINT", 1, 0, false);
        declareFunction(me, "kct_interval_ending_now_started_by_temporal_object", "KCT-INTERVAL-ENDING-NOW-STARTED-BY-TEMPORAL-OBJECT", 1, 0, false);
        declareFunction(me, "kct_temporally_qualifiable_predicateP", "KCT-TEMPORALLY-QUALIFIABLE-PREDICATE?", 1, 0, false);
        declareFunction(me, "kct_cycl_time_from_creation_time", "KCT-CYCL-TIME-FROM-CREATION-TIME", 1, 0, false);
        declareFunction(me, "kct_ensure_test_spec_exact_arg2s_for_pred", "KCT-ENSURE-TEST-SPEC-EXACT-ARG2S-FOR-PRED", 4, 0, false);
        declareFunction(me, "kct_assert_test_spec_pred_arg2_possibly_starting_now", "KCT-ASSERT-TEST-SPEC-PRED-ARG2-POSSIBLY-STARTING-NOW", 4, 0, false);
        declareFunction(me, "kct_assert_test_spec_pred_arg2_basic", "KCT-ASSERT-TEST-SPEC-PRED-ARG2-BASIC", 4, 0, false);
        declareFunction(me, "cb_link_kct_control_panel", "CB-LINK-KCT-CONTROL-PANEL", 0, 1, false);
        declareFunction(me, "cb_kct_control_panel", "CB-KCT-CONTROL-PANEL", 0, 1, false);
        declareFunction(me, "sorted_kcts_owned_by", "SORTED-KCTS-OWNED-BY", 1, 0, false);
        declareFunction(me, "kctcp_refresh_submit_helper", "KCTCP-REFRESH-SUBMIT-HELPER", 0, 0, false);
        declareFunction(me, "cb_kct_control_panel_table", "CB-KCT-CONTROL-PANEL-TABLE", 1, 0, false);
        declareFunction(me, "cb_kct_control_panel_table_header", "CB-KCT-CONTROL-PANEL-TABLE-HEADER", 0, 0, false);
        declareFunction(me, "cb_kct_control_panel_handler", "CB-KCT-CONTROL-PANEL-HANDLER", 1, 0, false);
        declareFunction(me, "update_regression_test_status", "UPDATE-REGRESSION-TEST-STATUS", 2, 0, false);
        declareFunction(me, "kct_asserted_regression_mts", "KCT-ASSERTED-REGRESSION-MTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_kct_test_file() {
        defparameter("*CB-KCT-REFRESH?*", NIL);
        defparameter("*KCT-INFERENCE-TEST-SPEC-MAP*", make_hash_table($int$1024, UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-KCT-TEST-STATE*", KCT_TEST_STATE);
        defvar("*CB-KCT-TEST-BEING-SAVED*", NIL);
        defconstant("*DTP-KCT-ANSWER*", KCT_ANSWER);
        defparameter("*CB-KCT-ROWCOLOR*", $str27$_ffffff);
        return NIL;
    }

    public static SubLObject setup_cb_kct_test_file() {
        setup_cb_link_method($KCT_TEST, CB_LINK_KCT_TEST, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_KCT_TEST_RUN, $HTML_HANDLER);
        setup_cb_link_method($KCT_TEST_SET, CB_LINK_KCT_TEST_SET, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_KCT_TEST_SET_RUN, $HTML_HANDLER);
        declare_cb_tool($KCT, $$$KB_Content_Test_Monitor, $$$KCTRun, $str15$View_status_of_running_and_comple);
        setup_cb_link_method($KCT, CB_LINK_KCT, ONE_INTEGER);
        register_html_state_variable($sym19$_CB_KCT_REFRESH__);
        html_macros.note_cgi_handler_function(CB_KCT_MAIN, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_KCT_START_TEST, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_KCT_START_TEST_COLLECTION, $HTML_HANDLER);
        setup_cb_link_method($KCT_TOGGLE_REFRESH, CB_LINK_KCT_TOGGLE_REFRESH, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_KCT_TOGGLE_REFRESH, $HTML_HANDLER);
        setup_cb_link_method($KCT_FORGET, CB_LINK_KCT_FORGET, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_KCT_THINKING_FORGET, $HTML_HANDLER);
        setup_cb_link_method($KCT_ABORT, CB_LINK_KCT_ABORT, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_KCT_THINKING_ABORT, $HTML_HANDLER);
        setup_cb_link_method($KCT_RESULTS, CB_LINK_KCT_RESULTS, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_KCT_THINKING_RESULTS, $HTML_HANDLER);
        setup_cb_link_method($KCT_MEMBERS, CB_LINK_KCT_MEMBERS, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_KCT_THINKING_MEMBERS, $HTML_HANDLER);
        sethash($CB_KCT_TEST_SET, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str121$cb_kct_test_set_html, NIL));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kct_test_state$.getGlobalValue(), symbol_function(KCT_TEST_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list155);
        def_csetf(KCT_TEST_STATE_TEST_SPEC, _CSETF_KCT_TEST_STATE_TEST_SPEC);
        def_csetf(KCT_TEST_STATE_NAME, _CSETF_KCT_TEST_STATE_NAME);
        def_csetf(KCT_TEST_STATE_COMMENTS, _CSETF_KCT_TEST_STATE_COMMENTS);
        def_csetf(KCT_TEST_STATE_QUERY_STATE, _CSETF_KCT_TEST_STATE_QUERY_STATE);
        def_csetf(KCT_TEST_STATE_SAVE_MT, _CSETF_KCT_TEST_STATE_SAVE_MT);
        def_csetf(KCT_TEST_STATE_ANSWER_STATUS, _CSETF_KCT_TEST_STATE_ANSWER_STATUS);
        def_csetf(KCT_TEST_STATE_ANSWER_OPTIONS_INDEX, _CSETF_KCT_TEST_STATE_ANSWER_OPTIONS_INDEX);
        def_csetf(KCT_TEST_STATE_ANSWER_OPTIONS_BINDINGS_INDEX, _CSETF_KCT_TEST_STATE_ANSWER_OPTIONS_BINDINGS_INDEX);
        def_csetf(KCT_TEST_STATE_CATEGORIES, _CSETF_KCT_TEST_STATE_CATEGORIES);
        def_csetf(KCT_TEST_STATE_METRICS, _CSETF_KCT_TEST_STATE_METRICS);
        def_csetf(KCT_TEST_STATE_CYCLISTS, _CSETF_KCT_TEST_STATE_CYCLISTS);
        def_csetf(KCT_TEST_STATE_NOTES, _CSETF_KCT_TEST_STATE_NOTES);
        def_csetf(KCT_TEST_STATE_ANSWER_CARDINALITY, _CSETF_KCT_TEST_STATE_ANSWER_CARDINALITY);
        identity(KCT_TEST_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kct_test_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KCT_TEST_STATE_METHOD));
        register_html_state_variable($cb_kct_test_being_saved$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kct_answer$.getGlobalValue(), symbol_function(KCT_ANSWER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list227);
        def_csetf(KCT_ANSWER_BINDING_SET, _CSETF_KCT_ANSWER_BINDING_SET);
        def_csetf(KCT_ANSWER_STATUS, _CSETF_KCT_ANSWER_STATUS);
        def_csetf(KCT_ANSWER_ID, _CSETF_KCT_ANSWER_ID);
        identity(KCT_ANSWER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kct_answer$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KCT_ANSWER_METHOD));
        setup_cb_link_method($KCT_EDIT, CB_LINK_KCT_EDIT, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_EDIT_TEST, $HTML_HANDLER);
        setup_cb_link_method($KCT_SAVE, CB_LINK_KCT_SAVE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_SAVE_AS_TEST, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_CONFIRM_SAVE_AS_TEST, $HTML_HANDLER);
        register_html_state_variable($cb_kct_rowcolor$);
        html_macros.note_cgi_handler_function(CB_HANDLE_SPECIFY_TEST_RESULTS, $HTML_HANDLER);
        declare_cb_tool($KCT_CONTROL_PANEL, $$$KB_Content_Test_Control_Panel, $$$KCT, $str458$View_and_edit_your_KB_Content_Tes);
        setup_cb_link_method($KCT_CONTROL_PANEL, CB_LINK_KCT_CONTROL_PANEL, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_KCT_CONTROL_PANEL, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_KCT_CONTROL_PANEL_HANDLER, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_kct_test_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_kct_test_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_kct_test_file();
    }

    

    public static final class $kct_test_state_native extends SubLStructNative {
        public SubLObject $test_spec;

        public SubLObject $name;

        public SubLObject $comments;

        public SubLObject $query_state;

        public SubLObject $save_mt;

        public SubLObject $answer_status;

        public SubLObject $answer_options_index;

        public SubLObject $answer_options_bindings_index;

        public SubLObject $categories;

        public SubLObject $metrics;

        public SubLObject $cyclists;

        public SubLObject $notes;

        public SubLObject $answer_cardinality;

        private static final SubLStructDeclNative structDecl;

        private $kct_test_state_native() {
            this.$test_spec = Lisp.NIL;
            this.$name = Lisp.NIL;
            this.$comments = Lisp.NIL;
            this.$query_state = Lisp.NIL;
            this.$save_mt = Lisp.NIL;
            this.$answer_status = Lisp.NIL;
            this.$answer_options_index = Lisp.NIL;
            this.$answer_options_bindings_index = Lisp.NIL;
            this.$categories = Lisp.NIL;
            this.$metrics = Lisp.NIL;
            this.$cyclists = Lisp.NIL;
            this.$notes = Lisp.NIL;
            this.$answer_cardinality = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$test_spec;
        }

        @Override
        public SubLObject getField3() {
            return this.$name;
        }

        @Override
        public SubLObject getField4() {
            return this.$comments;
        }

        @Override
        public SubLObject getField5() {
            return this.$query_state;
        }

        @Override
        public SubLObject getField6() {
            return this.$save_mt;
        }

        @Override
        public SubLObject getField7() {
            return this.$answer_status;
        }

        @Override
        public SubLObject getField8() {
            return this.$answer_options_index;
        }

        @Override
        public SubLObject getField9() {
            return this.$answer_options_bindings_index;
        }

        @Override
        public SubLObject getField10() {
            return this.$categories;
        }

        @Override
        public SubLObject getField11() {
            return this.$metrics;
        }

        @Override
        public SubLObject getField12() {
            return this.$cyclists;
        }

        @Override
        public SubLObject getField13() {
            return this.$notes;
        }

        @Override
        public SubLObject getField14() {
            return this.$answer_cardinality;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$test_spec = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$comments = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$query_state = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$save_mt = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$answer_status = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$answer_options_index = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$answer_options_bindings_index = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$categories = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$metrics = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$cyclists = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$notes = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$answer_cardinality = value;
        }

        static {
            structDecl = makeStructDeclNative($kct_test_state_native.class, KCT_TEST_STATE, KCT_TEST_STATE_P, $list149, $list150, new String[]{ "$test_spec", "$name", "$comments", "$query_state", "$save_mt", "$answer_status", "$answer_options_index", "$answer_options_bindings_index", "$categories", "$metrics", "$cyclists", "$notes", "$answer_cardinality" }, $list151, $list152, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $kct_test_state_p$UnaryFunction extends UnaryFunction {
        public $kct_test_state_p$UnaryFunction() {
            super(extractFunctionNamed("KCT-TEST-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return kct_test_state_p(arg1);
        }
    }

    public static final class $kct_answer_native extends SubLStructNative {
        public SubLObject $binding_set;

        public SubLObject $status;

        public SubLObject $id;

        private static final SubLStructDeclNative structDecl;

        private $kct_answer_native() {
            this.$binding_set = Lisp.NIL;
            this.$status = Lisp.NIL;
            this.$id = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$binding_set;
        }

        @Override
        public SubLObject getField3() {
            return this.$status;
        }

        @Override
        public SubLObject getField4() {
            return this.$id;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$binding_set = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$status = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$id = value;
        }

        static {
            structDecl = makeStructDeclNative($kct_answer_native.class, KCT_ANSWER, KCT_ANSWER_P, $list222, $list223, new String[]{ "$binding_set", "$status", "$id" }, $list224, $list225, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $kct_answer_p$UnaryFunction extends UnaryFunction {
        public $kct_answer_p$UnaryFunction() {
            super(extractFunctionNamed("KCT-ANSWER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return kct_answer_p(arg1);
        }
    }
}

/**
 * Total time: 3933 ms synthetic
 */
