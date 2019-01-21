package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_similarity extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_similarity";
    public static final String myFingerPrint = "384dc61c359895c5706481624d1d11b245f8a34349cebe0857b3d9932dbee727";
    private static final SubLSymbol $kw0$BLUE_BALL;
    private static final SubLString $str1$blue_gif;
    private static final SubLSymbol $kw2$GREEN_BALL;
    private static final SubLString $str3$green_gif;
    private static final SubLSymbol $kw4$RED_BALL;
    private static final SubLString $str5$red_gif;
    private static final SubLSymbol $kw6$WHITE_BALL;
    private static final SubLString $str7$white_gif;
    private static final SubLSymbol $kw8$YELLOW_BALL;
    private static final SubLString $str9$yellow_gif;
    private static final SubLSymbol $sym10$ST_SIMILARITY_ENTRANCE;
    private static final SubLSymbol $kw11$HTML_HANDLER;
    private static final SubLString $str12$Similarity;
    private static final SubLSymbol $kw13$MAIN;
    private static final SubLString $str14$st_similarity_entrance;
    private static final SubLSymbol $kw15$SIMILARITY;
    private static final SubLSymbol $sym16$CB_LINK_SIMILARITY;
    private static final SubLString $str17$Sim;
    private static final SubLString $str18$Similarity_Tool;
    private static final SubLSymbol $kw19$ST_SIMILARITY;
    private static final SubLString $str20$st_similarity_html;
    private static final SubLString $str21$Similarity_Tool_Choose;
    private static final SubLString $str22$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str23$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw24$UNINITIALIZED;
    private static final SubLSymbol $kw25$CB_CYC;
    private static final SubLSymbol $kw26$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw27$SHA1;
    private static final SubLString $str28$yui_skin_sam;
    private static final SubLString $str29$reloadFrameButton;
    private static final SubLString $str30$button;
    private static final SubLString $str31$reload;
    private static final SubLString $str32$Refresh_Frames;
    private static final SubLSymbol $kw33$CLEAR_HISTORY;
    private static final SubLString $str34$cg_cb_similarity;
    private static final SubLSymbol $kw35$POST;
    private static final SubLString $str36$cb_similarity;
    private static final SubLString $str37$Run_Similarity_Tool;
    private static final SubLString $str38$Please_choose_two_or_more_constan;
    private static final SubLString $str39$Recent_Constants__;
    private static final SubLString $str40$None;
    private static final SubLString $str41$Recent_NATs__;
    private static final SubLSymbol $sym42$VALID_CONSTANT_;
    private static final SubLSymbol $sym43$VALID_NART_;
    private static final SubLString $str44$the_Similarity_Tool_page;
    private static final SubLString $str45$Cannot_show_similarity_for_just_o;
    private static final SubLSymbol $kw46$NBSP;
    private static final SubLString $str47$Check_or_uncheck_the_boxes_to_mak;
    private static final SubLString $str48$cg;
    private static final SubLString $str49$SimilarityForm;
    private static final SubLString $str50$cb_similarity_assert;
    private static final SubLString $str51$t;
    private static final SubLString $str52$Reset;
    private static final SubLString $str53$Submit;
    private static final SubLSymbol $sym54$CB_SIMILARITY;
    private static final SubLSymbol $kw55$CENTER;
    private static final SubLString $str56$_nbsp_;
    private static final SubLSymbol $kw57$LEFT;
    private static final SubLObject $const58$isa;
    private static final SubLObject $const59$genlPreds;
    private static final SubLObject $const60$genls;
    private static final SubLString $str61$_;
    private static final SubLString $str62$_;
    private static final SubLInteger $int63$32;
    private static final SubLString $str64$_dddddd;
    private static final SubLString $str65$_cccccc;
    private static final SubLString $str66$___;
    private static final SubLString $str67$__A_;
    private static final SubLSymbol $kw68$BASIS;
    private static final SubLSymbol $kw69$IMPLIED;
    private static final SubLSymbol $kw70$ASSERTED;
    private static final SubLString $str71$BIA_;
    private static final SubLString $str72$BI__;
    private static final SubLString $str73$B_A_;
    private static final SubLString $str74$B___;
    private static final SubLString $str75$_IA_;
    private static final SubLString $str76$_I__;
    private static final SubLString $str77$__A_;
    private static final SubLString $str78$____;
    private static final SubLSymbol $kw79$RIGHT;
    private static final SubLString $str80$cg_cb_af__a;
    private static final SubLSymbol $kw81$BOTTOM;
    private static final SubLString $str82$a;
    private static final SubLString $str83$x;
    private static final SubLString $str84$L_E_G_E_N_D;
    private static final SubLString $str85$_;
    private static final SubLString $str86$;
    private static final SubLString $str87$Asserted_in_KB_;
    private static final SubLString $str88$Asserted_in_KB__but_redundant_;
    private static final SubLSymbol $kw89$TOP;
    private static final SubLString $str90$Shown_as_asserted_in_KB_by_a_forw;
    private static final SubLString $str91$Not_asserted_in_KB__but_true_;
    private static final SubLString $str92$Neither_asserted_in_KB_nor_true_;
    private static final SubLInteger $int93$64;
    private static final SubLSymbol $sym94$ASSERT;
    private static final SubLSymbol $sym95$DO_NOTHING;
    private static final SubLSymbol $sym96$UNASSERT;
    private static final SubLString $str97$Asserting____A__A__A__in__A;
    private static final SubLString $str98$Result__;
    private static final SubLString $str99$Unasserting____A__A__A__from__A;
    private static final SubLSymbol $sym100$CB_SIMILARITY_ASSERT;
    private static final SubLString $str101$st__A__A__A__A__A_;
    private static final SubLString $str102$st__A__A__A__A_;
    private static final SubLString $str103$st__A__A__A_;
    private static final SubLString $str104$st__A__A_;
    private static final SubLString $str105$st__A_;
    private static final SubLList $list106;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 838L)
    public static SubLObject st_similarity_entrance(SubLObject args) {
        if (args == cb_similarity.UNPROVIDED) {
            args = (SubLObject)cb_similarity.NIL;
        }
        return st_similarity_entrance_internal();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 1559L)
    public static SubLObject cb_link_similarity(SubLObject linktext) {
        if (linktext == cb_similarity.UNPROVIDED) {
            linktext = (SubLObject)cb_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_similarity.NIL == linktext) {
            linktext = (SubLObject)cb_similarity.$str12$Similarity;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_similarity.$kw13$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_similarity.$str14$st_similarity_entrance);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        if (cb_similarity.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 2630L)
    public static SubLObject st_similarity_entrance_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_similarity.$str21$Similarity_Tool_Choose;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_similarity.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_similarity.$str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_similarity.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_similarity.$str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_similarity.$kw24$UNINITIALIZED) ? ConsesLow.list(cb_similarity.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_similarity.$kw25$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_similarity.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_similarity.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_similarity.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_similarity.$str28$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_similarity.$str29$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_similarity.$str30$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_similarity.$str31$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_similarity.$str32$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            if (cb_similarity.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_similarity.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_similarity.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_similarity.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_similarity.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_similarity.$kw19$ST_SIMILARITY, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                            cb_utilities.cb_link((SubLObject)cb_similarity.$kw33$CLEAR_HISTORY, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                            st_similarity_show_recent_history();
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 2931L)
    public static SubLObject st_similarity_show_recent_history() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_similarity.$str34$cg_cb_similarity);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_similarity.$kw35$POST);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_similarity.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_utilities.html_hidden_input((SubLObject)cb_similarity.$str36$cb_similarity, (SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_similarity.TWO_INTEGER);
            html_utilities.html_submit_input((SubLObject)cb_similarity.$str37$Run_Similarity_Tool, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_similarity.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)cb_similarity.$str38$Please_choose_two_or_more_constan);
            html_utilities.html_newline((SubLObject)cb_similarity.TWO_INTEGER);
            SubLObject items = st_similarity_constant_history_items();
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_similarity.$str39$Recent_Constants__);
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_similarity.UNPROVIDED);
            if (cb_similarity.NIL != items) {
                SubLObject cdolist_list_var = items;
                SubLObject item = (SubLObject)cb_similarity.NIL;
                item = cdolist_list_var.first();
                while (cb_similarity.NIL != cdolist_list_var) {
                    html_utilities.html_checkbox_input(cb_utilities.cb_fort_identifier(item), (SubLObject)cb_similarity.T, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_similarity.TWO_INTEGER);
                    cb_utilities.cb_form(item, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)cb_similarity.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
            }
            else {
                html_utilities.html_princ((SubLObject)cb_similarity.$str40$None);
            }
            html_utilities.html_newline((SubLObject)cb_similarity.TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_similarity.$str41$Recent_NATs__);
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_similarity.UNPROVIDED);
            items = st_similarity_nat_history_items();
            if (cb_similarity.NIL != items) {
                SubLObject cdolist_list_var = items;
                SubLObject item = (SubLObject)cb_similarity.NIL;
                item = cdolist_list_var.first();
                while (cb_similarity.NIL != cdolist_list_var) {
                    html_utilities.html_checkbox_input(cb_utilities.cb_fort_identifier(item), (SubLObject)cb_similarity.T, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_similarity.TWO_INTEGER);
                    cb_utilities.cb_form(item, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)cb_similarity.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
            }
            else {
                html_utilities.html_princ((SubLObject)cb_similarity.$str40$None);
            }
            html_utilities.html_newline((SubLObject)cb_similarity.TWO_INTEGER);
            html_utilities.html_submit_input((SubLObject)cb_similarity.$str37$Run_Similarity_Tool, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_similarity.TWO_INTEGER);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return (SubLObject)cb_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 5898L)
    public static SubLObject st_similarity_constant_history_items() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_constant_history$.setDynamicValue(list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)cb_similarity.$sym42$VALID_CONSTANT_), cb_parameters.$cb_constant_history$.getDynamicValue(thread), (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED), thread);
        return conses_high.copy_list(cb_parameters.$cb_constant_history$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 6475L)
    public static SubLObject st_similarity_nat_history_items() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_parameters.$cb_nat_history$.setDynamicValue(list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)cb_similarity.$sym43$VALID_NART_), cb_parameters.$cb_nat_history$.getDynamicValue(thread), (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED), thread);
        return conses_high.copy_list(cb_parameters.$cb_nat_history$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 6999L)
    public static SubLObject cb_similarity(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_similarity.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_similarity.$str44$the_Similarity_Tool_page);
            return (SubLObject)cb_similarity.NIL;
        }
        SubLObject fort_list = (SubLObject)cb_similarity.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)cb_similarity.NIL;
        arg = cdolist_list_var.first();
        while (cb_similarity.NIL != cdolist_list_var) {
            if (arg.isList()) {
                final SubLObject fort_spec = arg.first();
                final SubLObject fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_similarity.UNPROVIDED);
                if (cb_similarity.NIL != forts.fort_p(fort)) {
                    fort_list = (SubLObject)ConsesLow.cons(fort, fort_list);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        fort_list = Sequences.nreverse(Sequences.remove_duplicates(fort_list, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED));
        if (cb_similarity.NIL == fort_list.rest()) {
            cb_utilities.cb_error((SubLObject)cb_similarity.$str45$Cannot_show_similarity_for_just_o, fort_list.first(), (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
            return (SubLObject)cb_similarity.NIL;
        }
        final SubLObject title_var = (SubLObject)cb_similarity.$str18$Similarity_Tool;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_similarity.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_similarity.$str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_similarity.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_similarity.$str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
            final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_similarity.$kw24$UNINITIALIZED) ? ConsesLow.list(cb_similarity.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_similarity.$kw25$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_similarity.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_similarity.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_similarity.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_similarity.$str28$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_similarity.$str29$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_similarity.$str30$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_similarity.$str31$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_similarity.$str32$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            if (cb_similarity.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_similarity.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_similarity.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_similarity.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        }
                        cb_utilities.cb_help_preamble((SubLObject)cb_similarity.$kw19$ST_SIMILARITY, (SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_glyph((SubLObject)cb_similarity.$kw46$NBSP, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_similarity.$str47$Check_or_uncheck_the_boxes_to_mak);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_similarity.$str48$cg);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_similarity.$kw35$POST);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_similarity.$str49$SimilarityForm);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_similarity.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_similarity.$str50$cb_similarity_assert, (SubLObject)cb_similarity.$str51$t, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_similarity.$str30$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_similarity.$str52$Reset);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            if (cb_similarity.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_similarity.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_similarity.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_similarity.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                st_html_tree(fort_list, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_similarity.$str53$Submit, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_similarity.TWO_INTEGER);
                            st_html_legend();
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$6, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 9018L)
    public static SubLObject st_html_td_pipes(final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        SubLObject bgcolor = html_macros.$html_color_light_grey$.getGlobalValue();
        SubLObject grey_toggle = (SubLObject)cb_similarity.NIL;
        if (n.numG((SubLObject)cb_similarity.ZERO_INTEGER)) {
            SubLObject x;
            SubLObject _prev_bind_2;
            for (x = (SubLObject)cb_similarity.NIL, x = (SubLObject)cb_similarity.ZERO_INTEGER; x.numL(n); x = Numbers.add(x, (SubLObject)cb_similarity.ONE_INTEGER)) {
                bgcolor = ((cb_similarity.NIL != grey_toggle) ? html_macros.$html_color_light_grey$.getGlobalValue() : html_macros.$html_color_lighter_grey$.getGlobalValue());
                if (cb_similarity.NIL != grey_toggle) {
                    grey_toggle = (SubLObject)cb_similarity.NIL;
                }
                else {
                    grey_toggle = (SubLObject)cb_similarity.T;
                }
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_similarity.$kw55$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                if (cb_similarity.NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                    html_utilities.html_markup((SubLObject)cb_similarity.$str56$_nbsp_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
        }
        return (SubLObject)cb_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 9811L)
    public static SubLObject st_html_table_top(final SubLObject cols) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject width = Numbers.add((SubLObject)cb_similarity.ONE_INTEGER, Sequences.length(cols));
        SubLObject count = (SubLObject)cb_similarity.ZERO_INTEGER;
        SubLObject cdolist_list_var = cols;
        SubLObject col = (SubLObject)cb_similarity.NIL;
        col = cdolist_list_var.first();
        while (cb_similarity.NIL != cdolist_list_var) {
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                st_html_td_pipes(count);
                final SubLObject span = Numbers.subtract(width, count);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (cb_similarity.NIL != span) {
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup(span);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_similarity.$kw57$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_similarity.FOUR_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                        cb_utilities.cb_form(col, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
            count = Numbers.add(count, (SubLObject)cb_similarity.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return (SubLObject)cb_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 10576L)
    public static SubLObject st_html_tree(final SubLObject cols, SubLObject pred, SubLObject mt) {
        if (pred == cb_similarity.UNPROVIDED) {
            pred = (SubLObject)cb_similarity.NIL;
        }
        if (mt == cb_similarity.UNPROVIDED) {
            mt = (SubLObject)cb_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject span = Sequences.length(cols);
        if (cb_similarity.NIL == pred) {
            st_html_table_top(cols);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(cb_similarity.$const58$isa, cb_similarity.$const59$genlPreds, (SubLObject)cb_similarity.TWO_INTEGER, (SubLObject)cb_similarity.ONE_INTEGER, (SubLObject)cb_similarity.UNPROVIDED);
            SubLObject isa_genlpred = (SubLObject)cb_similarity.NIL;
            isa_genlpred = cdolist_list_var.first();
            while (cb_similarity.NIL != cdolist_list_var) {
                st_html_tree(cols, isa_genlpred, (SubLObject)cb_similarity.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                isa_genlpred = cdolist_list_var.first();
            }
            st_html_tree(cols, cb_similarity.$const58$isa, (SubLObject)cb_similarity.UNPROVIDED);
            cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(cb_similarity.$const60$genls, cb_similarity.$const59$genlPreds, (SubLObject)cb_similarity.TWO_INTEGER, (SubLObject)cb_similarity.ONE_INTEGER, (SubLObject)cb_similarity.UNPROVIDED);
            SubLObject genls_genlpred = (SubLObject)cb_similarity.NIL;
            genls_genlpred = cdolist_list_var.first();
            while (cb_similarity.NIL != cdolist_list_var) {
                st_html_tree(cols, genls_genlpred, (SubLObject)cb_similarity.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                genls_genlpred = cdolist_list_var.first();
            }
            st_html_tree(cols, cb_similarity.$const60$genls, (SubLObject)cb_similarity.UNPROVIDED);
            return (SubLObject)cb_similarity.NIL;
        }
        if (cb_similarity.NIL == mt) {
            final SubLObject mts = similarity.find_relevant_mts(cols, pred);
            if (cb_similarity.NIL != mts) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                    st_html_td_pipes(span);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_similarity.$kw55$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    if (cb_similarity.NIL != html_macros.$html_color_light_purple$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_color_light_purple$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                        cb_utilities.cb_form(pred, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                SubLObject cdolist_list_var2 = mts;
                SubLObject mt_$15 = (SubLObject)cb_similarity.NIL;
                mt_$15 = cdolist_list_var2.first();
                while (cb_similarity.NIL != cdolist_list_var2) {
                    st_html_tree(cols, pred, mt_$15);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    mt_$15 = cdolist_list_var2.first();
                }
            }
            return (SubLObject)cb_similarity.NIL;
        }
        Hashtables.clrhash(similarity.$similarity_relation_hash$.getDynamicValue(thread));
        final SubLObject similarity_tree = similarity.make_similarity_tree(cols, pred, mt);
        if (cb_similarity.NIL != similarity_tree) {
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                st_html_td_pipes(span);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_similarity.$kw55$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                if (cb_similarity.NIL != html_macros.$html_color_light_blue$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_light_blue$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_similarity.$str61$_);
                    cb_utilities.cb_form(mt, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_similarity.$str62$_);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
            st_html_print_tree(similarity_tree, cols, pred, mt);
        }
        return (SubLObject)cb_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 13492L)
    public static SubLObject st_html_print_tree(final SubLObject edge_list, final SubLObject cols, final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node_note_number = Hashtables.make_hash_table((SubLObject)cb_similarity.$int63$32, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
        SubLObject count = (SubLObject)cb_similarity.ZERO_INTEGER;
        SubLObject bgcolor = (SubLObject)cb_similarity.NIL;
        thread.resetMultipleValues();
        final SubLObject node_ordering = similarity.st_order_nodes_in_dag(edge_list, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
        final SubLObject forward_links = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject color_toggle = (SubLObject)cb_similarity.NIL;
        SubLObject list_var = (SubLObject)cb_similarity.NIL;
        SubLObject node_with_indent = (SubLObject)cb_similarity.NIL;
        SubLObject ignore_me = (SubLObject)cb_similarity.NIL;
        list_var = node_ordering;
        node_with_indent = list_var.first();
        for (ignore_me = (SubLObject)cb_similarity.ZERO_INTEGER; cb_similarity.NIL != list_var; list_var = list_var.rest(), node_with_indent = list_var.first(), ignore_me = Numbers.add((SubLObject)cb_similarity.ONE_INTEGER, ignore_me)) {
            if (cb_similarity.NIL != color_toggle) {
                color_toggle = (SubLObject)cb_similarity.NIL;
            }
            else {
                color_toggle = (SubLObject)cb_similarity.T;
            }
            bgcolor = (SubLObject)((cb_similarity.NIL != color_toggle) ? cb_similarity.$str64$_dddddd : cb_similarity.$str65$_cccccc);
            final SubLObject node = node_with_indent.first();
            final SubLObject indent = conses_high.second(node_with_indent);
            html_utilities.html_terpri((SubLObject)cb_similarity.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                    html_utilities.html_glyph((SubLObject)cb_similarity.$kw46$NBSP, (SubLObject)cb_similarity.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                st_html_print_node(node, cols, pred, mt);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (cb_similarity.NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                    if (!indent.numE((SubLObject)cb_similarity.ZERO_INTEGER)) {
                        html_utilities.html_glyph((SubLObject)cb_similarity.$kw46$NBSP, (SubLObject)cb_similarity.TWO_INTEGER);
                        SubLObject cdotimes_end_var;
                        SubLObject i;
                        for (cdotimes_end_var = Numbers.multiply((SubLObject)cb_similarity.FOUR_INTEGER, Numbers.subtract(indent, (SubLObject)cb_similarity.ONE_INTEGER)), i = (SubLObject)cb_similarity.NIL, i = (SubLObject)cb_similarity.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)cb_similarity.ONE_INTEGER)) {
                            html_utilities.html_glyph((SubLObject)cb_similarity.$kw46$NBSP, (SubLObject)cb_similarity.TWO_INTEGER);
                        }
                        html_utilities.html_princ((SubLObject)cb_similarity.$str66$___);
                    }
                    html_utilities.html_glyph((SubLObject)cb_similarity.$kw46$NBSP, (SubLObject)cb_similarity.TWO_INTEGER);
                    SubLObject cdolist_list_var = similarity.edge_list_node_parents(forward_links, node);
                    SubLObject parent = (SubLObject)cb_similarity.NIL;
                    parent = cdolist_list_var.first();
                    while (cb_similarity.NIL != cdolist_list_var) {
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_similarity.$str67$__A_, Hashtables.gethash(parent, node_note_number, (SubLObject)cb_similarity.UNPROVIDED));
                        html_utilities.html_glyph((SubLObject)cb_similarity.$kw46$NBSP, (SubLObject)cb_similarity.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        parent = cdolist_list_var.first();
                    }
                    cb_utilities.cb_form(node, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                    if (cb_similarity.NIL != similarity.edge_list_node_children(forward_links, node)) {
                        count = Numbers.add(count, (SubLObject)cb_similarity.ONE_INTEGER);
                        Hashtables.sethash(node, node_note_number, count);
                        html_utilities.html_glyph((SubLObject)cb_similarity.$kw46$NBSP, (SubLObject)cb_similarity.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_similarity.$str67$__A_, count);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
        }
        return (SubLObject)cb_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 15106L)
    public static SubLObject st_html_print_node(final SubLObject node, final SubLObject cols, final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject temp_string = (SubLObject)cb_similarity.NIL;
        SubLObject bgcolor = (SubLObject)cb_similarity.NIL;
        SubLObject color_toggle = (SubLObject)cb_similarity.NIL;
        SubLObject list_var = (SubLObject)cb_similarity.NIL;
        SubLObject c = (SubLObject)cb_similarity.NIL;
        SubLObject ignore_me = (SubLObject)cb_similarity.NIL;
        list_var = cols;
        c = list_var.first();
        for (ignore_me = (SubLObject)cb_similarity.ZERO_INTEGER; cb_similarity.NIL != list_var; list_var = list_var.rest(), c = list_var.first(), ignore_me = Numbers.add((SubLObject)cb_similarity.ONE_INTEGER, ignore_me)) {
            if (cb_similarity.NIL != color_toggle) {
                color_toggle = (SubLObject)cb_similarity.NIL;
            }
            else {
                color_toggle = (SubLObject)cb_similarity.T;
            }
            bgcolor = (SubLObject)((cb_similarity.NIL != color_toggle) ? cb_similarity.$str64$_dddddd : cb_similarity.$str65$_cccccc);
            final SubLObject nodepair = (SubLObject)ConsesLow.list(c, node);
            if (cb_similarity.NIL != similarity.sim_check_relation(nodepair, (SubLObject)cb_similarity.$kw68$BASIS)) {
                if (cb_similarity.NIL != similarity.sim_check_relation(nodepair, (SubLObject)cb_similarity.$kw69$IMPLIED)) {
                    if (cb_similarity.NIL != similarity.sim_check_relation(nodepair, (SubLObject)cb_similarity.$kw70$ASSERTED)) {
                        temp_string = PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str71$BIA_);
                    }
                    else {
                        temp_string = PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str72$BI__);
                    }
                }
                else if (cb_similarity.NIL != similarity.sim_check_relation(nodepair, (SubLObject)cb_similarity.$kw70$ASSERTED)) {
                    temp_string = PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str73$B_A_);
                }
                else {
                    temp_string = PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str74$B___);
                }
            }
            else if (cb_similarity.NIL != similarity.sim_check_relation(nodepair, (SubLObject)cb_similarity.$kw69$IMPLIED)) {
                if (cb_similarity.NIL != similarity.sim_check_relation(nodepair, (SubLObject)cb_similarity.$kw70$ASSERTED)) {
                    temp_string = PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str75$_IA_);
                }
                else {
                    temp_string = PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str76$_I__);
                }
            }
            else if (cb_similarity.NIL != similarity.sim_check_relation(nodepair, (SubLObject)cb_similarity.$kw70$ASSERTED)) {
                temp_string = PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str77$__A_);
            }
            else {
                temp_string = PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str78$____);
            }
            final SubLObject assertedP = similarity.sim_check_relation(nodepair, (SubLObject)cb_similarity.$kw70$ASSERTED);
            final SubLObject impliedP = similarity.sim_check_relation(nodepair, (SubLObject)cb_similarity.$kw69$IMPLIED);
            final SubLObject basisP = similarity.sim_check_relation(nodepair, (SubLObject)cb_similarity.$kw68$BASIS);
            if (cb_similarity.NIL != assertedP) {
                if (cb_similarity.NIL != basisP) {
                    bgcolor = html_macros.$html_color_light_yellow$.getGlobalValue();
                }
                else {
                    bgcolor = html_macros.$html_color_light_red$.getGlobalValue();
                }
            }
            else if (cb_similarity.NIL != impliedP) {
                bgcolor = html_macros.$html_color_light_green$.getGlobalValue();
            }
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_similarity.$kw79$RIGHT));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
            if (cb_similarity.NIL != bgcolor) {
                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                html_utilities.html_markup(bgcolor);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                final SubLObject assertion = kb_indexing.find_gaf((SubLObject)ConsesLow.list(pred, c, node), mt);
                if (cb_similarity.NIL != assertion) {
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_similarity.$str80$cg_cb_af__a, assertion_handles.assertion_id(assertion));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                        cb_utilities.html_assertion_marker(assertion, (SubLObject)cb_similarity.$kw81$BOTTOM);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                }
                if (cb_similarity.NIL != assertedP) {
                    html_utilities.html_hidden_input(st_make_a_string(pred, mt, node, c, (SubLObject)cb_similarity.UNPROVIDED), (SubLObject)cb_similarity.$str82$a, (SubLObject)cb_similarity.UNPROVIDED);
                }
                html_utilities.html_checkbox_input(st_make_a_string(pred, mt, node, c, (SubLObject)cb_similarity.UNPROVIDED), (SubLObject)cb_similarity.$str83$x, assertedP, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        return (SubLObject)cb_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 17670L)
    public static SubLObject st_html_legend() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_similarity.ONE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_similarity.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_similarity.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_similarity.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_similarity.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_similarity.THREE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_similarity.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_similarity.$kw55$CENTER));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_similarity.FOUR_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_similarity.$str84$L_E_G_E_N_D);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_similarity.$kw79$RIGHT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            if (cb_similarity.NIL != html_macros.$html_color_light_yellow$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_color_light_yellow$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                html_utilities.html_markup(html_macros.$html_subscript_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_similarity.EIGHT_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_similarity.$str85$_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_subscript_tail$.getGlobalValue());
                                html_utilities.html_checkbox_input((SubLObject)cb_similarity.$str86$, (SubLObject)cb_similarity.$str86$, (SubLObject)cb_similarity.T, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                html_utilities.html_princ((SubLObject)cb_similarity.$str87$Asserted_in_KB_);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_similarity.$kw79$RIGHT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            if (cb_similarity.NIL != html_macros.$html_color_light_red$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_color_light_red$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                html_utilities.html_markup(html_macros.$html_subscript_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_similarity.EIGHT_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_similarity.$str85$_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_subscript_tail$.getGlobalValue());
                                html_utilities.html_checkbox_input((SubLObject)cb_similarity.$str86$, (SubLObject)cb_similarity.$str86$, (SubLObject)cb_similarity.T, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                html_utilities.html_princ((SubLObject)cb_similarity.$str88$Asserted_in_KB__but_redundant_);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_similarity.$kw79$RIGHT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            if (cb_similarity.NIL != html_macros.$html_color_light_green$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_color_light_green$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_similarity.$kw2$GREEN_BALL);
                                final SubLObject align = (SubLObject)cb_similarity.$kw89$TOP;
                                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_similarity.$kw2$GREEN_BALL);
                                final SubLObject border = (SubLObject)cb_similarity.ZERO_INTEGER;
                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_markup(image_src);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                if (cb_similarity.NIL != alt) {
                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                    html_utilities.html_markup(alt);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                }
                                if (cb_similarity.NIL != align) {
                                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align(align));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                }
                                if (cb_similarity.NIL != border) {
                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                    html_utilities.html_markup(border);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                html_utilities.html_checkbox_input((SubLObject)cb_similarity.$str86$, (SubLObject)cb_similarity.$str86$, (SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                html_utilities.html_princ((SubLObject)cb_similarity.$str90$Shown_as_asserted_in_KB_by_a_forw);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_similarity.$kw79$RIGHT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            if (cb_similarity.NIL != html_macros.$html_color_light_green$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_color_light_green$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                html_utilities.html_checkbox_input((SubLObject)cb_similarity.$str86$, (SubLObject)cb_similarity.$str86$, (SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                html_utilities.html_princ((SubLObject)cb_similarity.$str91$Not_asserted_in_KB__but_true_);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                        final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_similarity.$kw79$RIGHT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            if (cb_similarity.NIL != html_macros.$html_color_lighter_grey$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_similarity.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                html_utilities.html_checkbox_input((SubLObject)cb_similarity.$str86$, (SubLObject)cb_similarity.$str86$, (SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_similarity.UNPROVIDED);
                            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_similarity.T, thread);
                                html_utilities.html_princ((SubLObject)cb_similarity.$str92$Neither_asserted_in_KB_nor_true_);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_similarity.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 19629L)
    public static SubLObject cb_similarity_assert(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_hash = Hashtables.make_hash_table((SubLObject)cb_similarity.$int93$64, (SubLObject)cb_similarity.EQUAL, (SubLObject)cb_similarity.UNPROVIDED);
        if (cb_similarity.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_similarity.$str44$the_Similarity_Tool_page);
            return (SubLObject)cb_similarity.NIL;
        }
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)cb_similarity.NIL;
        arg = cdolist_list_var.first();
        while (cb_similarity.NIL != cdolist_list_var) {
            if (arg.isList()) {
                final SubLObject assertion = arg.first();
                final SubLObject indicator = conses_high.second(arg);
                final SubLObject cur_state = Hashtables.gethash(assertion, assertion_hash, (SubLObject)cb_similarity.UNPROVIDED);
                if (indicator.equal((SubLObject)cb_similarity.$str83$x)) {
                    if (cb_similarity.NIL == cur_state) {
                        Hashtables.sethash(assertion, assertion_hash, (SubLObject)cb_similarity.$sym94$ASSERT);
                    }
                    else {
                        Hashtables.sethash(assertion, assertion_hash, (SubLObject)cb_similarity.$sym95$DO_NOTHING);
                    }
                }
                if (indicator.equal((SubLObject)cb_similarity.$str82$a)) {
                    if (cb_similarity.NIL == cur_state) {
                        Hashtables.sethash(assertion, assertion_hash, (SubLObject)cb_similarity.$sym96$UNASSERT);
                    }
                    else {
                        Hashtables.sethash(assertion, assertion_hash, (SubLObject)cb_similarity.$sym95$DO_NOTHING);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        SubLObject k = (SubLObject)cb_similarity.NIL;
        SubLObject v = (SubLObject)cb_similarity.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(assertion_hash);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                k = Hashtables.getEntryKey(cdohash_entry);
                v = Hashtables.getEntryValue(cdohash_entry);
                thread.resetMultipleValues();
                final SubLObject pred = st_break_a_string(k);
                final SubLObject mt = thread.secondMultipleValue();
                final SubLObject col = thread.thirdMultipleValue();
                final SubLObject v_const = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                final SubLObject pcase_var = v;
                if (pcase_var.eql((SubLObject)cb_similarity.$sym94$ASSERT)) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_similarity.$str97$Asserting____A__A__A__in__A, new SubLObject[] { pred, v_const, col, mt });
                    html_utilities.html_newline((SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_similarity.$str98$Result__);
                    cb_utilities.cb_form(ke.ke_assert_now((SubLObject)ConsesLow.list(pred, v_const, col), mt, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED), (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)cb_similarity.TWO_INTEGER);
                }
                else {
                    if (!pcase_var.eql((SubLObject)cb_similarity.$sym96$UNASSERT)) {
                        continue;
                    }
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_similarity.$str99$Unasserting____A__A__A__from__A, new SubLObject[] { pred, v_const, col, mt });
                    html_utilities.html_newline((SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_similarity.$str98$Result__);
                    cb_utilities.cb_form(ke.ke_unassert_now((SubLObject)ConsesLow.list(pred, v_const, col), mt), (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)cb_similarity.TWO_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        st_similarity_entrance((SubLObject)cb_similarity.NIL);
        return (SubLObject)cb_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 21714L)
    public static SubLObject st_make_a_string(final SubLObject pred, SubLObject mt, SubLObject col, SubLObject v_const, SubLObject truth) {
        if (mt == cb_similarity.UNPROVIDED) {
            mt = (SubLObject)cb_similarity.NIL;
        }
        if (col == cb_similarity.UNPROVIDED) {
            col = (SubLObject)cb_similarity.NIL;
        }
        if (v_const == cb_similarity.UNPROVIDED) {
            v_const = (SubLObject)cb_similarity.NIL;
        }
        if (truth == cb_similarity.UNPROVIDED) {
            truth = (SubLObject)cb_similarity.NIL;
        }
        final SubLObject pred_id = cb_utilities.cb_fort_identifier(pred);
        final SubLObject mt_id = cb_utilities.cb_fort_identifier(mt);
        final SubLObject col_id = cb_utilities.cb_fort_identifier(col);
        final SubLObject const_id = cb_utilities.cb_fort_identifier(v_const);
        if (cb_similarity.NIL == pred) {
            return (SubLObject)cb_similarity.NIL;
        }
        if (cb_similarity.NIL == mt) {
            return PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str105$st__A_, pred_id);
        }
        if (cb_similarity.NIL == col) {
            return PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str104$st__A__A_, pred_id, mt_id);
        }
        if (cb_similarity.NIL == v_const) {
            return PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str103$st__A__A__A_, new SubLObject[] { pred_id, mt_id, col_id });
        }
        if (cb_similarity.NIL != truth) {
            return PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str101$st__A__A__A__A__A_, new SubLObject[] { pred_id, mt_id, col_id, const_id, truth });
        }
        return PrintLow.format((SubLObject)cb_similarity.NIL, (SubLObject)cb_similarity.$str102$st__A__A__A__A_, new SubLObject[] { pred_id, mt_id, col_id, const_id });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 23097L)
    public static SubLObject st_break_a_string(final SubLObject s) {
        final SubLObject s_list = string_utilities.string_tokenize(s, (SubLObject)cb_similarity.$list106, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED, (SubLObject)cb_similarity.UNPROVIDED);
        final SubLObject pred = cb_utilities.cb_guess_fort(ConsesLow.nth((SubLObject)cb_similarity.ONE_INTEGER, s_list), (SubLObject)cb_similarity.UNPROVIDED);
        final SubLObject mt = cb_utilities.cb_guess_fort(ConsesLow.nth((SubLObject)cb_similarity.TWO_INTEGER, s_list), (SubLObject)cb_similarity.UNPROVIDED);
        final SubLObject col = cb_utilities.cb_guess_fort(ConsesLow.nth((SubLObject)cb_similarity.THREE_INTEGER, s_list), (SubLObject)cb_similarity.UNPROVIDED);
        final SubLObject v_const = cb_utilities.cb_guess_fort(ConsesLow.nth((SubLObject)cb_similarity.FOUR_INTEGER, s_list), (SubLObject)cb_similarity.UNPROVIDED);
        return Values.values(pred, mt, col, v_const);
    }
    
    public static SubLObject declare_cb_similarity_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_similarity_entrance", "ST-SIMILARITY-ENTRANCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "cb_link_similarity", "CB-LINK-SIMILARITY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_similarity_entrance_internal", "ST-SIMILARITY-ENTRANCE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_similarity_show_recent_history", "ST-SIMILARITY-SHOW-RECENT-HISTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_similarity_constant_history_items", "ST-SIMILARITY-CONSTANT-HISTORY-ITEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_similarity_nat_history_items", "ST-SIMILARITY-NAT-HISTORY-ITEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "cb_similarity", "CB-SIMILARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_html_td_pipes", "ST-HTML-TD-PIPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_html_table_top", "ST-HTML-TABLE-TOP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_html_tree", "ST-HTML-TREE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_html_print_tree", "ST-HTML-PRINT-TREE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_html_print_node", "ST-HTML-PRINT-NODE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_html_legend", "ST-HTML-LEGEND", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "cb_similarity_assert", "CB-SIMILARITY-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_make_a_string", "ST-MAKE-A-STRING", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_similarity", "st_break_a_string", "ST-BREAK-A-STRING", 1, 0, false);
        return (SubLObject)cb_similarity.NIL;
    }
    
    public static SubLObject init_cb_similarity_file() {
        return (SubLObject)cb_similarity.NIL;
    }
    
    public static SubLObject setup_cb_similarity_file() {
        Hashtables.sethash((SubLObject)cb_similarity.$kw0$BLUE_BALL, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_similarity.$str1$blue_gif, (SubLObject)cb_similarity.NIL));
        Hashtables.sethash((SubLObject)cb_similarity.$kw2$GREEN_BALL, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_similarity.$str3$green_gif, (SubLObject)cb_similarity.NIL));
        Hashtables.sethash((SubLObject)cb_similarity.$kw4$RED_BALL, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_similarity.$str5$red_gif, (SubLObject)cb_similarity.NIL));
        Hashtables.sethash((SubLObject)cb_similarity.$kw6$WHITE_BALL, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_similarity.$str7$white_gif, (SubLObject)cb_similarity.NIL));
        Hashtables.sethash((SubLObject)cb_similarity.$kw8$YELLOW_BALL, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_similarity.$str9$yellow_gif, (SubLObject)cb_similarity.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_similarity.$sym10$ST_SIMILARITY_ENTRANCE, (SubLObject)cb_similarity.$kw11$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_similarity.$kw15$SIMILARITY, (SubLObject)cb_similarity.$sym16$CB_LINK_SIMILARITY, (SubLObject)cb_similarity.ONE_INTEGER);
        cb_utilities.declare_deprecated_cb_tool((SubLObject)cb_similarity.$kw15$SIMILARITY, (SubLObject)cb_similarity.$str12$Similarity, (SubLObject)cb_similarity.$str17$Sim, (SubLObject)cb_similarity.$str18$Similarity_Tool);
        Hashtables.sethash((SubLObject)cb_similarity.$kw19$ST_SIMILARITY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_similarity.$str20$st_similarity_html, (SubLObject)cb_similarity.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_similarity.$sym54$CB_SIMILARITY, (SubLObject)cb_similarity.$kw11$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_similarity.$sym100$CB_SIMILARITY_ASSERT, (SubLObject)cb_similarity.$kw11$HTML_HANDLER);
        return (SubLObject)cb_similarity.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_similarity_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_similarity_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_similarity_file();
    }
    
    static {
        me = (SubLFile)new cb_similarity();
        $kw0$BLUE_BALL = SubLObjectFactory.makeKeyword("BLUE-BALL");
        $str1$blue_gif = SubLObjectFactory.makeString("blue.gif");
        $kw2$GREEN_BALL = SubLObjectFactory.makeKeyword("GREEN-BALL");
        $str3$green_gif = SubLObjectFactory.makeString("green.gif");
        $kw4$RED_BALL = SubLObjectFactory.makeKeyword("RED-BALL");
        $str5$red_gif = SubLObjectFactory.makeString("red.gif");
        $kw6$WHITE_BALL = SubLObjectFactory.makeKeyword("WHITE-BALL");
        $str7$white_gif = SubLObjectFactory.makeString("white.gif");
        $kw8$YELLOW_BALL = SubLObjectFactory.makeKeyword("YELLOW-BALL");
        $str9$yellow_gif = SubLObjectFactory.makeString("yellow.gif");
        $sym10$ST_SIMILARITY_ENTRANCE = SubLObjectFactory.makeSymbol("ST-SIMILARITY-ENTRANCE");
        $kw11$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str12$Similarity = SubLObjectFactory.makeString("Similarity");
        $kw13$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str14$st_similarity_entrance = SubLObjectFactory.makeString("st-similarity-entrance");
        $kw15$SIMILARITY = SubLObjectFactory.makeKeyword("SIMILARITY");
        $sym16$CB_LINK_SIMILARITY = SubLObjectFactory.makeSymbol("CB-LINK-SIMILARITY");
        $str17$Sim = SubLObjectFactory.makeString("Sim");
        $str18$Similarity_Tool = SubLObjectFactory.makeString("Similarity Tool");
        $kw19$ST_SIMILARITY = SubLObjectFactory.makeKeyword("ST-SIMILARITY");
        $str20$st_similarity_html = SubLObjectFactory.makeString("st-similarity.html");
        $str21$Similarity_Tool_Choose = SubLObjectFactory.makeString("Similarity Tool Choose");
        $str22$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str23$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw24$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw25$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw26$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw27$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str28$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str29$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str30$button = SubLObjectFactory.makeString("button");
        $str31$reload = SubLObjectFactory.makeString("reload");
        $str32$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $kw33$CLEAR_HISTORY = SubLObjectFactory.makeKeyword("CLEAR-HISTORY");
        $str34$cg_cb_similarity = SubLObjectFactory.makeString("cg?cb-similarity");
        $kw35$POST = SubLObjectFactory.makeKeyword("POST");
        $str36$cb_similarity = SubLObjectFactory.makeString("cb-similarity");
        $str37$Run_Similarity_Tool = SubLObjectFactory.makeString("Run Similarity Tool");
        $str38$Please_choose_two_or_more_constan = SubLObjectFactory.makeString("Please choose two or more constants.");
        $str39$Recent_Constants__ = SubLObjectFactory.makeString("Recent Constants :");
        $str40$None = SubLObjectFactory.makeString("None");
        $str41$Recent_NATs__ = SubLObjectFactory.makeString("Recent NATs :");
        $sym42$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $sym43$VALID_NART_ = SubLObjectFactory.makeSymbol("VALID-NART?");
        $str44$the_Similarity_Tool_page = SubLObjectFactory.makeString("the Similarity Tool page");
        $str45$Cannot_show_similarity_for_just_o = SubLObjectFactory.makeString("Cannot show similarity for just one constant: ~A.");
        $kw46$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $str47$Check_or_uncheck_the_boxes_to_mak = SubLObjectFactory.makeString("Check or uncheck the boxes to make or remove assertions.");
        $str48$cg = SubLObjectFactory.makeString("cg");
        $str49$SimilarityForm = SubLObjectFactory.makeString("SimilarityForm");
        $str50$cb_similarity_assert = SubLObjectFactory.makeString("cb-similarity-assert");
        $str51$t = SubLObjectFactory.makeString("t");
        $str52$Reset = SubLObjectFactory.makeString("Reset");
        $str53$Submit = SubLObjectFactory.makeString("Submit");
        $sym54$CB_SIMILARITY = SubLObjectFactory.makeSymbol("CB-SIMILARITY");
        $kw55$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str56$_nbsp_ = SubLObjectFactory.makeString("&nbsp;");
        $kw57$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $const58$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const59$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const60$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str61$_ = SubLObjectFactory.makeString("(");
        $str62$_ = SubLObjectFactory.makeString(")");
        $int63$32 = SubLObjectFactory.makeInteger(32);
        $str64$_dddddd = SubLObjectFactory.makeString("#dddddd");
        $str65$_cccccc = SubLObjectFactory.makeString("#cccccc");
        $str66$___ = SubLObjectFactory.makeString("|__");
        $str67$__A_ = SubLObjectFactory.makeString("(~A)");
        $kw68$BASIS = SubLObjectFactory.makeKeyword("BASIS");
        $kw69$IMPLIED = SubLObjectFactory.makeKeyword("IMPLIED");
        $kw70$ASSERTED = SubLObjectFactory.makeKeyword("ASSERTED");
        $str71$BIA_ = SubLObjectFactory.makeString("BIA ");
        $str72$BI__ = SubLObjectFactory.makeString("BI_ ");
        $str73$B_A_ = SubLObjectFactory.makeString("B_A ");
        $str74$B___ = SubLObjectFactory.makeString("B__ ");
        $str75$_IA_ = SubLObjectFactory.makeString("_IA ");
        $str76$_I__ = SubLObjectFactory.makeString("_I_ ");
        $str77$__A_ = SubLObjectFactory.makeString("__A ");
        $str78$____ = SubLObjectFactory.makeString("___ ");
        $kw79$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $str80$cg_cb_af__a = SubLObjectFactory.makeString("cg?cb-af&~a");
        $kw81$BOTTOM = SubLObjectFactory.makeKeyword("BOTTOM");
        $str82$a = SubLObjectFactory.makeString("a");
        $str83$x = SubLObjectFactory.makeString("x");
        $str84$L_E_G_E_N_D = SubLObjectFactory.makeString("L E G E N D");
        $str85$_ = SubLObjectFactory.makeString("*");
        $str86$ = SubLObjectFactory.makeString("");
        $str87$Asserted_in_KB_ = SubLObjectFactory.makeString("Asserted in KB.");
        $str88$Asserted_in_KB__but_redundant_ = SubLObjectFactory.makeString("Asserted in KB, but redundant.");
        $kw89$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str90$Shown_as_asserted_in_KB_by_a_forw = SubLObjectFactory.makeString("Shown as asserted in KB by a forward rule.");
        $str91$Not_asserted_in_KB__but_true_ = SubLObjectFactory.makeString("Not asserted in KB, but true.");
        $str92$Neither_asserted_in_KB_nor_true_ = SubLObjectFactory.makeString("Neither asserted in KB nor true.");
        $int93$64 = SubLObjectFactory.makeInteger(64);
        $sym94$ASSERT = SubLObjectFactory.makeSymbol("ASSERT");
        $sym95$DO_NOTHING = SubLObjectFactory.makeSymbol("DO-NOTHING");
        $sym96$UNASSERT = SubLObjectFactory.makeSymbol("UNASSERT");
        $str97$Asserting____A__A__A__in__A = SubLObjectFactory.makeString("Asserting: (~A ~A ~A) in ~A");
        $str98$Result__ = SubLObjectFactory.makeString("Result: ");
        $str99$Unasserting____A__A__A__from__A = SubLObjectFactory.makeString("Unasserting: (~A ~A ~A) from ~A");
        $sym100$CB_SIMILARITY_ASSERT = SubLObjectFactory.makeSymbol("CB-SIMILARITY-ASSERT");
        $str101$st__A__A__A__A__A_ = SubLObjectFactory.makeString("st|~A|~A|~A|~A|~A|");
        $str102$st__A__A__A__A_ = SubLObjectFactory.makeString("st|~A|~A|~A|~A|");
        $str103$st__A__A__A_ = SubLObjectFactory.makeString("st|~A|~A|~A|");
        $str104$st__A__A_ = SubLObjectFactory.makeString("st|~A|~A|");
        $str105$st__A_ = SubLObjectFactory.makeString("st|~A|");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("|"));
    }
}

/*

	Total time: 772 ms
	
*/