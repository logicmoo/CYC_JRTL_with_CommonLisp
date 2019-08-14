/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_macro;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.output_stream_p;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class connection_guarding extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new connection_guarding();

 public static final String myName = "com.cyc.cycjava.cycl.connection_guarding";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$TASK_INFO = makeUninternedSymbol("TASK-INFO");

    static private final SubLList $list2 = list(list(makeSymbol("GET-CURRENT-TASK-PROCESSOR-INFO-HELPER")));

    private static final SubLSymbol WITH_GUARDIAN_REQUEST = makeSymbol("WITH-GUARDIAN-REQUEST");

    static private final SubLList $list6 = list(QUOTE, makeSymbol("TASK-INFO-HAS-VALID-SOCKET?"));

    static private final SubLList $list7 = list(list(QUOTE, makeSymbol("ABANDON-CURRENT-TASK-DUE-TO-SOCKET-LOSS")));

    private static final SubLSymbol WITH_TERMINATION_ON_LOST_CONNECTION = makeSymbol("WITH-TERMINATION-ON-LOST-CONNECTION");

    static private final SubLList $list10 = list(makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str11$Execute_the_body_under_the_assump = makeString("Execute the body under the assumption that ");

    private static final SubLSymbol GET_CURRENT_TASK_PROCESSOR_INFO_HELPER = makeSymbol("GET-CURRENT-TASK-PROCESSOR-INFO-HELPER");

    static private final SubLSymbol $sym13$TASK_INFO_HAS_VALID_SOCKET_ = makeSymbol("TASK-INFO-HAS-VALID-SOCKET?");

    private static final SubLSymbol ABANDON_CURRENT_TASK_DUE_TO_SOCKET_LOSS = makeSymbol("ABANDON-CURRENT-TASK-DUE-TO-SOCKET-LOSS");

    // Definitions
    /**
     * Execute the body under the assumption that
     */
    @LispMethod(comment = "Execute the body under the assumption that")
    public static final SubLObject with_termination_on_lost_connection_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject task_info = $sym0$TASK_INFO;
            return list(CLET, list(bq_cons(task_info, $list_alt2)), list(PIF, list(NULL, task_info), listS(WITH_GUARDIAN_REQUEST, listS($list_alt6, task_info, $list_alt7), append(body, NIL)), bq_cons(PROGN, append(body, NIL))));
        }
    }

    // Definitions
    /**
     * Execute the body under the assumption that
     */
    @LispMethod(comment = "Execute the body under the assumption that")
    public static SubLObject with_termination_on_lost_connection(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject task_info = $sym0$TASK_INFO;
        return list(CLET, list(bq_cons(task_info, $list2)), list(PIF, list(NULL, task_info), listS(WITH_GUARDIAN_REQUEST, listS($list6, task_info, $list7), append(body, NIL)), bq_cons(PROGN, append(body, NIL))));
    }

    public static final SubLObject get_current_task_processor_info_helper_alt() {
        return task_processor.get_current_task_processor_info();
    }

    public static SubLObject get_current_task_processor_info_helper() {
        return task_processor.get_current_task_processor_info();
    }

    public static final SubLObject task_info_has_valid_socketP_alt(SubLObject task_info) {
        return com.cyc.cycjava.cycl.connection_guarding.valid_java_socket_p(com.cyc.cycjava.cycl.connection_guarding.get_socket_for_current_task_request(task_info));
    }

    public static SubLObject task_info_has_valid_socketP(final SubLObject task_info) {
        return valid_java_socket_p(get_socket_for_current_task_request(task_info));
    }

    /**
     * This will run in the Guardian process.
     */
    @LispMethod(comment = "This will run in the Guardian process.")
    public static final SubLObject abandon_current_task_due_to_socket_loss_alt(SubLObject task_info) {
        {
            SubLObject task_giveback_info = task_processor.get_task_info_giveback_info(task_info);
            SubLObject task_id = task_processor.get_task_info_id(task_info);
            task_processor.terminate_active_task_process(task_id, task_giveback_info, $ABORT);
        }
        return NIL;
    }

    /**
     * This will run in the Guardian process.
     */
    @LispMethod(comment = "This will run in the Guardian process.")
    public static SubLObject abandon_current_task_due_to_socket_loss(final SubLObject task_info) {
        final SubLObject task_giveback_info = task_processor.get_task_info_giveback_info(task_info);
        final SubLObject task_id = task_processor.get_task_info_id(task_info);
        task_processor.terminate_active_task_process(task_id, task_giveback_info, $ABORT);
        return NIL;
    }

    public static final SubLObject get_socket_for_current_task_request_alt(SubLObject task_info) {
        {
            SubLObject socket = NIL;
            if (NIL != task_info) {
                {
                    SubLObject uuid_string = task_processor.get_task_info_giveback_info(task_info);
                    socket = java_api_kernel.java_api_socket_out_stream(uuid_string);
                }
            }
            return socket;
        }
    }

    public static SubLObject get_socket_for_current_task_request(final SubLObject task_info) {
        SubLObject socket = NIL;
        if (NIL != task_info) {
            final SubLObject uuid_string = task_processor.get_task_info_giveback_info(task_info);
            socket = java_api_kernel.java_api_socket_out_stream(uuid_string);
        }
        return socket;
    }

    public static final SubLObject valid_java_socket_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isStream() && (NIL != output_stream_p(v_object)));
    }

    public static SubLObject valid_java_socket_p(final SubLObject v_object) {
        return makeBoolean(v_object.isStream() && (NIL != output_stream_p(v_object)));
    }

    public static SubLObject declare_connection_guarding_file() {
        declareMacro("with_termination_on_lost_connection", "WITH-TERMINATION-ON-LOST-CONNECTION");
        declareFunction("get_current_task_processor_info_helper", "GET-CURRENT-TASK-PROCESSOR-INFO-HELPER", 0, 0, false);
        declareFunction("task_info_has_valid_socketP", "TASK-INFO-HAS-VALID-SOCKET?", 1, 0, false);
        declareFunction("abandon_current_task_due_to_socket_loss", "ABANDON-CURRENT-TASK-DUE-TO-SOCKET-LOSS", 1, 0, false);
        declareFunction("get_socket_for_current_task_request", "GET-SOCKET-FOR-CURRENT-TASK-REQUEST", 1, 0, false);
        declareFunction("valid_java_socket_p", "VALID-JAVA-SOCKET-P", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("GET-CURRENT-TASK-PROCESSOR-INFO-HELPER")));

    public static SubLObject init_connection_guarding_file() {
        return NIL;
    }

    public static SubLObject setup_connection_guarding_file() {
        register_cyc_api_macro(WITH_TERMINATION_ON_LOST_CONNECTION, $list10, $str11$Execute_the_body_under_the_assump);
        register_macro_helper(GET_CURRENT_TASK_PROCESSOR_INFO_HELPER, WITH_TERMINATION_ON_LOST_CONNECTION);
        register_macro_helper($sym13$TASK_INFO_HAS_VALID_SOCKET_, WITH_TERMINATION_ON_LOST_CONNECTION);
        register_macro_helper(ABANDON_CURRENT_TASK_DUE_TO_SOCKET_LOSS, WITH_TERMINATION_ON_LOST_CONNECTION);
        return NIL;
    }

    static private final SubLList $list_alt6 = list(QUOTE, makeSymbol("TASK-INFO-HAS-VALID-SOCKET?"));

    static private final SubLList $list_alt7 = list(list(QUOTE, makeSymbol("ABANDON-CURRENT-TASK-DUE-TO-SOCKET-LOSS")));

    static private final SubLList $list_alt10 = list(makeSymbol("&BODY"), makeSymbol("BODY"));

    @Override
    public void declareFunctions() {
        declare_connection_guarding_file();
    }

    static private final SubLString $str_alt11$Execute_the_body_under_the_assump = makeString("Execute the body under the assumption that ");

    @Override
    public void initializeVariables() {
        init_connection_guarding_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_connection_guarding_file();
    }

    static {
    }
}

/**
 * Total time: 92 ms
 */
