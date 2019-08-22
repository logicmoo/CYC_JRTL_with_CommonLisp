/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_channel_externalizedP;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_externalized;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cfasl_kernel extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cfasl_kernel();

 public static final String myName = "com.cyc.cycjava.cycl.cfasl_kernel";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $perform_cfasl_externalization$ = makeSymbol("*PERFORM-CFASL-EXTERNALIZATION*");

    // defparameter
    // the standard output stream for debugging within a task-processor-request
    /**
     * the standard output stream for debugging within a task-processor-request
     */
    @LispMethod(comment = "the standard output stream for debugging within a task-processor-request\ndefparameter")
    public static final SubLSymbol $cfasl_kernel_standard_output$ = makeSymbol("*CFASL-KERNEL-STANDARD-OUTPUT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cfasl_eof_exception$ = makeSymbol("*CFASL-EOF-EXCEPTION*");

    private static final SubLSymbol CFASL_SERVER_HANDLER = makeSymbol("CFASL-SERVER-HANDLER");

    private static final SubLSymbol READ_CFASL_REQUEST = makeSymbol("READ-CFASL-REQUEST");

    private static final SubLSymbol VALIDATE_CFASL_REQUEST = makeSymbol("VALIDATE-CFASL-REQUEST");

    private static final SubLSymbol SEND_CFASL_RESULT = makeSymbol("SEND-CFASL-RESULT");

    private static final SubLSymbol CFASL_FAKE_SERVER_LOOP_ONE_STEP = makeSymbol("CFASL-FAKE-SERVER-LOOP-ONE-STEP");

    static private final SubLString $str9$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a proper list");

    private static final SubLString $str10$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a valid API function symbol");

    private static final SubLSymbol CYC_EXCEPTION = makeSymbol("CYC-EXCEPTION");

    private static final SubLList $list16 = list(makeSymbol("CFASL-QUIT"));

    private static final SubLString $str17$_A = makeString("~A");

    private static final SubLString $str19$Error_evaluating__A___Problem___A = makeString("Error evaluating ~A~% Problem: ~A");

    private static final SubLString $$$EOF_occurred_on_CFASL_API_stream = makeString("EOF occurred on CFASL API stream");

    private static final SubLList $list23 = list(makeSymbol("*USE-LOCAL-QUEUE?*"), NIL);

    private static final SubLSymbol $the_cyclist$ = makeSymbol("*THE-CYCLIST*");

    private static final SubLSymbol $ke_purpose$ = makeSymbol("*KE-PURPOSE*");

    static private final SubLList $list26 = list(new SubLObject[]{ list(makeSymbol("*EVAL-IN-API-ENV*"), NIL), list(makeSymbol("*EVAL-IN-API-LEVEL*"), ZERO_INTEGER), list(makeSymbol("*EVAL-IN-API-TRACED-FNS*"), NIL), list(makeSymbol("*EVAL-IN-API-TRACE-LOG*"), makeString("")), list(makeSymbol("*IGNORE-WARNS?*"), T), list(makeSymbol("*IGNORE-BREAKS?*"), T), list(makeSymbol("*SILENT-PROGRESS?*"), T), list(makeSymbol("*CONTINUE-CERROR?*"), T), list(makeSymbol("*STANDARD-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*ERROR-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeKeyword("CYC"))) });

    private static final SubLSymbol TASK_PROCESSOR_REQUEST = makeSymbol("TASK-PROCESSOR-REQUEST");

    static private final SubLList $list28 = list(makeSymbol("REQUEST"), makeSymbol("ID"), makeSymbol("PRIORITY"), makeSymbol("REQUESTOR"), makeSymbol("CLIENT-BINDINGS"), makeSymbol("&OPTIONAL"), makeSymbol("UUID-STRING"));

    private static final SubLString $str29$_param_REQUEST__consp_for_evaluat = makeString("@param REQUEST; consp for evaluation\n   @param ID; integerp\n   @param PRIORITY; intergerp\n   @param REQUESTOR; stringp\n   @param CLIENT-BINDINGS; consp of (var value) pairs\n   @param UUID-STRING; identifies the client to which the response will be sent\n   Submits the REQUEST form to the task request queue with ID, PRIORITY,\n   REQUESTOR, BINDINGS and OUT-STREAM.");

    private static final SubLList $list30 = list(list(makeSymbol("REQUEST"), makeSymbol("CONSP")), list(makeSymbol("ID"), makeSymbol("INTEGERP")), list(makeSymbol("PRIORITY"), makeSymbol("INTEGERP")), list(makeSymbol("REQUESTOR"), makeSymbol("STRINGP")), list(makeSymbol("CLIENT-BINDINGS"), makeSymbol("LISTP")));

    private static final SubLList $list31 = list(NIL);

    public static final SubLObject cfasl_externalization_modeP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $perform_cfasl_externalization$.getDynamicValue(thread);
        }
    }

    public static SubLObject cfasl_externalization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $perform_cfasl_externalization$.getDynamicValue(thread);
    }

    /**
     * Switch this connection into external setting.
     */
    @LispMethod(comment = "Switch this connection into external setting.")
    public static final SubLObject cfasl_set_mode_externalized_alt() {
        $perform_cfasl_externalization$.setDynamicValue(T);
        return com.cyc.cycjava.cycl.cfasl_kernel.cfasl_externalization_modeP();
    }

    /**
     * Switch this connection into external setting.
     */
    @LispMethod(comment = "Switch this connection into external setting.")
    public static SubLObject cfasl_set_mode_externalized() {
        $perform_cfasl_externalization$.setDynamicValue(T);
        return cfasl_externalization_modeP();
    }

    /**
     * Switch this connection into internalized setting.
     */
    @LispMethod(comment = "Switch this connection into internalized setting.")
    public static final SubLObject cfasl_set_mode_internalized_alt() {
        $perform_cfasl_externalization$.setDynamicValue(NIL);
        return com.cyc.cycjava.cycl.cfasl_kernel.cfasl_externalization_modeP();
    }

    /**
     * Switch this connection into internalized setting.
     */
    @LispMethod(comment = "Switch this connection into internalized setting.")
    public static SubLObject cfasl_set_mode_internalized() {
        $perform_cfasl_externalization$.setDynamicValue(NIL);
        return cfasl_externalization_modeP();
    }

    public static final SubLObject cfasl_server_handler_alt(SubLObject in_stream, SubLObject out_stream) {
        return com.cyc.cycjava.cycl.cfasl_kernel.cfasl_server_top_level(in_stream, out_stream);
    }

    public static SubLObject cfasl_server_handler(final SubLObject in_stream, final SubLObject out_stream) {
        return cfasl_server_top_level(in_stream, out_stream);
    }

    public static final SubLObject cfasl_server_top_level_alt(SubLObject in_stream, SubLObject out_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols(NIL);
                        {
                            SubLObject _prev_bind_0_1 = $perform_cfasl_externalization$.currentBinding(thread);
                            SubLObject _prev_bind_1 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
                            SubLObject _prev_bind_2 = api_kernel.$default_api_input_protocol$.currentBinding(thread);
                            SubLObject _prev_bind_3 = api_kernel.$default_api_validate_method$.currentBinding(thread);
                            SubLObject _prev_bind_4 = api_kernel.$default_api_output_protocol$.currentBinding(thread);
                            SubLObject _prev_bind_5 = $cfasl_kernel_standard_output$.currentBinding(thread);
                            try {
                                $perform_cfasl_externalization$.bind(NIL, thread);
                                api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                                api_kernel.$default_api_input_protocol$.bind(READ_CFASL_REQUEST, thread);
                                api_kernel.$default_api_validate_method$.bind(VALIDATE_CFASL_REQUEST, thread);
                                api_kernel.$default_api_output_protocol$.bind(SEND_CFASL_RESULT, thread);
                                $cfasl_kernel_standard_output$.bind(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
                                ans = api_kernel.api_server_top_level(in_stream, out_stream);
                            } finally {
                                $cfasl_kernel_standard_output$.rebind(_prev_bind_5, thread);
                                api_kernel.$default_api_output_protocol$.rebind(_prev_bind_4, thread);
                                api_kernel.$default_api_validate_method$.rebind(_prev_bind_3, thread);
                                api_kernel.$default_api_input_protocol$.rebind(_prev_bind_2, thread);
                                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_1, thread);
                                $perform_cfasl_externalization$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
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

    /**
     * Explicitly quit this cfasl connection.
     */
    @LispMethod(comment = "Explicitly quit this cfasl connection.")
    public static final SubLObject cfasl_quit_alt() {
        return api_kernel.api_quit();
    }

    /**
     * Explicitly quit this cfasl connection.
     */
    @LispMethod(comment = "Explicitly quit this cfasl connection.")
    public static SubLObject cfasl_quit() {
        return api_kernel.api_quit();
    }

    /**
     * Returns the local cfasl-port according to defined system parameters.
     */
    @LispMethod(comment = "Returns the local cfasl-port according to defined system parameters.")
    public static final SubLObject cfasl_port_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$cfasl_port_offset$.getDynamicValue(thread));
        }
    }

    /**
     * Returns the local cfasl-port according to defined system parameters.
     */
    @LispMethod(comment = "Returns the local cfasl-port according to defined system parameters.")
    public static SubLObject cfasl_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$cfasl_port_offset$.getDynamicValue(thread));
    }

    public static final SubLObject read_cfasl_request_alt(SubLObject in_stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        {
            SubLObject request = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            request = cfasl_input(in_stream, eof_error_p, eof_value);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_message) {
            }
            return request;
        }
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

    public static final SubLObject validate_cfasl_request_alt(SubLObject api_request) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == list_utilities.proper_list_p(api_request)) {
                Errors.error($str_alt8$Invalid_API_Request___S_is_not_a_, api_request);
            }
            if (!((NIL != eval_in_api.$eval_in_apiP$.getDynamicValue(thread)) || (NIL != api_kernel.valid_api_function_symbol(api_request.first())))) {
                Errors.error($str_alt9$Invalid_API_Request___S_is_not_a_, api_request.first());
            }
            return T;
        }
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

    public static final SubLObject send_cfasl_result_alt(SubLObject out_stream, SubLObject cfasl_result, SubLObject error) {
        if (error == UNPROVIDED) {
            error = NIL;
        }
        if (NIL != error) {
            cfasl_result = com.cyc.cycjava.cycl.cfasl_kernel.make_cfasl_api_exception(cfasl_result);
        }
        cfasl_output(sublisp_null(error), out_stream);
        if (NIL != com.cyc.cycjava.cycl.cfasl_kernel.cfasl_externalization_modeP()) {
            cfasl_output_externalized(cfasl_result, out_stream);
        } else {
            cfasl_output(cfasl_result, out_stream);
        }
        force_output(out_stream);
        return cfasl_result;
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

    /**
     * Return T iff OBJECT represents an CFASL API exception object.
     */
    @LispMethod(comment = "Return T iff OBJECT represents an CFASL API exception object.")
    public static final SubLObject cfasl_api_exception_p_alt(SubLObject v_object) {
        return makeBoolean(((((v_object.isCons() && (CYC_EXCEPTION == v_object.first())) && (NIL != list_utilities.proper_list_p(v_object))) && THREE_INTEGER.numE(length(v_object))) && ($MESSAGE == second(v_object))) && third(v_object).isString());
    }

    /**
     * Return T iff OBJECT represents an CFASL API exception object.
     */
    @LispMethod(comment = "Return T iff OBJECT represents an CFASL API exception object.")
    public static SubLObject cfasl_api_exception_p(final SubLObject v_object) {
        return makeBoolean(((((v_object.isCons() && (CYC_EXCEPTION == v_object.first())) && (NIL != list_utilities.proper_list_p(v_object))) && THREE_INTEGER.numE(length(v_object))) && ($MESSAGE == second(v_object))) && third(v_object).isString());
    }

    public static final SubLObject make_cfasl_api_exception_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        return list(CYC_EXCEPTION, $MESSAGE, string);
    }

    public static SubLObject make_cfasl_api_exception(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        return list(CYC_EXCEPTION, $MESSAGE, string);
    }

    public static final SubLObject cfasl_api_exception_message_alt(SubLObject cfasl_api_exception) {
        return third(cfasl_api_exception);
    }

    public static SubLObject cfasl_api_exception_message(final SubLObject cfasl_api_exception) {
        return third(cfasl_api_exception);
    }

    /**
     * Evaluate API-REQUEST on MACHINE using the CFASL CYC-API server at TCP PORT
     */
    @LispMethod(comment = "Evaluate API-REQUEST on MACHINE using the CFASL CYC-API server at TCP PORT")
    public static final SubLObject cfasl_api_remote_eval_alt(SubLObject api_request, SubLObject machine, SubLObject port) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(machine, STRINGP);
            SubLTrampolineFile.checkType(port, INTEGERP);
            {
                SubLObject result = NIL;
                SubLObject valid = NIL;
                SubLObject channel = NIL;
                try {
                    channel = subl_promotions.open_tcp_stream_with_timeout(machine, port, NIL, $PRIVATE);
                    if (NIL != channel) {
                        thread.resetMultipleValues();
                        {
                            SubLObject result_2 = com.cyc.cycjava.cycl.cfasl_kernel.cfasl_channel_eval_internal(api_request, channel);
                            SubLObject valid_3 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_2;
                            valid = valid_3;
                        }
                        cfasl_output($list_alt15, channel);
                        force_output(channel);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL == valid) {
                    return Errors.error($str_alt16$_A, com.cyc.cycjava.cycl.cfasl_kernel.cfasl_api_exception_message(result));
                }
                return result;
            }
        }
    }

    /**
     * Evaluate API-REQUEST on MACHINE using the CFASL CYC-API server at TCP PORT
     */
    @LispMethod(comment = "Evaluate API-REQUEST on MACHINE using the CFASL CYC-API server at TCP PORT")
    public static SubLObject cfasl_api_remote_eval(final SubLObject api_request, final SubLObject machine, final SubLObject port) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(machine) : "! stringp(machine) " + ("Types.stringp(machine) " + "CommonSymbols.NIL != Types.stringp(machine) ") + machine;
        assert NIL != integerp(port) : "! integerp(port) " + ("Types.integerp(port) " + "CommonSymbols.NIL != Types.integerp(port) ") + port;
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

    /**
     * Evaluate API-REQUEST via the TCP CHANNEL to a CFASL CYC-API.
     */
    @LispMethod(comment = "Evaluate API-REQUEST via the TCP CHANNEL to a CFASL CYC-API.")
    public static final SubLObject cfasl_channel_eval_alt(SubLObject api_request, SubLObject channel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(channel, STREAMP);
            thread.resetMultipleValues();
            {
                SubLObject result = com.cyc.cycjava.cycl.cfasl_kernel.cfasl_channel_eval_internal(api_request, channel);
                SubLObject valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == valid) {
                    return Errors.error($str_alt16$_A, com.cyc.cycjava.cycl.cfasl_kernel.cfasl_api_exception_message(result));
                }
                return result;
            }
        }
    }

    /**
     * Evaluate API-REQUEST via the TCP CHANNEL to a CFASL CYC-API.
     */
    @LispMethod(comment = "Evaluate API-REQUEST via the TCP CHANNEL to a CFASL CYC-API.")
    public static SubLObject cfasl_channel_eval(final SubLObject api_request, final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != streamp(channel) : "! streamp(channel) " + ("Types.streamp(channel) " + "CommonSymbols.NIL != Types.streamp(channel) ") + channel;
        thread.resetMultipleValues();
        final SubLObject result = cfasl_channel_eval_internal(api_request, channel);
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == valid) {
            return Errors.error($str19$Error_evaluating__A___Problem___A, api_request, cfasl_api_exception_message(result));
        }
        return result;
    }

    public static final SubLObject cfasl_channel_eval_internal_alt(SubLObject api_request, SubLObject channel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.cfasl_kernel.cfasl_channel_output(api_request, channel);
            force_output(channel);
            {
                SubLObject valid = com.cyc.cycjava.cycl.cfasl_kernel.cfasl_channel_input(channel, T);
                SubLObject result = com.cyc.cycjava.cycl.cfasl_kernel.cfasl_channel_input(channel, $cfasl_eof_exception$.getDynamicValue(thread));
                return values(result, valid);
            }
        }
    }

    public static SubLObject cfasl_channel_eval_internal(final SubLObject api_request, final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_channel_output(api_request, channel);
        force_output(channel);
        final SubLObject valid = cfasl_channel_input(channel, T);
        final SubLObject result = cfasl_channel_input(channel, $cfasl_eof_exception$.getDynamicValue(thread));
        return values(result, valid);
    }

    public static final SubLObject cfasl_channel_output_alt(SubLObject v_object, SubLObject channel) {
        if (NIL != cfasl_channel_externalizedP()) {
            return cfasl_output_externalized(v_object, channel);
        } else {
            return cfasl_output(v_object, channel);
        }
    }

    public static SubLObject cfasl_channel_output(final SubLObject v_object, final SubLObject channel) {
        if (NIL != cfasl_channel_externalizedP()) {
            return cfasl_output_externalized(v_object, channel);
        }
        return cfasl_output(v_object, channel);
    }

    public static final SubLObject cfasl_channel_input_alt(SubLObject channel, SubLObject eof_value) {
        return cfasl_input(channel, NIL, eof_value);
    }

    public static SubLObject cfasl_channel_input(final SubLObject channel, final SubLObject eof_value) {
        return cfasl_input(channel, NIL, eof_value);
    }

    /**
     *
     *
     * @param REQUEST;
     * 		consp for evaluation
     * @param ID;
    integerp
     * 		
     * @param PRIORITY;
    intergerp
     * 		
     * @param REQUESTOR;
    stringp
     * 		
     * @param CLIENT-BINDINGS;
     * 		consp of (var value) pairs
     * @param UUID-STRING;
     * 		identifies the client to which the response will be sent
     * 		Submits the REQUEST form to the task request queue with ID, PRIORITY,
     * 		REQUESTOR, BINDINGS and OUT-STREAM.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tconsp for evaluation\r\n@param ID;\nintegerp\r\n\t\t\r\n@param PRIORITY;\nintergerp\r\n\t\t\r\n@param REQUESTOR;\nstringp\r\n\t\t\r\n@param CLIENT-BINDINGS;\r\n\t\tconsp of (var value) pairs\r\n@param UUID-STRING;\r\n\t\tidentifies the client to which the response will be sent\r\n\t\tSubmits the REQUEST form to the task request queue with ID, PRIORITY,\r\n\t\tREQUESTOR, BINDINGS and OUT-STREAM.")
    public static final SubLObject task_processor_request_alt(SubLObject request, SubLObject id, SubLObject priority, SubLObject requestor, SubLObject client_bindings, SubLObject uuid_string) {
        if (uuid_string == UNPROVIDED) {
            uuid_string = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(request, CONSP);
            SubLTrampolineFile.checkType(id, INTEGERP);
            SubLTrampolineFile.checkType(priority, INTEGERP);
            SubLTrampolineFile.checkType(requestor, STRINGP);
            SubLTrampolineFile.checkType(client_bindings, LISTP);
            {
                SubLObject server_bindings = listS($list_alt21, list($the_cyclist$, operation_communication.the_cyclist()), list($ke_purpose$, api_control_vars.$default_ke_purpose$.getDynamicValue(thread)), $list_alt24);
                task_processor.api_task_processor_request(request, id, priority, requestor, append(server_bindings, client_bindings), uuid_string);
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param REQUEST;
     * 		consp for evaluation
     * @param ID;
    integerp
     * 		
     * @param PRIORITY;
    intergerp
     * 		
     * @param REQUESTOR;
    stringp
     * 		
     * @param CLIENT-BINDINGS;
     * 		consp of (var value) pairs
     * @param UUID-STRING;
     * 		identifies the client to which the response will be sent
     * 		Submits the REQUEST form to the task request queue with ID, PRIORITY,
     * 		REQUESTOR, BINDINGS and OUT-STREAM.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tconsp for evaluation\r\n@param ID;\nintegerp\r\n\t\t\r\n@param PRIORITY;\nintergerp\r\n\t\t\r\n@param REQUESTOR;\nstringp\r\n\t\t\r\n@param CLIENT-BINDINGS;\r\n\t\tconsp of (var value) pairs\r\n@param UUID-STRING;\r\n\t\tidentifies the client to which the response will be sent\r\n\t\tSubmits the REQUEST form to the task request queue with ID, PRIORITY,\r\n\t\tREQUESTOR, BINDINGS and OUT-STREAM.")
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

    static private final SubLString $str_alt8$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a proper list");

    static private final SubLString $str_alt9$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a valid API function symbol");

    static private final SubLList $list_alt15 = list(makeSymbol("CFASL-QUIT"));

    static private final SubLString $str_alt16$_A = makeString("~A");

    static private final SubLList $list_alt21 = list(makeSymbol("*USE-LOCAL-QUEUE?*"), NIL);

    public static SubLObject declare_cfasl_kernel_file() {
        declareFunction("cfasl_externalization_modeP", "CFASL-EXTERNALIZATION-MODE?", 0, 0, false);
        declareFunction("cfasl_set_mode_externalized", "CFASL-SET-MODE-EXTERNALIZED", 0, 0, false);
        declareFunction("cfasl_set_mode_internalized", "CFASL-SET-MODE-INTERNALIZED", 0, 0, false);
        declareFunction("cfasl_server_handler", "CFASL-SERVER-HANDLER", 2, 0, false);
        declareFunction("cfasl_server_top_level", "CFASL-SERVER-TOP-LEVEL", 2, 0, false);
        declareFunction("cfasl_fake_server_loop_one_step", "CFASL-FAKE-SERVER-LOOP-ONE-STEP", 2, 0, false);
        declareFunction("cfasl_quit", "CFASL-QUIT", 0, 0, false);
        declareFunction("cfasl_port", "CFASL-PORT", 0, 0, false);
        declareFunction("read_cfasl_request", "READ-CFASL-REQUEST", 1, 2, false);
        declareFunction("validate_cfasl_request", "VALIDATE-CFASL-REQUEST", 1, 0, false);
        declareFunction("send_cfasl_result", "SEND-CFASL-RESULT", 2, 1, false);
        declareFunction("cfasl_api_exception_p", "CFASL-API-EXCEPTION-P", 1, 0, false);
        declareFunction("make_cfasl_api_exception", "MAKE-CFASL-API-EXCEPTION", 1, 0, false);
        declareFunction("cfasl_api_exception_message", "CFASL-API-EXCEPTION-MESSAGE", 1, 0, false);
        declareFunction("cfasl_api_remote_eval", "CFASL-API-REMOTE-EVAL", 3, 0, false);
        declareFunction("cfasl_channel_eval", "CFASL-CHANNEL-EVAL", 2, 0, false);
        declareFunction("cfasl_channel_eval_internal", "CFASL-CHANNEL-EVAL-INTERNAL", 2, 0, false);
        declareFunction("cfasl_channel_output", "CFASL-CHANNEL-OUTPUT", 2, 0, false);
        declareFunction("cfasl_channel_input", "CFASL-CHANNEL-INPUT", 2, 0, false);
        declareFunction("task_processor_request", "TASK-PROCESSOR-REQUEST", 5, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt24 = list(new SubLObject[]{ list(makeSymbol("*EVAL-IN-API-ENV*"), NIL), list(makeSymbol("*EVAL-IN-API-LEVEL*"), ZERO_INTEGER), list(makeSymbol("*EVAL-IN-API-TRACED-FNS*"), NIL), list(makeSymbol("*EVAL-IN-API-TRACE-LOG*"), makeString("")), list(makeSymbol("*IGNORE-WARNS?*"), T), list(makeSymbol("*IGNORE-BREAKS?*"), T), list(makeSymbol("*SILENT-PROGRESS?*"), T), list(makeSymbol("*CONTINUE-CERROR?*"), T), list(makeSymbol("*STANDARD-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*ERROR-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeKeyword("CYC"))) });

    static private final SubLList $list_alt26 = list(makeSymbol("REQUEST"), makeSymbol("ID"), makeSymbol("PRIORITY"), makeSymbol("REQUESTOR"), makeSymbol("CLIENT-BINDINGS"), makeSymbol("&OPTIONAL"), makeSymbol("UUID-STRING"));

    static private final SubLString $str_alt27$_param_REQUEST__consp_for_evaluat = makeString("@param REQUEST; consp for evaluation\n   @param ID; integerp\n   @param PRIORITY; intergerp\n   @param REQUESTOR; stringp\n   @param CLIENT-BINDINGS; consp of (var value) pairs\n   @param UUID-STRING; identifies the client to which the response will be sent\n   Submits the REQUEST form to the task request queue with ID, PRIORITY,\n   REQUESTOR, BINDINGS and OUT-STREAM.");

    static private final SubLList $list_alt28 = list(list(makeSymbol("REQUEST"), makeSymbol("CONSP")), list(makeSymbol("ID"), makeSymbol("INTEGERP")), list(makeSymbol("PRIORITY"), makeSymbol("INTEGERP")), list(makeSymbol("REQUESTOR"), makeSymbol("STRINGP")), list(makeSymbol("CLIENT-BINDINGS"), makeSymbol("LISTP")));

    public static SubLObject init_cfasl_kernel_file() {
        defparameter("*PERFORM-CFASL-EXTERNALIZATION*", NIL);
        defparameter("*CFASL-KERNEL-STANDARD-OUTPUT*", NIL);
        defparameter("*CFASL-EOF-EXCEPTION*", make_cfasl_api_exception($$$EOF_occurred_on_CFASL_API_stream));
        return NIL;
    }

    static private final SubLList $list_alt29 = list(NIL);

    public static final SubLObject setup_cfasl_kernel_file_alt() {
        tcp_server_utilities.register_tcp_server_type($CFASL, CFASL_SERVER_HANDLER, $BINARY);
        register_cyc_api_function(TASK_PROCESSOR_REQUEST, $list_alt26, $str_alt27$_param_REQUEST__consp_for_evaluat, $list_alt28, $list_alt29);
        return NIL;
    }

    public static SubLObject setup_cfasl_kernel_file() {
        if (SubLFiles.USE_V1) {
            tcp_server_utilities.register_tcp_server_type($CFASL, CFASL_SERVER_HANDLER, $BINARY);
            register_external_symbol(CFASL_FAKE_SERVER_LOOP_ONE_STEP);
            register_cyc_api_function(TASK_PROCESSOR_REQUEST, $list28, $str29$_param_REQUEST__consp_for_evaluat, $list30, $list31);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(TASK_PROCESSOR_REQUEST, $list_alt26, $str_alt27$_param_REQUEST__consp_for_evaluat, $list_alt28, $list_alt29);
        }
        return NIL;
    }

    public static SubLObject setup_cfasl_kernel_file_Previous() {
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

    
}

/**
 * Total time: 101 ms
 */
