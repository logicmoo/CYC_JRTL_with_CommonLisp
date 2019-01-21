package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;

import org.armedbear.lisp.Main;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class http_kernel extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.http_kernel";
    public static final String myFingerPrint = "503b40f95ba3a581a2d4603ad7d0a875139dbb7c6fbf3e9deced0cb7d5689687";
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1128L)
    public static SubLSymbol $http_cgi_bin_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1278L)
    public static SubLSymbol $http_cg_url$;
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1328L)
    public static SubLSymbol $http_cgi_bin_ws_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1851L)
    public static SubLSymbol $http_cyc_ws_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1935L)
    public static SubLSymbol $http_cyc_ws_machine$;
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 1983L)
    public static SubLSymbol $http_cyc_ws_port$;
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 2060L)
    public static SubLSymbol $http_request_logging_stream$;
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 6237L)
    private static SubLSymbol $get_http_logging_sequence_generator$;
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 7525L)
    public static SubLSymbol $http_return_mime_type_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17241L)
    private static SubLSymbol $http_file_request_headers_int_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 18234L)
    private static SubLSymbol $allow_css_js_expires_headers$;
    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 18953L)
    private static SubLSymbol $http_content_type_file_extension_table$;
    private static final SubLString $str0$_cgi_bin;
    private static final SubLString $str1$_cg_;
    private static final SubLString $str2$_cgi_bin_ws_;
    private static final SubLString $str3$_cyc_ws;
    private static final SubLSymbol $sym4$_HTTP_CYC_WS_MACHINE_;
    private static final SubLSymbol $sym5$_HTTP_CYC_WS_PORT_;
    private static final SubLSymbol $kw6$HTTP;
    private static final SubLSymbol $sym7$HTTP_SERVER_HANDLER;
    private static final SubLSymbol $kw8$TEXT;
    private static final SubLString $str9$HTTP_Request__6__0D_received_at__;
    private static final SubLString $str10$CYC;
    private static final SubLSymbol $sym11$DOUBLE_FLOAT;
    private static final SubLString $str12$HTTP_Request__6__0D_content___S__;
    private static final SubLSymbol $kw13$FILE;
    private static final SubLString $str14$_;
    private static final SubLSymbol $kw15$CGI;
    private static final SubLString $str16$_cgi_bin_cg_cb_start_redirect;
    private static final SubLSymbol $kw17$WS;
    private static final SubLSymbol $kw18$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym19$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str20$HTTP_Request__6__0D_returned_at__;
    private static final SubLSymbol $sym21$HTTP_LOG_REQUESTS_TO_FILE;
    private static final SubLString $str22$Unable_to_write_to__S__;
    private static final SubLSymbol $kw23$ERROR;
    private static final SubLSymbol $kw24$OUTPUT;
    private static final SubLSymbol $kw25$APPEND;
    private static final SubLString $str26$GET;
    private static final SubLString $str27$Content_length;
    private static final SubLString $str28$Remote_Host;
    private static final SubLString $str29$unknown;
    private static final SubLSymbol $kw30$UNINITIALIZED;
    private static final SubLString $str31$Unable_to_initialize__A__;
    private static final SubLString $str32$_;
    private static final SubLString $str33$return_mime_type_;
    private static final SubLString $str34$_;
    private static final SubLString $str35$_;
    private static final SubLSymbol $sym36$_;
    private static final SubLString $str37$return_mime_type;
    private static final SubLString $str38$_;
    private static final SubLString $str39$text_html__charset_utf_8;
    private static final SubLString $str40$text_html;
    private static final SubLString $str41$application_xml;
    private static final SubLString $str42$application_json;
    private static final SubLString $str43$Unknown_return_type_for_handler__;
    private static final SubLList $list44;
    private static final SubLString $str45$Content_Type;
    private static final SubLString $str46$POST;
    private static final SubLSymbol $kw47$POST;
    private static final SubLSymbol $kw48$GET;
    private static final SubLSymbol $kw49$KEEP_ALIVE_;
    private static final SubLSymbol $kw50$WIDE_NEWLINES_;
    private static final SubLSymbol $kw51$ACCEPT_TYPES;
    private static final SubLSymbol $kw52$DEFAULT;
    private static final SubLSymbol $kw53$CONTENT_TYPE;
    private static final SubLInteger $int54$80;
    private static final SubLSymbol $kw55$PRIVATE;
    private static final SubLSymbol $kw56$MACHINE;
    private static final SubLSymbol $kw57$PORT;
    private static final SubLSymbol $kw58$METHOD;
    private static final SubLSymbol $kw59$URL;
    private static final SubLSymbol $kw60$QUERY;
    private static final SubLSymbol $kw61$SOAP_ACTION_URI;
    private static final SubLSymbol $sym62$STRINGP;
    private static final SubLList $list63;
    private static final SubLString $str64$Accept;
    private static final SubLList $list65;
    private static final SubLSymbol $kw66$INPUT;
    private static final SubLString $str67$Unable_to_open__S;
    private static final SubLSymbol $kw68$EOF;
    private static final SubLInteger $int69$35;
    private static final SubLInteger $int70$47;
    private static final SubLInteger $int71$49;
    private static final SubLInteger $int72$50;
    private static final SubLInteger $int73$51;
    private static final SubLInteger $int74$52;
    private static final SubLList $list75;
    private static final SubLInteger $int76$404;
    private static final SubLString $str77$File_not_found;
    private static final SubLString $str78$;
    private static final SubLString $str79$user;
    private static final SubLString $str80$project;
    private static final SubLString $str81$_jnlp;
    private static final SubLSymbol $sym82$HTTP_FILE_REQUEST_HEADERS_INT;
    private static final SubLString $str83$Last_Modified;
    private static final SubLList $list84;
    private static final SubLString $str85$Content_Length;
    private static final SubLString $str86$Expires;
    private static final SubLSymbol $sym87$_HTTP_FILE_REQUEST_HEADERS_INT_CACHING_STATE_;
    private static final SubLInteger $int88$200;
    private static final SubLString $str89$image_;
    private static final SubLString $str90$text_;
    private static final SubLString $str91$css;
    private static final SubLString $str92$javascript;
    private static final SubLList $list93;
    private static final SubLList $list94;
    private static final SubLSymbol $kw95$PNG;
    private static final SubLString $str96$image_png;
    private static final SubLSymbol $kw97$JPEG;
    private static final SubLString $str98$image_jpeg;
    private static final SubLSymbol $kw99$GIF;
    private static final SubLString $str100$image_gif;
    private static final SubLSymbol $sym101$QUOTE;
    private static final SubLSymbol $sym102$HTTP_SERVER_BASE_URL;
    private static final SubLString $str103$http___;
    private static final SubLString $str104$_;
    private static final SubLSymbol $sym105$HTTP_SERVER_CGI_BASE_URL;
    private static final SubLSymbol $sym106$HTTP_CGI_REQUEST_CG_ARGS;
    private static final SubLSymbol $kw107$TEST;
    private static final SubLSymbol $kw108$OWNER;
    private static final SubLSymbol $kw109$CLASSES;
    private static final SubLSymbol $kw110$KB;
    private static final SubLSymbol $kw111$TINY;
    private static final SubLSymbol $kw112$WORKING_;
    private static final SubLList $list113;

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 2228L)
    public static SubLObject http_server_handler(final SubLObject in_stream, final SubLObject out_stream) {
		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(true);
		try {
			SubLPackage prevPackage = SubLPackage.getCurrentPackage();
			try {
				SubLPackage.setCurrentPackage("CYC");
		        return http_server_top_level(in_stream, out_stream);
			} finally {
				SubLPackage.setCurrentPackage(prevPackage);
			}
		} finally {
			Main.setSubLisp(wasSubLisp);
		}
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 2450L)
    public static SubLObject http_server_top_level(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject request_id = (SubLObject)http_kernel.NIL;
        SubLObject receive_time = (SubLObject)http_kernel.NIL;
        if (http_kernel.NIL != http_kernel.$http_request_logging_stream$.getGlobalValue()) {
            request_id = next_http_request_id();
            receive_time = numeric_date_utilities.get_universal_millisecond((SubLObject)http_kernel.UNPROVIDED);
            PrintLow.format(http_kernel.$http_request_logging_stream$.getGlobalValue(), (SubLObject)http_kernel.$str9$HTTP_Request__6__0D_received_at__, request_id, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED));
        }
        final SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding(thread);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)http_kernel.$str10$CYC), thread);
            reader.$read_default_float_format$.bind((SubLObject)http_kernel.$sym11$DOUBLE_FLOAT, thread);
            print_high.$print_readably$.bind((SubLObject)http_kernel.NIL, thread);
            reader.$read_eval$.bind((SubLObject)http_kernel.NIL, thread);
            final SubLObject old_priority = Threads.process_priority(Threads.current_process());
            try {
                Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                thread.resetMultipleValues();
                SubLObject protocol = http_parse_request(in_stream);
                SubLObject content = thread.secondMultipleValue();
                final SubLObject host = thread.thirdMultipleValue();
                final SubLObject method = thread.fourthMultipleValue();
                final SubLObject header_alist = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (http_kernel.NIL != http_kernel.$http_request_logging_stream$.getGlobalValue()) {
                    PrintLow.format(http_kernel.$http_request_logging_stream$.getGlobalValue(), (SubLObject)http_kernel.$str12$HTTP_Request__6__0D_content___S__, request_id, content);
                }
                if (protocol == http_kernel.$kw13$FILE && content.equal((SubLObject)http_kernel.$str14$_)) {
                    protocol = (SubLObject)http_kernel.$kw15$CGI;
                    content = (SubLObject)http_kernel.$str16$_cgi_bin_cg_cb_start_redirect;
                }
                try {
                    final SubLObject pcase_var = protocol;
                    if (pcase_var.eql((SubLObject)http_kernel.$kw15$CGI)) {
                        http_handle_cgi_request(out_stream, host, content);
                    }
                    else if (pcase_var.eql((SubLObject)http_kernel.$kw13$FILE)) {
                        http_handle_file_request(out_stream, host, content);
                    }
                    else if (pcase_var.eql((SubLObject)http_kernel.$kw17$WS)) {
                        http_handle_ws_request(out_stream, host, content, method, header_alist);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)http_kernel.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        SubLObject ignore_errors_tag = (SubLObject)http_kernel.NIL;
                        try {
                            thread.throwStack.push(http_kernel.$kw18$IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)http_kernel.$sym19$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    streams_high.force_output(out_stream);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)http_kernel.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)http_kernel.$kw18$IGNORE_ERRORS_TARGET);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)http_kernel.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    Threads.set_process_priority(Threads.current_process(), old_priority);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            reader.$read_eval$.rebind(_prev_bind_4, thread);
            print_high.$print_readably$.rebind(_prev_bind_3, thread);
            reader.$read_default_float_format$.rebind(_prev_bind_2, thread);
            Packages.$package$.rebind(_prev_bind_0, thread);
        }
        if (http_kernel.NIL != http_kernel.$http_request_logging_stream$.getGlobalValue()) {
            PrintLow.format(http_kernel.$http_request_logging_stream$.getGlobalValue(), (SubLObject)http_kernel.$str20$HTTP_Request__6__0D_returned_at__, new SubLObject[] { request_id, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED), Numbers.subtract(numeric_date_utilities.get_universal_millisecond((SubLObject)http_kernel.UNPROVIDED), receive_time) });
        }
        return (SubLObject)http_kernel.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 3909L)
    public static SubLObject http_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((system_parameters.$base_tcp_port$.getDynamicValue(thread).isNumber() && system_parameters.$http_port_offset$.getDynamicValue(thread).isNumber()) ? Numbers.add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$http_port_offset$.getDynamicValue(thread)) : http_kernel.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 4136L)
    public static SubLObject http_log_requests_to_file(final SubLObject filename, SubLObject overwrite) {
        if (overwrite == http_kernel.UNPROVIDED) {
            overwrite = (SubLObject)http_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (http_kernel.NIL == file_utilities.file_valid_for_writing_p(filename)) {
            Errors.warn((SubLObject)http_kernel.$str22$Unable_to_write_to__S__, filename);
            return (SubLObject)http_kernel.$kw23$ERROR;
        }
        SubLObject ignore_errors_tag = (SubLObject)http_kernel.NIL;
        try {
            thread.throwStack.push(http_kernel.$kw18$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)http_kernel.$sym19$IGNORE_ERRORS_HANDLER), thread);
                try {
                    streams_high.force_output(http_kernel.$http_request_logging_stream$.getGlobalValue());
                    if (http_kernel.NIL == streams_high.interactive_stream_p(http_kernel.$http_request_logging_stream$.getGlobalValue())) {
                        streams_high.close(http_kernel.$http_request_logging_stream$.getGlobalValue(), (SubLObject)http_kernel.UNPROVIDED);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)http_kernel.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)http_kernel.$kw18$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (http_kernel.NIL != overwrite) {
            file_utilities.delete_file_if_exists(filename);
        }
        final SubLObject stream = compatibility.open_text(filename, (SubLObject)((http_kernel.NIL != overwrite) ? http_kernel.$kw24$OUTPUT : http_kernel.$kw25$APPEND));
        http_kernel.$http_request_logging_stream$.setGlobalValue(stream);
        return filename;
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 4698L)
    public static SubLObject http_parse_request(final SubLObject in_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject protocol = (SubLObject)http_kernel.NIL;
        SubLObject content = (SubLObject)http_kernel.NIL;
        SubLObject host = (SubLObject)http_kernel.NIL;
        thread.resetMultipleValues();
        final SubLObject method = web_utilities.http_read_request(in_stream, (SubLObject)http_kernel.T);
        final SubLObject url = thread.secondMultipleValue();
        final SubLObject version = thread.thirdMultipleValue();
        final SubLObject header_alist = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (http_kernel.NIL == method) {
            return (SubLObject)http_kernel.NIL;
        }
        host = http_determine_remote_hostname(header_alist, in_stream);
        if (http_kernel.NIL != string_utilities.starts_with(url, http_kernel.$http_cgi_bin_directory$.getGlobalValue())) {
            protocol = (SubLObject)http_kernel.$kw15$CGI;
        }
        else if (http_kernel.NIL != string_utilities.starts_with(url, http_kernel.$http_cyc_ws_directory$.getGlobalValue())) {
            protocol = (SubLObject)http_kernel.$kw17$WS;
        }
        else {
            protocol = (SubLObject)http_kernel.$kw13$FILE;
        }
        if (method.equal((SubLObject)http_kernel.$str26$GET)) {
            content = url;
        }
        else {
            SubLObject content_stream = (SubLObject)http_kernel.NIL;
            try {
                content_stream = streams_high.make_private_string_output_stream();
                streams_high.write_string(url, content_stream, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED);
                streams_high.write_char((SubLObject)Characters.CHAR_question, content_stream);
                final SubLObject content_length = conses_high.assoc((SubLObject)http_kernel.$str27$Content_length, header_alist, Symbols.symbol_function((SubLObject)http_kernel.EQUALP), (SubLObject)http_kernel.UNPROVIDED).rest();
                if (http_kernel.NIL != content_length) {
                    SubLObject cdotimes_end_var;
                    SubLObject i;
                    for (cdotimes_end_var = reader.parse_integer(content_length, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED), i = (SubLObject)http_kernel.NIL, i = (SubLObject)http_kernel.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)http_kernel.ONE_INTEGER)) {
                        streams_high.write_char(streams_high.read_char(in_stream, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED), content_stream);
                    }
                }
                content = streams_high.get_output_stream_string(content_stream);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)http_kernel.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(content_stream, (SubLObject)http_kernel.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return Values.values(protocol, content, host, method, header_alist);
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 5707L)
    public static SubLObject http_determine_remote_hostname(final SubLObject header_alist, final SubLObject stream) {
        final SubLObject provided_host = conses_high.assoc((SubLObject)http_kernel.$str28$Remote_Host, header_alist, Symbols.symbol_function((SubLObject)http_kernel.EQUALP), (SubLObject)http_kernel.UNPROVIDED).rest();
        if (provided_host.isString()) {
            return provided_host;
        }
        final SubLObject remote_hostname = subl_promotions.tcp_stream_remote_hostname(stream);
        if (remote_hostname.isString()) {
            return remote_hostname;
        }
        final SubLObject remote_address = subl_promotions.tcp_stream_remote_address(stream);
        if (remote_address.isString()) {
            return remote_address;
        }
        return (SubLObject)http_kernel.$str29$unknown;
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 6237L)
    public static SubLObject get_http_logging_sequence_generator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (http_kernel.$get_http_logging_sequence_generator$.getDynamicValue(thread) == http_kernel.$kw30$UNINITIALIZED) {
            final SubLObject init_value = integer_sequence_generator.new_integer_sequence_generator((SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED);
            if (init_value == http_kernel.$kw30$UNINITIALIZED) {
                Errors.error((SubLObject)http_kernel.$str31$Unable_to_initialize__A__, http_kernel.$get_http_logging_sequence_generator$.getDynamicValue(thread));
            }
            http_kernel.$get_http_logging_sequence_generator$.setDynamicValue(init_value, thread);
        }
        return http_kernel.$get_http_logging_sequence_generator$.getDynamicValue(thread);
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 6327L)
    public static SubLObject next_http_request_id() {
        return integer_sequence_generator.integer_sequence_generator_next(get_http_logging_sequence_generator());
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 6449L)
    public static SubLObject http_handle_cgi_request(final SubLObject out_stream, final SubLObject host, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = (SubLObject)http_kernel.NIL;
        SubLObject ignore_errors_tag = (SubLObject)http_kernel.NIL;
        try {
            thread.throwStack.push(http_kernel.$kw18$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)http_kernel.$sym19$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject cg_args = http_cgi_request_cg_args(content, (SubLObject)http_kernel.UNPROVIDED);
                    if (http_kernel.NIL != html_utilities.html_request_arguments_are_multipart_dataP(cg_args)) {
                        final SubLObject contents = html_utilities.html_parse_multipart_form_data(cg_args);
                        cg_args = html_utilities.html_construct_message_from_multipart_data(contents);
                    }
                    final SubLObject html_message = Sequences.cconcatenate(host, new SubLObject[] { http_kernel.$str32$_, cg_args });
                    final SubLObject handler_function = html_kernel.handler_function_from_html_message(html_message);
                    final SubLObject headers = http_cgi_request_headers(content, handler_function);
                    web_utilities.http_send_ok_response(out_stream, headers);
                    html_kernel.handle_html_message_to_stream(html_message, out_stream);
                    success = (SubLObject)http_kernel.T;
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)http_kernel.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)http_kernel.$kw18$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return success;
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 7770L)
    public static SubLObject http_cgi_request_cg_args(final SubLObject content, SubLObject cgi_start) {
        if (cgi_start == http_kernel.UNPROVIDED) {
            cgi_start = (SubLObject)http_kernel.ZERO_INTEGER;
        }
        final SubLObject wsP = string_utilities.starts_with(content, http_kernel.$http_cgi_bin_ws_directory$.getGlobalValue());
        final SubLObject question_mark_location = Sequences.search(http_kernel.$http_cg_url$.getGlobalValue(), content, Symbols.symbol_function((SubLObject)http_kernel.EQUAL), Symbols.symbol_function((SubLObject)http_kernel.IDENTITY), (SubLObject)http_kernel.ZERO_INTEGER, (SubLObject)http_kernel.NIL, cgi_start, (SubLObject)http_kernel.NIL);
        if (http_kernel.NIL != wsP) {
            SubLObject args_string = string_utilities.substring(content, Sequences.length(http_kernel.$http_cgi_bin_ws_directory$.getGlobalValue()), (SubLObject)http_kernel.UNPROVIDED);
            final SubLObject question_location = Sequences.search((SubLObject)http_kernel.$str34$_, args_string, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED);
            final SubLObject ampersand_location = Sequences.search((SubLObject)http_kernel.$str32$_, args_string, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED);
            final SubLObject pipe_location = Sequences.search((SubLObject)http_kernel.$str35$_, args_string, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED);
            final SubLObject first_separator = list_utilities.extremal(Sequences.remove((SubLObject)http_kernel.NIL, (SubLObject)ConsesLow.list(ampersand_location, pipe_location), (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED), (SubLObject)http_kernel.$sym36$_, (SubLObject)http_kernel.UNPROVIDED);
            if (http_kernel.NIL != question_location && http_kernel.NIL != first_separator && question_location.numL(first_separator)) {
                args_string = string_utilities.replace_substring_once(args_string, (SubLObject)http_kernel.$str34$_, (SubLObject)http_kernel.$str32$_, cgi_start);
            }
            return args_string;
        }
        if (http_kernel.NIL != subl_promotions.positive_integer_p(question_mark_location)) {
            return string_utilities.substring(content, Numbers.add(Sequences.length(http_kernel.$http_cg_url$.getGlobalValue()), question_mark_location), (SubLObject)http_kernel.UNPROVIDED);
        }
        return string_utilities.substring(content, number_utilities.f_1X(Sequences.length(http_kernel.$http_cgi_bin_directory$.getGlobalValue())), (SubLObject)http_kernel.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 8965L)
    public static SubLObject http_get_content_type_for_cgi_request(final SubLObject raw_content, final SubLObject handler_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject content = web_utilities.html_url_decode(raw_content);
        final SubLObject mime_description = Sequences.search((SubLObject)http_kernel.$str37$return_mime_type, content, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED);
        final SubLObject handler_type = html_macros.get_handler_mime_type_property(handler_function);
        if (http_kernel.NIL != mime_description) {
            final SubLObject mime_type_start = Numbers.add((SubLObject)http_kernel.SEVENTEEN_INTEGER, mime_description);
            final SubLObject mime_type_end = Sequences.search((SubLObject)http_kernel.$str38$_, content, (SubLObject)http_kernel.EQUAL, (SubLObject)http_kernel.IDENTITY, (SubLObject)http_kernel.ZERO_INTEGER, (SubLObject)http_kernel.NIL, mime_type_start, (SubLObject)http_kernel.UNPROVIDED);
            final SubLObject mime_type_string = string_utilities.substring(content, mime_type_start, mime_type_end);
            return mime_type_string;
        }
        if (handler_type.eql(html_macros.$html_handler_property$.getGlobalValue()) && http_kernel.NIL != system_parameters.$permit_utf_8_character_display$.getDynamicValue(thread)) {
            return (SubLObject)http_kernel.$str39$text_html__charset_utf_8;
        }
        if (handler_type.eql(html_macros.$html_handler_property$.getGlobalValue())) {
            return (SubLObject)http_kernel.$str40$text_html;
        }
        if (handler_type.eql(html_macros.$xml_handler_property$.getGlobalValue())) {
            return (SubLObject)http_kernel.$str41$application_xml;
        }
        if (handler_type.eql(html_macros.$json_handler_property$.getGlobalValue())) {
            return (SubLObject)http_kernel.$str42$application_json;
        }
        Errors.warn((SubLObject)http_kernel.$str43$Unknown_return_type_for_handler__, handler_function);
        return (SubLObject)http_kernel.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 10404L)
    public static SubLObject http_cgi_request_headers(final SubLObject content, SubLObject handler_function) {
        if (handler_function == http_kernel.UNPROVIDED) {
            handler_function = (SubLObject)http_kernel.NIL;
        }
        final SubLObject mime_type = http_get_content_type_for_cgi_request(content, handler_function);
        return (SubLObject)ConsesLow.list((SubLObject)http_kernel.$list44, reader.bq_cons((SubLObject)http_kernel.$str45$Content_Type, mime_type));
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 10657L)
    public static SubLObject http_handle_ws_request(final SubLObject out_stream, final SubLObject host, final SubLObject content, SubLObject method, final SubLObject header_alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        method = (SubLObject)(method.equalp((SubLObject)http_kernel.$str46$POST) ? http_kernel.$kw47$POST : http_kernel.$kw48$GET);
        final SubLObject proxy_content = string_utilities.substring(content, (SubLObject)http_kernel.SEVEN_INTEGER, (SubLObject)http_kernel.UNPROVIDED);
        final SubLObject header_plist = http_ws_header_conversion(header_alist);
        SubLObject total = (SubLObject)http_kernel.ZERO_INTEGER;
        thread.resetMultipleValues();
        final SubLObject url = possibly_split_full_query_url(proxy_content);
        final SubLObject query = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject current;
        final SubLObject datum = current = header_plist;
        final SubLObject keep_aliveP_tail = cdestructuring_bind.property_list_member((SubLObject)http_kernel.$kw49$KEEP_ALIVE_, current);
        final SubLObject keep_aliveP = (SubLObject)((http_kernel.NIL != keep_aliveP_tail) ? conses_high.cadr(keep_aliveP_tail) : http_kernel.T);
        final SubLObject wide_newlinesP_tail = cdestructuring_bind.property_list_member((SubLObject)http_kernel.$kw50$WIDE_NEWLINES_, current);
        final SubLObject wide_newlinesP = (SubLObject)((http_kernel.NIL != wide_newlinesP_tail) ? conses_high.cadr(wide_newlinesP_tail) : http_kernel.NIL);
        final SubLObject accept_types_tail = cdestructuring_bind.property_list_member((SubLObject)http_kernel.$kw51$ACCEPT_TYPES, current);
        final SubLObject accept_types = (SubLObject)((http_kernel.NIL != accept_types_tail) ? conses_high.cadr(accept_types_tail) : http_kernel.$kw52$DEFAULT);
        final SubLObject content_type_tail = cdestructuring_bind.property_list_member((SubLObject)http_kernel.$kw53$CONTENT_TYPE, current);
        final SubLObject content_type = (SubLObject)((http_kernel.NIL != content_type_tail) ? conses_high.cadr(content_type_tail) : http_kernel.$kw52$DEFAULT);
        final SubLObject real_port = (SubLObject)(http_kernel.$http_cyc_ws_port$.getGlobalValue().eql((SubLObject)http_kernel.$kw52$DEFAULT) ? http_kernel.$int54$80 : http_kernel.$http_cyc_ws_port$.getGlobalValue());
        SubLObject proxy_stream = (SubLObject)http_kernel.NIL;
        try {
            proxy_stream = subl_promotions.open_tcp_stream_with_timeout(http_kernel.$http_cyc_ws_machine$.getGlobalValue(), real_port, (SubLObject)http_kernel.NIL, (SubLObject)http_kernel.$kw55$PRIVATE);
            if (http_kernel.NIL != subl_macro_promotions.validate_tcp_connection(proxy_stream, http_kernel.$http_cyc_ws_machine$.getGlobalValue(), real_port)) {
                web_utilities.send_http_request(proxy_stream, (SubLObject)ConsesLow.list(new SubLObject[] { http_kernel.$kw56$MACHINE, http_kernel.$http_cyc_ws_machine$.getGlobalValue(), http_kernel.$kw57$PORT, http_kernel.$http_cyc_ws_port$.getGlobalValue(), http_kernel.$kw58$METHOD, method, http_kernel.$kw59$URL, url, http_kernel.$kw60$QUERY, query, http_kernel.$kw49$KEEP_ALIVE_, http_kernel.NIL, http_kernel.$kw50$WIDE_NEWLINES_, wide_newlinesP, http_kernel.$kw51$ACCEPT_TYPES, accept_types, http_kernel.$kw53$CONTENT_TYPE, content_type, http_kernel.$kw61$SOAP_ACTION_URI, http_kernel.NIL }));
                for (SubLObject v_char = streams_high.read_char(proxy_stream, (SubLObject)http_kernel.NIL, (SubLObject)http_kernel.NIL, (SubLObject)http_kernel.UNPROVIDED); http_kernel.NIL != v_char; v_char = streams_high.read_char(proxy_stream, (SubLObject)http_kernel.NIL, (SubLObject)http_kernel.NIL, (SubLObject)http_kernel.UNPROVIDED)) {
                    streams_high.write_char(v_char, out_stream);
                    total = Numbers.add(total, (SubLObject)http_kernel.ONE_INTEGER);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)http_kernel.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (http_kernel.NIL != proxy_stream) {
                    streams_high.close(proxy_stream, (SubLObject)http_kernel.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject ignore_errors_tag = (SubLObject)http_kernel.NIL;
        try {
            thread.throwStack.push(http_kernel.$kw18$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)http_kernel.$sym19$IGNORE_ERRORS_HANDLER), thread);
                try {
                    streams_high.force_output(out_stream);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)http_kernel.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_2, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)http_kernel.$kw18$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return total;
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 12157L)
    public static SubLObject possibly_split_full_query_url(final SubLObject full_query_url) {
        assert http_kernel.NIL != Types.stringp(full_query_url) : full_query_url;
        final SubLObject url_end = Sequences.position((SubLObject)Characters.CHAR_question, full_query_url, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED);
        SubLObject url = full_query_url;
        SubLObject query = (SubLObject)http_kernel.NIL;
        if (http_kernel.NIL != url_end) {
            url = string_utilities.substring(full_query_url, (SubLObject)http_kernel.ZERO_INTEGER, url_end);
            query = string_utilities.substring(full_query_url, number_utilities.f_1X(url_end), (SubLObject)http_kernel.UNPROVIDED);
        }
        return Values.values(url, query);
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 12500L)
    public static SubLObject http_ws_header_conversion(final SubLObject header_alist) {
        SubLObject result_plist = (SubLObject)http_kernel.NIL;
        SubLObject cdolist_list_var = header_alist;
        SubLObject cons = (SubLObject)http_kernel.NIL;
        cons = cdolist_list_var.first();
        while (http_kernel.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject header_key = (SubLObject)http_kernel.NIL;
            SubLObject value = (SubLObject)http_kernel.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)http_kernel.$list63);
            header_key = current.first();
            current = (value = current.rest());
            if (header_key.equalp((SubLObject)http_kernel.$str45$Content_Type)) {
                result_plist = conses_high.putf(result_plist, (SubLObject)http_kernel.$kw53$CONTENT_TYPE, value);
            }
            else if (header_key.equalp((SubLObject)http_kernel.$str64$Accept)) {
                result_plist = conses_high.putf(result_plist, (SubLObject)http_kernel.$kw51$ACCEPT_TYPES, (SubLObject)ConsesLow.list(value));
            }
            else if (http_kernel.NIL != list_utilities.member_equalpP(header_key, (SubLObject)http_kernel.$list65)) {}
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return result_plist;
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 13403L)
    public static SubLObject http_handle_file_request(final SubLObject out_stream, final SubLObject host, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject whole_filename = http_file_request_filename(content);
        SubLObject success = (SubLObject)http_kernel.NIL;
        thread.resetMultipleValues();
        final SubLObject filename = separate_args_from_file_request(whole_filename);
        final SubLObject cyclist = thread.secondMultipleValue();
        final SubLObject project = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject ignore_errors_tag = (SubLObject)http_kernel.NIL;
        try {
            thread.throwStack.push(http_kernel.$kw18$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)http_kernel.$sym19$IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (http_kernel.NIL != Filesys.probe_file(filename) && http_kernel.NIL == Filesys.directory_p(filename)) {
                        final SubLObject headers = http_file_request_headers(filename);
                        final SubLObject java_web_start_fileP = java_web_start_file_p(filename);
                        web_utilities.http_send_ok_response(out_stream, headers);
                        SubLObject stream = (SubLObject)http_kernel.NIL;
                        try {
                            final SubLObject _prev_bind_0_$4 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind((SubLObject)http_kernel.NIL, thread);
                                stream = compatibility.open_binary(filename, (SubLObject)http_kernel.$kw66$INPUT);
                            }
                            finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$4, thread);
                            }
                            if (!stream.isStream()) {
                                Errors.error((SubLObject)http_kernel.$str67$Unable_to_open__S, filename);
                            }
                            SubLObject content_stream;
                            SubLObject v_byte;
                            for (content_stream = stream, v_byte = (SubLObject)http_kernel.NIL, v_byte = streams_high.read_byte(content_stream, (SubLObject)http_kernel.NIL, (SubLObject)http_kernel.$kw68$EOF); http_kernel.$kw68$EOF != v_byte; v_byte = streams_high.read_byte(content_stream, (SubLObject)http_kernel.NIL, (SubLObject)http_kernel.$kw68$EOF)) {
                                if (http_kernel.NIL != java_web_start_fileP && v_byte.eql((SubLObject)http_kernel.$int69$35)) {
                                    v_byte = streams_high.read_byte(content_stream, (SubLObject)http_kernel.NIL, (SubLObject)http_kernel.$kw68$EOF);
                                    if (v_byte.eql((SubLObject)http_kernel.$int70$47)) {
                                        print_high.princ(Environment.get_machine_name((SubLObject)http_kernel.$str29$unknown), out_stream);
                                        streams_high.write_char(Characters.code_char((SubLObject)http_kernel.$int70$47), out_stream);
                                    }
                                    else if (v_byte.eql((SubLObject)http_kernel.$int71$49)) {
                                        print_high.princ(Environment.get_machine_name((SubLObject)http_kernel.$str29$unknown), out_stream);
                                    }
                                    else if (v_byte.eql((SubLObject)http_kernel.$int72$50)) {
                                        print_high.princ(system_parameters.$base_tcp_port$.getDynamicValue(thread), out_stream);
                                    }
                                    else if (v_byte.eql((SubLObject)http_kernel.$int73$51)) {
                                        print_high.princ(cyclist, out_stream);
                                    }
                                    else if (v_byte.eql((SubLObject)http_kernel.$int74$52)) {
                                        print_high.princ(project, out_stream);
                                    }
                                    else {
                                        streams_high.write_char(Characters.code_char((SubLObject)http_kernel.$int69$35), out_stream);
                                        streams_high.write_char(Characters.code_char(v_byte), out_stream);
                                    }
                                }
                                else {
                                    streams_high.write_char(Characters.code_char(v_byte), out_stream);
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)http_kernel.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (stream.isStream()) {
                                    streams_high.close(stream, (SubLObject)http_kernel.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                        success = (SubLObject)http_kernel.T;
                    }
                    else {
                        final SubLObject headers = (SubLObject)http_kernel.$list75;
                        web_utilities.http_send_error_response(out_stream, (SubLObject)http_kernel.$int76$404, headers);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(out_stream, thread);
                            cb_utilities.cb_error((SubLObject)http_kernel.$str77$File_not_found, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$6, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)http_kernel.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)http_kernel.$kw18$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return success;
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 15462L)
    public static SubLObject separate_args_from_file_request(final SubLObject filename) {
        final SubLObject qm_position = string_utilities.char_position((SubLObject)Characters.CHAR_question, filename, (SubLObject)http_kernel.UNPROVIDED);
        if (http_kernel.NIL == qm_position) {
            return Values.values(filename, (SubLObject)http_kernel.NIL, (SubLObject)http_kernel.NIL);
        }
        if (http_kernel.$str78$.equalp(Sequences.subseq(filename, Numbers.add(qm_position, (SubLObject)http_kernel.ONE_INTEGER), (SubLObject)http_kernel.UNPROVIDED))) {
            return Values.values(Sequences.subseq(filename, (SubLObject)http_kernel.ZERO_INTEGER, qm_position), (SubLObject)http_kernel.NIL, (SubLObject)http_kernel.NIL);
        }
        final SubLObject just_the_filename = Sequences.subseq(filename, (SubLObject)http_kernel.ZERO_INTEGER, qm_position);
        final SubLObject args_string = Sequences.subseq(filename, Numbers.add(qm_position, (SubLObject)http_kernel.ONE_INTEGER), (SubLObject)http_kernel.UNPROVIDED);
        final SubLObject args = html_kernel.parse_html_handler_arg_string(args_string, (SubLObject)http_kernel.ZERO_INTEGER);
        final SubLObject cyclist_string = html_utilities.html_extract_input((SubLObject)http_kernel.$str79$user, args);
        final SubLObject project_string = html_utilities.html_extract_input((SubLObject)http_kernel.$str80$project, args);
        final SubLObject cyclist = (SubLObject)((http_kernel.NIL != cyclist_string) ? czer_main.canonicalize_term(reader.read_from_string(web_utilities.html_url_decode(cyclist_string), (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED), (SubLObject)http_kernel.UNPROVIDED) : http_kernel.NIL);
        final SubLObject project = (SubLObject)((http_kernel.NIL != project_string) ? czer_main.canonicalize_term(reader.read_from_string(web_utilities.html_url_decode(project_string), (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED), (SubLObject)http_kernel.UNPROVIDED) : http_kernel.NIL);
        return Values.values(just_the_filename, cyclist, project);
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 16691L)
    public static SubLObject java_web_start_file_p(final SubLObject filename) {
        return string_utilities.ends_with(filename, (SubLObject)http_kernel.$str81$_jnlp, (SubLObject)http_kernel.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 16853L)
    public static SubLObject http_file_request_filename(final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return file_utilities.relative_filename(system_parameters.$http_htdocs_directory$.getDynamicValue(thread), content, (SubLObject)http_kernel.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17110L)
    public static SubLObject http_file_request_headers(final SubLObject filename) {
        return http_file_request_headers_int(filename, Filesys.file_write_date(filename));
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17241L)
    public static SubLObject clear_http_file_request_headers_int() {
        final SubLObject cs = http_kernel.$http_file_request_headers_int_caching_state$.getGlobalValue();
        if (http_kernel.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)http_kernel.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17241L)
    public static SubLObject remove_http_file_request_headers_int(final SubLObject filename, final SubLObject last_modified_time) {
        return memoization_state.caching_state_remove_function_results_with_args(http_kernel.$http_file_request_headers_int_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(filename, last_modified_time), (SubLObject)http_kernel.UNPROVIDED, (SubLObject)http_kernel.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17241L)
    public static SubLObject http_file_request_headers_int_internal(final SubLObject filename, final SubLObject last_modified_time) {
        final SubLObject last_modified_string = web_utilities.http_date_string(last_modified_time);
        SubLObject content_length = file_utilities.get_file_length(filename);
        final SubLObject content_type = http_file_request_content_type(filename);
        final SubLObject expires = (SubLObject)((http_kernel.NIL != last_modified_time) ? http_kernel.NIL : http_file_request_expires(content_type));
        if (http_kernel.NIL != java_web_start_file_p(filename)) {
            content_length = Numbers.add(content_length, number_utilities.f_1_(Sequences.length(Environment.get_machine_name((SubLObject)http_kernel.$str29$unknown))));
        }
        return (SubLObject)ConsesLow.listS(reader.bq_cons((SubLObject)http_kernel.$str83$Last_Modified, last_modified_string), (SubLObject)http_kernel.$list84, reader.bq_cons((SubLObject)http_kernel.$str85$Content_Length, content_length), reader.bq_cons((SubLObject)http_kernel.$str45$Content_Type, content_type), ConsesLow.append((SubLObject)((http_kernel.NIL != expires) ? ConsesLow.list(reader.bq_cons((SubLObject)http_kernel.$str86$Expires, expires)) : http_kernel.NIL), (SubLObject)http_kernel.NIL));
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 17241L)
    public static SubLObject http_file_request_headers_int(final SubLObject filename, final SubLObject last_modified_time) {
        SubLObject caching_state = http_kernel.$http_file_request_headers_int_caching_state$.getGlobalValue();
        if (http_kernel.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)http_kernel.$sym82$HTTP_FILE_REQUEST_HEADERS_INT, (SubLObject)http_kernel.$sym87$_HTTP_FILE_REQUEST_HEADERS_INT_CACHING_STATE_, (SubLObject)http_kernel.$int88$200, (SubLObject)http_kernel.EQUAL, (SubLObject)http_kernel.TWO_INTEGER, (SubLObject)http_kernel.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(filename, last_modified_time);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)http_kernel.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)http_kernel.NIL;
            collision = cdolist_list_var.first();
            while (http_kernel.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (filename.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (http_kernel.NIL != cached_args && http_kernel.NIL == cached_args.rest() && last_modified_time.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(http_file_request_headers_int_internal(filename, last_modified_time)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(filename, last_modified_time));
        return memoization_state.caching_results(results3);
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 18382L)
    public static SubLObject http_file_request_expires(final SubLObject content_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (http_kernel.NIL != string_utilities.starts_with(content_type, (SubLObject)http_kernel.$str89$image_)) {
            return web_utilities.http_date_string(numeric_date_utilities.universal_time_for_start_of_universal_date(numeric_date_utilities.encode_universal_date((SubLObject)http_kernel.ONE_INTEGER, (SubLObject)http_kernel.ONE_INTEGER, Numbers.add((SubLObject)http_kernel.TWO_INTEGER, numeric_date_utilities.this_year())), (SubLObject)http_kernel.UNPROVIDED));
        }
        if (http_kernel.NIL != http_kernel.$allow_css_js_expires_headers$.getDynamicValue(thread) && http_kernel.NIL != string_utilities.starts_with(content_type, (SubLObject)http_kernel.$str90$text_) && (http_kernel.NIL != string_utilities.ends_with(content_type, (SubLObject)http_kernel.$str91$css, (SubLObject)http_kernel.UNPROVIDED) || http_kernel.NIL != string_utilities.ends_with(content_type, (SubLObject)http_kernel.$str92$javascript, (SubLObject)http_kernel.UNPROVIDED))) {
            return web_utilities.http_date_string(numeric_date_utilities.universal_time_for_start_of_universal_date(numeric_date_utilities.universal_date_add_days(numeric_date_utilities.today(), (SubLObject)http_kernel.THREE_INTEGER), (SubLObject)http_kernel.UNPROVIDED));
        }
        return (SubLObject)http_kernel.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 19935L)
    public static SubLObject http_file_request_content_type(final SubLObject filename) {
        SubLObject cdolist_list_var = http_kernel.$http_content_type_file_extension_table$.getGlobalValue();
        SubLObject file_extention_info = (SubLObject)http_kernel.NIL;
        file_extention_info = cdolist_list_var.first();
        while (http_kernel.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = file_extention_info;
            SubLObject content_type = (SubLObject)http_kernel.NIL;
            SubLObject extensions = (SubLObject)http_kernel.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)http_kernel.$list94);
            content_type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)http_kernel.$list94);
            extensions = current.first();
            current = current.rest();
            if (http_kernel.NIL == current) {
                SubLObject cdolist_list_var_$7 = extensions;
                SubLObject extension = (SubLObject)http_kernel.NIL;
                extension = cdolist_list_var_$7.first();
                while (http_kernel.NIL != cdolist_list_var_$7) {
                    if (http_kernel.NIL != string_utilities.ends_with(filename, extension, Symbols.symbol_function((SubLObject)http_kernel.EQUALP))) {
                        return content_type;
                    }
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    extension = cdolist_list_var_$7.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)http_kernel.$list94);
            }
            cdolist_list_var = cdolist_list_var.rest();
            file_extention_info = cdolist_list_var.first();
        }
        return http_kernel.$http_content_type_file_extension_table$.getGlobalValue().first().first();
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 20342L)
    public static SubLObject html_determine_mime_type(final SubLObject filename, SubLObject type) {
        if (type == http_kernel.UNPROVIDED) {
            type = (SubLObject)http_kernel.NIL;
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql((SubLObject)http_kernel.$kw95$PNG)) {
            return (SubLObject)http_kernel.$str96$image_png;
        }
        if (pcase_var.eql((SubLObject)http_kernel.$kw97$JPEG)) {
            return (SubLObject)http_kernel.$str98$image_jpeg;
        }
        if (pcase_var.eql((SubLObject)http_kernel.$kw99$GIF)) {
            return (SubLObject)http_kernel.$str100$image_gif;
        }
        if (pcase_var.eql((SubLObject)http_kernel.$sym101$QUOTE) || pcase_var.eql((SubLObject)http_kernel.NIL)) {
            return http_file_request_content_type(filename);
        }
        return html_determine_mime_type(filename, (SubLObject)http_kernel.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 20679L)
    public static SubLObject http_server_base_url(SubLObject start_http_server_if_noneP) {
        if (start_http_server_if_noneP == http_kernel.UNPROVIDED) {
            start_http_server_if_noneP = (SubLObject)http_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject port = (SubLObject)http_kernel.NIL;
        if (http_kernel.NIL == port) {
            SubLObject csome_list_var = tcp_server_utilities.all_tcp_servers();
            SubLObject tcp_server = (SubLObject)http_kernel.NIL;
            tcp_server = csome_list_var.first();
            while (http_kernel.NIL == port && http_kernel.NIL != csome_list_var) {
                if (http_kernel.$kw6$HTTP == tcp_server_utilities.tcp_server_type(tcp_server)) {
                    port = tcp_server_utilities.tcp_server_port(tcp_server);
                }
                csome_list_var = csome_list_var.rest();
                tcp_server = csome_list_var.first();
            }
        }
        if (http_kernel.NIL == port && http_kernel.NIL != start_http_server_if_noneP) {
            port = http_port();
            final SubLObject tcp_server2 = tcp_server_utilities.enable_tcp_server((SubLObject)http_kernel.$kw6$HTTP, port);
            if (http_kernel.NIL == Threads.valid_process_p(tcp_server_utilities.tcp_server_process(tcp_server2))) {
                port = (SubLObject)http_kernel.NIL;
            }
        }
        final SubLObject forwarding_machine = cb_uia_forwarding.get_forwarding_machine_name();
        final SubLObject forwarding_port = Numbers.add(cb_uia_forwarding.get_forwarding_base_port(), system_parameters.$http_port_offset$.getDynamicValue(thread));
        return Sequences.cconcatenate((SubLObject)http_kernel.$str103$http___, new SubLObject[] { format_nil.format_nil_a_no_copy(forwarding_machine), format_nil.format_nil_a_no_copy((SubLObject)((http_kernel.NIL != port) ? Sequences.cconcatenate((SubLObject)http_kernel.$str104$_, format_nil.format_nil_a_no_copy(forwarding_port)) : http_kernel.$str78$)), http_kernel.$str14$_ });
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 22052L)
    public static SubLObject http_server_cgi_base_url() {
        final SubLObject base_url = http_server_base_url((SubLObject)http_kernel.UNPROVIDED);
        if (http_kernel.NIL != base_url) {
            return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(base_url), new SubLObject[] { format_nil.format_nil_a_no_copy(string_utilities.substring(http_kernel.$http_cgi_bin_directory$.getGlobalValue(), (SubLObject)http_kernel.ONE_INTEGER, (SubLObject)http_kernel.UNPROVIDED)), http_kernel.$str14$_ });
        }
        return (SubLObject)http_kernel.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/http-kernel.lisp", position = 22375L)
    public static SubLObject get_absolute_url(final SubLObject url, SubLObject start_http_server_if_noneP) {
        if (start_http_server_if_noneP == http_kernel.UNPROVIDED) {
            start_http_server_if_noneP = (SubLObject)http_kernel.NIL;
        }
        final SubLObject base_url = http_server_base_url(start_http_server_if_noneP);
        return web_utilities.absolute_url_from_relative_url_and_base(url, base_url);
    }

    public static SubLObject declare_http_kernel_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_server_handler", "HTTP-SERVER-HANDLER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_server_top_level", "HTTP-SERVER-TOP-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_port", "HTTP-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_log_requests_to_file", "HTTP-LOG-REQUESTS-TO-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_parse_request", "HTTP-PARSE-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_determine_remote_hostname", "HTTP-DETERMINE-REMOTE-HOSTNAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "get_http_logging_sequence_generator", "GET-HTTP-LOGGING-SEQUENCE-GENERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "next_http_request_id", "NEXT-HTTP-REQUEST-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_handle_cgi_request", "HTTP-HANDLE-CGI-REQUEST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_cgi_request_cg_args", "HTTP-CGI-REQUEST-CG-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_get_content_type_for_cgi_request", "HTTP-GET-CONTENT-TYPE-FOR-CGI-REQUEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_cgi_request_headers", "HTTP-CGI-REQUEST-HEADERS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_handle_ws_request", "HTTP-HANDLE-WS-REQUEST", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "possibly_split_full_query_url", "POSSIBLY-SPLIT-FULL-QUERY-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_ws_header_conversion", "HTTP-WS-HEADER-CONVERSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_handle_file_request", "HTTP-HANDLE-FILE-REQUEST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "separate_args_from_file_request", "SEPARATE-ARGS-FROM-FILE-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "java_web_start_file_p", "JAVA-WEB-START-FILE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_file_request_filename", "HTTP-FILE-REQUEST-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_file_request_headers", "HTTP-FILE-REQUEST-HEADERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "clear_http_file_request_headers_int", "CLEAR-HTTP-FILE-REQUEST-HEADERS-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "remove_http_file_request_headers_int", "REMOVE-HTTP-FILE-REQUEST-HEADERS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_file_request_headers_int_internal", "HTTP-FILE-REQUEST-HEADERS-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_file_request_headers_int", "HTTP-FILE-REQUEST-HEADERS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_file_request_expires", "HTTP-FILE-REQUEST-EXPIRES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_file_request_content_type", "HTTP-FILE-REQUEST-CONTENT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "html_determine_mime_type", "HTML-DETERMINE-MIME-TYPE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_server_base_url", "HTTP-SERVER-BASE-URL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "http_server_cgi_base_url", "HTTP-SERVER-CGI-BASE-URL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.http_kernel", "get_absolute_url", "GET-ABSOLUTE-URL", 1, 1, false);
        return (SubLObject)http_kernel.NIL;
    }

    public static SubLObject init_http_kernel_file() {
        http_kernel.$http_cgi_bin_directory$ = SubLFiles.deflexical("*HTTP-CGI-BIN-DIRECTORY*", (SubLObject)http_kernel.$str0$_cgi_bin);
        http_kernel.$http_cg_url$ = SubLFiles.deflexical("*HTTP-CG-URL*", (SubLObject)http_kernel.$str1$_cg_);
        http_kernel.$http_cgi_bin_ws_directory$ = SubLFiles.deflexical("*HTTP-CGI-BIN-WS-DIRECTORY*", (SubLObject)http_kernel.$str2$_cgi_bin_ws_);
        http_kernel.$http_cyc_ws_directory$ = SubLFiles.deflexical("*HTTP-CYC-WS-DIRECTORY*", (SubLObject)http_kernel.$str3$_cyc_ws);
        http_kernel.$http_cyc_ws_machine$ = SubLFiles.deflexical("*HTTP-CYC-WS-MACHINE*", (SubLObject)((http_kernel.NIL != Symbols.boundp((SubLObject)http_kernel.$sym4$_HTTP_CYC_WS_MACHINE_)) ? http_kernel.$http_cyc_ws_machine$.getGlobalValue() : http_kernel.NIL));
        http_kernel.$http_cyc_ws_port$ = SubLFiles.deflexical("*HTTP-CYC-WS-PORT*", (SubLObject)((http_kernel.NIL != Symbols.boundp((SubLObject)http_kernel.$sym5$_HTTP_CYC_WS_PORT_)) ? http_kernel.$http_cyc_ws_port$.getGlobalValue() : http_kernel.NIL));
        http_kernel.$http_request_logging_stream$ = SubLFiles.deflexical("*HTTP-REQUEST-LOGGING-STREAM*", (SubLObject)http_kernel.NIL);
        http_kernel.$get_http_logging_sequence_generator$ = SubLFiles.defparameter("*GET-HTTP-LOGGING-SEQUENCE-GENERATOR*", (SubLObject)http_kernel.$kw30$UNINITIALIZED);
        http_kernel.$http_return_mime_type_prefix$ = SubLFiles.defconstant("*HTTP-RETURN-MIME-TYPE-PREFIX*", (SubLObject)http_kernel.$str33$return_mime_type_);
        http_kernel.$http_file_request_headers_int_caching_state$ = SubLFiles.deflexical("*HTTP-FILE-REQUEST-HEADERS-INT-CACHING-STATE*", (SubLObject)http_kernel.NIL);
        http_kernel.$allow_css_js_expires_headers$ = SubLFiles.defvar("*ALLOW-CSS-JS-EXPIRES-HEADERS*", (SubLObject)http_kernel.T);
        http_kernel.$http_content_type_file_extension_table$ = SubLFiles.deflexical("*HTTP-CONTENT-TYPE-FILE-EXTENSION-TABLE*", (SubLObject)http_kernel.$list93);
        return (SubLObject)http_kernel.NIL;
    }

    public static SubLObject setup_http_kernel_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)http_kernel.$sym4$_HTTP_CYC_WS_MACHINE_);
        subl_macro_promotions.declare_defglobal((SubLObject)http_kernel.$sym5$_HTTP_CYC_WS_PORT_);
        tcp_server_utilities.register_tcp_server_type((SubLObject)http_kernel.$kw6$HTTP, (SubLObject)http_kernel.$sym7$HTTP_SERVER_HANDLER, (SubLObject)http_kernel.$kw8$TEXT);
        access_macros.register_external_symbol((SubLObject)http_kernel.$sym21$HTTP_LOG_REQUESTS_TO_FILE);
        memoization_state.note_globally_cached_function((SubLObject)http_kernel.$sym82$HTTP_FILE_REQUEST_HEADERS_INT);
        access_macros.register_external_symbol((SubLObject)http_kernel.$sym102$HTTP_SERVER_BASE_URL);
        access_macros.register_external_symbol((SubLObject)http_kernel.$sym105$HTTP_SERVER_CGI_BASE_URL);
        generic_testing.define_test_case_table_int((SubLObject)http_kernel.$sym106$HTTP_CGI_REQUEST_CG_ARGS, (SubLObject)ConsesLow.list(new SubLObject[] { http_kernel.$kw107$TEST, http_kernel.EQUAL, http_kernel.$kw108$OWNER, http_kernel.NIL, http_kernel.$kw109$CLASSES, http_kernel.NIL, http_kernel.$kw110$KB, http_kernel.$kw111$TINY, http_kernel.$kw112$WORKING_, http_kernel.T }), (SubLObject)http_kernel.$list113);
        return (SubLObject)http_kernel.NIL;
    }

    @Override
	public void declareFunctions() {
        declare_http_kernel_file();
    }

    @Override
	public void initializeVariables() {
        init_http_kernel_file();
    }

    @Override
	public void runTopLevelForms() {
        setup_http_kernel_file();
    }

    static {
        me = (SubLFile)new http_kernel();
        http_kernel.$http_cgi_bin_directory$ = null;
        http_kernel.$http_cg_url$ = null;
        http_kernel.$http_cgi_bin_ws_directory$ = null;
        http_kernel.$http_cyc_ws_directory$ = null;
        http_kernel.$http_cyc_ws_machine$ = null;
        http_kernel.$http_cyc_ws_port$ = null;
        http_kernel.$http_request_logging_stream$ = null;
        http_kernel.$get_http_logging_sequence_generator$ = null;
        http_kernel.$http_return_mime_type_prefix$ = null;
        http_kernel.$http_file_request_headers_int_caching_state$ = null;
        http_kernel.$allow_css_js_expires_headers$ = null;
        http_kernel.$http_content_type_file_extension_table$ = null;
        $str0$_cgi_bin = SubLObjectFactory.makeString("/cgi-bin");
        $str1$_cg_ = SubLObjectFactory.makeString("/cg?");
        $str2$_cgi_bin_ws_ = SubLObjectFactory.makeString("/cgi-bin/ws/");
        $str3$_cyc_ws = SubLObjectFactory.makeString("/cyc-ws");
        $sym4$_HTTP_CYC_WS_MACHINE_ = SubLObjectFactory.makeSymbol("*HTTP-CYC-WS-MACHINE*");
        $sym5$_HTTP_CYC_WS_PORT_ = SubLObjectFactory.makeSymbol("*HTTP-CYC-WS-PORT*");
        $kw6$HTTP = SubLObjectFactory.makeKeyword("HTTP");
        $sym7$HTTP_SERVER_HANDLER = SubLObjectFactory.makeSymbol("HTTP-SERVER-HANDLER");
        $kw8$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str9$HTTP_Request__6__0D_received_at__ = SubLObjectFactory.makeString("HTTP Request ~6,'0D received at ~A~%");
        $str10$CYC = SubLObjectFactory.makeString("CYC");
        $sym11$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $str12$HTTP_Request__6__0D_content___S__ = SubLObjectFactory.makeString("HTTP Request ~6,'0D content: ~S~%");
        $kw13$FILE = SubLObjectFactory.makeKeyword("FILE");
        $str14$_ = SubLObjectFactory.makeString("/");
        $kw15$CGI = SubLObjectFactory.makeKeyword("CGI");
        $str16$_cgi_bin_cg_cb_start_redirect = SubLObjectFactory.makeString("/cgi-bin/cg?cb-start-redirect");
        $kw17$WS = SubLObjectFactory.makeKeyword("WS");
        $kw18$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym19$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str20$HTTP_Request__6__0D_returned_at__ = SubLObjectFactory.makeString("HTTP Request ~6,'0D returned at ~A (~Ams)~%");
        $sym21$HTTP_LOG_REQUESTS_TO_FILE = SubLObjectFactory.makeSymbol("HTTP-LOG-REQUESTS-TO-FILE");
        $str22$Unable_to_write_to__S__ = SubLObjectFactory.makeString("Unable to write to ~S~%");
        $kw23$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw24$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $kw25$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str26$GET = SubLObjectFactory.makeString("GET");
        $str27$Content_length = SubLObjectFactory.makeString("Content-length");
        $str28$Remote_Host = SubLObjectFactory.makeString("Remote-Host");
        $str29$unknown = SubLObjectFactory.makeString("unknown");
        $kw30$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str31$Unable_to_initialize__A__ = SubLObjectFactory.makeString("Unable to initialize ~A~%");
        $str32$_ = SubLObjectFactory.makeString("&");
        $str33$return_mime_type_ = SubLObjectFactory.makeString("return-mime-type:");
        $str34$_ = SubLObjectFactory.makeString("?");
        $str35$_ = SubLObjectFactory.makeString("|");
        $sym36$_ = SubLObjectFactory.makeSymbol("<");
        $str37$return_mime_type = SubLObjectFactory.makeString("return-mime-type");
        $str38$_ = SubLObjectFactory.makeString("=");
        $str39$text_html__charset_utf_8 = SubLObjectFactory.makeString("text/html; charset=utf-8");
        $str40$text_html = SubLObjectFactory.makeString("text/html");
        $str41$application_xml = SubLObjectFactory.makeString("application/xml");
        $str42$application_json = SubLObjectFactory.makeString("application/json");
        $str43$Unknown_return_type_for_handler__ = SubLObjectFactory.makeString("Unknown return-type for handler ~A.  Assuming 'text/html'");
        $list44 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Connection"), (SubLObject)SubLObjectFactory.makeString("close"));
        $str45$Content_Type = SubLObjectFactory.makeString("Content-Type");
        $str46$POST = SubLObjectFactory.makeString("POST");
        $kw47$POST = SubLObjectFactory.makeKeyword("POST");
        $kw48$GET = SubLObjectFactory.makeKeyword("GET");
        $kw49$KEEP_ALIVE_ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $kw50$WIDE_NEWLINES_ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $kw51$ACCEPT_TYPES = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $kw52$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw53$CONTENT_TYPE = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $int54$80 = SubLObjectFactory.makeInteger(80);
        $kw55$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw56$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw57$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw58$METHOD = SubLObjectFactory.makeKeyword("METHOD");
        $kw59$URL = SubLObjectFactory.makeKeyword("URL");
        $kw60$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw61$SOAP_ACTION_URI = SubLObjectFactory.makeKeyword("SOAP-ACTION-URI");
        $sym62$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list63 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("HEADER-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str64$Accept = SubLObjectFactory.makeString("Accept");
        $list65 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("User-Agent"), SubLObjectFactory.makeString("Host"), SubLObjectFactory.makeString("Content-Length"), SubLObjectFactory.makeString("Connection"), SubLObjectFactory.makeString("Keep-Alive"), SubLObjectFactory.makeString("Referer"), SubLObjectFactory.makeString("Accept-Charset"), SubLObjectFactory.makeString("Accept-Encoding"), SubLObjectFactory.makeString("Accept-Language"), SubLObjectFactory.makeString("Cache-Control"), SubLObjectFactory.makeString("Pragma") });
        $kw66$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str67$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw68$EOF = SubLObjectFactory.makeKeyword("EOF");
        $int69$35 = SubLObjectFactory.makeInteger(35);
        $int70$47 = SubLObjectFactory.makeInteger(47);
        $int71$49 = SubLObjectFactory.makeInteger(49);
        $int72$50 = SubLObjectFactory.makeInteger(50);
        $int73$51 = SubLObjectFactory.makeInteger(51);
        $int74$52 = SubLObjectFactory.makeInteger(52);
        $list75 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Connection"), (SubLObject)SubLObjectFactory.makeString("close")));
        $int76$404 = SubLObjectFactory.makeInteger(404);
        $str77$File_not_found = SubLObjectFactory.makeString("File not found");
        $str78$ = SubLObjectFactory.makeString("");
        $str79$user = SubLObjectFactory.makeString("user");
        $str80$project = SubLObjectFactory.makeString("project");
        $str81$_jnlp = SubLObjectFactory.makeString(".jnlp");
        $sym82$HTTP_FILE_REQUEST_HEADERS_INT = SubLObjectFactory.makeSymbol("HTTP-FILE-REQUEST-HEADERS-INT");
        $str83$Last_Modified = SubLObjectFactory.makeString("Last-Modified");
        $list84 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Accept-Ranges"), (SubLObject)SubLObjectFactory.makeString("bytes"));
        $str85$Content_Length = SubLObjectFactory.makeString("Content-Length");
        $str86$Expires = SubLObjectFactory.makeString("Expires");
        $sym87$_HTTP_FILE_REQUEST_HEADERS_INT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*HTTP-FILE-REQUEST-HEADERS-INT-CACHING-STATE*");
        $int88$200 = SubLObjectFactory.makeInteger(200);
        $str89$image_ = SubLObjectFactory.makeString("image/");
        $str90$text_ = SubLObjectFactory.makeString("text/");
        $str91$css = SubLObjectFactory.makeString("css");
        $str92$javascript = SubLObjectFactory.makeString("javascript");
        $list93 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/html"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("html"), (SubLObject)SubLObjectFactory.makeString("htm"), (SubLObject)SubLObjectFactory.makeString("shtml"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/plain"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("txt"), (SubLObject)SubLObjectFactory.makeString("text"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("image/gif"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("gif"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("image/jpeg"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("jpeg"), (SubLObject)SubLObjectFactory.makeString("jpg"), (SubLObject)SubLObjectFactory.makeString("jpe"), (SubLObject)SubLObjectFactory.makeString("jfif"), (SubLObject)SubLObjectFactory.makeString("pjpeg"), (SubLObject)SubLObjectFactory.makeString("pjp"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("image/png"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("png"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application/x-java-jnlp-file"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("jnlp"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/css"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("css"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/javascript"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("js"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application/json"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("json"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/xml"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xml"), (SubLObject)SubLObjectFactory.makeString("xsl"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("audio/ogg"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ogg"))) });
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("EXTENSIONS"));
        $kw95$PNG = SubLObjectFactory.makeKeyword("PNG");
        $str96$image_png = SubLObjectFactory.makeString("image/png");
        $kw97$JPEG = SubLObjectFactory.makeKeyword("JPEG");
        $str98$image_jpeg = SubLObjectFactory.makeString("image/jpeg");
        $kw99$GIF = SubLObjectFactory.makeKeyword("GIF");
        $str100$image_gif = SubLObjectFactory.makeString("image/gif");
        $sym101$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym102$HTTP_SERVER_BASE_URL = SubLObjectFactory.makeSymbol("HTTP-SERVER-BASE-URL");
        $str103$http___ = SubLObjectFactory.makeString("http://");
        $str104$_ = SubLObjectFactory.makeString(":");
        $sym105$HTTP_SERVER_CGI_BASE_URL = SubLObjectFactory.makeSymbol("HTTP-SERVER-CGI-BASE-URL");
        $sym106$HTTP_CGI_REQUEST_CG_ARGS = SubLObjectFactory.makeSymbol("HTTP-CGI-REQUEST-CG-ARGS");
        $kw107$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw108$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw109$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw110$KB = SubLObjectFactory.makeKeyword("KB");
        $kw111$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw112$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/cgi-bin/ws/xml-term-learner-create-new?termString0=hissentient&url=http%3A%2F%2Flocalhost%3A3742%2Fcgi-bin%2Fcg%3Fcb-content-frame%26c3096&title=GAF index for #$CityOfChristchurchNZ&argpos=(1)")), (SubLObject)SubLObjectFactory.makeString("xml-term-learner-create-new&termString0=hissentient&url=http%3A%2F%2Flocalhost%3A3742%2Fcgi-bin%2Fcg%3Fcb-content-frame%26c3096&title=GAF index for #$CityOfChristchurchNZ&argpos=(1)")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/cgi-bin/ws/xml-term-learner-get-followups-for-term&max=1&questionsOnly=true&conceptId=Mx4rvVixTpwpEbGdrcN5Y29ycA")), (SubLObject)SubLObjectFactory.makeString("xml-term-learner-get-followups-for-term&max=1&questionsOnly=true&conceptId=Mx4rvVixTpwpEbGdrcN5Y29ycA")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/cgi-bin/cg?cb-content-frame&c3096")), (SubLObject)SubLObjectFactory.makeString("cb-content-frame&c3096")));
    }
}

/*

	Total time: 389 ms

*/