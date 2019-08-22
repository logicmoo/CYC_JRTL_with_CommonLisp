/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyc_testing.kb_content_test;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.extract_dynamic_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import java.util.ArrayList;

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KCT-THINKING
 * source file: /cyc/top/cycl/cyc-testing/kb-content-test/kct-thinking.lisp
 * created:     2019/07/03 17:37:56
 */
public final class kct_thinking extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new kct_thinking();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $kct_thinking_index$ = makeSymbol("*KCT-THINKING-INDEX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $kct_thinking_index_lock$ = makeSymbol("*KCT-THINKING-INDEX-LOCK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $kct_thinking_isg$ = makeSymbol("*KCT-THINKING-ISG*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$KCT_Thinking_Lock = makeString("KCT Thinking Lock");

    private static final SubLSymbol THINKING_TASK_P = makeSymbol("THINKING-TASK-P");

    static private final SubLString $$$KB_Content_Test_Running = makeString("KB Content Test Running");

    static private final SubLString $str10$Starting___ = makeString("Starting...");

    private static final SubLSymbol KCT_THINKING_THREAD_RUN = makeSymbol("KCT-THINKING-THREAD-RUN");

    static private final SubLString $str16$Wrong_type_of_KCT_Thinking_Task__ = makeString("Wrong type of KCT Thinking Task: ~A!");

    static private final SubLList $list18 = list(makeSymbol("*THE-CYCLIST*"));

    private static final SubLSymbol KCT_RUN_TEST_WITH_STATE = makeSymbol("KCT-RUN-TEST-WITH-STATE");

    private static final SubLSymbol KCT_RUN_TEST_SET_WITH_STATE = makeSymbol("KCT-RUN-TEST-SET-WITH-STATE");

    private static final SubLSymbol SPECIAL_VARIABLE_STATE_P = makeSymbol("SPECIAL-VARIABLE-STATE-P");

    public static final SubLObject next_kct_thinking_id_alt() {
        return integer_sequence_generator.integer_sequence_generator_next($kct_thinking_isg$.getGlobalValue());
    }

    public static SubLObject next_kct_thinking_id() {
        return integer_sequence_generator.integer_sequence_generator_next(kct_thinking.$kct_thinking_isg$.getGlobalValue());
    }

    public static final SubLObject kct_all_thinkings_alt() {
        return dictionary.dictionary_values($kct_thinking_index$.getGlobalValue());
    }

    public static SubLObject kct_all_thinkings() {
        return dictionary.dictionary_values(kct_thinking.$kct_thinking_index$.getGlobalValue());
    }

    public static final SubLObject kct_thinking_id_alt(SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $ID);
    }

    public static SubLObject kct_thinking_id(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $ID);
    }

    public static final SubLObject kct_thinking_type_alt(SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $TYPE);
    }

    public static SubLObject kct_thinking_type(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $TYPE);
    }

    public static final SubLObject kct_thinking_test_constant_alt(SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $TEST_CONSTANT);
    }

    public static SubLObject kct_thinking_test_constant(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $TEST_CONSTANT);
    }

    public static final SubLObject kct_thinking_runstate_alt(SubLObject thinking) {
        return kbq_query_run.runstate_find_object_by_id(process_utilities.thinking_property(thinking, $RUNSTATE_ID));
    }

    public static SubLObject kct_thinking_runstate(final SubLObject thinking) {
        return kbq_query_run.runstate_find_object_by_id(process_utilities.thinking_property(thinking, $RUNSTATE_ID));
    }

    public static final SubLObject kct_thinking_function_alt(SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $FUNCTION);
    }

    public static SubLObject kct_thinking_function(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $FUNCTION);
    }

    public static final SubLObject kct_thinking_args_alt(SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $ARGS);
    }

    public static SubLObject kct_thinking_args(final SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $ARGS);
    }

    public static final SubLObject kct_thinking_progress_message_alt(SubLObject thinking) {
        return process_utilities.thinking_progress_message(thinking);
    }

    public static SubLObject kct_thinking_progress_message(final SubLObject thinking) {
        return process_utilities.thinking_progress_message(thinking);
    }

    public static final SubLObject kct_add_thinking_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        {
            SubLObject id = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_thinking_id(thinking);
            dictionary.dictionary_enter($kct_thinking_index$.getGlobalValue(), id, thinking);
        }
        return com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_all_thinkings();
    }

    public static SubLObject kct_add_thinking(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        final SubLObject id = kct_thinking.kct_thinking_id(thinking);
        dictionary.dictionary_enter(kct_thinking.$kct_thinking_index$.getGlobalValue(), id, thinking);
        return kct_thinking.kct_all_thinkings();
    }

    public static final SubLObject kct_remove_thinking_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        {
            SubLObject id = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_thinking_id(thinking);
            SubLObject runstate = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_thinking_runstate(thinking);
            dictionary.dictionary_remove($kct_thinking_index$.getGlobalValue(), id);
            if (NIL != runstate) {
                kbq_query_run.destroy_runstate(runstate);
            }
        }
        return com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_all_thinkings();
    }

    public static SubLObject kct_remove_thinking(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        final SubLObject id = kct_thinking.kct_thinking_id(thinking);
        final SubLObject runstate = kct_thinking.kct_thinking_runstate(thinking);
        dictionary.dictionary_remove(kct_thinking.$kct_thinking_index$.getGlobalValue(), id);
        if (NIL != runstate) {
            kbq_query_run.destroy_runstate(runstate);
        }
        return kct_thinking.kct_all_thinkings();
    }

    /**
     * Set the runstate-id for THINKING (which defaults to the current thinking task) to ID
     */
    @LispMethod(comment = "Set the runstate-id for THINKING (which defaults to the current thinking task) to ID")
    public static final SubLObject kct_thinking_set_runstate_id_alt(SubLObject id, SubLObject thinking) {
        if (thinking == UNPROVIDED) {
            thinking = process_utilities.thinking_task();
        }
        SubLTrampolineFile.checkType(id, INTEGERP);
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            process_utilities.thinking_note_property(thinking, $RUNSTATE_ID, id);
        }
        return thinking;
    }

    /**
     * Set the runstate-id for THINKING (which defaults to the current thinking task) to ID
     */
    @LispMethod(comment = "Set the runstate-id for THINKING (which defaults to the current thinking task) to ID")
    public static SubLObject kct_thinking_set_runstate_id(final SubLObject id, SubLObject thinking) {
        if (thinking == UNPROVIDED) {
            thinking = process_utilities.thinking_task();
        }
        assert NIL != integerp(id) : "! integerp(id) " + ("Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) ") + id;
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            process_utilities.thinking_note_property(thinking, $RUNSTATE_ID, id);
        }
        return thinking;
    }

    /**
     * Retrieve a thinking task by ID.
     */
    @LispMethod(comment = "Retrieve a thinking task by ID.")
    public static final SubLObject kct_lookup_thinking_alt(SubLObject id) {
        SubLTrampolineFile.checkType(id, INTEGERP);
        return dictionary.dictionary_lookup($kct_thinking_index$.getGlobalValue(), id, UNPROVIDED);
    }

    /**
     * Retrieve a thinking task by ID.
     */
    @LispMethod(comment = "Retrieve a thinking task by ID.")
    public static SubLObject kct_lookup_thinking(final SubLObject id) {
        assert NIL != integerp(id) : "! integerp(id) " + ("Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) ") + id;
        return dictionary.dictionary_lookup(kct_thinking.$kct_thinking_index$.getGlobalValue(), id, UNPROVIDED);
    }

    /**
     * Create a new thinking task of type TYPE (:individual or :collection)
     * for running TEST-CONSTANT.
     */
    @LispMethod(comment = "Create a new thinking task of type TYPE (:individual or :collection)\r\nfor running TEST-CONSTANT.\nCreate a new thinking task of type TYPE (:individual or :collection)\nfor running TEST-CONSTANT.")
    public static final SubLObject kct_new_thinking_alt(SubLObject test_constant, SubLObject type) {
        {
            SubLObject id = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.next_kct_thinking_id();
            SubLObject v_properties = list($TEST_CONSTANT, test_constant, $TYPE, type, $ID, id);
            SubLObject thinking = process_utilities.new_thinking_task($$$KB_Content_Test_Running, $str_alt10$Starting___, v_properties);
            com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_add_thinking(thinking);
            return thinking;
        }
    }

    /**
     * Create a new thinking task of type TYPE (:individual or :collection)
     * for running TEST-CONSTANT.
     */
    @LispMethod(comment = "Create a new thinking task of type TYPE (:individual or :collection)\r\nfor running TEST-CONSTANT.\nCreate a new thinking task of type TYPE (:individual or :collection)\nfor running TEST-CONSTANT.")
    public static SubLObject kct_new_thinking(final SubLObject test_constant, final SubLObject type) {
        final SubLObject id = kct_thinking.next_kct_thinking_id();
        final SubLObject v_properties = list($TEST_CONSTANT, test_constant, $TYPE, type, $ID, id);
        final SubLObject thinking = process_utilities.new_thinking_task(kct_thinking.$$$KB_Content_Test_Running, kct_thinking.$str10$Starting___, v_properties);
        kct_thinking.kct_add_thinking(thinking);
        return thinking;
    }

    /**
     * Start THINKING running FUNCTION on ARG-LIST.
     */
    @LispMethod(comment = "Start THINKING running FUNCTION on ARG-LIST.")
    public static final SubLObject kct_thinking_start_alt(SubLObject thinking, SubLObject function, SubLObject arg_list) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        process_utilities.thinking_note_property(thinking, $FUNCTION, function);
        process_utilities.thinking_note_property(thinking, $ARGS, arg_list);
        return process_utilities.thinking_start(thinking, KCT_THINKING_THREAD_RUN, NIL);
    }

    /**
     * Start THINKING running FUNCTION on ARG-LIST.
     */
    @LispMethod(comment = "Start THINKING running FUNCTION on ARG-LIST.")
    public static SubLObject kct_thinking_start(final SubLObject thinking, final SubLObject function, final SubLObject arg_list) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        process_utilities.thinking_note_property(thinking, $FUNCTION, function);
        process_utilities.thinking_note_property(thinking, $ARGS, arg_list);
        return process_utilities.thinking_start(thinking, kct_thinking.KCT_THINKING_THREAD_RUN, NIL);
    }

    /**
     * Stop THINKING, and set the status of active runstates
     * to :STOPPED.
     */
    @LispMethod(comment = "Stop THINKING, and set the status of active runstates\r\nto :STOPPED.\nStop THINKING, and set the status of active runstates\nto :STOPPED.")
    public static final SubLObject kct_thinking_stop_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        {
            SubLObject runstate = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_thinking_runstate(thinking);
            SubLObject members = (NIL != kbq_query_run.kct_set_runstate_p(runstate)) ? ((SubLObject) (kbq_query_run.kct_set_runstate_test_runstates(runstate))) : list(runstate);
            SubLObject inference = NIL;
            SubLObject found = NIL;
            kbq_query_run.set_runstate_run_status(runstate, $STOPPED);
            if (NIL == found) {
                {
                    SubLObject csome_list_var = members;
                    SubLObject member = NIL;
                    for (member = csome_list_var.first(); !((NIL != found) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , member = csome_list_var.first()) {
                        if (kbq_query_run.runstate_run_status(member) == $RUNNING) {
                            inference = kbq_query_run.runstate_inference(member);
                            kbq_query_run.set_runstate_run_status(member, $STOPPED);
                            inference_utilities.inference_thinking_task_abort(inference, thinking);
                            found = T;
                        }
                    }
                }
            }
        }
        return thinking;
    }

    /**
     * Stop THINKING, and set the status of active runstates
     * to :STOPPED.
     */
    @LispMethod(comment = "Stop THINKING, and set the status of active runstates\r\nto :STOPPED.\nStop THINKING, and set the status of active runstates\nto :STOPPED.")
    public static SubLObject kct_thinking_stop(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        final SubLObject runstate = kct_thinking.kct_thinking_runstate(thinking);
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

    public static final SubLObject kct_thinking_thread_run_alt() {
        {
            SubLObject thinking = process_utilities.thinking_task();
            SubLObject function = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_thinking_function(thinking);
            SubLObject args = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_thinking_args(thinking);
            SubLObject result = NIL;
            result = apply(function, args);
            return result;
        }
    }

    public static SubLObject kct_thinking_thread_run() {
        final SubLObject thinking = process_utilities.thinking_task();
        final SubLObject function = kct_thinking.kct_thinking_function(thinking);
        final SubLObject args = kct_thinking.kct_thinking_args(thinking);
        SubLObject result = NIL;
        result = apply(function, args);
        return result;
    }

    /**
     * Return two values: Those in THINKINGS of type :individual, and those of
     * type :collection.
     */
    @LispMethod(comment = "Return two values: Those in THINKINGS of type :individual, and those of\r\ntype :collection.\nReturn two values: Those in THINKINGS of type :individual, and those of\ntype :collection.")
    public static final SubLObject kct_classify_thinkings_by_type_alt(SubLObject thinkings) {
        {
            SubLObject individual_tests = NIL;
            SubLObject collection_tests = NIL;
            SubLObject cdolist_list_var = thinkings;
            SubLObject thinking = NIL;
            for (thinking = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thinking = cdolist_list_var.first()) {
                {
                    SubLObject pcase_var = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_thinking_type(thinking);
                    if (pcase_var.eql($INDIVIDUAL)) {
                        individual_tests = cons(thinking, individual_tests);
                    } else {
                        if (pcase_var.eql($COLLECTION)) {
                            collection_tests = cons(thinking, collection_tests);
                        } else {
                            Errors.error($str_alt16$Wrong_type_of_KCT_Thinking_Task__, com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_thinking_type(thinking));
                        }
                    }
                }
            }
            return values(nreverse(individual_tests), nreverse(collection_tests));
        }
    }

    /**
     * Return two values: Those in THINKINGS of type :individual, and those of
     * type :collection.
     */
    @LispMethod(comment = "Return two values: Those in THINKINGS of type :individual, and those of\r\ntype :collection.\nReturn two values: Those in THINKINGS of type :individual, and those of\ntype :collection.")
    public static SubLObject kct_classify_thinkings_by_type(final SubLObject thinkings) {
        SubLObject individual_tests = NIL;
        SubLObject collection_tests = NIL;
        SubLObject cdolist_list_var = thinkings;
        SubLObject thinking = NIL;
        thinking = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = kct_thinking.kct_thinking_type(thinking);
            if (pcase_var.eql($INDIVIDUAL)) {
                individual_tests = cons(thinking, individual_tests);
            } else
                if (pcase_var.eql($COLLECTION)) {
                    collection_tests = cons(thinking, collection_tests);
                } else {
                    Errors.error(kct_thinking.$str16$Wrong_type_of_KCT_Thinking_Task__, kct_thinking.kct_thinking_type(thinking));
                }

            cdolist_list_var = cdolist_list_var.rest();
            thinking = cdolist_list_var.first();
        } 
        return values(nreverse(individual_tests), nreverse(collection_tests));
    }

    /**
     * Returns T IFF any KCT thinking task has status :RUNNING or :STARTED.
     */
    @LispMethod(comment = "Returns T IFF any KCT thinking task has status :RUNNING or :STARTED.")
    public static final SubLObject kct_any_thinking_runningP_alt() {
        {
            SubLObject result = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_all_thinkings();
                    SubLObject thinking = NIL;
                    for (thinking = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , thinking = csome_list_var.first()) {
                        if ((process_utilities.thinking_status(thinking) == $RUNNING) || (process_utilities.thinking_status(thinking) == $STARTED)) {
                            result = T;
                        }
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Returns T IFF any KCT thinking task has status :RUNNING or :STARTED.")
    public static SubLObject kct_any_thinking_runningP() {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = kct_thinking.kct_all_thinkings();
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

    /**
     * Start a thinking task to run the test specified by TEST-CONSTANT. If BROWABLE? is non-nil,
     * inference objects created to run test queries will remain around after completion for
     * browsing.  (By default, they are destroyed after the test completes.)
     */
    @LispMethod(comment = "Start a thinking task to run the test specified by TEST-CONSTANT. If BROWABLE? is non-nil,\r\ninference objects created to run test queries will remain around after completion for\r\nbrowsing.  (By default, they are destroyed after the test completes.)\nStart a thinking task to run the test specified by TEST-CONSTANT. If BROWABLE? is non-nil,\ninference objects created to run test queries will remain around after completion for\nbrowsing.  (By default, they are destroyed after the test completes.)")
    public static final SubLObject kct_run_test_in_thinker_alt(SubLObject test_constant, SubLObject browsableP) {
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        {
            SubLObject thinking = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_new_thinking(test_constant, $INDIVIDUAL);
            SubLObject svs = special_variable_state.new_special_variable_state($list_alt18);
            SubLObject thread = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_thinking_start(thinking, symbol_function(KCT_RUN_TEST_WITH_STATE), list(svs, test_constant, browsableP));
            return thread;
        }
    }

    /**
     * Start a thinking task to run the test specified by TEST-CONSTANT. If BROWABLE? is non-nil,
     * inference objects created to run test queries will remain around after completion for
     * browsing.  (By default, they are destroyed after the test completes.)
     */
    @LispMethod(comment = "Start a thinking task to run the test specified by TEST-CONSTANT. If BROWABLE? is non-nil,\r\ninference objects created to run test queries will remain around after completion for\r\nbrowsing.  (By default, they are destroyed after the test completes.)\nStart a thinking task to run the test specified by TEST-CONSTANT. If BROWABLE? is non-nil,\ninference objects created to run test queries will remain around after completion for\nbrowsing.  (By default, they are destroyed after the test completes.)")
    public static SubLObject kct_run_test_in_thinker(final SubLObject test_constant, SubLObject browsableP) {
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        final SubLObject thinking = kct_thinking.kct_new_thinking(test_constant, $INDIVIDUAL);
        final SubLObject svs = special_variable_state.new_special_variable_state(kct_thinking.$list18);
        final SubLObject thread = kct_thinking.kct_thinking_start(thinking, symbol_function(kct_thinking.KCT_RUN_TEST_WITH_STATE), list(svs, test_constant, browsableP));
        return thread;
    }

    /**
     * Start a thinking task to run the all the tests in TEST-SET.  If BROWABLE? is
     * non-nil, inference objects created to run test queries will remain around after
     * completion for browsing.
     */
    @LispMethod(comment = "Start a thinking task to run the all the tests in TEST-SET.  If BROWABLE? is\r\nnon-nil, inference objects created to run test queries will remain around after\r\ncompletion for browsing.\nStart a thinking task to run the all the tests in TEST-SET.  If BROWABLE? is\nnon-nil, inference objects created to run test queries will remain around after\ncompletion for browsing.")
    public static final SubLObject kct_run_test_set_in_thinker_alt(SubLObject test_set, SubLObject browsableP) {
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        {
            SubLObject thinking = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_new_thinking(test_set, $COLLECTION);
            SubLObject svs = special_variable_state.new_special_variable_state($list_alt18);
            SubLObject thread = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking.kct_thinking_start(thinking, symbol_function(KCT_RUN_TEST_SET_WITH_STATE), list(svs, test_set, browsableP));
            return thread;
        }
    }

    @LispMethod(comment = "Start a thinking task to run the all the tests in TEST-SET.  If BROWABLE? is\r\nnon-nil, inference objects created to run test queries will remain around after\r\ncompletion for browsing.\nStart a thinking task to run the all the tests in TEST-SET.  If BROWABLE? is\nnon-nil, inference objects created to run test queries will remain around after\ncompletion for browsing.")
    public static SubLObject kct_run_test_set_in_thinker(final SubLObject test_set, SubLObject browsableP) {
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        final SubLObject thinking = kct_thinking.kct_new_thinking(test_set, $COLLECTION);
        final SubLObject svs = special_variable_state.new_special_variable_state(kct_thinking.$list18);
        final SubLObject thread = kct_thinking.kct_thinking_start(thinking, symbol_function(kct_thinking.KCT_RUN_TEST_SET_WITH_STATE), list(svs, test_set, browsableP));
        return thread;
    }

    public static final SubLObject kct_run_test_with_state_alt(SubLObject svs, SubLObject test_spec, SubLObject browsableP, SubLObject overriding_query_properties, SubLObject required_metrics) {
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (required_metrics == UNPROVIDED) {
            required_metrics = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(svs, SPECIAL_VARIABLE_STATE_P);
            {
                SubLObject result = NIL;
                if (NIL != browsableP) {
                    putf(overriding_query_properties, $BROWSABLE_, T);
                }
                {
                    SubLObject svs_var = svs;
                    SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                    {
                        SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                        final ArrayList old_values = extract_dynamic_values(cprogv_var);
                        try {
                            bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                            result = kbq_query_run.kct_run_test(test_spec, required_metrics, kbq_query_run.$kbq_outlier_timeout$.getDynamicValue(thread), overriding_query_properties, T, T);
                        } finally {
                            rebind_dynamic_vars(cprogv_var, old_values);
                        }
                    }
                }
                return result;
            }
        }
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
        assert NIL != special_variable_state.special_variable_state_p(svs) : "! special_variable_state.special_variable_state_p(svs) " + ("special_variable_state.special_variable_state_p(svs) " + "CommonSymbols.NIL != special_variable_state.special_variable_state_p(svs) ") + svs;
        SubLObject result = NIL;
        if (NIL != browsableP) {
            putf(overriding_query_properties, $BROWSABLE_, T);
        }
        final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
        final ArrayList old_values = extract_dynamic_values(cprogv_var);
        try {
            bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
            SubLTrampolineFile.enforceType(svs, kct_thinking.SPECIAL_VARIABLE_STATE_P);
            result = kbq_query_run.kct_run_test(test_spec, required_metrics, kbq_query_run.$kbq_outlier_timeout$.getDynamicValue(thread), overriding_query_properties, T, T);
        } finally {
            rebind_dynamic_vars(cprogv_var, old_values);
        }
        return result;
    }

    public static final SubLObject kct_run_test_set_with_state_alt(SubLObject svs, SubLObject test_set, SubLObject browsableP, SubLObject overriding_query_properties, SubLObject required_metrics) {
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (required_metrics == UNPROVIDED) {
            required_metrics = NIL;
        }
        SubLTrampolineFile.checkType(svs, SPECIAL_VARIABLE_STATE_P);
        {
            SubLObject result = NIL;
            if (NIL != browsableP) {
                putf(overriding_query_properties, $BROWSABLE_, T);
            }
            {
                SubLObject svs_var = svs;
                SubLTrampolineFile.checkType(svs_var, SPECIAL_VARIABLE_STATE_P);
                {
                    SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                    final ArrayList old_values = extract_dynamic_values(cprogv_var);
                    try {
                        bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                        result = kbq_query_run.kct_run_test_set(test_set, required_metrics, kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue(), overriding_query_properties, T, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        rebind_dynamic_vars(cprogv_var, old_values);
                    }
                }
            }
            return result;
        }
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
        assert NIL != special_variable_state.special_variable_state_p(svs) : "! special_variable_state.special_variable_state_p(svs) " + ("special_variable_state.special_variable_state_p(svs) " + "CommonSymbols.NIL != special_variable_state.special_variable_state_p(svs) ") + svs;
        SubLObject result = NIL;
        if (NIL != browsableP) {
            putf(overriding_query_properties, $BROWSABLE_, T);
        }
        final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
        final ArrayList old_values = extract_dynamic_values(cprogv_var);
        try {
            bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
            SubLTrampolineFile.enforceType(svs, kct_thinking.SPECIAL_VARIABLE_STATE_P);
            result = kbq_query_run.kct_run_test_set(test_set, required_metrics, kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue(), overriding_query_properties, T, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            rebind_dynamic_vars(cprogv_var, old_values);
        }
        return result;
    }

    public static SubLObject declare_kct_thinking_file() {
        declareFunction("next_kct_thinking_id", "NEXT-KCT-THINKING-ID", 0, 0, false);
        declareFunction("kct_all_thinkings", "KCT-ALL-THINKINGS", 0, 0, false);
        declareFunction("kct_thinking_id", "KCT-THINKING-ID", 1, 0, false);
        declareFunction("kct_thinking_type", "KCT-THINKING-TYPE", 1, 0, false);
        declareFunction("kct_thinking_test_constant", "KCT-THINKING-TEST-CONSTANT", 1, 0, false);
        declareFunction("kct_thinking_runstate", "KCT-THINKING-RUNSTATE", 1, 0, false);
        declareFunction("kct_thinking_function", "KCT-THINKING-FUNCTION", 1, 0, false);
        declareFunction("kct_thinking_args", "KCT-THINKING-ARGS", 1, 0, false);
        declareFunction("kct_thinking_progress_message", "KCT-THINKING-PROGRESS-MESSAGE", 1, 0, false);
        declareFunction("kct_add_thinking", "KCT-ADD-THINKING", 1, 0, false);
        declareFunction("kct_remove_thinking", "KCT-REMOVE-THINKING", 1, 0, false);
        declareFunction("kct_thinking_set_runstate_id", "KCT-THINKING-SET-RUNSTATE-ID", 1, 1, false);
        declareFunction("kct_lookup_thinking", "KCT-LOOKUP-THINKING", 1, 0, false);
        declareFunction("kct_new_thinking", "KCT-NEW-THINKING", 2, 0, false);
        declareFunction("kct_thinking_start", "KCT-THINKING-START", 3, 0, false);
        declareFunction("kct_thinking_stop", "KCT-THINKING-STOP", 1, 0, false);
        declareFunction("kct_thinking_thread_run", "KCT-THINKING-THREAD-RUN", 0, 0, false);
        declareFunction("kct_classify_thinkings_by_type", "KCT-CLASSIFY-THINKINGS-BY-TYPE", 1, 0, false);
        declareFunction("kct_any_thinking_runningP", "KCT-ANY-THINKING-RUNNING?", 0, 0, false);
        declareFunction("kct_run_test_in_thinker", "KCT-RUN-TEST-IN-THINKER", 1, 1, false);
        declareFunction("kct_run_test_set_in_thinker", "KCT-RUN-TEST-SET-IN-THINKER", 1, 1, false);
        declareFunction("kct_run_test_with_state", "KCT-RUN-TEST-WITH-STATE", 2, 3, false);
        declareFunction("kct_run_test_set_with_state", "KCT-RUN-TEST-SET-WITH-STATE", 2, 3, false);
        return NIL;
    }

    public static SubLObject init_kct_thinking_file() {
        deflexical("*KCT-THINKING-INDEX*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*KCT-THINKING-INDEX-LOCK*", make_lock(kct_thinking.$$$KCT_Thinking_Lock));
        deflexical("*KCT-THINKING-ISG*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_kct_thinking_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        kct_thinking.declare_kct_thinking_file();
    }

    @Override
    public void initializeVariables() {
        kct_thinking.init_kct_thinking_file();
    }

    @Override
    public void runTopLevelForms() {
        kct_thinking.setup_kct_thinking_file();
    }

    

    static private final SubLString $str_alt10$Starting___ = makeString("Starting...");

    static private final SubLString $str_alt16$Wrong_type_of_KCT_Thinking_Task__ = makeString("Wrong type of KCT Thinking Task: ~A!");

    static private final SubLList $list_alt18 = list(makeSymbol("*THE-CYCLIST*"));
}

/**
 * Total time: 120 ms
 */
