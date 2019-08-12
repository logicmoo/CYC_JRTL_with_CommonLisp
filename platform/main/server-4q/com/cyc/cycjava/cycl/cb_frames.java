/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.kb_utilities.*;
import static com.cyc.cycjava.cycl.ke_utilities.*;
import static com.cyc.cycjava.cycl.narts_high.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities;
import com.cyc.cycjava.cycl.wordnet_import.wordnet_import;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Regex;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-FRAMES
 * source file: /cyc/top/cycl/cb-frames.lisp
 * created:     2019/07/03 17:38:03
 */
public final class cb_frames extends SubLTranslatedFile implements V12 {
    public static final SubLObject nart_via_id_spec(SubLObject string) {
        {
            SubLObject nart = cb_guess_nart(string_utilities.substring(string, TWO_INTEGER, UNPROVIDED));
            if (NIL != nart_handles.nart_p(nart)) {
                return list(nart);
            }
        }
        return NIL;
    }

    public static final SubLObject deduction_via_id_spec(SubLObject string) {
        {
            SubLObject deduction = cb_guess_deduction(string_utilities.substring(string, TWO_INTEGER, UNPROVIDED));
            if (NIL != deduction_handles.deduction_p(deduction)) {
                return list(deduction);
            }
        }
        return NIL;
    }

    public static final SubLObject constant_via_id_spec(SubLObject string) {
        {
            SubLObject constant = cb_guess_constant(string_utilities.substring(string, TWO_INTEGER, UNPROVIDED));
            if (NIL != constant_p(constant)) {
                return list(constant);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_server_status_user_actions() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == user_actions.user_actions_emptyP()) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                cb_link($USER_ACTIONS, $str_alt200$User_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt198$__d_, user_actions.user_actions_size());
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject assertion_via_id_spec(SubLObject string) {
        {
            SubLObject assertion = cb_guess_assertion(string_utilities.substring(string, TWO_INTEGER, UNPROVIDED));
            if (NIL != assertion_handles.assertion_p(assertion)) {
                return list(assertion);
            }
        }
        return NIL;
    }

    static private final SubLString $str_alt12$ = makeString("");

    public static final SubLFile me = new cb_frames();

 public static final String myName = "com.cyc.cycjava.cycl.cb_frames";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_name$ = makeSymbol("*CB-NAME*");



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $maximum_image_purpose_display_length$ = makeSymbol("*MAXIMUM-IMAGE-PURPOSE-DISPLAY-LENGTH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_user_toolbar_links_for_opencyc$ = makeSymbol("*CB-USER-TOOLBAR-LINKS-FOR-OPENCYC*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_specify_show_gloss_options_text$ = makeSymbol("*CB-SPECIFY-SHOW-GLOSS-OPTIONS-TEXT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_specify_show_gloss_options$ = makeSymbol("*CB-SPECIFY-SHOW-GLOSS-OPTIONS*");

    // defparameter
    // Currently off, since the IR server is broken
    /**
     * Currently off, since the IR server is broken
     */
    @LispMethod(comment = "Currently off, since the IR server is broken\ndefparameter")
    private static final SubLSymbol $use_cyc_ir_terms_for_browsingP$ = makeSymbol("*USE-CYC-IR-TERMS-FOR-BROWSING?*");

    private static final SubLString $str0$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str1$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $str4$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");

    private static final SubLString $str5$75___50 = makeString("75,*,50");

    private static final SubLString $str9$You_must_have_frames_enabled_to_u = makeString("You must have frames enabled to use Cyc.  Please either enable frames in your web browser or disable frame support in the Cyc browser at the ");

    private static final SubLString $str11$_page_ = makeString(" page.");

    private static final SubLSymbol CB_START = makeSymbol("CB-START");

    private static final SubLString $$$Refresh = makeString("Refresh");

    private static final SubLString $str15$0__url__cgi_bin_cg_cb_start = makeString("0; url=/cgi-bin/cg?cb-start");

    private static final SubLString $str16$If_you_see_this__please_follow_ = makeString("If you see this, please follow ");

    private static final SubLString $str17$_cgi_bin_cg_cb_start = makeString("/cgi-bin/cg?cb-start");

    private static final SubLString $$$this_link = makeString("this link");

    private static final SubLString $str19$_ = makeString(".");

    private static final SubLSymbol CB_START_REDIRECT = makeSymbol("CB-START-REDIRECT");

    private static final SubLString $$$ResearchCyc = makeString("ResearchCyc");

    private static final SubLString $str22$__ = makeString(" (");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str24$_ = makeString(")");

    private static final SubLString $str25$ = makeString("");

    private static final SubLString $str26$___ = makeString(" - ");

    private static final SubLString $str27$_A_A_A = makeString("~A~A~A");

    private static final SubLString $$$KB_Browser = makeString("KB Browser");

    private static final SubLString $str30$cb_start = makeString("cb-start");

    private static final SubLSymbol CB_LINK_START = makeSymbol("CB-LINK-START");

    private static final SubLList $list33 = list(makeString("system.common.browser.tools.cb-toolbar-restrict-to-user-tools?"));

    public static final SubLSymbol $cb_toolbar_restrict_to_user_toolsP$ = makeSymbol("*CB-TOOLBAR-RESTRICT-TO-USER-TOOLS?*");

    private static final SubLSymbol CB_TOOLBAR_FRAME = makeSymbol("CB-TOOLBAR-FRAME");

    private static final SubLString $$$Update = makeString("Update");

    private static final SubLString $str38$cb_toolbar_frame = makeString("cb-toolbar-frame");

    private static final SubLSymbol CB_LINK_TOOLBAR = makeSymbol("CB-LINK-TOOLBAR");

    private static final SubLString $str41$opencyc_logo_60_gif = makeString("opencyc-logo-60.gif");

    private static final SubLString $$$OpenCyc_Browser = makeString("OpenCyc Browser");

    private static final SubLString $str44$cyc_logo_violet_60_gif = makeString("cyc-logo-violet-60.gif");

    private static final SubLString $$$ResearchCyc_Browser = makeString("ResearchCyc Browser");

    private static final SubLSymbol $CB_TOOLBAR_FRAME = makeKeyword("CB-TOOLBAR-FRAME");

    private static final SubLString $str47$cb_toolbar_frame_html = makeString("cb-toolbar-frame.html");

    private static final SubLString $str50$50_ = makeString("50%");

    private static final SubLString $str51$You_are__ = makeString("You are: ");

    private static final SubLString $str53$Server__ = makeString("Server: ");

    private static final SubLString $$$unknown = makeString("unknown");

    private static final SubLString $str55$_ = makeString(":");

    private static final SubLString $str56$___ = makeString("...");

    private static final SubLString $str57$Purpose__ = makeString("Purpose: ");



    private static final SubLList $list59 = list(makeKeyword("HISTORY"), makeKeyword("CREATE"), makeKeyword("ASSERT"), makeKeyword("COMPOSE"), makeKeyword("QUERY"), makeKeyword("DOC"));

    private static final SubLSymbol CB_LINK_METHOD = makeSymbol("CB-LINK-METHOD");

    private static final SubLSymbol CB_TOOL_ABBREVIATION = makeSymbol("CB-TOOL-ABBREVIATION");

    private static final SubLSymbol $sym64$STRING_ = makeSymbol("STRING<");

    private static final SubLString $$$Tools = makeString("Tools");

    private static final SubLList $list67 = list(makeString("No gloss"), makeString("English gloss"), makeString("CycL gloss"));

    private static final SubLList $list68 = list(makeSymbol("NONE"), makeSymbol("ENGLISH"), makeSymbol("CYCL"));

    public static final SubLSymbol $cb_search_autocomplete_enabled$ = makeSymbol("*CB-SEARCH-AUTOCOMPLETE-ENABLED*");

    private static final SubLString $str70$98_ = makeString("98%");

    private static final SubLString $str71$cb_handle_specify = makeString("cb-handle-specify");

    private static final SubLString $$$handler = makeString("handler");

    private static final SubLString $str73$cb_cf = makeString("cb-cf");

    private static final SubLString $str74$arg_done = makeString("arg-done");

    private static final SubLString $str75$constant_complete = makeString("constant-complete");

    private static final SubLString $$$autocomplete = makeString("autocomplete");

    private static final SubLString $$$query = makeString("query");

    private static final SubLString $$$completeContainer = makeString("completeContainer");

    private static final SubLString $$$inputBox = makeString("inputBox");

    private static final SubLInteger $int$50 = makeInteger(50);



    private static final SubLString $$$Search = makeString("Search");

    private static final SubLString $str83$gloss_required = makeString("gloss-required");

    private static final SubLString $str86$cb_handle_specify_query__A_everyt = makeString("cb-handle-specify&query=~A&everything=t");

    private static final SubLString $str87$_A_results = makeString("~A results");

    private static final SubLSymbol $CB_SPECIFY_ALL = makeKeyword("CB-SPECIFY-ALL");

    private static final SubLSymbol CB_LINK_CB_SPECIFY_ALL = makeSymbol("CB-LINK-CB-SPECIFY-ALL");

    private static final SubLString $$$lucky = makeString("lucky");

    private static final SubLString $str92$case_insensitive = makeString("case-insensitive");

    private static final SubLString $$$everything = makeString("everything");

    private static final SubLString $str96$Can_t_determine_a_Cyc_term_from__ = makeString("Can't determine a Cyc term from ~s.");

    private static final SubLString $str97$Please_enter_a_non_empty_string_ = makeString("Please enter a non-empty string.");

    private static final SubLSymbol CB_HANDLE_SPECIFY = makeSymbol("CB-HANDLE-SPECIFY");

    private static final SubLString $str100$WordNet_search_results_for__ = makeString("WordNet search results for \"");

    private static final SubLString $$$wn_ = makeString("wn ");

    private static final SubLString $str102$_ = makeString("\"");

    private static final SubLString $str103$Search_results_for__ = makeString("Search results for \"");

    private static final SubLString $str104$_A_matching_term_found_ = makeString("~A matching term found:");

    private static final SubLString $str105$_A_matching_terms_found_ = makeString("~A matching terms found:");

    private static final SubLString $str106$_A_matching_WordNet_synsets_found = makeString("~A matching WordNet synsets found:");

    private static final SubLString $str107$No_matching_WordNet_synsets_found = makeString("No matching WordNet synsets found:");

    private static final SubLString $str108$No_matching_terms_found_ = makeString("No matching terms found.");

    private static final SubLString $str109$See_also_ = makeString("See also:");

    private static final SubLString $str110$But_see_ = makeString("But see:");

    private static final SubLString $str113$__1__A_of_approximately_ = makeString(" (1-~A of approximately ");









    private static final SubLString $str120$WordNet_Noun_Synonym_Sets__in_Ord = makeString("WordNet Noun Synonym Sets, in Order of Frequency");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str122$wni_try_concept_match = makeString("wni-try-concept-match");

    private static final SubLString $str123$synset_id = makeString("synset-id");

    private static final SubLString $str124$WordNet_Verb_Synonym_Sets__in_Ord = makeString("WordNet Verb Synonym Sets, in Order of Frequency");

    private static final SubLString $str125$WordNet_Adjective_Synonym_Sets__i = makeString("WordNet Adjective Synonym Sets, in Order of Frequency");

    private static final SubLString $str126$WordNet_Adverb_Synonym_Sets__in_O = makeString("WordNet Adverb Synonym Sets, in Order of Frequency");

    private static final SubLString $$$Other_WordNet_SynSets = makeString("Other WordNet SynSets");

    private static final SubLSymbol $sym128$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");

    private static final SubLSymbol $sym129$ISA_RELATION_ = makeSymbol("ISA-RELATION?");

    private static final SubLSymbol ASSERTION_CONS = makeSymbol("ASSERTION-CONS");

    private static final SubLString $$$Collections = makeString("Collections");

    private static final SubLString $$$Relations = makeString("Relations");

    private static final SubLString $$$Individuals = makeString("Individuals");

    private static final SubLString $$$Assertions = makeString("Assertions");

    private static final SubLString $str135$__ = makeString(": ");

    private static final SubLSymbol ENGLISH = makeSymbol("ENGLISH");

    private static final SubLSymbol $compute_gloss_max_clarifying_sentences$ = makeSymbol("*COMPUTE-GLOSS-MAX-CLARIFYING-SENTENCES*");

    private static final SubLSymbol COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH = makeSymbol("COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-ENGLISH");





    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLSymbol COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL = makeSymbol("COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-CYCL");

    private static final SubLString $$$a_ = makeString("a ");

    private static final SubLString $$$d_ = makeString("d ");

    private static final SubLString $$$c_ = makeString("c ");

    private static final SubLString $$$n_ = makeString("n ");

    private static final SubLString $str148$_G_ = makeString("#G\"");

    private static final SubLString $str149$Empty_string_results_in_no_consta = makeString("Empty string results in no constants found.");

    private static final SubLString $str150$_ = makeString("(");

    private static final SubLString $str151$___ = makeString("#<(");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $sym154$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str155$__ = makeString("#$");

    private static final SubLString $str156$_ = makeString("*");

    private static final SubLString $str157$__ = makeString(".*");

    private static final SubLString $str158$Cannot_handle_pattern___string___ = makeString("Cannot handle pattern *[string]* if [string] is under 5 characters.");

    private static final SubLString $str159$Cannot_handle_pattern___string__i = makeString("Cannot handle pattern *[string] if [string] is under 4 characters.");

    private static final SubLString $str160$Cannot_handle_pattern__string___i = makeString("Cannot handle pattern [string]* if [string] is under 3 characters.");

    private static final SubLSymbol $sym161$TERM_OK_FOR_BROWSING_ = makeSymbol("TERM-OK-FOR-BROWSING?");

    private static final SubLString $str163$Unable_to_access_subword_index___ = makeString("Unable to access subword-index: ~S");











    private static final SubLList $list169 = list(makeKeyword("CASELESS"));

    private static final SubLList $list170 = cons(makeSymbol("INDIRECT-HANDLER"), makeSymbol("INDIRECT-ARGS"));

    private static final SubLSymbol CB_MAIN_FRAME = makeSymbol("CB-MAIN-FRAME");

    private static final SubLSymbol CB_CF = makeSymbol("CB-CF");

    private static final SubLSymbol CB_CONSTANT_FRAME = makeSymbol("CB-CONSTANT-FRAME");

    private static final SubLSymbol CB_NF = makeSymbol("CB-NF");

    private static final SubLSymbol CB_NART_FRAME = makeSymbol("CB-NART-FRAME");

    private static final SubLSymbol CB_NAUT_FRAME = makeSymbol("CB-NAUT-FRAME");

    private static final SubLString $str177$30___ = makeString("30%,*");

    private static final SubLString $str180$The_requested_term_is_not_availab = makeString("The requested term is not available.");

    public static final SubLSymbol $cb_default_index_view$ = makeSymbol("*CB-DEFAULT-INDEX-VIEW*");

    private static final SubLSymbol CB_INDEX_FRAME = makeSymbol("CB-INDEX-FRAME");

    private static final SubLString $$$No_Index = makeString("No Index");

    private static final SubLSymbol CB_CONTENT_FRAME = makeSymbol("CB-CONTENT-FRAME");

    private static final SubLString $$$Index_Choose = makeString("Index Choose");

    private static final SubLString $str193$Choose_an_item_from_the_index_ = makeString("Choose an item from the index.");

    private static final SubLString $$$1 = makeString("1");

    private static final SubLSymbol CB_STATUS_FRAME = makeSymbol("CB-STATUS-FRAME");

    private static final SubLString $str196$cb_status_frame = makeString("cb-status-frame");

    private static final SubLSymbol CB_LINK_SERVER_STATUS = makeSymbol("CB-LINK-SERVER-STATUS");

    private static final SubLList $list200 = list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-INDENT")));

    private static final SubLList $list202 = list(makeKeyword("ALIGN"), $LEFT, makeKeyword("VALIGN"), makeKeyword("TOP"), makeKeyword("NOWRAP"), T);

    private static final SubLSymbol $CB_SERVER_STATUS = makeKeyword("CB-SERVER-STATUS");

    private static final SubLString $str204$cb_server_status_html = makeString("cb-server-status.html");

    private static final SubLString $str207$KB__ = makeString("KB: ");

    private static final SubLString $str208$Remote__ = makeString("Remote: ");

    private static final SubLString $$$all_ = makeString("all ");

    private static final SubLString $$$_of_ = makeString(" of ");

    private static final SubLString $str211$___ = makeString("???");

    private static final SubLString $str212$Local_ = makeString("Local:");

    private static final SubLSymbol $SHOW_LOCAL_OPS = makeKeyword("SHOW-LOCAL-OPS");

    private static final SubLString $str214$__d_ = makeString("(~d ");

    private static final SubLString $str216$_d = makeString("~d");

    private static final SubLString $str217$__d_ = makeString(" ~d)");

    private static final SubLString $str218$__d_ = makeString("(~d)");

    private static final SubLString $str219$Aux__ = makeString("Aux: ");

    private static final SubLString $str220$__d__d_ = makeString("(~d ~d)");

    private static final SubLString $str221$Transmit_Pending__ = makeString("Transmit Pending: ");

    // Definitions
    public static final SubLObject cb_start_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(com.cyc.cycjava.cycl.cb_frames.cb_page_title(UNPROVIDED));
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (NIL != html_macros.html_inside_body_p()) {
                Errors.error($str_alt0$Cannot_have_a_FRAMESET_tag_inside);
            }
            html_markup(html_macros.$html_frameset_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt1$75___50);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_frame($TOOLBAR, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cb_frame($MAIN, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cb_frame($STATUS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_no_frames_head$.getGlobalValue());
                    {
                        SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_markup(html_macros.$html_body_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str_alt5$You_must_have_frames_enabled_to_u);
                                    cb_link($OPTIONS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_princ($str_alt7$_page_);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
                        }
                    }
                    html_markup(html_macros.$html_no_frames_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    // Definitions
    public static SubLObject cb_start(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str1$_meta_http_equiv__X_UA_Compatible);
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
            html_princ(cb_page_title(UNPROVIDED));
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (NIL != html_macros.html_inside_body_p()) {
                Errors.error($str4$Cannot_have_a_FRAMESET_tag_inside);
            }
            html_markup(html_macros.$html_frameset_head$.getGlobalValue());
            html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str5$75___50);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_frame($TOOLBAR, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cb_frame($MAIN, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cb_frame($STATUS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_frames_head$.getGlobalValue());
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($str9$You_must_have_frames_enabled_to_u);
                        cb_link($OPTIONS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_princ($str11$_page_);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
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
                html_markup(html_macros.$html_no_frames_tail$.getGlobalValue());
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

    public static SubLObject cb_start_redirect(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str1$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_meta_head$.getGlobalValue());
            html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$Refresh);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_meta_content$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str15$0__url__cgi_bin_cg_cb_start);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup($str16$If_you_see_this__please_follow_);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str17$_cgi_bin_cg_cb_start);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup($$$this_link);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_markup($str19$_);
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$4, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_page_title_alt(SubLObject tool_name) {
        if (tool_name == UNPROVIDED) {
            tool_name = NIL;
        }
        {
            SubLObject machine_name = Strings.string_downcase(Environment.get_machine_name(UNPROVIDED), UNPROVIDED, UNPROVIDED);
            if (machine_name.isString()) {
                machine_name = cconcatenate($str_alt10$__, new SubLObject[]{ machine_name, $str_alt11$_ });
            } else {
                machine_name = $str_alt12$;
            }
            if (tool_name.isString()) {
                tool_name = cconcatenate($str_alt13$___, tool_name);
            } else {
                tool_name = $str_alt12$;
            }
            return format(NIL, $str_alt14$_A_A_A, new SubLObject[]{ $cb_name$.getGlobalValue(), tool_name, machine_name });
        }
    }

    public static SubLObject cb_page_title(SubLObject tool_name) {
        if (tool_name == UNPROVIDED) {
            tool_name = NIL;
        }
        SubLObject machine_name = Strings.string_downcase(Environment.get_machine_name(UNPROVIDED), UNPROVIDED, UNPROVIDED);
        if (machine_name.isString()) {
            machine_name = cconcatenate($str22$__, new SubLObject[]{ format_nil.format_nil_a_no_copy(machine_name), $$$_, format_nil.format_nil_d_no_copy(html_kernel.html_port()), $str24$_ });
        } else {
            machine_name = $str25$;
        }
        if (tool_name.isString()) {
            tool_name = cconcatenate($str26$___, tool_name);
        } else {
            tool_name = $str25$;
        }
        return format(NIL, $str27$_A_A_A, new SubLObject[]{ $cb_name$.getGlobalValue(), tool_name, machine_name });
    }

    public static final SubLObject cb_link_start_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$KB_Browser;
            }
            {
                SubLObject frame_name_var = cb_frame_name($TOP);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt17$cb_start);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_start(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$KB_Browser;
        }
        final SubLObject frame_name_var = cb_frame_name($TOP);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str30$cb_start);
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

    public static final SubLObject cb_toolbar_frame_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            html_complete.html_autocomplete_css();
            html_complete.html_autocomplete_scripts();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$basic_skin_class$.getGlobalValue()) {
                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$basic_skin_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            com.cyc.cycjava.cycl.cb_frames.cb_toolbar_frame_guts();
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                        }
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject cb_toolbar_frame(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str1$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != html_macros.$basic_skin_class$.getGlobalValue()) {
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$basic_skin_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_toolbar_frame_guts();
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_toolbar_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Update;
            }
            {
                SubLObject frame_name_var = cb_frame_name($TOOLBAR);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt25$cb_toolbar_frame);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_toolbar(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Update;
        }
        final SubLObject frame_name_var = cb_frame_name($TOOLBAR);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str38$cb_toolbar_frame);
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

    public static final SubLObject cb_toolbar_frame_guts_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
            html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL == $cb_toolbar_restrict_to_user_toolsP$.getDynamicValue(thread)) {
                                        com.cyc.cycjava.cycl.cb_frames.cb_toolbar_update_link();
                                        html_newline(UNPROVIDED);
                                    }
                                    if (NIL != $cb_include_help$.getDynamicValue(thread)) {
                                        cb_help($CB_TOOLBAR_FRAME, UNPROVIDED, UNPROVIDED);
                                        html_indent(UNPROVIDED);
                                    }
                                    bugzilla.cb_cycorp_internal_bugzilla_link();
                                    html_indent(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    com.cyc.cycjava.cycl.cb_frames.cb_specify_input();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            {
                                SubLObject align = $CENTER;
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (NIL != align) {
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align(align));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt38$50_);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        com.cyc.cycjava.cycl.cb_frames.cb_user_toolbar_links();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_glyph($NBSP, TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    cb_link($LOGIN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_indent(UNPROVIDED);
                                    cb_form(operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                    {
                                        SubLObject purpose = fi.ke_purpose();
                                        if (NIL != purpose) {
                                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            cb_link($CHOOSE_PROJECT, $str_alt41$Project__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_indent(UNPROVIDED);
                                            cb_form(purpose, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                            html_newline(UNPROVIDED);
                                        }
                                    }
                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    html_princ($str_alt42$Server__);
                                    html_princ(Environment.get_machine_name($$$unknown));
                                    html_princ($str_alt44$_);
                                    html_princ(system_parameters.$base_tcp_port$.getDynamicValue(thread));
                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
                                    if (NIL != cb_system_tools.$image_purpose$.getDynamicValue(thread)) {
                                        {
                                            SubLObject image_purpose_length = length(cb_system_tools.$image_purpose$.getDynamicValue(thread));
                                            SubLObject image_purpose = (image_purpose_length.numG($maximum_image_purpose_display_length$.getGlobalValue())) ? ((SubLObject) (cconcatenate(string_utilities.string_first_n($maximum_image_purpose_display_length$.getGlobalValue(), cb_system_tools.$image_purpose$.getDynamicValue(thread)), $str_alt45$___))) : cb_system_tools.$image_purpose$.getDynamicValue(thread);
                                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            html_princ($str_alt46$Purpose__);
                                            html_princ(image_purpose);
                                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_toolbar_frame_guts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject frame_name_var = cb_frame_name($TOP);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    html_princ($str30$cb_start);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($RESEARCHCYC_60);
                        final SubLObject align = $TOP;
                        final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($RESEARCHCYC_60);
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
                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                        }
                        html_markup(html_macros.$html_image_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_specify_input();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                final SubLObject align2 = $LEFT;
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (NIL != align2) {
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align2));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str50$50_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_user_toolbar_links();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ($str51$You_are__);
                    cb_form(operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    cb_link($LOGOUT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ($str53$Server__);
                    html_princ(Environment.get_machine_name($$$unknown));
                    html_princ($str55$_);
                    html_princ(system_parameters.$base_tcp_port$.getDynamicValue(thread));
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    if (NIL != cb_system_tools.$image_purpose$.getDynamicValue(thread)) {
                        final SubLObject image_purpose_length = length(cb_system_tools.$image_purpose$.getDynamicValue(thread));
                        final SubLObject image_purpose = (image_purpose_length.numG($maximum_image_purpose_display_length$.getGlobalValue())) ? cconcatenate(string_utilities.string_first_n($maximum_image_purpose_display_length$.getGlobalValue(), cb_system_tools.$image_purpose$.getDynamicValue(thread)), $str56$___) : cb_system_tools.$image_purpose$.getDynamicValue(thread);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_princ($str57$Purpose__);
                        html_princ(image_purpose);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_toolbar_update_link_alt() {
        cb_link($TOOLBAR, $$$Update, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(TWO_INTEGER);
        return NIL;
    }

    public static SubLObject cb_toolbar_update_link() {
        cb_link($TOOLBAR, $$$Update, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(TWO_INTEGER);
        return NIL;
    }

    /**
     * Output the user's toolbar links
     */
    @LispMethod(comment = "Output the user\'s toolbar links")
    public static final SubLObject cb_user_toolbar_links_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tools = $cb_user_toolbar_links$.getDynamicValue(thread);
                tools = list_utilities.remove_if_not(FUNCTION_SPEC_P, tools, CB_LINK_METHOD, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                tools = list_utilities.remove_if_not(STRINGP, tools, CB_TOOL_ABBREVIATION, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                tools = Sort.sort(tools, $sym52$STRING_, CB_TOOL_ABBREVIATION);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != $cb_toolbar_restrict_to_user_toolsP$.getDynamicValue(thread)) {
                                            html_princ($$$Tools);
                                        } else {
                                            cb_link($TOOLS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        html_princ($str_alt44$_);
                                        {
                                            SubLObject cdolist_list_var = tools;
                                            SubLObject tool = NIL;
                                            for (tool = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tool = cdolist_list_var.first()) {
                                                if (cb_link_method(tool).isFunctionSpec()) {
                                                    html_indent(ONE_INTEGER);
                                                    cb_link(tool, cb_tool_abbreviation(tool), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     * Output the user's toolbar links
     */
    @LispMethod(comment = "Output the user\'s toolbar links")
    public static SubLObject cb_user_toolbar_links() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tools = user_toolbar_links();
        tools = list_utilities.remove_if_not(FUNCTION_SPEC_P, tools, CB_LINK_METHOD, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        tools = list_utilities.remove_if_not(STRINGP, tools, CB_TOOL_ABBREVIATION, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        tools = Sort.sort(tools, $sym64$STRING_, CB_TOOL_ABBREVIATION);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != $cb_toolbar_restrict_to_user_toolsP$.getDynamicValue(thread)) {
                        html_princ($$$Tools);
                    } else {
                        cb_link($TOOLS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    html_princ($str55$_);
                    SubLObject cdolist_list_var = tools;
                    SubLObject tool = NIL;
                    tool = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (cb_link_method(tool).isFunctionSpec()) {
                            html_indent(UNPROVIDED);
                            cb_link(tool, cb_tool_abbreviation(tool), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        tool = cdolist_list_var.first();
                    } 
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
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject user_toolbar_links() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_user_toolbar_links$.getDynamicValue(thread);
    }

    public static final SubLObject cb_specify_input_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject width = $str_alt58$98_;
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str_alt59$cb_handle_specify, T, UNPROVIDED);
                        html_hidden_input($$$handler, $str_alt61$cb_cf, UNPROVIDED);
                        html_hidden_input($str_alt62$arg_done, T, UNPROVIDED);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup($str_alt63$constant_complete);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup($$$autocomplete);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_script_utilities.html_text_input_reset_multi_submit($$$query, $str_alt12$, width, NIL, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), html_macros.$html_form_method_post$.getGlobalValue(), UNPROVIDED);
                                                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup($$$completeContainer);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                        if (NIL != $cb_search_autocomplete_enabled$.getDynamicValue(thread)) {
                                                            html_complete.html_print_js_autocomplete_setup_int($$$inputBox, $$$completeContainer, $int$50, THREE_INTEGER, T, $$Thing);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_script_utilities.html_multi_submit_input($$$Search, $str_alt12$, NIL, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), html_macros.$html_form_method_post$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                html_create_dropdown_list($str_alt71$gloss_required, $cb_specify_show_gloss_options_text$.getGlobalValue(), $cb_specify_show_gloss_options$.getGlobalValue(), ONE_INTEGER, position($cb_specify_show_gloss$.getDynamicValue(thread), $cb_specify_show_gloss_options$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                                if (NIL != system_parameters.$constant_name_grep_enabled$.getDynamicValue(thread)) {
                                                    html_markup(html_macros.$html_input_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_input_type$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_macros.$html_input_checkbox$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    if (true) {
                                                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($str_alt72$case_insensitive);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_markup(html_macros.$html_input_name$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($str_alt72$case_insensitive);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_markup(html_macros.$html_input_value$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_princ(T);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    html_indent(UNPROVIDED);
                                                    html_markup(html_macros.$html_label_head$.getGlobalValue());
                                                    if (true) {
                                                        html_markup(html_macros.$html_label_for$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_color($str_alt72$case_insensitive));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                            html_princ($$$Ignore_Case);
                                                            html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_label_tail$.getGlobalValue());
                                                }
                                                html_indent(UNPROVIDED);
                                                html_markup(html_macros.$html_input_head$.getGlobalValue());
                                                html_markup(html_macros.$html_input_type$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_macros.$html_input_checkbox$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                if (true) {
                                                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($$$lucky);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_markup(html_macros.$html_input_name$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($$$lucky);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_markup(html_macros.$html_input_value$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_princ(T);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != $cb_lucky_term_searchP$.getDynamicValue(thread)) {
                                                    html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                html_indent(UNPROVIDED);
                                                html_markup(html_macros.$html_label_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_label_for$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_color($$$lucky));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                        html_princ($$$Lucky);
                                                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_label_tail$.getGlobalValue());
                                                html_glyph($NBSP, UNPROVIDED);
                                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($RIGHT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL == Regex.is_regex_implementation_availableP()) {
                                                    html_script_utilities.html_multi_submit_input($$$GREP, NIL, system_parameters.$cyc_grep_cgi_program$.getDynamicValue(thread), html_macros.$html_form_method_get$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                                html_script_utilities.html_clear_input_button($$$query, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                return NIL;
            }
        }
    }

    public static SubLObject cb_specify_input() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject width = $str70$98_;
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != html_macros.$html_form_method_get$.getGlobalValue()) {
            html_markup(html_macros.$html_form_method$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_form_method_get$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$within_html_form$.bind(T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_hidden_input($str71$cb_handle_specify, NIL, UNPROVIDED);
            html_hidden_input($$$handler, $str73$cb_cf, UNPROVIDED);
            html_hidden_input($str74$arg_done, T, UNPROVIDED);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str75$constant_complete);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$autocomplete);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_script_utilities.html_text_input_reset_multi_submit($$$query, $str25$, width, NIL, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), html_macros.$html_form_method_get$.getGlobalValue(), UNPROVIDED);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$completeContainer);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                }
                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (NIL != $cb_search_autocomplete_enabled$.getDynamicValue(thread)) {
                                html_complete.html_print_js_autocomplete_setup_int($$$inputBox, $$$completeContainer, $int$50, THREE_INTEGER, T, $$Thing);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_script_utilities.html_multi_submit_input($$$Search, $str25$, NIL, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), html_macros.$html_form_method_get$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_create_dropdown_list($str83$gloss_required, $cb_specify_show_gloss_options_text$.getGlobalValue(), $cb_specify_show_gloss_options$.getGlobalValue(), ONE_INTEGER, position($cb_specify_show_gloss$.getDynamicValue(thread), $cb_specify_show_gloss_options$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                        html_glyph($NBSP, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_script_utilities.html_clear_input_button($$$query, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_link_cb_specify_all_alt(SubLObject search_string, SubLObject count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_frame_name($CYC_MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt79$cb_handle_specify_query__A_everyt, web_utilities.html_url_encode(search_string, UNPROVIDED));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt80$_A_results, count);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return search_string;
        }
    }

    public static SubLObject cb_link_cb_specify_all(final SubLObject search_string, final SubLObject count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($CYC_MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str86$cb_handle_specify_query__A_everyt, web_utilities.html_url_encode(search_string, UNPROVIDED));
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
            format(html_macros.$html_stream$.getDynamicValue(thread), $str87$_A_results, count);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return search_string;
    }

    public static final SubLObject cb_handle_specify_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query = html_extract_input($$$query, args);
                SubLObject ir_terms = NIL;
                SubLObject ir_term_count = NIL;
                SubLObject wn_synsets = NIL;
                SubLObject perform_wn_searchP = NIL;
                SubLObject gloss_type_string = html_extract_input($str_alt71$gloss_required, args);
                SubLObject gloss_type = (gloss_type_string.isString()) ? ((SubLObject) (read_from_string_ignoring_errors(gloss_type_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NONE;
                SubLObject luckyP = (NIL != html_extract_input($$$lucky, args)) ? ((SubLObject) (T)) : NIL;
                SubLObject case_insensitiveP_string = html_extract_input($str_alt72$case_insensitive, args);
                SubLObject search_for_everythingP = html_extract_input($$$everything, args);
                SubLObject other_terms_limit = (NIL != search_for_everythingP) ? ((SubLObject) (NIL)) : $int$100;
                SubLObject case_insensitiveP = (case_insensitiveP_string.isString()) ? ((SubLObject) (read_from_string_ignoring_errors(case_insensitiveP_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                if ((NIL != luckyP) && (NIL == $cb_lucky_term_searchP$.getDynamicValue(thread))) {
                    $cb_lucky_term_searchP$.setDynamicValue(T, thread);
                } else {
                    if ((NIL == luckyP) && (NIL != $cb_lucky_term_searchP$.getDynamicValue(thread))) {
                        $cb_lucky_term_searchP$.setDynamicValue(NIL, thread);
                    }
                }
                $cb_specify_show_gloss$.setDynamicValue(gloss_type, thread);
                if (NIL != query) {
                    thread.resetMultipleValues();
                    {
                        SubLObject terms = com.cyc.cycjava.cycl.cb_frames.terms_for_browsing(query, case_insensitiveP, T);
                        SubLObject error_string = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (!((NIL != list_utilities.singletonP(terms)) || ((NIL != com.cyc.cycjava.cycl.cb_frames.reserved_browser_string_p(query)) && (NIL == com.cyc.cycjava.cycl.cb_frames.reserved_wn_browser_string_p(query))))) {
                            thread.resetMultipleValues();
                            {
                                SubLObject ir_terms_26 = com.cyc.cycjava.cycl.cb_frames.related_cyc_terms_for_browsing(query, terms, other_terms_limit);
                                SubLObject ir_term_count_27 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                ir_terms = ir_terms_26;
                                ir_term_count = ir_term_count_27;
                            }
                            perform_wn_searchP = T;
                        }
                        if (query.isString() && ((NIL != perform_wn_searchP) || (NIL != com.cyc.cycjava.cycl.cb_frames.reserved_wn_browser_string_p(query)))) {
                            wordnet_import.wni_clear_function_caches();
                            wn_synsets = com.cyc.cycjava.cycl.cb_frames.cb_wn_synsets_from_query(query);
                        }
                        if (((NIL == terms) && (NIL == ir_terms)) && (NIL == wn_synsets)) {
                            if (query.isString() && (NIL == list_utilities.find_if_not(symbol_function(VALID_CONSTANT_NAME_CHAR_P), query, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                if (length(query).numG(ZERO_INTEGER)) {
                                    cb_browser.cb_alpha(list(query));
                                } else {
                                    cb_browser.cb_alpha_top(UNPROVIDED);
                                }
                            } else {
                                if (NIL != error_string) {
                                    cb_error(error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else {
                                    cb_error($str_alt87$Can_t_determine_a_Cyc_term_from__, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        } else {
                            if ((NIL != list_utilities.singletonP(terms)) && (NIL == ir_terms)) {
                                if (NIL != assertion_handles.assertion_p(terms.first())) {
                                    cb_assertion_browser.cb_assertion_internal(terms.first());
                                } else {
                                    if (NIL != deduction_handles.deduction_p(terms.first())) {
                                        cb_assertion_browser.cb_deduction_internal(terms.first());
                                    } else {
                                        com.cyc.cycjava.cycl.cb_frames.cb_term_frame_internal(cb_term_identifier(terms.first()));
                                    }
                                }
                            } else {
                                if ((NIL == terms) && (NIL != list_utilities.singletonP(ir_terms))) {
                                    if (NIL != assertion_handles.assertion_p(ir_terms.first())) {
                                        cb_assertion_browser.cb_assertion_internal(ir_terms.first());
                                    } else {
                                        if (NIL != deduction_handles.deduction_p(terms.first())) {
                                            cb_assertion_browser.cb_deduction_internal(ir_terms.first());
                                        } else {
                                            com.cyc.cycjava.cycl.cb_frames.cb_term_frame_internal(cb_term_identifier(ir_terms.first()));
                                        }
                                    }
                                } else {
                                    if ((terms.isCons() || ir_terms.isCons()) || wn_synsets.isCons()) {
                                        com.cyc.cycjava.cycl.cb_frames.cb_term_choices(query, terms, ir_terms, wn_synsets, gloss_type, ir_term_count);
                                    } else {
                                        if (NIL != error_string) {
                                            cb_error(error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            cb_error($str_alt87$Can_t_determine_a_Cyc_term_from__, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cb_error($str_alt88$Please_enter_a_non_empty_string_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_handle_specify(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query = html_extract_input($$$query, args);
        SubLObject ir_terms = NIL;
        SubLObject ir_term_count = NIL;
        SubLObject wn_synsets = NIL;
        SubLObject perform_wn_searchP = NIL;
        final SubLObject gloss_type_string = html_extract_input($str83$gloss_required, args);
        final SubLObject gloss_type = (gloss_type_string.isString()) ? read_from_string_ignoring_errors(gloss_type_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NONE;
        final SubLObject luckyP = (NIL != html_extract_input($$$lucky, args)) ? T : NIL;
        final SubLObject case_insensitiveP_string = html_extract_input($str92$case_insensitive, args);
        final SubLObject search_for_everythingP = html_extract_input($$$everything, args);
        final SubLObject other_terms_limit = (NIL != search_for_everythingP) ? NIL : $int$100;
        final SubLObject case_insensitiveP = T;
        if ((NIL != luckyP) && (NIL == $cb_lucky_term_searchP$.getDynamicValue(thread))) {
            $cb_lucky_term_searchP$.setDynamicValue(T, thread);
        } else
            if ((NIL == luckyP) && (NIL != $cb_lucky_term_searchP$.getDynamicValue(thread))) {
                $cb_lucky_term_searchP$.setDynamicValue(NIL, thread);
            }

        $cb_specify_show_gloss$.setDynamicValue(gloss_type, thread);
        if (NIL != query) {
            query = string_utilities.nsubst_whitespace(query);
            thread.resetMultipleValues();
            final SubLObject terms = terms_for_browsing(query, case_insensitiveP, T);
            final SubLObject error_string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == list_utilities.singletonP(terms)) && ((NIL == reserved_browser_string_p(query)) || (NIL != reserved_wn_browser_string_p(query)))) {
                thread.resetMultipleValues();
                final SubLObject ir_terms_$31 = related_cyc_terms_for_browsing(query, terms, other_terms_limit);
                final SubLObject ir_term_count_$32 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                ir_terms = ir_terms_$31;
                ir_term_count = ir_term_count_$32;
                perform_wn_searchP = T;
            }
            if (query.isString() && ((NIL != perform_wn_searchP) || (NIL != reserved_wn_browser_string_p(query)))) {
                wordnet_import.wni_clear_function_caches();
                wn_synsets = cb_wn_synsets_from_query(query);
            }
            if (((NIL == terms) && (NIL == ir_terms)) && (NIL == wn_synsets)) {
                if (query.isString() && (NIL == list_utilities.find_if_not(symbol_function(VALID_CONSTANT_NAME_CHAR_P), query, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    if (length(query).numG(ZERO_INTEGER)) {
                        cb_browser.cb_alpha(list(query));
                    } else {
                        cb_browser.cb_alpha_top(UNPROVIDED);
                    }
                } else
                    if (NIL != error_string) {
                        cb_error(error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        cb_error($str96$Can_t_determine_a_Cyc_term_from__, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }

            } else
                if ((NIL != list_utilities.singletonP(terms)) && (NIL == ir_terms)) {
                    if (NIL != assertion_handles.assertion_p(terms.first())) {
                        cb_assertion_browser.cb_assertion_internal(terms.first());
                    } else
                        if (NIL != deduction_handles.deduction_p(terms.first())) {
                            cb_assertion_browser.cb_deduction_internal(terms.first());
                        } else {
                            cb_term_frame_internal(cb_term_identifier(terms.first()));
                        }

                } else
                    if ((NIL == terms) && (NIL != list_utilities.singletonP(ir_terms))) {
                        if (NIL != assertion_handles.assertion_p(ir_terms.first())) {
                            cb_assertion_browser.cb_assertion_internal(ir_terms.first());
                        } else
                            if (NIL != deduction_handles.deduction_p(terms.first())) {
                                cb_assertion_browser.cb_deduction_internal(ir_terms.first());
                            } else {
                                cb_term_frame_internal(cb_term_identifier(ir_terms.first()));
                            }

                    } else
                        if ((terms.isCons() || ir_terms.isCons()) || wn_synsets.isCons()) {
                            cb_term_choices(query, terms, ir_terms, wn_synsets, gloss_type, ir_term_count);
                        } else
                            if (NIL != error_string) {
                                cb_error(error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                cb_error($str96$Can_t_determine_a_Cyc_term_from__, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }




        } else {
            cb_error($str97$Please_enter_a_non_empty_string_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_wn_synsets_from_query_alt(SubLObject query) {
        if (NIL != com.cyc.cycjava.cycl.cb_frames.reserved_wn_browser_string_p(query)) {
            {
                SubLObject string = string_utilities.substring(query, THREE_INTEGER, UNPROVIDED);
                return NIL != string_utilities.digit_stringP(string) ? ((SubLObject) (list(wordnet_import.wni_synset_from_id_string(string)))) : wordnet_import.wni_synsets_for_english_word_string(string);
            }
        } else {
            return wordnet_import.wni_synsets_for_english_word_string(query);
        }
    }

    public static SubLObject cb_wn_synsets_from_query(final SubLObject query) {
        if (NIL != reserved_wn_browser_string_p(query)) {
            final SubLObject string = string_utilities.substring(query, THREE_INTEGER, UNPROVIDED);
            return NIL != string_utilities.digit_stringP(string) ? list(wordnet_import.wni_synset_from_id_string(string)) : wordnet_import.wni_synsets_for_english_word_string(string);
        }
        return wordnet_import.wni_synsets_for_english_word_string(query);
    }

    public static final SubLObject cb_term_choices_alt(SubLObject query, SubLObject terms_and_assertions, SubLObject related_terms, SubLObject wn_synsets, SubLObject gloss_type, SubLObject related_term_count) {
        if (gloss_type == UNPROVIDED) {
            gloss_type = NIL;
        }
        if (related_term_count == UNPROVIDED) {
            related_term_count = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject assertions = list_utilities.partition_list(terms_and_assertions, symbol_function(ASSERTION_P));
                SubLObject terms = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject title = (NIL != com.cyc.cycjava.cycl.cb_frames.reserved_wn_browser_string_p(query)) ? ((SubLObject) (cconcatenate($str_alt91$WordNet_search_results_for__, new SubLObject[]{ string_utilities.pre_remove(query, $str_alt92$wn_, UNPROVIDED), $str_alt93$_ }))) : cconcatenate($str_alt94$Search_results_for__, new SubLObject[]{ query, $str_alt93$_ });
                    SubLObject matching_terms_string = (NIL != terms) ? ((SubLObject) (NIL != list_utilities.singletonP(terms) ? ((SubLObject) ($str_alt95$_A_matching_term_found_)) : $str_alt96$_A_matching_terms_found_)) : NIL != com.cyc.cycjava.cycl.cb_frames.reserved_wn_browser_string_p(query) ? ((SubLObject) (NIL != wn_synsets ? ((SubLObject) ($str_alt97$_A_matching_WordNet_synsets_found)) : $str_alt98$No_matching_WordNet_synsets_found)) : $str_alt99$No_matching_terms_found_;
                    SubLObject see_also_string = (NIL != terms) ? ((SubLObject) ($str_alt100$See_also_)) : $str_alt101$But_see_;
                    html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                {
                                    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_markup(TWO_INTEGER);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        html_princ(title);
                                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_markup(TWO_INTEGER);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                if (NIL != com.cyc.cycjava.cycl.cb_frames.reserved_wn_browser_string_p(query)) {
                                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_markup(FOUR_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), matching_terms_string, length(wn_synsets));
                                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_markup(FOUR_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                } else {
                                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_markup(FOUR_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), matching_terms_string, length(terms));
                                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_markup(FOUR_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                }
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject _prev_bind_0_30 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                        {
                                                            SubLObject reuseP = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            try {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject _prev_bind_0_31 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                    try {
                                                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                        {
                                                                            SubLObject new_or_reused = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject _prev_bind_0_32 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                                try {
                                                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                    {
                                                                                        SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_33 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                            try {
                                                                                                memoization_state.$memoization_state$.bind(local_state, thread);
                                                                                                {
                                                                                                    SubLObject original_memoization_process = NIL;
                                                                                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                                                        {
                                                                                                            SubLObject current_proc = current_process();
                                                                                                            if (NIL == original_memoization_process) {
                                                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                                                            } else {
                                                                                                                if (original_memoization_process != current_proc) {
                                                                                                                    Errors.error($str_alt102$Invalid_attempt_to_reuse_memoizat);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_34 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                                                                                            try {
                                                                                                                pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                                                                                                com.cyc.cycjava.cycl.cb_frames.cb_display_term_section(terms, gloss_type);
                                                                                                            } finally {
                                                                                                                pph_vars.$pph_language_mt$.rebind(_prev_bind_0_34, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_33, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_32, thread);
                                                                                }
                                                                            }
                                                                            if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_31, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL == reuseP) {
                                                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_36, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_30, thread);
                                                    }
                                                }
                                                if ((NIL != related_terms) || (NIL != assertions)) {
                                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_markup(FOUR_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    html_princ(see_also_string);
                                                    if (NIL != related_term_count) {
                                                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                                                        html_markup(html_macros.$html_span_style$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_macros.$html_style_font_size_smaller$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt104$__1__A_of_approximately_, length(related_terms));
                                                                cb_link($CB_SPECIFY_ALL, query, related_term_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                html_princ($str_alt11$_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                                    }
                                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_markup(FOUR_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                }
                                                com.cyc.cycjava.cycl.cb_frames.cb_display_term_section(cconcatenate(assertions, related_terms), gloss_type);
                                                if (NIL != wn_synsets) {
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_frames.cb_display_wn_synsets_section(wn_synsets);
                                                }
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    return query;
                }
            }
        }
    }

    public static SubLObject cb_term_choices(final SubLObject query, final SubLObject terms_and_assertions, final SubLObject related_terms, final SubLObject wn_synsets, SubLObject gloss_type, SubLObject related_term_count) {
        if (gloss_type == UNPROVIDED) {
            gloss_type = NIL;
        }
        if (related_term_count == UNPROVIDED) {
            related_term_count = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject assertions = list_utilities.partition_list(terms_and_assertions, symbol_function(ASSERTION_P));
        final SubLObject terms = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject title = (NIL != reserved_wn_browser_string_p(query)) ? cconcatenate($str100$WordNet_search_results_for__, new SubLObject[]{ string_utilities.pre_remove(query, $$$wn_, UNPROVIDED), $str102$_ }) : cconcatenate($str103$Search_results_for__, new SubLObject[]{ query, $str102$_ });
        final SubLObject matching_terms_string = (NIL != terms) ? NIL != list_utilities.singletonP(terms) ? $str104$_A_matching_term_found_ : $str105$_A_matching_terms_found_ : NIL != reserved_wn_browser_string_p(query) ? NIL != wn_synsets ? $str106$_A_matching_WordNet_synsets_found : $str107$No_matching_WordNet_synsets_found : $str108$No_matching_terms_found_;
        final SubLObject see_also_string = (NIL != terms) ? $str109$See_also_ : $str110$But_see_;
        html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str1$_meta_http_equiv__X_UA_Compatible);
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
            html_princ(title);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$33 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ(title);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_head_shortcut_icon();
                    html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css($CB_CYC);
                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                if (NIL != reserved_wn_browser_string_p(query)) {
                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_markup(FOUR_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), matching_terms_string, length(wn_synsets));
                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_markup(FOUR_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                } else {
                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_markup(FOUR_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), matching_terms_string, length(terms));
                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_markup(FOUR_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                }
                                final SubLObject _prev_bind_0_$38 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                try {
                                    pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$39 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                        final SubLObject reuseP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        try {
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$40 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                final SubLObject new_or_reused = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                final SubLObject _prev_bind_0_$41 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                    final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    final SubLObject _prev_bind_0_$42 = memoization_state.$memoization_state$.currentBinding(thread);
                                                    try {
                                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                        try {
                                                            final SubLObject _prev_bind_0_$43 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$44 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                                            try {
                                                                pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                                                pph_vars.$paraphrase_mode$.bind($HTML, thread);
                                                                cb_display_term_section(terms, gloss_type);
                                                            } finally {
                                                                pph_vars.$paraphrase_mode$.rebind(_prev_bind_1_$44, thread);
                                                                pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$43, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$42, thread);
                                                    }
                                                } finally {
                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$41, thread);
                                                }
                                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$40, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                if (NIL == reuseP) {
                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                }
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                            }
                                        }
                                    } finally {
                                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$39, thread);
                                    }
                                } finally {
                                    pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$38, thread);
                                }
                                if ((NIL != related_terms) || (NIL != assertions)) {
                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_markup(FOUR_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    html_princ(see_also_string);
                                    if (NIL != related_term_count) {
                                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                                        html_markup(html_macros.$html_span_style$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_style_font_size_smaller$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str113$__1__A_of_approximately_, length(related_terms));
                                            cb_link($CB_SPECIFY_ALL, query, related_term_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_princ($str24$_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                                        }
                                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                    }
                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_markup(FOUR_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                }
                                cb_display_term_section(cconcatenate(assertions, related_terms), gloss_type);
                                if (NIL != wn_synsets) {
                                    html_newline(UNPROVIDED);
                                    cb_display_wn_synsets_section(wn_synsets);
                                }
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$33, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return query;
    }

    /**
     * Displays the list of synset words, glosses and example sentences for each of the given list of WordNet synonym sets.
     *
     * @param wn-synsets
     * 		: list of naut-p synsets
     */
    @LispMethod(comment = "Displays the list of synset words, glosses and example sentences for each of the given list of WordNet synonym sets.\r\n\r\n@param wn-synsets\r\n\t\t: list of naut-p synsets")
    public static final SubLObject cb_display_wn_synsets_section_alt(SubLObject wn_synsets) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = wn_synsets;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, NAUT_P);
                    }
                }
            }
            {
                SubLObject noun_synsets = NIL;
                SubLObject verb_synsets = NIL;
                SubLObject adjective_synsets = NIL;
                SubLObject adverb_synsets = NIL;
                SubLObject other_synsets = NIL;
                {
                    SubLObject cdolist_list_var = wn_synsets;
                    SubLObject synset = NIL;
                    for (synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset = cdolist_list_var.first()) {
                        if (wordnet_import.wni_synset_pos(synset) == $$Noun) {
                            noun_synsets = cons(synset, noun_synsets);
                        } else {
                            if (wordnet_import.wni_synset_pos(synset) == $$Verb) {
                                verb_synsets = cons(synset, verb_synsets);
                            } else {
                                if (wordnet_import.wni_synset_pos(synset) == $$Adjective) {
                                    adjective_synsets = cons(synset, adjective_synsets);
                                } else {
                                    if (wordnet_import.wni_synset_pos(synset) == $$Adverb) {
                                        adverb_synsets = cons(synset, adverb_synsets);
                                    } else {
                                        other_synsets = cons(synset, other_synsets);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != noun_synsets) {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_princ($str_alt111$WordNet_Noun_Synonym_Sets__in_Ord);
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_hr(UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    {
                        SubLObject cdolist_list_var = nreverse(noun_synsets);
                        SubLObject noun_synset = NIL;
                        for (noun_synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , noun_synset = cdolist_list_var.first()) {
                            {
                                SubLObject frame_name_var = cb_frame_name(NIL);
                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != frame_name_var) {
                                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(frame_name_var);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_hidden_input($str_alt112$wni_try_concept_match, T, UNPROVIDED);
                                        html_hidden_input($str_alt113$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(noun_synset)), UNPROVIDED);
                                        cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser(noun_synset);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                        }
                    }
                }
                if (NIL != verb_synsets) {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_princ($str_alt114$WordNet_Verb_Synonym_Sets__in_Ord);
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_hr(UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    {
                        SubLObject cdolist_list_var = nreverse(verb_synsets);
                        SubLObject verb_synset = NIL;
                        for (verb_synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , verb_synset = cdolist_list_var.first()) {
                            {
                                SubLObject frame_name_var = cb_frame_name(NIL);
                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != frame_name_var) {
                                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(frame_name_var);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_hidden_input($str_alt112$wni_try_concept_match, T, UNPROVIDED);
                                        html_hidden_input($str_alt113$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(verb_synset)), UNPROVIDED);
                                        cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser(verb_synset);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                        }
                    }
                }
                if (NIL != adjective_synsets) {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_princ($str_alt115$WordNet_Adjective_Synonym_Sets__i);
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_hr(UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    {
                        SubLObject cdolist_list_var = nreverse(adjective_synsets);
                        SubLObject adjective_synset = NIL;
                        for (adjective_synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , adjective_synset = cdolist_list_var.first()) {
                            {
                                SubLObject frame_name_var = cb_frame_name(NIL);
                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != frame_name_var) {
                                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(frame_name_var);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_hidden_input($str_alt112$wni_try_concept_match, T, UNPROVIDED);
                                        html_hidden_input($str_alt113$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(adjective_synset)), UNPROVIDED);
                                        cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser(adjective_synset);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                        }
                    }
                }
                if (NIL != adverb_synsets) {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_princ($str_alt116$WordNet_Adverb_Synonym_Sets__in_O);
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_hr(UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    {
                        SubLObject cdolist_list_var = nreverse(adverb_synsets);
                        SubLObject adverb_synset = NIL;
                        for (adverb_synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , adverb_synset = cdolist_list_var.first()) {
                            {
                                SubLObject frame_name_var = cb_frame_name(NIL);
                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != frame_name_var) {
                                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(frame_name_var);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_hidden_input($str_alt112$wni_try_concept_match, T, UNPROVIDED);
                                        html_hidden_input($str_alt113$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(adverb_synset)), UNPROVIDED);
                                        cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser(adverb_synset);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                        }
                    }
                }
                if (NIL != other_synsets) {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_princ($$$Other_WordNet_SynSets);
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_hr(UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    {
                        SubLObject cdolist_list_var = other_synsets;
                        SubLObject synset = NIL;
                        for (synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset = cdolist_list_var.first()) {
                            html_princ(synset);
                            html_terpri(UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Displays the list of synset words, glosses and example sentences for each of the given list of WordNet synonym sets.
     *
     * @param wn-synsets
     * 		: list of naut-p synsets
     */
    @LispMethod(comment = "Displays the list of synset words, glosses and example sentences for each of the given list of WordNet synonym sets.\r\n\r\n@param wn-synsets\r\n\t\t: list of naut-p synsets")
    public static SubLObject cb_display_wn_synsets_section(final SubLObject wn_synsets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(wn_synsets) : "! list_utilities.non_dotted_list_p(wn_synsets) " + ("list_utilities.non_dotted_list_p(wn_synsets) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(wn_synsets) ") + wn_synsets;
        SubLObject cdolist_list_var = wn_synsets;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "! narts_high.naut_p(elem) " + ("narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject noun_synsets = NIL;
        SubLObject verb_synsets = NIL;
        SubLObject adjective_synsets = NIL;
        SubLObject adverb_synsets = NIL;
        SubLObject other_synsets = NIL;
        SubLObject cdolist_list_var2 = wn_synsets;
        SubLObject synset = NIL;
        synset = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != kb_utilities.kbeq(wordnet_import.wni_synset_pos(synset), $$Noun)) {
                noun_synsets = cons(synset, noun_synsets);
            } else
                if (NIL != kb_utilities.kbeq(wordnet_import.wni_synset_pos(synset), $$Verb)) {
                    verb_synsets = cons(synset, verb_synsets);
                } else
                    if (NIL != kb_utilities.kbeq(wordnet_import.wni_synset_pos(synset), $$Adjective)) {
                        adjective_synsets = cons(synset, adjective_synsets);
                    } else
                        if (NIL != kb_utilities.kbeq(wordnet_import.wni_synset_pos(synset), $$Adverb)) {
                            adverb_synsets = cons(synset, adverb_synsets);
                        } else {
                            other_synsets = cons(synset, other_synsets);
                        }



            cdolist_list_var2 = cdolist_list_var2.rest();
            synset = cdolist_list_var2.first();
        } 
        if (NIL != noun_synsets) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($str120$WordNet_Noun_Synonym_Sets__in_Ord);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            cdolist_list_var2 = nreverse(noun_synsets);
            SubLObject noun_synset = NIL;
            noun_synset = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
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
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_4 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_macros.$within_html_form$.bind(T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_hidden_input($str122$wni_try_concept_match, T, UNPROVIDED);
                    html_hidden_input($str123$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(noun_synset)), UNPROVIDED);
                    cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser(noun_synset);
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                } finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_4, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_3, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                cdolist_list_var2 = cdolist_list_var2.rest();
                noun_synset = cdolist_list_var2.first();
            } 
        }
        if (NIL != verb_synsets) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($str124$WordNet_Verb_Synonym_Sets__in_Ord);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            cdolist_list_var2 = nreverse(verb_synsets);
            SubLObject verb_synset = NIL;
            verb_synset = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
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
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_4 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_macros.$within_html_form$.bind(T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_hidden_input($str122$wni_try_concept_match, T, UNPROVIDED);
                    html_hidden_input($str123$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(verb_synset)), UNPROVIDED);
                    cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser(verb_synset);
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                } finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_4, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_3, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                cdolist_list_var2 = cdolist_list_var2.rest();
                verb_synset = cdolist_list_var2.first();
            } 
        }
        if (NIL != adjective_synsets) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($str125$WordNet_Adjective_Synonym_Sets__i);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            cdolist_list_var2 = nreverse(adjective_synsets);
            SubLObject adjective_synset = NIL;
            adjective_synset = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
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
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_4 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_macros.$within_html_form$.bind(T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_hidden_input($str122$wni_try_concept_match, T, UNPROVIDED);
                    html_hidden_input($str123$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(adjective_synset)), UNPROVIDED);
                    cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser(adjective_synset);
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                } finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_4, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_3, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                cdolist_list_var2 = cdolist_list_var2.rest();
                adjective_synset = cdolist_list_var2.first();
            } 
        }
        if (NIL != adverb_synsets) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($str126$WordNet_Adverb_Synonym_Sets__in_O);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            cdolist_list_var2 = nreverse(adverb_synsets);
            SubLObject adverb_synset = NIL;
            adverb_synset = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
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
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_4 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_macros.$within_html_form$.bind(T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_hidden_input($str122$wni_try_concept_match, T, UNPROVIDED);
                    html_hidden_input($str123$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(adverb_synset)), UNPROVIDED);
                    cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser(adverb_synset);
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                } finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_4, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_3, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                cdolist_list_var2 = cdolist_list_var2.rest();
                adverb_synset = cdolist_list_var2.first();
            } 
        }
        if (NIL != other_synsets) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($$$Other_WordNet_SynSets);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            cdolist_list_var2 = other_synsets;
            synset = NIL;
            synset = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                html_princ(synset);
                html_terpri(UNPROVIDED);
                cdolist_list_var2 = cdolist_list_var2.rest();
                synset = cdolist_list_var2.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject cb_display_term_section_alt(SubLObject terms, SubLObject gloss_type) {
        if (gloss_type == UNPROVIDED) {
            gloss_type = NIL;
        }
        {
            SubLObject collections = list_utilities.find_all_if(symbol_function($sym118$ISA_COLLECTION_), terms, UNPROVIDED);
            SubLObject relations = list_utilities.find_all_if(symbol_function($sym119$ISA_RELATION_), terms, UNPROVIDED);
            SubLObject assertions = sort_terms(list_utilities.find_all_if(symbol_function(ASSERTION_P), terms, UNPROVIDED), NIL, NIL, T, NIL, ASSERTION_CONS, UNPROVIDED);
            SubLObject individuals = list_utilities.ordered_set_difference(list_utilities.ordered_set_difference(list_utilities.ordered_set_difference(terms, collections, UNPROVIDED, UNPROVIDED), relations, UNPROVIDED, UNPROVIDED), assertions, UNPROVIDED, UNPROVIDED);
            if (gloss_type == NONE) {
                com.cyc.cycjava.cycl.cb_frames.cb_display_term_section_sans_gloss(collections, relations, assertions, individuals);
            } else {
                com.cyc.cycjava.cycl.cb_frames.cb_display_term_section_with_gloss(collections, relations, assertions, individuals, gloss_type);
            }
        }
        return NIL;
    }

    public static SubLObject cb_display_term_section(final SubLObject terms, SubLObject gloss_type) {
        if (gloss_type == UNPROVIDED) {
            gloss_type = NIL;
        }
        final SubLObject collections = list_utilities.find_all_if(symbol_function($sym128$ISA_COLLECTION_), terms, UNPROVIDED);
        final SubLObject relations = list_utilities.find_all_if(symbol_function($sym129$ISA_RELATION_), terms, UNPROVIDED);
        final SubLObject assertions = kb_utilities.sort_terms(list_utilities.find_all_if(symbol_function(ASSERTION_P), terms, UNPROVIDED), NIL, NIL, T, NIL, ASSERTION_CONS, UNPROVIDED);
        final SubLObject individuals = list_utilities.ordered_set_difference(list_utilities.ordered_set_difference(list_utilities.ordered_set_difference(terms, collections, UNPROVIDED, UNPROVIDED), relations, UNPROVIDED, UNPROVIDED), assertions, UNPROVIDED, UNPROVIDED);
        if (gloss_type == NONE) {
            cb_display_term_section_sans_gloss(collections, relations, assertions, individuals);
        } else {
            cb_display_term_section_with_gloss(collections, relations, assertions, individuals, gloss_type);
        }
        return NIL;
    }

    public static final SubLObject cb_display_term_section_with_gloss_alt(SubLObject collections, SubLObject relations, SubLObject assertions, SubLObject individuals, SubLObject gloss_type) {
        if (NIL != collections) {
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_princ($$$Collections);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_hr(UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = collections;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.cb_frames.cb_display_term_choice(v_term, gloss_type);
                }
            }
        }
        if (NIL != relations) {
            if (NIL != collections) {
                html_newline(TWO_INTEGER);
            }
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_princ($$$Relations);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_hr(UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = relations;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.cb_frames.cb_display_term_choice(v_term, gloss_type);
                }
            }
        }
        if (NIL != individuals) {
            if ((NIL != collections) || (NIL != relations)) {
                html_newline(TWO_INTEGER);
            }
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_princ($$$Individuals);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_hr(UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = individuals;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.cb_frames.cb_display_term_choice(v_term, gloss_type);
                }
            }
        }
        if (NIL != assertions) {
            if (((NIL != collections) || (NIL != relations)) || (NIL != individuals)) {
                html_newline(TWO_INTEGER);
            }
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_princ($$$Assertions);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_hr(UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = assertions;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.cb_frames.cb_display_term_choice(v_term, gloss_type);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_display_term_section_with_gloss(final SubLObject collections, final SubLObject relations, final SubLObject assertions, final SubLObject individuals, final SubLObject gloss_type) {
        if (NIL != collections) {
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_princ($$$Collections);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_hr(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = collections;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_display_term_choice(v_term, gloss_type);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        if (NIL != relations) {
            if (NIL != collections) {
                html_newline(TWO_INTEGER);
            }
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_princ($$$Relations);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_hr(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = relations;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_display_term_choice(v_term, gloss_type);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        if (NIL != individuals) {
            if ((NIL != collections) || (NIL != relations)) {
                html_newline(TWO_INTEGER);
            }
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_princ($$$Individuals);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_hr(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = individuals;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_display_term_choice(v_term, gloss_type);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        if (NIL != assertions) {
            if (((NIL != collections) || (NIL != relations)) || (NIL != individuals)) {
                html_newline(TWO_INTEGER);
            }
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_princ($$$Assertions);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_hr(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = assertions;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_display_term_choice(v_term, gloss_type);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject cb_display_term_section_sans_gloss_alt(SubLObject collections, SubLObject relations, SubLObject assertions, SubLObject individuals) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != collections) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_princ($$$Collections);
                                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = collections;
                                            SubLObject v_term = NIL;
                                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                com.cyc.cycjava.cycl.cb_frames.cb_display_term_choice(v_term, UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_glyph($NBSP, FOUR_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            if (NIL != relations) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_princ($$$Relations);
                                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = relations;
                                            SubLObject v_term = NIL;
                                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                com.cyc.cycjava.cycl.cb_frames.cb_display_term_choice(v_term, UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_glyph($NBSP, FOUR_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            if (NIL != individuals) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_princ($$$Individuals);
                                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = individuals;
                                            SubLObject v_term = NIL;
                                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                com.cyc.cycjava.cycl.cb_frames.cb_display_term_choice(v_term, UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    if (NIL != assertions) {
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(THREE_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (((NIL != collections) || (NIL != relations)) || (NIL != individuals)) {
                                            html_newline(TWO_INTEGER);
                                        }
                                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_princ($$$Assertions);
                                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = assertions;
                                            SubLObject v_term = NIL;
                                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                com.cyc.cycjava.cycl.cb_frames.cb_display_term_choice(v_term, UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_display_term_section_sans_gloss(final SubLObject collections, final SubLObject relations, final SubLObject assertions, final SubLObject individuals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                if (NIL != collections) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($$$Collections);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = collections;
                        SubLObject v_term = NIL;
                        v_term = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cb_display_term_choice(v_term, UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_term = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_glyph($NBSP, FOUR_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                if (NIL != relations) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($$$Relations);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = relations;
                        SubLObject v_term = NIL;
                        v_term = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cb_display_term_choice(v_term, UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_term = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_glyph($NBSP, FOUR_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                if (NIL != individuals) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($$$Individuals);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = individuals;
                        SubLObject v_term = NIL;
                        v_term = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cb_display_term_choice(v_term, UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_term = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (NIL != assertions) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (((NIL != collections) || (NIL != relations)) || (NIL != individuals)) {
                            html_newline(TWO_INTEGER);
                        }
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($$$Assertions);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = assertions;
                        SubLObject v_term = NIL;
                        v_term = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cb_display_term_choice(v_term, UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_term = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_display_term_choice_alt(SubLObject v_term, SubLObject gloss_type) {
        if (gloss_type == UNPROVIDED) {
            gloss_type = NONE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gloss = (gloss_type == NONE) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.cb_frames.compute_gloss_for_term_to_display(v_term, gloss_type);
                if (gloss_type == NONE) {
                    cb_form(v_term, NIL, T);
                    html_newline(UNPROVIDED);
                } else {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            cb_form(v_term, NIL, T);
                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                            html_princ($str_alt125$__);
                                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    if (NIL != gloss) {
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(gloss);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
            }
            return T;
        }
    }

    public static SubLObject cb_display_term_choice(final SubLObject v_term, SubLObject gloss_type) {
        if (gloss_type == UNPROVIDED) {
            gloss_type = NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gloss = (gloss_type == NONE) ? NIL : compute_gloss_for_term_to_display(v_term, gloss_type);
        if (gloss_type == NONE) {
            cb_form(v_term, NIL, T);
            html_newline(UNPROVIDED);
        } else {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        cb_form(v_term, NIL, T);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        html_princ($str135$__);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (NIL != gloss) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(gloss);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return T;
    }

    public static final SubLObject compute_gloss_for_term_to_display_alt(SubLObject v_term, SubLObject gloss_type) {
        {
            SubLObject gloss = (gloss_type == ENGLISH) ? ((SubLObject) (com.cyc.cycjava.cycl.cb_frames.compute_gloss_for_term_to_display_english(v_term))) : com.cyc.cycjava.cycl.cb_frames.compute_gloss_for_term_to_display_cycl(v_term);
            return gloss;
        }
    }

    public static SubLObject compute_gloss_for_term_to_display(final SubLObject v_term, final SubLObject gloss_type) {
        final SubLObject gloss = (gloss_type == ENGLISH) ? compute_gloss_for_term_to_display_english(v_term) : compute_gloss_for_term_to_display_cycl(v_term);
        return gloss;
    }

    public static final SubLObject compute_gloss_for_term_to_display_english_internal_alt(SubLObject v_term) {
        {
            SubLObject clarifying_sentences = rkf_concept_clarifier.rkf_clarifying_sentences(v_term, $$EverythingPSC, $compute_gloss_max_clarifying_sentences$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            return rkf_concept_communicator.rkf_html_summary_sentence(v_term, clarifying_sentences, $$EnglishParaphraseMt, $$EverythingPSC);
        }
    }

    public static SubLObject compute_gloss_for_term_to_display_english_internal(final SubLObject v_term) {
        final SubLObject clarifying_sentences = rkf_concept_clarifier.rkf_clarifying_sentences(v_term, $$EverythingPSC, $compute_gloss_max_clarifying_sentences$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        return rkf_concept_communicator.rkf_html_summary_sentence(v_term, clarifying_sentences, $$EnglishParaphraseMt, $$EverythingPSC);
    }

    public static final SubLObject compute_gloss_for_term_to_display_english_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.cb_frames.compute_gloss_for_term_to_display_english_internal(v_term);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH, ONE_INTEGER, $int$10000, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw132$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw132$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.cb_frames.compute_gloss_for_term_to_display_english_internal(v_term)));
                        memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject compute_gloss_for_term_to_display_english(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return compute_gloss_for_term_to_display_english_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH, ONE_INTEGER, $int$10000, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(compute_gloss_for_term_to_display_english_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject compute_gloss_for_term_to_display_cycl_internal_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject clarifying_sentences = rkf_concept_clarifier.rkf_clarifying_sentences(v_term, $$EverythingPSC, $compute_gloss_max_clarifying_sentences$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                SubLObject html = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_stream$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        html_macros.$html_stream$.bind(NIL, thread);
                        try {
                            html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($TOP));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject cdolist_list_var = clarifying_sentences;
                                                        SubLObject clarifying_sentence = NIL;
                                                        for (clarifying_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clarifying_sentence = cdolist_list_var.first()) {
                                                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                            {
                                                                SubLObject assertion = czer_meta.find_assertions_cycl(clarifying_sentence, UNPROVIDED);
                                                                if (NIL != assertion) {
                                                                    cb_form(assertion.first(), UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    cb_form(clarifying_sentence, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                                            html_newline(UNPROVIDED);
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                        } finally {
                            {
                                SubLObject _prev_bind_0_62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_62, thread);
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_stream$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return html;
            }
        }
    }

    public static SubLObject compute_gloss_for_term_to_display_cycl_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject clarifying_sentences = rkf_concept_clarifier.rkf_clarifying_sentences(v_term, $$EverythingPSC, $compute_gloss_max_clarifying_sentences$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        SubLObject html = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_stream$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            html_macros.$html_stream$.bind(NIL, thread);
            try {
                html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var = clarifying_sentences;
                            SubLObject clarifying_sentence = NIL;
                            clarifying_sentence = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                final SubLObject assertion = czer_meta.find_assertions_cycl(clarifying_sentence, UNPROVIDED);
                                if (NIL != assertion) {
                                    cb_form(assertion.first(), UNPROVIDED, UNPROVIDED);
                                } else {
                                    cb_form(clarifying_sentence, UNPROVIDED, UNPROVIDED);
                                }
                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                clarifying_sentence = cdolist_list_var.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
            } finally {
                final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                }
            }
        } finally {
            html_macros.$html_stream$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return html;
    }

    public static final SubLObject compute_gloss_for_term_to_display_cycl_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.cb_frames.compute_gloss_for_term_to_display_cycl_internal(v_term);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL, ONE_INTEGER, $int$10000, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw132$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw132$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.cb_frames.compute_gloss_for_term_to_display_cycl_internal(v_term)));
                        memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject compute_gloss_for_term_to_display_cycl(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return compute_gloss_for_term_to_display_cycl_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL, ONE_INTEGER, $int$10000, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(compute_gloss_for_term_to_display_cycl_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @param STRING;
     * 		a stringp submitted as a query to the KB browser
     * @return BOOLEAN; T if the string conforms to the specialized
    query syntax of the search box, NIL otherwise.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param STRING;\r\n\t\ta stringp submitted as a query to the KB browser\r\n@return BOOLEAN; T if the string conforms to the specialized\r\nquery syntax of the search box, NIL otherwise.\r\n@unknown bertolo")
    public static final SubLObject reserved_browser_string_p_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        if (NIL != string_utilities.starts_with(string, $str_alt135$a_)) {
            return T;
        }
        if (NIL != string_utilities.starts_with(string, $str_alt136$d_)) {
            return T;
        }
        if (NIL != string_utilities.starts_with(string, $str_alt137$c_)) {
            return T;
        }
        if (NIL != string_utilities.starts_with(string, $str_alt138$n_)) {
            return T;
        }
        if (NIL != com.cyc.cycjava.cycl.cb_frames.reserved_wn_browser_string_p(string)) {
            return T;
        }
        if (NIL != string_utilities.string_starts_with_constant_reader_prefix_p(string)) {
            return T;
        }
        if ((NIL != string_utilities.starts_with(string, $str_alt139$_G_)) && (NIL != string_utilities.ends_with(string, $str_alt93$_, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @param STRING;
     * 		a stringp submitted as a query to the KB browser
     * @return BOOLEAN; T if the string conforms to the specialized
    query syntax of the search box, NIL otherwise.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param STRING;\r\n\t\ta stringp submitted as a query to the KB browser\r\n@return BOOLEAN; T if the string conforms to the specialized\r\nquery syntax of the search box, NIL otherwise.\r\n@unknown bertolo")
    public static SubLObject reserved_browser_string_p(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if (NIL != string_utilities.starts_with(string, $$$a_)) {
            return T;
        }
        if (NIL != string_utilities.starts_with(string, $$$d_)) {
            return T;
        }
        if (NIL != string_utilities.starts_with(string, $$$c_)) {
            return T;
        }
        if (NIL != string_utilities.starts_with(string, $$$n_)) {
            return T;
        }
        if (NIL != reserved_wn_browser_string_p(string)) {
            return T;
        }
        if (NIL != string_utilities.string_starts_with_constant_reader_prefix_p(string)) {
            return T;
        }
        if ((NIL != string_utilities.starts_with(string, $str148$_G_)) && (NIL != string_utilities.ends_with(string, $str102$_, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    /**
     * Returns T iff the STRING begins with the WordNet query specification.
     *
     * @param string-p
     * 		; a submitted as a query to the KB browser
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff the STRING begins with the WordNet query specification.\r\n\r\n@param string-p\r\n\t\t; a submitted as a query to the KB browser\r\n@return booleanp")
    public static final SubLObject reserved_wn_browser_string_p_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        return string_utilities.starts_with(string, $str_alt92$wn_);
    }

    /**
     * Returns T iff the STRING begins with the WordNet query specification.
     *
     * @param string-p
     * 		; a submitted as a query to the KB browser
     * @return booleanp
     */
    @LispMethod(comment = "Returns T iff the STRING begins with the WordNet query specification.\r\n\r\n@param string-p\r\n\t\t; a submitted as a query to the KB browser\r\n@return booleanp")
    public static SubLObject reserved_wn_browser_string_p(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        return string_utilities.starts_with(string, $$$wn_);
    }/**
     * Returns T iff the STRING begins with the WordNet query specification.
     *
     * @param string-p
     * 		; a submitted as a query to the KB browser
     * @return booleanp
     */


    /**
     * Match STRING to a list of Cyc constants.
     *
     * @param STRING
    string
     * 		
     * @return 0 list ;; list of forts
     * @return 1 string ;; error string if STRING is bad
     */
    @LispMethod(comment = "Match STRING to a list of Cyc constants.\r\n\r\n@param STRING\nstring\r\n\t\t\r\n@return 0 list ;; list of forts\r\n@return 1 string ;; error string if STRING is bad")
    public static final SubLObject terms_for_browsing_alt(SubLObject string, SubLObject case_insensitiveP, SubLObject return_nautsP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = T;
        }
        if (return_nautsP == UNPROVIDED) {
            return_nautsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            string = string_utilities.trim_whitespace(string);
            case_insensitiveP = list_utilities.sublisp_boolean(case_insensitiveP);
            if (length(string).numE(ZERO_INTEGER)) {
                return values(NIL, $str_alt140$Empty_string_results_in_no_consta);
            }
            if (NIL != string_utilities.starts_with(string, $str_alt92$wn_)) {
                return values(NIL, NIL);
            }
            if (NIL != string_utilities.starts_with(string, $str_alt135$a_)) {
                {
                    SubLObject assertion = com.cyc.cycjava.cycl.cb_frames.assertion_via_id_spec(string);
                    if (NIL != assertion) {
                        return values(assertion, NIL);
                    }
                }
            }
            if (NIL != string_utilities.starts_with(string, $str_alt136$d_)) {
                return values(com.cyc.cycjava.cycl.cb_frames.deduction_via_id_spec(string), NIL);
            }
            if (NIL != string_utilities.starts_with(string, $str_alt137$c_)) {
                return values(com.cyc.cycjava.cycl.cb_frames.constant_via_id_spec(string), NIL);
            }
            if (NIL != string_utilities.starts_with(string, $str_alt138$n_)) {
                return values(com.cyc.cycjava.cycl.cb_frames.nart_via_id_spec(string), NIL);
            }
            if (NIL != $cb_lucky_term_searchP$.getDynamicValue(thread)) {
                if (NIL != constant_completion_high.valid_constant_name_p(string)) {
                    {
                        SubLObject constants = constant_completion_high.constant_complete(string, sublisp_null(case_insensitiveP), T, UNPROVIDED, UNPROVIDED);
                        if (NIL != list_utilities.singletonP(constants)) {
                            return values(constants, NIL);
                        }
                    }
                }
            }
            if (NIL != string_utilities.string_starts_with_constant_reader_prefix_p(string)) {
                return values(com.cyc.cycjava.cycl.cb_frames.constant_via_exact_name_spec(string), NIL);
            }
            {
                SubLObject constants_via_guid = com.cyc.cycjava.cycl.cb_frames.constant_via_external_id_spec(string);
                if (NIL != constants_via_guid) {
                    return values(constants_via_guid, NIL);
                }
            }
            if (NIL != string_utilities.starts_with(string, $str_alt141$_)) {
                if (NIL != return_nautsP) {
                    return values(com.cyc.cycjava.cycl.cb_frames.nat_via_open_paren_spec(string), NIL);
                } else {
                    return values(com.cyc.cycjava.cycl.cb_frames.nart_via_open_paren_spec(string), NIL);
                }
            }
            {
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                if (NIL != compact_hl_external_id_string_p(string)) {
                                    {
                                        SubLObject v_term = find_object_by_compact_hl_external_id_string(string);
                                        if ((NIL != com.cyc.cycjava.cycl.cb_frames.term_ok_for_browsingP(v_term)) && string.equal(compact_hl_external_id_string(v_term))) {
                                            return values(list(v_term), NIL);
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
            {
                SubLObject result = NIL;
                if ((NIL != string_utilities.starts_with(string, $str_alt145$_)) && (NIL == string_utilities.ends_with(string, $str_alt146$__, UNPROVIDED))) {
                    if (NIL != string_utilities.ends_with(string, $str_alt145$_, UNPROVIDED)) {
                        if (length(string).numLE(FOUR_INTEGER)) {
                            return values(NIL, $str_alt147$Cannot_handle_pattern___string___);
                        } else {
                            result = com.cyc.cycjava.cycl.cb_frames.constant_via_star_apropos(string, case_insensitiveP);
                        }
                    } else {
                        if (length(string).numLE(THREE_INTEGER)) {
                            return values(NIL, $str_alt148$Cannot_handle_pattern___string__i);
                        } else {
                            result = com.cyc.cycjava.cycl.cb_frames.constant_via_star_postfix(string, case_insensitiveP);
                        }
                    }
                } else {
                    if ((NIL != string_utilities.ends_with(string, $str_alt145$_, UNPROVIDED)) && (NIL == string_utilities.ends_with(string, $str_alt146$__, UNPROVIDED))) {
                        if (length(string).numLE(TWO_INTEGER)) {
                            return values(NIL, $str_alt149$Cannot_handle_pattern__string___i);
                        } else {
                            result = com.cyc.cycjava.cycl.cb_frames.constant_via_star_completion(string, case_insensitiveP);
                        }
                    } else {
                        if (NIL != string_utilities.quoted_stringP(string)) {
                            {
                                SubLObject unquoted = string_utilities.unquote_string(string);
                                result = com.cyc.cycjava.cycl.cb_frames.terms_via_lexicon(unquoted, T);
                                if (NIL != indexed_term_p(unquoted)) {
                                    result = cconcatenate(result, com.cyc.cycjava.cycl.cb_frames.assertions_for_string(unquoted));
                                }
                            }
                        } else {
                            result = com.cyc.cycjava.cycl.cb_frames.terms_via_dwimming(string, case_insensitiveP);
                        }
                    }
                }
                result = union(result, wordnet.wn_direct_denots_of_string(string, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                result = list_utilities.delete_if_not(symbol_function($sym150$TERM_OK_FOR_BROWSING_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                result = sort_terms(result, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return values(result, NIL);
            }
        }
    }

    /**
     * Match STRING to a list of Cyc constants.
     *
     * @param STRING
    		string
     * 		
     * @return 0 list ;; list of forts
     * @return 1 string ;; error string if STRING is bad
     */
    @LispMethod(comment = "Match STRING to a list of Cyc constants.\r\n\r\n@param STRING\n\t\tstring\r\n\t\t\r\n@return 0 list ;; list of forts\r\n@return 1 string ;; error string if STRING is bad")
    public static SubLObject terms_for_browsing(SubLObject string, SubLObject case_insensitiveP, SubLObject return_nautsP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = T;
        }
        if (return_nautsP == UNPROVIDED) {
            return_nautsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if (NIL != web_utilities.$decode_urls_during_http_read_request$.getGlobalValue()) {
            string = unicode_strings.html_escaped_to_utf8_string(string);
        }
        string = string_utilities.trim_whitespace(string);
        case_insensitiveP = list_utilities.sublisp_boolean(case_insensitiveP);
        if (length(string).numE(ZERO_INTEGER)) {
            return values(NIL, $str149$Empty_string_results_in_no_consta);
        }
        if (NIL != string_utilities.starts_with(string, $$$wn_)) {
            return values(NIL, NIL);
        }
        if ((NIL != $cb_lucky_term_searchP$.getDynamicValue(thread)) && (NIL != constant_completion_high.valid_constant_name_p(string))) {
            final SubLObject constants = constant_completion_high.constant_complete(string, sublisp_null(case_insensitiveP), T, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.singletonP(constants)) {
                return values(constants, NIL);
            }
        }
        if ((NIL != string_utilities.string_starts_with_constant_reader_prefix_p(string)) && (NIL != constant_via_exact_name_spec(string))) {
            return values(constant_via_exact_name_spec(string), NIL);
        }
        final SubLObject constants_via_guid = constant_via_external_id_spec(string);
        if (NIL != constants_via_guid) {
            return values(constants_via_guid, NIL);
        }
        if (NIL != string_utilities.starts_with(string, $str150$_)) {
            final SubLObject asserts = asserts_via_open_paren_spec(string);
            if (NIL != asserts) {
                return values(asserts, NIL);
            }
        }
        if ((NIL == string_utilities.starts_with(string, $str150$_)) && (NIL == string_utilities.starts_with(string, $str151$___))) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        if (NIL != kb_utilities.compact_hl_external_id_string_p(string)) {
                            final SubLObject v_term = kb_utilities.find_object_by_compact_hl_external_id_string(string);
                            if ((NIL != term_ok_for_browsingP(v_term)) && string.equal(kb_utilities.compact_hl_external_id_string(v_term))) {
                                return values(list(v_term), NIL);
                            }
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
            SubLObject result = NIL;
            string = string_utilities.string_subst($str25$, $str155$__, string, UNPROVIDED);
            if ((NIL != string_utilities.starts_with(string, $str156$_)) && (NIL == string_utilities.ends_with(string, $str157$__, UNPROVIDED))) {
                if (NIL != string_utilities.ends_with(string, $str156$_, UNPROVIDED)) {
                    if (length(string).numLE(FOUR_INTEGER)) {
                        return values(NIL, $str158$Cannot_handle_pattern___string___);
                    }
                    result = constant_via_star_apropos(string, case_insensitiveP);
                } else {
                    if (length(string).numLE(THREE_INTEGER)) {
                        return values(NIL, $str159$Cannot_handle_pattern___string__i);
                    }
                    result = constant_via_star_postfix(string, case_insensitiveP);
                }
            } else
                if ((NIL != string_utilities.ends_with(string, $str156$_, UNPROVIDED)) && (NIL == string_utilities.ends_with(string, $str157$__, UNPROVIDED))) {
                    if (length(string).numLE(TWO_INTEGER)) {
                        return values(NIL, $str160$Cannot_handle_pattern__string___i);
                    }
                    result = constant_via_star_completion(string, case_insensitiveP);
                } else
                    if (NIL != string_utilities.quoted_stringP(string)) {
                        final SubLObject unquoted = string_utilities.unquote_string(string);
                        result = terms_via_lexicon(unquoted, T);
                        if (NIL != indexed_term_p(unquoted)) {
                            result = cconcatenate(result, assertions_for_string(unquoted));
                        }
                    } else {
                        result = terms_via_dwimming(string, case_insensitiveP);
                    }


            result = union(result, wordnet.wn_direct_denots_of_string(string, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            result = list_utilities.delete_if_not(symbol_function($sym161$TERM_OK_FOR_BROWSING_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            result = kb_utilities.sort_terms(result, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return values(result, NIL);
        }
        if (NIL != return_nautsP) {
            return values(nat_via_open_paren_spec(string), NIL);
        }
        return values(nart_via_open_paren_spec(string), NIL);
    }/**
     * Match STRING to a list of Cyc constants.
     *
     * @param STRING
    		string
     * 		
     * @return 0 list ;; list of forts
     * @return 1 string ;; error string if STRING is bad
     */


    public static final SubLObject related_cyc_terms_for_browsing_alt(SubLObject string, SubLObject terms_already_found, SubLObject limit) {
        if (terms_already_found == UNPROVIDED) {
            terms_already_found = NIL;
        }
        if (limit == UNPROVIDED) {
            limit = $int$100;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ir_terms = (NIL != $use_cyc_ir_terms_for_browsingP$.getDynamicValue(thread)) ? ((SubLObject) (com.cyc.cycjava.cycl.cb_frames.cyc_ir_terms_for_browsing(string, terms_already_found, limit))) : NIL;
                SubLObject total_count = length(ir_terms);
                SubLObject subword_terms = NIL;
                SubLObject total_subword_count = NIL;
                SubLObject err = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                thread.resetMultipleValues();
                                {
                                    SubLObject subword_terms_63 = com.cyc.cycjava.cycl.cb_frames.cyc_substring_terms_for_browsing(string, cconcatenate(ir_terms, terms_already_found), limit);
                                    SubLObject total_subword_count_64 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    subword_terms = subword_terms_63;
                                    total_subword_count = total_subword_count_64;
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    err = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != err) {
                    Errors.warn($str_alt152$Unable_to_access_subword_index___, err);
                }
                if (NIL != total_subword_count) {
                    total_count = add(total_count, total_subword_count);
                } else {
                    total_count = NIL;
                }
                return values(list_utilities.delete_if_not(symbol_function($sym150$TERM_OK_FOR_BROWSING_), delete_duplicates(cconcatenate(ir_terms, subword_terms), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), total_count);
            }
        }
    }

    public static SubLObject related_cyc_terms_for_browsing(final SubLObject string, SubLObject terms_already_found, SubLObject limit) {
        if (terms_already_found == UNPROVIDED) {
            terms_already_found = NIL;
        }
        if (limit == UNPROVIDED) {
            limit = $int$100;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ir_terms = (NIL != $use_cyc_ir_terms_for_browsingP$.getDynamicValue(thread)) ? cyc_ir_terms_for_browsing(string, terms_already_found, limit) : NIL;
        SubLObject total_count = length(ir_terms);
        SubLObject subword_terms = NIL;
        SubLObject total_subword_count = NIL;
        SubLObject err = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject subword_terms_$73 = cyc_substring_terms_for_browsing(string, cconcatenate(ir_terms, terms_already_found), limit);
                    final SubLObject total_subword_count_$74 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    subword_terms = subword_terms_$73;
                    total_subword_count = total_subword_count_$74;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != err) {
            Errors.warn($str163$Unable_to_access_subword_index___, err);
        }
        if (NIL != total_subword_count) {
            total_count = add(total_count, total_subword_count);
        } else {
            total_count = NIL;
        }
        return values(list_utilities.delete_if_not(symbol_function($sym161$TERM_OK_FOR_BROWSING_), delete_duplicates(cconcatenate(ir_terms, subword_terms), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), total_count);
    }

    public static final SubLObject cyc_substring_terms_for_browsing_alt(SubLObject string, SubLObject terms_already_found, SubLObject fail_if_more_than) {
        if (fail_if_more_than == UNPROVIDED) {
            fail_if_more_than = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subword_terms = NIL;
                SubLObject total_subword_count = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject subword_terms_65 = lexicon_subword_index.denots_of_nl_trie_subword_index_search(string, fail_if_more_than);
                    SubLObject total_subword_count_66 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    subword_terms = subword_terms_65;
                    total_subword_count = total_subword_count_66;
                }
                return values(set_difference(subword_terms, terms_already_found, EQUAL, UNPROVIDED), total_subword_count);
            }
        }
    }

    public static SubLObject cyc_substring_terms_for_browsing(final SubLObject string, final SubLObject terms_already_found, SubLObject fail_if_more_than) {
        if (fail_if_more_than == UNPROVIDED) {
            fail_if_more_than = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subword_terms = NIL;
        SubLObject total_subword_count = NIL;
        thread.resetMultipleValues();
        final SubLObject subword_terms_$75 = lexicon_subword_index.denots_of_nl_trie_subword_index_search(string, fail_if_more_than, UNPROVIDED);
        final SubLObject total_subword_count_$76 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        subword_terms = subword_terms_$75;
        total_subword_count = total_subword_count_$76;
        return values(set_difference(subword_terms, terms_already_found, EQUAL, UNPROVIDED), total_subword_count);
    }

    public static final SubLObject cyc_ir_terms_for_browsing_alt(SubLObject string, SubLObject terms_already_found, SubLObject limit) {
        if (terms_already_found == UNPROVIDED) {
            terms_already_found = NIL;
        }
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject total_count = NIL;
            if (NIL != valid_constantP($$wordIndexesCycTerm, UNPROVIDED)) {
                {
                    SubLObject variable = $sym154$_TERM;
                    SubLObject query = list($$wordIndexesCycTerm, string, variable);
                    SubLObject hits = backward.removal_ask_variable(variable, query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = hits;
                    SubLObject hit = NIL;
                    for (hit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hit = cdolist_list_var.first()) {
                        if (!(((NIL != subl_promotions.memberP(hit, terms_already_found, UNPROVIDED, UNPROVIDED)) || (NIL != invalid_constantP(hit, UNPROVIDED))) || (NIL != invalid_nartP(hit, UNPROVIDED)))) {
                            result = cons(hit, result);
                        }
                    }
                }
            }
            result = nreverse(result);
            total_count = length(result);
            if (limit.isInteger() && (NIL != list_utilities.lengthG(result, limit, UNPROVIDED))) {
                result = list_utilities.first_n(limit, result);
            }
            return values(result, total_count);
        }
    }

    public static SubLObject cyc_ir_terms_for_browsing(final SubLObject string, SubLObject terms_already_found, SubLObject limit) {
        if (terms_already_found == UNPROVIDED) {
            terms_already_found = NIL;
        }
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        SubLObject result = NIL;
        SubLObject total_count = NIL;
        result = nreverse(result);
        total_count = length(result);
        if (limit.isInteger() && (NIL != list_utilities.lengthG(result, limit, UNPROVIDED))) {
            result = list_utilities.first_n(limit, result);
        }
        return values(result, total_count);
    }

    public static final SubLObject term_ok_for_browsingP_alt(SubLObject v_term) {
        return list_utilities.sublisp_boolean(cb_term_identifier(v_term));
    }

    public static SubLObject term_ok_for_browsingP(final SubLObject v_term) {
        return list_utilities.sublisp_boolean(cb_term_identifier(v_term));
    }

    public static SubLObject asserts_via_open_paren_spec(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject sentence = ke_utilities.cycl_from_string(string);
            final SubLObject assertions = czer_meta.find_assertions_cycl(sentence, UNPROVIDED);
            return assertions;
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject nart_via_open_paren_spec_alt(SubLObject string) {
        {
            SubLObject v_term = nat_from_string(string);
            if (NIL != nart_handles.nart_p(v_term)) {
                return list(v_term);
            }
        }
        return NIL;
    }

    public static SubLObject nart_via_open_paren_spec(final SubLObject string) {
        final SubLObject v_term = ke_utilities.nat_from_string(string);
        if (NIL != nart_handles.nart_p(v_term)) {
            return list(v_term);
        }
        return NIL;
    }

    public static final SubLObject nat_via_open_paren_spec_alt(SubLObject string) {
        {
            SubLObject v_term = nat_from_string(string);
            if (NIL != v_term) {
                return list(v_term);
            }
        }
        return NIL;
    }

    public static SubLObject nat_via_open_paren_spec(final SubLObject string) {
        final SubLObject v_term = ke_utilities.nat_from_string(string);
        if (NIL != v_term) {
            return list(v_term);
        }
        return NIL;
    }

    /**
     *
     *
     * @return list ; CycL terms that STRING maps into, considering all LexicalMicrotheory's;
    when INCLUDE-WORD-UNITS? set, the lexical word units are also returned
     */
    @LispMethod(comment = "@return list ; CycL terms that STRING maps into, considering all LexicalMicrotheory\'s;\r\nwhen INCLUDE-WORD-UNITS? set, the lexical word units are also returned")
    public static final SubLObject terms_via_lexicon_alt(SubLObject string, SubLObject include_word_unitsP) {
        if (include_word_unitsP == UNPROVIDED) {
            include_word_unitsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != lexicon_initialized_p()) && string.isString()) {
                {
                    SubLObject ans = NIL;
                    SubLObject monad = $$AllLexicalMicrotheoryPSC;
                    SubLObject anytime = (NIL != valid_constantP(monad, UNPROVIDED)) ? ((SubLObject) (hlmt_czer.canonicalize_hlmt(hlmt.new_hlmt(list(monad, $$AnytimePSC))))) : NIL;
                    {
                        SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                        try {
                            lexicon_vars.$lexicon_lookup_mt$.bind(NIL != anytime ? ((SubLObject) (anytime)) : lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
                            ans = lexicon_accessors.most_denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != include_word_unitsP) {
                                ans = append(ans, lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            }
                        } finally {
                            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return ans;
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return list ; CycL terms that STRING maps into, considering all LexicalMicrotheory's;
    when INCLUDE-WORD-UNITS? set, the lexical word units are also returned
     */
    @LispMethod(comment = "@return list ; CycL terms that STRING maps into, considering all LexicalMicrotheory\'s;\r\nwhen INCLUDE-WORD-UNITS? set, the lexical word units are also returned")
    public static SubLObject terms_via_lexicon(final SubLObject string, SubLObject include_word_unitsP) {
        if (include_word_unitsP == UNPROVIDED) {
            include_word_unitsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != lexicon_initialized_p()) && string.isString()) {
            SubLObject ans = NIL;
            final SubLObject monad = $$AllLexicalMicrotheoryPSC;
            final SubLObject anytime = (NIL != valid_constantP(monad, UNPROVIDED)) ? hlmt_czer.canonicalize_hlmt(hlmt.new_hlmt(list(monad, $$AnytimePSC))) : NIL;
            final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
            try {
                lexicon_vars.$lexicon_lookup_mt$.bind(NIL != anytime ? anytime : lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
                ans = lexicon_accessors.most_denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != include_word_unitsP) {
                    ans = append(ans, lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            } finally {
                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        return NIL;
    }

    public static final SubLObject constant_via_exact_name_spec_alt(SubLObject string) {
        return constant_completion_high.constant_complete(string, T, T, TWO_INTEGER, UNPROVIDED);
    }

    public static SubLObject constant_via_exact_name_spec(final SubLObject string) {
        return constant_completion_high.constant_complete(string, T, T, TWO_INTEGER, UNPROVIDED);
    }

    public static final SubLObject constant_via_external_id_spec_alt(SubLObject string) {
        if ($int$40.numE(length(string))) {
            string = subseq(string, THREE_INTEGER, $int$39);
        }
        if ((NIL != list_utilities.lengthE(string, $int$36, UNPROVIDED)) && (NIL != Guids.guid_string_p(string))) {
            {
                SubLObject external_id = Guids.string_to_guid(string);
                if (NIL != external_id) {
                    return list(constants_high.find_constant_by_external_id(external_id));
                }
            }
        }
        return NIL;
    }

    public static SubLObject constant_via_external_id_spec(SubLObject string) {
        if ($int$40.numE(length(string))) {
            string = subseq(string, THREE_INTEGER, $int$39);
        }
        if ((NIL != list_utilities.lengthE(string, $int$36, UNPROVIDED)) && (NIL != Guids.guid_string_p(string))) {
            final SubLObject external_id = Guids.string_to_guid(string);
            if (NIL != external_id) {
                return list(constants_high.find_constant_by_external_id(external_id));
            }
        }
        return NIL;
    }

    public static final SubLObject constant_via_star_completion_alt(SubLObject string, SubLObject case_insensitiveP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = NIL;
        }
        return constant_completion_high.constant_complete(subseq(string, ZERO_INTEGER, subtract(length(string), ONE_INTEGER)), makeBoolean(NIL == case_insensitiveP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject constant_via_star_completion(final SubLObject string, SubLObject case_insensitiveP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = NIL;
        }
        return constant_completion_high.constant_complete(subseq(string, ZERO_INTEGER, subtract(length(string), ONE_INTEGER)), makeBoolean(NIL == case_insensitiveP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject constant_via_star_apropos_alt(SubLObject string, SubLObject case_insensitiveP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = NIL;
        }
        return constant_completion_high.constant_apropos(subseq(string, ONE_INTEGER, subtract(length(string), ONE_INTEGER)), makeBoolean(NIL == case_insensitiveP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject constant_via_star_apropos(final SubLObject string, SubLObject case_insensitiveP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = NIL;
        }
        return constant_completion_high.constant_apropos(subseq(string, ONE_INTEGER, subtract(length(string), ONE_INTEGER)), makeBoolean(NIL == case_insensitiveP), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject constant_via_star_postfix_alt(SubLObject string, SubLObject case_insensitiveP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = NIL;
        }
        return constant_completion_high.constant_postfix(subseq(string, ONE_INTEGER, length(string)), makeBoolean(NIL == case_insensitiveP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject constant_via_star_postfix(final SubLObject string, SubLObject case_insensitiveP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = NIL;
        }
        return constant_completion_high.constant_postfix(subseq(string, ONE_INTEGER, length(string)), makeBoolean(NIL == case_insensitiveP), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject terms_via_dwimming_alt(SubLObject string, SubLObject case_insensitive_grepP) {
        if (case_insensitive_grepP == UNPROVIDED) {
            case_insensitive_grepP = T;
        }
        {
            SubLObject exact = constant_completion_high.constant_complete(string, NIL, T, UNPROVIDED, UNPROVIDED);
            SubLObject former = ke.old_constant_names(string);
            SubLObject denotations = NIL;
            SubLObject intermed_results = NIL;
            denotations = com.cyc.cycjava.cycl.cb_frames.terms_via_lexicon(string, UNPROVIDED);
            intermed_results = delete_duplicates(append(exact, denotations, former), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == intermed_results) {
                intermed_results = com.cyc.cycjava.cycl.cb_frames.constants_via_grep(string, makeBoolean(NIL == case_insensitive_grepP));
            }
            if (NIL != indexed_term_p(string)) {
                intermed_results = cconcatenate(intermed_results, com.cyc.cycjava.cycl.cb_frames.assertions_for_string(string));
            }
            return intermed_results;
        }
    }

    public static SubLObject terms_via_dwimming(final SubLObject string, SubLObject case_insensitive_grepP) {
        if (case_insensitive_grepP == UNPROVIDED) {
            case_insensitive_grepP = T;
        }
        final SubLObject exact = constant_completion_high.constant_complete(string, NIL, T, UNPROVIDED, UNPROVIDED);
        final SubLObject former = ke.old_constant_names(string);
        SubLObject denotations = NIL;
        SubLObject intermed_results = NIL;
        if (NIL != kb_control_vars.lexicon_kb_loaded_p()) {
            denotations = terms_via_lexicon(string, UNPROVIDED);
        }
        intermed_results = delete_duplicates(append(exact, denotations, former), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != regular_expressions.is_regular_expressions_support_availableP()) && (NIL == intermed_results)) {
            intermed_results = constants_via_grep(string, makeBoolean(NIL == case_insensitive_grepP));
        }
        if (NIL != indexed_term_p(string)) {
            intermed_results = cconcatenate(intermed_results, assertions_for_string(string));
        }
        return intermed_results;
    }

    public static final SubLObject assertions_for_string_alt(SubLObject string) {
        return kb_mapping.gather_index_in_any_mt(string, T);
    }

    public static SubLObject assertions_for_string(final SubLObject string) {
        return kb_mapping.gather_index_in_any_mt(string, T);
    }

    /**
     * return list; a list of constants whose names match the regular expression NAME-GREP-STRING.
     * When CASE-SENSITIVE? is non-null, the GREP is done in a case-sensitive fashion.
     */
    @LispMethod(comment = "return list; a list of constants whose names match the regular expression NAME-GREP-STRING.\r\nWhen CASE-SENSITIVE? is non-null, the GREP is done in a case-sensitive fashion.\nreturn list; a list of constants whose names match the regular expression NAME-GREP-STRING.\nWhen CASE-SENSITIVE? is non-null, the GREP is done in a case-sensitive fashion.")
    public static final SubLObject constants_via_grep_alt(SubLObject grep_string, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        {
            SubLObject constant_grep_options = (NIL != case_sensitiveP) ? ((SubLObject) (NIL)) : $list_alt160;
            SubLObject result = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            result = constants_high.constant_grep(grep_string, constant_grep_options, UNPROVIDED);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            return result;
        }
    }

    /**
     * return list; a list of constants whose names match the regular expression NAME-GREP-STRING.
     * When CASE-SENSITIVE? is non-null, the GREP is done in a case-sensitive fashion.
     */
    @LispMethod(comment = "return list; a list of constants whose names match the regular expression NAME-GREP-STRING.\r\nWhen CASE-SENSITIVE? is non-null, the GREP is done in a case-sensitive fashion.\nreturn list; a list of constants whose names match the regular expression NAME-GREP-STRING.\nWhen CASE-SENSITIVE? is non-null, the GREP is done in a case-sensitive fashion.")
    public static SubLObject constants_via_grep(final SubLObject grep_string, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constant_grep_options = (NIL != case_sensitiveP) ? NIL : $list169;
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = constants_high.constant_grep(grep_string, constant_grep_options, UNPROVIDED);
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
        return result;
    }/**
     * return list; a list of constants whose names match the regular expression NAME-GREP-STRING.
     * When CASE-SENSITIVE? is non-null, the GREP is done in a case-sensitive fashion.
     */


    public static final SubLObject cb_main_frame_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (args.isCons()) {
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject indirect_handler = NIL;
                SubLObject indirect_args = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt161);
                indirect_handler = current.first();
                current = current.rest();
                indirect_args = current;
                if (indirect_handler.isString()) {
                    indirect_handler = Strings.string_upcase(indirect_handler, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject function_symbol = find_symbol(indirect_handler, UNPROVIDED);
                        if ((function_symbol.isSymbol() && (NIL != fboundp(function_symbol))) && (NIL != html_macros.html_handler_functionP(function_symbol))) {
                            return funcall(function_symbol, indirect_args);
                        }
                    }
                }
            }
        }
        cb_tools.cb_history_internal();
        return NIL;
    }

    public static SubLObject cb_main_frame(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (args.isCons()) {
            SubLObject current;
            final SubLObject datum = current = args;
            SubLObject indirect_handler = NIL;
            SubLObject indirect_args = NIL;
            destructuring_bind_must_consp(current, datum, $list170);
            indirect_handler = current.first();
            current = indirect_args = current.rest();
            if (indirect_handler.isString()) {
                indirect_handler = Strings.string_upcase(indirect_handler, UNPROVIDED, UNPROVIDED);
                final SubLObject function_symbol = find_symbol(indirect_handler, UNPROVIDED);
                if ((function_symbol.isSymbol() && (NIL != fboundp(function_symbol))) && (NIL != html_macros.html_handler_functionP(function_symbol))) {
                    return funcall(function_symbol, indirect_args);
                }
            }
        }
        cb_tools.cb_history(UNPROVIDED);
        return NIL;
    }

    /**
     * shorthand for CB-CONSTANT-FRAME
     */
    @LispMethod(comment = "shorthand for CB-CONSTANT-FRAME")
    public static final SubLObject cb_cf_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return com.cyc.cycjava.cycl.cb_frames.cb_term_frame_internal(args.first());
    }

    /**
     * shorthand for CB-CONSTANT-FRAME
     */
    @LispMethod(comment = "shorthand for CB-CONSTANT-FRAME")
    public static SubLObject cb_cf(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_term_frame_internal(args.first());
    }/**
     * shorthand for CB-CONSTANT-FRAME
     */


    public static final SubLObject cb_constant_frame_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return com.cyc.cycjava.cycl.cb_frames.cb_term_frame_internal(args.first());
    }

    public static SubLObject cb_constant_frame(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_term_frame_internal(args.first());
    }

    /**
     * shorthand for CB-NART-FRAME
     */
    @LispMethod(comment = "shorthand for CB-NART-FRAME")
    public static final SubLObject cb_nf_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return com.cyc.cycjava.cycl.cb_frames.cb_term_frame_internal(args.first());
    }

    /**
     * shorthand for CB-NART-FRAME
     */
    @LispMethod(comment = "shorthand for CB-NART-FRAME")
    public static SubLObject cb_nf(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_term_frame_internal(args.first());
    }/**
     * shorthand for CB-NART-FRAME
     */


    public static final SubLObject cb_nart_frame_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return com.cyc.cycjava.cycl.cb_frames.cb_term_frame_internal(args.first());
    }

    public static SubLObject cb_nart_frame(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_term_frame_internal(args.first());
    }

    public static final SubLObject cb_naut_frame_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return com.cyc.cycjava.cycl.cb_frames.cb_term_frame_internal(args.first());
    }

    public static SubLObject cb_naut_frame(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_term_frame_internal(args.first());
    }

    public static final SubLObject cb_term_frame_internal_alt(SubLObject term_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = cb_guess_term(term_spec, UNPROVIDED);
                if (NIL != v_term) {
                    if (NIL != nart_handles.nart_p(v_term)) {
                        cb_tools.cb_add_to_nat_history(v_term);
                    } else {
                        if (NIL != term.closed_nautP(v_term, UNPROVIDED)) {
                            if (NIL == nart_handles.nart_p(find_nart(v_term))) {
                                cb_tools.cb_add_to_nat_history(v_term);
                            }
                        } else {
                            cb_events.cb_post_constant_selection_event(v_term);
                            cb_tools.cb_add_to_constant_history(v_term);
                        }
                    }
                    {
                        SubLObject identifier = cb_term_identifier(v_term);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        if (NIL != html_macros.html_inside_body_p()) {
                            Errors.error($str_alt0$Cannot_have_a_FRAMESET_tag_inside);
                        }
                        html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                        if (true) {
                            html_markup(html_macros.$html_frameset_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str_alt168$30___);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_frame($INDEX, identifier, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                cb_frame($CONTENT, identifier, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    }
                } else {
                    cb_error($str_alt171$The_requested_term_is_not_availab, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_term_frame_internal(final SubLObject term_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cb_guess_term(term_spec, UNPROVIDED);
        if (NIL != v_term) {
            if (NIL != nart_handles.nart_p(v_term)) {
                cb_tools.cb_add_to_nat_history(v_term);
            } else
                if (NIL != term.closed_nautP(v_term, UNPROVIDED)) {
                    if (NIL == nart_handles.nart_p(narts_high.find_nart(v_term))) {
                        cb_tools.cb_add_to_nat_history(v_term);
                    }
                } else {
                    cb_events.cb_post_constant_selection_event(v_term);
                    cb_tools.cb_add_to_constant_history(v_term);
                }

            final SubLObject identifier = cb_term_identifier(v_term);
            html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str1$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                web_utilities.possibly_add_html_javascript_redirect_when_top_level_page();
                if (NIL != html_macros.html_inside_body_p()) {
                    Errors.error($str4$Cannot_have_a_FRAMESET_tag_inside);
                }
                html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                html_markup(html_macros.$html_frameset_cols$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str177$30___);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_frame($INDEX, identifier, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cb_frame($CONTENT, identifier, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                }
                html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } else {
            cb_error($str180$The_requested_term_is_not_availab, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_index_frame_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject index_hook = cb_guess_index(args);
                if (($LEGACY == $cb_default_index_view$.getDynamicValue(thread)) && (NIL != indexed_term_p(index_hook))) {
                    cb_browser.cb_c_index(index_hook);
                } else {
                    if (($INFERRED == $cb_default_index_view$.getDynamicValue(thread)) && (NIL != indexed_term_p(index_hook))) {
                        cb_inferred_index.cb_inferred_index(index_hook);
                    } else {
                        if (NIL != index_hook) {
                            cb_browser.cb_c_index(index_hook);
                        } else {
                            {
                                SubLObject naut = cb_guess_naut(args.first(), UNPROVIDED);
                                html_markup(html_macros.$html_html_head$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_naut_utilities.cb_naut_index(naut);
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_index_frame(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_hook = cb_guess_index(args);
        if (($LEGACY == $cb_default_index_view$.getDynamicValue(thread)) && (NIL != indexed_term_p(index_hook))) {
            cb_browser.cb_c_index(index_hook);
        } else
            if (($INFERRED == $cb_default_index_view$.getDynamicValue(thread)) && (NIL != indexed_term_p(index_hook))) {
                cb_inferred_index.cb_inferred_index(index_hook);
            } else
                if (NIL != index_hook) {
                    cb_browser.cb_c_index(index_hook);
                } else {
                    final SubLObject naut = cb_guess_naut(args.first(), UNPROVIDED);
                    html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str1$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        final SubLObject _prev_bind_0_$78 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_markup(html_macros.$html_body_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_naut_utilities.cb_naut_index(naut);
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$78, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                }


        return NIL;
    }

    public static final SubLObject cb_empty_index_frame_alt() {
        html_princ($$$No_Index);
        return NIL;
    }

    public static SubLObject cb_empty_index_frame() {
        html_princ($$$No_Index);
        return NIL;
    }

    public static final SubLObject cb_content_frame_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject index_hook = cb_guess_index(args);
            if ((NIL != forts.fort_p(index_hook)) || (NIL != auxiliary_indexing.auxiliary_index_p(index_hook))) {
                com.cyc.cycjava.cycl.cb_frames.cb_default_content_internal(index_hook);
            } else {
                {
                    SubLObject naut = cb_guess_naut(args.first(), UNPROVIDED);
                    com.cyc.cycjava.cycl.cb_frames.cb_default_content_internal(naut);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_content_frame(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject index_hook = cb_guess_index(args);
        if ((NIL != forts.fort_p(index_hook)) || (NIL != auxiliary_indexing.auxiliary_index_p(index_hook))) {
            cb_default_content_internal(index_hook);
        } else {
            final SubLObject naut = cb_guess_naut(args.first(), UNPROVIDED);
            cb_default_content_internal(naut);
        }
        return NIL;
    }

    public static final SubLObject cb_default_content_internal_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != term.closed_nautP(v_term, UNPROVIDED)) {
                return cb_naut_utilities.cb_default_naut_content_internal(v_term);
            }
            if ($LEXICAL == $cb_c_default_content$.getDynamicValue(thread)) {
                return cb_lexical_info.cb_c_lexical_internal(v_term, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject pcase_var = $cb_c_default_content$.getDynamicValue(thread);
                if (pcase_var.eql($NONE)) {
                    return com.cyc.cycjava.cycl.cb_frames.cb_empty_content_frame(v_term);
                } else {
                    if (pcase_var.eql($DEFINITIONAL)) {
                        return cb_browser.cb_c_definitional_internal(v_term);
                    } else {
                        if (pcase_var.eql($DOCUMENTATION)) {
                            return cb_browser.cb_c_documentation_internal(v_term);
                        } else {
                            if (pcase_var.eql($MAXIMAL)) {
                                return com.cyc.cycjava.cycl.cb_frames.cb_c_maximal_internal(v_term);
                            } else {
                                return cb_browser.cb_c_documentation_internal(v_term);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cb_default_content_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != term.closed_nautP(v_term, UNPROVIDED)) {
            return cb_naut_utilities.cb_default_naut_content_internal(v_term);
        }
        if ($LEXICAL == $cb_c_default_content$.getDynamicValue(thread)) {
            return cb_lexical_info.cb_c_lexical_internal(v_term, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject pcase_var = $cb_c_default_content$.getDynamicValue(thread);
        if (pcase_var.eql($NONE)) {
            return cb_empty_content_frame(v_term);
        }
        if (pcase_var.eql($DEFINITIONAL)) {
            return cb_browser.cb_c_definitional_internal(v_term);
        }
        if (pcase_var.eql($DOCUMENTATION)) {
            return cb_browser.cb_c_documentation_internal(v_term);
        }
        if (pcase_var.eql($MAXIMAL)) {
            return cb_c_maximal_internal(v_term);
        }
        return cb_browser.cb_c_documentation_internal(v_term);
    }

    public static final SubLObject cb_empty_content_frame_alt(SubLObject index_hook) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Index_Choose);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            com.cyc.cycjava.cycl.cb_frames.cb_empty_content_frame_internal(index_hook);
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                        }
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject cb_empty_content_frame(final SubLObject index_hook) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str1$_meta_http_equiv__X_UA_Compatible);
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
            html_princ($$$Index_Choose);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$80 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_empty_content_frame_internal(index_hook);
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$80, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_empty_content_frame_internal_alt(SubLObject index_hook) {
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str_alt184$Choose_an_item_from_the_index_);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_markup(html_macros.$html_center_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_empty_content_frame_internal(final SubLObject index_hook) {
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str193$Choose_an_item_from_the_index_);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_markup(html_macros.$html_center_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * Attempt to show the most about FORT that we can without exceeding the upper bound.
     */
    @LispMethod(comment = "Attempt to show the most about FORT that we can without exceeding the upper bound.")
    public static final SubLObject cb_c_maximal_internal_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == $cb_c_maximal_upper_bound$.getDynamicValue(thread)) || bookkeeping_store.total_num_assertions_on_term(fort).numL($cb_c_maximal_upper_bound$.getDynamicValue(thread))) {
                return cb_browser.cb_c_all_asserted_knowledge(list(fort));
            }
            if (kb_indexing.num_index(fort).numL($cb_c_maximal_upper_bound$.getDynamicValue(thread))) {
                return cb_browser.cb_c_total(list(fort));
            }
            {
                SubLObject pred_extent_count = (NIL != fort_types_interface.predicate_in_any_mtP(fort)) ? ((SubLObject) (kb_indexing.num_predicate_extent_index(fort, UNPROVIDED))) : ZERO_INTEGER;
                SubLObject func_extent_count = (NIL != fort_types_interface.function_in_any_mtP(fort)) ? ((SubLObject) (kb_indexing.num_function_extent_index(fort))) : ZERO_INTEGER;
                if ((pred_extent_count.numG(ZERO_INTEGER) || func_extent_count.numG(ZERO_INTEGER)) && add(kb_indexing.num_gaf_arg_index(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED), pred_extent_count, func_extent_count).numL($cb_c_maximal_upper_bound$.getDynamicValue(thread))) {
                    cb_browser.cb_c_gaf_arg_and_extent(list(fort));
                    return NIL;
                }
            }
            if (kb_indexing.num_gaf_arg_index(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED).numL($cb_c_maximal_upper_bound$.getDynamicValue(thread))) {
                return cb_browser.cb_c_gaf_arg(list(fort));
            }
            if (kb_indexing.num_gaf_arg_index(fort, ONE_INTEGER, UNPROVIDED, UNPROVIDED).numL($cb_c_maximal_upper_bound$.getDynamicValue(thread))) {
                return cb_browser.cb_c_gaf_arg(list(fort, $$$1));
            }
            return cb_browser.cb_c_definitional(list(fort));
        }
    }

    /**
     * Attempt to show the most about FORT that we can without exceeding the upper bound.
     */
    @LispMethod(comment = "Attempt to show the most about FORT that we can without exceeding the upper bound.")
    public static SubLObject cb_c_maximal_internal(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $cb_c_maximal_upper_bound$.getDynamicValue(thread)) || bookkeeping_store.total_num_assertions_on_term(fort).numL($cb_c_maximal_upper_bound$.getDynamicValue(thread))) {
            return cb_browser.cb_c_all_asserted_knowledge(list(fort));
        }
        if (kb_indexing.num_index(fort).numL($cb_c_maximal_upper_bound$.getDynamicValue(thread))) {
            return cb_browser.cb_c_total(list(fort));
        }
        final SubLObject pred_extent_count = (NIL != fort_types_interface.predicate_in_any_mtP(fort)) ? kb_indexing.num_predicate_extent_index(fort, UNPROVIDED) : ZERO_INTEGER;
        final SubLObject func_extent_count = (NIL != fort_types_interface.function_in_any_mtP(fort)) ? kb_indexing.num_function_extent_index(fort) : ZERO_INTEGER;
        if ((pred_extent_count.numG(ZERO_INTEGER) || func_extent_count.numG(ZERO_INTEGER)) && add(kb_indexing.num_gaf_arg_index(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED), pred_extent_count, func_extent_count).numL($cb_c_maximal_upper_bound$.getDynamicValue(thread))) {
            cb_browser.cb_c_gaf_arg_and_extent(list(fort));
            return NIL;
        }
        if (kb_indexing.num_gaf_arg_index(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED).numL($cb_c_maximal_upper_bound$.getDynamicValue(thread))) {
            return cb_browser.cb_c_gaf_arg(list(fort));
        }
        if (kb_indexing.num_gaf_arg_index(fort, ONE_INTEGER, UNPROVIDED, UNPROVIDED).numL($cb_c_maximal_upper_bound$.getDynamicValue(thread))) {
            return cb_browser.cb_c_gaf_arg(list(fort, $$$1));
        }
        return cb_browser.cb_c_definitional(list(fort));
    }/**
     * Attempt to show the most about FORT that we can without exceeding the upper bound.
     */


    /**
     * initializes status frame
     */
    @LispMethod(comment = "initializes status frame")
    public static final SubLObject cb_status_frame_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        com.cyc.cycjava.cycl.cb_frames.cb_server_status(UNPROVIDED);
        return NIL;
    }

    /**
     * initializes status frame
     */
    @LispMethod(comment = "initializes status frame")
    public static SubLObject cb_status_frame(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        cb_server_status(UNPROVIDED);
        return NIL;
    }/**
     * initializes status frame
     */


    public static final SubLObject cb_server_status_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            if (NIL != $cb_status_update_interval$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                html_refresh($cb_status_update_interval$.getDynamicValue(thread));
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            com.cyc.cycjava.cycl.cb_frames.cb_status_frame_guts();
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                        }
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject cb_server_status(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str0$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str1$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            if (NIL != $cb_status_update_interval$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                html_refresh($cb_status_update_interval$.getDynamicValue(thread), UNPROVIDED);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            final SubLObject _prev_bind_0_$82 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_status_frame_guts();
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$82, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_server_status_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Update;
            }
            {
                SubLObject frame_name_var = cb_frame_name($STATUS);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt187$cb_status_frame);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_server_status(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Update;
        }
        final SubLObject frame_name_var = cb_frame_name($STATUS);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str196$cb_status_frame);
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

    /**
     * Update the status frame
     */
    @LispMethod(comment = "Update the status frame")
    public static final SubLObject html_update_cb_status_script_alt() {
        return html_script_utilities.html_refresh_frame_script(cb_frame_name($STATUS));
    }

    /**
     * Update the status frame
     */
    @LispMethod(comment = "Update the status frame")
    public static SubLObject html_update_cb_status_script() {
        return html_script_utilities.html_refresh_frame_script(cb_frame_name($STATUS));
    }/**
     * Update the status frame
     */


    public static SubLObject cb_status_element(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, $list200, listS(HTML_FANCY_TABLE_DATA, $list202, append(body, NIL)));
    }

    public static final SubLObject cb_status_frame_guts_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt190$100_);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    com.cyc.cycjava.cycl.cb_frames.cb_server_status_help();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    com.cyc.cycjava.cycl.cb_frames.cb_server_status_update_link();
                                    com.cyc.cycjava.cycl.cb_frames.cb_server_status_mode();
                                    com.cyc.cycjava.cycl.cb_frames.cb_server_status_agenda();
                                    com.cyc.cycjava.cycl.cb_frames.cb_server_status_kb();
                                    com.cyc.cycjava.cycl.cb_frames.cb_server_status_remote_queue();
                                    com.cyc.cycjava.cycl.cb_frames.cb_server_status_local_queue();
                                    com.cyc.cycjava.cycl.cb_frames.cb_server_status_aux_queue();
                                    com.cyc.cycjava.cycl.cb_frames.cb_server_status_transmit_queue();
                                    com.cyc.cycjava.cycl.cb_frames.cb_server_status_user_actions();
                                    com.cyc.cycjava.cycl.cb_frames.cb_server_status_system();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_status_frame_guts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_server_status_help();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_server_status_update_link();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_server_status_mode();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_server_status_agenda();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_server_status_kb();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                if (NIL != cb_server_show_remote_queueP()) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_server_status_remote_queue();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                if (NIL != cb_server_show_local_queueP()) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_server_status_local_queue();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                if (NIL != cb_server_show_aux_queueP()) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_server_status_aux_queue();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                if (NIL != cb_server_show_transmit_queueP()) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_server_status_transmit_queue();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_server_status_system();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_server_status_help_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $cb_include_help$.getDynamicValue(thread)) {
                cb_help($CB_SERVER_STATUS, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_server_status_help() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cb_include_help$.getDynamicValue(thread)) {
            cb_help($CB_SERVER_STATUS, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_server_status_update_link_alt() {
        cb_link($SERVER_STATUS, $$$Update, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_server_status_update_link() {
        cb_link($SERVER_STATUS, $$$Update, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_server_status_mode_alt() {
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_link($MODE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        {
            SubLObject mode = operation_communication.communication_mode();
            SubLObject mode_name = operation_communication.communication_mode_name(mode);
            html_princ(mode_name);
        }
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_server_status_mode() {
        cb_link($MODE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        final SubLObject mode = operation_communication.communication_mode();
        final SubLObject mode_name = operation_communication.communication_mode_name(mode);
        html_princ(mode_name);
        return NIL;
    }

    public static final SubLObject cb_server_status_agenda_alt() {
        html_indent(UNPROVIDED);
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_link($AGENDA, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_princ(agenda.agenda_state());
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_server_status_agenda() {
        cb_link($AGENDA, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_princ(agenda.agenda_state());
        return NIL;
    }

    public static final SubLObject cb_server_status_kb_alt() {
        html_indent(UNPROVIDED);
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str_alt195$KB__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_princ(kb_loaded());
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_server_status_kb() {
        html_princ_strong($str207$KB__);
        html_princ(kb_loaded());
        return NIL;
    }

    public static SubLObject cb_server_show_remote_queueP() {
        return makeBoolean(operation_communication.kb_op_number().isPositive() || (NIL != operation_communication.receiving_remote_operationsP()));
    }

    public static final SubLObject cb_server_status_remote_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (operation_communication.kb_op_number().isPositive() || (operation_queues.remote_queue_size().isPositive() && (NIL != operation_communication.receiving_remote_operationsP()))) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str_alt196$Remote__);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                if (operation_queues.remote_queue_size().isPositive() && (NIL != operation_communication.receiving_remote_operationsP())) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt197$__d__d_, operation_queues.remote_queue_size(), operation_communication.kb_op_number());
                } else {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt198$__d_, operation_communication.kb_op_number());
                }
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_server_status_remote_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject done = operation_communication.kb_op_number();
        final SubLObject master = transcript_utilities.total_master_transcript_operations(UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_title$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str25$);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong($str208$Remote__);
                        html_princ($str150$_);
                        if (done.eql(master)) {
                            html_princ($$$all_);
                        }
                        html_princ(done);
                        if (!done.eql(master)) {
                            html_princ($$$_of_);
                            html_princ(NIL != master ? master : $str211$___);
                        }
                        html_princ($str24$_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                    }
                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (master.isNumber() && (!done.eql(master))) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($int$50);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            thread.resetMultipleValues();
                            final SubLObject width1 = html_fancy_percent_progress_bar_widths(done, master, NIL);
                            final SubLObject width2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (NIL != html_macros.$html_color_light_green$.getGlobalValue()) {
                                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_color_light_green$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != width1) {
                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(width1);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (NIL != html_macros.$html_color_dark_green$.getGlobalValue()) {
                                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_color_dark_green$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != width2) {
                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(width2);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_server_show_local_queueP() {
        return operation_queues.local_operations_anywhere();
    }

    public static final SubLObject cb_server_status_local_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != operation_queues.local_operations_anywhere()) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                if (NIL != operation_queues.local_queue_empty()) {
                    html_princ($str_alt201$Local_);
                } else {
                    cb_link($SHOW_LOCAL_OPS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                if (operation_queues.local_queue_size().isPositive() || operation_queues.transcript_queue_size().isPositive()) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt203$__d_, operation_queues.local_queue_size());
                    if (operation_queues.transcript_queue_size().numG(ZERO_INTEGER)) {
                        {
                            SubLObject color_val = $RED;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt205$_d, operation_queues.transcript_queue_size());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        }
                    } else {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt205$_d, operation_queues.transcript_queue_size());
                    }
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt206$__d_, operation_queues.local_operation_storage_queue_size());
                } else {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt198$__d_, operation_queues.local_operation_storage_queue_size());
                }
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_server_status_local_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_size = operation_queues.local_queue_size();
        final SubLObject transcript_size = operation_queues.transcript_queue_size();
        final SubLObject local_storage_size = operation_queues.local_operation_storage_queue_size();
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        if (NIL != operation_queues.local_queue_empty()) {
            html_princ($str212$Local_);
        } else {
            cb_link($SHOW_LOCAL_OPS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_indent(UNPROVIDED);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (local_size.isPositive() || transcript_size.isPositive()) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str214$__d_, local_size);
            if (transcript_size.numG(ZERO_INTEGER)) {
                final SubLObject color_val = $RED;
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != color_val) {
                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_val));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str216$_d, transcript_size);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
            } else {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str216$_d, transcript_size);
            }
            format(html_macros.$html_stream$.getDynamicValue(thread), $str217$__d_, local_storage_size);
        } else {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str218$__d_, local_storage_size);
        }
        return NIL;
    }

    public static SubLObject cb_server_show_aux_queueP() {
        return makeBoolean(operation_queues.auxiliary_queue_size().isPositive() || operation_communication.total_auxiliary_operations_run().isPositive());
    }

    public static final SubLObject cb_server_status_aux_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (operation_queues.auxiliary_queue_size().isPositive() || operation_communication.total_auxiliary_operations_run().isPositive()) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str_alt207$Aux__);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                if (operation_queues.auxiliary_queue_size().isPositive()) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt197$__d__d_, operation_queues.auxiliary_queue_size(), operation_communication.total_auxiliary_operations_run());
                } else {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt198$__d_, operation_communication.total_auxiliary_operations_run());
                }
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_server_status_aux_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject aux_size = operation_queues.auxiliary_queue_size();
        final SubLObject aux_total = operation_communication.total_auxiliary_operations_run();
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str219$Aux__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (aux_size.isPositive()) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str220$__d__d_, aux_size, aux_total);
        } else {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str218$__d_, aux_total);
        }
        return NIL;
    }

    public static SubLObject cb_server_show_transmit_queueP() {
        return plusp(operation_queues.transmit_queue_size());
    }

    public static final SubLObject cb_server_status_transmit_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (operation_queues.transmit_queue_size().isPositive()) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str_alt208$Transmit_Pending__);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt198$__d_, operation_queues.transmit_queue_size());
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_server_status_transmit_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject transmit_size = operation_queues.transmit_queue_size();
        html_princ_strong($str221$Transmit_Pending__);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str218$__d_, transmit_size);
        return NIL;
    }

    public static final SubLObject cb_server_status_system_alt() {
        html_indent(UNPROVIDED);
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_link($SYSTEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_princ(system_info.cyc_revision_string());
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_server_status_system() {
        cb_link($SYSTEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_princ(system_info.cyc_revision_string());
        final SubLObject system_code_string = misc_utilities.cyc_system_code_string();
        if (NIL != string_utilities.non_empty_string_p(system_code_string)) {
            html_indent(UNPROVIDED);
            html_princ($str150$_);
            html_princ(system_code_string);
            html_princ($str24$_);
        }
        return NIL;
    }

    public static final SubLObject declare_cb_frames_file_alt() {
        declareFunction("cb_start", "CB-START", 0, 1, false);
        declareFunction("cb_page_title", "CB-PAGE-TITLE", 0, 1, false);
        declareFunction("cb_link_start", "CB-LINK-START", 0, 1, false);
        declareFunction("cb_toolbar_frame", "CB-TOOLBAR-FRAME", 0, 1, false);
        declareFunction("cb_link_toolbar", "CB-LINK-TOOLBAR", 0, 1, false);
        declareFunction("cb_toolbar_frame_guts", "CB-TOOLBAR-FRAME-GUTS", 0, 0, false);
        declareFunction("cb_toolbar_update_link", "CB-TOOLBAR-UPDATE-LINK", 0, 0, false);
        declareFunction("cb_user_toolbar_links", "CB-USER-TOOLBAR-LINKS", 0, 0, false);
        declareFunction("cb_specify_input", "CB-SPECIFY-INPUT", 0, 0, false);
        declareFunction("cb_link_cb_specify_all", "CB-LINK-CB-SPECIFY-ALL", 2, 0, false);
        declareFunction("cb_handle_specify", "CB-HANDLE-SPECIFY", 1, 0, false);
        declareFunction("cb_wn_synsets_from_query", "CB-WN-SYNSETS-FROM-QUERY", 1, 0, false);
        declareFunction("cb_term_choices", "CB-TERM-CHOICES", 4, 2, false);
        declareFunction("cb_display_wn_synsets_section", "CB-DISPLAY-WN-SYNSETS-SECTION", 1, 0, false);
        declareFunction("cb_display_term_section", "CB-DISPLAY-TERM-SECTION", 1, 1, false);
        declareFunction("cb_display_term_section_with_gloss", "CB-DISPLAY-TERM-SECTION-WITH-GLOSS", 5, 0, false);
        declareFunction("cb_display_term_section_sans_gloss", "CB-DISPLAY-TERM-SECTION-SANS-GLOSS", 4, 0, false);
        declareFunction("cb_display_term_choice", "CB-DISPLAY-TERM-CHOICE", 1, 1, false);
        declareFunction("compute_gloss_for_term_to_display", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY", 2, 0, false);
        declareFunction("compute_gloss_for_term_to_display_english_internal", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-ENGLISH-INTERNAL", 1, 0, false);
        declareFunction("compute_gloss_for_term_to_display_english", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-ENGLISH", 1, 0, false);
        declareFunction("compute_gloss_for_term_to_display_cycl_internal", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-CYCL-INTERNAL", 1, 0, false);
        declareFunction("compute_gloss_for_term_to_display_cycl", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-CYCL", 1, 0, false);
        declareFunction("reserved_browser_string_p", "RESERVED-BROWSER-STRING-P", 1, 0, false);
        declareFunction("reserved_wn_browser_string_p", "RESERVED-WN-BROWSER-STRING-P", 1, 0, false);
        declareFunction("terms_for_browsing", "TERMS-FOR-BROWSING", 1, 2, false);
        declareFunction("related_cyc_terms_for_browsing", "RELATED-CYC-TERMS-FOR-BROWSING", 1, 2, false);
        declareFunction("cyc_substring_terms_for_browsing", "CYC-SUBSTRING-TERMS-FOR-BROWSING", 2, 1, false);
        declareFunction("cyc_ir_terms_for_browsing", "CYC-IR-TERMS-FOR-BROWSING", 1, 2, false);
        declareFunction("term_ok_for_browsingP", "TERM-OK-FOR-BROWSING?", 1, 0, false);
        declareFunction("nart_via_open_paren_spec", "NART-VIA-OPEN-PAREN-SPEC", 1, 0, false);
        declareFunction("nat_via_open_paren_spec", "NAT-VIA-OPEN-PAREN-SPEC", 1, 0, false);
        declareFunction("constant_via_id_spec", "CONSTANT-VIA-ID-SPEC", 1, 0, false);
        declareFunction("nart_via_id_spec", "NART-VIA-ID-SPEC", 1, 0, false);
        declareFunction("assertion_via_id_spec", "ASSERTION-VIA-ID-SPEC", 1, 0, false);
        declareFunction("deduction_via_id_spec", "DEDUCTION-VIA-ID-SPEC", 1, 0, false);
        declareFunction("terms_via_lexicon", "TERMS-VIA-LEXICON", 1, 1, false);
        declareFunction("constant_via_exact_name_spec", "CONSTANT-VIA-EXACT-NAME-SPEC", 1, 0, false);
        declareFunction("constant_via_external_id_spec", "CONSTANT-VIA-EXTERNAL-ID-SPEC", 1, 0, false);
        declareFunction("constant_via_star_completion", "CONSTANT-VIA-STAR-COMPLETION", 1, 1, false);
        declareFunction("constant_via_star_apropos", "CONSTANT-VIA-STAR-APROPOS", 1, 1, false);
        declareFunction("constant_via_star_postfix", "CONSTANT-VIA-STAR-POSTFIX", 1, 1, false);
        declareFunction("terms_via_dwimming", "TERMS-VIA-DWIMMING", 1, 1, false);
        declareFunction("assertions_for_string", "ASSERTIONS-FOR-STRING", 1, 0, false);
        declareFunction("constants_via_grep", "CONSTANTS-VIA-GREP", 1, 1, false);
        declareFunction("cb_main_frame", "CB-MAIN-FRAME", 0, 1, false);
        declareFunction("cb_cf", "CB-CF", 0, 1, false);
        declareFunction("cb_constant_frame", "CB-CONSTANT-FRAME", 0, 1, false);
        declareFunction("cb_nf", "CB-NF", 0, 1, false);
        declareFunction("cb_nart_frame", "CB-NART-FRAME", 0, 1, false);
        declareFunction("cb_naut_frame", "CB-NAUT-FRAME", 0, 1, false);
        declareFunction("cb_term_frame_internal", "CB-TERM-FRAME-INTERNAL", 1, 0, false);
        declareFunction("cb_index_frame", "CB-INDEX-FRAME", 0, 1, false);
        declareFunction("cb_empty_index_frame", "CB-EMPTY-INDEX-FRAME", 0, 0, false);
        declareFunction("cb_content_frame", "CB-CONTENT-FRAME", 0, 1, false);
        declareFunction("cb_default_content_internal", "CB-DEFAULT-CONTENT-INTERNAL", 1, 0, false);
        declareFunction("cb_empty_content_frame", "CB-EMPTY-CONTENT-FRAME", 1, 0, false);
        declareFunction("cb_empty_content_frame_internal", "CB-EMPTY-CONTENT-FRAME-INTERNAL", 1, 0, false);
        declareFunction("cb_c_maximal_internal", "CB-C-MAXIMAL-INTERNAL", 1, 0, false);
        declareFunction("cb_status_frame", "CB-STATUS-FRAME", 0, 1, false);
        declareFunction("cb_server_status", "CB-SERVER-STATUS", 0, 1, false);
        declareFunction("cb_link_server_status", "CB-LINK-SERVER-STATUS", 0, 1, false);
        declareFunction("html_update_cb_status_script", "HTML-UPDATE-CB-STATUS-SCRIPT", 0, 0, false);
        declareFunction("cb_status_frame_guts", "CB-STATUS-FRAME-GUTS", 0, 0, false);
        declareFunction("cb_server_status_help", "CB-SERVER-STATUS-HELP", 0, 0, false);
        declareFunction("cb_server_status_update_link", "CB-SERVER-STATUS-UPDATE-LINK", 0, 0, false);
        declareFunction("cb_server_status_mode", "CB-SERVER-STATUS-MODE", 0, 0, false);
        declareFunction("cb_server_status_agenda", "CB-SERVER-STATUS-AGENDA", 0, 0, false);
        declareFunction("cb_server_status_kb", "CB-SERVER-STATUS-KB", 0, 0, false);
        declareFunction("cb_server_status_remote_queue", "CB-SERVER-STATUS-REMOTE-QUEUE", 0, 0, false);
        declareFunction("cb_server_status_user_actions", "CB-SERVER-STATUS-USER-ACTIONS", 0, 0, false);
        declareFunction("cb_server_status_local_queue", "CB-SERVER-STATUS-LOCAL-QUEUE", 0, 0, false);
        declareFunction("cb_server_status_aux_queue", "CB-SERVER-STATUS-AUX-QUEUE", 0, 0, false);
        declareFunction("cb_server_status_transmit_queue", "CB-SERVER-STATUS-TRANSMIT-QUEUE", 0, 0, false);
        declareFunction("cb_server_status_system", "CB-SERVER-STATUS-SYSTEM", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_cb_frames_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("cb_start", "CB-START", 0, 1, false);
            declareFunction("cb_start_redirect", "CB-START-REDIRECT", 0, 1, false);
            declareFunction("cb_page_title", "CB-PAGE-TITLE", 0, 1, false);
            declareFunction("cb_link_start", "CB-LINK-START", 0, 1, false);
            declareFunction("cb_toolbar_frame", "CB-TOOLBAR-FRAME", 0, 1, false);
            declareFunction("cb_link_toolbar", "CB-LINK-TOOLBAR", 0, 1, false);
            declareFunction("cb_toolbar_frame_guts", "CB-TOOLBAR-FRAME-GUTS", 0, 0, false);
            declareFunction("cb_toolbar_update_link", "CB-TOOLBAR-UPDATE-LINK", 0, 0, false);
            declareFunction("cb_user_toolbar_links", "CB-USER-TOOLBAR-LINKS", 0, 0, false);
            declareFunction("user_toolbar_links", "USER-TOOLBAR-LINKS", 0, 0, false);
            declareFunction("cb_specify_input", "CB-SPECIFY-INPUT", 0, 0, false);
            declareFunction("cb_link_cb_specify_all", "CB-LINK-CB-SPECIFY-ALL", 2, 0, false);
            declareFunction("cb_handle_specify", "CB-HANDLE-SPECIFY", 1, 0, false);
            declareFunction("cb_wn_synsets_from_query", "CB-WN-SYNSETS-FROM-QUERY", 1, 0, false);
            declareFunction("cb_term_choices", "CB-TERM-CHOICES", 4, 2, false);
            declareFunction("cb_display_wn_synsets_section", "CB-DISPLAY-WN-SYNSETS-SECTION", 1, 0, false);
            declareFunction("cb_display_term_section", "CB-DISPLAY-TERM-SECTION", 1, 1, false);
            declareFunction("cb_display_term_section_with_gloss", "CB-DISPLAY-TERM-SECTION-WITH-GLOSS", 5, 0, false);
            declareFunction("cb_display_term_section_sans_gloss", "CB-DISPLAY-TERM-SECTION-SANS-GLOSS", 4, 0, false);
            declareFunction("cb_display_term_choice", "CB-DISPLAY-TERM-CHOICE", 1, 1, false);
            declareFunction("compute_gloss_for_term_to_display", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY", 2, 0, false);
            declareFunction("compute_gloss_for_term_to_display_english_internal", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-ENGLISH-INTERNAL", 1, 0, false);
            declareFunction("compute_gloss_for_term_to_display_english", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-ENGLISH", 1, 0, false);
            declareFunction("compute_gloss_for_term_to_display_cycl_internal", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-CYCL-INTERNAL", 1, 0, false);
            declareFunction("compute_gloss_for_term_to_display_cycl", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-CYCL", 1, 0, false);
            declareFunction("reserved_browser_string_p", "RESERVED-BROWSER-STRING-P", 1, 0, false);
            declareFunction("reserved_wn_browser_string_p", "RESERVED-WN-BROWSER-STRING-P", 1, 0, false);
            declareFunction("terms_for_browsing", "TERMS-FOR-BROWSING", 1, 2, false);
            declareFunction("related_cyc_terms_for_browsing", "RELATED-CYC-TERMS-FOR-BROWSING", 1, 2, false);
            declareFunction("cyc_substring_terms_for_browsing", "CYC-SUBSTRING-TERMS-FOR-BROWSING", 2, 1, false);
            declareFunction("cyc_ir_terms_for_browsing", "CYC-IR-TERMS-FOR-BROWSING", 1, 2, false);
            declareFunction("term_ok_for_browsingP", "TERM-OK-FOR-BROWSING?", 1, 0, false);
            declareFunction("asserts_via_open_paren_spec", "ASSERTS-VIA-OPEN-PAREN-SPEC", 1, 0, false);
            declareFunction("nart_via_open_paren_spec", "NART-VIA-OPEN-PAREN-SPEC", 1, 0, false);
            declareFunction("nat_via_open_paren_spec", "NAT-VIA-OPEN-PAREN-SPEC", 1, 0, false);
            declareFunction("terms_via_lexicon", "TERMS-VIA-LEXICON", 1, 1, false);
            declareFunction("constant_via_exact_name_spec", "CONSTANT-VIA-EXACT-NAME-SPEC", 1, 0, false);
            declareFunction("constant_via_external_id_spec", "CONSTANT-VIA-EXTERNAL-ID-SPEC", 1, 0, false);
            declareFunction("constant_via_star_completion", "CONSTANT-VIA-STAR-COMPLETION", 1, 1, false);
            declareFunction("constant_via_star_apropos", "CONSTANT-VIA-STAR-APROPOS", 1, 1, false);
            declareFunction("constant_via_star_postfix", "CONSTANT-VIA-STAR-POSTFIX", 1, 1, false);
            declareFunction("terms_via_dwimming", "TERMS-VIA-DWIMMING", 1, 1, false);
            declareFunction("assertions_for_string", "ASSERTIONS-FOR-STRING", 1, 0, false);
            declareFunction("constants_via_grep", "CONSTANTS-VIA-GREP", 1, 1, false);
            declareFunction("cb_main_frame", "CB-MAIN-FRAME", 0, 1, false);
            declareFunction("cb_cf", "CB-CF", 0, 1, false);
            declareFunction("cb_constant_frame", "CB-CONSTANT-FRAME", 0, 1, false);
            declareFunction("cb_nf", "CB-NF", 0, 1, false);
            declareFunction("cb_nart_frame", "CB-NART-FRAME", 0, 1, false);
            declareFunction("cb_naut_frame", "CB-NAUT-FRAME", 0, 1, false);
            declareFunction("cb_term_frame_internal", "CB-TERM-FRAME-INTERNAL", 1, 0, false);
            declareFunction("cb_index_frame", "CB-INDEX-FRAME", 0, 1, false);
            declareFunction("cb_empty_index_frame", "CB-EMPTY-INDEX-FRAME", 0, 0, false);
            declareFunction("cb_content_frame", "CB-CONTENT-FRAME", 0, 1, false);
            declareFunction("cb_default_content_internal", "CB-DEFAULT-CONTENT-INTERNAL", 1, 0, false);
            declareFunction("cb_empty_content_frame", "CB-EMPTY-CONTENT-FRAME", 1, 0, false);
            declareFunction("cb_empty_content_frame_internal", "CB-EMPTY-CONTENT-FRAME-INTERNAL", 1, 0, false);
            declareFunction("cb_c_maximal_internal", "CB-C-MAXIMAL-INTERNAL", 1, 0, false);
            declareFunction("cb_status_frame", "CB-STATUS-FRAME", 0, 1, false);
            declareFunction("cb_server_status", "CB-SERVER-STATUS", 0, 1, false);
            declareFunction("cb_link_server_status", "CB-LINK-SERVER-STATUS", 0, 1, false);
            declareFunction("html_update_cb_status_script", "HTML-UPDATE-CB-STATUS-SCRIPT", 0, 0, false);
            declareMacro("cb_status_element", "CB-STATUS-ELEMENT");
            declareFunction("cb_status_frame_guts", "CB-STATUS-FRAME-GUTS", 0, 0, false);
            declareFunction("cb_server_status_help", "CB-SERVER-STATUS-HELP", 0, 0, false);
            declareFunction("cb_server_status_update_link", "CB-SERVER-STATUS-UPDATE-LINK", 0, 0, false);
            declareFunction("cb_server_status_mode", "CB-SERVER-STATUS-MODE", 0, 0, false);
            declareFunction("cb_server_status_agenda", "CB-SERVER-STATUS-AGENDA", 0, 0, false);
            declareFunction("cb_server_status_kb", "CB-SERVER-STATUS-KB", 0, 0, false);
            declareFunction("cb_server_show_remote_queueP", "CB-SERVER-SHOW-REMOTE-QUEUE?", 0, 0, false);
            declareFunction("cb_server_status_remote_queue", "CB-SERVER-STATUS-REMOTE-QUEUE", 0, 0, false);
            declareFunction("cb_server_show_local_queueP", "CB-SERVER-SHOW-LOCAL-QUEUE?", 0, 0, false);
            declareFunction("cb_server_status_local_queue", "CB-SERVER-STATUS-LOCAL-QUEUE", 0, 0, false);
            declareFunction("cb_server_show_aux_queueP", "CB-SERVER-SHOW-AUX-QUEUE?", 0, 0, false);
            declareFunction("cb_server_status_aux_queue", "CB-SERVER-STATUS-AUX-QUEUE", 0, 0, false);
            declareFunction("cb_server_show_transmit_queueP", "CB-SERVER-SHOW-TRANSMIT-QUEUE?", 0, 0, false);
            declareFunction("cb_server_status_transmit_queue", "CB-SERVER-STATUS-TRANSMIT-QUEUE", 0, 0, false);
            declareFunction("cb_server_status_system", "CB-SERVER-STATUS-SYSTEM", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("constant_via_id_spec", "CONSTANT-VIA-ID-SPEC", 1, 0, false);
            declareFunction("nart_via_id_spec", "NART-VIA-ID-SPEC", 1, 0, false);
            declareFunction("assertion_via_id_spec", "ASSERTION-VIA-ID-SPEC", 1, 0, false);
            declareFunction("deduction_via_id_spec", "DEDUCTION-VIA-ID-SPEC", 1, 0, false);
            declareFunction("cb_server_status_user_actions", "CB-SERVER-STATUS-USER-ACTIONS", 0, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_cb_frames_file_Previous() {
        declareFunction("cb_start", "CB-START", 0, 1, false);
        declareFunction("cb_start_redirect", "CB-START-REDIRECT", 0, 1, false);
        declareFunction("cb_page_title", "CB-PAGE-TITLE", 0, 1, false);
        declareFunction("cb_link_start", "CB-LINK-START", 0, 1, false);
        declareFunction("cb_toolbar_frame", "CB-TOOLBAR-FRAME", 0, 1, false);
        declareFunction("cb_link_toolbar", "CB-LINK-TOOLBAR", 0, 1, false);
        declareFunction("cb_toolbar_frame_guts", "CB-TOOLBAR-FRAME-GUTS", 0, 0, false);
        declareFunction("cb_toolbar_update_link", "CB-TOOLBAR-UPDATE-LINK", 0, 0, false);
        declareFunction("cb_user_toolbar_links", "CB-USER-TOOLBAR-LINKS", 0, 0, false);
        declareFunction("user_toolbar_links", "USER-TOOLBAR-LINKS", 0, 0, false);
        declareFunction("cb_specify_input", "CB-SPECIFY-INPUT", 0, 0, false);
        declareFunction("cb_link_cb_specify_all", "CB-LINK-CB-SPECIFY-ALL", 2, 0, false);
        declareFunction("cb_handle_specify", "CB-HANDLE-SPECIFY", 1, 0, false);
        declareFunction("cb_wn_synsets_from_query", "CB-WN-SYNSETS-FROM-QUERY", 1, 0, false);
        declareFunction("cb_term_choices", "CB-TERM-CHOICES", 4, 2, false);
        declareFunction("cb_display_wn_synsets_section", "CB-DISPLAY-WN-SYNSETS-SECTION", 1, 0, false);
        declareFunction("cb_display_term_section", "CB-DISPLAY-TERM-SECTION", 1, 1, false);
        declareFunction("cb_display_term_section_with_gloss", "CB-DISPLAY-TERM-SECTION-WITH-GLOSS", 5, 0, false);
        declareFunction("cb_display_term_section_sans_gloss", "CB-DISPLAY-TERM-SECTION-SANS-GLOSS", 4, 0, false);
        declareFunction("cb_display_term_choice", "CB-DISPLAY-TERM-CHOICE", 1, 1, false);
        declareFunction("compute_gloss_for_term_to_display", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY", 2, 0, false);
        declareFunction("compute_gloss_for_term_to_display_english_internal", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-ENGLISH-INTERNAL", 1, 0, false);
        declareFunction("compute_gloss_for_term_to_display_english", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-ENGLISH", 1, 0, false);
        declareFunction("compute_gloss_for_term_to_display_cycl_internal", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-CYCL-INTERNAL", 1, 0, false);
        declareFunction("compute_gloss_for_term_to_display_cycl", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-CYCL", 1, 0, false);
        declareFunction("reserved_browser_string_p", "RESERVED-BROWSER-STRING-P", 1, 0, false);
        declareFunction("reserved_wn_browser_string_p", "RESERVED-WN-BROWSER-STRING-P", 1, 0, false);
        declareFunction("terms_for_browsing", "TERMS-FOR-BROWSING", 1, 2, false);
        declareFunction("related_cyc_terms_for_browsing", "RELATED-CYC-TERMS-FOR-BROWSING", 1, 2, false);
        declareFunction("cyc_substring_terms_for_browsing", "CYC-SUBSTRING-TERMS-FOR-BROWSING", 2, 1, false);
        declareFunction("cyc_ir_terms_for_browsing", "CYC-IR-TERMS-FOR-BROWSING", 1, 2, false);
        declareFunction("term_ok_for_browsingP", "TERM-OK-FOR-BROWSING?", 1, 0, false);
        declareFunction("asserts_via_open_paren_spec", "ASSERTS-VIA-OPEN-PAREN-SPEC", 1, 0, false);
        declareFunction("nart_via_open_paren_spec", "NART-VIA-OPEN-PAREN-SPEC", 1, 0, false);
        declareFunction("nat_via_open_paren_spec", "NAT-VIA-OPEN-PAREN-SPEC", 1, 0, false);
        declareFunction("terms_via_lexicon", "TERMS-VIA-LEXICON", 1, 1, false);
        declareFunction("constant_via_exact_name_spec", "CONSTANT-VIA-EXACT-NAME-SPEC", 1, 0, false);
        declareFunction("constant_via_external_id_spec", "CONSTANT-VIA-EXTERNAL-ID-SPEC", 1, 0, false);
        declareFunction("constant_via_star_completion", "CONSTANT-VIA-STAR-COMPLETION", 1, 1, false);
        declareFunction("constant_via_star_apropos", "CONSTANT-VIA-STAR-APROPOS", 1, 1, false);
        declareFunction("constant_via_star_postfix", "CONSTANT-VIA-STAR-POSTFIX", 1, 1, false);
        declareFunction("terms_via_dwimming", "TERMS-VIA-DWIMMING", 1, 1, false);
        declareFunction("assertions_for_string", "ASSERTIONS-FOR-STRING", 1, 0, false);
        declareFunction("constants_via_grep", "CONSTANTS-VIA-GREP", 1, 1, false);
        declareFunction("cb_main_frame", "CB-MAIN-FRAME", 0, 1, false);
        declareFunction("cb_cf", "CB-CF", 0, 1, false);
        declareFunction("cb_constant_frame", "CB-CONSTANT-FRAME", 0, 1, false);
        declareFunction("cb_nf", "CB-NF", 0, 1, false);
        declareFunction("cb_nart_frame", "CB-NART-FRAME", 0, 1, false);
        declareFunction("cb_naut_frame", "CB-NAUT-FRAME", 0, 1, false);
        declareFunction("cb_term_frame_internal", "CB-TERM-FRAME-INTERNAL", 1, 0, false);
        declareFunction("cb_index_frame", "CB-INDEX-FRAME", 0, 1, false);
        declareFunction("cb_empty_index_frame", "CB-EMPTY-INDEX-FRAME", 0, 0, false);
        declareFunction("cb_content_frame", "CB-CONTENT-FRAME", 0, 1, false);
        declareFunction("cb_default_content_internal", "CB-DEFAULT-CONTENT-INTERNAL", 1, 0, false);
        declareFunction("cb_empty_content_frame", "CB-EMPTY-CONTENT-FRAME", 1, 0, false);
        declareFunction("cb_empty_content_frame_internal", "CB-EMPTY-CONTENT-FRAME-INTERNAL", 1, 0, false);
        declareFunction("cb_c_maximal_internal", "CB-C-MAXIMAL-INTERNAL", 1, 0, false);
        declareFunction("cb_status_frame", "CB-STATUS-FRAME", 0, 1, false);
        declareFunction("cb_server_status", "CB-SERVER-STATUS", 0, 1, false);
        declareFunction("cb_link_server_status", "CB-LINK-SERVER-STATUS", 0, 1, false);
        declareFunction("html_update_cb_status_script", "HTML-UPDATE-CB-STATUS-SCRIPT", 0, 0, false);
        declareMacro("cb_status_element", "CB-STATUS-ELEMENT");
        declareFunction("cb_status_frame_guts", "CB-STATUS-FRAME-GUTS", 0, 0, false);
        declareFunction("cb_server_status_help", "CB-SERVER-STATUS-HELP", 0, 0, false);
        declareFunction("cb_server_status_update_link", "CB-SERVER-STATUS-UPDATE-LINK", 0, 0, false);
        declareFunction("cb_server_status_mode", "CB-SERVER-STATUS-MODE", 0, 0, false);
        declareFunction("cb_server_status_agenda", "CB-SERVER-STATUS-AGENDA", 0, 0, false);
        declareFunction("cb_server_status_kb", "CB-SERVER-STATUS-KB", 0, 0, false);
        declareFunction("cb_server_show_remote_queueP", "CB-SERVER-SHOW-REMOTE-QUEUE?", 0, 0, false);
        declareFunction("cb_server_status_remote_queue", "CB-SERVER-STATUS-REMOTE-QUEUE", 0, 0, false);
        declareFunction("cb_server_show_local_queueP", "CB-SERVER-SHOW-LOCAL-QUEUE?", 0, 0, false);
        declareFunction("cb_server_status_local_queue", "CB-SERVER-STATUS-LOCAL-QUEUE", 0, 0, false);
        declareFunction("cb_server_show_aux_queueP", "CB-SERVER-SHOW-AUX-QUEUE?", 0, 0, false);
        declareFunction("cb_server_status_aux_queue", "CB-SERVER-STATUS-AUX-QUEUE", 0, 0, false);
        declareFunction("cb_server_show_transmit_queueP", "CB-SERVER-SHOW-TRANSMIT-QUEUE?", 0, 0, false);
        declareFunction("cb_server_status_transmit_queue", "CB-SERVER-STATUS-TRANSMIT-QUEUE", 0, 0, false);
        declareFunction("cb_server_status_system", "CB-SERVER-STATUS-SYSTEM", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_frames_file_alt() {
        deflexical("*CB-NAME*", $$$Cyc_Browser);
        defparameter("*CB-TOOLBAR-RESTRICT-TO-USER-TOOLS?*", red_infrastructure_macros.red_def_helper($list_alt20.isSymbol() ? ((SubLObject) (symbol_value($list_alt20))) : $list_alt20, $cb_toolbar_restrict_to_user_toolsP$, NIL.isSymbol() ? ((SubLObject) (symbol_value(NIL))) : NIL, $PARAMETER, UNPROVIDED));
        deflexical("*MAXIMUM-IMAGE-PURPOSE-DISPLAY-LENGTH*", $int$25);
        deflexical("*CB-SPECIFY-SHOW-GLOSS-OPTIONS-TEXT*", $list_alt55);
        deflexical("*CB-SPECIFY-SHOW-GLOSS-OPTIONS*", $list_alt56);
        defparameter("*CB-SEARCH-AUTOCOMPLETE-ENABLED*", T);
        deflexical("*COMPUTE-GLOSS-MAX-CLARIFYING-SENTENCES*", NIL != boundp($compute_gloss_max_clarifying_sentences$) ? ((SubLObject) ($compute_gloss_max_clarifying_sentences$.getGlobalValue())) : THREE_INTEGER);
        defparameter("*USE-CYC-IR-TERMS-FOR-BROWSING?*", NIL);
        defvar("*CB-DEFAULT-INDEX-VIEW*", $LEGACY);
        return NIL;
    }

    public static SubLObject init_cb_frames_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CB-NAME*", $$$ResearchCyc);
            defparameter("*CB-TOOLBAR-RESTRICT-TO-USER-TOOLS?*", red_infrastructure_macros.red_def_helper($list33.isSymbol() ? symbol_value($list33) : $list33, $cb_toolbar_restrict_to_user_toolsP$, NIL.isSymbol() ? symbol_value(NIL) : NIL, $PARAMETER, UNPROVIDED));
            deflexical("*MAXIMUM-IMAGE-PURPOSE-DISPLAY-LENGTH*", $int$25);
            deflexical("*CB-USER-TOOLBAR-LINKS-FOR-OPENCYC*", $list59);
            deflexical("*CB-SPECIFY-SHOW-GLOSS-OPTIONS-TEXT*", $list67);
            deflexical("*CB-SPECIFY-SHOW-GLOSS-OPTIONS*", $list68);
            defparameter("*CB-SEARCH-AUTOCOMPLETE-ENABLED*", T);
            deflexical("*COMPUTE-GLOSS-MAX-CLARIFYING-SENTENCES*", SubLTrampolineFile.maybeDefault($compute_gloss_max_clarifying_sentences$, $compute_gloss_max_clarifying_sentences$, THREE_INTEGER));
            defparameter("*USE-CYC-IR-TERMS-FOR-BROWSING?*", NIL);
            defvar("*CB-DEFAULT-INDEX-VIEW*", $LEGACY);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CB-NAME*", $$$Cyc_Browser);
            defparameter("*CB-TOOLBAR-RESTRICT-TO-USER-TOOLS?*", red_infrastructure_macros.red_def_helper($list_alt20.isSymbol() ? ((SubLObject) (symbol_value($list_alt20))) : $list_alt20, $cb_toolbar_restrict_to_user_toolsP$, NIL.isSymbol() ? ((SubLObject) (symbol_value(NIL))) : NIL, $PARAMETER, UNPROVIDED));
            deflexical("*CB-SPECIFY-SHOW-GLOSS-OPTIONS-TEXT*", $list_alt55);
            deflexical("*CB-SPECIFY-SHOW-GLOSS-OPTIONS*", $list_alt56);
            deflexical("*COMPUTE-GLOSS-MAX-CLARIFYING-SENTENCES*", NIL != boundp($compute_gloss_max_clarifying_sentences$) ? ((SubLObject) ($compute_gloss_max_clarifying_sentences$.getGlobalValue())) : THREE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject init_cb_frames_file_Previous() {
        deflexical("*CB-NAME*", $$$ResearchCyc);
        defparameter("*CB-TOOLBAR-RESTRICT-TO-USER-TOOLS?*", red_infrastructure_macros.red_def_helper($list33.isSymbol() ? symbol_value($list33) : $list33, $cb_toolbar_restrict_to_user_toolsP$, NIL.isSymbol() ? symbol_value(NIL) : NIL, $PARAMETER, UNPROVIDED));
        deflexical("*MAXIMUM-IMAGE-PURPOSE-DISPLAY-LENGTH*", $int$25);
        deflexical("*CB-USER-TOOLBAR-LINKS-FOR-OPENCYC*", $list59);
        deflexical("*CB-SPECIFY-SHOW-GLOSS-OPTIONS-TEXT*", $list67);
        deflexical("*CB-SPECIFY-SHOW-GLOSS-OPTIONS*", $list68);
        defparameter("*CB-SEARCH-AUTOCOMPLETE-ENABLED*", T);
        deflexical("*COMPUTE-GLOSS-MAX-CLARIFYING-SENTENCES*", SubLTrampolineFile.maybeDefault($compute_gloss_max_clarifying_sentences$, $compute_gloss_max_clarifying_sentences$, THREE_INTEGER));
        defparameter("*USE-CYC-IR-TERMS-FOR-BROWSING?*", NIL);
        defvar("*CB-DEFAULT-INDEX-VIEW*", $LEGACY);
        return NIL;
    }

    public static final SubLObject setup_cb_frames_file_alt() {
        html_macros.note_html_handler_function(CB_START);
        setup_cb_link_method($START, CB_LINK_START, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_TOOLBAR_FRAME);
        setup_cb_link_method($TOOLBAR, CB_LINK_TOOLBAR, ONE_INTEGER);
        sethash($OPENCYC_60, $cb_icon_definitions$.getGlobalValue(), list($str_alt28$opencyc_logo_60_gif, $$$OpenCyc_Browser));
        sethash($RESEARCHCYC_60, $cb_icon_definitions$.getGlobalValue(), list($str_alt31$cyc_logo_violet_60_gif, $$$ResearchCyc_Browser));
        sethash($CB_TOOLBAR_FRAME, $cb_help_definitions$.getGlobalValue(), list($str_alt34$cb_toolbar_frame_html, NIL));
        register_html_state_variable($cb_search_autocomplete_enabled$);
        register_html_interface_variable($cb_search_autocomplete_enabled$);
        setup_cb_link_method($CB_SPECIFY_ALL, CB_LINK_CB_SPECIFY_ALL, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_HANDLE_SPECIFY);
        declare_defglobal($compute_gloss_max_clarifying_sentences$);
        memoization_state.note_memoized_function(COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH);
        memoization_state.note_memoized_function(COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL);
        html_macros.note_html_handler_function(CB_MAIN_FRAME);
        html_macros.note_html_handler_function(CB_CF);
        html_macros.note_html_handler_function(CB_CONSTANT_FRAME);
        html_macros.note_html_handler_function(CB_NF);
        html_macros.note_html_handler_function(CB_NART_FRAME);
        html_macros.note_html_handler_function(CB_NAUT_FRAME);
        register_html_state_variable($cb_default_index_view$);
        register_html_interface_variable($cb_default_index_view$);
        html_macros.note_html_handler_function(CB_INDEX_FRAME);
        html_macros.note_html_handler_function(CB_CONTENT_FRAME);
        html_macros.note_html_handler_function(CB_STATUS_FRAME);
        setup_cb_link_method($SERVER_STATUS, CB_LINK_SERVER_STATUS, ONE_INTEGER);
        sethash($CB_SERVER_STATUS, $cb_help_definitions$.getGlobalValue(), list($str_alt192$cb_server_status_html, NIL));
        return NIL;
    }

    public static SubLObject setup_cb_frames_file() {
        if (SubLFiles.USE_V1) {
            html_macros.note_cgi_handler_function(CB_START, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_START_REDIRECT, $HTML_HANDLER);
            setup_cb_link_method($START, CB_LINK_START, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_TOOLBAR_FRAME, $HTML_HANDLER);
            setup_cb_link_method($TOOLBAR, CB_LINK_TOOLBAR, ONE_INTEGER);
            sethash($OPENCYC_60, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str41$opencyc_logo_60_gif, $$$OpenCyc_Browser));
            sethash($RESEARCHCYC_60, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str44$cyc_logo_violet_60_gif, $$$ResearchCyc_Browser));
            sethash($CB_TOOLBAR_FRAME, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str47$cb_toolbar_frame_html, NIL));
            register_html_state_variable($cb_search_autocomplete_enabled$);
            register_html_interface_variable($cb_search_autocomplete_enabled$);
            setup_cb_link_method($CB_SPECIFY_ALL, CB_LINK_CB_SPECIFY_ALL, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_HANDLE_SPECIFY, $HTML_HANDLER);
            declare_defglobal($compute_gloss_max_clarifying_sentences$);
            memoization_state.note_memoized_function(COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH);
            memoization_state.note_memoized_function(COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL);
            html_macros.note_cgi_handler_function(CB_MAIN_FRAME, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_CF, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_CONSTANT_FRAME, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_NF, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_NART_FRAME, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_NAUT_FRAME, $HTML_HANDLER);
            register_html_state_variable($cb_default_index_view$);
            register_html_interface_variable($cb_default_index_view$);
            html_macros.note_cgi_handler_function(CB_INDEX_FRAME, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_CONTENT_FRAME, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_STATUS_FRAME, $HTML_HANDLER);
            setup_cb_link_method($SERVER_STATUS, CB_LINK_SERVER_STATUS, ONE_INTEGER);
            sethash($CB_SERVER_STATUS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str204$cb_server_status_html, NIL));
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_START);
            html_macros.note_html_handler_function(CB_TOOLBAR_FRAME);
            sethash($OPENCYC_60, $cb_icon_definitions$.getGlobalValue(), list($str_alt28$opencyc_logo_60_gif, $$$OpenCyc_Browser));
            sethash($RESEARCHCYC_60, $cb_icon_definitions$.getGlobalValue(), list($str_alt31$cyc_logo_violet_60_gif, $$$ResearchCyc_Browser));
            sethash($CB_TOOLBAR_FRAME, $cb_help_definitions$.getGlobalValue(), list($str_alt34$cb_toolbar_frame_html, NIL));
            html_macros.note_html_handler_function(CB_HANDLE_SPECIFY);
            html_macros.note_html_handler_function(CB_MAIN_FRAME);
            html_macros.note_html_handler_function(CB_CF);
            html_macros.note_html_handler_function(CB_CONSTANT_FRAME);
            html_macros.note_html_handler_function(CB_NF);
            html_macros.note_html_handler_function(CB_NART_FRAME);
            html_macros.note_html_handler_function(CB_NAUT_FRAME);
            html_macros.note_html_handler_function(CB_INDEX_FRAME);
            html_macros.note_html_handler_function(CB_CONTENT_FRAME);
            html_macros.note_html_handler_function(CB_STATUS_FRAME);
            sethash($CB_SERVER_STATUS, $cb_help_definitions$.getGlobalValue(), list($str_alt192$cb_server_status_html, NIL));
        }
        return NIL;
    }

    public static SubLObject setup_cb_frames_file_Previous() {
        html_macros.note_cgi_handler_function(CB_START, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_START_REDIRECT, $HTML_HANDLER);
        setup_cb_link_method($START, CB_LINK_START, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_TOOLBAR_FRAME, $HTML_HANDLER);
        setup_cb_link_method($TOOLBAR, CB_LINK_TOOLBAR, ONE_INTEGER);
        sethash($OPENCYC_60, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str41$opencyc_logo_60_gif, $$$OpenCyc_Browser));
        sethash($RESEARCHCYC_60, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str44$cyc_logo_violet_60_gif, $$$ResearchCyc_Browser));
        sethash($CB_TOOLBAR_FRAME, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str47$cb_toolbar_frame_html, NIL));
        register_html_state_variable($cb_search_autocomplete_enabled$);
        register_html_interface_variable($cb_search_autocomplete_enabled$);
        setup_cb_link_method($CB_SPECIFY_ALL, CB_LINK_CB_SPECIFY_ALL, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_HANDLE_SPECIFY, $HTML_HANDLER);
        declare_defglobal($compute_gloss_max_clarifying_sentences$);
        memoization_state.note_memoized_function(COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH);
        memoization_state.note_memoized_function(COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL);
        html_macros.note_cgi_handler_function(CB_MAIN_FRAME, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_CF, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_CONSTANT_FRAME, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_NF, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_NART_FRAME, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_NAUT_FRAME, $HTML_HANDLER);
        register_html_state_variable($cb_default_index_view$);
        register_html_interface_variable($cb_default_index_view$);
        html_macros.note_cgi_handler_function(CB_INDEX_FRAME, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_CONTENT_FRAME, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_STATUS_FRAME, $HTML_HANDLER);
        setup_cb_link_method($SERVER_STATUS, CB_LINK_SERVER_STATUS, ONE_INTEGER);
        sethash($CB_SERVER_STATUS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str204$cb_server_status_html, NIL));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_frames_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_frames_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_frames_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");

    static private final SubLString $str_alt1$75___50 = makeString("75,*,50");

    static private final SubLString $str_alt5$You_must_have_frames_enabled_to_u = makeString("You must have frames enabled to use Cyc.  Please either enable frames in your web browser or disable frame support in the Cyc browser at the ");

    static private final SubLString $str_alt7$_page_ = makeString(" page.");

    static private final SubLString $$$Cyc_Browser = makeString("Cyc Browser");

    static private final SubLString $str_alt10$__ = makeString(" (");

    static private final SubLString $str_alt11$_ = makeString(")");

    static private final SubLString $str_alt13$___ = makeString(" - ");

    static private final SubLString $str_alt14$_A_A_A = makeString("~A~A~A");

    static private final SubLString $str_alt17$cb_start = makeString("cb-start");

    static private final SubLList $list_alt20 = list(makeString("system.common.browser.tools.cb-toolbar-restrict-to-user-tools?"));

    static private final SubLString $str_alt25$cb_toolbar_frame = makeString("cb-toolbar-frame");

    static private final SubLString $str_alt28$opencyc_logo_60_gif = makeString("opencyc-logo-60.gif");

    static private final SubLString $str_alt31$cyc_logo_violet_60_gif = makeString("cyc-logo-violet-60.gif");

    static private final SubLString $str_alt34$cb_toolbar_frame_html = makeString("cb-toolbar-frame.html");

    static private final SubLString $str_alt38$50_ = makeString("50%");

    static private final SubLString $str_alt41$Project__ = makeString("Project: ");

    static private final SubLString $str_alt42$Server__ = makeString("Server: ");

    static private final SubLString $str_alt44$_ = makeString(":");

    static private final SubLString $str_alt45$___ = makeString("...");

    static private final SubLString $str_alt46$Purpose__ = makeString("Purpose: ");

    static private final SubLSymbol $sym52$STRING_ = makeSymbol("STRING<");

    static private final SubLList $list_alt55 = list(makeString("No gloss"), makeString("English gloss"), makeString("CycL gloss"));

    static private final SubLList $list_alt56 = list(makeSymbol("NONE"), makeSymbol("ENGLISH"), makeSymbol("CYCL"));

    static private final SubLString $str_alt58$98_ = makeString("98%");

    static private final SubLString $str_alt59$cb_handle_specify = makeString("cb-handle-specify");

    static private final SubLString $str_alt61$cb_cf = makeString("cb-cf");

    static private final SubLString $str_alt62$arg_done = makeString("arg-done");

    static private final SubLString $str_alt63$constant_complete = makeString("constant-complete");

    static private final SubLString $str_alt71$gloss_required = makeString("gloss-required");

    static private final SubLString $str_alt72$case_insensitive = makeString("case-insensitive");

    static private final SubLString $$$Ignore_Case = makeString("Ignore Case");

    static private final SubLString $$$Lucky = makeString("Lucky");

    static private final SubLString $$$GREP = makeString("GREP");

    static private final SubLString $str_alt79$cb_handle_specify_query__A_everyt = makeString("cb-handle-specify&query=~A&everything=t");

    static private final SubLString $str_alt80$_A_results = makeString("~A results");

    static private final SubLString $str_alt87$Can_t_determine_a_Cyc_term_from__ = makeString("Can't determine a Cyc term from ~s.");

    static private final SubLString $str_alt88$Please_enter_a_non_empty_string_ = makeString("Please enter a non-empty string.");

    static private final SubLString $str_alt91$WordNet_search_results_for__ = makeString("WordNet search results for \"");

    static private final SubLString $str_alt92$wn_ = makeString("wn ");

    static private final SubLString $str_alt93$_ = makeString("\"");

    static private final SubLString $str_alt94$Search_results_for__ = makeString("Search results for \"");

    static private final SubLString $str_alt95$_A_matching_term_found_ = makeString("~A matching term found:");

    static private final SubLString $str_alt96$_A_matching_terms_found_ = makeString("~A matching terms found:");

    static private final SubLString $str_alt97$_A_matching_WordNet_synsets_found = makeString("~A matching WordNet synsets found:");

    static private final SubLString $str_alt98$No_matching_WordNet_synsets_found = makeString("No matching WordNet synsets found:");

    static private final SubLString $str_alt99$No_matching_terms_found_ = makeString("No matching terms found.");

    static private final SubLString $str_alt100$See_also_ = makeString("See also:");

    static private final SubLString $str_alt101$But_see_ = makeString("But see:");

    static private final SubLString $str_alt102$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt104$__1__A_of_approximately_ = makeString(" (1-~A of approximately ");

    static private final SubLString $str_alt111$WordNet_Noun_Synonym_Sets__in_Ord = makeString("WordNet Noun Synonym Sets, in Order of Frequency");

    static private final SubLString $str_alt112$wni_try_concept_match = makeString("wni-try-concept-match");

    static private final SubLString $str_alt113$synset_id = makeString("synset-id");

    static private final SubLString $str_alt114$WordNet_Verb_Synonym_Sets__in_Ord = makeString("WordNet Verb Synonym Sets, in Order of Frequency");

    static private final SubLString $str_alt115$WordNet_Adjective_Synonym_Sets__i = makeString("WordNet Adjective Synonym Sets, in Order of Frequency");

    static private final SubLString $str_alt116$WordNet_Adverb_Synonym_Sets__in_O = makeString("WordNet Adverb Synonym Sets, in Order of Frequency");

    static private final SubLSymbol $sym118$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");

    static private final SubLSymbol $sym119$ISA_RELATION_ = makeSymbol("ISA-RELATION?");

    static private final SubLString $str_alt125$__ = makeString(": ");

    public static final SubLSymbol $kw132$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt135$a_ = makeString("a ");

    static private final SubLString $str_alt136$d_ = makeString("d ");

    static private final SubLString $str_alt137$c_ = makeString("c ");

    static private final SubLString $str_alt138$n_ = makeString("n ");

    static private final SubLString $str_alt139$_G_ = makeString("#G\"");

    static private final SubLString $str_alt140$Empty_string_results_in_no_consta = makeString("Empty string results in no constants found.");

    static private final SubLString $str_alt141$_ = makeString("(");

    static private final SubLSymbol $sym144$_EXIT = makeSymbol("%EXIT");

    static private final SubLString $str_alt145$_ = makeString("*");

    static private final SubLString $str_alt146$__ = makeString(".*");

    static private final SubLString $str_alt147$Cannot_handle_pattern___string___ = makeString("Cannot handle pattern *[string]* if [string] is under 5 characters.");

    static private final SubLString $str_alt148$Cannot_handle_pattern___string__i = makeString("Cannot handle pattern *[string] if [string] is under 4 characters.");

    static private final SubLString $str_alt149$Cannot_handle_pattern__string___i = makeString("Cannot handle pattern [string]* if [string] is under 3 characters.");

    static private final SubLSymbol $sym150$TERM_OK_FOR_BROWSING_ = makeSymbol("TERM-OK-FOR-BROWSING?");

    static private final SubLString $str_alt152$Unable_to_access_subword_index___ = makeString("Unable to access subword-index: ~S");



    static private final SubLSymbol $sym154$_TERM = makeSymbol("?TERM");

    static private final SubLList $list_alt160 = list(makeKeyword("CASELESS"));

    static private final SubLList $list_alt161 = cons(makeSymbol("INDIRECT-HANDLER"), makeSymbol("INDIRECT-ARGS"));

    static private final SubLString $str_alt168$30___ = makeString("30%,*");

    static private final SubLString $str_alt171$The_requested_term_is_not_availab = makeString("The requested term is not available.");

    static private final SubLString $str_alt184$Choose_an_item_from_the_index_ = makeString("Choose an item from the index.");

    static private final SubLString $str_alt187$cb_status_frame = makeString("cb-status-frame");

    static private final SubLString $str_alt190$100_ = makeString("100%");

    static private final SubLString $str_alt192$cb_server_status_html = makeString("cb-server-status.html");

    static private final SubLString $str_alt195$KB__ = makeString("KB: ");

    static private final SubLString $str_alt196$Remote__ = makeString("Remote: ");

    static private final SubLString $str_alt197$__d__d_ = makeString("(~d ~d)");

    static private final SubLString $str_alt198$__d_ = makeString("(~d)");

    static private final SubLString $str_alt200$User_ = makeString("User:");

    static private final SubLString $str_alt201$Local_ = makeString("Local:");

    static private final SubLString $str_alt203$__d_ = makeString("(~d ");

    static private final SubLString $str_alt205$_d = makeString("~d");

    static private final SubLString $str_alt206$__d_ = makeString(" ~d)");

    static private final SubLString $str_alt207$Aux__ = makeString("Aux: ");

    static private final SubLString $str_alt208$Transmit_Pending__ = makeString("Transmit Pending: ");
}

/**
 * Total time: 1923 ms
 */
