package com.cyc.cycjava.cycl.inference.browser;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_inference_monitors extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new cb_inference_monitors();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.browser.cb_inference_monitors";


    // deflexical
    private static final SubLSymbol $cb_inference_monitor_style$ = makeSymbol("*CB-INFERENCE-MONITOR-STYLE*");

    // defparameter
    public static final SubLSymbol $inference_monitors_debug_level$ = makeSymbol("*INFERENCE-MONITORS-DEBUG-LEVEL*");





    // deflexical
    private static final SubLSymbol $cb_inference_monitor_inference_id_param$ = makeSymbol("*CB-INFERENCE-MONITOR-INFERENCE-ID-PARAM*");

    // deflexical
    private static final SubLSymbol $cb_inference_monitor_store_id_param$ = makeSymbol("*CB-INFERENCE-MONITOR-STORE-ID-PARAM*");

    // deflexical
    private static final SubLSymbol $cb_inference_monitor_mode_param$ = makeSymbol("*CB-INFERENCE-MONITOR-MODE-PARAM*");

    // deflexical
    private static final SubLSymbol $cb_inference_monitor_param$ = makeSymbol("*CB-INFERENCE-MONITOR-PARAM*");

    // deflexical
    private static final SubLSymbol $cb_monitor_latest_inference_refresh_timeout_param$ = makeSymbol("*CB-MONITOR-LATEST-INFERENCE-REFRESH-TIMEOUT-PARAM*");

    // deflexical
    private static final SubLSymbol $cb_monitor_latest_inference_refresh_timeout$ = makeSymbol("*CB-MONITOR-LATEST-INFERENCE-REFRESH-TIMEOUT*");

    // deflexical
    private static final SubLSymbol $cb_latest_inference_refresh_template$ = makeSymbol("*CB-LATEST-INFERENCE-REFRESH-TEMPLATE*");

    private static final SubLList $list0 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"));

    private static final SubLString $str1$_A_did_not_specify_an_inference = makeString("~A did not specify an inference");



    private static final SubLSymbol CB_MONITOR_INFERENCE = makeSymbol("CB-MONITOR-INFERENCE");



    private static final SubLList $list5 = list(makeSymbol("STORE-ID-STRING"));

    private static final SubLString $str6$_A_did_not_specify_a_problem_stor = makeString("~A did not specify a problem store");



    private static final SubLSymbol CB_MONITOR_PROBLEM_STORE = makeSymbol("CB-MONITOR-PROBLEM-STORE");



    private static final SubLSymbol CB_MONITOR_ALL_INFERENCES = makeSymbol("CB-MONITOR-ALL-INFERENCES");

    private static final SubLSymbol $MONITOR_ALL_INFERENCES = makeKeyword("MONITOR-ALL-INFERENCES");



    private static final SubLList $list13 = list(makeKeyword("INFERENCE"));

    private static final SubLString $str14$cb_monitor_all_inferences = makeString("cb-monitor-all-inferences");



    private static final SubLString $$$Monitor_All_Inferences = makeString("Monitor All Inferences");

    private static final SubLString $str17$_Monitor_ = makeString("[Monitor]");

    private static final SubLString $str18$_Re_run_and_Monitor_ = makeString("[Re-run and Monitor]");





    private static final SubLString $str21$cb_monitor_inference__A__A = makeString("cb-monitor-inference&~A&~A");



    private static final SubLSymbol CB_LINK_MONITOR_INFERENCE = makeSymbol("CB-LINK-MONITOR-INFERENCE");

    private static final SubLSymbol $TICK_INDEXED_PROGRESS_DATA = makeKeyword("TICK-INDEXED-PROGRESS-DATA");

    private static final SubLSymbol $INFERENCE_MONITOR_HEAD = makeKeyword("INFERENCE-MONITOR-HEAD");

    private static final SubLSymbol $INFERENCE_MONITOR_TAIL = makeKeyword("INFERENCE-MONITOR-TAIL");

    private static final SubLSymbol $INFERENCE_MONITOR_TREE = makeKeyword("INFERENCE-MONITOR-TREE");

    private static final SubLSymbol $INFERENCE_MONITOR_USER_TABLE = makeKeyword("INFERENCE-MONITOR-USER-TABLE");

    private static final SubLString $str29$______selection___background_tran = makeString("\n\n *::selection { background:transparent; }\n  *::-moz-selection { background:transparent; }\n  *::-webkit-selection { background:transparent; }\n  font {\n    -moz-transition: width .25s, top .75s, left .75s, background-color .125s; \n    -webkit-transition: width .25s, top .75s, left .75s, background-color .125s; \n    -o-transition: width .25s, top .75s, left .75s, background-color .125s; \n    -moz-border-radius: 5px; border-radius: 5px;\n  }\n  .hoverclass:hover { background-color:#999999; } \n  .bluhoverclass { color:#9999ff }\n  .bluhoverclass:hover { background-color:#999999; } \n  .hilite { padding:3; color:white; background-color:orange; border:outset red 3px; z-index:200; font-size:8pt; opacity:0.9; }\n  .nolite { padding:3; color:white; background-color:#003000; border:solid purple 1px; z-index:101; font-size:8pt; opacity:0.4; }\n  .outfamilynolite { padding:3; color:gray; background-color:#dddddd; border:solid purple 1px; z-index:101; font-size:8pt; opacity:0.4; }\n  .newnode { padding:3; color:white; background-color:darkblue; border:solid black 1px; opacity:0.6; \n    -moz-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -webkit-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -o-transition: width 0s, top 0s, left 0s, background-color 0s; \n  }\n  .hideme { padding:3; color:#ffffff; background-color:#c0c0c0; border:solid black 1px; opacity:0.6; }\n  .beadhilite { height: 0; width 0; padding:0; color:#000000; background-color:#000000; border:solid orange 3px; font-size:0pt; }\n  .beadnolite { height: 0; width 0; padding:0; color:#000000; background-color:#000000; border:solid black 3px; font-size:0pt; }\n  .outfamilybeadnolite { height: 0; width 0; padding:0; color:#000000; background-color:#dddddd; border:solid #dddddd 3px; font-size:0pt; }\n  .newbeadnode { height: 0; width 0; padding:3; color:white; background-color:darkblue; border:solid black 1px; \n    -moz-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -webkit-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -o-transition: width 0s, top 0s, left 0s, background-color 0s; \n  }\n  .rootbead { height: 0; width 0; padding:3; color:white; background-color:white; border:solid gray 5px; }\n  .rootnode { padding:3; color:white; background-color:gray; border:solid black 5px; opacity:0.6; font-size:7pt;\n    -moz-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -webkit-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -o-transition: width 0s, top 0s, left 0s, background-color 0s; \n  }\n  .showfamily { padding:3; color:purple; background-color:white; border:solid green 1px; }\n  div { \n    box-shadow: 5px 5px 5px #888888; font-size:8pt;\n    -moz-border-radius: 15px; border-radius: 5px;\n  }\n  textarea { \n    box-shadow: 5px 5px 5px #888888; font-size:8pt; border: solid black 1px;\n    -moz-border-radius: 15px; border-radius: 5px;\n  }\n  input { font-size:8pt }\n  .buttclass { background-color: #bbbbbb }\n  .onbuttonmode { background-color:#ffffff; } \n  td { font-size:8pt }\n  canvas { \n    box-shadow: 5px 5px 5px #888888; \n    -moz-border-radius: 15px; border-radius: 5px;\n  }\n\n  .disabled .animationControl {visibility: hidden; }\n\n  .showadvanced .advanced { visibility: inherit; }\n  .advanced               { visibility: hidden; }\n  #debug                  { visibility: hidden; }\n  .showbulbsandlines#bulbsandlines { visibility: inherit; }\n  #bulbsandlines                   { visibility: hidden; }\n  .counter.focal          { background: beige; }\n  .counter                { background: #EEEEEE; cursor: default; }");



    private static final SubLString $str31$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str32$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLString $$$Inference_Monitor = makeString("Inference Monitor");

    private static final SubLString $str36$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");

    private static final SubLString $str37$__0 = makeString("*,0");

    private static final SubLSymbol $INFMON = makeKeyword("INFMON");

    private static final SubLString $$$infmon = makeString("infmon");

    private static final SubLString $str40$cb_inference_monitor_frame = makeString("cb-inference-monitor-frame");

    private static final SubLString $str41$__a__a__s = makeString("&~a&~a&~s");

    private static final SubLSymbol $INFMONREFRESH = makeKeyword("INFMONREFRESH");

    private static final SubLString $$$infmonrefresh = makeString("infmonrefresh");

    private static final SubLString $str44$cb_inference_monitor_refresh_fram = makeString("cb-inference-monitor-refresh-frame");





    private static final SubLList $list47 = list($INFO, $WARN);

    private static final SubLString $str48$CB_INFERENCE_MONITOR_FRAME_args__ = makeString("CB-INFERENCE-MONITOR-FRAME args: ~S");

    private static final SubLList $list49 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("MODE-STRING"));

    private static final SubLString $$$spacerdiv = makeString("spacerdiv");

    private static final SubLString $str51$height_1400px_box_shadow_none_ = makeString("height:1400px;box-shadow:none;");

    private static final SubLString $$$focalobjlabel = makeString("focalobjlabel");

    private static final SubLString $str53$box_shadow_none__font_size_large_ = makeString("box-shadow:none; font-size:large;");

    private static final SubLString $str54$Monitoring__S = makeString("Monitoring ~S");

    private static final SubLSymbol CB_INFERENCE_MONITOR_FRAME = makeSymbol("CB-INFERENCE-MONITOR-FRAME");

    private static final SubLSymbol INFERENCE_MONITOR_FOCAL_OBJECT_HTML = makeSymbol("INFERENCE-MONITOR-FOCAL-OBJECT-HTML");

    private static final SubLString $str57$New_label___S_ = makeString("New label: ~S ");

    private static final SubLSymbol $inference_monitor_focal_object_html_caching_state$ = makeSymbol("*INFERENCE-MONITOR-FOCAL-OBJECT-HTML-CACHING-STATE*");

    private static final SubLString $$$Deducing_new_facts = makeString("Deducing new facts");

    private static final SubLString $$$_from = makeString(" from");

    private static final SubLString $str61$_ = makeString(".");



    private static final SubLSymbol INFERENCE_MONITOR_FOCAL_OBJECT_PARAPHRASE = makeSymbol("INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE");





    private static final SubLSymbol $sym66$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $inference_monitor_focal_object_paraphrase_caching_state$ = makeSymbol("*INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE-CACHING-STATE*");

    private static final SubLString $str68$_INFID_ = makeString("%INFID%");

    private static final SubLString $str69$_STOREID_ = makeString("%STOREID%");

    private static final SubLString $str70$_MODE_ = makeString("%MODE%");

    private static final SubLString $str71$_INFMON_ = makeString("%INFMON%");

    private static final SubLString $str72$_TIMEOUT_ = makeString("%TIMEOUT%");



    private static final SubLString $str74$_function_perform_refresh_inferen = makeString("\nfunction perform_refresh_inference_monitor() {\n   //alert(\'refreshing inference monitor based on \'+ %STOREID% + \' \' + %INFID%);\n   self.parent.frames[\'%INFMON%\'].location.search \n    = \'cb-inference-monitor-frame&\' + %STOREID% + \'&\' + %INFID% + \'&%MODE%\';\n  }\n\nwindow.setTimeout( \'perform_refresh_inference_monitor();\', %TIMEOUT%);\n\n");

    private static final SubLString $$$null = makeString("null");

    private static final SubLSymbol $LATEST_PROBLEM_STORE = makeKeyword("LATEST-PROBLEM-STORE");

    private static final SubLString $str77$Updating_stale_inference_monitor_ = makeString("Updating stale inference monitor to ~S~% from ~S");

    private static final SubLString $str78$10__URL_cg_cb_inference_monitor_r = makeString("10; URL=cg?cb-inference-monitor-refresh-frame&");

    private static final SubLString $str79$_ = makeString("&");

    private static final SubLString $$$Refresh = makeString("Refresh");

    private static final SubLSymbol CB_INFERENCE_MONITOR_REFRESH_FRAME = makeSymbol("CB-INFERENCE-MONITOR-REFRESH-FRAME");

    private static final SubLList $list82 = list(list(makeSymbol("STORE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym83$START = makeUninternedSymbol("START");

    private static final SubLSymbol $sym84$I = makeUninternedSymbol("I");



    private static final SubLList $list86 = list(list(makeSymbol("ID-INDEX-NEXT-ID"), list(makeSymbol("PROBLEM-STORE-ID-INDEX"))));

    private static final SubLSymbol DO_NUMBERS = makeSymbol("DO-NUMBERS");



    private static final SubLList $list89 = list(makeKeyword("END"), MINUS_ONE_INTEGER, makeKeyword("DELTA"), MINUS_ONE_INTEGER);

    private static final SubLSymbol FIND_PROBLEM_STORE_BY_ID = makeSymbol("FIND-PROBLEM-STORE-BY-ID");







    private static final SubLList $list94 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str98$text_javascript = makeString("text/javascript");

    private static final SubLString $str99$var_problemStoreId_____A___var_in = makeString("var problemStoreId = \'~A\';\nvar inferenceID = \'~A\';\nmaxloc = ~A;\nmode = \'~S\';");

    private static final SubLList $list100 = list(makeString("httpd"), makeString("htdocs"), makeString("cycdoc"));

    private static final SubLString $str101$inference_monitor = makeString("inference-monitor");

    private static final SubLString $$$html = makeString("html");

    public static SubLObject cb_monitor_inference(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list0);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list0);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list0);
            return NIL;
        }
        final SubLObject inference = cb_query.cb_guess_inference(store_id_string, inference_id_string);
        if (NIL == inference_datastructures_inference.inference_p(inference)) {
            return cb_error($str1$_A_did_not_specify_an_inference, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_monitor_inference_guts(inference, $INFERENCE);
    }

    public static SubLObject cb_monitor_problem_store(final SubLObject args) {
        SubLObject store_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list5);
        store_id_string = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list5);
            return NIL;
        }
        final SubLObject store = cb_inference_browser.cb_guess_problem_store(store_id_string);
        if (NIL == inference_datastructures_problem_store.problem_store_p(store)) {
            return cb_error($str6$_A_did_not_specify_a_problem_stor, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_monitor_inference_guts(store, $PROBLEM_STORE);
    }

    public static SubLObject cb_monitor_all_inferences(final SubLObject args) {
        inference_metrics.$force_inference_tick_indexed_progress_data_collectionP$.setDynamicValue(T);
        return cb_monitor_inference_guts(NIL, $LATEST_INFERENCE);
    }

    public static SubLObject cb_link_monitor_inference(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_datastructures_inference.valid_inference_p(inference)) {
            return html_princ(princ_to_string(inference));
        }
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        final SubLObject monitorableP = inference_monitorableP(inference);
        if (NIL == linktext) {
            linktext = (NIL != monitorableP) ? $str17$_Monitor_ : $str18$_Re_run_and_Monitor_;
        }
        final SubLObject frame_name_var = cb_frame_name(NIL != monitorableP ? $NEW : $SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str21$cb_monitor_inference__A__A, store_id, inference_id);
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
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_princ(linktext);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject inference_monitorableP(final SubLObject inference) {
        return makeBoolean((NIL != inference_datastructures_inference.inference_computes_metricP(inference, $TICK_INDEXED_PROGRESS_DATA)) || (NIL != inference_metrics.inference_has_tick_indexed_progress_dataP(inference)));
    }

    public static SubLObject inference_monitor_head_script() {
        cyc_file_dependencies.javascript($INFERENCE_MONITOR_HEAD);
        return html_source_readability_terpri(UNPROVIDED);
    }

    public static SubLObject inference_monitor_tail_script() {
        cyc_file_dependencies.javascript($INFERENCE_MONITOR_TAIL);
        return html_source_readability_terpri(UNPROVIDED);
    }

    public static SubLObject inference_monitor_tree_script() {
        cyc_file_dependencies.javascript($INFERENCE_MONITOR_TREE);
        return html_source_readability_terpri(UNPROVIDED);
    }

    public static SubLObject inference_monitor_user_table_script() {
        cyc_file_dependencies.javascript($INFERENCE_MONITOR_USER_TABLE);
        return html_source_readability_terpri(UNPROVIDED);
    }

    public static SubLObject cb_monitor_inference_guts(final SubLObject inference_or_store, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != inference_or_store) && (NIL == inference_datastructures_problem_store.problem_store_p(inference_or_store))) && (NIL == inference_monitorableP(inference_or_store))) {
            final SubLObject new_properties = putf(inference_datastructures_enumerated_types.inference_input_non_default_query_properties(inference_or_store), $METRICS, cons($TICK_INDEXED_PROGRESS_DATA, inference_datastructures_inference.inference_metrics_template(inference_or_store)));
            return cb_query.cb_similar_query(inference_datastructures_inference.inference_input_el_query(inference_or_store), inference_datastructures_inference.inference_input_mt(inference_or_store), new_properties);
        }
        html_markup($str31$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str32$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Inference_Monitor);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (NIL != html_macros.html_inside_body_p()) {
                Errors.error($str36$Cannot_have_a_FRAMESET_tag_inside);
            }
            html_markup(html_macros.$html_frameset_head$.getGlobalValue());
            html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str37$__0);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject inference = (NIL != inference_datastructures_inference.inference_p(inference_or_store)) ? inference_or_store : NIL;
                final SubLObject inference_id = (NIL != inference) ? inference_datastructures_inference.inference_suid(inference) : MINUS_ONE_INTEGER;
                final SubLObject store = (NIL != inference) ? inference_datastructures_inference.inference_problem_store(inference) : NIL != inference_datastructures_problem_store.problem_store_p(inference_or_store) ? inference_or_store : NIL;
                final SubLObject store_id = (NIL != store) ? inference_datastructures_problem_store.problem_store_suid(store) : MINUS_ONE_INTEGER;
                cb_frame($INFMON, store_id, inference_id, mode, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject inference_monitor_info(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($inference_monitors_debug_level$.getDynamicValue(thread).eql($INFO)) {
            format_nil.force_format(T, format_string, arg1, arg2, arg3, arg4, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inference_monitor_warn(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != member($inference_monitors_debug_level$.getDynamicValue(thread), $list47, UNPROVIDED, UNPROVIDED)) {
            Errors.warn(format_string, new SubLObject[]{ arg1, arg2, arg3, arg4 });
        }
        return NIL;
    }

    public static SubLObject cb_inference_monitor_frame(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_monitor_info($str48$CB_INFERENCE_MONITOR_FRAME_args__, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        web_services.reset_last_monitored_inference();
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        SubLObject mode_string = NIL;
        destructuring_bind_must_consp(args, args, $list49);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list49);
        inference_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list49);
        mode_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject mode = read_from_string_ignoring_errors(mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject inference = (mode.eql($LATEST_INFERENCE)) ? NIL : cb_query.cb_guess_inference(store_id_string, inference_id_string);
            final SubLObject store = (NIL != inference) ? inference_datastructures_inference.inference_problem_store(inference) : NIL;
            html_markup($str31$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str32$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_style_head$.getGlobalValue());
                html_markup($cb_inference_monitor_style$.getGlobalValue());
                html_markup(html_macros.$html_style_tail$.getGlobalValue());
                write_inference_monitor_args(NIL != inference ? inference : store, mode);
                inference_monitor_head_script();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$spacerdiv);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str51$height_1400px_box_shadow_none_);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(get_inference_monitor_html());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$focalobjlabel);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str53$box_shadow_none__font_size_large_);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != store) {
                                inference_monitor_info($str54$Monitoring__S, store, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_output_inference_monitor_focal_object(inference, store);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        inference_monitor_user_table_script();
                        inference_monitor_tail_script();
                        inference_monitor_tree_script();
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } else {
            cdestructuring_bind_error(args, $list49);
        }
        return NIL;
    }

    public static SubLObject html_output_inference_monitor_focal_object(final SubLObject inference, final SubLObject store) {
        html_markup(inference_monitor_focal_object_html(inference, store));
        return NIL != inference ? inference : store;
    }

    public static SubLObject clear_inference_monitor_focal_object_html() {
        final SubLObject cs = $inference_monitor_focal_object_html_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_inference_monitor_focal_object_html(final SubLObject inference, final SubLObject store) {
        return memoization_state.caching_state_remove_function_results_with_args($inference_monitor_focal_object_html_caching_state$.getGlobalValue(), list(inference, store), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_monitor_focal_object_html_internal(final SubLObject inference, final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject html = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_output_inference_monitor_focal_object_internal(inference, store);
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            html = get_output_stream_string(stream);
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
        inference_monitor_info($str57$New_label___S_, html, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return html;
    }

    public static SubLObject inference_monitor_focal_object_html(final SubLObject inference, final SubLObject store) {
        SubLObject caching_state = $inference_monitor_focal_object_html_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(INFERENCE_MONITOR_FOCAL_OBJECT_HTML, $inference_monitor_focal_object_html_caching_state$, SIXTEEN_INTEGER, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(inference, store);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (inference.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && store.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(inference_monitor_focal_object_html_internal(inference, store)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(inference, store));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject html_output_inference_monitor_focal_object_internal(final SubLObject inference, final SubLObject store) {
        if ((NIL != inference_datastructures_problem_store.problem_store_p(store)) && (NIL != inference_datastructures_problem_store.problem_store_forwardP(store))) {
            html_princ($$$Deducing_new_facts);
            final SubLObject now_propagating = forward.all_currently_forward_propagating_assertions();
            if (NIL != list_utilities.singletonP(now_propagating)) {
                final SubLObject focal_as = list_utilities.only_one(now_propagating);
                html_princ($$$_from);
                html_newline(UNPROVIDED);
                cb_form(uncanonicalizer.assertion_el_formula(focal_as), ZERO_INTEGER, T);
            } else {
                html_princ($str61$_);
            }
        } else
            if (NIL != inference) {
                final SubLObject query_sentence = inference_datastructures_inference.inference_input_el_query(inference);
                if ((NIL != cycl_grammar.cycl_expression_p(query_sentence)) && (NIL == show_inference_monitor_focal_object_paraphrase(query_sentence, $INTERROGATIVE))) {
                    cb_form(query_sentence, ZERO_INTEGER, T);
                }
            } else {
                cb_form(store, UNPROVIDED, UNPROVIDED);
            }

        return NIL != inference ? inference : store;
    }

    public static SubLObject show_inference_monitor_focal_object_paraphrase(final SubLObject v_object, final SubLObject force) {
        SubLObject displayedP = NIL;
        final SubLObject paraphrase = inference_monitor_focal_object_paraphrase(v_object, force);
        if (NIL != list_utilities.lengthG(paraphrase, ZERO_INTEGER, UNPROVIDED)) {
            html_markup(cycl_string.cycl_string_to_utf8_string(paraphrase));
            displayedP = T;
        }
        return displayedP;
    }

    public static SubLObject clear_inference_monitor_focal_object_paraphrase() {
        final SubLObject cs = $inference_monitor_focal_object_paraphrase_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_inference_monitor_focal_object_paraphrase(final SubLObject v_object, final SubLObject force) {
        return memoization_state.caching_state_remove_function_results_with_args($inference_monitor_focal_object_paraphrase_caching_state$.getGlobalValue(), list(v_object, force), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_monitor_focal_object_paraphrase_internal(final SubLObject v_object, final SubLObject force) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$6 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$7 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$8 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$10 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = pph_vars.$constant_link_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = pph_vars.$pph_introduce_anaphorsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                        pph_vars.$paraphrase_mode$.bind($HTML, thread);
                                        pph_vars.$constant_link_function$.bind($NONE, thread);
                                        pph_vars.$pph_introduce_anaphorsP$.bind(NIL, thread);
                                        pph_vars.$pph_demerit_cutoff$.bind(ONE_INTEGER, thread);
                                        return pph_main.generate_text_wXsentential_force(v_object, force, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_5, thread);
                                        pph_vars.$pph_introduce_anaphorsP$.rebind(_prev_bind_4, thread);
                                        pph_vars.$constant_link_function$.rebind(_prev_bind_3, thread);
                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$10, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$9, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$8, thread);
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$7, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject inference_monitor_focal_object_paraphrase(final SubLObject v_object, final SubLObject force) {
        SubLObject caching_state = $inference_monitor_focal_object_paraphrase_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(INFERENCE_MONITOR_FOCAL_OBJECT_PARAPHRASE, $inference_monitor_focal_object_paraphrase_caching_state$, SIXTEEN_INTEGER, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_object, force);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_object.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && force.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(inference_monitor_focal_object_paraphrase_internal(v_object, force)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_object, force));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject construct_cb_monitor_refresh_template(final SubLObject inference_or_store, final SubLObject mode) {
        final SubLObject inference_id_string = (NIL != inference_datastructures_inference.inference_p(inference_or_store)) ? format_nil.format_nil_a(inference_datastructures_inference.inference_suid(inference_or_store)) : $$$null;
        final SubLObject problem_store = (NIL != inference_datastructures_problem_store.problem_store_p(inference_or_store)) ? inference_or_store : NIL != inference_datastructures_inference.inference_p(inference_or_store) ? inference_datastructures_inference.inference_problem_store(inference_or_store) : NIL;
        final SubLObject problem_store_id_string = (NIL != problem_store) ? format_nil.format_nil_a(inference_datastructures_problem_store.problem_store_suid(problem_store)) : $$$null;
        final SubLObject substitutions = list(cons($cb_inference_monitor_param$.getGlobalValue(), $$$infmon), cons($cb_inference_monitor_mode_param$.getGlobalValue(), format_nil.format_nil_s(mode)), cons($cb_inference_monitor_store_id_param$.getGlobalValue(), problem_store_id_string), cons($cb_inference_monitor_inference_id_param$.getGlobalValue(), inference_id_string), cons($cb_monitor_latest_inference_refresh_timeout_param$.getGlobalValue(), string_utilities.to_string($cb_monitor_latest_inference_refresh_timeout$.getGlobalValue())));
        return html_script_utilities.instantiate_javascript_template($cb_latest_inference_refresh_template$.getGlobalValue(), substitutions);
    }

    public static SubLObject update_cb_monitor_latest_frame(final SubLObject inference_or_store, final SubLObject mode) {
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
            html_markup(construct_cb_monitor_refresh_template(inference_or_store, mode));
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_inference_monitor_refresh_frame(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        SubLObject mode_string = NIL;
        destructuring_bind_must_consp(args, args, $list49);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list49);
        inference_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list49);
        mode_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject problem_store = cb_inference_browser.cb_guess_problem_store(store_id_string);
            final SubLObject inference = cb_query.cb_guess_inference(store_id_string, inference_id_string);
            final SubLObject mode = read_from_string_ignoring_errors(mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject latest = (mode.eql($LATEST_INFERENCE)) ? latest_monitorable_inference() : mode.eql($LATEST_PROBLEM_STORE) ? latest_monitorable_problem_store() : NIL;
            final SubLObject staleP = (mode.eql($LATEST_INFERENCE)) ? makeBoolean(!inference.eql(latest)) : mode.eql($LATEST_PROBLEM_STORE) ? makeBoolean(!problem_store.eql(latest)) : NIL;
            html_markup($str31$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str32$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                if (NIL != staleP) {
                    inference_monitor_info($str77$Updating_stale_inference_monitor_, latest, NIL != inference ? inference : problem_store, UNPROVIDED, UNPROVIDED);
                    update_cb_monitor_latest_frame(latest, mode);
                    final SubLObject pcase_var = mode;
                    if (pcase_var.eql($LATEST_INFERENCE)) {
                        inference_id_string = princ_to_string(inference_datastructures_inference.inference_suid(latest));
                        store_id_string = princ_to_string(inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(latest)));
                    } else
                        if (pcase_var.eql($LATEST_PROBLEM_STORE)) {
                            store_id_string = princ_to_string(inference_datastructures_problem_store.problem_store_suid(latest));
                        }

                }
                final SubLObject content = cconcatenate($str78$10__URL_cg_cb_inference_monitor_r, new SubLObject[]{ format_nil.format_nil_a_no_copy(store_id_string), $str79$_, format_nil.format_nil_a_no_copy(inference_id_string), $str79$_, format_nil.format_nil_s_no_copy(mode) });
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_meta_head$.getGlobalValue());
                html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$Refresh);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != content) {
                    html_markup(html_macros.$html_meta_content$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(content);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
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
        } else {
            cdestructuring_bind_error(args, $list49);
        }
        return NIL;
    }

    public static SubLObject do_problem_stores_descending(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject store = NIL;
        destructuring_bind_must_consp(current, datum, $list82);
        store = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject start = $sym83$START;
            final SubLObject i = $sym84$I;
            return list(CLET, list(bq_cons(start, $list86)), list(DO_NUMBERS, listS(i, $START, start, $list89), list(CLET, list(list(store, list(FIND_PROBLEM_STORE_BY_ID, i))), listS(PWHEN, store, append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list82);
        return NIL;
    }

    public static SubLObject latest_monitorable_problem_store() {
        final SubLObject start = id_index_next_id(inference_datastructures_problem_store.problem_store_id_index());
        SubLObject end_var;
        SubLObject i;
        SubLObject store;
        for (end_var = MINUS_ONE_INTEGER, i = NIL, i = start; !i.numLE(end_var); i = add(i, MINUS_ONE_INTEGER)) {
            store = inference_datastructures_problem_store.find_problem_store_by_id(i);
            if ((NIL != store) && (NIL != problem_store_monitorableP(store))) {
                return store;
            }
        }
        return NIL;
    }

    public static SubLObject problem_store_monitorableP(final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = eql(ZERO_INTEGER, inference_datastructures_problem_store.problem_store_inference_count(store));
        SubLObject err_msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$15 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$15, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$15);
                            final SubLObject backwardP_var = NIL;
                            final SubLObject length = length(vector_var);
                            SubLObject current;
                            final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                            SubLObject start = NIL;
                            SubLObject end = NIL;
                            SubLObject delta = NIL;
                            destructuring_bind_must_consp(current, datum, $list94);
                            start = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list94);
                            end = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list94);
                            delta = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL == badP) {
                                    SubLObject end_var;
                                    SubLObject id;
                                    SubLObject inference;
                                    for (end_var = end, id = NIL, id = start; (NIL == badP) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                                        inference = aref(vector_var, id);
                                        if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(inference)) {
                                                inference = $SKIP;
                                            }
                                            if (NIL == inference_monitorableP(inference)) {
                                                badP = T;
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list94);
                            }
                        }
                        final SubLObject idx_$16 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$16)) && (NIL == badP)) {
                            SubLObject catch_var = NIL;
                            try {
                                thread.throwStack.push($DO_HASH_TABLE);
                                final SubLObject cdohash_table = id_index_sparse_objects(idx_$16);
                                SubLObject id2 = NIL;
                                SubLObject inference2 = NIL;
                                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        id2 = getEntryKey(cdohash_entry);
                                        inference2 = getEntryValue(cdohash_entry);
                                        subl_macros.do_hash_table_done_check(badP);
                                        if (NIL == inference_monitorableP(inference2)) {
                                            badP = T;
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                    }
                } catch (final Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            err_msg = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return makeBoolean((NIL == err_msg) && (NIL == badP));
    }

    public static SubLObject latest_monitorable_inference() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject start = id_index_next_id(inference_datastructures_problem_store.problem_store_id_index());
                    SubLObject end_var;
                    SubLObject i;
                    SubLObject store;
                    SubLObject ignore_errors_tag_$17;
                    SubLObject _prev_bind_0_$18;
                    SubLObject latest_id;
                    SubLObject latest_inference;
                    SubLObject idx;
                    SubLObject idx_$19;
                    SubLObject vector_var;
                    SubLObject backwardP_var;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    SubLObject ignore_errors_tag_$18;
                    SubLObject _prev_bind_0_$19;
                    SubLObject id_$22;
                    SubLObject idx_$20;
                    SubLObject cdohash_table;
                    SubLObject id2;
                    SubLObject inference2;
                    Iterator cdohash_iterator;
                    Map.Entry cdohash_entry;
                    SubLObject ignore_errors_tag_$19;
                    SubLObject _prev_bind_0_$20;
                    SubLObject id_$23;
                    for (end_var = MINUS_ONE_INTEGER, i = NIL, i = start; !i.numLE(end_var); i = add(i, MINUS_ONE_INTEGER)) {
                        store = inference_datastructures_problem_store.find_problem_store_by_id(i);
                        if (NIL != store) {
                            ignore_errors_tag_$17 = NIL;
                            try {
                                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                _prev_bind_0_$18 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        latest_id = MINUS_ONE_INTEGER;
                                        latest_inference = NIL;
                                        idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                                        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                                            idx_$19 = idx;
                                            if (NIL == id_index_dense_objects_empty_p(idx_$19, $SKIP)) {
                                                vector_var = id_index_dense_objects(idx_$19);
                                                backwardP_var = NIL;
                                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                    inference = aref(vector_var, id);
                                                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                        if (NIL != id_index_tombstone_p(inference)) {
                                                            inference = $SKIP;
                                                        }
                                                        ignore_errors_tag_$18 = NIL;
                                                        try {
                                                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                                            _prev_bind_0_$19 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                try {
                                                                    if (NIL != inference_monitorableP(inference)) {
                                                                        id_$22 = inference_datastructures_inference.inference_suid(inference);
                                                                        if (id_$22.numG(latest_id)) {
                                                                            latest_inference = inference;
                                                                            latest_id = id_$22;
                                                                        }
                                                                    }
                                                                } catch (final Throwable catch_var) {
                                                                    Errors.handleThrowable(catch_var, NIL);
                                                                }
                                                            } finally {
                                                                Errors.$error_handler$.rebind(_prev_bind_0_$19, thread);
                                                            }
                                                        } catch (final Throwable ccatch_env_var) {
                                                            ignore_errors_tag_$18 = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                        } finally {
                                                            thread.throwStack.pop();
                                                        }
                                                    }
                                                }
                                            }
                                            idx_$20 = idx;
                                            if (NIL == id_index_sparse_objects_empty_p(idx_$20)) {
                                                cdohash_table = id_index_sparse_objects(idx_$20);
                                                id2 = NIL;
                                                inference2 = NIL;
                                                cdohash_iterator = getEntrySetIterator(cdohash_table);
                                                try {
                                                    while (iteratorHasNext(cdohash_iterator)) {
                                                        cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                        id2 = getEntryKey(cdohash_entry);
                                                        inference2 = getEntryValue(cdohash_entry);
                                                        ignore_errors_tag_$19 = NIL;
                                                        try {
                                                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                                            _prev_bind_0_$20 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                try {
                                                                    if (NIL == inference_monitorableP(inference2)) {
                                                                        continue;
                                                                    }
                                                                    id_$23 = inference_datastructures_inference.inference_suid(inference2);
                                                                    if (!id_$23.numG(latest_id)) {
                                                                        continue;
                                                                    }
                                                                    latest_inference = inference2;
                                                                    latest_id = id_$23;
                                                                } catch (final Throwable catch_var2) {
                                                                    Errors.handleThrowable(catch_var2, NIL);
                                                                }
                                                            } finally {
                                                                Errors.$error_handler$.rebind(_prev_bind_0_$20, thread);
                                                            }
                                                        } catch (final Throwable ccatch_env_var2) {
                                                            ignore_errors_tag_$19 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                                                        } finally {
                                                            thread.throwStack.pop();
                                                        }
                                                    } 
                                                } finally {
                                                    releaseEntrySetIterator(cdohash_iterator);
                                                }
                                            }
                                        }
                                        if (NIL != latest_inference) {
                                            return latest_inference;
                                        }
                                    } catch (final Throwable catch_var3) {
                                        Errors.handleThrowable(catch_var3, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$18, thread);
                                }
                            } catch (final Throwable ccatch_env_var3) {
                                ignore_errors_tag_$17 = Errors.handleThrowable(ccatch_env_var3, $IGNORE_ERRORS_TARGET);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                    }
                } catch (final Throwable catch_var4) {
                    Errors.handleThrowable(catch_var4, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var4) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var4, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject write_inference_monitor_args(final SubLObject store_or_inference, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference = (NIL != inference_datastructures_inference.inference_p(store_or_inference)) ? store_or_inference : NIL;
        final SubLObject store = (NIL != inference) ? inference_datastructures_inference.inference_problem_store(inference) : NIL != inference_datastructures_problem_store.problem_store_p(store_or_inference) ? store_or_inference : NIL;
        final SubLObject maxloc = (NIL != inference) ? inference_metrics.inference_tick_count(inference) : NIL != store ? problem_store_tick_count_total(store) : $$$null;
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str98$text_javascript);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str99$var_problemStoreId_____A___var_in, new SubLObject[]{ NIL != store ? inference_datastructures_problem_store.problem_store_suid(store) : $$$null, NIL != inference ? inference_datastructures_inference.inference_suid(inference) : $$$null, maxloc, mode });
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return store_or_inference;
    }

    public static SubLObject problem_store_tick_count_total(final SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$27 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$27, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$27);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        count = add(count, inference_metrics.inference_tick_count(inference));
                    }
                }
            }
            final SubLObject idx_$28 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$28)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$28);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        count = add(count, inference_metrics.inference_tick_count(inference2));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    public static SubLObject get_inference_monitor_html() {
        return string_utilities.read_string_from_file(file_utilities.cyc_home_filename($list100, $str101$inference_monitor, $$$html), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_cb_inference_monitors_file() {
        declareFunction("cb_monitor_inference", "CB-MONITOR-INFERENCE", 1, 0, false);
        declareFunction("cb_monitor_problem_store", "CB-MONITOR-PROBLEM-STORE", 1, 0, false);
        declareFunction("cb_monitor_all_inferences", "CB-MONITOR-ALL-INFERENCES", 1, 0, false);
        declareFunction("cb_link_monitor_inference", "CB-LINK-MONITOR-INFERENCE", 1, 1, false);
        declareFunction("inference_monitorableP", "INFERENCE-MONITORABLE?", 1, 0, false);
        declareFunction("inference_monitor_head_script", "INFERENCE-MONITOR-HEAD-SCRIPT", 0, 0, false);
        declareFunction("inference_monitor_tail_script", "INFERENCE-MONITOR-TAIL-SCRIPT", 0, 0, false);
        declareFunction("inference_monitor_tree_script", "INFERENCE-MONITOR-TREE-SCRIPT", 0, 0, false);
        declareFunction("inference_monitor_user_table_script", "INFERENCE-MONITOR-USER-TABLE-SCRIPT", 0, 0, false);
        declareFunction("cb_monitor_inference_guts", "CB-MONITOR-INFERENCE-GUTS", 2, 0, false);
        declareFunction("inference_monitor_info", "INFERENCE-MONITOR-INFO", 1, 4, false);
        declareFunction("inference_monitor_warn", "INFERENCE-MONITOR-WARN", 1, 4, false);
        declareFunction("cb_inference_monitor_frame", "CB-INFERENCE-MONITOR-FRAME", 1, 0, false);
        declareFunction("html_output_inference_monitor_focal_object", "HTML-OUTPUT-INFERENCE-MONITOR-FOCAL-OBJECT", 2, 0, false);
        declareFunction("clear_inference_monitor_focal_object_html", "CLEAR-INFERENCE-MONITOR-FOCAL-OBJECT-HTML", 0, 0, false);
        declareFunction("remove_inference_monitor_focal_object_html", "REMOVE-INFERENCE-MONITOR-FOCAL-OBJECT-HTML", 2, 0, false);
        declareFunction("inference_monitor_focal_object_html_internal", "INFERENCE-MONITOR-FOCAL-OBJECT-HTML-INTERNAL", 2, 0, false);
        declareFunction("inference_monitor_focal_object_html", "INFERENCE-MONITOR-FOCAL-OBJECT-HTML", 2, 0, false);
        declareFunction("html_output_inference_monitor_focal_object_internal", "HTML-OUTPUT-INFERENCE-MONITOR-FOCAL-OBJECT-INTERNAL", 2, 0, false);
        declareFunction("show_inference_monitor_focal_object_paraphrase", "SHOW-INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE", 2, 0, false);
        declareFunction("clear_inference_monitor_focal_object_paraphrase", "CLEAR-INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE", 0, 0, false);
        declareFunction("remove_inference_monitor_focal_object_paraphrase", "REMOVE-INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE", 2, 0, false);
        declareFunction("inference_monitor_focal_object_paraphrase_internal", "INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE-INTERNAL", 2, 0, false);
        declareFunction("inference_monitor_focal_object_paraphrase", "INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE", 2, 0, false);
        declareFunction("construct_cb_monitor_refresh_template", "CONSTRUCT-CB-MONITOR-REFRESH-TEMPLATE", 2, 0, false);
        declareFunction("update_cb_monitor_latest_frame", "UPDATE-CB-MONITOR-LATEST-FRAME", 2, 0, false);
        declareFunction("cb_inference_monitor_refresh_frame", "CB-INFERENCE-MONITOR-REFRESH-FRAME", 1, 0, false);
        declareMacro("do_problem_stores_descending", "DO-PROBLEM-STORES-DESCENDING");
        declareFunction("latest_monitorable_problem_store", "LATEST-MONITORABLE-PROBLEM-STORE", 0, 0, false);
        declareFunction("problem_store_monitorableP", "PROBLEM-STORE-MONITORABLE?", 1, 0, false);
        declareFunction("latest_monitorable_inference", "LATEST-MONITORABLE-INFERENCE", 0, 0, false);
        declareFunction("write_inference_monitor_args", "WRITE-INFERENCE-MONITOR-ARGS", 2, 0, false);
        declareFunction("problem_store_tick_count_total", "PROBLEM-STORE-TICK-COUNT-TOTAL", 1, 0, false);
        declareFunction("get_inference_monitor_html", "GET-INFERENCE-MONITOR-HTML", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_inference_monitors_file() {
        deflexical("*CB-INFERENCE-MONITOR-STYLE*", $str29$______selection___background_tran);
        defparameter("*INFERENCE-MONITORS-DEBUG-LEVEL*", $OFF);
        deflexical("*INFERENCE-MONITOR-FOCAL-OBJECT-HTML-CACHING-STATE*", NIL);
        deflexical("*INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE-CACHING-STATE*", NIL);
        deflexical("*CB-INFERENCE-MONITOR-INFERENCE-ID-PARAM*", $str68$_INFID_);
        deflexical("*CB-INFERENCE-MONITOR-STORE-ID-PARAM*", $str69$_STOREID_);
        deflexical("*CB-INFERENCE-MONITOR-MODE-PARAM*", $str70$_MODE_);
        deflexical("*CB-INFERENCE-MONITOR-PARAM*", $str71$_INFMON_);
        deflexical("*CB-MONITOR-LATEST-INFERENCE-REFRESH-TIMEOUT-PARAM*", $str72$_TIMEOUT_);
        deflexical("*CB-MONITOR-LATEST-INFERENCE-REFRESH-TIMEOUT*", $int$1000);
        deflexical("*CB-LATEST-INFERENCE-REFRESH-TEMPLATE*", $str74$_function_perform_refresh_inferen);
        return NIL;
    }

    public static SubLObject setup_cb_inference_monitors_file() {
        html_macros.note_cgi_handler_function(CB_MONITOR_INFERENCE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_MONITOR_PROBLEM_STORE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_MONITOR_ALL_INFERENCES, $HTML_HANDLER);
        cyc_navigator_internals.def_navigator_link($MONITOR_ALL_INFERENCES, $TEXT, $list13, $str14$cb_monitor_all_inferences, ZERO_INTEGER, $BLANK, $$$Monitor_All_Inferences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        setup_cb_link_method($MONITOR_INFERENCE, CB_LINK_MONITOR_INFERENCE, TWO_INTEGER);
        register_cb_frame($INFMON, $$$infmon, $str40$cb_inference_monitor_frame, $str41$__a__a__s, UNPROVIDED, UNPROVIDED);
        register_cb_frame($INFMONREFRESH, $$$infmonrefresh, $str44$cb_inference_monitor_refresh_fram, $str41$__a__a__s, UNPROVIDED, UNPROVIDED);
        html_macros.note_cgi_handler_function(CB_INFERENCE_MONITOR_FRAME, $HTML_HANDLER);
        memoization_state.note_globally_cached_function(INFERENCE_MONITOR_FOCAL_OBJECT_HTML);
        memoization_state.note_globally_cached_function(INFERENCE_MONITOR_FOCAL_OBJECT_PARAPHRASE);
        html_macros.note_cgi_handler_function(CB_INFERENCE_MONITOR_REFRESH_FRAME, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_inference_monitors_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_inference_monitors_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_inference_monitors_file();
    }

    static {



















































































































    }
}

/**
 * Total time: 531 ms
 */
