package com.cyc.cycjava.cycl.cyc_testing;

import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_wide_opcode;
import static com.cyc.cycjava.cycl.cfasl.register_wide_cfasl_opcode_input_function;
import static com.cyc.cycjava.cycl.control_vars.non_tiny_kb_loadedP;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_comment;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_kb;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_name;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_owner;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_p;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_tuples_invalid_constants;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_tuples_mentioning_some_invalid_constant;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_workingP;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.test_cases_of_class;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_testing extends SubLTranslatedFile {
	public static final SubLFile me = new cyc_testing();

	public static final String myName = "com.cyc.cycjava.cycl.cyc_testing";

	public static final String myFingerPrint = "23520720437c6009feaad1eceef5734e29e4b1368630385d8d6771dc8c766361";

	// defparameter
	// Definitions
	public static final SubLSymbol $it_output_format$ = makeSymbol("*IT-OUTPUT-FORMAT*");

	// defparameter
	// Set this to T if you want to debug the tests (not catch errors)
	public static final SubLSymbol $cyc_test_debugP$ = makeSymbol("*CYC-TEST-DEBUG?*");

	// defparameter
	/**
	 * Whether to run tests that only require the tiny KB in the full KB. The
	 * default is t so that it's easy to run all tests on a full KB, but should be
	 * bound to NIL when testing on both a tiny and a full KB.
	 */
	public static final SubLSymbol $run_tiny_kb_tests_in_full_kbP$ = makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*");

	// defparameter
	/**
	 * Whether to test real-time while-inference-is-running pruning. This will force
	 * :compute-answer-justifications? to NIL and will only run tests where that
	 * makes sense.
	 */
	private static final SubLSymbol $test_real_time_pruningP$ = makeSymbol("*TEST-REAL-TIME-PRUNING?*");

	// deflexical
	// The possible levels of verbosity for Cyc tests.
	private static final SubLSymbol $cyc_test_verbosity_levels$ = makeSymbol("*CYC-TEST-VERBOSITY-LEVELS*");

	// defparameter
	/**
	 * Bound to the current file being loaded, so that the tests can know what file
	 * they're in
	 */
	public static final SubLSymbol $cyc_test_filename$ = makeSymbol("*CYC-TEST-FILENAME*");

	// defparameter
	public static final SubLSymbol $cyc_base_testdcl$ = makeSymbol("*CYC-BASE-TESTDCL*");

	// defparameter
	/**
	 * Whether we should warn if a test has the same name as another test. This
	 * often happens when tests are redefined or updated, so we only want to do it
	 * when we're loading tests from a clean initial state.
	 */
	public static final SubLSymbol $warn_on_duplicate_cyc_test_namesP$ = makeSymbol("*WARN-ON-DUPLICATE-CYC-TEST-NAMES?*");

	// defparameter
	public static final SubLSymbol $only_undeclare_tests_and_test_filesP$ = makeSymbol("*ONLY-UNDECLARE-TESTS-AND-TEST-FILES?*");

	// deflexical
	// Test results that mean that the test succeeded.
	private static final SubLSymbol $cyc_test_result_success_values$ = makeSymbol("*CYC-TEST-RESULT-SUCCESS-VALUES*");

	// deflexical
	// Test results that mean that the test failed.
	private static final SubLSymbol $cyc_test_result_failure_values$ = makeSymbol("*CYC-TEST-RESULT-FAILURE-VALUES*");

	// deflexical
	/**
	 * Test results that mean that the test was ignored, or that the test result
	 * should be ignored, and counted as neither a success nor a failure.
	 */
	private static final SubLSymbol $cyc_test_result_ignore_values$ = makeSymbol("*CYC-TEST-RESULT-IGNORE-VALUES*");

	// deflexical
	// All possible results for tests
	private static final SubLSymbol $cyc_test_result_values$ = makeSymbol("*CYC-TEST-RESULT-VALUES*");

	// deflexical
	/**
	 * The table of known Cyc test types. Column 1 is a uniquely identifying
	 * keyword. Column 2 is a string description of the test type.
	 */
	private static final SubLSymbol $cyc_test_type_table$ = makeSymbol("*CYC-TEST-TYPE-TABLE*");

	// defconstant
	public static final SubLSymbol $dtp_cyc_test$ = makeSymbol("*DTP-CYC-TEST*");

	// defparameter
	public static final SubLSymbol $print_post_build_test_summary_timestampP$ = makeSymbol("*PRINT-POST-BUILD-TEST-SUMMARY-TIMESTAMP?*");

	// defconstant
	private static final SubLSymbol $cfasl_wide_opcode_cyc_test$ = makeSymbol("*CFASL-WIDE-OPCODE-CYC-TEST*");

	// defconstant
	public static final SubLSymbol $dtp_cyc_test_file$ = makeSymbol("*DTP-CYC-TEST-FILE*");

	public static final SubLList $list1 = list(makeKeyword("SILENT"), makeKeyword("TERSE"), makeKeyword("VERBOSE"));

	private static final SubLString $$$testdcl = makeString("testdcl");

	public static final SubLList $list3 = list(makeKeyword("TINY"), makeKeyword("FULL"), makeKeyword("BOTH"));

	public static final SubLList $list4 = list(makeKeyword("STANDARD"), makeKeyword("POST-BUILD"));

	public static final SubLList $list5 = list(makeKeyword("SUCCESS"), makeKeyword("REGRESSION-SUCCESS"));

	public static final SubLList $list6 = list(makeKeyword("FAILURE"), makeKeyword("REGRESSION-FAILURE"), makeKeyword("ABNORMAL"), makeKeyword("ERROR"));

	public static final SubLList $list7 = list(makeKeyword("NON-REGRESSION-SUCCESS"), makeKeyword("NON-REGRESSION-FAILURE"), makeKeyword("NOT-RUN"), makeKeyword("INVALID"));

	private static final SubLList $list8 = list(list(makeKeyword("IUT"), makeString("inference unit test")), list(makeKeyword("IT"), makeString("inference test")), list(makeKeyword("RMT"), makeString("removal module test")), list(makeKeyword("TMT"), makeString("transformation module test")), list(makeKeyword("RMCT"), makeString("removal module cost test")),
			list(makeKeyword("ERT"), makeString("evaluatable relation test")), list(makeKeyword("TCT"), makeString("test case table")), list(makeKeyword("KCT"), makeString("KB content test")));

	private static final SubLSymbol CYC_TEST_TYPE_P = makeSymbol("CYC-TEST-TYPE-P");

	public static final SubLList $list12 = list(list(makeSymbol("CYC-TEST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLList $list13 = list(makeKeyword("DONE"));

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	public static final SubLList $list17 = list(makeSymbol("CYC-TESTS"));

	public static final SubLList $list18 = list(list(makeSymbol("CYC-TEST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("Iterating over all Cyc tests"))), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLString $$$Iterating_over_all_Cyc_tests = makeString("Iterating over all Cyc tests");

	public static final SubLSymbol PROGRESS_CDOLIST = makeSymbol("PROGRESS-CDOLIST");

	public static final SubLSymbol $cyc_test_by_name$ = makeSymbol("*CYC-TEST-BY-NAME*");

	private static final SubLInteger $int$212 = makeInteger(212);

	public static final SubLSymbol $cyc_test_by_dwimmed_name$ = makeSymbol("*CYC-TEST-BY-DWIMMED-NAME*");

	public static final SubLString $str24$A_Cyc_test_named__a_already_exist = makeString("A Cyc test named ~a already existed; overwriting");

	public static final SubLSymbol REMOVAL_MODULE_TEST_P = makeSymbol("REMOVAL-MODULE-TEST-P");

	public static final SubLSymbol REMOVAL_MODULE_TEST_PREDICATE = makeSymbol("REMOVAL-MODULE-TEST-PREDICATE");

	public static final SubLSymbol REMOVAL_MODULE_COST_TEST_P = makeSymbol("REMOVAL-MODULE-COST-TEST-P");

	public static final SubLSymbol REMOVAL_MODULE_COST_TEST_PREDICATE = makeSymbol("REMOVAL-MODULE-COST-TEST-PREDICATE");

	public static final SubLSymbol CYC_TEST = makeSymbol("CYC-TEST");

	public static final SubLSymbol CYC_TEST_P = makeSymbol("CYC-TEST-P");

	public static final SubLList $list31 = list(makeSymbol("FILE"), makeSymbol("GUTS"));

	public static final SubLList $list32 = list(makeKeyword("FILE"), makeKeyword("GUTS"));

	public static final SubLList $list33 = list(makeSymbol("CT-FILE"), makeSymbol("CT-GUTS"));

	public static final SubLList $list34 = list(makeSymbol("_CSETF-CT-FILE"), makeSymbol("_CSETF-CT-GUTS"));

	public static final SubLSymbol PRINT_CYC_TEST = makeSymbol("PRINT-CYC-TEST");

	public static final SubLSymbol CYC_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYC-TEST-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list37 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CYC-TEST-P"));

	private static final SubLSymbol CT_FILE = makeSymbol("CT-FILE");

	private static final SubLSymbol _CSETF_CT_FILE = makeSymbol("_CSETF-CT-FILE");

	private static final SubLSymbol CT_GUTS = makeSymbol("CT-GUTS");

	private static final SubLSymbol _CSETF_CT_GUTS = makeSymbol("_CSETF-CT-GUTS");

	private static final SubLString $str44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	private static final SubLSymbol MAKE_CYC_TEST = makeSymbol("MAKE-CYC-TEST");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CYC_TEST_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYC-TEST-METHOD");

	private static final SubLString $str50$__CYC_TEST__a__a_ = makeString("#<CYC-TEST:~a:~a>");

	private static final SubLString $str51$__CYC_TEST__a_ = makeString("#<CYC-TEST:~a>");

	private static final SubLSymbol CYC_TEST_GUTS_P = makeSymbol("CYC-TEST-GUTS-P");

	private static final SubLString $str54$_s_is_not_a_CYC_TEST_GUTS_P = makeString("~s is not a CYC-TEST-GUTS-P");

	private static final SubLSymbol GENERIC_TEST_CASE_TABLE_P = makeSymbol("GENERIC-TEST-CASE-TABLE-P");

	private static final SubLSymbol CYC_TEST_NAME = makeSymbol("CYC-TEST-NAME");

	private static final SubLString $str57$Cyc_test_of_unexpected_type___s = makeString("Cyc test of unexpected type: ~s");

	private static final SubLString $str67$___A__S__S__S____3f___OWNER__S__ = makeString("~&~A ~S ~S ~S (~,3f) :OWNER ~S~%");

	private static final SubLString $str68$___S__S__S____3f___OWNER__S__ = makeString("~&~S ~S ~S (~,3f) :OWNER ~S~%");

	private static final SubLSymbol CYC_TEST_TYPE_SPEC_P = makeSymbol("CYC-TEST-TYPE-SPEC-P");

	private static final SubLSymbol $sym73$CYC_TEST_WORKING_ = makeSymbol("CYC-TEST-WORKING?");

	private static final SubLSymbol CYC_TEST_TYPE = makeSymbol("CYC-TEST-TYPE");

	private static final SubLSymbol FIND_CYC_TEST = makeSymbol("FIND-CYC-TEST");

	private static final SubLInteger $int$514 = makeInteger(514);

	private static final SubLSymbol CFASL_INPUT_CYC_TEST = makeSymbol("CFASL-INPUT-CYC-TEST");

	private static final SubLSymbol CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD");

	private static final SubLSymbol CYC_TEST_RESULT_P = makeSymbol("CYC-TEST-RESULT-P");

	private static final SubLSymbol CYC_TEST_RUN_P = makeSymbol("CYC-TEST-RUN-P");

	private static final SubLList $list83 = list(makeKeyword("NOT-RUN"), makeKeyword("INVALID"));

	private static final SubLString $str87$___S__S_____S___S_ = makeString("~&~S ~S -> ~S (~S)");

	private static final SubLString $str89$Unknown_output_format__A = makeString("Unknown output format ~A");

	private static final SubLString $$$_ = makeString(" ");

	private static final SubLString $$$Unknown_output_format_ = makeString("Unknown output format ");

	private static final SubLSymbol $cyc_test_files$ = makeSymbol("*CYC-TEST-FILES*");

	private static final SubLList $list94 = list(list(makeSymbol("CYC-TEST-FILE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list96 = list(list(makeSymbol("CYC-TEST-FILES")));

	private static final SubLList $list97 = list(list(makeSymbol("CYC-TEST-FILE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("Iterating over all test files"))), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $$$Iterating_over_all_test_files = makeString("Iterating over all test files");

	private static final SubLList $list99 = list(makeSymbol("CYC-TEST-FILES"));

	private static final SubLSymbol CYC_TEST_FILE = makeSymbol("CYC-TEST-FILE");

	private static final SubLSymbol CYC_TEST_FILE_P = makeSymbol("CYC-TEST-FILE-P");

	private static final SubLList $list102 = list(makeSymbol("FILENAME"), makeSymbol("KB"));

	private static final SubLList $list103 = list(makeKeyword("FILENAME"), makeKeyword("KB"));

	private static final SubLList $list104 = list(makeSymbol("CTF-FILENAME"), makeSymbol("CTF-KB"));

	private static final SubLList $list105 = list(makeSymbol("_CSETF-CTF-FILENAME"), makeSymbol("_CSETF-CTF-KB"));

	private static final SubLSymbol PRINT_CYC_TEST_FILE = makeSymbol("PRINT-CYC-TEST-FILE");

	private static final SubLSymbol CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list108 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CYC-TEST-FILE-P"));

	private static final SubLSymbol CTF_FILENAME = makeSymbol("CTF-FILENAME");

	private static final SubLSymbol _CSETF_CTF_FILENAME = makeSymbol("_CSETF-CTF-FILENAME");

	private static final SubLSymbol CTF_KB = makeSymbol("CTF-KB");

	private static final SubLSymbol _CSETF_CTF_KB = makeSymbol("_CSETF-CTF-KB");

	private static final SubLSymbol MAKE_CYC_TEST_FILE = makeSymbol("MAKE-CYC-TEST-FILE");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CYC_TEST_FILE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYC-TEST-FILE-METHOD");

	private static final SubLString $str117$__CTF__a_ = makeString("#<CTF:~a>");

	private static final SubLSymbol $most_recent_cyc_test_runs$ = makeSymbol("*MOST-RECENT-CYC-TEST-RUNS*");

	private static final SubLSymbol $most_recent_cyc_test_file_load_failures$ = makeSymbol("*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*");

	private static final SubLSymbol FAILING_CYC_TEST_RUN_P = makeSymbol("FAILING-CYC-TEST-RUN-P");

	private static final SubLSymbol CYC_TEST_RUN_CYC_TEST = makeSymbol("CYC-TEST-RUN-CYC-TEST");

	private static final SubLList $list123 = list(new SubLObject[] { makeSymbol("PATH"), makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("TERSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")),
			list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(makeSymbol("QUOTE"), makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))), list(makeSymbol("RUN-TEST-CASE-TABLES?"), T), list(makeSymbol("RETURN-TEST-RUNS?"), NIL), list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL), list(makeSymbol("PROGRESS-FILE"), NIL), list(makeSymbol("RERUN-CRASHING-TESTS"), NIL) });

	private static final SubLList $list124 = list(
			new SubLObject[] { makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"), makeKeyword("RUN-TEST-CASE-TABLES?"), makeKeyword("RETURN-TEST-RUNS?"), makeKeyword("TYPE"), makeKeyword("RUN-NON-WORKING-TESTS"), makeKeyword("PROGRESS-FILE"), makeKeyword("RERUN-CRASHING-TESTS") });

	private static final SubLSymbol $standard_output$ = makeSymbol("*STANDARD-OUTPUT*");

	private static final SubLSymbol $kw129$STOP_AT_FIRST_FAILURE_ = makeKeyword("STOP-AT-FIRST-FAILURE?");

	private static final SubLSymbol $kw131$RUN_TINY_KB_TESTS_IN_FULL_KB_ = makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?");

	private static final SubLSymbol $sym132$_RUN_TINY_KB_TESTS_IN_FULL_KB__ = makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*");

	private static final SubLSymbol $kw133$RUN_TEST_CASE_TABLES_ = makeKeyword("RUN-TEST-CASE-TABLES?");

	private static final SubLSymbol $kw134$RETURN_TEST_RUNS_ = makeKeyword("RETURN-TEST-RUNS?");

	private static final SubLSymbol $RUN_NON_WORKING_TESTS = makeKeyword("RUN-NON-WORKING-TESTS");

	private static final SubLSymbol $RERUN_CRASHING_TESTS = makeKeyword("RERUN-CRASHING-TESTS");

	private static final SubLSymbol RUN_ALL_CYC_TESTS_INT = makeSymbol("RUN-ALL-CYC-TESTS-INT");

	public static final SubLList $list140 = list(new SubLObject[] { makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("VERBOSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("RETURN-TEST-RUNS?"), NIL),
			list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL), list(makeSymbol("PROGRESS-FILE"), NIL), list(makeSymbol("RERUN-CRASHING-TESTS"), NIL) });

	private static final SubLList $list141 = list(new SubLObject[] { makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RETURN-TEST-RUNS?"), makeKeyword("TYPE"), makeKeyword("RUN-NON-WORKING-TESTS"), makeKeyword("PROGRESS-FILE"), makeKeyword("RERUN-CRASHING-TESTS") });

	private static final SubLSymbol RUN_ALL_LOADED_CYC_TESTS = makeSymbol("RUN-ALL-LOADED-CYC-TESTS");

	private static final SubLList $list145 = list(makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("KB"));

	private static final SubLList $list146 = list(makeKeyword("KB"));

	private static final SubLSymbol DECLARE_CYC_TEST_FILE_INT = makeSymbol("DECLARE-CYC-TEST-FILE-INT");

	private static final SubLList $list148 = list(new SubLObject[] { makeSymbol("NAMES"), makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("VERBOSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("RETURN-TEST-RUNS?"), NIL),
			list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL) });

	private static final SubLList $list149 = list(makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RETURN-TEST-RUNS?"), makeKeyword("TYPE"), makeKeyword("RUN-NON-WORKING-TESTS"));

	private static final SubLSymbol FIND_CYC_TESTS_BY_NAME = makeSymbol("FIND-CYC-TESTS-BY-NAME");

	private static final SubLSymbol CYC_TEST_VERBOSITY_LEVEL_P = makeSymbol("CYC-TEST-VERBOSITY-LEVEL-P");

	private static final SubLString $str154$could_not_load__a_lisp_from__s = makeString("could not load ~a.lisp from ~s");

	private static final SubLString $$$Loading_test_files = makeString("Loading test files");

	private static final SubLString $$$cdolist = makeString("cdolist");

	private static final SubLString $str157$_lisp = makeString(".lisp");

	private static final SubLString $str158$Invalid_phase__A_of__A_specified_ = makeString("Invalid phase ~A of ~A specified.");

	private static final SubLSymbol DECLARE_CYC_TEST_FILE = makeSymbol("DECLARE-CYC-TEST-FILE");

	private static final SubLSymbol TINY_KB_CYC_TEST_P = makeSymbol("TINY-KB-CYC-TEST-P");

	private static final SubLSymbol SERVER_SUMMARY = makeSymbol("SERVER-SUMMARY");

	public static final SubLList $list167 = list(list(NIL, NIL));

	private static final SubLSymbol KB_STATISTICS = makeSymbol("KB-STATISTICS");

	private static final SubLSymbol CYC_MEMORY_HOGS = makeSymbol("CYC-MEMORY-HOGS");

	private static final SubLSymbol ALL_CYC_TESTS_ARE_VALID = makeSymbol("ALL-CYC-TESTS-ARE-VALID");

	public static SubLObject testing_real_time_pruningP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $test_real_time_pruningP$.getDynamicValue(thread);
	}

	public static SubLObject cyc_test_kb_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $list3, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject cyc_test_verbosity_level_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $cyc_test_verbosity_levels$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
	}

	public static SubLObject cyc_test_output_format_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $list4, symbol_function(EQ), UNPROVIDED);
	}

	public static SubLObject cyc_test_result_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $cyc_test_result_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject cyc_test_success_result_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $cyc_test_result_success_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject cyc_test_failure_result_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $cyc_test_result_failure_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject cyc_test_ignore_result_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $cyc_test_result_ignore_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject cyc_test_result_L(final SubLObject result1, final SubLObject result2) {
		return list_utilities.position_L(result1, result2, $cyc_test_result_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject cyc_test_type_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $cyc_test_type_table$.getGlobalValue(), symbol_function(EQ), symbol_function(FIRST));
	}

	public static SubLObject cyc_test_type_spec_p(final SubLObject v_object) {
		return makeBoolean(($ALL == v_object) || (NIL != cyc_test_type_p(v_object)));
	}

	public static SubLObject cyc_test_type_pretty_name(final SubLObject test_type) {
		assert NIL != cyc_test_type_p(test_type) : "cyc_testing.cyc_test_type_p(test_type) " + "CommonSymbols.NIL != cyc_testing.cyc_test_type_p(test_type) " + test_type;
		return list_utilities.alist_lookup($cyc_test_type_table$.getGlobalValue(), test_type, UNPROVIDED, UNPROVIDED).first();
	}

	public static SubLObject cyc_tests() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $cyc_tests$.getDynamicValue(thread);
	}

	public static SubLObject undefine_all_cyc_tests() {
		$cyc_tests$.setDynamicValue(NIL);
		clrhash($cyc_test_by_name$.getGlobalValue());
		clrhash($cyc_test_by_dwimmed_name$.getGlobalValue());
		return NIL;
	}

	public static SubLObject do_cyc_tests(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list12);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject cyc_test = NIL;
		destructuring_bind_must_consp(current, datum, $list12);
		cyc_test = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$1 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list12);
			current_$1 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list12);
			if (NIL == member(current_$1, $list13, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$1 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list12);
		}
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		return listS(CSOME, list(cyc_test, $list17, done), append(body, NIL));
	}

	public static SubLObject progress_do_cyc_tests(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list18);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject cyc_test = NIL;
		destructuring_bind_must_consp(current, datum, $list18);
		cyc_test = current.first();
		current = current.rest();
		final SubLObject message = (current.isCons()) ? current.first() : $$$Iterating_over_all_Cyc_tests;
		destructuring_bind_must_listp(current, datum, $list18);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(PROGRESS_CDOLIST, list(cyc_test, $list17, message), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list18);
		return NIL;
	}

	public static SubLObject cyc_test_count() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return length($cyc_tests$.getDynamicValue(thread));
	}

	public static SubLObject no_cyc_tests_definedP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean(NIL == $cyc_tests$.getDynamicValue(thread));
	}

	public static SubLObject index_cyc_test_by_name(final SubLObject ct, final SubLObject name) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != $warn_on_duplicate_cyc_test_namesP$.getDynamicValue(thread)) && (NIL != gethash(name, $cyc_test_by_name$.getGlobalValue(), UNPROVIDED))) {
			Errors.warn($str24$A_Cyc_test_named__a_already_exist, name);
		}
		sethash(name, $cyc_test_by_name$.getGlobalValue(), ct);
		sethash(name, $cyc_test_by_dwimmed_name$.getGlobalValue(), nconc(gethash(name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED), list(ct)));
		if (name.isCons()) {
			my_pushnew_to_end_hash(name.first(), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
		}
		if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
			final SubLObject rmt = cyc_test_guts(ct);
			if (NIL != funcall(REMOVAL_MODULE_TEST_P, rmt)) {
				my_pushnew_to_end_hash(funcall(REMOVAL_MODULE_TEST_PREDICATE, rmt), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
			}
		}
		if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
			final SubLObject rmct = cyc_test_guts(ct);
			if (NIL != funcall(REMOVAL_MODULE_COST_TEST_P, rmct)) {
				my_pushnew_to_end_hash(funcall(REMOVAL_MODULE_COST_TEST_PREDICATE, rmct), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
			}
		}
		return ct;
	}

	public static SubLObject unindex_cyc_test_by_name(final SubLObject ct, final SubLObject name) {
		remhash(name, $cyc_test_by_name$.getGlobalValue());
		my_delete_value_from_hash(name, ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
		if (name.isCons()) {
			my_delete_value_from_hash(name.first(), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
		}
		if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
			final SubLObject rmt = cyc_test_guts(ct);
			if (NIL != funcall(REMOVAL_MODULE_TEST_P, rmt)) {
				my_delete_value_from_hash(funcall(REMOVAL_MODULE_TEST_PREDICATE, rmt), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
			}
		}
		if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
			final SubLObject rmct = cyc_test_guts(ct);
			if (NIL != funcall(REMOVAL_MODULE_COST_TEST_P, rmct)) {
				my_delete_value_from_hash(funcall(REMOVAL_MODULE_COST_TEST_PREDICATE, rmct), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
			}
		}
		return ct;
	}

	public static SubLObject my_pushnew_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
		return sethash(key, table, nconc(delete(item, gethash(key, table, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list(item)));
	}

	public static SubLObject my_delete_value_from_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
		return sethash(key, table, delete(item, gethash(key, table, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
	}

	public static SubLObject index_all_cyc_tests_by_name() {
		SubLObject csome_list_var = cyc_tests();
		SubLObject ct = NIL;
		ct = csome_list_var.first();
		while (NIL != csome_list_var) {
			index_cyc_test_by_name(ct, cyc_test_name(ct));
			csome_list_var = csome_list_var.rest();
			ct = csome_list_var.first();
		}
		return NIL;
	}

	public static SubLObject cyc_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		print_cyc_test(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject cyc_test_p(final SubLObject v_object) {
		return v_object.getJavaClass() == $cyc_test_native.class ? T : NIL;
	}

	public static SubLObject ct_file(final SubLObject v_object) {
		assert NIL != cyc_test_p(v_object) : "cyc_testing.cyc_test_p error :" + v_object;
		return v_object.getField2();
	}

	public static SubLObject ct_guts(final SubLObject v_object) {
		assert NIL != cyc_test_p(v_object) : "cyc_testing.cyc_test_p error :" + v_object;
		return v_object.getField3();
	}

	public static SubLObject _csetf_ct_file(final SubLObject v_object, final SubLObject value) {
		assert NIL != cyc_test_p(v_object) : "cyc_testing.cyc_test_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_ct_guts(final SubLObject v_object, final SubLObject value) {
		assert NIL != cyc_test_p(v_object) : "cyc_testing.cyc_test_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static SubLObject make_cyc_test(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new $cyc_test_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($FILE)) {
				_csetf_ct_file(v_new, current_value);
			} else if (pcase_var.eql($GUTS)) {
				_csetf_ct_guts(v_new, current_value);
			} else {
				Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_cyc_test(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, MAKE_CYC_TEST, TWO_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $FILE, ct_file(obj));
		funcall(visitor_fn, obj, $SLOT, $GUTS, ct_guts(obj));
		funcall(visitor_fn, obj, $END, MAKE_CYC_TEST, TWO_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_cyc_test_method(final SubLObject obj, final SubLObject visitor_fn) {
		return visit_defstruct_cyc_test(obj, visitor_fn);
	}

	public static SubLObject print_cyc_test(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
		final SubLObject file = ct_file(v_object);
		if (NIL != file) {
			format(stream, $str50$__CYC_TEST__a__a_, Strings.string_upcase(file, UNPROVIDED, UNPROVIDED), ct_guts(v_object));
		} else {
			format(stream, $str51$__CYC_TEST__a_, ct_guts(v_object));
		}
		return v_object;
	}

	public static SubLObject new_cyc_test(final SubLObject file, final SubLObject guts) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (((NIL != file) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(file))) {
			throw new AssertionError(file);
		}
		if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
			if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == funcall(CYC_TEST_GUTS_P, guts))) {
				Errors.error($str54$_s_is_not_a_CYC_TEST_GUTS_P, guts);
			}
		} else {
			assert NIL != generic_test_case_table_p(guts) : "generic_testing.generic_test_case_table_p(guts) " + "CommonSymbols.NIL != generic_testing.generic_test_case_table_p(guts) " + guts;
		}
		final SubLObject ct = make_cyc_test(UNPROVIDED);
		_csetf_ct_file(ct, file);
		_csetf_ct_guts(ct, guts);
		final SubLObject name = (NIL != cyc_testing_initialization.cyc_tests_initializedP()) ? funcall(CYC_TEST_NAME, ct) : generic_test_case_table_name(guts);
		final SubLObject existing_ct = find_cyc_test_by_exact_name(name);
		if (NIL != existing_ct) {
			$cyc_tests$.setDynamicValue(delete(existing_ct, $cyc_tests$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			unindex_cyc_test_by_name(existing_ct, name);
		}
		final SubLObject new_cons = cons(ct, NIL);
		final SubLObject list = $cyc_tests$.getDynamicValue(thread);
		if (NIL != list) {
			subl_macros.rplacd_last(list, new_cons);
		} else {
			$cyc_tests$.setDynamicValue(new_cons, thread);
		}
		index_cyc_test_by_name(ct, name);
		return ct;
	}

	public static SubLObject undeclare_cyc_test(final SubLObject test_name) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject existing_ct = find_cyc_test_by_exact_name(test_name);
		if (NIL != existing_ct) {
			$cyc_tests$.setDynamicValue(delete(existing_ct, $cyc_tests$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			unindex_cyc_test_by_name(existing_ct, test_name);
			return T;
		}
		return NIL;
	}

	public static SubLObject cyc_test_file(final SubLObject ct) {
		return ct_file(ct);
	}

	public static SubLObject cyc_test_guts(final SubLObject ct) {
		return ct_guts(ct);
	}

	public static SubLObject cyc_test_type(final SubLObject ct) {
		final SubLObject type = cyc_test_type_permissive(ct);
		if (NIL != type) {
			return type;
		}
		return Errors.error($str57$Cyc_test_of_unexpected_type___s, ct);
	}

	public static SubLObject cyc_test_guts_p(final SubLObject v_object) {
		return list_utilities.sublisp_boolean(cyc_test_guts_type(v_object));
	}

	public static SubLObject cyc_test_type_permissive(final SubLObject ct) {
		final SubLObject guts = cyc_test_guts(ct);
		return cyc_test_guts_type(guts);
	}

	public static SubLObject cyc_test_guts_type(final SubLObject guts) {
		if (NIL != generic_test_case_table_p(guts)) {
			return $TCT;
		}
		if (NIL != inference_unit_tests.inference_unit_test_p(guts)) {
			return $IUT;
		}
		if (NIL != removal_module_tests.removal_module_test_p(guts)) {
			return $RMT;
		}
		if (NIL != removal_module_cost_tests.removal_module_cost_test_p(guts)) {
			return $RMCT;
		}
		if (NIL != transformation_module_tests.transformation_module_test_p(guts)) {
			return $TMT;
		}
		if (NIL != evaluatable_relation_tests.evaluatable_relation_test_p(guts)) {
			return $ERT;
		}
		if (NIL != inference_testing.inference_test_p(guts)) {
			return $IT;
		}
		if (NIL != kct_utils.kct_test_spec_permissive_p(guts)) {
			return $KCT;
		}
		return NIL;
	}

	public static SubLObject cyc_test_name(final SubLObject ct) {
		final SubLObject guts = cyc_test_guts(ct);
		final SubLObject pcase_var = cyc_test_type(ct);
		if (pcase_var.eql($IUT)) {
			return inference_unit_tests.inference_unit_test_name(guts);
		}
		if (pcase_var.eql($IT)) {
			return guts;
		}
		if (pcase_var.eql($RMT)) {
			return removal_module_tests.removal_module_test_name(guts);
		}
		if (pcase_var.eql($TMT)) {
			return transformation_module_tests.transformation_module_test_name(guts);
		}
		if (pcase_var.eql($RMCT)) {
			return removal_module_cost_tests.removal_module_cost_test_name(guts);
		}
		if (pcase_var.eql($ERT)) {
			return evaluatable_relation_tests.evaluatable_relation_test_name(guts);
		}
		if (pcase_var.eql($TCT)) {
			return generic_test_case_table_name(guts);
		}
		if (pcase_var.eql($KCT)) {
			return kct_cyc_testing.kct_test_spec_name(guts);
		}
		return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
	}

	public static SubLObject cyc_test_id(final SubLObject ct) {
		final SubLObject guts = cyc_test_guts(ct);
		final SubLObject pcase_var = cyc_test_type(ct);
		if (pcase_var.eql($IUT)) {
			return NIL;
		}
		if (pcase_var.eql($IT)) {
			return NIL;
		}
		if (pcase_var.eql($RMT)) {
			return removal_module_tests.removal_module_test_id(guts);
		}
		if (pcase_var.eql($TMT)) {
			return transformation_module_tests.transformation_module_test_id(guts);
		}
		if (pcase_var.eql($RMCT)) {
			return removal_module_cost_tests.removal_module_cost_test_id(guts);
		}
		if (pcase_var.eql($ERT)) {
			return evaluatable_relation_tests.evaluatable_relation_test_id(guts);
		}
		if (pcase_var.eql($TCT)) {
			return NIL;
		}
		if (pcase_var.eql($KCT)) {
			return NIL;
		}
		return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
	}

	public static SubLObject cyc_test_kb(final SubLObject ct) {
		final SubLObject guts = cyc_test_guts(ct);
		final SubLObject pcase_var = cyc_test_type(ct);
		if (pcase_var.eql($IUT)) {
			return inference_unit_tests.inference_unit_test_kb(guts);
		}
		if (pcase_var.eql($IT)) {
			return inference_testing.inference_test_kb(guts);
		}
		if (pcase_var.eql($RMT)) {
			return removal_module_tests.removal_module_test_kb(guts);
		}
		if (pcase_var.eql($TMT)) {
			return transformation_module_tests.transformation_module_test_kb(guts);
		}
		if (pcase_var.eql($RMCT)) {
			return removal_module_cost_tests.removal_module_cost_test_kb(guts);
		}
		if (pcase_var.eql($ERT)) {
			return evaluatable_relation_tests.evaluatable_relation_test_kb(guts);
		}
		if (pcase_var.eql($TCT)) {
			return generic_test_case_table_kb(guts);
		}
		if (pcase_var.eql($KCT)) {
			return kct_cyc_testing.kct_test_spec_kb(guts);
		}
		return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
	}

	public static SubLObject cyc_test_owner(final SubLObject ct) {
		final SubLObject guts = cyc_test_guts(ct);
		final SubLObject pcase_var = cyc_test_type(ct);
		if (pcase_var.eql($IUT)) {
			return inference_unit_tests.inference_unit_test_owner(guts);
		}
		if (pcase_var.eql($IT)) {
			return inference_testing.inference_test_owner(guts);
		}
		if (pcase_var.eql($RMT)) {
			return removal_module_tests.removal_module_test_owner(guts);
		}
		if (pcase_var.eql($TMT)) {
			return transformation_module_tests.transformation_module_test_owner(guts);
		}
		if (pcase_var.eql($RMCT)) {
			return removal_module_cost_tests.removal_module_cost_test_owner(guts);
		}
		if (pcase_var.eql($ERT)) {
			return evaluatable_relation_tests.evaluatable_relation_test_owner(guts);
		}
		if (pcase_var.eql($TCT)) {
			return generic_test_case_table_owner(guts);
		}
		if (pcase_var.eql($KCT)) {
			return kct_cyc_testing.kct_test_spec_owner(guts);
		}
		return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
	}

	public static SubLObject cyc_test_workingP(final SubLObject ct) {
		final SubLObject guts = cyc_test_guts(ct);
		final SubLObject pcase_var = cyc_test_type(ct);
		if (pcase_var.eql($IUT)) {
			return inference_unit_tests.inference_unit_test_workingP(guts);
		}
		if (pcase_var.eql($IT)) {
			return inference_testing.inference_test_workingP(guts);
		}
		if (pcase_var.eql($RMT)) {
			return removal_module_tests.removal_module_test_workingP(guts);
		}
		if (pcase_var.eql($TMT)) {
			return transformation_module_tests.transformation_module_test_workingP(guts);
		}
		if (pcase_var.eql($RMCT)) {
			return removal_module_cost_tests.removal_module_cost_test_workingP(guts);
		}
		if (pcase_var.eql($ERT)) {
			return evaluatable_relation_tests.evaluatable_relation_test_workingP(guts);
		}
		if (pcase_var.eql($TCT)) {
			return generic_test_case_table_workingP(guts);
		}
		if (pcase_var.eql($KCT)) {
			return kct_cyc_testing.kct_test_spec_workingP(guts);
		}
		return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
	}

	public static SubLObject cyc_test_comment(final SubLObject ct) {
		final SubLObject guts = cyc_test_guts(ct);
		final SubLObject pcase_var = cyc_test_type(ct);
		if (pcase_var.eql($IUT)) {
			return inference_unit_tests.inference_unit_test_comment(guts);
		}
		if (pcase_var.eql($IT)) {
			return inference_testing.inference_test_comment(guts);
		}
		if (pcase_var.eql($RMT)) {
			return removal_module_tests.removal_module_test_comment(guts);
		}
		if (pcase_var.eql($TMT)) {
			return transformation_module_tests.transformation_module_test_comment(guts);
		}
		if (pcase_var.eql($RMCT)) {
			return removal_module_cost_tests.removal_module_cost_test_comment(guts);
		}
		if (pcase_var.eql($ERT)) {
			return evaluatable_relation_tests.evaluatable_relation_test_comment(guts);
		}
		if (pcase_var.eql($TCT)) {
			return generic_test_case_table_comment(guts);
		}
		if (pcase_var.eql($KCT)) {
			return kct_cyc_testing.kct_test_spec_comment(guts);
		}
		return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
	}

	public static SubLObject cyc_test_project(final SubLObject ct) {
		final SubLObject guts = cyc_test_guts(ct);
		final SubLObject pcase_var = cyc_test_type(ct);
		if (pcase_var.eql($IUT)) {
			return NIL;
		}
		if (pcase_var.eql($IT)) {
			return NIL;
		}
		if (pcase_var.eql($RMT)) {
			return NIL;
		}
		if (pcase_var.eql($TMT)) {
			return NIL;
		}
		if (pcase_var.eql($RMCT)) {
			return NIL;
		}
		if (pcase_var.eql($ERT)) {
			return NIL;
		}
		if (pcase_var.eql($TCT)) {
			return NIL;
		}
		if (pcase_var.eql($KCT)) {
			return kct_cyc_testing.kct_test_spec_project(guts);
		}
		return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
	}

	public static SubLObject cyc_test_names_mentioning_invalid_constants(SubLObject tests) {
		if (tests == UNPROVIDED) {
			tests = cyc_tests();
		}
		SubLObject all_invalid_test_names = NIL;
		SubLObject cdolist_list_var = tests;
		SubLObject test = NIL;
		test = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$2;
			final SubLObject invalid_test_names = cdolist_list_var_$2 = cyc_test_invalid_constant_test_names(test);
			SubLObject invalid_test_name = NIL;
			invalid_test_name = cdolist_list_var_$2.first();
			while (NIL != cdolist_list_var_$2) {
				all_invalid_test_names = cons(invalid_test_name, all_invalid_test_names);
				cdolist_list_var_$2 = cdolist_list_var_$2.rest();
				invalid_test_name = cdolist_list_var_$2.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			test = cdolist_list_var.first();
		}
		return nreverse(all_invalid_test_names);
	}

	public static SubLObject cyc_test_invalid_constant_test_names(final SubLObject ct) {
		final SubLObject guts = cyc_test_guts(ct);
		final SubLObject pcase_var = cyc_test_type(ct);
		if (pcase_var.eql($IUT)) {
			if (NIL != inference_unit_tests.inference_unit_test_mentions_invalid_constantP(guts)) {
				return list(cyc_test_name(ct));
			}
		} else if (pcase_var.eql($IT)) {
			if (NIL != inference_testing.inference_test_mentions_invalid_constantP(guts)) {
				return list(cyc_test_name(ct));
			}
		} else if (pcase_var.eql($RMT)) {
			if (NIL != removal_module_tests.removal_module_test_mentions_invalid_constantP(guts)) {
				return list(cyc_test_name(ct));
			}
		} else if (pcase_var.eql($TMT)) {
			if (NIL != transformation_module_tests.transformation_module_test_mentions_invalid_constantP(guts)) {
				return list(cyc_test_name(ct));
			}
		} else if (pcase_var.eql($RMCT)) {
			if (NIL != removal_module_cost_tests.removal_module_cost_test_mentions_invalid_constantP(guts)) {
				return list(cyc_test_name(ct));
			}
		} else if (pcase_var.eql($ERT)) {
			if (NIL != evaluatable_relation_tests.evaluatable_relation_test_mentions_invalid_constantP(guts)) {
				return list(cyc_test_name(ct));
			}
		} else {
			if (pcase_var.eql($TCT)) {
				return generic_test_case_table_tuples_mentioning_some_invalid_constant(guts);
			}
			if (!pcase_var.eql($KCT)) {
				return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
			}
			if (NIL != kct_cyc_testing.kct_test_spec_mentions_invalid_constantP(guts)) {
				return list(cyc_test_name(ct));
			}
		}

		return NIL;
	}

	public static SubLObject cyc_tests_mentioning_invalid_constants(SubLObject tests) {
		if (tests == UNPROVIDED) {
			tests = cyc_tests();
		}
		SubLObject result = NIL;
		SubLObject cdolist_list_var = tests;
		SubLObject ct = NIL;
		ct = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if ((NIL != cyc_test_workingP(ct)) && (NIL != cyc_test_invalidP(ct))) {
				result = cons(ct, result);
			}
			cdolist_list_var = cdolist_list_var.rest();
			ct = cdolist_list_var.first();
		}
		return nreverse(result);
	}

	public static SubLObject cyc_test_invalidP(final SubLObject ct) {
		return list_utilities.sublisp_boolean(cyc_test_invalid_constants(ct));
	}

	public static SubLObject cyc_test_invalid_constants(final SubLObject ct) {
		final SubLObject guts = cyc_test_guts(ct);
		final SubLObject pcase_var = cyc_test_type(ct);
		if (pcase_var.eql($IUT)) {
			return inference_unit_tests.inference_unit_test_invalid_constants(guts);
		}
		if (pcase_var.eql($IT)) {
			return inference_testing.inference_test_invalid_constants(guts);
		}
		if (pcase_var.eql($RMT)) {
			return removal_module_tests.removal_module_test_invalid_constants(guts);
		}
		if (pcase_var.eql($TMT)) {
			return transformation_module_tests.transformation_module_test_invalid_constants(guts);
		}
		if (pcase_var.eql($RMCT)) {
			return removal_module_cost_tests.removal_module_cost_test_invalid_constants(guts);
		}
		if (pcase_var.eql($ERT)) {
			return evaluatable_relation_tests.evaluatable_relation_test_invalid_constants(guts);
		}
		if (pcase_var.eql($TCT)) {
			return generic_test_case_table_tuples_invalid_constants(guts);
		}
		if (pcase_var.eql($KCT)) {
			return kct_cyc_testing.kct_test_spec_invalid_constants(guts);
		}
		return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
	}

	public static SubLObject print_post_build_test_summary(final SubLObject stream, final SubLObject result, final SubLObject type, final SubLObject name, final SubLObject time, final SubLObject owner) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (result == $NOT_RUN) {
			return NIL;
		}
		if (NIL != $print_post_build_test_summary_timestampP$.getDynamicValue(thread)) {
			return format_nil.force_format(stream, $str67$___A__S__S__S____3f___OWNER__S__, numeric_date_utilities.timestring_ms(UNPROVIDED, UNPROVIDED), result, type, name, time, owner, UNPROVIDED, UNPROVIDED);
		}
		return format_nil.force_format(stream, $str68$___S__S__S____3f___OWNER__S__, result, type, name, time, owner, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject tiny_kb_cyc_test_p(final SubLObject v_object) {
		if (NIL != cyc_test_p(v_object)) {
			final SubLObject kb = cyc_test_kb(v_object);
			return makeBoolean(($TINY == kb) || ($BOTH == kb));
		}
		return NIL;
	}

	public static SubLObject full_kb_cyc_test_p(final SubLObject v_object) {
		if (NIL != cyc_test_p(v_object)) {
			final SubLObject kb = cyc_test_kb(v_object);
			return makeBoolean(($FULL == kb) || ($BOTH == kb));
		}
		return NIL;
	}

	public static SubLObject non_working_cyc_tests(SubLObject type) {
		if (type == UNPROVIDED) {
			type = NIL;
		}
		if (((NIL != type) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == cyc_test_type_spec_p(type))) {
			throw new AssertionError(type);
		}
		final SubLObject all_tests = cyc_tests();
		SubLObject all_non_working_tests = remove_if(symbol_function($sym73$CYC_TEST_WORKING_), all_tests, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL != type) {
			all_non_working_tests = remove(type, all_non_working_tests, symbol_function(NOT_EQ), symbol_function(CYC_TEST_TYPE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return all_non_working_tests;
	}

	public static SubLObject find_cyc_test_by_exact_name(final SubLObject name) {
		return gethash(name, $cyc_test_by_name$.getGlobalValue(), UNPROVIDED);
	}

	public static SubLObject find_cyc_test(final SubLObject name) {
		return find_cyc_tests(name).first();
	}

	public static SubLObject find_cyc_tests(final SubLObject name) {
		SubLObject tests = NIL;
		SubLObject cdolist_list_var;
		final SubLObject dwimmed_names = cdolist_list_var = cons(name, test_cases_of_class(name));
		SubLObject dwimmed_name = NIL;
		dwimmed_name = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$3 = gethash_without_values(dwimmed_name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED);
			SubLObject test = NIL;
			test = cdolist_list_var_$3.first();
			while (NIL != cdolist_list_var_$3) {
				final SubLObject item_var = test;
				if (NIL == member(item_var, tests, symbol_function(EQL), symbol_function(IDENTITY))) {
					tests = cons(item_var, tests);
				}
				cdolist_list_var_$3 = cdolist_list_var_$3.rest();
				test = cdolist_list_var_$3.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			dwimmed_name = cdolist_list_var.first();
		}
		return tests;
	}

	public static SubLObject find_cyc_test_number(final SubLObject name, final SubLObject test_number) {
		return find_cyc_tests_in_range(name, test_number, test_number);
	}

	public static SubLObject find_cyc_tests_in_range(final SubLObject name, final SubLObject min_number, final SubLObject max_number) {
		SubLObject tests = NIL;
		SubLObject cdolist_list_var;
		final SubLObject dwimmed_names = cdolist_list_var = cons(name, test_cases_of_class(name));
		SubLObject dwimmed_name = NIL;
		dwimmed_name = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$4 = gethash_without_values(dwimmed_name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED);
			SubLObject test = NIL;
			test = cdolist_list_var_$4.first();
			while (NIL != cdolist_list_var_$4) {
				final SubLObject test_id = cyc_test_id(test);
				if (NIL != test_id) {
					if (test_id.numGE(min_number) && test_id.numLE(max_number)) {
						final SubLObject item_var = test;
						if (NIL == member(item_var, tests, symbol_function(EQL), symbol_function(IDENTITY))) {
							tests = cons(item_var, tests);
						}
					}
				} else {
					final SubLObject item_var = test;
					if (NIL == member(item_var, tests, symbol_function(EQL), symbol_function(IDENTITY))) {
						tests = cons(item_var, tests);
					}
				}
				cdolist_list_var_$4 = cdolist_list_var_$4.rest();
				test = cdolist_list_var_$4.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			dwimmed_name = cdolist_list_var.first();
		}
		return tests;
	}

	public static SubLObject find_cyc_tests_by_name(final SubLObject names) {
		return delete(NIL, Mapping.mapcar(symbol_function(FIND_CYC_TEST), names), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject find_cyc_test_filename(final SubLObject name) {
		final SubLObject cyc_test = find_cyc_test(name);
		if (NIL != cyc_test) {
			return cyc_test_file(cyc_test);
		}
		return NIL;
	}

	public static SubLObject cfasl_output_object_cyc_test_method(final SubLObject v_object, final SubLObject stream) {
		return cfasl_wide_output_cyc_test(v_object, stream);
	}

	public static SubLObject cfasl_wide_output_cyc_test(final SubLObject cyc_test, final SubLObject stream) {
		cfasl_output_wide_opcode($cfasl_wide_opcode_cyc_test$.getGlobalValue(), stream);
		return cfasl_output_cyc_test_internal(cyc_test, stream);
	}

	public static SubLObject cfasl_output_cyc_test_internal(final SubLObject cyc_test, final SubLObject stream) {
		cfasl_output(cyc_test_file(cyc_test), stream);
		cfasl_output(cyc_test_guts(cyc_test), stream);
		return cyc_test;
	}

	public static SubLObject cfasl_input_cyc_test(final SubLObject stream) {
		final SubLObject file = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
		final SubLObject guts = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
		return new_cyc_test(file, guts);
	}

	public static SubLObject new_cyc_test_run(final SubLObject type, final SubLObject name, final SubLObject result, final SubLObject time) {
		assert NIL != cyc_test_type_p(type) : "cyc_testing.cyc_test_type_p(type) " + "CommonSymbols.NIL != cyc_testing.cyc_test_type_p(type) " + type;
		assert NIL != cyc_test_result_p(result) : "cyc_testing.cyc_test_result_p(result) " + "CommonSymbols.NIL != cyc_testing.cyc_test_result_p(result) " + result;
		if (((NIL != time) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == number_utilities.non_negative_number_p(time))) {
			throw new AssertionError(time);
		}
		return list(type, name, result, time);
	}

	public static SubLObject cyc_test_run_p(final SubLObject v_object) {
		return makeBoolean(((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && (NIL != cyc_test_type_p(v_object.first()))) && (NIL != cyc_test_result_p(third(v_object))));
	}

	public static SubLObject cyc_test_run_type(final SubLObject test_run) {
		assert NIL != cyc_test_run_p(test_run) : "cyc_testing.cyc_test_run_p(test_run) " + "CommonSymbols.NIL != cyc_testing.cyc_test_run_p(test_run) " + test_run;
		return test_run.first();
	}

	public static SubLObject cyc_test_run_name(final SubLObject test_run) {
		assert NIL != cyc_test_run_p(test_run) : "cyc_testing.cyc_test_run_p(test_run) " + "CommonSymbols.NIL != cyc_testing.cyc_test_run_p(test_run) " + test_run;
		return second(test_run);
	}

	public static SubLObject cyc_test_run_result(final SubLObject test_run) {
		assert NIL != cyc_test_run_p(test_run) : "cyc_testing.cyc_test_run_p(test_run) " + "CommonSymbols.NIL != cyc_testing.cyc_test_run_p(test_run) " + test_run;
		return third(test_run);
	}

	public static SubLObject cyc_test_run_time(final SubLObject test_run) {
		assert NIL != cyc_test_run_p(test_run) : "cyc_testing.cyc_test_run_p(test_run) " + "CommonSymbols.NIL != cyc_testing.cyc_test_run_p(test_run) " + test_run;
		return fourth(test_run);
	}

	public static SubLObject cyc_test_run_cyc_test(final SubLObject test_run) {
		SubLObject name = cyc_test_run_name(test_run);
		if (($IT == cyc_test_run_type(test_run)) && (NIL == list_utilities.member_eqP(cyc_test_run_result(test_run), $list83))) {
			name = name.first();
		}
		if (($TCT == cyc_test_run_type(test_run)) && (cyc_test_run_result(test_run) != $NOT_RUN)) {
			name = name.first();
		}
		return find_cyc_test_by_exact_name(name);
	}

	public static SubLObject cyc_test_runs_overall_result(final SubLObject test_runs) {
		SubLObject overall_result = $NOT_RUN;
		SubLObject cdolist_list_var = test_runs;
		SubLObject test_run = NIL;
		test_run = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject test_result = cyc_test_run_result(test_run);
			overall_result = cyc_test_result_update(overall_result, test_result);
			cdolist_list_var = cdolist_list_var.rest();
			test_run = cdolist_list_var.first();
		}
		return overall_result;
	}

	public static SubLObject cyc_test_result_update(final SubLObject overall_result, final SubLObject test_result) {
		if (NIL != cyc_test_ignore_result_p(overall_result)) {
			return test_result;
		}
		if (NIL != cyc_test_failure_result_p(overall_result)) {
			return $FAILURE;
		}
		if (NIL == cyc_test_success_result_p(overall_result)) {
			return NIL;
		}
		if (NIL != cyc_test_failure_result_p(test_result)) {
			return $FAILURE;
		}
		return $SUCCESS;
	}

	public static SubLObject cyc_test_runs_total_time(final SubLObject test_runs) {
		SubLObject total_time = ZERO_INTEGER;
		SubLObject cdolist_list_var = test_runs;
		SubLObject test_run = NIL;
		test_run = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject test_time = cyc_test_run_time(test_run);
			if (NIL != test_time) {
				total_time = add(total_time, test_time);
			}
			cdolist_list_var = cdolist_list_var.rest();
			test_run = cdolist_list_var.first();
		}
		return total_time;
	}

	public static SubLObject failing_cyc_test_run_p(final SubLObject test_run) {
		final SubLObject result = cyc_test_run_result(test_run);
		return cyc_test_failure_result_p(result);
	}

	public static SubLObject succeeding_cyc_test_run_p(final SubLObject test_run) {
		final SubLObject result = cyc_test_run_result(test_run);
		return cyc_test_success_result_p(result);
	}

	public static SubLObject ignored_cyc_test_run_p(final SubLObject test_run) {
		final SubLObject result = cyc_test_run_result(test_run);
		return cyc_test_ignore_result_p(result);
	}

	public static SubLObject cyc_test_run_owner(final SubLObject test_run) {
		final SubLObject ct = cyc_test_run_cyc_test(test_run);
		if (NIL != ct) {
			return cyc_test_owner(ct);
		}
		return NIL;
	}

	public static SubLObject cyc_test_run_project(final SubLObject test_run) {
		final SubLObject ct = cyc_test_run_cyc_test(test_run);
		if (NIL != ct) {
			return cyc_test_project(ct);
		}
		return NIL;
	}

	public static SubLObject print_cyc_test_run_summary(final SubLObject test_run, final SubLObject stream, final SubLObject output_format, final SubLObject verbosity) {
		if ($SILENT != verbosity) {
			final SubLObject name = cyc_test_run_name(test_run);
			final SubLObject type = cyc_test_run_type(test_run);
			final SubLObject result = cyc_test_run_result(test_run);
			final SubLObject owner = cyc_test_run_owner(test_run);
			final SubLObject time = cyc_test_run_time(test_run);
			if (output_format.eql($STANDARD)) {
				format(stream, $str87$___S__S_____S___S_, new SubLObject[] { type, name, result, time });
			} else if (output_format.eql($POST_BUILD)) {
				print_post_build_test_summary(stream, result, type, name, time, owner);
			} else {
				format(stream, $str89$Unknown_output_format__A, output_format);
			}

			force_output(stream);
		}
		return NIL;
	}

	public static SubLObject cyc_test_run_summary(final SubLObject test_run, final SubLObject output_format, final SubLObject verbosity) {
		if ($SILENT == verbosity) {
			return NIL;
		}
		final SubLObject name = cyc_test_run_name(test_run);
		final SubLObject type = cyc_test_run_type(test_run);
		final SubLObject result = cyc_test_run_result(test_run);
		final SubLObject owner = cyc_test_run_owner(test_run);
		final SubLObject time = cyc_test_run_time(test_run);
		if (output_format.eql($STANDARD)) {
			return format(NIL, $str87$___S__S_____S___S_, new SubLObject[] { type, name, result, time });
		}
		if (output_format.eql($POST_BUILD)) {
			return print_post_build_test_summary(NIL, result, type, name, time, owner);
		}
		if (output_format.eql($WITH_OWNER)) {
			return cconcatenate(format_nil.format_nil_s_no_copy(result), new SubLObject[] { $$$_, format_nil.format_nil_s_no_copy(time), $$$_, format_nil.format_nil_s_no_copy(type), $$$_, format_nil.format_nil_s_no_copy(name), $$$_, format_nil.format_nil_s_no_copy(owner), format_nil.$format_nil_percent$.getGlobalValue() });
		}
		return cconcatenate($$$Unknown_output_format_, format_nil.format_nil_a_no_copy(output_format));
	}

	public static SubLObject cyc_test_files() {
		return $cyc_test_files$.getGlobalValue();
	}

	public static SubLObject do_cyc_test_files(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list94);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject cyc_test_file = NIL;
		destructuring_bind_must_consp(current, datum, $list94);
		cyc_test_file = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(CDOLIST, bq_cons(cyc_test_file, $list96), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list94);
		return NIL;
	}

	public static SubLObject progress_do_cyc_test_files(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list97);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject cyc_test_file = NIL;
		destructuring_bind_must_consp(current, datum, $list97);
		cyc_test_file = current.first();
		current = current.rest();
		final SubLObject message = (current.isCons()) ? current.first() : $$$Iterating_over_all_test_files;
		destructuring_bind_must_listp(current, datum, $list97);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(PROGRESS_CDOLIST, list(cyc_test_file, $list99, message), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list97);
		return NIL;
	}

	public static SubLObject cyc_test_file_count() {
		return length($cyc_test_files$.getGlobalValue());
	}

	public static SubLObject cyc_test_file_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		print_cyc_test_file(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject cyc_test_file_p(final SubLObject v_object) {
		return v_object.getJavaClass() == $cyc_test_file_native.class ? T : NIL;
	}

	public static SubLObject ctf_filename(final SubLObject v_object) {
		assert NIL != cyc_test_file_p(v_object) : "cyc_testing.cyc_test_file_p error :" + v_object;
		return v_object.getField2();
	}

	public static SubLObject ctf_kb(final SubLObject v_object) {
		assert NIL != cyc_test_file_p(v_object) : "cyc_testing.cyc_test_file_p error :" + v_object;
		return v_object.getField3();
	}

	public static SubLObject _csetf_ctf_filename(final SubLObject v_object, final SubLObject value) {
		assert NIL != cyc_test_file_p(v_object) : "cyc_testing.cyc_test_file_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_ctf_kb(final SubLObject v_object, final SubLObject value) {
		assert NIL != cyc_test_file_p(v_object) : "cyc_testing.cyc_test_file_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static SubLObject make_cyc_test_file(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new $cyc_test_file_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($FILENAME)) {
				_csetf_ctf_filename(v_new, current_value);
			} else if (pcase_var.eql($KB)) {
				_csetf_ctf_kb(v_new, current_value);
			} else {
				Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_cyc_test_file(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, MAKE_CYC_TEST_FILE, TWO_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $FILENAME, ctf_filename(obj));
		funcall(visitor_fn, obj, $SLOT, $KB, ctf_kb(obj));
		funcall(visitor_fn, obj, $END, MAKE_CYC_TEST_FILE, TWO_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_cyc_test_file_method(final SubLObject obj, final SubLObject visitor_fn) {
		return visit_defstruct_cyc_test_file(obj, visitor_fn);
	}

	public static SubLObject print_cyc_test_file(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
		format(stream, $str117$__CTF__a_, ctf_filename(v_object));
		return v_object;
	}

	public static SubLObject new_cyc_test_file(final SubLObject filename, final SubLObject kb) {
		assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
		assert NIL != cyc_test_kb_p(kb) : "cyc_testing.cyc_test_kb_p(kb) " + "CommonSymbols.NIL != cyc_testing.cyc_test_kb_p(kb) " + kb;
		final SubLObject cyc_test_file = make_cyc_test_file(UNPROVIDED);
		_csetf_ctf_filename(cyc_test_file, filename);
		_csetf_ctf_kb(cyc_test_file, kb);
		return cyc_test_file;
	}

	public static SubLObject cyc_test_file_filename(final SubLObject cyc_test_file) {
		return ctf_filename(cyc_test_file);
	}

	public static SubLObject find_cyc_test_file(final SubLObject filename) {
		SubLObject cdolist_list_var = $cyc_test_files$.getGlobalValue();
		SubLObject cyc_test_file = NIL;
		cyc_test_file = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (filename.equal(ctf_filename(cyc_test_file))) {
				return cyc_test_file;
			}
			cdolist_list_var = cdolist_list_var.rest();
			cyc_test_file = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject most_recent_cyc_test_runs() {
		return $most_recent_cyc_test_runs$.getGlobalValue();
	}

	public static SubLObject most_recent_failing_cyc_test_runs() {
		return list_utilities.remove_if_not(FAILING_CYC_TEST_RUN_P, most_recent_cyc_test_runs(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject most_recent_failing_cyc_tests() {
		return Mapping.mapcar(CYC_TEST_RUN_CYC_TEST, most_recent_failing_cyc_test_runs());
	}

	public static SubLObject most_recent_cyc_test_file_load_failures() {
		return $most_recent_cyc_test_file_load_failures$.getGlobalValue();
	}

	public static SubLObject run_all_cyc_tests(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject path = NIL;
		destructuring_bind_must_consp(current, datum, $list123);
		path = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$5 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list123);
			current_$5 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list123);
			if (NIL == member(current_$5, $list124, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$5 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list123);
		}
		final SubLObject stream_tail = property_list_member($STREAM, current);
		final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : $standard_output$;
		final SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
		final SubLObject verbosity = (NIL != verbosity_tail) ? cadr(verbosity_tail) : $TERSE;
		final SubLObject stop_at_first_failureP_tail = property_list_member($kw129$STOP_AT_FIRST_FAILURE_, current);
		final SubLObject stop_at_first_failureP = (NIL != stop_at_first_failureP_tail) ? cadr(stop_at_first_failureP_tail) : NIL;
		final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
		final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : $STANDARD;
		final SubLObject run_tiny_kb_tests_in_full_kbP_tail = property_list_member($kw131$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
		final SubLObject run_tiny_kb_tests_in_full_kbP = (NIL != run_tiny_kb_tests_in_full_kbP_tail) ? cadr(run_tiny_kb_tests_in_full_kbP_tail) : $sym132$_RUN_TINY_KB_TESTS_IN_FULL_KB__;
		final SubLObject run_test_case_tablesP_tail = property_list_member($kw133$RUN_TEST_CASE_TABLES_, current);
		final SubLObject run_test_case_tablesP = (NIL != run_test_case_tablesP_tail) ? cadr(run_test_case_tablesP_tail) : T;
		final SubLObject return_test_runsP_tail = property_list_member($kw134$RETURN_TEST_RUNS_, current);
		final SubLObject return_test_runsP = (NIL != return_test_runsP_tail) ? cadr(return_test_runsP_tail) : NIL;
		final SubLObject type_tail = property_list_member($TYPE, current);
		final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : $ALL;
		final SubLObject run_non_working_tests_tail = property_list_member($RUN_NON_WORKING_TESTS, current);
		final SubLObject run_non_working_tests = (NIL != run_non_working_tests_tail) ? cadr(run_non_working_tests_tail) : NIL;
		final SubLObject progress_file_tail = property_list_member($PROGRESS_FILE, current);
		final SubLObject progress_file = (NIL != progress_file_tail) ? cadr(progress_file_tail) : NIL;
		final SubLObject rerun_crashing_tests_tail = property_list_member($RERUN_CRASHING_TESTS, current);
		final SubLObject rerun_crashing_tests = (NIL != rerun_crashing_tests_tail) ? cadr(rerun_crashing_tests_tail) : NIL;
		return list(new SubLObject[] { RUN_ALL_CYC_TESTS_INT, path, stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, return_test_runsP, type, run_non_working_tests, progress_file, rerun_crashing_tests });
	}

	public static SubLObject run_all_cyc_tests_int(final SubLObject path, SubLObject stream, SubLObject verbosity, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject run_test_case_tablesP, SubLObject return_test_runsP, SubLObject type, SubLObject run_non_working_tests, SubLObject progress_file, SubLObject rerun_crashing_tests, SubLObject phase,
			SubLObject phases) {
		if (stream == UNPROVIDED) {
			stream = $standard_output$;
		}
		if (verbosity == UNPROVIDED) {
			verbosity = $TERSE;
		}
		if (stop_at_first_failureP == UNPROVIDED) {
			stop_at_first_failureP = NIL;
		}
		if (output_format == UNPROVIDED) {
			output_format = $STANDARD;
		}
		if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
			run_tiny_kb_tests_in_full_kbP = $sym132$_RUN_TINY_KB_TESTS_IN_FULL_KB__;
		}
		if (run_test_case_tablesP == UNPROVIDED) {
			run_test_case_tablesP = T;
		}
		if (return_test_runsP == UNPROVIDED) {
			return_test_runsP = NIL;
		}
		if (type == UNPROVIDED) {
			type = $ALL;
		}
		if (run_non_working_tests == UNPROVIDED) {
			run_non_working_tests = NIL;
		}
		if (progress_file == UNPROVIDED) {
			progress_file = NIL;
		}
		if (rerun_crashing_tests == UNPROVIDED) {
			rerun_crashing_tests = NIL;
		}
		if (phase == UNPROVIDED) {
			phase = ZERO_INTEGER;
		}
		if (phases == UNPROVIDED) {
			phases = ONE_INTEGER;
		}
		if (NIL != path) {
			undeclare_all_cyc_test_files();
			load_all_cyc_tests(path, stream, run_tiny_kb_tests_in_full_kbP, verbosity);
		}
		return run_all_loaded_cyc_tests(stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, return_test_runsP, type, run_non_working_tests, progress_file, rerun_crashing_tests, cyc_tests(), phase, phases);
	}

	public static SubLObject rerun_failing_cyc_tests(final SubLObject macroform, final SubLObject environment) {
		final SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$6 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list140);
			current_$6 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list140);
			if (NIL == member(current_$6, $list141, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$6 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list140);
		}
		final SubLObject stream_tail = property_list_member($STREAM, current);
		final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : $standard_output$;
		final SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
		final SubLObject verbosity = (NIL != verbosity_tail) ? cadr(verbosity_tail) : $VERBOSE;
		final SubLObject stop_at_first_failureP_tail = property_list_member($kw129$STOP_AT_FIRST_FAILURE_, current);
		final SubLObject stop_at_first_failureP = (NIL != stop_at_first_failureP_tail) ? cadr(stop_at_first_failureP_tail) : NIL;
		final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
		final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : $STANDARD;
		final SubLObject return_test_runsP_tail = property_list_member($kw134$RETURN_TEST_RUNS_, current);
		final SubLObject return_test_runsP = (NIL != return_test_runsP_tail) ? cadr(return_test_runsP_tail) : NIL;
		final SubLObject type_tail = property_list_member($TYPE, current);
		final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : $ALL;
		final SubLObject run_non_working_tests_tail = property_list_member($RUN_NON_WORKING_TESTS, current);
		final SubLObject run_non_working_tests = (NIL != run_non_working_tests_tail) ? cadr(run_non_working_tests_tail) : NIL;
		final SubLObject progress_file_tail = property_list_member($PROGRESS_FILE, current);
		final SubLObject progress_file = (NIL != progress_file_tail) ? cadr(progress_file_tail) : NIL;
		final SubLObject rerun_crashing_tests_tail = property_list_member($RERUN_CRASHING_TESTS, current);
		final SubLObject rerun_crashing_tests = (NIL != rerun_crashing_tests_tail) ? cadr(rerun_crashing_tests_tail) : NIL;
		return list(new SubLObject[] { RUN_ALL_LOADED_CYC_TESTS, stream, verbosity, stop_at_first_failureP, output_format, T, T, return_test_runsP, type, run_non_working_tests, progress_file, rerun_crashing_tests, list(QUOTE, most_recent_failing_cyc_tests()) });
	}

	public static SubLObject declare_cyc_test_file(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject filename = NIL;
		destructuring_bind_must_consp(current, datum, $list145);
		filename = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$7 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list145);
			current_$7 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list145);
			if (NIL == member(current_$7, $list146, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$7 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list145);
		}
		final SubLObject kb_tail = property_list_member($KB, current);
		final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : NIL;
		return list(DECLARE_CYC_TEST_FILE_INT, filename, kb);
	}

	public static SubLObject run_cyc_tests(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject names = NIL;
		destructuring_bind_must_consp(current, datum, $list148);
		names = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$8 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list148);
			current_$8 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list148);
			if (NIL == member(current_$8, $list149, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$8 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list148);
		}
		final SubLObject stream_tail = property_list_member($STREAM, current);
		final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : $standard_output$;
		final SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
		final SubLObject verbosity = (NIL != verbosity_tail) ? cadr(verbosity_tail) : $VERBOSE;
		final SubLObject stop_at_first_failureP_tail = property_list_member($kw129$STOP_AT_FIRST_FAILURE_, current);
		final SubLObject stop_at_first_failureP = (NIL != stop_at_first_failureP_tail) ? cadr(stop_at_first_failureP_tail) : NIL;
		final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
		final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : $STANDARD;
		final SubLObject return_test_runsP_tail = property_list_member($kw134$RETURN_TEST_RUNS_, current);
		final SubLObject return_test_runsP = (NIL != return_test_runsP_tail) ? cadr(return_test_runsP_tail) : NIL;
		final SubLObject type_tail = property_list_member($TYPE, current);
		final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : $ALL;
		final SubLObject run_non_working_tests_tail = property_list_member($RUN_NON_WORKING_TESTS, current);
		final SubLObject run_non_working_tests = (NIL != run_non_working_tests_tail) ? cadr(run_non_working_tests_tail) : NIL;
		return list(new SubLObject[] { RUN_ALL_LOADED_CYC_TESTS, stream, verbosity, stop_at_first_failureP, output_format, T, T, return_test_runsP, type, run_non_working_tests, NIL, NIL, list(FIND_CYC_TESTS_BY_NAME, names) });
	}

	public static SubLObject load_all_cyc_tests(final SubLObject path, SubLObject stream, SubLObject load_tiny_kb_tests_in_full_kbP, SubLObject verbosity) {
		if (stream == UNPROVIDED) {
			stream = StreamsLow.$standard_output$.getDynamicValue();
		}
		if (load_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
			load_tiny_kb_tests_in_full_kbP = $run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
		}
		if (verbosity == UNPROVIDED) {
			verbosity = $TERSE;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(path) : "Types.stringp(path) " + "CommonSymbols.NIL != Types.stringp(path) " + path;
		assert NIL != streamp(stream) : "Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) " + stream;
		assert NIL != booleanp(load_tiny_kb_tests_in_full_kbP) : "Types.booleanp(load_tiny_kb_tests_in_full_kbP) " + "CommonSymbols.NIL != Types.booleanp(load_tiny_kb_tests_in_full_kbP) " + load_tiny_kb_tests_in_full_kbP;
		assert NIL != cyc_test_verbosity_level_p(verbosity) : "cyc_testing.cyc_test_verbosity_level_p(verbosity) " + "CommonSymbols.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) " + verbosity;
		thread.resetMultipleValues();
		final SubLObject tests_directory = parse_testdcl_path(path);
		final SubLObject extra_filename = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject count = ZERO_INTEGER;
		final SubLObject warn_on_duplicate_cyc_test_namesP = no_cyc_tests_definedP();
		final SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
		try {
			StreamsLow.$standard_output$.bind(stream, thread);
			if (NIL == load_testdcl(tests_directory, extra_filename)) {
				Errors.error($str154$could_not_load__a_lisp_from__s, NIL != extra_filename ? extra_filename : $cyc_base_testdcl$.getDynamicValue(thread), tests_directory);
			}
			if ($VERBOSE == verbosity) {
				final SubLObject list_var = cyc_test_files();
				final SubLObject _prev_bind_0_$9 = $progress_note$.currentBinding(thread);
				final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
				final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
				final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
				final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
				final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
				final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
				final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
				try {
					$progress_note$.bind($$$Loading_test_files, thread);
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
						SubLObject cyc_test_file = NIL;
						cyc_test_file = csome_list_var.first();
						while (NIL != csome_list_var) {
							if (NIL != load_cyc_test_file(cyc_test_file, tests_directory, load_tiny_kb_tests_in_full_kbP, warn_on_duplicate_cyc_test_namesP)) {
								count = add(count, ONE_INTEGER);
							}
							$progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
							note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
							csome_list_var = csome_list_var.rest();
							cyc_test_file = csome_list_var.first();
						}
					} finally {
						final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values = getValuesAsVector();
							noting_percent_progress_postamble();
							restoreValuesFromVector(_values);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
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
					$progress_note$.rebind(_prev_bind_0_$9, thread);
				}
			} else {
				SubLObject cdolist_list_var = cyc_test_files();
				SubLObject cyc_test_file2 = NIL;
				cyc_test_file2 = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (NIL != load_cyc_test_file(cyc_test_file2, tests_directory, load_tiny_kb_tests_in_full_kbP, warn_on_duplicate_cyc_test_namesP)) {
						count = add(count, ONE_INTEGER);
					} else if (NIL != inference_testing.kb_matches_expectationsP(ctf_kb(cyc_test_file2), load_tiny_kb_tests_in_full_kbP)) {
						$most_recent_cyc_test_file_load_failures$.setGlobalValue(cons(cyc_test_file2, $most_recent_cyc_test_file_load_failures$.getGlobalValue()));
					}

					cdolist_list_var = cdolist_list_var.rest();
					cyc_test_file2 = cdolist_list_var.first();
				}
			}
			if (NIL != extra_filename) {
				final SubLObject _prev_bind_0_$11 = $only_undeclare_tests_and_test_filesP$.currentBinding(thread);
				try {
					$only_undeclare_tests_and_test_filesP$.bind(T, thread);
					load_testdcl(tests_directory, extra_filename);
				} finally {
					$only_undeclare_tests_and_test_filesP$.rebind(_prev_bind_0_$11, thread);
				}
			}
		} finally {
			StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject parse_testdcl_path(SubLObject path) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject extra_filename = NIL;
		if (NIL != string_utilities.ends_with(path, $str157$_lisp, UNPROVIDED)) {
			thread.resetMultipleValues();
			final SubLObject directory = file_utilities.partially_deconstruct_path(path);
			final SubLObject filename = thread.secondMultipleValue();
			thread.resetMultipleValues();
			extra_filename = string_utilities.post_remove(filename, $str157$_lisp, UNPROVIDED);
			path = directory;
		}
		path = file_utilities.possibly_append_path_separator_char(path);
		return values(path, extra_filename);
	}

	public static SubLObject run_all_loaded_cyc_tests(SubLObject stream, SubLObject verbosity, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject run_test_case_tablesP, SubLObject return_test_runsP, SubLObject type, SubLObject run_non_working_tests, SubLObject progress_file, SubLObject rerun_crashing_tests, SubLObject tests, SubLObject phase,
			SubLObject phases) {
		if (stream == UNPROVIDED) {
			stream = StreamsLow.$standard_output$.getDynamicValue();
		}
		if (verbosity == UNPROVIDED) {
			verbosity = $TERSE;
		}
		if (stop_at_first_failureP == UNPROVIDED) {
			stop_at_first_failureP = NIL;
		}
		if (output_format == UNPROVIDED) {
			output_format = $STANDARD;
		}
		if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
			run_tiny_kb_tests_in_full_kbP = $run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
		}
		if (run_test_case_tablesP == UNPROVIDED) {
			run_test_case_tablesP = T;
		}
		if (return_test_runsP == UNPROVIDED) {
			return_test_runsP = NIL;
		}
		if (type == UNPROVIDED) {
			type = $ALL;
		}
		if (run_non_working_tests == UNPROVIDED) {
			run_non_working_tests = NIL;
		}
		if (progress_file == UNPROVIDED) {
			progress_file = NIL;
		}
		if (rerun_crashing_tests == UNPROVIDED) {
			rerun_crashing_tests = NIL;
		}
		if (tests == UNPROVIDED) {
			tests = cyc_tests();
		}
		if (phase == UNPROVIDED) {
			phase = ZERO_INTEGER;
		}
		if (phases == UNPROVIDED) {
			phases = ONE_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!phase.numL(phases))) {
			Errors.error($str158$Invalid_phase__A_of__A_specified_, phase, phases);
		}
		thread.resetMultipleValues();
		final SubLObject overall_result = cyc_testing_utilities.run_all_loaded_cyc_tests_int(stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, type, run_non_working_tests, progress_file, rerun_crashing_tests, tests, phase, phases);
		final SubLObject test_runs = thread.secondMultipleValue();
		thread.resetMultipleValues();
		$most_recent_cyc_test_runs$.setGlobalValue(test_runs);
		return values(overall_result, NIL != return_test_runsP ? test_runs : NIL);
	}

	public static SubLObject undeclare_all_cyc_test_files() {
		$cyc_test_files$.setGlobalValue(NIL);
		return NIL;
	}

	public static SubLObject undeclare_cyc_test_file(final SubLObject filename) {
		final SubLObject existing_cyc_test_file = find_cyc_test_file(filename);
		if (NIL != existing_cyc_test_file) {
			$cyc_test_files$.setGlobalValue(delete(existing_cyc_test_file, $cyc_test_files$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
			return T;
		}
		return NIL;
	}

	public static SubLObject declare_cyc_test_file_int(final SubLObject filename, final SubLObject kb) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == $only_undeclare_tests_and_test_filesP$.getDynamicValue(thread)) {
			undeclare_cyc_test_file(filename);
			final SubLObject cyc_test_file = new_cyc_test_file(filename, kb);
			final SubLObject new_cons = cons(cyc_test_file, NIL);
			final SubLObject list = $cyc_test_files$.getGlobalValue();
			if (NIL != list) {
				subl_macros.rplacd_last(list, new_cons);
			} else {
				$cyc_test_files$.setGlobalValue(new_cons);
			}
			return cyc_test_file;
		}
		return NIL;
	}

	public static SubLObject load_cyc_test_file(final SubLObject cyc_test_file, final SubLObject path, final SubLObject load_tiny_kb_tests_in_full_kbP, final SubLObject warn_on_duplicate_cyc_test_namesP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject successP = NIL;
		final SubLObject test_kb = ctf_kb(cyc_test_file);
		if (NIL != inference_testing.kb_matches_expectationsP(test_kb, load_tiny_kb_tests_in_full_kbP)) {
			final SubLObject filename = ctf_filename(cyc_test_file);
			final SubLObject _prev_bind_0 = $cyc_test_filename$.currentBinding(thread);
			final SubLObject _prev_bind_2 = $warn_on_duplicate_cyc_test_namesP$.currentBinding(thread);
			try {
				$cyc_test_filename$.bind(filename, thread);
				$warn_on_duplicate_cyc_test_namesP$.bind(warn_on_duplicate_cyc_test_namesP, thread);
				if (NIL != cyc_testing_utilities.load_lisp_test_file_from_path(path, filename)) {
					successP = T;
				}
			} finally {
				$warn_on_duplicate_cyc_test_namesP$.rebind(_prev_bind_2, thread);
				$cyc_test_filename$.rebind(_prev_bind_0, thread);
			}
		}
		return successP;
	}

	public static SubLObject load_testdcl(final SubLObject path, SubLObject extra_filename) {
		if (extra_filename == UNPROVIDED) {
			extra_filename = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean((NIL != cyc_testing_utilities.load_lisp_test_file_from_path(path, $cyc_base_testdcl$.getDynamicValue(thread))) && ((NIL == extra_filename) || (NIL != cyc_testing_utilities.load_lisp_test_file_from_path(path, extra_filename))));
	}

	public static SubLObject cyc_invalid_tests_with_info() {
		final SubLObject all_relevant_tests = (NIL != non_tiny_kb_loadedP()) ? cyc_tests() : list_utilities.find_all_if(TINY_KB_CYC_TEST_P, cyc_tests(), UNPROVIDED);
		final SubLObject invalid_tests = cyc_tests_mentioning_invalid_constants(all_relevant_tests);
		SubLObject result = NIL;
		SubLObject cdolist_list_var = invalid_tests;
		SubLObject invalid_test = NIL;
		invalid_test = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject test_name = cyc_test_name(invalid_test);
			final SubLObject test_type = cyc_test_type(invalid_test);
			final SubLObject test_owner = cyc_test_owner(invalid_test);
			final SubLObject invalid_constants = cyc_test_invalid_constants(invalid_test);
			result = cons(list(test_type, test_name, test_owner, invalid_constants), result);
			cdolist_list_var = cdolist_list_var.rest();
			invalid_test = cdolist_list_var.first();
		}
		if ((NIL != result) && (NIL != list_utilities.lengthLE(result, $int$100, UNPROVIDED))) {
			format_nil.p1(result, UNPROVIDED);
		}
		return result;
	}

	public static SubLObject run_cyc_test_after_every_test(final SubLObject path, final SubLObject test_to_interleave, SubLObject stream, SubLObject load_tiny_kb_tests_in_full_kbP, SubLObject verbosity) {
		if (stream == UNPROVIDED) {
			stream = StreamsLow.$standard_output$.getDynamicValue();
		}
		if (load_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
			load_tiny_kb_tests_in_full_kbP = T;
		}
		if (verbosity == UNPROVIDED) {
			verbosity = $TERSE;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		load_all_cyc_tests(path, stream, load_tiny_kb_tests_in_full_kbP, verbosity);
		SubLObject test_count;
		SubLObject n;
		for (test_count = cyc_test_count(), n = NIL, n = ZERO_INTEGER; n.numL(test_count); n = add(n, ONE_INTEGER)) {
			run_all_loaded_cyc_tests(StreamsLow.$standard_output$.getDynamicValue(thread), verbosity, T, $STANDARD, T, T, NIL, $ALL, NIL, NIL, NIL, cyc_tests(), n, test_count);
			cyc_testing_utilities.run_cyc_test_int(test_to_interleave, verbosity, NIL, NIL, $STANDARD, stream, T);
		}
		return NIL;
	}

	public static SubLObject all_cyc_tests_are_valid() {
		return cyc_invalid_tests_with_info();
	}

	public static SubLObject declare_cyc_testing_file() {
		declareFunction(me, "testing_real_time_pruningP", "TESTING-REAL-TIME-PRUNING?", 0, 0, false);
		declareFunction(me, "cyc_test_kb_p", "CYC-TEST-KB-P", 1, 0, false);
		declareFunction(me, "cyc_test_verbosity_level_p", "CYC-TEST-VERBOSITY-LEVEL-P", 1, 0, false);
		declareFunction(me, "cyc_test_output_format_p", "CYC-TEST-OUTPUT-FORMAT-P", 1, 0, false);
		declareFunction(me, "cyc_test_result_p", "CYC-TEST-RESULT-P", 1, 0, false);
		declareFunction(me, "cyc_test_success_result_p", "CYC-TEST-SUCCESS-RESULT-P", 1, 0, false);
		declareFunction(me, "cyc_test_failure_result_p", "CYC-TEST-FAILURE-RESULT-P", 1, 0, false);
		declareFunction(me, "cyc_test_ignore_result_p", "CYC-TEST-IGNORE-RESULT-P", 1, 0, false);
		declareFunction(me, "cyc_test_result_L", "CYC-TEST-RESULT-<", 2, 0, false);
		declareFunction(me, "cyc_test_type_p", "CYC-TEST-TYPE-P", 1, 0, false);
		declareFunction(me, "cyc_test_type_spec_p", "CYC-TEST-TYPE-SPEC-P", 1, 0, false);
		declareFunction(me, "cyc_test_type_pretty_name", "CYC-TEST-TYPE-PRETTY-NAME", 1, 0, false);
		declareFunction(me, "cyc_tests", "CYC-TESTS", 0, 0, false);
		declareFunction(me, "undefine_all_cyc_tests", "UNDEFINE-ALL-CYC-TESTS", 0, 0, false);
		declareMacro(me, "do_cyc_tests", "DO-CYC-TESTS");
		declareMacro(me, "progress_do_cyc_tests", "PROGRESS-DO-CYC-TESTS");
		declareFunction(me, "cyc_test_count", "CYC-TEST-COUNT", 0, 0, false);
		declareFunction(me, "no_cyc_tests_definedP", "NO-CYC-TESTS-DEFINED?", 0, 0, false);
		declareFunction(me, "index_cyc_test_by_name", "INDEX-CYC-TEST-BY-NAME", 2, 0, false);
		declareFunction(me, "unindex_cyc_test_by_name", "UNINDEX-CYC-TEST-BY-NAME", 2, 0, false);
		declareFunction(me, "my_pushnew_to_end_hash", "MY-PUSHNEW-TO-END-HASH", 3, 0, false);
		declareFunction(me, "my_delete_value_from_hash", "MY-DELETE-VALUE-FROM-HASH", 3, 0, false);
		declareFunction(me, "index_all_cyc_tests_by_name", "INDEX-ALL-CYC-TESTS-BY-NAME", 0, 0, false);
		declareFunction(me, "cyc_test_print_function_trampoline", "CYC-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction(me, "cyc_test_p", "CYC-TEST-P", 1, 0, false);
		new cyc_testing.$cyc_test_p$UnaryFunction();
		declareFunction(me, "ct_file", "CT-FILE", 1, 0, false);
		declareFunction(me, "ct_guts", "CT-GUTS", 1, 0, false);
		declareFunction(me, "_csetf_ct_file", "_CSETF-CT-FILE", 2, 0, false);
		declareFunction(me, "_csetf_ct_guts", "_CSETF-CT-GUTS", 2, 0, false);
		declareFunction(me, "make_cyc_test", "MAKE-CYC-TEST", 0, 1, false);
		declareFunction(me, "visit_defstruct_cyc_test", "VISIT-DEFSTRUCT-CYC-TEST", 2, 0, false);
		declareFunction(me, "visit_defstruct_object_cyc_test_method", "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-METHOD", 2, 0, false);
		declareFunction(me, "print_cyc_test", "PRINT-CYC-TEST", 3, 0, false);
		declareFunction(me, "new_cyc_test", "NEW-CYC-TEST", 2, 0, false);
		declareFunction(me, "undeclare_cyc_test", "UNDECLARE-CYC-TEST", 1, 0, false);
		declareFunction(me, "cyc_test_file", "CYC-TEST-FILE", 1, 0, false);
		declareFunction(me, "cyc_test_guts", "CYC-TEST-GUTS", 1, 0, false);
		declareFunction(me, "cyc_test_type", "CYC-TEST-TYPE", 1, 0, false);
		declareFunction(me, "cyc_test_guts_p", "CYC-TEST-GUTS-P", 1, 0, false);
		declareFunction(me, "cyc_test_type_permissive", "CYC-TEST-TYPE-PERMISSIVE", 1, 0, false);
		declareFunction(me, "cyc_test_guts_type", "CYC-TEST-GUTS-TYPE", 1, 0, false);
		declareFunction(me, "cyc_test_name", "CYC-TEST-NAME", 1, 0, false);
		declareFunction(me, "cyc_test_id", "CYC-TEST-ID", 1, 0, false);
		declareFunction(me, "cyc_test_kb", "CYC-TEST-KB", 1, 0, false);
		declareFunction(me, "cyc_test_owner", "CYC-TEST-OWNER", 1, 0, false);
		declareFunction(me, "cyc_test_workingP", "CYC-TEST-WORKING?", 1, 0, false);
		declareFunction(me, "cyc_test_comment", "CYC-TEST-COMMENT", 1, 0, false);
		declareFunction(me, "cyc_test_project", "CYC-TEST-PROJECT", 1, 0, false);
		declareFunction(me, "cyc_test_names_mentioning_invalid_constants", "CYC-TEST-NAMES-MENTIONING-INVALID-CONSTANTS", 0, 1, false);
		declareFunction(me, "cyc_test_invalid_constant_test_names", "CYC-TEST-INVALID-CONSTANT-TEST-NAMES", 1, 0, false);
		declareFunction(me, "cyc_tests_mentioning_invalid_constants", "CYC-TESTS-MENTIONING-INVALID-CONSTANTS", 0, 1, false);
		declareFunction(me, "cyc_test_invalidP", "CYC-TEST-INVALID?", 1, 0, false);
		declareFunction(me, "cyc_test_invalid_constants", "CYC-TEST-INVALID-CONSTANTS", 1, 0, false);
		declareFunction(me, "print_post_build_test_summary", "PRINT-POST-BUILD-TEST-SUMMARY", 6, 0, false);
		declareFunction(me, "tiny_kb_cyc_test_p", "TINY-KB-CYC-TEST-P", 1, 0, false);
		declareFunction(me, "full_kb_cyc_test_p", "FULL-KB-CYC-TEST-P", 1, 0, false);
		declareFunction(me, "non_working_cyc_tests", "NON-WORKING-CYC-TESTS", 0, 1, false);
		declareFunction(me, "find_cyc_test_by_exact_name", "FIND-CYC-TEST-BY-EXACT-NAME", 1, 0, false);
		declareFunction(me, "find_cyc_test", "FIND-CYC-TEST", 1, 0, false);
		declareFunction(me, "find_cyc_tests", "FIND-CYC-TESTS", 1, 0, false);
		declareFunction(me, "find_cyc_test_number", "FIND-CYC-TEST-NUMBER", 2, 0, false);
		declareFunction(me, "find_cyc_tests_in_range", "FIND-CYC-TESTS-IN-RANGE", 3, 0, false);
		declareFunction(me, "find_cyc_tests_by_name", "FIND-CYC-TESTS-BY-NAME", 1, 0, false);
		declareFunction(me, "find_cyc_test_filename", "FIND-CYC-TEST-FILENAME", 1, 0, false);
		declareFunction(me, "cfasl_output_object_cyc_test_method", "CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD", 2, 0, false);
		declareFunction(me, "cfasl_wide_output_cyc_test", "CFASL-WIDE-OUTPUT-CYC-TEST", 2, 0, false);
		declareFunction(me, "cfasl_output_cyc_test_internal", "CFASL-OUTPUT-CYC-TEST-INTERNAL", 2, 0, false);
		declareFunction(me, "cfasl_input_cyc_test", "CFASL-INPUT-CYC-TEST", 1, 0, false);
		declareFunction(me, "new_cyc_test_run", "NEW-CYC-TEST-RUN", 4, 0, false);
		declareFunction(me, "cyc_test_run_p", "CYC-TEST-RUN-P", 1, 0, false);
		declareFunction(me, "cyc_test_run_type", "CYC-TEST-RUN-TYPE", 1, 0, false);
		declareFunction(me, "cyc_test_run_name", "CYC-TEST-RUN-NAME", 1, 0, false);
		declareFunction(me, "cyc_test_run_result", "CYC-TEST-RUN-RESULT", 1, 0, false);
		declareFunction(me, "cyc_test_run_time", "CYC-TEST-RUN-TIME", 1, 0, false);
		declareFunction(me, "cyc_test_run_cyc_test", "CYC-TEST-RUN-CYC-TEST", 1, 0, false);
		declareFunction(me, "cyc_test_runs_overall_result", "CYC-TEST-RUNS-OVERALL-RESULT", 1, 0, false);
		declareFunction(me, "cyc_test_result_update", "CYC-TEST-RESULT-UPDATE", 2, 0, false);
		declareFunction(me, "cyc_test_runs_total_time", "CYC-TEST-RUNS-TOTAL-TIME", 1, 0, false);
		declareFunction(me, "failing_cyc_test_run_p", "FAILING-CYC-TEST-RUN-P", 1, 0, false);
		declareFunction(me, "succeeding_cyc_test_run_p", "SUCCEEDING-CYC-TEST-RUN-P", 1, 0, false);
		declareFunction(me, "ignored_cyc_test_run_p", "IGNORED-CYC-TEST-RUN-P", 1, 0, false);
		declareFunction(me, "cyc_test_run_owner", "CYC-TEST-RUN-OWNER", 1, 0, false);
		declareFunction(me, "cyc_test_run_project", "CYC-TEST-RUN-PROJECT", 1, 0, false);
		declareFunction(me, "print_cyc_test_run_summary", "PRINT-CYC-TEST-RUN-SUMMARY", 4, 0, false);
		declareFunction(me, "cyc_test_run_summary", "CYC-TEST-RUN-SUMMARY", 3, 0, false);
		declareFunction(me, "cyc_test_files", "CYC-TEST-FILES", 0, 0, false);
		declareMacro(me, "do_cyc_test_files", "DO-CYC-TEST-FILES");
		declareMacro(me, "progress_do_cyc_test_files", "PROGRESS-DO-CYC-TEST-FILES");
		declareFunction(me, "cyc_test_file_count", "CYC-TEST-FILE-COUNT", 0, 0, false);
		declareFunction(me, "cyc_test_file_print_function_trampoline", "CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction(me, "cyc_test_file_p", "CYC-TEST-FILE-P", 1, 0, false);
		new cyc_testing.$cyc_test_file_p$UnaryFunction();
		declareFunction(me, "ctf_filename", "CTF-FILENAME", 1, 0, false);
		declareFunction(me, "ctf_kb", "CTF-KB", 1, 0, false);
		declareFunction(me, "_csetf_ctf_filename", "_CSETF-CTF-FILENAME", 2, 0, false);
		declareFunction(me, "_csetf_ctf_kb", "_CSETF-CTF-KB", 2, 0, false);
		declareFunction(me, "make_cyc_test_file", "MAKE-CYC-TEST-FILE", 0, 1, false);
		declareFunction(me, "visit_defstruct_cyc_test_file", "VISIT-DEFSTRUCT-CYC-TEST-FILE", 2, 0, false);
		declareFunction(me, "visit_defstruct_object_cyc_test_file_method", "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-FILE-METHOD", 2, 0, false);
		declareFunction(me, "print_cyc_test_file", "PRINT-CYC-TEST-FILE", 3, 0, false);
		declareFunction(me, "new_cyc_test_file", "NEW-CYC-TEST-FILE", 2, 0, false);
		declareFunction(me, "cyc_test_file_filename", "CYC-TEST-FILE-FILENAME", 1, 0, false);
		declareFunction(me, "find_cyc_test_file", "FIND-CYC-TEST-FILE", 1, 0, false);
		declareFunction(me, "most_recent_cyc_test_runs", "MOST-RECENT-CYC-TEST-RUNS", 0, 0, false);
		declareFunction(me, "most_recent_failing_cyc_test_runs", "MOST-RECENT-FAILING-CYC-TEST-RUNS", 0, 0, false);
		declareFunction(me, "most_recent_failing_cyc_tests", "MOST-RECENT-FAILING-CYC-TESTS", 0, 0, false);
		declareFunction(me, "most_recent_cyc_test_file_load_failures", "MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES", 0, 0, false);
		declareMacro(me, "run_all_cyc_tests", "RUN-ALL-CYC-TESTS");
		declareFunction(me, "run_all_cyc_tests_int", "RUN-ALL-CYC-TESTS-INT", 1, 13, false);
		declareMacro(me, "rerun_failing_cyc_tests", "RERUN-FAILING-CYC-TESTS");
		declareMacro(me, "declare_cyc_test_file", "DECLARE-CYC-TEST-FILE");
		declareMacro(me, "run_cyc_tests", "RUN-CYC-TESTS");
		declareFunction(me, "load_all_cyc_tests", "LOAD-ALL-CYC-TESTS", 1, 3, false);
		declareFunction(me, "parse_testdcl_path", "PARSE-TESTDCL-PATH", 1, 0, false);
		declareFunction(me, "run_all_loaded_cyc_tests", "RUN-ALL-LOADED-CYC-TESTS", 0, 14, false);
		declareFunction(me, "undeclare_all_cyc_test_files", "UNDECLARE-ALL-CYC-TEST-FILES", 0, 0, false);
		declareFunction(me, "undeclare_cyc_test_file", "UNDECLARE-CYC-TEST-FILE", 1, 0, false);
		declareFunction(me, "declare_cyc_test_file_int", "DECLARE-CYC-TEST-FILE-INT", 2, 0, false);
		declareFunction(me, "load_cyc_test_file", "LOAD-CYC-TEST-FILE", 4, 0, false);
		declareFunction(me, "load_testdcl", "LOAD-TESTDCL", 1, 1, false);
		declareFunction(me, "cyc_invalid_tests_with_info", "CYC-INVALID-TESTS-WITH-INFO", 0, 0, false);
		declareFunction(me, "run_cyc_test_after_every_test", "RUN-CYC-TEST-AFTER-EVERY-TEST", 2, 3, false);
		declareFunction(me, "all_cyc_tests_are_valid", "ALL-CYC-TESTS-ARE-VALID", 0, 0, false);
		return NIL;
	}

	public static SubLObject init_cyc_testing_file() {
		defparameter("*IT-OUTPUT-FORMAT*", $STANDARD);
		defparameter("*CYC-TEST-DEBUG?*", NIL);
		defparameter("*RUN-TINY-KB-TESTS-IN-FULL-KB?*", T);
		defparameter("*TEST-REAL-TIME-PRUNING?*", NIL);
		deflexical("*CYC-TEST-VERBOSITY-LEVELS*", $list1);
		defparameter("*CYC-TEST-FILENAME*", NIL);
		defparameter("*CYC-BASE-TESTDCL*", $$$testdcl);
		defparameter("*WARN-ON-DUPLICATE-CYC-TEST-NAMES?*", NIL);
		defparameter("*ONLY-UNDECLARE-TESTS-AND-TEST-FILES?*", NIL);
		deflexical("*CYC-TEST-RESULT-SUCCESS-VALUES*", $list5);
		deflexical("*CYC-TEST-RESULT-FAILURE-VALUES*", $list6);
		deflexical("*CYC-TEST-RESULT-IGNORE-VALUES*", $list7);
		deflexical("*CYC-TEST-RESULT-VALUES*", append($cyc_test_result_success_values$.getGlobalValue(), $cyc_test_result_failure_values$.getGlobalValue(), $cyc_test_result_ignore_values$.getGlobalValue()));
		deflexical("*CYC-TEST-TYPE-TABLE*", $list8);
		defvar("*CYC-TESTS*", NIL);
		deflexical("*CYC-TEST-BY-NAME*", SubLSystemTrampolineFile.maybeDefault($cyc_test_by_name$, $cyc_test_by_name$, () -> make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED)));
		deflexical("*CYC-TEST-BY-DWIMMED-NAME*", SubLSystemTrampolineFile.maybeDefault($cyc_test_by_dwimmed_name$, $cyc_test_by_dwimmed_name$, () -> make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED)));
		defconstant("*DTP-CYC-TEST*", CYC_TEST);
		defparameter("*PRINT-POST-BUILD-TEST-SUMMARY-TIMESTAMP?*", T);
		defconstant("*CFASL-WIDE-OPCODE-CYC-TEST*", $int$514);
		deflexical("*CYC-TEST-FILES*", SubLSystemTrampolineFile.maybeDefault($cyc_test_files$, $cyc_test_files$, NIL));
		defconstant("*DTP-CYC-TEST-FILE*", CYC_TEST_FILE);
		deflexical("*MOST-RECENT-CYC-TEST-RUNS*", SubLSystemTrampolineFile.maybeDefault($most_recent_cyc_test_runs$, $most_recent_cyc_test_runs$, NIL));
		deflexical("*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*", SubLSystemTrampolineFile.maybeDefault($most_recent_cyc_test_file_load_failures$, $most_recent_cyc_test_file_load_failures$, NIL));
		return NIL;
	}

	public static SubLObject setup_cyc_testing_file() {
		declare_defglobal($cyc_test_by_name$);
		declare_defglobal($cyc_test_by_dwimmed_name$);
		register_method($print_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), symbol_function(CYC_TEST_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list37);
		def_csetf(CT_FILE, _CSETF_CT_FILE);
		def_csetf(CT_GUTS, _CSETF_CT_GUTS);
		identity(CYC_TEST);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CYC_TEST_METHOD));
		register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_cyc_test$.getGlobalValue(), CFASL_INPUT_CYC_TEST);
		register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD));
		declare_defglobal($cyc_test_files$);
		register_method($print_object_method_table$.getGlobalValue(), $dtp_cyc_test_file$.getGlobalValue(), symbol_function(CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list108);
		def_csetf(CTF_FILENAME, _CSETF_CTF_FILENAME);
		def_csetf(CTF_KB, _CSETF_CTF_KB);
		identity(CYC_TEST_FILE);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyc_test_file$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CYC_TEST_FILE_METHOD));
		declare_defglobal($most_recent_cyc_test_runs$);
		declare_defglobal($most_recent_cyc_test_file_load_failures$);
		register_macro_helper(DECLARE_CYC_TEST_FILE_INT, DECLARE_CYC_TEST_FILE);
		define_test_case_table_int(SERVER_SUMMARY, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
		define_test_case_table_int(KB_STATISTICS, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
		define_test_case_table_int(CYC_MEMORY_HOGS, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
		define_test_case_table_int(ALL_CYC_TESTS_ARE_VALID, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_cyc_testing_file();
	}

	@Override
	public void initializeVariables() {
		init_cyc_testing_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_cyc_testing_file();
	}

	public static final class $cyc_test_native extends SubLStructNative {
		public SubLObject $file;

		public SubLObject $guts;

		private static final SubLStructDeclNative structDecl;

		private $cyc_test_native() {
			this.$file = Lisp.NIL;
			this.$guts = Lisp.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return this.$file;
		}

		@Override
		public SubLObject getField3() {
			return this.$guts;
		}

		@Override
		public SubLObject setField2(final SubLObject value) {
			return this.$file = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value) {
			return this.$guts = value;
		}

		static {
			structDecl = makeStructDeclNative($cyc_test_native.class, CYC_TEST, CYC_TEST_P, $list31, $list32, new String[] { "$file", "$guts" }, $list33, $list34, PRINT_CYC_TEST);
		}
	}

	public static final class $cyc_test_p$UnaryFunction extends UnaryFunction {
		public $cyc_test_p$UnaryFunction() {
			super(extractFunctionNamed("CYC-TEST-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return cyc_test_p(arg1);
		}
	}

	public static final class $cyc_test_file_native extends SubLStructNative {
		public SubLObject $filename;

		public SubLObject $kb;

		private static final SubLStructDeclNative structDecl;

		private $cyc_test_file_native() {
			this.$filename = Lisp.NIL;
			this.$kb = Lisp.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return this.$filename;
		}

		@Override
		public SubLObject getField3() {
			return this.$kb;
		}

		@Override
		public SubLObject setField2(final SubLObject value) {
			return this.$filename = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value) {
			return this.$kb = value;
		}

		static {
			structDecl = makeStructDeclNative($cyc_test_file_native.class, CYC_TEST_FILE, CYC_TEST_FILE_P, $list102, $list103, new String[] { "$filename", "$kb" }, $list104, $list105, PRINT_CYC_TEST_FILE);
		}
	}

	public static final class $cyc_test_file_p$UnaryFunction extends UnaryFunction {
		public $cyc_test_file_p$UnaryFunction() {
			super(extractFunctionNamed("CYC-TEST-FILE-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return cyc_test_file_p(arg1);
		}
	}
}

/**
 * Total time: 586 ms synthetic
 */
