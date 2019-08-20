/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.control_vars.$read_require_constant_exists$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_normal_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.interrupt_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.set_process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Main;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      API-KERNEL
 * source file: /cyc/top/cycl/api-kernel.lisp
 * created:     2019/07/03 17:37:17
 */
public final class api_kernel extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt13$ = makeString("");

    public static final SubLFile me = new api_kernel();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $within_api_server$ = makeSymbol("*WITHIN-API-SERVER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $avoid_api_quitP$ = makeSymbol("*AVOID-API-QUIT?*");

    // defparameter
    // The default API input protocol to use.
    /**
     * The default API input protocol to use.
     */
    @LispMethod(comment = "The default API input protocol to use.\ndefparameter")
    public static final SubLSymbol $default_api_input_protocol$ = makeSymbol("*DEFAULT-API-INPUT-PROTOCOL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $api_input_protocol$ = makeSymbol("*API-INPUT-PROTOCOL*");

    // defparameter
    // The default API input validator to use.
    /**
     * The default API input validator to use.
     */
    @LispMethod(comment = "The default API input validator to use.\ndefparameter")
    public static final SubLSymbol $default_api_validate_method$ = makeSymbol("*DEFAULT-API-VALIDATE-METHOD*");

    // defparameter
    /**
     * When non-nil, a function which is called to validate any API request before
     * evaluation.
     */
    @LispMethod(comment = "When non-nil, a function which is called to validate any API request before\r\nevaluation.\ndefparameter\nWhen non-nil, a function which is called to validate any API request before\nevaluation.")
    public static final SubLSymbol $api_validate_method$ = makeSymbol("*API-VALIDATE-METHOD*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_api_result_method$ = makeSymbol("*DEFAULT-API-RESULT-METHOD*");

    // defparameter
    /**
     * When non-nil, a function which is called to transform any API result before
     * returning the output.
     */
    @LispMethod(comment = "When non-nil, a function which is called to transform any API result before\r\nreturning the output.\ndefparameter\nWhen non-nil, a function which is called to transform any API result before\nreturning the output.")
    public static final SubLSymbol $api_result_method$ = makeSymbol("*API-RESULT-METHOD*");

    // defparameter
    // The default API output protocol to use.
    /**
     * The default API output protocol to use.
     */
    @LispMethod(comment = "The default API output protocol to use.\ndefparameter")
    public static final SubLSymbol $default_api_output_protocol$ = makeSymbol("*DEFAULT-API-OUTPUT-PROTOCOL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $api_output_protocol$ = makeSymbol("*API-OUTPUT-PROTOCOL*");

    // defparameter
    // the api input stream (for use by the java-api-kernel).
    /**
     * the api input stream (for use by the java-api-kernel).
     */
    @LispMethod(comment = "the api input stream (for use by the java-api-kernel).\ndefparameter")
    public static final SubLSymbol $api_in_stream$ = makeSymbol("*API-IN-STREAM*");

    // defparameter
    // the api output stream (for use by the java-api-kernel).
    /**
     * the api output stream (for use by the java-api-kernel).
     */
    @LispMethod(comment = "the api output stream (for use by the java-api-kernel).\ndefparameter")
    public static final SubLSymbol $api_out_stream$ = makeSymbol("*API-OUT-STREAM*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $record_api_messagesP$ = makeSymbol("*RECORD-API-MESSAGES?*");

    // defparameter
    /**
     * Either a list or a stream. If a list, the messages are stuck on the list. If
     * a stream, the messages are output to it.
     */
    @LispMethod(comment = "Either a list or a stream. If a list, the messages are stuck on the list. If\r\na stream, the messages are output to it.\ndefparameter\nEither a list or a stream. If a list, the messages are stuck on the list. If\na stream, the messages are output to it.")
    public static final SubLSymbol $api_message_sink$ = makeSymbol("*API-MESSAGE-SINK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $api_success_code$ = makeSymbol("*API-SUCCESS-CODE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $api_error_code$ = makeSymbol("*API-ERROR-CODE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $new_api_input_protocol$ = makeSymbol("*NEW-API-INPUT-PROTOCOL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $new_api_output_protocol$ = makeSymbol("*NEW-API-OUTPUT-PROTOCOL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cyc_api_eof_exception$ = makeSymbol("*CYC-API-EOF-EXCEPTION*");

    private static final SubLSymbol API_SERVER_HANDLER = makeSymbol("API-SERVER-HANDLER");

    static private final SubLString $$$CYC = makeString("CYC");

    private static final SubLSymbol API_QUIT = makeSymbol("API-QUIT");

    static private final SubLString $str7$Explicitly_quit_this_api_connecti = makeString("Explicitly quit this api connection.");

    private static final SubLSymbol DEFAULT_API_INPUT_PROTOCOL = makeSymbol("DEFAULT-API-INPUT-PROTOCOL");

    private static final SubLSymbol DEFAULT_VALIDATE_API_REQUEST = makeSymbol("DEFAULT-VALIDATE-API-REQUEST");

    private static final SubLSymbol DEFAULT_API_OUTPUT_PROTOCOL = makeSymbol("DEFAULT-API-OUTPUT-PROTOCOL");

    static private final SubLList $list12 = list(list(makeSymbol("*API-INPUT-PROTOCOL*"), makeSymbol("*DEFAULT-API-INPUT-PROTOCOL*")), list(makeSymbol("*API-VALIDATE-METHOD*"), makeSymbol("*DEFAULT-API-VALIDATE-METHOD*")),
	    list(makeSymbol("*API-RESULT-METHOD*"), makeSymbol("*DEFAULT-API-RESULT-METHOD*")), list(makeSymbol("*API-OUTPUT-PROTOCOL*"), makeSymbol("*DEFAULT-API-OUTPUT-PROTOCOL*")));

    static private final SubLString $str13$ = makeString("");

    private static final SubLSymbol API_FAKE_SERVER_LOOP_ONE_STEP = makeSymbol("API-FAKE-SERVER-LOOP-ONE-STEP");

    private static final SubLSymbol TASK_PROCESSOR_REQUEST = makeSymbol("TASK-PROCESSOR-REQUEST");

    private static final SubLList $list17 = list(makeSymbol("FUNCTION"), makeSymbol("REQUEST"), makeSymbol("ID"), makeSymbol("PRIORITY"), makeSymbol("REQUESTOR"), makeSymbol("CLIENT-BINDINGS"), makeSymbol("UUID-STRING"));

    private static final SubLSymbol $api_input_eof_marker$ = makeSymbol("*API-INPUT-EOF-MARKER*");

    private static final SubLString $$$API_Input_EOF_Marker = makeString("API Input EOF Marker");

    static private final SubLString $str20$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a proper list");

    private static final SubLString $str21$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a valid API function symbol");

    private static final SubLSymbol $sym22$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    private static final SubLString $str23$___A_is_not_an_existing_constant = makeString("#$~A is not an existing constant");

    private static final SubLString $str24$API_request_references_an_invalid = makeString("API request references an invalid constant");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLString $str29$_D__S = makeString("~D ~S");

    private static final SubLString $str35$_api_quit__ = makeString("(api-quit) ");

    private static final SubLString $str36$_A = makeString("~A");

    private static final SubLSymbol CYC_API_REMOTE_EVAL = makeSymbol("CYC-API-REMOTE-EVAL");

    private static final SubLList $list38 = list(makeSymbol("API-REQUEST"), makeSymbol("MACHINE"), makeSymbol("PORT"), makeSymbol("&OPTIONAL"), makeSymbol("TIMEOUT"));

    private static final SubLString $str39$Evaluate_API_REQUEST_on_MACHINE_u = makeString("Evaluate API-REQUEST on MACHINE using the CYC-API server at TCP PORT");

    private static final SubLList $list40 = list(list(makeSymbol("API-REQUEST"), makeSymbol("CONSP")), list(makeSymbol("MACHINE"), makeSymbol("STRINGP")), list(makeSymbol("PORT"), makeSymbol("INTEGERP")));

    private static final SubLString $str43$_S_ = makeString("~S ");

    // Definitions
    public static final SubLObject api_server_handler_alt(SubLObject in_stream, SubLObject out_stream) {
	return com.cyc.cycjava.cycl.api_kernel.api_server_top_level(in_stream, out_stream);
    }

    // Definitions
    @SuppressWarnings("unused")
    public static SubLObject api_server_handler(SubLObject in_stream, SubLObject out_stream) {
	final boolean wasSetSubLisp = Main.isSubLisp();
	final SubLPackage prevPackage = Lisp.getCurrentPackage();
	try {
	    Main.setSubLisp(true);
	    SubLPackage.setCurrentPackage("CYC");
	    if (false) {
		in_stream = in_stream.toInputTextStream();
		out_stream = out_stream.toOutputStream();
	    }
	    // SystemCurrent.setIn(inputStream.);
	    {
		return api_server_top_level(in_stream, out_stream);
	    }
	} finally {
	    SubLPackage.setCurrentPackage(prevPackage);
	    Main.setSubLisp(wasSetSubLisp);
	}
    }

    public static final SubLObject api_server_top_level_alt(SubLObject in_stream, SubLObject out_stream) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $package$.currentBinding(thread);
		SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
		SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
		SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
		try {
		    $package$.bind(find_package($$$CYC), thread);
		    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
		    $print_readably$.bind(NIL, thread);
		    $read_eval$.bind(NIL, thread);
		    {
			SubLObject old_priority = process_priority(current_process());
			try {
			    set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
			    {
				try {
				    {
					SubLObject _prev_bind_0_1 = $within_api_server$.currentBinding(thread);
					try {
					    $within_api_server$.bind(T, thread);
					    com.cyc.cycjava.cycl.api_kernel.api_server_loop(in_stream, out_stream);
					} finally {
					    $within_api_server$.rebind(_prev_bind_0_1, thread);
					}
				    }
				} catch (Throwable ccatch_env_var) {
				    Errors.handleThrowable(ccatch_env_var, $API_QUIT);
				}
			    }
			} finally {
			    {
				SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
				    $is_thread_performing_cleanupP$.bind(T, thread);
				    set_process_priority(current_process(), old_priority);
				} finally {
				    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
				}
			    }
			}
		    }
		} finally {
		    $read_eval$.rebind(_prev_bind_3, thread);
		    $print_readably$.rebind(_prev_bind_2, thread);
		    $read_default_float_format$.rebind(_prev_bind_1, thread);
		    $package$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject api_server_top_level(final SubLObject in_stream, final SubLObject out_stream) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $print_readably$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $read_eval$.currentBinding(thread);
	try {
	    $package$.bind(find_package($$$CYC), thread);
	    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
	    $print_readably$.bind(NIL, thread);
	    $read_eval$.bind(NIL, thread);
	    final SubLObject old_priority = process_priority(current_process());
	    try {
		set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
		SubLObject catch_var = NIL;
		try {
		    thread.throwStack.push($API_QUIT);
		    final SubLObject _prev_bind_0_$1 = $within_api_server$.currentBinding(thread);
		    try {
			$within_api_server$.bind(T, thread);
			api_server_loop(in_stream, out_stream);
		    } finally {
			$within_api_server$.rebind(_prev_bind_0_$1, thread);
		    }
		} catch (final Throwable ccatch_env_var) {
		    catch_var = Errors.handleThrowable(ccatch_env_var, $API_QUIT);
		} finally {
		    thread.throwStack.pop();
		}
	    } finally {
		final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_process_priority(current_process(), old_priority);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
		}
	    }
	} finally {
	    $read_eval$.rebind(_prev_bind_4, thread);
	    $print_readably$.rebind(_prev_bind_3, thread);
	    $read_default_float_format$.rebind(_prev_bind_2, thread);
	    $package$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    /**
     * Explicitly quit this api connection.
     */
    @LispMethod(comment = "Explicitly quit this api connection.")
    public static final SubLObject api_quit_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $within_api_server$.getDynamicValue(thread)) {
		sublisp_throw($API_QUIT, NIL);
	    }
	    return NIL;
	}
    }

    /**
     * Explicitly quit this api connection.
     */
    @LispMethod(comment = "Explicitly quit this api connection.")
    public static SubLObject api_quit() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL != $within_api_server$.getDynamicValue(thread)) && (NIL == $avoid_api_quitP$.getDynamicValue(thread))) {
	    sublisp_throw($API_QUIT, NIL);
	}
	return NIL;
    }

    public static final SubLObject abort_api_server_process_alt(SubLObject process) {
	return interrupt_process(process, symbol_function(API_QUIT));
    }

    public static SubLObject abort_api_server_process(final SubLObject process) {
	return interrupt_process(process, symbol_function(API_QUIT));
    }

    public static final SubLObject with_api_protocol_bindings_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject body = current;
	    return listS(CLET, $list_alt12, append(body, NIL));
	}
    }

    public static SubLObject with_api_protocol_bindings(final SubLObject macroform, final SubLObject environment) {
	final SubLObject datum = macroform.rest();
	final SubLObject body;
	final SubLObject current = body = datum;
	return listS(CLET, $list12, append(body, NIL));
    }

    public static final SubLObject api_server_loop_alt(SubLObject in_stream, SubLObject out_stream) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
		SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
		SubLObject _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding(thread);
		SubLObject _prev_bind_3 = $api_in_stream$.currentBinding(thread);
		SubLObject _prev_bind_4 = $api_out_stream$.currentBinding(thread);
		SubLObject _prev_bind_5 = $api_input_protocol$.currentBinding(thread);
		SubLObject _prev_bind_6 = $api_validate_method$.currentBinding(thread);
		SubLObject _prev_bind_7 = $api_result_method$.currentBinding(thread);
		SubLObject _prev_bind_8 = $api_output_protocol$.currentBinding(thread);
		SubLObject _prev_bind_9 = eval_in_api.$eval_in_api_env$.currentBinding(thread);
		SubLObject _prev_bind_10 = eval_in_api.$eval_in_api_traced_fns$.currentBinding(thread);
		SubLObject _prev_bind_11 = eval_in_api.$eval_in_api_trace_log$.currentBinding(thread);
		SubLObject _prev_bind_12 = Errors.$ignore_warnsP$.currentBinding(thread);
		SubLObject _prev_bind_13 = Errors.$ignore_breaksP$.currentBinding(thread);
		SubLObject _prev_bind_14 = $silent_progressP$.currentBinding(thread);
		SubLObject _prev_bind_15 = Errors.$continue_cerrorP$.currentBinding(thread);
		SubLObject _prev_bind_16 = StreamsLow.$standard_output$.currentBinding(thread);
		SubLObject _prev_bind_17 = StreamsLow.$error_output$.currentBinding(thread);
		try {
		    api_control_vars.$use_local_queueP$.bind(NIL, thread);
		    api_control_vars.$the_cyclist$.bind(operation_communication.the_cyclist(), thread);
		    api_control_vars.$ke_purpose$.bind(api_control_vars.$default_ke_purpose$.getDynamicValue(thread), thread);
		    $api_in_stream$.bind(in_stream, thread);
		    $api_out_stream$.bind(out_stream, thread);
		    $api_input_protocol$.bind($default_api_input_protocol$.getDynamicValue(thread), thread);
		    $api_validate_method$.bind($default_api_validate_method$.getDynamicValue(thread), thread);
		    $api_result_method$.bind($default_api_result_method$.getGlobalValue(), thread);
		    $api_output_protocol$.bind($default_api_output_protocol$.getDynamicValue(thread), thread);
		    eval_in_api.$eval_in_api_env$.bind(eval_in_api.initialize_eval_in_api_env(), thread);
		    eval_in_api.$eval_in_api_traced_fns$.bind(NIL, thread);
		    eval_in_api.$eval_in_api_trace_log$.bind($str_alt13$, thread);
		    Errors.$ignore_warnsP$.bind(T, thread);
		    Errors.$ignore_breaksP$.bind(T, thread);
		    $silent_progressP$.bind(T, thread);
		    Errors.$continue_cerrorP$.bind(T, thread);
		    StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
		    StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
		    while (true) {
			com.cyc.cycjava.cycl.api_kernel.api_server_one_complete_request(in_stream, out_stream);
		    }
		} finally {
		    StreamsLow.$error_output$.rebind(_prev_bind_17, thread);
		    StreamsLow.$standard_output$.rebind(_prev_bind_16, thread);
		    Errors.$continue_cerrorP$.rebind(_prev_bind_15, thread);
		    $silent_progressP$.rebind(_prev_bind_14, thread);
		    Errors.$ignore_breaksP$.rebind(_prev_bind_13, thread);
		    Errors.$ignore_warnsP$.rebind(_prev_bind_12, thread);
		    eval_in_api.$eval_in_api_trace_log$.rebind(_prev_bind_11, thread);
		    eval_in_api.$eval_in_api_traced_fns$.rebind(_prev_bind_10, thread);
		    eval_in_api.$eval_in_api_env$.rebind(_prev_bind_9, thread);
		    $api_output_protocol$.rebind(_prev_bind_8, thread);
		    $api_result_method$.rebind(_prev_bind_7, thread);
		    $api_validate_method$.rebind(_prev_bind_6, thread);
		    $api_input_protocol$.rebind(_prev_bind_5, thread);
		    $api_out_stream$.rebind(_prev_bind_4, thread);
		    $api_in_stream$.rebind(_prev_bind_3, thread);
		    api_control_vars.$ke_purpose$.rebind(_prev_bind_2, thread);
		    api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
		    api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
		}
	    }
	}
    }

    public static SubLObject api_server_loop(final SubLObject in_stream, final SubLObject out_stream) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
	final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
	final SubLObject _prev_bind_3 = api_control_vars.$ke_purpose$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $api_in_stream$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $api_out_stream$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $api_input_protocol$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $api_validate_method$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $api_result_method$.currentBinding(thread);
	final SubLObject _prev_bind_9 = $api_output_protocol$.currentBinding(thread);
	final SubLObject _prev_bind_10 = eval_in_api.$eval_in_api_env$.currentBinding(thread);
	final SubLObject _prev_bind_11 = eval_in_api.$eval_in_api_traced_fns$.currentBinding(thread);
	final SubLObject _prev_bind_12 = eval_in_api.$eval_in_api_trace_log$.currentBinding(thread);
	final SubLObject _prev_bind_13 = Errors.$ignore_warnsP$.currentBinding(thread);
	final SubLObject _prev_bind_14 = Errors.$ignore_breaksP$.currentBinding(thread);
	final SubLObject _prev_bind_15 = $silent_progressP$.currentBinding(thread);
	final SubLObject _prev_bind_16 = Errors.$continue_cerrorP$.currentBinding(thread);
	final SubLObject _prev_bind_17 = StreamsLow.$standard_output$.currentBinding(thread);
	final SubLObject _prev_bind_18 = StreamsLow.$error_output$.currentBinding(thread);
	try {
	    api_control_vars.$use_local_queueP$.bind(NIL, thread);
	    api_control_vars.$the_cyclist$.bind(operation_communication.the_cyclist(), thread);
	    api_control_vars.$ke_purpose$.bind(api_control_vars.$default_ke_purpose$.getDynamicValue(thread), thread);
	    $api_in_stream$.bind(in_stream, thread);
	    $api_out_stream$.bind(out_stream, thread);
	    $api_input_protocol$.bind($default_api_input_protocol$.getDynamicValue(thread), thread);
	    $api_validate_method$.bind($default_api_validate_method$.getDynamicValue(thread), thread);
	    $api_result_method$.bind($default_api_result_method$.getGlobalValue(), thread);
	    $api_output_protocol$.bind($default_api_output_protocol$.getDynamicValue(thread), thread);
	    eval_in_api.$eval_in_api_env$.bind(eval_in_api.initialize_eval_in_api_env(), thread);
	    eval_in_api.$eval_in_api_traced_fns$.bind(NIL, thread);
	    eval_in_api.$eval_in_api_trace_log$.bind($str13$, thread);
	    Errors.$ignore_warnsP$.bind(T, thread);
	    Errors.$ignore_breaksP$.bind(T, thread);
	    $silent_progressP$.bind(T, thread);
	    Errors.$continue_cerrorP$.bind(T, thread);
	    StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
	    StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
	    while (true) {
		api_server_one_complete_request(in_stream, out_stream);
	    }
	} finally {
	    StreamsLow.$error_output$.rebind(_prev_bind_18, thread);
	    StreamsLow.$standard_output$.rebind(_prev_bind_17, thread);
	    Errors.$continue_cerrorP$.rebind(_prev_bind_16, thread);
	    $silent_progressP$.rebind(_prev_bind_15, thread);
	    Errors.$ignore_breaksP$.rebind(_prev_bind_14, thread);
	    Errors.$ignore_warnsP$.rebind(_prev_bind_13, thread);
	    eval_in_api.$eval_in_api_trace_log$.rebind(_prev_bind_12, thread);
	    eval_in_api.$eval_in_api_traced_fns$.rebind(_prev_bind_11, thread);
	    eval_in_api.$eval_in_api_env$.rebind(_prev_bind_10, thread);
	    $api_output_protocol$.rebind(_prev_bind_9, thread);
	    $api_result_method$.rebind(_prev_bind_8, thread);
	    $api_validate_method$.rebind(_prev_bind_7, thread);
	    $api_input_protocol$.rebind(_prev_bind_6, thread);
	    $api_out_stream$.rebind(_prev_bind_5, thread);
	    $api_in_stream$.rebind(_prev_bind_4, thread);
	    api_control_vars.$ke_purpose$.rebind(_prev_bind_3, thread);
	    api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
	    api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
	}
    }

    public static SubLObject api_fake_server_loop_one_step(final SubLObject in_stream, final SubLObject out_stream) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
	final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $within_api_server$.currentBinding(thread);
	final SubLObject _prev_bind_4 = api_control_vars.$ke_purpose$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $api_in_stream$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $api_out_stream$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $api_input_protocol$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $api_validate_method$.currentBinding(thread);
	final SubLObject _prev_bind_9 = $api_result_method$.currentBinding(thread);
	final SubLObject _prev_bind_10 = $api_output_protocol$.currentBinding(thread);
	final SubLObject _prev_bind_11 = eval_in_api.$eval_in_api_env$.currentBinding(thread);
	final SubLObject _prev_bind_12 = eval_in_api.$eval_in_api_traced_fns$.currentBinding(thread);
	final SubLObject _prev_bind_13 = eval_in_api.$eval_in_api_trace_log$.currentBinding(thread);
	final SubLObject _prev_bind_14 = Errors.$ignore_warnsP$.currentBinding(thread);
	final SubLObject _prev_bind_15 = Errors.$ignore_breaksP$.currentBinding(thread);
	final SubLObject _prev_bind_16 = $silent_progressP$.currentBinding(thread);
	final SubLObject _prev_bind_17 = Errors.$continue_cerrorP$.currentBinding(thread);
	final SubLObject _prev_bind_18 = StreamsLow.$standard_output$.currentBinding(thread);
	final SubLObject _prev_bind_19 = StreamsLow.$error_output$.currentBinding(thread);
	try {
	    api_control_vars.$use_local_queueP$.bind(NIL, thread);
	    api_control_vars.$the_cyclist$.bind(operation_communication.the_cyclist(), thread);
	    $within_api_server$.bind(T, thread);
	    api_control_vars.$ke_purpose$.bind(api_control_vars.$default_ke_purpose$.getDynamicValue(thread), thread);
	    $api_in_stream$.bind(in_stream, thread);
	    $api_out_stream$.bind(out_stream, thread);
	    $api_input_protocol$.bind($default_api_input_protocol$.getDynamicValue(thread), thread);
	    $api_validate_method$.bind($default_api_validate_method$.getDynamicValue(thread), thread);
	    $api_result_method$.bind($default_api_result_method$.getGlobalValue(), thread);
	    $api_output_protocol$.bind($default_api_output_protocol$.getDynamicValue(thread), thread);
	    eval_in_api.$eval_in_api_env$.bind(eval_in_api.initialize_eval_in_api_env(), thread);
	    eval_in_api.$eval_in_api_traced_fns$.bind(NIL, thread);
	    eval_in_api.$eval_in_api_trace_log$.bind($str13$, thread);
	    Errors.$ignore_warnsP$.bind(T, thread);
	    Errors.$ignore_breaksP$.bind(T, thread);
	    $silent_progressP$.bind(T, thread);
	    Errors.$continue_cerrorP$.bind(T, thread);
	    StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
	    StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
	    api_server_one_complete_request(in_stream, out_stream);
	} finally {
	    StreamsLow.$error_output$.rebind(_prev_bind_19, thread);
	    StreamsLow.$standard_output$.rebind(_prev_bind_18, thread);
	    Errors.$continue_cerrorP$.rebind(_prev_bind_17, thread);
	    $silent_progressP$.rebind(_prev_bind_16, thread);
	    Errors.$ignore_breaksP$.rebind(_prev_bind_15, thread);
	    Errors.$ignore_warnsP$.rebind(_prev_bind_14, thread);
	    eval_in_api.$eval_in_api_trace_log$.rebind(_prev_bind_13, thread);
	    eval_in_api.$eval_in_api_traced_fns$.rebind(_prev_bind_12, thread);
	    eval_in_api.$eval_in_api_env$.rebind(_prev_bind_11, thread);
	    $api_output_protocol$.rebind(_prev_bind_10, thread);
	    $api_result_method$.rebind(_prev_bind_9, thread);
	    $api_validate_method$.rebind(_prev_bind_8, thread);
	    $api_input_protocol$.rebind(_prev_bind_7, thread);
	    $api_out_stream$.rebind(_prev_bind_6, thread);
	    $api_in_stream$.rebind(_prev_bind_5, thread);
	    api_control_vars.$ke_purpose$.rebind(_prev_bind_4, thread);
	    $within_api_server$.rebind(_prev_bind_3, thread);
	    api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
	    api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static final SubLObject api_server_one_complete_request_alt(SubLObject in_stream, SubLObject out_stream) {
	{
	    SubLObject error_message = NIL;
	    SubLObject api_request = NIL;
	    SubLObject api_result = NIL;
	    try {
		{
		    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
		    try {
			bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
			try {
			    api_request = com.cyc.cycjava.cycl.api_kernel.read_api_request(in_stream);
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
	    if (NIL == error_message) {
		try {
		    {
			SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
			try {
			    bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
			    try {
				com.cyc.cycjava.cycl.api_kernel.validate_api_request(api_request);
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
	    }
	    if (NIL == error_message) {
		try {
		    {
			SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
			try {
			    bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
			    try {
				com.cyc.cycjava.cycl.api_kernel.record_api_request(api_request);
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
	    }
	    if (api_request.first() == TASK_PROCESSOR_REQUEST) {
		{
		    SubLObject lock = task_processor.$api_task_process_pool_lock$.getGlobalValue();
		    SubLObject release = NIL;
		    try {
			release = seize_lock(lock);
			if (NIL == task_processor.api_task_processors_initialized_p()) {
			    task_processor.initialize_api_task_processors();
			}
		    } finally {
			if (NIL != release) {
			    release_lock(lock);
			}
		    }
		}
		{
		    SubLObject datum = api_request;
		    SubLObject current = datum;
		    SubLObject function = NIL;
		    SubLObject request = NIL;
		    SubLObject id = NIL;
		    SubLObject priority = NIL;
		    SubLObject requestor = NIL;
		    SubLObject client_bindings = NIL;
		    SubLObject uuid_string = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt16);
		    function = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt16);
		    request = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt16);
		    id = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt16);
		    priority = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt16);
		    requestor = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt16);
		    client_bindings = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt16);
		    uuid_string = current.first();
		    current = current.rest();
		    if (NIL == current) {
			cfasl_kernel.task_processor_request(request, id, priority, requestor, client_bindings, uuid_string);
		    } else {
			cdestructuring_bind_error(datum, $list_alt16);
		    }
		}
		return NIL;
	    }
	    if (NIL == error_message) {
		try {
		    {
			SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
			try {
			    bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
			    try {
				api_result = com.cyc.cycjava.cycl.api_kernel.perform_api_request(api_request);
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
	    }
	    if (NIL != error_message) {
		com.cyc.cycjava.cycl.api_kernel.send_api_result(out_stream, error_message, T);
	    } else {
		com.cyc.cycjava.cycl.api_kernel.send_api_result(out_stream, api_result, NIL);
	    }
	    if (NIL != error_message) {
		com.cyc.cycjava.cycl.api_kernel.record_api_result(error_message, T);
	    } else {
		com.cyc.cycjava.cycl.api_kernel.record_api_result(api_result, NIL);
	    }
	    com.cyc.cycjava.cycl.api_kernel.update_api_protocol();
	}
	return NIL;
    }

    public static SubLObject api_server_one_complete_request(final SubLObject in_stream, final SubLObject out_stream) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject error_message = NIL;
	SubLObject api_request = NIL;
	SubLObject api_result = NIL;
	try {
	    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
	    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
	    try {
		Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		try {
		    api_request = read_api_request(in_stream);
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
	if (NIL == error_message) {
	    try {
		thread.throwStack.push($catch_error_message_target$.getGlobalValue());
		final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
		try {
		    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		    try {
			validate_api_request(api_request);
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
	}
	if (NIL == error_message) {
	    try {
		thread.throwStack.push($catch_error_message_target$.getGlobalValue());
		final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
		try {
		    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		    try {
			record_api_request(api_request);
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
	}
	if (api_request.isList() && (api_request.first() == TASK_PROCESSOR_REQUEST)) {
	    SubLObject release = NIL;
	    try {
		release = seize_lock(task_processor.$api_task_process_pool_lock$.getGlobalValue());
		if (NIL == task_processor.api_task_processors_initialized_p()) {
		    task_processor.initialize_api_task_processors();
		}
	    } finally {
		if (NIL != release) {
		    release_lock(task_processor.$api_task_process_pool_lock$.getGlobalValue());
		}
	    }
	    SubLObject current;
	    final SubLObject datum = current = api_request;
	    SubLObject function = NIL;
	    SubLObject request = NIL;
	    SubLObject id = NIL;
	    SubLObject priority = NIL;
	    SubLObject requestor = NIL;
	    SubLObject client_bindings = NIL;
	    SubLObject uuid_string = NIL;
	    destructuring_bind_must_consp(current, datum, $list17);
	    function = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list17);
	    request = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list17);
	    id = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list17);
	    priority = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list17);
	    requestor = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list17);
	    client_bindings = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list17);
	    uuid_string = current.first();
	    current = current.rest();
	    if (NIL == current) {
		cfasl_kernel.task_processor_request(request, id, priority, requestor, client_bindings, uuid_string);
	    } else {
		cdestructuring_bind_error(datum, $list17);
	    }
	    return NIL;
	}
	if (NIL == error_message) {
	    try {
		thread.throwStack.push($catch_error_message_target$.getGlobalValue());
		final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
		try {
		    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		    try {
			api_result = perform_api_request(api_request);
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
	}
	if (NIL != error_message) {
	    send_api_result(out_stream, error_message, T);
	} else {
	    send_api_result(out_stream, api_result, NIL);
	}
	if (NIL != error_message) {
	    record_api_result(error_message, T);
	} else {
	    record_api_result(api_result, NIL);
	}
	update_api_protocol();
	return NIL;
    }

    public static final SubLObject read_api_request_alt(SubLObject in_stream) {
	{
	    SubLObject request = funcall(com.cyc.cycjava.cycl.api_kernel.api_input_protocol(), in_stream, NIL, $api_input_eof_marker$.getGlobalValue());
	    if (request == $api_input_eof_marker$.getGlobalValue()) {
		com.cyc.cycjava.cycl.api_kernel.api_quit();
	    }
	    return request;
	}
    }

    public static SubLObject read_api_request(final SubLObject in_stream) {
	final SubLObject request = funcall(api_input_protocol(), in_stream, NIL, $api_input_eof_marker$.getGlobalValue());
	if (request.eql($api_input_eof_marker$.getGlobalValue())) {
	    api_quit();
	}
	return request;
    }

    public static final SubLObject validate_api_request_alt(SubLObject api_request) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $api_validate_method$.getDynamicValue(thread)) {
		return funcall($api_validate_method$.getDynamicValue(thread), api_request);
	    } else {
		return T;
	    }
	}
    }

    public static SubLObject validate_api_request(final SubLObject api_request) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $api_validate_method$.getDynamicValue(thread)) {
	    return funcall($api_validate_method$.getDynamicValue(thread), api_request);
	}
	return T;
    }

    public static final SubLObject default_validate_api_request_alt(SubLObject api_request) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == list_utilities.proper_list_p(api_request)) {
		Errors.error($str_alt19$Invalid_API_Request___S_is_not_a_, api_request);
	    }
	    if (!((NIL != eval_in_api.$eval_in_apiP$.getDynamicValue(thread)) || (NIL != com.cyc.cycjava.cycl.api_kernel.valid_api_function_symbol(api_request.first())))) {
		Errors.error($str_alt20$Invalid_API_Request___S_is_not_a_, api_request.first());
	    }
	    {
		SubLObject invalid_constant = list_utilities.tree_find_if(symbol_function($sym21$INVALID_CONSTANT_), api_request, UNPROVIDED);
		if (NIL != invalid_constant) {
		    {
			SubLObject name = constants_high.constant_name(invalid_constant);
			if (name.isString()) {
			    Errors.error($str_alt22$___A_is_not_an_existing_constant, name);
			} else {
			    Errors.error($str_alt23$API_request_references_an_invalid);
			}
		    }
		}
	    }
	    return T;
	}
    }

    public static SubLObject default_validate_api_request(final SubLObject api_request) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == list_utilities.proper_list_p(api_request)) {
	    Errors.error($str20$Invalid_API_Request___S_is_not_a_, api_request);
	}
	if ((NIL == eval_in_api.$eval_in_apiP$.getDynamicValue(thread)) && (NIL == valid_api_function_symbol(api_request.first()))) {
	    Errors.error($str21$Invalid_API_Request___S_is_not_a_, api_request.first());
	}
	final SubLObject invalid_constant = list_utilities.tree_find_if(symbol_function($sym22$INVALID_CONSTANT_), api_request, UNPROVIDED);
	if (NIL != invalid_constant) {
	    final SubLObject name = constants_high.constant_name(invalid_constant);
	    if (name.isString()) {
		Errors.error($str23$___A_is_not_an_existing_constant, name);
	    } else {
		Errors.error($str24$API_request_references_an_invalid);
	    }
	}
	return T;
    }

    public static final SubLObject valid_api_function_symbol_alt(SubLObject symbol) {
	return makeBoolean(symbol.isSymbol() && (NIL != fboundp(symbol)));
    }

    public static SubLObject valid_api_function_symbol(final SubLObject symbol) {
	return makeBoolean(symbol.isSymbol() && (NIL != fboundp(symbol)));
    }

    public static final SubLObject record_api_request_alt(SubLObject api_request) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $record_api_messagesP$.getDynamicValue(thread)) {
		if ($api_message_sink$.getDynamicValue(thread).isStream()) {
		    prin1(api_request, $api_message_sink$.getDynamicValue(thread));
		    terpri($api_message_sink$.getDynamicValue(thread));
		    force_output($api_message_sink$.getDynamicValue(thread));
		} else {
		    if ($api_message_sink$.getDynamicValue(thread).isList()) {
			$api_message_sink$.setDynamicValue(cons(api_request, $api_message_sink$.getDynamicValue(thread)), thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject record_api_request(final SubLObject api_request) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $record_api_messagesP$.getDynamicValue(thread)) {
	    if ($api_message_sink$.getDynamicValue(thread).isStream()) {
		prin1(api_request, $api_message_sink$.getDynamicValue(thread));
		terpri($api_message_sink$.getDynamicValue(thread));
		force_output($api_message_sink$.getDynamicValue(thread));
	    } else if ($api_message_sink$.getDynamicValue(thread).isList()) {
		$api_message_sink$.setDynamicValue(cons(api_request, $api_message_sink$.getDynamicValue(thread)), thread);
	    }

	}
	return NIL;
    }

    public static final SubLObject record_api_result_alt(SubLObject result, SubLObject errorP) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $record_api_messagesP$.getDynamicValue(thread)) {
		if ($api_message_sink$.getDynamicValue(thread).isStream()) {
		    com.cyc.cycjava.cycl.api_kernel.default_api_output_protocol($api_message_sink$.getDynamicValue(thread), result, errorP);
		} else {
		    if ($api_message_sink$.getDynamicValue(thread).isList()) {
			$api_message_sink$.setDynamicValue(cons(list(errorP, result), $api_message_sink$.getDynamicValue(thread)), thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject record_api_result(final SubLObject result, final SubLObject errorP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $record_api_messagesP$.getDynamicValue(thread)) {
	    if ($api_message_sink$.getDynamicValue(thread).isStream()) {
		default_api_output_protocol($api_message_sink$.getDynamicValue(thread), result, errorP);
	    } else if ($api_message_sink$.getDynamicValue(thread).isList()) {
		$api_message_sink$.setDynamicValue(cons(list(errorP, result), $api_message_sink$.getDynamicValue(thread)), thread);
	    }

	}
	return NIL;
    }

    public static final SubLObject perform_api_request_alt(SubLObject api_request) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    fi.reset_fi_error_state();
	    {
		SubLObject result = eval_in_api.cyc_api_eval(api_request);
		if (NIL != fi.fi_error_signaledP()) {
		    Errors.error(fi.fi_get_error_string_int());
		}
		if (NIL != $api_result_method$.getDynamicValue(thread)) {
		    result = funcall($api_result_method$.getDynamicValue(thread), result);
		}
		return result;
	    }
	}
    }

    public static SubLObject perform_api_request(final SubLObject api_request) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	fi.reset_fi_error_state();
	SubLObject result = eval_in_api.cyc_api_eval(api_request);
	if (NIL != fi.fi_error_signaledP()) {
	    Errors.error(fi.fi_get_error_string_int());
	}
	if (NIL != $api_result_method$.getDynamicValue(thread)) {
	    result = funcall($api_result_method$.getDynamicValue(thread), result);
	}
	return result;
    }

    /**
     * The API result transformation method used by the DAML application.
     */
    @LispMethod(comment = "The API result transformation method used by the DAML application.")
    public static final SubLObject daml_api_result_transform_alt(SubLObject result) {
	result = cycl_utilities.transform_hl_to_el(result);
	result = transform_list_utilities.transform(result, GUID_P, GUID_TO_STRING, UNPROVIDED);
	return result;
    }

    /**
     * The API result transformation method used by the DAML application.
     */
    @LispMethod(comment = "The API result transformation method used by the DAML application.")
    public static SubLObject daml_api_result_transform(SubLObject result) {
	result = cycl_utilities.transform_hl_to_el(result);
	result = transform_list_utilities.transform(result, GUID_P, GUID_TO_STRING, UNPROVIDED);
	return result;
    }

    /**
     * Send API-RESULT to OUT-STREAM respecting ERROR?.
     */
    @LispMethod(comment = "Send API-RESULT to OUT-STREAM respecting ERROR?.")
    public static final SubLObject send_api_result_alt(SubLObject out_stream, SubLObject api_result, SubLObject errorP) {
	{
	    SubLObject recursive_error = NIL;
	    SubLObject ans = NIL;
	    try {
		{
		    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
		    try {
			bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
			try {
			    try {
				add(ONE_INTEGER, TWO_INTEGER);
			    } finally {
				{
				    SubLObject _prev_bind_0_3 = currentBinding($is_thread_performing_cleanupP$);
				    try {
					bind($is_thread_performing_cleanupP$, T);
					ans = funcall(com.cyc.cycjava.cycl.api_kernel.api_output_protocol(), out_stream, api_result, errorP);
				    } finally {
					rebind($is_thread_performing_cleanupP$, _prev_bind_0_3);
				    }
				}
			    }
			} catch (Throwable catch_var) {
			    Errors.handleThrowable(catch_var, NIL);
			}
		    } finally {
			rebind(Errors.$error_handler$, _prev_bind_0);
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		recursive_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    }
	    if (NIL != recursive_error) {
		com.cyc.cycjava.cycl.api_kernel.api_quit();
	    }
	    return ans;
	}
    }

    /**
     * Send API-RESULT to OUT-STREAM respecting ERROR?.
     */
    @LispMethod(comment = "Send API-RESULT to OUT-STREAM respecting ERROR?.")
    public static SubLObject send_api_result(final SubLObject out_stream, final SubLObject api_result, final SubLObject errorP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject recursive_error = NIL;
	SubLObject ans = NIL;
	try {
	    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
	    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
	    try {
		Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		try {
		    try {
			add(ONE_INTEGER, TWO_INTEGER);
		    } finally {
			final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
			    $is_thread_performing_cleanupP$.bind(T, thread);
			    final SubLObject _values = getValuesAsVector();
			    ans = funcall(api_output_protocol(), out_stream, api_result, errorP);
			    restoreValuesFromVector(_values);
			} finally {
			    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
			}
		    }
		} catch (final Throwable catch_var) {
		    Errors.handleThrowable(catch_var, NIL);
		}
	    } finally {
		Errors.$error_handler$.rebind(_prev_bind_0, thread);
	    }
	} catch (final Throwable ccatch_env_var) {
	    recursive_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	} finally {
	    thread.throwStack.pop();
	}
	if (NIL != recursive_error) {
	    api_quit();
	}
	return ans;
    }

    public static final SubLObject default_api_input_protocol_alt(SubLObject in_stream, SubLObject eof_error_p, SubLObject eof_token) {
	if (eof_error_p == UNPROVIDED) {
	    eof_error_p = T;
	}
	if (eof_token == UNPROVIDED) {
	    eof_token = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_answer = NIL;
		{
		    SubLObject _prev_bind_0 = $read_require_constant_exists$.currentBinding(thread);
		    try {
			$read_require_constant_exists$.bind(NIL, thread);
			v_answer = read(in_stream, eof_error_p, eof_token, UNPROVIDED);
		    } finally {
			$read_require_constant_exists$.rebind(_prev_bind_0, thread);
		    }
		}
		string_utilities.read_whitespace_no_hang(in_stream, NIL, UNPROVIDED);
		return v_answer;
	    }
	}
    }

    public static SubLObject default_api_input_protocol(final SubLObject in_stream, SubLObject eof_error_p, SubLObject eof_token) {
	if (eof_error_p == UNPROVIDED) {
	    eof_error_p = T;
	}
	if (eof_token == UNPROVIDED) {
	    eof_token = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject v_answer = NIL;
	final SubLObject _prev_bind_0 = $read_require_constant_exists$.currentBinding(thread);
	try {
	    $read_require_constant_exists$.bind(NIL, thread);
	    v_answer = read(in_stream, eof_error_p, eof_token, UNPROVIDED);
	} finally {
	    $read_require_constant_exists$.rebind(_prev_bind_0, thread);
	}
	string_utilities.read_whitespace_no_hang(in_stream, NIL, UNPROVIDED);
	return v_answer;
    }

    public static final SubLObject default_api_output_protocol_alt(SubLObject out_stream, SubLObject api_result, SubLObject errorP) {
	if (errorP == UNPROVIDED) {
	    errorP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject result_code = (NIL != errorP) ? ((SubLObject) ($api_error_code$.getDynamicValue(thread))) : $api_success_code$.getDynamicValue(thread);
		format(out_stream, $str_alt28$_D__S, result_code, api_result);
	    }
	    string_utilities.network_terpri(out_stream);
	    force_output(out_stream);
	    return api_result;
	}
    }

    public static SubLObject default_api_output_protocol(final SubLObject out_stream, final SubLObject api_result, SubLObject errorP) {
	if (errorP == UNPROVIDED) {
	    errorP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject result_code = (NIL != errorP) ? $api_error_code$.getDynamicValue(thread) : $api_success_code$.getDynamicValue(thread);
	format(out_stream, $str29$_D__S, result_code, api_result);
	string_utilities.network_terpri(out_stream);
	force_output(out_stream);
	return api_result;
    }

    /**
     * Change the API input and output protocols.
     */
    @LispMethod(comment = "Change the API input and output protocols.")
    public static final SubLObject change_api_protocol_alt(SubLObject new_input_protocol, SubLObject new_output_protocol) {
	if (new_input_protocol.isFunctionSpec() && new_output_protocol.isFunctionSpec()) {
	    $new_api_input_protocol$.setDynamicValue(new_input_protocol);
	    $new_api_output_protocol$.setDynamicValue(new_output_protocol);
	    return T;
	}
	return NIL;
    }

    /**
     * Change the API input and output protocols.
     */
    @LispMethod(comment = "Change the API input and output protocols.")
    public static SubLObject change_api_protocol(final SubLObject new_input_protocol, final SubLObject new_output_protocol) {
	if (new_input_protocol.isFunctionSpec() && new_output_protocol.isFunctionSpec()) {
	    $new_api_input_protocol$.setDynamicValue(new_input_protocol);
	    $new_api_output_protocol$.setDynamicValue(new_output_protocol);
	    return T;
	}
	return NIL;
    }

    /**
     * Change the API result method to FUNCTION.
     */
    @LispMethod(comment = "Change the API result method to FUNCTION.")
    public static final SubLObject change_api_result_method_alt(SubLObject function) {
	SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
	$api_result_method$.setDynamicValue(function);
	return function;
    }

    /**
     * Change the API result method to FUNCTION.
     */
    @LispMethod(comment = "Change the API result method to FUNCTION.")
    public static SubLObject change_api_result_method(final SubLObject function) {
	assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
	$api_result_method$.setDynamicValue(function);
	return function;
    }

    public static final SubLObject update_api_protocol_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL != $new_api_input_protocol$.getDynamicValue(thread)) && (NIL != $new_api_output_protocol$.getDynamicValue(thread))) {
		com.cyc.cycjava.cycl.api_kernel.set_api_input_protocol($new_api_input_protocol$.getDynamicValue(thread));
		com.cyc.cycjava.cycl.api_kernel.set_api_output_protocol($new_api_output_protocol$.getDynamicValue(thread));
		$new_api_input_protocol$.setDynamicValue(NIL, thread);
		$new_api_output_protocol$.setDynamicValue(NIL, thread);
	    }
	    return NIL;
	}
    }

    public static SubLObject update_api_protocol() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL != $new_api_input_protocol$.getDynamicValue(thread)) && (NIL != $new_api_output_protocol$.getDynamicValue(thread))) {
	    set_api_input_protocol($new_api_input_protocol$.getDynamicValue(thread));
	    set_api_output_protocol($new_api_output_protocol$.getDynamicValue(thread));
	    $new_api_input_protocol$.setDynamicValue(NIL, thread);
	    $new_api_output_protocol$.setDynamicValue(NIL, thread);
	}
	return NIL;
    }

    public static final SubLObject api_input_protocol_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $api_input_protocol$.getDynamicValue(thread);
	}
    }

    public static SubLObject api_input_protocol() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $api_input_protocol$.getDynamicValue(thread);
    }

    public static final SubLObject api_output_protocol_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $api_output_protocol$.getDynamicValue(thread);
	}
    }

    public static SubLObject api_output_protocol() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $api_output_protocol$.getDynamicValue(thread);
    }

    public static final SubLObject set_api_input_protocol_alt(SubLObject input_protocol) {
	SubLTrampolineFile.checkType(input_protocol, FUNCTION_SPEC_P);
	$api_input_protocol$.setDynamicValue(input_protocol);
	return T;
    }

    public static SubLObject set_api_input_protocol(final SubLObject input_protocol) {
	assert NIL != function_spec_p(input_protocol) : "! function_spec_p(input_protocol) " + ("Types.function_spec_p(input_protocol) " + "CommonSymbols.NIL != Types.function_spec_p(input_protocol) ") + input_protocol;
	$api_input_protocol$.setDynamicValue(input_protocol);
	return T;
    }

    public static final SubLObject set_api_output_protocol_alt(SubLObject output_protocol) {
	SubLTrampolineFile.checkType(output_protocol, FUNCTION_SPEC_P);
	$api_output_protocol$.setDynamicValue(output_protocol);
	return T;
    }

    public static SubLObject set_api_output_protocol(final SubLObject output_protocol) {
	assert NIL != function_spec_p(output_protocol) : "! function_spec_p(output_protocol) " + ("Types.function_spec_p(output_protocol) " + "CommonSymbols.NIL != Types.function_spec_p(output_protocol) ") + output_protocol;
	$api_output_protocol$.setDynamicValue(output_protocol);
	return T;
    }

    /**
     * Returns the local api-port according to defined system parameters.
     */
    @LispMethod(comment = "Returns the local api-port according to defined system parameters.")
    public static final SubLObject api_port_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$fi_port_offset$.getDynamicValue(thread));
	}
    }

    /**
     * Returns the local api-port according to defined system parameters.
     */
    @LispMethod(comment = "Returns the local api-port according to defined system parameters.")
    public static SubLObject api_port() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$fi_port_offset$.getDynamicValue(thread));
    }

    /**
     * Evaluate API-REQUEST on MACHINE using the CYC-API server at TCP PORT
     */
    @LispMethod(comment = "Evaluate API-REQUEST on MACHINE using the CYC-API server at TCP PORT")
    public static final SubLObject cyc_api_remote_eval(SubLObject api_request, SubLObject machine, SubLObject port) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(api_request, CONSP);
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
			    SubLObject result_4 = com.cyc.cycjava.cycl.api_kernel.cyc_api_channel_eval_internal(api_request, channel);
			    SubLObject valid_5 = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    result = result_4;
			    valid = valid_5;
			}
			princ($str_alt34$_api_quit__, channel);
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
		    return Errors.error($str_alt35$_A, result);
		}
		return result;
	    }
	}
    }

    public static SubLObject cyc_api_remote_eval(final SubLObject api_request, final SubLObject machine, final SubLObject port, SubLObject timeout) {
	if (timeout == UNPROVIDED) {
	    timeout = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLTrampolineFile.enforceType(api_request, CONSP);
	SubLTrampolineFile.enforceType(machine, STRINGP);
	SubLTrampolineFile.enforceType(port, INTEGERP);
	SubLObject result = NIL;
	SubLObject valid = NIL;
	SubLObject channel = NIL;
	try {
	    channel = subl_promotions.open_tcp_stream_with_timeout(machine, port, timeout, $PRIVATE);
	    if (NIL != validate_tcp_connection(channel, machine, port)) {
		thread.resetMultipleValues();
		final SubLObject result_$4 = cyc_api_channel_eval_internal(api_request, channel);
		final SubLObject valid_$5 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		result = result_$4;
		valid = valid_$5;
		princ($str35$_api_quit__, channel);
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
	    return Errors.error($str36$_A, result);
	}
	return result;
    }

    /**
     * Evaluate API-REQUEST via the TCP CHANNEL to a CYC-API.
     */
    @LispMethod(comment = "Evaluate API-REQUEST via the TCP CHANNEL to a CYC-API.")
    public static final SubLObject cyc_api_channel_eval_alt(SubLObject api_request, SubLObject channel) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(channel, STREAMP);
	    thread.resetMultipleValues();
	    {
		SubLObject result = com.cyc.cycjava.cycl.api_kernel.cyc_api_channel_eval_internal(api_request, channel);
		SubLObject valid = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == valid) {
		    return Errors.error($str_alt35$_A, result);
		}
		return result;
	    }
	}
    }

    /**
     * Evaluate API-REQUEST via the TCP CHANNEL to a CYC-API.
     */
    @LispMethod(comment = "Evaluate API-REQUEST via the TCP CHANNEL to a CYC-API.")
    public static SubLObject cyc_api_channel_eval(final SubLObject api_request, final SubLObject channel) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != streamp(channel) : "! streamp(channel) " + ("Types.streamp(channel) " + "CommonSymbols.NIL != Types.streamp(channel) ") + channel;
	thread.resetMultipleValues();
	final SubLObject result = cyc_api_channel_eval_internal(api_request, channel);
	final SubLObject valid = thread.secondMultipleValue();
	thread.resetMultipleValues();
	if (NIL == valid) {
	    return Errors.error($str36$_A, result);
	}
	return result;
    }

    static private final SubLString $str_alt7$Explicitly_quit_this_api_connecti = makeString("Explicitly quit this api connection.");

    public static final SubLObject cyc_api_channel_eval_internal_alt(SubLObject api_request, SubLObject channel) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    com.cyc.cycjava.cycl.api_kernel.cyc_api_channel_output(api_request, channel);
	    force_output(channel);
	    {
		SubLObject result_code = com.cyc.cycjava.cycl.api_kernel.cyc_api_channel_input(channel, $api_success_code$.getDynamicValue(thread));
		SubLObject result = com.cyc.cycjava.cycl.api_kernel.cyc_api_channel_input(channel, $cyc_api_eof_exception$.getGlobalValue());
		return values(result, makeBoolean(!result_code.eql($api_error_code$.getDynamicValue(thread))));
	    }
	}
    }

    public static SubLObject cyc_api_channel_eval_internal(final SubLObject api_request, final SubLObject channel) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	cyc_api_channel_output(api_request, channel);
	force_output(channel);
	final SubLObject result_code = cyc_api_channel_input(channel, $api_success_code$.getDynamicValue(thread));
	final SubLObject result = cyc_api_channel_input(channel, $cyc_api_eof_exception$.getGlobalValue());
	return values(result, makeBoolean(!result_code.eql($api_error_code$.getDynamicValue(thread))));
    }

    static private final SubLList $list_alt12 = list(list(makeSymbol("*API-INPUT-PROTOCOL*"), makeSymbol("*DEFAULT-API-INPUT-PROTOCOL*")), list(makeSymbol("*API-VALIDATE-METHOD*"), makeSymbol("*DEFAULT-API-VALIDATE-METHOD*")),
	    list(makeSymbol("*API-RESULT-METHOD*"), makeSymbol("*DEFAULT-API-RESULT-METHOD*")), list(makeSymbol("*API-OUTPUT-PROTOCOL*"), makeSymbol("*DEFAULT-API-OUTPUT-PROTOCOL*")));

    public static final SubLObject cyc_api_channel_output_alt(SubLObject v_object, SubLObject channel) {
	return format(channel, $str_alt42$_S_, v_object);
    }

    public static SubLObject cyc_api_channel_output(final SubLObject v_object, final SubLObject channel) {
	return format(channel, $str43$_S_, v_object);
    }

    public static final SubLObject cyc_api_channel_input_alt(SubLObject channel, SubLObject eof_value) {
	return read_ignoring_errors(channel, NIL, eof_value);
    }

    public static SubLObject cyc_api_channel_input(final SubLObject channel, final SubLObject eof_value) {
	return read_ignoring_errors(channel, NIL, eof_value);
    }

    public static final SubLObject fi_server_top_level_alt(SubLObject in_stream, SubLObject out_stream) {
	return com.cyc.cycjava.cycl.api_kernel.api_server_top_level(in_stream, out_stream);
    }

    public static SubLObject fi_server_top_level(final SubLObject in_stream, final SubLObject out_stream) {
	return api_server_top_level(in_stream, out_stream);
    }

    static private final SubLList $list_alt16 = list(makeSymbol("FUNCTION"), makeSymbol("REQUEST"), makeSymbol("ID"), makeSymbol("PRIORITY"), makeSymbol("REQUESTOR"), makeSymbol("CLIENT-BINDINGS"), makeSymbol("UUID-STRING"));

    public static final SubLObject fi_quit_alt() {
	return com.cyc.cycjava.cycl.api_kernel.api_quit();
    }

    public static SubLObject fi_quit() {
	return api_quit();
    }

    public static final SubLObject fi_port_alt() {
	return com.cyc.cycjava.cycl.api_kernel.api_port();
    }

    public static SubLObject fi_port() {
	return api_port();
    }

    public static final SubLObject declare_api_kernel_file_alt() {
	declareFunction("api_server_handler", "API-SERVER-HANDLER", 2, 0, false);
	declareFunction("api_server_top_level", "API-SERVER-TOP-LEVEL", 2, 0, false);
	declareFunction("api_quit", "API-QUIT", 0, 0, false);
	declareFunction("abort_api_server_process", "ABORT-API-SERVER-PROCESS", 1, 0, false);
	declareMacro("with_api_protocol_bindings", "WITH-API-PROTOCOL-BINDINGS");
	declareFunction("api_server_loop", "API-SERVER-LOOP", 2, 0, false);
	declareFunction("api_server_one_complete_request", "API-SERVER-ONE-COMPLETE-REQUEST", 2, 0, false);
	declareFunction("read_api_request", "READ-API-REQUEST", 1, 0, false);
	declareFunction("validate_api_request", "VALIDATE-API-REQUEST", 1, 0, false);
	declareFunction("default_validate_api_request", "DEFAULT-VALIDATE-API-REQUEST", 1, 0, false);
	declareFunction("valid_api_function_symbol", "VALID-API-FUNCTION-SYMBOL", 1, 0, false);
	declareFunction("record_api_request", "RECORD-API-REQUEST", 1, 0, false);
	declareFunction("record_api_result", "RECORD-API-RESULT", 2, 0, false);
	declareFunction("perform_api_request", "PERFORM-API-REQUEST", 1, 0, false);
	declareFunction("daml_api_result_transform", "DAML-API-RESULT-TRANSFORM", 1, 0, false);
	declareFunction("send_api_result", "SEND-API-RESULT", 3, 0, false);
	declareFunction("default_api_input_protocol", "DEFAULT-API-INPUT-PROTOCOL", 1, 2, false);
	declareFunction("default_api_output_protocol", "DEFAULT-API-OUTPUT-PROTOCOL", 2, 1, false);
	declareFunction("change_api_protocol", "CHANGE-API-PROTOCOL", 2, 0, false);
	declareFunction("change_api_result_method", "CHANGE-API-RESULT-METHOD", 1, 0, false);
	declareFunction("update_api_protocol", "UPDATE-API-PROTOCOL", 0, 0, false);
	declareFunction("api_input_protocol", "API-INPUT-PROTOCOL", 0, 0, false);
	declareFunction("api_output_protocol", "API-OUTPUT-PROTOCOL", 0, 0, false);
	declareFunction("set_api_input_protocol", "SET-API-INPUT-PROTOCOL", 1, 0, false);
	declareFunction("set_api_output_protocol", "SET-API-OUTPUT-PROTOCOL", 1, 0, false);
	declareFunction("api_port", "API-PORT", 0, 0, false);
	declareFunction("cyc_api_remote_eval", "CYC-API-REMOTE-EVAL", 3, 0, false);
	declareFunction("cyc_api_channel_eval", "CYC-API-CHANNEL-EVAL", 2, 0, false);
	declareFunction("cyc_api_channel_eval_internal", "CYC-API-CHANNEL-EVAL-INTERNAL", 2, 0, false);
	declareFunction("cyc_api_channel_output", "CYC-API-CHANNEL-OUTPUT", 2, 0, false);
	declareFunction("cyc_api_channel_input", "CYC-API-CHANNEL-INPUT", 2, 0, false);
	declareFunction("fi_server_top_level", "FI-SERVER-TOP-LEVEL", 2, 0, false);
	declareFunction("fi_quit", "FI-QUIT", 0, 0, false);
	declareFunction("fi_port", "FI-PORT", 0, 0, false);
	return NIL;
    }

    public static SubLObject declare_api_kernel_file() {
	if (SubLFiles.USE_V1) {
	    declareFunction("api_server_handler", "API-SERVER-HANDLER", 2, 0, false);
	    declareFunction("api_server_top_level", "API-SERVER-TOP-LEVEL", 2, 0, false);
	    declareFunction("api_quit", "API-QUIT", 0, 0, false);
	    declareFunction("abort_api_server_process", "ABORT-API-SERVER-PROCESS", 1, 0, false);
	    declareMacro("with_api_protocol_bindings", "WITH-API-PROTOCOL-BINDINGS");
	    declareFunction("api_server_loop", "API-SERVER-LOOP", 2, 0, false);
	    declareFunction("api_fake_server_loop_one_step", "API-FAKE-SERVER-LOOP-ONE-STEP", 2, 0, false);
	    declareFunction("api_server_one_complete_request", "API-SERVER-ONE-COMPLETE-REQUEST", 2, 0, false);
	    declareFunction("read_api_request", "READ-API-REQUEST", 1, 0, false);
	    declareFunction("validate_api_request", "VALIDATE-API-REQUEST", 1, 0, false);
	    declareFunction("default_validate_api_request", "DEFAULT-VALIDATE-API-REQUEST", 1, 0, false);
	    declareFunction("valid_api_function_symbol", "VALID-API-FUNCTION-SYMBOL", 1, 0, false);
	    declareFunction("record_api_request", "RECORD-API-REQUEST", 1, 0, false);
	    declareFunction("record_api_result", "RECORD-API-RESULT", 2, 0, false);
	    declareFunction("perform_api_request", "PERFORM-API-REQUEST", 1, 0, false);
	    declareFunction("daml_api_result_transform", "DAML-API-RESULT-TRANSFORM", 1, 0, false);
	    declareFunction("send_api_result", "SEND-API-RESULT", 3, 0, false);
	    declareFunction("default_api_input_protocol", "DEFAULT-API-INPUT-PROTOCOL", 1, 2, false);
	    declareFunction("default_api_output_protocol", "DEFAULT-API-OUTPUT-PROTOCOL", 2, 1, false);
	    declareFunction("change_api_protocol", "CHANGE-API-PROTOCOL", 2, 0, false);
	    declareFunction("change_api_result_method", "CHANGE-API-RESULT-METHOD", 1, 0, false);
	    declareFunction("update_api_protocol", "UPDATE-API-PROTOCOL", 0, 0, false);
	    declareFunction("api_input_protocol", "API-INPUT-PROTOCOL", 0, 0, false);
	    declareFunction("api_output_protocol", "API-OUTPUT-PROTOCOL", 0, 0, false);
	    declareFunction("set_api_input_protocol", "SET-API-INPUT-PROTOCOL", 1, 0, false);
	    declareFunction("set_api_output_protocol", "SET-API-OUTPUT-PROTOCOL", 1, 0, false);
	    declareFunction("api_port", "API-PORT", 0, 0, false);
	    declareFunction("cyc_api_remote_eval", "CYC-API-REMOTE-EVAL", 3, 1, false);
	    declareFunction("cyc_api_channel_eval", "CYC-API-CHANNEL-EVAL", 2, 0, false);
	    declareFunction("cyc_api_channel_eval_internal", "CYC-API-CHANNEL-EVAL-INTERNAL", 2, 0, false);
	    declareFunction("cyc_api_channel_output", "CYC-API-CHANNEL-OUTPUT", 2, 0, false);
	    declareFunction("cyc_api_channel_input", "CYC-API-CHANNEL-INPUT", 2, 0, false);
	    declareFunction("fi_server_top_level", "FI-SERVER-TOP-LEVEL", 2, 0, false);
	    declareFunction("fi_quit", "FI-QUIT", 0, 0, false);
	    declareFunction("fi_port", "FI-PORT", 0, 0, false);
	}
	if (SubLFiles.USE_V2) {
	    declareFunction("cyc_api_remote_eval", "CYC-API-REMOTE-EVAL", 3, 0, false);
	}
	return NIL;
    }

    public static SubLObject declare_api_kernel_file_Previous() {
	declareFunction("api_server_handler", "API-SERVER-HANDLER", 2, 0, false);
	declareFunction("api_server_top_level", "API-SERVER-TOP-LEVEL", 2, 0, false);
	declareFunction("api_quit", "API-QUIT", 0, 0, false);
	declareFunction("abort_api_server_process", "ABORT-API-SERVER-PROCESS", 1, 0, false);
	declareMacro("with_api_protocol_bindings", "WITH-API-PROTOCOL-BINDINGS");
	declareFunction("api_server_loop", "API-SERVER-LOOP", 2, 0, false);
	declareFunction("api_fake_server_loop_one_step", "API-FAKE-SERVER-LOOP-ONE-STEP", 2, 0, false);
	declareFunction("api_server_one_complete_request", "API-SERVER-ONE-COMPLETE-REQUEST", 2, 0, false);
	declareFunction("read_api_request", "READ-API-REQUEST", 1, 0, false);
	declareFunction("validate_api_request", "VALIDATE-API-REQUEST", 1, 0, false);
	declareFunction("default_validate_api_request", "DEFAULT-VALIDATE-API-REQUEST", 1, 0, false);
	declareFunction("valid_api_function_symbol", "VALID-API-FUNCTION-SYMBOL", 1, 0, false);
	declareFunction("record_api_request", "RECORD-API-REQUEST", 1, 0, false);
	declareFunction("record_api_result", "RECORD-API-RESULT", 2, 0, false);
	declareFunction("perform_api_request", "PERFORM-API-REQUEST", 1, 0, false);
	declareFunction("daml_api_result_transform", "DAML-API-RESULT-TRANSFORM", 1, 0, false);
	declareFunction("send_api_result", "SEND-API-RESULT", 3, 0, false);
	declareFunction("default_api_input_protocol", "DEFAULT-API-INPUT-PROTOCOL", 1, 2, false);
	declareFunction("default_api_output_protocol", "DEFAULT-API-OUTPUT-PROTOCOL", 2, 1, false);
	declareFunction("change_api_protocol", "CHANGE-API-PROTOCOL", 2, 0, false);
	declareFunction("change_api_result_method", "CHANGE-API-RESULT-METHOD", 1, 0, false);
	declareFunction("update_api_protocol", "UPDATE-API-PROTOCOL", 0, 0, false);
	declareFunction("api_input_protocol", "API-INPUT-PROTOCOL", 0, 0, false);
	declareFunction("api_output_protocol", "API-OUTPUT-PROTOCOL", 0, 0, false);
	declareFunction("set_api_input_protocol", "SET-API-INPUT-PROTOCOL", 1, 0, false);
	declareFunction("set_api_output_protocol", "SET-API-OUTPUT-PROTOCOL", 1, 0, false);
	declareFunction("api_port", "API-PORT", 0, 0, false);
	declareFunction("cyc_api_remote_eval", "CYC-API-REMOTE-EVAL", 3, 1, false);
	declareFunction("cyc_api_channel_eval", "CYC-API-CHANNEL-EVAL", 2, 0, false);
	declareFunction("cyc_api_channel_eval_internal", "CYC-API-CHANNEL-EVAL-INTERNAL", 2, 0, false);
	declareFunction("cyc_api_channel_output", "CYC-API-CHANNEL-OUTPUT", 2, 0, false);
	declareFunction("cyc_api_channel_input", "CYC-API-CHANNEL-INPUT", 2, 0, false);
	declareFunction("fi_server_top_level", "FI-SERVER-TOP-LEVEL", 2, 0, false);
	declareFunction("fi_quit", "FI-QUIT", 0, 0, false);
	declareFunction("fi_port", "FI-PORT", 0, 0, false);
	return NIL;
    }

    static private final SubLString $str_alt19$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a proper list");

    static private final SubLString $str_alt20$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a valid API function symbol");

    static private final SubLSymbol $sym21$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    static private final SubLString $str_alt22$___A_is_not_an_existing_constant = makeString("#$~A is not an existing constant");

    static private final SubLString $str_alt23$API_request_references_an_invalid = makeString("API request references an invalid constant");

    static private final SubLString $str_alt28$_D__S = makeString("~D ~S");

    static private final SubLString $str_alt34$_api_quit__ = makeString("(api-quit) ");

    static private final SubLString $str_alt35$_A = makeString("~A");

    static private final SubLList $list_alt37 = list(makeSymbol("API-REQUEST"), makeSymbol("MACHINE"), makeSymbol("PORT"));

    static private final SubLString $str_alt38$Evaluate_API_REQUEST_on_MACHINE_u = makeString("Evaluate API-REQUEST on MACHINE using the CYC-API server at TCP PORT");

    static private final SubLList $list_alt39 = list(list(makeSymbol("API-REQUEST"), makeSymbol("CONSP")), list(makeSymbol("MACHINE"), makeSymbol("STRINGP")), list(makeSymbol("PORT"), makeSymbol("INTEGERP")));

    static private final SubLString $str_alt42$_S_ = makeString("~S ");

    public static final SubLObject init_api_kernel_file_alt() {
	defparameter("*WITHIN-API-SERVER*", NIL);
	defparameter("*DEFAULT-API-INPUT-PROTOCOL*", DEFAULT_API_INPUT_PROTOCOL);
	defparameter("*API-INPUT-PROTOCOL*", $default_api_input_protocol$.getDynamicValue());
	defparameter("*DEFAULT-API-VALIDATE-METHOD*", DEFAULT_VALIDATE_API_REQUEST);
	defparameter("*API-VALIDATE-METHOD*", $default_api_validate_method$.getDynamicValue());
	deflexical("*DEFAULT-API-RESULT-METHOD*", NIL);
	defparameter("*API-RESULT-METHOD*", $default_api_result_method$.getGlobalValue());
	defparameter("*DEFAULT-API-OUTPUT-PROTOCOL*", DEFAULT_API_OUTPUT_PROTOCOL);
	defparameter("*API-OUTPUT-PROTOCOL*", $default_api_output_protocol$.getDynamicValue());
	defparameter("*API-IN-STREAM*", NIL);
	defparameter("*API-OUT-STREAM*", NIL);
	deflexical("*API-INPUT-EOF-MARKER*", NIL != boundp($api_input_eof_marker$) ? ((SubLObject) ($api_input_eof_marker$.getGlobalValue())) : make_symbol($$$API_Input_EOF_Marker));
	defparameter("*RECORD-API-MESSAGES?*", NIL);
	defparameter("*API-MESSAGE-SINK*", NIL);
	defparameter("*API-SUCCESS-CODE*", $int$200);
	defparameter("*API-ERROR-CODE*", $int$500);
	defparameter("*NEW-API-INPUT-PROTOCOL*", NIL);
	defparameter("*NEW-API-OUTPUT-PROTOCOL*", NIL);
	deflexical("*CYC-API-EOF-EXCEPTION*", $EOF);
	return NIL;
    }

    public static SubLObject init_api_kernel_file() {
	if (SubLFiles.USE_V1) {
	    defparameter("*WITHIN-API-SERVER*", NIL);
	    defparameter("*AVOID-API-QUIT?*", NIL);
	    defparameter("*DEFAULT-API-INPUT-PROTOCOL*", DEFAULT_API_INPUT_PROTOCOL);
	    defparameter("*API-INPUT-PROTOCOL*", $default_api_input_protocol$.getDynamicValue());
	    defparameter("*DEFAULT-API-VALIDATE-METHOD*", DEFAULT_VALIDATE_API_REQUEST);
	    defparameter("*API-VALIDATE-METHOD*", $default_api_validate_method$.getDynamicValue());
	    deflexical("*DEFAULT-API-RESULT-METHOD*", NIL);
	    defparameter("*API-RESULT-METHOD*", $default_api_result_method$.getGlobalValue());
	    defparameter("*DEFAULT-API-OUTPUT-PROTOCOL*", DEFAULT_API_OUTPUT_PROTOCOL);
	    defparameter("*API-OUTPUT-PROTOCOL*", $default_api_output_protocol$.getDynamicValue());
	    defparameter("*API-IN-STREAM*", NIL);
	    defparameter("*API-OUT-STREAM*", NIL);
	    deflexical("*API-INPUT-EOF-MARKER*", SubLTrampolineFile.maybeDefault($api_input_eof_marker$, $api_input_eof_marker$, () -> make_symbol($$$API_Input_EOF_Marker)));
	    defparameter("*RECORD-API-MESSAGES?*", NIL);
	    defparameter("*API-MESSAGE-SINK*", NIL);
	    defparameter("*API-SUCCESS-CODE*", $int$200);
	    defparameter("*API-ERROR-CODE*", $int$500);
	    defparameter("*NEW-API-INPUT-PROTOCOL*", NIL);
	    defparameter("*NEW-API-OUTPUT-PROTOCOL*", NIL);
	    deflexical("*CYC-API-EOF-EXCEPTION*", $EOF);
	}
	if (SubLFiles.USE_V2) {
	    deflexical("*API-INPUT-EOF-MARKER*", NIL != boundp($api_input_eof_marker$) ? ((SubLObject) ($api_input_eof_marker$.getGlobalValue())) : make_symbol($$$API_Input_EOF_Marker));
	}
	return NIL;
    }

    public static SubLObject init_api_kernel_file_Previous() {
	defparameter("*WITHIN-API-SERVER*", NIL);
	defparameter("*AVOID-API-QUIT?*", NIL);
	defparameter("*DEFAULT-API-INPUT-PROTOCOL*", DEFAULT_API_INPUT_PROTOCOL);
	defparameter("*API-INPUT-PROTOCOL*", $default_api_input_protocol$.getDynamicValue());
	defparameter("*DEFAULT-API-VALIDATE-METHOD*", DEFAULT_VALIDATE_API_REQUEST);
	defparameter("*API-VALIDATE-METHOD*", $default_api_validate_method$.getDynamicValue());
	deflexical("*DEFAULT-API-RESULT-METHOD*", NIL);
	defparameter("*API-RESULT-METHOD*", $default_api_result_method$.getGlobalValue());
	defparameter("*DEFAULT-API-OUTPUT-PROTOCOL*", DEFAULT_API_OUTPUT_PROTOCOL);
	defparameter("*API-OUTPUT-PROTOCOL*", $default_api_output_protocol$.getDynamicValue());
	defparameter("*API-IN-STREAM*", NIL);
	defparameter("*API-OUT-STREAM*", NIL);
	deflexical("*API-INPUT-EOF-MARKER*", SubLTrampolineFile.maybeDefault($api_input_eof_marker$, $api_input_eof_marker$, () -> make_symbol($$$API_Input_EOF_Marker)));
	defparameter("*RECORD-API-MESSAGES?*", NIL);
	defparameter("*API-MESSAGE-SINK*", NIL);
	defparameter("*API-SUCCESS-CODE*", $int$200);
	defparameter("*API-ERROR-CODE*", $int$500);
	defparameter("*NEW-API-INPUT-PROTOCOL*", NIL);
	defparameter("*NEW-API-OUTPUT-PROTOCOL*", NIL);
	deflexical("*CYC-API-EOF-EXCEPTION*", $EOF);
	return NIL;
    }

    public static final SubLObject setup_api_kernel_file_alt() {
	tcp_server_utilities.register_tcp_server_type($CYC_API, API_SERVER_HANDLER, $TEXT);
	register_cyc_api_function(API_QUIT, NIL, $str_alt7$Explicitly_quit_this_api_connecti, NIL, NIL);
	declare_defglobal($api_input_eof_marker$);
	register_cyc_api_function(CYC_API_REMOTE_EVAL, $list_alt37, $str_alt38$Evaluate_API_REQUEST_on_MACHINE_u, $list_alt39, NIL);
	return NIL;
    }

    public static SubLObject setup_api_kernel_file() {
	if (SubLFiles.USE_V1) {
	    tcp_server_utilities.register_tcp_server_type($CYC_API, API_SERVER_HANDLER, $TEXT);
	    register_cyc_api_function(API_QUIT, NIL, $str7$Explicitly_quit_this_api_connecti, NIL, NIL);
	    register_external_symbol(API_FAKE_SERVER_LOOP_ONE_STEP);
	    declare_defglobal($api_input_eof_marker$);
	    register_cyc_api_function(CYC_API_REMOTE_EVAL, $list38, $str39$Evaluate_API_REQUEST_on_MACHINE_u, $list40, NIL);
	}
	if (SubLFiles.USE_V2) {
	    register_cyc_api_function(CYC_API_REMOTE_EVAL, $list_alt37, $str_alt38$Evaluate_API_REQUEST_on_MACHINE_u, $list_alt39, NIL);
	}
	return NIL;
    }

    public static SubLObject setup_api_kernel_file_Previous() {
	tcp_server_utilities.register_tcp_server_type($CYC_API, API_SERVER_HANDLER, $TEXT);
	register_cyc_api_function(API_QUIT, NIL, $str7$Explicitly_quit_this_api_connecti, NIL, NIL);
	register_external_symbol(API_FAKE_SERVER_LOOP_ONE_STEP);
	declare_defglobal($api_input_eof_marker$);
	register_cyc_api_function(CYC_API_REMOTE_EVAL, $list38, $str39$Evaluate_API_REQUEST_on_MACHINE_u, $list40, NIL);
	return NIL;
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
    }
}

/**
 * Total time: 283 ms
 */
