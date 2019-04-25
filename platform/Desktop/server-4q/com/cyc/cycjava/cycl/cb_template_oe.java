package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.browser.cb_inference_browser;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.browser.cb_query_browser;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_template_oe extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_template_oe";
    public static final String myFingerPrint = "4333967550a10def3d0ada32b2f9913834d3c42253bcb62e1e58080caca732bf";
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 3540L)
    public static SubLSymbol $template_query_show_answer_count$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 26172L)
    public static SubLSymbol $cb_toe_resulting_forms_abbreviation_cutoff$;
    private static final SubLSymbol $kw0$CB_TOE;
    private static final SubLString $str1$cb_toe_html;
    private static final SubLString $str2$Template_OE__Query_Specification;
    private static final SubLString $str3$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str4$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw5$UNINITIALIZED;
    private static final SubLSymbol $kw6$CB_CYC;
    private static final SubLSymbol $kw7$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw8$SHA1;
    private static final SubLString $str9$yui_skin_sam;
    private static final SubLString $str10$reloadFrameButton;
    private static final SubLString $str11$button;
    private static final SubLString $str12$reload;
    private static final SubLString $str13$Refresh_Frames;
    private static final SubLString $str14$post;
    private static final SubLString $str15$cb_handle_template_oe;
    private static final SubLString $str16$Clear_All_Fields;
    private static final SubLString $str17$Run_Query;
    private static final SubLString $str18$query_test;
    private static final SubLString $str19$cb_toe_parameters;
    private static final SubLString $str20$Show;
    private static final SubLString $str21$Hide;
    private static final SubLString $str22$Query_Context;
    private static final SubLSymbol $kw23$INVISIBLE;
    private static final SubLSymbol $kw24$PARAGRAPH;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLString $str27$Available_Templates_;
    private static final SubLString $str28$Assert;
    private static final SubLString $str29$template_assert;
    private static final SubLString $str30$Unassert;
    private static final SubLString $str31$template_unassert;
    private static final SubLString $str32$Edit;
    private static final SubLString $str33$template_edit;
    private static final SubLString $str34$Kill;
    private static final SubLString $str35$template_kill;
    private static final SubLString $str36$Blast;
    private static final SubLString $str37$template_blast;
    private static final SubLString $str38$Repropagate;
    private static final SubLString $str39$template_repropagate;
    private static final SubLString $str40$_Template_OE_;
    private static final SubLSymbol $sym41$INFERENCE_P;
    private static final SubLSymbol $kw42$SELF;
    private static final SubLString $str43$cb_toe_inference__A;
    private static final SubLSymbol $kw44$TEMPLATE_OE_INFERENCE;
    private static final SubLSymbol $sym45$CB_LINK_TEMPLATE_OE_INFERENCE;
    private static final SubLList $list46;
    private static final SubLString $str47$That_inference_is_no_longer_avail;
    private static final SubLSymbol $sym48$CB_TOE_INFERENCE;
    private static final SubLSymbol $kw49$HTML_HANDLER;
    private static final SubLString $str50$Template_OE__Inference;
    private static final SubLString $str51$inference;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$TEMPLATE_OE_INFERENCE_HANDLER;
    private static final SubLList $list54;
    private static final SubLString $str55$Inference___;
    private static final SubLSymbol $kw56$INFERENCE;
    private static final SubLString $str57$_Refresh_;
    private static final SubLSymbol $kw58$DISABLED;
    private static final SubLString $str59$template_redo_tms;
    private static final SubLString $str60$Submission_was_not_understood_;
    private static final SubLSymbol $sym61$CB_HANDLE_TEMPLATE_OE;
    private static final SubLString $str62$cb_handle_template_oe__A__A_infer;
    private static final SubLSymbol $sym63$CB_LINK_TEMPLATE_OE_INFERENCE_HANDLER;
    private static final SubLSymbol $sym64$CB_TEMPLATE_ASSERT;
    private static final SubLSymbol $sym65$CB_TEMPLATE_UNASSERT;
    private static final SubLSymbol $sym66$CB_TEMPLATE_EDIT;
    private static final SubLString $str67$kill;
    private static final SubLSymbol $sym68$CB_TEMPLATE_KILL;
    private static final SubLSymbol $sym69$CB_TEMPLATE_BLAST;
    private static final SubLSymbol $sym70$CB_TEMPLATE_REPROPAGATE;
    private static final SubLSymbol $sym71$CB_TEMPLATE_REDO_TMS;
    private static final SubLSymbol $sym72$CB_TEMPLATE_CHANGE_ASSERTION_PROPERTIES;
    private static final SubLSymbol $sym73$CB_TEMPLATE_MERGE;
    private static final SubLString $str74$Template_OE__Query_Results;
    private static final SubLString $str75$Template_OE__Assert;
    private static final SubLString $str76$cb_handle_template_assert;
    private static final SubLString $str77$Assert_Specification;
    private static final SubLString $str78$Run_Template_Assert;
    private static final SubLString $str79$assert;
    private static final SubLSymbol $sym80$CB_HANDLE_TEMPLATE_ASSERT;
    private static final SubLString $str81$Template_OE__Unassert;
    private static final SubLString $str82$cb_handle_template_unassert;
    private static final SubLString $str83$Unassert_Specification;
    private static final SubLString $str84$Run_Template_Unassert;
    private static final SubLString $str85$unassert;
    private static final SubLSymbol $sym86$CB_HANDLE_TEMPLATE_UNASSERT;
    private static final SubLString $str87$Template_OE__Edit;
    private static final SubLString $str88$cb_handle_template_edit;
    private static final SubLString $str89$Edit_Specification;
    private static final SubLString $str90$Run_Template_Edit;
    private static final SubLString $str91$edit;
    private static final SubLList $list92;
    private static final SubLString $str93$mt_monad;
    private static final SubLSymbol $sym94$CB_HANDLE_TEMPLATE_EDIT;
    private static final SubLString $str95$Template_OE__Blast;
    private static final SubLString $str96$cb_handle_template_blast;
    private static final SubLString $str97$Blast_Specification;
    private static final SubLString $str98$Run_Template_Blast;
    private static final SubLString $str99$blast;
    private static final SubLSymbol $sym100$CB_HANDLE_TEMPLATE_BLAST;
    private static final SubLString $str101$Template_OE__Repropagate;
    private static final SubLString $str102$cb_handle_template_repropagate;
    private static final SubLString $str103$Repropagate_Specification;
    private static final SubLString $str104$Run_Template_Repropagate;
    private static final SubLString $str105$repropagate;
    private static final SubLSymbol $sym106$CB_HANDLE_TEMPLATE_REPROPAGATE;
    private static final SubLString $str107$Template_OE__Redo_TMS;
    private static final SubLString $str108$cb_handle_template_redo_tms;
    private static final SubLString $str109$Redo_TMS_Specification;
    private static final SubLString $str110$Run_Template_Redo_TMS;
    private static final SubLString $str111$redo_tms;
    private static final SubLSymbol $sym112$CB_HANDLE_TEMPLATE_REDO_TMS;
    private static final SubLString $str113$template;
    private static final SubLList $list114;
    private static final SubLSymbol $sym115$STRING_EQUAL;
    private static final SubLString $str116$_sentence;
    private static final SubLString $str117$_mt;
    private static final SubLSymbol $kw118$INPUT_NAME;
    private static final SubLList $list119;
    private static final SubLString $str120$query_spec;
    private static final SubLString $str121$query_mt;
    private static final SubLSymbol $kw122$DEFAULT;
    private static final SubLSymbol $sym123$KE_KILL;
    private static final SubLSymbol $sym124$KE_ASSERT;
    private static final SubLSymbol $sym125$QUOTE;
    private static final SubLSymbol $sym126$KE_UNASSERT;
    private static final SubLSymbol $sym127$FI_BLAST;
    private static final SubLSymbol $sym128$KE_REPROPAGATE_ASSERTION;
    private static final SubLSymbol $sym129$FIND_ASSERTION_CYCL;
    private static final SubLSymbol $sym130$KE_TMS_RECONSIDER_ASSERTION;
    private static final SubLSymbol $kw131$CYCLIST;
    private static final SubLSymbol $kw132$TYPE_KEY;
    private static final SubLSymbol $kw133$TOE_OPERATIONS;
    private static final SubLSymbol $kw134$DATA;
    private static final SubLString $str135$Current_;
    private static final SubLString $str136$_Template_in_;
    private static final SubLString $str137$__;
    private static final SubLString $str138$Submission_was_not_understood;
    private static final SubLList $list139;
    private static final SubLString $str140$Evaluate_;
    private static final SubLString $str141$_forms_from_;
    private static final SubLString $str142$_template_;
    private static final SubLString $str143$_in_;
    private static final SubLString $str144$_with_bindings_from_;
    private static final SubLString $str145$_with_query;
    private static final SubLList $list146;
    private static final SubLString $str147$query_;
    private static final SubLSymbol $kw148$CB_TOE_TEMPLATE_RESULTS;
    private static final SubLString $str149$cb_toe_template_results_html;
    private static final SubLString $str150$Template_OE__Resulting_Forms;
    private static final SubLString $str151$cb_toe_operations_handler;
    private static final SubLString $str152$id_string;
    private static final SubLString $str153$Current_Inference___;
    private static final SubLString $str154$Current_query;
    private static final SubLSymbol $sym155$CB_TOE_OPERATIONS_DISPLAY;
    private static final SubLInteger $int156$100;
    private static final SubLString $str157$Add_Forms_to_Agenda;
    private static final SubLString $str158$boxes;
    private static final SubLString $str159$100_;
    private static final SubLString $str160$OK_;
    private static final SubLString $str161$_2;
    private static final SubLString $str162$Operations_;
    private static final SubLString $str163$Below_forms_abbreviated__no_links;
    private static final SubLString $str164$_of_them_;
    private static final SubLString $str165$_dddddd;
    private static final SubLString $str166$_cccccc;
    private static final SubLSymbol $kw167$CENTER;
    private static final SubLString $str168$_Check_All_;
    private static final SubLString $str169$this_document_forms_0_;
    private static final SubLString $str170$__;
    private static final SubLString $str171$T;
    private static final SubLString $str172$_Uncheck_All_;
    private static final SubLString $str173$NIL;
    private static final SubLString $str174$_A;
    private static final SubLString $str175$TOE__Forms_Added_to_Agenda;
    private static final SubLSymbol $sym176$CB_TOE_OPERATIONS_HANDLER;
    private static final SubLString $str177$_S;
    private static final SubLString $str178$strength;
    private static final SubLString $str179$direction;
    private static final SubLList $list180;
    private static final SubLString $str181$Template_OE__Error;
    private static final SubLString $str182$Cyc_Error;
    private static final SubLString $str183$The_Mt_you_have_entered_is_invali;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 934L)
    public static SubLObject cb_toe_query() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_template_oe.$str2$Template_OE__Query_Specification;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_template_oe.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_template_oe.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_template_oe.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_template_oe.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_template_oe.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_template_oe.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_template_oe.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw7$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_template_oe.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_template_oe.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_template_oe.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_template_oe.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        if (cb_template_oe.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str15$cb_handle_template_oe, (SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_template_oe.$kw0$CB_TOE, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_template_oe.$str16$Clear_All_Fields);
                            html_utilities.html_indent((SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_template_oe.$str17$Run_Query, (SubLObject)cb_template_oe.$str18$query_test, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            dhtml_macros.dhtml_switch_visibility_links((SubLObject)cb_template_oe.$str19$cb_toe_parameters, (SubLObject)cb_template_oe.$str20$Show, (SubLObject)cb_template_oe.$str21$Hide);
                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str22$Query_Context);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
                            final SubLObject initial_visibility = (SubLObject)cb_template_oe.$kw23$INVISIBLE;
                            dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_template_oe.$str19$cb_toe_parameters, initial_visibility, (SubLObject)cb_template_oe.$kw24$PARAGRAPH);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str19$cb_toe_parameters);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                                cb_form_widgets.cb_mt_input_section((SubLObject)cb_template_oe.NIL, (SubLObject)cb_template_oe.$list25);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
                            cb_form_widgets.cb_el_sentence_input_section((SubLObject)cb_template_oe.NIL, (SubLObject)cb_template_oe.$list26);
                            html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str27$Available_Templates_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_template_oe.$str28$Assert, (SubLObject)cb_template_oe.$str29$template_assert, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_template_oe.$str30$Unassert, (SubLObject)cb_template_oe.$str31$template_unassert, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_template_oe.$str32$Edit, (SubLObject)cb_template_oe.$str33$template_edit, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_template_oe.$str34$Kill, (SubLObject)cb_template_oe.$str35$template_kill, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_template_oe.$str36$Blast, (SubLObject)cb_template_oe.$str37$template_blast, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_template_oe.$str38$Repropagate, (SubLObject)cb_template_oe.$str39$template_repropagate, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 2776L)
    public static SubLObject cb_link_template_oe_inference(final SubLObject inference, SubLObject linktext) {
        if (linktext == cb_template_oe.UNPROVIDED) {
            linktext = (SubLObject)cb_template_oe.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_template_oe.NIL == linktext) {
            linktext = (SubLObject)cb_template_oe.$str40$_Template_OE_;
        }
        assert cb_template_oe.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_template_oe.$kw42$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_template_oe.$str43$cb_toe_inference__A, cb_query.cb_inference_identifier(inference));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        if (cb_template_oe.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 3180L)
    public static SubLObject cb_toe_inference(final SubLObject args) {
        SubLObject inference_identifier = (SubLObject)cb_template_oe.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_template_oe.$list46);
        inference_identifier = args.first();
        final SubLObject current = args.rest();
        if (cb_template_oe.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_template_oe.$list46);
            return (SubLObject)cb_template_oe.NIL;
        }
        final SubLObject inference = cb_query.cb_guess_inference_from_identifier(inference_identifier);
        if (cb_template_oe.NIL == inference_datastructures_inference.inference_p(inference)) {
            return cb_utilities.cb_error((SubLObject)cb_template_oe.$str47$That_inference_is_no_longer_avail, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        return cb_toe_inference_guts(inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 3618L)
    public static SubLObject cb_toe_inference_guts(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_template_oe.$str50$Template_OE__Inference;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_template_oe.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_template_oe.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_template_oe.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_template_oe.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_template_oe.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_template_oe.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_template_oe.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw7$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_template_oe.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_template_oe.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_template_oe.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_template_oe.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        if (cb_template_oe.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str15$cb_handle_template_oe, (SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_template_oe.$kw0$CB_TOE, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str51$inference, cb_query.cb_inference_identifier(inference), (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query_inference(inference, (SubLObject)cb_template_oe.$kw44$TEMPLATE_OE_INFERENCE);
                            html_utilities.html_hr((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str27$Available_Templates_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
                            SubLObject cdolist_list_var = (SubLObject)cb_template_oe.$list54;
                            SubLObject handler_info = (SubLObject)cb_template_oe.NIL;
                            handler_info = cdolist_list_var.first();
                            while (cb_template_oe.NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = handler_info;
                                SubLObject handler = (SubLObject)cb_template_oe.NIL;
                                SubLObject label = (SubLObject)cb_template_oe.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_template_oe.$list52);
                                handler = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_template_oe.$list52);
                                label = current.first();
                                current = current.rest();
                                if (cb_template_oe.NIL == current) {
                                    cb_utilities.cb_link((SubLObject)cb_template_oe.$kw53$TEMPLATE_OE_INFERENCE_HANDLER, inference, handler, label, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_template_oe.TWO_INTEGER);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_template_oe.$list52);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                handler_info = cdolist_list_var.first();
                            }
                            html_utilities.html_hr((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_query.cb_show_query_answer_section(inference, cb_template_oe.$template_query_show_answer_count$.getDynamicValue(thread));
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 5049L)
    public static SubLObject cb_show_template_query_inference(final SubLObject inference, SubLObject refresh_link) {
        if (refresh_link == cb_template_oe.UNPROVIDED) {
            refresh_link = (SubLObject)cb_template_oe.NIL;
        }
        html_utilities.html_princ_strong((SubLObject)cb_template_oe.$str55$Inference___);
        cb_utilities.cb_link((SubLObject)cb_template_oe.$kw56$INFERENCE, inference, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        if (cb_template_oe.NIL != refresh_link) {
            html_utilities.html_indent((SubLObject)cb_template_oe.FOUR_INTEGER);
            cb_utilities.cb_link(refresh_link, inference, (SubLObject)cb_template_oe.$str57$_Refresh_, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
        cb_query.cb_show_inference_status_section(inference, (SubLObject)cb_template_oe.$kw58$DISABLED);
        html_utilities.html_newline((SubLObject)cb_template_oe.TWO_INTEGER);
        cb_query_browser.cb_show_inference_el_query(inference, (SubLObject)cb_template_oe.UNPROVIDED);
        return inference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 5664L)
    public static SubLObject cb_handle_template_oe(final SubLObject args) {
        if (cb_template_oe.NIL != html_utilities.html_extract_input((SubLObject)cb_template_oe.$str18$query_test, args)) {
            return cb_handle_toe_test_query(args);
        }
        if (cb_template_oe.NIL != html_utilities.html_extract_input((SubLObject)cb_template_oe.$str29$template_assert, args)) {
            return cb_template_assert(args);
        }
        if (cb_template_oe.NIL != html_utilities.html_extract_input((SubLObject)cb_template_oe.$str31$template_unassert, args)) {
            return cb_template_unassert(args);
        }
        if (cb_template_oe.NIL != html_utilities.html_extract_input((SubLObject)cb_template_oe.$str33$template_edit, args)) {
            return cb_template_edit(args);
        }
        if (cb_template_oe.NIL != html_utilities.html_extract_input((SubLObject)cb_template_oe.$str35$template_kill, args)) {
            return cb_template_kill(args);
        }
        if (cb_template_oe.NIL != html_utilities.html_extract_input((SubLObject)cb_template_oe.$str37$template_blast, args)) {
            return cb_template_blast(args);
        }
        if (cb_template_oe.NIL != html_utilities.html_extract_input((SubLObject)cb_template_oe.$str39$template_repropagate, args)) {
            return cb_template_repropagate(args);
        }
        if (cb_template_oe.NIL != html_utilities.html_extract_input((SubLObject)cb_template_oe.$str59$template_redo_tms, args)) {
            return cb_template_redo_tms(args);
        }
        return cb_utilities.cb_error((SubLObject)cb_template_oe.$str60$Submission_was_not_understood_, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 6981L)
    public static SubLObject cb_link_template_oe_inference_handler(final SubLObject inference, final SubLObject handler, final SubLObject label) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_template_oe.$kw42$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_template_oe.$str62$cb_handle_template_oe__A__A_infer, new SubLObject[] { handler, label, cb_query.cb_inference_identifier(inference) });
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        if (cb_template_oe.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
            html_utilities.html_princ(label);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 7232L)
    public static SubLObject cb_template_assert(final SubLObject args) {
        return cb_template_assert_internals(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 7406L)
    public static SubLObject cb_template_unassert(final SubLObject args) {
        return cb_template_unassert_internals(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 7585L)
    public static SubLObject cb_template_edit(final SubLObject args) {
        return cb_template_edit_internals(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 7732L)
    public static SubLObject cb_template_kill(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = (SubLObject)cb_template_oe.NIL;
        thread.resetMultipleValues();
        final SubLObject query_formula = cb_get_ask_from_args(args);
        final SubLObject query_mt = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject query_spec_and_mt_list = (SubLObject)((cb_template_oe.NIL != inference) ? inference : ConsesLow.list(query_formula, query_mt));
        template = (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$str67$kill, query_spec_and_mt_list);
        return cb_handle_template_output(template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 8171L)
    public static SubLObject cb_template_blast(final SubLObject args) {
        return cb_template_blast_internals(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 8340L)
    public static SubLObject cb_template_repropagate(final SubLObject args) {
        return cb_template_repropagate_internals(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 8508L)
    public static SubLObject cb_template_redo_tms(final SubLObject args) {
        return cb_template_redo_tms_internals(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 8660L)
    public static SubLObject cb_template_change_assertion_properties(final SubLObject args) {
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 8892L)
    public static SubLObject cb_template_merge(final SubLObject args) {
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 9046L)
    public static SubLObject cb_handle_toe_test_query(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject query_formula = cb_get_ask_from_args(args);
        final SubLObject query_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        html_utilities.html_markup((SubLObject)cb_template_oe.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_template_oe.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_template_oe.$str4$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_template_oe.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_template_oe.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_template_oe.$str74$Template_OE__Query_Results);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_template_oe.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_template_oe.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_template_oe.ONE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_template_oe.$str74$Template_OE__Query_Results);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_template_oe.ONE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        cb_query.cb_new_cyc_query(query_formula, query_mt, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$12, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 9853L)
    public static SubLObject cb_template_assert_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_template_oe.$str75$Template_OE__Assert;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_template_oe.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_template_oe.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_template_oe.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_template_oe.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$15 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_template_oe.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_template_oe.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_template_oe.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw7$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_template_oe.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_template_oe.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_template_oe.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_template_oe.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        if (cb_template_oe.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str76$cb_handle_template_assert, (SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit((SubLObject)cb_template_oe.$str77$Assert_Specification, (SubLObject)cb_template_oe.$str78$Run_Template_Assert, (SubLObject)cb_template_oe.$str79$assert);
                            cb_show_template_input_area((SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$16, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$15, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 10595L)
    public static SubLObject cb_handle_template_assert(final SubLObject args) {
        return cb_handle_template_internals(args, (SubLObject)cb_template_oe.$str79$assert);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 10785L)
    public static SubLObject cb_template_unassert_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_template_oe.$str81$Template_OE__Unassert;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_template_oe.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_template_oe.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_template_oe.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_template_oe.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_template_oe.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_template_oe.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_template_oe.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw7$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_template_oe.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_template_oe.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_template_oe.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_template_oe.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        if (cb_template_oe.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str82$cb_handle_template_unassert, (SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit((SubLObject)cb_template_oe.$str83$Unassert_Specification, (SubLObject)cb_template_oe.$str84$Run_Template_Unassert, (SubLObject)cb_template_oe.$str85$unassert);
                            cb_show_template_input_area((SubLObject)cb_template_oe.NIL, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$21, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$20, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 11353L)
    public static SubLObject cb_handle_template_unassert(final SubLObject args) {
        return cb_handle_template_internals(args, (SubLObject)cb_template_oe.$str85$unassert);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 11541L)
    public static SubLObject cb_template_edit_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_template_oe.$str87$Template_OE__Edit;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_template_oe.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_template_oe.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_template_oe.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_template_oe.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$25 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_template_oe.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_template_oe.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_template_oe.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw7$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_template_oe.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_template_oe.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_template_oe.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_template_oe.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        if (cb_template_oe.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str88$cb_handle_template_edit, (SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit((SubLObject)cb_template_oe.$str89$Edit_Specification, (SubLObject)cb_template_oe.$str90$Run_Template_Edit, (SubLObject)cb_template_oe.$str91$edit);
                            final SubLObject default_sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)cb_template_oe.$list92);
                            final SubLObject default_mt_string = html_utilities.html_extract_input((SubLObject)cb_template_oe.$str93$mt_monad, args);
                            final SubLObject default_mt = (SubLObject)((cb_template_oe.NIL != string_utilities.non_empty_stringP(default_mt_string)) ? cb_assertion_editor.cb_extract_mt_from_string(default_mt_string) : cb_template_oe.NIL);
                            cb_show_template_input_area((SubLObject)cb_template_oe.T, default_sentence, default_mt, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$26, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$25, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 12467L)
    public static SubLObject cb_handle_template_edit(final SubLObject args) {
        return cb_handle_template_internals(args, (SubLObject)cb_template_oe.$str91$edit);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 12631L)
    public static SubLObject cb_template_blast_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_template_oe.$str95$Template_OE__Blast;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_template_oe.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_template_oe.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_template_oe.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_template_oe.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$30 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_template_oe.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_template_oe.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_template_oe.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw7$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$31 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_template_oe.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_template_oe.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_template_oe.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_template_oe.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        if (cb_template_oe.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str96$cb_handle_template_blast, (SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit((SubLObject)cb_template_oe.$str97$Blast_Specification, (SubLObject)cb_template_oe.$str98$Run_Template_Blast, (SubLObject)cb_template_oe.$str99$blast);
                            cb_show_template_input_area((SubLObject)cb_template_oe.NIL, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$31, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$30, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 13198L)
    public static SubLObject cb_handle_template_blast(final SubLObject args) {
        return cb_handle_template_internals(args, (SubLObject)cb_template_oe.$str99$blast);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 13379L)
    public static SubLObject cb_template_repropagate_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_template_oe.$str101$Template_OE__Repropagate;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_template_oe.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_template_oe.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_template_oe.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_template_oe.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$35 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_template_oe.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_template_oe.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_template_oe.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw7$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_template_oe.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_template_oe.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_template_oe.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_template_oe.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        if (cb_template_oe.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str102$cb_handle_template_repropagate, (SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit((SubLObject)cb_template_oe.$str103$Repropagate_Specification, (SubLObject)cb_template_oe.$str104$Run_Template_Repropagate, (SubLObject)cb_template_oe.$str105$repropagate);
                            cb_show_template_input_area((SubLObject)cb_template_oe.NIL, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$36, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$35, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 13995L)
    public static SubLObject cb_handle_template_repropagate(final SubLObject args) {
        return cb_handle_template_internals(args, (SubLObject)cb_template_oe.$str105$repropagate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 14194L)
    public static SubLObject cb_template_redo_tms_internals(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_template_oe.$str107$Template_OE__Redo_TMS;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_template_oe.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_template_oe.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_template_oe.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_template_oe.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$40 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_template_oe.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_template_oe.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_template_oe.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw7$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_template_oe.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_template_oe.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_template_oe.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_template_oe.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        if (cb_template_oe.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str108$cb_handle_template_redo_tms, (SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query(args);
                            cb_show_template_specification_and_submit((SubLObject)cb_template_oe.$str109$Redo_TMS_Specification, (SubLObject)cb_template_oe.$str110$Run_Template_Redo_TMS, (SubLObject)cb_template_oe.$str111$redo_tms);
                            cb_show_template_input_area((SubLObject)cb_template_oe.NIL, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_show_template_query_answers(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$41, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$40, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 14788L)
    public static SubLObject cb_handle_template_redo_tms(final SubLObject args) {
        return cb_handle_template_internals(args, (SubLObject)cb_template_oe.$str111$redo_tms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 14981L)
    public static SubLObject cb_handle_template_internals(final SubLObject args, final SubLObject template_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_spec_and_mt_list = get_list_with_query_spec_and_mt(args);
        SubLObject template_form = (SubLObject)cb_template_oe.NIL;
        SubLObject template_mt = (SubLObject)cb_template_oe.NIL;
        SubLObject mt_fort = (SubLObject)cb_template_oe.NIL;
        SubLObject template = (SubLObject)cb_template_oe.NIL;
        thread.resetMultipleValues();
        final SubLObject template_form_$45 = get_template_form_specs(args, (SubLObject)cb_template_oe.$str113$template);
        final SubLObject template_mt_$46 = thread.secondMultipleValue();
        final SubLObject mt_fort_$47 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        template_form = template_form_$45;
        template_mt = template_mt_$46;
        mt_fort = mt_fort_$47;
        if (cb_template_oe.NIL != Strings.string_equal(template_type, (SubLObject)cb_template_oe.$str79$assert, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED) || cb_template_oe.NIL != Strings.string_equal(template_type, (SubLObject)cb_template_oe.$str91$edit, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject template_strength = cb_assertion_editor.cb_extract_strength_and_direction_input(args, (SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject template_direction = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject template_list = (SubLObject)((cb_template_oe.NIL != mt_fort) ? ConsesLow.list(template_form, mt_fort, template_strength, template_direction) : ConsesLow.list(template_form, template_mt, template_strength, template_direction));
            template = (SubLObject)ConsesLow.list(template_type, query_spec_and_mt_list, template_list);
        }
        else if (cb_template_oe.NIL != subl_promotions.memberP(template_type, (SubLObject)cb_template_oe.$list114, Symbols.symbol_function((SubLObject)cb_template_oe.$sym115$STRING_EQUAL), (SubLObject)cb_template_oe.UNPROVIDED)) {
            template = (SubLObject)((cb_template_oe.NIL != mt_fort) ? ConsesLow.list(template_type, query_spec_and_mt_list, (SubLObject)ConsesLow.list(template_form, mt_fort)) : ConsesLow.list(template_type, query_spec_and_mt_list, (SubLObject)ConsesLow.list(template_form, template_mt)));
        }
        return cb_handle_template_output(template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 16272L)
    public static SubLObject get_template_form_specs(final SubLObject args, SubLObject prefix) {
        if (prefix == cb_template_oe.UNPROVIDED) {
            prefix = (SubLObject)cb_template_oe.$str113$template;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_string = Sequences.cconcatenate(prefix, (SubLObject)cb_template_oe.$str116$_sentence);
        final SubLObject mt_string = Sequences.cconcatenate(prefix, (SubLObject)cb_template_oe.$str117$_mt);
        thread.resetMultipleValues();
        final SubLObject template_mt = cb_form_widgets.cb_extract_mt_input(args, (SubLObject)cb_template_oe.NIL, (SubLObject)ConsesLow.listS((SubLObject)cb_template_oe.$kw118$INPUT_NAME, mt_string, (SubLObject)cb_template_oe.$list119));
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_template_oe.NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$kw118$INPUT_NAME, sentence_string));
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_template_oe.NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        final SubLObject mt_fort = cb_utilities.cb_guess_fort(html_utilities.html_extract_input(mt_string, args), (SubLObject)cb_template_oe.UNPROVIDED);
        return Values.values(sentence, template_mt, mt_fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 17032L)
    public static SubLObject get_list_with_query_spec_and_mt(final SubLObject args) {
        final SubLObject inference_identifier = html_utilities.html_extract_input((SubLObject)cb_template_oe.$str51$inference, args);
        if (cb_template_oe.NIL != inference_identifier) {
            return cb_query.cb_guess_inference_from_identifier(inference_identifier);
        }
        return (SubLObject)ConsesLow.list(reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cb_template_oe.$str120$query_spec, args), (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED), cb_assertion_editor.cb_extract_mt_from_string(html_utilities.html_extract_input((SubLObject)cb_template_oe.$str121$query_mt, args)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 17418L)
    public static SubLObject cb_handle_template_output(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_spec_and_mt_list = conses_high.second(template);
        SubLObject v_answer = (SubLObject)cb_template_oe.NIL;
        SubLObject suspend_status = (SubLObject)cb_template_oe.NIL;
        SubLObject query = (SubLObject)cb_template_oe.NIL;
        SubLObject mt = (SubLObject)cb_template_oe.NIL;
        if (cb_template_oe.NIL != inference_datastructures_inference.inference_p(query_spec_and_mt_list)) {
            final SubLObject inference = query_spec_and_mt_list;
            query = inference_datastructures_inference.inference_input_el_query(inference);
            mt = inference_datastructures_inference.inference_input_mt(inference);
            v_answer = inference_kernel.inference_result_from_all_answers(inference);
            suspend_status = inference_datastructures_inference.inference_suspend_status(inference);
        }
        else {
            query = query_spec_and_mt_list.first();
            mt = conses_high.second(query_spec_and_mt_list);
            thread.resetMultipleValues();
            final SubLObject v_answer_$48 = inference_kernel.new_cyc_query(query, mt, (SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject suspend_status_$49 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_answer = v_answer_$48;
            suspend_status = suspend_status_$49;
        }
        final SubLObject id_string = get_toe_template_forms(v_answer, template, suspend_status, query, mt);
        if (cb_template_oe.NIL != id_string) {
            cb_toe_operations_display((SubLObject)ConsesLow.list(id_string));
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 18439L)
    public static SubLObject get_toe_template_forms(final SubLObject v_answer, final SubLObject template, final SubLObject suspend_status, final SubLObject query_form, final SubLObject query_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_template_oe.NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(suspend_status)) {
            cb_query_browser.cb_show_inference_suspend_status(suspend_status);
            return (SubLObject)cb_template_oe.NIL;
        }
        final SubLObject type = template.first();
        final SubLObject op = conses_high.third(template);
        SubLObject form = (SubLObject)cb_template_oe.NIL;
        SubLObject mt = (SubLObject)cb_template_oe.NIL;
        SubLObject strength = (SubLObject)cb_template_oe.NIL;
        SubLObject direction = (SubLObject)cb_template_oe.NIL;
        SubLObject current_forms = (SubLObject)cb_template_oe.NIL;
        SubLObject temp_user_action = (SubLObject)cb_template_oe.NIL;
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
        if ((cb_template_oe.NIL != Strings.string_equal(type, (SubLObject)cb_template_oe.$str79$assert, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED) || cb_template_oe.NIL != Strings.string_equal(type, (SubLObject)cb_template_oe.$str91$edit, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) && cb_template_oe.NIL == strength) {
            strength = (SubLObject)cb_template_oe.$kw122$DEFAULT;
        }
        SubLObject cdolist_list_var = v_answer;
        SubLObject alist = (SubLObject)cb_template_oe.NIL;
        alist = cdolist_list_var.first();
        while (cb_template_oe.NIL != cdolist_list_var) {
            SubLObject temp_form = (SubLObject)cb_template_oe.NIL;
            SubLObject temp_mt = (SubLObject)cb_template_oe.NIL;
            SubLObject constant = (SubLObject)cb_template_oe.NIL;
            SubLObject ke_form = (SubLObject)cb_template_oe.NIL;
            thread.resetMultipleValues();
            final SubLObject temp_form_$54 = template_substitute_in_form(alist, form, mt, type);
            final SubLObject temp_mt_$55 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            temp_form = temp_form_$54;
            temp_mt = temp_mt_$55;
            if (cb_template_oe.NIL != Strings.string_equal(type, (SubLObject)cb_template_oe.$str67$kill, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
                constant = temp_form;
                ke_form = (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym123$KE_KILL, constant);
                current_forms = (SubLObject)ConsesLow.cons(ke_form, current_forms);
            }
            else if (cb_template_oe.NIL != Strings.string_equal(type, (SubLObject)cb_template_oe.$str79$assert, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
                ke_form = (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym124$KE_ASSERT, (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, temp_form), (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, temp_mt), (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, strength), (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, direction));
                current_forms = (SubLObject)ConsesLow.cons(ke_form, current_forms);
            }
            else if (cb_template_oe.NIL != Strings.string_equal(type, (SubLObject)cb_template_oe.$str85$unassert, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
                ke_form = (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym126$KE_UNASSERT, (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, temp_form), (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, temp_mt));
                current_forms = (SubLObject)ConsesLow.cons(ke_form, current_forms);
            }
            else if (cb_template_oe.NIL != Strings.string_equal(type, (SubLObject)cb_template_oe.$str91$edit, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject unassert_form = template_substitute_in_form(alist, query_form, query_mt, type);
                final SubLObject unassert_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                ke_form = (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym126$KE_UNASSERT, (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, unassert_form), (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, unassert_mt));
                current_forms = (SubLObject)ConsesLow.cons(ke_form, current_forms);
                ke_form = (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym124$KE_ASSERT, (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, temp_form), (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, temp_mt), (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, strength), (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, direction));
                current_forms = (SubLObject)ConsesLow.cons(ke_form, current_forms);
            }
            else if (cb_template_oe.NIL != Strings.string_equal(type, (SubLObject)cb_template_oe.$str99$blast, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
                ke_form = (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym127$FI_BLAST, (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, temp_form), (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, temp_mt));
                current_forms = (SubLObject)ConsesLow.cons(ke_form, current_forms);
            }
            else if (cb_template_oe.NIL != Strings.string_equal(type, (SubLObject)cb_template_oe.$str105$repropagate, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
                if (cb_template_oe.NIL != czer_meta.find_assertion_cycl(temp_form, temp_mt)) {
                    ke_form = (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym128$KE_REPROPAGATE_ASSERTION, (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym129$FIND_ASSERTION_CYCL, (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, temp_form), temp_mt));
                    current_forms = (SubLObject)ConsesLow.cons(ke_form, current_forms);
                }
            }
            else if (cb_template_oe.NIL != Strings.string_equal(type, (SubLObject)cb_template_oe.$str111$redo_tms, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED) && cb_template_oe.NIL != czer_meta.find_assertion_cycl(temp_form, temp_mt)) {
                ke_form = (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym130$KE_TMS_RECONSIDER_ASSERTION, (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym129$FIND_ASSERTION_CYCL, (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$sym125$QUOTE, temp_form), temp_mt));
                current_forms = (SubLObject)ConsesLow.cons(ke_form, current_forms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            alist = cdolist_list_var.first();
        }
        current_forms = Sequences.nreverse(current_forms);
        current_forms = list_utilities.fast_delete_duplicates(current_forms, Symbols.symbol_function((SubLObject)cb_template_oe.EQUAL), (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        temp_user_action = user_actions.new_user_action((SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$kw131$CYCLIST, api_control_vars.$the_cyclist$.getDynamicValue(thread), (SubLObject)cb_template_oe.$kw132$TYPE_KEY, (SubLObject)cb_template_oe.$kw133$TOE_OPERATIONS, (SubLObject)cb_template_oe.$kw134$DATA, (SubLObject)ConsesLow.list(template, current_forms)));
        return user_actions.user_action_id_string(temp_user_action);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 21663L)
    public static SubLObject cb_show_template(final SubLObject template) {
        final SubLObject template_type = template.first();
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_template_oe.$str135$Current_);
        html_utilities.html_princ(Strings.string_capitalize(template_type, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED));
        html_utilities.html_princ((SubLObject)cb_template_oe.$str136$_Template_in_);
        final SubLObject mt = cb_utilities.cb_guess_fort(conses_high.second(conses_high.third(template)), (SubLObject)cb_template_oe.UNPROVIDED);
        if (cb_template_oe.NIL != mt) {
            cb_utilities.cb_form(mt, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        else {
            cb_utilities.cb_form(conses_high.second(conses_high.third(template)), (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        html_utilities.html_princ((SubLObject)cb_template_oe.$str137$__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
        if (cb_template_oe.NIL != Strings.string_equal(template_type, (SubLObject)cb_template_oe.$str79$assert, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        if (cb_template_oe.NIL != Strings.string_equal(template_type, (SubLObject)cb_template_oe.$str85$unassert, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        if (cb_template_oe.NIL != Strings.string_equal(template_type, (SubLObject)cb_template_oe.$str91$edit, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        if (cb_template_oe.NIL != Strings.string_equal(template_type, (SubLObject)cb_template_oe.$str99$blast, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        if (cb_template_oe.NIL != Strings.string_equal(template_type, (SubLObject)cb_template_oe.$str105$repropagate, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        if (cb_template_oe.NIL != Strings.string_equal(template_type, (SubLObject)cb_template_oe.$str111$redo_tms, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
            return cb_show_assertion_template(template);
        }
        return cb_utilities.cb_error((SubLObject)cb_template_oe.$str138$Submission_was_not_understood, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 22779L)
    public static SubLObject cb_show_assertion_template(final SubLObject template) {
        final SubLObject form = conses_high.third(template).first();
        cb_utilities.cb_form(form, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 23324L)
    public static SubLObject cb_toe_operations_summary(final SubLObject user_action_id_string) {
        final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
        final SubLObject template = user_actions.user_action_data(user_action).first();
        final SubLObject type = template.first();
        final SubLObject forms = conses_high.second(user_actions.user_action_data(user_action));
        html_utilities.html_princ((SubLObject)cb_template_oe.$str140$Evaluate_);
        html_utilities.html_princ(Sequences.length(forms));
        html_utilities.html_princ((SubLObject)cb_template_oe.$str141$_forms_from_);
        html_utilities.html_princ(type);
        html_utilities.html_princ((SubLObject)cb_template_oe.$str142$_template_);
        if (cb_template_oe.NIL == Strings.string_equal(type, (SubLObject)cb_template_oe.$str67$kill, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
            html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
            cb_utilities.cb_form(conses_high.third(template).first(), (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_template_oe.$str143$_in_);
            cb_utilities.cb_form(conses_high.second(conses_high.third(template)), (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_template_oe.$str144$_with_bindings_from_);
        final SubLObject query_spec_and_mt_list = conses_high.second(template);
        if (cb_template_oe.NIL != inference_datastructures_inference.inference_p(query_spec_and_mt_list)) {
            final SubLObject inference = query_spec_and_mt_list;
            cb_utilities.cb_form(inference, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_template_oe.$str145$_with_query);
            html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
            cb_utilities.cb_form(inference_datastructures_inference.inference_input_el_query(inference), (SubLObject)cb_template_oe.ZERO_INTEGER, (SubLObject)cb_template_oe.T);
            html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_template_oe.$str143$_in_);
            cb_utilities.cb_form(inference_datastructures_inference.inference_input_mt(inference), (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        else {
            SubLObject current;
            final SubLObject datum = current = query_spec_and_mt_list;
            SubLObject query = (SubLObject)cb_template_oe.NIL;
            SubLObject mt = (SubLObject)cb_template_oe.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_template_oe.$list146);
            query = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_template_oe.$list146);
            mt = current.first();
            current = current.rest();
            if (cb_template_oe.NIL == current) {
                html_utilities.html_princ((SubLObject)cb_template_oe.$str147$query_);
                html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
                cb_utilities.cb_form(query, (SubLObject)cb_template_oe.ZERO_INTEGER, (SubLObject)cb_template_oe.T);
                html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_template_oe.$str143$_in_);
                cb_utilities.cb_form(mt, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_template_oe.$list146);
            }
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 24748L)
    public static SubLObject cb_toe_operations_display(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id_string = args.first();
        final SubLObject user_action = user_actions.user_action_by_id_string(id_string);
        final SubLObject template = user_actions.user_action_data(user_action).first();
        final SubLObject query_spec_and_mt_list = conses_high.second(template);
        final SubLObject inference = (SubLObject)((cb_template_oe.NIL != inference_datastructures_inference.inference_p(query_spec_and_mt_list)) ? query_spec_and_mt_list : cb_template_oe.NIL);
        final SubLObject query_formula = (SubLObject)((cb_template_oe.NIL != inference_datastructures_inference.inference_p(query_spec_and_mt_list)) ? cb_template_oe.NIL : query_spec_and_mt_list.first());
        final SubLObject query_mt = (SubLObject)((cb_template_oe.NIL != inference_datastructures_inference.inference_p(query_spec_and_mt_list)) ? cb_template_oe.NIL : conses_high.second(query_spec_and_mt_list));
        final SubLObject forms = conses_high.second(user_actions.user_action_data(user_action));
        final SubLObject title_var = (SubLObject)cb_template_oe.$str150$Template_OE__Resulting_Forms;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_template_oe.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_template_oe.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_template_oe.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_template_oe.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$56 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_template_oe.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_template_oe.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_template_oe.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$57 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_template_oe.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_template_oe.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_template_oe.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_script_utilities.html_set_all_radio_buttons_script();
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_template_oe.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str14$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        if (cb_template_oe.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_template_oe.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str151$cb_toe_operations_handler, (SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str152$id_string, id_string, (SubLObject)cb_template_oe.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_template_oe.$kw148$CB_TOE_TEMPLATE_RESULTS, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL != inference) {
                                html_utilities.html_princ_strong((SubLObject)cb_template_oe.$str153$Current_Inference___);
                                cb_inference_browser.cb_show_inference_summary(inference);
                            }
                            else {
                                cb_query.cb_show_query(query_formula, query_mt, (SubLObject)cb_template_oe.$str154$Current_query);
                            }
                            html_utilities.html_hr((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL == Strings.string_equal(template.first(), (SubLObject)cb_template_oe.$str67$kill, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
                                cb_show_template(template);
                                html_utilities.html_hr((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                            }
                            cb_show_toe_template_results(forms);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$57, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$56, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 26249L)
    public static SubLObject cb_show_toe_template_results(final SubLObject forms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total_checkboxes = Sequences.length(forms);
        html_utilities.html_submit_input((SubLObject)cb_template_oe.$str157$Add_Forms_to_Agenda, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str158$boxes, total_checkboxes, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_template_oe.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_template_oe.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_template_oe.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_template_oe.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_template_oe.$str159$100_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_template_oe.$str160$OK_);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_indent((SubLObject)cb_template_oe.TWO_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_template_oe.$str161$_2);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_princ((SubLObject)cb_template_oe.$str162$Operations_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            SubLObject checkbox_number = (SubLObject)cb_template_oe.MINUS_ONE_INTEGER;
            final SubLObject form_count = Sequences.length(forms);
            SubLObject bgcolor = (SubLObject)cb_template_oe.NIL;
            if (form_count.numG(cb_template_oe.$cb_toe_resulting_forms_abbreviation_cutoff$.getDynamicValue(thread))) {
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (cb_template_oe.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_princ(Sequences.cconcatenate((SubLObject)cb_template_oe.$str163$Below_forms_abbreviated__no_links, new SubLObject[] { format_nil.format_nil_a_no_copy(cb_template_oe.$cb_toe_resulting_forms_abbreviation_cutoff$.getDynamicValue(thread)), cb_template_oe.$str164$_of_them_ }));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            SubLObject color_toggle = (SubLObject)cb_template_oe.NIL;
            SubLObject list_var = (SubLObject)cb_template_oe.NIL;
            SubLObject ke_form = (SubLObject)cb_template_oe.NIL;
            SubLObject ignore_me = (SubLObject)cb_template_oe.NIL;
            list_var = forms;
            ke_form = list_var.first();
            for (ignore_me = (SubLObject)cb_template_oe.ZERO_INTEGER; cb_template_oe.NIL != list_var; list_var = list_var.rest(), ke_form = list_var.first(), ignore_me = Numbers.add((SubLObject)cb_template_oe.ONE_INTEGER, ignore_me)) {
                if (cb_template_oe.NIL != color_toggle) {
                    color_toggle = (SubLObject)cb_template_oe.NIL;
                }
                else {
                    color_toggle = (SubLObject)cb_template_oe.T;
                }
                bgcolor = (SubLObject)((cb_template_oe.NIL != color_toggle) ? cb_template_oe.$str165$_dddddd : cb_template_oe.$str166$_cccccc);
                checkbox_number = Numbers.add(checkbox_number, (SubLObject)cb_template_oe.ONE_INTEGER);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_template_oe.NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_template_oe.$kw167$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_checkbox_input(checkbox_number, (SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.T, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_indent((SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_template_oe.$kw167$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        if (form_count.numG(cb_template_oe.$cb_toe_resulting_forms_abbreviation_cutoff$.getDynamicValue(thread))) {
                            html_utilities.html_princ(ke_form);
                        }
                        else {
                            cb_utilities.cb_form(ke_form, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
        html_script_utilities.html_anchor_set_radio_buttons_to_value((SubLObject)cb_template_oe.$str168$_Check_All_, (SubLObject)cb_template_oe.$str169$this_document_forms_0_, (SubLObject)cb_template_oe.$str170$__, (SubLObject)cb_template_oe.$str171$T);
        html_utilities.html_indent((SubLObject)cb_template_oe.UNPROVIDED);
        html_script_utilities.html_anchor_set_radio_buttons_to_value((SubLObject)cb_template_oe.$str172$_Uncheck_All_, (SubLObject)cb_template_oe.$str169$this_document_forms_0_, (SubLObject)cb_template_oe.$str170$__, (SubLObject)cb_template_oe.$str173$NIL);
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 28095L)
    public static SubLObject cb_toe_operations_handler(final SubLObject args) {
        final SubLObject boxstring = html_utilities.html_extract_input((SubLObject)cb_template_oe.$str158$boxes, args);
        final SubLObject boxes = reader.read_from_string(boxstring, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        final SubLObject id_string = html_utilities.html_extract_input((SubLObject)cb_template_oe.$str152$id_string, args);
        final SubLObject forms = conses_high.second(user_actions.user_action_data(user_actions.user_action_by_id_string(id_string)));
        SubLObject i;
        for (i = (SubLObject)cb_template_oe.NIL, i = (SubLObject)cb_template_oe.ZERO_INTEGER; !i.numGE(boxes); i = number_utilities.f_1X(i)) {
            if (cb_template_oe.NIL != html_utilities.html_extract_input(PrintLow.format((SubLObject)cb_template_oe.NIL, (SubLObject)cb_template_oe.$str174$_A, i), args)) {
                Eval.eval(ConsesLow.nth(i, forms));
            }
        }
        user_actions.delete_user_action(user_actions.user_action_by_id_string(id_string));
        cb_utilities.cb_message_page_with_history((SubLObject)cb_template_oe.$str175$TOE__Forms_Added_to_Agenda, (SubLObject)cb_template_oe.T);
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 28765L)
    public static SubLObject destructure_template_op(final SubLObject op) {
        SubLObject form = op.first();
        final SubLObject mt = conses_high.second(op);
        SubLObject strength = conses_high.third(op);
        SubLObject direction = conses_high.fourth(op);
        if (form.isString()) {
            form = reader.read_from_string(form, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        if (strength.isString()) {
            strength = reader.read_from_string(strength, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        if (direction.isString()) {
            direction = reader.read_from_string(direction, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        return Values.values(form, mt, strength, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 29279L)
    public static SubLObject template_substitute_in_form(final SubLObject alist, final SubLObject form, final SubLObject mt, final SubLObject type) {
        SubLObject temp_form = form;
        SubLObject temp_mt = mt;
        SubLObject cdolist_list_var = alist;
        SubLObject pair = (SubLObject)cb_template_oe.NIL;
        pair = cdolist_list_var.first();
        while (cb_template_oe.NIL != cdolist_list_var) {
            final SubLObject hl_term = pair.rest();
            final SubLObject v_term = cycl_utilities.hl_to_el(hl_term);
            final SubLObject variable = pair.first();
            if (cb_template_oe.NIL != Strings.string_equal(type, (SubLObject)cb_template_oe.$str67$kill, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED)) {
                temp_form = list_utilities.quotify(v_term);
            }
            else {
                temp_mt = conses_high.subst(v_term, variable, temp_mt, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
                temp_form = conses_high.subst(v_term, variable, temp_form, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return Values.values(temp_form, temp_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 29777L)
    public static SubLObject cb_show_template_query(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject query_formula = cb_get_ask_from_args(args);
        final SubLObject query_mt = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_template_oe.NIL != inference) {
            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str51$inference, cb_query.cb_inference_identifier(inference), (SubLObject)cb_template_oe.UNPROVIDED);
            cb_show_template_query_inference(inference, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        else {
            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str120$query_spec, PrintLow.format((SubLObject)cb_template_oe.NIL, (SubLObject)cb_template_oe.$str177$_S, query_formula), (SubLObject)cb_template_oe.UNPROVIDED);
            html_utilities.html_hidden_input((SubLObject)cb_template_oe.$str121$query_mt, cb_utilities.cb_string_for_mt(query_mt), (SubLObject)cb_template_oe.UNPROVIDED);
            cb_query.cb_show_query(query_formula, query_mt, (SubLObject)cb_template_oe.$str154$Current_query);
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 30285L)
    public static SubLObject cb_show_template_query_answers(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject query_formula = cb_get_ask_from_args(args);
        final SubLObject query_mt = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_template_oe.NIL != inference) {
            html_utilities.html_hr((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
            cb_query.cb_show_query_answer_section(inference, cb_template_oe.$template_query_show_answer_count$.getDynamicValue(thread));
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 30603L)
    public static SubLObject cb_show_template_specification_and_submit(final SubLObject specification_string, final SubLObject submit_input_label, final SubLObject submit_input_string) {
        html_utilities.html_hr((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(specification_string);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
        html_utilities.html_indent((SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_submit_input(submit_input_label, submit_input_string, (SubLObject)cb_template_oe.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 30935L)
    public static SubLObject cb_show_template_input_area(final SubLObject with_strength_and_directionP, SubLObject default_sentence, SubLObject default_mt, SubLObject prefix_string) {
        if (default_sentence == cb_template_oe.UNPROVIDED) {
            default_sentence = (SubLObject)cb_template_oe.NIL;
        }
        if (default_mt == cb_template_oe.UNPROVIDED) {
            default_mt = (SubLObject)cb_template_oe.NIL;
        }
        if (prefix_string == cb_template_oe.UNPROVIDED) {
            prefix_string = (SubLObject)cb_template_oe.$str113$template;
        }
        html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
        cb_form_widgets.cb_mt_input_section(default_mt, (SubLObject)ConsesLow.listS((SubLObject)cb_template_oe.$kw118$INPUT_NAME, Sequences.cconcatenate(prefix_string, (SubLObject)cb_template_oe.$str117$_mt), (SubLObject)cb_template_oe.$list25));
        if (cb_template_oe.NIL != with_strength_and_directionP) {
            cb_assertion_editor.cb_strength_and_direction_section((SubLObject)cb_template_oe.$str178$strength, (SubLObject)cb_template_oe.$str179$direction, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        else {
            html_utilities.html_newline((SubLObject)cb_template_oe.UNPROVIDED);
        }
        cb_form_widgets.cb_el_sentence_input_section(default_sentence, (SubLObject)ConsesLow.listS((SubLObject)cb_template_oe.$kw118$INPUT_NAME, Sequences.cconcatenate(prefix_string, (SubLObject)cb_template_oe.$str116$_sentence), (SubLObject)cb_template_oe.$list180));
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 31589L)
    public static SubLObject cb_toe_mt_error_page() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_template_oe.$str181$Template_OE__Error;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_template_oe.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_template_oe.$str3$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_template_oe.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_template_oe.$str4$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
            final SubLObject _prev_bind_0_$71 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_template_oe.$kw5$UNINITIALIZED) ? ConsesLow.list(cb_template_oe.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_template_oe.$kw6$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_template_oe.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                final SubLObject _prev_bind_0_$72 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_template_oe.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_template_oe.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_template_oe.$str9$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                    final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_template_oe.$str10$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str11$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_template_oe.$str12$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str13$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            if (cb_template_oe.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_template_oe.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_template_oe.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        final SubLObject size_val = (SubLObject)cb_template_oe.SIX_INTEGER;
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (cb_template_oe.NIL != size_val) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                            html_utilities.html_markup(size_val);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_template_oe.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_template_oe.UNPROVIDED);
                        final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_template_oe.T, thread);
                            html_utilities.html_princ((SubLObject)cb_template_oe.$str182$Cyc_Error);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_br();
                        html_utilities.html_br();
                        html_utilities.html_princ((SubLObject)cb_template_oe.$str183$The_Mt_you_have_entered_is_invali);
                        html_utilities.html_br();
                        html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$72, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$71, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_template_oe.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_template_oe.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 31858L)
    public static SubLObject cb_get_ask_from_args(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_identifier = html_utilities.html_extract_input((SubLObject)cb_template_oe.$str51$inference, args);
        final SubLObject inference = cb_query.cb_guess_inference_from_identifier(inference_identifier);
        if (cb_template_oe.NIL != inference) {
            return Values.values((SubLObject)cb_template_oe.NIL, (SubLObject)cb_template_oe.NIL, inference);
        }
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, (SubLObject)cb_template_oe.UNPROVIDED, (SubLObject)cb_template_oe.UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_template_oe.NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)cb_template_oe.$list92);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_template_oe.NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, (SubLObject)cb_template_oe.UNPROVIDED);
        }
        return Values.values(sentence, mt, (SubLObject)cb_template_oe.NIL);
    }
    
    public static SubLObject declare_cb_template_oe_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_toe_query", "CB-TOE-QUERY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_link_template_oe_inference", "CB-LINK-TEMPLATE-OE-INFERENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_toe_inference", "CB-TOE-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_toe_inference_guts", "CB-TOE-INFERENCE-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_show_template_query_inference", "CB-SHOW-TEMPLATE-QUERY-INFERENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_handle_template_oe", "CB-HANDLE-TEMPLATE-OE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_link_template_oe_inference_handler", "CB-LINK-TEMPLATE-OE-INFERENCE-HANDLER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_assert", "CB-TEMPLATE-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_unassert", "CB-TEMPLATE-UNASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_edit", "CB-TEMPLATE-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_kill", "CB-TEMPLATE-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_blast", "CB-TEMPLATE-BLAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_repropagate", "CB-TEMPLATE-REPROPAGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_redo_tms", "CB-TEMPLATE-REDO-TMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_change_assertion_properties", "CB-TEMPLATE-CHANGE-ASSERTION-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_merge", "CB-TEMPLATE-MERGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_handle_toe_test_query", "CB-HANDLE-TOE-TEST-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_assert_internals", "CB-TEMPLATE-ASSERT-INTERNALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_handle_template_assert", "CB-HANDLE-TEMPLATE-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_unassert_internals", "CB-TEMPLATE-UNASSERT-INTERNALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_handle_template_unassert", "CB-HANDLE-TEMPLATE-UNASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_edit_internals", "CB-TEMPLATE-EDIT-INTERNALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_handle_template_edit", "CB-HANDLE-TEMPLATE-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_blast_internals", "CB-TEMPLATE-BLAST-INTERNALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_handle_template_blast", "CB-HANDLE-TEMPLATE-BLAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_repropagate_internals", "CB-TEMPLATE-REPROPAGATE-INTERNALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_handle_template_repropagate", "CB-HANDLE-TEMPLATE-REPROPAGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_template_redo_tms_internals", "CB-TEMPLATE-REDO-TMS-INTERNALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_handle_template_redo_tms", "CB-HANDLE-TEMPLATE-REDO-TMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_handle_template_internals", "CB-HANDLE-TEMPLATE-INTERNALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "get_template_form_specs", "GET-TEMPLATE-FORM-SPECS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "get_list_with_query_spec_and_mt", "GET-LIST-WITH-QUERY-SPEC-AND-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_handle_template_output", "CB-HANDLE-TEMPLATE-OUTPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "get_toe_template_forms", "GET-TOE-TEMPLATE-FORMS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_show_template", "CB-SHOW-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_show_assertion_template", "CB-SHOW-ASSERTION-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_toe_operations_summary", "CB-TOE-OPERATIONS-SUMMARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_toe_operations_display", "CB-TOE-OPERATIONS-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_show_toe_template_results", "CB-SHOW-TOE-TEMPLATE-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_toe_operations_handler", "CB-TOE-OPERATIONS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "destructure_template_op", "DESTRUCTURE-TEMPLATE-OP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "template_substitute_in_form", "TEMPLATE-SUBSTITUTE-IN-FORM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_show_template_query", "CB-SHOW-TEMPLATE-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_show_template_query_answers", "CB-SHOW-TEMPLATE-QUERY-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_show_template_specification_and_submit", "CB-SHOW-TEMPLATE-SPECIFICATION-AND-SUBMIT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_show_template_input_area", "CB-SHOW-TEMPLATE-INPUT-AREA", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_toe_mt_error_page", "CB-TOE-MT-ERROR-PAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_template_oe", "cb_get_ask_from_args", "CB-GET-ASK-FROM-ARGS", 1, 0, false);
        return (SubLObject)cb_template_oe.NIL;
    }
    
    public static SubLObject init_cb_template_oe_file() {
        cb_template_oe.$template_query_show_answer_count$ = SubLFiles.defparameter("*TEMPLATE-QUERY-SHOW-ANSWER-COUNT*", (SubLObject)cb_template_oe.TWENTY_INTEGER);
        cb_template_oe.$cb_toe_resulting_forms_abbreviation_cutoff$ = SubLFiles.defparameter("*CB-TOE-RESULTING-FORMS-ABBREVIATION-CUTOFF*", (SubLObject)cb_template_oe.$int156$100);
        return (SubLObject)cb_template_oe.NIL;
    }
    
    public static SubLObject setup_cb_template_oe_file() {
        Hashtables.sethash((SubLObject)cb_template_oe.$kw0$CB_TOE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$str1$cb_toe_html, (SubLObject)cb_template_oe.NIL));
        cb_utilities.setup_cb_link_method((SubLObject)cb_template_oe.$kw44$TEMPLATE_OE_INFERENCE, (SubLObject)cb_template_oe.$sym45$CB_LINK_TEMPLATE_OE_INFERENCE, (SubLObject)cb_template_oe.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym48$CB_TOE_INFERENCE, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym61$CB_HANDLE_TEMPLATE_OE, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_template_oe.$kw53$TEMPLATE_OE_INFERENCE_HANDLER, (SubLObject)cb_template_oe.$sym63$CB_LINK_TEMPLATE_OE_INFERENCE_HANDLER, (SubLObject)cb_template_oe.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym64$CB_TEMPLATE_ASSERT, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym65$CB_TEMPLATE_UNASSERT, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym66$CB_TEMPLATE_EDIT, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym68$CB_TEMPLATE_KILL, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym69$CB_TEMPLATE_BLAST, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym70$CB_TEMPLATE_REPROPAGATE, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym71$CB_TEMPLATE_REDO_TMS, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym72$CB_TEMPLATE_CHANGE_ASSERTION_PROPERTIES, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym73$CB_TEMPLATE_MERGE, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym80$CB_HANDLE_TEMPLATE_ASSERT, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym86$CB_HANDLE_TEMPLATE_UNASSERT, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym94$CB_HANDLE_TEMPLATE_EDIT, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym100$CB_HANDLE_TEMPLATE_BLAST, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym106$CB_HANDLE_TEMPLATE_REPROPAGATE, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym112$CB_HANDLE_TEMPLATE_REDO_TMS, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        final SubLObject new_action_type = user_actions.make_action_type((SubLObject)cb_template_oe.$list139);
        user_actions._csetf_action_type_key(new_action_type, (SubLObject)cb_template_oe.$kw133$TOE_OPERATIONS);
        Hashtables.sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
        Hashtables.sethash((SubLObject)cb_template_oe.$kw148$CB_TOE_TEMPLATE_RESULTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_template_oe.$str149$cb_toe_template_results_html, (SubLObject)cb_template_oe.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym155$CB_TOE_OPERATIONS_DISPLAY, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_template_oe.$sym176$CB_TOE_OPERATIONS_HANDLER, (SubLObject)cb_template_oe.$kw49$HTML_HANDLER);
        return (SubLObject)cb_template_oe.NIL;
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
    
    static {
        me = (SubLFile)new cb_template_oe();
        cb_template_oe.$template_query_show_answer_count$ = null;
        cb_template_oe.$cb_toe_resulting_forms_abbreviation_cutoff$ = null;
        $kw0$CB_TOE = SubLObjectFactory.makeKeyword("CB-TOE");
        $str1$cb_toe_html = SubLObjectFactory.makeString("cb-toe.html");
        $str2$Template_OE__Query_Specification = SubLObjectFactory.makeString("Template OE: Query Specification");
        $str3$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str4$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw5$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw6$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw7$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw8$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str9$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str10$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str11$button = SubLObjectFactory.makeString("button");
        $str12$reload = SubLObjectFactory.makeString("reload");
        $str13$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str14$post = SubLObjectFactory.makeString("post");
        $str15$cb_handle_template_oe = SubLObjectFactory.makeString("cb-handle-template-oe");
        $str16$Clear_All_Fields = SubLObjectFactory.makeString("Clear All Fields");
        $str17$Run_Query = SubLObjectFactory.makeString("Run Query");
        $str18$query_test = SubLObjectFactory.makeString("query-test");
        $str19$cb_toe_parameters = SubLObjectFactory.makeString("cb-toe-parameters");
        $str20$Show = SubLObjectFactory.makeString("Show");
        $str21$Hide = SubLObjectFactory.makeString("Hide");
        $str22$Query_Context = SubLObjectFactory.makeString("Query Context");
        $kw23$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $kw24$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTIME-PSC-ALLOWED?"), (SubLObject)cb_template_oe.NIL);
        $list26 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INPUT-NAME"), SubLObjectFactory.makeString("query-sentence"), SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), SubLObjectFactory.makeString("Complete"), SubLObjectFactory.makeKeyword("CYCLIFY-LABEL"), SubLObjectFactory.makeString("Cyclify"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), SubLObjectFactory.makeString("Clear Sentence"), SubLObjectFactory.makeKeyword("HEIGHT"), cb_template_oe.TEN_INTEGER, SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeInteger(80) });
        $str27$Available_Templates_ = SubLObjectFactory.makeString("Available Templates:");
        $str28$Assert = SubLObjectFactory.makeString("Assert");
        $str29$template_assert = SubLObjectFactory.makeString("template-assert");
        $str30$Unassert = SubLObjectFactory.makeString("Unassert");
        $str31$template_unassert = SubLObjectFactory.makeString("template-unassert");
        $str32$Edit = SubLObjectFactory.makeString("Edit");
        $str33$template_edit = SubLObjectFactory.makeString("template-edit");
        $str34$Kill = SubLObjectFactory.makeString("Kill");
        $str35$template_kill = SubLObjectFactory.makeString("template-kill");
        $str36$Blast = SubLObjectFactory.makeString("Blast");
        $str37$template_blast = SubLObjectFactory.makeString("template-blast");
        $str38$Repropagate = SubLObjectFactory.makeString("Repropagate");
        $str39$template_repropagate = SubLObjectFactory.makeString("template-repropagate");
        $str40$_Template_OE_ = SubLObjectFactory.makeString("[Template OE]");
        $sym41$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $kw42$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str43$cb_toe_inference__A = SubLObjectFactory.makeString("cb-toe-inference&~A");
        $kw44$TEMPLATE_OE_INFERENCE = SubLObjectFactory.makeKeyword("TEMPLATE-OE-INFERENCE");
        $sym45$CB_LINK_TEMPLATE_OE_INFERENCE = SubLObjectFactory.makeSymbol("CB-LINK-TEMPLATE-OE-INFERENCE");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-IDENTIFIER"));
        $str47$That_inference_is_no_longer_avail = SubLObjectFactory.makeString("That inference is no longer available.");
        $sym48$CB_TOE_INFERENCE = SubLObjectFactory.makeSymbol("CB-TOE-INFERENCE");
        $kw49$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str50$Template_OE__Inference = SubLObjectFactory.makeString("Template OE: Inference");
        $str51$inference = SubLObjectFactory.makeString("inference");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLER"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"));
        $kw53$TEMPLATE_OE_INFERENCE_HANDLER = SubLObjectFactory.makeKeyword("TEMPLATE-OE-INFERENCE-HANDLER");
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-assert"), (SubLObject)SubLObjectFactory.makeString("[Assert]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-unassert"), (SubLObject)SubLObjectFactory.makeString("[Unassert]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-edit"), (SubLObject)SubLObjectFactory.makeString("[Edit]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-kill"), (SubLObject)SubLObjectFactory.makeString("[Kill]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-blast"), (SubLObject)SubLObjectFactory.makeString("[Blast]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-repropagate"), (SubLObject)SubLObjectFactory.makeString("[Repropagate]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-redo-tms"), (SubLObject)SubLObjectFactory.makeString("[Redo TMS]")));
        $str55$Inference___ = SubLObjectFactory.makeString("Inference : ");
        $kw56$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $str57$_Refresh_ = SubLObjectFactory.makeString("[Refresh]");
        $kw58$DISABLED = SubLObjectFactory.makeKeyword("DISABLED");
        $str59$template_redo_tms = SubLObjectFactory.makeString("template-redo-tms");
        $str60$Submission_was_not_understood_ = SubLObjectFactory.makeString("Submission was not understood.");
        $sym61$CB_HANDLE_TEMPLATE_OE = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-OE");
        $str62$cb_handle_template_oe__A__A_infer = SubLObjectFactory.makeString("cb-handle-template-oe&~A=~A&inference=~A");
        $sym63$CB_LINK_TEMPLATE_OE_INFERENCE_HANDLER = SubLObjectFactory.makeSymbol("CB-LINK-TEMPLATE-OE-INFERENCE-HANDLER");
        $sym64$CB_TEMPLATE_ASSERT = SubLObjectFactory.makeSymbol("CB-TEMPLATE-ASSERT");
        $sym65$CB_TEMPLATE_UNASSERT = SubLObjectFactory.makeSymbol("CB-TEMPLATE-UNASSERT");
        $sym66$CB_TEMPLATE_EDIT = SubLObjectFactory.makeSymbol("CB-TEMPLATE-EDIT");
        $str67$kill = SubLObjectFactory.makeString("kill");
        $sym68$CB_TEMPLATE_KILL = SubLObjectFactory.makeSymbol("CB-TEMPLATE-KILL");
        $sym69$CB_TEMPLATE_BLAST = SubLObjectFactory.makeSymbol("CB-TEMPLATE-BLAST");
        $sym70$CB_TEMPLATE_REPROPAGATE = SubLObjectFactory.makeSymbol("CB-TEMPLATE-REPROPAGATE");
        $sym71$CB_TEMPLATE_REDO_TMS = SubLObjectFactory.makeSymbol("CB-TEMPLATE-REDO-TMS");
        $sym72$CB_TEMPLATE_CHANGE_ASSERTION_PROPERTIES = SubLObjectFactory.makeSymbol("CB-TEMPLATE-CHANGE-ASSERTION-PROPERTIES");
        $sym73$CB_TEMPLATE_MERGE = SubLObjectFactory.makeSymbol("CB-TEMPLATE-MERGE");
        $str74$Template_OE__Query_Results = SubLObjectFactory.makeString("Template OE: Query Results");
        $str75$Template_OE__Assert = SubLObjectFactory.makeString("Template OE: Assert");
        $str76$cb_handle_template_assert = SubLObjectFactory.makeString("cb-handle-template-assert");
        $str77$Assert_Specification = SubLObjectFactory.makeString("Assert Specification");
        $str78$Run_Template_Assert = SubLObjectFactory.makeString("Run Template Assert");
        $str79$assert = SubLObjectFactory.makeString("assert");
        $sym80$CB_HANDLE_TEMPLATE_ASSERT = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-ASSERT");
        $str81$Template_OE__Unassert = SubLObjectFactory.makeString("Template OE: Unassert");
        $str82$cb_handle_template_unassert = SubLObjectFactory.makeString("cb-handle-template-unassert");
        $str83$Unassert_Specification = SubLObjectFactory.makeString("Unassert Specification");
        $str84$Run_Template_Unassert = SubLObjectFactory.makeString("Run Template Unassert");
        $str85$unassert = SubLObjectFactory.makeString("unassert");
        $sym86$CB_HANDLE_TEMPLATE_UNASSERT = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-UNASSERT");
        $str87$Template_OE__Edit = SubLObjectFactory.makeString("Template OE: Edit");
        $str88$cb_handle_template_edit = SubLObjectFactory.makeString("cb-handle-template-edit");
        $str89$Edit_Specification = SubLObjectFactory.makeString("Edit Specification");
        $str90$Run_Template_Edit = SubLObjectFactory.makeString("Run Template Edit");
        $str91$edit = SubLObjectFactory.makeString("edit");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("query-sentence"));
        $str93$mt_monad = SubLObjectFactory.makeString("mt-monad");
        $sym94$CB_HANDLE_TEMPLATE_EDIT = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-EDIT");
        $str95$Template_OE__Blast = SubLObjectFactory.makeString("Template OE: Blast");
        $str96$cb_handle_template_blast = SubLObjectFactory.makeString("cb-handle-template-blast");
        $str97$Blast_Specification = SubLObjectFactory.makeString("Blast Specification");
        $str98$Run_Template_Blast = SubLObjectFactory.makeString("Run Template Blast");
        $str99$blast = SubLObjectFactory.makeString("blast");
        $sym100$CB_HANDLE_TEMPLATE_BLAST = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-BLAST");
        $str101$Template_OE__Repropagate = SubLObjectFactory.makeString("Template OE: Repropagate");
        $str102$cb_handle_template_repropagate = SubLObjectFactory.makeString("cb-handle-template-repropagate");
        $str103$Repropagate_Specification = SubLObjectFactory.makeString("Repropagate Specification");
        $str104$Run_Template_Repropagate = SubLObjectFactory.makeString("Run Template Repropagate");
        $str105$repropagate = SubLObjectFactory.makeString("repropagate");
        $sym106$CB_HANDLE_TEMPLATE_REPROPAGATE = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-REPROPAGATE");
        $str107$Template_OE__Redo_TMS = SubLObjectFactory.makeString("Template OE: Redo TMS");
        $str108$cb_handle_template_redo_tms = SubLObjectFactory.makeString("cb-handle-template-redo-tms");
        $str109$Redo_TMS_Specification = SubLObjectFactory.makeString("Redo TMS Specification");
        $str110$Run_Template_Redo_TMS = SubLObjectFactory.makeString("Run Template Redo TMS");
        $str111$redo_tms = SubLObjectFactory.makeString("redo-tms");
        $sym112$CB_HANDLE_TEMPLATE_REDO_TMS = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-REDO-TMS");
        $str113$template = SubLObjectFactory.makeString("template");
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unassert"), (SubLObject)SubLObjectFactory.makeString("blast"), (SubLObject)SubLObjectFactory.makeString("repropagate"), (SubLObject)SubLObjectFactory.makeString("redo-tms"));
        $sym115$STRING_EQUAL = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $str116$_sentence = SubLObjectFactory.makeString("-sentence");
        $str117$_mt = SubLObjectFactory.makeString("-mt");
        $kw118$INPUT_NAME = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-VARIABLE?"), (SubLObject)cb_template_oe.T);
        $str120$query_spec = SubLObjectFactory.makeString("query-spec");
        $str121$query_mt = SubLObjectFactory.makeString("query-mt");
        $kw122$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym123$KE_KILL = SubLObjectFactory.makeSymbol("KE-KILL");
        $sym124$KE_ASSERT = SubLObjectFactory.makeSymbol("KE-ASSERT");
        $sym125$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym126$KE_UNASSERT = SubLObjectFactory.makeSymbol("KE-UNASSERT");
        $sym127$FI_BLAST = SubLObjectFactory.makeSymbol("FI-BLAST");
        $sym128$KE_REPROPAGATE_ASSERTION = SubLObjectFactory.makeSymbol("KE-REPROPAGATE-ASSERTION");
        $sym129$FIND_ASSERTION_CYCL = SubLObjectFactory.makeSymbol("FIND-ASSERTION-CYCL");
        $sym130$KE_TMS_RECONSIDER_ASSERTION = SubLObjectFactory.makeSymbol("KE-TMS-RECONSIDER-ASSERTION");
        $kw131$CYCLIST = SubLObjectFactory.makeKeyword("CYCLIST");
        $kw132$TYPE_KEY = SubLObjectFactory.makeKeyword("TYPE-KEY");
        $kw133$TOE_OPERATIONS = SubLObjectFactory.makeKeyword("TOE-OPERATIONS");
        $kw134$DATA = SubLObjectFactory.makeKeyword("DATA");
        $str135$Current_ = SubLObjectFactory.makeString("Current ");
        $str136$_Template_in_ = SubLObjectFactory.makeString(" Template in ");
        $str137$__ = SubLObjectFactory.makeString(" :");
        $str138$Submission_was_not_understood = SubLObjectFactory.makeString("Submission was not understood");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUMMARY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-TOE-OPERATIONS-SUMMARY"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-TOE-OPERATIONS-DISPLAY"), (SubLObject)SubLObjectFactory.makeKeyword("HANDLER-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-TOE-OPERATIONS-HANDLER"));
        $str140$Evaluate_ = SubLObjectFactory.makeString("Evaluate ");
        $str141$_forms_from_ = SubLObjectFactory.makeString(" forms from ");
        $str142$_template_ = SubLObjectFactory.makeString(" template ");
        $str143$_in_ = SubLObjectFactory.makeString(" in ");
        $str144$_with_bindings_from_ = SubLObjectFactory.makeString(" with bindings from ");
        $str145$_with_query = SubLObjectFactory.makeString(" with query");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str147$query_ = SubLObjectFactory.makeString("query ");
        $kw148$CB_TOE_TEMPLATE_RESULTS = SubLObjectFactory.makeKeyword("CB-TOE-TEMPLATE-RESULTS");
        $str149$cb_toe_template_results_html = SubLObjectFactory.makeString("cb-toe-template-results.html");
        $str150$Template_OE__Resulting_Forms = SubLObjectFactory.makeString("Template OE: Resulting Forms");
        $str151$cb_toe_operations_handler = SubLObjectFactory.makeString("cb-toe-operations-handler");
        $str152$id_string = SubLObjectFactory.makeString("id-string");
        $str153$Current_Inference___ = SubLObjectFactory.makeString("Current Inference : ");
        $str154$Current_query = SubLObjectFactory.makeString("Current query");
        $sym155$CB_TOE_OPERATIONS_DISPLAY = SubLObjectFactory.makeSymbol("CB-TOE-OPERATIONS-DISPLAY");
        $int156$100 = SubLObjectFactory.makeInteger(100);
        $str157$Add_Forms_to_Agenda = SubLObjectFactory.makeString("Add Forms to Agenda");
        $str158$boxes = SubLObjectFactory.makeString("boxes");
        $str159$100_ = SubLObjectFactory.makeString("100%");
        $str160$OK_ = SubLObjectFactory.makeString("OK?");
        $str161$_2 = SubLObjectFactory.makeString("+2");
        $str162$Operations_ = SubLObjectFactory.makeString("Operations:");
        $str163$Below_forms_abbreviated__no_links = SubLObjectFactory.makeString("Below forms abbreviated (no links) since there are more than ");
        $str164$_of_them_ = SubLObjectFactory.makeString(" of them.");
        $str165$_dddddd = SubLObjectFactory.makeString("#dddddd");
        $str166$_cccccc = SubLObjectFactory.makeString("#cccccc");
        $kw167$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str168$_Check_All_ = SubLObjectFactory.makeString("[Check All]");
        $str169$this_document_forms_0_ = SubLObjectFactory.makeString("this.document.forms[0]");
        $str170$__ = SubLObjectFactory.makeString(".*");
        $str171$T = SubLObjectFactory.makeString("T");
        $str172$_Uncheck_All_ = SubLObjectFactory.makeString("[Uncheck All]");
        $str173$NIL = SubLObjectFactory.makeString("NIL");
        $str174$_A = SubLObjectFactory.makeString("~A");
        $str175$TOE__Forms_Added_to_Agenda = SubLObjectFactory.makeString("TOE: Forms Added to Agenda");
        $sym176$CB_TOE_OPERATIONS_HANDLER = SubLObjectFactory.makeSymbol("CB-TOE-OPERATIONS-HANDLER");
        $str177$_S = SubLObjectFactory.makeString("~S");
        $str178$strength = SubLObjectFactory.makeString("strength");
        $str179$direction = SubLObjectFactory.makeString("direction");
        $list180 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), SubLObjectFactory.makeString("Complete"), SubLObjectFactory.makeKeyword("CYCLIFY-LABEL"), SubLObjectFactory.makeString("Cyclify"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), SubLObjectFactory.makeString("Clear Sentence"), SubLObjectFactory.makeKeyword("HEIGHT"), cb_template_oe.TEN_INTEGER, SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeInteger(80) });
        $str181$Template_OE__Error = SubLObjectFactory.makeString("Template OE: Error");
        $str182$Cyc_Error = SubLObjectFactory.makeString("Cyc Error");
        $str183$The_Mt_you_have_entered_is_invali = SubLObjectFactory.makeString("The Mt you have entered is invalid.");
    }
}

/*

	Total time: 1014 ms
	
*/