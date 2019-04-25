package com.cyc.cycjava.cycl.owl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_owl_to_cycl extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.owl.cb_owl_to_cycl";
    public static final String myFingerPrint = "8dddd3db5573e3b4d2046fd1c642dc9711b474ac41c6c437374a0f87cc2fe05f";
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 6031L)
    private static SubLSymbol $owl_importer_stage_descriptions$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 6641L)
    private static SubLSymbol $cb_owl_import_refresh_interval$;
    private static final SubLSymbol $kw0$CB_OWL_TO_CYCL;
    private static final SubLString $str1$cb_owl_to_cycl_html;
    private static final SubLString $str2$OWL_Importer;
    private static final SubLString $str3$Import_an_OWL_ontology;
    private static final SubLString $str4$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str5$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw6$UNINITIALIZED;
    private static final SubLSymbol $kw7$CB_CYC;
    private static final SubLSymbol $kw8$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw9$SHA1;
    private static final SubLString $str10$yui_skin_sam;
    private static final SubLString $str11$reloadFrameButton;
    private static final SubLString $str12$button;
    private static final SubLString $str13$reload;
    private static final SubLString $str14$Refresh_Frames;
    private static final SubLString $str15$post;
    private static final SubLString $str16$handle_owl_to_cycl_input;
    private static final SubLSymbol $kw17$SELF;
    private static final SubLString $str18$Back;
    private static final SubLString $str19$Clear;
    private static final SubLString $str20$Submit;
    private static final SubLString $str21$import_owl_file;
    private static final SubLString $str22$Enter_the_URI_you_wish_to_use_to_;
    private static final SubLString $str23$uri;
    private static final SubLInteger $int24$60;
    private static final SubLString $str25$Format_for_term_names_in___synony;
    private static final SubLString $str26$term_name_format;
    private static final SubLString $str27$short;
    private static final SubLString $str28$Short__local_names_only_;
    private static final SubLString $str29$medium;
    private static final SubLString $str30$Medium__prefixed_names__using_pre;
    private static final SubLString $str31$uri_prefix;
    private static final SubLString $str32$long;
    private static final SubLString $str33$Long__full_URIs_;
    private static final SubLString $str34$_Optional__enter_pathname_of_a_fi;
    private static final SubLString $str35$pathname;
    private static final SubLString $str36$;
    private static final SubLString $str37$Enter_a_prefix_for_new_constant_n;
    private static final SubLString $str38$Newly_created_constants_for_terms;
    private static final SubLString $str39$constant_prefix;
    private static final SubLString $str40$Enter_a_suffix_for_new_constant_n;
    private static final SubLString $str41$Newly_created_constants_for_terms;
    private static final SubLString $str42$constant_suffix;
    private static final SubLString $str43$_Optional__Enter_an_existing_Cyc_;
    private static final SubLString $str44$ontology;
    private static final SubLString $str45$Complete;
    private static final SubLObject $const46$owl_Ontology;
    private static final SubLSymbol $sym47$CB_OWL_IMPORT_OLD;
    private static final SubLSymbol $kw48$HTML_HANDLER;
    private static final SubLString $str49$Bad_source__;
    private static final SubLString $str50$Can_only_import_OWL_ontologies_fr;
    private static final SubLString $str51$_does_not_appear_to_be_a_URI_;
    private static final SubLString $str52$Enter_a_prefix_for_Medium_format_;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$HANDLE_OWL_TO_CYCL_INPUT;
    private static final SubLSymbol $kw55$ONTOLOGY;
    private static final SubLString $str56$Importing_;
    private static final SubLString $str57$OWL_Ontology;
    private static final SubLString $str58$_Display_Importer_Progress_;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLString $str61$Can_t_interpret__S_as_the_ID_of_a;
    private static final SubLString $str62$T;
    private static final SubLSymbol $sym63$CB_SHOW_OWL_IMPORTER;
    private static final SubLString $str64$Status___A_;
    private static final SubLString $str65$Done;
    private static final SubLString $str66$Working;
    private static final SubLString $str67$_Total_time___A_;
    private static final SubLSymbol $sym68$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const69$EverythingPSC;
    private static final SubLObject $const70$synonymousExternalConcept;
    private static final SubLString $str71$Term_count___D_;
    private static final SubLList $list72;
    private static final SubLString $str73$_A_;
    private static final SubLInteger $int74$100;
    private static final SubLString $str75$Started_at__A__Elapsed_time___A_;
    private static final SubLString $str76$Estimated_finish_time___A__after_;
    private static final SubLString $str77$Error_Messages___D__;
    private static final SubLList $list78;
    private static final SubLString $str79$_Refresh_;
    private static final SubLString $str80$_Halt_Auto_Refresh_;
    private static final SubLString $str81$_Start_Auto_Refresh_;
    private static final SubLString $str82$__Last_refresh___A_;
    private static final SubLSymbol $sym83$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str84$_OWL_Importer_;
    private static final SubLString $str85$_;
    private static final SubLSymbol $kw86$MAIN;
    private static final SubLString $str87$cb_show_owl_importer__D__A;
    private static final SubLSymbol $kw88$SHOW_OWL_IMPORTER;
    private static final SubLSymbol $sym89$CB_LINK_SHOW_OWL_IMPORTER;
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 905L)
    public static SubLObject cb_owl_import_old(SubLObject args) {
        if (args == cb_owl_to_cycl.UNPROVIDED) {
            args = (SubLObject)cb_owl_to_cycl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_owl_to_cycl.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_owl_to_cycl.$str2$OWL_Importer);
        }
        else {
            final SubLObject title_var = (SubLObject)cb_owl_to_cycl.$str3$Import_an_OWL_ontology;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_owl_to_cycl.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str4$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_owl_to_cycl.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str5$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_owl_to_cycl.$kw6$UNINITIALIZED) ? ConsesLow.list(cb_owl_to_cycl.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_owl_to_cycl.$kw7$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_owl_to_cycl.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_complete.html_complete_script();
                    cyc_file_dependencies.css((SubLObject)cb_owl_to_cycl.$kw8$SAM_AUTOCOMPLETE_CSS);
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_owl_to_cycl.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str10$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str11$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str12$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str13$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str14$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                if (cb_owl_to_cycl.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_owl_to_cycl.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            }
                            html_script_utilities.cb_hoverover_page_init();
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_owl_to_cycl.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str15$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            if (cb_owl_to_cycl.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_owl_to_cycl.$str16$handle_owl_to_cycl_input, (SubLObject)cb_owl_to_cycl.T, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                cb_utilities.cb_help_preamble((SubLObject)cb_owl_to_cycl.$kw0$CB_OWL_TO_CYCL, (SubLObject)cb_owl_to_cycl.NIL, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                cb_utilities.cb_back_button((SubLObject)cb_owl_to_cycl.$kw17$SELF, (SubLObject)cb_owl_to_cycl.$str18$Back);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_reset_input((SubLObject)cb_owl_to_cycl.$str19$Clear);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_submit_input((SubLObject)cb_owl_to_cycl.$str20$Submit, (SubLObject)cb_owl_to_cycl.$str21$import_owl_file, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str22$Enter_the_URI_you_wish_to_use_to_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.FIVE_INTEGER);
                                html_utilities.html_text_input(html_utilities.get_encoded_form_field_name((SubLObject)cb_owl_to_cycl.$str23$uri), string_utilities.$empty_string$.getGlobalValue(), (SubLObject)cb_owl_to_cycl.$int24$60);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_princ_strong((SubLObject)cb_owl_to_cycl.$str25$Format_for_term_names_in___synony);
                                final SubLObject name = html_utilities.get_encoded_form_field_name((SubLObject)cb_owl_to_cycl.$str26$term_name_format);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_radio_input(name, (SubLObject)cb_owl_to_cycl.$str27$short, (SubLObject)cb_owl_to_cycl.T, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str28$Short__local_names_only_);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_radio_input(name, (SubLObject)cb_owl_to_cycl.$str29$medium, (SubLObject)cb_owl_to_cycl.NIL, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str30$Medium__prefixed_names__using_pre);
                                html_utilities.html_text_input(html_utilities.get_encoded_form_field_name((SubLObject)cb_owl_to_cycl.$str31$uri_prefix), string_utilities.$empty_string$.getGlobalValue(), (SubLObject)cb_owl_to_cycl.TEN_INTEGER);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_radio_input(name, (SubLObject)cb_owl_to_cycl.$str32$long, (SubLObject)cb_owl_to_cycl.NIL, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str33$Long__full_URIs_);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str34$_Optional__enter_pathname_of_a_fi);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.FIVE_INTEGER);
                                html_utilities.html_filename_input(html_utilities.get_encoded_form_field_name((SubLObject)cb_owl_to_cycl.$str35$pathname), (SubLObject)cb_owl_to_cycl.$str36$, (SubLObject)cb_owl_to_cycl.$int24$60);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                cb_query.html_princ_with_explanation((SubLObject)cb_owl_to_cycl.$str37$Enter_a_prefix_for_new_constant_n, (SubLObject)cb_owl_to_cycl.$str38$Newly_created_constants_for_terms, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.FIVE_INTEGER);
                                html_utilities.html_text_input(html_utilities.get_encoded_form_field_name((SubLObject)cb_owl_to_cycl.$str39$constant_prefix), string_utilities.$empty_string$.getGlobalValue(), (SubLObject)cb_owl_to_cycl.TEN_INTEGER);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                cb_query.html_princ_with_explanation((SubLObject)cb_owl_to_cycl.$str40$Enter_a_suffix_for_new_constant_n, (SubLObject)cb_owl_to_cycl.$str41$Newly_created_constants_for_terms, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.FIVE_INTEGER);
                                html_utilities.html_text_input(html_utilities.get_encoded_form_field_name((SubLObject)cb_owl_to_cycl.$str42$constant_suffix), string_utilities.$empty_string$.getGlobalValue(), (SubLObject)cb_owl_to_cycl.TEN_INTEGER);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str43$_Optional__Enter_an_existing_Cyc_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.FIVE_INTEGER);
                                final SubLObject encoded_name = html_utilities.get_encoded_form_field_name((SubLObject)cb_owl_to_cycl.$str44$ontology);
                                html_complete.html_complete_button(encoded_name, (SubLObject)cb_owl_to_cycl.$str45$Complete, cb_owl_to_cycl.$const46$owl_Ontology, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_text_input(encoded_name, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 3855L)
    public static SubLObject handle_owl_to_cycl_input(final SubLObject args) {
        final SubLObject pathname_field = (SubLObject)cb_owl_to_cycl.$str35$pathname;
        final SubLObject pathname = string_utilities.trim_whitespace(html_utilities.extract_encoded_form_field_value(pathname_field, args));
        final SubLObject uri = html_utilities.extract_encoded_form_field_value((SubLObject)cb_owl_to_cycl.$str23$uri, args);
        final SubLObject source = (cb_owl_to_cycl.NIL != string_utilities.non_empty_string_p(pathname)) ? pathname : uri;
        final SubLObject constant_prefix = html_utilities.extract_encoded_form_field_value((SubLObject)cb_owl_to_cycl.$str39$constant_prefix, args);
        final SubLObject constant_suffix = html_utilities.extract_encoded_form_field_value((SubLObject)cb_owl_to_cycl.$str42$constant_suffix, args);
        final SubLObject ontology_name = html_utilities.extract_encoded_form_field_value((SubLObject)cb_owl_to_cycl.$str44$ontology, args);
        final SubLObject ontology = (SubLObject)((cb_owl_to_cycl.NIL != string_utilities.non_empty_string_p(ontology_name)) ? cb_utilities.cb_guess_fort(ontology_name, (SubLObject)cb_owl_to_cycl.UNPROVIDED) : cb_owl_to_cycl.NIL);
        final SubLObject term_name_format = html_utilities.extract_encoded_form_field_value((SubLObject)cb_owl_to_cycl.$str26$term_name_format, args);
        final SubLObject prefix_external_namesP = (SubLObject)SubLObjectFactory.makeBoolean(!term_name_format.equal((SubLObject)cb_owl_to_cycl.$str27$short));
        final SubLObject abbreviate_prefixesP = Equality.equal(term_name_format, (SubLObject)cb_owl_to_cycl.$str29$medium);
        final SubLObject uri_prefix = html_utilities.extract_encoded_form_field_value((SubLObject)cb_owl_to_cycl.$str31$uri_prefix, args);
        SubLObject error_message = (SubLObject)cb_owl_to_cycl.NIL;
        if (cb_owl_to_cycl.NIL == web_utilities.url_p(source) && (cb_owl_to_cycl.NIL == string_utilities.non_empty_string_p(source) || cb_owl_to_cycl.NIL == file_utilities.file_existsP(source))) {
            error_message = Sequences.cconcatenate((SubLObject)cb_owl_to_cycl.$str49$Bad_source__, new SubLObject[] { format_nil.format_nil_s_no_copy(source), format_nil.$format_nil_percent$.getGlobalValue(), cb_owl_to_cycl.$str50$Can_only_import_OWL_ontologies_fr });
        }
        else if (cb_owl_to_cycl.NIL == string_utilities.non_empty_string_p(uri)) {
            error_message = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(uri), (SubLObject)cb_owl_to_cycl.$str51$_does_not_appear_to_be_a_URI_);
        }
        else if (cb_owl_to_cycl.NIL != abbreviate_prefixesP && cb_owl_to_cycl.NIL != string_utilities.empty_string_p(uri_prefix)) {
            error_message = Sequences.copy_seq((SubLObject)cb_owl_to_cycl.$str52$Enter_a_prefix_for_Medium_format_);
        }
        if (cb_owl_to_cycl.NIL != error_message) {
            cb_utilities.cb_error(error_message, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
        }
        else {
            cb_start_owl_import(list_utilities.make_plist((SubLObject)cb_owl_to_cycl.$list53, (SubLObject)ConsesLow.list(uri, source, constant_prefix, constant_suffix, ontology, prefix_external_namesP, abbreviate_prefixesP, uri_prefix)));
        }
        return (SubLObject)cb_owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 5601L)
    public static SubLObject cb_start_owl_import(final SubLObject import_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ontology = conses_high.getf(import_info, (SubLObject)cb_owl_to_cycl.$kw55$ONTOLOGY, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
        final SubLObject importer_id = owl_to_cycl.import_owl_ontology_with_importer_from_info(import_info);
        final SubLObject title_var = (SubLObject)cb_owl_to_cycl.NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_owl_to_cycl.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str4$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_owl_to_cycl.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str5$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
            final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_owl_to_cycl.$kw6$UNINITIALIZED) ? ConsesLow.list(cb_owl_to_cycl.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_owl_to_cycl.$kw7$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_owl_to_cycl.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_owl_to_cycl.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str10$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str11$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str12$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str13$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str14$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            if (cb_owl_to_cycl.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_owl_to_cycl.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str56$Importing_);
                        if (cb_owl_to_cycl.NIL != ontology) {
                            cb_utilities.cb_form(ontology, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        }
                        else {
                            html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str57$OWL_Ontology);
                        }
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        cb_link_show_owl_importer(importer_id, (SubLObject)cb_owl_to_cycl.$str58$_Display_Importer_Progress_, (SubLObject)cb_owl_to_cycl.T);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$6, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 6261L)
    public static SubLObject cb_show_owl_importer(final SubLObject args) {
        SubLObject id_string = (SubLObject)cb_owl_to_cycl.NIL;
        SubLObject refresh_string = (SubLObject)cb_owl_to_cycl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_owl_to_cycl.$list60);
        id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_owl_to_cycl.$list60);
        refresh_string = current.first();
        current = current.rest();
        if (cb_owl_to_cycl.NIL == current) {
            final SubLObject id = string_utilities.string_to_integer(id_string);
            if (cb_owl_to_cycl.NIL == owl_to_cycl.owl_importer_exists_p(id)) {
                cb_utilities.cb_error((SubLObject)cb_owl_to_cycl.$str61$Can_t_interpret__S_as_the_ID_of_a, id_string, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
            }
            else {
                cb_show_owl_importer_internal(id, Equality.equalp(refresh_string, (SubLObject)cb_owl_to_cycl.$str62$T));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_owl_to_cycl.$list60);
        }
        return (SubLObject)cb_owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 6700L)
    public static SubLObject cb_show_owl_importer_internal(final SubLObject id, final SubLObject refreshP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doneP = owl_to_cycl.owl_importer_done_p(id);
        final SubLObject progress = owl_to_cycl.get_owl_importer_progress(id);
        final SubLObject error_info = owl_to_cycl.get_owl_importer_error_info(id);
        final SubLObject ontology = narts_high.nart_substitute(owl_to_cycl.get_owl_importer_ontology(id));
        final SubLObject total_time = owl_importer_time_so_far(id);
        html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str4$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_owl_to_cycl.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_owl_to_cycl.$str5$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_owl_to_cycl.$kw6$UNINITIALIZED) ? ConsesLow.list(cb_owl_to_cycl.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_owl_to_cycl.$kw7$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str2$OWL_Importer);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_refresh((SubLObject)((cb_owl_to_cycl.NIL != refreshP && cb_owl_to_cycl.NIL == doneP) ? cb_owl_to_cycl.$cb_owl_import_refresh_interval$.getDynamicValue(thread) : cb_owl_to_cycl.NIL), (SubLObject)cb_owl_to_cycl.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    if (cb_owl_to_cycl.NIL == doneP) {
                        html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str56$Importing_);
                    }
                    if (cb_owl_to_cycl.NIL != ontology) {
                        cb_utilities.cb_form(ontology, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    }
                    else {
                        html_utilities.html_princ((SubLObject)cb_owl_to_cycl.$str57$OWL_Ontology);
                    }
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_owl_to_cycl.$str64$Status___A_, (SubLObject)((cb_owl_to_cycl.NIL != doneP) ? cb_owl_to_cycl.$str65$Done : cb_owl_to_cycl.$str66$Working));
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_owl_to_cycl.$str67$_Total_time___A_, numeric_date_utilities.readable_elapsed_time_string(total_time, (SubLObject)cb_owl_to_cycl.ZERO_INTEGER));
                    if (cb_owl_to_cycl.NIL != kb_indexing_datastructures.indexed_term_p(ontology)) {
                        final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_owl_to_cycl.$sym68$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(cb_owl_to_cycl.$const69$EverythingPSC, thread);
                            final SubLObject term_count = Sequences.length(kb_mapping.gather_gaf_arg_index(ontology, (SubLObject)cb_owl_to_cycl.TWO_INTEGER, cb_owl_to_cycl.$const70$synonymousExternalConcept, (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED));
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_owl_to_cycl.$str71$Term_count___D_, term_count);
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                    html_utilities.html_newline((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                    if (cb_owl_to_cycl.NIL != number_utilities.positive_number_p(total_time)) {
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_style_font_size_smaller$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                            SubLObject list_var = (SubLObject)cb_owl_to_cycl.NIL;
                            SubLObject item = (SubLObject)cb_owl_to_cycl.NIL;
                            SubLObject item_num = (SubLObject)cb_owl_to_cycl.NIL;
                            list_var = Sequences.reverse(progress);
                            item = list_var.first();
                            for (item_num = (SubLObject)cb_owl_to_cycl.ZERO_INTEGER; cb_owl_to_cycl.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), item_num = Numbers.add((SubLObject)cb_owl_to_cycl.ONE_INTEGER, item_num)) {
                                if (cb_owl_to_cycl.NIL != list_utilities.proper_list_p(item)) {
                                    SubLObject current;
                                    final SubLObject datum = current = item;
                                    SubLObject start_time = (SubLObject)cb_owl_to_cycl.NIL;
                                    SubLObject percent_done = (SubLObject)cb_owl_to_cycl.NIL;
                                    SubLObject elapsed_seconds = (SubLObject)cb_owl_to_cycl.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_owl_to_cycl.$list72);
                                    start_time = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_owl_to_cycl.$list72);
                                    percent_done = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_owl_to_cycl.$list72);
                                    elapsed_seconds = current.first();
                                    current = current.rest();
                                    if (cb_owl_to_cycl.NIL == current) {
                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_owl_to_cycl.$str73$_A_, ConsesLow.nth(item_num, cb_owl_to_cycl.$owl_importer_stage_descriptions$.getGlobalValue()));
                                        html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                        html_utilities.html_percent_progress_bar(Numbers.truncate(Numbers.multiply((SubLObject)cb_owl_to_cycl.$int74$100, percent_done), (SubLObject)cb_owl_to_cycl.UNPROVIDED), (SubLObject)cb_owl_to_cycl.$int74$100, number_utilities.integer_percent(elapsed_seconds, total_time, (SubLObject)cb_owl_to_cycl.UNPROVIDED), (SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_owl_to_cycl.$str75$Started_at__A__Elapsed_time___A_, numeric_date_utilities.timestring(start_time), numeric_date_utilities.readable_elapsed_time_string(elapsed_seconds, (SubLObject)cb_owl_to_cycl.ZERO_INTEGER));
                                        if (percent_done.isPositive()) {
                                            final SubLObject projected_total_time = Numbers.truncate(Numbers.divide(elapsed_seconds, percent_done), (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                            if (!Numbers.subtract(projected_total_time, elapsed_seconds).numLE(cb_owl_to_cycl.$cb_owl_import_refresh_interval$.getDynamicValue(thread))) {
                                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_owl_to_cycl.$str76$Estimated_finish_time___A__after_, numeric_date_utilities.timestring(Numbers.add(start_time, projected_total_time)), numeric_date_utilities.readable_elapsed_time_string(projected_total_time, (SubLObject)cb_owl_to_cycl.ZERO_INTEGER));
                                            }
                                        }
                                        html_utilities.html_newline((SubLObject)cb_owl_to_cycl.TWO_INTEGER);
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_owl_to_cycl.$list72);
                                    }
                                }
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                    html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    if (cb_owl_to_cycl.NIL != error_info) {
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_style_font_size_larger$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_owl_to_cycl.$str77$Error_Messages___D__, Sequences.length(error_info));
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                        SubLObject cdolist_list_var = error_info;
                        SubLObject item2 = (SubLObject)cb_owl_to_cycl.NIL;
                        item2 = cdolist_list_var.first();
                        while (cb_owl_to_cycl.NIL != cdolist_list_var) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = item2;
                            SubLObject v_object = (SubLObject)cb_owl_to_cycl.NIL;
                            SubLObject message = (SubLObject)cb_owl_to_cycl.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)cb_owl_to_cycl.$list78);
                            v_object = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)cb_owl_to_cycl.$list78);
                            message = current2.first();
                            current2 = current2.rest();
                            if (cb_owl_to_cycl.NIL == current2) {
                                cb_utilities.cb_form(v_object, (SubLObject)cb_owl_to_cycl.ZERO_INTEGER, (SubLObject)cb_owl_to_cycl.T);
                                html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                                html_utilities.html_princ(message);
                                html_utilities.html_hr((SubLObject)cb_owl_to_cycl.UNPROVIDED, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)cb_owl_to_cycl.$list78);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            item2 = cdolist_list_var.first();
                        }
                        html_utilities.html_newline((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    }
                    if (cb_owl_to_cycl.NIL != doneP) {
                        cb_link_show_owl_importer(id, (SubLObject)cb_owl_to_cycl.$str79$_Refresh_, (SubLObject)cb_owl_to_cycl.NIL);
                    }
                    else if (cb_owl_to_cycl.NIL != refreshP) {
                        cb_link_show_owl_importer(id, (SubLObject)cb_owl_to_cycl.$str80$_Halt_Auto_Refresh_, (SubLObject)cb_owl_to_cycl.NIL);
                    }
                    else {
                        cb_link_show_owl_importer(id, (SubLObject)cb_owl_to_cycl.$str81$_Start_Auto_Refresh_, (SubLObject)cb_owl_to_cycl.T);
                    }
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_style_font_size_smaller$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_owl_to_cycl.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_owl_to_cycl.$str82$__Last_refresh___A_, numeric_date_utilities.timestring((SubLObject)cb_owl_to_cycl.UNPROVIDED));
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$10, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_owl_to_cycl.UNPROVIDED);
        return (SubLObject)cb_owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 9369L)
    public static SubLObject owl_importer_time_so_far(final SubLObject id) {
        final SubLObject doneP = owl_to_cycl.owl_importer_done_p(id);
        final SubLObject progress = owl_to_cycl.get_owl_importer_progress(id);
        SubLObject total_time = (SubLObject)cb_owl_to_cycl.ZERO_INTEGER;
        if (cb_owl_to_cycl.NIL != progress) {
            SubLObject cdolist_list_var = (cb_owl_to_cycl.NIL != doneP) ? progress.rest() : progress;
            SubLObject item = (SubLObject)cb_owl_to_cycl.NIL;
            item = cdolist_list_var.first();
            while (cb_owl_to_cycl.NIL != cdolist_list_var) {
                total_time = Numbers.add(total_time, conses_high.third(item));
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        return total_time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-to-cycl.lisp", position = 9656L)
    public static SubLObject cb_link_show_owl_importer(final SubLObject id, SubLObject linktext, SubLObject auto_refreshP) {
        if (linktext == cb_owl_to_cycl.UNPROVIDED) {
            linktext = (SubLObject)cb_owl_to_cycl.NIL;
        }
        if (auto_refreshP == cb_owl_to_cycl.UNPROVIDED) {
            auto_refreshP = (SubLObject)cb_owl_to_cycl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_owl_to_cycl.NIL != subl_promotions.non_negative_integer_p(id) : id;
        if (cb_owl_to_cycl.NIL == linktext) {
            linktext = Sequences.cconcatenate((SubLObject)cb_owl_to_cycl.$str84$_OWL_Importer_, new SubLObject[] { format_nil.format_nil_d_no_copy(id), cb_owl_to_cycl.$str85$_ });
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_owl_to_cycl.$kw86$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_owl_to_cycl.$str87$cb_show_owl_importer__D__A, id, auto_refreshP);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
        if (cb_owl_to_cycl.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_to_cycl.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_owl_to_cycl.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return id;
    }
    
    public static SubLObject declare_cb_owl_to_cycl_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_owl_to_cycl", "cb_owl_import_old", "CB-OWL-IMPORT-OLD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_owl_to_cycl", "handle_owl_to_cycl_input", "HANDLE-OWL-TO-CYCL-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_owl_to_cycl", "cb_start_owl_import", "CB-START-OWL-IMPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_owl_to_cycl", "cb_show_owl_importer", "CB-SHOW-OWL-IMPORTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_owl_to_cycl", "cb_show_owl_importer_internal", "CB-SHOW-OWL-IMPORTER-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_owl_to_cycl", "owl_importer_time_so_far", "OWL-IMPORTER-TIME-SO-FAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_owl_to_cycl", "cb_link_show_owl_importer", "CB-LINK-SHOW-OWL-IMPORTER", 1, 2, false);
        return (SubLObject)cb_owl_to_cycl.NIL;
    }
    
    public static SubLObject init_cb_owl_to_cycl_file() {
        cb_owl_to_cycl.$owl_importer_stage_descriptions$ = SubLFiles.deflexical("*OWL-IMPORTER-STAGE-DESCRIPTIONS*", (SubLObject)cb_owl_to_cycl.$list59);
        cb_owl_to_cycl.$cb_owl_import_refresh_interval$ = SubLFiles.defparameter("*CB-OWL-IMPORT-REFRESH-INTERVAL*", (SubLObject)cb_owl_to_cycl.TWO_INTEGER);
        return (SubLObject)cb_owl_to_cycl.NIL;
    }
    
    public static SubLObject setup_cb_owl_to_cycl_file() {
        Hashtables.sethash((SubLObject)cb_owl_to_cycl.$kw0$CB_OWL_TO_CYCL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_owl_to_cycl.$str1$cb_owl_to_cycl_html, (SubLObject)cb_owl_to_cycl.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_owl_to_cycl.$sym47$CB_OWL_IMPORT_OLD, (SubLObject)cb_owl_to_cycl.$kw48$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_owl_to_cycl.$sym54$HANDLE_OWL_TO_CYCL_INPUT, (SubLObject)cb_owl_to_cycl.$kw48$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_owl_to_cycl.$sym63$CB_SHOW_OWL_IMPORTER, (SubLObject)cb_owl_to_cycl.$kw48$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_owl_to_cycl.$kw88$SHOW_OWL_IMPORTER, (SubLObject)cb_owl_to_cycl.$sym89$CB_LINK_SHOW_OWL_IMPORTER, (SubLObject)cb_owl_to_cycl.THREE_INTEGER);
        return (SubLObject)cb_owl_to_cycl.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_owl_to_cycl_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_owl_to_cycl_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_owl_to_cycl_file();
    }
    
    static {
        me = (SubLFile)new cb_owl_to_cycl();
        cb_owl_to_cycl.$owl_importer_stage_descriptions$ = null;
        cb_owl_to_cycl.$cb_owl_import_refresh_interval$ = null;
        $kw0$CB_OWL_TO_CYCL = SubLObjectFactory.makeKeyword("CB-OWL-TO-CYCL");
        $str1$cb_owl_to_cycl_html = SubLObjectFactory.makeString("cb-owl-to-cycl.html");
        $str2$OWL_Importer = SubLObjectFactory.makeString("OWL Importer");
        $str3$Import_an_OWL_ontology = SubLObjectFactory.makeString("Import an OWL ontology");
        $str4$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str5$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw6$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw7$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw8$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw9$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str10$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str11$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str12$button = SubLObjectFactory.makeString("button");
        $str13$reload = SubLObjectFactory.makeString("reload");
        $str14$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str15$post = SubLObjectFactory.makeString("post");
        $str16$handle_owl_to_cycl_input = SubLObjectFactory.makeString("handle-owl-to-cycl-input");
        $kw17$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str18$Back = SubLObjectFactory.makeString("Back");
        $str19$Clear = SubLObjectFactory.makeString("Clear");
        $str20$Submit = SubLObjectFactory.makeString("Submit");
        $str21$import_owl_file = SubLObjectFactory.makeString("import-owl-file");
        $str22$Enter_the_URI_you_wish_to_use_to_ = SubLObjectFactory.makeString("Enter the URI you wish to use to identify the ontology:");
        $str23$uri = SubLObjectFactory.makeString("uri");
        $int24$60 = SubLObjectFactory.makeInteger(60);
        $str25$Format_for_term_names_in___synony = SubLObjectFactory.makeString("Format for term names in #$synonymousExternalConcept assertions:");
        $str26$term_name_format = SubLObjectFactory.makeString("term-name-format");
        $str27$short = SubLObjectFactory.makeString("short");
        $str28$Short__local_names_only_ = SubLObjectFactory.makeString("Short (local names only)");
        $str29$medium = SubLObjectFactory.makeString("medium");
        $str30$Medium__prefixed_names__using_pre = SubLObjectFactory.makeString("Medium (prefixed names) using prefix: ");
        $str31$uri_prefix = SubLObjectFactory.makeString("uri-prefix");
        $str32$long = SubLObjectFactory.makeString("long");
        $str33$Long__full_URIs_ = SubLObjectFactory.makeString("Long (full URIs)");
        $str34$_Optional__enter_pathname_of_a_fi = SubLObjectFactory.makeString("(Optional) enter pathname of a file to load the ontology from (if not from the URI):");
        $str35$pathname = SubLObjectFactory.makeString("pathname");
        $str36$ = SubLObjectFactory.makeString("");
        $str37$Enter_a_prefix_for_new_constant_n = SubLObjectFactory.makeString("Enter a prefix for new constant names:");
        $str38$Newly_created_constants_for_terms = SubLObjectFactory.makeString("Newly created constants for terms in the imported ontology will have names that start with this prefix.");
        $str39$constant_prefix = SubLObjectFactory.makeString("constant-prefix");
        $str40$Enter_a_suffix_for_new_constant_n = SubLObjectFactory.makeString("Enter a suffix for new constant names:");
        $str41$Newly_created_constants_for_terms = SubLObjectFactory.makeString("Newly created constants for terms in the imported ontology will have names that start with this suffix");
        $str42$constant_suffix = SubLObjectFactory.makeString("constant-suffix");
        $str43$_Optional__Enter_an_existing_Cyc_ = SubLObjectFactory.makeString("(Optional) Enter an existing Cyc term that represents the ontology:");
        $str44$ontology = SubLObjectFactory.makeString("ontology");
        $str45$Complete = SubLObjectFactory.makeString("Complete");
        $const46$owl_Ontology = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:Ontology"));
        $sym47$CB_OWL_IMPORT_OLD = SubLObjectFactory.makeSymbol("CB-OWL-IMPORT-OLD");
        $kw48$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str49$Bad_source__ = SubLObjectFactory.makeString("Bad source: ");
        $str50$Can_only_import_OWL_ontologies_fr = SubLObjectFactory.makeString("Can only import OWL ontologies from valid files or URLs.");
        $str51$_does_not_appear_to_be_a_URI_ = SubLObjectFactory.makeString(" does not appear to be a URI.");
        $str52$Enter_a_prefix_for_Medium_format_ = SubLObjectFactory.makeString("Enter a prefix for Medium format names");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("URI"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT-PREFIX"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX"), (SubLObject)SubLObjectFactory.makeKeyword("ONTOLOGY"), (SubLObject)SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?"), (SubLObject)SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?"), (SubLObject)SubLObjectFactory.makeKeyword("URI-PREFIX"));
        $sym54$HANDLE_OWL_TO_CYCL_INPUT = SubLObjectFactory.makeSymbol("HANDLE-OWL-TO-CYCL-INPUT");
        $kw55$ONTOLOGY = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $str56$Importing_ = SubLObjectFactory.makeString("Importing ");
        $str57$OWL_Ontology = SubLObjectFactory.makeString("OWL Ontology");
        $str58$_Display_Importer_Progress_ = SubLObjectFactory.makeString("[Display Importer Progress]");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Processing Class Definitions"), (SubLObject)SubLObjectFactory.makeString("Processing Property Definitions"), (SubLObject)SubLObjectFactory.makeString("Processing Instance Definitions"), (SubLObject)SubLObjectFactory.makeString("Waiting for Enqueued Operations to be Processed"));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("REFRESH-STRING"));
        $str61$Can_t_interpret__S_as_the_ID_of_a = SubLObjectFactory.makeString("Can't interpret ~S as the ID of an exising OWL importer.");
        $str62$T = SubLObjectFactory.makeString("T");
        $sym63$CB_SHOW_OWL_IMPORTER = SubLObjectFactory.makeSymbol("CB-SHOW-OWL-IMPORTER");
        $str64$Status___A_ = SubLObjectFactory.makeString("Status: ~A.");
        $str65$Done = SubLObjectFactory.makeString("Done");
        $str66$Working = SubLObjectFactory.makeString("Working");
        $str67$_Total_time___A_ = SubLObjectFactory.makeString(" Total time: ~A.");
        $sym68$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const69$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const70$synonymousExternalConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $str71$Term_count___D_ = SubLObjectFactory.makeString("Term count: ~D.");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("PERCENT-DONE"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-SECONDS"));
        $str73$_A_ = SubLObjectFactory.makeString("~A:");
        $int74$100 = SubLObjectFactory.makeInteger(100);
        $str75$Started_at__A__Elapsed_time___A_ = SubLObjectFactory.makeString("Started at ~A. Elapsed time: ~A.");
        $str76$Estimated_finish_time___A__after_ = SubLObjectFactory.makeString("Estimated finish time: ~A (after ~A)");
        $str77$Error_Messages___D__ = SubLObjectFactory.makeString("Error Messages (~D):");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"));
        $str79$_Refresh_ = SubLObjectFactory.makeString("[Refresh]");
        $str80$_Halt_Auto_Refresh_ = SubLObjectFactory.makeString("[Halt Auto Refresh]");
        $str81$_Start_Auto_Refresh_ = SubLObjectFactory.makeString("[Start Auto Refresh]");
        $str82$__Last_refresh___A_ = SubLObjectFactory.makeString(" (Last refresh: ~A)");
        $sym83$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str84$_OWL_Importer_ = SubLObjectFactory.makeString("[OWL Importer ");
        $str85$_ = SubLObjectFactory.makeString("]");
        $kw86$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str87$cb_show_owl_importer__D__A = SubLObjectFactory.makeString("cb-show-owl-importer&~D&~A");
        $kw88$SHOW_OWL_IMPORTER = SubLObjectFactory.makeKeyword("SHOW-OWL-IMPORTER");
        $sym89$CB_LINK_SHOW_OWL_IMPORTER = SubLObjectFactory.makeSymbol("CB-LINK-SHOW-OWL-IMPORTER");
    }
}

/*

	Total time: 347 ms
	
*/