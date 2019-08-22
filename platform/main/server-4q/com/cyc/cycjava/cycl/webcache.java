package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class webcache extends SubLTranslatedFile {
    public static final SubLFile me = new webcache();

    public static final String myName = "com.cyc.cycjava.cycl.webcache";

    public static final String myFingerPrint = "f2bd69198a8c602dd139ff9b4c1a233785a3f0e7d56f439dea5bfd264ab62b83";

    // deflexical
    private static final SubLSymbol $webcache_url_fht_file$ = makeSymbol("*WEBCACHE-URL-FHT-FILE*");

    // defparameter
    /**
     * A prefix that is used in creating the URL for the dynamic webpage that allows
     * the user to access the URL of the actual webpage and the URL of the cached
     * webpage
     */
    private static final SubLSymbol $dynamic_webpage_url_prefix$ = makeSymbol("*DYNAMIC-WEBPAGE-URL-PREFIX*");

    // defparameter
    /**
     * A prefix used to specify the Cyc web-server and port to be used to access the
     * cached webpage.
     */
    private static final SubLSymbol $cached_webpage_url_prefix$ = makeSymbol("*CACHED-WEBPAGE-URL-PREFIX*");

    // Internal Constants
    public static final SubLString $str0$data_webpage_downloader_webcache_ = makeString("data/webpage-downloader/webcache-urls.fht");

    public static final SubLString $str1$_cyc_top_data_webpage_downloader_ = makeString("/cyc/top/data/webpage-downloader/tkb-fet-sources3.log");



    private static final SubLInteger $int$2300 = makeInteger(2300);

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    public static final SubLString $str5$Creating_file_hash_table___ = makeString("Creating file-hash-table...");



    public static final SubLString $str7$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLString $$$Webpage_not_found = makeString("Webpage not found");

    public static final SubLString $str9$file____cyc_top_ = makeString("file:///cyc/top/");

    public static final SubLString $str10$_A_____A__ = makeString("~A -> ~A~%");

    public static final SubLString $str11$http___localhost_8080_CycCachedFi = makeString("http://localhost:8080/CycCachedFileServer/");

    public static final SubLString $str12$ = makeString("");

    public static final SubLSymbol WEBCACHE_URL = makeSymbol("WEBCACHE-URL");

    public static final SubLString $$$localhost = makeString("localhost");

    public static final SubLString $str15$http___doc_cyc_com_ = makeString("http://doc.cyc.com/");

    public static final SubLList $list16 = list(CHAR_slash);

    public static final SubLString $str17$http___tomcat_ = makeString("http://tomcat/");

    public static final SubLString $str18$http___cyc_webcache_factiva = makeString("http://cyc/webcache/factiva");

    public static final SubLString $str19$http___cyc_ = makeString("http://cyc/");

    public static final SubLString $str20$fileCache_jsp_file_ = makeString("fileCache.jsp?file=");

    public static final SubLSymbol FILE_HASH_TABLE_P = makeSymbol("FILE-HASH-TABLE-P");



    public static final SubLString $str23$downloaded_webpages_file_not_foun = makeString("downloaded-webpages/file-not-found.html");

    public static final SubLString $str24$data_webpage_downloader = makeString("data/webpage-downloader");

    public static final SubLString $str25$_url_ = makeString("&url=");

    public static final SubLString $str26$_date_ = makeString("&date=");

    public static SubLObject initialize_webcache_url_fht(SubLObject verboseP, SubLObject f_in) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (f_in == UNPROVIDED) {
            f_in = $str1$_cyc_top_data_webpage_downloader_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp($webcache_url_fht_file$.getGlobalValue()) : "Types.stringp(webcache.$webcache_url_fht_file$.getGlobalValue()) " + "CommonSymbols.NIL != Types.stringp(webcache.$webcache_url_fht_file$.getGlobalValue()) " + $webcache_url_fht_file$.getGlobalValue();
        final SubLObject fht = file_hash_table.create_file_hash_table($webcache_url_fht_file$.getGlobalValue(), $int$2300, file_hash_table.$htfile_default_average_size$.getGlobalValue(), symbol_function(EQUAL), $IMAGE_INDEPENDENT_CFASL);
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str5$Creating_file_hash_table___);
                final SubLObject file_var = f_in;
                SubLObject stream = NIL;
                try {
                    final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream = compatibility.open_text(file_var, $INPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$1, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error($str7$Unable_to_open__S, file_var);
                    }
                    final SubLObject stream_var = stream;
                    if (stream_var.isStream()) {
                        final SubLObject length_var = file_length(stream_var);
                        final SubLObject stream_var_$2 = stream_var;
                        SubLObject line_number_var = NIL;
                        SubLObject line = NIL;
                        line_number_var = ZERO_INTEGER;
                        for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$2); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$2)) {
                            final SubLObject line_list = read_from_string(line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject url = line_list.first();
                            final SubLObject pathname = second(line_list);
                            final SubLObject error_msg = third(line_list);
                            if ((NIL != pathname) && (NIL == string_utilities.substringP($$$Webpage_not_found, error_msg, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                final SubLObject relative_pathname = string_utilities.pre_remove(pathname, $str9$file____cyc_top_, UNPROVIDED);
                                if (NIL != verboseP) {
                                    format(T, $str10$_A_____A__, url, relative_pathname);
                                }
                                file_hash_table.put_file_hash_table(url, fht, relative_pathname);
                            }
                            note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
                            line_number_var = number_utilities.f_1X(line_number_var);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return fht;
    }

    public static SubLObject webcache_url(final SubLObject url, SubLObject webcache_url_fht_file) {
        if (webcache_url_fht_file == UNPROVIDED) {
            webcache_url_fht_file = $webcache_url_fht_file$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(url) : "Types.stringp(url) " + "CommonSymbols.NIL != Types.stringp(url) " + url;
        assert NIL != stringp(webcache_url_fht_file) : "Types.stringp(webcache_url_fht_file) " + "CommonSymbols.NIL != Types.stringp(webcache_url_fht_file) " + webcache_url_fht_file;
        if ((NIL != string_utilities.substringP(http_kernel.http_server_base_url(UNPROVIDED), url, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != string_utilities.substringP(string_utilities.replace_substring(http_kernel.http_server_base_url(UNPROVIDED), cb_uia_forwarding.get_forwarding_machine_name(), $$$localhost), url, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return url;
        }
        final SubLObject cached_webpage_url_prefix = (NIL != $cached_webpage_url_prefix$.getDynamicValue(thread)) ? $cached_webpage_url_prefix$.getDynamicValue(thread) : $str12$;
        if (NIL != string_utilities.substringP($str15$http___doc_cyc_com_, url, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject filename = last(string_utilities.split_string(url, $list16), UNPROVIDED).first();
            return string_utilities.replace_substring(string_utilities.replace_substring(url, $str15$http___doc_cyc_com_, cached_webpage_url_prefix), filename, web_utilities.html_url_encode(filename, UNPROVIDED));
        }
        if (NIL != string_utilities.substringP($str17$http___tomcat_, url, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject filename = last(string_utilities.split_string(url, $list16), UNPROVIDED).first();
            return string_utilities.replace_substring(string_utilities.replace_substring(url, $str17$http___tomcat_, cached_webpage_url_prefix), filename, web_utilities.html_url_encode(filename, UNPROVIDED));
        }
        if (NIL != string_utilities.substringP($str18$http___cyc_webcache_factiva, url, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject local_url = web_utilities.html_url_encode(string_utilities.replace_substring(url, $str19$http___cyc_, cached_webpage_url_prefix), UNPROVIDED);
            return cconcatenate(format_nil.format_nil_a_no_copy($dynamic_webpage_url_prefix$.getDynamicValue(thread)), new SubLObject[]{ $str20$fileCache_jsp_file_, format_nil.format_nil_a_no_copy(local_url) });
        }
        final SubLObject fht = file_hash_table.open_file_hash_table_read_only(webcache_url_fht_file, symbol_function(EQUAL), $IMAGE_INDEPENDENT_CFASL);
        SubLObject local_url2 = NIL;
        SubLObject local_file_date = NIL;
        SubLObject error_msg = NIL;
        assert NIL != file_hash_table.file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    local_url2 = Filesys.probe_file(file_hash_table.get_file_hash_table(url, fht, UNPROVIDED));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if ((NIL != error_msg) || (NIL == local_url2)) {
            local_url2 = cconcatenate(format_nil.format_nil_a_no_copy(cached_webpage_url_prefix), $str23$downloaded_webpages_file_not_foun);
        } else {
            local_file_date = web_utilities.html_url_encode(numeric_date_utilities.timestring(Filesys.file_write_date(local_url2)), UNPROVIDED);
            local_url2 = web_utilities.html_url_encode(cconcatenate(format_nil.format_nil_a_no_copy(cached_webpage_url_prefix), format_nil.format_nil_a_no_copy(string_utilities.pre_remove(string_utilities.to_string(local_url2), string_utilities.to_string(Filesys.probe_file($str24$data_webpage_downloader)), UNPROVIDED))), UNPROVIDED);
        }
        if (NIL != local_file_date) {
            return cconcatenate(format_nil.format_nil_a_no_copy($dynamic_webpage_url_prefix$.getDynamicValue(thread)), new SubLObject[]{ $str20$fileCache_jsp_file_, format_nil.format_nil_a_no_copy(local_url2), $str25$_url_, format_nil.format_nil_a_no_copy(url), $str26$_date_, format_nil.format_nil_a_no_copy(local_file_date) });
        }
        return cconcatenate(format_nil.format_nil_a_no_copy($dynamic_webpage_url_prefix$.getDynamicValue(thread)), new SubLObject[]{ $str20$fileCache_jsp_file_, format_nil.format_nil_a_no_copy(local_url2), $str25$_url_, format_nil.format_nil_a_no_copy(url) });
    }

    public static SubLObject declare_webcache_file() {
        declareFunction(me, "initialize_webcache_url_fht", "INITIALIZE-WEBCACHE-URL-FHT", 0, 2, false);
        declareFunction(me, "webcache_url", "WEBCACHE-URL", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_webcache_file() {
        deflexical("*WEBCACHE-URL-FHT-FILE*", $str0$data_webpage_downloader_webcache_);
        defparameter("*DYNAMIC-WEBPAGE-URL-PREFIX*", $str11$http___localhost_8080_CycCachedFi);
        defparameter("*CACHED-WEBPAGE-URL-PREFIX*", $str12$);
        return NIL;
    }

    public static SubLObject setup_webcache_file() {
        register_external_symbol(WEBCACHE_URL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_webcache_file();
    }

    @Override
    public void initializeVariables() {
        init_webcache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_webcache_file();
    }

    
}

/**
 * Total time: 157 ms
 */
