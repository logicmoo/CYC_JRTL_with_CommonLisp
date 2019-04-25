package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_kernel extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.html_kernel";
    public static final String myFingerPrint = "4cbe9aad750f11bb144c463e625b1bfe1d9ee00981a4af719fb96e0687ec6300";
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 593L)
    private static SubLSymbol $within_html_server$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 718L)
    private static SubLSymbol $continue_on_html_error$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 3420L)
    private static SubLSymbol $html_server_buffer_size$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 4075L)
    public static SubLSymbol $html_message$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 4194L)
    public static SubLSymbol $monitor_html_action$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 4235L)
    public static SubLSymbol $record_html_messagesP$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 4278L)
    public static SubLSymbol $html_message_record$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 4319L)
    public static SubLSymbol $http_remote_user$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 4358L)
    public static SubLSymbol $http_remote_host$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 4396L)
    private static SubLSymbol $default_html_handler$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 7992L)
    private static SubLSymbol $http_restricted_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 11471L)
    private static SubLSymbol $html_arg_separator_chars$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 11967L)
    private static SubLSymbol $html_arg_syntax_char$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    private static SubLSymbol $html_javascript_compatibility_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    private static SubLSymbol $main_menu_list$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 20079L)
    public static SubLSymbol $html_machine_state_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 20700L)
    private static SubLSymbol $html_machine_state_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 20803L)
    private static SubLSymbol $html_machine_state_update_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 27019L)
    private static SubLSymbol $machine_is_myself_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 27073L)
    private static SubLSymbol $machine_is_myself_via_cyc_api_caching_state$;
    private static final SubLSymbol $kw0$HTML;
    private static final SubLSymbol $sym1$HTML_SERVER_HANDLER;
    private static final SubLSymbol $kw2$TEXT;
    private static final SubLString $str3$CYC;
    private static final SubLSymbol $sym4$DOUBLE_FLOAT;
    private static final SubLSymbol $kw5$HTML_QUIT;
    private static final SubLSymbol $sym6$HTML_QUIT;
    private static final SubLString $str7$dispatcher;
    private static final SubLString $str8$_S_server;
    private static final SubLSymbol $kw9$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym10$IGNORE_ERRORS_HANDLER;
    private static final SubLInteger $int11$100;
    private static final SubLString $str12$;
    private static final SubLSymbol $sym13$_DEFAULT_HTML_HANDLER_;
    private static final SubLString $str14$No_handler_function_was_specified;
    private static final SubLString $str15$No_handler_for_function__A_is_def;
    private static final SubLString $str16$_S_is_not_an_CGI_handler_function;
    private static final SubLString $str17$___A_called_a_bogus_function___Me;
    private static final SubLString $str18$___A__A_calls__A_on_args__A______;
    private static final SubLSymbol $sym19$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str20$___A_Finished_call_to__A_for__A__;
    private static final SubLString $str21$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str22$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw23$UNINITIALIZED;
    private static final SubLSymbol $kw24$RED;
    private static final SubLString $str25$HTML_Transfer_halted_due_to_scrip;
    private static final SubLString $str26$_A___;
    private static final SubLSymbol $sym27$STRINGP;
    private static final SubLSymbol $sym28$HTML_ARG_SYNTAX_CHAR;
    private static final SubLString $str29$__;
    private static final SubLSymbol $sym30$HTML_ARG_SEPARATOR_CHAR;
    private static final SubLString $str31$_;
    private static final SubLString $str32$Browser_Setup;
    private static final SubLString $str33$Cannot_have_a_FRAMESET_tag_inside;
    private static final SubLString $str34$0__;
    private static final SubLSymbol $kw35$EMPTY;
    private static final SubLSymbol $kw36$SETUP;
    private static final SubLString $str37$Frames_and_JavaScript_are_not_Sup;
    private static final SubLSymbol $sym38$CB_SETUP;
    private static final SubLSymbol $kw39$HTML_HANDLER;
    private static final SubLString $str40$Frames_Supported__JavaScript_eith;
    private static final SubLSymbol $sym41$CB_SETUP_FRAME;
    private static final SubLString $str42$Frames_Supported_and_JavaScript_E;
    private static final SubLSymbol $sym43$CB_SETUP_FRAME_SCRIPT;
    private static final SubLSymbol $sym44$CB_HANDLE_SETUP;
    private static final SubLSymbol $kw45$TOP;
    private static final SubLString $str46$cb_handle_setup;
    private static final SubLSymbol $kw47$HANDLE_SETUP;
    private static final SubLSymbol $sym48$CB_LINK_HANDLE_SETUP;
    private static final SubLString $str49$_var_path___location_href__var_ne;
    private static final SubLString $str50$___;
    private static final SubLString $str51$Click_here_now;
    private static final SubLString $str52$_now_to_optimally_configure_the_i;
    private static final SubLList $list53;
    private static final SubLString $str54$Cyc_Main_Menu;
    private static final SubLString $str55$Cyc_Documentation;
    private static final SubLSymbol $sym56$STRING_;
    private static final SubLSymbol $sym57$CDR;
    private static final SubLString $str58$_A_;
    private static final SubLSymbol $sym59$MAIN_MENU;
    private static final SubLString $str60$Main_Menu;
    private static final SubLString $str61$main_menu;
    private static final SubLSymbol $kw62$MAIN_MENU;
    private static final SubLSymbol $sym63$CB_LINK_MAIN_MENU;
    private static final SubLSymbol $sym64$MOSAIC_MAIN_MENU;
    private static final SubLSymbol $sym65$MENU;
    private static final SubLSymbol $sym66$_HTML_MACHINE_STATE_LOCK_;
    private static final SubLSymbol $sym67$HTML_MACHINE_STATE_ITEM_VARIABLE;
    private static final SubLString $str68$HTML_State;
    private static final SubLSymbol $sym69$_HTML_MACHINE_STATE_HASH_;
    private static final SubLString $str70$HTML_Machine_State;
    private static final SubLSymbol $sym71$STRING_LESSP;
    private static final SubLString $str72$unknown;
    private static final SubLString $str73$___S____S;
    private static final SubLSymbol $sym74$HTML_MACHINE_STATE_ITEM_VALUE;
    private static final SubLSymbol $sym75$SYMBOLP;
    private static final SubLString $str76$Could_not_find_state_variable__S_;
    private static final SubLString $str77$Could_not_find_state_for_machine_;
    private static final SubLSymbol $sym78$_THE_CYCLIST_;
    private static final SubLString $str79$Remote_User;
    private static final SubLString $str80$The_remote_user_is__A_at__A_;
    private static final SubLSymbol $sym81$SHOW_REMOTE_USER;
    private static final SubLString $str82$127_0_0_1;
    private static final SubLString $str83$localhost;
    private static final SubLString $str84$localhost_localdomain;
    private static final SubLFloat $float85$0_1;
    private static final SubLSymbol $sym86$MACHINE_IS_MYSELF_VIA_CYC_API;
    private static final SubLSymbol $kw87$CYC_API;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$_MACHINE_IS_MYSELF_VIA_CYC_API_CACHING_STATE_;
    private static final SubLSymbol $kw90$OUTPUT;
    private static final SubLString $str91$Unable_to_open__S;
    private static final SubLString $str92$_S;
    private static final SubLSymbol $kw93$ERROR;
    private static final SubLString $str94$_S________A__;
    private static final SubLSymbol $kw95$INPUT;
    private static final SubLSymbol $kw96$EOF;
    private static final SubLSymbol $sym97$CSETQ;
    private static final SubLSymbol $sym98$QUOTE;
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 869L)
    public static SubLObject html_server_handler(final SubLObject in_stream, final SubLObject out_stream) {
        return html_server_top_level(in_stream, out_stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 1014L)
    public static SubLObject html_server_top_level(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding(thread);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)html_kernel.$str3$CYC), thread);
            reader.$read_default_float_format$.bind((SubLObject)html_kernel.$sym4$DOUBLE_FLOAT, thread);
            print_high.$print_readably$.bind((SubLObject)html_kernel.NIL, thread);
            reader.$read_eval$.bind((SubLObject)html_kernel.NIL, thread);
            final SubLObject old_priority = Threads.process_priority(Threads.current_process());
            try {
                Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                SubLObject catch_var = (SubLObject)html_kernel.NIL;
                try {
                    thread.throwStack.push(html_kernel.$kw5$HTML_QUIT);
                    final SubLObject _prev_bind_0_$1 = html_kernel.$within_html_server$.currentBinding(thread);
                    try {
                        html_kernel.$within_html_server$.bind((SubLObject)html_kernel.T, thread);
                        html_server_one_complete_request(in_stream, out_stream);
                    }
                    finally {
                        html_kernel.$within_html_server$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)html_kernel.$kw5$HTML_QUIT);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_kernel.T, thread);
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
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 1315L)
    public static SubLObject html_quit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_kernel.NIL != html_kernel.$within_html_server$.getDynamicValue(thread)) {
            Dynamic.sublisp_throw((SubLObject)html_kernel.$kw5$HTML_QUIT, (SubLObject)html_kernel.NIL);
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 1457L)
    public static SubLObject abort_html_client_process(final SubLObject process) {
        return Threads.interrupt_process(process, Symbols.symbol_function((SubLObject)html_kernel.$sym6$HTML_QUIT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 1558L)
    public static SubLObject abort_html_server_process(final SubLObject process) {
        return abort_html_client_process(process);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 1671L)
    public static SubLObject abort_all_html_client_processes() {
        SubLObject total = (SubLObject)html_kernel.ZERO_INTEGER;
        SubLObject cdolist_list_var = Threads.all_processes();
        SubLObject process = (SubLObject)html_kernel.NIL;
        process = cdolist_list_var.first();
        while (html_kernel.NIL != cdolist_list_var) {
            if (!process.eql(Threads.current_process()) && html_kernel.NIL != html_client_process_p(process)) {
                abort_html_client_process(process);
                total = Numbers.add(total, (SubLObject)html_kernel.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 2025L)
    public static SubLObject html_client_process_p(final SubLObject process) {
        if (html_kernel.NIL != Types.processp(process)) {
            final SubLObject name = Threads.process_name(process);
            if (html_kernel.NIL == Sequences.search((SubLObject)html_kernel.$str7$dispatcher, name, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED) && html_kernel.NIL != Sequences.search(PrintLow.format((SubLObject)html_kernel.NIL, (SubLObject)html_kernel.$str8$_S_server, html_port()), name, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED)) {
                return (SubLObject)html_kernel.T;
            }
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 2611L)
    public static SubLObject html_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$html_port_offset$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 2761L)
    public static SubLObject html_server_one_complete_request(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject html_message = read_html_value(in_stream);
            handle_html_message_to_stream(html_message, out_stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_kernel.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                SubLObject ignore_errors_tag = (SubLObject)html_kernel.NIL;
                try {
                    thread.throwStack.push(html_kernel.$kw9$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)html_kernel.$sym10$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            streams_high.force_output(out_stream);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)html_kernel.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)html_kernel.$kw9$IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                }
                finally {
                    thread.throwStack.pop();
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 3048L)
    public static SubLObject handle_html_message_to_stream(final SubLObject html_message, SubLObject out_stream) {
        if (out_stream == html_kernel.UNPROVIDED) {
            out_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)html_kernel.NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_kernel.$continue_on_html_error$.currentBinding(thread);
        try {
            html_macros.$html_stream$.bind(out_stream, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)html_kernel.T, thread);
            html_kernel.$continue_on_html_error$.bind((SubLObject)html_kernel.T, thread);
            v_answer = handle_html_message(html_message);
        }
        finally {
            html_kernel.$continue_on_html_error$.rebind(_prev_bind_3, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 3532L)
    public static SubLObject read_html_value(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)html_kernel.$str12$;
        final SubLObject buffer = Strings.make_string(html_kernel.$html_server_buffer_size$.getDynamicValue(thread), (SubLObject)Characters.CHAR_space);
        SubLObject index = (SubLObject)html_kernel.ZERO_INTEGER;
        SubLObject v_char;
        for (v_char = (SubLObject)html_kernel.NIL, v_char = streams_high.read_char(stream, (SubLObject)html_kernel.NIL, (SubLObject)Characters.CHAR_hash, (SubLObject)html_kernel.UNPROVIDED); !v_char.eql((SubLObject)Characters.CHAR_hash); v_char = streams_high.read_char(stream, (SubLObject)html_kernel.NIL, (SubLObject)Characters.CHAR_hash, (SubLObject)html_kernel.UNPROVIDED)) {
            if (index.numE(html_kernel.$html_server_buffer_size$.getDynamicValue(thread))) {
                v_answer = Sequences.cconcatenate(v_answer, buffer);
                index = (SubLObject)html_kernel.ZERO_INTEGER;
            }
            Strings.set_char(buffer, index, v_char);
            index = Numbers.add(index, (SubLObject)html_kernel.ONE_INTEGER);
        }
        v_answer = Sequences.cconcatenate(v_answer, string_utilities.substring(buffer, (SubLObject)html_kernel.ZERO_INTEGER, index));
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 4625L)
    public static SubLObject handle_last_html_message() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return handle_html_message(html_kernel.$html_message$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 4716L)
    public static SubLObject handle_html_message(final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_kernel.$html_message$.setDynamicValue(message, thread);
        if (html_kernel.NIL != html_kernel.$record_html_messagesP$.getDynamicValue(thread)) {
            html_kernel.$html_message_record$.setDynamicValue((SubLObject)ConsesLow.cons(Sequences.copy_seq(message), html_kernel.$html_message_record$.getDynamicValue(thread)), thread);
        }
        thread.resetMultipleValues();
        final SubLObject user = prelim_parse_html_message(message);
        final SubLObject host = thread.secondMultipleValue();
        final SubLObject function_name = thread.thirdMultipleValue();
        final SubLObject arg_index = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject handled_ok = (SubLObject)html_kernel.NIL;
        final SubLObject _prev_bind_0 = html_kernel.$http_remote_user$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_kernel.$http_remote_host$.currentBinding(thread);
        try {
            html_kernel.$http_remote_user$.bind(user, thread);
            html_kernel.$http_remote_host$.bind(host, thread);
            final SubLObject state_var = html_machine_state(http_state_key_for_request());
            final SubLObject lock_var = html_machine_state_lock(state_var);
            SubLObject v_variables = (SubLObject)html_kernel.NIL;
            SubLObject values = (SubLObject)html_kernel.NIL;
            SubLObject release = (SubLObject)html_kernel.NIL;
            try {
                release = Locks.seize_lock(lock_var);
                v_variables = html_machine_state_variables(state_var);
                values = html_machine_state_values(state_var);
            }
            finally {
                if (html_kernel.NIL != release) {
                    Locks.release_lock(lock_var);
                }
            }
            final SubLObject cprogv_var = v_variables;
            final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
            try {
                Dynamic.bind_dynamic_vars(cprogv_var, values);
                SubLObject function_symbol = (html_kernel.NIL != function_name) ? Packages.find_symbol(function_name, (SubLObject)html_kernel.UNPROVIDED) : html_kernel.$default_html_handler$.getGlobalValue();
                if (html_kernel.NIL == http_function_allowedP(function_symbol)) {
                    function_symbol = (SubLObject)html_kernel.NIL;
                }
                if (html_kernel.NIL == function_name && html_kernel.NIL == function_symbol) {
                    handle_error_during_html((SubLObject)html_kernel.$str14$No_handler_function_was_specified);
                }
                else if (html_kernel.NIL == function_symbol) {
                    handle_error_during_html(PrintLow.format((SubLObject)html_kernel.NIL, (SubLObject)html_kernel.$str15$No_handler_for_function__A_is_def, function_name));
                }
                else if (html_kernel.NIL == Symbols.fboundp(function_symbol)) {
                    handle_error_during_html(PrintLow.format((SubLObject)html_kernel.NIL, (SubLObject)html_kernel.$str15$No_handler_for_function__A_is_def, function_name));
                }
                else if (html_kernel.NIL == html_macros.cgi_handler_functionP(function_symbol)) {
                    handle_error_during_html(PrintLow.format((SubLObject)html_kernel.NIL, (SubLObject)html_kernel.$str16$_S_is_not_an_CGI_handler_function, function_symbol));
                }
                else {
                    handle_html_message_internal(user, host, function_symbol, message, arg_index);
                    handled_ok = (SubLObject)html_kernel.T;
                }
                snapshot_html_state(state_var);
            }
            finally {
                Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
            }
        }
        finally {
            html_kernel.$http_remote_host$.rebind(_prev_bind_2, thread);
            html_kernel.$http_remote_user$.rebind(_prev_bind_0, thread);
        }
        if (html_kernel.NIL == handled_ok && html_kernel.NIL != html_kernel.$monitor_html_action$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)html_kernel.T, (SubLObject)html_kernel.$str17$___A_called_a_bogus_function___Me, host, message);
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 6364L)
    public static SubLObject handle_html_message_internal(final SubLObject user, final SubLObject host, final SubLObject function_symbol, final SubLObject message, final SubLObject arg_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject args = generate_html_args_from_message_info(function_symbol, message, arg_index);
            if (html_kernel.NIL != html_kernel.$monitor_html_action$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)html_kernel.T, (SubLObject)html_kernel.$str18$___A__A_calls__A_on_args__A______, numeric_date_utilities.timestring((SubLObject)html_kernel.UNPROVIDED), host, function_symbol, args, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
            }
            if (html_kernel.NIL != html_kernel.$continue_on_html_error$.getDynamicValue(thread)) {
                SubLObject error_message = (SubLObject)html_kernel.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)html_kernel.$sym19$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            process_utilities.current_process_note_form(reader.bq_cons(function_symbol, ConsesLow.append(args, (SubLObject)html_kernel.NIL)));
                            Functions.funcall(Symbols.symbol_function(function_symbol), args);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)html_kernel.NIL);
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
                if (html_kernel.NIL != error_message) {
                    handle_error_during_html(error_message);
                }
            }
            else {
                Functions.funcall(Symbols.symbol_function(function_symbol), args);
            }
            if (html_kernel.NIL != html_kernel.$monitor_html_action$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)html_kernel.T, (SubLObject)html_kernel.$str20$___A_Finished_call_to__A_for__A__, numeric_date_utilities.timestring((SubLObject)html_kernel.UNPROVIDED), function_symbol, host, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_kernel.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                SubLObject ignore_errors_tag = (SubLObject)html_kernel.NIL;
                try {
                    thread.throwStack.push(html_kernel.$kw9$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)html_kernel.$sym10$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            streams_high.force_output(html_macros.$html_stream$.getDynamicValue(thread));
                            process_utilities.current_process_clear_form();
                        }
                        catch (Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, (SubLObject)html_kernel.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)html_kernel.$kw9$IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                }
                finally {
                    thread.throwStack.pop();
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 7376L)
    public static SubLObject handle_error_during_html(final SubLObject error_message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)html_kernel.NIL;
        try {
            thread.throwStack.push(html_kernel.$kw9$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)html_kernel.$sym10$IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (html_kernel.NIL != streams_high.open_stream_p(html_macros.$html_stream$.getDynamicValue(thread))) {
                        html_utilities.html_markup((SubLObject)html_kernel.$str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
                        if (html_kernel.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_kernel.$str22$_meta_http_equiv__X_UA_Compatible);
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                        try {
                            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_kernel.$kw23$UNINITIALIZED) ? ConsesLow.list(html_kernel.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind((SubLObject)html_kernel.T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                                    html_utilities.html_br();
                                    html_utilities.html_terpri((SubLObject)html_kernel.TWO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                    final SubLObject color_val = (SubLObject)html_kernel.$kw24$RED;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (html_kernel.NIL != color_val) {
                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(color_val));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                                        html_utilities.html_princ((SubLObject)html_kernel.$str25$HTML_Transfer_halted_due_to_scrip);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                    html_macros.verify_not_within_html_pre();
                                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$9 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind((SubLObject)html_kernel.T, thread);
                                        html_utilities.html_princ(error_message);
                                    }
                                    finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$9, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        }
                        finally {
                            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
                    }
                    else {
                        format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)html_kernel.$str26$_A___, error_message, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)html_kernel.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)html_kernel.$kw9$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 8355L)
    public static SubLObject initialize_http_restricted_functions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_kernel.NIL == set.set_p(html_kernel.$http_restricted_functions$.getDynamicValue(thread))) {
            html_kernel.$http_restricted_functions$.setDynamicValue(set.new_set((SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED), thread);
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 8525L)
    public static SubLObject http_allow_function(final SubLObject function_symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        initialize_http_restricted_functions();
        set.set_add(function_symbol, html_kernel.$http_restricted_functions$.getDynamicValue(thread));
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 8817L)
    public static SubLObject http_disallow_function(final SubLObject function_symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_kernel.NIL == set.set_p(html_kernel.$http_restricted_functions$.getDynamicValue(thread))) {
            set.set_remove(function_symbol, html_kernel.$http_restricted_functions$.getDynamicValue(thread));
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 9093L)
    public static SubLObject http_unrestrict_functions() {
        html_kernel.$http_restricted_functions$.setDynamicValue((SubLObject)html_kernel.NIL);
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 9284L)
    public static SubLObject http_function_allowedP(final SubLObject function_symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(html_kernel.NIL == html_kernel.$http_restricted_functions$.getDynamicValue(thread) || html_kernel.NIL != set.set_memberP(function_symbol, html_kernel.$http_restricted_functions$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 9455L)
    public static SubLObject prelim_parse_html_message(final SubLObject message) {
        assert html_kernel.NIL != Types.stringp(message) : message;
        final SubLObject host_end = html_arg_separator_position(message, (SubLObject)html_kernel.UNPROVIDED);
        final SubLObject X_idx = Sequences.position((SubLObject)Characters.CHAR_at, message, Symbols.symbol_function((SubLObject)html_kernel.EQL), Symbols.symbol_function((SubLObject)html_kernel.IDENTITY), (SubLObject)html_kernel.ZERO_INTEGER, host_end);
        SubLObject user = (SubLObject)html_kernel.NIL;
        if (html_kernel.NIL != X_idx) {
            user = Sequences.subseq(message, (SubLObject)html_kernel.ZERO_INTEGER, X_idx);
        }
        if (html_kernel.NIL != host_end) {
            final SubLObject host = Strings.nstring_downcase(string_utilities.substring(message, (SubLObject)((html_kernel.NIL != X_idx) ? Numbers.add(X_idx, (SubLObject)html_kernel.ONE_INTEGER) : html_kernel.ZERO_INTEGER), host_end), (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
            final SubLObject function_name_start = Numbers.add(host_end, (SubLObject)html_kernel.ONE_INTEGER);
            final SubLObject function_name_end = Sequences.position_if(Symbols.symbol_function((SubLObject)html_kernel.$sym28$HTML_ARG_SYNTAX_CHAR), message, Symbols.symbol_function((SubLObject)html_kernel.IDENTITY), function_name_start, (SubLObject)html_kernel.UNPROVIDED);
            SubLObject function_name = (SubLObject)html_kernel.NIL;
            SubLObject arg_index = (SubLObject)html_kernel.NIL;
            if (html_kernel.NIL != function_name_end) {
                function_name = string_utilities.substring(message, function_name_start, function_name_end);
                arg_index = Numbers.add(function_name_end, (SubLObject)html_kernel.ONE_INTEGER);
            }
            else {
                function_name = string_utilities.substring(message, function_name_start, (SubLObject)html_kernel.NIL);
            }
            if (function_name.isString()) {
                if (Sequences.length(function_name).numE((SubLObject)html_kernel.ZERO_INTEGER)) {
                    function_name = (SubLObject)html_kernel.NIL;
                }
                else {
                    function_name = Strings.nstring_upcase(function_name, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
                }
            }
            return Values.values(user, host, function_name, arg_index);
        }
        return Values.values(user, Strings.nstring_downcase(message, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED), (SubLObject)html_kernel.NIL, (SubLObject)html_kernel.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 10784L)
    public static SubLObject handler_function_from_html_message(final SubLObject html_message) {
        final SubLObject handler_name = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)html_kernel.TWO_INTEGER), prelim_parse_html_message(html_message));
        final SubLObject handler = (SubLObject)((html_kernel.NIL != handler_name) ? Packages.find_symbol(handler_name, (SubLObject)html_kernel.UNPROVIDED) : html_kernel.NIL);
        return handler;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 11013L)
    public static SubLObject generate_html_args_from_message_info(final SubLObject function_symbol, final SubLObject message, final SubLObject arg_index) {
        return parse_html_handler_arg_string(message, arg_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 11640L)
    public static SubLObject html_arg_separator_char(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.find(v_char, html_kernel.$html_arg_separator_chars$.getDynamicValue(thread), (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 11798L)
    public static SubLObject html_arg_separator_position(final SubLObject string, SubLObject start_position) {
        if (start_position == html_kernel.UNPROVIDED) {
            start_position = (SubLObject)html_kernel.ZERO_INTEGER;
        }
        return Sequences.position_if(Symbols.symbol_function((SubLObject)html_kernel.$sym30$HTML_ARG_SEPARATOR_CHAR), string, Symbols.symbol_function((SubLObject)html_kernel.IDENTITY), start_position, (SubLObject)html_kernel.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 12144L)
    public static SubLObject html_arg_syntax_char(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.find(v_char, html_kernel.$html_arg_syntax_char$.getDynamicValue(thread), (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 12292L)
    public static SubLObject parse_html_handler_arg_string(final SubLObject arg_string, final SubLObject arg_start_position) {
        if (html_kernel.NIL == arg_start_position || arg_start_position.numE(Sequences.length(arg_string))) {
            return (SubLObject)html_kernel.NIL;
        }
        SubLObject args = (SubLObject)html_kernel.NIL;
        SubLObject next_arg_start;
        SubLObject next_arg_end;
        for (next_arg_start = (SubLObject)html_kernel.NIL, next_arg_end = (SubLObject)html_kernel.NIL, next_arg_start = arg_start_position, next_arg_end = html_arg_separator_position(arg_string, next_arg_start); html_kernel.NIL != next_arg_end; next_arg_end = html_arg_separator_position(arg_string, next_arg_start)) {
            args = (SubLObject)ConsesLow.cons(parse_one_html_handler_arg(arg_string, next_arg_start, next_arg_end), args);
            next_arg_start = Numbers.add(next_arg_end, (SubLObject)html_kernel.ONE_INTEGER);
        }
        args = (SubLObject)ConsesLow.cons(parse_one_html_handler_arg(arg_string, next_arg_start, next_arg_end), args);
        return Sequences.nreverse(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 13084L)
    public static SubLObject parse_one_html_handler_arg(final SubLObject arg_string, final SubLObject arg_start, final SubLObject arg_end) {
        final SubLObject input_arg_pos = html_input_arg_position(arg_string, arg_start, arg_end);
        if (html_kernel.NIL != input_arg_pos) {
            return (SubLObject)ConsesLow.list(frob_html_string(arg_string, arg_start, input_arg_pos), frob_html_string(arg_string, Numbers.add(input_arg_pos, (SubLObject)html_kernel.ONE_INTEGER), arg_end));
        }
        return frob_html_string(arg_string, arg_start, arg_end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 13528L)
    public static SubLObject html_input_arg_position(final SubLObject arg_string, final SubLObject arg_start, final SubLObject arg_end) {
        return Sequences.position((SubLObject)Characters.CHAR_equal, arg_string, Symbols.symbol_function((SubLObject)html_kernel.EQL), Symbols.symbol_function((SubLObject)html_kernel.IDENTITY), arg_start, arg_end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 13670L)
    public static SubLObject frob_html_string(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == html_kernel.UNPROVIDED) {
            start = (SubLObject)html_kernel.ZERO_INTEGER;
        }
        if (end == html_kernel.UNPROVIDED) {
            end = (SubLObject)html_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_kernel.NIL == end) {
            end = Sequences.length(string);
        }
        SubLObject new_length = (SubLObject)html_kernel.ZERO_INTEGER;
        SubLObject next_idx;
        for (SubLObject idx = start; idx.numL(end); idx = next_idx, new_length = Numbers.add(new_length, (SubLObject)html_kernel.ONE_INTEGER)) {
            thread.resetMultipleValues();
            final SubLObject ch = get_frobbed_character(string, idx, end);
            next_idx = thread.secondMultipleValue();
            thread.resetMultipleValues();
        }
        SubLObject new_string = Strings.make_string(new_length, (SubLObject)html_kernel.UNPROVIDED);
        SubLObject new_idx = (SubLObject)html_kernel.ZERO_INTEGER;
        SubLObject idx2;
        SubLObject non_asciiP;
        SubLObject ch2;
        SubLObject next_idx2;
        for (idx2 = start, non_asciiP = (SubLObject)html_kernel.NIL; idx2.numL(end); idx2 = next_idx2, non_asciiP = (SubLObject)SubLObjectFactory.makeBoolean(html_kernel.NIL != non_asciiP || html_kernel.NIL != unicode_strings.non_ascii_char_p(ch2))) {
            thread.resetMultipleValues();
            ch2 = get_frobbed_character(string, idx2, end);
            next_idx2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            Strings.set_char(new_string, new_idx, ch2);
            new_idx = Numbers.add(new_idx, (SubLObject)html_kernel.ONE_INTEGER);
        }
        if (html_kernel.NIL != non_asciiP) {
            final SubLObject code_vector = unicode_strings.subl_string_to_char_code_vector(new_string);
            if (html_kernel.NIL == unicode_strings.utf8_vector_string_p(code_vector)) {
                new_string = unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(code_vector, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED));
            }
        }
        return new_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 14823L)
    public static SubLObject get_frobbed_character(final SubLObject string, final SubLObject start, final SubLObject end) {
        final SubLObject ch = Strings.sublisp_char(string, start);
        if (html_kernel.NIL != Characters.charE(ch, (SubLObject)Characters.CHAR_plus)) {
            return Values.values((SubLObject)Characters.CHAR_space, Numbers.add(start, (SubLObject)html_kernel.ONE_INTEGER));
        }
        if (html_kernel.NIL == Characters.charE(ch, (SubLObject)Characters.CHAR_percent) || Numbers.subtract(end, start).numL((SubLObject)html_kernel.THREE_INTEGER)) {
            return Values.values(ch, Numbers.add(start, (SubLObject)html_kernel.ONE_INTEGER));
        }
        final SubLObject high = Characters.digit_char_p(Strings.sublisp_char(string, Numbers.add(start, (SubLObject)html_kernel.ONE_INTEGER)), (SubLObject)html_kernel.SIXTEEN_INTEGER);
        final SubLObject low = Characters.digit_char_p(Strings.sublisp_char(string, Numbers.add(start, (SubLObject)html_kernel.TWO_INTEGER)), (SubLObject)html_kernel.SIXTEEN_INTEGER);
        if (html_kernel.NIL != high && html_kernel.NIL != low) {
            return Values.values(Characters.code_char(Numbers.add(Numbers.multiply(high, (SubLObject)html_kernel.SIXTEEN_INTEGER), low)), Numbers.add(start, (SubLObject)html_kernel.THREE_INTEGER));
        }
        return Values.values(ch, Numbers.add(start, (SubLObject)html_kernel.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject cb_setup(SubLObject args) {
        if (args == html_kernel.UNPROVIDED) {
            args = (SubLObject)html_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)html_kernel.$str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (html_kernel.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_kernel.$str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_kernel.$kw23$UNINITIALIZED) ? ConsesLow.list(html_kernel.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)html_kernel.$str32$Browser_Setup);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            if (html_kernel.NIL != html_macros.html_inside_body_p()) {
                Errors.error((SubLObject)html_kernel.$str33$Cannot_have_a_FRAMESET_tag_inside);
            }
            html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_kernel.$str34$0__);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_frameset_frameborder$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_kernel.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                cb_utilities.cb_frame((SubLObject)html_kernel.$kw35$EMPTY, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
                cb_utilities.cb_frame((SubLObject)html_kernel.$kw36$SETUP, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
            }
            html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_frames_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)html_kernel.ONE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_princ((SubLObject)html_kernel.$str37$Frames_and_JavaScript_are_not_Sup);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)html_kernel.ONE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
            cb_setup_results();
            html_utilities.html_copyright_notice();
            html_utilities.html_markup(html_macros.$html_no_frames_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject cb_setup_frame(SubLObject args) {
        if (args == html_kernel.UNPROVIDED) {
            args = (SubLObject)html_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)html_kernel.$str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (html_kernel.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_kernel.$str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_kernel.$kw23$UNINITIALIZED) ? ConsesLow.list(html_kernel.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_javascript_compatibility_script();
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)html_kernel.$str32$Browser_Setup);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)html_kernel.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (html_kernel.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)html_kernel.ONE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)html_kernel.$str40$Frames_Supported__JavaScript_eith);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)html_kernel.ONE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                    cb_setup_results();
                    html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$11, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject cb_setup_frame_script(SubLObject args) {
        if (args == html_kernel.UNPROVIDED) {
            args = (SubLObject)html_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)html_kernel.$str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (html_kernel.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_kernel.$str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_kernel.$kw23$UNINITIALIZED) ? ConsesLow.list(html_kernel.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)html_kernel.$str32$Browser_Setup);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$13 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)html_kernel.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (html_kernel.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)html_kernel.ONE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)html_kernel.$str42$Frames_Supported_and_JavaScript_E);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)html_kernel.ONE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                    cb_setup_results();
                    html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$13, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject cb_handle_setup(SubLObject args) {
        if (args == html_kernel.UNPROVIDED) {
            args = (SubLObject)html_kernel.NIL;
        }
        setup_browser_capabilities();
        return main_menu(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject cb_link_handle_setup(final SubLObject linktext) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)html_kernel.$kw45$TOP);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)html_kernel.$str46$cb_handle_setup);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
        if (html_kernel.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject html_javascript_compatibility_script() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
            html_utilities.html_markup(html_macros.$html_comment_head$.getGlobalValue());
            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                html_utilities.html_terpri((SubLObject)html_kernel.UNPROVIDED);
                html_utilities.html_markup(html_kernel.$html_javascript_compatibility_script$.getDynamicValue(thread));
                html_utilities.html_princ((SubLObject)html_kernel.$str50$___);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
            }
            html_utilities.html_markup(html_macros.$html_comment_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject cb_setup_results() {
        cb_utilities.cb_link((SubLObject)html_kernel.$kw47$HANDLE_SETUP, (SubLObject)html_kernel.$str51$Click_here_now, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
        html_utilities.html_princ((SubLObject)html_kernel.$str52$_now_to_optimally_configure_the_i);
        html_utilities.html_newline((SubLObject)html_kernel.TWO_INTEGER);
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject setup_browser_capabilities() {
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject main_menu(SubLObject args) {
        if (args == html_kernel.UNPROVIDED) {
            args = (SubLObject)html_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)html_kernel.$str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (html_kernel.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_kernel.$str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_kernel.$kw23$UNINITIALIZED) ? ConsesLow.list(html_kernel.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)html_kernel.$str54$Cyc_Main_Menu);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)html_kernel.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (html_kernel.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)html_kernel.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)html_kernel.$str54$Cyc_Main_Menu);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)html_kernel.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                        SubLObject pairs = conses_high.copy_list(html_kernel.$main_menu_list$.getDynamicValue(thread));
                        SubLObject sorted_pairs = (SubLObject)html_kernel.NIL;
                        if (system_parameters.$cyc_documentation_url$.getDynamicValue(thread).isString()) {
                            final SubLObject item_var = reader.bq_cons(cb_utilities.cyc_documentation_toc(), (SubLObject)html_kernel.$str55$Cyc_Documentation);
                            if (html_kernel.NIL == conses_high.member(item_var, pairs, Symbols.symbol_function((SubLObject)html_kernel.EQUAL), Symbols.symbol_function((SubLObject)html_kernel.IDENTITY))) {
                                pairs = (SubLObject)ConsesLow.cons(item_var, pairs);
                            }
                        }
                        SubLObject cdolist_list_var;
                        sorted_pairs = (cdolist_list_var = Sort.sort(pairs, Symbols.symbol_function((SubLObject)html_kernel.$sym56$STRING_), Symbols.symbol_function((SubLObject)html_kernel.$sym57$CDR)));
                        SubLObject pair = (SubLObject)html_kernel.NIL;
                        pair = cdolist_list_var.first();
                        while (html_kernel.NIL != cdolist_list_var) {
                            if (pair.rest().equalp((SubLObject)html_kernel.$str55$Cyc_Documentation)) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                                    html_utilities.html_princ(cb_utilities.cyc_documentation_toc());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                                        html_utilities.html_princ((SubLObject)html_kernel.$str55$Cyc_Documentation);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                            else {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_kernel.$str58$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    html_utilities.html_princ(pair.first());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                                        html_utilities.html_princ(pair.rest());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            pair = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$16, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject cb_link_main_menu(SubLObject linktext) {
        if (linktext == html_kernel.UNPROVIDED) {
            linktext = (SubLObject)html_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_kernel.NIL == linktext) {
            linktext = (SubLObject)html_kernel.$str60$Main_Menu;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)html_kernel.$kw45$TOP);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)html_kernel.$str61$main_menu);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
        if (html_kernel.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject mosaic_main_menu(SubLObject args) {
        if (args == html_kernel.UNPROVIDED) {
            args = (SubLObject)html_kernel.NIL;
        }
        return main_menu(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 15441L)
    public static SubLObject menu(SubLObject args) {
        if (args == html_kernel.UNPROVIDED) {
            args = (SubLObject)html_kernel.NIL;
        }
        return main_menu(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 19583L)
    public static SubLObject make_html_machine_state_item(final SubLObject variable, final SubLObject value) {
        return (SubLObject)ConsesLow.list(variable, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 19801L)
    public static SubLObject html_machine_state_item_variable(final SubLObject item) {
        return item.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 19880L)
    public static SubLObject html_machine_state_item_value(final SubLObject item) {
        return conses_high.second(item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 19957L)
    public static SubLObject reset_html_machine_state_item_value(final SubLObject item, final SubLObject new_value) {
        ConsesLow.set_nth((SubLObject)html_kernel.ONE_INTEGER, item, new_value);
        return new_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 20230L)
    public static SubLObject html_machine_state_lock(final SubLObject state) {
        return html_machine_state_item_value(Sequences.find((SubLObject)html_kernel.$sym66$_HTML_MACHINE_STATE_LOCK_, state, Symbols.symbol_function((SubLObject)html_kernel.EQL), Symbols.symbol_function((SubLObject)html_kernel.$sym67$HTML_MACHINE_STATE_ITEM_VARIABLE), (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 20413L)
    public static SubLObject initialize_html_machine_state_lock(final SubLObject new_state) {
        final SubLObject lock_state_item = Sequences.find((SubLObject)html_kernel.$sym66$_HTML_MACHINE_STATE_LOCK_, new_state, Symbols.symbol_function((SubLObject)html_kernel.EQL), Symbols.symbol_function((SubLObject)html_kernel.$sym67$HTML_MACHINE_STATE_ITEM_VARIABLE), (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
        reset_html_machine_state_item_value(lock_state_item, Locks.make_lock((SubLObject)html_kernel.$str68$HTML_State));
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 20938L)
    public static SubLObject html_machine_state(final SubLObject machine) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject state = Hashtables.gethash(machine, html_kernel.$html_machine_state_hash$.getGlobalValue(), (SubLObject)html_kernel.UNPROVIDED);
        final SubLObject cached = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (html_kernel.NIL != cached) {
            return state;
        }
        state = new_html_state();
        SubLObject release = (SubLObject)html_kernel.NIL;
        try {
            release = Locks.seize_lock(html_kernel.$html_machine_state_update_lock$.getGlobalValue());
            Hashtables.sethash(machine, html_kernel.$html_machine_state_hash$.getGlobalValue(), state);
        }
        finally {
            if (html_kernel.NIL != release) {
                Locks.release_lock(html_kernel.$html_machine_state_update_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 21408L)
    public static SubLObject machines_with_html_state() {
        SubLObject v_answer = (SubLObject)html_kernel.NIL;
        v_answer = hash_table_utilities.hash_table_keys(html_kernel.$html_machine_state_hash$.getGlobalValue());
        v_answer = Sort.sort(v_answer, Symbols.symbol_function((SubLObject)html_kernel.$sym71$STRING_LESSP), (SubLObject)html_kernel.UNPROVIDED);
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 21602L)
    public static SubLObject clear_html_state_for_machine(final SubLObject machine) {
        SubLObject v_answer = (SubLObject)html_kernel.NIL;
        SubLObject release = (SubLObject)html_kernel.NIL;
        try {
            release = Locks.seize_lock(html_kernel.$html_machine_state_update_lock$.getGlobalValue());
            v_answer = Hashtables.remhash(machine, html_kernel.$html_machine_state_hash$.getGlobalValue());
        }
        finally {
            if (html_kernel.NIL != release) {
                Locks.release_lock(html_kernel.$html_machine_state_update_lock$.getGlobalValue());
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 21817L)
    public static SubLObject clear_all_html_state() {
        SubLObject release = (SubLObject)html_kernel.NIL;
        try {
            release = Locks.seize_lock(html_kernel.$html_machine_state_update_lock$.getGlobalValue());
            Hashtables.clrhash(html_kernel.$html_machine_state_hash$.getGlobalValue());
        }
        finally {
            if (html_kernel.NIL != release) {
                Locks.release_lock(html_kernel.$html_machine_state_update_lock$.getGlobalValue());
            }
        }
        return (SubLObject)html_kernel.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 21965L)
    public static SubLObject html_state_for_machine(final SubLObject machine) {
        return Hashtables.gethash(machine, html_kernel.$html_machine_state_hash$.getGlobalValue(), (SubLObject)html_kernel.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 22060L)
    public static SubLObject http_state_key_for_request() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_kernel.NIL != html_kernel.$http_remote_user$.getDynamicValue(thread)) {
            return html_kernel.$http_remote_user$.getDynamicValue(thread);
        }
        if (html_kernel.NIL != html_kernel.$http_remote_host$.getDynamicValue(thread)) {
            return html_kernel.$http_remote_host$.getDynamicValue(thread);
        }
        return (SubLObject)html_kernel.$str72$unknown;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 22411L)
    public static SubLObject print_html_state(SubLObject machine) {
        if (machine == html_kernel.UNPROVIDED) {
            machine = http_state_key_for_request();
        }
        SubLObject cdolist_list_var;
        final SubLObject state = cdolist_list_var = html_machine_state(machine);
        SubLObject item = (SubLObject)html_kernel.NIL;
        item = cdolist_list_var.first();
        while (html_kernel.NIL != cdolist_list_var) {
            PrintLow.format((SubLObject)html_kernel.T, (SubLObject)html_kernel.$str73$___S____S, html_machine_state_item_variable(item), html_machine_state_item_value(item));
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 22766L)
    public static SubLObject new_html_state() {
        SubLObject new_state = (SubLObject)html_kernel.NIL;
        SubLObject cdolist_list_var = utilities_macros.$html_state_variables$.getGlobalValue();
        SubLObject variable = (SubLObject)html_kernel.NIL;
        variable = cdolist_list_var.first();
        while (html_kernel.NIL != cdolist_list_var) {
            final SubLObject value = Symbols.symbol_value(variable);
            new_state = (SubLObject)ConsesLow.cons(make_html_machine_state_item(variable, value), new_state);
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        }
        new_state = Sequences.nreverse(new_state);
        initialize_html_machine_state_lock(new_state);
        return new_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 23105L)
    public static SubLObject html_machine_state_variables(final SubLObject state) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)html_kernel.$sym67$HTML_MACHINE_STATE_ITEM_VARIABLE), state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 23220L)
    public static SubLObject html_machine_state_values(final SubLObject state) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)html_kernel.$sym74$HTML_MACHINE_STATE_ITEM_VALUE), state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 23329L)
    public static SubLObject add_html_state_variable(final SubLObject variable) {
        SubLObject machine = (SubLObject)html_kernel.NIL;
        SubLObject state = (SubLObject)html_kernel.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(html_kernel.$html_machine_state_hash$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                machine = Hashtables.getEntryKey(cdohash_entry);
                state = Hashtables.getEntryValue(cdohash_entry);
                if (html_kernel.NIL == Sequences.find(variable, state, Symbols.symbol_function((SubLObject)html_kernel.EQL), Symbols.symbol_function((SubLObject)html_kernel.$sym67$HTML_MACHINE_STATE_ITEM_VARIABLE), (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED)) {
                    Hashtables.sethash(machine, html_kernel.$html_machine_state_hash$.getGlobalValue(), (SubLObject)ConsesLow.cons(make_html_machine_state_item(variable, (SubLObject)html_kernel.NIL), state));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 23643L)
    public static SubLObject html_var_value(final SubLObject variable, final SubLObject machine) {
        assert html_kernel.NIL != Types.symbolp(variable) : variable;
        assert html_kernel.NIL != Types.stringp(machine) : machine;
        final SubLObject state = html_machine_state(machine);
        if (html_kernel.NIL != state) {
            final SubLObject item = Sequences.find(variable, state, Symbols.symbol_function((SubLObject)html_kernel.EQL), Symbols.symbol_function((SubLObject)html_kernel.$sym67$HTML_MACHINE_STATE_ITEM_VARIABLE), (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
            if (html_kernel.NIL != item) {
                return html_machine_state_item_value(item);
            }
            Errors.warn((SubLObject)html_kernel.$str76$Could_not_find_state_variable__S_, variable, machine);
        }
        else {
            Errors.warn((SubLObject)html_kernel.$str77$Could_not_find_state_for_machine_, machine);
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 24090L)
    public static SubLObject attach_html_var(final SubLObject variable, final SubLObject machine, SubLObject value) {
        if (value == html_kernel.UNPROVIDED) {
            value = Eval.eval(variable);
        }
        assert html_kernel.NIL != Types.symbolp(variable) : variable;
        assert html_kernel.NIL != Types.stringp(machine) : machine;
        final SubLObject state = html_machine_state(machine);
        if (html_kernel.NIL != state) {
            final SubLObject item = Sequences.find(variable, state, Symbols.symbol_function((SubLObject)html_kernel.EQL), Symbols.symbol_function((SubLObject)html_kernel.$sym67$HTML_MACHINE_STATE_ITEM_VARIABLE), (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
            if (html_kernel.NIL != item) {
                reset_html_machine_state_item_value(item, value);
            }
            else {
                Errors.warn((SubLObject)html_kernel.$str76$Could_not_find_state_variable__S_, variable, machine);
            }
        }
        else {
            Errors.warn((SubLObject)html_kernel.$str77$Could_not_find_state_for_machine_, machine);
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 24578L)
    public static SubLObject attach_all_html_var(final SubLObject variable, SubLObject value) {
        if (value == html_kernel.UNPROVIDED) {
            value = Eval.eval(variable);
        }
        assert html_kernel.NIL != Types.symbolp(variable) : variable;
        SubLObject machine = (SubLObject)html_kernel.NIL;
        SubLObject state = (SubLObject)html_kernel.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(html_kernel.$html_machine_state_hash$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                machine = Hashtables.getEntryKey(cdohash_entry);
                state = Hashtables.getEntryValue(cdohash_entry);
                if (html_kernel.NIL != state) {
                    final SubLObject item = Sequences.find(variable, state, Symbols.symbol_function((SubLObject)html_kernel.EQL), Symbols.symbol_function((SubLObject)html_kernel.$sym67$HTML_MACHINE_STATE_ITEM_VARIABLE), (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
                    if (html_kernel.NIL == item) {
                        continue;
                    }
                    reset_html_machine_state_item_value(item, value);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 24941L)
    public static SubLObject snapshot_html_state(final SubLObject state) {
        final SubLObject lock = html_machine_state_lock(state);
        SubLObject release = (SubLObject)html_kernel.NIL;
        try {
            release = Locks.seize_lock(lock);
            SubLObject cdolist_list_var = state;
            SubLObject item = (SubLObject)html_kernel.NIL;
            item = cdolist_list_var.first();
            while (html_kernel.NIL != cdolist_list_var) {
                final SubLObject symbol = html_machine_state_item_variable(item);
                reset_html_machine_state_item_value(item, Symbols.symbol_value(symbol));
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        finally {
            if (html_kernel.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 25308L)
    public static SubLObject html_interface_users() {
        final SubLObject machines = machines_with_html_state();
        SubLObject v_answer = (SubLObject)html_kernel.NIL;
        SubLObject cdolist_list_var = machines;
        SubLObject machine = (SubLObject)html_kernel.NIL;
        machine = cdolist_list_var.first();
        while (html_kernel.NIL != cdolist_list_var) {
            final SubLObject user = html_var_value((SubLObject)html_kernel.$sym78$_THE_CYCLIST_, machine);
            v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(machine, user), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            machine = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 25632L)
    public static SubLObject show_remote_user(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)html_kernel.$str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (html_kernel.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_kernel.$str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_kernel.$kw23$UNINITIALIZED) ? ConsesLow.list(html_kernel.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)html_kernel.$str79$Remote_User);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$23 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)html_kernel.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (html_kernel.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_kernel.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_kernel.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)html_kernel.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)html_kernel.$str79$Remote_User);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)html_kernel.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_kernel.$str80$The_remote_user_is__A_at__A_, html_kernel.$http_remote_user$.getDynamicValue(thread), html_kernel.$http_remote_host$.getDynamicValue(thread));
                    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$23, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_kernel.UNPROVIDED);
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 25864L)
    public static SubLObject html_attempt_auto_login(final SubLObject machine) {
        if (html_kernel.NIL != current_machine_name_p(machine)) {
            final SubLObject cyclist = kb_accessors.guess_the_cyclist_from_user_name((SubLObject)html_kernel.UNPROVIDED);
            if (html_kernel.NIL != forts.fort_p(cyclist)) {
                final SubLObject state_var = html_machine_state(machine);
                final SubLObject lock_var = html_machine_state_lock(state_var);
                SubLObject v_variables = (SubLObject)html_kernel.NIL;
                SubLObject values = (SubLObject)html_kernel.NIL;
                SubLObject release = (SubLObject)html_kernel.NIL;
                try {
                    release = Locks.seize_lock(lock_var);
                    v_variables = html_machine_state_variables(state_var);
                    values = html_machine_state_values(state_var);
                }
                finally {
                    if (html_kernel.NIL != release) {
                        Locks.release_lock(lock_var);
                    }
                }
                final SubLObject cprogv_var = v_variables;
                final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
                try {
                    Dynamic.bind_dynamic_vars(cprogv_var, values);
                    cb_system_tools.cb_set_the_cyclist(cyclist);
                    snapshot_html_state(state_var);
                }
                finally {
                    Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
                }
                return cyclist;
            }
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 26213L)
    public static SubLObject current_machine_name_p(final SubLObject machine) {
        return (SubLObject)SubLObjectFactory.makeBoolean(machine.isString() && (machine.equal((SubLObject)html_kernel.$str82$127_0_0_1) || machine.equal((SubLObject)html_kernel.$str83$localhost) || machine.equal((SubLObject)html_kernel.$str84$localhost_localdomain) || machine.equal(Environment.get_network_name((SubLObject)html_kernel.UNPROVIDED)) || machine.equal(Environment.get_machine_name((SubLObject)html_kernel.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 27073L)
    public static SubLObject clear_machine_is_myself_via_cyc_api() {
        final SubLObject cs = html_kernel.$machine_is_myself_via_cyc_api_caching_state$.getGlobalValue();
        if (html_kernel.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)html_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 27073L)
    public static SubLObject remove_machine_is_myself_via_cyc_api(final SubLObject machine_name) {
        return memoization_state.caching_state_remove_function_results_with_args(html_kernel.$machine_is_myself_via_cyc_api_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(machine_name), (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 27073L)
    public static SubLObject machine_is_myself_via_cyc_api_internal(final SubLObject machine_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_kernel.NIL != Types.stringp(machine_name) : machine_name;
        SubLObject myselfP = (SubLObject)html_kernel.NIL;
        if (html_kernel.NIL == myselfP) {
            SubLObject csome_list_var = tcp_server_utilities.all_tcp_servers();
            SubLObject tcp_server = (SubLObject)html_kernel.NIL;
            tcp_server = csome_list_var.first();
            while (html_kernel.NIL == myselfP && html_kernel.NIL != csome_list_var) {
                SubLObject timed_outP = (SubLObject)html_kernel.NIL;
                SubLObject ignore_errors_tag = (SubLObject)html_kernel.NIL;
                try {
                    thread.throwStack.push(html_kernel.$kw9$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)html_kernel.$sym10$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$25 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)html_kernel.T, thread);
                                    SubLObject timer = (SubLObject)html_kernel.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$26 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)html_kernel.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer(html_kernel.$machine_is_myself_timeout$.getGlobalValue(), tag);
                                            if (html_kernel.$kw87$CYC_API == tcp_server_utilities.tcp_server_type(tcp_server)) {
                                                final SubLObject port = tcp_server_utilities.tcp_server_port(tcp_server);
                                                final SubLObject my_image_id = control_vars.cyc_image_id();
                                                myselfP = api_kernel.cyc_api_remote_eval((SubLObject)ConsesLow.listS((SubLObject)html_kernel.EQUAL, my_image_id, (SubLObject)html_kernel.$list88), machine_name, port, (SubLObject)html_kernel.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$26, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_kernel.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$25, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)html_kernel.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)html_kernel.$kw9$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
                csome_list_var = csome_list_var.rest();
                tcp_server = csome_list_var.first();
            }
        }
        return myselfP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 27073L)
    public static SubLObject machine_is_myself_via_cyc_api(final SubLObject machine_name) {
        SubLObject caching_state = html_kernel.$machine_is_myself_via_cyc_api_caching_state$.getGlobalValue();
        if (html_kernel.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)html_kernel.$sym86$MACHINE_IS_MYSELF_VIA_CYC_API, (SubLObject)html_kernel.$sym89$_MACHINE_IS_MYSELF_VIA_CYC_API_CACHING_STATE_, (SubLObject)html_kernel.NIL, (SubLObject)html_kernel.EQUAL, (SubLObject)html_kernel.ONE_INTEGER, (SubLObject)html_kernel.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, machine_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(machine_is_myself_via_cyc_api_internal(machine_name)));
            memoization_state.caching_state_put(caching_state, machine_name, results, (SubLObject)html_kernel.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 27793L)
    public static SubLObject save_html_state_to_file(final SubLObject filename, final SubLObject var_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_kernel.NIL != Types.stringp(filename) : filename;
        SubLObject saved = (SubLObject)html_kernel.NIL;
        SubLObject stream = (SubLObject)html_kernel.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)html_kernel.$kw90$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)html_kernel.$str91$Unable_to_open__S, filename);
            }
            final SubLObject stream_$28 = stream;
            SubLObject cdolist_list_var = var_list;
            SubLObject var = (SubLObject)html_kernel.NIL;
            var = cdolist_list_var.first();
            while (html_kernel.NIL != cdolist_list_var) {
                if (var.isSymbol()) {
                    final SubLObject value = Eval.eval(var);
                    final SubLObject printed_value = PrintLow.format((SubLObject)html_kernel.NIL, (SubLObject)html_kernel.$str92$_S, value);
                    thread.resetMultipleValues();
                    final SubLObject re_read_value = reader.read_from_string_ignoring_errors(printed_value, (SubLObject)html_kernel.NIL, (SubLObject)html_kernel.NIL, (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED);
                    final SubLObject error = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (!error.eql((SubLObject)html_kernel.$kw93$ERROR) && re_read_value.equal(value)) {
                        PrintLow.format(stream_$28, (SubLObject)html_kernel.$str94$_S________A__, var, printed_value);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            }
            saved = (SubLObject)html_kernel.T;
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_kernel.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)html_kernel.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return saved;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-kernel.lisp", position = 28611L)
    public static SubLObject restore_html_state_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_kernel.NIL != Types.stringp(filename) : filename;
        if (html_kernel.NIL == Filesys.probe_file(filename)) {
            return Values.values((SubLObject)html_kernel.NIL, file_utilities.why_not_probe_fileP(filename));
        }
        SubLObject restored = (SubLObject)html_kernel.NIL;
        SubLObject error_message = (SubLObject)html_kernel.NIL;
        SubLObject stream = (SubLObject)html_kernel.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)html_kernel.$kw95$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)html_kernel.$str91$Unable_to_open__S, filename);
            }
            final SubLObject stream_$29 = stream;
            SubLObject var = (SubLObject)html_kernel.NIL;
            SubLObject value = (SubLObject)html_kernel.NIL;
            SubLObject done = (SubLObject)html_kernel.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)html_kernel.$sym19$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        while (html_kernel.NIL == done) {
                            var = reader.read(stream_$29, (SubLObject)html_kernel.NIL, (SubLObject)html_kernel.$kw96$EOF, (SubLObject)html_kernel.UNPROVIDED);
                            done = Equality.eq(var, (SubLObject)html_kernel.$kw96$EOF);
                            if (html_kernel.NIL == done) {
                                value = reader.read(stream_$29, (SubLObject)html_kernel.NIL, (SubLObject)html_kernel.$kw96$EOF, (SubLObject)html_kernel.UNPROVIDED);
                                done = Equality.eq(value, (SubLObject)html_kernel.$kw96$EOF);
                                if (html_kernel.NIL != done || !var.isSymbol() || html_kernel.NIL == conses_high.member(var, utilities_macros.$html_state_variables$.getGlobalValue(), (SubLObject)html_kernel.UNPROVIDED, (SubLObject)html_kernel.UNPROVIDED)) {
                                    continue;
                                }
                                Eval.eval((SubLObject)ConsesLow.list((SubLObject)html_kernel.$sym97$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)html_kernel.$sym98$QUOTE, value)));
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)html_kernel.NIL);
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
            if (html_kernel.NIL == error_message) {
                restored = (SubLObject)html_kernel.T;
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_kernel.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)html_kernel.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return Values.values(restored, error_message);
    }
    
    public static SubLObject declare_html_kernel_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_server_handler", "HTML-SERVER-HANDLER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_server_top_level", "HTML-SERVER-TOP-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_quit", "HTML-QUIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "abort_html_client_process", "ABORT-HTML-CLIENT-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "abort_html_server_process", "ABORT-HTML-SERVER-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "abort_all_html_client_processes", "ABORT-ALL-HTML-CLIENT-PROCESSES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_client_process_p", "HTML-CLIENT-PROCESS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_port", "HTML-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_server_one_complete_request", "HTML-SERVER-ONE-COMPLETE-REQUEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "handle_html_message_to_stream", "HANDLE-HTML-MESSAGE-TO-STREAM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "read_html_value", "READ-HTML-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "handle_last_html_message", "HANDLE-LAST-HTML-MESSAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "handle_html_message", "HANDLE-HTML-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "handle_html_message_internal", "HANDLE-HTML-MESSAGE-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "handle_error_during_html", "HANDLE-ERROR-DURING-HTML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "initialize_http_restricted_functions", "INITIALIZE-HTTP-RESTRICTED-FUNCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "http_allow_function", "HTTP-ALLOW-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "http_disallow_function", "HTTP-DISALLOW-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "http_unrestrict_functions", "HTTP-UNRESTRICT-FUNCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "http_function_allowedP", "HTTP-FUNCTION-ALLOWED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "prelim_parse_html_message", "PRELIM-PARSE-HTML-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "handler_function_from_html_message", "HANDLER-FUNCTION-FROM-HTML-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "generate_html_args_from_message_info", "GENERATE-HTML-ARGS-FROM-MESSAGE-INFO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_arg_separator_char", "HTML-ARG-SEPARATOR-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_arg_separator_position", "HTML-ARG-SEPARATOR-POSITION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_arg_syntax_char", "HTML-ARG-SYNTAX-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "parse_html_handler_arg_string", "PARSE-HTML-HANDLER-ARG-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "parse_one_html_handler_arg", "PARSE-ONE-HTML-HANDLER-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_input_arg_position", "HTML-INPUT-ARG-POSITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "frob_html_string", "FROB-HTML-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "get_frobbed_character", "GET-FROBBED-CHARACTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "cb_setup", "CB-SETUP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "cb_setup_frame", "CB-SETUP-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "cb_setup_frame_script", "CB-SETUP-FRAME-SCRIPT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "cb_handle_setup", "CB-HANDLE-SETUP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "cb_link_handle_setup", "CB-LINK-HANDLE-SETUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_javascript_compatibility_script", "HTML-JAVASCRIPT-COMPATIBILITY-SCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "cb_setup_results", "CB-SETUP-RESULTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "setup_browser_capabilities", "SETUP-BROWSER-CAPABILITIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "main_menu", "MAIN-MENU", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "cb_link_main_menu", "CB-LINK-MAIN-MENU", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "mosaic_main_menu", "MOSAIC-MAIN-MENU", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "menu", "MENU", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "make_html_machine_state_item", "MAKE-HTML-MACHINE-STATE-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_machine_state_item_variable", "HTML-MACHINE-STATE-ITEM-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_machine_state_item_value", "HTML-MACHINE-STATE-ITEM-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "reset_html_machine_state_item_value", "RESET-HTML-MACHINE-STATE-ITEM-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_machine_state_lock", "HTML-MACHINE-STATE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "initialize_html_machine_state_lock", "INITIALIZE-HTML-MACHINE-STATE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_machine_state", "HTML-MACHINE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "machines_with_html_state", "MACHINES-WITH-HTML-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "clear_html_state_for_machine", "CLEAR-HTML-STATE-FOR-MACHINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "clear_all_html_state", "CLEAR-ALL-HTML-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_state_for_machine", "HTML-STATE-FOR-MACHINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "http_state_key_for_request", "HTTP-STATE-KEY-FOR-REQUEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "print_html_state", "PRINT-HTML-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "new_html_state", "NEW-HTML-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_machine_state_variables", "HTML-MACHINE-STATE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_machine_state_values", "HTML-MACHINE-STATE-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "add_html_state_variable", "ADD-HTML-STATE-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_var_value", "HTML-VAR-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "attach_html_var", "ATTACH-HTML-VAR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "attach_all_html_var", "ATTACH-ALL-HTML-VAR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "snapshot_html_state", "SNAPSHOT-HTML-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_interface_users", "HTML-INTERFACE-USERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "show_remote_user", "SHOW-REMOTE-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "html_attempt_auto_login", "HTML-ATTEMPT-AUTO-LOGIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "current_machine_name_p", "CURRENT-MACHINE-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "clear_machine_is_myself_via_cyc_api", "CLEAR-MACHINE-IS-MYSELF-VIA-CYC-API", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "remove_machine_is_myself_via_cyc_api", "REMOVE-MACHINE-IS-MYSELF-VIA-CYC-API", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "machine_is_myself_via_cyc_api_internal", "MACHINE-IS-MYSELF-VIA-CYC-API-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "machine_is_myself_via_cyc_api", "MACHINE-IS-MYSELF-VIA-CYC-API", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "save_html_state_to_file", "SAVE-HTML-STATE-TO-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_kernel", "restore_html_state_from_file", "RESTORE-HTML-STATE-FROM-FILE", 1, 0, false);
        return (SubLObject)html_kernel.NIL;
    }
    
    public static SubLObject init_html_kernel_file() {
        html_kernel.$within_html_server$ = SubLFiles.defparameter("*WITHIN-HTML-SERVER*", (SubLObject)html_kernel.NIL);
        html_kernel.$continue_on_html_error$ = SubLFiles.defparameter("*CONTINUE-ON-HTML-ERROR*", (SubLObject)html_kernel.NIL);
        html_kernel.$html_server_buffer_size$ = SubLFiles.defparameter("*HTML-SERVER-BUFFER-SIZE*", (SubLObject)html_kernel.$int11$100);
        html_kernel.$html_message$ = SubLFiles.defparameter("*HTML-MESSAGE*", (SubLObject)html_kernel.$str12$);
        html_kernel.$monitor_html_action$ = SubLFiles.defparameter("*MONITOR-HTML-ACTION*", (SubLObject)html_kernel.NIL);
        html_kernel.$record_html_messagesP$ = SubLFiles.defparameter("*RECORD-HTML-MESSAGES?*", (SubLObject)html_kernel.NIL);
        html_kernel.$html_message_record$ = SubLFiles.defparameter("*HTML-MESSAGE-RECORD*", (SubLObject)html_kernel.NIL);
        html_kernel.$http_remote_user$ = SubLFiles.defparameter("*HTTP-REMOTE-USER*", (SubLObject)html_kernel.NIL);
        html_kernel.$http_remote_host$ = SubLFiles.defparameter("*HTTP-REMOTE-HOST*", (SubLObject)html_kernel.NIL);
        html_kernel.$default_html_handler$ = SubLFiles.deflexical("*DEFAULT-HTML-HANDLER*", (SubLObject)(maybeDefault((SubLObject)html_kernel.$sym13$_DEFAULT_HTML_HANDLER_, html_kernel.$default_html_handler$, html_kernel.NIL)));
        html_kernel.$http_restricted_functions$ = SubLFiles.defparameter("*HTTP-RESTRICTED-FUNCTIONS*", (SubLObject)html_kernel.NIL);
        html_kernel.$html_arg_separator_chars$ = SubLFiles.defparameter("*HTML-ARG-SEPARATOR-CHARS*", (SubLObject)html_kernel.$str29$__);
        html_kernel.$html_arg_syntax_char$ = SubLFiles.defparameter("*HTML-ARG-SYNTAX-CHAR*", Sequences.cconcatenate((SubLObject)html_kernel.$str31$_, html_kernel.$html_arg_separator_chars$.getDynamicValue()));
        html_kernel.$html_javascript_compatibility_script$ = SubLFiles.defparameter("*HTML-JAVASCRIPT-COMPATIBILITY-SCRIPT*", (SubLObject)html_kernel.$str49$_var_path___location_href__var_ne);
        html_kernel.$main_menu_list$ = SubLFiles.defparameter("*MAIN-MENU-LIST*", (SubLObject)html_kernel.$list53);
        html_kernel.$html_machine_state_lock$ = SubLFiles.defparameter("*HTML-MACHINE-STATE-LOCK*", (SubLObject)html_kernel.NIL);
        html_kernel.$html_machine_state_hash$ = SubLFiles.deflexical("*HTML-MACHINE-STATE-HASH*", maybeDefault((SubLObject)html_kernel.$sym69$_HTML_MACHINE_STATE_HASH_, html_kernel.$html_machine_state_hash$, ()->(Hashtables.make_hash_table((SubLObject)html_kernel.TEN_INTEGER, Symbols.symbol_function((SubLObject)html_kernel.EQUALP), (SubLObject)html_kernel.UNPROVIDED))));
        html_kernel.$html_machine_state_update_lock$ = SubLFiles.deflexical("*HTML-MACHINE-STATE-UPDATE-LOCK*", Locks.make_lock((SubLObject)html_kernel.$str70$HTML_Machine_State));
        html_kernel.$machine_is_myself_timeout$ = SubLFiles.deflexical("*MACHINE-IS-MYSELF-TIMEOUT*", (SubLObject)html_kernel.$float85$0_1);
        html_kernel.$machine_is_myself_via_cyc_api_caching_state$ = SubLFiles.deflexical("*MACHINE-IS-MYSELF-VIA-CYC-API-CACHING-STATE*", (SubLObject)html_kernel.NIL);
        return (SubLObject)html_kernel.NIL;
    }
    
    public static SubLObject setup_html_kernel_file() {
        tcp_server_utilities.register_tcp_server_type((SubLObject)html_kernel.$kw0$HTML, (SubLObject)html_kernel.$sym1$HTML_SERVER_HANDLER, (SubLObject)html_kernel.$kw2$TEXT);
        subl_macro_promotions.declare_defglobal((SubLObject)html_kernel.$sym13$_DEFAULT_HTML_HANDLER_);
        html_macros.note_cgi_handler_function((SubLObject)html_kernel.$sym38$CB_SETUP, (SubLObject)html_kernel.$kw39$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)html_kernel.$sym41$CB_SETUP_FRAME, (SubLObject)html_kernel.$kw39$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)html_kernel.$sym43$CB_SETUP_FRAME_SCRIPT, (SubLObject)html_kernel.$kw39$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)html_kernel.$sym44$CB_HANDLE_SETUP, (SubLObject)html_kernel.$kw39$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)html_kernel.$kw47$HANDLE_SETUP, (SubLObject)html_kernel.$sym48$CB_LINK_HANDLE_SETUP, (SubLObject)html_kernel.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)html_kernel.$sym59$MAIN_MENU, (SubLObject)html_kernel.$kw39$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)html_kernel.$kw62$MAIN_MENU, (SubLObject)html_kernel.$sym63$CB_LINK_MAIN_MENU, (SubLObject)html_kernel.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)html_kernel.$sym64$MOSAIC_MAIN_MENU, (SubLObject)html_kernel.$kw39$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)html_kernel.$sym65$MENU, (SubLObject)html_kernel.$kw39$HTML_HANDLER);
        utilities_macros.register_html_state_variable((SubLObject)html_kernel.$sym66$_HTML_MACHINE_STATE_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)html_kernel.$sym69$_HTML_MACHINE_STATE_HASH_);
        html_macros.note_cgi_handler_function((SubLObject)html_kernel.$sym81$SHOW_REMOTE_USER, (SubLObject)html_kernel.$kw39$HTML_HANDLER);
        memoization_state.note_globally_cached_function((SubLObject)html_kernel.$sym86$MACHINE_IS_MYSELF_VIA_CYC_API);
        return (SubLObject)html_kernel.NIL;
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
        me = (SubLFile)new html_kernel();
        html_kernel.$within_html_server$ = null;
        html_kernel.$continue_on_html_error$ = null;
        html_kernel.$html_server_buffer_size$ = null;
        html_kernel.$html_message$ = null;
        html_kernel.$monitor_html_action$ = null;
        html_kernel.$record_html_messagesP$ = null;
        html_kernel.$html_message_record$ = null;
        html_kernel.$http_remote_user$ = null;
        html_kernel.$http_remote_host$ = null;
        html_kernel.$default_html_handler$ = null;
        html_kernel.$http_restricted_functions$ = null;
        html_kernel.$html_arg_separator_chars$ = null;
        html_kernel.$html_arg_syntax_char$ = null;
        html_kernel.$html_javascript_compatibility_script$ = null;
        html_kernel.$main_menu_list$ = null;
        html_kernel.$html_machine_state_lock$ = null;
        html_kernel.$html_machine_state_hash$ = null;
        html_kernel.$html_machine_state_update_lock$ = null;
        html_kernel.$machine_is_myself_timeout$ = null;
        html_kernel.$machine_is_myself_via_cyc_api_caching_state$ = null;
        $kw0$HTML = SubLObjectFactory.makeKeyword("HTML");
        $sym1$HTML_SERVER_HANDLER = SubLObjectFactory.makeSymbol("HTML-SERVER-HANDLER");
        $kw2$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str3$CYC = SubLObjectFactory.makeString("CYC");
        $sym4$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $kw5$HTML_QUIT = SubLObjectFactory.makeKeyword("HTML-QUIT");
        $sym6$HTML_QUIT = SubLObjectFactory.makeSymbol("HTML-QUIT");
        $str7$dispatcher = SubLObjectFactory.makeString("dispatcher");
        $str8$_S_server = SubLObjectFactory.makeString("~S server");
        $kw9$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym10$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $int11$100 = SubLObjectFactory.makeInteger(100);
        $str12$ = SubLObjectFactory.makeString("");
        $sym13$_DEFAULT_HTML_HANDLER_ = SubLObjectFactory.makeSymbol("*DEFAULT-HTML-HANDLER*");
        $str14$No_handler_function_was_specified = SubLObjectFactory.makeString("No handler function was specified");
        $str15$No_handler_for_function__A_is_def = SubLObjectFactory.makeString("No handler for function ~A is defined");
        $str16$_S_is_not_an_CGI_handler_function = SubLObjectFactory.makeString("~S is not an CGI handler function");
        $str17$___A_called_a_bogus_function___Me = SubLObjectFactory.makeString("~%~A called a bogus function.  Message: ~S");
        $str18$___A__A_calls__A_on_args__A______ = SubLObjectFactory.makeString("~&~A ~A calls ~A on args ~A ...~%");
        $sym19$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str20$___A_Finished_call_to__A_for__A__ = SubLObjectFactory.makeString("~&~A Finished call to ~A for ~A.~%");
        $str21$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str22$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw23$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw24$RED = SubLObjectFactory.makeKeyword("RED");
        $str25$HTML_Transfer_halted_due_to_scrip = SubLObjectFactory.makeString("HTML Transfer halted due to script error:");
        $str26$_A___ = SubLObjectFactory.makeString("~A.~%");
        $sym27$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym28$HTML_ARG_SYNTAX_CHAR = SubLObjectFactory.makeSymbol("HTML-ARG-SYNTAX-CHAR");
        $str29$__ = SubLObjectFactory.makeString("&|");
        $sym30$HTML_ARG_SEPARATOR_CHAR = SubLObjectFactory.makeSymbol("HTML-ARG-SEPARATOR-CHAR");
        $str31$_ = SubLObjectFactory.makeString("=");
        $str32$Browser_Setup = SubLObjectFactory.makeString("Browser Setup");
        $str33$Cannot_have_a_FRAMESET_tag_inside = SubLObjectFactory.makeString("Cannot have a FRAMESET tag inside a BODY tag.");
        $str34$0__ = SubLObjectFactory.makeString("0,*");
        $kw35$EMPTY = SubLObjectFactory.makeKeyword("EMPTY");
        $kw36$SETUP = SubLObjectFactory.makeKeyword("SETUP");
        $str37$Frames_and_JavaScript_are_not_Sup = SubLObjectFactory.makeString("Frames and JavaScript are not Supported");
        $sym38$CB_SETUP = SubLObjectFactory.makeSymbol("CB-SETUP");
        $kw39$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str40$Frames_Supported__JavaScript_eith = SubLObjectFactory.makeString("Frames Supported, JavaScript either not Supported or Disabled");
        $sym41$CB_SETUP_FRAME = SubLObjectFactory.makeSymbol("CB-SETUP-FRAME");
        $str42$Frames_Supported_and_JavaScript_E = SubLObjectFactory.makeString("Frames Supported and JavaScript Enabled");
        $sym43$CB_SETUP_FRAME_SCRIPT = SubLObjectFactory.makeSymbol("CB-SETUP-FRAME-SCRIPT");
        $sym44$CB_HANDLE_SETUP = SubLObjectFactory.makeSymbol("CB-HANDLE-SETUP");
        $kw45$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str46$cb_handle_setup = SubLObjectFactory.makeString("cb-handle-setup");
        $kw47$HANDLE_SETUP = SubLObjectFactory.makeKeyword("HANDLE-SETUP");
        $sym48$CB_LINK_HANDLE_SETUP = SubLObjectFactory.makeSymbol("CB-LINK-HANDLE-SETUP");
        $str49$_var_path___location_href__var_ne = SubLObjectFactory.makeString("\nvar path = location.href;\nvar new_path = path.substring(path.lastIndexOf('/') + 1, path.length) + '-script';\nlocation = new_path;\n");
        $str50$___ = SubLObjectFactory.makeString("// ");
        $str51$Click_here_now = SubLObjectFactory.makeString("Click here now");
        $str52$_now_to_optimally_configure_the_i = SubLObjectFactory.makeString(" now to optimally configure the interface for your browser's capabilities.");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cb-setup"), (SubLObject)SubLObjectFactory.makeString("Browser Setup")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cb-start"), (SubLObject)SubLObjectFactory.makeString("KB Browser")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cb-start|hb-start"), (SubLObject)SubLObjectFactory.makeString("Hierarchy Browser")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cb-start|cyc-navigator"), (SubLObject)SubLObjectFactory.makeString("Cyc Navigator")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cb-start|cb-login"), (SubLObject)SubLObjectFactory.makeString("User Login")));
        $str54$Cyc_Main_Menu = SubLObjectFactory.makeString("Cyc Main Menu");
        $str55$Cyc_Documentation = SubLObjectFactory.makeString("Cyc Documentation");
        $sym56$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym57$CDR = SubLObjectFactory.makeSymbol("CDR");
        $str58$_A_ = SubLObjectFactory.makeString("~A?");
        $sym59$MAIN_MENU = SubLObjectFactory.makeSymbol("MAIN-MENU");
        $str60$Main_Menu = SubLObjectFactory.makeString("Main Menu");
        $str61$main_menu = SubLObjectFactory.makeString("main-menu");
        $kw62$MAIN_MENU = SubLObjectFactory.makeKeyword("MAIN-MENU");
        $sym63$CB_LINK_MAIN_MENU = SubLObjectFactory.makeSymbol("CB-LINK-MAIN-MENU");
        $sym64$MOSAIC_MAIN_MENU = SubLObjectFactory.makeSymbol("MOSAIC-MAIN-MENU");
        $sym65$MENU = SubLObjectFactory.makeSymbol("MENU");
        $sym66$_HTML_MACHINE_STATE_LOCK_ = SubLObjectFactory.makeSymbol("*HTML-MACHINE-STATE-LOCK*");
        $sym67$HTML_MACHINE_STATE_ITEM_VARIABLE = SubLObjectFactory.makeSymbol("HTML-MACHINE-STATE-ITEM-VARIABLE");
        $str68$HTML_State = SubLObjectFactory.makeString("HTML State");
        $sym69$_HTML_MACHINE_STATE_HASH_ = SubLObjectFactory.makeSymbol("*HTML-MACHINE-STATE-HASH*");
        $str70$HTML_Machine_State = SubLObjectFactory.makeString("HTML Machine State");
        $sym71$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $str72$unknown = SubLObjectFactory.makeString("unknown");
        $str73$___S____S = SubLObjectFactory.makeString("~%~S = ~S");
        $sym74$HTML_MACHINE_STATE_ITEM_VALUE = SubLObjectFactory.makeSymbol("HTML-MACHINE-STATE-ITEM-VALUE");
        $sym75$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $str76$Could_not_find_state_variable__S_ = SubLObjectFactory.makeString("Could not find state variable ~S for ~S");
        $str77$Could_not_find_state_for_machine_ = SubLObjectFactory.makeString("Could not find state for machine ~S");
        $sym78$_THE_CYCLIST_ = SubLObjectFactory.makeSymbol("*THE-CYCLIST*");
        $str79$Remote_User = SubLObjectFactory.makeString("Remote User");
        $str80$The_remote_user_is__A_at__A_ = SubLObjectFactory.makeString("The remote user is ~A at ~A.");
        $sym81$SHOW_REMOTE_USER = SubLObjectFactory.makeSymbol("SHOW-REMOTE-USER");
        $str82$127_0_0_1 = SubLObjectFactory.makeString("127.0.0.1");
        $str83$localhost = SubLObjectFactory.makeString("localhost");
        $str84$localhost_localdomain = SubLObjectFactory.makeString("localhost.localdomain");
        $float85$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $sym86$MACHINE_IS_MYSELF_VIA_CYC_API = SubLObjectFactory.makeSymbol("MACHINE-IS-MYSELF-VIA-CYC-API");
        $kw87$CYC_API = SubLObjectFactory.makeKeyword("CYC-API");
        $list88 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-IMAGE-ID")));
        $sym89$_MACHINE_IS_MYSELF_VIA_CYC_API_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*MACHINE-IS-MYSELF-VIA-CYC-API-CACHING-STATE*");
        $kw90$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str91$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str92$_S = SubLObjectFactory.makeString("~S");
        $kw93$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str94$_S________A__ = SubLObjectFactory.makeString("~S ~%    ~A~%");
        $kw95$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw96$EOF = SubLObjectFactory.makeKeyword("EOF");
        $sym97$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym98$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
    }
}

/*

	Total time: 620 ms
	
*/