package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.html_kernel;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.html_kernel.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_at;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_percent;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_normal_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class html_kernel extends SubLTranslatedFile {
    public static final SubLFile me = new html_kernel();

    public static final String myName = "com.cyc.cycjava.cycl.html_kernel";

    public static final String myFingerPrint = "4cbe9aad750f11bb144c463e625b1bfe1d9ee00981a4af719fb96e0687ec6300";

    // defparameter
    private static final SubLSymbol $within_html_server$ = makeSymbol("*WITHIN-HTML-SERVER*");

    // defparameter
    private static final SubLSymbol $continue_on_html_error$ = makeSymbol("*CONTINUE-ON-HTML-ERROR*");

    // defparameter
    private static final SubLSymbol $html_server_buffer_size$ = makeSymbol("*HTML-SERVER-BUFFER-SIZE*");

    // defparameter
    public static final SubLSymbol $html_message$ = makeSymbol("*HTML-MESSAGE*");

    // defparameter
    public static final SubLSymbol $monitor_html_action$ = makeSymbol("*MONITOR-HTML-ACTION*");

    // defparameter
    public static final SubLSymbol $record_html_messagesP$ = makeSymbol("*RECORD-HTML-MESSAGES?*");

    // defparameter
    public static final SubLSymbol $html_message_record$ = makeSymbol("*HTML-MESSAGE-RECORD*");

    // defparameter
    public static final SubLSymbol $http_remote_user$ = makeSymbol("*HTTP-REMOTE-USER*");

    // defparameter
    public static final SubLSymbol $http_remote_host$ = makeSymbol("*HTTP-REMOTE-HOST*");



    // defparameter
    /**
     * When this is non-nil, only functions that are in this set will be handled by
     * the html-server
     */
    private static final SubLSymbol $http_restricted_functions$ = makeSymbol("*HTTP-RESTRICTED-FUNCTIONS*");

    // defparameter
    /**
     * Chars to treat as arg separators in HTML messages. #& is the standard
     * character
     */
    private static final SubLSymbol $html_arg_separator_chars$ = makeSymbol("*HTML-ARG-SEPARATOR-CHARS*");

    // defparameter
    // Chars to treat as part of the syntax of HTML messages
    private static final SubLSymbol $html_arg_syntax_char$ = makeSymbol("*HTML-ARG-SYNTAX-CHAR*");

    // defparameter
    private static final SubLSymbol $html_javascript_compatibility_script$ = makeSymbol("*HTML-JAVASCRIPT-COMPATIBILITY-SCRIPT*");

    // defparameter
    private static final SubLSymbol $main_menu_list$ = makeSymbol("*MAIN-MENU-LIST*");





    // deflexical
    // Lock for *HTML-MACHINE-STATE-HASH*
    private static final SubLSymbol $html_machine_state_update_lock$ = makeSymbol("*HTML-MACHINE-STATE-UPDATE-LOCK*");

    // deflexical
    private static final SubLSymbol $machine_is_myself_timeout$ = makeSymbol("*MACHINE-IS-MYSELF-TIMEOUT*");





    public static final SubLSymbol HTML_SERVER_HANDLER = makeSymbol("HTML-SERVER-HANDLER");



    public static final SubLString $$$CYC = makeString("CYC");





    public static final SubLSymbol HTML_QUIT = makeSymbol("HTML-QUIT");

    public static final SubLString $$$dispatcher = makeString("dispatcher");

    public static final SubLString $str8$_S_server = makeString("~S server");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    public static final SubLString $str12$ = makeString("");

    public static final SubLSymbol $default_html_handler$ = makeSymbol("*DEFAULT-HTML-HANDLER*");

    public static final SubLString $$$No_handler_function_was_specified = makeString("No handler function was specified");

    public static final SubLString $str15$No_handler_for_function__A_is_def = makeString("No handler for function ~A is defined");

    private static final SubLString $str16$_S_is_not_an_CGI_handler_function = makeString("~S is not an CGI handler function");

    public static final SubLString $str17$___A_called_a_bogus_function___Me = makeString("~%~A called a bogus function.  Message: ~S");

    private static final SubLString $str18$___A__A_calls__A_on_args__A______ = makeString("~&~A ~A calls ~A on args ~A ...~%");



    private static final SubLString $str20$___A_Finished_call_to__A_for__A__ = makeString("~&~A Finished call to ~A for ~A.~%");

    private static final SubLString $str21$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str22$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLString $str25$HTML_Transfer_halted_due_to_scrip = makeString("HTML Transfer halted due to script error:");

    private static final SubLString $str26$_A___ = makeString("~A.~%");



    private static final SubLSymbol HTML_ARG_SYNTAX_CHAR = makeSymbol("HTML-ARG-SYNTAX-CHAR");

    private static final SubLString $str29$__ = makeString("&|");

    private static final SubLSymbol HTML_ARG_SEPARATOR_CHAR = makeSymbol("HTML-ARG-SEPARATOR-CHAR");

    private static final SubLString $str31$_ = makeString("=");

    private static final SubLString $$$Browser_Setup = makeString("Browser Setup");

    private static final SubLString $str33$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");

    private static final SubLString $str34$0__ = makeString("0,*");





    private static final SubLString $str37$Frames_and_JavaScript_are_not_Sup = makeString("Frames and JavaScript are not Supported");

    private static final SubLSymbol CB_SETUP = makeSymbol("CB-SETUP");



    private static final SubLString $str40$Frames_Supported__JavaScript_eith = makeString("Frames Supported, JavaScript either not Supported or Disabled");

    private static final SubLSymbol CB_SETUP_FRAME = makeSymbol("CB-SETUP-FRAME");

    private static final SubLString $str42$Frames_Supported_and_JavaScript_E = makeString("Frames Supported and JavaScript Enabled");

    private static final SubLSymbol CB_SETUP_FRAME_SCRIPT = makeSymbol("CB-SETUP-FRAME-SCRIPT");

    private static final SubLSymbol CB_HANDLE_SETUP = makeSymbol("CB-HANDLE-SETUP");



    private static final SubLString $str46$cb_handle_setup = makeString("cb-handle-setup");



    private static final SubLSymbol CB_LINK_HANDLE_SETUP = makeSymbol("CB-LINK-HANDLE-SETUP");

    private static final SubLString $str49$_var_path___location_href__var_ne = makeString("\nvar path = location.href;\nvar new_path = path.substring(path.lastIndexOf(\'/\') + 1, path.length) + \'-script\';\nlocation = new_path;\n");

    private static final SubLString $str50$___ = makeString("// ");

    private static final SubLString $$$Click_here_now = makeString("Click here now");

    private static final SubLString $str52$_now_to_optimally_configure_the_i = makeString(" now to optimally configure the interface for your browser's capabilities.");

    private static final SubLList $list53 = list(cons(makeString("cb-setup"), makeString("Browser Setup")), cons(makeString("cb-start"), makeString("KB Browser")), cons(makeString("cb-start|hb-start"), makeString("Hierarchy Browser")), cons(makeString("cb-start|cyc-navigator"), makeString("Cyc Navigator")), cons(makeString("cb-start|cb-login"), makeString("User Login")));

    private static final SubLString $$$Cyc_Main_Menu = makeString("Cyc Main Menu");

    private static final SubLString $$$Cyc_Documentation = makeString("Cyc Documentation");

    private static final SubLSymbol $sym56$STRING_ = makeSymbol("STRING<");



    private static final SubLString $str58$_A_ = makeString("~A?");

    private static final SubLSymbol MAIN_MENU = makeSymbol("MAIN-MENU");

    private static final SubLString $$$Main_Menu = makeString("Main Menu");

    private static final SubLString $str61$main_menu = makeString("main-menu");



    private static final SubLSymbol CB_LINK_MAIN_MENU = makeSymbol("CB-LINK-MAIN-MENU");

    private static final SubLSymbol MOSAIC_MAIN_MENU = makeSymbol("MOSAIC-MAIN-MENU");

    private static final SubLSymbol MENU = makeSymbol("MENU");

    public static final SubLSymbol $html_machine_state_lock$ = makeSymbol("*HTML-MACHINE-STATE-LOCK*");

    private static final SubLSymbol HTML_MACHINE_STATE_ITEM_VARIABLE = makeSymbol("HTML-MACHINE-STATE-ITEM-VARIABLE");

    private static final SubLString $$$HTML_State = makeString("HTML State");

    private static final SubLSymbol $html_machine_state_hash$ = makeSymbol("*HTML-MACHINE-STATE-HASH*");

    private static final SubLString $$$HTML_Machine_State = makeString("HTML Machine State");



    private static final SubLString $$$unknown = makeString("unknown");

    private static final SubLString $str73$___S____S = makeString("~%~S = ~S");

    private static final SubLSymbol HTML_MACHINE_STATE_ITEM_VALUE = makeSymbol("HTML-MACHINE-STATE-ITEM-VALUE");



    private static final SubLString $str76$Could_not_find_state_variable__S_ = makeString("Could not find state variable ~S for ~S");

    private static final SubLString $str77$Could_not_find_state_for_machine_ = makeString("Could not find state for machine ~S");

    private static final SubLSymbol $the_cyclist$ = makeSymbol("*THE-CYCLIST*");

    private static final SubLString $$$Remote_User = makeString("Remote User");

    private static final SubLString $str80$The_remote_user_is__A_at__A_ = makeString("The remote user is ~A at ~A.");

    private static final SubLSymbol SHOW_REMOTE_USER = makeSymbol("SHOW-REMOTE-USER");

    private static final SubLString $str82$127_0_0_1 = makeString("127.0.0.1");

    private static final SubLString $$$localhost = makeString("localhost");

    private static final SubLString $str84$localhost_localdomain = makeString("localhost.localdomain");

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol MACHINE_IS_MYSELF_VIA_CYC_API = makeSymbol("MACHINE-IS-MYSELF-VIA-CYC-API");



    private static final SubLList $list88 = list(list(makeSymbol("CYC-IMAGE-ID")));

    private static final SubLSymbol $machine_is_myself_via_cyc_api_caching_state$ = makeSymbol("*MACHINE-IS-MYSELF-VIA-CYC-API-CACHING-STATE*");



    private static final SubLString $str91$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str92$_S = makeString("~S");



    private static final SubLString $str94$_S________A__ = makeString("~S ~%    ~A~%");









    public static SubLObject html_server_handler(final SubLObject in_stream, final SubLObject out_stream) {
        return html_server_top_level(in_stream, out_stream);
    }

    public static SubLObject html_server_top_level(final SubLObject in_stream, final SubLObject out_stream) {
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
                    thread.throwStack.push($HTML_QUIT);
                    final SubLObject _prev_bind_0_$1 = $within_html_server$.currentBinding(thread);
                    try {
                        $within_html_server$.bind(T, thread);
                        html_server_one_complete_request(in_stream, out_stream);
                    } finally {
                        $within_html_server$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $HTML_QUIT);
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

    public static SubLObject html_quit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_html_server$.getDynamicValue(thread)) {
            sublisp_throw($HTML_QUIT, NIL);
        }
        return NIL;
    }

    public static SubLObject abort_html_client_process(final SubLObject process) {
        return interrupt_process(process, symbol_function(HTML_QUIT));
    }

    public static SubLObject abort_html_server_process(final SubLObject process) {
        return abort_html_client_process(process);
    }

    public static SubLObject abort_all_html_client_processes() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!process.eql(current_process())) && (NIL != html_client_process_p(process))) {
                abort_html_client_process(process);
                total = add(total, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return total;
    }

    public static SubLObject html_client_process_p(final SubLObject process) {
        if (NIL != processp(process)) {
            final SubLObject name = process_name(process);
            if ((NIL == search($$$dispatcher, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != search(format(NIL, $str8$_S_server, html_port()), name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject html_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$html_port_offset$.getDynamicValue(thread));
    }

    public static SubLObject html_server_one_complete_request(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject html_message = read_html_value(in_stream);
            handle_html_message_to_stream(html_message, out_stream);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            force_output(out_stream);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                } finally {
                    thread.throwStack.pop();
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject handle_html_message_to_stream(final SubLObject html_message, SubLObject out_stream) {
        if (out_stream == UNPROVIDED) {
            out_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $continue_on_html_error$.currentBinding(thread);
        try {
            html_macros.$html_stream$.bind(out_stream, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            $continue_on_html_error$.bind(T, thread);
            v_answer = handle_html_message(html_message);
        } finally {
            $continue_on_html_error$.rebind(_prev_bind_3, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject read_html_value(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = $str12$;
        final SubLObject buffer = Strings.make_string($html_server_buffer_size$.getDynamicValue(thread), CHAR_space);
        SubLObject index = ZERO_INTEGER;
        SubLObject v_char;
        for (v_char = NIL, v_char = read_char(stream, NIL, CHAR_hash, UNPROVIDED); !v_char.eql(CHAR_hash); v_char = read_char(stream, NIL, CHAR_hash, UNPROVIDED)) {
            if (index.numE($html_server_buffer_size$.getDynamicValue(thread))) {
                v_answer = cconcatenate(v_answer, buffer);
                index = ZERO_INTEGER;
            }
            Strings.set_char(buffer, index, v_char);
            index = add(index, ONE_INTEGER);
        }
        v_answer = cconcatenate(v_answer, string_utilities.substring(buffer, ZERO_INTEGER, index));
        return v_answer;
    }

    public static SubLObject handle_last_html_message() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return handle_html_message($html_message$.getDynamicValue(thread));
    }

    public static SubLObject handle_html_message(final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $html_message$.setDynamicValue(message, thread);
        if (NIL != $record_html_messagesP$.getDynamicValue(thread)) {
            $html_message_record$.setDynamicValue(cons(copy_seq(message), $html_message_record$.getDynamicValue(thread)), thread);
        }
        thread.resetMultipleValues();
        final SubLObject user = prelim_parse_html_message(message);
        final SubLObject host = thread.secondMultipleValue();
        final SubLObject function_name = thread.thirdMultipleValue();
        final SubLObject arg_index = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject handled_ok = NIL;
        final SubLObject _prev_bind_0 = $http_remote_user$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $http_remote_host$.currentBinding(thread);
        try {
            $http_remote_user$.bind(user, thread);
            $http_remote_host$.bind(host, thread);
            final SubLObject state_var = html_machine_state(http_state_key_for_request());
            final SubLObject lock_var = html_machine_state_lock(state_var);
            SubLObject v_variables = NIL;
            SubLObject values = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_var);
                v_variables = html_machine_state_variables(state_var);
                values = html_machine_state_values(state_var);
            } finally {
                if (NIL != release) {
                    release_lock(lock_var);
                }
            }
            final SubLObject cprogv_var = v_variables;
            final ArrayList old_values = extract_dynamic_values(cprogv_var);
            try {
                bind_dynamic_vars(cprogv_var, values);
                SubLObject function_symbol = (NIL != function_name) ? find_symbol(function_name, UNPROVIDED) : $default_html_handler$.getGlobalValue();
                if (NIL == http_function_allowedP(function_symbol)) {
                    function_symbol = NIL;
                }
                if ((NIL == function_name) && (NIL == function_symbol)) {
                    handle_error_during_html($$$No_handler_function_was_specified);
                } else
                    if (NIL == function_symbol) {
                        handle_error_during_html(format(NIL, $str15$No_handler_for_function__A_is_def, function_name));
                    } else
                        if (NIL == fboundp(function_symbol)) {
                            handle_error_during_html(format(NIL, $str15$No_handler_for_function__A_is_def, function_name));
                        } else
                            if (NIL == html_macros.cgi_handler_functionP(function_symbol)) {
                                handle_error_during_html(format(NIL, $str16$_S_is_not_an_CGI_handler_function, function_symbol));
                            } else {
                                handle_html_message_internal(user, host, function_symbol, message, arg_index);
                                handled_ok = T;
                            }



                snapshot_html_state(state_var);
            } finally {
                rebind_dynamic_vars(cprogv_var, old_values);
            }
        } finally {
            $http_remote_host$.rebind(_prev_bind_2, thread);
            $http_remote_user$.rebind(_prev_bind_0, thread);
        }
        if ((NIL == handled_ok) && (NIL != $monitor_html_action$.getDynamicValue(thread))) {
            format(T, $str17$___A_called_a_bogus_function___Me, host, message);
            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject handle_html_message_internal(final SubLObject user, final SubLObject host, final SubLObject function_symbol, final SubLObject message, final SubLObject arg_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject args = generate_html_args_from_message_info(function_symbol, message, arg_index);
            if (NIL != $monitor_html_action$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str18$___A__A_calls__A_on_args__A______, numeric_date_utilities.timestring(UNPROVIDED), host, function_symbol, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != $continue_on_html_error$.getDynamicValue(thread)) {
                SubLObject error_message = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            process_utilities.current_process_note_form(bq_cons(function_symbol, append(args, NIL)));
                            funcall(symbol_function(function_symbol), args);
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
                    handle_error_during_html(error_message);
                }
            } else {
                funcall(symbol_function(function_symbol), args);
            }
            if (NIL != $monitor_html_action$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str20$___A_Finished_call_to__A_for__A__, numeric_date_utilities.timestring(UNPROVIDED), function_symbol, host, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            force_output(html_macros.$html_stream$.getDynamicValue(thread));
                            process_utilities.current_process_clear_form();
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                } finally {
                    thread.throwStack.pop();
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    public static SubLObject handle_error_during_html(final SubLObject error_message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (NIL != open_stream_p(html_macros.$html_stream$.getDynamicValue(thread))) {
                        html_markup($str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
                        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup($str22$_meta_http_equiv__X_UA_Compatible);
                        }
                        html_source_readability_terpri(UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                        try {
                            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                            html_markup(html_macros.$html_html_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_br();
                                    html_terpri(TWO_INTEGER);
                                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                                    final SubLObject color_val = $RED;
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != color_val) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(color_val));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str25$HTML_Transfer_halted_due_to_scrip);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                    html_macros.verify_not_within_html_pre();
                                    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$9 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind(T, thread);
                                        html_princ(error_message);
                                    } finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$9, thread);
                                    }
                                    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        } finally {
                            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_source_readability_terpri(UNPROVIDED);
                    } else {
                        format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), $str26$_A___, error_message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
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
        return NIL;
    }

    public static SubLObject initialize_http_restricted_functions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == set.set_p($http_restricted_functions$.getDynamicValue(thread))) {
            $http_restricted_functions$.setDynamicValue(set.new_set(UNPROVIDED, UNPROVIDED), thread);
        }
        return NIL;
    }

    public static SubLObject http_allow_function(final SubLObject function_symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        initialize_http_restricted_functions();
        set.set_add(function_symbol, $http_restricted_functions$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject http_disallow_function(final SubLObject function_symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == set.set_p($http_restricted_functions$.getDynamicValue(thread))) {
            set.set_remove(function_symbol, $http_restricted_functions$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject http_unrestrict_functions() {
        $http_restricted_functions$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject http_function_allowedP(final SubLObject function_symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == $http_restricted_functions$.getDynamicValue(thread)) || (NIL != set.set_memberP(function_symbol, $http_restricted_functions$.getDynamicValue(thread))));
    }

    public static SubLObject prelim_parse_html_message(final SubLObject message) {
        assert NIL != stringp(message) : "Types.stringp(message) " + "CommonSymbols.NIL != Types.stringp(message) " + message;
        final SubLObject host_end = html_arg_separator_position(message, UNPROVIDED);
        final SubLObject X_idx = position(CHAR_at, message, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, host_end);
        SubLObject user = NIL;
        if (NIL != X_idx) {
            user = subseq(message, ZERO_INTEGER, X_idx);
        }
        if (NIL != host_end) {
            final SubLObject host = Strings.nstring_downcase(string_utilities.substring(message, NIL != X_idx ? add(X_idx, ONE_INTEGER) : ZERO_INTEGER, host_end), UNPROVIDED, UNPROVIDED);
            final SubLObject function_name_start = add(host_end, ONE_INTEGER);
            final SubLObject function_name_end = position_if(symbol_function(HTML_ARG_SYNTAX_CHAR), message, symbol_function(IDENTITY), function_name_start, UNPROVIDED);
            SubLObject function_name = NIL;
            SubLObject arg_index = NIL;
            if (NIL != function_name_end) {
                function_name = string_utilities.substring(message, function_name_start, function_name_end);
                arg_index = add(function_name_end, ONE_INTEGER);
            } else {
                function_name = string_utilities.substring(message, function_name_start, NIL);
            }
            if (function_name.isString()) {
                if (length(function_name).numE(ZERO_INTEGER)) {
                    function_name = NIL;
                } else {
                    function_name = Strings.nstring_upcase(function_name, UNPROVIDED, UNPROVIDED);
                }
            }
            return values(user, host, function_name, arg_index);
        }
        return values(user, Strings.nstring_downcase(message, UNPROVIDED, UNPROVIDED), NIL, NIL);
    }

    public static SubLObject handler_function_from_html_message(final SubLObject html_message) {
        final SubLObject handler_name = nth_value_step_2(nth_value_step_1(TWO_INTEGER), prelim_parse_html_message(html_message));
        final SubLObject handler = (NIL != handler_name) ? find_symbol(handler_name, UNPROVIDED) : NIL;
        return handler;
    }

    public static SubLObject generate_html_args_from_message_info(final SubLObject function_symbol, final SubLObject message, final SubLObject arg_index) {
        return parse_html_handler_arg_string(message, arg_index);
    }

    public static SubLObject html_arg_separator_char(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return find(v_char, $html_arg_separator_chars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject html_arg_separator_position(final SubLObject string, SubLObject start_position) {
        if (start_position == UNPROVIDED) {
            start_position = ZERO_INTEGER;
        }
        return position_if(symbol_function(HTML_ARG_SEPARATOR_CHAR), string, symbol_function(IDENTITY), start_position, NIL);
    }

    public static SubLObject html_arg_syntax_char(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return find(v_char, $html_arg_syntax_char$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject parse_html_handler_arg_string(final SubLObject arg_string, final SubLObject arg_start_position) {
        if ((NIL == arg_start_position) || arg_start_position.numE(length(arg_string))) {
            return NIL;
        }
        SubLObject args = NIL;
        SubLObject next_arg_start;
        SubLObject next_arg_end;
        for (next_arg_start = NIL, next_arg_end = NIL, next_arg_start = arg_start_position, next_arg_end = html_arg_separator_position(arg_string, next_arg_start); NIL != next_arg_end; next_arg_end = html_arg_separator_position(arg_string, next_arg_start)) {
            args = cons(parse_one_html_handler_arg(arg_string, next_arg_start, next_arg_end), args);
            next_arg_start = add(next_arg_end, ONE_INTEGER);
        }
        args = cons(parse_one_html_handler_arg(arg_string, next_arg_start, next_arg_end), args);
        return nreverse(args);
    }

    public static SubLObject parse_one_html_handler_arg(final SubLObject arg_string, final SubLObject arg_start, final SubLObject arg_end) {
        final SubLObject input_arg_pos = html_input_arg_position(arg_string, arg_start, arg_end);
        if (NIL != input_arg_pos) {
            return list(frob_html_string(arg_string, arg_start, input_arg_pos), frob_html_string(arg_string, add(input_arg_pos, ONE_INTEGER), arg_end));
        }
        return frob_html_string(arg_string, arg_start, arg_end);
    }

    public static SubLObject html_input_arg_position(final SubLObject arg_string, final SubLObject arg_start, final SubLObject arg_end) {
        return position(CHAR_equal, arg_string, symbol_function(EQL), symbol_function(IDENTITY), arg_start, arg_end);
    }

    public static SubLObject frob_html_string(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == end) {
            end = length(string);
        }
        SubLObject new_length = ZERO_INTEGER;
        SubLObject next_idx;
        for (SubLObject idx = start; idx.numL(end); idx = next_idx , new_length = add(new_length, ONE_INTEGER)) {
            thread.resetMultipleValues();
            final SubLObject ch = get_frobbed_character(string, idx, end);
            next_idx = thread.secondMultipleValue();
            thread.resetMultipleValues();
        }
        SubLObject new_string = Strings.make_string(new_length, UNPROVIDED);
        SubLObject new_idx = ZERO_INTEGER;
        SubLObject idx2;
        SubLObject non_asciiP;
        SubLObject ch2;
        SubLObject next_idx2;
        for (idx2 = start, non_asciiP = NIL; idx2.numL(end); idx2 = next_idx2 , non_asciiP = makeBoolean((NIL != non_asciiP) || (NIL != unicode_strings.non_ascii_char_p(ch2)))) {
            thread.resetMultipleValues();
            ch2 = get_frobbed_character(string, idx2, end);
            next_idx2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            Strings.set_char(new_string, new_idx, ch2);
            new_idx = add(new_idx, ONE_INTEGER);
        }
        if (NIL != non_asciiP) {
            final SubLObject code_vector = unicode_strings.subl_string_to_char_code_vector(new_string);
            if (NIL == unicode_strings.utf8_vector_string_p(code_vector)) {
                new_string = unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(code_vector, UNPROVIDED, UNPROVIDED));
            }
        }
        return new_string;
    }

    public static SubLObject get_frobbed_character(final SubLObject string, final SubLObject start, final SubLObject end) {
        final SubLObject ch = Strings.sublisp_char(string, start);
        if (NIL != charE(ch, CHAR_plus)) {
            return values(CHAR_space, add(start, ONE_INTEGER));
        }
        if ((NIL == charE(ch, CHAR_percent)) || subtract(end, start).numL(THREE_INTEGER)) {
            return values(ch, add(start, ONE_INTEGER));
        }
        final SubLObject high = digit_char_p(Strings.sublisp_char(string, add(start, ONE_INTEGER)), SIXTEEN_INTEGER);
        final SubLObject low = digit_char_p(Strings.sublisp_char(string, add(start, TWO_INTEGER)), SIXTEEN_INTEGER);
        if ((NIL != high) && (NIL != low)) {
            return values(code_char(add(multiply(high, SIXTEEN_INTEGER), low)), add(start, THREE_INTEGER));
        }
        return values(ch, add(start, ONE_INTEGER));
    }

    public static SubLObject cb_setup(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Browser_Setup);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (NIL != html_macros.html_inside_body_p()) {
                Errors.error($str33$Cannot_have_a_FRAMESET_tag_inside);
            }
            html_markup(html_macros.$html_frameset_head$.getGlobalValue());
            html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str34$0__);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_frameset_frameborder$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_frame($EMPTY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cb_frame($SETUP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
            }
            html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_no_frames_head$.getGlobalValue());
            html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_markup(ONE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($str37$Frames_and_JavaScript_are_not_Sup);
            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_markup(ONE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            cb_setup_results();
            html_copyright_notice();
            html_markup(html_macros.$html_no_frames_tail$.getGlobalValue());
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_setup_frame(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_javascript_compatibility_script();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Browser_Setup);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($str40$Frames_Supported__JavaScript_eith);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_setup_results();
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$11, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_setup_frame_script(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Browser_Setup);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$13 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($str42$Frames_Supported_and_JavaScript_E);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_setup_results();
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$13, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_handle_setup(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        setup_browser_capabilities();
        return main_menu(args);
    }

    public static SubLObject cb_link_handle_setup(final SubLObject linktext) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($TOP);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str46$cb_handle_setup);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject html_javascript_compatibility_script() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_comment_head$.getGlobalValue());
            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_terpri(UNPROVIDED);
                html_markup($html_javascript_compatibility_script$.getDynamicValue(thread));
                html_princ($str50$___);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
            }
            html_markup(html_macros.$html_comment_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_setup_results() {
        cb_link($HANDLE_SETUP, $$$Click_here_now, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_princ($str52$_now_to_optimally_configure_the_i);
        html_newline(TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_browser_capabilities() {
        return NIL;
    }

    public static SubLObject main_menu(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Cyc_Main_Menu);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($$$Cyc_Main_Menu);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject pairs = copy_list($main_menu_list$.getDynamicValue(thread));
                        SubLObject sorted_pairs = NIL;
                        if (system_parameters.$cyc_documentation_url$.getDynamicValue(thread).isString()) {
                            final SubLObject item_var = bq_cons(cyc_documentation_toc(), $$$Cyc_Documentation);
                            if (NIL == member(item_var, pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                pairs = cons(item_var, pairs);
                            }
                        }
                        SubLObject cdolist_list_var;
                        sorted_pairs = cdolist_list_var = Sort.sort(pairs, symbol_function($sym56$STRING_), symbol_function(CDR));
                        SubLObject pair = NIL;
                        pair = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (pair.rest().equalp($$$Cyc_Documentation)) {
                                html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_princ(cyc_documentation_toc());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Cyc_Documentation);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                }
                                html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            } else {
                                html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str58$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    html_princ(pair.first());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(pair.rest());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            pair = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$16, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_main_menu(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Main_Menu;
        }
        final SubLObject frame_name_var = cb_frame_name($TOP);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str61$main_menu);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject mosaic_main_menu(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return main_menu(args);
    }

    public static SubLObject menu(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return main_menu(args);
    }

    public static SubLObject make_html_machine_state_item(final SubLObject variable, final SubLObject value) {
        return list(variable, value);
    }

    public static SubLObject html_machine_state_item_variable(final SubLObject item) {
        return item.first();
    }

    public static SubLObject html_machine_state_item_value(final SubLObject item) {
        return second(item);
    }

    public static SubLObject reset_html_machine_state_item_value(final SubLObject item, final SubLObject new_value) {
        set_nth(ONE_INTEGER, item, new_value);
        return new_value;
    }

    public static SubLObject html_machine_state_lock(final SubLObject state) {
        return html_machine_state_item_value(find($html_machine_state_lock$, state, symbol_function(EQL), symbol_function(HTML_MACHINE_STATE_ITEM_VARIABLE), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject initialize_html_machine_state_lock(final SubLObject new_state) {
        final SubLObject lock_state_item = find($html_machine_state_lock$, new_state, symbol_function(EQL), symbol_function(HTML_MACHINE_STATE_ITEM_VARIABLE), UNPROVIDED, UNPROVIDED);
        reset_html_machine_state_item_value(lock_state_item, make_lock($$$HTML_State));
        return NIL;
    }

    public static SubLObject html_machine_state(final SubLObject machine) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject state = gethash(machine, $html_machine_state_hash$.getGlobalValue(), UNPROVIDED);
        final SubLObject cached = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != cached) {
            return state;
        }
        state = new_html_state();
        SubLObject release = NIL;
        try {
            release = seize_lock($html_machine_state_update_lock$.getGlobalValue());
            sethash(machine, $html_machine_state_hash$.getGlobalValue(), state);
        } finally {
            if (NIL != release) {
                release_lock($html_machine_state_update_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static SubLObject machines_with_html_state() {
        SubLObject v_answer = NIL;
        v_answer = hash_table_utilities.hash_table_keys($html_machine_state_hash$.getGlobalValue());
        v_answer = Sort.sort(v_answer, symbol_function(STRING_LESSP), UNPROVIDED);
        return v_answer;
    }

    public static SubLObject clear_html_state_for_machine(final SubLObject machine) {
        SubLObject v_answer = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($html_machine_state_update_lock$.getGlobalValue());
            v_answer = remhash(machine, $html_machine_state_hash$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($html_machine_state_update_lock$.getGlobalValue());
            }
        }
        return v_answer;
    }

    public static SubLObject clear_all_html_state() {
        SubLObject release = NIL;
        try {
            release = seize_lock($html_machine_state_update_lock$.getGlobalValue());
            clrhash($html_machine_state_hash$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($html_machine_state_update_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject html_state_for_machine(final SubLObject machine) {
        return gethash(machine, $html_machine_state_hash$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject http_state_key_for_request() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $http_remote_user$.getDynamicValue(thread)) {
            return $http_remote_user$.getDynamicValue(thread);
        }
        if (NIL != $http_remote_host$.getDynamicValue(thread)) {
            return $http_remote_host$.getDynamicValue(thread);
        }
        return $$$unknown;
    }

    public static SubLObject print_html_state(SubLObject machine) {
        if (machine == UNPROVIDED) {
            machine = http_state_key_for_request();
        }
        SubLObject cdolist_list_var;
        final SubLObject state = cdolist_list_var = html_machine_state(machine);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str73$___S____S, html_machine_state_item_variable(item), html_machine_state_item_value(item));
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject new_html_state() {
        SubLObject new_state = NIL;
        SubLObject cdolist_list_var = $html_state_variables$.getGlobalValue();
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = symbol_value(variable);
            new_state = cons(make_html_machine_state_item(variable, value), new_state);
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        new_state = nreverse(new_state);
        initialize_html_machine_state_lock(new_state);
        return new_state;
    }

    public static SubLObject html_machine_state_variables(final SubLObject state) {
        return Mapping.mapcar(symbol_function(HTML_MACHINE_STATE_ITEM_VARIABLE), state);
    }

    public static SubLObject html_machine_state_values(final SubLObject state) {
        return Mapping.mapcar(symbol_function(HTML_MACHINE_STATE_ITEM_VALUE), state);
    }

    public static SubLObject add_html_state_variable(final SubLObject variable) {
        SubLObject machine = NIL;
        SubLObject state = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($html_machine_state_hash$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                machine = getEntryKey(cdohash_entry);
                state = getEntryValue(cdohash_entry);
                if (NIL == find(variable, state, symbol_function(EQL), symbol_function(HTML_MACHINE_STATE_ITEM_VARIABLE), UNPROVIDED, UNPROVIDED)) {
                    sethash(machine, $html_machine_state_hash$.getGlobalValue(), cons(make_html_machine_state_item(variable, NIL), state));
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject html_var_value(final SubLObject variable, final SubLObject machine) {
        assert NIL != symbolp(variable) : "Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) " + variable;
        assert NIL != stringp(machine) : "Types.stringp(machine) " + "CommonSymbols.NIL != Types.stringp(machine) " + machine;
        final SubLObject state = html_machine_state(machine);
        if (NIL != state) {
            final SubLObject item = find(variable, state, symbol_function(EQL), symbol_function(HTML_MACHINE_STATE_ITEM_VARIABLE), UNPROVIDED, UNPROVIDED);
            if (NIL != item) {
                return html_machine_state_item_value(item);
            }
            Errors.warn($str76$Could_not_find_state_variable__S_, variable, machine);
        } else {
            Errors.warn($str77$Could_not_find_state_for_machine_, machine);
        }
        return NIL;
    }

    public static SubLObject attach_html_var(final SubLObject variable, final SubLObject machine, SubLObject value) {
        if (value == UNPROVIDED) {
            value = eval(variable);
        }
        assert NIL != symbolp(variable) : "Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) " + variable;
        assert NIL != stringp(machine) : "Types.stringp(machine) " + "CommonSymbols.NIL != Types.stringp(machine) " + machine;
        final SubLObject state = html_machine_state(machine);
        if (NIL != state) {
            final SubLObject item = find(variable, state, symbol_function(EQL), symbol_function(HTML_MACHINE_STATE_ITEM_VARIABLE), UNPROVIDED, UNPROVIDED);
            if (NIL != item) {
                reset_html_machine_state_item_value(item, value);
            } else {
                Errors.warn($str76$Could_not_find_state_variable__S_, variable, machine);
            }
        } else {
            Errors.warn($str77$Could_not_find_state_for_machine_, machine);
        }
        return NIL;
    }

    public static SubLObject attach_all_html_var(final SubLObject variable, SubLObject value) {
        if (value == UNPROVIDED) {
            value = eval(variable);
        }
        assert NIL != symbolp(variable) : "Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) " + variable;
        SubLObject machine = NIL;
        SubLObject state = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($html_machine_state_hash$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                machine = getEntryKey(cdohash_entry);
                state = getEntryValue(cdohash_entry);
                if (NIL != state) {
                    final SubLObject item = find(variable, state, symbol_function(EQL), symbol_function(HTML_MACHINE_STATE_ITEM_VARIABLE), UNPROVIDED, UNPROVIDED);
                    if (NIL == item) {
                        continue;
                    }
                    reset_html_machine_state_item_value(item, value);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject snapshot_html_state(final SubLObject state) {
        final SubLObject lock = html_machine_state_lock(state);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            SubLObject cdolist_list_var = state;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject symbol = html_machine_state_item_variable(item);
                reset_html_machine_state_item_value(item, symbol_value(symbol));
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return NIL;
    }

    public static SubLObject html_interface_users() {
        final SubLObject machines = machines_with_html_state();
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = machines;
        SubLObject machine = NIL;
        machine = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject user = html_var_value($the_cyclist$, machine);
            v_answer = cons(list(machine, user), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            machine = cdolist_list_var.first();
        } 
        return nreverse(v_answer);
    }

    public static SubLObject show_remote_user(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Remote_User);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$23 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($$$Remote_User);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str80$The_remote_user_is__A_at__A_, $http_remote_user$.getDynamicValue(thread), $http_remote_host$.getDynamicValue(thread));
                    html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$23, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_attempt_auto_login(final SubLObject machine) {
        if (NIL != current_machine_name_p(machine)) {
            final SubLObject cyclist = kb_accessors.guess_the_cyclist_from_user_name(UNPROVIDED);
            if (NIL != forts.fort_p(cyclist)) {
                final SubLObject state_var = html_machine_state(machine);
                final SubLObject lock_var = html_machine_state_lock(state_var);
                SubLObject v_variables = NIL;
                SubLObject values = NIL;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock_var);
                    v_variables = html_machine_state_variables(state_var);
                    values = html_machine_state_values(state_var);
                } finally {
                    if (NIL != release) {
                        release_lock(lock_var);
                    }
                }
                final SubLObject cprogv_var = v_variables;
                final ArrayList old_values = extract_dynamic_values(cprogv_var);
                try {
                    bind_dynamic_vars(cprogv_var, values);
                    cb_system_tools.cb_set_the_cyclist(cyclist);
                    snapshot_html_state(state_var);
                } finally {
                    rebind_dynamic_vars(cprogv_var, old_values);
                }
                return cyclist;
            }
        }
        return NIL;
    }

    public static SubLObject current_machine_name_p(final SubLObject machine) {
        return makeBoolean(machine.isString() && ((((machine.equal($str82$127_0_0_1) || machine.equal($$$localhost)) || machine.equal($str84$localhost_localdomain)) || machine.equal(Environment.get_network_name(UNPROVIDED))) || machine.equal(Environment.get_machine_name(UNPROVIDED))));
    }

    public static SubLObject clear_machine_is_myself_via_cyc_api() {
        final SubLObject cs = $machine_is_myself_via_cyc_api_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_machine_is_myself_via_cyc_api(final SubLObject machine_name) {
        return memoization_state.caching_state_remove_function_results_with_args($machine_is_myself_via_cyc_api_caching_state$.getGlobalValue(), list(machine_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject machine_is_myself_via_cyc_api_internal(final SubLObject machine_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(machine_name) : "Types.stringp(machine_name) " + "CommonSymbols.NIL != Types.stringp(machine_name) " + machine_name;
        SubLObject myselfP = NIL;
        if (NIL == myselfP) {
            SubLObject csome_list_var = tcp_server_utilities.all_tcp_servers();
            SubLObject tcp_server = NIL;
            tcp_server = csome_list_var.first();
            while ((NIL == myselfP) && (NIL != csome_list_var)) {
                SubLObject timed_outP = NIL;
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$25 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$26 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer($machine_is_myself_timeout$.getGlobalValue(), tag);
                                            if ($CYC_API == tcp_server_utilities.tcp_server_type(tcp_server)) {
                                                final SubLObject port = tcp_server_utilities.tcp_server_port(tcp_server);
                                                final SubLObject my_image_id = cyc_image_id();
                                                myselfP = api_kernel.cyc_api_remote_eval(listS(EQUAL, my_image_id, $list88), machine_name, port, UNPROVIDED);
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$26, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$25, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
                csome_list_var = csome_list_var.rest();
                tcp_server = csome_list_var.first();
            } 
        }
        return myselfP;
    }

    public static SubLObject machine_is_myself_via_cyc_api(final SubLObject machine_name) {
        SubLObject caching_state = $machine_is_myself_via_cyc_api_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MACHINE_IS_MYSELF_VIA_CYC_API, $machine_is_myself_via_cyc_api_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, machine_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(machine_is_myself_via_cyc_api_internal(machine_name)));
            memoization_state.caching_state_put(caching_state, machine_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject save_html_state_to_file(final SubLObject filename, final SubLObject var_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        SubLObject saved = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str91$Unable_to_open__S, filename);
            }
            final SubLObject stream_$28 = stream;
            SubLObject cdolist_list_var = var_list;
            SubLObject var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (var.isSymbol()) {
                    final SubLObject value = eval(var);
                    final SubLObject printed_value = format(NIL, $str92$_S, value);
                    thread.resetMultipleValues();
                    final SubLObject re_read_value = read_from_string_ignoring_errors(printed_value, NIL, NIL, UNPROVIDED, UNPROVIDED);
                    final SubLObject error = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((!error.eql($ERROR)) && re_read_value.equal(value)) {
                        format(stream_$28, $str94$_S________A__, var, printed_value);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
            saved = T;
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return saved;
    }

    public static SubLObject restore_html_state_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        if (NIL == Filesys.probe_file(filename)) {
            return values(NIL, file_utilities.why_not_probe_fileP(filename));
        }
        SubLObject restored = NIL;
        SubLObject error_message = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str91$Unable_to_open__S, filename);
            }
            final SubLObject stream_$29 = stream;
            SubLObject var = NIL;
            SubLObject value = NIL;
            SubLObject done = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        while (NIL == done) {
                            var = read(stream_$29, NIL, $EOF, UNPROVIDED);
                            done = eq(var, $EOF);
                            if (NIL == done) {
                                value = read(stream_$29, NIL, $EOF, UNPROVIDED);
                                done = eq(value, $EOF);
                                if (((NIL != done) || (!var.isSymbol())) || (NIL == member(var, $html_state_variables$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                                    continue;
                                }
                                eval(list(CSETQ, var, list(QUOTE, value)));
                            }
                        } 
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
                restored = T;
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return values(restored, error_message);
    }

    public static SubLObject declare_html_kernel_file() {
        declareFunction(me, "html_server_handler", "HTML-SERVER-HANDLER", 2, 0, false);
        declareFunction(me, "html_server_top_level", "HTML-SERVER-TOP-LEVEL", 2, 0, false);
        declareFunction(me, "html_quit", "HTML-QUIT", 0, 0, false);
        declareFunction(me, "abort_html_client_process", "ABORT-HTML-CLIENT-PROCESS", 1, 0, false);
        declareFunction(me, "abort_html_server_process", "ABORT-HTML-SERVER-PROCESS", 1, 0, false);
        declareFunction(me, "abort_all_html_client_processes", "ABORT-ALL-HTML-CLIENT-PROCESSES", 0, 0, false);
        declareFunction(me, "html_client_process_p", "HTML-CLIENT-PROCESS-P", 1, 0, false);
        declareFunction(me, "html_port", "HTML-PORT", 0, 0, false);
        declareFunction(me, "html_server_one_complete_request", "HTML-SERVER-ONE-COMPLETE-REQUEST", 2, 0, false);
        declareFunction(me, "handle_html_message_to_stream", "HANDLE-HTML-MESSAGE-TO-STREAM", 1, 1, false);
        declareFunction(me, "read_html_value", "READ-HTML-VALUE", 1, 0, false);
        declareFunction(me, "handle_last_html_message", "HANDLE-LAST-HTML-MESSAGE", 0, 0, false);
        declareFunction(me, "handle_html_message", "HANDLE-HTML-MESSAGE", 1, 0, false);
        declareFunction(me, "handle_html_message_internal", "HANDLE-HTML-MESSAGE-INTERNAL", 5, 0, false);
        declareFunction(me, "handle_error_during_html", "HANDLE-ERROR-DURING-HTML", 1, 0, false);
        declareFunction(me, "initialize_http_restricted_functions", "INITIALIZE-HTTP-RESTRICTED-FUNCTIONS", 0, 0, false);
        declareFunction(me, "http_allow_function", "HTTP-ALLOW-FUNCTION", 1, 0, false);
        declareFunction(me, "http_disallow_function", "HTTP-DISALLOW-FUNCTION", 1, 0, false);
        declareFunction(me, "http_unrestrict_functions", "HTTP-UNRESTRICT-FUNCTIONS", 0, 0, false);
        declareFunction(me, "http_function_allowedP", "HTTP-FUNCTION-ALLOWED?", 1, 0, false);
        declareFunction(me, "prelim_parse_html_message", "PRELIM-PARSE-HTML-MESSAGE", 1, 0, false);
        declareFunction(me, "handler_function_from_html_message", "HANDLER-FUNCTION-FROM-HTML-MESSAGE", 1, 0, false);
        declareFunction(me, "generate_html_args_from_message_info", "GENERATE-HTML-ARGS-FROM-MESSAGE-INFO", 3, 0, false);
        declareFunction(me, "html_arg_separator_char", "HTML-ARG-SEPARATOR-CHAR", 1, 0, false);
        declareFunction(me, "html_arg_separator_position", "HTML-ARG-SEPARATOR-POSITION", 1, 1, false);
        declareFunction(me, "html_arg_syntax_char", "HTML-ARG-SYNTAX-CHAR", 1, 0, false);
        declareFunction(me, "parse_html_handler_arg_string", "PARSE-HTML-HANDLER-ARG-STRING", 2, 0, false);
        declareFunction(me, "parse_one_html_handler_arg", "PARSE-ONE-HTML-HANDLER-ARG", 3, 0, false);
        declareFunction(me, "html_input_arg_position", "HTML-INPUT-ARG-POSITION", 3, 0, false);
        declareFunction(me, "frob_html_string", "FROB-HTML-STRING", 1, 2, false);
        declareFunction(me, "get_frobbed_character", "GET-FROBBED-CHARACTER", 3, 0, false);
        declareFunction(me, "cb_setup", "CB-SETUP", 0, 1, false);
        declareFunction(me, "cb_setup_frame", "CB-SETUP-FRAME", 0, 1, false);
        declareFunction(me, "cb_setup_frame_script", "CB-SETUP-FRAME-SCRIPT", 0, 1, false);
        declareFunction(me, "cb_handle_setup", "CB-HANDLE-SETUP", 0, 1, false);
        declareFunction(me, "cb_link_handle_setup", "CB-LINK-HANDLE-SETUP", 1, 0, false);
        declareFunction(me, "html_javascript_compatibility_script", "HTML-JAVASCRIPT-COMPATIBILITY-SCRIPT", 0, 0, false);
        declareFunction(me, "cb_setup_results", "CB-SETUP-RESULTS", 0, 0, false);
        declareFunction(me, "setup_browser_capabilities", "SETUP-BROWSER-CAPABILITIES", 0, 0, false);
        declareFunction(me, "main_menu", "MAIN-MENU", 0, 1, false);
        declareFunction(me, "cb_link_main_menu", "CB-LINK-MAIN-MENU", 0, 1, false);
        declareFunction(me, "mosaic_main_menu", "MOSAIC-MAIN-MENU", 0, 1, false);
        declareFunction(me, "menu", "MENU", 0, 1, false);
        declareFunction(me, "make_html_machine_state_item", "MAKE-HTML-MACHINE-STATE-ITEM", 2, 0, false);
        declareFunction(me, "html_machine_state_item_variable", "HTML-MACHINE-STATE-ITEM-VARIABLE", 1, 0, false);
        declareFunction(me, "html_machine_state_item_value", "HTML-MACHINE-STATE-ITEM-VALUE", 1, 0, false);
        declareFunction(me, "reset_html_machine_state_item_value", "RESET-HTML-MACHINE-STATE-ITEM-VALUE", 2, 0, false);
        declareFunction(me, "html_machine_state_lock", "HTML-MACHINE-STATE-LOCK", 1, 0, false);
        declareFunction(me, "initialize_html_machine_state_lock", "INITIALIZE-HTML-MACHINE-STATE-LOCK", 1, 0, false);
        declareFunction(me, "html_machine_state", "HTML-MACHINE-STATE", 1, 0, false);
        declareFunction(me, "machines_with_html_state", "MACHINES-WITH-HTML-STATE", 0, 0, false);
        declareFunction(me, "clear_html_state_for_machine", "CLEAR-HTML-STATE-FOR-MACHINE", 1, 0, false);
        declareFunction(me, "clear_all_html_state", "CLEAR-ALL-HTML-STATE", 0, 0, false);
        declareFunction(me, "html_state_for_machine", "HTML-STATE-FOR-MACHINE", 1, 0, false);
        declareFunction(me, "http_state_key_for_request", "HTTP-STATE-KEY-FOR-REQUEST", 0, 0, false);
        declareFunction(me, "print_html_state", "PRINT-HTML-STATE", 0, 1, false);
        declareFunction(me, "new_html_state", "NEW-HTML-STATE", 0, 0, false);
        declareFunction(me, "html_machine_state_variables", "HTML-MACHINE-STATE-VARIABLES", 1, 0, false);
        declareFunction(me, "html_machine_state_values", "HTML-MACHINE-STATE-VALUES", 1, 0, false);
        declareFunction(me, "add_html_state_variable", "ADD-HTML-STATE-VARIABLE", 1, 0, false);
        declareFunction(me, "html_var_value", "HTML-VAR-VALUE", 2, 0, false);
        declareFunction(me, "attach_html_var", "ATTACH-HTML-VAR", 2, 1, false);
        declareFunction(me, "attach_all_html_var", "ATTACH-ALL-HTML-VAR", 1, 1, false);
        declareFunction(me, "snapshot_html_state", "SNAPSHOT-HTML-STATE", 1, 0, false);
        declareFunction(me, "html_interface_users", "HTML-INTERFACE-USERS", 0, 0, false);
        declareFunction(me, "show_remote_user", "SHOW-REMOTE-USER", 1, 0, false);
        declareFunction(me, "html_attempt_auto_login", "HTML-ATTEMPT-AUTO-LOGIN", 1, 0, false);
        declareFunction(me, "current_machine_name_p", "CURRENT-MACHINE-NAME-P", 1, 0, false);
        declareFunction(me, "clear_machine_is_myself_via_cyc_api", "CLEAR-MACHINE-IS-MYSELF-VIA-CYC-API", 0, 0, false);
        declareFunction(me, "remove_machine_is_myself_via_cyc_api", "REMOVE-MACHINE-IS-MYSELF-VIA-CYC-API", 1, 0, false);
        declareFunction(me, "machine_is_myself_via_cyc_api_internal", "MACHINE-IS-MYSELF-VIA-CYC-API-INTERNAL", 1, 0, false);
        declareFunction(me, "machine_is_myself_via_cyc_api", "MACHINE-IS-MYSELF-VIA-CYC-API", 1, 0, false);
        declareFunction(me, "save_html_state_to_file", "SAVE-HTML-STATE-TO-FILE", 2, 0, false);
        declareFunction(me, "restore_html_state_from_file", "RESTORE-HTML-STATE-FROM-FILE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_html_kernel_file() {
        defparameter("*WITHIN-HTML-SERVER*", NIL);
        defparameter("*CONTINUE-ON-HTML-ERROR*", NIL);
        defparameter("*HTML-SERVER-BUFFER-SIZE*", $int$100);
        defparameter("*HTML-MESSAGE*", $str12$);
        defparameter("*MONITOR-HTML-ACTION*", NIL);
        defparameter("*RECORD-HTML-MESSAGES?*", NIL);
        defparameter("*HTML-MESSAGE-RECORD*", NIL);
        defparameter("*HTTP-REMOTE-USER*", NIL);
        defparameter("*HTTP-REMOTE-HOST*", NIL);
        deflexical("*DEFAULT-HTML-HANDLER*", SubLTrampolineFile.maybeDefault($default_html_handler$, $default_html_handler$, NIL));
        defparameter("*HTTP-RESTRICTED-FUNCTIONS*", NIL);
        defparameter("*HTML-ARG-SEPARATOR-CHARS*", $str29$__);
        defparameter("*HTML-ARG-SYNTAX-CHAR*", cconcatenate($str31$_, $html_arg_separator_chars$.getDynamicValue()));
        defparameter("*HTML-JAVASCRIPT-COMPATIBILITY-SCRIPT*", $str49$_var_path___location_href__var_ne);
        defparameter("*MAIN-MENU-LIST*", $list53);
        defparameter("*HTML-MACHINE-STATE-LOCK*", NIL);
        deflexical("*HTML-MACHINE-STATE-HASH*", SubLTrampolineFile.maybeDefault($html_machine_state_hash$, $html_machine_state_hash$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQUALP), UNPROVIDED)));
        deflexical("*HTML-MACHINE-STATE-UPDATE-LOCK*", make_lock($$$HTML_Machine_State));
        deflexical("*MACHINE-IS-MYSELF-TIMEOUT*", $float$0_1);
        deflexical("*MACHINE-IS-MYSELF-VIA-CYC-API-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_html_kernel_file() {
        tcp_server_utilities.register_tcp_server_type($HTML, HTML_SERVER_HANDLER, $TEXT);
        declare_defglobal($default_html_handler$);
        html_macros.note_cgi_handler_function(CB_SETUP, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_SETUP_FRAME, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_SETUP_FRAME_SCRIPT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_SETUP, $HTML_HANDLER);
        setup_cb_link_method($HANDLE_SETUP, CB_LINK_HANDLE_SETUP, ONE_INTEGER);
        html_macros.note_cgi_handler_function(MAIN_MENU, $HTML_HANDLER);
        setup_cb_link_method($MAIN_MENU, CB_LINK_MAIN_MENU, ONE_INTEGER);
        html_macros.note_cgi_handler_function(MOSAIC_MAIN_MENU, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(MENU, $HTML_HANDLER);
        register_html_state_variable($html_machine_state_lock$);
        declare_defglobal($html_machine_state_hash$);
        html_macros.note_cgi_handler_function(SHOW_REMOTE_USER, $HTML_HANDLER);
        memoization_state.note_globally_cached_function(MACHINE_IS_MYSELF_VIA_CYC_API);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_html_kernel_file();
    }

    @Override
    public void initializeVariables() {
        init_html_kernel_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_html_kernel_file();
    }

    static {
























































































































    }
}

/**
 * Total time: 620 ms
 */
