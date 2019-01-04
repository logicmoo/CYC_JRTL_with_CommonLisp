package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_proof_view extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_proof_view";
    public static final String myFingerPrint = "afb621acb053599f6ec47adadb9c44571c68cd7163573fecfb65bbbff0d7290b";
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 6578L)
    private static SubLSymbol $cb_proof_view_sentence_answer_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 9327L)
    public static SubLSymbol $cb_proof_view_memoization_state_index$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 9497L)
    public static SubLSymbol $cb_proof_view_default_params$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 9606L)
    public static SubLSymbol $cb_proof_view_show_bug_report_linksP$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 11043L)
    public static SubLSymbol $cb_proof_view_include_story_sectionP$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 16309L)
    public static SubLSymbol $cb_proof_views$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 16904L)
    public static SubLSymbol $cb_proof_view_threads$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 17621L)
    private static SubLSymbol $cb_proof_view_entries_paraphrased$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 19482L)
    private static SubLSymbol $cb_proof_view_estimated_paraphrase_to_construction_ratio$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 20967L)
    private static SubLSymbol $cb_proof_view_time_estimates$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 21368L)
    private static SubLSymbol $cb_proof_view_time_estimates_log$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 23363L)
    private static SubLSymbol $cb_proof_view_historical_fudge_factors_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 26336L)
    private static SubLSymbol $cb_proof_view_destroyer$;
    private static final SubLString $str0$_Proof_View_;
    private static final SubLSymbol $kw1$MAIN;
    private static final SubLString $str2$cb_assertion_proof_view__A;
    private static final SubLSymbol $kw3$ASSERTION_PROOF_VIEW;
    private static final SubLSymbol $sym4$CB_LINK_ASSERTION_PROOF_VIEW;
    private static final SubLString $str5$Proof_View_Problem;
    private static final SubLString $str6$cg_cb_proof_view_bug_report_;
    private static final SubLString $str7$_;
    private static final SubLString $str8$jira;
    private static final SubLInteger $int9$900;
    private static final SubLInteger $int10$800;
    private static final SubLString $str11$pf_bug;
    private static final SubLSymbol $kw12$HTML_JIRA_IMAGE;
    private static final SubLSymbol $kw13$TOP;
    private static final SubLSymbol $kw14$CENTER;
    private static final SubLSymbol $kw15$PROOF_VIEW_BUG;
    private static final SubLSymbol $sym16$CB_LINK_PROOF_VIEW_BUG;
    private static final SubLSymbol $kw17$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym18$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str19$Couldn_t_find_a_proof_view_with_I;
    private static final SubLString $str20$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str21$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw22$UNINITIALIZED;
    private static final SubLSymbol $kw23$CB_CYC;
    private static final SubLString $str24$Report_Proof_View_Problem;
    private static final SubLString $str25$post;
    private static final SubLString $str26$cb_process_proof_view_bug_report;
    private static final SubLString $str27$proof_view_id;
    private static final SubLString $str28$proof_view_entry_id;
    private static final SubLString $str29$Proof_View_Entry_;
    private static final SubLString $str30$showcycl;
    private static final SubLString $str31$background___EEE__border__ridge_6;
    private static final SubLString $str32$Please_indicate_what_the_problem_;
    private static final SubLString $str33$problem;
    private static final SubLSymbol $kw34$TRIVIAL;
    private static final SubLString $str35$Trivial;
    private static final SubLSymbol $kw36$IRRELEVANT;
    private static final SubLString $str37$Irrelevant;
    private static final SubLSymbol $kw38$BAD_PARAPHRASE;
    private static final SubLString $str39$Bad_Paraphrase;
    private static final SubLSymbol $kw40$WRONG_LOCATION;
    private static final SubLString $str41$Wrong_Location_in_Justification;
    private static final SubLSymbol $kw42$OTHER;
    private static final SubLString $str43$Other__please_explain_;
    private static final SubLString $str44$Details__;
    private static final SubLString $str45$details;
    private static final SubLInteger $int46$60;
    private static final SubLString $str47$virtual;
    private static final SubLString $str48$Go_to_JIRA_to_Submit;
    private static final SubLSymbol $kw49$SUBMIT;
    private static final SubLSymbol $sym50$CB_PROOF_VIEW_BUG_REPORT;
    private static final SubLSymbol $kw51$HTML_HANDLER;
    private static final SubLString $str52$Proof_View_Problem__;
    private static final SubLString $str53$_;
    private static final SubLString $str54$Query____A____;
    private static final SubLInteger $int55$2048;
    private static final SubLString $str56$Answer____A____;
    private static final SubLInteger $int57$1024;
    private static final SubLString $str58$Entry__D____A___A;
    private static final SubLString $str59$____Details_____A;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$CB_PROCESS_PROOF_VIEW_BUG_REPORT;
    private static final SubLString $str62$_A_does_not_specify_an_assertion;
    private static final SubLSymbol $sym63$CB_ASSERTION_PROOF_VIEW;
    private static final SubLSymbol $kw64$MINIMAL;
    private static final SubLSymbol $sym65$CB_PROOF_VIEW_SENTENCE_ANSWER_CACHED;
    private static final SubLSymbol $kw66$MAX_NUMBER;
    private static final SubLSymbol $kw67$INFERENCE_MODE;
    private static final SubLSymbol $sym68$_CB_PROOF_VIEW_SENTENCE_ANSWER_CACHED_CACHING_STATE_;
    private static final SubLList $list69;
    private static final SubLString $str70$_A_does_not_specify_a_CycL_senten;
    private static final SubLString $str71$mt;
    private static final SubLString $str72$task;
    private static final SubLString $str73$mode;
    private static final SubLString $str74$Could_not_prove__S_in__S;
    private static final SubLSymbol $sym75$CB_SENTENCE_PROOF_VIEW;
    private static final SubLObject $const76$InferencePSC;
    private static final SubLSymbol $sym77$PROOF_P;
    private static final SubLSymbol $sym78$INFERENCE_ANSWER_P;
    private static final SubLString $str79$_Proof_;
    private static final SubLString $str80$_;
    private static final SubLString $str81$_;
    private static final SubLString $str82$cb_simple_proof_view__A__A__A__A_;
    private static final SubLString $str83$_debug_T;
    private static final SubLString $str84$;
    private static final SubLSymbol $kw85$SIMPLE_PROOF_VIEW;
    private static final SubLSymbol $sym86$CB_LINK_SIMPLE_PROOF_VIEW;
    private static final SubLSymbol $sym87$_CB_PROOF_VIEW_MEMOIZATION_STATE_INDEX_;
    private static final SubLSymbol $kw88$DEFAULT;
    private static final SubLSymbol $sym89$_CB_PROOF_VIEW_DEFAULT_PARAMS_;
    private static final SubLSymbol $sym90$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__;
    private static final SubLSymbol $sym91$_EXIT;
    private static final SubLSymbol $sym92$CB_SIMPLE_PROOF_VIEW;
    private static final SubLSymbol $sym93$_CB_PROOF_VIEW_INCLUDE_STORY_SECTION__;
    private static final SubLString $str94$memoization_state;
    private static final SubLString $str95$suppress_summary;
    private static final SubLString $str96$debug;
    private static final SubLString $str97$suppress_detailed;
    private static final SubLString $str98$suppress_linear;
    private static final SubLString $str99$suppress_bookkeeping;
    private static final SubLString $str100$suppress_cyclists;
    private static final SubLString $str101$suppress_assertion_dates;
    private static final SubLString $str102$suppress_cyclist_employers;
    private static final SubLString $str103$suppress_links_in_nl;
    private static final SubLString $str104$suppress_phrase_links;
    private static final SubLSymbol $kw105$STORY;
    private static final SubLList $list106;
    private static final SubLSymbol $sym107$INTEGERP;
    private static final SubLSymbol $sym108$PROBLEM_STORE_P;
    private static final SubLSymbol $sym109$INFERENCE_P;
    private static final SubLSymbol $kw110$SKIP;
    private static final SubLSymbol $sym111$PROOF_VIEW_P;
    private static final SubLString $str112$_Proof_View_;
    private static final SubLString $str113$cb_show_proof_view__A;
    private static final SubLSymbol $kw114$SHOW_PROOF_VIEW;
    private static final SubLSymbol $sym115$CB_LINK_SHOW_PROOF_VIEW;
    private static final SubLList $list116;
    private static final SubLSymbol $kw117$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw118$SHA1;
    private static final SubLString $str119$yui_skin_sam;
    private static final SubLString $str120$reloadFrameButton;
    private static final SubLString $str121$button;
    private static final SubLString $str122$reload;
    private static final SubLString $str123$Refresh_Frames;
    private static final SubLString $str124$Proof_View;
    private static final SubLString $str125$_S_does_not_identify_an_existing_;
    private static final SubLSymbol $sym126$CB_SHOW_PROOF_VIEW;
    private static final SubLSymbol $sym127$_CB_PROOF_VIEWS_;
    private static final SubLSymbol $sym128$_CB_PROOF_VIEW_THREADS_;
    private static final SubLString $str129$CB_Proof_View_Preparer_for_proof_;
    private static final SubLString $str130$_of_proof_;
    private static final SubLSymbol $sym131$PREPARE_CB_PROOF_VIEW;
    private static final SubLSymbol $sym132$_CB_PROOF_VIEW_ENTRIES_PARAPHRASED_;
    private static final SubLInteger $int133$100;
    private static final SubLList $list134;
    private static final SubLString $str135$cb_proof_view_time_estimates;
    private static final SubLString $str136$log;
    private static final SubLSymbol $kw137$APPEND;
    private static final SubLString $str138$Unable_to_open__S;
    private static final SubLSymbol $sym139$FIRST;
    private static final SubLList $list140;
    private static final SubLSymbol $sym141$PRINC_TO_STRING;
    private static final SubLFloat $float142$0_5;
    private static final SubLSymbol $sym143$CB_PROOF_VIEW_HISTORICAL_FUDGE_FACTORS;
    private static final SubLFloat $float144$1_0;
    private static final SubLSymbol $kw145$INPUT;
    private static final SubLList $list146;
    private static final SubLString $str147$_;
    private static final SubLList $list148;
    private static final SubLInteger $int149$25;
    private static final SubLSymbol $sym150$_CB_PROOF_VIEW_HISTORICAL_FUDGE_FACTORS_CACHING_STATE_;
    private static final SubLString $str151$Generating_proof_view___;
    private static final SubLString $str152$Estimated_time_remaining___A;
    private static final SubLString $str153$_Display_in_progress_proof_view_n;
    private static final SubLSymbol $kw154$SELF;
    private static final SubLSymbol $kw155$TABVIEW_CSS;
    private static final SubLSymbol $kw156$FONTS;
    private static final SubLSymbol $kw157$CONTAINER_CSS;
    private static final SubLSymbol $kw158$YAHOO_DOM_EVENT;
    private static final SubLSymbol $kw159$ELEMENT;
    private static final SubLSymbol $kw160$TABVIEW;
    private static final SubLSymbol $kw161$CONTAINER;
    private static final SubLSymbol $kw162$STYLE;
    private static final SubLSymbol $kw163$RIGHT;
    private static final SubLString $str164$_Refresh_;
    private static final SubLString $str165$_Debug_;
    private static final SubLSymbol $sym166$_CB_PROOF_VIEW_DESTROYER_;
    private static final SubLInteger $int167$1200;
    private static final SubLSymbol $sym168$VALID_PROOF_VIEW_P;
    private static final SubLSymbol $sym169$DESTROY_PROOF_VIEW;
    private static final SubLString $str170$DreamCatcher;
    private static final SubLString $str171$furl;
    private static final SubLString $str172$context;
    private static final SubLSymbol $kw173$FEEDBACK_URL;
    private static final SubLSymbol $kw174$FEEDBACK_CONTEXT;
    private static final SubLString $str175$_entryText_hover__feedback___visi;
    private static final SubLSymbol $sym176$DREAMCATCHER_JUSTIFY;
    private static final SubLSymbol $kw177$ENTRY_PARAPHRASE_FN;
    private static final SubLSymbol $sym178$PROOF_VIEW_ENTRY_GENERATE_HTML_DREAMCATCHER;
    private static final SubLString $str179$entryText;
    private static final SubLString $str180$_application_justify_context_;
    private static final SubLString $str181$_;
    private static final SubLString $str182$window_open__;
    private static final SubLString $str183$___Feedback___;
    private static final SubLString $str184$feedback;
    private static final SubLString $str185$_cycdoc_img_speechbubble_png;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 845L)
    public static SubLObject cb_link_assertion_proof_view(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_proof_view.UNPROVIDED) {
            linktext = (SubLObject)cb_proof_view.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_proof_view.NIL == linktext) {
            linktext = (SubLObject)cb_proof_view.$str0$_Proof_View_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_proof_view.$kw1$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_proof_view.$str2$cb_assertion_proof_view__A, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        if (cb_proof_view.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 1159L)
    public static SubLObject cb_link_proof_view_bug(final SubLObject proof_view_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(proof_view_entry);
        final SubLObject title_string = (SubLObject)cb_proof_view.$str5$Proof_View_Problem;
        final SubLObject href = Sequences.cconcatenate((SubLObject)cb_proof_view.$str6$cg_cb_proof_view_bug_report_, new SubLObject[] { format_nil.format_nil_a_no_copy(proof_view.proof_view_get_id(v_proof_view)), cb_proof_view.$str7$_, format_nil.format_nil_a_no_copy(proof_view.proof_view_entry_get_id(proof_view_entry)) });
        final SubLObject window_name = (SubLObject)cb_proof_view.$str8$jira;
        final SubLObject onclick = html_script_utilities.html_popup_onclick(window_name, (SubLObject)cb_proof_view.$int9$900, (SubLObject)cb_proof_view.$int10$800, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        html_utilities.html_markup(href);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        if (cb_proof_view.NIL != title_string) {
            html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
            html_utilities.html_markup(title_string);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        html_utilities.html_markup(onclick);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_proof_view.$str11$pf_bug);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
            final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)cb_proof_view.$kw12$HTML_JIRA_IMAGE));
            final SubLObject align = (SubLObject)cb_proof_view.$kw13$TOP;
            final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)cb_proof_view.$kw12$HTML_JIRA_IMAGE);
            final SubLObject border = (SubLObject)cb_proof_view.ZERO_INTEGER;
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
            html_utilities.html_markup(image_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
            if (cb_proof_view.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
            }
            if (cb_proof_view.NIL != align) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
            }
            if (cb_proof_view.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return proof_view_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 1726L)
    public static SubLObject cb_proof_view_bug_report(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_proof_view = (SubLObject)cb_proof_view.NIL;
        SubLObject entry = (SubLObject)cb_proof_view.NIL;
        SubLObject ignore_errors_tag = (SubLObject)cb_proof_view.NIL;
        try {
            thread.throwStack.push(cb_proof_view.$kw17$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)cb_proof_view.$sym18$IGNORE_ERRORS_HANDLER), thread);
                try {
                    v_proof_view = proof_view.find_proof_view_by_id(reader.parse_integer(args.first(), (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED));
                    if (cb_proof_view.NIL != v_proof_view && cb_proof_view.NIL != conses_high.second(args)) {
                        entry = proof_view.find_proof_view_entry_by_id(v_proof_view, reader.parse_integer(conses_high.second(args), (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED));
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)cb_proof_view.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)cb_proof_view.$kw17$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (cb_proof_view.NIL == proof_view.proof_view_p(v_proof_view)) {
            cb_utilities.cb_error((SubLObject)cb_proof_view.$str19$Couldn_t_find_a_proof_view_with_I, args.first(), (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
        }
        html_utilities.html_markup((SubLObject)cb_proof_view.$str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_proof_view.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_proof_view.$str21$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_proof_view.$kw22$UNINITIALIZED) ? ConsesLow.list(cb_proof_view.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_proof_view.$kw23$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_proof_view.$str24$Report_Proof_View_Problem);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_proof_view.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_proof_view.ONE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_proof_view.$str24$Report_Proof_View_Problem);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_proof_view.ONE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_proof_view.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_proof_view.$str25$post);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                    if (cb_proof_view.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                    final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_proof_view.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)cb_proof_view.$str26$cb_process_proof_view_bug_report, (SubLObject)cb_proof_view.T, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_hidden_input((SubLObject)cb_proof_view.$str27$proof_view_id, proof_view.proof_view_get_id(v_proof_view), (SubLObject)cb_proof_view.UNPROVIDED);
                        if (cb_proof_view.NIL != entry) {
                            html_utilities.html_hidden_input((SubLObject)cb_proof_view.$str28$proof_view_entry_id, proof_view.proof_view_entry_get_id(entry), (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_proof_view.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_proof_view.$str29$Proof_View_Entry_);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_proof_view.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_proof_view.$str30$showcycl);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_proof_view.$str31$background___EEE__border__ridge_6);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                pph_proof.show_proof_view_entry(entry, (SubLObject)cb_proof_view.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_proof_view.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_proof_view.$str32$Please_indicate_what_the_problem_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                    html_utilities.html_radio_input((SubLObject)cb_proof_view.$str33$problem, (SubLObject)cb_proof_view.$kw34$TRIVIAL, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_proof_view.$str35$Trivial);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                    html_utilities.html_radio_input((SubLObject)cb_proof_view.$str33$problem, (SubLObject)cb_proof_view.$kw36$IRRELEVANT, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_proof_view.$str37$Irrelevant);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                    html_utilities.html_radio_input((SubLObject)cb_proof_view.$str33$problem, (SubLObject)cb_proof_view.$kw38$BAD_PARAPHRASE, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_proof_view.$str39$Bad_Paraphrase);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                    html_utilities.html_radio_input((SubLObject)cb_proof_view.$str33$problem, (SubLObject)cb_proof_view.$kw40$WRONG_LOCATION, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_proof_view.$str41$Wrong_Location_in_Justification);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                    html_utilities.html_radio_input((SubLObject)cb_proof_view.$str33$problem, (SubLObject)cb_proof_view.$kw42$OTHER, (SubLObject)cb_proof_view.T, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_proof_view.$str43$Other__please_explain_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_proof_view.$str44$Details__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_proof_view.$str45$details);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_proof_view.$int46$60);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_proof_view.FIVE_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_proof_view.$str47$virtual);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_submit_input((SubLObject)cb_proof_view.$str48$Go_to_JIRA_to_Submit, (SubLObject)cb_proof_view.$kw49$SUBMIT, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 4068L)
    public static SubLObject cb_process_proof_view_bug_report(final SubLObject args) {
        final SubLObject proof_view_id = html_utilities.html_extract_integer((SubLObject)cb_proof_view.$str27$proof_view_id, args, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject v_proof_view = proof_view.find_proof_view_by_id(proof_view_id);
        final SubLObject entry_id = html_utilities.html_extract_integer((SubLObject)cb_proof_view.$str28$proof_view_entry_id, args, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject entry = proof_view.find_proof_view_entry_by_id(v_proof_view, entry_id);
        final SubLObject problem = html_utilities.html_extract_keyword((SubLObject)cb_proof_view.$str33$problem, args, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject details = html_utilities.html_extract_input((SubLObject)cb_proof_view.$str45$details, args);
        final SubLObject summary = Sequences.cconcatenate((SubLObject)cb_proof_view.$str52$Proof_View_Problem__, new SubLObject[] { format_nil.format_nil_a_no_copy(problem), cb_proof_view.$str53$_ });
        SubLObject description = (SubLObject)cb_proof_view.NIL;
        SubLObject url = (SubLObject)cb_proof_view.NIL;
        SubLObject s = (SubLObject)cb_proof_view.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject v_answer = proof_view.proof_view_get_answer(v_proof_view);
            final SubLObject inference = inference_datastructures_inference.inference_answer_inference(v_answer);
            final SubLObject subl_query = inference_datastructures_inference.inference_to_new_cyc_query_form_string(inference);
            PrintLow.format(s, (SubLObject)cb_proof_view.$str54$Query____A____, string_utilities.substring(subl_query, (SubLObject)cb_proof_view.ZERO_INTEGER, (SubLObject)cb_proof_view.$int55$2048));
            PrintLow.format(s, (SubLObject)cb_proof_view.$str56$Answer____A____, string_utilities.substring(print_high.princ_to_string(inference_datastructures_inference.inference_answer_el_sentence(v_answer)), (SubLObject)cb_proof_view.ZERO_INTEGER, (SubLObject)cb_proof_view.$int57$1024));
            PrintLow.format(s, (SubLObject)cb_proof_view.$str58$Entry__D____A___A, new SubLObject[] { proof_view.proof_view_entry_get_id(entry), html_utilities.remove_html_tags(proof_view.proof_view_entry_generate_html(entry), (SubLObject)cb_proof_view.UNPROVIDED), proof_view.proof_view_entry_get_object(entry) });
            if (cb_proof_view.NIL != string_utilities.non_empty_stringP(details)) {
                PrintLow.format(s, (SubLObject)cb_proof_view.$str59$____Details_____A, details);
            }
            description = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cb_proof_view.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)cb_proof_view.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        url = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("CREATE-JIRA-ISSUE-URL"), summary, description, (SubLObject)cb_proof_view.$list60);
        html_utilities.html_refresh((SubLObject)cb_proof_view.ZERO_INTEGER, url);
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 5437L)
    public static SubLObject cb_assertion_proof_view(final SubLObject args) {
        final SubLObject assertion = cb_utilities.cb_guess_assertion(args.first());
        if (cb_proof_view.NIL == assertion_handles.assertion_p(assertion)) {
            cb_utilities.cb_error((SubLObject)cb_proof_view.$str62$_A_does_not_specify_an_assertion, args, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
            return (SubLObject)cb_proof_view.NIL;
        }
        final SubLObject v_answer = cb_proof_view_assertion_answer(assertion);
        final SubLObject proof = pph_proof.inference_answer_get_proofs(v_answer).first();
        return cb_launch_proof_view(proof, v_answer, args.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 6034L)
    public static SubLObject cb_proof_view_assertion_answer(final SubLObject assertion) {
        return cb_proof_view_sentence_answer(uncanonicalizer.assertion_el_formula(assertion), assertions_high.assertion_mt(assertion), (SubLObject)cb_proof_view.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 6193L)
    public static SubLObject cb_proof_view_sentence_answer(final SubLObject sentence, final SubLObject mt, SubLObject inference_mode) {
        if (inference_mode == cb_proof_view.UNPROVIDED) {
            inference_mode = (SubLObject)cb_proof_view.$kw64$MINIMAL;
        }
        SubLObject v_answer = cb_proof_view_sentence_answer_cached(sentence, mt, inference_mode);
        if (cb_proof_view.NIL == inference_datastructures_inference.valid_inference_answer_p(v_answer)) {
            remove_cb_proof_view_sentence_answer_cached(sentence, mt, (SubLObject)cb_proof_view.UNPROVIDED);
            v_answer = cb_proof_view_sentence_answer_cached(sentence, mt, (SubLObject)cb_proof_view.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 6578L)
    public static SubLObject clear_cb_proof_view_sentence_answer_cached() {
        final SubLObject cs = cb_proof_view.$cb_proof_view_sentence_answer_cached_caching_state$.getGlobalValue();
        if (cb_proof_view.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 6578L)
    public static SubLObject remove_cb_proof_view_sentence_answer_cached(final SubLObject sentence, final SubLObject mt, SubLObject inference_mode) {
        if (inference_mode == cb_proof_view.UNPROVIDED) {
            inference_mode = (SubLObject)cb_proof_view.$kw64$MINIMAL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(cb_proof_view.$cb_proof_view_sentence_answer_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sentence, mt, inference_mode), (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 6578L)
    public static SubLObject cb_proof_view_sentence_answer_cached_internal(final SubLObject sentence, final SubLObject mt, final SubLObject inference_mode) {
        final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, (SubLObject)cb_proof_view.UNPROVIDED);
        inference_kernel.continue_inference(inference, (SubLObject)ConsesLow.list((SubLObject)cb_proof_view.$kw66$MAX_NUMBER, (SubLObject)cb_proof_view.ONE_INTEGER, (SubLObject)cb_proof_view.$kw67$INFERENCE_MODE, inference_mode));
        return inference_datastructures_inference.inference_first_answer(inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 6578L)
    public static SubLObject cb_proof_view_sentence_answer_cached(final SubLObject sentence, final SubLObject mt, SubLObject inference_mode) {
        if (inference_mode == cb_proof_view.UNPROVIDED) {
            inference_mode = (SubLObject)cb_proof_view.$kw64$MINIMAL;
        }
        SubLObject caching_state = cb_proof_view.$cb_proof_view_sentence_answer_cached_caching_state$.getGlobalValue();
        if (cb_proof_view.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_proof_view.$sym65$CB_PROOF_VIEW_SENTENCE_ANSWER_CACHED, (SubLObject)cb_proof_view.$sym68$_CB_PROOF_VIEW_SENTENCE_ANSWER_CACHED_CACHING_STATE_, (SubLObject)cb_proof_view.SIXTEEN_INTEGER, (SubLObject)cb_proof_view.EQUAL, (SubLObject)cb_proof_view.THREE_INTEGER, (SubLObject)cb_proof_view.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, inference_mode);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)cb_proof_view.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)cb_proof_view.NIL;
            collision = cdolist_list_var.first();
            while (cb_proof_view.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (cb_proof_view.NIL != cached_args && cb_proof_view.NIL == cached_args.rest() && inference_mode.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cb_proof_view_sentence_answer_cached_internal(sentence, mt, inference_mode)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt, inference_mode));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 6929L)
    public static SubLObject cb_sentence_proof_view(final SubLObject args) {
        SubLObject sentence_id = (SubLObject)cb_proof_view.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_proof_view.$list69);
        sentence_id = args.first();
        final SubLObject more_args;
        final SubLObject current = more_args = args.rest();
        final SubLObject sentence = cb_utilities.cb_guess_sentence(sentence_id);
        if (cb_proof_view.NIL == cycl_grammar.cycl_sentence_p(sentence)) {
            cb_utilities.cb_error((SubLObject)cb_proof_view.$str70$_A_does_not_specify_a_CycL_senten, sentence_id, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
            return (SubLObject)cb_proof_view.NIL;
        }
        final SubLObject mt_id = html_utilities.html_extract_input((SubLObject)cb_proof_view.$str71$mt, more_args);
        final SubLObject task_id = html_utilities.html_extract_input((SubLObject)cb_proof_view.$str72$task, more_args);
        final SubLObject mode = html_utilities.html_extract_keyword((SubLObject)cb_proof_view.$str73$mode, more_args, (SubLObject)cb_proof_view.$kw64$MINIMAL);
        final SubLObject mt = dwim_cb_sentence_proof_view_mt(mt_id, task_id);
        final SubLObject v_answer = cb_proof_view_sentence_answer(sentence, mt, mode);
        if (cb_proof_view.NIL == inference_datastructures_inference.valid_inference_answer_p(v_answer)) {
            cb_utilities.cb_error((SubLObject)cb_proof_view.$str74$Could_not_prove__S_in__S, sentence, mt, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
            return (SubLObject)cb_proof_view.NIL;
        }
        final SubLObject proof = pph_proof.inference_answer_get_proofs(v_answer).first();
        return cb_launch_proof_view(proof, v_answer, more_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 8327L)
    public static SubLObject dwim_cb_sentence_proof_view_mt(final SubLObject mt_id, final SubLObject task_id) {
        SubLObject mt = cb_utilities.cb_guess_mt(mt_id);
        if (cb_proof_view.NIL == mt) {
            final SubLObject task = cb_utilities.cb_guess_constant(task_id);
            if (cb_proof_view.NIL != task) {
                mt = cae_query_search.cae_default_query_mt(task);
            }
            if (cb_proof_view.NIL == mt) {
                mt = cb_proof_view.$const76$InferencePSC;
            }
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 8651L)
    public static SubLObject cb_link_simple_proof_view(final SubLObject proof, final SubLObject inference_answer, SubLObject linktext, SubLObject debugP) {
        if (linktext == cb_proof_view.UNPROVIDED) {
            linktext = (SubLObject)cb_proof_view.NIL;
        }
        if (debugP == cb_proof_view.UNPROVIDED) {
            debugP = (SubLObject)cb_proof_view.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_proof_view.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        assert cb_proof_view.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : inference_answer;
        if (cb_proof_view.NIL == linktext) {
            linktext = Sequences.cconcatenate((SubLObject)cb_proof_view.$str79$_Proof_, new SubLObject[] { format_nil.format_nil_a_no_copy(inference_datastructures_problem_store.problem_store_suid(inference_datastructures_proof.proof_store(proof))), cb_proof_view.$str80$_, format_nil.format_nil_a_no_copy(inference_datastructures_proof.proof_suid(proof)), cb_proof_view.$str81$_ });
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_proof_view.$kw1$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_proof_view.$str82$cb_simple_proof_view__A__A__A__A_, new SubLObject[] { inference_datastructures_problem_store.problem_store_suid(inference_datastructures_proof.proof_store(proof)), inference_datastructures_proof.proof_suid(proof), inference_datastructures_inference.inference_suid(inference_datastructures_inference.inference_answer_inference(inference_answer)), inference_datastructures_inference.inference_answer_suid(inference_answer), (cb_proof_view.NIL != debugP) ? cb_proof_view.$str83$_debug_T : cb_proof_view.$str84$ });
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        if (cb_proof_view.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_princ(linktext);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 9727L)
    public static SubLObject find_or_create_cb_proof_view_memoization_state(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rw_lock_var = locking_map.locking_map_lock(cb_proof_view.$cb_proof_view_memoization_state_index$.getDynamicValue(thread));
        SubLObject needs_to_releaseP = (SubLObject)cb_proof_view.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            SubLObject state = map_utilities.map_get_without_values(cb_proof_view.$cb_proof_view_memoization_state_index$.getDynamicValue(thread), id, (SubLObject)cb_proof_view.UNPROVIDED);
            if (cb_proof_view.NIL == memoization_state.memoization_state_p(state)) {
                final SubLObject name = print_high.princ_to_string(id);
                state = memoization_state.new_memoization_state(name, ReadWriteLocks.new_rw_lock(name), (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
                map_utilities.map_put(cb_proof_view.$cb_proof_view_memoization_state_index$.getDynamicValue(thread), id, state);
            }
            return state;
        }
        finally {
            if (cb_proof_view.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 10184L)
    public static SubLObject cb_proof_view_initialize_memoization_state(final SubLObject v_proof_view, final SubLObject memoization_state_id) {
        proof_view.proof_view_set_cached_memoization_state(v_proof_view, find_or_create_cb_proof_view_memoization_state(memoization_state_id));
        return memoization_state_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 10433L)
    public static SubLObject cb_simple_proof_view(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject proof = extract_cb_proof_view_proof_and_answer(args);
        final SubLObject v_answer = thread.secondMultipleValue();
        final SubLObject more_args = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return cb_launch_proof_view(proof, v_answer, more_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 11107L)
    public static SubLObject cb_launch_proof_view(final SubLObject proof, final SubLObject v_answer, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_proof_view = cb_proof_view_get_proof_view(proof, v_answer, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_proof_view.NIL != newP) {
            final SubLObject memoization_state_id = html_utilities.html_extract_input((SubLObject)cb_proof_view.$str94$memoization_state, args);
            if (cb_proof_view.NIL != memoization_state_id) {
                cb_proof_view_initialize_memoization_state(v_proof_view, memoization_state_id);
            }
            if (cb_proof_view.NIL != html_utilities.html_extract_input((SubLObject)cb_proof_view.$str95$suppress_summary, args)) {
                proof_view_summary.proof_view_set_include_summary_sectionP(v_proof_view, (SubLObject)cb_proof_view.NIL);
            }
            proof_view.proof_view_set_enable_debugP(v_proof_view, list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_proof_view.$str96$debug, args)));
            if (cb_proof_view.NIL != html_utilities.html_extract_input((SubLObject)cb_proof_view.$str97$suppress_detailed, args)) {
                proof_view.proof_view_set_include_justification_sectionP(v_proof_view, (SubLObject)cb_proof_view.NIL);
            }
            if (cb_proof_view.NIL != html_utilities.html_extract_input((SubLObject)cb_proof_view.$str98$suppress_linear, args)) {
                proof_view_linear.proof_view_set_include_linear_sectionP(v_proof_view, (SubLObject)cb_proof_view.NIL);
            }
            if (cb_proof_view.NIL != html_utilities.html_extract_input((SubLObject)cb_proof_view.$str99$suppress_bookkeeping, args)) {
                proof_view.proof_view_set_suppress_assertion_bookkeepingP(v_proof_view, (SubLObject)cb_proof_view.T);
            }
            if (cb_proof_view.NIL != html_utilities.html_extract_input((SubLObject)cb_proof_view.$str100$suppress_cyclists, args)) {
                proof_view.proof_view_set_suppress_assertion_cyclistsP(v_proof_view, (SubLObject)cb_proof_view.T);
            }
            if (cb_proof_view.NIL != html_utilities.html_extract_input((SubLObject)cb_proof_view.$str101$suppress_assertion_dates, args)) {
                proof_view.proof_view_set_suppress_assertion_datesP(v_proof_view, (SubLObject)cb_proof_view.T);
            }
            if (cb_proof_view.NIL != html_utilities.html_extract_input((SubLObject)cb_proof_view.$str102$suppress_cyclist_employers, args)) {
                proof_view.proof_view_set_suppress_assertion_cyclist_employersP(v_proof_view, (SubLObject)cb_proof_view.T);
            }
            if (cb_proof_view.NIL != html_utilities.html_extract_input((SubLObject)cb_proof_view.$str103$suppress_links_in_nl, args)) {
                proof_view.proof_view_set_allow_internal_linksP(v_proof_view, (SubLObject)cb_proof_view.NIL);
                proof_view.proof_view_set_allow_external_linksP(v_proof_view, (SubLObject)cb_proof_view.NIL);
            }
            if (cb_proof_view.NIL != html_utilities.html_extract_input((SubLObject)cb_proof_view.$str104$suppress_phrase_links, args) || cb_proof_view.NIL == control_vars.$generated_phrases_browsableP$.getDynamicValue(thread)) {
                proof_view.proof_view_set_link_phrasesP(v_proof_view, (SubLObject)cb_proof_view.NIL);
            }
            else {
                proof_view.proof_view_set_link_phrasesP(v_proof_view, (SubLObject)cb_proof_view.T);
            }
            proof_view_populator.proof_view_set_include_special_sectionP(v_proof_view, (SubLObject)cb_proof_view.$kw105$STORY, cb_proof_view.$cb_proof_view_include_story_sectionP$.getDynamicValue(thread));
            if (cb_proof_view.NIL != forts.fort_p(cb_proof_view.$cb_proof_view_default_params$.getDynamicValue(thread))) {
                proof_view.proof_view_set_parameters_from_specification(v_proof_view, cb_proof_view.$cb_proof_view_default_params$.getDynamicValue(thread));
            }
            launch_cb_proof_view_preparer(v_proof_view);
        }
        return cb_simple_proof_view_guts(proof, v_answer, proof_view.proof_view_get_allow_internal_linksP(v_proof_view));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 13582L)
    public static SubLObject extract_cb_proof_view_proof_and_answer(final SubLObject args) {
        SubLObject store_suid_string = (SubLObject)cb_proof_view.NIL;
        SubLObject proof_suid_string = (SubLObject)cb_proof_view.NIL;
        SubLObject inference_suid_string = (SubLObject)cb_proof_view.NIL;
        SubLObject answer_suid_string = (SubLObject)cb_proof_view.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_proof_view.$list106);
        store_suid_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_proof_view.$list106);
        proof_suid_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_proof_view.$list106);
        inference_suid_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_proof_view.$list106);
        answer_suid_string = current.first();
        final SubLObject more_args;
        current = (more_args = current.rest());
        final SubLObject store_suid = reader.read_from_string_ignoring_errors(store_suid_string, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject proof_suid = reader.read_from_string_ignoring_errors(proof_suid_string, (SubLObject)cb_proof_view.NIL, (SubLObject)cb_proof_view.NIL, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject inference_suid = reader.read_from_string_ignoring_errors(inference_suid_string, (SubLObject)cb_proof_view.NIL, (SubLObject)cb_proof_view.NIL, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject answer_suid = reader.read_from_string_ignoring_errors(answer_suid_string, (SubLObject)cb_proof_view.NIL, (SubLObject)cb_proof_view.NIL, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
        assert cb_proof_view.NIL != Types.integerp(store_suid) : store_suid;
        if (cb_proof_view.NIL != inference_suid && !cb_proof_view.assertionsDisabledInClass && cb_proof_view.NIL == Types.integerp(inference_suid)) {
            throw new AssertionError(inference_suid);
        }
        if (cb_proof_view.NIL != answer_suid && !cb_proof_view.assertionsDisabledInClass && cb_proof_view.NIL == Types.integerp(answer_suid)) {
            throw new AssertionError(answer_suid);
        }
        if (cb_proof_view.NIL != proof_suid && !cb_proof_view.assertionsDisabledInClass && cb_proof_view.NIL == Types.integerp(proof_suid)) {
            throw new AssertionError(proof_suid);
        }
        final SubLObject store = inference_datastructures_problem_store.find_problem_store_by_id(store_suid);
        assert cb_proof_view.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject inference = (cb_proof_view.NIL != inference_suid) ? inference_datastructures_problem_store.find_inference_by_id(store, inference_suid) : cb_proof_view_select_inference(store);
        assert cb_proof_view.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject v_answer = (cb_proof_view.NIL != answer_suid) ? inference_datastructures_inference.find_inference_answer_by_id(inference, answer_suid) : cb_proof_view_select_inference_answer(inference);
        assert cb_proof_view.NIL != inference_datastructures_inference.inference_answer_p(v_answer) : v_answer;
        final SubLObject proof = (cb_proof_view.NIL != proof_suid) ? inference_datastructures_problem_store.find_proof_by_id(store, proof_suid) : cb_proof_view_select_inference_answer_proof(v_answer);
        assert cb_proof_view.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        return Values.values(proof, v_answer, more_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 14980L)
    public static SubLObject cb_proof_view_select_inference(final SubLObject store) {
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (cb_proof_view.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)cb_proof_view.$kw110$SKIP)) {
            final SubLObject idx_$22 = idx;
            if (cb_proof_view.NIL == id_index.id_index_dense_objects_empty_p(idx_$22, (SubLObject)cb_proof_view.$kw110$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$22);
                final SubLObject backwardP_var = (SubLObject)cb_proof_view.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_proof_view.NIL, v_iteration = (SubLObject)cb_proof_view.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_proof_view.ONE_INTEGER)) {
                    id = ((cb_proof_view.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_proof_view.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (cb_proof_view.NIL == id_index.id_index_tombstone_p(inference) || cb_proof_view.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_proof_view.$kw110$SKIP)) {
                        if (cb_proof_view.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)cb_proof_view.$kw110$SKIP;
                        }
                        return inference;
                    }
                }
            }
            final SubLObject idx_$23 = idx;
            if (cb_proof_view.NIL == id_index.id_index_sparse_objects_empty_p(idx_$23)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$23);
                SubLObject id2 = (SubLObject)cb_proof_view.NIL;
                SubLObject inference2 = (SubLObject)cb_proof_view.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    if (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        return inference2;
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 15119L)
    public static SubLObject cb_proof_view_select_inference_answer(final SubLObject inference) {
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (cb_proof_view.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)cb_proof_view.$kw110$SKIP)) {
            final SubLObject idx_$24 = idx;
            if (cb_proof_view.NIL == id_index.id_index_dense_objects_empty_p(idx_$24, (SubLObject)cb_proof_view.$kw110$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$24);
                final SubLObject backwardP_var = (SubLObject)cb_proof_view.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_proof_view.NIL, v_iteration = (SubLObject)cb_proof_view.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_proof_view.ONE_INTEGER)) {
                    id = ((cb_proof_view.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_proof_view.ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (cb_proof_view.NIL == id_index.id_index_tombstone_p(v_answer) || cb_proof_view.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_proof_view.$kw110$SKIP)) {
                        if (cb_proof_view.NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = (SubLObject)cb_proof_view.$kw110$SKIP;
                        }
                        return v_answer;
                    }
                }
            }
            final SubLObject idx_$25 = idx;
            if (cb_proof_view.NIL == id_index.id_index_sparse_objects_empty_p(idx_$25)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$25);
                SubLObject id2 = (SubLObject)cb_proof_view.NIL;
                SubLObject v_answer2 = (SubLObject)cb_proof_view.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    if (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        return v_answer2;
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 15260L)
    public static SubLObject cb_proof_view_select_inference_answer_proof(final SubLObject v_answer) {
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject just = (SubLObject)cb_proof_view.NIL;
        just = cdolist_list_var.first();
        while (cb_proof_view.NIL != cdolist_list_var) {
            final SubLObject cdolist_list_var_$26 = inference_datastructures_inference.inference_answer_justification_proofs(just);
            SubLObject proof = (SubLObject)cb_proof_view.NIL;
            proof = cdolist_list_var_$26.first();
            if (cb_proof_view.NIL != cdolist_list_var_$26) {
                return proof;
            }
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        }
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 15474L)
    public static SubLObject cb_link_show_proof_view(final SubLObject v_proof_view, SubLObject linktext, SubLObject target) {
        if (linktext == cb_proof_view.UNPROVIDED) {
            linktext = (SubLObject)cb_proof_view.NIL;
        }
        if (target == cb_proof_view.UNPROVIDED) {
            target = (SubLObject)cb_proof_view.$kw1$MAIN;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_proof_view.NIL != proof_view.proof_view_p(v_proof_view) : v_proof_view;
        final SubLObject id = proof_view.proof_view_get_id(v_proof_view);
        if (cb_proof_view.NIL == linktext) {
            linktext = Sequences.cconcatenate((SubLObject)cb_proof_view.$str112$_Proof_View_, new SubLObject[] { format_nil.format_nil_a_no_copy(id), cb_proof_view.$str81$_ });
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_proof_view.$str113$cb_show_proof_view__A, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        if (cb_proof_view.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_princ(linktext);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 15873L)
    public static SubLObject cb_show_proof_view(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_view_id = (SubLObject)cb_proof_view.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_proof_view.$list116);
        proof_view_id = args.first();
        final SubLObject current = args.rest();
        if (cb_proof_view.NIL == current) {
            final SubLObject v_proof_view = proof_view.find_proof_view_by_id(string_utilities.string_to_integer(proof_view_id));
            if (cb_proof_view.NIL != v_proof_view) {
                final SubLObject title_var = (SubLObject)cb_proof_view.NIL;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind((cb_proof_view.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED), thread);
                    html_utilities.html_markup((SubLObject)cb_proof_view.$str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (cb_proof_view.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_proof_view.$str21$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_proof_view.$kw22$UNINITIALIZED) ? ConsesLow.list(cb_proof_view.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)cb_proof_view.$kw23$CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (cb_proof_view.NIL != title_var) {
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind((SubLObject)cb_proof_view.T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (cb_proof_view.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_proof_view.$str119$yui_skin_sam);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_proof_view.$str120$reloadFrameButton);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_proof_view.$str121$button);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_proof_view.$str122$reload);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_proof_view.$str123$Refresh_Frames);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                    if (cb_proof_view.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (cb_proof_view.NIL != title_var) {
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_proof_view.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_proof_view.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                }
                                html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_proof_view.$str124$Proof_View);
                                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                cb_show_proof_view_int(v_proof_view, (SubLObject)cb_proof_view.NIL);
                                html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$28, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    }
                    finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                }
                finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cb_utilities.cb_error((SubLObject)cb_proof_view.$str125$_S_does_not_identify_an_existing_, proof_view_id, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_proof_view.$list116);
        }
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 16372L)
    public static SubLObject lookup_cb_proof_view(final SubLObject proof, final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = dictionary.dictionary_lookup_without_values(cb_proof_view.$cb_proof_views$.getDynamicValue(thread), (SubLObject)ConsesLow.list(proof, v_answer), (SubLObject)cb_proof_view.UNPROVIDED);
        if (cb_proof_view.NIL == proof_view.valid_proof_view_p(v_proof_view)) {
            forget_cb_proof_view(proof, v_answer);
            return (SubLObject)cb_proof_view.NIL;
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 16647L)
    public static SubLObject note_cb_proof_view(final SubLObject proof, final SubLObject v_answer, final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_enter(cb_proof_view.$cb_proof_views$.getDynamicValue(thread), (SubLObject)ConsesLow.list(proof, v_answer), v_proof_view);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 16785L)
    public static SubLObject forget_cb_proof_view(final SubLObject proof, final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_remove(cb_proof_view.$cb_proof_views$.getDynamicValue(thread), (SubLObject)ConsesLow.list(proof, v_answer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 16965L)
    public static SubLObject kill_all_cb_proof_view_threads() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_contents_var = set.do_set_internal(cb_proof_view.$cb_proof_view_threads$.getDynamicValue(thread));
        SubLObject basis_object;
        SubLObject state;
        SubLObject thread_$31;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_proof_view.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_proof_view.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            thread_$31 = set_contents.do_set_contents_next(basis_object, state);
            if (cb_proof_view.NIL != set_contents.do_set_contents_element_validP(state, thread_$31)) {
                Threads.kill_process(thread_$31);
            }
        }
        set.clear_set(cb_proof_view.$cb_proof_view_threads$.getDynamicValue(thread));
        return cb_proof_view.$cb_proof_view_threads$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 17156L)
    public static SubLObject launch_cb_proof_view_preparer(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proof = proof_view.proof_view_get_proof(v_proof_view);
        final SubLObject name = Sequences.cconcatenate((SubLObject)cb_proof_view.$str129$CB_Proof_View_Preparer_for_proof_, new SubLObject[] { format_nil.format_nil_d_no_copy(proof_view.proof_view_get_id(v_proof_view)), cb_proof_view.$str130$_of_proof_, format_nil.format_nil_d_no_copy(inference_datastructures_problem_store.problem_store_suid(inference_datastructures_proof.proof_store(proof))), cb_proof_view.$str80$_, format_nil.format_nil_d_no_copy(inference_datastructures_proof.proof_suid(proof)) });
        final SubLObject thread_$32 = process_utilities.make_cyc_server_process_with_args(name, (SubLObject)cb_proof_view.$sym131$PREPARE_CB_PROOF_VIEW, (SubLObject)ConsesLow.list(v_proof_view));
        set.set_add(thread_$32, cb_proof_view.$cb_proof_view_threads$.getDynamicValue(thread));
        return thread_$32;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 17701L)
    public static SubLObject increment_cb_proof_view_entries_paraphrased(final SubLObject v_proof_view) {
        return dictionary_utilities.dictionary_increment(cb_proof_view.$cb_proof_view_entries_paraphrased$.getGlobalValue(), v_proof_view, (SubLObject)cb_proof_view.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 17854L)
    public static SubLObject get_cb_proof_view_entries_paraphrased(final SubLObject v_proof_view) {
        return dictionary.dictionary_lookup_without_values(cb_proof_view.$cb_proof_view_entries_paraphrased$.getGlobalValue(), v_proof_view, (SubLObject)cb_proof_view.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 18015L)
    public static SubLObject prepare_cb_proof_view(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            proof_view.proof_view_set_preparer_thread(v_proof_view, (SubLObject)cb_proof_view.UNPROVIDED);
            proof_view_populator.proof_view_populate(v_proof_view, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
            SubLObject cdolist_list_var = proof_view.proof_view_get_entries(v_proof_view);
            SubLObject entry = (SubLObject)cb_proof_view.NIL;
            entry = cdolist_list_var.first();
            while (cb_proof_view.NIL != cdolist_list_var) {
                proof_view.proof_view_entry_generate_html(entry);
                increment_cb_proof_view_entries_paraphrased(v_proof_view);
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_proof_view.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                set.set_remove(Threads.current_process(), cb_proof_view.$cb_proof_view_threads$.getDynamicValue(thread));
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 18416L)
    public static SubLObject cb_proof_view_get_proof_view(final SubLObject proof, final SubLObject v_answer, SubLObject create_if_doesnt_existP) {
        if (create_if_doesnt_existP == cb_proof_view.UNPROVIDED) {
            create_if_doesnt_existP = (SubLObject)cb_proof_view.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_proof_view = lookup_cb_proof_view(proof, v_answer);
        SubLObject newP = (SubLObject)cb_proof_view.NIL;
        if (cb_proof_view.NIL == v_proof_view && cb_proof_view.NIL != create_if_doesnt_existP) {
            v_proof_view = proof_view.get_new_empty_proof_view(v_answer, proof);
            newP = (SubLObject)cb_proof_view.T;
            proof_view.proof_view_set_highlight_phrase_demeritsP(v_proof_view, control_vars.$highlight_demerits_in_generated_phrasesP$.getDynamicValue(thread));
            proof_view.proof_view_set_language_mt(v_proof_view, cb_tools.cb_paraphrase_mt());
            proof_view.proof_view_set_domain_mt(v_proof_view, cb_tools.cb_paraphrase_mt());
            if (cb_proof_view.NIL != control_vars.$assume_cyc_cyclist_dialogP$.getDynamicValue(thread)) {
                proof_view.proof_view_set_addressee(v_proof_view, operation_communication.the_cyclist());
            }
            proof_view.proof_view_set_allow_internal_linksP(v_proof_view, (SubLObject)cb_proof_view.T);
            proof_view.proof_view_set_allow_external_linksP(v_proof_view, (SubLObject)cb_proof_view.T);
            note_cb_proof_view(proof, v_answer, v_proof_view);
        }
        return Values.values(v_proof_view, newP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 19259L)
    public static SubLObject cb_proof_view_compute_percent_ready(final SubLObject proof, final SubLObject v_answer) {
        final SubLObject v_proof_view = cb_proof_view_get_proof_view(proof, v_answer, (SubLObject)cb_proof_view.NIL);
        return (SubLObject)((cb_proof_view.NIL != v_proof_view) ? cb_proof_view_compute_percent_ready_int(v_proof_view) : cb_proof_view.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 19565L)
    public static SubLObject cb_proof_view_compute_percent_ready_int(final SubLObject v_proof_view) {
        final SubLObject total_entry_count = Sequences.length(proof_view.proof_view_get_entries(v_proof_view));
        final SubLObject construction_percent = Numbers.integerDivide((SubLObject)cb_proof_view.$int133$100, number_utilities.f_1X(cb_proof_view.$cb_proof_view_estimated_paraphrase_to_construction_ratio$.getGlobalValue()));
        SubLObject percent_ready = (SubLObject)(cb_proof_view.ZERO_INTEGER.eql(total_entry_count) ? cb_proof_view.ZERO_INTEGER : construction_percent);
        final SubLObject paraphrased_count = get_cb_proof_view_entries_paraphrased(v_proof_view);
        if (paraphrased_count.isPositive()) {
            percent_ready = Numbers.add(percent_ready, Numbers.truncate(Numbers.multiply(Numbers.subtract((SubLObject)cb_proof_view.$int133$100, construction_percent), paraphrased_count), total_entry_count));
        }
        return percent_ready;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 20127L)
    public static SubLObject cb_simple_proof_view_guts(final SubLObject proof, final SubLObject v_answer, SubLObject internal_linksP) {
        if (internal_linksP == cb_proof_view.UNPROVIDED) {
            internal_linksP = (SubLObject)cb_proof_view.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_proof_view.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        assert cb_proof_view.NIL != inference_datastructures_inference.inference_answer_p(v_answer) : v_answer;
        thread.resetMultipleValues();
        final SubLObject v_proof_view = cb_proof_view_get_proof_view(proof, v_answer, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject percent_ready = cb_proof_view_compute_percent_ready_int(v_proof_view);
        if (percent_ready.numL((SubLObject)cb_proof_view.$int133$100)) {
            if (cb_proof_view.NIL != newP) {
                launch_cb_proof_view_preparer(v_proof_view);
            }
            cb_proof_view_progress_pacifier(v_proof_view, percent_ready);
        }
        else {
            forget_cb_proof_view(proof, v_answer);
            proof_view.proof_view_set_allow_internal_linksP(v_proof_view, internal_linksP);
            final SubLObject title_var = (SubLObject)cb_proof_view.NIL;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_proof_view.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_proof_view.$str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_proof_view.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_proof_view.$str21$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_proof_view.$kw22$UNINITIALIZED) ? ConsesLow.list(cb_proof_view.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_proof_view.$kw23$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_proof_view.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_proof_view.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_proof_view.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_proof_view.$str119$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_proof_view.$str120$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_proof_view.$str121$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_proof_view.$str122$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_proof_view.$str123$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                                if (cb_proof_view.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_proof_view.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_proof_view.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_proof_view.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            }
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_proof_view.$str124$Proof_View);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            cb_show_proof_view_int(v_proof_view, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$33, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 21023L)
    public static SubLObject note_cb_proof_view_time_estimate(final SubLObject v_proof_view, final SubLObject percent_ready, final SubLObject estimate, SubLObject universal_time) {
        if (universal_time == cb_proof_view.UNPROVIDED) {
            universal_time = Time.get_universal_time();
        }
        cb_proof_view.$cb_proof_view_time_estimates$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_proof_view, percent_ready, estimate, universal_time), cb_proof_view.$cb_proof_view_time_estimates$.getGlobalValue()));
        return estimate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 21492L)
    public static SubLObject log_cb_proof_view_time_estimate_results(final SubLObject v_proof_view, SubLObject actual_finish_time) {
        if (actual_finish_time == cb_proof_view.UNPROVIDED) {
            actual_finish_time = Time.get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_proof_view.NIL != file_utilities.file_existsP(cb_proof_view.$cb_proof_view_time_estimates_log$.getGlobalValue())) {
            SubLObject stream = (SubLObject)cb_proof_view.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)cb_proof_view.NIL, thread);
                    stream = compatibility.open_text(cb_proof_view.$cb_proof_view_time_estimates_log$.getGlobalValue(), (SubLObject)cb_proof_view.$kw137$APPEND);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)cb_proof_view.$str138$Unable_to_open__S, cb_proof_view.$cb_proof_view_time_estimates_log$.getGlobalValue());
                }
                final SubLObject stream_$37 = stream;
                final SubLObject estimates = conses_high.copy_list(cb_proof_view.$cb_proof_view_time_estimates$.getGlobalValue());
                cb_proof_view.$cb_proof_view_time_estimates$.setGlobalValue(Sequences.delete(v_proof_view, cb_proof_view.$cb_proof_view_time_estimates$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_proof_view.EQL), Symbols.symbol_function((SubLObject)cb_proof_view.$sym139$FIRST), (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED));
                SubLObject cdolist_list_var = estimates;
                SubLObject estimate = (SubLObject)cb_proof_view.NIL;
                estimate = cdolist_list_var.first();
                while (cb_proof_view.NIL != cdolist_list_var) {
                    if (v_proof_view.eql(estimate.first())) {
                        SubLObject current;
                        final SubLObject datum = current = estimate.rest();
                        SubLObject percent_ready = (SubLObject)cb_proof_view.NIL;
                        SubLObject estimate_$38 = (SubLObject)cb_proof_view.NIL;
                        SubLObject universal_time = (SubLObject)cb_proof_view.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_proof_view.$list140);
                        percent_ready = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_proof_view.$list140);
                        estimate_$38 = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_proof_view.$list140);
                        universal_time = current.first();
                        current = current.rest();
                        if (cb_proof_view.NIL == current) {
                            final SubLObject actual = Numbers.subtract(actual_finish_time, universal_time);
                            log_cb_proof_view_time_estimate_result(percent_ready, estimate_$38, actual, stream_$37);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_proof_view.$list140);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    estimate = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_proof_view.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)cb_proof_view.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 22253L)
    public static SubLObject log_cb_proof_view_time_estimate_result(final SubLObject percent_ready, final SubLObject estimate, final SubLObject actual, final SubLObject stream) {
        streams_high.write_line(string_utilities.bunge(Mapping.mapcar((SubLObject)cb_proof_view.$sym141$PRINC_TO_STRING, (SubLObject)ConsesLow.list(percent_ready, estimate, actual)), (SubLObject)Characters.CHAR_tab), stream, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 22460L)
    public static SubLObject cb_proof_view_estimate_seconds_to_go(final SubLObject v_proof_view, SubLObject percent_ready) {
        SubLObject seconds_to_go = (SubLObject)(percent_ready.numGE((SubLObject)cb_proof_view.$int133$100) ? cb_proof_view.ZERO_INTEGER : misc_utilities.uninitialized());
        if (cb_proof_view.NIL != v_proof_view && cb_proof_view.NIL != misc_utilities.uninitialized_p(seconds_to_go)) {
            SubLObject creation_time;
            SubLObject time_so_far;
            for (creation_time = proof_view.proof_view_get_creation_universal_time(v_proof_view), time_so_far = subl_promotions.elapsed_universal_time(creation_time, (SubLObject)cb_proof_view.UNPROVIDED); time_so_far.isZero(); time_so_far = subl_promotions.elapsed_universal_time(creation_time, (SubLObject)cb_proof_view.UNPROVIDED), percent_ready = cb_proof_view_compute_percent_ready_int(v_proof_view)) {
                Threads.sleep((SubLObject)cb_proof_view.$float142$0_5);
            }
            final SubLObject estimated_total_seconds = Numbers.integerDivide(Numbers.multiply(time_so_far, (SubLObject)cb_proof_view.$int133$100), percent_ready);
            seconds_to_go = Numbers.subtract(estimated_total_seconds, time_so_far);
        }
        note_cb_proof_view_time_estimate(v_proof_view, percent_ready, seconds_to_go, (SubLObject)cb_proof_view.UNPROVIDED);
        return Values.values(adjust_cb_proof_view_estimate_wrt_historical_data(seconds_to_go, percent_ready), percent_ready);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 23363L)
    public static SubLObject clear_cb_proof_view_historical_fudge_factors() {
        final SubLObject cs = cb_proof_view.$cb_proof_view_historical_fudge_factors_caching_state$.getGlobalValue();
        if (cb_proof_view.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 23363L)
    public static SubLObject remove_cb_proof_view_historical_fudge_factors() {
        return memoization_state.caching_state_remove_function_results_with_args(cb_proof_view.$cb_proof_view_historical_fudge_factors_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cb_proof_view.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 23363L)
    public static SubLObject cb_proof_view_historical_fudge_factors_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fudge_factors = (SubLObject)ConsesLow.make_list((SubLObject)cb_proof_view.FIVE_INTEGER, (SubLObject)cb_proof_view.$float144$1_0);
        if (cb_proof_view.NIL != file_utilities.file_existsP(cb_proof_view.$cb_proof_view_time_estimates_log$.getGlobalValue())) {
            final SubLObject values = dictionary.new_dictionary((SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
            final SubLObject file_var = cb_proof_view.$cb_proof_view_time_estimates_log$.getGlobalValue();
            SubLObject stream = (SubLObject)cb_proof_view.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)cb_proof_view.NIL, thread);
                    stream = compatibility.open_text(file_var, (SubLObject)cb_proof_view.$kw145$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)cb_proof_view.$str138$Unable_to_open__S, file_var);
                }
                final SubLObject stream_var = stream;
                if (stream_var.isStream()) {
                    final SubLObject stream_var_$39 = stream_var;
                    SubLObject line_number_var = (SubLObject)cb_proof_view.NIL;
                    SubLObject line = (SubLObject)cb_proof_view.NIL;
                    line_number_var = (SubLObject)cb_proof_view.ZERO_INTEGER;
                    for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$39); cb_proof_view.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$39)) {
                        final SubLObject tokens = string_utilities.string_tokenize(line, (SubLObject)cb_proof_view.$list146, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_proof_view.$str147$_, (SubLObject)cb_proof_view.$str147$_)), (SubLObject)cb_proof_view.NIL, (SubLObject)cb_proof_view.NIL, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_backslash), (SubLObject)cb_proof_view.UNPROVIDED);
                        SubLObject current;
                        final SubLObject datum = current = tokens;
                        SubLObject percent_done = (SubLObject)cb_proof_view.NIL;
                        SubLObject estimate = (SubLObject)cb_proof_view.NIL;
                        SubLObject actual = (SubLObject)cb_proof_view.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_proof_view.$list148);
                        percent_done = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_proof_view.$list148);
                        estimate = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_proof_view.$list148);
                        actual = current.first();
                        current = current.rest();
                        if (cb_proof_view.NIL == current) {
                            if (cb_proof_view.NIL != string_utilities.digit_stringP(estimate)) {
                                final SubLObject quartile = Numbers.integerDivide(reader.parse_integer(percent_done, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED), (SubLObject)cb_proof_view.$int149$25);
                                final SubLObject actual_int = reader.parse_integer(actual, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED);
                                if (!cb_proof_view.ZERO_INTEGER.eql(actual_int)) {
                                    dictionary_utilities.dictionary_push(values, quartile, Numbers.divide(reader.parse_integer(estimate, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED), actual_int));
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_proof_view.$list148);
                        }
                        line_number_var = number_utilities.f_1X(line_number_var);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_proof_view.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)cb_proof_view.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(values)); cb_proof_view.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject quartile2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject vals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                ConsesLow.set_nth(quartile2, fudge_factors, number_utilities.median(vals, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED));
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return fudge_factors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 23363L)
    public static SubLObject cb_proof_view_historical_fudge_factors() {
        SubLObject caching_state = cb_proof_view.$cb_proof_view_historical_fudge_factors_caching_state$.getGlobalValue();
        if (cb_proof_view.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_proof_view.$sym143$CB_PROOF_VIEW_HISTORICAL_FUDGE_FACTORS, (SubLObject)cb_proof_view.$sym150$_CB_PROOF_VIEW_HISTORICAL_FUDGE_FACTORS_CACHING_STATE_, (SubLObject)cb_proof_view.NIL, (SubLObject)cb_proof_view.EQL, (SubLObject)cb_proof_view.ZERO_INTEGER, (SubLObject)cb_proof_view.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)cb_proof_view.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cb_proof_view_historical_fudge_factors_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)cb_proof_view.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 24114L)
    public static SubLObject adjust_cb_proof_view_estimate_wrt_historical_data(final SubLObject seconds_to_go, final SubLObject percent_ready) {
        final SubLObject quartile = Numbers.integerDivide(percent_ready, (SubLObject)cb_proof_view.$int149$25);
        final SubLObject fudge_factor = ConsesLow.nth(quartile, cb_proof_view_historical_fudge_factors());
        return fudge_factor.isPositive() ? Numbers.floor(Numbers.divide(seconds_to_go, fudge_factor), (SubLObject)cb_proof_view.UNPROVIDED) : seconds_to_go;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 24435L)
    public static SubLObject cb_proof_view_progress_pacifier(final SubLObject v_proof_view, final SubLObject percent_ready) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject seconds_to_go = cb_proof_view_estimate_seconds_to_go(v_proof_view, percent_ready);
        final SubLObject new_percent_ready = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject title_var = (SubLObject)cb_proof_view.NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_proof_view.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED, (SubLObject)cb_proof_view.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_proof_view.$str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_proof_view.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_proof_view.$str21$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
            final SubLObject _prev_bind_0_$40 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_proof_view.$kw22$UNINITIALIZED) ? ConsesLow.list(cb_proof_view.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_proof_view.$kw23$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_proof_view.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_proof_view.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_proof_view.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_proof_view.$str119$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                    final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_proof_view.$str120$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                        final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_proof_view.$str121$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_proof_view.$str122$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_proof_view.$str123$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            if (cb_proof_view.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_proof_view.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_proof_view.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_proof_view.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)cb_proof_view.$kw23$CB_CYC);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_proof_view.$str124$Proof_View);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_utilities.html_refresh(Numbers.min((SubLObject)cb_proof_view.FIVE_INTEGER, seconds_to_go), (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                        final SubLObject _prev_bind_0_$44 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind((SubLObject)cb_proof_view.T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                                html_utilities.html_princ_strong((SubLObject)cb_proof_view.$str151$Generating_proof_view___);
                                if (new_percent_ready.isPositive()) {
                                    html_utilities.html_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                                    html_utilities.html_percent_progress_bar(new_percent_ready, (SubLObject)cb_proof_view.$int133$100, (SubLObject)cb_proof_view.$int133$100, html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue(), html_macros.$html_color_cyc_logo_violet$.getGlobalValue());
                                    if (seconds_to_go.isPositive()) {
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_proof_view.$str152$Estimated_time_remaining___A, numeric_date_utilities.readable_elapsed_time_string(seconds_to_go, (SubLObject)cb_proof_view.ZERO_INTEGER));
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline((SubLObject)cb_proof_view.UNPROVIDED);
                                        cb_link_show_proof_view(v_proof_view, (SubLObject)cb_proof_view.$str153$_Display_in_progress_proof_view_n, (SubLObject)cb_proof_view.$kw154$SELF);
                                    }
                                }
                                html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$44, thread);
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$41, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$40, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 25317L)
    public static SubLObject cb_show_proof_view_int(final SubLObject v_proof_view, SubLObject destroy_when_doneP) {
        if (destroy_when_doneP == cb_proof_view.UNPROVIDED) {
            destroy_when_doneP = (SubLObject)cb_proof_view.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyc_file_dependencies.css((SubLObject)cb_proof_view.$kw155$TABVIEW_CSS);
        cyc_file_dependencies.css((SubLObject)cb_proof_view.$kw156$FONTS);
        cyc_file_dependencies.css((SubLObject)cb_proof_view.$kw157$CONTAINER_CSS);
        html_script_utilities.cb_hoverover_page_init();
        dhtml_macros.dhtml_with_dom_script();
        dhtml_macros.dhtml_with_toggle_visibility_support();
        cyc_file_dependencies.javascript((SubLObject)cb_proof_view.$kw158$YAHOO_DOM_EVENT);
        cyc_file_dependencies.javascript((SubLObject)cb_proof_view.$kw159$ELEMENT);
        cyc_file_dependencies.javascript((SubLObject)cb_proof_view.$kw160$TABVIEW);
        cyc_file_dependencies.javascript((SubLObject)cb_proof_view.$kw161$CONTAINER);
        final SubLObject style = proof_view.proof_view_get_property(v_proof_view, (SubLObject)cb_proof_view.$kw162$STYLE, (SubLObject)cb_proof_view.UNPROVIDED);
        if (cb_proof_view.NIL != string_utilities.non_empty_stringP(style)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_proof_view.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_style_head$.getGlobalValue());
            html_utilities.html_markup(style);
            html_utilities.html_markup(html_macros.$html_style_tail$.getGlobalValue());
        }
        final SubLObject proof = proof_view.proof_view_get_proof(v_proof_view);
        final SubLObject inference_answer = proof_view.proof_view_get_answer(v_proof_view);
        final SubLObject in_debug_modeP = proof_view.proof_view_get_enable_debugP(v_proof_view);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_div_align$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_proof_view.$kw163$RIGHT);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
            cb_link_simple_proof_view(proof, inference_answer, (SubLObject)cb_proof_view.$str164$_Refresh_, (SubLObject)cb_proof_view.UNPROVIDED);
            if (cb_proof_view.NIL == in_debug_modeP) {
                html_utilities.html_indent((SubLObject)cb_proof_view.UNPROVIDED);
                cb_link_simple_proof_view(proof, inference_answer, (SubLObject)cb_proof_view.$str165$_Debug_, (SubLObject)cb_proof_view.T);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        pph_proof.show_proof_view(v_proof_view, (SubLObject)cb_proof_view.UNPROVIDED);
        if (cb_proof_view.NIL != destroy_when_doneP && cb_proof_view.NIL == in_debug_modeP) {
            destroy_cb_proof_view(v_proof_view);
        }
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 26453L)
    public static SubLObject cb_proof_view_destroyer() {
        return cb_proof_view.$cb_proof_view_destroyer$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 26534L)
    public static SubLObject set_cb_proof_view_destruction_grace_period(final SubLObject seconds) {
        return delayed_processor.delayed_processor_set_delay_seconds(cb_proof_view.$cb_proof_view_destroyer$.getGlobalValue(), seconds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 26684L)
    public static SubLObject destroy_cb_proof_view(final SubLObject v_cb_proof_view) {
        if (cb_proof_view.NIL != proof_view.proof_view_p(v_cb_proof_view)) {
            delayed_processor.schedule(cb_proof_view.$cb_proof_view_destroyer$.getGlobalValue(), v_cb_proof_view);
        }
        return (SubLObject)cb_proof_view.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 26846L)
    public static SubLObject dreamcatcher_justify(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject proof = extract_cb_proof_view_proof_and_answer(args);
        final SubLObject v_answer = thread.secondMultipleValue();
        final SubLObject more_args = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject v_proof_view = cb_proof_view_get_proof_view(proof, v_answer, (SubLObject)cb_proof_view.UNPROVIDED);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_proof_view.NIL != newP) {
            cb_proof_view_initialize_memoization_state(v_proof_view, (SubLObject)cb_proof_view.$str170$DreamCatcher);
            final SubLObject debugP = list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_proof_view.$str96$debug, more_args));
            final SubLObject feedback_url = html_utilities.html_extract_input((SubLObject)cb_proof_view.$str171$furl, more_args);
            final SubLObject feedback_context = html_utilities.html_extract_input((SubLObject)cb_proof_view.$str172$context, more_args);
            proof_view.proof_view_set_enable_debugP(v_proof_view, debugP);
            if (cb_proof_view.NIL != feedback_url) {
                proof_view.proof_view_set_property(v_proof_view, (SubLObject)cb_proof_view.$kw173$FEEDBACK_URL, feedback_url);
            }
            if (cb_proof_view.NIL != feedback_context) {
                proof_view.proof_view_set_property(v_proof_view, (SubLObject)cb_proof_view.$kw174$FEEDBACK_CONTEXT, feedback_context);
            }
            set_dreamcatcher_proof_view_params(v_proof_view);
            proof_view.proof_view_set_property(v_proof_view, (SubLObject)cb_proof_view.$kw162$STYLE, (SubLObject)cb_proof_view.$str175$_entryText_hover__feedback___visi);
            launch_cb_proof_view_preparer(v_proof_view);
        }
        return cb_simple_proof_view_guts(proof, v_answer, proof_view.proof_view_get_allow_internal_linksP(v_proof_view));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 28116L)
    public static SubLObject set_dreamcatcher_proof_view_params(final SubLObject v_proof_view) {
        proof_view_summary.proof_view_set_include_summary_sectionP(v_proof_view, (SubLObject)cb_proof_view.NIL);
        proof_view.proof_view_set_include_justification_sectionP(v_proof_view, (SubLObject)cb_proof_view.T);
        proof_view_linear.proof_view_set_include_linear_sectionP(v_proof_view, (SubLObject)cb_proof_view.NIL);
        proof_view.proof_view_set_suppress_assertion_bookkeepingP(v_proof_view, (SubLObject)cb_proof_view.T);
        proof_view.proof_view_set_allow_internal_linksP(v_proof_view, (SubLObject)cb_proof_view.NIL);
        proof_view.proof_view_set_allow_external_linksP(v_proof_view, (SubLObject)cb_proof_view.NIL);
        proof_view.proof_view_set_property(v_proof_view, (SubLObject)cb_proof_view.$kw177$ENTRY_PARAPHRASE_FN, (SubLObject)cb_proof_view.$sym178$PROOF_VIEW_ENTRY_GENERATE_HTML_DREAMCATCHER);
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-proof-view.lisp", position = 28664L)
    public static SubLObject proof_view_entry_generate_html_dreamcatcher(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject standard_html = proof_view.proof_view_entry_generate_html_standard(entry);
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
        final SubLObject feedback_url = proof_view.proof_view_get_property(v_proof_view, (SubLObject)cb_proof_view.$kw173$FEEDBACK_URL, (SubLObject)cb_proof_view.$str84$);
        final SubLObject feedback_context = proof_view.proof_view_get_property(v_proof_view, (SubLObject)cb_proof_view.$kw174$FEEDBACK_CONTEXT, (SubLObject)cb_proof_view.$str84$);
        if (cb_proof_view.NIL != string_utilities.non_empty_stringP(standard_html) && cb_proof_view.NIL != string_utilities.non_empty_stringP(feedback_url)) {
            SubLObject new_span = (SubLObject)cb_proof_view.NIL;
            SubLObject stream = (SubLObject)cb_proof_view.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_proof_view.$str179$entryText);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                    final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                        html_utilities.html_markup(standard_html);
                        html_utilities.html_indent((SubLObject)cb_proof_view.UNPROVIDED);
                        final SubLObject enhanced_url = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(feedback_url), new SubLObject[] { cb_proof_view.$str180$_application_justify_context_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(feedback_context, (SubLObject)cb_proof_view.UNPROVIDED)), cb_proof_view.$str181$_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(proof_view.proof_view_entry_get_path_string(entry), (SubLObject)cb_proof_view.UNPROVIDED)), cb_proof_view.$str81$_ });
                        final SubLObject script = Sequences.cconcatenate((SubLObject)cb_proof_view.$str182$window_open__, new SubLObject[] { format_nil.format_nil_a_no_copy(enhanced_url), cb_proof_view.$str183$___Feedback___ });
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        if (cb_proof_view.NIL != script) {
                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup(script);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_proof_view.$str184$feedback);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                        final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_proof_view.$str185$_cycdoc_img_speechbubble_png);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_proof_view.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_proof_view.UNPROVIDED);
                            final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_proof_view.T, thread);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
                new_span = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_proof_view.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)cb_proof_view.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            return new_span;
        }
        return standard_html;
    }
    
    public static SubLObject declare_cb_proof_view_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_link_assertion_proof_view", "CB-LINK-ASSERTION-PROOF-VIEW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_link_proof_view_bug", "CB-LINK-PROOF-VIEW-BUG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_bug_report", "CB-PROOF-VIEW-BUG-REPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_process_proof_view_bug_report", "CB-PROCESS-PROOF-VIEW-BUG-REPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_assertion_proof_view", "CB-ASSERTION-PROOF-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_assertion_answer", "CB-PROOF-VIEW-ASSERTION-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_sentence_answer", "CB-PROOF-VIEW-SENTENCE-ANSWER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "clear_cb_proof_view_sentence_answer_cached", "CLEAR-CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "remove_cb_proof_view_sentence_answer_cached", "REMOVE-CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_sentence_answer_cached_internal", "CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_sentence_answer_cached", "CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_sentence_proof_view", "CB-SENTENCE-PROOF-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "dwim_cb_sentence_proof_view_mt", "DWIM-CB-SENTENCE-PROOF-VIEW-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_link_simple_proof_view", "CB-LINK-SIMPLE-PROOF-VIEW", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "find_or_create_cb_proof_view_memoization_state", "FIND-OR-CREATE-CB-PROOF-VIEW-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_initialize_memoization_state", "CB-PROOF-VIEW-INITIALIZE-MEMOIZATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_simple_proof_view", "CB-SIMPLE-PROOF-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_launch_proof_view", "CB-LAUNCH-PROOF-VIEW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "extract_cb_proof_view_proof_and_answer", "EXTRACT-CB-PROOF-VIEW-PROOF-AND-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_select_inference", "CB-PROOF-VIEW-SELECT-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_select_inference_answer", "CB-PROOF-VIEW-SELECT-INFERENCE-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_select_inference_answer_proof", "CB-PROOF-VIEW-SELECT-INFERENCE-ANSWER-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_link_show_proof_view", "CB-LINK-SHOW-PROOF-VIEW", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_show_proof_view", "CB-SHOW-PROOF-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "lookup_cb_proof_view", "LOOKUP-CB-PROOF-VIEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "note_cb_proof_view", "NOTE-CB-PROOF-VIEW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "forget_cb_proof_view", "FORGET-CB-PROOF-VIEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "kill_all_cb_proof_view_threads", "KILL-ALL-CB-PROOF-VIEW-THREADS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "launch_cb_proof_view_preparer", "LAUNCH-CB-PROOF-VIEW-PREPARER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "increment_cb_proof_view_entries_paraphrased", "INCREMENT-CB-PROOF-VIEW-ENTRIES-PARAPHRASED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "get_cb_proof_view_entries_paraphrased", "GET-CB-PROOF-VIEW-ENTRIES-PARAPHRASED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "prepare_cb_proof_view", "PREPARE-CB-PROOF-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_get_proof_view", "CB-PROOF-VIEW-GET-PROOF-VIEW", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_compute_percent_ready", "CB-PROOF-VIEW-COMPUTE-PERCENT-READY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_compute_percent_ready_int", "CB-PROOF-VIEW-COMPUTE-PERCENT-READY-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_simple_proof_view_guts", "CB-SIMPLE-PROOF-VIEW-GUTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "note_cb_proof_view_time_estimate", "NOTE-CB-PROOF-VIEW-TIME-ESTIMATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "log_cb_proof_view_time_estimate_results", "LOG-CB-PROOF-VIEW-TIME-ESTIMATE-RESULTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "log_cb_proof_view_time_estimate_result", "LOG-CB-PROOF-VIEW-TIME-ESTIMATE-RESULT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_estimate_seconds_to_go", "CB-PROOF-VIEW-ESTIMATE-SECONDS-TO-GO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "clear_cb_proof_view_historical_fudge_factors", "CLEAR-CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "remove_cb_proof_view_historical_fudge_factors", "REMOVE-CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_historical_fudge_factors_internal", "CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_historical_fudge_factors", "CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "adjust_cb_proof_view_estimate_wrt_historical_data", "ADJUST-CB-PROOF-VIEW-ESTIMATE-WRT-HISTORICAL-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_progress_pacifier", "CB-PROOF-VIEW-PROGRESS-PACIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_show_proof_view_int", "CB-SHOW-PROOF-VIEW-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "cb_proof_view_destroyer", "CB-PROOF-VIEW-DESTROYER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "set_cb_proof_view_destruction_grace_period", "SET-CB-PROOF-VIEW-DESTRUCTION-GRACE-PERIOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "destroy_cb_proof_view", "DESTROY-CB-PROOF-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "dreamcatcher_justify", "DREAMCATCHER-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "set_dreamcatcher_proof_view_params", "SET-DREAMCATCHER-PROOF-VIEW-PARAMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_proof_view", "proof_view_entry_generate_html_dreamcatcher", "PROOF-VIEW-ENTRY-GENERATE-HTML-DREAMCATCHER", 1, 0, false);
        return (SubLObject)cb_proof_view.NIL;
    }
    
    public static SubLObject init_cb_proof_view_file() {
        cb_proof_view.$cb_proof_view_sentence_answer_cached_caching_state$ = SubLFiles.deflexical("*CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED-CACHING-STATE*", (SubLObject)cb_proof_view.NIL);
        cb_proof_view.$cb_proof_view_memoization_state_index$ = SubLFiles.defparameter("*CB-PROOF-VIEW-MEMOIZATION-STATE-INDEX*", locking_map.create_locking_map(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cb_proof_view.EQUAL), (SubLObject)cb_proof_view.UNPROVIDED)));
        cb_proof_view.$cb_proof_view_default_params$ = SubLFiles.defparameter("*CB-PROOF-VIEW-DEFAULT-PARAMS*", (SubLObject)cb_proof_view.$kw88$DEFAULT);
        cb_proof_view.$cb_proof_view_show_bug_report_linksP$ = SubLFiles.defparameter("*CB-PROOF-VIEW-SHOW-BUG-REPORT-LINKS?*", (SubLObject)cb_proof_view.T);
        cb_proof_view.$cb_proof_view_include_story_sectionP$ = SubLFiles.defparameter("*CB-PROOF-VIEW-INCLUDE-STORY-SECTION?*", (SubLObject)cb_proof_view.NIL);
        cb_proof_view.$cb_proof_views$ = SubLFiles.defparameter("*CB-PROOF-VIEWS*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cb_proof_view.EQUAL), (SubLObject)cb_proof_view.UNPROVIDED));
        cb_proof_view.$cb_proof_view_threads$ = SubLFiles.defparameter("*CB-PROOF-VIEW-THREADS*", set.new_set(Symbols.symbol_function((SubLObject)cb_proof_view.EQL), (SubLObject)cb_proof_view.UNPROVIDED));
        cb_proof_view.$cb_proof_view_entries_paraphrased$ = SubLFiles.deflexical("*CB-PROOF-VIEW-ENTRIES-PARAPHRASED*", (cb_proof_view.NIL != Symbols.boundp((SubLObject)cb_proof_view.$sym132$_CB_PROOF_VIEW_ENTRIES_PARAPHRASED_)) ? cb_proof_view.$cb_proof_view_entries_paraphrased$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cb_proof_view.EQL), (SubLObject)cb_proof_view.UNPROVIDED));
        cb_proof_view.$cb_proof_view_estimated_paraphrase_to_construction_ratio$ = SubLFiles.deflexical("*CB-PROOF-VIEW-ESTIMATED-PARAPHRASE-TO-CONSTRUCTION-RATIO*", (SubLObject)cb_proof_view.SEVEN_INTEGER);
        cb_proof_view.$cb_proof_view_time_estimates$ = SubLFiles.deflexical("*CB-PROOF-VIEW-TIME-ESTIMATES*", (SubLObject)cb_proof_view.NIL);
        cb_proof_view.$cb_proof_view_time_estimates_log$ = SubLFiles.deflexical("*CB-PROOF-VIEW-TIME-ESTIMATES-LOG*", file_utilities.cyc_home_filename((SubLObject)cb_proof_view.$list134, (SubLObject)cb_proof_view.$str135$cb_proof_view_time_estimates, (SubLObject)cb_proof_view.$str136$log));
        cb_proof_view.$cb_proof_view_historical_fudge_factors_caching_state$ = SubLFiles.deflexical("*CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS-CACHING-STATE*", (SubLObject)cb_proof_view.NIL);
        cb_proof_view.$cb_proof_view_destroyer$ = SubLFiles.deflexical("*CB-PROOF-VIEW-DESTROYER*", (cb_proof_view.NIL != Symbols.boundp((SubLObject)cb_proof_view.$sym166$_CB_PROOF_VIEW_DESTROYER_)) ? cb_proof_view.$cb_proof_view_destroyer$.getGlobalValue() : delayed_processor.new_delayed_processor((SubLObject)cb_proof_view.$int167$1200, (SubLObject)cb_proof_view.$sym168$VALID_PROOF_VIEW_P, (SubLObject)cb_proof_view.$sym169$DESTROY_PROOF_VIEW));
        return (SubLObject)cb_proof_view.NIL;
    }
    
    public static SubLObject setup_cb_proof_view_file() {
        cb_utilities.setup_cb_link_method((SubLObject)cb_proof_view.$kw3$ASSERTION_PROOF_VIEW, (SubLObject)cb_proof_view.$sym4$CB_LINK_ASSERTION_PROOF_VIEW, (SubLObject)cb_proof_view.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_proof_view.$kw15$PROOF_VIEW_BUG, (SubLObject)cb_proof_view.$sym16$CB_LINK_PROOF_VIEW_BUG, (SubLObject)cb_proof_view.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_proof_view.$sym50$CB_PROOF_VIEW_BUG_REPORT, (SubLObject)cb_proof_view.$kw51$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_proof_view.$sym61$CB_PROCESS_PROOF_VIEW_BUG_REPORT, (SubLObject)cb_proof_view.$kw51$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_proof_view.$sym63$CB_ASSERTION_PROOF_VIEW, (SubLObject)cb_proof_view.$kw51$HTML_HANDLER);
        memoization_state.note_globally_cached_function((SubLObject)cb_proof_view.$sym65$CB_PROOF_VIEW_SENTENCE_ANSWER_CACHED);
        html_macros.note_cgi_handler_function((SubLObject)cb_proof_view.$sym75$CB_SENTENCE_PROOF_VIEW, (SubLObject)cb_proof_view.$kw51$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_proof_view.$kw85$SIMPLE_PROOF_VIEW, (SubLObject)cb_proof_view.$sym86$CB_LINK_SIMPLE_PROOF_VIEW, (SubLObject)cb_proof_view.FOUR_INTEGER);
        utilities_macros.register_html_state_variable((SubLObject)cb_proof_view.$sym87$_CB_PROOF_VIEW_MEMOIZATION_STATE_INDEX_);
        utilities_macros.register_html_state_variable((SubLObject)cb_proof_view.$sym89$_CB_PROOF_VIEW_DEFAULT_PARAMS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_proof_view.$sym90$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__);
        html_macros.note_cgi_handler_function((SubLObject)cb_proof_view.$sym92$CB_SIMPLE_PROOF_VIEW, (SubLObject)cb_proof_view.$kw51$HTML_HANDLER);
        utilities_macros.register_html_state_variable((SubLObject)cb_proof_view.$sym93$_CB_PROOF_VIEW_INCLUDE_STORY_SECTION__);
        cb_utilities.setup_cb_link_method((SubLObject)cb_proof_view.$kw114$SHOW_PROOF_VIEW, (SubLObject)cb_proof_view.$sym115$CB_LINK_SHOW_PROOF_VIEW, (SubLObject)cb_proof_view.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_proof_view.$sym126$CB_SHOW_PROOF_VIEW, (SubLObject)cb_proof_view.$kw51$HTML_HANDLER);
        utilities_macros.register_html_state_variable((SubLObject)cb_proof_view.$sym127$_CB_PROOF_VIEWS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_proof_view.$sym128$_CB_PROOF_VIEW_THREADS_);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_proof_view.$sym132$_CB_PROOF_VIEW_ENTRIES_PARAPHRASED_);
        memoization_state.note_globally_cached_function((SubLObject)cb_proof_view.$sym143$CB_PROOF_VIEW_HISTORICAL_FUDGE_FACTORS);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_proof_view.$sym166$_CB_PROOF_VIEW_DESTROYER_);
        html_macros.note_cgi_handler_function((SubLObject)cb_proof_view.$sym176$DREAMCATCHER_JUSTIFY, (SubLObject)cb_proof_view.$kw51$HTML_HANDLER);
        utilities_macros.note_funcall_helper_function((SubLObject)cb_proof_view.$sym178$PROOF_VIEW_ENTRY_GENERATE_HTML_DREAMCATCHER);
        return (SubLObject)cb_proof_view.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_proof_view_file();
    }
    
    public void initializeVariables() {
        init_cb_proof_view_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_proof_view_file();
    }
    
    static {
        me = (SubLFile)new cb_proof_view();
        cb_proof_view.$cb_proof_view_sentence_answer_cached_caching_state$ = null;
        cb_proof_view.$cb_proof_view_memoization_state_index$ = null;
        cb_proof_view.$cb_proof_view_default_params$ = null;
        cb_proof_view.$cb_proof_view_show_bug_report_linksP$ = null;
        cb_proof_view.$cb_proof_view_include_story_sectionP$ = null;
        cb_proof_view.$cb_proof_views$ = null;
        cb_proof_view.$cb_proof_view_threads$ = null;
        cb_proof_view.$cb_proof_view_entries_paraphrased$ = null;
        cb_proof_view.$cb_proof_view_estimated_paraphrase_to_construction_ratio$ = null;
        cb_proof_view.$cb_proof_view_time_estimates$ = null;
        cb_proof_view.$cb_proof_view_time_estimates_log$ = null;
        cb_proof_view.$cb_proof_view_historical_fudge_factors_caching_state$ = null;
        cb_proof_view.$cb_proof_view_destroyer$ = null;
        $str0$_Proof_View_ = SubLObjectFactory.makeString("[Proof View]");
        $kw1$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str2$cb_assertion_proof_view__A = SubLObjectFactory.makeString("cb-assertion-proof-view&~A");
        $kw3$ASSERTION_PROOF_VIEW = SubLObjectFactory.makeKeyword("ASSERTION-PROOF-VIEW");
        $sym4$CB_LINK_ASSERTION_PROOF_VIEW = SubLObjectFactory.makeSymbol("CB-LINK-ASSERTION-PROOF-VIEW");
        $str5$Proof_View_Problem = SubLObjectFactory.makeString("Proof-View Problem");
        $str6$cg_cb_proof_view_bug_report_ = SubLObjectFactory.makeString("cg?cb-proof-view-bug-report&");
        $str7$_ = SubLObjectFactory.makeString("&");
        $str8$jira = SubLObjectFactory.makeString("jira");
        $int9$900 = SubLObjectFactory.makeInteger(900);
        $int10$800 = SubLObjectFactory.makeInteger(800);
        $str11$pf_bug = SubLObjectFactory.makeString("pf-bug");
        $kw12$HTML_JIRA_IMAGE = SubLObjectFactory.makeKeyword("HTML-JIRA-IMAGE");
        $kw13$TOP = SubLObjectFactory.makeKeyword("TOP");
        $kw14$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $kw15$PROOF_VIEW_BUG = SubLObjectFactory.makeKeyword("PROOF-VIEW-BUG");
        $sym16$CB_LINK_PROOF_VIEW_BUG = SubLObjectFactory.makeSymbol("CB-LINK-PROOF-VIEW-BUG");
        $kw17$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym18$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str19$Couldn_t_find_a_proof_view_with_I = SubLObjectFactory.makeString("Couldn't find a proof view with ID ~S");
        $str20$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str21$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw22$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw23$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str24$Report_Proof_View_Problem = SubLObjectFactory.makeString("Report Proof-View Problem");
        $str25$post = SubLObjectFactory.makeString("post");
        $str26$cb_process_proof_view_bug_report = SubLObjectFactory.makeString("cb-process-proof-view-bug-report");
        $str27$proof_view_id = SubLObjectFactory.makeString("proof-view-id");
        $str28$proof_view_entry_id = SubLObjectFactory.makeString("proof-view-entry-id");
        $str29$Proof_View_Entry_ = SubLObjectFactory.makeString("Proof-View Entry:");
        $str30$showcycl = SubLObjectFactory.makeString("showcycl");
        $str31$background___EEE__border__ridge_6 = SubLObjectFactory.makeString("background: #EEE; border: ridge 6px");
        $str32$Please_indicate_what_the_problem_ = SubLObjectFactory.makeString("Please indicate what the problem is:");
        $str33$problem = SubLObjectFactory.makeString("problem");
        $kw34$TRIVIAL = SubLObjectFactory.makeKeyword("TRIVIAL");
        $str35$Trivial = SubLObjectFactory.makeString("Trivial");
        $kw36$IRRELEVANT = SubLObjectFactory.makeKeyword("IRRELEVANT");
        $str37$Irrelevant = SubLObjectFactory.makeString("Irrelevant");
        $kw38$BAD_PARAPHRASE = SubLObjectFactory.makeKeyword("BAD-PARAPHRASE");
        $str39$Bad_Paraphrase = SubLObjectFactory.makeString("Bad Paraphrase");
        $kw40$WRONG_LOCATION = SubLObjectFactory.makeKeyword("WRONG-LOCATION");
        $str41$Wrong_Location_in_Justification = SubLObjectFactory.makeString("Wrong Location in Justification");
        $kw42$OTHER = SubLObjectFactory.makeKeyword("OTHER");
        $str43$Other__please_explain_ = SubLObjectFactory.makeString("Other (please explain)");
        $str44$Details__ = SubLObjectFactory.makeString("Details: ");
        $str45$details = SubLObjectFactory.makeString("details");
        $int46$60 = SubLObjectFactory.makeInteger(60);
        $str47$virtual = SubLObjectFactory.makeString("virtual");
        $str48$Go_to_JIRA_to_Submit = SubLObjectFactory.makeString("Go to JIRA to Submit");
        $kw49$SUBMIT = SubLObjectFactory.makeKeyword("SUBMIT");
        $sym50$CB_PROOF_VIEW_BUG_REPORT = SubLObjectFactory.makeSymbol("CB-PROOF-VIEW-BUG-REPORT");
        $kw51$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str52$Proof_View_Problem__ = SubLObjectFactory.makeString("Proof-View Problem (");
        $str53$_ = SubLObjectFactory.makeString(")");
        $str54$Query____A____ = SubLObjectFactory.makeString("Query:~%~A~%~%");
        $int55$2048 = SubLObjectFactory.makeInteger(2048);
        $str56$Answer____A____ = SubLObjectFactory.makeString("Answer:~%~A~%~%");
        $int57$1024 = SubLObjectFactory.makeInteger(1024);
        $str58$Entry__D____A___A = SubLObjectFactory.makeString("Entry ~D:~%~A~%~A");
        $str59$____Details_____A = SubLObjectFactory.makeString("~%~%Details:~% ~A");
        $list60 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PID"), SubLObjectFactory.makeInteger(10800), SubLObjectFactory.makeKeyword("COMPONENTS"), SubLObjectFactory.makeInteger(11301), SubLObjectFactory.makeKeyword("ISSUETYPE"), cb_proof_view.ONE_INTEGER, SubLObjectFactory.makeKeyword("PRIORITY"), cb_proof_view.THREE_INTEGER, SubLObjectFactory.makeKeyword("ASSIGNEE"), SubLObjectFactory.makeString("baxter") });
        $sym61$CB_PROCESS_PROOF_VIEW_BUG_REPORT = SubLObjectFactory.makeSymbol("CB-PROCESS-PROOF-VIEW-BUG-REPORT");
        $str62$_A_does_not_specify_an_assertion = SubLObjectFactory.makeString("~A does not specify an assertion");
        $sym63$CB_ASSERTION_PROOF_VIEW = SubLObjectFactory.makeSymbol("CB-ASSERTION-PROOF-VIEW");
        $kw64$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $sym65$CB_PROOF_VIEW_SENTENCE_ANSWER_CACHED = SubLObjectFactory.makeSymbol("CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED");
        $kw66$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw67$INFERENCE_MODE = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $sym68$_CB_PROOF_VIEW_SENTENCE_ANSWER_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CB-PROOF-VIEW-SENTENCE-ANSWER-CACHED-CACHING-STATE*");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-ARGS"));
        $str70$_A_does_not_specify_a_CycL_senten = SubLObjectFactory.makeString("~A does not specify a CycL sentence");
        $str71$mt = SubLObjectFactory.makeString("mt");
        $str72$task = SubLObjectFactory.makeString("task");
        $str73$mode = SubLObjectFactory.makeString("mode");
        $str74$Could_not_prove__S_in__S = SubLObjectFactory.makeString("Could not prove ~S in ~S");
        $sym75$CB_SENTENCE_PROOF_VIEW = SubLObjectFactory.makeSymbol("CB-SENTENCE-PROOF-VIEW");
        $const76$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym77$PROOF_P = SubLObjectFactory.makeSymbol("PROOF-P");
        $sym78$INFERENCE_ANSWER_P = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-P");
        $str79$_Proof_ = SubLObjectFactory.makeString("[Proof ");
        $str80$_ = SubLObjectFactory.makeString(".");
        $str81$_ = SubLObjectFactory.makeString("]");
        $str82$cb_simple_proof_view__A__A__A__A_ = SubLObjectFactory.makeString("cb-simple-proof-view&~A&~A&~A&~A~A");
        $str83$_debug_T = SubLObjectFactory.makeString("&debug=T");
        $str84$ = SubLObjectFactory.makeString("");
        $kw85$SIMPLE_PROOF_VIEW = SubLObjectFactory.makeKeyword("SIMPLE-PROOF-VIEW");
        $sym86$CB_LINK_SIMPLE_PROOF_VIEW = SubLObjectFactory.makeSymbol("CB-LINK-SIMPLE-PROOF-VIEW");
        $sym87$_CB_PROOF_VIEW_MEMOIZATION_STATE_INDEX_ = SubLObjectFactory.makeSymbol("*CB-PROOF-VIEW-MEMOIZATION-STATE-INDEX*");
        $kw88$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym89$_CB_PROOF_VIEW_DEFAULT_PARAMS_ = SubLObjectFactory.makeSymbol("*CB-PROOF-VIEW-DEFAULT-PARAMS*");
        $sym90$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__ = SubLObjectFactory.makeSymbol("*CB-PROOF-VIEW-SHOW-BUG-REPORT-LINKS?*");
        $sym91$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym92$CB_SIMPLE_PROOF_VIEW = SubLObjectFactory.makeSymbol("CB-SIMPLE-PROOF-VIEW");
        $sym93$_CB_PROOF_VIEW_INCLUDE_STORY_SECTION__ = SubLObjectFactory.makeSymbol("*CB-PROOF-VIEW-INCLUDE-STORY-SECTION?*");
        $str94$memoization_state = SubLObjectFactory.makeString("memoization-state");
        $str95$suppress_summary = SubLObjectFactory.makeString("suppress-summary");
        $str96$debug = SubLObjectFactory.makeString("debug");
        $str97$suppress_detailed = SubLObjectFactory.makeString("suppress-detailed");
        $str98$suppress_linear = SubLObjectFactory.makeString("suppress-linear");
        $str99$suppress_bookkeeping = SubLObjectFactory.makeString("suppress-bookkeeping");
        $str100$suppress_cyclists = SubLObjectFactory.makeString("suppress-cyclists");
        $str101$suppress_assertion_dates = SubLObjectFactory.makeString("suppress-assertion-dates");
        $str102$suppress_cyclist_employers = SubLObjectFactory.makeString("suppress-cyclist-employers");
        $str103$suppress_links_in_nl = SubLObjectFactory.makeString("suppress-links-in-nl");
        $str104$suppress_phrase_links = SubLObjectFactory.makeString("suppress-phrase-links");
        $kw105$STORY = SubLObjectFactory.makeKeyword("STORY");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE-SUID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF-SUID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SUID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-SUID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-ARGS"));
        $sym107$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym108$PROBLEM_STORE_P = SubLObjectFactory.makeSymbol("PROBLEM-STORE-P");
        $sym109$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $kw110$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym111$PROOF_VIEW_P = SubLObjectFactory.makeSymbol("PROOF-VIEW-P");
        $str112$_Proof_View_ = SubLObjectFactory.makeString("[Proof View ");
        $str113$cb_show_proof_view__A = SubLObjectFactory.makeString("cb-show-proof-view&~A");
        $kw114$SHOW_PROOF_VIEW = SubLObjectFactory.makeKeyword("SHOW-PROOF-VIEW");
        $sym115$CB_LINK_SHOW_PROOF_VIEW = SubLObjectFactory.makeSymbol("CB-LINK-SHOW-PROOF-VIEW");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROOF-VIEW-ID"));
        $kw117$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw118$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str119$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str120$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str121$button = SubLObjectFactory.makeString("button");
        $str122$reload = SubLObjectFactory.makeString("reload");
        $str123$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str124$Proof_View = SubLObjectFactory.makeString("Proof View");
        $str125$_S_does_not_identify_an_existing_ = SubLObjectFactory.makeString("~S does not identify an existing proof view.");
        $sym126$CB_SHOW_PROOF_VIEW = SubLObjectFactory.makeSymbol("CB-SHOW-PROOF-VIEW");
        $sym127$_CB_PROOF_VIEWS_ = SubLObjectFactory.makeSymbol("*CB-PROOF-VIEWS*");
        $sym128$_CB_PROOF_VIEW_THREADS_ = SubLObjectFactory.makeSymbol("*CB-PROOF-VIEW-THREADS*");
        $str129$CB_Proof_View_Preparer_for_proof_ = SubLObjectFactory.makeString("CB Proof View Preparer for proof-view ");
        $str130$_of_proof_ = SubLObjectFactory.makeString(" of proof ");
        $sym131$PREPARE_CB_PROOF_VIEW = SubLObjectFactory.makeSymbol("PREPARE-CB-PROOF-VIEW");
        $sym132$_CB_PROOF_VIEW_ENTRIES_PARAPHRASED_ = SubLObjectFactory.makeSymbol("*CB-PROOF-VIEW-ENTRIES-PARAPHRASED*");
        $int133$100 = SubLObjectFactory.makeInteger(100);
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("data"));
        $str135$cb_proof_view_time_estimates = SubLObjectFactory.makeString("cb-proof-view-time-estimates");
        $str136$log = SubLObjectFactory.makeString("log");
        $kw137$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str138$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym139$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PERCENT-READY"), (SubLObject)SubLObjectFactory.makeSymbol("ESTIMATE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-TIME"));
        $sym141$PRINC_TO_STRING = SubLObjectFactory.makeSymbol("PRINC-TO-STRING");
        $float142$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $sym143$CB_PROOF_VIEW_HISTORICAL_FUDGE_FACTORS = SubLObjectFactory.makeSymbol("CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS");
        $float144$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $kw145$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $list146 = ConsesLow.list((SubLObject)Characters.CHAR_tab);
        $str147$_ = SubLObjectFactory.makeString("\"");
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PERCENT-DONE"), (SubLObject)SubLObjectFactory.makeSymbol("ESTIMATE"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL"));
        $int149$25 = SubLObjectFactory.makeInteger(25);
        $sym150$_CB_PROOF_VIEW_HISTORICAL_FUDGE_FACTORS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS-CACHING-STATE*");
        $str151$Generating_proof_view___ = SubLObjectFactory.makeString("Generating proof view...");
        $str152$Estimated_time_remaining___A = SubLObjectFactory.makeString("Estimated time remaining: ~A");
        $str153$_Display_in_progress_proof_view_n = SubLObjectFactory.makeString("[Display in-progress proof view now]");
        $kw154$SELF = SubLObjectFactory.makeKeyword("SELF");
        $kw155$TABVIEW_CSS = SubLObjectFactory.makeKeyword("TABVIEW-CSS");
        $kw156$FONTS = SubLObjectFactory.makeKeyword("FONTS");
        $kw157$CONTAINER_CSS = SubLObjectFactory.makeKeyword("CONTAINER-CSS");
        $kw158$YAHOO_DOM_EVENT = SubLObjectFactory.makeKeyword("YAHOO-DOM-EVENT");
        $kw159$ELEMENT = SubLObjectFactory.makeKeyword("ELEMENT");
        $kw160$TABVIEW = SubLObjectFactory.makeKeyword("TABVIEW");
        $kw161$CONTAINER = SubLObjectFactory.makeKeyword("CONTAINER");
        $kw162$STYLE = SubLObjectFactory.makeKeyword("STYLE");
        $kw163$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $str164$_Refresh_ = SubLObjectFactory.makeString("[Refresh]");
        $str165$_Debug_ = SubLObjectFactory.makeString("[Debug]");
        $sym166$_CB_PROOF_VIEW_DESTROYER_ = SubLObjectFactory.makeSymbol("*CB-PROOF-VIEW-DESTROYER*");
        $int167$1200 = SubLObjectFactory.makeInteger(1200);
        $sym168$VALID_PROOF_VIEW_P = SubLObjectFactory.makeSymbol("VALID-PROOF-VIEW-P");
        $sym169$DESTROY_PROOF_VIEW = SubLObjectFactory.makeSymbol("DESTROY-PROOF-VIEW");
        $str170$DreamCatcher = SubLObjectFactory.makeString("DreamCatcher");
        $str171$furl = SubLObjectFactory.makeString("furl");
        $str172$context = SubLObjectFactory.makeString("context");
        $kw173$FEEDBACK_URL = SubLObjectFactory.makeKeyword("FEEDBACK-URL");
        $kw174$FEEDBACK_CONTEXT = SubLObjectFactory.makeKeyword("FEEDBACK-CONTEXT");
        $str175$_entryText_hover__feedback___visi = SubLObjectFactory.makeString(".entryText:hover .feedback { visibility: visible; cursor: pointer;}\n\t\t\t\t  .feedback                  { visibility: hidden; }");
        $sym176$DREAMCATCHER_JUSTIFY = SubLObjectFactory.makeSymbol("DREAMCATCHER-JUSTIFY");
        $kw177$ENTRY_PARAPHRASE_FN = SubLObjectFactory.makeKeyword("ENTRY-PARAPHRASE-FN");
        $sym178$PROOF_VIEW_ENTRY_GENERATE_HTML_DREAMCATCHER = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-GENERATE-HTML-DREAMCATCHER");
        $str179$entryText = SubLObjectFactory.makeString("entryText");
        $str180$_application_justify_context_ = SubLObjectFactory.makeString("&application=justify&context=");
        $str181$_ = SubLObjectFactory.makeString("[");
        $str182$window_open__ = SubLObjectFactory.makeString("window.open('");
        $str183$___Feedback___ = SubLObjectFactory.makeString("','Feedback');");
        $str184$feedback = SubLObjectFactory.makeString("feedback");
        $str185$_cycdoc_img_speechbubble_png = SubLObjectFactory.makeString("/cycdoc/img/speechbubble.png");
    }
}

/*

	Total time: 902 ms
	 synthetic 
*/