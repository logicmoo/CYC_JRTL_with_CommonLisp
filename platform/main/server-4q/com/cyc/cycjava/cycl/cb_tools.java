package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
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

import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_tools extends SubLTranslatedFile {
    public static final SubLFile me = new cb_tools();

    public static final String myName = "com.cyc.cycjava.cycl.cb_tools";

    public static final String myFingerPrint = "6ffae31e03254b090e3c815ae41d736ce58ba0edc90eced65b27a81443ed8f7e";

    // defparameter
    // Definitions
    public static final SubLSymbol $cb_tools_split_threshold$ = makeSymbol("*CB-TOOLS-SPLIT-THRESHOLD*");

    // deflexical
    private static final SubLSymbol $cb_boolean_globals$ = makeSymbol("*CB-BOOLEAN-GLOBALS*");

    // defparameter
    private static final SubLSymbol $cb_wff_strictP$ = makeSymbol("*CB-WFF-STRICT?*");





    // deflexical
    private static final SubLSymbol $cb_history_max_constants$ = makeSymbol("*CB-HISTORY-MAX-CONSTANTS*");

    // deflexical
    private static final SubLSymbol $cb_history_max_nats$ = makeSymbol("*CB-HISTORY-MAX-NATS*");

    // deflexical
    private static final SubLSymbol $cb_history_max_assertions$ = makeSymbol("*CB-HISTORY-MAX-ASSERTIONS*");



    // defparameter
    // The width in characters of the HTML interactor
    public static final SubLSymbol $cb_interactor_width$ = makeSymbol("*CB-INTERACTOR-WIDTH*");

    // defparameter
    // The height in characters of the HTML interactor
    public static final SubLSymbol $cb_interactor_height$ = makeSymbol("*CB-INTERACTOR-HEIGHT*");



    // defparameter
    public static final SubLSymbol $user_preference_file_extension$ = makeSymbol("*USER-PREFERENCE-FILE-EXTENSION*");

    // defparameter
    public static final SubLSymbol $user_preference_directory_list$ = makeSymbol("*USER-PREFERENCE-DIRECTORY-LIST*");

    // defparameter
    public static final SubLSymbol $default_user_preference_filename$ = makeSymbol("*DEFAULT-USER-PREFERENCE-FILENAME*");

    // defparameter
    // The number of displayed spaces for the file name.
    public static final SubLSymbol $cb_load_api_input_size$ = makeSymbol("*CB-LOAD-API-INPUT-SIZE*");

    // defparameter
    // The number of displayed spaces for the number of forms to skip.
    public static final SubLSymbol $cb_load_api_skip_input_size$ = makeSymbol("*CB-LOAD-API-SKIP-INPUT-SIZE*");

    // defparameter
    /**
     * Used in the handler function to hold the list of all the constants or
     * assertions.
     */
    public static final SubLSymbol $cb_show_list$ = makeSymbol("*CB-SHOW-LIST*");

    // defconstant
    /**
     * The user will have to choose to display constants or assertions. This number
     * is used to define a constant selection. Numbers seem to be easier to compare
     * than colon-constants.
     */
    public static final SubLSymbol $cb_show_constant_value$ = makeSymbol("*CB-SHOW-CONSTANT-VALUE*");

    // defconstant
    // The number to define an assertion selection.
    public static final SubLSymbol $cb_show_assertion_value$ = makeSymbol("*CB-SHOW-ASSERTION-VALUE*");



    public static final SubLString $str1$cb_tools_html = makeString("cb-tools.html");

    public static final SubLString $$$Browser_Tools = makeString("Browser Tools");

    private static final SubLString $str3$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str4$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str9$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str15$cb_tools_handler = makeString("cb-tools-handler");



    private static final SubLString $str17$Choose_a_tool__or_modify_the_tool = makeString("Choose a tool, or modify the toolbar.");

    private static final SubLString $$$Current_Values = makeString("Current Values");

    private static final SubLString $$$Update_Toolbar = makeString("Update Toolbar");

    private static final SubLString $str20$Update___Save = makeString("Update & Save");

    private static final SubLString $$$save = makeString("save");

    private static final SubLString $$$Deprecated_Tools = makeString("Deprecated Tools");

    private static final SubLSymbol CB_TOOLS = makeSymbol("CB-TOOLS");



    private static final SubLSymbol $sym25$STRING_ = makeSymbol("STRING<");





    private static final SubLList $list28 = list(makeSymbol("NAME"), makeSymbol("PRETTY-NAME"), makeSymbol("ABBREVIATION"), makeSymbol("DESCRIPTION"), makeSymbol("&OPTIONAL"), makeSymbol("AVAILABILITY"));



    private static final SubLString $$$Toolbar_Modified = makeString("Toolbar Modified");

    private static final SubLString $$$Browser_Toolbar_Modified = makeString("Browser Toolbar Modified");

    private static final SubLString $$$Tools = makeString("Tools");

    private static final SubLSymbol CB_TOOLS_HANDLER = makeSymbol("CB-TOOLS-HANDLER");



    private static final SubLString $str35$cb_tools = makeString("cb-tools");



    private static final SubLSymbol CB_LINK_TOOLS = makeSymbol("CB-LINK-TOOLS");









    private static final SubLSymbol $NEW_VALUE_FN = makeKeyword("NEW-VALUE-FN");

    private static final SubLList $list43 = list(makeSymbol("GLOBAL"));

    private static final SubLSymbol $sym44$FIELD_NAME = makeUninternedSymbol("FIELD-NAME");

    private static final SubLSymbol $sym45$LEGEND_FORM = makeUninternedSymbol("LEGEND-FORM");



    private static final SubLSymbol CB_BOOLEAN_OPTION_FIELD_NAME = makeSymbol("CB-BOOLEAN-OPTION-FIELD-NAME");



    private static final SubLSymbol CB_BOOLEAN_OPTION_LEGEND_FORM = makeSymbol("CB-BOOLEAN-OPTION-LEGEND-FORM");









    private static final SubLSymbol CB_CHECKBOX_OPTION = makeSymbol("CB-CHECKBOX-OPTION");

    private static final SubLSymbol CB_BOOLEAN_OPTION_CHECK = makeSymbol("CB-BOOLEAN-OPTION-CHECK");



    private static final SubLSymbol $cb_c_wrap_assertions$ = makeSymbol("*CB-C-WRAP-ASSERTIONS*");

    private static final SubLList $list58 = list(makeKeyword("FIELD-NAME"), makeString("wrap-assertions"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Wrap Assertions (tries to tidy up assertion displays)")));

    private static final SubLSymbol $sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__ = makeSymbol("*CB-DISPLAY-UNICODE-NAUTS-AS-STRINGS?*");

    private static final SubLList $list60 = list(makeKeyword("FIELD-NAME"), makeString("unicode-as-strings"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Display Unicode NAUTs as strings (instead of as NAUTs)")));

    private static final SubLSymbol $sym61$_CB_DISPLAY_DATES_AS_STRINGS__ = makeSymbol("*CB-DISPLAY-DATES-AS-STRINGS?*");

    private static final SubLList $list62 = list(makeKeyword("FIELD-NAME"), makeString("dates-as-strings"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Display dates as DateFromString NAUTs")));

    private static final SubLSymbol $sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__ = makeSymbol("*CB-DISPLAY-DECIMALS-AS-DECIMALS?*");

    private static final SubLList $list64 = list(makeKeyword("FIELD-NAME"), makeString("decimals-as-decimals"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Display decimal fractions as decimals")));

    private static final SubLSymbol $sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__ = makeSymbol("*CB-DISPLAY-FRACTIONS-AS-FRACTIONS?*");

    private static final SubLList $list66 = list(makeKeyword("FIELD-NAME"), makeString("fractions-as-fractions"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Display fractions as fractions")));

    private static final SubLSymbol $cb_wrap_interactor$ = makeSymbol("*CB-WRAP-INTERACTOR*");

    private static final SubLList $list68 = list(makeKeyword("FIELD-NAME"), makeString("wrap-interactor"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Wrap Interactor and Ask input boxes")));

    private static final SubLSymbol $cb_use_dynamic_table_for_inference_results$ = makeSymbol("*CB-USE-DYNAMIC-TABLE-FOR-INFERENCE-RESULTS*");

    private static final SubLList $list70 = list(makeKeyword("FIELD-NAME"), makeString("use-dynamic-table-for-inference-results"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show Final Inference Answers in Dynamic Table (Recommended: allows sorting)")));

    private static final SubLSymbol $sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ = makeSymbol("*CB-SHOW-INFERENCE-RESULTS-IN-NL?*");

    private static final SubLList $list72 = list(makeKeyword("FIELD-NAME"), makeString("show-inference-results-in-nl"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show Inference Answers in English")));

    private static final SubLSymbol $cb_show_cyclify_button$ = makeSymbol("*CB-SHOW-CYCLIFY-BUTTON*");

    public static final SubLList $list74 = list(makeKeyword("FIELD-NAME"), makeString("show-cyclify-button"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show Cyclify Button in Assertion and Query tools")));

    private static final SubLSymbol $cb_enable_inference_monitoring$ = makeSymbol("*CB-ENABLE-INFERENCE-MONITORING*");

    public static final SubLList $list76 = list(makeKeyword("FIELD-NAME"), makeString("enable-inference-monitoring"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Enable inference monitoring")));

    private static final SubLSymbol $cb_separate_doc_frame$ = makeSymbol("*CB-SEPARATE-DOC-FRAME*");

    public static final SubLList $list78 = list(makeKeyword("FIELD-NAME"), makeString("doc-separate"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show documentation in separate window")));

    private static final SubLSymbol $cb_more_assertion_marker_image_text$ = makeSymbol("*CB-MORE-ASSERTION-MARKER-IMAGE-TEXT*");

    public static final SubLList $list80 = list(makeKeyword("FIELD-NAME"), makeString("more-marker-text"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show assertion ball tooltips")));

    private static final SubLSymbol $sym81$_CB_FAST__ = makeSymbol("*CB-FAST?*");

    public static final SubLList $list82 = list(makeKeyword("FIELD-NAME"), makeString("cyc-browser-fast"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Sacrifice some functionality for speed")));

    private static final SubLSymbol $cb_search_autocomplete_enabled$ = makeSymbol("*CB-SEARCH-AUTOCOMPLETE-ENABLED*");

    public static final SubLList $list84 = list(makeKeyword("FIELD-NAME"), makeString("search-autocomplete-enabled"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Allow autocomplete in the search box")));

    private static final SubLSymbol $cb_use_frames$ = makeSymbol("*CB-USE-FRAMES*");

    public static final SubLList $list86 = list(makeKeyword("FIELD-NAME"), makeString("use-frames"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Use frames (recommended)")));

    private static final SubLSymbol $cb_script_mode$ = makeSymbol("*CB-SCRIPT-MODE*");

    public static final SubLList $list88 = list(makeKeyword("FIELD-NAME"), makeString("use-javascript"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Use JavaScript (recommended)")), makeKeyword("CHECK-FN"), makeSymbol("CB-USE-JAVASCRIPT?"), makeKeyword("NEW-VALUE-FN"), makeSymbol("CB-NEW-SCRIPT-MODE"));



    private static final SubLSymbol $cb_hoverover_enabled$ = makeSymbol("*CB-HOVEROVER-ENABLED*");

    private static final SubLList $list91 = list(makeKeyword("FIELD-NAME"), makeString("use-hoverover"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Use overLIB hoverover boxes (slow)")));

    private static final SubLSymbol $cb_a_show_el_formula$ = makeSymbol("*CB-A-SHOW-EL-FORMULA*");

    private static final SubLList $list93 = list(makeKeyword("FIELD-NAME"), makeString("show-el-formula"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show EL formula (slow)")));

    private static final SubLSymbol $cb_a_show_hl_formula$ = makeSymbol("*CB-A-SHOW-HL-FORMULA*");

    private static final SubLList $list95 = list(makeKeyword("FIELD-NAME"), makeString("show-hl-formula"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show HL formula (fast)")));

    private static final SubLSymbol $cb_a_show_english$ = makeSymbol("*CB-A-SHOW-ENGLISH*");

    private static final SubLList $list97 = list(makeKeyword("FIELD-NAME"), makeString("show-english"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show English translation (slow)")));

    private static final SubLSymbol $cb_a_perform_access_diagnostics$ = makeSymbol("*CB-A-PERFORM-ACCESS-DIAGNOSTICS*");

    private static final SubLList $list99 = list(makeKeyword("FIELD-NAME"), makeString("access-diagnostics"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Always perform access diagnostics (slow)")));

    private static final SubLSymbol $sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__ = makeSymbol("*CB-A-EDIT-PRESERVE-META-ASSERTIONS-BY-DEFAULT?*");

    private static final SubLList $list101 = list(makeKeyword("FIELD-NAME"), makeString("preserve-meta-assertions"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Always preserve meta assertions by default")));

    private static final SubLSymbol $sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__ = makeSymbol("*CB-A-CHANGE-ALL-META-ASSERTIONS-MT-BY-DEFAULT?*");

    private static final SubLList $list103 = list(makeKeyword("FIELD-NAME"), makeString("change-all-meta-assertions-mt"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Change Mt of all meta assertions (if all have same Mt as assertion), during change Mt of assertion, by default")));

    private static final SubLSymbol $sym104$_CB_USE_CATEGORIZED_HISTORY__ = makeSymbol("*CB-USE-CATEGORIZED-HISTORY?*");

    private static final SubLList $list105 = list(makeKeyword("FIELD-NAME"), makeString("show-categorized-history"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Categorize constant history display?")));

    private static final SubLSymbol $sym106$_CB_HISTORY_SHOW_EL_FORMULAS__ = makeSymbol("*CB-HISTORY-SHOW-EL-FORMULAS?*");

    private static final SubLList $list107 = list(makeKeyword("FIELD-NAME"), makeString("history-show-el-formulas"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show EL assertion formulas")));

    private static final SubLSymbol $sym108$_ASSUME_CYC_CYCLIST_DIALOG__ = makeSymbol("*ASSUME-CYC-CYCLIST-DIALOG?*");

    private static final SubLList $list109 = list(makeKeyword("FIELD-NAME"), makeString("cyc-cyclist-dialog"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Assume Cyc is addressing the current cyclist")));

    private static final SubLSymbol $sym110$_GENERATED_PHRASES_BROWSABLE__ = makeSymbol("*GENERATED-PHRASES-BROWSABLE?*");

    private static final SubLList $list111 = list(makeKeyword("FIELD-NAME"), makeString("generated-phrases-browsable"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Make generated phrases browsable?")));

    private static final SubLSymbol $sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__ = makeSymbol("*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*");

    private static final SubLList $list113 = list(makeKeyword("FIELD-NAME"), makeString("highlight-demerits-in-generated-phrases"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Highlight phrases with demerits?")));

    private static final SubLSymbol $sym114$_SHOW_FET_EDIT_BUTTONS__ = makeSymbol("*SHOW-FET-EDIT-BUTTONS?*");

    private static final SubLList $list115 = list(makeKeyword("FIELD-NAME"), makeString("fet-edit-buttons"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show buttons for editing with FET")));

    private static final SubLSymbol $sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__ = makeSymbol("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*");

    public static final SubLList $list117 = list(makeKeyword("FIELD-NAME"), makeString("fet-create-instance-buttons"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show buttons for creating instances with FET (semi-experimental)")));

    private static final SubLSymbol $sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__ = makeSymbol("*SHOW-FET-CREATE-SPEC-BUTTONS?*");

    private static final SubLList $list119 = list(makeKeyword("FIELD-NAME"), makeString("fet-create-spec-buttons"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show buttons for creating specs with FET (experimental)")));

    private static final SubLSymbol $cb_show_followup_widget$ = makeSymbol("*CB-SHOW-FOLLOWUP-WIDGET*");

    private static final SubLList $list121 = list(makeKeyword("FIELD-NAME"), makeString("followup-widget"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show the Followup Widget (experimental)")));

    private static final SubLSymbol $sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__ = makeSymbol("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*");

    private static final SubLList $list123 = list(makeKeyword("FIELD-NAME"), makeString("cb-literal-query-results-one-per-line"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Display literal query results one per line")));

    private static final SubLSymbol $sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__ = makeSymbol("*CB-SKOLEM-APPLICABLE-RELATIONS?*");

    private static final SubLList $list125 = list(makeKeyword("FIELD-NAME"), makeString("cb-skolem-applicable-relations"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Display skolem functions")));

    private static final SubLSymbol $sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__ = makeSymbol("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*");

    private static final SubLList $list127 = list(makeKeyword("FIELD-NAME"), makeString("cb-applicable-relations-one-per-line"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Display applicable relations one per line")));

    private static final SubLSymbol $sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__ = makeSymbol("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*");

    private static final SubLList $list129 = list(makeKeyword("FIELD-NAME"), makeString("cb-paraphrase-applicable-relations"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Display paraphrases (slow)")));

    private static final SubLSymbol $use_sme_lexwiz$ = makeSymbol("*USE-SME-LEXWIZ*");

    private static final SubLList $list131 = list(makeKeyword("FIELD-NAME"), makeString("cb-use-sme-lexwiz"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Use Dictionary Assistant (not Lexification Assistant)")));

    public static final SubLList $list132 = list(makeSymbol("PROGN"), list(makeSymbol("HTML-RESET-INPUT"), makeString("Reset Form")), list(makeSymbol("HTML-INDENT")), list(makeSymbol("HTML-SUBMIT-INPUT"), makeString("Submit"), makeString("update")), list(makeSymbol("HTML-INDENT")), list(makeSymbol("HTML-SUBMIT-INPUT"), makeString("Submit & Save"), makeString("update_and_save")), list(makeSymbol("HTML-INDENT")), list(makeSymbol("HTML-SUBMIT-INPUT"), makeString("Load Saved"), makeString("load_saved")));



    private static final SubLString $str134$cb_options_html = makeString("cb-options.html");

    private static final SubLString $$$Browser_Preferences = makeString("Browser Preferences");

    private static final SubLString $str136$cb_options_handler = makeString("cb-options-handler");

    private static final SubLString $$$Reset_Form = makeString("Reset Form");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $$$update = makeString("update");

    private static final SubLString $str140$Submit___Save = makeString("Submit & Save");

    private static final SubLString $str141$update_and_save = makeString("update_and_save");

    private static final SubLString $$$Load_Saved = makeString("Load Saved");

    private static final SubLString $str143$load_saved = makeString("load_saved");

    private static final SubLSymbol CB_OPTIONS = makeSymbol("CB-OPTIONS");

    private static final SubLList $list145 = list(cons(makeKeyword("GENERAL"), makeString("General Options")), cons(makeKeyword("TERM-DISPLAY"), makeString("Term Display Options")), cons(makeKeyword("HISTORY-AND-TOOLS"), makeString("History and Browser Tool Options")), cons(makeKeyword("NL"), makeString("NL Options")), cons(makeKeyword("QUERY-TOOL"), makeString("Query Tool")), cons(makeKeyword("CZER"), makeString("Canonicalizer Options")));

    private static final SubLString $$$Jump_to_Section = makeString("Jump to Section");

    private static final SubLList $list147 = cons(makeUninternedSymbol("KEY"), makeSymbol("NAME"));

    private static final SubLString $str148$_ = makeString("#");

    public static final SubLList $list149 = list(list(makeSymbol("KEY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym150$NAME = makeUninternedSymbol("NAME");

    private static final SubLSymbol ALIST_LOOKUP_WITHOUT_VALUES = makeSymbol("ALIST-LOOKUP-WITHOUT-VALUES");

    private static final SubLSymbol $cb_option_section_names$ = makeSymbol("*CB-OPTION-SECTION-NAMES*");

    private static final SubLList $list153 = list(makeSymbol("HTML-HR"));

    private static final SubLSymbol HTML_HEADING = makeSymbol("HTML-HEADING");

    public static final SubLList $list155 = list(THREE_INTEGER);

    private static final SubLSymbol HTML_FANCY_DIV = makeSymbol("HTML-FANCY-DIV");





    private static final SubLSymbol HTML_FANCY_TABLE = makeSymbol("HTML-FANCY-TABLE");

    private static final SubLList $list160 = list(makeKeyword("NOFLOW"), T, makeKeyword("BORDER"), ZERO_INTEGER, makeKeyword("CELLPADDING"), ZERO_INTEGER, makeKeyword("CELLSPACING"), ZERO_INTEGER);





    private static final SubLList $list163 = list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-INDENT"), FOUR_INTEGER));



    private static final SubLList $list165 = list(makeKeyword("ALIGN"), makeKeyword("LEFT"), makeKeyword("VALIGN"), makeKeyword("TOP"));

    private static final SubLList $list166 = list(list(makeSymbol("NAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list167 = list(FOUR_INTEGER);



    private static final SubLString $str169$_A__ = makeString("~A :");

    private static final SubLSymbol CB_OPTION_WITH_TITLE_ONLY = makeSymbol("CB-OPTION-WITH-TITLE-ONLY");

    private static final SubLList $list171 = list(list(makeSymbol("TITLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol HTML_PRINC_STRONG = makeSymbol("HTML-PRINC-STRONG");

    private static final SubLList $list173 = list(makeSymbol("HTML-PRINC-STRONG"), makeString(" :"));

    private static final SubLList $list174 = list(makeSymbol("HTML-NEWLINE"));

    private static final SubLSymbol CB_OPTION_WITH_TITLE_AND_HOVEROVER = makeSymbol("CB-OPTION-WITH-TITLE-AND-HOVEROVER");

    private static final SubLSymbol CB_OPTION_WITH_TITLE = makeSymbol("CB-OPTION-WITH-TITLE");

    private static final SubLList $list177 = list(list(makeSymbol("TITLE"), makeSymbol("HOVEROVER")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol HTML_PRINC_STRONG_WITH_EXPLANATION = makeSymbol("HTML-PRINC-STRONG-WITH-EXPLANATION");

    private static final SubLList $list180 = list(list(makeSymbol("TITLE"), makeSymbol("&KEY"), makeSymbol("HOVEROVER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list181 = list(makeKeyword("HOVEROVER"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLList $list184 = list(list(makeSymbol("NAME"), makeSymbol("CHECKED?")), makeSymbol("&BODY"), makeSymbol("LEGEND-FORM"));

    private static final SubLSymbol HTML_CHECKBOX_INPUT = makeSymbol("HTML-CHECKBOX-INPUT");

    private static final SubLList $list186 = list(makeSymbol("HTML-INDENT"), TWO_INTEGER);

    private static final SubLList $list187 = list(list(makeSymbol("HTML-NEWLINE")));

    private static final SubLString $str188$__ = makeString(" :");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLString $$$Clear = makeString("Clear");





    private static final SubLSymbol $sym193$_HLMTS_SUPPORTED__ = makeSymbol("*HLMTS-SUPPORTED?*");

    private static final SubLString $str194$Simple_transformations_to_make_co = makeString("Simple transformations to make complex terms easier to read");

    private static final SubLString $$$NAUT_Readability = makeString("NAUT Readability");

    private static final SubLString $$$Miscellaneous = makeString("Miscellaneous");

    private static final SubLString $$$Primary_Presentation_Language = makeString("Primary Presentation Language");

    private static final SubLString $str198$presentation_language = makeString("presentation-language");

    private static final SubLString $str199$_cycl = makeString(":cycl");



    private static final SubLString $str201$CycL__default_ = makeString("CycL (default)");

    private static final SubLString $str202$_nl = makeString(":nl");



    private static final SubLString $str204$Natural_Language__slow_ = makeString("Natural Language (slow)");

    private static final SubLString $$$Status_Frame_Update = makeString("Status Frame Update");

    private static final SubLString $$$Update_every_ = makeString("Update every ");

    private static final SubLString $str207$status_interval = makeString("status-interval");

    private static final SubLString $str208$seconds__or_empty_to_disable_ = makeString("seconds (or empty to disable)");



    private static final SubLString $$$Default_Index_View = makeString("Default Index View");

    private static final SubLString $str211$index_view = makeString("index-view");

    private static final SubLString $str212$_inferred = makeString(":inferred");



    private static final SubLString $$$Inferred = makeString("Inferred");

    private static final SubLString $str215$_legacy = makeString(":legacy");



    private static final SubLString $$$Legacy = makeString("Legacy");

    private static final SubLString $$$Default_Content = makeString("Default Content");

    private static final SubLString $$$content = makeString("content");

    private static final SubLString $str220$upper_bound = makeString("upper-bound");

    private static final SubLString $str221$_maximal = makeString(":maximal");



    private static final SubLString $$$As_much_as_possible_up_to_ = makeString("As much as possible up to ");

    private static final SubLString $$$_assertions = makeString(" assertions");

    private static final SubLString $str225$_documentation = makeString(":documentation");



    private static final SubLString $$$Documentation = makeString("Documentation");

    private static final SubLString $str228$_definitional = makeString(":definitional");



    private static final SubLString $$$Definitional_Information = makeString("Definitional Information");

    private static final SubLString $str231$_lexical = makeString(":lexical");



    private static final SubLString $$$Lexical_Information = makeString("Lexical Information");

    private static final SubLString $$$Assertion_Formulas = makeString("Assertion Formulas");

    private static final SubLString $str235$formulas_display = makeString("formulas-display");

    private static final SubLString $str236$_hl_formulas = makeString(":hl-formulas");



    private static final SubLString $str238$HL_formulas__fast_ = makeString("HL formulas (fast)");

    private static final SubLString $str239$_el_formulas = makeString(":el-formulas");



    private static final SubLString $str241$EL_formulas__slow_ = makeString("EL formulas (slow)");

    private static final SubLString $str242$_el_formulas_except_when_browsing = makeString(":el-formulas-except-when-browsing-skolems");

    private static final SubLSymbol $EL_FORMULAS_EXCEPT_WHEN_BROWSING_SKOLEMS = makeKeyword("EL-FORMULAS-EXCEPT-WHEN-BROWSING-SKOLEMS");

    private static final SubLString $str244$EL_formulas_except_when_browsing_ = makeString("EL formulas except when browsing skolems (slow)");

    private static final SubLString $$$Literal_Queries = makeString("Literal Queries");

    private static final SubLString $$$Applicable_Relations = makeString("Applicable Relations");

    private static final SubLString $$$Assertion_Display_Options = makeString("Assertion Display Options");

    private static final SubLString $$$Assertion_Editing_Options = makeString("Assertion Editing Options");

    private static final SubLString $$$FET_Launching_Buttons = makeString("FET Launching Buttons");

    private static final SubLSymbol $HISTORY_AND_TOOLS = makeKeyword("HISTORY-AND-TOOLS");

    private static final SubLString $$$History_Display_Options = makeString("History Display Options");

    private static final SubLString $$$Display_no_more_than_ = makeString("Display no more than ");

    private static final SubLString $str253$constant_history_max = makeString("constant-history-max");

    private static final SubLString $$$_constants = makeString(" constants");

    private static final SubLString $str255$constant_history_chronological_ma = makeString("constant-history-chronological-max");

    private static final SubLString $$$_constants_chronologically = makeString(" constants chronologically");

    private static final SubLString $str257$nat_history_max = makeString("nat-history-max");

    private static final SubLString $$$_NARTs = makeString(" NARTs");

    private static final SubLString $str259$assertion_history_max = makeString("assertion-history-max");

    private static final SubLString $str260$sentence_history_max = makeString("sentence-history-max");

    private static final SubLString $$$_sentences = makeString(" sentences");

    private static final SubLString $$$Browser_Tool_Options = makeString("Browser Tool Options");

    private static final SubLString $$$Default_Mt = makeString("Default Mt");

    private static final SubLString $str264$default_mt = makeString("default-mt");

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

    private static final SubLString $str266$What_microtheory_should_be_used_a = makeString("What microtheory should be used as a default in forms?");

    private static final SubLSymbol $sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__ = makeSymbol("*CB-PROOF-VIEW-SHOW-BUG-REPORT-LINKS?*");

    private static final SubLList $list268 = list(makeKeyword("FIELD-NAME"), makeString("proof-view-bug-report-links"), makeKeyword("LEGEND-FORM"), list(makeSymbol("HTML-PRINC"), makeString("Show proof-view bug report links?")));

    private static final SubLString $$$NL_Generation = makeString("NL Generation");

    private static final SubLString $str270$Which_mt_should_be_used_for_gener = makeString("Which mt should be used for generating NL in the Cyc Browser?");

    private static final SubLString $$$Default_NL_Generation_Mt = makeString("Default NL Generation Mt");

    private static final SubLList $list272 = list(makeKeyword("INPUT-NAME"), makeString("pph-mt"));

    private static final SubLString $$$Proof_Views = makeString("Proof Views");

    private static final SubLString $str274$Which_parameters_should_be_used_f = makeString("Which parameters should be used for proof views generated from the browser?");

    private static final SubLString $$$Default_Parameters = makeString("Default Parameters");

    private static final SubLString $str276$proof_view_params = makeString("proof-view-params");



    private static final SubLList $list278 = list(reader_make_constant_shell(makeString("DefaultParameterSpecificationFn")), reader_make_constant_shell(makeString("CycProofViewGenerator")));

    private static final SubLList $list279 = list(reader_make_constant_shell(makeString("SpecificationTypeFromParameterTypeFn")), list(reader_make_constant_shell(makeString("ParameterTypeOfProgramFn")), reader_make_constant_shell(makeString("CycProofViewGenerator"))));

    private static final SubLString $$$Lexification = makeString("Lexification");

    private static final SubLString $$$Reviewer = makeString("Reviewer");

    private static final SubLString $str282$lex_reviewer = makeString("lex-reviewer");

    private static final SubLObject $$Cyclist = reader_make_constant_shell(makeString("Cyclist"));

    private static final SubLString $str284$Which_Cyclist_is_to_reviewer_your = makeString("Which Cyclist is to reviewer your lexical assertions? (Blank for none.)");

    private static final SubLString $$$Default_Microtheory = makeString("Default Microtheory");

    private static final SubLString $str286$lex_mt = makeString("lex-mt");

    private static final SubLString $str287$What_microtheory_should_your_lexi = makeString("What microtheory should your lexical-semantic assertions go in?");

    private static final SubLString $$$Default_Syntactic_Microtheory = makeString("Default Syntactic Microtheory");

    private static final SubLString $str289$lex_syntactic_mt = makeString("lex-syntactic-mt");

    private static final SubLString $str290$What_microtheory_should_your_synt = makeString("What microtheory should your syntactic assertions (e.g. #$singular) go in?");

    private static final SubLString $$$Default_Paraphrase_Microtheory = makeString("Default Paraphrase Microtheory");

    private static final SubLString $str292$lex_pph_mt = makeString("lex-pph-mt");

    private static final SubLString $str293$What_microtheory_should_your_para = makeString("What microtheory should your paraphrase assertions go in?");

    private static final SubLString $str294$Default_Parse_Template_Microtheor = makeString("Default Parse Template Microtheory");

    private static final SubLString $str295$lex_parse_template_mt = makeString("lex-parse-template-mt");

    private static final SubLString $str296$What_microtheory_should_your_pars = makeString("What microtheory should your parse template assertions go in?");



    private static final SubLString $$$Results_Display = makeString("Results Display");

    private static final SubLString $str299$Automatically_Destroying_Inferenc = makeString("Automatically Destroying Inferences");

    private static final SubLString $str300$destroy_inferences = makeString("destroy-inferences");

    private static final SubLString $str301$entry_destroy_inferences = makeString("entry-destroy-inferences");

    private static final SubLString $$$Keep_only_last_ = makeString("Keep only last ");

    private static final SubLString $str303$inferences__at_most__defaults_to_ = makeString("inferences (at most, defaults to 10 if empty)");

    private static final SubLString $$$Keep_all = makeString("Keep all");

    private static final SubLString $$$Default_Query_Mt = makeString("Default Query Mt");

    private static final SubLList $list306 = list(makeKeyword("INPUT-NAME"), makeString("default-query-mt"));

    private static final SubLString $$$Closed_Queries = makeString("Closed Queries");

    private static final SubLString $str308$perform_argumentation_for_closed_ = makeString("perform-argumentation-for-closed-query");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $str310$Gather_and_weigh_both_pro_and_con = makeString("Gather and weigh both pro and con arguments");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLString $str312$Attempt_to_prove_only_pro_argumen = makeString("Attempt to prove only pro arguments");





    private static final SubLSymbol CB_OPTIONS_HANDLER = makeSymbol("CB-OPTIONS-HANDLER");

    private static final SubLString $str316$Default_NL_Generation_Mt__The_inp = makeString("Default NL Generation Mt: The input, ~A, was not understood.");

    private static final SubLString $$$DEFAULT = makeString("DEFAULT");



    private static final SubLString $str319$Default_Query_Mt__The_input___A__ = makeString("Default Query Mt: The input, ~A, was not understood.");

    private static final SubLString $$$Preferences = makeString("Preferences");

    private static final SubLString $str321$cb_options = makeString("cb-options");



    private static final SubLSymbol CB_LINK_OPTIONS = makeSymbol("CB-LINK-OPTIONS");

    private static final SubLString $$$Prefs = makeString("Prefs");

    private static final SubLString $str325$Your_new_settings_require_you_to_ = makeString("Your new settings require you to restart your browser.");

    private static final SubLString $$$Click_ = makeString("Click ");



    private static final SubLString $$$here = makeString("here");

    private static final SubLString $str329$_now_to_do_so_ = makeString(" now to do so.");

    private static final SubLString $str330$KB_Browser_Options_have_been_modi = makeString("KB Browser Options have been modified");

    private static final SubLString $$$_and_saved = makeString(" and saved");

    private static final SubLString $str332$_ = makeString(".");

    private static final SubLSymbol CB_HISTORY = makeSymbol("CB-HISTORY");



    private static final SubLString $str335$cb_history_html = makeString("cb-history.html");





    private static final SubLString $$$categorized = makeString("categorized");

    private static final SubLString $str339$ = makeString("");

    private static final SubLSymbol $HISTORY_HL_FORMULAS = makeKeyword("HISTORY-HL-FORMULAS");

    private static final SubLSymbol $HISTORY_EL_FORMULAS = makeKeyword("HISTORY-EL-FORMULAS");

    public static final SubLSymbol $cb_use_css_columns_for_categories$ = makeSymbol("*CB-USE-CSS-COLUMNS-FOR-CATEGORIES*");

    private static final SubLString $str343$Recent_Constants__ = makeString("Recent Constants :");



    private static final SubLString $str345$_Show_Alphabetical_ = makeString("[Show Alphabetical]");

    private static final SubLString $str346$_Show_Categorized_ = makeString("[Show Categorized]");

    private static final SubLSymbol $CLEAR_CONSTANT_HISTORY = makeKeyword("CLEAR-CONSTANT-HISTORY");



    private static final SubLString $str349$history_constants_columnar = makeString("history-constants columnar");

    private static final SubLString $str350$history_constant = makeString("history-constant");

    private static final SubLString $$$None = makeString("None");

    private static final SubLSymbol $sym352$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");

    private static final SubLSymbol $sym353$ISA_RELATION_ = makeSymbol("ISA-RELATION?");



    private static final SubLString $str355$history_table = makeString("history-table");

    private static final SubLString $str356$history_categorized_column = makeString("history-categorized-column");

    private static final SubLString $str357$history_table_heading = makeString("history-table-heading");

    private static final SubLString $str358$Most_nbsp_Recent = makeString("Most&nbsp;Recent");

    private static final SubLString $$$Collections = makeString("Collections");

    private static final SubLString $$$Individuals = makeString("Individuals");

    private static final SubLString $$$Relations = makeString("Relations");

    private static final SubLString $str362$columns__4__column_count__4____we = makeString("columns: 4; column-count: 4;  -webkit-columns: 4; -moz-columns:4;");

    private static final SubLString $str363$display_block__break_after__colum = makeString("display:block; break-after: column; -webkit-column-break-after: always; overflow:hidden");

    private static final SubLString $str364$display__block__break_after__colu = makeString("display: block; break-after: column; -webkit-column-break-after: always; overflow:hidden");

    private static final SubLString $str365$display__block__break_after__colu = makeString("display: block; break-after: column; break-before: column; break-before: column; -webkit-column-break-after: always; overflow:hidden");

    private static final SubLString $str366$Recent_NATs__ = makeString("Recent NATs :");

    private static final SubLSymbol $CLEAR_NAT_HISTORY = makeKeyword("CLEAR-NAT-HISTORY");

    private static final SubLString $str368$history_nats_columnar = makeString("history-nats columnar");

    private static final SubLString $str369$history_nat = makeString("history-nat");

    private static final SubLString $str370$Recent_Sentences__ = makeString("Recent Sentences :");

    private static final SubLSymbol $CLEAR_SENTENCE_HISTORY = makeKeyword("CLEAR-SENTENCE-HISTORY");

    private static final SubLString $$$cyclistReadilyAvailableTerms = makeString("cyclistReadilyAvailableTerms");



    private static final SubLString $str374$font_size__larger__font_weight_bo = makeString("font-size: larger; font-weight:bold");

    private static final SubLString $str375$To_remove_a_bookmark__follow_the_ = makeString("To remove a bookmark, follow the link to the bookmarked item and click on the star.");

    private static final SubLString $str376$Bookmarked_Constants__ = makeString("Bookmarked Constants :");

    private static final SubLString $str377$bookmarked_constants_columnar = makeString("bookmarked-constants columnar");

    private static final SubLString $str378$bookmarked_constant = makeString("bookmarked-constant");

    private static final SubLSymbol CYCL_NAT_P = makeSymbol("CYCL-NAT-P");

    private static final SubLString $str380$Bookmarked_NATs__ = makeString("Bookmarked NATs :");

    private static final SubLString $str381$bookmarked_nats_columnar = makeString("bookmarked-nats columnar");

    private static final SubLString $str382$bookmarked_nat = makeString("bookmarked-nat");

    private static final SubLString $str383$Bookmarked_Assertions__ = makeString("Bookmarked Assertions :");

    private static final SubLString $str384$bookmarked_asserts_columnar = makeString("bookmarked-asserts columnar");

    private static final SubLString $str385$bookmarked_assert = makeString("bookmarked-assert");

    private static final SubLString $str386$Recent_Assertions__ = makeString("Recent Assertions :");

    private static final SubLSymbol $CLEAR_ASSERTION_HISTORY = makeKeyword("CLEAR-ASSERTION-HISTORY");

    private static final SubLSymbol CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY = makeSymbol("CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY");

    private static final SubLSymbol CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY = makeSymbol("CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY");

    private static final SubLSymbol CB_ASSERTION_LINK_WITH_MT = makeSymbol("CB-ASSERTION-LINK-WITH-MT");

    private static final SubLSymbol CB_ASSERTION_LINK = makeSymbol("CB-ASSERTION-LINK");





    private static final SubLString $str394$history_tool_gif = makeString("history-tool.gif");

    private static final SubLString $$$History = makeString("History");

    private static final SubLString $str396$cb_history_categorized = makeString("cb-history&categorized");

    private static final SubLString $str397$cb_history_alphabetical = makeString("cb-history&alphabetical");

    private static final SubLSymbol CB_LINK_HISTORY = makeSymbol("CB-LINK-HISTORY");

    private static final SubLString $$$Hist = makeString("Hist");

    private static final SubLString $$$Recent_Browser_History = makeString("Recent Browser History");

    private static final SubLList $list401 = list(makeSymbol("GROUP"), makeSymbol("&OPTIONAL"), makeSymbol("STYLE"));











    private static final SubLSymbol CB_CLEAR_HISTORY = makeSymbol("CB-CLEAR-HISTORY");

    private static final SubLString $str408$_Clear_History_ = makeString("[Clear History]");

    private static final SubLString $str409$cb_clear_history_ALL = makeString("cb-clear-history&ALL");



    private static final SubLSymbol CB_LINK_CLEAR_HISTORY = makeSymbol("CB-LINK-CLEAR-HISTORY");

    private static final SubLString $str412$_Clear_Constant_History_ = makeString("[Clear Constant History]");

    private static final SubLString $str413$cb_clear_history_CONSTANT__A = makeString("cb-clear-history&CONSTANT&~A");

    private static final SubLSymbol CB_LINK_CLEAR_CONSTANT_HISTORY = makeSymbol("CB-LINK-CLEAR-CONSTANT-HISTORY");

    private static final SubLString $str415$_Clear_NAT_History_ = makeString("[Clear NAT History]");

    private static final SubLString $str416$cb_clear_history_NAT = makeString("cb-clear-history&NAT");

    private static final SubLSymbol CB_LINK_CLEAR_NAT_HISTORY = makeSymbol("CB-LINK-CLEAR-NAT-HISTORY");

    private static final SubLString $str418$_Clear_Assertion_History_ = makeString("[Clear Assertion History]");

    private static final SubLString $str419$cb_clear_history_ASSERTION = makeString("cb-clear-history&ASSERTION");

    private static final SubLSymbol CB_LINK_CLEAR_ASSERTION_HISTORY = makeSymbol("CB-LINK-CLEAR-ASSERTION-HISTORY");

    private static final SubLString $str421$_Clear_Sentence_History_ = makeString("[Clear Sentence History]");

    private static final SubLString $str422$cb_clear_history_SENTENCE = makeString("cb-clear-history&SENTENCE");

    private static final SubLSymbol CB_LINK_CLEAR_SENTENCE_HISTORY = makeSymbol("CB-LINK-CLEAR-SENTENCE-HISTORY");

    private static final SubLSymbol CB_HISTORY_EL_FORMULAS = makeSymbol("CB-HISTORY-EL-FORMULAS");

    private static final SubLString $str425$_EL_Formulas_ = makeString("[EL Formulas]");

    private static final SubLString $str426$cb_history_el_formulas = makeString("cb-history-el-formulas");

    private static final SubLSymbol CB_LINK_HISTORY_EL_FORMULAS = makeSymbol("CB-LINK-HISTORY-EL-FORMULAS");

    private static final SubLSymbol CB_HISTORY_HL_FORMULAS = makeSymbol("CB-HISTORY-HL-FORMULAS");

    private static final SubLString $str429$_HL_Formulas_ = makeString("[HL Formulas]");

    private static final SubLString $str430$cb_history_hl_formulas = makeString("cb-history-hl-formulas");

    private static final SubLSymbol CB_LINK_HISTORY_HL_FORMULAS = makeSymbol("CB-LINK-HISTORY-HL-FORMULAS");



    private static final SubLString $str433$Unable_to_add__S_to_history = makeString("Unable to add ~S to history");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol $sym435$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLSymbol CB_VALID_NAT_P = makeSymbol("CB-VALID-NAT-P");

    private static final SubLSymbol TREE_FIND = makeSymbol("TREE-FIND");

    private static final SubLSymbol TERM_OF_UNIT = makeSymbol("TERM-OF-UNIT");



    private static final SubLSymbol EXPRESSION_FORTS_WITH_HL = makeSymbol("EXPRESSION-FORTS-WITH-HL");



    private static final SubLSymbol EXPRESSION_FORTS = makeSymbol("EXPRESSION-FORTS");

    private static final SubLSymbol CB_BOOKMARKED_ITEMS = makeSymbol("CB-BOOKMARKED-ITEMS");



    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    private static final SubLObject $$CyclistsMt = reader_make_constant_shell(makeString("CyclistsMt"));

    private static final SubLObject $$MtTimeWithGranularityDimFn = reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn"));

    private static final SubLList $list449 = list(reader_make_constant_shell(makeString("TimePoint")));

    private static final SubLSymbol $sym450$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $$cyclistReadilyAvailableTerms = reader_make_constant_shell(makeString("cyclistReadilyAvailableTerms"));

    private static final SubLSymbol NAME_FOR_ALPHA_SORT = makeSymbol("NAME-FOR-ALPHA-SORT");

    private static final SubLSymbol $cb_bookmarked_items_caching_state$ = makeSymbol("*CB-BOOKMARKED-ITEMS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CB_BOOKMARKED_ITEMS = makeSymbol("CLEAR-CB-BOOKMARKED-ITEMS");

    private static final SubLString $str455$_ = makeString("~");

    private static final SubLString $$$Recently_Added_KB_Content = makeString("Recently Added KB Content");

    private static final SubLString $str457$float__right = makeString("float: right");

    private static final SubLSymbol $RECENT_KB_ADDITIONS = makeKeyword("RECENT-KB-ADDITIONS");

    private static final SubLString $str459$_Refresh_Page_ = makeString("[Refresh Page]");

    private static final SubLSymbol CB_RECENT_KB_ADDITIONS = makeSymbol("CB-RECENT-KB-ADDITIONS");

    private static final SubLString $str461$_Recently_Added_KB_Content = makeString("[Recently Added KB Content");

    private static final SubLString $str462$cb_recent_kb_additions = makeString("cb-recent-kb-additions");

    private static final SubLSymbol CB_LINK_RECENT_KB_ADDITIONS = makeSymbol("CB-LINK-RECENT-KB-ADDITIONS");

    private static final SubLList $list464 = list(makeKeyword("CONSTANT"), makeKeyword("NART"), makeKeyword("ASSERTION"), makeKeyword("DEDUCTION"), makeKeyword("KB-HL-SUPPORT"));

    private static final SubLString $str465$Recent_constants_ = makeString("Recent constants:");

    private static final SubLString $$$mapping_constants_for_sweep = makeString("mapping constants for sweep");

    private static final SubLString $$$cdolist = makeString("cdolist");





    private static final SubLString $str470$Recent_NARTs_ = makeString("Recent NARTs:");

    private static final SubLString $$$mapping_narts_for_sweep = makeString("mapping narts for sweep");

    private static final SubLString $str472$Recent_assertions_ = makeString("Recent assertions:");

    private static final SubLString $$$mapping_assertions_for_sweep = makeString("mapping assertions for sweep");



    private static final SubLString $str475$Recent_deductions_ = makeString("Recent deductions:");

    private static final SubLString $$$mapping_deductions_for_sweep = makeString("mapping deductions for sweep");

    private static final SubLSymbol $KB_HL_SUPPORTS = makeKeyword("KB-HL-SUPPORTS");

    private static final SubLString $str478$Recent_KB_HL_supports_ = makeString("Recent KB HL supports:");

    private static final SubLString $str479$mapping_kb_hl_supports_for_sweep = makeString("mapping kb-hl-supports for sweep");



    private static final SubLList $list481 = list(makeKeyword("BROWSING-AND-EDITING"));

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $$$the_SubLisp_Interactor = makeString("the SubLisp Interactor");

    private static final SubLString $$$interactor = makeString("interactor");

    private static final SubLString $$$SubL_Interactor = makeString("SubL Interactor");

    private static final SubLString $str486$cb_handle_interactor = makeString("cb-handle-interactor");

    private static final SubLString $$$document = makeString("document");

    private static final SubLString $str488$input_string = makeString("input-string");

    private static final SubLSymbol CB_HANDLE_INTERACTOR = makeSymbol("CB-HANDLE-INTERACTOR");

    private static final SubLSymbol $CB_HANDLE_INTERACTOR = makeKeyword("CB-HANDLE-INTERACTOR");

    private static final SubLString $str491$cb_handle_interactor_html = makeString("cb-handle-interactor.html");

    private static final SubLSymbol $HTML_EDITOR_SCRIPTS = makeKeyword("HTML-EDITOR-SCRIPTS");

    private static final SubLString $$$Eval = makeString("Eval");

    private static final SubLString $str494$Enter_A_Form__ = makeString("Enter A Form :");

    private static final SubLString $$$Reset = makeString("Reset");

    private static final SubLString $$$Cyclify = makeString("Cyclify");





    private static final SubLString $str499$Malformed_expression___ = makeString("Malformed expression : ");

    private static final SubLString $str500$Last_Form_Evaluated___ = makeString("Last Form Evaluated : ");

    private static final SubLString $str501$Results___ = makeString("Results : ");





    private static final SubLString $str504$ERROR___ = makeString("ERROR : ");

    private static final SubLString $$$Interactor = makeString("Interactor");



    private static final SubLSymbol CB_LINK_INTERACTOR = makeSymbol("CB-LINK-INTERACTOR");

    private static final SubLString $$$SubL = makeString("SubL");

    private static final SubLString $str509$_ = makeString("(");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str511$_ = makeString(")");



    private static final SubLString $str513$__ = makeString("#'");

    private static final SubLString $str514$_ = makeString("'");

    private static final SubLString $str515$___ = makeString(" . ");

    public static final SubLSymbol $html_state_filename$ = makeSymbol("*HTML-STATE-FILENAME*");

    private static final SubLString $$$pref = makeString("pref");

    private static final SubLString $$$preferences = makeString("preferences");

    private static final SubLString $$$users = makeString("users");

    private static final SubLString $$$Save_Interface = makeString("Save Interface");

    private static final SubLString $$$default = makeString("default");

    private static final SubLString $str522$Interface_Settings_Loaded_Success = makeString("Interface Settings Loaded Successfully.");

    private static final SubLString $str523$No_Interface_Settings_File_To_Loa = makeString("No Interface Settings File To Load.");

    private static final SubLSymbol CB_LOAD_USER_PREFERENCES = makeSymbol("CB-LOAD-USER-PREFERENCES");

    private static final SubLInteger $int$70 = makeInteger(70);

    private static final SubLSymbol $CB_LOAD_API = makeKeyword("CB-LOAD-API");

    private static final SubLString $str527$cb_load_api_html = makeString("cb-load-api.html");

    private static final SubLString $$$the_KE_Load_Page = makeString("the KE Load Page");

    private static final SubLString $$$Load_API_Expressions_Page = makeString("Load API Expressions Page");

    private static final SubLString $str530$cb_load_api_handler = makeString("cb-load-api-handler");

    private static final SubLString $str531$Please_type_in_the_name_of_the_fi = makeString("Please type in the name of the file to load and evaluate in the space below and hit the ");

    private static final SubLString $str532$_Load_File__ = makeString("[Load File] ");

    private static final SubLString $str533$button_ = makeString("button.");

    private static final SubLString $str534$load_api_file_name = makeString("load-api-file-name");

    private static final SubLString $$$Load_File = makeString("Load File");

    private static final SubLSymbol CB_LOAD_API = makeSymbol("CB-LOAD-API");

    private static final SubLString $str537$cb_load_api_handler_called_with_n = makeString("cb-load-api-handler called with no arguments");

    private static final SubLString $$$Load_API_Expressions_Results = makeString("Load API Expressions Results");

    private static final SubLString $str539$load_api_file_skip = makeString("load-api-file-skip");

    private static final SubLString $str540$The_file__ = makeString("The file '");

    private static final SubLString $str541$__was_loaded___Here_are_the_resul = makeString("' was loaded.  Here are the results:");



    private static final SubLString $str543$Successfully_and_completely_loade = makeString("Successfully and completely loaded!");

    private static final SubLString $str544$File__s_does_not_exist_ = makeString("File ~s does not exist!");

    private static final SubLString $str545$KE_filename_was_not_a_string_ = makeString("KE filename was not a string.");

    private static final SubLSymbol CB_LOAD_API_HANDLER = makeSymbol("CB-LOAD-API-HANDLER");

    private static final SubLSymbol $FILE_NOT_FOUND = makeKeyword("FILE-NOT-FOUND");

    private static final SubLString $str548$An_error_occurred_after_processin = makeString("An error occurred after processing ");

    private static final SubLString $str549$_forms_ = makeString(" forms.");

    private static final SubLString $$$Form_Number = makeString("Form Number");

    private static final SubLString $str551$You_may_continue_processing_this_ = makeString("You may continue processing this file.  Enter the number of the form to start (so you may skip the already processed forms or forms that have errors in them).");

    private static final SubLString $$$KE_File_Name = makeString("KE File Name");

    private static final SubLString $str553$You_may_also_specify_a_new_file_t = makeString("You may also specify a new file to load.  If you change this file, make sure to change the number of forms to skip (above) to 0 to start processing the new form from the beginning.");

    private static final SubLSymbol $CB_SHOW_WHEN = makeKeyword("CB-SHOW-WHEN");

    private static final SubLString $str555$cb_show_when_html = makeString("cb-show-when.html");

    private static final SubLString $$$the_Display_by_Date = makeString("the Display by Date");

    private static final SubLString $$$Display_by_Date = makeString("Display by Date");

    private static final SubLString $str558$cb_show_when_handler = makeString("cb-show-when-handler");

    private static final SubLString $str559$What_kind_of_data_do_you_want_to_ = makeString("What kind of data do you want to display?");

    private static final SubLString $str560$cb_show_type = makeString("cb-show-type");

    private static final SubLString $$$Constants = makeString("Constants");

    private static final SubLString $$$Assertions = makeString("Assertions");

    private static final SubLString $str563$Enter_in_the_start_date_ = makeString("Enter in the start date:");

    private static final SubLString $$$Month = makeString("Month");

    private static final SubLString $str565$cb_show_start_month = makeString("cb-show-start-month");

    private static final SubLString $$$Day = makeString("Day");

    private static final SubLString $str567$cb_show_start_day = makeString("cb-show-start-day");

    private static final SubLString $$$Year = makeString("Year");

    private static final SubLString $str569$cb_show_start_year = makeString("cb-show-start-year");

    private static final SubLString $str570$Enter_in_the_ending_date_ = makeString("Enter in the ending date:");

    private static final SubLString $str571$cb_show_end_month = makeString("cb-show-end-month");

    private static final SubLString $str572$cb_show_end_day = makeString("cb-show-end-day");

    private static final SubLString $str573$cb_show_end_year = makeString("cb-show-end-year");

    private static final SubLString $str574$Enter_the_cyclist_to_examine__bla = makeString("Enter the cyclist to examine (blank indicates to examine ALL cyclists):");

    private static final SubLString $str575$cb_show_cyclist = makeString("cb-show-cyclist");

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLString $str577$Enter_the_project_to_examine__bla = makeString("Enter the project to examine (blank indicates to examine ALL projects):");

    private static final SubLString $str578$cb_show_project = makeString("cb-show-project");

    private static final SubLObject $$Cyc_BasedProject = reader_make_constant_shell(makeString("Cyc-BasedProject"));

    private static final SubLSymbol CB_SHOW_WHEN = makeSymbol("CB-SHOW-WHEN");

    private static final SubLSymbol $CB_SHOW_WHEN_HANDLER = makeKeyword("CB-SHOW-WHEN-HANDLER");

    private static final SubLString $str582$cb_show_when_handler_html = makeString("cb-show-when-handler.html");

    private static final SubLString $str583$Please_specify_either_a_Constant_ = makeString("Please specify either a Constant or an Assertion search.");

    private static final SubLString $str584$Unknown_cyclist___S = makeString("Unknown cyclist: ~S");

    private static final SubLString $str585$Unknown_project___S = makeString("Unknown project: ~S");

    private static final SubLString $$$Date_Search_Results = makeString("Date Search Results");

    private static final SubLString $$$Listing_ = makeString("Listing ");

    private static final SubLString $$$constants = makeString("constants");

    private static final SubLString $$$assertions = makeString("assertions");

    private static final SubLString $$$_created_from_ = makeString(" created from ");

    private static final SubLString $$$_to_ = makeString(" to ");

    private static final SubLString $$$_by_ = makeString(" by ");

    private static final SubLString $$$_for_ = makeString(" for ");

    private static final SubLSymbol CONSTANTS_FOR_PROJECTS_BETWEEN = makeSymbol("CONSTANTS-FOR-PROJECTS-BETWEEN");

    private static final SubLSymbol CONSTANTS_CREATED_BETWEEN = makeSymbol("CONSTANTS-CREATED-BETWEEN");

    private static final SubLSymbol ASSERTIONS_FOR_PROJECTS_BETWEEN = makeSymbol("ASSERTIONS-FOR-PROJECTS-BETWEEN");

    private static final SubLSymbol ASSERTIONS_BETWEEN = makeSymbol("ASSERTIONS-BETWEEN");

    private static final SubLSymbol $sym598$_CONSTANT = makeSymbol("?CONSTANT");

    private static final SubLSymbol $sym599$_ASSERTION = makeSymbol("?ASSERTION");

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym601$_TERM_LIST = makeSymbol("?TERM-LIST");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

    private static final SubLObject $$EvaluateSubLFn = reader_make_constant_shell(makeString("EvaluateSubLFn"));

    private static final SubLObject $$SubLQuoteFn = reader_make_constant_shell(makeString("SubLQuoteFn"));

    private static final SubLObject $$memberOfList = reader_make_constant_shell(makeString("memberOfList"));

    private static final SubLList $list607 = list(cons(reader_make_constant_shell(makeString("TheList")), makeSymbol("?TERM-LIST")));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLList $list609 = list(makeKeyword("BROWSABLE?"), T, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));



    private static final SubLString $str611$Expected_When_Tool_inference_halt = makeString("Expected When Tool inference halt reason to be :EXHAUST-TOTAL, but it was ~s");

    private static final SubLSymbol CB_SHOW_WHEN_HANDLER = makeSymbol("CB-SHOW-WHEN-HANDLER");

    private static final SubLString $str613$None_for_the_given_time_period_ = makeString("None for the given time period.");

    private static final SubLString $str614$_a__a___ = makeString("~a ~a.~%");

    private static final SubLSymbol $SAVE_INFERENCE_ANSWERS = makeKeyword("SAVE-INFERENCE-ANSWERS");

    private static final SubLString $$$_in_ = makeString(" in ");

    private static final SubLString $$$When = makeString("When");

    private static final SubLString $str618$cb_show_when = makeString("cb-show-when");



    private static final SubLSymbol CB_LINK_SHOW_WHEN = makeSymbol("CB-LINK-SHOW-WHEN");

    private static final SubLString $str621$Display_assertions_constants_by_d = makeString("Display assertions/constants by date");

    private static final SubLSymbol $CB_INDEX_OVERLAP = makeKeyword("CB-INDEX-OVERLAP");

    private static final SubLString $str623$cb_index_overlap_html = makeString("cb-index-overlap.html");

    private static final SubLString $$$Index_Overlap = makeString("Index Overlap");

    private static final SubLString $str625$cb_handle_index_overlap = makeString("cb-handle-index-overlap");

    private static final SubLString $$$Search = makeString("Search");

    private static final SubLString $str627$Enter_required_terms_separated_by = makeString("Enter required terms separated by whitespace : ");

    private static final SubLString $$$terms = makeString("terms");

    private static final SubLString $str629$Enter_terms_to_exclude_separated_ = makeString("Enter terms to exclude separated by whitespace : ");

    private static final SubLString $str630$exclude_terms = makeString("exclude-terms");

    private static final SubLSymbol CB_INDEX_OVERLAP = makeSymbol("CB-INDEX-OVERLAP");

    private static final SubLString $str632$Error_reading_terms___Check_for_t = makeString("Error reading terms.  Check for typos.");

    private static final SubLString $str633$Error_reading_exclude_terms___Che = makeString("Error reading exclude terms.  Check for typos.");

    private static final SubLString $$$Index_Overlap_Results = makeString("Index Overlap Results");

    private static final SubLString $str635$Search_Terms__ = makeString("Search Terms: ");

    private static final SubLString $str636$Please_enter_some_valid_search_te = makeString("Please enter some valid search terms.");

    private static final SubLString $str637$Excluded_Terms__ = makeString("Excluded Terms: ");

    private static final SubLString $str638$Please_enter_more_than_1_search_t = makeString("Please enter more than 1 search term.");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str641$Index_Overlap___ = makeString("Index Overlap: (");

    private static final SubLString $str642$_assertions_found_ = makeString(" assertions found)");

    private static final SubLSymbol CB_HANDLE_INDEX_OVERLAP = makeSymbol("CB-HANDLE-INDEX-OVERLAP");

    private static final SubLString $$$Overlap = makeString("Overlap");

    private static final SubLString $str645$cb_index_overlap = makeString("cb-index-overlap");



    private static final SubLSymbol CB_LINK_INDEX_OVERLAP = makeSymbol("CB-LINK-INDEX-OVERLAP");

    private static final SubLString $$$Ovlp = makeString("Ovlp");

    private static final SubLString $$$Term_Index_Overlap = makeString("Term Index Overlap");

    private static final SubLString $$$OWL_Import = makeString("OWL Import");

    private static final SubLString $str651$cb_owl_import = makeString("cb-owl-import");



    private static final SubLSymbol CB_LINK_OWL_IMPORT = makeSymbol("CB-LINK-OWL-IMPORT");

    private static final SubLString $str654$OWL_I = makeString("OWL-I");

    private static final SubLString $$$OWL_Ontology_Importer = makeString("OWL Ontology Importer");

    private static final SubLString $$$OWL_Export = makeString("OWL Export");

    private static final SubLString $str657$cb_owl_export = makeString("cb-owl-export");



    private static final SubLSymbol CB_LINK_OWL_EXPORT = makeSymbol("CB-LINK-OWL-EXPORT");

    private static final SubLString $str660$OWL_E = makeString("OWL-E");

    private static final SubLString $$$OWL_Ontology_Exporter = makeString("OWL Ontology Exporter");



    private static final SubLString $str663$compose_tool_gif = makeString("compose-tool.gif");

    private static final SubLString $$$Compose = makeString("Compose");

    private static final SubLString $str665$ke_compose = makeString("ke-compose");

    private static final SubLSymbol CB_LINK_COMPOSE = makeSymbol("CB-LINK-COMPOSE");

    private static final SubLString $$$Compose_KE_Text = makeString("Compose KE Text");

    private static final SubLString $$$Comp = makeString("Comp");

    private static final SubLString $$$Navigator = makeString("Navigator");

    private static final SubLString $str670$cyc_navigator = makeString("cyc-navigator");



    private static final SubLSymbol CB_LINK_NAVIGATOR = makeSymbol("CB-LINK-NAVIGATOR");

    private static final SubLString $$$Nav = makeString("Nav");

    private static final SubLString $$$Cyc_Navigator = makeString("Cyc Navigator");



    private static final SubLString $str676$doc_tool_gif = makeString("doc-tool.gif");

    private static final SubLString $str677$_Doc_ = makeString("[Doc]");

    private static final SubLString $$$Doc = makeString("Doc");

    private static final SubLSymbol CB_LINK_DOC = makeSymbol("CB-LINK-DOC");

    private static final SubLString $$$Cyc_Documentation = makeString("Cyc Documentation");

    private static final SubLString $str681$cb_start = makeString("cb-start");

    private static final SubLString $str682$http___ = makeString("http://");

    private static final SubLString $str683$_ = makeString(":");

    private static final SubLInteger $int$3602 = makeInteger(3602);

    private static final SubLString $str685$_cyccgi = makeString("/cyccgi");

    private static final SubLString $str686$_localhost = makeString("/localhost");

    private static final SubLString $str687$_Monitor_ = makeString("[Monitor]");

    private static final SubLString $str688$_kbmonitor_makequery_jsp_kbq_stri = makeString("/kbmonitor/makequery.jsp?kbq_string=");

    private static final SubLString $str689$_cyc_host_string_ = makeString("&cyc_host_string=");

    private static final SubLString $str690$_cyc_port_string_ = makeString("&cyc_port_string=");

    private static final SubLString $str691$_kbmonitor = makeString("-kbmonitor");

    private static final SubLInteger $int$600 = makeInteger(600);

    private static final SubLInteger $int$400 = makeInteger(400);

    private static final SubLSymbol $KB_MONITOR_INDEX_HOOK = makeKeyword("KB-MONITOR-INDEX-HOOK");

    private static final SubLSymbol CB_LINK_KB_MONITOR_INDEX_HOOK = makeSymbol("CB-LINK-KB-MONITOR-INDEX-HOOK");

    private static final SubLString $$$Jstack_for_process_ = makeString("Jstack for process ");

    private static final SubLSymbol CB_JSTACK_TRACE = makeSymbol("CB-JSTACK-TRACE");

    private static final SubLString $$$jstack_Trace = makeString("jstack Trace");

    private static final SubLString $str699$cyc_jstack_trace = makeString("cyc-jstack-trace");



    private static final SubLSymbol CB_LINK_JSTACK_TRACE = makeSymbol("CB-LINK-JSTACK-TRACE");

    private static final SubLList $list702 = list(makeKeyword("CYC-SYSTEM"));

    private static final SubLString $str703$cb_jstack_trace = makeString("cb-jstack-trace");

    private static final SubLString $$$JRTL_jstack_Trace = makeString("JRTL jstack Trace");

    public static SubLObject cb_tools(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Browser_Tools;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str9$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
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
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str15$cb_tools_handler, T, UNPROVIDED);
                            cb_help_preamble($CB_TOOLS, $SELF, $str17$Choose_a_tool__or_modify_the_tool);
                            html_newline(UNPROVIDED);
                            html_reset_input($$$Current_Values);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Update_Toolbar, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_submit_input($str20$Update___Save, $$$save, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            SubLObject tools = set_difference(cb_standard_tools(), cb_deprecated_tools(), UNPROVIDED, UNPROVIDED);
                            cb_tool_columns(tools);
                            tools = cb_deprecated_tools();
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(THREE_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ($$$Deprecated_Tools);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(THREE_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_tool_columns(tools);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
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
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_tool_columns(SubLObject tools) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        tools = Sort.sort(tools, symbol_function($sym25$STRING_), symbol_function(SECOND));
        final SubLObject total = length(tools);
        SubLObject first_column = tools;
        SubLObject second_column = NIL;
        SubLObject third_column = NIL;
        if (total.numGE($cb_tools_split_threshold$.getDynamicValue(thread))) {
            final SubLObject column_size = integerDivide(add(total, THREE_INTEGER), THREE_INTEGER);
            second_column = subseq(tools, column_size, multiply(column_size, TWO_INTEGER));
            third_column = subseq(tools, multiply(column_size, TWO_INTEGER), UNPROVIDED);
            first_column = subseq(tools, ZERO_INTEGER, column_size);
        }
        if (NIL != second_column) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
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
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_tools_internal(first_column);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(FOUR_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_tools_internal(second_column);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(FOUR_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_tools_internal(third_column);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } else {
            cb_tools_internal(first_column);
        }
        return NIL;
    }

    public static SubLObject cb_tools_internal(final SubLObject tools) {
        final SubLThread thread = SubLProcess.currentSubLThread();
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
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdolist_list_var = tools;
            SubLObject tool = NIL;
            tool = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject current;
                    final SubLObject datum = current = tool;
                    SubLObject name = NIL;
                    SubLObject pretty_name = NIL;
                    SubLObject abbreviation = NIL;
                    SubLObject description = NIL;
                    destructuring_bind_must_consp(current, datum, $list28);
                    name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list28);
                    pretty_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list28);
                    abbreviation = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list28);
                    description = current.first();
                    current = current.rest();
                    final SubLObject availability = (current.isCons()) ? current.first() : NIL;
                    destructuring_bind_must_listp(current, datum, $list28);
                    current = current.rest();
                    if (NIL == current) {
                        if (cb_link_method(name).isFunctionSpec()) {
                            final SubLObject default_checkedP = member(name, $cb_user_toolbar_links$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_checkbox_input(prin1_to_string(name), T, default_checkedP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(TWO_INTEGER);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_span_head$.getGlobalValue());
                                if (NIL != description) {
                                    html_markup(html_macros.$html_attribute_title$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(description);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_link(name, pretty_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                }
                                html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                html_indent(TWO_INTEGER);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list28);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                tool = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_tools_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject available_tools = cb_available_tools();
        SubLObject save_settingsP = NIL;
        SubLObject tools = NIL;
        SubLObject cdolist_list_var = args.rest();
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject arg_string = arg.first();
            final SubLObject name = read_from_string_ignoring_errors(arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != find(name, available_tools, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED)) {
                tools = cons(name, tools);
            } else
                if (arg_string.equal($$$save)) {
                    save_settingsP = T;
                }

            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        tools = nreverse(tools);
        $cb_user_toolbar_links$.setDynamicValue(tools, thread);
        if (NIL != save_settingsP) {
            cb_save_interface_state();
        }
        html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str4$_meta_http_equiv__X_UA_Compatible);
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
            html_princ($$$Toolbar_Modified);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_update_cb_toolbar_script();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$Browser_Toolbar_Modified);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    cb_frame_update_message_page_info($$$Tools);
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$16, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_tools(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Tools;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str35$cb_tools);
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

    public static SubLObject html_update_cb_toolbar_script() {
        return html_script_utilities.html_refresh_frame_script(cb_frame_name($TOOLBAR));
    }

    public static SubLObject declare_cb_boolean_global(final SubLObject global, final SubLObject plist) {
        return dictionary.dictionary_enter($cb_boolean_globals$.getGlobalValue(), global, plist);
    }

    public static SubLObject cb_boolean_option_field_name(final SubLObject global) {
        return getf(dictionary.dictionary_lookup($cb_boolean_globals$.getGlobalValue(), global, UNPROVIDED), $FIELD_NAME, UNPROVIDED);
    }

    public static SubLObject cb_boolean_option_legend_form(final SubLObject global) {
        return getf(dictionary.dictionary_lookup($cb_boolean_globals$.getGlobalValue(), global, UNPROVIDED), $LEGEND_FORM, UNPROVIDED);
    }

    public static SubLObject cb_boolean_option_check(final SubLObject global) {
        final SubLObject check_fn = getf(dictionary.dictionary_lookup($cb_boolean_globals$.getGlobalValue(), global, UNPROVIDED), $CHECK_FN, UNPROVIDED);
        if (NIL != fboundp(check_fn)) {
            return funcall(check_fn);
        }
        return list_utilities.sublisp_boolean(symbol_value(global));
    }

    public static SubLObject cb_boolean_option_new_value(final SubLObject global, final SubLObject html_ans) {
        final SubLObject new_value_fn = getf(dictionary.dictionary_lookup($cb_boolean_globals$.getGlobalValue(), global, UNPROVIDED), $NEW_VALUE_FN, UNPROVIDED);
        if (NIL != fboundp(new_value_fn)) {
            return funcall(new_value_fn, html_ans);
        }
        return list_utilities.sublisp_boolean(html_ans);
    }

    public static SubLObject cb_show_boolean_option(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject global = NIL;
        destructuring_bind_must_consp(current, datum, $list43);
        global = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject field_name = $sym44$FIELD_NAME;
            final SubLObject legend_form = $sym45$LEGEND_FORM;
            return list(CLET, list(list(field_name, list(CB_BOOLEAN_OPTION_FIELD_NAME, list(QUOTE, global))), list(legend_form, list(CB_BOOLEAN_OPTION_LEGEND_FORM, list(QUOTE, global)))), list(PWHEN, list(CAND, list(STRINGP, field_name), list(LISTP, legend_form)), list(CB_CHECKBOX_OPTION, list(field_name, list(CB_BOOLEAN_OPTION_CHECK, list(QUOTE, global))), list(EVAL, legend_form))));
        }
        cdestructuring_bind_error(datum, $list43);
        return NIL;
    }

    public static SubLObject cb_fastP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_fastP$.getDynamicValue(thread);
    }

    public static SubLObject cb_new_script_mode(final SubLObject html_ans) {
        return NIL != list_utilities.sublisp_boolean(html_ans) ? $JAVASCRIPT : NIL;
    }

    public static SubLObject cb_options_submit_bar(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        return $list132;
    }

    public static SubLObject cb_options(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Browser_Preferences;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$18 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str9$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
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
                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                            html_script_utilities.cb_hoverover_page_init();
                        }
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
                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str136$cb_options_handler, T, UNPROVIDED);
                            cb_help_preamble($CB_OPTIONS, $SELF, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_reset_input($$$Reset_Form);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Submit, $$$update, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_submit_input($str140$Submit___Save, $str141$update_and_save, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Load_Saved, $str143$load_saved, UNPROVIDED);
                            cb_options_table_of_contents();
                            cb_options_general();
                            cb_options_term_display();
                            cb_options_history_and_browser_tool();
                            cb_options_nl();
                            cb_options_query_tool();
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_reset_input($$$Reset_Form);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Submit, $$$update, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_submit_input($str140$Submit___Save, $str141$update_and_save, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Load_Saved, $str143$load_saved, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$19, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$18, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_options_table_of_contents() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_princ($$$Jump_to_Section);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdolist_list_var = $cb_option_section_names$.getGlobalValue();
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject key = NIL;
                SubLObject name = NIL;
                destructuring_bind_must_consp(current, datum, $list147);
                key = current.first();
                current = name = current.rest();
                final SubLObject url = cconcatenate($str148$_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(name, UNPROVIDED)));
                html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(url);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong(name);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_options_section(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        destructuring_bind_must_consp(current, datum, $list149);
        key = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject name = $sym150$NAME;
            return list(CLET, list(list(name, list(ALIST_LOOKUP_WITHOUT_VALUES, $cb_option_section_names$, key))), $list153, list(HTML_HEADING, $list155, list(HTML_FANCY_DIV, list($ID, name), list(HTML_PRINC, name))), list(HTML_FANCY_TABLE, $list160, bq_cons(HTML_TABLE_ROW, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list149);
        return NIL;
    }

    public static SubLObject cb_options_section_column(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, $list163, listS(HTML_FANCY_TABLE_DATA, $list165, append(body, NIL)));
    }

    public static SubLObject cb_options_subsection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list166);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list166);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGN, list(HTML_HEADING, $list167, list(HTML_FORMAT, $str169$_A__, name)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list166);
        return NIL;
    }

    public static SubLObject cb_option_with_title_only(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list171);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = NIL;
        destructuring_bind_must_consp(current, datum, $list171);
        title = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGN, list(HTML_PRINC_STRONG, title), $list173, $list174, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list171);
        return NIL;
    }

    public static SubLObject cb_option_with_title_and_hoverover(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list177);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = NIL;
        SubLObject hoverover = NIL;
        destructuring_bind_must_consp(current, datum, $list177);
        title = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list177);
        hoverover = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGN, list(PIF, list(STRINGP, hoverover), list(HTML_PRINC_STRONG_WITH_EXPLANATION, title, hoverover), list(HTML_PRINC_STRONG, title)), $list173, $list174, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list177);
        return NIL;
    }

    public static SubLObject cb_option_with_title(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list180);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = NIL;
        destructuring_bind_must_consp(current, datum, $list180);
        title = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$25 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list180);
            current_$25 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list180);
            if (NIL == member(current_$25, $list181, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$25 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list180);
        }
        final SubLObject hoverover_tail = property_list_member($HOVEROVER, current);
        final SubLObject hoverover = (NIL != hoverover_tail) ? cadr(hoverover_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != hoverover) {
            return listS(CB_OPTION_WITH_TITLE_AND_HOVEROVER, list(title, hoverover), append(body, NIL));
        }
        return listS(CB_OPTION_WITH_TITLE_ONLY, list(title), append(body, NIL));
    }

    public static SubLObject cb_checkbox_option(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list184);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        SubLObject checkedP = NIL;
        destructuring_bind_must_consp(current, datum, $list184);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list184);
        checkedP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject legend_form;
            current = legend_form = temp;
            return listS(PROGN, list(HTML_CHECKBOX_INPUT, name, T, checkedP), $list186, append(legend_form, $list187));
        }
        cdestructuring_bind_error(datum, $list184);
        return NIL;
    }

    public static SubLObject cb_constant_entry_option(final SubLObject legend_text, final SubLObject name, final SubLObject v_default, SubLObject filter, SubLObject hoverover) {
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        if (hoverover == UNPROVIDED) {
            hoverover = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hoverover.isString()) {
            cb_query.html_princ_strong_with_explanation(legend_text, hoverover, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            html_princ_strong(legend_text);
        }
        html_princ_strong($str188$__);
        html_newline(UNPROVIDED);
        html_text_input(name, v_default, $cb_constant_input_width$.getDynamicValue(thread));
        html_complete.html_complete_button(name, $$$Complete, filter, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_script_utilities.html_clear_input_button(name, $$$Clear, UNPROVIDED);
        html_newline(TWO_INTEGER);
        return NIL;
    }

    public static SubLObject cb_options_general() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = list_utilities.alist_lookup_without_values($cb_option_section_names$.getGlobalValue(), $GENERAL, UNPROVIDED, UNPROVIDED);
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != name) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(name);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
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
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
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
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject field_name = cb_boolean_option_field_name($sym193$_HLMTS_SUPPORTED__);
                    SubLObject legend_form = cb_boolean_option_legend_form($sym193$_HLMTS_SUPPORTED__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym193$_HLMTS_SUPPORTED__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    if ($str194$Simple_transformations_to_make_co.isString()) {
                        cb_query.html_princ_strong_with_explanation($$$NAUT_Readability, $str194$Simple_transformations_to_make_co, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        html_princ_strong($$$NAUT_Readability);
                    }
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    field_name = cb_boolean_option_field_name($sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__);
                    legend_form = cb_boolean_option_legend_form($sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($sym61$_CB_DISPLAY_DATES_AS_STRINGS__);
                    legend_form = cb_boolean_option_legend_form($sym61$_CB_DISPLAY_DATES_AS_STRINGS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym61$_CB_DISPLAY_DATES_AS_STRINGS__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__);
                    legend_form = cb_boolean_option_legend_form($sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__);
                    legend_form = cb_boolean_option_legend_form($sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    html_newline(UNPROVIDED);
                    html_princ_strong($$$Miscellaneous);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    field_name = cb_boolean_option_field_name($cb_c_wrap_assertions$);
                    legend_form = cb_boolean_option_legend_form($cb_c_wrap_assertions$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_c_wrap_assertions$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($cb_wrap_interactor$);
                    legend_form = cb_boolean_option_legend_form($cb_wrap_interactor$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_wrap_interactor$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($cb_separate_doc_frame$);
                    legend_form = cb_boolean_option_legend_form($cb_separate_doc_frame$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_separate_doc_frame$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($cb_more_assertion_marker_image_text$);
                    legend_form = cb_boolean_option_legend_form($cb_more_assertion_marker_image_text$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_more_assertion_marker_image_text$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($cb_show_cyclify_button$);
                    legend_form = cb_boolean_option_legend_form($cb_show_cyclify_button$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_show_cyclify_button$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($cb_enable_inference_monitoring$);
                    legend_form = cb_boolean_option_legend_form($cb_enable_inference_monitoring$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_enable_inference_monitoring$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($sym81$_CB_FAST__);
                    legend_form = cb_boolean_option_legend_form($sym81$_CB_FAST__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym81$_CB_FAST__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($cb_hoverover_enabled$);
                    legend_form = cb_boolean_option_legend_form($cb_hoverover_enabled$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_hoverover_enabled$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($cb_search_autocomplete_enabled$);
                    legend_form = cb_boolean_option_legend_form($cb_search_autocomplete_enabled$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_search_autocomplete_enabled$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
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
                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Primary_Presentation_Language);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    html_radio_input($str198$presentation_language, $str199$_cycl, eq($CYCL, $cb_major_presentation_language$.getDynamicValue(thread)), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($str201$CycL__default_);
                    html_newline(UNPROVIDED);
                    html_radio_input($str198$presentation_language, $str202$_nl, eq($NL, $cb_major_presentation_language$.getDynamicValue(thread)), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($str204$Natural_Language__slow_);
                    html_newline(TWO_INTEGER);
                    html_princ_strong($$$Status_Frame_Update);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    html_princ($$$Update_every_);
                    html_text_input($str207$status_interval, $cb_status_update_interval$.getDynamicValue(thread), THREE_INTEGER);
                    html_indent(UNPROVIDED);
                    html_princ($str208$seconds__or_empty_to_disable_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_options_term_display() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = list_utilities.alist_lookup_without_values($cb_option_section_names$.getGlobalValue(), $TERM_DISPLAY, UNPROVIDED, UNPROVIDED);
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != name) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(name);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
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
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
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
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Default_Index_View);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    html_radio_input($str211$index_view, $str212$_inferred, eq(cb_frames.$cb_default_index_view$.getDynamicValue(thread), $INFERRED), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($$$Inferred);
                    html_indent(FOUR_INTEGER);
                    html_radio_input($str211$index_view, $str215$_legacy, eq(cb_frames.$cb_default_index_view$.getDynamicValue(thread), $LEGACY), UNPROVIDED);
                    html_princ($$$Legacy);
                    html_newline(TWO_INTEGER);
                    html_princ_strong($$$Default_Content);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    html_script_utilities.html_focus_radio_input($$$content, $str220$upper_bound, $str221$_maximal, eq($cb_c_default_content$.getDynamicValue(thread), $MAXIMAL), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($$$As_much_as_possible_up_to_);
                    html_text_input($str220$upper_bound, $cb_c_maximal_upper_bound$.getDynamicValue(thread), THREE_INTEGER);
                    html_princ($$$_assertions);
                    html_newline(UNPROVIDED);
                    html_script_utilities.html_clear_radio_input($$$content, $str220$upper_bound, $str225$_documentation, eq($cb_c_default_content$.getDynamicValue(thread), $DOCUMENTATION), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($$$Documentation);
                    html_newline(UNPROVIDED);
                    html_script_utilities.html_clear_radio_input($$$content, $str220$upper_bound, $str228$_definitional, eq($cb_c_default_content$.getDynamicValue(thread), $DEFINITIONAL), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($$$Definitional_Information);
                    html_newline(UNPROVIDED);
                    html_script_utilities.html_clear_radio_input($$$content, $str220$upper_bound, $str231$_lexical, eq($cb_c_default_content$.getDynamicValue(thread), $LEXICAL), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($$$Lexical_Information);
                    html_newline(TWO_INTEGER);
                    html_princ_strong($$$Assertion_Formulas);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    html_radio_input($str235$formulas_display, $str236$_hl_formulas, eq($cb_c_assertion_formulas_display$.getDynamicValue(thread), $HL_FORMULAS), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($str238$HL_formulas__fast_);
                    html_newline(UNPROVIDED);
                    html_radio_input($str235$formulas_display, $str239$_el_formulas, eq($cb_c_assertion_formulas_display$.getDynamicValue(thread), $EL_FORMULAS), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($str241$EL_formulas__slow_);
                    html_newline(UNPROVIDED);
                    html_radio_input($str235$formulas_display, $str242$_el_formulas_except_when_browsing, eq($cb_c_assertion_formulas_display$.getDynamicValue(thread), $EL_FORMULAS_EXCEPT_WHEN_BROWSING_SKOLEMS), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($str244$EL_formulas_except_when_browsing_);
                    html_newline(TWO_INTEGER);
                    html_princ_strong($$$Literal_Queries);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    SubLObject field_name = cb_boolean_option_field_name($sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__);
                    SubLObject legend_form = cb_boolean_option_legend_form($sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    html_newline(UNPROVIDED);
                    html_princ_strong($$$Applicable_Relations);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    field_name = cb_boolean_option_field_name($sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__);
                    legend_form = cb_boolean_option_legend_form($sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__);
                    legend_form = cb_boolean_option_legend_form($sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__);
                    legend_form = cb_boolean_option_legend_form($sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
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
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str169$_A__, $$$Assertion_Display_Options);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject field_name = cb_boolean_option_field_name($cb_a_show_el_formula$);
                    SubLObject legend_form = cb_boolean_option_legend_form($cb_a_show_el_formula$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_a_show_el_formula$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($cb_a_show_hl_formula$);
                    legend_form = cb_boolean_option_legend_form($cb_a_show_hl_formula$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_a_show_hl_formula$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($cb_a_show_english$);
                    legend_form = cb_boolean_option_legend_form($cb_a_show_english$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_a_show_english$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($cb_a_perform_access_diagnostics$);
                    legend_form = cb_boolean_option_legend_form($cb_a_perform_access_diagnostics$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_a_perform_access_diagnostics$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str169$_A__, $$$Assertion_Editing_Options);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    field_name = cb_boolean_option_field_name($sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__);
                    legend_form = cb_boolean_option_legend_form($sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__);
                    legend_form = cb_boolean_option_legend_form($sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str169$_A__, $$$FET_Launching_Buttons);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    field_name = cb_boolean_option_field_name($sym114$_SHOW_FET_EDIT_BUTTONS__);
                    legend_form = cb_boolean_option_legend_form($sym114$_SHOW_FET_EDIT_BUTTONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym114$_SHOW_FET_EDIT_BUTTONS__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__);
                    legend_form = cb_boolean_option_legend_form($sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__);
                    legend_form = cb_boolean_option_legend_form($sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_options_history_and_browser_tool() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = list_utilities.alist_lookup_without_values($cb_option_section_names$.getGlobalValue(), $HISTORY_AND_TOOLS, UNPROVIDED, UNPROVIDED);
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != name) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(name);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
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
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
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
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str169$_A__, $$$History_Display_Options);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject field_name = cb_boolean_option_field_name($sym104$_CB_USE_CATEGORIZED_HISTORY__);
                    SubLObject legend_form = cb_boolean_option_legend_form($sym104$_CB_USE_CATEGORIZED_HISTORY__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym104$_CB_USE_CATEGORIZED_HISTORY__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    html_princ($$$Display_no_more_than_);
                    html_text_input($str253$constant_history_max, $cb_constant_history_max$.getDynamicValue(thread), THREE_INTEGER);
                    html_princ($$$_constants);
                    html_newline(UNPROVIDED);
                    html_princ($$$Display_no_more_than_);
                    html_text_input($str255$constant_history_chronological_ma, $cb_constant_history_chronological_max$.getDynamicValue(thread), THREE_INTEGER);
                    html_princ($$$_constants_chronologically);
                    html_newline(UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($$$Display_no_more_than_);
                    html_text_input($str257$nat_history_max, $cb_nat_history_max$.getDynamicValue(thread), THREE_INTEGER);
                    html_princ($$$_NARTs);
                    html_newline(UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($$$Display_no_more_than_);
                    html_text_input($str259$assertion_history_max, $cb_assertion_history_max$.getDynamicValue(thread), THREE_INTEGER);
                    html_princ($$$_assertions);
                    html_newline(UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($$$Display_no_more_than_);
                    html_text_input($str260$sentence_history_max, $cb_sentence_history_max$.getDynamicValue(thread), THREE_INTEGER);
                    html_princ($$$_sentences);
                    html_newline(UNPROVIDED);
                    field_name = cb_boolean_option_field_name($sym106$_CB_HISTORY_SHOW_EL_FORMULAS__);
                    legend_form = cb_boolean_option_legend_form($sym106$_CB_HISTORY_SHOW_EL_FORMULAS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym106$_CB_HISTORY_SHOW_EL_FORMULAS__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
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
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str169$_A__, $$$Browser_Tool_Options);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_constant_entry_option($$$Default_Mt, $str264$default_mt, $cb_default_mt$.getDynamicValue(thread), $$Microtheory, $str266$What_microtheory_should_be_used_a);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_options_nl() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = list_utilities.alist_lookup_without_values($cb_option_section_names$.getGlobalValue(), $NL, UNPROVIDED, UNPROVIDED);
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != name) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(name);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
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
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
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
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str169$_A__, $$$NL_Generation);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    if ($str270$Which_mt_should_be_used_for_gener.isString()) {
                        cb_query.html_princ_strong_with_explanation($$$Default_NL_Generation_Mt, $str270$Which_mt_should_be_used_for_gener, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        html_princ_strong($$$Default_NL_Generation_Mt);
                    }
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    cb_form_widgets.cb_mt_input_section(cb_paraphrase_mt(), $list272);
                    SubLObject field_name = cb_boolean_option_field_name($sym108$_ASSUME_CYC_CYCLIST_DIALOG__);
                    SubLObject legend_form = cb_boolean_option_legend_form($sym108$_ASSUME_CYC_CYCLIST_DIALOG__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym108$_ASSUME_CYC_CYCLIST_DIALOG__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($sym110$_GENERATED_PHRASES_BROWSABLE__);
                    legend_form = cb_boolean_option_legend_form($sym110$_GENERATED_PHRASES_BROWSABLE__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym110$_GENERATED_PHRASES_BROWSABLE__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    html_indent(TWO_INTEGER);
                    field_name = cb_boolean_option_field_name($sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__);
                    legend_form = cb_boolean_option_legend_form($sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str169$_A__, $$$Proof_Views);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    if ($str274$Which_parameters_should_be_used_f.isString()) {
                        cb_query.html_princ_strong_with_explanation($$$Default_Parameters, $str274$Which_parameters_should_be_used_f, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        html_princ_strong($$$Default_Parameters);
                    }
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    html_create_simple_dropdown_list($str276$proof_view_params, cons($DEFAULT, remove(narts_high.find_nart($list278), kb_utilities.sort_terms(isa.all_instances_in_all_mts(narts_high.find_nart($list279)), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), cb_proof_view.$cb_proof_view_default_params$.getDynamicValue(thread));
                    html_newline(UNPROVIDED);
                    field_name = cb_boolean_option_field_name($sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__);
                    legend_form = cb_boolean_option_legend_form($sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
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
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str169$_A__, $$$Lexification);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(FOUR_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_constant_entry_option($$$Reviewer, $str282$lex_reviewer, lexification_utilities.$lexification_reviewer$.getDynamicValue(thread), $$Cyclist, $str284$Which_Cyclist_is_to_reviewer_your);
                    cb_constant_entry_option($$$Default_Microtheory, $str286$lex_mt, lexicon_vars.$default_lexification_mt$.getDynamicValue(thread), $$Microtheory, $str287$What_microtheory_should_your_lexi);
                    cb_constant_entry_option($$$Default_Syntactic_Microtheory, $str289$lex_syntactic_mt, lexicon_vars.$default_syntactic_mt$.getDynamicValue(thread), $$Microtheory, $str290$What_microtheory_should_your_synt);
                    cb_constant_entry_option($$$Default_Paraphrase_Microtheory, $str292$lex_pph_mt, lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread), $$Microtheory, $str293$What_microtheory_should_your_para);
                    cb_constant_entry_option($str294$Default_Parse_Template_Microtheor, $str295$lex_parse_template_mt, lexicon_vars.$default_lexification_template_mt$.getDynamicValue(thread), $$Microtheory, $str296$What_microtheory_should_your_pars);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_paraphrase_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $cb_paraphrase_mt$.getDynamicValue(thread) ? $cb_paraphrase_mt$.getDynamicValue(thread) : pph_vars.pph_language_mt();
    }

    public static SubLObject cb_options_query_tool() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = list_utilities.alist_lookup_without_values($cb_option_section_names$.getGlobalValue(), $QUERY_TOOL, UNPROVIDED, UNPROVIDED);
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != name) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(name);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
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
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
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
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Results_Display);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    SubLObject field_name = cb_boolean_option_field_name($cb_use_dynamic_table_for_inference_results$);
                    SubLObject legend_form = cb_boolean_option_legend_form($cb_use_dynamic_table_for_inference_results$);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($cb_use_dynamic_table_for_inference_results$), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    field_name = cb_boolean_option_field_name($sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__);
                    legend_form = cb_boolean_option_legend_form($sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__);
                    if (field_name.isString() && legend_form.isList()) {
                        html_checkbox_input(field_name, T, cb_boolean_option_check($sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        eval(legend_form);
                        html_newline(UNPROVIDED);
                    }
                    html_princ_strong($str299$Automatically_Destroying_Inferenc);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    SubLObject entry_focus = NIL;
                    if (NIL == number_utilities.positive_infinity_p($cb_destroy_all_inferences_but_last_n$.getDynamicValue(thread))) {
                        entry_focus = T;
                    } else {
                        entry_focus = NIL;
                    }
                    html_script_utilities.html_focus_radio_input($str300$destroy_inferences, $str301$entry_destroy_inferences, ZERO_INTEGER, entry_focus, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($$$Keep_only_last_);
                    if ((NIL != number_utilities.non_negative_number_p($cb_destroy_all_inferences_but_last_n$.getDynamicValue(thread))) && (NIL == number_utilities.positive_infinity_p($cb_destroy_all_inferences_but_last_n$.getDynamicValue(thread)))) {
                        html_text_input($str301$entry_destroy_inferences, $cb_destroy_all_inferences_but_last_n$.getDynamicValue(thread), THREE_INTEGER);
                    } else {
                        html_text_input($str301$entry_destroy_inferences, $cb_destroy_all_inferences_but_last_n_default$.getGlobalValue(), THREE_INTEGER);
                    }
                    html_indent(UNPROVIDED);
                    html_princ($str303$inferences__at_most__defaults_to_);
                    html_newline(UNPROVIDED);
                    html_radio_input($str300$destroy_inferences, ONE_INTEGER, makeBoolean(NIL == entry_focus), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($$$Keep_all);
                    html_newline(TWO_INTEGER);
                    html_princ_strong($$$Default_Query_Mt);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    cb_form_widgets.cb_mt_input_section(cb_query.default_new_inference_mt(), $list306);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
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
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Closed_Queries);
                    html_princ_strong($str188$__);
                    html_newline(UNPROVIDED);
                    html_radio_input($str308$perform_argumentation_for_closed_, $$$t, $cb_perform_argumentation_for_closed_queryP$.getDynamicValue(thread), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($str310$Gather_and_weigh_both_pro_and_con);
                    html_newline(UNPROVIDED);
                    html_radio_input($str308$perform_argumentation_for_closed_, $$$nil, makeBoolean(NIL == $cb_perform_argumentation_for_closed_queryP$.getDynamicValue(thread)), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_princ($str312$Attempt_to_prove_only_pro_argumen);
                    html_newline(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_options_boolean_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = dictionary.dictionary_keys($cb_boolean_globals$.getGlobalValue());
        SubLObject global = NIL;
        global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject field_name = cb_boolean_option_field_name(global);
            if (field_name.isString()) {
                final SubLObject value = cb_boolean_option_new_value(global, html_extract_input(field_name, args));
                cb_options_set_boolean(global, value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        } 
        wff_vars.$wff_mode$.setDynamicValue(NIL != $cb_wff_strictP$.getDynamicValue(thread) ? $STRICT : $ASSERTIVE, thread);
        return NIL;
    }

    public static SubLObject cb_options_set_boolean(final SubLObject global, final SubLObject value) {
        set(global, value);
        return symbol_value(global);
    }

    public static SubLObject cb_options_handler(final SubLObject args) {
        if (NIL != html_extract_input($str143$load_saved, args)) {
            return cb_load_user_preferences(args);
        }
        final SubLObject default_mt = cb_guess_fort(html_extract_input($str264$default_mt, args), UNPROVIDED);
        if (NIL != forts.fort_p(default_mt)) {
            $cb_default_mt$.setDynamicValue(default_mt);
        }
        cb_lexification_options_handler(args);
        cb_pph_options_handler(args);
        SubLObject presentation_language = html_extract_input($str198$presentation_language, args);
        if (NIL != presentation_language) {
            presentation_language = read_from_string_ignoring_errors(presentation_language, NIL, NIL, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == cb_presentation_language_p(presentation_language)) {
            presentation_language = $CYCL;
        }
        $cb_major_presentation_language$.setDynamicValue(presentation_language);
        SubLObject status_interval = html_extract_input($str207$status_interval, args);
        if (NIL != status_interval) {
            status_interval = read_from_string_ignoring_errors(status_interval, NIL, NIL, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL == status_interval) || (status_interval.isInteger() && status_interval.isPositive())) {
            $cb_status_update_interval$.setDynamicValue(status_interval);
        }
        cb_history_display_options_handler(args);
        cb_term_display_options_handler(args);
        cb_query_tool_options_handler(args);
        cb_options_handler_finish(args);
        return NIL;
    }

    public static SubLObject cb_history_display_options_handler(final SubLObject args) {
        SubLObject foo = html_extract_input($str253$constant_history_max, args);
        if (NIL != foo) {
            foo = read_from_string_ignoring_errors(foo, NIL, NIL, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL == foo) || (foo.isInteger() && foo.isPositive())) {
            $cb_constant_history_max$.setDynamicValue(foo);
        }
        foo = html_extract_input($str255$constant_history_chronological_ma, args);
        if (NIL != foo) {
            foo = read_from_string_ignoring_errors(foo, NIL, NIL, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL == foo) || foo.isInteger()) {
            $cb_constant_history_chronological_max$.setDynamicValue(foo);
        }
        foo = html_extract_input($str257$nat_history_max, args);
        if (NIL != foo) {
            foo = read_from_string_ignoring_errors(foo, NIL, NIL, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL == foo) || (foo.isInteger() && foo.isPositive())) {
            $cb_nat_history_max$.setDynamicValue(foo);
        }
        foo = html_extract_input($str259$assertion_history_max, args);
        if (NIL != foo) {
            foo = read_from_string_ignoring_errors(foo, NIL, NIL, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL == foo) || (foo.isInteger() && foo.isPositive())) {
            $cb_assertion_history_max$.setDynamicValue(foo);
        }
        foo = html_extract_input($str260$sentence_history_max, args);
        if (NIL != foo) {
            foo = read_from_string_ignoring_errors(foo, NIL, NIL, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL == foo) || (foo.isInteger() && foo.isPositive())) {
            $cb_sentence_history_max$.setDynamicValue(foo);
        }
        return NIL;
    }

    public static SubLObject cb_term_display_options_handler(final SubLObject args) {
        final SubLObject index_view = html_extract_input($str211$index_view, args);
        cb_frames.$cb_default_index_view$.setDynamicValue(read_from_string_ignoring_errors(index_view, NIL, NIL, UNPROVIDED, UNPROVIDED));
        SubLObject content = html_extract_input($$$content, args);
        if (NIL != content) {
            content = read_from_string_ignoring_errors(content, NIL, NIL, UNPROVIDED, UNPROVIDED);
            if (content == $MAXIMAL) {
                final SubLObject upper_bound_string = html_extract_input($str220$upper_bound, args);
                if (NIL != upper_bound_string) {
                    final SubLObject upper_bound = read_from_string_ignoring_errors(upper_bound_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
                    if (upper_bound.isInteger()) {
                        $cb_c_maximal_upper_bound$.setDynamicValue(upper_bound);
                    } else {
                        $cb_c_maximal_upper_bound$.setDynamicValue(NIL);
                    }
                } else {
                    $cb_c_maximal_upper_bound$.setDynamicValue(NIL);
                }
            }
            $cb_c_default_content$.setDynamicValue(content);
        }
        final SubLObject formulas_display = html_extract_input($str235$formulas_display, args);
        $cb_c_assertion_formulas_display$.setDynamicValue(read_from_string_ignoring_errors(formulas_display, NIL, NIL, UNPROVIDED, UNPROVIDED));
        $cb_c_formula_display_exception_index_hook$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject cb_lexification_options_handler(final SubLObject args) {
        final SubLObject lex_mt = cb_guess_fort(html_extract_input($str286$lex_mt, args), UNPROVIDED);
        final SubLObject lex_reviewer = cb_guess_fort(html_extract_input($str282$lex_reviewer, args), UNPROVIDED);
        final SubLObject lex_syntactic_mt = cb_guess_fort(html_extract_input($str289$lex_syntactic_mt, args), UNPROVIDED);
        final SubLObject lex_pph_mt = cb_guess_fort(html_extract_input($str292$lex_pph_mt, args), UNPROVIDED);
        final SubLObject lex_parse_template_mt = cb_guess_fort(html_extract_input($str295$lex_parse_template_mt, args), UNPROVIDED);
        if (NIL != forts.fort_p(lex_mt)) {
            lexicon_vars.$default_lexification_mt$.setDynamicValue(lex_mt);
        }
        if (NIL != forts.fort_p(lex_syntactic_mt)) {
            lexicon_vars.$default_syntactic_mt$.setDynamicValue(lex_syntactic_mt);
        }
        if ((NIL == lex_reviewer) || (NIL != forts.fort_p(lex_reviewer))) {
            lexification_utilities.$lexification_reviewer$.setDynamicValue(lex_reviewer);
        }
        if (NIL != forts.fort_p(lex_pph_mt)) {
            lexicon_vars.$default_relational_lexification_mt$.setDynamicValue(lex_pph_mt);
        }
        if (NIL != forts.fort_p(lex_parse_template_mt)) {
            lexicon_vars.$default_lexification_template_mt$.setDynamicValue(lex_parse_template_mt);
        }
        return NIL;
    }

    public static SubLObject cb_pph_options_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject default_pph_mt = cb_form_widgets.cb_extract_mt_input(args, $cb_paraphrase_mt$.getDynamicValue(thread), $list272);
        final SubLObject error = thread.secondMultipleValue();
        final SubLObject bad_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error) {
            return cb_error($str316$Default_NL_Generation_Mt__The_inp, bad_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_set_default_pph_mt(default_pph_mt);
        final SubLObject proof_view_params = html_extract_input($str276$proof_view_params, args);
        final SubLObject value = ($$$DEFAULT.equal(proof_view_params)) ? $DEFAULT : cb_guess_fort(proof_view_params, UNPROVIDED);
        if (value.eql($DEFAULT) || (NIL != forts.fort_p(value))) {
            cb_proof_view.$cb_proof_view_default_params$.setDynamicValue(value, thread);
        }
        return NIL;
    }

    public static SubLObject cb_set_default_pph_mt(final SubLObject default_pph_mt) {
        $cb_paraphrase_mt$.setDynamicValue(default_pph_mt);
        return NIL;
    }

    public static SubLObject cb_query_tool_options_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject destroy_inferences = html_extract_input($str300$destroy_inferences, args);
        if (NIL != destroy_inferences) {
            destroy_inferences = read_from_string_ignoring_errors(destroy_inferences, NIL, NIL, UNPROVIDED, UNPROVIDED);
        }
        if (destroy_inferences.eql(ZERO_INTEGER)) {
            destroy_inferences = html_extract_input($str301$entry_destroy_inferences, args);
            destroy_inferences = read_from_string_ignoring_errors(destroy_inferences, NIL, NIL, UNPROVIDED, UNPROVIDED);
        } else
            if (destroy_inferences.eql(ONE_INTEGER)) {
                destroy_inferences = $POSITIVE_INFINITY;
            }

        if (NIL != number_utilities.non_negative_potentially_infinite_number_p(destroy_inferences)) {
            $cb_destroy_all_inferences_but_last_n$.setDynamicValue(destroy_inferences, thread);
        }
        cb_query.cb_destroy_all_inferences_but_last_n();
        thread.resetMultipleValues();
        final SubLObject default_query_mt = cb_form_widgets.cb_extract_mt_input(args, cb_query.default_new_inference_mt(), $list306);
        final SubLObject error = thread.secondMultipleValue();
        final SubLObject bad_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error) {
            return cb_error($str319$Default_Query_Mt__The_input___A__, bad_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_query.set_default_new_inference_mt(default_query_mt);
        final SubLObject argumentation_str = html_extract_input($str308$perform_argumentation_for_closed_, args);
        final SubLObject argumentationP = list_utilities.sublisp_boolean(read_from_string_ignoring_errors(argumentation_str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        $cb_perform_argumentation_for_closed_queryP$.setDynamicValue(argumentationP, thread);
        return NIL;
    }

    public static SubLObject cb_options_handler_finish(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject use_hoverover = html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread);
        SubLObject savedP = NIL;
        cb_options_boolean_handler(args);
        if (((NIL == $cb_a_show_el_formula$.getDynamicValue(thread)) && (NIL == $cb_a_show_hl_formula$.getDynamicValue(thread))) && (NIL == $cb_a_show_english$.getDynamicValue(thread))) {
            $cb_a_show_hl_formula$.setDynamicValue(T, thread);
        }
        if (NIL != html_extract_input($str141$update_and_save, args)) {
            savedP = cb_save_interface_state();
        }
        final SubLObject restart_requiredP = NIL;
        final SubLObject _prev_bind_0 = html_script_utilities.$cb_hoverover_enabled$.currentBinding(thread);
        try {
            html_script_utilities.$cb_hoverover_enabled$.bind(use_hoverover, thread);
            cb_options_result_page(restart_requiredP, savedP);
        } finally {
            html_script_utilities.$cb_hoverover_enabled$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_options(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Preferences;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str321$cb_options);
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

    public static SubLObject cb_options_result_page(SubLObject restart_linkP, SubLObject savedP) {
        if (restart_linkP == UNPROVIDED) {
            restart_linkP = NIL;
        }
        if (savedP == UNPROVIDED) {
            savedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = cb_options_result_message(savedP);
        if (NIL != restart_linkP) {
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
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
                html_princ(message);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$51 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_princ(message);
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_princ($str325$Your_new_settings_require_you_to_);
                        html_newline(TWO_INTEGER);
                        html_princ($$$Click_);
                        cb_link($START, $$$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_princ($str329$_now_to_do_so_);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$51, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } else {
            cb_message_page_with_history(message, NIL);
        }
        return NIL;
    }

    public static SubLObject cb_options_result_message(final SubLObject savedP) {
        SubLObject message = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            princ($str330$KB_Browser_Options_have_been_modi, stream);
            if (NIL != savedP) {
                princ($$$_and_saved, stream);
            }
            princ($str332$_, stream);
            message = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return message;
    }

    public static SubLObject cb_history(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_history_internal(args);
    }

    public static SubLObject cb_history_internal(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject style = ((NIL == args) && (NIL != $cb_use_categorized_historyP$.getDynamicValue(thread))) ? $CATEGORIZED : NIL == args ? $ALPHABETICAL : (NIL != args) && (NIL != subl_promotions.memberP($$$categorized, args, symbol_function(EQUALP), UNPROVIDED)) ? $CATEGORIZED : $ALPHABETICAL;
        final SubLObject title_var = $str339$;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$53 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$54 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str9$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_HISTORY, UNPROVIDED, UNPROVIDED);
                            if (((NIL != cb_assertion_history_items()) || (NIL != cb_sentence_history_items())) && ($CYCL == $cb_major_presentation_language$.getDynamicValue(thread))) {
                                html_indent(UNPROVIDED);
                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                if (NIL != $cb_history_show_el_formulasP$.getDynamicValue(thread)) {
                                    cb_link($HISTORY_HL_FORMULAS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else {
                                    cb_link($HISTORY_EL_FORMULAS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            }
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_show_history_info(style);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$54, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$53, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_show_history_info(SubLObject style) {
        if (style == UNPROVIDED) {
            style = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == style) {
            style = (NIL != $cb_use_categorized_historyP$.getDynamicValue(thread)) ? $CATEGORIZED : $ALPHABETICAL;
        }
        cb_show_recent_history(style);
        return NIL;
    }

    public static SubLObject cb_show_recent_history(final SubLObject style) {
        cb_show_bookmarked_constants();
        cb_show_recent_constants(style);
        html_hr(UNPROVIDED, UNPROVIDED);
        cb_show_bookmarked_nats();
        cb_show_recent_nats();
        html_hr(UNPROVIDED, UNPROVIDED);
        cb_show_bookmarked_assertions();
        cb_show_recent_assertions();
        html_hr(UNPROVIDED, UNPROVIDED);
        cb_show_recent_sentences();
        return NIL;
    }

    public static SubLObject cb_show_recent_constants(final SubLObject style) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str343$Recent_Constants__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        html_indent(FOUR_INTEGER);
        if (style == $CATEGORIZED) {
            cb_link($HISTORY, $str345$_Show_Alphabetical_, $ALPHABETICAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            cb_link($HISTORY, $str346$_Show_Categorized_, $CATEGORIZED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_indent(FOUR_INTEGER);
        cb_link($CLEAR_CONSTANT_HISTORY, NIL, style, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject items = cb_constant_history_items();
        final SubLObject first_n = list_utilities.first_n($cb_constant_history_chronological_max$.getDynamicValue(thread), items);
        final SubLObject sorted_items = Sort.sort(copy_list(items), $sym25$STRING_, TO_STRING);
        if (NIL != items) {
            if (style == $CATEGORIZED) {
                if (NIL != $cb_use_css_columns_for_categories$.getDynamicValue(thread)) {
                    cb_show_recent_constants_categorized_2();
                } else {
                    cb_show_recent_constants_categorized();
                }
            } else {
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str349$history_constants_columnar);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var = first_n;
                    SubLObject item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str350$history_constant);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_show_term(item, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                    if (NIL != list_utilities.lengthG(sorted_items, $cb_constant_history_chronological_max$.getDynamicValue(thread), UNPROVIDED)) {
                        if ($cb_constant_history_chronological_max$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
                            html_hr(UNPROVIDED, UNPROVIDED);
                        }
                        cdolist_list_var = sorted_items;
                        item = NIL;
                        item = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str350$history_constant);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                cb_show_term(item, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            cdolist_list_var = cdolist_list_var.rest();
                            item = cdolist_list_var.first();
                        } 
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
            }
        } else {
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($$$None);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_show_recent_constants_categorized() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = cb_constant_history_items();
        final SubLObject chronological = list_utilities.first_n($cb_constant_history_chronological_max$.getDynamicValue(thread), items);
        final SubLObject collections = list_utilities.find_all_if(symbol_function($sym352$ISA_COLLECTION_), items, UNPROVIDED);
        final SubLObject visible_collections = Sort.sort(list_utilities.first_n($cb_constant_history_chronological_max$.getDynamicValue(thread), collections), $sym25$STRING_, TO_STRING);
        final SubLObject relations = list_utilities.find_all_if(symbol_function($sym353$ISA_RELATION_), items, UNPROVIDED);
        final SubLObject visible_relations = Sort.sort(list_utilities.first_n($cb_constant_history_chronological_max$.getDynamicValue(thread), relations), $sym25$STRING_, TO_STRING);
        final SubLObject assertions = list_utilities.find_all_if(symbol_function(ASSERTION_P), items, UNPROVIDED);
        final SubLObject individuals = Sort.sort(list_utilities.first_n($cb_constant_history_chronological_max$.getDynamicValue(thread), set_difference(set_difference(set_difference(items, collections, UNPROVIDED, UNPROVIDED), relations, UNPROVIDED, UNPROVIDED), assertions, UNPROVIDED, UNPROVIDED)), $sym25$STRING_, TO_STRING);
        if (NIL != items) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str355$history_table);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str356$history_categorized_column);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str357$history_table_heading);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup($str358$Most_nbsp_Recent);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = chronological;
                        SubLObject chron = NIL;
                        chron = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_show_term(chron, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            chron = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str356$history_categorized_column);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str357$history_table_heading);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($$$Collections);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                        }
                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = visible_collections;
                        SubLObject coll = NIL;
                        coll = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_show_term(coll, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            coll = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str356$history_categorized_column);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str357$history_table_heading);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($$$Individuals);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                        }
                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = individuals;
                        SubLObject ind = NIL;
                        ind = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_show_term(ind, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            ind = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str356$history_categorized_column);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str357$history_table_heading);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($$$Relations);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                        }
                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        html_hr(UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = visible_relations;
                        SubLObject relation = NIL;
                        relation = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_show_term(relation, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            relation = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_show_recent_constants_categorized_2() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = cb_constant_history_items();
        final SubLObject chronological = list_utilities.first_n($cb_constant_history_chronological_max$.getDynamicValue(thread), items);
        final SubLObject collections = list_utilities.find_all_if(symbol_function($sym352$ISA_COLLECTION_), items, UNPROVIDED);
        final SubLObject visible_collections = Sort.sort(list_utilities.first_n($cb_constant_history_chronological_max$.getDynamicValue(thread), collections), $sym25$STRING_, TO_STRING);
        final SubLObject relations = list_utilities.find_all_if(symbol_function($sym353$ISA_RELATION_), items, UNPROVIDED);
        final SubLObject visible_relations = Sort.sort(list_utilities.first_n($cb_constant_history_chronological_max$.getDynamicValue(thread), relations), $sym25$STRING_, TO_STRING);
        final SubLObject assertions = list_utilities.find_all_if(symbol_function(ASSERTION_P), items, UNPROVIDED);
        final SubLObject individuals = Sort.sort(list_utilities.first_n($cb_constant_history_chronological_max$.getDynamicValue(thread), set_difference(set_difference(set_difference(items, collections, UNPROVIDED, UNPROVIDED), relations, UNPROVIDED, UNPROVIDED), assertions, UNPROVIDED, UNPROVIDED)), $sym25$STRING_, TO_STRING);
        if (NIL != items) {
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_div_style$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str362$columns__4__column_count__4____we);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str356$history_categorized_column);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_div_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str363$display_block__break_after__colum);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str357$history_table_heading);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup($str358$Most_nbsp_Recent);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                    }
                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_hr(UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = chronological;
                    SubLObject chron = NIL;
                    chron = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_show_term(chron, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        chron = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str356$history_categorized_column);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_div_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str363$display_block__break_after__colum);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str357$history_table_heading);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Collections);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                    }
                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_hr(UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = visible_collections;
                    SubLObject coll = NIL;
                    coll = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_show_term(coll, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        coll = cdolist_list_var.first();
                    } 
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    for (cdotimes_end_var = subtract(length(chronological), length(visible_collections)), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                        html_newline(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str356$history_categorized_column);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_div_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str364$display__block__break_after__colu);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str357$history_table_heading);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Individuals);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                    }
                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_hr(UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = individuals;
                    SubLObject ind = NIL;
                    ind = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_show_term(ind, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        ind = cdolist_list_var.first();
                    } 
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    for (cdotimes_end_var = subtract(length(chronological), length(individuals)), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                        html_newline(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str356$history_categorized_column);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_div_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str365$display__block__break_after__colu);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str357$history_table_heading);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Relations);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                    }
                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_hr(UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = visible_relations;
                    SubLObject relation = NIL;
                    relation = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_show_term(relation, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        relation = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_show_recent_nats() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str366$Recent_NATs__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        final SubLObject items = cb_nat_history_items();
        if (NIL != items) {
            html_indent(FOUR_INTEGER);
            cb_link($CLEAR_NAT_HISTORY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str368$history_nats_columnar);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str369$history_nat);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_show_term(item, ZERO_INTEGER, T);
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
        } else {
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($$$None);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_show_recent_sentences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str370$Recent_Sentences__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        final SubLObject items = cb_sentence_history_items();
        if (NIL != items) {
            html_indent(FOUR_INTEGER);
            cb_link($CLEAR_SENTENCE_HISTORY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != ist_sentence_p(item, UNPROVIDED)) {
                    final SubLObject mt = cycl_utilities.formula_arg1(item, UNPROVIDED);
                    final SubLObject sentence = cycl_utilities.formula_arg2(item, UNPROVIDED);
                    if ((NIL != sksi_external_browser_utilities.sksi_supported_browsing_registeredP()) && (NIL != sksi_kb_accessors.sksi_content_mt_p(mt))) {
                        cb_sentence_browser.cb_show_sentence_readably(sentence, mt, $cb_c_wrap_assertions$.getDynamicValue(thread), T, T);
                    } else {
                        cb_sentence_browser.cb_show_sentence_readably(sentence, mt, $cb_c_wrap_assertions$.getDynamicValue(thread), T, NIL);
                    }
                    html_newline(UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            html_newline(UNPROVIDED);
        } else {
            html_newline(UNPROVIDED);
            html_princ($$$None);
            html_newline(TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject cb_bookmarks_supported_for_current_user() {
        return makeBoolean(((NIL != kb_control_vars.date_kb_loaded_p()) && (NIL == ke.cyclist_is_guest())) && (NIL != constants_high.find_constant($$$cyclistReadilyAvailableTerms)));
    }

    public static SubLObject cb_show_bookmarked_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = list_utilities.remove_if_not(CONSTANT_P, cb_bookmarked_items(UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str374$font_size__larger__font_weight_bo);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_div_title$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str375$To_remove_a_bookmark__follow_the_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ($str376$Bookmarked_Constants__);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        if (NIL != items) {
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str377$bookmarked_constants_columnar);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str378$bookmarked_constant);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_show_term(item, ZERO_INTEGER, T);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_show_bookmarked_nats() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = list_utilities.remove_if_not(CYCL_NAT_P, cb_bookmarked_items(UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str374$font_size__larger__font_weight_bo);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_div_title$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str375$To_remove_a_bookmark__follow_the_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ($str380$Bookmarked_NATs__);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        if (NIL != items) {
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str381$bookmarked_nats_columnar);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str382$bookmarked_nat);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_show_term(item, ZERO_INTEGER, T);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_show_bookmarked_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = list_utilities.remove_if_not(ASSERTION_P, cb_bookmarked_items(UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str374$font_size__larger__font_weight_bo);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_div_title$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str375$To_remove_a_bookmark__follow_the_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ($str383$Bookmarked_Assertions__);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        if (NIL != items) {
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str384$bookmarked_asserts_columnar);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str385$bookmarked_assert);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_show_term(item, ZERO_INTEGER, T);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_show_recent_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str386$Recent_Assertions__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        final SubLObject items = cb_assertion_history_items();
        if (NIL != items) {
            html_indent(FOUR_INTEGER);
            cb_link($CLEAR_ASSERTION_HISTORY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
            final SubLObject assertion_link_fn = (NIL != cb_browser.cb_show_el_formulas_for_hookP($HISTORY)) ? symbol_function(CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK_WITH_MT);
            final SubLObject _prev_bind_0 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $assertion_filter_hook$.currentBinding(thread);
            final SubLObject _prev_bind_4 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
            try {
                $cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
                $cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
                $assertion_filter_hook$.bind(NIL, thread);
                pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$85 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$86 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                            final SubLObject new_or_reused = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$87 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$88 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        final SubLObject _prev_bind_0_$89 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$90 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_language_mt$.bind(cb_paraphrase_mt(), thread);
                                            pph_vars.$paraphrase_mode$.bind($HTML, thread);
                                            SubLObject cdolist_list_var = items;
                                            SubLObject item = NIL;
                                            item = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                if (NIL != assertions_high.valid_assertion(item, UNPROVIDED)) {
                                                    funcall(assertion_link_fn, item);
                                                } else
                                                    if (NIL != assertion_handles.assertion_p(item)) {
                                                        cb_rem_from_assertion_history(item);
                                                    } else {
                                                        final SubLObject mt = hlmt.reduce_hlmt(cycl_utilities.formula_arg1(item, UNPROVIDED), UNPROVIDED);
                                                        final SubLObject sentence = cycl_utilities.formula_arg2(item, UNPROVIDED);
                                                        final SubLObject assertions = czer_meta.find_assertions_cycl(sentence, mt);
                                                        if (NIL != list_utilities.non_empty_list_p(assertions)) {
                                                            SubLObject cdolist_list_var_$91 = assertions;
                                                            SubLObject v_assert = NIL;
                                                            v_assert = cdolist_list_var_$91.first();
                                                            while (NIL != cdolist_list_var_$91) {
                                                                funcall(assertion_link_fn, v_assert);
                                                                cb_add_to_assertion_history(v_assert);
                                                                cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                                v_assert = cdolist_list_var_$91.first();
                                                            } 
                                                            cb_rem_from_assertion_history(item);
                                                        } else {
                                                            cb_sentence_browser.cb_show_sentence_readably(sentence, mt, $cb_c_wrap_assertions$.getDynamicValue(thread), T, NIL);
                                                            html_newline(UNPROVIDED);
                                                        }
                                                    }

                                                cdolist_list_var = cdolist_list_var.rest();
                                                item = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            pph_vars.$paraphrase_mode$.rebind(_prev_bind_1_$90, thread);
                                            pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$89, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$90 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$88, thread);
                                }
                            } finally {
                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$87, thread);
                            }
                            if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                            }
                        } finally {
                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$86, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL == reuseP) {
                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                        }
                    }
                } finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$85, thread);
                }
            } finally {
                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_4, thread);
                $assertion_filter_hook$.rebind(_prev_bind_3, thread);
                $cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
                $cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
            }
            html_newline(UNPROVIDED);
        } else {
            html_newline(UNPROVIDED);
            html_princ($$$None);
            html_newline(TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject cb_link_history(SubLObject linktext, SubLObject categorization) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (categorization == UNPROVIDED) {
            categorization = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$History;
        }
        final SubLObject url = ((categorization == $CATEGORIZED) || ((NIL == categorization) && (NIL != $cb_use_categorized_historyP$.getDynamicValue(thread)))) ? $str396$cb_history_categorized : $str397$cb_history_alphabetical;
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ(url);
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

    public static SubLObject cb_clear_history(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject group = NIL;
        destructuring_bind_must_consp(current, datum, $list401);
        group = current.first();
        current = current.rest();
        final SubLObject style = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list401);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = make_keyword(group);
            if (pcase_var.eql($CONSTANT)) {
                cb_clear_constant_history();
            } else
                if (pcase_var.eql($NAT)) {
                    cb_clear_nat_history();
                } else
                    if (pcase_var.eql($ASSERTION)) {
                        cb_clear_assertion_history();
                    } else
                        if (pcase_var.eql($SENTENCE)) {
                            cb_clear_sentence_history();
                        } else
                            if (pcase_var.eql($ALL)) {
                                cb_clear_constant_history();
                                cb_clear_nat_history();
                                cb_clear_assertion_history();
                                cb_clear_sentence_history();
                            }




        } else {
            cdestructuring_bind_error(datum, $list401);
        }
        return cb_history_internal(args);
    }

    public static SubLObject cb_link_clear_history(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str408$_Clear_History_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str409$cb_clear_history_ALL);
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

    public static SubLObject cb_link_clear_constant_history(SubLObject linktext, SubLObject style) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (style == UNPROVIDED) {
            style = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str412$_Clear_Constant_History_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str413$cb_clear_history_CONSTANT__A, string_utilities.to_string(style));
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

    public static SubLObject cb_link_clear_nat_history(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str415$_Clear_NAT_History_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str416$cb_clear_history_NAT);
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

    public static SubLObject cb_link_clear_assertion_history(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str418$_Clear_Assertion_History_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str419$cb_clear_history_ASSERTION);
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

    public static SubLObject cb_link_clear_sentence_history(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str421$_Clear_Sentence_History_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str422$cb_clear_history_SENTENCE);
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

    public static SubLObject cb_history_el_formulas(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_history_show_el_formulasP$.currentBinding(thread);
        try {
            $cb_history_show_el_formulasP$.bind(T, thread);
            cb_history_internal(args);
        } finally {
            $cb_history_show_el_formulasP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_history_el_formulas(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str425$_EL_Formulas_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str426$cb_history_el_formulas);
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

    public static SubLObject cb_history_hl_formulas(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_history_show_el_formulasP$.currentBinding(thread);
        try {
            $cb_history_show_el_formulasP$.bind(NIL, thread);
            cb_history_internal(args);
        } finally {
            $cb_history_show_el_formulasP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_history_hl_formulas(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str429$_HL_Formulas_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str430$cb_history_hl_formulas);
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

    public static SubLObject cb_rem_fort_from_all_histories(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        if (NIL != nart_handles.nart_p(fort)) {
            cb_rem_from_nat_history(fort);
        } else
            if (NIL != constant_p(fort)) {
                cb_rem_from_constant_history(fort);
            }

        cb_rem_fort_from_nat_history(fort);
        cb_rem_fort_from_assertion_history(fort);
        cb_rem_fort_from_sentence_history(fort);
        return NIL;
    }

    public static SubLObject cb_add_to_history(final SubLObject obj) {
        if (NIL != assertion_handles.assertion_p(obj)) {
            cb_add_to_assertion_history(obj);
        } else
            if (NIL != constant_p(obj)) {
                cb_add_to_constant_history(obj);
            } else
                if (NIL != cycl_grammar.cycl_nat_p(obj)) {
                    cb_add_to_nat_history(obj);
                } else {
                    Errors.error($str433$Unable_to_add__S_to_history, obj);
                }


        return NIL;
    }

    public static SubLObject cb_constant_history_items() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_constant_history$.setDynamicValue(list_utilities.delete_if_not(symbol_function($sym435$VALID_CONSTANT_), $cb_constant_history$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        $cb_constant_history$.setDynamicValue(list_utilities.first_n($cb_history_max_constants$.getGlobalValue(), $cb_constant_history$.getDynamicValue(thread)), thread);
        return copy_list($cb_constant_history$.getDynamicValue(thread));
    }

    public static SubLObject cb_most_recent_constant() {
        return cb_constant_history_items().first();
    }

    public static SubLObject cb_add_to_constant_history(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($cb_constant_history$.getDynamicValue(thread).first().eql(constant)) {
            return constant;
        }
        if (NIL != subl_promotions.memberP(constant, $cb_constant_history$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            $cb_constant_history$.setDynamicValue(delete(constant, $cb_constant_history$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        }
        $cb_constant_history$.setDynamicValue(cons(constant, $cb_constant_history$.getDynamicValue(thread)), thread);
        if ($cb_constant_history_max$.getDynamicValue(thread).isInteger() && $cb_constant_history_max$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            final SubLObject last = nthcdr(subtract($cb_constant_history_max$.getDynamicValue(thread), ONE_INTEGER), $cb_constant_history$.getDynamicValue(thread));
            if (NIL != last) {
                rplacd(last, NIL);
            }
        }
        return constant;
    }

    public static SubLObject cb_rem_from_constant_history(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_constant_history$.setDynamicValue(delete(constant, $cb_constant_history$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return NIL;
    }

    public static SubLObject cb_clear_constant_history() {
        $cb_constant_history$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject cb_valid_nat_p(final SubLObject nat) {
        if (NIL != nart_handles.valid_nartP(nat, UNPROVIDED)) {
            return T;
        }
        return term.closed_nautP(nat, UNPROVIDED);
    }

    public static SubLObject cb_nat_history_items() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_nat_history$.setDynamicValue(list_utilities.delete_if_not(CB_VALID_NAT_P, $cb_nat_history$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        $cb_nat_history$.setDynamicValue(list_utilities.first_n($cb_history_max_nats$.getGlobalValue(), $cb_nat_history$.getDynamicValue(thread)), thread);
        return copy_list($cb_nat_history$.getDynamicValue(thread));
    }

    public static SubLObject cb_most_recent_nat() {
        return cb_nat_history_items().first();
    }

    public static SubLObject cb_add_to_nat_history(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($cb_nat_history$.getDynamicValue(thread).first().equal(nat)) {
            return nat;
        }
        if (NIL != subl_promotions.memberP(nat, $cb_nat_history$.getDynamicValue(thread), EQUAL, UNPROVIDED)) {
            $cb_nat_history$.setDynamicValue(delete(nat, $cb_nat_history$.getDynamicValue(thread), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        }
        $cb_nat_history$.setDynamicValue(cons(nat, $cb_nat_history$.getDynamicValue(thread)), thread);
        if ($cb_nat_history_max$.getDynamicValue(thread).isInteger() && $cb_nat_history_max$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            final SubLObject last = nthcdr(subtract($cb_nat_history_max$.getDynamicValue(thread), ONE_INTEGER), $cb_nat_history$.getDynamicValue(thread));
            if (NIL != last) {
                rplacd(last, NIL);
            }
        }
        return nat;
    }

    public static SubLObject cb_rem_from_nat_history(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_nat_history$.setDynamicValue(delete(nat, $cb_nat_history$.getDynamicValue(thread), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return NIL;
    }

    public static SubLObject cb_rem_fort_from_nat_history(final SubLObject fort) {
        $cb_nat_history$.setDynamicValue(delete(fort, cb_nat_history_items(), symbol_function(TREE_FIND), symbol_function(TERM_OF_UNIT), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject cb_clear_nat_history() {
        $cb_nat_history$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject cb_assertion_history_valid_item_p(final SubLObject item) {
        return makeBoolean((NIL != assertions_high.valid_assertion(item, UNPROVIDED)) || (NIL != ist_sentence_p(item, UNPROVIDED)));
    }

    public static SubLObject cb_assertion_history_items() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_assertion_history$.setDynamicValue(list_utilities.first_n($cb_history_max_assertions$.getGlobalValue(), $cb_assertion_history$.getDynamicValue(thread)), thread);
        return copy_list($cb_assertion_history$.getDynamicValue(thread));
    }

    public static SubLObject cb_most_recent_assertion() {
        return cb_assertion_history_items().first();
    }

    public static SubLObject cb_add_to_assertion_history(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cb_assertion_history_valid_item_p(assertion)) {
            return NIL;
        }
        if ($cb_assertion_history$.getDynamicValue(thread).first().eql(assertion)) {
            return assertion;
        }
        if (NIL != subl_promotions.memberP(assertion, $cb_assertion_history$.getDynamicValue(thread), EQUAL, UNPROVIDED)) {
            $cb_assertion_history$.setDynamicValue(delete(assertion, $cb_assertion_history$.getDynamicValue(thread), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        }
        if (NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject ist_sentence = make_ist_sentence(assertions_high.assertion_mt(assertion), cycl_utilities.hl_to_el(assertions_high.assertion_formula(assertion)));
            if (NIL != subl_promotions.memberP(ist_sentence, $cb_assertion_history$.getDynamicValue(thread), EQUAL, UNPROVIDED)) {
                $cb_assertion_history$.setDynamicValue(delete(ist_sentence, $cb_assertion_history$.getDynamicValue(thread), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            }
        }
        $cb_assertion_history$.setDynamicValue(cons(assertion, $cb_assertion_history$.getDynamicValue(thread)), thread);
        if ($cb_assertion_history_max$.getDynamicValue(thread).isInteger() && $cb_assertion_history_max$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            final SubLObject last = nthcdr(subtract($cb_assertion_history_max$.getDynamicValue(thread), ONE_INTEGER), $cb_assertion_history$.getDynamicValue(thread));
            if (NIL != last) {
                rplacd(last, NIL);
            }
        }
        return assertion;
    }

    public static SubLObject cb_add_sentence_in_mt_to_assertion_history(final SubLObject sentence, final SubLObject mt) {
        return NIL != ist_sentence_p(sentence, UNPROVIDED) ? cb_add_to_assertion_history(sentence) : cb_add_to_assertion_history(make_ist_sentence(hlmt.reduce_hlmt(mt, UNPROVIDED), sentence));
    }

    public static SubLObject cb_rem_from_assertion_history(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_assertion_history$.setDynamicValue(delete(assertion, $cb_assertion_history$.getDynamicValue(thread), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return NIL;
    }

    public static SubLObject cb_rem_fort_from_assertion_history(final SubLObject fort) {
        $cb_assertion_history$.setDynamicValue(delete(fort, cb_assertion_history_items(), symbol_function(FIND), symbol_function(EXPRESSION_FORTS_WITH_HL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject cb_clear_assertion_history() {
        $cb_assertion_history$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject expression_forts_with_hl(final SubLObject expression) {
        return cycl_utilities.expression_forts(expression, T, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_sentence_history_items() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_sentence_history$.setDynamicValue(list_utilities.delete_if_not(CYCL_SENTENCE_P, $cb_sentence_history$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return copy_list($cb_sentence_history$.getDynamicValue(thread));
    }

    public static SubLObject cb_most_recent_sentence() {
        return cb_sentence_history_items().first();
    }

    public static SubLObject cb_add_to_sentence_history(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($cb_sentence_history$.getDynamicValue(thread).first().equal(sentence)) {
            return sentence;
        }
        if (NIL != subl_promotions.memberP(sentence, $cb_sentence_history$.getDynamicValue(thread), EQUAL, UNPROVIDED)) {
            $cb_sentence_history$.setDynamicValue(delete(sentence, $cb_sentence_history$.getDynamicValue(thread), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        }
        $cb_sentence_history$.setDynamicValue(cons(sentence, $cb_sentence_history$.getDynamicValue(thread)), thread);
        if ($cb_sentence_history_max$.getDynamicValue(thread).isInteger() && $cb_sentence_history_max$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            final SubLObject last = nthcdr(subtract($cb_sentence_history_max$.getDynamicValue(thread), ONE_INTEGER), $cb_sentence_history$.getDynamicValue(thread));
            if (NIL != last) {
                rplacd(last, NIL);
            }
        }
        return sentence;
    }

    public static SubLObject cb_add_sentence_in_mt_to_sentence_history(final SubLObject sentence, final SubLObject mt) {
        return NIL != ist_sentence_p(sentence, UNPROVIDED) ? cb_add_to_sentence_history(sentence) : cb_add_to_sentence_history(make_ist_sentence(mt, sentence));
    }

    public static SubLObject cb_rem_from_sentence_history(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_sentence_history$.setDynamicValue(delete(sentence, $cb_sentence_history$.getDynamicValue(thread), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return NIL;
    }

    public static SubLObject cb_rem_fort_from_sentence_history(final SubLObject fort) {
        $cb_sentence_history$.setDynamicValue(delete(fort, cb_sentence_history_items(), FIND, EXPRESSION_FORTS, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject cb_clear_sentence_history() {
        $cb_sentence_history$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject clear_cb_bookmarked_items() {
        final SubLObject cs = $cb_bookmarked_items_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cb_bookmarked_items(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($cb_bookmarked_items_caching_state$.getGlobalValue(), list(cyclist), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_bookmarked_items_internal(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != non_tiny_kb_loadedP()) && (NIL != forts.fort_p(cyclist))) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(NIL != kb_control_vars.date_kb_loaded_p() ? list($$MtSpace, $$CyclistsMt, listS($$MtTimeWithGranularityDimFn, date_utilities.indexical_now(), $list449)) : $$CyclistsMt, thread);
                return Sort.sort(kb_mapping_utilities.pred_values(cyclist, $$cyclistReadilyAvailableTerms, ONE_INTEGER, TWO_INTEGER, UNPROVIDED), symbol_function($sym25$STRING_), NAME_FOR_ALPHA_SORT);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject cb_bookmarked_items(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        SubLObject caching_state = $cb_bookmarked_items_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CB_BOOKMARKED_ITEMS, $cb_bookmarked_items_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CB_BOOKMARKED_ITEMS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cyclist, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cb_bookmarked_items_internal(cyclist)));
            memoization_state.caching_state_put(caching_state, cyclist, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject name_for_alpha_sort(final SubLObject obj) {
        if (NIL != cycl_grammar.cycl_denotational_term_p(obj)) {
            return cycl_utilities.denotational_term_name_for_alpha_sort(obj);
        }
        if (NIL != assertion_handles.assertion_p(obj)) {
            return cconcatenate($str455$_, string_utilities.object_to_string(uncanonicalizer.assertion_el_formula(obj)));
        }
        return string_utilities.object_to_string(obj);
    }

    public static SubLObject cb_current_relevant_terms() {
        return cconcatenate(cb_bookmarked_items(UNPROVIDED), new SubLObject[]{ cb_nat_history_items(), cb_constant_history_items() });
    }

    public static SubLObject cb_recent_kb_additions(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Recently_Added_KB_Content;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$94 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$95 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str9$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
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
                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str457$float__right);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            cb_link($RECENT_KB_ADDITIONS, $str459$_Refresh_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                        }
                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        links_to_recent_kb_additions(UNPROVIDED, UNPROVIDED);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$95, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$94, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_recent_kb_additions(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str461$_Recently_Added_KB_Content;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str462$cb_recent_kb_additions);
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

    public static SubLObject links_to_recent_kb_additions(SubLObject n, SubLObject types) {
        if (n == UNPROVIDED) {
            n = SIXTEEN_INTEGER;
        }
        if (types == UNPROVIDED) {
            types = $list464;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(T, thread);
            if (NIL != list_utilities.member_eqP($CONSTANT, types)) {
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(THREE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_princ($str465$Recent_constants_);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(THREE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                if (NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = constants_high.constants_around(next_constant_suid(), n, n, UNPROVIDED);
                    final SubLObject _prev_bind_0_$99 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$mapping_constants_for_sweep, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = NIL;
                            o = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                html_indent(TWO_INTEGER);
                                cb_form(o, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$100 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0_$99, thread);
                    }
                } else {
                    final SubLObject idx = do_constants_table();
                    final SubLObject mess = $$$mapping_constants_for_sweep;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_0_$101 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$102 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$102, $SKIP)) {
                                final SubLObject idx_$103 = idx_$102;
                                if (NIL == id_index_dense_objects_empty_p(idx_$103, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$103);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject o2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        o2 = aref(vector_var, id);
                                        if ((NIL == id_index_tombstone_p(o2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(o2)) {
                                                o2 = $SKIP;
                                            }
                                            html_indent(TWO_INTEGER);
                                            cb_form(o2, UNPROVIDED, UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$104 = idx_$102;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$104)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$104);
                                    SubLObject id2 = id_index_sparse_id_threshold(idx_$104);
                                    final SubLObject end_id = id_index_next_id(idx_$104);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (id2.numL(end_id)) {
                                        final SubLObject o3 = gethash_without_values(id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(o3))) {
                                            html_indent(TWO_INTEGER);
                                            cb_form(o3, UNPROVIDED, UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        id2 = add(id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$102 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$102, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$101, thread);
                    }
                }
            }
            if (NIL != list_utilities.member_eqP($NART, types)) {
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(THREE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_princ($str470$Recent_NARTs_);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(THREE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                if (NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = narts_high.narts_around(nart_handles.next_nart_id(), n, n, UNPROVIDED);
                    final SubLObject _prev_bind_0_$103 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$mapping_narts_for_sweep, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = NIL;
                            o = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                html_indent(TWO_INTEGER);
                                cb_form(o, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$104 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$104, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0_$103, thread);
                    }
                } else {
                    final SubLObject idx = nart_handles.do_narts_table();
                    final SubLObject mess = $$$mapping_narts_for_sweep;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_0_$105 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$105 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$105, $SKIP)) {
                                final SubLObject idx_$106 = idx_$105;
                                if (NIL == id_index_dense_objects_empty_p(idx_$106, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$106);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject o2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        o2 = aref(vector_var, id);
                                        if ((NIL == id_index_tombstone_p(o2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(o2)) {
                                                o2 = $SKIP;
                                            }
                                            html_indent(TWO_INTEGER);
                                            cb_form(o2, UNPROVIDED, UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$107 = idx_$105;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$107)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$107);
                                    SubLObject id2 = id_index_sparse_id_threshold(idx_$107);
                                    final SubLObject end_id = id_index_next_id(idx_$107);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (id2.numL(end_id)) {
                                        final SubLObject o3 = gethash_without_values(id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(o3))) {
                                            html_indent(TWO_INTEGER);
                                            cb_form(o3, UNPROVIDED, UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        id2 = add(id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$105, thread);
                    }
                }
            }
            if (NIL != list_utilities.member_eqP($ASSERTION, types)) {
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(THREE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_princ($str472$Recent_assertions_);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(THREE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                if (NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = assertions_high.assertions_around(assertion_handles.next_assertion_id(), n, n, UNPROVIDED);
                    final SubLObject _prev_bind_0_$107 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$mapping_assertions_for_sweep, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = NIL;
                            o = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                html_indent(TWO_INTEGER);
                                cb_show_assertion_readably(o, T, T);
                                html_newline(UNPROVIDED);
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$108 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$108, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0_$107, thread);
                    }
                } else {
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = $$$mapping_assertions_for_sweep;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_0_$109 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$108 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$108, $SKIP)) {
                                final SubLObject idx_$109 = idx_$108;
                                if (NIL == id_index_dense_objects_empty_p(idx_$109, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$109);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject o4;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        a_handle = aref(vector_var, a_id);
                                        if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            o4 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            html_indent(TWO_INTEGER);
                                            cb_show_assertion_readably(o4, T, T);
                                            html_newline(UNPROVIDED);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$110 = idx_$108;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$110)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$110);
                                    SubLObject a_id2 = id_index_sparse_id_threshold(idx_$110);
                                    final SubLObject end_id = id_index_next_id(idx_$110);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                            final SubLObject o2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            html_indent(TWO_INTEGER);
                                            cb_show_assertion_readably(o2, T, T);
                                            html_newline(UNPROVIDED);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        a_id2 = add(a_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$110 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values6 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values6);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$109, thread);
                    }
                }
            }
            if (NIL != list_utilities.member_eqP($DEDUCTION, types)) {
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(THREE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_princ($str475$Recent_deductions_);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(THREE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                if (NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = deductions_high.deductions_around(deduction_handles.next_deduction_id(), n, n, UNPROVIDED);
                    final SubLObject _prev_bind_0_$111 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$mapping_deductions_for_sweep, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = NIL;
                            o = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                html_indent(TWO_INTEGER);
                                cb_form(o, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values7 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values7);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0_$111, thread);
                    }
                } else {
                    final SubLObject idx = deduction_handles.do_deductions_table();
                    final SubLObject mess = $$$mapping_deductions_for_sweep;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_0_$113 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$111 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$111, $SKIP)) {
                                final SubLObject idx_$112 = idx_$111;
                                if (NIL == id_index_dense_objects_empty_p(idx_$112, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$112);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject o4;
                                    SubLObject d_id;
                                    SubLObject d_handle;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        d_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        d_handle = aref(vector_var, d_id);
                                        if ((NIL == id_index_tombstone_p(d_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(d_handle)) {
                                                d_handle = $SKIP;
                                            }
                                            o4 = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                            html_indent(TWO_INTEGER);
                                            cb_form(o4, UNPROVIDED, UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$113 = idx_$111;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$113)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$113);
                                    SubLObject d_id2 = id_index_sparse_id_threshold(idx_$113);
                                    final SubLObject end_id = id_index_next_id(idx_$113);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (d_id2.numL(end_id)) {
                                        final SubLObject d_handle2 = gethash_without_values(d_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(d_handle2))) {
                                            final SubLObject o2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                            html_indent(TWO_INTEGER);
                                            cb_form(o2, UNPROVIDED, UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        d_id2 = add(d_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$114 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values8 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values8);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$113, thread);
                    }
                }
            }
            if (NIL != list_utilities.member_eqP($KB_HL_SUPPORTS, types)) {
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(THREE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_princ($str478$Recent_KB_HL_supports_);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(THREE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                if (NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = kb_hl_supports_high.kb_hl_supports_around(kb_hl_support_handles.next_kb_hl_support_id(), n, n, UNPROVIDED);
                    final SubLObject _prev_bind_0_$115 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($str479$mapping_kb_hl_supports_for_sweep, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = NIL;
                            o = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                html_indent(TWO_INTEGER);
                                cb_form(o, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$116 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values9 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values9);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0_$115, thread);
                    }
                } else {
                    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
                    final SubLObject mess = $str479$mapping_kb_hl_supports_for_sweep;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_0_$117 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$114 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$114, $SKIP)) {
                                final SubLObject idx_$115 = idx_$114;
                                if (NIL == id_index_dense_objects_empty_p(idx_$115, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$115);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject o4;
                                    SubLObject s_id;
                                    SubLObject s_handle;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        s_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        s_handle = aref(vector_var, s_id);
                                        if ((NIL == id_index_tombstone_p(s_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(s_handle)) {
                                                s_handle = $SKIP;
                                            }
                                            o4 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                            html_indent(TWO_INTEGER);
                                            cb_form(o4, UNPROVIDED, UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$116 = idx_$114;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$116)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$116);
                                    SubLObject s_id2 = id_index_sparse_id_threshold(idx_$116);
                                    final SubLObject end_id = id_index_next_id(idx_$116);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (s_id2.numL(end_id)) {
                                        final SubLObject s_handle2 = gethash_without_values(s_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(s_handle2))) {
                                            final SubLObject o2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                            html_indent(TWO_INTEGER);
                                            cb_form(o2, UNPROVIDED, UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        s_id2 = add(s_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values10 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values10);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$117, thread);
                    }
                }
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_handle_interactor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_SubLisp_Interactor);
        } else {
            SubLObject interactor_string = NIL;
            SubLObject default_string = NIL;
            if (NIL != args) {
                interactor_string = html_extract_input($$$interactor, args);
                if (interactor_string.isString()) {
                    interactor_string = cb_form_widgets.cb_normalize_formula_string(interactor_string);
                }
            }
            final SubLObject title_var = $$$SubL_Interactor;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str4$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$134 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    html_complete.html_complete_script();
                    cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$135 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str9$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
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
                            final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str486$cb_handle_interactor, T, UNPROVIDED);
                                final SubLObject documentation_requestP = html_extract_input($$$document, args);
                                final SubLObject input_string = html_extract_input($str488$input_string, args);
                                if (NIL != args) {
                                    if (NIL != input_string) {
                                        default_string = input_string;
                                    } else {
                                        default_string = cb_interactor_results(interactor_string, documentation_requestP);
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                if ((NIL != default_string) && length(default_string).numE(ZERO_INTEGER)) {
                                    default_string = NIL;
                                }
                                cb_show_handle_interactor(default_string);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$135, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$134, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_handle_interactor(final SubLObject default_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cb_form_widgets.$cb_use_subl_code_editorP$.getDynamicValue(thread)) {
            cyc_file_dependencies.javascript($HTML_EDITOR_SCRIPTS);
        }
        cb_help_preamble($CB_HANDLE_INTERACTOR, UNPROVIDED, UNPROVIDED);
        html_submit_input($$$Eval, UNPROVIDED, UNPROVIDED);
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str494$Enter_A_Form__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_indent(TWO_INTEGER);
        if (NIL != default_string) {
            html_reset_input($$$Reset);
            html_indent(UNPROVIDED);
        }
        if (NIL == cb_form_widgets.$cb_use_subl_code_editorP$.getDynamicValue(thread)) {
            html_script_utilities.html_clear_input_button($$$interactor, $$$Clear, UNPROVIDED);
            html_indent(UNPROVIDED);
            html_complete.html_complete_button($$$interactor, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            html_complete.html_cyclify_button($$$interactor, $$$Cyclify, UNPROVIDED);
        }
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        if (NIL != $cb_wrap_interactor$.getDynamicValue(thread)) {
            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$interactor);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != $cb_interactor_width$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($cb_interactor_width$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != $cb_interactor_height$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($cb_interactor_height$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue()) {
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                if (NIL != default_string) {
                    html_princ(default_string);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        } else {
            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$interactor);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != $cb_interactor_width$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($cb_interactor_width$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != $cb_interactor_height$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($cb_interactor_height$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue()) {
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(cb_form_widgets.$subl_code_editor_textarea_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                if (NIL != default_string) {
                    html_princ(default_string);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_interactor_results(final SubLObject interactor_string, final SubLObject documentation_requestP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (length(interactor_string).numE(ZERO_INTEGER)) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject form = read_from_string_ignoring_errors(interactor_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        final SubLObject read_remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (read_remainder == $ERROR) {
            final SubLObject color_val = $RED;
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != color_val) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(color_val));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str499$Malformed_expression___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_macros.verify_not_within_html_pre();
            html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
            try {
                html_macros.$within_html_pre$.bind(T, thread);
                html_princ(interactor_string);
            } finally {
                html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
            return interactor_string;
        }
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str500$Last_Form_Evaluated___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_macros.verify_not_within_html_pre();
        html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
        final SubLObject _prev_bind_2 = html_macros.$within_html_pre$.currentBinding(thread);
        try {
            html_macros.$within_html_pre$.bind(T, thread);
            html_string(interactor_string, ZERO_INTEGER, read_remainder);
        } finally {
            html_macros.$within_html_pre$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str501$Results___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        SubLObject results = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject _prev_bind_0_$139 = StreamsLow.$standard_output$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = StreamsLow.$error_output$.currentBinding(thread);
                    try {
                        StreamsLow.$standard_output$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
                        StreamsLow.$error_output$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
                        process_utilities.current_process_note_form(form);
                        results = eval_in_api.cyc_api_eval(list(MULTIPLE_VALUE_LIST, form));
                    } finally {
                        StreamsLow.$error_output$.rebind(_prev_bind_4, thread);
                        StreamsLow.$standard_output$.rebind(_prev_bind_0_$139, thread);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_3, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            html_newline(UNPROVIDED);
            final SubLObject color_val2 = $RED;
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != color_val2) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(color_val2));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_5 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str504$ERROR___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_5, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            html_princ(error_message);
            html_newline(TWO_INTEGER);
        }
        if (NIL != error_message) {
            return interactor_string;
        }
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cb_form(result, ZERO_INTEGER, T);
            html_newline(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return string_utilities.substring(interactor_string, read_remainder, NIL);
    }

    public static SubLObject cb_link_interactor(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Interactor;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str486$cb_handle_interactor);
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

    public static SubLObject cb_guess_function(final SubLObject string) {
        SubLObject position_stack = NIL;
        SubLObject end_var_$140;
        SubLObject end_var;
        SubLObject i;
        SubLObject pcase_var;
        SubLObject v_char;
        for (end_var = end_var_$140 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$140); i = number_utilities.f_1X(i)) {
            v_char = pcase_var = Strings.sublisp_char(string, i);
            if (pcase_var.eql(CHAR_lparen)) {
                position_stack = cons(i, position_stack);
            } else
                if (pcase_var.eql(CHAR_rparen)) {
                    position_stack = position_stack.rest();
                }

        }
        SubLObject cdolist_list_var = position_stack;
        SubLObject position = NIL;
        position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject obj = read_from_string_ignoring_errors(string, NIL, NIL, add(position, ONE_INTEGER), UNPROVIDED);
            if (obj.isSymbol() && (NIL != fboundp(obj))) {
                return obj;
            }
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cb_arglist(final SubLObject args) {
        html_princ($str509$_);
        if (NIL != args) {
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!arg.eql(args.first())) {
                    html_princ($$$_);
                }
                cb_arglist_rec(arg);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        }
        html_princ($str511$_);
        return args;
    }

    public static SubLObject cb_arglist_rec(final SubLObject obj) {
        if (NIL == obj) {
            html_princ($$$nil);
        } else
            if (obj.isKeyword()) {
                html_prin1(obj);
            } else
                if (obj.isSymbol()) {
                    html_princ(Strings.string_downcase(symbol_name(obj), UNPROVIDED, UNPROVIDED));
                } else
                    if (obj.isAtom()) {
                        html_prin1(obj);
                    } else
                        if (((length(obj).numE(TWO_INTEGER) && (obj.first() == FUNCTION)) && second(obj).isSymbol()) && (NIL != fboundp(second(obj)))) {
                            html_princ($str513$__);
                            cb_arglist_rec(second(obj));
                        } else
                            if (length(obj).numE(TWO_INTEGER) && (obj.first() == QUOTE)) {
                                html_princ($str514$_);
                                cb_arglist_rec(second(obj));
                            } else {
                                html_princ($str509$_);
                                SubLObject rest = NIL;
                                SubLObject next = NIL;
                                rest = obj;
                                next = rest.first();
                                while (rest.rest().isCons()) {
                                    if (!rest.eql(obj)) {
                                        html_indent(ONE_INTEGER);
                                    }
                                    cb_arglist_rec(next);
                                    rest = rest.rest();
                                    next = rest.first();
                                } 
                                if (!rest.eql(obj)) {
                                    html_indent(ONE_INTEGER);
                                }
                                cb_arglist_rec(next);
                                if (NIL != rest.rest()) {
                                    html_princ($str515$___);
                                    cb_arglist_rec(rest.rest());
                                }
                                html_princ($str511$_);
                            }





        return obj;
    }

    public static SubLObject cb_save_interface_state() {
        SubLObject savedP = NIL;
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$Save_Interface);
        } else {
            final SubLObject filename = user_preferences_file_name(operation_communication.the_cyclist());
            savedP = html_kernel.save_html_state_to_file(filename, $html_interface_variables$.getGlobalValue());
            if (NIL != savedP) {
                $html_state_filename$.setDynamicValue(filename);
            }
        }
        return savedP;
    }

    public static SubLObject cb_load_user_preferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject successP = load_user_preferences();
        if (NIL != successP) {
            cb_message_page_with_history($str522$Interface_Settings_Loaded_Success, T);
        } else {
            cb_simple_message_page($str523$No_Interface_Settings_File_To_Loa, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject load_user_preferences() {
        final SubLObject filename = user_preferences_file_name(UNPROVIDED);
        SubLObject preferences_loadedP = NIL;
        clear_user_preferences();
        if (NIL != Filesys.probe_file(filename)) {
            html_kernel.restore_html_state_from_file(filename);
            preferences_loadedP = T;
        } else
            if (NIL != default_preference_file_existsP()) {
                html_kernel.restore_html_state_from_file(default_preference_file());
                preferences_loadedP = T;
            }

        return preferences_loadedP;
    }

    public static SubLObject user_preferences_file_name(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user_part = (NIL != constant_p(cyclist)) ? constants_high.constant_name(cyclist) : cyclist == $DEFAULT ? $$$default : kb_utilities.compact_hl_external_id_string(cyclist);
        return Strings.string_downcase(Filesys.construct_filename($user_preference_directory_list$.getDynamicValue(thread), user_part, $user_preference_file_extension$.getDynamicValue(thread), T), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_user_preferences() {
        cb_query.$cb_default_query_parameters$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject default_preference_file_existsP() {
        return list_utilities.sublisp_boolean(Filesys.probe_file(default_preference_file()));
    }

    public static SubLObject default_preference_file() {
        return user_preferences_file_name($DEFAULT);
    }

    public static SubLObject cb_load_api(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_KE_Load_Page);
            return NIL;
        }
        final SubLObject title_var = $$$Load_API_Expressions_Page;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$141 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$142 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str9$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$144, thread);
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
                        final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str530$cb_load_api_handler, T, UNPROVIDED);
                            cb_help_preamble($CB_LOAD_API, UNPROVIDED, UNPROVIDED);
                            html_newline(THREE_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str531$Please_type_in_the_name_of_the_fi);
                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            html_princ($str532$_Load_File__);
                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_princ($str533$button_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_text_input($str534$load_api_file_name, NIL, $cb_load_api_input_size$.getDynamicValue(thread));
                            html_newline(UNPROVIDED);
                            html_reset_input($$$Clear);
                            html_indent(TWO_INTEGER);
                            html_submit_input($$$Load_File, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$145, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$143, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$142, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$141, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_load_api_handler(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_KE_Load_Page);
            return NIL;
        }
        if (NIL == args) {
            cb_error($str537$cb_load_api_handler_called_with_n, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject title_var = $$$Load_API_Expressions_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$146 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$147 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str9$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
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
                        final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str530$cb_load_api_handler, T, UNPROVIDED);
                            cb_help_preamble($CB_LOAD_API, UNPROVIDED, UNPROVIDED);
                            SubLObject file_name = html_extract_input($str534$load_api_file_name, args);
                            SubLObject skip_amount = html_extract_input($str539$load_api_file_skip, args);
                            file_name = string_utilities.trim_whitespace(file_name);
                            if (NIL == skip_amount) {
                                skip_amount = ZERO_INTEGER;
                            }
                            if (skip_amount.isString()) {
                                skip_amount = read_from_string_ignoring_errors(skip_amount, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (file_name.isString()) {
                                if (NIL != Filesys.probe_file(file_name)) {
                                    thread.resetMultipleValues();
                                    final SubLObject status = batch_ke.load_api_internal(file_name, skip_amount);
                                    final SubLObject count = thread.secondMultipleValue();
                                    final SubLObject position = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    html_princ($str540$The_file__);
                                    html_princ(file_name);
                                    html_princ($str541$__was_loaded___Here_are_the_resul);
                                    html_newline(TWO_INTEGER);
                                    if (status.equalp($SUCCESS)) {
                                        html_indent(FOUR_INTEGER);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str543$Successfully_and_completely_loade);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } else {
                                        cb_load_api_continue(file_name, status, count, position);
                                    }
                                } else {
                                    cb_error($str544$File__s_does_not_exist_, file_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } else {
                                cb_error($str545$KE_filename_was_not_a_string_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$150, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$148, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$147, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$146, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_load_api_continue(final SubLObject file_name, final SubLObject status, final SubLObject count, SubLObject position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (status.equalp($FILE_NOT_FOUND)) {
            cb_error($str544$File__s_does_not_exist_, file_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
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
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_macros.$within_html_form$.bind(T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_hidden_input($str530$cb_load_api_handler, T, UNPROVIDED);
                html_indent(THREE_INTEGER);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str548$An_error_occurred_after_processin);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ(count);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str549$_forms_);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                html_indent(THREE_INTEGER);
                html_princ(status);
                html_newline(TWO_INTEGER);
                html_hr(UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($$$Form_Number);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                html_princ($str551$You_may_continue_processing_this_);
                html_newline(UNPROVIDED);
                html_text_input($str539$load_api_file_skip, count, $cb_load_api_skip_input_size$.getDynamicValue(thread));
                html_newline(TWO_INTEGER);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($$$KE_File_Name);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                html_princ($str553$You_may_also_specify_a_new_file_t);
                html_newline(UNPROVIDED);
                html_text_input($str534$load_api_file_name, file_name, $cb_load_api_input_size$.getDynamicValue(thread));
                html_newline(TWO_INTEGER);
                html_reset_input($$$Reset);
                html_indent(TWO_INTEGER);
                html_submit_input($$$Load_File, UNPROVIDED, UNPROVIDED);
                html_newline(TWO_INTEGER);
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            } finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_form_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_show_when(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Display_by_Date);
            return NIL;
        }
        final SubLObject title_var = $$$Display_by_Date;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$151 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$152 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str9$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$154, thread);
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
                        final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str558$cb_show_when_handler, T, UNPROVIDED);
                            cb_help_preamble($CB_SHOW_WHEN, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_reset_input($$$Reset);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str559$What_kind_of_data_do_you_want_to_);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_radio_input($str560$cb_show_type, $cb_show_constant_value$.getGlobalValue(), T, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_princ($$$Constants);
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_radio_input($str560$cb_show_type, $cb_show_assertion_value$.getGlobalValue(), NIL, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_princ($$$Assertions);
                            html_newline(TWO_INTEGER);
                            thread.resetMultipleValues();
                            final SubLObject day = numeric_date_utilities.decode_universal_date(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED));
                            final SubLObject month = thread.secondMultipleValue();
                            final SubLObject year = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str563$Enter_in_the_start_date_);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_princ($$$Month);
                            html_text_input($str565$cb_show_start_month, month, TWO_INTEGER);
                            html_indent(THREE_INTEGER);
                            html_princ($$$Day);
                            html_text_input($str567$cb_show_start_day, day, TWO_INTEGER);
                            html_indent(THREE_INTEGER);
                            html_princ($$$Year);
                            html_text_input($str569$cb_show_start_year, year, FOUR_INTEGER);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str570$Enter_in_the_ending_date_);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_princ($$$Month);
                            html_text_input($str571$cb_show_end_month, month, TWO_INTEGER);
                            html_indent(THREE_INTEGER);
                            html_princ($$$Day);
                            html_text_input($str572$cb_show_end_day, day, TWO_INTEGER);
                            html_indent(THREE_INTEGER);
                            html_princ($$$Year);
                            html_text_input($str573$cb_show_end_year, year, FOUR_INTEGER);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str574$Enter_the_cyclist_to_examine__bla);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_complete.html_complete_button($str575$cb_show_cyclist, $$$Complete, $$Cyclist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_text_input($str575$cb_show_cyclist, operation_communication.the_cyclist(), $int$24);
                            html_indent(UNPROVIDED);
                            html_script_utilities.html_clear_input_button($str575$cb_show_cyclist, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str577$Enter_the_project_to_examine__bla);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_complete.html_complete_button($str578$cb_show_project, $$$Complete, $$Cyc_BasedProject, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_text_input($str578$cb_show_project, $str339$, $int$24);
                            html_indent(UNPROVIDED);
                            html_script_utilities.html_clear_input_button($str578$cb_show_project, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$155, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$153, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$152, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$151, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_show_check_values(final SubLObject args) {
        if (NIL != html_extract_input($str560$cb_show_type, args)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject cb_show_when_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cb_show_check_values(args)) {
            cb_error($str583$Please_specify_either_a_Constant_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject search_type = read_from_string_ignoring_errors(html_extract_input($str560$cb_show_type, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cyclist = string_utilities.trim_whitespace(html_extract_input($str575$cb_show_cyclist, args));
        SubLObject project = string_utilities.trim_whitespace(html_extract_input($str578$cb_show_project, args));
        final SubLObject start_day = read_from_string_ignoring_errors(html_extract_input($str567$cb_show_start_day, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject start_month = read_from_string_ignoring_errors(html_extract_input($str565$cb_show_start_month, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject start_year = read_from_string_ignoring_errors(html_extract_input($str569$cb_show_start_year, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject start_date = numeric_date_utilities.encode_universal_date(start_day, start_month, start_year);
        final SubLObject end_day = read_from_string_ignoring_errors(html_extract_input($str572$cb_show_end_day, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject end_month = read_from_string_ignoring_errors(html_extract_input($str571$cb_show_end_month, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject end_year = read_from_string_ignoring_errors(html_extract_input($str573$cb_show_end_year, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject end_date = numeric_date_utilities.encode_universal_date(end_day, end_month, end_year);
        if ($str339$.equalp(cyclist)) {
            cyclist = NIL;
        } else {
            cyclist = cb_guess_fort(cyclist, UNPROVIDED);
            if (NIL == forts.fort_p(cyclist)) {
                cb_error($str584$Unknown_cyclist___S, cyclist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
        }
        if ($str339$.equalp(project)) {
            project = NIL;
        } else {
            project = cb_guess_fort(project, UNPROVIDED);
            if (NIL == forts.fort_p(project)) {
                cb_error($str585$Unknown_project___S, project, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
        }
        final SubLObject title_var = $$$Date_Search_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$156 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$157 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str9$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$159, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$160 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_SHOW_WHEN_HANDLER, UNPROVIDED, UNPROVIDED);
                            html_princ($$$Listing_);
                            if (search_type.equalp($cb_show_constant_value$.getGlobalValue())) {
                                html_princ($$$constants);
                            } else {
                                html_princ($$$assertions);
                            }
                            html_princ($$$_created_from_);
                            cb_show_date(start_date);
                            html_princ($$$_to_);
                            cb_show_date(end_date);
                            if (NIL != cyclist) {
                                html_princ($$$_by_);
                                cb_show_term(cyclist, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != project) {
                                html_princ($$$_for_);
                                cb_show_term(project, UNPROVIDED, UNPROVIDED);
                            }
                            html_princ($str188$__);
                            html_newline(TWO_INTEGER);
                            final SubLObject form_to_eval = (search_type.equalp($cb_show_constant_value$.getGlobalValue())) ? NIL != project ? list(CONSTANTS_FOR_PROJECTS_BETWEEN, project, start_date, end_date, cyclist) : list(CONSTANTS_CREATED_BETWEEN, start_date, end_date, cyclist) : NIL != project ? list(ASSERTIONS_FOR_PROJECTS_BETWEEN, project, start_date, end_date, cyclist) : list(ASSERTIONS_BETWEEN, start_date, end_date, cyclist);
                            final SubLObject result_var = (search_type.equalp($cb_show_constant_value$.getGlobalValue())) ? $sym598$_CONSTANT : $sym599$_ASSERTION;
                            final SubLObject query = list($$thereExists, $sym601$_TERM_LIST, list($$and, list($$evaluate, $sym601$_TERM_LIST, list($$EvaluateSubLFn, list($$SubLQuoteFn, form_to_eval))), listS($$memberOfList, result_var, $list607)));
                            thread.resetMultipleValues();
                            final SubLObject result = inference_kernel.new_cyc_query(query, $$BaseKB, $list609);
                            final SubLObject halt_reason = thread.secondMultipleValue();
                            final SubLObject inference = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (halt_reason != $EXHAUST_TOTAL) {
                                Errors.warn($str611$Expected_When_Tool_inference_halt, halt_reason);
                            }
                            SubLObject show_list = NIL;
                            SubLObject cdolist_list_var = result;
                            SubLObject binding_list = NIL;
                            binding_list = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject binding = list_utilities.only_one(binding_list);
                                final SubLObject v_term = bindings.variable_binding_value(binding);
                                show_list = cons(v_term, show_list);
                                cdolist_list_var = cdolist_list_var.rest();
                                binding_list = cdolist_list_var.first();
                            } 
                            show_list = nreverse(show_list);
                            cb_show_display_results(search_type, show_list, inference);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$160, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$158, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$157, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$156, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_show_display_results(final SubLObject search_type, final SubLObject show_list, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == show_list) {
            html_indent(THREE_INTEGER);
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ($str613$None_for_the_given_time_period_);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_newline(TWO_INTEGER);
            return NIL;
        }
        SubLObject last_cyclist = NIL;
        SubLObject last_date = NIL;
        SubLObject last_reviewer = NIL;
        final SubLObject constant_searchP = equalp(search_type, $cb_show_constant_value$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        format(html_macros.$html_stream$.getDynamicValue(thread), $str614$_a__a___, length(show_list), NIL != constant_searchP ? $$$constants : $$$assertions);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_link($SAVE_INFERENCE_ANSWERS, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        SubLObject cdolist_list_var = show_list;
        SubLObject listing = NIL;
        listing = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != constant_searchP) {
                if (!last_cyclist.equalp(bookkeeping_store.creator(listing, UNPROVIDED))) {
                    last_cyclist = bookkeeping_store.creator(listing, UNPROVIDED);
                    html_hr(UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    cb_show_term(last_cyclist, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    last_date = NIL;
                }
                if (!last_date.equalp(bookkeeping_store.creation_time(listing, UNPROVIDED))) {
                    last_date = bookkeeping_store.creation_time(listing, UNPROVIDED);
                    html_newline(UNPROVIDED);
                    html_indent(THREE_INTEGER);
                    cb_show_date(last_date);
                }
                if (!last_reviewer.equalp(kb_accessors.reviewer(listing, UNPROVIDED))) {
                    last_reviewer = kb_accessors.reviewer(listing, UNPROVIDED);
                    html_hr(UNPROVIDED, UNPROVIDED);
                    html_hr(UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    cb_show_term(last_reviewer, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
            } else {
                if (!last_cyclist.equalp(assertions_high.asserted_by(listing))) {
                    last_cyclist = assertions_high.asserted_by(listing);
                    html_hr(UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    cb_show_term(last_cyclist, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    last_date = NIL;
                }
                if (!last_date.equalp(assertions_high.asserted_when(listing))) {
                    last_date = assertions_high.asserted_when(listing);
                    html_newline(UNPROVIDED);
                    html_indent(THREE_INTEGER);
                    cb_show_date(last_date);
                }
            }
            html_newline(UNPROVIDED);
            html_indent(SIX_INTEGER);
            cb_form(listing, UNPROVIDED, UNPROVIDED);
            if (NIL != assertion_handles.assertion_p(listing)) {
                html_princ($$$_in_);
                cb_show_term(assertions_high.assertion_mt(listing), UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            listing = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cb_link_show_when(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$When;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str618$cb_show_when);
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

    public static SubLObject cb_index_overlap(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Index_Overlap;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$161 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$162 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str9$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$163 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$164 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$164, thread);
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
                        final SubLObject _prev_bind_0_$165 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str625$cb_handle_index_overlap, T, UNPROVIDED);
                            cb_help_preamble($CB_INDEX_OVERLAP, UNPROVIDED, UNPROVIDED);
                            html_submit_input($$$Search, UNPROVIDED, UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_reset_input($$$Clear);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str627$Enter_required_terms_separated_by);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_complete.html_complete_button($$$terms, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_complete.html_cyclify_button($$$terms, $$$Cyclify, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$terms);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($int$80);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TEN_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$166 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$166, thread);
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str629$Enter_terms_to_exclude_separated_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_complete.html_complete_button($str630$exclude_terms, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_complete.html_cyclify_button($str630$exclude_terms, $$$Cyclify, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str630$exclude_terms);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($int$80);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TEN_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$167 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$167, thread);
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$165, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$163, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$162, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$161, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_handle_index_overlap(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constants = NIL;
        SubLObject exclude_constants = NIL;
        SubLObject error = NIL;
        thread.resetMultipleValues();
        final SubLObject constants_$168 = read_multiple_terms_from_string(html_extract_input($$$terms, args));
        final SubLObject error_$169 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        constants = constants_$168;
        error = error_$169;
        if (NIL != error) {
            return cb_error($str632$Error_reading_terms___Check_for_t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject exclude_constants_$170 = read_multiple_terms_from_string(html_extract_input($str630$exclude_terms, args));
        final SubLObject error_$170 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        exclude_constants = exclude_constants_$170;
        error = error_$170;
        if (NIL != error) {
            return cb_error($str633$Error_reading_exclude_terms___Che, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        constants = nreverse(constants);
        final SubLObject title_var = $$$Index_Overlap_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$172 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$173 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str9$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$174 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$175 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$175, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$176 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_INDEX_OVERLAP, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str635$Search_Terms__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            if (NIL == constants) {
                                html_newline(UNPROVIDED);
                                html_princ($$$None);
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str636$Please_enter_some_valid_search_te);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } else {
                                SubLObject cdolist_list_var = constants;
                                SubLObject constant = NIL;
                                constant = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_newline(UNPROVIDED);
                                    cb_show_term(constant, UNPROVIDED, UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    constant = cdolist_list_var.first();
                                } 
                                html_newline(TWO_INTEGER);
                                if (NIL != exclude_constants) {
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str637$Excluded_Terms__);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    cdolist_list_var = exclude_constants;
                                    SubLObject exclude_constant = NIL;
                                    exclude_constant = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        html_newline(UNPROVIDED);
                                        cb_show_term(exclude_constant, UNPROVIDED, UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        exclude_constant = cdolist_list_var.first();
                                    } 
                                    html_newline(TWO_INTEGER);
                                }
                                if (NIL != list_utilities.singletonP(constants)) {
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str638$Please_enter_more_than_1_search_t);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                } else {
                                    SubLObject assertions = NIL;
                                    final SubLObject _prev_bind_0_$177 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$178 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        assertions = virtual_indexing.assertions_mentioning_terms(constants, T);
                                        if (NIL != exclude_constants) {
                                            SubLObject new_assertions = NIL;
                                            SubLObject cdolist_list_var2 = assertions;
                                            SubLObject assertion = NIL;
                                            assertion = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                SubLObject excludeP = NIL;
                                                if (NIL == excludeP) {
                                                    SubLObject csome_list_var = exclude_constants;
                                                    SubLObject exclude_constant2 = NIL;
                                                    exclude_constant2 = csome_list_var.first();
                                                    while ((NIL == excludeP) && (NIL != csome_list_var)) {
                                                        if (NIL != list_utilities.tree_find(exclude_constant2, uncanonicalizer.assertion_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                            excludeP = T;
                                                        }
                                                        csome_list_var = csome_list_var.rest();
                                                        exclude_constant2 = csome_list_var.first();
                                                    } 
                                                }
                                                if (NIL == excludeP) {
                                                    new_assertions = cons(assertion, new_assertions);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                assertion = cdolist_list_var2.first();
                                            } 
                                            assertions = new_assertions;
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$178, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$177, thread);
                                    }
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str641$Index_Overlap___);
                                    html_princ(length(assertions));
                                    html_princ($str642$_assertions_found_);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    if (NIL != assertions) {
                                        SubLObject cdolist_list_var3 = assertions;
                                        SubLObject assertion2 = NIL;
                                        assertion2 = cdolist_list_var3.first();
                                        while (NIL != cdolist_list_var3) {
                                            html_newline(UNPROVIDED);
                                            cb_show_assertion_readably(assertion2, T, UNPROVIDED);
                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                            assertion2 = cdolist_list_var3.first();
                                        } 
                                    }
                                }
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$176, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$174, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$173, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$172, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_index_overlap(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Overlap;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str645$cb_index_overlap);
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

    public static SubLObject cb_link_owl_import(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$OWL_Import;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str651$cb_owl_import);
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

    public static SubLObject cb_link_owl_export(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$OWL_Export;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str657$cb_owl_export);
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

    public static SubLObject cb_link_compose(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Compose;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str665$ke_compose);
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

    public static SubLObject cb_link_navigator(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Navigator;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str670$cyc_navigator);
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

    public static SubLObject cb_link_doc(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Doc;
        }
        final SubLObject target = (NIL != $cb_separate_doc_frame$.getDynamicValue(thread)) ? $DOC : $MAIN;
        final SubLObject frame = cb_frame_name(target);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_princ(cyc_documentation_toc());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame);
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

    public static SubLObject cyc_server_url(final SubLObject host, final SubLObject port_offset, SubLObject handler) {
        if (handler == UNPROVIDED) {
            handler = $str681$cb_start;
        }
        return cconcatenate($str682$http___, new SubLObject[]{ host, $str683$_, princ_to_string(add($int$3602, port_offset)), http_kernel.$http_cgi_bin_directory$.getGlobalValue(), $str685$_cyccgi, cconcatenate($str686$_localhost, format_nil.format_nil_a_no_copy(port_offset)), http_kernel.$http_cg_url$.getGlobalValue(), handler });
    }

    public static SubLObject cb_link_kb_monitor_index_hook(final SubLObject index_hook, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str687$_Monitor_;
        }
        final SubLObject href = cconcatenate($str682$http___, new SubLObject[]{ format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_host()), $str683$_, format_nil.format_nil_a_no_copy(web_utilities.effective_servlet_container_port()), $str688$_kbmonitor_makequery_jsp_kbq_stri, format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(index_hook)), $str689$_cyc_host_string_, format_nil.format_nil_a_no_copy(misc_utilities.hostname()), $str690$_cyc_port_string_, format_nil.format_nil_a_no_copy(html_kernel.html_port()) });
        final SubLObject window_name = cconcatenate(kb_utilities.compact_hl_external_id_string(index_hook), $str691$_kbmonitor);
        final SubLObject onclick = html_script_utilities.html_popup_onclick(window_name, $int$600, $int$400, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_script_utilities.html_popup_script();
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(href);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_anchor_title$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str339$);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(onclick);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return index_hook;
    }

    public static SubLObject cb_jstack_trace(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = cconcatenate($$$Jstack_for_process_, format_nil.format_nil_s_no_copy(system_administration_utilities.get_process_id_in_jrtl()));
        final SubLObject refresh = NIL;
        html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str4$_meta_http_equiv__X_UA_Compatible);
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
            html_princ(title);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            if (NIL != refresh) {
                html_refresh(refresh, UNPROVIDED);
            }
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$179 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$180 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject list_var = NIL;
                    SubLObject line = NIL;
                    SubLObject index = NIL;
                    list_var = system_administration_utilities.jstack_trace(UNPROVIDED);
                    line = list_var.first();
                    for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , line = list_var.first() , index = add(ONE_INTEGER, index)) {
                        if (!index.isZero()) {
                            html_princ(line);
                            html_newline(UNPROVIDED);
                        }
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$180, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$179, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_jstack_trace(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$jstack_Trace;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str699$cyc_jstack_trace);
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

    public static SubLObject declare_cb_tools_file() {
        declareFunction(me, "cb_tools", "CB-TOOLS", 0, 1, false);
        declareFunction(me, "cb_tool_columns", "CB-TOOL-COLUMNS", 1, 0, false);
        declareFunction(me, "cb_tools_internal", "CB-TOOLS-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_tools_handler", "CB-TOOLS-HANDLER", 1, 0, false);
        declareFunction(me, "cb_link_tools", "CB-LINK-TOOLS", 0, 1, false);
        declareFunction(me, "html_update_cb_toolbar_script", "HTML-UPDATE-CB-TOOLBAR-SCRIPT", 0, 0, false);
        declareFunction(me, "declare_cb_boolean_global", "DECLARE-CB-BOOLEAN-GLOBAL", 2, 0, false);
        declareFunction(me, "cb_boolean_option_field_name", "CB-BOOLEAN-OPTION-FIELD-NAME", 1, 0, false);
        declareFunction(me, "cb_boolean_option_legend_form", "CB-BOOLEAN-OPTION-LEGEND-FORM", 1, 0, false);
        declareFunction(me, "cb_boolean_option_check", "CB-BOOLEAN-OPTION-CHECK", 1, 0, false);
        declareFunction(me, "cb_boolean_option_new_value", "CB-BOOLEAN-OPTION-NEW-VALUE", 2, 0, false);
        declareMacro(me, "cb_show_boolean_option", "CB-SHOW-BOOLEAN-OPTION");
        declareFunction(me, "cb_fastP", "CB-FAST?", 0, 0, false);
        declareFunction(me, "cb_new_script_mode", "CB-NEW-SCRIPT-MODE", 1, 0, false);
        declareMacro(me, "cb_options_submit_bar", "CB-OPTIONS-SUBMIT-BAR");
        declareFunction(me, "cb_options", "CB-OPTIONS", 1, 0, false);
        declareFunction(me, "cb_options_table_of_contents", "CB-OPTIONS-TABLE-OF-CONTENTS", 0, 0, false);
        declareMacro(me, "cb_options_section", "CB-OPTIONS-SECTION");
        declareMacro(me, "cb_options_section_column", "CB-OPTIONS-SECTION-COLUMN");
        declareMacro(me, "cb_options_subsection", "CB-OPTIONS-SUBSECTION");
        declareMacro(me, "cb_option_with_title_only", "CB-OPTION-WITH-TITLE-ONLY");
        declareMacro(me, "cb_option_with_title_and_hoverover", "CB-OPTION-WITH-TITLE-AND-HOVEROVER");
        declareMacro(me, "cb_option_with_title", "CB-OPTION-WITH-TITLE");
        declareMacro(me, "cb_checkbox_option", "CB-CHECKBOX-OPTION");
        declareFunction(me, "cb_constant_entry_option", "CB-CONSTANT-ENTRY-OPTION", 3, 2, false);
        declareFunction(me, "cb_options_general", "CB-OPTIONS-GENERAL", 0, 0, false);
        declareFunction(me, "cb_options_term_display", "CB-OPTIONS-TERM-DISPLAY", 0, 0, false);
        declareFunction(me, "cb_options_history_and_browser_tool", "CB-OPTIONS-HISTORY-AND-BROWSER-TOOL", 0, 0, false);
        declareFunction(me, "cb_options_nl", "CB-OPTIONS-NL", 0, 0, false);
        declareFunction(me, "cb_paraphrase_mt", "CB-PARAPHRASE-MT", 0, 0, false);
        declareFunction(me, "cb_options_query_tool", "CB-OPTIONS-QUERY-TOOL", 0, 0, false);
        declareFunction(me, "cb_options_boolean_handler", "CB-OPTIONS-BOOLEAN-HANDLER", 1, 0, false);
        declareFunction(me, "cb_options_set_boolean", "CB-OPTIONS-SET-BOOLEAN", 2, 0, false);
        declareFunction(me, "cb_options_handler", "CB-OPTIONS-HANDLER", 1, 0, false);
        declareFunction(me, "cb_history_display_options_handler", "CB-HISTORY-DISPLAY-OPTIONS-HANDLER", 1, 0, false);
        declareFunction(me, "cb_term_display_options_handler", "CB-TERM-DISPLAY-OPTIONS-HANDLER", 1, 0, false);
        declareFunction(me, "cb_lexification_options_handler", "CB-LEXIFICATION-OPTIONS-HANDLER", 1, 0, false);
        declareFunction(me, "cb_pph_options_handler", "CB-PPH-OPTIONS-HANDLER", 1, 0, false);
        declareFunction(me, "cb_set_default_pph_mt", "CB-SET-DEFAULT-PPH-MT", 1, 0, false);
        declareFunction(me, "cb_query_tool_options_handler", "CB-QUERY-TOOL-OPTIONS-HANDLER", 1, 0, false);
        declareFunction(me, "cb_options_handler_finish", "CB-OPTIONS-HANDLER-FINISH", 1, 0, false);
        declareFunction(me, "cb_link_options", "CB-LINK-OPTIONS", 0, 1, false);
        declareFunction(me, "cb_options_result_page", "CB-OPTIONS-RESULT-PAGE", 0, 2, false);
        declareFunction(me, "cb_options_result_message", "CB-OPTIONS-RESULT-MESSAGE", 1, 0, false);
        declareFunction(me, "cb_history", "CB-HISTORY", 0, 1, false);
        declareFunction(me, "cb_history_internal", "CB-HISTORY-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_show_history_info", "CB-SHOW-HISTORY-INFO", 0, 1, false);
        declareFunction(me, "cb_show_recent_history", "CB-SHOW-RECENT-HISTORY", 1, 0, false);
        declareFunction(me, "cb_show_recent_constants", "CB-SHOW-RECENT-CONSTANTS", 1, 0, false);
        declareFunction(me, "cb_show_recent_constants_categorized", "CB-SHOW-RECENT-CONSTANTS-CATEGORIZED", 0, 0, false);
        declareFunction(me, "cb_show_recent_constants_categorized_2", "CB-SHOW-RECENT-CONSTANTS-CATEGORIZED-2", 0, 0, false);
        declareFunction(me, "cb_show_recent_nats", "CB-SHOW-RECENT-NATS", 0, 0, false);
        declareFunction(me, "cb_show_recent_sentences", "CB-SHOW-RECENT-SENTENCES", 0, 0, false);
        declareFunction(me, "cb_bookmarks_supported_for_current_user", "CB-BOOKMARKS-SUPPORTED-FOR-CURRENT-USER", 0, 0, false);
        declareFunction(me, "cb_show_bookmarked_constants", "CB-SHOW-BOOKMARKED-CONSTANTS", 0, 0, false);
        declareFunction(me, "cb_show_bookmarked_nats", "CB-SHOW-BOOKMARKED-NATS", 0, 0, false);
        declareFunction(me, "cb_show_bookmarked_assertions", "CB-SHOW-BOOKMARKED-ASSERTIONS", 0, 0, false);
        declareFunction(me, "cb_show_recent_assertions", "CB-SHOW-RECENT-ASSERTIONS", 0, 0, false);
        declareFunction(me, "cb_link_history", "CB-LINK-HISTORY", 0, 2, false);
        declareFunction(me, "cb_clear_history", "CB-CLEAR-HISTORY", 0, 1, false);
        declareFunction(me, "cb_link_clear_history", "CB-LINK-CLEAR-HISTORY", 0, 1, false);
        declareFunction(me, "cb_link_clear_constant_history", "CB-LINK-CLEAR-CONSTANT-HISTORY", 0, 2, false);
        declareFunction(me, "cb_link_clear_nat_history", "CB-LINK-CLEAR-NAT-HISTORY", 0, 1, false);
        declareFunction(me, "cb_link_clear_assertion_history", "CB-LINK-CLEAR-ASSERTION-HISTORY", 0, 1, false);
        declareFunction(me, "cb_link_clear_sentence_history", "CB-LINK-CLEAR-SENTENCE-HISTORY", 0, 1, false);
        declareFunction(me, "cb_history_el_formulas", "CB-HISTORY-EL-FORMULAS", 0, 1, false);
        declareFunction(me, "cb_link_history_el_formulas", "CB-LINK-HISTORY-EL-FORMULAS", 0, 1, false);
        declareFunction(me, "cb_history_hl_formulas", "CB-HISTORY-HL-FORMULAS", 0, 1, false);
        declareFunction(me, "cb_link_history_hl_formulas", "CB-LINK-HISTORY-HL-FORMULAS", 0, 1, false);
        declareFunction(me, "cb_rem_fort_from_all_histories", "CB-REM-FORT-FROM-ALL-HISTORIES", 1, 0, false);
        declareFunction(me, "cb_add_to_history", "CB-ADD-TO-HISTORY", 1, 0, false);
        declareFunction(me, "cb_constant_history_items", "CB-CONSTANT-HISTORY-ITEMS", 0, 0, false);
        declareFunction(me, "cb_most_recent_constant", "CB-MOST-RECENT-CONSTANT", 0, 0, false);
        declareFunction(me, "cb_add_to_constant_history", "CB-ADD-TO-CONSTANT-HISTORY", 1, 0, false);
        declareFunction(me, "cb_rem_from_constant_history", "CB-REM-FROM-CONSTANT-HISTORY", 1, 0, false);
        declareFunction(me, "cb_clear_constant_history", "CB-CLEAR-CONSTANT-HISTORY", 0, 0, false);
        declareFunction(me, "cb_valid_nat_p", "CB-VALID-NAT-P", 1, 0, false);
        declareFunction(me, "cb_nat_history_items", "CB-NAT-HISTORY-ITEMS", 0, 0, false);
        declareFunction(me, "cb_most_recent_nat", "CB-MOST-RECENT-NAT", 0, 0, false);
        declareFunction(me, "cb_add_to_nat_history", "CB-ADD-TO-NAT-HISTORY", 1, 0, false);
        declareFunction(me, "cb_rem_from_nat_history", "CB-REM-FROM-NAT-HISTORY", 1, 0, false);
        declareFunction(me, "cb_rem_fort_from_nat_history", "CB-REM-FORT-FROM-NAT-HISTORY", 1, 0, false);
        declareFunction(me, "cb_clear_nat_history", "CB-CLEAR-NAT-HISTORY", 0, 0, false);
        declareFunction(me, "cb_assertion_history_valid_item_p", "CB-ASSERTION-HISTORY-VALID-ITEM-P", 1, 0, false);
        declareFunction(me, "cb_assertion_history_items", "CB-ASSERTION-HISTORY-ITEMS", 0, 0, false);
        declareFunction(me, "cb_most_recent_assertion", "CB-MOST-RECENT-ASSERTION", 0, 0, false);
        declareFunction(me, "cb_add_to_assertion_history", "CB-ADD-TO-ASSERTION-HISTORY", 1, 0, false);
        declareFunction(me, "cb_add_sentence_in_mt_to_assertion_history", "CB-ADD-SENTENCE-IN-MT-TO-ASSERTION-HISTORY", 2, 0, false);
        declareFunction(me, "cb_rem_from_assertion_history", "CB-REM-FROM-ASSERTION-HISTORY", 1, 0, false);
        declareFunction(me, "cb_rem_fort_from_assertion_history", "CB-REM-FORT-FROM-ASSERTION-HISTORY", 1, 0, false);
        declareFunction(me, "cb_clear_assertion_history", "CB-CLEAR-ASSERTION-HISTORY", 0, 0, false);
        declareFunction(me, "expression_forts_with_hl", "EXPRESSION-FORTS-WITH-HL", 1, 0, false);
        declareFunction(me, "cb_sentence_history_items", "CB-SENTENCE-HISTORY-ITEMS", 0, 0, false);
        declareFunction(me, "cb_most_recent_sentence", "CB-MOST-RECENT-SENTENCE", 0, 0, false);
        declareFunction(me, "cb_add_to_sentence_history", "CB-ADD-TO-SENTENCE-HISTORY", 1, 0, false);
        declareFunction(me, "cb_add_sentence_in_mt_to_sentence_history", "CB-ADD-SENTENCE-IN-MT-TO-SENTENCE-HISTORY", 2, 0, false);
        declareFunction(me, "cb_rem_from_sentence_history", "CB-REM-FROM-SENTENCE-HISTORY", 1, 0, false);
        declareFunction(me, "cb_rem_fort_from_sentence_history", "CB-REM-FORT-FROM-SENTENCE-HISTORY", 1, 0, false);
        declareFunction(me, "cb_clear_sentence_history", "CB-CLEAR-SENTENCE-HISTORY", 0, 0, false);
        declareFunction(me, "clear_cb_bookmarked_items", "CLEAR-CB-BOOKMARKED-ITEMS", 0, 0, false);
        declareFunction(me, "remove_cb_bookmarked_items", "REMOVE-CB-BOOKMARKED-ITEMS", 0, 1, false);
        declareFunction(me, "cb_bookmarked_items_internal", "CB-BOOKMARKED-ITEMS-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_bookmarked_items", "CB-BOOKMARKED-ITEMS", 0, 1, false);
        declareFunction(me, "name_for_alpha_sort", "NAME-FOR-ALPHA-SORT", 1, 0, false);
        declareFunction(me, "cb_current_relevant_terms", "CB-CURRENT-RELEVANT-TERMS", 0, 0, false);
        declareFunction(me, "cb_recent_kb_additions", "CB-RECENT-KB-ADDITIONS", 0, 1, false);
        declareFunction(me, "cb_link_recent_kb_additions", "CB-LINK-RECENT-KB-ADDITIONS", 0, 1, false);
        declareFunction(me, "links_to_recent_kb_additions", "LINKS-TO-RECENT-KB-ADDITIONS", 0, 2, false);
        declareFunction(me, "cb_handle_interactor", "CB-HANDLE-INTERACTOR", 0, 1, false);
        declareFunction(me, "cb_show_handle_interactor", "CB-SHOW-HANDLE-INTERACTOR", 1, 0, false);
        declareFunction(me, "cb_interactor_results", "CB-INTERACTOR-RESULTS", 2, 0, false);
        declareFunction(me, "cb_link_interactor", "CB-LINK-INTERACTOR", 0, 1, false);
        declareFunction(me, "cb_guess_function", "CB-GUESS-FUNCTION", 1, 0, false);
        declareFunction(me, "cb_arglist", "CB-ARGLIST", 1, 0, false);
        declareFunction(me, "cb_arglist_rec", "CB-ARGLIST-REC", 1, 0, false);
        declareFunction(me, "cb_save_interface_state", "CB-SAVE-INTERFACE-STATE", 0, 0, false);
        declareFunction(me, "cb_load_user_preferences", "CB-LOAD-USER-PREFERENCES", 0, 1, false);
        declareFunction(me, "load_user_preferences", "LOAD-USER-PREFERENCES", 0, 0, false);
        declareFunction(me, "user_preferences_file_name", "USER-PREFERENCES-FILE-NAME", 0, 1, false);
        declareFunction(me, "clear_user_preferences", "CLEAR-USER-PREFERENCES", 0, 0, false);
        declareFunction(me, "default_preference_file_existsP", "DEFAULT-PREFERENCE-FILE-EXISTS?", 0, 0, false);
        declareFunction(me, "default_preference_file", "DEFAULT-PREFERENCE-FILE", 0, 0, false);
        declareFunction(me, "cb_load_api", "CB-LOAD-API", 0, 1, false);
        declareFunction(me, "cb_load_api_handler", "CB-LOAD-API-HANDLER", 0, 1, false);
        declareFunction(me, "cb_load_api_continue", "CB-LOAD-API-CONTINUE", 4, 0, false);
        declareFunction(me, "cb_show_when", "CB-SHOW-WHEN", 0, 1, false);
        declareFunction(me, "cb_show_check_values", "CB-SHOW-CHECK-VALUES", 1, 0, false);
        declareFunction(me, "cb_show_when_handler", "CB-SHOW-WHEN-HANDLER", 1, 0, false);
        declareFunction(me, "cb_show_display_results", "CB-SHOW-DISPLAY-RESULTS", 3, 0, false);
        declareFunction(me, "cb_link_show_when", "CB-LINK-SHOW-WHEN", 0, 1, false);
        declareFunction(me, "cb_index_overlap", "CB-INDEX-OVERLAP", 0, 1, false);
        declareFunction(me, "cb_handle_index_overlap", "CB-HANDLE-INDEX-OVERLAP", 1, 0, false);
        declareFunction(me, "cb_link_index_overlap", "CB-LINK-INDEX-OVERLAP", 0, 1, false);
        declareFunction(me, "cb_link_owl_import", "CB-LINK-OWL-IMPORT", 0, 1, false);
        declareFunction(me, "cb_link_owl_export", "CB-LINK-OWL-EXPORT", 0, 1, false);
        declareFunction(me, "cb_link_compose", "CB-LINK-COMPOSE", 0, 1, false);
        declareFunction(me, "cb_link_navigator", "CB-LINK-NAVIGATOR", 0, 1, false);
        declareFunction(me, "cb_link_doc", "CB-LINK-DOC", 0, 1, false);
        declareFunction(me, "cyc_server_url", "CYC-SERVER-URL", 2, 1, false);
        declareFunction(me, "cb_link_kb_monitor_index_hook", "CB-LINK-KB-MONITOR-INDEX-HOOK", 1, 1, false);
        declareFunction(me, "cb_jstack_trace", "CB-JSTACK-TRACE", 0, 1, false);
        declareFunction(me, "cb_link_jstack_trace", "CB-LINK-JSTACK-TRACE", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_cb_tools_file() {
        defparameter("*CB-TOOLS-SPLIT-THRESHOLD*", TEN_INTEGER);
        deflexical("*CB-BOOLEAN-GLOBALS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*CB-WFF-STRICT?*", NIL);
        deflexical("*CB-OPTION-SECTION-NAMES*", $list145);
        defparameter("*CB-USE-CSS-COLUMNS-FOR-CATEGORIES*", T);
        deflexical("*CB-HISTORY-MAX-CONSTANTS*", $int$50);
        deflexical("*CB-HISTORY-MAX-NATS*", $int$25);
        deflexical("*CB-HISTORY-MAX-ASSERTIONS*", TEN_INTEGER);
        deflexical("*CB-BOOKMARKED-ITEMS-CACHING-STATE*", NIL);
        defparameter("*CB-INTERACTOR-WIDTH*", $int$80);
        defparameter("*CB-INTERACTOR-HEIGHT*", $int$25);
        defparameter("*HTML-STATE-FILENAME*", NIL);
        defparameter("*USER-PREFERENCE-FILE-EXTENSION*", $$$pref);
        defparameter("*USER-PREFERENCE-DIRECTORY-LIST*", list($$$preferences, $$$users));
        defparameter("*DEFAULT-USER-PREFERENCE-FILENAME*", $$$default);
        defparameter("*CB-LOAD-API-INPUT-SIZE*", $int$70);
        defparameter("*CB-LOAD-API-SKIP-INPUT-SIZE*", SEVEN_INTEGER);
        defparameter("*CB-SHOW-LIST*", NIL);
        defconstant("*CB-SHOW-CONSTANT-VALUE*", ONE_INTEGER);
        defconstant("*CB-SHOW-ASSERTION-VALUE*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_cb_tools_file() {
        sethash($CB_TOOLS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str1$cb_tools_html, NIL));
        html_macros.note_cgi_handler_function(CB_TOOLS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TOOLS_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($TOOLS, CB_LINK_TOOLS, ONE_INTEGER);
        declare_cb_boolean_global($cb_c_wrap_assertions$, $list58);
        declare_cb_boolean_global($sym59$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__, $list60);
        declare_cb_boolean_global($sym61$_CB_DISPLAY_DATES_AS_STRINGS__, $list62);
        declare_cb_boolean_global($sym63$_CB_DISPLAY_DECIMALS_AS_DECIMALS__, $list64);
        declare_cb_boolean_global($sym65$_CB_DISPLAY_FRACTIONS_AS_FRACTIONS__, $list66);
        declare_cb_boolean_global($cb_wrap_interactor$, $list68);
        declare_cb_boolean_global($cb_use_dynamic_table_for_inference_results$, $list70);
        declare_cb_boolean_global($sym71$_CB_SHOW_INFERENCE_RESULTS_IN_NL__, $list72);
        declare_cb_boolean_global($cb_show_cyclify_button$, $list74);
        declare_cb_boolean_global($cb_enable_inference_monitoring$, $list76);
        declare_cb_boolean_global($cb_separate_doc_frame$, $list78);
        declare_cb_boolean_global($cb_more_assertion_marker_image_text$, $list80);
        declare_cb_boolean_global($sym81$_CB_FAST__, $list82);
        declare_cb_boolean_global($cb_search_autocomplete_enabled$, $list84);
        declare_cb_boolean_global($cb_use_frames$, $list86);
        declare_cb_boolean_global($cb_script_mode$, $list88);
        declare_cb_boolean_global($cb_hoverover_enabled$, $list91);
        declare_cb_boolean_global($cb_a_show_el_formula$, $list93);
        declare_cb_boolean_global($cb_a_show_hl_formula$, $list95);
        declare_cb_boolean_global($cb_a_show_english$, $list97);
        declare_cb_boolean_global($cb_a_perform_access_diagnostics$, $list99);
        declare_cb_boolean_global($sym100$_CB_A_EDIT_PRESERVE_META_ASSERTIONS_BY_DEFAULT__, $list101);
        declare_cb_boolean_global($sym102$_CB_A_CHANGE_ALL_META_ASSERTIONS_MT_BY_DEFAULT__, $list103);
        declare_cb_boolean_global($sym104$_CB_USE_CATEGORIZED_HISTORY__, $list105);
        declare_cb_boolean_global($sym106$_CB_HISTORY_SHOW_EL_FORMULAS__, $list107);
        declare_cb_boolean_global($sym108$_ASSUME_CYC_CYCLIST_DIALOG__, $list109);
        declare_cb_boolean_global($sym110$_GENERATED_PHRASES_BROWSABLE__, $list111);
        declare_cb_boolean_global($sym112$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__, $list113);
        declare_cb_boolean_global($sym114$_SHOW_FET_EDIT_BUTTONS__, $list115);
        declare_cb_boolean_global($sym116$_SHOW_FET_CREATE_INSTANCE_BUTTONS__, $list117);
        declare_cb_boolean_global($sym118$_SHOW_FET_CREATE_SPEC_BUTTONS__, $list119);
        declare_cb_boolean_global($cb_show_followup_widget$, $list121);
        declare_cb_boolean_global($sym122$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__, $list123);
        declare_cb_boolean_global($sym124$_CB_SKOLEM_APPLICABLE_RELATIONS__, $list125);
        declare_cb_boolean_global($sym126$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__, $list127);
        declare_cb_boolean_global($sym128$_CB_PARAPHRASE_APPLICABLE_RELATIONS__, $list129);
        declare_cb_boolean_global($use_sme_lexwiz$, $list131);
        sethash($CB_OPTIONS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str134$cb_options_html, NIL));
        html_macros.note_cgi_handler_function(CB_OPTIONS, $HTML_HANDLER);
        register_macro_helper(CB_OPTION_WITH_TITLE_ONLY, CB_OPTION_WITH_TITLE_ONLY);
        register_macro_helper(CB_OPTION_WITH_TITLE_AND_HOVEROVER, CB_OPTION_WITH_TITLE);
        declare_cb_boolean_global($sym267$_CB_PROOF_VIEW_SHOW_BUG_REPORT_LINKS__, $list268);
        html_macros.note_cgi_handler_function(CB_OPTIONS_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($OPTIONS, CB_LINK_OPTIONS, ONE_INTEGER);
        declare_cb_tool($OPTIONS, $$$Preferences, $$$Prefs, $$$Browser_Preferences);
        html_macros.note_cgi_handler_function(CB_HISTORY, $HTML_HANDLER);
        sethash($CB_HISTORY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str335$cb_history_html, NIL));
        register_html_state_variable($cb_use_css_columns_for_categories$);
        sethash($HISTORY, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str394$history_tool_gif, NIL));
        setup_cb_link_method($HISTORY, CB_LINK_HISTORY, TWO_INTEGER);
        declare_cb_tool($HISTORY, $$$History, $$$Hist, $$$Recent_Browser_History);
        html_macros.note_cgi_handler_function(CB_CLEAR_HISTORY, $HTML_HANDLER);
        setup_cb_link_method($CLEAR_HISTORY, CB_LINK_CLEAR_HISTORY, ONE_INTEGER);
        setup_cb_link_method($CLEAR_CONSTANT_HISTORY, CB_LINK_CLEAR_CONSTANT_HISTORY, TWO_INTEGER);
        setup_cb_link_method($CLEAR_NAT_HISTORY, CB_LINK_CLEAR_NAT_HISTORY, ONE_INTEGER);
        setup_cb_link_method($CLEAR_ASSERTION_HISTORY, CB_LINK_CLEAR_ASSERTION_HISTORY, ONE_INTEGER);
        setup_cb_link_method($CLEAR_SENTENCE_HISTORY, CB_LINK_CLEAR_SENTENCE_HISTORY, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_HISTORY_EL_FORMULAS, $HTML_HANDLER);
        setup_cb_link_method($HISTORY_EL_FORMULAS, CB_LINK_HISTORY_EL_FORMULAS, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_HISTORY_HL_FORMULAS, $HTML_HANDLER);
        setup_cb_link_method($HISTORY_HL_FORMULAS, CB_LINK_HISTORY_HL_FORMULAS, ONE_INTEGER);
        memoization_state.note_globally_cached_function(CB_BOOKMARKED_ITEMS);
        html_macros.note_cgi_handler_function(CB_RECENT_KB_ADDITIONS, $HTML_HANDLER);
        setup_cb_link_method($RECENT_KB_ADDITIONS, CB_LINK_RECENT_KB_ADDITIONS, ONE_INTEGER);
        cyc_navigator_internals.def_navigator_link($RECENT_KB_ADDITIONS, $TEXT, $list481, $str462$cb_recent_kb_additions, ZERO_INTEGER, $MAIN, $$$Recently_Added_KB_Content, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_macros.note_cgi_handler_function(CB_HANDLE_INTERACTOR, $HTML_HANDLER);
        sethash($CB_HANDLE_INTERACTOR, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str491$cb_handle_interactor_html, NIL));
        setup_cb_link_method($INTERACTOR, CB_LINK_INTERACTOR, ONE_INTEGER);
        declare_cb_tool($INTERACTOR, $$$Interactor, $$$SubL, $$$SubL_Interactor);
        register_html_state_variable($html_state_filename$);
        html_macros.note_cgi_handler_function(CB_LOAD_USER_PREFERENCES, $HTML_HANDLER);
        sethash($CB_LOAD_API, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str527$cb_load_api_html, NIL));
        html_macros.note_cgi_handler_function(CB_LOAD_API, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_LOAD_API_HANDLER, $HTML_HANDLER);
        sethash($CB_SHOW_WHEN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str555$cb_show_when_html, NIL));
        html_macros.note_cgi_handler_function(CB_SHOW_WHEN, $HTML_HANDLER);
        sethash($CB_SHOW_WHEN_HANDLER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str582$cb_show_when_handler_html, NIL));
        html_macros.note_cgi_handler_function(CB_SHOW_WHEN_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($SHOW_WHEN, CB_LINK_SHOW_WHEN, ONE_INTEGER);
        declare_cb_tool($SHOW_WHEN, $$$When, $$$When, $str621$Display_assertions_constants_by_d);
        sethash($CB_INDEX_OVERLAP, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str623$cb_index_overlap_html, NIL));
        html_macros.note_cgi_handler_function(CB_INDEX_OVERLAP, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_INDEX_OVERLAP, $HTML_HANDLER);
        setup_cb_link_method($INDEX_OVERLAP, CB_LINK_INDEX_OVERLAP, ONE_INTEGER);
        declare_cb_tool($INDEX_OVERLAP, $$$Overlap, $$$Ovlp, $$$Term_Index_Overlap);
        setup_cb_link_method($OWL_IMPORT, CB_LINK_OWL_IMPORT, ONE_INTEGER);
        declare_cb_tool($OWL_IMPORT, $$$OWL_Import, $str654$OWL_I, $$$OWL_Ontology_Importer);
        setup_cb_link_method($OWL_EXPORT, CB_LINK_OWL_EXPORT, ONE_INTEGER);
        declare_cb_tool($OWL_EXPORT, $$$OWL_Export, $str660$OWL_E, $$$OWL_Ontology_Exporter);
        sethash($COMPOSE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str663$compose_tool_gif, NIL));
        setup_cb_link_method($COMPOSE, CB_LINK_COMPOSE, ONE_INTEGER);
        declare_cb_tool($COMPOSE, $$$Compose_KE_Text, $$$Comp, $$$Compose_KE_Text);
        setup_cb_link_method($NAVIGATOR, CB_LINK_NAVIGATOR, ONE_INTEGER);
        declare_cb_tool($NAVIGATOR, $$$Navigator, $$$Nav, $$$Cyc_Navigator);
        sethash($DOC, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str676$doc_tool_gif, $str677$_Doc_));
        setup_cb_link_method($DOC, CB_LINK_DOC, ONE_INTEGER);
        declare_cb_tool($DOC, $$$Documentation, $$$Doc, $$$Cyc_Documentation);
        setup_cb_link_method($KB_MONITOR_INDEX_HOOK, CB_LINK_KB_MONITOR_INDEX_HOOK, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_JSTACK_TRACE, $HTML_HANDLER);
        setup_cb_link_method($JSTACK_TRACE, CB_LINK_JSTACK_TRACE, ONE_INTEGER);
        cyc_navigator_internals.def_navigator_link($JSTACK_TRACE, $TEXT, $list702, $str703$cb_jstack_trace, ZERO_INTEGER, $MAIN, $$$JRTL_jstack_Trace, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_tools_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_tools_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_tools_file();
    }

    static {






















































































































































































































































































































































































































































































































































































































































































































































    }
}

/**
 * Total time: 5872 ms
 */
