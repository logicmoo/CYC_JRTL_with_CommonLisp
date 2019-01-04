package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class simple_queue_service extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.simple_queue_service";
    public static final String myFingerPrint = "8a633f7fc1f744f97c3487a29ecd721fce19eee1662d42050efbbf3ec06cc557";
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2237L)
    private static SubLSymbol $local_sqs_relay_host$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2395L)
    private static SubLSymbol $local_sqs_relay_port$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2509L)
    public static SubLSymbol $default_sqs_retries$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2603L)
    public static SubLSymbol $default_sqs_wait_secs$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 3471L)
    public static SubLSymbol $sqs_error_reporting_policy$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 11668L)
    private static SubLSymbol $default_sqs_request_attribute_list$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13334L)
    private static SubLSymbol $get_empty_sqs_enqueue_command_fragments_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 26523L)
    public static SubLSymbol $recommended_max_hex_chars_per_sqs_message$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 26752L)
    public static SubLSymbol $recommended_max_bytes_per_sqs_message$;
    private static final SubLString $str0$localhost;
    private static final SubLInteger $int1$19219;
    private static final SubLSymbol $kw2$OK;
    private static final SubLSymbol $kw3$NOT_AN_SQS_RESPONSE;
    private static final SubLSymbol $kw4$WARN_ON_ERROR;
    private static final SubLString $str5$Received_error__A___A____;
    private static final SubLSymbol $kw6$ERROR_ON_ERROR;
    private static final SubLList $list7;
    private static final SubLString $str8$;
    private static final SubLSymbol $kw9$MESSAGE;
    private static final SubLSymbol $sym10$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw11$PUBLIC;
    private static final SubLSymbol $sym12$STRINGP;
    private static final SubLString $str13$Only_support_STRINGP_or_LIST_OF_T;
    private static final SubLSymbol $kw14$EOF;
    private static final SubLString $str15$Empty_result_____suspicious_;
    private static final SubLSymbol $kw16$ERROR;
    private static final SubLString $str17$Bogus_result_returned_by_server_;
    private static final SubLString $str18$format;
    private static final SubLString $str19$subl;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$CWITH_OUTPUT_TO_STRING;
    private static final SubLSymbol $sym22$CLET;
    private static final SubLSymbol $sym23$_XML_STREAM_;
    private static final SubLSymbol $sym24$XML_TAG;
    private static final SubLList $list25;
    private static final SubLString $str26$request;
    private static final SubLSymbol $kw27$UNINITIALIZED;
    private static final SubLString $str28$version;
    private static final SubLString $str29$createq;
    private static final SubLString $str30$deleteq;
    private static final SubLString $str31$enqueue;
    private static final SubLSymbol $sym32$GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS;
    private static final SubLSymbol $sym33$_GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS_CACHING_STATE_;
    private static final SubLString $str34$dequeue;
    private static final SubLString $str35$pending;
    private static final SubLString $str36$listqs;
    private static final SubLString $str37$putfile;
    private static final SubLString $str38$data;
    private static final SubLString $str39$getfile;
    private static final SubLString $str40$name;
    private static final SubLString $str41$maxTries;
    private static final SubLString $str42$maxWaitSecs;
    private static final SubLString $str43$bucket;
    private static final SubLString $str44$key;
    private static final SubLSymbol $sym45$SQS_ITERATOR_DONE_;
    private static final SubLSymbol $sym46$SQS_ITERATOR_NEXT;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$SQS_ACCUMULATOR_RESET;
    private static final SubLSymbol $sym49$SQS_ACCUMULATOR_ADD;
    private static final SubLSymbol $sym50$SQS_ACCUMULATOR_SIZE;
    private static final SubLSymbol $sym51$SQS_ACCUMULATOR_CONTENTS;
    private static final SubLSymbol $sym52$SQS_ACCUMULATOR_IT;
    private static final SubLList $list53;
    private static final SubLString $str54$Could_not_post__A_to__A_;
    private static final SubLSymbol $sym55$ACCUMULATOR_P;
    private static final SubLSymbol $kw56$SENTENCE;
    private static final SubLSymbol $kw57$ELMT;
    private static final SubLSymbol $kw58$PROPERTIES;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$GETF;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLSymbol $kw63$EXHAUSTED;
    private static final SubLSymbol $sym64$COMPACT_HL_EXTERNAL_ID_STRING;
    private static final SubLSymbol $sym65$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING;
    private static final SubLInteger $int66$8192;
    private static final SubLInteger $int67$256;
    private static final SubLSymbol $sym68$SGMT_ACCUMULATOR_RESET;
    private static final SubLSymbol $sym69$SGMT_ACCUMULATOR_ADD;
    private static final SubLSymbol $sym70$SGMT_ACCUMULATOR_SIZE;
    private static final SubLSymbol $sym71$SGMT_ACCUMULATOR_CONTENTS;
    private static final SubLSymbol $sym72$SGMT_ACCUMULATOR_IT;
    private static final SubLList $list73;
    private static final SubLString $str74$Object__A_encodes_as__A_bytes__mo;
    private static final SubLString $str75$Implementation_error__serializing;
    private static final SubLSymbol $sym76$ITERATOR_P;
    private static final SubLSymbol $sym77$SQS_SGMNT_IT_DONE;
    private static final SubLSymbol $sym78$SQS_SGMNT_IT_NEXT;
    private static final SubLList $list79;
    private static final SubLInteger $int80$30;
    private static final SubLString $str81$___A__A___A_msgs__;
    private static final SubLSymbol $kw82$ALL_EMPTY;
    private static final SubLString $str83$___A__Cleaning_up_ca__A_msgs_from;
    private static final SubLString $str84$___A__Removed__A_msgs_from__A___;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$PROGN;
    private static final SubLSymbol $sym87$MUST;
    private static final SubLSymbol $sym88$IS_KNOWN_SQS_QUEUE_;
    private static final SubLString $str89$_A_is_not_a_known_SQS_queue______;
    private static final SubLSymbol $sym90$CSETQ;
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2700L)
    public static SubLObject success_sqs_response_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(simple_queue_service.NIL != sqs_response_p(v_object) && simple_queue_service.$kw2$OK == v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2872L)
    public static SubLObject sqs_response_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && v_object.first().isKeyword() && simple_queue_service.NIL != list_utilities.lengthE(v_object, (SubLObject)simple_queue_service.TWO_INTEGER, (SubLObject)simple_queue_service.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 3015L)
    public static SubLObject sqs_response_status(final SubLObject v_object) {
        if (simple_queue_service.NIL != sqs_response_p(v_object)) {
            return v_object.first();
        }
        return (SubLObject)simple_queue_service.$kw3$NOT_AN_SQS_RESPONSE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 3156L)
    public static SubLObject sqs_response_reply(final SubLObject v_object) {
        if (simple_queue_service.NIL != sqs_response_p(v_object)) {
            return conses_high.second(v_object);
        }
        return (SubLObject)simple_queue_service.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 3279L)
    public static SubLObject sqs_empty_message_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(simple_queue_service.NIL != success_sqs_response_p(v_object) && simple_queue_service.NIL == sqs_response_reply(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 3630L)
    public static SubLObject process_sqs_error_response(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (simple_queue_service.NIL != sqs_response_p(v_object)) {
            final SubLObject msg1 = conses_high.second(v_object);
            final SubLObject msg2 = conses_high.third(v_object);
            final SubLObject pcase_var = simple_queue_service.$sqs_error_reporting_policy$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)simple_queue_service.$kw4$WARN_ON_ERROR)) {
                Errors.warn((SubLObject)simple_queue_service.$str5$Received_error__A___A____, msg1, msg2);
            }
            else if (pcase_var.eql((SubLObject)simple_queue_service.$kw6$ERROR_ON_ERROR)) {
                Errors.error((SubLObject)simple_queue_service.$str5$Received_error__A___A____, msg1, msg2);
            }
        }
        return (SubLObject)simple_queue_service.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 4025L)
    public static SubLObject get_sqs_version() {
        return communicate_with_local_sqs_relayer(get_sqs_version_command());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 4298L)
    public static SubLObject is_sqs_availableP() {
        return success_sqs_response_p(get_sqs_version());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 4435L)
    public static SubLObject sqs_list_queues() {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_list_queues_command());
        if (simple_queue_service.NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 4907L)
    public static SubLObject is_known_sqs_queueP(final SubLObject queue_name) {
        return (SubLObject)SubLObjectFactory.makeBoolean(queue_name.isString() && sqs_pending_message_estimate(queue_name).isNumber());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 5154L)
    public static SubLObject sqs_create_queue(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == simple_queue_service.UNPROVIDED) {
            retries = simple_queue_service.$default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == simple_queue_service.UNPROVIDED) {
            wait_secs = simple_queue_service.$default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_create_queue_command(queue_name, retries, wait_secs));
        if (simple_queue_service.NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 5737L)
    public static SubLObject sqs_delete_queue(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == simple_queue_service.UNPROVIDED) {
            retries = simple_queue_service.$default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == simple_queue_service.UNPROVIDED) {
            wait_secs = simple_queue_service.$default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_delete_queue_command(queue_name, retries, wait_secs));
        if (simple_queue_service.NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 6331L)
    public static SubLObject sqs_post_message(final SubLObject queue_name, final SubLObject message) {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_enqueue_command(queue_name, message));
        if (simple_queue_service.NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 6826L)
    public static SubLObject sqs_post_message_pieces(final SubLObject queue_name, final SubLObject message_pieces) {
        SubLObject current;
        final SubLObject datum = current = get_empty_sqs_enqueue_command_fragments(queue_name);
        SubLObject preamble = (SubLObject)simple_queue_service.NIL;
        SubLObject postamble = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list7);
        preamble = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list7);
        postamble = current.first();
        current = current.rest();
        if (simple_queue_service.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)simple_queue_service.$list7);
            return (SubLObject)simple_queue_service.NIL;
        }
        final SubLObject final_message_pieces = list_utilities.flatten((SubLObject)ConsesLow.list(preamble, message_pieces, postamble));
        final SubLObject reply = communicate_with_local_sqs_relayer(final_message_pieces);
        if (simple_queue_service.NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 7439L)
    public static SubLObject sqs_get_message(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == simple_queue_service.UNPROVIDED) {
            retries = simple_queue_service.$default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == simple_queue_service.UNPROVIDED) {
            wait_secs = simple_queue_service.$default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_dequeue_command(queue_name, retries, wait_secs));
        if (simple_queue_service.NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 8149L)
    public static SubLObject sqs_message_body_from_message(final SubLObject message, SubLObject v_default) {
        if (v_default == simple_queue_service.UNPROVIDED) {
            v_default = (SubLObject)simple_queue_service.$str8$;
        }
        return conses_high.getf(message, (SubLObject)simple_queue_service.$kw9$MESSAGE, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 8330L)
    public static SubLObject sqs_get_message_content(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == simple_queue_service.UNPROVIDED) {
            retries = simple_queue_service.$default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == simple_queue_service.UNPROVIDED) {
            wait_secs = simple_queue_service.$default_sqs_wait_secs$.getGlobalValue();
        }
        return sqs_message_body_from_message(sqs_get_message(queue_name, retries, wait_secs), (SubLObject)simple_queue_service.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 8733L)
    public static SubLObject sqs_pending_message_estimate(final SubLObject queue_name) {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_pending_message_estimate_command(queue_name));
        if (simple_queue_service.NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 9137L)
    public static SubLObject s3_put_file(final SubLObject bucket, final SubLObject key, final SubLObject filename) {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_s3_putfile_command(bucket, key, filename));
        if (simple_queue_service.NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 9539L)
    public static SubLObject s3_get_file_contents(final SubLObject bucket, final SubLObject key) {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_s3_getfile_command(bucket, key));
        if (simple_queue_service.NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 9945L)
    public static SubLObject s3_get_file(final SubLObject bucket, final SubLObject key, final SubLObject filename) {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_s3_getfile_command(bucket, key));
        if (simple_queue_service.NIL != success_sqs_response_p(reply)) {
            final SubLObject data = sqs_response_reply(reply);
            final SubLObject size = file_utilities.hex_string_to_file_contents(data, filename);
            return size;
        }
        process_sqs_error_response(reply);
        return (SubLObject)simple_queue_service.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 10467L)
    public static SubLObject communicate_with_local_sqs_relayer(final SubLObject command) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)simple_queue_service.NIL;
        SubLObject message = (SubLObject)simple_queue_service.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)simple_queue_service.$sym10$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject s = (SubLObject)simple_queue_service.NIL;
                    try {
                        s = subl_promotions.open_tcp_stream_with_timeout(simple_queue_service.$local_sqs_relay_host$.getDynamicValue(thread), simple_queue_service.$local_sqs_relay_port$.getDynamicValue(thread), (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw11$PUBLIC);
                        if (simple_queue_service.NIL != subl_macro_promotions.validate_tcp_connection(s, simple_queue_service.$local_sqs_relay_host$.getDynamicValue(thread), simple_queue_service.$local_sqs_relay_port$.getDynamicValue(thread))) {
                            if (command.isString()) {
                                streams_high.write_string(command, s, (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED);
                            }
                            else if (simple_queue_service.NIL != list_utilities.list_of_type_p((SubLObject)simple_queue_service.$sym12$STRINGP, command)) {
                                SubLObject cdolist_list_var = command;
                                SubLObject fragment = (SubLObject)simple_queue_service.NIL;
                                fragment = cdolist_list_var.first();
                                while (simple_queue_service.NIL != cdolist_list_var) {
                                    streams_high.write_string(fragment, s, (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    fragment = cdolist_list_var.first();
                                }
                            }
                            else {
                                Errors.error((SubLObject)simple_queue_service.$str13$Only_support_STRINGP_or_LIST_OF_T);
                            }
                            string_utilities.network_terpri(s);
                            streams_high.force_output(s);
                            result = reader.read(s, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw14$EOF, (SubLObject)simple_queue_service.UNPROVIDED);
                            if (result.isCons()) {
                                result = Eval.eval(result);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (simple_queue_service.NIL != s) {
                                streams_high.close(s, (SubLObject)simple_queue_service.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)simple_queue_service.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (simple_queue_service.NIL == result || result == simple_queue_service.$kw14$EOF) {
            message = (SubLObject)simple_queue_service.$str15$Empty_result_____suspicious_;
        }
        if (message.isString()) {
            return (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$kw16$ERROR, (SubLObject)simple_queue_service.$str17$Bogus_result_returned_by_server_, message);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 11755L)
    public static SubLObject with_sqs_message_to_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)simple_queue_service.NIL;
        SubLObject string = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list20);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list20);
        string = current.first();
        current = current.rest();
        if (simple_queue_service.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$sym21$CWITH_OUTPUT_TO_STRING, (SubLObject)ConsesLow.list(stream, string), (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$sym23$_XML_STREAM_, stream)), (SubLObject)ConsesLow.listS((SubLObject)simple_queue_service.$sym24$XML_TAG, (SubLObject)simple_queue_service.$list25, ConsesLow.append(body, (SubLObject)simple_queue_service.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)simple_queue_service.$list20);
        return (SubLObject)simple_queue_service.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 12029L)
    public static SubLObject get_sqs_version_command() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject command = (SubLObject)simple_queue_service.NIL;
        SubLObject s = (SubLObject)simple_queue_service.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str26$request, simple_queue_service.$default_sqs_request_attribute_list$.getGlobalValue(), (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$3 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str28$version, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.T, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$4, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str26$request);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)simple_queue_service.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 12193L)
    public static SubLObject get_sqs_create_queue_command(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == simple_queue_service.UNPROVIDED) {
            retries = simple_queue_service.$default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == simple_queue_service.UNPROVIDED) {
            wait_secs = simple_queue_service.$default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_access_attribute_list(queue_name, retries, wait_secs);
        SubLObject command = (SubLObject)simple_queue_service.NIL;
        SubLObject s = (SubLObject)simple_queue_service.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$7 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str26$request, simple_queue_service.$default_sqs_request_attribute_list$.getGlobalValue(), (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$9 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str29$createq, att_list, (SubLObject)simple_queue_service.T, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$9, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$7, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str26$request);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)simple_queue_service.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 12624L)
    public static SubLObject get_sqs_delete_queue_command(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == simple_queue_service.UNPROVIDED) {
            retries = simple_queue_service.$default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == simple_queue_service.UNPROVIDED) {
            wait_secs = simple_queue_service.$default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_access_attribute_list(queue_name, retries, wait_secs);
        SubLObject command = (SubLObject)simple_queue_service.NIL;
        SubLObject s = (SubLObject)simple_queue_service.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str26$request, simple_queue_service.$default_sqs_request_attribute_list$.getGlobalValue(), (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str30$deleteq, att_list, (SubLObject)simple_queue_service.T, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$14, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str26$request);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)simple_queue_service.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13055L)
    public static SubLObject get_sqs_enqueue_command(final SubLObject queue_name, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_attribute_list(queue_name);
        SubLObject command = (SubLObject)simple_queue_service.NIL;
        SubLObject s = (SubLObject)simple_queue_service.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str26$request, simple_queue_service.$default_sqs_request_attribute_list$.getGlobalValue(), (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            try {
                                final SubLObject _prev_bind_0_$19 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str31$enqueue, att_list, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                                        xml_utilities.xml_write(string, (SubLObject)simple_queue_service.UNPROVIDED);
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$20, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$19, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str31$enqueue);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                }
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$17, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str26$request);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)simple_queue_service.UNPROVIDED);
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return command;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13334L)
    public static SubLObject clear_get_empty_sqs_enqueue_command_fragments() {
        final SubLObject cs = simple_queue_service.$get_empty_sqs_enqueue_command_fragments_caching_state$.getGlobalValue();
        if (simple_queue_service.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)simple_queue_service.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13334L)
    public static SubLObject remove_get_empty_sqs_enqueue_command_fragments(final SubLObject queue_name) {
        return memoization_state.caching_state_remove_function_results_with_args(simple_queue_service.$get_empty_sqs_enqueue_command_fragments_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(queue_name), (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13334L)
    public static SubLObject get_empty_sqs_enqueue_command_fragments_internal(final SubLObject queue_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_attribute_list(queue_name);
        SubLObject split_point = (SubLObject)simple_queue_service.NIL;
        SubLObject command = (SubLObject)simple_queue_service.NIL;
        SubLObject s = (SubLObject)simple_queue_service.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str26$request, simple_queue_service.$default_sqs_request_attribute_list$.getGlobalValue(), (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            try {
                                final SubLObject _prev_bind_0_$26 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str31$enqueue, att_list, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                                        split_point = streams_high.file_position(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)simple_queue_service.UNPROVIDED);
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$27, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$27, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$26, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str31$enqueue);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                }
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$24, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str26$request);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)simple_queue_service.UNPROVIDED);
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)ConsesLow.list(string_utilities.substring(command, (SubLObject)simple_queue_service.ZERO_INTEGER, split_point), string_utilities.substring(command, split_point, (SubLObject)simple_queue_service.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13334L)
    public static SubLObject get_empty_sqs_enqueue_command_fragments(final SubLObject queue_name) {
        SubLObject caching_state = simple_queue_service.$get_empty_sqs_enqueue_command_fragments_caching_state$.getGlobalValue();
        if (simple_queue_service.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)simple_queue_service.$sym32$GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS, (SubLObject)simple_queue_service.$sym33$_GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS_CACHING_STATE_, (SubLObject)simple_queue_service.TWENTY_INTEGER, (SubLObject)simple_queue_service.EQUAL, (SubLObject)simple_queue_service.ONE_INTEGER, (SubLObject)simple_queue_service.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, queue_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_empty_sqs_enqueue_command_fragments_internal(queue_name)));
            memoization_state.caching_state_put(caching_state, queue_name, results, (SubLObject)simple_queue_service.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13876L)
    public static SubLObject get_sqs_dequeue_command(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == simple_queue_service.UNPROVIDED) {
            retries = simple_queue_service.$default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == simple_queue_service.UNPROVIDED) {
            wait_secs = simple_queue_service.$default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_access_attribute_list(queue_name, retries, wait_secs);
        SubLObject command = (SubLObject)simple_queue_service.NIL;
        SubLObject s = (SubLObject)simple_queue_service.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str26$request, simple_queue_service.$default_sqs_request_attribute_list$.getGlobalValue(), (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$33 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str34$dequeue, att_list, (SubLObject)simple_queue_service.T, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$33 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$33, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$33, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$31, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str26$request);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)simple_queue_service.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 14297L)
    public static SubLObject get_sqs_pending_message_estimate_command(final SubLObject queue_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_attribute_list(queue_name);
        SubLObject command = (SubLObject)simple_queue_service.NIL;
        SubLObject s = (SubLObject)simple_queue_service.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str26$request, simple_queue_service.$default_sqs_request_attribute_list$.getGlobalValue(), (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str35$pending, att_list, (SubLObject)simple_queue_service.T, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$38 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$38, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$37, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$36, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str26$request);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)simple_queue_service.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 14555L)
    public static SubLObject get_sqs_list_queues_command() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject command = (SubLObject)simple_queue_service.NIL;
        SubLObject s = (SubLObject)simple_queue_service.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str26$request, simple_queue_service.$default_sqs_request_attribute_list$.getGlobalValue(), (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$43 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str36$listqs, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.T, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$43, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$42, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$41, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str26$request);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)simple_queue_service.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 14722L)
    public static SubLObject get_s3_putfile_command(final SubLObject bucket, final SubLObject key, final SubLObject pathname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data = file_utilities.file_contents_to_hex_string(pathname);
        final SubLObject att_list = get_s3_file_attribute_list(bucket, key);
        SubLObject command = (SubLObject)simple_queue_service.NIL;
        SubLObject s = (SubLObject)simple_queue_service.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str26$request, simple_queue_service.$default_sqs_request_attribute_list$.getGlobalValue(), (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            try {
                                final SubLObject _prev_bind_0_$48 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$49 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str37$putfile, att_list, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$49 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                                        try {
                                            final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$50 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str38$data, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                                                    streams_high.write_string(data, xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED);
                                                }
                                                finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                                                }
                                            }
                                            finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$50, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str38$data);
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$49, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$49, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$48, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str37$putfile);
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                                }
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$46, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str26$request);
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                final SubLObject _values4 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)simple_queue_service.UNPROVIDED);
                Values.restoreValuesFromVector(_values4);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return command;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 15102L)
    public static SubLObject get_s3_getfile_command(final SubLObject bucket, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_s3_file_attribute_list(bucket, key);
        SubLObject command = (SubLObject)simple_queue_service.NIL;
        SubLObject s = (SubLObject)simple_queue_service.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$57 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str26$request, simple_queue_service.$default_sqs_request_attribute_list$.getGlobalValue(), (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$58 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$59 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)simple_queue_service.$str39$getfile, att_list, (SubLObject)simple_queue_service.T, (SubLObject)simple_queue_service.NIL, (SubLObject)simple_queue_service.$kw27$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)simple_queue_service.$kw27$UNINITIALIZED, thread);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$59, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$59, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$58, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$57, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)simple_queue_service.$str26$request);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_queue_service.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)simple_queue_service.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 15340L)
    public static SubLObject get_sqs_queue_access_attribute_list(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == simple_queue_service.UNPROVIDED) {
            retries = simple_queue_service.$default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == simple_queue_service.UNPROVIDED) {
            wait_secs = simple_queue_service.$default_sqs_wait_secs$.getGlobalValue();
        }
        return ConsesLow.append(get_sqs_queue_attribute_list(queue_name), get_sqs_time_out_info_attribute_list(retries, wait_secs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 15731L)
    public static SubLObject get_sqs_queue_attribute_list(final SubLObject queue_name) {
        return (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$str40$name, queue_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 15827L)
    public static SubLObject get_sqs_time_out_info_attribute_list(SubLObject retries, SubLObject wait_secs) {
        if (retries == simple_queue_service.UNPROVIDED) {
            retries = simple_queue_service.$default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == simple_queue_service.UNPROVIDED) {
            wait_secs = simple_queue_service.$default_sqs_wait_secs$.getGlobalValue();
        }
        return (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$str41$maxTries, retries, (SubLObject)simple_queue_service.$str42$maxWaitSecs, wait_secs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 16136L)
    public static SubLObject get_s3_file_attribute_list(final SubLObject bucket, final SubLObject key) {
        return (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$str43$bucket, bucket, (SubLObject)simple_queue_service.$str44$key, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 21356L)
    public static SubLObject new_sqs_iterator(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == simple_queue_service.UNPROVIDED) {
            retries = simple_queue_service.$default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == simple_queue_service.UNPROVIDED) {
            wait_secs = simple_queue_service.$default_sqs_wait_secs$.getGlobalValue();
        }
        return iteration.new_iterator(make_sqs_iterator_state(queue_name, retries, wait_secs), (SubLObject)simple_queue_service.$sym45$SQS_ITERATOR_DONE_, (SubLObject)simple_queue_service.$sym46$SQS_ITERATOR_NEXT, (SubLObject)simple_queue_service.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 21847L)
    public static SubLObject make_sqs_iterator_state(final SubLObject queue_name, final SubLObject retries, final SubLObject wait_secs) {
        final SubLObject doneP = (SubLObject)simple_queue_service.NIL;
        return (SubLObject)ConsesLow.list(queue_name, retries, wait_secs, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 21992L)
    public static SubLObject sqs_iterator_doneP(final SubLObject state) {
        final SubLObject doneP = ConsesLow.nth((SubLObject)simple_queue_service.THREE_INTEGER, state);
        return doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 22094L)
    public static SubLObject sqs_iterator_next(final SubLObject state) {
        SubLObject queue_name = (SubLObject)simple_queue_service.NIL;
        SubLObject retries = (SubLObject)simple_queue_service.NIL;
        SubLObject wait_secs = (SubLObject)simple_queue_service.NIL;
        SubLObject doneP = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)simple_queue_service.$list47);
        queue_name = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list47);
        retries = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list47);
        wait_secs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list47);
        doneP = current.first();
        current = current.rest();
        if (simple_queue_service.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)simple_queue_service.$list47);
            return (SubLObject)simple_queue_service.NIL;
        }
        final SubLObject full_message = sqs_get_message(queue_name, retries, wait_secs);
        if (simple_queue_service.NIL == full_message || simple_queue_service.NIL != sqs_empty_message_p(full_message)) {
            doneP = (SubLObject)simple_queue_service.T;
            ConsesLow.set_nth((SubLObject)simple_queue_service.THREE_INTEGER, state, doneP);
            return Values.values((SubLObject)simple_queue_service.NIL, state, (SubLObject)simple_queue_service.T);
        }
        return Values.values(sqs_message_body_from_message(full_message, (SubLObject)simple_queue_service.UNPROVIDED), state, (SubLObject)simple_queue_service.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 22571L)
    public static SubLObject new_sqs_accumulator(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == simple_queue_service.UNPROVIDED) {
            retries = simple_queue_service.$default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == simple_queue_service.UNPROVIDED) {
            wait_secs = simple_queue_service.$default_sqs_wait_secs$.getGlobalValue();
        }
        return accumulation.new_accumulator(make_sqs_accumulator_state(queue_name, retries, wait_secs), (SubLObject)simple_queue_service.$sym48$SQS_ACCUMULATOR_RESET, (SubLObject)simple_queue_service.$sym49$SQS_ACCUMULATOR_ADD, (SubLObject)simple_queue_service.$sym50$SQS_ACCUMULATOR_SIZE, (SubLObject)simple_queue_service.$sym51$SQS_ACCUMULATOR_CONTENTS, (SubLObject)simple_queue_service.$sym52$SQS_ACCUMULATOR_IT, (SubLObject)simple_queue_service.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 23175L)
    public static SubLObject make_sqs_accumulator_state(final SubLObject queue_name, final SubLObject retries, final SubLObject wait_secs) {
        return (SubLObject)ConsesLow.list(queue_name, retries, wait_secs, (SubLObject)simple_queue_service.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 23297L)
    public static SubLObject sqs_accumulator_reset(final SubLObject state) {
        SubLObject queue_name = (SubLObject)simple_queue_service.NIL;
        SubLObject retries = (SubLObject)simple_queue_service.NIL;
        SubLObject wait_secs = (SubLObject)simple_queue_service.NIL;
        SubLObject posts = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)simple_queue_service.$list53);
        queue_name = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list53);
        retries = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list53);
        wait_secs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list53);
        posts = current.first();
        current = current.rest();
        if (simple_queue_service.NIL == current) {
            return make_sqs_accumulator_state(queue_name, retries, wait_secs);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)simple_queue_service.$list53);
        return (SubLObject)simple_queue_service.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 23514L)
    public static SubLObject sqs_accumulator_add(final SubLObject state, final SubLObject message) {
        enforceType(message, simple_queue_service.$sym12$STRINGP);
        SubLObject queue_name = (SubLObject)simple_queue_service.NIL;
        SubLObject retries = (SubLObject)simple_queue_service.NIL;
        SubLObject wait_secs = (SubLObject)simple_queue_service.NIL;
        SubLObject posts = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)simple_queue_service.$list53);
        queue_name = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list53);
        retries = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list53);
        wait_secs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list53);
        posts = current.first();
        current = current.rest();
        if (simple_queue_service.NIL == current) {
            final SubLObject result = sqs_post_message(queue_name, message);
            if (simple_queue_service.NIL != list_utilities.sublisp_boolean(result)) {
                posts = Numbers.add(posts, (SubLObject)simple_queue_service.ONE_INTEGER);
                ConsesLow.set_nth((SubLObject)simple_queue_service.THREE_INTEGER, state, posts);
            }
            else {
                Errors.error((SubLObject)simple_queue_service.$str54$Could_not_post__A_to__A_, message, queue_name);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)simple_queue_service.$list53);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 23953L)
    public static SubLObject sqs_accumulator_get_posts(final SubLObject state) {
        return ConsesLow.nth((SubLObject)simple_queue_service.THREE_INTEGER, state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 24027L)
    public static SubLObject sqs_accumulator_size(final SubLObject state) {
        return (SubLObject)(sqs_accumulator_get_posts(state).isZero() ? simple_queue_service.ZERO_INTEGER : simple_queue_service.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 24142L)
    public static SubLObject sqs_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == simple_queue_service.UNPROVIDED) {
            resetP = (SubLObject)simple_queue_service.NIL;
        }
        SubLObject queue_name = (SubLObject)simple_queue_service.NIL;
        SubLObject retries = (SubLObject)simple_queue_service.NIL;
        SubLObject wait_secs = (SubLObject)simple_queue_service.NIL;
        SubLObject posts = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)simple_queue_service.$list53);
        queue_name = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list53);
        retries = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list53);
        wait_secs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list53);
        posts = current.first();
        current = current.rest();
        if (simple_queue_service.NIL == current) {
            return Values.values(posts, (simple_queue_service.NIL != resetP) ? make_sqs_accumulator_state(queue_name, retries, wait_secs) : state);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)simple_queue_service.$list53);
        return (SubLObject)simple_queue_service.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 24451L)
    public static SubLObject sqs_accumulator_it(final SubLObject state) {
        final SubLObject posts = sqs_accumulator_get_posts(state);
        return posts.isZero() ? iteration.new_null_iterator() : iteration.new_list_iterator((SubLObject)ConsesLow.list(posts));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 24640L)
    public static SubLObject accumulate_assertion_description(final SubLObject acc, final SubLObject sentence, final SubLObject elmt, SubLObject v_properties) {
        if (v_properties == simple_queue_service.UNPROVIDED) {
            v_properties = (SubLObject)simple_queue_service.NIL;
        }
        assert simple_queue_service.NIL != accumulation.accumulator_p(acc) : acc;
        accumulation.accumulation_add(acc, encapsulate_assertion_description(sentence, elmt, v_properties));
        return acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 25029L)
    public static SubLObject encapsulate_assertion_description(final SubLObject sentence, final SubLObject elmt, final SubLObject v_properties) {
        return (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$kw56$SENTENCE, sentence, (SubLObject)simple_queue_service.$kw57$ELMT, elmt, (SubLObject)simple_queue_service.$kw58$PROPERTIES, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 25202L)
    public static SubLObject unencapsulate_assertion_description(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list59);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence = (SubLObject)simple_queue_service.NIL;
        SubLObject elmt = (SubLObject)simple_queue_service.NIL;
        SubLObject v_properties = (SubLObject)simple_queue_service.NIL;
        SubLObject ass_desc = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list59);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list59);
        elmt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list59);
        v_properties = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list59);
        ass_desc = current.first();
        current = current.rest();
        final SubLObject default_properties = (SubLObject)(current.isCons() ? current.first() : simple_queue_service.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)simple_queue_service.$list59);
        current = current.rest();
        if (simple_queue_service.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)simple_queue_service.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sentence, (SubLObject)ConsesLow.listS((SubLObject)simple_queue_service.$sym60$GETF, ass_desc, (SubLObject)simple_queue_service.$list61)), (SubLObject)ConsesLow.list(elmt, (SubLObject)ConsesLow.listS((SubLObject)simple_queue_service.$sym60$GETF, ass_desc, (SubLObject)simple_queue_service.$list62)), (SubLObject)ConsesLow.list(v_properties, (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$sym60$GETF, ass_desc, (SubLObject)simple_queue_service.$kw58$PROPERTIES, default_properties))), ConsesLow.append(body, (SubLObject)simple_queue_service.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)simple_queue_service.$list59);
        return (SubLObject)simple_queue_service.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 25601L)
    public static SubLObject handle_assertion_descriptions(final SubLObject iterator, SubLObject default_props) {
        if (default_props == simple_queue_service.UNPROVIDED) {
            default_props = (SubLObject)simple_queue_service.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)simple_queue_service.NIL; simple_queue_service.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(simple_queue_service.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject ass_desc = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (simple_queue_service.NIL != valid) {
                handle_assertion_description(ass_desc, default_props);
            }
        }
        return (SubLObject)simple_queue_service.$kw63$EXHAUSTED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 25804L)
    public static SubLObject handle_assertion_description(final SubLObject ass_desc, SubLObject default_props) {
        if (default_props == simple_queue_service.UNPROVIDED) {
            default_props = (SubLObject)simple_queue_service.NIL;
        }
        final SubLObject sentence = conses_high.getf(ass_desc, (SubLObject)simple_queue_service.$kw56$SENTENCE, (SubLObject)simple_queue_service.UNPROVIDED);
        final SubLObject elmt = conses_high.getf(ass_desc, (SubLObject)simple_queue_service.$kw57$ELMT, (SubLObject)simple_queue_service.UNPROVIDED);
        final SubLObject v_properties = conses_high.getf(ass_desc, (SubLObject)simple_queue_service.$kw58$PROPERTIES, default_props);
        return cyc_kernel.cyc_assert(sentence, elmt, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 26024L)
    public static SubLObject new_externalizing_accumulator(final SubLObject accumulator) {
        return accumulation.new_transform_accumulator(accumulator, (SubLObject)simple_queue_service.$sym64$COMPACT_HL_EXTERNAL_ID_STRING, (SubLObject)simple_queue_service.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 26264L)
    public static SubLObject new_internalizing_iterator(final SubLObject iterator) {
        return iteration.new_transform_iterator(iterator, (SubLObject)simple_queue_service.$sym65$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING, (SubLObject)simple_queue_service.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 26980L)
    public static SubLObject new_segment_accumulator(final SubLObject accumulator, SubLObject max_bytes, SubLObject cfasl_externalizedP) {
        if (max_bytes == simple_queue_service.UNPROVIDED) {
            max_bytes = simple_queue_service.$recommended_max_bytes_per_sqs_message$.getGlobalValue();
        }
        if (cfasl_externalizedP == simple_queue_service.UNPROVIDED) {
            cfasl_externalizedP = (SubLObject)simple_queue_service.NIL;
        }
        return accumulation.new_accumulator(make_segment_accumulator_state(accumulator, max_bytes, cfasl_externalizedP), (SubLObject)simple_queue_service.$sym68$SGMT_ACCUMULATOR_RESET, (SubLObject)simple_queue_service.$sym69$SGMT_ACCUMULATOR_ADD, (SubLObject)simple_queue_service.$sym70$SGMT_ACCUMULATOR_SIZE, (SubLObject)simple_queue_service.$sym71$SGMT_ACCUMULATOR_CONTENTS, (SubLObject)simple_queue_service.$sym72$SGMT_ACCUMULATOR_IT, (SubLObject)simple_queue_service.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 28040L)
    public static SubLObject make_segment_accumulator_state(final SubLObject acc, final SubLObject max_bytes, final SubLObject cfasl_externalizedP) {
        final SubLObject stream = cfasl.new_cfasl_encoding_stream();
        final SubLObject total = (SubLObject)simple_queue_service.ZERO_INTEGER;
        return (SubLObject)ConsesLow.list(acc, stream, total, max_bytes, cfasl_externalizedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 28309L)
    public static SubLObject sgmt_accumulator_size(final SubLObject state) {
        return ConsesLow.nth((SubLObject)simple_queue_service.TWO_INTEGER, state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 28379L)
    public static SubLObject sgmt_accumulator_reset(final SubLObject state) {
        SubLObject acc = (SubLObject)simple_queue_service.NIL;
        SubLObject stream = (SubLObject)simple_queue_service.NIL;
        SubLObject total = (SubLObject)simple_queue_service.NIL;
        SubLObject max_bytes = (SubLObject)simple_queue_service.NIL;
        SubLObject cfasl_externalizedP = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)simple_queue_service.$list73);
        acc = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list73);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list73);
        total = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list73);
        max_bytes = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list73);
        cfasl_externalizedP = current.first();
        current = current.rest();
        if (simple_queue_service.NIL == current) {
            accumulation.accumulation_reset(acc);
            return make_segment_accumulator_state(acc, max_bytes, cfasl_externalizedP);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)simple_queue_service.$list73);
        return (SubLObject)simple_queue_service.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 28645L)
    public static SubLObject sgmt_accumulator_add(final SubLObject state, final SubLObject v_object) {
        return sgmt_accumulator_add_internal(state, v_object, (SubLObject)simple_queue_service.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 28752L)
    public static SubLObject sgmt_accumulator_add_internal(final SubLObject state, final SubLObject v_object, SubLObject error_on_overflowP) {
        if (error_on_overflowP == simple_queue_service.UNPROVIDED) {
            error_on_overflowP = (SubLObject)simple_queue_service.NIL;
        }
        SubLObject acc = (SubLObject)simple_queue_service.NIL;
        SubLObject stream = (SubLObject)simple_queue_service.NIL;
        SubLObject total = (SubLObject)simple_queue_service.NIL;
        SubLObject max_bytes = (SubLObject)simple_queue_service.NIL;
        SubLObject cfasl_externalizedP = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)simple_queue_service.$list73);
        acc = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list73);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list73);
        total = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list73);
        max_bytes = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list73);
        cfasl_externalizedP = current.first();
        current = current.rest();
        if (simple_queue_service.NIL == current) {
            final SubLObject old_char_pos = cfasl.cfasl_encoding_stream_hexchar_position(stream);
            final SubLObject old_position = cfasl.cfasl_encoding_stream_byte_position(stream);
            SubLObject new_position = (SubLObject)simple_queue_service.NIL;
            if (simple_queue_service.NIL != cfasl_externalizedP) {
                cfasl.cfasl_output_externalized(v_object, stream);
            }
            else {
                cfasl.cfasl_output(v_object, stream);
            }
            new_position = cfasl.cfasl_encoding_stream_byte_position(stream);
            if (new_position.numL(max_bytes)) {
                ConsesLow.set_nth((SubLObject)simple_queue_service.TWO_INTEGER, state, Numbers.add((SubLObject)simple_queue_service.ONE_INTEGER, total));
            }
            else {
                if (!new_position.numE(max_bytes)) {
                    if (simple_queue_service.NIL != error_on_overflowP) {
                        final SubLObject delta = Numbers.subtract(new_position, old_position);
                        if (max_bytes.numL(delta)) {
                            Errors.error((SubLObject)simple_queue_service.$str74$Object__A_encodes_as__A_bytes__mo, v_object, delta, max_bytes);
                        }
                        else {
                            Errors.error((SubLObject)simple_queue_service.$str75$Implementation_error__serializing, v_object, delta, max_bytes);
                        }
                    }
                    sgmt_accumulator_flush_encoding_stream_up_to(acc, stream, old_char_pos);
                    ConsesLow.set_nth((SubLObject)simple_queue_service.ONE_INTEGER, state, cfasl.new_cfasl_encoding_stream());
                    error_on_overflowP = (SubLObject)simple_queue_service.T;
                    return sgmt_accumulator_add_internal(state, v_object, error_on_overflowP);
                }
                sgmt_accumulator_flush_encoding_stream(acc, stream);
                ConsesLow.set_nth((SubLObject)simple_queue_service.ONE_INTEGER, state, cfasl.new_cfasl_encoding_stream());
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)simple_queue_service.$list73);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 30604L)
    public static SubLObject sgmt_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == simple_queue_service.UNPROVIDED) {
            resetP = (SubLObject)simple_queue_service.NIL;
        }
        sgmt_accumulator_possibly_flush_encoding_stream(state);
        final SubLObject acc = state.first();
        final SubLObject contents = accumulation.accumulation_contents(acc, resetP);
        return Values.values(contents, (simple_queue_service.NIL != resetP) ? sgmt_accumulator_reset(state) : state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 30912L)
    public static SubLObject sgmt_accumulator_it(final SubLObject state) {
        final SubLObject acc = state.first();
        return accumulation.accumulation_iterator(acc);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 31027L)
    public static SubLObject sgmt_accumulator_possibly_flush_encoding_stream(final SubLObject state) {
        final SubLObject acc = state.first();
        final SubLObject stream = conses_high.second(state);
        if (!cfasl.cfasl_encoding_stream_byte_position(stream).isZero()) {
            sgmt_accumulator_flush_encoding_stream(acc, stream);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 31304L)
    public static SubLObject sgmt_accumulator_flush_encoding_stream(final SubLObject acc, final SubLObject stream) {
        final SubLObject limit = cfasl.cfasl_encoding_stream_hexchar_position(stream);
        return sgmt_accumulator_flush_encoding_stream_up_to(acc, stream, limit);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 31519L)
    public static SubLObject sgmt_accumulator_flush_encoding_stream_up_to(final SubLObject acc, final SubLObject stream, final SubLObject limit) {
        SubLObject segment = cfasl.cfasl_encoding_string_stream_encoding(stream);
        cfasl.close_cfasl_encoding_stream(stream);
        if (limit.numL(Sequences.length(segment))) {
            segment = string_utilities.substring(segment, (SubLObject)simple_queue_service.ZERO_INTEGER, limit);
        }
        accumulation.accumulation_add(acc, segment);
        return acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 31846L)
    public static SubLObject new_sqs_segment_iterator(final SubLObject sqs_iterator) {
        enforceType(sqs_iterator, simple_queue_service.$sym76$ITERATOR_P);
        return iteration.new_iterator(make_sqs_segment_iterator_state(sqs_iterator), (SubLObject)simple_queue_service.$sym77$SQS_SGMNT_IT_DONE, (SubLObject)simple_queue_service.$sym78$SQS_SGMNT_IT_NEXT, (SubLObject)simple_queue_service.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 32327L)
    public static SubLObject make_sqs_segment_iterator_state(final SubLObject sqs_it) {
        return (SubLObject)ConsesLow.list(sqs_it, iteration.new_null_iterator());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 32566L)
    public static SubLObject sqs_sgmnt_it_done(final SubLObject state) {
        SubLObject sqs_it = (SubLObject)simple_queue_service.NIL;
        SubLObject sgmt_it = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)simple_queue_service.$list79);
        sqs_it = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list79);
        sgmt_it = current.first();
        current = current.rest();
        if (simple_queue_service.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(simple_queue_service.NIL != iteration.iteration_done(sgmt_it) && simple_queue_service.NIL != iteration.iteration_done(sqs_it));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)simple_queue_service.$list79);
        return (SubLObject)simple_queue_service.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 32832L)
    public static SubLObject sqs_sgmnt_it_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sqs_it = (SubLObject)simple_queue_service.NIL;
        SubLObject sgmt_it = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)simple_queue_service.$list79);
        sqs_it = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)simple_queue_service.$list79);
        sgmt_it = current.first();
        current = current.rest();
        if (simple_queue_service.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)simple_queue_service.$list79);
            return (SubLObject)simple_queue_service.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject value = iteration.iteration_next(sgmt_it);
        SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (simple_queue_service.NIL != validP) {
            return Values.values(value, state, (SubLObject)simple_queue_service.NIL);
        }
        thread.resetMultipleValues();
        final SubLObject segment = iteration.iteration_next(sqs_it);
        validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (simple_queue_service.NIL == validP) {
            return Values.values((SubLObject)simple_queue_service.NIL, state, (SubLObject)simple_queue_service.T);
        }
        final SubLObject new_sgmt_it = new_iterator_from_segment_contents(segment);
        ConsesLow.set_nth((SubLObject)simple_queue_service.ONE_INTEGER, state, new_sgmt_it);
        thread.resetMultipleValues();
        final SubLObject value2 = iteration.iteration_next(new_sgmt_it);
        final SubLObject validP_$62 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(value2, state, (SubLObject)SubLObjectFactory.makeBoolean(simple_queue_service.NIL == validP_$62));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 33754L)
    public static SubLObject new_iterator_from_segment_contents(final SubLObject segment) {
        return iteration.new_list_iterator(Sequences.nreverse(cfasl_utilities.cfasl_load_all_from_string(segment)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 33896L)
    public static SubLObject monitor_all_sqs_queues(SubLObject wait_time) {
        if (wait_time == simple_queue_service.UNPROVIDED) {
            wait_time = (SubLObject)simple_queue_service.$int80$30;
        }
        SubLObject all_emptyP = (SubLObject)simple_queue_service.NIL;
        SubLObject doneP = (SubLObject)simple_queue_service.NIL;
        while (simple_queue_service.NIL == doneP) {
            all_emptyP = (SubLObject)simple_queue_service.T;
            SubLObject cdolist_list_var = sqs_list_queues();
            SubLObject queue = (SubLObject)simple_queue_service.NIL;
            queue = cdolist_list_var.first();
            while (simple_queue_service.NIL != cdolist_list_var) {
                final SubLObject estimate = sqs_pending_message_estimate(queue);
                if (!estimate.isZero()) {
                    PrintLow.format((SubLObject)simple_queue_service.T, (SubLObject)simple_queue_service.$str81$___A__A___A_msgs__, new SubLObject[] { numeric_date_utilities.timestring((SubLObject)simple_queue_service.UNPROVIDED), queue, estimate });
                    all_emptyP = (SubLObject)simple_queue_service.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                queue = cdolist_list_var.first();
            }
            if (simple_queue_service.NIL != all_emptyP) {
                doneP = (SubLObject)simple_queue_service.T;
            }
            else {
                Threads.sleep(wait_time);
            }
        }
        return (SubLObject)simple_queue_service.$kw82$ALL_EMPTY;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 34572L)
    public static SubLObject drain_some_sqs_queues(SubLObject v_queues) {
        if (v_queues == simple_queue_service.UNPROVIDED) {
            v_queues = sqs_list_queues();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject checked_queues = (SubLObject)simple_queue_service.NIL;
        SubLObject cdolist_list_var = v_queues;
        SubLObject queue = (SubLObject)simple_queue_service.NIL;
        queue = cdolist_list_var.first();
        while (simple_queue_service.NIL != cdolist_list_var) {
            if (simple_queue_service.NIL != is_known_sqs_queueP(queue)) {
                checked_queues = (SubLObject)ConsesLow.cons(queue, checked_queues);
                SubLObject counter = (SubLObject)simple_queue_service.ZERO_INTEGER;
                final SubLObject sqs_it = new_sqs_iterator(queue, (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED);
                format_nil.force_format((SubLObject)simple_queue_service.T, (SubLObject)simple_queue_service.$str83$___A__Cleaning_up_ca__A_msgs_from, numeric_date_utilities.timestring((SubLObject)simple_queue_service.UNPROVIDED), sqs_pending_message_estimate(queue), queue, (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED);
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)simple_queue_service.NIL; simple_queue_service.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(simple_queue_service.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject msg = iteration.iteration_next(sqs_it);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (simple_queue_service.NIL != valid) {
                        counter = Numbers.add(counter, (SubLObject)simple_queue_service.ONE_INTEGER);
                    }
                }
                format_nil.force_format((SubLObject)simple_queue_service.T, (SubLObject)simple_queue_service.$str84$___A__Removed__A_msgs_from__A___, numeric_date_utilities.timestring((SubLObject)simple_queue_service.UNPROVIDED), counter, queue, (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED, (SubLObject)simple_queue_service.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            queue = cdolist_list_var.first();
        }
        return Sequences.nreverse(checked_queues);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 35383L)
    public static SubLObject configure_sqs_queue_name(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject place = (SubLObject)simple_queue_service.NIL;
        SubLObject value = (SubLObject)simple_queue_service.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list85);
        place = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simple_queue_service.$list85);
        value = current.first();
        current = current.rest();
        if (simple_queue_service.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$sym86$PROGN, (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$sym87$MUST, (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$sym88$IS_KNOWN_SQS_QUEUE_, value), (SubLObject)simple_queue_service.$str89$_A_is_not_a_known_SQS_queue______, value), (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$sym90$CSETQ, place, value));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)simple_queue_service.$list85);
        return (SubLObject)simple_queue_service.NIL;
    }
    
    public static SubLObject declare_simple_queue_service_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "success_sqs_response_p", "SUCCESS-SQS-RESPONSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_response_p", "SQS-RESPONSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_response_status", "SQS-RESPONSE-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_response_reply", "SQS-RESPONSE-REPLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_empty_message_p", "SQS-EMPTY-MESSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "process_sqs_error_response", "PROCESS-SQS-ERROR-RESPONSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_sqs_version", "GET-SQS-VERSION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "is_sqs_availableP", "IS-SQS-AVAILABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_list_queues", "SQS-LIST-QUEUES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "is_known_sqs_queueP", "IS-KNOWN-SQS-QUEUE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_create_queue", "SQS-CREATE-QUEUE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_delete_queue", "SQS-DELETE-QUEUE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_post_message", "SQS-POST-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_post_message_pieces", "SQS-POST-MESSAGE-PIECES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_get_message", "SQS-GET-MESSAGE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_message_body_from_message", "SQS-MESSAGE-BODY-FROM-MESSAGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_get_message_content", "SQS-GET-MESSAGE-CONTENT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_pending_message_estimate", "SQS-PENDING-MESSAGE-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "s3_put_file", "S3-PUT-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "s3_get_file_contents", "S3-GET-FILE-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "s3_get_file", "S3-GET-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "communicate_with_local_sqs_relayer", "COMMUNICATE-WITH-LOCAL-SQS-RELAYER", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.simple_queue_service", "with_sqs_message_to_string", "WITH-SQS-MESSAGE-TO-STRING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_sqs_version_command", "GET-SQS-VERSION-COMMAND", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_sqs_create_queue_command", "GET-SQS-CREATE-QUEUE-COMMAND", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_sqs_delete_queue_command", "GET-SQS-DELETE-QUEUE-COMMAND", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_sqs_enqueue_command", "GET-SQS-ENQUEUE-COMMAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "clear_get_empty_sqs_enqueue_command_fragments", "CLEAR-GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "remove_get_empty_sqs_enqueue_command_fragments", "REMOVE-GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_empty_sqs_enqueue_command_fragments_internal", "GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_empty_sqs_enqueue_command_fragments", "GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_sqs_dequeue_command", "GET-SQS-DEQUEUE-COMMAND", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_sqs_pending_message_estimate_command", "GET-SQS-PENDING-MESSAGE-ESTIMATE-COMMAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_sqs_list_queues_command", "GET-SQS-LIST-QUEUES-COMMAND", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_s3_putfile_command", "GET-S3-PUTFILE-COMMAND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_s3_getfile_command", "GET-S3-GETFILE-COMMAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_sqs_queue_access_attribute_list", "GET-SQS-QUEUE-ACCESS-ATTRIBUTE-LIST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_sqs_queue_attribute_list", "GET-SQS-QUEUE-ATTRIBUTE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_sqs_time_out_info_attribute_list", "GET-SQS-TIME-OUT-INFO-ATTRIBUTE-LIST", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "get_s3_file_attribute_list", "GET-S3-FILE-ATTRIBUTE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "new_sqs_iterator", "NEW-SQS-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "make_sqs_iterator_state", "MAKE-SQS-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_iterator_doneP", "SQS-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_iterator_next", "SQS-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "new_sqs_accumulator", "NEW-SQS-ACCUMULATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "make_sqs_accumulator_state", "MAKE-SQS-ACCUMULATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_accumulator_reset", "SQS-ACCUMULATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_accumulator_add", "SQS-ACCUMULATOR-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_accumulator_get_posts", "SQS-ACCUMULATOR-GET-POSTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_accumulator_size", "SQS-ACCUMULATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_accumulator_contents", "SQS-ACCUMULATOR-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_accumulator_it", "SQS-ACCUMULATOR-IT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "accumulate_assertion_description", "ACCUMULATE-ASSERTION-DESCRIPTION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "encapsulate_assertion_description", "ENCAPSULATE-ASSERTION-DESCRIPTION", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.simple_queue_service", "unencapsulate_assertion_description", "UNENCAPSULATE-ASSERTION-DESCRIPTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "handle_assertion_descriptions", "HANDLE-ASSERTION-DESCRIPTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "handle_assertion_description", "HANDLE-ASSERTION-DESCRIPTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "new_externalizing_accumulator", "NEW-EXTERNALIZING-ACCUMULATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "new_internalizing_iterator", "NEW-INTERNALIZING-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "new_segment_accumulator", "NEW-SEGMENT-ACCUMULATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "make_segment_accumulator_state", "MAKE-SEGMENT-ACCUMULATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sgmt_accumulator_size", "SGMT-ACCUMULATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sgmt_accumulator_reset", "SGMT-ACCUMULATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sgmt_accumulator_add", "SGMT-ACCUMULATOR-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sgmt_accumulator_add_internal", "SGMT-ACCUMULATOR-ADD-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sgmt_accumulator_contents", "SGMT-ACCUMULATOR-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sgmt_accumulator_it", "SGMT-ACCUMULATOR-IT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sgmt_accumulator_possibly_flush_encoding_stream", "SGMT-ACCUMULATOR-POSSIBLY-FLUSH-ENCODING-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sgmt_accumulator_flush_encoding_stream", "SGMT-ACCUMULATOR-FLUSH-ENCODING-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sgmt_accumulator_flush_encoding_stream_up_to", "SGMT-ACCUMULATOR-FLUSH-ENCODING-STREAM-UP-TO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "new_sqs_segment_iterator", "NEW-SQS-SEGMENT-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "make_sqs_segment_iterator_state", "MAKE-SQS-SEGMENT-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_sgmnt_it_done", "SQS-SGMNT-IT-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "sqs_sgmnt_it_next", "SQS-SGMNT-IT-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "new_iterator_from_segment_contents", "NEW-ITERATOR-FROM-SEGMENT-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "monitor_all_sqs_queues", "MONITOR-ALL-SQS-QUEUES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_queue_service", "drain_some_sqs_queues", "DRAIN-SOME-SQS-QUEUES", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.simple_queue_service", "configure_sqs_queue_name", "CONFIGURE-SQS-QUEUE-NAME");
        return (SubLObject)simple_queue_service.NIL;
    }
    
    public static SubLObject init_simple_queue_service_file() {
        simple_queue_service.$local_sqs_relay_host$ = SubLFiles.defparameter("*LOCAL-SQS-RELAY-HOST*", (SubLObject)simple_queue_service.$str0$localhost);
        simple_queue_service.$local_sqs_relay_port$ = SubLFiles.defparameter("*LOCAL-SQS-RELAY-PORT*", (SubLObject)simple_queue_service.$int1$19219);
        simple_queue_service.$default_sqs_retries$ = SubLFiles.defconstant("*DEFAULT-SQS-RETRIES*", (SubLObject)simple_queue_service.TEN_INTEGER);
        simple_queue_service.$default_sqs_wait_secs$ = SubLFiles.defconstant("*DEFAULT-SQS-WAIT-SECS*", (SubLObject)simple_queue_service.TEN_INTEGER);
        simple_queue_service.$sqs_error_reporting_policy$ = SubLFiles.defparameter("*SQS-ERROR-REPORTING-POLICY*", (SubLObject)simple_queue_service.$kw4$WARN_ON_ERROR);
        simple_queue_service.$default_sqs_request_attribute_list$ = SubLFiles.deflexical("*DEFAULT-SQS-REQUEST-ATTRIBUTE-LIST*", (SubLObject)ConsesLow.list((SubLObject)simple_queue_service.$str18$format, (SubLObject)simple_queue_service.$str19$subl));
        simple_queue_service.$get_empty_sqs_enqueue_command_fragments_caching_state$ = SubLFiles.deflexical("*GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS-CACHING-STATE*", (SubLObject)simple_queue_service.NIL);
        simple_queue_service.$recommended_max_hex_chars_per_sqs_message$ = SubLFiles.deflexical("*RECOMMENDED-MAX-HEX-CHARS-PER-SQS-MESSAGE*", Numbers.subtract((SubLObject)simple_queue_service.$int66$8192, (SubLObject)simple_queue_service.$int67$256));
        simple_queue_service.$recommended_max_bytes_per_sqs_message$ = SubLFiles.deflexical("*RECOMMENDED-MAX-BYTES-PER-SQS-MESSAGE*", Numbers.integerDivide(simple_queue_service.$recommended_max_hex_chars_per_sqs_message$.getGlobalValue(), (SubLObject)simple_queue_service.TWO_INTEGER));
        return (SubLObject)simple_queue_service.NIL;
    }
    
    public static SubLObject setup_simple_queue_service_file() {
        memoization_state.note_globally_cached_function((SubLObject)simple_queue_service.$sym32$GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS);
        utilities_macros.note_funcall_helper_function((SubLObject)simple_queue_service.$sym45$SQS_ITERATOR_DONE_);
        utilities_macros.note_funcall_helper_function((SubLObject)simple_queue_service.$sym46$SQS_ITERATOR_NEXT);
        utilities_macros.note_funcall_helper_function((SubLObject)simple_queue_service.$sym48$SQS_ACCUMULATOR_RESET);
        utilities_macros.note_funcall_helper_function((SubLObject)simple_queue_service.$sym49$SQS_ACCUMULATOR_ADD);
        utilities_macros.note_funcall_helper_function((SubLObject)simple_queue_service.$sym50$SQS_ACCUMULATOR_SIZE);
        utilities_macros.note_funcall_helper_function((SubLObject)simple_queue_service.$sym51$SQS_ACCUMULATOR_CONTENTS);
        utilities_macros.note_funcall_helper_function((SubLObject)simple_queue_service.$sym52$SQS_ACCUMULATOR_IT);
        return (SubLObject)simple_queue_service.NIL;
    }
    
    public void declareFunctions() {
        declare_simple_queue_service_file();
    }
    
    public void initializeVariables() {
        init_simple_queue_service_file();
    }
    
    public void runTopLevelForms() {
        setup_simple_queue_service_file();
    }
    
    static {
        me = (SubLFile)new simple_queue_service();
        simple_queue_service.$local_sqs_relay_host$ = null;
        simple_queue_service.$local_sqs_relay_port$ = null;
        simple_queue_service.$default_sqs_retries$ = null;
        simple_queue_service.$default_sqs_wait_secs$ = null;
        simple_queue_service.$sqs_error_reporting_policy$ = null;
        simple_queue_service.$default_sqs_request_attribute_list$ = null;
        simple_queue_service.$get_empty_sqs_enqueue_command_fragments_caching_state$ = null;
        simple_queue_service.$recommended_max_hex_chars_per_sqs_message$ = null;
        simple_queue_service.$recommended_max_bytes_per_sqs_message$ = null;
        $str0$localhost = SubLObjectFactory.makeString("localhost");
        $int1$19219 = SubLObjectFactory.makeInteger(19219);
        $kw2$OK = SubLObjectFactory.makeKeyword("OK");
        $kw3$NOT_AN_SQS_RESPONSE = SubLObjectFactory.makeKeyword("NOT-AN-SQS-RESPONSE");
        $kw4$WARN_ON_ERROR = SubLObjectFactory.makeKeyword("WARN-ON-ERROR");
        $str5$Received_error__A___A____ = SubLObjectFactory.makeString("Received error ~A (~A).~%");
        $kw6$ERROR_ON_ERROR = SubLObjectFactory.makeKeyword("ERROR-ON-ERROR");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREAMBLE"), (SubLObject)SubLObjectFactory.makeSymbol("POSTAMBLE"));
        $str8$ = SubLObjectFactory.makeString("");
        $kw9$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $sym10$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw11$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $sym12$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str13$Only_support_STRINGP_or_LIST_OF_T = SubLObjectFactory.makeString("Only support STRINGP or LIST-OF-TYPE-P 'STRINGP.");
        $kw14$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str15$Empty_result_____suspicious_ = SubLObjectFactory.makeString("Empty result ... suspicious.");
        $kw16$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str17$Bogus_result_returned_by_server_ = SubLObjectFactory.makeString("Bogus result returned by server.");
        $str18$format = SubLObjectFactory.makeString("format");
        $str19$subl = SubLObjectFactory.makeString("subl");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym21$CWITH_OUTPUT_TO_STRING = SubLObjectFactory.makeSymbol("CWITH-OUTPUT-TO-STRING");
        $sym22$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym23$_XML_STREAM_ = SubLObjectFactory.makeSymbol("*XML-STREAM*");
        $sym24$XML_TAG = SubLObjectFactory.makeSymbol("XML-TAG");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("request"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-SQS-REQUEST-ATTRIBUTE-LIST*"));
        $str26$request = SubLObjectFactory.makeString("request");
        $kw27$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str28$version = SubLObjectFactory.makeString("version");
        $str29$createq = SubLObjectFactory.makeString("createq");
        $str30$deleteq = SubLObjectFactory.makeString("deleteq");
        $str31$enqueue = SubLObjectFactory.makeString("enqueue");
        $sym32$GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS = SubLObjectFactory.makeSymbol("GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS");
        $sym33$_GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS-CACHING-STATE*");
        $str34$dequeue = SubLObjectFactory.makeString("dequeue");
        $str35$pending = SubLObjectFactory.makeString("pending");
        $str36$listqs = SubLObjectFactory.makeString("listqs");
        $str37$putfile = SubLObjectFactory.makeString("putfile");
        $str38$data = SubLObjectFactory.makeString("data");
        $str39$getfile = SubLObjectFactory.makeString("getfile");
        $str40$name = SubLObjectFactory.makeString("name");
        $str41$maxTries = SubLObjectFactory.makeString("maxTries");
        $str42$maxWaitSecs = SubLObjectFactory.makeString("maxWaitSecs");
        $str43$bucket = SubLObjectFactory.makeString("bucket");
        $str44$key = SubLObjectFactory.makeString("key");
        $sym45$SQS_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("SQS-ITERATOR-DONE?");
        $sym46$SQS_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("SQS-ITERATOR-NEXT");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("RETRIES"), (SubLObject)SubLObjectFactory.makeSymbol("WAIT-SECS"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?"));
        $sym48$SQS_ACCUMULATOR_RESET = SubLObjectFactory.makeSymbol("SQS-ACCUMULATOR-RESET");
        $sym49$SQS_ACCUMULATOR_ADD = SubLObjectFactory.makeSymbol("SQS-ACCUMULATOR-ADD");
        $sym50$SQS_ACCUMULATOR_SIZE = SubLObjectFactory.makeSymbol("SQS-ACCUMULATOR-SIZE");
        $sym51$SQS_ACCUMULATOR_CONTENTS = SubLObjectFactory.makeSymbol("SQS-ACCUMULATOR-CONTENTS");
        $sym52$SQS_ACCUMULATOR_IT = SubLObjectFactory.makeSymbol("SQS-ACCUMULATOR-IT");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("RETRIES"), (SubLObject)SubLObjectFactory.makeSymbol("WAIT-SECS"), (SubLObject)SubLObjectFactory.makeSymbol("POSTS"));
        $str54$Could_not_post__A_to__A_ = SubLObjectFactory.makeString("Could not post ~A to ~A.");
        $sym55$ACCUMULATOR_P = SubLObjectFactory.makeSymbol("ACCUMULATOR-P");
        $kw56$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw57$ELMT = SubLObjectFactory.makeKeyword("ELMT");
        $kw58$PROPERTIES = SubLObjectFactory.makeKeyword("PROPERTIES");
        $list59 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("ELMT"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("ASS-DESC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-PROPERTIES"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym60$GETF = SubLObjectFactory.makeSymbol("GETF");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ELMT"));
        $kw63$EXHAUSTED = SubLObjectFactory.makeKeyword("EXHAUSTED");
        $sym64$COMPACT_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING");
        $sym65$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $int66$8192 = SubLObjectFactory.makeInteger(8192);
        $int67$256 = SubLObjectFactory.makeInteger(256);
        $sym68$SGMT_ACCUMULATOR_RESET = SubLObjectFactory.makeSymbol("SGMT-ACCUMULATOR-RESET");
        $sym69$SGMT_ACCUMULATOR_ADD = SubLObjectFactory.makeSymbol("SGMT-ACCUMULATOR-ADD");
        $sym70$SGMT_ACCUMULATOR_SIZE = SubLObjectFactory.makeSymbol("SGMT-ACCUMULATOR-SIZE");
        $sym71$SGMT_ACCUMULATOR_CONTENTS = SubLObjectFactory.makeSymbol("SGMT-ACCUMULATOR-CONTENTS");
        $sym72$SGMT_ACCUMULATOR_IT = SubLObjectFactory.makeSymbol("SGMT-ACCUMULATOR-IT");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACC"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-BYTES"), (SubLObject)SubLObjectFactory.makeSymbol("CFASL-EXTERNALIZED?"));
        $str74$Object__A_encodes_as__A_bytes__mo = SubLObjectFactory.makeString("Object ~A encodes as ~A bytes, more than the maximum number of bytes ~A.~%");
        $str75$Implementation_error__serializing = SubLObjectFactory.makeString("Implementation error: serializing ~A encodes as ~A bytes, less than the maximum number of bytes ~A, and STILL causes buffer overflow.~%");
        $sym76$ITERATOR_P = SubLObjectFactory.makeSymbol("ITERATOR-P");
        $sym77$SQS_SGMNT_IT_DONE = SubLObjectFactory.makeSymbol("SQS-SGMNT-IT-DONE");
        $sym78$SQS_SGMNT_IT_NEXT = SubLObjectFactory.makeSymbol("SQS-SGMNT-IT-NEXT");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQS-IT"), (SubLObject)SubLObjectFactory.makeSymbol("SGMT-IT"));
        $int80$30 = SubLObjectFactory.makeInteger(30);
        $str81$___A__A___A_msgs__ = SubLObjectFactory.makeString("~&~A ~A: ~A msgs~%");
        $kw82$ALL_EMPTY = SubLObjectFactory.makeKeyword("ALL-EMPTY");
        $str83$___A__Cleaning_up_ca__A_msgs_from = SubLObjectFactory.makeString("~&~A: Cleaning up ca ~A msgs from ~A ....~%");
        $str84$___A__Removed__A_msgs_from__A___ = SubLObjectFactory.makeString("~&~A: Removed ~A msgs from ~A.~%");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLACE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym86$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym87$MUST = SubLObjectFactory.makeSymbol("MUST");
        $sym88$IS_KNOWN_SQS_QUEUE_ = SubLObjectFactory.makeSymbol("IS-KNOWN-SQS-QUEUE?");
        $str89$_A_is_not_a_known_SQS_queue______ = SubLObjectFactory.makeString("~A is not a known SQS queue ....~%");
        $sym90$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
    }
}

/*

	Total time: 847 ms
	
*/