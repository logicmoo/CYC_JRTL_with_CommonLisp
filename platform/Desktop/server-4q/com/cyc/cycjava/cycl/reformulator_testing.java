package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_testing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_testing";
    public static final String myFingerPrint = "96eb420b8812d27ef1011eaee2a069ecdfd90f1d3b12d5b2cd47aaa535359962";
    private static final SubLSymbol $kw0$SUCCESS;
    private static final SubLSymbol $sym1$MEMOIZATION_STATE_P;
    private static final SubLSymbol $kw2$FAILURE;
    private static final SubLSymbol $sym3$FIFTH;
    private static final SubLSymbol $kw4$NONE;
    private static final SubLSymbol $sym5$TRUE;
    private static final SubLSymbol $sym6$REFORMULATE_CYCL;
    private static final SubLSymbol $kw7$NOT_FOUND;
    private static final SubLSymbol $sym8$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const9$EverythingPSC;
    private static final SubLObject $const10$ReformulatorTestCase;
    private static final SubLString $str11$____Testing__S_RL_Module___;
    private static final SubLString $str12$__Average_time___usec____d;
    private static final SubLString $str13$__Expected_time__usec____d;
    private static final SubLString $str14$____No_tests_found_for__S_RL_Modu;
    private static final SubLSymbol $kw15$VACUOUS;
    private static final SubLString $str16$__via_hub_;
    private static final SubLSymbol $kw17$FOCUS;
    private static final SubLSymbol $kw18$RECURSION_LIMIT;
    private static final SubLSymbol $sym19$REIFY_WHEN_CLOSED_NAUT;
    private static final SubLSymbol $sym20$_TESTCASE;
    private static final SubLObject $const21$reformulatorTestCaseModuleTested;
    private static final SubLInteger $int22$1000000;
    private static final SubLString $str23$___A_OK;
    private static final SubLString $str24$___Failure_on_test__A_INPUT____A_;
    private static final SubLSymbol $kw25$RL_MODULE_NOT_APPLICABLE;
    private static final SubLSymbol $kw26$ANSWER;
    private static final SubLObject $const27$reformulatorTestCaseInputExpressi;
    private static final SubLList $list28;
    private static final SubLObject $const29$reformulatorTestCaseOutputExpress;
    private static final SubLObject $const30$reformulatorTestCaseMicrotheory;
    private static final SubLObject $const31$reformulatorTestCaseSettings;
    private static final SubLObject $const32$reformulatorTestCaseRequiresRecur;
    private static final SubLString $str33$No_input_expression_for_reformula;
    private static final SubLString $str34$singleEntryFormatInArgs_violation;
    private static final SubLString $str35$No_output_expression_for_reformul;
    private static final SubLString $str36$singleEntryFormatInArgs_violation;
    private static final SubLString $str37$singleEntryFormatInArgs_violation;
    private static final SubLString $str38$singleEntryFormatInArgs_format_vi;
    private static final SubLSymbol $sym39$EL_LIST_P;
    private static final SubLSymbol $sym40$EL_LIST_ITEMS;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-testing.lisp", position = 979L)
    public static SubLObject test_reformulator(SubLObject stream, SubLObject test_rl_modulesP) {
        if (stream == reformulator_testing.UNPROVIDED) {
            stream = (SubLObject)reformulator_testing.T;
        }
        if (test_rl_modulesP == reformulator_testing.UNPROVIDED) {
            test_rl_modulesP = (SubLObject)reformulator_testing.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reformulator_datastructures.clear_reformulator_caches();
        SubLObject result = (SubLObject)reformulator_testing.$kw0$SUCCESS;
        SubLObject success_count = (SubLObject)reformulator_testing.ZERO_INTEGER;
        SubLObject total_count = (SubLObject)reformulator_testing.ZERO_INTEGER;
        final SubLObject all_tests = get_all_reformulator_tests();
        SubLObject all_rl_module_tests = (SubLObject)reformulator_testing.NIL;
        SubLObject all_non_rl_module_tests = (SubLObject)reformulator_testing.NIL;
        final SubLObject v_memoization_state = memoization_state.new_memoization_state((SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED);
        assert reformulator_testing.NIL != memoization_state.memoization_state_p(v_memoization_state) : v_memoization_state;
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
                    SubLObject mod = (SubLObject)reformulator_testing.NIL;
                    mod = cdolist_list_var.first();
                    while (reformulator_testing.NIL != cdolist_list_var) {
                        final SubLObject rl_module = mod;
                        final SubLObject tests = get_rl_module_unit_tests(reformulator_module_harness.rl_module_name(rl_module));
                        all_rl_module_tests = ConsesLow.nconc(all_rl_module_tests, tests);
                        if (reformulator_testing.NIL != test_rl_modulesP && reformulator_testing.$kw2$FAILURE.eql(test_rl_module_int(rl_module, tests, (SubLObject)reformulator_testing.NIL, stream))) {
                            result = (SubLObject)reformulator_testing.$kw2$FAILURE;
                        }
                        else {
                            success_count = Numbers.add(success_count, (SubLObject)reformulator_testing.ONE_INTEGER);
                        }
                        total_count = Numbers.add(total_count, (SubLObject)reformulator_testing.ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        mod = cdolist_list_var.first();
                    }
                    all_non_rl_module_tests = (cdolist_list_var = conses_high.set_difference(all_tests, all_rl_module_tests, Symbols.symbol_function((SubLObject)reformulator_testing.EQUAL), Symbols.symbol_function((SubLObject)reformulator_testing.$sym3$FIFTH)));
                    SubLObject test = (SubLObject)reformulator_testing.NIL;
                    test = cdolist_list_var.first();
                    while (reformulator_testing.NIL != cdolist_list_var) {
                        final SubLObject mt = conses_high.third(test);
                        final SubLObject settings = conses_high.fourth(test);
                        final SubLObject test_id = conses_high.fifth(test);
                        final SubLObject source = reformulator_hub.canonicalize_reformulator_expression_cached(test.first(), mt, (SubLObject)reformulator_testing.NIL, (SubLObject)reformulator_testing.$kw4$NONE);
                        final SubLObject target = conses_high.second(test);
                        if (reformulator_testing.$kw2$FAILURE.eql(perform_one_reformulator_test_int(test_id, stream, source, target, mt, settings, Symbols.symbol_function((SubLObject)reformulator_testing.$sym5$TRUE), (SubLObject)reformulator_testing.$sym6$REFORMULATE_CYCL, (SubLObject)reformulator_testing.UNPROVIDED))) {
                            result = (SubLObject)reformulator_testing.$kw2$FAILURE;
                        }
                        else {
                            success_count = Numbers.add(success_count, (SubLObject)reformulator_testing.ONE_INTEGER);
                        }
                        total_count = Numbers.add(total_count, (SubLObject)reformulator_testing.ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        test = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)reformulator_testing.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, success_count, total_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-testing.lisp", position = 2584L)
    public static SubLObject test_all_rl_modules(SubLObject test_ref_hubP, SubLObject stream) {
        if (test_ref_hubP == reformulator_testing.UNPROVIDED) {
            test_ref_hubP = (SubLObject)reformulator_testing.NIL;
        }
        if (stream == reformulator_testing.UNPROVIDED) {
            stream = (SubLObject)reformulator_testing.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)reformulator_testing.T;
        reformulator_datastructures.clear_reformulator_caches();
        final SubLObject v_memoization_state = memoization_state.new_memoization_state((SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED);
        assert reformulator_testing.NIL != memoization_state.memoization_state_p(v_memoization_state) : v_memoization_state;
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
                    SubLObject mod = (SubLObject)reformulator_testing.NIL;
                    mod = cdolist_list_var.first();
                    while (reformulator_testing.NIL != cdolist_list_var) {
                        final SubLObject rl_module = mod;
                        if (reformulator_testing.$kw2$FAILURE.eql(test_rl_module_int(rl_module, get_rl_module_unit_tests(reformulator_module_harness.rl_module_name(rl_module)), test_ref_hubP, stream))) {
                            successP = (SubLObject)reformulator_testing.NIL;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mod = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)reformulator_testing.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$3, thread);
            }
        }
        finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((reformulator_testing.NIL != successP) ? reformulator_testing.$kw0$SUCCESS : reformulator_testing.$kw2$FAILURE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-testing.lisp", position = 3160L)
    public static SubLObject test_rl_module(final SubLObject rl_module_constant, SubLObject test_ref_hubP, SubLObject stream) {
        if (test_ref_hubP == reformulator_testing.UNPROVIDED) {
            test_ref_hubP = (SubLObject)reformulator_testing.NIL;
        }
        if (stream == reformulator_testing.UNPROVIDED) {
            stream = (SubLObject)reformulator_testing.T;
        }
        final SubLObject rl_module = reformulator_module_harness.get_rl_module_from_store(rl_module_constant);
        if (reformulator_testing.NIL == rl_module) {
            return (SubLObject)reformulator_testing.$kw7$NOT_FOUND;
        }
        return test_rl_module_int(rl_module, get_rl_module_unit_tests(rl_module_constant), test_ref_hubP, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-testing.lisp", position = 3788L)
    public static SubLObject get_all_reformulator_tests() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_cases = (SubLObject)reformulator_testing.NIL;
        SubLObject kb_test_cases = (SubLObject)reformulator_testing.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_testing.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(reformulator_testing.$const9$EverythingPSC, thread);
            kb_test_cases = isa.all_fort_instances(reformulator_testing.$const10$ReformulatorTestCase, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = kb_test_cases;
        SubLObject kb_test_case = (SubLObject)reformulator_testing.NIL;
        kb_test_case = cdolist_list_var.first();
        while (reformulator_testing.NIL != cdolist_list_var) {
            test_cases = (SubLObject)ConsesLow.cons(kb_reformulator_test_to_list(kb_test_case, reformulator_testing.$const9$EverythingPSC), test_cases);
            cdolist_list_var = cdolist_list_var.rest();
            kb_test_case = cdolist_list_var.first();
        }
        return test_cases;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-testing.lisp", position = 4184L)
    public static SubLObject test_rl_module_int(final SubLObject rl_module, final SubLObject tests, final SubLObject test_ref_hubP, SubLObject stream) {
        if (stream == reformulator_testing.UNPROVIDED) {
            stream = (SubLObject)reformulator_testing.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject module_constant = reformulator_module_harness.rl_module_name(rl_module);
        SubLObject total_time = (SubLObject)reformulator_testing.ZERO_INTEGER;
        SubLObject total_expected_time = (SubLObject)reformulator_testing.ZERO_INTEGER;
        SubLObject result = (SubLObject)reformulator_testing.$kw0$SUCCESS;
        if (reformulator_testing.NIL == tests) {
            PrintLow.format(stream, (SubLObject)reformulator_testing.$str14$____No_tests_found_for__S_RL_Modu, module_constant);
            return (SubLObject)reformulator_testing.$kw15$VACUOUS;
        }
        PrintLow.format(stream, (SubLObject)reformulator_testing.$str11$____Testing__S_RL_Module___, module_constant);
        reformulator_datastructures.clear_reformulator_caches();
        final SubLObject v_memoization_state = memoization_state.new_memoization_state((SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED);
        assert reformulator_testing.NIL != memoization_state.memoization_state_p(v_memoization_state) : v_memoization_state;
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
                    SubLObject test = (SubLObject)reformulator_testing.NIL;
                    test = cdolist_list_var.first();
                    while (reformulator_testing.NIL != cdolist_list_var) {
                        final SubLObject requires_recursionP = conses_high.sixth(test);
                        if (reformulator_testing.NIL == requires_recursionP) {
                            thread.resetMultipleValues();
                            final SubLObject test_result = perform_one_rl_module_test(rl_module, test, (SubLObject)reformulator_testing.NIL, stream);
                            final SubLObject test_time = thread.secondMultipleValue();
                            final SubLObject expected_cost = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            total_time = Numbers.add(total_time, test_time);
                            total_expected_time = Numbers.add(total_expected_time, expected_cost);
                            if (reformulator_testing.$kw2$FAILURE.eql(test_result)) {
                                result = (SubLObject)reformulator_testing.$kw2$FAILURE;
                            }
                        }
                        if (reformulator_testing.NIL != test_ref_hubP || reformulator_testing.NIL != requires_recursionP) {
                            thread.resetMultipleValues();
                            final SubLObject test_result = perform_one_rl_module_test(rl_module, test, (SubLObject)reformulator_testing.T, stream);
                            final SubLObject test_time = thread.secondMultipleValue();
                            final SubLObject expected_cost = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (reformulator_testing.$kw2$FAILURE.eql(test_result)) {
                                result = (SubLObject)reformulator_testing.$kw2$FAILURE;
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        test = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)reformulator_testing.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$5, thread);
            }
        }
        finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        PrintLow.format(stream, (SubLObject)reformulator_testing.$str12$__Average_time___usec____d, Numbers.round(Numbers.divide(total_time, Sequences.length(tests)), (SubLObject)reformulator_testing.UNPROVIDED));
        PrintLow.format(stream, (SubLObject)reformulator_testing.$str13$__Expected_time__usec____d, Numbers.round(Numbers.divide(total_expected_time, Sequences.length(tests)), (SubLObject)reformulator_testing.UNPROVIDED));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-testing.lisp", position = 5936L)
    public static SubLObject perform_one_rl_module_test(final SubLObject rl_module, final SubLObject test, final SubLObject test_ref_hubP, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = conses_high.third(test);
        SubLObject settings = conses_high.copy_list(conses_high.fourth(test));
        final SubLObject test_id = conses_high.fifth(test);
        final SubLObject source = reformulator_hub.canonicalize_reformulator_expression_cached(test.first(), mt, (SubLObject)reformulator_testing.NIL, (SubLObject)reformulator_testing.$kw4$NONE);
        final SubLObject target = conses_high.second(test);
        final SubLObject cost = reformulator_module_harness.rl_module_cost(rl_module, source, mt, settings);
        SubLObject required_function = (SubLObject)reformulator_testing.NIL;
        SubLObject reformulate_function = (SubLObject)reformulator_testing.NIL;
        SubLObject name = (SubLObject)reformulator_testing.NIL;
        if (reformulator_testing.NIL != test_ref_hubP) {
            name = Sequences.cconcatenate(string_utilities.str(test_id), (SubLObject)reformulator_testing.$str16$__via_hub_);
            required_function = Symbols.symbol_function((SubLObject)reformulator_testing.$sym5$TRUE);
            reformulate_function = (SubLObject)reformulator_testing.$sym6$REFORMULATE_CYCL;
            settings = conses_high.putf(settings, (SubLObject)reformulator_testing.$kw17$FOCUS, reformulator_module_harness.rl_module_name(rl_module));
            settings = conses_high.putf(settings, (SubLObject)reformulator_testing.$kw18$RECURSION_LIMIT, (SubLObject)reformulator_testing.FIVE_INTEGER);
        }
        else {
            name = test_id;
            required_function = reformulator_module_harness.rl_module_required_function(rl_module);
            reformulate_function = reformulator_module_harness.rl_module_reformulate_function(rl_module);
        }
        thread.resetMultipleValues();
        final SubLObject keyword = perform_one_reformulator_test_int(name, stream, source, target, mt, settings, required_function, reformulate_function, test_ref_hubP);
        final SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(keyword, time, cost);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-testing.lisp", position = 7536L)
    public static SubLObject get_rl_module_unit_tests(final SubLObject module_constant) {
        SubLObject test_cases = (SubLObject)reformulator_testing.NIL;
        SubLObject cdolist_list_var;
        final SubLObject kb_test_cases = cdolist_list_var = list_utilities.nmapcar((SubLObject)reformulator_testing.$sym19$REIFY_WHEN_CLOSED_NAUT, Sequences.delete_duplicates(ask_utilities.ask_template((SubLObject)reformulator_testing.$sym20$_TESTCASE, (SubLObject)ConsesLow.list(reformulator_testing.$const21$reformulatorTestCaseModuleTested, (SubLObject)reformulator_testing.$sym20$_TESTCASE, module_constant), reformulator_testing.$const9$EverythingPSC, (SubLObject)reformulator_testing.ONE_INTEGER, (SubLObject)reformulator_testing.NIL, (SubLObject)reformulator_testing.NIL, (SubLObject)reformulator_testing.NIL), Symbols.symbol_function((SubLObject)reformulator_testing.EQUAL), (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED));
        SubLObject kb_test_case = (SubLObject)reformulator_testing.NIL;
        kb_test_case = cdolist_list_var.first();
        while (reformulator_testing.NIL != cdolist_list_var) {
            test_cases = (SubLObject)ConsesLow.cons(kb_reformulator_test_to_list(kb_test_case, reformulator_testing.$const9$EverythingPSC), test_cases);
            cdolist_list_var = cdolist_list_var.rest();
            kb_test_case = cdolist_list_var.first();
        }
        return test_cases;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-testing.lisp", position = 8030L)
    public static SubLObject perform_one_reformulator_test_int(final SubLObject name, final SubLObject stream, SubLObject source, final SubLObject target, final SubLObject mt, final SubLObject settings, final SubLObject required_function, final SubLObject reformulate_function, SubLObject test_ref_hubP) {
        if (test_ref_hubP == reformulator_testing.UNPROVIDED) {
            test_ref_hubP = (SubLObject)reformulator_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject local_time = (SubLObject)reformulator_testing.ZERO_INTEGER;
        SubLObject actual = (SubLObject)reformulator_testing.NIL;
        SubLObject not_applicableP = (SubLObject)reformulator_testing.NIL;
        SubLObject justification = (SubLObject)reformulator_testing.NIL;
        SubLObject result = (SubLObject)reformulator_testing.NIL;
        final SubLObject original_clause = (SubLObject)reformulator_testing.NIL;
        if (reformulator_testing.NIL != Functions.funcall(required_function, source, mt, settings)) {
            final SubLObject time_var = Time.get_internal_real_time();
            if (reformulate_function == reformulator_testing.$sym6$REFORMULATE_CYCL || reformulator_testing.NIL != test_ref_hubP) {
                thread.resetMultipleValues();
                final SubLObject actual_$7 = Functions.funcall(reformulate_function, source, mt, settings);
                final SubLObject justification_$8 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                actual = actual_$7;
                justification = justification_$8;
            }
            else {
                thread.resetMultipleValues();
                final SubLObject actual_$8 = Functions.funcall(reformulate_function, source, original_clause, mt, settings);
                final SubLObject justification_$9 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                actual = actual_$8;
                justification = justification_$9;
            }
            local_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            actual = reformulator_hub.uncanonicalize_rl_expression_cached(actual, mt);
        }
        else {
            not_applicableP = (SubLObject)reformulator_testing.T;
            actual = reformulator_hub.uncanonicalize_rl_expression_cached(source, mt);
        }
        local_time = Numbers.round(Numbers.multiply((SubLObject)reformulator_testing.$int22$1000000, local_time), (SubLObject)reformulator_testing.UNPROVIDED);
        if (reformulator_testing.NIL != czer_utilities.equals_elP(target, actual, mt, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED)) {
            PrintLow.format(stream, (SubLObject)reformulator_testing.$str23$___A_OK, name);
            result = (SubLObject)reformulator_testing.$kw0$SUCCESS;
        }
        else {
            PrintLow.format(stream, (SubLObject)reformulator_testing.$str24$___Failure_on_test__A_INPUT____A_, new SubLObject[] { name, source, mt, settings, target, (reformulator_testing.NIL != not_applicableP) ? reformulator_testing.$kw25$RL_MODULE_NOT_APPLICABLE : actual, justification });
            result = (SubLObject)reformulator_testing.$kw2$FAILURE;
        }
        streams_high.force_output(stream);
        return Values.values(result, local_time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-testing.lisp", position = 9434L)
    public static SubLObject kb_reformulator_test_to_list(final SubLObject kb_test_case, final SubLObject test_case_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kb_input_expr = backward.removal_ask_variable((SubLObject)reformulator_testing.$kw26$ANSWER, (SubLObject)ConsesLow.listS(reformulator_testing.$const27$reformulatorTestCaseInputExpressi, kb_test_case, (SubLObject)reformulator_testing.$list28), test_case_mt, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED);
        final SubLObject kb_output_expr = backward.removal_ask_variable((SubLObject)reformulator_testing.$kw26$ANSWER, (SubLObject)ConsesLow.listS(reformulator_testing.$const29$reformulatorTestCaseOutputExpress, kb_test_case, (SubLObject)reformulator_testing.$list28), test_case_mt, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED);
        final SubLObject kb_mt = backward.removal_ask_variable((SubLObject)reformulator_testing.$kw26$ANSWER, (SubLObject)ConsesLow.listS(reformulator_testing.$const30$reformulatorTestCaseMicrotheory, kb_test_case, (SubLObject)reformulator_testing.$list28), test_case_mt, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED);
        final SubLObject kb_settings = backward.removal_ask_variable((SubLObject)reformulator_testing.$kw26$ANSWER, (SubLObject)ConsesLow.listS(reformulator_testing.$const31$reformulatorTestCaseSettings, kb_test_case, (SubLObject)reformulator_testing.$list28), test_case_mt, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED);
        final SubLObject kb_recursion_required = backward.removal_ask((SubLObject)ConsesLow.list(reformulator_testing.$const32$reformulatorTestCaseRequiresRecur, kb_test_case), test_case_mt, (SubLObject)reformulator_testing.UNPROVIDED, (SubLObject)reformulator_testing.UNPROVIDED);
        if (reformulator_testing.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && reformulator_testing.NIL == kb_input_expr) {
            Errors.error((SubLObject)reformulator_testing.$str33$No_input_expression_for_reformula, kb_test_case);
        }
        if (reformulator_testing.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && reformulator_testing.NIL == list_utilities.singletonP(kb_input_expr)) {
            Errors.error((SubLObject)reformulator_testing.$str34$singleEntryFormatInArgs_violation, kb_test_case);
        }
        if (reformulator_testing.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && reformulator_testing.NIL == kb_output_expr) {
            Errors.error((SubLObject)reformulator_testing.$str35$No_output_expression_for_reformul, kb_test_case);
        }
        if (reformulator_testing.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && reformulator_testing.NIL == list_utilities.singletonP(kb_output_expr)) {
            Errors.error((SubLObject)reformulator_testing.$str36$singleEntryFormatInArgs_violation, kb_test_case);
        }
        if (reformulator_testing.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && reformulator_testing.NIL != kb_mt && reformulator_testing.NIL == list_utilities.singletonP(kb_mt)) {
            Errors.error((SubLObject)reformulator_testing.$str37$singleEntryFormatInArgs_violation, kb_test_case);
        }
        if (reformulator_testing.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && reformulator_testing.NIL != kb_settings && reformulator_testing.NIL == list_utilities.singletonP(kb_settings)) {
            Errors.error((SubLObject)reformulator_testing.$str38$singleEntryFormatInArgs_format_vi, kb_test_case);
        }
        final SubLObject ref_input_expr = kb_input_expr.first();
        final SubLObject ref_output_expr = kb_output_expr.first();
        final SubLObject ref_mt = kb_mt.first();
        final SubLObject ref_settings = (SubLObject)((reformulator_testing.NIL != el_utilities.el_list_p(kb_settings.first())) ? transform_list_utilities.transform(el_utilities.el_list_items(kb_settings.first()), (SubLObject)reformulator_testing.$sym39$EL_LIST_P, (SubLObject)reformulator_testing.$sym40$EL_LIST_ITEMS, (SubLObject)reformulator_testing.UNPROVIDED) : reformulator_testing.NIL);
        final SubLObject ref_recursion_requiredP = list_utilities.sublisp_boolean(kb_recursion_required);
        return (SubLObject)ConsesLow.list(ref_input_expr, ref_output_expr, ref_mt, ref_settings, kb_test_case, ref_recursion_requiredP);
    }
    
    public static SubLObject declare_reformulator_testing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_testing", "test_reformulator", "TEST-REFORMULATOR", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_testing", "test_all_rl_modules", "TEST-ALL-RL-MODULES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_testing", "test_rl_module", "TEST-RL-MODULE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_testing", "get_all_reformulator_tests", "GET-ALL-REFORMULATOR-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_testing", "test_rl_module_int", "TEST-RL-MODULE-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_testing", "perform_one_rl_module_test", "PERFORM-ONE-RL-MODULE-TEST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_testing", "get_rl_module_unit_tests", "GET-RL-MODULE-UNIT-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_testing", "perform_one_reformulator_test_int", "PERFORM-ONE-REFORMULATOR-TEST-INT", 8, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_testing", "kb_reformulator_test_to_list", "KB-REFORMULATOR-TEST-TO-LIST", 2, 0, false);
        return (SubLObject)reformulator_testing.NIL;
    }
    
    public static SubLObject init_reformulator_testing_file() {
        return (SubLObject)reformulator_testing.NIL;
    }
    
    public static SubLObject setup_reformulator_testing_file() {
        return (SubLObject)reformulator_testing.NIL;
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
    
    static {
        me = (SubLFile)new reformulator_testing();
        $kw0$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $sym1$MEMOIZATION_STATE_P = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-P");
        $kw2$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $sym3$FIFTH = SubLObjectFactory.makeSymbol("FIFTH");
        $kw4$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym5$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym6$REFORMULATE_CYCL = SubLObjectFactory.makeSymbol("REFORMULATE-CYCL");
        $kw7$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym8$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const9$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const10$ReformulatorTestCase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorTestCase"));
        $str11$____Testing__S_RL_Module___ = SubLObjectFactory.makeString("~%~%Testing ~S RL Module...");
        $str12$__Average_time___usec____d = SubLObjectFactory.makeString("~%Average time  (usec): ~d");
        $str13$__Expected_time__usec____d = SubLObjectFactory.makeString("~%Expected time (usec): ~d");
        $str14$____No_tests_found_for__S_RL_Modu = SubLObjectFactory.makeString("~%~%No tests found for ~S RL Module.~%");
        $kw15$VACUOUS = SubLObjectFactory.makeKeyword("VACUOUS");
        $str16$__via_hub_ = SubLObjectFactory.makeString(" (via hub)");
        $kw17$FOCUS = SubLObjectFactory.makeKeyword("FOCUS");
        $kw18$RECURSION_LIMIT = SubLObjectFactory.makeKeyword("RECURSION-LIMIT");
        $sym19$REIFY_WHEN_CLOSED_NAUT = SubLObjectFactory.makeSymbol("REIFY-WHEN-CLOSED-NAUT");
        $sym20$_TESTCASE = SubLObjectFactory.makeSymbol("?TESTCASE");
        $const21$reformulatorTestCaseModuleTested = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorTestCaseModuleTested"));
        $int22$1000000 = SubLObjectFactory.makeInteger(1000000);
        $str23$___A_OK = SubLObjectFactory.makeString("~%~A OK");
        $str24$___Failure_on_test__A_INPUT____A_ = SubLObjectFactory.makeString("~%\nFailure on test ~A\nINPUT : ~A\nMT: ~A\nSETTINGS: ~S\nWANTED : ~A\nGOT : ~A\nWITH JUSTIFICATION : ~A~%");
        $kw25$RL_MODULE_NOT_APPLICABLE = SubLObjectFactory.makeKeyword("RL-MODULE-NOT-APPLICABLE");
        $kw26$ANSWER = SubLObjectFactory.makeKeyword("ANSWER");
        $const27$reformulatorTestCaseInputExpressi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorTestCaseInputExpression"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER"));
        $const29$reformulatorTestCaseOutputExpress = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorTestCaseOutputExpression"));
        $const30$reformulatorTestCaseMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorTestCaseMicrotheory"));
        $const31$reformulatorTestCaseSettings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorTestCaseSettings"));
        $const32$reformulatorTestCaseRequiresRecur = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorTestCaseRequiresRecursion"));
        $str33$No_input_expression_for_reformula = SubLObjectFactory.makeString("No input expression for reformulator test ~s~%");
        $str34$singleEntryFormatInArgs_violation = SubLObjectFactory.makeString("singleEntryFormatInArgs violation on input expression for reformulator test ~s~%");
        $str35$No_output_expression_for_reformul = SubLObjectFactory.makeString("No output expression for reformulator test ~s~%");
        $str36$singleEntryFormatInArgs_violation = SubLObjectFactory.makeString("singleEntryFormatInArgs violation on output expression for reformulator test ~s~%");
        $str37$singleEntryFormatInArgs_violation = SubLObjectFactory.makeString("singleEntryFormatInArgs violation on microtheory for reformulator test ~s~%");
        $str38$singleEntryFormatInArgs_format_vi = SubLObjectFactory.makeString("singleEntryFormatInArgs format violation on settings for reformulator test ~s~%");
        $sym39$EL_LIST_P = SubLObjectFactory.makeSymbol("EL-LIST-P");
        $sym40$EL_LIST_ITEMS = SubLObjectFactory.makeSymbol("EL-LIST-ITEMS");
    }
}

/*

	Total time: 197 ms
	
*/