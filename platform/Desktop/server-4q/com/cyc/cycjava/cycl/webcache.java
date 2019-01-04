package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class webcache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.webcache";
    public static final String myFingerPrint = "f2bd69198a8c602dd139ff9b4c1a233785a3f0e7d56f439dea5bfd264ab62b83";
    @SubLTranslatedFile.SubL(source = "cycl/webcache.lisp", position = 1089L)
    private static SubLSymbol $webcache_url_fht_file$;
    @SubLTranslatedFile.SubL(source = "cycl/webcache.lisp", position = 2647L)
    private static SubLSymbol $dynamic_webpage_url_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/webcache.lisp", position = 2984L)
    private static SubLSymbol $cached_webpage_url_prefix$;
    private static final SubLString $str0$data_webpage_downloader_webcache_;
    private static final SubLString $str1$_cyc_top_data_webpage_downloader_;
    private static final SubLSymbol $sym2$STRINGP;
    private static final SubLInteger $int3$2300;
    private static final SubLSymbol $kw4$IMAGE_INDEPENDENT_CFASL;
    private static final SubLString $str5$Creating_file_hash_table___;
    private static final SubLSymbol $kw6$INPUT;
    private static final SubLString $str7$Unable_to_open__S;
    private static final SubLString $str8$Webpage_not_found;
    private static final SubLString $str9$file____cyc_top_;
    private static final SubLString $str10$_A_____A__;
    private static final SubLString $str11$http___localhost_8080_CycCachedFi;
    private static final SubLString $str12$;
    private static final SubLSymbol $sym13$WEBCACHE_URL;
    private static final SubLString $str14$localhost;
    private static final SubLString $str15$http___doc_cyc_com_;
    private static final SubLList $list16;
    private static final SubLString $str17$http___tomcat_;
    private static final SubLString $str18$http___cyc_webcache_factiva;
    private static final SubLString $str19$http___cyc_;
    private static final SubLString $str20$fileCache_jsp_file_;
    private static final SubLSymbol $sym21$FILE_HASH_TABLE_P;
    private static final SubLSymbol $sym22$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str23$downloaded_webpages_file_not_foun;
    private static final SubLString $str24$data_webpage_downloader;
    private static final SubLString $str25$_url_;
    private static final SubLString $str26$_date_;
    
    @SubLTranslatedFile.SubL(source = "cycl/webcache.lisp", position = 1463L)
    public static SubLObject initialize_webcache_url_fht(SubLObject verboseP, SubLObject f_in) {
        if (verboseP == webcache.UNPROVIDED) {
            verboseP = (SubLObject)webcache.T;
        }
        if (f_in == webcache.UNPROVIDED) {
            f_in = (SubLObject)webcache.$str1$_cyc_top_data_webpage_downloader_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert webcache.NIL != Types.stringp(webcache.$webcache_url_fht_file$.getGlobalValue()) : webcache.$webcache_url_fht_file$.getGlobalValue();
        final SubLObject fht = file_hash_table.create_file_hash_table(webcache.$webcache_url_fht_file$.getGlobalValue(), (SubLObject)webcache.$int3$2300, file_hash_table.$htfile_default_average_size$.getGlobalValue(), Symbols.symbol_function((SubLObject)webcache.EQUAL), (SubLObject)webcache.$kw4$IMAGE_INDEPENDENT_CFASL);
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)webcache.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)webcache.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)webcache.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)webcache.$str5$Creating_file_hash_table___);
                final SubLObject file_var = f_in;
                SubLObject stream = (SubLObject)webcache.NIL;
                try {
                    final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)webcache.NIL, thread);
                        stream = compatibility.open_text(file_var, (SubLObject)webcache.$kw6$INPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$1, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)webcache.$str7$Unable_to_open__S, file_var);
                    }
                    final SubLObject stream_var = stream;
                    if (stream_var.isStream()) {
                        final SubLObject length_var = streams_high.file_length(stream_var);
                        final SubLObject stream_var_$2 = stream_var;
                        SubLObject line_number_var = (SubLObject)webcache.NIL;
                        SubLObject line = (SubLObject)webcache.NIL;
                        line_number_var = (SubLObject)webcache.ZERO_INTEGER;
                        for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$2); webcache.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$2)) {
                            final SubLObject line_list = reader.read_from_string(line, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED);
                            final SubLObject url = line_list.first();
                            final SubLObject pathname = conses_high.second(line_list);
                            final SubLObject error_msg = conses_high.third(line_list);
                            if (webcache.NIL != pathname && webcache.NIL == string_utilities.substringP((SubLObject)webcache.$str8$Webpage_not_found, error_msg, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED)) {
                                final SubLObject relative_pathname = string_utilities.pre_remove(pathname, (SubLObject)webcache.$str9$file____cyc_top_, (SubLObject)webcache.UNPROVIDED);
                                if (webcache.NIL != verboseP) {
                                    PrintLow.format((SubLObject)webcache.T, (SubLObject)webcache.$str10$_A_____A__, url, relative_pathname);
                                }
                                file_hash_table.put_file_hash_table(url, fht, relative_pathname);
                            }
                            utilities_macros.note_percent_progress(streams_high.file_position(stream_var, (SubLObject)webcache.UNPROVIDED), length_var);
                            line_number_var = number_utilities.f_1X(line_number_var);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)webcache.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)webcache.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)webcache.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/webcache.lisp", position = 3140L)
    public static SubLObject webcache_url(final SubLObject url, SubLObject webcache_url_fht_file) {
        if (webcache_url_fht_file == webcache.UNPROVIDED) {
            webcache_url_fht_file = webcache.$webcache_url_fht_file$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert webcache.NIL != Types.stringp(url) : url;
        assert webcache.NIL != Types.stringp(webcache_url_fht_file) : webcache_url_fht_file;
        if (webcache.NIL != string_utilities.substringP(http_kernel.http_server_base_url((SubLObject)webcache.UNPROVIDED), url, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED) || webcache.NIL != string_utilities.substringP(string_utilities.replace_substring(http_kernel.http_server_base_url((SubLObject)webcache.UNPROVIDED), cb_uia_forwarding.get_forwarding_machine_name(), (SubLObject)webcache.$str14$localhost), url, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED)) {
            return url;
        }
        final SubLObject cached_webpage_url_prefix = (SubLObject)((webcache.NIL != webcache.$cached_webpage_url_prefix$.getDynamicValue(thread)) ? webcache.$cached_webpage_url_prefix$.getDynamicValue(thread) : webcache.$str12$);
        if (webcache.NIL != string_utilities.substringP((SubLObject)webcache.$str15$http___doc_cyc_com_, url, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED)) {
            final SubLObject filename = conses_high.last(string_utilities.split_string(url, (SubLObject)webcache.$list16), (SubLObject)webcache.UNPROVIDED).first();
            return string_utilities.replace_substring(string_utilities.replace_substring(url, (SubLObject)webcache.$str15$http___doc_cyc_com_, cached_webpage_url_prefix), filename, web_utilities.html_url_encode(filename, (SubLObject)webcache.UNPROVIDED));
        }
        if (webcache.NIL != string_utilities.substringP((SubLObject)webcache.$str17$http___tomcat_, url, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED)) {
            final SubLObject filename = conses_high.last(string_utilities.split_string(url, (SubLObject)webcache.$list16), (SubLObject)webcache.UNPROVIDED).first();
            return string_utilities.replace_substring(string_utilities.replace_substring(url, (SubLObject)webcache.$str17$http___tomcat_, cached_webpage_url_prefix), filename, web_utilities.html_url_encode(filename, (SubLObject)webcache.UNPROVIDED));
        }
        if (webcache.NIL != string_utilities.substringP((SubLObject)webcache.$str18$http___cyc_webcache_factiva, url, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED, (SubLObject)webcache.UNPROVIDED)) {
            final SubLObject local_url = web_utilities.html_url_encode(string_utilities.replace_substring(url, (SubLObject)webcache.$str19$http___cyc_, cached_webpage_url_prefix), (SubLObject)webcache.UNPROVIDED);
            return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(webcache.$dynamic_webpage_url_prefix$.getDynamicValue(thread)), new SubLObject[] { webcache.$str20$fileCache_jsp_file_, format_nil.format_nil_a_no_copy(local_url) });
        }
        final SubLObject fht = file_hash_table.open_file_hash_table_read_only(webcache_url_fht_file, Symbols.symbol_function((SubLObject)webcache.EQUAL), (SubLObject)webcache.$kw4$IMAGE_INDEPENDENT_CFASL);
        SubLObject local_url2 = (SubLObject)webcache.NIL;
        SubLObject local_file_date = (SubLObject)webcache.NIL;
        SubLObject error_msg = (SubLObject)webcache.NIL;
        assert webcache.NIL != file_hash_table.file_hash_table_p(fht) : fht;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)webcache.$sym22$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    local_url2 = Filesys.probe_file(file_hash_table.get_file_hash_table(url, fht, (SubLObject)webcache.UNPROVIDED));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)webcache.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (webcache.NIL != error_msg || webcache.NIL == local_url2) {
            local_url2 = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(cached_webpage_url_prefix), (SubLObject)webcache.$str23$downloaded_webpages_file_not_foun);
        }
        else {
            local_file_date = web_utilities.html_url_encode(numeric_date_utilities.timestring(Filesys.file_write_date(local_url2)), (SubLObject)webcache.UNPROVIDED);
            local_url2 = web_utilities.html_url_encode(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(cached_webpage_url_prefix), format_nil.format_nil_a_no_copy(string_utilities.pre_remove(string_utilities.to_string(local_url2), string_utilities.to_string(Filesys.probe_file((SubLObject)webcache.$str24$data_webpage_downloader)), (SubLObject)webcache.UNPROVIDED))), (SubLObject)webcache.UNPROVIDED);
        }
        if (webcache.NIL != local_file_date) {
            return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(webcache.$dynamic_webpage_url_prefix$.getDynamicValue(thread)), new SubLObject[] { webcache.$str20$fileCache_jsp_file_, format_nil.format_nil_a_no_copy(local_url2), webcache.$str25$_url_, format_nil.format_nil_a_no_copy(url), webcache.$str26$_date_, format_nil.format_nil_a_no_copy(local_file_date) });
        }
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(webcache.$dynamic_webpage_url_prefix$.getDynamicValue(thread)), new SubLObject[] { webcache.$str20$fileCache_jsp_file_, format_nil.format_nil_a_no_copy(local_url2), webcache.$str25$_url_, format_nil.format_nil_a_no_copy(url) });
    }
    
    public static SubLObject declare_webcache_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.webcache", "initialize_webcache_url_fht", "INITIALIZE-WEBCACHE-URL-FHT", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.webcache", "webcache_url", "WEBCACHE-URL", 1, 1, false);
        return (SubLObject)webcache.NIL;
    }
    
    public static SubLObject init_webcache_file() {
        webcache.$webcache_url_fht_file$ = SubLFiles.deflexical("*WEBCACHE-URL-FHT-FILE*", (SubLObject)webcache.$str0$data_webpage_downloader_webcache_);
        webcache.$dynamic_webpage_url_prefix$ = SubLFiles.defparameter("*DYNAMIC-WEBPAGE-URL-PREFIX*", (SubLObject)webcache.$str11$http___localhost_8080_CycCachedFi);
        webcache.$cached_webpage_url_prefix$ = SubLFiles.defparameter("*CACHED-WEBPAGE-URL-PREFIX*", (SubLObject)webcache.$str12$);
        return (SubLObject)webcache.NIL;
    }
    
    public static SubLObject setup_webcache_file() {
        access_macros.register_external_symbol((SubLObject)webcache.$sym13$WEBCACHE_URL);
        return (SubLObject)webcache.NIL;
    }
    
    public void declareFunctions() {
        declare_webcache_file();
    }
    
    public void initializeVariables() {
        init_webcache_file();
    }
    
    public void runTopLevelForms() {
        setup_webcache_file();
    }
    
    static {
        me = (SubLFile)new webcache();
        webcache.$webcache_url_fht_file$ = null;
        webcache.$dynamic_webpage_url_prefix$ = null;
        webcache.$cached_webpage_url_prefix$ = null;
        $str0$data_webpage_downloader_webcache_ = SubLObjectFactory.makeString("data/webpage-downloader/webcache-urls.fht");
        $str1$_cyc_top_data_webpage_downloader_ = SubLObjectFactory.makeString("/cyc/top/data/webpage-downloader/tkb-fet-sources3.log");
        $sym2$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $int3$2300 = SubLObjectFactory.makeInteger(2300);
        $kw4$IMAGE_INDEPENDENT_CFASL = SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $str5$Creating_file_hash_table___ = SubLObjectFactory.makeString("Creating file-hash-table...");
        $kw6$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str7$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str8$Webpage_not_found = SubLObjectFactory.makeString("Webpage not found");
        $str9$file____cyc_top_ = SubLObjectFactory.makeString("file:///cyc/top/");
        $str10$_A_____A__ = SubLObjectFactory.makeString("~A -> ~A~%");
        $str11$http___localhost_8080_CycCachedFi = SubLObjectFactory.makeString("http://localhost:8080/CycCachedFileServer/");
        $str12$ = SubLObjectFactory.makeString("");
        $sym13$WEBCACHE_URL = SubLObjectFactory.makeSymbol("WEBCACHE-URL");
        $str14$localhost = SubLObjectFactory.makeString("localhost");
        $str15$http___doc_cyc_com_ = SubLObjectFactory.makeString("http://doc.cyc.com/");
        $list16 = ConsesLow.list((SubLObject)Characters.CHAR_slash);
        $str17$http___tomcat_ = SubLObjectFactory.makeString("http://tomcat/");
        $str18$http___cyc_webcache_factiva = SubLObjectFactory.makeString("http://cyc/webcache/factiva");
        $str19$http___cyc_ = SubLObjectFactory.makeString("http://cyc/");
        $str20$fileCache_jsp_file_ = SubLObjectFactory.makeString("fileCache.jsp?file=");
        $sym21$FILE_HASH_TABLE_P = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-P");
        $sym22$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str23$downloaded_webpages_file_not_foun = SubLObjectFactory.makeString("downloaded-webpages/file-not-found.html");
        $str24$data_webpage_downloader = SubLObjectFactory.makeString("data/webpage-downloader");
        $str25$_url_ = SubLObjectFactory.makeString("&url=");
        $str26$_date_ = SubLObjectFactory.makeString("&date=");
    }
}

/*

	Total time: 157 ms
	
*/