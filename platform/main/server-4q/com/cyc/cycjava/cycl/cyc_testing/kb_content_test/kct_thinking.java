package com.cyc.cycjava.cycl.cyc_testing.kb_content_test;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.ArrayList;

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.special_variable_state;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kct_thinking extends SubLTranslatedFile {
    public static final SubLFile me = new kct_thinking();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking";

    public static final String myFingerPrint = "ab2245b2d34367b48c7a87e6b62a3c9a5ab3335f4ee9ebe6a35717636158835b";

    // deflexical
    // Definitions
    private static final SubLSymbol $kct_thinking_index$ = makeSymbol("*KCT-THINKING-INDEX*");

    // deflexical
    private static final SubLSymbol $kct_thinking_index_lock$ = makeSymbol("*KCT-THINKING-INDEX-LOCK*");

    // deflexical
    private static final SubLSymbol $kct_thinking_isg$ = makeSymbol("*KCT-THINKING-ISG*");

    // Internal Constants
    public static final SubLString $$$KCT_Thinking_Lock = makeString("KCT Thinking Lock");













    public static final SubLSymbol THINKING_TASK_P = makeSymbol("THINKING-TASK-P");



    public static final SubLString $$$KB_Content_Test_Running = makeString("KB Content Test Running");

    public static final SubLString $str10$Starting___ = makeString("Starting...");

    public static final SubLSymbol KCT_THINKING_THREAD_RUN = makeSymbol("KCT-THINKING-THREAD-RUN");









    public static final SubLString $str16$Wrong_type_of_KCT_Thinking_Task__ = makeString("Wrong type of KCT Thinking Task: ~A!");



    public static final SubLList $list18 = list(makeSymbol("*THE-CYCLIST*"));

    public static final SubLSymbol KCT_RUN_TEST_WITH_STATE = makeSymbol("KCT-RUN-TEST-WITH-STATE");

    public static final SubLSymbol KCT_RUN_TEST_SET_WITH_STATE = makeSymbol("KCT-RUN-TEST-SET-WITH-STATE");

    public static final SubLSymbol SPECIAL_VARIABLE_STATE_P = makeSymbol("SPECIAL-VARIABLE-STATE-P");



    public static SubLObject next_kct_thinking_id() {
        return integer_sequence_generator.integer_sequence_generator_next($kct_thinking_isg$.getGlobalValue());
    }

    public static SubLObject kct_all_thinkings() {
        return dictionary.dictionary_values($kct_thinking_index$.getGlobalValue());
    }

    public static SubLObject kct_thinking_id(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $ID);
    }

    public static SubLObject kct_thinking_type(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $TYPE);
    }

    public static SubLObject kct_thinking_test_constant(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $TEST_CONSTANT);
    }

    public static SubLObject kct_thinking_runstate(final SubLObject thinking) {
        return kbq_query_run.runstate_find_object_by_id(process_utilities.thinking_property(thinking, $RUNSTATE_ID));
    }

    public static SubLObject kct_thinking_function(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $FUNCTION);
    }

    public static SubLObject kct_thinking_args(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $ARGS);
    }

    public static SubLObject kct_thinking_progress_message(final SubLObject thinking) {
        return process_utilities.thinking_progress_message(thinking);
    }

    public static SubLObject kct_add_thinking(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        final SubLObject id = kct_thinking_id(thinking);
        dictionary.dictionary_enter($kct_thinking_index$.getGlobalValue(), id, thinking);
        return kct_all_thinkings();
    }

    public static SubLObject kct_remove_thinking(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        final SubLObject id = kct_thinking_id(thinking);
        final SubLObject runstate = kct_thinking_runstate(thinking);
        dictionary.dictionary_remove($kct_thinking_index$.getGlobalValue(), id);
        if (NIL != runstate) {
            kbq_query_run.destroy_runstate(runstate);
        }
        return kct_all_thinkings();
    }

    public static SubLObject kct_thinking_set_runstate_id(final SubLObject id, SubLObject thinking) {
        if (thinking == UNPROVIDED) {
            thinking = process_utilities.thinking_task();
        }
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            process_utilities.thinking_note_property(thinking, $RUNSTATE_ID, id);
        }
        return thinking;
    }

    public static SubLObject kct_lookup_thinking(final SubLObject id) {
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        return dictionary.dictionary_lookup($kct_thinking_index$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject kct_new_thinking(final SubLObject test_constant, final SubLObject type) {
        final SubLObject id = next_kct_thinking_id();
        final SubLObject v_properties = list($TEST_CONSTANT, test_constant, $TYPE, type, $ID, id);
        final SubLObject thinking = process_utilities.new_thinking_task($$$KB_Content_Test_Running, $str10$Starting___, v_properties);
        kct_add_thinking(thinking);
        return thinking;
    }

    public static SubLObject kct_thinking_start(final SubLObject thinking, final SubLObject function, final SubLObject arg_list) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        process_utilities.thinking_note_property(thinking, $FUNCTION, function);
        process_utilities.thinking_note_property(thinking, $ARGS, arg_list);
        return process_utilities.thinking_start(thinking, KCT_THINKING_THREAD_RUN, NIL);
    }

    public static SubLObject kct_thinking_stop(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        final SubLObject runstate = kct_thinking_runstate(thinking);
        final SubLObject members = (NIL != kbq_query_run.kct_set_runstate_p(runstate)) ? kbq_query_run.kct_set_runstate_test_runstates(runstate) : list(runstate);
        SubLObject inference = NIL;
        SubLObject found = NIL;
        kbq_query_run.set_runstate_run_status(runstate, $STOPPED);
        if (NIL == found) {
            SubLObject csome_list_var = members;
            SubLObject member = NIL;
            member = csome_list_var.first();
            while ((NIL == found) && (NIL != csome_list_var)) {
                if (kbq_query_run.runstate_run_status(member) == $RUNNING) {
                    inference = kbq_query_run.runstate_inference(member);
                    kbq_query_run.set_runstate_run_status(member, $STOPPED);
                    inference_utilities.inference_thinking_task_abort(inference, thinking);
                    found = T;
                }
                csome_list_var = csome_list_var.rest();
                member = csome_list_var.first();
            } 
        }
        return thinking;
    }

    public static SubLObject kct_thinking_thread_run() {
        final SubLObject thinking = process_utilities.thinking_task();
        final SubLObject function = kct_thinking_function(thinking);
        final SubLObject args = kct_thinking_args(thinking);
        SubLObject result = NIL;
        result = apply(function, args);
        return result;
    }

    public static SubLObject kct_classify_thinkings_by_type(final SubLObject thinkings) {
        SubLObject individual_tests = NIL;
        SubLObject collection_tests = NIL;
        SubLObject cdolist_list_var = thinkings;
        SubLObject thinking = NIL;
        thinking = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = kct_thinking_type(thinking);
            if (pcase_var.eql($INDIVIDUAL)) {
                individual_tests = cons(thinking, individual_tests);
            } else
                if (pcase_var.eql($COLLECTION)) {
                    collection_tests = cons(thinking, collection_tests);
                } else {
                    Errors.error($str16$Wrong_type_of_KCT_Thinking_Task__, kct_thinking_type(thinking));
                }

            cdolist_list_var = cdolist_list_var.rest();
            thinking = cdolist_list_var.first();
        } 
        return values(nreverse(individual_tests), nreverse(collection_tests));
    }

    public static SubLObject kct_any_thinking_runningP() {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = kct_all_thinkings();
            SubLObject thinking = NIL;
            thinking = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if ((process_utilities.thinking_status(thinking) == $RUNNING) || (process_utilities.thinking_status(thinking) == $STARTED)) {
                    result = T;
                }
                csome_list_var = csome_list_var.rest();
                thinking = csome_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject kct_run_test_in_thinker(final SubLObject test_constant, SubLObject browsableP) {
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        final SubLObject thinking = kct_new_thinking(test_constant, $INDIVIDUAL);
        final SubLObject svs = special_variable_state.new_special_variable_state($list18);
        final SubLObject thread = kct_thinking_start(thinking, symbol_function(KCT_RUN_TEST_WITH_STATE), list(svs, test_constant, browsableP));
        return thread;
    }

    public static SubLObject kct_run_test_set_in_thinker(final SubLObject test_set, SubLObject browsableP) {
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        final SubLObject thinking = kct_new_thinking(test_set, $COLLECTION);
        final SubLObject svs = special_variable_state.new_special_variable_state($list18);
        final SubLObject thread = kct_thinking_start(thinking, symbol_function(KCT_RUN_TEST_SET_WITH_STATE), list(svs, test_set, browsableP));
        return thread;
    }

    public static SubLObject kct_run_test_with_state(final SubLObject svs, final SubLObject test_spec, SubLObject browsableP, SubLObject overriding_query_properties, SubLObject required_metrics) {
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (required_metrics == UNPROVIDED) {
            required_metrics = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != special_variable_state.special_variable_state_p(svs) : "special_variable_state.special_variable_state_p(svs) " + "CommonSymbols.NIL != special_variable_state.special_variable_state_p(svs) " + svs;
        SubLObject result = NIL;
        if (NIL != browsableP) {
            putf(overriding_query_properties, $BROWSABLE_, T);
        }
        final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
        final ArrayList old_values = extract_dynamic_values(cprogv_var);
        try {
            bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
            SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
            result = kbq_query_run.kct_run_test(test_spec, required_metrics, kbq_query_run.$kbq_outlier_timeout$.getDynamicValue(thread), overriding_query_properties, T, T);
        } finally {
            rebind_dynamic_vars(cprogv_var, old_values);
        }
        return result;
    }

    public static SubLObject kct_run_test_set_with_state(final SubLObject svs, final SubLObject test_set, SubLObject browsableP, SubLObject overriding_query_properties, SubLObject required_metrics) {
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (required_metrics == UNPROVIDED) {
            required_metrics = NIL;
        }
        assert NIL != special_variable_state.special_variable_state_p(svs) : "special_variable_state.special_variable_state_p(svs) " + "CommonSymbols.NIL != special_variable_state.special_variable_state_p(svs) " + svs;
        SubLObject result = NIL;
        if (NIL != browsableP) {
            putf(overriding_query_properties, $BROWSABLE_, T);
        }
        final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
        final ArrayList old_values = extract_dynamic_values(cprogv_var);
        try {
            bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
            SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
            result = kbq_query_run.kct_run_test_set(test_set, required_metrics, kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue(), overriding_query_properties, T, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            rebind_dynamic_vars(cprogv_var, old_values);
        }
        return result;
    }

    public static SubLObject declare_kct_thinking_file() {
        declareFunction(me, "next_kct_thinking_id", "NEXT-KCT-THINKING-ID", 0, 0, false);
        declareFunction(me, "kct_all_thinkings", "KCT-ALL-THINKINGS", 0, 0, false);
        declareFunction(me, "kct_thinking_id", "KCT-THINKING-ID", 1, 0, false);
        declareFunction(me, "kct_thinking_type", "KCT-THINKING-TYPE", 1, 0, false);
        declareFunction(me, "kct_thinking_test_constant", "KCT-THINKING-TEST-CONSTANT", 1, 0, false);
        declareFunction(me, "kct_thinking_runstate", "KCT-THINKING-RUNSTATE", 1, 0, false);
        declareFunction(me, "kct_thinking_function", "KCT-THINKING-FUNCTION", 1, 0, false);
        declareFunction(me, "kct_thinking_args", "KCT-THINKING-ARGS", 1, 0, false);
        declareFunction(me, "kct_thinking_progress_message", "KCT-THINKING-PROGRESS-MESSAGE", 1, 0, false);
        declareFunction(me, "kct_add_thinking", "KCT-ADD-THINKING", 1, 0, false);
        declareFunction(me, "kct_remove_thinking", "KCT-REMOVE-THINKING", 1, 0, false);
        declareFunction(me, "kct_thinking_set_runstate_id", "KCT-THINKING-SET-RUNSTATE-ID", 1, 1, false);
        declareFunction(me, "kct_lookup_thinking", "KCT-LOOKUP-THINKING", 1, 0, false);
        declareFunction(me, "kct_new_thinking", "KCT-NEW-THINKING", 2, 0, false);
        declareFunction(me, "kct_thinking_start", "KCT-THINKING-START", 3, 0, false);
        declareFunction(me, "kct_thinking_stop", "KCT-THINKING-STOP", 1, 0, false);
        declareFunction(me, "kct_thinking_thread_run", "KCT-THINKING-THREAD-RUN", 0, 0, false);
        declareFunction(me, "kct_classify_thinkings_by_type", "KCT-CLASSIFY-THINKINGS-BY-TYPE", 1, 0, false);
        declareFunction(me, "kct_any_thinking_runningP", "KCT-ANY-THINKING-RUNNING?", 0, 0, false);
        declareFunction(me, "kct_run_test_in_thinker", "KCT-RUN-TEST-IN-THINKER", 1, 1, false);
        declareFunction(me, "kct_run_test_set_in_thinker", "KCT-RUN-TEST-SET-IN-THINKER", 1, 1, false);
        declareFunction(me, "kct_run_test_with_state", "KCT-RUN-TEST-WITH-STATE", 2, 3, false);
        declareFunction(me, "kct_run_test_set_with_state", "KCT-RUN-TEST-SET-WITH-STATE", 2, 3, false);
        return NIL;
    }

    public static SubLObject init_kct_thinking_file() {
        deflexical("*KCT-THINKING-INDEX*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*KCT-THINKING-INDEX-LOCK*", make_lock($$$KCT_Thinking_Lock));
        deflexical("*KCT-THINKING-ISG*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_kct_thinking_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kct_thinking_file();
    }

    @Override
    public void initializeVariables() {
        init_kct_thinking_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kct_thinking_file();
    }

    static {



























    }
}

/**
 * Total time: 120 ms
 */
