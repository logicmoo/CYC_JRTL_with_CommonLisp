package com.cyc.cycjava.cycl.rtp;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.rkf_concept_harvester;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.cb_assertion_browser;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_rtp extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rtp.cb_rtp";
    public static final String myFingerPrint = "33b5039b95efa1c7a45334076fa002986c44c703488c3d7b25e2817bede20653";
    private static final SubLString $str0$Template_Matching_Tool;
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
    private static final SubLString $str13$cb_handle_template_matching;
    private static final SubLString $str14$Search;
    private static final SubLString $str15$Mt_;
    private static final SubLString $str16$mt;
    private static final SubLString $str17$Complete;
    private static final SubLObject $const18$Microtheory;
    private static final SubLString $str19$AnthraxTemplateMt;
    private static final SubLString $str20$Template_Category___;
    private static final SubLString $str21$category;
    private static final SubLString $str22$;
    private static final SubLInteger $int23$40;
    private static final SubLString $str24$Template_terminal___;
    private static final SubLString $str25$term;
    private static final SubLSymbol $sym26$CB_TEMPLATE_MATCHING;
    private static final SubLSymbol $kw27$HTML_HANDLER;
    private static final SubLObject $const28$LinguisticObjectType;
    private static final SubLString $str29$Template_Match_Results;
    private static final SubLString $str30$Sorry__no_templates_of_category_;
    private static final SubLString $str31$_contains_terminal_;
    private static final SubLString $str32$The_following_templates_of_catego;
    private static final SubLString $str33$_contain_the_terminal_;
    private static final SubLString $str34$Sorry__;
    private static final SubLString $str35$_is_an_unknown_template_category_;
    private static final SubLString $str36$Please_enter_a_different_term___c;
    private static final SubLSymbol $sym37$CB_HANDLE_TEMPLATE_MATCHING;
    private static final SubLString $str38$TemplateMatch;
    private static final SubLSymbol $kw39$MAIN;
    private static final SubLString $str40$cb_template_matching;
    private static final SubLSymbol $kw41$TEMPLATE_MATCHING;
    private static final SubLSymbol $sym42$CB_LINK_TEMPLATE_MATCHING;
    private static final SubLString $str43$Template_Match;
    private static final SubLString $str44$TmpltM;
    private static final SubLString $str45$Template_by_Term_Matcher;
    private static final SubLString $str46$Template_Parsing_Tool;
    private static final SubLString $str47$cb_handle_template_parsing;
    private static final SubLString $str48$Parse;
    private static final SubLString $str49$Use_VP_Parser__;
    private static final SubLString $str50$vpp;
    private static final SubLString $str51$_vpp;
    private static final SubLString $str52$Return_Style__;
    private static final SubLString $str53$return_style;
    private static final SubLString $str54$_simple;
    private static final SubLString $str55$Normal;
    private static final SubLString $str56$_assertion;
    private static final SubLString $str57$Assertion;
    private static final SubLString $str58$Store_results_in_pipeline__;
    private static final SubLString $str59$store_in_pipeline;
    private static final SubLString $str60$_pipeline;
    private static final SubLString $str61$Sentence_;
    private static final SubLString $str62$sentence;
    private static final SubLInteger $int63$80;
    private static final SubLString $str64$STemplate;
    private static final SubLString $str65$RKFParsingMt;
    private static final SubLSymbol $sym66$CB_TEMPLATE_PARSING;
    private static final SubLString $str67$Template_Parse_Results;
    private static final SubLString $str68$Sorry__no_parses_for_;
    private static final SubLString $str69$_of_category_;
    private static final SubLString $str70$_were_found_;
    private static final SubLString $str71$Sentence_parsed___S;
    private static final SubLString $str72$Root_category_of_parses__;
    private static final SubLString $str73$__Sorry___S_is_an_unknown_templat;
    private static final SubLString $str74$Please_enter_a_different_sentence;
    private static final SubLSymbol $sym75$CB_HANDLE_TEMPLATE_PARSING;
    private static final SubLSymbol $kw76$ASSERTION;
    private static final SubLSymbol $kw77$DONE;
    private static final SubLSymbol $kw78$CENTER;
    private static final SubLString $str79$Parses_for__s__spanning__A_;
    private static final SubLString $str80$CycL;
    private static final SubLString $str81$Supports;
    private static final SubLSymbol $kw82$LEFT;
    private static final SubLSymbol $kw83$TOP;
    private static final SubLString $str84$Component_Parser_parses_for_;
    private static final SubLString $str85$TemplateParsing;
    private static final SubLString $str86$cb_template_parsing;
    private static final SubLSymbol $kw87$TEMPLATE_PARSING;
    private static final SubLSymbol $sym88$CB_LINK_TEMPLATE_PARSING;
    private static final SubLString $str89$Template_Parse;
    private static final SubLString $str90$RTP;
    private static final SubLString $str91$Parsing_via_template_parser;
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/cb-rtp.lisp", position = 765L)
    public static SubLObject cb_template_matching(SubLObject args) {
        if (args == cb_rtp.UNPROVIDED) {
            args = (SubLObject)cb_rtp.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_rtp.$str0$Template_Matching_Tool;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_rtp.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_rtp.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_rtp.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_rtp.$str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_rtp.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_rtp.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_rtp.$kw4$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_rtp.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_rtp.$kw5$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_rtp.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_rtp.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_rtp.$str7$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_rtp.$str8$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_rtp.$str9$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_rtp.$str10$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_rtp.$str11$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            if (cb_rtp.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_rtp.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_rtp.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_rtp.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_rtp.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_rtp.$str12$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        if (cb_rtp.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_rtp.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_rtp.$str13$cb_handle_template_matching, (SubLObject)cb_rtp.T, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_rtp.$str14$Search, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_rtp.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_rtp.$str15$Mt_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_script_utilities.html_clear_input_button((SubLObject)cb_rtp.$str16$mt, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_complete.html_complete_button((SubLObject)cb_rtp.$str16$mt, (SubLObject)cb_rtp.$str17$Complete, cb_rtp.$const18$Microtheory, (SubLObject)cb_rtp.NIL, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)cb_rtp.$str16$mt, (SubLObject)cb_rtp.$str19$AnthraxTemplateMt, (SubLObject)cb_rtp.TWENTY_INTEGER);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_rtp.$str20$Template_Category___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_script_utilities.html_clear_input_button((SubLObject)cb_rtp.$str21$category, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_complete.html_complete_button((SubLObject)cb_rtp.$str21$category, (SubLObject)cb_rtp.$str17$Complete, template_isa_filter_col(), (SubLObject)cb_rtp.NIL, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)cb_rtp.$str21$category, (SubLObject)cb_rtp.$str22$, (SubLObject)cb_rtp.$int23$40);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_rtp.$str24$Template_terminal___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_script_utilities.html_clear_input_button((SubLObject)cb_rtp.$str25$term, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)cb_rtp.$str25$term, (SubLObject)cb_rtp.$str22$, (SubLObject)cb_rtp.$int23$40);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_rtp.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/cb-rtp.lisp", position = 1815L)
    public static SubLObject template_isa_filter_col() {
        return cb_rtp.$const28$LinguisticObjectType;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/cb-rtp.lisp", position = 1970L)
    public static SubLObject cb_handle_template_matching(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = html_utilities.html_extract_input((SubLObject)cb_rtp.$str25$term, args);
        final SubLObject category_arg = html_utilities.html_extract_input((SubLObject)cb_rtp.$str21$category, args);
        SubLObject mt = html_utilities.html_extract_input((SubLObject)cb_rtp.$str16$mt, args);
        SubLObject category = (SubLObject)cb_rtp.NIL;
        mt = constants_high.find_constant(mt);
        category = constants_high.find_constant(category_arg);
        final SubLObject title_var = (SubLObject)cb_rtp.$str29$Template_Match_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_rtp.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_rtp.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_rtp.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_rtp.$str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
            final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_rtp.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_rtp.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_rtp.$kw4$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_rtp.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_rtp.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_rtp.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_rtp.$str7$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_rtp.$str8$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_rtp.$str9$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_rtp.$str10$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_rtp.$str11$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            if (cb_rtp.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_rtp.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_rtp.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_rtp.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_rtp.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            if (cb_rtp.NIL != forts.fort_p(category)) {
                                final SubLObject templates = rtp_datastructures.get_templates_for_terminal(mt, category, v_term);
                                if (cb_rtp.NIL == templates) {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_rtp.TWO_INTEGER);
                                    html_utilities.html_princ((SubLObject)cb_rtp.$str30$Sorry__no_templates_of_category_);
                                    cb_utilities.cb_form(category, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_rtp.$str31$_contains_terminal_);
                                    html_utilities.html_prin1(v_term);
                                    html_utilities.html_newline((SubLObject)cb_rtp.TWO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                }
                                else {
                                    html_utilities.html_princ((SubLObject)cb_rtp.$str32$The_following_templates_of_catego);
                                    cb_utilities.cb_form(category, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_rtp.$str33$_contain_the_terminal_);
                                    html_utilities.html_prin1(v_term);
                                    html_utilities.html_newline((SubLObject)cb_rtp.TWO_INTEGER);
                                    SubLObject cdolist_list_var = templates;
                                    SubLObject template = (SubLObject)cb_rtp.NIL;
                                    template = cdolist_list_var.first();
                                    while (cb_rtp.NIL != cdolist_list_var) {
                                        html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                                        cb_assertion_browser.cb_show_support(rtp_datastructures.template_rule_assertion(template), (SubLObject)cb_rtp.UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        template = cdolist_list_var.first();
                                    }
                                }
                            }
                            else {
                                html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_rtp.$str34$Sorry__);
                                html_utilities.html_prin1(category);
                                html_utilities.html_princ((SubLObject)cb_rtp.$str35$_is_an_unknown_template_category_);
                                html_utilities.html_newline((SubLObject)cb_rtp.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_rtp.$str36$Please_enter_a_different_term___c);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$6, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_rtp.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/cb-rtp.lisp", position = 3581L)
    public static SubLObject cb_link_template_matching(SubLObject linktext) {
        if (linktext == cb_rtp.UNPROVIDED) {
            linktext = (SubLObject)cb_rtp.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_rtp.NIL == linktext) {
            linktext = (SubLObject)cb_rtp.$str38$TemplateMatch;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_rtp.$kw39$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_rtp.$str40$cb_template_matching);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
        if (cb_rtp.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_rtp.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/cb-rtp.lisp", position = 3918L)
    public static SubLObject cb_template_parsing(SubLObject args) {
        if (args == cb_rtp.UNPROVIDED) {
            args = (SubLObject)cb_rtp.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_rtp.$str46$Template_Parsing_Tool;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_rtp.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_rtp.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_rtp.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_rtp.$str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_rtp.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_rtp.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_rtp.$kw4$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_rtp.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_rtp.$kw5$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_rtp.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_rtp.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_rtp.$str7$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_rtp.$str8$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_rtp.$str9$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_rtp.$str10$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_rtp.$str11$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            if (cb_rtp.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_rtp.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_rtp.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_rtp.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_rtp.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_rtp.$str12$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        if (cb_rtp.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_rtp.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_rtp.$str47$cb_handle_template_parsing, (SubLObject)cb_rtp.T, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_rtp.$str48$Parse, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_rtp.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_rtp.$str49$Use_VP_Parser__);
                            html_utilities.html_checkbox_input((SubLObject)cb_rtp.$str50$vpp, (SubLObject)cb_rtp.$str51$_vpp, (SubLObject)cb_rtp.T, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_rtp.$str52$Return_Style__);
                            html_utilities.html_radio_input((SubLObject)cb_rtp.$str53$return_style, (SubLObject)cb_rtp.$str54$_simple, (SubLObject)cb_rtp.NIL, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_rtp.$str55$Normal);
                            html_utilities.html_radio_input((SubLObject)cb_rtp.$str53$return_style, (SubLObject)cb_rtp.$str56$_assertion, (SubLObject)cb_rtp.T, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_rtp.$str57$Assertion);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_rtp.$str58$Store_results_in_pipeline__);
                            html_utilities.html_checkbox_input((SubLObject)cb_rtp.$str59$store_in_pipeline, (SubLObject)cb_rtp.$str60$_pipeline, (SubLObject)cb_rtp.NIL, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_rtp.$str61$Sentence_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_script_utilities.html_clear_input_button((SubLObject)cb_rtp.$str62$sentence, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)cb_rtp.$str62$sentence, (SubLObject)cb_rtp.$str22$, (SubLObject)cb_rtp.$int63$80);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_rtp.$str20$Template_Category___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_script_utilities.html_clear_input_button((SubLObject)cb_rtp.$str21$category, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_complete.html_complete_button((SubLObject)cb_rtp.$str21$category, (SubLObject)cb_rtp.$str17$Complete, template_isa_filter_col(), (SubLObject)cb_rtp.NIL, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)cb_rtp.$str21$category, (SubLObject)cb_rtp.$str64$STemplate, (SubLObject)cb_rtp.$int23$40);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_rtp.$str15$Mt_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_script_utilities.html_clear_input_button((SubLObject)cb_rtp.$str16$mt, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_complete.html_complete_button((SubLObject)cb_rtp.$str16$mt, (SubLObject)cb_rtp.$str17$Complete, cb_rtp.$const18$Microtheory, (SubLObject)cb_rtp.NIL, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)cb_rtp.$str16$mt, (SubLObject)cb_rtp.$str65$RKFParsingMt, (SubLObject)cb_rtp.TWENTY_INTEGER);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$11, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_rtp.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/cb-rtp.lisp", position = 5472L)
    public static SubLObject cb_handle_template_parsing(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = html_utilities.html_extract_input((SubLObject)cb_rtp.$str62$sentence, args);
        final SubLObject category_arg = html_utilities.html_extract_input((SubLObject)cb_rtp.$str21$category, args);
        SubLObject mt = html_utilities.html_extract_input((SubLObject)cb_rtp.$str16$mt, args);
        final SubLObject vpp = html_utilities.html_extract_input((SubLObject)cb_rtp.$str50$vpp, args);
        final SubLObject pipelineP = html_utilities.html_extract_input((SubLObject)cb_rtp.$str59$store_in_pipeline, args);
        final SubLObject return_style = reader.read_from_string(html_utilities.html_extract_input((SubLObject)cb_rtp.$str53$return_style, args), (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
        SubLObject category = (SubLObject)cb_rtp.NIL;
        SubLObject parses = (SubLObject)cb_rtp.NIL;
        mt = constants_high.find_constant(mt);
        category = constants_high.find_constant(category_arg);
        final SubLObject title_var = (SubLObject)cb_rtp.$str67$Template_Parse_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_rtp.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_rtp.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_rtp.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_rtp.$str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_rtp.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_rtp.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_rtp.$kw4$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_rtp.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_rtp.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_rtp.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_rtp.$str7$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_rtp.$str8$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_rtp.$str9$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_rtp.$str10$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_rtp.$str11$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            if (cb_rtp.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_rtp.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_rtp.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_rtp.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_rtp.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                            if (cb_rtp.NIL != forts.fort_p(category)) {
                                final SubLObject _prev_bind_0_$21 = parsing_vars.$perform_vp_parser_expansion$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$22 = rtp_vars.$rtp_return_style$.currentBinding(thread);
                                try {
                                    parsing_vars.$perform_vp_parser_expansion$.bind(vpp, thread);
                                    rtp_vars.$rtp_return_style$.bind(return_style, thread);
                                    parses = iterative_template_parser.rtp_parse_exp(sentence, category, mt, (SubLObject)cb_rtp.UNPROVIDED);
                                    if (cb_rtp.NIL == parses) {
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_newline((SubLObject)cb_rtp.TWO_INTEGER);
                                        html_utilities.html_princ((SubLObject)cb_rtp.$str68$Sorry__no_parses_for_);
                                        cb_utilities.cb_form(sentence, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                                        html_utilities.html_princ((SubLObject)cb_rtp.$str69$_of_category_);
                                        cb_utilities.cb_form(category, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                                        html_utilities.html_princ((SubLObject)cb_rtp.$str70$_were_found_);
                                        html_utilities.html_newline((SubLObject)cb_rtp.TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    }
                                    else {
                                        html_utilities.html_princ(PrintLow.format((SubLObject)cb_rtp.NIL, (SubLObject)cb_rtp.$str71$Sentence_parsed___S, sentence));
                                        html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                                        html_utilities.html_princ((SubLObject)cb_rtp.$str72$Root_category_of_parses__);
                                        cb_utilities.cb_form(category, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
                                        html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                                        format_parses_for_browser(parses, return_style, sentence);
                                        html_utilities.html_newline((SubLObject)cb_rtp.TWO_INTEGER);
                                    }
                                }
                                finally {
                                    rtp_vars.$rtp_return_style$.rebind(_prev_bind_1_$22, thread);
                                    parsing_vars.$perform_vp_parser_expansion$.rebind(_prev_bind_0_$21, thread);
                                }
                            }
                            else {
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_rtp.$str73$__Sorry___S_is_an_unknown_templat, category);
                                html_utilities.html_newline((SubLObject)cb_rtp.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_rtp.$str74$Please_enter_a_different_sentence);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$16, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_rtp.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/cb-rtp.lisp", position = 7159L)
    public static SubLObject format_parses_for_browser(final SubLObject parses, final SubLObject return_style, SubLObject sentence) {
        if (sentence == cb_rtp.UNPROVIDED) {
            sentence = (SubLObject)cb_rtp.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (return_style != cb_rtp.$kw76$ASSERTION) {
            html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            cb_utilities.cb_form(parses, (SubLObject)cb_rtp.ZERO_INTEGER, (SubLObject)cb_rtp.T);
            html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            return (SubLObject)cb_rtp.$kw77$DONE;
        }
        final SubLObject result_iterator = rtp_iterators.new_itp_result_iterator(parses, (SubLObject)cb_rtp.UNPROVIDED, (SubLObject)cb_rtp.UNPROVIDED);
        final SubLObject tokenized_sentence = rkf_concept_harvester.rkf_ch_string_tokenize(sentence);
        SubLObject section_iterator = (SubLObject)cb_rtp.NIL;
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_rtp.ONE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
            while (cb_rtp.NIL == rtp_iterators.itp_result_iterator_doneP(result_iterator)) {
                section_iterator = rtp_iterators.itp_result_iterator_curr(result_iterator);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_rtp.NIL != html_macros.$html_color_yellowish_gray$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_yellowish_gray$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_rtp.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_rtp.$kw78$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                        final SubLObject span = rtp_iterators.itp_section_iterator_curr_span(section_iterator);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ(PrintLow.format((SubLObject)cb_rtp.NIL, (SubLObject)cb_rtp.$str79$Parses_for__s__spanning__A_, string_utilities.bunge(Sequences.subseq(tokenized_sentence, span.first(), Numbers.add((SubLObject)cb_rtp.ONE_INTEGER, conses_high.last(span, (SubLObject)cb_rtp.UNPROVIDED).first())), (SubLObject)cb_rtp.UNPROVIDED), span));
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_rtp.NIL != html_macros.$html_color_lighter_grey$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_rtp.$kw78$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                    final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_rtp.$str80$CycL);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_rtp.$kw78$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_rtp.$str81$Supports);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    while (cb_rtp.NIL == rtp_iterators.itp_section_iterator_doneP(section_iterator)) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_rtp.$kw82$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_rtp.$kw83$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                                cb_utilities.cb_form(rtp_iterators.itp_section_iterator_curr_cycl(section_iterator), (SubLObject)cb_rtp.ZERO_INTEGER, (SubLObject)cb_rtp.T);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_rtp.$kw82$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_rtp.$kw83$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
                            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
                                format_assertions_from_section(section_iterator);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
                        rtp_iterators.itp_section_iterator_next(section_iterator);
                    }
                    rtp_iterators.itp_result_iterator_next(result_iterator);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtp.UNPROVIDED);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_rtp.$kw77$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/cb-rtp.lisp", position = 8834L)
    public static SubLObject format_assertions_from_section(final SubLObject section_iterator) {
        final SubLObject asserts = rtp_iterators.itp_section_iterator_curr_assertion(section_iterator);
        if (asserts.isAtom()) {
            cb_utilities.cb_form(asserts, (SubLObject)cb_rtp.ZERO_INTEGER, (SubLObject)cb_rtp.T);
            return (SubLObject)cb_rtp.$kw77$DONE;
        }
        if (asserts.isList()) {
            SubLObject cdolist_list_var = asserts;
            SubLObject v_assert = (SubLObject)cb_rtp.NIL;
            v_assert = cdolist_list_var.first();
            while (cb_rtp.NIL != cdolist_list_var) {
                if (cb_rtp.NIL == assertion_handles.assertion_p(v_assert)) {
                    html_utilities.html_princ((SubLObject)cb_rtp.$str84$Component_Parser_parses_for_);
                }
                cb_utilities.cb_form(v_assert, (SubLObject)cb_rtp.ZERO_INTEGER, (SubLObject)cb_rtp.T);
                html_utilities.html_newline((SubLObject)cb_rtp.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                v_assert = cdolist_list_var.first();
            }
            return (SubLObject)cb_rtp.$kw77$DONE;
        }
        return (SubLObject)cb_rtp.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/cb-rtp.lisp", position = 9403L)
    public static SubLObject cb_link_template_parsing(SubLObject linktext) {
        if (linktext == cb_rtp.UNPROVIDED) {
            linktext = (SubLObject)cb_rtp.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_rtp.NIL == linktext) {
            linktext = (SubLObject)cb_rtp.$str85$TemplateParsing;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_rtp.$kw39$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_rtp.$str86$cb_template_parsing);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
        if (cb_rtp.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtp.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtp.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_rtp.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_rtp.NIL;
    }
    
    public static SubLObject declare_cb_rtp_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.cb_rtp", "cb_template_matching", "CB-TEMPLATE-MATCHING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.cb_rtp", "template_isa_filter_col", "TEMPLATE-ISA-FILTER-COL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.cb_rtp", "cb_handle_template_matching", "CB-HANDLE-TEMPLATE-MATCHING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.cb_rtp", "cb_link_template_matching", "CB-LINK-TEMPLATE-MATCHING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.cb_rtp", "cb_template_parsing", "CB-TEMPLATE-PARSING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.cb_rtp", "cb_handle_template_parsing", "CB-HANDLE-TEMPLATE-PARSING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.cb_rtp", "format_parses_for_browser", "FORMAT-PARSES-FOR-BROWSER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.cb_rtp", "format_assertions_from_section", "FORMAT-ASSERTIONS-FROM-SECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.cb_rtp", "cb_link_template_parsing", "CB-LINK-TEMPLATE-PARSING", 0, 1, false);
        return (SubLObject)cb_rtp.NIL;
    }
    
    public static SubLObject init_cb_rtp_file() {
        return (SubLObject)cb_rtp.NIL;
    }
    
    public static SubLObject setup_cb_rtp_file() {
        html_macros.note_cgi_handler_function((SubLObject)cb_rtp.$sym26$CB_TEMPLATE_MATCHING, (SubLObject)cb_rtp.$kw27$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_rtp.$sym37$CB_HANDLE_TEMPLATE_MATCHING, (SubLObject)cb_rtp.$kw27$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_rtp.$kw41$TEMPLATE_MATCHING, (SubLObject)cb_rtp.$sym42$CB_LINK_TEMPLATE_MATCHING, (SubLObject)cb_rtp.ONE_INTEGER);
        cb_utilities.declare_deprecated_cb_tool((SubLObject)cb_rtp.$kw41$TEMPLATE_MATCHING, (SubLObject)cb_rtp.$str43$Template_Match, (SubLObject)cb_rtp.$str44$TmpltM, (SubLObject)cb_rtp.$str45$Template_by_Term_Matcher);
        html_macros.note_cgi_handler_function((SubLObject)cb_rtp.$sym66$CB_TEMPLATE_PARSING, (SubLObject)cb_rtp.$kw27$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_rtp.$sym75$CB_HANDLE_TEMPLATE_PARSING, (SubLObject)cb_rtp.$kw27$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_rtp.$kw87$TEMPLATE_PARSING, (SubLObject)cb_rtp.$sym88$CB_LINK_TEMPLATE_PARSING, (SubLObject)cb_rtp.ONE_INTEGER);
        cb_utilities.declare_deprecated_cb_tool((SubLObject)cb_rtp.$kw87$TEMPLATE_PARSING, (SubLObject)cb_rtp.$str89$Template_Parse, (SubLObject)cb_rtp.$str90$RTP, (SubLObject)cb_rtp.$str91$Parsing_via_template_parser);
        return (SubLObject)cb_rtp.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_rtp_file();
    }
    
    public void initializeVariables() {
        init_cb_rtp_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_rtp_file();
    }
    
    static {
        me = (SubLFile)new cb_rtp();
        $str0$Template_Matching_Tool = SubLObjectFactory.makeString("Template Matching Tool");
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
        $str13$cb_handle_template_matching = SubLObjectFactory.makeString("cb-handle-template-matching");
        $str14$Search = SubLObjectFactory.makeString("Search");
        $str15$Mt_ = SubLObjectFactory.makeString("Mt:");
        $str16$mt = SubLObjectFactory.makeString("mt");
        $str17$Complete = SubLObjectFactory.makeString("Complete");
        $const18$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $str19$AnthraxTemplateMt = SubLObjectFactory.makeString("AnthraxTemplateMt");
        $str20$Template_Category___ = SubLObjectFactory.makeString("Template Category : ");
        $str21$category = SubLObjectFactory.makeString("category");
        $str22$ = SubLObjectFactory.makeString("");
        $int23$40 = SubLObjectFactory.makeInteger(40);
        $str24$Template_terminal___ = SubLObjectFactory.makeString("Template terminal : ");
        $str25$term = SubLObjectFactory.makeString("term");
        $sym26$CB_TEMPLATE_MATCHING = SubLObjectFactory.makeSymbol("CB-TEMPLATE-MATCHING");
        $kw27$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $const28$LinguisticObjectType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LinguisticObjectType"));
        $str29$Template_Match_Results = SubLObjectFactory.makeString("Template Match Results");
        $str30$Sorry__no_templates_of_category_ = SubLObjectFactory.makeString("Sorry, no templates of category ");
        $str31$_contains_terminal_ = SubLObjectFactory.makeString(" contains terminal ");
        $str32$The_following_templates_of_catego = SubLObjectFactory.makeString("The following templates of category ");
        $str33$_contain_the_terminal_ = SubLObjectFactory.makeString(" contain the terminal ");
        $str34$Sorry__ = SubLObjectFactory.makeString("Sorry, ");
        $str35$_is_an_unknown_template_category_ = SubLObjectFactory.makeString(" is an unknown template category.");
        $str36$Please_enter_a_different_term___c = SubLObjectFactory.makeString("Please enter a different term / category combination.");
        $sym37$CB_HANDLE_TEMPLATE_MATCHING = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-MATCHING");
        $str38$TemplateMatch = SubLObjectFactory.makeString("TemplateMatch");
        $kw39$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str40$cb_template_matching = SubLObjectFactory.makeString("cb-template-matching");
        $kw41$TEMPLATE_MATCHING = SubLObjectFactory.makeKeyword("TEMPLATE-MATCHING");
        $sym42$CB_LINK_TEMPLATE_MATCHING = SubLObjectFactory.makeSymbol("CB-LINK-TEMPLATE-MATCHING");
        $str43$Template_Match = SubLObjectFactory.makeString("Template Match");
        $str44$TmpltM = SubLObjectFactory.makeString("TmpltM");
        $str45$Template_by_Term_Matcher = SubLObjectFactory.makeString("Template by Term Matcher");
        $str46$Template_Parsing_Tool = SubLObjectFactory.makeString("Template Parsing Tool");
        $str47$cb_handle_template_parsing = SubLObjectFactory.makeString("cb-handle-template-parsing");
        $str48$Parse = SubLObjectFactory.makeString("Parse");
        $str49$Use_VP_Parser__ = SubLObjectFactory.makeString("Use VP-Parser: ");
        $str50$vpp = SubLObjectFactory.makeString("vpp");
        $str51$_vpp = SubLObjectFactory.makeString(":vpp");
        $str52$Return_Style__ = SubLObjectFactory.makeString("Return Style: ");
        $str53$return_style = SubLObjectFactory.makeString("return-style");
        $str54$_simple = SubLObjectFactory.makeString(":simple");
        $str55$Normal = SubLObjectFactory.makeString("Normal");
        $str56$_assertion = SubLObjectFactory.makeString(":assertion");
        $str57$Assertion = SubLObjectFactory.makeString("Assertion");
        $str58$Store_results_in_pipeline__ = SubLObjectFactory.makeString("Store results in pipeline: ");
        $str59$store_in_pipeline = SubLObjectFactory.makeString("store-in-pipeline");
        $str60$_pipeline = SubLObjectFactory.makeString(":pipeline");
        $str61$Sentence_ = SubLObjectFactory.makeString("Sentence:");
        $str62$sentence = SubLObjectFactory.makeString("sentence");
        $int63$80 = SubLObjectFactory.makeInteger(80);
        $str64$STemplate = SubLObjectFactory.makeString("STemplate");
        $str65$RKFParsingMt = SubLObjectFactory.makeString("RKFParsingMt");
        $sym66$CB_TEMPLATE_PARSING = SubLObjectFactory.makeSymbol("CB-TEMPLATE-PARSING");
        $str67$Template_Parse_Results = SubLObjectFactory.makeString("Template Parse Results");
        $str68$Sorry__no_parses_for_ = SubLObjectFactory.makeString("Sorry, no parses for ");
        $str69$_of_category_ = SubLObjectFactory.makeString(" of category ");
        $str70$_were_found_ = SubLObjectFactory.makeString(" were found.");
        $str71$Sentence_parsed___S = SubLObjectFactory.makeString("Sentence parsed: ~S");
        $str72$Root_category_of_parses__ = SubLObjectFactory.makeString("Root category of parses: ");
        $str73$__Sorry___S_is_an_unknown_templat = SubLObjectFactory.makeString("~%Sorry, ~S is an unknown template category.~%");
        $str74$Please_enter_a_different_sentence = SubLObjectFactory.makeString("Please enter a different sentence / category combination.");
        $sym75$CB_HANDLE_TEMPLATE_PARSING = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-PARSING");
        $kw76$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw77$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw78$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str79$Parses_for__s__spanning__A_ = SubLObjectFactory.makeString("Parses for ~s, spanning ~A ");
        $str80$CycL = SubLObjectFactory.makeString("CycL");
        $str81$Supports = SubLObjectFactory.makeString("Supports");
        $kw82$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw83$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str84$Component_Parser_parses_for_ = SubLObjectFactory.makeString("Component Parser parses for ");
        $str85$TemplateParsing = SubLObjectFactory.makeString("TemplateParsing");
        $str86$cb_template_parsing = SubLObjectFactory.makeString("cb-template-parsing");
        $kw87$TEMPLATE_PARSING = SubLObjectFactory.makeKeyword("TEMPLATE-PARSING");
        $sym88$CB_LINK_TEMPLATE_PARSING = SubLObjectFactory.makeSymbol("CB-LINK-TEMPLATE-PARSING");
        $str89$Template_Parse = SubLObjectFactory.makeString("Template Parse");
        $str90$RTP = SubLObjectFactory.makeString("RTP");
        $str91$Parsing_via_template_parser = SubLObjectFactory.makeString("Parsing via template parser");
    }
}

/*

	Total time: 398 ms
	
*/