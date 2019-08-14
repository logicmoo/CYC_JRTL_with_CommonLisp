/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
 * module:      CB-PARAMETERS
 * source file: /cyc/top/cycl/cb-parameters.lisp
 * created:     2019/07/03 17:38:03
 */
public final class cb_parameters extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt109$ = makeString("");

    public static final SubLSymbol $html_form_method_post$ = makeSymbol("*HTML-FORM-METHOD-POST*");

    public static final SubLSymbol $cb_show_enhanced_tables$ = makeSymbol("*CB-SHOW-ENHANCED-TABLES*");

    public static final SubLSymbol $cb_a_include_kif_link$ = makeSymbol("*CB-A-INCLUDE-KIF-LINK*");

    public static final SubLFile me = new cb_parameters();

 public static final String myName = "com.cyc.cycjava.cycl.cb_parameters";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $transcript_file_shorthand$ = makeSymbol("*TRANSCRIPT-FILE-SHORTHAND*");







    // deflexical
    // The default number of last n inferences to keep. Right now defaults to 10
    /**
     * The default number of last n inferences to keep. Right now defaults to 10
     */
    @LispMethod(comment = "The default number of last n inferences to keep. Right now defaults to 10\ndeflexical")
    public static final SubLSymbol $cb_destroy_all_inferences_but_last_n_default$ = makeSymbol("*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N-DEFAULT*");









    // deflexical
    /**
     * The term to use as an indexical for an assertion that is assumed by the
     * context of a tool. For example, the [Assert Meta] tool.
     */
    @LispMethod(comment = "The term to use as an indexical for an assertion that is assumed by the\r\ncontext of a tool. For example, the [Assert Meta] tool.\ndeflexical\nThe term to use as an indexical for an assertion that is assumed by the\ncontext of a tool. For example, the [Assert Meta] tool.")
    public static final SubLSymbol $cb_assertion_indexical$ = makeSymbol("*CB-ASSERTION-INDEXICAL*");



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_c_suppress_body_level_elements$ = makeSymbol("*CB-C-SUPPRESS-BODY-LEVEL-ELEMENTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_c_gaf_arg_last_mt$ = makeSymbol("*CB-C-GAF-ARG-LAST-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_c_gaf_arg_use_binary$ = makeSymbol("*CB-C-GAF-ARG-USE-BINARY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_c_nart_arg_use_binary$ = makeSymbol("*CB-C-NART-ARG-USE-BINARY*");

    // defparameter
    /**
     * NIL or an index-hook that will be treated as an exception to the value of
     * cb-c-assertion-formulas-display*, specifying whether EL or HL assertion
     * formulas should be displayed when browsing an index hook.
     */
    @LispMethod(comment = "NIL or an index-hook that will be treated as an exception to the value of\r\ncb-c-assertion-formulas-display*, specifying whether EL or HL assertion\r\nformulas should be displayed when browsing an index hook.\ndefparameter\nNIL or an index-hook that will be treated as an exception to the value of\ncb-c-assertion-formulas-display*, specifying whether EL or HL assertion\nformulas should be displayed when browsing an index hook.")
    public static final SubLSymbol $cb_c_formula_display_exception_index_hook$ = makeSymbol("*CB-C-FORMULA-DISPLAY-EXCEPTION-INDEX-HOOK*");

    // defparameter
    /**
     * Used in the course of displaying a group of EL assertion formulas to
     * determine if an assertion with the same formula has been displayed
     * immediately previously.
     */
    @LispMethod(comment = "Used in the course of displaying a group of EL assertion formulas to\r\ndetermine if an assertion with the same formula has been displayed\r\nimmediately previously.\ndefparameter\nUsed in the course of displaying a group of EL assertion formulas to\ndetermine if an assertion with the same formula has been displayed\nimmediately previously.")
    public static final SubLSymbol $cb_show_el_assertion_readably_last_formula$ = makeSymbol("*CB-SHOW-EL-ASSERTION-READABLY-LAST-FORMULA*");

    // defparameter
    /**
     * Used in the course of displaying a group of EL assertion formulas to
     * determine if an assertion with the same formula and mt has been displayed
     * immediately previously.
     */
    @LispMethod(comment = "Used in the course of displaying a group of EL assertion formulas to\r\ndetermine if an assertion with the same formula and mt has been displayed\r\nimmediately previously.\ndefparameter\nUsed in the course of displaying a group of EL assertion formulas to\ndetermine if an assertion with the same formula and mt has been displayed\nimmediately previously.")
    public static final SubLSymbol $cb_show_el_assertion_readably_last_mt$ = makeSymbol("*CB-SHOW-EL-ASSERTION-READABLY-LAST-MT*");

    // defparameter
    /**
     * A dictionary the keys of which are assertions, and the values assertion EL
     * formulas. These are cached in the course of browsing terms.
     */
    @LispMethod(comment = "A dictionary the keys of which are assertions, and the values assertion EL\r\nformulas. These are cached in the course of browsing terms.\ndefparameter\nA dictionary the keys of which are assertions, and the values assertion EL\nformulas. These are cached in the course of browsing terms.")
    public static final SubLSymbol $cb_assertion_el_formula_cache$ = makeSymbol("*CB-ASSERTION-EL-FORMULA-CACHE*");

    // defparameter
    // The frame to use as the default target for term links
    /**
     * The frame to use as the default target for term links
     */
    @LispMethod(comment = "The frame to use as the default target for term links\ndefparameter")
    public static final SubLSymbol $cb_default_term_frame$ = makeSymbol("*CB-DEFAULT-TERM-FRAME*");

    // defparameter
    // The frame to use as the default target for assertion links
    /**
     * The frame to use as the default target for assertion links
     */
    @LispMethod(comment = "The frame to use as the default target for assertion links\ndefparameter")
    public static final SubLSymbol $cb_default_assertion_frame$ = makeSymbol("*CB-DEFAULT-ASSERTION-FRAME*");

    // defparameter
    /**
     * When non-nil, a function to funcall on each assertion when displaying an
     * assertion link.
     */
    @LispMethod(comment = "When non-nil, a function to funcall on each assertion when displaying an\r\nassertion link.\ndefparameter\nWhen non-nil, a function to funcall on each assertion when displaying an\nassertion link.")
    public static final SubLSymbol $cb_assertion_link_hook$ = makeSymbol("*CB-ASSERTION-LINK-HOOK*");

    // defparameter
    // The default width for text inputs intended to contain constant names.
    /**
     * The default width for text inputs intended to contain constant names.
     */
    @LispMethod(comment = "The default width for text inputs intended to contain constant names.\ndefparameter")
    public static final SubLSymbol $cb_constant_input_width$ = makeSymbol("*CB-CONSTANT-INPUT-WIDTH*");

    // defparameter
    // The default width for text input of HLMTs.
    /**
     * The default width for text input of HLMTs.
     */
    @LispMethod(comment = "The default width for text input of HLMTs.\ndefparameter")
    public static final SubLSymbol $cb_hlmt_input_width$ = makeSymbol("*CB-HLMT-INPUT-WIDTH*");

    // defparameter
    // Don't review assertions that have these markers.
    /**
     * Don't review assertions that have these markers.
     */
    @LispMethod(comment = "Don\'t review assertions that have these markers.\ndefparameter")
    public static final SubLSymbol $cb_nonreviewable_assertion_markers$ = makeSymbol("*CB-NONREVIEWABLE-ASSERTION-MARKERS*");

    // defparameter
    // By default, we do not permit robots to follow our links.
    /**
     * By default, we do not permit robots to follow our links.
     */
    @LispMethod(comment = "By default, we do not permit robots to follow our links.\ndefparameter")
    public static final SubLSymbol $cb_permit_robots_to_followP$ = makeSymbol("*CB-PERMIT-ROBOTS-TO-FOLLOW?*");

    // defparameter
    // By default, we do not permit robots to index our links.
    /**
     * By default, we do not permit robots to index our links.
     */
    @LispMethod(comment = "By default, we do not permit robots to index our links.\ndefparameter")
    public static final SubLSymbol $cb_permit_robots_to_indexP$ = makeSymbol("*CB-PERMIT-ROBOTS-TO-INDEX?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_form_url_prefix_print$ = makeSymbol("*CB-FORM-URL-PREFIX-PRINT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeString("read"), list(makeSymbol("READ-TRANSCRIPT"))), list(makeString("write"), list(makeSymbol("LOCAL-TRANSCRIPT"))), list(makeString("local"), list(makeSymbol("LOCAL-TRANSCRIPT"))), list(makeString("master"), list(makeSymbol("MASTER-TRANSCRIPT"))));

    public static final SubLSymbol $cb_include_help$ = makeSymbol("*CB-INCLUDE-HELP*");

    public static final SubLSymbol $cb_include_inference_helpP$ = makeSymbol("*CB-INCLUDE-INFERENCE-HELP?*");

    public static final SubLSymbol $cb_c_default_content$ = makeSymbol("*CB-C-DEFAULT-CONTENT*");



    public static final SubLSymbol $cb_c_maximal_upper_bound$ = makeSymbol("*CB-C-MAXIMAL-UPPER-BOUND*");

    public static final SubLSymbol $cb_c_assertion_formulas_display$ = makeSymbol("*CB-C-ASSERTION-FORMULAS-DISPLAY*");

    public static final SubLSymbol $cb_constant_history_max$ = makeSymbol("*CB-CONSTANT-HISTORY-MAX*");

    public static final SubLSymbol $cb_use_categorized_historyP$ = makeSymbol("*CB-USE-CATEGORIZED-HISTORY?*");

    public static final SubLSymbol $cb_constant_history_chronological_max$ = makeSymbol("*CB-CONSTANT-HISTORY-CHRONOLOGICAL-MAX*");

    public static final SubLSymbol $cb_constant_history$ = makeSymbol("*CB-CONSTANT-HISTORY*");

    public static final SubLSymbol $cb_nat_history_max$ = makeSymbol("*CB-NAT-HISTORY-MAX*");

    public static final SubLSymbol $cb_nat_history$ = makeSymbol("*CB-NAT-HISTORY*");

    public static final SubLSymbol $cb_assertion_history_max$ = makeSymbol("*CB-ASSERTION-HISTORY-MAX*");

    public static final SubLSymbol $cb_assertion_history$ = makeSymbol("*CB-ASSERTION-HISTORY*");

    public static final SubLSymbol $cb_sentence_history_max$ = makeSymbol("*CB-SENTENCE-HISTORY-MAX*");

    public static final SubLSymbol $cb_sentence_history$ = makeSymbol("*CB-SENTENCE-HISTORY*");

    public static final SubLSymbol $cb_status_update_interval$ = makeSymbol("*CB-STATUS-UPDATE-INTERVAL*");

    public static final SubLSymbol $cb_destroy_all_inferences_but_last_n$ = makeSymbol("*CB-DESTROY-ALL-INFERENCES-BUT-LAST-N*");

    public static final SubLSymbol $cb_c_wrap_assertions$ = makeSymbol("*CB-C-WRAP-ASSERTIONS*");

    public static final SubLSymbol $cb_a_show_el_formula$ = makeSymbol("*CB-A-SHOW-EL-FORMULA*");

    public static final SubLSymbol $cb_a_show_hl_formula$ = makeSymbol("*CB-A-SHOW-HL-FORMULA*");

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

    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLSymbol $cb_max_assertions_non_collapsed$ = makeSymbol("*CB-MAX-ASSERTIONS-NON-COLLAPSED*");



    public static final SubLSymbol $cb_default_mt$ = makeSymbol("*CB-DEFAULT-MT*");

    public static final SubLSymbol $cb_editing_enabled$ = makeSymbol("*CB-EDITING-ENABLED*");

    public static final SubLSymbol $cb_js_sentence_editor_enabled$ = makeSymbol("*CB-JS-SENTENCE-EDITOR-ENABLED*");

    public static final SubLSymbol $show_kb_monitor_links$ = makeSymbol("*SHOW-KB-MONITOR-LINKS*");

    public static final SubLSymbol $cb_confirm_kills$ = makeSymbol("*CB-CONFIRM-KILLS*");



    public static final SubLSymbol $cb_specify_show_gloss$ = makeSymbol("*CB-SPECIFY-SHOW-GLOSS*");


    public static final SubLSymbol $cb_mts_filter_use_genlmt$ = makeSymbol("*CB-MTS-FILTER-USE-GENLMT*");

    public static final SubLSymbol $cb_use_ke_review_creators$ = makeSymbol("*CB-USE-KE-REVIEW-CREATORS*");

    public static final SubLSymbol $cb_ke_review_creators$ = makeSymbol("*CB-KE-REVIEW-CREATORS*");



    private static final SubLList $list64 = list(makeKeyword("DERIVED"), $CODE);

    private static final SubLInteger $int$19990921 = makeInteger(19990921);

    public static final SubLSymbol $cb_ke_review_start_date$ = makeSymbol("*CB-KE-REVIEW-START-DATE*");

    private static final SubLInteger $int$29991231 = makeInteger(29991231);

    public static final SubLSymbol $cb_ke_review_end_date$ = makeSymbol("*CB-KE-REVIEW-END-DATE*");

    public static final SubLSymbol $cb_viewpoint_show_doc_preds$ = makeSymbol("*CB-VIEWPOINT-SHOW-DOC-PREDS*");

    public static final SubLSymbol $cb_viewpoint_show_book_preds$ = makeSymbol("*CB-VIEWPOINT-SHOW-BOOK-PREDS*");

    public static final SubLSymbol $cb_glob$ = makeSymbol("*CB-GLOB*");

    private static final SubLList $list72 = list(list(makeSymbol("ID"), makeSymbol("OBJECT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list73 = list($DONE);

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

    static private final SubLList $list96 = list(list(makeSymbol("&OPTIONAL"), makeSymbol("TARGET"), makeSymbol("SCRIPT"), list(makeSymbol("METHOD"), makeSymbol("*HTML-FORM-METHOD-POST*")), makeSymbol("ID")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym97$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    private static final SubLSymbol CB_FRAME_NAME = makeSymbol("CB-FRAME-NAME");

    private static final SubLSymbol HTML_FANCY_FORM = makeSymbol("HTML-FANCY-FORM");

    private static final SubLSymbol $cyc_cgi_program$ = makeSymbol("*CYC-CGI-PROGRAM*");

    static private final SubLList $list102 = list(list(makeSymbol("HANDLER-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("TARGET"), list(makeSymbol("VALUE"), T), makeSymbol("SCRIPT"), list(makeSymbol("METHOD"), makeSymbol("*HTML-FORM-METHOD-POST*")), makeSymbol("ID")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CB_BASIC_FORM = makeSymbol("CB-BASIC-FORM");

    private static final SubLSymbol HTML_HIDDEN_INPUT = makeSymbol("HTML-HIDDEN-INPUT");

    static private final SubLList $list105 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), $MAIN), list(makeSymbol("TITLE"), NIL), makeSymbol("CLASS"), makeSymbol("ATTRS"));

    static private final SubLSymbol $sym106$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    static private final SubLList $list113 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TITLE"), NIL));

    private static final SubLSymbol FRAME_LINK = makeSymbol("FRAME-LINK");

    private static final SubLList $list116 = list(makeSymbol("URL"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), $MAIN), list(makeSymbol("TITLE"), NIL), list(makeSymbol("ID"), NIL));

    private static final SubLSymbol $sym117$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    private static final SubLList $list119 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), makeSymbol("TARGET"), list(makeSymbol("OPTIONS"), makeString("")));

    private static final SubLString $str120$ = makeString("");

    static private final SubLSymbol $sym121$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    private static final SubLList $list124 = list(makeSymbol("HTML-FORMAT"), makeString("window.open('"));

    private static final SubLList $list125 = list(makeSymbol("HTML-FORMAT"), makeString("',"));

    private static final SubLString $str128$__A_ = makeString("'~A'");

    static private final SubLList $list129 = list(list(makeSymbol("HTML-FORMAT"), makeString("null")));

    private static final SubLString $str130$___A____ = makeString(",'~A'); ");

    private static final SubLList $list131 = list(list(makeSymbol("HTML-FORMAT"), makeString("return false;")));

    private static final SubLSymbol $sym132$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    private static final SubLList $list133 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), $MAIN), makeSymbol("HOVEROVER-HTML"), makeSymbol("CAPTION"), makeSymbol("WIDTH"), makeSymbol("STICKY"));

    private static final SubLSymbol $sym134$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    private static final SubLList $list135 = list(makeSymbol("JAVASCRIPT"), makeKeyword("OVERLIB"));

    private static final SubLSymbol HTML_HOVEROVER_ANCHOR = makeSymbol("HTML-HOVEROVER-ANCHOR");

    static private final SubLList $list141 = list(makeSymbol("LINK-TYPE"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str142$CB_LINK__A = makeString("CB-LINK-~A");

    private static final SubLSymbol SETUP_CB_LINK_METHOD = makeSymbol("SETUP-CB-LINK-METHOD");

    static private final SubLList $list146 = list(makeSymbol("TOOL-LINK-TYPE"), makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), $MAIN), list(makeSymbol("TITLE"), NIL));

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

    static private final SubLList $list161 = list(list(new SubLObject[]{ makeSymbol("TITLE"), makeSymbol("&KEY"), makeSymbol("COMPLETION?"), makeSymbol("PASSWORD?"), makeSymbol("DHTML?"), makeSymbol("HELP"), list(makeSymbol("COLOR"), list(QUOTE, makeSymbol("*HTML-DEFAULT-BGCOLOR*"))), list(makeSymbol("SHOW-COPYRIGHT"), T), list(makeSymbol("OMIT-HEADING?"), NIL) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list162 = list(makeKeyword("COMPLETION?"), makeKeyword("PASSWORD?"), makeKeyword("DHTML?"), $HELP, makeKeyword("COLOR"), makeKeyword("SHOW-COPYRIGHT"), makeKeyword("OMIT-HEADING?"));

    private static final SubLSymbol $html_default_bgcolor$ = makeSymbol("*HTML-DEFAULT-BGCOLOR*");

    private static final SubLSymbol $kw170$OMIT_HEADING_ = makeKeyword("OMIT-HEADING?");

    private static final SubLSymbol $sym171$TITLE_VAR = makeUninternedSymbol("TITLE-VAR");

    private static final SubLSymbol WITH_HTML_ID_SPACE = makeSymbol("WITH-HTML-ID-SPACE");

    static private final SubLList $list174 = list(makeSymbol("HTML-BASIC-CB-SCRIPTS"));

    private static final SubLSymbol HTML_TITLE = makeSymbol("HTML-TITLE");

    private static final SubLList $list177 = list(list(makeSymbol("HTML-COMPLETE-SCRIPT")), list(makeSymbol("CSS"), makeKeyword("SAM-AUTOCOMPLETE-CSS")));

    static private final SubLList $list178 = list(list(makeSymbol("JAVASCRIPT"), makeKeyword("SHA1")));

    private static final SubLList $list179 = list(list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")));

    private static final SubLList $list182 = list(makeSymbol("HTML-FANCY-DIV"), list(makeKeyword("ID"), makeString("reloadFrameButton")), list(makeSymbol("HTML-FANCY-INPUT"), makeString("button"), $NAME, makeString("reload"), makeKeyword("VALUE"), makeString("Refresh Frames")));

    private static final SubLSymbol HTML_HEADING = makeSymbol("HTML-HEADING");

    private static final SubLList $list186 = list(TWO_INTEGER);

    private static final SubLSymbol CB_HELP_PREAMBLE = makeSymbol("CB-HELP-PREAMBLE");

    private static final SubLList $list188 = list(list(makeSymbol("HTML-INDENT")));

    private static final SubLList $list189 = list(makeSymbol("INDEX"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list190 = list(list(makeSymbol("INDEX"), makeSymbol("TITLE"), makeSymbol("&KEY"), makeSymbol("COMPLETION?"), makeSymbol("DHTML?"), list(makeSymbol("COLOR"), list(QUOTE, makeSymbol("*HTML-DEFAULT-BGCOLOR*")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list191 = list(makeKeyword("COMPLETION?"), makeKeyword("DHTML?"), makeKeyword("COLOR"));

    private static final SubLSymbol $sym192$TITLE_VAR = makeUninternedSymbol("TITLE-VAR");

    private static final SubLList $list193 = list(list(makeSymbol("HTML-COMPLETE-SCRIPT")));

    private static final SubLList $list194 = list(list(makeSymbol("DHTML-WITH-DOM-SCRIPT")), list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")));

    private static final SubLList $list195 = list(makeSymbol("HTML-FANCY-DIV"), list(makeKeyword("ID"), makeString("reloadFrameButton")), list(makeSymbol("HTML-FANCY-INPUT"), makeString("button"), $NAME, makeString("reload"), makeKeyword("VALUE"), makeString("Refresh"), makeKeyword("ONCLICK"), makeString("reloadCurrentFrame('reloadFrameButton');")));

    private static final SubLSymbol CB_C_CONTENT_PAGE = makeSymbol("CB-C-CONTENT-PAGE");

    private static final SubLSymbol WITH_PPH_MEMOIZATION = makeSymbol("WITH-PPH-MEMOIZATION");

    private static final SubLList $list199 = list(list(makeSymbol("*PPH-LANGUAGE-MT*"), list(makeSymbol("CB-PARAPHRASE-MT"))), list(makeSymbol("*PARAPHRASE-MODE*"), $HTML));

    public static final SubLObject cb_editing_enabled_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return system_parameters.$cb_editing_enabledP$.getDynamicValue(thread);
        }
    }

    public static SubLObject cb_editing_enabled_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_parameters.$cb_editing_enabledP$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-MTS-FILTER-USE-GENLMT*
     */
    @LispMethod(comment = "Accessor for *CB-MTS-FILTER-USE-GENLMT*")
    public static final SubLObject cb_mts_filter_use_genlmt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_mts_filter_use_genlmt$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-MTS-FILTER-USE-GENLMT*
     */
    @LispMethod(comment = "Accessor for *CB-MTS-FILTER-USE-GENLMT*")
    public static SubLObject cb_mts_filter_use_genlmt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_mts_filter_use_genlmt$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-MTS-FILTER-USE-GENLMT*
     */
    @LispMethod(comment = "Set function for *CB-MTS-FILTER-USE-GENLMT*")
    public static final SubLObject set_cb_mts_filter_use_genlmt_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_mts_filter_use_genlmt$.setDynamicValue(new_value, thread);
            return $cb_mts_filter_use_genlmt$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-MTS-FILTER-USE-GENLMT*
     */
    @LispMethod(comment = "Set function for *CB-MTS-FILTER-USE-GENLMT*")
    public static SubLObject set_cb_mts_filter_use_genlmt(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_mts_filter_use_genlmt$.setDynamicValue(new_value, thread);
        return $cb_mts_filter_use_genlmt$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-USE-KE-REVIEW-CREATORS*
     */
    @LispMethod(comment = "Accessor for *CB-USE-KE-REVIEW-CREATORS*")
    public static final SubLObject cb_use_ke_review_creators_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_use_ke_review_creators$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-USE-KE-REVIEW-CREATORS*
     */
    @LispMethod(comment = "Accessor for *CB-USE-KE-REVIEW-CREATORS*")
    public static SubLObject cb_use_ke_review_creators() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_use_ke_review_creators$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-USE-KE-REVIEW-CREATORS*
     */
    @LispMethod(comment = "Set function for *CB-USE-KE-REVIEW-CREATORS*")
    public static final SubLObject set_cb_use_ke_review_creators_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_use_ke_review_creators$.setDynamicValue(new_value, thread);
            return $cb_use_ke_review_creators$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-USE-KE-REVIEW-CREATORS*
     */
    @LispMethod(comment = "Set function for *CB-USE-KE-REVIEW-CREATORS*")
    public static SubLObject set_cb_use_ke_review_creators(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_use_ke_review_creators$.setDynamicValue(new_value, thread);
        return $cb_use_ke_review_creators$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-KE-REVIEW-CREATORS*
     */
    @LispMethod(comment = "Accessor for *CB-KE-REVIEW-CREATORS*")
    public static final SubLObject cb_ke_review_creators_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_ke_review_creators$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-KE-REVIEW-CREATORS*
     */
    @LispMethod(comment = "Accessor for *CB-KE-REVIEW-CREATORS*")
    public static SubLObject cb_ke_review_creators() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_ke_review_creators$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-KE-REVIEW-CREATORS*
     */
    @LispMethod(comment = "Set function for *CB-KE-REVIEW-CREATORS*")
    public static final SubLObject set_cb_ke_review_creators_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_ke_review_creators$.setDynamicValue(new_value, thread);
            return $cb_ke_review_creators$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-KE-REVIEW-CREATORS*
     */
    @LispMethod(comment = "Set function for *CB-KE-REVIEW-CREATORS*")
    public static SubLObject set_cb_ke_review_creators(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_ke_review_creators$.setDynamicValue(new_value, thread);
        return $cb_ke_review_creators$.getDynamicValue(thread);
    }

    /**
     * Return the object with ID in the interface glob.
     */
    @LispMethod(comment = "Return the object with ID in the interface glob.")
    public static final SubLObject cb_glob_lookup_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
                if (NIL == v_glob) {
                    return values(NIL, NIL);
                }
                return glob.glob_lookup(v_glob, id, UNPROVIDED);
            }
        }
    }

    /**
     * Return the object with ID in the interface glob.
     */
    @LispMethod(comment = "Return the object with ID in the interface glob.")
    public static SubLObject cb_glob_lookup(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
        if (NIL == v_glob) {
            return values(NIL, NIL);
        }
        return glob.glob_lookup(v_glob, id, UNPROVIDED);
    }

    public static final SubLObject cb_glob_lookup_by_string_alt(SubLObject id_string) {
        return cb_glob_lookup(string_utilities.string_to_integer(id_string));
    }

    public static SubLObject cb_glob_lookup_by_string(final SubLObject id_string) {
        return cb_glob_lookup(string_utilities.string_to_integer(id_string));
    }

    /**
     * Return the ID in the interface glob of OBJECT.
     */
    @LispMethod(comment = "Return the ID in the interface glob of OBJECT.")
    public static final SubLObject cb_glob_id_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
                if (NIL == v_glob) {
                    v_glob = glob.new_glob(symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                    $cb_glob$.setDynamicValue(v_glob, thread);
                }
                return glob.glob_enter(v_glob, v_object);
            }
        }
    }

    /**
     * Return the ID in the interface glob of OBJECT.
     */
    @LispMethod(comment = "Return the ID in the interface glob of OBJECT.")
    public static SubLObject cb_glob_id(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
        if (NIL == v_glob) {
            v_glob = glob.new_glob(symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
            $cb_glob$.setDynamicValue(v_glob, thread);
        }
        return glob.glob_enter(v_glob, v_object);
    }

    /**
     * Remove OBJECT from the interface glob.
     */
    @LispMethod(comment = "Remove OBJECT from the interface glob.")
    public static final SubLObject cb_glob_remove_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
                if (NIL == v_glob) {
                    return NIL;
                }
                return glob.glob_remove(v_glob, v_object);
            }
        }
    }

    /**
     * Remove OBJECT from the interface glob.
     */
    @LispMethod(comment = "Remove OBJECT from the interface glob.")
    public static SubLObject cb_glob_remove(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
        if (NIL == v_glob) {
            return NIL;
        }
        return glob.glob_remove(v_glob, v_object);
    }

    /**
     * Remove the object with ID from the interface glob.
     */
    @LispMethod(comment = "Remove the object with ID from the interface glob.")
    public static final SubLObject cb_glob_remove_id_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
                if (NIL == v_glob) {
                    return NIL;
                }
                return glob.glob_remove_id(v_glob, id);
            }
        }
    }

    /**
     * Remove the object with ID from the interface glob.
     */
    @LispMethod(comment = "Remove the object with ID from the interface glob.")
    public static SubLObject cb_glob_remove_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
        if (NIL == v_glob) {
            return NIL;
        }
        return glob.glob_remove_id(v_glob, id);
    }

    /**
     * Clear all current assignments in the interface glob.
     */
    @LispMethod(comment = "Clear all current assignments in the interface glob.")
    public static final SubLObject cb_glob_reset_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
                if (NIL == v_glob) {
                    return NIL;
                }
                return glob.glob_reset(v_glob);
            }
        }
    }

    /**
     * Clear all current assignments in the interface glob.
     */
    @LispMethod(comment = "Clear all current assignments in the interface glob.")
    public static SubLObject cb_glob_reset() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_glob = $cb_glob$.getDynamicValue(thread);
        if (NIL == v_glob) {
            return NIL;
        }
        return glob.glob_reset(v_glob);
    }

    /**
     * Iterate over all ID -> OBJECT mappings indexed in the interface glob evaluating BODY.
     * Iteration halts when DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all ID -> OBJECT mappings indexed in the interface glob evaluating BODY.\r\nIteration halts when DONE becomes non-nil.\nIterate over all ID -> OBJECT mappings indexed in the interface glob evaluating BODY.\nIteration halts when DONE becomes non-nil.")
    public static final SubLObject do_cb_glob_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt67);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject id = NIL;
                    SubLObject v_object = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt67);
                    id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt67);
                    v_object = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt67);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt67);
                            if (NIL == member(current_1, $list_alt68, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt67);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_GLOB, list(id, v_object, $cb_glob$, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over all ID -> OBJECT mappings indexed in the interface glob evaluating BODY.
     * Iteration halts when DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all ID -> OBJECT mappings indexed in the interface glob evaluating BODY.\r\nIteration halts when DONE becomes non-nil.\nIterate over all ID -> OBJECT mappings indexed in the interface glob evaluating BODY.\nIteration halts when DONE becomes non-nil.")
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

    /**
     *
     *
     * @return non-dotted-list-p; all objects in the interface glob that pass the test PRED
     */
    @LispMethod(comment = "@return non-dotted-list-p; all objects in the interface glob that pass the test PRED")
    public static final SubLObject cb_glob_find_all_if_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pred, FUNCTION_SPEC_P);
            {
                SubLObject result = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(glob.do_glob_index($cb_glob$.getDynamicValue(thread))));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject v_object = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != funcall(pred, v_object)) {
                            result = cons(v_object, result);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return result;
            }
        }
    }

    /**
     *
     *
     * @return non-dotted-list-p; all objects in the interface glob that pass the test PRED
     */
    @LispMethod(comment = "@return non-dotted-list-p; all objects in the interface glob that pass the test PRED")
    public static SubLObject cb_glob_find_all_if(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(pred) : "! function_spec_p(pred) " + ("Types.function_spec_p(pred) " + "CommonSymbols.NIL != Types.function_spec_p(pred) ") + pred;
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

    public static final SubLObject cb_head_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(HTML_HEAD, $list_alt74, $list_alt75, append(body, NIL));
        }
    }

    public static SubLObject cb_head(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_HEAD, $list79, $list80, $list81, append(body, NIL));
    }

    public static final SubLObject cb_head_shortcut_icon_alt() {
        {
            SubLObject shortcut_icon = cyc_file_dependencies.cb_icon_file_path($MINI_LOGO);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_link_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_link_rel$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$SHORTCUT_ICON);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != shortcut_icon) {
                html_markup(html_macros.$html_link_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(shortcut_icon);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
        }
        return NIL;
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

    public static final SubLObject cyc_cgi_url_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(PROGN, $list_alt82, append(body, NIL));
        }
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

    public static final SubLObject cyc_cgi_url_int_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_markup($str_alt85$_);
            return NIL;
        }
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

    public static final SubLObject cb_basic_form_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt86);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject target = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt86);
                    current = current.rest();
                    {
                        SubLObject script = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt86);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject frame_name_var = $sym87$FRAME_NAME_VAR;
                                return list(CLET, list(list(frame_name_var, list(CB_FRAME_NAME, target))), listS(HTML_FANCY_FORM, list($cyc_cgi_program$, $html_form_method_post$, frame_name_var, NIL, script), append(body, NIL)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt86);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject cb_basic_form_handler_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt93);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject handler_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt93);
                    handler_name = current.first();
                    current = current.rest();
                    {
                        SubLObject target = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt93);
                        current = current.rest();
                        {
                            SubLObject value = (current.isCons()) ? ((SubLObject) (current.first())) : T;
                            destructuring_bind_must_listp(current, datum, $list_alt93);
                            current = current.rest();
                            {
                                SubLObject script = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt93);
                                current = current.rest();
                                if (NIL == current) {
                                    current = temp;
                                    {
                                        SubLObject body = current;
                                        return listS(CB_BASIC_FORM, list(target, script), list(HTML_HIDDEN_INPUT, handler_name, value), append(body, NIL));
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt93);
                                }
                            }
                        }
                    }
                }
            }
        }
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

    /**
     * Adds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY
     * to format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).
     *
     * @unknown TARGET is either the name of frame to use or a keyword for a registered frame @see register-cb-frame.
     */
    @LispMethod(comment = "Adds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY\r\nto format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).\r\n\r\n@unknown TARGET is either the name of frame to use or a keyword for a registered frame @see register-cb-frame.\nAdds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY\nto format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).")
    public static final SubLObject frame_link_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject url_body = NIL;
            SubLObject link_body = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            url_body = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            link_body = current.first();
            current = current.rest();
            {
                SubLObject target = (current.isCons()) ? ((SubLObject) (current.first())) : $MAIN;
                destructuring_bind_must_listp(current, datum, $list_alt96);
                current = current.rest();
                {
                    SubLObject title = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt96);
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject frame_name_var = $sym97$FRAME_NAME_VAR;
                            return list(CLET, list(list(frame_name_var, list(CB_FRAME_NAME, target))), list(HTML_FANCY_ANCHOR, list($TARGET, frame_name_var, $TITLE, title, $HREF, list(CYC_CGI_URL, url_body)), link_body));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt96);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Adds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY
     * to format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).
     *
     * @unknown TARGET is either the name of frame to use or a keyword for a registered frame @see register-cb-frame.
     */
    @LispMethod(comment = "Adds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY\r\nto format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).\r\n\r\n@unknown TARGET is either the name of frame to use or a keyword for a registered frame @see register-cb-frame.\nAdds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY\nto format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).")
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

    /**
     * Adds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY
     * to format the link text, using the current page, with TITLE as the link tool tip (html4).
     */
    @LispMethod(comment = "Adds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY\r\nto format the link text, using the current page, with TITLE as the link tool tip (html4).\nAdds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY\nto format the link text, using the current page, with TITLE as the link tool tip (html4).")
    public static final SubLObject page_link_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject url_body = NIL;
            SubLObject link_body = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt102);
            url_body = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt102);
            link_body = current.first();
            current = current.rest();
            {
                SubLObject title = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt102);
                current = current.rest();
                if (NIL == current) {
                    return list(FRAME_LINK, url_body, link_body, $TOP, title);
                } else {
                    cdestructuring_bind_error(datum, $list_alt102);
                }
            }
        }
        return NIL;
    }

    /**
     * Adds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY
     * to format the link text, using the current page, with TITLE as the link tool tip (html4).
     */
    @LispMethod(comment = "Adds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY\r\nto format the link text, using the current page, with TITLE as the link tool tip (html4).\nAdds HTML link to current HTML stream using URL-BODY to format the URL text and LINK-BODY\nto format the link text, using the current page, with TITLE as the link tool tip (html4).")
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

    /**
     * Adds HTML link to current HTML stream using URL and LINK-BODY
     * to format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).
     *
     * @unknown TARGET is either the name of frame to use or a keyword for a registered frame @see register-cb-frame.
     */
    @LispMethod(comment = "Adds HTML link to current HTML stream using URL and LINK-BODY\r\nto format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).\r\n\r\n@unknown TARGET is either the name of frame to use or a keyword for a registered frame @see register-cb-frame.\nAdds HTML link to current HTML stream using URL and LINK-BODY\nto format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).")
    public static final SubLObject absolute_link_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject url = NIL;
            SubLObject link_body = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            url = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt105);
            link_body = current.first();
            current = current.rest();
            {
                SubLObject target = (current.isCons()) ? ((SubLObject) (current.first())) : $MAIN;
                destructuring_bind_must_listp(current, datum, $list_alt105);
                current = current.rest();
                {
                    SubLObject title = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt105);
                    current = current.rest();
                    {
                        SubLObject id = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt105);
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject frame_name_var = $sym106$FRAME_NAME_VAR;
                                return list(CLET, list(list(frame_name_var, list(CB_FRAME_NAME, target))), list(HTML_FANCY_ANCHOR, list($TARGET, frame_name_var, $TITLE, title, $HREF, url, $ID, id), link_body));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt105);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Adds HTML link to current HTML stream using URL and LINK-BODY
     * to format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).
     *
     * @unknown TARGET is either the name of frame to use or a keyword for a registered frame @see register-cb-frame.
     */
    @LispMethod(comment = "Adds HTML link to current HTML stream using URL and LINK-BODY\r\nto format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).\r\n\r\n@unknown TARGET is either the name of frame to use or a keyword for a registered frame @see register-cb-frame.\nAdds HTML link to current HTML stream using URL and LINK-BODY\nto format the link text, using the frame specified by TARGET, with TITLE as the link tool tip (html4).")
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

    public static final SubLObject new_window_link_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject url_body = NIL;
            SubLObject link_body = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt108);
            url_body = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt108);
            link_body = current.first();
            current = current.rest();
            {
                SubLObject target = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt108);
                current = current.rest();
                {
                    SubLObject options = (current.isCons()) ? ((SubLObject) (current.first())) : $str_alt109$;
                    destructuring_bind_must_listp(current, datum, $list_alt108);
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject frame_name_var = $sym110$FRAME_NAME_VAR;
                            return list(CLET, list(list(frame_name_var, list(FWHEN, target, list(CB_FRAME_NAME, target)))), list(HTML_FANCY_ANCHOR, list($TARGET, frame_name_var, $HREF, list(CYC_CGI_URL, url_body), $ONCLICK, listS(PROGN, new SubLObject[]{ $list_alt113, list(CYC_CGI_URL, url_body), $list_alt114, listS(PIF, target, list(HTML_FORMAT, $str_alt117$__A_, target), $list_alt118), list(HTML_FORMAT, $str_alt119$___A____, options), $list_alt120 })), link_body));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt108);
                    }
                }
            }
        }
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

    public static final SubLObject new_external_window_link_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject url_body = NIL;
            SubLObject link_body = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt108);
            url_body = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt108);
            link_body = current.first();
            current = current.rest();
            {
                SubLObject target = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt108);
                current = current.rest();
                {
                    SubLObject options = (current.isCons()) ? ((SubLObject) (current.first())) : $str_alt109$;
                    destructuring_bind_must_listp(current, datum, $list_alt108);
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject frame_name_var = $sym121$FRAME_NAME_VAR;
                            return list(CLET, list(list(frame_name_var, list(FWHEN, target, list(CB_FRAME_NAME, target)))), list(HTML_FANCY_ANCHOR, list($TARGET, frame_name_var, $HREF, url_body, $ONCLICK, listS(PROGN, new SubLObject[]{ $list_alt113, url_body, $list_alt114, listS(PIF, target, list(HTML_FORMAT, $str_alt117$__A_, target), $list_alt118), list(HTML_FORMAT, $str_alt119$___A____, options), $list_alt120 })), link_body));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt108);
                    }
                }
            }
        }
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

    public static final SubLObject frame_link_hoverover_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject url_body = NIL;
            SubLObject link_body = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt122);
            url_body = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt122);
            link_body = current.first();
            current = current.rest();
            {
                SubLObject target = (current.isCons()) ? ((SubLObject) (current.first())) : $MAIN;
                destructuring_bind_must_listp(current, datum, $list_alt122);
                current = current.rest();
                {
                    SubLObject hoverover_html = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt122);
                    current = current.rest();
                    {
                        SubLObject caption = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt122);
                        current = current.rest();
                        {
                            SubLObject width = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt122);
                            current = current.rest();
                            {
                                SubLObject sticky = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt122);
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject frame_name_var = $sym123$FRAME_NAME_VAR;
                                        return list(CLET, list(list(frame_name_var, list(CB_FRAME_NAME, target))), list(HTML_HOVEROVER_ANCHOR, list(new SubLObject[]{ $TARGET, frame_name_var, $HREF, list(CYC_CGI_URL, url_body), $HOVEROVER_HTML, hoverover_html, $CAPTION, caption, $WIDTH, width, $STICKY, sticky }), link_body));
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt122);
                                }
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject define_cb_link_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject link_type = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt129);
            link_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt129);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject type_name = symbol_name(link_type);
                SubLObject method_func_name = format(NIL, $str_alt130$CB_LINK__A, type_name);
                SubLObject method_func = intern(method_func_name, UNPROVIDED);
                SubLObject max_args = list_utilities.function_arglist_max_args(arglist);
                return list(PROGN, listS(DEFINE, method_func, arglist, append(body, NIL)), list(SETUP_CB_LINK_METHOD, link_type, list(QUOTE, method_func), list(QUOTE, max_args)));
            }
        }
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

    public static final SubLObject cb_tool_frame_link_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject tool_link_type = NIL;
            SubLObject url_body = NIL;
            SubLObject link_body = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt134);
            tool_link_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt134);
            url_body = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt134);
            link_body = current.first();
            current = current.rest();
            {
                SubLObject target = (current.isCons()) ? ((SubLObject) (current.first())) : $MAIN;
                destructuring_bind_must_listp(current, datum, $list_alt134);
                current = current.rest();
                {
                    SubLObject title = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt134);
                    current = current.rest();
                    if (NIL == current) {
                        return list(FRAME_LINK, url_body, list(PROGN, list(PWHEN_FEATURE, $CYC_OPENCYC, listS(PWHEN, list($sym138$CB_ICON_EXISTS_, tool_link_type), list(CB_ICON, tool_link_type), $list_alt140)), link_body), target, title);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt134);
                    }
                }
            }
        }
        return NIL;
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

    /**
     * Binds VAR to an assertion-link function determined by whether EL or HL assertion
     * formulas are to be shown when browsing HOOK and whether assertion mts are to be
     * displayed.
     */
    @LispMethod(comment = "Binds VAR to an assertion-link function determined by whether EL or HL assertion\r\nformulas are to be shown when browsing HOOK and whether assertion mts are to be\r\ndisplayed.\nBinds VAR to an assertion-link function determined by whether EL or HL assertion\nformulas are to be shown when browsing HOOK and whether assertion mts are to be\ndisplayed.")
    public static final SubLObject cb_clet_assertion_link_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt141);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject hook = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt141);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt141);
                    hook = current.first();
                    current = current.rest();
                    {
                        SubLObject include_mtP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt141);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(CLET, bq_cons(list(var, list(FIF, list($sym143$CB_SHOW_EL_FORMULAS_FOR_HOOK_, hook), listS(FIF, include_mtP, $list_alt144), listS(FIF, include_mtP, $list_alt145))), $list_alt146), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt141);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Binds VAR to an assertion-link function determined by whether EL or HL assertion
     * formulas are to be shown when browsing HOOK and whether assertion mts are to be
     * displayed.
     */
    @LispMethod(comment = "Binds VAR to an assertion-link function determined by whether EL or HL assertion\r\nformulas are to be shown when browsing HOOK and whether assertion mts are to be\r\ndisplayed.\nBinds VAR to an assertion-link function determined by whether EL or HL assertion\nformulas are to be shown when browsing HOOK and whether assertion mts are to be\ndisplayed.")
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

    /**
     * Binds VAR to an assertion-link-binary function determined by whether EL or HL
     * assertion formulas are to be shown when browsing HOOK.
     */
    @LispMethod(comment = "Binds VAR to an assertion-link-binary function determined by whether EL or HL\r\nassertion formulas are to be shown when browsing HOOK.\nBinds VAR to an assertion-link-binary function determined by whether EL or HL\nassertion formulas are to be shown when browsing HOOK.")
    public static final SubLObject cb_clet_assertion_link_binary_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt147);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject hook = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt147);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt147);
                    hook = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, bq_cons(list(var, listS(FIF, list($sym143$CB_SHOW_EL_FORMULAS_FOR_HOOK_, hook), $list_alt148)), $list_alt146), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt147);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Binds VAR to an assertion-link-binary function determined by whether EL or HL
     * assertion formulas are to be shown when browsing HOOK.
     */
    @LispMethod(comment = "Binds VAR to an assertion-link-binary function determined by whether EL or HL\r\nassertion formulas are to be shown when browsing HOOK.\nBinds VAR to an assertion-link-binary function determined by whether EL or HL\nassertion formulas are to be shown when browsing HOOK.")
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

    public static final SubLObject cb_simple_main_document_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt149);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject title = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt149);
                    title = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt149);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt149);
                            if (NIL == member(current_2, $list_alt150, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt149);
                        }
                        {
                            SubLObject completionP_tail = property_list_member($COMPLETION_, current);
                            SubLObject completionP = (NIL != completionP_tail) ? ((SubLObject) (cadr(completionP_tail))) : NIL;
                            SubLObject simple_applet_inputP_tail = property_list_member($kw152$SIMPLE_APPLET_INPUT_, current);
                            SubLObject simple_applet_inputP = (NIL != simple_applet_inputP_tail) ? ((SubLObject) (cadr(simple_applet_inputP_tail))) : NIL;
                            SubLObject passwordP_tail = property_list_member($PASSWORD_, current);
                            SubLObject passwordP = (NIL != passwordP_tail) ? ((SubLObject) (cadr(passwordP_tail))) : NIL;
                            SubLObject color_tail = property_list_member($COLOR, current);
                            SubLObject color = (NIL != color_tail) ? ((SubLObject) (cadr(color_tail))) : $html_default_bgcolor$;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject title_var = $sym156$TITLE_VAR;
                                return list(CLET, list(list(title_var, title)), list(WITH_HTML_ID_SPACE, list(HTML_DOCUMENT, list(CB_HEAD, list(PWHEN, title_var, list(HTML_TITLE, list(HTML_PRINC, title_var))), listS(PWHEN, completionP, $list_alt161), listS(PWHEN, passwordP, $list_alt162), listS(PWHEN, simple_applet_inputP, $list_alt163)), listS(HTML_FANCY_BODY, list($BACKGROUND_COLOR, color, $CLASS, html_macros.$basic_skin_class$.getGlobalValue()), list(PWHEN, title_var, list(HTML_HEADING, $list_alt168, list(HTML_PRINC, title_var))), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject cb_c_content_page_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject index = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt169);
            index = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return bq_cons(PROGN, append(body, NIL));
            }
        }
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

    public static final SubLObject cb_simple_c_content_document_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt170);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject index = NIL;
                    SubLObject title = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt170);
                    index = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt170);
                    title = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt170);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt170);
                            if (NIL == member(current_3, $list_alt171, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt170);
                        }
                        {
                            SubLObject completionP_tail = property_list_member($COMPLETION_, current);
                            SubLObject completionP = (NIL != completionP_tail) ? ((SubLObject) (cadr(completionP_tail))) : NIL;
                            SubLObject dhtmlP_tail = property_list_member($DHTML_, current);
                            SubLObject dhtmlP = (NIL != dhtmlP_tail) ? ((SubLObject) (cadr(dhtmlP_tail))) : NIL;
                            SubLObject color_tail = property_list_member($COLOR, current);
                            SubLObject color = (NIL != color_tail) ? ((SubLObject) (cadr(color_tail))) : $html_default_bgcolor$;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject title_var = $sym173$TITLE_VAR;
                                return list(CLET, list(list(title_var, title)), list(WITH_HTML_ID_SPACE, list(HTML_DOCUMENT, list(CB_HEAD, list(PWHEN, title_var, list(HTML_TITLE, list(HTML_PRINC, title_var))), listS(PWHEN, completionP, $list_alt161), listS(PWHEN, dhtmlP, $list_alt174)), list(HTML_FANCY_BODY, list($BACKGROUND_COLOR, color, $CLASS, html_macros.$basic_skin_class$.getGlobalValue()), listS(CB_C_CONTENT_PAGE, index, append(body, NIL))))));
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject cb_with_pph_assumptions_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject body = current;
                if (NIL != find($CYC_PPH, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return list(WITH_PPH_MEMOIZATION, listS(CLET, $list_alt178, append(body, NIL)));
                } else {
                    return bq_cons(PROGN, append(body, NIL));
                }
            }
        }
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
        declareFunction("cb_editing_enabled_p", "CB-EDITING-ENABLED-P", 0, 0, false);
        declareFunction("cb_mts_filter_use_genlmt", "CB-MTS-FILTER-USE-GENLMT", 0, 0, false);
        declareFunction("set_cb_mts_filter_use_genlmt", "SET-CB-MTS-FILTER-USE-GENLMT", 1, 0, false);
        declareFunction("cb_use_ke_review_creators", "CB-USE-KE-REVIEW-CREATORS", 0, 0, false);
        declareFunction("set_cb_use_ke_review_creators", "SET-CB-USE-KE-REVIEW-CREATORS", 1, 0, false);
        declareFunction("cb_ke_review_creators", "CB-KE-REVIEW-CREATORS", 0, 0, false);
        declareFunction("set_cb_ke_review_creators", "SET-CB-KE-REVIEW-CREATORS", 1, 0, false);
        declareFunction("cb_glob_lookup", "CB-GLOB-LOOKUP", 1, 0, false);
        declareFunction("cb_glob_lookup_by_string", "CB-GLOB-LOOKUP-BY-STRING", 1, 0, false);
        declareFunction("cb_glob_id", "CB-GLOB-ID", 1, 0, false);
        declareFunction("cb_glob_remove", "CB-GLOB-REMOVE", 1, 0, false);
        declareFunction("cb_glob_remove_id", "CB-GLOB-REMOVE-ID", 1, 0, false);
        declareFunction("cb_glob_reset", "CB-GLOB-RESET", 0, 0, false);
        declareMacro("do_cb_glob", "DO-CB-GLOB");
        declareFunction("cb_glob_find_all_if", "CB-GLOB-FIND-ALL-IF", 1, 0, false);
        declareMacro("cb_head", "CB-HEAD");
        declareFunction("cb_head_shortcut_icon", "CB-HEAD-SHORTCUT-ICON", 0, 0, false);
        declareMacro("cyc_cgi_url", "CYC-CGI-URL");
        declareFunction("cyc_cgi_url_string", "CYC-CGI-URL-STRING", 1, 0, false);
        declareFunction("cyc_cgi_url_int", "CYC-CGI-URL-INT", 0, 0, false);
        declareFunction("cyc_cgi_relative_url", "CYC-CGI-RELATIVE-URL", 0, 0, false);
        declareFunction("cyc_cgi_absolute_cb_framed_url", "CYC-CGI-ABSOLUTE-CB-FRAMED-URL", 0, 0, false);
        declareFunction("cyc_cgi_kea_url", "CYC-CGI-KEA-URL", 0, 0, false);
        declareMacro("cb_basic_form", "CB-BASIC-FORM");
        declareMacro("cb_basic_form_handler", "CB-BASIC-FORM-HANDLER");
        declareMacro("frame_link", "FRAME-LINK");
        declareMacro("page_link", "PAGE-LINK");
        declareMacro("absolute_link", "ABSOLUTE-LINK");
        declareMacro("new_window_link", "NEW-WINDOW-LINK");
        declareMacro("new_external_window_link", "NEW-EXTERNAL-WINDOW-LINK");
        declareMacro("frame_link_hoverover", "FRAME-LINK-HOVEROVER");
        declareMacro("define_cb_link_method", "DEFINE-CB-LINK-METHOD");
        declareMacro("cb_tool_frame_link", "CB-TOOL-FRAME-LINK");
        declareMacro("cb_clet_assertion_link_fn", "CB-CLET-ASSERTION-LINK-FN");
        declareMacro("cb_clet_assertion_link_binary_fn", "CB-CLET-ASSERTION-LINK-BINARY-FN");
        declareMacro("cb_simple_main_document", "CB-SIMPLE-MAIN-DOCUMENT");
        declareMacro("cb_c_content_page", "CB-C-CONTENT-PAGE");
        declareMacro("cb_simple_c_content_document", "CB-SIMPLE-C-CONTENT-DOCUMENT");
        declareMacro("cb_with_pph_assumptions", "CB-WITH-PPH-ASSUMPTIONS");
        return NIL;
    }

    public static final SubLObject init_cb_parameters_file_alt() {
        defparameter("*TRANSCRIPT-FILE-SHORTHAND*", $list_alt0);
        defparameter("*CB-INCLUDE-HELP*", T);
        defparameter("*CB-INCLUDE-INFERENCE-HELP?*", T);
        defparameter("*CB-C-DEFAULT-CONTENT*", $MAXIMAL);
        defparameter("*CB-C-MAXIMAL-UPPER-BOUND*", $int$30);
        defparameter("*CB-C-ASSERTION-FORMULAS-DISPLAY*", $HL_FORMULAS);
        defparameter("*CB-CONSTANT-HISTORY-MAX*", NIL);
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
        defparameter("*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*", NIL);
        defparameter("*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*", NIL);
        defparameter("*CB-A-INCLUDE-KIF-LINK*", NIL);
        defparameter("*CB-A-PERFORM-ACCESS-DIAGNOSTICS*", T);
        defparameter("*CB-A-SHOW-ENGLISH*", NIL);
        defparameter("*CB-WRAP-INTERACTOR*", NIL);
        defparameter("*CB-A-SHOW-NEWLINES-IN-STRING-ARGS*", T);
        defparameter("*CB-USE-GKE-TO-EDIT-EL-SENTENCES*", NIL);
        defparameter("*CB-SHOW-CYCLIFY-BUTTON*", T);
        defparameter("*CB-ASSERT-QUEUE-DEFAULT*", $LOCAL);
        defparameter("*CB-SEPARATE-ASSERTION-FRAME*", NIL);
        defparameter("*CB-USER-TOOLBAR-LINKS*", red_infrastructure_macros.red_def_helper($list_alt36.isSymbol() ? ((SubLObject) (symbol_value($list_alt36))) : $list_alt36, $cb_user_toolbar_links$, $list_alt38.isSymbol() ? ((SubLObject) (symbol_value($list_alt38))) : $list_alt38, $PARAMETER, UNPROVIDED));
        defparameter("*CB-SEPARATE-DOC-FRAME*", NIL);
        defparameter("*CB-MORE-ASSERTION-MARKER-IMAGE-TEXT*", NIL);
        defparameter("*CB-SHOW-ENHANCED-TABLES*", T);
        defparameter("*CB-KE-TEXT-MODE*", NIL);
        defparameter("*CB-FAST?*", NIL);
        defparameter("*CB-DEFAULT-MT*", $$BaseKB);
        defparameter("*CB-EDITING-ENABLED*", T);
        defparameter("*CB-CONFIRM-KILLS*", T);
        deflexical("*CB-ASSERTION-INDEXICAL*", $$TheAssertionSentence);
        defparameter("*CB-SPECIFY-SHOW-GLOSS*", NONE);
        defparameter("*CB-LUCKY-TERM-SEARCH?*", NIL);
        defparameter("*CB-MTS-FILTER-USE-GENLMT*", T);
        defparameter("*CB-USE-KE-REVIEW-CREATORS*", NIL);
        defparameter("*CB-KE-REVIEW-CREATORS*", NIL);
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
        defparameter("*CB-NONREVIEWABLE-ASSERTION-MARKERS*", $list_alt59);
        defparameter("*CB-KE-REVIEW-START-DATE*", $int$19990921);
        defparameter("*CB-KE-REVIEW-END-DATE*", $int$29991231);
        defparameter("*CB-VIEWPOINT-SHOW-DOC-PREDS*", T);
        defparameter("*CB-VIEWPOINT-SHOW-BOOK-PREDS*", T);
        defparameter("*CB-PERMIT-ROBOTS-TO-FOLLOW?*", NIL);
        defparameter("*CB-PERMIT-ROBOTS-TO-INDEX?*", NIL);
        defparameter("*CB-GLOB*", NIL);
        return NIL;
    }

    public static SubLObject init_cb_parameters_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            defparameter("*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*", NIL);
            defparameter("*CB-A-INCLUDE-KIF-LINK*", NIL);
            defparameter("*CB-A-PERFORM-ACCESS-DIAGNOSTICS*", T);
            defparameter("*CB-USER-TOOLBAR-LINKS*", red_infrastructure_macros.red_def_helper($list_alt36.isSymbol() ? ((SubLObject) (symbol_value($list_alt36))) : $list_alt36, $cb_user_toolbar_links$, $list_alt38.isSymbol() ? ((SubLObject) (symbol_value($list_alt38))) : $list_alt38, $PARAMETER, UNPROVIDED));
            defparameter("*CB-SHOW-ENHANCED-TABLES*", T);
            defparameter("*CB-NONREVIEWABLE-ASSERTION-MARKERS*", $list_alt59);
        }
        return NIL;
    }

    public static SubLObject init_cb_parameters_file_Previous() {
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeString("read"), list(makeSymbol("READ-TRANSCRIPT"))), list(makeString("write"), list(makeSymbol("LOCAL-TRANSCRIPT"))), list(makeString("local"), list(makeSymbol("LOCAL-TRANSCRIPT"))), list(makeString("master"), list(makeSymbol("MASTER-TRANSCRIPT"))));

    public static final SubLSymbol $cb_history_show_el_formulasP$ = makeSymbol("*CB-HISTORY-SHOW-EL-FORMULAS?*");

    public static final SubLSymbol $cb_perform_argumentation_for_closed_queryP$ = makeSymbol("*CB-PERFORM-ARGUMENTATION-FOR-CLOSED-QUERY?*");

    public static final SubLSymbol $cb_a_edit_preserve_meta_assertions_by_defaultP$ = makeSymbol("*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*");

    public static final SubLSymbol $cb_a_change_all_meta_assertions_mt_by_defaultP$ = makeSymbol("*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*");

    static private final SubLList $list_alt36 = list(makeString("system.common.browser.tools.cb-user-toolbar-links"));

    public static final SubLObject setup_cb_parameters_file_alt() {
        register_html_state_variable($cb_include_help$);
        register_html_state_variable($cb_include_inference_helpP$);
        register_html_state_variable($cb_c_default_content$);
        register_html_interface_variable($cb_c_default_content$);
        register_html_state_variable($cb_c_maximal_upper_bound$);
        register_html_interface_variable($cb_c_maximal_upper_bound$);
        register_html_state_variable($cb_c_assertion_formulas_display$);
        register_html_interface_variable($cb_c_assertion_formulas_display$);
        register_html_state_variable($cb_constant_history_max$);
        register_html_interface_variable($cb_constant_history_max$);
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
        register_html_state_variable($cb_history_show_el_formulasP$);
        register_html_interface_variable($cb_history_show_el_formulasP$);
        register_html_state_variable($cb_status_update_interval$);
        register_html_interface_variable($cb_status_update_interval$);
        register_html_state_variable($cb_destroy_all_inferences_but_last_n$);
        register_html_interface_variable($cb_destroy_all_inferences_but_last_n$);
        register_html_state_variable($cb_perform_argumentation_for_closed_queryP$);
        register_html_interface_variable($cb_perform_argumentation_for_closed_queryP$);
        register_html_state_variable($cb_c_wrap_assertions$);
        register_html_interface_variable($cb_c_wrap_assertions$);
        register_html_state_variable($cb_a_show_el_formula$);
        register_html_interface_variable($cb_a_show_el_formula$);
        register_html_state_variable($cb_a_show_hl_formula$);
        register_html_interface_variable($cb_a_show_hl_formula$);
        register_html_state_variable($cb_a_edit_preserve_meta_assertions_by_defaultP$);
        register_html_interface_variable($cb_a_edit_preserve_meta_assertions_by_defaultP$);
        register_html_state_variable($cb_a_change_all_meta_assertions_mt_by_defaultP$);
        register_html_interface_variable($cb_a_change_all_meta_assertions_mt_by_defaultP$);
        register_html_state_variable($cb_a_include_kif_link$);
        register_html_interface_variable($cb_a_include_kif_link$);
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
        register_html_state_variable($cb_show_cyclify_button$);
        register_html_interface_variable($cb_show_cyclify_button$);
        register_html_state_variable($cb_assert_queue_default$);
        register_html_interface_variable($cb_assert_queue_default$);
        register_html_state_variable($cb_separate_assertion_frame$);
        register_html_state_variable($cb_user_toolbar_links$);
        register_html_interface_variable($cb_user_toolbar_links$);
        register_html_state_variable($cb_separate_doc_frame$);
        register_html_interface_variable($cb_separate_doc_frame$);
        register_html_state_variable($cb_more_assertion_marker_image_text$);
        register_html_interface_variable($cb_more_assertion_marker_image_text$);
        register_html_state_variable($cb_show_enhanced_tables$);
        register_html_interface_variable($cb_show_enhanced_tables$);
        register_html_state_variable($cb_ke_text_mode$);
        register_html_interface_variable($cb_ke_text_mode$);
        register_html_state_variable($cb_fastP$);
        register_html_interface_variable($cb_fastP$);
        register_html_state_variable($cb_default_mt$);
        register_html_interface_variable($cb_default_mt$);
        mt_vars.note_mt_var($cb_default_mt$, UNPROVIDED);
        register_html_state_variable($cb_editing_enabled$);
        register_html_state_variable($cb_confirm_kills$);
        register_html_state_variable($cb_specify_show_gloss$);
        register_html_state_variable($cb_lucky_term_searchP$);
        register_html_state_variable($cb_mts_filter_use_genlmt$);
        register_html_state_variable($cb_use_ke_review_creators$);
        register_html_state_variable($cb_ke_review_creators$);
        register_html_state_variable($cb_ke_review_start_date$);
        register_html_state_variable($cb_ke_review_end_date$);
        register_html_state_variable($cb_viewpoint_show_doc_preds$);
        register_html_state_variable($cb_viewpoint_show_book_preds$);
        register_html_state_variable($cb_glob$);
        sethash($MINI_LOGO, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt77$mini_logo_gif, NIL));
        register_macro_helper(CB_HEAD_SHORTCUT_ICON, CB_HEAD);
        register_macro_helper(CYC_CGI_URL_INT, CYC_CGI_URL);
        return NIL;
    }

    public static SubLObject setup_cb_parameters_file() {
        if (SubLFiles.USE_V1) {
            register_html_state_variable($cb_include_help$);
            register_html_state_variable($cb_include_inference_helpP$);
            register_html_state_variable($cb_c_default_content$);
            register_html_interface_variable($cb_c_default_content$);
            register_html_state_variable($cb_c_maximal_upper_bound$);
            register_html_interface_variable($cb_c_maximal_upper_bound$);
            register_html_state_variable($cb_c_assertion_formulas_display$);
            register_html_interface_variable($cb_c_assertion_formulas_display$);
            register_html_state_variable($cb_constant_history_max$);
            register_html_interface_variable($cb_constant_history_max$);
            register_html_state_variable($cb_use_categorized_historyP$);
            register_html_interface_variable($cb_use_categorized_historyP$);
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
            register_html_state_variable($cb_history_show_el_formulasP$);
            register_html_interface_variable($cb_history_show_el_formulasP$);
            register_html_state_variable($cb_status_update_interval$);
            register_html_interface_variable($cb_status_update_interval$);
            register_html_state_variable($cb_destroy_all_inferences_but_last_n$);
            register_html_interface_variable($cb_destroy_all_inferences_but_last_n$);
            register_html_state_variable($cb_perform_argumentation_for_closed_queryP$);
            register_html_interface_variable($cb_perform_argumentation_for_closed_queryP$);
            register_html_state_variable($cb_c_wrap_assertions$);
            register_html_interface_variable($cb_c_wrap_assertions$);
            register_html_state_variable($cb_a_show_el_formula$);
            register_html_interface_variable($cb_a_show_el_formula$);
            register_html_state_variable($cb_a_show_hl_formula$);
            register_html_interface_variable($cb_a_show_hl_formula$);
            register_html_state_variable($cb_a_edit_preserve_meta_assertions_by_defaultP$);
            register_html_interface_variable($cb_a_edit_preserve_meta_assertions_by_defaultP$);
            register_html_state_variable($cb_a_change_all_meta_assertions_mt_by_defaultP$);
            register_html_interface_variable($cb_a_change_all_meta_assertions_mt_by_defaultP$);
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
            register_html_state_variable($cb_fastP$);
            register_html_interface_variable($cb_fastP$);
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
            register_html_state_variable($cb_lucky_term_searchP$);
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
        }
        if (SubLFiles.USE_V2) {
            register_html_state_variable($cb_history_show_el_formulasP$);
            register_html_interface_variable($cb_history_show_el_formulasP$);
            register_html_state_variable($cb_perform_argumentation_for_closed_queryP$);
            register_html_interface_variable($cb_perform_argumentation_for_closed_queryP$);
            register_html_state_variable($cb_a_edit_preserve_meta_assertions_by_defaultP$);
            register_html_interface_variable($cb_a_edit_preserve_meta_assertions_by_defaultP$);
            register_html_state_variable($cb_a_change_all_meta_assertions_mt_by_defaultP$);
            register_html_interface_variable($cb_a_change_all_meta_assertions_mt_by_defaultP$);
            register_html_state_variable($cb_a_include_kif_link$);
            register_html_interface_variable($cb_a_include_kif_link$);
            register_html_state_variable($cb_show_enhanced_tables$);
            register_html_interface_variable($cb_show_enhanced_tables$);
            register_html_state_variable($cb_fastP$);
            register_html_interface_variable($cb_fastP$);
            register_html_state_variable($cb_lucky_term_searchP$);
            sethash($MINI_LOGO, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt77$mini_logo_gif, NIL));
        }
        return NIL;
    }

    public static SubLObject setup_cb_parameters_file_Previous() {
        register_html_state_variable($cb_include_help$);
        register_html_state_variable($cb_include_inference_helpP$);
        register_html_state_variable($cb_c_default_content$);
        register_html_interface_variable($cb_c_default_content$);
        register_html_state_variable($cb_c_maximal_upper_bound$);
        register_html_interface_variable($cb_c_maximal_upper_bound$);
        register_html_state_variable($cb_c_assertion_formulas_display$);
        register_html_interface_variable($cb_c_assertion_formulas_display$);
        register_html_state_variable($cb_constant_history_max$);
        register_html_interface_variable($cb_constant_history_max$);
        register_html_state_variable($cb_use_categorized_historyP$);
        register_html_interface_variable($cb_use_categorized_historyP$);
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
        register_html_state_variable($cb_history_show_el_formulasP$);
        register_html_interface_variable($cb_history_show_el_formulasP$);
        register_html_state_variable($cb_status_update_interval$);
        register_html_interface_variable($cb_status_update_interval$);
        register_html_state_variable($cb_destroy_all_inferences_but_last_n$);
        register_html_interface_variable($cb_destroy_all_inferences_but_last_n$);
        register_html_state_variable($cb_perform_argumentation_for_closed_queryP$);
        register_html_interface_variable($cb_perform_argumentation_for_closed_queryP$);
        register_html_state_variable($cb_c_wrap_assertions$);
        register_html_interface_variable($cb_c_wrap_assertions$);
        register_html_state_variable($cb_a_show_el_formula$);
        register_html_interface_variable($cb_a_show_el_formula$);
        register_html_state_variable($cb_a_show_hl_formula$);
        register_html_interface_variable($cb_a_show_hl_formula$);
        register_html_state_variable($cb_a_edit_preserve_meta_assertions_by_defaultP$);
        register_html_interface_variable($cb_a_edit_preserve_meta_assertions_by_defaultP$);
        register_html_state_variable($cb_a_change_all_meta_assertions_mt_by_defaultP$);
        register_html_interface_variable($cb_a_change_all_meta_assertions_mt_by_defaultP$);
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
        register_html_state_variable($cb_fastP$);
        register_html_interface_variable($cb_fastP$);
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
        register_html_state_variable($cb_lucky_term_searchP$);
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

    static private final SubLList $list_alt38 = list(makeKeyword("HISTORY"), makeKeyword("CREATE"), makeKeyword("ASSERT"), makeKeyword("COMPOSE"), makeKeyword("QUERY"), makeKeyword("DOC"), makeKeyword("NAVIGATOR"), makeKeyword("OPTIONS"));

    public static final SubLSymbol $cb_fastP$ = makeSymbol("*CB-FAST?*");

    public static final SubLSymbol $cb_lucky_term_searchP$ = makeSymbol("*CB-LUCKY-TERM-SEARCH?*");

    static private final SubLList $list_alt59 = list(makeKeyword("DERIVED"), $CODE);

    static private final SubLList $list_alt67 = list(list(makeSymbol("ID"), makeSymbol("OBJECT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt68 = list($DONE);

    static private final SubLList $list_alt74 = list(makeSymbol("CB-HEAD-SHORTCUT-ICON"));

    static private final SubLList $list_alt75 = list(makeSymbol("HTML-META-ROBOT-INSTRUCTIONS"), makeSymbol("*CB-PERMIT-ROBOTS-TO-INDEX?*"), makeSymbol("*CB-PERMIT-ROBOTS-TO-FOLLOW?*"));

    static private final SubLString $str_alt77$mini_logo_gif = makeString("mini-logo.gif");

    static private final SubLList $list_alt82 = list(makeSymbol("CYC-CGI-URL-INT"));

    static private final SubLString $str_alt85$_ = makeString("?");

    static private final SubLList $list_alt86 = list(list(makeSymbol("&OPTIONAL"), makeSymbol("TARGET"), makeSymbol("SCRIPT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym87$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    static private final SubLList $list_alt93 = list(list(makeSymbol("HANDLER-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("TARGET"), list(makeSymbol("VALUE"), T), makeSymbol("SCRIPT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt96 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), $MAIN), list(makeSymbol("TITLE"), NIL));

    static private final SubLList $list_alt102 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TITLE"), NIL));

    static private final SubLList $list_alt105 = list(makeSymbol("URL"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), $MAIN), list(makeSymbol("TITLE"), NIL), list(makeSymbol("ID"), NIL));

    static private final SubLList $list_alt108 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), makeSymbol("TARGET"), list(makeSymbol("OPTIONS"), makeString("")));

    static private final SubLSymbol $sym110$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    static private final SubLList $list_alt113 = list(makeSymbol("HTML-FORMAT"), makeString("window.open('"));

    static private final SubLList $list_alt114 = list(makeSymbol("HTML-FORMAT"), makeString("',"));

    @Override
    public void declareFunctions() {
        declare_cb_parameters_file();
    }

    static private final SubLString $str_alt117$__A_ = makeString("'~A'");

    @Override
    public void initializeVariables() {
        init_cb_parameters_file();
    }

    static private final SubLList $list_alt118 = list(list(makeSymbol("HTML-FORMAT"), makeString("null")));

    @Override
    public void runTopLevelForms() {
        setup_cb_parameters_file();
    }

    static private final SubLString $str_alt119$___A____ = makeString(",'~A'); ");

    static private final SubLList $list_alt120 = list(list(makeSymbol("HTML-FORMAT"), makeString("return false;")));

    static {
    }

    static private final SubLList $list_alt122 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), $MAIN), makeSymbol("HOVEROVER-HTML"), makeSymbol("CAPTION"), makeSymbol("WIDTH"), makeSymbol("STICKY"));

    static private final SubLSymbol $sym123$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    static private final SubLList $list_alt129 = list(makeSymbol("LINK-TYPE"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt130$CB_LINK__A = makeString("CB-LINK-~A");

    static private final SubLList $list_alt134 = list(makeSymbol("TOOL-LINK-TYPE"), makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), $MAIN), list(makeSymbol("TITLE"), NIL));

    static private final SubLSymbol $sym138$CB_ICON_EXISTS_ = makeSymbol("CB-ICON-EXISTS?");

    static private final SubLList $list_alt140 = list(list(makeSymbol("HTML-BR")));

    static private final SubLList $list_alt141 = list(list(makeSymbol("VAR"), makeSymbol("HOOK"), makeSymbol("&OPTIONAL"), makeSymbol("INCLUDE-MT?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym143$CB_SHOW_EL_FORMULAS_FOR_HOOK_ = makeSymbol("CB-SHOW-EL-FORMULAS-FOR-HOOK?");

    static private final SubLList $list_alt144 = list(list(makeSymbol("FUNCTION"), makeSymbol("CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY")), list(makeSymbol("FUNCTION"), makeSymbol("CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY")));

    static private final SubLList $list_alt145 = list(list(makeSymbol("FUNCTION"), makeSymbol("CB-ASSERTION-LINK-WITH-MT")), list(makeSymbol("FUNCTION"), makeSymbol("CB-ASSERTION-LINK")));

    static private final SubLList $list_alt146 = list(list(makeSymbol("*CB-SHOW-EL-ASSERTION-READABLY-LAST-FORMULA*"), NIL), list(makeSymbol("*CB-SHOW-EL-ASSERTION-READABLY-LAST-MT*"), NIL));

    static private final SubLList $list_alt147 = list(list(makeSymbol("VAR"), makeSymbol("HOOK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt148 = list(list(makeSymbol("FUNCTION"), makeSymbol("CB-EL-ASSERTION-LINK-BINARY-CHECKING-REDUNDANCY")), list(makeSymbol("FUNCTION"), makeSymbol("CB-ASSERTION-LINK-BINARY")));

    static private final SubLList $list_alt149 = list(list(makeSymbol("TITLE"), makeSymbol("&KEY"), makeSymbol("COMPLETION?"), makeSymbol("SIMPLE-APPLET-INPUT?"), makeSymbol("PASSWORD?"), list(makeSymbol("COLOR"), list(QUOTE, makeSymbol("*HTML-DEFAULT-BGCOLOR*")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt150 = list(makeKeyword("COMPLETION?"), makeKeyword("SIMPLE-APPLET-INPUT?"), makeKeyword("PASSWORD?"), makeKeyword("COLOR"));

    public static final SubLSymbol $kw152$SIMPLE_APPLET_INPUT_ = makeKeyword("SIMPLE-APPLET-INPUT?");

    static private final SubLSymbol $sym156$TITLE_VAR = makeUninternedSymbol("TITLE-VAR");

    static private final SubLList $list_alt161 = list(list(makeSymbol("HTML-COMPLETE-SCRIPT")), list(makeSymbol("HTML-AUTOCOMPLETE-CSS")), list(makeSymbol("HTML-AUTOCOMPLETE-SCRIPTS")));

    static private final SubLList $list_alt162 = list(list(makeSymbol("JAVASCRIPT"), makeKeyword("SHA1")));

    static private final SubLList $list_alt163 = list(list(makeSymbol("HTML-SIMPLE-APPLET-INPUT-DEFINITION-SCRIPT")));

    static private final SubLList $list_alt168 = list(TWO_INTEGER);

    static private final SubLList $list_alt169 = list(makeSymbol("INDEX"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt170 = list(list(makeSymbol("INDEX"), makeSymbol("TITLE"), makeSymbol("&KEY"), makeSymbol("COMPLETION?"), makeSymbol("DHTML?"), list(makeSymbol("COLOR"), list(QUOTE, makeSymbol("*HTML-DEFAULT-BGCOLOR*")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt171 = list(makeKeyword("COMPLETION?"), makeKeyword("DHTML?"), makeKeyword("COLOR"));

    static private final SubLSymbol $sym173$TITLE_VAR = makeUninternedSymbol("TITLE-VAR");

    static private final SubLList $list_alt174 = list(list(makeSymbol("DHTML-WITH-DOM-SCRIPT")), list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")));

    static private final SubLList $list_alt178 = list(list(makeSymbol("*PPH-LANGUAGE-MT*"), list(makeSymbol("CB-PARAPHRASE-MT"))));
}

/**
 * Total time: 401 ms
 */
