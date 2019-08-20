/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-IO-STREAM-MONITOR
 *  source file: /cyc/top/cycl/cyblack/cyblack-io-stream-monitor.lisp
 *  created:     2019/07/03 17:38:49
 */
public final class cyblack_io_stream_monitor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_io_stream_monitor() {
    }

    public static final SubLFile me = new cyblack_io_stream_monitor();


    // // Definitions
    public static final SubLObject with_cyblack_io_stream_monitor(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject monitor = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    monitor = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($cyblack_io_stream_monitor$, monitor)), body);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject stop_io_stream_monitor() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread)) {
                methods.funcall_instance_method_with_1_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), SET_ACTIVE, NIL);
            }
            return NIL;
        }
    }

    public static final SubLObject start_io_stream_monitor() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread)) {
                methods.funcall_instance_method_with_1_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), SET_ACTIVE, T);
            }
            return T;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_spawn_connection() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_application.$cyblack_application$.getDynamicValue(thread)) {
                if (NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread)) {
                    {
                        SubLObject application_id = cyblack_application.cyblack_application_get_application_id(cyblack_application.$cyblack_application$.getDynamicValue(thread));
                        if (NIL != instances.instance_of_p(cyblack_application.$cyblack_application$.getDynamicValue(thread), CYBLACK_UNIPROCESS_DEFAPP_BASE)) {
                            {
                                SubLObject internal_to_external_increment_process = object.new_class_instance(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT);
                                SubLObject external_to_internal_increment_process = object.new_class_instance(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT);
                                SubLObject blackboard_connection_increment_process = object.new_class_instance(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT);
                                methods.funcall_instance_method_with_1_args(cyblack_application.$cyblack_application$.getDynamicValue(thread), ADD_PROCESS, internal_to_external_increment_process);
                                methods.funcall_instance_method_with_1_args(cyblack_application.$cyblack_application$.getDynamicValue(thread), ADD_PROCESS, external_to_internal_increment_process);
                                methods.funcall_instance_method_with_1_args(cyblack_application.$cyblack_application$.getDynamicValue(thread), ADD_PROCESS, blackboard_connection_increment_process);
                            }
                        } else {
                            cyblack_processes.cyblack_make_process(application_id, $str_alt9$CYBLACK_IO_STREAM_INTERNAL_TO_EXT, CYBLACK_IO_STREAM_MONITOR_INTERNAL_TO_EXTERNAL_PROCESS);
                            cyblack_processes.cyblack_make_process(application_id, $str_alt11$CYBLACK_IO_STREAM_EXTERNAL_TO_INT, CYBLACK_IO_STREAM_MONITOR_EXTERNAL_TO_INTERNAL_PROCESS);
                            cyblack_processes.cyblack_make_process(application_id, $str_alt13$CYBLACK_IO_STREAM_MONITOR_CONNECT, CYBLACK_IO_STREAM_MONITOR_BLACKBOARD_CONNECTION_PROCESS);
                        }
                    }
                } else {
                    Errors.warn($str_alt15$No_binding_to__cyblack_io_stream_);
                }
            } else {
                Errors.warn($str_alt16$No_binding_to__cyblack_applicatio);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_internal_to_external_process() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), INTERNAL_TO_EXTERNAL_PROCESS);
            return NIL;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_external_to_internal_process() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), EXTERNAL_TO_INTERNAL_PROCESS);
            return NIL;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_blackboard_connection_process() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), BLACKBOARD_CONNECTION_PROCESS);
            return NIL;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_toplevel() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_application.$cyblack_application$.getDynamicValue(thread)) {
                if (NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread)) {
                    cyblack_io_stream_monitor_loop();
                } else {
                    Errors.warn($str_alt15$No_binding_to__cyblack_io_stream_);
                }
            } else {
                Errors.warn($str_alt16$No_binding_to__cyblack_applicatio);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_loop() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != instances.instance_of_p(cyblack_application.$cyblack_application$.getDynamicValue(thread), CYBLACK_UNIPROCESS_DEFAPP_BASE)) {
                {
                    SubLObject application_id = (NIL != cyblack_application.$cyblack_application$.getDynamicValue(thread)) ? ((SubLObject) (cyblack_application.cyblack_application_get_application_id(cyblack_application.$cyblack_application$.getDynamicValue(thread)))) : NIL;
                    SubLObject process = object.new_class_instance(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT);
                    if (NIL != application_id) {
                        cyblack_processes.cyblack_make_process(application_id, $str_alt21$CYBLACK_IO_STREAM_MONITOR_INPUT_L, CYBLACK_IO_STREAM_MONITOR_INPUT_LOOP);
                        methods.funcall_instance_method_with_1_args(cyblack_application.$cyblack_application$.getDynamicValue(thread), ADD_PROCESS, process);
                    } else {
                        make_process($str_alt21$CYBLACK_IO_STREAM_MONITOR_INPUT_L, CYBLACK_IO_STREAM_MONITOR_INPUT_LOOP);
                        methods.funcall_instance_method_with_1_args(cyblack_application.$cyblack_application$.getDynamicValue(thread), ADD_PROCESS, process);
                    }
                }
            } else {
                {
                    SubLObject application_id = (NIL != cyblack_application.$cyblack_application$.getDynamicValue(thread)) ? ((SubLObject) (cyblack_application.cyblack_application_get_application_id(cyblack_application.$cyblack_application$.getDynamicValue(thread)))) : NIL;
                    if (NIL != application_id) {
                        cyblack_processes.cyblack_make_process(application_id, $str_alt21$CYBLACK_IO_STREAM_MONITOR_INPUT_L, CYBLACK_IO_STREAM_MONITOR_INPUT_LOOP);
                        cyblack_processes.cyblack_make_process(application_id, $str_alt23$CYBLACK_IO_STREAM_MONITOR_OUTPUT_, CYBLACK_IO_STREAM_MONITOR_OUTPUT_LOOP);
                    } else {
                        make_process($str_alt21$CYBLACK_IO_STREAM_MONITOR_INPUT_L, CYBLACK_IO_STREAM_MONITOR_INPUT_LOOP);
                        make_process($str_alt23$CYBLACK_IO_STREAM_MONITOR_OUTPUT_, CYBLACK_IO_STREAM_MONITOR_OUTPUT_LOOP);
                    }
                    return NIL;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_input_loop() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject input = NIL;
                SubLObject output_stream = methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), GET_OUTPUT_STREAM);
                SubLObject normal_prompt = methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), GET_NORMAL_PROMPT);
                while ((NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread)) && (NIL != methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), IS_ACTIVE))) {
                    format(output_stream, normal_prompt);
                    force_output(output_stream);
                    input = methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), READ_RAW);
                    methods.funcall_instance_method_with_1_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), ADD_INCOMING_RAW, input);
                } 
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_output_loop() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output = NIL;
                while ((NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread)) && (NIL != methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), IS_ACTIVE))) {
                    output = methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), GET_OUTGOING_RAW);
                    if (NIL != output) {
                        methods.funcall_instance_method_with_1_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), WRITE_RAW, output);
                    }
                    if (NIL == output) {
                        sleep($float$0_1);
                    }
                } 
            }
            return NIL;
        }
    }

    public static final SubLObject get_cyblack_io_stream_monitor_posting_to_raw_function(SubLObject v_cyblack_io_stream_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_io_stream_monitor, TWENTY_INTEGER, POSTING_TO_RAW_FUNCTION);
    }

    public static final SubLObject set_cyblack_io_stream_monitor_posting_to_raw_function(SubLObject v_cyblack_io_stream_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_io_stream_monitor, value, TWENTY_INTEGER, POSTING_TO_RAW_FUNCTION);
    }

    public static final SubLObject get_cyblack_io_stream_monitor_raw_to_posting_function(SubLObject v_cyblack_io_stream_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_io_stream_monitor, NINETEEN_INTEGER, RAW_TO_POSTING_FUNCTION);
    }

    public static final SubLObject set_cyblack_io_stream_monitor_raw_to_posting_function(SubLObject v_cyblack_io_stream_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_io_stream_monitor, value, NINETEEN_INTEGER, RAW_TO_POSTING_FUNCTION);
    }

    public static final SubLObject get_cyblack_io_stream_monitor_default_error_prompt(SubLObject v_cyblack_io_stream_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_io_stream_monitor, EIGHTEEN_INTEGER, DEFAULT_ERROR_PROMPT);
    }

    public static final SubLObject set_cyblack_io_stream_monitor_default_error_prompt(SubLObject v_cyblack_io_stream_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_io_stream_monitor, value, EIGHTEEN_INTEGER, DEFAULT_ERROR_PROMPT);
    }

    public static final SubLObject get_cyblack_io_stream_monitor_normal_prompt(SubLObject v_cyblack_io_stream_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_io_stream_monitor, SEVENTEEN_INTEGER, NORMAL_PROMPT);
    }

    public static final SubLObject set_cyblack_io_stream_monitor_normal_prompt(SubLObject v_cyblack_io_stream_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_io_stream_monitor, value, SEVENTEEN_INTEGER, NORMAL_PROMPT);
    }

    public static final SubLObject get_cyblack_io_stream_monitor_output_stream(SubLObject v_cyblack_io_stream_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_io_stream_monitor, SIXTEEN_INTEGER, OUTPUT_STREAM);
    }

    public static final SubLObject set_cyblack_io_stream_monitor_output_stream(SubLObject v_cyblack_io_stream_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_io_stream_monitor, value, SIXTEEN_INTEGER, OUTPUT_STREAM);
    }

    public static final SubLObject get_cyblack_io_stream_monitor_input_stream(SubLObject v_cyblack_io_stream_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_io_stream_monitor, FIFTEEN_INTEGER, INPUT_STREAM);
    }

    public static final SubLObject set_cyblack_io_stream_monitor_input_stream(SubLObject v_cyblack_io_stream_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_io_stream_monitor, value, FIFTEEN_INTEGER, INPUT_STREAM);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_io_stream_monitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_io_stream_monitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_MONITOR, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_MONITOR, PANEL_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_MONITOR, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, INCOMING_RAW_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, OUTGOING_RAW_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, INCOMING_POSTING_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, OUTGOING_POSTING_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, SPAWN_CONNECTION_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, INCOMING_SLEEP_INTERVAL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, OUTGOING_SLEEP_INTERVAL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, BLACKBOARD_CONNECTION_SLEEP_INTERVAL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_IO_STREAM_MONITOR, INPUT_STREAM, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_IO_STREAM_MONITOR, OUTPUT_STREAM, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_IO_STREAM_MONITOR, NORMAL_PROMPT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_IO_STREAM_MONITOR, DEFAULT_ERROR_PROMPT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_IO_STREAM_MONITOR, RAW_TO_POSTING_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_IO_STREAM_MONITOR, POSTING_TO_RAW_FUNCTION, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_io_stream_monitor_p(SubLObject v_cyblack_io_stream_monitor) {
        return classes.subloop_instanceof_class(v_cyblack_io_stream_monitor, CYBLACK_IO_STREAM_MONITOR);
    }

    public static final SubLObject cyblack_io_stream_monitor_initialize_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
                SubLObject posting_to_raw_function = get_cyblack_io_stream_monitor_posting_to_raw_function(self);
                SubLObject raw_to_posting_function = get_cyblack_io_stream_monitor_raw_to_posting_function(self);
                SubLObject default_error_prompt = get_cyblack_io_stream_monitor_default_error_prompt(self);
                SubLObject normal_prompt = get_cyblack_io_stream_monitor_normal_prompt(self);
                SubLObject output_stream = get_cyblack_io_stream_monitor_output_stream(self);
                SubLObject input_stream = get_cyblack_io_stream_monitor_input_stream(self);
                SubLObject spawn_connection_function = cyblack_ui_monitor.get_cyblack_internal_ui_monitor_spawn_connection_function(self);
                try {
                    try {
                        cyblack_ui_monitor.cyblack_internal_ui_monitor_initialize_method(self);
                        input_stream = cyblack_globals.$cyblack_io_stream_monitor_default_input$.getDynamicValue(thread);
                        output_stream = cyblack_globals.$cyblack_io_stream_monitor_default_output$.getDynamicValue(thread);
                        normal_prompt = $str_alt70$__VirB3___;
                        default_error_prompt = $str_alt71$__Unable_to_process_input___Pleas;
                        spawn_connection_function = CYBLACK_IO_STREAM_MONITOR_SPAWN_CONNECTION;
                        raw_to_posting_function = NIL;
                        posting_to_raw_function = NIL;
                        sublisp_throw($sym69$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_io_stream_monitor_posting_to_raw_function(self, posting_to_raw_function);
                                set_cyblack_io_stream_monitor_raw_to_posting_function(self, raw_to_posting_function);
                                set_cyblack_io_stream_monitor_default_error_prompt(self, default_error_prompt);
                                set_cyblack_io_stream_monitor_normal_prompt(self, normal_prompt);
                                set_cyblack_io_stream_monitor_output_stream(self, output_stream);
                                set_cyblack_io_stream_monitor_input_stream(self, input_stream);
                                cyblack_ui_monitor.set_cyblack_internal_ui_monitor_spawn_connection_function(self, spawn_connection_function);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
                }
                return catch_var_for_cyblack_io_stream_monitor_method;
            }
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_spawn_connection_method(SubLObject self) {
        cyblack_globals.$cyblack_io_stream_monitor$.setDynamicValue(self);
        return cyblack_ui_monitor.cyblack_internal_ui_monitor_spawn_connection_method(self);
    }

    public static final SubLObject cyblack_io_stream_monitor_get_input_stream_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject input_stream = get_cyblack_io_stream_monitor_input_stream(self);
            try {
                try {
                    sublisp_throw($sym80$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, input_stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_input_stream(self, input_stream);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym80$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_set_input_stream_method(SubLObject self, SubLObject new_input_stream) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject input_stream = get_cyblack_io_stream_monitor_input_stream(self);
            try {
                try {
                    input_stream = new_input_stream;
                    sublisp_throw($sym85$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, new_input_stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_input_stream(self, input_stream);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym85$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_get_output_stream_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject output_stream = get_cyblack_io_stream_monitor_output_stream(self);
            try {
                try {
                    sublisp_throw($sym88$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, output_stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_output_stream(self, output_stream);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym88$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_set_output_stream_method(SubLObject self, SubLObject new_output_stream) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject output_stream = get_cyblack_io_stream_monitor_output_stream(self);
            try {
                try {
                    output_stream = new_output_stream;
                    sublisp_throw($sym93$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, new_output_stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_output_stream(self, output_stream);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym93$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_get_normal_prompt_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject normal_prompt = get_cyblack_io_stream_monitor_normal_prompt(self);
            try {
                try {
                    sublisp_throw($sym96$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, normal_prompt);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_normal_prompt(self, normal_prompt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym96$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_set_normal_prompt_method(SubLObject self, SubLObject new_normal_prompt) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject normal_prompt = get_cyblack_io_stream_monitor_normal_prompt(self);
            try {
                try {
                    normal_prompt = new_normal_prompt;
                    sublisp_throw($sym101$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, new_normal_prompt);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_normal_prompt(self, normal_prompt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_get_default_error_prompt_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject default_error_prompt = get_cyblack_io_stream_monitor_default_error_prompt(self);
            try {
                try {
                    sublisp_throw($sym105$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, default_error_prompt);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_default_error_prompt(self, default_error_prompt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_set_default_error_prompt_method(SubLObject self, SubLObject new_default_error_prompt) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject default_error_prompt = get_cyblack_io_stream_monitor_default_error_prompt(self);
            try {
                try {
                    default_error_prompt = new_default_error_prompt;
                    sublisp_throw($sym110$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, new_default_error_prompt);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_default_error_prompt(self, default_error_prompt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym110$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_get_raw_to_posting_function_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject raw_to_posting_function = get_cyblack_io_stream_monitor_raw_to_posting_function(self);
            try {
                try {
                    sublisp_throw($sym114$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, raw_to_posting_function);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_raw_to_posting_function(self, raw_to_posting_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym114$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_set_raw_to_posting_function_method(SubLObject self, SubLObject new_raw_to_posting_function) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject raw_to_posting_function = get_cyblack_io_stream_monitor_raw_to_posting_function(self);
            try {
                try {
                    if (NIL == symbol_function(new_raw_to_posting_function)) {
                        Errors.warn($str_alt120$_SET_RAW_TO_POSTING_FUNCTION__S__, self, new_raw_to_posting_function);
                    }
                    raw_to_posting_function = new_raw_to_posting_function;
                    sublisp_throw($sym119$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, raw_to_posting_function);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_raw_to_posting_function(self, raw_to_posting_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym119$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_get_posting_to_raw_function_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject raw_to_posting_function = get_cyblack_io_stream_monitor_raw_to_posting_function(self);
            try {
                try {
                    sublisp_throw($sym123$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, raw_to_posting_function);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_raw_to_posting_function(self, raw_to_posting_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym123$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_set_posting_to_raw_function_method(SubLObject self, SubLObject new_posting_to_raw_function) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject posting_to_raw_function = get_cyblack_io_stream_monitor_posting_to_raw_function(self);
            try {
                try {
                    if (NIL == symbol_function(new_posting_to_raw_function)) {
                        Errors.warn($str_alt129$_SET_POSTING_TO_RAW_FUNCTION__S__, self, new_posting_to_raw_function);
                    }
                    posting_to_raw_function = new_posting_to_raw_function;
                    sublisp_throw($sym128$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, posting_to_raw_function);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_posting_to_raw_function(self, posting_to_raw_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_raw_to_posting_method(SubLObject self, SubLObject v_object) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject raw_to_posting_function = get_cyblack_io_stream_monitor_raw_to_posting_function(self);
            try {
                try {
                    if (NIL != raw_to_posting_function) {
                        sublisp_throw($sym134$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, funcall(raw_to_posting_function, v_object));
                    }
                    sublisp_throw($sym134$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_raw_to_posting_function(self, raw_to_posting_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym134$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_posting_to_raw_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_method = NIL;
            SubLObject posting_to_raw_function = get_cyblack_io_stream_monitor_posting_to_raw_function(self);
            try {
                try {
                    if (NIL != posting_to_raw_function) {
                        sublisp_throw($sym139$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, funcall(posting_to_raw_function, posting));
                    }
                    sublisp_throw($sym139$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_posting_to_raw_function(self, posting_to_raw_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym139$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_read_raw_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_io_stream_monitor_write_raw_method(SubLObject self, SubLObject v_object) {
        return NIL;
    }

    public static final SubLObject declare_cyblack_io_stream_monitor_file() {
        declareMacro("with_cyblack_io_stream_monitor", "WITH-CYBLACK-IO-STREAM-MONITOR");
        declareFunction("stop_io_stream_monitor", "STOP-IO-STREAM-MONITOR", 0, 0, false);
        declareFunction("start_io_stream_monitor", "START-IO-STREAM-MONITOR", 0, 0, false);
        declareFunction("cyblack_io_stream_monitor_spawn_connection", "CYBLACK-IO-STREAM-MONITOR-SPAWN-CONNECTION", 0, 0, false);
        declareFunction("cyblack_io_stream_monitor_internal_to_external_process", "CYBLACK-IO-STREAM-MONITOR-INTERNAL-TO-EXTERNAL-PROCESS", 0, 0, false);
        declareFunction("cyblack_io_stream_monitor_external_to_internal_process", "CYBLACK-IO-STREAM-MONITOR-EXTERNAL-TO-INTERNAL-PROCESS", 0, 0, false);
        declareFunction("cyblack_io_stream_monitor_blackboard_connection_process", "CYBLACK-IO-STREAM-MONITOR-BLACKBOARD-CONNECTION-PROCESS", 0, 0, false);
        declareFunction("cyblack_io_stream_monitor_toplevel", "CYBLACK-IO-STREAM-MONITOR-TOPLEVEL", 0, 0, false);
        declareFunction("cyblack_io_stream_monitor_loop", "CYBLACK-IO-STREAM-MONITOR-LOOP", 0, 0, false);
        declareFunction("cyblack_io_stream_monitor_input_loop", "CYBLACK-IO-STREAM-MONITOR-INPUT-LOOP", 0, 0, false);
        declareFunction("cyblack_io_stream_monitor_output_loop", "CYBLACK-IO-STREAM-MONITOR-OUTPUT-LOOP", 0, 0, false);
        declareFunction("get_cyblack_io_stream_monitor_posting_to_raw_function", "GET-CYBLACK-IO-STREAM-MONITOR-POSTING-TO-RAW-FUNCTION", 1, 0, false);
        declareFunction("set_cyblack_io_stream_monitor_posting_to_raw_function", "SET-CYBLACK-IO-STREAM-MONITOR-POSTING-TO-RAW-FUNCTION", 2, 0, false);
        declareFunction("get_cyblack_io_stream_monitor_raw_to_posting_function", "GET-CYBLACK-IO-STREAM-MONITOR-RAW-TO-POSTING-FUNCTION", 1, 0, false);
        declareFunction("set_cyblack_io_stream_monitor_raw_to_posting_function", "SET-CYBLACK-IO-STREAM-MONITOR-RAW-TO-POSTING-FUNCTION", 2, 0, false);
        declareFunction("get_cyblack_io_stream_monitor_default_error_prompt", "GET-CYBLACK-IO-STREAM-MONITOR-DEFAULT-ERROR-PROMPT", 1, 0, false);
        declareFunction("set_cyblack_io_stream_monitor_default_error_prompt", "SET-CYBLACK-IO-STREAM-MONITOR-DEFAULT-ERROR-PROMPT", 2, 0, false);
        declareFunction("get_cyblack_io_stream_monitor_normal_prompt", "GET-CYBLACK-IO-STREAM-MONITOR-NORMAL-PROMPT", 1, 0, false);
        declareFunction("set_cyblack_io_stream_monitor_normal_prompt", "SET-CYBLACK-IO-STREAM-MONITOR-NORMAL-PROMPT", 2, 0, false);
        declareFunction("get_cyblack_io_stream_monitor_output_stream", "GET-CYBLACK-IO-STREAM-MONITOR-OUTPUT-STREAM", 1, 0, false);
        declareFunction("set_cyblack_io_stream_monitor_output_stream", "SET-CYBLACK-IO-STREAM-MONITOR-OUTPUT-STREAM", 2, 0, false);
        declareFunction("get_cyblack_io_stream_monitor_input_stream", "GET-CYBLACK-IO-STREAM-MONITOR-INPUT-STREAM", 1, 0, false);
        declareFunction("set_cyblack_io_stream_monitor_input_stream", "SET-CYBLACK-IO-STREAM-MONITOR-INPUT-STREAM", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_io_stream_monitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-MONITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_io_stream_monitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-MONITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_p", "CYBLACK-IO-STREAM-MONITOR-P", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_initialize_method", "CYBLACK-IO-STREAM-MONITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_spawn_connection_method", "CYBLACK-IO-STREAM-MONITOR-SPAWN-CONNECTION-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_get_input_stream_method", "CYBLACK-IO-STREAM-MONITOR-GET-INPUT-STREAM-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_set_input_stream_method", "CYBLACK-IO-STREAM-MONITOR-SET-INPUT-STREAM-METHOD", 2, 0, false);
        declareFunction("cyblack_io_stream_monitor_get_output_stream_method", "CYBLACK-IO-STREAM-MONITOR-GET-OUTPUT-STREAM-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_set_output_stream_method", "CYBLACK-IO-STREAM-MONITOR-SET-OUTPUT-STREAM-METHOD", 2, 0, false);
        declareFunction("cyblack_io_stream_monitor_get_normal_prompt_method", "CYBLACK-IO-STREAM-MONITOR-GET-NORMAL-PROMPT-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_set_normal_prompt_method", "CYBLACK-IO-STREAM-MONITOR-SET-NORMAL-PROMPT-METHOD", 2, 0, false);
        declareFunction("cyblack_io_stream_monitor_get_default_error_prompt_method", "CYBLACK-IO-STREAM-MONITOR-GET-DEFAULT-ERROR-PROMPT-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_set_default_error_prompt_method", "CYBLACK-IO-STREAM-MONITOR-SET-DEFAULT-ERROR-PROMPT-METHOD", 2, 0, false);
        declareFunction("cyblack_io_stream_monitor_get_raw_to_posting_function_method", "CYBLACK-IO-STREAM-MONITOR-GET-RAW-TO-POSTING-FUNCTION-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_set_raw_to_posting_function_method", "CYBLACK-IO-STREAM-MONITOR-SET-RAW-TO-POSTING-FUNCTION-METHOD", 2, 0, false);
        declareFunction("cyblack_io_stream_monitor_get_posting_to_raw_function_method", "CYBLACK-IO-STREAM-MONITOR-GET-POSTING-TO-RAW-FUNCTION-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_set_posting_to_raw_function_method", "CYBLACK-IO-STREAM-MONITOR-SET-POSTING-TO-RAW-FUNCTION-METHOD", 2, 0, false);
        declareFunction("cyblack_io_stream_monitor_raw_to_posting_method", "CYBLACK-IO-STREAM-MONITOR-RAW-TO-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_io_stream_monitor_posting_to_raw_method", "CYBLACK-IO-STREAM-MONITOR-POSTING-TO-RAW-METHOD", 2, 0, false);
        declareFunction("cyblack_io_stream_monitor_read_raw_method", "CYBLACK-IO-STREAM-MONITOR-READ-RAW-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_write_raw_method", "CYBLACK-IO-STREAM-MONITOR-WRITE-RAW-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_io_stream_monitor_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_io_stream_monitor_file() {
                classes.subloop_new_class(CYBLACK_IO_STREAM_MONITOR, CYBLACK_INTERNAL_UI_MONITOR, NIL, NIL, $list_alt35);
        classes.class_set_implements_slot_listeners(CYBLACK_IO_STREAM_MONITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_IO_STREAM_MONITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_MONITOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_IO_STREAM_MONITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_MONITOR_INSTANCE);
        subloop_reserved_initialize_cyblack_io_stream_monitor_class(CYBLACK_IO_STREAM_MONITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_IO_STREAM_MONITOR, $list_alt67, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, INITIALIZE, CYBLACK_IO_STREAM_MONITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SPAWN_CONNECTION, CYBLACK_IO_STREAM_MONITOR, $list_alt75, NIL, $list_alt76);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, SPAWN_CONNECTION, CYBLACK_IO_STREAM_MONITOR_SPAWN_CONNECTION_METHOD);
        methods.methods_incorporate_instance_method(GET_INPUT_STREAM, CYBLACK_IO_STREAM_MONITOR, $list_alt75, NIL, $list_alt79);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, GET_INPUT_STREAM, CYBLACK_IO_STREAM_MONITOR_GET_INPUT_STREAM_METHOD);
        methods.methods_incorporate_instance_method(SET_INPUT_STREAM, CYBLACK_IO_STREAM_MONITOR, $list_alt75, $list_alt83, $list_alt84);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, SET_INPUT_STREAM, CYBLACK_IO_STREAM_MONITOR_SET_INPUT_STREAM_METHOD);
        methods.methods_incorporate_instance_method(GET_OUTPUT_STREAM, CYBLACK_IO_STREAM_MONITOR, $list_alt75, NIL, $list_alt87);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, GET_OUTPUT_STREAM, CYBLACK_IO_STREAM_MONITOR_GET_OUTPUT_STREAM_METHOD);
        methods.methods_incorporate_instance_method(SET_OUTPUT_STREAM, CYBLACK_IO_STREAM_MONITOR, $list_alt75, $list_alt91, $list_alt92);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, SET_OUTPUT_STREAM, CYBLACK_IO_STREAM_MONITOR_SET_OUTPUT_STREAM_METHOD);
        methods.methods_incorporate_instance_method(GET_NORMAL_PROMPT, CYBLACK_IO_STREAM_MONITOR, $list_alt75, NIL, $list_alt95);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, GET_NORMAL_PROMPT, CYBLACK_IO_STREAM_MONITOR_GET_NORMAL_PROMPT_METHOD);
        methods.methods_incorporate_instance_method(SET_NORMAL_PROMPT, CYBLACK_IO_STREAM_MONITOR, $list_alt75, $list_alt99, $list_alt100);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, SET_NORMAL_PROMPT, CYBLACK_IO_STREAM_MONITOR_SET_NORMAL_PROMPT_METHOD);
        methods.methods_incorporate_instance_method(GET_DEFAULT_ERROR_PROMPT, CYBLACK_IO_STREAM_MONITOR, $list_alt75, NIL, $list_alt104);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, GET_DEFAULT_ERROR_PROMPT, CYBLACK_IO_STREAM_MONITOR_GET_DEFAULT_ERROR_PROMPT_METHOD);
        methods.methods_incorporate_instance_method(SET_DEFAULT_ERROR_PROMPT, CYBLACK_IO_STREAM_MONITOR, $list_alt75, $list_alt108, $list_alt109);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, SET_DEFAULT_ERROR_PROMPT, CYBLACK_IO_STREAM_MONITOR_SET_DEFAULT_ERROR_PROMPT_METHOD);
        methods.methods_incorporate_instance_method(GET_RAW_TO_POSTING_FUNCTION, CYBLACK_IO_STREAM_MONITOR, $list_alt75, NIL, $list_alt113);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, GET_RAW_TO_POSTING_FUNCTION, CYBLACK_IO_STREAM_MONITOR_GET_RAW_TO_POSTING_FUNCTION_METHOD);
        methods.methods_incorporate_instance_method(SET_RAW_TO_POSTING_FUNCTION, CYBLACK_IO_STREAM_MONITOR, $list_alt75, $list_alt117, $list_alt118);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, SET_RAW_TO_POSTING_FUNCTION, CYBLACK_IO_STREAM_MONITOR_SET_RAW_TO_POSTING_FUNCTION_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING_TO_RAW_FUNCTION, CYBLACK_IO_STREAM_MONITOR, $list_alt75, NIL, $list_alt113);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, GET_POSTING_TO_RAW_FUNCTION, CYBLACK_IO_STREAM_MONITOR_GET_POSTING_TO_RAW_FUNCTION_METHOD);
        methods.methods_incorporate_instance_method(SET_POSTING_TO_RAW_FUNCTION, CYBLACK_IO_STREAM_MONITOR, $list_alt75, $list_alt126, $list_alt127);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, SET_POSTING_TO_RAW_FUNCTION, CYBLACK_IO_STREAM_MONITOR_SET_POSTING_TO_RAW_FUNCTION_METHOD);
        methods.methods_incorporate_instance_method(RAW_TO_POSTING, CYBLACK_IO_STREAM_MONITOR, $list_alt67, $list_alt132, $list_alt133);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, RAW_TO_POSTING, CYBLACK_IO_STREAM_MONITOR_RAW_TO_POSTING_METHOD);
        methods.methods_incorporate_instance_method(POSTING_TO_RAW, CYBLACK_IO_STREAM_MONITOR, $list_alt67, $list_alt137, $list_alt138);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, POSTING_TO_RAW, CYBLACK_IO_STREAM_MONITOR_POSTING_TO_RAW_METHOD);
        methods.methods_incorporate_instance_method(READ_RAW, CYBLACK_IO_STREAM_MONITOR, $list_alt75, NIL, $list_alt141);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, READ_RAW, CYBLACK_IO_STREAM_MONITOR_READ_RAW_METHOD);
        methods.methods_incorporate_instance_method(WRITE_RAW, CYBLACK_IO_STREAM_MONITOR, $list_alt75, $list_alt132, $list_alt143);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR, WRITE_RAW, CYBLACK_IO_STREAM_MONITOR_WRITE_RAW_METHOD);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(list(makeSymbol("MONITOR")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $cyblack_io_stream_monitor$ = makeSymbol("*CYBLACK-IO-STREAM-MONITOR*");



    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_BASE = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE");

    private static final SubLSymbol CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT = makeSymbol("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT");

    private static final SubLSymbol CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT = makeSymbol("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT");

    private static final SubLSymbol CYBLACK_BLACKBOARD_CONNECTION_INCREMENT = makeSymbol("CYBLACK-BLACKBOARD-CONNECTION-INCREMENT");

    private static final SubLSymbol ADD_PROCESS = makeSymbol("ADD-PROCESS");

    static private final SubLString $str_alt9$CYBLACK_IO_STREAM_INTERNAL_TO_EXT = makeString("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_INTERNAL_TO_EXTERNAL_PROCESS = makeSymbol("CYBLACK-IO-STREAM-MONITOR-INTERNAL-TO-EXTERNAL-PROCESS");

    static private final SubLString $str_alt11$CYBLACK_IO_STREAM_EXTERNAL_TO_INT = makeString("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_EXTERNAL_TO_INTERNAL_PROCESS = makeSymbol("CYBLACK-IO-STREAM-MONITOR-EXTERNAL-TO-INTERNAL-PROCESS");

    static private final SubLString $str_alt13$CYBLACK_IO_STREAM_MONITOR_CONNECT = makeString("CYBLACK-IO-STREAM-MONITOR-CONNECTION");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_BLACKBOARD_CONNECTION_PROCESS = makeSymbol("CYBLACK-IO-STREAM-MONITOR-BLACKBOARD-CONNECTION-PROCESS");

    static private final SubLString $str_alt15$No_binding_to__cyblack_io_stream_ = makeString("No binding to *cyblack-io-stream-monitor* has been established.");

    static private final SubLString $str_alt16$No_binding_to__cyblack_applicatio = makeString("No binding to *cyblack-application* has been established.");

    private static final SubLSymbol INTERNAL_TO_EXTERNAL_PROCESS = makeSymbol("INTERNAL-TO-EXTERNAL-PROCESS");

    private static final SubLSymbol EXTERNAL_TO_INTERNAL_PROCESS = makeSymbol("EXTERNAL-TO-INTERNAL-PROCESS");

    private static final SubLSymbol BLACKBOARD_CONNECTION_PROCESS = makeSymbol("BLACKBOARD-CONNECTION-PROCESS");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT = makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT");

    static private final SubLString $str_alt21$CYBLACK_IO_STREAM_MONITOR_INPUT_L = makeString("CYBLACK-IO-STREAM-MONITOR-INPUT-LOOP");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_INPUT_LOOP = makeSymbol("CYBLACK-IO-STREAM-MONITOR-INPUT-LOOP");

    static private final SubLString $str_alt23$CYBLACK_IO_STREAM_MONITOR_OUTPUT_ = makeString("CYBLACK-IO-STREAM-MONITOR-OUTPUT-LOOP");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_OUTPUT_LOOP = makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-LOOP");

    private static final SubLSymbol GET_OUTPUT_STREAM = makeSymbol("GET-OUTPUT-STREAM");

    private static final SubLSymbol GET_NORMAL_PROMPT = makeSymbol("GET-NORMAL-PROMPT");



    private static final SubLSymbol READ_RAW = makeSymbol("READ-RAW");

    private static final SubLSymbol ADD_INCOMING_RAW = makeSymbol("ADD-INCOMING-RAW");

    private static final SubLSymbol GET_OUTGOING_RAW = makeSymbol("GET-OUTGOING-RAW");

    private static final SubLSymbol WRITE_RAW = makeSymbol("WRITE-RAW");

    public static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR = makeSymbol("CYBLACK-IO-STREAM-MONITOR");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR");

    static private final SubLList $list_alt35 = list(new SubLObject[]{ list(makeSymbol("INPUT-STREAM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OUTPUT-STREAM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NORMAL-PROMPT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEFAULT-ERROR-PROMPT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RAW-TO-POSTING-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("POSTING-TO-RAW-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SPAWN-CONNECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INPUT-STREAM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INPUT-STREAM"), list(makeSymbol("NEW-INPUT-STREAM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OUTPUT-STREAM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-OUTPUT-STREAM"), list(makeSymbol("NEW-OUTPUT-STREAM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NORMAL-PROMPT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NORMAL-PROMPT"), list(makeSymbol("NEW-NORMAL-PROMPT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-ERROR-PROMPT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-ERROR-PROMPT"), list(makeSymbol("NEW-DEFAULT-ERROR-PROMPT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RAW-TO-POSTING-FUNCTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-RAW-TO-POSTING-FUNCTION"), list(makeSymbol("NEW-RAW-TO-POSTING-FUNCTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-TO-RAW-FUNCTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-POSTING-TO-RAW-FUNCTION"), list(makeSymbol("NEW-POSTING-TO-RAW-FUNCTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RAW-TO-POSTING"), list(makeSymbol("OBJECT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSTING-TO-RAW"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("READ-RAW"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WRITE-RAW"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")) });





    private static final SubLSymbol DEFAULT_ERROR_PROMPT = makeSymbol("DEFAULT-ERROR-PROMPT");

    private static final SubLSymbol NORMAL_PROMPT = makeSymbol("NORMAL-PROMPT");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_MONITOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-MONITOR-CLASS");



    private static final SubLSymbol CYBLACK_BASIC_MONITOR = makeSymbol("CYBLACK-BASIC-MONITOR");

















    private static final SubLSymbol PANEL_LIST = makeSymbol("PANEL-LIST");













    private static final SubLSymbol INCOMING_SLEEP_INTERVAL = makeSymbol("INCOMING-SLEEP-INTERVAL");

    private static final SubLSymbol OUTGOING_SLEEP_INTERVAL = makeSymbol("OUTGOING-SLEEP-INTERVAL");

    private static final SubLSymbol BLACKBOARD_CONNECTION_SLEEP_INTERVAL = makeSymbol("BLACKBOARD-CONNECTION-SLEEP-INTERVAL");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_MONITOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-MONITOR-INSTANCE");



    static private final SubLList $list_alt67 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt68 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INPUT-STREAM"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR-DEFAULT-INPUT*")), list(makeSymbol("CSETQ"), makeSymbol("OUTPUT-STREAM"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR-DEFAULT-OUTPUT*")), list(makeSymbol("CSETQ"), makeSymbol("NORMAL-PROMPT"), makeString("~%VirB3 > ")), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT-ERROR-PROMPT"), makeString("~%Unable to process input.  Please try again.")), list(makeSymbol("CSETQ"), makeSymbol("SPAWN-CONNECTION-FUNCTION"), list(QUOTE, makeSymbol("CYBLACK-IO-STREAM-MONITOR-SPAWN-CONNECTION"))), list(makeSymbol("CSETQ"), makeSymbol("RAW-TO-POSTING-FUNCTION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("POSTING-TO-RAW-FUNCTION"), NIL), list(RET, NIL) });

    static private final SubLSymbol $sym69$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    static private final SubLString $str_alt70$__VirB3___ = makeString("~%VirB3 > ");

    static private final SubLString $str_alt71$__Unable_to_process_input___Pleas = makeString("~%Unable to process input.  Please try again.");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_SPAWN_CONNECTION = makeSymbol("CYBLACK-IO-STREAM-MONITOR-SPAWN-CONNECTION");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-INITIALIZE-METHOD");

    private static final SubLSymbol SPAWN_CONNECTION = makeSymbol("SPAWN-CONNECTION");

    static private final SubLList $list_alt75 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt76 = list(list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), makeSymbol("SELF")), list(RET, list(makeSymbol("SPAWN-CONNECTION"), makeSymbol("SUPER"))));

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_SPAWN_CONNECTION_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-SPAWN-CONNECTION-METHOD");

    private static final SubLSymbol GET_INPUT_STREAM = makeSymbol("GET-INPUT-STREAM");

    static private final SubLList $list_alt79 = list(list(RET, makeSymbol("INPUT-STREAM")));

    static private final SubLSymbol $sym80$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_GET_INPUT_STREAM_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-GET-INPUT-STREAM-METHOD");

    private static final SubLSymbol SET_INPUT_STREAM = makeSymbol("SET-INPUT-STREAM");

    static private final SubLList $list_alt83 = list(makeSymbol("NEW-INPUT-STREAM"));

    static private final SubLList $list_alt84 = list(list(makeSymbol("CSETQ"), makeSymbol("INPUT-STREAM"), makeSymbol("NEW-INPUT-STREAM")), list(RET, makeSymbol("NEW-INPUT-STREAM")));

    static private final SubLSymbol $sym85$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_SET_INPUT_STREAM_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-SET-INPUT-STREAM-METHOD");

    static private final SubLList $list_alt87 = list(list(RET, makeSymbol("OUTPUT-STREAM")));

    static private final SubLSymbol $sym88$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_GET_OUTPUT_STREAM_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-GET-OUTPUT-STREAM-METHOD");

    private static final SubLSymbol SET_OUTPUT_STREAM = makeSymbol("SET-OUTPUT-STREAM");

    static private final SubLList $list_alt91 = list(makeSymbol("NEW-OUTPUT-STREAM"));

    static private final SubLList $list_alt92 = list(list(makeSymbol("CSETQ"), makeSymbol("OUTPUT-STREAM"), makeSymbol("NEW-OUTPUT-STREAM")), list(RET, makeSymbol("NEW-OUTPUT-STREAM")));

    static private final SubLSymbol $sym93$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_SET_OUTPUT_STREAM_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-SET-OUTPUT-STREAM-METHOD");

    static private final SubLList $list_alt95 = list(list(RET, makeSymbol("NORMAL-PROMPT")));

    static private final SubLSymbol $sym96$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_GET_NORMAL_PROMPT_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-GET-NORMAL-PROMPT-METHOD");

    private static final SubLSymbol SET_NORMAL_PROMPT = makeSymbol("SET-NORMAL-PROMPT");

    static private final SubLList $list_alt99 = list(makeSymbol("NEW-NORMAL-PROMPT"));

    static private final SubLList $list_alt100 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("STRINGP"), makeSymbol("NEW-NORMAL-PROMPT")), makeString("(SET-NORMAL-PROMPT ~S): Only strings may serve as prompts.  ~S is not a string."), makeSymbol("SELF"), makeSymbol("NEW-NORMAL-PROMPT")), list(makeSymbol("CSETQ"), makeSymbol("NORMAL-PROMPT"), makeSymbol("NEW-NORMAL-PROMPT")), list(RET, makeSymbol("NEW-NORMAL-PROMPT")));

    static private final SubLSymbol $sym101$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_SET_NORMAL_PROMPT_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-SET-NORMAL-PROMPT-METHOD");

    private static final SubLSymbol GET_DEFAULT_ERROR_PROMPT = makeSymbol("GET-DEFAULT-ERROR-PROMPT");

    static private final SubLList $list_alt104 = list(list(RET, makeSymbol("DEFAULT-ERROR-PROMPT")));

    static private final SubLSymbol $sym105$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_GET_DEFAULT_ERROR_PROMPT_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-GET-DEFAULT-ERROR-PROMPT-METHOD");

    private static final SubLSymbol SET_DEFAULT_ERROR_PROMPT = makeSymbol("SET-DEFAULT-ERROR-PROMPT");

    static private final SubLList $list_alt108 = list(makeSymbol("NEW-DEFAULT-ERROR-PROMPT"));

    static private final SubLList $list_alt109 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("STRINGP"), makeSymbol("NEW-DEFAULT-ERROR-PROMPT")), makeString("(SET-DEFAULT-ERROR-PROMPT ~S): Only strings may serve as prompts.  ~S is not a string."), makeSymbol("SELF"), makeSymbol("NEW-DEFAULT-ERROR-PROMPT")), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT-ERROR-PROMPT"), makeSymbol("NEW-DEFAULT-ERROR-PROMPT")), list(RET, makeSymbol("NEW-DEFAULT-ERROR-PROMPT")));

    static private final SubLSymbol $sym110$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_SET_DEFAULT_ERROR_PROMPT_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-SET-DEFAULT-ERROR-PROMPT-METHOD");

    private static final SubLSymbol GET_RAW_TO_POSTING_FUNCTION = makeSymbol("GET-RAW-TO-POSTING-FUNCTION");

    static private final SubLList $list_alt113 = list(list(RET, makeSymbol("RAW-TO-POSTING-FUNCTION")));

    static private final SubLSymbol $sym114$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_GET_RAW_TO_POSTING_FUNCTION_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-GET-RAW-TO-POSTING-FUNCTION-METHOD");

    private static final SubLSymbol SET_RAW_TO_POSTING_FUNCTION = makeSymbol("SET-RAW-TO-POSTING-FUNCTION");

    static private final SubLList $list_alt117 = list(makeSymbol("NEW-RAW-TO-POSTING-FUNCTION"));

    static private final SubLList $list_alt118 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-RAW-TO-POSTING-FUNCTION"), list(makeSymbol("SYMBOLP"), makeSymbol("RAW-TO-POSTING-FUNCTION"))), makeString("(SET-RAW-TO-POSTING-FUNCTION ~S): ~S is not a valid symbolic reference to a function.  ~\n     A symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-RAW-TO-POSTING-FUNCTION")), list(makeSymbol("PUNLESS"), list(makeSymbol("SYMBOL-FUNCTION"), makeSymbol("NEW-RAW-TO-POSTING-FUNCTION")), list(makeSymbol("WARN"), makeString("(SET-RAW-TO-POSTING-FUNCTION ~S): ~S is not a defined function."), makeSymbol("SELF"), makeSymbol("NEW-RAW-TO-POSTING-FUNCTION"))), list(makeSymbol("CSETQ"), makeSymbol("RAW-TO-POSTING-FUNCTION"), makeSymbol("NEW-RAW-TO-POSTING-FUNCTION")), list(RET, makeSymbol("RAW-TO-POSTING-FUNCTION")));

    static private final SubLSymbol $sym119$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    static private final SubLString $str_alt120$_SET_RAW_TO_POSTING_FUNCTION__S__ = makeString("(SET-RAW-TO-POSTING-FUNCTION ~S): ~S is not a defined function.");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_SET_RAW_TO_POSTING_FUNCTION_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-SET-RAW-TO-POSTING-FUNCTION-METHOD");

    private static final SubLSymbol GET_POSTING_TO_RAW_FUNCTION = makeSymbol("GET-POSTING-TO-RAW-FUNCTION");

    static private final SubLSymbol $sym123$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_GET_POSTING_TO_RAW_FUNCTION_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-GET-POSTING-TO-RAW-FUNCTION-METHOD");

    private static final SubLSymbol SET_POSTING_TO_RAW_FUNCTION = makeSymbol("SET-POSTING-TO-RAW-FUNCTION");

    static private final SubLList $list_alt126 = list(makeSymbol("NEW-POSTING-TO-RAW-FUNCTION"));

    static private final SubLList $list_alt127 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-POSTING-TO-RAW-FUNCTION"), list(makeSymbol("SYMBOLP"), makeSymbol("POSTING-TO-RAW-FUNCTION"))), makeString("(SET-POSTING-TO-RAW-FUNCTION ~S): ~S is not a valid symbolic reference to a function.  ~\n     A symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-POSTING-TO-RAW-FUNCTION")), list(makeSymbol("PUNLESS"), list(makeSymbol("SYMBOL-FUNCTION"), makeSymbol("NEW-POSTING-TO-RAW-FUNCTION")), list(makeSymbol("WARN"), makeString("(SET-POSTING-TO-RAW-FUNCTION ~S): ~S is not a defined function."), makeSymbol("SELF"), makeSymbol("NEW-POSTING-TO-RAW-FUNCTION"))), list(makeSymbol("CSETQ"), makeSymbol("POSTING-TO-RAW-FUNCTION"), makeSymbol("NEW-POSTING-TO-RAW-FUNCTION")), list(RET, makeSymbol("POSTING-TO-RAW-FUNCTION")));

    static private final SubLSymbol $sym128$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    static private final SubLString $str_alt129$_SET_POSTING_TO_RAW_FUNCTION__S__ = makeString("(SET-POSTING-TO-RAW-FUNCTION ~S): ~S is not a defined function.");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_SET_POSTING_TO_RAW_FUNCTION_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-SET-POSTING-TO-RAW-FUNCTION-METHOD");

    private static final SubLSymbol RAW_TO_POSTING = makeSymbol("RAW-TO-POSTING");

    static private final SubLList $list_alt132 = list(makeSymbol("OBJECT"));

    static private final SubLList $list_alt133 = list(list(makeSymbol("PWHEN"), makeSymbol("RAW-TO-POSTING-FUNCTION"), list(RET, list(makeSymbol("FUNCALL"), makeSymbol("RAW-TO-POSTING-FUNCTION"), makeSymbol("OBJECT")))), list(RET, NIL));

    static private final SubLSymbol $sym134$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_RAW_TO_POSTING_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-RAW-TO-POSTING-METHOD");

    private static final SubLSymbol POSTING_TO_RAW = makeSymbol("POSTING-TO-RAW");

    static private final SubLList $list_alt137 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt138 = list(list(makeSymbol("PWHEN"), makeSymbol("POSTING-TO-RAW-FUNCTION"), list(RET, list(makeSymbol("FUNCALL"), makeSymbol("POSTING-TO-RAW-FUNCTION"), makeSymbol("POSTING")))), list(RET, NIL));

    static private final SubLSymbol $sym139$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_POSTING_TO_RAW_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-POSTING-TO-RAW-METHOD");

    static private final SubLList $list_alt141 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_READ_RAW_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-READ-RAW-METHOD");

    static private final SubLList $list_alt143 = list(list(makeSymbol("IGNORE"), makeSymbol("OBJECT")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_WRITE_RAW_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-WRITE-RAW-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_io_stream_monitor_file();
    }

    public void initializeVariables() {
        init_cyblack_io_stream_monitor_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_io_stream_monitor_file();
    }
}

