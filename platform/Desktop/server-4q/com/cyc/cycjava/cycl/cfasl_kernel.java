package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cfasl_kernel extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cfasl_kernel";
    public static final String myFingerPrint = "e2de2c6f86d83f95c33a88aed69fe4ac087421dffabbdcc41a585c4a7f5d9186";
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 788L)
    public static SubLSymbol $perform_cfasl_externalization$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 1516L)
    public static SubLSymbol $cfasl_kernel_standard_output$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 6455L)
    private static SubLSymbol $cfasl_eof_exception$;
    private static final SubLSymbol $kw0$CFASL;
    private static final SubLSymbol $sym1$CFASL_SERVER_HANDLER;
    private static final SubLSymbol $kw2$BINARY;
    private static final SubLSymbol $sym3$READ_CFASL_REQUEST;
    private static final SubLSymbol $sym4$VALIDATE_CFASL_REQUEST;
    private static final SubLSymbol $sym5$SEND_CFASL_RESULT;
    private static final SubLSymbol $sym6$CFASL_FAKE_SERVER_LOOP_ONE_STEP;
    private static final SubLSymbol $kw7$EOF;
    private static final SubLSymbol $sym8$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str9$Invalid_API_Request___S_is_not_a_;
    private static final SubLString $str10$Invalid_API_Request___S_is_not_a_;
    private static final SubLSymbol $sym11$CYC_EXCEPTION;
    private static final SubLSymbol $kw12$MESSAGE;
    private static final SubLSymbol $sym13$STRINGP;
    private static final SubLSymbol $sym14$INTEGERP;
    private static final SubLSymbol $kw15$PRIVATE;
    private static final SubLList $list16;
    private static final SubLString $str17$_A;
    private static final SubLSymbol $sym18$STREAMP;
    private static final SubLString $str19$Error_evaluating__A___Problem___A;
    private static final SubLString $str20$EOF_occurred_on_CFASL_API_stream;
    private static final SubLSymbol $sym21$CONSP;
    private static final SubLSymbol $sym22$LISTP;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$_THE_CYCLIST_;
    private static final SubLSymbol $sym25$_KE_PURPOSE_;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$TASK_PROCESSOR_REQUEST;
    private static final SubLList $list28;
    private static final SubLString $str29$_param_REQUEST__consp_for_evaluat;
    private static final SubLList $list30;
    private static final SubLList $list31;
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 911L)
    public static SubLObject cfasl_externalization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cfasl_kernel.$perform_cfasl_externalization$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 999L)
    public static SubLObject cfasl_set_mode_externalized() {
        cfasl_kernel.$perform_cfasl_externalization$.setDynamicValue((SubLObject)cfasl_kernel.T);
        return cfasl_externalization_modeP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 1179L)
    public static SubLObject cfasl_set_mode_internalized() {
        cfasl_kernel.$perform_cfasl_externalization$.setDynamicValue((SubLObject)cfasl_kernel.NIL);
        return cfasl_externalization_modeP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 1365L)
    public static SubLObject cfasl_server_handler(final SubLObject in_stream, final SubLObject out_stream) {
        return cfasl_server_top_level(in_stream, out_stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 1652L)
    public static SubLObject cfasl_server_top_level(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)cfasl_kernel.NIL;
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)cfasl_kernel.NIL, thread);
            cfasl.cfasl_set_common_symbols((SubLObject)cfasl_kernel.NIL);
            final SubLObject _prev_bind_0_$1 = cfasl_kernel.$perform_cfasl_externalization$.currentBinding(thread);
            final SubLObject _prev_bind_2 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
            final SubLObject _prev_bind_3 = api_kernel.$default_api_input_protocol$.currentBinding(thread);
            final SubLObject _prev_bind_4 = api_kernel.$default_api_validate_method$.currentBinding(thread);
            final SubLObject _prev_bind_5 = api_kernel.$default_api_output_protocol$.currentBinding(thread);
            final SubLObject _prev_bind_6 = cfasl_kernel.$cfasl_kernel_standard_output$.currentBinding(thread);
            try {
                cfasl_kernel.$perform_cfasl_externalization$.bind((SubLObject)cfasl_kernel.NIL, thread);
                api_control_vars.$generate_readable_fi_results$.bind((SubLObject)cfasl_kernel.NIL, thread);
                api_kernel.$default_api_input_protocol$.bind((SubLObject)cfasl_kernel.$sym3$READ_CFASL_REQUEST, thread);
                api_kernel.$default_api_validate_method$.bind((SubLObject)cfasl_kernel.$sym4$VALIDATE_CFASL_REQUEST, thread);
                api_kernel.$default_api_output_protocol$.bind((SubLObject)cfasl_kernel.$sym5$SEND_CFASL_RESULT, thread);
                cfasl_kernel.$cfasl_kernel_standard_output$.bind(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
                ans = api_kernel.api_server_top_level(in_stream, out_stream);
            }
            finally {
                cfasl_kernel.$cfasl_kernel_standard_output$.rebind(_prev_bind_6, thread);
                api_kernel.$default_api_output_protocol$.rebind(_prev_bind_5, thread);
                api_kernel.$default_api_validate_method$.rebind(_prev_bind_4, thread);
                api_kernel.$default_api_input_protocol$.rebind(_prev_bind_3, thread);
                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_2, thread);
                cfasl_kernel.$perform_cfasl_externalization$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 2288L)
    public static SubLObject cfasl_fake_server_loop_one_step(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)cfasl_kernel.NIL, thread);
            cfasl.cfasl_set_common_symbols((SubLObject)cfasl_kernel.NIL);
            final SubLObject _prev_bind_0_$2 = cfasl_kernel.$perform_cfasl_externalization$.currentBinding(thread);
            final SubLObject _prev_bind_2 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
            final SubLObject _prev_bind_3 = api_kernel.$default_api_input_protocol$.currentBinding(thread);
            final SubLObject _prev_bind_4 = api_kernel.$default_api_validate_method$.currentBinding(thread);
            final SubLObject _prev_bind_5 = api_kernel.$default_api_output_protocol$.currentBinding(thread);
            final SubLObject _prev_bind_6 = cfasl_kernel.$cfasl_kernel_standard_output$.currentBinding(thread);
            try {
                cfasl_kernel.$perform_cfasl_externalization$.bind((SubLObject)cfasl_kernel.NIL, thread);
                api_control_vars.$generate_readable_fi_results$.bind((SubLObject)cfasl_kernel.NIL, thread);
                api_kernel.$default_api_input_protocol$.bind((SubLObject)cfasl_kernel.$sym3$READ_CFASL_REQUEST, thread);
                api_kernel.$default_api_validate_method$.bind((SubLObject)cfasl_kernel.$sym4$VALIDATE_CFASL_REQUEST, thread);
                api_kernel.$default_api_output_protocol$.bind((SubLObject)cfasl_kernel.$sym5$SEND_CFASL_RESULT, thread);
                cfasl_kernel.$cfasl_kernel_standard_output$.bind(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
                api_kernel.api_fake_server_loop_one_step(in_stream, out_stream);
            }
            finally {
                cfasl_kernel.$cfasl_kernel_standard_output$.rebind(_prev_bind_6, thread);
                api_kernel.$default_api_output_protocol$.rebind(_prev_bind_5, thread);
                api_kernel.$default_api_validate_method$.rebind(_prev_bind_4, thread);
                api_kernel.$default_api_input_protocol$.rebind(_prev_bind_3, thread);
                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_2, thread);
                cfasl_kernel.$perform_cfasl_externalization$.rebind(_prev_bind_0_$2, thread);
            }
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cfasl_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 2944L)
    public static SubLObject cfasl_quit() {
        return api_kernel.api_quit();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 3037L)
    public static SubLObject cfasl_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$cfasl_port_offset$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 3189L)
    public static SubLObject read_cfasl_request(final SubLObject in_stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (eof_error_p == cfasl_kernel.UNPROVIDED) {
            eof_error_p = (SubLObject)cfasl_kernel.T;
        }
        if (eof_value == cfasl_kernel.UNPROVIDED) {
            eof_value = (SubLObject)cfasl_kernel.$kw7$EOF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject request = (SubLObject)cfasl_kernel.NIL;
        SubLObject error_message = (SubLObject)cfasl_kernel.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)cfasl_kernel.$sym8$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    request = cfasl.cfasl_input(in_stream, eof_error_p, eof_value);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)cfasl_kernel.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (cfasl_kernel.NIL != error_message) {}
        return request;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 3950L)
    public static SubLObject validate_cfasl_request(final SubLObject api_request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cfasl_kernel.NIL == list_utilities.proper_list_p(api_request)) {
            Errors.error((SubLObject)cfasl_kernel.$str9$Invalid_API_Request___S_is_not_a_, api_request);
        }
        if (cfasl_kernel.NIL == eval_in_api.$eval_in_apiP$.getDynamicValue(thread) && cfasl_kernel.NIL == api_kernel.valid_api_function_symbol(api_request.first())) {
            Errors.error((SubLObject)cfasl_kernel.$str10$Invalid_API_Request___S_is_not_a_, api_request.first());
        }
        return (SubLObject)cfasl_kernel.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 4380L)
    public static SubLObject send_cfasl_result(final SubLObject out_stream, SubLObject cfasl_result, SubLObject error) {
        if (error == cfasl_kernel.UNPROVIDED) {
            error = (SubLObject)cfasl_kernel.NIL;
        }
        if (cfasl_kernel.NIL != error) {
            cfasl_result = make_cfasl_api_exception(cfasl_result);
        }
        cfasl.cfasl_output(Types.sublisp_null(error), out_stream);
        if (cfasl_kernel.NIL != cfasl_externalization_modeP()) {
            cfasl.cfasl_output_externalized(cfasl_result, out_stream);
        }
        else {
            cfasl.cfasl_output(cfasl_result, out_stream);
        }
        streams_high.force_output(out_stream);
        return cfasl_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 4781L)
    public static SubLObject cfasl_api_exception_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && cfasl_kernel.$sym11$CYC_EXCEPTION == v_object.first() && cfasl_kernel.NIL != list_utilities.proper_list_p(v_object) && cfasl_kernel.THREE_INTEGER.numE(Sequences.length(v_object)) && cfasl_kernel.$kw12$MESSAGE == conses_high.second(v_object) && conses_high.third(v_object).isString());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 5162L)
    public static SubLObject make_cfasl_api_exception(final SubLObject string) {
        assert cfasl_kernel.NIL != Types.stringp(string) : string;
        return (SubLObject)ConsesLow.list((SubLObject)cfasl_kernel.$sym11$CYC_EXCEPTION, (SubLObject)cfasl_kernel.$kw12$MESSAGE, string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 5290L)
    public static SubLObject cfasl_api_exception_message(final SubLObject cfasl_api_exception) {
        return conses_high.third(cfasl_api_exception);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 5394L)
    public static SubLObject cfasl_api_remote_eval(final SubLObject api_request, final SubLObject machine, final SubLObject port) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cfasl_kernel.NIL != Types.stringp(machine) : machine;
        assert cfasl_kernel.NIL != Types.integerp(port) : port;
        SubLObject result = (SubLObject)cfasl_kernel.NIL;
        SubLObject valid = (SubLObject)cfasl_kernel.NIL;
        SubLObject channel = (SubLObject)cfasl_kernel.NIL;
        try {
            channel = subl_promotions.open_tcp_stream_with_timeout(machine, port, (SubLObject)cfasl_kernel.NIL, (SubLObject)cfasl_kernel.$kw15$PRIVATE);
            if (cfasl_kernel.NIL != subl_macro_promotions.validate_tcp_connection(channel, machine, port)) {
                thread.resetMultipleValues();
                final SubLObject result_$3 = cfasl_channel_eval_internal(api_request, channel);
                final SubLObject valid_$4 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$3;
                valid = valid_$4;
                cfasl.cfasl_output((SubLObject)cfasl_kernel.$list16, channel);
                streams_high.force_output(channel);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_kernel.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (cfasl_kernel.NIL != channel) {
                    streams_high.close(channel, (SubLObject)cfasl_kernel.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        if (cfasl_kernel.NIL == valid) {
            return Errors.error((SubLObject)cfasl_kernel.$str17$_A, cfasl_api_exception_message(result));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 6063L)
    public static SubLObject cfasl_channel_eval(final SubLObject api_request, final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cfasl_kernel.NIL != Types.streamp(channel) : channel;
        thread.resetMultipleValues();
        final SubLObject result = cfasl_channel_eval_internal(api_request, channel);
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cfasl_kernel.NIL == valid) {
            return Errors.error((SubLObject)cfasl_kernel.$str19$Error_evaluating__A___Problem___A, api_request, cfasl_api_exception_message(result));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 6585L)
    public static SubLObject cfasl_channel_eval_internal(final SubLObject api_request, final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_channel_output(api_request, channel);
        streams_high.force_output(channel);
        final SubLObject valid = cfasl_channel_input(channel, (SubLObject)cfasl_kernel.T);
        final SubLObject result = cfasl_channel_input(channel, cfasl_kernel.$cfasl_eof_exception$.getDynamicValue(thread));
        return Values.values(result, valid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 7217L)
    public static SubLObject cfasl_channel_output(final SubLObject v_object, final SubLObject channel) {
        if (cfasl_kernel.NIL != cfasl.cfasl_channel_externalizedP()) {
            return cfasl.cfasl_output_externalized(v_object, channel);
        }
        return cfasl.cfasl_output(v_object, channel);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 7410L)
    public static SubLObject cfasl_channel_input(final SubLObject channel, final SubLObject eof_value) {
        return cfasl.cfasl_input(channel, (SubLObject)cfasl_kernel.NIL, eof_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-kernel.lisp", position = 7512L)
    public static SubLObject task_processor_request(final SubLObject request, final SubLObject id, final SubLObject priority, final SubLObject requestor, final SubLObject client_bindings, SubLObject uuid_string) {
        if (uuid_string == cfasl_kernel.UNPROVIDED) {
            uuid_string = (SubLObject)cfasl_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(request, cfasl_kernel.$sym21$CONSP);
        enforceType(id, cfasl_kernel.$sym14$INTEGERP);
        enforceType(priority, cfasl_kernel.$sym14$INTEGERP);
        enforceType(requestor, cfasl_kernel.$sym13$STRINGP);
        enforceType(client_bindings, cfasl_kernel.$sym22$LISTP);
        final SubLObject server_bindings = (SubLObject)ConsesLow.listS((SubLObject)cfasl_kernel.$list23, (SubLObject)ConsesLow.list((SubLObject)cfasl_kernel.$sym24$_THE_CYCLIST_, operation_communication.the_cyclist()), (SubLObject)ConsesLow.list((SubLObject)cfasl_kernel.$sym25$_KE_PURPOSE_, api_control_vars.$default_ke_purpose$.getDynamicValue(thread)), (SubLObject)cfasl_kernel.$list26);
        task_processor.api_task_processor_request(request, id, priority, requestor, ConsesLow.append(server_bindings, client_bindings), uuid_string);
        return (SubLObject)cfasl_kernel.NIL;
    }
    
    public static SubLObject declare_cfasl_kernel_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_externalization_modeP", "CFASL-EXTERNALIZATION-MODE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_set_mode_externalized", "CFASL-SET-MODE-EXTERNALIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_set_mode_internalized", "CFASL-SET-MODE-INTERNALIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_server_handler", "CFASL-SERVER-HANDLER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_server_top_level", "CFASL-SERVER-TOP-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_fake_server_loop_one_step", "CFASL-FAKE-SERVER-LOOP-ONE-STEP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_quit", "CFASL-QUIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_port", "CFASL-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "read_cfasl_request", "READ-CFASL-REQUEST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "validate_cfasl_request", "VALIDATE-CFASL-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "send_cfasl_result", "SEND-CFASL-RESULT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_api_exception_p", "CFASL-API-EXCEPTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "make_cfasl_api_exception", "MAKE-CFASL-API-EXCEPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_api_exception_message", "CFASL-API-EXCEPTION-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_api_remote_eval", "CFASL-API-REMOTE-EVAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_channel_eval", "CFASL-CHANNEL-EVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_channel_eval_internal", "CFASL-CHANNEL-EVAL-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_channel_output", "CFASL-CHANNEL-OUTPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "cfasl_channel_input", "CFASL-CHANNEL-INPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_kernel", "task_processor_request", "TASK-PROCESSOR-REQUEST", 5, 1, false);
        return (SubLObject)cfasl_kernel.NIL;
    }
    
    public static SubLObject init_cfasl_kernel_file() {
        cfasl_kernel.$perform_cfasl_externalization$ = SubLFiles.defparameter("*PERFORM-CFASL-EXTERNALIZATION*", (SubLObject)cfasl_kernel.NIL);
        cfasl_kernel.$cfasl_kernel_standard_output$ = SubLFiles.defparameter("*CFASL-KERNEL-STANDARD-OUTPUT*", (SubLObject)cfasl_kernel.NIL);
        cfasl_kernel.$cfasl_eof_exception$ = SubLFiles.defparameter("*CFASL-EOF-EXCEPTION*", make_cfasl_api_exception((SubLObject)cfasl_kernel.$str20$EOF_occurred_on_CFASL_API_stream));
        return (SubLObject)cfasl_kernel.NIL;
    }
    
    public static SubLObject setup_cfasl_kernel_file() {
        tcp_server_utilities.register_tcp_server_type((SubLObject)cfasl_kernel.$kw0$CFASL, (SubLObject)cfasl_kernel.$sym1$CFASL_SERVER_HANDLER, (SubLObject)cfasl_kernel.$kw2$BINARY);
        access_macros.register_external_symbol((SubLObject)cfasl_kernel.$sym6$CFASL_FAKE_SERVER_LOOP_ONE_STEP);
        utilities_macros.register_cyc_api_function((SubLObject)cfasl_kernel.$sym27$TASK_PROCESSOR_REQUEST, (SubLObject)cfasl_kernel.$list28, (SubLObject)cfasl_kernel.$str29$_param_REQUEST__consp_for_evaluat, (SubLObject)cfasl_kernel.$list30, (SubLObject)cfasl_kernel.$list31);
        return (SubLObject)cfasl_kernel.NIL;
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
        me = (SubLFile)new cfasl_kernel();
        cfasl_kernel.$perform_cfasl_externalization$ = null;
        cfasl_kernel.$cfasl_kernel_standard_output$ = null;
        cfasl_kernel.$cfasl_eof_exception$ = null;
        $kw0$CFASL = SubLObjectFactory.makeKeyword("CFASL");
        $sym1$CFASL_SERVER_HANDLER = SubLObjectFactory.makeSymbol("CFASL-SERVER-HANDLER");
        $kw2$BINARY = SubLObjectFactory.makeKeyword("BINARY");
        $sym3$READ_CFASL_REQUEST = SubLObjectFactory.makeSymbol("READ-CFASL-REQUEST");
        $sym4$VALIDATE_CFASL_REQUEST = SubLObjectFactory.makeSymbol("VALIDATE-CFASL-REQUEST");
        $sym5$SEND_CFASL_RESULT = SubLObjectFactory.makeSymbol("SEND-CFASL-RESULT");
        $sym6$CFASL_FAKE_SERVER_LOOP_ONE_STEP = SubLObjectFactory.makeSymbol("CFASL-FAKE-SERVER-LOOP-ONE-STEP");
        $kw7$EOF = SubLObjectFactory.makeKeyword("EOF");
        $sym8$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str9$Invalid_API_Request___S_is_not_a_ = SubLObjectFactory.makeString("Invalid API Request: ~S is not a proper list");
        $str10$Invalid_API_Request___S_is_not_a_ = SubLObjectFactory.makeString("Invalid API Request: ~S is not a valid API function symbol");
        $sym11$CYC_EXCEPTION = SubLObjectFactory.makeSymbol("CYC-EXCEPTION");
        $kw12$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $sym13$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym14$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $kw15$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CFASL-QUIT"));
        $str17$_A = SubLObjectFactory.makeString("~A");
        $sym18$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $str19$Error_evaluating__A___Problem___A = SubLObjectFactory.makeString("Error evaluating ~A~% Problem: ~A");
        $str20$EOF_occurred_on_CFASL_API_stream = SubLObjectFactory.makeString("EOF occurred on CFASL API stream");
        $sym21$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $sym22$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*USE-LOCAL-QUEUE?*"), (SubLObject)cfasl_kernel.NIL);
        $sym24$_THE_CYCLIST_ = SubLObjectFactory.makeSymbol("*THE-CYCLIST*");
        $sym25$_KE_PURPOSE_ = SubLObjectFactory.makeSymbol("*KE-PURPOSE*");
        $list26 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EVAL-IN-API-ENV*"), (SubLObject)cfasl_kernel.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EVAL-IN-API-LEVEL*"), (SubLObject)cfasl_kernel.ZERO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EVAL-IN-API-TRACED-FNS*"), (SubLObject)cfasl_kernel.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EVAL-IN-API-TRACE-LOG*"), (SubLObject)SubLObjectFactory.makeString("")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-WARNS?*"), (SubLObject)cfasl_kernel.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-BREAKS?*"), (SubLObject)cfasl_kernel.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*"), (SubLObject)cfasl_kernel.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONTINUE-CERROR?*"), (SubLObject)cfasl_kernel.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"), (SubLObject)SubLObjectFactory.makeSymbol("*NULL-OUTPUT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ERROR-OUTPUT*"), (SubLObject)SubLObjectFactory.makeSymbol("*NULL-OUTPUT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PACKAGE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-PACKAGE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC"))) });
        $sym27$TASK_PROCESSOR_REQUEST = SubLObjectFactory.makeSymbol("TASK-PROCESSOR-REQUEST");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUEST"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITY"), (SubLObject)SubLObjectFactory.makeSymbol("REQUESTOR"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("UUID-STRING"));
        $str29$_param_REQUEST__consp_for_evaluat = SubLObjectFactory.makeString("@param REQUEST; consp for evaluation\n   @param ID; integerp\n   @param PRIORITY; intergerp\n   @param REQUESTOR; stringp\n   @param CLIENT-BINDINGS; consp of (var value) pairs\n   @param UUID-STRING; identifies the client to which the response will be sent\n   Submits the REQUEST form to the task request queue with ID, PRIORITY,\n   REQUESTOR, BINDINGS and OUT-STREAM.");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUEST"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIORITY"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUESTOR"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLIENT-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $list31 = ConsesLow.list((SubLObject)cfasl_kernel.NIL);
    }
}

/*

	Total time: 101 ms
	
*/