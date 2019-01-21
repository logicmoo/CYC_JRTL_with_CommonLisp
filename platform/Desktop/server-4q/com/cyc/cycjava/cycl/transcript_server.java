package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class transcript_server extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.transcript_server";
    public static final String myFingerPrint = "0365235bf909d8cd12882face9b3865b2792a697ab948717df1041fdd8a0702e";
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 1195L)
    private static SubLSymbol $master_transcript_server_connection_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 6839L)
    public static SubLSymbol $transcript_server_protocol_version$;
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 9988L)
    private static SubLSymbol $transcript_server_kb_ops_count_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 10849L)
    private static SubLSymbol $transcript_server_send_kb_ops_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 11088L)
    public static SubLSymbol $transcript_server_send_chunk_size$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$OPERATION_TIMEOUT;
    private static final SubLSymbol $sym4$ERROR_MESSAGE;
    private static final SubLSymbol $sym5$CONNECTED;
    private static final SubLSymbol $sym6$INCOMPLETE;
    private static final SubLSymbol $sym7$CLET;
    private static final SubLSymbol $sym8$CATCH_ERROR_MESSAGE;
    private static final SubLSymbol $sym9$WITH_TCP_CONNECTION;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$CSETQ;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$WITH_TIMEOUT;
    private static final SubLSymbol $sym14$PROGN;
    private static final SubLSymbol $sym15$PUNLESS;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$PWHEN;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$STRINGP;
    private static final SubLSymbol $sym20$WARN;
    private static final SubLString $str21$_A__Error_while_connecting_to_tra;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$TRANSCRIPT_SERVER_MESSAGE_STARTUP;
    private static final SubLSymbol $sym25$TRANSCRIPT_SERVER_MESSAGE_SHUTDOWN;
    private static final SubLString $str26$Connection_to_transcript_server_w;
    private static final SubLSymbol $kw27$EOF;
    private static final SubLSymbol $kw28$ERROR;
    private static final SubLString $str29$400;
    private static final SubLString $str30$200;
    private static final SubLString $str31$Set_Image__A;
    private static final SubLString $str32$201;
    private static final SubLString $str33$Set_KB__A;
    private static final SubLString $str34$202;
    private static final SubLString $str35$Set_Op__A;
    private static final SubLString $str36$203;
    private static final SubLString $str37$210;
    private static final SubLString $str38$211;
    private static final SubLString $str39$212;
    private static final SubLString $str40$How_Many_Ops__A;
    private static final SubLString $str41$207;
    private static final SubLSymbol $kw42$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym43$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str44$Send_Ops__A;
    private static final SubLString $str45$_A;
    private static final SubLString $str46$204;
    private static final SubLString $str47$Submit_Ops__A__A;
    private static final SubLString $str48$208;
    private static final SubLString $str49$Get_Ops__A;
    private static final SubLString $str50$205;
    private static final SubLString $str51$Quit;
    private static final SubLString $str52$206;
    private static final SubLSymbol $sym53$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw54$PRIVATE;
    private static final SubLString $str55$Transcript_server_connection_time;
    private static final SubLString $str56$Transcript_server_operation_timeo;
    private static final SubLInteger $int57$600;
    private static final SubLSymbol $sym58$_EXIT;
    private static final SubLInteger $int59$240;
    private static final SubLInteger $int60$10000;
    private static final SubLString $str61$Error_sending_operations_to_serve;
    private static final SubLString $str62$Error_submitting_operations_to_se;
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 1079L)
    public static SubLObject use_transcript_server() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_parameters.$use_transcript_server$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 1495L)
    public static SubLObject with_transcript_server_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transcript_server.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject channel = (SubLObject)transcript_server.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transcript_server.$list0);
        channel = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)transcript_server.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)transcript_server.NIL;
        SubLObject current_$1 = (SubLObject)transcript_server.NIL;
        while (transcript_server.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)transcript_server.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)transcript_server.$list0);
            if (transcript_server.NIL == conses_high.member(current_$1, (SubLObject)transcript_server.$list1, (SubLObject)transcript_server.UNPROVIDED, (SubLObject)transcript_server.UNPROVIDED)) {
                bad = (SubLObject)transcript_server.T;
            }
            if (current_$1 == transcript_server.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (transcript_server.NIL != bad && transcript_server.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)transcript_server.$list0);
        }
        final SubLObject operation_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)transcript_server.$kw3$OPERATION_TIMEOUT, current);
        final SubLObject operation_timeout = (SubLObject)((transcript_server.NIL != operation_timeout_tail) ? conses_high.cadr(operation_timeout_tail) : transcript_server.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject error_message = (SubLObject)transcript_server.$sym4$ERROR_MESSAGE;
        final SubLObject connected = (SubLObject)transcript_server.$sym5$CONNECTED;
        final SubLObject incomplete = (SubLObject)transcript_server.$sym6$INCOMPLETE;
        return (SubLObject)ConsesLow.list((SubLObject)transcript_server.$sym7$CLET, (SubLObject)ConsesLow.list(error_message), (SubLObject)ConsesLow.list((SubLObject)transcript_server.$sym8$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(error_message), (SubLObject)ConsesLow.list((SubLObject)transcript_server.$sym7$CLET, (SubLObject)ConsesLow.list(connected, incomplete), (SubLObject)ConsesLow.list((SubLObject)transcript_server.$sym9$WITH_TCP_CONNECTION, reader.bq_cons(channel, (SubLObject)transcript_server.$list10), (SubLObject)ConsesLow.listS((SubLObject)transcript_server.$sym11$CSETQ, connected, (SubLObject)transcript_server.$list12), (SubLObject)((transcript_server.NIL != operation_timeout) ? ConsesLow.listS((SubLObject)transcript_server.$sym13$WITH_TIMEOUT, (SubLObject)ConsesLow.list(operation_timeout, incomplete), ConsesLow.append(body, (SubLObject)transcript_server.NIL)) : reader.bq_cons((SubLObject)transcript_server.$sym14$PROGN, ConsesLow.append(body, (SubLObject)transcript_server.NIL)))), (SubLObject)ConsesLow.listS((SubLObject)transcript_server.$sym15$PUNLESS, connected, (SubLObject)transcript_server.$list16), (SubLObject)ConsesLow.listS((SubLObject)transcript_server.$sym17$PWHEN, incomplete, (SubLObject)transcript_server.$list18))), (SubLObject)ConsesLow.list((SubLObject)transcript_server.$sym17$PWHEN, (SubLObject)ConsesLow.list((SubLObject)transcript_server.$sym19$STRINGP, error_message), (SubLObject)ConsesLow.list((SubLObject)transcript_server.$sym20$WARN, (SubLObject)transcript_server.$str21$_A__Error_while_connecting_to_tra, (SubLObject)transcript_server.$list22, error_message)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 2473L)
    public static SubLObject transcript_server_message_body(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject channel = (SubLObject)transcript_server.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transcript_server.$list23);
        channel = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)transcript_server.$sym17$PWHEN, (SubLObject)ConsesLow.list((SubLObject)transcript_server.$sym24$TRANSCRIPT_SERVER_MESSAGE_STARTUP, channel), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)transcript_server.$sym25$TRANSCRIPT_SERVER_MESSAGE_SHUTDOWN, channel))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 2756L)
    public static SubLObject transcript_server_message_startup(final SubLObject channel) {
        if (transcript_server.NIL == ts_ack_server_connection(channel)) {
            return (SubLObject)transcript_server.NIL;
        }
        if (transcript_server.NIL == ts_send_set_image_message(channel)) {
            return (SubLObject)transcript_server.NIL;
        }
        if (transcript_server.NIL == ts_send_set_kb_message(channel)) {
            return (SubLObject)transcript_server.NIL;
        }
        if (transcript_server.NIL == ts_send_set_op_message(channel)) {
            return (SubLObject)transcript_server.NIL;
        }
        return (SubLObject)transcript_server.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 3379L)
    public static SubLObject transcript_server_message_shutdown(final SubLObject channel) {
        if (transcript_server.NIL != ts_send_quit_message(channel)) {
            return (SubLObject)transcript_server.T;
        }
        Errors.warn((SubLObject)transcript_server.$str26$Connection_to_transcript_server_w);
        return (SubLObject)transcript_server.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 3573L)
    public static SubLObject transcript_server_terpri(final SubLObject channel, SubLObject forceP) {
        if (forceP == transcript_server.UNPROVIDED) {
            forceP = (SubLObject)transcript_server.T;
        }
        streams_high.write_char(Characters.code_char((SubLObject)transcript_server.TEN_INTEGER), channel);
        streams_high.write_char(Characters.code_char((SubLObject)transcript_server.THIRTEEN_INTEGER), channel);
        if (transcript_server.NIL != forceP) {
            streams_high.force_output(channel);
        }
        return (SubLObject)transcript_server.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 3961L)
    public static SubLObject transcript_server_read_line(final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject reply = string_utilities.network_read_line(channel, (SubLObject)transcript_server.NIL, (SubLObject)transcript_server.$kw27$EOF, (SubLObject)transcript_server.UNPROVIDED);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (transcript_server.$kw28$ERROR == status) {
            return (SubLObject)transcript_server.$str29$400;
        }
        return reply;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 4159L)
    public static SubLObject transcript_server_reply_verify(final SubLObject code, final SubLObject reply) {
        return list_utilities.sublisp_boolean(string_utilities.starts_with(reply, code));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 4264L)
    public static SubLObject ts_ack_server_connection(final SubLObject channel) {
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify((SubLObject)transcript_server.$str30$200, reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 4513L)
    public static SubLObject ts_send_set_image_message(final SubLObject channel) {
        PrintLow.format(channel, (SubLObject)transcript_server.$str31$Set_Image__A, control_vars.cyc_image_id());
        transcript_server_terpri(channel, (SubLObject)transcript_server.UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify((SubLObject)transcript_server.$str32$201, reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 4886L)
    public static SubLObject ts_send_set_kb_message(final SubLObject channel) {
        PrintLow.format(channel, (SubLObject)transcript_server.$str33$Set_KB__A, control_vars.kb_loaded());
        transcript_server_terpri(channel, (SubLObject)transcript_server.UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify((SubLObject)transcript_server.$str34$202, reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 5244L)
    public static SubLObject ts_send_set_op_message(final SubLObject channel) {
        PrintLow.format(channel, (SubLObject)transcript_server.$str35$Set_Op__A, operation_communication.kb_op_number());
        transcript_server_terpri(channel, (SubLObject)transcript_server.UNPROVIDED);
        SubLObject reply = transcript_server_read_line(channel);
        if (transcript_server.NIL == transcript_server_reply_verify((SubLObject)transcript_server.$str36$203, reply)) {
            return (SubLObject)transcript_server.NIL;
        }
        reply = transcript_server_read_line(channel);
        if (transcript_server.NIL != transcript_server_reply_verify((SubLObject)transcript_server.$str37$210, reply) || transcript_server.NIL != transcript_server_reply_verify((SubLObject)transcript_server.$str38$211, reply)) {
            operation_communication.set_allow_transmitting((SubLObject)transcript_server.T);
            return (SubLObject)transcript_server.T;
        }
        if (transcript_server.NIL != transcript_server_reply_verify((SubLObject)transcript_server.$str39$212, reply)) {
            operation_communication.set_allow_transmitting((SubLObject)transcript_server.NIL);
            return (SubLObject)transcript_server.T;
        }
        return (SubLObject)transcript_server.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 6125L)
    public static SubLObject ts_send_how_many_ops_message(final SubLObject channel, final SubLObject kb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transcript_server.ZERO_INTEGER;
        PrintLow.format(channel, (SubLObject)transcript_server.$str40$How_Many_Ops__A, kb);
        transcript_server_terpri(channel, (SubLObject)transcript_server.UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        if (transcript_server.NIL != transcript_server_reply_verify((SubLObject)transcript_server.$str41$207, reply)) {
            SubLObject ignore_errors_tag = (SubLObject)transcript_server.NIL;
            try {
                thread.throwStack.push(transcript_server.$kw42$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)transcript_server.$sym43$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        result = reader.read_from_string(reply, (SubLObject)transcript_server.T, (SubLObject)transcript_server.$kw27$EOF, number_utilities.f_1X(Sequences.position((SubLObject)Characters.CHAR_period, reply, (SubLObject)transcript_server.UNPROVIDED, (SubLObject)transcript_server.UNPROVIDED, (SubLObject)transcript_server.UNPROVIDED, (SubLObject)transcript_server.UNPROVIDED)), (SubLObject)transcript_server.UNPROVIDED, (SubLObject)transcript_server.UNPROVIDED);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)transcript_server.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)transcript_server.$kw42$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 6659L)
    public static SubLObject ts_send_send_ops_begin_message(final SubLObject channel, final SubLObject count) {
        PrintLow.format(channel, (SubLObject)transcript_server.$str44$Send_Ops__A, count);
        transcript_server_terpri(channel, (SubLObject)transcript_server.UNPROVIDED);
        return (SubLObject)transcript_server.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 6991L)
    public static SubLObject ts_send_send_ops_op(final SubLObject channel, final SubLObject op) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)transcript_server.NIL, thread);
            print_high.$print_length$.bind((SubLObject)transcript_server.NIL, thread);
            print_high.$print_level$.bind((SubLObject)transcript_server.NIL, thread);
            final SubLObject operation_string = print_high.prin1_to_string(op);
            if (transcript_server.ONE_INTEGER.numE(transcript_server.$transcript_server_protocol_version$.getDynamicValue(thread))) {
                PrintLow.format(channel, (SubLObject)transcript_server.$str45$_A, Sequences.length(operation_string));
                transcript_server_terpri(channel, (SubLObject)transcript_server.NIL);
            }
            print_high.princ(operation_string, channel);
            transcript_server_terpri(channel, (SubLObject)transcript_server.NIL);
        }
        finally {
            print_high.$print_level$.rebind(_prev_bind_3, thread);
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)transcript_server.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 7434L)
    public static SubLObject ts_send_send_ops_end_message(final SubLObject channel) {
        return streams_high.force_output(channel);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 7522L)
    public static SubLObject ts_read_send_ops_reply(final SubLObject channel) {
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify((SubLObject)transcript_server.$str46$204, reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 7685L)
    public static SubLObject ts_send_submit_ops_begin_message(final SubLObject channel, final SubLObject count, final SubLObject relative_filename) {
        PrintLow.format(channel, (SubLObject)transcript_server.$str47$Submit_Ops__A__A, count, relative_filename);
        transcript_server_terpri(channel, (SubLObject)transcript_server.UNPROVIDED);
        return (SubLObject)transcript_server.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 7897L)
    public static SubLObject ts_send_submit_ops_op(final SubLObject channel, final SubLObject op) {
        return ts_send_send_ops_op(channel, op);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 7992L)
    public static SubLObject ts_send_submit_ops_end_message(final SubLObject channel) {
        return streams_high.force_output(channel);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 8082L)
    public static SubLObject ts_read_submit_ops_reply(final SubLObject channel) {
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify((SubLObject)transcript_server.$str48$208, reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 8247L)
    public static SubLObject ts_send_get_ops_message(final SubLObject channel) {
        PrintLow.format(channel, (SubLObject)transcript_server.$str49$Get_Ops__A, operation_communication.read_transcript_op_limit());
        transcript_server_terpri(channel, (SubLObject)transcript_server.UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify((SubLObject)transcript_server.$str50$205, reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 8624L)
    public static SubLObject ts_send_quit_message(final SubLObject channel) {
        PrintLow.format(channel, (SubLObject)transcript_server.$str51$Quit);
        transcript_server_terpri(channel, (SubLObject)transcript_server.UNPROVIDED);
        final SubLObject reply = transcript_server_read_line(channel);
        return transcript_server_reply_verify((SubLObject)transcript_server.$str52$206, reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 8959L)
    public static SubLObject transcript_server_connection_check() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject running = (SubLObject)transcript_server.NIL;
        SubLObject error_message = (SubLObject)transcript_server.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)transcript_server.$sym53$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject connected = (SubLObject)transcript_server.NIL;
                    SubLObject incomplete = (SubLObject)transcript_server.NIL;
                    SubLObject channel = (SubLObject)transcript_server.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), transcript_server.$master_transcript_server_connection_timeout$.getGlobalValue(), (SubLObject)transcript_server.$kw54$PRIVATE);
                        if (transcript_server.NIL != subl_macro_promotions.validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                            connected = (SubLObject)transcript_server.T;
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)transcript_server.T, thread);
                                    SubLObject timer = (SubLObject)transcript_server.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$3 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)transcript_server.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)transcript_server.THREE_INTEGER, tag);
                                            if (transcript_server.NIL != ts_ack_server_connection(channel)) {
                                                running = transcript_server_message_shutdown(channel);
                                            }
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$2, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (transcript_server.NIL != channel) {
                                streams_high.close(channel, (SubLObject)transcript_server.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    if (transcript_server.NIL == connected) {
                        Errors.error((SubLObject)transcript_server.$str55$Transcript_server_connection_time);
                    }
                    if (transcript_server.NIL != incomplete) {
                        Errors.error((SubLObject)transcript_server.$str56$Transcript_server_operation_timeo);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)transcript_server.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            Errors.warn((SubLObject)transcript_server.$str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring((SubLObject)transcript_server.UNPROVIDED), error_message);
        }
        return running;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 9599L)
    public static SubLObject transcript_server_check() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject running = (SubLObject)transcript_server.NIL;
        SubLObject error_message = (SubLObject)transcript_server.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)transcript_server.$sym53$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject connected = (SubLObject)transcript_server.NIL;
                    SubLObject incomplete = (SubLObject)transcript_server.NIL;
                    SubLObject channel = (SubLObject)transcript_server.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), transcript_server.$master_transcript_server_connection_timeout$.getGlobalValue(), (SubLObject)transcript_server.$kw54$PRIVATE);
                        if (transcript_server.NIL != subl_macro_promotions.validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                            connected = (SubLObject)transcript_server.T;
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$6 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)transcript_server.T, thread);
                                    SubLObject timer = (SubLObject)transcript_server.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$7 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)transcript_server.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)transcript_server.THREE_INTEGER, tag);
                                            if (transcript_server.NIL != transcript_server_message_startup(channel)) {
                                                running = (SubLObject)transcript_server.T;
                                                transcript_server_message_shutdown(channel);
                                            }
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (transcript_server.NIL != channel) {
                                streams_high.close(channel, (SubLObject)transcript_server.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                    if (transcript_server.NIL == connected) {
                        Errors.error((SubLObject)transcript_server.$str55$Transcript_server_connection_time);
                    }
                    if (transcript_server.NIL != incomplete) {
                        Errors.error((SubLObject)transcript_server.$str56$Transcript_server_operation_timeo);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)transcript_server.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            Errors.warn((SubLObject)transcript_server.$str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring((SubLObject)transcript_server.UNPROVIDED), error_message);
        }
        return running;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 10212L)
    public static SubLObject total_master_transcript_operations_patient(SubLObject kb) {
        if (kb == transcript_server.UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = transcript_server.$transcript_server_kb_ops_count_timeout$.currentBinding(thread);
        try {
            transcript_server.$transcript_server_kb_ops_count_timeout$.bind((SubLObject)transcript_server.$int57$600, thread);
            return transcript_utilities.total_master_transcript_operations(kb);
        }
        finally {
            transcript_server.$transcript_server_kb_ops_count_timeout$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 10498L)
    public static SubLObject transcript_server_kb_ops_count(SubLObject kb) {
        if (kb == transcript_server.UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)transcript_server.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)transcript_server.$sym53$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject connected = (SubLObject)transcript_server.NIL;
                    SubLObject incomplete = (SubLObject)transcript_server.NIL;
                    SubLObject channel = (SubLObject)transcript_server.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), transcript_server.$master_transcript_server_connection_timeout$.getGlobalValue(), (SubLObject)transcript_server.$kw54$PRIVATE);
                        if (transcript_server.NIL != subl_macro_promotions.validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                            connected = (SubLObject)transcript_server.T;
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$10 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)transcript_server.T, thread);
                                    SubLObject timer = (SubLObject)transcript_server.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$11 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)transcript_server.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer(transcript_server.$transcript_server_kb_ops_count_timeout$.getDynamicValue(thread), tag);
                                            if (transcript_server.NIL != transcript_server_message_startup(channel)) {
                                                return ts_send_how_many_ops_message(channel, kb);
                                            }
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$11, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (transcript_server.NIL != channel) {
                                streams_high.close(channel, (SubLObject)transcript_server.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                    if (transcript_server.NIL == connected) {
                        Errors.error((SubLObject)transcript_server.$str55$Transcript_server_connection_time);
                    }
                    if (transcript_server.NIL != incomplete) {
                        Errors.error((SubLObject)transcript_server.$str56$Transcript_server_operation_timeo);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)transcript_server.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            Errors.warn((SubLObject)transcript_server.$str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring((SubLObject)transcript_server.UNPROVIDED), error_message);
        }
        return (SubLObject)transcript_server.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 11207L)
    public static SubLObject send_operations_to_server() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transcript_server.NIL == operation_communication.allow_transmitting()) {
            return (SubLObject)transcript_server.NIL;
        }
        SubLObject completed = (SubLObject)transcript_server.NIL;
        while (transcript_server.NIL == operation_queues.transmit_queue_empty()) {
            completed = (SubLObject)transcript_server.NIL;
            SubLObject error_message = (SubLObject)transcript_server.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)transcript_server.$sym53$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        SubLObject connected = (SubLObject)transcript_server.NIL;
                        SubLObject incomplete = (SubLObject)transcript_server.NIL;
                        SubLObject channel = (SubLObject)transcript_server.NIL;
                        try {
                            channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), transcript_server.$master_transcript_server_connection_timeout$.getGlobalValue(), (SubLObject)transcript_server.$kw54$PRIVATE);
                            if (transcript_server.NIL != subl_macro_promotions.validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                                connected = (SubLObject)transcript_server.T;
                                final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                                try {
                                    thread.throwStack.push(tag);
                                    final SubLObject _prev_bind_0_$14 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                    try {
                                        subl_macro_promotions.$within_with_timeout$.bind((SubLObject)transcript_server.T, thread);
                                        SubLObject timer = (SubLObject)transcript_server.NIL;
                                        try {
                                            final SubLObject _prev_bind_0_$15 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                            try {
                                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)transcript_server.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                timer = subl_macro_promotions.with_timeout_start_timer(transcript_server.$transcript_server_send_kb_ops_timeout$.getDynamicValue(thread), tag);
                                                if (transcript_server.NIL != transcript_server_message_startup(channel)) {
                                                    completed = send_operations_to_server_internal(channel);
                                                    transcript_server_message_shutdown(channel);
                                                }
                                            }
                                            finally {
                                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$15, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var) {
                                    incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (transcript_server.NIL != channel) {
                                    streams_high.close(channel, (SubLObject)transcript_server.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                            }
                        }
                        if (transcript_server.NIL == connected) {
                            Errors.error((SubLObject)transcript_server.$str55$Transcript_server_connection_time);
                        }
                        if (transcript_server.NIL != incomplete) {
                            Errors.error((SubLObject)transcript_server.$str56$Transcript_server_operation_timeo);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)transcript_server.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                error_message = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (error_message.isString()) {
                Errors.warn((SubLObject)transcript_server.$str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring((SubLObject)transcript_server.UNPROVIDED), error_message);
            }
            if (transcript_server.NIL == completed) {
                Errors.warn((SubLObject)transcript_server.$str61$Error_sending_operations_to_serve);
                return (SubLObject)transcript_server.NIL;
            }
        }
        return completed;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 11858L)
    public static SubLObject send_operations_to_server_internal(final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject op_count = operation_queues.transmit_queue_size();
        final SubLObject send_size = (transcript_server.NIL != subl_promotions.non_negative_integer_p(transcript_server.$transcript_server_send_chunk_size$.getDynamicValue(thread))) ? Numbers.min(transcript_server.$transcript_server_send_chunk_size$.getDynamicValue(thread), op_count) : op_count;
        thread.resetMultipleValues();
        final SubLObject data = operation_queues.transmit_queue_peek_chunk(send_size);
        final SubLObject chunk_size = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ts_send_send_ops_begin_message(channel, chunk_size);
        SubLObject cdolist_list_var = data;
        SubLObject op = (SubLObject)transcript_server.NIL;
        op = cdolist_list_var.first();
        while (transcript_server.NIL != cdolist_list_var) {
            ts_send_send_ops_op(channel, op);
            cdolist_list_var = cdolist_list_var.rest();
            op = cdolist_list_var.first();
        }
        ts_send_send_ops_end_message(channel);
        if (transcript_server.NIL != ts_read_send_ops_reply(channel)) {
            return operation_queues.transmit_queue_remove_chunk(data);
        }
        return (SubLObject)transcript_server.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 12702L)
    public static SubLObject submit_operations_to_server(final SubLObject relative_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transcript_server.NIL == operation_communication.allow_transmitting()) {
            return (SubLObject)transcript_server.NIL;
        }
        SubLObject completed = (SubLObject)transcript_server.NIL;
        SubLObject error_message = (SubLObject)transcript_server.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)transcript_server.$sym53$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject connected = (SubLObject)transcript_server.NIL;
                    SubLObject incomplete = (SubLObject)transcript_server.NIL;
                    SubLObject channel = (SubLObject)transcript_server.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), transcript_server.$master_transcript_server_connection_timeout$.getGlobalValue(), (SubLObject)transcript_server.$kw54$PRIVATE);
                        if (transcript_server.NIL != subl_macro_promotions.validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                            connected = (SubLObject)transcript_server.T;
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$18 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)transcript_server.T, thread);
                                    SubLObject timer = (SubLObject)transcript_server.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$19 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)transcript_server.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)transcript_server.$int59$240, tag);
                                            if (transcript_server.NIL != transcript_server_message_startup(channel)) {
                                                completed = submit_operations_to_server_internal(channel, relative_filename);
                                                transcript_server_message_shutdown(channel);
                                            }
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$19, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$18, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (transcript_server.NIL != channel) {
                                streams_high.close(channel, (SubLObject)transcript_server.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                        }
                    }
                    if (transcript_server.NIL == connected) {
                        Errors.error((SubLObject)transcript_server.$str55$Transcript_server_connection_time);
                    }
                    if (transcript_server.NIL != incomplete) {
                        Errors.error((SubLObject)transcript_server.$str56$Transcript_server_operation_timeo);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)transcript_server.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            Errors.warn((SubLObject)transcript_server.$str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring((SubLObject)transcript_server.UNPROVIDED), error_message);
        }
        if (transcript_server.NIL == completed) {
            Errors.warn((SubLObject)transcript_server.$str62$Error_submitting_operations_to_se, relative_filename);
        }
        return completed;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 13472L)
    public static SubLObject submit_operations_to_server_internal(final SubLObject channel, final SubLObject relative_filename) {
        final SubLObject op_count = operation_queues.transmit_queue_size();
        ts_send_submit_ops_begin_message(channel, op_count, relative_filename);
        while (transcript_server.NIL == operation_queues.transmit_queue_empty()) {
            final SubLObject op = operation_queues.transmit_queue_dequeue();
            ts_send_submit_ops_op(channel, op);
        }
        ts_send_submit_ops_end_message(channel);
        return ts_read_submit_ops_reply(channel);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 13974L)
    public static SubLObject read_operations_from_server() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject completed = (SubLObject)transcript_server.NIL;
        SubLObject op_count = (SubLObject)transcript_server.NIL;
        SubLObject error_message = (SubLObject)transcript_server.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)transcript_server.$sym53$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject connected = (SubLObject)transcript_server.NIL;
                    SubLObject incomplete = (SubLObject)transcript_server.NIL;
                    SubLObject channel = (SubLObject)transcript_server.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread), transcript_server.$master_transcript_server_connection_timeout$.getGlobalValue(), (SubLObject)transcript_server.$kw54$PRIVATE);
                        if (transcript_server.NIL != subl_macro_promotions.validate_tcp_connection(channel, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread))) {
                            connected = (SubLObject)transcript_server.T;
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$22 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)transcript_server.T, thread);
                                    SubLObject timer = (SubLObject)transcript_server.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$23 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)transcript_server.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)transcript_server.TWENTY_INTEGER, tag);
                                            if (transcript_server.NIL != transcript_server_message_startup(channel)) {
                                                op_count = read_operations_from_server_internal(channel);
                                                completed = (SubLObject)transcript_server.T;
                                                transcript_server_message_shutdown(channel);
                                            }
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$23, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$22, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                incomplete = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transcript_server.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (transcript_server.NIL != channel) {
                                streams_high.close(channel, (SubLObject)transcript_server.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                    if (transcript_server.NIL == connected) {
                        Errors.error((SubLObject)transcript_server.$str55$Transcript_server_connection_time);
                    }
                    if (transcript_server.NIL != incomplete) {
                        Errors.error((SubLObject)transcript_server.$str56$Transcript_server_operation_timeo);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)transcript_server.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (error_message.isString()) {
            Errors.warn((SubLObject)transcript_server.$str21$_A__Error_while_connecting_to_tra, numeric_date_utilities.timestring((SubLObject)transcript_server.UNPROVIDED), error_message);
        }
        if (transcript_server.NIL != completed) {
            if (op_count.numGE(operation_communication.read_transcript_op_limit())) {
                control_vars.set_caught_up_on_master_transcript((SubLObject)transcript_server.NIL);
            }
            else {
                control_vars.set_caught_up_on_master_transcript((SubLObject)transcript_server.T);
            }
        }
        else {
            control_vars.set_caught_up_on_master_transcript((SubLObject)transcript_server.T);
        }
        return completed;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 14872L)
    public static SubLObject read_operations_from_server_internal(final SubLObject channel) {
        SubLObject op_count = (SubLObject)transcript_server.ZERO_INTEGER;
        SubLObject completed = (SubLObject)transcript_server.NIL;
        if (transcript_server.NIL != ts_send_get_ops_message(channel)) {
            SubLObject expr;
            for (expr = (SubLObject)transcript_server.NIL, expr = read_one_transcript_operation_from_server(channel); !expr.equal((SubLObject)transcript_server.NIL); expr = read_one_transcript_operation_from_server(channel)) {
                operation_queues.add_to_remote_queue(expr);
                op_count = Numbers.add(op_count, (SubLObject)transcript_server.ONE_INTEGER);
            }
            completed = (SubLObject)transcript_server.T;
        }
        if (transcript_server.NIL != completed) {
            return op_count;
        }
        return (SubLObject)transcript_server.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transcript-server.lisp", position = 15312L)
    public static SubLObject read_one_transcript_operation_from_server(final SubLObject instream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject next_char = streams_high.read_char(instream, (SubLObject)transcript_server.NIL, (SubLObject)transcript_server.$kw27$EOF, (SubLObject)transcript_server.UNPROVIDED);
        if (next_char.eql((SubLObject)Characters.CHAR_period)) {
            string_utilities.network_read_line(instream, (SubLObject)transcript_server.NIL, (SubLObject)transcript_server.$kw27$EOF, (SubLObject)transcript_server.UNPROVIDED);
            return (SubLObject)transcript_server.NIL;
        }
        streams_high.unread_char(next_char, instream);
        thread.resetMultipleValues();
        final SubLObject expr = reader.read_ignoring_errors(instream, (SubLObject)transcript_server.NIL, (SubLObject)transcript_server.$kw27$EOF);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (expr == transcript_server.$kw27$EOF) {
            return (SubLObject)transcript_server.NIL;
        }
        if (status == transcript_server.$kw28$ERROR) {
            return (SubLObject)transcript_server.NIL;
        }
        if (transcript_server.NIL != operation_communication.valid_transcript_expression(expr)) {
            return expr;
        }
        return (SubLObject)transcript_server.NIL;
    }
    
    public static SubLObject declare_transcript_server_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "use_transcript_server", "USE-TRANSCRIPT-SERVER", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.transcript_server", "with_transcript_server_connection", "WITH-TRANSCRIPT-SERVER-CONNECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.transcript_server", "transcript_server_message_body", "TRANSCRIPT-SERVER-MESSAGE-BODY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "transcript_server_message_startup", "TRANSCRIPT-SERVER-MESSAGE-STARTUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "transcript_server_message_shutdown", "TRANSCRIPT-SERVER-MESSAGE-SHUTDOWN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "transcript_server_terpri", "TRANSCRIPT-SERVER-TERPRI", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "transcript_server_read_line", "TRANSCRIPT-SERVER-READ-LINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "transcript_server_reply_verify", "TRANSCRIPT-SERVER-REPLY-VERIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_ack_server_connection", "TS-ACK-SERVER-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_set_image_message", "TS-SEND-SET-IMAGE-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_set_kb_message", "TS-SEND-SET-KB-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_set_op_message", "TS-SEND-SET-OP-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_how_many_ops_message", "TS-SEND-HOW-MANY-OPS-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_send_ops_begin_message", "TS-SEND-SEND-OPS-BEGIN-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_send_ops_op", "TS-SEND-SEND-OPS-OP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_send_ops_end_message", "TS-SEND-SEND-OPS-END-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_read_send_ops_reply", "TS-READ-SEND-OPS-REPLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_submit_ops_begin_message", "TS-SEND-SUBMIT-OPS-BEGIN-MESSAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_submit_ops_op", "TS-SEND-SUBMIT-OPS-OP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_submit_ops_end_message", "TS-SEND-SUBMIT-OPS-END-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_read_submit_ops_reply", "TS-READ-SUBMIT-OPS-REPLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_get_ops_message", "TS-SEND-GET-OPS-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "ts_send_quit_message", "TS-SEND-QUIT-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "transcript_server_connection_check", "TRANSCRIPT-SERVER-CONNECTION-CHECK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "transcript_server_check", "TRANSCRIPT-SERVER-CHECK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "total_master_transcript_operations_patient", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PATIENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "transcript_server_kb_ops_count", "TRANSCRIPT-SERVER-KB-OPS-COUNT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "send_operations_to_server", "SEND-OPERATIONS-TO-SERVER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "send_operations_to_server_internal", "SEND-OPERATIONS-TO-SERVER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "submit_operations_to_server", "SUBMIT-OPERATIONS-TO-SERVER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "submit_operations_to_server_internal", "SUBMIT-OPERATIONS-TO-SERVER-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "read_operations_from_server", "READ-OPERATIONS-FROM-SERVER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "read_operations_from_server_internal", "READ-OPERATIONS-FROM-SERVER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transcript_server", "read_one_transcript_operation_from_server", "READ-ONE-TRANSCRIPT-OPERATION-FROM-SERVER", 1, 0, false);
        return (SubLObject)transcript_server.NIL;
    }
    
    public static SubLObject init_transcript_server_file() {
        transcript_server.$master_transcript_server_connection_timeout$ = SubLFiles.deflexical("*MASTER-TRANSCRIPT-SERVER-CONNECTION-TIMEOUT*", (SubLObject)transcript_server.TEN_INTEGER);
        transcript_server.$transcript_server_protocol_version$ = SubLFiles.defvar("*TRANSCRIPT-SERVER-PROTOCOL-VERSION*", (SubLObject)transcript_server.ONE_INTEGER);
        transcript_server.$transcript_server_kb_ops_count_timeout$ = SubLFiles.defparameter("*TRANSCRIPT-SERVER-KB-OPS-COUNT-TIMEOUT*", (SubLObject)transcript_server.THREE_INTEGER);
        transcript_server.$transcript_server_send_kb_ops_timeout$ = SubLFiles.defparameter("*TRANSCRIPT-SERVER-SEND-KB-OPS-TIMEOUT*", (SubLObject)transcript_server.$int59$240);
        transcript_server.$transcript_server_send_chunk_size$ = SubLFiles.defparameter("*TRANSCRIPT-SERVER-SEND-CHUNK-SIZE*", (SubLObject)transcript_server.$int60$10000);
        return (SubLObject)transcript_server.NIL;
    }
    
    public static SubLObject setup_transcript_server_file() {
        return (SubLObject)transcript_server.NIL;
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
    
    static {
        me = (SubLFile)new transcript_server();
        transcript_server.$master_transcript_server_connection_timeout$ = null;
        transcript_server.$transcript_server_protocol_version$ = null;
        transcript_server.$transcript_server_kb_ops_count_timeout$ = null;
        transcript_server.$transcript_server_send_kb_ops_timeout$ = null;
        transcript_server.$transcript_server_send_chunk_size$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHANNEL"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATION-TIMEOUT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPERATION-TIMEOUT"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$OPERATION_TIMEOUT = SubLObjectFactory.makeKeyword("OPERATION-TIMEOUT");
        $sym4$ERROR_MESSAGE = SubLObjectFactory.makeUninternedSymbol("ERROR-MESSAGE");
        $sym5$CONNECTED = SubLObjectFactory.makeUninternedSymbol("CONNECTED");
        $sym6$INCOMPLETE = SubLObjectFactory.makeUninternedSymbol("INCOMPLETE");
        $sym7$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym8$CATCH_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
        $sym9$WITH_TCP_CONNECTION = SubLObjectFactory.makeSymbol("WITH-TCP-CONNECTION");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MASTER-TRANSCRIPT-LOCK-HOST*"), (SubLObject)SubLObjectFactory.makeSymbol("*MASTER-TRANSCRIPT-SERVER-PORT*"), (SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("*MASTER-TRANSCRIPT-SERVER-CONNECTION-TIMEOUT*"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESS-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $sym11$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list12 = ConsesLow.list((SubLObject)transcript_server.T);
        $sym13$WITH_TIMEOUT = SubLObjectFactory.makeSymbol("WITH-TIMEOUT");
        $sym14$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym15$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Transcript server connection timeout")));
        $sym17$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Transcript server operation timeout")));
        $sym19$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym20$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str21$_A__Error_while_connecting_to_tra = SubLObjectFactory.makeString("~A: Error while connecting to transcript server!~%~A~%");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMESTRING"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHANNEL"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym24$TRANSCRIPT_SERVER_MESSAGE_STARTUP = SubLObjectFactory.makeSymbol("TRANSCRIPT-SERVER-MESSAGE-STARTUP");
        $sym25$TRANSCRIPT_SERVER_MESSAGE_SHUTDOWN = SubLObjectFactory.makeSymbol("TRANSCRIPT-SERVER-MESSAGE-SHUTDOWN");
        $str26$Connection_to_transcript_server_w = SubLObjectFactory.makeString("Connection to transcript server was not cleanly closed");
        $kw27$EOF = SubLObjectFactory.makeKeyword("EOF");
        $kw28$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str29$400 = SubLObjectFactory.makeString("400");
        $str30$200 = SubLObjectFactory.makeString("200");
        $str31$Set_Image__A = SubLObjectFactory.makeString("Set-Image ~A");
        $str32$201 = SubLObjectFactory.makeString("201");
        $str33$Set_KB__A = SubLObjectFactory.makeString("Set-KB ~A");
        $str34$202 = SubLObjectFactory.makeString("202");
        $str35$Set_Op__A = SubLObjectFactory.makeString("Set-Op ~A");
        $str36$203 = SubLObjectFactory.makeString("203");
        $str37$210 = SubLObjectFactory.makeString("210");
        $str38$211 = SubLObjectFactory.makeString("211");
        $str39$212 = SubLObjectFactory.makeString("212");
        $str40$How_Many_Ops__A = SubLObjectFactory.makeString("How-Many-Ops ~A");
        $str41$207 = SubLObjectFactory.makeString("207");
        $kw42$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym43$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str44$Send_Ops__A = SubLObjectFactory.makeString("Send-Ops ~A");
        $str45$_A = SubLObjectFactory.makeString("~A");
        $str46$204 = SubLObjectFactory.makeString("204");
        $str47$Submit_Ops__A__A = SubLObjectFactory.makeString("Submit-Ops ~A ~A");
        $str48$208 = SubLObjectFactory.makeString("208");
        $str49$Get_Ops__A = SubLObjectFactory.makeString("Get-Ops ~A");
        $str50$205 = SubLObjectFactory.makeString("205");
        $str51$Quit = SubLObjectFactory.makeString("Quit");
        $str52$206 = SubLObjectFactory.makeString("206");
        $sym53$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw54$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $str55$Transcript_server_connection_time = SubLObjectFactory.makeString("Transcript server connection timeout");
        $str56$Transcript_server_operation_timeo = SubLObjectFactory.makeString("Transcript server operation timeout");
        $int57$600 = SubLObjectFactory.makeInteger(600);
        $sym58$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $int59$240 = SubLObjectFactory.makeInteger(240);
        $int60$10000 = SubLObjectFactory.makeInteger(10000);
        $str61$Error_sending_operations_to_serve = SubLObjectFactory.makeString("Error sending operations to server");
        $str62$Error_submitting_operations_to_se = SubLObjectFactory.makeString("Error submitting operations to server file ~A");
    }
}

/*

	Total time: 589 ms
	
*/