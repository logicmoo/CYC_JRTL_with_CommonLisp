package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_parameters extends SubLTranslatedFile {
    public static final SubLFile me = new cb_parameters();

    public static final String myName = "com.cyc.cycjava.cycl.cb_parameters";

    public static final String myFingerPrint = "ba09963dec2a6fbe29cea6856a299e38430592be83ab04033854c12ba4794cf3";

    // defparameter
    public static final SubLSymbol $transcript_file_shorthand$ = makeSymbol("*TRANSCRIPT-FILE-SHORTHAND*");



    // defparameter
    public static final SubLSymbol $cb_include_inference_helpP$ = makeSymbol("*CB-INCLUDE-INFERENCE-HELP?*");









    // defparameter
    public static final SubLSymbol $cb_use_categorized_historyP$ = makeSymbol("*CB-USE-CATEGORIZED-HISTORY?*");

















    // defparameter
    // On the History page, should EL assertion formulas be shown?
    public static final SubLSymbol $cb_history_show_el_formulasP$ = makeSymbol("*CB-HISTORY-SHOW-EL-FORMULAS?*");



    // deflexical
    // The default number of last n inferences to keep. Right now defaults to 10
    public static final SubLSymbol $cb_destroy_all_inferences_but_last_n_default$ = makeSymbol("*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N-DEFAULT*");



    // defparameter
    /**
     * If a closed query is asked, this property controls whether we gather both pro
     * and con arguments (arguments for the negation of the query) and weigh them
     * using argumentation.
     */
    public static final SubLSymbol $cb_perform_argumentation_for_closed_queryP$ = makeSymbol("*CB-PERFORM-ARGUMENTATION-FOR-CLOSED-QUERY?*");







    // defparameter
    /**
     * Whether or not the default behavior is to assume that meta-assertions should
     * be preserved on edit.
     */
    public static final SubLSymbol $cb_a_edit_preserve_meta_assertions_by_defaultP$ = makeSymbol("*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*");

    // defparameter
    /**
     * Whether or not the default behavior is to assume that the Mt of
     * meta-assertions should changed while changing Mt of assertion (only in the
     * case where Mt of all meta-assertions are same as of the assertion).
     */
    public static final SubLSymbol $cb_a_change_all_meta_assertions_mt_by_defaultP$ = makeSymbol("*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*");





























    // defparameter
    // boolean; Should the Cyc Browser be fast (T), or slow (NIL)?
    public static final SubLSymbol $cb_fastP$ = makeSymbol("*CB-FAST?*");













    // deflexical
    /**
     * The term to use as an indexical for an assertion that is assumed by the
     * context of a tool. For example, the [Assert Meta] tool.
     */
    public static final SubLSymbol $cb_assertion_indexical$ = makeSymbol("*CB-ASSERTION-INDEXICAL*");



    // defparameter
    // Whether to use the "I'm Feeling Lucky" mode of term lookup.
    public static final SubLSymbol $cb_lucky_term_searchP$ = makeSymbol("*CB-LUCKY-TERM-SEARCH?*");







    // defparameter
    public static final SubLSymbol $cb_c_suppress_body_level_elements$ = makeSymbol("*CB-C-SUPPRESS-BODY-LEVEL-ELEMENTS*");

    // defparameter
    public static final SubLSymbol $cb_c_gaf_arg_last_mt$ = makeSymbol("*CB-C-GAF-ARG-LAST-MT*");

    // defparameter
    public static final SubLSymbol $cb_c_gaf_arg_use_binary$ = makeSymbol("*CB-C-GAF-ARG-USE-BINARY*");

    // defparameter
    public static final SubLSymbol $cb_c_nart_arg_use_binary$ = makeSymbol("*CB-C-NART-ARG-USE-BINARY*");

    // defparameter
    /**
     * NIL or an index-hook that will be treated as an exception to the value of
     * cb-c-assertion-formulas-display*, specifying whether EL or HL assertion
     * formulas should be displayed when browsing an index hook.
     */
    public static final SubLSymbol $cb_c_formula_display_exception_index_hook$ = makeSymbol("*CB-C-FORMULA-DISPLAY-EXCEPTION-INDEX-HOOK*");

    // defparameter
    /**
     * Used in the course of displaying a group of EL assertion formulas to
     * determine if an assertion with the same formula has been displayed
     * immediately previously.
     */
    public static final SubLSymbol $cb_show_el_assertion_readably_last_formula$ = makeSymbol("*CB-SHOW-EL-ASSERTION-READABLY-LAST-FORMULA*");

    // defparameter
    /**
     * Used in the course of displaying a group of EL assertion formulas to
     * determine if an assertion with the same formula and mt has been displayed
     * immediately previously.
     */
    public static final SubLSymbol $cb_show_el_assertion_readably_last_mt$ = makeSymbol("*CB-SHOW-EL-ASSERTION-READABLY-LAST-MT*");

    // defparameter
    /**
     * A dictionary the keys of which are assertions, and the values assertion EL
     * formulas. These are cached in the course of browsing terms.
     */
    public static final SubLSymbol $cb_assertion_el_formula_cache$ = makeSymbol("*CB-ASSERTION-EL-FORMULA-CACHE*");

    // defparameter
    // The frame to use as the default target for term links
    public static final SubLSymbol $cb_default_term_frame$ = makeSymbol("*CB-DEFAULT-TERM-FRAME*");

    // defparameter
    // The frame to use as the default target for assertion links
    public static final SubLSymbol $cb_default_assertion_frame$ = makeSymbol("*CB-DEFAULT-ASSERTION-FRAME*");

    // defparameter
    /**
     * When non-nil, a function to funcall on each assertion when displaying an
     * assertion link.
     */
    public static final SubLSymbol $cb_assertion_link_hook$ = makeSymbol("*CB-ASSERTION-LINK-HOOK*");

    // defparameter
    // The default width for text inputs intended to contain constant names.
    public static final SubLSymbol $cb_constant_input_width$ = makeSymbol("*CB-CONSTANT-INPUT-WIDTH*");

    // defparameter
    // The default width for text input of HLMTs.
    public static final SubLSymbol $cb_hlmt_input_width$ = makeSymbol("*CB-HLMT-INPUT-WIDTH*");

    // defparameter
    // Don't review assertions that have these markers.
    public static final SubLSymbol $cb_nonreviewable_assertion_markers$ = makeSymbol("*CB-NONREVIEWABLE-ASSERTION-MARKERS*");









    // defparameter
    // By default, we do not permit robots to follow our links.
    public static final SubLSymbol $cb_permit_robots_to_followP$ = makeSymbol("*CB-PERMIT-ROBOTS-TO-FOLLOW?*");

    // defparameter
    // By default, we do not permit robots to index our links.
    public static final SubLSymbol $cb_permit_robots_to_indexP$ = makeSymbol("*CB-PERMIT-ROBOTS-TO-INDEX?*");



    // defparameter
    public static final SubLSymbol $cb_form_url_prefix_print$ = makeSymbol("*CB-FORM-URL-PREFIX-PRINT*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeString("read"), list(makeSymbol("READ-TRANSCRIPT"))), list(makeString("write"), list(makeSymbol("LOCAL-TRANSCRIPT"))), list(makeString("local"), list(makeSymbol("LOCAL-TRANSCRIPT"))), list(makeString("master"), list(makeSymbol("MASTER-TRANSCRIPT"))));

    public static final SubLSymbol $cb_include_help$ = makeSymbol("*CB-INCLUDE-HELP*");

    public static final SubLSymbol $sym2$_CB_INCLUDE_INFERENCE_HELP__ = makeSymbol("*CB-INCLUDE-INFERENCE-HELP?*");



    public static final SubLSymbol $cb_c_default_content$ = makeSymbol("*CB-C-DEFAULT-CONTENT*");

    private static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLSymbol $cb_c_maximal_upper_bound$ = makeSymbol("*CB-C-MAXIMAL-UPPER-BOUND*");



    public static final SubLSymbol $cb_c_assertion_formulas_display$ = makeSymbol("*CB-C-ASSERTION-FORMULAS-DISPLAY*");

    public static final SubLSymbol $cb_constant_history_max$ = makeSymbol("*CB-CONSTANT-HISTORY-MAX*");

    private static final SubLSymbol $sym10$_CB_USE_CATEGORIZED_HISTORY__ = makeSymbol("*CB-USE-CATEGORIZED-HISTORY?*");

    public static final SubLSymbol $cb_constant_history_chronological_max$ = makeSymbol("*CB-CONSTANT-HISTORY-CHRONOLOGICAL-MAX*");

    public static final SubLSymbol $cb_constant_history$ = makeSymbol("*CB-CONSTANT-HISTORY*");

    public static final SubLSymbol $cb_nat_history_max$ = makeSymbol("*CB-NAT-HISTORY-MAX*");

    public static final SubLSymbol $cb_nat_history$ = makeSymbol("*CB-NAT-HISTORY*");

    public static final SubLSymbol $cb_assertion_history_max$ = makeSymbol("*CB-ASSERTION-HISTORY-MAX*");

    public static final SubLSymbol $cb_assertion_history$ = makeSymbol("*CB-ASSERTION-HISTORY*");

    public static final SubLSymbol $cb_sentence_history_max$ = makeSymbol("*CB-SENTENCE-HISTORY-MAX*");

    public static final SubLSymbol $cb_sentence_history$ = makeSymbol("*CB-SENTENCE-HISTORY*");

    private static final SubLSymbol $sym19$_CB_HISTORY_SHOW_EL_FORMULAS__ = makeSymbol("*CB-HISTORY-SHOW-EL-FORMULAS?*");

    public static final SubLSymbol $cb_status_update_interval$ = makeSymbol("*CB-STATUS-UPDATE-INTERVAL*");

    public static final SubLSymbol $cb_destroy_all_inferences_but_last_n$ = makeSymbol("*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N*");

    private static final SubLSymbol $sym22$_CB_PERFORM_ARGUMENTATION_FOR_CLOSED_QUERY__ = makeSymbol("*CB-PERFORM-ARGUMENTATION-FOR-CLOSED-QUERY?*");

    public static final SubLSymbol $cb_c_wrap_assertions$ = makeSymbol("*CB-C-WRAP-ASSERTIONS*");

    public static final SubLSymbol $cb_a_show_el_formula$ = makeSymbol("*CB-A-SHOW-EL-FORMULA*");

    public static final SubLSymbol $cb_a_show_hl_formula$ = makeSymbol("*CB-A-SHOW-HL-FORMULA*");

    private static final SubLSymbol $sym26$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__ = makeSymbol("*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*");

    private static final SubLSymbol $sym27$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__ = makeSymbol("*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*");

    public static final SubLSymbol $cb_a_perform_access_diagnostics$ = makeSymbol("*CB-A-PERFORM-ACCESS-DIAGNOSTICS*");

    public static final SubLSymbol $cb_a_show_english$ = makeSymbol("*CB-A-SHOW-ENGLISH*");

    public static final SubLSymbol $cb_wrap_interactor$ = makeSymbol("*CB-WRAP-INTERACTOR*");

    public static final SubLSymbol $cb_a_show_newlines_in_string_args$ = makeSymbol("*CB-A-SHOW-NEWLINES-IN-STRING-ARGS*");

    public static final SubLSymbol $cb_use_gke_to_edit_el_sentences$ = makeSymbol("*CB-USE-GKE-TO-EDIT-EL-SENTENCES*");

    public static final SubLSymbol $cb_use_dynamic_table_for_inference_results$ = makeSymbol("*CB-USE-DYNAMIC-TABLE-FOR-INFERENCE-RESULTS*");

    public static final SubLSymbol $cb_show_cyclify_button$ = makeSymbol("*CB-SHOW-CYCLIFY-BUTTON*");

    public static final SubLSymbol $cb_enable_inference_monitoring$ = makeSymbol("*CB-ENABLE-INFERENCE-MONITORING*");



    public static final SubLSymbol $cb_assert_queue_default$ = makeSymbol("*CB-ASSERT-QUEUE-DEFAULT*");

    public static final SubLSymbol $cb_separate_assertion_frame$ = makeSymbol("*CB-SEPARATE-ASSERTION-FRAME*");

    private static final SubLList $list39 = list(makeString("system.common.browser.tools.cb-user-toolbar-links"));

    public static final SubLSymbol $cb_user_toolbar_links$ = makeSymbol("*CB-USER-TOOLBAR-LINKS*");

    private static final SubLList $list41 = list(makeKeyword("HISTORY"), makeKeyword("CREATE"), makeKeyword("ASSERT"), makeKeyword("COMPOSE"), makeKeyword("QUERY"), makeKeyword("DOC"), makeKeyword("NAVIGATOR"), makeKeyword("OPTIONS"));



    public static final SubLSymbol $cb_separate_doc_frame$ = makeSymbol("*CB-SEPARATE-DOC-FRAME*");

    public static final SubLSymbol $cb_more_assertion_marker_image_text$ = makeSymbol("*CB-MORE-ASSERTION-MARKER-IMAGE-TEXT*");

    public static final SubLSymbol $cb_ke_text_mode$ = makeSymbol("*CB-KE-TEXT-MODE*");

    private static final SubLSymbol $sym46$_CB_FAST__ = makeSymbol("*CB-FAST?*");

    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLSymbol $cb_max_assertions_non_collapsed$ = makeSymbol("*CB-MAX-ASSERTIONS-NON-COLLAPSED*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    public static final SubLSymbol $cb_default_mt$ = makeSymbol("*CB-DEFAULT-MT*");

    public static final SubLSymbol $cb_editing_enabled$ = makeSymbol("*CB-EDITING-ENABLED*");

    public static final SubLSymbol $cb_js_sentence_editor_enabled$ = makeSymbol("*CB-JS-SENTENCE-EDITOR-ENABLED*");

    public static final SubLSymbol $show_kb_monitor_links$ = makeSymbol("*SHOW-KB-MONITOR-LINKS*");

    public static final SubLSymbol $cb_confirm_kills$ = makeSymbol("*CB-CONFIRM-KILLS*");

    private static final SubLObject $$TheAssertionSentence = reader_make_constant_shell(makeString("TheAssertionSentence"));



    public static final SubLSymbol $cb_specify_show_gloss$ = makeSymbol("*CB-SPECIFY-SHOW-GLOSS*");

    private static final SubLSymbol $sym58$_CB_LUCKY_TERM_SEARCH__ = makeSymbol("*CB-LUCKY-TERM-SEARCH?*");

    public static final SubLSymbol $cb_mts_filter_use_genlmt$ = makeSymbol("*CB-MTS-FILTER-USE-GENLMT*");

    public static final SubLSymbol $cb_use_ke_review_creators$ = makeSymbol("*CB-USE-KE-REVIEW-CREATORS*");

    public static final SubLSymbol $cb_ke_review_creators$ = makeSymbol("*CB-KE-REVIEW-CREATORS*");



    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLList $list64 = list(makeKeyword("DERIVED"), makeKeyword("CODE"));

    private static final SubLInteger $int$19990921 = makeInteger(19990921);

    public static final SubLSymbol $cb_ke_review_start_date$ = makeSymbol("*CB-KE-REVIEW-START-DATE*");

    private static final SubLInteger $int$29991231 = makeInteger(29991231);

    public static final SubLSymbol $cb_ke_review_end_date$ = makeSymbol("*CB-KE-REVIEW-END-DATE*");

    public static final SubLSymbol $cb_viewpoint_show_doc_preds$ = makeSymbol("*CB-VIEWPOINT-SHOW-DOC-PREDS*");

    public static final SubLSymbol $cb_viewpoint_show_book_preds$ = makeSymbol("*CB-VIEWPOINT-SHOW-BOOK-PREDS*");

    public static final SubLSymbol $cb_glob$ = makeSymbol("*CB-GLOB*");

    private static final SubLList $list72 = list(list(makeSymbol("ID"), makeSymbol("OBJECT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list73 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol DO_GLOB = makeSymbol("DO-GLOB");



    private static final SubLSymbol HTML_HEAD = makeSymbol("HTML-HEAD");

    private static final SubLList $list79 = list(makeSymbol("CB-HEAD-SHORTCUT-ICON"));

    private static final SubLList $list80 = list(makeSymbol("HTML-META-ROBOT-INSTRUCTIONS"), makeSymbol("*CB-PERMIT-ROBOTS-TO-INDEX?*"), makeSymbol("*CB-PERMIT-ROBOTS-TO-FOLLOW?*"));

    private static final SubLList $list81 = list(makeSymbol("CSS"), makeKeyword("CB-CYC"));



    private static final SubLString $str83$mini_logo_gif = makeString("mini-logo.gif");

    private static final SubLSymbol CB_HEAD_SHORTCUT_ICON = makeSymbol("CB-HEAD-SHORTCUT-ICON");

    private static final SubLSymbol CB_HEAD = makeSymbol("CB-HEAD");

    private static final SubLString $$$SHORTCUT_ICON = makeString("SHORTCUT ICON");



    private static final SubLList $list88 = list(makeSymbol("CYC-CGI-URL-INT"));

    private static final SubLString $str89$_ = makeString("?");

    private static final SubLSymbol CYC_CGI_RELATIVE_URL = makeSymbol("CYC-CGI-RELATIVE-URL");

    private static final SubLSymbol CYC_CGI_URL_INT = makeSymbol("CYC-CGI-URL-INT");

    private static final SubLSymbol CYC_CGI_URL = makeSymbol("CYC-CGI-URL");

    private static final SubLString $str93$_cb_start_ = makeString("?cb-start|");

    private static final SubLString $str94$_ = makeString(":");

    private static final SubLString $str95$_a_ = makeString("/a/");

    public static final SubLList $list96 = list(list(makeSymbol("&OPTIONAL"), makeSymbol("TARGET"), makeSymbol("SCRIPT"), list(makeSymbol("METHOD"), makeSymbol("*HTML-FORM-METHOD-POST*")), makeSymbol("ID")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym97$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");



    private static final SubLSymbol CB_FRAME_NAME = makeSymbol("CB-FRAME-NAME");

    private static final SubLSymbol HTML_FANCY_FORM = makeSymbol("HTML-FANCY-FORM");

    private static final SubLSymbol $cyc_cgi_program$ = makeSymbol("*CYC-CGI-PROGRAM*");

    public static final SubLList $list102 = list(list(makeSymbol("HANDLER-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("TARGET"), list(makeSymbol("VALUE"), T), makeSymbol("SCRIPT"), list(makeSymbol("METHOD"), makeSymbol("*HTML-FORM-METHOD-POST*")), makeSymbol("ID")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CB_BASIC_FORM = makeSymbol("CB-BASIC-FORM");

    private static final SubLSymbol HTML_HIDDEN_INPUT = makeSymbol("HTML-HIDDEN-INPUT");

    public static final SubLList $list105 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), makeKeyword("MAIN")), list(makeSymbol("TITLE"), NIL), makeSymbol("CLASS"), makeSymbol("ATTRS"));

    public static final SubLSymbol $sym106$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");













    public static final SubLList $list113 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TITLE"), NIL));

    private static final SubLSymbol FRAME_LINK = makeSymbol("FRAME-LINK");



    private static final SubLList $list116 = list(makeSymbol("URL"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), makeKeyword("MAIN")), list(makeSymbol("TITLE"), NIL), list(makeSymbol("ID"), NIL));

    private static final SubLSymbol $sym117$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");



    private static final SubLList $list119 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), makeSymbol("TARGET"), list(makeSymbol("OPTIONS"), makeString("")));

    private static final SubLString $str120$ = makeString("");

    public static final SubLSymbol $sym121$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");





    private static final SubLList $list124 = list(makeSymbol("HTML-FORMAT"), makeString("window.open('"));

    private static final SubLList $list125 = list(makeSymbol("HTML-FORMAT"), makeString("',"));





    private static final SubLString $str128$__A_ = makeString("'~A'");

    public static final SubLList $list129 = list(list(makeSymbol("HTML-FORMAT"), makeString("null")));

    private static final SubLString $str130$___A____ = makeString(",'~A'); ");

    private static final SubLList $list131 = list(list(makeSymbol("HTML-FORMAT"), makeString("return false;")));

    private static final SubLSymbol $sym132$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    private static final SubLList $list133 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), makeKeyword("MAIN")), makeSymbol("HOVEROVER-HTML"), makeSymbol("CAPTION"), makeSymbol("WIDTH"), makeSymbol("STICKY"));

    private static final SubLSymbol $sym134$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    private static final SubLList $list135 = list(makeSymbol("JAVASCRIPT"), makeKeyword("OVERLIB"));

    private static final SubLSymbol HTML_HOVEROVER_ANCHOR = makeSymbol("HTML-HOVEROVER-ANCHOR");









    public static final SubLList $list141 = list(makeSymbol("LINK-TYPE"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str142$CB_LINK__A = makeString("CB-LINK-~A");



    private static final SubLSymbol SETUP_CB_LINK_METHOD = makeSymbol("SETUP-CB-LINK-METHOD");



    public static final SubLList $list146 = list(makeSymbol("TOOL-LINK-TYPE"), makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), makeKeyword("MAIN")), list(makeSymbol("TITLE"), NIL));







    private static final SubLSymbol $sym150$CB_ICON_EXISTS_ = makeSymbol("CB-ICON-EXISTS?");

    private static final SubLSymbol CB_ICON = makeSymbol("CB-ICON");

    private static final SubLList $list152 = list(list(makeSymbol("HTML-BR")));

    private static final SubLList $list153 = list(list(makeSymbol("VAR"), makeSymbol("HOOK"), makeSymbol("&OPTIONAL"), makeSymbol("INCLUDE-MT?")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $sym155$CB_SHOW_EL_FORMULAS_FOR_HOOK_ = makeSymbol("CB-SHOW-EL-FORMULAS-FOR-HOOK?");

    private static final SubLList $list156 = list(list(makeSymbol("FUNCTION"), makeSymbol("CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY")), list(makeSymbol("FUNCTION"), makeSymbol("CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY")));

    private static final SubLList $list157 = list(list(makeSymbol("FUNCTION"), makeSymbol("CB-ASSERTION-LINK-WITH-MT")), list(makeSymbol("FUNCTION"), makeSymbol("CB-ASSERTION-LINK")));

    private static final SubLList $list158 = list(list(makeSymbol("*CB-SHOW-EL-ASSERTION-READABLY-LAST-FORMULA*"), NIL), list(makeSymbol("*CB-SHOW-EL-ASSERTION-READABLY-LAST-MT*"), NIL));

    private static final SubLList $list159 = list(list(makeSymbol("VAR"), makeSymbol("HOOK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list160 = list(list(makeSymbol("FUNCTION"), makeSymbol("CB-EL-ASSERTION-LINK-BINARY-CHECKING-REDUNDANCY")), list(makeSymbol("FUNCTION"), makeSymbol("CB-ASSERTION-LINK-BINARY")));

    public static final SubLList $list161 = list(list(new SubLObject[]{ makeSymbol("TITLE"), makeSymbol("&KEY"), makeSymbol("COMPLETION?"), makeSymbol("PASSWORD?"), makeSymbol("DHTML?"), makeSymbol("HELP"), list(makeSymbol("COLOR"), list(makeSymbol("QUOTE"), makeSymbol("*HTML-DEFAULT-BGCOLOR*"))), list(makeSymbol("SHOW-COPYRIGHT"), T), list(makeSymbol("OMIT-HEADING?"), NIL) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list162 = list(makeKeyword("COMPLETION?"), makeKeyword("PASSWORD?"), makeKeyword("DHTML?"), makeKeyword("HELP"), makeKeyword("COLOR"), makeKeyword("SHOW-COPYRIGHT"), makeKeyword("OMIT-HEADING?"));











    private static final SubLSymbol $html_default_bgcolor$ = makeSymbol("*HTML-DEFAULT-BGCOLOR*");



    private static final SubLSymbol $kw170$OMIT_HEADING_ = makeKeyword("OMIT-HEADING?");

    private static final SubLSymbol $sym171$TITLE_VAR = makeUninternedSymbol("TITLE-VAR");

    private static final SubLSymbol WITH_HTML_ID_SPACE = makeSymbol("WITH-HTML-ID-SPACE");



    public static final SubLList $list174 = list(makeSymbol("HTML-BASIC-CB-SCRIPTS"));

    private static final SubLSymbol HTML_TITLE = makeSymbol("HTML-TITLE");



    private static final SubLList $list177 = list(list(makeSymbol("HTML-COMPLETE-SCRIPT")), list(makeSymbol("CSS"), makeKeyword("SAM-AUTOCOMPLETE-CSS")));

    public static final SubLList $list178 = list(list(makeSymbol("JAVASCRIPT"), makeKeyword("SHA1")));

    private static final SubLList $list179 = list(list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")));





    private static final SubLList $list182 = list(makeSymbol("HTML-FANCY-DIV"), list(makeKeyword("ID"), makeString("reloadFrameButton")), list(makeSymbol("HTML-FANCY-INPUT"), makeString("button"), makeKeyword("NAME"), makeString("reload"), makeKeyword("VALUE"), makeString("Refresh Frames")));





    private static final SubLSymbol HTML_HEADING = makeSymbol("HTML-HEADING");

    private static final SubLList $list186 = list(TWO_INTEGER);

    private static final SubLSymbol CB_HELP_PREAMBLE = makeSymbol("CB-HELP-PREAMBLE");

    private static final SubLList $list188 = list(list(makeSymbol("HTML-INDENT")));

    private static final SubLList $list189 = list(makeSymbol("INDEX"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list190 = list(list(makeSymbol("INDEX"), makeSymbol("TITLE"), makeSymbol("&KEY"), makeSymbol("COMPLETION?"), makeSymbol("DHTML?"), list(makeSymbol("COLOR"), list(makeSymbol("QUOTE"), makeSymbol("*HTML-DEFAULT-BGCOLOR*")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list191 = list(makeKeyword("COMPLETION?"), makeKeyword("DHTML?"), makeKeyword("COLOR"));

    private static final SubLSymbol $sym192$TITLE_VAR = makeUninternedSymbol("TITLE-VAR");

    private static final SubLList $list193 = list(list(makeSymbol("HTML-COMPLETE-SCRIPT")));

    private static final SubLList $list194 = list(list(makeSymbol("DHTML-WITH-DOM-SCRIPT")), list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")));

    private static final SubLList $list195 = list(makeSymbol("HTML-FANCY-DIV"), list(makeKeyword("ID"), makeString("reloadFrameButton")), list(makeSymbol("HTML-FANCY-INPUT"), makeString("button"), makeKeyword("NAME"), makeString("reload"), makeKeyword("VALUE"), makeString("Refresh"), makeKeyword("ONCLICK"), makeString("reloadCurrentFrame('reloadFrameButton');")));

    private static final SubLSymbol CB_C_CONTENT_PAGE = makeSymbol("CB-C-CONTENT-PAGE");



    private static final SubLSymbol WITH_PPH_MEMOIZATION = makeSymbol("WITH-PPH-MEMOIZATION");

    private static final SubLList $list199 = list(list(makeSymbol("*PPH-LANGUAGE-MT*"), list(makeSymbol("CB-PARAPHRASE-MT"))), list(makeSymbol("*PARAPHRASE-MODE*"), makeKeyword("HTML")));

    public static SubLObject cb_editing_enabled_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_parameters.$cb_editing_enabledP$.getDynamicValue(thread);
    }

    public static SubLObject cb_mts_filter_use_genlmt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_mts_filter_use_genlmt$.getDynamicValue(thread);
    }

    public static SubLObject set_cb_mts_filter_use_genlmt(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_mts_filter_use_genlmt$.setDynamicValue(new_value, thread);
        return $cb_mts_filter_use_genlmt$.getDynamicValue(thread);
    }

    public static SubLObject cb_use_ke_review_creators() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_use_ke_review_creators$.getDynamicValue(thread);
    }

    public static SubLObject set_cb_use_ke_review_creators(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_use_ke_review_creators$.setDynamicValue(new_value, thread);
        return $cb_use_ke_review_creators$.getDynamicValue(thread);
    }

    public static SubLObject cb_ke_review_creators() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_ke_review_creators$.getDynamicValue(thread);
    }

    public static SubLObject set_cb_ke_review_creators(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_ke_review_creators$.setDynamicValue(new_value, thread);
        return $cb_ke_review_creators$.getDynamicValue(thread);
    }

    public static SubLObject cb_glob_lookup(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
        if (NIL == v_glob) {
            return values(NIL, NIL);
        }
        return glob.glob_lookup(v_glob, id, UNPROVIDED);
    }

    public static SubLObject cb_glob_lookup_by_string(final SubLObject id_string) {
        return cb_glob_lookup(string_utilities.string_to_integer(id_string));
    }

    public static SubLObject cb_glob_id(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
        if (NIL == v_glob) {
            v_glob = glob.new_glob(symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
            $cb_glob$.setDynamicValue(v_glob, thread);
        }
        return glob.glob_enter(v_glob, v_object);
    }

    public static SubLObject cb_glob_remove(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
        if (NIL == v_glob) {
            return NIL;
        }
        return glob.glob_remove(v_glob, v_object);
    }

    public static SubLObject cb_glob_remove_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
        if (NIL == v_glob) {
            return NIL;
        }
        return glob.glob_remove_id(v_glob, id);
    }

    public static SubLObject cb_glob_reset() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
        if (NIL == v_glob) {
            return NIL;
        }
        return glob.glob_reset(v_glob);
    }

    public static SubLObject do_cb_glob(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = NIL;
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(current, datum, $list72);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        v_object = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list72);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list72);
            if (NIL == member(current_$1, $list73, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list72);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_GLOB, list(id, v_object, $cb_glob$, $DONE, done), append(body, NIL));
    }

    public static SubLObject cb_glob_find_all_if(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(pred) : "Types.function_spec_p(pred) " + "CommonSymbols.NIL != Types.function_spec_p(pred) " + pred;
        SubLObject result = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(glob.do_glob_index($cb_glob$.getDynamicValue(thread)))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject v_object = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != funcall(pred, v_object)) {
                result = cons(v_object, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    public static SubLObject cb_head(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_HEAD, $list79, $list80, $list81, append(body, NIL));
    }

    public static SubLObject cb_head_shortcut_icon() {
        final SubLObject shortcut_icon = cyc_file_dependencies.cb_icon_file_path($MINI_LOGO);
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_link_head$.getGlobalValue());
        html_markup(html_macros.$html_link_rel$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$SHORTCUT_ICON);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != shortcut_icon) {
            html_markup(html_macros.$html_link_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(shortcut_icon);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cyc_cgi_url(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PROGN, $list88, append(body, NIL));
    }

    public static SubLObject cyc_cgi_url_string(final SubLObject handler_and_args_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cconcatenate(system_parameters.$cyc_cgi_program$.getDynamicValue(thread), new SubLObject[]{ $str89$_, handler_and_args_string });
    }

    public static SubLObject cyc_cgi_url_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        funcall($cb_form_url_prefix_print$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject cyc_cgi_relative_url() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_markup($str89$_);
        return NIL;
    }

    public static SubLObject cyc_cgi_absolute_cb_framed_url() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(http_kernel.http_server_cgi_base_url());
        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_markup($str93$_cb_start_);
        return NIL;
    }

    public static SubLObject cyc_cgi_kea_url() {
        html_markup(web_utilities.effective_servlet_container_host());
        html_markup($str94$_);
        html_markup(web_utilities.effective_servlet_container_port());
        html_markup($str95$_a_);
        return NIL;
    }

    public static SubLObject cb_basic_form(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject target = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list96);
        current = current.rest();
        final SubLObject script = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list96);
        current = current.rest();
        final SubLObject method = (current.isCons()) ? current.first() : html_macros.$html_form_method_post$.getGlobalValue();
        destructuring_bind_must_listp(current, datum, $list96);
        current = current.rest();
        final SubLObject id = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list96);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject frame_name_var = $sym97$FRAME_NAME_VAR;
            return list(CLET, list(list(frame_name_var, list(CB_FRAME_NAME, target))), listS(HTML_FANCY_FORM, list($cyc_cgi_program$, method, frame_name_var, NIL, script, id), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list96);
        return NIL;
    }

    public static SubLObject cb_basic_form_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject handler_name = NIL;
        destructuring_bind_must_consp(current, datum, $list102);
        handler_name = current.first();
        current = current.rest();
        final SubLObject target = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list102);
        current = current.rest();
        final SubLObject value = (current.isCons()) ? current.first() : T;
        destructuring_bind_must_listp(current, datum, $list102);
        current = current.rest();
        final SubLObject script = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list102);
        current = current.rest();
        final SubLObject method = (current.isCons()) ? current.first() : html_macros.$html_form_method_post$.getGlobalValue();
        destructuring_bind_must_listp(current, datum, $list102);
        current = current.rest();
        final SubLObject id = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list102);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CB_BASIC_FORM, list(target, script, method, id), list(HTML_HIDDEN_INPUT, handler_name, value), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list102);
        return NIL;
    }

    public static SubLObject frame_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = NIL;
        SubLObject link_body = NIL;
        destructuring_bind_must_consp(current, datum, $list105);
        url_body = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list105);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (current.isCons()) ? current.first() : $MAIN;
        destructuring_bind_must_listp(current, datum, $list105);
        current = current.rest();
        final SubLObject title = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list105);
        current = current.rest();
        final SubLObject v_class = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list105);
        current = current.rest();
        final SubLObject attrs = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list105);
        current = current.rest();
        if (NIL == current) {
            final SubLObject frame_name_var = $sym106$FRAME_NAME_VAR;
            return list(CLET, list(list(frame_name_var, list(CB_FRAME_NAME, target))), list(HTML_FANCY_ANCHOR, list(new SubLObject[]{ $TARGET, frame_name_var, $TITLE, title, $HREF, list(CYC_CGI_URL, url_body), $CLASS, v_class, $ATTRS, attrs }), link_body));
        }
        cdestructuring_bind_error(datum, $list105);
        return NIL;
    }

    public static SubLObject page_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = NIL;
        SubLObject link_body = NIL;
        destructuring_bind_must_consp(current, datum, $list113);
        url_body = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list113);
        link_body = current.first();
        current = current.rest();
        final SubLObject title = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list113);
        current = current.rest();
        if (NIL == current) {
            return list(FRAME_LINK, url_body, link_body, $TOP, title);
        }
        cdestructuring_bind_error(datum, $list113);
        return NIL;
    }

    public static SubLObject absolute_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url = NIL;
        SubLObject link_body = NIL;
        destructuring_bind_must_consp(current, datum, $list116);
        url = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list116);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (current.isCons()) ? current.first() : $MAIN;
        destructuring_bind_must_listp(current, datum, $list116);
        current = current.rest();
        final SubLObject title = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list116);
        current = current.rest();
        final SubLObject id = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list116);
        current = current.rest();
        if (NIL == current) {
            final SubLObject frame_name_var = $sym117$FRAME_NAME_VAR;
            return list(CLET, list(list(frame_name_var, list(CB_FRAME_NAME, target))), list(HTML_FANCY_ANCHOR, list($TARGET, frame_name_var, $TITLE, title, $HREF, url, $ID, id), link_body));
        }
        cdestructuring_bind_error(datum, $list116);
        return NIL;
    }

    public static SubLObject new_window_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = NIL;
        SubLObject link_body = NIL;
        destructuring_bind_must_consp(current, datum, $list119);
        url_body = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list119);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list119);
        current = current.rest();
        final SubLObject options = (current.isCons()) ? current.first() : $str120$;
        destructuring_bind_must_listp(current, datum, $list119);
        current = current.rest();
        if (NIL == current) {
            final SubLObject frame_name_var = $sym121$FRAME_NAME_VAR;
            return list(CLET, list(list(frame_name_var, list(FWHEN, target, list(CB_FRAME_NAME, target)))), list(HTML_FANCY_ANCHOR, list($TARGET, frame_name_var, $HREF, list(CYC_CGI_URL, url_body), $ONCLICK, listS(PROGN, new SubLObject[]{ $list124, list(CYC_CGI_URL, url_body), $list125, listS(PIF, target, list(HTML_FORMAT, $str128$__A_, target), $list129), list(HTML_FORMAT, $str130$___A____, options), $list131 })), link_body));
        }
        cdestructuring_bind_error(datum, $list119);
        return NIL;
    }

    public static SubLObject new_external_window_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = NIL;
        SubLObject link_body = NIL;
        destructuring_bind_must_consp(current, datum, $list119);
        url_body = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list119);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list119);
        current = current.rest();
        final SubLObject options = (current.isCons()) ? current.first() : $str120$;
        destructuring_bind_must_listp(current, datum, $list119);
        current = current.rest();
        if (NIL == current) {
            final SubLObject frame_name_var = $sym132$FRAME_NAME_VAR;
            return list(CLET, list(list(frame_name_var, list(FWHEN, target, list(CB_FRAME_NAME, target)))), list(HTML_FANCY_ANCHOR, list($TARGET, frame_name_var, $HREF, url_body, $ONCLICK, listS(PROGN, new SubLObject[]{ $list124, url_body, $list125, listS(PIF, target, list(HTML_FORMAT, $str128$__A_, target), $list129), list(HTML_FORMAT, $str130$___A____, options), $list131 })), link_body));
        }
        cdestructuring_bind_error(datum, $list119);
        return NIL;
    }

    public static SubLObject frame_link_hoverover(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = NIL;
        SubLObject link_body = NIL;
        destructuring_bind_must_consp(current, datum, $list133);
        url_body = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list133);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (current.isCons()) ? current.first() : $MAIN;
        destructuring_bind_must_listp(current, datum, $list133);
        current = current.rest();
        final SubLObject hoverover_html = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list133);
        current = current.rest();
        final SubLObject caption = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list133);
        current = current.rest();
        final SubLObject width = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list133);
        current = current.rest();
        final SubLObject sticky = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list133);
        current = current.rest();
        if (NIL == current) {
            final SubLObject frame_name_var = $sym134$FRAME_NAME_VAR;
            return list(CLET, list(list(frame_name_var, list(CB_FRAME_NAME, target))), $list135, list(HTML_HOVEROVER_ANCHOR, list(new SubLObject[]{ $TARGET, frame_name_var, $HREF, list(CYC_CGI_URL, url_body), $HOVEROVER_HTML, hoverover_html, $CAPTION, caption, $WIDTH, width, $STICKY, sticky }), link_body));
        }
        cdestructuring_bind_error(datum, $list133);
        return NIL;
    }

    public static SubLObject define_cb_link_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject link_type = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list141);
        link_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list141);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject type_name = symbol_name(link_type);
        final SubLObject method_func_name = format(NIL, $str142$CB_LINK__A, type_name);
        final SubLObject method_func = intern(method_func_name, UNPROVIDED);
        final SubLObject max_args = list_utilities.function_arglist_max_args(arglist);
        return list(PROGN, listS(DEFINE, method_func, arglist, append(body, NIL)), list(SETUP_CB_LINK_METHOD, link_type, list(QUOTE, method_func), list(QUOTE, max_args)));
    }

    public static SubLObject cb_tool_frame_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tool_link_type = NIL;
        SubLObject url_body = NIL;
        SubLObject link_body = NIL;
        destructuring_bind_must_consp(current, datum, $list146);
        tool_link_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list146);
        url_body = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list146);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (current.isCons()) ? current.first() : $MAIN;
        destructuring_bind_must_listp(current, datum, $list146);
        current = current.rest();
        final SubLObject title = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list146);
        current = current.rest();
        if (NIL == current) {
            return list(FRAME_LINK, url_body, list(PROGN, list(PWHEN_FEATURE, $CYC_OPENCYC, listS(PWHEN, list($sym150$CB_ICON_EXISTS_, tool_link_type), list(CB_ICON, tool_link_type), $list152)), link_body), target, title);
        }
        cdestructuring_bind_error(datum, $list146);
        return NIL;
    }

    public static SubLObject cb_clet_assertion_link_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list153);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject hook = NIL;
        destructuring_bind_must_consp(current, datum, $list153);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list153);
        hook = current.first();
        current = current.rest();
        final SubLObject include_mtP = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list153);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, bq_cons(list(var, list(FIF, list($sym155$CB_SHOW_EL_FORMULAS_FOR_HOOK_, hook), listS(FIF, include_mtP, $list156), listS(FIF, include_mtP, $list157))), $list158), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list153);
        return NIL;
    }

    public static SubLObject cb_clet_assertion_link_binary_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list159);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject hook = NIL;
        destructuring_bind_must_consp(current, datum, $list159);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list159);
        hook = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, bq_cons(list(var, listS(FIF, list($sym155$CB_SHOW_EL_FORMULAS_FOR_HOOK_, hook), $list160)), $list158), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list159);
        return NIL;
    }

    public static SubLObject cb_simple_main_document(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list161);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = NIL;
        destructuring_bind_must_consp(current, datum, $list161);
        title = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list161);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list161);
            if (NIL == member(current_$2, $list162, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list161);
        }
        final SubLObject completionP_tail = property_list_member($COMPLETION_, current);
        final SubLObject completionP = (NIL != completionP_tail) ? cadr(completionP_tail) : NIL;
        final SubLObject passwordP_tail = property_list_member($PASSWORD_, current);
        final SubLObject passwordP = (NIL != passwordP_tail) ? cadr(passwordP_tail) : NIL;
        final SubLObject dhtmlP_tail = property_list_member($DHTML_, current);
        final SubLObject dhtmlP = (NIL != dhtmlP_tail) ? cadr(dhtmlP_tail) : NIL;
        final SubLObject help_tail = property_list_member($HELP, current);
        final SubLObject help = (NIL != help_tail) ? cadr(help_tail) : NIL;
        final SubLObject color_tail = property_list_member($COLOR, current);
        final SubLObject color = (NIL != color_tail) ? cadr(color_tail) : $html_default_bgcolor$;
        final SubLObject show_copyright_tail = property_list_member($SHOW_COPYRIGHT, current);
        final SubLObject show_copyright = (NIL != show_copyright_tail) ? cadr(show_copyright_tail) : T;
        final SubLObject omit_headingP_tail = property_list_member($kw170$OMIT_HEADING_, current);
        final SubLObject omit_headingP = (NIL != omit_headingP_tail) ? cadr(omit_headingP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject title_var = $sym171$TITLE_VAR;
        return list(CLET, list(list(title_var, title)), list(WITH_HTML_ID_SPACE, list(HTML_DOCUMENT, list(CB_HEAD, $list174, list(PWHEN, title_var, list(HTML_TITLE, list(HTML_PRINC, title_var))), listS(PWHEN, completionP, $list177), listS(PWHEN, passwordP, $list178), listS(PWHEN, dhtmlP, $list179)), listS(HTML_FANCY_BODY, list($BACKGROUND_COLOR, color, $CLASS, html_macros.$basic_skin_class$.getGlobalValue(), $SHOW_COPYRIGHT, show_copyright), $list182, list(PWHEN, list(CAND, title_var, list(CNOT, omit_headingP)), list(HTML_HEADING, $list186, listS(PWHEN, help, list(CB_HELP_PREAMBLE, help), $list188), list(HTML_PRINC, title_var))), append(body, NIL)))));
    }

    public static SubLObject cb_c_content_page(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject index = NIL;
        destructuring_bind_must_consp(current, datum, $list189);
        index = current.first();
        final SubLObject body;
        current = body = current.rest();
        return bq_cons(PROGN, append(body, NIL));
    }

    public static SubLObject cb_simple_c_content_document(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list190);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject index = NIL;
        SubLObject title = NIL;
        destructuring_bind_must_consp(current, datum, $list190);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list190);
        title = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list190);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list190);
            if (NIL == member(current_$3, $list191, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list190);
        }
        final SubLObject completionP_tail = property_list_member($COMPLETION_, current);
        final SubLObject completionP = (NIL != completionP_tail) ? cadr(completionP_tail) : NIL;
        final SubLObject dhtmlP_tail = property_list_member($DHTML_, current);
        final SubLObject dhtmlP = (NIL != dhtmlP_tail) ? cadr(dhtmlP_tail) : NIL;
        final SubLObject color_tail = property_list_member($COLOR, current);
        final SubLObject color = (NIL != color_tail) ? cadr(color_tail) : $html_default_bgcolor$;
        final SubLObject body;
        current = body = temp;
        if (NIL != $cb_c_suppress_body_level_elements$.getDynamicValue(thread)) {
            return listS(CLET, NIL, append(body, NIL));
        }
        final SubLObject title_var = $sym192$TITLE_VAR;
        return list(CLET, list(list(title_var, title)), list(WITH_HTML_ID_SPACE, list(HTML_DOCUMENT, list(CB_HEAD, list(PWHEN, title_var, list(HTML_TITLE, list(HTML_PRINC, title_var))), $list174, listS(PWHEN, completionP, $list193), listS(PWHEN, dhtmlP, $list194)), list(HTML_FANCY_BODY, list($BACKGROUND_COLOR, color, $CLASS, html_macros.$basic_skin_class$.getGlobalValue()), $list195, listS(CB_C_CONTENT_PAGE, index, append(body, NIL))))));
    }

    public static SubLObject cb_with_pph_assumptions(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (NIL != find($CYC_PPH, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list(WITH_PPH_MEMOIZATION, listS(CLET, $list199, append(body, NIL)));
        }
        return bq_cons(PROGN, append(body, NIL));
    }

    public static SubLObject declare_cb_parameters_file() {
        declareFunction(me, "cb_editing_enabled_p", "CB-EDITING-ENABLED-P", 0, 0, false);
        declareFunction(me, "cb_mts_filter_use_genlmt", "CB-MTS-FILTER-USE-GENLMT", 0, 0, false);
        declareFunction(me, "set_cb_mts_filter_use_genlmt", "SET-CB-MTS-FILTER-USE-GENLMT", 1, 0, false);
        declareFunction(me, "cb_use_ke_review_creators", "CB-USE-KE-REVIEW-CREATORS", 0, 0, false);
        declareFunction(me, "set_cb_use_ke_review_creators", "SET-CB-USE-KE-REVIEW-CREATORS", 1, 0, false);
        declareFunction(me, "cb_ke_review_creators", "CB-KE-REVIEW-CREATORS", 0, 0, false);
        declareFunction(me, "set_cb_ke_review_creators", "SET-CB-KE-REVIEW-CREATORS", 1, 0, false);
        declareFunction(me, "cb_glob_lookup", "CB-GLOB-LOOKUP", 1, 0, false);
        declareFunction(me, "cb_glob_lookup_by_string", "CB-GLOB-LOOKUP-BY-STRING", 1, 0, false);
        declareFunction(me, "cb_glob_id", "CB-GLOB-ID", 1, 0, false);
        declareFunction(me, "cb_glob_remove", "CB-GLOB-REMOVE", 1, 0, false);
        declareFunction(me, "cb_glob_remove_id", "CB-GLOB-REMOVE-ID", 1, 0, false);
        declareFunction(me, "cb_glob_reset", "CB-GLOB-RESET", 0, 0, false);
        declareMacro(me, "do_cb_glob", "DO-CB-GLOB");
        declareFunction(me, "cb_glob_find_all_if", "CB-GLOB-FIND-ALL-IF", 1, 0, false);
        declareMacro(me, "cb_head", "CB-HEAD");
        declareFunction(me, "cb_head_shortcut_icon", "CB-HEAD-SHORTCUT-ICON", 0, 0, false);
        declareMacro(me, "cyc_cgi_url", "CYC-CGI-URL");
        declareFunction(me, "cyc_cgi_url_string", "CYC-CGI-URL-STRING", 1, 0, false);
        declareFunction(me, "cyc_cgi_url_int", "CYC-CGI-URL-INT", 0, 0, false);
        declareFunction(me, "cyc_cgi_relative_url", "CYC-CGI-RELATIVE-URL", 0, 0, false);
        declareFunction(me, "cyc_cgi_absolute_cb_framed_url", "CYC-CGI-ABSOLUTE-CB-FRAMED-URL", 0, 0, false);
        declareFunction(me, "cyc_cgi_kea_url", "CYC-CGI-KEA-URL", 0, 0, false);
        declareMacro(me, "cb_basic_form", "CB-BASIC-FORM");
        declareMacro(me, "cb_basic_form_handler", "CB-BASIC-FORM-HANDLER");
        declareMacro(me, "frame_link", "FRAME-LINK");
        declareMacro(me, "page_link", "PAGE-LINK");
        declareMacro(me, "absolute_link", "ABSOLUTE-LINK");
        declareMacro(me, "new_window_link", "NEW-WINDOW-LINK");
        declareMacro(me, "new_external_window_link", "NEW-EXTERNAL-WINDOW-LINK");
        declareMacro(me, "frame_link_hoverover", "FRAME-LINK-HOVEROVER");
        declareMacro(me, "define_cb_link_method", "DEFINE-CB-LINK-METHOD");
        declareMacro(me, "cb_tool_frame_link", "CB-TOOL-FRAME-LINK");
        declareMacro(me, "cb_clet_assertion_link_fn", "CB-CLET-ASSERTION-LINK-FN");
        declareMacro(me, "cb_clet_assertion_link_binary_fn", "CB-CLET-ASSERTION-LINK-BINARY-FN");
        declareMacro(me, "cb_simple_main_document", "CB-SIMPLE-MAIN-DOCUMENT");
        declareMacro(me, "cb_c_content_page", "CB-C-CONTENT-PAGE");
        declareMacro(me, "cb_simple_c_content_document", "CB-SIMPLE-C-CONTENT-DOCUMENT");
        declareMacro(me, "cb_with_pph_assumptions", "CB-WITH-PPH-ASSUMPTIONS");
        return NIL;
    }

    public static SubLObject init_cb_parameters_file() {
        defparameter("*TRANSCRIPT-FILE-SHORTHAND*", $list0);
        defparameter("*CB-INCLUDE-HELP*", T);
        defparameter("*CB-INCLUDE-INFERENCE-HELP?*", T);
        defparameter("*CB-C-DEFAULT-CONTENT*", $MAXIMAL);
        defparameter("*CB-C-MAXIMAL-UPPER-BOUND*", $int$30);
        defparameter("*CB-C-ASSERTION-FORMULAS-DISPLAY*", $HL_FORMULAS);
        defparameter("*CB-CONSTANT-HISTORY-MAX*", NIL);
        defparameter("*CB-USE-CATEGORIZED-HISTORY?*", T);
        defparameter("*CB-CONSTANT-HISTORY-CHRONOLOGICAL-MAX*", FIFTEEN_INTEGER);
        defparameter("*CB-CONSTANT-HISTORY*", NIL);
        defparameter("*CB-NAT-HISTORY-MAX*", NIL);
        defparameter("*CB-NAT-HISTORY*", NIL);
        defparameter("*CB-ASSERTION-HISTORY-MAX*", NIL);
        defparameter("*CB-ASSERTION-HISTORY*", NIL);
        defparameter("*CB-SENTENCE-HISTORY-MAX*", NIL);
        defparameter("*CB-SENTENCE-HISTORY*", NIL);
        defparameter("*CB-HISTORY-SHOW-EL-FORMULAS?*", NIL);
        defparameter("*CB-STATUS-UPDATE-INTERVAL*", NIL);
        deflexical("*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N-DEFAULT*", TEN_INTEGER);
        defparameter("*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N*", $cb_destroy_all_inferences_but_last_n_default$.getGlobalValue());
        defparameter("*CB-PERFORM-ARGUMENTATION-FOR-CLOSED-QUERY?*", NIL);
        defparameter("*CB-C-WRAP-ASSERTIONS*", T);
        defparameter("*CB-A-SHOW-EL-FORMULA*", NIL);
        defparameter("*CB-A-SHOW-HL-FORMULA*", T);
        defparameter("*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*", T);
        defparameter("*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*", NIL);
        defparameter("*CB-A-PERFORM-ACCESS-DIAGNOSTICS*", NIL);
        defparameter("*CB-A-SHOW-ENGLISH*", NIL);
        defparameter("*CB-WRAP-INTERACTOR*", NIL);
        defparameter("*CB-A-SHOW-NEWLINES-IN-STRING-ARGS*", T);
        defparameter("*CB-USE-GKE-TO-EDIT-EL-SENTENCES*", NIL);
        defparameter("*CB-USE-DYNAMIC-TABLE-FOR-INFERENCE-RESULTS*", T);
        defparameter("*CB-SHOW-CYCLIFY-BUTTON*", T);
        defparameter("*CB-ENABLE-INFERENCE-MONITORING*", NIL);
        defparameter("*CB-ASSERT-QUEUE-DEFAULT*", $LOCAL);
        defparameter("*CB-SEPARATE-ASSERTION-FRAME*", NIL);
        defparameter("*CB-USER-TOOLBAR-LINKS*", red_infrastructure_macros.red_def_helper($list39.isSymbol() ? symbol_value($list39) : $list39, $cb_user_toolbar_links$, $list41.isSymbol() ? symbol_value($list41) : $list41, $PARAMETER, UNPROVIDED));
        defparameter("*CB-SEPARATE-DOC-FRAME*", NIL);
        defparameter("*CB-MORE-ASSERTION-MARKER-IMAGE-TEXT*", NIL);
        defparameter("*CB-KE-TEXT-MODE*", NIL);
        defparameter("*CB-FAST?*", NIL);
        defparameter("*CB-MAX-ASSERTIONS-NON-COLLAPSED*", $int$50);
        defparameter("*CB-DEFAULT-MT*", $$BaseKB);
        defparameter("*CB-EDITING-ENABLED*", T);
        defparameter("*CB-JS-SENTENCE-EDITOR-ENABLED*", NIL);
        defparameter("*SHOW-KB-MONITOR-LINKS*", T);
        defparameter("*CB-CONFIRM-KILLS*", T);
        deflexical("*CB-ASSERTION-INDEXICAL*", $$TheAssertionSentence);
        defparameter("*CB-SPECIFY-SHOW-GLOSS*", NONE);
        defparameter("*CB-LUCKY-TERM-SEARCH?*", NIL);
        defparameter("*CB-MTS-FILTER-USE-GENLMT*", T);
        defparameter("*CB-USE-KE-REVIEW-CREATORS*", NIL);
        defparameter("*CB-KE-REVIEW-CREATORS*", NIL);
        defparameter("*CB-C-SUPPRESS-BODY-LEVEL-ELEMENTS*", NIL);
        defparameter("*CB-C-GAF-ARG-LAST-MT*", NIL);
        defparameter("*CB-C-GAF-ARG-USE-BINARY*", T);
        defparameter("*CB-C-NART-ARG-USE-BINARY*", T);
        defparameter("*CB-C-FORMULA-DISPLAY-EXCEPTION-INDEX-HOOK*", NIL);
        defparameter("*CB-SHOW-EL-ASSERTION-READABLY-LAST-FORMULA*", NIL);
        defparameter("*CB-SHOW-EL-ASSERTION-READABLY-LAST-MT*", NIL);
        defparameter("*CB-ASSERTION-EL-FORMULA-CACHE*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*CB-DEFAULT-TERM-FRAME*", $MAIN);
        defparameter("*CB-DEFAULT-ASSERTION-FRAME*", $MAIN);
        defparameter("*CB-ASSERTION-LINK-HOOK*", NIL);
        defparameter("*CB-CONSTANT-INPUT-WIDTH*", $int$40);
        defparameter("*CB-HLMT-INPUT-WIDTH*", $int$50);
        defparameter("*CB-NONREVIEWABLE-ASSERTION-MARKERS*", $list64);
        defparameter("*CB-KE-REVIEW-START-DATE*", $int$19990921);
        defparameter("*CB-KE-REVIEW-END-DATE*", $int$29991231);
        defparameter("*CB-VIEWPOINT-SHOW-DOC-PREDS*", T);
        defparameter("*CB-VIEWPOINT-SHOW-BOOK-PREDS*", T);
        defparameter("*CB-PERMIT-ROBOTS-TO-FOLLOW?*", NIL);
        defparameter("*CB-PERMIT-ROBOTS-TO-INDEX?*", NIL);
        defparameter("*CB-GLOB*", NIL);
        defparameter("*CB-FORM-URL-PREFIX-PRINT*", CYC_CGI_RELATIVE_URL);
        return NIL;
    }

    public static SubLObject setup_cb_parameters_file() {
        register_html_state_variable($cb_include_help$);
        register_html_state_variable($sym2$_CB_INCLUDE_INFERENCE_HELP__);
        register_html_state_variable($cb_c_default_content$);
        register_html_interface_variable($cb_c_default_content$);
        register_html_state_variable($cb_c_maximal_upper_bound$);
        register_html_interface_variable($cb_c_maximal_upper_bound$);
        register_html_state_variable($cb_c_assertion_formulas_display$);
        register_html_interface_variable($cb_c_assertion_formulas_display$);
        register_html_state_variable($cb_constant_history_max$);
        register_html_interface_variable($cb_constant_history_max$);
        register_html_state_variable($sym10$_CB_USE_CATEGORIZED_HISTORY__);
        register_html_interface_variable($sym10$_CB_USE_CATEGORIZED_HISTORY__);
        register_html_state_variable($cb_constant_history_chronological_max$);
        register_html_interface_variable($cb_constant_history_chronological_max$);
        register_html_state_variable($cb_constant_history$);
        register_html_interface_variable($cb_constant_history$);
        register_html_state_variable($cb_nat_history_max$);
        register_html_interface_variable($cb_nat_history_max$);
        register_html_state_variable($cb_nat_history$);
        register_html_interface_variable($cb_nat_history$);
        register_html_state_variable($cb_assertion_history_max$);
        register_html_interface_variable($cb_assertion_history_max$);
        register_html_state_variable($cb_assertion_history$);
        register_html_state_variable($cb_sentence_history_max$);
        register_html_interface_variable($cb_sentence_history_max$);
        register_html_state_variable($cb_sentence_history$);
        register_html_state_variable($sym19$_CB_HISTORY_SHOW_EL_FORMULAS__);
        register_html_interface_variable($sym19$_CB_HISTORY_SHOW_EL_FORMULAS__);
        register_html_state_variable($cb_status_update_interval$);
        register_html_interface_variable($cb_status_update_interval$);
        register_html_state_variable($cb_destroy_all_inferences_but_last_n$);
        register_html_interface_variable($cb_destroy_all_inferences_but_last_n$);
        register_html_state_variable($sym22$_CB_PERFORM_ARGUMENTATION_FOR_CLOSED_QUERY__);
        register_html_interface_variable($sym22$_CB_PERFORM_ARGUMENTATION_FOR_CLOSED_QUERY__);
        register_html_state_variable($cb_c_wrap_assertions$);
        register_html_interface_variable($cb_c_wrap_assertions$);
        register_html_state_variable($cb_a_show_el_formula$);
        register_html_interface_variable($cb_a_show_el_formula$);
        register_html_state_variable($cb_a_show_hl_formula$);
        register_html_interface_variable($cb_a_show_hl_formula$);
        register_html_state_variable($sym26$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__);
        register_html_interface_variable($sym26$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__);
        register_html_state_variable($sym27$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__);
        register_html_interface_variable($sym27$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__);
        register_html_state_variable($cb_a_perform_access_diagnostics$);
        register_html_interface_variable($cb_a_perform_access_diagnostics$);
        register_html_state_variable($cb_a_show_english$);
        register_html_interface_variable($cb_a_show_english$);
        register_html_state_variable($cb_wrap_interactor$);
        register_html_interface_variable($cb_wrap_interactor$);
        register_html_state_variable($cb_a_show_newlines_in_string_args$);
        register_html_interface_variable($cb_a_show_newlines_in_string_args$);
        register_html_state_variable($cb_use_gke_to_edit_el_sentences$);
        register_html_interface_variable($cb_use_gke_to_edit_el_sentences$);
        register_html_state_variable($cb_use_dynamic_table_for_inference_results$);
        register_html_interface_variable($cb_use_dynamic_table_for_inference_results$);
        register_html_state_variable($cb_show_cyclify_button$);
        register_html_interface_variable($cb_show_cyclify_button$);
        register_html_state_variable($cb_enable_inference_monitoring$);
        register_html_interface_variable($cb_enable_inference_monitoring$);
        register_html_state_variable($cb_assert_queue_default$);
        register_html_interface_variable($cb_assert_queue_default$);
        register_html_state_variable($cb_separate_assertion_frame$);
        register_html_state_variable($cb_user_toolbar_links$);
        register_html_interface_variable($cb_user_toolbar_links$);
        register_html_state_variable($cb_separate_doc_frame$);
        register_html_interface_variable($cb_separate_doc_frame$);
        register_html_state_variable($cb_more_assertion_marker_image_text$);
        register_html_interface_variable($cb_more_assertion_marker_image_text$);
        register_html_state_variable($cb_ke_text_mode$);
        register_html_interface_variable($cb_ke_text_mode$);
        register_html_state_variable($sym46$_CB_FAST__);
        register_html_interface_variable($sym46$_CB_FAST__);
        register_html_state_variable($cb_max_assertions_non_collapsed$);
        register_html_interface_variable($cb_max_assertions_non_collapsed$);
        register_html_state_variable($cb_default_mt$);
        register_html_interface_variable($cb_default_mt$);
        mt_vars.note_mt_var($cb_default_mt$, UNPROVIDED);
        register_html_state_variable($cb_editing_enabled$);
        register_html_state_variable($cb_js_sentence_editor_enabled$);
        register_html_interface_variable($cb_js_sentence_editor_enabled$);
        register_html_state_variable($show_kb_monitor_links$);
        register_html_state_variable($cb_confirm_kills$);
        register_html_state_variable($cb_specify_show_gloss$);
        register_html_state_variable($sym58$_CB_LUCKY_TERM_SEARCH__);
        register_html_state_variable($cb_mts_filter_use_genlmt$);
        register_html_state_variable($cb_use_ke_review_creators$);
        register_html_state_variable($cb_ke_review_creators$);
        register_html_state_variable($cb_ke_review_start_date$);
        register_html_state_variable($cb_ke_review_end_date$);
        register_html_state_variable($cb_viewpoint_show_doc_preds$);
        register_html_state_variable($cb_viewpoint_show_book_preds$);
        register_html_state_variable($cb_glob$);
        sethash($MINI_LOGO, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str83$mini_logo_gif, NIL));
        register_macro_helper(CB_HEAD_SHORTCUT_ICON, CB_HEAD);
        register_macro_helper(CYC_CGI_URL_INT, CYC_CGI_URL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_parameters_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_parameters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_parameters_file();
    }

    static {




















































































































































































































































































    }
}

/**
 * Total time: 401 ms
 */
