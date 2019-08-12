package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
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

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_proof_view extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new cb_proof_view();

    public static final String myName = "com.cyc.cycjava_2.cycl.cb_proof_view";








    // defparameter
    public static final SubLSymbol $cb_proof_view_show_bug_report_linksP$ = makeSymbol("*CB-PROOF-VIEW-SHOW-BUG-REPORT-LINKS?*");

    // defparameter
    public static final SubLSymbol $cb_proof_view_include_story_sectionP$ = makeSymbol("*CB-PROOF-VIEW-INCLUDE-STORY-SECTION?*");







    // deflexical
    private static final SubLSymbol $cb_proof_view_estimated_paraphrase_to_construction_ratio$ = makeSymbol("*CB-PROOF-VIEW-ESTIMATED-PARAPHRASE-TO-CONSTRUCTION-RATIO*");

    // deflexical
    private static final SubLSymbol $cb_proof_view_time_estimates$ = makeSymbol("*CB-PROOF-VIEW-TIME-ESTIMATES*");

    // deflexical
    private static final SubLSymbol $cb_proof_view_time_estimates_log$ = makeSymbol("*CB-PROOF-VIEW-TIME-ESTIMATES-LOG*");





    private static final SubLString $str0$_Proof_View_ = makeString("[Proof View]");



    private static final SubLString $str2$cb_assertion_proof_view__A = makeString("cb-assertion-proof-view&~A");

    private static final SubLSymbol $ASSERTION_PROOF_VIEW = makeKeyword("ASSERTION-PROOF-VIEW");

    private static final SubLSymbol CB_LINK_ASSERTION_PROOF_VIEW = makeSymbol("CB-LINK-ASSERTION-PROOF-VIEW");

    private static final SubLString $str5$Proof_View_Problem = makeString("Proof-View Problem");

    private static final SubLString $str6$cg_cb_proof_view_bug_report_ = makeString("cg?cb-proof-view-bug-report&");

    private static final SubLString $str7$_ = makeString("&");

    private static final SubLString $$$jira = makeString("jira");

    private static final SubLInteger $int$900 = makeInteger(900);

    private static final SubLInteger $int$800 = makeInteger(800);

    private static final SubLString $str11$pf_bug = makeString("pf-bug");

    private static final SubLSymbol $HTML_JIRA_IMAGE = makeKeyword("HTML-JIRA-IMAGE");





    private static final SubLSymbol $PROOF_VIEW_BUG = makeKeyword("PROOF-VIEW-BUG");

    private static final SubLSymbol CB_LINK_PROOF_VIEW_BUG = makeSymbol("CB-LINK-PROOF-VIEW-BUG");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str19$Couldn_t_find_a_proof_view_with_I = makeString("Couldn't find a proof view with ID ~S");

    private static final SubLString $str20$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str21$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLString $str24$Report_Proof_View_Problem = makeString("Report Proof-View Problem");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str26$cb_process_proof_view_bug_report = makeString("cb-process-proof-view-bug-report");

    private static final SubLString $str27$proof_view_id = makeString("proof-view-id");

    private static final SubLString $str28$proof_view_entry_id = makeString("proof-view-entry-id");

    private static final SubLString $str29$Proof_View_Entry_ = makeString("Proof-View Entry:");

    private static final SubLString $$$showcycl = makeString("showcycl");

    private static final SubLString $str31$background___EEE__border__ridge_6 = makeString("background: #EEE; border: ridge 6px");

    private static final SubLString $str32$Please_indicate_what_the_problem_ = makeString("Please indicate what the problem is:");

    private static final SubLString $$$problem = makeString("problem");



    private static final SubLString $$$Trivial = makeString("Trivial");



    private static final SubLString $$$Irrelevant = makeString("Irrelevant");

    private static final SubLSymbol $BAD_PARAPHRASE = makeKeyword("BAD-PARAPHRASE");

    private static final SubLString $$$Bad_Paraphrase = makeString("Bad Paraphrase");

    private static final SubLSymbol $WRONG_LOCATION = makeKeyword("WRONG-LOCATION");

    private static final SubLString $$$Wrong_Location_in_Justification = makeString("Wrong Location in Justification");



    private static final SubLString $str43$Other__please_explain_ = makeString("Other (please explain)");

    private static final SubLString $str44$Details__ = makeString("Details: ");

    private static final SubLString $$$details = makeString("details");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $$$virtual = makeString("virtual");

    private static final SubLString $$$Go_to_JIRA_to_Submit = makeString("Go to JIRA to Submit");



    private static final SubLSymbol CB_PROOF_VIEW_BUG_REPORT = makeSymbol("CB-PROOF-VIEW-BUG-REPORT");



    private static final SubLString $str52$Proof_View_Problem__ = makeString("Proof-View Problem (");

    private static final SubLString $str53$_ = makeString(")");

    private static final SubLString $str54$Query____A____ = makeString("Query:~%~A~%~%");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    private static final SubLString $str56$Answer____A____ = makeString("Answer:~%~A~%~%");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLString $str58$Entry__D____A___A = makeString("Entry ~D:~%~A~%~A");

    private static final SubLString $str59$____Details_____A = makeString("~%~%Details:~% ~A");

    private static final SubLList $list60 = list(new SubLObject[]{ makeKeyword("PID"), makeInteger(10800), makeKeyword("COMPONENTS"), makeInteger(11301), makeKeyword("ISSUETYPE"), ONE_INTEGER, makeKeyword("PRIORITY"), THREE_INTEGER, makeKeyword("ASSIGNEE"), makeString("baxter") });

    private static final SubLSymbol CB_PROCESS_PROOF_VIEW_BUG_REPORT = makeSymbol("CB-PROCESS-PROOF-VIEW-BUG-REPORT");

    private static final SubLString $str62$_A_does_not_specify_an_assertion = makeString("~A does not specify an assertion");

    private static final SubLSymbol CB_ASSERTION_PROOF_VIEW = makeSymbol("CB-ASSERTION-PROOF-VIEW");



    private static final SubLSymbol CB_PROOF_VIEW_SENTENCE_ANSWER_CACHED = makeSymbol("CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED");





    private static final SubLSymbol $cb_proof_view_sentence_answer_cached_caching_state$ = makeSymbol("*CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED-CACHING-STATE*");

    private static final SubLList $list69 = list(makeSymbol("SENTENCE-ID"), makeSymbol("&REST"), makeSymbol("MORE-ARGS"));

    private static final SubLString $str70$_A_does_not_specify_a_CycL_senten = makeString("~A does not specify a CycL sentence");

    private static final SubLString $$$mt = makeString("mt");

    private static final SubLString $$$task = makeString("task");

    private static final SubLString $$$mode = makeString("mode");

    private static final SubLString $str74$Could_not_prove__S_in__S = makeString("Could not prove ~S in ~S");

    private static final SubLSymbol CB_SENTENCE_PROOF_VIEW = makeSymbol("CB-SENTENCE-PROOF-VIEW");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));





    private static final SubLString $str79$_Proof_ = makeString("[Proof ");

    private static final SubLString $str80$_ = makeString(".");

    private static final SubLString $str81$_ = makeString("]");

    private static final SubLString $str82$cb_simple_proof_view__A__A__A__A_ = makeString("cb-simple-proof-view&~A&~A&~A&~A~A");

    private static final SubLString $str83$_debug_T = makeString("&debug=T");

    private static final SubLString $str84$ = makeString("");

    private static final SubLSymbol $SIMPLE_PROOF_VIEW = makeKeyword("SIMPLE-PROOF-VIEW");

    private static final SubLSymbol CB_LINK_SIMPLE_PROOF_VIEW = makeSymbol("CB-LINK-SIMPLE-PROOF-VIEW");

    public static final SubLSymbol $cb_proof_view_memoization_state_index$ = makeSymbol("*CB-PROOF-VIEW-MEMOIZATION-STATE-INDEX*");



    public static final SubLSymbol $cb_proof_view_default_params$ = makeSymbol("*CB-PROOF-VIEW-DEFAULT-PARAMS*");

    private static final SubLSymbol $sym90$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__ = makeSymbol("*CB-PROOF-VIEW-SHOW-BUG-REPORT-LINKS?*");

    private static final SubLSymbol $sym91$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol CB_SIMPLE_PROOF_VIEW = makeSymbol("CB-SIMPLE-PROOF-VIEW");

    private static final SubLSymbol $sym93$_CB_PROOF_VIEW_INCLUDE_STORY_SECTION__ = makeSymbol("*CB-PROOF-VIEW-INCLUDE-STORY-SECTION?*");

    private static final SubLString $str94$memoization_state = makeString("memoization-state");

    private static final SubLString $str95$suppress_summary = makeString("suppress-summary");

    private static final SubLString $$$debug = makeString("debug");

    private static final SubLString $str97$suppress_detailed = makeString("suppress-detailed");

    private static final SubLString $str98$suppress_linear = makeString("suppress-linear");

    private static final SubLString $str99$suppress_bookkeeping = makeString("suppress-bookkeeping");

    private static final SubLString $str100$suppress_cyclists = makeString("suppress-cyclists");

    private static final SubLString $str101$suppress_assertion_dates = makeString("suppress-assertion-dates");

    private static final SubLString $str102$suppress_cyclist_employers = makeString("suppress-cyclist-employers");

    private static final SubLString $str103$suppress_links_in_nl = makeString("suppress-links-in-nl");

    private static final SubLString $str104$suppress_phrase_links = makeString("suppress-phrase-links");

    private static final SubLSymbol $STORY = makeKeyword("STORY");

    private static final SubLList $list106 = list(makeSymbol("STORE-SUID-STRING"), makeSymbol("PROOF-SUID-STRING"), makeSymbol("INFERENCE-SUID-STRING"), makeSymbol("ANSWER-SUID-STRING"), makeSymbol("&REST"), makeSymbol("MORE-ARGS"));









    private static final SubLSymbol PROOF_VIEW_P = makeSymbol("PROOF-VIEW-P");

    private static final SubLString $str112$_Proof_View_ = makeString("[Proof View ");

    private static final SubLString $str113$cb_show_proof_view__A = makeString("cb-show-proof-view&~A");

    private static final SubLSymbol $SHOW_PROOF_VIEW = makeKeyword("SHOW-PROOF-VIEW");

    private static final SubLSymbol CB_LINK_SHOW_PROOF_VIEW = makeSymbol("CB-LINK-SHOW-PROOF-VIEW");

    private static final SubLList $list116 = list(makeSymbol("PROOF-VIEW-ID"));

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str119$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$Proof_View = makeString("Proof View");

    private static final SubLString $str125$_S_does_not_identify_an_existing_ = makeString("~S does not identify an existing proof view.");

    private static final SubLSymbol CB_SHOW_PROOF_VIEW = makeSymbol("CB-SHOW-PROOF-VIEW");

    public static final SubLSymbol $cb_proof_views$ = makeSymbol("*CB-PROOF-VIEWS*");

    public static final SubLSymbol $cb_proof_view_threads$ = makeSymbol("*CB-PROOF-VIEW-THREADS*");

    private static final SubLString $str129$CB_Proof_View_Preparer_for_proof_ = makeString("CB Proof View Preparer for proof-view ");

    private static final SubLString $$$_of_proof_ = makeString(" of proof ");

    private static final SubLSymbol PREPARE_CB_PROOF_VIEW = makeSymbol("PREPARE-CB-PROOF-VIEW");

    private static final SubLSymbol $cb_proof_view_entries_paraphrased$ = makeSymbol("*CB-PROOF-VIEW-ENTRIES-PARAPHRASED*");



    private static final SubLList $list134 = list(makeString("data"));

    private static final SubLString $str135$cb_proof_view_time_estimates = makeString("cb-proof-view-time-estimates");

    private static final SubLString $$$log = makeString("log");



    private static final SubLString $str138$Unable_to_open__S = makeString("Unable to open ~S");



    private static final SubLList $list140 = list(makeSymbol("PERCENT-READY"), makeSymbol("ESTIMATE"), makeSymbol("UNIVERSAL-TIME"));



    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLSymbol CB_PROOF_VIEW_HISTORICAL_FUDGE_FACTORS = makeSymbol("CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);



    private static final SubLList $list146 = list(CHAR_tab);

    private static final SubLString $str147$_ = makeString("\"");

    private static final SubLList $list148 = list(makeSymbol("PERCENT-DONE"), makeSymbol("ESTIMATE"), makeSymbol("ACTUAL"));

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLSymbol $cb_proof_view_historical_fudge_factors_caching_state$ = makeSymbol("*CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS-CACHING-STATE*");

    private static final SubLString $str151$Generating_proof_view___ = makeString("Generating proof view...");

    private static final SubLString $str152$Estimated_time_remaining___A = makeString("Estimated time remaining: ~A");

    private static final SubLString $str153$_Display_in_progress_proof_view_n = makeString("[Display in-progress proof view now]");



    private static final SubLSymbol $TABVIEW_CSS = makeKeyword("TABVIEW-CSS");

    private static final SubLSymbol $FONTS = makeKeyword("FONTS");

    private static final SubLSymbol $CONTAINER_CSS = makeKeyword("CONTAINER-CSS");

    private static final SubLSymbol $YAHOO_DOM_EVENT = makeKeyword("YAHOO-DOM-EVENT");



    private static final SubLSymbol $TABVIEW = makeKeyword("TABVIEW");

    private static final SubLSymbol $CONTAINER = makeKeyword("CONTAINER");





    private static final SubLString $str164$_Refresh_ = makeString("[Refresh]");

    private static final SubLString $str165$_Debug_ = makeString("[Debug]");

    private static final SubLSymbol $cb_proof_view_destroyer$ = makeSymbol("*CB-PROOF-VIEW-DESTROYER*");

    private static final SubLInteger $int$1200 = makeInteger(1200);

    private static final SubLSymbol VALID_PROOF_VIEW_P = makeSymbol("VALID-PROOF-VIEW-P");

    private static final SubLSymbol DESTROY_PROOF_VIEW = makeSymbol("DESTROY-PROOF-VIEW");

    private static final SubLString $$$DreamCatcher = makeString("DreamCatcher");

    private static final SubLString $$$furl = makeString("furl");

    private static final SubLString $$$context = makeString("context");

    private static final SubLSymbol $FEEDBACK_URL = makeKeyword("FEEDBACK-URL");

    private static final SubLSymbol $FEEDBACK_CONTEXT = makeKeyword("FEEDBACK-CONTEXT");

    private static final SubLString $str175$_entryText_hover__feedback___visi = makeString(".entryText:hover .feedback { visibility: visible; cursor: pointer;}\n\t\t\t\t  .feedback                  { visibility: hidden; }");

    private static final SubLSymbol DREAMCATCHER_JUSTIFY = makeSymbol("DREAMCATCHER-JUSTIFY");

    private static final SubLSymbol $ENTRY_PARAPHRASE_FN = makeKeyword("ENTRY-PARAPHRASE-FN");

    private static final SubLSymbol PROOF_VIEW_ENTRY_GENERATE_HTML_DREAMCATCHER = makeSymbol("PROOF-VIEW-ENTRY-GENERATE-HTML-DREAMCATCHER");

    private static final SubLString $$$entryText = makeString("entryText");

    private static final SubLString $str180$_application_justify_context_ = makeString("&application=justify&context=");

    private static final SubLString $str181$_ = makeString("[");

    private static final SubLString $str182$window_open__ = makeString("window.open('");

    private static final SubLString $str183$___Feedback___ = makeString("','Feedback');");

    private static final SubLString $$$feedback = makeString("feedback");

    private static final SubLString $str185$_cycdoc_img_speechbubble_png = makeString("/cycdoc/img/speechbubble.png");

    public static SubLObject cb_link_assertion_proof_view(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str0$_Proof_View_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str2$cb_assertion_proof_view__A, assertion_handles.assertion_id(assertion));
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
        return assertion;
    }

    public static SubLObject cb_link_proof_view_bug(final SubLObject proof_view_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(proof_view_entry);
        final SubLObject title_string = $str5$Proof_View_Problem;
        final SubLObject href = cconcatenate($str6$cg_cb_proof_view_bug_report_, new SubLObject[]{ format_nil.format_nil_a_no_copy(proof_view.proof_view_get_id(v_proof_view)), $str7$_, format_nil.format_nil_a_no_copy(proof_view.proof_view_entry_get_id(proof_view_entry)) });
        final SubLObject window_name = $$$jira;
        final SubLObject onclick = html_script_utilities.html_popup_onclick(window_name, $int$900, $int$800, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(href);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != title_string) {
            html_markup(html_macros.$html_anchor_title$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(title_string);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(onclick);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str11$pf_bug);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($HTML_JIRA_IMAGE));
            final SubLObject align = $TOP;
            final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($HTML_JIRA_IMAGE);
            final SubLObject border = ZERO_INTEGER;
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(image_src);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != alt) {
                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(alt);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != align) {
                html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align(align));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != border) {
                html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(border);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return proof_view_entry;
    }

    public static SubLObject cb_proof_view_bug_report(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_proof_view = NIL;
        SubLObject entry = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    v_proof_view = proof_view.find_proof_view_by_id(parse_integer(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    if ((NIL != v_proof_view) && (NIL != second(args))) {
                        entry = proof_view.find_proof_view_entry_by_id(v_proof_view, parse_integer(second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
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
        if (NIL == proof_view.proof_view_p(v_proof_view)) {
            cb_error($str19$Couldn_t_find_a_proof_view_with_I, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str21$_meta_http_equiv__X_UA_Compatible);
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
            html_princ($str24$Report_Proof_View_Problem);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
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
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($str24$Report_Proof_View_Problem);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject frame_name_var = cb_frame_name(NIL);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$post);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str26$cb_process_proof_view_bug_report, T, UNPROVIDED);
                        html_hidden_input($str27$proof_view_id, proof_view.proof_view_get_id(v_proof_view), UNPROVIDED);
                        if (NIL != entry) {
                            html_hidden_input($str28$proof_view_entry_id, proof_view.proof_view_entry_get_id(entry), UNPROVIDED);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ($str29$Proof_View_Entry_);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$showcycl);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_div_style$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str31$background___EEE__border__ridge_6);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                pph_proof.show_proof_view_entry(entry, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str32$Please_indicate_what_the_problem_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                }
                                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_radio_input($$$problem, $TRIVIAL, UNPROVIDED, UNPROVIDED);
                                    html_indent(UNPROVIDED);
                                    html_princ($$$Trivial);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_radio_input($$$problem, $IRRELEVANT, UNPROVIDED, UNPROVIDED);
                                    html_indent(UNPROVIDED);
                                    html_princ($$$Irrelevant);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_radio_input($$$problem, $BAD_PARAPHRASE, UNPROVIDED, UNPROVIDED);
                                    html_indent(UNPROVIDED);
                                    html_princ($$$Bad_Paraphrase);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_radio_input($$$problem, $WRONG_LOCATION, UNPROVIDED, UNPROVIDED);
                                    html_indent(UNPROVIDED);
                                    html_princ($$$Wrong_Location_in_Justification);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_radio_input($$$problem, $OTHER, T, UNPROVIDED);
                                    html_indent(UNPROVIDED);
                                    html_princ($str43$Other__please_explain_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str44$Details__);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$details);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($int$60);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(FIVE_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$virtual);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                    }
                                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        html_submit_input($$$Go_to_JIRA_to_Submit, $SUBMIT, UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
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
        return NIL;
    }

    public static SubLObject cb_process_proof_view_bug_report(final SubLObject args) {
        final SubLObject proof_view_id = html_extract_integer($str27$proof_view_id, args, UNPROVIDED);
        final SubLObject v_proof_view = proof_view.find_proof_view_by_id(proof_view_id);
        final SubLObject entry_id = html_extract_integer($str28$proof_view_entry_id, args, UNPROVIDED);
        final SubLObject entry = proof_view.find_proof_view_entry_by_id(v_proof_view, entry_id);
        final SubLObject problem = html_extract_keyword($$$problem, args, UNPROVIDED);
        final SubLObject details = html_extract_input($$$details, args);
        final SubLObject summary = cconcatenate($str52$Proof_View_Problem__, new SubLObject[]{ format_nil.format_nil_a_no_copy(problem), $str53$_ });
        SubLObject description = NIL;
        SubLObject url = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject v_answer = proof_view.proof_view_get_answer(v_proof_view);
            final SubLObject inference = inference_datastructures_inference.inference_answer_inference(v_answer);
            final SubLObject subl_query = inference_datastructures_inference.inference_to_new_cyc_query_form_string(inference);
            format(s, $str54$Query____A____, string_utilities.substring(subl_query, ZERO_INTEGER, $int$2048));
            format(s, $str56$Answer____A____, string_utilities.substring(princ_to_string(inference_datastructures_inference.inference_answer_el_sentence(v_answer)), ZERO_INTEGER, $int$1024));
            format(s, $str58$Entry__D____A___A, new SubLObject[]{ proof_view.proof_view_entry_get_id(entry), remove_html_tags(proof_view.proof_view_entry_generate_html(entry), UNPROVIDED), proof_view.proof_view_entry_get_object(entry) });
            if (NIL != string_utilities.non_empty_stringP(details)) {
                format(s, $str59$____Details_____A, details);
            }
            description = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        url = funcall(makeSymbol("CREATE-JIRA-ISSUE-URL"), summary, description, $list60);
        html_refresh(ZERO_INTEGER, url);
        return NIL;
    }

    public static SubLObject cb_assertion_proof_view(final SubLObject args) {
        final SubLObject assertion = cb_guess_assertion(args.first());
        if (NIL == assertion_handles.assertion_p(assertion)) {
            cb_error($str62$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject v_answer = cb_proof_view_assertion_answer(assertion);
        final SubLObject proof = pph_proof.inference_answer_get_proofs(v_answer).first();
        return cb_launch_proof_view(proof, v_answer, args.rest());
    }

    public static SubLObject cb_proof_view_assertion_answer(final SubLObject assertion) {
        return cb_proof_view_sentence_answer(uncanonicalizer.assertion_el_formula(assertion), assertions_high.assertion_mt(assertion), UNPROVIDED);
    }

    public static SubLObject cb_proof_view_sentence_answer(final SubLObject sentence, final SubLObject mt, SubLObject inference_mode) {
        if (inference_mode == UNPROVIDED) {
            inference_mode = $MINIMAL;
        }
        SubLObject v_answer = cb_proof_view_sentence_answer_cached(sentence, mt, inference_mode);
        if (NIL == inference_datastructures_inference.valid_inference_answer_p(v_answer)) {
            remove_cb_proof_view_sentence_answer_cached(sentence, mt, UNPROVIDED);
            v_answer = cb_proof_view_sentence_answer_cached(sentence, mt, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject clear_cb_proof_view_sentence_answer_cached() {
        final SubLObject cs = $cb_proof_view_sentence_answer_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cb_proof_view_sentence_answer_cached(final SubLObject sentence, final SubLObject mt, SubLObject inference_mode) {
        if (inference_mode == UNPROVIDED) {
            inference_mode = $MINIMAL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($cb_proof_view_sentence_answer_cached_caching_state$.getGlobalValue(), list(sentence, mt, inference_mode), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_proof_view_sentence_answer_cached_internal(final SubLObject sentence, final SubLObject mt, final SubLObject inference_mode) {
        final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, UNPROVIDED);
        inference_kernel.continue_inference(inference, list($MAX_NUMBER, ONE_INTEGER, $INFERENCE_MODE, inference_mode));
        return inference_datastructures_inference.inference_first_answer(inference);
    }

    public static SubLObject cb_proof_view_sentence_answer_cached(final SubLObject sentence, final SubLObject mt, SubLObject inference_mode) {
        if (inference_mode == UNPROVIDED) {
            inference_mode = $MINIMAL;
        }
        SubLObject caching_state = $cb_proof_view_sentence_answer_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CB_PROOF_VIEW_SENTENCE_ANSWER_CACHED, $cb_proof_view_sentence_answer_cached_caching_state$, SIXTEEN_INTEGER, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, inference_mode);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && inference_mode.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cb_proof_view_sentence_answer_cached_internal(sentence, mt, inference_mode)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt, inference_mode));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject cb_sentence_proof_view(final SubLObject args) {
        SubLObject sentence_id = NIL;
        destructuring_bind_must_consp(args, args, $list69);
        sentence_id = args.first();
        final SubLObject more_args;
        final SubLObject current = more_args = args.rest();
        final SubLObject sentence = cb_guess_sentence(sentence_id);
        if (NIL == cycl_grammar.cycl_sentence_p(sentence)) {
            cb_error($str70$_A_does_not_specify_a_CycL_senten, sentence_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject mt_id = html_extract_input($$$mt, more_args);
        final SubLObject task_id = html_extract_input($$$task, more_args);
        final SubLObject mode = html_extract_keyword($$$mode, more_args, $MINIMAL);
        final SubLObject mt = dwim_cb_sentence_proof_view_mt(mt_id, task_id);
        final SubLObject v_answer = cb_proof_view_sentence_answer(sentence, mt, mode);
        if (NIL == inference_datastructures_inference.valid_inference_answer_p(v_answer)) {
            cb_error($str74$Could_not_prove__S_in__S, sentence, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject proof = pph_proof.inference_answer_get_proofs(v_answer).first();
        return cb_launch_proof_view(proof, v_answer, more_args);
    }

    public static SubLObject dwim_cb_sentence_proof_view_mt(final SubLObject mt_id, final SubLObject task_id) {
        SubLObject mt = cb_guess_mt(mt_id);
        if (NIL == mt) {
            final SubLObject task = cb_guess_constant(task_id);
            if (NIL != task) {
                mt = cae_query_search.cae_default_query_mt(task);
            }
            if (NIL == mt) {
                mt = $$InferencePSC;
            }
        }
        return mt;
    }

    public static SubLObject cb_link_simple_proof_view(final SubLObject proof, final SubLObject inference_answer, SubLObject linktext, SubLObject debugP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (debugP == UNPROVIDED) {
            debugP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        assert NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : "inference_datastructures_inference.inference_answer_p(inference_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) " + inference_answer;
        if (NIL == linktext) {
            linktext = cconcatenate($str79$_Proof_, new SubLObject[]{ format_nil.format_nil_a_no_copy(inference_datastructures_problem_store.problem_store_suid(inference_datastructures_proof.proof_store(proof))), $str80$_, format_nil.format_nil_a_no_copy(inference_datastructures_proof.proof_suid(proof)), $str81$_ });
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str82$cb_simple_proof_view__A__A__A__A_, new SubLObject[]{ inference_datastructures_problem_store.problem_store_suid(inference_datastructures_proof.proof_store(proof)), inference_datastructures_proof.proof_suid(proof), inference_datastructures_inference.inference_suid(inference_datastructures_inference.inference_answer_inference(inference_answer)), inference_datastructures_inference.inference_answer_suid(inference_answer), NIL != debugP ? $str83$_debug_T : $str84$ });
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
        return proof;
    }

    public static SubLObject find_or_create_cb_proof_view_memoization_state(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rw_lock_var = locking_map.locking_map_lock($cb_proof_view_memoization_state_index$.getDynamicValue(thread));
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            SubLObject state = map_utilities.map_get_without_values($cb_proof_view_memoization_state_index$.getDynamicValue(thread), id, UNPROVIDED);
            if (NIL == memoization_state.memoization_state_p(state)) {
                final SubLObject name = princ_to_string(id);
                state = memoization_state.new_memoization_state(name, ReadWriteLocks.new_rw_lock(name), UNPROVIDED, UNPROVIDED);
                map_utilities.map_put($cb_proof_view_memoization_state_index$.getDynamicValue(thread), id, state);
            }
            return state;
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }

    public static SubLObject cb_proof_view_initialize_memoization_state(final SubLObject v_proof_view, final SubLObject memoization_state_id) {
        proof_view.proof_view_set_cached_memoization_state(v_proof_view, find_or_create_cb_proof_view_memoization_state(memoization_state_id));
        return memoization_state_id;
    }

    public static SubLObject cb_simple_proof_view(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject proof = extract_cb_proof_view_proof_and_answer(args);
        final SubLObject v_answer = thread.secondMultipleValue();
        final SubLObject more_args = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return cb_launch_proof_view(proof, v_answer, more_args);
    }

    public static SubLObject cb_launch_proof_view(final SubLObject proof, final SubLObject v_answer, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_proof_view = cb_proof_view_get_proof_view(proof, v_answer, UNPROVIDED);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != newP) {
            final SubLObject memoization_state_id = html_extract_input($str94$memoization_state, args);
            if (NIL != memoization_state_id) {
                cb_proof_view_initialize_memoization_state(v_proof_view, memoization_state_id);
            }
            if (NIL != html_extract_input($str95$suppress_summary, args)) {
                proof_view_summary.proof_view_set_include_summary_sectionP(v_proof_view, NIL);
            }
            proof_view.proof_view_set_enable_debugP(v_proof_view, list_utilities.sublisp_boolean(html_extract_input($$$debug, args)));
            if (NIL != html_extract_input($str97$suppress_detailed, args)) {
                proof_view.proof_view_set_include_justification_sectionP(v_proof_view, NIL);
            }
            if (NIL != html_extract_input($str98$suppress_linear, args)) {
                proof_view_linear.proof_view_set_include_linear_sectionP(v_proof_view, NIL);
            }
            if (NIL != html_extract_input($str99$suppress_bookkeeping, args)) {
                proof_view.proof_view_set_suppress_assertion_bookkeepingP(v_proof_view, T);
            }
            if (NIL != html_extract_input($str100$suppress_cyclists, args)) {
                proof_view.proof_view_set_suppress_assertion_cyclistsP(v_proof_view, T);
            }
            if (NIL != html_extract_input($str101$suppress_assertion_dates, args)) {
                proof_view.proof_view_set_suppress_assertion_datesP(v_proof_view, T);
            }
            if (NIL != html_extract_input($str102$suppress_cyclist_employers, args)) {
                proof_view.proof_view_set_suppress_assertion_cyclist_employersP(v_proof_view, T);
            }
            if (NIL != html_extract_input($str103$suppress_links_in_nl, args)) {
                proof_view.proof_view_set_allow_internal_linksP(v_proof_view, NIL);
                proof_view.proof_view_set_allow_external_linksP(v_proof_view, NIL);
            }
            if ((NIL != html_extract_input($str104$suppress_phrase_links, args)) || (NIL == $generated_phrases_browsableP$.getDynamicValue(thread))) {
                proof_view.proof_view_set_link_phrasesP(v_proof_view, NIL);
            } else {
                proof_view.proof_view_set_link_phrasesP(v_proof_view, T);
            }
            proof_view_populator.proof_view_set_include_special_sectionP(v_proof_view, $STORY, $cb_proof_view_include_story_sectionP$.getDynamicValue(thread));
            if (NIL != forts.fort_p($cb_proof_view_default_params$.getDynamicValue(thread))) {
                proof_view.proof_view_set_parameters_from_specification(v_proof_view, $cb_proof_view_default_params$.getDynamicValue(thread));
            }
            launch_cb_proof_view_preparer(v_proof_view);
        }
        return cb_simple_proof_view_guts(proof, v_answer, proof_view.proof_view_get_allow_internal_linksP(v_proof_view));
    }

    public static SubLObject extract_cb_proof_view_proof_and_answer(final SubLObject args) {
        SubLObject store_suid_string = NIL;
        SubLObject proof_suid_string = NIL;
        SubLObject inference_suid_string = NIL;
        SubLObject answer_suid_string = NIL;
        destructuring_bind_must_consp(args, args, $list106);
        store_suid_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list106);
        proof_suid_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list106);
        inference_suid_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list106);
        answer_suid_string = current.first();
        final SubLObject more_args;
        current = more_args = current.rest();
        final SubLObject store_suid = read_from_string_ignoring_errors(store_suid_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject proof_suid = read_from_string_ignoring_errors(proof_suid_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        final SubLObject inference_suid = read_from_string_ignoring_errors(inference_suid_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        final SubLObject answer_suid = read_from_string_ignoring_errors(answer_suid_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(store_suid) : "Types.integerp(store_suid) " + "CommonSymbols.NIL != Types.integerp(store_suid) " + store_suid;
        if (((NIL != inference_suid) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(inference_suid))) {
            throw new AssertionError(inference_suid);
        }
        if (((NIL != answer_suid) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(answer_suid))) {
            throw new AssertionError(answer_suid);
        }
        if (((NIL != proof_suid) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(proof_suid))) {
            throw new AssertionError(proof_suid);
        }
        final SubLObject store = inference_datastructures_problem_store.find_problem_store_by_id(store_suid);
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) " + store;
        final SubLObject inference = (NIL != inference_suid) ? inference_datastructures_problem_store.find_inference_by_id(store, inference_suid) : cb_proof_view_select_inference(store);
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject v_answer = (NIL != answer_suid) ? inference_datastructures_inference.find_inference_answer_by_id(inference, answer_suid) : cb_proof_view_select_inference_answer(inference);
        assert NIL != inference_datastructures_inference.inference_answer_p(v_answer) : "inference_datastructures_inference.inference_answer_p(v_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(v_answer) " + v_answer;
        final SubLObject proof = (NIL != proof_suid) ? inference_datastructures_problem_store.find_proof_by_id(store, proof_suid) : cb_proof_view_select_inference_answer_proof(v_answer);
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        return values(proof, v_answer, more_args);
    }

    public static SubLObject cb_proof_view_select_inference(final SubLObject store) {
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$22 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$22, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$22);
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
                        return inference;
                    }
                }
            }
            final SubLObject idx_$23 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$23)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$23);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    if (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        return inference2;
                    }
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_proof_view_select_inference_answer(final SubLObject inference) {
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$24 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$24, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$24);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        return v_answer;
                    }
                }
            }
            final SubLObject idx_$25 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$25)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$25);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    if (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_answer2 = getEntryValue(cdohash_entry);
                        return v_answer2;
                    }
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_proof_view_select_inference_answer_proof(final SubLObject v_answer) {
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject just = NIL;
        just = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cdolist_list_var_$26 = inference_datastructures_inference.inference_answer_justification_proofs(just);
            SubLObject proof = NIL;
            proof = cdolist_list_var_$26.first();
            if (NIL != cdolist_list_var_$26) {
                return proof;
            }
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cb_link_show_proof_view(final SubLObject v_proof_view, SubLObject linktext, SubLObject target) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = $MAIN;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != proof_view.proof_view_p(v_proof_view) : "proof_view.proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.proof_view_p(v_proof_view) " + v_proof_view;
        final SubLObject id = proof_view.proof_view_get_id(v_proof_view);
        if (NIL == linktext) {
            linktext = cconcatenate($str112$_Proof_View_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str81$_ });
        }
        final SubLObject frame_name_var = cb_frame_name(target);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str113$cb_show_proof_view__A, id);
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
        return v_proof_view;
    }

    public static SubLObject cb_show_proof_view(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_view_id = NIL;
        destructuring_bind_must_consp(args, args, $list116);
        proof_view_id = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            final SubLObject v_proof_view = proof_view.find_proof_view_by_id(string_utilities.string_to_integer(proof_view_id));
            if (NIL != v_proof_view) {
                final SubLObject title_var = NIL;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str21$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css($CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str119$yui_skin_sam);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$button);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$reload);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_princ($$$Refresh_Frames);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                                }
                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (NIL != title_var) {
                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    html_princ(title_var);
                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                }
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_princ($$$Proof_View);
                                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                cb_show_proof_view_int(v_proof_view, NIL);
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$28, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            } else {
                cb_error($str125$_S_does_not_identify_an_existing_, proof_view_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(args, $list116);
        }
        return NIL;
    }

    public static SubLObject lookup_cb_proof_view(final SubLObject proof, final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = dictionary.dictionary_lookup_without_values($cb_proof_views$.getDynamicValue(thread), list(proof, v_answer), UNPROVIDED);
        if (NIL == proof_view.valid_proof_view_p(v_proof_view)) {
            forget_cb_proof_view(proof, v_answer);
            return NIL;
        }
        return v_proof_view;
    }

    public static SubLObject note_cb_proof_view(final SubLObject proof, final SubLObject v_answer, final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_enter($cb_proof_views$.getDynamicValue(thread), list(proof, v_answer), v_proof_view);
    }

    public static SubLObject forget_cb_proof_view(final SubLObject proof, final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_remove($cb_proof_views$.getDynamicValue(thread), list(proof, v_answer));
    }

    public static SubLObject kill_all_cb_proof_view_threads() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_contents_var = set.do_set_internal($cb_proof_view_threads$.getDynamicValue(thread));
        SubLObject basis_object;
        SubLObject state;
        SubLObject thread_$31;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            thread_$31 = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, thread_$31)) {
                kill_process(thread_$31);
            }
        }
        set.clear_set($cb_proof_view_threads$.getDynamicValue(thread));
        return $cb_proof_view_threads$.getDynamicValue(thread);
    }

    public static SubLObject launch_cb_proof_view_preparer(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proof = proof_view.proof_view_get_proof(v_proof_view);
        final SubLObject name = cconcatenate($str129$CB_Proof_View_Preparer_for_proof_, new SubLObject[]{ format_nil.format_nil_d_no_copy(proof_view.proof_view_get_id(v_proof_view)), $$$_of_proof_, format_nil.format_nil_d_no_copy(inference_datastructures_problem_store.problem_store_suid(inference_datastructures_proof.proof_store(proof))), $str80$_, format_nil.format_nil_d_no_copy(inference_datastructures_proof.proof_suid(proof)) });
        final SubLObject thread_$32 = process_utilities.make_cyc_server_process_with_args(name, PREPARE_CB_PROOF_VIEW, list(v_proof_view));
        set.set_add(thread_$32, $cb_proof_view_threads$.getDynamicValue(thread));
        return thread_$32;
    }

    public static SubLObject increment_cb_proof_view_entries_paraphrased(final SubLObject v_proof_view) {
        return dictionary_utilities.dictionary_increment($cb_proof_view_entries_paraphrased$.getGlobalValue(), v_proof_view, UNPROVIDED);
    }

    public static SubLObject get_cb_proof_view_entries_paraphrased(final SubLObject v_proof_view) {
        return dictionary.dictionary_lookup_without_values($cb_proof_view_entries_paraphrased$.getGlobalValue(), v_proof_view, ZERO_INTEGER);
    }

    public static SubLObject prepare_cb_proof_view(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            proof_view.proof_view_set_preparer_thread(v_proof_view, UNPROVIDED);
            proof_view_populator.proof_view_populate(v_proof_view, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = proof_view.proof_view_get_entries(v_proof_view);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                proof_view.proof_view_entry_generate_html(entry);
                increment_cb_proof_view_entries_paraphrased(v_proof_view);
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                set.set_remove(current_process(), $cb_proof_view_threads$.getDynamicValue(thread));
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return v_proof_view;
    }

    public static SubLObject cb_proof_view_get_proof_view(final SubLObject proof, final SubLObject v_answer, SubLObject create_if_doesnt_existP) {
        if (create_if_doesnt_existP == UNPROVIDED) {
            create_if_doesnt_existP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_proof_view = lookup_cb_proof_view(proof, v_answer);
        SubLObject newP = NIL;
        if ((NIL == v_proof_view) && (NIL != create_if_doesnt_existP)) {
            v_proof_view = proof_view.get_new_empty_proof_view(v_answer, proof);
            newP = T;
            proof_view.proof_view_set_highlight_phrase_demeritsP(v_proof_view, $highlight_demerits_in_generated_phrasesP$.getDynamicValue(thread));
            proof_view.proof_view_set_language_mt(v_proof_view, cb_tools.cb_paraphrase_mt());
            proof_view.proof_view_set_domain_mt(v_proof_view, cb_tools.cb_paraphrase_mt());
            if (NIL != $assume_cyc_cyclist_dialogP$.getDynamicValue(thread)) {
                proof_view.proof_view_set_addressee(v_proof_view, operation_communication.the_cyclist());
            }
            proof_view.proof_view_set_allow_internal_linksP(v_proof_view, T);
            proof_view.proof_view_set_allow_external_linksP(v_proof_view, T);
            note_cb_proof_view(proof, v_answer, v_proof_view);
        }
        return values(v_proof_view, newP);
    }

    public static SubLObject cb_proof_view_compute_percent_ready(final SubLObject proof, final SubLObject v_answer) {
        final SubLObject v_proof_view = cb_proof_view_get_proof_view(proof, v_answer, NIL);
        return NIL != v_proof_view ? cb_proof_view_compute_percent_ready_int(v_proof_view) : ZERO_INTEGER;
    }

    public static SubLObject cb_proof_view_compute_percent_ready_int(final SubLObject v_proof_view) {
        final SubLObject total_entry_count = length(proof_view.proof_view_get_entries(v_proof_view));
        final SubLObject construction_percent = integerDivide($int$100, number_utilities.f_1X($cb_proof_view_estimated_paraphrase_to_construction_ratio$.getGlobalValue()));
        SubLObject percent_ready = (ZERO_INTEGER.eql(total_entry_count)) ? ZERO_INTEGER : construction_percent;
        final SubLObject paraphrased_count = get_cb_proof_view_entries_paraphrased(v_proof_view);
        if (paraphrased_count.isPositive()) {
            percent_ready = add(percent_ready, truncate(multiply(subtract($int$100, construction_percent), paraphrased_count), total_entry_count));
        }
        return percent_ready;
    }

    public static SubLObject cb_simple_proof_view_guts(final SubLObject proof, final SubLObject v_answer, SubLObject internal_linksP) {
        if (internal_linksP == UNPROVIDED) {
            internal_linksP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        assert NIL != inference_datastructures_inference.inference_answer_p(v_answer) : "inference_datastructures_inference.inference_answer_p(v_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(v_answer) " + v_answer;
        thread.resetMultipleValues();
        final SubLObject v_proof_view = cb_proof_view_get_proof_view(proof, v_answer, UNPROVIDED);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject percent_ready = cb_proof_view_compute_percent_ready_int(v_proof_view);
        if (percent_ready.numL($int$100)) {
            if (NIL != newP) {
                launch_cb_proof_view_preparer(v_proof_view);
            }
            cb_proof_view_progress_pacifier(v_proof_view, percent_ready);
        } else {
            forget_cb_proof_view(proof, v_answer);
            proof_view.proof_view_set_allow_internal_linksP(v_proof_view, internal_linksP);
            final SubLObject title_var = NIL;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str21$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                    html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_head_shortcut_icon();
                    html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css($CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (NIL != title_var) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_princ(title_var);
                        html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str119$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$button);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reload);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_princ($$$Refresh_Frames);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (NIL != title_var) {
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ(title_var);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ($$$Proof_View);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            cb_show_proof_view_int(v_proof_view, UNPROVIDED);
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$33, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject note_cb_proof_view_time_estimate(final SubLObject v_proof_view, final SubLObject percent_ready, final SubLObject estimate, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        $cb_proof_view_time_estimates$.setGlobalValue(cons(list(v_proof_view, percent_ready, estimate, universal_time), $cb_proof_view_time_estimates$.getGlobalValue()));
        return estimate;
    }

    public static SubLObject log_cb_proof_view_time_estimate_results(final SubLObject v_proof_view, SubLObject actual_finish_time) {
        if (actual_finish_time == UNPROVIDED) {
            actual_finish_time = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != file_utilities.file_existsP($cb_proof_view_time_estimates_log$.getGlobalValue())) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text($cb_proof_view_time_estimates_log$.getGlobalValue(), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str138$Unable_to_open__S, $cb_proof_view_time_estimates_log$.getGlobalValue());
                }
                final SubLObject stream_$37 = stream;
                final SubLObject estimates = copy_list($cb_proof_view_time_estimates$.getGlobalValue());
                $cb_proof_view_time_estimates$.setGlobalValue(delete(v_proof_view, $cb_proof_view_time_estimates$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject cdolist_list_var = estimates;
                SubLObject estimate = NIL;
                estimate = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (v_proof_view.eql(estimate.first())) {
                        SubLObject current;
                        final SubLObject datum = current = estimate.rest();
                        SubLObject percent_ready = NIL;
                        SubLObject estimate_$38 = NIL;
                        SubLObject universal_time = NIL;
                        destructuring_bind_must_consp(current, datum, $list140);
                        percent_ready = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list140);
                        estimate_$38 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list140);
                        universal_time = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            final SubLObject actual = subtract(actual_finish_time, universal_time);
                            log_cb_proof_view_time_estimate_result(percent_ready, estimate_$38, actual, stream_$37);
                        } else {
                            cdestructuring_bind_error(datum, $list140);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    estimate = cdolist_list_var.first();
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
        }
        return v_proof_view;
    }

    public static SubLObject log_cb_proof_view_time_estimate_result(final SubLObject percent_ready, final SubLObject estimate, final SubLObject actual, final SubLObject stream) {
        write_line(string_utilities.bunge(Mapping.mapcar(PRINC_TO_STRING, list(percent_ready, estimate, actual)), CHAR_tab), stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_proof_view_estimate_seconds_to_go(final SubLObject v_proof_view, SubLObject percent_ready) {
        SubLObject seconds_to_go = (percent_ready.numGE($int$100)) ? ZERO_INTEGER : misc_utilities.uninitialized();
        if ((NIL != v_proof_view) && (NIL != misc_utilities.uninitialized_p(seconds_to_go))) {
            SubLObject creation_time;
            SubLObject time_so_far;
            for (creation_time = proof_view.proof_view_get_creation_universal_time(v_proof_view), time_so_far = subl_promotions.elapsed_universal_time(creation_time, UNPROVIDED); time_so_far.isZero(); time_so_far = subl_promotions.elapsed_universal_time(creation_time, UNPROVIDED) , percent_ready = cb_proof_view_compute_percent_ready_int(v_proof_view)) {
                sleep($float$0_5);
            }
            final SubLObject estimated_total_seconds = integerDivide(multiply(time_so_far, $int$100), percent_ready);
            seconds_to_go = subtract(estimated_total_seconds, time_so_far);
        }
        note_cb_proof_view_time_estimate(v_proof_view, percent_ready, seconds_to_go, UNPROVIDED);
        return values(adjust_cb_proof_view_estimate_wrt_historical_data(seconds_to_go, percent_ready), percent_ready);
    }

    public static SubLObject clear_cb_proof_view_historical_fudge_factors() {
        final SubLObject cs = $cb_proof_view_historical_fudge_factors_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cb_proof_view_historical_fudge_factors() {
        return memoization_state.caching_state_remove_function_results_with_args($cb_proof_view_historical_fudge_factors_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_proof_view_historical_fudge_factors_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fudge_factors = make_list(FIVE_INTEGER, $float$1_0);
        if (NIL != file_utilities.file_existsP($cb_proof_view_time_estimates_log$.getGlobalValue())) {
            final SubLObject values = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            final SubLObject file_var = $cb_proof_view_time_estimates_log$.getGlobalValue();
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(file_var, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str138$Unable_to_open__S, file_var);
                }
                final SubLObject stream_var = stream;
                if (stream_var.isStream()) {
                    final SubLObject stream_var_$39 = stream_var;
                    SubLObject line_number_var = NIL;
                    SubLObject line = NIL;
                    line_number_var = ZERO_INTEGER;
                    for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$39); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$39)) {
                        final SubLObject tokens = string_utilities.string_tokenize(line, $list146, list(list($str147$_, $str147$_)), NIL, NIL, list(CHAR_backslash), UNPROVIDED);
                        SubLObject current;
                        final SubLObject datum = current = tokens;
                        SubLObject percent_done = NIL;
                        SubLObject estimate = NIL;
                        SubLObject actual = NIL;
                        destructuring_bind_must_consp(current, datum, $list148);
                        percent_done = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list148);
                        estimate = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list148);
                        actual = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != string_utilities.digit_stringP(estimate)) {
                                final SubLObject quartile = integerDivide(parse_integer(percent_done, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $int$25);
                                final SubLObject actual_int = parse_integer(actual, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (!ZERO_INTEGER.eql(actual_int)) {
                                    dictionary_utilities.dictionary_push(values, quartile, divide(parse_integer(estimate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), actual_int));
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list148);
                        }
                        line_number_var = number_utilities.f_1X(line_number_var);
                    }
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
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(values)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject quartile2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject vals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                set_nth(quartile2, fudge_factors, number_utilities.median(vals, UNPROVIDED, UNPROVIDED));
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return fudge_factors;
    }

    public static SubLObject cb_proof_view_historical_fudge_factors() {
        SubLObject caching_state = $cb_proof_view_historical_fudge_factors_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CB_PROOF_VIEW_HISTORICAL_FUDGE_FACTORS, $cb_proof_view_historical_fudge_factors_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cb_proof_view_historical_fudge_factors_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject adjust_cb_proof_view_estimate_wrt_historical_data(final SubLObject seconds_to_go, final SubLObject percent_ready) {
        final SubLObject quartile = integerDivide(percent_ready, $int$25);
        final SubLObject fudge_factor = nth(quartile, cb_proof_view_historical_fudge_factors());
        return fudge_factor.isPositive() ? floor(divide(seconds_to_go, fudge_factor), UNPROVIDED) : seconds_to_go;
    }

    public static SubLObject cb_proof_view_progress_pacifier(final SubLObject v_proof_view, final SubLObject percent_ready) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject seconds_to_go = cb_proof_view_estimate_seconds_to_go(v_proof_view, percent_ready);
        final SubLObject new_percent_ready = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject title_var = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str21$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$40 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str119$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css($CB_CYC);
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_princ($$$Proof_View);
                        html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_refresh(min(FIVE_INTEGER, seconds_to_go), UNPROVIDED);
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        final SubLObject _prev_bind_0_$44 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_markup(html_macros.$html_body_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ_strong($str151$Generating_proof_view___);
                                if (new_percent_ready.isPositive()) {
                                    html_terpri(UNPROVIDED);
                                    html_percent_progress_bar(new_percent_ready, $int$100, $int$100, html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue(), html_macros.$html_color_cyc_logo_violet$.getGlobalValue());
                                    if (seconds_to_go.isPositive()) {
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str152$Estimated_time_remaining___A, numeric_date_utilities.readable_elapsed_time_string(seconds_to_go, ZERO_INTEGER));
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_newline(UNPROVIDED);
                                        cb_link_show_proof_view(v_proof_view, $str153$_Display_in_progress_proof_view_n, $SELF);
                                    }
                                }
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$44, thread);
                        }
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$41, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$40, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return v_proof_view;
    }

    public static SubLObject cb_show_proof_view_int(final SubLObject v_proof_view, SubLObject destroy_when_doneP) {
        if (destroy_when_doneP == UNPROVIDED) {
            destroy_when_doneP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyc_file_dependencies.css($TABVIEW_CSS);
        cyc_file_dependencies.css($FONTS);
        cyc_file_dependencies.css($CONTAINER_CSS);
        html_script_utilities.cb_hoverover_page_init();
        dhtml_macros.dhtml_with_dom_script();
        dhtml_macros.dhtml_with_toggle_visibility_support();
        cyc_file_dependencies.javascript($YAHOO_DOM_EVENT);
        cyc_file_dependencies.javascript($ELEMENT);
        cyc_file_dependencies.javascript($TABVIEW);
        cyc_file_dependencies.javascript($CONTAINER);
        final SubLObject style = proof_view.proof_view_get_property(v_proof_view, $STYLE, UNPROVIDED);
        if (NIL != string_utilities.non_empty_stringP(style)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_style_head$.getGlobalValue());
            html_markup(style);
            html_markup(html_macros.$html_style_tail$.getGlobalValue());
        }
        final SubLObject proof = proof_view.proof_view_get_proof(v_proof_view);
        final SubLObject inference_answer = proof_view.proof_view_get_answer(v_proof_view);
        final SubLObject in_debug_modeP = proof_view.proof_view_get_enable_debugP(v_proof_view);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_div_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($RIGHT);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_link_simple_proof_view(proof, inference_answer, $str164$_Refresh_, UNPROVIDED);
            if (NIL == in_debug_modeP) {
                html_indent(UNPROVIDED);
                cb_link_simple_proof_view(proof, inference_answer, $str165$_Debug_, T);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        pph_proof.show_proof_view(v_proof_view, UNPROVIDED);
        if ((NIL != destroy_when_doneP) && (NIL == in_debug_modeP)) {
            destroy_cb_proof_view(v_proof_view);
        }
        return NIL;
    }

    public static SubLObject cb_proof_view_destroyer() {
        return $cb_proof_view_destroyer$.getGlobalValue();
    }

    public static SubLObject set_cb_proof_view_destruction_grace_period(final SubLObject seconds) {
        return delayed_processor.delayed_processor_set_delay_seconds($cb_proof_view_destroyer$.getGlobalValue(), seconds);
    }

    public static SubLObject destroy_cb_proof_view(final SubLObject v_cb_proof_view) {
        if (NIL != proof_view.proof_view_p(v_cb_proof_view)) {
            delayed_processor.schedule($cb_proof_view_destroyer$.getGlobalValue(), v_cb_proof_view);
        }
        return NIL;
    }

    public static SubLObject dreamcatcher_justify(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject proof = extract_cb_proof_view_proof_and_answer(args);
        final SubLObject v_answer = thread.secondMultipleValue();
        final SubLObject more_args = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject v_proof_view = cb_proof_view_get_proof_view(proof, v_answer, UNPROVIDED);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != newP) {
            cb_proof_view_initialize_memoization_state(v_proof_view, $$$DreamCatcher);
            final SubLObject debugP = list_utilities.sublisp_boolean(html_extract_input($$$debug, more_args));
            final SubLObject feedback_url = html_extract_input($$$furl, more_args);
            final SubLObject feedback_context = html_extract_input($$$context, more_args);
            proof_view.proof_view_set_enable_debugP(v_proof_view, debugP);
            if (NIL != feedback_url) {
                proof_view.proof_view_set_property(v_proof_view, $FEEDBACK_URL, feedback_url);
            }
            if (NIL != feedback_context) {
                proof_view.proof_view_set_property(v_proof_view, $FEEDBACK_CONTEXT, feedback_context);
            }
            set_dreamcatcher_proof_view_params(v_proof_view);
            proof_view.proof_view_set_property(v_proof_view, $STYLE, $str175$_entryText_hover__feedback___visi);
            launch_cb_proof_view_preparer(v_proof_view);
        }
        return cb_simple_proof_view_guts(proof, v_answer, proof_view.proof_view_get_allow_internal_linksP(v_proof_view));
    }

    public static SubLObject set_dreamcatcher_proof_view_params(final SubLObject v_proof_view) {
        proof_view_summary.proof_view_set_include_summary_sectionP(v_proof_view, NIL);
        proof_view.proof_view_set_include_justification_sectionP(v_proof_view, T);
        proof_view_linear.proof_view_set_include_linear_sectionP(v_proof_view, NIL);
        proof_view.proof_view_set_suppress_assertion_bookkeepingP(v_proof_view, T);
        proof_view.proof_view_set_allow_internal_linksP(v_proof_view, NIL);
        proof_view.proof_view_set_allow_external_linksP(v_proof_view, NIL);
        proof_view.proof_view_set_property(v_proof_view, $ENTRY_PARAPHRASE_FN, PROOF_VIEW_ENTRY_GENERATE_HTML_DREAMCATCHER);
        return v_proof_view;
    }

    public static SubLObject proof_view_entry_generate_html_dreamcatcher(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject standard_html = proof_view.proof_view_entry_generate_html_standard(entry);
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
        final SubLObject feedback_url = proof_view.proof_view_get_property(v_proof_view, $FEEDBACK_URL, $str84$);
        final SubLObject feedback_context = proof_view.proof_view_get_property(v_proof_view, $FEEDBACK_CONTEXT, $str84$);
        if ((NIL != string_utilities.non_empty_stringP(standard_html)) && (NIL != string_utilities.non_empty_stringP(feedback_url))) {
            SubLObject new_span = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$entryText);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(standard_html);
                        html_indent(UNPROVIDED);
                        final SubLObject enhanced_url = cconcatenate(format_nil.format_nil_a_no_copy(feedback_url), new SubLObject[]{ $str180$_application_justify_context_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(feedback_context, UNPROVIDED)), $str181$_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(proof_view.proof_view_entry_get_path_string(entry), UNPROVIDED)), $str81$_ });
                        final SubLObject script = cconcatenate($str182$window_open__, new SubLObject[]{ format_nil.format_nil_a_no_copy(enhanced_url), $str183$___Feedback___ });
                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                        if (NIL != script) {
                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(script);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$feedback);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_image_head$.getGlobalValue());
                            html_markup(html_macros.$html_image_src$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str185$_cycdoc_img_speechbubble_png);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                            }
                            html_markup(html_macros.$html_image_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                        }
                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                    }
                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
                new_span = get_output_stream_string(stream);
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
            return new_span;
        }
        return standard_html;
    }

    public static SubLObject declare_cb_proof_view_file() {
        declareFunction("cb_link_assertion_proof_view", "CB-LINK-ASSERTION-PROOF-VIEW", 1, 1, false);
        declareFunction("cb_link_proof_view_bug", "CB-LINK-PROOF-VIEW-BUG", 1, 0, false);
        declareFunction("cb_proof_view_bug_report", "CB-PROOF-VIEW-BUG-REPORT", 1, 0, false);
        declareFunction("cb_process_proof_view_bug_report", "CB-PROCESS-PROOF-VIEW-BUG-REPORT", 1, 0, false);
        declareFunction("cb_assertion_proof_view", "CB-ASSERTION-PROOF-VIEW", 1, 0, false);
        declareFunction("cb_proof_view_assertion_answer", "CB-PROOF-VIEW-ASSERTION-ANSWER", 1, 0, false);
        declareFunction("cb_proof_view_sentence_answer", "CB-PROOF-VIEW-SENTENCE-ANSWER", 2, 1, false);
        declareFunction("clear_cb_proof_view_sentence_answer_cached", "CLEAR-CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED", 0, 0, false);
        declareFunction("remove_cb_proof_view_sentence_answer_cached", "REMOVE-CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED", 2, 1, false);
        declareFunction("cb_proof_view_sentence_answer_cached_internal", "CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED-INTERNAL", 3, 0, false);
        declareFunction("cb_proof_view_sentence_answer_cached", "CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED", 2, 1, false);
        declareFunction("cb_sentence_proof_view", "CB-SENTENCE-PROOF-VIEW", 1, 0, false);
        declareFunction("dwim_cb_sentence_proof_view_mt", "DWIM-CB-SENTENCE-PROOF-VIEW-MT", 2, 0, false);
        declareFunction("cb_link_simple_proof_view", "CB-LINK-SIMPLE-PROOF-VIEW", 2, 2, false);
        declareFunction("find_or_create_cb_proof_view_memoization_state", "FIND-OR-CREATE-CB-PROOF-VIEW-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("cb_proof_view_initialize_memoization_state", "CB-PROOF-VIEW-INITIALIZE-MEMOIZATION-STATE", 2, 0, false);
        declareFunction("cb_simple_proof_view", "CB-SIMPLE-PROOF-VIEW", 1, 0, false);
        declareFunction("cb_launch_proof_view", "CB-LAUNCH-PROOF-VIEW", 3, 0, false);
        declareFunction("extract_cb_proof_view_proof_and_answer", "EXTRACT-CB-PROOF-VIEW-PROOF-AND-ANSWER", 1, 0, false);
        declareFunction("cb_proof_view_select_inference", "CB-PROOF-VIEW-SELECT-INFERENCE", 1, 0, false);
        declareFunction("cb_proof_view_select_inference_answer", "CB-PROOF-VIEW-SELECT-INFERENCE-ANSWER", 1, 0, false);
        declareFunction("cb_proof_view_select_inference_answer_proof", "CB-PROOF-VIEW-SELECT-INFERENCE-ANSWER-PROOF", 1, 0, false);
        declareFunction("cb_link_show_proof_view", "CB-LINK-SHOW-PROOF-VIEW", 1, 2, false);
        declareFunction("cb_show_proof_view", "CB-SHOW-PROOF-VIEW", 1, 0, false);
        declareFunction("lookup_cb_proof_view", "LOOKUP-CB-PROOF-VIEW", 2, 0, false);
        declareFunction("note_cb_proof_view", "NOTE-CB-PROOF-VIEW", 3, 0, false);
        declareFunction("forget_cb_proof_view", "FORGET-CB-PROOF-VIEW", 2, 0, false);
        declareFunction("kill_all_cb_proof_view_threads", "KILL-ALL-CB-PROOF-VIEW-THREADS", 0, 0, false);
        declareFunction("launch_cb_proof_view_preparer", "LAUNCH-CB-PROOF-VIEW-PREPARER", 1, 0, false);
        declareFunction("increment_cb_proof_view_entries_paraphrased", "INCREMENT-CB-PROOF-VIEW-ENTRIES-PARAPHRASED", 1, 0, false);
        declareFunction("get_cb_proof_view_entries_paraphrased", "GET-CB-PROOF-VIEW-ENTRIES-PARAPHRASED", 1, 0, false);
        declareFunction("prepare_cb_proof_view", "PREPARE-CB-PROOF-VIEW", 1, 0, false);
        declareFunction("cb_proof_view_get_proof_view", "CB-PROOF-VIEW-GET-PROOF-VIEW", 2, 1, false);
        declareFunction("cb_proof_view_compute_percent_ready", "CB-PROOF-VIEW-COMPUTE-PERCENT-READY", 2, 0, false);
        declareFunction("cb_proof_view_compute_percent_ready_int", "CB-PROOF-VIEW-COMPUTE-PERCENT-READY-INT", 1, 0, false);
        declareFunction("cb_simple_proof_view_guts", "CB-SIMPLE-PROOF-VIEW-GUTS", 2, 1, false);
        declareFunction("note_cb_proof_view_time_estimate", "NOTE-CB-PROOF-VIEW-TIME-ESTIMATE", 3, 1, false);
        declareFunction("log_cb_proof_view_time_estimate_results", "LOG-CB-PROOF-VIEW-TIME-ESTIMATE-RESULTS", 1, 1, false);
        declareFunction("log_cb_proof_view_time_estimate_result", "LOG-CB-PROOF-VIEW-TIME-ESTIMATE-RESULT", 4, 0, false);
        declareFunction("cb_proof_view_estimate_seconds_to_go", "CB-PROOF-VIEW-ESTIMATE-SECONDS-TO-GO", 2, 0, false);
        declareFunction("clear_cb_proof_view_historical_fudge_factors", "CLEAR-CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS", 0, 0, false);
        declareFunction("remove_cb_proof_view_historical_fudge_factors", "REMOVE-CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS", 0, 0, false);
        declareFunction("cb_proof_view_historical_fudge_factors_internal", "CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS-INTERNAL", 0, 0, false);
        declareFunction("cb_proof_view_historical_fudge_factors", "CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS", 0, 0, false);
        declareFunction("adjust_cb_proof_view_estimate_wrt_historical_data", "ADJUST-CB-PROOF-VIEW-ESTIMATE-WRT-HISTORICAL-DATA", 2, 0, false);
        declareFunction("cb_proof_view_progress_pacifier", "CB-PROOF-VIEW-PROGRESS-PACIFIER", 2, 0, false);
        declareFunction("cb_show_proof_view_int", "CB-SHOW-PROOF-VIEW-INT", 1, 1, false);
        declareFunction("cb_proof_view_destroyer", "CB-PROOF-VIEW-DESTROYER", 0, 0, false);
        declareFunction("set_cb_proof_view_destruction_grace_period", "SET-CB-PROOF-VIEW-DESTRUCTION-GRACE-PERIOD", 1, 0, false);
        declareFunction("destroy_cb_proof_view", "DESTROY-CB-PROOF-VIEW", 1, 0, false);
        declareFunction("dreamcatcher_justify", "DREAMCATCHER-JUSTIFY", 1, 0, false);
        declareFunction("set_dreamcatcher_proof_view_params", "SET-DREAMCATCHER-PROOF-VIEW-PARAMS", 1, 0, false);
        declareFunction("proof_view_entry_generate_html_dreamcatcher", "PROOF-VIEW-ENTRY-GENERATE-HTML-DREAMCATCHER", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_proof_view_file() {
        deflexical("*CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED-CACHING-STATE*", NIL);
        defparameter("*CB-PROOF-VIEW-MEMOIZATION-STATE-INDEX*", locking_map.create_locking_map(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        defparameter("*CB-PROOF-VIEW-DEFAULT-PARAMS*", $DEFAULT);
        defparameter("*CB-PROOF-VIEW-SHOW-BUG-REPORT-LINKS?*", T);
        defparameter("*CB-PROOF-VIEW-INCLUDE-STORY-SECTION?*", NIL);
        defparameter("*CB-PROOF-VIEWS*", dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        defparameter("*CB-PROOF-VIEW-THREADS*", set.new_set(symbol_function(EQL), UNPROVIDED));
        deflexical("*CB-PROOF-VIEW-ENTRIES-PARAPHRASED*", SubLTrampolineFile.maybeDefault($cb_proof_view_entries_paraphrased$, $cb_proof_view_entries_paraphrased$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
        deflexical("*CB-PROOF-VIEW-ESTIMATED-PARAPHRASE-TO-CONSTRUCTION-RATIO*", SEVEN_INTEGER);
        deflexical("*CB-PROOF-VIEW-TIME-ESTIMATES*", NIL);
        deflexical("*CB-PROOF-VIEW-TIME-ESTIMATES-LOG*", file_utilities.cyc_home_filename($list134, $str135$cb_proof_view_time_estimates, $$$log));
        deflexical("*CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS-CACHING-STATE*", NIL);
        deflexical("*CB-PROOF-VIEW-DESTROYER*", SubLTrampolineFile.maybeDefault($cb_proof_view_destroyer$, $cb_proof_view_destroyer$, () -> delayed_processor.new_delayed_processor($int$1200, VALID_PROOF_VIEW_P, DESTROY_PROOF_VIEW)));
        return NIL;
    }

    public static SubLObject setup_cb_proof_view_file() {
        setup_cb_link_method($ASSERTION_PROOF_VIEW, CB_LINK_ASSERTION_PROOF_VIEW, TWO_INTEGER);
        setup_cb_link_method($PROOF_VIEW_BUG, CB_LINK_PROOF_VIEW_BUG, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_PROOF_VIEW_BUG_REPORT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_PROCESS_PROOF_VIEW_BUG_REPORT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_ASSERTION_PROOF_VIEW, $HTML_HANDLER);
        memoization_state.note_globally_cached_function(CB_PROOF_VIEW_SENTENCE_ANSWER_CACHED);
        html_macros.note_cgi_handler_function(CB_SENTENCE_PROOF_VIEW, $HTML_HANDLER);
        setup_cb_link_method($SIMPLE_PROOF_VIEW, CB_LINK_SIMPLE_PROOF_VIEW, FOUR_INTEGER);
        register_html_state_variable($cb_proof_view_memoization_state_index$);
        register_html_state_variable($cb_proof_view_default_params$);
        register_html_state_variable($sym90$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__);
        html_macros.note_cgi_handler_function(CB_SIMPLE_PROOF_VIEW, $HTML_HANDLER);
        register_html_state_variable($sym93$_CB_PROOF_VIEW_INCLUDE_STORY_SECTION__);
        setup_cb_link_method($SHOW_PROOF_VIEW, CB_LINK_SHOW_PROOF_VIEW, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_SHOW_PROOF_VIEW, $HTML_HANDLER);
        register_html_state_variable($cb_proof_views$);
        register_html_state_variable($cb_proof_view_threads$);
        declare_defglobal($cb_proof_view_entries_paraphrased$);
        memoization_state.note_globally_cached_function(CB_PROOF_VIEW_HISTORICAL_FUDGE_FACTORS);
        declare_defglobal($cb_proof_view_destroyer$);
        html_macros.note_cgi_handler_function(DREAMCATCHER_JUSTIFY, $HTML_HANDLER);
        note_funcall_helper_function(PROOF_VIEW_ENTRY_GENERATE_HTML_DREAMCATCHER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_proof_view_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_proof_view_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_proof_view_file();
    }

    static {








































































































































































































    }
}

/**
 * Total time: 902 ms synthetic
 */
