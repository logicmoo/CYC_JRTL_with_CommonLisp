package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_term_browser;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_naut_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_naut_utilities";
    public static final String myFingerPrint = "342aa704c39b4fcd2296ef756377db7a67083e6e30fb7b09daeab6a8ec412e98";
    private static final SubLString $str0$NAUT;
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
    private static final SubLSymbol $kw12$KBQ_ASK;
    private static final SubLSymbol $kw13$KBQ_ASK_IN_PROOF_CHECKER;
    private static final SubLSymbol $kw14$KBQ_EDIT;
    private static final SubLSymbol $sym15$INDEX_BROWSER;
    private static final SubLSymbol $kw16$CYCL;
    private static final SubLSymbol $kw17$DOCUMENTATION;
    private static final SubLSymbol $kw18$DEFINITIONAL;
    private static final SubLSymbol $kw19$HANDLER;
    private static final SubLSymbol $sym20$CB_C_PERTINENT_QUERY_LINKS;
    private static final SubLSymbol $kw21$ARGS;
    private static final SubLString $str22$term;
    private static final SubLSymbol $kw23$MESSAGE;
    private static final SubLString $str24$Checking_for_Pertinent_Queries___;
    private static final SubLSymbol $kw25$TAG;
    private static final SubLString $str26$div;
    private static final SubLSymbol $kw27$DELAY;
    private static final SubLInteger $int28$50;
    private static final SubLSymbol $kw29$SKSI_EXTERNAL_TERM_GAF_ARGUMENT;
    private static final SubLSymbol $kw30$SKSI_EXTERNAL_TERM_PREDICATE_EXTENT;
    private static final SubLSymbol $kw31$NONE;
    private static final SubLString $str32$Definitional_and_Documentation_In;
    private static final SubLString $str33$Refresh;
    private static final SubLString $str34$reloadCurrentFrame__reloadFrameBu;
    private static final SubLString $str35$Documentation_for_NAUT__;
    private static final SubLString $str36$___;
    private static final SubLString $str37$Derived_SBHL_Assertions_;
    private static final SubLString $str38$Mt__;
    private static final SubLObject $const39$UniversalVocabularyMt;
    private static final SubLObject $const40$isa;
    private static final SubLObject $const41$genls;
    private static final SubLString $str42$Definitional_info_for__A;
    private static final SubLString $str43$Corresponding_Cyc_terms_;
    private static final SubLList $list44;
    private static final SubLString $str45$External_Assertions_;
    private static final SubLString $str46$Definitional_Information_for_NAUT;
    private static final SubLString $str47$Corresponding_HL_NART__;
    private static final SubLObject $const48$functionCorrespondingPredicate_Ca;
    private static final SubLList $list49;
    private static final SubLString $str50$Corresponding_formula_via___funct;
    private static final SubLSymbol $sym51$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const52$EverythingPSC;
    private static final SubLString $str53$_ff0000;
    private static final SubLString $str54$_NOT_STRICTLY_WFF_;
    private static final SubLString $str55$KB_Assertions_;
    private static final SubLObject $const56$salientAssertions;
    private static final SubLSymbol $kw57$GAF_ARG_NAUT;
    private static final SubLSymbol $kw58$OTHER_NAUT;
    private static final SubLList $list59;
    private static final SubLString $str60$Could_not_determine_a_NAUT_from__;
    private static final SubLString $str61$Could_not_determine_an_arg_from__;
    private static final SubLString $str62$Could_not_determine_a_term_from__;
    private static final SubLString $str63$Could_not_determine_a_microtheory;
    private static final SubLString $str64$GAF_index_for__S;
    private static final SubLSymbol $sym65$CB_C_GAF_ARG_NAUT;
    private static final SubLSymbol $kw66$HTML_HANDLER;
    private static final SubLSymbol $kw67$CONTENT;
    private static final SubLString $str68$cb_c_gaf_arg_naut__A;
    private static final SubLString $str69$__a;
    private static final SubLString $str70$Arg__a;
    private static final SubLString $str71$All_GAFs;
    private static final SubLString $str72$___a_;
    private static final SubLSymbol $sym73$CB_LINK_GAF_ARG_NAUT;
    private static final SubLSymbol $kw74$HTML;
    private static final SubLSymbol $kw75$NEW;
    private static final SubLString $str76$Got_invalid_args_ARGNUM___A__PRED;
    private static final SubLSymbol $sym77$INDEXED_TERM_P;
    private static final SubLList $list78;
    private static final SubLString $str79$OTHER_index_for__A;
    private static final SubLSymbol $sym80$CB_C_OTHER_NAUT;
    private static final SubLString $str81$cb_c_other_naut__A;
    private static final SubLString $str82$Miscellaneous;
    private static final SubLSymbol $sym83$CB_LINK_OTHER_NAUT;
    private static final SubLString $str84$Miscellaneous_References_;
    private static final SubLSymbol $sym85$CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY;
    private static final SubLSymbol $sym86$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY;
    private static final SubLSymbol $sym87$CB_ASSERTION_LINK_WITH_MT;
    private static final SubLSymbol $sym88$CB_ASSERTION_LINK;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 859L)
    public static SubLObject cb_naut_index(final SubLObject index_hook) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_naut_utilities.$str0$NAUT;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_naut_utilities.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_naut_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_naut_utilities.$str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_naut_utilities.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_naut_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_naut_utilities.$kw4$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_naut_utilities.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_naut_utilities.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_naut_utilities.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_naut_utilities.$str7$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_naut_utilities.$str8$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str9$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str10$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_naut_utilities.$str11$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            if (cb_naut_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_naut_utilities.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        }
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        final SubLObject _prev_bind_0_$5 = dhtml_macros.$html_element_id$.currentBinding(thread);
                        try {
                            dhtml_macros.$html_element_id$.bind((SubLObject)cb_naut_utilities.ZERO_INTEGER, thread);
                            dhtml_macros.basic_ajax_scripts();
                            html_utilities.html_markup(dhtml_macros.$js_load_later$.getGlobalValue());
                            cb_naut_index_guts(index_hook);
                        }
                        finally {
                            dhtml_macros.$html_element_id$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 1106L)
    public static SubLObject cb_naut_term_toolbar(final SubLObject naut) {
        if (cb_naut_utilities.NIL != kb_query.kbq_query_spec_p(naut)) {
            html_utilities.html_indent((SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw12$KBQ_ASK, naut, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            if (cb_naut_utilities.NIL != cb_kb_query.kbq_query_practice_rules(naut)) {
                html_utilities.html_indent((SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw13$KBQ_ASK_IN_PROOF_CHECKER, naut, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            html_utilities.html_indent((SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw14$KBQ_EDIT, naut, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            html_utilities.html_hr((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 1490L)
    public static SubLObject cb_naut_index_guts(final SubLObject index_hook) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_naut_utilities.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            final SubLObject _prev_bind_0_$6 = cb_utilities.$cb_inside_quoteP$.currentBinding(thread);
            try {
                cb_utilities.$cb_inside_quoteP$.bind((SubLObject)cb_naut_utilities.T, thread);
                cb_browser.cb_term_page_heading(index_hook, (SubLObject)cb_naut_utilities.$sym15$INDEX_BROWSER);
            }
            finally {
                cb_utilities.$cb_inside_quoteP$.rebind(_prev_bind_0_$6, thread);
            }
            html_utilities.html_hr((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            if (cb_naut_utilities.NIL != narts_high.naut_p(index_hook)) {
                cb_naut_term_toolbar(index_hook);
                if (cb_naut_utilities.$kw16$CYCL == control_vars.$cb_major_presentation_language$.getDynamicValue(thread)) {
                    cb_browser.cb_c_el_hl_formulas_link(index_hook);
                }
                html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_utilities.html_indent((SubLObject)cb_naut_utilities.ZERO_INTEGER);
                cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw17$DOCUMENTATION, index_hook, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_utilities.html_indent((SubLObject)cb_naut_utilities.ZERO_INTEGER);
                cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw18$DEFINITIONAL, index_hook, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                dhtml_macros.js_delayed_load_int((SubLObject)ConsesLow.list(new SubLObject[] { cb_naut_utilities.$kw19$HANDLER, cb_naut_utilities.$sym20$CB_C_PERTINENT_QUERY_LINKS, cb_naut_utilities.$kw21$ARGS, ConsesLow.list(reader.bq_cons((SubLObject)cb_naut_utilities.$str22$term, index_hook)), cb_naut_utilities.$kw23$MESSAGE, cb_naut_utilities.$str24$Checking_for_Pertinent_Queries___, cb_naut_utilities.$kw25$TAG, cb_naut_utilities.$str26$div, cb_naut_utilities.$kw27$DELAY, cb_naut_utilities.$int28$50 }));
            }
            html_utilities.html_hr((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            cb_browser.cb_c_index_kb_assertions_guts(index_hook);
            if (cb_naut_utilities.NIL != sksi_external_term_browser.sksi_supported_external_gaf_argument_termP(index_hook)) {
                html_utilities.html_hr((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw29$SKSI_EXTERNAL_TERM_GAF_ARGUMENT, index_hook, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                sksi_external_term_browser.display_sksi_supported_gaf_argument_positions_for_external_term(index_hook);
            }
            if (cb_naut_utilities.NIL != sksi_external_term_browser.sksi_supported_external_predicate_termP(index_hook)) {
                html_utilities.html_hr((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw30$SKSI_EXTERNAL_TERM_PREDICATE_EXTENT, index_hook, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            }
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 3589L)
    public static SubLObject cb_default_naut_content_internal(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_parameters.$cb_c_default_content$.getDynamicValue(thread) == cb_naut_utilities.$kw31$NONE) {
            return cb_frames.cb_empty_content_frame(naut);
        }
        cb_c_naut_info(naut);
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 3771L)
    public static SubLObject cb_c_naut_info(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var;
        final SubLObject title = title_var = PrintLow.format((SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.$str32$Definitional_and_Documentation_In, naut);
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_naut_utilities.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_naut_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_naut_utilities.$str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_naut_utilities.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_naut_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_naut_utilities.$kw4$CB_CYC);
                if (cb_naut_utilities.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                dhtml_macros.html_basic_cb_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_naut_utilities.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_naut_utilities.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_naut_utilities.$str7$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_naut_utilities.$str8$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str9$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str10$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_naut_utilities.$str33$Refresh);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str34$reloadCurrentFrame__reloadFrameBu);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            if (cb_naut_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        cb_browser.cb_c_term_header(naut);
                        html_utilities.html_br();
                        html_utilities.html_br();
                        cb_print_definitional_information_naut(naut);
                        html_utilities.html_br();
                        html_utilities.html_hr((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_br();
                        cb_print_documentation_information_naut(naut);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 4184L)
    public static SubLObject html_title_for_term(final SubLObject title, final SubLObject v_term, SubLObject size, SubLObject extra_newline) {
        if (size == cb_naut_utilities.UNPROVIDED) {
            size = (SubLObject)cb_naut_utilities.FOUR_INTEGER;
        }
        if (extra_newline == cb_naut_utilities.UNPROVIDED) {
            extra_newline = (SubLObject)cb_naut_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        SubLObject size_val = size;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_naut_utilities.NIL != size_val) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(size_val);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
            html_utilities.html_princ(title);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_br();
        if (cb_naut_utilities.NIL != v_term) {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            size_val = (SubLObject)(size.numE((SubLObject)cb_naut_utilities.ONE_INTEGER) ? cb_naut_utilities.ONE_INTEGER : Numbers.subtract(size, (SubLObject)cb_naut_utilities.ONE_INTEGER));
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_naut_utilities.NIL != size_val) {
                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup(size_val);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_form(v_term, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_br();
        }
        if (cb_naut_utilities.NIL != extra_newline) {
            html_utilities.html_br();
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 4544L)
    public static SubLObject cb_print_documentation_information_naut(final SubLObject naut) {
        html_title_for_term((SubLObject)cb_naut_utilities.$str35$Documentation_for_NAUT__, naut, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
        final SubLObject function = cycl_utilities.formula_operator_recursive(naut);
        if (cb_naut_utilities.NIL != forts.fort_p(function)) {
            cb_browser.cb_c_documentation_internal_guts(function);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 4815L)
    public static SubLObject htmlize_derived_naut_definitional_info_int(final SubLObject items, final SubLObject pred) {
        if (cb_naut_utilities.NIL != items) {
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            cb_utilities.cb_form(pred, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_naut_utilities.$str36$___);
            SubLObject cdolist_list_var = items;
            SubLObject item = (SubLObject)cb_naut_utilities.NIL;
            item = cdolist_list_var.first();
            while (cb_naut_utilities.NIL != cdolist_list_var) {
                cb_utilities.cb_form(item, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_naut_utilities.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 5058L)
    public static SubLObject htmlize_derived_naut_definitional_info(final SubLObject naut, final SubLObject preds) {
        html_utilities.html_br();
        html_title_for_term((SubLObject)cb_naut_utilities.$str37$Derived_SBHL_Assertions_, (SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.FOUR_INTEGER, (SubLObject)cb_naut_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_naut_utilities.$str38$Mt__);
        cb_utilities.cb_form(cb_naut_utilities.$const39$UniversalVocabularyMt, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
        if (cb_naut_utilities.NIL != subl_promotions.memberP(cb_naut_utilities.$const40$isa, preds, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED)) {
            final SubLObject isas = isa.min_isa(naut, cb_naut_utilities.$const39$UniversalVocabularyMt, (SubLObject)cb_naut_utilities.UNPROVIDED);
            htmlize_derived_naut_definitional_info_int(isas, cb_naut_utilities.$const40$isa);
        }
        if (cb_naut_utilities.NIL != subl_promotions.memberP(cb_naut_utilities.$const41$genls, preds, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED)) {
            final SubLObject v_genls = genls.min_genls(naut, cb_naut_utilities.$const39$UniversalVocabularyMt, (SubLObject)cb_naut_utilities.UNPROVIDED);
            htmlize_derived_naut_definitional_info_int(v_genls, cb_naut_utilities.$const41$genls);
        }
        html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 5653L)
    public static SubLObject cb_c_definitional_internal_naut(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var;
        final SubLObject title = title_var = PrintLow.format((SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.$str42$Definitional_info_for__A, naut);
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_naut_utilities.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_naut_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_naut_utilities.$str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_naut_utilities.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_naut_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_naut_utilities.$kw4$CB_CYC);
                if (cb_naut_utilities.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                dhtml_macros.html_basic_cb_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_naut_utilities.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_naut_utilities.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_naut_utilities.$str7$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_naut_utilities.$str8$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str9$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str10$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_naut_utilities.$str33$Refresh);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str34$reloadCurrentFrame__reloadFrameBu);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            if (cb_naut_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        cb_print_definitional_information_naut(naut);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$11, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 5889L)
    public static SubLObject display_cyc_terms_for_sksi_external_term_naut(final SubLObject naut) {
        final SubLObject cyc_terms = sksi_kb_accessors.cyc_terms_for_sksi_external_term_naut(naut);
        if (cb_naut_utilities.NIL != cyc_terms) {
            html_title_for_term((SubLObject)cb_naut_utilities.$str43$Corresponding_Cyc_terms_, (SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.FOUR_INTEGER, (SubLObject)cb_naut_utilities.NIL);
            SubLObject cdolist_list_var = cyc_terms;
            SubLObject v_term = (SubLObject)cb_naut_utilities.NIL;
            v_term = cdolist_list_var.first();
            while (cb_naut_utilities.NIL != cdolist_list_var) {
                cb_utilities.cb_form(v_term, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_naut_utilities.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
            html_utilities.html_newline((SubLObject)cb_naut_utilities.TWO_INTEGER);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 6309L)
    public static SubLObject display_external_definitional_information_for_naut(final SubLObject naut, final SubLObject preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject functor = cycl_utilities.nat_functor(naut);
        final SubLObject _prev_bind_0 = cb_parameters.$cb_c_gaf_arg_last_mt$.currentBinding(thread);
        try {
            cb_parameters.$cb_c_gaf_arg_last_mt$.bind((SubLObject)cb_naut_utilities.NIL, thread);
            if (cb_naut_utilities.NIL != subl_promotions.memberP(functor, (SubLObject)cb_naut_utilities.$list44, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED)) {
                html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
                html_title_for_term((SubLObject)cb_naut_utilities.$str45$External_Assertions_, (SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.FOUR_INTEGER, (SubLObject)cb_naut_utilities.NIL);
                html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
                final SubLObject visible_mt = sksi_external_term_browser.mt_for_external_term(naut);
                SubLObject cdolist_list_var = preds;
                SubLObject pred = (SubLObject)cb_naut_utilities.NIL;
                pred = cdolist_list_var.first();
                while (cb_naut_utilities.NIL != cdolist_list_var) {
                    if (cb_naut_utilities.NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate(sksi_external_term_browser.sksi_supported_external_term_logical_schema(naut), (SubLObject)cb_naut_utilities.ONE_INTEGER, pred, visible_mt)) {
                        sksi_external_gaf_argument_browser.sksi_external_gaf_argument_internal(naut, (SubLObject)cb_naut_utilities.ONE_INTEGER, pred, (SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.T, visible_mt);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                }
            }
        }
        finally {
            cb_parameters.$cb_c_gaf_arg_last_mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 6996L)
    public static SubLObject cb_print_definitional_information_naut(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_title_for_term((SubLObject)cb_naut_utilities.$str46$Definitional_Information_for_NAUT, naut, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
        final SubLObject corresponding_nart = narts_high.find_nart(naut);
        SubLObject type = (SubLObject)cb_naut_utilities.NIL;
        final SubLObject _prev_bind_0 = cb_viewpoint.$cb_use_mts_filter$.currentBinding(thread);
        try {
            cb_viewpoint.$cb_use_mts_filter$.bind((SubLObject)cb_naut_utilities.NIL, thread);
            if (cb_naut_utilities.NIL != nart_handles.nart_p(corresponding_nart)) {
                html_title_for_term((SubLObject)cb_naut_utilities.$str47$Corresponding_HL_NART__, corresponding_nart, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
            }
            else if (cb_naut_utilities.NIL != kb_indexing_datastructures.indexed_term_p(narts_high.nart_substitute(cycl_utilities.nat_functor(naut)))) {
                final SubLObject corresponding_fn_canons = kb_mapping_utilities.pred_value_tuples_in_any_mt(narts_high.nart_substitute(cycl_utilities.nat_functor(naut)), cb_naut_utilities.$const48$functionCorrespondingPredicate_Ca, (SubLObject)cb_naut_utilities.ONE_INTEGER, (SubLObject)cb_naut_utilities.$list49, (SubLObject)cb_naut_utilities.UNPROVIDED);
                if (cb_naut_utilities.NIL != corresponding_fn_canons) {
                    html_title_for_term((SubLObject)cb_naut_utilities.$str50$Corresponding_formula_via___funct, (SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.FOUR_INTEGER, (SubLObject)cb_naut_utilities.NIL);
                    SubLObject cdolist_list_var = corresponding_fn_canons;
                    SubLObject corresponding_fn_canon = (SubLObject)cb_naut_utilities.NIL;
                    corresponding_fn_canon = cdolist_list_var.first();
                    while (cb_naut_utilities.NIL != cdolist_list_var) {
                        final SubLObject corresponding_fn_canon_pred = corresponding_fn_canon.first();
                        final SubLObject corresponding_fn_canon_pos = conses_high.second(corresponding_fn_canon);
                        SubLObject corresponding_formula = ConsesLow.append((SubLObject)ConsesLow.list(corresponding_fn_canon_pred), conses_high.copy_list(cycl_utilities.nat_args(naut, (SubLObject)cb_naut_utilities.UNPROVIDED)));
                        corresponding_formula = list_utilities.ninsert_by_position(conses_high.copy_list(naut), corresponding_formula, corresponding_fn_canon_pos);
                        final SubLObject _prev_bind_0_$15 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_naut_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(cb_naut_utilities.$const52$EverythingPSC, thread);
                            if (cb_naut_utilities.NIL == wff.el_strictly_wffP(corresponding_formula, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED)) {
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_naut_utilities.$str53$_ff0000));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_naut_utilities.$str54$_NOT_STRICTLY_WFF_);
                                    html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$15, thread);
                        }
                        cb_utilities.cb_form(corresponding_formula, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_naut_utilities.TWO_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        corresponding_fn_canon = cdolist_list_var.first();
                    }
                }
            }
            display_cyc_terms_for_sksi_external_term_naut(naut);
            final SubLObject _prev_bind_0_$17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_naut_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(cb_naut_utilities.$const52$EverythingPSC, thread);
                type = kb_utilities.definitional_type_for_naut(naut);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$17, thread);
            }
            cb_browser.cb_c_gaf_arg_header((SubLObject)cb_naut_utilities.ONE_INTEGER);
            final SubLObject _prev_bind_0_$18 = cb_parameters.$cb_c_gaf_arg_last_mt$.currentBinding(thread);
            try {
                cb_parameters.$cb_c_gaf_arg_last_mt$.bind((SubLObject)cb_naut_utilities.NIL, thread);
                final SubLObject preds = cb_utilities.cb_definitional_preds_for_type(type);
                htmlize_derived_naut_definitional_info(naut, preds);
                html_title_for_term((SubLObject)cb_naut_utilities.$str55$KB_Assertions_, (SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.FOUR_INTEGER, (SubLObject)cb_naut_utilities.NIL);
                SubLObject cdolist_list_var2 = preds;
                SubLObject pred = (SubLObject)cb_naut_utilities.NIL;
                pred = cdolist_list_var2.first();
                while (cb_naut_utilities.NIL != cdolist_list_var2) {
                    cb_c_gaf_arg_rec_arg_pred_naut(naut, (SubLObject)cb_naut_utilities.ONE_INTEGER, pred);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    pred = cdolist_list_var2.first();
                }
                cb_c_gaf_arg_rec_arg_pred_naut(naut, (SubLObject)cb_naut_utilities.ONE_INTEGER, cb_naut_utilities.$const56$salientAssertions);
                display_external_definitional_information_for_naut(naut, preds);
            }
            finally {
                cb_parameters.$cb_c_gaf_arg_last_mt$.rebind(_prev_bind_0_$18, thread);
            }
        }
        finally {
            cb_viewpoint.$cb_use_mts_filter$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 9129L)
    public static SubLObject cb_c_total_internal_naut(final SubLObject naut) {
        cb_c_gaf_arg_naut_internal(naut, (SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.NIL);
        html_utilities.html_hr((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
        cb_c_other_naut_internal(naut);
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 9350L)
    public static SubLObject cb_c_index_naut_index(final SubLObject naut) {
        cb_c_index_gaf_args_naut(naut);
        cb_c_index_other_naut(naut);
        if (cb_naut_utilities.NIL != hlmt.hlmtP(naut)) {
            cb_browser.cb_c_index_mt(naut);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 10027L)
    public static SubLObject cb_c_index_gaf_args_naut(final SubLObject index_hook) {
        final SubLObject gaf_count = cb_relevant_num_gaf_arg_index_naut(index_hook, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
        if (gaf_count.numG((SubLObject)cb_naut_utilities.ZERO_INTEGER)) {
            html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_naut_utilities.ZERO_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw57$GAF_ARG_NAUT, index_hook, gaf_count, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            SubLObject cdolist_list_var;
            final SubLObject arg_list = cdolist_list_var = cb_relevant_key_gaf_arg_index_naut(index_hook, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            SubLObject arg = (SubLObject)cb_naut_utilities.NIL;
            arg = cdolist_list_var.first();
            while (cb_naut_utilities.NIL != cdolist_list_var) {
                cb_gaf_arg_index_naut(index_hook, arg);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 10951L)
    public static SubLObject cb_gaf_arg_index_naut(final SubLObject index_hook, final SubLObject arg) {
        final SubLObject count = cb_relevant_num_gaf_arg_index_naut(index_hook, arg, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
        if (count.numG((SubLObject)cb_naut_utilities.ZERO_INTEGER)) {
            html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_naut_utilities.ONE_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw57$GAF_ARG_NAUT, index_hook, count, arg, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            SubLObject cdolist_list_var;
            final SubLObject preds = cdolist_list_var = cb_relevant_key_gaf_arg_index_naut(index_hook, arg, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            SubLObject pred = (SubLObject)cb_naut_utilities.NIL;
            pred = cdolist_list_var.first();
            while (cb_naut_utilities.NIL != cdolist_list_var) {
                cb_gaf_arg_pred_index_naut(index_hook, arg, pred);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 11431L)
    public static SubLObject cb_gaf_arg_pred_index_naut(final SubLObject index_hook, final SubLObject arg, final SubLObject pred) {
        final SubLObject count = cb_relevant_num_gaf_arg_index_naut(index_hook, arg, pred, (SubLObject)cb_naut_utilities.UNPROVIDED);
        if (count.numG((SubLObject)cb_naut_utilities.ZERO_INTEGER)) {
            final SubLObject mts = cb_relevant_key_gaf_arg_index_naut(index_hook, arg, pred, (SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_naut_utilities.TWO_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw57$GAF_ARG_NAUT, index_hook, count, arg, pred, (SubLObject)cb_naut_utilities.UNPROVIDED);
            if (!Sequences.length(mts).numLE((SubLObject)cb_naut_utilities.ONE_INTEGER)) {
                SubLObject cdolist_list_var = mts;
                SubLObject mt = (SubLObject)cb_naut_utilities.NIL;
                mt = cdolist_list_var.first();
                while (cb_naut_utilities.NIL != cdolist_list_var) {
                    cb_gaf_arg_pred_mt_index_naut(index_hook, arg, pred, mt);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt = cdolist_list_var.first();
                }
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 12139L)
    public static SubLObject cb_gaf_arg_pred_mt_index_naut(final SubLObject index_hook, final SubLObject arg, final SubLObject pred, final SubLObject mt) {
        final SubLObject count = cb_relevant_num_gaf_arg_index_naut(index_hook, arg, pred, mt);
        if (count.numG((SubLObject)cb_naut_utilities.ZERO_INTEGER)) {
            html_utilities.html_newline((SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_naut_utilities.THREE_INTEGER);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw57$GAF_ARG_NAUT, index_hook, count, arg, pred, mt);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 12443L)
    public static SubLObject cb_c_index_other_naut(final SubLObject index_hook) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_naut_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_naut_utilities.$const52$EverythingPSC, thread);
            final SubLObject count = cb_relevant_num_other_index_naut(index_hook, (SubLObject)cb_naut_utilities.UNPROVIDED);
            if (count.numG((SubLObject)cb_naut_utilities.ZERO_INTEGER)) {
                html_utilities.html_hr((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_utilities.html_indent((SubLObject)cb_naut_utilities.ZERO_INTEGER);
                cb_utilities.cb_link((SubLObject)cb_naut_utilities.$kw58$OTHER_NAUT, index_hook, count, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 12764L)
    public static SubLObject cb_c_gaf_arg_naut(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index_spec = (SubLObject)cb_naut_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_naut_utilities.$list59);
        index_spec = args.first();
        SubLObject current = args.rest();
        final SubLObject arg_string = (SubLObject)(current.isCons() ? current.first() : cb_naut_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)cb_naut_utilities.$list59);
        current = current.rest();
        final SubLObject pred_spec = (SubLObject)(current.isCons() ? current.first() : cb_naut_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)cb_naut_utilities.$list59);
        current = current.rest();
        final SubLObject mt_spec = (SubLObject)(current.isCons() ? current.first() : cb_naut_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)cb_naut_utilities.$list59);
        current = current.rest();
        if (cb_naut_utilities.NIL == current) {
            final SubLObject index_hook = cb_utilities.cb_guess_naut(index_spec, (SubLObject)cb_naut_utilities.UNPROVIDED);
            SubLObject arg = (SubLObject)cb_naut_utilities.NIL;
            SubLObject predicate = (SubLObject)cb_naut_utilities.NIL;
            SubLObject mt = (SubLObject)cb_naut_utilities.NIL;
            if (cb_naut_utilities.NIL == term.closed_nautP(index_hook, (SubLObject)cb_naut_utilities.UNPROVIDED)) {
                return cb_utilities.cb_error((SubLObject)cb_naut_utilities.$str60$Could_not_determine_a_NAUT_from__, index_spec, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            }
            if (cb_naut_utilities.NIL != arg_string) {
                arg = reader.read_from_string_ignoring_errors(arg_string, (SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                if (!arg.isFixnum()) {
                    return cb_utilities.cb_error((SubLObject)cb_naut_utilities.$str61$Could_not_determine_an_arg_from__, arg_string, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                }
                if (cb_naut_utilities.NIL != pred_spec) {
                    predicate = cb_utilities.cb_guess_fort(pred_spec, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    if (cb_naut_utilities.NIL == forts.fort_p(predicate)) {
                        return cb_utilities.cb_error((SubLObject)cb_naut_utilities.$str62$Could_not_determine_a_term_from__, pred_spec, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    }
                    if (cb_naut_utilities.NIL != mt_spec) {
                        mt = cb_utilities.cb_guess_hlmt(mt_spec);
                        if (cb_naut_utilities.NIL == hlmt.hlmt_p(mt)) {
                            return cb_utilities.cb_error((SubLObject)cb_naut_utilities.$str63$Could_not_determine_a_microtheory, mt_spec, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        }
                    }
                }
            }
            final SubLObject title_var;
            final SubLObject title = title_var = PrintLow.format((SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.$str64$GAF_index_for__S, index_hook);
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_naut_utilities.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_naut_utilities.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_naut_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_naut_utilities.$str2$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_naut_utilities.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_naut_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_naut_utilities.$kw4$CB_CYC);
                    if (cb_naut_utilities.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    dhtml_macros.html_basic_cb_scripts();
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_naut_utilities.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_naut_utilities.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_naut_utilities.$str7$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str8$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_naut_utilities.$str9$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_naut_utilities.$str10$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_naut_utilities.$str33$Refresh);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_naut_utilities.$str34$reloadCurrentFrame__reloadFrameBu);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                if (cb_naut_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            cb_browser.cb_c_term_header(index_hook);
                            html_utilities.html_newline((SubLObject)cb_naut_utilities.TWO_INTEGER);
                            cb_c_gaf_arg_naut_internal(index_hook, arg, predicate, mt);
                            html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$19, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_naut_utilities.$list59);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 13874L)
    public static SubLObject cb_link_gaf_arg_naut(final SubLObject index_hook, final SubLObject count, SubLObject arg, SubLObject predicate, SubLObject mt) {
        if (arg == cb_naut_utilities.UNPROVIDED) {
            arg = (SubLObject)cb_naut_utilities.NIL;
        }
        if (predicate == cb_naut_utilities.UNPROVIDED) {
            predicate = (SubLObject)cb_naut_utilities.NIL;
        }
        if (mt == cb_naut_utilities.UNPROVIDED) {
            mt = (SubLObject)cb_naut_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_naut_utilities.$kw67$CONTENT);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_naut_utilities.$str68$cb_c_gaf_arg_naut__A, cb_utilities.cb_index_identifier(index_hook));
        if (cb_naut_utilities.NIL != arg) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_naut_utilities.$str69$__a, arg);
            if (cb_naut_utilities.NIL != predicate) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_naut_utilities.$str69$__a, cb_utilities.cb_fort_identifier(predicate));
                if (cb_naut_utilities.NIL != mt) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_naut_utilities.$str69$__a, cb_utilities.cb_hlmt_identifier(mt));
                }
            }
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
        if (cb_naut_utilities.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
            if (cb_naut_utilities.NIL != mt) {
                cb_utilities.cb_show_assertion_hlmt_readably(mt);
            }
            else if (cb_naut_utilities.NIL != predicate) {
                html_utilities.html_princ(cb_utilities.cb_fort_display_string(predicate));
            }
            else if (cb_naut_utilities.NIL != arg) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_naut_utilities.$str70$Arg__a, arg);
            }
            else {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_naut_utilities.$str71$All_GAFs);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        if (count.numG((SubLObject)cb_naut_utilities.ONE_INTEGER)) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_naut_utilities.$str72$___a_, count);
        }
        return index_hook;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 14543L)
    public static SubLObject cb_c_gaf_arg_naut_internal(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_parameters.$cb_c_gaf_arg_last_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cb_utilities.$assertion_filter_hook$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            cb_parameters.$cb_c_gaf_arg_last_mt$.bind((SubLObject)cb_naut_utilities.NIL, thread);
            cb_utilities.$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)cb_naut_utilities.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$23 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$24 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$25 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$26 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$27 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$28 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                        pph_vars.$paraphrase_mode$.bind((SubLObject)cb_naut_utilities.$kw74$HTML, thread);
                                        if (cb_naut_utilities.NIL == arg) {
                                            cb_c_gaf_arg_rec_naut(index_hook);
                                        }
                                        else if (cb_naut_utilities.NIL == predicate) {
                                            cb_c_gaf_arg_rec_arg_naut(index_hook, arg);
                                        }
                                        else {
                                            cb_browser.cb_c_gaf_arg_header(arg);
                                            if (cb_naut_utilities.NIL == mt) {
                                                cb_c_gaf_arg_rec_arg_pred_naut(index_hook, arg, predicate);
                                            }
                                            else {
                                                final SubLObject _prev_bind_0_$28 = cb_parameters.$cb_c_gaf_arg_use_binary$.currentBinding(thread);
                                                try {
                                                    cb_parameters.$cb_c_gaf_arg_use_binary$.bind((SubLObject)SubLObjectFactory.makeBoolean(cb_naut_utilities.NIL != cb_parameters.$cb_c_gaf_arg_use_binary$.getDynamicValue(thread) && arg.eql((SubLObject)cb_naut_utilities.ONE_INTEGER)), thread);
                                                    if (cb_naut_utilities.NIL != cb_parameters.$cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) {
                                                        final SubLObject _prev_bind_0_$29 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$29 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_naut_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
                                                            mt_relevance_macros.$mt$.bind(cb_naut_utilities.$const52$EverythingPSC, thread);
                                                            cb_parameters.$cb_c_gaf_arg_use_binary$.setDynamicValue(arity.binaryP(predicate), thread);
                                                        }
                                                        finally {
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$29, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$29, thread);
                                                        }
                                                    }
                                                    cb_browser.cb_c_gaf_arg_rec_arg_pred_mt(index_hook, arg, predicate, mt);
                                                }
                                                finally {
                                                    cb_parameters.$cb_c_gaf_arg_use_binary$.rebind(_prev_bind_0_$28, thread);
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_1_$28, thread);
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$27, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_naut_utilities.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$25, thread);
                        }
                        if (new_or_reused == cb_naut_utilities.$kw75$NEW && cb_naut_utilities.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$24, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_naut_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (cb_naut_utilities.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$23, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_3, thread);
            cb_utilities.$assertion_filter_hook$.rebind(_prev_bind_2, thread);
            cb_parameters.$cb_c_gaf_arg_last_mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 15445L)
    public static SubLObject cb_c_gaf_arg_rec_naut(final SubLObject index_hook) {
        SubLObject some_arg_done = (SubLObject)cb_naut_utilities.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cb_relevant_key_gaf_arg_index_naut(index_hook, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
        SubLObject arg = (SubLObject)cb_naut_utilities.NIL;
        arg = cdolist_list_var.first();
        while (cb_naut_utilities.NIL != cdolist_list_var) {
            if (cb_naut_utilities.NIL != some_arg_done) {
                html_utilities.html_hr((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            }
            cb_c_gaf_arg_rec_arg_naut(index_hook, arg);
            some_arg_done = (SubLObject)cb_naut_utilities.T;
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 15735L)
    public static SubLObject cb_c_gaf_arg_rec_arg_naut(final SubLObject index_hook, final SubLObject arg) {
        cb_browser.cb_c_gaf_arg_header(arg);
        final SubLObject predicates = cb_relevant_key_gaf_arg_index_naut(index_hook, arg, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
        cb_parameters.$cb_c_gaf_arg_last_mt$.setDynamicValue((SubLObject)cb_naut_utilities.NIL);
        SubLObject cdolist_list_var = predicates;
        SubLObject predicate = (SubLObject)cb_naut_utilities.NIL;
        predicate = cdolist_list_var.first();
        while (cb_naut_utilities.NIL != cdolist_list_var) {
            cb_c_gaf_arg_rec_arg_pred_naut(index_hook, arg, predicate);
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 16052L)
    public static SubLObject cb_c_gaf_arg_rec_arg_pred_naut(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_parameters.$cb_c_gaf_arg_use_binary$.currentBinding(thread);
        try {
            cb_parameters.$cb_c_gaf_arg_use_binary$.bind((SubLObject)SubLObjectFactory.makeBoolean(cb_naut_utilities.NIL != cb_parameters.$cb_c_gaf_arg_use_binary$.getDynamicValue(thread) && arg.eql((SubLObject)cb_naut_utilities.ONE_INTEGER)), thread);
            final SubLObject mts = cb_relevant_key_gaf_arg_index_naut(index_hook, arg, predicate, (SubLObject)cb_naut_utilities.UNPROVIDED);
            if (cb_naut_utilities.NIL != cb_parameters.$cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_naut_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(cb_naut_utilities.$const52$EverythingPSC, thread);
                    cb_parameters.$cb_c_gaf_arg_use_binary$.setDynamicValue(arity.binaryP(predicate), thread);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
                }
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt = (SubLObject)cb_naut_utilities.NIL;
            mt = cdolist_list_var.first();
            while (cb_naut_utilities.NIL != cdolist_list_var) {
                cb_browser.cb_c_gaf_arg_rec_arg_pred_mt(index_hook, arg, predicate, mt);
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        finally {
            cb_parameters.$cb_c_gaf_arg_use_binary$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 16512L)
    public static SubLObject cb_relevant_gaf_arg_index_naut_args_validP(final SubLObject argnum, final SubLObject pred, final SubLObject mt) {
        if (cb_naut_utilities.NIL != mt) {
            return (SubLObject)SubLObjectFactory.makeBoolean(cb_naut_utilities.NIL != argnum && cb_naut_utilities.NIL != pred);
        }
        if (cb_naut_utilities.NIL != pred) {
            return list_utilities.sublisp_boolean(argnum);
        }
        return (SubLObject)cb_naut_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 16683L)
    public static SubLObject cb_relevant_key_gaf_arg_index_naut(final SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt) {
        if (argnum == cb_naut_utilities.UNPROVIDED) {
            argnum = (SubLObject)cb_naut_utilities.NIL;
        }
        if (pred == cb_naut_utilities.UNPROVIDED) {
            pred = (SubLObject)cb_naut_utilities.NIL;
        }
        if (mt == cb_naut_utilities.UNPROVIDED) {
            mt = (SubLObject)cb_naut_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_naut_utilities.NIL == cb_relevant_gaf_arg_index_naut_args_validP(argnum, pred, mt)) {
            Errors.error((SubLObject)cb_naut_utilities.$str76$Got_invalid_args_ARGNUM___A__PRED, argnum, pred, mt);
        }
        SubLObject result = (SubLObject)cb_naut_utilities.NIL;
        if (cb_naut_utilities.NIL == argnum) {
            if (cb_naut_utilities.NIL != mt) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                    SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, (SubLObject)cb_naut_utilities.$sym77$INDEXED_TERM_P, (SubLObject)cb_naut_utilities.NIL, Symbols.symbol_function((SubLObject)cb_naut_utilities.EQUAL), (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    if (cb_naut_utilities.NIL != kb_indexing_datastructures.indexed_term_p(pred)) {
                        indexed_terms = (SubLObject)ConsesLow.cons(pred, indexed_terms);
                    }
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    SubLObject assertion = (SubLObject)cb_naut_utilities.NIL;
                    assertion = cdolist_list_var.first();
                    while (cb_naut_utilities.NIL != cdolist_list_var) {
                        if ((cb_naut_utilities.NIL == pred || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion)))) && cb_naut_utilities.NIL != el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion))) {
                            result = (SubLObject)ConsesLow.cons(el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion)), result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_naut_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(cb_naut_utilities.$const52$EverythingPSC, thread);
                    SubLObject indexed_terms2 = cycl_utilities.expression_gather(v_term, (SubLObject)cb_naut_utilities.$sym77$INDEXED_TERM_P, (SubLObject)cb_naut_utilities.NIL, Symbols.symbol_function((SubLObject)cb_naut_utilities.EQUAL), (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    if (cb_naut_utilities.NIL != kb_indexing_datastructures.indexed_term_p(pred)) {
                        indexed_terms2 = (SubLObject)ConsesLow.cons(pred, indexed_terms2);
                    }
                    SubLObject cdolist_list_var2 = virtual_indexing.gather_overlap_index(indexed_terms2, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    SubLObject assertion2 = (SubLObject)cb_naut_utilities.NIL;
                    assertion2 = cdolist_list_var2.first();
                    while (cb_naut_utilities.NIL != cdolist_list_var2) {
                        if ((cb_naut_utilities.NIL == pred || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion2)))) && cb_naut_utilities.NIL != el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion2))) {
                            result = (SubLObject)ConsesLow.cons(el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion2)), result);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion2 = cdolist_list_var2.first();
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                }
            }
        }
        else if (cb_naut_utilities.NIL == pred) {
            if (cb_naut_utilities.NIL != mt) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                    SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, (SubLObject)cb_naut_utilities.$sym77$INDEXED_TERM_P, (SubLObject)cb_naut_utilities.NIL, Symbols.symbol_function((SubLObject)cb_naut_utilities.EQUAL), (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    if (cb_naut_utilities.NIL != kb_indexing_datastructures.indexed_term_p((SubLObject)cb_naut_utilities.NIL)) {
                        indexed_terms = (SubLObject)ConsesLow.cons((SubLObject)cb_naut_utilities.NIL, indexed_terms);
                    }
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    SubLObject assertion = (SubLObject)cb_naut_utilities.NIL;
                    assertion = cdolist_list_var.first();
                    while (cb_naut_utilities.NIL != cdolist_list_var) {
                        if (cb_naut_utilities.NIL != ((cb_naut_utilities.NIL != argnum) ? Equality.equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion), argnum, (SubLObject)cb_naut_utilities.UNPROVIDED)) : el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion)))) {
                            result = (SubLObject)ConsesLow.cons(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion)), result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_naut_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(cb_naut_utilities.$const52$EverythingPSC, thread);
                    SubLObject indexed_terms2 = cycl_utilities.expression_gather(v_term, (SubLObject)cb_naut_utilities.$sym77$INDEXED_TERM_P, (SubLObject)cb_naut_utilities.NIL, Symbols.symbol_function((SubLObject)cb_naut_utilities.EQUAL), (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    if (cb_naut_utilities.NIL != kb_indexing_datastructures.indexed_term_p((SubLObject)cb_naut_utilities.NIL)) {
                        indexed_terms2 = (SubLObject)ConsesLow.cons((SubLObject)cb_naut_utilities.NIL, indexed_terms2);
                    }
                    SubLObject cdolist_list_var2 = virtual_indexing.gather_overlap_index(indexed_terms2, (SubLObject)cb_naut_utilities.UNPROVIDED);
                    SubLObject assertion2 = (SubLObject)cb_naut_utilities.NIL;
                    assertion2 = cdolist_list_var2.first();
                    while (cb_naut_utilities.NIL != cdolist_list_var2) {
                        if (cb_naut_utilities.NIL != ((cb_naut_utilities.NIL != argnum) ? Equality.equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion2), argnum, (SubLObject)cb_naut_utilities.UNPROVIDED)) : el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion2)))) {
                            result = (SubLObject)ConsesLow.cons(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion2)), result);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion2 = cdolist_list_var2.first();
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                }
            }
        }
        else if (cb_naut_utilities.NIL == mt) {
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_naut_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(cb_naut_utilities.$const52$EverythingPSC, thread);
                SubLObject indexed_terms2 = cycl_utilities.expression_gather(v_term, (SubLObject)cb_naut_utilities.$sym77$INDEXED_TERM_P, (SubLObject)cb_naut_utilities.NIL, Symbols.symbol_function((SubLObject)cb_naut_utilities.EQUAL), (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                if (cb_naut_utilities.NIL != kb_indexing_datastructures.indexed_term_p(pred)) {
                    indexed_terms2 = (SubLObject)ConsesLow.cons(pred, indexed_terms2);
                }
                SubLObject cdolist_list_var2 = virtual_indexing.gather_overlap_index(indexed_terms2, (SubLObject)cb_naut_utilities.UNPROVIDED);
                SubLObject assertion2 = (SubLObject)cb_naut_utilities.NIL;
                assertion2 = cdolist_list_var2.first();
                while (cb_naut_utilities.NIL != cdolist_list_var2) {
                    if ((cb_naut_utilities.NIL == pred || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion2)))) && cb_naut_utilities.NIL != ((cb_naut_utilities.NIL != argnum) ? Equality.equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion2), argnum, (SubLObject)cb_naut_utilities.UNPROVIDED)) : el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion2)))) {
                        result = (SubLObject)ConsesLow.cons(assertions_high.assertion_mt(assertion2), result);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    assertion2 = cdolist_list_var2.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
        }
        result = Sequences.nreverse(list_utilities.fast_delete_duplicates(result, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED));
        if (cb_naut_utilities.NIL == argnum) {
            result = cb_utilities.cb_sort_args_for_display(result);
        }
        else if (cb_naut_utilities.NIL == pred) {
            result = cb_utilities.cb_sort_preds_for_display(v_term, result, (SubLObject)cb_naut_utilities.UNPROVIDED);
        }
        else if (cb_naut_utilities.NIL == mt) {
            result = cb_utilities.cb_sort_mts_for_display(result, (SubLObject)cb_naut_utilities.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 18263L)
    public static SubLObject cb_relevant_num_gaf_arg_index_naut(final SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt) {
        if (argnum == cb_naut_utilities.UNPROVIDED) {
            argnum = (SubLObject)cb_naut_utilities.NIL;
        }
        if (pred == cb_naut_utilities.UNPROVIDED) {
            pred = (SubLObject)cb_naut_utilities.NIL;
        }
        if (mt == cb_naut_utilities.UNPROVIDED) {
            mt = (SubLObject)cb_naut_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_naut_utilities.NIL == cb_relevant_gaf_arg_index_naut_args_validP(argnum, pred, mt)) {
            Errors.error((SubLObject)cb_naut_utilities.$str76$Got_invalid_args_ARGNUM___A__PRED, argnum, pred, mt);
        }
        SubLObject result = (SubLObject)cb_naut_utilities.ZERO_INTEGER;
        if (cb_naut_utilities.NIL != mt) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, (SubLObject)cb_naut_utilities.$sym77$INDEXED_TERM_P, (SubLObject)cb_naut_utilities.NIL, Symbols.symbol_function((SubLObject)cb_naut_utilities.EQUAL), (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                if (cb_naut_utilities.NIL != kb_indexing_datastructures.indexed_term_p(pred)) {
                    indexed_terms = (SubLObject)ConsesLow.cons(pred, indexed_terms);
                }
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, (SubLObject)cb_naut_utilities.UNPROVIDED);
                SubLObject assertion = (SubLObject)cb_naut_utilities.NIL;
                assertion = cdolist_list_var.first();
                while (cb_naut_utilities.NIL != cdolist_list_var) {
                    if ((cb_naut_utilities.NIL == pred || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion)))) && cb_naut_utilities.NIL != ((cb_naut_utilities.NIL != argnum) ? Equality.equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion), argnum, (SubLObject)cb_naut_utilities.UNPROVIDED)) : el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion)))) {
                        result = Numbers.add(result, (SubLObject)cb_naut_utilities.ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_naut_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(cb_naut_utilities.$const52$EverythingPSC, thread);
                SubLObject indexed_terms2 = cycl_utilities.expression_gather(v_term, (SubLObject)cb_naut_utilities.$sym77$INDEXED_TERM_P, (SubLObject)cb_naut_utilities.NIL, Symbols.symbol_function((SubLObject)cb_naut_utilities.EQUAL), (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
                if (cb_naut_utilities.NIL != kb_indexing_datastructures.indexed_term_p(pred)) {
                    indexed_terms2 = (SubLObject)ConsesLow.cons(pred, indexed_terms2);
                }
                SubLObject cdolist_list_var2 = virtual_indexing.gather_overlap_index(indexed_terms2, (SubLObject)cb_naut_utilities.UNPROVIDED);
                SubLObject assertion2 = (SubLObject)cb_naut_utilities.NIL;
                assertion2 = cdolist_list_var2.first();
                while (cb_naut_utilities.NIL != cdolist_list_var2) {
                    if ((cb_naut_utilities.NIL == pred || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion2)))) && cb_naut_utilities.NIL != ((cb_naut_utilities.NIL != argnum) ? Equality.equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion2), argnum, (SubLObject)cb_naut_utilities.UNPROVIDED)) : el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion2)))) {
                        result = Numbers.add(result, (SubLObject)cb_naut_utilities.ONE_INTEGER);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    assertion2 = cdolist_list_var2.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 18889L)
    public static SubLObject cb_c_other_naut(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index_spec = (SubLObject)cb_naut_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_naut_utilities.$list78);
        index_spec = args.first();
        final SubLObject current = args.rest();
        if (cb_naut_utilities.NIL == current) {
            final SubLObject index_hook = cb_utilities.cb_guess_naut(index_spec, (SubLObject)cb_naut_utilities.UNPROVIDED);
            if (cb_naut_utilities.NIL == term.closed_nautP(index_hook, (SubLObject)cb_naut_utilities.UNPROVIDED)) {
                return cb_utilities.cb_error((SubLObject)cb_naut_utilities.$str60$Could_not_determine_a_NAUT_from__, index_spec, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            }
            final SubLObject title_var;
            final SubLObject title = title_var = PrintLow.format((SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.$str79$OTHER_index_for__A, index_hook);
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_naut_utilities.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_naut_utilities.$str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_naut_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_naut_utilities.$str2$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_naut_utilities.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_naut_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_naut_utilities.$kw4$CB_CYC);
                    if (cb_naut_utilities.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    dhtml_macros.html_basic_cb_scripts();
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$36 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_naut_utilities.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_naut_utilities.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_naut_utilities.$str7$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_naut_utilities.$str8$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_naut_utilities.$str9$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_naut_utilities.$str10$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_naut_utilities.$str33$Refresh);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_naut_utilities.$str34$reloadCurrentFrame__reloadFrameBu);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
                                if (cb_naut_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            cb_browser.cb_c_term_header(index_hook);
                            html_utilities.html_newline((SubLObject)cb_naut_utilities.TWO_INTEGER);
                            cb_c_other_naut_internal(index_hook);
                            html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$36, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$35, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_naut_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_naut_utilities.$list78);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 19421L)
    public static SubLObject cb_link_other_naut(final SubLObject index_hook, final SubLObject count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_naut_utilities.$kw67$CONTENT);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_naut_utilities.$str81$cb_c_other_naut__A, cb_utilities.cb_naut_identifier(index_hook));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
        if (cb_naut_utilities.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_naut_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_naut_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_naut_utilities.T, thread);
            html_utilities.html_princ((SubLObject)cb_naut_utilities.$str82$Miscellaneous);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        if (count.numG((SubLObject)cb_naut_utilities.ONE_INTEGER)) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_naut_utilities.$str72$___a_, count);
        }
        return index_hook;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 19682L)
    public static SubLObject cb_c_other_naut_internal(final SubLObject index_hook) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = cb_utilities.$assertion_filter_hook$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_naut_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_naut_utilities.$const52$EverythingPSC, thread);
            cb_utilities.$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
            if (cb_relevant_num_other_index_naut(index_hook, (SubLObject)cb_naut_utilities.UNPROVIDED).numG((SubLObject)cb_naut_utilities.ZERO_INTEGER)) {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_naut_utilities.$str84$Miscellaneous_References_);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_naut_utilities.TWO_INTEGER);
                final SubLObject assertion_link_fn = (cb_naut_utilities.NIL != cb_browser.cb_show_el_formulas_for_hookP(index_hook)) ? Symbols.symbol_function((SubLObject)cb_naut_utilities.$sym85$CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY) : Symbols.symbol_function((SubLObject)cb_naut_utilities.$sym87$CB_ASSERTION_LINK_WITH_MT);
                final SubLObject _prev_bind_0_$39 = cb_parameters.$cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
                final SubLObject _prev_bind_1_$40 = cb_parameters.$cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
                try {
                    cb_parameters.$cb_show_el_assertion_readably_last_formula$.bind((SubLObject)cb_naut_utilities.NIL, thread);
                    cb_parameters.$cb_show_el_assertion_readably_last_mt$.bind((SubLObject)cb_naut_utilities.NIL, thread);
                    cb_relevant_key_other_index_naut(assertion_link_fn, index_hook, (SubLObject)cb_naut_utilities.NIL);
                }
                finally {
                    cb_parameters.$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_1_$40, thread);
                    cb_parameters.$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0_$39, thread);
                }
            }
        }
        finally {
            cb_utilities.$assertion_filter_hook$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 20166L)
    public static SubLObject cb_relevant_key_other_index_naut(final SubLObject function, final SubLObject v_term, final SubLObject truth) {
        kb_utilities.map_misc_index_naut(function, v_term, truth);
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-naut-utilities.lisp", position = 21089L)
    public static SubLObject cb_relevant_num_other_index_naut(final SubLObject v_term, SubLObject truth) {
        if (truth == cb_naut_utilities.UNPROVIDED) {
            truth = (SubLObject)cb_naut_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)cb_naut_utilities.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_naut_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_naut_utilities.$const52$EverythingPSC, thread);
            final SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, (SubLObject)cb_naut_utilities.$sym77$INDEXED_TERM_P, (SubLObject)cb_naut_utilities.NIL, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED, (SubLObject)cb_naut_utilities.UNPROVIDED);
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, (SubLObject)cb_naut_utilities.UNPROVIDED);
            SubLObject assertion = (SubLObject)cb_naut_utilities.NIL;
            assertion = cdolist_list_var.first();
            while (cb_naut_utilities.NIL != cdolist_list_var) {
                if ((cb_naut_utilities.NIL == truth || cb_naut_utilities.NIL != assertions_high.assertion_has_truth(assertion, truth)) && cb_naut_utilities.NIL == el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion)) && (cb_naut_utilities.NIL != cycl_utilities.expression_find(v_term, assertions_high.assertion_formula(assertion), (SubLObject)cb_naut_utilities.T, Symbols.symbol_function((SubLObject)cb_naut_utilities.EQUAL), (SubLObject)cb_naut_utilities.UNPROVIDED) || cb_naut_utilities.NIL != cycl_utilities.expression_find(v_term, assertions_high.assertion_mt(assertion), (SubLObject)cb_naut_utilities.T, Symbols.symbol_function((SubLObject)cb_naut_utilities.EQUAL), (SubLObject)cb_naut_utilities.UNPROVIDED))) {
                    v_answer = Numbers.add(v_answer, (SubLObject)cb_naut_utilities.ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    public static SubLObject declare_cb_naut_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_naut_index", "CB-NAUT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_naut_term_toolbar", "CB-NAUT-TERM-TOOLBAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_naut_index_guts", "CB-NAUT-INDEX-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_default_naut_content_internal", "CB-DEFAULT-NAUT-CONTENT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_naut_info", "CB-C-NAUT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "html_title_for_term", "HTML-TITLE-FOR-TERM", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_print_documentation_information_naut", "CB-PRINT-DOCUMENTATION-INFORMATION-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "htmlize_derived_naut_definitional_info_int", "HTMLIZE-DERIVED-NAUT-DEFINITIONAL-INFO-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "htmlize_derived_naut_definitional_info", "HTMLIZE-DERIVED-NAUT-DEFINITIONAL-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_definitional_internal_naut", "CB-C-DEFINITIONAL-INTERNAL-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "display_cyc_terms_for_sksi_external_term_naut", "DISPLAY-CYC-TERMS-FOR-SKSI-EXTERNAL-TERM-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "display_external_definitional_information_for_naut", "DISPLAY-EXTERNAL-DEFINITIONAL-INFORMATION-FOR-NAUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_print_definitional_information_naut", "CB-PRINT-DEFINITIONAL-INFORMATION-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_total_internal_naut", "CB-C-TOTAL-INTERNAL-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_index_naut_index", "CB-C-INDEX-NAUT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_index_gaf_args_naut", "CB-C-INDEX-GAF-ARGS-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_gaf_arg_index_naut", "CB-GAF-ARG-INDEX-NAUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_gaf_arg_pred_index_naut", "CB-GAF-ARG-PRED-INDEX-NAUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_gaf_arg_pred_mt_index_naut", "CB-GAF-ARG-PRED-MT-INDEX-NAUT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_index_other_naut", "CB-C-INDEX-OTHER-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_gaf_arg_naut", "CB-C-GAF-ARG-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_link_gaf_arg_naut", "CB-LINK-GAF-ARG-NAUT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_gaf_arg_naut_internal", "CB-C-GAF-ARG-NAUT-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_gaf_arg_rec_naut", "CB-C-GAF-ARG-REC-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_gaf_arg_rec_arg_naut", "CB-C-GAF-ARG-REC-ARG-NAUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_gaf_arg_rec_arg_pred_naut", "CB-C-GAF-ARG-REC-ARG-PRED-NAUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_relevant_gaf_arg_index_naut_args_validP", "CB-RELEVANT-GAF-ARG-INDEX-NAUT-ARGS-VALID?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_relevant_key_gaf_arg_index_naut", "CB-RELEVANT-KEY-GAF-ARG-INDEX-NAUT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_relevant_num_gaf_arg_index_naut", "CB-RELEVANT-NUM-GAF-ARG-INDEX-NAUT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_other_naut", "CB-C-OTHER-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_link_other_naut", "CB-LINK-OTHER-NAUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_c_other_naut_internal", "CB-C-OTHER-NAUT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_relevant_key_other_index_naut", "CB-RELEVANT-KEY-OTHER-INDEX-NAUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_naut_utilities", "cb_relevant_num_other_index_naut", "CB-RELEVANT-NUM-OTHER-INDEX-NAUT", 1, 1, false);
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    public static SubLObject init_cb_naut_utilities_file() {
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    public static SubLObject setup_cb_naut_utilities_file() {
        html_macros.note_cgi_handler_function((SubLObject)cb_naut_utilities.$sym65$CB_C_GAF_ARG_NAUT, (SubLObject)cb_naut_utilities.$kw66$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_naut_utilities.$kw57$GAF_ARG_NAUT, (SubLObject)cb_naut_utilities.$sym73$CB_LINK_GAF_ARG_NAUT, (SubLObject)cb_naut_utilities.FIVE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_naut_utilities.$sym80$CB_C_OTHER_NAUT, (SubLObject)cb_naut_utilities.$kw66$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_naut_utilities.$kw58$OTHER_NAUT, (SubLObject)cb_naut_utilities.$sym83$CB_LINK_OTHER_NAUT, (SubLObject)cb_naut_utilities.TWO_INTEGER);
        return (SubLObject)cb_naut_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_naut_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_naut_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_naut_utilities_file();
    }
    
    static {
        me = (SubLFile)new cb_naut_utilities();
        $str0$NAUT = SubLObjectFactory.makeString("NAUT");
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
        $kw12$KBQ_ASK = SubLObjectFactory.makeKeyword("KBQ-ASK");
        $kw13$KBQ_ASK_IN_PROOF_CHECKER = SubLObjectFactory.makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");
        $kw14$KBQ_EDIT = SubLObjectFactory.makeKeyword("KBQ-EDIT");
        $sym15$INDEX_BROWSER = SubLObjectFactory.makeSymbol("INDEX-BROWSER");
        $kw16$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw17$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $kw18$DEFINITIONAL = SubLObjectFactory.makeKeyword("DEFINITIONAL");
        $kw19$HANDLER = SubLObjectFactory.makeKeyword("HANDLER");
        $sym20$CB_C_PERTINENT_QUERY_LINKS = SubLObjectFactory.makeSymbol("CB-C-PERTINENT-QUERY-LINKS");
        $kw21$ARGS = SubLObjectFactory.makeKeyword("ARGS");
        $str22$term = SubLObjectFactory.makeString("term");
        $kw23$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $str24$Checking_for_Pertinent_Queries___ = SubLObjectFactory.makeString("Checking for Pertinent Queries...");
        $kw25$TAG = SubLObjectFactory.makeKeyword("TAG");
        $str26$div = SubLObjectFactory.makeString("div");
        $kw27$DELAY = SubLObjectFactory.makeKeyword("DELAY");
        $int28$50 = SubLObjectFactory.makeInteger(50);
        $kw29$SKSI_EXTERNAL_TERM_GAF_ARGUMENT = SubLObjectFactory.makeKeyword("SKSI-EXTERNAL-TERM-GAF-ARGUMENT");
        $kw30$SKSI_EXTERNAL_TERM_PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("SKSI-EXTERNAL-TERM-PREDICATE-EXTENT");
        $kw31$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str32$Definitional_and_Documentation_In = SubLObjectFactory.makeString("Definitional and Documentation Info for ~S");
        $str33$Refresh = SubLObjectFactory.makeString("Refresh");
        $str34$reloadCurrentFrame__reloadFrameBu = SubLObjectFactory.makeString("reloadCurrentFrame('reloadFrameButton');");
        $str35$Documentation_for_NAUT__ = SubLObjectFactory.makeString("Documentation for NAUT: ");
        $str36$___ = SubLObjectFactory.makeString(" : ");
        $str37$Derived_SBHL_Assertions_ = SubLObjectFactory.makeString("Derived SBHL Assertions:");
        $str38$Mt__ = SubLObjectFactory.makeString("Mt: ");
        $const39$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const40$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const41$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str42$Definitional_info_for__A = SubLObjectFactory.makeString("Definitional info for ~A");
        $str43$Corresponding_Cyc_terms_ = SubLObjectFactory.makeString("Corresponding Cyc terms:");
        $list44 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn")));
        $str45$External_Assertions_ = SubLObjectFactory.makeString("External Assertions:");
        $str46$Definitional_Information_for_NAUT = SubLObjectFactory.makeString("Definitional Information for NAUT: ");
        $str47$Corresponding_HL_NART__ = SubLObjectFactory.makeString("Corresponding HL NART: ");
        $const48$functionCorrespondingPredicate_Ca = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionCorrespondingPredicate-Canonical"));
        $list49 = ConsesLow.list((SubLObject)cb_naut_utilities.TWO_INTEGER, (SubLObject)cb_naut_utilities.THREE_INTEGER);
        $str50$Corresponding_formula_via___funct = SubLObjectFactory.makeString("Corresponding formula via #$functionCorrespondingPredicate-Canonical:");
        $sym51$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const52$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str53$_ff0000 = SubLObjectFactory.makeString("#ff0000");
        $str54$_NOT_STRICTLY_WFF_ = SubLObjectFactory.makeString("(NOT STRICTLY WFF)");
        $str55$KB_Assertions_ = SubLObjectFactory.makeString("KB Assertions:");
        $const56$salientAssertions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("salientAssertions"));
        $kw57$GAF_ARG_NAUT = SubLObjectFactory.makeKeyword("GAF-ARG-NAUT");
        $kw58$OTHER_NAUT = SubLObjectFactory.makeKeyword("OTHER-NAUT");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("MT-SPEC"));
        $str60$Could_not_determine_a_NAUT_from__ = SubLObjectFactory.makeString("Could not determine a NAUT from ~a");
        $str61$Could_not_determine_an_arg_from__ = SubLObjectFactory.makeString("Could not determine an arg from ~a");
        $str62$Could_not_determine_a_term_from__ = SubLObjectFactory.makeString("Could not determine a term from ~a");
        $str63$Could_not_determine_a_microtheory = SubLObjectFactory.makeString("Could not determine a microtheory from ~a");
        $str64$GAF_index_for__S = SubLObjectFactory.makeString("GAF index for ~S");
        $sym65$CB_C_GAF_ARG_NAUT = SubLObjectFactory.makeSymbol("CB-C-GAF-ARG-NAUT");
        $kw66$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $kw67$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $str68$cb_c_gaf_arg_naut__A = SubLObjectFactory.makeString("cb-c-gaf-arg-naut&~A");
        $str69$__a = SubLObjectFactory.makeString("&~a");
        $str70$Arg__a = SubLObjectFactory.makeString("Arg ~a");
        $str71$All_GAFs = SubLObjectFactory.makeString("All GAFs");
        $str72$___a_ = SubLObjectFactory.makeString(" (~a)");
        $sym73$CB_LINK_GAF_ARG_NAUT = SubLObjectFactory.makeSymbol("CB-LINK-GAF-ARG-NAUT");
        $kw74$HTML = SubLObjectFactory.makeKeyword("HTML");
        $kw75$NEW = SubLObjectFactory.makeKeyword("NEW");
        $str76$Got_invalid_args_ARGNUM___A__PRED = SubLObjectFactory.makeString("Got invalid args ARGNUM: ~A, PRED: ~A, MT: ~A.~%");
        $sym77$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-SPEC"));
        $str79$OTHER_index_for__A = SubLObjectFactory.makeString("OTHER index for ~A");
        $sym80$CB_C_OTHER_NAUT = SubLObjectFactory.makeSymbol("CB-C-OTHER-NAUT");
        $str81$cb_c_other_naut__A = SubLObjectFactory.makeString("cb-c-other-naut&~A");
        $str82$Miscellaneous = SubLObjectFactory.makeString("Miscellaneous");
        $sym83$CB_LINK_OTHER_NAUT = SubLObjectFactory.makeSymbol("CB-LINK-OTHER-NAUT");
        $str84$Miscellaneous_References_ = SubLObjectFactory.makeString("Miscellaneous References:");
        $sym85$CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY = SubLObjectFactory.makeSymbol("CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY");
        $sym86$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY = SubLObjectFactory.makeSymbol("CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY");
        $sym87$CB_ASSERTION_LINK_WITH_MT = SubLObjectFactory.makeSymbol("CB-ASSERTION-LINK-WITH-MT");
        $sym88$CB_ASSERTION_LINK = SubLObjectFactory.makeSymbol("CB-ASSERTION-LINK");
    }
}

/*

	Total time: 589 ms
	
*/