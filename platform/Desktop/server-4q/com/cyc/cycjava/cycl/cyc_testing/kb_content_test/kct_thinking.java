package com.cyc.cycjava.cycl.cyc_testing.kb_content_test;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.special_variable_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kct_thinking extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking";
    public static final String myFingerPrint = "ab2245b2d34367b48c7a87e6b62a3c9a5ab3335f4ee9ebe6a35717636158835b";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 2332L)
    private static SubLSymbol $kct_thinking_index$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 2393L)
    private static SubLSymbol $kct_thinking_index_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 2473L)
    private static SubLSymbol $kct_thinking_isg$;
    private static final SubLString $str0$KCT_Thinking_Lock;
    private static final SubLSymbol $kw1$ID;
    private static final SubLSymbol $kw2$TYPE;
    private static final SubLSymbol $kw3$TEST_CONSTANT;
    private static final SubLSymbol $kw4$RUNSTATE_ID;
    private static final SubLSymbol $kw5$FUNCTION;
    private static final SubLSymbol $kw6$ARGS;
    private static final SubLSymbol $sym7$THINKING_TASK_P;
    private static final SubLSymbol $sym8$INTEGERP;
    private static final SubLString $str9$KB_Content_Test_Running;
    private static final SubLString $str10$Starting___;
    private static final SubLSymbol $sym11$KCT_THINKING_THREAD_RUN;
    private static final SubLSymbol $kw12$STOPPED;
    private static final SubLSymbol $kw13$RUNNING;
    private static final SubLSymbol $kw14$INDIVIDUAL;
    private static final SubLSymbol $kw15$COLLECTION;
    private static final SubLString $str16$Wrong_type_of_KCT_Thinking_Task__;
    private static final SubLSymbol $kw17$STARTED;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$KCT_RUN_TEST_WITH_STATE;
    private static final SubLSymbol $sym20$KCT_RUN_TEST_SET_WITH_STATE;
    private static final SubLSymbol $sym21$SPECIAL_VARIABLE_STATE_P;
    private static final SubLSymbol $kw22$BROWSABLE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 2547L)
    public static SubLObject next_kct_thinking_id() {
        return integer_sequence_generator.integer_sequence_generator_next(kct_thinking.$kct_thinking_isg$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 2650L)
    public static SubLObject kct_all_thinkings() {
        return dictionary.dictionary_values(kct_thinking.$kct_thinking_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 2740L)
    public static SubLObject kct_thinking_id(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, (SubLObject)kct_thinking.$kw1$ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 2828L)
    public static SubLObject kct_thinking_type(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, (SubLObject)kct_thinking.$kw2$TYPE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 2920L)
    public static SubLObject kct_thinking_test_constant(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, (SubLObject)kct_thinking.$kw3$TEST_CONSTANT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 3049L)
    public static SubLObject kct_thinking_runstate(final SubLObject thinking) {
        return kbq_query_run.runstate_find_object_by_id(process_utilities.thinking_property(thinking, (SubLObject)kct_thinking.$kw4$RUNSTATE_ID));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 3181L)
    public static SubLObject kct_thinking_function(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, (SubLObject)kct_thinking.$kw5$FUNCTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 3281L)
    public static SubLObject kct_thinking_args(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, (SubLObject)kct_thinking.$kw6$ARGS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 3373L)
    public static SubLObject kct_thinking_progress_message(final SubLObject thinking) {
        return process_utilities.thinking_progress_message(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 3479L)
    public static SubLObject kct_add_thinking(final SubLObject thinking) {
        assert kct_thinking.NIL != process_utilities.thinking_task_p(thinking) : thinking;
        final SubLObject id = kct_thinking_id(thinking);
        dictionary.dictionary_enter(kct_thinking.$kct_thinking_index$.getGlobalValue(), id, thinking);
        return kct_all_thinkings();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 3694L)
    public static SubLObject kct_remove_thinking(final SubLObject thinking) {
        assert kct_thinking.NIL != process_utilities.thinking_task_p(thinking) : thinking;
        final SubLObject id = kct_thinking_id(thinking);
        final SubLObject runstate = kct_thinking_runstate(thinking);
        dictionary.dictionary_remove(kct_thinking.$kct_thinking_index$.getGlobalValue(), id);
        if (kct_thinking.NIL != runstate) {
            kbq_query_run.destroy_runstate(runstate);
        }
        return kct_all_thinkings();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 4008L)
    public static SubLObject kct_thinking_set_runstate_id(final SubLObject id, SubLObject thinking) {
        if (thinking == kct_thinking.UNPROVIDED) {
            thinking = process_utilities.thinking_task();
        }
        assert kct_thinking.NIL != Types.integerp(id) : id;
        if (kct_thinking.NIL != process_utilities.thinking_task_p(thinking)) {
            process_utilities.thinking_note_property(thinking, (SubLObject)kct_thinking.$kw4$RUNSTATE_ID, id);
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 4320L)
    public static SubLObject kct_lookup_thinking(final SubLObject id) {
        assert kct_thinking.NIL != Types.integerp(id) : id;
        return dictionary.dictionary_lookup(kct_thinking.$kct_thinking_index$.getGlobalValue(), id, (SubLObject)kct_thinking.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 4477L)
    public static SubLObject kct_new_thinking(final SubLObject test_constant, final SubLObject type) {
        final SubLObject id = next_kct_thinking_id();
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)kct_thinking.$kw3$TEST_CONSTANT, test_constant, (SubLObject)kct_thinking.$kw2$TYPE, type, (SubLObject)kct_thinking.$kw1$ID, id);
        final SubLObject thinking = process_utilities.new_thinking_task((SubLObject)kct_thinking.$str9$KB_Content_Test_Running, (SubLObject)kct_thinking.$str10$Starting___, v_properties);
        kct_add_thinking(thinking);
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 4887L)
    public static SubLObject kct_thinking_start(final SubLObject thinking, final SubLObject function, final SubLObject arg_list) {
        assert kct_thinking.NIL != process_utilities.thinking_task_p(thinking) : thinking;
        process_utilities.thinking_note_property(thinking, (SubLObject)kct_thinking.$kw5$FUNCTION, function);
        process_utilities.thinking_note_property(thinking, (SubLObject)kct_thinking.$kw6$ARGS, arg_list);
        return process_utilities.thinking_start(thinking, (SubLObject)kct_thinking.$sym11$KCT_THINKING_THREAD_RUN, (SubLObject)kct_thinking.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 5213L)
    public static SubLObject kct_thinking_stop(final SubLObject thinking) {
        assert kct_thinking.NIL != process_utilities.thinking_task_p(thinking) : thinking;
        final SubLObject runstate = kct_thinking_runstate(thinking);
        final SubLObject members = (SubLObject)((kct_thinking.NIL != kbq_query_run.kct_set_runstate_p(runstate)) ? kbq_query_run.kct_set_runstate_test_runstates(runstate) : ConsesLow.list(runstate));
        SubLObject inference = (SubLObject)kct_thinking.NIL;
        SubLObject found = (SubLObject)kct_thinking.NIL;
        kbq_query_run.set_runstate_run_status(runstate, (SubLObject)kct_thinking.$kw12$STOPPED);
        if (kct_thinking.NIL == found) {
            SubLObject csome_list_var = members;
            SubLObject member = (SubLObject)kct_thinking.NIL;
            member = csome_list_var.first();
            while (kct_thinking.NIL == found && kct_thinking.NIL != csome_list_var) {
                if (kbq_query_run.runstate_run_status(member) == kct_thinking.$kw13$RUNNING) {
                    inference = kbq_query_run.runstate_inference(member);
                    kbq_query_run.set_runstate_run_status(member, (SubLObject)kct_thinking.$kw12$STOPPED);
                    inference_utilities.inference_thinking_task_abort(inference, thinking);
                    found = (SubLObject)kct_thinking.T;
                }
                csome_list_var = csome_list_var.rest();
                member = csome_list_var.first();
            }
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 5900L)
    public static SubLObject kct_thinking_thread_run() {
        final SubLObject thinking = process_utilities.thinking_task();
        final SubLObject function = kct_thinking_function(thinking);
        final SubLObject args = kct_thinking_args(thinking);
        SubLObject result = (SubLObject)kct_thinking.NIL;
        result = Functions.apply(function, args);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 6134L)
    public static SubLObject kct_classify_thinkings_by_type(final SubLObject thinkings) {
        SubLObject individual_tests = (SubLObject)kct_thinking.NIL;
        SubLObject collection_tests = (SubLObject)kct_thinking.NIL;
        SubLObject cdolist_list_var = thinkings;
        SubLObject thinking = (SubLObject)kct_thinking.NIL;
        thinking = cdolist_list_var.first();
        while (kct_thinking.NIL != cdolist_list_var) {
            final SubLObject pcase_var = kct_thinking_type(thinking);
            if (pcase_var.eql((SubLObject)kct_thinking.$kw14$INDIVIDUAL)) {
                individual_tests = (SubLObject)ConsesLow.cons(thinking, individual_tests);
            }
            else if (pcase_var.eql((SubLObject)kct_thinking.$kw15$COLLECTION)) {
                collection_tests = (SubLObject)ConsesLow.cons(thinking, collection_tests);
            }
            else {
                Errors.error((SubLObject)kct_thinking.$str16$Wrong_type_of_KCT_Thinking_Task__, kct_thinking_type(thinking));
            }
            cdolist_list_var = cdolist_list_var.rest();
            thinking = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(individual_tests), Sequences.nreverse(collection_tests));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 6686L)
    public static SubLObject kct_any_thinking_runningP() {
        SubLObject result = (SubLObject)kct_thinking.NIL;
        if (kct_thinking.NIL == result) {
            SubLObject csome_list_var = kct_all_thinkings();
            SubLObject thinking = (SubLObject)kct_thinking.NIL;
            thinking = csome_list_var.first();
            while (kct_thinking.NIL == result && kct_thinking.NIL != csome_list_var) {
                if (process_utilities.thinking_status(thinking) == kct_thinking.$kw13$RUNNING || process_utilities.thinking_status(thinking) == kct_thinking.$kw17$STARTED) {
                    result = (SubLObject)kct_thinking.T;
                }
                csome_list_var = csome_list_var.rest();
                thinking = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 7023L)
    public static SubLObject kct_run_test_in_thinker(final SubLObject test_constant, SubLObject browsableP) {
        if (browsableP == kct_thinking.UNPROVIDED) {
            browsableP = (SubLObject)kct_thinking.NIL;
        }
        final SubLObject thinking = kct_new_thinking(test_constant, (SubLObject)kct_thinking.$kw14$INDIVIDUAL);
        final SubLObject svs = special_variable_state.new_special_variable_state((SubLObject)kct_thinking.$list18);
        final SubLObject thread = kct_thinking_start(thinking, Symbols.symbol_function((SubLObject)kct_thinking.$sym19$KCT_RUN_TEST_WITH_STATE), (SubLObject)ConsesLow.list(svs, test_constant, browsableP));
        return thread;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 7662L)
    public static SubLObject kct_run_test_set_in_thinker(final SubLObject test_set, SubLObject browsableP) {
        if (browsableP == kct_thinking.UNPROVIDED) {
            browsableP = (SubLObject)kct_thinking.NIL;
        }
        final SubLObject thinking = kct_new_thinking(test_set, (SubLObject)kct_thinking.$kw15$COLLECTION);
        final SubLObject svs = special_variable_state.new_special_variable_state((SubLObject)kct_thinking.$list18);
        final SubLObject thread = kct_thinking_start(thinking, Symbols.symbol_function((SubLObject)kct_thinking.$sym20$KCT_RUN_TEST_SET_WITH_STATE), (SubLObject)ConsesLow.list(svs, test_set, browsableP));
        return thread;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 8186L)
    public static SubLObject kct_run_test_with_state(final SubLObject svs, final SubLObject test_spec, SubLObject browsableP, SubLObject overriding_query_properties, SubLObject required_metrics) {
        if (browsableP == kct_thinking.UNPROVIDED) {
            browsableP = (SubLObject)kct_thinking.NIL;
        }
        if (overriding_query_properties == kct_thinking.UNPROVIDED) {
            overriding_query_properties = (SubLObject)kct_thinking.NIL;
        }
        if (required_metrics == kct_thinking.UNPROVIDED) {
            required_metrics = (SubLObject)kct_thinking.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kct_thinking.NIL != special_variable_state.special_variable_state_p(svs) : svs;
        SubLObject result = (SubLObject)kct_thinking.NIL;
        if (kct_thinking.NIL != browsableP) {
            conses_high.putf(overriding_query_properties, (SubLObject)kct_thinking.$kw22$BROWSABLE_, (SubLObject)kct_thinking.T);
        }
        final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
        final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
        try {
            Dynamic.bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
            enforceType(svs, kct_thinking.$sym21$SPECIAL_VARIABLE_STATE_P);
            result = kbq_query_run.kct_run_test(test_spec, required_metrics, kbq_query_run.$kbq_outlier_timeout$.getDynamicValue(thread), overriding_query_properties, (SubLObject)kct_thinking.T, (SubLObject)kct_thinking.T);
        }
        finally {
            Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-thinking.lisp", position = 8634L)
    public static SubLObject kct_run_test_set_with_state(final SubLObject svs, final SubLObject test_set, SubLObject browsableP, SubLObject overriding_query_properties, SubLObject required_metrics) {
        if (browsableP == kct_thinking.UNPROVIDED) {
            browsableP = (SubLObject)kct_thinking.NIL;
        }
        if (overriding_query_properties == kct_thinking.UNPROVIDED) {
            overriding_query_properties = (SubLObject)kct_thinking.NIL;
        }
        if (required_metrics == kct_thinking.UNPROVIDED) {
            required_metrics = (SubLObject)kct_thinking.NIL;
        }
        assert kct_thinking.NIL != special_variable_state.special_variable_state_p(svs) : svs;
        SubLObject result = (SubLObject)kct_thinking.NIL;
        if (kct_thinking.NIL != browsableP) {
            conses_high.putf(overriding_query_properties, (SubLObject)kct_thinking.$kw22$BROWSABLE_, (SubLObject)kct_thinking.T);
        }
        final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
        final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
        try {
            Dynamic.bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
            enforceType(svs, kct_thinking.$sym21$SPECIAL_VARIABLE_STATE_P);
            result = kbq_query_run.kct_run_test_set(test_set, required_metrics, kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue(), overriding_query_properties, (SubLObject)kct_thinking.T, (SubLObject)kct_thinking.NIL, (SubLObject)kct_thinking.NIL, (SubLObject)kct_thinking.T, (SubLObject)kct_thinking.UNPROVIDED, (SubLObject)kct_thinking.UNPROVIDED, (SubLObject)kct_thinking.UNPROVIDED, (SubLObject)kct_thinking.UNPROVIDED, (SubLObject)kct_thinking.UNPROVIDED, (SubLObject)kct_thinking.UNPROVIDED);
        }
        finally {
            Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
        }
        return result;
    }
    
    public static SubLObject declare_kct_thinking_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "next_kct_thinking_id", "NEXT-KCT-THINKING-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_all_thinkings", "KCT-ALL-THINKINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_thinking_id", "KCT-THINKING-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_thinking_type", "KCT-THINKING-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_thinking_test_constant", "KCT-THINKING-TEST-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_thinking_runstate", "KCT-THINKING-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_thinking_function", "KCT-THINKING-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_thinking_args", "KCT-THINKING-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_thinking_progress_message", "KCT-THINKING-PROGRESS-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_add_thinking", "KCT-ADD-THINKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_remove_thinking", "KCT-REMOVE-THINKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_thinking_set_runstate_id", "KCT-THINKING-SET-RUNSTATE-ID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_lookup_thinking", "KCT-LOOKUP-THINKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_new_thinking", "KCT-NEW-THINKING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_thinking_start", "KCT-THINKING-START", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_thinking_stop", "KCT-THINKING-STOP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_thinking_thread_run", "KCT-THINKING-THREAD-RUN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_classify_thinkings_by_type", "KCT-CLASSIFY-THINKINGS-BY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_any_thinking_runningP", "KCT-ANY-THINKING-RUNNING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_run_test_in_thinker", "KCT-RUN-TEST-IN-THINKER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_run_test_set_in_thinker", "KCT-RUN-TEST-SET-IN-THINKER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_run_test_with_state", "KCT-RUN-TEST-WITH-STATE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking", "kct_run_test_set_with_state", "KCT-RUN-TEST-SET-WITH-STATE", 2, 3, false);
        return (SubLObject)kct_thinking.NIL;
    }
    
    public static SubLObject init_kct_thinking_file() {
        kct_thinking.$kct_thinking_index$ = SubLFiles.deflexical("*KCT-THINKING-INDEX*", dictionary.new_dictionary((SubLObject)kct_thinking.UNPROVIDED, (SubLObject)kct_thinking.UNPROVIDED));
        kct_thinking.$kct_thinking_index_lock$ = SubLFiles.deflexical("*KCT-THINKING-INDEX-LOCK*", Locks.make_lock((SubLObject)kct_thinking.$str0$KCT_Thinking_Lock));
        kct_thinking.$kct_thinking_isg$ = SubLFiles.deflexical("*KCT-THINKING-ISG*", integer_sequence_generator.new_integer_sequence_generator((SubLObject)kct_thinking.UNPROVIDED, (SubLObject)kct_thinking.UNPROVIDED, (SubLObject)kct_thinking.UNPROVIDED));
        return (SubLObject)kct_thinking.NIL;
    }
    
    public static SubLObject setup_kct_thinking_file() {
        return (SubLObject)kct_thinking.NIL;
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
        me = (SubLFile)new kct_thinking();
        kct_thinking.$kct_thinking_index$ = null;
        kct_thinking.$kct_thinking_index_lock$ = null;
        kct_thinking.$kct_thinking_isg$ = null;
        $str0$KCT_Thinking_Lock = SubLObjectFactory.makeString("KCT Thinking Lock");
        $kw1$ID = SubLObjectFactory.makeKeyword("ID");
        $kw2$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw3$TEST_CONSTANT = SubLObjectFactory.makeKeyword("TEST-CONSTANT");
        $kw4$RUNSTATE_ID = SubLObjectFactory.makeKeyword("RUNSTATE-ID");
        $kw5$FUNCTION = SubLObjectFactory.makeKeyword("FUNCTION");
        $kw6$ARGS = SubLObjectFactory.makeKeyword("ARGS");
        $sym7$THINKING_TASK_P = SubLObjectFactory.makeSymbol("THINKING-TASK-P");
        $sym8$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str9$KB_Content_Test_Running = SubLObjectFactory.makeString("KB Content Test Running");
        $str10$Starting___ = SubLObjectFactory.makeString("Starting...");
        $sym11$KCT_THINKING_THREAD_RUN = SubLObjectFactory.makeSymbol("KCT-THINKING-THREAD-RUN");
        $kw12$STOPPED = SubLObjectFactory.makeKeyword("STOPPED");
        $kw13$RUNNING = SubLObjectFactory.makeKeyword("RUNNING");
        $kw14$INDIVIDUAL = SubLObjectFactory.makeKeyword("INDIVIDUAL");
        $kw15$COLLECTION = SubLObjectFactory.makeKeyword("COLLECTION");
        $str16$Wrong_type_of_KCT_Thinking_Task__ = SubLObjectFactory.makeString("Wrong type of KCT Thinking Task: ~A!");
        $kw17$STARTED = SubLObjectFactory.makeKeyword("STARTED");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*THE-CYCLIST*"));
        $sym19$KCT_RUN_TEST_WITH_STATE = SubLObjectFactory.makeSymbol("KCT-RUN-TEST-WITH-STATE");
        $sym20$KCT_RUN_TEST_SET_WITH_STATE = SubLObjectFactory.makeSymbol("KCT-RUN-TEST-SET-WITH-STATE");
        $sym21$SPECIAL_VARIABLE_STATE_P = SubLObjectFactory.makeSymbol("SPECIAL-VARIABLE-STATE-P");
        $kw22$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
    }
}

/*

	Total time: 120 ms
	
*/