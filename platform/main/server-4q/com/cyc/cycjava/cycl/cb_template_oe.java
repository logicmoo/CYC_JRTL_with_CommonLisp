package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_message_page_with_history;
import static com.cyc.cycjava.cycl.cb_utilities.cb_string_for_mt;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_br;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.browser.cb_inference_browser;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.browser.cb_query_browser;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_template_oe extends SubLTranslatedFile {
    public static final SubLFile me = new cb_template_oe();

    public static final String myName = "com.cyc.cycjava.cycl.cb_template_oe";

    public static final String myFingerPrint = "4333967550a10def3d0ada32b2f9913834d3c42253bcb62e1e58080caca732bf";

    // defparameter
    public static final SubLSymbol $template_query_show_answer_count$ = makeSymbol("*TEMPLATE-QUERY-SHOW-ANSWER-COUNT*");

    // defparameter
    public static final SubLSymbol $cb_toe_resulting_forms_abbreviation_cutoff$ = makeSymbol("*CB-TOE-RESULTING-FORMS-ABBREVIATION-CUTOFF*");



    private static final SubLString $str1$cb_toe_html = makeString("cb-toe.html");

    private static final SubLString $str2$Template_OE__Query_Specification = makeString("Template OE: Query Specification");

    private static final SubLString $str3$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str4$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str9$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    public static final SubLString $str15$cb_handle_template_oe = makeString("cb-handle-template-oe");

    public static final SubLString $$$Clear_All_Fields = makeString("Clear All Fields");

    public static final SubLString $$$Run_Query = makeString("Run Query");

    public static final SubLString $str18$query_test = makeString("query-test");

    public static final SubLString $str19$cb_toe_parameters = makeString("cb-toe-parameters");

    public static final SubLString $$$Show = makeString("Show");

    public static final SubLString $$$Hide = makeString("Hide");

    public static final SubLString $$$Query_Context = makeString("Query Context");





    public static final SubLList $list25 = list(makeKeyword("ANYTIME-PSC-ALLOWED?"), NIL);

    public static final SubLList $list26 = list(new SubLObject[]{ makeKeyword("INPUT-NAME"), makeString("query-sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TEN_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });

    public static final SubLString $str27$Available_Templates_ = makeString("Available Templates:");

    public static final SubLString $$$Assert = makeString("Assert");

    public static final SubLString $str29$template_assert = makeString("template-assert");

    public static final SubLString $$$Unassert = makeString("Unassert");

    public static final SubLString $str31$template_unassert = makeString("template-unassert");

    public static final SubLString $$$Edit = makeString("Edit");

    public static final SubLString $str33$template_edit = makeString("template-edit");

    public static final SubLString $$$Kill = makeString("Kill");

    public static final SubLString $str35$template_kill = makeString("template-kill");

    public static final SubLString $$$Blast = makeString("Blast");

    public static final SubLString $str37$template_blast = makeString("template-blast");

    private static final SubLString $$$Repropagate = makeString("Repropagate");

    private static final SubLString $str39$template_repropagate = makeString("template-repropagate");

    private static final SubLString $str40$_Template_OE_ = makeString("[Template OE]");





    private static final SubLString $str43$cb_toe_inference__A = makeString("cb-toe-inference&~A");

    private static final SubLSymbol $TEMPLATE_OE_INFERENCE = makeKeyword("TEMPLATE-OE-INFERENCE");

    private static final SubLSymbol CB_LINK_TEMPLATE_OE_INFERENCE = makeSymbol("CB-LINK-TEMPLATE-OE-INFERENCE");

    private static final SubLList $list46 = list(makeSymbol("INFERENCE-IDENTIFIER"));

    private static final SubLString $str47$That_inference_is_no_longer_avail = makeString("That inference is no longer available.");

    private static final SubLSymbol CB_TOE_INFERENCE = makeSymbol("CB-TOE-INFERENCE");



    private static final SubLString $str50$Template_OE__Inference = makeString("Template OE: Inference");

    private static final SubLString $$$inference = makeString("inference");

    private static final SubLList $list52 = list(makeSymbol("HANDLER"), makeSymbol("LABEL"));

    private static final SubLSymbol $TEMPLATE_OE_INFERENCE_HANDLER = makeKeyword("TEMPLATE-OE-INFERENCE-HANDLER");

    private static final SubLList $list54 = list(list(makeString("template-assert"), makeString("[Assert]")), list(makeString("template-unassert"), makeString("[Unassert]")), list(makeString("template-edit"), makeString("[Edit]")), list(makeString("template-kill"), makeString("[Kill]")), list(makeString("template-blast"), makeString("[Blast]")), list(makeString("template-repropagate"), makeString("[Repropagate]")), list(makeString("template-redo-tms"), makeString("[Redo TMS]")));

    private static final SubLString $str55$Inference___ = makeString("Inference : ");



    private static final SubLString $str57$_Refresh_ = makeString("[Refresh]");



    private static final SubLString $str59$template_redo_tms = makeString("template-redo-tms");

    private static final SubLString $str60$Submission_was_not_understood_ = makeString("Submission was not understood.");

    private static final SubLSymbol CB_HANDLE_TEMPLATE_OE = makeSymbol("CB-HANDLE-TEMPLATE-OE");

    private static final SubLString $str62$cb_handle_template_oe__A__A_infer = makeString("cb-handle-template-oe&~A=~A&inference=~A");

    private static final SubLSymbol CB_LINK_TEMPLATE_OE_INFERENCE_HANDLER = makeSymbol("CB-LINK-TEMPLATE-OE-INFERENCE-HANDLER");

    private static final SubLSymbol CB_TEMPLATE_ASSERT = makeSymbol("CB-TEMPLATE-ASSERT");

    private static final SubLSymbol CB_TEMPLATE_UNASSERT = makeSymbol("CB-TEMPLATE-UNASSERT");

    private static final SubLSymbol CB_TEMPLATE_EDIT = makeSymbol("CB-TEMPLATE-EDIT");

    private static final SubLString $$$kill = makeString("kill");

    private static final SubLSymbol CB_TEMPLATE_KILL = makeSymbol("CB-TEMPLATE-KILL");

    private static final SubLSymbol CB_TEMPLATE_BLAST = makeSymbol("CB-TEMPLATE-BLAST");

    private static final SubLSymbol CB_TEMPLATE_REPROPAGATE = makeSymbol("CB-TEMPLATE-REPROPAGATE");

    private static final SubLSymbol CB_TEMPLATE_REDO_TMS = makeSymbol("CB-TEMPLATE-REDO-TMS");

    private static final SubLSymbol CB_TEMPLATE_CHANGE_ASSERTION_PROPERTIES = makeSymbol("CB-TEMPLATE-CHANGE-ASSERTION-PROPERTIES");

    private static final SubLSymbol CB_TEMPLATE_MERGE = makeSymbol("CB-TEMPLATE-MERGE");

    private static final SubLString $str74$Template_OE__Query_Results = makeString("Template OE: Query Results");

    private static final SubLString $str75$Template_OE__Assert = makeString("Template OE: Assert");

    private static final SubLString $str76$cb_handle_template_assert = makeString("cb-handle-template-assert");

    private static final SubLString $$$Assert_Specification = makeString("Assert Specification");

    private static final SubLString $$$Run_Template_Assert = makeString("Run Template Assert");

    private static final SubLString $$$assert = makeString("assert");

    private static final SubLSymbol CB_HANDLE_TEMPLATE_ASSERT = makeSymbol("CB-HANDLE-TEMPLATE-ASSERT");

    private static final SubLString $str81$Template_OE__Unassert = makeString("Template OE: Unassert");

    private static final SubLString $str82$cb_handle_template_unassert = makeString("cb-handle-template-unassert");

    private static final SubLString $$$Unassert_Specification = makeString("Unassert Specification");

    private static final SubLString $$$Run_Template_Unassert = makeString("Run Template Unassert");

    private static final SubLString $$$unassert = makeString("unassert");

    private static final SubLSymbol CB_HANDLE_TEMPLATE_UNASSERT = makeSymbol("CB-HANDLE-TEMPLATE-UNASSERT");

    private static final SubLString $str87$Template_OE__Edit = makeString("Template OE: Edit");

    private static final SubLString $str88$cb_handle_template_edit = makeString("cb-handle-template-edit");

    private static final SubLString $$$Edit_Specification = makeString("Edit Specification");

    private static final SubLString $$$Run_Template_Edit = makeString("Run Template Edit");

    private static final SubLString $$$edit = makeString("edit");

    private static final SubLList $list92 = list(makeKeyword("INPUT-NAME"), makeString("query-sentence"));

    private static final SubLString $str93$mt_monad = makeString("mt-monad");

    private static final SubLSymbol CB_HANDLE_TEMPLATE_EDIT = makeSymbol("CB-HANDLE-TEMPLATE-EDIT");

    private static final SubLString $str95$Template_OE__Blast = makeString("Template OE: Blast");

    private static final SubLString $str96$cb_handle_template_blast = makeString("cb-handle-template-blast");

    private static final SubLString $$$Blast_Specification = makeString("Blast Specification");

    private static final SubLString $$$Run_Template_Blast = makeString("Run Template Blast");

    private static final SubLString $$$blast = makeString("blast");

    private static final SubLSymbol CB_HANDLE_TEMPLATE_BLAST = makeSymbol("CB-HANDLE-TEMPLATE-BLAST");

    private static final SubLString $str101$Template_OE__Repropagate = makeString("Template OE: Repropagate");

    private static final SubLString $str102$cb_handle_template_repropagate = makeString("cb-handle-template-repropagate");

    private static final SubLString $$$Repropagate_Specification = makeString("Repropagate Specification");

    private static final SubLString $$$Run_Template_Repropagate = makeString("Run Template Repropagate");

    private static final SubLString $$$repropagate = makeString("repropagate");

    private static final SubLSymbol CB_HANDLE_TEMPLATE_REPROPAGATE = makeSymbol("CB-HANDLE-TEMPLATE-REPROPAGATE");

    private static final SubLString $str107$Template_OE__Redo_TMS = makeString("Template OE: Redo TMS");

    private static final SubLString $str108$cb_handle_template_redo_tms = makeString("cb-handle-template-redo-tms");

    private static final SubLString $$$Redo_TMS_Specification = makeString("Redo TMS Specification");

    private static final SubLString $$$Run_Template_Redo_TMS = makeString("Run Template Redo TMS");

    private static final SubLString $str111$redo_tms = makeString("redo-tms");

    private static final SubLSymbol CB_HANDLE_TEMPLATE_REDO_TMS = makeSymbol("CB-HANDLE-TEMPLATE-REDO-TMS");

    private static final SubLString $$$template = makeString("template");

    private static final SubLList $list114 = list(makeString("unassert"), makeString("blast"), makeString("repropagate"), makeString("redo-tms"));



    private static final SubLString $str116$_sentence = makeString("-sentence");

    private static final SubLString $str117$_mt = makeString("-mt");



    private static final SubLList $list119 = list(makeKeyword("ALLOW-VARIABLE?"), T);

    private static final SubLString $str120$query_spec = makeString("query-spec");

    private static final SubLString $str121$query_mt = makeString("query-mt");



    private static final SubLSymbol KE_KILL = makeSymbol("KE-KILL");

    private static final SubLSymbol KE_ASSERT = makeSymbol("KE-ASSERT");



    private static final SubLSymbol KE_UNASSERT = makeSymbol("KE-UNASSERT");



    private static final SubLSymbol KE_REPROPAGATE_ASSERTION = makeSymbol("KE-REPROPAGATE-ASSERTION");

    private static final SubLSymbol FIND_ASSERTION_CYCL = makeSymbol("FIND-ASSERTION-CYCL");

    private static final SubLSymbol KE_TMS_RECONSIDER_ASSERTION = makeSymbol("KE-TMS-RECONSIDER-ASSERTION");









    private static final SubLString $$$Current_ = makeString("Current ");

    private static final SubLString $$$_Template_in_ = makeString(" Template in ");

    private static final SubLString $str137$__ = makeString(" :");

    private static final SubLString $$$Submission_was_not_understood = makeString("Submission was not understood");

    private static final SubLList $list139 = list(makeKeyword("SUMMARY-FN"), makeSymbol("CB-TOE-OPERATIONS-SUMMARY"), makeKeyword("DISPLAY-FN"), makeSymbol("CB-TOE-OPERATIONS-DISPLAY"), makeKeyword("HANDLER-FN"), makeSymbol("CB-TOE-OPERATIONS-HANDLER"));

    private static final SubLString $$$Evaluate_ = makeString("Evaluate ");

    private static final SubLString $$$_forms_from_ = makeString(" forms from ");

    private static final SubLString $$$_template_ = makeString(" template ");

    private static final SubLString $$$_in_ = makeString(" in ");

    private static final SubLString $$$_with_bindings_from_ = makeString(" with bindings from ");

    private static final SubLString $$$_with_query = makeString(" with query");

    private static final SubLList $list146 = list(makeSymbol("QUERY"), makeSymbol("MT"));

    private static final SubLString $$$query_ = makeString("query ");

    private static final SubLSymbol $CB_TOE_TEMPLATE_RESULTS = makeKeyword("CB-TOE-TEMPLATE-RESULTS");

    private static final SubLString $str149$cb_toe_template_results_html = makeString("cb-toe-template-results.html");

    private static final SubLString $str150$Template_OE__Resulting_Forms = makeString("Template OE: Resulting Forms");

    private static final SubLString $str151$cb_toe_operations_handler = makeString("cb-toe-operations-handler");

    private static final SubLString $str152$id_string = makeString("id-string");

    private static final SubLString $str153$Current_Inference___ = makeString("Current Inference : ");

    private static final SubLString $$$Current_query = makeString("Current query");

    private static final SubLSymbol CB_TOE_OPERATIONS_DISPLAY = makeSymbol("CB-TOE-OPERATIONS-DISPLAY");



    private static final SubLString $$$Add_Forms_to_Agenda = makeString("Add Forms to Agenda");

    private static final SubLString $$$boxes = makeString("boxes");

    private static final SubLString $str159$100_ = makeString("100%");

    private static final SubLString $str160$OK_ = makeString("OK?");

    private static final SubLString $str161$_2 = makeString("+2");

    private static final SubLString $str162$Operations_ = makeString("Operations:");

    private static final SubLString $str163$Below_forms_abbreviated__no_links = makeString("Below forms abbreviated (no links) since there are more than ");

    private static final SubLString $str164$_of_them_ = makeString(" of them.");

    private static final SubLString $str165$_dddddd = makeString("#dddddd");

    private static final SubLString $str166$_cccccc = makeString("#cccccc");



    private static final SubLString $str168$_Check_All_ = makeString("[Check All]");

    private static final SubLString $str169$this_document_forms_0_ = makeString("this.document.forms[0]");

    private static final SubLString $str170$__ = makeString(".*");

    private static final SubLString $$$T = makeString("T");

    private static final SubLString $str172$_Uncheck_All_ = makeString("[Uncheck All]");

    private static final SubLString $$$NIL = makeString("NIL");

    private static final SubLString $str174$_A = makeString("~A");

    private static final SubLString $str175$TOE__Forms_Added_to_Agenda = makeString("TOE: Forms Added to Agenda");

    private static final SubLSymbol CB_TOE_OPERATIONS_HANDLER = makeSymbol("CB-TOE-OPERATIONS-HANDLER");

    private static final SubLString $str177$_S = makeString("~S");

    private static final SubLString $$$strength = makeString("strength");

    private static final SubLString $$$direction = makeString("direction");

    private static final SubLList $list180 = list(new SubLObject[]{ makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TEN_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });

    private static final SubLString $str181$Template_OE__Error = makeString("Template OE: Error");

    private static final SubLString $$$Cyc_Error = makeString("Cyc Error");

    private static final SubLString $str183$The_Mt_you_have_entered_is_invali = makeString("The Mt you have entered is invalid.");

    public static SubLObject cb_toe_query() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str2$Template_OE__Query_Specification;
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
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
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
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
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
                            html_hidden_input($str15$cb_handle_template_oe, T, UNPROVIDED);
                            cb_help_preamble($CB_TOE, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_reset_input($$$Clear_All_Fields);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Run_Query, $str18$query_test, UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            dhtml_macros.dhtml_switch_visibility_links($str19$cb_toe_parameters, $$$Show, $$$Hide);
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($$$Query_Context);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            final SubLObject initial_visibility = $INVISIBLE;
                            dhtml_macros.dhtml_set_switched_visibility($str19$cb_toe_parameters, initial_visibility, $PARAGRAPH);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str19$cb_toe_parameters);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form_widgets.cb_mt_input_section(NIL, $list25);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_form_widgets.cb_el_sentence_input_section(NIL, $list26);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str27$Available_Templates_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_submit_input($$$Assert, $str29$template_assert, UNPROVIDED);
                            html_submit_input($$$Unassert, $str31$template_unassert, UNPROVIDED);
                            html_submit_input($$$Edit, $str33$template_edit, UNPROVIDED);
                            html_submit_input($$$Kill, $str35$template_kill, UNPROVIDED);
                            html_submit_input($$$Blast, $str37$template_blast, UNPROVIDED);
                            html_submit_input($$$Repropagate, $str39$template_repropagate, UNPROVIDED);
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

    public static SubLObject cb_link_template_oe_inference(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str40$_Template_OE_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str43$cb_toe_inference__A, cb_query.cb_inference_identifier(inference));
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

    public static SubLObject cb_toe_inference(final SubLObject args) {
        SubLObject inference_identifier = NIL;
        destructuring_bind_must_consp(args, args, $list46);
        inference_identifier = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list46);
            return NIL;
        }
        final SubLObject inference = cb_query.cb_guess_inference_from_identifier(inference_identifier);
        if (NIL == inference_datastructures_inference.inference_p(inference)) {
            return cb_error($str47$That_inference_is_no_longer_avail, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_toe_inference_guts(inference);
    }

    public static SubLObject cb_toe_inference_guts(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str50$Template_OE__Inference;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
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
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
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
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str15$cb_handle_template_oe, T, UNPROVIDED);
                            cb_help_preamble($CB_TOE, UNPROVIDED, UNPROVIDED);
                            html_hidden_input($$$inference, cb_query.cb_inference_identifier(inference), UNPROVIDED);
                            html_indent(UNPROVIDED);
                            cb_show_template_query_inference(inference, $TEMPLATE_OE_INFERENCE);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str27$Available_Templates_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            SubLObject cdolist_list_var = $list54;
                            SubLObject handler_info = NIL;
                            handler_info = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = handler_info;
                                SubLObject handler = NIL;
                                SubLObject label = NIL;
                                destructuring_bind_must_consp(current, datum, $list52);
                                handler = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list52);
                                label = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    cb_link($TEMPLATE_OE_INFERENCE_HANDLER, inference, handler, label, UNPROVIDED, UNPROVIDED);
                                    html_indent(TWO_INTEGER);
                                } else {
                                    cdestructuring_bind_error(datum, $list52);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                handler_info = cdolist_list_var.first();
                            } 
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_query.cb_show_query_answer_section(inference, $template_query_show_answer_count$.getDynamicValue(thread));
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_show_template_query_inference(final SubLObject inference, SubLObject refresh_link) {
        if (refresh_link == UNPROVIDED) {
            refresh_link = NIL;
        }
        html_princ_strong($str55$Inference___);
        cb_link($INFERENCE, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != refresh_link) {
            html_indent(FOUR_INTEGER);
            cb_link(refresh_link, inference, $str57$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_newline(UNPROVIDED);
        html_newline(UNPROVIDED);
        cb_query.cb_show_inference_status_section(inference, $DISABLED);
        html_newline(TWO_INTEGER);
        cb_query_browser.cb_show_inference_el_query(inference, UNPROVIDED);
        return inference;
    }

    public static SubLObject cb_handle_template_oe(final SubLObject args) {
        if (NIL != html_extract_input($str18$query_test, args)) {
            return cb_handle_toe_test_query(args);
        }
        if (NIL != html_extract_input($str29$template_assert, args)) {
            return cb_template_assert(args);
        }
        if (NIL != html_extract_input($str31$template_unassert, args)) {
            return cb_template_unassert(args);
        }
        if (NIL != html_extract_input($str33$template_edit, args)) {
            return cb_template_edit(args);
        }
        if (NIL != html_extract_input($str35$template_kill, args)) {
            return cb_template_kill(args);
        }
        if (NIL != html_extract_input($str37$template_blast, args)) {
            return cb_template_blast(args);
        }
        if (NIL != html_extract_input($str39$template_repropagate, args)) {
            return cb_template_repropagate(args);
        }
        if (NIL != html_extract_input($str59$template_redo_tms, args)) {
            return cb_template_redo_tms(args);
        }
        return cb_error($str60$Submission_was_not_understood_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_link_template_oe_inference_handler(final SubLObject inference, final SubLObject handler, final SubLObject label) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str62$cb_handle_template_oe__A__A_infer, new SubLObject[]{ handler, label, cb_query.cb_inference_identifier(inference) });
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
            html_princ(label);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_template_assert(final SubLObject args) {
        return cb_template_assert_internals(args);
    }

    public static SubLObject cb_template_unassert(final SubLObject args) {
        return cb_template_unassert_internals(args);
    }

    public static SubLObject cb_template_edit(final SubLObject args) {
        return cb_template_edit_internals(args);
    }

    public static SubLObject cb_template_kill(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = NIL;
        thread.resetMultipleValues();
        final SubLObject query_formula = cb_get_ask_from_args(args);
        final SubLObject query_mt = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject query_spec_and_mt_list = (NIL != inference) ? inference : list(query_formula, query_mt);
        template = list($$$kill, query_spec_and_mt_list);
        return cb_handle_template_output(template);
    }

    public static SubLObject cb_template_blast(final SubLObject args) {
        return cb_template_blast_internals(args);
    }

    public static SubLObject cb_template_repropagate(final SubLObject args) {
        return cb_template_repropagate_internals(args);
    }

    public static SubLObject cb_template_redo_tms(final SubLObject args) {
        return cb_template_redo_tms_internals(args);
    }

    public static SubLObject cb_template_change_assertion_properties(final SubLObject args) {
        return NIL;
    }

    public static SubLObject cb_template_merge(final SubLObject args) {
        return NIL;
    }

    public static SubLObject cb_handle_toe_test_query(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject query_formula = cb_get_ask_from_args(args);
        final SubLObject query_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
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
            html_princ($str74$Template_OE__Query_Results);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_princ($str74$Template_OE__Query_Results);
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        cb_query.cb_new_cyc_query(query_formula, query_mt, UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$12, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_template_assert_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str75$Template_OE__Assert;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$15 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
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
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str76$cb_handle_template_assert, T, UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit($$$Assert_Specification, $$$Run_Template_Assert, $$$assert);
                            cb_show_template_input_area(T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
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
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$15, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_handle_template_assert(final SubLObject args) {
        return cb_handle_template_internals(args, $$$assert);
    }

    public static SubLObject cb_template_unassert_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str81$Template_OE__Unassert;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$21 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
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
                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str82$cb_handle_template_unassert, T, UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit($$$Unassert_Specification, $$$Run_Template_Unassert, $$$unassert);
                            cb_show_template_input_area(NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$21, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$20, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_handle_template_unassert(final SubLObject args) {
        return cb_handle_template_internals(args, $$$unassert);
    }

    public static SubLObject cb_template_edit_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str87$Template_OE__Edit;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$25 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$26 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
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
                        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str88$cb_handle_template_edit, T, UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit($$$Edit_Specification, $$$Run_Template_Edit, $$$edit);
                            final SubLObject default_sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list92);
                            final SubLObject default_mt_string = html_extract_input($str93$mt_monad, args);
                            final SubLObject default_mt = (NIL != string_utilities.non_empty_stringP(default_mt_string)) ? cb_assertion_editor.cb_extract_mt_from_string(default_mt_string) : NIL;
                            cb_show_template_input_area(T, default_sentence, default_mt, UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$26, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$25, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_handle_template_edit(final SubLObject args) {
        return cb_handle_template_internals(args, $$$edit);
    }

    public static SubLObject cb_template_blast_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str95$Template_OE__Blast;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$30 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$31 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
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
                        final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str96$cb_handle_template_blast, T, UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit($$$Blast_Specification, $$$Run_Template_Blast, $$$blast);
                            cb_show_template_input_area(NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$31, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$30, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_handle_template_blast(final SubLObject args) {
        return cb_handle_template_internals(args, $$$blast);
    }

    public static SubLObject cb_template_repropagate_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str101$Template_OE__Repropagate;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$35 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$36 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
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
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str102$cb_handle_template_repropagate, T, UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit($$$Repropagate_Specification, $$$Run_Template_Repropagate, $$$repropagate);
                            cb_show_template_input_area(NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$36, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$35, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_handle_template_repropagate(final SubLObject args) {
        return cb_handle_template_internals(args, $$$repropagate);
    }

    public static SubLObject cb_template_redo_tms_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str107$Template_OE__Redo_TMS;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
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
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
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
                    html_markup($str9$yui_skin_sam);
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
                        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str108$cb_handle_template_redo_tms, T, UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit($$$Redo_TMS_Specification, $$$Run_Template_Redo_TMS, $str111$redo_tms);
                            cb_show_template_input_area(NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
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
        return NIL;
    }

    public static SubLObject cb_handle_template_redo_tms(final SubLObject args) {
        return cb_handle_template_internals(args, $str111$redo_tms);
    }

    public static SubLObject cb_handle_template_internals(final SubLObject args, final SubLObject template_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_spec_and_mt_list = get_list_with_query_spec_and_mt(args);
        SubLObject template_form = NIL;
        SubLObject template_mt = NIL;
        SubLObject mt_fort = NIL;
        SubLObject template = NIL;
        thread.resetMultipleValues();
        final SubLObject template_form_$45 = get_template_form_specs(args, $$$template);
        final SubLObject template_mt_$46 = thread.secondMultipleValue();
        final SubLObject mt_fort_$47 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        template_form = template_form_$45;
        template_mt = template_mt_$46;
        mt_fort = mt_fort_$47;
        if ((NIL != Strings.string_equal(template_type, $$$assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.string_equal(template_type, $$$edit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject template_strength = cb_assertion_editor.cb_extract_strength_and_direction_input(args, UNPROVIDED);
            final SubLObject template_direction = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject template_list = (NIL != mt_fort) ? list(template_form, mt_fort, template_strength, template_direction) : list(template_form, template_mt, template_strength, template_direction);
            template = list(template_type, query_spec_and_mt_list, template_list);
        } else
            if (NIL != subl_promotions.memberP(template_type, $list114, symbol_function(STRING_EQUAL), UNPROVIDED)) {
                template = (NIL != mt_fort) ? list(template_type, query_spec_and_mt_list, list(template_form, mt_fort)) : list(template_type, query_spec_and_mt_list, list(template_form, template_mt));
            }

        return cb_handle_template_output(template);
    }

    public static SubLObject get_template_form_specs(final SubLObject args, SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$template;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_string = cconcatenate(prefix, $str116$_sentence);
        final SubLObject mt_string = cconcatenate(prefix, $str117$_mt);
        thread.resetMultipleValues();
        final SubLObject template_mt = cb_form_widgets.cb_extract_mt_input(args, NIL, listS($INPUT_NAME, mt_string, $list119));
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, list($INPUT_NAME, sentence_string));
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, UNPROVIDED);
        }
        final SubLObject mt_fort = cb_guess_fort(html_extract_input(mt_string, args), UNPROVIDED);
        return values(sentence, template_mt, mt_fort);
    }

    public static SubLObject get_list_with_query_spec_and_mt(final SubLObject args) {
        final SubLObject inference_identifier = html_extract_input($$$inference, args);
        if (NIL != inference_identifier) {
            return cb_query.cb_guess_inference_from_identifier(inference_identifier);
        }
        return list(read_from_string_ignoring_errors(html_extract_input($str120$query_spec, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), cb_assertion_editor.cb_extract_mt_from_string(html_extract_input($str121$query_mt, args)));
    }

    public static SubLObject cb_handle_template_output(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_spec_and_mt_list = second(template);
        SubLObject v_answer = NIL;
        SubLObject suspend_status = NIL;
        SubLObject query = NIL;
        SubLObject mt = NIL;
        if (NIL != inference_datastructures_inference.inference_p(query_spec_and_mt_list)) {
            final SubLObject inference = query_spec_and_mt_list;
            query = inference_datastructures_inference.inference_input_el_query(inference);
            mt = inference_datastructures_inference.inference_input_mt(inference);
            v_answer = inference_kernel.inference_result_from_all_answers(inference);
            suspend_status = inference_datastructures_inference.inference_suspend_status(inference);
        } else {
            query = query_spec_and_mt_list.first();
            mt = second(query_spec_and_mt_list);
            thread.resetMultipleValues();
            final SubLObject v_answer_$48 = inference_kernel.new_cyc_query(query, mt, UNPROVIDED);
            final SubLObject suspend_status_$49 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_answer = v_answer_$48;
            suspend_status = suspend_status_$49;
        }
        final SubLObject id_string = get_toe_template_forms(v_answer, template, suspend_status, query, mt);
        if (NIL != id_string) {
            cb_toe_operations_display(list(id_string));
        }
        return NIL;
    }

    public static SubLObject get_toe_template_forms(final SubLObject v_answer, final SubLObject template, final SubLObject suspend_status, final SubLObject query_form, final SubLObject query_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(suspend_status)) {
            cb_query_browser.cb_show_inference_suspend_status(suspend_status);
            return NIL;
        }
        final SubLObject type = template.first();
        final SubLObject op = third(template);
        SubLObject form = NIL;
        SubLObject mt = NIL;
        SubLObject strength = NIL;
        SubLObject direction = NIL;
        SubLObject current_forms = NIL;
        SubLObject temp_user_action = NIL;
        thread.resetMultipleValues();
        final SubLObject form_$50 = destructure_template_op(op);
        final SubLObject mt_$51 = thread.secondMultipleValue();
        final SubLObject strength_$52 = thread.thirdMultipleValue();
        final SubLObject direction_$53 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        form = form_$50;
        mt = mt_$51;
        strength = strength_$52;
        direction = direction_$53;
        if (((NIL != Strings.string_equal(type, $$$assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.string_equal(type, $$$edit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == strength)) {
            strength = $DEFAULT;
        }
        SubLObject cdolist_list_var = v_answer;
        SubLObject alist = NIL;
        alist = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject temp_form = NIL;
            SubLObject temp_mt = NIL;
            SubLObject constant = NIL;
            SubLObject ke_form = NIL;
            thread.resetMultipleValues();
            final SubLObject temp_form_$54 = template_substitute_in_form(alist, form, mt, type);
            final SubLObject temp_mt_$55 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            temp_form = temp_form_$54;
            temp_mt = temp_mt_$55;
            if (NIL != Strings.string_equal(type, $$$kill, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                constant = temp_form;
                ke_form = list(KE_KILL, constant);
                current_forms = cons(ke_form, current_forms);
            } else
                if (NIL != Strings.string_equal(type, $$$assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    ke_form = list(KE_ASSERT, list(QUOTE, temp_form), list(QUOTE, temp_mt), list(QUOTE, strength), list(QUOTE, direction));
                    current_forms = cons(ke_form, current_forms);
                } else
                    if (NIL != Strings.string_equal(type, $$$unassert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        ke_form = list(KE_UNASSERT, list(QUOTE, temp_form), list(QUOTE, temp_mt));
                        current_forms = cons(ke_form, current_forms);
                    } else
                        if (NIL != Strings.string_equal(type, $$$edit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            thread.resetMultipleValues();
                            final SubLObject unassert_form = template_substitute_in_form(alist, query_form, query_mt, type);
                            final SubLObject unassert_mt = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            ke_form = list(KE_UNASSERT, list(QUOTE, unassert_form), list(QUOTE, unassert_mt));
                            current_forms = cons(ke_form, current_forms);
                            ke_form = list(KE_ASSERT, list(QUOTE, temp_form), list(QUOTE, temp_mt), list(QUOTE, strength), list(QUOTE, direction));
                            current_forms = cons(ke_form, current_forms);
                        } else
                            if (NIL != Strings.string_equal(type, $$$blast, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                ke_form = list(FI_BLAST, list(QUOTE, temp_form), list(QUOTE, temp_mt));
                                current_forms = cons(ke_form, current_forms);
                            } else
                                if (NIL != Strings.string_equal(type, $$$repropagate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    if (NIL != czer_meta.find_assertion_cycl(temp_form, temp_mt)) {
                                        ke_form = list(KE_REPROPAGATE_ASSERTION, list(FIND_ASSERTION_CYCL, list(QUOTE, temp_form), temp_mt));
                                        current_forms = cons(ke_form, current_forms);
                                    }
                                } else
                                    if ((NIL != Strings.string_equal(type, $str111$redo_tms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != czer_meta.find_assertion_cycl(temp_form, temp_mt))) {
                                        ke_form = list(KE_TMS_RECONSIDER_ASSERTION, list(FIND_ASSERTION_CYCL, list(QUOTE, temp_form), temp_mt));
                                        current_forms = cons(ke_form, current_forms);
                                    }






            cdolist_list_var = cdolist_list_var.rest();
            alist = cdolist_list_var.first();
        } 
        current_forms = nreverse(current_forms);
        current_forms = list_utilities.fast_delete_duplicates(current_forms, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        temp_user_action = user_actions.new_user_action(list($CYCLIST, api_control_vars.$the_cyclist$.getDynamicValue(thread), $TYPE_KEY, $TOE_OPERATIONS, $DATA, list(template, current_forms)));
        return user_actions.user_action_id_string(temp_user_action);
    }

    public static SubLObject cb_show_template(final SubLObject template) {
        final SubLObject template_type = template.first();
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($$$Current_);
        html_princ(Strings.string_capitalize(template_type, UNPROVIDED, UNPROVIDED));
        html_princ($$$_Template_in_);
        final SubLObject mt = cb_guess_fort(second(third(template)), UNPROVIDED);
        if (NIL != mt) {
            cb_form(mt, UNPROVIDED, UNPROVIDED);
        } else {
            cb_form(second(third(template)), UNPROVIDED, UNPROVIDED);
        }
        html_princ($str137$__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        if (NIL != Strings.string_equal(template_type, $$$assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        if (NIL != Strings.string_equal(template_type, $$$unassert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        if (NIL != Strings.string_equal(template_type, $$$edit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        if (NIL != Strings.string_equal(template_type, $$$blast, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        if (NIL != Strings.string_equal(template_type, $$$repropagate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        if (NIL != Strings.string_equal(template_type, $str111$redo_tms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        return cb_error($$$Submission_was_not_understood, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_show_assertion_template(final SubLObject template) {
        final SubLObject form = third(template).first();
        cb_form(form, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_toe_operations_summary(final SubLObject user_action_id_string) {
        final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
        final SubLObject template = user_actions.user_action_data(user_action).first();
        final SubLObject type = template.first();
        final SubLObject forms = second(user_actions.user_action_data(user_action));
        html_princ($$$Evaluate_);
        html_princ(length(forms));
        html_princ($$$_forms_from_);
        html_princ(type);
        html_princ($$$_template_);
        if (NIL == Strings.string_equal(type, $$$kill, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            html_newline(UNPROVIDED);
            cb_form(third(template).first(), UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
            html_princ($$$_in_);
            cb_form(second(third(template)), UNPROVIDED, UNPROVIDED);
        }
        html_newline(UNPROVIDED);
        html_princ($$$_with_bindings_from_);
        final SubLObject query_spec_and_mt_list = second(template);
        if (NIL != inference_datastructures_inference.inference_p(query_spec_and_mt_list)) {
            final SubLObject inference = query_spec_and_mt_list;
            cb_form(inference, UNPROVIDED, UNPROVIDED);
            html_princ($$$_with_query);
            html_newline(UNPROVIDED);
            cb_form(inference_datastructures_inference.inference_input_el_query(inference), ZERO_INTEGER, T);
            html_newline(UNPROVIDED);
            html_princ($$$_in_);
            cb_form(inference_datastructures_inference.inference_input_mt(inference), UNPROVIDED, UNPROVIDED);
        } else {
            SubLObject current;
            final SubLObject datum = current = query_spec_and_mt_list;
            SubLObject query = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list146);
            query = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list146);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                html_princ($$$query_);
                html_newline(UNPROVIDED);
                cb_form(query, ZERO_INTEGER, T);
                html_newline(UNPROVIDED);
                html_princ($$$_in_);
                cb_form(mt, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list146);
            }
        }
        return NIL;
    }

    public static SubLObject cb_toe_operations_display(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id_string = args.first();
        final SubLObject user_action = user_actions.user_action_by_id_string(id_string);
        final SubLObject template = user_actions.user_action_data(user_action).first();
        final SubLObject query_spec_and_mt_list = second(template);
        final SubLObject inference = (NIL != inference_datastructures_inference.inference_p(query_spec_and_mt_list)) ? query_spec_and_mt_list : NIL;
        final SubLObject query_formula = (NIL != inference_datastructures_inference.inference_p(query_spec_and_mt_list)) ? NIL : query_spec_and_mt_list.first();
        final SubLObject query_mt = (NIL != inference_datastructures_inference.inference_p(query_spec_and_mt_list)) ? NIL : second(query_spec_and_mt_list);
        final SubLObject forms = second(user_actions.user_action_data(user_action));
        final SubLObject title_var = $str150$Template_OE__Resulting_Forms;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$56 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$57 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
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
                        html_script_utilities.html_set_all_radio_buttons_script();
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
                        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str151$cb_toe_operations_handler, T, UNPROVIDED);
                            html_hidden_input($str152$id_string, id_string, UNPROVIDED);
                            cb_help_preamble($CB_TOE_TEMPLATE_RESULTS, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            if (NIL != inference) {
                                html_princ_strong($str153$Current_Inference___);
                                cb_inference_browser.cb_show_inference_summary(inference);
                            } else {
                                cb_query.cb_show_query(query_formula, query_mt, $$$Current_query);
                            }
                            html_hr(UNPROVIDED, UNPROVIDED);
                            if (NIL == Strings.string_equal(template.first(), $$$kill, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                cb_show_template(template);
                                html_hr(UNPROVIDED, UNPROVIDED);
                            }
                            cb_show_toe_template_results(forms);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$57, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$56, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_show_toe_template_results(final SubLObject forms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total_checkboxes = length(forms);
        html_submit_input($$$Add_Forms_to_Agenda, UNPROVIDED, UNPROVIDED);
        html_hidden_input($$$boxes, total_checkboxes, UNPROVIDED);
        html_newline(TWO_INTEGER);
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
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str159$100_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str160$OK_);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str161$_2);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str162$Operations_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            SubLObject checkbox_number = MINUS_ONE_INTEGER;
            final SubLObject form_count = length(forms);
            SubLObject bgcolor = NIL;
            if (form_count.numG($cb_toe_resulting_forms_abbreviation_cutoff$.getDynamicValue(thread))) {
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(cconcatenate($str163$Below_forms_abbreviated__no_links, new SubLObject[]{ format_nil.format_nil_a_no_copy($cb_toe_resulting_forms_abbreviation_cutoff$.getDynamicValue(thread)), $str164$_of_them_ }));
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            SubLObject color_toggle = NIL;
            SubLObject list_var = NIL;
            SubLObject ke_form = NIL;
            SubLObject ignore_me = NIL;
            list_var = forms;
            ke_form = list_var.first();
            for (ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , ke_form = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                if (NIL != color_toggle) {
                    color_toggle = NIL;
                } else {
                    color_toggle = T;
                }
                bgcolor = (NIL != color_toggle) ? $str165$_dddddd : $str166$_cccccc;
                checkbox_number = add(checkbox_number, ONE_INTEGER);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != bgcolor) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(bgcolor);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_checkbox_input(checkbox_number, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (form_count.numG($cb_toe_resulting_forms_abbreviation_cutoff$.getDynamicValue(thread))) {
                            html_princ(ke_form);
                        } else {
                            cb_form(ke_form, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_script_utilities.html_anchor_set_radio_buttons_to_value($str168$_Check_All_, $str169$this_document_forms_0_, $str170$__, $$$T);
        html_indent(UNPROVIDED);
        html_script_utilities.html_anchor_set_radio_buttons_to_value($str172$_Uncheck_All_, $str169$this_document_forms_0_, $str170$__, $$$NIL);
        return NIL;
    }

    public static SubLObject cb_toe_operations_handler(final SubLObject args) {
        final SubLObject boxstring = html_extract_input($$$boxes, args);
        final SubLObject boxes = read_from_string(boxstring, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject id_string = html_extract_input($str152$id_string, args);
        final SubLObject forms = second(user_actions.user_action_data(user_actions.user_action_by_id_string(id_string)));
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; !i.numGE(boxes); i = number_utilities.f_1X(i)) {
            if (NIL != html_extract_input(format(NIL, $str174$_A, i), args)) {
                eval(nth(i, forms));
            }
        }
        user_actions.delete_user_action(user_actions.user_action_by_id_string(id_string));
        cb_message_page_with_history($str175$TOE__Forms_Added_to_Agenda, T);
        return NIL;
    }

    public static SubLObject destructure_template_op(final SubLObject op) {
        SubLObject form = op.first();
        final SubLObject mt = second(op);
        SubLObject strength = third(op);
        SubLObject direction = fourth(op);
        if (form.isString()) {
            form = read_from_string(form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (strength.isString()) {
            strength = read_from_string(strength, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (direction.isString()) {
            direction = read_from_string(direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return values(form, mt, strength, direction);
    }

    public static SubLObject template_substitute_in_form(final SubLObject alist, final SubLObject form, final SubLObject mt, final SubLObject type) {
        SubLObject temp_form = form;
        SubLObject temp_mt = mt;
        SubLObject cdolist_list_var = alist;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject hl_term = pair.rest();
            final SubLObject v_term = cycl_utilities.hl_to_el(hl_term);
            final SubLObject variable = pair.first();
            if (NIL != Strings.string_equal(type, $$$kill, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                temp_form = list_utilities.quotify(v_term);
            } else {
                temp_mt = subst(v_term, variable, temp_mt, UNPROVIDED, UNPROVIDED);
                temp_form = subst(v_term, variable, temp_form, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return values(temp_form, temp_mt);
    }

    public static SubLObject cb_show_template_query(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject query_formula = cb_get_ask_from_args(args);
        final SubLObject query_mt = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference) {
            html_hidden_input($$$inference, cb_query.cb_inference_identifier(inference), UNPROVIDED);
            cb_show_template_query_inference(inference, UNPROVIDED);
        } else {
            html_hidden_input($str120$query_spec, format(NIL, $str177$_S, query_formula), UNPROVIDED);
            html_hidden_input($str121$query_mt, cb_string_for_mt(query_mt), UNPROVIDED);
            cb_query.cb_show_query(query_formula, query_mt, $$$Current_query);
        }
        return NIL;
    }

    public static SubLObject cb_show_template_query_answers(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject query_formula = cb_get_ask_from_args(args);
        final SubLObject query_mt = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference) {
            html_hr(UNPROVIDED, UNPROVIDED);
            cb_query.cb_show_query_answer_section(inference, $template_query_show_answer_count$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject cb_show_template_specification_and_submit(final SubLObject specification_string, final SubLObject submit_input_label, final SubLObject submit_input_string) {
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(specification_string);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        html_indent(UNPROVIDED);
        html_submit_input(submit_input_label, submit_input_string, UNPROVIDED);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_show_template_input_area(final SubLObject with_strength_and_directionP, SubLObject default_sentence, SubLObject default_mt, SubLObject prefix_string) {
        if (default_sentence == UNPROVIDED) {
            default_sentence = NIL;
        }
        if (default_mt == UNPROVIDED) {
            default_mt = NIL;
        }
        if (prefix_string == UNPROVIDED) {
            prefix_string = $$$template;
        }
        html_newline(UNPROVIDED);
        cb_form_widgets.cb_mt_input_section(default_mt, listS($INPUT_NAME, cconcatenate(prefix_string, $str117$_mt), $list25));
        if (NIL != with_strength_and_directionP) {
            cb_assertion_editor.cb_strength_and_direction_section($$$strength, $$$direction, UNPROVIDED);
        } else {
            html_newline(UNPROVIDED);
        }
        cb_form_widgets.cb_el_sentence_input_section(default_sentence, listS($INPUT_NAME, cconcatenate(prefix_string, $str116$_sentence), $list180));
        return NIL;
    }

    public static SubLObject cb_toe_mt_error_page() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str181$Template_OE__Error;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$71 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$72 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
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
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        final SubLObject size_val = SIX_INTEGER;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($$$Cyc_Error);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_br();
                        html_br();
                        html_princ($str183$The_Mt_you_have_entered_is_invali);
                        html_br();
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$72, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$71, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_get_ask_from_args(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_identifier = html_extract_input($$$inference, args);
        final SubLObject inference = cb_query.cb_guess_inference_from_identifier(inference_identifier);
        if (NIL != inference) {
            return values(NIL, NIL, inference);
        }
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list92);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, UNPROVIDED);
        }
        return values(sentence, mt, NIL);
    }

    public static SubLObject declare_cb_template_oe_file() {
        declareFunction(me, "cb_toe_query", "CB-TOE-QUERY", 0, 0, false);
        declareFunction(me, "cb_link_template_oe_inference", "CB-LINK-TEMPLATE-OE-INFERENCE", 1, 1, false);
        declareFunction(me, "cb_toe_inference", "CB-TOE-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_toe_inference_guts", "CB-TOE-INFERENCE-GUTS", 1, 0, false);
        declareFunction(me, "cb_show_template_query_inference", "CB-SHOW-TEMPLATE-QUERY-INFERENCE", 1, 1, false);
        declareFunction(me, "cb_handle_template_oe", "CB-HANDLE-TEMPLATE-OE", 1, 0, false);
        declareFunction(me, "cb_link_template_oe_inference_handler", "CB-LINK-TEMPLATE-OE-INFERENCE-HANDLER", 3, 0, false);
        declareFunction(me, "cb_template_assert", "CB-TEMPLATE-ASSERT", 1, 0, false);
        declareFunction(me, "cb_template_unassert", "CB-TEMPLATE-UNASSERT", 1, 0, false);
        declareFunction(me, "cb_template_edit", "CB-TEMPLATE-EDIT", 1, 0, false);
        declareFunction(me, "cb_template_kill", "CB-TEMPLATE-KILL", 1, 0, false);
        declareFunction(me, "cb_template_blast", "CB-TEMPLATE-BLAST", 1, 0, false);
        declareFunction(me, "cb_template_repropagate", "CB-TEMPLATE-REPROPAGATE", 1, 0, false);
        declareFunction(me, "cb_template_redo_tms", "CB-TEMPLATE-REDO-TMS", 1, 0, false);
        declareFunction(me, "cb_template_change_assertion_properties", "CB-TEMPLATE-CHANGE-ASSERTION-PROPERTIES", 1, 0, false);
        declareFunction(me, "cb_template_merge", "CB-TEMPLATE-MERGE", 1, 0, false);
        declareFunction(me, "cb_handle_toe_test_query", "CB-HANDLE-TOE-TEST-QUERY", 1, 0, false);
        declareFunction(me, "cb_template_assert_internals", "CB-TEMPLATE-ASSERT-INTERNALS", 1, 0, false);
        declareFunction(me, "cb_handle_template_assert", "CB-HANDLE-TEMPLATE-ASSERT", 1, 0, false);
        declareFunction(me, "cb_template_unassert_internals", "CB-TEMPLATE-UNASSERT-INTERNALS", 1, 0, false);
        declareFunction(me, "cb_handle_template_unassert", "CB-HANDLE-TEMPLATE-UNASSERT", 1, 0, false);
        declareFunction(me, "cb_template_edit_internals", "CB-TEMPLATE-EDIT-INTERNALS", 1, 0, false);
        declareFunction(me, "cb_handle_template_edit", "CB-HANDLE-TEMPLATE-EDIT", 1, 0, false);
        declareFunction(me, "cb_template_blast_internals", "CB-TEMPLATE-BLAST-INTERNALS", 1, 0, false);
        declareFunction(me, "cb_handle_template_blast", "CB-HANDLE-TEMPLATE-BLAST", 1, 0, false);
        declareFunction(me, "cb_template_repropagate_internals", "CB-TEMPLATE-REPROPAGATE-INTERNALS", 1, 0, false);
        declareFunction(me, "cb_handle_template_repropagate", "CB-HANDLE-TEMPLATE-REPROPAGATE", 1, 0, false);
        declareFunction(me, "cb_template_redo_tms_internals", "CB-TEMPLATE-REDO-TMS-INTERNALS", 1, 0, false);
        declareFunction(me, "cb_handle_template_redo_tms", "CB-HANDLE-TEMPLATE-REDO-TMS", 1, 0, false);
        declareFunction(me, "cb_handle_template_internals", "CB-HANDLE-TEMPLATE-INTERNALS", 2, 0, false);
        declareFunction(me, "get_template_form_specs", "GET-TEMPLATE-FORM-SPECS", 1, 1, false);
        declareFunction(me, "get_list_with_query_spec_and_mt", "GET-LIST-WITH-QUERY-SPEC-AND-MT", 1, 0, false);
        declareFunction(me, "cb_handle_template_output", "CB-HANDLE-TEMPLATE-OUTPUT", 1, 0, false);
        declareFunction(me, "get_toe_template_forms", "GET-TOE-TEMPLATE-FORMS", 5, 0, false);
        declareFunction(me, "cb_show_template", "CB-SHOW-TEMPLATE", 1, 0, false);
        declareFunction(me, "cb_show_assertion_template", "CB-SHOW-ASSERTION-TEMPLATE", 1, 0, false);
        declareFunction(me, "cb_toe_operations_summary", "CB-TOE-OPERATIONS-SUMMARY", 1, 0, false);
        declareFunction(me, "cb_toe_operations_display", "CB-TOE-OPERATIONS-DISPLAY", 1, 0, false);
        declareFunction(me, "cb_show_toe_template_results", "CB-SHOW-TOE-TEMPLATE-RESULTS", 1, 0, false);
        declareFunction(me, "cb_toe_operations_handler", "CB-TOE-OPERATIONS-HANDLER", 1, 0, false);
        declareFunction(me, "destructure_template_op", "DESTRUCTURE-TEMPLATE-OP", 1, 0, false);
        declareFunction(me, "template_substitute_in_form", "TEMPLATE-SUBSTITUTE-IN-FORM", 4, 0, false);
        declareFunction(me, "cb_show_template_query", "CB-SHOW-TEMPLATE-QUERY", 1, 0, false);
        declareFunction(me, "cb_show_template_query_answers", "CB-SHOW-TEMPLATE-QUERY-ANSWERS", 1, 0, false);
        declareFunction(me, "cb_show_template_specification_and_submit", "CB-SHOW-TEMPLATE-SPECIFICATION-AND-SUBMIT", 3, 0, false);
        declareFunction(me, "cb_show_template_input_area", "CB-SHOW-TEMPLATE-INPUT-AREA", 1, 3, false);
        declareFunction(me, "cb_toe_mt_error_page", "CB-TOE-MT-ERROR-PAGE", 0, 0, false);
        declareFunction(me, "cb_get_ask_from_args", "CB-GET-ASK-FROM-ARGS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_template_oe_file() {
        defparameter("*TEMPLATE-QUERY-SHOW-ANSWER-COUNT*", TWENTY_INTEGER);
        defparameter("*CB-TOE-RESULTING-FORMS-ABBREVIATION-CUTOFF*", $int$100);
        return NIL;
    }

    public static SubLObject setup_cb_template_oe_file() {
        sethash($CB_TOE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str1$cb_toe_html, NIL));
        setup_cb_link_method($TEMPLATE_OE_INFERENCE, CB_LINK_TEMPLATE_OE_INFERENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_TOE_INFERENCE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TEMPLATE_OE, $HTML_HANDLER);
        setup_cb_link_method($TEMPLATE_OE_INFERENCE_HANDLER, CB_LINK_TEMPLATE_OE_INFERENCE_HANDLER, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_TEMPLATE_ASSERT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TEMPLATE_UNASSERT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TEMPLATE_EDIT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TEMPLATE_KILL, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TEMPLATE_BLAST, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TEMPLATE_REPROPAGATE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TEMPLATE_REDO_TMS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TEMPLATE_CHANGE_ASSERTION_PROPERTIES, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TEMPLATE_MERGE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TEMPLATE_ASSERT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TEMPLATE_UNASSERT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TEMPLATE_EDIT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TEMPLATE_BLAST, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TEMPLATE_REPROPAGATE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TEMPLATE_REDO_TMS, $HTML_HANDLER);
        final SubLObject new_action_type = user_actions.make_action_type($list139);
        user_actions._csetf_action_type_key(new_action_type, $TOE_OPERATIONS);
        sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
        sethash($CB_TOE_TEMPLATE_RESULTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str149$cb_toe_template_results_html, NIL));
        html_macros.note_cgi_handler_function(CB_TOE_OPERATIONS_DISPLAY, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TOE_OPERATIONS_HANDLER, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_template_oe_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_template_oe_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_template_oe_file();
    }

    
}

/**
 * Total time: 1014 ms
 */
