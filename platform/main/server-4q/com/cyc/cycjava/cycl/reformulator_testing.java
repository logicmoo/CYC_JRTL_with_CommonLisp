package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_testing extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_testing();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_testing";

    public static final String myFingerPrint = "96eb420b8812d27ef1011eaee2a069ecdfd90f1d3b12d5b2cd47aaa535359962";













    private static final SubLSymbol REFORMULATE_CYCL = makeSymbol("REFORMULATE-CYCL");





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$ReformulatorTestCase = reader_make_constant_shell(makeString("ReformulatorTestCase"));

    private static final SubLString $str11$____Testing__S_RL_Module___ = makeString("~%~%Testing ~S RL Module...");

    private static final SubLString $str12$__Average_time___usec____d = makeString("~%Average time  (usec): ~d");

    private static final SubLString $str13$__Expected_time__usec____d = makeString("~%Expected time (usec): ~d");

    private static final SubLString $str14$____No_tests_found_for__S_RL_Modu = makeString("~%~%No tests found for ~S RL Module.~%");



    private static final SubLString $str16$__via_hub_ = makeString(" (via hub)");





    private static final SubLSymbol REIFY_WHEN_CLOSED_NAUT = makeSymbol("REIFY-WHEN-CLOSED-NAUT");

    private static final SubLSymbol $sym20$_TESTCASE = makeSymbol("?TESTCASE");

    private static final SubLObject $$reformulatorTestCaseModuleTested = reader_make_constant_shell(makeString("reformulatorTestCaseModuleTested"));

    private static final SubLInteger $int$1000000 = makeInteger(1000000);

    private static final SubLString $str23$___A_OK = makeString("~%~A OK");

    private static final SubLString $str24$___Failure_on_test__A_INPUT____A_ = makeString("~%\nFailure on test ~A\nINPUT : ~A\nMT: ~A\nSETTINGS: ~S\nWANTED : ~A\nGOT : ~A\nWITH JUSTIFICATION : ~A~%");

    private static final SubLSymbol $RL_MODULE_NOT_APPLICABLE = makeKeyword("RL-MODULE-NOT-APPLICABLE");



    private static final SubLObject $const27$reformulatorTestCaseInputExpressi = reader_make_constant_shell(makeString("reformulatorTestCaseInputExpression"));

    private static final SubLList $list28 = list(makeKeyword("ANSWER"));

    private static final SubLObject $const29$reformulatorTestCaseOutputExpress = reader_make_constant_shell(makeString("reformulatorTestCaseOutputExpression"));

    private static final SubLObject $$reformulatorTestCaseMicrotheory = reader_make_constant_shell(makeString("reformulatorTestCaseMicrotheory"));

    private static final SubLObject $$reformulatorTestCaseSettings = reader_make_constant_shell(makeString("reformulatorTestCaseSettings"));

    private static final SubLObject $const32$reformulatorTestCaseRequiresRecur = reader_make_constant_shell(makeString("reformulatorTestCaseRequiresRecursion"));

    private static final SubLString $str33$No_input_expression_for_reformula = makeString("No input expression for reformulator test ~s~%");

    private static final SubLString $str34$singleEntryFormatInArgs_violation = makeString("singleEntryFormatInArgs violation on input expression for reformulator test ~s~%");

    private static final SubLString $str35$No_output_expression_for_reformul = makeString("No output expression for reformulator test ~s~%");

    private static final SubLString $str36$singleEntryFormatInArgs_violation = makeString("singleEntryFormatInArgs violation on output expression for reformulator test ~s~%");

    public static final SubLString $str37$singleEntryFormatInArgs_violation = makeString("singleEntryFormatInArgs violation on microtheory for reformulator test ~s~%");

    private static final SubLString $str38$singleEntryFormatInArgs_format_vi = makeString("singleEntryFormatInArgs format violation on settings for reformulator test ~s~%");





    public static SubLObject test_reformulator(SubLObject stream, SubLObject test_rl_modulesP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (test_rl_modulesP == UNPROVIDED) {
            test_rl_modulesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reformulator_datastructures.clear_reformulator_caches();
        SubLObject result = $SUCCESS;
        SubLObject success_count = ZERO_INTEGER;
        SubLObject total_count = ZERO_INTEGER;
        final SubLObject all_tests = get_all_reformulator_tests();
        SubLObject all_rl_module_tests = NIL;
        SubLObject all_non_rl_module_tests = NIL;
        final SubLObject v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) " + v_memoization_state;
        final SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
        try {
            reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject cdolist_list_var = reformulator_module_harness.rl_module_store();
                    SubLObject mod = NIL;
                    mod = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject rl_module = mod;
                        final SubLObject tests = get_rl_module_unit_tests(reformulator_module_harness.rl_module_name(rl_module));
                        all_rl_module_tests = nconc(all_rl_module_tests, tests);
                        if ((NIL != test_rl_modulesP) && $FAILURE.eql(test_rl_module_int(rl_module, tests, NIL, stream))) {
                            result = $FAILURE;
                        } else {
                            success_count = add(success_count, ONE_INTEGER);
                        }
                        total_count = add(total_count, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        mod = cdolist_list_var.first();
                    } 
                    all_non_rl_module_tests = cdolist_list_var = set_difference(all_tests, all_rl_module_tests, symbol_function(EQUAL), symbol_function(FIFTH));
                    SubLObject test = NIL;
                    test = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject mt = third(test);
                        final SubLObject settings = fourth(test);
                        final SubLObject test_id = fifth(test);
                        final SubLObject source = reformulator_hub.canonicalize_reformulator_expression_cached(test.first(), mt, NIL, $NONE);
                        final SubLObject target = second(test);
                        if ($FAILURE.eql(perform_one_reformulator_test_int(test_id, stream, source, target, mt, settings, symbol_function(TRUE), REFORMULATE_CYCL, UNPROVIDED))) {
                            result = $FAILURE;
                        } else {
                            success_count = add(success_count, ONE_INTEGER);
                        }
                        total_count = add(total_count, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        test = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(result, success_count, total_count);
    }

    public static SubLObject test_all_rl_modules(SubLObject test_ref_hubP, SubLObject stream) {
        if (test_ref_hubP == UNPROVIDED) {
            test_ref_hubP = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = T;
        reformulator_datastructures.clear_reformulator_caches();
        final SubLObject v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) " + v_memoization_state;
        final SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
        try {
            reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$3 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject cdolist_list_var = reformulator_module_harness.rl_module_store();
                    SubLObject mod = NIL;
                    mod = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject rl_module = mod;
                        if ($FAILURE.eql(test_rl_module_int(rl_module, get_rl_module_unit_tests(reformulator_module_harness.rl_module_name(rl_module)), test_ref_hubP, stream))) {
                            successP = NIL;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mod = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL != successP ? $SUCCESS : $FAILURE;
    }

    public static SubLObject test_rl_module(final SubLObject rl_module_constant, SubLObject test_ref_hubP, SubLObject stream) {
        if (test_ref_hubP == UNPROVIDED) {
            test_ref_hubP = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject rl_module = reformulator_module_harness.get_rl_module_from_store(rl_module_constant);
        if (NIL == rl_module) {
            return $NOT_FOUND;
        }
        return test_rl_module_int(rl_module, get_rl_module_unit_tests(rl_module_constant), test_ref_hubP, stream);
    }

    public static SubLObject get_all_reformulator_tests() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_cases = NIL;
        SubLObject kb_test_cases = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            kb_test_cases = isa.all_fort_instances($$ReformulatorTestCase, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = kb_test_cases;
        SubLObject kb_test_case = NIL;
        kb_test_case = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            test_cases = cons(kb_reformulator_test_to_list(kb_test_case, $$EverythingPSC), test_cases);
            cdolist_list_var = cdolist_list_var.rest();
            kb_test_case = cdolist_list_var.first();
        } 
        return test_cases;
    }

    public static SubLObject test_rl_module_int(final SubLObject rl_module, final SubLObject tests, final SubLObject test_ref_hubP, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject module_constant = reformulator_module_harness.rl_module_name(rl_module);
        SubLObject total_time = ZERO_INTEGER;
        SubLObject total_expected_time = ZERO_INTEGER;
        SubLObject result = $SUCCESS;
        if (NIL == tests) {
            format(stream, $str14$____No_tests_found_for__S_RL_Modu, module_constant);
            return $VACUOUS;
        }
        format(stream, $str11$____Testing__S_RL_Module___, module_constant);
        reformulator_datastructures.clear_reformulator_caches();
        final SubLObject v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) " + v_memoization_state;
        final SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
        try {
            reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$5 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject cdolist_list_var = tests;
                    SubLObject test = NIL;
                    test = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject requires_recursionP = sixth(test);
                        if (NIL == requires_recursionP) {
                            thread.resetMultipleValues();
                            final SubLObject test_result = perform_one_rl_module_test(rl_module, test, NIL, stream);
                            final SubLObject test_time = thread.secondMultipleValue();
                            final SubLObject expected_cost = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            total_time = add(total_time, test_time);
                            total_expected_time = add(total_expected_time, expected_cost);
                            if ($FAILURE.eql(test_result)) {
                                result = $FAILURE;
                            }
                        }
                        if ((NIL != test_ref_hubP) || (NIL != requires_recursionP)) {
                            thread.resetMultipleValues();
                            final SubLObject test_result = perform_one_rl_module_test(rl_module, test, T, stream);
                            final SubLObject test_time = thread.secondMultipleValue();
                            final SubLObject expected_cost = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if ($FAILURE.eql(test_result)) {
                                result = $FAILURE;
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        test = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        format(stream, $str12$__Average_time___usec____d, round(divide(total_time, length(tests)), UNPROVIDED));
        format(stream, $str13$__Expected_time__usec____d, round(divide(total_expected_time, length(tests)), UNPROVIDED));
        return result;
    }

    public static SubLObject perform_one_rl_module_test(final SubLObject rl_module, final SubLObject test, final SubLObject test_ref_hubP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = third(test);
        SubLObject settings = copy_list(fourth(test));
        final SubLObject test_id = fifth(test);
        final SubLObject source = reformulator_hub.canonicalize_reformulator_expression_cached(test.first(), mt, NIL, $NONE);
        final SubLObject target = second(test);
        final SubLObject cost = reformulator_module_harness.rl_module_cost(rl_module, source, mt, settings);
        SubLObject required_function = NIL;
        SubLObject reformulate_function = NIL;
        SubLObject name = NIL;
        if (NIL != test_ref_hubP) {
            name = cconcatenate(string_utilities.str(test_id), $str16$__via_hub_);
            required_function = symbol_function(TRUE);
            reformulate_function = REFORMULATE_CYCL;
            settings = putf(settings, $FOCUS, reformulator_module_harness.rl_module_name(rl_module));
            settings = putf(settings, $RECURSION_LIMIT, FIVE_INTEGER);
        } else {
            name = test_id;
            required_function = reformulator_module_harness.rl_module_required_function(rl_module);
            reformulate_function = reformulator_module_harness.rl_module_reformulate_function(rl_module);
        }
        thread.resetMultipleValues();
        final SubLObject keyword = perform_one_reformulator_test_int(name, stream, source, target, mt, settings, required_function, reformulate_function, test_ref_hubP);
        final SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(keyword, time, cost);
    }

    public static SubLObject get_rl_module_unit_tests(final SubLObject module_constant) {
        SubLObject test_cases = NIL;
        SubLObject cdolist_list_var;
        final SubLObject kb_test_cases = cdolist_list_var = list_utilities.nmapcar(REIFY_WHEN_CLOSED_NAUT, delete_duplicates(ask_utilities.ask_template($sym20$_TESTCASE, list($$reformulatorTestCaseModuleTested, $sym20$_TESTCASE, module_constant), $$EverythingPSC, ONE_INTEGER, NIL, NIL, NIL), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject kb_test_case = NIL;
        kb_test_case = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            test_cases = cons(kb_reformulator_test_to_list(kb_test_case, $$EverythingPSC), test_cases);
            cdolist_list_var = cdolist_list_var.rest();
            kb_test_case = cdolist_list_var.first();
        } 
        return test_cases;
    }

    public static SubLObject perform_one_reformulator_test_int(final SubLObject name, final SubLObject stream, SubLObject source, final SubLObject target, final SubLObject mt, final SubLObject settings, final SubLObject required_function, final SubLObject reformulate_function, SubLObject test_ref_hubP) {
        if (test_ref_hubP == UNPROVIDED) {
            test_ref_hubP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject local_time = ZERO_INTEGER;
        SubLObject actual = NIL;
        SubLObject not_applicableP = NIL;
        SubLObject justification = NIL;
        SubLObject result = NIL;
        final SubLObject original_clause = NIL;
        if (NIL != funcall(required_function, source, mt, settings)) {
            final SubLObject time_var = get_internal_real_time();
            if ((reformulate_function == REFORMULATE_CYCL) || (NIL != test_ref_hubP)) {
                thread.resetMultipleValues();
                final SubLObject actual_$7 = funcall(reformulate_function, source, mt, settings);
                final SubLObject justification_$8 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                actual = actual_$7;
                justification = justification_$8;
            } else {
                thread.resetMultipleValues();
                final SubLObject actual_$8 = funcall(reformulate_function, source, original_clause, mt, settings);
                final SubLObject justification_$9 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                actual = actual_$8;
                justification = justification_$9;
            }
            local_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            actual = reformulator_hub.uncanonicalize_rl_expression_cached(actual, mt);
        } else {
            not_applicableP = T;
            actual = reformulator_hub.uncanonicalize_rl_expression_cached(source, mt);
        }
        local_time = round(multiply($int$1000000, local_time), UNPROVIDED);
        if (NIL != czer_utilities.equals_elP(target, actual, mt, UNPROVIDED, UNPROVIDED)) {
            format(stream, $str23$___A_OK, name);
            result = $SUCCESS;
        } else {
            format(stream, $str24$___Failure_on_test__A_INPUT____A_, new SubLObject[]{ name, source, mt, settings, target, NIL != not_applicableP ? $RL_MODULE_NOT_APPLICABLE : actual, justification });
            result = $FAILURE;
        }
        force_output(stream);
        return values(result, local_time);
    }

    public static SubLObject kb_reformulator_test_to_list(final SubLObject kb_test_case, final SubLObject test_case_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kb_input_expr = backward.removal_ask_variable($ANSWER, listS($const27$reformulatorTestCaseInputExpressi, kb_test_case, $list28), test_case_mt, UNPROVIDED, UNPROVIDED);
        final SubLObject kb_output_expr = backward.removal_ask_variable($ANSWER, listS($const29$reformulatorTestCaseOutputExpress, kb_test_case, $list28), test_case_mt, UNPROVIDED, UNPROVIDED);
        final SubLObject kb_mt = backward.removal_ask_variable($ANSWER, listS($$reformulatorTestCaseMicrotheory, kb_test_case, $list28), test_case_mt, UNPROVIDED, UNPROVIDED);
        final SubLObject kb_settings = backward.removal_ask_variable($ANSWER, listS($$reformulatorTestCaseSettings, kb_test_case, $list28), test_case_mt, UNPROVIDED, UNPROVIDED);
        final SubLObject kb_recursion_required = backward.removal_ask(list($const32$reformulatorTestCaseRequiresRecur, kb_test_case), test_case_mt, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == kb_input_expr)) {
            Errors.error($str33$No_input_expression_for_reformula, kb_test_case);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(kb_input_expr))) {
            Errors.error($str34$singleEntryFormatInArgs_violation, kb_test_case);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == kb_output_expr)) {
            Errors.error($str35$No_output_expression_for_reformul, kb_test_case);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(kb_output_expr))) {
            Errors.error($str36$singleEntryFormatInArgs_violation, kb_test_case);
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != kb_mt)) && (NIL == list_utilities.singletonP(kb_mt))) {
            Errors.error($str37$singleEntryFormatInArgs_violation, kb_test_case);
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != kb_settings)) && (NIL == list_utilities.singletonP(kb_settings))) {
            Errors.error($str38$singleEntryFormatInArgs_format_vi, kb_test_case);
        }
        final SubLObject ref_input_expr = kb_input_expr.first();
        final SubLObject ref_output_expr = kb_output_expr.first();
        final SubLObject ref_mt = kb_mt.first();
        final SubLObject ref_settings = (NIL != el_list_p(kb_settings.first())) ? transform_list_utilities.transform(el_list_items(kb_settings.first()), EL_LIST_P, EL_LIST_ITEMS, UNPROVIDED) : NIL;
        final SubLObject ref_recursion_requiredP = list_utilities.sublisp_boolean(kb_recursion_required);
        return list(ref_input_expr, ref_output_expr, ref_mt, ref_settings, kb_test_case, ref_recursion_requiredP);
    }

    public static SubLObject declare_reformulator_testing_file() {
        declareFunction(me, "test_reformulator", "TEST-REFORMULATOR", 0, 2, false);
        declareFunction(me, "test_all_rl_modules", "TEST-ALL-RL-MODULES", 0, 2, false);
        declareFunction(me, "test_rl_module", "TEST-RL-MODULE", 1, 2, false);
        declareFunction(me, "get_all_reformulator_tests", "GET-ALL-REFORMULATOR-TESTS", 0, 0, false);
        declareFunction(me, "test_rl_module_int", "TEST-RL-MODULE-INT", 3, 1, false);
        declareFunction(me, "perform_one_rl_module_test", "PERFORM-ONE-RL-MODULE-TEST", 4, 0, false);
        declareFunction(me, "get_rl_module_unit_tests", "GET-RL-MODULE-UNIT-TESTS", 1, 0, false);
        declareFunction(me, "perform_one_reformulator_test_int", "PERFORM-ONE-REFORMULATOR-TEST-INT", 8, 1, false);
        declareFunction(me, "kb_reformulator_test_to_list", "KB-REFORMULATOR-TEST-TO-LIST", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_testing_file() {
        return NIL;
    }

    public static SubLObject setup_reformulator_testing_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_testing_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_testing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_testing_file();
    }

    
}

/**
 * Total time: 197 ms
 */
