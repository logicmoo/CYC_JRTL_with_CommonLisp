package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class transcript_server extends SubLTranslatedFile {
    public static final SubLFile me = new transcript_server();

    public static final String myName = "com.cyc.cycjava.cycl.transcript_server";

    public static final String myFingerPrint = "0365235bf909d8cd12882face9b3865b2792a697ab948717df1041fdd8a0702e";

    // deflexical
    private static final SubLSymbol $master_transcript_server_connection_timeout$ = makeSymbol("*MASTER-TRANSCRIPT-SERVER-CONNECTION-TIMEOUT*");

    // defvar
    /**
     * The version of the transcript server protocol 0 = initial version 1 = current
     * version
     */
    public static final SubLSymbol $transcript_server_protocol_version$ = makeSymbol("*TRANSCRIPT-SERVER-PROTOCOL-VERSION*");

    // defparameter
    private static final SubLSymbol $transcript_server_kb_ops_count_timeout$ = makeSymbol("*TRANSCRIPT-SERVER-KB-OPS-COUNT-TIMEOUT*");

    // defparameter
    private static final SubLSymbol $transcript_server_send_kb_ops_timeout$ = makeSymbol("*TRANSCRIPT-SERVER-SEND-KB-OPS-TIMEOUT*");

    // defparameter
    public static final SubLSymbol $transcript_server_send_chunk_size$ = makeSymbol("*TRANSCRIPT-SERVER-SEND-CHUNK-SIZE*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("CHANNEL"), makeSymbol("&KEY"), makeSymbol("OPERATION-TIMEOUT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("OPERATION-TIMEOUT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLSymbol $sym4$ERROR_MESSAGE = makeUninternedSymbol("ERROR-MESSAGE");

    public static final SubLSymbol $sym5$CONNECTED = makeUninternedSymbol("CONNECTED");

    public static final SubLSymbol $sym6$INCOMPLETE = makeUninternedSymbol("INCOMPLETE");







    public static final SubLList $list10 = list(makeSymbol("*MASTER-TRANSCRIPT-LOCK-HOST*"), makeSymbol("*MASTER-TRANSCRIPT-SERVER-PORT*"), makeKeyword("TIMEOUT"), makeSymbol("*MASTER-TRANSCRIPT-SERVER-CONNECTION-TIMEOUT*"), makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE"));



    public static final SubLList $list12 = list(T);







    public static final SubLList $list16 = list(list(makeSymbol("ERROR"), makeString("Transcript server connection timeout")));



    public static final SubLList $list18 = list(list(makeSymbol("ERROR"), makeString("Transcript server operation timeout")));





    public static final SubLString $str21$_A__Error_while_connecting_to_tra = makeString("~A: Error while connecting to transcript server!~%~A~%");

    public static final SubLList $list22 = list(makeSymbol("TIMESTRING"));

    public static final SubLList $list23 = list(makeSymbol("CHANNEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol TRANSCRIPT_SERVER_MESSAGE_STARTUP = makeSymbol("TRANSCRIPT-SERVER-MESSAGE-STARTUP");

    public static final SubLSymbol TRANSCRIPT_SERVER_MESSAGE_SHUTDOWN = makeSymbol("TRANSCRIPT-SERVER-MESSAGE-SHUTDOWN");

    public static final SubLString $str26$Connection_to_transcript_server_w = makeString("Connection to transcript server was not cleanly closed");





    public static final SubLString $$$400 = makeString("400");

    public static final SubLString $$$200 = makeString("200");

    public static final SubLString $str31$Set_Image__A = makeString("Set-Image ~A");

    public static final SubLString $$$201 = makeString("201");

    public static final SubLString $str33$Set_KB__A = makeString("Set-KB ~A");

    public static final SubLString $$$202 = makeString("202");

    public static final SubLString $str35$Set_Op__A = makeString("Set-Op ~A");

    public static final SubLString $$$203 = makeString("203");

    public static final SubLString $$$210 = makeString("210");

    public static final SubLString $$$211 = makeString("211");

    public static final SubLString $$$212 = makeString("212");

    public static final SubLString $str40$How_Many_Ops__A = makeString("How-Many-Ops ~A");

    public static final SubLString $$$207 = makeString("207");

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

    public static SubLObject use_transcript_server() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_parameters.$use_transcript_server$.getDynamicValue(thread);
    }

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

    public static SubLObject transcript_server_message_shutdown(final SubLObject channel) {
        if (NIL != ts_send_quit_message(channel)) {
            return T;
        }
        Errors.warn($str26$Connection_to_transcript_server_w);
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

    public static SubLObject transcript_server_reply_verify(final SubLObject code, final SubLObject reply) {
        return list_utilities.sublisp_boolean(string_utilities.starts_with(reply, code));
    }

    public static SubLObject ts_ack_server_connection(final SubLObject channel) {
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$200, reply);
    }

    public static SubLObject ts_send_set_image_message(final SubLObject channel) {
        format(channel, $str31$Set_Image__A, cyc_image_id());
        transcript_server_terpri(channel, UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$201, reply);
    }

    public static SubLObject ts_send_set_kb_message(final SubLObject channel) {
        format(channel, $str33$Set_KB__A, kb_loaded());
        transcript_server_terpri(channel, UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$202, reply);
    }

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

    public static SubLObject ts_send_send_ops_begin_message(final SubLObject channel, final SubLObject count) {
        format(channel, $str44$Send_Ops__A, count);
        transcript_server_terpri(channel, UNPROVIDED);
        return NIL;
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

    public static SubLObject ts_send_send_ops_end_message(final SubLObject channel) {
        return force_output(channel);
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

    public static SubLObject ts_send_get_ops_message(final SubLObject channel) {
        format(channel, $str49$Get_Ops__A, operation_communication.read_transcript_op_limit());
        transcript_server_terpri(channel, UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$205, reply);
    }

    public static SubLObject ts_send_quit_message(final SubLObject channel) {
        format(channel, $$$Quit);
        transcript_server_terpri(channel, UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify($$$206, reply);
    }

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
    }

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

    public static SubLObject declare_transcript_server_file() {
        declareFunction(me, "use_transcript_server", "USE-TRANSCRIPT-SERVER", 0, 0, false);
        declareMacro(me, "with_transcript_server_connection", "WITH-TRANSCRIPT-SERVER-CONNECTION");
        declareMacro(me, "transcript_server_message_body", "TRANSCRIPT-SERVER-MESSAGE-BODY");
        declareFunction(me, "transcript_server_message_startup", "TRANSCRIPT-SERVER-MESSAGE-STARTUP", 1, 0, false);
        declareFunction(me, "transcript_server_message_shutdown", "TRANSCRIPT-SERVER-MESSAGE-SHUTDOWN", 1, 0, false);
        declareFunction(me, "transcript_server_terpri", "TRANSCRIPT-SERVER-TERPRI", 1, 1, false);
        declareFunction(me, "transcript_server_read_line", "TRANSCRIPT-SERVER-READ-LINE", 1, 0, false);
        declareFunction(me, "transcript_server_reply_verify", "TRANSCRIPT-SERVER-REPLY-VERIFY", 2, 0, false);
        declareFunction(me, "ts_ack_server_connection", "TS-ACK-SERVER-CONNECTION", 1, 0, false);
        declareFunction(me, "ts_send_set_image_message", "TS-SEND-SET-IMAGE-MESSAGE", 1, 0, false);
        declareFunction(me, "ts_send_set_kb_message", "TS-SEND-SET-KB-MESSAGE", 1, 0, false);
        declareFunction(me, "ts_send_set_op_message", "TS-SEND-SET-OP-MESSAGE", 1, 0, false);
        declareFunction(me, "ts_send_how_many_ops_message", "TS-SEND-HOW-MANY-OPS-MESSAGE", 2, 0, false);
        declareFunction(me, "ts_send_send_ops_begin_message", "TS-SEND-SEND-OPS-BEGIN-MESSAGE", 2, 0, false);
        declareFunction(me, "ts_send_send_ops_op", "TS-SEND-SEND-OPS-OP", 2, 0, false);
        declareFunction(me, "ts_send_send_ops_end_message", "TS-SEND-SEND-OPS-END-MESSAGE", 1, 0, false);
        declareFunction(me, "ts_read_send_ops_reply", "TS-READ-SEND-OPS-REPLY", 1, 0, false);
        declareFunction(me, "ts_send_submit_ops_begin_message", "TS-SEND-SUBMIT-OPS-BEGIN-MESSAGE", 3, 0, false);
        declareFunction(me, "ts_send_submit_ops_op", "TS-SEND-SUBMIT-OPS-OP", 2, 0, false);
        declareFunction(me, "ts_send_submit_ops_end_message", "TS-SEND-SUBMIT-OPS-END-MESSAGE", 1, 0, false);
        declareFunction(me, "ts_read_submit_ops_reply", "TS-READ-SUBMIT-OPS-REPLY", 1, 0, false);
        declareFunction(me, "ts_send_get_ops_message", "TS-SEND-GET-OPS-MESSAGE", 1, 0, false);
        declareFunction(me, "ts_send_quit_message", "TS-SEND-QUIT-MESSAGE", 1, 0, false);
        declareFunction(me, "transcript_server_connection_check", "TRANSCRIPT-SERVER-CONNECTION-CHECK", 0, 0, false);
        declareFunction(me, "transcript_server_check", "TRANSCRIPT-SERVER-CHECK", 0, 0, false);
        declareFunction(me, "total_master_transcript_operations_patient", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PATIENT", 0, 1, false);
        declareFunction(me, "transcript_server_kb_ops_count", "TRANSCRIPT-SERVER-KB-OPS-COUNT", 0, 1, false);
        declareFunction(me, "send_operations_to_server", "SEND-OPERATIONS-TO-SERVER", 0, 0, false);
        declareFunction(me, "send_operations_to_server_internal", "SEND-OPERATIONS-TO-SERVER-INTERNAL", 1, 0, false);
        declareFunction(me, "submit_operations_to_server", "SUBMIT-OPERATIONS-TO-SERVER", 1, 0, false);
        declareFunction(me, "submit_operations_to_server_internal", "SUBMIT-OPERATIONS-TO-SERVER-INTERNAL", 2, 0, false);
        declareFunction(me, "read_operations_from_server", "READ-OPERATIONS-FROM-SERVER", 0, 0, false);
        declareFunction(me, "read_operations_from_server_internal", "READ-OPERATIONS-FROM-SERVER-INTERNAL", 1, 0, false);
        declareFunction(me, "read_one_transcript_operation_from_server", "READ-ONE-TRANSCRIPT-OPERATION-FROM-SERVER", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_transcript_server_file() {
        deflexical("*MASTER-TRANSCRIPT-SERVER-CONNECTION-TIMEOUT*", TEN_INTEGER);
        defvar("*TRANSCRIPT-SERVER-PROTOCOL-VERSION*", ONE_INTEGER);
        defparameter("*TRANSCRIPT-SERVER-KB-OPS-COUNT-TIMEOUT*", THREE_INTEGER);
        defparameter("*TRANSCRIPT-SERVER-SEND-KB-OPS-TIMEOUT*", $int$240);
        defparameter("*TRANSCRIPT-SERVER-SEND-CHUNK-SIZE*", $int$10000);
        return NIL;
    }

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

    @Override
    public void runTopLevelForms() {
        setup_transcript_server_file();
    }

    
}

/**
 * Total time: 589 ms
 */
