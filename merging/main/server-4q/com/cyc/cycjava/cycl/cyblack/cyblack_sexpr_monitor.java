/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-SEXPR-MONITOR
 *  source file: /cyc/top/cycl/cyblack/cyblack-sexpr-monitor.lisp
 *  created:     2019/07/03 17:38:49
 */
public final class cyblack_sexpr_monitor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_sexpr_monitor() {
    }

    public static final SubLFile me = new cyblack_sexpr_monitor();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_sexpr_monitor";

    // // Definitions
    public static final SubLObject cyblack_sexpr_monitor_raw_to_posting_function(SubLObject sexpr) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_application.$cyblack_application$.getDynamicValue(thread)) {
                {
                    SubLObject datatype_dictionary = methods.funcall_instance_method_with_0_args(cyblack_application.$cyblack_application$.getDynamicValue(thread), GET_DATATYPE_DICTIONARY);
                    if (sexpr.isCons()) {
                        {
                            SubLObject datatype_string = sexpr.first();
                            SubLObject plist = sexpr.rest();
                            if (!datatype_string.isString()) {
                                Errors.warn($str_alt1$CYBLACK_SEXPR_MONITOR_RAW_TO_POST, datatype_string);
                                return NIL;
                            }
                            if (!plist.isList()) {
                                Errors.warn($str_alt2$CYBLACK_SEXPR_MONITOR_RAW_TO_POST, plist);
                            }
                            {
                                SubLObject datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, datatype_string, UNPROVIDED);
                                SubLObject posting_class = cyblack_datatype.cyblack_datatype_get_posting_type(datatype);
                                force_output(UNPROVIDED);
                                if (NIL == posting_class) {
                                    Errors.warn($str_alt3$CYBLACK_SEXPR_MONITOR_RAW_TO_POST, datatype_string);
                                }
                                {
                                    SubLObject virgin_posting = object.new_object_instance(posting_class);
                                    methods.funcall_instance_method_with_1_args(virgin_posting, ASSIMILATE, plist);
                                    methods.funcall_instance_method_with_1_args(virgin_posting, SET_DATATYPE, datatype);
                                    methods.funcall_instance_method_with_1_args(virgin_posting, SET_APPLICATION, cyblack_application.$cyblack_application$.getDynamicValue(thread));
                                    return virgin_posting;
                                }
                            }
                        }
                    } else {
                        Errors.warn($str_alt7$CYBLACK_SEXPR_MONITOR_RAW_TO_POST, sexpr);
                    }
                }
            } else {
                Errors.warn($str_alt8$CYBLACK_SEXPR_MONITOR_RAW_TO_POST, sexpr);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_sexpr_monitor_posting_to_raw_function(SubLObject posting) {
        if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
            Errors.warn($str_alt9$CYBLACK_SEXPR_MONITOR_POSTING_TO_, posting);
            return NIL;
        }
        {
            SubLObject plistified_content = methods.funcall_instance_method_with_0_args(posting, PLISTIFY);
            SubLObject datatype = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(posting);
            SubLObject datatype_string = (NIL != datatype) ? ((SubLObject) (cyblack_datatype.cyblack_datatype_get_typename(datatype))) : $str_alt11$UNKNOWN_POSTING_TYPE;
            return cons(datatype_string, plistified_content);
        }
    }

    public static final SubLObject cyblack_sexpr_monitor_removal_to_raw_function(SubLObject posting) {
        if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
            Errors.warn($str_alt12$CYBLACK_SEXPR_MONITOR_REMOVAL_TO_, posting);
            return NIL;
        }
        {
            SubLObject plistified_content = methods.funcall_instance_method_with_0_args(posting, PLISTIFY);
            SubLObject datatype = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(posting);
            SubLObject datatype_string = (NIL != datatype) ? ((SubLObject) (cyblack_datatype.cyblack_datatype_get_typename(datatype))) : $str_alt11$UNKNOWN_POSTING_TYPE;
            return list($UNPOST, cons(datatype_string, plistified_content));
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_sexpr_monitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_sexpr_monitor_instance(SubLObject new_instance) {
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

    public static final SubLObject cyblack_sexpr_monitor_p(SubLObject v_cyblack_sexpr_monitor) {
        return classes.subloop_instanceof_class(v_cyblack_sexpr_monitor, CYBLACK_SEXPR_MONITOR);
    }

    public static final SubLObject cyblack_sexpr_monitor_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_sexpr_monitor_method = NIL;
            SubLObject posting_to_raw_function = cyblack_io_stream_monitor.get_cyblack_io_stream_monitor_posting_to_raw_function(self);
            SubLObject raw_to_posting_function = cyblack_io_stream_monitor.get_cyblack_io_stream_monitor_raw_to_posting_function(self);
            SubLObject default_error_prompt = cyblack_io_stream_monitor.get_cyblack_io_stream_monitor_default_error_prompt(self);
            SubLObject normal_prompt = cyblack_io_stream_monitor.get_cyblack_io_stream_monitor_normal_prompt(self);
            try {
                try {
                    cyblack_io_stream_monitor.cyblack_io_stream_monitor_initialize_method(self);
                    normal_prompt = $str_alt52$__Symbolic_Expression___;
                    default_error_prompt = $str_alt53$__Unable_to_process_input___Pleas;
                    raw_to_posting_function = CYBLACK_SEXPR_MONITOR_RAW_TO_POSTING_FUNCTION;
                    posting_to_raw_function = CYBLACK_SEXPR_MONITOR_POSTING_TO_RAW_FUNCTION;
                    sublisp_throw($sym51$OUTER_CATCH_FOR_CYBLACK_SEXPR_MONITOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_io_stream_monitor.set_cyblack_io_stream_monitor_posting_to_raw_function(self, posting_to_raw_function);
                            cyblack_io_stream_monitor.set_cyblack_io_stream_monitor_raw_to_posting_function(self, raw_to_posting_function);
                            cyblack_io_stream_monitor.set_cyblack_io_stream_monitor_default_error_prompt(self, default_error_prompt);
                            cyblack_io_stream_monitor.set_cyblack_io_stream_monitor_normal_prompt(self, normal_prompt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_sexpr_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym51$OUTER_CATCH_FOR_CYBLACK_SEXPR_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_sexpr_monitor_method;
        }
    }

    public static final SubLObject cyblack_sexpr_monitor_read_raw_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_sexpr_monitor_method = NIL;
            SubLObject input_stream = cyblack_io_stream_monitor.get_cyblack_io_stream_monitor_input_stream(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject input = read(input_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (input == $Q) {
                            methods.funcall_instance_method_with_0_args(application, HALT);
                            sublisp_throw($sym60$OUTER_CATCH_FOR_CYBLACK_SEXPR_MONITOR_METHOD, NIL);
                        }
                        if (input == $A) {
                            methods.funcall_instance_method_with_0_args(application, HALT_AND_ABORT_SERVER);
                            sublisp_throw($sym60$OUTER_CATCH_FOR_CYBLACK_SEXPR_MONITOR_METHOD, NIL);
                        }
                        sublisp_throw($sym60$OUTER_CATCH_FOR_CYBLACK_SEXPR_MONITOR_METHOD, input);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_io_stream_monitor.set_cyblack_io_stream_monitor_input_stream(self, input_stream);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_sexpr_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym60$OUTER_CATCH_FOR_CYBLACK_SEXPR_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_sexpr_monitor_method;
        }
    }

    public static final SubLObject cyblack_sexpr_monitor_write_raw_method(SubLObject self, SubLObject v_object) {
        {
            SubLObject catch_var_for_cyblack_sexpr_monitor_method = NIL;
            SubLObject output_stream = cyblack_io_stream_monitor.get_cyblack_io_stream_monitor_output_stream(self);
            try {
                try {
                    format(output_stream, $str_alt70$__Cyblack___S__, v_object);
                    force_output(output_stream);
                    sublisp_throw($sym69$OUTER_CATCH_FOR_CYBLACK_SEXPR_MONITOR_METHOD, v_object);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_io_stream_monitor.set_cyblack_io_stream_monitor_output_stream(self, output_stream);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_sexpr_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_CYBLACK_SEXPR_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_sexpr_monitor_method;
        }
    }

    public static final SubLObject declare_cyblack_sexpr_monitor_file() {
        declareFunction("cyblack_sexpr_monitor_raw_to_posting_function", "CYBLACK-SEXPR-MONITOR-RAW-TO-POSTING-FUNCTION", 1, 0, false);
        declareFunction("cyblack_sexpr_monitor_posting_to_raw_function", "CYBLACK-SEXPR-MONITOR-POSTING-TO-RAW-FUNCTION", 1, 0, false);
        declareFunction("cyblack_sexpr_monitor_removal_to_raw_function", "CYBLACK-SEXPR-MONITOR-REMOVAL-TO-RAW-FUNCTION", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_sexpr_monitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEXPR-MONITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_sexpr_monitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEXPR-MONITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_sexpr_monitor_p", "CYBLACK-SEXPR-MONITOR-P", 1, 0, false);
        declareFunction("cyblack_sexpr_monitor_initialize_method", "CYBLACK-SEXPR-MONITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_sexpr_monitor_read_raw_method", "CYBLACK-SEXPR-MONITOR-READ-RAW-METHOD", 1, 0, false);
        declareFunction("cyblack_sexpr_monitor_write_raw_method", "CYBLACK-SEXPR-MONITOR-WRITE-RAW-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_sexpr_monitor_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_sexpr_monitor_file() {
                classes.subloop_new_class(CYBLACK_SEXPR_MONITOR, CYBLACK_IO_STREAM_MONITOR, NIL, NIL, $list_alt16);
        classes.class_set_implements_slot_listeners(CYBLACK_SEXPR_MONITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SEXPR_MONITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEXPR_MONITOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SEXPR_MONITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEXPR_MONITOR_INSTANCE);
        subloop_reserved_initialize_cyblack_sexpr_monitor_class(CYBLACK_SEXPR_MONITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SEXPR_MONITOR, $list_alt49, NIL, $list_alt50);
        methods.subloop_register_instance_method(CYBLACK_SEXPR_MONITOR, INITIALIZE, CYBLACK_SEXPR_MONITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(READ_RAW, CYBLACK_SEXPR_MONITOR, $list_alt58, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_SEXPR_MONITOR, READ_RAW, CYBLACK_SEXPR_MONITOR_READ_RAW_METHOD);
        methods.methods_incorporate_instance_method(WRITE_RAW, CYBLACK_SEXPR_MONITOR, $list_alt58, $list_alt67, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_SEXPR_MONITOR, WRITE_RAW, CYBLACK_SEXPR_MONITOR_WRITE_RAW_METHOD);
        return NIL;
    }



    static private final SubLString $str_alt1$CYBLACK_SEXPR_MONITOR_RAW_TO_POST = makeString("CYBLACK-SEXPR-MONITOR-RAW-TO-POSTING-FUNCTION: ~S is not a valid datatype string.");

    static private final SubLString $str_alt2$CYBLACK_SEXPR_MONITOR_RAW_TO_POST = makeString("CYBLACK-SEXPR-MONITOR-RAW-TO-POSTING-FUNCTION: ~S is not a valid plist.");

    static private final SubLString $str_alt3$CYBLACK_SEXPR_MONITOR_RAW_TO_POST = makeString("CYBLACK-SEXPR-MONITOR-RAW-TO-POSTING-FUNCTION: Datatype string ~S ~\n                           does not map to a posting type.");







    static private final SubLString $str_alt7$CYBLACK_SEXPR_MONITOR_RAW_TO_POST = makeString("CYBLACK-SEXPR-MONITOR-RAW-TO-POSTING-FUNCTION: ~S is not of the form:~% ~\n                     (<Datatype String> <slot/value sequence>).");

    static private final SubLString $str_alt8$CYBLACK_SEXPR_MONITOR_RAW_TO_POST = makeString("CYBLACK-SEXPR-MONITOR-RAW-TO-POSTING-FUNCTION: Could not translate ~S ~\n              because *CYBLACK-APPLICATION* is unbound.");

    static private final SubLString $str_alt9$CYBLACK_SEXPR_MONITOR_POSTING_TO_ = makeString("CYBLACK-SEXPR-MONITOR-POSTING-TO-RAW-FUNCTION: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt11$UNKNOWN_POSTING_TYPE = makeString("UNKNOWN-POSTING-TYPE");

    static private final SubLString $str_alt12$CYBLACK_SEXPR_MONITOR_REMOVAL_TO_ = makeString("CYBLACK-SEXPR-MONITOR-REMOVAL-TO-RAW-FUNCTION: ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol $UNPOST = makeKeyword("UNPOST");

    private static final SubLSymbol CYBLACK_SEXPR_MONITOR = makeSymbol("CYBLACK-SEXPR-MONITOR");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR = makeSymbol("CYBLACK-IO-STREAM-MONITOR");

    static private final SubLList $list_alt16 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("READ-RAW"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WRITE-RAW"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")));





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEXPR_MONITOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEXPR-MONITOR-CLASS");



    private static final SubLSymbol CYBLACK_BASIC_MONITOR = makeSymbol("CYBLACK-BASIC-MONITOR");

















    private static final SubLSymbol PANEL_LIST = makeSymbol("PANEL-LIST");



    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR");











    private static final SubLSymbol INCOMING_SLEEP_INTERVAL = makeSymbol("INCOMING-SLEEP-INTERVAL");

    private static final SubLSymbol OUTGOING_SLEEP_INTERVAL = makeSymbol("OUTGOING-SLEEP-INTERVAL");

    private static final SubLSymbol BLACKBOARD_CONNECTION_SLEEP_INTERVAL = makeSymbol("BLACKBOARD-CONNECTION-SLEEP-INTERVAL");





    private static final SubLSymbol NORMAL_PROMPT = makeSymbol("NORMAL-PROMPT");

    private static final SubLSymbol DEFAULT_ERROR_PROMPT = makeSymbol("DEFAULT-ERROR-PROMPT");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEXPR_MONITOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEXPR-MONITOR-INSTANCE");



    static private final SubLList $list_alt49 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt50 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("NORMAL-PROMPT"), makeString("~%Symbolic Expression > ")), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT-ERROR-PROMPT"), makeString("~%Unable to process input.  Please try again.")), list(makeSymbol("CSETQ"), makeSymbol("RAW-TO-POSTING-FUNCTION"), list(QUOTE, makeSymbol("CYBLACK-SEXPR-MONITOR-RAW-TO-POSTING-FUNCTION"))), list(makeSymbol("CSETQ"), makeSymbol("POSTING-TO-RAW-FUNCTION"), list(QUOTE, makeSymbol("CYBLACK-SEXPR-MONITOR-POSTING-TO-RAW-FUNCTION"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym51$OUTER_CATCH_FOR_CYBLACK_SEXPR_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SEXPR-MONITOR-METHOD");

    static private final SubLString $str_alt52$__Symbolic_Expression___ = makeString("~%Symbolic Expression > ");

    static private final SubLString $str_alt53$__Unable_to_process_input___Pleas = makeString("~%Unable to process input.  Please try again.");

    private static final SubLSymbol CYBLACK_SEXPR_MONITOR_RAW_TO_POSTING_FUNCTION = makeSymbol("CYBLACK-SEXPR-MONITOR-RAW-TO-POSTING-FUNCTION");

    private static final SubLSymbol CYBLACK_SEXPR_MONITOR_POSTING_TO_RAW_FUNCTION = makeSymbol("CYBLACK-SEXPR-MONITOR-POSTING-TO-RAW-FUNCTION");

    private static final SubLSymbol CYBLACK_SEXPR_MONITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-SEXPR-MONITOR-INITIALIZE-METHOD");

    private static final SubLSymbol READ_RAW = makeSymbol("READ-RAW");

    static private final SubLList $list_alt58 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt59 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INPUT"), list(makeSymbol("READ"), makeSymbol("INPUT-STREAM")))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("INPUT"), makeKeyword("Q")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("HALT"))), list(RET, NIL)), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("INPUT"), makeKeyword("A")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("HALT-AND-ABORT-SERVER"))), list(RET, NIL)), list(RET, makeSymbol("INPUT"))));

    static private final SubLSymbol $sym60$OUTER_CATCH_FOR_CYBLACK_SEXPR_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SEXPR-MONITOR-METHOD");







    private static final SubLSymbol HALT_AND_ABORT_SERVER = makeSymbol("HALT-AND-ABORT-SERVER");

    private static final SubLSymbol CYBLACK_SEXPR_MONITOR_READ_RAW_METHOD = makeSymbol("CYBLACK-SEXPR-MONITOR-READ-RAW-METHOD");

    private static final SubLSymbol WRITE_RAW = makeSymbol("WRITE-RAW");

    static private final SubLList $list_alt67 = list(makeSymbol("OBJECT"));

    static private final SubLList $list_alt68 = list(list(makeSymbol("FORMAT"), makeSymbol("OUTPUT-STREAM"), makeString("~%Cyblack: ~S~%"), makeSymbol("OBJECT")), list(makeSymbol("FORCE-OUTPUT"), makeSymbol("OUTPUT-STREAM")), list(RET, makeSymbol("OBJECT")));

    static private final SubLSymbol $sym69$OUTER_CATCH_FOR_CYBLACK_SEXPR_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SEXPR-MONITOR-METHOD");

    static private final SubLString $str_alt70$__Cyblack___S__ = makeString("~%Cyblack: ~S~%");

    private static final SubLSymbol CYBLACK_SEXPR_MONITOR_WRITE_RAW_METHOD = makeSymbol("CYBLACK-SEXPR-MONITOR-WRITE-RAW-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_sexpr_monitor_file();
    }

    public void initializeVariables() {
        init_cyblack_sexpr_monitor_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_sexpr_monitor_file();
    }
}

