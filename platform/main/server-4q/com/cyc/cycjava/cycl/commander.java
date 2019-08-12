package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class commander extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new commander();

    public static final String myName = "com.cyc.cycjava_2.cycl.commander";


    // defparameter
    public static final SubLSymbol $commander_debug_level$ = makeSymbol("*COMMANDER-DEBUG-LEVEL*");

    // defparameter
    public static final SubLSymbol $commander_pre_processors$ = makeSymbol("*COMMANDER-PRE-PROCESSORS*");

    // defparameter
    public static final SubLSymbol $commander_processors$ = makeSymbol("*COMMANDER-PROCESSORS*");

    // defparameter
    public static final SubLSymbol $commander_output_processors$ = makeSymbol("*COMMANDER-OUTPUT-PROCESSORS*");

    // defparameter
    public static final SubLSymbol $commander_end_session_functions$ = makeSymbol("*COMMANDER-END-SESSION-FUNCTIONS*");

    // defparameter
    public static final SubLSymbol $commander_cleanup_functions$ = makeSymbol("*COMMANDER-CLEANUP-FUNCTIONS*");













    private static final SubLList $list0 = list(makeSymbol("LEVEL"), makeSymbol("STRING"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));



    private static final SubLSymbol $sym2$__ = makeSymbol(">=");

    private static final SubLList $list3 = list(makeSymbol("COMMANDER-DEBUG-LEVEL"));





    private static final SubLList $list6 = list(cons(makeString("bella"), makeSymbol("BELLA-PRE-PROCESS-INPUT")));

    private static final SubLList $list7 = list(cons(makeString("bella"), makeSymbol("BELLA-PROCESS-INPUT")));

    private static final SubLList $list8 = list(cons(makeString("bella"), makeSymbol("BELLA-PICKUP-OUTPUT")));

    private static final SubLList $list9 = list(cons(makeString("bella"), makeSymbol("BELLA-END-SESSION")));

    private static final SubLList $list10 = list(cons(makeString("bella"), makeSymbol("BELLA-CLEANUP-AFTER-SESSION-ENDS")));

    private static final SubLSymbol COMMANDER_PICKUP_OUTPUT_DEFAULT = makeSymbol("COMMANDER-PICKUP-OUTPUT-DEFAULT");



    private static final SubLSymbol $SESSION_ID = makeKeyword("SESSION-ID");

    private static final SubLList $list14 = cons(makeSymbol("OLD"), makeSymbol("NEW"));



    private static final SubLSymbol ENCODE_KEYWORD_AS_JSON_KEY = makeSymbol("ENCODE-KEYWORD-AS-JSON-KEY");

    private static final SubLObject $$TheList = reader_make_constant_shell(makeString("TheList"));

    private static final SubLSymbol $commander_input_processor_threads$ = makeSymbol("*COMMANDER-INPUT-PROCESSOR-THREADS*");

    private static final SubLSymbol $commander_current_tasks$ = makeSymbol("*COMMANDER-CURRENT-TASKS*");

    private static final SubLSymbol $commander_input_queues$ = makeSymbol("*COMMANDER-INPUT-QUEUES*");

    private static final SubLSymbol $commander_input_queue_lock$ = makeSymbol("*COMMANDER-INPUT-QUEUE-LOCK*");

    private static final SubLString $str22$commander_input_queue_lock = makeString("commander-input-queue-lock");

    private static final SubLSymbol $commander_input_queue_semaphores$ = makeSymbol("*COMMANDER-INPUT-QUEUE-SEMAPHORES*");

    private static final SubLSymbol $commander_output_queues$ = makeSymbol("*COMMANDER-OUTPUT-QUEUES*");

    private static final SubLSymbol $PROCESSOR = makeKeyword("PROCESSOR");



    private static final SubLList $list27 = list(makeSymbol("SESSION"), makeSymbol("MESSAGE"));

    private static final SubLString $str28$Commander_Task_for__S_______S__ = makeString("Commander Task for ~S~% -> ~S~%");

    private static final SubLSymbol COMMANDER_RECEIVE_UI_INPUT = makeSymbol("COMMANDER-RECEIVE-UI-INPUT");



    private static final SubLString $$$delete = makeString("delete");



    private static final SubLString $$$currentSession = makeString("currentSession");

    private static final SubLSymbol IPC_QUEUE_P = makeSymbol("IPC-QUEUE-P");

    private static final SubLString $$$input_semaphore_for_ = makeString("input semaphore for ");

    private static final SubLSymbol SEMAPHORE_P = makeSymbol("SEMAPHORE-P");

    private static final SubLString $$$Commander_processor_for_session_ = makeString("Commander processor for session ");

    private static final SubLSymbol COMMANDER_PROCESS_INPUT_LOOP = makeSymbol("COMMANDER-PROCESS-INPUT-LOOP");



    private static final SubLSymbol PICK_UP_UI_OUTPUT = makeSymbol("PICK-UP-UI-OUTPUT");

    public static SubLObject commander_debug_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $commander_debug_level$.getDynamicValue(thread);
    }

    public static SubLObject commander_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        level = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        return list(PWHEN, list($sym2$__, $list3, level), listS(WARN, string, append(v_arguments, NIL)));
    }

    public static SubLObject set_commander_debug_level(final SubLObject num) {
        assert NIL != integerp(num) : "Types.integerp(num) " + "CommonSymbols.NIL != Types.integerp(num) " + num;
        $commander_debug_level$.setDynamicValue(num);
        return NIL;
    }

    public static SubLObject commander_get_processor_func(final SubLObject processor_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup($commander_processors$.getDynamicValue(thread), processor_name, EQUAL, UNPROVIDED);
    }

    public static SubLObject commander_get_pre_processor_func(final SubLObject processor_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup($commander_pre_processors$.getDynamicValue(thread), processor_name, EQUAL, UNPROVIDED);
    }

    public static SubLObject commander_get_output_processor_func(final SubLObject processor_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup($commander_output_processors$.getDynamicValue(thread), processor_name, EQUAL, COMMANDER_PICKUP_OUTPUT_DEFAULT);
    }

    public static SubLObject commander_get_end_session_func(final SubLObject processor_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup($commander_end_session_functions$.getDynamicValue(thread), processor_name, EQUAL, UNPROVIDED);
    }

    public static SubLObject commander_get_cleanup_func(final SubLObject processor_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup($commander_cleanup_functions$.getDynamicValue(thread), processor_name, EQUAL, UNPROVIDED);
    }

    public static SubLObject session_id_from_message(final SubLObject message) {
        return NIL != getf(message, $SESSION, UNPROVIDED) ? getf(message, $SESSION, UNPROVIDED) : getf(message, $SESSION_ID, UNPROVIDED);
    }

    public static SubLObject get_query_results_with_substitutions(final SubLObject query_spec, final SubLObject subst_alist) {
        SubLObject sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject mt = kb_query.kbq_mt(query_spec);
        final SubLObject props = inference_strategist.implicify_inference_mode_defaults(inference_parameters.explicify_inference_engine_query_property_defaults(kb_query.kbq_query_properties(query_spec)));
        SubLObject cdolist_list_var = subst_alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject old = NIL;
            SubLObject v_new = NIL;
            destructuring_bind_must_consp(current, datum, $list14);
            old = current.first();
            current = v_new = current.rest();
            sentence = cycl_utilities.expression_subst(v_new, old, sentence, symbol_function(EQUAL), UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return inference_kernel.new_cyc_query(sentence, mt, props);
    }

    public static SubLObject convert_keywords_to_json_keys(final SubLObject l) {
        return cycl_utilities.expression_transform(l, KEYWORDP, ENCODE_KEYWORD_AS_JSON_KEY, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject encode_json_key_as_keyword(final SubLObject str) {
        SubLObject keyword_chars = NIL;
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = end_var_$1 = length(str), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$1); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(str, char_num);
            if (NIL != upper_case_p(v_char)) {
                keyword_chars = cons(CHAR_hyphen, keyword_chars);
            }
            keyword_chars = cons(v_char, keyword_chars);
        }
        return cycl_variables.make_keyword_var(string_utilities.char_list_to_string(nreverse(keyword_chars)));
    }

    public static SubLObject encode_keyword_as_json_key(final SubLObject k) {
        SubLObject json_chars = NIL;
        SubLObject next_char_is_upper_caseP = NIL;
        final SubLObject string_var = symbol_name(k);
        SubLObject end_var_$2;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = end_var_$2 = length(string_var), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$2); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string_var, char_num);
            if (v_char.eql(CHAR_hyphen)) {
                next_char_is_upper_caseP = T;
            } else
                if (NIL != next_char_is_upper_caseP) {
                    json_chars = cons(char_upcase(v_char), json_chars);
                    next_char_is_upper_caseP = NIL;
                } else {
                    json_chars = cons(char_downcase(v_char), json_chars);
                }

        }
        return string_utilities.char_list_to_string(nreverse(json_chars));
    }

    public static SubLObject encode_for_plist_value(final SubLObject obj) {
        if ((NIL == cycl_grammar.cycl_formula_p(obj)) || (NIL == kb_utilities.kbeq(cycl_utilities.formula_arg0(obj), $$TheList))) {
            return obj;
        }
        return cycl_utilities.formula_args(obj, UNPROVIDED);
    }

    public static SubLObject commander_note_thread_dead(final SubLObject session_id) {
        map_utilities.map_remove($commander_input_processor_threads$.getGlobalValue(), session_id);
        return NIL;
    }

    public static SubLObject commander_process_input_loop(final SubLObject session_id) {
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            final SubLObject queue = map_utilities.map_get($commander_input_queues$.getGlobalValue(), session_id, NIL);
            final SubLObject message = process_utilities.ipc_dequeue(queue, UNPROVIDED);
            final SubLObject processor_name = list_utilities.plist_lookup(message, $PROCESSOR, UNPROVIDED);
            final SubLObject processor = commander_get_processor_func(processor_name);
            if (NIL != commander_end_session_message_p(message)) {
                commander_end_session(session_id, message);
                commander_clean_up_after_session_ends(message);
                doneP = T;
            } else {
                commander_note_current_task(session_id, message);
                try {
                    funcall(processor, session_id, message);
                } finally {
                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values = getValuesAsVector();
                        commander_note_task_complete(session_id, message);
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        } 
        commander_note_thread_dead(session_id);
        return NIL;
    }

    public static SubLObject commander_testing_message_p(final SubLObject message) {
        return makeBoolean((NIL != list_utilities.proper_list_p(message)) && getf(message, $TEST, UNPROVIDED).equal(T));
    }

    public static SubLObject commander_note_current_task(final SubLObject session_id, final SubLObject message) {
        return map_utilities.map_put($commander_current_tasks$.getGlobalValue(), session_id, message);
    }

    public static SubLObject commander_note_task_complete(final SubLObject session_id, final SubLObject message) {
        return map_utilities.map_remove($commander_current_tasks$.getGlobalValue(), session_id);
    }

    public static SubLObject display_current_commander_tasks() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator($commander_current_tasks$.getGlobalValue());
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject session = NIL;
                SubLObject message = NIL;
                destructuring_bind_must_consp(current, datum, $list27);
                session = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list27);
                message = current.first();
                current = current.rest();
                if (NIL == current) {
                    format(T, $str28$Commander_Task_for__S_______S__, session, message);
                } else {
                    cdestructuring_bind_error(datum, $list27);
                }
            }
        }
        return NIL;
    }

    public static SubLObject commander_receive_ui_input(final SubLObject messages) {
        final SubLObject session_id = session_id_from_message(messages.first());
        ensure_output_queue_for_session(session_id);
        SubLObject cdolist_list_var = messages;
        SubLObject message = NIL;
        message = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pre_processed_message = commander_preprocess_input(message);
            commander_enqueue_ui_input(session_id, pre_processed_message);
            cdolist_list_var = cdolist_list_var.rest();
            message = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject commander_preprocess_input(SubLObject message) {
        final SubLObject processor_name = getf(message, $PROCESSOR, UNPROVIDED);
        final SubLObject preprocessor_func = commander_get_pre_processor_func(processor_name);
        if (NIL != preprocessor_func) {
            message = funcall(preprocessor_func, message);
        }
        return message;
    }

    public static SubLObject commander_end_session_message_p(final SubLObject message) {
        return makeBoolean(getf(message, $ACTION, UNPROVIDED).equal($$$delete) && getf(message, $TYPE, UNPROVIDED).equal($$$currentSession));
    }

    public static SubLObject commander_enqueue_ui_input(final SubLObject session_id, final SubLObject ui_input) {
        ensure_session_processing_ready(session_id);
        process_utilities.ipc_enqueue(ui_input, map_utilities.map_get($commander_input_queues$.getGlobalValue(), session_id, UNPROVIDED), UNPROVIDED);
        return NIL;
    }

    public static SubLObject get_next_ui_input(final SubLObject session_id) {
        note_ui_input_in_process(session_id);
        final SubLObject ui_input = process_utilities.ipc_dequeue(map_utilities.map_get($commander_input_queues$.getGlobalValue(), session_id, UNPROVIDED), UNPROVIDED);
        return ui_input;
    }

    public static SubLObject is_ui_data_waitingP(final SubLObject session_id) {
        return numG(process_utilities.ipc_current_queue_size(map_utilities.map_get($commander_input_queues$.getGlobalValue(), session_id, UNPROVIDED)), ZERO_INTEGER);
    }

    public static SubLObject is_ui_input_being_processedP(final SubLObject session_id) {
        return numG(Semaphores.semaphore_current_count(map_utilities.map_get($commander_input_queue_semaphores$.getGlobalValue(), session_id, UNPROVIDED)), ZERO_INTEGER);
    }

    public static SubLObject note_ui_input_in_process(final SubLObject session_id) {
        Semaphores.semaphore_wait(map_utilities.map_get($commander_input_queue_semaphores$.getGlobalValue(), session_id, UNPROVIDED));
        return NIL;
    }

    public static SubLObject note_ui_input_processed(final SubLObject session_id) {
        Semaphores.semaphore_signal(map_utilities.map_get($commander_input_queue_semaphores$.getGlobalValue(), session_id, UNPROVIDED));
        return NIL;
    }

    public static SubLObject ensure_session_processing_ready(final SubLObject session_id) {
        map_utilities.map_put_unless($commander_input_queues$.getGlobalValue(), session_id, process_utilities.new_ipc_queue(session_id), IPC_QUEUE_P);
        map_utilities.map_put_unless($commander_input_queue_semaphores$.getGlobalValue(), session_id, Semaphores.new_semaphore(cconcatenate($$$input_semaphore_for_, format_nil.format_nil_s_no_copy(session_id)), UNPROVIDED), SEMAPHORE_P);
        SubLObject release = NIL;
        try {
            release = seize_lock($commander_input_queue_lock$.getGlobalValue());
            if (NIL == valid_process_p(map_utilities.map_get($commander_input_processor_threads$.getGlobalValue(), session_id, UNPROVIDED))) {
                map_utilities.map_put($commander_input_processor_threads$.getGlobalValue(), session_id, process_utilities.make_cyc_server_process_with_args(cconcatenate($$$Commander_processor_for_session_, format_nil.format_nil_s_no_copy(session_id)), COMMANDER_PROCESS_INPUT_LOOP, list(session_id)));
            }
        } finally {
            if (NIL != release) {
                release_lock($commander_input_queue_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject remove_input_queue_for_session(final SubLObject session_id) {
        map_utilities.map_remove($commander_input_queues$.getGlobalValue(), session_id);
        map_utilities.map_remove($commander_input_queue_semaphores$.getGlobalValue(), session_id);
        return NIL;
    }

    public static SubLObject clear_commander_queues() {
        $commander_output_queues$.setGlobalValue(dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED));
        $commander_input_queues$.setGlobalValue(dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED));
        $commander_input_queue_semaphores$.setGlobalValue(dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED));
        $commander_current_tasks$.setGlobalValue(dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED));
        if (NIL != dictionary_utilities.synchronized_dictionary_p($commander_input_processor_threads$.getGlobalValue())) {
            SubLObject cdolist_list_var = dictionary_utilities.synchronized_dictionary_values($commander_input_processor_threads$.getGlobalValue());
            SubLObject thread = NIL;
            thread = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != valid_process_p(thread)) {
                    kill_process(thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                thread = cdolist_list_var.first();
            } 
        }
        $commander_input_processor_threads$.setGlobalValue(dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return $DONE;
    }

    public static SubLObject queue_output(final SubLObject session_id, final SubLObject output) {
        ensure_output_queue_for_session(session_id);
        final SubLObject queue = map_utilities.map_get($commander_output_queues$.getGlobalValue(), session_id, NIL);
        process_utilities.ipc_enqueue(output, queue, UNPROVIDED);
        return NIL;
    }

    public static SubLObject queue_messages(final SubLObject session_id, final SubLObject output_list) {
        SubLObject cdolist_list_var = output_list;
        SubLObject message = NIL;
        message = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            queue_output(session_id, message);
            cdolist_list_var = cdolist_list_var.rest();
            message = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pick_up_ui_output(final SubLObject session_id, SubLObject processor_name) {
        if (processor_name == UNPROVIDED) {
            processor_name = NIL;
        }
        ensure_output_queue_for_session(session_id);
        final SubLObject queue = map_utilities.map_get($commander_output_queues$.getGlobalValue(), session_id, UNPROVIDED);
        final SubLObject output_processor = commander_get_output_processor_func(processor_name);
        final SubLObject message = funcall(output_processor, session_id, queue);
        if (NIL != commander_end_session_message_p(message)) {
            commander_clean_up_after_session_ends(message);
        }
        return message;
    }

    public static SubLObject commander_end_session(final SubLObject session_id, final SubLObject self_destruct_message) {
        final SubLObject queue = map_utilities.map_get($commander_output_queues$.getGlobalValue(), session_id, UNPROVIDED);
        final SubLObject end_session_func = commander_get_end_session_func(getf(self_destruct_message, $PROCESSOR, UNPROVIDED));
        process_utilities.ipc_drain(queue, UNPROVIDED);
        process_utilities.ipc_enqueue(self_destruct_message, queue, UNPROVIDED);
        funcall(end_session_func, session_id, self_destruct_message);
        return NIL;
    }

    public static SubLObject commander_clean_up_after_session_ends(final SubLObject message) {
        final SubLObject session_id = session_id_from_message(message);
        final SubLObject cleanup_func = commander_get_cleanup_func(getf(message, $PROCESSOR, UNPROVIDED));
        remove_output_queue_for_session(session_id);
        remove_input_queue_for_session(session_id);
        if (NIL != cleanup_func) {
            funcall(cleanup_func, message);
        }
        return NIL;
    }

    public static SubLObject ensure_output_queue_for_session(final SubLObject session_id) {
        map_utilities.map_put_unless($commander_output_queues$.getGlobalValue(), session_id, process_utilities.new_ipc_queue(session_id), IPC_QUEUE_P);
        return NIL;
    }

    public static SubLObject remove_output_queue_for_session(final SubLObject session_id) {
        map_utilities.map_remove($commander_output_queues$.getGlobalValue(), session_id);
        return NIL;
    }

    public static SubLObject commander_pickup_output_default(final SubLObject session_id, final SubLObject queue) {
        final SubLObject message = process_utilities.ipc_dequeue(queue, UNPROVIDED);
        return message;
    }

    public static SubLObject declare_commander_file() {
        declareFunction("commander_debug_level", "COMMANDER-DEBUG-LEVEL", 0, 0, false);
        declareMacro("commander_warn", "COMMANDER-WARN");
        declareFunction("set_commander_debug_level", "SET-COMMANDER-DEBUG-LEVEL", 1, 0, false);
        declareFunction("commander_get_processor_func", "COMMANDER-GET-PROCESSOR-FUNC", 1, 0, false);
        declareFunction("commander_get_pre_processor_func", "COMMANDER-GET-PRE-PROCESSOR-FUNC", 1, 0, false);
        declareFunction("commander_get_output_processor_func", "COMMANDER-GET-OUTPUT-PROCESSOR-FUNC", 1, 0, false);
        declareFunction("commander_get_end_session_func", "COMMANDER-GET-END-SESSION-FUNC", 1, 0, false);
        declareFunction("commander_get_cleanup_func", "COMMANDER-GET-CLEANUP-FUNC", 1, 0, false);
        declareFunction("session_id_from_message", "SESSION-ID-FROM-MESSAGE", 1, 0, false);
        declareFunction("get_query_results_with_substitutions", "GET-QUERY-RESULTS-WITH-SUBSTITUTIONS", 2, 0, false);
        declareFunction("convert_keywords_to_json_keys", "CONVERT-KEYWORDS-TO-JSON-KEYS", 1, 0, false);
        declareFunction("encode_json_key_as_keyword", "ENCODE-JSON-KEY-AS-KEYWORD", 1, 0, false);
        declareFunction("encode_keyword_as_json_key", "ENCODE-KEYWORD-AS-JSON-KEY", 1, 0, false);
        declareFunction("encode_for_plist_value", "ENCODE-FOR-PLIST-VALUE", 1, 0, false);
        declareFunction("commander_note_thread_dead", "COMMANDER-NOTE-THREAD-DEAD", 1, 0, false);
        declareFunction("commander_process_input_loop", "COMMANDER-PROCESS-INPUT-LOOP", 1, 0, false);
        declareFunction("commander_testing_message_p", "COMMANDER-TESTING-MESSAGE-P", 1, 0, false);
        declareFunction("commander_note_current_task", "COMMANDER-NOTE-CURRENT-TASK", 2, 0, false);
        declareFunction("commander_note_task_complete", "COMMANDER-NOTE-TASK-COMPLETE", 2, 0, false);
        declareFunction("display_current_commander_tasks", "DISPLAY-CURRENT-COMMANDER-TASKS", 0, 0, false);
        declareFunction("commander_receive_ui_input", "COMMANDER-RECEIVE-UI-INPUT", 1, 0, false);
        declareFunction("commander_preprocess_input", "COMMANDER-PREPROCESS-INPUT", 1, 0, false);
        declareFunction("commander_end_session_message_p", "COMMANDER-END-SESSION-MESSAGE-P", 1, 0, false);
        declareFunction("commander_enqueue_ui_input", "COMMANDER-ENQUEUE-UI-INPUT", 2, 0, false);
        declareFunction("get_next_ui_input", "GET-NEXT-UI-INPUT", 1, 0, false);
        declareFunction("is_ui_data_waitingP", "IS-UI-DATA-WAITING?", 1, 0, false);
        declareFunction("is_ui_input_being_processedP", "IS-UI-INPUT-BEING-PROCESSED?", 1, 0, false);
        declareFunction("note_ui_input_in_process", "NOTE-UI-INPUT-IN-PROCESS", 1, 0, false);
        declareFunction("note_ui_input_processed", "NOTE-UI-INPUT-PROCESSED", 1, 0, false);
        declareFunction("ensure_session_processing_ready", "ENSURE-SESSION-PROCESSING-READY", 1, 0, false);
        declareFunction("remove_input_queue_for_session", "REMOVE-INPUT-QUEUE-FOR-SESSION", 1, 0, false);
        declareFunction("clear_commander_queues", "CLEAR-COMMANDER-QUEUES", 0, 0, false);
        declareFunction("queue_output", "QUEUE-OUTPUT", 2, 0, false);
        declareFunction("queue_messages", "QUEUE-MESSAGES", 2, 0, false);
        declareFunction("pick_up_ui_output", "PICK-UP-UI-OUTPUT", 1, 1, false);
        declareFunction("commander_end_session", "COMMANDER-END-SESSION", 2, 0, false);
        declareFunction("commander_clean_up_after_session_ends", "COMMANDER-CLEAN-UP-AFTER-SESSION-ENDS", 1, 0, false);
        declareFunction("ensure_output_queue_for_session", "ENSURE-OUTPUT-QUEUE-FOR-SESSION", 1, 0, false);
        declareFunction("remove_output_queue_for_session", "REMOVE-OUTPUT-QUEUE-FOR-SESSION", 1, 0, false);
        declareFunction("commander_pickup_output_default", "COMMANDER-PICKUP-OUTPUT-DEFAULT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_commander_file() {
        defparameter("*COMMANDER-DEBUG-LEVEL*", ZERO_INTEGER);
        defparameter("*COMMANDER-PRE-PROCESSORS*", $list6);
        defparameter("*COMMANDER-PROCESSORS*", $list7);
        defparameter("*COMMANDER-OUTPUT-PROCESSORS*", $list8);
        defparameter("*COMMANDER-END-SESSION-FUNCTIONS*", $list9);
        defparameter("*COMMANDER-CLEANUP-FUNCTIONS*", $list10);
        deflexical("*COMMANDER-INPUT-PROCESSOR-THREADS*", SubLTrampolineFile.maybeDefault($commander_input_processor_threads$, $commander_input_processor_threads$, () -> dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*COMMANDER-CURRENT-TASKS*", SubLTrampolineFile.maybeDefault($commander_current_tasks$, $commander_current_tasks$, () -> dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*COMMANDER-INPUT-QUEUES*", SubLTrampolineFile.maybeDefault($commander_input_queues$, $commander_input_queues$, () -> dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*COMMANDER-INPUT-QUEUE-LOCK*", SubLTrampolineFile.maybeDefault($commander_input_queue_lock$, $commander_input_queue_lock$, () -> make_lock($str22$commander_input_queue_lock)));
        deflexical("*COMMANDER-INPUT-QUEUE-SEMAPHORES*", SubLTrampolineFile.maybeDefault($commander_input_queue_semaphores$, $commander_input_queue_semaphores$, () -> dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*COMMANDER-OUTPUT-QUEUES*", SubLTrampolineFile.maybeDefault($commander_output_queues$, $commander_output_queues$, () -> dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_commander_file() {
        declare_defglobal($commander_input_processor_threads$);
        declare_defglobal($commander_current_tasks$);
        declare_defglobal($commander_input_queues$);
        declare_defglobal($commander_input_queue_lock$);
        declare_defglobal($commander_input_queue_semaphores$);
        declare_defglobal($commander_output_queues$);
        register_external_symbol(COMMANDER_RECEIVE_UI_INPUT);
        register_external_symbol(PICK_UP_UI_OUTPUT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_commander_file();
    }

    @Override
    public void initializeVariables() {
        init_commander_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_commander_file();
    }

    static {






















































    }
}

/**
 * Total time: 229 ms
 */
