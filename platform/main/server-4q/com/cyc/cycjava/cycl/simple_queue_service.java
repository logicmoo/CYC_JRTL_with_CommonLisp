package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_encoding_stream_byte_position;
import static com.cyc.cycjava.cycl.cfasl.cfasl_encoding_stream_hexchar_position;
import static com.cyc.cycjava.cycl.cfasl.cfasl_encoding_string_stream_encoding;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_externalized;
import static com.cyc.cycjava.cycl.cfasl.close_cfasl_encoding_stream;
import static com.cyc.cycjava.cycl.cfasl.new_cfasl_encoding_stream;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class simple_queue_service extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new simple_queue_service();



    // defparameter
    private static final SubLSymbol $local_sqs_relay_host$ = makeSymbol("*LOCAL-SQS-RELAY-HOST*");

    // defparameter
    private static final SubLSymbol $local_sqs_relay_port$ = makeSymbol("*LOCAL-SQS-RELAY-PORT*");

    // defconstant
    public static final SubLSymbol $default_sqs_retries$ = makeSymbol("*DEFAULT-SQS-RETRIES*");

    // defconstant
    public static final SubLSymbol $default_sqs_wait_secs$ = makeSymbol("*DEFAULT-SQS-WAIT-SECS*");

    // defparameter
    public static final SubLSymbol $sqs_error_reporting_policy$ = makeSymbol("*SQS-ERROR-REPORTING-POLICY*");

    // deflexical
    private static final SubLSymbol $default_sqs_request_attribute_list$ = makeSymbol("*DEFAULT-SQS-REQUEST-ATTRIBUTE-LIST*");



    // deflexical
    public static final SubLSymbol $recommended_max_hex_chars_per_sqs_message$ = makeSymbol("*RECOMMENDED-MAX-HEX-CHARS-PER-SQS-MESSAGE*");

    // deflexical
    public static final SubLSymbol $recommended_max_bytes_per_sqs_message$ = makeSymbol("*RECOMMENDED-MAX-BYTES-PER-SQS-MESSAGE*");

    private static final SubLString $$$localhost = makeString("localhost");

    private static final SubLInteger $int$19219 = makeInteger(19219);



    private static final SubLSymbol $NOT_AN_SQS_RESPONSE = makeKeyword("NOT-AN-SQS-RESPONSE");

    private static final SubLSymbol $WARN_ON_ERROR = makeKeyword("WARN-ON-ERROR");

    private static final SubLString $str5$Received_error__A___A____ = makeString("Received error ~A (~A).~%");

    private static final SubLSymbol $ERROR_ON_ERROR = makeKeyword("ERROR-ON-ERROR");

    private static final SubLList $list7 = list(makeSymbol("PREAMBLE"), makeSymbol("POSTAMBLE"));

    private static final SubLString $str8$ = makeString("");









    private static final SubLString $str13$Only_support_STRINGP_or_LIST_OF_T = makeString("Only support STRINGP or LIST-OF-TYPE-P 'STRINGP.");



    private static final SubLString $str15$Empty_result_____suspicious_ = makeString("Empty result ... suspicious.");



    private static final SubLString $str17$Bogus_result_returned_by_server_ = makeString("Bogus result returned by server.");

    private static final SubLString $$$format = makeString("format");

    private static final SubLString $$$subl = makeString("subl");

    private static final SubLList $list20 = list(list(makeSymbol("STREAM"), makeSymbol("STRING")), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLSymbol $xml_stream$ = makeSymbol("*XML-STREAM*");



    private static final SubLList $list25 = list(makeString("request"), makeSymbol("*DEFAULT-SQS-REQUEST-ATTRIBUTE-LIST*"));

    private static final SubLString $$$request = makeString("request");



    private static final SubLString $$$version = makeString("version");

    private static final SubLString $$$createq = makeString("createq");

    private static final SubLString $$$deleteq = makeString("deleteq");

    private static final SubLString $$$enqueue = makeString("enqueue");

    private static final SubLSymbol GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS = makeSymbol("GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS");

    private static final SubLSymbol $get_empty_sqs_enqueue_command_fragments_caching_state$ = makeSymbol("*GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS-CACHING-STATE*");

    private static final SubLString $$$dequeue = makeString("dequeue");

    private static final SubLString $$$pending = makeString("pending");

    private static final SubLString $$$listqs = makeString("listqs");

    private static final SubLString $$$putfile = makeString("putfile");

    private static final SubLString $$$data = makeString("data");

    private static final SubLString $$$getfile = makeString("getfile");

    private static final SubLString $$$name = makeString("name");

    private static final SubLString $$$maxTries = makeString("maxTries");

    private static final SubLString $$$maxWaitSecs = makeString("maxWaitSecs");

    private static final SubLString $$$bucket = makeString("bucket");

    private static final SubLString $$$key = makeString("key");

    private static final SubLSymbol $sym45$SQS_ITERATOR_DONE_ = makeSymbol("SQS-ITERATOR-DONE?");

    private static final SubLSymbol SQS_ITERATOR_NEXT = makeSymbol("SQS-ITERATOR-NEXT");

    private static final SubLList $list47 = list(makeSymbol("QUEUE-NAME"), makeSymbol("RETRIES"), makeSymbol("WAIT-SECS"), makeSymbol("DONE?"));

    private static final SubLSymbol SQS_ACCUMULATOR_RESET = makeSymbol("SQS-ACCUMULATOR-RESET");

    private static final SubLSymbol SQS_ACCUMULATOR_ADD = makeSymbol("SQS-ACCUMULATOR-ADD");

    private static final SubLSymbol SQS_ACCUMULATOR_SIZE = makeSymbol("SQS-ACCUMULATOR-SIZE");

    private static final SubLSymbol SQS_ACCUMULATOR_CONTENTS = makeSymbol("SQS-ACCUMULATOR-CONTENTS");

    private static final SubLSymbol SQS_ACCUMULATOR_IT = makeSymbol("SQS-ACCUMULATOR-IT");

    private static final SubLList $list53 = list(makeSymbol("QUEUE-NAME"), makeSymbol("RETRIES"), makeSymbol("WAIT-SECS"), makeSymbol("POSTS"));

    private static final SubLString $str54$Could_not_post__A_to__A_ = makeString("Could not post ~A to ~A.");

    private static final SubLSymbol ACCUMULATOR_P = makeSymbol("ACCUMULATOR-P");







    private static final SubLList $list59 = list(list(makeSymbol("SENTENCE"), makeSymbol("ELMT"), makeSymbol("PROPERTIES"), makeSymbol("ASS-DESC"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT-PROPERTIES"))), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list61 = list(makeKeyword("SENTENCE"));

    private static final SubLList $list62 = list($ELMT);



    private static final SubLSymbol COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING");

    private static final SubLSymbol FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");

    private static final SubLInteger $int$8192 = makeInteger(8192);



    private static final SubLSymbol SGMT_ACCUMULATOR_RESET = makeSymbol("SGMT-ACCUMULATOR-RESET");

    private static final SubLSymbol SGMT_ACCUMULATOR_ADD = makeSymbol("SGMT-ACCUMULATOR-ADD");

    private static final SubLSymbol SGMT_ACCUMULATOR_SIZE = makeSymbol("SGMT-ACCUMULATOR-SIZE");

    private static final SubLSymbol SGMT_ACCUMULATOR_CONTENTS = makeSymbol("SGMT-ACCUMULATOR-CONTENTS");

    private static final SubLSymbol SGMT_ACCUMULATOR_IT = makeSymbol("SGMT-ACCUMULATOR-IT");

    private static final SubLList $list73 = list(makeSymbol("ACC"), makeSymbol("STREAM"), makeSymbol("TOTAL"), makeSymbol("MAX-BYTES"), makeSymbol("CFASL-EXTERNALIZED?"));

    private static final SubLString $str74$Object__A_encodes_as__A_bytes__mo = makeString("Object ~A encodes as ~A bytes, more than the maximum number of bytes ~A.~%");

    private static final SubLString $str75$Implementation_error__serializing = makeString("Implementation error: serializing ~A encodes as ~A bytes, less than the maximum number of bytes ~A, and STILL causes buffer overflow.~%");

    private static final SubLSymbol ITERATOR_P = makeSymbol("ITERATOR-P");

    private static final SubLSymbol SQS_SGMNT_IT_DONE = makeSymbol("SQS-SGMNT-IT-DONE");

    private static final SubLSymbol SQS_SGMNT_IT_NEXT = makeSymbol("SQS-SGMNT-IT-NEXT");

    private static final SubLList $list79 = list(makeSymbol("SQS-IT"), makeSymbol("SGMT-IT"));

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLString $str81$___A__A___A_msgs__ = makeString("~&~A ~A: ~A msgs~%");

    private static final SubLSymbol $ALL_EMPTY = makeKeyword("ALL-EMPTY");

    private static final SubLString $str83$___A__Cleaning_up_ca__A_msgs_from = makeString("~&~A: Cleaning up ca ~A msgs from ~A ....~%");

    private static final SubLString $str84$___A__Removed__A_msgs_from__A___ = makeString("~&~A: Removed ~A msgs from ~A.~%");

    private static final SubLList $list85 = list(makeSymbol("PLACE"), makeSymbol("VALUE"));





    private static final SubLSymbol $sym88$IS_KNOWN_SQS_QUEUE_ = makeSymbol("IS-KNOWN-SQS-QUEUE?");

    private static final SubLString $str89$_A_is_not_a_known_SQS_queue______ = makeString("~A is not a known SQS queue ....~%");



    public static SubLObject success_sqs_response_p(final SubLObject v_object) {
        return makeBoolean((NIL != sqs_response_p(v_object)) && ($OK == v_object.first()));
    }

    public static SubLObject sqs_response_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && v_object.first().isKeyword()) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject sqs_response_status(final SubLObject v_object) {
        if (NIL != sqs_response_p(v_object)) {
            return v_object.first();
        }
        return $NOT_AN_SQS_RESPONSE;
    }

    public static SubLObject sqs_response_reply(final SubLObject v_object) {
        if (NIL != sqs_response_p(v_object)) {
            return second(v_object);
        }
        return NIL;
    }

    public static SubLObject sqs_empty_message_p(final SubLObject v_object) {
        return makeBoolean((NIL != success_sqs_response_p(v_object)) && (NIL == sqs_response_reply(v_object)));
    }

    public static SubLObject process_sqs_error_response(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sqs_response_p(v_object)) {
            final SubLObject msg1 = second(v_object);
            final SubLObject msg2 = third(v_object);
            final SubLObject pcase_var = $sqs_error_reporting_policy$.getDynamicValue(thread);
            if (pcase_var.eql($WARN_ON_ERROR)) {
                Errors.warn($str5$Received_error__A___A____, msg1, msg2);
            } else
                if (pcase_var.eql($ERROR_ON_ERROR)) {
                    Errors.error($str5$Received_error__A___A____, msg1, msg2);
                }

        }
        return NIL;
    }

    public static SubLObject get_sqs_version() {
        return communicate_with_local_sqs_relayer(get_sqs_version_command());
    }

    public static SubLObject is_sqs_availableP() {
        return success_sqs_response_p(get_sqs_version());
    }

    public static SubLObject sqs_list_queues() {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_list_queues_command());
        if (NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }

    public static SubLObject is_known_sqs_queueP(final SubLObject queue_name) {
        return makeBoolean(queue_name.isString() && sqs_pending_message_estimate(queue_name).isNumber());
    }

    public static SubLObject sqs_create_queue(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == UNPROVIDED) {
            retries = $default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == UNPROVIDED) {
            wait_secs = $default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_create_queue_command(queue_name, retries, wait_secs));
        if (NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }

    public static SubLObject sqs_delete_queue(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == UNPROVIDED) {
            retries = $default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == UNPROVIDED) {
            wait_secs = $default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_delete_queue_command(queue_name, retries, wait_secs));
        if (NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }

    public static SubLObject sqs_post_message(final SubLObject queue_name, final SubLObject message) {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_enqueue_command(queue_name, message));
        if (NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }

    public static SubLObject sqs_post_message_pieces(final SubLObject queue_name, final SubLObject message_pieces) {
        SubLObject current;
        final SubLObject datum = current = get_empty_sqs_enqueue_command_fragments(queue_name);
        SubLObject preamble = NIL;
        SubLObject postamble = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        preamble = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        postamble = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list7);
            return NIL;
        }
        final SubLObject final_message_pieces = list_utilities.flatten(list(preamble, message_pieces, postamble));
        final SubLObject reply = communicate_with_local_sqs_relayer(final_message_pieces);
        if (NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }

    public static SubLObject sqs_get_message(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == UNPROVIDED) {
            retries = $default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == UNPROVIDED) {
            wait_secs = $default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_dequeue_command(queue_name, retries, wait_secs));
        if (NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }

    public static SubLObject sqs_message_body_from_message(final SubLObject message, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $str8$;
        }
        return getf(message, $MESSAGE, v_default);
    }

    public static SubLObject sqs_get_message_content(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == UNPROVIDED) {
            retries = $default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == UNPROVIDED) {
            wait_secs = $default_sqs_wait_secs$.getGlobalValue();
        }
        return sqs_message_body_from_message(sqs_get_message(queue_name, retries, wait_secs), UNPROVIDED);
    }

    public static SubLObject sqs_pending_message_estimate(final SubLObject queue_name) {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_sqs_pending_message_estimate_command(queue_name));
        if (NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }

    public static SubLObject s3_put_file(final SubLObject bucket, final SubLObject key, final SubLObject filename) {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_s3_putfile_command(bucket, key, filename));
        if (NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }

    public static SubLObject s3_get_file_contents(final SubLObject bucket, final SubLObject key) {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_s3_getfile_command(bucket, key));
        if (NIL != success_sqs_response_p(reply)) {
            return sqs_response_reply(reply);
        }
        return process_sqs_error_response(reply);
    }

    public static SubLObject s3_get_file(final SubLObject bucket, final SubLObject key, final SubLObject filename) {
        final SubLObject reply = communicate_with_local_sqs_relayer(get_s3_getfile_command(bucket, key));
        if (NIL != success_sqs_response_p(reply)) {
            final SubLObject data = sqs_response_reply(reply);
            final SubLObject size = file_utilities.hex_string_to_file_contents(data, filename);
            return size;
        }
        process_sqs_error_response(reply);
        return NIL;
    }

    public static SubLObject communicate_with_local_sqs_relayer(final SubLObject command) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject s = NIL;
                    try {
                        s = subl_promotions.open_tcp_stream_with_timeout($local_sqs_relay_host$.getDynamicValue(thread), $local_sqs_relay_port$.getDynamicValue(thread), NIL, $PUBLIC);
                        if (NIL != validate_tcp_connection(s, $local_sqs_relay_host$.getDynamicValue(thread), $local_sqs_relay_port$.getDynamicValue(thread))) {
                            if (command.isString()) {
                                write_string(command, s, UNPROVIDED, UNPROVIDED);
                            } else
                                if (NIL != list_utilities.list_of_type_p(STRINGP, command)) {
                                    SubLObject cdolist_list_var = command;
                                    SubLObject fragment = NIL;
                                    fragment = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        write_string(fragment, s, UNPROVIDED, UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        fragment = cdolist_list_var.first();
                                    } 
                                } else {
                                    Errors.error($str13$Only_support_STRINGP_or_LIST_OF_T);
                                }

                            string_utilities.network_terpri(s);
                            force_output(s);
                            result = read(s, NIL, $EOF, UNPROVIDED);
                            if (result.isCons()) {
                                result = eval(result);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != s) {
                                close(s, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if ((NIL == result) || (result == $EOF)) {
            message = $str15$Empty_result_____suspicious_;
        }
        if (message.isString()) {
            return list($ERROR, $str17$Bogus_result_returned_by_server_, message);
        }
        return result;
    }

    public static SubLObject with_sqs_message_to_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CWITH_OUTPUT_TO_STRING, list(stream, string), list(CLET, list(list($xml_stream$, stream)), listS(XML_TAG, $list25, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list20);
        return NIL;
    }

    public static SubLObject get_sqs_version_command() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject command = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$3 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$version, NIL, T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$4, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$3, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$request);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }

    public static SubLObject get_sqs_create_queue_command(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == UNPROVIDED) {
            retries = $default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == UNPROVIDED) {
            wait_secs = $default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_access_attribute_list(queue_name, retries, wait_secs);
        SubLObject command = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$7 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$9 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$createq, att_list, T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$9, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$7, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$request);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }

    public static SubLObject get_sqs_delete_queue_command(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == UNPROVIDED) {
            retries = $default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == UNPROVIDED) {
            wait_secs = $default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_access_attribute_list(queue_name, retries, wait_secs);
        SubLObject command = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$deleteq, att_list, T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$14, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$request);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }

    public static SubLObject get_sqs_enqueue_command(final SubLObject queue_name, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_attribute_list(queue_name);
        SubLObject command = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            try {
                                final SubLObject _prev_bind_0_$19 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$enqueue, att_list, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        xml_utilities.xml_write(string, UNPROVIDED);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$20, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$19, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal($$$enqueue);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                }
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$17, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$request);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return command;
    }

    public static SubLObject clear_get_empty_sqs_enqueue_command_fragments() {
        final SubLObject cs = $get_empty_sqs_enqueue_command_fragments_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_empty_sqs_enqueue_command_fragments(final SubLObject queue_name) {
        return memoization_state.caching_state_remove_function_results_with_args($get_empty_sqs_enqueue_command_fragments_caching_state$.getGlobalValue(), list(queue_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_empty_sqs_enqueue_command_fragments_internal(final SubLObject queue_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_attribute_list(queue_name);
        SubLObject split_point = NIL;
        SubLObject command = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            try {
                                final SubLObject _prev_bind_0_$26 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$enqueue, att_list, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        split_point = file_position(xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$27, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$27, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$26, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal($$$enqueue);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                }
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$25, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$24, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$request);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return list(string_utilities.substring(command, ZERO_INTEGER, split_point), string_utilities.substring(command, split_point, UNPROVIDED));
    }

    public static SubLObject get_empty_sqs_enqueue_command_fragments(final SubLObject queue_name) {
        SubLObject caching_state = $get_empty_sqs_enqueue_command_fragments_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS, $get_empty_sqs_enqueue_command_fragments_caching_state$, TWENTY_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, queue_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_empty_sqs_enqueue_command_fragments_internal(queue_name)));
            memoization_state.caching_state_put(caching_state, queue_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_sqs_dequeue_command(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == UNPROVIDED) {
            retries = $default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == UNPROVIDED) {
            wait_secs = $default_sqs_wait_secs$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_access_attribute_list(queue_name, retries, wait_secs);
        SubLObject command = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$33 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$dequeue, att_list, T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$33 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$33, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$33, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$31, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$request);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }

    public static SubLObject get_sqs_pending_message_estimate_command(final SubLObject queue_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_sqs_queue_attribute_list(queue_name);
        SubLObject command = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$pending, att_list, T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$38 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$38, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$38, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$37, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$36, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$request);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }

    public static SubLObject get_sqs_list_queues_command() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject command = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$43 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$listqs, NIL, T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$43, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$43, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$42, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$41, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$request);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }

    public static SubLObject get_s3_putfile_command(final SubLObject bucket, final SubLObject key, final SubLObject pathname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data = file_utilities.file_contents_to_hex_string(pathname);
        final SubLObject att_list = get_s3_file_attribute_list(bucket, key);
        SubLObject command = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            try {
                                final SubLObject _prev_bind_0_$48 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$49 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$putfile, att_list, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$49 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        try {
                                            final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$50 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$data, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    write_string(data, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$50, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                xml_utilities.xml_end_tag_internal($$$data);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                                            }
                                        }
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$49, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$49, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$48, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$putfile);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                                }
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$46, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$request);
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return command;
    }

    public static SubLObject get_s3_getfile_command(final SubLObject bucket, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject att_list = get_s3_file_attribute_list(bucket, key);
        SubLObject command = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                try {
                    final SubLObject _prev_bind_0_$57 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$58 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$59 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$getfile, att_list, T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$59, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_1_$59, thread);
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$58, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$57, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$request);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            command = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return command;
    }

    public static SubLObject get_sqs_queue_access_attribute_list(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == UNPROVIDED) {
            retries = $default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == UNPROVIDED) {
            wait_secs = $default_sqs_wait_secs$.getGlobalValue();
        }
        return append(get_sqs_queue_attribute_list(queue_name), get_sqs_time_out_info_attribute_list(retries, wait_secs));
    }

    public static SubLObject get_sqs_queue_attribute_list(final SubLObject queue_name) {
        return list($$$name, queue_name);
    }

    public static SubLObject get_sqs_time_out_info_attribute_list(SubLObject retries, SubLObject wait_secs) {
        if (retries == UNPROVIDED) {
            retries = $default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == UNPROVIDED) {
            wait_secs = $default_sqs_wait_secs$.getGlobalValue();
        }
        return list($$$maxTries, retries, $$$maxWaitSecs, wait_secs);
    }

    public static SubLObject get_s3_file_attribute_list(final SubLObject bucket, final SubLObject key) {
        return list($$$bucket, bucket, $$$key, key);
    }

    public static SubLObject new_sqs_iterator(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == UNPROVIDED) {
            retries = $default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == UNPROVIDED) {
            wait_secs = $default_sqs_wait_secs$.getGlobalValue();
        }
        return iteration.new_iterator(make_sqs_iterator_state(queue_name, retries, wait_secs), $sym45$SQS_ITERATOR_DONE_, SQS_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject make_sqs_iterator_state(final SubLObject queue_name, final SubLObject retries, final SubLObject wait_secs) {
        final SubLObject doneP = NIL;
        return list(queue_name, retries, wait_secs, doneP);
    }

    public static SubLObject sqs_iterator_doneP(final SubLObject state) {
        final SubLObject doneP = nth(THREE_INTEGER, state);
        return doneP;
    }

    public static SubLObject sqs_iterator_next(final SubLObject state) {
        SubLObject queue_name = NIL;
        SubLObject retries = NIL;
        SubLObject wait_secs = NIL;
        SubLObject doneP = NIL;
        destructuring_bind_must_consp(state, state, $list47);
        queue_name = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list47);
        retries = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list47);
        wait_secs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list47);
        doneP = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list47);
            return NIL;
        }
        final SubLObject full_message = sqs_get_message(queue_name, retries, wait_secs);
        if ((NIL == full_message) || (NIL != sqs_empty_message_p(full_message))) {
            doneP = T;
            set_nth(THREE_INTEGER, state, doneP);
            return values(NIL, state, T);
        }
        return values(sqs_message_body_from_message(full_message, UNPROVIDED), state, NIL);
    }

    public static SubLObject new_sqs_accumulator(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs) {
        if (retries == UNPROVIDED) {
            retries = $default_sqs_retries$.getGlobalValue();
        }
        if (wait_secs == UNPROVIDED) {
            wait_secs = $default_sqs_wait_secs$.getGlobalValue();
        }
        return accumulation.new_accumulator(make_sqs_accumulator_state(queue_name, retries, wait_secs), SQS_ACCUMULATOR_RESET, SQS_ACCUMULATOR_ADD, SQS_ACCUMULATOR_SIZE, SQS_ACCUMULATOR_CONTENTS, SQS_ACCUMULATOR_IT, UNPROVIDED);
    }

    public static SubLObject make_sqs_accumulator_state(final SubLObject queue_name, final SubLObject retries, final SubLObject wait_secs) {
        return list(queue_name, retries, wait_secs, ZERO_INTEGER);
    }

    public static SubLObject sqs_accumulator_reset(final SubLObject state) {
        SubLObject queue_name = NIL;
        SubLObject retries = NIL;
        SubLObject wait_secs = NIL;
        SubLObject posts = NIL;
        destructuring_bind_must_consp(state, state, $list53);
        queue_name = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list53);
        retries = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list53);
        wait_secs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list53);
        posts = current.first();
        current = current.rest();
        if (NIL == current) {
            return make_sqs_accumulator_state(queue_name, retries, wait_secs);
        }
        cdestructuring_bind_error(state, $list53);
        return NIL;
    }

    public static SubLObject sqs_accumulator_add(final SubLObject state, final SubLObject message) {
        SubLTrampolineFile.enforceType(message, STRINGP);
        SubLObject queue_name = NIL;
        SubLObject retries = NIL;
        SubLObject wait_secs = NIL;
        SubLObject posts = NIL;
        destructuring_bind_must_consp(state, state, $list53);
        queue_name = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list53);
        retries = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list53);
        wait_secs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list53);
        posts = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject result = sqs_post_message(queue_name, message);
            if (NIL != list_utilities.sublisp_boolean(result)) {
                posts = add(posts, ONE_INTEGER);
                set_nth(THREE_INTEGER, state, posts);
            } else {
                Errors.error($str54$Could_not_post__A_to__A_, message, queue_name);
            }
        } else {
            cdestructuring_bind_error(state, $list53);
        }
        return state;
    }

    public static SubLObject sqs_accumulator_get_posts(final SubLObject state) {
        return nth(THREE_INTEGER, state);
    }

    public static SubLObject sqs_accumulator_size(final SubLObject state) {
        return sqs_accumulator_get_posts(state).isZero() ? ZERO_INTEGER : ONE_INTEGER;
    }

    public static SubLObject sqs_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        SubLObject queue_name = NIL;
        SubLObject retries = NIL;
        SubLObject wait_secs = NIL;
        SubLObject posts = NIL;
        destructuring_bind_must_consp(state, state, $list53);
        queue_name = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list53);
        retries = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list53);
        wait_secs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list53);
        posts = current.first();
        current = current.rest();
        if (NIL == current) {
            return values(posts, NIL != resetP ? make_sqs_accumulator_state(queue_name, retries, wait_secs) : state);
        }
        cdestructuring_bind_error(state, $list53);
        return NIL;
    }

    public static SubLObject sqs_accumulator_it(final SubLObject state) {
        final SubLObject posts = sqs_accumulator_get_posts(state);
        return posts.isZero() ? iteration.new_null_iterator() : iteration.new_list_iterator(list(posts));
    }

    public static SubLObject accumulate_assertion_description(final SubLObject acc, final SubLObject sentence, final SubLObject elmt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        assert NIL != accumulation.accumulator_p(acc) : "accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) " + acc;
        accumulation.accumulation_add(acc, encapsulate_assertion_description(sentence, elmt, v_properties));
        return acc;
    }

    public static SubLObject encapsulate_assertion_description(final SubLObject sentence, final SubLObject elmt, final SubLObject v_properties) {
        return list($SENTENCE, sentence, $ELMT, elmt, $PROPERTIES, v_properties);
    }

    public static SubLObject unencapsulate_assertion_description(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list59);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence = NIL;
        SubLObject elmt = NIL;
        SubLObject v_properties = NIL;
        SubLObject ass_desc = NIL;
        destructuring_bind_must_consp(current, datum, $list59);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list59);
        elmt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list59);
        v_properties = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list59);
        ass_desc = current.first();
        current = current.rest();
        final SubLObject default_properties = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list59);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list(sentence, listS(GETF, ass_desc, $list61)), list(elmt, listS(GETF, ass_desc, $list62)), list(v_properties, list(GETF, ass_desc, $PROPERTIES, default_properties))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list59);
        return NIL;
    }

    public static SubLObject handle_assertion_descriptions(final SubLObject iterator, SubLObject default_props) {
        if (default_props == UNPROVIDED) {
            default_props = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject ass_desc = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                handle_assertion_description(ass_desc, default_props);
            }
        }
        return $EXHAUSTED;
    }

    public static SubLObject handle_assertion_description(final SubLObject ass_desc, SubLObject default_props) {
        if (default_props == UNPROVIDED) {
            default_props = NIL;
        }
        final SubLObject sentence = getf(ass_desc, $SENTENCE, UNPROVIDED);
        final SubLObject elmt = getf(ass_desc, $ELMT, UNPROVIDED);
        final SubLObject v_properties = getf(ass_desc, $PROPERTIES, default_props);
        return cyc_kernel.cyc_assert(sentence, elmt, v_properties);
    }

    public static SubLObject new_externalizing_accumulator(final SubLObject accumulator) {
        return accumulation.new_transform_accumulator(accumulator, COMPACT_HL_EXTERNAL_ID_STRING, UNPROVIDED);
    }

    public static SubLObject new_internalizing_iterator(final SubLObject iterator) {
        return iteration.new_transform_iterator(iterator, FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING, UNPROVIDED);
    }

    public static SubLObject new_segment_accumulator(final SubLObject accumulator, SubLObject max_bytes, SubLObject cfasl_externalizedP) {
        if (max_bytes == UNPROVIDED) {
            max_bytes = $recommended_max_bytes_per_sqs_message$.getGlobalValue();
        }
        if (cfasl_externalizedP == UNPROVIDED) {
            cfasl_externalizedP = NIL;
        }
        return accumulation.new_accumulator(make_segment_accumulator_state(accumulator, max_bytes, cfasl_externalizedP), SGMT_ACCUMULATOR_RESET, SGMT_ACCUMULATOR_ADD, SGMT_ACCUMULATOR_SIZE, SGMT_ACCUMULATOR_CONTENTS, SGMT_ACCUMULATOR_IT, UNPROVIDED);
    }

    public static SubLObject make_segment_accumulator_state(final SubLObject acc, final SubLObject max_bytes, final SubLObject cfasl_externalizedP) {
        final SubLObject stream = new_cfasl_encoding_stream();
        final SubLObject total = ZERO_INTEGER;
        return list(acc, stream, total, max_bytes, cfasl_externalizedP);
    }

    public static SubLObject sgmt_accumulator_size(final SubLObject state) {
        return nth(TWO_INTEGER, state);
    }

    public static SubLObject sgmt_accumulator_reset(final SubLObject state) {
        SubLObject acc = NIL;
        SubLObject stream = NIL;
        SubLObject total = NIL;
        SubLObject max_bytes = NIL;
        SubLObject cfasl_externalizedP = NIL;
        destructuring_bind_must_consp(state, state, $list73);
        acc = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list73);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list73);
        total = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list73);
        max_bytes = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list73);
        cfasl_externalizedP = current.first();
        current = current.rest();
        if (NIL == current) {
            accumulation.accumulation_reset(acc);
            return make_segment_accumulator_state(acc, max_bytes, cfasl_externalizedP);
        }
        cdestructuring_bind_error(state, $list73);
        return NIL;
    }

    public static SubLObject sgmt_accumulator_add(final SubLObject state, final SubLObject v_object) {
        return sgmt_accumulator_add_internal(state, v_object, UNPROVIDED);
    }

    public static SubLObject sgmt_accumulator_add_internal(final SubLObject state, final SubLObject v_object, SubLObject error_on_overflowP) {
        if (error_on_overflowP == UNPROVIDED) {
            error_on_overflowP = NIL;
        }
        SubLObject acc = NIL;
        SubLObject stream = NIL;
        SubLObject total = NIL;
        SubLObject max_bytes = NIL;
        SubLObject cfasl_externalizedP = NIL;
        destructuring_bind_must_consp(state, state, $list73);
        acc = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list73);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list73);
        total = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list73);
        max_bytes = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list73);
        cfasl_externalizedP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject old_char_pos = cfasl_encoding_stream_hexchar_position(stream);
            final SubLObject old_position = cfasl_encoding_stream_byte_position(stream);
            SubLObject new_position = NIL;
            if (NIL != cfasl_externalizedP) {
                cfasl_output_externalized(v_object, stream);
            } else {
                cfasl_output(v_object, stream);
            }
            new_position = cfasl_encoding_stream_byte_position(stream);
            if (new_position.numL(max_bytes)) {
                set_nth(TWO_INTEGER, state, add(ONE_INTEGER, total));
            } else {
                if (!new_position.numE(max_bytes)) {
                    if (NIL != error_on_overflowP) {
                        final SubLObject delta = subtract(new_position, old_position);
                        if (max_bytes.numL(delta)) {
                            Errors.error($str74$Object__A_encodes_as__A_bytes__mo, v_object, delta, max_bytes);
                        } else {
                            Errors.error($str75$Implementation_error__serializing, v_object, delta, max_bytes);
                        }
                    }
                    sgmt_accumulator_flush_encoding_stream_up_to(acc, stream, old_char_pos);
                    set_nth(ONE_INTEGER, state, new_cfasl_encoding_stream());
                    error_on_overflowP = T;
                    return sgmt_accumulator_add_internal(state, v_object, error_on_overflowP);
                }
                sgmt_accumulator_flush_encoding_stream(acc, stream);
                set_nth(ONE_INTEGER, state, new_cfasl_encoding_stream());
            }
        } else {
            cdestructuring_bind_error(state, $list73);
        }
        return state;
    }

    public static SubLObject sgmt_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        sgmt_accumulator_possibly_flush_encoding_stream(state);
        final SubLObject acc = state.first();
        final SubLObject contents = accumulation.accumulation_contents(acc, resetP);
        return values(contents, NIL != resetP ? sgmt_accumulator_reset(state) : state);
    }

    public static SubLObject sgmt_accumulator_it(final SubLObject state) {
        final SubLObject acc = state.first();
        return accumulation.accumulation_iterator(acc);
    }

    public static SubLObject sgmt_accumulator_possibly_flush_encoding_stream(final SubLObject state) {
        final SubLObject acc = state.first();
        final SubLObject stream = second(state);
        if (!cfasl_encoding_stream_byte_position(stream).isZero()) {
            sgmt_accumulator_flush_encoding_stream(acc, stream);
        }
        return state;
    }

    public static SubLObject sgmt_accumulator_flush_encoding_stream(final SubLObject acc, final SubLObject stream) {
        final SubLObject limit = cfasl_encoding_stream_hexchar_position(stream);
        return sgmt_accumulator_flush_encoding_stream_up_to(acc, stream, limit);
    }

    public static SubLObject sgmt_accumulator_flush_encoding_stream_up_to(final SubLObject acc, final SubLObject stream, final SubLObject limit) {
        SubLObject segment = cfasl_encoding_string_stream_encoding(stream);
        close_cfasl_encoding_stream(stream);
        if (limit.numL(length(segment))) {
            segment = string_utilities.substring(segment, ZERO_INTEGER, limit);
        }
        accumulation.accumulation_add(acc, segment);
        return acc;
    }

    public static SubLObject new_sqs_segment_iterator(final SubLObject sqs_iterator) {
        SubLTrampolineFile.enforceType(sqs_iterator, ITERATOR_P);
        return iteration.new_iterator(make_sqs_segment_iterator_state(sqs_iterator), SQS_SGMNT_IT_DONE, SQS_SGMNT_IT_NEXT, UNPROVIDED);
    }

    public static SubLObject make_sqs_segment_iterator_state(final SubLObject sqs_it) {
        return list(sqs_it, iteration.new_null_iterator());
    }

    public static SubLObject sqs_sgmnt_it_done(final SubLObject state) {
        SubLObject sqs_it = NIL;
        SubLObject sgmt_it = NIL;
        destructuring_bind_must_consp(state, state, $list79);
        sqs_it = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list79);
        sgmt_it = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != iteration.iteration_done(sgmt_it)) && (NIL != iteration.iteration_done(sqs_it)));
        }
        cdestructuring_bind_error(state, $list79);
        return NIL;
    }

    public static SubLObject sqs_sgmnt_it_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sqs_it = NIL;
        SubLObject sgmt_it = NIL;
        destructuring_bind_must_consp(state, state, $list79);
        sqs_it = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list79);
        sgmt_it = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list79);
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject value = iteration.iteration_next(sgmt_it);
        SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP) {
            return values(value, state, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject segment = iteration.iteration_next(sqs_it);
        validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == validP) {
            return values(NIL, state, T);
        }
        final SubLObject new_sgmt_it = new_iterator_from_segment_contents(segment);
        set_nth(ONE_INTEGER, state, new_sgmt_it);
        thread.resetMultipleValues();
        final SubLObject value2 = iteration.iteration_next(new_sgmt_it);
        final SubLObject validP_$62 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(value2, state, makeBoolean(NIL == validP_$62));
    }

    public static SubLObject new_iterator_from_segment_contents(final SubLObject segment) {
        return iteration.new_list_iterator(nreverse(cfasl_utilities.cfasl_load_all_from_string(segment)));
    }

    public static SubLObject monitor_all_sqs_queues(SubLObject wait_time) {
        if (wait_time == UNPROVIDED) {
            wait_time = $int$30;
        }
        SubLObject all_emptyP = NIL;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            all_emptyP = T;
            SubLObject cdolist_list_var = sqs_list_queues();
            SubLObject queue = NIL;
            queue = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject estimate = sqs_pending_message_estimate(queue);
                if (!estimate.isZero()) {
                    format(T, $str81$___A__A___A_msgs__, new SubLObject[]{ numeric_date_utilities.timestring(UNPROVIDED), queue, estimate });
                    all_emptyP = NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                queue = cdolist_list_var.first();
            } 
            if (NIL != all_emptyP) {
                doneP = T;
            } else {
                sleep(wait_time);
            }
        } 
        return $ALL_EMPTY;
    }

    public static SubLObject drain_some_sqs_queues(SubLObject v_queues) {
        if (v_queues == UNPROVIDED) {
            v_queues = sqs_list_queues();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject checked_queues = NIL;
        SubLObject cdolist_list_var = v_queues;
        SubLObject queue = NIL;
        queue = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != is_known_sqs_queueP(queue)) {
                checked_queues = cons(queue, checked_queues);
                SubLObject counter = ZERO_INTEGER;
                final SubLObject sqs_it = new_sqs_iterator(queue, UNPROVIDED, UNPROVIDED);
                format_nil.force_format(T, $str83$___A__Cleaning_up_ca__A_msgs_from, numeric_date_utilities.timestring(UNPROVIDED), sqs_pending_message_estimate(queue), queue, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject msg = iteration.iteration_next(sqs_it);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        counter = add(counter, ONE_INTEGER);
                    }
                }
                format_nil.force_format(T, $str84$___A__Removed__A_msgs_from__A___, numeric_date_utilities.timestring(UNPROVIDED), counter, queue, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            queue = cdolist_list_var.first();
        } 
        return nreverse(checked_queues);
    }

    public static SubLObject configure_sqs_queue_name(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject place = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        place = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(MUST, list($sym88$IS_KNOWN_SQS_QUEUE_, value), $str89$_A_is_not_a_known_SQS_queue______, value), list(CSETQ, place, value));
        }
        cdestructuring_bind_error(datum, $list85);
        return NIL;
    }

    public static SubLObject declare_simple_queue_service_file() {
        declareFunction("success_sqs_response_p", "SUCCESS-SQS-RESPONSE-P", 1, 0, false);
        declareFunction("sqs_response_p", "SQS-RESPONSE-P", 1, 0, false);
        declareFunction("sqs_response_status", "SQS-RESPONSE-STATUS", 1, 0, false);
        declareFunction("sqs_response_reply", "SQS-RESPONSE-REPLY", 1, 0, false);
        declareFunction("sqs_empty_message_p", "SQS-EMPTY-MESSAGE-P", 1, 0, false);
        declareFunction("process_sqs_error_response", "PROCESS-SQS-ERROR-RESPONSE", 1, 0, false);
        declareFunction("get_sqs_version", "GET-SQS-VERSION", 0, 0, false);
        declareFunction("is_sqs_availableP", "IS-SQS-AVAILABLE?", 0, 0, false);
        declareFunction("sqs_list_queues", "SQS-LIST-QUEUES", 0, 0, false);
        declareFunction("is_known_sqs_queueP", "IS-KNOWN-SQS-QUEUE?", 1, 0, false);
        declareFunction("sqs_create_queue", "SQS-CREATE-QUEUE", 1, 2, false);
        declareFunction("sqs_delete_queue", "SQS-DELETE-QUEUE", 1, 2, false);
        declareFunction("sqs_post_message", "SQS-POST-MESSAGE", 2, 0, false);
        declareFunction("sqs_post_message_pieces", "SQS-POST-MESSAGE-PIECES", 2, 0, false);
        declareFunction("sqs_get_message", "SQS-GET-MESSAGE", 1, 2, false);
        declareFunction("sqs_message_body_from_message", "SQS-MESSAGE-BODY-FROM-MESSAGE", 1, 1, false);
        declareFunction("sqs_get_message_content", "SQS-GET-MESSAGE-CONTENT", 1, 2, false);
        declareFunction("sqs_pending_message_estimate", "SQS-PENDING-MESSAGE-ESTIMATE", 1, 0, false);
        declareFunction("s3_put_file", "S3-PUT-FILE", 3, 0, false);
        declareFunction("s3_get_file_contents", "S3-GET-FILE-CONTENTS", 2, 0, false);
        declareFunction("s3_get_file", "S3-GET-FILE", 3, 0, false);
        declareFunction("communicate_with_local_sqs_relayer", "COMMUNICATE-WITH-LOCAL-SQS-RELAYER", 1, 0, false);
        declareMacro("with_sqs_message_to_string", "WITH-SQS-MESSAGE-TO-STRING");
        declareFunction("get_sqs_version_command", "GET-SQS-VERSION-COMMAND", 0, 0, false);
        declareFunction("get_sqs_create_queue_command", "GET-SQS-CREATE-QUEUE-COMMAND", 1, 2, false);
        declareFunction("get_sqs_delete_queue_command", "GET-SQS-DELETE-QUEUE-COMMAND", 1, 2, false);
        declareFunction("get_sqs_enqueue_command", "GET-SQS-ENQUEUE-COMMAND", 2, 0, false);
        declareFunction("clear_get_empty_sqs_enqueue_command_fragments", "CLEAR-GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS", 0, 0, false);
        declareFunction("remove_get_empty_sqs_enqueue_command_fragments", "REMOVE-GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS", 1, 0, false);
        declareFunction("get_empty_sqs_enqueue_command_fragments_internal", "GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS-INTERNAL", 1, 0, false);
        declareFunction("get_empty_sqs_enqueue_command_fragments", "GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS", 1, 0, false);
        declareFunction("get_sqs_dequeue_command", "GET-SQS-DEQUEUE-COMMAND", 1, 2, false);
        declareFunction("get_sqs_pending_message_estimate_command", "GET-SQS-PENDING-MESSAGE-ESTIMATE-COMMAND", 1, 0, false);
        declareFunction("get_sqs_list_queues_command", "GET-SQS-LIST-QUEUES-COMMAND", 0, 0, false);
        declareFunction("get_s3_putfile_command", "GET-S3-PUTFILE-COMMAND", 3, 0, false);
        declareFunction("get_s3_getfile_command", "GET-S3-GETFILE-COMMAND", 2, 0, false);
        declareFunction("get_sqs_queue_access_attribute_list", "GET-SQS-QUEUE-ACCESS-ATTRIBUTE-LIST", 1, 2, false);
        declareFunction("get_sqs_queue_attribute_list", "GET-SQS-QUEUE-ATTRIBUTE-LIST", 1, 0, false);
        declareFunction("get_sqs_time_out_info_attribute_list", "GET-SQS-TIME-OUT-INFO-ATTRIBUTE-LIST", 0, 2, false);
        declareFunction("get_s3_file_attribute_list", "GET-S3-FILE-ATTRIBUTE-LIST", 2, 0, false);
        declareFunction("new_sqs_iterator", "NEW-SQS-ITERATOR", 1, 2, false);
        declareFunction("make_sqs_iterator_state", "MAKE-SQS-ITERATOR-STATE", 3, 0, false);
        declareFunction("sqs_iterator_doneP", "SQS-ITERATOR-DONE?", 1, 0, false);
        declareFunction("sqs_iterator_next", "SQS-ITERATOR-NEXT", 1, 0, false);
        declareFunction("new_sqs_accumulator", "NEW-SQS-ACCUMULATOR", 1, 2, false);
        declareFunction("make_sqs_accumulator_state", "MAKE-SQS-ACCUMULATOR-STATE", 3, 0, false);
        declareFunction("sqs_accumulator_reset", "SQS-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction("sqs_accumulator_add", "SQS-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction("sqs_accumulator_get_posts", "SQS-ACCUMULATOR-GET-POSTS", 1, 0, false);
        declareFunction("sqs_accumulator_size", "SQS-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction("sqs_accumulator_contents", "SQS-ACCUMULATOR-CONTENTS", 1, 1, false);
        declareFunction("sqs_accumulator_it", "SQS-ACCUMULATOR-IT", 1, 0, false);
        declareFunction("accumulate_assertion_description", "ACCUMULATE-ASSERTION-DESCRIPTION", 3, 1, false);
        declareFunction("encapsulate_assertion_description", "ENCAPSULATE-ASSERTION-DESCRIPTION", 3, 0, false);
        declareMacro("unencapsulate_assertion_description", "UNENCAPSULATE-ASSERTION-DESCRIPTION");
        declareFunction("handle_assertion_descriptions", "HANDLE-ASSERTION-DESCRIPTIONS", 1, 1, false);
        declareFunction("handle_assertion_description", "HANDLE-ASSERTION-DESCRIPTION", 1, 1, false);
        declareFunction("new_externalizing_accumulator", "NEW-EXTERNALIZING-ACCUMULATOR", 1, 0, false);
        declareFunction("new_internalizing_iterator", "NEW-INTERNALIZING-ITERATOR", 1, 0, false);
        declareFunction("new_segment_accumulator", "NEW-SEGMENT-ACCUMULATOR", 1, 2, false);
        declareFunction("make_segment_accumulator_state", "MAKE-SEGMENT-ACCUMULATOR-STATE", 3, 0, false);
        declareFunction("sgmt_accumulator_size", "SGMT-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction("sgmt_accumulator_reset", "SGMT-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction("sgmt_accumulator_add", "SGMT-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction("sgmt_accumulator_add_internal", "SGMT-ACCUMULATOR-ADD-INTERNAL", 2, 1, false);
        declareFunction("sgmt_accumulator_contents", "SGMT-ACCUMULATOR-CONTENTS", 1, 1, false);
        declareFunction("sgmt_accumulator_it", "SGMT-ACCUMULATOR-IT", 1, 0, false);
        declareFunction("sgmt_accumulator_possibly_flush_encoding_stream", "SGMT-ACCUMULATOR-POSSIBLY-FLUSH-ENCODING-STREAM", 1, 0, false);
        declareFunction("sgmt_accumulator_flush_encoding_stream", "SGMT-ACCUMULATOR-FLUSH-ENCODING-STREAM", 2, 0, false);
        declareFunction("sgmt_accumulator_flush_encoding_stream_up_to", "SGMT-ACCUMULATOR-FLUSH-ENCODING-STREAM-UP-TO", 3, 0, false);
        declareFunction("new_sqs_segment_iterator", "NEW-SQS-SEGMENT-ITERATOR", 1, 0, false);
        declareFunction("make_sqs_segment_iterator_state", "MAKE-SQS-SEGMENT-ITERATOR-STATE", 1, 0, false);
        declareFunction("sqs_sgmnt_it_done", "SQS-SGMNT-IT-DONE", 1, 0, false);
        declareFunction("sqs_sgmnt_it_next", "SQS-SGMNT-IT-NEXT", 1, 0, false);
        declareFunction("new_iterator_from_segment_contents", "NEW-ITERATOR-FROM-SEGMENT-CONTENTS", 1, 0, false);
        declareFunction("monitor_all_sqs_queues", "MONITOR-ALL-SQS-QUEUES", 0, 1, false);
        declareFunction("drain_some_sqs_queues", "DRAIN-SOME-SQS-QUEUES", 0, 1, false);
        declareMacro("configure_sqs_queue_name", "CONFIGURE-SQS-QUEUE-NAME");
        return NIL;
    }

    public static SubLObject init_simple_queue_service_file() {
        defparameter("*LOCAL-SQS-RELAY-HOST*", $$$localhost);
        defparameter("*LOCAL-SQS-RELAY-PORT*", $int$19219);
        defconstant("*DEFAULT-SQS-RETRIES*", TEN_INTEGER);
        defconstant("*DEFAULT-SQS-WAIT-SECS*", TEN_INTEGER);
        defparameter("*SQS-ERROR-REPORTING-POLICY*", $WARN_ON_ERROR);
        deflexical("*DEFAULT-SQS-REQUEST-ATTRIBUTE-LIST*", list($$$format, $$$subl));
        deflexical("*GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS-CACHING-STATE*", NIL);
        deflexical("*RECOMMENDED-MAX-HEX-CHARS-PER-SQS-MESSAGE*", subtract($int$8192, $int$256));
        deflexical("*RECOMMENDED-MAX-BYTES-PER-SQS-MESSAGE*", integerDivide($recommended_max_hex_chars_per_sqs_message$.getGlobalValue(), TWO_INTEGER));
        return NIL;
    }

    public static SubLObject setup_simple_queue_service_file() {
        memoization_state.note_globally_cached_function(GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS);
        note_funcall_helper_function($sym45$SQS_ITERATOR_DONE_);
        note_funcall_helper_function(SQS_ITERATOR_NEXT);
        note_funcall_helper_function(SQS_ACCUMULATOR_RESET);
        note_funcall_helper_function(SQS_ACCUMULATOR_ADD);
        note_funcall_helper_function(SQS_ACCUMULATOR_SIZE);
        note_funcall_helper_function(SQS_ACCUMULATOR_CONTENTS);
        note_funcall_helper_function(SQS_ACCUMULATOR_IT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_simple_queue_service_file();
    }

    @Override
    public void initializeVariables() {
        init_simple_queue_service_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_simple_queue_service_file();
    }

    static {





































































































    }
}

/**
 * Total time: 847 ms
 */
