/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.obsolete.booleanP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.finish_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LUCENE-INDEX
 * source file: /cyc/top/cycl/lucene-index.lisp
 * created:     2019/07/03 17:38:58
 */
public final class lucene_index extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt45$ = makeString("");

    public static final SubLFile me = new lucene_index();

 public static final String myName = "com.cyc.cycjava.cycl.lucene_index";


    // defconstant
    // The string constant Added
    /**
     * The string constant Added
     */
    @LispMethod(comment = "The string constant Added\ndefconstant")
    public static final SubLSymbol $ql_index_sc_added$ = makeSymbol("*QL-INDEX-SC-ADDED*");

    // defconstant
    // The string constant NotAdded
    /**
     * The string constant NotAdded
     */
    @LispMethod(comment = "The string constant NotAdded\ndefconstant")
    public static final SubLSymbol $ql_index_sc_not_added$ = makeSymbol("*QL-INDEX-SC-NOT-ADDED*");

    // defconstant
    // The string constant Built
    /**
     * The string constant Built
     */
    @LispMethod(comment = "The string constant Built\ndefconstant")
    public static final SubLSymbol $ql_index_sc_built$ = makeSymbol("*QL-INDEX-SC-BUILT*");

    // defconstant
    // The string constant NotBuilt
    /**
     * The string constant NotBuilt
     */
    @LispMethod(comment = "The string constant NotBuilt\ndefconstant")
    public static final SubLSymbol $ql_index_sc_not_built$ = makeSymbol("*QL-INDEX-SC-NOT-BUILT*");

    // defconstant
    // The string constant query
    /**
     * The string constant query
     */
    @LispMethod(comment = "The string constant query\ndefconstant")
    public static final SubLSymbol $ql_index_sc_query$ = makeSymbol("*QL-INDEX-SC-QUERY*");

    // defconstant
    // The string constant query
    /**
     * The string constant query
     */
    @LispMethod(comment = "The string constant query\ndefconstant")
    public static final SubLSymbol $ql_index_sc_form$ = makeSymbol("*QL-INDEX-SC-FORM*");

    // defconstant
    // The string constant cycl
    /**
     * The string constant cycl
     */
    @LispMethod(comment = "The string constant cycl\ndefconstant")
    public static final SubLSymbol $ql_index_sc_cycl$ = makeSymbol("*QL-INDEX-SC-CYCL*");

    // defconstant
    // The string constant kb
    /**
     * The string constant kb
     */
    @LispMethod(comment = "The string constant kb\ndefconstant")
    public static final SubLSymbol $ql_index_sc_kb$ = makeSymbol("*QL-INDEX-SC-KB*");

    // defconstant
    // The string constant process
    /**
     * The string constant process
     */
    @LispMethod(comment = "The string constant process\ndefconstant")
    public static final SubLSymbol $ql_index_sc_process$ = makeSymbol("*QL-INDEX-SC-PROCESS*");

    // defconstant
    // The string constant host
    /**
     * The string constant host
     */
    @LispMethod(comment = "The string constant host\ndefconstant")
    public static final SubLSymbol $ql_index_sc_host$ = makeSymbol("*QL-INDEX-SC-HOST*");

    // defconstant
    // The string constant user
    /**
     * The string constant user
     */
    @LispMethod(comment = "The string constant user\ndefconstant")
    public static final SubLSymbol $ql_index_sc_user$ = makeSymbol("*QL-INDEX-SC-USER*");

    // defconstant
    // The string constant time
    /**
     * The string constant time
     */
    @LispMethod(comment = "The string constant time\ndefconstant")
    public static final SubLSymbol $ql_index_sc_time$ = makeSymbol("*QL-INDEX-SC-TIME*");

    // defconstant
    // The string constant type
    /**
     * The string constant type
     */
    @LispMethod(comment = "The string constant type\ndefconstant")
    public static final SubLSymbol $ql_index_sc_type$ = makeSymbol("*QL-INDEX-SC-TYPE*");

    // defconstant
    // The string constant id
    /**
     * The string constant id
     */
    @LispMethod(comment = "The string constant id\ndefconstant")
    public static final SubLSymbol $ql_index_sc_id$ = makeSymbol("*QL-INDEX-SC-ID*");

    // defconstant
    // The string constant gloss
    /**
     * The string constant gloss
     */
    @LispMethod(comment = "The string constant gloss\ndefconstant")
    public static final SubLSymbol $ql_index_sc_gloss$ = makeSymbol("*QL-INDEX-SC-GLOSS*");

    // defconstant
    // The string constant generation
    /**
     * The string constant generation
     */
    @LispMethod(comment = "The string constant generation\ndefconstant")
    public static final SubLSymbol $ql_index_sc_generation$ = makeSymbol("*QL-INDEX-SC-GENERATION*");

    // defconstant
    // The string constant build
    /**
     * The string constant build
     */
    @LispMethod(comment = "The string constant build\ndefconstant")
    public static final SubLSymbol $ql_index_sc_build$ = makeSymbol("*QL-INDEX-SC-BUILD*");

    // defconstant
    // The string constant add
    /**
     * The string constant add
     */
    @LispMethod(comment = "The string constant add\ndefconstant")
    public static final SubLSymbol $ql_index_sc_add$ = makeSymbol("*QL-INDEX-SC-ADD*");

    // defconstant
    // The string constant add-n
    /**
     * The string constant add-n
     */
    @LispMethod(comment = "The string constant add-n\ndefconstant")
    public static final SubLSymbol $ql_index_sc_add_n$ = makeSymbol("*QL-INDEX-SC-ADD-N*");

    // defconstant
    // The string constant find
    /**
     * The string constant find
     */
    @LispMethod(comment = "The string constant find\ndefconstant")
    public static final SubLSymbol $ql_index_sc_find$ = makeSymbol("*QL-INDEX-SC-FIND*");

    // defconstant
    // The string constant $quit$
    /**
     * The string constant $quit$
     */
    @LispMethod(comment = "The string constant $quit$\ndefconstant")
    public static final SubLSymbol $ql_index_sc_quit$ = makeSymbol("*QL-INDEX-SC-QUIT*");

    // defconstant
    // The string constant search_string
    /**
     * The string constant search_string
     */
    @LispMethod(comment = "The string constant search_string\ndefconstant")
    public static final SubLSymbol $ql_index_sc_search_string$ = makeSymbol("*QL-INDEX-SC-SEARCH-STRING*");

    // defconstant
    // The string constant query_index_forms
    /**
     * The string constant query_index_forms
     */
    @LispMethod(comment = "The string constant query_index_forms\ndefconstant")
    public static final SubLSymbol $ql_index_sc_query_index_forms$ = makeSymbol("*QL-INDEX-SC-QUERY-INDEX-FORMS*");

    // defparameter
    /**
     * The query recursively builds up the sub pieces here and concatenates them up
     * in the end.
     */
    @LispMethod(comment = "The query recursively builds up the sub pieces here and concatenates them up\r\nin the end.\ndefparameter\nThe query recursively builds up the sub pieces here and concatenates them up\nin the end.")
    private static final SubLSymbol $lucene_query_string_stack$ = makeSymbol("*LUCENE-QUERY-STRING-STACK*");

    // defparameter
    /**
     * By default, take date expressions and translate them into date range queries.
     */
    @LispMethod(comment = "By default, take date expressions and translate them into date range queries.\ndefparameter")
    public static final SubLSymbol $lucene_symbolic_query_translate_dates$ = makeSymbol("*LUCENE-SYMBOLIC-QUERY-TRANSLATE-DATES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$query = makeString("query");

    static private final SubLString $$$type = makeString("type");

    static private final SubLList $list2 = list(makeString("application.cyc-ir.lucene.ws.host"));

    public static final SubLSymbol $ws_index_host$ = makeSymbol("*WS-INDEX-HOST*");

    static private final SubLString $str4$webstore_cyc_com = makeString("webstore.cyc.com");

    static private final SubLList $list6 = list(makeString("application.cyc-ir.lucene.ws.port"));

    public static final SubLSymbol $ws_index_port$ = makeSymbol("*WS-INDEX-PORT*");

    private static final SubLInteger $int$7777 = makeInteger(7777);

    static private final SubLList $list9 = list(list(makeSymbol("HOST"), makeSymbol("&OPTIONAL"), list(makeSymbol("PORT"), makeSymbol("*WS-INDEX-PORT*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list11 = list(makeString("application.cyc-ir.lucene.url.host"));

    public static final SubLSymbol $url_index_host$ = makeSymbol("*URL-INDEX-HOST*");

    static private final SubLString $str13$urlindex_cyc_com = makeString("urlindex.cyc.com");

    static private final SubLList $list14 = list(makeString("application.cyc-ir.lucene.url.port"));

    public static final SubLSymbol $url_index_port$ = makeSymbol("*URL-INDEX-PORT*");

    private static final SubLInteger $int$7778 = makeInteger(7778);

    static private final SubLList $list17 = list(makeString("application.cyc-ir.lucene.ebmt.host"));

    public static final SubLSymbol $ebmt_index_host$ = makeSymbol("*EBMT-INDEX-HOST*");

    static private final SubLString $str19$ebmtindex_cyc_com = makeString("ebmtindex.cyc.com");

    static private final SubLList $list20 = list(makeString("application.cyc-ir.lucene.ebmt.port"));

    public static final SubLSymbol $ebmt_index_port$ = makeSymbol("*EBMT-INDEX-PORT*");

    private static final SubLInteger $int$7779 = makeInteger(7779);

    static private final SubLList $list23 = list(makeString("application.cyc-ir.lucene.ebmt.content"));

    public static final SubLSymbol $ebmt_index_content$ = makeSymbol("*EBMT-INDEX-CONTENT*");

    static private final SubLString $str25$_cyc_departments_nl_corpora_ebmt_ = makeString("/cyc/departments/nl/corpora/ebmt-index.txt");

    static private final SubLList $list26 = list(makeString("application.cyc-ir.lucene.ebmt.log"));

    public static final SubLSymbol $ebmt_index_log$ = makeSymbol("*EBMT-INDEX-LOG*");

    static private final SubLString $str28$_cyc_departments_nl_corpora_ebmt_ = makeString("/cyc/departments/nl/corpora/ebmt-index.log");

    static private final SubLList $list29 = list(makeString("application.cyc-ir.lucene.ql-index.host"));

    public static final SubLSymbol $ql_index_host$ = makeSymbol("*QL-INDEX-HOST*");

    static private final SubLString $str31$elmore_cyc_com = makeString("elmore.cyc.com");

    static private final SubLList $list32 = list(makeString("application.cyc-ir.lucene.ql-index.port"));

    public static final SubLSymbol $ql_index_port$ = makeSymbol("*QL-INDEX-PORT*");

    private static final SubLInteger $int$7781 = makeInteger(7781);

    static private final SubLList $list35 = list(makeString("application.cyc-ir.lucene.ql-index.root-dir-names"));

    public static final SubLSymbol $ql_index_root_dir_names$ = makeSymbol("*QL-INDEX-ROOT-DIR-NAMES*");

    static private final SubLString $str37$data_ir_indexes_ql = makeString("data|ir|indexes|ql");

    static private final SubLList $list38 = list(makeString("application.cyc-ir.lucene.ql-index.log"));

    public static final SubLSymbol $ql_index_log$ = makeSymbol("*QL-INDEX-LOG*");

    static private final SubLString $str40$data_ir_indexes_ql_ql_index_log = makeString("data/ir/indexes/ql/ql-index.log");

    static private final SubLString $str43$___lucene_index_query__s__s__s___ = makeString("~%(lucene-index-query ~s ~s ~s) : ~s");

    static private final SubLString $$$version = makeString("version");

    static private final SubLString $str45$ = makeString("");

    static private final SubLString $str46$Lucene_Index_Server_listening_at_ = makeString("Lucene Index Server listening at port ~A on ~A~%");

    static private final SubLString $str47$Lucene_Index_Server_NOT_listening = makeString("Lucene Index Server NOT listening at port ~A on ~A~%");

    static private final SubLString $$$AddIndices = makeString("AddIndices");

    static private final SubLString $str49$__ = makeString(" +");

    static private final SubLString $str50$__ = makeString(" -");

    static private final SubLString $str51$__ = makeString(" ~");

    static private final SubLString $$$_ = makeString(" ");

    static private final SubLString $$$StringURLs = makeString("StringURLs");

    static private final SubLString $str55$Web_store_Index_Server_not_listen = makeString("Web-store Index Server not listening at port ~A on ~A");

    static private final SubLString $$$StringURLsAndSnippets = makeString("StringURLsAndSnippets");

    static private final SubLString $str57$StringURLsTitlesAndSnippets__A__A = makeString("StringURLsTitlesAndSnippets-~A-~A");

    static private final SubLString $$$URLContent = makeString("URLContent");

    static private final SubLString $$$URLText = makeString("URLText");

    static private final SubLString $$$URLTitle = makeString("URLTitle");

    static private final SubLString $$$URLFile = makeString("URLFile");

    static private final SubLString $$$StringFiles = makeString("StringFiles");

    static private final SubLString $str63$_quit_ = makeString("$quit$");

    static private final SubLString $str64$Successfully_shutdown_Web_store_I = makeString("Successfully shutdown Web-store Index Server at port ~A on ~A~%");

    static private final SubLString $$$CountContents = makeString("CountContents");

    static private final SubLString $$$URLIndex = makeString("URLIndex");

    static private final SubLString $str67$URL_Index_Server_not_listening_at = makeString("URL Index Server not listening at port ~A on ~A");

    static private final SubLString $str68$Successfully_shutdown_URL_Index_S = makeString("Successfully shutdown URL Index Server at port ~A on ~A~%");

    static private final SubLString $$$add = makeString("add");

    static private final SubLString $str70$EBMT_Template_Index_Server_not_li = makeString("EBMT Template Index Server not listening at port ~A on ~A");

    static private final SubLString $$$find = makeString("find");

    private static final SubLSymbol EBMT_TEMPLATE_FROM_RAW_TEMPLATE = makeSymbol("EBMT-TEMPLATE-FROM-RAW-TEMPLATE");

    static private final SubLString $$$delete = makeString("delete");

    static private final SubLString $str74$Successfully_shutdown_EBMT_Templa = makeString("Successfully shutdown EBMT Template Index Server at port ~A on ~A~%");

    static private final SubLString $$$Added = makeString("Added");

    static private final SubLString $$$NotAdded = makeString("NotAdded");

    static private final SubLString $$$Built = makeString("Built");

    static private final SubLString $$$NotBuilt = makeString("NotBuilt");

    static private final SubLString $$$form = makeString("form");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLString $$$kb = makeString("kb");

    static private final SubLString $$$process = makeString("process");

    static private final SubLString $$$host = makeString("host");

    static private final SubLString $$$user = makeString("user");

    static private final SubLString $$$time = makeString("time");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $$$gloss = makeString("gloss");

    static private final SubLString $$$generation = makeString("generation");

    static private final SubLString $$$build = makeString("build");

    static private final SubLString $str90$add_n = makeString("add-n");

    static private final SubLString $str91$search_string = makeString("search_string");

    static private final SubLString $str92$query_index_forms = makeString("query_index_forms");

    private static final SubLSymbol NON_EMPTY_STRING_P = makeSymbol("NON-EMPTY-STRING-P");

    static private final SubLSymbol $sym95$BOOLEAN_ = makeSymbol("BOOLEAN?");

    static private final SubLString $str96$QL_Index_Server_not_listening_at_ = makeString("QL Index Server not listening at port ~A on ~A");

    private static final SubLSymbol $FAILED_TO_CONNECT = makeKeyword("FAILED-TO-CONNECT");

    private static final SubLSymbol $FAILED_TO_SHUTDOWN = makeKeyword("FAILED-TO-SHUTDOWN");

    static private final SubLString $str109$Successfully_shutdown_QL_Index_Se = makeString("Successfully shutdown QL Index Server at port ~A on ~A~%");

    private static final SubLSymbol CONTROL_CHAR_P = makeSymbol("CONTROL-CHAR-P");

    static private final SubLString $$$true = makeString("true");

    static private final SubLString $$$_AND_ = makeString(" AND ");

    static private final SubLString $$$_OR_ = makeString(" OR ");

    static private final SubLString $str119$_ = makeString("\"");

    static private final SubLString $str121$_ = makeString("+");

    static private final SubLString $str123$_ = makeString("~");

    static private final SubLString $str124$___ = makeString(" : ");

    static private final SubLString $str126$_ = makeString("[");

    static private final SubLString $$$_TO_ = makeString(" TO ");

    static private final SubLString $str128$_ = makeString("]");

    static private final SubLString $str129$Unknown_operator__A__dont_know_ho = makeString("Unknown operator ~A: dont know how to interpret.~%");

    static private final SubLString $$$YYYYMMDD = makeString("YYYYMMDD");

    static private final SubLString $$$date = makeString("date");

    static private final SubLString $str132$_home_shah_cvs_head_cycorp_cyc_ja = makeString("/home/shah/cvs/head/cycorp/cyc/java/com/cyc/common/cyc-common.jar:/cyc/java/lib/xercesImpl-2.2.1.jar:/cyc/java/lib/lucene-core-1.9.1.jar");

    private static final SubLInteger $int$8002 = makeInteger(8002);



    static private final SubLString $str137$_opt_local_pkg_j2sdk1_4_2_bin_jav = makeString("/opt/local/pkg/j2sdk1.4.2/bin/java");

    static private final SubLString $str138$_cp = makeString("-cp");

    static private final SubLString $str139$com_cyc_common_nlp_EBMTTemplateIn = makeString("com.cyc.common.nlp.EBMTTemplateIndexServer");

    static private final SubLString $str140$_i = makeString("-i");

    static private final SubLString $str141$_cyc_top_data_ebmt_release_ = makeString("/cyc/top/data/ebmt/release/");

    static private final SubLString $str142$_ebmt_index_ = makeString("/ebmt-index/");

    static private final SubLString $str143$_p = makeString("-p");

    static private final SubLString $str144$_ebmt_index_txt = makeString("/ebmt-index.txt");

    static private final SubLString $str145$_ebmt_index_log = makeString("/ebmt-index.log");

    static private final SubLString $$$EBMT_Template_Index_Server = makeString("EBMT Template Index Server");

    static private final SubLString $$$localhost = makeString("localhost");

    static private final SubLString $str148$No_templates_added_to_EBMT_Templa = makeString("No templates added to EBMT Template Index for external release.");

    // Definitions
    /**
     * Returns the XML format of the query that is understood by the Web-store Index
     * Server.
     *
     * @param QUERY-TYPE
     * 		stringp; e.g "StringURLs"
     * @param QUERY
     * 		stringp; search-string e.g. ""Hello World""
     * @unknown stringp; a string encoding of the reply sent by the Web-store Index
    Server.
     */
    @LispMethod(comment = "Returns the XML format of the query that is understood by the Web-store Index\r\nServer.\r\n\r\n@param QUERY-TYPE\r\n\t\tstringp; e.g \"StringURLs\"\r\n@param QUERY\r\n\t\tstringp; search-string e.g. \"\"Hello World\"\"\r\n@unknown stringp; a string encoding of the reply sent by the Web-store Index\r\nServer.\nReturns the XML format of the query that is understood by the Web-store Index\nServer.")
    public static final SubLObject lucene_index_query_xml_alt(SubLObject query_type, SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_xml = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream, thread);
                            xml_utilities.xml_start_tag_internal($$$query, list($$$type, query_type), NIL);
                            xml_utilities.xml_write(query, UNPROVIDED);
                            xml_utilities.xml_end_tag_internal($$$query);
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    query_xml = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return query_xml;
            }
        }
    }

    // Definitions
    /**
     * Returns the XML format of the query that is understood by the Web-store Index
     * Server.
     *
     * @param QUERY-TYPE
     * 		stringp; e.g "StringURLs"
     * @param QUERY
     * 		stringp; search-string e.g. ""Hello World""
     * @unknown stringp; a string encoding of the reply sent by the Web-store Index
    Server.
     */
    @LispMethod(comment = "Returns the XML format of the query that is understood by the Web-store Index\r\nServer.\r\n\r\n@param QUERY-TYPE\r\n\t\tstringp; e.g \"StringURLs\"\r\n@param QUERY\r\n\t\tstringp; search-string e.g. \"\"Hello World\"\"\r\n@unknown stringp; a string encoding of the reply sent by the Web-store Index\r\nServer.\nReturns the XML format of the query that is understood by the Web-store Index\nServer.")
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

    public static final SubLObject with_ws_index_server_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt9);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject host = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt9);
                        host = current.first();
                        current = current.rest();
                        {
                            SubLObject port = (current.isCons()) ? ((SubLObject) (current.first())) : $ws_index_port$.getDynamicValue(thread);
                            destructuring_bind_must_listp(current, datum, $list_alt9);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    return listS(CLET, list(list($ws_index_host$, host), list($ws_index_port$, port)), append(body, NIL));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt9);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject get_ql_index_host_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $ql_index_host$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_ql_index_host() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ql_index_host$.getDynamicValue(thread);
    }

    public static final SubLObject set_ql_index_host_alt(SubLObject hostname) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $ql_index_host$.setDynamicValue(hostname, thread);
            return $ql_index_host$.getDynamicValue(thread);
        }
    }

    public static SubLObject set_ql_index_host(final SubLObject hostname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $ql_index_host$.setDynamicValue(hostname, thread);
        return $ql_index_host$.getDynamicValue(thread);
    }

    public static final SubLObject get_ql_index_port_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $ql_index_port$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_ql_index_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ql_index_port$.getDynamicValue(thread);
    }

    public static final SubLObject set_ql_index_port_alt(SubLObject v_int) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $ql_index_port$.setDynamicValue(v_int, thread);
            return $ql_index_port$.getDynamicValue(thread);
        }
    }

    public static SubLObject set_ql_index_port(final SubLObject v_int) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $ql_index_port$.setDynamicValue(v_int, thread);
        return $ql_index_port$.getDynamicValue(thread);
    }

    public static final SubLObject get_ql_index_root_dir_names_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $ql_index_root_dir_names$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_ql_index_root_dir_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ql_index_root_dir_names$.getDynamicValue(thread);
    }

    public static final SubLObject set_ql_index_root_dir_names_alt(SubLObject names_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $ql_index_root_dir_names$.setDynamicValue(names_string, thread);
            return $ql_index_root_dir_names$.getDynamicValue(thread);
        }
    }

    public static SubLObject set_ql_index_root_dir_names(final SubLObject names_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $ql_index_root_dir_names$.setDynamicValue(names_string, thread);
        return $ql_index_root_dir_names$.getDynamicValue(thread);
    }

    public static final SubLObject get_ql_index_log_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $ql_index_log$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_ql_index_log() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ql_index_log$.getDynamicValue(thread);
    }

    public static final SubLObject set_ql_index_log_alt(SubLObject pathname) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $ql_index_log$.setDynamicValue(pathname, thread);
            return $ql_index_log$.getDynamicValue(thread);
        }
    }

    public static SubLObject set_ql_index_log(final SubLObject pathname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $ql_index_log$.setDynamicValue(pathname, thread);
        return $ql_index_log$.getDynamicValue(thread);
    }

    /**
     * Queries the Web-store Index Server listening on port PORT of HOST and returns
     * the reply (if any) received from the Server.
     */
    @LispMethod(comment = "Queries the Web-store Index Server listening on port PORT of HOST and returns\r\nthe reply (if any) received from the Server.\nQueries the Web-store Index Server listening on port PORT of HOST and returns\nthe reply (if any) received from the Server.")
    public static final SubLObject lucene_index_query_alt(SubLObject string, SubLObject host, SubLObject port) {
        {
            SubLObject result = NIL;
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = subl_promotions.open_tcp_stream_with_timeout(host, port, NIL, $PUBLIC);
                                    if (NIL != stream) {
                                        princ(string, stream);
                                        terpri(stream);
                                        finish_output(stream);
                                        result = read_line(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_1 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (NIL != stream) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_1);
                                        }
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
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error) {
                format(T, $str_alt43$___lucene_index_query__s__s__s___, new SubLObject[]{ string, host, port, error });
            }
            return result;
        }
    }

    /**
     * Queries the Web-store Index Server listening on port PORT of HOST and returns
     * the reply (if any) received from the Server.
     */
    @LispMethod(comment = "Queries the Web-store Index Server listening on port PORT of HOST and returns\r\nthe reply (if any) received from the Server.\nQueries the Web-store Index Server listening on port PORT of HOST and returns\nthe reply (if any) received from the Server.")
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

    /**
     * Returns the CVS Id of the file WebStoreIndexServer.java.
     */
    @LispMethod(comment = "Returns the CVS Id of the file WebStoreIndexServer.java.")
    public static final SubLObject lucene_index_server_version_alt(SubLObject host, SubLObject port) {
        {
            SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$version, $str_alt45$);
            return com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
        }
    }

    /**
     * Returns the CVS Id of the file WebStoreIndexServer.java.
     */
    @LispMethod(comment = "Returns the CVS Id of the file WebStoreIndexServer.java.")
    public static SubLObject lucene_index_server_version(final SubLObject host, final SubLObject port) {
        final SubLObject query_xml = lucene_index_query_xml($$$version, $str45$);
        return lucene_index_query(query_xml, host, port);
    }

    /**
     * Returns T if the Lucene Index Server is up and listening at port PORT of
     * HOST; NIL otherwise.
     */
    @LispMethod(comment = "Returns T if the Lucene Index Server is up and listening at port PORT of\r\nHOST; NIL otherwise.\nReturns T if the Lucene Index Server is up and listening at port PORT of\nHOST; NIL otherwise.")
    public static final SubLObject lucene_index_server_aliveP_alt(SubLObject host, SubLObject port, SubLObject verbose) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject status = NIL;
                SubLObject output = NIL;
                SubLObject s = NIL;
                try {
                    s = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
                        try {
                            StreamsLow.$standard_output$.bind(s, thread);
                            if (NIL != com.cyc.cycjava.cycl.lucene_index.lucene_index_server_version(host, port)) {
                                status = T;
                            }
                        } finally {
                            StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
                        }
                    }
                    output = get_output_stream_string(s);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(s, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != verbose) {
                    if (NIL != status) {
                        format(T, $str_alt46$Lucene_Index_Server_listening_at_, port, host);
                    } else {
                        format(T, $str_alt47$Lucene_Index_Server_NOT_listening, port, host);
                    }
                }
                return status;
            }
        }
    }

    /**
     * Returns T if the Lucene Index Server is up and listening at port PORT of
     * HOST; NIL otherwise.
     */
    @LispMethod(comment = "Returns T if the Lucene Index Server is up and listening at port PORT of\r\nHOST; NIL otherwise.\nReturns T if the Lucene Index Server is up and listening at port PORT of\nHOST; NIL otherwise.")
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

    public static final SubLObject lucene_index_add_indices_alt(SubLObject host, SubLObject port, SubLObject indices) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject indices_string = NIL;
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        indices_string = string_utilities.strip_first(format_nil.format_nil_s(indices));
                        indices_string = string_utilities.strip_final(indices_string, UNPROVIDED);
                    } finally {
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$AddIndices, indices_string);
                    return com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
                }
            }
        }
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

    public static final SubLObject ws_build_search_string_alt(SubLObject includes, SubLObject excludes, SubLObject likes, SubLObject old_search_string) {
        if (old_search_string == UNPROVIDED) {
            old_search_string = NIL;
        }
        {
            SubLObject pieces = NIL;
            {
                SubLObject cdolist_list_var = includes;
                SubLObject include = NIL;
                for (include = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , include = cdolist_list_var.first()) {
                    pieces = cons($str_alt49$__, pieces);
                    pieces = cons(include, pieces);
                }
            }
            {
                SubLObject cdolist_list_var = excludes;
                SubLObject exclude = NIL;
                for (exclude = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , exclude = cdolist_list_var.first()) {
                    pieces = cons($str_alt50$__, pieces);
                    pieces = cons(exclude, pieces);
                }
            }
            {
                SubLObject cdolist_list_var = likes;
                SubLObject like = NIL;
                for (like = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , like = cdolist_list_var.first()) {
                    pieces = cons($str_alt51$__, pieces);
                    pieces = cons(like, pieces);
                }
            }
            if (NIL != old_search_string) {
                pieces = cons($str_alt52$_, pieces);
                pieces = cons(old_search_string, pieces);
            }
            return string_utilities.reduce_whitespace(apply(symbol_function(CCONCATENATE), nreverse(pieces)));
        }
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

    public static final SubLObject get_ws_index_host_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $ws_index_host$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_ws_index_host() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ws_index_host$.getDynamicValue(thread);
    }

    public static final SubLObject get_ws_index_port_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $ws_index_port$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_ws_index_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ws_index_port$.getDynamicValue(thread);
    }

    /**
     * Returns T if the Web-store Index Server is up and listening at port PORT of
     * HOST; NIL otherwise.
     */
    @LispMethod(comment = "Returns T if the Web-store Index Server is up and listening at port PORT of\r\nHOST; NIL otherwise.\nReturns T if the Web-store Index Server is up and listening at port PORT of\nHOST; NIL otherwise.")
    public static final SubLObject ws_index_server_aliveP_alt(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        return com.cyc.cycjava.cycl.lucene_index.lucene_index_server_aliveP(host, port, verbose);
    }

    /**
     * Returns T if the Web-store Index Server is up and listening at port PORT of
     * HOST; NIL otherwise.
     */
    @LispMethod(comment = "Returns T if the Web-store Index Server is up and listening at port PORT of\r\nHOST; NIL otherwise.\nReturns T if the Web-store Index Server is up and listening at port PORT of\nHOST; NIL otherwise.")
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

    /**
     * Returns a list of URL strings that represent pages in the Web-store that
     * contain search-terms in SEARCH-STRING.
     *
     * @param SEARCH-STRING
     * 		stringp;  e.g. ""Hello World""
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return listp; list of strings e.g. ("http://ifso.ie/news_2004.html")
     */
    @LispMethod(comment = "Returns a list of URL strings that represent pages in the Web-store that\r\ncontain search-terms in SEARCH-STRING.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp;  e.g. \"\"Hello World\"\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return listp; list of strings e.g. (\"http://ifso.ie/news_2004.html\")\nReturns a list of URL strings that represent pages in the Web-store that\ncontain search-terms in SEARCH-STRING.")
    public static final SubLObject ws_index_search_alt(SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ws_index_server_aliveP(host, port, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$StringURLs, search_string);
                return read_from_string(com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else {
            Errors.warn($str_alt55$Web_store_Index_Server_not_listen, port, host);
        }
        return NIL;
    }

    /**
     * Returns a list of URL strings that represent pages in the Web-store that
     * contain search-terms in SEARCH-STRING.
     *
     * @param SEARCH-STRING
     * 		stringp;  e.g. ""Hello World""
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return listp; list of strings e.g. ("http://ifso.ie/news_2004.html")
     */
    @LispMethod(comment = "Returns a list of URL strings that represent pages in the Web-store that\r\ncontain search-terms in SEARCH-STRING.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp;  e.g. \"\"Hello World\"\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return listp; list of strings e.g. (\"http://ifso.ie/news_2004.html\")\nReturns a list of URL strings that represent pages in the Web-store that\ncontain search-terms in SEARCH-STRING.")
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

    /**
     * Returns a list of URL strings that represent pages in the Web-store that
     * contain search-terms in SEARCH-STRING.
     *
     * @param SEARCH-STRING
     * 		stringp;  e.g. ""Hello World""
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return listp; list of strings e.g. ("http://ifso.ie/news_2004.html")
     */
    @LispMethod(comment = "Returns a list of URL strings that represent pages in the Web-store that\r\ncontain search-terms in SEARCH-STRING.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp;  e.g. \"\"Hello World\"\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return listp; list of strings e.g. (\"http://ifso.ie/news_2004.html\")\nReturns a list of URL strings that represent pages in the Web-store that\ncontain search-terms in SEARCH-STRING.")
    public static final SubLObject ws_index_search_with_snippets_alt(SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ws_index_server_aliveP(host, port, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$StringURLsAndSnippets, search_string);
                return read_from_string(com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else {
            Errors.warn($str_alt55$Web_store_Index_Server_not_listen, port, host);
        }
        return NIL;
    }

    /**
     * Returns a list of URL strings that represent pages in the Web-store that
     * contain search-terms in SEARCH-STRING.
     *
     * @param SEARCH-STRING
     * 		stringp;  e.g. ""Hello World""
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return listp; list of strings e.g. ("http://ifso.ie/news_2004.html")
     */
    @LispMethod(comment = "Returns a list of URL strings that represent pages in the Web-store that\r\ncontain search-terms in SEARCH-STRING.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp;  e.g. \"\"Hello World\"\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return listp; list of strings e.g. (\"http://ifso.ie/news_2004.html\")\nReturns a list of URL strings that represent pages in the Web-store that\ncontain search-terms in SEARCH-STRING.")
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

    /**
     * Returns a list of URL strings that represent pages in the Web-store that
     * contain search-terms in SEARCH-STRING.
     *
     * @param SEARCH-STRING
     * 		stringp;  e.g. ""Hello World""
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return listp; list of strings e.g. ("http://ifso.ie/news_2004.html")
     */
    @LispMethod(comment = "Returns a list of URL strings that represent pages in the Web-store that\r\ncontain search-terms in SEARCH-STRING.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp;  e.g. \"\"Hello World\"\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return listp; list of strings e.g. (\"http://ifso.ie/news_2004.html\")\nReturns a list of URL strings that represent pages in the Web-store that\ncontain search-terms in SEARCH-STRING.")
    public static final SubLObject ws_index_search_with_titles_and_snippets_alt(SubLObject search_string, SubLObject start, SubLObject count, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        {
            SubLObject command = format(NIL, $str_alt57$StringURLsTitlesAndSnippets__A__A, start, count);
            if (NIL != com.cyc.cycjava.cycl.lucene_index.ws_index_server_aliveP(host, port, UNPROVIDED)) {
                {
                    SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml(command, search_string);
                    return read_from_string(com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                Errors.warn($str_alt55$Web_store_Index_Server_not_listen, port, host);
            }
        }
        return NIL;
    }

    /**
     * Returns a list of URL strings that represent pages in the Web-store that
     * contain search-terms in SEARCH-STRING.
     *
     * @param SEARCH-STRING
     * 		stringp;  e.g. ""Hello World""
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return listp; list of strings e.g. ("http://ifso.ie/news_2004.html")
     */
    @LispMethod(comment = "Returns a list of URL strings that represent pages in the Web-store that\r\ncontain search-terms in SEARCH-STRING.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp;  e.g. \"\"Hello World\"\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return listp; list of strings e.g. (\"http://ifso.ie/news_2004.html\")\nReturns a list of URL strings that represent pages in the Web-store that\ncontain search-terms in SEARCH-STRING.")
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

    /**
     * Returns the HTML contents of the webpage that has the url URL-STRING as an id
     * in the Web-store Index.
     *
     * @param URL-STRING
     * 		stringp;  e.g. "http://ifso.ie/news_2004.html"
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return stringp;
     */
    @LispMethod(comment = "Returns the HTML contents of the webpage that has the url URL-STRING as an id\r\nin the Web-store Index.\r\n\r\n@param URL-STRING\r\n\t\tstringp;  e.g. \"http://ifso.ie/news_2004.html\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return stringp;\nReturns the HTML contents of the webpage that has the url URL-STRING as an id\nin the Web-store Index.")
    public static final SubLObject ws_index_url_content_alt(SubLObject url_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ws_index_server_aliveP(host, port, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$URLContent, url_string);
                return com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
            }
        } else {
            Errors.warn($str_alt55$Web_store_Index_Server_not_listen, port, host);
        }
        return NIL;
    }

    /**
     * Returns the HTML contents of the webpage that has the url URL-STRING as an id
     * in the Web-store Index.
     *
     * @param URL-STRING
     * 		stringp;  e.g. "http://ifso.ie/news_2004.html"
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return stringp;
     */
    @LispMethod(comment = "Returns the HTML contents of the webpage that has the url URL-STRING as an id\r\nin the Web-store Index.\r\n\r\n@param URL-STRING\r\n\t\tstringp;  e.g. \"http://ifso.ie/news_2004.html\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return stringp;\nReturns the HTML contents of the webpage that has the url URL-STRING as an id\nin the Web-store Index.")
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

    /**
     * Returns the plain-text contents of the webpage that has the url URL-STRING as
     * an id in the Web-store Index.
     *
     * @param URL-STRING
     * 		stringp;  e.g. "http://ifso.ie/news_2004.html"
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return stringp;
     */
    @LispMethod(comment = "Returns the plain-text contents of the webpage that has the url URL-STRING as\r\nan id in the Web-store Index.\r\n\r\n@param URL-STRING\r\n\t\tstringp;  e.g. \"http://ifso.ie/news_2004.html\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return stringp;\nReturns the plain-text contents of the webpage that has the url URL-STRING as\nan id in the Web-store Index.")
    public static final SubLObject ws_index_url_text_alt(SubLObject url_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ws_index_server_aliveP(host, port, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$URLText, url_string);
                return com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
            }
        } else {
            Errors.warn($str_alt55$Web_store_Index_Server_not_listen, port, host);
        }
        return NIL;
    }

    /**
     * Returns the plain-text contents of the webpage that has the url URL-STRING as
     * an id in the Web-store Index.
     *
     * @param URL-STRING
     * 		stringp;  e.g. "http://ifso.ie/news_2004.html"
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return stringp;
     */
    @LispMethod(comment = "Returns the plain-text contents of the webpage that has the url URL-STRING as\r\nan id in the Web-store Index.\r\n\r\n@param URL-STRING\r\n\t\tstringp;  e.g. \"http://ifso.ie/news_2004.html\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return stringp;\nReturns the plain-text contents of the webpage that has the url URL-STRING as\nan id in the Web-store Index.")
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

    /**
     * Returns the title of the webpage that has the url URL-STRING as
     * an id in the Web-store Index.
     *
     * @param URL-STRING
     * 		stringp;  e.g. "http://ifso.ie/news_2004.html"
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return stringp;
     */
    @LispMethod(comment = "Returns the title of the webpage that has the url URL-STRING as\r\nan id in the Web-store Index.\r\n\r\n@param URL-STRING\r\n\t\tstringp;  e.g. \"http://ifso.ie/news_2004.html\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return stringp;\nReturns the title of the webpage that has the url URL-STRING as\nan id in the Web-store Index.")
    public static final SubLObject ws_index_url_title_alt(SubLObject url_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ws_index_server_aliveP(host, port, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$URLTitle, url_string);
                return com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
            }
        } else {
            Errors.warn($str_alt55$Web_store_Index_Server_not_listen, port, host);
        }
        return NIL;
    }

    /**
     * Returns the title of the webpage that has the url URL-STRING as
     * an id in the Web-store Index.
     *
     * @param URL-STRING
     * 		stringp;  e.g. "http://ifso.ie/news_2004.html"
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return stringp;
     */
    @LispMethod(comment = "Returns the title of the webpage that has the url URL-STRING as\r\nan id in the Web-store Index.\r\n\r\n@param URL-STRING\r\n\t\tstringp;  e.g. \"http://ifso.ie/news_2004.html\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return stringp;\nReturns the title of the webpage that has the url URL-STRING as\nan id in the Web-store Index.")
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

    /**
     * Returns a pathname (string) of the LAN file that has the contents of the
     * webpage that has the url URL-STRING as an id in the Web-store Index.
     *
     * @param URL-STRING
     * 		stringp;  e.g. "http://ifso.ie/news_2004.html"
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return stringp; e.g.
    "/cyc/departments/nl/corpora/google-store/file-5969575409706472729.html"
     */
    @LispMethod(comment = "Returns a pathname (string) of the LAN file that has the contents of the\r\nwebpage that has the url URL-STRING as an id in the Web-store Index.\r\n\r\n@param URL-STRING\r\n\t\tstringp;  e.g. \"http://ifso.ie/news_2004.html\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return stringp; e.g.\r\n\"/cyc/departments/nl/corpora/google-store/file-5969575409706472729.html\"\nReturns a pathname (string) of the LAN file that has the contents of the\nwebpage that has the url URL-STRING as an id in the Web-store Index.")
    public static final SubLObject ws_index_pathname_for_url_alt(SubLObject url_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ws_index_server_aliveP(host, port, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$URLFile, url_string);
                return com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
            }
        } else {
            Errors.warn($str_alt55$Web_store_Index_Server_not_listen, port, host);
        }
        return NIL;
    }

    /**
     * Returns a pathname (string) of the LAN file that has the contents of the
     * webpage that has the url URL-STRING as an id in the Web-store Index.
     *
     * @param URL-STRING
     * 		stringp;  e.g. "http://ifso.ie/news_2004.html"
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return stringp; e.g.
    "/cyc/departments/nl/corpora/google-store/file-5969575409706472729.html"
     */
    @LispMethod(comment = "Returns a pathname (string) of the LAN file that has the contents of the\r\nwebpage that has the url URL-STRING as an id in the Web-store Index.\r\n\r\n@param URL-STRING\r\n\t\tstringp;  e.g. \"http://ifso.ie/news_2004.html\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return stringp; e.g.\r\n\"/cyc/departments/nl/corpora/google-store/file-5969575409706472729.html\"\nReturns a pathname (string) of the LAN file that has the contents of the\nwebpage that has the url URL-STRING as an id in the Web-store Index.")
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

    /**
     * Returns a list of pathname strings that represent pages in the Web-store that
     * contain search-terms in SEARCH-STRING.
     *
     * @param SEARCH-STRING
     * 		stringp;  e.g. ""Hello World""
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return listp; list of strings e.g.
    ("/cyc/departments/nl/corpora/google-store/file-5969575409706472729.html")
     */
    @LispMethod(comment = "Returns a list of pathname strings that represent pages in the Web-store that\r\ncontain search-terms in SEARCH-STRING.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp;  e.g. \"\"Hello World\"\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return listp; list of strings e.g.\r\n(\"/cyc/departments/nl/corpora/google-store/file-5969575409706472729.html\")\nReturns a list of pathname strings that represent pages in the Web-store that\ncontain search-terms in SEARCH-STRING.")
    public static final SubLObject ws_index_search_for_pathnames_alt(SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ws_index_server_aliveP(host, port, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$StringFiles, search_string);
                return read_from_string(com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else {
            Errors.warn($str_alt55$Web_store_Index_Server_not_listen, port, host);
        }
        return NIL;
    }

    /**
     * Returns a list of pathname strings that represent pages in the Web-store that
     * contain search-terms in SEARCH-STRING.
     *
     * @param SEARCH-STRING
     * 		stringp;  e.g. ""Hello World""
     * @param HOST
     * 		stringp; where the Web-store Index Server is running
     * @param PORT
     * 		integerp; port number at which the Web-store Index Server is
     * 		listening
     * @return listp; list of strings e.g.
    ("/cyc/departments/nl/corpora/google-store/file-5969575409706472729.html")
     */
    @LispMethod(comment = "Returns a list of pathname strings that represent pages in the Web-store that\r\ncontain search-terms in SEARCH-STRING.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp;  e.g. \"\"Hello World\"\"\r\n@param HOST\r\n\t\tstringp; where the Web-store Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the Web-store Index Server is\r\n\t\tlistening\r\n@return listp; list of strings e.g.\r\n(\"/cyc/departments/nl/corpora/google-store/file-5969575409706472729.html\")\nReturns a list of pathname strings that represent pages in the Web-store that\ncontain search-terms in SEARCH-STRING.")
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

    /**
     * Shutdown the Web-store Index Server listening at port PORT of HOST.
     */
    @LispMethod(comment = "Shutdown the Web-store Index Server listening at port PORT of HOST.")
    public static final SubLObject ws_index_shutdown_alt(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ws_index_server_aliveP(host, port, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($str_alt63$_quit_, $str_alt45$);
                com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
            }
        }
        if (NIL != verbose) {
            format(T, $str_alt64$Successfully_shutdown_Web_store_I, port, host);
        }
        return T;
    }

    /**
     * Shutdown the Web-store Index Server listening at port PORT of HOST.
     */
    @LispMethod(comment = "Shutdown the Web-store Index Server listening at port PORT of HOST.")
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

    /**
     * Get a count of the documents that match this search string.
     *
     * @return INTEGERP
     */
    @LispMethod(comment = "Get a count of the documents that match this search string.\r\n\r\n@return INTEGERP")
    public static final SubLObject ws_index_count_alt(SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ws_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ws_index_server_aliveP(host, port, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$CountContents, search_string);
                SubLObject result = read_from_string(com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL == result ? ((SubLObject) (ZERO_INTEGER)) : result.first();
            }
        } else {
            Errors.warn($str_alt55$Web_store_Index_Server_not_listen, port, host);
        }
        return ZERO_INTEGER;
    }

    /**
     * Get a count of the documents that match this search string.
     *
     * @return INTEGERP
     */
    @LispMethod(comment = "Get a count of the documents that match this search string.\r\n\r\n@return INTEGERP")
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

    /**
     * Returns T if the URL Index Server is up and listening at port PORT of
     * HOST; NIL otherwise.
     */
    @LispMethod(comment = "Returns T if the URL Index Server is up and listening at port PORT of\r\nHOST; NIL otherwise.\nReturns T if the URL Index Server is up and listening at port PORT of\nHOST; NIL otherwise.")
    public static final SubLObject url_index_server_aliveP_alt(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $url_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        return com.cyc.cycjava.cycl.lucene_index.lucene_index_server_aliveP(host, port, verbose);
    }

    /**
     * Returns T if the URL Index Server is up and listening at port PORT of
     * HOST; NIL otherwise.
     */
    @LispMethod(comment = "Returns T if the URL Index Server is up and listening at port PORT of\r\nHOST; NIL otherwise.\nReturns T if the URL Index Server is up and listening at port PORT of\nHOST; NIL otherwise.")
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

    /**
     * Returns a list of lists of URL strings that were returned when a search was
     * performed on Google using SEARCH-STRING.
     *
     * @param SEARCH-STRING
     * 		stringp;  e.g. ""Hello World""
     * @param HOST
     * 		stringp; where the URL Index Server is running
     * @param PORT
     * 		integerp; port number at which the URL Index Server is
     * 		listening
     * @return listp; list of lists of strings, e.g.
    (("http://ifso.ie/news_2004.html") ...)
     */
    @LispMethod(comment = "Returns a list of lists of URL strings that were returned when a search was\r\nperformed on Google using SEARCH-STRING.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp;  e.g. \"\"Hello World\"\"\r\n@param HOST\r\n\t\tstringp; where the URL Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the URL Index Server is\r\n\t\tlistening\r\n@return listp; list of lists of strings, e.g.\r\n((\"http://ifso.ie/news_2004.html\") ...)\nReturns a list of lists of URL strings that were returned when a search was\nperformed on Google using SEARCH-STRING.")
    public static final SubLObject url_index_search_alt(SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $url_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.url_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$URLIndex, search_string);
                return read_from_string(com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else {
            Errors.warn($str_alt67$URL_Index_Server_not_listening_at, port, host);
        }
        return NIL;
    }

    /**
     * Returns a list of lists of URL strings that were returned when a search was
     * performed on Google using SEARCH-STRING.
     *
     * @param SEARCH-STRING
     * 		stringp;  e.g. ""Hello World""
     * @param HOST
     * 		stringp; where the URL Index Server is running
     * @param PORT
     * 		integerp; port number at which the URL Index Server is
     * 		listening
     * @return listp; list of lists of strings, e.g.
    (("http://ifso.ie/news_2004.html") ...)
     */
    @LispMethod(comment = "Returns a list of lists of URL strings that were returned when a search was\r\nperformed on Google using SEARCH-STRING.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp;  e.g. \"\"Hello World\"\"\r\n@param HOST\r\n\t\tstringp; where the URL Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the URL Index Server is\r\n\t\tlistening\r\n@return listp; list of lists of strings, e.g.\r\n((\"http://ifso.ie/news_2004.html\") ...)\nReturns a list of lists of URL strings that were returned when a search was\nperformed on Google using SEARCH-STRING.")
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

    /**
     * Shutdown the URL Index Server listening at port PORT of HOST.
     */
    @LispMethod(comment = "Shutdown the URL Index Server listening at port PORT of HOST.")
    public static final SubLObject url_index_shutdown_alt(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ws_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $url_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.url_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($str_alt63$_quit_, $str_alt45$);
                com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
            }
        }
        if (NIL != verbose) {
            format(T, $str_alt68$Successfully_shutdown_URL_Index_S, port, host);
        }
        return T;
    }

    /**
     * Shutdown the URL Index Server listening at port PORT of HOST.
     */
    @LispMethod(comment = "Shutdown the URL Index Server listening at port PORT of HOST.")
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

    /**
     * Returns T if the EBMT Template Index Server is up and listening at port PORT
     * of HOST; NIL otherwise.
     */
    @LispMethod(comment = "Returns T if the EBMT Template Index Server is up and listening at port PORT\r\nof HOST; NIL otherwise.\nReturns T if the EBMT Template Index Server is up and listening at port PORT\nof HOST; NIL otherwise.")
    public static final SubLObject ebmt_index_server_aliveP_alt(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        return com.cyc.cycjava.cycl.lucene_index.lucene_index_server_aliveP(host, port, verbose);
    }

    /**
     * Returns T if the EBMT Template Index Server is up and listening at port PORT
     * of HOST; NIL otherwise.
     */
    @LispMethod(comment = "Returns T if the EBMT Template Index Server is up and listening at port PORT\r\nof HOST; NIL otherwise.\nReturns T if the EBMT Template Index Server is up and listening at port PORT\nof HOST; NIL otherwise.")
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

    /**
     * Add the template (input as a string TEMPLATE-STRING) to the EBMT Template
     * Index.
     *
     * @param TEMPLATE-STRING
     * 		stringp;  e.g. "("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars"):(#$likes-Generic #$BillClinton #$Automobile)"
     * @param HOST
     * 		stringp; where the EBMT Template Index Server is running
     * @param PORT
     * 		integerp; port number at which the EBMT Template Index Server is
     * 		listening
     * @return stringp; "Added" if it succeeds, "NIL" otherwise
     */
    @LispMethod(comment = "Add the template (input as a string TEMPLATE-STRING) to the EBMT Template\r\nIndex.\r\n\r\n@param TEMPLATE-STRING\r\n\t\tstringp;  e.g. \"(\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\"):(#$likes-Generic #$BillClinton #$Automobile)\"\r\n@param HOST\r\n\t\tstringp; where the EBMT Template Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the EBMT Template Index Server is\r\n\t\tlistening\r\n@return stringp; \"Added\" if it succeeds, \"NIL\" otherwise\nAdd the template (input as a string TEMPLATE-STRING) to the EBMT Template\nIndex.")
    public static final SubLObject ebmt_index_add_template_alt(SubLObject template_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ebmt_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$add, template_string);
                return com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
            }
        } else {
            Errors.warn($str_alt70$EBMT_Template_Index_Server_not_li, port, host);
        }
        return NIL;
    }

    /**
     * Add the template (input as a string TEMPLATE-STRING) to the EBMT Template
     * Index.
     *
     * @param TEMPLATE-STRING
     * 		stringp;  e.g. "("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars"):(#$likes-Generic #$BillClinton #$Automobile)"
     * @param HOST
     * 		stringp; where the EBMT Template Index Server is running
     * @param PORT
     * 		integerp; port number at which the EBMT Template Index Server is
     * 		listening
     * @return stringp; "Added" if it succeeds, "NIL" otherwise
     */
    @LispMethod(comment = "Add the template (input as a string TEMPLATE-STRING) to the EBMT Template\r\nIndex.\r\n\r\n@param TEMPLATE-STRING\r\n\t\tstringp;  e.g. \"(\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\"):(#$likes-Generic #$BillClinton #$Automobile)\"\r\n@param HOST\r\n\t\tstringp; where the EBMT Template Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the EBMT Template Index Server is\r\n\t\tlistening\r\n@return stringp; \"Added\" if it succeeds, \"NIL\" otherwise\nAdd the template (input as a string TEMPLATE-STRING) to the EBMT Template\nIndex.")
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

    /**
     * Make EBMT Templates from the raw template strings (consisting of raw-template
     * and weight-tuple) that are returned by the EBMT Index server.
     */
    @LispMethod(comment = "Make EBMT Templates from the raw template strings (consisting of raw-template\r\nand weight-tuple) that are returned by the EBMT Index server.\nMake EBMT Templates from the raw template strings (consisting of raw-template\nand weight-tuple) that are returned by the EBMT Index server.")
    public static final SubLObject ebmt_template_from_raw_template_alt(SubLObject raw_template) {
        return ebmt_template_parser.new_ebmt_template(NIL, NIL, third(raw_template.first()), list_utilities.cadar(raw_template), NIL, second(raw_template));
    }

    /**
     * Make EBMT Templates from the raw template strings (consisting of raw-template
     * and weight-tuple) that are returned by the EBMT Index server.
     */
    @LispMethod(comment = "Make EBMT Templates from the raw template strings (consisting of raw-template\r\nand weight-tuple) that are returned by the EBMT Index server.\nMake EBMT Templates from the raw template strings (consisting of raw-template\nand weight-tuple) that are returned by the EBMT Index server.")
    public static SubLObject ebmt_template_from_raw_template(final SubLObject raw_template) {
        return ebmt_template_parser.new_ebmt_template(NIL, NIL, third(raw_template.first()), list_utilities.cadar(raw_template), NIL, second(raw_template));
    }

    /**
     * Returns a list of EBMT templates (ordered by weights) that correspond to the
     * links that are a part of LINKAGE.
     *
     * @param LINKAGE-STRING
     * 		stringp;
     * 		e.g. "("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars")"
     * @param HOST
     * 		stringp; where the EBMT Template Index Server is running
     * @param PORT
     * 		integerp; port number at which the EBMT Template Index Server is
     * 		listening
     * @return listp; e.g. ((#$likes-Generic #$BillClinton #$Automobile))
     */
    @LispMethod(comment = "Returns a list of EBMT templates (ordered by weights) that correspond to the\r\nlinks that are a part of LINKAGE.\r\n\r\n@param LINKAGE-STRING\r\n\t\tstringp;\r\n\t\te.g. \"(\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\")\"\r\n@param HOST\r\n\t\tstringp; where the EBMT Template Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the EBMT Template Index Server is\r\n\t\tlistening\r\n@return listp; e.g. ((#$likes-Generic #$BillClinton #$Automobile))\nReturns a list of EBMT templates (ordered by weights) that correspond to the\nlinks that are a part of LINKAGE.")
    public static final SubLObject ebmt_index_find_templates_alt(SubLObject linkage_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ebmt_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$find, linkage_string);
                SubLObject raw_templates = read_from_string(com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject ebmt_templates = Mapping.mapcar(EBMT_TEMPLATE_FROM_RAW_TEMPLATE, raw_templates);
                return ebmt_templates;
            }
        } else {
            Errors.warn($str_alt70$EBMT_Template_Index_Server_not_li, port, host);
        }
        return NIL;
    }

    /**
     * Returns a list of EBMT templates (ordered by weights) that correspond to the
     * links that are a part of LINKAGE.
     *
     * @param LINKAGE-STRING
     * 		stringp;
     * 		e.g. "("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars")"
     * @param HOST
     * 		stringp; where the EBMT Template Index Server is running
     * @param PORT
     * 		integerp; port number at which the EBMT Template Index Server is
     * 		listening
     * @return listp; e.g. ((#$likes-Generic #$BillClinton #$Automobile))
     */
    @LispMethod(comment = "Returns a list of EBMT templates (ordered by weights) that correspond to the\r\nlinks that are a part of LINKAGE.\r\n\r\n@param LINKAGE-STRING\r\n\t\tstringp;\r\n\t\te.g. \"(\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\")\"\r\n@param HOST\r\n\t\tstringp; where the EBMT Template Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the EBMT Template Index Server is\r\n\t\tlistening\r\n@return listp; e.g. ((#$likes-Generic #$BillClinton #$Automobile))\nReturns a list of EBMT templates (ordered by weights) that correspond to the\nlinks that are a part of LINKAGE.")
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

    /**
     * Delete the entries related to template (input as a string TEMPLATE-STRING)
     * from the EBMT Template Index.
     *
     * @param TEMPLATE-STRING
     * 		stringp;  e.g. "("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars"):(#$likes-Generic #$BillClinton #$Automobile)"
     * @param HOST
     * 		stringp; where the EBMT Template Index Server is running
     * @param PORT
     * 		integerp; port number at which the EBMT Template Index Server is
     * 		listening
     * @return stringp; "Deleted" if it succeeds, "DeleteFailed" otherwise
     */
    @LispMethod(comment = "Delete the entries related to template (input as a string TEMPLATE-STRING)\r\nfrom the EBMT Template Index.\r\n\r\n@param TEMPLATE-STRING\r\n\t\tstringp;  e.g. \"(\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\"):(#$likes-Generic #$BillClinton #$Automobile)\"\r\n@param HOST\r\n\t\tstringp; where the EBMT Template Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the EBMT Template Index Server is\r\n\t\tlistening\r\n@return stringp; \"Deleted\" if it succeeds, \"DeleteFailed\" otherwise\nDelete the entries related to template (input as a string TEMPLATE-STRING)\nfrom the EBMT Template Index.")
    public static final SubLObject ebmt_index_delete_template_alt(SubLObject template_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ebmt_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($$$delete, template_string);
                return com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
            }
        } else {
            Errors.warn($str_alt70$EBMT_Template_Index_Server_not_li, port, host);
        }
        return NIL;
    }

    /**
     * Delete the entries related to template (input as a string TEMPLATE-STRING)
     * from the EBMT Template Index.
     *
     * @param TEMPLATE-STRING
     * 		stringp;  e.g. "("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars"):(#$likes-Generic #$BillClinton #$Automobile)"
     * @param HOST
     * 		stringp; where the EBMT Template Index Server is running
     * @param PORT
     * 		integerp; port number at which the EBMT Template Index Server is
     * 		listening
     * @return stringp; "Deleted" if it succeeds, "DeleteFailed" otherwise
     */
    @LispMethod(comment = "Delete the entries related to template (input as a string TEMPLATE-STRING)\r\nfrom the EBMT Template Index.\r\n\r\n@param TEMPLATE-STRING\r\n\t\tstringp;  e.g. \"(\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\"):(#$likes-Generic #$BillClinton #$Automobile)\"\r\n@param HOST\r\n\t\tstringp; where the EBMT Template Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the EBMT Template Index Server is\r\n\t\tlistening\r\n@return stringp; \"Deleted\" if it succeeds, \"DeleteFailed\" otherwise\nDelete the entries related to template (input as a string TEMPLATE-STRING)\nfrom the EBMT Template Index.")
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

    /**
     * Adds all the INDICES to the EBMT Template Index.
     *
     * @param INDICES
     * 		listp; list of index paths (stringp)
     * 		e.g. ("/cyc/departments/nl/corpora/ebmt-time-5/"
     * 		"/cyc/departments/nl/corpora/ebmt-time-50/")
     * @param HOST
     * 		stringp; where the EBMT Template Index Server is running
     * @param PORT
     * 		integerp; port number at which the EBMT Template Index Server is
     * 		listening
     * @return stringp; "Added" if it succeeds
     */
    @LispMethod(comment = "Adds all the INDICES to the EBMT Template Index.\r\n\r\n@param INDICES\r\n\t\tlistp; list of index paths (stringp)\r\n\t\te.g. (\"/cyc/departments/nl/corpora/ebmt-time-5/\"\r\n\t\t\"/cyc/departments/nl/corpora/ebmt-time-50/\")\r\n@param HOST\r\n\t\tstringp; where the EBMT Template Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the EBMT Template Index Server is\r\n\t\tlistening\r\n@return stringp; \"Added\" if it succeeds")
    public static final SubLObject ebmt_index_add_indices_alt(SubLObject indices, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ebmt_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.lucene_index.lucene_index_add_indices(host, port, indices);
        } else {
            Errors.warn($str_alt70$EBMT_Template_Index_Server_not_li, port, host);
        }
        return NIL;
    }

    /**
     * Adds all the INDICES to the EBMT Template Index.
     *
     * @param INDICES
     * 		listp; list of index paths (stringp)
     * 		e.g. ("/cyc/departments/nl/corpora/ebmt-time-5/"
     * 		"/cyc/departments/nl/corpora/ebmt-time-50/")
     * @param HOST
     * 		stringp; where the EBMT Template Index Server is running
     * @param PORT
     * 		integerp; port number at which the EBMT Template Index Server is
     * 		listening
     * @return stringp; "Added" if it succeeds
     */
    @LispMethod(comment = "Adds all the INDICES to the EBMT Template Index.\r\n\r\n@param INDICES\r\n\t\tlistp; list of index paths (stringp)\r\n\t\te.g. (\"/cyc/departments/nl/corpora/ebmt-time-5/\"\r\n\t\t\"/cyc/departments/nl/corpora/ebmt-time-50/\")\r\n@param HOST\r\n\t\tstringp; where the EBMT Template Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the EBMT Template Index Server is\r\n\t\tlistening\r\n@return stringp; \"Added\" if it succeeds")
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

    /**
     * Shutdown the EBMT Template Index Server listening at port PORT of HOST.
     */
    @LispMethod(comment = "Shutdown the EBMT Template Index Server listening at port PORT of HOST.")
    public static final SubLObject ebmt_index_shutdown_alt(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ebmt_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ebmt_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.lucene_index.ebmt_index_server_aliveP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($str_alt63$_quit_, $str_alt45$);
                com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
            }
        }
        if (NIL != verbose) {
            format(T, $str_alt74$Successfully_shutdown_EBMT_Templa, port, host);
        }
        return T;
    }

    /**
     * Shutdown the EBMT Template Index Server listening at port PORT of HOST.
     */
    @LispMethod(comment = "Shutdown the EBMT Template Index Server listening at port PORT of HOST.")
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

    /**
     * Returns T if the QL Index Server is up and listening at port PORT
     * of HOST; NIL otherwise.
     */
    @LispMethod(comment = "Returns T if the QL Index Server is up and listening at port PORT\r\nof HOST; NIL otherwise.\nReturns T if the QL Index Server is up and listening at port PORT\nof HOST; NIL otherwise.")
    public static final SubLObject ql_index_server_aliveP_alt(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        SubLTrampolineFile.checkType(host, NON_EMPTY_STRING_P);
        SubLTrampolineFile.checkType(port, POSITIVE_INTEGER_P);
        SubLTrampolineFile.checkType(verbose, $sym95$BOOLEAN_);
        return com.cyc.cycjava.cycl.lucene_index.lucene_index_server_aliveP(host, port, verbose);
    }

    @LispMethod(comment = "Returns T if the QL Index Server is up and listening at port PORT\r\nof HOST; NIL otherwise.\nReturns T if the QL Index Server is up and listening at port PORT\nof HOST; NIL otherwise.")
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
        assert NIL != string_utilities.non_empty_string_p(host) : "! string_utilities.non_empty_string_p(host) " + ("string_utilities.non_empty_string_p(host) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(host) ") + host;
        assert NIL != subl_promotions.positive_integer_p(port) : "! subl_promotions.positive_integer_p(port) " + ("subl_promotions.positive_integer_p(port) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(port) ") + port;
        assert NIL != obsolete.booleanP(verbose) : "! obsolete.booleanP(verbose) " + ("obsolete.booleanP(verbose) " + "CommonSymbols.NIL != obsolete.booleanP(verbose) ") + verbose;
        return lucene_index_server_aliveP(host, port, verbose);
    }

    /**
     * Add the query templates listed in ENCAPSULATED-REQUESTS to the QL Index.
     *
     * @param ENCAPSULATED-REQUESTS
    listp;
     * 		
     * @param HOST
     * 		stringp; where the QL Index Server is running
     * @param PORT
     * 		integerp; port number at which the QL Index Server is
     * 		listening
     * @return stringp; "Added" if it succeeds, "NotAdded" otherwise
     */
    @LispMethod(comment = "Add the query templates listed in ENCAPSULATED-REQUESTS to the QL Index.\r\n\r\n@param ENCAPSULATED-REQUESTS\nlistp;\r\n\t\t\r\n@param HOST\r\n\t\tstringp; where the QL Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the QL Index Server is\r\n\t\tlistening\r\n@return stringp; \"Added\" if it succeeds, \"NotAdded\" otherwise")
    public static final SubLObject ql_index_add_queries_alt(SubLObject encapsulated_requests, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = $ql_index_sc_not_added$.getGlobalValue();
                if (((NIL != list_utilities.non_empty_list_p(encapsulated_requests)) && (NIL != string_utilities.non_empty_string_p(host))) && (NIL != subl_promotions.positive_integer_p(port))) {
                    if (NIL != com.cyc.cycjava.cycl.lucene_index.ql_index_server_aliveP(host, port, UNPROVIDED)) {
                        {
                            SubLObject tmpstr = $str_alt45$;
                            SubLObject xml_msg = $str_alt45$;
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = make_private_string_output_stream();
                                    {
                                        SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_stream$.bind(stream, thread);
                                            xml_utilities.xml_start_tag_internal($ql_index_sc_query$.getGlobalValue(), list($ql_index_sc_type$.getGlobalValue(), $ql_index_sc_add_n$.getGlobalValue()), NIL);
                                            xml_utilities.xml_start_tag_internal($ql_index_sc_query_index_forms$.getGlobalValue(), list($ql_index_sc_kb$.getGlobalValue(), format_nil.format_nil_a(kb_loaded())), NIL);
                                        } finally {
                                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    tmpstr = get_output_stream_string(stream);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            close(stream, UNPROVIDED);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                            xml_msg = tmpstr;
                            tmpstr = $str_alt45$;
                            {
                                SubLObject cdolist_list_var = encapsulated_requests;
                                SubLObject v_encapsulation = NIL;
                                for (v_encapsulation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_encapsulation = cdolist_list_var.first()) {
                                    {
                                        SubLObject xml_form_doc = com.cyc.cycjava.cycl.lucene_index.ql_index_add_query_xml(v_encapsulation);
                                        if (NIL != xml_form_doc) {
                                            xml_msg = cconcatenate(xml_msg, xml_form_doc);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = make_private_string_output_stream();
                                    {
                                        SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_stream$.bind(stream, thread);
                                            xml_utilities.xml_end_tag_internal($ql_index_sc_query_index_forms$.getGlobalValue());
                                            xml_utilities.xml_end_tag_internal($ql_index_sc_query$.getGlobalValue());
                                        } finally {
                                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    tmpstr = get_output_stream_string(stream);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            close(stream, UNPROVIDED);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                            xml_msg = cconcatenate(xml_msg, tmpstr);
                            {
                                SubLObject tmp = com.cyc.cycjava.cycl.lucene_index.lucene_index_query(xml_msg, host, port);
                                if (tmp.equal($ql_index_sc_added$.getGlobalValue())) {
                                    result = tmp;
                                }
                            }
                        }
                    } else {
                        Errors.warn($str_alt96$QL_Index_Server_not_listening_at_, port, host);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Add the query templates listed in ENCAPSULATED-REQUESTS to the QL Index.\r\n\r\n@param ENCAPSULATED-REQUESTS\n\t\tlistp;\r\n\t\t\r\n@param HOST\r\n\t\tstringp; where the QL Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the QL Index Server is\r\n\t\tlistening\r\n@return stringp; \"Added\" if it succeeds, \"NotAdded\" otherwise")
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

    /**
     * Add the query template identified in ENCAPSULATED-REQUEST to the QL Index.
     *
     * @param ENCAPSULATED-REQUEST
    property-list-p;
     * 		
     * @param HOST
     * 		stringp; where the QL Index Server is running
     * @param PORT
     * 		integerp; port number at which the QL Index Server is
     * 		listening
     * @return stringp; "Added" if it succeeds, "NotAdded" otherwise
     */
    @LispMethod(comment = "Add the query template identified in ENCAPSULATED-REQUEST to the QL Index.\r\n\r\n@param ENCAPSULATED-REQUEST\nproperty-list-p;\r\n\t\t\r\n@param HOST\r\n\t\tstringp; where the QL Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the QL Index Server is\r\n\t\tlistening\r\n@return stringp; \"Added\" if it succeeds, \"NotAdded\" otherwise")
    public static final SubLObject ql_index_add_query_alt(SubLObject encapsulated_request, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = $ql_index_sc_not_added$.getGlobalValue();
                if (((NIL != list_utilities.property_list_p(encapsulated_request)) && (NIL != string_utilities.non_empty_string_p(host))) && (NIL != subl_promotions.positive_integer_p(port))) {
                    if (NIL != com.cyc.cycjava.cycl.lucene_index.ql_index_server_aliveP(host, port, UNPROVIDED)) {
                        {
                            SubLObject xml_form_doc = com.cyc.cycjava.cycl.lucene_index.ql_index_add_query_xml(encapsulated_request);
                            SubLObject tmpstr = $str_alt45$;
                            SubLObject xml_msg = $str_alt45$;
                            if (NIL != string_utilities.non_empty_string_p(xml_form_doc)) {
                                {
                                    SubLObject stream = NIL;
                                    try {
                                        stream = make_private_string_output_stream();
                                        {
                                            SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_stream$.bind(stream, thread);
                                                xml_utilities.xml_start_tag_internal($ql_index_sc_query$.getGlobalValue(), list($ql_index_sc_type$.getGlobalValue(), $ql_index_sc_add$.getGlobalValue()), NIL);
                                            } finally {
                                                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        xml_msg = get_output_stream_string(stream);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                close(stream, UNPROVIDED);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                                xml_msg = cconcatenate(xml_msg, xml_form_doc);
                                {
                                    SubLObject stream = NIL;
                                    try {
                                        stream = make_private_string_output_stream();
                                        {
                                            SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_stream$.bind(stream, thread);
                                                xml_utilities.xml_end_tag_internal($ql_index_sc_query$.getGlobalValue());
                                            } finally {
                                                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        tmpstr = get_output_stream_string(stream);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                close(stream, UNPROVIDED);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                                xml_msg = cconcatenate(xml_msg, tmpstr);
                                {
                                    SubLObject tmp = com.cyc.cycjava.cycl.lucene_index.lucene_index_query(xml_msg, host, port);
                                    if (tmp.equal($ql_index_sc_added$.getGlobalValue())) {
                                        result = tmp;
                                    }
                                }
                            }
                        }
                    } else {
                        Errors.warn($str_alt96$QL_Index_Server_not_listening_at_, port, host);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Add the query template identified in ENCAPSULATED-REQUEST to the QL Index.
     *
     * @param ENCAPSULATED-REQUEST
    		property-list-p;
     * 		
     * @param HOST
     * 		stringp; where the QL Index Server is running
     * @param PORT
     * 		integerp; port number at which the QL Index Server is
     * 		listening
     * @return stringp; "Added" if it succeeds, "NotAdded" otherwise
     */
    @LispMethod(comment = "Add the query template identified in ENCAPSULATED-REQUEST to the QL Index.\r\n\r\n@param ENCAPSULATED-REQUEST\n\t\tproperty-list-p;\r\n\t\t\r\n@param HOST\r\n\t\tstringp; where the QL Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the QL Index Server is\r\n\t\tlistening\r\n@return stringp; \"Added\" if it succeeds, \"NotAdded\" otherwise")
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

    public static final SubLObject ql_index_add_query_xml_alt(SubLObject encapsulated_request) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject xml_form_doc = NIL;
                if (NIL != list_utilities.property_list_p(encapsulated_request)) {
                    {
                        SubLObject id_string = getf(encapsulated_request, $ID, UNPROVIDED);
                        SubLObject cycl = getf(encapsulated_request, $CYCL, UNPROVIDED);
                        SubLObject generation = getf(encapsulated_request, $GENERATION, UNPROVIDED);
                        SubLObject gloss = getf(encapsulated_request, $GLOSS, UNPROVIDED);
                        SubLObject kb = getf(encapsulated_request, $KB, UNPROVIDED);
                        SubLObject process = getf(encapsulated_request, $PROCESS, UNPROVIDED);
                        SubLObject cyc_host = getf(encapsulated_request, $HOST, UNPROVIDED);
                        SubLObject user = getf(encapsulated_request, $USER, UNPROVIDED);
                        SubLObject time = getf(encapsulated_request, $TIME, UNPROVIDED);
                        if (((NIL != string_utilities.non_empty_string_p(id_string)) && (NIL != cycl)) && ((NIL != string_utilities.non_empty_string_p(gloss)) || (NIL != string_utilities.non_empty_string_p(generation)))) {
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = make_private_string_output_stream();
                                    {
                                        SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_stream$.bind(stream, thread);
                                            xml_utilities.xml_start_tag_internal($ql_index_sc_form$.getGlobalValue(), list($ql_index_sc_id$.getGlobalValue(), id_string), NIL);
                                            if (NIL != subl_promotions.positive_integer_p(kb)) {
                                                xml_utilities.xml_start_tag_internal($ql_index_sc_kb$.getGlobalValue(), NIL, NIL);
                                                xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(format_nil.format_nil_a(kb)));
                                                xml_utilities.xml_end_tag_internal($ql_index_sc_kb$.getGlobalValue());
                                            }
                                            if (NIL != cycl) {
                                                xml_utilities.xml_start_tag_internal($ql_index_sc_cycl$.getGlobalValue(), NIL, NIL);
                                                xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(format_nil.format_nil_a(cycl)));
                                                xml_utilities.xml_end_tag_internal($ql_index_sc_cycl$.getGlobalValue());
                                            }
                                            if (NIL != string_utilities.non_empty_string_p(gloss)) {
                                                xml_utilities.xml_start_tag_internal($ql_index_sc_gloss$.getGlobalValue(), NIL, NIL);
                                                xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(gloss));
                                                xml_utilities.xml_end_tag_internal($ql_index_sc_gloss$.getGlobalValue());
                                            }
                                            if (NIL != string_utilities.non_empty_string_p(generation)) {
                                                xml_utilities.xml_start_tag_internal($ql_index_sc_generation$.getGlobalValue(), NIL, NIL);
                                                xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(generation));
                                                xml_utilities.xml_end_tag_internal($ql_index_sc_generation$.getGlobalValue());
                                            }
                                            if (NIL != string_utilities.non_empty_string_p(process)) {
                                                xml_utilities.xml_start_tag_internal($ql_index_sc_process$.getGlobalValue(), NIL, NIL);
                                                xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(process));
                                                xml_utilities.xml_end_tag_internal($ql_index_sc_process$.getGlobalValue());
                                            }
                                            if (NIL != string_utilities.non_empty_string_p(cyc_host)) {
                                                xml_utilities.xml_start_tag_internal($ql_index_sc_host$.getGlobalValue(), NIL, NIL);
                                                xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(cyc_host));
                                                xml_utilities.xml_end_tag_internal($ql_index_sc_host$.getGlobalValue());
                                            }
                                            if (NIL != string_utilities.non_empty_string_p(user)) {
                                                xml_utilities.xml_start_tag_internal($ql_index_sc_user$.getGlobalValue(), NIL, NIL);
                                                xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(user));
                                                xml_utilities.xml_end_tag_internal($ql_index_sc_user$.getGlobalValue());
                                            }
                                            if (NIL != string_utilities.non_empty_string_p(time)) {
                                                xml_utilities.xml_start_tag_internal($ql_index_sc_time$.getGlobalValue(), NIL, NIL);
                                                xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(time));
                                                xml_utilities.xml_end_tag_internal($ql_index_sc_time$.getGlobalValue());
                                            }
                                            xml_utilities.xml_end_tag_internal($ql_index_sc_form$.getGlobalValue());
                                        } finally {
                                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    xml_form_doc = get_output_stream_string(stream);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            close(stream, UNPROVIDED);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return xml_form_doc;
            }
        }
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

    /**
     * Build a QL index in the directory for KB using the forms contained in
     * input file for KB.
     *
     * @param KB
    integerp;
     * 		
     * @param HOST
     * 		stringp; where the QL Index Server is running
     * @param PORT
     * 		integerp; port number at which the QL Index Server is
     * 		listening
     * @return stringp; "Built" if it succeeds, "NotBuilt" otherwise.
     */
    @LispMethod(comment = "Build a QL index in the directory for KB using the forms contained in\r\ninput file for KB.\r\n\r\n@param KB\nintegerp;\r\n\t\t\r\n@param HOST\r\n\t\tstringp; where the QL Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the QL Index Server is\r\n\t\tlistening\r\n@return stringp; \"Built\" if it succeeds, \"NotBuilt\" otherwise.\nBuild a QL index in the directory for KB using the forms contained in\ninput file for KB.")
    public static final SubLObject ql_index_build_from_file_alt(SubLObject kb, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = $ql_index_sc_not_built$.getGlobalValue();
                if (((NIL != subl_promotions.positive_integer_p(kb)) && (NIL != string_utilities.non_empty_string_p(host))) && (NIL != subl_promotions.positive_integer_p(port))) {
                    if (NIL != com.cyc.cycjava.cycl.lucene_index.ql_index_server_aliveP(host, port, UNPROVIDED)) {
                        {
                            SubLObject xml_msg = NIL;
                            SubLObject stream = NIL;
                            try {
                                stream = make_private_string_output_stream();
                                {
                                    SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_stream$.bind(stream, thread);
                                        xml_utilities.xml_start_tag_internal($ql_index_sc_query$.getGlobalValue(), list($ql_index_sc_type$.getGlobalValue(), $ql_index_sc_build$.getGlobalValue()), NIL);
                                        xml_utilities.xml_start_tag_internal($ql_index_sc_kb$.getGlobalValue(), NIL, NIL);
                                        xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(format_nil.format_nil_a(kb)));
                                        xml_utilities.xml_end_tag_internal($ql_index_sc_kb$.getGlobalValue());
                                        xml_utilities.xml_end_tag_internal($ql_index_sc_query$.getGlobalValue());
                                    } finally {
                                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                xml_msg = get_output_stream_string(stream);
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        close(stream, UNPROVIDED);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            {
                                SubLObject tmp = com.cyc.cycjava.cycl.lucene_index.lucene_index_query(xml_msg, host, port);
                                if (tmp.equal($ql_index_sc_built$.getGlobalValue())) {
                                    result = tmp;
                                }
                            }
                        }
                    } else {
                        Errors.warn($str_alt96$QL_Index_Server_not_listening_at_, port, host);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Build a QL index in the directory for KB using the forms contained in\r\ninput file for KB.\r\n\r\n@param KB\n\t\tintegerp;\r\n\t\t\r\n@param HOST\r\n\t\tstringp; where the QL Index Server is running\r\n@param PORT\r\n\t\tintegerp; port number at which the QL Index Server is\r\n\t\tlistening\r\n@return stringp; \"Built\" if it succeeds, \"NotBuilt\" otherwise.\nBuild a QL index in the directory for KB using the forms contained in\ninput file for KB.")
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
    }/**
     * Build a QL index in the directory for KB using the forms contained in
     * input file for KB.
     *
     * @param KB
    		integerp;
     * 		
     * @param HOST
     * 		stringp; where the QL Index Server is running
     * @param PORT
     * 		integerp; port number at which the QL Index Server is
     * 		listening
     * @return stringp; "Built" if it succeeds, "NotBuilt" otherwise.
     */


    /**
     * Returns a list of QL query ID strings (in descending order by score)
     * selected by the parameters (terms and field names) specified in SEARCH-STRING.
     *
     * @param KB
     * 		integerp; the KB from which the index was built
     * @param SEARCH-STRING
    stringp;
     * 		
     * @param HOST
     * 		stringp; the host on which the QL Index Server is running
     * @param PORT
     * 		integerp; the port number on which the QL Index Server is
     * 		listening
     * @return listp;
     */
    @LispMethod(comment = "Returns a list of QL query ID strings (in descending order by score)\r\nselected by the parameters (terms and field names) specified in SEARCH-STRING.\r\n\r\n@param KB\r\n\t\tintegerp; the KB from which the index was built\r\n@param SEARCH-STRING\nstringp;\r\n\t\t\r\n@param HOST\r\n\t\tstringp; the host on which the QL Index Server is running\r\n@param PORT\r\n\t\tintegerp; the port number on which the QL Index Server is\r\n\t\tlistening\r\n@return listp;\nReturns a list of QL query ID strings (in descending order by score)\nselected by the parameters (terms and field names) specified in SEARCH-STRING.")
    public static final SubLObject ql_index_find_queries_alt(SubLObject kb, SubLObject search_string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if ((((NIL != subl_promotions.positive_integer_p(kb)) && (NIL != string_utilities.non_empty_string_p(search_string))) && (NIL != string_utilities.non_empty_string_p(host))) && (NIL != subl_promotions.positive_integer_p(port))) {
                    if (NIL != com.cyc.cycjava.cycl.lucene_index.ql_index_server_aliveP(host, port, UNPROVIDED)) {
                        {
                            SubLObject cyc_host = Environment.get_machine_name(UNPROVIDED);
                            SubLObject user = format_nil.format_nil_a(operation_communication.the_cyclist());
                            SubLObject process = format_nil.format_nil_a(current_process());
                            SubLObject time = numeric_date_utilities.safe_timestring(get_universal_time());
                            SubLObject xml_msg = NIL;
                            SubLObject stream = NIL;
                            try {
                                stream = make_private_string_output_stream();
                                {
                                    SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_stream$.bind(stream, thread);
                                        xml_utilities.xml_start_tag_internal($ql_index_sc_query$.getGlobalValue(), list($ql_index_sc_type$.getGlobalValue(), $ql_index_sc_find$.getGlobalValue()), NIL);
                                        xml_utilities.xml_start_tag_internal($ql_index_sc_kb$.getGlobalValue(), NIL, NIL);
                                        xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(format_nil.format_nil_a(kb)));
                                        xml_utilities.xml_end_tag_internal($ql_index_sc_kb$.getGlobalValue());
                                        xml_utilities.xml_start_tag_internal($ql_index_sc_search_string$.getGlobalValue(), NIL, NIL);
                                        xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(search_string));
                                        xml_utilities.xml_end_tag_internal($ql_index_sc_search_string$.getGlobalValue());
                                        xml_utilities.xml_start_tag_internal($ql_index_sc_host$.getGlobalValue(), NIL, NIL);
                                        xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(cyc_host));
                                        xml_utilities.xml_end_tag_internal($ql_index_sc_host$.getGlobalValue());
                                        xml_utilities.xml_start_tag_internal($ql_index_sc_user$.getGlobalValue(), NIL, NIL);
                                        xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(user));
                                        xml_utilities.xml_end_tag_internal($ql_index_sc_user$.getGlobalValue());
                                        xml_utilities.xml_start_tag_internal($ql_index_sc_process$.getGlobalValue(), NIL, NIL);
                                        xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(process));
                                        xml_utilities.xml_end_tag_internal($ql_index_sc_process$.getGlobalValue());
                                        xml_utilities.xml_start_tag_internal($ql_index_sc_time$.getGlobalValue(), NIL, NIL);
                                        xml_utilities.xml_cdata(com.cyc.cycjava.cycl.lucene_index.replace_problematic_chars(time));
                                        xml_utilities.xml_end_tag_internal($ql_index_sc_time$.getGlobalValue());
                                        xml_utilities.xml_end_tag_internal($ql_index_sc_query$.getGlobalValue());
                                    } finally {
                                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                xml_msg = get_output_stream_string(stream);
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        close(stream, UNPROVIDED);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            {
                                SubLObject tmp = read_from_string(com.cyc.cycjava.cycl.lucene_index.lucene_index_query(xml_msg, host, port), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != list_utilities.non_empty_list_p(tmp)) {
                                    result = tmp;
                                }
                            }
                        }
                    } else {
                        Errors.warn($str_alt96$QL_Index_Server_not_listening_at_, port, host);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Returns a list of QL query ID strings (in descending order by score)\r\nselected by the parameters (terms and field names) specified in SEARCH-STRING.\r\n\r\n@param KB\r\n\t\tintegerp; the KB from which the index was built\r\n@param SEARCH-STRING\n\t\tstringp;\r\n\t\t\r\n@param HOST\r\n\t\tstringp; the host on which the QL Index Server is running\r\n@param PORT\r\n\t\tintegerp; the port number on which the QL Index Server is\r\n\t\tlistening\r\n@return listp;\nReturns a list of QL query ID strings (in descending order by score)\nselected by the parameters (terms and field names) specified in SEARCH-STRING.")
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
    }/**
     * Returns a list of QL query ID strings (in descending order by score)
     * selected by the parameters (terms and field names) specified in SEARCH-STRING.
     *
     * @param KB
     * 		integerp; the KB from which the index was built
     * @param SEARCH-STRING
    		stringp;
     * 		
     * @param HOST
     * 		stringp; the host on which the QL Index Server is running
     * @param PORT
     * 		integerp; the port number on which the QL Index Server is
     * 		listening
     * @return listp;
     */


    /**
     * Sends the message `$quit$' to the QL Index Server listening at port PORT on HOST.
     *
     * @return keywordp; :failed-to-connect if the server is unreachable, :shutdown if
    the server is successfully shut down, or :failed-to-shutdown if the server is
    still running five seconds after receiving the shutdown message.
     */
    @LispMethod(comment = "Sends the message `$quit$\' to the QL Index Server listening at port PORT on HOST.\r\n\r\n@return keywordp; :failed-to-connect if the server is unreachable, :shutdown if\r\nthe server is successfully shut down, or :failed-to-shutdown if the server is\r\nstill running five seconds after receiving the shutdown message.")
    public static final SubLObject ql_index_server_shutdown_alt(SubLObject host, SubLObject port, SubLObject verbose) {
        if (host == UNPROVIDED) {
            host = $ql_index_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $ql_index_port$.getDynamicValue();
        }
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        {
            SubLObject result = $FAILED_TO_CONNECT;
            if ((((NIL != string_utilities.non_empty_string_p(host)) && (NIL != subl_promotions.positive_integer_p(port))) && (NIL != booleanP(verbose))) && (NIL != com.cyc.cycjava.cycl.lucene_index.ql_index_server_aliveP(host, port, UNPROVIDED))) {
                result = $FAILED_TO_SHUTDOWN;
                {
                    SubLObject query_xml = com.cyc.cycjava.cycl.lucene_index.lucene_index_query_xml($ql_index_sc_quit$.getGlobalValue(), $str_alt45$);
                    com.cyc.cycjava.cycl.lucene_index.lucene_index_query(query_xml, host, port);
                }
                {
                    SubLObject count = ZERO_INTEGER;
                    while (count.numL(FIVE_INTEGER) && (NIL != com.cyc.cycjava.cycl.lucene_index.ql_index_server_aliveP(host, port, UNPROVIDED))) {
                        count = add(count, ONE_INTEGER);
                        sleep(ONE_INTEGER);
                    } 
                }
                if (NIL == com.cyc.cycjava.cycl.lucene_index.ql_index_server_aliveP(host, port, UNPROVIDED)) {
                    result = $SHUTDOWN;
                }
                if ((NIL != verbose) && (result == $SHUTDOWN)) {
                    format(T, $str_alt109$Successfully_shutdown_QL_Index_Se, port, host);
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Sends the message `$quit$\' to the QL Index Server listening at port PORT on HOST.\r\n\r\n@return keywordp; :failed-to-connect if the server is unreachable, :shutdown if\r\nthe server is successfully shut down, or :failed-to-shutdown if the server is\r\nstill running five seconds after receiving the shutdown message.")
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
    }/**
     * Sends the message `$quit$' to the QL Index Server listening at port PORT on HOST.
     *
     * @return keywordp; :failed-to-connect if the server is unreachable, :shutdown if
    the server is successfully shut down, or :failed-to-shutdown if the server is
    still running five seconds after receiving the shutdown message.
     */


    public static final SubLObject replace_problematic_chars_alt(SubLObject string) {
        return string_utilities.strip_chars_meeting_test(string, symbol_function(CONTROL_CHAR_P));
    }

    public static SubLObject replace_problematic_chars(final SubLObject string) {
        return string_utilities.strip_chars_meeting_test(string, symbol_function(CONTROL_CHAR_P));
    }

    /**
     * Take a symbolic lucene query description and convert it into a search
     * string that can then be passed to lucene.
     *
     * @return STRINGP the search string
     */
    @LispMethod(comment = "Take a symbolic lucene query description and convert it into a search\r\nstring that can then be passed to lucene.\r\n\r\n@return STRINGP the search string\nTake a symbolic lucene query description and convert it into a search\nstring that can then be passed to lucene.")
    public static final SubLObject lucene_symbolic_query_to_string_alt(SubLObject symbolic_query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $lucene_query_string_stack$.currentBinding(thread);
                    try {
                        $lucene_query_string_stack$.bind(NIL, thread);
                        com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(symbolic_query);
                        result = string_utilities.reduce_whitespace(apply(symbol_function(CCONCATENATE), nreverse($lucene_query_string_stack$.getDynamicValue(thread))));
                    } finally {
                        $lucene_query_string_stack$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Take a symbolic lucene query description and convert it into a search\r\nstring that can then be passed to lucene.\r\n\r\n@return STRINGP the search string\nTake a symbolic lucene query description and convert it into a search\nstring that can then be passed to lucene.")
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
    }/**
     * Take a symbolic lucene query description and convert it into a search
     * string that can then be passed to lucene.
     *
     * @return STRINGP the search string
     */


    public static final SubLObject interpret_one_symbolic_query_element_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (v_object.isString()) {
                $lucene_query_string_stack$.setDynamicValue(cons(v_object, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
            } else {
                if (NIL != forts.fort_p(v_object)) {
                    com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(list($KEYWORD, kb_utilities.hl_external_id_string(v_object), $$$true));
                } else {
                    if (v_object.isCons() && v_object.first().isKeyword()) {
                        {
                            SubLObject operator = v_object.first();
                            SubLObject operands = v_object.rest();
                            SubLObject pcase_var = operator;
                            if (pcase_var.eql($BAG)) {
                                {
                                    SubLObject list_var = NIL;
                                    SubLObject operand = NIL;
                                    SubLObject counter = NIL;
                                    for (list_var = operands, operand = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , operand = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                        if (!counter.isZero()) {
                                            $lucene_query_string_stack$.setDynamicValue(cons($str_alt52$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                        }
                                        com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(operand);
                                    }
                                }
                            } else {
                                if (pcase_var.eql($AND)) {
                                    {
                                        SubLObject list_var = NIL;
                                        SubLObject operand = NIL;
                                        SubLObject counter = NIL;
                                        for (list_var = operands, operand = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , operand = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                            if (!counter.isZero()) {
                                                $lucene_query_string_stack$.setDynamicValue(cons($str_alt115$_AND_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                            }
                                            com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(operand);
                                        }
                                    }
                                } else {
                                    if (pcase_var.eql($OR)) {
                                        {
                                            SubLObject list_var = NIL;
                                            SubLObject operand = NIL;
                                            SubLObject counter = NIL;
                                            for (list_var = operands, operand = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , operand = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                                if (!counter.isZero()) {
                                                    $lucene_query_string_stack$.setDynamicValue(cons($str_alt117$_OR_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                }
                                                com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(operand);
                                            }
                                        }
                                    } else {
                                        if (pcase_var.eql($QUOTE)) {
                                            {
                                                SubLObject operand = operands.first();
                                                $lucene_query_string_stack$.setDynamicValue(cons($str_alt119$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(operand);
                                                $lucene_query_string_stack$.setDynamicValue(cons($str_alt119$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                            }
                                        } else {
                                            if (pcase_var.eql($MUST)) {
                                                {
                                                    SubLObject operand = operands.first();
                                                    $lucene_query_string_stack$.setDynamicValue(cons($str_alt121$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                    com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(operand);
                                                }
                                            } else {
                                                if (pcase_var.eql($LIKE)) {
                                                    {
                                                        SubLObject operand = operands.first();
                                                        $lucene_query_string_stack$.setDynamicValue(cons($str_alt123$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                        com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(operand);
                                                    }
                                                } else {
                                                    if (pcase_var.eql($KEYWORD)) {
                                                        {
                                                            SubLObject keyword = operands.first();
                                                            SubLObject value = second(operands);
                                                            $lucene_query_string_stack$.setDynamicValue(cons(keyword, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                            $lucene_query_string_stack$.setDynamicValue(cons($str_alt124$___, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                            com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(value);
                                                        }
                                                    } else {
                                                        if (pcase_var.eql($RANGE)) {
                                                            {
                                                                SubLObject low = operands.first();
                                                                SubLObject high = second(operands);
                                                                $lucene_query_string_stack$.setDynamicValue(cons($str_alt126$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                                com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(low);
                                                                $lucene_query_string_stack$.setDynamicValue(cons($str_alt127$_TO_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                                com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(high);
                                                                $lucene_query_string_stack$.setDynamicValue(cons($str_alt128$_, $lucene_query_string_stack$.getDynamicValue(thread)), thread);
                                                            }
                                                        } else {
                                                            Errors.error($str_alt129$Unknown_operator__A__dont_know_ho, operator);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (NIL != cycl_grammar.cycl_nat_p(v_object)) {
                            com.cyc.cycjava.cycl.lucene_index.interpret_nat_symbolic_query_element(v_object);
                        } else {
                            com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(string_utilities.to_string(v_object));
                        }
                    }
                }
            }
            return v_object;
        }
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

    public static final SubLObject interpret_nat_symbolic_query_element_alt(SubLObject nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $lucene_symbolic_query_translate_dates$.getDynamicValue(thread)) && (NIL != date_utilities.date_p(nat))) {
                {
                    SubLObject string = date_defns.cyc_date_encode_string($$$YYYYMMDD, nat);
                    com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(string);
                }
            } else {
                com.cyc.cycjava.cycl.lucene_index.interpret_one_symbolic_query_element(list($KEYWORD, kb_utilities.hl_external_id_string(nat), $$$true));
            }
            return nat;
        }
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

    public static final SubLObject construct_symbolic_terminus_ante_quem_query_alt(SubLObject cycl_date) {
        return list($KEYWORD, $$$date, list($RANGE, ZERO_INTEGER, cycl_date));
    }

    public static SubLObject construct_symbolic_terminus_ante_quem_query(final SubLObject cycl_date) {
        return list($KEYWORD, $$$date, list($RANGE, ZERO_INTEGER, cycl_date));
    }

    public static final SubLObject construct_symbolic_terminus_post_quem_query_alt(SubLObject cycl_date) {
        return list($KEYWORD, $$$date, list($RANGE, cycl_date, date_utilities.indexical_today()));
    }

    public static SubLObject construct_symbolic_terminus_post_quem_query(final SubLObject cycl_date) {
        return list($KEYWORD, $$$date, list($RANGE, cycl_date, date_utilities.indexical_today()));
    }

    /**
     * Generate a query string that looks for dates up unto the current date.
     */
    @LispMethod(comment = "Generate a query string that looks for dates up unto the current date.")
    public static final SubLObject lucene_symbolic_terminus_ante_quem_query_alt(SubLObject cycl_date) {
        return com.cyc.cycjava.cycl.lucene_index.lucene_symbolic_query_to_string(com.cyc.cycjava.cycl.lucene_index.construct_symbolic_terminus_ante_quem_query(cycl_date));
    }

    @LispMethod(comment = "Generate a query string that looks for dates up unto the current date.")
    public static SubLObject lucene_symbolic_terminus_ante_quem_query(final SubLObject cycl_date) {
        return lucene_symbolic_query_to_string(construct_symbolic_terminus_ante_quem_query(cycl_date));
    }/**
     * Generate a query string that looks for dates up unto the current date.
     */


    /**
     * Generate a query string that looks for dates from the current date forward.
     */
    @LispMethod(comment = "Generate a query string that looks for dates from the current date forward.")
    public static final SubLObject lucene_symbolic_terminus_post_quem_query_alt(SubLObject cycl_date) {
        return com.cyc.cycjava.cycl.lucene_index.lucene_symbolic_query_to_string(com.cyc.cycjava.cycl.lucene_index.construct_symbolic_terminus_post_quem_query(cycl_date));
    }

    @LispMethod(comment = "Generate a query string that looks for dates from the current date forward.")
    public static SubLObject lucene_symbolic_terminus_post_quem_query(final SubLObject cycl_date) {
        return lucene_symbolic_query_to_string(construct_symbolic_terminus_post_quem_query(cycl_date));
    }/**
     * Generate a query string that looks for dates from the current date forward.
     */


    /**
     * Creates an EBMT Template Index that can be shipped in an external release.
     * First, it starts the EBMT Template index server using an empty index,
     * populates the index and then the server is shutdown.
     */
    @LispMethod(comment = "Creates an EBMT Template Index that can be shipped in an external release.\r\nFirst, it starts the EBMT Template index server using an empty index,\r\npopulates the index and then the server is shutdown.\nCreates an EBMT Template Index that can be shipped in an external release.\nFirst, it starts the EBMT Template index server using an empty index,\npopulates the index and then the server is shutdown.")
    public static final SubLObject ebmt_create_index_for_release_alt(SubLObject kb_num, SubLObject classpath, SubLObject port, SubLObject mt) {
        if (kb_num == UNPROVIDED) {
            kb_num = kb_loaded();
        }
        if (classpath == UNPROVIDED) {
            classpath = $str_alt132$_home_shah_cvs_head_cycorp_cyc_ja;
        }
        if (port == UNPROVIDED) {
            port = $int$8002;
        }
        if (mt == UNPROVIDED) {
            mt = $$EBMTTrainingExamplesFromQLMt;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(kb_num, POSITIVE_INTEGER_P);
            SubLTrampolineFile.checkType(classpath, STRINGP);
            SubLTrampolineFile.checkType(port, POSITIVE_INTEGER_P);
            SubLTrampolineFile.checkType(mt, HLMT_P);
            {
                SubLObject program = $str_alt137$_opt_local_pkg_j2sdk1_4_2_bin_jav;
                SubLObject args = list($str_alt138$_cp, classpath, $str_alt139$com_cyc_common_nlp_EBMTTemplateIn, $str_alt140$_i, cconcatenate($str_alt141$_cyc_top_data_ebmt_release_, new SubLObject[]{ format_nil.format_nil_a_no_copy(kb_num), $str_alt142$_ebmt_index_ }), $str_alt143$_p, format_nil.format_nil_a(port));
                SubLObject index_content = cconcatenate($str_alt141$_cyc_top_data_ebmt_release_, new SubLObject[]{ format_nil.format_nil_a_no_copy(kb_num), $str_alt144$_ebmt_index_txt });
                SubLObject index_log = cconcatenate($str_alt141$_cyc_top_data_ebmt_release_, new SubLObject[]{ format_nil.format_nil_a_no_copy(kb_num), $str_alt145$_ebmt_index_log });
                SubLObject os_process = os_process_utilities.make_os_process($$$EBMT_Template_Index_Server, program, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject num_templates = NIL;
                {
                    SubLObject _prev_bind_0 = $ebmt_index_host$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $ebmt_index_port$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $ebmt_index_content$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $ebmt_index_log$.currentBinding(thread);
                    try {
                        $ebmt_index_host$.bind($$$localhost, thread);
                        $ebmt_index_port$.bind(port, thread);
                        $ebmt_index_content$.bind(index_content, thread);
                        $ebmt_index_log$.bind(index_log, thread);
                        num_templates = ebmt_template_parser.ebmt_populate_index_from_mt(mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $ebmt_index_log$.rebind(_prev_bind_3, thread);
                        $ebmt_index_content$.rebind(_prev_bind_2, thread);
                        $ebmt_index_port$.rebind(_prev_bind_1, thread);
                        $ebmt_index_host$.rebind(_prev_bind_0, thread);
                    }
                }
                if (num_templates.numE(ZERO_INTEGER)) {
                    Errors.warn($str_alt148$No_templates_added_to_EBMT_Templa);
                }
                os_process_utilities.kill_os_process(os_process);
                return num_templates;
            }
        }
    }

    @LispMethod(comment = "Creates an EBMT Template Index that can be shipped in an external release.\r\nFirst, it starts the EBMT Template index server using an empty index,\r\npopulates the index and then the server is shutdown.\nCreates an EBMT Template Index that can be shipped in an external release.\nFirst, it starts the EBMT Template index server using an empty index,\npopulates the index and then the server is shutdown.")
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
        assert NIL != subl_promotions.positive_integer_p(kb_num) : "! subl_promotions.positive_integer_p(kb_num) " + ("subl_promotions.positive_integer_p(kb_num) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(kb_num) ") + kb_num;
        assert NIL != stringp(classpath) : "! stringp(classpath) " + ("Types.stringp(classpath) " + "CommonSymbols.NIL != Types.stringp(classpath) ") + classpath;
        assert NIL != subl_promotions.positive_integer_p(port) : "! subl_promotions.positive_integer_p(port) " + ("subl_promotions.positive_integer_p(port) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(port) ") + port;
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
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
    }/**
     * Creates an EBMT Template Index that can be shipped in an external release.
     * First, it starts the EBMT Template index server using an empty index,
     * populates the index and then the server is shutdown.
     */


    public static SubLObject declare_lucene_index_file() {
        declareFunction("lucene_index_query_xml", "LUCENE-INDEX-QUERY-XML", 2, 0, false);
        declareMacro("with_ws_index_server", "WITH-WS-INDEX-SERVER");
        declareFunction("get_ql_index_host", "GET-QL-INDEX-HOST", 0, 0, false);
        declareFunction("set_ql_index_host", "SET-QL-INDEX-HOST", 1, 0, false);
        declareFunction("get_ql_index_port", "GET-QL-INDEX-PORT", 0, 0, false);
        declareFunction("set_ql_index_port", "SET-QL-INDEX-PORT", 1, 0, false);
        declareFunction("get_ql_index_root_dir_names", "GET-QL-INDEX-ROOT-DIR-NAMES", 0, 0, false);
        declareFunction("set_ql_index_root_dir_names", "SET-QL-INDEX-ROOT-DIR-NAMES", 1, 0, false);
        declareFunction("get_ql_index_log", "GET-QL-INDEX-LOG", 0, 0, false);
        declareFunction("set_ql_index_log", "SET-QL-INDEX-LOG", 1, 0, false);
        declareFunction("lucene_index_query", "LUCENE-INDEX-QUERY", 3, 0, false);
        declareFunction("lucene_index_server_version", "LUCENE-INDEX-SERVER-VERSION", 2, 0, false);
        declareFunction("lucene_index_server_aliveP", "LUCENE-INDEX-SERVER-ALIVE?", 3, 0, false);
        declareFunction("lucene_index_add_indices", "LUCENE-INDEX-ADD-INDICES", 3, 0, false);
        declareFunction("ws_build_search_string", "WS-BUILD-SEARCH-STRING", 3, 1, false);
        declareFunction("get_ws_index_host", "GET-WS-INDEX-HOST", 0, 0, false);
        declareFunction("get_ws_index_port", "GET-WS-INDEX-PORT", 0, 0, false);
        declareFunction("ws_index_server_aliveP", "WS-INDEX-SERVER-ALIVE?", 0, 3, false);
        declareFunction("ws_index_search", "WS-INDEX-SEARCH", 1, 2, false);
        declareFunction("ws_index_search_with_snippets", "WS-INDEX-SEARCH-WITH-SNIPPETS", 1, 2, false);
        declareFunction("ws_index_search_with_titles_and_snippets", "WS-INDEX-SEARCH-WITH-TITLES-AND-SNIPPETS", 3, 2, false);
        declareFunction("ws_index_url_content", "WS-INDEX-URL-CONTENT", 1, 2, false);
        declareFunction("ws_index_url_text", "WS-INDEX-URL-TEXT", 1, 2, false);
        declareFunction("ws_index_url_title", "WS-INDEX-URL-TITLE", 1, 2, false);
        declareFunction("ws_index_pathname_for_url", "WS-INDEX-PATHNAME-FOR-URL", 1, 2, false);
        declareFunction("ws_index_search_for_pathnames", "WS-INDEX-SEARCH-FOR-PATHNAMES", 1, 2, false);
        declareFunction("ws_index_shutdown", "WS-INDEX-SHUTDOWN", 0, 3, false);
        declareFunction("ws_index_count", "WS-INDEX-COUNT", 1, 2, false);
        declareFunction("url_index_server_aliveP", "URL-INDEX-SERVER-ALIVE?", 0, 3, false);
        declareFunction("url_index_search", "URL-INDEX-SEARCH", 1, 2, false);
        declareFunction("url_index_shutdown", "URL-INDEX-SHUTDOWN", 0, 3, false);
        declareFunction("ebmt_index_server_aliveP", "EBMT-INDEX-SERVER-ALIVE?", 0, 3, false);
        declareFunction("ebmt_index_add_template", "EBMT-INDEX-ADD-TEMPLATE", 1, 2, false);
        declareFunction("ebmt_template_from_raw_template", "EBMT-TEMPLATE-FROM-RAW-TEMPLATE", 1, 0, false);
        declareFunction("ebmt_index_find_templates", "EBMT-INDEX-FIND-TEMPLATES", 1, 2, false);
        declareFunction("ebmt_index_delete_template", "EBMT-INDEX-DELETE-TEMPLATE", 1, 2, false);
        declareFunction("ebmt_index_add_indices", "EBMT-INDEX-ADD-INDICES", 1, 2, false);
        declareFunction("ebmt_index_shutdown", "EBMT-INDEX-SHUTDOWN", 0, 3, false);
        declareFunction("ql_index_server_aliveP", "QL-INDEX-SERVER-ALIVE?", 0, 3, false);
        declareFunction("ql_index_add_queries", "QL-INDEX-ADD-QUERIES", 1, 2, false);
        declareFunction("ql_index_add_query", "QL-INDEX-ADD-QUERY", 1, 2, false);
        declareFunction("ql_index_add_query_xml", "QL-INDEX-ADD-QUERY-XML", 1, 0, false);
        declareFunction("ql_index_build_from_file", "QL-INDEX-BUILD-FROM-FILE", 1, 2, false);
        declareFunction("ql_index_find_queries", "QL-INDEX-FIND-QUERIES", 2, 2, false);
        declareFunction("ql_index_server_shutdown", "QL-INDEX-SERVER-SHUTDOWN", 0, 3, false);
        declareFunction("replace_problematic_chars", "REPLACE-PROBLEMATIC-CHARS", 1, 0, false);
        declareFunction("lucene_symbolic_query_to_string", "LUCENE-SYMBOLIC-QUERY-TO-STRING", 1, 0, false);
        declareFunction("interpret_one_symbolic_query_element", "INTERPRET-ONE-SYMBOLIC-QUERY-ELEMENT", 1, 0, false);
        declareFunction("interpret_nat_symbolic_query_element", "INTERPRET-NAT-SYMBOLIC-QUERY-ELEMENT", 1, 0, false);
        declareFunction("construct_symbolic_terminus_ante_quem_query", "CONSTRUCT-SYMBOLIC-TERMINUS-ANTE-QUEM-QUERY", 1, 0, false);
        declareFunction("construct_symbolic_terminus_post_quem_query", "CONSTRUCT-SYMBOLIC-TERMINUS-POST-QUEM-QUERY", 1, 0, false);
        declareFunction("lucene_symbolic_terminus_ante_quem_query", "LUCENE-SYMBOLIC-TERMINUS-ANTE-QUEM-QUERY", 1, 0, false);
        declareFunction("lucene_symbolic_terminus_post_quem_query", "LUCENE-SYMBOLIC-TERMINUS-POST-QUEM-QUERY", 1, 0, false);
        declareFunction("ebmt_create_index_for_release", "EBMT-CREATE-INDEX-FOR-RELEASE", 0, 4, false);
        return NIL;
    }

    public static final SubLObject init_lucene_index_file_alt() {
        defparameter("*WS-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list_alt2.isSymbol() ? ((SubLObject) (symbol_value($list_alt2))) : $list_alt2, $ws_index_host$, $str_alt4$webstore_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt4$webstore_cyc_com))) : $str_alt4$webstore_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*WS-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list_alt6.isSymbol() ? ((SubLObject) (symbol_value($list_alt6))) : $list_alt6, $ws_index_port$, $int$7777.isSymbol() ? ((SubLObject) (symbol_value($int$7777))) : $int$7777, $PARAMETER, UNPROVIDED));
        defparameter("*URL-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list_alt11.isSymbol() ? ((SubLObject) (symbol_value($list_alt11))) : $list_alt11, $url_index_host$, $str_alt13$urlindex_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt13$urlindex_cyc_com))) : $str_alt13$urlindex_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*URL-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list_alt14.isSymbol() ? ((SubLObject) (symbol_value($list_alt14))) : $list_alt14, $url_index_port$, $int$7778.isSymbol() ? ((SubLObject) (symbol_value($int$7778))) : $int$7778, $PARAMETER, UNPROVIDED));
        defparameter("*EBMT-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list_alt17.isSymbol() ? ((SubLObject) (symbol_value($list_alt17))) : $list_alt17, $ebmt_index_host$, $str_alt19$ebmtindex_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt19$ebmtindex_cyc_com))) : $str_alt19$ebmtindex_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*EBMT-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list_alt20.isSymbol() ? ((SubLObject) (symbol_value($list_alt20))) : $list_alt20, $ebmt_index_port$, $int$7779.isSymbol() ? ((SubLObject) (symbol_value($int$7779))) : $int$7779, $PARAMETER, UNPROVIDED));
        defparameter("*EBMT-INDEX-CONTENT*", red_infrastructure_macros.red_def_helper($list_alt23.isSymbol() ? ((SubLObject) (symbol_value($list_alt23))) : $list_alt23, $ebmt_index_content$, $str_alt25$_cyc_departments_nl_corpora_ebmt_.isSymbol() ? ((SubLObject) (symbol_value($str_alt25$_cyc_departments_nl_corpora_ebmt_))) : $str_alt25$_cyc_departments_nl_corpora_ebmt_, $PARAMETER, UNPROVIDED));
        defparameter("*EBMT-INDEX-LOG*", red_infrastructure_macros.red_def_helper($list_alt26.isSymbol() ? ((SubLObject) (symbol_value($list_alt26))) : $list_alt26, $ebmt_index_log$, $str_alt28$_cyc_departments_nl_corpora_ebmt_.isSymbol() ? ((SubLObject) (symbol_value($str_alt28$_cyc_departments_nl_corpora_ebmt_))) : $str_alt28$_cyc_departments_nl_corpora_ebmt_, $PARAMETER, UNPROVIDED));
        defparameter("*QL-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list_alt29.isSymbol() ? ((SubLObject) (symbol_value($list_alt29))) : $list_alt29, $ql_index_host$, $str_alt31$elmore_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt31$elmore_cyc_com))) : $str_alt31$elmore_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*QL-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list_alt32.isSymbol() ? ((SubLObject) (symbol_value($list_alt32))) : $list_alt32, $ql_index_port$, $int$7781.isSymbol() ? ((SubLObject) (symbol_value($int$7781))) : $int$7781, $PARAMETER, UNPROVIDED));
        defparameter("*QL-INDEX-ROOT-DIR-NAMES*", red_infrastructure_macros.red_def_helper($list_alt35.isSymbol() ? ((SubLObject) (symbol_value($list_alt35))) : $list_alt35, $ql_index_root_dir_names$, $str_alt37$data_ir_indexes_ql.isSymbol() ? ((SubLObject) (symbol_value($str_alt37$data_ir_indexes_ql))) : $str_alt37$data_ir_indexes_ql, $PARAMETER, UNPROVIDED));
        defparameter("*QL-INDEX-LOG*", red_infrastructure_macros.red_def_helper($list_alt38.isSymbol() ? ((SubLObject) (symbol_value($list_alt38))) : $list_alt38, $ql_index_log$, $str_alt40$data_ir_indexes_ql_ql_index_log.isSymbol() ? ((SubLObject) (symbol_value($str_alt40$data_ir_indexes_ql_ql_index_log))) : $str_alt40$data_ir_indexes_ql_ql_index_log, $PARAMETER, UNPROVIDED));
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
        defconstant("*QL-INDEX-SC-ADD-N*", $str_alt90$add_n);
        defconstant("*QL-INDEX-SC-FIND*", $$$find);
        defconstant("*QL-INDEX-SC-QUIT*", $str_alt63$_quit_);
        defconstant("*QL-INDEX-SC-SEARCH-STRING*", $str_alt91$search_string);
        defconstant("*QL-INDEX-SC-QUERY-INDEX-FORMS*", $str_alt92$query_index_forms);
        defparameter("*LUCENE-QUERY-STRING-STACK*", NIL);
        defparameter("*LUCENE-SYMBOLIC-QUERY-TRANSLATE-DATES*", T);
        return NIL;
    }

    public static SubLObject init_lucene_index_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            defparameter("*WS-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list_alt2.isSymbol() ? ((SubLObject) (symbol_value($list_alt2))) : $list_alt2, $ws_index_host$, $str_alt4$webstore_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt4$webstore_cyc_com))) : $str_alt4$webstore_cyc_com, $PARAMETER, UNPROVIDED));
            defparameter("*WS-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list_alt6.isSymbol() ? ((SubLObject) (symbol_value($list_alt6))) : $list_alt6, $ws_index_port$, $int$7777.isSymbol() ? ((SubLObject) (symbol_value($int$7777))) : $int$7777, $PARAMETER, UNPROVIDED));
            defparameter("*URL-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list_alt11.isSymbol() ? ((SubLObject) (symbol_value($list_alt11))) : $list_alt11, $url_index_host$, $str_alt13$urlindex_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt13$urlindex_cyc_com))) : $str_alt13$urlindex_cyc_com, $PARAMETER, UNPROVIDED));
            defparameter("*URL-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list_alt14.isSymbol() ? ((SubLObject) (symbol_value($list_alt14))) : $list_alt14, $url_index_port$, $int$7778.isSymbol() ? ((SubLObject) (symbol_value($int$7778))) : $int$7778, $PARAMETER, UNPROVIDED));
            defparameter("*EBMT-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list_alt17.isSymbol() ? ((SubLObject) (symbol_value($list_alt17))) : $list_alt17, $ebmt_index_host$, $str_alt19$ebmtindex_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt19$ebmtindex_cyc_com))) : $str_alt19$ebmtindex_cyc_com, $PARAMETER, UNPROVIDED));
            defparameter("*EBMT-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list_alt20.isSymbol() ? ((SubLObject) (symbol_value($list_alt20))) : $list_alt20, $ebmt_index_port$, $int$7779.isSymbol() ? ((SubLObject) (symbol_value($int$7779))) : $int$7779, $PARAMETER, UNPROVIDED));
            defparameter("*EBMT-INDEX-CONTENT*", red_infrastructure_macros.red_def_helper($list_alt23.isSymbol() ? ((SubLObject) (symbol_value($list_alt23))) : $list_alt23, $ebmt_index_content$, $str_alt25$_cyc_departments_nl_corpora_ebmt_.isSymbol() ? ((SubLObject) (symbol_value($str_alt25$_cyc_departments_nl_corpora_ebmt_))) : $str_alt25$_cyc_departments_nl_corpora_ebmt_, $PARAMETER, UNPROVIDED));
            defparameter("*EBMT-INDEX-LOG*", red_infrastructure_macros.red_def_helper($list_alt26.isSymbol() ? ((SubLObject) (symbol_value($list_alt26))) : $list_alt26, $ebmt_index_log$, $str_alt28$_cyc_departments_nl_corpora_ebmt_.isSymbol() ? ((SubLObject) (symbol_value($str_alt28$_cyc_departments_nl_corpora_ebmt_))) : $str_alt28$_cyc_departments_nl_corpora_ebmt_, $PARAMETER, UNPROVIDED));
            defparameter("*QL-INDEX-HOST*", red_infrastructure_macros.red_def_helper($list_alt29.isSymbol() ? ((SubLObject) (symbol_value($list_alt29))) : $list_alt29, $ql_index_host$, $str_alt31$elmore_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt31$elmore_cyc_com))) : $str_alt31$elmore_cyc_com, $PARAMETER, UNPROVIDED));
            defparameter("*QL-INDEX-PORT*", red_infrastructure_macros.red_def_helper($list_alt32.isSymbol() ? ((SubLObject) (symbol_value($list_alt32))) : $list_alt32, $ql_index_port$, $int$7781.isSymbol() ? ((SubLObject) (symbol_value($int$7781))) : $int$7781, $PARAMETER, UNPROVIDED));
            defparameter("*QL-INDEX-ROOT-DIR-NAMES*", red_infrastructure_macros.red_def_helper($list_alt35.isSymbol() ? ((SubLObject) (symbol_value($list_alt35))) : $list_alt35, $ql_index_root_dir_names$, $str_alt37$data_ir_indexes_ql.isSymbol() ? ((SubLObject) (symbol_value($str_alt37$data_ir_indexes_ql))) : $str_alt37$data_ir_indexes_ql, $PARAMETER, UNPROVIDED));
            defparameter("*QL-INDEX-LOG*", red_infrastructure_macros.red_def_helper($list_alt38.isSymbol() ? ((SubLObject) (symbol_value($list_alt38))) : $list_alt38, $ql_index_log$, $str_alt40$data_ir_indexes_ql_ql_index_log.isSymbol() ? ((SubLObject) (symbol_value($str_alt40$data_ir_indexes_ql_ql_index_log))) : $str_alt40$data_ir_indexes_ql_ql_index_log, $PARAMETER, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_lucene_index_file_Previous() {
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

    

    static private final SubLList $list_alt2 = list(makeString("application.cyc-ir.lucene.ws.host"));

    static private final SubLString $str_alt4$webstore_cyc_com = makeString("webstore.cyc.com");

    static private final SubLList $list_alt6 = list(makeString("application.cyc-ir.lucene.ws.port"));

    static private final SubLList $list_alt9 = list(list(makeSymbol("HOST"), makeSymbol("&OPTIONAL"), list(makeSymbol("PORT"), makeSymbol("*WS-INDEX-PORT*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt11 = list(makeString("application.cyc-ir.lucene.url.host"));

    static private final SubLString $str_alt13$urlindex_cyc_com = makeString("urlindex.cyc.com");

    static private final SubLList $list_alt14 = list(makeString("application.cyc-ir.lucene.url.port"));

    static private final SubLList $list_alt17 = list(makeString("application.cyc-ir.lucene.ebmt.host"));

    static private final SubLString $str_alt19$ebmtindex_cyc_com = makeString("ebmtindex.cyc.com");

    static private final SubLList $list_alt20 = list(makeString("application.cyc-ir.lucene.ebmt.port"));

    static private final SubLList $list_alt23 = list(makeString("application.cyc-ir.lucene.ebmt.content"));

    static private final SubLString $str_alt25$_cyc_departments_nl_corpora_ebmt_ = makeString("/cyc/departments/nl/corpora/ebmt-index.txt");

    static private final SubLList $list_alt26 = list(makeString("application.cyc-ir.lucene.ebmt.log"));

    static private final SubLString $str_alt28$_cyc_departments_nl_corpora_ebmt_ = makeString("/cyc/departments/nl/corpora/ebmt-index.log");

    static private final SubLList $list_alt29 = list(makeString("application.cyc-ir.lucene.ql-index.host"));

    static private final SubLString $str_alt31$elmore_cyc_com = makeString("elmore.cyc.com");

    static private final SubLList $list_alt32 = list(makeString("application.cyc-ir.lucene.ql-index.port"));

    static private final SubLList $list_alt35 = list(makeString("application.cyc-ir.lucene.ql-index.root-dir-names"));

    static private final SubLString $str_alt37$data_ir_indexes_ql = makeString("data|ir|indexes|ql");

    static private final SubLList $list_alt38 = list(makeString("application.cyc-ir.lucene.ql-index.log"));

    static private final SubLString $str_alt40$data_ir_indexes_ql_ql_index_log = makeString("data/ir/indexes/ql/ql-index.log");

    static private final SubLString $str_alt43$___lucene_index_query__s__s__s___ = makeString("~%(lucene-index-query ~s ~s ~s) : ~s");

    static private final SubLString $str_alt46$Lucene_Index_Server_listening_at_ = makeString("Lucene Index Server listening at port ~A on ~A~%");

    static private final SubLString $str_alt47$Lucene_Index_Server_NOT_listening = makeString("Lucene Index Server NOT listening at port ~A on ~A~%");

    static private final SubLString $str_alt49$__ = makeString(" +");

    static private final SubLString $str_alt50$__ = makeString(" -");

    static private final SubLString $str_alt51$__ = makeString(" ~");

    static private final SubLString $str_alt52$_ = makeString(" ");

    static private final SubLString $str_alt55$Web_store_Index_Server_not_listen = makeString("Web-store Index Server not listening at port ~A on ~A");

    static private final SubLString $str_alt57$StringURLsTitlesAndSnippets__A__A = makeString("StringURLsTitlesAndSnippets-~A-~A");

    static private final SubLString $str_alt63$_quit_ = makeString("$quit$");

    static private final SubLString $str_alt64$Successfully_shutdown_Web_store_I = makeString("Successfully shutdown Web-store Index Server at port ~A on ~A~%");

    static private final SubLString $str_alt67$URL_Index_Server_not_listening_at = makeString("URL Index Server not listening at port ~A on ~A");

    static private final SubLString $str_alt68$Successfully_shutdown_URL_Index_S = makeString("Successfully shutdown URL Index Server at port ~A on ~A~%");

    static private final SubLString $str_alt70$EBMT_Template_Index_Server_not_li = makeString("EBMT Template Index Server not listening at port ~A on ~A");

    static private final SubLString $str_alt74$Successfully_shutdown_EBMT_Templa = makeString("Successfully shutdown EBMT Template Index Server at port ~A on ~A~%");

    static private final SubLString $str_alt90$add_n = makeString("add-n");

    static private final SubLString $str_alt91$search_string = makeString("search_string");

    static private final SubLString $str_alt92$query_index_forms = makeString("query_index_forms");

    static private final SubLString $str_alt96$QL_Index_Server_not_listening_at_ = makeString("QL Index Server not listening at port ~A on ~A");

    static private final SubLString $str_alt109$Successfully_shutdown_QL_Index_Se = makeString("Successfully shutdown QL Index Server at port ~A on ~A~%");

    static private final SubLString $str_alt115$_AND_ = makeString(" AND ");

    static private final SubLString $str_alt117$_OR_ = makeString(" OR ");

    static private final SubLString $str_alt119$_ = makeString("\"");

    static private final SubLString $str_alt121$_ = makeString("+");

    static private final SubLString $str_alt123$_ = makeString("~");

    static private final SubLString $str_alt124$___ = makeString(" : ");

    static private final SubLString $str_alt126$_ = makeString("[");

    static private final SubLString $str_alt127$_TO_ = makeString(" TO ");

    static private final SubLString $str_alt128$_ = makeString("]");

    static private final SubLString $str_alt129$Unknown_operator__A__dont_know_ho = makeString("Unknown operator ~A: dont know how to interpret.~%");

    static private final SubLString $str_alt132$_home_shah_cvs_head_cycorp_cyc_ja = makeString("/home/shah/cvs/head/cycorp/cyc/java/com/cyc/common/cyc-common.jar:/cyc/java/lib/xercesImpl-2.2.1.jar:/cyc/java/lib/lucene-core-1.9.1.jar");

    static private final SubLString $str_alt137$_opt_local_pkg_j2sdk1_4_2_bin_jav = makeString("/opt/local/pkg/j2sdk1.4.2/bin/java");

    static private final SubLString $str_alt138$_cp = makeString("-cp");

    static private final SubLString $str_alt139$com_cyc_common_nlp_EBMTTemplateIn = makeString("com.cyc.common.nlp.EBMTTemplateIndexServer");

    static private final SubLString $str_alt140$_i = makeString("-i");

    static private final SubLString $str_alt141$_cyc_top_data_ebmt_release_ = makeString("/cyc/top/data/ebmt/release/");

    static private final SubLString $str_alt142$_ebmt_index_ = makeString("/ebmt-index/");

    static private final SubLString $str_alt143$_p = makeString("-p");

    static private final SubLString $str_alt144$_ebmt_index_txt = makeString("/ebmt-index.txt");

    static private final SubLString $str_alt145$_ebmt_index_log = makeString("/ebmt-index.log");

    static private final SubLString $str_alt148$No_templates_added_to_EBMT_Templa = makeString("No templates added to EBMT Template Index for external release.");
}

/**
 * Total time: 566 ms
 */
