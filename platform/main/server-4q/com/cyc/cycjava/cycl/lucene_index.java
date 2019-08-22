package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class lucene_index extends SubLTranslatedFile {
    public static final SubLFile me = new lucene_index();

    public static final String myName = "com.cyc.cycjava.cycl.lucene_index";

    public static final String myFingerPrint = "2c3c5679ace69848f5fa0d3a6910c515611afe769a177f9ceeb244e1c33d58be";

























    // defconstant
    // The string constant Added
    public static final SubLSymbol $ql_index_sc_added$ = makeSymbol("*QL-INDEX-SC-ADDED*");

    // defconstant
    // The string constant NotAdded
    public static final SubLSymbol $ql_index_sc_not_added$ = makeSymbol("*QL-INDEX-SC-NOT-ADDED*");

    // defconstant
    // The string constant Built
    public static final SubLSymbol $ql_index_sc_built$ = makeSymbol("*QL-INDEX-SC-BUILT*");

    // defconstant
    // The string constant NotBuilt
    public static final SubLSymbol $ql_index_sc_not_built$ = makeSymbol("*QL-INDEX-SC-NOT-BUILT*");

    // defconstant
    // The string constant query
    public static final SubLSymbol $ql_index_sc_query$ = makeSymbol("*QL-INDEX-SC-QUERY*");

    // defconstant
    // The string constant query
    public static final SubLSymbol $ql_index_sc_form$ = makeSymbol("*QL-INDEX-SC-FORM*");

    // defconstant
    // The string constant cycl
    public static final SubLSymbol $ql_index_sc_cycl$ = makeSymbol("*QL-INDEX-SC-CYCL*");

    // defconstant
    // The string constant kb
    public static final SubLSymbol $ql_index_sc_kb$ = makeSymbol("*QL-INDEX-SC-KB*");

    // defconstant
    // The string constant process
    public static final SubLSymbol $ql_index_sc_process$ = makeSymbol("*QL-INDEX-SC-PROCESS*");

    // defconstant
    // The string constant host
    public static final SubLSymbol $ql_index_sc_host$ = makeSymbol("*QL-INDEX-SC-HOST*");

    // defconstant
    // The string constant user
    public static final SubLSymbol $ql_index_sc_user$ = makeSymbol("*QL-INDEX-SC-USER*");

    // defconstant
    // The string constant time
    public static final SubLSymbol $ql_index_sc_time$ = makeSymbol("*QL-INDEX-SC-TIME*");

    // defconstant
    // The string constant type
    public static final SubLSymbol $ql_index_sc_type$ = makeSymbol("*QL-INDEX-SC-TYPE*");

    // defconstant
    // The string constant id
    public static final SubLSymbol $ql_index_sc_id$ = makeSymbol("*QL-INDEX-SC-ID*");

    // defconstant
    // The string constant gloss
    public static final SubLSymbol $ql_index_sc_gloss$ = makeSymbol("*QL-INDEX-SC-GLOSS*");

    // defconstant
    // The string constant generation
    public static final SubLSymbol $ql_index_sc_generation$ = makeSymbol("*QL-INDEX-SC-GENERATION*");

    // defconstant
    // The string constant build
    public static final SubLSymbol $ql_index_sc_build$ = makeSymbol("*QL-INDEX-SC-BUILD*");

    // defconstant
    // The string constant add
    public static final SubLSymbol $ql_index_sc_add$ = makeSymbol("*QL-INDEX-SC-ADD*");

    // defconstant
    // The string constant add-n
    public static final SubLSymbol $ql_index_sc_add_n$ = makeSymbol("*QL-INDEX-SC-ADD-N*");

    // defconstant
    // The string constant find
    public static final SubLSymbol $ql_index_sc_find$ = makeSymbol("*QL-INDEX-SC-FIND*");

    // defconstant
    // The string constant $quit$
    public static final SubLSymbol $ql_index_sc_quit$ = makeSymbol("*QL-INDEX-SC-QUIT*");

    // defconstant
    // The string constant search_string
    public static final SubLSymbol $ql_index_sc_search_string$ = makeSymbol("*QL-INDEX-SC-SEARCH-STRING*");

    // defconstant
    // The string constant query_index_forms
    public static final SubLSymbol $ql_index_sc_query_index_forms$ = makeSymbol("*QL-INDEX-SC-QUERY-INDEX-FORMS*");

    // defparameter
    /**
     * The query recursively builds up the sub pieces here and concatenates them up
     * in the end.
     */
    private static final SubLSymbol $lucene_query_string_stack$ = makeSymbol("*LUCENE-QUERY-STRING-STACK*");

    // defparameter
    /**
     * By default, take date expressions and translate them into date range queries.
     */
    public static final SubLSymbol $lucene_symbolic_query_translate_dates$ = makeSymbol("*LUCENE-SYMBOLIC-QUERY-TRANSLATE-DATES*");

    // Internal Constants
    public static final SubLString $$$query = makeString("query");

    public static final SubLString $$$type = makeString("type");

    public static final SubLList $list2 = list(makeString("application.cyc-ir.lucene.ws.host"));

    public static final SubLSymbol $ws_index_host$ = makeSymbol("*WS-INDEX-HOST*");

    public static final SubLString $str4$webstore_cyc_com = makeString("webstore.cyc.com");



    public static final SubLList $list6 = list(makeString("application.cyc-ir.lucene.ws.port"));

    public static final SubLSymbol $ws_index_port$ = makeSymbol("*WS-INDEX-PORT*");

    private static final SubLInteger $int$7777 = makeInteger(7777);

    public static final SubLList $list9 = list(list(makeSymbol("HOST"), makeSymbol("&OPTIONAL"), list(makeSymbol("PORT"), makeSymbol("*WS-INDEX-PORT*"))), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list11 = list(makeString("application.cyc-ir.lucene.url.host"));

    public static final SubLSymbol $url_index_host$ = makeSymbol("*URL-INDEX-HOST*");

    public static final SubLString $str13$urlindex_cyc_com = makeString("urlindex.cyc.com");

    public static final SubLList $list14 = list(makeString("application.cyc-ir.lucene.url.port"));

    public static final SubLSymbol $url_index_port$ = makeSymbol("*URL-INDEX-PORT*");

    private static final SubLInteger $int$7778 = makeInteger(7778);

    public static final SubLList $list17 = list(makeString("application.cyc-ir.lucene.ebmt.host"));

    public static final SubLSymbol $ebmt_index_host$ = makeSymbol("*EBMT-INDEX-HOST*");

    public static final SubLString $str19$ebmtindex_cyc_com = makeString("ebmtindex.cyc.com");

    public static final SubLList $list20 = list(makeString("application.cyc-ir.lucene.ebmt.port"));

    public static final SubLSymbol $ebmt_index_port$ = makeSymbol("*EBMT-INDEX-PORT*");

    private static final SubLInteger $int$7779 = makeInteger(7779);

    public static final SubLList $list23 = list(makeString("application.cyc-ir.lucene.ebmt.content"));

    public static final SubLSymbol $ebmt_index_content$ = makeSymbol("*EBMT-INDEX-CONTENT*");

    public static final SubLString $str25$_cyc_departments_nl_corpora_ebmt_ = makeString("/cyc/departments/nl/corpora/ebmt-index.txt");

    public static final SubLList $list26 = list(makeString("application.cyc-ir.lucene.ebmt.log"));

    public static final SubLSymbol $ebmt_index_log$ = makeSymbol("*EBMT-INDEX-LOG*");

    public static final SubLString $str28$_cyc_departments_nl_corpora_ebmt_ = makeString("/cyc/departments/nl/corpora/ebmt-index.log");

    public static final SubLList $list29 = list(makeString("application.cyc-ir.lucene.ql-index.host"));

    public static final SubLSymbol $ql_index_host$ = makeSymbol("*QL-INDEX-HOST*");

    public static final SubLString $str31$elmore_cyc_com = makeString("elmore.cyc.com");

    public static final SubLList $list32 = list(makeString("application.cyc-ir.lucene.ql-index.port"));

    public static final SubLSymbol $ql_index_port$ = makeSymbol("*QL-INDEX-PORT*");

    private static final SubLInteger $int$7781 = makeInteger(7781);

    public static final SubLList $list35 = list(makeString("application.cyc-ir.lucene.ql-index.root-dir-names"));

    public static final SubLSymbol $ql_index_root_dir_names$ = makeSymbol("*QL-INDEX-ROOT-DIR-NAMES*");

    public static final SubLString $str37$data_ir_indexes_ql = makeString("data|ir|indexes|ql");

    public static final SubLList $list38 = list(makeString("application.cyc-ir.lucene.ql-index.log"));

    public static final SubLSymbol $ql_index_log$ = makeSymbol("*QL-INDEX-LOG*");

    public static final SubLString $str40$data_ir_indexes_ql_ql_index_log = makeString("data/ir/indexes/ql/ql-index.log");





    public static final SubLString $str43$___lucene_index_query__s__s__s___ = makeString("~%(lucene-index-query ~s ~s ~s) : ~s");

    public static final SubLString $$$version = makeString("version");

    public static final SubLString $str45$ = makeString("");

    public static final SubLString $str46$Lucene_Index_Server_listening_at_ = makeString("Lucene Index Server listening at port ~A on ~A~%");

    public static final SubLString $str47$Lucene_Index_Server_NOT_listening = makeString("Lucene Index Server NOT listening at port ~A on ~A~%");

    public static final SubLString $$$AddIndices = makeString("AddIndices");

    public static final SubLString $str49$__ = makeString(" +");

    public static final SubLString $str50$__ = makeString(" -");

    public static final SubLString $str51$__ = makeString(" ~");

    public static final SubLString $$$_ = makeString(" ");



    public static final SubLString $$$StringURLs = makeString("StringURLs");

    public static final SubLString $str55$Web_store_Index_Server_not_listen = makeString("Web-store Index Server not listening at port ~A on ~A");

    public static final SubLString $$$StringURLsAndSnippets = makeString("StringURLsAndSnippets");

    public static final SubLString $str57$StringURLsTitlesAndSnippets__A__A = makeString("StringURLsTitlesAndSnippets-~A-~A");

    public static final SubLString $$$URLContent = makeString("URLContent");

    public static final SubLString $$$URLText = makeString("URLText");

    public static final SubLString $$$URLTitle = makeString("URLTitle");

    public static final SubLString $$$URLFile = makeString("URLFile");

    public static final SubLString $$$StringFiles = makeString("StringFiles");

    public static final SubLString $str63$_quit_ = makeString("$quit$");

    public static final SubLString $str64$Successfully_shutdown_Web_store_I = makeString("Successfully shutdown Web-store Index Server at port ~A on ~A~%");

    public static final SubLString $$$CountContents = makeString("CountContents");

    public static final SubLString $$$URLIndex = makeString("URLIndex");

    public static final SubLString $str67$URL_Index_Server_not_listening_at = makeString("URL Index Server not listening at port ~A on ~A");

    public static final SubLString $str68$Successfully_shutdown_URL_Index_S = makeString("Successfully shutdown URL Index Server at port ~A on ~A~%");

    public static final SubLString $$$add = makeString("add");

    public static final SubLString $str70$EBMT_Template_Index_Server_not_li = makeString("EBMT Template Index Server not listening at port ~A on ~A");

    public static final SubLString $$$find = makeString("find");

    public static final SubLSymbol EBMT_TEMPLATE_FROM_RAW_TEMPLATE = makeSymbol("EBMT-TEMPLATE-FROM-RAW-TEMPLATE");

    public static final SubLString $$$delete = makeString("delete");

    public static final SubLString $str74$Successfully_shutdown_EBMT_Templa = makeString("Successfully shutdown EBMT Template Index Server at port ~A on ~A~%");

    public static final SubLString $$$Added = makeString("Added");

    public static final SubLString $$$NotAdded = makeString("NotAdded");

    public static final SubLString $$$Built = makeString("Built");

    public static final SubLString $$$NotBuilt = makeString("NotBuilt");

    public static final SubLString $$$form = makeString("form");

    public static final SubLString $$$cycl = makeString("cycl");

    public static final SubLString $$$kb = makeString("kb");

    public static final SubLString $$$process = makeString("process");

    public static final SubLString $$$host = makeString("host");

    public static final SubLString $$$user = makeString("user");

    public static final SubLString $$$time = makeString("time");

    public static final SubLString $$$id = makeString("id");

    public static final SubLString $$$gloss = makeString("gloss");

    public static final SubLString $$$generation = makeString("generation");

    public static final SubLString $$$build = makeString("build");

    public static final SubLString $str90$add_n = makeString("add-n");

    public static final SubLString $str91$search_string = makeString("search_string");

    public static final SubLString $str92$query_index_forms = makeString("query_index_forms");

    public static final SubLSymbol NON_EMPTY_STRING_P = makeSymbol("NON-EMPTY-STRING-P");



    public static final SubLSymbol $sym95$BOOLEAN_ = makeSymbol("BOOLEAN?");

    public static final SubLString $str96$QL_Index_Server_not_listening_at_ = makeString("QL Index Server not listening at port ~A on ~A");



















    private static final SubLSymbol $FAILED_TO_CONNECT = makeKeyword("FAILED-TO-CONNECT");

    private static final SubLSymbol $FAILED_TO_SHUTDOWN = makeKeyword("FAILED-TO-SHUTDOWN");



    public static final SubLString $str109$Successfully_shutdown_QL_Index_Se = makeString("Successfully shutdown QL Index Server at port ~A on ~A~%");

    public static final SubLSymbol CONTROL_CHAR_P = makeSymbol("CONTROL-CHAR-P");



    public static final SubLString $$$true = makeString("true");





    public static final SubLString $$$_AND_ = makeString(" AND ");



    public static final SubLString $$$_OR_ = makeString(" OR ");



    public static final SubLString $str119$_ = makeString("\"");



    public static final SubLString $str121$_ = makeString("+");



    public static final SubLString $str123$_ = makeString("~");

    public static final SubLString $str124$___ = makeString(" : ");



    public static final SubLString $str126$_ = makeString("[");

    public static final SubLString $$$_TO_ = makeString(" TO ");

    public static final SubLString $str128$_ = makeString("]");

    public static final SubLString $str129$Unknown_operator__A__dont_know_ho = makeString("Unknown operator ~A: dont know how to interpret.~%");

    public static final SubLString $$$YYYYMMDD = makeString("YYYYMMDD");

    public static final SubLString $$$date = makeString("date");

    public static final SubLString $str132$_home_shah_cvs_head_cycorp_cyc_ja = makeString("/home/shah/cvs/head/cycorp/cyc/java/com/cyc/common/cyc-common.jar:/cyc/java/lib/xercesImpl-2.2.1.jar:/cyc/java/lib/lucene-core-1.9.1.jar");

    private static final SubLInteger $int$8002 = makeInteger(8002);

    private static final SubLObject $$EBMTTrainingExamplesFromQLMt = reader_make_constant_shell(makeString("EBMTTrainingExamplesFromQLMt"));





    public static final SubLString $str137$_opt_local_pkg_j2sdk1_4_2_bin_jav = makeString("/opt/local/pkg/j2sdk1.4.2/bin/java");

    public static final SubLString $str138$_cp = makeString("-cp");

    public static final SubLString $str139$com_cyc_common_nlp_EBMTTemplateIn = makeString("com.cyc.common.nlp.EBMTTemplateIndexServer");

    public static final SubLString $str140$_i = makeString("-i");

    public static final SubLString $str141$_cyc_top_data_ebmt_release_ = makeString("/cyc/top/data/ebmt/release/");

    public static final SubLString $str142$_ebmt_index_ = makeString("/ebmt-index/");

    public static final SubLString $str143$_p = makeString("-p");

    public static final SubLString $str144$_ebmt_index_txt = makeString("/ebmt-index.txt");

    public static final SubLString $str145$_ebmt_index_log = makeString("/ebmt-index.log");

    public static final SubLString $$$EBMT_Template_Index_Server = makeString("EBMT Template Index Server");

    public static final SubLString $$$localhost = makeString("localhost");

    public static final SubLString $str148$No_templates_added_to_EBMT_Templa = makeString("No templates added to EBMT Template Index for external release.");

    public static SubLObject lucene_index_query_xml(final SubLObject query_type, final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_xml = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                xml_utilities.xml_start_tag_internal($$$query, list($$$type, query_type), NIL, UNPROVIDED, UNPROVIDED);
                xml_utilities.xml_write(query, UNPROVIDED);
                xml_utilities.xml_end_tag_internal($$$query);
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            query_xml = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return query_xml;
    }

    public static SubLObject with_ws_index_server(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject host = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        host = current.first();
        current = current.rest();
        final SubLObject port = (current.isCons()) ? current.first() : $ws_index_port$.getDynamicValue(thread);
        destructuring_bind_must_listp(current, datum, $list9);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($ws_index_host$, host), list($ws_index_port$, port)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    public static SubLObject get_ql_index_host() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ql_index_host$.getDynamicValue(thread);
    }

    public static SubLObject set_ql_index_host(final SubLObject hostname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $ql_index_host$.setDynamicValue(hostname, thread);
        return $ql_index_host$.getDynamicValue(thread);
    }

    public static SubLObject get_ql_index_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ql_index_port$.getDynamicValue(thread);
    }

    public static SubLObject set_ql_index_port(final SubLObject v_int) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $ql_index_port$.setDynamicValue(v_int, thread);
        return $ql_index_port$.getDynamicValue(thread);
    }

    public static SubLObject get_ql_index_root_dir_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ql_index_root_dir_names$.getDynamicValue(thread);
    }

    public static SubLObject set_ql_index_root_dir_names(final SubLObject names_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $ql_index_root_dir_names$.setDynamicValue(names_string, thread);
        return $ql_index_root_dir_names$.getDynamicValue(thread);
    }

    public static SubLObject get_ql_index_log() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ql_index_log$.getDynamicValue(thread);
    }

    public static SubLObject set_ql_index_log(final SubLObject pathname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $ql_index_log$.setDynamicValue(pathname, thread);
        return $ql_index_log$.getDynamicValue(thread);
    }

    public static SubLObject lucene_index_query(final SubLObject string, final SubLObject host, final SubLObject port) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject stream = NIL;
                    try {
                        stream = subl_promotions.open_tcp_stream_with_timeout(host, port, NIL, $PUBLIC);
                        if (NIL != validate_tcp_connection(stream, host, port)) {
                            princ(string, stream);
                            terpri(stream);
                            finish_output(stream);
                            result = read_line(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != stream) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            format(T, $str43$___lucene_index_query__s__s__s___, new SubLObject[]{ string, host, port, error });
        }
        return result;
    }

    public static SubLObject lucene_index_server_version(final SubLObject host, final SubLObject port) {
        final SubLObject query_xml = lucene_index_query_xml($$$version, $str45$);
        return lucene_index_query(query_xml, host, port);
    }

    public static SubLObject lucene_index_server_aliveP(final SubLObject host, final SubLObject port, final SubLObject verbose) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject status = NIL;
        SubLObject output = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
            try {
                StreamsLow.$standard_output$.bind(s, thread);
                if (NIL != lucene_index_server_version(host, port)) {
                    status = T;
                }
            } finally {
                StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
            }
            output = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (NIL != verbose) {
            if (NIL != status) {
                format(T, $str46$Lucene_Index_Server_listening_at_, port, host);
            } else {
                format(T, $str47$Lucene_Index_Server_NOT_listening, port, host);
            }
        }
        return status;
    }

    public static SubLObject lucene_index_add_indices(final SubLObject host, final SubLObject port, final SubLObject indices) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject indices_string = NIL;
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            indices_string = string_utilities.strip_first(format_nil.format_nil_s(indices));
            indices_string = string_utilities.strip_final(indices_string, UNPROVIDED);
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        final SubLObject query_xml = lucene_index_query_xml($$$AddIndices, indices_string);
        return lucene_index_query(query_xml, host, port);
    }

    public static SubLObject ws_build_search_string(final SubLObject includes, final SubLObject excludes, final SubLObject likes, SubLObject old_search_string) {
        if (old_search_string == UNPROVIDED) {
            old_search_string = NIL;
        }
        SubLObject pieces = NIL;
        SubLObject cdolist_list_var = includes;
        SubLObject include = NIL;
        include = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pieces = cons($str49$__, pieces);
            pieces = cons(include, pieces);
            cdolist_list_var = cdolist_list_var.rest();
            include = cdolist_list_var.first();
        } 
        cdolist_list_var = excludes;
        SubLObject exclude = NIL;
        exclude = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pieces = cons($str50$__, pieces);
            pieces = cons(exclude, pieces);
            cdolist_list_var = cdolist_list_var.rest();
            exclude = cdolist_list_var.first();
        } 
        cdolist_list_var = likes;
        SubLObject like = NIL;
        like = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pieces = cons($str51$__, pieces);
            pieces = cons(like, pieces);
            cdolist_list_var = cdolist_list_var.rest();
            like = cdolist_list_var.first();
        } 
        if (NIL != old_search_string) {
            pieces = cons($$$_, pieces);
            pieces = cons(old_search_string, pieces);
        }
        return string_utilities.reduce_whitespace(apply(symbol_function(CCONCATENATE), nreverse(pieces)));
    }

    public static SubLObject get_ws_index_host() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ws_index_host$.getDynamicValue(thread);
    }

    public static SubLObject get_ws_index_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ws_index_port$.getDynamicValue(thread);
    }

    public static SubLObject ws_index_server_aliveP(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        return lucene_index_server_aliveP(host, port, verbose);
    }

    public static SubLObject ws_index_search(final SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != ws_index_server_aliveP(host, port, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$StringURLs, search_string);
            return read_from_string(lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        Errors.warn($str55$Web_store_Index_Server_not_listen, port, host);
        return NIL;
    }

    public static SubLObject ws_index_search_with_snippets(final SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != ws_index_server_aliveP(host, port, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$StringURLsAndSnippets, search_string);
            return read_from_string(lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        Errors.warn($str55$Web_store_Index_Server_not_listen, port, host);
        return NIL;
    }

    public static SubLObject ws_index_search_with_titles_and_snippets(final SubLObject search_string, final SubLObject start, final SubLObject count, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        final SubLObject command = format(NIL, $str57$StringURLsTitlesAndSnippets__A__A, start, count);
        if (NIL != ws_index_server_aliveP(host, port, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml(command, search_string);
            return read_from_string(lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        Errors.warn($str55$Web_store_Index_Server_not_listen, port, host);
        return NIL;
    }

    public static SubLObject ws_index_url_content(final SubLObject url_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != ws_index_server_aliveP(host, port, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$URLContent, url_string);
            return lucene_index_query(query_xml, host, port);
        }
        Errors.warn($str55$Web_store_Index_Server_not_listen, port, host);
        return NIL;
    }

    public static SubLObject ws_index_url_text(final SubLObject url_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != ws_index_server_aliveP(host, port, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$URLText, url_string);
            return lucene_index_query(query_xml, host, port);
        }
        Errors.warn($str55$Web_store_Index_Server_not_listen, port, host);
        return NIL;
    }

    public static SubLObject ws_index_url_title(final SubLObject url_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != ws_index_server_aliveP(host, port, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$URLTitle, url_string);
            return lucene_index_query(query_xml, host, port);
        }
        Errors.warn($str55$Web_store_Index_Server_not_listen, port, host);
        return NIL;
    }

    public static SubLObject ws_index_pathname_for_url(final SubLObject url_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != ws_index_server_aliveP(host, port, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$URLFile, url_string);
            return lucene_index_query(query_xml, host, port);
        }
        Errors.warn($str55$Web_store_Index_Server_not_listen, port, host);
        return NIL;
    }

    public static SubLObject ws_index_search_for_pathnames(final SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != ws_index_server_aliveP(host, port, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$StringFiles, search_string);
            return read_from_string(lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        Errors.warn($str55$Web_store_Index_Server_not_listen, port, host);
        return NIL;
    }

    public static SubLObject ws_index_shutdown(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        if (NIL != ws_index_server_aliveP(host, port, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($str63$_quit_, $str45$);
            lucene_index_query(query_xml, host, port);
        }
        if (NIL != verbose) {
            format(T, $str64$Successfully_shutdown_Web_store_I, port, host);
        }
        return T;
    }

    public static SubLObject ws_index_count(final SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != ws_index_server_aliveP(host, port, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$CountContents, search_string);
            final SubLObject result = read_from_string(lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL == result ? ZERO_INTEGER : result.first();
        }
        Errors.warn($str55$Web_store_Index_Server_not_listen, port, host);
        return ZERO_INTEGER;
    }

    public static SubLObject url_index_server_aliveP(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $url_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        return lucene_index_server_aliveP(host, port, verbose);
    }

    public static SubLObject url_index_search(final SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $url_index_port$.getDynamicValue();
        }
        if (NIL != url_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$URLIndex, search_string);
            return read_from_string(lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        Errors.warn($str67$URL_Index_Server_not_listening_at, port, host);
        return NIL;
    }

    public static SubLObject url_index_shutdown(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $url_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        if (NIL != url_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($str63$_quit_, $str45$);
            lucene_index_query(query_xml, host, port);
        }
        if (NIL != verbose) {
            format(T, $str68$Successfully_shutdown_URL_Index_S, port, host);
        }
        return T;
    }

    public static SubLObject ebmt_index_server_aliveP(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        return lucene_index_server_aliveP(host, port, verbose);
    }

    public static SubLObject ebmt_index_add_template(final SubLObject template_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (NIL != ebmt_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$add, template_string);
            return lucene_index_query(query_xml, host, port);
        }
        Errors.warn($str70$EBMT_Template_Index_Server_not_li, port, host);
        return NIL;
    }

    public static SubLObject ebmt_template_from_raw_template(final SubLObject raw_template) {
        return ebmt_template_parser.new_ebmt_template(NIL, NIL, third(raw_template.first()), list_utilities.cadar(raw_template), NIL, second(raw_template));
    }

    public static SubLObject ebmt_index_find_templates(final SubLObject linkage_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (NIL != ebmt_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$find, linkage_string);
            final SubLObject raw_templates = read_from_string(lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject ebmt_templates = Mapping.mapcar(EBMT_TEMPLATE_FROM_RAW_TEMPLATE, raw_templates);
            return ebmt_templates;
        }
        Errors.warn($str70$EBMT_Template_Index_Server_not_li, port, host);
        return NIL;
    }

    public static SubLObject ebmt_index_delete_template(final SubLObject template_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (NIL != ebmt_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($$$delete, template_string);
            return lucene_index_query(query_xml, host, port);
        }
        Errors.warn($str70$EBMT_Template_Index_Server_not_li, port, host);
        return NIL;
    }

    public static SubLObject ebmt_index_add_indices(final SubLObject indices, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (NIL != ebmt_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return lucene_index_add_indices(host, port, indices);
        }
        Errors.warn($str70$EBMT_Template_Index_Server_not_li, port, host);
        return NIL;
    }

    public static SubLObject ebmt_index_shutdown(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        if (NIL != ebmt_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject query_xml = lucene_index_query_xml($str63$_quit_, $str45$);
            lucene_index_query(query_xml, host, port);
        }
        if (NIL != verbose) {
            format(T, $str74$Successfully_shutdown_EBMT_Templa, port, host);
        }
        return T;
    }

    public static SubLObject ql_index_server_aliveP(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        assert NIL != string_utilities.non_empty_string_p(host) : "string_utilities.non_empty_string_p(host) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(host) " + host;
        assert NIL != subl_promotions.positive_integer_p(port) : "subl_promotions.positive_integer_p(port) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(port) " + port;
        assert NIL != obsolete.booleanP(verbose) : "obsolete.booleanP(verbose) " + "CommonSymbols.NIL != obsolete.booleanP(verbose) " + verbose;
        return lucene_index_server_aliveP(host, port, verbose);
    }

    public static SubLObject ql_index_add_queries(final SubLObject encapsulated_requests, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = $ql_index_sc_not_added$.getGlobalValue();
        if (((NIL != list_utilities.non_empty_list_p(encapsulated_requests)) && (NIL != string_utilities.non_empty_string_p(host))) && (NIL != subl_promotions.positive_integer_p(port))) {
            if (NIL != ql_index_server_aliveP(host, port, UNPROVIDED)) {
                SubLObject tmpstr = $str45$;
                SubLObject xml_msg = $str45$;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(stream, thread);
                        xml_utilities.xml_start_tag_internal($ql_index_sc_query$.getGlobalValue(), list($ql_index_sc_type$.getGlobalValue(), $ql_index_sc_add_n$.getGlobalValue()), NIL, UNPROVIDED, UNPROVIDED);
                        xml_utilities.xml_start_tag_internal($ql_index_sc_query_index_forms$.getGlobalValue(), list($ql_index_sc_kb$.getGlobalValue(), format_nil.format_nil_a(kb_loaded())), NIL, UNPROVIDED, UNPROVIDED);
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                    tmpstr = get_output_stream_string(stream);
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        close(stream, UNPROVIDED);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
                xml_msg = tmpstr;
                tmpstr = $str45$;
                SubLObject cdolist_list_var = encapsulated_requests;
                SubLObject v_encapsulation = NIL;
                v_encapsulation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject xml_form_doc = ql_index_add_query_xml(v_encapsulation);
                    if (NIL != xml_form_doc) {
                        xml_msg = cconcatenate(xml_msg, xml_form_doc);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_encapsulation = cdolist_list_var.first();
                } 
                stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(stream, thread);
                        xml_utilities.xml_end_tag_internal($ql_index_sc_query_index_forms$.getGlobalValue());
                        xml_utilities.xml_end_tag_internal($ql_index_sc_query$.getGlobalValue());
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                    tmpstr = get_output_stream_string(stream);
                } finally {
                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        close(stream, UNPROVIDED);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
                xml_msg = cconcatenate(xml_msg, tmpstr);
                final SubLObject tmp = lucene_index_query(xml_msg, host, port);
                if (tmp.equal($ql_index_sc_added$.getGlobalValue())) {
                    result = tmp;
                }
            } else {
                Errors.warn($str96$QL_Index_Server_not_listening_at_, port, host);
            }
        }
        return result;
    }

    public static SubLObject ql_index_add_query(final SubLObject encapsulated_request, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = $ql_index_sc_not_added$.getGlobalValue();
        if (((NIL != list_utilities.property_list_p(encapsulated_request)) && (NIL != string_utilities.non_empty_string_p(host))) && (NIL != subl_promotions.positive_integer_p(port))) {
            if (NIL != ql_index_server_aliveP(host, port, UNPROVIDED)) {
                final SubLObject xml_form_doc = ql_index_add_query_xml(encapsulated_request);
                SubLObject tmpstr = $str45$;
                SubLObject xml_msg = $str45$;
                if (NIL != string_utilities.non_empty_string_p(xml_form_doc)) {
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream, thread);
                            xml_utilities.xml_start_tag_internal($ql_index_sc_query$.getGlobalValue(), list($ql_index_sc_type$.getGlobalValue(), $ql_index_sc_add$.getGlobalValue()), NIL, UNPROVIDED, UNPROVIDED);
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                        }
                        xml_msg = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                    xml_msg = cconcatenate(xml_msg, xml_form_doc);
                    stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream, thread);
                            xml_utilities.xml_end_tag_internal($ql_index_sc_query$.getGlobalValue());
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                        }
                        tmpstr = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                        }
                    }
                    xml_msg = cconcatenate(xml_msg, tmpstr);
                    final SubLObject tmp = lucene_index_query(xml_msg, host, port);
                    if (tmp.equal($ql_index_sc_added$.getGlobalValue())) {
                        result = tmp;
                    }
                }
            } else {
                Errors.warn($str96$QL_Index_Server_not_listening_at_, port, host);
            }
        }
        return result;
    }

    public static SubLObject ql_index_add_query_xml(final SubLObject encapsulated_request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject xml_form_doc = NIL;
        if (NIL != list_utilities.property_list_p(encapsulated_request)) {
            final SubLObject id_string = getf(encapsulated_request, $ID, UNPROVIDED);
            final SubLObject cycl = getf(encapsulated_request, $CYCL, UNPROVIDED);
            final SubLObject generation = getf(encapsulated_request, $GENERATION, UNPROVIDED);
            final SubLObject gloss = getf(encapsulated_request, $GLOSS, UNPROVIDED);
            final SubLObject kb = getf(encapsulated_request, $KB, UNPROVIDED);
            final SubLObject process = getf(encapsulated_request, $PROCESS, UNPROVIDED);
            final SubLObject cyc_host = getf(encapsulated_request, $HOST, UNPROVIDED);
            final SubLObject user = getf(encapsulated_request, $USER, UNPROVIDED);
            final SubLObject time = getf(encapsulated_request, $TIME, UNPROVIDED);
            if (((NIL != string_utilities.non_empty_string_p(id_string)) && (NIL != cycl)) && ((NIL != string_utilities.non_empty_string_p(gloss)) || (NIL != string_utilities.non_empty_string_p(generation)))) {
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(stream, thread);
                        xml_utilities.xml_start_tag_internal($ql_index_sc_form$.getGlobalValue(), list($ql_index_sc_id$.getGlobalValue(), id_string), NIL, UNPROVIDED, UNPROVIDED);
                        if (NIL != subl_promotions.positive_integer_p(kb)) {
                            xml_utilities.xml_start_tag_internal($ql_index_sc_kb$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                            xml_utilities.xml_cdata(replace_problematic_chars(format_nil.format_nil_a(kb)));
                            xml_utilities.xml_end_tag_internal($ql_index_sc_kb$.getGlobalValue());
                        }
                        if (NIL != cycl) {
                            xml_utilities.xml_start_tag_internal($ql_index_sc_cycl$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                            xml_utilities.xml_cdata(replace_problematic_chars(format_nil.format_nil_a(cycl)));
                            xml_utilities.xml_end_tag_internal($ql_index_sc_cycl$.getGlobalValue());
                        }
                        if (NIL != string_utilities.non_empty_string_p(gloss)) {
                            xml_utilities.xml_start_tag_internal($ql_index_sc_gloss$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                            xml_utilities.xml_cdata(replace_problematic_chars(gloss));
                            xml_utilities.xml_end_tag_internal($ql_index_sc_gloss$.getGlobalValue());
                        }
                        if (NIL != string_utilities.non_empty_string_p(generation)) {
                            xml_utilities.xml_start_tag_internal($ql_index_sc_generation$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                            xml_utilities.xml_cdata(replace_problematic_chars(generation));
                            xml_utilities.xml_end_tag_internal($ql_index_sc_generation$.getGlobalValue());
                        }
                        if (NIL != string_utilities.non_empty_string_p(process)) {
                            xml_utilities.xml_start_tag_internal($ql_index_sc_process$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                            xml_utilities.xml_cdata(replace_problematic_chars(process));
                            xml_utilities.xml_end_tag_internal($ql_index_sc_process$.getGlobalValue());
                        }
                        if (NIL != string_utilities.non_empty_string_p(cyc_host)) {
                            xml_utilities.xml_start_tag_internal($ql_index_sc_host$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                            xml_utilities.xml_cdata(replace_problematic_chars(cyc_host));
                            xml_utilities.xml_end_tag_internal($ql_index_sc_host$.getGlobalValue());
                        }
                        if (NIL != string_utilities.non_empty_string_p(user)) {
                            xml_utilities.xml_start_tag_internal($ql_index_sc_user$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                            xml_utilities.xml_cdata(replace_problematic_chars(user));
                            xml_utilities.xml_end_tag_internal($ql_index_sc_user$.getGlobalValue());
                        }
                        if (NIL != string_utilities.non_empty_string_p(time)) {
                            xml_utilities.xml_start_tag_internal($ql_index_sc_time$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                            xml_utilities.xml_cdata(replace_problematic_chars(time));
                            xml_utilities.xml_end_tag_internal($ql_index_sc_time$.getGlobalValue());
                        }
                        xml_utilities.xml_end_tag_internal($ql_index_sc_form$.getGlobalValue());
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                    xml_form_doc = get_output_stream_string(stream);
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        close(stream, UNPROVIDED);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
            }
        }
        return xml_form_doc;
    }

    public static SubLObject ql_index_build_from_file(final SubLObject kb, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = $ql_index_sc_not_built$.getGlobalValue();
        if (((NIL != subl_promotions.positive_integer_p(kb)) && (NIL != string_utilities.non_empty_string_p(host))) && (NIL != subl_promotions.positive_integer_p(port))) {
            if (NIL != ql_index_server_aliveP(host, port, UNPROVIDED)) {
                SubLObject xml_msg = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(stream, thread);
                        xml_utilities.xml_start_tag_internal($ql_index_sc_query$.getGlobalValue(), list($ql_index_sc_type$.getGlobalValue(), $ql_index_sc_build$.getGlobalValue()), NIL, UNPROVIDED, UNPROVIDED);
                        xml_utilities.xml_start_tag_internal($ql_index_sc_kb$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                        xml_utilities.xml_cdata(replace_problematic_chars(format_nil.format_nil_a(kb)));
                        xml_utilities.xml_end_tag_internal($ql_index_sc_kb$.getGlobalValue());
                        xml_utilities.xml_end_tag_internal($ql_index_sc_query$.getGlobalValue());
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                    xml_msg = get_output_stream_string(stream);
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        close(stream, UNPROVIDED);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
                final SubLObject tmp = lucene_index_query(xml_msg, host, port);
                if (tmp.equal($ql_index_sc_built$.getGlobalValue())) {
                    result = tmp;
                }
            } else {
                Errors.warn($str96$QL_Index_Server_not_listening_at_, port, host);
            }
        }
        return result;
    }

    public static SubLObject ql_index_find_queries(final SubLObject kb, final SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if ((((NIL != subl_promotions.positive_integer_p(kb)) && (NIL != string_utilities.non_empty_string_p(search_string))) && (NIL != string_utilities.non_empty_string_p(host))) && (NIL != subl_promotions.positive_integer_p(port))) {
            if (NIL != ql_index_server_aliveP(host, port, UNPROVIDED)) {
                final SubLObject cyc_host = Environment.get_machine_name(UNPROVIDED);
                final SubLObject user = format_nil.format_nil_a(operation_communication.the_cyclist());
                final SubLObject process = format_nil.format_nil_a(current_process());
                final SubLObject time = numeric_date_utilities.safe_timestring(get_universal_time());
                SubLObject xml_msg = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(stream, thread);
                        xml_utilities.xml_start_tag_internal($ql_index_sc_query$.getGlobalValue(), list($ql_index_sc_type$.getGlobalValue(), $ql_index_sc_find$.getGlobalValue()), NIL, UNPROVIDED, UNPROVIDED);
                        xml_utilities.xml_start_tag_internal($ql_index_sc_kb$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                        xml_utilities.xml_cdata(replace_problematic_chars(format_nil.format_nil_a(kb)));
                        xml_utilities.xml_end_tag_internal($ql_index_sc_kb$.getGlobalValue());
                        xml_utilities.xml_start_tag_internal($ql_index_sc_search_string$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                        xml_utilities.xml_cdata(replace_problematic_chars(search_string));
                        xml_utilities.xml_end_tag_internal($ql_index_sc_search_string$.getGlobalValue());
                        xml_utilities.xml_start_tag_internal($ql_index_sc_host$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                        xml_utilities.xml_cdata(replace_problematic_chars(cyc_host));
                        xml_utilities.xml_end_tag_internal($ql_index_sc_host$.getGlobalValue());
                        xml_utilities.xml_start_tag_internal($ql_index_sc_user$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                        xml_utilities.xml_cdata(replace_problematic_chars(user));
                        xml_utilities.xml_end_tag_internal($ql_index_sc_user$.getGlobalValue());
                        xml_utilities.xml_start_tag_internal($ql_index_sc_process$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                        xml_utilities.xml_cdata(replace_problematic_chars(process));
                        xml_utilities.xml_end_tag_internal($ql_index_sc_process$.getGlobalValue());
                        xml_utilities.xml_start_tag_internal($ql_index_sc_time$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                        xml_utilities.xml_cdata(replace_problematic_chars(time));
                        xml_utilities.xml_end_tag_internal($ql_index_sc_time$.getGlobalValue());
                        xml_utilities.xml_end_tag_internal($ql_index_sc_query$.getGlobalValue());
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                    xml_msg = get_output_stream_string(stream);
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        close(stream, UNPROVIDED);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
                final SubLObject tmp = read_from_string(lucene_index_query(xml_msg, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.non_empty_list_p(tmp)) {
                    result = tmp;
                }
            } else {
                Errors.warn($str96$QL_Index_Server_not_listening_at_, port, host);
            }
        }
        return result;
    }

    public static SubLObject ql_index_server_shutdown(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        SubLObject result = $FAILED_TO_CONNECT;
        if ((((NIL != string_utilities.non_empty_string_p(host)) && (NIL != subl_promotions.positive_integer_p(port))) && (NIL != obsolete.booleanP(verbose))) && (NIL != ql_index_server_aliveP(host, port, UNPROVIDED))) {
            result = $FAILED_TO_SHUTDOWN;
            final SubLObject query_xml = lucene_index_query_xml($ql_index_sc_quit$.getGlobalValue(), $str45$);
            lucene_index_query(query_xml, host, port);
            SubLObject count = ZERO_INTEGER;
            while (count.numL(FIVE_INTEGER) && (NIL != ql_index_server_aliveP(host, port, UNPROVIDED))) {
                count = add(count, ONE_INTEGER);
                sleep(ONE_INTEGER);
            } 
            if (NIL == ql_index_server_aliveP(host, port, UNPROVIDED)) {
                result = $SHUTDOWN;
            }
            if ((NIL != verbose) && (result == $SHUTDOWN)) {
                format(T, $str109$Successfully_shutdown_QL_Index_Se, port, host);
            }
        }
        return result;
    }

    public static SubLObject replace_problematic_chars(final SubLObject string) {
        return string_utilities.strip_chars_meeting_test(string, symbol_function(CONTROL_CHAR_P));
    }

    public static SubLObject lucene_symbolic_query_to_string(final SubLObject symbolic_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $lucene_query_string_stack$.currentBinding(thread);
        try {
            $lucene_query_string_stack$.bind(NIL, thread);
            interpret_one_symbolic_query_element(symbolic_query);
            result = string_utilities.reduce_whitespace(apply(symbol_function(CCONCATENATE), nreverse($lucene_query_string_stack$.getDynamicValue(thread))));
        } finally {
            $lucene_query_string_stack$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject interpret_one_symbolic_query_element(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_object.isString()) {
            $lucene_query_string_stack$.setDynamicValue(cons(v_object, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
        } else
            if (NIL != forts.fort_p(v_object)) {
                interpret_one_symbolic_query_element(list($KEYWORD, kb_utilities.hl_external_id_string(v_object), $$$true));
            } else
                if (v_object.isCons() && v_object.first().isKeyword()) {
                    final SubLObject operator = v_object.first();
                    final SubLObject operands = v_object.rest();
                    final SubLObject pcase_var = operator;
                    if (pcase_var.eql($BAG)) {
                        SubLObject list_var = NIL;
                        SubLObject operand = NIL;
                        SubLObject counter = NIL;
                        list_var = operands;
                        operand = list_var.first();
                        for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , operand = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                            if (!counter.isZero()) {
                                $lucene_query_string_stack$.setDynamicValue(cons($$$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                            }
                            interpret_one_symbolic_query_element(operand);
                        }
                    } else
                        if (pcase_var.eql($AND)) {
                            SubLObject list_var = NIL;
                            SubLObject operand = NIL;
                            SubLObject counter = NIL;
                            list_var = operands;
                            operand = list_var.first();
                            for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , operand = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                if (!counter.isZero()) {
                                    $lucene_query_string_stack$.setDynamicValue(cons($$$_AND_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                }
                                interpret_one_symbolic_query_element(operand);
                            }
                        } else
                            if (pcase_var.eql($OR)) {
                                SubLObject list_var = NIL;
                                SubLObject operand = NIL;
                                SubLObject counter = NIL;
                                list_var = operands;
                                operand = list_var.first();
                                for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , operand = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                    if (!counter.isZero()) {
                                        $lucene_query_string_stack$.setDynamicValue(cons($$$_OR_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                    }
                                    interpret_one_symbolic_query_element(operand);
                                }
                            } else
                                if (pcase_var.eql($QUOTE)) {
                                    final SubLObject operand2 = operands.first();
                                    $lucene_query_string_stack$.setDynamicValue(cons($str119$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                    interpret_one_symbolic_query_element(operand2);
                                    $lucene_query_string_stack$.setDynamicValue(cons($str119$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                } else
                                    if (pcase_var.eql($MUST)) {
                                        final SubLObject operand2 = operands.first();
                                        $lucene_query_string_stack$.setDynamicValue(cons($str121$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                        interpret_one_symbolic_query_element(operand2);
                                    } else
                                        if (pcase_var.eql($LIKE)) {
                                            final SubLObject operand2 = operands.first();
                                            $lucene_query_string_stack$.setDynamicValue(cons($str123$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                            interpret_one_symbolic_query_element(operand2);
                                        } else
                                            if (pcase_var.eql($KEYWORD)) {
                                                final SubLObject keyword = operands.first();
                                                final SubLObject value = second(operands);
                                                $lucene_query_string_stack$.setDynamicValue(cons(keyword, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                $lucene_query_string_stack$.setDynamicValue(cons($str124$___, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                interpret_one_symbolic_query_element(value);
                                            } else
                                                if (pcase_var.eql($RANGE)) {
                                                    final SubLObject low = operands.first();
                                                    final SubLObject high = second(operands);
                                                    $lucene_query_string_stack$.setDynamicValue(cons($str126$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                    interpret_one_symbolic_query_element(low);
                                                    $lucene_query_string_stack$.setDynamicValue(cons($$$_TO_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                    interpret_one_symbolic_query_element(high);
                                                    $lucene_query_string_stack$.setDynamicValue(cons($str128$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                } else {
                                                    Errors.error($str129$Unknown_operator__A__dont_know_ho, operator);
                                                }







                } else
                    if (NIL != cycl_grammar.cycl_nat_p(v_object)) {
                        interpret_nat_symbolic_query_element(v_object);
                    } else {
                        interpret_one_symbolic_query_element(string_utilities.to_string(v_object));
                    }



        return v_object;
    }

    public static SubLObject interpret_nat_symbolic_query_element(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $lucene_symbolic_query_translate_dates$.getDynamicValue(thread)) && (NIL != date_utilities.date_p(nat))) {
            final SubLObject string = date_defns.cyc_date_encode_string($$$YYYYMMDD, nat);
            interpret_one_symbolic_query_element(string);
        } else {
            interpret_one_symbolic_query_element(list($KEYWORD, kb_utilities.hl_external_id_string(nat), $$$true));
        }
        return nat;
    }

    public static SubLObject construct_symbolic_terminus_ante_quem_query(final SubLObject cycl_date) {
        return list($KEYWORD, $$$date, list($RANGE, ZERO_INTEGER, cycl_date));
    }

    public static SubLObject construct_symbolic_terminus_post_quem_query(final SubLObject cycl_date) {
        return list($KEYWORD, $$$date, list($RANGE, cycl_date, date_utilities.indexical_today()));
    }

    public static SubLObject lucene_symbolic_terminus_ante_quem_query(final SubLObject cycl_date) {
        return lucene_symbolic_query_to_string(construct_symbolic_terminus_ante_quem_query(cycl_date));
    }

    public static SubLObject lucene_symbolic_terminus_post_quem_query(final SubLObject cycl_date) {
        return lucene_symbolic_query_to_string(construct_symbolic_terminus_post_quem_query(cycl_date));
    }

    public static SubLObject ebmt_create_index_for_release(SubLObject kb_num, SubLObject classpath, SubLObject port, SubLObject mt) {
        if (kb_num == UNPROVIDED) {
            kb_num = kb_loaded();
        }
        if (classpath == UNPROVIDED) {
            classpath = $str132$_home_shah_cvs_head_cycorp_cyc_ja;
        }
        if (port == UNPROVIDED) {
            port = $int$8002;
        }
        if (mt == UNPROVIDED) {
            mt = $$EBMTTrainingExamplesFromQLMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(kb_num) : "subl_promotions.positive_integer_p(kb_num) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(kb_num) " + kb_num;
        assert NIL != stringp(classpath) : "Types.stringp(classpath) " + "CommonSymbols.NIL != Types.stringp(classpath) " + classpath;
        assert NIL != subl_promotions.positive_integer_p(port) : "subl_promotions.positive_integer_p(port) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(port) " + port;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        final SubLObject program = $str137$_opt_local_pkg_j2sdk1_4_2_bin_jav;
        final SubLObject args = list($str138$_cp, classpath, $str139$com_cyc_common_nlp_EBMTTemplateIn, $str140$_i, cconcatenate($str141$_cyc_top_data_ebmt_release_, new SubLObject[]{ format_nil.format_nil_a_no_copy(kb_num), $str142$_ebmt_index_ }), $str143$_p, format_nil.format_nil_a(port));
        final SubLObject index_content = cconcatenate($str141$_cyc_top_data_ebmt_release_, new SubLObject[]{ format_nil.format_nil_a_no_copy(kb_num), $str144$_ebmt_index_txt });
        final SubLObject index_log = cconcatenate($str141$_cyc_top_data_ebmt_release_, new SubLObject[]{ format_nil.format_nil_a_no_copy(kb_num), $str145$_ebmt_index_log });
        final SubLObject os_process = os_process_utilities.make_os_process($$$EBMT_Template_Index_Server, program, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject num_templates = NIL;
        final SubLObject _prev_bind_0 = $ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ebmt_index_port$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $ebmt_index_log$.currentBinding(thread);
        try {
            $ebmt_index_host$.bind($$$localhost, thread);
            $ebmt_index_port$.bind(port, thread);
            $ebmt_index_content$.bind(index_content, thread);
            $ebmt_index_log$.bind(index_log, thread);
            num_templates = ebmt_template_parser.ebmt_populate_index_from_mt(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $ebmt_index_log$.rebind(_prev_bind_4, thread);
            $ebmt_index_content$.rebind(_prev_bind_3, thread);
            $ebmt_index_port$.rebind(_prev_bind_2, thread);
            $ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        if (num_templates.numE(ZERO_INTEGER)) {
            Errors.warn($str148$No_templates_added_to_EBMT_Templa);
        }
        os_process_utilities.kill_os_process(os_process);
        return num_templates;
    }

    public static SubLObject declare_lucene_index_file() {
        declareFunction(me, "lucene_index_query_xml", "LUCENE-INDEX-QUERY-XML", 2, 0, false);
        declareMacro(me, "with_ws_index_server", "WITH-WS-INDEX-SERVER");
        declareFunction(me, "get_ql_index_host", "GET-QL-INDEX-HOST", 0, 0, false);
        declareFunction(me, "set_ql_index_host", "SET-QL-INDEX-HOST", 1, 0, false);
        declareFunction(me, "get_ql_index_port", "GET-QL-INDEX-PORT", 0, 0, false);
        declareFunction(me, "set_ql_index_port", "SET-QL-INDEX-PORT", 1, 0, false);
        declareFunction(me, "get_ql_index_root_dir_names", "GET-QL-INDEX-ROOT-DIR-NAMES", 0, 0, false);
        declareFunction(me, "set_ql_index_root_dir_names", "SET-QL-INDEX-ROOT-DIR-NAMES", 1, 0, false);
        declareFunction(me, "get_ql_index_log", "GET-QL-INDEX-LOG", 0, 0, false);
        declareFunction(me, "set_ql_index_log", "SET-QL-INDEX-LOG", 1, 0, false);
        declareFunction(me, "lucene_index_query", "LUCENE-INDEX-QUERY", 3, 0, false);
        declareFunction(me, "lucene_index_server_version", "LUCENE-INDEX-SERVER-VERSION", 2, 0, false);
        declareFunction(me, "lucene_index_server_aliveP", "LUCENE-INDEX-SERVER-ALIVE?", 3, 0, false);
        declareFunction(me, "lucene_index_add_indices", "LUCENE-INDEX-ADD-INDICES", 3, 0, false);
        declareFunction(me, "ws_build_search_string", "WS-BUILD-SEARCH-STRING", 3, 1, false);
        declareFunction(me, "get_ws_index_host", "GET-WS-INDEX-HOST", 0, 0, false);
        declareFunction(me, "get_ws_index_port", "GET-WS-INDEX-PORT", 0, 0, false);
        declareFunction(me, "ws_index_server_aliveP", "WS-INDEX-SERVER-ALIVE?", 0, 3, false);
        declareFunction(me, "ws_index_search", "WS-INDEX-SEARCH", 1, 2, false);
        declareFunction(me, "ws_index_search_with_snippets", "WS-INDEX-SEARCH-WITH-SNIPPETS", 1, 2, false);
        declareFunction(me, "ws_index_search_with_titles_and_snippets", "WS-INDEX-SEARCH-WITH-TITLES-AND-SNIPPETS", 3, 2, false);
        declareFunction(me, "ws_index_url_content", "WS-INDEX-URL-CONTENT", 1, 2, false);
        declareFunction(me, "ws_index_url_text", "WS-INDEX-URL-TEXT", 1, 2, false);
        declareFunction(me, "ws_index_url_title", "WS-INDEX-URL-TITLE", 1, 2, false);
        declareFunction(me, "ws_index_pathname_for_url", "WS-INDEX-PATHNAME-FOR-URL", 1, 2, false);
        declareFunction(me, "ws_index_search_for_pathnames", "WS-INDEX-SEARCH-FOR-PATHNAMES", 1, 2, false);
        declareFunction(me, "ws_index_shutdown", "WS-INDEX-SHUTDOWN", 0, 3, false);
        declareFunction(me, "ws_index_count", "WS-INDEX-COUNT", 1, 2, false);
        declareFunction(me, "url_index_server_aliveP", "URL-INDEX-SERVER-ALIVE?", 0, 3, false);
        declareFunction(me, "url_index_search", "URL-INDEX-SEARCH", 1, 2, false);
        declareFunction(me, "url_index_shutdown", "URL-INDEX-SHUTDOWN", 0, 3, false);
        declareFunction(me, "ebmt_index_server_aliveP", "EBMT-INDEX-SERVER-ALIVE?", 0, 3, false);
        declareFunction(me, "ebmt_index_add_template", "EBMT-INDEX-ADD-TEMPLATE", 1, 2, false);
        declareFunction(me, "ebmt_template_from_raw_template", "EBMT-TEMPLATE-FROM-RAW-TEMPLATE", 1, 0, false);
        declareFunction(me, "ebmt_index_find_templates", "EBMT-INDEX-FIND-TEMPLATES", 1, 2, false);
        declareFunction(me, "ebmt_index_delete_template", "EBMT-INDEX-DELETE-TEMPLATE", 1, 2, false);
        declareFunction(me, "ebmt_index_add_indices", "EBMT-INDEX-ADD-INDICES", 1, 2, false);
        declareFunction(me, "ebmt_index_shutdown", "EBMT-INDEX-SHUTDOWN", 0, 3, false);
        declareFunction(me, "ql_index_server_aliveP", "QL-INDEX-SERVER-ALIVE?", 0, 3, false);
        declareFunction(me, "ql_index_add_queries", "QL-INDEX-ADD-QUERIES", 1, 2, false);
        declareFunction(me, "ql_index_add_query", "QL-INDEX-ADD-QUERY", 1, 2, false);
        declareFunction(me, "ql_index_add_query_xml", "QL-INDEX-ADD-QUERY-XML", 1, 0, false);
        declareFunction(me, "ql_index_build_from_file", "QL-INDEX-BUILD-FROM-FILE", 1, 2, false);
        declareFunction(me, "ql_index_find_queries", "QL-INDEX-FIND-QUERIES", 2, 2, false);
        declareFunction(me, "ql_index_server_shutdown", "QL-INDEX-SERVER-SHUTDOWN", 0, 3, false);
        declareFunction(me, "replace_problematic_chars", "REPLACE-PROBLEMATIC-CHARS", 1, 0, false);
        declareFunction(me, "lucene_symbolic_query_to_string", "LUCENE-SYMBOLIC-QUERY-TO-STRING", 1, 0, false);
        declareFunction(me, "interpret_one_symbolic_query_element", "INTERPRET-ONE-SYMBOLIC-QUERY-ELEMENT", 1, 0, false);
        declareFunction(me, "interpret_nat_symbolic_query_element", "INTERPRET-NAT-SYMBOLIC-QUERY-ELEMENT", 1, 0, false);
        declareFunction(me, "construct_symbolic_terminus_ante_quem_query", "CONSTRUCT-SYMBOLIC-TERMINUS-ANTE-QUEM-QUERY", 1, 0, false);
        declareFunction(me, "construct_symbolic_terminus_post_quem_query", "CONSTRUCT-SYMBOLIC-TERMINUS-POST-QUEM-QUERY", 1, 0, false);
        declareFunction(me, "lucene_symbolic_terminus_ante_quem_query", "LUCENE-SYMBOLIC-TERMINUS-ANTE-QUEM-QUERY", 1, 0, false);
        declareFunction(me, "lucene_symbolic_terminus_post_quem_query", "LUCENE-SYMBOLIC-TERMINUS-POST-QUEM-QUERY", 1, 0, false);
        declareFunction(me, "ebmt_create_index_for_release", "EBMT-CREATE-INDEX-FOR-RELEASE", 0, 4, false);
        return NIL;
    }

    public static SubLObject init_lucene_index_file() {
        defparameter("*WS-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list2.isSymbol() ? symbol_value($list2) : $list2, $ws_index_host$, $str4$webstore_cyc_com.isSymbol() ? symbol_value($str4$webstore_cyc_com) : $str4$webstore_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*WS-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list6.isSymbol() ? symbol_value($list6) : $list6, $ws_index_port$, $int$7777.isSymbol() ? symbol_value($int$7777) : $int$7777, $PARAMETER, UNPROVIDED));
        defparameter("*URL-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list11.isSymbol() ? symbol_value($list11) : $list11, $url_index_host$, $str13$urlindex_cyc_com.isSymbol() ? symbol_value($str13$urlindex_cyc_com) : $str13$urlindex_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*URL-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list14.isSymbol() ? symbol_value($list14) : $list14, $url_index_port$, $int$7778.isSymbol() ? symbol_value($int$7778) : $int$7778, $PARAMETER, UNPROVIDED));
        defparameter("*EBMT-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list17.isSymbol() ? symbol_value($list17) : $list17, $ebmt_index_host$, $str19$ebmtindex_cyc_com.isSymbol() ? symbol_value($str19$ebmtindex_cyc_com) : $str19$ebmtindex_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*EBMT-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list20.isSymbol() ? symbol_value($list20) : $list20, $ebmt_index_port$, $int$7779.isSymbol() ? symbol_value($int$7779) : $int$7779, $PARAMETER, UNPROVIDED));
        defparameter("*EBMT-INDEX-CONTENT*", red_infrastructure_macros.red_def_helper($list23.isSymbol() ? symbol_value($list23) : $list23, $ebmt_index_content$, $str25$_cyc_departments_nl_corpora_ebmt_.isSymbol() ? symbol_value($str25$_cyc_departments_nl_corpora_ebmt_) : $str25$_cyc_departments_nl_corpora_ebmt_, $PARAMETER, UNPROVIDED));
        defparameter("*EBMT-INDEX-LOG*", red_infrastructure_macros.red_def_helper($list26.isSymbol() ? symbol_value($list26) : $list26, $ebmt_index_log$, $str28$_cyc_departments_nl_corpora_ebmt_.isSymbol() ? symbol_value($str28$_cyc_departments_nl_corpora_ebmt_) : $str28$_cyc_departments_nl_corpora_ebmt_, $PARAMETER, UNPROVIDED));
        defparameter("*QL-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list29.isSymbol() ? symbol_value($list29) : $list29, $ql_index_host$, $str31$elmore_cyc_com.isSymbol() ? symbol_value($str31$elmore_cyc_com) : $str31$elmore_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*QL-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list32.isSymbol() ? symbol_value($list32) : $list32, $ql_index_port$, $int$7781.isSymbol() ? symbol_value($int$7781) : $int$7781, $PARAMETER, UNPROVIDED));
        defparameter("*QL-INDEX-ROOT-DIR-NAMES*", red_infrastructure_macros.red_def_helper($list35.isSymbol() ? symbol_value($list35) : $list35, $ql_index_root_dir_names$, $str37$data_ir_indexes_ql.isSymbol() ? symbol_value($str37$data_ir_indexes_ql) : $str37$data_ir_indexes_ql, $PARAMETER, UNPROVIDED));
        defparameter("*QL-INDEX-LOG*", red_infrastructure_macros.red_def_helper($list38.isSymbol() ? symbol_value($list38) : $list38, $ql_index_log$, $str40$data_ir_indexes_ql_ql_index_log.isSymbol() ? symbol_value($str40$data_ir_indexes_ql_ql_index_log) : $str40$data_ir_indexes_ql_ql_index_log, $PARAMETER, UNPROVIDED));
        defconstant("*QL-INDEX-SC-ADDED*", $$$Added);
        defconstant("*QL-INDEX-SC-NOT-ADDED*", $$$NotAdded);
        defconstant("*QL-INDEX-SC-BUILT*", $$$Built);
        defconstant("*QL-INDEX-SC-NOT-BUILT*", $$$NotBuilt);
        defconstant("*QL-INDEX-SC-QUERY*", $$$query);
        defconstant("*QL-INDEX-SC-FORM*", $$$form);
        defconstant("*QL-INDEX-SC-CYCL*", $$$cycl);
        defconstant("*QL-INDEX-SC-KB*", $$$kb);
        defconstant("*QL-INDEX-SC-PROCESS*", $$$process);
        defconstant("*QL-INDEX-SC-HOST*", $$$host);
        defconstant("*QL-INDEX-SC-USER*", $$$user);
        defconstant("*QL-INDEX-SC-TIME*", $$$time);
        defconstant("*QL-INDEX-SC-TYPE*", $$$type);
        defconstant("*QL-INDEX-SC-ID*", $$$id);
        defconstant("*QL-INDEX-SC-GLOSS*", $$$gloss);
        defconstant("*QL-INDEX-SC-GENERATION*", $$$generation);
        defconstant("*QL-INDEX-SC-BUILD*", $$$build);
        defconstant("*QL-INDEX-SC-ADD*", $$$add);
        defconstant("*QL-INDEX-SC-ADD-N*", $str90$add_n);
        defconstant("*QL-INDEX-SC-FIND*", $$$find);
        defconstant("*QL-INDEX-SC-QUIT*", $str63$_quit_);
        defconstant("*QL-INDEX-SC-SEARCH-STRING*", $str91$search_string);
        defconstant("*QL-INDEX-SC-QUERY-INDEX-FORMS*", $str92$query_index_forms);
        defparameter("*LUCENE-QUERY-STRING-STACK*", NIL);
        defparameter("*LUCENE-SYMBOLIC-QUERY-TRANSLATE-DATES*", T);
        return NIL;
    }

    public static SubLObject setup_lucene_index_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lucene_index_file();
    }

    @Override
    public void initializeVariables() {
        init_lucene_index_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lucene_index_file();
    }

    
}

/**
 * Total time: 566 ms
 */
