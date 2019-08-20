/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyc_testing;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.control_vars.$use_transcriptP$;
import static com.cyc.cycjava.cycl.control_vars.non_tiny_kb_loadedP;
import static com.cyc.cycjava.cycl.kb_utilities.kb_object_count_list;
import static com.cyc.cycjava.cycl.kb_utilities.kb_object_count_lists_new_assertion_count;
import static com.cyc.cycjava.cycl.kb_utilities.kb_object_count_lists_new_constant_count;
import static com.cyc.cycjava.cycl.kb_utilities.kb_object_count_lists_new_deduction_count;
import static com.cyc.cycjava.cycl.kb_utilities.kb_object_count_lists_new_kb_hl_support_count;
import static com.cyc.cycjava.cycl.kb_utilities.kb_object_count_lists_new_nart_count;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.subl_promotions.non_zero_integer_p;
import static com.cyc.cycjava.cycl.subl_promotions.positive_integer_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.load;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.put;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.caar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-TESTING
 * source file: /cyc/top/cycl/cyc-testing/inference-testing.lisp
 * created:     2019/07/03 17:37:42
 */
public final class inference_testing extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_testing();



    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_cyc_test_file$ = makeSymbol("*DEFAULT-CYC-TEST-FILE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $test_constants_created$ = makeSymbol("*TEST-CONSTANTS-CREATED*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $current_test$ = makeSymbol("*CURRENT-TEST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $test_status$ = makeSymbol("*TEST-STATUS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $test_results$ = makeSymbol("*TEST-RESULTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $break_on_failure$ = makeSymbol("*BREAK-ON-FAILURE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $break_on_failureP$ = makeSymbol("*BREAK-ON-FAILURE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $break_before_test_endP$ = makeSymbol("*BREAK-BEFORE-TEST-END?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $elapsed_time$ = makeSymbol("*ELAPSED-TIME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $it_verbose$ = makeSymbol("*IT-VERBOSE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $it_backchain$ = makeSymbol("*IT-BACKCHAIN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $it_number$ = makeSymbol("*IT-NUMBER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $it_time$ = makeSymbol("*IT-TIME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $it_depth$ = makeSymbol("*IT-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $test_direction$ = makeSymbol("*TEST-DIRECTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $verify_as_continuableP$ = makeSymbol("*VERIFY-AS-CONTINUABLE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $index_collection$ = makeSymbol("*INDEX-COLLECTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $debug_continue$ = makeSymbol("*DEBUG-CONTINUE*");

    // defparameter
    // Whether all failures should be reported regardless of @xref *it-verbose*
    /**
     * Whether all failures should be reported regardless of @xref *it-verbose*
     */
    @LispMethod(comment = "Whether all failures should be reported regardless of @xref *it-verbose*\ndefparameter")
    public static final SubLSymbol $it_show_all_failures$ = makeSymbol("*IT-SHOW-ALL-FAILURES*");



    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $time_inference_tests$ = makeSymbol("*TIME-INFERENCE-TESTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$inference_tests = makeString("inference-tests");

    static private final SubLString $$$lisp = makeString("lisp");

    static private final SubLList $list2 = list(makeString("tests"));

    static private final SubLString $str4$___s = makeString("~%~s");

    static private final SubLString $str5$__No_assertions_found_ = makeString("~%No assertions found.");

    static private final SubLString $str9$_____s = makeString("~&  ~s");

    private static final SubLString $str10$__Success___s________________s = makeString("~&Success: ~s~%         ==> ~s");

    private static final SubLString $str12$__Failure___s________________s = makeString("~&Failure: ~s~%         ==> ~s");

    static private final SubLString $str13$Failure___s________________s = makeString("Failure: ~s~%         ==> ~s");

    private static final SubLString $str14$__Success___s________________s__ = makeString("~&Success: ~s~%         ==> ~s~%");

    private static final SubLString $str15$__Failure___s________________s__ = makeString("~&Failure: ~s~%         ==> ~s~%");

    static private final SubLString $str17$_A = makeString("~A");

    private static final SubLString $str18$__Success___A__ = makeString("~&Success: ~A~%");

    private static final SubLString $str19$__Failure___s_______________NO_ER = makeString("~&Failure: ~s~%         ==> NO ERROR~%");

    private static final SubLString $str20$__Failure___A__ = makeString("~&Failure: ~A~%");

    private static final SubLString $str21$__Success___s_______________NO_ER = makeString("~&Success: ~s~%         ==> NO ERROR~%");

    private static final SubLString $str22$__Success___s________________s__C = makeString("~&Success: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s");

    private static final SubLString $str23$__Failure___s________________s__C = makeString("~&Failure: ~s~%         ==> ~s~%Compared against desired value : ~s~%Test function: ~s");

    static private final SubLString $str24$Failure___s________________s__Com = makeString("Failure: ~s~%         ==> ~s~%Compared against desired value: ~s~%Test function: ~s");

    private static final SubLString $str27$__Success___s________________s__p = makeString("~&Success: ~s~%         ==> ~s  passes ~s");

    private static final SubLString $str28$__Failure___s________________s_fa = makeString("~&Failure: ~s~%         ==> ~s fails ~s");

    static private final SubLString $str29$Failure___s________________s_fail = makeString("Failure: ~s~%         ==> ~s fails ~s");

    private static final SubLSymbol RETURN_LIST_OF_VALUES = makeSymbol("RETURN-LIST-OF-VALUES");

    private static final SubLString $str31$__Normal___s_______________s__Exp = makeString("~&Normal: ~s~%        ==> ~s~%Expected: ~s");

    private static final SubLString $str33$__Abnormal___s_________________s_ = makeString("~&Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s");

    static private final SubLString $str34$Abnormal___s_________________s__E = makeString("Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s");

    private static final SubLSymbol EQUAL_BINDINGS = makeSymbol("EQUAL-BINDINGS");

    private static final SubLString $str36$__Abnormal___s_______________s__E = makeString("~&Abnormal: ~s~%        ==> ~s~%Expected: ~s");

    static private final SubLString $str37$Abnormal___s_______________s__Exp = makeString("Abnormal: ~s~%        ==> ~s~%Expected: ~s");

    private static final SubLSymbol CYC_ASSERT = makeSymbol("CYC-ASSERT");

    private static final SubLString $str42$__Failure__Assertion__s_failed_ = makeString("~&Failure: Assertion ~s failed.");

    static private final SubLString $str43$Failure__Assertion__s_failed_ = makeString("Failure: Assertion ~s failed.");

    private static final SubLSymbol CYC_ASSERT_WFF = makeSymbol("CYC-ASSERT-WFF");

    private static final SubLString $str47$___A__ = makeString("~&~A~%");

    private static final SubLString $str48$___s_constant_A__A__ = makeString("  ~s constant~A ~A~%");

    private static final SubLString $$$s_were = makeString("s were");

    private static final SubLString $$$_was = makeString(" was");

    private static final SubLString $$$created = makeString("created");

    private static final SubLString $$$destroyed = makeString("destroyed");

    private static final SubLString $str53$___s_nart_A__A__ = makeString("  ~s nart~A ~A~%");

    private static final SubLString $str54$___s_assertion_A__A__ = makeString("  ~s assertion~A ~A~%");

    private static final SubLString $str55$___s_kb_hl_support_A__A__ = makeString("  ~s kb-hl-support~A ~A~%");

    private static final SubLString $str56$___s_deduction_A__A__ = makeString("  ~s deduction~A ~A~%");

    private static final SubLString $str57$__Assert_time____A = makeString("~%Assert time = ~A");

    private static final SubLSymbol FI_UNASSERT_INT = makeSymbol("FI-UNASSERT-INT");

    private static final SubLSymbol FI_BLAST_INT = makeSymbol("FI-BLAST-INT");

    private static final SubLSymbol FI_JUSTIFY_INT = makeSymbol("FI-JUSTIFY-INT");

    private static final SubLString $str61$__Justification_____s = makeString("~%Justification => ~s");

    private static final SubLSymbol FI_KILL_INT = makeSymbol("FI-KILL-INT");

    private static final SubLSymbol FI_FIND_OR_CREATE_INT = makeSymbol("FI-FIND-OR-CREATE-INT");

    private static final SubLString $str64$__Failure__Did_not_find_unique_na = makeString("~&Failure: Did not find unique name to create a constant for ~s.");

    private static final SubLString $str65$Failure__Create_constant__s_faile = makeString("Failure: Create constant ~s failed.");

    private static final SubLSymbol FI_TMS_RECONSIDER_FORMULA_INT = makeSymbol("FI-TMS-RECONSIDER-FORMULA-INT");

    private static final SubLSymbol FI_TMS_RECONSIDER_MT_INT = makeSymbol("FI-TMS-RECONSIDER-MT-INT");

    private static final SubLSymbol $TRANSMIT_AND_RECEIVE = makeKeyword("TRANSMIT-AND-RECEIVE");

    private static final SubLString $str73$___IT___S__S_ = makeString("~&:IT (~S ~S)");

    private static final SubLString $str75$_____Starting__IT___S__S__at__A__ = makeString("~&;; Starting :IT (~S ~S) at ~A~&");

    private static final SubLString $str77$_____s____3f_ = makeString(" -> ~s (~,3f)");

    private static final SubLString $str79$Warning__Test__ = makeString("Warning: Test (");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str81$__changed_the_KB_ = makeString(") changed the KB!");

    private static final SubLString $str82$__There_is_no_test_in__s_associat = makeString("~&There is no test in ~s associated with ~s.~%");

    public static final SubLSymbol $inference_tests$ = makeSymbol("*INFERENCE-TESTS*");

    private static final SubLString $str84$__In_fact__there_are_no_tests_in_ = makeString("~&In fact, there are no tests in ~s at all!~%");

    private static final SubLString $str85$__The__s_argument_is__s__which_is = makeString("~%The ~s argument is ~s, which is not a list of test keywords.");

    private static final SubLSymbol KEYWORD_LIST = makeSymbol("KEYWORD-LIST");

    private static final SubLSymbol $sym87$TERM__ = makeSymbol("TERM-<");

    private static final SubLString $str89$__ = makeString("~%");

    private static final SubLString $str90$__ = makeString("->");

    private static final SubLString $str91$_IT = makeString(":IT");

    private static final SubLString $str92$Unknown_output_format__A = makeString("Unknown output format ~A");

    private static final SubLString $str93$___s__a__s = makeString("~%~s ~a ~s");

    private static final SubLString $str94$___s_____s = makeString("~%~s -> ~s");

    private static final SubLList $list95 = list(makeSymbol("FORM"), makeSymbol("&OPTIONAL"), makeSymbol("KEYWORD"), list(makeSymbol("KEYWORD-TEST"), list(QUOTE, list(makeSymbol("FUNCTION"), EQUAL))), makeSymbol("MESSAGE"), makeSymbol("MESSAGE-LIST"));

    private static final SubLList $list96 = list(makeSymbol("FUNCTION"), EQUAL);

    public static final SubLSymbol $evaluate_previously_failing_tests$ = makeSymbol("*EVALUATE-PREVIOUSLY-FAILING-TESTS*");

    public static final SubLSymbol $check_all_it_bug_types$ = makeSymbol("*CHECK-ALL-IT-BUG-TYPES*");

    public static final SubLSymbol $known_bug_types_to_check$ = makeSymbol("*KNOWN-BUG-TYPES-TO-CHECK*");

    public static final SubLSymbol $it_failing_verbose$ = makeSymbol("*IT-FAILING-VERBOSE*");

    private static final SubLList $list108 = list(list(makeSymbol("*IT-VERBOSE*"), T), list(makeSymbol("*TEST-STATUS*"), NIL));

    private static final SubLString $str110$__The_previously_failing_test____ = makeString("~&The previously failing test~%  ~s~%of type ~s was evaluated immediately after this.~%");

    private static final SubLList $list114 = list(makeSymbol("FUNCTION"), makeSymbol("FORMAT"));

    private static final SubLString $str116$__This_previously_failing_test___ = makeString("~&This previously failing test~%  ~s~%of type ~s was not evaluated.~%");

    private static final SubLString $str117$__This_previously_failing_test___ = makeString("~&This previously failing test~%  ~s~%was not evaluated.~%");

    private static final SubLString $str118$__Starting__a____ = makeString("~&Starting ~a ...");

    private static final SubLSymbol DEF_INFERENCE_TEST = makeSymbol("DEF-INFERENCE-TEST");

    private static final SubLSymbol DEFINE_INFERENCE_TEST = makeSymbol("DEFINE-INFERENCE-TEST");

    private static final SubLSymbol $sym121$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    private static final SubLString $str123$_s = makeString("~s");

    private static final SubLString $str124$_s_is_not_an_accessible_pathname_ = makeString("~s is not an accessible pathname.");

    private static final SubLSymbol $sym125$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol $sym126$OBJ__STRING = makeSymbol("OBJ->STRING");

    private static final SubLString $str127$___ERROR__LOADING__A__S = makeString("~%:ERROR :LOADING ~A ~S");

    private static final SubLString $str128$___s_is_bound_to__s__which_is_not = makeString("~%~s is bound to ~s, which is not known to be a valid pathname.");

    private static final SubLList $list130 = list(makeSymbol("SPECIAL?"), makeSymbol("VAR-SPECS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol VAR_SPEC_VAR = makeSymbol("VAR-SPEC-VAR");

    private static final SubLSymbol $sym132$TEST_CONSTANTS = makeUninternedSymbol("TEST-CONSTANTS");

    private static final SubLSymbol PRINT_CREATE_VAR_SPEC_CONSTANT = makeSymbol("PRINT-CREATE-VAR-SPEC-CONSTANT");

    private static final SubLSymbol PRINT_ASSERT = makeSymbol("PRINT-ASSERT");

    private static final SubLSymbol VAR_SPEC_DEF = makeSymbol("VAR-SPEC-DEF");

    private static final SubLList $list139 = list(makeSymbol("*DEFAULT-ASSERT-MT*"), makeKeyword("MONOTONIC"), makeKeyword("FORWARD"));

    private static final SubLList $list140 = list(makeSymbol("PWHEN"), makeSymbol("*BREAK-BEFORE-TEST-END?*"), list(makeSymbol("BREAK"), makeString("Test ~A before cleanup"), makeSymbol("*CURRENT-TEST*")));

    public static final SubLSymbol $clean_up_test_constantsP$ = makeSymbol("*CLEAN-UP-TEST-CONSTANTS?*");

    private static final SubLSymbol PRINT_KILL = makeSymbol("PRINT-KILL");

    private static final SubLList $list143 = list(makeSymbol("SPECIAL?"), makeSymbol("MT"), makeSymbol("TRUTH-VALUE"), makeSymbol("DIRECTION"), makeSymbol("VAR-SPECS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym144$TEST_ASSERTIONS = makeUninternedSymbol("TEST-ASSERTIONS");

    private static final SubLSymbol PRINT_UNASSERT = makeSymbol("PRINT-UNASSERT");

    private static final SubLSymbol $sym146$TEST_ASSERTIONS = makeUninternedSymbol("TEST-ASSERTIONS");

    static private final SubLList $list148 = list(makeSymbol("NAME"), makeSymbol("VARS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym149$ARGLIST = makeUninternedSymbol("ARGLIST");

    private static final SubLSymbol $sym151$_REST = makeSymbol("&REST");

    static private final SubLList $list154 = list(QUOTE, makeSymbol("CDESTRUCTURING-BIND"));

    private static final SubLList $list156 = list(QUOTE, makeSymbol("LIST"));

    private static final SubLList $list158 = list(NIL);

    private static final SubLList $list159 = list(QUOTE, makeSymbol("PWHEN"));

    static private final SubLList $list160 = list(QUOTE, makeSymbol("*IT-VERBOSE*"));

    static private final SubLList $list161 = list(QUOTE, makeSymbol("FORMAT"));

    private static final SubLString $str162$___________A__S = makeString("~&~%>>>>> ~A ~S");

    private static final SubLList $list163 = list(QUOTE, makeSymbol("PROGN"));

    private static final SubLString $str164$___________A__S = makeString("~&~%<<<<< ~A ~S");

    private static final SubLSymbol B_VERIFY = makeSymbol("B-VERIFY");

    private static final SubLList $list166 = list(makeSymbol("TEST-NAME"), list(new SubLObject[]{ makeSymbol("&KEY"), list(makeSymbol("DIRECTION"), makeKeyword("BACKWARD")), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("COMMENT"), makeSymbol("BUG"), makeSymbol("CREATED"), makeSymbol("CREATOR"), list(makeSymbol("WORKING?"), T) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list167 = list(makeKeyword("DIRECTION"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("COMMENT"), makeKeyword("BUG"), makeKeyword("CREATED"), makeKeyword("CREATOR"), makeKeyword("WORKING?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLList $list176 = list(makeSymbol("HERALD-START"));

    private static final SubLSymbol $sym178$RUN_INFERENCE_TEST_ = makeSymbol("RUN-INFERENCE-TEST?");

    private static final SubLList $list179 = list(list(makeSymbol("CSETQ"), makeSymbol("*TEST-STATUS*"), makeKeyword("NOT-RUN")));

    private static final SubLSymbol $sym180$INFERENCE_TEST_MENTIONS_INVALID_CONSTANT_ = makeSymbol("INFERENCE-TEST-MENTIONS-INVALID-CONSTANT?");

    private static final SubLList $list181 = list(list(makeSymbol("CSETQ"), makeSymbol("*TEST-STATUS*"), makeKeyword("INVALID")));

    static private final SubLList $list182 = list(list(makeSymbol("UPDATE-TEST-RESULTS"), makeSymbol("*CURRENT-TEST*")));

    private static final SubLSymbol NEW_INFERENCE_TEST = makeSymbol("NEW-INFERENCE-TEST");

    private static final SubLList $list188 = list(makeKeyword("FORWARD"), makeKeyword("BACKWARD"), $BOTH);

    private static final SubLSymbol INFERENCE_TEST_DIRECTION_P = makeSymbol("INFERENCE-TEST-DIRECTION-P");

    private static final SubLSymbol INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");

    private static final SubLSymbol $sym198$INFERENCE_TEST_WORKING_ = makeSymbol("INFERENCE-TEST-WORKING?");

    private static final SubLSymbol DEF_TIME_INFERENCE_TEST = makeSymbol("DEF-TIME-INFERENCE-TEST");

    private static final SubLSymbol DEFINED_TIME_INFERENCE_TESTS = makeSymbol("DEFINED-TIME-INFERENCE-TESTS");

    private static final SubLSymbol DO_TIME_TESTS_BACKWARD = makeSymbol("DO-TIME-TESTS-BACKWARD");

    public static final SubLObject construct_cyc_test_filename_alt(SubLObject name, SubLObject suffix) {
        if (name == UNPROVIDED) {
            name = $default_cyc_test_file$.getDynamicValue();
        }
        if (suffix == UNPROVIDED) {
            suffix = $$$lisp;
        }
        return file_utilities.cyc_home_filename($list_alt2, name, suffix);
    }

    public static SubLObject construct_cyc_test_filename(SubLObject name, SubLObject suffix) {
        if (name == UNPROVIDED) {
            name = $default_cyc_test_file$.getDynamicValue();
        }
        if (suffix == UNPROVIDED) {
            suffix = $$$lisp;
        }
        return file_utilities.cyc_home_filename($list2, name, suffix);
    }

    public static SubLObject break_on_failureP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $break_on_failure$.getDynamicValue(thread)) || (NIL != $break_on_failureP$.getDynamicValue(thread)));
    }

    /**
     * Return a list of values satisfying SENTENCE.  If there is more than
     * one variable in SENTENCE, then a list of constant lists is returned
     */
    @LispMethod(comment = "Return a list of values satisfying SENTENCE.  If there is more than\r\none variable in SENTENCE, then a list of constant lists is returned\nReturn a list of values satisfying SENTENCE.  If there is more than\none variable in SENTENCE, then a list of constant lists is returned")
    public static final SubLObject return_list_of_values_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            SubLObject v_bindings = inference_kernel.new_cyc_query(sentence, mt, query_properties);
            SubLObject constants = NIL;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject bl = NIL;
            for (bl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bl = cdolist_list_var.first()) {
                if (length(bl).numG(ONE_INTEGER)) {
                    constants = cons(bindings.bindings_values(bl), constants);
                } else {
                    constants = append(bindings.bindings_values(bl), constants);
                }
            }
            return constants;
        }
    }

    /**
     * Return a list of values satisfying SENTENCE.  If there is more than
     * one variable in SENTENCE, then a list of constant lists is returned
     */
    @LispMethod(comment = "Return a list of values satisfying SENTENCE.  If there is more than\r\none variable in SENTENCE, then a list of constant lists is returned\nReturn a list of values satisfying SENTENCE.  If there is more than\none variable in SENTENCE, then a list of constant lists is returned")
    public static SubLObject return_list_of_values(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject v_bindings = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        SubLObject constants = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject bl = NIL;
        bl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (length(bl).numG(ONE_INTEGER)) {
                constants = cons(bindings.bindings_values(bl), constants);
            } else {
                constants = append(bindings.bindings_values(bl), constants);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bl = cdolist_list_var.first();
        } 
        return constants;
    }

    public static final SubLObject list_assertions_alt(SubLObject query, SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == UNPROVIDED) {
            backchainP = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject v_bindings = fi.fi_ask_int(query, mt, backchainP, number, time, depth);
            SubLObject assertions = NIL;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject bl = NIL;
            for (bl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bl = cdolist_list_var.first()) {
                assertions = cons(sublis(bl, query, symbol_function(EQUAL), UNPROVIDED), assertions);
            }
            return assertions;
        }
    }

    public static SubLObject list_assertions(final SubLObject query, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == UNPROVIDED) {
            backchainP = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject v_bindings = fi.fi_ask_int(query, mt, backchainP, number, time, depth);
        SubLObject assertions = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject bl = NIL;
        bl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assertions = cons(sublis(bl, query, symbol_function(EQUAL), UNPROVIDED), assertions);
            cdolist_list_var = cdolist_list_var.rest();
            bl = cdolist_list_var.first();
        } 
        return assertions;
    }

    public static final SubLObject print_assertions_alt(SubLObject query, SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth, SubLObject stream) {
        if (backchainP == UNPROVIDED) {
            backchainP = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject assertions = com.cyc.cycjava.cycl.cyc_testing.inference_testing.list_assertions(query, mt, backchainP, number, time, depth);
            if (NIL != assertions) {
                {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject as = NIL;
                    for (as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , as = cdolist_list_var.first()) {
                        format(stream, $str_alt4$___s, as);
                    }
                }
            } else {
                format(stream, $str_alt5$__No_assertions_found_);
            }
            return NIL;
        }
    }

    public static SubLObject print_assertions(final SubLObject query, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth, SubLObject stream) {
        if (backchainP == UNPROVIDED) {
            backchainP = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject assertions = list_assertions(query, mt, backchainP, number, time, depth);
        if (NIL != assertions) {
            SubLObject cdolist_list_var = assertions;
            SubLObject as = NIL;
            as = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(stream, $str4$___s, as);
                cdolist_list_var = cdolist_list_var.rest();
                as = cdolist_list_var.first();
            } 
        } else {
            format(stream, $str5$__No_assertions_found_);
        }
        return NIL;
    }

    public static final SubLObject instanceofP_alt(SubLObject x, SubLObject collection) {
        return isa.isa_in_any_mtP(x, collection);
    }

    public static SubLObject instanceofP(final SubLObject x, final SubLObject collection) {
        return isa.isa_in_any_mtP(x, collection);
    }

    /**
     * Boolean test: does fi-ask-int return something, or not?
     */
    @LispMethod(comment = "Boolean test: does fi-ask-int return something, or not?")
    public static final SubLObject legacy_b_verify_alt(SubLObject query_expr, SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == UNPROVIDED) {
            backchainP = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchainP, number, time, depth);
            return com.cyc.cycjava.cycl.cyc_testing.inference_testing.b_verify(query_expr, mt, query_properties);
        }
    }

    /**
     * Boolean test: does fi-ask-int return something, or not?
     */
    @LispMethod(comment = "Boolean test: does fi-ask-int return something, or not?")
    public static SubLObject legacy_b_verify(final SubLObject query_expr, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == UNPROVIDED) {
            backchainP = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchainP, number, time, depth);
        return b_verify(query_expr, mt, query_properties);
    }

    /**
     * Boolean test: does new-cyc-query return something, or not?
     */
    @LispMethod(comment = "Boolean test: does new-cyc-query return something, or not?")
    public static final SubLObject b_verify_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                query_properties = putf(query_properties, $CONTINUABLE_, NIL);
                {
                    SubLObject form = list(NEW_CYC_QUERY, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
                    if (NIL != $it_verbose$.getDynamicValue(thread)) {
                        format(T, $str_alt9$_____s, form);
                    }
                    {
                        SubLObject val = eval(form);
                        if (NIL != val) {
                            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                                format(T, $str_alt10$____Success___s________________s, form, val);
                            }
                        } else {
                            $test_status$.setDynamicValue($FAILURE, thread);
                            if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                                format(T, $str_alt12$____Failure___s________________s, form, val);
                            }
                            if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                                Errors.sublisp_break($str_alt13$Failure___s________________s, new SubLObject[]{ form, val });
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Boolean test: does new-cyc-query return something, or not?
     */
    @LispMethod(comment = "Boolean test: does new-cyc-query return something, or not?")
    public static SubLObject b_verify(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            query_properties = putf(query_properties, $CONTINUABLE_, $verify_as_continuableP$.getDynamicValue(thread));
            final SubLObject form = list(NEW_CYC_QUERY, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, form);
            }
            final SubLObject val = eval(form);
            if (NIL != val) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str10$__Success___s________________s, form, val);
                }
            } else {
                $test_status$.setDynamicValue($FAILURE, thread);
                if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                    format(T, $str12$__Failure___s________________s, form, val);
                }
                if (NIL != break_on_failureP()) {
                    Errors.sublisp_break($str13$Failure___s________________s, new SubLObject[]{ form, val });
                }
            }
        }
        return NIL;
    }

    public static final SubLObject print_and_eval_alt(SubLObject expr_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                {
                    SubLObject cdolist_list_var = expr_list;
                    SubLObject expr = NIL;
                    for (expr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expr = cdolist_list_var.first()) {
                        if (NIL != $it_verbose$.getDynamicValue(thread)) {
                            format(T, $str_alt9$_____s, expr);
                        }
                        eval(expr);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_and_eval(final SubLObject expr_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            SubLObject cdolist_list_var = expr_list;
            SubLObject expr = NIL;
            expr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str9$_____s, expr);
                }
                eval(expr);
                cdolist_list_var = cdolist_list_var.rest();
                expr = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject b_test_form_alt(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str_alt9$_____s, form);
                }
                {
                    SubLObject returned = eval(form);
                    if (NIL != returned) {
                        if (NIL != $it_verbose$.getDynamicValue(thread)) {
                            format(T, $str_alt14$____Success___s________________s_, form, returned);
                        }
                    } else {
                        $test_status$.setDynamicValue($FAILURE, thread);
                        if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                            format(T, $str_alt15$____Failure___s________________s_, form, returned);
                        }
                        if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                            Errors.sublisp_break($str_alt13$Failure___s________________s, new SubLObject[]{ form, returned });
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject b_test_form(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, form);
            }
            final SubLObject returned = eval(form);
            if (NIL != returned) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str14$__Success___s________________s__, form, returned);
                }
            } else {
                $test_status$.setDynamicValue($FAILURE, thread);
                if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                    format(T, $str15$__Failure___s________________s__, form, returned);
                }
                if (NIL != break_on_failureP()) {
                    Errors.sublisp_break($str13$Failure___s________________s, new SubLObject[]{ form, returned });
                }
            }
        }
        return NIL;
    }

    /**
     * Supports testing forms which trigger errors.  Example:
     *
     * Command : (test-error '(/ 4 0))
     *
     * (/ 4 0)
     * Success: There was an attempt to divide by zero in SYS:RATIONAL-QUOTIENT.
     */
    @LispMethod(comment = "Supports testing forms which trigger errors.  Example:\r\n\r\nCommand : (test-error \'(/ 4 0))\r\n\r\n(/ 4 0)\r\nSuccess: There was an attempt to divide by zero in SYS:RATIONAL-QUOTIENT.\nSupports testing forms which trigger errors.  Example:\n\nCommand : (test-error \'(/ 4 0))\n\n(/ 4 0)\nSuccess: There was an attempt to divide by zero in SYS:RATIONAL-QUOTIENT.")
    public static final SubLObject test_error_alt(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str_alt9$_____s, form);
                }
                {
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    {
                                        SubLObject _prev_bind_0_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                                        try {
                                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                                            eval(form);
                                            if (NIL != fi.fi_error_signaledP()) {
                                                Errors.error($str_alt17$_A, fi.fi_get_error_string_int());
                                            }
                                        } finally {
                                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != error_message) {
                        if (NIL != $it_verbose$.getDynamicValue(thread)) {
                            format(T, $str_alt18$____Success___A__, error_message);
                        }
                    } else {
                        $test_status$.setDynamicValue($FAILURE, thread);
                        if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                            format(T, $str_alt19$____Failure___s_______________NO_, form);
                        }
                        if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                            Errors.sublisp_break($str_alt19$____Failure___s_______________NO_, new SubLObject[]{ form });
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Supports testing forms which trigger errors.  Example:
     *
     * Command : (test-error '(/ 4 0))
     *
     * (/ 4 0)
     * Success: There was an attempt to divide by zero in SYS:RATIONAL-QUOTIENT.
     */
    @LispMethod(comment = "Supports testing forms which trigger errors.  Example:\r\n\r\nCommand : (test-error \'(/ 4 0))\r\n\r\n(/ 4 0)\r\nSuccess: There was an attempt to divide by zero in SYS:RATIONAL-QUOTIENT.\nSupports testing forms which trigger errors.  Example:\n\nCommand : (test-error \'(/ 4 0))\n\n(/ 4 0)\nSuccess: There was an attempt to divide by zero in SYS:RATIONAL-QUOTIENT.")
    public static SubLObject test_error(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, form);
            }
            SubLObject error_message = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                        try {
                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                            eval(form);
                            if (NIL != fi.fi_error_signaledP()) {
                                Errors.error($str17$_A, fi.fi_get_error_string_int());
                            }
                        } finally {
                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0_$1, thread);
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
            if (NIL != error_message) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str18$__Success___A__, error_message);
                }
            } else {
                $test_status$.setDynamicValue($FAILURE, thread);
                if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                    format(T, $str19$__Failure___s_______________NO_ER, form);
                }
                if (NIL != break_on_failureP()) {
                    Errors.sublisp_break($str19$__Failure___s_______________NO_ER, new SubLObject[]{ form });
                }
            }
        }
        return NIL;
    }

    /**
     * Supports testing forms which trigger api warnings.
     */
    @LispMethod(comment = "Supports testing forms which trigger api warnings.")
    public static final SubLObject test_warning_alt(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str_alt9$_____s, form);
                }
                {
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    {
                                        SubLObject _prev_bind_0_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                                        try {
                                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                                            eval(form);
                                            if (NIL != fi.fi_warning_signaledP()) {
                                                Errors.error($str_alt17$_A, fi.fi_get_warning_int());
                                            }
                                        } finally {
                                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != error_message) {
                        if (NIL != $it_verbose$.getDynamicValue(thread)) {
                            format(T, $str_alt18$____Success___A__, error_message);
                        }
                    } else {
                        $test_status$.setDynamicValue($FAILURE, thread);
                        if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                            format(T, $str_alt19$____Failure___s_______________NO_, form);
                        }
                        if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                            Errors.sublisp_break($str_alt19$____Failure___s_______________NO_, new SubLObject[]{ form });
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Supports testing forms which trigger api warnings.
     */
    @LispMethod(comment = "Supports testing forms which trigger api warnings.")
    public static SubLObject test_warning(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, form);
            }
            SubLObject error_message = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                        try {
                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                            eval(form);
                            if (NIL != fi.fi_warning_signaledP()) {
                                Errors.error($str17$_A, fi.fi_get_warning_int());
                            }
                        } finally {
                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0_$2, thread);
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
            if (NIL != error_message) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str18$__Success___A__, error_message);
                }
            } else {
                $test_status$.setDynamicValue($FAILURE, thread);
                if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                    format(T, $str19$__Failure___s_______________NO_ER, form);
                }
                if (NIL != break_on_failureP()) {
                    Errors.sublisp_break($str19$__Failure___s_______________NO_ER, new SubLObject[]{ form });
                }
            }
        }
        return NIL;
    }

    /**
     * Supports testing forms which shouldnt trigger api warnings.
     */
    @LispMethod(comment = "Supports testing forms which shouldnt trigger api warnings.")
    public static final SubLObject test_no_warning_alt(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str_alt9$_____s, form);
                }
                {
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    {
                                        SubLObject _prev_bind_0_3 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                                        try {
                                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                                            eval(form);
                                            if (NIL != fi.fi_warning_signaledP()) {
                                                Errors.error($str_alt17$_A, fi.fi_get_warning_int());
                                            }
                                        } finally {
                                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != error_message) {
                        $test_status$.setDynamicValue($FAILURE, thread);
                        if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                            format(T, $str_alt20$____Failure___A__, error_message);
                        }
                        if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                            Errors.sublisp_break($str_alt19$____Failure___s_______________NO_, new SubLObject[]{ form });
                        }
                    } else {
                        if (NIL != $it_verbose$.getDynamicValue(thread)) {
                            format(T, $str_alt21$____Success___s_______________NO_);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Supports testing forms which shouldnt trigger api warnings.
     */
    @LispMethod(comment = "Supports testing forms which shouldnt trigger api warnings.")
    public static SubLObject test_no_warning(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, form);
            }
            SubLObject error_message = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$3 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                        try {
                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                            eval(form);
                            if (NIL != fi.fi_warning_signaledP()) {
                                Errors.error($str17$_A, fi.fi_get_warning_int());
                            }
                        } finally {
                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0_$3, thread);
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
            if (NIL != error_message) {
                $test_status$.setDynamicValue($FAILURE, thread);
                if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                    format(T, $str20$__Failure___A__, error_message);
                }
                if (NIL != break_on_failureP()) {
                    Errors.sublisp_break($str19$__Failure___s_______________NO_ER, new SubLObject[]{ form });
                }
            } else
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str21$__Success___s_______________NO_ER);
                }

        }
        return NIL;
    }

    /**
     * Example:
     *
     * Command: (form-verify 'equal 2 '(- 5 3))
     *
     * (- 5 3)
     *
     * Success: (- 5 3)
     * ==> 2
     * Compared against: 2
     * Test function: EQUAL
     */
    @LispMethod(comment = "Example:\r\n\r\nCommand: (form-verify \'equal 2 \'(- 5 3))\r\n\r\n(- 5 3)\r\n\r\nSuccess: (- 5 3)\r\n==> 2\r\nCompared against: 2\r\nTest function: EQUAL\nExample:\n\nCommand: (form-verify \'equal 2 \'(- 5 3))\n\n(- 5 3)\n\nSuccess: (- 5 3)\n==> 2\nCompared against: 2\nTest function: EQUAL")
    public static final SubLObject form_verify_alt(SubLObject test_function, SubLObject value, SubLObject form_to_eval, SubLObject test_predicate) {
        if (test_predicate == UNPROVIDED) {
            test_predicate = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str_alt9$_____s, form_to_eval);
                }
                {
                    SubLObject returned = eval(form_to_eval);
                    if (NIL != (NIL != test_predicate ? ((SubLObject) (funcall(test_function, value, returned, test_predicate))) : funcall(test_function, value, returned))) {
                        if (NIL != $it_verbose$.getDynamicValue(thread)) {
                            format(T, $str_alt22$____Success___s________________s_, new SubLObject[]{ form_to_eval, returned, value, test_function });
                        }
                    } else {
                        $test_status$.setDynamicValue($FAILURE, thread);
                        if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                            format(T, $str_alt23$____Failure___s________________s_, new SubLObject[]{ form_to_eval, returned, value, test_function });
                        }
                        if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                            Errors.sublisp_break($str_alt24$Failure___s________________s__Com, new SubLObject[]{ form_to_eval, returned, value, test_function });
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Example:
     *
     * Command: (form-verify 'equal 2 '(- 5 3))
     *
     * (- 5 3)
     *
     * Success: (- 5 3)
     * ==> 2
     * Compared against: 2
     * Test function: EQUAL
     */
    @LispMethod(comment = "Example:\r\n\r\nCommand: (form-verify \'equal 2 \'(- 5 3))\r\n\r\n(- 5 3)\r\n\r\nSuccess: (- 5 3)\r\n==> 2\r\nCompared against: 2\r\nTest function: EQUAL\nExample:\n\nCommand: (form-verify \'equal 2 \'(- 5 3))\n\n(- 5 3)\n\nSuccess: (- 5 3)\n==> 2\nCompared against: 2\nTest function: EQUAL")
    public static SubLObject form_verify(final SubLObject test_function, final SubLObject value, final SubLObject form_to_eval, SubLObject test_predicate) {
        if (test_predicate == UNPROVIDED) {
            test_predicate = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, form_to_eval);
            }
            final SubLObject returned = eval(form_to_eval);
            if (NIL != (NIL != test_predicate ? funcall(test_function, value, returned, test_predicate) : funcall(test_function, value, returned))) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str22$__Success___s________________s__C, new SubLObject[]{ form_to_eval, returned, value, test_function });
                }
            } else {
                $test_status$.setDynamicValue($FAILURE, thread);
                if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                    format(T, $str23$__Failure___s________________s__C, new SubLObject[]{ form_to_eval, returned, value, test_function });
                }
                if (NIL != break_on_failureP()) {
                    Errors.sublisp_break($str24$Failure___s________________s__Com, new SubLObject[]{ form_to_eval, returned, value, test_function });
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @deprecated Apply PREDICATE to the evaluated FORM-TO-EVAL.
    test-status* is set to :failure if PREDICATE application returns non-nil.
     */
    @LispMethod(comment = "@deprecated Apply PREDICATE to the evaluated FORM-TO-EVAL.\r\ntest-status* is set to :failure if PREDICATE application returns non-nil.")
    public static final SubLObject test_verify_alt(SubLObject predicate, SubLObject form_to_eval) {
        return com.cyc.cycjava.cycl.cyc_testing.inference_testing.test_verify_guts(predicate, form_to_eval, $EVAL_AGAIN);
    }

    /**
     *
     *
     * @deprecated Apply PREDICATE to the evaluated FORM-TO-EVAL.
    test-status* is set to :failure if PREDICATE application returns non-nil.
     */
    @LispMethod(comment = "@deprecated Apply PREDICATE to the evaluated FORM-TO-EVAL.\r\ntest-status* is set to :failure if PREDICATE application returns non-nil.")
    public static SubLObject test_verify(final SubLObject predicate, final SubLObject form_to_eval) {
        return test_verify_guts(predicate, form_to_eval, $EVAL_AGAIN);
    }

    /**
     * version of @xref test-verify that doesn't evaluate the form twice
     *
     * @unknown replace test-verify with this version
     * @unknown tom
     */
    @LispMethod(comment = "version of @xref test-verify that doesn\'t evaluate the form twice\r\n\r\n@unknown replace test-verify with this version\r\n@unknown tom")
    public static final SubLObject test_verify_new_alt(SubLObject predicate, SubLObject form_to_eval) {
        return com.cyc.cycjava.cycl.cyc_testing.inference_testing.test_verify_guts(predicate, form_to_eval, $APPLY);
    }

    /**
     * version of @xref test-verify that doesn't evaluate the form twice
     *
     * @unknown replace test-verify with this version
     * @unknown tom
     */
    @LispMethod(comment = "version of @xref test-verify that doesn\'t evaluate the form twice\r\n\r\n@unknown replace test-verify with this version\r\n@unknown tom")
    public static SubLObject test_verify_new(final SubLObject predicate, final SubLObject form_to_eval) {
        return test_verify_guts(predicate, form_to_eval, $APPLY);
    }

    public static final SubLObject test_verify_guts_alt(SubLObject predicate, SubLObject form_to_eval, SubLObject eval_method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                {
                    SubLObject evaluated_form = eval(form_to_eval);
                    SubLObject results = (eval_method == $EVAL_AGAIN) ? ((SubLObject) (eval(list(predicate, evaluated_form)))) : apply(predicate, list(evaluated_form));
                    if (NIL != results) {
                        if (NIL != $it_verbose$.getDynamicValue(thread)) {
                            format(T, $str_alt27$____Success___s________________s_, new SubLObject[]{ form_to_eval, evaluated_form, predicate });
                        }
                    } else {
                        $test_status$.setDynamicValue($FAILURE, thread);
                        if (NIL != $it_verbose$.getDynamicValue(thread)) {
                            format(T, $str_alt28$____Failure___s________________s_, new SubLObject[]{ form_to_eval, evaluated_form, predicate });
                        }
                        if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                            Errors.sublisp_break($str_alt29$Failure___s________________s_fail, new SubLObject[]{ form_to_eval, evaluated_form, predicate });
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject test_verify_guts(final SubLObject predicate, final SubLObject form_to_eval, final SubLObject eval_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, form_to_eval);
            }
            final SubLObject evaluated_form = eval(form_to_eval);
            final SubLObject results = (eval_method == $EVAL_AGAIN) ? eval(list(predicate, evaluated_form)) : apply(predicate, list(evaluated_form));
            if (NIL != results) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str27$__Success___s________________s__p, new SubLObject[]{ form_to_eval, evaluated_form, predicate });
                }
            } else {
                $test_status$.setDynamicValue($FAILURE, thread);
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str28$__Failure___s________________s_fa, new SubLObject[]{ form_to_eval, evaluated_form, predicate });
                }
                if (NIL != break_on_failureP()) {
                    Errors.sublisp_break($str29$Failure___s________________s_fail, new SubLObject[]{ form_to_eval, evaluated_form, predicate });
                }
            }
        }
        return NIL;
    }

    /**
     * Membership test: are expected objs included in the list returned by ask, or not?
     */
    @LispMethod(comment = "Membership test: are expected objs included in the list returned by ask, or not?")
    public static final SubLObject m_verify_alt(SubLObject expected, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                {
                    SubLObject form = list(RETURN_LIST_OF_VALUES, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
                    if (NIL != $it_verbose$.getDynamicValue(thread)) {
                        format(T, $str_alt9$_____s, form);
                    }
                    {
                        SubLObject result = eval(form);
                        SubLObject found = intersection(expected, result, symbol_function(EQUAL), UNPROVIDED);
                        SubLObject not_found = set_difference(expected, found, symbol_function(EQUAL), UNPROVIDED);
                        SubLObject unexpected = set_difference(result, expected, symbol_function(EQUAL), UNPROVIDED);
                        if (NIL != list_utilities.sets_equalP(expected, found, symbol_function(EQUAL))) {
                            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                                format(T, $str_alt31$____Normal___s_______________s__E, new SubLObject[]{ form, found, expected });
                            }
                        } else {
                            $test_status$.setDynamicValue($ABNORMAL, thread);
                            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                                format(T, $str_alt33$____Abnormal___s_________________, new SubLObject[]{ form, found, expected, not_found, unexpected });
                            }
                            if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                                Errors.sublisp_break($str_alt34$Abnormal___s_________________s__E, new SubLObject[]{ form, found, expected, not_found, unexpected });
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Membership test: are expected objs included in the list returned by ask, or not?
     */
    @LispMethod(comment = "Membership test: are expected objs included in the list returned by ask, or not?")
    public static SubLObject m_verify(final SubLObject expected, final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            final SubLObject form = list(RETURN_LIST_OF_VALUES, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, form);
            }
            final SubLObject result = eval(form);
            final SubLObject found = intersection(expected, result, symbol_function(EQUAL), UNPROVIDED);
            final SubLObject not_found = set_difference(expected, found, symbol_function(EQUAL), UNPROVIDED);
            final SubLObject unexpected = set_difference(result, expected, symbol_function(EQUAL), UNPROVIDED);
            if (NIL != list_utilities.sets_equalP(expected, found, symbol_function(EQUAL))) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str31$__Normal___s_______________s__Exp, new SubLObject[]{ form, found, expected });
                }
            } else {
                $test_status$.setDynamicValue($ABNORMAL, thread);
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str33$__Abnormal___s_________________s_, new SubLObject[]{ form, found, expected, not_found, unexpected });
                }
                if (NIL != break_on_failureP()) {
                    Errors.sublisp_break($str34$Abnormal___s_________________s__E, new SubLObject[]{ form, found, expected, not_found, unexpected });
                }
            }
        }
        return NIL;
    }

    /**
     * Binding test: does expected-bindings match those returned by the ask, or not?
     */
    @LispMethod(comment = "Binding test: does expected-bindings match those returned by the ask, or not?")
    public static final SubLObject legacy_binding_verify_alt(SubLObject expected_bindings, SubLObject query_expr, SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == UNPROVIDED) {
            backchainP = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchainP, number, time, depth);
            return com.cyc.cycjava.cycl.cyc_testing.inference_testing.binding_verify(expected_bindings, query_expr, mt, query_properties);
        }
    }

    /**
     * Binding test: does expected-bindings match those returned by the ask, or not?
     */
    @LispMethod(comment = "Binding test: does expected-bindings match those returned by the ask, or not?")
    public static SubLObject legacy_binding_verify(final SubLObject expected_bindings, final SubLObject query_expr, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == UNPROVIDED) {
            backchainP = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchainP, number, time, depth);
        return binding_verify(expected_bindings, query_expr, mt, query_properties);
    }

    /**
     * Binding test: does expected-bindings match those returned by the ask, or not?
     */
    @LispMethod(comment = "Binding test: does expected-bindings match those returned by the ask, or not?")
    public static final SubLObject binding_verify_alt(SubLObject expected_bindings, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                query_properties = putf(query_properties, $CONTINUABLE_, NIL);
                {
                    SubLObject form = list(NEW_CYC_QUERY, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
                    if (NIL != $it_verbose$.getDynamicValue(thread)) {
                        format(T, $str_alt9$_____s, form);
                    }
                    {
                        SubLObject result_bindings = eval(form);
                        if (NIL != list_utilities.sets_equalP(expected_bindings, result_bindings, symbol_function(EQUAL_BINDINGS))) {
                            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                                format(T, $str_alt31$____Normal___s_______________s__E, new SubLObject[]{ form, result_bindings, expected_bindings });
                            }
                        } else {
                            $test_status$.setDynamicValue($ABNORMAL, thread);
                            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                                format(T, $str_alt36$____Abnormal___s_______________s_, new SubLObject[]{ form, result_bindings, expected_bindings });
                            }
                            if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                                Errors.sublisp_break($str_alt37$Abnormal___s_______________s__Exp, new SubLObject[]{ form, result_bindings, expected_bindings });
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Binding test: does expected-bindings match those returned by the ask, or not?
     */
    @LispMethod(comment = "Binding test: does expected-bindings match those returned by the ask, or not?")
    public static SubLObject binding_verify(final SubLObject expected_bindings, final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            query_properties = putf(query_properties, $CONTINUABLE_, $verify_as_continuableP$.getDynamicValue(thread));
            final SubLObject form = list(NEW_CYC_QUERY, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, form);
            }
            final SubLObject result_bindings = eval(form);
            if (NIL != list_utilities.sets_equalP(expected_bindings, result_bindings, symbol_function(EQUAL_BINDINGS))) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str31$__Normal___s_______________s__Exp, new SubLObject[]{ form, result_bindings, expected_bindings });
                }
            } else {
                $test_status$.setDynamicValue($ABNORMAL, thread);
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str36$__Abnormal___s_______________s__E, new SubLObject[]{ form, result_bindings, expected_bindings });
                }
                if (NIL != break_on_failureP()) {
                    Errors.sublisp_break($str37$Abnormal___s_______________s__Exp, new SubLObject[]{ form, result_bindings, expected_bindings });
                }
            }
        }
        return NIL;
    }

    /**
     * Boolean test: success means ask returned nil
     */
    @LispMethod(comment = "Boolean test: success means ask returned nil")
    public static final SubLObject legacy_verify_not_alt(SubLObject query_expr, SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == UNPROVIDED) {
            backchainP = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchainP, number, time, depth);
            return com.cyc.cycjava.cycl.cyc_testing.inference_testing.verify_not(query_expr, mt, query_properties);
        }
    }

    /**
     * Boolean test: success means ask returned nil
     */
    @LispMethod(comment = "Boolean test: success means ask returned nil")
    public static SubLObject legacy_verify_not(final SubLObject query_expr, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == UNPROVIDED) {
            backchainP = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchainP, number, time, depth);
        return verify_not(query_expr, mt, query_properties);
    }

    /**
     * Boolean test: success means ask returned nil
     */
    @LispMethod(comment = "Boolean test: success means ask returned nil")
    public static final SubLObject verify_not_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                query_properties = putf(query_properties, $CONTINUABLE_, NIL);
                {
                    SubLObject form = list(NEW_CYC_QUERY, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
                    if (NIL != $it_verbose$.getDynamicValue(thread)) {
                        format(T, $str_alt9$_____s, form);
                    }
                    {
                        SubLObject val = eval(form);
                        if (NIL == val) {
                            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                                format(T, $str_alt10$____Success___s________________s, form, val);
                            }
                        } else {
                            $test_status$.setDynamicValue($FAILURE, thread);
                            if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                                format(T, $str_alt12$____Failure___s________________s, form, val);
                            }
                            if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                                Errors.sublisp_break($str_alt13$Failure___s________________s, new SubLObject[]{ form, val });
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Boolean test: success means ask returned nil
     */
    @LispMethod(comment = "Boolean test: success means ask returned nil")
    public static SubLObject verify_not(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            query_properties = putf(query_properties, $CONTINUABLE_, $verify_as_continuableP$.getDynamicValue(thread));
            final SubLObject form = list(NEW_CYC_QUERY, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, form);
            }
            final SubLObject val = eval(form);
            if (NIL == val) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str10$__Success___s________________s, form, val);
                }
            } else {
                $test_status$.setDynamicValue($FAILURE, thread);
                if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                    format(T, $str12$__Failure___s________________s, form, val);
                }
                if (NIL != break_on_failureP()) {
                    Errors.sublisp_break($str13$Failure___s________________s, new SubLObject[]{ form, val });
                }
            }
        }
        return NIL;
    }

    /**
     * For each expr in expr-list, print an assert expr and then do the assert.
     */
    @LispMethod(comment = "For each expr in expr-list, print an assert expr and then do the assert.")
    public static final SubLObject print_assert_alt(SubLObject expr_list, SubLObject mt, SubLObject el_tv, SubLObject direction) {
        if (el_tv == UNPROVIDED) {
            el_tv = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                {
                    SubLObject cdolist_list_var = expr_list;
                    SubLObject expr = NIL;
                    for (expr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expr = cdolist_list_var.first()) {
                        {
                            SubLObject v_properties = listS($STRENGTH, el_tv, append(NIL != direction ? ((SubLObject) (list($DIRECTION, direction))) : NIL, NIL));
                            SubLObject form = list(CYC_ASSERT, list_utilities.quotify(expr), list_utilities.quotify(mt), list_utilities.quotify(v_properties));
                            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                                format(T, $str_alt9$_____s, form);
                            }
                            {
                                SubLObject _prev_bind_0 = $use_transcriptP$.currentBinding(thread);
                                SubLObject _prev_bind_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                                try {
                                    $use_transcriptP$.bind(NIL, thread);
                                    api_control_vars.$use_local_queueP$.bind(NIL, thread);
                                    {
                                        SubLObject success = eval(form);
                                        if (NIL == success) {
                                            $test_status$.setDynamicValue($FAILURE, thread);
                                            if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                                                format(T, $str_alt42$____Failure__Assertion__s_failed_, form);
                                            }
                                            if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                                                Errors.sublisp_break($str_alt43$Failure__Assertion__s_failed_, new SubLObject[]{ form });
                                            }
                                        }
                                    }
                                } finally {
                                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_1, thread);
                                    $use_transcriptP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * For each expr in expr-list, print an assert expr and then do the assert.
     */
    @LispMethod(comment = "For each expr in expr-list, print an assert expr and then do the assert.")
    public static SubLObject print_assert(final SubLObject expr_list, final SubLObject mt, SubLObject el_tv, SubLObject direction) {
        if (el_tv == UNPROVIDED) {
            el_tv = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            SubLObject cdolist_list_var = expr_list;
            SubLObject expr = NIL;
            expr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject v_properties = listS($STRENGTH, el_tv, append(NIL != direction ? list($DIRECTION, direction) : NIL, NIL));
                final SubLObject form = list(CYC_ASSERT, list_utilities.quotify(expr), list_utilities.quotify(mt), list_utilities.quotify(v_properties));
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str9$_____s, form);
                }
                final SubLObject _prev_bind_0 = $use_transcriptP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                try {
                    $use_transcriptP$.bind(NIL, thread);
                    api_control_vars.$use_local_queueP$.bind(NIL, thread);
                    final SubLObject success = eval(form);
                    if (NIL == success) {
                        $test_status$.setDynamicValue($FAILURE, thread);
                        if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                            format(T, $str42$__Failure__Assertion__s_failed_, form);
                        }
                        if (NIL != break_on_failureP()) {
                            Errors.sublisp_break($str43$Failure__Assertion__s_failed_, new SubLObject[]{ form });
                        }
                    }
                } finally {
                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                    $use_transcriptP$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                expr = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * For each expr in expr-list, print an assert expr and then do the assert.
     */
    @LispMethod(comment = "For each expr in expr-list, print an assert expr and then do the assert.")
    public static final SubLObject print_assert_wff_alt(SubLObject expr_list, SubLObject mt, SubLObject el_tv, SubLObject direction) {
        if (el_tv == UNPROVIDED) {
            el_tv = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                {
                    SubLObject cdolist_list_var = expr_list;
                    SubLObject expr = NIL;
                    for (expr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expr = cdolist_list_var.first()) {
                        {
                            SubLObject v_properties = listS($STRENGTH, el_tv, append(NIL != direction ? ((SubLObject) (list($DIRECTION, direction))) : NIL, NIL));
                            SubLObject form = list(CYC_ASSERT_WFF, list_utilities.quotify(expr), list_utilities.quotify(mt), list_utilities.quotify(v_properties));
                            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                                format(T, $str_alt9$_____s, form);
                            }
                            {
                                SubLObject _prev_bind_0 = $use_transcriptP$.currentBinding(thread);
                                SubLObject _prev_bind_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                                try {
                                    $use_transcriptP$.bind(NIL, thread);
                                    api_control_vars.$use_local_queueP$.bind(NIL, thread);
                                    {
                                        SubLObject success = eval(form);
                                        if (NIL == success) {
                                            $test_status$.setDynamicValue($FAILURE, thread);
                                            if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                                                format(T, $str_alt42$____Failure__Assertion__s_failed_, form);
                                            }
                                            if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                                                Errors.sublisp_break($str_alt43$Failure__Assertion__s_failed_, new SubLObject[]{ form });
                                            }
                                        }
                                    }
                                } finally {
                                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_1, thread);
                                    $use_transcriptP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * For each expr in expr-list, print an assert expr and then do the assert.
     */
    @LispMethod(comment = "For each expr in expr-list, print an assert expr and then do the assert.")
    public static SubLObject print_assert_wff(final SubLObject expr_list, final SubLObject mt, SubLObject el_tv, SubLObject direction) {
        if (el_tv == UNPROVIDED) {
            el_tv = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            SubLObject cdolist_list_var = expr_list;
            SubLObject expr = NIL;
            expr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject v_properties = listS($STRENGTH, el_tv, append(NIL != direction ? list($DIRECTION, direction) : NIL, NIL));
                final SubLObject form = list(CYC_ASSERT_WFF, list_utilities.quotify(expr), list_utilities.quotify(mt), list_utilities.quotify(v_properties));
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str9$_____s, form);
                }
                final SubLObject _prev_bind_0 = $use_transcriptP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                try {
                    $use_transcriptP$.bind(NIL, thread);
                    api_control_vars.$use_local_queueP$.bind(NIL, thread);
                    final SubLObject success = eval(form);
                    if (NIL == success) {
                        $test_status$.setDynamicValue($FAILURE, thread);
                        if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                            format(T, $str42$__Failure__Assertion__s_failed_, form);
                        }
                        if (NIL != break_on_failureP()) {
                            Errors.sublisp_break($str43$Failure__Assertion__s_failed_, new SubLObject[]{ form });
                        }
                    }
                } finally {
                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                    $use_transcriptP$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                expr = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject print_assert_with_time(final SubLObject forms, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        SubLObject assert_time = ZERO_INTEGER;
        SubLObject result = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
        result = print_assert(forms, mt, strength, direction);
        final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
        final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
        if (((((NIL != subl_promotions.non_zero_integer_p(new_constant_count)) || (NIL != subl_promotions.non_zero_integer_p(new_nart_count))) || (NIL != subl_promotions.non_zero_integer_p(new_assertion_count))) || (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count))) || (NIL != subl_promotions.non_zero_integer_p(new_deduction_count))) {
            if (NIL.isString()) {
                format(T, $str47$___A__, NIL);
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                format(T, $str48$___s_constant_A__A__, new SubLObject[]{ abs(new_constant_count), abs(new_constant_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_constant_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                format(T, $str53$___s_nart_A__A__, new SubLObject[]{ abs(new_nart_count), abs(new_nart_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_nart_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                format(T, $str54$___s_assertion_A__A__, new SubLObject[]{ abs(new_assertion_count), abs(new_assertion_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_assertion_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                format(T, $str55$___s_kb_hl_support_A__A__, new SubLObject[]{ abs(new_kb_hl_support_count), abs(new_kb_hl_support_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                format(T, $str56$___s_deduction_A__A__, new SubLObject[]{ abs(new_deduction_count), abs(new_deduction_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_deduction_count) ? $$$created : $$$destroyed });
            }
        } else
            if (NIL.isString()) {
                format(T, $str47$___A__, NIL);
            }

        force_output(T);
        assert_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        format(T, $str57$__Assert_time____A, assert_time);
        return result;
    }

    /**
     * For each expr in expr-list, print an unassert expr and do the unassert.
     */
    @LispMethod(comment = "For each expr in expr-list, print an unassert expr and do the unassert.")
    public static final SubLObject print_unassert_alt(SubLObject expr_list, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                {
                    SubLObject cdolist_list_var = expr_list;
                    SubLObject expr = NIL;
                    for (expr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expr = cdolist_list_var.first()) {
                        {
                            SubLObject form = list(FI_UNASSERT_INT, list_utilities.quotify(expr), list_utilities.quotify(mt));
                            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                                format(T, $str_alt9$_____s, form);
                            }
                            eval(form);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * For each expr in expr-list, print an unassert expr and do the unassert.
     */
    @LispMethod(comment = "For each expr in expr-list, print an unassert expr and do the unassert.")
    public static SubLObject print_unassert(final SubLObject expr_list, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            SubLObject cdolist_list_var = expr_list;
            SubLObject expr = NIL;
            expr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject form = list(FI_UNASSERT_INT, list_utilities.quotify(expr), list_utilities.quotify(mt));
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str9$_____s, form);
                }
                eval(form);
                cdolist_list_var = cdolist_list_var.rest();
                expr = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject print_blast(final SubLObject expr_list, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            SubLObject cdolist_list_var = expr_list;
            SubLObject expr = NIL;
            expr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject form = list(FI_BLAST_INT, list_utilities.quotify(expr), list_utilities.quotify(mt));
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str9$_____s, form);
                }
                eval(form);
                cdolist_list_var = cdolist_list_var.rest();
                expr = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject print_justify_alt(SubLObject expr, SubLObject mt, SubLObject fullP) {
        if (fullP == UNPROVIDED) {
            fullP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                {
                    SubLObject form = list(FI_JUSTIFY_INT, list_utilities.quotify(expr), list_utilities.quotify(mt), fullP);
                    if (NIL != $it_verbose$.getDynamicValue(thread)) {
                        format(T, $str_alt9$_____s, form);
                        format(T, $str_alt47$__Justification_____s, eval(form));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_justify(final SubLObject expr, final SubLObject mt, SubLObject fullP) {
        if (fullP == UNPROVIDED) {
            fullP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            final SubLObject form = list(FI_JUSTIFY_INT, list_utilities.quotify(expr), list_utilities.quotify(mt), fullP);
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, form);
                format(T, $str61$__Justification_____s, eval(form));
            }
        }
        return NIL;
    }

    /**
     * Kill every term in term-list.
     */
    @LispMethod(comment = "Kill every term in term-list.")
    public static final SubLObject print_kill_alt(SubLObject term_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = term_list;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    if (NIL != forts.valid_fortP(v_term)) {
                        if (NIL != $it_verbose$.getDynamicValue(thread)) {
                            format(T, $str_alt9$_____s, list(FI_KILL_INT, v_term));
                        }
                        {
                            SubLObject name = kb_paths.fort_name(v_term);
                            fi.fi_kill_int(v_term);
                            if (NIL == fi.fi_find_int(name)) {
                                $test_constants_created$.setDynamicValue(delete(name, $test_constants_created$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Kill every term in term-list.
     */
    @LispMethod(comment = "Kill every term in term-list.")
    public static SubLObject print_kill(final SubLObject term_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = term_list;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != forts.valid_fortP(v_term)) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str9$_____s, list(FI_KILL_INT, v_term));
                }
                final SubLObject name = kb_paths.fort_name(v_term);
                fi.fi_kill_int(v_term);
                if (NIL == fi.fi_find_int(name)) {
                    $test_constants_created$.setDynamicValue(delete(name, $test_constants_created$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Try to create a valid constant for name.  If a constant
     * by that name already exists, then it uniquifies name,
     * and creates another with the same name.
     */
    @LispMethod(comment = "Try to create a valid constant for name.  If a constant\r\nby that name already exists, then it uniquifies name,\r\nand creates another with the same name.\nTry to create a valid constant for name.  If a constant\nby that name already exists, then it uniquifies name,\nand creates another with the same name.")
    public static final SubLObject print_create_alt(SubLObject name, SubLObject var_name) {
        if (var_name == UNPROVIDED) {
            var_name = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unique_name = NIL;
                SubLObject form = NIL;
                SubLObject v_new = NIL;
                SubLObject unique = NIL;
                unique_name = constant_completion_high.uniquify_constant_name(name);
                form = list(FI_FIND_OR_CREATE_INT, unique_name);
                if (NIL == fi.fi_find_int(unique_name)) {
                    unique = T;
                    v_new = eval(form);
                }
                if (NIL == unique) {
                    $test_status$.setDynamicValue($FAILURE, thread);
                    if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                        format(T, $str_alt50$____Failure__Did_not_find_unique_, name);
                    }
                    if (NIL != $break_on_failure$.getDynamicValue(thread)) {
                        Errors.sublisp_break($str_alt51$Failure__Create_constant__s_faile, new SubLObject[]{ unique_name });
                    }
                } else {
                    if (NIL != v_new) {
                        if (NIL != $it_verbose$.getDynamicValue(thread)) {
                            format(T, $str_alt9$_____s, form);
                        }
                        {
                            SubLObject item_var = unique_name;
                            if (NIL == member(item_var, $test_constants_created$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                $test_constants_created$.setDynamicValue(cons(item_var, $test_constants_created$.getDynamicValue(thread)), thread);
                            }
                        }
                        return v_new;
                    }
                }
                return NIL;
            }
        }
    }

    /**
     * Try to create a valid constant for name.  If a constant
     * by that name already exists, then it uniquifies name,
     * and creates another with the same name.
     */
    @LispMethod(comment = "Try to create a valid constant for name.  If a constant\r\nby that name already exists, then it uniquifies name,\r\nand creates another with the same name.\nTry to create a valid constant for name.  If a constant\nby that name already exists, then it uniquifies name,\nand creates another with the same name.")
    public static SubLObject print_create(final SubLObject name, SubLObject var_name) {
        if (var_name == UNPROVIDED) {
            var_name = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unique_name = NIL;
        SubLObject form = NIL;
        SubLObject v_new = NIL;
        SubLObject unique = NIL;
        unique_name = constant_completion_high.uniquify_constant_name(name, UNPROVIDED);
        form = list(FI_FIND_OR_CREATE_INT, unique_name);
        if (NIL == fi.fi_find_int(unique_name)) {
            unique = T;
            v_new = eval(form);
        }
        if (NIL == unique) {
            $test_status$.setDynamicValue($FAILURE, thread);
            if ((NIL != $it_verbose$.getDynamicValue(thread)) || (NIL != $it_show_all_failures$.getDynamicValue(thread))) {
                format(T, $str64$__Failure__Did_not_find_unique_na, name);
            }
            if (NIL != break_on_failureP()) {
                Errors.sublisp_break($str65$Failure__Create_constant__s_faile, new SubLObject[]{ unique_name });
            }
        } else
            if (NIL != v_new) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str9$_____s, form);
                }
                final SubLObject item_var = unique_name;
                if (NIL == member(item_var, $test_constants_created$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    $test_constants_created$.setDynamicValue(cons(item_var, $test_constants_created$.getDynamicValue(thread)), thread);
                }
                return v_new;
            }

        return NIL;
    }

    public static final SubLObject print_tms_formula_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str_alt9$_____s, list(FI_TMS_RECONSIDER_FORMULA_INT, list_utilities.quotify(formula), list_utilities.quotify(mt)));
                }
                fi.fi_tms_reconsider_formula_int(formula, mt);
            }
            return NIL;
        }
    }

    public static SubLObject print_tms_formula(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, list(FI_TMS_RECONSIDER_FORMULA_INT, list_utilities.quotify(formula), list_utilities.quotify(mt)));
            }
            fi.fi_tms_reconsider_formula_int(formula, mt);
        }
        return NIL;
    }

    public static final SubLObject print_tms_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
                if (NIL != $it_verbose$.getDynamicValue(thread)) {
                    format(T, $str_alt9$_____s, list(FI_TMS_RECONSIDER_MT_INT, list_utilities.quotify(mt)));
                }
                fi.fi_tms_reconsider_mt_int(mt);
            }
            return NIL;
        }
    }

    public static SubLObject print_tms_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN) || (NIL != $debug_continue$.getDynamicValue(thread))) {
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str9$_____s, list(FI_TMS_RECONSIDER_MT_INT, list_utilities.quotify(mt)));
            }
            fi.fi_tms_reconsider_mt_int(mt);
        }
        return NIL;
    }

    public static final SubLObject update_test_results_alt(SubLObject test_keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($test_status$.getDynamicValue(thread).equal($UNKNOWN)) {
                $test_status$.setDynamicValue($SUCCESS, thread);
            }
            {
                SubLObject pair = list(test_keyword, $test_direction$.getDynamicValue(thread));
                if (NIL != find(pair, $test_results$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED)) {
                    $test_results$.setDynamicValue(cons(cons(pair, $test_status$.getDynamicValue(thread)), remove(pair, $test_results$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED)), thread);
                } else {
                    $test_results$.setDynamicValue(cons(cons(pair, $test_status$.getDynamicValue(thread)), $test_results$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject update_test_results(final SubLObject test_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($test_status$.getDynamicValue(thread).equal($UNKNOWN)) {
            $test_status$.setDynamicValue($SUCCESS, thread);
        }
        final SubLObject pair = list(test_keyword, $test_direction$.getDynamicValue(thread));
        if (NIL != find(pair, $test_results$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED)) {
            $test_results$.setDynamicValue(cons(cons(pair, $test_status$.getDynamicValue(thread)), remove(pair, $test_results$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED)), thread);
        } else {
            $test_results$.setDynamicValue(cons(cons(pair, $test_status$.getDynamicValue(thread)), $test_results$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static final SubLObject kill_test_constants_created_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $test_constants_created$.getDynamicValue(thread);
                SubLObject name = NIL;
                for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                    {
                        SubLObject constant = fi.fi_find_int(name);
                        if (NIL != constant) {
                            com.cyc.cycjava.cycl.cyc_testing.inference_testing.print_kill(list(constant));
                        }
                    }
                }
            }
            $test_constants_created$.setDynamicValue(NIL, thread);
            return NIL;
        }
    }

    public static SubLObject kill_test_constants_created() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $clean_up_test_constantsP$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = $test_constants_created$.getDynamicValue(thread);
            SubLObject name = NIL;
            name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject constant = fi.fi_find_int(name);
                if (NIL != constant) {
                    print_kill(list(constant));
                }
                cdolist_list_var = cdolist_list_var.rest();
                name = cdolist_list_var.first();
            } 
            $test_constants_created$.setDynamicValue(NIL, thread);
        }
        return NIL;
    }

    /**
     * Run one test.
     *
     * @return cyc-test-run-p
     */
    @LispMethod(comment = "Run one test.\r\n\r\n@return cyc-test-run-p")
    public static final SubLObject run_test_alt(SubLObject test_keyword, SubLObject progress_blipP, SubLObject verboseP, SubLObject testing_direction, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        SubLObject backchain_provided_p = makeBoolean(backchain != UNPROVIDED);
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = T;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (testing_direction == UNPROVIDED) {
            testing_direction = $BACKWARD;
        }
        if (backchain == UNPROVIDED) {
            backchain = T;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (operation_communication.communication_mode() == $TRANSMIT_AND_RECEIVE) {
                operation_communication.set_communication_mode($DEAF);
            }
            if ((testing_direction == $FORWARD) && (NIL == backchain_provided_p)) {
                backchain = NIL;
            }
            {
                SubLObject form = com.cyc.cycjava.cycl.cyc_testing.inference_testing.inference_test_form(test_keyword);
                SubLObject test_run = NIL;
                {
                    SubLObject _prev_bind_0 = $test_constants_created$.currentBinding(thread);
                    try {
                        $test_constants_created$.bind(NIL, thread);
                        if (form.isCons()) {
                            {
                                SubLObject kb_object_count_list_1 = kb_object_count_list();
                                try {
                                    {
                                        SubLObject _prev_bind_0_4 = $current_test$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $test_status$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $elapsed_time$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $it_backchain$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = $it_number$.currentBinding(thread);
                                        SubLObject _prev_bind_5 = $it_time$.currentBinding(thread);
                                        SubLObject _prev_bind_6 = $it_depth$.currentBinding(thread);
                                        SubLObject _prev_bind_7 = $it_verbose$.currentBinding(thread);
                                        SubLObject _prev_bind_8 = $test_direction$.currentBinding(thread);
                                        try {
                                            $current_test$.bind(test_keyword, thread);
                                            $test_status$.bind($UNKNOWN, thread);
                                            $elapsed_time$.bind(NIL, thread);
                                            $it_backchain$.bind(backchain, thread);
                                            $it_number$.bind(number, thread);
                                            $it_time$.bind(time, thread);
                                            $it_depth$.bind(depth, thread);
                                            $it_verbose$.bind(verboseP, thread);
                                            $test_direction$.bind(testing_direction, thread);
                                            if (NIL != progress_blipP) {
                                                print(list(test_keyword, $test_direction$.getDynamicValue(thread)), UNPROVIDED);
                                                force_output(UNPROVIDED);
                                            }
                                            {
                                                SubLObject time_5 = NIL;
                                                SubLObject time_var = get_internal_real_time();
                                                {
                                                    SubLObject cdolist_list_var = form;
                                                    SubLObject expr = NIL;
                                                    for (expr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expr = cdolist_list_var.first()) {
                                                        eval_in_api.cyc_api_eval(expr);
                                                    }
                                                }
                                                time_5 = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                {
                                                    SubLObject name = list(test_keyword, testing_direction);
                                                    test_run = cyc_testing.new_cyc_test_run($IT, name, $test_status$.getDynamicValue(thread), time_5);
                                                }
                                            }
                                            if (NIL != progress_blipP) {
                                                format(T, $str_alt60$____s, assoc(list(test_keyword, $test_direction$.getDynamicValue(thread)), $test_results$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED).rest());
                                            }
                                        } finally {
                                            $test_direction$.rebind(_prev_bind_8, thread);
                                            $it_verbose$.rebind(_prev_bind_7, thread);
                                            $it_depth$.rebind(_prev_bind_6, thread);
                                            $it_time$.rebind(_prev_bind_5, thread);
                                            $it_number$.rebind(_prev_bind_4, thread);
                                            $it_backchain$.rebind(_prev_bind_3, thread);
                                            $elapsed_time$.rebind(_prev_bind_2, thread);
                                            $test_status$.rebind(_prev_bind_1, thread);
                                            $current_test$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            com.cyc.cycjava.cycl.cyc_testing.inference_testing.kill_test_constants_created();
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                        }
                                    }
                                }
                                {
                                    SubLObject kb_object_count_list_2 = kb_object_count_list();
                                    SubLObject new_constant_count = kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
                                    SubLObject new_nart_count = kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
                                    SubLObject new_assertion_count = kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
                                    SubLObject new_kb_hl_support_count = kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
                                    SubLObject new_deduction_count = kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
                                    if (((((NIL != non_zero_integer_p(new_constant_count)) || (NIL != non_zero_integer_p(new_nart_count))) || (NIL != non_zero_integer_p(new_assertion_count))) || (NIL != non_zero_integer_p(new_kb_hl_support_count))) || (NIL != non_zero_integer_p(new_deduction_count))) {
                                        if (cconcatenate($str_alt61$Warning__Test__, new SubLObject[]{ format_nil.format_nil_s_no_copy(test_keyword), $str_alt62$_, format_nil.format_nil_s_no_copy(testing_direction), $str_alt63$__changed_the_KB_ }).isString()) {
                                            format(T, $str_alt64$___A__, cconcatenate($str_alt61$Warning__Test__, new SubLObject[]{ format_nil.format_nil_s_no_copy(test_keyword), $str_alt62$_, format_nil.format_nil_s_no_copy(testing_direction), $str_alt63$__changed_the_KB_ }));
                                        }
                                        if (NIL != non_zero_integer_p(new_constant_count)) {
                                            format(T, $str_alt65$___s_constant_A__A__, new SubLObject[]{ abs(new_constant_count), abs(new_constant_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt67$_was, NIL != positive_integer_p(new_constant_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                        }
                                        if (NIL != non_zero_integer_p(new_nart_count)) {
                                            format(T, $str_alt70$___s_nart_A__A__, new SubLObject[]{ abs(new_nart_count), abs(new_nart_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt67$_was, NIL != positive_integer_p(new_nart_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                        }
                                        if (NIL != non_zero_integer_p(new_assertion_count)) {
                                            format(T, $str_alt71$___s_assertion_A__A__, new SubLObject[]{ abs(new_assertion_count), abs(new_assertion_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt67$_was, NIL != positive_integer_p(new_assertion_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                        }
                                        if (NIL != non_zero_integer_p(new_kb_hl_support_count)) {
                                            format(T, $str_alt72$___s_kb_hl_support_A__A__, new SubLObject[]{ abs(new_kb_hl_support_count), abs(new_kb_hl_support_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt67$_was, NIL != positive_integer_p(new_kb_hl_support_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                        }
                                        if (NIL != non_zero_integer_p(new_deduction_count)) {
                                            format(T, $str_alt73$___s_deduction_A__A__, new SubLObject[]{ abs(new_deduction_count), abs(new_deduction_count).numG(ONE_INTEGER) ? ((SubLObject) ($$$s_were)) : $str_alt67$_was, NIL != positive_integer_p(new_deduction_count) ? ((SubLObject) ($$$created)) : $$$destroyed });
                                        }
                                    } else {
                                        if (NIL.isString()) {
                                            format(T, $str_alt64$___A__, NIL);
                                        }
                                    }
                                    force_output(T);
                                }
                            }
                        } else {
                            format(T, $str_alt74$__There_is_no_test_in__s_associat, $inference_tests$, test_keyword);
                            if (NIL == $inference_tests$.getDynamicValue(thread)) {
                                format(T, $str_alt76$__In_fact__there_are_no_tests_in_, $inference_tests$);
                            }
                        }
                    } finally {
                        $test_constants_created$.rebind(_prev_bind_0, thread);
                    }
                }
                return test_run;
            }
        }
    }

    /**
     * Run one test.
     *
     * @return cyc-test-run-p
     */
    @LispMethod(comment = "Run one test.\r\n\r\n@return cyc-test-run-p")
    public static SubLObject run_test(final SubLObject test_keyword, SubLObject progress_blipP, SubLObject verboseP, SubLObject testing_direction, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        final SubLObject backchain_provided_p = makeBoolean(backchain != UNPROVIDED);
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = T;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (testing_direction == UNPROVIDED) {
            testing_direction = $BACKWARD;
        }
        if (backchain == UNPROVIDED) {
            backchain = T;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.communication_mode() == $TRANSMIT_AND_RECEIVE) {
            operation_communication.set_communication_mode($DEAF);
        }
        if ((testing_direction == $FORWARD) && (NIL == backchain_provided_p)) {
            backchain = NIL;
        }
        final SubLObject form = inference_test_form(test_keyword);
        SubLObject test_run = NIL;
        final SubLObject _prev_bind_0 = $test_constants_created$.currentBinding(thread);
        try {
            $test_constants_created$.bind(NIL, thread);
            if (form.isCons()) {
                final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
                try {
                    final SubLObject _prev_bind_0_$4 = $current_test$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $test_status$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $elapsed_time$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $it_backchain$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $it_number$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $it_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $it_depth$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $it_verbose$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $test_direction$.currentBinding(thread);
                    try {
                        $current_test$.bind(test_keyword, thread);
                        $test_status$.bind($UNKNOWN, thread);
                        $elapsed_time$.bind(NIL, thread);
                        $it_backchain$.bind(backchain, thread);
                        $it_number$.bind(number, thread);
                        $it_time$.bind(time, thread);
                        $it_depth$.bind(depth, thread);
                        $it_verbose$.bind(verboseP, thread);
                        $test_direction$.bind(testing_direction, thread);
                        if (NIL != progress_blipP) {
                            final SubLObject pcase_var = cyc_testing.$it_output_format$.getDynamicValue(thread);
                            if (pcase_var.eql($STANDARD)) {
                                format(T, $str73$___IT___S__S_, test_keyword, $test_direction$.getDynamicValue(thread));
                                force_output(UNPROVIDED);
                            } else
                                if (pcase_var.eql($POST_BUILD) && (NIL != verboseP)) {
                                    format_nil.force_format(T, $str75$_____Starting__IT___S__S__at__A__, test_keyword, $test_direction$.getDynamicValue(thread), numeric_date_utilities.timestring_ms(UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }

                        }
                        SubLObject time_$5 = NIL;
                        final SubLObject time_var = get_internal_real_time();
                        SubLObject cdolist_list_var = form;
                        SubLObject expr = NIL;
                        expr = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            eval_in_api.cyc_api_eval(expr);
                            cdolist_list_var = cdolist_list_var.rest();
                            expr = cdolist_list_var.first();
                        } 
                        time_$5 = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        final SubLObject name = list(test_keyword, testing_direction);
                        test_run = cyc_testing.new_cyc_test_run($IT, name, $test_status$.getDynamicValue(thread), time_$5);
                        if (NIL != progress_blipP) {
                            final SubLObject result = assoc(list(test_keyword, $test_direction$.getDynamicValue(thread)), $test_results$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED).rest();
                            final SubLObject pcase_var2 = cyc_testing.$it_output_format$.getDynamicValue(thread);
                            if (pcase_var2.eql($STANDARD)) {
                                format(T, $str77$_____s____3f_, result, time_$5);
                            } else
                                if (pcase_var2.eql($POST_BUILD)) {
                                    cyc_testing.print_post_build_test_summary(T, result, $IT, list(test_keyword, testing_direction), time_$5, inference_test_owner(test_keyword));
                                }

                        }
                    } finally {
                        $test_direction$.rebind(_prev_bind_9, thread);
                        $it_verbose$.rebind(_prev_bind_8, thread);
                        $it_depth$.rebind(_prev_bind_7, thread);
                        $it_time$.rebind(_prev_bind_6, thread);
                        $it_number$.rebind(_prev_bind_5, thread);
                        $it_backchain$.rebind(_prev_bind_4, thread);
                        $elapsed_time$.rebind(_prev_bind_3, thread);
                        $test_status$.rebind(_prev_bind_2, thread);
                        $current_test$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        kill_test_constants_created();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
                final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
                final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
                if ((NIL != verboseP ? $VERBOSE : $SILENT) != $SILENT) {
                    if (((((NIL != subl_promotions.non_zero_integer_p(new_constant_count)) || (NIL != subl_promotions.non_zero_integer_p(new_nart_count))) || (NIL != subl_promotions.non_zero_integer_p(new_assertion_count))) || (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count))) || (NIL != subl_promotions.non_zero_integer_p(new_deduction_count))) {
                        if (cconcatenate($str79$Warning__Test__, new SubLObject[]{ format_nil.format_nil_s_no_copy(test_keyword), $$$_, format_nil.format_nil_s_no_copy(testing_direction), $str81$__changed_the_KB_ }).isString()) {
                            format(T, $str47$___A__, cconcatenate($str79$Warning__Test__, new SubLObject[]{ format_nil.format_nil_s_no_copy(test_keyword), $$$_, format_nil.format_nil_s_no_copy(testing_direction), $str81$__changed_the_KB_ }));
                        }
                        if (NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                            format(T, $str48$___s_constant_A__A__, new SubLObject[]{ abs(new_constant_count), abs(new_constant_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_constant_count) ? $$$created : $$$destroyed });
                        }
                        if (NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                            format(T, $str53$___s_nart_A__A__, new SubLObject[]{ abs(new_nart_count), abs(new_nart_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_nart_count) ? $$$created : $$$destroyed });
                        }
                        if (NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                            format(T, $str54$___s_assertion_A__A__, new SubLObject[]{ abs(new_assertion_count), abs(new_assertion_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_assertion_count) ? $$$created : $$$destroyed });
                        }
                        if (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                            format(T, $str55$___s_kb_hl_support_A__A__, new SubLObject[]{ abs(new_kb_hl_support_count), abs(new_kb_hl_support_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count) ? $$$created : $$$destroyed });
                        }
                        if (NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                            format(T, $str56$___s_deduction_A__A__, new SubLObject[]{ abs(new_deduction_count), abs(new_deduction_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_deduction_count) ? $$$created : $$$destroyed });
                        }
                    } else
                        if (NIL.isString()) {
                            format(T, $str47$___A__, NIL);
                        }

                }
                force_output(T);
            } else {
                format(T, $str82$__There_is_no_test_in__s_associat, $inference_tests$, test_keyword);
                if (NIL == $inference_tests$.getDynamicValue(thread)) {
                    format(T, $str84$__In_fact__there_are_no_tests_in_, $inference_tests$);
                }
            }
        } finally {
            $test_constants_created$.rebind(_prev_bind_0, thread);
        }
        return test_run;
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t")
    public static final SubLObject do_tests_alt(SubLObject keyword_list, SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP, SubLObject testing_direction, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (keyword_list == UNPROVIDED) {
            keyword_list = com.cyc.cycjava.cycl.cyc_testing.inference_testing.defined_inference_tests(UNPROVIDED);
        }
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = T;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (load_testsP == UNPROVIDED) {
            load_testsP = NIL;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        if (testing_direction == UNPROVIDED) {
            testing_direction = $BACKWARD;
        }
        if (backchain == UNPROVIDED) {
            backchain = T;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        if (keyword_list.isCons()) {
            {
                SubLObject test_runs = NIL;
                SubLObject cdolist_list_var = keyword_list;
                SubLObject keyword = NIL;
                for (keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyword = cdolist_list_var.first()) {
                    {
                        SubLObject test_run = com.cyc.cycjava.cycl.cyc_testing.inference_testing.run_test(keyword, progress_blipP, verboseP, testing_direction, backchain, number, time, depth);
                        test_runs = cons(test_run, test_runs);
                    }
                }
                com.cyc.cycjava.cycl.cyc_testing.inference_testing.print_test_results(UNPROVIDED);
                {
                    SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result(test_runs);
                    return values(overall_result, NIL != return_test_runsP ? ((SubLObject) (test_runs)) : NIL);
                }
            }
        } else {
            if (NIL != load_testsP) {
                {
                    SubLObject try2 = com.cyc.cycjava.cycl.cyc_testing.inference_testing.defined_inference_tests(T);
                    if (NIL != try2) {
                        return com.cyc.cycjava.cycl.cyc_testing.inference_testing.do_tests(try2, progress_blipP, verboseP, NIL, testing_direction, backchain, number, time, depth, UNPROVIDED);
                    } else {
                        format(T, $str_alt77$__The__s_argument_is__s__which_is, KEYWORD_LIST, keyword_list);
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t")
    public static SubLObject do_tests(SubLObject keyword_list, SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP, SubLObject testing_direction, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (keyword_list == UNPROVIDED) {
            keyword_list = defined_inference_tests(UNPROVIDED);
        }
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = T;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (load_testsP == UNPROVIDED) {
            load_testsP = NIL;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        if (testing_direction == UNPROVIDED) {
            testing_direction = $BACKWARD;
        }
        if (backchain == UNPROVIDED) {
            backchain = T;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        if (keyword_list.isCons()) {
            SubLObject test_runs = NIL;
            SubLObject cdolist_list_var = keyword_list;
            SubLObject keyword = NIL;
            keyword = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject test_run = run_test(keyword, progress_blipP, verboseP, testing_direction, backchain, number, time, depth);
                test_runs = cons(test_run, test_runs);
                cdolist_list_var = cdolist_list_var.rest();
                keyword = cdolist_list_var.first();
            } 
            print_test_results(UNPROVIDED);
            final SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result(test_runs);
            return values(overall_result, NIL != return_test_runsP ? test_runs : NIL);
        }
        if (NIL == load_testsP) {
            return NIL;
        }
        final SubLObject try2 = defined_inference_tests(T);
        if (NIL != try2) {
            return do_tests(try2, progress_blipP, verboseP, NIL, testing_direction, backchain, number, time, depth, UNPROVIDED);
        }
        format(T, $str85$__The__s_argument_is__s__which_is, KEYWORD_LIST, keyword_list);
        return NIL;
    }

    public static final SubLObject sorted_test_results_alt(SubLObject results) {
        if (results == UNPROVIDED) {
            results = $test_results$.getDynamicValue();
        }
        results = Sort.sort(copy_list(results), symbol_function($sym79$TERM__), symbol_function(CAR));
        results = Sort.stable_sort(results, symbol_function($sym79$TERM__), symbol_function(CDR));
        return results;
    }

    public static SubLObject sorted_test_results(SubLObject results) {
        if (results == UNPROVIDED) {
            results = $test_results$.getDynamicValue();
        }
        results = Sort.sort(copy_list(results), symbol_function($sym87$TERM__), symbol_function(CAR));
        results = Sort.stable_sort(results, symbol_function($sym87$TERM__), symbol_function(CDR));
        return results;
    }

    public static final SubLObject print_test_results_alt(SubLObject output_format) {
        if (output_format == UNPROVIDED) {
            output_format = cyc_testing.$it_output_format$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($SILENT != output_format) {
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        format(T, $str_alt82$__);
                        {
                            SubLObject separator = NIL;
                            SubLObject pcase_var = output_format;
                            if (pcase_var.eql($STANDARD)) {
                                separator = $str_alt84$__;
                            } else {
                                if (pcase_var.eql($POST_BUILD)) {
                                    separator = $str_alt86$_IT;
                                } else {
                                    Errors.error($str_alt87$Unknown_output_format__A, output_format);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.cyc_testing.inference_testing.sorted_test_results(UNPROVIDED);
                                SubLObject x = NIL;
                                for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                                    if (output_format == $POST_BUILD) {
                                        format(T, $str_alt88$___s__a__s__OWNER__s, new SubLObject[]{ x.rest(), separator, x.first(), com.cyc.cycjava.cycl.cyc_testing.inference_testing.inference_test_owner(caar(x)) });
                                    } else {
                                        format(T, $str_alt89$___s__a__s, new SubLObject[]{ x.rest(), separator, x.first() });
                                    }
                                }
                            }
                        }
                        format(T, $str_alt82$__);
                    } finally {
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_test_results(SubLObject output_format) {
        if (output_format == UNPROVIDED) {
            output_format = cyc_testing.$it_output_format$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($SILENT != output_format) {
            final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
            try {
                $print_pretty$.bind(NIL, thread);
                format(T, $str89$__);
                SubLObject separator = NIL;
                final SubLObject pcase_var = output_format;
                if (pcase_var.eql($STANDARD)) {
                    separator = $str90$__;
                } else
                    if (pcase_var.eql($POST_BUILD)) {
                        separator = $str91$_IT;
                    } else {
                        Errors.error($str92$Unknown_output_format__A, output_format);
                    }

                SubLObject cdolist_list_var = sorted_test_results(UNPROVIDED);
                SubLObject x = NIL;
                x = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (output_format == $POST_BUILD) {
                        cyc_testing.print_post_build_test_summary(T, x.rest(), separator, x.first(), NIL, inference_test_owner(caar(x)));
                    } else {
                        format(T, $str93$___s__a__s, new SubLObject[]{ x.rest(), separator, x.first() });
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    x = cdolist_list_var.first();
                } 
                format(T, $str89$__);
            } finally {
                $print_pretty$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject print_failing_tests_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    format(T, $str_alt82$__);
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.cyc_testing.inference_testing.sorted_test_results(UNPROVIDED);
                        SubLObject x = NIL;
                        for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                            if (x.rest().equal($FAILURE)) {
                                format(T, $str_alt90$___s_____s, x.rest(), x.first());
                            }
                        }
                    }
                    format(T, $str_alt82$__);
                } finally {
                    $print_pretty$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_failing_tests() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            format(T, $str89$__);
            SubLObject cdolist_list_var = sorted_test_results(UNPROVIDED);
            SubLObject x = NIL;
            x = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (x.rest().equal($FAILURE)) {
                    format(T, $str94$___s_____s, x.rest(), x.first());
                }
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            } 
            format(T, $str89$__);
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Assoc list is expected to be an association list
     * ((parameter . ((value1 . result1)  (value2 . result2)))
     * (function-symbol . ((value1 . result1)  (value2 . result2)))
     * ...
     * Function-symbol is assumed to be a symbol, not a "Function" quoted symbol,
     * i.e. 'eql is expected and not #'eql.
     * If neither parameter nor function symbol is non-nil, returns nil.
     * If parameter and function-symbol are both non-nil, only parameter is used.
     * If operating on parameter, essentially returns the result associated with the current result of the
     * parameter.
     * Essentially returns the result associated with the current result of the function applied to the args.
     * Currently the a-list key's must be #'eql.
     */
    @LispMethod(comment = "Assoc list is expected to be an association list\r\n((parameter . ((value1 . result1)  (value2 . result2)))\r\n(function-symbol . ((value1 . result1)  (value2 . result2)))\r\n...\r\nFunction-symbol is assumed to be a symbol, not a \"Function\" quoted symbol,\r\ni.e. \'eql is expected and not #\'eql.\r\nIf neither parameter nor function symbol is non-nil, returns nil.\r\nIf parameter and function-symbol are both non-nil, only parameter is used.\r\nIf operating on parameter, essentially returns the result associated with the current result of the\r\nparameter.\r\nEssentially returns the result associated with the current result of the function applied to the args.\r\nCurrently the a-list key\'s must be #\'eql.\nAssoc list is expected to be an association list\n((parameter . ((value1 . result1)  (value2 . result2)))\n(function-symbol . ((value1 . result1)  (value2 . result2)))\n...\nFunction-symbol is assumed to be a symbol, not a \"Function\" quoted symbol,\ni.e. \'eql is expected and not #\'eql.\nIf neither parameter nor function symbol is non-nil, returns nil.\nIf parameter and function-symbol are both non-nil, only parameter is used.\nIf operating on parameter, essentially returns the result associated with the current result of the\nparameter.\nEssentially returns the result associated with the current result of the function applied to the args.\nCurrently the a-list key\'s must be #\'eql.")
    public static final SubLObject parameterized_test_value_alt(SubLObject assoc_list, SubLObject parameter, SubLObject function_symbol, SubLObject fn_arg_list) {
        if (parameter == UNPROVIDED) {
            parameter = NIL;
        }
        if (function_symbol == UNPROVIDED) {
            function_symbol = NIL;
        }
        if (fn_arg_list == UNPROVIDED) {
            fn_arg_list = NIL;
        }
        if (NIL != parameter) {
            if (NIL != boundp(parameter)) {
                return assoc(symbol_value(parameter), assoc(parameter, assoc_list, UNPROVIDED, UNPROVIDED).rest(), UNPROVIDED, UNPROVIDED).rest();
            } else {
                return NIL;
            }
        } else {
            if (NIL != function_symbol) {
                if (NIL != fboundp(function_symbol)) {
                    return assoc(apply(function_symbol, fn_arg_list), assoc(function_symbol, assoc_list, UNPROVIDED, UNPROVIDED).rest(), UNPROVIDED, UNPROVIDED).rest();
                } else {
                    return NIL;
                }
            } else {
                return NIL;
            }
        }
    }

    /**
     * Assoc list is expected to be an association list
     * ((parameter . ((value1 . result1)  (value2 . result2)))
     * (function-symbol . ((value1 . result1)  (value2 . result2)))
     * ...
     * Function-symbol is assumed to be a symbol, not a "Function" quoted symbol,
     * i.e. 'eql is expected and not #'eql.
     * If neither parameter nor function symbol is non-nil, returns nil.
     * If parameter and function-symbol are both non-nil, only parameter is used.
     * If operating on parameter, essentially returns the result associated with the current result of the
     * parameter.
     * Essentially returns the result associated with the current result of the function applied to the args.
     * Currently the a-list key's must be #'eql.
     */
    @LispMethod(comment = "Assoc list is expected to be an association list\r\n((parameter . ((value1 . result1)  (value2 . result2)))\r\n(function-symbol . ((value1 . result1)  (value2 . result2)))\r\n...\r\nFunction-symbol is assumed to be a symbol, not a \"Function\" quoted symbol,\r\ni.e. \'eql is expected and not #\'eql.\r\nIf neither parameter nor function symbol is non-nil, returns nil.\r\nIf parameter and function-symbol are both non-nil, only parameter is used.\r\nIf operating on parameter, essentially returns the result associated with the current result of the\r\nparameter.\r\nEssentially returns the result associated with the current result of the function applied to the args.\r\nCurrently the a-list key\'s must be #\'eql.\nAssoc list is expected to be an association list\n((parameter . ((value1 . result1)  (value2 . result2)))\n(function-symbol . ((value1 . result1)  (value2 . result2)))\n...\nFunction-symbol is assumed to be a symbol, not a \"Function\" quoted symbol,\ni.e. \'eql is expected and not #\'eql.\nIf neither parameter nor function symbol is non-nil, returns nil.\nIf parameter and function-symbol are both non-nil, only parameter is used.\nIf operating on parameter, essentially returns the result associated with the current result of the\nparameter.\nEssentially returns the result associated with the current result of the function applied to the args.\nCurrently the a-list key\'s must be #\'eql.")
    public static SubLObject parameterized_test_value(final SubLObject assoc_list, SubLObject parameter, SubLObject function_symbol, SubLObject fn_arg_list) {
        if (parameter == UNPROVIDED) {
            parameter = NIL;
        }
        if (function_symbol == UNPROVIDED) {
            function_symbol = NIL;
        }
        if (fn_arg_list == UNPROVIDED) {
            fn_arg_list = NIL;
        }
        if (NIL != parameter) {
            if (NIL != boundp(parameter)) {
                return assoc(symbol_value(parameter), assoc(parameter, assoc_list, UNPROVIDED, UNPROVIDED).rest(), UNPROVIDED, UNPROVIDED).rest();
            }
            return NIL;
        } else {
            if (NIL == function_symbol) {
                return NIL;
            }
            if (NIL != fboundp(function_symbol)) {
                return assoc(apply(function_symbol, fn_arg_list), assoc(function_symbol, assoc_list, UNPROVIDED, UNPROVIDED).rest(), UNPROVIDED, UNPROVIDED).rest();
            }
            return NIL;
        }
    }

    /**
     * Takes a standard testing form e.g. (form-verify 'eq 5 '(+ 2 3) and
     * evaluates it if *evaluate-previously-failing-tests* is T.  If
     * keyword is non-nil then it only evaluates the form if keyword
     * is a member of *known-bug-types-to-check* when compared with keyword-test.
     * Message should be a format string which is printed if form has been evaluated.
     * Message-list is a list of arguments to give to the format string.
     */
    @LispMethod(comment = "Takes a standard testing form e.g. (form-verify \'eq 5 \'(+ 2 3) and\r\nevaluates it if *evaluate-previously-failing-tests* is T.  If\r\nkeyword is non-nil then it only evaluates the form if keyword\r\nis a member of *known-bug-types-to-check* when compared with keyword-test.\r\nMessage should be a format string which is printed if form has been evaluated.\r\nMessage-list is a list of arguments to give to the format string.\nTakes a standard testing form e.g. (form-verify \'eq 5 \'(+ 2 3) and\nevaluates it if *evaluate-previously-failing-tests* is T.  If\nkeyword is non-nil then it only evaluates the form if keyword\nis a member of *known-bug-types-to-check* when compared with keyword-test.\nMessage should be a format string which is printed if form has been evaluated.\nMessage-list is a list of arguments to give to the format string.")
    public static final SubLObject print_failing_form_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt91);
            form = current.first();
            current = current.rest();
            {
                SubLObject keyword = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt91);
                current = current.rest();
                {
                    SubLObject keyword_test = (current.isCons()) ? ((SubLObject) (current.first())) : $list_alt92;
                    destructuring_bind_must_listp(current, datum, $list_alt91);
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt91);
                        current = current.rest();
                        {
                            SubLObject message_list = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt91);
                            current = current.rest();
                            if (NIL == current) {
                                return list(PIF, list(CAND, $evaluate_previously_failing_tests$, list(COR, list(NULL, keyword), $check_all_it_bug_types$, list(MEMBER, keyword, $known_bug_types_to_check$, keyword_test))), list(PROGN, list(PIF, $it_failing_verbose$, list(CLET, $list_alt104, list(FORMAT, T, $str_alt106$__The_previously_failing_test____, list(QUOTE, form), keyword), form, list(PWHEN, message, list(APPLY, $list_alt110, T, message, message_list))), form)), list(PWHEN, $it_failing_verbose$, list(PIF, list(CNOT, list(NULL, keyword)), list(FORMAT, T, $str_alt112$__This_previously_failing_test___, list(QUOTE, form), keyword), list(FORMAT, T, $str_alt113$__This_previously_failing_test___, list(QUOTE, form)))));
                            } else {
                                cdestructuring_bind_error(datum, $list_alt91);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Takes a standard testing form e.g. (form-verify 'eq 5 '(+ 2 3) and
     * evaluates it if *evaluate-previously-failing-tests* is T.  If
     * keyword is non-nil then it only evaluates the form if keyword
     * is a member of *known-bug-types-to-check* when compared with keyword-test.
     * Message should be a format string which is printed if form has been evaluated.
     * Message-list is a list of arguments to give to the format string.
     */
    @LispMethod(comment = "Takes a standard testing form e.g. (form-verify \'eq 5 \'(+ 2 3) and\r\nevaluates it if *evaluate-previously-failing-tests* is T.  If\r\nkeyword is non-nil then it only evaluates the form if keyword\r\nis a member of *known-bug-types-to-check* when compared with keyword-test.\r\nMessage should be a format string which is printed if form has been evaluated.\r\nMessage-list is a list of arguments to give to the format string.\nTakes a standard testing form e.g. (form-verify \'eq 5 \'(+ 2 3) and\nevaluates it if *evaluate-previously-failing-tests* is T.  If\nkeyword is non-nil then it only evaluates the form if keyword\nis a member of *known-bug-types-to-check* when compared with keyword-test.\nMessage should be a format string which is printed if form has been evaluated.\nMessage-list is a list of arguments to give to the format string.")
    public static SubLObject print_failing_form(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        destructuring_bind_must_consp(current, datum, $list95);
        form = current.first();
        current = current.rest();
        final SubLObject keyword = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list95);
        current = current.rest();
        final SubLObject keyword_test = (current.isCons()) ? current.first() : $list96;
        destructuring_bind_must_listp(current, datum, $list95);
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list95);
        current = current.rest();
        final SubLObject message_list = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list95);
        current = current.rest();
        if (NIL == current) {
            return list(PIF, list(CAND, $evaluate_previously_failing_tests$, list(COR, list(NULL, keyword), $check_all_it_bug_types$, list(MEMBER, keyword, $known_bug_types_to_check$, keyword_test))), list(PROGN, list(PIF, $it_failing_verbose$, list(CLET, $list108, list(FORMAT, T, $str110$__The_previously_failing_test____, list(QUOTE, form), keyword), form, list(PWHEN, message, list(APPLY, $list114, T, message, message_list))), form)), list(PWHEN, $it_failing_verbose$, list(PIF, list(CNOT, list(NULL, keyword)), list(FORMAT, T, $str116$__This_previously_failing_test___, list(QUOTE, form), keyword), list(FORMAT, T, $str117$__This_previously_failing_test___, list(QUOTE, form)))));
        }
        cdestructuring_bind_error(datum, $list95);
        return NIL;
    }

    /**
     * Return a list of the current test name, bug-type, and members of the
     * other identifiers
     */
    @LispMethod(comment = "Return a list of the current test name, bug-type, and members of the\r\nother identifiers\nReturn a list of the current test name, bug-type, and members of the\nother identifiers")
    public static final SubLObject failing_it_form_identifier_alt(SubLObject bug_type, SubLObject other_identifiers) {
        if (other_identifiers == UNPROVIDED) {
            other_identifiers = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return nconc(list($current_test$.getDynamicValue(thread), bug_type), other_identifiers);
        }
    }

    /**
     * Return a list of the current test name, bug-type, and members of the
     * other identifiers
     */
    @LispMethod(comment = "Return a list of the current test name, bug-type, and members of the\r\nother identifiers\nReturn a list of the current test name, bug-type, and members of the\nother identifiers")
    public static SubLObject failing_it_form_identifier(final SubLObject bug_type, SubLObject other_identifiers) {
        if (other_identifiers == UNPROVIDED) {
            other_identifiers = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return nconc(list($current_test$.getDynamicValue(thread), bug_type), other_identifiers);
    }

    public static final SubLObject herald_start_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $it_verbose$.getDynamicValue(thread)) {
                format(T, $str_alt114$____Starting__a____, $current_test$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static SubLObject herald_start() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $it_verbose$.getDynamicValue(thread)) {
            format(T, $str118$__Starting__a____, $current_test$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject def_inference_test_alt(SubLObject test_keyword, SubLObject quoted_test_body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != memberP(test_keyword, $inference_tests$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR))) {
                $inference_tests$.setDynamicValue(cons(list(test_keyword, quoted_test_body), remove(test_keyword, $inference_tests$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED)), thread);
            } else {
                $inference_tests$.setDynamicValue(cons(list(test_keyword, quoted_test_body), $inference_tests$.getDynamicValue(thread)), thread);
            }
            return test_keyword;
        }
    }

    public static SubLObject def_inference_test(final SubLObject test_keyword, final SubLObject quoted_test_body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(test_keyword, $inference_tests$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR))) {
            $inference_tests$.setDynamicValue(cons(list(test_keyword, quoted_test_body), remove(test_keyword, $inference_tests$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED)), thread);
        } else {
            $inference_tests$.setDynamicValue(cons(list(test_keyword, quoted_test_body), $inference_tests$.getDynamicValue(thread)), thread);
        }
        return test_keyword;
    }

    public static final SubLObject inference_test_p_alt(SubLObject keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assoc(keyword, $inference_tests$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject inference_test_p(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assoc(keyword, $inference_tests$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject inference_test_form_alt(SubLObject keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return second(assoc(keyword, $inference_tests$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        }
    }

    public static SubLObject inference_test_form(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return second(assoc(keyword, $inference_tests$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject inference_test_mentions_invalid_constantP_alt(SubLObject it) {
        return list_utilities.tree_find_if(symbol_function($sym117$INVALID_CONSTANT_), com.cyc.cycjava.cycl.cyc_testing.inference_testing.inference_test_form(it), UNPROVIDED);
    }

    public static SubLObject inference_test_mentions_invalid_constantP(final SubLObject it) {
        return list_utilities.tree_find_if($sym121$INVALID_CONSTANT_, inference_test_form(it), UNPROVIDED);
    }

    public static SubLObject inference_test_invalid_constants(final SubLObject it) {
        return cycl_utilities.expression_gather(inference_test_form(it), $sym121$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject inference_test_names_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return Mapping.mapcar(symbol_function(FIRST), $inference_tests$.getDynamicValue(thread));
        }
    }

    public static SubLObject inference_test_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Mapping.mapcar(symbol_function(FIRST), $inference_tests$.getDynamicValue(thread));
    }

    public static final SubLObject obj_Gstring_alt(SubLObject obj) {
        if (obj.isString()) {
            return obj;
        } else {
            return format(NIL, $str_alt119$_s, obj);
        }
    }

    public static SubLObject obj_Gstring(final SubLObject obj) {
        if (obj.isString()) {
            return obj;
        }
        return format(NIL, $str123$_s, obj);
    }

    public static final SubLObject defined_inference_tests_alt(SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forceP) {
                {
                    SubLObject pathname = com.cyc.cycjava.cycl.cyc_testing.inference_testing.construct_cyc_test_filename(UNPROVIDED, UNPROVIDED);
                    if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
                        load(pathname);
                    } else {
                        format(T, $str_alt120$_s_is_not_an_accessible_pathname_, pathname);
                    }
                }
            }
            {
                SubLObject keywords = Mapping.mapcar(symbol_function(CAR), $inference_tests$.getDynamicValue(thread));
                if (NIL != keywords) {
                    return Sort.sort(copy_list(keywords), symbol_function($sym121$STRING_), symbol_function($sym122$OBJ__STRING));
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject defined_inference_tests(SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forceP) {
            final SubLObject pathname = construct_cyc_test_filename(UNPROVIDED, UNPROVIDED);
            if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
                load(pathname);
            } else {
                format(T, $str124$_s_is_not_an_accessible_pathname_, pathname);
            }
        }
        final SubLObject keywords = Mapping.mapcar(symbol_function(CAR), $inference_tests$.getDynamicValue(thread));
        if (NIL != keywords) {
            return Sort.sort(copy_list(keywords), symbol_function($sym125$STRING_), symbol_function($sym126$OBJ__STRING));
        }
        return NIL;
    }

    public static final SubLObject load_inference_tests_alt(SubLObject pathname_string) {
        if (pathname_string == UNPROVIDED) {
            pathname_string = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pathname = (pathname_string.isString()) ? ((SubLObject) (pathname_string)) : com.cyc.cycjava.cycl.cyc_testing.inference_testing.construct_cyc_test_filename(UNPROVIDED, UNPROVIDED);
                if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject success = file_utilities.load_file_catching_error(pathname);
                        SubLObject error = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != error) {
                            format(T, $str_alt123$___ERROR__LOADING__A__S, pathname_string, error);
                        }
                        return success;
                    }
                } else {
                    format(T, $str_alt124$___s_is_bound_to__s__which_is_not, PATHNAME, pathname);
                    return NIL;
                }
            }
        }
    }

    public static SubLObject load_inference_tests(SubLObject pathname_string) {
        if (pathname_string == UNPROVIDED) {
            pathname_string = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pathname = (pathname_string.isString()) ? pathname_string : construct_cyc_test_filename(UNPROVIDED, UNPROVIDED);
        if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
            thread.resetMultipleValues();
            final SubLObject success = file_utilities.load_file_catching_error(pathname);
            final SubLObject error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != error) {
                format(T, $str127$___ERROR__LOADING__A__S, pathname_string, error);
            }
            return success;
        }
        format(T, $str128$___s_is_bound_to__s__which_is_not, PATHNAME, pathname);
        return NIL;
    }

    public static final SubLObject clear_inference_tests_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $inference_tests$.setDynamicValue(NIL, thread);
            return $inference_tests$.getDynamicValue(thread);
        }
    }

    public static SubLObject clear_inference_tests() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $inference_tests$.setDynamicValue(NIL, thread);
        return $inference_tests$.getDynamicValue(thread);
    }

    public static final SubLObject clear_inference_test_results_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $test_results$.setDynamicValue(NIL, thread);
            return $test_results$.getDynamicValue(thread);
        }
    }

    public static SubLObject clear_inference_test_results() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $test_results$.setDynamicValue(NIL, thread);
        return $test_results$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t")
    public static final SubLObject do_all_tests_alt(SubLObject progress_blipP, SubLObject verboseP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject load_testsP, SubLObject return_test_runsP) {
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (output_format == UNPROVIDED) {
            output_format = cyc_testing.$it_output_format$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (load_testsP == UNPROVIDED) {
            load_testsP = T;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_runs = NIL;
                {
                    SubLObject _prev_bind_0 = cyc_testing.$it_output_format$.currentBinding(thread);
                    SubLObject _prev_bind_1 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
                    try {
                        cyc_testing.$it_output_format$.bind(output_format, thread);
                        cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
                        com.cyc.cycjava.cycl.cyc_testing.inference_testing.clear_inference_test_results();
                        thread.resetMultipleValues();
                        {
                            SubLObject backward_overall_result = com.cyc.cycjava.cycl.cyc_testing.inference_testing.do_tests_backward(progress_blipP, verboseP, load_testsP, T);
                            SubLObject backward_test_runs = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            test_runs = nconc(test_runs, backward_test_runs);
                        }
                        com.cyc.cycjava.cycl.cyc_testing.inference_testing.clear_inference_test_results();
                        thread.resetMultipleValues();
                        {
                            SubLObject forward_overall_result = com.cyc.cycjava.cycl.cyc_testing.inference_testing.do_tests_forward(progress_blipP, verboseP, load_testsP, T);
                            SubLObject forward_test_runs = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            test_runs = nconc(test_runs, forward_test_runs);
                        }
                    } finally {
                        cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_1, thread);
                        cyc_testing.$it_output_format$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result(test_runs);
                    return values(overall_result, NIL != return_test_runsP ? ((SubLObject) (test_runs)) : NIL);
                }
            }
        }
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t")
    public static SubLObject do_all_tests(SubLObject progress_blipP, SubLObject verboseP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject load_testsP, SubLObject return_test_runsP) {
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (output_format == UNPROVIDED) {
            output_format = cyc_testing.$it_output_format$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (load_testsP == UNPROVIDED) {
            load_testsP = T;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_runs = NIL;
        final SubLObject _prev_bind_0 = cyc_testing.$it_output_format$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$it_output_format$.bind(output_format, thread);
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            clear_inference_test_results();
            thread.resetMultipleValues();
            final SubLObject backward_overall_result = do_tests_backward(progress_blipP, verboseP, load_testsP, T);
            final SubLObject backward_test_runs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = nconc(test_runs, backward_test_runs);
            clear_inference_test_results();
            thread.resetMultipleValues();
            final SubLObject forward_overall_result = do_tests_forward(progress_blipP, verboseP, load_testsP, T);
            final SubLObject forward_test_runs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = nconc(test_runs, forward_test_runs);
        } finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_2, thread);
            cyc_testing.$it_output_format$.rebind(_prev_bind_0, thread);
        }
        final SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result(test_runs);
        return values(overall_result, NIL != return_test_runsP ? test_runs : NIL);
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t")
    public static final SubLObject do_tests_backward_alt(SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP) {
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (load_testsP == UNPROVIDED) {
            load_testsP = NIL;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        return com.cyc.cycjava.cycl.cyc_testing.inference_testing.do_tests(com.cyc.cycjava.cycl.cyc_testing.inference_testing.defined_inference_tests(UNPROVIDED), progress_blipP, verboseP, load_testsP, return_test_runsP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t")
    public static SubLObject do_tests_backward(SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP) {
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (load_testsP == UNPROVIDED) {
            load_testsP = NIL;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        return do_tests(defined_inference_tests(UNPROVIDED), progress_blipP, verboseP, load_testsP, return_test_runsP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t")
    public static final SubLObject do_tests_forward_alt(SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP) {
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (load_testsP == UNPROVIDED) {
            load_testsP = NIL;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        return com.cyc.cycjava.cycl.cyc_testing.inference_testing.do_tests(com.cyc.cycjava.cycl.cyc_testing.inference_testing.defined_inference_tests(UNPROVIDED), progress_blipP, verboseP, load_testsP, return_test_runsP, $FORWARD, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t")
    public static SubLObject do_tests_forward(SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP) {
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (load_testsP == UNPROVIDED) {
            load_testsP = NIL;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        return do_tests(defined_inference_tests(UNPROVIDED), progress_blipP, verboseP, load_testsP, return_test_runsP, $FORWARD, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject with_test_constants_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject specialP = NIL;
            SubLObject var_specs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt126);
            specialP = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt126);
            var_specs = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject vars = list_utilities.flatten(Mapping.mapcar(symbol_function(VAR_SPEC_VAR), var_specs));
                SubLObject test_constants = $sym128$TEST_CONSTANTS;
                return list(CLET, bq_cons(test_constants, append(vars, NIL)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(Mapping.mapcan(symbol_function(PRINT_CREATE_VAR_SPEC_CONSTANT), var_specs, EMPTY_SUBL_OBJECT_ARRAY), listS(list(CSETQ, test_constants, bq_cons(LIST, append(vars, NIL))), listS(PRINT_ASSERT, bq_cons(LIST, append(Mapping.mapcan(symbol_function(VAR_SPEC_DEF), var_specs, EMPTY_SUBL_OBJECT_ARRAY), NIL)), $list_alt135), append(body, NIL)))), list(PRINT_KILL, test_constants)));
            }
        }
    }

    public static SubLObject with_test_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject specialP = NIL;
        SubLObject var_specs = NIL;
        destructuring_bind_must_consp(current, datum, $list130);
        specialP = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list130);
        var_specs = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject vars = list_utilities.flatten(Mapping.mapcar(symbol_function(VAR_SPEC_VAR), var_specs));
        final SubLObject test_constants = $sym132$TEST_CONSTANTS;
        return list(CLET, bq_cons(test_constants, append(vars, NIL)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(Mapping.mapcan(symbol_function(PRINT_CREATE_VAR_SPEC_CONSTANT), var_specs, EMPTY_SUBL_OBJECT_ARRAY), listS(list(CSETQ, test_constants, bq_cons(LIST, append(vars, NIL))), listS(PRINT_ASSERT, bq_cons(LIST, append(Mapping.mapcan(symbol_function(VAR_SPEC_DEF), var_specs, EMPTY_SUBL_OBJECT_ARRAY), NIL)), $list139), append(body, NIL)))), list(PROGN, $list140, list(PWHEN, $clean_up_test_constantsP$, list(PRINT_KILL, test_constants)))));
    }

    public static final SubLObject with_test_assertions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject specialP = NIL;
            SubLObject mt = NIL;
            SubLObject truth_value = NIL;
            SubLObject direction = NIL;
            SubLObject var_specs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt137);
            specialP = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt137);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt137);
            truth_value = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt137);
            direction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt137);
            var_specs = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject vars = Mapping.mapcar(symbol_function(VAR_SPEC_VAR), var_specs);
                SubLObject test_assertions = $sym138$TEST_ASSERTIONS;
                return list(CLET, append(var_specs, list(list(test_assertions, bq_cons(LIST, append(vars, NIL))))), list(CUNWIND_PROTECT, listS(PROGN, list(PRINT_ASSERT, test_assertions, mt, truth_value, direction), append(body, NIL)), list(PRINT_UNASSERT, test_assertions, mt)));
            }
        }
    }

    public static SubLObject with_test_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject specialP = NIL;
        SubLObject mt = NIL;
        SubLObject truth_value = NIL;
        SubLObject direction = NIL;
        SubLObject var_specs = NIL;
        destructuring_bind_must_consp(current, datum, $list143);
        specialP = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        truth_value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        var_specs = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject vars = Mapping.mapcar(symbol_function(VAR_SPEC_VAR), var_specs);
        final SubLObject test_assertions = $sym144$TEST_ASSERTIONS;
        return list(CLET, append(var_specs, list(list(test_assertions, bq_cons(LIST, append(vars, NIL))))), list(CUNWIND_PROTECT, listS(PROGN, list(PRINT_ASSERT, test_assertions, mt, truth_value, direction), append(body, NIL)), list(PRINT_UNASSERT, test_assertions, mt)));
    }

    public static final SubLObject with_test_assertion_lists_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject specialP = NIL;
            SubLObject mt = NIL;
            SubLObject truth_value = NIL;
            SubLObject direction = NIL;
            SubLObject var_specs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt137);
            specialP = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt137);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt137);
            truth_value = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt137);
            direction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt137);
            var_specs = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject vars = Mapping.mapcar(symbol_function(VAR_SPEC_VAR), var_specs);
                SubLObject test_assertions = $sym140$TEST_ASSERTIONS;
                return list(CLET, append(var_specs, list(list(test_assertions, bq_cons(APPEND, append(vars, NIL))))), list(CUNWIND_PROTECT, listS(PROGN, list(PRINT_ASSERT, test_assertions, mt, truth_value, direction), append(body, NIL)), list(PRINT_UNASSERT, test_assertions, mt)));
            }
        }
    }

    public static SubLObject with_test_assertion_lists(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject specialP = NIL;
        SubLObject mt = NIL;
        SubLObject truth_value = NIL;
        SubLObject direction = NIL;
        SubLObject var_specs = NIL;
        destructuring_bind_must_consp(current, datum, $list143);
        specialP = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        truth_value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        var_specs = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject vars = Mapping.mapcar(symbol_function(VAR_SPEC_VAR), var_specs);
        final SubLObject test_assertions = $sym146$TEST_ASSERTIONS;
        return list(CLET, append(var_specs, list(list(test_assertions, bq_cons(APPEND, append(vars, NIL))))), list(CUNWIND_PROTECT, listS(PROGN, list(PRINT_ASSERT, test_assertions, mt, truth_value, direction), append(body, NIL)), list(PRINT_UNASSERT, test_assertions, mt)));
    }

    public static final SubLObject define_subtest_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject vars = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt142);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt142);
            vars = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject arglist = $sym143$ARGLIST;
                return list(DEFMACRO, name, list($sym145$_REST, arglist), list(RET, list(BQ_LIST, $list_alt148, list(QUOTE, vars), list(BQ_CONS, $list_alt150, listS(BQ_APPEND, arglist, $list_alt152)), list(BQ_LIST, $list_alt153, $list_alt154, list(BQ_LIST, $list_alt155, T, $str_alt156$___________A__S, list(QUOTE, list(QUOTE, name)), list(BQ_CONS, $list_alt150, listS(BQ_APPEND, arglist, $list_alt152)))), list(BQ_CONS, $list_alt157, list(QUOTE, body)), list(BQ_LIST, $list_alt153, $list_alt154, list(BQ_LIST, $list_alt155, T, $str_alt158$___________A__S, list(QUOTE, list(QUOTE, name)), list(BQ_CONS, $list_alt150, listS(BQ_APPEND, arglist, $list_alt152)))))));
            }
        }
    }

    public static SubLObject define_subtest(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject vars = NIL;
        destructuring_bind_must_consp(current, datum, $list148);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list148);
        vars = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject arglist = $sym149$ARGLIST;
        return list(DEFMACRO, name, list($sym151$_REST, arglist), list(RET, list(BQ_LIST, $list154, list(QUOTE, vars), list(BQ_CONS, $list156, listS(BQ_APPEND, arglist, $list158)), list(BQ_LIST, $list159, $list160, list(BQ_LIST, $list161, T, $str162$___________A__S, list(QUOTE, list(QUOTE, name)), list(BQ_CONS, $list156, listS(BQ_APPEND, arglist, $list158)))), list(BQ_CONS, $list163, list(QUOTE, body)), list(BQ_LIST, $list159, $list160, list(BQ_LIST, $list161, T, $str164$___________A__S, list(QUOTE, list(QUOTE, name)), list(BQ_CONS, $list156, listS(BQ_APPEND, arglist, $list158)))))));
    }

    public static final SubLObject assert_query_test_alt(SubLObject assertion_formulas, SubLObject queries, SubLObject test_fun, SubLObject specialP, SubLObject mt, SubLObject truth_value, SubLObject direction) {
        if (test_fun == UNPROVIDED) {
            test_fun = symbol_function(B_VERIFY);
        }
        if (specialP == UNPROVIDED) {
            specialP = T;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (truth_value == UNPROVIDED) {
            truth_value = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = $test_direction$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject aserts = assertion_formulas;
                SubLObject test_assertions = append(new SubLObject[]{ aserts });
                try {
                    com.cyc.cycjava.cycl.cyc_testing.inference_testing.print_assert(test_assertions, mt, truth_value, direction);
                    {
                        SubLObject cdolist_list_var = queries;
                        SubLObject query = NIL;
                        for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                            funcall(test_fun, query, mt, $it_backchain$.getDynamicValue(thread), $it_number$.getDynamicValue(thread), $it_time$.getDynamicValue(thread), $it_depth$.getDynamicValue(thread));
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            com.cyc.cycjava.cycl.cyc_testing.inference_testing.print_unassert(test_assertions, mt);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject assert_query_test(final SubLObject assertion_formulas, final SubLObject queries, SubLObject test_fun, SubLObject specialP, SubLObject mt, SubLObject truth_value, SubLObject direction) {
        if (test_fun == UNPROVIDED) {
            test_fun = symbol_function(B_VERIFY);
        }
        if (specialP == UNPROVIDED) {
            specialP = T;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (truth_value == UNPROVIDED) {
            truth_value = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = $test_direction$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_assertions = append(new SubLObject[]{ assertion_formulas });
        try {
            print_assert(test_assertions, mt, truth_value, direction);
            SubLObject cdolist_list_var = queries;
            SubLObject query = NIL;
            query = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                funcall(test_fun, query, mt, $it_backchain$.getDynamicValue(thread), $it_number$.getDynamicValue(thread), $it_time$.getDynamicValue(thread), $it_depth$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                query = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                print_unassert(test_assertions, mt);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param TEST-NAME
    keywordp
     * 		
     * @param DIRECTION
     * 		inference-test-direction-p; the direction(s) in which to run the test.  :forward, :backward, or :both.
     * @param KB
     * 		cyc-test-kb-p; :tiny, :full, or :both, whether this test should be run in the Tiny KB or the full KB.
     * @param OWNER
     * 		stringp; the email address (without the .cyc.com) of the owner of this test.
     * @param COMMENT
     * 		a description of what the test is testing.
     * @param BUG
     * 		NIL or positive-integer-p; a Bugzilla bug (if any) associated with this test.
     * @param CREATED
     * 		NIL or universal-date-p; when the test was written.
     * @param CREATOR
     * 		NIL or string; the email address (without the .cyc.com) of the creator of this test.
     * @param WORKING?
     * 		booleanp; whether the test is expected to succeed.  Defaults to t.
     * @see define-inference-unit-test
     */
    @LispMethod(comment = "@param TEST-NAME\nkeywordp\r\n\t\t\r\n@param DIRECTION\r\n\t\tinference-test-direction-p; the direction(s) in which to run the test.  :forward, :backward, or :both.\r\n@param KB\r\n\t\tcyc-test-kb-p; :tiny, :full, or :both, whether this test should be run in the Tiny KB or the full KB.\r\n@param OWNER\r\n\t\tstringp; the email address (without the .cyc.com) of the owner of this test.\r\n@param COMMENT\r\n\t\ta description of what the test is testing.\r\n@param BUG\r\n\t\tNIL or positive-integer-p; a Bugzilla bug (if any) associated with this test.\r\n@param CREATED\r\n\t\tNIL or universal-date-p; when the test was written.\r\n@param CREATOR\r\n\t\tNIL or string; the email address (without the .cyc.com) of the creator of this test.\r\n@param WORKING?\r\n\t\tbooleanp; whether the test is expected to succeed.  Defaults to t.\r\n@see define-inference-unit-test")
    public static final SubLObject define_inference_test_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject test_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt160);
            test_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt160);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_7 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt160);
                        current_7 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt160);
                        if (NIL == member(current_7, $list_alt161, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_7 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt160);
                    }
                    {
                        SubLObject direction_tail = property_list_member($DIRECTION, current);
                        SubLObject direction = (NIL != direction_tail) ? ((SubLObject) (cadr(direction_tail))) : $BACKWARD;
                        SubLObject kb_tail = property_list_member($KB, current);
                        SubLObject kb = (NIL != kb_tail) ? ((SubLObject) (cadr(kb_tail))) : NIL;
                        SubLObject owner_tail = property_list_member($OWNER, current);
                        SubLObject owner = (NIL != owner_tail) ? ((SubLObject) (cadr(owner_tail))) : NIL;
                        SubLObject comment_tail = property_list_member($COMMENT, current);
                        SubLObject comment = (NIL != comment_tail) ? ((SubLObject) (cadr(comment_tail))) : NIL;
                        SubLObject bug_tail = property_list_member($BUG, current);
                        SubLObject bug = (NIL != bug_tail) ? ((SubLObject) (cadr(bug_tail))) : NIL;
                        SubLObject created_tail = property_list_member($CREATED, current);
                        SubLObject created = (NIL != created_tail) ? ((SubLObject) (cadr(created_tail))) : NIL;
                        SubLObject creator_tail = property_list_member($CREATOR, current);
                        SubLObject creator = (NIL != creator_tail) ? ((SubLObject) (cadr(creator_tail))) : NIL;
                        SubLObject workingP_tail = property_list_member($WORKING_, current);
                        SubLObject workingP = (NIL != workingP_tail) ? ((SubLObject) (cadr(workingP_tail))) : T;
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, list(DEF_INFERENCE_TEST, test_name, list(QUOTE, listS($list_alt170, list(PCOND, bq_cons(list(CNOT, list($sym172$RUN_INFERENCE_TEST_, test_name)), $list_alt173), bq_cons(list($sym174$INFERENCE_TEST_MENTIONS_INVALID_CONSTANT_, test_name), $list_alt175), bq_cons(T, append(body, NIL))), $list_alt176))), list(new SubLObject[]{ NEW_INFERENCE_TEST, test_name, direction, kb, owner, comment, bug, created, creator, workingP }));
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param TEST-NAME
    keywordp
     * 		
     * @param DIRECTION
     * 		inference-test-direction-p; the direction(s) in which to run the test.  :forward, :backward, or :both.
     * @param KB
     * 		cyc-test-kb-p; :tiny, :full, or :both, whether this test should be run in the Tiny KB or the full KB.
     * @param OWNER
     * 		stringp; the email address (without the .cyc.com) of the owner of this test.
     * @param COMMENT
     * 		a description of what the test is testing.
     * @param BUG
     * 		NIL or positive-integer-p; a Bugzilla bug (if any) associated with this test.
     * @param CREATED
     * 		NIL or universal-date-p; when the test was written.
     * @param CREATOR
     * 		NIL or string; the email address (without the .cyc.com) of the creator of this test.
     * @param WORKING?
     * 		booleanp; whether the test is expected to succeed.  Defaults to t.
     * @see define-inference-unit-test
     */
    @LispMethod(comment = "@param TEST-NAME\nkeywordp\r\n\t\t\r\n@param DIRECTION\r\n\t\tinference-test-direction-p; the direction(s) in which to run the test.  :forward, :backward, or :both.\r\n@param KB\r\n\t\tcyc-test-kb-p; :tiny, :full, or :both, whether this test should be run in the Tiny KB or the full KB.\r\n@param OWNER\r\n\t\tstringp; the email address (without the .cyc.com) of the owner of this test.\r\n@param COMMENT\r\n\t\ta description of what the test is testing.\r\n@param BUG\r\n\t\tNIL or positive-integer-p; a Bugzilla bug (if any) associated with this test.\r\n@param CREATED\r\n\t\tNIL or universal-date-p; when the test was written.\r\n@param CREATOR\r\n\t\tNIL or string; the email address (without the .cyc.com) of the creator of this test.\r\n@param WORKING?\r\n\t\tbooleanp; whether the test is expected to succeed.  Defaults to t.\r\n@see define-inference-unit-test")
    public static SubLObject define_inference_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test_name = NIL;
        destructuring_bind_must_consp(current, datum, $list166);
        test_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list166);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list166);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list166);
            if (NIL == member(current_$7, $list167, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list166);
        }
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : $BACKWARD;
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : NIL;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        final SubLObject comment_tail = property_list_member($COMMENT, current);
        final SubLObject comment = (NIL != comment_tail) ? cadr(comment_tail) : NIL;
        final SubLObject bug_tail = property_list_member($BUG, current);
        final SubLObject bug = (NIL != bug_tail) ? cadr(bug_tail) : NIL;
        final SubLObject created_tail = property_list_member($CREATED, current);
        final SubLObject created = (NIL != created_tail) ? cadr(created_tail) : NIL;
        final SubLObject creator_tail = property_list_member($CREATOR, current);
        final SubLObject creator = (NIL != creator_tail) ? cadr(creator_tail) : NIL;
        final SubLObject workingP_tail = property_list_member($WORKING_, current);
        final SubLObject workingP = (NIL != workingP_tail) ? cadr(workingP_tail) : T;
        final SubLObject body;
        current = body = temp;
        return list(PROGN, list(DEF_INFERENCE_TEST, test_name, list(QUOTE, listS($list176, list(PCOND, bq_cons(list(CNOT, list($sym178$RUN_INFERENCE_TEST_, test_name)), $list179), bq_cons(list($sym180$INFERENCE_TEST_MENTIONS_INVALID_CONSTANT_, test_name), $list181), bq_cons(T, append(body, NIL))), $list182))), list(new SubLObject[]{ NEW_INFERENCE_TEST, test_name, direction, kb, owner, comment, bug, created, creator, workingP }));
    }

    /**
     *
     *
     * @return booleanp; Whether TEST-NAME should be run in the current dynamic context.
     * @see run-inference-unit-test?
     */
    @LispMethod(comment = "@return booleanp; Whether TEST-NAME should be run in the current dynamic context.\r\n@see run-inference-unit-test?")
    public static final SubLObject run_inference_testP_alt(SubLObject test_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject direction = com.cyc.cycjava.cycl.cyc_testing.inference_testing.inference_test_direction(test_name);
                if (!(($BOTH == direction) || (direction == $test_direction$.getDynamicValue(thread)))) {
                    return NIL;
                }
            }
            {
                SubLObject test_kb = com.cyc.cycjava.cycl.cyc_testing.inference_testing.inference_test_kb(test_name);
                if (NIL == com.cyc.cycjava.cycl.cyc_testing.inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
                    return NIL;
                }
            }
            return T;
        }
    }

    /**
     *
     *
     * @return booleanp; Whether TEST-NAME should be run in the current dynamic context.
     * @see run-inference-unit-test?
     */
    @LispMethod(comment = "@return booleanp; Whether TEST-NAME should be run in the current dynamic context.\r\n@see run-inference-unit-test?")
    public static SubLObject run_inference_testP(final SubLObject test_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject direction = inference_test_direction(test_name);
        if (($BOTH != direction) && (!direction.eql($test_direction$.getDynamicValue(thread)))) {
            return NIL;
        }
        final SubLObject test_kb = inference_test_kb(test_name);
        if (NIL == kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject kb_matches_expectationsP_alt(SubLObject expected_kb, SubLObject expected_tiny_implies_bothP) {
        {
            SubLObject non_tiny_kbP = non_tiny_kb_loadedP();
            SubLObject tiny_kbP = makeBoolean(NIL == non_tiny_kbP);
            if ((NIL != tiny_kbP) && ($FULL == expected_kb)) {
                return NIL;
            }
            if (((NIL != non_tiny_kbP) && ($TINY == expected_kb)) && (NIL == expected_tiny_implies_bothP)) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject kb_matches_expectationsP(final SubLObject expected_kb, final SubLObject expected_tiny_implies_bothP) {
        final SubLObject non_tiny_kbP = non_tiny_kb_loadedP();
        final SubLObject tiny_kbP = makeBoolean(NIL == non_tiny_kbP);
        if ((NIL != tiny_kbP) && ($FULL == expected_kb)) {
            return NIL;
        }
        if (((NIL != non_tiny_kbP) && ($TINY == expected_kb)) && (NIL == expected_tiny_implies_bothP)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject new_inference_test_alt(SubLObject test_name, SubLObject direction, SubLObject kb, SubLObject owner, SubLObject comment, SubLObject bug, SubLObject creation_date, SubLObject creator, SubLObject workingP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(test_name, KEYWORDP);
            com.cyc.cycjava.cycl.cyc_testing.inference_testing.note_inference_test_direction(test_name, direction);
            com.cyc.cycjava.cycl.cyc_testing.inference_testing.note_inference_test_kb(test_name, kb);
            com.cyc.cycjava.cycl.cyc_testing.inference_testing.note_inference_test_owner(test_name, owner);
            com.cyc.cycjava.cycl.cyc_testing.inference_testing.note_inference_test_comment(test_name, comment);
            com.cyc.cycjava.cycl.cyc_testing.inference_testing.note_inference_test_bug_number(test_name, bug);
            com.cyc.cycjava.cycl.cyc_testing.inference_testing.note_inference_test_creation_date(test_name, creation_date);
            com.cyc.cycjava.cycl.cyc_testing.inference_testing.note_inference_test_creator(test_name, creator);
            com.cyc.cycjava.cycl.cyc_testing.inference_testing.note_inference_test_working(test_name, workingP);
            cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test_name);
            return test_name;
        }
    }

    public static SubLObject new_inference_test(final SubLObject test_name, final SubLObject direction, final SubLObject kb, final SubLObject owner, final SubLObject comment, final SubLObject bug, final SubLObject creation_date, final SubLObject creator, final SubLObject workingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != keywordp(test_name) : "! keywordp(test_name) " + ("Types.keywordp(test_name) " + "CommonSymbols.NIL != Types.keywordp(test_name) ") + test_name;
        note_inference_test_direction(test_name, direction);
        note_inference_test_kb(test_name, kb);
        note_inference_test_owner(test_name, owner);
        note_inference_test_comment(test_name, comment);
        note_inference_test_bug_number(test_name, bug);
        note_inference_test_creation_date(test_name, creation_date);
        note_inference_test_creator(test_name, creator);
        note_inference_test_working(test_name, workingP);
        cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test_name);
        return test_name;
    }

    public static final SubLObject inference_test_comment_p_alt(SubLObject v_object) {
        return stringp(v_object);
    }

    public static SubLObject inference_test_comment_p(final SubLObject v_object) {
        return stringp(v_object);
    }

    public static final SubLObject inference_test_direction_p_alt(SubLObject v_object) {
        return memberP(v_object, $list_alt182, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_test_direction_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list188, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject inference_test_owner_p_alt(SubLObject v_object) {
        return stringp(v_object);
    }

    public static SubLObject inference_test_owner_p(final SubLObject v_object) {
        return stringp(v_object);
    }

    public static final SubLObject note_inference_test_direction_alt(SubLObject test_name, SubLObject direction) {
        if (NIL == direction) {
            direction = $BOTH;
        }
        SubLTrampolineFile.checkType(direction, INFERENCE_TEST_DIRECTION_P);
        put(test_name, $DIRECTION, direction);
        return direction;
    }

    public static SubLObject note_inference_test_direction(final SubLObject test_name, SubLObject direction) {
        if (NIL == direction) {
            direction = $BOTH;
        }
        assert NIL != inference_test_direction_p(direction) : "! inference_testing.inference_test_direction_p(direction) " + ("inference_testing.inference_test_direction_p(direction) " + "CommonSymbols.NIL != inference_testing.inference_test_direction_p(direction) ") + direction;
        put(test_name, $DIRECTION, direction);
        return direction;
    }

    public static final SubLObject inference_test_direction_alt(SubLObject test_name) {
        return get(test_name, $DIRECTION, UNPROVIDED);
    }

    public static SubLObject inference_test_direction(final SubLObject test_name) {
        return get(test_name, $DIRECTION, UNPROVIDED);
    }

    public static final SubLObject note_inference_test_kb_alt(SubLObject test_name, SubLObject kb) {
        SubLTrampolineFile.checkType(kb, CYC_TEST_KB_P);
        if (NIL != kb) {
            put(test_name, $KB, kb);
        }
        return kb;
    }

    public static SubLObject note_inference_test_kb(final SubLObject test_name, final SubLObject kb) {
        assert NIL != cyc_testing.cyc_test_kb_p(kb) : "! cyc_testing.cyc_test_kb_p(kb) " + ("cyc_testing.cyc_test_kb_p(kb) " + "CommonSymbols.NIL != cyc_testing.cyc_test_kb_p(kb) ") + kb;
        if (NIL != kb) {
            put(test_name, $KB, kb);
        }
        return kb;
    }

    public static final SubLObject inference_test_kb_alt(SubLObject test_name) {
        return get(test_name, $KB, UNPROVIDED);
    }

    public static SubLObject inference_test_kb(final SubLObject test_name) {
        return get(test_name, $KB, UNPROVIDED);
    }

    public static final SubLObject note_inference_test_owner_alt(SubLObject test_name, SubLObject owner) {
        SubLTrampolineFile.checkType(owner, INFERENCE_TEST_OWNER_P);
        if (NIL != owner) {
            put(test_name, $OWNER, owner);
        }
        return owner;
    }

    public static SubLObject note_inference_test_owner(final SubLObject test_name, final SubLObject owner) {
        assert NIL != inference_test_owner_p(owner) : "! inference_testing.inference_test_owner_p(owner) " + ("inference_testing.inference_test_owner_p(owner) " + "CommonSymbols.NIL != inference_testing.inference_test_owner_p(owner) ") + owner;
        if (NIL != owner) {
            put(test_name, $OWNER, owner);
        }
        return owner;
    }

    public static final SubLObject inference_test_owner_alt(SubLObject test_name) {
        return get(test_name, $OWNER, UNPROVIDED);
    }

    public static SubLObject inference_test_owner(final SubLObject test_name) {
        return get(test_name, $OWNER, UNPROVIDED);
    }

    public static final SubLObject note_inference_test_comment_alt(SubLObject test_name, SubLObject comment) {
        if (NIL != comment) {
            SubLTrampolineFile.checkType(comment, STRINGP);
        }
        if (NIL != comment) {
            put(test_name, $COMMENT, comment);
        }
        return comment;
    }

    public static SubLObject note_inference_test_comment(final SubLObject test_name, final SubLObject comment) {
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        if (NIL != comment) {
            put(test_name, $COMMENT, comment);
        }
        return comment;
    }

    public static final SubLObject inference_test_comment_alt(SubLObject test_name) {
        return get(test_name, $COMMENT, UNPROVIDED);
    }

    public static SubLObject inference_test_comment(final SubLObject test_name) {
        return get(test_name, $COMMENT, UNPROVIDED);
    }

    public static final SubLObject note_inference_test_bug_number_alt(SubLObject test_name, SubLObject bug_number) {
        if (NIL != bug_number) {
            SubLTrampolineFile.checkType(bug_number, POSITIVE_INTEGER_P);
        }
        if (NIL != bug_number) {
            put(test_name, $BUG_NUMBER, bug_number);
        }
        return bug_number;
    }

    public static SubLObject note_inference_test_bug_number(final SubLObject test_name, final SubLObject bug_number) {
        if (((NIL != bug_number) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(bug_number))) {
            throw new AssertionError(bug_number);
        }
        if (NIL != bug_number) {
            put(test_name, $BUG_NUMBER, bug_number);
        }
        return bug_number;
    }

    public static final SubLObject inference_test_bug_number_alt(SubLObject test_name) {
        return get(test_name, $BUG_NUMBER, UNPROVIDED);
    }

    public static SubLObject inference_test_bug_number(final SubLObject test_name) {
        return get(test_name, $BUG_NUMBER, UNPROVIDED);
    }

    public static final SubLObject note_inference_test_creation_date_alt(SubLObject test_name, SubLObject creation_date) {
        if (NIL != creation_date) {
            SubLTrampolineFile.checkType(creation_date, UNIVERSAL_DATE_P);
        }
        if (NIL != creation_date) {
            put(test_name, $CREATION_DATE, creation_date);
        }
        return creation_date;
    }

    public static SubLObject note_inference_test_creation_date(final SubLObject test_name, final SubLObject creation_date) {
        if (((NIL != creation_date) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == numeric_date_utilities.universal_date_p(creation_date))) {
            throw new AssertionError(creation_date);
        }
        if (NIL != creation_date) {
            put(test_name, $CREATION_DATE, creation_date);
        }
        return creation_date;
    }

    public static final SubLObject inference_test_creation_date_alt(SubLObject test_name) {
        return get(test_name, $CREATION_DATE, UNPROVIDED);
    }

    public static SubLObject inference_test_creation_date(final SubLObject test_name) {
        return get(test_name, $CREATION_DATE, UNPROVIDED);
    }

    public static final SubLObject note_inference_test_creator_alt(SubLObject test_name, SubLObject creator) {
        if (NIL != creator) {
            SubLTrampolineFile.checkType(creator, STRINGP);
        }
        if (NIL != creator) {
            put(test_name, $CREATOR, creator);
        }
        return creator;
    }

    public static SubLObject note_inference_test_creator(final SubLObject test_name, final SubLObject creator) {
        if (((NIL != creator) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(creator))) {
            throw new AssertionError(creator);
        }
        if (NIL != creator) {
            put(test_name, $CREATOR, creator);
        }
        return creator;
    }

    public static final SubLObject inference_test_creator_alt(SubLObject test_name) {
        return get(test_name, $CREATOR, UNPROVIDED);
    }

    public static SubLObject inference_test_creator(final SubLObject test_name) {
        return get(test_name, $CREATOR, UNPROVIDED);
    }

    public static final SubLObject note_inference_test_working_alt(SubLObject test_name, SubLObject workingP) {
        SubLTrampolineFile.checkType(workingP, BOOLEANP);
        put(test_name, $WORKING_, workingP);
        return workingP;
    }

    public static SubLObject note_inference_test_working(final SubLObject test_name, final SubLObject workingP) {
        assert NIL != booleanp(workingP) : "! booleanp(workingP) " + ("Types.booleanp(workingP) " + "CommonSymbols.NIL != Types.booleanp(workingP) ") + workingP;
        put(test_name, $WORKING_, workingP);
        return workingP;
    }

    public static final SubLObject inference_test_workingP_alt(SubLObject test_name) {
        return get(test_name, $WORKING_, UNPROVIDED);
    }

    public static SubLObject inference_test_workingP(final SubLObject test_name) {
        return get(test_name, $WORKING_, UNPROVIDED);
    }

    public static final SubLObject working_inference_tests_alt() {
        return list_utilities.remove_if_not($sym192$INFERENCE_TEST_WORKING_, com.cyc.cycjava.cycl.cyc_testing.inference_testing.inference_test_names(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject working_inference_tests() {
        return list_utilities.remove_if_not($sym198$INFERENCE_TEST_WORKING_, inference_test_names(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject non_working_inference_tests_alt() {
        return remove_if($sym192$INFERENCE_TEST_WORKING_, com.cyc.cycjava.cycl.cyc_testing.inference_testing.inference_test_names(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject non_working_inference_tests() {
        return remove_if($sym198$INFERENCE_TEST_WORKING_, inference_test_names(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject def_time_inference_test_alt(SubLObject test_keyword, SubLObject quoted_test_body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != memberP(test_keyword, $inference_tests$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR))) {
                $time_inference_tests$.setDynamicValue(cons(list(test_keyword, quoted_test_body), remove(test_keyword, $time_inference_tests$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED)), thread);
            } else {
                $inference_tests$.setDynamicValue(cons(list(test_keyword, quoted_test_body), $inference_tests$.getDynamicValue(thread)), thread);
            }
            return test_keyword;
        }
    }

    public static SubLObject def_time_inference_test(final SubLObject test_keyword, final SubLObject quoted_test_body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(test_keyword, $inference_tests$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR))) {
            $time_inference_tests$.setDynamicValue(cons(list(test_keyword, quoted_test_body), remove(test_keyword, $time_inference_tests$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED)), thread);
        } else {
            $inference_tests$.setDynamicValue(cons(list(test_keyword, quoted_test_body), $inference_tests$.getDynamicValue(thread)), thread);
        }
        return test_keyword;
    }

    public static final SubLObject defined_time_inference_tests_alt(SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forceP) {
                {
                    SubLObject pathname = com.cyc.cycjava.cycl.cyc_testing.inference_testing.construct_cyc_test_filename(UNPROVIDED, UNPROVIDED);
                    if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
                        load(pathname);
                    } else {
                        format(T, $str_alt120$_s_is_not_an_accessible_pathname_, pathname);
                    }
                }
            }
            {
                SubLObject keywords = Mapping.mapcar(symbol_function(CAR), $time_inference_tests$.getDynamicValue(thread));
                if (NIL != keywords) {
                    return Sort.sort(copy_list(keywords), symbol_function($sym121$STRING_), symbol_function($sym122$OBJ__STRING));
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject defined_time_inference_tests(SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forceP) {
            final SubLObject pathname = construct_cyc_test_filename(UNPROVIDED, UNPROVIDED);
            if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
                load(pathname);
            } else {
                format(T, $str124$_s_is_not_an_accessible_pathname_, pathname);
            }
        }
        final SubLObject keywords = Mapping.mapcar(symbol_function(CAR), $time_inference_tests$.getDynamicValue(thread));
        if (NIL != keywords) {
            return Sort.sort(copy_list(keywords), symbol_function($sym125$STRING_), symbol_function($sym126$OBJ__STRING));
        }
        return NIL;
    }

    public static final SubLObject do_time_tests_backward_alt(SubLObject progress_blipP, SubLObject verboseP) {
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        com.cyc.cycjava.cycl.cyc_testing.inference_testing.do_tests(com.cyc.cycjava.cycl.cyc_testing.inference_testing.defined_time_inference_tests(UNPROVIDED), progress_blipP, verboseP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject do_time_tests_backward(SubLObject progress_blipP, SubLObject verboseP) {
        if (progress_blipP == UNPROVIDED) {
            progress_blipP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        do_tests(defined_time_inference_tests(UNPROVIDED), progress_blipP, verboseP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject declare_inference_testing_file() {
        declareFunction("construct_cyc_test_filename", "CONSTRUCT-CYC-TEST-FILENAME", 0, 2, false);
        declareFunction("break_on_failureP", "BREAK-ON-FAILURE?", 0, 0, false);
        declareFunction("return_list_of_values", "RETURN-LIST-OF-VALUES", 1, 2, false);
        declareFunction("list_assertions", "LIST-ASSERTIONS", 2, 4, false);
        declareFunction("print_assertions", "PRINT-ASSERTIONS", 2, 5, false);
        declareFunction("instanceofP", "INSTANCEOF?", 2, 0, false);
        declareFunction("legacy_b_verify", "LEGACY-B-VERIFY", 2, 4, false);
        declareFunction("b_verify", "B-VERIFY", 1, 2, false);
        declareFunction("print_and_eval", "PRINT-AND-EVAL", 1, 0, false);
        declareFunction("b_test_form", "B-TEST-FORM", 1, 0, false);
        declareFunction("test_error", "TEST-ERROR", 1, 0, false);
        declareFunction("test_warning", "TEST-WARNING", 1, 0, false);
        declareFunction("test_no_warning", "TEST-NO-WARNING", 1, 0, false);
        declareFunction("form_verify", "FORM-VERIFY", 3, 1, false);
        declareFunction("test_verify", "TEST-VERIFY", 2, 0, false);
        declareFunction("test_verify_new", "TEST-VERIFY-NEW", 2, 0, false);
        declareFunction("test_verify_guts", "TEST-VERIFY-GUTS", 3, 0, false);
        declareFunction("m_verify", "M-VERIFY", 2, 2, false);
        declareFunction("legacy_binding_verify", "LEGACY-BINDING-VERIFY", 3, 4, false);
        declareFunction("binding_verify", "BINDING-VERIFY", 2, 2, false);
        declareFunction("legacy_verify_not", "LEGACY-VERIFY-NOT", 2, 4, false);
        declareFunction("verify_not", "VERIFY-NOT", 1, 2, false);
        declareFunction("print_assert", "PRINT-ASSERT", 2, 2, false);
        declareFunction("print_assert_wff", "PRINT-ASSERT-WFF", 2, 2, false);
        declareFunction("print_assert_with_time", "PRINT-ASSERT-WITH-TIME", 2, 2, false);
        declareFunction("print_unassert", "PRINT-UNASSERT", 2, 0, false);
        declareFunction("print_blast", "PRINT-BLAST", 2, 0, false);
        declareFunction("print_justify", "PRINT-JUSTIFY", 2, 1, false);
        declareFunction("print_kill", "PRINT-KILL", 1, 0, false);
        declareFunction("print_create", "PRINT-CREATE", 1, 1, false);
        declareFunction("print_tms_formula", "PRINT-TMS-FORMULA", 2, 0, false);
        declareFunction("print_tms_mt", "PRINT-TMS-MT", 1, 0, false);
        declareFunction("update_test_results", "UPDATE-TEST-RESULTS", 1, 0, false);
        declareFunction("kill_test_constants_created", "KILL-TEST-CONSTANTS-CREATED", 0, 0, false);
        declareFunction("run_test", "RUN-TEST", 1, 7, false);
        declareFunction("do_tests", "DO-TESTS", 0, 10, false);
        declareFunction("sorted_test_results", "SORTED-TEST-RESULTS", 0, 1, false);
        declareFunction("print_test_results", "PRINT-TEST-RESULTS", 0, 1, false);
        declareFunction("print_failing_tests", "PRINT-FAILING-TESTS", 0, 0, false);
        declareFunction("parameterized_test_value", "PARAMETERIZED-TEST-VALUE", 1, 3, false);
        declareMacro("print_failing_form", "PRINT-FAILING-FORM");
        declareFunction("failing_it_form_identifier", "FAILING-IT-FORM-IDENTIFIER", 1, 1, false);
        declareFunction("herald_start", "HERALD-START", 0, 0, false);
        declareFunction("def_inference_test", "DEF-INFERENCE-TEST", 2, 0, false);
        declareFunction("inference_test_p", "INFERENCE-TEST-P", 1, 0, false);
        declareFunction("inference_test_form", "INFERENCE-TEST-FORM", 1, 0, false);
        declareFunction("inference_test_mentions_invalid_constantP", "INFERENCE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareFunction("inference_test_invalid_constants", "INFERENCE-TEST-INVALID-CONSTANTS", 1, 0, false);
        declareFunction("inference_test_names", "INFERENCE-TEST-NAMES", 0, 0, false);
        declareFunction("obj_Gstring", "OBJ->STRING", 1, 0, false);
        declareFunction("defined_inference_tests", "DEFINED-INFERENCE-TESTS", 0, 1, false);
        declareFunction("load_inference_tests", "LOAD-INFERENCE-TESTS", 0, 1, false);
        declareFunction("clear_inference_tests", "CLEAR-INFERENCE-TESTS", 0, 0, false);
        declareFunction("clear_inference_test_results", "CLEAR-INFERENCE-TEST-RESULTS", 0, 0, false);
        declareFunction("do_all_tests", "DO-ALL-TESTS", 0, 6, false);
        declareFunction("do_tests_backward", "DO-TESTS-BACKWARD", 0, 4, false);
        declareFunction("do_tests_forward", "DO-TESTS-FORWARD", 0, 4, false);
        declareMacro("with_test_constants", "WITH-TEST-CONSTANTS");
        declareMacro("with_test_assertions", "WITH-TEST-ASSERTIONS");
        declareMacro("with_test_assertion_lists", "WITH-TEST-ASSERTION-LISTS");
        declareMacro("define_subtest", "DEFINE-SUBTEST");
        declareFunction("assert_query_test", "ASSERT-QUERY-TEST", 2, 5, false);
        declareMacro("define_inference_test", "DEFINE-INFERENCE-TEST");
        declareFunction("run_inference_testP", "RUN-INFERENCE-TEST?", 1, 0, false);
        declareFunction("kb_matches_expectationsP", "KB-MATCHES-EXPECTATIONS?", 2, 0, false);
        declareFunction("new_inference_test", "NEW-INFERENCE-TEST", 9, 0, false);
        declareFunction("inference_test_comment_p", "INFERENCE-TEST-COMMENT-P", 1, 0, false);
        declareFunction("inference_test_direction_p", "INFERENCE-TEST-DIRECTION-P", 1, 0, false);
        declareFunction("inference_test_owner_p", "INFERENCE-TEST-OWNER-P", 1, 0, false);
        declareFunction("note_inference_test_direction", "NOTE-INFERENCE-TEST-DIRECTION", 2, 0, false);
        declareFunction("inference_test_direction", "INFERENCE-TEST-DIRECTION", 1, 0, false);
        declareFunction("note_inference_test_kb", "NOTE-INFERENCE-TEST-KB", 2, 0, false);
        declareFunction("inference_test_kb", "INFERENCE-TEST-KB", 1, 0, false);
        declareFunction("note_inference_test_owner", "NOTE-INFERENCE-TEST-OWNER", 2, 0, false);
        declareFunction("inference_test_owner", "INFERENCE-TEST-OWNER", 1, 0, false);
        declareFunction("note_inference_test_comment", "NOTE-INFERENCE-TEST-COMMENT", 2, 0, false);
        declareFunction("inference_test_comment", "INFERENCE-TEST-COMMENT", 1, 0, false);
        declareFunction("note_inference_test_bug_number", "NOTE-INFERENCE-TEST-BUG-NUMBER", 2, 0, false);
        declareFunction("inference_test_bug_number", "INFERENCE-TEST-BUG-NUMBER", 1, 0, false);
        declareFunction("note_inference_test_creation_date", "NOTE-INFERENCE-TEST-CREATION-DATE", 2, 0, false);
        declareFunction("inference_test_creation_date", "INFERENCE-TEST-CREATION-DATE", 1, 0, false);
        declareFunction("note_inference_test_creator", "NOTE-INFERENCE-TEST-CREATOR", 2, 0, false);
        declareFunction("inference_test_creator", "INFERENCE-TEST-CREATOR", 1, 0, false);
        declareFunction("note_inference_test_working", "NOTE-INFERENCE-TEST-WORKING", 2, 0, false);
        declareFunction("inference_test_workingP", "INFERENCE-TEST-WORKING?", 1, 0, false);
        declareFunction("working_inference_tests", "WORKING-INFERENCE-TESTS", 0, 0, false);
        declareFunction("non_working_inference_tests", "NON-WORKING-INFERENCE-TESTS", 0, 0, false);
        declareFunction("def_time_inference_test", "DEF-TIME-INFERENCE-TEST", 2, 0, false);
        declareFunction("defined_time_inference_tests", "DEFINED-TIME-INFERENCE-TESTS", 0, 1, false);
        declareFunction("do_time_tests_backward", "DO-TIME-TESTS-BACKWARD", 0, 2, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$inference_tests = makeString("inference-tests");

    static private final SubLList $list_alt2 = list(makeString("tests"));

    static private final SubLString $str_alt4$___s = makeString("~%~s");

    static private final SubLString $str_alt5$__No_assertions_found_ = makeString("~%No assertions found.");

    static private final SubLString $str_alt9$_____s = makeString("~%~%~s");

    static private final SubLString $str_alt10$____Success___s________________s = makeString("~%~%Success: ~s~%         ==> ~s");

    static private final SubLString $str_alt12$____Failure___s________________s = makeString("~%~%Failure: ~s~%         ==> ~s");

    static private final SubLString $str_alt13$Failure___s________________s = makeString("Failure: ~s~%         ==> ~s");

    static private final SubLString $str_alt14$____Success___s________________s_ = makeString("~%~%Success: ~s~%         ==> ~s~%");

    static private final SubLString $str_alt15$____Failure___s________________s_ = makeString("~%~%Failure: ~s~%         ==> ~s~%");

    static private final SubLString $str_alt17$_A = makeString("~A");

    static private final SubLString $str_alt18$____Success___A__ = makeString("~%~%Success: ~A~%");

    static private final SubLString $str_alt19$____Failure___s_______________NO_ = makeString("~%~%Failure: ~s~%         ==> NO ERROR~%");

    static private final SubLString $str_alt20$____Failure___A__ = makeString("~%~%Failure: ~A~%");

    static private final SubLString $str_alt21$____Success___s_______________NO_ = makeString("~%~%Success: ~s~%         ==> NO ERROR~%");

    static private final SubLString $str_alt22$____Success___s________________s_ = makeString("~%~%Success: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s");

    static private final SubLString $str_alt23$____Failure___s________________s_ = makeString("~%~%Failure: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s");

    static private final SubLString $str_alt24$Failure___s________________s__Com = makeString("Failure: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s");

    static private final SubLString $str_alt27$____Success___s________________s_ = makeString("~%~%Success: ~s~%         ==> ~s  passes ~s");

    static private final SubLString $str_alt28$____Failure___s________________s_ = makeString("~%~%Failure: ~s~%         ==> ~s fails ~s");

    static private final SubLString $str_alt29$Failure___s________________s_fail = makeString("Failure: ~s~%         ==> ~s fails ~s");

    public static SubLObject init_inference_testing_file() {
        defparameter("*DEFAULT-CYC-TEST-FILE*", $str0$inference_tests);
        defvar("*INFERENCE-TESTS*", NIL);
        defparameter("*TEST-CONSTANTS-CREATED*", NIL);
        defparameter("*CURRENT-TEST*", NIL);
        defparameter("*TEST-STATUS*", NIL);
        defparameter("*TEST-RESULTS*", NIL);
        defparameter("*BREAK-ON-FAILURE*", NIL);
        defparameter("*BREAK-ON-FAILURE?*", NIL);
        defparameter("*BREAK-BEFORE-TEST-END?*", NIL);
        defparameter("*ELAPSED-TIME*", NIL);
        defparameter("*IT-FAILING-VERBOSE*", T);
        defparameter("*IT-VERBOSE*", T);
        defparameter("*IT-BACKCHAIN*", NIL);
        defparameter("*IT-NUMBER*", ONE_INTEGER);
        defparameter("*IT-TIME*", TWENTY_INTEGER);
        defparameter("*IT-DEPTH*", TWENTY_INTEGER);
        defparameter("*TEST-DIRECTION*", $BACKWARD);
        defparameter("*VERIFY-AS-CONTINUABLE?*", NIL);
        defparameter("*INDEX-COLLECTION*", NIL);
        defparameter("*DEBUG-CONTINUE*", NIL);
        defparameter("*IT-SHOW-ALL-FAILURES*", NIL);
        defparameter("*EVALUATE-PREVIOUSLY-FAILING-TESTS*", NIL);
        defparameter("*KNOWN-BUG-TYPES-TO-CHECK*", NIL);
        defparameter("*CHECK-ALL-IT-BUG-TYPES*", NIL);
        defparameter("*CLEAN-UP-TEST-CONSTANTS?*", T);
        defvar("*TIME-INFERENCE-TESTS*", NIL);
        return NIL;
    }

    static private final SubLString $str_alt31$____Normal___s_______________s__E = makeString("~%~%Normal: ~s~%        ==> ~s~%Expected: ~s");

    static private final SubLString $str_alt33$____Abnormal___s_________________ = makeString("~%~%Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s");

    static private final SubLString $str_alt34$Abnormal___s_________________s__E = makeString("Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s");

    static private final SubLString $str_alt36$____Abnormal___s_______________s_ = makeString("~%~%Abnormal: ~s~%        ==> ~s~%Expected: ~s");

    static private final SubLString $str_alt37$Abnormal___s_______________s__Exp = makeString("Abnormal: ~s~%        ==> ~s~%Expected: ~s");

    static private final SubLString $str_alt42$____Failure__Assertion__s_failed_ = makeString("~%~%Failure: Assertion ~s failed.");

    static private final SubLString $str_alt43$Failure__Assertion__s_failed_ = makeString("Failure: Assertion ~s failed.");

    public static final SubLObject setup_inference_testing_file_alt() {
        register_macro_helper(DEF_INFERENCE_TEST, DEFINE_INFERENCE_TEST);
        register_macro_helper($sym172$RUN_INFERENCE_TEST_, DEFINE_INFERENCE_TEST);
        register_macro_helper(NEW_INFERENCE_TEST, DEFINE_INFERENCE_TEST);
        define_obsolete_register(DEF_TIME_INFERENCE_TEST, NIL);
        define_obsolete_register(DEFINED_TIME_INFERENCE_TESTS, NIL);
        define_obsolete_register(DO_TIME_TESTS_BACKWARD, NIL);
        return NIL;
    }

    public static SubLObject setup_inference_testing_file() {
        if (SubLFiles.USE_V1) {
            register_macro_helper(DEF_INFERENCE_TEST, DEFINE_INFERENCE_TEST);
            register_macro_helper($sym178$RUN_INFERENCE_TEST_, DEFINE_INFERENCE_TEST);
            register_macro_helper(NEW_INFERENCE_TEST, DEFINE_INFERENCE_TEST);
            define_obsolete_register(DEF_TIME_INFERENCE_TEST, NIL);
            define_obsolete_register(DEFINED_TIME_INFERENCE_TESTS, NIL);
            define_obsolete_register(DO_TIME_TESTS_BACKWARD, NIL);
        }
        if (SubLFiles.USE_V2) {
            register_macro_helper($sym172$RUN_INFERENCE_TEST_, DEFINE_INFERENCE_TEST);
        }
        return NIL;
    }

    public static SubLObject setup_inference_testing_file_Previous() {
        register_macro_helper(DEF_INFERENCE_TEST, DEFINE_INFERENCE_TEST);
        register_macro_helper($sym178$RUN_INFERENCE_TEST_, DEFINE_INFERENCE_TEST);
        register_macro_helper(NEW_INFERENCE_TEST, DEFINE_INFERENCE_TEST);
        define_obsolete_register(DEF_TIME_INFERENCE_TEST, NIL);
        define_obsolete_register(DEFINED_TIME_INFERENCE_TESTS, NIL);
        define_obsolete_register(DO_TIME_TESTS_BACKWARD, NIL);
        return NIL;
    }

    static private final SubLString $str_alt47$__Justification_____s = makeString("~%Justification => ~s");

    static private final SubLString $str_alt50$____Failure__Did_not_find_unique_ = makeString("~%~%Failure: Did not find unique name to create a constant for ~s.");

    static private final SubLString $str_alt51$Failure__Create_constant__s_faile = makeString("Failure: Create constant ~s failed.");

    @Override
    public void declareFunctions() {
        declare_inference_testing_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_testing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_testing_file();
    }

    static {
    }

    static private final SubLString $str_alt60$____s = makeString("-> ~s");

    static private final SubLString $str_alt61$Warning__Test__ = makeString("Warning: Test (");

    static private final SubLString $str_alt62$_ = makeString(" ");

    static private final SubLString $str_alt63$__changed_the_KB_ = makeString(") changed the KB!");

    static private final SubLString $str_alt64$___A__ = makeString("~&~A~%");

    static private final SubLString $str_alt65$___s_constant_A__A__ = makeString("  ~s constant~A ~A~%");

    static private final SubLString $str_alt67$_was = makeString(" was");

    static private final SubLString $str_alt70$___s_nart_A__A__ = makeString("  ~s nart~A ~A~%");

    static private final SubLString $str_alt71$___s_assertion_A__A__ = makeString("  ~s assertion~A ~A~%");

    static private final SubLString $str_alt72$___s_kb_hl_support_A__A__ = makeString("  ~s kb-hl-support~A ~A~%");

    static private final SubLString $str_alt73$___s_deduction_A__A__ = makeString("  ~s deduction~A ~A~%");

    static private final SubLString $str_alt74$__There_is_no_test_in__s_associat = makeString("~&There is no test in ~s associated with ~s.~%");

    static private final SubLString $str_alt76$__In_fact__there_are_no_tests_in_ = makeString("~&In fact, there are no tests in ~s at all!~%");

    static private final SubLString $str_alt77$__The__s_argument_is__s__which_is = makeString("~%The ~s argument is ~s, which is not a list of test keywords.");

    static private final SubLSymbol $sym79$TERM__ = makeSymbol("TERM-<");

    static private final SubLString $str_alt82$__ = makeString("~%");

    static private final SubLString $str_alt84$__ = makeString("->");

    static private final SubLString $str_alt86$_IT = makeString(":IT");

    static private final SubLString $str_alt87$Unknown_output_format__A = makeString("Unknown output format ~A");

    static private final SubLString $str_alt88$___s__a__s__OWNER__s = makeString("~%~s ~a ~s :OWNER ~s");

    static private final SubLString $str_alt89$___s__a__s = makeString("~%~s ~a ~s");

    static private final SubLString $str_alt90$___s_____s = makeString("~%~s -> ~s");

    static private final SubLList $list_alt91 = list(makeSymbol("FORM"), makeSymbol("&OPTIONAL"), makeSymbol("KEYWORD"), list(makeSymbol("KEYWORD-TEST"), list(QUOTE, list(makeSymbol("FUNCTION"), EQUAL))), makeSymbol("MESSAGE"), makeSymbol("MESSAGE-LIST"));

    static private final SubLList $list_alt92 = list(makeSymbol("FUNCTION"), EQUAL);

    static private final SubLList $list_alt104 = list(list(makeSymbol("*IT-VERBOSE*"), T), list(makeSymbol("*TEST-STATUS*"), NIL));

    static private final SubLString $str_alt106$__The_previously_failing_test____ = makeString("~&The previously failing test~%  ~s~%of type ~s was evaluated immediately after this.~%");

    static private final SubLList $list_alt110 = list(makeSymbol("FUNCTION"), makeSymbol("FORMAT"));

    static private final SubLString $str_alt112$__This_previously_failing_test___ = makeString("~&This previously failing test~%  ~s~%of type ~s was not evaluated.~%");

    static private final SubLString $str_alt113$__This_previously_failing_test___ = makeString("~&This previously failing test~%  ~s~%was not evaluated.~%");

    static private final SubLString $str_alt114$____Starting__a____ = makeString("~%~%Starting ~a ...");

    static private final SubLSymbol $sym117$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    static private final SubLString $str_alt119$_s = makeString("~s");

    static private final SubLString $str_alt120$_s_is_not_an_accessible_pathname_ = makeString("~s is not an accessible pathname.");

    static private final SubLSymbol $sym121$STRING_ = makeSymbol("STRING<");

    static private final SubLSymbol $sym122$OBJ__STRING = makeSymbol("OBJ->STRING");

    static private final SubLString $str_alt123$___ERROR__LOADING__A__S = makeString("~%:ERROR :LOADING ~A ~S");

    static private final SubLString $str_alt124$___s_is_bound_to__s__which_is_not = makeString("~%~s is bound to ~s, which is not known to be a valid pathname.");

    static private final SubLList $list_alt126 = list(makeSymbol("SPECIAL?"), makeSymbol("VAR-SPECS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym128$TEST_CONSTANTS = makeUninternedSymbol("TEST-CONSTANTS");

    static private final SubLList $list_alt135 = list(makeSymbol("*DEFAULT-ASSERT-MT*"), makeKeyword("MONOTONIC"), makeKeyword("FORWARD"));

    static private final SubLList $list_alt137 = list(makeSymbol("SPECIAL?"), makeSymbol("MT"), makeSymbol("TRUTH-VALUE"), makeSymbol("DIRECTION"), makeSymbol("VAR-SPECS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym138$TEST_ASSERTIONS = makeUninternedSymbol("TEST-ASSERTIONS");

    static private final SubLSymbol $sym140$TEST_ASSERTIONS = makeUninternedSymbol("TEST-ASSERTIONS");

    static private final SubLList $list_alt142 = list(makeSymbol("NAME"), makeSymbol("VARS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym143$ARGLIST = makeUninternedSymbol("ARGLIST");

    static private final SubLSymbol $sym145$_REST = makeSymbol("&REST");

    static private final SubLList $list_alt148 = list(QUOTE, makeSymbol("CDESTRUCTURING-BIND"));

    static private final SubLList $list_alt150 = list(QUOTE, makeSymbol("LIST"));

    static private final SubLList $list_alt152 = list(NIL);

    static private final SubLList $list_alt153 = list(QUOTE, makeSymbol("PWHEN"));

    static private final SubLList $list_alt154 = list(QUOTE, makeSymbol("*IT-VERBOSE*"));

    static private final SubLList $list_alt155 = list(QUOTE, makeSymbol("FORMAT"));

    static private final SubLString $str_alt156$___________A__S = makeString("~&~%>>>>> ~A ~S");

    static private final SubLList $list_alt157 = list(QUOTE, makeSymbol("PROGN"));

    static private final SubLString $str_alt158$___________A__S = makeString("~&~%<<<<< ~A ~S");

    static private final SubLList $list_alt160 = list(makeSymbol("TEST-NAME"), list(new SubLObject[]{ makeSymbol("&KEY"), list(makeSymbol("DIRECTION"), makeKeyword("BACKWARD")), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("COMMENT"), makeSymbol("BUG"), makeSymbol("CREATED"), makeSymbol("CREATOR"), list(makeSymbol("WORKING?"), T) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt161 = list(makeKeyword("DIRECTION"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("COMMENT"), makeKeyword("BUG"), makeKeyword("CREATED"), makeKeyword("CREATOR"), makeKeyword("WORKING?"));

    static private final SubLList $list_alt170 = list(makeSymbol("HERALD-START"));

    static private final SubLSymbol $sym172$RUN_INFERENCE_TEST_ = makeSymbol("RUN-INFERENCE-TEST?");

    static private final SubLList $list_alt173 = list(list(makeSymbol("CSETQ"), makeSymbol("*TEST-STATUS*"), makeKeyword("NOT-RUN")));

    static private final SubLSymbol $sym174$INFERENCE_TEST_MENTIONS_INVALID_CONSTANT_ = makeSymbol("INFERENCE-TEST-MENTIONS-INVALID-CONSTANT?");

    static private final SubLList $list_alt175 = list(list(makeSymbol("CSETQ"), makeSymbol("*TEST-STATUS*"), makeKeyword("INVALID")));

    static private final SubLList $list_alt176 = list(list(makeSymbol("UPDATE-TEST-RESULTS"), makeSymbol("*CURRENT-TEST*")));

    static private final SubLList $list_alt182 = list(makeKeyword("FORWARD"), makeKeyword("BACKWARD"), $BOTH);

    static private final SubLSymbol $sym192$INFERENCE_TEST_WORKING_ = makeSymbol("INFERENCE-TEST-WORKING?");
}

/**
 * Total time: 794 ms synthetic
 */
