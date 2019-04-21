package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;

import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Main;
import org.globus.cog.abstraction.impl.common.set.SetImpl;
import org.logicmoo.system.JVMImpl;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class api_kernel extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.api_kernel";
    public static final String myFingerPrint = "f2417fd58cb545f73598975cb8e38690c54f3a824663c04fd27f3e248288bd38";
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 1113L)
    private static SubLSymbol $within_api_server$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 1372L)
    public static SubLSymbol $avoid_api_quitP$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 1732L)
    public static SubLSymbol $default_api_input_protocol$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 1912L)
    private static SubLSymbol $api_input_protocol$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 1986L)
    public static SubLSymbol $default_api_validate_method$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 2106L)
    public static SubLSymbol $api_validate_method$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 2265L)
    private static SubLSymbol $default_api_result_method$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 2319L)
    public static SubLSymbol $api_result_method$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 2484L)
    public static SubLSymbol $default_api_output_protocol$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 2603L)
    private static SubLSymbol $api_output_protocol$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 3045L)
    public static SubLSymbol $api_in_stream$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 3198L)
    public static SubLSymbol $api_out_stream$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 6333L)
    private static SubLSymbol $api_input_eof_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 7816L)
    public static SubLSymbol $record_api_messagesP$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 7947L)
    public static SubLSymbol $api_message_sink$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 10466L)
    private static SubLSymbol $api_success_code$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 10513L)
    private static SubLSymbol $api_error_code$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 10901L)
    private static SubLSymbol $new_api_input_protocol$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 11022L)
    private static SubLSymbol $new_api_output_protocol$;
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 13548L)
    private static SubLSymbol $cyc_api_eof_exception$;
    private static final SubLSymbol $kw0$CYC_API;
    private static final SubLSymbol $sym1$API_SERVER_HANDLER;
    private static final SubLSymbol $kw2$TEXT;
    private static final SubLString $str3$CYC;
    private static final SubLSymbol $sym4$DOUBLE_FLOAT;
    private static final SubLSymbol $kw5$API_QUIT;
    private static final SubLSymbol $sym6$API_QUIT;
    private static final SubLString $str7$Explicitly_quit_this_api_connecti;
    private static final SubLSymbol $sym8$DEFAULT_API_INPUT_PROTOCOL;
    private static final SubLSymbol $sym9$DEFAULT_VALIDATE_API_REQUEST;
    private static final SubLSymbol $sym10$DEFAULT_API_OUTPUT_PROTOCOL;
    private static final SubLSymbol $sym11$CLET;
    private static final SubLList $list12;
    private static final SubLString $str13$;
    private static final SubLSymbol $sym14$API_FAKE_SERVER_LOOP_ONE_STEP;
    private static final SubLSymbol $sym15$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym16$TASK_PROCESSOR_REQUEST;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$_API_INPUT_EOF_MARKER_;
    private static final SubLString $str19$API_Input_EOF_Marker;
    private static final SubLString $str20$Invalid_API_Request___S_is_not_a_;
    private static final SubLString $str21$Invalid_API_Request___S_is_not_a_;
    private static final SubLSymbol $sym22$INVALID_CONSTANT_;
    private static final SubLString $str23$___A_is_not_an_existing_constant;
    private static final SubLString $str24$API_request_references_an_invalid;
    private static final SubLSymbol $sym25$GUID_P;
    private static final SubLSymbol $sym26$GUID_TO_STRING;
    private static final SubLInteger $int27$200;
    private static final SubLInteger $int28$500;
    private static final SubLString $str29$_D__S;
    private static final SubLSymbol $sym30$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym31$CONSP;
    private static final SubLSymbol $sym32$STRINGP;
    private static final SubLSymbol $sym33$INTEGERP;
    private static final SubLSymbol $kw34$PRIVATE;
    private static final SubLString $str35$_api_quit__;
    private static final SubLString $str36$_A;
    private static final SubLSymbol $sym37$CYC_API_REMOTE_EVAL;
    private static final SubLList $list38;
    private static final SubLString $str39$Evaluate_API_REQUEST_on_MACHINE_u;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$STREAMP;
    private static final SubLSymbol $kw42$EOF;
    private static final SubLString $str43$_S_;
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 894L)
    public static SubLObject api_server_handler(final SubLObject in_stream, final SubLObject out_stream) {
		boolean wasSetSubLisp = Main.isSubLisp();
		SubLPackage prevPackage = Lisp.getCurrentPackage();
		try
		{
			Main.setSubLisp(true);
			SubLPackage.setCurrentPackage("CYC");
			SubLInputStream inputStream = in_stream.toInputTextStream();
			SubLOutputStream outputStream = out_stream.toOutputStream();
			
			//SystemCurrent.setIn(inputStream.);
			{
				return api_server_top_level(in_stream, out_stream);
			}
		} finally
		{
			SubLPackage.setCurrentPackage(prevPackage);
			Main.setSubLisp(wasSetSubLisp);
		}
    }
        
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 1161L)
    public static SubLObject api_server_top_level(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding(thread);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)api_kernel.$str3$CYC), thread);
            reader.$read_default_float_format$.bind((SubLObject)api_kernel.$sym4$DOUBLE_FLOAT, thread);
            print_high.$print_readably$.bind((SubLObject)api_kernel.NIL, thread);
            reader.$read_eval$.bind((SubLObject)api_kernel.NIL, thread);
            final SubLObject old_priority = Threads.process_priority(Threads.current_process());
            try {
                Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                SubLObject catch_var = (SubLObject)api_kernel.NIL;
                try {
                    thread.throwStack.push(api_kernel.$kw5$API_QUIT);
                    final SubLObject _prev_bind_0_$1 = api_kernel.$within_api_server$.currentBinding(thread);
                    try {
                        api_kernel.$within_api_server$.bind((SubLObject)api_kernel.T, thread);
                        api_server_loop(in_stream, out_stream);
                    }
                    finally {
                        api_kernel.$within_api_server$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)api_kernel.$kw5$API_QUIT);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)api_kernel.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Threads.set_process_priority(Threads.current_process(), old_priority);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            reader.$read_eval$.rebind(_prev_bind_4, thread);
            print_high.$print_readably$.rebind(_prev_bind_3, thread);
            reader.$read_default_float_format$.rebind(_prev_bind_2, thread);
            Packages.$package$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)api_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 1417L)
    public static SubLObject api_quit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (api_kernel.NIL != api_kernel.$within_api_server$.getDynamicValue(thread) && api_kernel.NIL == api_kernel.$avoid_api_quitP$.getDynamicValue(thread)) {
            Dynamic.sublisp_throw((SubLObject)api_kernel.$kw5$API_QUIT, (SubLObject)api_kernel.NIL);
        }
        return (SubLObject)api_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 1633L)
    public static SubLObject abort_api_server_process(final SubLObject process) {
        return Threads.interrupt_process(process, Symbols.symbol_function((SubLObject)api_kernel.$sym6$API_QUIT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 2678L)
    public static SubLObject with_api_protocol_bindings(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)api_kernel.$sym11$CLET, (SubLObject)api_kernel.$list12, ConsesLow.append(body, (SubLObject)api_kernel.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 3295L)
    public static SubLObject api_server_loop(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$ke_purpose$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_kernel.$api_in_stream$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_kernel.$api_out_stream$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_kernel.$api_input_protocol$.currentBinding(thread);
        final SubLObject _prev_bind_7 = api_kernel.$api_validate_method$.currentBinding(thread);
        final SubLObject _prev_bind_8 = api_kernel.$api_result_method$.currentBinding(thread);
        final SubLObject _prev_bind_9 = api_kernel.$api_output_protocol$.currentBinding(thread);
        final SubLObject _prev_bind_10 = eval_in_api.$eval_in_api_env$.currentBinding(thread);
        final SubLObject _prev_bind_11 = eval_in_api.$eval_in_api_traced_fns$.currentBinding(thread);
        final SubLObject _prev_bind_12 = eval_in_api.$eval_in_api_trace_log$.currentBinding(thread);
        final SubLObject _prev_bind_13 = Errors.$ignore_warnsP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = Errors.$ignore_breaksP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = utilities_macros.$silent_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_16 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_17 = StreamsLow.$standard_output$.currentBinding(thread);
        final SubLObject _prev_bind_18 = StreamsLow.$error_output$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)api_kernel.NIL, thread);
            api_control_vars.$the_cyclist$.bind(operation_communication.the_cyclist(), thread);
            api_control_vars.$ke_purpose$.bind(api_control_vars.$default_ke_purpose$.getDynamicValue(thread), thread);
            api_kernel.$api_in_stream$.bind(in_stream, thread);
            api_kernel.$api_out_stream$.bind(out_stream, thread);
            api_kernel.$api_input_protocol$.bind(api_kernel.$default_api_input_protocol$.getDynamicValue(thread), thread);
            api_kernel.$api_validate_method$.bind(api_kernel.$default_api_validate_method$.getDynamicValue(thread), thread);
            api_kernel.$api_result_method$.bind(api_kernel.$default_api_result_method$.getGlobalValue(), thread);
            api_kernel.$api_output_protocol$.bind(api_kernel.$default_api_output_protocol$.getDynamicValue(thread), thread);
            eval_in_api.$eval_in_api_env$.bind(eval_in_api.initialize_eval_in_api_env(), thread);
            eval_in_api.$eval_in_api_traced_fns$.bind((SubLObject)api_kernel.NIL, thread);
            eval_in_api.$eval_in_api_trace_log$.bind((SubLObject)api_kernel.$str13$, thread);
            Errors.$ignore_warnsP$.bind((SubLObject)api_kernel.T, thread);
            Errors.$ignore_breaksP$.bind((SubLObject)api_kernel.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)api_kernel.T, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)api_kernel.T, thread);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            while (true) {
                api_server_one_complete_request(in_stream, out_stream);
            }
        }
        finally {
            StreamsLow.$error_output$.rebind(_prev_bind_18, thread);
            StreamsLow.$standard_output$.rebind(_prev_bind_17, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_16, thread);
            utilities_macros.$silent_progressP$.rebind(_prev_bind_15, thread);
            Errors.$ignore_breaksP$.rebind(_prev_bind_14, thread);
            Errors.$ignore_warnsP$.rebind(_prev_bind_13, thread);
            eval_in_api.$eval_in_api_trace_log$.rebind(_prev_bind_12, thread);
            eval_in_api.$eval_in_api_traced_fns$.rebind(_prev_bind_11, thread);
            eval_in_api.$eval_in_api_env$.rebind(_prev_bind_10, thread);
            api_kernel.$api_output_protocol$.rebind(_prev_bind_9, thread);
            api_kernel.$api_result_method$.rebind(_prev_bind_8, thread);
            api_kernel.$api_validate_method$.rebind(_prev_bind_7, thread);
            api_kernel.$api_input_protocol$.rebind(_prev_bind_6, thread);
            api_kernel.$api_out_stream$.rebind(_prev_bind_5, thread);
            api_kernel.$api_in_stream$.rebind(_prev_bind_4, thread);
            api_control_vars.$ke_purpose$.rebind(_prev_bind_3, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 3790L)
    public static SubLObject api_fake_server_loop_one_step(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_kernel.$within_api_server$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$ke_purpose$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_kernel.$api_in_stream$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_kernel.$api_out_stream$.currentBinding(thread);
        final SubLObject _prev_bind_7 = api_kernel.$api_input_protocol$.currentBinding(thread);
        final SubLObject _prev_bind_8 = api_kernel.$api_validate_method$.currentBinding(thread);
        final SubLObject _prev_bind_9 = api_kernel.$api_result_method$.currentBinding(thread);
        final SubLObject _prev_bind_10 = api_kernel.$api_output_protocol$.currentBinding(thread);
        final SubLObject _prev_bind_11 = eval_in_api.$eval_in_api_env$.currentBinding(thread);
        final SubLObject _prev_bind_12 = eval_in_api.$eval_in_api_traced_fns$.currentBinding(thread);
        final SubLObject _prev_bind_13 = eval_in_api.$eval_in_api_trace_log$.currentBinding(thread);
        final SubLObject _prev_bind_14 = Errors.$ignore_warnsP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = Errors.$ignore_breaksP$.currentBinding(thread);
        final SubLObject _prev_bind_16 = utilities_macros.$silent_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_17 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_18 = StreamsLow.$standard_output$.currentBinding(thread);
        final SubLObject _prev_bind_19 = StreamsLow.$error_output$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)api_kernel.NIL, thread);
            api_control_vars.$the_cyclist$.bind(operation_communication.the_cyclist(), thread);
            api_kernel.$within_api_server$.bind((SubLObject)api_kernel.T, thread);
            api_control_vars.$ke_purpose$.bind(api_control_vars.$default_ke_purpose$.getDynamicValue(thread), thread);
            api_kernel.$api_in_stream$.bind(in_stream, thread);
            api_kernel.$api_out_stream$.bind(out_stream, thread);
            api_kernel.$api_input_protocol$.bind(api_kernel.$default_api_input_protocol$.getDynamicValue(thread), thread);
            api_kernel.$api_validate_method$.bind(api_kernel.$default_api_validate_method$.getDynamicValue(thread), thread);
            api_kernel.$api_result_method$.bind(api_kernel.$default_api_result_method$.getGlobalValue(), thread);
            api_kernel.$api_output_protocol$.bind(api_kernel.$default_api_output_protocol$.getDynamicValue(thread), thread);
            eval_in_api.$eval_in_api_env$.bind(eval_in_api.initialize_eval_in_api_env(), thread);
            eval_in_api.$eval_in_api_traced_fns$.bind((SubLObject)api_kernel.NIL, thread);
            eval_in_api.$eval_in_api_trace_log$.bind((SubLObject)api_kernel.$str13$, thread);
            Errors.$ignore_warnsP$.bind((SubLObject)api_kernel.T, thread);
            Errors.$ignore_breaksP$.bind((SubLObject)api_kernel.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)api_kernel.T, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)api_kernel.T, thread);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            api_server_one_complete_request(in_stream, out_stream);
        }
        finally {
            StreamsLow.$error_output$.rebind(_prev_bind_19, thread);
            StreamsLow.$standard_output$.rebind(_prev_bind_18, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_17, thread);
            utilities_macros.$silent_progressP$.rebind(_prev_bind_16, thread);
            Errors.$ignore_breaksP$.rebind(_prev_bind_15, thread);
            Errors.$ignore_warnsP$.rebind(_prev_bind_14, thread);
            eval_in_api.$eval_in_api_trace_log$.rebind(_prev_bind_13, thread);
            eval_in_api.$eval_in_api_traced_fns$.rebind(_prev_bind_12, thread);
            eval_in_api.$eval_in_api_env$.rebind(_prev_bind_11, thread);
            api_kernel.$api_output_protocol$.rebind(_prev_bind_10, thread);
            api_kernel.$api_result_method$.rebind(_prev_bind_9, thread);
            api_kernel.$api_validate_method$.rebind(_prev_bind_8, thread);
            api_kernel.$api_input_protocol$.rebind(_prev_bind_7, thread);
            api_kernel.$api_out_stream$.rebind(_prev_bind_6, thread);
            api_kernel.$api_in_stream$.rebind(_prev_bind_5, thread);
            api_control_vars.$ke_purpose$.rebind(_prev_bind_4, thread);
            api_kernel.$within_api_server$.rebind(_prev_bind_3, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)api_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 4556L)
    public static SubLObject api_server_one_complete_request(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)api_kernel.NIL;
        SubLObject api_request = (SubLObject)api_kernel.NIL;
        SubLObject api_result = (SubLObject)api_kernel.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)api_kernel.$sym15$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    api_request = read_api_request(in_stream);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)api_kernel.NIL);
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
        if (api_kernel.NIL == error_message) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)api_kernel.$sym15$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        validate_api_request(api_request);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)api_kernel.NIL);
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
        }
        if (api_kernel.NIL == error_message) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)api_kernel.$sym15$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        record_api_request(api_request);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)api_kernel.NIL);
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
        }
        if (api_request.isList() && api_request.first() == api_kernel.$sym16$TASK_PROCESSOR_REQUEST) {
            SubLObject release = (SubLObject)api_kernel.NIL;
            try {
                release = Locks.seize_lock(task_processor.$api_task_process_pool_lock$.getGlobalValue());
                if (api_kernel.NIL == task_processor.api_task_processors_initialized_p()) {
                    task_processor.initialize_api_task_processors();
                }
            }
            finally {
                if (api_kernel.NIL != release) {
                    Locks.release_lock(task_processor.$api_task_process_pool_lock$.getGlobalValue());
                }
            }
            SubLObject current;
            final SubLObject datum = current = api_request;
            SubLObject function = (SubLObject)api_kernel.NIL;
            SubLObject request = (SubLObject)api_kernel.NIL;
            SubLObject id = (SubLObject)api_kernel.NIL;
            SubLObject priority = (SubLObject)api_kernel.NIL;
            SubLObject requestor = (SubLObject)api_kernel.NIL;
            SubLObject client_bindings = (SubLObject)api_kernel.NIL;
            SubLObject uuid_string = (SubLObject)api_kernel.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)api_kernel.$list17);
            function = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)api_kernel.$list17);
            request = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)api_kernel.$list17);
            id = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)api_kernel.$list17);
            priority = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)api_kernel.$list17);
            requestor = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)api_kernel.$list17);
            client_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)api_kernel.$list17);
            uuid_string = current.first();
            current = current.rest();
            if (api_kernel.NIL == current) {
                cfasl_kernel.task_processor_request(request, id, priority, requestor, client_bindings, uuid_string);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)api_kernel.$list17);
            }
            return (SubLObject)api_kernel.NIL;
        }
        if (api_kernel.NIL == error_message) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)api_kernel.$sym15$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        api_result = perform_api_request(api_request);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)api_kernel.NIL);
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
        }
        if (api_kernel.NIL != error_message) {
            send_api_result(out_stream, error_message, (SubLObject)api_kernel.T);
        }
        else {
            send_api_result(out_stream, api_result, (SubLObject)api_kernel.NIL);
        }
        if (api_kernel.NIL != error_message) {
            record_api_result(error_message, (SubLObject)api_kernel.T);
        }
        else {
            record_api_result(api_result, (SubLObject)api_kernel.NIL);
        }
        update_api_protocol();
        return (SubLObject)api_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 6475L)
    public static SubLObject read_api_request(final SubLObject in_stream) {
        final SubLObject request = Functions.funcall(api_input_protocol(), in_stream, (SubLObject)api_kernel.NIL, api_kernel.$api_input_eof_marker$.getGlobalValue());
        if (request.eql(api_kernel.$api_input_eof_marker$.getGlobalValue())) {
            api_quit();
        }
        return request;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 6770L)
    public static SubLObject validate_api_request(final SubLObject api_request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (api_kernel.NIL != api_kernel.$api_validate_method$.getDynamicValue(thread)) {
            return Functions.funcall(api_kernel.$api_validate_method$.getDynamicValue(thread), api_request);
        }
        return (SubLObject)api_kernel.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 6998L)
    public static SubLObject default_validate_api_request(final SubLObject api_request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (api_kernel.NIL == list_utilities.proper_list_p(api_request)) {
            Errors.error((SubLObject)api_kernel.$str20$Invalid_API_Request___S_is_not_a_, api_request);
        }
        if (api_kernel.NIL == eval_in_api.$eval_in_apiP$.getDynamicValue(thread) && api_kernel.NIL == valid_api_function_symbol(api_request.first())) {
            Errors.error((SubLObject)api_kernel.$str21$Invalid_API_Request___S_is_not_a_, api_request.first());
        }
        final SubLObject invalid_constant = list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)api_kernel.$sym22$INVALID_CONSTANT_), api_request, (SubLObject)api_kernel.UNPROVIDED);
        if (api_kernel.NIL != invalid_constant) {
            final SubLObject name = constants_high.constant_name(invalid_constant);
            if (name.isString()) {
                Errors.error((SubLObject)api_kernel.$str23$___A_is_not_an_existing_constant, name);
            }
            else {
                Errors.error((SubLObject)api_kernel.$str24$API_request_references_an_invalid);
            }
        }
        return (SubLObject)api_kernel.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 7655L)
    public static SubLObject valid_api_function_symbol(final SubLObject symbol) {
        return (SubLObject)SubLObjectFactory.makeBoolean(symbol.isSymbol() && api_kernel.NIL != Symbols.fboundp(symbol));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 8110L)
    public static SubLObject record_api_request(final SubLObject api_request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (api_kernel.NIL != api_kernel.$record_api_messagesP$.getDynamicValue(thread)) {
            if (api_kernel.$api_message_sink$.getDynamicValue(thread).isStream()) {
                print_high.prin1(api_request, api_kernel.$api_message_sink$.getDynamicValue(thread));
                streams_high.terpri(api_kernel.$api_message_sink$.getDynamicValue(thread));
                streams_high.force_output(api_kernel.$api_message_sink$.getDynamicValue(thread));
            }
            else if (api_kernel.$api_message_sink$.getDynamicValue(thread).isList()) {
                api_kernel.$api_message_sink$.setDynamicValue((SubLObject)ConsesLow.cons(api_request, api_kernel.$api_message_sink$.getDynamicValue(thread)), thread);
            }
        }
        return (SubLObject)api_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 8458L)
    public static SubLObject record_api_result(final SubLObject result, final SubLObject errorP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (api_kernel.NIL != api_kernel.$record_api_messagesP$.getDynamicValue(thread)) {
            if (api_kernel.$api_message_sink$.getDynamicValue(thread).isStream()) {
                default_api_output_protocol(api_kernel.$api_message_sink$.getDynamicValue(thread), result, errorP);
            }
            else if (api_kernel.$api_message_sink$.getDynamicValue(thread).isList()) {
                api_kernel.$api_message_sink$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(errorP, result), api_kernel.$api_message_sink$.getDynamicValue(thread)), thread);
            }
        }
        return (SubLObject)api_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 8764L)
    public static SubLObject perform_api_request(final SubLObject api_request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        fi.reset_fi_error_state();
        SubLObject result = eval_in_api.cyc_api_eval(api_request);
        if (api_kernel.NIL != fi.fi_error_signaledP()) {
            Errors.error(fi.fi_get_error_string_int());
        }
        if (api_kernel.NIL != api_kernel.$api_result_method$.getDynamicValue(thread)) {
            result = Functions.funcall(api_kernel.$api_result_method$.getDynamicValue(thread), result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 9138L)
    public static SubLObject daml_api_result_transform(SubLObject result) {
        result = cycl_utilities.transform_hl_to_el(result);
        result = transform_list_utilities.transform(result, (SubLObject)api_kernel.$sym25$GUID_P, (SubLObject)api_kernel.$sym26$GUID_TO_STRING, (SubLObject)api_kernel.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 9465L)
    public static SubLObject send_api_result(final SubLObject out_stream, final SubLObject api_result, final SubLObject errorP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject recursive_error = (SubLObject)api_kernel.NIL;
        SubLObject ans = (SubLObject)api_kernel.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)api_kernel.$sym15$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    try {
                        Numbers.add((SubLObject)api_kernel.ONE_INTEGER, (SubLObject)api_kernel.TWO_INTEGER);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)api_kernel.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            ans = Functions.funcall(api_output_protocol(), out_stream, api_result, errorP);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)api_kernel.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            recursive_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (api_kernel.NIL != recursive_error) {
            api_quit();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 10114L)
    public static SubLObject default_api_input_protocol(final SubLObject in_stream, SubLObject eof_error_p, SubLObject eof_token) {
        if (eof_error_p == api_kernel.UNPROVIDED) {
            eof_error_p = (SubLObject)api_kernel.T;
        }
        if (eof_token == api_kernel.UNPROVIDED) {
            eof_token = (SubLObject)api_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)api_kernel.NIL;
        final SubLObject _prev_bind_0 = control_vars.$read_require_constant_exists$.currentBinding(thread);
        try {
            control_vars.$read_require_constant_exists$.bind((SubLObject)api_kernel.NIL, thread);
            v_answer = reader.read(in_stream, eof_error_p, eof_token, (SubLObject)api_kernel.UNPROVIDED);
        }
        finally {
            control_vars.$read_require_constant_exists$.rebind(_prev_bind_0, thread);
        }
        string_utilities.read_whitespace_no_hang(in_stream, (SubLObject)api_kernel.NIL, (SubLObject)api_kernel.UNPROVIDED);
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 10560L)
    public static SubLObject default_api_output_protocol(final SubLObject out_stream, final SubLObject api_result, SubLObject errorP) {
        if (errorP == api_kernel.UNPROVIDED) {
            errorP = (SubLObject)api_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result_code = (api_kernel.NIL != errorP) ? api_kernel.$api_error_code$.getDynamicValue(thread) : api_kernel.$api_success_code$.getDynamicValue(thread);
        PrintLow.format(out_stream, (SubLObject)api_kernel.$str29$_D__S, result_code, api_result);
        string_utilities.network_terpri(out_stream);
        streams_high.force_output(out_stream);
        return api_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 11075L)
    public static SubLObject change_api_protocol(final SubLObject new_input_protocol, final SubLObject new_output_protocol) {
        if (new_input_protocol.isFunctionSpec() && new_output_protocol.isFunctionSpec()) {
            api_kernel.$new_api_input_protocol$.setDynamicValue(new_input_protocol);
            api_kernel.$new_api_output_protocol$.setDynamicValue(new_output_protocol);
            return (SubLObject)api_kernel.T;
        }
        return (SubLObject)api_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 11430L)
    public static SubLObject change_api_result_method(final SubLObject function) {
        assert api_kernel.NIL != Types.function_spec_p(function) : function;
        api_kernel.$api_result_method$.setDynamicValue(function);
        return function;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 11625L)
    public static SubLObject update_api_protocol() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (api_kernel.NIL != api_kernel.$new_api_input_protocol$.getDynamicValue(thread) && api_kernel.NIL != api_kernel.$new_api_output_protocol$.getDynamicValue(thread)) {
            set_api_input_protocol(api_kernel.$new_api_input_protocol$.getDynamicValue(thread));
            set_api_output_protocol(api_kernel.$new_api_output_protocol$.getDynamicValue(thread));
            api_kernel.$new_api_input_protocol$.setDynamicValue((SubLObject)api_kernel.NIL, thread);
            api_kernel.$new_api_output_protocol$.setDynamicValue((SubLObject)api_kernel.NIL, thread);
        }
        return (SubLObject)api_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 11953L)
    public static SubLObject api_input_protocol() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return api_kernel.$api_input_protocol$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 12022L)
    public static SubLObject api_output_protocol() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return api_kernel.$api_output_protocol$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 12093L)
    public static SubLObject set_api_input_protocol(final SubLObject input_protocol) {
        assert api_kernel.NIL != Types.function_spec_p(input_protocol) : input_protocol;
        api_kernel.$api_input_protocol$.setDynamicValue(input_protocol);
        return (SubLObject)api_kernel.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 12254L)
    public static SubLObject set_api_output_protocol(final SubLObject output_protocol) {
        assert api_kernel.NIL != Types.function_spec_p(output_protocol) : output_protocol;
        api_kernel.$api_output_protocol$.setDynamicValue(output_protocol);
        return (SubLObject)api_kernel.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 12419L)
    public static SubLObject api_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$fi_port_offset$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 12616L)
    public static SubLObject cyc_api_remote_eval(final SubLObject api_request, final SubLObject machine, final SubLObject port, SubLObject timeout) {
        if (timeout == api_kernel.UNPROVIDED) {
            timeout = (SubLObject)api_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(api_request, api_kernel.$sym31$CONSP);
        enforceType(machine, api_kernel.$sym32$STRINGP);
        enforceType(port, api_kernel.$sym33$INTEGERP);
        SubLObject result = (SubLObject)api_kernel.NIL;
        SubLObject valid = (SubLObject)api_kernel.NIL;
        SubLObject channel = (SubLObject)api_kernel.NIL;
        try {
            channel = subl_promotions.open_tcp_stream_with_timeout(machine, port, timeout, (SubLObject)api_kernel.$kw34$PRIVATE);
            if (api_kernel.NIL != subl_macro_promotions.validate_tcp_connection(channel, machine, port)) {
                thread.resetMultipleValues();
                final SubLObject result_$4 = cyc_api_channel_eval_internal(api_request, channel);
                final SubLObject valid_$5 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$4;
                valid = valid_$5;
                print_high.princ((SubLObject)api_kernel.$str35$_api_quit__, channel);
                streams_high.force_output(channel);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)api_kernel.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (api_kernel.NIL != channel) {
                    streams_high.close(channel, (SubLObject)api_kernel.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        if (api_kernel.NIL == valid) {
            return Errors.error((SubLObject)api_kernel.$str36$_A, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 13231L)
    public static SubLObject cyc_api_channel_eval(final SubLObject api_request, final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert api_kernel.NIL != Types.streamp(channel) : channel;
        thread.resetMultipleValues();
        final SubLObject result = cyc_api_channel_eval_internal(api_request, channel);
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (api_kernel.NIL == valid) {
            return Errors.error((SubLObject)api_kernel.$str36$_A, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 13680L)
    public static SubLObject cyc_api_channel_eval_internal(final SubLObject api_request, final SubLObject channel) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyc_api_channel_output(api_request, channel);
        streams_high.force_output(channel);
        final SubLObject result_code = cyc_api_channel_input(channel, api_kernel.$api_success_code$.getDynamicValue(thread));
        final SubLObject result = cyc_api_channel_input(channel, api_kernel.$cyc_api_eof_exception$.getGlobalValue());
        return Values.values(result, (SubLObject)SubLObjectFactory.makeBoolean(!result_code.eql(api_kernel.$api_error_code$.getDynamicValue(thread))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 14038L)
    public static SubLObject cyc_api_channel_output(final SubLObject v_object, final SubLObject channel) {
        return PrintLow.format(channel, (SubLObject)api_kernel.$str43$_S_, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 14134L)
    public static SubLObject cyc_api_channel_input(final SubLObject channel, final SubLObject eof_value) {
        return reader.read_ignoring_errors(channel, (SubLObject)api_kernel.NIL, eof_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 14247L)
    public static SubLObject fi_server_top_level(final SubLObject in_stream, final SubLObject out_stream) {
        return api_server_top_level(in_stream, out_stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 14387L)
    public static SubLObject fi_quit() {
        return api_quit();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-kernel.lisp", position = 14435L)
    public static SubLObject fi_port() {
        return api_port();
    }
    
    public static SubLObject declare_api_kernel_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "api_server_handler", "API-SERVER-HANDLER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "api_server_top_level", "API-SERVER-TOP-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "api_quit", "API-QUIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "abort_api_server_process", "ABORT-API-SERVER-PROCESS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.api_kernel", "with_api_protocol_bindings", "WITH-API-PROTOCOL-BINDINGS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "api_server_loop", "API-SERVER-LOOP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "api_fake_server_loop_one_step", "API-FAKE-SERVER-LOOP-ONE-STEP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "api_server_one_complete_request", "API-SERVER-ONE-COMPLETE-REQUEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "read_api_request", "READ-API-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "validate_api_request", "VALIDATE-API-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "default_validate_api_request", "DEFAULT-VALIDATE-API-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "valid_api_function_symbol", "VALID-API-FUNCTION-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "record_api_request", "RECORD-API-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "record_api_result", "RECORD-API-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "perform_api_request", "PERFORM-API-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "daml_api_result_transform", "DAML-API-RESULT-TRANSFORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "send_api_result", "SEND-API-RESULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "default_api_input_protocol", "DEFAULT-API-INPUT-PROTOCOL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "default_api_output_protocol", "DEFAULT-API-OUTPUT-PROTOCOL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "change_api_protocol", "CHANGE-API-PROTOCOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "change_api_result_method", "CHANGE-API-RESULT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "update_api_protocol", "UPDATE-API-PROTOCOL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "api_input_protocol", "API-INPUT-PROTOCOL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "api_output_protocol", "API-OUTPUT-PROTOCOL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "set_api_input_protocol", "SET-API-INPUT-PROTOCOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "set_api_output_protocol", "SET-API-OUTPUT-PROTOCOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "api_port", "API-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "cyc_api_remote_eval", "CYC-API-REMOTE-EVAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "cyc_api_channel_eval", "CYC-API-CHANNEL-EVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "cyc_api_channel_eval_internal", "CYC-API-CHANNEL-EVAL-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "cyc_api_channel_output", "CYC-API-CHANNEL-OUTPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "cyc_api_channel_input", "CYC-API-CHANNEL-INPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "fi_server_top_level", "FI-SERVER-TOP-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "fi_quit", "FI-QUIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_kernel", "fi_port", "FI-PORT", 0, 0, false);
        return (SubLObject)api_kernel.NIL;
    }
    
    public static SubLObject init_api_kernel_file() {
        api_kernel.$within_api_server$ = SubLFiles.defparameter("*WITHIN-API-SERVER*", (SubLObject)api_kernel.NIL);
        api_kernel.$avoid_api_quitP$ = SubLFiles.defparameter("*AVOID-API-QUIT?*", (SubLObject)api_kernel.NIL);
        api_kernel.$default_api_input_protocol$ = SubLFiles.defparameter("*DEFAULT-API-INPUT-PROTOCOL*", (SubLObject)api_kernel.$sym8$DEFAULT_API_INPUT_PROTOCOL);
        api_kernel.$api_input_protocol$ = SubLFiles.defparameter("*API-INPUT-PROTOCOL*", api_kernel.$default_api_input_protocol$.getDynamicValue());
        api_kernel.$default_api_validate_method$ = SubLFiles.defparameter("*DEFAULT-API-VALIDATE-METHOD*", (SubLObject)api_kernel.$sym9$DEFAULT_VALIDATE_API_REQUEST);
        api_kernel.$api_validate_method$ = SubLFiles.defparameter("*API-VALIDATE-METHOD*", api_kernel.$default_api_validate_method$.getDynamicValue());
        api_kernel.$default_api_result_method$ = SubLFiles.deflexical("*DEFAULT-API-RESULT-METHOD*", (SubLObject)api_kernel.NIL);
        api_kernel.$api_result_method$ = SubLFiles.defparameter("*API-RESULT-METHOD*", api_kernel.$default_api_result_method$.getGlobalValue());
        api_kernel.$default_api_output_protocol$ = SubLFiles.defparameter("*DEFAULT-API-OUTPUT-PROTOCOL*", (SubLObject)api_kernel.$sym10$DEFAULT_API_OUTPUT_PROTOCOL);
        api_kernel.$api_output_protocol$ = SubLFiles.defparameter("*API-OUTPUT-PROTOCOL*", api_kernel.$default_api_output_protocol$.getDynamicValue());
        api_kernel.$api_in_stream$ = SubLFiles.defparameter("*API-IN-STREAM*", (SubLObject)api_kernel.NIL);
        api_kernel.$api_out_stream$ = SubLFiles.defparameter("*API-OUT-STREAM*", (SubLObject)api_kernel.NIL);
        api_kernel.$api_input_eof_marker$ = SubLFiles.deflexical("*API-INPUT-EOF-MARKER*", maybeDefault((SubLObject)api_kernel.$sym18$_API_INPUT_EOF_MARKER_, api_kernel.$api_input_eof_marker$, ()->(Symbols.make_symbol((SubLObject)api_kernel.$str19$API_Input_EOF_Marker))));
        api_kernel.$record_api_messagesP$ = SubLFiles.defparameter("*RECORD-API-MESSAGES?*", (SubLObject)api_kernel.NIL);
        api_kernel.$api_message_sink$ = SubLFiles.defparameter("*API-MESSAGE-SINK*", (SubLObject)api_kernel.NIL);
        api_kernel.$api_success_code$ = SubLFiles.defparameter("*API-SUCCESS-CODE*", (SubLObject)api_kernel.$int27$200);
        api_kernel.$api_error_code$ = SubLFiles.defparameter("*API-ERROR-CODE*", (SubLObject)api_kernel.$int28$500);
        api_kernel.$new_api_input_protocol$ = SubLFiles.defparameter("*NEW-API-INPUT-PROTOCOL*", (SubLObject)api_kernel.NIL);
        api_kernel.$new_api_output_protocol$ = SubLFiles.defparameter("*NEW-API-OUTPUT-PROTOCOL*", (SubLObject)api_kernel.NIL);
        api_kernel.$cyc_api_eof_exception$ = SubLFiles.deflexical("*CYC-API-EOF-EXCEPTION*", (SubLObject)api_kernel.$kw42$EOF);
        return (SubLObject)api_kernel.NIL;
    }
    
    public static SubLObject setup_api_kernel_file() {
        tcp_server_utilities.register_tcp_server_type((SubLObject)api_kernel.$kw0$CYC_API, (SubLObject)api_kernel.$sym1$API_SERVER_HANDLER, (SubLObject)api_kernel.$kw2$TEXT);
        utilities_macros.register_cyc_api_function((SubLObject)api_kernel.$sym6$API_QUIT, (SubLObject)api_kernel.NIL, (SubLObject)api_kernel.$str7$Explicitly_quit_this_api_connecti, (SubLObject)api_kernel.NIL, (SubLObject)api_kernel.NIL);
        access_macros.register_external_symbol((SubLObject)api_kernel.$sym14$API_FAKE_SERVER_LOOP_ONE_STEP);
        subl_macro_promotions.declare_defglobal((SubLObject)api_kernel.$sym18$_API_INPUT_EOF_MARKER_);
        utilities_macros.register_cyc_api_function((SubLObject)api_kernel.$sym37$CYC_API_REMOTE_EVAL, (SubLObject)api_kernel.$list38, (SubLObject)api_kernel.$str39$Evaluate_API_REQUEST_on_MACHINE_u, (SubLObject)api_kernel.$list40, (SubLObject)api_kernel.NIL);
        return (SubLObject)api_kernel.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_api_kernel_file();
    }
    
    @Override
	public void initializeVariables() {
        init_api_kernel_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_api_kernel_file();
    }
    
    static {
        me = (SubLFile)new api_kernel();
        api_kernel.$within_api_server$ = null;
        api_kernel.$avoid_api_quitP$ = null;
        api_kernel.$default_api_input_protocol$ = null;
        api_kernel.$api_input_protocol$ = null;
        api_kernel.$default_api_validate_method$ = null;
        api_kernel.$api_validate_method$ = null;
        api_kernel.$default_api_result_method$ = null;
        api_kernel.$api_result_method$ = null;
        api_kernel.$default_api_output_protocol$ = null;
        api_kernel.$api_output_protocol$ = null;
        api_kernel.$api_in_stream$ = null;
        api_kernel.$api_out_stream$ = null;
        api_kernel.$api_input_eof_marker$ = null;
        api_kernel.$record_api_messagesP$ = null;
        api_kernel.$api_message_sink$ = null;
        api_kernel.$api_success_code$ = null;
        api_kernel.$api_error_code$ = null;
        api_kernel.$new_api_input_protocol$ = null;
        api_kernel.$new_api_output_protocol$ = null;
        api_kernel.$cyc_api_eof_exception$ = null;
        $kw0$CYC_API = SubLObjectFactory.makeKeyword("CYC-API");
        $sym1$API_SERVER_HANDLER = SubLObjectFactory.makeSymbol("API-SERVER-HANDLER");
        $kw2$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str3$CYC = SubLObjectFactory.makeString("CYC");
        $sym4$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $kw5$API_QUIT = SubLObjectFactory.makeKeyword("API-QUIT");
        $sym6$API_QUIT = SubLObjectFactory.makeSymbol("API-QUIT");
        $str7$Explicitly_quit_this_api_connecti = SubLObjectFactory.makeString("Explicitly quit this api connection.");
        $sym8$DEFAULT_API_INPUT_PROTOCOL = SubLObjectFactory.makeSymbol("DEFAULT-API-INPUT-PROTOCOL");
        $sym9$DEFAULT_VALIDATE_API_REQUEST = SubLObjectFactory.makeSymbol("DEFAULT-VALIDATE-API-REQUEST");
        $sym10$DEFAULT_API_OUTPUT_PROTOCOL = SubLObjectFactory.makeSymbol("DEFAULT-API-OUTPUT-PROTOCOL");
        $sym11$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*API-INPUT-PROTOCOL*"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-API-INPUT-PROTOCOL*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*API-VALIDATE-METHOD*"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-API-VALIDATE-METHOD*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*API-RESULT-METHOD*"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-API-RESULT-METHOD*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*API-OUTPUT-PROTOCOL*"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-API-OUTPUT-PROTOCOL*")));
        $str13$ = SubLObjectFactory.makeString("");
        $sym14$API_FAKE_SERVER_LOOP_ONE_STEP = SubLObjectFactory.makeSymbol("API-FAKE-SERVER-LOOP-ONE-STEP");
        $sym15$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym16$TASK_PROCESSOR_REQUEST = SubLObjectFactory.makeSymbol("TASK-PROCESSOR-REQUEST");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITY"), (SubLObject)SubLObjectFactory.makeSymbol("REQUESTOR"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("UUID-STRING"));
        $sym18$_API_INPUT_EOF_MARKER_ = SubLObjectFactory.makeSymbol("*API-INPUT-EOF-MARKER*");
        $str19$API_Input_EOF_Marker = SubLObjectFactory.makeString("API Input EOF Marker");
        $str20$Invalid_API_Request___S_is_not_a_ = SubLObjectFactory.makeString("Invalid API Request: ~S is not a proper list");
        $str21$Invalid_API_Request___S_is_not_a_ = SubLObjectFactory.makeString("Invalid API Request: ~S is not a valid API function symbol");
        $sym22$INVALID_CONSTANT_ = SubLObjectFactory.makeSymbol("INVALID-CONSTANT?");
        $str23$___A_is_not_an_existing_constant = SubLObjectFactory.makeString("#$~A is not an existing constant");
        $str24$API_request_references_an_invalid = SubLObjectFactory.makeString("API request references an invalid constant");
        $sym25$GUID_P = SubLObjectFactory.makeSymbol("GUID-P");
        $sym26$GUID_TO_STRING = SubLObjectFactory.makeSymbol("GUID-TO-STRING");
        $int27$200 = SubLObjectFactory.makeInteger(200);
        $int28$500 = SubLObjectFactory.makeInteger(500);
        $str29$_D__S = SubLObjectFactory.makeString("~D ~S");
        $sym30$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym31$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $sym32$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym33$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $kw34$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $str35$_api_quit__ = SubLObjectFactory.makeString("(api-quit) ");
        $str36$_A = SubLObjectFactory.makeString("~A");
        $sym37$CYC_API_REMOTE_EVAL = SubLObjectFactory.makeSymbol("CYC-API-REMOTE-EVAL");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("API-REQUEST"), (SubLObject)SubLObjectFactory.makeSymbol("MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"));
        $str39$Evaluate_API_REQUEST_on_MACHINE_u = SubLObjectFactory.makeString("Evaluate API-REQUEST on MACHINE using the CYC-API server at TCP PORT");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("API-REQUEST"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $sym41$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $kw42$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str43$_S_ = SubLObjectFactory.makeString("~S ");
    }
}

/*

	Total time: 283 ms
	
*/