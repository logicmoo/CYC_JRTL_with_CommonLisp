package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_system_health extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_system_health";
    public static final String myFingerPrint = "54087acbf7cd66791a958b72e78791f97f92ed6a991ff981eb29660f1233a104";
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-health.lisp", position = 1794L)
    public static SubLSymbol $cb_system_health_show_details$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-health.lisp", position = 4465L)
    private static SubLSymbol $deduction_per_secs_semantic_checking_rate$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-health.lisp", position = 4637L)
    private static SubLSymbol $deduction_per_secs_syntactic_checking_rate$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-health.lisp", position = 4829L)
    private static SubLSymbol $kb_units_fragmentation_statistics$;
    private static final SubLString $str0$System_Health;
    private static final SubLString $str1$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str2$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw3$UNINITIALIZED;
    private static final SubLSymbol $kw4$CB_CYC;
    private static final SubLSymbol $kw5$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw6$SHA1;
    private static final SubLString $str7$yui_skin_sam;
    private static final SubLString $str8$reloadFrameButton;
    private static final SubLString $str9$button;
    private static final SubLString $str10$reload;
    private static final SubLString $str11$Refresh_Frames;
    private static final SubLString $str12$post;
    private static final SubLString $str13$cb_handle_system_health_stats;
    private static final SubLString $str14$KB_;
    private static final SubLString $str15$_Health_Statistics;
    private static final SubLString $str16$cb_handle_system_health_kbfrag;
    private static final SubLString $str17$_Units_Fragmentation;
    private static final SubLString $str18$cb_handle_system_health_checkups;
    private static final SubLString $str19$Checkups;
    private static final SubLString $str20$cb_handle_system_health_maintenan;
    private static final SubLString $str21$Routine_Maintenance;
    private static final SubLSymbol $sym22$CB_SYSTEM_HEALTH;
    private static final SubLSymbol $kw23$HTML_HANDLER;
    private static final SubLString $str24$There_are_currently_no_KB_health_;
    private static final SubLSymbol $kw25$NONE;
    private static final SubLSymbol $kw26$LEFT;
    private static final SubLSymbol $kw27$TOP;
    private static final SubLSymbol $kw28$RIGHT;
    private static final SubLSymbol $kw29$CENTER;
    private static final SubLString $str30$99_;
    private static final SubLSymbol $kw31$COUNTS;
    private static final SubLInteger $int32$4850;
    private static final SubLSymbol $sym33$_KB_UNITS_FRAGMENTATION_STATISTICS_;
    private static final SubLString $str34$_No_fragmentation_data_has_been_c;
    private static final SubLString $str35$Units_Part;
    private static final SubLString $str36$Edits;
    private static final SubLString $str37$Deletes;
    private static final SubLString $str38$Entries;
    private static final SubLString $str39$Bytes;
    private static final SubLSymbol $kw40$IN_PROGRESS;
    private static final SubLString $str41$____in_progress_____;
    private static final SubLString $str42$Error___A__;
    private static final SubLSymbol $kw43$REVERSAL;
    private static final SubLSymbol $kw44$TOMBSTONE;
    private static final SubLSymbol $kw45$INDEX_ENTRIES;
    private static final SubLSymbol $kw46$DATA_BYTES;
    private static final SubLString $str47$CB_SYSTEM_HEALTH_KBFRAG_GATHERER;
    private static final SubLSymbol $sym48$GATHER_KB_SNAPSHOT_STATISTICS;
    private static final SubLString $str49$Task;
    private static final SubLString $str50$Description;
    private static final SubLString $str51$Est_Time;
    private static final SubLString $str52$Select;
    private static final SubLString $str53$Check_Deductions;
    private static final SubLString $str54$Iterate_over_the_specified_deduct;
    private static final SubLString $str55$If_a_significant_percentage_are_i;
    private static final SubLString $str56$Check_All;
    private static final SubLString $str57$check_all_deductions;
    private static final SubLString $str58$Check_New;
    private static final SubLString $str59$check_new_deductions;
    private static final SubLSymbol $kw60$NOT_YET;
    private static final SubLString $str61$Lazy_TMS;
    private static final SubLString $str62$Iterate_over_the_specified_deduct;
    private static final SubLString $str63$Deductions_that_cannot_be_reprove;
    private static final SubLString $str64$TMS_All;
    private static final SubLString $str65$lazy_tms_all;
    private static final SubLString $str66$TMS_New;
    private static final SubLString $str67$lazy_new_all;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-health.lisp", position = 853L)
    public static SubLObject cb_system_health(SubLObject args) {
        if (args == cb_system_health.UNPROVIDED) {
            args = (SubLObject)cb_system_health.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_system_health.$str0$System_Health;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_health.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_health.UNPROVIDED, (SubLObject)cb_system_health.UNPROVIDED, (SubLObject)cb_system_health.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_health.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_health.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_health.$str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_health.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_system_health.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_health.$kw4$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_health.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_health.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_health.$str7$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_health.$str8$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_health.$str9$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_health.$str10$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_health.$str11$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            if (cb_system_health.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_health.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_health.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_health.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        }
                        SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_health.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_health.$str12$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        if (cb_system_health.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_health.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_health.$str13$cb_handle_system_health_stats, (SubLObject)cb_system_health.T, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_health.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_health.$str14$KB_);
                            html_utilities.html_princ(control_vars.kb_loaded());
                            html_utilities.html_princ((SubLObject)cb_system_health.$str15$_Health_Statistics);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_health.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                            cb_system_health_show_statistics();
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_health.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_health.$str12$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        if (cb_system_health.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_health.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_health.$str16$cb_handle_system_health_kbfrag, (SubLObject)cb_system_health.T, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_health.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_health.$str14$KB_);
                            html_utilities.html_princ(control_vars.kb_loaded());
                            html_utilities.html_princ((SubLObject)cb_system_health.$str17$_Units_Fragmentation);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_health.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                            cb_system_health_show_kbfrag();
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_health.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_health.$str12$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        if (cb_system_health.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_health.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_health.$str18$cb_handle_system_health_checkups, (SubLObject)cb_system_health.T, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_health.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_health.$str19$Checkups);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_health.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                            cb_system_health_possible_checkups();
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_health.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_health.$str12$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        if (cb_system_health.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_health.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_health.$str20$cb_handle_system_health_maintenan, (SubLObject)cb_system_health.T, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_health.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_health.$str21$Routine_Maintenance);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_health.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                            cb_system_health_routine_maintenance();
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_health.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-health.lisp", position = 1981L)
    public static SubLObject cb_system_health_show_statistics() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject components = kb_health_statistics.get_kb_health_statistic_components();
        if (cb_system_health.NIL == components) {
            html_utilities.html_princ((SubLObject)cb_system_health.$str24$There_are_currently_no_KB_health_);
            return (SubLObject)cb_system_health.$kw25$NONE;
        }
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
            SubLObject cdolist_list_var = components;
            SubLObject component = (SubLObject)cb_system_health.NIL;
            component = cdolist_list_var.first();
            while (cb_system_health.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$9 = kb_health_statistics.get_kb_health_statistic_contexts_for_component(component);
                SubLObject v_context = (SubLObject)cb_system_health.NIL;
                v_context = cdolist_list_var_$9.first();
                while (cb_system_health.NIL != cdolist_list_var_$9) {
                    SubLObject cdolist_list_var_$10 = kb_health_statistics.get_kb_health_statistic_sub_contexts_for_context(component, v_context);
                    SubLObject sub_context = (SubLObject)cb_system_health.NIL;
                    sub_context = cdolist_list_var_$10.first();
                    while (cb_system_health.NIL != cdolist_list_var_$10) {
                        SubLObject cdolist_list_var_$11 = kb_health_statistics.get_kb_health_statistic_handles_for_sub_context(component, v_context, sub_context);
                        SubLObject handle = (SubLObject)cb_system_health.NIL;
                        handle = cdolist_list_var_$11.first();
                        while (cb_system_health.NIL != cdolist_list_var_$11) {
                            final SubLObject details = kb_health_statistics.get_kb_health_statistic_details_for_sub_context_handle(component, v_context, sub_context, handle);
                            final SubLObject count = bag.bag_size(details);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                    html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                    html_utilities.html_prin1(component);
                                    html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                    html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                    html_utilities.html_prin1(v_context);
                                    html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                    html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                    html_utilities.html_prin1(sub_context);
                                    html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                    html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                    html_utilities.html_prin1(handle);
                                    html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw28$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                    html_utilities.html_prin1(count);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
                            if (cb_system_health.NIL != cb_system_health.$cb_system_health_show_details$.getDynamicValue(thread) && count.isPositive()) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_system_health.FOUR_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(bag.do_bag_repeat_internal(details)); cb_system_health.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject item = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject item_count = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cb_system_health.ZERO_INTEGER);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cb_system_health.TWO_INTEGER);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cb_system_health.TWO_INTEGER);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cb_system_health.$str30$99_);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                                        html_utilities.html_princ(item);
                                                        html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw28$RIGHT));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                        html_utilities.html_princ(item_count);
                                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        final SubLObject item_count2 = (SubLObject)cb_system_health.ONE_INTEGER;
                                        final SubLObject set_contents_var = bag.do_bag_unique_internal(details);
                                        SubLObject basis_object;
                                        SubLObject state;
                                        SubLObject item2;
                                        SubLObject _prev_bind_0_$25;
                                        SubLObject _prev_bind_0_$26;
                                        SubLObject _prev_bind_0_$27;
                                        SubLObject _prev_bind_0_$28;
                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_system_health.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_system_health.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            item2 = set_contents.do_set_contents_next(basis_object, state);
                                            if (cb_system_health.NIL != set_contents.do_set_contents_element_validP(state, item2)) {
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)cb_system_health.ZERO_INTEGER);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)cb_system_health.TWO_INTEGER);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)cb_system_health.TWO_INTEGER);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)cb_system_health.$str30$99_);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                                _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                                    _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                                        _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                                            html_utilities.html_princ(item2);
                                                            html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw28$RIGHT));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                                                        _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                            html_utilities.html_princ(item_count2);
                                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            }
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
                            }
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            handle = cdolist_list_var_$11.first();
                        }
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        sub_context = cdolist_list_var_$10.first();
                    }
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    v_context = cdolist_list_var_$9.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                component = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_system_health.$kw31$COUNTS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-health.lisp", position = 4969L)
    public static SubLObject cb_system_health_show_kbfrag() {
        if (cb_system_health.NIL != map_utilities.map_p(cb_system_health.$kb_units_fragmentation_statistics$.getGlobalValue())) {
            cb_system_health_show_kbfrag_statistics(cb_system_health.$kb_units_fragmentation_statistics$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_health.$str34$_No_fragmentation_data_has_been_c);
            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
        }
        return (SubLObject)cb_system_health.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-health.lisp", position = 5291L)
    public static SubLObject cb_system_health_show_kbfrag_statistics(final SubLObject result_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data_cols = (SubLObject)cb_system_health.ZERO_INTEGER;
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str35$Units_Part);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str36$Edits);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    data_cols = Numbers.add(data_cols, (SubLObject)cb_system_health.ONE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str37$Deletes);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    data_cols = Numbers.add(data_cols, (SubLObject)cb_system_health.ONE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str38$Entries);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    data_cols = Numbers.add(data_cols, (SubLObject)cb_system_health.ONE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str39$Bytes);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    data_cols = Numbers.add(data_cols, (SubLObject)cb_system_health.ONE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
            SubLObject cdolist_list_var = dumper.get_kb_units_file_vector_categories();
            SubLObject category = (SubLObject)cb_system_health.NIL;
            category = cdolist_list_var.first();
            while (cb_system_health.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                    final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                        html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                        html_utilities.html_princ(category);
                        html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    final SubLObject result = map_utilities.map_get(result_map, category, (SubLObject)cb_system_health.$kw40$IN_PROGRESS);
                    if (cb_system_health.$kw40$IN_PROGRESS == result) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (cb_system_health.NIL != data_cols) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(data_cols);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_health.$str41$____in_progress_____);
                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    else if (result.isString()) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (cb_system_health.NIL != data_cols) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            html_utilities.html_markup(data_cols);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (cb_system_health.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_health.$str42$Error___A__, result);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    else if (cb_system_health.NIL != map_utilities.map_p(result)) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw28$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                            html_utilities.html_princ(map_utilities.map_get(result, (SubLObject)cb_system_health.$kw43$REVERSAL, (SubLObject)cb_system_health.ZERO_INTEGER));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw28$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                            html_utilities.html_princ(map_utilities.map_get(result, (SubLObject)cb_system_health.$kw44$TOMBSTONE, (SubLObject)cb_system_health.ZERO_INTEGER));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw28$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                            html_utilities.html_princ(map_utilities.map_get(result, (SubLObject)cb_system_health.$kw45$INDEX_ENTRIES, (SubLObject)cb_system_health.ZERO_INTEGER));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw28$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                        final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                            html_utilities.html_princ(map_utilities.map_get(result, (SubLObject)cb_system_health.$kw46$DATA_BYTES, (SubLObject)cb_system_health.ZERO_INTEGER));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                category = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return result_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-health.lisp", position = 7351L)
    public static SubLObject launch_cb_system_health_kbfrag_gatherer(SubLObject kb_units_dir) {
        if (kb_units_dir == cb_system_health.UNPROVIDED) {
            kb_units_dir = misc_utilities.generic_caches_directory();
        }
        cb_system_health.$kb_units_fragmentation_statistics$.setGlobalValue(dictionary_utilities.new_synchronized_dictionary((SubLObject)cb_system_health.EQUAL, (SubLObject)cb_system_health.UNPROVIDED));
        return subl_promotions.make_process_with_args((SubLObject)cb_system_health.$str47$CB_SYSTEM_HEALTH_KBFRAG_GATHERER, (SubLObject)cb_system_health.$sym48$GATHER_KB_SNAPSHOT_STATISTICS, (SubLObject)ConsesLow.list(kb_units_dir, cb_system_health.$kb_units_fragmentation_statistics$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-health.lisp", position = 7733L)
    public static SubLObject cb_system_health_possible_checkups() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
            final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str49$Task);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str50$Description);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str51$Est_Time);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str52$Select);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
            final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_health.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_health.$str53$Check_Deductions);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_health.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_health.$str54$Iterate_over_the_specified_deduct);
                    html_utilities.html_newline((SubLObject)cb_system_health.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_system_health.$str55$If_a_significant_percentage_are_i);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw28$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    final SubLObject deductions_per_sec = cb_system_health.$deduction_per_secs_syntactic_checking_rate$.getGlobalValue();
                    final SubLObject deductions = deduction_handles.deduction_count();
                    final SubLObject estimate = Numbers.divide(deductions, deductions_per_sec);
                    html_utilities.html_princ(numeric_date_utilities.elapsed_time_string(estimate));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_submit_input((SubLObject)cb_system_health.$str56$Check_All, (SubLObject)cb_system_health.$str57$check_all_deductions, (SubLObject)cb_system_health.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
            final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw28$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    final SubLObject deductions_per_sec = cb_system_health.$deduction_per_secs_syntactic_checking_rate$.getGlobalValue();
                    final SubLObject deductions = deduction_handles.new_deduction_count();
                    final SubLObject estimate = Numbers.divide(deductions, deductions_per_sec);
                    html_utilities.html_princ(numeric_date_utilities.elapsed_time_string(estimate));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_submit_input((SubLObject)cb_system_health.$str58$Check_New, (SubLObject)cb_system_health.$str59$check_new_deductions, (SubLObject)cb_system_health.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_system_health.$kw60$NOT_YET;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-health.lisp", position = 9589L)
    public static SubLObject cb_system_health_routine_maintenance() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_health.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str49$Task);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str50$Description);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str51$Est_Time);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_health.$str52$Select);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
            final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_health.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_health.$str61$Lazy_TMS);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_health.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw26$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_health.$str62$Iterate_over_the_specified_deduct);
                    html_utilities.html_newline((SubLObject)cb_system_health.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_system_health.$str63$Deductions_that_cannot_be_reprove);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw28$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    final SubLObject deductions_per_sec = cb_system_health.$deduction_per_secs_semantic_checking_rate$.getGlobalValue();
                    final SubLObject deductions = deduction_handles.deduction_count();
                    final SubLObject estimate = Numbers.divide(deductions, deductions_per_sec);
                    html_utilities.html_princ(numeric_date_utilities.elapsed_time_string(estimate));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_submit_input((SubLObject)cb_system_health.$str64$TMS_All, (SubLObject)cb_system_health.$str65$lazy_tms_all, (SubLObject)cb_system_health.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
            final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw28$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    final SubLObject deductions_per_sec = cb_system_health.$deduction_per_secs_semantic_checking_rate$.getGlobalValue();
                    final SubLObject deductions = deduction_handles.new_deduction_count();
                    final SubLObject estimate = Numbers.divide(deductions, deductions_per_sec);
                    html_utilities.html_princ(numeric_date_utilities.elapsed_time_string(estimate));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw29$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_health.$kw27$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_health.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_health.UNPROVIDED);
                final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_health.T, thread);
                    html_utilities.html_submit_input((SubLObject)cb_system_health.$str66$TMS_New, (SubLObject)cb_system_health.$str67$lazy_new_all, (SubLObject)cb_system_health.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_health.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_system_health.NIL;
    }
    
    public static SubLObject declare_cb_system_health_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_health", "cb_system_health", "CB-SYSTEM-HEALTH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_health", "cb_system_health_show_statistics", "CB-SYSTEM-HEALTH-SHOW-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_health", "cb_system_health_show_kbfrag", "CB-SYSTEM-HEALTH-SHOW-KBFRAG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_health", "cb_system_health_show_kbfrag_statistics", "CB-SYSTEM-HEALTH-SHOW-KBFRAG-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_health", "launch_cb_system_health_kbfrag_gatherer", "LAUNCH-CB-SYSTEM-HEALTH-KBFRAG-GATHERER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_health", "cb_system_health_possible_checkups", "CB-SYSTEM-HEALTH-POSSIBLE-CHECKUPS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_health", "cb_system_health_routine_maintenance", "CB-SYSTEM-HEALTH-ROUTINE-MAINTENANCE", 0, 0, false);
        return (SubLObject)cb_system_health.NIL;
    }
    
    public static SubLObject init_cb_system_health_file() {
        cb_system_health.$cb_system_health_show_details$ = SubLFiles.defparameter("*CB-SYSTEM-HEALTH-SHOW-DETAILS*", (SubLObject)cb_system_health.NIL);
        cb_system_health.$deduction_per_secs_semantic_checking_rate$ = SubLFiles.deflexical("*DEDUCTION-PER-SECS-SEMANTIC-CHECKING-RATE*", (SubLObject)cb_system_health.$int32$4850);
        cb_system_health.$deduction_per_secs_syntactic_checking_rate$ = SubLFiles.deflexical("*DEDUCTION-PER-SECS-SYNTACTIC-CHECKING-RATE*", Numbers.multiply((SubLObject)cb_system_health.TEN_INTEGER, cb_system_health.$deduction_per_secs_semantic_checking_rate$.getGlobalValue()));
        cb_system_health.$kb_units_fragmentation_statistics$ = SubLFiles.deflexical("*KB-UNITS-FRAGMENTATION-STATISTICS*", (SubLObject)((cb_system_health.NIL != Symbols.boundp((SubLObject)cb_system_health.$sym33$_KB_UNITS_FRAGMENTATION_STATISTICS_)) ? cb_system_health.$kb_units_fragmentation_statistics$.getGlobalValue() : cb_system_health.NIL));
        return (SubLObject)cb_system_health.NIL;
    }
    
    public static SubLObject setup_cb_system_health_file() {
        html_macros.note_cgi_handler_function((SubLObject)cb_system_health.$sym22$CB_SYSTEM_HEALTH, (SubLObject)cb_system_health.$kw23$HTML_HANDLER);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_system_health.$sym33$_KB_UNITS_FRAGMENTATION_STATISTICS_);
        return (SubLObject)cb_system_health.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_system_health_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_system_health_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_system_health_file();
    }
    
    static {
        me = (SubLFile)new cb_system_health();
        cb_system_health.$cb_system_health_show_details$ = null;
        cb_system_health.$deduction_per_secs_semantic_checking_rate$ = null;
        cb_system_health.$deduction_per_secs_syntactic_checking_rate$ = null;
        cb_system_health.$kb_units_fragmentation_statistics$ = null;
        $str0$System_Health = SubLObjectFactory.makeString("System Health");
        $str1$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str2$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw3$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw4$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw5$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw6$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str7$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str8$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str9$button = SubLObjectFactory.makeString("button");
        $str10$reload = SubLObjectFactory.makeString("reload");
        $str11$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str12$post = SubLObjectFactory.makeString("post");
        $str13$cb_handle_system_health_stats = SubLObjectFactory.makeString("cb-handle-system-health-stats");
        $str14$KB_ = SubLObjectFactory.makeString("KB ");
        $str15$_Health_Statistics = SubLObjectFactory.makeString(" Health Statistics");
        $str16$cb_handle_system_health_kbfrag = SubLObjectFactory.makeString("cb-handle-system-health-kbfrag");
        $str17$_Units_Fragmentation = SubLObjectFactory.makeString(" Units Fragmentation");
        $str18$cb_handle_system_health_checkups = SubLObjectFactory.makeString("cb-handle-system-health-checkups");
        $str19$Checkups = SubLObjectFactory.makeString("Checkups");
        $str20$cb_handle_system_health_maintenan = SubLObjectFactory.makeString("cb-handle-system-health-maintenance");
        $str21$Routine_Maintenance = SubLObjectFactory.makeString("Routine Maintenance");
        $sym22$CB_SYSTEM_HEALTH = SubLObjectFactory.makeSymbol("CB-SYSTEM-HEALTH");
        $kw23$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str24$There_are_currently_no_KB_health_ = SubLObjectFactory.makeString("There are currently no KB health alerts.");
        $kw25$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw26$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw27$TOP = SubLObjectFactory.makeKeyword("TOP");
        $kw28$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $kw29$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str30$99_ = SubLObjectFactory.makeString("99%");
        $kw31$COUNTS = SubLObjectFactory.makeKeyword("COUNTS");
        $int32$4850 = SubLObjectFactory.makeInteger(4850);
        $sym33$_KB_UNITS_FRAGMENTATION_STATISTICS_ = SubLObjectFactory.makeSymbol("*KB-UNITS-FRAGMENTATION-STATISTICS*");
        $str34$_No_fragmentation_data_has_been_c = SubLObjectFactory.makeString("(No fragmentation data has been collected yet.)");
        $str35$Units_Part = SubLObjectFactory.makeString("Units Part");
        $str36$Edits = SubLObjectFactory.makeString("Edits");
        $str37$Deletes = SubLObjectFactory.makeString("Deletes");
        $str38$Entries = SubLObjectFactory.makeString("Entries");
        $str39$Bytes = SubLObjectFactory.makeString("Bytes");
        $kw40$IN_PROGRESS = SubLObjectFactory.makeKeyword("IN-PROGRESS");
        $str41$____in_progress_____ = SubLObjectFactory.makeString("... in progress ....");
        $str42$Error___A__ = SubLObjectFactory.makeString("Error: ~A~%");
        $kw43$REVERSAL = SubLObjectFactory.makeKeyword("REVERSAL");
        $kw44$TOMBSTONE = SubLObjectFactory.makeKeyword("TOMBSTONE");
        $kw45$INDEX_ENTRIES = SubLObjectFactory.makeKeyword("INDEX-ENTRIES");
        $kw46$DATA_BYTES = SubLObjectFactory.makeKeyword("DATA-BYTES");
        $str47$CB_SYSTEM_HEALTH_KBFRAG_GATHERER = SubLObjectFactory.makeString("CB-SYSTEM-HEALTH-KBFRAG-GATHERER");
        $sym48$GATHER_KB_SNAPSHOT_STATISTICS = SubLObjectFactory.makeSymbol("GATHER-KB-SNAPSHOT-STATISTICS");
        $str49$Task = SubLObjectFactory.makeString("Task");
        $str50$Description = SubLObjectFactory.makeString("Description");
        $str51$Est_Time = SubLObjectFactory.makeString("Est Time");
        $str52$Select = SubLObjectFactory.makeString("Select");
        $str53$Check_Deductions = SubLObjectFactory.makeString("Check Deductions");
        $str54$Iterate_over_the_specified_deduct = SubLObjectFactory.makeString("Iterate over the specified deductions and check them syntactically.");
        $str55$If_a_significant_percentage_are_i = SubLObjectFactory.makeString("If a significant percentage are invalid, schedule Lazy TMS maintenance.");
        $str56$Check_All = SubLObjectFactory.makeString("Check All");
        $str57$check_all_deductions = SubLObjectFactory.makeString("check-all-deductions");
        $str58$Check_New = SubLObjectFactory.makeString("Check New");
        $str59$check_new_deductions = SubLObjectFactory.makeString("check-new-deductions");
        $kw60$NOT_YET = SubLObjectFactory.makeKeyword("NOT-YET");
        $str61$Lazy_TMS = SubLObjectFactory.makeString("Lazy TMS");
        $str62$Iterate_over_the_specified_deduct = SubLObjectFactory.makeString("Iterate over the specified deductions and attempt to reprove them.");
        $str63$Deductions_that_cannot_be_reprove = SubLObjectFactory.makeString("Deductions that cannot be reproved will be removed.");
        $str64$TMS_All = SubLObjectFactory.makeString("TMS All");
        $str65$lazy_tms_all = SubLObjectFactory.makeString("lazy-tms-all");
        $str66$TMS_New = SubLObjectFactory.makeString("TMS New");
        $str67$lazy_new_all = SubLObjectFactory.makeString("lazy-new-all");
    }
}

/*

	Total time: 1073 ms
	
*/