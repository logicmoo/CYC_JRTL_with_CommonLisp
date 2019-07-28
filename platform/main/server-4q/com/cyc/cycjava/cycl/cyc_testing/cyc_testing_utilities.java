package com.cyc.cycjava.cycl.cyc_testing;


import com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.regular_expression_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.control_vars.$read_require_constant_exists$;
import static com.cyc.cycjava.cycl.control_vars.$save_asked_queriesP$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cyc_testing_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new cyc_testing_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities";

    public static final String myFingerPrint = "ff47dca27dfbb4984912829ba5b08fc2ea93ac2db75fdd8a7f8be9833b95c3c8";

    // defparameter
    private static final SubLSymbol $default_rerun_crashing_tests$ = makeSymbol("*DEFAULT-RERUN-CRASHING-TESTS*");

    // defparameter
    public static final SubLSymbol $cyc_test_write_image_directory$ = makeSymbol("*CYC-TEST-WRITE-IMAGE-DIRECTORY*");

    // deflexical
    private static final SubLSymbol $tests_that_dont_work_with_real_time_pruning$ = makeSymbol("*TESTS-THAT-DONT-WORK-WITH-REAL-TIME-PRUNING*");

    // defparameter
    private static final SubLSymbol $file_size_change_tolerance$ = makeSymbol("*FILE-SIZE-CHANGE-TOLERANCE*");

    // defparameter
    private static final SubLSymbol $file_size_ignore_regexes$ = makeSymbol("*FILE-SIZE-IGNORE-REGEXES*");

    // deflexical
    private static final SubLSymbol $size_logs_directory$ = makeSymbol("*SIZE-LOGS-DIRECTORY*");

    private static final SubLSymbol $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list1 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);



    private static final SubLString $str3$_lisp = makeString(".lisp");



    private static final SubLString $str5$_A = makeString("~A");

    private static final SubLString $str6$_ = makeString("/");

    private static final SubLList $list7 = list(makeSymbol("NAME"), makeSymbol("&KEY"), list(makeSymbol("VERBOSITY"), makeKeyword("TERSE")), makeSymbol("BROWSABLE?"), makeSymbol("BLOCK?"), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(makeSymbol("QUOTE"), makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))));

    private static final SubLList $list8 = list(makeKeyword("VERBOSITY"), makeKeyword("BROWSABLE?"), makeKeyword("BLOCK?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("STREAM"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");















    private static final SubLSymbol $standard_output$ = makeSymbol("*STANDARD-OUTPUT*");

    private static final SubLSymbol $kw18$RUN_TINY_KB_TESTS_IN_FULL_KB_ = makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?");

    private static final SubLSymbol $sym19$_RUN_TINY_KB_TESTS_IN_FULL_KB__ = makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*");

    private static final SubLSymbol RUN_CYC_TEST_INT = makeSymbol("RUN-CYC-TEST-INT");

    private static final SubLList $list21 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("MIN-NUMBER"), makeSymbol("MAX-NUMBER"), makeSymbol("&KEY"), list(makeSymbol("VERBOSITY"), makeKeyword("TERSE")), makeSymbol("BROWSABLE?"), makeSymbol("BLOCK?"), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(makeSymbol("QUOTE"), makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))) });

    private static final SubLSymbol RUN_CYC_TEST_IN_RANGE_INT = makeSymbol("RUN-CYC-TEST-IN-RANGE-INT");

    private static final SubLList $list23 = list(makeSymbol("NAME"), makeSymbol("&KEY"), makeSymbol("BROWSABLE?"), makeSymbol("BLOCK?"), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(makeSymbol("QUOTE"), makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))));

    private static final SubLList $list24 = list(makeKeyword("BROWSABLE?"), makeKeyword("BLOCK?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("STREAM"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));



    private static final SubLSymbol RUN_CYC_TEST = makeSymbol("RUN-CYC-TEST");

    private static final SubLSymbol CYC_TEST_VERBOSITY_LEVEL_P = makeSymbol("CYC-TEST-VERBOSITY-LEVEL-P");



    private static final SubLSymbol CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");



    private static final SubLList $list31 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("&KEY"), list(makeSymbol("NTHREADS"), FOUR_INTEGER), list(makeSymbol("NTIMES"), TEN_INTEGER), list(makeSymbol("VERBOSITY"), makeKeyword("TERSE")), makeSymbol("BROWSABLE?"), makeSymbol("BLOCK?"), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(makeSymbol("QUOTE"), makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))) });

    private static final SubLList $list32 = list(makeKeyword("NTHREADS"), makeKeyword("NTIMES"), makeKeyword("VERBOSITY"), makeKeyword("BROWSABLE?"), makeKeyword("BLOCK?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("STREAM"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));





    private static final SubLSymbol RUN_CYC_TEST_PARALLEL_INT = makeSymbol("RUN-CYC-TEST-PARALLEL-INT");

    private static final SubLSymbol RUN_CYC_TEST_PARALLEL = makeSymbol("RUN-CYC-TEST-PARALLEL");



    private static final SubLString $$$Parallel_Test_Thread_for_ = makeString("Parallel Test Thread for ");

    private static final SubLString $str39$_No__ = makeString(" No. ");

    private static final SubLSymbol RUN_CYC_TEST_OBJECT_PARALLEL = makeSymbol("RUN-CYC-TEST-OBJECT-PARALLEL");

















    private static final SubLString $str49$Cyc_test_of_unexpected_type___s = makeString("Cyc test of unexpected type: ~s");



    private static final SubLString $str51$Can_t_run_inference_tests_in_brow = makeString("Can't run inference tests in browsable mode -- ignoring :browsable? setting~%");

    private static final SubLString $str52$Can_t_run_inference_tests_in_bloc = makeString("Can't run inference tests in blocking mode -- ignoring :block? setting~%");





    private static final SubLString $str55$Unexpected_testing_direction____S = makeString("Unexpected testing direction : ~S");



    private static final SubLString $str57$Can_t_run_removal_module_cost_tes = makeString("Can't run removal module cost tests in browsable mode -- ignoring :browsable? setting~%");

    private static final SubLString $str58$Can_t_run_removal_module_cost_tes = makeString("Can't run removal module cost tests in blocking mode -- ignoring :block? setting~%");

    private static final SubLString $str59$Can_t_run_evaluatable_relation_te = makeString("Can't run evaluatable relation tests in blocking mode -- ignoring :block? setting~%");

    private static final SubLString $str60$Can_t_run_test_case_tables_in_bro = makeString("Can't run test case tables in browsable mode -- ignoring :browsable? setting~%");

    private static final SubLString $str61$Can_t_run_test_case_tables_in_blo = makeString("Can't run test case tables in blocking mode -- ignoring :block? setting~%");



    private static final SubLSymbol CYC_TEST_TYPE_SPEC_P = makeSymbol("CYC-TEST-TYPE-SPEC-P");

    private static final SubLSymbol FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");

    private static final SubLSymbol DIRECTORY_WRITEABLE_P = makeSymbol("DIRECTORY-WRITEABLE-P");

    private static final SubLString $str66$Invalid_phase__A_of__A_specified_ = makeString("Invalid phase ~A of ~A specified.");



    private static final SubLString $str68$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str69$___HARNESS_ERROR___A__ = makeString("~&:HARNESS-ERROR: ~A~%");







    private static final SubLSymbol CYC_TEST_RUN_P = makeSymbol("CYC-TEST-RUN-P");





    private static final SubLList $list76 = list(makeKeyword("RMT"), makeKeyword("TMT"), makeKeyword("TCT"));



    private static final SubLString $str78$Unexpected_value__s_for__run_non_ = makeString("Unexpected value ~s for :run-non-working-tests");

    private static final SubLString $str79$____Failing_regression_tests___ = makeString("~&~%Failing regression tests:~%");

    private static final SubLSymbol FAILING_CYC_TEST_RUN_P = makeSymbol("FAILING-CYC-TEST-RUN-P");

    private static final SubLString $str81$None____ = makeString("None! (:");

    private static final SubLString $str82$____Succeeding_regression_tests__ = makeString("~&~%Succeeding regression tests:~%");

    private static final SubLSymbol SUCCEEDING_CYC_TEST_RUN_P = makeSymbol("SUCCEEDING-CYC-TEST-RUN-P");

    private static final SubLString $str84$None____ = makeString("None! ):");

    private static final SubLSymbol IGNORED_CYC_TEST_RUN_P = makeSymbol("IGNORED-CYC-TEST-RUN-P");

    private static final SubLString $str86$____Non_regression_tests__None_ = makeString("~&~%Non-regression tests: None.");

    private static final SubLSymbol $NON_REGRESSION_SUCCESS = makeKeyword("NON-REGRESSION-SUCCESS");

    private static final SubLSymbol $NON_REGRESSION_FAILURE = makeKeyword("NON-REGRESSION-FAILURE");

    private static final SubLString $str89$__Failing_non_regression_tests___ = makeString("~&Failing non-regression tests:~%");

    private static final SubLString $str90$__Succeeding_non_regression_tests = makeString("~&Succeeding non-regression tests:~%");

    private static final SubLString $str91$_Running_a_specified_list_of_test = makeString("\nRunning a specified list of tests ");

    private static final SubLString $str92$_Running__a_file_P_of_tests_ = makeString("\nRunning ~a file~P of tests ");

    private static final SubLString $str93$in_the__a_KB__KB__a___System__a_S = makeString("in the ~a KB (KB ~a):\nSystem ~a\nStarted at ~a ~a\n\n");

    private static final SubLString $$$Tiny = makeString("Tiny");

    private static final SubLString $$$Full = makeString("Full");

    private static final SubLString $str96$ = makeString("");

    private static final SubLString $str97$_ = makeString("(");

    private static final SubLString $$$_of_ = makeString(" of ");

    private static final SubLString $str99$_phases_ = makeString(" phases)");

    private static final SubLString $str100$__No_tests_were_run___ = makeString("~&No tests were run.~%");

    private static final SubLSymbol CYC_TEST_NAME = makeSymbol("CYC-TEST-NAME");

    private static final SubLString $str102$__NOTE__The_following_cyc_tests_w = makeString("~&NOTE: The following cyc tests were noted as not working:~%");

    private static final SubLString $str103$___Tests_finished_at__a_Total_tim = makeString("~&\nTests finished at ~a\nTotal time: ~a\nTotal test guts time: ~a\nHistogram of results:~%");

    private static final SubLSymbol CYC_TEST_RUN_RESULT = makeSymbol("CYC-TEST-RUN-RESULT");

    private static final SubLString $str105$Overall_result___s__ = makeString("Overall result: ~s~%");

    private static final SubLString $str106$_S__A__S__A = makeString("~S ~A ~S ~A");

    private static final SubLString $str107$__A = makeString(" ~A");



    private static final SubLString $str109$cyc_test_image_ = makeString("cyc-test-image-");

    private static final SubLString $$$load = makeString("load");

    private static final SubLList $list111 = list(new SubLObject[]{ makeKeyword("CANONICALIZE-INFERENCE-ANSWER-JUSTIFICATIONS"), makeKeyword("NON-EXPLANATORY-SENTENCE-SUPPORTS"), makeKeyword("NON-EXPLANATORY-VARIABLE-MAP-SUPPORTS"), makeKeyword("TRUE-SENTENCE-OF-ATOMIC-SENTENCE-REDUCTION"), makeKeyword("IST-OF-ATOMIC-SENTENCE-REDUCTION"), makeKeyword("RELATION-ALL-INSTANCE-ITERATE-2"), makeKeyword("RELATION-INSTANCE-ALL-ITERATE-2"), makeKeyword("REJECT-PREVIOUSLY-PROVEN-PROOFS"), makeKeyword("INFERENCE-HARNESS-OVERHEAD"), makeKeyword("TACTICALLY-UNEXAMINED-NO-GOOD-IMPLIES-STRATEGICALLY-UNEXAMINED-NO-GOOD"), makeKeyword("KAPPA-REMOVAL-WORKS"), makeKeyword("DONT-REOPEN-ANSWER-LINK"), makeKeyword("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-14A"), makeKeyword("CLOSED-ASENT-WITH-3-CHILDREN"), makeKeyword("SIMPLE-EXCEPT-WHEN"), makeKeyword("SIMPLE-EXCEPT-WHEN-RESIDUAL-TRANSFORMATION"), makeKeyword("PARTIAL-EXCEPT-WHEN"), makeKeyword("VARIABLE-MAP-EXCEPT-WHEN"), makeKeyword("EXCEPTION-TMS-BACKWARD-NO-OP"), makeKeyword("MULTIPLE-TRANSFORMATION-PROOFS-FOR-CLOSED-PROBLEM"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-1"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-2"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-3"), makeKeyword("EXCEPT-MT-IN-MID-MT-BLOCKS-HIGH-MT-FROM-LOW-MT"), makeKeyword("EXCEPT-MT-IN-HIGH-MT-HOSES-BACKWARD-INFERENCE"), makeKeyword("TWO-STEP"), makeKeyword("TWO-STEP-ARG-1"), makeKeyword("RECONSIDER-DEDUCTION"), makeKeyword("THERE-EXISTS"), makeKeyword("EXCEPT-WHEN"), makeKeyword("STRENGTH-PROPAGATION"), makeKeyword("SEQUENCE-VARIABLES-INFERENCE"), makeKeyword("INFERENCE-ANSWER-TEMPLATE"), makeKeyword("EXCEPT-BLOCKS-BACKWARD"), makeKeyword("EXCEPT-BLOCKS-FORWARD"), makeKeyword("TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-SCOPING"), makeKeyword("TMS-RECONSIDERATION-WITH-BACKCHAIN-FORBIDDEN"), makeKeyword("LAZILY-MANIFEST-NON-FOCALS"), makeKeyword("CONSIDER-NO-GOOD-AFTER-DETERMINING-TACTICS"), makeKeyword("IRRELEVANT-DOES-NOT-IMPLY-PENDING"), makeKeyword("PROBLEM-STORE-PRUNING-MAX-INSUFFICIENT"), makeKeyword("RESTRICTED-CLOSED-GOOD-PROBLEMS-STAY-UNEXAMINED"), makeKeyword("GENLS-BETWEEN"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-1"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-2"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-3"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-4"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-5"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-6"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-7"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-8"), makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED"), makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED-WITHOUT-INFERENCE"), makeKeyword("CIRCULAR-PROOFS"), makeKeyword("POSSIBLE-REUSED-PROBLEMS-GET-STRATEGICALLY-EVALUATED"), makeKeyword("RESIDUAL-TRANSFORMATION-PROBLEM-REUSE") });

    private static final SubLFloat $float$1_2 = makeDouble(1.2);

    private static final SubLList $list113 = list(makeString(".*~[0-9]+~"));



    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$grew = makeString("grew");

    private static final SubLString $$$shrunk = makeString("shrunk");

    private static final SubLString $$$_from_ = makeString(" from ");

    private static final SubLString $$$_bytes_to_ = makeString(" bytes to ");

    private static final SubLString $$$_bytes = makeString(" bytes");

    private static final SubLString $$$_disappeared = makeString(" disappeared");

    private static final SubLString $$$_is_a_new_file = makeString(" is a new file");

    private static final SubLString $$$filename = makeString("filename");

    private static final SubLString $$$size_in_bytes_as_of_ = makeString("size in bytes as of ");

    public static SubLObject load_lisp_test_file_from_path(final SubLObject path, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        final SubLObject _prev_bind_0 = $read_require_constant_exists$.currentBinding(thread);
        try {
            $read_require_constant_exists$.bind(NIL, thread);
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject pathname = cconcatenate(path, new SubLObject[]{ filename, $str3$_lisp });
                            successP = load(pathname);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
        } finally {
            $read_require_constant_exists$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    public static SubLObject cyc_test_write_image_directory() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $cyc_test_write_image_directory$.getDynamicValue(thread) ? NIL != string_utilities.ends_with($cyc_test_write_image_directory$.getDynamicValue(thread), $str6$_, UNPROVIDED) ? $cyc_test_write_image_directory$.getDynamicValue(thread) : cconcatenate($cyc_test_write_image_directory$.getDynamicValue(thread), $str6$_) : NIL;
    }

    public static SubLObject run_cyc_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list7);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list7);
            if (NIL == member(current_$3, $list8, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list7);
        }
        final SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
        final SubLObject verbosity = (NIL != verbosity_tail) ? cadr(verbosity_tail) : $TERSE;
        final SubLObject browsableP_tail = property_list_member($BROWSABLE_, current);
        final SubLObject browsableP = (NIL != browsableP_tail) ? cadr(browsableP_tail) : NIL;
        final SubLObject blockP_tail = property_list_member($BLOCK_, current);
        final SubLObject blockP = (NIL != blockP_tail) ? cadr(blockP_tail) : NIL;
        final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
        final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : $STANDARD;
        final SubLObject stream_tail = property_list_member($STREAM, current);
        final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : $standard_output$;
        final SubLObject run_tiny_kb_tests_in_full_kbP_tail = property_list_member($kw18$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
        final SubLObject run_tiny_kb_tests_in_full_kbP = (NIL != run_tiny_kb_tests_in_full_kbP_tail) ? cadr(run_tiny_kb_tests_in_full_kbP_tail) : $sym19$_RUN_TINY_KB_TESTS_IN_FULL_KB__;
        return list(RUN_CYC_TEST_INT, name, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
    }

    public static SubLObject run_cyc_test_in_range(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject min_number = NIL;
        SubLObject max_number = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        min_number = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        max_number = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list21);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list21);
            if (NIL == member(current_$4, $list8, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list21);
        }
        final SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
        final SubLObject verbosity = (NIL != verbosity_tail) ? cadr(verbosity_tail) : $TERSE;
        final SubLObject browsableP_tail = property_list_member($BROWSABLE_, current);
        final SubLObject browsableP = (NIL != browsableP_tail) ? cadr(browsableP_tail) : NIL;
        final SubLObject blockP_tail = property_list_member($BLOCK_, current);
        final SubLObject blockP = (NIL != blockP_tail) ? cadr(blockP_tail) : NIL;
        final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
        final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : $STANDARD;
        final SubLObject stream_tail = property_list_member($STREAM, current);
        final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : $standard_output$;
        final SubLObject run_tiny_kb_tests_in_full_kbP_tail = property_list_member($kw18$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
        final SubLObject run_tiny_kb_tests_in_full_kbP = (NIL != run_tiny_kb_tests_in_full_kbP_tail) ? cadr(run_tiny_kb_tests_in_full_kbP_tail) : $sym19$_RUN_TINY_KB_TESTS_IN_FULL_KB__;
        return list(new SubLObject[]{ RUN_CYC_TEST_IN_RANGE_INT, name, min_number, max_number, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP });
    }

    public static SubLObject run_cyc_test_verbose(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list23);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list23);
            if (NIL == member(current_$5, $list24, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list23);
        }
        final SubLObject browsableP_tail = property_list_member($BROWSABLE_, current);
        final SubLObject browsableP = (NIL != browsableP_tail) ? cadr(browsableP_tail) : NIL;
        final SubLObject blockP_tail = property_list_member($BLOCK_, current);
        final SubLObject blockP = (NIL != blockP_tail) ? cadr(blockP_tail) : NIL;
        final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
        final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : $STANDARD;
        final SubLObject stream_tail = property_list_member($STREAM, current);
        final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : $standard_output$;
        final SubLObject run_tiny_kb_tests_in_full_kbP_tail = property_list_member($kw18$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
        final SubLObject run_tiny_kb_tests_in_full_kbP = (NIL != run_tiny_kb_tests_in_full_kbP_tail) ? cadr(run_tiny_kb_tests_in_full_kbP_tail) : $sym19$_RUN_TINY_KB_TESTS_IN_FULL_KB__;
        return list(RUN_CYC_TEST_INT, name, $VERBOSE, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
    }

    public static SubLObject run_cyc_test_int(final SubLObject name, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        assert NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) : "cyc_testing.cyc_test_verbosity_level_p(verbosity) " + "CommonSymbols.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) " + verbosity;
        assert NIL != booleanp(browsableP) : "Types.booleanp(browsableP) " + "CommonSymbols.NIL != Types.booleanp(browsableP) " + browsableP;
        assert NIL != booleanp(blockP) : "Types.booleanp(blockP) " + "CommonSymbols.NIL != Types.booleanp(blockP) " + blockP;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        assert NIL != streamp(stream) : "Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) " + stream;
        assert NIL != booleanp(run_tiny_kb_tests_in_full_kbP) : "Types.booleanp(run_tiny_kb_tests_in_full_kbP) " + "CommonSymbols.NIL != Types.booleanp(run_tiny_kb_tests_in_full_kbP) " + run_tiny_kb_tests_in_full_kbP;
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var = cyc_testing.find_cyc_tests(name);
        SubLObject ct = NIL;
        ct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            test_runs = nconc(test_runs, run_cyc_test_object(ct, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP));
            cdolist_list_var = cdolist_list_var.rest();
            ct = cdolist_list_var.first();
        } 
        return test_runs;
    }

    public static SubLObject run_cyc_test_in_range_int(final SubLObject name, final SubLObject min_number, final SubLObject max_number, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        assert NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) : "cyc_testing.cyc_test_verbosity_level_p(verbosity) " + "CommonSymbols.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) " + verbosity;
        assert NIL != booleanp(browsableP) : "Types.booleanp(browsableP) " + "CommonSymbols.NIL != Types.booleanp(browsableP) " + browsableP;
        assert NIL != booleanp(blockP) : "Types.booleanp(blockP) " + "CommonSymbols.NIL != Types.booleanp(blockP) " + blockP;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        assert NIL != streamp(stream) : "Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) " + stream;
        assert NIL != booleanp(run_tiny_kb_tests_in_full_kbP) : "Types.booleanp(run_tiny_kb_tests_in_full_kbP) " + "CommonSymbols.NIL != Types.booleanp(run_tiny_kb_tests_in_full_kbP) " + run_tiny_kb_tests_in_full_kbP;
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var = cyc_testing.find_cyc_tests_in_range(name, min_number, max_number);
        SubLObject ct = NIL;
        ct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            test_runs = nconc(test_runs, run_cyc_test_object(ct, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP));
            cdolist_list_var = cdolist_list_var.rest();
            ct = cdolist_list_var.first();
        } 
        return test_runs;
    }

    public static SubLObject run_cyc_test_parallel(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list31);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list31);
            if (NIL == member(current_$6, $list32, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list31);
        }
        final SubLObject nthreads_tail = property_list_member($NTHREADS, current);
        final SubLObject nthreads = (NIL != nthreads_tail) ? cadr(nthreads_tail) : FOUR_INTEGER;
        final SubLObject ntimes_tail = property_list_member($NTIMES, current);
        final SubLObject ntimes = (NIL != ntimes_tail) ? cadr(ntimes_tail) : TEN_INTEGER;
        final SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
        final SubLObject verbosity = (NIL != verbosity_tail) ? cadr(verbosity_tail) : $TERSE;
        final SubLObject browsableP_tail = property_list_member($BROWSABLE_, current);
        final SubLObject browsableP = (NIL != browsableP_tail) ? cadr(browsableP_tail) : NIL;
        final SubLObject blockP_tail = property_list_member($BLOCK_, current);
        final SubLObject blockP = (NIL != blockP_tail) ? cadr(blockP_tail) : NIL;
        final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
        final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : $STANDARD;
        final SubLObject stream_tail = property_list_member($STREAM, current);
        final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : $standard_output$;
        final SubLObject run_tiny_kb_tests_in_full_kbP_tail = property_list_member($kw18$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
        final SubLObject run_tiny_kb_tests_in_full_kbP = (NIL != run_tiny_kb_tests_in_full_kbP_tail) ? cadr(run_tiny_kb_tests_in_full_kbP_tail) : $sym19$_RUN_TINY_KB_TESTS_IN_FULL_KB__;
        return list(new SubLObject[]{ RUN_CYC_TEST_PARALLEL_INT, name, nthreads, ntimes, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP });
    }

    public static SubLObject run_cyc_test_parallel_int(final SubLObject name, final SubLObject nthreads, final SubLObject ntimes, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        assert NIL != subl_promotions.non_negative_integer_p(nthreads) : "subl_promotions.non_negative_integer_p(nthreads) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(nthreads) " + nthreads;
        assert NIL != subl_promotions.non_negative_integer_p(ntimes) : "subl_promotions.non_negative_integer_p(ntimes) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(ntimes) " + ntimes;
        assert NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) : "cyc_testing.cyc_test_verbosity_level_p(verbosity) " + "CommonSymbols.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) " + verbosity;
        assert NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) : "cyc_testing.cyc_test_verbosity_level_p(verbosity) " + "CommonSymbols.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) " + verbosity;
        assert NIL != booleanp(browsableP) : "Types.booleanp(browsableP) " + "CommonSymbols.NIL != Types.booleanp(browsableP) " + browsableP;
        assert NIL != booleanp(blockP) : "Types.booleanp(blockP) " + "CommonSymbols.NIL != Types.booleanp(blockP) " + blockP;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        assert NIL != streamp(stream) : "Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) " + stream;
        assert NIL != booleanp(run_tiny_kb_tests_in_full_kbP) : "Types.booleanp(run_tiny_kb_tests_in_full_kbP) " + "CommonSymbols.NIL != Types.booleanp(run_tiny_kb_tests_in_full_kbP) " + run_tiny_kb_tests_in_full_kbP;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(nthreads); i = add(i, ONE_INTEGER)) {
            subl_promotions.make_process_with_args(cconcatenate($$$Parallel_Test_Thread_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(name), $str39$_No__, format_nil.format_nil_a_no_copy(i) }), symbol_function(RUN_CYC_TEST_OBJECT_PARALLEL), list(new SubLObject[]{ name, i, ntimes, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP }));
        }
        return NIL;
    }

    public static SubLObject run_cyc_test_object_parallel(final SubLObject name, final SubLObject thread_num, final SubLObject ntimes, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var = cyc_testing.find_cyc_tests(name);
        SubLObject ct = NIL;
        ct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(ntimes); i = add(i, ONE_INTEGER)) {
                test_runs = nconc(test_runs, run_cyc_test_object(ct, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP));
            }
            cdolist_list_var = cdolist_list_var.rest();
            ct = cdolist_list_var.first();
        } 
        return test_runs;
    }

    public static SubLObject run_cyc_test_object(final SubLObject ct, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject guts = cyc_testing.cyc_test_guts(ct);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $save_asked_queriesP$.currentBinding(thread);
        try {
            $save_asked_queriesP$.bind(NIL, thread);
            final SubLObject pcase_var = cyc_testing.cyc_test_type(ct);
            if (pcase_var.eql($IUT)) {
                result = run_cyc_test_iut(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
            } else
                if (pcase_var.eql($IT)) {
                    result = run_cyc_test_it(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                } else
                    if (pcase_var.eql($RMT)) {
                        result = run_cyc_test_rmt(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                    } else
                        if (pcase_var.eql($TMT)) {
                            result = run_cyc_test_tmt(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                        } else
                            if (pcase_var.eql($RMCT)) {
                                result = run_cyc_test_rmct(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                            } else
                                if (pcase_var.eql($ERT)) {
                                    result = run_cyc_test_ert(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                } else
                                    if (pcase_var.eql($TCT)) {
                                        result = run_cyc_test_tct(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                    } else
                                        if (pcase_var.eql($KCT)) {
                                            result = run_cyc_test_kct(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                        } else {
                                            Errors.error($str49$Cyc_test_of_unexpected_type___s, guts);
                                        }







        } finally {
            $save_asked_queriesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject run_cyc_test_iut(final SubLObject iut, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject verboseP = makeBoolean($SILENT != verbosity);
        thread.resetMultipleValues();
        final SubLObject result = inference_unit_tests.run_inference_unit_test_int(iut, verboseP, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
        final SubLObject test_run = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return list(test_run);
    }

    public static SubLObject run_cyc_test_it(final SubLObject it, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($SILENT != verbosity) {
            if (NIL != browsableP) {
                Errors.warn($str51$Can_t_run_inference_tests_in_brow);
            }
            if (NIL != blockP) {
                Errors.warn($str52$Can_t_run_inference_tests_in_bloc);
            }
        }
        final SubLObject progress_blipP = makeBoolean($SILENT != verbosity);
        final SubLObject verboseP = eq($VERBOSE, verbosity);
        SubLObject backward_test_run = NIL;
        SubLObject forward_test_run = NIL;
        final SubLObject _prev_bind_0 = cyc_testing.$it_output_format$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = StreamsLow.$standard_output$.currentBinding(thread);
        try {
            cyc_testing.$it_output_format$.bind(output_format, thread);
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            StreamsLow.$standard_output$.bind(stream, thread);
            backward_test_run = run_cyc_test_it_int(it, progress_blipP, verboseP, $BACKWARD);
            forward_test_run = run_cyc_test_it_int(it, progress_blipP, verboseP, $FORWARD);
        } finally {
            StreamsLow.$standard_output$.rebind(_prev_bind_3, thread);
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_2, thread);
            cyc_testing.$it_output_format$.rebind(_prev_bind_0, thread);
        }
        return list(backward_test_run, forward_test_run);
    }

    public static SubLObject run_cyc_test_it_int(final SubLObject it, final SubLObject progress_blipP, final SubLObject verboseP, final SubLObject testing_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        SubLObject total_time = NIL;
        SubLObject test_run = NIL;
        final SubLObject time_var = get_internal_real_time();
        if (NIL == cyc_testing.$cyc_test_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (testing_direction.eql($BACKWARD)) {
                            test_run = inference_testing.run_test(it, progress_blipP, verboseP, $BACKWARD, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (testing_direction.eql($FORWARD)) {
                                test_run = inference_testing.run_test(it, progress_blipP, verboseP, $FORWARD, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                Errors.error($str55$Unexpected_testing_direction____S, testing_direction);
                            }

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
        } else
            if (testing_direction.eql($BACKWARD)) {
                test_run = inference_testing.run_test(it, progress_blipP, verboseP, $BACKWARD, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (testing_direction.eql($FORWARD)) {
                    test_run = inference_testing.run_test(it, progress_blipP, verboseP, $FORWARD, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    Errors.error($str55$Unexpected_testing_direction____S, testing_direction);
                }


        total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (NIL != error_message) {
            test_run = cyc_testing.new_cyc_test_run($IT, list(it, testing_direction), $ERROR, total_time);
        }
        return test_run;
    }

    public static SubLObject run_cyc_test_rmt(final SubLObject rmt, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_runs = NIL;
        if ($SILENT == verbosity) {
            stream = StreamsLow.$null_output$.getDynamicValue(thread);
        }
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            thread.resetMultipleValues();
            final SubLObject result = removal_module_tests.run_removal_module_test(rmt, output_format, stream, browsableP, blockP);
            final SubLObject test_run = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = list(test_run);
        } finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        return test_runs;
    }

    public static SubLObject run_cyc_test_tmt(final SubLObject tmt, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_runs = NIL;
        if ($SILENT == verbosity) {
            stream = StreamsLow.$null_output$.getDynamicValue(thread);
        }
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            thread.resetMultipleValues();
            final SubLObject result = transformation_module_tests.run_transformation_module_test(tmt, output_format, stream, browsableP, blockP);
            final SubLObject test_run = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = list(test_run);
        } finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        return test_runs;
    }

    public static SubLObject run_cyc_test_rmct(final SubLObject rmct, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($SILENT != verbosity) {
            if (NIL != browsableP) {
                Errors.warn($str57$Can_t_run_removal_module_cost_tes);
            }
            if (NIL != blockP) {
                Errors.warn($str58$Can_t_run_removal_module_cost_tes);
            }
        }
        SubLObject test_run = NIL;
        if ($SILENT == verbosity) {
            stream = StreamsLow.$null_output$.getDynamicValue(thread);
        }
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            test_run = removal_module_cost_tests.run_removal_module_cost_test(rmct, output_format, stream);
        } finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        return list(test_run);
    }

    public static SubLObject run_cyc_test_ert(final SubLObject ert, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (($SILENT != verbosity) && (NIL != blockP)) {
            Errors.warn($str59$Can_t_run_evaluatable_relation_te);
        }
        SubLObject test_run = NIL;
        if ($SILENT == verbosity) {
            stream = StreamsLow.$null_output$.getDynamicValue(thread);
        }
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            test_run = evaluatable_relation_tests.run_evaluatable_relation_test(ert, output_format, stream, browsableP);
        } finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        return list(test_run);
    }

    public static SubLObject run_cyc_test_tct(final SubLObject tct, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($SILENT != verbosity) {
            if (NIL != browsableP) {
                Errors.warn($str60$Can_t_run_test_case_tables_in_bro);
            }
            if (NIL != blockP) {
                Errors.warn($str61$Can_t_run_test_case_tables_in_blo);
            }
        }
        SubLObject test_runs = NIL;
        final SubLObject generic_test_verbosity_level = ($POST_BUILD == output_format) ? $POST_BUILD : verbosity;
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            thread.resetMultipleValues();
            final SubLObject result = run_generic_test_case_int(stream, tct, generic_test_verbosity_level, NIL);
            final SubLObject tct_test_runs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = tct_test_runs;
        } finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        return test_runs;
    }

    public static SubLObject run_cyc_test_kct(final SubLObject kct, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        return list(kct_cyc_testing.kct_run_test_as_cyc_test(kct, verbosity, browsableP, blockP, output_format, stream));
    }

    public static SubLObject run_all_loaded_cyc_tests_int(final SubLObject stream, final SubLObject verbosity, final SubLObject stop_at_first_failureP, final SubLObject output_format, final SubLObject run_tiny_kb_tests_in_full_kbP, final SubLObject run_test_case_tablesP, final SubLObject type, final SubLObject run_non_working_tests, final SubLObject progress_file, SubLObject rerun_crashing_tests, SubLObject tests, SubLObject phase, SubLObject phases) {
        if (tests == UNPROVIDED) {
            tests = cyc_testing.cyc_tests();
        }
        if (phase == UNPROVIDED) {
            phase = ZERO_INTEGER;
        }
        if (phases == UNPROVIDED) {
            phases = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != streamp(stream) : "Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) " + stream;
        assert NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) : "cyc_testing.cyc_test_verbosity_level_p(verbosity) " + "CommonSymbols.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) " + verbosity;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        assert NIL != booleanp(stop_at_first_failureP) : "Types.booleanp(stop_at_first_failureP) " + "CommonSymbols.NIL != Types.booleanp(stop_at_first_failureP) " + stop_at_first_failureP;
        assert NIL != booleanp(run_tiny_kb_tests_in_full_kbP) : "Types.booleanp(run_tiny_kb_tests_in_full_kbP) " + "CommonSymbols.NIL != Types.booleanp(run_tiny_kb_tests_in_full_kbP) " + run_tiny_kb_tests_in_full_kbP;
        assert NIL != cyc_testing.cyc_test_type_spec_p(type) : "cyc_testing.cyc_test_type_spec_p(type) " + "CommonSymbols.NIL != cyc_testing.cyc_test_type_spec_p(type) " + type;
        if (((NIL != progress_file) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == file_utilities.file_valid_for_writing_p(progress_file))) {
            throw new AssertionError(progress_file);
        }
        if (NIL == rerun_crashing_tests) {
            rerun_crashing_tests = $default_rerun_crashing_tests$.getDynamicValue(thread);
        }
        assert NIL != subl_promotions.non_negative_integer_p(rerun_crashing_tests) : "subl_promotions.non_negative_integer_p(rerun_crashing_tests) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(rerun_crashing_tests) " + rerun_crashing_tests;
        if (((NIL != cyc_test_write_image_directory()) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == file_utilities.directory_writeable_p(cyc_test_write_image_directory(), UNPROVIDED))) {
            throw new AssertionError(cyc_test_write_image_directory());
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!phase.numL(phases))) {
            Errors.error($str66$Invalid_phase__A_of__A_specified_, phase, phases);
        }
        final SubLObject silentP = eq($SILENT, verbosity);
        final SubLObject tests_specifiedP = (NIL != tests) ? makeBoolean(!tests.eql(cyc_testing.cyc_tests())) : NIL;
        final SubLObject tests_count = length(tests);
        SubLObject doneP = NIL;
        final SubLObject start_time = get_universal_time();
        SubLObject harness_error = NIL;
        SubLObject some_harness_errorP = NIL;
        thread.resetMultipleValues();
        SubLObject test_runs = load_cyc_tests_progress_file(progress_file, rerun_crashing_tests);
        final SubLObject tests_to_avoid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != progress_file) {
            SubLObject stream_$7 = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream_$7 = compatibility.open_binary(progress_file, $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream_$7.isStream()) {
                    Errors.error($str68$Unable_to_open__S, progress_file);
                }
                final SubLObject progress_stream = stream_$7;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            if (NIL == silentP) {
                                run_all_loaded_cyc_tests_print_header(stream, start_time, tests_specifiedP, phase, phases);
                            }
                            SubLObject list_var = NIL;
                            SubLObject ct = NIL;
                            SubLObject test_num = NIL;
                            list_var = tests;
                            ct = list_var.first();
                            for (test_num = ZERO_INTEGER; (NIL == doneP) && (NIL != list_var); list_var = list_var.rest() , ct = list_var.first() , test_num = add(ONE_INTEGER, test_num)) {
                                SubLObject partial_test_runs = NIL;
                                if ((NIL == cyc_test_part_of_phaseP(test_num, tests_count, phase, phases)) || (NIL == run_cyc_testP(ct, type, run_test_case_tablesP, run_non_working_tests, tests_to_avoid))) {
                                    partial_test_runs = list(new_cyc_test_null_run(ct));
                                } else
                                    if (($TCT != cyc_testing.cyc_test_type(ct)) && (NIL != cyc_test_mentions_invalid_constantP(ct))) {
                                        partial_test_runs = list(new_cyc_test_invalid_run(ct));
                                    } else {
                                        cyc_test_possibly_write_image(ct);
                                        if (NIL != progress_file) {
                                            cfasl_output(new_cyc_test_error_run(ct), progress_stream);
                                            force_output(progress_stream);
                                        }
                                        if (NIL == cyc_testing.$cyc_test_debugP$.getDynamicValue(thread)) {
                                            try {
                                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        partial_test_runs = run_cyc_test_object(ct, verbosity, NIL, NIL, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                                    } catch (final Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                                                }
                                            } catch (final Throwable ccatch_env_var) {
                                                harness_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                            } finally {
                                                thread.throwStack.pop();
                                            }
                                        } else {
                                            partial_test_runs = run_cyc_test_object(ct, verbosity, NIL, NIL, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                        }
                                        cyc_test_possibly_cleanup_write_image(ct, partial_test_runs);
                                    }

                                if (NIL != harness_error) {
                                    some_harness_errorP = T;
                                    if (NIL == silentP) {
                                        format_nil.force_format(stream, $str69$___HARNESS_ERROR___A__, harness_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    harness_error = NIL;
                                }
                                test_runs = nconc(test_runs, partial_test_runs);
                                if (NIL != progress_file) {
                                    SubLObject cdolist_list_var = partial_test_runs;
                                    SubLObject test_run = NIL;
                                    test_run = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        cfasl_output(test_run, progress_stream);
                                        force_output(progress_stream);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        test_run = cdolist_list_var.first();
                                    } 
                                }
                                if (NIL != stop_at_first_failureP) {
                                    final SubLObject partial_result = cyc_testing.cyc_test_runs_overall_result(partial_test_runs);
                                    if (NIL != cyc_testing.cyc_test_failure_result_p(partial_result)) {
                                        doneP = T;
                                    }
                                }
                            }
                            if (NIL == silentP) {
                                run_all_loaded_cyc_tests_print_footer(stream, start_time, test_runs, tests_specifiedP, type);
                            }
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    harness_error = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream_$7.isStream()) {
                        close(stream_$7, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } else {
            final SubLObject progress_stream2 = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (NIL == silentP) {
                            run_all_loaded_cyc_tests_print_header(stream, start_time, tests_specifiedP, phase, phases);
                        }
                        SubLObject list_var2 = NIL;
                        SubLObject ct2 = NIL;
                        SubLObject test_num2 = NIL;
                        list_var2 = tests;
                        ct2 = list_var2.first();
                        for (test_num2 = ZERO_INTEGER; (NIL == doneP) && (NIL != list_var2); list_var2 = list_var2.rest() , ct2 = list_var2.first() , test_num2 = add(ONE_INTEGER, test_num2)) {
                            SubLObject partial_test_runs2 = NIL;
                            if ((NIL == cyc_test_part_of_phaseP(test_num2, tests_count, phase, phases)) || (NIL == run_cyc_testP(ct2, type, run_test_case_tablesP, run_non_working_tests, tests_to_avoid))) {
                                partial_test_runs2 = list(new_cyc_test_null_run(ct2));
                            } else
                                if (($TCT != cyc_testing.cyc_test_type(ct2)) && (NIL != cyc_test_mentions_invalid_constantP(ct2))) {
                                    partial_test_runs2 = list(new_cyc_test_invalid_run(ct2));
                                } else {
                                    cyc_test_possibly_write_image(ct2);
                                    if (NIL != progress_file) {
                                        cfasl_output(new_cyc_test_error_run(ct2), progress_stream2);
                                        force_output(progress_stream2);
                                    }
                                    if (NIL == cyc_testing.$cyc_test_debugP$.getDynamicValue(thread)) {
                                        try {
                                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    partial_test_runs2 = run_cyc_test_object(ct2, verbosity, NIL, NIL, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                                } catch (final Throwable catch_var3) {
                                                    Errors.handleThrowable(catch_var3, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                                            }
                                        } catch (final Throwable ccatch_env_var3) {
                                            harness_error = Errors.handleThrowable(ccatch_env_var3, $catch_error_message_target$.getGlobalValue());
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                    } else {
                                        partial_test_runs2 = run_cyc_test_object(ct2, verbosity, NIL, NIL, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                    }
                                    cyc_test_possibly_cleanup_write_image(ct2, partial_test_runs2);
                                }

                            if (NIL != harness_error) {
                                some_harness_errorP = T;
                                if (NIL == silentP) {
                                    format_nil.force_format(stream, $str69$___HARNESS_ERROR___A__, harness_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                harness_error = NIL;
                            }
                            test_runs = nconc(test_runs, partial_test_runs2);
                            if (NIL != progress_file) {
                                SubLObject cdolist_list_var2 = partial_test_runs2;
                                SubLObject test_run2 = NIL;
                                test_run2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    cfasl_output(test_run2, progress_stream2);
                                    force_output(progress_stream2);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    test_run2 = cdolist_list_var2.first();
                                } 
                            }
                            if (NIL != stop_at_first_failureP) {
                                final SubLObject partial_result2 = cyc_testing.cyc_test_runs_overall_result(partial_test_runs2);
                                if (NIL != cyc_testing.cyc_test_failure_result_p(partial_result2)) {
                                    doneP = T;
                                }
                            }
                        }
                        if (NIL == silentP) {
                            run_all_loaded_cyc_tests_print_footer(stream, start_time, test_runs, tests_specifiedP, type);
                        }
                    } catch (final Throwable catch_var4) {
                        Errors.handleThrowable(catch_var4, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var4) {
                harness_error = Errors.handleThrowable(ccatch_env_var4, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        }
        SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result(test_runs);
        if (NIL != some_harness_errorP) {
            overall_result = $HARNESS_ERROR;
        }
        return values(overall_result, test_runs);
    }

    public static SubLObject cyc_test_part_of_phaseP(final SubLObject test_num, final SubLObject tests_count, final SubLObject phase, final SubLObject phases) {
        return numE(phase, truncate(test_num, divide(tests_count, phases)));
    }

    public static SubLObject load_cyc_tests_progress_file(final SubLObject progress_file, final SubLObject rerun_crashing_tests) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == progress_file) || (NIL == file_utilities.file_existsP(progress_file))) {
            return values(NIL, set.new_set(symbol_function(EQ), UNPROVIDED));
        }
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        final SubLObject history_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        SubLObject current_test_run = NIL;
        SubLObject last_cyc_test = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(progress_file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str68$Unable_to_open__S, progress_file);
            }
            SubLObject stream_$10;
            for (stream_$10 = stream, current_test_run = cfasl_input(stream_$10, NIL, $EOF); $EOF != current_test_run; current_test_run = cfasl_input(stream_$10, NIL, $EOF)) {
                assert NIL != cyc_testing.cyc_test_run_p(current_test_run) : "cyc_testing.cyc_test_run_p(current_test_run) " + "CommonSymbols.NIL != cyc_testing.cyc_test_run_p(current_test_run) " + current_test_run;
                final SubLObject ct = cyc_testing.cyc_test_run_cyc_test(current_test_run);
                dictionary.dictionary_enter(dict, ct, current_test_run);
                dictionary_utilities.dictionary_increment(history_dict, ct, UNPROVIDED);
                last_cyc_test = ct;
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
        final SubLObject test_runs = dictionary.dictionary_values(dict);
        final SubLObject tests_to_avoid = set_utilities.construct_set_from_list(dictionary.dictionary_keys(dict), symbol_function(EQ), UNPROVIDED);
        if (((NIL != last_cyc_test) && rerun_crashing_tests.isPositive()) && dictionary.dictionary_lookup(history_dict, last_cyc_test, ZERO_INTEGER).numLE(rerun_crashing_tests)) {
            set.set_remove(last_cyc_test, tests_to_avoid);
        }
        return values(test_runs, tests_to_avoid);
    }

    public static SubLObject new_cyc_test_null_run(final SubLObject ct) {
        final SubLObject type = cyc_testing.cyc_test_type(ct);
        final SubLObject name = cyc_testing.cyc_test_name(ct);
        return cyc_testing.new_cyc_test_run(type, name, $NOT_RUN, NIL);
    }

    public static SubLObject new_cyc_test_invalid_run(final SubLObject ct) {
        final SubLObject type = cyc_testing.cyc_test_type(ct);
        final SubLObject name = cyc_testing.cyc_test_name(ct);
        return cyc_testing.new_cyc_test_run(type, name, $INVALID, NIL);
    }

    public static SubLObject new_cyc_test_error_run(final SubLObject ct) {
        final SubLObject type = cyc_testing.cyc_test_type(ct);
        final SubLObject name = cyc_testing.cyc_test_name(ct);
        return cyc_testing.new_cyc_test_run(type, name, $ERROR, NIL);
    }

    public static SubLObject run_cyc_testP(final SubLObject ct, final SubLObject type_spec, final SubLObject run_test_case_tablesP, final SubLObject run_non_working_tests, SubLObject tests_to_avoid) {
        if (tests_to_avoid == UNPROVIDED) {
            tests_to_avoid = NIL;
        }
        if (NIL != cyc_testing.testing_real_time_pruningP()) {
            if (NIL != list_utilities.member_eqP(cyc_testing.cyc_test_type(ct), $list76)) {
                return NIL;
            }
            if (NIL != list_utilities.member_eqP(cyc_testing.cyc_test_name(ct), $tests_that_dont_work_with_real_time_pruning$.getGlobalValue())) {
                return NIL;
            }
        }
        if (NIL != cyc_testing.cyc_test_type_p(type_spec)) {
            final SubLObject type = cyc_testing.cyc_test_type(ct);
            if (!type.eql(type_spec)) {
                return NIL;
            }
        }
        if ((NIL == run_test_case_tablesP) && ($TCT == cyc_testing.cyc_test_type(ct))) {
            return NIL;
        }
        if ((NIL != tests_to_avoid) && (NIL != set.set_memberP(ct, tests_to_avoid))) {
            return NIL;
        }
        if (T != run_non_working_tests) {
            if (NIL == run_non_working_tests) {
                if (NIL == cyc_testing.cyc_test_workingP(ct)) {
                    return NIL;
                }
            } else {
                if ($ONLY != run_non_working_tests) {
                    return Errors.error($str78$Unexpected_value__s_for__run_non_, run_non_working_tests);
                }
                if (NIL != cyc_testing.cyc_test_workingP(ct)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject print_failing_cyc_tests_message(final SubLObject stream, final SubLObject test_runs, SubLObject show_ownersP, SubLObject show_projectsP) {
        if (show_ownersP == UNPROVIDED) {
            show_ownersP = NIL;
        }
        if (show_projectsP == UNPROVIDED) {
            show_projectsP = NIL;
        }
        format(stream, $str79$____Failing_regression_tests___);
        final SubLObject failing_test_runs = list_utilities.remove_if_not(FAILING_CYC_TEST_RUN_P, test_runs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != failing_test_runs) {
            SubLObject cdolist_list_var = failing_test_runs;
            SubLObject test_run = NIL;
            test_run = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            } 
        } else {
            format(stream, $str81$None____);
        }
        force_output(stream);
        return NIL;
    }

    public static SubLObject print_succeeding_cyc_tests_message(final SubLObject stream, final SubLObject test_runs, SubLObject show_ownersP, SubLObject show_projectsP) {
        if (show_ownersP == UNPROVIDED) {
            show_ownersP = NIL;
        }
        if (show_projectsP == UNPROVIDED) {
            show_projectsP = NIL;
        }
        format(stream, $str82$____Succeeding_regression_tests__);
        final SubLObject succeeding_test_runs = list_utilities.remove_if_not(SUCCEEDING_CYC_TEST_RUN_P, test_runs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != succeeding_test_runs) {
            SubLObject cdolist_list_var = succeeding_test_runs;
            SubLObject test_run = NIL;
            test_run = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            } 
        } else {
            format(stream, $str84$None____);
        }
        force_output(stream);
        return NIL;
    }

    public static SubLObject print_ignored_cyc_tests_message(final SubLObject stream, final SubLObject test_runs, SubLObject show_ownersP, SubLObject show_projectsP) {
        if (show_ownersP == UNPROVIDED) {
            show_ownersP = NIL;
        }
        if (show_projectsP == UNPROVIDED) {
            show_projectsP = NIL;
        }
        final SubLObject ignored_test_runs = list_utilities.remove_if_not(IGNORED_CYC_TEST_RUN_P, test_runs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == ignored_test_runs) {
            format(stream, $str86$____Non_regression_tests__None_);
        } else {
            SubLObject ignored_success = NIL;
            SubLObject ignored_fail = NIL;
            SubLObject cdolist_list_var = ignored_test_runs;
            SubLObject test_run = NIL;
            test_run = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pcase_var = cyc_testing.cyc_test_run_result(test_run);
                if (pcase_var.eql($NON_REGRESSION_SUCCESS)) {
                    ignored_success = cons(test_run, ignored_success);
                } else
                    if (pcase_var.eql($NON_REGRESSION_FAILURE)) {
                        ignored_fail = cons(test_run, ignored_fail);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            } 
            ignored_success = nreverse(ignored_success);
            ignored_fail = nreverse(ignored_fail);
            format(stream, $str89$__Failing_non_regression_tests___);
            cdolist_list_var = ignored_fail;
            test_run = NIL;
            test_run = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            } 
            format(stream, $str90$__Succeeding_non_regression_tests);
            cdolist_list_var = ignored_success;
            test_run = NIL;
            test_run = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            } 
        }
        force_output(stream);
        return NIL;
    }

    public static SubLObject run_all_loaded_cyc_tests_print_header(final SubLObject stream, final SubLObject start_time, final SubLObject tests_specifiedP, SubLObject phase, SubLObject phases) {
        if (phase == UNPROVIDED) {
            phase = ZERO_INTEGER;
        }
        if (phases == UNPROVIDED) {
            phases = ONE_INTEGER;
        }
        final SubLObject tiny_kbP = makeBoolean(NIL == non_tiny_kb_loadedP());
        if (NIL != tests_specifiedP) {
            format(stream, $str91$_Running_a_specified_list_of_test);
        } else {
            format(stream, $str92$_Running__a_file_P_of_tests_, cyc_testing.cyc_test_file_count(), cyc_testing.cyc_test_file_count());
        }
        format(stream, $str93$in_the__a_KB__KB__a___System__a_S, new SubLObject[]{ NIL != tiny_kbP ? $$$Tiny : $$$Full, kb_loaded(), system_info.cyc_revision_string(), numeric_date_utilities.timestring(start_time), ONE_INTEGER.numE(phases) && ZERO_INTEGER.numE(phase) ? $str96$ : cconcatenate($str97$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(add(ONE_INTEGER, phase)), $$$_of_, format_nil.format_nil_a_no_copy(phases), $str99$_phases_ }) });
        force_output(stream);
        return NIL;
    }

    public static SubLObject run_all_loaded_cyc_tests_print_footer(final SubLObject stream, final SubLObject start_time, final SubLObject test_runs, final SubLObject tests_specifiedP, final SubLObject type) {
        if (NIL == test_runs) {
            format(stream, $str100$__No_tests_were_run___);
        } else {
            if (NIL == tests_specifiedP) {
                final SubLObject non_working_tests = cyc_testing.non_working_cyc_tests(type);
                if (NIL != non_working_tests) {
                    final SubLObject non_working_test_names = Mapping.mapcar(symbol_function(CYC_TEST_NAME), non_working_tests);
                    format(stream, $str102$__NOTE__The_following_cyc_tests_w);
                    format_nil.print_one_per_line(non_working_test_names, stream);
                    terpri(stream);
                }
            }
            print_failing_cyc_tests_message(stream, test_runs, T, NIL);
            final SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result(test_runs);
            final SubLObject total_test_guts_time = cyc_testing.cyc_test_runs_total_time(test_runs);
            final SubLObject end_time = get_universal_time();
            final SubLObject total_time = subtract(end_time, start_time);
            format(stream, $str103$___Tests_finished_at__a_Total_tim, new SubLObject[]{ numeric_date_utilities.timestring(end_time), numeric_date_utilities.elapsed_time_abbreviation_string(total_time), numeric_date_utilities.elapsed_time_abbreviation_string(total_test_guts_time) });
            list_utilities.pretty_print_plist(list_utilities.histogram_as_plist(Mapping.mapcar(CYC_TEST_RUN_RESULT, test_runs), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            format(stream, $str105$Overall_result___s__, overall_result);
        }
        force_output(stream);
        return NIL;
    }

    public static SubLObject show_cyc_test_run(final SubLObject stream, final SubLObject test_run, final SubLObject show_ownerP, final SubLObject show_projectP) {
        format(stream, $str106$_S__A__S__A, new SubLObject[]{ cyc_testing.cyc_test_run_type(test_run), cyc_testing.cyc_test_run_name(test_run), cyc_testing.cyc_test_run_result(test_run), NIL != cyc_testing.cyc_test_run_time(test_run) ? number_utilities.significant_digits(cyc_testing.cyc_test_run_time(test_run), FOUR_INTEGER) : NIL });
        if (NIL != show_ownerP) {
            format(stream, $str107$__A, cyc_testing.cyc_test_run_owner(test_run));
        }
        if (NIL != show_projectP) {
            final SubLObject project = cyc_testing.cyc_test_run_project(test_run);
            if (NIL != project) {
                format(stream, $str107$__A, project);
            }
        }
        terpri(stream);
        force_output(stream);
        return test_run;
    }

    public static SubLObject cyc_test_possibly_write_image(final SubLObject ct) {
        final SubLObject dir = cyc_test_write_image_directory();
        if (NIL != dir) {
            final SubLObject filename = cyc_test_image_filename(ct, dir);
            Mapper.write_image(filename, UNPROVIDED);
            return filename;
        }
        return NIL;
    }

    public static SubLObject cyc_test_possibly_cleanup_write_image(final SubLObject ct, final SubLObject test_runs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dir = cyc_test_write_image_directory();
        if (NIL == dir) {
            return NIL;
        }
        final SubLObject filename = cyc_test_image_filename(ct, dir);
        if ($SUCCESS == cyc_testing.cyc_test_runs_overall_result(test_runs)) {
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = eval($sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            eval($list1);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            Filesys.delete_file(filename);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str5$_A, message_var);
            }
            return T;
        }
        return filename;
    }

    public static SubLObject cyc_test_image_filename(final SubLObject ct, final SubLObject dir) {
        final SubLObject test_identifier = Strings.string_downcase(string_utilities.alphanumericize_admitting_hyphens(string_utilities.str(cyc_testing.cyc_test_name(ct))), UNPROVIDED, UNPROVIDED);
        final SubLObject filename = cconcatenate($str109$cyc_test_image_, test_identifier);
        return Strings.string_downcase(file_utilities.relative_filename(dir, filename, $$$load), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_test_mentions_invalid_constantP(final SubLObject ct) {
        final SubLObject guts = cyc_testing.cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_testing.cyc_test_type(ct);
        if (pcase_var.eql($IUT)) {
            return inference_unit_tests.inference_unit_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql($IT)) {
            return inference_testing.inference_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql($RMT)) {
            return removal_module_tests.removal_module_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql($TMT)) {
            return transformation_module_tests.transformation_module_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql($RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql($ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql($TCT)) {
            return list_utilities.sublisp_boolean(generic_test_case_table_tuples_mentioning_some_invalid_constant(guts));
        }
        if (pcase_var.eql($KCT)) {
            return kct_cyc_testing.kct_test_spec_mentions_invalid_constantP(guts);
        }
        return Errors.error($str49$Cyc_test_of_unexpected_type___s, guts);
    }

    public static SubLObject compare_directories(final SubLObject old_dir, final SubLObject new_dir) {
        final SubLObject old_dict = directory_file_size_dict(old_dir);
        final SubLObject new_dict = directory_file_size_dict(new_dir);
        return compare_file_size_dictionaries(old_dict, new_dict);
    }

    public static SubLObject directory_file_size_dict(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject directory_contents_var = Filesys.directory(directory, NIL);
        final SubLObject progress_message_var = NIL;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$11 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
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
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if ((NIL == Filesys.directory_p(file)) && (NIL == ignore_filename_due_to_regexP(file))) {
                            dictionary.dictionary_enter(dict, file, file_utilities.get_file_length(file_utilities.relative_filename(directory, file, UNPROVIDED)));
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
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
                $progress_note$.rebind(_prev_bind_0_$11, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return dict;
    }

    public static SubLObject compare_file_size_dictionaries(final SubLObject old_dict, final SubLObject new_dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alerts = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(old_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject filename = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject old_size = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject new_size = dictionary.dictionary_lookup_without_values(new_dict, filename, UNPROVIDED);
            if (NIL == new_size) {
                alerts = cons(new_file_existence_difference_alert(filename, T), alerts);
            } else
                if (NIL == file_size_difference_within_toleranceP(old_size, new_size, filename)) {
                    alerts = cons(new_file_size_difference_alert(old_size, new_size, filename), alerts);
                }

        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(new_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject filename = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == dictionary.dictionary_lookup_without_values(old_dict, filename, UNPROVIDED)) {
                alerts = cons(new_file_existence_difference_alert(filename, NIL), alerts);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return nreverse(alerts);
    }

    public static SubLObject file_size_difference_within_toleranceP(final SubLObject old_size, final SubLObject new_size, final SubLObject filename) {
        if (old_size.numE(new_size)) {
            return T;
        }
        final SubLObject grewP = file_size_grewP(old_size, new_size);
        final SubLObject small_size = (NIL != grewP) ? old_size : new_size;
        final SubLObject big_size = (NIL != grewP) ? new_size : old_size;
        final SubLObject tolerance = size_change_tolerance(filename);
        return numL(divide(big_size, small_size), tolerance);
    }

    public static SubLObject size_change_tolerance(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $file_size_change_tolerance$.getDynamicValue(thread);
    }

    public static SubLObject file_size_grewP(final SubLObject old_size, final SubLObject new_size) {
        return numL(old_size, new_size);
    }

    public static SubLObject new_file_size_difference_alert(final SubLObject old_size, final SubLObject new_size, final SubLObject filename) {
        final SubLObject grewP = file_size_grewP(old_size, new_size);
        return cconcatenate(format_nil.format_nil_a_no_copy(filename), new SubLObject[]{ $$$_, format_nil.format_nil_a_no_copy(NIL != grewP ? $$$grew : $$$shrunk), $$$_from_, format_nil.format_nil_a_no_copy(old_size), $$$_bytes_to_, format_nil.format_nil_a_no_copy(new_size), $$$_bytes });
    }

    public static SubLObject new_file_existence_difference_alert(final SubLObject filename, final SubLObject exists_in_oldP) {
        if (NIL != exists_in_oldP) {
            return cconcatenate(format_nil.format_nil_a_no_copy(filename), $$$_disappeared);
        }
        return cconcatenate(format_nil.format_nil_a_no_copy(filename), $$$_is_a_new_file);
    }

    public static SubLObject ignore_filename_due_to_regexP(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return string_matches_any_regexP(filename, $file_size_ignore_regexes$.getDynamicValue(thread));
    }

    public static SubLObject string_matches_any_regexP(final SubLObject string, final SubLObject regexes) {
        SubLObject cdolist_list_var = regexes;
        SubLObject regex = NIL;
        regex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != regular_expression_utilities.find_all_matches_for_regular_expression(regex, string, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            regex = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject write_directory_file_size_log(final SubLObject directory, final SubLObject logfile) {
        final SubLObject dict = directory_file_size_dict(directory);
        final SubLObject header_1 = $$$filename;
        final SubLObject header_2 = cconcatenate($$$size_in_bytes_as_of_, numeric_date_utilities.timestring(UNPROVIDED));
        return dictionary_utilities.print_dictionary_contents_to_csv(dict, logfile, header_1, header_2);
    }

    public static SubLObject read_directory_file_size_log(final SubLObject logfile) {
        return dictionary_utilities.new_dictionary_from_csv(logfile, symbol_function(EQUAL), T, T);
    }

    public static SubLObject compare_file_size_logs(final SubLObject old_logfile, final SubLObject new_logfile) {
        return compare_file_size_dictionaries(read_directory_file_size_log(old_logfile), read_directory_file_size_log(new_logfile));
    }

    public static SubLObject declare_cyc_testing_utilities_file() {
        declareFunction(me, "load_lisp_test_file_from_path", "LOAD-LISP-TEST-FILE-FROM-PATH", 2, 0, false);
        declareFunction(me, "cyc_test_write_image_directory", "CYC-TEST-WRITE-IMAGE-DIRECTORY", 0, 0, false);
        declareMacro(me, "run_cyc_test", "RUN-CYC-TEST");
        declareMacro(me, "run_cyc_test_in_range", "RUN-CYC-TEST-IN-RANGE");
        declareMacro(me, "run_cyc_test_verbose", "RUN-CYC-TEST-VERBOSE");
        declareFunction(me, "run_cyc_test_int", "RUN-CYC-TEST-INT", 7, 0, false);
        declareFunction(me, "run_cyc_test_in_range_int", "RUN-CYC-TEST-IN-RANGE-INT", 9, 0, false);
        declareMacro(me, "run_cyc_test_parallel", "RUN-CYC-TEST-PARALLEL");
        declareFunction(me, "run_cyc_test_parallel_int", "RUN-CYC-TEST-PARALLEL-INT", 9, 0, false);
        declareFunction(me, "run_cyc_test_object_parallel", "RUN-CYC-TEST-OBJECT-PARALLEL", 9, 0, false);
        declareFunction(me, "run_cyc_test_object", "RUN-CYC-TEST-OBJECT", 7, 0, false);
        declareFunction(me, "run_cyc_test_iut", "RUN-CYC-TEST-IUT", 7, 0, false);
        declareFunction(me, "run_cyc_test_it", "RUN-CYC-TEST-IT", 7, 0, false);
        declareFunction(me, "run_cyc_test_it_int", "RUN-CYC-TEST-IT-INT", 4, 0, false);
        declareFunction(me, "run_cyc_test_rmt", "RUN-CYC-TEST-RMT", 7, 0, false);
        declareFunction(me, "run_cyc_test_tmt", "RUN-CYC-TEST-TMT", 7, 0, false);
        declareFunction(me, "run_cyc_test_rmct", "RUN-CYC-TEST-RMCT", 7, 0, false);
        declareFunction(me, "run_cyc_test_ert", "RUN-CYC-TEST-ERT", 7, 0, false);
        declareFunction(me, "run_cyc_test_tct", "RUN-CYC-TEST-TCT", 7, 0, false);
        declareFunction(me, "run_cyc_test_kct", "RUN-CYC-TEST-KCT", 7, 0, false);
        declareFunction(me, "run_all_loaded_cyc_tests_int", "RUN-ALL-LOADED-CYC-TESTS-INT", 10, 3, false);
        declareFunction(me, "cyc_test_part_of_phaseP", "CYC-TEST-PART-OF-PHASE?", 4, 0, false);
        declareFunction(me, "load_cyc_tests_progress_file", "LOAD-CYC-TESTS-PROGRESS-FILE", 2, 0, false);
        declareFunction(me, "new_cyc_test_null_run", "NEW-CYC-TEST-NULL-RUN", 1, 0, false);
        declareFunction(me, "new_cyc_test_invalid_run", "NEW-CYC-TEST-INVALID-RUN", 1, 0, false);
        declareFunction(me, "new_cyc_test_error_run", "NEW-CYC-TEST-ERROR-RUN", 1, 0, false);
        declareFunction(me, "run_cyc_testP", "RUN-CYC-TEST?", 4, 1, false);
        declareFunction(me, "print_failing_cyc_tests_message", "PRINT-FAILING-CYC-TESTS-MESSAGE", 2, 2, false);
        declareFunction(me, "print_succeeding_cyc_tests_message", "PRINT-SUCCEEDING-CYC-TESTS-MESSAGE", 2, 2, false);
        declareFunction(me, "print_ignored_cyc_tests_message", "PRINT-IGNORED-CYC-TESTS-MESSAGE", 2, 2, false);
        declareFunction(me, "run_all_loaded_cyc_tests_print_header", "RUN-ALL-LOADED-CYC-TESTS-PRINT-HEADER", 3, 2, false);
        declareFunction(me, "run_all_loaded_cyc_tests_print_footer", "RUN-ALL-LOADED-CYC-TESTS-PRINT-FOOTER", 5, 0, false);
        declareFunction(me, "show_cyc_test_run", "SHOW-CYC-TEST-RUN", 4, 0, false);
        declareFunction(me, "cyc_test_possibly_write_image", "CYC-TEST-POSSIBLY-WRITE-IMAGE", 1, 0, false);
        declareFunction(me, "cyc_test_possibly_cleanup_write_image", "CYC-TEST-POSSIBLY-CLEANUP-WRITE-IMAGE", 2, 0, false);
        declareFunction(me, "cyc_test_image_filename", "CYC-TEST-IMAGE-FILENAME", 2, 0, false);
        declareFunction(me, "cyc_test_mentions_invalid_constantP", "CYC-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareFunction(me, "compare_directories", "COMPARE-DIRECTORIES", 2, 0, false);
        declareFunction(me, "directory_file_size_dict", "DIRECTORY-FILE-SIZE-DICT", 1, 0, false);
        declareFunction(me, "compare_file_size_dictionaries", "COMPARE-FILE-SIZE-DICTIONARIES", 2, 0, false);
        declareFunction(me, "file_size_difference_within_toleranceP", "FILE-SIZE-DIFFERENCE-WITHIN-TOLERANCE?", 3, 0, false);
        declareFunction(me, "size_change_tolerance", "SIZE-CHANGE-TOLERANCE", 1, 0, false);
        declareFunction(me, "file_size_grewP", "FILE-SIZE-GREW?", 2, 0, false);
        declareFunction(me, "new_file_size_difference_alert", "NEW-FILE-SIZE-DIFFERENCE-ALERT", 3, 0, false);
        declareFunction(me, "new_file_existence_difference_alert", "NEW-FILE-EXISTENCE-DIFFERENCE-ALERT", 2, 0, false);
        declareFunction(me, "ignore_filename_due_to_regexP", "IGNORE-FILENAME-DUE-TO-REGEX?", 1, 0, false);
        declareFunction(me, "string_matches_any_regexP", "STRING-MATCHES-ANY-REGEX?", 2, 0, false);
        declareFunction(me, "write_directory_file_size_log", "WRITE-DIRECTORY-FILE-SIZE-LOG", 2, 0, false);
        declareFunction(me, "read_directory_file_size_log", "READ-DIRECTORY-FILE-SIZE-LOG", 1, 0, false);
        declareFunction(me, "compare_file_size_logs", "COMPARE-FILE-SIZE-LOGS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_cyc_testing_utilities_file() {
        defparameter("*DEFAULT-RERUN-CRASHING-TESTS*", ONE_INTEGER);
        defparameter("*CYC-TEST-WRITE-IMAGE-DIRECTORY*", NIL);
        deflexical("*TESTS-THAT-DONT-WORK-WITH-REAL-TIME-PRUNING*", $list111);
        defparameter("*FILE-SIZE-CHANGE-TOLERANCE*", $float$1_2);
        defparameter("*FILE-SIZE-IGNORE-REGEXES*", $list113);
        deflexical("*SIZE-LOGS-DIRECTORY*", $str96$);
        return NIL;
    }

    public static SubLObject setup_cyc_testing_utilities_file() {
        register_macro_helper(RUN_CYC_TEST_INT, RUN_CYC_TEST);
        register_macro_helper(RUN_CYC_TEST_IN_RANGE_INT, RUN_CYC_TEST);
        register_macro_helper(RUN_CYC_TEST_PARALLEL_INT, RUN_CYC_TEST_PARALLEL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cyc_testing_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_cyc_testing_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyc_testing_utilities_file();
    }

    static {





































































































































    }
}

/**
 * Total time: 746 ms synthetic
 */
