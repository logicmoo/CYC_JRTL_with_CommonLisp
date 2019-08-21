package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.cfasl_kernel;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.cfasl_kernel.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cfasl_kernel extends SubLTranslatedFile {
    public static final SubLFile me = new cfasl_kernel();

    public static final String myName = "com.cyc.cycjava.cycl.cfasl_kernel";

    public static final String myFingerPrint = "e2de2c6f86d83f95c33a88aed69fe4ac087421dffabbdcc41a585c4a7f5d9186";

    // defparameter
    public static final SubLSymbol $perform_cfasl_externalization$ = makeSymbol("*PERFORM-CFASL-EXTERNALIZATION*");

    // defparameter
    // the standard output stream for debugging within a task-processor-request
    public static final SubLSymbol $cfasl_kernel_standard_output$ = makeSymbol("*CFASL-KERNEL-STANDARD-OUTPUT*");

    // defparameter
    private static final SubLSymbol $cfasl_eof_exception$ = makeSymbol("*CFASL-EOF-EXCEPTION*");



    public static final SubLSymbol CFASL_SERVER_HANDLER = makeSymbol("CFASL-SERVER-HANDLER");



    public static final SubLSymbol READ_CFASL_REQUEST = makeSymbol("READ-CFASL-REQUEST");

    public static final SubLSymbol VALIDATE_CFASL_REQUEST = makeSymbol("VALIDATE-CFASL-REQUEST");

    public static final SubLSymbol SEND_CFASL_RESULT = makeSymbol("SEND-CFASL-RESULT");

    private static final SubLSymbol CFASL_FAKE_SERVER_LOOP_ONE_STEP = makeSymbol("CFASL-FAKE-SERVER-LOOP-ONE-STEP");





    public static final SubLString $str9$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a proper list");

    private static final SubLString $str10$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a valid API function symbol");

    private static final SubLSymbol CYC_EXCEPTION = makeSymbol("CYC-EXCEPTION");









    private static final SubLList $list16 = list(makeSymbol("CFASL-QUIT"));

    private static final SubLString $str17$_A = makeString("~A");



    private static final SubLString $str19$Error_evaluating__A___Problem___A = makeString("Error evaluating ~A~% Problem: ~A");

    private static final SubLString $$$EOF_occurred_on_CFASL_API_stream = makeString("EOF occurred on CFASL API stream");





    private static final SubLList $list23 = list(makeSymbol("*USE-LOCAL-QUEUE?*"), NIL);

    private static final SubLSymbol $the_cyclist$ = makeSymbol("*THE-CYCLIST*");

    private static final SubLSymbol $ke_purpose$ = makeSymbol("*KE-PURPOSE*");

    public static final SubLList $list26 = list(new SubLObject[]{ list(makeSymbol("*EVAL-IN-API-ENV*"), NIL), list(makeSymbol("*EVAL-IN-API-LEVEL*"), ZERO_INTEGER), list(makeSymbol("*EVAL-IN-API-TRACED-FNS*"), NIL), list(makeSymbol("*EVAL-IN-API-TRACE-LOG*"), makeString("")), list(makeSymbol("*IGNORE-WARNS?*"), T), list(makeSymbol("*IGNORE-BREAKS?*"), T), list(makeSymbol("*SILENT-PROGRESS?*"), T), list(makeSymbol("*CONTINUE-CERROR?*"), T), list(makeSymbol("*STANDARD-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*ERROR-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeKeyword("CYC"))) });

    private static final SubLSymbol TASK_PROCESSOR_REQUEST = makeSymbol("TASK-PROCESSOR-REQUEST");

    public static final SubLList $list28 = list(makeSymbol("REQUEST"), makeSymbol("ID"), makeSymbol("PRIORITY"), makeSymbol("REQUESTOR"), makeSymbol("CLIENT-BINDINGS"), makeSymbol("&OPTIONAL"), makeSymbol("UUID-STRING"));

    private static final SubLString $str29$_param_REQUEST__consp_for_evaluat = makeString("@param REQUEST; consp for evaluation\n   @param ID; integerp\n   @param PRIORITY; intergerp\n   @param REQUESTOR; stringp\n   @param CLIENT-BINDINGS; consp of (var value) pairs\n   @param UUID-STRING; identifies the client to which the response will be sent\n   Submits the REQUEST form to the task request queue with ID, PRIORITY,\n   REQUESTOR, BINDINGS and OUT-STREAM.");

    private static final SubLList $list30 = list(list(makeSymbol("REQUEST"), makeSymbol("CONSP")), list(makeSymbol("ID"), makeSymbol("INTEGERP")), list(makeSymbol("PRIORITY"), makeSymbol("INTEGERP")), list(makeSymbol("REQUESTOR"), makeSymbol("STRINGP")), list(makeSymbol("CLIENT-BINDINGS"), makeSymbol("LISTP")));

    private static final SubLList $list31 = list(NIL);

    public static SubLObject cfasl_externalization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $perform_cfasl_externalization$.getDynamicValue(thread);
    }

    public static SubLObject cfasl_set_mode_externalized() {
        $perform_cfasl_externalization$.setDynamicValue(T);
        return cfasl_externalization_modeP();
    }

    public static SubLObject cfasl_set_mode_internalized() {
        $perform_cfasl_externalization$.setDynamicValue(NIL);
        return cfasl_externalization_modeP();
    }

    public static SubLObject cfasl_server_handler(final SubLObject in_stream, final SubLObject out_stream) {
        return cfasl_server_top_level(in_stream, out_stream);
    }

    public static SubLObject cfasl_server_top_level(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols(NIL);
            final SubLObject _prev_bind_0_$1 = $perform_cfasl_externalization$.currentBinding(thread);
            final SubLObject _prev_bind_2 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
            final SubLObject _prev_bind_3 = api_kernel.$default_api_input_protocol$.currentBinding(thread);
            final SubLObject _prev_bind_4 = api_kernel.$default_api_validate_method$.currentBinding(thread);
            final SubLObject _prev_bind_5 = api_kernel.$default_api_output_protocol$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $cfasl_kernel_standard_output$.currentBinding(thread);
            try {
                $perform_cfasl_externalization$.bind(NIL, thread);
                api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                api_kernel.$default_api_input_protocol$.bind(READ_CFASL_REQUEST, thread);
                api_kernel.$default_api_validate_method$.bind(VALIDATE_CFASL_REQUEST, thread);
                api_kernel.$default_api_output_protocol$.bind(SEND_CFASL_RESULT, thread);
                $cfasl_kernel_standard_output$.bind(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
                ans = api_kernel.api_server_top_level(in_stream, out_stream);
            } finally {
                $cfasl_kernel_standard_output$.rebind(_prev_bind_6, thread);
                api_kernel.$default_api_output_protocol$.rebind(_prev_bind_5, thread);
                api_kernel.$default_api_validate_method$.rebind(_prev_bind_4, thread);
                api_kernel.$default_api_input_protocol$.rebind(_prev_bind_3, thread);
                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_2, thread);
                $perform_cfasl_externalization$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject cfasl_fake_server_loop_one_step(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols(NIL);
            final SubLObject _prev_bind_0_$2 = $perform_cfasl_externalization$.currentBinding(thread);
            final SubLObject _prev_bind_2 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
            final SubLObject _prev_bind_3 = api_kernel.$default_api_input_protocol$.currentBinding(thread);
            final SubLObject _prev_bind_4 = api_kernel.$default_api_validate_method$.currentBinding(thread);
            final SubLObject _prev_bind_5 = api_kernel.$default_api_output_protocol$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $cfasl_kernel_standard_output$.currentBinding(thread);
            try {
                $perform_cfasl_externalization$.bind(NIL, thread);
                api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                api_kernel.$default_api_input_protocol$.bind(READ_CFASL_REQUEST, thread);
                api_kernel.$default_api_validate_method$.bind(VALIDATE_CFASL_REQUEST, thread);
                api_kernel.$default_api_output_protocol$.bind(SEND_CFASL_RESULT, thread);
                $cfasl_kernel_standard_output$.bind(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
                api_kernel.api_fake_server_loop_one_step(in_stream, out_stream);
            } finally {
                $cfasl_kernel_standard_output$.rebind(_prev_bind_6, thread);
                api_kernel.$default_api_output_protocol$.rebind(_prev_bind_5, thread);
                api_kernel.$default_api_validate_method$.rebind(_prev_bind_4, thread);
                api_kernel.$default_api_input_protocol$.rebind(_prev_bind_3, thread);
                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_2, thread);
                $perform_cfasl_externalization$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cfasl_quit() {
        return api_kernel.api_quit();
    }

    public static SubLObject cfasl_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$cfasl_port_offset$.getDynamicValue(thread));
    }

    public static SubLObject read_cfasl_request(final SubLObject in_stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject request = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    request = cfasl_input(in_stream, eof_error_p, eof_value);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
        }
        return request;
    }

    public static SubLObject validate_cfasl_request(final SubLObject api_request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == list_utilities.proper_list_p(api_request)) {
            Errors.error($str9$Invalid_API_Request___S_is_not_a_, api_request);
        }
        if ((NIL == eval_in_api.$eval_in_apiP$.getDynamicValue(thread)) && (NIL == api_kernel.valid_api_function_symbol(api_request.first()))) {
            Errors.error($str10$Invalid_API_Request___S_is_not_a_, api_request.first());
        }
        return T;
    }

    public static SubLObject send_cfasl_result(final SubLObject out_stream, SubLObject cfasl_result, SubLObject error) {
        if (error == UNPROVIDED) {
            error = NIL;
        }
        if (NIL != error) {
            cfasl_result = make_cfasl_api_exception(cfasl_result);
        }
        cfasl_output(sublisp_null(error), out_stream);
        if (NIL != cfasl_externalization_modeP()) {
            cfasl_output_externalized(cfasl_result, out_stream);
        } else {
            cfasl_output(cfasl_result, out_stream);
        }
        force_output(out_stream);
        return cfasl_result;
    }

    public static SubLObject cfasl_api_exception_p(final SubLObject v_object) {
        return makeBoolean(((((v_object.isCons() && (CYC_EXCEPTION == v_object.first())) && (NIL != list_utilities.proper_list_p(v_object))) && THREE_INTEGER.numE(length(v_object))) && ($MESSAGE == second(v_object))) && third(v_object).isString());
    }

    public static SubLObject make_cfasl_api_exception(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return list(CYC_EXCEPTION, $MESSAGE, string);
    }

    public static SubLObject cfasl_api_exception_message(final SubLObject cfasl_api_exception) {
        return third(cfasl_api_exception);
    }

    public static SubLObject cfasl_api_remote_eval(final SubLObject api_request, final SubLObject machine, final SubLObject port) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(machine) : "Types.stringp(machine) " + "CommonSymbols.NIL != Types.stringp(machine) " + machine;
        assert NIL != integerp(port) : "Types.integerp(port) " + "CommonSymbols.NIL != Types.integerp(port) " + port;
        SubLObject result = NIL;
        SubLObject valid = NIL;
        SubLObject channel = NIL;
        try {
            channel = subl_promotions.open_tcp_stream_with_timeout(machine, port, NIL, $PRIVATE);
            if (NIL != validate_tcp_connection(channel, machine, port)) {
                thread.resetMultipleValues();
                final SubLObject result_$3 = cfasl_channel_eval_internal(api_request, channel);
                final SubLObject valid_$4 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$3;
                valid = valid_$4;
                cfasl_output($list16, channel);
                force_output(channel);
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != channel) {
                    close(channel, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == valid) {
            return Errors.error($str17$_A, cfasl_api_exception_message(result));
        }
        return result;
    }

    public static SubLObject cfasl_channel_eval(final SubLObject api_request, final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != streamp(channel) : "Types.streamp(channel) " + "CommonSymbols.NIL != Types.streamp(channel) " + channel;
        thread.resetMultipleValues();
        final SubLObject result = cfasl_channel_eval_internal(api_request, channel);
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == valid) {
            return Errors.error($str19$Error_evaluating__A___Problem___A, api_request, cfasl_api_exception_message(result));
        }
        return result;
    }

    public static SubLObject cfasl_channel_eval_internal(final SubLObject api_request, final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_channel_output(api_request, channel);
        force_output(channel);
        final SubLObject valid = cfasl_channel_input(channel, T);
        final SubLObject result = cfasl_channel_input(channel, $cfasl_eof_exception$.getDynamicValue(thread));
        return values(result, valid);
    }

    public static SubLObject cfasl_channel_output(final SubLObject v_object, final SubLObject channel) {
        if (NIL != cfasl_channel_externalizedP()) {
            return cfasl_output_externalized(v_object, channel);
        }
        return cfasl_output(v_object, channel);
    }

    public static SubLObject cfasl_channel_input(final SubLObject channel, final SubLObject eof_value) {
        return cfasl_input(channel, NIL, eof_value);
    }

    public static SubLObject task_processor_request(final SubLObject request, final SubLObject id, final SubLObject priority, final SubLObject requestor, final SubLObject client_bindings, SubLObject uuid_string) {
        if (uuid_string == UNPROVIDED) {
            uuid_string = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(request, CONSP);
        SubLTrampolineFile.enforceType(id, INTEGERP);
        SubLTrampolineFile.enforceType(priority, INTEGERP);
        SubLTrampolineFile.enforceType(requestor, STRINGP);
        SubLTrampolineFile.enforceType(client_bindings, LISTP);
        final SubLObject server_bindings = listS($list23, list($the_cyclist$, operation_communication.the_cyclist()), list($ke_purpose$, api_control_vars.$default_ke_purpose$.getDynamicValue(thread)), $list26);
        task_processor.api_task_processor_request(request, id, priority, requestor, append(server_bindings, client_bindings), uuid_string);
        return NIL;
    }

    public static SubLObject declare_cfasl_kernel_file() {
        declareFunction(me, "cfasl_externalization_modeP", "CFASL-EXTERNALIZATION-MODE?", 0, 0, false);
        declareFunction(me, "cfasl_set_mode_externalized", "CFASL-SET-MODE-EXTERNALIZED", 0, 0, false);
        declareFunction(me, "cfasl_set_mode_internalized", "CFASL-SET-MODE-INTERNALIZED", 0, 0, false);
        declareFunction(me, "cfasl_server_handler", "CFASL-SERVER-HANDLER", 2, 0, false);
        declareFunction(me, "cfasl_server_top_level", "CFASL-SERVER-TOP-LEVEL", 2, 0, false);
        declareFunction(me, "cfasl_fake_server_loop_one_step", "CFASL-FAKE-SERVER-LOOP-ONE-STEP", 2, 0, false);
        declareFunction(me, "cfasl_quit", "CFASL-QUIT", 0, 0, false);
        declareFunction(me, "cfasl_port", "CFASL-PORT", 0, 0, false);
        declareFunction(me, "read_cfasl_request", "READ-CFASL-REQUEST", 1, 2, false);
        declareFunction(me, "validate_cfasl_request", "VALIDATE-CFASL-REQUEST", 1, 0, false);
        declareFunction(me, "send_cfasl_result", "SEND-CFASL-RESULT", 2, 1, false);
        declareFunction(me, "cfasl_api_exception_p", "CFASL-API-EXCEPTION-P", 1, 0, false);
        declareFunction(me, "make_cfasl_api_exception", "MAKE-CFASL-API-EXCEPTION", 1, 0, false);
        declareFunction(me, "cfasl_api_exception_message", "CFASL-API-EXCEPTION-MESSAGE", 1, 0, false);
        declareFunction(me, "cfasl_api_remote_eval", "CFASL-API-REMOTE-EVAL", 3, 0, false);
        declareFunction(me, "cfasl_channel_eval", "CFASL-CHANNEL-EVAL", 2, 0, false);
        declareFunction(me, "cfasl_channel_eval_internal", "CFASL-CHANNEL-EVAL-INTERNAL", 2, 0, false);
        declareFunction(me, "cfasl_channel_output", "CFASL-CHANNEL-OUTPUT", 2, 0, false);
        declareFunction(me, "cfasl_channel_input", "CFASL-CHANNEL-INPUT", 2, 0, false);
        declareFunction(me, "task_processor_request", "TASK-PROCESSOR-REQUEST", 5, 1, false);
        return NIL;
    }

    public static SubLObject init_cfasl_kernel_file() {
        defparameter("*PERFORM-CFASL-EXTERNALIZATION*", NIL);
        defparameter("*CFASL-KERNEL-STANDARD-OUTPUT*", NIL);
        defparameter("*CFASL-EOF-EXCEPTION*", make_cfasl_api_exception($$$EOF_occurred_on_CFASL_API_stream));
        return NIL;
    }

    public static SubLObject setup_cfasl_kernel_file() {
        tcp_server_utilities.register_tcp_server_type($CFASL, CFASL_SERVER_HANDLER, $BINARY);
        register_external_symbol(CFASL_FAKE_SERVER_LOOP_ONE_STEP);
        register_cyc_api_function(TASK_PROCESSOR_REQUEST, $list28, $str29$_param_REQUEST__consp_for_evaluat, $list30, $list31);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cfasl_kernel_file();
    }

    @Override
    public void initializeVariables() {
        init_cfasl_kernel_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cfasl_kernel_file();
    }

    static {




































    }
}

/**
 * Total time: 101 ms
 */
