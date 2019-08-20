/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.control_vars.set_caught_up_on_master_transcript;
import static com.cyc.cycjava.cycl.operation_queues.add_to_remote_queue;
import static com.cyc.cycjava.cycl.operation_queues.transmit_queue_dequeue;
import static com.cyc.cycjava.cycl.operation_queues.transmit_queue_empty;
import static com.cyc.cycjava.cycl.operation_queues.transmit_queue_size;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.unread_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      TRANSCRIPT-SERVER
 * source file: /cyc/top/cycl/transcript-server.lisp
 * created:     2019/07/03 17:37:50
 */
public final class transcript_server extends SubLTranslatedFile implements V12 {
    /**
     * Return the total number of master transcript operations in KB.
     */
    @LispMethod(comment = "Return the total number of master transcript operations in KB.")
    public static final SubLObject total_master_transcript_operations(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject connected = NIL;
                                    SubLObject incomplete = NIL;
                                    SubLObject channel = NIL;
                                    try {
                                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), $master_transcript_server_connection_timeout$.getGlobalValue(), $PRIVATE);
                                        if (NIL != channel) {
                                            connected = T;
                                            {
                                                SubLObject tag = with_timeout_make_tag();
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_10 = $within_with_timeout$.currentBinding(thread);
                                                        try {
                                                            $within_with_timeout$.bind(T, thread);
                                                            {
                                                                SubLObject timer = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_11 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                        try {
                                                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                            timer = with_timeout_start_timer($int$45, tag);
                                                                            if (NIL != com.cyc.cycjava.cycl.transcript_server.transcript_server_message_startup(channel)) {
                                                                                total = com.cyc.cycjava.cycl.transcript_server.ts_send_how_many_ops_message(channel, kb);
                                                                                com.cyc.cycjava.cycl.transcript_server.transcript_server_message_shutdown(channel);
                                                                            }
                                                                        } finally {
                                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_11, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            with_timeout_stop_timer(timer);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            $within_with_timeout$.rebind(_prev_bind_0_10, thread);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != channel) {
                                                    close(channel, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                    }
                                    if (NIL == connected) {
                                        Errors.error($str_alt51$Transcript_server_connection_time);
                                    }
                                    if (NIL != incomplete) {
                                        Errors.error($str_alt52$Transcript_server_operation_timeo);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (error_message.isString()) {
                    Errors.warn($str_alt21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring(UNPROVIDED), error_message);
                }
                return total;
            }
        }
    }

    public static final SubLFile me = new transcript_server();



    // deflexical
    /**
     * Timeout value (in seconds) when connecting with the transcript server.
     */
    @LispMethod(comment = "Timeout value (in seconds) when connecting with the transcript server.\ndeflexical")
    private static final SubLSymbol $master_transcript_server_connection_timeout$ = makeSymbol("*MASTER-TRANSCRIPT-SERVER-CONNECTION-TIMEOUT*");

    // defvar
    /**
     * The version of the transcript server protocol 0 = initial version 1 = current
     * version
     */
    @LispMethod(comment = "The version of the transcript server protocol 0 = initial version 1 = current\r\nversion\ndefvar\nThe version of the transcript server protocol 0 = initial version 1 = current\nversion")
    public static final SubLSymbol $transcript_server_protocol_version$ = makeSymbol("*TRANSCRIPT-SERVER-PROTOCOL-VERSION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $transcript_server_kb_ops_count_timeout$ = makeSymbol("*TRANSCRIPT-SERVER-KB-OPS-COUNT-TIMEOUT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $transcript_server_send_kb_ops_timeout$ = makeSymbol("*TRANSCRIPT-SERVER-SEND-KB-OPS-TIMEOUT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $transcript_server_send_chunk_size$ = makeSymbol("*TRANSCRIPT-SERVER-SEND-CHUNK-SIZE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("CHANNEL"), makeSymbol("&KEY"), makeSymbol("OPERATION-TIMEOUT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list(makeKeyword("OPERATION-TIMEOUT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym4$ERROR_MESSAGE = makeUninternedSymbol("ERROR-MESSAGE");

    static private final SubLSymbol $sym5$CONNECTED = makeUninternedSymbol("CONNECTED");

    static private final SubLSymbol $sym6$INCOMPLETE = makeUninternedSymbol("INCOMPLETE");

    static private final SubLList $list10 = list(makeSymbol("*MASTER-TRANSCRIPT-LOCK-HOST*"), makeSymbol("*MASTER-TRANSCRIPT-SERVER-PORT*"), makeKeyword("TIMEOUT"), makeSymbol("*MASTER-TRANSCRIPT-SERVER-CONNECTION-TIMEOUT*"), makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE"));

    static private final SubLList $list12 = list(T);

    static private final SubLList $list16 = list(list(makeSymbol("ERROR"), makeString("Transcript server connection timeout")));

    static private final SubLList $list18 = list(list(makeSymbol("ERROR"), makeString("Transcript server operation timeout")));

    static private final SubLString $str21$_A__Error_while_connecting_to_tra = makeString("~A: Error while connecting to transcript server!~%~A~%");

    static private final SubLList $list22 = list(makeSymbol("TIMESTRING"));

    static private final SubLList $list23 = list(makeSymbol("CHANNEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol TRANSCRIPT_SERVER_MESSAGE_STARTUP = makeSymbol("TRANSCRIPT-SERVER-MESSAGE-STARTUP");

    private static final SubLSymbol TRANSCRIPT_SERVER_MESSAGE_SHUTDOWN = makeSymbol("TRANSCRIPT-SERVER-MESSAGE-SHUTDOWN");

    static private final SubLString $str26$Connection_to_transcript_server_w = makeString("Connection to transcript server was not cleanly closed");

    static private final SubLString $$$400 = makeString("400");

    static private final SubLString $$$200 = makeString("200");

    static private final SubLString $str31$Set_Image__A = makeString("Set-Image ~A");

    static private final SubLString $$$201 = makeString("201");

    static private final SubLString $str33$Set_KB__A = makeString("Set-KB ~A");

    static private final SubLString $$$202 = makeString("202");

    static private final SubLString $str35$Set_Op__A = makeString("Set-Op ~A");

    static private final SubLString $$$203 = makeString("203");

    static private final SubLString $$$210 = makeString("210");

    static private final SubLString $$$211 = makeString("211");

    static private final SubLString $$$212 = makeString("212");

    static private final SubLString $str40$How_Many_Ops__A = makeString("How-Many-Ops ~A");

    static private final SubLString $$$207 = makeString("207");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str44$Send_Ops__A = makeString("Send-Ops ~A");

    private static final SubLString $str45$_A = makeString("~A");

    private static final SubLString $$$204 = makeString("204");

    private static final SubLString $str47$Submit_Ops__A__A = makeString("Submit-Ops ~A ~A");

    private static final SubLString $$$208 = makeString("208");

    private static final SubLString $str49$Get_Ops__A = makeString("Get-Ops ~A");

    private static final SubLString $$$205 = makeString("205");

    private static final SubLString $$$Quit = makeString("Quit");

    private static final SubLString $$$206 = makeString("206");

    private static final SubLString $str55$Transcript_server_connection_time = makeString("Transcript server connection timeout");

    private static final SubLString $str56$Transcript_server_operation_timeo = makeString("Transcript server operation timeout");

    private static final SubLInteger $int$600 = makeInteger(600);

    private static final SubLSymbol $sym58$_EXIT = makeSymbol("%EXIT");

    private static final SubLInteger $int$240 = makeInteger(240);

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLString $str61$Error_sending_operations_to_serve = makeString("Error sending operations to server");

    private static final SubLString $str62$Error_submitting_operations_to_se = makeString("Error submitting operations to server file ~A");

    // Definitions
    /**
     * Accessor for *use-transcript-server*.
     */
    @LispMethod(comment = "Accessor for *use-transcript-server*.")
    public static final SubLObject use_transcript_server_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return system_parameters.$use_transcript_server$.getDynamicValue(thread);
        }
    }

    // Definitions
    /**
     * Accessor for *use-transcript-server*.
     */
    @LispMethod(comment = "Accessor for *use-transcript-server*.")
    public static SubLObject use_transcript_server() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_parameters.$use_transcript_server$.getDynamicValue(thread);
    }

    /**
     * Evaluate BODY within CHANNEL as a connection to the transcript server.
     */
    @LispMethod(comment = "Evaluate BODY within CHANNEL as a connection to the transcript server.")
    public static final SubLObject with_transcript_server_connection_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject channel = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    channel = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject operation_timeout_tail = property_list_member($OPERATION_TIMEOUT, current);
                            SubLObject operation_timeout = (NIL != operation_timeout_tail) ? ((SubLObject) (cadr(operation_timeout_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject error_message = $sym4$ERROR_MESSAGE;
                                SubLObject connected = $sym5$CONNECTED;
                                SubLObject incomplete = $sym6$INCOMPLETE;
                                return list(CLET, list(error_message), list(CATCH_ERROR_MESSAGE, list(error_message), list(CLET, list(connected, incomplete), list(WITH_TCP_CONNECTION, bq_cons(channel, $list_alt10), listS(CSETQ, connected, $list_alt12), NIL != operation_timeout ? ((SubLObject) (listS(WITH_TIMEOUT, list(operation_timeout, incomplete), append(body, NIL)))) : bq_cons(PROGN, append(body, NIL))), listS(PUNLESS, connected, $list_alt16), listS(PWHEN, incomplete, $list_alt18))), list(PWHEN, list(STRINGP, error_message), list(WARN, $str_alt21$_A__Error_while_connecting_to_tra, $list_alt22, error_message)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Evaluate BODY within CHANNEL as a connection to the transcript server.
     */
    @LispMethod(comment = "Evaluate BODY within CHANNEL as a connection to the transcript server.")
    public static SubLObject with_transcript_server_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject channel = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        channel = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject operation_timeout_tail = property_list_member($OPERATION_TIMEOUT, current);
        final SubLObject operation_timeout = (NIL != operation_timeout_tail) ? cadr(operation_timeout_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject error_message = $sym4$ERROR_MESSAGE;
        final SubLObject connected = $sym5$CONNECTED;
        final SubLObject incomplete = $sym6$INCOMPLETE;
        return list(CLET, list(error_message), list(CATCH_ERROR_MESSAGE, list(error_message), list(CLET, list(connected, incomplete), list(WITH_TCP_CONNECTION, bq_cons(channel, $list10), listS(CSETQ, connected, $list12), NIL != operation_timeout ? listS(WITH_TIMEOUT, list(operation_timeout, incomplete), append(body, NIL)) : bq_cons(PROGN, append(body, NIL))), listS(PUNLESS, connected, $list16), listS(PWHEN, incomplete, $list18))), list(PWHEN, list(STRINGP, error_message), list(WARN, $str21$_A__Error_while_connecting_to_tra, $list22, error_message)));
    }

    public static final SubLObject transcript_server_message_body_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject channel = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            channel = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PWHEN, list(TRANSCRIPT_SERVER_MESSAGE_STARTUP, channel), append(body, list(list(TRANSCRIPT_SERVER_MESSAGE_SHUTDOWN, channel))));
            }
        }
    }

    public static SubLObject transcript_server_message_body(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject channel = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        channel = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PWHEN, list(TRANSCRIPT_SERVER_MESSAGE_STARTUP, channel), append(body, list(list(TRANSCRIPT_SERVER_MESSAGE_SHUTDOWN, channel))));
    }

    /**
     * This private function performs the commands the server requires before the client can do anything.
     * Namely, setting the image, KB, and number of operations already received.
     * It is very important to note that calls to transcript-server-message-startup
     * can have a side effect on *allow-transmitting*
     */
    @LispMethod(comment = "This private function performs the commands the server requires before the client can do anything.\r\nNamely, setting the image, KB, and number of operations already received.\r\nIt is very important to note that calls to transcript-server-message-startup\r\ncan have a side effect on *allow-transmitting*\nThis private function performs the commands the server requires before the client can do anything.\nNamely, setting the image, KB, and number of operations already received.\nIt is very important to note that calls to transcript-server-message-startup\ncan have a side effect on *allow-transmitting*")
    public static final SubLObject transcript_server_message_startup_alt(SubLObject channel) {
        if (NIL == com.cyc.cycjava.cycl.transcript_server.ts_ack_server_connection(channel)) {
            return NIL;
        }
        if (NIL == com.cyc.cycjava.cycl.transcript_server.ts_send_set_image_message(channel)) {
            return NIL;
        }
        if (NIL == com.cyc.cycjava.cycl.transcript_server.ts_send_set_kb_message(channel)) {
            return NIL;
        }
        if (NIL == com.cyc.cycjava.cycl.transcript_server.ts_send_set_op_message(channel)) {
            return NIL;
        }
        return T;
    }

    /**
     * This private function performs the commands the server requires before the client can do anything.
     * Namely, setting the image, KB, and number of operations already received.
     * It is very important to note that calls to transcript-server-message-startup
     * can have a side effect on *allow-transmitting*
     */
    @LispMethod(comment = "This private function performs the commands the server requires before the client can do anything.\r\nNamely, setting the image, KB, and number of operations already received.\r\nIt is very important to note that calls to transcript-server-message-startup\r\ncan have a side effect on *allow-transmitting*\nThis private function performs the commands the server requires before the client can do anything.\nNamely, setting the image, KB, and number of operations already received.\nIt is very important to note that calls to transcript-server-message-startup\ncan have a side effect on *allow-transmitting*")
    public static SubLObject transcript_server_message_startup(final SubLObject channel) {
        if (NIL == ts_ack_server_connection(channel)) {
            return NIL;
        }
        if (NIL == ts_send_set_image_message(channel)) {
            return NIL;
        }
        if (NIL == ts_send_set_kb_message(channel)) {
            return NIL;
        }
        if (NIL == ts_send_set_op_message(channel)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject transcript_server_message_shutdown_alt(SubLObject channel) {
        if (NIL != com.cyc.cycjava.cycl.transcript_server.ts_send_quit_message(channel)) {
            return T;
        }
        Errors.warn($str_alt26$Connection_to_transcript_server_w);
        return NIL;
    }

    public static SubLObject transcript_server_message_shutdown(final SubLObject channel) {
        if (NIL != ts_send_quit_message(channel)) {
            return T;
        }
        Errors.warn($str26$Connection_to_transcript_server_w);
        return NIL;
    }

    public static final SubLObject transcript_server_terpri_alt(SubLObject channel, SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = T;
        }
        write_char(code_char(TEN_INTEGER), channel);
        write_char(code_char(THIRTEEN_INTEGER), channel);
        if (NIL != forceP) {
            force_output(channel);
        }
        return NIL;
    }

    public static SubLObject transcript_server_terpri(final SubLObject channel, SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = T;
        }
        write_char(code_char(TEN_INTEGER), channel);
        write_char(code_char(THIRTEEN_INTEGER), channel);
        if (NIL != forceP) {
            force_output(channel);
        }
        return NIL;
    }

    public static final SubLObject transcript_server_read_line_alt(SubLObject channel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject reply = string_utilities.network_read_line(channel, NIL, $EOF);
                SubLObject status = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ($ERROR == status) {
                    return $$$400;
                }
                return reply;
            }
        }
    }

    public static SubLObject transcript_server_read_line(final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject reply = string_utilities.network_read_line(channel, NIL, $EOF, UNPROVIDED);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ($ERROR == status) {
            return $$$400;
        }
        return reply;
    }

    public static final SubLObject transcript_server_reply_verify_alt(SubLObject code, SubLObject reply) {
        return list_utilities.sublisp_boolean(string_utilities.starts_with(reply, code));
    }

    public static SubLObject transcript_server_reply_verify(final SubLObject code, final SubLObject reply) {
        return list_utilities.sublisp_boolean(string_utilities.starts_with(reply, code));
    }

    /**
     * Acknowledge the initial connection response from the server.
     */
    @LispMethod(comment = "Acknowledge the initial connection response from the server.")
    public static final SubLObject ts_ack_server_connection_alt(SubLObject channel) {
        {
            SubLObject reply = com.cyc.cycjava.cycl.transcript_server.transcript_server_read_line(channel);
            return com.cyc.cycjava.cycl.transcript_server.transcript_server_reply_verify($$$200, reply);
        }
    }

    /**
     * Acknowledge the initial connection response from the server.
     */
    @LispMethod(comment = "Acknowledge the initial connection response from the server.")
    public static SubLObject ts_ack_server_connection(final SubLObject channel) {
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$200, reply);
    }

    /**
     * Private function that sends the Set-Image command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the Set-Image command to the server and checks the response.")
    public static final SubLObject ts_send_set_image_message_alt(SubLObject channel) {
        format(channel, $str_alt31$Set_Image__A, cyc_image_id());
        com.cyc.cycjava.cycl.transcript_server.transcript_server_terpri(channel, UNPROVIDED);
        {
            SubLObject reply = com.cyc.cycjava.cycl.transcript_server.transcript_server_read_line(channel);
            return com.cyc.cycjava.cycl.transcript_server.transcript_server_reply_verify($$$201, reply);
        }
    }

    /**
     * Private function that sends the Set-Image command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the Set-Image command to the server and checks the response.")
    public static SubLObject ts_send_set_image_message(final SubLObject channel) {
        format(channel, $str31$Set_Image__A, cyc_image_id());
        transcript_server_terpri(channel, UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$201, reply);
    }

    /**
     * Private function that sends the Set-KB command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the Set-KB command to the server and checks the response.")
    public static final SubLObject ts_send_set_kb_message_alt(SubLObject channel) {
        format(channel, $str_alt33$Set_KB__A, kb_loaded());
        com.cyc.cycjava.cycl.transcript_server.transcript_server_terpri(channel, UNPROVIDED);
        {
            SubLObject reply = com.cyc.cycjava.cycl.transcript_server.transcript_server_read_line(channel);
            return com.cyc.cycjava.cycl.transcript_server.transcript_server_reply_verify($$$202, reply);
        }
    }

    /**
     * Private function that sends the Set-KB command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the Set-KB command to the server and checks the response.")
    public static SubLObject ts_send_set_kb_message(final SubLObject channel) {
        format(channel, $str33$Set_KB__A, kb_loaded());
        transcript_server_terpri(channel, UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$202, reply);
    }

    /**
     * Private function that sends the Set-Op command to the server and checks the response.
     * Returns T if the responses are the expected result, otherwise returns nil.
     */
    @LispMethod(comment = "Private function that sends the Set-Op command to the server and checks the response.\r\nReturns T if the responses are the expected result, otherwise returns nil.\nPrivate function that sends the Set-Op command to the server and checks the response.\nReturns T if the responses are the expected result, otherwise returns nil.")
    public static final SubLObject ts_send_set_op_message_alt(SubLObject channel) {
        format(channel, $str_alt35$Set_Op__A, operation_communication.kb_op_number());
        com.cyc.cycjava.cycl.transcript_server.transcript_server_terpri(channel, UNPROVIDED);
        {
            SubLObject reply = com.cyc.cycjava.cycl.transcript_server.transcript_server_read_line(channel);
            if (NIL == com.cyc.cycjava.cycl.transcript_server.transcript_server_reply_verify($$$203, reply)) {
                return NIL;
            }
        }
        {
            SubLObject reply = com.cyc.cycjava.cycl.transcript_server.transcript_server_read_line(channel);
            if ((NIL != com.cyc.cycjava.cycl.transcript_server.transcript_server_reply_verify($$$210, reply)) || (NIL != com.cyc.cycjava.cycl.transcript_server.transcript_server_reply_verify($$$211, reply))) {
                operation_communication.set_allow_transmitting(T);
                return T;
            } else {
                if (NIL != com.cyc.cycjava.cycl.transcript_server.transcript_server_reply_verify($$$212, reply)) {
                    operation_communication.set_allow_transmitting(NIL);
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     * Private function that sends the Set-Op command to the server and checks the response.
     * Returns T if the responses are the expected result, otherwise returns nil.
     */
    @LispMethod(comment = "Private function that sends the Set-Op command to the server and checks the response.\r\nReturns T if the responses are the expected result, otherwise returns nil.\nPrivate function that sends the Set-Op command to the server and checks the response.\nReturns T if the responses are the expected result, otherwise returns nil.")
    public static SubLObject ts_send_set_op_message(final SubLObject channel) {
        format(channel, $str35$Set_Op__A, operation_communication.kb_op_number());
        transcript_server_terpri(channel, UNPROVIDED);
        SubLObject reply = transcript_server_read_line(channel);
        if (NIL == transcript_server_reply_verify($$$203, reply)) {
            return NIL;
        }
        reply = transcript_server_read_line(channel);
        if ((NIL != transcript_server_reply_verify($$$210, reply)) || (NIL != transcript_server_reply_verify($$$211, reply))) {
            operation_communication.set_allow_transmitting(T);
            return T;
        }
        if (NIL != transcript_server_reply_verify($$$212, reply)) {
            operation_communication.set_allow_transmitting(NIL);
            return T;
        }
        return NIL;
    }

    /**
     * Private function that sends the How-Many-Ops command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the How-Many-Ops command to the server and checks the response.")
    public static final SubLObject ts_send_how_many_ops_message_alt(SubLObject channel, SubLObject kb) {
        format(channel, $str_alt40$How_Many_Ops__A, kb);
        com.cyc.cycjava.cycl.transcript_server.transcript_server_terpri(channel, UNPROVIDED);
        {
            SubLObject reply = com.cyc.cycjava.cycl.transcript_server.transcript_server_read_line(channel);
            if (NIL != com.cyc.cycjava.cycl.transcript_server.transcript_server_reply_verify($$$207, reply)) {
                return read_from_string_ignoring_errors(reply, T, $EOF, number_utilities.f_1X(position(CHAR_period, reply, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Private function that sends the How-Many-Ops command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the How-Many-Ops command to the server and checks the response.")
    public static SubLObject ts_send_how_many_ops_message(final SubLObject channel, final SubLObject kb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = ZERO_INTEGER;
        format(channel, $str40$How_Many_Ops__A, kb);
        transcript_server_terpri(channel, UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        if (NIL != transcript_server_reply_verify($$$207, reply)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        result = read_from_string(reply, T, $EOF, number_utilities.f_1X(position(CHAR_period, reply, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        return result;
    }

    public static final SubLObject ts_send_send_ops_begin_message_alt(SubLObject channel, SubLObject count) {
        format(channel, $str_alt42$Send_Ops__A, count);
        com.cyc.cycjava.cycl.transcript_server.transcript_server_terpri(channel, UNPROVIDED);
        return NIL;
    }

    public static SubLObject ts_send_send_ops_begin_message(final SubLObject channel, final SubLObject count) {
        format(channel, $str44$Send_Ops__A, count);
        transcript_server_terpri(channel, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject ts_send_send_ops_op_alt(SubLObject channel, SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject operation_string = prin1_to_string(op);
                if (ONE_INTEGER.numE($transcript_server_protocol_version$.getDynamicValue(thread))) {
                    format(channel, $str_alt43$_A, length(operation_string));
                    com.cyc.cycjava.cycl.transcript_server.transcript_server_terpri(channel, NIL);
                }
                princ(operation_string, channel);
                com.cyc.cycjava.cycl.transcript_server.transcript_server_terpri(channel, NIL);
            }
            return NIL;
        }
    }

    public static SubLObject ts_send_send_ops_op(final SubLObject channel, final SubLObject op) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_level$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            final SubLObject operation_string = prin1_to_string(op);
            if (ONE_INTEGER.numE($transcript_server_protocol_version$.getDynamicValue(thread))) {
                format(channel, $str45$_A, length(operation_string));
                transcript_server_terpri(channel, NIL);
            }
            princ(operation_string, channel);
            transcript_server_terpri(channel, NIL);
        } finally {
            $print_level$.rebind(_prev_bind_3, thread);
            $print_length$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject ts_send_send_ops_end_message_alt(SubLObject channel) {
        return force_output(channel);
    }

    public static SubLObject ts_send_send_ops_end_message(final SubLObject channel) {
        return force_output(channel);
    }

    public static final SubLObject ts_read_send_ops_reply_alt(SubLObject channel) {
        {
            SubLObject reply = com.cyc.cycjava.cycl.transcript_server.transcript_server_read_line(channel);
            return com.cyc.cycjava.cycl.transcript_server.transcript_server_reply_verify($$$204, reply);
        }
    }

    public static SubLObject ts_read_send_ops_reply(final SubLObject channel) {
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$204, reply);
    }

    public static SubLObject ts_send_submit_ops_begin_message(final SubLObject channel, final SubLObject count, final SubLObject relative_filename) {
        format(channel, $str47$Submit_Ops__A__A, count, relative_filename);
        transcript_server_terpri(channel, UNPROVIDED);
        return NIL;
    }

    public static SubLObject ts_send_submit_ops_op(final SubLObject channel, final SubLObject op) {
        return ts_send_send_ops_op(channel, op);
    }

    public static SubLObject ts_send_submit_ops_end_message(final SubLObject channel) {
        return force_output(channel);
    }

    public static SubLObject ts_read_submit_ops_reply(final SubLObject channel) {
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$208, reply);
    }

    /**
     * Private function that sends the Get-Ops command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the Get-Ops command to the server and checks the response.")
    public static final SubLObject ts_send_get_ops_message_alt(SubLObject channel) {
        format(channel, $str_alt45$Get_Ops__A, operation_communication.read_transcript_op_limit());
        com.cyc.cycjava.cycl.transcript_server.transcript_server_terpri(channel, UNPROVIDED);
        {
            SubLObject reply = com.cyc.cycjava.cycl.transcript_server.transcript_server_read_line(channel);
            return com.cyc.cycjava.cycl.transcript_server.transcript_server_reply_verify($$$205, reply);
        }
    }

    /**
     * Private function that sends the Get-Ops command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the Get-Ops command to the server and checks the response.")
    public static SubLObject ts_send_get_ops_message(final SubLObject channel) {
        format(channel, $str49$Get_Ops__A, operation_communication.read_transcript_op_limit());
        transcript_server_terpri(channel, UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$205, reply);
    }

    /**
     * Private function that sends the Quit command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the Quit command to the server and checks the response.")
    public static final SubLObject ts_send_quit_message_alt(SubLObject channel) {
        format(channel, $$$Quit);
        com.cyc.cycjava.cycl.transcript_server.transcript_server_terpri(channel, UNPROVIDED);
        {
            SubLObject reply = com.cyc.cycjava.cycl.transcript_server.transcript_server_read_line(channel);
            return com.cyc.cycjava.cycl.transcript_server.transcript_server_reply_verify($$$206, reply);
        }
    }

    /**
     * Private function that sends the Quit command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the Quit command to the server and checks the response.")
    public static SubLObject ts_send_quit_message(final SubLObject channel) {
        format(channel, $$$Quit);
        transcript_server_terpri(channel, UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$206, reply);
    }

    /**
     * This just establishes a connection to the transcript-server and quits.
     * See @xref transcript-server-check which also checks the standard protocol.
     * Returns T if the server is up and running.
     */
    @LispMethod(comment = "This just establishes a connection to the transcript-server and quits.\r\nSee @xref transcript-server-check which also checks the standard protocol.\r\nReturns T if the server is up and running.\nThis just establishes a connection to the transcript-server and quits.\nSee @xref transcript-server-check which also checks the standard protocol.\nReturns T if the server is up and running.")
    public static final SubLObject transcript_server_connection_check_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject running = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject connected = NIL;
                                    SubLObject incomplete = NIL;
                                    SubLObject channel = NIL;
                                    try {
                                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), $master_transcript_server_connection_timeout$.getGlobalValue(), $PRIVATE);
                                        if (NIL != channel) {
                                            connected = T;
                                            {
                                                SubLObject tag = with_timeout_make_tag();
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_2 = $within_with_timeout$.currentBinding(thread);
                                                        try {
                                                            $within_with_timeout$.bind(T, thread);
                                                            {
                                                                SubLObject timer = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_3 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                        try {
                                                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                            timer = with_timeout_start_timer(THREE_INTEGER, tag);
                                                                            if (NIL != com.cyc.cycjava.cycl.transcript_server.ts_ack_server_connection(channel)) {
                                                                                running = com.cyc.cycjava.cycl.transcript_server.transcript_server_message_shutdown(channel);
                                                                            }
                                                                        } finally {
                                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_3, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            with_timeout_stop_timer(timer);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            $within_with_timeout$.rebind(_prev_bind_0_2, thread);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != channel) {
                                                    close(channel, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                            }
                                        }
                                    }
                                    if (NIL == connected) {
                                        Errors.error($str_alt51$Transcript_server_connection_time);
                                    }
                                    if (NIL != incomplete) {
                                        Errors.error($str_alt52$Transcript_server_operation_timeo);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (error_message.isString()) {
                    Errors.warn($str_alt21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring(UNPROVIDED), error_message);
                }
                return running;
            }
        }
    }

    /**
     * This just establishes a connection to the transcript-server and quits.
     * See @xref transcript-server-check which also checks the standard protocol.
     * Returns T if the server is up and running.
     */
    @LispMethod(comment = "This just establishes a connection to the transcript-server and quits.\r\nSee @xref transcript-server-check which also checks the standard protocol.\r\nReturns T if the server is up and running.\nThis just establishes a connection to the transcript-server and quits.\nSee @xref transcript-server-check which also checks the standard protocol.\nReturns T if the server is up and running.")
    public static SubLObject transcript_server_connection_check() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject running = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject connected = NIL;
                    SubLObject incomplete = NIL;
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), $master_transcript_server_connection_timeout$.getGlobalValue(), $PRIVATE);
                        if (NIL != validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                            connected = T;
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$2 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$3 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(THREE_INTEGER, tag);
                                            if (NIL != ts_ack_server_connection(channel)) {
                                                running = transcript_server_message_shutdown(channel);
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$2, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    if (NIL == connected) {
                        Errors.error($str55$Transcript_server_connection_time);
                    }
                    if (NIL != incomplete) {
                        Errors.error($str56$Transcript_server_operation_timeo);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            Errors.warn($str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring(UNPROVIDED), error_message);
        }
        return running;
    }

    /**
     * This establishes a connection to the transcript-server
     * and verifies that the standard connection protocol is honored.
     * Returns T if the server is up and running.
     */
    @LispMethod(comment = "This establishes a connection to the transcript-server\r\nand verifies that the standard connection protocol is honored.\r\nReturns T if the server is up and running.\nThis establishes a connection to the transcript-server\nand verifies that the standard connection protocol is honored.\nReturns T if the server is up and running.")
    public static final SubLObject transcript_server_check_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject running = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject connected = NIL;
                                    SubLObject incomplete = NIL;
                                    SubLObject channel = NIL;
                                    try {
                                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), $master_transcript_server_connection_timeout$.getGlobalValue(), $PRIVATE);
                                        if (NIL != channel) {
                                            connected = T;
                                            {
                                                SubLObject tag = with_timeout_make_tag();
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_6 = $within_with_timeout$.currentBinding(thread);
                                                        try {
                                                            $within_with_timeout$.bind(T, thread);
                                                            {
                                                                SubLObject timer = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_7 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                        try {
                                                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                            timer = with_timeout_start_timer(THREE_INTEGER, tag);
                                                                            if (NIL != com.cyc.cycjava.cycl.transcript_server.transcript_server_message_startup(channel)) {
                                                                                running = T;
                                                                                com.cyc.cycjava.cycl.transcript_server.transcript_server_message_shutdown(channel);
                                                                            }
                                                                        } finally {
                                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_7, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            with_timeout_stop_timer(timer);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            $within_with_timeout$.rebind(_prev_bind_0_6, thread);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != channel) {
                                                    close(channel, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                    }
                                    if (NIL == connected) {
                                        Errors.error($str_alt51$Transcript_server_connection_time);
                                    }
                                    if (NIL != incomplete) {
                                        Errors.error($str_alt52$Transcript_server_operation_timeo);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (error_message.isString()) {
                    Errors.warn($str_alt21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring(UNPROVIDED), error_message);
                }
                return running;
            }
        }
    }

    /**
     * This establishes a connection to the transcript-server
     * and verifies that the standard connection protocol is honored.
     * Returns T if the server is up and running.
     */
    @LispMethod(comment = "This establishes a connection to the transcript-server\r\nand verifies that the standard connection protocol is honored.\r\nReturns T if the server is up and running.\nThis establishes a connection to the transcript-server\nand verifies that the standard connection protocol is honored.\nReturns T if the server is up and running.")
    public static SubLObject transcript_server_check() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject running = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject connected = NIL;
                    SubLObject incomplete = NIL;
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), $master_transcript_server_connection_timeout$.getGlobalValue(), $PRIVATE);
                        if (NIL != validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                            connected = T;
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$6 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$7 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(THREE_INTEGER, tag);
                                            if (NIL != transcript_server_message_startup(channel)) {
                                                running = T;
                                                transcript_server_message_shutdown(channel);
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$6, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                    if (NIL == connected) {
                        Errors.error($str55$Transcript_server_connection_time);
                    }
                    if (NIL != incomplete) {
                        Errors.error($str56$Transcript_server_operation_timeo);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            Errors.warn($str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring(UNPROVIDED), error_message);
        }
        return running;
    }

    public static SubLObject total_master_transcript_operations_patient(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $transcript_server_kb_ops_count_timeout$.currentBinding(thread);
        try {
            $transcript_server_kb_ops_count_timeout$.bind($int$600, thread);
            return transcript_utilities.total_master_transcript_operations(kb);
        } finally {
            $transcript_server_kb_ops_count_timeout$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject transcript_server_kb_ops_count(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject connected = NIL;
                    SubLObject incomplete = NIL;
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), $master_transcript_server_connection_timeout$.getGlobalValue(), $PRIVATE);
                        if (NIL != validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                            connected = T;
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$10 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$11 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer($transcript_server_kb_ops_count_timeout$.getDynamicValue(thread), tag);
                                            if (NIL != transcript_server_message_startup(channel)) {
                                                return ts_send_how_many_ops_message(channel, kb);
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$11, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$10, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                    if (NIL == connected) {
                        Errors.error($str55$Transcript_server_connection_time);
                    }
                    if (NIL != incomplete) {
                        Errors.error($str56$Transcript_server_operation_timeo);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            Errors.warn($str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring(UNPROVIDED), error_message);
        }
        return NIL;
    }

    /**
     * Sends all the operations in the transmit queue to the server.
     */
    @LispMethod(comment = "Sends all the operations in the transmit queue to the server.")
    public static final SubLObject send_operations_to_server_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == operation_communication.allow_transmitting()) {
                return NIL;
            }
            {
                SubLObject completed = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject connected = NIL;
                                    SubLObject incomplete = NIL;
                                    SubLObject channel = NIL;
                                    try {
                                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), $master_transcript_server_connection_timeout$.getGlobalValue(), $PRIVATE);
                                        if (NIL != channel) {
                                            connected = T;
                                            {
                                                SubLObject tag = with_timeout_make_tag();
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_14 = $within_with_timeout$.currentBinding(thread);
                                                        try {
                                                            $within_with_timeout$.bind(T, thread);
                                                            {
                                                                SubLObject timer = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_15 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                        try {
                                                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                            timer = with_timeout_start_timer($int$240, tag);
                                                                            if (NIL != com.cyc.cycjava.cycl.transcript_server.transcript_server_message_startup(channel)) {
                                                                                completed = com.cyc.cycjava.cycl.transcript_server.send_operations_to_server_internal(channel);
                                                                                com.cyc.cycjava.cycl.transcript_server.transcript_server_message_shutdown(channel);
                                                                            }
                                                                        } finally {
                                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_15, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            with_timeout_stop_timer(timer);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            $within_with_timeout$.rebind(_prev_bind_0_14, thread);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != channel) {
                                                    close(channel, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                                            }
                                        }
                                    }
                                    if (NIL == connected) {
                                        Errors.error($str_alt51$Transcript_server_connection_time);
                                    }
                                    if (NIL != incomplete) {
                                        Errors.error($str_alt52$Transcript_server_operation_timeo);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (error_message.isString()) {
                    Errors.warn($str_alt21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring(UNPROVIDED), error_message);
                }
                if (NIL == completed) {
                    Errors.warn($str_alt55$Error_sending_operations_to_serve);
                }
                return completed;
            }
        }
    }

    /**
     * Sends all the operations in the transmit queue to the server.
     */
    @LispMethod(comment = "Sends all the operations in the transmit queue to the server.")
    public static SubLObject send_operations_to_server() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == operation_communication.allow_transmitting()) {
            return NIL;
        }
        SubLObject completed = NIL;
        while (NIL == operation_queues.transmit_queue_empty()) {
            completed = NIL;
            SubLObject error_message = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        SubLObject connected = NIL;
                        SubLObject incomplete = NIL;
                        SubLObject channel = NIL;
                        try {
                            channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), $master_transcript_server_connection_timeout$.getGlobalValue(), $PRIVATE);
                            if (NIL != validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                                connected = T;
                                final SubLObject tag = with_timeout_make_tag();
                                try {
                                    thread.throwStack.push(tag);
                                    final SubLObject _prev_bind_0_$14 = $within_with_timeout$.currentBinding(thread);
                                    try {
                                        $within_with_timeout$.bind(T, thread);
                                        SubLObject timer = NIL;
                                        try {
                                            final SubLObject _prev_bind_0_$15 = $with_timeout_nesting_depth$.currentBinding(thread);
                                            try {
                                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                timer = with_timeout_start_timer($transcript_server_send_kb_ops_timeout$.getDynamicValue(thread), tag);
                                                if (NIL != transcript_server_message_startup(channel)) {
                                                    completed = send_operations_to_server_internal(channel);
                                                    transcript_server_message_shutdown(channel);
                                                }
                                            } finally {
                                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$15, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                with_timeout_stop_timer(timer);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                            }
                                        }
                                    } finally {
                                        $within_with_timeout$.rebind(_prev_bind_0_$14, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                                } finally {
                                    thread.throwStack.pop();
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != channel) {
                                    close(channel, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                            }
                        }
                        if (NIL == connected) {
                            Errors.error($str55$Transcript_server_connection_time);
                        }
                        if (NIL != incomplete) {
                            Errors.error($str56$Transcript_server_operation_timeo);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (error_message.isString()) {
                Errors.warn($str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring(UNPROVIDED), error_message);
            }
            if (NIL == completed) {
                Errors.warn($str61$Error_sending_operations_to_serve);
                return NIL;
            }
        } 
        return completed;
    }

    /**
     * Private function that sends the Send-Ops command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the Send-Ops command to the server and checks the response.")
    public static final SubLObject send_operations_to_server_internal_alt(SubLObject channel) {
        {
            SubLObject op_count = transmit_queue_size();
            com.cyc.cycjava.cycl.transcript_server.ts_send_send_ops_begin_message(channel, op_count);
            while (NIL == transmit_queue_empty()) {
                {
                    SubLObject op = transmit_queue_dequeue();
                    com.cyc.cycjava.cycl.transcript_server.ts_send_send_ops_op(channel, op);
                }
            } 
            com.cyc.cycjava.cycl.transcript_server.ts_send_send_ops_end_message(channel);
            return com.cyc.cycjava.cycl.transcript_server.ts_read_send_ops_reply(channel);
        }
    }

    /**
     * Private function that sends the Send-Ops command to the server and checks the response.
     */
    @LispMethod(comment = "Private function that sends the Send-Ops command to the server and checks the response.")
    public static SubLObject send_operations_to_server_internal(final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject op_count = operation_queues.transmit_queue_size();
        final SubLObject send_size = (NIL != subl_promotions.non_negative_integer_p($transcript_server_send_chunk_size$.getDynamicValue(thread))) ? min($transcript_server_send_chunk_size$.getDynamicValue(thread), op_count) : op_count;
        thread.resetMultipleValues();
        final SubLObject data = operation_queues.transmit_queue_peek_chunk(send_size);
        final SubLObject chunk_size = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ts_send_send_ops_begin_message(channel, chunk_size);
        SubLObject cdolist_list_var = data;
        SubLObject op = NIL;
        op = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ts_send_send_ops_op(channel, op);
            cdolist_list_var = cdolist_list_var.rest();
            op = cdolist_list_var.first();
        } 
        ts_send_send_ops_end_message(channel);
        if (NIL != ts_read_send_ops_reply(channel)) {
            return operation_queues.transmit_queue_remove_chunk(data);
        }
        return NIL;
    }/**
     * Private function that sends the Send-Ops command to the server and checks the response.
     */


    public static SubLObject submit_operations_to_server(final SubLObject relative_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == operation_communication.allow_transmitting()) {
            return NIL;
        }
        SubLObject completed = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject connected = NIL;
                    SubLObject incomplete = NIL;
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), $master_transcript_server_connection_timeout$.getGlobalValue(), $PRIVATE);
                        if (NIL != validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                            connected = T;
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$18 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$19 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer($int$240, tag);
                                            if (NIL != transcript_server_message_startup(channel)) {
                                                completed = submit_operations_to_server_internal(channel, relative_filename);
                                                transcript_server_message_shutdown(channel);
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$19, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$18, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                        }
                    }
                    if (NIL == connected) {
                        Errors.error($str55$Transcript_server_connection_time);
                    }
                    if (NIL != incomplete) {
                        Errors.error($str56$Transcript_server_operation_timeo);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            Errors.warn($str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring(UNPROVIDED), error_message);
        }
        if (NIL == completed) {
            Errors.warn($str62$Error_submitting_operations_to_se, relative_filename);
        }
        return completed;
    }

    public static SubLObject submit_operations_to_server_internal(final SubLObject channel, final SubLObject relative_filename) {
        final SubLObject op_count = operation_queues.transmit_queue_size();
        ts_send_submit_ops_begin_message(channel, op_count, relative_filename);
        while (NIL == operation_queues.transmit_queue_empty()) {
            final SubLObject op = operation_queues.transmit_queue_dequeue();
            ts_send_submit_ops_op(channel, op);
        } 
        ts_send_submit_ops_end_message(channel);
        return ts_read_submit_ops_reply(channel);
    }

    /**
     * Ask the transcript server for operations then read them in.
     */
    @LispMethod(comment = "Ask the transcript server for operations then read them in.")
    public static final SubLObject read_operations_from_server_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject completed = NIL;
                SubLObject op_count = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject connected = NIL;
                                    SubLObject incomplete = NIL;
                                    SubLObject channel = NIL;
                                    try {
                                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), $master_transcript_server_connection_timeout$.getGlobalValue(), $PRIVATE);
                                        if (NIL != channel) {
                                            connected = T;
                                            {
                                                SubLObject tag = with_timeout_make_tag();
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_18 = $within_with_timeout$.currentBinding(thread);
                                                        try {
                                                            $within_with_timeout$.bind(T, thread);
                                                            {
                                                                SubLObject timer = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_19 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                        try {
                                                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                            timer = with_timeout_start_timer(TWENTY_INTEGER, tag);
                                                                            if (NIL != com.cyc.cycjava.cycl.transcript_server.transcript_server_message_startup(channel)) {
                                                                                op_count = com.cyc.cycjava.cycl.transcript_server.read_operations_from_server_internal(channel);
                                                                                completed = T;
                                                                                com.cyc.cycjava.cycl.transcript_server.transcript_server_message_shutdown(channel);
                                                                            }
                                                                        } finally {
                                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_19, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            with_timeout_stop_timer(timer);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            $within_with_timeout$.rebind(_prev_bind_0_18, thread);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != channel) {
                                                    close(channel, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                            }
                                        }
                                    }
                                    if (NIL == connected) {
                                        Errors.error($str_alt51$Transcript_server_connection_time);
                                    }
                                    if (NIL != incomplete) {
                                        Errors.error($str_alt52$Transcript_server_operation_timeo);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (error_message.isString()) {
                    Errors.warn($str_alt21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring(UNPROVIDED), error_message);
                }
                if (NIL != completed) {
                    if (op_count.numGE(operation_communication.read_transcript_op_limit())) {
                        set_caught_up_on_master_transcript(NIL);
                    } else {
                        set_caught_up_on_master_transcript(T);
                    }
                } else {
                    set_caught_up_on_master_transcript(T);
                }
                return completed;
            }
        }
    }

    /**
     * Ask the transcript server for operations then read them in.
     */
    @LispMethod(comment = "Ask the transcript server for operations then read them in.")
    public static SubLObject read_operations_from_server() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject completed = NIL;
        SubLObject op_count = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject connected = NIL;
                    SubLObject incomplete = NIL;
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), $master_transcript_server_connection_timeout$.getGlobalValue(), $PRIVATE);
                        if (NIL != validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                            connected = T;
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$22 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$23 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(TWENTY_INTEGER, tag);
                                            if (NIL != transcript_server_message_startup(channel)) {
                                                op_count = read_operations_from_server_internal(channel);
                                                completed = T;
                                                transcript_server_message_shutdown(channel);
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$23, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$22, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                    if (NIL == connected) {
                        Errors.error($str55$Transcript_server_connection_time);
                    }
                    if (NIL != incomplete) {
                        Errors.error($str56$Transcript_server_operation_timeo);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            Errors.warn($str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring(UNPROVIDED), error_message);
        }
        if (NIL != completed) {
            if (op_count.numGE(operation_communication.read_transcript_op_limit())) {
                set_caught_up_on_master_transcript(NIL);
            } else {
                set_caught_up_on_master_transcript(T);
            }
        } else {
            set_caught_up_on_master_transcript(T);
        }
        return completed;
    }

    public static final SubLObject read_operations_from_server_internal_alt(SubLObject channel) {
        {
            SubLObject op_count = ZERO_INTEGER;
            SubLObject completed = NIL;
            if (NIL != com.cyc.cycjava.cycl.transcript_server.ts_send_get_ops_message(channel)) {
                {
                    SubLObject expr = NIL;
                    for (expr = com.cyc.cycjava.cycl.transcript_server.read_one_transcript_operation_from_server(channel); !expr.equal(NIL); expr = com.cyc.cycjava.cycl.transcript_server.read_one_transcript_operation_from_server(channel)) {
                        add_to_remote_queue(expr);
                        op_count = add(op_count, ONE_INTEGER);
                    }
                    completed = T;
                }
            }
            if (NIL != completed) {
                return op_count;
            }
        }
        return NIL;
    }

    public static SubLObject read_operations_from_server_internal(final SubLObject channel) {
        SubLObject op_count = ZERO_INTEGER;
        SubLObject completed = NIL;
        if (NIL != ts_send_get_ops_message(channel)) {
            SubLObject expr;
            for (expr = NIL, expr = read_one_transcript_operation_from_server(channel); !expr.equal(NIL); expr = read_one_transcript_operation_from_server(channel)) {
                operation_queues.add_to_remote_queue(expr);
                op_count = add(op_count, ONE_INTEGER);
            }
            completed = T;
        }
        if (NIL != completed) {
            return op_count;
        }
        return NIL;
    }

    /**
     * Reads one operation from the transcript server, while also checking for the end of list terminator.
     * Returns an operation or NIL
     */
    @LispMethod(comment = "Reads one operation from the transcript server, while also checking for the end of list terminator.\r\nReturns an operation or NIL\nReads one operation from the transcript server, while also checking for the end of list terminator.\nReturns an operation or NIL")
    public static final SubLObject read_one_transcript_operation_from_server_alt(SubLObject instream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject next_char = read_char(instream, NIL, $EOF, UNPROVIDED);
                if (next_char.eql(CHAR_period)) {
                    string_utilities.network_read_line(instream, NIL, $EOF);
                } else {
                    unread_char(next_char, instream);
                    thread.resetMultipleValues();
                    {
                        SubLObject expr = read_ignoring_errors(instream, NIL, $EOF);
                        SubLObject status = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (expr == $EOF) {
                            return NIL;
                        } else {
                            if (status == $ERROR) {
                                return NIL;
                            } else {
                                if (NIL != operation_communication.valid_transcript_expression(expr)) {
                                    return expr;
                                } else {
                                    return NIL;
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Reads one operation from the transcript server, while also checking for the end of list terminator.
     * Returns an operation or NIL
     */
    @LispMethod(comment = "Reads one operation from the transcript server, while also checking for the end of list terminator.\r\nReturns an operation or NIL\nReads one operation from the transcript server, while also checking for the end of list terminator.\nReturns an operation or NIL")
    public static SubLObject read_one_transcript_operation_from_server(final SubLObject instream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject next_char = read_char(instream, NIL, $EOF, UNPROVIDED);
        if (next_char.eql(CHAR_period)) {
            string_utilities.network_read_line(instream, NIL, $EOF, UNPROVIDED);
            return NIL;
        }
        unread_char(next_char, instream);
        thread.resetMultipleValues();
        final SubLObject expr = read_ignoring_errors(instream, NIL, $EOF);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (expr == $EOF) {
            return NIL;
        }
        if (status == $ERROR) {
            return NIL;
        }
        if (NIL != operation_communication.valid_transcript_expression(expr)) {
            return expr;
        }
        return NIL;
    }

    public static final SubLObject declare_transcript_server_file_alt() {
        declareFunction("use_transcript_server", "USE-TRANSCRIPT-SERVER", 0, 0, false);
        declareMacro("with_transcript_server_connection", "WITH-TRANSCRIPT-SERVER-CONNECTION");
        declareMacro("transcript_server_message_body", "TRANSCRIPT-SERVER-MESSAGE-BODY");
        declareFunction("transcript_server_message_startup", "TRANSCRIPT-SERVER-MESSAGE-STARTUP", 1, 0, false);
        declareFunction("transcript_server_message_shutdown", "TRANSCRIPT-SERVER-MESSAGE-SHUTDOWN", 1, 0, false);
        declareFunction("transcript_server_terpri", "TRANSCRIPT-SERVER-TERPRI", 1, 1, false);
        declareFunction("transcript_server_read_line", "TRANSCRIPT-SERVER-READ-LINE", 1, 0, false);
        declareFunction("transcript_server_reply_verify", "TRANSCRIPT-SERVER-REPLY-VERIFY", 2, 0, false);
        declareFunction("ts_ack_server_connection", "TS-ACK-SERVER-CONNECTION", 1, 0, false);
        declareFunction("ts_send_set_image_message", "TS-SEND-SET-IMAGE-MESSAGE", 1, 0, false);
        declareFunction("ts_send_set_kb_message", "TS-SEND-SET-KB-MESSAGE", 1, 0, false);
        declareFunction("ts_send_set_op_message", "TS-SEND-SET-OP-MESSAGE", 1, 0, false);
        declareFunction("ts_send_how_many_ops_message", "TS-SEND-HOW-MANY-OPS-MESSAGE", 2, 0, false);
        declareFunction("ts_send_send_ops_begin_message", "TS-SEND-SEND-OPS-BEGIN-MESSAGE", 2, 0, false);
        declareFunction("ts_send_send_ops_op", "TS-SEND-SEND-OPS-OP", 2, 0, false);
        declareFunction("ts_send_send_ops_end_message", "TS-SEND-SEND-OPS-END-MESSAGE", 1, 0, false);
        declareFunction("ts_read_send_ops_reply", "TS-READ-SEND-OPS-REPLY", 1, 0, false);
        declareFunction("ts_send_get_ops_message", "TS-SEND-GET-OPS-MESSAGE", 1, 0, false);
        declareFunction("ts_send_quit_message", "TS-SEND-QUIT-MESSAGE", 1, 0, false);
        declareFunction("transcript_server_connection_check", "TRANSCRIPT-SERVER-CONNECTION-CHECK", 0, 0, false);
        declareFunction("transcript_server_check", "TRANSCRIPT-SERVER-CHECK", 0, 0, false);
        declareFunction("total_master_transcript_operations", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS", 0, 1, false);
        declareFunction("send_operations_to_server", "SEND-OPERATIONS-TO-SERVER", 0, 0, false);
        declareFunction("send_operations_to_server_internal", "SEND-OPERATIONS-TO-SERVER-INTERNAL", 1, 0, false);
        declareFunction("read_operations_from_server", "READ-OPERATIONS-FROM-SERVER", 0, 0, false);
        declareFunction("read_operations_from_server_internal", "READ-OPERATIONS-FROM-SERVER-INTERNAL", 1, 0, false);
        declareFunction("read_one_transcript_operation_from_server", "READ-ONE-TRANSCRIPT-OPERATION-FROM-SERVER", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_transcript_server_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("use_transcript_server", "USE-TRANSCRIPT-SERVER", 0, 0, false);
            declareMacro("with_transcript_server_connection", "WITH-TRANSCRIPT-SERVER-CONNECTION");
            declareMacro("transcript_server_message_body", "TRANSCRIPT-SERVER-MESSAGE-BODY");
            declareFunction("transcript_server_message_startup", "TRANSCRIPT-SERVER-MESSAGE-STARTUP", 1, 0, false);
            declareFunction("transcript_server_message_shutdown", "TRANSCRIPT-SERVER-MESSAGE-SHUTDOWN", 1, 0, false);
            declareFunction("transcript_server_terpri", "TRANSCRIPT-SERVER-TERPRI", 1, 1, false);
            declareFunction("transcript_server_read_line", "TRANSCRIPT-SERVER-READ-LINE", 1, 0, false);
            declareFunction("transcript_server_reply_verify", "TRANSCRIPT-SERVER-REPLY-VERIFY", 2, 0, false);
            declareFunction("ts_ack_server_connection", "TS-ACK-SERVER-CONNECTION", 1, 0, false);
            declareFunction("ts_send_set_image_message", "TS-SEND-SET-IMAGE-MESSAGE", 1, 0, false);
            declareFunction("ts_send_set_kb_message", "TS-SEND-SET-KB-MESSAGE", 1, 0, false);
            declareFunction("ts_send_set_op_message", "TS-SEND-SET-OP-MESSAGE", 1, 0, false);
            declareFunction("ts_send_how_many_ops_message", "TS-SEND-HOW-MANY-OPS-MESSAGE", 2, 0, false);
            declareFunction("ts_send_send_ops_begin_message", "TS-SEND-SEND-OPS-BEGIN-MESSAGE", 2, 0, false);
            declareFunction("ts_send_send_ops_op", "TS-SEND-SEND-OPS-OP", 2, 0, false);
            declareFunction("ts_send_send_ops_end_message", "TS-SEND-SEND-OPS-END-MESSAGE", 1, 0, false);
            declareFunction("ts_read_send_ops_reply", "TS-READ-SEND-OPS-REPLY", 1, 0, false);
            declareFunction("ts_send_submit_ops_begin_message", "TS-SEND-SUBMIT-OPS-BEGIN-MESSAGE", 3, 0, false);
            declareFunction("ts_send_submit_ops_op", "TS-SEND-SUBMIT-OPS-OP", 2, 0, false);
            declareFunction("ts_send_submit_ops_end_message", "TS-SEND-SUBMIT-OPS-END-MESSAGE", 1, 0, false);
            declareFunction("ts_read_submit_ops_reply", "TS-READ-SUBMIT-OPS-REPLY", 1, 0, false);
            declareFunction("ts_send_get_ops_message", "TS-SEND-GET-OPS-MESSAGE", 1, 0, false);
            declareFunction("ts_send_quit_message", "TS-SEND-QUIT-MESSAGE", 1, 0, false);
            declareFunction("transcript_server_connection_check", "TRANSCRIPT-SERVER-CONNECTION-CHECK", 0, 0, false);
            declareFunction("transcript_server_check", "TRANSCRIPT-SERVER-CHECK", 0, 0, false);
            declareFunction("total_master_transcript_operations_patient", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PATIENT", 0, 1, false);
            declareFunction("transcript_server_kb_ops_count", "TRANSCRIPT-SERVER-KB-OPS-COUNT", 0, 1, false);
            declareFunction("send_operations_to_server", "SEND-OPERATIONS-TO-SERVER", 0, 0, false);
            declareFunction("send_operations_to_server_internal", "SEND-OPERATIONS-TO-SERVER-INTERNAL", 1, 0, false);
            declareFunction("submit_operations_to_server", "SUBMIT-OPERATIONS-TO-SERVER", 1, 0, false);
            declareFunction("submit_operations_to_server_internal", "SUBMIT-OPERATIONS-TO-SERVER-INTERNAL", 2, 0, false);
            declareFunction("read_operations_from_server", "READ-OPERATIONS-FROM-SERVER", 0, 0, false);
            declareFunction("read_operations_from_server_internal", "READ-OPERATIONS-FROM-SERVER-INTERNAL", 1, 0, false);
            declareFunction("read_one_transcript_operation_from_server", "READ-ONE-TRANSCRIPT-OPERATION-FROM-SERVER", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("total_master_transcript_operations", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS", 0, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_transcript_server_file_Previous() {
        declareFunction("use_transcript_server", "USE-TRANSCRIPT-SERVER", 0, 0, false);
        declareMacro("with_transcript_server_connection", "WITH-TRANSCRIPT-SERVER-CONNECTION");
        declareMacro("transcript_server_message_body", "TRANSCRIPT-SERVER-MESSAGE-BODY");
        declareFunction("transcript_server_message_startup", "TRANSCRIPT-SERVER-MESSAGE-STARTUP", 1, 0, false);
        declareFunction("transcript_server_message_shutdown", "TRANSCRIPT-SERVER-MESSAGE-SHUTDOWN", 1, 0, false);
        declareFunction("transcript_server_terpri", "TRANSCRIPT-SERVER-TERPRI", 1, 1, false);
        declareFunction("transcript_server_read_line", "TRANSCRIPT-SERVER-READ-LINE", 1, 0, false);
        declareFunction("transcript_server_reply_verify", "TRANSCRIPT-SERVER-REPLY-VERIFY", 2, 0, false);
        declareFunction("ts_ack_server_connection", "TS-ACK-SERVER-CONNECTION", 1, 0, false);
        declareFunction("ts_send_set_image_message", "TS-SEND-SET-IMAGE-MESSAGE", 1, 0, false);
        declareFunction("ts_send_set_kb_message", "TS-SEND-SET-KB-MESSAGE", 1, 0, false);
        declareFunction("ts_send_set_op_message", "TS-SEND-SET-OP-MESSAGE", 1, 0, false);
        declareFunction("ts_send_how_many_ops_message", "TS-SEND-HOW-MANY-OPS-MESSAGE", 2, 0, false);
        declareFunction("ts_send_send_ops_begin_message", "TS-SEND-SEND-OPS-BEGIN-MESSAGE", 2, 0, false);
        declareFunction("ts_send_send_ops_op", "TS-SEND-SEND-OPS-OP", 2, 0, false);
        declareFunction("ts_send_send_ops_end_message", "TS-SEND-SEND-OPS-END-MESSAGE", 1, 0, false);
        declareFunction("ts_read_send_ops_reply", "TS-READ-SEND-OPS-REPLY", 1, 0, false);
        declareFunction("ts_send_submit_ops_begin_message", "TS-SEND-SUBMIT-OPS-BEGIN-MESSAGE", 3, 0, false);
        declareFunction("ts_send_submit_ops_op", "TS-SEND-SUBMIT-OPS-OP", 2, 0, false);
        declareFunction("ts_send_submit_ops_end_message", "TS-SEND-SUBMIT-OPS-END-MESSAGE", 1, 0, false);
        declareFunction("ts_read_submit_ops_reply", "TS-READ-SUBMIT-OPS-REPLY", 1, 0, false);
        declareFunction("ts_send_get_ops_message", "TS-SEND-GET-OPS-MESSAGE", 1, 0, false);
        declareFunction("ts_send_quit_message", "TS-SEND-QUIT-MESSAGE", 1, 0, false);
        declareFunction("transcript_server_connection_check", "TRANSCRIPT-SERVER-CONNECTION-CHECK", 0, 0, false);
        declareFunction("transcript_server_check", "TRANSCRIPT-SERVER-CHECK", 0, 0, false);
        declareFunction("total_master_transcript_operations_patient", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PATIENT", 0, 1, false);
        declareFunction("transcript_server_kb_ops_count", "TRANSCRIPT-SERVER-KB-OPS-COUNT", 0, 1, false);
        declareFunction("send_operations_to_server", "SEND-OPERATIONS-TO-SERVER", 0, 0, false);
        declareFunction("send_operations_to_server_internal", "SEND-OPERATIONS-TO-SERVER-INTERNAL", 1, 0, false);
        declareFunction("submit_operations_to_server", "SUBMIT-OPERATIONS-TO-SERVER", 1, 0, false);
        declareFunction("submit_operations_to_server_internal", "SUBMIT-OPERATIONS-TO-SERVER-INTERNAL", 2, 0, false);
        declareFunction("read_operations_from_server", "READ-OPERATIONS-FROM-SERVER", 0, 0, false);
        declareFunction("read_operations_from_server_internal", "READ-OPERATIONS-FROM-SERVER-INTERNAL", 1, 0, false);
        declareFunction("read_one_transcript_operation_from_server", "READ-ONE-TRANSCRIPT-OPERATION-FROM-SERVER", 1, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("CHANNEL"), makeSymbol("&KEY"), makeSymbol("OPERATION-TIMEOUT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list(makeKeyword("OPERATION-TIMEOUT"));

    static private final SubLList $list_alt10 = list(makeSymbol("*MASTER-TRANSCRIPT-LOCK-HOST*"), makeSymbol("*MASTER-TRANSCRIPT-SERVER-PORT*"), makeKeyword("TIMEOUT"), makeSymbol("*MASTER-TRANSCRIPT-SERVER-CONNECTION-TIMEOUT*"), makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE"));

    static private final SubLList $list_alt12 = list(T);

    static private final SubLList $list_alt16 = list(list(makeSymbol("ERROR"), makeString("Transcript server connection timeout")));

    static private final SubLList $list_alt18 = list(list(makeSymbol("ERROR"), makeString("Transcript server operation timeout")));

    static private final SubLString $str_alt21$_A__Error_while_connecting_to_tra = makeString("~A: Error while connecting to transcript server!~%~A~%");

    static private final SubLList $list_alt22 = list(makeSymbol("TIMESTRING"));

    static private final SubLList $list_alt23 = list(makeSymbol("CHANNEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt26$Connection_to_transcript_server_w = makeString("Connection to transcript server was not cleanly closed");

    static private final SubLString $str_alt31$Set_Image__A = makeString("Set-Image ~A");

    static private final SubLString $str_alt33$Set_KB__A = makeString("Set-KB ~A");

    static private final SubLString $str_alt35$Set_Op__A = makeString("Set-Op ~A");

    public static SubLObject init_transcript_server_file() {
        deflexical("*MASTER-TRANSCRIPT-SERVER-CONNECTION-TIMEOUT*", TEN_INTEGER);
        defvar("*TRANSCRIPT-SERVER-PROTOCOL-VERSION*", ONE_INTEGER);
        defparameter("*TRANSCRIPT-SERVER-KB-OPS-COUNT-TIMEOUT*", THREE_INTEGER);
        defparameter("*TRANSCRIPT-SERVER-SEND-KB-OPS-TIMEOUT*", $int$240);
        defparameter("*TRANSCRIPT-SERVER-SEND-CHUNK-SIZE*", $int$10000);
        return NIL;
    }

    static private final SubLString $str_alt40$How_Many_Ops__A = makeString("How-Many-Ops ~A");

    static private final SubLString $str_alt42$Send_Ops__A = makeString("Send-Ops ~A");

    static private final SubLString $str_alt43$_A = makeString("~A");

    static private final SubLString $str_alt45$Get_Ops__A = makeString("Get-Ops ~A");

    public static SubLObject setup_transcript_server_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transcript_server_file();
    }

    @Override
    public void initializeVariables() {
        init_transcript_server_file();
    }

    static private final SubLString $str_alt51$Transcript_server_connection_time = makeString("Transcript server connection timeout");

    @Override
    public void runTopLevelForms() {
        setup_transcript_server_file();
    }

    static private final SubLString $str_alt52$Transcript_server_operation_timeo = makeString("Transcript server operation timeout");

    static {
    }



    static private final SubLString $str_alt55$Error_sending_operations_to_serve = makeString("Error sending operations to server");
}

/**
 * Total time: 589 ms
 */
