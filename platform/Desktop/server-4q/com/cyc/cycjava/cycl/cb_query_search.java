package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_query_search extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_query_search";
    public static final String myFingerPrint = "6d0806ad4e231372b21a1a2fd2e68239aa86b23a3f054418d051bb440834701b";
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 924L)
    public static SubLSymbol $cb_query_search_width$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1028L)
    public static SubLSymbol $cb_query_search_height$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1132L)
    public static SubLSymbol $cb_query_search_return_fragmentsP$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1203L)
    public static SubLSymbol $cb_query_search_return_kbqsP$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1266L)
    public static SubLSymbol $cb_query_search_kbq_info_to_show$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1367L)
    public static SubLSymbol $cb_query_search_query_type$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1451L)
    public static SubLSymbol $cb_query_search_task$;
    private static final SubLInteger $int0$80;
    private static final SubLSymbol $sym1$_CB_QUERY_SEARCH_RETURN_FRAGMENTS__;
    private static final SubLSymbol $sym2$_CB_QUERY_SEARCH_RETURN_KBQS__;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$_CB_QUERY_SEARCH_KBQ_INFO_TO_SHOW_;
    private static final SubLObject $const5$CycLQuerySpecification;
    private static final SubLSymbol $sym6$_CB_QUERY_SEARCH_QUERY_TYPE_;
    private static final SubLObject $const7$GeneralCycKETask_Allotment;
    private static final SubLSymbol $sym8$_CB_QUERY_SEARCH_TASK_;
    private static final SubLString $str9$Query_Search;
    private static final SubLString $str10$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str11$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw12$UNINITIALIZED;
    private static final SubLSymbol $kw13$CB_CYC;
    private static final SubLSymbol $kw14$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw15$SHA1;
    private static final SubLString $str16$yui_skin_sam;
    private static final SubLString $str17$reloadFrameButton;
    private static final SubLString $str18$button;
    private static final SubLString $str19$reload;
    private static final SubLString $str20$Refresh_Frames;
    private static final SubLString $str21$post;
    private static final SubLString $str22$cb_handle_query_search;
    private static final SubLString $str23$default_task;
    private static final SubLString $str24$kbqs_;
    private static final SubLString $str25$fragments_;
    private static final SubLString $str26$query_type;
    private static final SubLString $str27$show_kbq_sentence_;
    private static final SubLSymbol $kw28$QUERY_SENTENCE;
    private static final SubLString $str29$show_kbq_gloss_;
    private static final SubLSymbol $kw30$GLOSS;
    private static final SubLString $str31$show_kbq_supports_;
    private static final SubLSymbol $kw32$SUPPORTS;
    private static final SubLString $str33$search_string;
    private static final SubLSymbol $sym34$CB_HANDLE_QUERY_SEARCH;
    private static final SubLSymbol $kw35$HTML_HANDLER;
    private static final SubLString $str36$Results_for__S_;
    private static final SubLSymbol $kw37$RED;
    private static final SubLString $str38$Please_select_Fragments_and_or_Re;
    private static final SubLList $list39;
    private static final SubLString $str40$No_reified_queries_found_;
    private static final SubLList $list41;
    private static final SubLString $str42$Filter_collection;
    private static final SubLString $str43$A_query_type_for_reified_queries_;
    private static final SubLInteger $int44$300;
    private static final SubLString $str45$nd___;
    private static final SubLSymbol $kw46$INPUT_NAME;
    private static final SubLSymbol $kw47$COMPLETE_LABEL;
    private static final SubLSymbol $kw48$WIDTH;
    private static final SubLInteger $int49$500;
    private static final SubLSymbol $kw50$PRETTY_NAME;
    private static final SubLSymbol $kw51$CLEAR_LABEL;
    private static final SubLSymbol $kw52$COMPLETE_TYPE;
    private static final SubLObject $const53$SpecsFn;
    private static final SubLString $str54$Query_types__;
    private static final SubLString $str55$Should_we_construct_fragments_;
    private static final SubLString $str56$Fragments__;
    private static final SubLString $str57$t;
    private static final SubLString $str58$Should_we_retrieve_reified_querie;
    private static final SubLString $str59$Reified_Queries__;
    private static final SubLString $str60$__Show_query_sentence__;
    private static final SubLString $str61$_Gloss__;
    private static final SubLString $str62$_Supports__;
    private static final SubLString $str63$_;
    private static final SubLString $str64$Enter_A_Search_String__;
    private static final SubLString $str65$Eval;
    private static final SubLString $str66$Clear;
    private static final SubLSymbol $kw67$CENTER;
    private static final SubLString $str68$Reified_Query;
    private static final SubLString $str69$Score;
    private static final SubLList $list70;
    private static final SubLString $str71$Gloss__;
    private static final SubLString $str72$cycl_;
    private static final SubLString $str73$;
    private static final SubLString $str74$Query_Sentence__;
    private static final SubLSymbol $kw75$INVISIBLE;
    private static final SubLSymbol $kw76$TEXT;
    private static final SubLString $str77$Supports__;
    private static final SubLList $list78;
    private static final SubLString $str79$_is_mapped_to_;
    private static final SubLString $str80$_with_a_score_of_;
    private static final SubLString $str81$_;
    private static final SubLString $str82$_S____;
    private static final SubLString $str83$___D_;
    private static final SubLObject $const84$queryContentString;
    private static final SubLObject $const85$formulaTemplateGloss;
    private static final SubLSymbol $sym86$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw87$MAIN;
    private static final SubLSymbol $kw88$QUERY_SEARCH;
    private static final SubLSymbol $sym89$CB_LINK_QUERY_SEARCH;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 1666L)
    public static SubLObject cb_handle_query_search(SubLObject args) {
        if (args == cb_query_search.UNPROVIDED) {
            args = (SubLObject)cb_query_search.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_query_search.$str9$Query_Search;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_query_search.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_query_search.$str10$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_query_search.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_query_search.$str11$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_query_search.$kw12$UNINITIALIZED) ? ConsesLow.list(cb_query_search.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_query_search.$kw13$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_query_search.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_query_search.$kw14$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_query_search.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_query_search.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_query_search.$str16$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_query_search.$str17$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_query_search.$str18$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_query_search.$str19$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_query_search.$str20$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            if (cb_query_search.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_query_search.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_query_search.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_query_search.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)cb_query_search.$kw13$CB_CYC);
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        html_script_utilities.cb_hoverover_page_init();
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_query_search.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_query_search.$str21$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        if (cb_query_search.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_query_search.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_query_search.$str22$cb_handle_query_search, (SubLObject)cb_query_search.T, (SubLObject)cb_query_search.UNPROVIDED);
                            if (cb_query_search.NIL != args) {
                                cb_query_search.$cb_query_search_task$.setDynamicValue(cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_query_search.$str23$default_task, args), (SubLObject)cb_query_search.UNPROVIDED), thread);
                                cb_query_search.$cb_query_search_return_kbqsP$.setDynamicValue(list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_query_search.$str24$kbqs_, args)), thread);
                                cb_query_search.$cb_query_search_return_fragmentsP$.setDynamicValue(list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_query_search.$str25$fragments_, args)), thread);
                                cb_query_search.$cb_query_search_query_type$.setDynamicValue(cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_query_search.$str26$query_type, args), (SubLObject)cb_query_search.UNPROVIDED), thread);
                                cb_query_search.$cb_query_search_kbq_info_to_show$.setDynamicValue((SubLObject)cb_query_search.NIL, thread);
                                if (cb_query_search.NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_query_search.$str27$show_kbq_sentence_, args))) {
                                    cb_query_search.$cb_query_search_kbq_info_to_show$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)cb_query_search.$kw28$QUERY_SENTENCE, cb_query_search.$cb_query_search_kbq_info_to_show$.getDynamicValue(thread)), thread);
                                }
                                if (cb_query_search.NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_query_search.$str29$show_kbq_gloss_, args))) {
                                    cb_query_search.$cb_query_search_kbq_info_to_show$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)cb_query_search.$kw30$GLOSS, cb_query_search.$cb_query_search_kbq_info_to_show$.getDynamicValue(thread)), thread);
                                }
                                if (cb_query_search.NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_query_search.$str31$show_kbq_supports_, args))) {
                                    cb_query_search.$cb_query_search_kbq_info_to_show$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)cb_query_search.$kw32$SUPPORTS, cb_query_search.$cb_query_search_kbq_info_to_show$.getDynamicValue(thread)), thread);
                                }
                            }
                            final SubLObject input_string = html_utilities.html_extract_input((SubLObject)cb_query_search.$str33$search_string, args);
                            final SubLObject _prev_bind_0_$6 = cae_query_search.$current_cae_task$.currentBinding(thread);
                            try {
                                cae_query_search.$current_cae_task$.bind(cb_query_search.$cb_query_search_task$.getDynamicValue(thread), thread);
                                final SubLObject results = cb_query_search_results(input_string);
                                cb_show_handle_query_search(input_string, results);
                            }
                            finally {
                                cae_query_search.$current_cae_task$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_query_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 2995L)
    public static SubLObject cb_show_handle_query_search(final SubLObject input_string, final SubLObject results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_show_handle_query_search_form(input_string);
        if (cb_query_search.NIL != input_string) {
            html_utilities.html_newline((SubLObject)cb_query_search.TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_query_search.$str36$Results_for__S_, input_string);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_query_search.UNPROVIDED);
            if (cb_query_search.NIL == cb_query_search.$cb_query_search_return_kbqsP$.getDynamicValue(thread) && cb_query_search.NIL == cb_query_search.$cb_query_search_return_fragmentsP$.getDynamicValue(thread)) {
                final SubLObject color_val = (SubLObject)cb_query_search.$kw37$RED;
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (cb_query_search.NIL != color_val) {
                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_val));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                    html_utilities.html_princ_strong((SubLObject)cb_query_search.$str38$Please_select_Fragments_and_or_Re);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            SubLObject result_string = (SubLObject)cb_query_search.NIL;
            SubLObject result_kbqs = (SubLObject)cb_query_search.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(results, results, (SubLObject)cb_query_search.$list39);
            result_string = results.first();
            SubLObject current = results.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, results, (SubLObject)cb_query_search.$list39);
            result_kbqs = current.first();
            current = current.rest();
            if (cb_query_search.NIL == current) {
                if (cb_query_search.NIL != result_string) {
                    html_macros.verify_not_within_html_pre();
                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                    final SubLObject _prev_bind_2 = html_macros.$within_html_pre$.currentBinding(thread);
                    try {
                        html_macros.$within_html_pre$.bind((SubLObject)cb_query_search.T, thread);
                        html_utilities.html_princ(result_string);
                    }
                    finally {
                        html_macros.$within_html_pre$.rebind(_prev_bind_2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                }
                if (cb_query_search.NIL != cb_query_search.$cb_query_search_return_kbqsP$.getDynamicValue(thread)) {
                    if (cb_query_search.NIL != list_utilities.empty_list_p(result_kbqs)) {
                        html_utilities.html_princ((SubLObject)cb_query_search.$str40$No_reified_queries_found_);
                    }
                    else {
                        show_reified_query_search_results(result_kbqs);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(results, (SubLObject)cb_query_search.$list39);
            }
        }
        return (SubLObject)cb_query_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 3746L)
    public static SubLObject cb_show_handle_query_search_form(final SubLObject input_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_form_widgets.cb_el_term_input_section(cb_query_search.$cb_query_search_task$.getDynamicValue(thread), (SubLObject)cb_query_search.$list41);
        final SubLObject complete_genl = cb_query_search.$const5$CycLQuerySpecification;
        final SubLObject pretty_name = (SubLObject)cb_query_search.$str42$Filter_collection;
        if (cb_query_search.$str43$A_query_type_for_reified_queries_.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover((SubLObject)cb_query_search.$str43$A_query_type_for_reified_queries_, (SubLObject)cb_query_search.NIL, (SubLObject)cb_query_search.$int44$300, (SubLObject)cb_query_search.NIL);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup(onmouseover);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_query_search.$str45$nd___);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                cb_form_widgets.cb_el_term_input_section(cb_query_search.$cb_query_search_query_type$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { cb_query_search.$kw46$INPUT_NAME, cb_query_search.$str26$query_type, cb_query_search.$kw47$COMPLETE_LABEL, cb_query_search.NIL, cb_query_search.$kw48$WIDTH, cb_query_search.$int49$500, cb_query_search.$kw50$PRETTY_NAME, pretty_name, cb_query_search.$kw51$CLEAR_LABEL, cb_query_search.NIL, cb_query_search.$kw52$COMPLETE_TYPE, ConsesLow.list(cb_query_search.$const53$SpecsFn, complete_genl) }));
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        html_utilities.html_princ_strong((SubLObject)cb_query_search.$str54$Query_types__);
        html_utilities.html_indent((SubLObject)cb_query_search.THREE_INTEGER);
        if (cb_query_search.$str55$Should_we_construct_fragments_.isString()) {
            final SubLObject onmouseover2 = html_script_utilities.html_hoverover_anchor_onmouseover((SubLObject)cb_query_search.$str55$Should_we_construct_fragments_, (SubLObject)cb_query_search.NIL, (SubLObject)cb_query_search.$int44$300, (SubLObject)cb_query_search.NIL);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup(onmouseover2);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_query_search.$str45$nd___);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                html_utilities.html_princ((SubLObject)cb_query_search.$str56$Fragments__);
                html_utilities.html_checkbox_input((SubLObject)cb_query_search.$str25$fragments_, (SubLObject)cb_query_search.$str57$t, cb_query_search.$cb_query_search_return_fragmentsP$.getDynamicValue(thread), (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        html_utilities.html_indent((SubLObject)cb_query_search.THREE_INTEGER);
        final SubLObject return_kbqsP = cb_query_search.$cb_query_search_return_kbqsP$.getDynamicValue(thread);
        if (cb_query_search.$str58$Should_we_retrieve_reified_querie.isString()) {
            final SubLObject onmouseover3 = html_script_utilities.html_hoverover_anchor_onmouseover((SubLObject)cb_query_search.$str58$Should_we_retrieve_reified_querie, (SubLObject)cb_query_search.NIL, (SubLObject)cb_query_search.$int44$300, (SubLObject)cb_query_search.NIL);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup(onmouseover3);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_query_search.$str45$nd___);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
            final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                html_utilities.html_princ((SubLObject)cb_query_search.$str59$Reified_Queries__);
                html_utilities.html_checkbox_input((SubLObject)cb_query_search.$str24$kbqs_, (SubLObject)cb_query_search.$str57$t, return_kbqsP, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        html_utilities.html_princ((SubLObject)cb_query_search.$str60$__Show_query_sentence__);
        html_utilities.html_checkbox_input((SubLObject)cb_query_search.$str27$show_kbq_sentence_, (SubLObject)cb_query_search.$str57$t, subl_promotions.memberP((SubLObject)cb_query_search.$kw28$QUERY_SENTENCE, cb_query_search.$cb_query_search_kbq_info_to_show$.getDynamicValue(thread), (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED), (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_query_search.$str61$_Gloss__);
        html_utilities.html_checkbox_input((SubLObject)cb_query_search.$str29$show_kbq_gloss_, (SubLObject)cb_query_search.$str57$t, subl_promotions.memberP((SubLObject)cb_query_search.$kw30$GLOSS, cb_query_search.$cb_query_search_kbq_info_to_show$.getDynamicValue(thread), (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED), (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_query_search.$str62$_Supports__);
        html_utilities.html_checkbox_input((SubLObject)cb_query_search.$str31$show_kbq_supports_, (SubLObject)cb_query_search.$str57$t, subl_promotions.memberP((SubLObject)cb_query_search.$kw32$SUPPORTS, cb_query_search.$cb_query_search_kbq_info_to_show$.getDynamicValue(thread), (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED), (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_query_search.$str63$_);
        html_utilities.html_newline((SubLObject)cb_query_search.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_query_search.$str64$Enter_A_Search_String__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_indent((SubLObject)cb_query_search.TWO_INTEGER);
        html_utilities.html_submit_input((SubLObject)cb_query_search.$str65$Eval, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_query_search.UNPROVIDED);
        html_script_utilities.html_clear_input_button((SubLObject)cb_query_search.$str33$search_string, (SubLObject)cb_query_search.$str66$Clear, (SubLObject)cb_query_search.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_query_search.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_query_search.$str33$search_string);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
        if (cb_query_search.NIL != cb_query_search.$cb_query_search_width$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup(cb_query_search.$cb_query_search_width$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
        }
        if (cb_query_search.NIL != cb_query_search.$cb_query_search_height$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup(cb_query_search.$cb_query_search_height$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
        final SubLObject _prev_bind_4 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
            if (cb_query_search.NIL != input_string) {
                html_utilities.html_princ(input_string);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_4, thread);
        }
        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        return (SubLObject)cb_query_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 5922L)
    public static SubLObject show_reified_query_search_results(final SubLObject result_kbqs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
            SubLObject bgcolor = html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (cb_query_search.NIL != bgcolor) {
                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                html_utilities.html_markup(bgcolor);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_query_search.$kw67$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                    html_utilities.html_princ_strong((SubLObject)cb_query_search.$str68$Reified_Query);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_query_search.$kw67$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                    html_utilities.html_princ_strong((SubLObject)cb_query_search.$str69$Score);
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
            html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
            SubLObject color_toggle = (SubLObject)cb_query_search.NIL;
            SubLObject list_var = (SubLObject)cb_query_search.NIL;
            SubLObject pair = (SubLObject)cb_query_search.NIL;
            SubLObject index = (SubLObject)cb_query_search.NIL;
            list_var = result_kbqs;
            pair = list_var.first();
            for (index = (SubLObject)cb_query_search.ZERO_INTEGER; cb_query_search.NIL != list_var; list_var = list_var.rest(), pair = list_var.first(), index = Numbers.add((SubLObject)cb_query_search.ONE_INTEGER, index)) {
                if (cb_query_search.NIL != color_toggle) {
                    color_toggle = (SubLObject)cb_query_search.NIL;
                }
                else {
                    color_toggle = (SubLObject)cb_query_search.T;
                }
                bgcolor = ((cb_query_search.NIL != color_toggle) ? html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue() : html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue());
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject kbq = (SubLObject)cb_query_search.NIL;
                SubLObject supports = (SubLObject)cb_query_search.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_query_search.$list70);
                kbq = current.first();
                current = (supports = current.rest());
                final SubLObject score = cae_query_search.reified_query_search_score_from_supports(supports);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_query_search.NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                        cb_utilities.cb_form(kbq, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_query_search.$kw67$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                        html_utilities.html_princ(score);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                if (cb_query_search.NIL != subl_promotions.memberP((SubLObject)cb_query_search.$kw30$GLOSS, cb_query_search.$cb_query_search_kbq_info_to_show$.getDynamicValue(thread), (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED)) {
                    final SubLObject gloss = get_kbq_gloss(kbq);
                    if (cb_query_search.NIL != gloss) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (cb_query_search.NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_query_search.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                                html_utilities.html_princ((SubLObject)cb_query_search.$str71$Gloss__);
                                html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                html_utilities.html_princ(gloss);
                                html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
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
                        html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                    }
                }
                if (cb_query_search.NIL != subl_promotions.memberP((SubLObject)cb_query_search.$kw28$QUERY_SENTENCE, cb_query_search.$cb_query_search_kbq_info_to_show$.getDynamicValue(thread), (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED)) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (cb_query_search.NIL != bgcolor) {
                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_markup(bgcolor);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_query_search.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                            final SubLObject dhtml_object_id = Sequences.cconcatenate((SubLObject)cb_query_search.$str72$cycl_, format_nil.format_nil_d_no_copy(index));
                            dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, (SubLObject)cb_query_search.$str73$);
                            html_utilities.html_princ((SubLObject)cb_query_search.$str74$Query_Sentence__);
                            dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, (SubLObject)cb_query_search.$kw75$INVISIBLE, (SubLObject)cb_query_search.$kw76$TEXT);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            if (cb_query_search.NIL != dhtml_object_id) {
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                                html_utilities.html_markup(dhtml_object_id);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                                cb_utilities.cb_form(kb_query.kbq_sentence(kbq), (SubLObject)cb_query_search.ONE_INTEGER, (SubLObject)cb_query_search.T);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                }
                if (cb_query_search.NIL != subl_promotions.memberP((SubLObject)cb_query_search.$kw32$SUPPORTS, cb_query_search.$cb_query_search_kbq_info_to_show$.getDynamicValue(thread), (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED)) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (cb_query_search.NIL != bgcolor) {
                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_markup(bgcolor);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_query_search.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                            html_utilities.html_princ((SubLObject)cb_query_search.$str77$Supports__);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                    SubLObject cdolist_list_var = supports;
                    SubLObject support = (SubLObject)cb_query_search.NIL;
                    support = cdolist_list_var.first();
                    while (cb_query_search.NIL != cdolist_list_var) {
                        SubLObject current_$21;
                        final SubLObject datum_$20 = current_$21 = support;
                        SubLObject token_record = (SubLObject)cb_query_search.NIL;
                        SubLObject v_term = (SubLObject)cb_query_search.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)cb_query_search.$list78);
                        token_record = current_$21.first();
                        current_$21 = current_$21.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)cb_query_search.$list78);
                        v_term = current_$21.first();
                        current_$21 = current_$21.rest();
                        if (cb_query_search.NIL == current_$21) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (cb_query_search.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_query_search.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                                    final SubLObject focal_string = cae_query_search.token_record_focal_string(token_record);
                                    final SubLObject score_$24 = cae_query_search.reified_query_search_score_from_support(support);
                                    final SubLObject explanation = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(focal_string), new SubLObject[] { cb_query_search.$str79$_is_mapped_to_, format_nil.format_nil_s_no_copy(v_term), cb_query_search.$str80$_with_a_score_of_, format_nil.format_nil_d_no_copy(score_$24), cb_query_search.$str81$_ });
                                    if (explanation.isString()) {
                                        final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover(explanation, (SubLObject)cb_query_search.NIL, (SubLObject)cb_query_search.$int44$300, (SubLObject)cb_query_search.NIL);
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                                        html_utilities.html_markup(onmouseover);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_query_search.$str45$nd___);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
                                            html_utilities.html_indent((SubLObject)cb_query_search.THREE_INTEGER);
                                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_query_search.$str82$_S____, focal_string);
                                            cb_utilities.cb_form(v_term, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED);
                                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_query_search.$str83$___D_, score_$24);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
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
                            html_utilities.html_source_readability_terpri((SubLObject)cb_query_search.UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$20, (SubLObject)cb_query_search.$list78);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        support = cdolist_list_var.first();
                    }
                }
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_query_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 8218L)
    public static SubLObject get_kbq_gloss(final SubLObject kbq) {
        SubLObject gloss = kb_mapping_utilities.fpred_value_in_any_mt(kbq, cb_query_search.$const84$queryContentString, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED);
        if (cb_query_search.NIL == gloss) {
            final SubLObject formula_template = kb_query.kbq_template(kbq);
            if (cb_query_search.NIL != formula_template) {
                gloss = kb_mapping_utilities.fpred_value_in_any_mt(formula_template, cb_query_search.$const85$formulaTemplateGloss, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED, (SubLObject)cb_query_search.UNPROVIDED);
            }
        }
        return gloss;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 8517L)
    public static SubLObject cb_query_search_results(final SubLObject search_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_string = (SubLObject)cb_query_search.NIL;
        SubLObject kbqs = (SubLObject)cb_query_search.NIL;
        SubLObject err = (SubLObject)cb_query_search.NIL;
        if (cb_query_search.NIL != string_utilities.non_empty_string_p(search_string)) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)cb_query_search.$sym86$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (cb_query_search.NIL != cb_query_search.$cb_query_search_return_fragmentsP$.getDynamicValue(thread)) {
                            SubLObject stream = (SubLObject)cb_query_search.NIL;
                            try {
                                stream = streams_high.make_private_string_output_stream();
                                cae_query_search.debug_query_search_string(search_string, cb_query_search.$cb_query_search_task$.getDynamicValue(thread), (SubLObject)cb_query_search.NIL, stream, (SubLObject)cb_query_search.UNPROVIDED);
                                result_string = streams_high.get_output_stream_string(stream);
                            }
                            finally {
                                final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_query_search.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    streams_high.close(stream, (SubLObject)cb_query_search.UNPROVIDED);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                }
                            }
                        }
                        if (cb_query_search.NIL != cb_query_search.$cb_query_search_return_kbqsP$.getDynamicValue(thread)) {
                            kbqs = cae_query_search.get_reified_queries_from_string(search_string, cb_query_search.$cb_query_search_task$.getDynamicValue(thread), cb_query_search.$cb_query_search_query_type$.getDynamicValue(thread));
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)cb_query_search.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                err = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (cb_query_search.NIL != err) {
                result_string = err;
            }
        }
        return (SubLObject)ConsesLow.list(result_string, kbqs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-query-search.lisp", position = 9119L)
    public static SubLObject cb_link_query_search(SubLObject linktext) {
        if (linktext == cb_query_search.UNPROVIDED) {
            linktext = (SubLObject)cb_query_search.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_query_search.NIL == linktext) {
            linktext = (SubLObject)cb_query_search.$str9$Query_Search;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_query_search.$kw87$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_query_search.$str22$cb_handle_query_search);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
        if (cb_query_search.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_query_search.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_query_search.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_query_search.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_query_search.NIL;
    }
    
    public static SubLObject declare_cb_query_search_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_query_search", "cb_handle_query_search", "CB-HANDLE-QUERY-SEARCH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_query_search", "cb_show_handle_query_search", "CB-SHOW-HANDLE-QUERY-SEARCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_query_search", "cb_show_handle_query_search_form", "CB-SHOW-HANDLE-QUERY-SEARCH-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_query_search", "show_reified_query_search_results", "SHOW-REIFIED-QUERY-SEARCH-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_query_search", "get_kbq_gloss", "GET-KBQ-GLOSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_query_search", "cb_query_search_results", "CB-QUERY-SEARCH-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_query_search", "cb_link_query_search", "CB-LINK-QUERY-SEARCH", 0, 1, false);
        return (SubLObject)cb_query_search.NIL;
    }
    
    public static SubLObject init_cb_query_search_file() {
        cb_query_search.$cb_query_search_width$ = SubLFiles.defparameter("*CB-QUERY-SEARCH-WIDTH*", (SubLObject)cb_query_search.$int0$80);
        cb_query_search.$cb_query_search_height$ = SubLFiles.defparameter("*CB-QUERY-SEARCH-HEIGHT*", (SubLObject)cb_query_search.THREE_INTEGER);
        cb_query_search.$cb_query_search_return_fragmentsP$ = SubLFiles.defparameter("*CB-QUERY-SEARCH-RETURN-FRAGMENTS?*", (SubLObject)cb_query_search.NIL);
        cb_query_search.$cb_query_search_return_kbqsP$ = SubLFiles.defparameter("*CB-QUERY-SEARCH-RETURN-KBQS?*", (SubLObject)cb_query_search.T);
        cb_query_search.$cb_query_search_kbq_info_to_show$ = SubLFiles.defparameter("*CB-QUERY-SEARCH-KBQ-INFO-TO-SHOW*", (SubLObject)cb_query_search.$list3);
        cb_query_search.$cb_query_search_query_type$ = SubLFiles.defparameter("*CB-QUERY-SEARCH-QUERY-TYPE*", cb_query_search.$const5$CycLQuerySpecification);
        cb_query_search.$cb_query_search_task$ = SubLFiles.defparameter("*CB-QUERY-SEARCH-TASK*", cb_query_search.$const7$GeneralCycKETask_Allotment);
        return (SubLObject)cb_query_search.NIL;
    }
    
    public static SubLObject setup_cb_query_search_file() {
        utilities_macros.register_html_state_variable((SubLObject)cb_query_search.$sym1$_CB_QUERY_SEARCH_RETURN_FRAGMENTS__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_query_search.$sym1$_CB_QUERY_SEARCH_RETURN_FRAGMENTS__);
        utilities_macros.register_html_state_variable((SubLObject)cb_query_search.$sym2$_CB_QUERY_SEARCH_RETURN_KBQS__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_query_search.$sym2$_CB_QUERY_SEARCH_RETURN_KBQS__);
        utilities_macros.register_html_state_variable((SubLObject)cb_query_search.$sym4$_CB_QUERY_SEARCH_KBQ_INFO_TO_SHOW_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_query_search.$sym4$_CB_QUERY_SEARCH_KBQ_INFO_TO_SHOW_);
        utilities_macros.register_html_state_variable((SubLObject)cb_query_search.$sym6$_CB_QUERY_SEARCH_QUERY_TYPE_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_query_search.$sym6$_CB_QUERY_SEARCH_QUERY_TYPE_);
        utilities_macros.register_html_state_variable((SubLObject)cb_query_search.$sym8$_CB_QUERY_SEARCH_TASK_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_query_search.$sym8$_CB_QUERY_SEARCH_TASK_);
        html_macros.note_cgi_handler_function((SubLObject)cb_query_search.$sym34$CB_HANDLE_QUERY_SEARCH, (SubLObject)cb_query_search.$kw35$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_query_search.$kw88$QUERY_SEARCH, (SubLObject)cb_query_search.$sym89$CB_LINK_QUERY_SEARCH, (SubLObject)cb_query_search.ONE_INTEGER);
        return (SubLObject)cb_query_search.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_query_search_file();
    }
    
    public void initializeVariables() {
        init_cb_query_search_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_query_search_file();
    }
    
    static {
        me = (SubLFile)new cb_query_search();
        cb_query_search.$cb_query_search_width$ = null;
        cb_query_search.$cb_query_search_height$ = null;
        cb_query_search.$cb_query_search_return_fragmentsP$ = null;
        cb_query_search.$cb_query_search_return_kbqsP$ = null;
        cb_query_search.$cb_query_search_kbq_info_to_show$ = null;
        cb_query_search.$cb_query_search_query_type$ = null;
        cb_query_search.$cb_query_search_task$ = null;
        $int0$80 = SubLObjectFactory.makeInteger(80);
        $sym1$_CB_QUERY_SEARCH_RETURN_FRAGMENTS__ = SubLObjectFactory.makeSymbol("*CB-QUERY-SEARCH-RETURN-FRAGMENTS?*");
        $sym2$_CB_QUERY_SEARCH_RETURN_KBQS__ = SubLObjectFactory.makeSymbol("*CB-QUERY-SEARCH-RETURN-KBQS?*");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUERY-SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("GLOSS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"));
        $sym4$_CB_QUERY_SEARCH_KBQ_INFO_TO_SHOW_ = SubLObjectFactory.makeSymbol("*CB-QUERY-SEARCH-KBQ-INFO-TO-SHOW*");
        $const5$CycLQuerySpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLQuerySpecification"));
        $sym6$_CB_QUERY_SEARCH_QUERY_TYPE_ = SubLObjectFactory.makeSymbol("*CB-QUERY-SEARCH-QUERY-TYPE*");
        $const7$GeneralCycKETask_Allotment = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralCycKETask-Allotment"));
        $sym8$_CB_QUERY_SEARCH_TASK_ = SubLObjectFactory.makeSymbol("*CB-QUERY-SEARCH-TASK*");
        $str9$Query_Search = SubLObjectFactory.makeString("Query Search");
        $str10$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str11$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw12$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw13$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw14$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw15$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str16$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str17$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str18$button = SubLObjectFactory.makeString("button");
        $str19$reload = SubLObjectFactory.makeString("reload");
        $str20$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str21$post = SubLObjectFactory.makeString("post");
        $str22$cb_handle_query_search = SubLObjectFactory.makeString("cb-handle-query-search");
        $str23$default_task = SubLObjectFactory.makeString("default-task");
        $str24$kbqs_ = SubLObjectFactory.makeString("kbqs?");
        $str25$fragments_ = SubLObjectFactory.makeString("fragments?");
        $str26$query_type = SubLObjectFactory.makeString("query-type");
        $str27$show_kbq_sentence_ = SubLObjectFactory.makeString("show-kbq-sentence?");
        $kw28$QUERY_SENTENCE = SubLObjectFactory.makeKeyword("QUERY-SENTENCE");
        $str29$show_kbq_gloss_ = SubLObjectFactory.makeString("show-kbq-gloss?");
        $kw30$GLOSS = SubLObjectFactory.makeKeyword("GLOSS");
        $str31$show_kbq_supports_ = SubLObjectFactory.makeString("show-kbq-supports?");
        $kw32$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $str33$search_string = SubLObjectFactory.makeString("search-string");
        $sym34$CB_HANDLE_QUERY_SEARCH = SubLObjectFactory.makeSymbol("CB-HANDLE-QUERY-SEARCH");
        $kw35$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str36$Results_for__S_ = SubLObjectFactory.makeString("Results for ~S:");
        $kw37$RED = SubLObjectFactory.makeKeyword("RED");
        $str38$Please_select_Fragments_and_or_Re = SubLObjectFactory.makeString("Please select Fragments and/or Reified Queries.");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-KBQS"));
        $str40$No_reified_queries_found_ = SubLObjectFactory.makeString("No reified queries found.");
        $list41 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INPUT-NAME"), SubLObjectFactory.makeString("default-task"), SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), cb_query_search.NIL, SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeInteger(500), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Task"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), cb_query_search.NIL, SubLObjectFactory.makeKeyword("COMPLETE-TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEAnalysisTask")) });
        $str42$Filter_collection = SubLObjectFactory.makeString("Filter collection");
        $str43$A_query_type_for_reified_queries_ = SubLObjectFactory.makeString("A query type for reified queries.");
        $int44$300 = SubLObjectFactory.makeInteger(300);
        $str45$nd___ = SubLObjectFactory.makeString("nd();");
        $kw46$INPUT_NAME = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $kw47$COMPLETE_LABEL = SubLObjectFactory.makeKeyword("COMPLETE-LABEL");
        $kw48$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $int49$500 = SubLObjectFactory.makeInteger(500);
        $kw50$PRETTY_NAME = SubLObjectFactory.makeKeyword("PRETTY-NAME");
        $kw51$CLEAR_LABEL = SubLObjectFactory.makeKeyword("CLEAR-LABEL");
        $kw52$COMPLETE_TYPE = SubLObjectFactory.makeKeyword("COMPLETE-TYPE");
        $const53$SpecsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $str54$Query_types__ = SubLObjectFactory.makeString("Query types :");
        $str55$Should_we_construct_fragments_ = SubLObjectFactory.makeString("Should we construct fragments?");
        $str56$Fragments__ = SubLObjectFactory.makeString("Fragments? ");
        $str57$t = SubLObjectFactory.makeString("t");
        $str58$Should_we_retrieve_reified_querie = SubLObjectFactory.makeString("Should we retrieve reified queries?");
        $str59$Reified_Queries__ = SubLObjectFactory.makeString("Reified Queries? ");
        $str60$__Show_query_sentence__ = SubLObjectFactory.makeString(" (Show query sentence? ");
        $str61$_Gloss__ = SubLObjectFactory.makeString(" Gloss? ");
        $str62$_Supports__ = SubLObjectFactory.makeString(" Supports? ");
        $str63$_ = SubLObjectFactory.makeString(")");
        $str64$Enter_A_Search_String__ = SubLObjectFactory.makeString("Enter A Search String :");
        $str65$Eval = SubLObjectFactory.makeString("Eval");
        $str66$Clear = SubLObjectFactory.makeString("Clear");
        $kw67$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str68$Reified_Query = SubLObjectFactory.makeString("Reified Query");
        $str69$Score = SubLObjectFactory.makeString("Score");
        $list70 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KBQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $str71$Gloss__ = SubLObjectFactory.makeString("Gloss: ");
        $str72$cycl_ = SubLObjectFactory.makeString("cycl-");
        $str73$ = SubLObjectFactory.makeString("");
        $str74$Query_Sentence__ = SubLObjectFactory.makeString("Query Sentence: ");
        $kw75$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $kw76$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str77$Supports__ = SubLObjectFactory.makeString("Supports: ");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKEN-RECORD"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $str79$_is_mapped_to_ = SubLObjectFactory.makeString(" is mapped to ");
        $str80$_with_a_score_of_ = SubLObjectFactory.makeString(" with a score of ");
        $str81$_ = SubLObjectFactory.makeString(".");
        $str82$_S____ = SubLObjectFactory.makeString("~S -> ");
        $str83$___D_ = SubLObjectFactory.makeString(" (~D)");
        $const84$queryContentString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryContentString"));
        $const85$formulaTemplateGloss = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateGloss"));
        $sym86$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw87$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $kw88$QUERY_SEARCH = SubLObjectFactory.makeKeyword("QUERY-SEARCH");
        $sym89$CB_LINK_QUERY_SEARCH = SubLObjectFactory.makeSymbol("CB-LINK-QUERY-SEARCH");
    }
}

/*

	Total time: 623 ms
	
*/