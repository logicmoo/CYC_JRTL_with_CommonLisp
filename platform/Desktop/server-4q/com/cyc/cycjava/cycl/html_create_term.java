package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_create_term extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.html_create_term";
    public static final String myFingerPrint = "a68669d646a9e31202d4dfdc430ff763d246d212066a497a66f64033f93f707c";
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 807L)
    public static SubLSymbol $cb_create_info$;
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 5959L)
    public static SubLSymbol $cb_categorize_info$;
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 10748L)
    private static SubLSymbol $cb_categorize_generalization_possibilities$;
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 27918L)
    private static SubLSymbol $ke_requirements_query$;
    private static final SubLSymbol $sym0$_CB_CREATE_INFO_;
    private static final SubLSymbol $kw1$CB_CREATE_TERM;
    private static final SubLString $str2$cb_create_term_html;
    private static final SubLString $str3$the_Create_Term_page;
    private static final SubLString $str4$Create_Term;
    private static final SubLString $str5$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str6$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw7$UNINITIALIZED;
    private static final SubLSymbol $kw8$CB_CYC;
    private static final SubLSymbol $kw9$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw10$SHA1;
    private static final SubLString $str11$yui_skin_sam;
    private static final SubLString $str12$reloadFrameButton;
    private static final SubLString $str13$button;
    private static final SubLString $str14$reload;
    private static final SubLString $str15$Refresh_Frames;
    private static final SubLString $str16$post;
    private static final SubLString $str17$cb_handle_create_term;
    private static final SubLSymbol $kw18$SELF;
    private static final SubLString $str19$Cancel_Create;
    private static final SubLString $str20$Reset;
    private static final SubLString $str21$Create_Constant;
    private static final SubLSymbol $kw22$TOP;
    private static final SubLString $str23$Name__required____;
    private static final SubLString $str24$new_name;
    private static final SubLString $str25$Clear;
    private static final SubLString $str26$Complete;
    private static final SubLString $str27$;
    private static final SubLInteger $int28$35;
    private static final SubLObject $const29$termStrings;
    private static final SubLString $str30$__one_per_line__optional____;
    private static final SubLString $str31$term_strings;
    private static final SubLSymbol $kw32$BOTTOM;
    private static final SubLObject $const33$comment;
    private static final SubLString $str34$__required____;
    private static final SubLString $str35$comment;
    private static final SubLInteger $int36$80;
    private static final SubLString $str37$virtual;
    private static final SubLSymbol $sym38$CB_CREATE_TERM;
    private static final SubLSymbol $kw39$HTML_HANDLER;
    private static final SubLString $str40$Creating;
    private static final SubLString $str41$No_name_was_specified;
    private static final SubLString $str42$_S_is_not_a_valid_constant_name;
    private static final SubLString $str43$No_comment_was_specified;
    private static final SubLString $str44$Unable_to_create_a_constant_named;
    private static final SubLSymbol $sym45$CB_HANDLE_CREATE_TERM;
    private static final SubLSymbol $kw46$MAIN;
    private static final SubLString $str47$cb_create_term;
    private static final SubLSymbol $kw48$CREATE_TERM;
    private static final SubLSymbol $sym49$CB_LINK_CREATE_TERM;
    private static final SubLString $str50$Crt;
    private static final SubLString $str51$Cyc_Constant_Creation_Wizard;
    private static final SubLSymbol $sym52$STRINGP;
    private static final SubLSymbol $kw53$DEFAULT;
    private static final SubLSymbol $kw54$FORWARD;
    private static final SubLObject $const55$TemporaryLexicalAssertionsMt;
    private static final SubLSymbol $sym56$CR_OR_LF;
    private static final SubLString $str57$_a_does_not_specify_a_Cyc_term;
    private static final SubLSymbol $sym58$CB_CATEGORIZE_TERM;
    private static final SubLString $str59$Categorize_Term;
    private static final SubLString $str60$cb_categorize_term__a;
    private static final SubLSymbol $kw61$CATEGORIZE_TERM;
    private static final SubLSymbol $sym62$CB_LINK_CATEGORIZE_TERM;
    private static final SubLSymbol $sym63$_CB_CATEGORIZE_INFO_;
    private static final SubLSymbol $kw64$CB_CATEGORIZE_TERM;
    private static final SubLString $str65$cb_categorize_term_html;
    private static final SubLSymbol $sym66$FORT_P;
    private static final SubLString $str67$cb_handle_categorize_term;
    private static final SubLString $str68$Categorize;
    private static final SubLString $str69$Categorize_;
    private static final SubLString $str70$_;
    private static final SubLString $str71$term;
    private static final SubLString $str72$Mt___;
    private static final SubLString $str73$mt;
    private static final SubLObject $const74$Microtheory;
    private static final SubLString $str75$Similar_to___;
    private static final SubLString $str76$similar_to;
    private static final SubLInteger $int77$40;
    private static final SubLString $str78$Instance_of___;
    private static final SubLString $str79$isa;
    private static final SubLString $str80$Specialization_of___;
    private static final SubLString $str81$genl;
    private static final SubLString $str82$generalization;
    private static final SubLString $str83$_a_does_not_specify_a_Cyc_Microth;
    private static final SubLSymbol $sym84$CB_HANDLE_CATEGORIZE_TERM;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const87$EverythingPSC;
    private static final SubLObject $const88$isa;
    private static final SubLSymbol $kw89$GAF;
    private static final SubLSymbol $kw90$TRUE;
    private static final SubLSymbol $kw91$MONOTONIC;
    private static final SubLObject $const92$genls;
    private static final SubLList $list93;
    private static final SubLSymbol $kw94$CB_COPY_FROM_SIMILAR;
    private static final SubLString $str95$cb_copy_from_similar_html;
    private static final SubLString $str96$cb_handle_copy_from_similar;
    private static final SubLString $str97$Copy_from_;
    private static final SubLString $str98$_to_;
    private static final SubLString $str99$Copy_Assertions;
    private static final SubLString $str100$Check_the_assertions_from_;
    private static final SubLString $str101$_which_you_wish_to_copy__;
    private static final SubLSymbol $sym102$CB_COPY_FROM_SIMILAR_CHECKBOX;
    private static final SubLString $str103$copy_from_similar_facilities;
    private static final SubLString $str104$No_source_term_was_specified;
    private static final SubLString $str105$Unable_to_determine_a_term_from__;
    private static final SubLString $str106$No_term_was_specified;
    private static final SubLSymbol $sym107$CB_HANDLE_COPY_FROM_SIMILAR;
    private static final SubLSymbol $kw108$CB_CONCEPTUALLY_RELATED_TERMS;
    private static final SubLString $str109$cb_conceptually_related_terms_htm;
    private static final SubLString $str110$Conceptually_Related_Suggestions;
    private static final SubLString $str111$cb_conceptually_related_terms;
    private static final SubLString $str112$fort;
    private static final SubLString $str113$Clear_All;
    private static final SubLString $str114$Term___;
    private static final SubLString $str115$Existing_Conceptually_Related_Ter;
    private static final SubLSymbol $kw116$CT_CR_JUSTIFY;
    private static final SubLString $str117$_Justify_;
    private static final SubLString $str118$None;
    private static final SubLString $str119$Specify_the_Microtheory_for_new__;
    private static final SubLString $str120$_Mt___;
    private static final SubLString $str121$_Select_terms_and_or_type_in_a_te;
    private static final SubLString $str122$__;
    private static final SubLString $str123$entered;
    private static final SubLString $str124$_Term___;
    private static final SubLString $str125$Possible_Terms_to_Add___;
    private static final SubLString $str126$Add_Terms_Backward;
    private static final SubLString $str127$add_backward;
    private static final SubLString $str128$_as_;
    private static final SubLObject $const129$conceptuallyRelated;
    private static final SubLSymbol $sym130$TERM;
    private static final SubLString $str131$_in_MT;
    private static final SubLString $str132$Add_Terms_Forward;
    private static final SubLString $str133$add_forward;
    private static final SubLList $list134;
    private static final SubLString $str135$Unable_to_determine_last_term__wh;
    private static final SubLString $str136$Invalid_Mt_specified____S;
    private static final SubLSymbol $kw137$BACKWARD;
    private static final SubLSymbol $sym138$CB_CONCEPTUALLY_RELATED_TERMS;
    private static final SubLString $str139$id;
    private static final SubLString $str140$Formulas_Asserted;
    private static final SubLString $str141$Formulas_Asserted__;
    private static final SubLString $str142$_in_;
    private static final SubLSymbol $sym143$WHY_CONCEPTUALLY_RELATED_;
    private static final SubLString $str144$Sorry__System_74_92_or_later_is_r;
    private static final SubLString $str145$Justify_Conceptually_Related;
    private static final SubLSymbol $sym146$CT_CR_JUSTIFY;
    private static final SubLString $str147$ct_cr_justify__a;
    private static final SubLSymbol $sym148$CB_LINK_CT_CR_JUSTIFY;
    private static final SubLSymbol $sym149$CB_ELABORATE_TERM;
    private static final SubLString $str150$Elaborate_Term;
    private static final SubLString $str151$cb_elaborate_term__a;
    private static final SubLSymbol $kw152$ELABORATE_TERM;
    private static final SubLSymbol $sym153$CB_LINK_ELABORATE_TERM;
    private static final SubLSymbol $kw154$CB_ELABORATE_TERM;
    private static final SubLString $str155$cb_elaborate_term_html;
    private static final SubLString $str156$cb_handle_elaborate_term;
    private static final SubLString $str157$Elaborate;
    private static final SubLString $str158$Elaborate_;
    private static final SubLString $str159$Requirements___;
    private static final SubLString $str160$Suggestions___;
    private static final SubLList $list161;
    private static final SubLSymbol $kw162$TERM;
    private static final SubLObject $const163$InferencePSC;
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 995L)
    public static SubLObject cb_create_term(SubLObject args) {
        if (args == html_create_term.UNPROVIDED) {
            args = (SubLObject)html_create_term.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_create_term.NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn((SubLObject)html_create_term.$str3$the_Create_Term_page);
        }
        final SubLObject title_var = (SubLObject)html_create_term.$str4$Create_Term;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((html_create_term.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)html_create_term.$str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (html_create_term.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                html_utilities.html_markup((SubLObject)html_create_term.$str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_create_term.$kw7$UNINITIALIZED) ? ConsesLow.list(html_create_term.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)html_create_term.$kw8$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (html_create_term.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)html_create_term.$kw9$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)html_create_term.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (html_create_term.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)html_create_term.$str11$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_create_term.$str12$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str13$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str14$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)html_create_term.$str15$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            if (html_create_term.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (html_create_term.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)html_create_term.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_create_term.$str16$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        if (html_create_term.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)html_create_term.$str17$cb_handle_create_term, (SubLObject)html_create_term.T, (SubLObject)html_create_term.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)html_create_term.$kw1$CB_CREATE_TERM, (SubLObject)html_create_term.NIL, (SubLObject)html_create_term.UNPROVIDED);
                            cb_utilities.cb_back_button((SubLObject)html_create_term.$kw18$SELF, (SubLObject)html_create_term.$str19$Cancel_Create);
                            html_utilities.html_indent((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)html_create_term.$str20$Reset);
                            html_utilities.html_indent((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)html_create_term.$str21$Create_Constant, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)html_create_term.$kw22$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)html_create_term.$str23$Name__required____);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_script_utilities.html_clear_input_button((SubLObject)html_create_term.$str24$new_name, (SubLObject)html_create_term.$str25$Clear, (SubLObject)html_create_term.UNPROVIDED);
                                        html_complete.html_complete_button((SubLObject)html_create_term.$str24$new_name, (SubLObject)html_create_term.$str26$Complete, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_text_input((SubLObject)html_create_term.$str24$new_name, (SubLObject)html_create_term.$str27$, (SubLObject)html_create_term.$int28$35);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        cb_utilities.cb_form(html_create_term.$const29$termStrings, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_princ((SubLObject)html_create_term.$str30$__one_per_line__optional____);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_script_utilities.html_clear_input_button((SubLObject)html_create_term.$str31$term_strings, (SubLObject)html_create_term.$str25$Clear, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)html_create_term.$str31$term_strings);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)html_create_term.$int28$35);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)html_create_term.THREE_INTEGER);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)html_create_term.$kw32$BOTTOM));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        cb_utilities.cb_form(html_create_term.$const33$comment, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_princ((SubLObject)html_create_term.$str34$__required____);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_script_utilities.html_clear_input_button((SubLObject)html_create_term.$str35$comment, (SubLObject)html_create_term.$str25$Clear, (SubLObject)html_create_term.UNPROVIDED);
                                        html_complete.html_complete_button((SubLObject)html_create_term.$str35$comment, (SubLObject)html_create_term.$str26$Complete, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
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
                                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)html_create_term.$kw22$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)html_create_term.$str35$comment);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)html_create_term.$int36$80);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)html_create_term.TEN_INTEGER);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)html_create_term.$str37$virtual);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
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
                                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 2514L)
    public static SubLObject cb_handle_create_term(final SubLObject args) {
        if (html_create_term.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)html_create_term.$str40$Creating);
            return (SubLObject)html_create_term.NIL;
        }
        final SubLObject new_name = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)html_create_term.$str24$new_name, args));
        final SubLObject comment = html_utilities.html_extract_input((SubLObject)html_create_term.$str35$comment, args);
        final SubLObject term_string_text = html_utilities.html_extract_input((SubLObject)html_create_term.$str31$term_strings, args);
        SubLObject term_strings = (SubLObject)html_create_term.NIL;
        if (!new_name.isString() || new_name.equal((SubLObject)html_create_term.$str27$)) {
            cb_utilities.cb_error((SubLObject)html_create_term.$str41$No_name_was_specified, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        else if (html_create_term.NIL == constant_completion_high.valid_constant_name_p(new_name)) {
            cb_utilities.cb_error((SubLObject)html_create_term.$str42$_S_is_not_a_valid_constant_name, new_name, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        else {
            final SubLObject existing = constants_high.find_constant(new_name);
            if (html_create_term.NIL != existing) {
                return cb_categorize_term_guts(existing);
            }
        }
        if (!comment.isString() || comment.equal((SubLObject)html_create_term.$str27$)) {
            cb_utilities.cb_error((SubLObject)html_create_term.$str43$No_comment_was_specified, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        if (term_string_text.isString() && !term_strings.equal((SubLObject)html_create_term.$str27$)) {
            term_strings = cb_extract_lines(term_string_text);
        }
        final SubLObject new_constant = cb_create_term_hook(new_name, comment, term_strings);
        if (html_create_term.NIL != constant_handles.constant_p(new_constant)) {
            cb_tools.cb_add_to_constant_history(new_constant);
            cb_categorize_term_guts(new_constant);
        }
        else {
            cb_utilities.cb_error((SubLObject)html_create_term.$str44$Unable_to_create_a_constant_named, new_name, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 3910L)
    public static SubLObject cb_link_create_term(SubLObject linktext) {
        if (linktext == html_create_term.UNPROVIDED) {
            linktext = (SubLObject)html_create_term.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_create_term.NIL == linktext) {
            linktext = (SubLObject)html_create_term.$str4$Create_Term;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)html_create_term.$kw46$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)html_create_term.$str47$cb_create_term);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 4207L)
    public static SubLObject cb_create_term_hook(final SubLObject new_name, SubLObject comment, SubLObject term_strings) {
        if (comment == html_create_term.UNPROVIDED) {
            comment = (SubLObject)html_create_term.NIL;
        }
        if (term_strings == html_create_term.UNPROVIDED) {
            term_strings = (SubLObject)html_create_term.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_create_term.NIL != Types.stringp(new_name) : new_name;
        SubLObject new_constant = (SubLObject)html_create_term.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)html_create_term.NIL, thread);
            new_constant = ke.ke_create(new_name);
            if (html_create_term.NIL != new_constant) {
                if (comment.isString()) {
                    ke.ke_assert((SubLObject)ConsesLow.list(html_create_term.$const33$comment, new_constant, comment), mt_vars.$default_assert_mt$.getGlobalValue(), (SubLObject)html_create_term.$kw53$DEFAULT, (SubLObject)html_create_term.$kw54$FORWARD);
                }
                SubLObject cdolist_list_var = term_strings;
                SubLObject term_string = (SubLObject)html_create_term.NIL;
                term_string = cdolist_list_var.first();
                while (html_create_term.NIL != cdolist_list_var) {
                    assert html_create_term.NIL != Types.stringp(term_string) : term_string;
                    ke.ke_assert((SubLObject)ConsesLow.list(html_create_term.$const29$termStrings, new_constant, term_string), html_create_term.$const55$TemporaryLexicalAssertionsMt, (SubLObject)html_create_term.$kw53$DEFAULT, (SubLObject)html_create_term.$kw54$FORWARD);
                    cdolist_list_var = cdolist_list_var.rest();
                    term_string = cdolist_list_var.first();
                }
            }
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return new_constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 4815L)
    public static SubLObject cb_extract_lines(final SubLObject string) {
        return Sequences.delete((SubLObject)html_create_term.$str27$, cb_extract_lines_recursive(string, (SubLObject)html_create_term.ZERO_INTEGER), Symbols.symbol_function((SubLObject)html_create_term.EQUAL), (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 4925L)
    public static SubLObject cb_extract_lines_recursive(final SubLObject string, SubLObject start) {
        if (start == html_create_term.UNPROVIDED) {
            start = (SubLObject)html_create_term.ZERO_INTEGER;
        }
        final SubLObject position = Sequences.position_if(Symbols.symbol_function((SubLObject)html_create_term.$sym56$CR_OR_LF), string, Symbols.symbol_function((SubLObject)html_create_term.IDENTITY), start, (SubLObject)html_create_term.UNPROVIDED);
        if (position.isInteger()) {
            return (SubLObject)ConsesLow.cons(string_utilities.trim_whitespace(Sequences.subseq(string, start, position)), cb_extract_lines_recursive(string, Numbers.add(position, (SubLObject)html_create_term.ONE_INTEGER)));
        }
        return (SubLObject)ConsesLow.list(string_utilities.trim_whitespace(Sequences.subseq(string, start, (SubLObject)html_create_term.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 5276L)
    public static SubLObject cr_or_lf(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Characters.char_code(v_char).numE((SubLObject)html_create_term.TEN_INTEGER) || Characters.char_code(v_char).numE((SubLObject)html_create_term.THIRTEEN_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 5377L)
    public static SubLObject cb_categorize_term(final SubLObject args) {
        final SubLObject fort_spec = args.first();
        final SubLObject fort = cb_utilities.cb_guess_fort(args.first(), (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL == forts.fort_p(fort)) {
            cb_utilities.cb_error((SubLObject)html_create_term.$str57$_a_does_not_specify_a_Cyc_term, fort_spec, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
            return (SubLObject)html_create_term.NIL;
        }
        return cb_categorize_term_guts(fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 5703L)
    public static SubLObject cb_link_categorize_term(final SubLObject v_term, SubLObject linktext) {
        if (linktext == html_create_term.UNPROVIDED) {
            linktext = (SubLObject)html_create_term.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_create_term.NIL == linktext) {
            linktext = (SubLObject)html_create_term.$str59$Categorize_Term;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)html_create_term.$kw46$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_create_term.$str60$cb_categorize_term__a, cb_utilities.cb_fort_identifier(v_term));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 6096L)
    public static SubLObject cb_categorize_term_guts(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_create_term.NIL != forts.fort_p(v_term) : v_term;
        final SubLObject mt = mt_vars.$default_assert_mt$.getGlobalValue();
        final SubLObject title_var = (SubLObject)html_create_term.$str59$Categorize_Term;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((html_create_term.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)html_create_term.$str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (html_create_term.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                html_utilities.html_markup((SubLObject)html_create_term.$str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_create_term.$kw7$UNINITIALIZED) ? ConsesLow.list(html_create_term.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)html_create_term.$kw8$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (html_create_term.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)html_create_term.$kw9$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)html_create_term.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (html_create_term.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)html_create_term.$str11$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_create_term.$str12$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str13$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str14$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)html_create_term.$str15$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            if (html_create_term.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (html_create_term.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)html_create_term.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_create_term.$str16$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        if (html_create_term.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)html_create_term.$str67$cb_handle_categorize_term, (SubLObject)html_create_term.T, (SubLObject)html_create_term.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)html_create_term.$kw64$CB_CATEGORIZE_TERM, (SubLObject)html_create_term.NIL, (SubLObject)html_create_term.UNPROVIDED);
                            cb_utilities.cb_back_button((SubLObject)html_create_term.$kw18$SELF, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)html_create_term.$str25$Clear);
                            html_utilities.html_indent((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)html_create_term.$str68$Categorize, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_create_term.$str69$Categorize_);
                            cb_utilities.cb_form(v_term, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)html_create_term.$str70$_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            SubLObject comment = kb_mapping_utilities.fpred_value_in_mt(v_term, html_create_term.$const33$comment, mt_vars.$default_comment_mt$.getGlobalValue(), (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            if (html_create_term.NIL == comment) {
                                comment = kb_mapping_utilities.fpred_value_in_any_mt(v_term, html_create_term.$const33$comment, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            }
                            if (comment.isString()) {
                                html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                cb_browser.cb_c_documentation_string(comment);
                            }
                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_hidden_input((SubLObject)html_create_term.$str71$term, cb_utilities.cb_fort_identifier(v_term), (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_create_term.$str72$Mt___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_script_utilities.html_clear_input_button((SubLObject)html_create_term.$str73$mt, (SubLObject)html_create_term.$str25$Clear, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                            html_complete.html_complete_button((SubLObject)html_create_term.$str73$mt, (SubLObject)html_create_term.$str26$Complete, html_create_term.$const74$Microtheory, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)html_create_term.$str73$mt, (SubLObject)((html_create_term.NIL != mt) ? cb_utilities.cb_string_for_fort(mt) : html_create_term.NIL), cb_parameters.$cb_constant_input_width$.getDynamicValue(thread));
                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_create_term.$str75$Similar_to___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_script_utilities.html_clear_input_button((SubLObject)html_create_term.$str76$similar_to, (SubLObject)html_create_term.$str25$Clear, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                            html_complete.html_complete_button((SubLObject)html_create_term.$str76$similar_to, (SubLObject)html_create_term.$str26$Complete, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            final SubLObject last_similar = html_create_term.$cb_categorize_info$.getDynamicValue(thread).first();
                            html_utilities.html_text_input((SubLObject)html_create_term.$str76$similar_to, last_similar, (SubLObject)html_create_term.$int77$40);
                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_create_term.$str78$Instance_of___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_script_utilities.html_clear_input_button((SubLObject)html_create_term.$str79$isa, (SubLObject)html_create_term.$str25$Clear, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                            html_complete.html_complete_button((SubLObject)html_create_term.$str79$isa, (SubLObject)html_create_term.$str26$Complete, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            final SubLObject last_isa = conses_high.second(html_create_term.$cb_categorize_info$.getDynamicValue(thread));
                            html_utilities.html_text_input((SubLObject)html_create_term.$str79$isa, last_isa, (SubLObject)html_create_term.$int77$40);
                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_create_term.$str80$Specialization_of___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_script_utilities.html_clear_input_button((SubLObject)html_create_term.$str81$genl, (SubLObject)html_create_term.$str25$Clear, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                            html_complete.html_complete_button((SubLObject)html_create_term.$str81$genl, (SubLObject)html_create_term.$str26$Complete, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            final SubLObject last_genl = conses_high.third(html_create_term.$cb_categorize_info$.getDynamicValue(thread));
                            html_utilities.html_text_input((SubLObject)html_create_term.$str81$genl, last_genl, (SubLObject)html_create_term.$int77$40);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$16, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 8134L)
    public static SubLObject cb_handle_categorize_term(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_id = html_utilities.html_extract_input((SubLObject)html_create_term.$str71$term, args);
        final SubLObject mt_string = html_utilities.html_extract_input((SubLObject)html_create_term.$str73$mt, args);
        final SubLObject similar_to_string = html_utilities.html_extract_input((SubLObject)html_create_term.$str76$similar_to, args);
        final SubLObject isa_string = html_utilities.html_extract_input((SubLObject)html_create_term.$str79$isa, args);
        final SubLObject generalization_string = html_utilities.html_extract_input((SubLObject)html_create_term.$str82$generalization, args);
        SubLObject v_term = (SubLObject)html_create_term.NIL;
        SubLObject mt = (SubLObject)html_create_term.NIL;
        SubLObject similar_to = (SubLObject)html_create_term.NIL;
        SubLObject v_isa = (SubLObject)html_create_term.NIL;
        SubLObject generalization = (SubLObject)html_create_term.NIL;
        v_term = cb_utilities.cb_guess_fort(term_id, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL == forts.fort_p(v_term)) {
            cb_utilities.cb_error((SubLObject)html_create_term.$str57$_a_does_not_specify_a_Cyc_term, term_id, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
            return (SubLObject)html_create_term.NIL;
        }
        mt = cb_utilities.cb_guess_fort(mt_string, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL == forts.fort_p(mt) || html_create_term.NIL == isa.isa_in_any_mtP(mt, html_create_term.$const74$Microtheory)) {
            cb_utilities.cb_error((SubLObject)html_create_term.$str83$_a_does_not_specify_a_Cyc_Microth, mt_string, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
            return (SubLObject)html_create_term.NIL;
        }
        if (similar_to_string.isString() && !html_create_term.$str27$.equal(similar_to_string)) {
            similar_to = cb_utilities.cb_guess_fort(similar_to_string, (SubLObject)html_create_term.UNPROVIDED);
            if (html_create_term.NIL == forts.fort_p(similar_to)) {
                cb_utilities.cb_error((SubLObject)html_create_term.$str57$_a_does_not_specify_a_Cyc_term, similar_to_string, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                return (SubLObject)html_create_term.NIL;
            }
        }
        if (isa_string.isString() && !html_create_term.$str27$.equal(isa_string)) {
            v_isa = cb_utilities.cb_guess_fort(isa_string, (SubLObject)html_create_term.UNPROVIDED);
            if (html_create_term.NIL == forts.fort_p(v_isa)) {
                cb_utilities.cb_error((SubLObject)html_create_term.$str57$_a_does_not_specify_a_Cyc_term, isa_string, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                return (SubLObject)html_create_term.NIL;
            }
        }
        if (generalization_string.isString() && !html_create_term.$str27$.equal(generalization_string)) {
            generalization = cb_utilities.cb_guess_fort(generalization_string, (SubLObject)html_create_term.UNPROVIDED);
            if (html_create_term.NIL == forts.fort_p(generalization)) {
                cb_utilities.cb_error((SubLObject)html_create_term.$str57$_a_does_not_specify_a_Cyc_term, generalization_string, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                return (SubLObject)html_create_term.NIL;
            }
        }
        if (html_create_term.NIL == html_create_term.$cb_categorize_info$.getDynamicValue(thread)) {
            html_create_term.$cb_categorize_info$.setDynamicValue((SubLObject)ConsesLow.list((SubLObject)html_create_term.$str27$, (SubLObject)html_create_term.$str27$, (SubLObject)html_create_term.$str27$), thread);
        }
        ConsesLow.set_nth((SubLObject)html_create_term.ZERO_INTEGER, html_create_term.$cb_categorize_info$.getDynamicValue(thread), similar_to_string);
        ConsesLow.set_nth((SubLObject)html_create_term.ONE_INTEGER, html_create_term.$cb_categorize_info$.getDynamicValue(thread), isa_string);
        ConsesLow.set_nth((SubLObject)html_create_term.TWO_INTEGER, html_create_term.$cb_categorize_info$.getDynamicValue(thread), generalization_string);
        if (html_create_term.NIL != similar_to) {
            cb_categorize_similar(v_term, similar_to);
        }
        if (html_create_term.NIL != v_isa) {
            cb_categorize_isa(v_term, v_isa);
        }
        if (html_create_term.NIL != generalization) {
            cb_categorize_generalization(v_term, generalization);
        }
        if (html_create_term.NIL != similar_to) {
            cb_copy_from_similar_guts(v_term, similar_to);
        }
        else {
            cb_conceptually_related_guts(v_term);
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 10946L)
    public static SubLObject cb_categorize_similar(final SubLObject v_term, final SubLObject similar_to) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_create_term.NIL != forts.fort_p(v_term) : v_term;
        assert html_create_term.NIL != forts.fort_p(similar_to) : similar_to;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)html_create_term.NIL, thread);
            final SubLObject _prev_bind_0_$21 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)html_create_term.$sym86$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(html_create_term.$const87$EverythingPSC, thread);
                final SubLObject pred_var = html_create_term.$const88$isa;
                if (html_create_term.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(similar_to, (SubLObject)html_create_term.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(similar_to, (SubLObject)html_create_term.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)html_create_term.NIL;
                    final SubLObject token_var = (SubLObject)html_create_term.NIL;
                    while (html_create_term.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (html_create_term.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)html_create_term.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)html_create_term.$kw89$GAF, (SubLObject)html_create_term.$kw90$TRUE, (SubLObject)html_create_term.NIL);
                                SubLObject done_var_$22 = (SubLObject)html_create_term.NIL;
                                final SubLObject token_var_$23 = (SubLObject)html_create_term.NIL;
                                while (html_create_term.NIL == done_var_$22) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$23);
                                    final SubLObject valid_$24 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$23.eql(ass));
                                    if (html_create_term.NIL != valid_$24 && html_create_term.NIL != assertions_high.asserted_assertionP(ass)) {
                                        final SubLObject mt = assertions_high.assertion_mt(ass);
                                        final SubLObject col = assertions_high.gaf_arg2(ass);
                                        final SubLObject strength = assertions_high.assertion_strength(ass);
                                        ke.ke_assert((SubLObject)ConsesLow.list(html_create_term.$const88$isa, v_term, col), mt, strength, (SubLObject)html_create_term.$kw54$FORWARD);
                                    }
                                    done_var_$22 = (SubLObject)SubLObjectFactory.makeBoolean(html_create_term.NIL == valid_$24);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_create_term.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (html_create_term.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(html_create_term.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$21, thread);
            }
            SubLObject cdolist_list_var = html_create_term.$cb_categorize_generalization_possibilities$.getGlobalValue();
            SubLObject info = (SubLObject)html_create_term.NIL;
            info = cdolist_list_var.first();
            while (html_create_term.NIL != cdolist_list_var) {
                final SubLObject pred = info.first();
                final SubLObject _prev_bind_0_$23 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)html_create_term.$sym86$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(html_create_term.$const87$EverythingPSC, thread);
                    final SubLObject pred_var2 = pred;
                    if (html_create_term.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(similar_to, (SubLObject)html_create_term.ONE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(similar_to, (SubLObject)html_create_term.ONE_INTEGER, pred_var2);
                        SubLObject done_var2 = (SubLObject)html_create_term.NIL;
                        final SubLObject token_var2 = (SubLObject)html_create_term.NIL;
                        while (html_create_term.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (html_create_term.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)html_create_term.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)html_create_term.$kw89$GAF, (SubLObject)html_create_term.$kw90$TRUE, (SubLObject)html_create_term.NIL);
                                    SubLObject done_var_$23 = (SubLObject)html_create_term.NIL;
                                    final SubLObject token_var_$24 = (SubLObject)html_create_term.NIL;
                                    while (html_create_term.NIL == done_var_$23) {
                                        final SubLObject ass2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$24);
                                        final SubLObject valid_$25 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$24.eql(ass2));
                                        if (html_create_term.NIL != valid_$25 && html_create_term.NIL != assertions_high.asserted_assertionP(ass2)) {
                                            final SubLObject mt2 = assertions_high.assertion_mt(ass2);
                                            final SubLObject arg2 = assertions_high.gaf_arg2(ass2);
                                            final SubLObject strength2 = assertions_high.assertion_strength(ass2);
                                            ke.ke_assert((SubLObject)ConsesLow.list(pred, v_term, arg2), mt2, strength2, (SubLObject)html_create_term.$kw54$FORWARD);
                                        }
                                        done_var_$23 = (SubLObject)SubLObjectFactory.makeBoolean(html_create_term.NIL == valid_$25);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_create_term.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (html_create_term.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(html_create_term.NIL == valid2);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$23, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                info = cdolist_list_var.first();
            }
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 11903L)
    public static SubLObject cb_categorize_isa(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_create_term.NIL != forts.fort_p(v_term) : v_term;
        assert html_create_term.NIL != forts.fort_p(collection) : collection;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)html_create_term.NIL, thread);
            SubLObject cdolist_list_var;
            final SubLObject mts = cdolist_list_var = cb_categorize_isa_guess_mts(collection);
            SubLObject mt = (SubLObject)html_create_term.NIL;
            mt = cdolist_list_var.first();
            while (html_create_term.NIL != cdolist_list_var) {
                ke.ke_assert((SubLObject)ConsesLow.list(html_create_term.$const88$isa, v_term, collection), mt, (SubLObject)html_create_term.$kw91$MONOTONIC, (SubLObject)html_create_term.$kw54$FORWARD);
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 12219L)
    public static SubLObject cb_categorize_isa_guess_mts(final SubLObject collection) {
        final SubLObject mts_where_genls = kb_indexing.key_gaf_arg_index(collection, (SubLObject)html_create_term.ONE_INTEGER, html_create_term.$const92$genls);
        final SubLObject mts = genl_mts.max_mts(mts_where_genls, (SubLObject)html_create_term.UNPROVIDED);
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 12396L)
    public static SubLObject cb_categorize_generalization(final SubLObject v_term, final SubLObject generalization) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_create_term.NIL != forts.fort_p(v_term) : v_term;
        assert html_create_term.NIL != forts.fort_p(generalization) : generalization;
        thread.resetMultipleValues();
        final SubLObject generalization_pred = cb_categorize_guess_generalization(generalization);
        final SubLObject collection = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (html_create_term.NIL != generalization_pred) {
            final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
            try {
                api_control_vars.$use_local_queueP$.bind((SubLObject)html_create_term.NIL, thread);
                ke.ke_assert((SubLObject)ConsesLow.list(html_create_term.$const88$isa, v_term, collection), mt_vars.$default_assert_mt$.getGlobalValue(), (SubLObject)html_create_term.$kw91$MONOTONIC, (SubLObject)html_create_term.$kw54$FORWARD);
                SubLObject cdolist_list_var;
                final SubLObject mts = cdolist_list_var = cb_categorize_generalization_guess_mts(generalization, generalization_pred, collection);
                SubLObject mt = (SubLObject)html_create_term.NIL;
                mt = cdolist_list_var.first();
                while (html_create_term.NIL != cdolist_list_var) {
                    ke.ke_assert((SubLObject)ConsesLow.list(generalization_pred, v_term, generalization), mt, (SubLObject)html_create_term.$kw91$MONOTONIC, (SubLObject)html_create_term.$kw54$FORWARD);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt = cdolist_list_var.first();
                }
            }
            finally {
                api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 13051L)
    public static SubLObject cb_categorize_guess_generalization(final SubLObject generalization) {
        SubLObject cdolist_list_var = html_create_term.$cb_categorize_generalization_possibilities$.getGlobalValue();
        SubLObject info = (SubLObject)html_create_term.NIL;
        info = cdolist_list_var.first();
        while (html_create_term.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject pred = (SubLObject)html_create_term.NIL;
            SubLObject col = (SubLObject)html_create_term.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_create_term.$list93);
            pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_create_term.$list93);
            col = current.first();
            current = current.rest();
            if (html_create_term.NIL == current) {
                if (html_create_term.NIL != isa.isa_in_any_mtP(generalization, col)) {
                    return Values.values(pred, col);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_create_term.$list93);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return Values.values((SubLObject)html_create_term.NIL, (SubLObject)html_create_term.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 13378L)
    public static SubLObject cb_categorize_generalization_guess_mts(final SubLObject generalization, final SubLObject generalization_pred, final SubLObject collection) {
        final SubLObject mts_where_generalizations = kb_indexing.key_gaf_arg_index(generalization, (SubLObject)html_create_term.ONE_INTEGER, generalization_pred);
        final SubLObject mts = genl_mts.max_mts(mts_where_generalizations, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL != mts) {
            return mts;
        }
        return isa.max_floor_mts_of_isa_paths(generalization, collection, (SubLObject)html_create_term.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 13844L)
    public static SubLObject cb_copy_from_similar_guts(final SubLObject v_term, final SubLObject similar_to) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_create_term.NIL != forts.fort_p(v_term) : v_term;
        assert html_create_term.NIL != forts.fort_p(similar_to) : similar_to;
        final SubLObject fort_spec = cb_utilities.cb_fort_identifier(similar_to);
        final SubLObject title_var = (SubLObject)html_create_term.NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((html_create_term.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)html_create_term.$str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (html_create_term.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                html_utilities.html_markup((SubLObject)html_create_term.$str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
            final SubLObject _prev_bind_0_$31 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_create_term.$kw7$UNINITIALIZED) ? ConsesLow.list(html_create_term.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)html_create_term.$kw8$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (html_create_term.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)html_create_term.$kw9$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)html_create_term.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (html_create_term.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)html_create_term.$str11$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                    final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_create_term.$str12$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str13$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str14$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)html_create_term.$str15$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            if (html_create_term.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (html_create_term.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)html_create_term.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_create_term.$str16$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        if (html_create_term.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)html_create_term.$str96$cb_handle_copy_from_similar, fort_spec, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.ONE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)html_create_term.$str97$Copy_from_);
                            cb_utilities.cb_form(similar_to, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)html_create_term.$str98$_to_);
                            cb_utilities.cb_form(v_term, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.ONE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)html_create_term.$kw94$CB_COPY_FROM_SIMILAR, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)html_create_term.$str99$Copy_Assertions, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_hr((SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_create_term.$str100$Check_the_assertions_from_);
                            cb_utilities.cb_form(similar_to, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)html_create_term.$str101$_which_you_wish_to_copy__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_hidden_input((SubLObject)html_create_term.$str76$similar_to, fort_spec, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_hidden_input((SubLObject)html_create_term.$str71$term, cb_utilities.cb_fort_identifier(v_term), (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                            final SubLObject _prev_bind_0_$36 = cb_parameters.$cb_assertion_link_hook$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$37 = cb_parameters.$cb_c_gaf_arg_use_binary$.currentBinding(thread);
                            try {
                                cb_parameters.$cb_assertion_link_hook$.bind((SubLObject)html_create_term.$sym102$CB_COPY_FROM_SIMILAR_CHECKBOX, thread);
                                cb_parameters.$cb_c_gaf_arg_use_binary$.bind((SubLObject)html_create_term.NIL, thread);
                                cb_frames.cb_default_content_internal(similar_to);
                            }
                            finally {
                                cb_parameters.$cb_c_gaf_arg_use_binary$.rebind(_prev_bind_1_$37, thread);
                                cb_parameters.$cb_assertion_link_hook$.rebind(_prev_bind_0_$36, thread);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$32, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$31, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 15086L)
    public static SubLObject cb_handle_copy_from_similar(final SubLObject args) {
        if (html_create_term.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)html_create_term.$str103$copy_from_similar_facilities);
            return (SubLObject)html_create_term.NIL;
        }
        final SubLObject source_fort_string = html_utilities.html_extract_input((SubLObject)html_create_term.$str76$similar_to, args);
        final SubLObject new_name = html_utilities.html_extract_input((SubLObject)html_create_term.$str71$term, args);
        SubLObject source_fort = (SubLObject)html_create_term.NIL;
        SubLObject target_fort = (SubLObject)html_create_term.NIL;
        if (!source_fort_string.isString() || source_fort_string.equal((SubLObject)html_create_term.$str27$)) {
            return cb_utilities.cb_error((SubLObject)html_create_term.$str104$No_source_term_was_specified, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        source_fort = cb_utilities.cb_guess_fort(source_fort_string, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL == forts.fort_p(source_fort)) {
            return cb_utilities.cb_error((SubLObject)html_create_term.$str105$Unable_to_determine_a_term_from__, source_fort_string, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        if (!new_name.isString() || new_name.equal((SubLObject)html_create_term.$str27$)) {
            return cb_utilities.cb_error((SubLObject)html_create_term.$str106$No_term_was_specified, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        target_fort = cb_utilities.cb_guess_fort(new_name, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL == forts.fort_p(target_fort)) {
            return cb_utilities.cb_error((SubLObject)html_create_term.$str105$Unable_to_determine_a_term_from__, new_name, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        if (html_create_term.NIL != constant_handles.constant_p(target_fort)) {
            cb_tools.cb_add_to_constant_history(target_fort);
        }
        else if (html_create_term.NIL != nart_handles.nart_p(target_fort)) {
            cb_tools.cb_add_to_nat_history(target_fort);
        }
        final SubLObject source_fort_el_formula = forts.fort_el_formula(source_fort);
        final SubLObject target_fort_el_formula = forts.fort_el_formula(target_fort);
        SubLObject cdolist_list_var = conses_high.nthcdr((SubLObject)html_create_term.THREE_INTEGER, args);
        SubLObject copy_spec = (SubLObject)html_create_term.NIL;
        copy_spec = cdolist_list_var.first();
        while (html_create_term.NIL != cdolist_list_var) {
            final SubLObject id = reader.read_from_string_ignoring_errors(copy_spec.first(), (SubLObject)html_create_term.NIL, (SubLObject)html_create_term.NIL, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
            if (id.isInteger()) {
                final SubLObject assertion = assertion_handles.find_assertion_by_id(id);
                if (html_create_term.NIL != assertion_handles.assertion_p(assertion)) {
                    SubLObject similar_formula = ke.ke_assertion_edit_formula(assertion);
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject strength = assertions_high.assertion_strength(assertion);
                    final SubLObject direction = assertions_high.assertion_direction(assertion);
                    if (html_create_term.NIL != list_utilities.tree_find(source_fort_el_formula, similar_formula, Symbols.symbol_function((SubLObject)html_create_term.EQUAL), (SubLObject)html_create_term.UNPROVIDED)) {
                        similar_formula = conses_high.subst(target_fort_el_formula, source_fort_el_formula, similar_formula, Symbols.symbol_function((SubLObject)html_create_term.EQUAL), (SubLObject)html_create_term.UNPROVIDED);
                        ke.ke_assert(similar_formula, mt, strength, direction);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            copy_spec = cdolist_list_var.first();
        }
        return cb_conceptually_related_guts(target_fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 17315L)
    public static SubLObject cb_copy_from_similar_checkbox(final SubLObject assertion) {
        if (html_create_term.NIL != assertion_handles.assertion_p(assertion) && html_create_term.NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject id = assertion_handles.assertion_id(assertion);
            html_utilities.html_checkbox_input(id, (SubLObject)html_create_term.T, (SubLObject)html_create_term.NIL, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 17562L)
    public static SubLObject cb_suggested_conceptually_related(final SubLObject v_term) {
        final SubLObject v_answer = (SubLObject)html_create_term.NIL;
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 17926L)
    public static SubLObject cb_conceptually_related_guts(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_create_term.NIL != v_term) {
            assert html_create_term.NIL != forts.fort_p(v_term) : v_term;
            ct_cr_setup();
            SubLObject suggestions = cb_suggested_conceptually_related(v_term);
            SubLObject existing_terms = (SubLObject)html_create_term.NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)html_create_term.$sym86$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(html_create_term.$const87$EverythingPSC, thread);
                existing_terms = removal_modules_conceptually_related.all_conceptually_related(v_term, (SubLObject)html_create_term.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            suggestions = conses_high.set_difference(suggestions, existing_terms, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
            final SubLObject title_var = (SubLObject)html_create_term.$str110$Conceptually_Related_Suggestions;
            final SubLObject _prev_bind_3 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((html_create_term.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)html_create_term.$str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (html_create_term.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)html_create_term.$str6$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_create_term.$kw7$UNINITIALIZED) ? ConsesLow.list(html_create_term.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)html_create_term.$kw8$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (html_create_term.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_complete.html_complete_script();
                    cyc_file_dependencies.css((SubLObject)html_create_term.$kw9$SAM_AUTOCOMPLETE_CSS);
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                    final SubLObject _prev_bind_0_$39 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)html_create_term.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (html_create_term.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_create_term.$str11$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str12$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)html_create_term.$str13$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)html_create_term.$str14$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)html_create_term.$str15$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                if (html_create_term.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (html_create_term.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)html_create_term.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str16$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            if (html_create_term.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)html_create_term.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)html_create_term.$str111$cb_conceptually_related_terms, (SubLObject)html_create_term.T, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_hidden_input((SubLObject)html_create_term.$str112$fort, cb_utilities.cb_fort_identifier(v_term), (SubLObject)html_create_term.UNPROVIDED);
                                cb_utilities.cb_help_preamble((SubLObject)html_create_term.$kw108$CB_CONCEPTUALLY_RELATED_TERMS, (SubLObject)html_create_term.NIL, (SubLObject)html_create_term.UNPROVIDED);
                                cb_utilities.cb_back_button((SubLObject)html_create_term.$kw18$SELF, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_reset_input((SubLObject)html_create_term.$str113$Clear_All);
                                html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_create_term.$str114$Term___);
                                cb_utilities.cb_form(v_term, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_create_term.$str115$Existing_Conceptually_Related_Ter);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                if (html_create_term.NIL != existing_terms) {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    cb_utilities.cb_link((SubLObject)html_create_term.$kw116$CT_CR_JUSTIFY, v_term, (SubLObject)html_create_term.$str117$_Justify_, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                                    SubLObject cdolist_list_var = existing_terms;
                                    SubLObject existing_term = (SubLObject)html_create_term.NIL;
                                    existing_term = cdolist_list_var.first();
                                    while (html_create_term.NIL != cdolist_list_var) {
                                        cb_utilities.cb_form(existing_term, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_indent((SubLObject)html_create_term.TWO_INTEGER);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        existing_term = cdolist_list_var.first();
                                    }
                                }
                                else {
                                    html_utilities.html_princ((SubLObject)html_create_term.$str118$None);
                                }
                                html_utilities.html_hr((SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_create_term.$str119$Specify_the_Microtheory_for_new__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                html_complete.html_complete_button((SubLObject)html_create_term.$str73$mt, (SubLObject)html_create_term.$str26$Complete, html_create_term.$const74$Microtheory, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_create_term.$str120$_Mt___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_text_input((SubLObject)html_create_term.$str73$mt, string_utilities.str(mt_vars.$default_ask_mt$.getGlobalValue()), (SubLObject)html_create_term.$int77$40);
                                html_utilities.html_br();
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_create_term.$str121$_Select_terms_and_or_type_in_a_te);
                                cb_utilities.cb_form(v_term, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)html_create_term.$str122$__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                html_complete.html_complete_button((SubLObject)html_create_term.$str123$entered, (SubLObject)html_create_term.$str26$Complete, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_create_term.$str124$_Term___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_text_input((SubLObject)html_create_term.$str123$entered, (SubLObject)html_create_term.NIL, (SubLObject)html_create_term.$int77$40);
                                html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_create_term.$str125$Possible_Terms_to_Add___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)html_create_term.ZERO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)html_create_term.ZERO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)html_create_term.ZERO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                    while (html_create_term.NIL != suggestions) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                            suggestions = ct_cr_search_show_next_suggestion(suggestions);
                                            suggestions = ct_cr_search_show_next_suggestion(suggestions);
                                            suggestions = ct_cr_search_show_next_suggestion(suggestions);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_submit_input((SubLObject)html_create_term.$str126$Add_Terms_Backward, (SubLObject)html_create_term.$str127$add_backward, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)html_create_term.$str128$_as_);
                                cb_utilities.cb_form((SubLObject)ConsesLow.list(html_create_term.$const129$conceptuallyRelated, (SubLObject)html_create_term.$sym130$TERM, v_term), (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)html_create_term.$str131$_in_MT);
                                html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_submit_input((SubLObject)html_create_term.$str132$Add_Terms_Forward, (SubLObject)html_create_term.$str133$add_forward, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)html_create_term.$str128$_as_);
                                cb_utilities.cb_form((SubLObject)ConsesLow.listS(html_create_term.$const129$conceptuallyRelated, v_term, (SubLObject)html_create_term.$list134), (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)html_create_term.$str131$_in_MT);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_5, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_4, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$39, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$38, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 20745L)
    public static SubLObject ct_cr_search_show_next_suggestion(final SubLObject suggestions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_create_term.NIL != suggestions) {
            final SubLObject suggestion = suggestions.first();
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                ct_cr_search_show_suggestion(suggestion);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                html_utilities.html_indent((SubLObject)html_create_term.TWO_INTEGER);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return suggestions.rest();
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 21016L)
    public static SubLObject cb_conceptually_related_terms(final SubLObject args) {
        final SubLObject fort_string = html_utilities.html_extract_input((SubLObject)html_create_term.$str112$fort, args);
        final SubLObject fort = cb_utilities.cb_guess_fort(fort_string, (SubLObject)html_create_term.UNPROVIDED);
        final SubLObject mt_string = html_utilities.html_extract_input((SubLObject)html_create_term.$str73$mt, args);
        final SubLObject mt = cb_utilities.cb_guess_fort(mt_string, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL == forts.fort_p(fort)) {
            return cb_utilities.cb_error((SubLObject)html_create_term.$str135$Unable_to_determine_last_term__wh, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        if (html_create_term.NIL == forts.fort_p(mt)) {
            return cb_utilities.cb_error((SubLObject)html_create_term.$str136$Invalid_Mt_specified____S, mt_string, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        final SubLObject v_forward = html_utilities.html_extract_input((SubLObject)html_create_term.$str133$add_forward, args);
        final SubLObject suggestions = ct_cr_extract_suggestions(args);
        final SubLObject direction = (SubLObject)((html_create_term.NIL != v_forward) ? html_create_term.$kw54$FORWARD : html_create_term.$kw137$BACKWARD);
        return ct_cr_assertion_suggestions(fort, suggestions, mt, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 21888L)
    public static SubLObject ct_cr_extract_suggestions(final SubLObject args) {
        final SubLObject entered_string = html_utilities.html_extract_input((SubLObject)html_create_term.$str123$entered, args);
        SubLObject entered = (SubLObject)html_create_term.NIL;
        SubLObject suggestions = (SubLObject)html_create_term.NIL;
        if (html_create_term.NIL != entered_string) {
            if (!Sequences.length(entered_string).numE((SubLObject)html_create_term.ZERO_INTEGER)) {
                entered = cb_utilities.cb_guess_constant(entered_string);
                if (html_create_term.NIL == forts.fort_p(entered)) {
                    return cb_utilities.cb_error((SubLObject)html_create_term.$str105$Unable_to_determine_a_term_from__, entered_string, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                }
                suggestions = (SubLObject)ConsesLow.cons(entered, suggestions);
            }
        }
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)html_create_term.NIL;
        arg = cdolist_list_var.first();
        while (html_create_term.NIL != cdolist_list_var) {
            if (arg.isCons() && arg.first().equal((SubLObject)html_create_term.$str139$id)) {
                final SubLObject suggestion = cb_utilities.cb_guess_fort(conses_high.second(arg), (SubLObject)html_create_term.UNPROVIDED);
                if (html_create_term.NIL != forts.fort_p(suggestion)) {
                    final SubLObject item_var = suggestion;
                    if (html_create_term.NIL == conses_high.member(item_var, suggestions, Symbols.symbol_function((SubLObject)html_create_term.EQL), Symbols.symbol_function((SubLObject)html_create_term.IDENTITY))) {
                        suggestions = (SubLObject)ConsesLow.cons(item_var, suggestions);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        suggestions = Sequences.nreverse(suggestions);
        return suggestions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 22611L)
    public static SubLObject ct_cr_assertion_suggestions(final SubLObject fort, final SubLObject suggestions, final SubLObject mt, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formulas = (SubLObject)html_create_term.NIL;
        SubLObject cdolist_list_var = suggestions;
        SubLObject suggestion = (SubLObject)html_create_term.NIL;
        suggestion = cdolist_list_var.first();
        while (html_create_term.NIL != cdolist_list_var) {
            SubLObject formula = (SubLObject)html_create_term.NIL;
            if (direction.eql((SubLObject)html_create_term.$kw54$FORWARD)) {
                formula = (SubLObject)ConsesLow.list(html_create_term.$const129$conceptuallyRelated, fort, suggestion);
            }
            else if (direction.eql((SubLObject)html_create_term.$kw137$BACKWARD)) {
                formula = (SubLObject)ConsesLow.list(html_create_term.$const129$conceptuallyRelated, suggestion, fort);
            }
            if (html_create_term.NIL != formula) {
                formulas = (SubLObject)ConsesLow.cons(formula, formulas);
                ke.ke_assert(formula, mt, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            suggestion = cdolist_list_var.first();
        }
        formulas = Sequences.nreverse(formulas);
        final SubLObject title_var = (SubLObject)html_create_term.$str140$Formulas_Asserted;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((html_create_term.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)html_create_term.$str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (html_create_term.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                html_utilities.html_markup((SubLObject)html_create_term.$str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
            final SubLObject _prev_bind_0_$45 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_create_term.$kw7$UNINITIALIZED) ? ConsesLow.list(html_create_term.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)html_create_term.$kw8$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (html_create_term.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)html_create_term.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (html_create_term.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)html_create_term.$str11$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                    final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_create_term.$str12$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str13$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str14$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)html_create_term.$str15$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            if (html_create_term.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (html_create_term.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_back_button((SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_create_term.$str114$Term___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            cb_utilities.cb_form(fort, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_create_term.$str141$Formulas_Asserted__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            if (html_create_term.NIL != formulas) {
                                SubLObject cdolist_list_var2 = formulas;
                                SubLObject formula2 = (SubLObject)html_create_term.NIL;
                                formula2 = cdolist_list_var2.first();
                                while (html_create_term.NIL != cdolist_list_var2) {
                                    html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                    cb_utilities.cb_form(formula2, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)html_create_term.$str142$_in_);
                                    cb_utilities.cb_form(mt, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    formula2 = cdolist_list_var2.first();
                                }
                            }
                            else {
                                html_utilities.html_princ((SubLObject)html_create_term.$str118$None);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$46, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$45, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 23511L)
    public static SubLObject ct_cr_justify(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = cb_utilities.cb_guess_fort(args, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL == forts.fort_p(fort)) {
            return cb_utilities.cb_error((SubLObject)html_create_term.$str135$Unable_to_determine_last_term__wh, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        if (html_create_term.NIL == Symbols.fboundp((SubLObject)html_create_term.$sym143$WHY_CONCEPTUALLY_RELATED_)) {
            return cb_utilities.cb_error((SubLObject)html_create_term.$str144$Sorry__System_74_92_or_later_is_r, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        }
        final SubLObject title_var = (SubLObject)html_create_term.$str145$Justify_Conceptually_Related;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((html_create_term.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)html_create_term.$str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (html_create_term.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                html_utilities.html_markup((SubLObject)html_create_term.$str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
            final SubLObject _prev_bind_0_$50 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_create_term.$kw7$UNINITIALIZED) ? ConsesLow.list(html_create_term.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)html_create_term.$kw8$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (html_create_term.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                final SubLObject _prev_bind_0_$51 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)html_create_term.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (html_create_term.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)html_create_term.$str11$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_create_term.$str12$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str13$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str14$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)html_create_term.$str15$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            if (html_create_term.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (html_create_term.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_back_button((SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_create_term.$str114$Term___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            cb_utilities.cb_form(fort, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_create_term.$str115$Existing_Conceptually_Related_Ter);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            final SubLObject _prev_bind_0_$55 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$56 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)html_create_term.$sym86$RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind(html_create_term.$const87$EverythingPSC, thread);
                                final SubLObject existing = removal_modules_conceptually_related.all_conceptually_related(fort, (SubLObject)html_create_term.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_definition_list_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                                    SubLObject cdolist_list_var = existing;
                                    SubLObject related = (SubLObject)html_create_term.NIL;
                                    related = cdolist_list_var.first();
                                    while (html_create_term.NIL != cdolist_list_var) {
                                        final SubLObject supports = removal_modules_conceptually_related.why_conceptually_relatedP(fort, related, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_definition_list_term_head$.getGlobalValue());
                                        cb_utilities.cb_form(related, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_definition_list_term_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_definition_list_def_head$.getGlobalValue());
                                        SubLObject cdolist_list_var_$58 = supports;
                                        SubLObject support = (SubLObject)html_create_term.NIL;
                                        support = cdolist_list_var_$58.first();
                                        while (html_create_term.NIL != cdolist_list_var_$58) {
                                            cb_assertion_browser.cb_show_support(support, (SubLObject)html_create_term.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                            cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                            support = cdolist_list_var_$58.first();
                                        }
                                        html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_definition_list_def_tail$.getGlobalValue());
                                        cdolist_list_var = cdolist_list_var.rest();
                                        related = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_definition_list_tail$.getGlobalValue());
                            }
                            finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$56, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$55, thread);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$51, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$50, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 24595L)
    public static SubLObject cb_link_ct_cr_justify(final SubLObject fort, SubLObject linktext) {
        if (linktext == html_create_term.UNPROVIDED) {
            linktext = (SubLObject)html_create_term.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_create_term.NIL != forts.fort_p(fort) : fort;
        if (html_create_term.NIL == linktext) {
            html_utilities.html_princ((SubLObject)html_create_term.$str117$_Justify_);
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)html_create_term.$kw46$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_create_term.$str147$ct_cr_justify__a, cb_utilities.cb_fort_identifier(fort));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 24865L)
    public static SubLObject ct_cr_search_show_suggestion(final SubLObject suggestion) {
        html_utilities.html_checkbox_input((SubLObject)html_create_term.$str139$id, cb_utilities.cb_fort_identifier(suggestion), (SubLObject)html_create_term.NIL, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        html_utilities.html_indent((SubLObject)html_create_term.UNPROVIDED);
        cb_utilities.cb_form(suggestion, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 25041L)
    public static SubLObject ct_cr_setup() {
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 25645L)
    public static SubLObject ct_cr_initialize_irrelevant_term_table() {
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 26308L)
    public static SubLObject cb_elaborate_term(final SubLObject args) {
        final SubLObject fort_spec = args.first();
        final SubLObject fort = cb_utilities.cb_guess_fort(args.first(), (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL == forts.fort_p(fort)) {
            cb_utilities.cb_error((SubLObject)html_create_term.$str57$_a_does_not_specify_a_Cyc_term, fort_spec, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
            return (SubLObject)html_create_term.NIL;
        }
        return cb_elaborate_term_guts(fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 26630L)
    public static SubLObject cb_link_elaborate_term(final SubLObject v_term, SubLObject linktext) {
        if (linktext == html_create_term.UNPROVIDED) {
            linktext = (SubLObject)html_create_term.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_create_term.NIL == linktext) {
            linktext = (SubLObject)html_create_term.$str150$Elaborate_Term;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)html_create_term.$kw46$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_create_term.$str151$cb_elaborate_term__a, cb_utilities.cb_fort_identifier(v_term));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 26956L)
    public static SubLObject cb_elaborate_term_guts(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_create_term.NIL != forts.fort_p(v_term) : v_term;
        final SubLObject title_var = (SubLObject)html_create_term.$str150$Elaborate_Term;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((html_create_term.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)html_create_term.$str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (html_create_term.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                html_utilities.html_markup((SubLObject)html_create_term.$str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
            final SubLObject _prev_bind_0_$59 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_create_term.$kw7$UNINITIALIZED) ? ConsesLow.list(html_create_term.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)html_create_term.$kw8$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (html_create_term.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)html_create_term.$kw9$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                final SubLObject _prev_bind_0_$60 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)html_create_term.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (html_create_term.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)html_create_term.$str11$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_create_term.$str12$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str13$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)html_create_term.$str14$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)html_create_term.$str15$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            if (html_create_term.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (html_create_term.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)html_create_term.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_create_term.$str16$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        if (html_create_term.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_create_term.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_create_term.UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)html_create_term.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)html_create_term.$str156$cb_handle_elaborate_term, (SubLObject)html_create_term.T, (SubLObject)html_create_term.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)html_create_term.$kw154$CB_ELABORATE_TERM, (SubLObject)html_create_term.NIL, (SubLObject)html_create_term.UNPROVIDED);
                            cb_utilities.cb_back_button((SubLObject)html_create_term.$kw18$SELF, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)html_create_term.$str25$Clear);
                            html_utilities.html_indent((SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)html_create_term.$str157$Elaborate, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_create_term.$str158$Elaborate_);
                            cb_utilities.cb_form(v_term, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)html_create_term.$str70$_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            final SubLObject requirements = ke_requirements(v_term);
                            final SubLObject suggestions = ke_suggestions(v_term);
                            if (html_create_term.NIL != requirements) {
                                html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_create_term.$str159$Requirements___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                SubLObject cdolist_list_var = requirements;
                                SubLObject requirement = (SubLObject)html_create_term.NIL;
                                requirement = cdolist_list_var.first();
                                while (html_create_term.NIL != cdolist_list_var) {
                                    html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                    cb_elaborate_requirement(v_term, requirement);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    requirement = cdolist_list_var.first();
                                }
                            }
                            if (html_create_term.NIL != suggestions) {
                                html_utilities.html_newline((SubLObject)html_create_term.TWO_INTEGER);
                                html_utilities.html_princ((SubLObject)html_create_term.$str160$Suggestions___);
                                SubLObject cdolist_list_var = suggestions;
                                SubLObject suggestion = (SubLObject)html_create_term.NIL;
                                suggestion = cdolist_list_var.first();
                                while (html_create_term.NIL != cdolist_list_var) {
                                    html_utilities.html_newline((SubLObject)html_create_term.UNPROVIDED);
                                    cb_elaborate_suggestion(v_term, suggestion);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    suggestion = cdolist_list_var.first();
                                }
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$60, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$59, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_create_term.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 28006L)
    public static SubLObject ke_requirements(final SubLObject v_term) {
        final SubLObject formula = conses_high.subst(v_term, (SubLObject)html_create_term.$kw162$TERM, html_create_term.$ke_requirements_query$.getGlobalValue(), (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        final SubLObject v_bindings = fi.fi_ask_int(formula, html_create_term.$const163$InferencePSC, (SubLObject)html_create_term.ONE_INTEGER, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED);
        if (html_create_term.NIL != v_bindings) {
            SubLObject v_true = (SubLObject)html_create_term.NIL;
            SubLObject unknown = (SubLObject)html_create_term.NIL;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = (SubLObject)html_create_term.NIL;
            binding = cdolist_list_var.first();
            while (html_create_term.NIL != cdolist_list_var) {
                final SubLObject requirement = bindings.variable_binding_value(binding.first());
                if (html_create_term.NIL != fi.fi_ask_int(requirement, html_create_term.$const163$InferencePSC, (SubLObject)html_create_term.NIL, (SubLObject)html_create_term.ONE_INTEGER, (SubLObject)html_create_term.UNPROVIDED, (SubLObject)html_create_term.UNPROVIDED)) {
                    v_true = (SubLObject)ConsesLow.cons(requirement, v_true);
                }
                else {
                    unknown = (SubLObject)ConsesLow.cons(requirement, unknown);
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
            v_true = Sequences.nreverse(v_true);
            unknown = Sequences.nreverse(unknown);
            return Values.values(unknown, v_true);
        }
        return Values.values((SubLObject)html_create_term.NIL, (SubLObject)html_create_term.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 28545L)
    public static SubLObject cb_elaborate_requirement(final SubLObject v_term, final SubLObject requirement) {
        cb_utilities.cb_form(requirement, (SubLObject)html_create_term.ZERO_INTEGER, (SubLObject)html_create_term.T);
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 28745L)
    public static SubLObject ke_suggestions(final SubLObject v_term) {
        return (SubLObject)html_create_term.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-create-term.lisp", position = 28826L)
    public static SubLObject cb_elaborate_suggestion(final SubLObject v_term, final SubLObject suggestion) {
        return (SubLObject)html_create_term.NIL;
    }
    
    public static SubLObject declare_html_create_term_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_create_term", "CB-CREATE-TERM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_handle_create_term", "CB-HANDLE-CREATE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_link_create_term", "CB-LINK-CREATE-TERM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_create_term_hook", "CB-CREATE-TERM-HOOK", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_extract_lines", "CB-EXTRACT-LINES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_extract_lines_recursive", "CB-EXTRACT-LINES-RECURSIVE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cr_or_lf", "CR-OR-LF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_categorize_term", "CB-CATEGORIZE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_link_categorize_term", "CB-LINK-CATEGORIZE-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_categorize_term_guts", "CB-CATEGORIZE-TERM-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_handle_categorize_term", "CB-HANDLE-CATEGORIZE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_categorize_similar", "CB-CATEGORIZE-SIMILAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_categorize_isa", "CB-CATEGORIZE-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_categorize_isa_guess_mts", "CB-CATEGORIZE-ISA-GUESS-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_categorize_generalization", "CB-CATEGORIZE-GENERALIZATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_categorize_guess_generalization", "CB-CATEGORIZE-GUESS-GENERALIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_categorize_generalization_guess_mts", "CB-CATEGORIZE-GENERALIZATION-GUESS-MTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_copy_from_similar_guts", "CB-COPY-FROM-SIMILAR-GUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_handle_copy_from_similar", "CB-HANDLE-COPY-FROM-SIMILAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_copy_from_similar_checkbox", "CB-COPY-FROM-SIMILAR-CHECKBOX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_suggested_conceptually_related", "CB-SUGGESTED-CONCEPTUALLY-RELATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_conceptually_related_guts", "CB-CONCEPTUALLY-RELATED-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "ct_cr_search_show_next_suggestion", "CT-CR-SEARCH-SHOW-NEXT-SUGGESTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_conceptually_related_terms", "CB-CONCEPTUALLY-RELATED-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "ct_cr_extract_suggestions", "CT-CR-EXTRACT-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "ct_cr_assertion_suggestions", "CT-CR-ASSERTION-SUGGESTIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "ct_cr_justify", "CT-CR-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_link_ct_cr_justify", "CB-LINK-CT-CR-JUSTIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "ct_cr_search_show_suggestion", "CT-CR-SEARCH-SHOW-SUGGESTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "ct_cr_setup", "CT-CR-SETUP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "ct_cr_initialize_irrelevant_term_table", "CT-CR-INITIALIZE-IRRELEVANT-TERM-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_elaborate_term", "CB-ELABORATE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_link_elaborate_term", "CB-LINK-ELABORATE-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_elaborate_term_guts", "CB-ELABORATE-TERM-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "ke_requirements", "KE-REQUIREMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_elaborate_requirement", "CB-ELABORATE-REQUIREMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "ke_suggestions", "KE-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_create_term", "cb_elaborate_suggestion", "CB-ELABORATE-SUGGESTION", 2, 0, false);
        return (SubLObject)html_create_term.NIL;
    }
    
    public static SubLObject init_html_create_term_file() {
        html_create_term.$cb_create_info$ = SubLFiles.defparameter("*CB-CREATE-INFO*", (SubLObject)html_create_term.NIL);
        html_create_term.$cb_categorize_info$ = SubLFiles.defparameter("*CB-CATEGORIZE-INFO*", (SubLObject)html_create_term.NIL);
        html_create_term.$cb_categorize_generalization_possibilities$ = SubLFiles.deflexical("*CB-CATEGORIZE-GENERALIZATION-POSSIBILITIES*", (SubLObject)html_create_term.$list85);
        html_create_term.$ke_requirements_query$ = SubLFiles.deflexical("*KE-REQUIREMENTS-QUERY*", (SubLObject)html_create_term.$list161);
        return (SubLObject)html_create_term.NIL;
    }
    
    public static SubLObject setup_html_create_term_file() {
        utilities_macros.register_html_state_variable((SubLObject)html_create_term.$sym0$_CB_CREATE_INFO_);
        Hashtables.sethash((SubLObject)html_create_term.$kw1$CB_CREATE_TERM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_create_term.$str2$cb_create_term_html, (SubLObject)html_create_term.NIL));
        html_macros.note_cgi_handler_function((SubLObject)html_create_term.$sym38$CB_CREATE_TERM, (SubLObject)html_create_term.$kw39$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)html_create_term.$sym45$CB_HANDLE_CREATE_TERM, (SubLObject)html_create_term.$kw39$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)html_create_term.$kw48$CREATE_TERM, (SubLObject)html_create_term.$sym49$CB_LINK_CREATE_TERM, (SubLObject)html_create_term.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)html_create_term.$kw48$CREATE_TERM, (SubLObject)html_create_term.$str4$Create_Term, (SubLObject)html_create_term.$str50$Crt, (SubLObject)html_create_term.$str51$Cyc_Constant_Creation_Wizard);
        html_macros.note_cgi_handler_function((SubLObject)html_create_term.$sym58$CB_CATEGORIZE_TERM, (SubLObject)html_create_term.$kw39$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)html_create_term.$kw61$CATEGORIZE_TERM, (SubLObject)html_create_term.$sym62$CB_LINK_CATEGORIZE_TERM, (SubLObject)html_create_term.TWO_INTEGER);
        utilities_macros.register_html_state_variable((SubLObject)html_create_term.$sym63$_CB_CATEGORIZE_INFO_);
        Hashtables.sethash((SubLObject)html_create_term.$kw64$CB_CATEGORIZE_TERM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_create_term.$str65$cb_categorize_term_html, (SubLObject)html_create_term.NIL));
        html_macros.note_cgi_handler_function((SubLObject)html_create_term.$sym84$CB_HANDLE_CATEGORIZE_TERM, (SubLObject)html_create_term.$kw39$HTML_HANDLER);
        Hashtables.sethash((SubLObject)html_create_term.$kw94$CB_COPY_FROM_SIMILAR, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_create_term.$str95$cb_copy_from_similar_html, (SubLObject)html_create_term.NIL));
        html_macros.note_cgi_handler_function((SubLObject)html_create_term.$sym107$CB_HANDLE_COPY_FROM_SIMILAR, (SubLObject)html_create_term.$kw39$HTML_HANDLER);
        Hashtables.sethash((SubLObject)html_create_term.$kw108$CB_CONCEPTUALLY_RELATED_TERMS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_create_term.$str109$cb_conceptually_related_terms_htm, (SubLObject)html_create_term.NIL));
        html_macros.note_cgi_handler_function((SubLObject)html_create_term.$sym138$CB_CONCEPTUALLY_RELATED_TERMS, (SubLObject)html_create_term.$kw39$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)html_create_term.$sym146$CT_CR_JUSTIFY, (SubLObject)html_create_term.$kw39$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)html_create_term.$kw116$CT_CR_JUSTIFY, (SubLObject)html_create_term.$sym148$CB_LINK_CT_CR_JUSTIFY, (SubLObject)html_create_term.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)html_create_term.$sym149$CB_ELABORATE_TERM, (SubLObject)html_create_term.$kw39$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)html_create_term.$kw152$ELABORATE_TERM, (SubLObject)html_create_term.$sym153$CB_LINK_ELABORATE_TERM, (SubLObject)html_create_term.TWO_INTEGER);
        Hashtables.sethash((SubLObject)html_create_term.$kw154$CB_ELABORATE_TERM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_create_term.$str155$cb_elaborate_term_html, (SubLObject)html_create_term.NIL));
        return (SubLObject)html_create_term.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_html_create_term_file();
    }
    
    @Override
	public void initializeVariables() {
        init_html_create_term_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_html_create_term_file();
    }
    
    static {
        me = (SubLFile)new html_create_term();
        html_create_term.$cb_create_info$ = null;
        html_create_term.$cb_categorize_info$ = null;
        html_create_term.$cb_categorize_generalization_possibilities$ = null;
        html_create_term.$ke_requirements_query$ = null;
        $sym0$_CB_CREATE_INFO_ = SubLObjectFactory.makeSymbol("*CB-CREATE-INFO*");
        $kw1$CB_CREATE_TERM = SubLObjectFactory.makeKeyword("CB-CREATE-TERM");
        $str2$cb_create_term_html = SubLObjectFactory.makeString("cb-create-term.html");
        $str3$the_Create_Term_page = SubLObjectFactory.makeString("the Create Term page");
        $str4$Create_Term = SubLObjectFactory.makeString("Create Term");
        $str5$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str6$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw7$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw8$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw9$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw10$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str11$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str12$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str13$button = SubLObjectFactory.makeString("button");
        $str14$reload = SubLObjectFactory.makeString("reload");
        $str15$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str16$post = SubLObjectFactory.makeString("post");
        $str17$cb_handle_create_term = SubLObjectFactory.makeString("cb-handle-create-term");
        $kw18$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str19$Cancel_Create = SubLObjectFactory.makeString("Cancel Create");
        $str20$Reset = SubLObjectFactory.makeString("Reset");
        $str21$Create_Constant = SubLObjectFactory.makeString("Create Constant");
        $kw22$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str23$Name__required____ = SubLObjectFactory.makeString("Name (required) : ");
        $str24$new_name = SubLObjectFactory.makeString("new-name");
        $str25$Clear = SubLObjectFactory.makeString("Clear");
        $str26$Complete = SubLObjectFactory.makeString("Complete");
        $str27$ = SubLObjectFactory.makeString("");
        $int28$35 = SubLObjectFactory.makeInteger(35);
        $const29$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $str30$__one_per_line__optional____ = SubLObjectFactory.makeString(", one per line (optional) : ");
        $str31$term_strings = SubLObjectFactory.makeString("term-strings");
        $kw32$BOTTOM = SubLObjectFactory.makeKeyword("BOTTOM");
        $const33$comment = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment"));
        $str34$__required____ = SubLObjectFactory.makeString(" (required) : ");
        $str35$comment = SubLObjectFactory.makeString("comment");
        $int36$80 = SubLObjectFactory.makeInteger(80);
        $str37$virtual = SubLObjectFactory.makeString("virtual");
        $sym38$CB_CREATE_TERM = SubLObjectFactory.makeSymbol("CB-CREATE-TERM");
        $kw39$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str40$Creating = SubLObjectFactory.makeString("Creating");
        $str41$No_name_was_specified = SubLObjectFactory.makeString("No name was specified");
        $str42$_S_is_not_a_valid_constant_name = SubLObjectFactory.makeString("~S is not a valid constant name");
        $str43$No_comment_was_specified = SubLObjectFactory.makeString("No comment was specified");
        $str44$Unable_to_create_a_constant_named = SubLObjectFactory.makeString("Unable to create a constant named ~S");
        $sym45$CB_HANDLE_CREATE_TERM = SubLObjectFactory.makeSymbol("CB-HANDLE-CREATE-TERM");
        $kw46$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str47$cb_create_term = SubLObjectFactory.makeString("cb-create-term");
        $kw48$CREATE_TERM = SubLObjectFactory.makeKeyword("CREATE-TERM");
        $sym49$CB_LINK_CREATE_TERM = SubLObjectFactory.makeSymbol("CB-LINK-CREATE-TERM");
        $str50$Crt = SubLObjectFactory.makeString("Crt");
        $str51$Cyc_Constant_Creation_Wizard = SubLObjectFactory.makeString("Cyc Constant Creation Wizard");
        $sym52$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw53$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw54$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $const55$TemporaryLexicalAssertionsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt"));
        $sym56$CR_OR_LF = SubLObjectFactory.makeSymbol("CR-OR-LF");
        $str57$_a_does_not_specify_a_Cyc_term = SubLObjectFactory.makeString("~a does not specify a Cyc term");
        $sym58$CB_CATEGORIZE_TERM = SubLObjectFactory.makeSymbol("CB-CATEGORIZE-TERM");
        $str59$Categorize_Term = SubLObjectFactory.makeString("Categorize Term");
        $str60$cb_categorize_term__a = SubLObjectFactory.makeString("cb-categorize-term&~a");
        $kw61$CATEGORIZE_TERM = SubLObjectFactory.makeKeyword("CATEGORIZE-TERM");
        $sym62$CB_LINK_CATEGORIZE_TERM = SubLObjectFactory.makeSymbol("CB-LINK-CATEGORIZE-TERM");
        $sym63$_CB_CATEGORIZE_INFO_ = SubLObjectFactory.makeSymbol("*CB-CATEGORIZE-INFO*");
        $kw64$CB_CATEGORIZE_TERM = SubLObjectFactory.makeKeyword("CB-CATEGORIZE-TERM");
        $str65$cb_categorize_term_html = SubLObjectFactory.makeString("cb-categorize-term.html");
        $sym66$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str67$cb_handle_categorize_term = SubLObjectFactory.makeString("cb-handle-categorize-term");
        $str68$Categorize = SubLObjectFactory.makeString("Categorize");
        $str69$Categorize_ = SubLObjectFactory.makeString("Categorize ");
        $str70$_ = SubLObjectFactory.makeString(":");
        $str71$term = SubLObjectFactory.makeString("term");
        $str72$Mt___ = SubLObjectFactory.makeString("Mt : ");
        $str73$mt = SubLObjectFactory.makeString("mt");
        $const74$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $str75$Similar_to___ = SubLObjectFactory.makeString("Similar to : ");
        $str76$similar_to = SubLObjectFactory.makeString("similar-to");
        $int77$40 = SubLObjectFactory.makeInteger(40);
        $str78$Instance_of___ = SubLObjectFactory.makeString("Instance of : ");
        $str79$isa = SubLObjectFactory.makeString("isa");
        $str80$Specialization_of___ = SubLObjectFactory.makeString("Specialization of : ");
        $str81$genl = SubLObjectFactory.makeString("genl");
        $str82$generalization = SubLObjectFactory.makeString("generalization");
        $str83$_a_does_not_specify_a_Cyc_Microth = SubLObjectFactory.makeString("~a does not specify a Cyc Microtheory");
        $sym84$CB_HANDLE_CATEGORIZE_TERM = SubLObjectFactory.makeSymbol("CB-HANDLE-CATEGORIZE-TERM");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))));
        $sym86$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const87$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const88$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw89$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw90$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw91$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $const92$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("COL"));
        $kw94$CB_COPY_FROM_SIMILAR = SubLObjectFactory.makeKeyword("CB-COPY-FROM-SIMILAR");
        $str95$cb_copy_from_similar_html = SubLObjectFactory.makeString("cb-copy-from-similar.html");
        $str96$cb_handle_copy_from_similar = SubLObjectFactory.makeString("cb-handle-copy-from-similar");
        $str97$Copy_from_ = SubLObjectFactory.makeString("Copy from ");
        $str98$_to_ = SubLObjectFactory.makeString(" to ");
        $str99$Copy_Assertions = SubLObjectFactory.makeString("Copy Assertions");
        $str100$Check_the_assertions_from_ = SubLObjectFactory.makeString("Check the assertions from ");
        $str101$_which_you_wish_to_copy__ = SubLObjectFactory.makeString(" which you wish to copy: ");
        $sym102$CB_COPY_FROM_SIMILAR_CHECKBOX = SubLObjectFactory.makeSymbol("CB-COPY-FROM-SIMILAR-CHECKBOX");
        $str103$copy_from_similar_facilities = SubLObjectFactory.makeString("copy from similar facilities");
        $str104$No_source_term_was_specified = SubLObjectFactory.makeString("No source term was specified");
        $str105$Unable_to_determine_a_term_from__ = SubLObjectFactory.makeString("Unable to determine a term from ~S");
        $str106$No_term_was_specified = SubLObjectFactory.makeString("No term was specified");
        $sym107$CB_HANDLE_COPY_FROM_SIMILAR = SubLObjectFactory.makeSymbol("CB-HANDLE-COPY-FROM-SIMILAR");
        $kw108$CB_CONCEPTUALLY_RELATED_TERMS = SubLObjectFactory.makeKeyword("CB-CONCEPTUALLY-RELATED-TERMS");
        $str109$cb_conceptually_related_terms_htm = SubLObjectFactory.makeString("cb-conceptually-related-terms.html");
        $str110$Conceptually_Related_Suggestions = SubLObjectFactory.makeString("Conceptually Related Suggestions");
        $str111$cb_conceptually_related_terms = SubLObjectFactory.makeString("cb-conceptually-related-terms");
        $str112$fort = SubLObjectFactory.makeString("fort");
        $str113$Clear_All = SubLObjectFactory.makeString("Clear All");
        $str114$Term___ = SubLObjectFactory.makeString("Term : ");
        $str115$Existing_Conceptually_Related_Ter = SubLObjectFactory.makeString("Existing Conceptually Related Terms : ");
        $kw116$CT_CR_JUSTIFY = SubLObjectFactory.makeKeyword("CT-CR-JUSTIFY");
        $str117$_Justify_ = SubLObjectFactory.makeString("[Justify]");
        $str118$None = SubLObjectFactory.makeString("None");
        $str119$Specify_the_Microtheory_for_new__ = SubLObjectFactory.makeString("Specify the Microtheory for new #$conceptuallyRelated assertions:");
        $str120$_Mt___ = SubLObjectFactory.makeString(" Mt : ");
        $str121$_Select_terms_and_or_type_in_a_te = SubLObjectFactory.makeString(" Select terms and/or type in a term to add as #$conceptuallyRelated to ");
        $str122$__ = SubLObjectFactory.makeString(": ");
        $str123$entered = SubLObjectFactory.makeString("entered");
        $str124$_Term___ = SubLObjectFactory.makeString(" Term : ");
        $str125$Possible_Terms_to_Add___ = SubLObjectFactory.makeString("Possible Terms to Add : ");
        $str126$Add_Terms_Backward = SubLObjectFactory.makeString("Add Terms Backward");
        $str127$add_backward = SubLObjectFactory.makeString("add-backward");
        $str128$_as_ = SubLObjectFactory.makeString(" as ");
        $const129$conceptuallyRelated = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated"));
        $sym130$TERM = SubLObjectFactory.makeSymbol("TERM");
        $str131$_in_MT = SubLObjectFactory.makeString(" in MT");
        $str132$Add_Terms_Forward = SubLObjectFactory.makeString("Add Terms Forward");
        $str133$add_forward = SubLObjectFactory.makeString("add-forward");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $str135$Unable_to_determine_last_term__wh = SubLObjectFactory.makeString("Unable to determine last term (why?)");
        $str136$Invalid_Mt_specified____S = SubLObjectFactory.makeString("Invalid Mt specified : ~S");
        $kw137$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $sym138$CB_CONCEPTUALLY_RELATED_TERMS = SubLObjectFactory.makeSymbol("CB-CONCEPTUALLY-RELATED-TERMS");
        $str139$id = SubLObjectFactory.makeString("id");
        $str140$Formulas_Asserted = SubLObjectFactory.makeString("Formulas Asserted");
        $str141$Formulas_Asserted__ = SubLObjectFactory.makeString("Formulas Asserted :");
        $str142$_in_ = SubLObjectFactory.makeString(" in ");
        $sym143$WHY_CONCEPTUALLY_RELATED_ = SubLObjectFactory.makeSymbol("WHY-CONCEPTUALLY-RELATED?");
        $str144$Sorry__System_74_92_or_later_is_r = SubLObjectFactory.makeString("Sorry, System 74.92 or later is required for justification to work.");
        $str145$Justify_Conceptually_Related = SubLObjectFactory.makeString("Justify Conceptually Related");
        $sym146$CT_CR_JUSTIFY = SubLObjectFactory.makeSymbol("CT-CR-JUSTIFY");
        $str147$ct_cr_justify__a = SubLObjectFactory.makeString("ct-cr-justify&~a");
        $sym148$CB_LINK_CT_CR_JUSTIFY = SubLObjectFactory.makeSymbol("CB-LINK-CT-CR-JUSTIFY");
        $sym149$CB_ELABORATE_TERM = SubLObjectFactory.makeSymbol("CB-ELABORATE-TERM");
        $str150$Elaborate_Term = SubLObjectFactory.makeString("Elaborate Term");
        $str151$cb_elaborate_term__a = SubLObjectFactory.makeString("cb-elaborate-term&~a");
        $kw152$ELABORATE_TERM = SubLObjectFactory.makeKeyword("ELABORATE-TERM");
        $sym153$CB_LINK_ELABORATE_TERM = SubLObjectFactory.makeSymbol("CB-LINK-ELABORATE-TERM");
        $kw154$CB_ELABORATE_TERM = SubLObjectFactory.makeKeyword("CB-ELABORATE-TERM");
        $str155$cb_elaborate_term_html = SubLObjectFactory.makeString("cb-elaborate-term.html");
        $str156$cb_handle_elaborate_term = SubLObjectFactory.makeString("cb-handle-elaborate-term");
        $str157$Elaborate = SubLObjectFactory.makeString("Elaborate");
        $str158$Elaborate_ = SubLObjectFactory.makeString("Elaborate ");
        $str159$Requirements___ = SubLObjectFactory.makeString("Requirements : ");
        $str160$Suggestions___ = SubLObjectFactory.makeString("Suggestions : ");
        $list161 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keRequirement")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA"));
        $kw162$TERM = SubLObjectFactory.makeKeyword("TERM");
        $const163$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
    }
}

/*

	Total time: 1071 ms
	
*/