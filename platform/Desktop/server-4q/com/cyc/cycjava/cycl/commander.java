package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class commander extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.commander";
    public static final String myFingerPrint = "fa71981f6520e974075d1d50f6c9b0cc464454eaae42b3de3a94da91c32b4b76";
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 914L)
    public static SubLSymbol $commander_debug_level$;
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 3561L)
    public static SubLSymbol $commander_pre_processors$;
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 3937L)
    public static SubLSymbol $commander_processors$;
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 4133L)
    public static SubLSymbol $commander_output_processors$;
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 4357L)
    public static SubLSymbol $commander_end_session_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 4634L)
    public static SubLSymbol $commander_cleanup_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 7551L)
    private static SubLSymbol $commander_input_processor_threads$;
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 7924L)
    private static SubLSymbol $commander_current_tasks$;
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 8126L)
    private static SubLSymbol $commander_input_queues$;
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 8321L)
    private static SubLSymbol $commander_input_queue_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 8412L)
    private static SubLSymbol $commander_input_queue_semaphores$;
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 8726L)
    private static SubLSymbol $commander_output_queues$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PWHEN;
    private static final SubLSymbol $sym2$__;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$WARN;
    private static final SubLSymbol $sym5$INTEGERP;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$COMMANDER_PICKUP_OUTPUT_DEFAULT;
    private static final SubLSymbol $kw12$SESSION;
    private static final SubLSymbol $kw13$SESSION_ID;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$KEYWORDP;
    private static final SubLSymbol $sym16$ENCODE_KEYWORD_AS_JSON_KEY;
    private static final SubLObject $const17$TheList;
    private static final SubLSymbol $sym18$_COMMANDER_INPUT_PROCESSOR_THREADS_;
    private static final SubLSymbol $sym19$_COMMANDER_CURRENT_TASKS_;
    private static final SubLSymbol $sym20$_COMMANDER_INPUT_QUEUES_;
    private static final SubLSymbol $sym21$_COMMANDER_INPUT_QUEUE_LOCK_;
    private static final SubLString $str22$commander_input_queue_lock;
    private static final SubLSymbol $sym23$_COMMANDER_INPUT_QUEUE_SEMAPHORES_;
    private static final SubLSymbol $sym24$_COMMANDER_OUTPUT_QUEUES_;
    private static final SubLSymbol $kw25$PROCESSOR;
    private static final SubLSymbol $kw26$TEST;
    private static final SubLList $list27;
    private static final SubLString $str28$Commander_Task_for__S_______S__;
    private static final SubLSymbol $sym29$COMMANDER_RECEIVE_UI_INPUT;
    private static final SubLSymbol $kw30$ACTION;
    private static final SubLString $str31$delete;
    private static final SubLSymbol $kw32$TYPE;
    private static final SubLString $str33$currentSession;
    private static final SubLSymbol $sym34$IPC_QUEUE_P;
    private static final SubLString $str35$input_semaphore_for_;
    private static final SubLSymbol $sym36$SEMAPHORE_P;
    private static final SubLString $str37$Commander_processor_for_session_;
    private static final SubLSymbol $sym38$COMMANDER_PROCESS_INPUT_LOOP;
    private static final SubLSymbol $kw39$DONE;
    private static final SubLSymbol $sym40$PICK_UP_UI_OUTPUT;
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 3224L)
    public static SubLObject commander_debug_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return commander.$commander_debug_level$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 3301L)
    public static SubLObject commander_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)commander.NIL;
        SubLObject string = (SubLObject)commander.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)commander.$list0);
        level = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)commander.$list0);
        string = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)commander.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)commander.$sym2$__, (SubLObject)commander.$list3, level), (SubLObject)ConsesLow.listS((SubLObject)commander.$sym4$WARN, string, ConsesLow.append(v_arguments, (SubLObject)commander.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 3443L)
    public static SubLObject set_commander_debug_level(final SubLObject num) {
        assert commander.NIL != Types.integerp(num) : num;
        commander.$commander_debug_level$.setDynamicValue(num);
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 4845L)
    public static SubLObject commander_get_processor_func(final SubLObject processor_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup(commander.$commander_processors$.getDynamicValue(thread), processor_name, (SubLObject)commander.EQUAL, (SubLObject)commander.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 4977L)
    public static SubLObject commander_get_pre_processor_func(final SubLObject processor_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup(commander.$commander_pre_processors$.getDynamicValue(thread), processor_name, (SubLObject)commander.EQUAL, (SubLObject)commander.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 5117L)
    public static SubLObject commander_get_output_processor_func(final SubLObject processor_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup(commander.$commander_output_processors$.getDynamicValue(thread), processor_name, (SubLObject)commander.EQUAL, (SubLObject)commander.$sym11$COMMANDER_PICKUP_OUTPUT_DEFAULT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 5296L)
    public static SubLObject commander_get_end_session_func(final SubLObject processor_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup(commander.$commander_end_session_functions$.getDynamicValue(thread), processor_name, (SubLObject)commander.EQUAL, (SubLObject)commander.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 5442L)
    public static SubLObject commander_get_cleanup_func(final SubLObject processor_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup(commander.$commander_cleanup_functions$.getDynamicValue(thread), processor_name, (SubLObject)commander.EQUAL, (SubLObject)commander.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 5580L)
    public static SubLObject session_id_from_message(final SubLObject message) {
        return (commander.NIL != conses_high.getf(message, (SubLObject)commander.$kw12$SESSION, (SubLObject)commander.UNPROVIDED)) ? conses_high.getf(message, (SubLObject)commander.$kw12$SESSION, (SubLObject)commander.UNPROVIDED) : conses_high.getf(message, (SubLObject)commander.$kw13$SESSION_ID, (SubLObject)commander.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 5767L)
    public static SubLObject get_query_results_with_substitutions(final SubLObject query_spec, final SubLObject subst_alist) {
        SubLObject sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject mt = kb_query.kbq_mt(query_spec);
        final SubLObject props = inference_strategist.implicify_inference_mode_defaults(inference_parameters.explicify_inference_engine_query_property_defaults(kb_query.kbq_query_properties(query_spec)));
        SubLObject cdolist_list_var = subst_alist;
        SubLObject cons = (SubLObject)commander.NIL;
        cons = cdolist_list_var.first();
        while (commander.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject old = (SubLObject)commander.NIL;
            SubLObject v_new = (SubLObject)commander.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)commander.$list14);
            old = current.first();
            current = (v_new = current.rest());
            sentence = cycl_utilities.expression_subst(v_new, old, sentence, Symbols.symbol_function((SubLObject)commander.EQUAL), (SubLObject)commander.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return inference_kernel.new_cyc_query(sentence, mt, props);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 6454L)
    public static SubLObject convert_keywords_to_json_keys(final SubLObject l) {
        return cycl_utilities.expression_transform(l, (SubLObject)commander.$sym15$KEYWORDP, (SubLObject)commander.$sym16$ENCODE_KEYWORD_AS_JSON_KEY, (SubLObject)commander.UNPROVIDED, (SubLObject)commander.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 6662L)
    public static SubLObject encode_json_key_as_keyword(final SubLObject str) {
        SubLObject keyword_chars = (SubLObject)commander.NIL;
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = (end_var_$1 = Sequences.length(str)), char_num = (SubLObject)commander.NIL, char_num = (SubLObject)commander.ZERO_INTEGER; !char_num.numGE(end_var_$1); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(str, char_num);
            if (commander.NIL != Characters.upper_case_p(v_char)) {
                keyword_chars = (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_hyphen, keyword_chars);
            }
            keyword_chars = (SubLObject)ConsesLow.cons(v_char, keyword_chars);
        }
        return cycl_variables.make_keyword_var(string_utilities.char_list_to_string(Sequences.nreverse(keyword_chars)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 6939L)
    public static SubLObject encode_keyword_as_json_key(final SubLObject k) {
        SubLObject json_chars = (SubLObject)commander.NIL;
        SubLObject next_char_is_upper_caseP = (SubLObject)commander.NIL;
        final SubLObject string_var = Symbols.symbol_name(k);
        SubLObject end_var_$2;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = (end_var_$2 = Sequences.length(string_var)), char_num = (SubLObject)commander.NIL, char_num = (SubLObject)commander.ZERO_INTEGER; !char_num.numGE(end_var_$2); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string_var, char_num);
            if (v_char.eql((SubLObject)Characters.CHAR_hyphen)) {
                next_char_is_upper_caseP = (SubLObject)commander.T;
            }
            else if (commander.NIL != next_char_is_upper_caseP) {
                json_chars = (SubLObject)ConsesLow.cons(Characters.char_upcase(v_char), json_chars);
                next_char_is_upper_caseP = (SubLObject)commander.NIL;
            }
            else {
                json_chars = (SubLObject)ConsesLow.cons(Characters.char_downcase(v_char), json_chars);
            }
        }
        return string_utilities.char_list_to_string(Sequences.nreverse(json_chars));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 7385L)
    public static SubLObject encode_for_plist_value(final SubLObject obj) {
        if (commander.NIL == cycl_grammar.cycl_formula_p(obj) || commander.NIL == kb_utilities.kbeq(cycl_utilities.formula_arg0(obj), commander.$const17$TheList)) {
            return obj;
        }
        return cycl_utilities.formula_args(obj, (SubLObject)commander.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 8938L)
    public static SubLObject commander_note_thread_dead(final SubLObject session_id) {
        map_utilities.map_remove(commander.$commander_input_processor_threads$.getGlobalValue(), session_id);
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 9157L)
    public static SubLObject commander_process_input_loop(final SubLObject session_id) {
        SubLObject doneP = (SubLObject)commander.NIL;
        while (commander.NIL == doneP) {
            final SubLObject queue = map_utilities.map_get(commander.$commander_input_queues$.getGlobalValue(), session_id, (SubLObject)commander.NIL);
            final SubLObject message = process_utilities.ipc_dequeue(queue, (SubLObject)commander.UNPROVIDED);
            final SubLObject processor_name = list_utilities.plist_lookup(message, (SubLObject)commander.$kw25$PROCESSOR, (SubLObject)commander.UNPROVIDED);
            final SubLObject processor = commander_get_processor_func(processor_name);
            if (commander.NIL != commander_end_session_message_p(message)) {
                commander_end_session(session_id, message);
                commander_clean_up_after_session_ends(message);
                doneP = (SubLObject)commander.T;
            }
            else {
                commander_note_current_task(session_id, message);
                try {
                    Functions.funcall(processor, session_id, message);
                }
                finally {
                    final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)commander.T);
                        final SubLObject _values = Values.getValuesAsVector();
                        commander_note_task_complete(session_id, message);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        commander_note_thread_dead(session_id);
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 9994L)
    public static SubLObject commander_testing_message_p(final SubLObject message) {
        return (SubLObject)SubLObjectFactory.makeBoolean(commander.NIL != list_utilities.proper_list_p(message) && conses_high.getf(message, (SubLObject)commander.$kw26$TEST, (SubLObject)commander.UNPROVIDED).equal((SubLObject)commander.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 10127L)
    public static SubLObject commander_note_current_task(final SubLObject session_id, final SubLObject message) {
        return map_utilities.map_put(commander.$commander_current_tasks$.getGlobalValue(), session_id, message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 10257L)
    public static SubLObject commander_note_task_complete(final SubLObject session_id, final SubLObject message) {
        return map_utilities.map_remove(commander.$commander_current_tasks$.getGlobalValue(), session_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 10402L)
    public static SubLObject display_current_commander_tasks() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator(commander.$commander_current_tasks$.getGlobalValue());
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)commander.NIL; commander.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(commander.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (commander.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject session = (SubLObject)commander.NIL;
                SubLObject message = (SubLObject)commander.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)commander.$list27);
                session = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)commander.$list27);
                message = current.first();
                current = current.rest();
                if (commander.NIL == current) {
                    PrintLow.format((SubLObject)commander.T, (SubLObject)commander.$str28$Commander_Task_for__S_______S__, session, message);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)commander.$list27);
                }
            }
        }
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 10575L)
    public static SubLObject commander_receive_ui_input(final SubLObject messages) {
        final SubLObject session_id = session_id_from_message(messages.first());
        ensure_output_queue_for_session(session_id);
        SubLObject cdolist_list_var = messages;
        SubLObject message = (SubLObject)commander.NIL;
        message = cdolist_list_var.first();
        while (commander.NIL != cdolist_list_var) {
            final SubLObject pre_processed_message = commander_preprocess_input(message);
            commander_enqueue_ui_input(session_id, pre_processed_message);
            cdolist_list_var = cdolist_list_var.rest();
            message = cdolist_list_var.first();
        }
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 11146L)
    public static SubLObject commander_preprocess_input(SubLObject message) {
        final SubLObject processor_name = conses_high.getf(message, (SubLObject)commander.$kw25$PROCESSOR, (SubLObject)commander.UNPROVIDED);
        final SubLObject preprocessor_func = commander_get_pre_processor_func(processor_name);
        if (commander.NIL != preprocessor_func) {
            message = Functions.funcall(preprocessor_func, message);
        }
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 11434L)
    public static SubLObject commander_end_session_message_p(final SubLObject message) {
        return (SubLObject)SubLObjectFactory.makeBoolean(conses_high.getf(message, (SubLObject)commander.$kw30$ACTION, (SubLObject)commander.UNPROVIDED).equal((SubLObject)commander.$str31$delete) && conses_high.getf(message, (SubLObject)commander.$kw32$TYPE, (SubLObject)commander.UNPROVIDED).equal((SubLObject)commander.$str33$currentSession));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 11603L)
    public static SubLObject commander_enqueue_ui_input(final SubLObject session_id, final SubLObject ui_input) {
        ensure_session_processing_ready(session_id);
        process_utilities.ipc_enqueue(ui_input, map_utilities.map_get(commander.$commander_input_queues$.getGlobalValue(), session_id, (SubLObject)commander.UNPROVIDED), (SubLObject)commander.UNPROVIDED);
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 11800L)
    public static SubLObject get_next_ui_input(final SubLObject session_id) {
        note_ui_input_in_process(session_id);
        final SubLObject ui_input = process_utilities.ipc_dequeue(map_utilities.map_get(commander.$commander_input_queues$.getGlobalValue(), session_id, (SubLObject)commander.UNPROVIDED), (SubLObject)commander.UNPROVIDED);
        return ui_input;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 12090L)
    public static SubLObject is_ui_data_waitingP(final SubLObject session_id) {
        return Numbers.numG(process_utilities.ipc_current_queue_size(map_utilities.map_get(commander.$commander_input_queues$.getGlobalValue(), session_id, (SubLObject)commander.UNPROVIDED)), (SubLObject)commander.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 12304L)
    public static SubLObject is_ui_input_being_processedP(final SubLObject session_id) {
        return Numbers.numG(Semaphores.semaphore_current_count(map_utilities.map_get(commander.$commander_input_queue_semaphores$.getGlobalValue(), session_id, (SubLObject)commander.UNPROVIDED)), (SubLObject)commander.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 12460L)
    public static SubLObject note_ui_input_in_process(final SubLObject session_id) {
        Semaphores.semaphore_wait(map_utilities.map_get(commander.$commander_input_queue_semaphores$.getGlobalValue(), session_id, (SubLObject)commander.UNPROVIDED));
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 12623L)
    public static SubLObject note_ui_input_processed(final SubLObject session_id) {
        Semaphores.semaphore_signal(map_utilities.map_get(commander.$commander_input_queue_semaphores$.getGlobalValue(), session_id, (SubLObject)commander.UNPROVIDED));
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 12790L)
    public static SubLObject ensure_session_processing_ready(final SubLObject session_id) {
        map_utilities.map_put_unless(commander.$commander_input_queues$.getGlobalValue(), session_id, process_utilities.new_ipc_queue(session_id), (SubLObject)commander.$sym34$IPC_QUEUE_P);
        map_utilities.map_put_unless(commander.$commander_input_queue_semaphores$.getGlobalValue(), session_id, Semaphores.new_semaphore(Sequences.cconcatenate((SubLObject)commander.$str35$input_semaphore_for_, format_nil.format_nil_s_no_copy(session_id)), (SubLObject)commander.UNPROVIDED), (SubLObject)commander.$sym36$SEMAPHORE_P);
        SubLObject release = (SubLObject)commander.NIL;
        try {
            release = Locks.seize_lock(commander.$commander_input_queue_lock$.getGlobalValue());
            if (commander.NIL == Threads.valid_process_p(map_utilities.map_get(commander.$commander_input_processor_threads$.getGlobalValue(), session_id, (SubLObject)commander.UNPROVIDED))) {
                map_utilities.map_put(commander.$commander_input_processor_threads$.getGlobalValue(), session_id, process_utilities.make_cyc_server_process_with_args(Sequences.cconcatenate((SubLObject)commander.$str37$Commander_processor_for_session_, format_nil.format_nil_s_no_copy(session_id)), (SubLObject)commander.$sym38$COMMANDER_PROCESS_INPUT_LOOP, (SubLObject)ConsesLow.list(session_id)));
            }
        }
        finally {
            if (commander.NIL != release) {
                Locks.release_lock(commander.$commander_input_queue_lock$.getGlobalValue());
            }
        }
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 13492L)
    public static SubLObject remove_input_queue_for_session(final SubLObject session_id) {
        map_utilities.map_remove(commander.$commander_input_queues$.getGlobalValue(), session_id);
        map_utilities.map_remove(commander.$commander_input_queue_semaphores$.getGlobalValue(), session_id);
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 13679L)
    public static SubLObject clear_commander_queues() {
        commander.$commander_output_queues$.setGlobalValue(dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)commander.EQUAL), (SubLObject)commander.UNPROVIDED));
        commander.$commander_input_queues$.setGlobalValue(dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)commander.EQUAL), (SubLObject)commander.UNPROVIDED));
        commander.$commander_input_queue_semaphores$.setGlobalValue(dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)commander.EQUAL), (SubLObject)commander.UNPROVIDED));
        commander.$commander_current_tasks$.setGlobalValue(dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)commander.EQUAL), (SubLObject)commander.UNPROVIDED));
        if (commander.NIL != dictionary_utilities.synchronized_dictionary_p(commander.$commander_input_processor_threads$.getGlobalValue())) {
            SubLObject cdolist_list_var = dictionary_utilities.synchronized_dictionary_values(commander.$commander_input_processor_threads$.getGlobalValue());
            SubLObject thread = (SubLObject)commander.NIL;
            thread = cdolist_list_var.first();
            while (commander.NIL != cdolist_list_var) {
                if (commander.NIL != Threads.valid_process_p(thread)) {
                    Threads.kill_process(thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                thread = cdolist_list_var.first();
            }
        }
        commander.$commander_input_processor_threads$.setGlobalValue(dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)commander.EQUAL), (SubLObject)commander.UNPROVIDED));
        return (SubLObject)commander.$kw39$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 14582L)
    public static SubLObject queue_output(final SubLObject session_id, final SubLObject output) {
        ensure_output_queue_for_session(session_id);
        final SubLObject queue = map_utilities.map_get(commander.$commander_output_queues$.getGlobalValue(), session_id, (SubLObject)commander.NIL);
        process_utilities.ipc_enqueue(output, queue, (SubLObject)commander.UNPROVIDED);
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 14852L)
    public static SubLObject queue_messages(final SubLObject session_id, final SubLObject output_list) {
        SubLObject cdolist_list_var = output_list;
        SubLObject message = (SubLObject)commander.NIL;
        message = cdolist_list_var.first();
        while (commander.NIL != cdolist_list_var) {
            queue_output(session_id, message);
            cdolist_list_var = cdolist_list_var.rest();
            message = cdolist_list_var.first();
        }
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 15041L)
    public static SubLObject pick_up_ui_output(final SubLObject session_id, SubLObject processor_name) {
        if (processor_name == commander.UNPROVIDED) {
            processor_name = (SubLObject)commander.NIL;
        }
        ensure_output_queue_for_session(session_id);
        final SubLObject queue = map_utilities.map_get(commander.$commander_output_queues$.getGlobalValue(), session_id, (SubLObject)commander.UNPROVIDED);
        final SubLObject output_processor = commander_get_output_processor_func(processor_name);
        final SubLObject message = Functions.funcall(output_processor, session_id, queue);
        if (commander.NIL != commander_end_session_message_p(message)) {
            commander_clean_up_after_session_ends(message);
        }
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 15665L)
    public static SubLObject commander_end_session(final SubLObject session_id, final SubLObject self_destruct_message) {
        final SubLObject queue = map_utilities.map_get(commander.$commander_output_queues$.getGlobalValue(), session_id, (SubLObject)commander.UNPROVIDED);
        final SubLObject end_session_func = commander_get_end_session_func(conses_high.getf(self_destruct_message, (SubLObject)commander.$kw25$PROCESSOR, (SubLObject)commander.UNPROVIDED));
        process_utilities.ipc_drain(queue, (SubLObject)commander.UNPROVIDED);
        process_utilities.ipc_enqueue(self_destruct_message, queue, (SubLObject)commander.UNPROVIDED);
        Functions.funcall(end_session_func, session_id, self_destruct_message);
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 16211L)
    public static SubLObject commander_clean_up_after_session_ends(final SubLObject message) {
        final SubLObject session_id = session_id_from_message(message);
        final SubLObject cleanup_func = commander_get_cleanup_func(conses_high.getf(message, (SubLObject)commander.$kw25$PROCESSOR, (SubLObject)commander.UNPROVIDED));
        remove_output_queue_for_session(session_id);
        remove_input_queue_for_session(session_id);
        if (commander.NIL != cleanup_func) {
            Functions.funcall(cleanup_func, message);
        }
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 16707L)
    public static SubLObject ensure_output_queue_for_session(final SubLObject session_id) {
        map_utilities.map_put_unless(commander.$commander_output_queues$.getGlobalValue(), session_id, process_utilities.new_ipc_queue(session_id), (SubLObject)commander.$sym34$IPC_QUEUE_P);
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 16880L)
    public static SubLObject remove_output_queue_for_session(final SubLObject session_id) {
        map_utilities.map_remove(commander.$commander_output_queues$.getGlobalValue(), session_id);
        return (SubLObject)commander.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/commander.lisp", position = 17007L)
    public static SubLObject commander_pickup_output_default(final SubLObject session_id, final SubLObject queue) {
        final SubLObject message = process_utilities.ipc_dequeue(queue, (SubLObject)commander.UNPROVIDED);
        return message;
    }
    
    public static SubLObject declare_commander_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_debug_level", "COMMANDER-DEBUG-LEVEL", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.commander", "commander_warn", "COMMANDER-WARN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "set_commander_debug_level", "SET-COMMANDER-DEBUG-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_get_processor_func", "COMMANDER-GET-PROCESSOR-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_get_pre_processor_func", "COMMANDER-GET-PRE-PROCESSOR-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_get_output_processor_func", "COMMANDER-GET-OUTPUT-PROCESSOR-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_get_end_session_func", "COMMANDER-GET-END-SESSION-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_get_cleanup_func", "COMMANDER-GET-CLEANUP-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "session_id_from_message", "SESSION-ID-FROM-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "get_query_results_with_substitutions", "GET-QUERY-RESULTS-WITH-SUBSTITUTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "convert_keywords_to_json_keys", "CONVERT-KEYWORDS-TO-JSON-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "encode_json_key_as_keyword", "ENCODE-JSON-KEY-AS-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "encode_keyword_as_json_key", "ENCODE-KEYWORD-AS-JSON-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "encode_for_plist_value", "ENCODE-FOR-PLIST-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_note_thread_dead", "COMMANDER-NOTE-THREAD-DEAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_process_input_loop", "COMMANDER-PROCESS-INPUT-LOOP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_testing_message_p", "COMMANDER-TESTING-MESSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_note_current_task", "COMMANDER-NOTE-CURRENT-TASK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_note_task_complete", "COMMANDER-NOTE-TASK-COMPLETE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "display_current_commander_tasks", "DISPLAY-CURRENT-COMMANDER-TASKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_receive_ui_input", "COMMANDER-RECEIVE-UI-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_preprocess_input", "COMMANDER-PREPROCESS-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_end_session_message_p", "COMMANDER-END-SESSION-MESSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_enqueue_ui_input", "COMMANDER-ENQUEUE-UI-INPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "get_next_ui_input", "GET-NEXT-UI-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "is_ui_data_waitingP", "IS-UI-DATA-WAITING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "is_ui_input_being_processedP", "IS-UI-INPUT-BEING-PROCESSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "note_ui_input_in_process", "NOTE-UI-INPUT-IN-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "note_ui_input_processed", "NOTE-UI-INPUT-PROCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "ensure_session_processing_ready", "ENSURE-SESSION-PROCESSING-READY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "remove_input_queue_for_session", "REMOVE-INPUT-QUEUE-FOR-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "clear_commander_queues", "CLEAR-COMMANDER-QUEUES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "queue_output", "QUEUE-OUTPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "queue_messages", "QUEUE-MESSAGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "pick_up_ui_output", "PICK-UP-UI-OUTPUT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_end_session", "COMMANDER-END-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_clean_up_after_session_ends", "COMMANDER-CLEAN-UP-AFTER-SESSION-ENDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "ensure_output_queue_for_session", "ENSURE-OUTPUT-QUEUE-FOR-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "remove_output_queue_for_session", "REMOVE-OUTPUT-QUEUE-FOR-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.commander", "commander_pickup_output_default", "COMMANDER-PICKUP-OUTPUT-DEFAULT", 2, 0, false);
        return (SubLObject)commander.NIL;
    }
    
    public static SubLObject init_commander_file() {
        commander.$commander_debug_level$ = SubLFiles.defparameter("*COMMANDER-DEBUG-LEVEL*", (SubLObject)commander.ZERO_INTEGER);
        commander.$commander_pre_processors$ = SubLFiles.defparameter("*COMMANDER-PRE-PROCESSORS*", (SubLObject)commander.$list6);
        commander.$commander_processors$ = SubLFiles.defparameter("*COMMANDER-PROCESSORS*", (SubLObject)commander.$list7);
        commander.$commander_output_processors$ = SubLFiles.defparameter("*COMMANDER-OUTPUT-PROCESSORS*", (SubLObject)commander.$list8);
        commander.$commander_end_session_functions$ = SubLFiles.defparameter("*COMMANDER-END-SESSION-FUNCTIONS*", (SubLObject)commander.$list9);
        commander.$commander_cleanup_functions$ = SubLFiles.defparameter("*COMMANDER-CLEANUP-FUNCTIONS*", (SubLObject)commander.$list10);
        commander.$commander_input_processor_threads$ = SubLFiles.deflexical("*COMMANDER-INPUT-PROCESSOR-THREADS*", maybeDefault((SubLObject)commander.$sym18$_COMMANDER_INPUT_PROCESSOR_THREADS_, commander.$commander_input_processor_threads$, ()->(dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)commander.EQUAL), (SubLObject)commander.UNPROVIDED))));
        commander.$commander_current_tasks$ = SubLFiles.deflexical("*COMMANDER-CURRENT-TASKS*", maybeDefault((SubLObject)commander.$sym19$_COMMANDER_CURRENT_TASKS_, commander.$commander_current_tasks$, ()->(dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)commander.EQUAL), (SubLObject)commander.UNPROVIDED))));
        commander.$commander_input_queues$ = SubLFiles.deflexical("*COMMANDER-INPUT-QUEUES*", maybeDefault((SubLObject)commander.$sym20$_COMMANDER_INPUT_QUEUES_, commander.$commander_input_queues$, ()->(dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)commander.EQUAL), (SubLObject)commander.UNPROVIDED))));
        commander.$commander_input_queue_lock$ = SubLFiles.deflexical("*COMMANDER-INPUT-QUEUE-LOCK*", maybeDefault((SubLObject)commander.$sym21$_COMMANDER_INPUT_QUEUE_LOCK_, commander.$commander_input_queue_lock$, ()->(Locks.make_lock((SubLObject)commander.$str22$commander_input_queue_lock))));
        commander.$commander_input_queue_semaphores$ = SubLFiles.deflexical("*COMMANDER-INPUT-QUEUE-SEMAPHORES*", maybeDefault((SubLObject)commander.$sym23$_COMMANDER_INPUT_QUEUE_SEMAPHORES_, commander.$commander_input_queue_semaphores$, ()->(dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)commander.EQUAL), (SubLObject)commander.UNPROVIDED))));
        commander.$commander_output_queues$ = SubLFiles.deflexical("*COMMANDER-OUTPUT-QUEUES*", maybeDefault((SubLObject)commander.$sym24$_COMMANDER_OUTPUT_QUEUES_, commander.$commander_output_queues$, ()->(dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)commander.EQUAL), (SubLObject)commander.UNPROVIDED))));
        return (SubLObject)commander.NIL;
    }
    
    public static SubLObject setup_commander_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)commander.$sym18$_COMMANDER_INPUT_PROCESSOR_THREADS_);
        subl_macro_promotions.declare_defglobal((SubLObject)commander.$sym19$_COMMANDER_CURRENT_TASKS_);
        subl_macro_promotions.declare_defglobal((SubLObject)commander.$sym20$_COMMANDER_INPUT_QUEUES_);
        subl_macro_promotions.declare_defglobal((SubLObject)commander.$sym21$_COMMANDER_INPUT_QUEUE_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)commander.$sym23$_COMMANDER_INPUT_QUEUE_SEMAPHORES_);
        subl_macro_promotions.declare_defglobal((SubLObject)commander.$sym24$_COMMANDER_OUTPUT_QUEUES_);
        access_macros.register_external_symbol((SubLObject)commander.$sym29$COMMANDER_RECEIVE_UI_INPUT);
        access_macros.register_external_symbol((SubLObject)commander.$sym40$PICK_UP_UI_OUTPUT);
        return (SubLObject)commander.NIL;
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
        me = (SubLFile)new commander();
        commander.$commander_debug_level$ = null;
        commander.$commander_pre_processors$ = null;
        commander.$commander_processors$ = null;
        commander.$commander_output_processors$ = null;
        commander.$commander_end_session_functions$ = null;
        commander.$commander_cleanup_functions$ = null;
        commander.$commander_input_processor_threads$ = null;
        commander.$commander_current_tasks$ = null;
        commander.$commander_input_queues$ = null;
        commander.$commander_input_queue_lock$ = null;
        commander.$commander_input_queue_semaphores$ = null;
        commander.$commander_output_queues$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENTS"));
        $sym1$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym2$__ = SubLObjectFactory.makeSymbol(">=");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMMANDER-DEBUG-LEVEL"));
        $sym4$WARN = SubLObjectFactory.makeSymbol("WARN");
        $sym5$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("bella"), (SubLObject)SubLObjectFactory.makeSymbol("BELLA-PRE-PROCESS-INPUT")));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("bella"), (SubLObject)SubLObjectFactory.makeSymbol("BELLA-PROCESS-INPUT")));
        $list8 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("bella"), (SubLObject)SubLObjectFactory.makeSymbol("BELLA-PICKUP-OUTPUT")));
        $list9 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("bella"), (SubLObject)SubLObjectFactory.makeSymbol("BELLA-END-SESSION")));
        $list10 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("bella"), (SubLObject)SubLObjectFactory.makeSymbol("BELLA-CLEANUP-AFTER-SESSION-ENDS")));
        $sym11$COMMANDER_PICKUP_OUTPUT_DEFAULT = SubLObjectFactory.makeSymbol("COMMANDER-PICKUP-OUTPUT-DEFAULT");
        $kw12$SESSION = SubLObjectFactory.makeKeyword("SESSION");
        $kw13$SESSION_ID = SubLObjectFactory.makeKeyword("SESSION-ID");
        $list14 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OLD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW"));
        $sym15$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym16$ENCODE_KEYWORD_AS_JSON_KEY = SubLObjectFactory.makeSymbol("ENCODE-KEYWORD-AS-JSON-KEY");
        $const17$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $sym18$_COMMANDER_INPUT_PROCESSOR_THREADS_ = SubLObjectFactory.makeSymbol("*COMMANDER-INPUT-PROCESSOR-THREADS*");
        $sym19$_COMMANDER_CURRENT_TASKS_ = SubLObjectFactory.makeSymbol("*COMMANDER-CURRENT-TASKS*");
        $sym20$_COMMANDER_INPUT_QUEUES_ = SubLObjectFactory.makeSymbol("*COMMANDER-INPUT-QUEUES*");
        $sym21$_COMMANDER_INPUT_QUEUE_LOCK_ = SubLObjectFactory.makeSymbol("*COMMANDER-INPUT-QUEUE-LOCK*");
        $str22$commander_input_queue_lock = SubLObjectFactory.makeString("commander-input-queue-lock");
        $sym23$_COMMANDER_INPUT_QUEUE_SEMAPHORES_ = SubLObjectFactory.makeSymbol("*COMMANDER-INPUT-QUEUE-SEMAPHORES*");
        $sym24$_COMMANDER_OUTPUT_QUEUES_ = SubLObjectFactory.makeSymbol("*COMMANDER-OUTPUT-QUEUES*");
        $kw25$PROCESSOR = SubLObjectFactory.makeKeyword("PROCESSOR");
        $kw26$TEST = SubLObjectFactory.makeKeyword("TEST");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SESSION"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"));
        $str28$Commander_Task_for__S_______S__ = SubLObjectFactory.makeString("Commander Task for ~S~% -> ~S~%");
        $sym29$COMMANDER_RECEIVE_UI_INPUT = SubLObjectFactory.makeSymbol("COMMANDER-RECEIVE-UI-INPUT");
        $kw30$ACTION = SubLObjectFactory.makeKeyword("ACTION");
        $str31$delete = SubLObjectFactory.makeString("delete");
        $kw32$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $str33$currentSession = SubLObjectFactory.makeString("currentSession");
        $sym34$IPC_QUEUE_P = SubLObjectFactory.makeSymbol("IPC-QUEUE-P");
        $str35$input_semaphore_for_ = SubLObjectFactory.makeString("input semaphore for ");
        $sym36$SEMAPHORE_P = SubLObjectFactory.makeSymbol("SEMAPHORE-P");
        $str37$Commander_processor_for_session_ = SubLObjectFactory.makeString("Commander processor for session ");
        $sym38$COMMANDER_PROCESS_INPUT_LOOP = SubLObjectFactory.makeSymbol("COMMANDER-PROCESS-INPUT-LOOP");
        $kw39$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym40$PICK_UP_UI_OUTPUT = SubLObjectFactory.makeSymbol("PICK-UP-UI-OUTPUT");
    }
}

/*

	Total time: 229 ms
	
*/