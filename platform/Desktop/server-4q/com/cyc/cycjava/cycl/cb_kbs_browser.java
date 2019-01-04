package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_kbs_browser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_kbs_browser";
    public static final String myFingerPrint = "e67b10ea64445de9da71bd644526eadee66f9234d66f8ed288e7cb2984af6fe9";
    private static final SubLSymbol $kw0$KBS_POSITIVE;
    private static final SubLString $str1$kbs_positive_gif;
    private static final SubLString $str2$;
    private static final SubLSymbol $kw3$KBS_NEGATIVE;
    private static final SubLString $str4$kbs_negative_gif;
    private static final SubLSymbol $kw5$KBS_POSITIVE_TERM;
    private static final SubLString $str6$kbs_positive_term_gif;
    private static final SubLSymbol $kw7$KBS_POSITIVE_TERM_DEF;
    private static final SubLString $str8$kbs_positive_term_def_gif;
    private static final SubLSymbol $kw9$KBS_NEGATIVE_TERM;
    private static final SubLString $str10$kbs_negative_term_gif;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$KBS_FORT_P;
    private static final SubLSymbol $sym13$ADORNMENT_NAME;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$KBS_ASSERTION_P;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$KBS_DEDUCTION_P;
    private static final SubLSymbol $sym18$CB_KBS_OBJECT_P;
    private static final SubLSymbol $kw19$HTML_HANDLER;
    private static final SubLString $str20$The_KB_subset_state_is_not_valid_;
    private static final SubLString $str21$KB_subset_Info;
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
    private static final SubLString $str33$_is__A_in_the_KBS_because_;
    private static final SubLString $str34$included;
    private static final SubLString $str35$excluded;
    private static final SubLString $str36$_kbs_definition__;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-kbs-browser.lisp", position = 859L)
    public static SubLObject kbs_object_p(final SubLObject v_object) {
        if (cb_kbs_browser.NIL == kbs_identification.kbs_fort_state_validP()) {
            return (SubLObject)cb_kbs_browser.NIL;
        }
        if (cb_kbs_browser.NIL != forts.fort_p(v_object)) {
            return kbs_identification.kbs_fort_p(v_object);
        }
        if (cb_kbs_browser.NIL == kbs_identification.kbs_state_validP()) {
            return (SubLObject)cb_kbs_browser.NIL;
        }
        if (cb_kbs_browser.NIL != assertion_handles.assertion_p(v_object)) {
            return kbs_identification.kbs_assertion_p(v_object);
        }
        if (cb_kbs_browser.NIL != deduction_handles.deduction_p(v_object)) {
            return kbs_identification.kbs_deduction_p(v_object);
        }
        return (SubLObject)cb_kbs_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-kbs-browser.lisp", position = 1672L)
    public static SubLObject kbs_object_image(final SubLObject v_object) {
        if (cb_kbs_browser.NIL != assertion_handles.assertion_p(v_object)) {
            if (cb_kbs_browser.NIL != kbs_object_p(v_object)) {
                return cyc_file_dependencies.cb_icon_src((SubLObject)cb_kbs_browser.$kw0$KBS_POSITIVE);
            }
            return cyc_file_dependencies.cb_icon_src((SubLObject)cb_kbs_browser.$kw3$KBS_NEGATIVE);
        }
        else if (cb_kbs_browser.NIL != deduction_handles.deduction_p(v_object)) {
            if (cb_kbs_browser.NIL != kbs_object_p(v_object)) {
                return cyc_file_dependencies.cb_icon_src((SubLObject)cb_kbs_browser.$kw0$KBS_POSITIVE);
            }
            return cyc_file_dependencies.cb_icon_src((SubLObject)cb_kbs_browser.$kw3$KBS_NEGATIVE);
        }
        else {
            if (cb_kbs_browser.NIL == kbs_object_p(v_object)) {
                return cyc_file_dependencies.cb_icon_src((SubLObject)cb_kbs_browser.$kw9$KBS_NEGATIVE_TERM);
            }
            if (cb_kbs_browser.NIL != kbs_identification.kbs_definitional_fort_p(v_object)) {
                return cyc_file_dependencies.cb_icon_src((SubLObject)cb_kbs_browser.$kw7$KBS_POSITIVE_TERM_DEF);
            }
            return cyc_file_dependencies.cb_icon_src((SubLObject)cb_kbs_browser.$kw5$KBS_POSITIVE_TERM);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-kbs-browser.lisp", position = 2221L)
    public static SubLObject kbs_object_image_alt(final SubLObject v_object) {
        if (cb_kbs_browser.NIL != kbs_object_p(v_object)) {
            return cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_kbs_browser.$kw0$KBS_POSITIVE);
        }
        return cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_kbs_browser.$kw3$KBS_NEGATIVE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-kbs-browser.lisp", position = 2417L)
    public static SubLObject cb_kbs_browser_activeP(final SubLObject v_object) {
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-kbs-browser.lisp", position = 3399L)
    public static SubLObject cb_kbs_object_p(final SubLObject args) {
        return cb_kbs_object_p_internal(args.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-kbs-browser.lisp", position = 3494L)
    public static SubLObject cb_kbs_object_p_internal(final SubLObject object_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_kbs_browser.NIL == kbs_identification.kbs_state_validP()) {
            cb_utilities.cb_error((SubLObject)cb_kbs_browser.$str20$The_KB_subset_state_is_not_valid_, (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED);
        }
        final SubLObject v_object = (cb_kbs_browser.NIL != string_utilities.integer_string_p(object_string)) ? cb_utilities.cb_guess_assertion(object_string) : cb_utilities.cb_guess_term(object_string, (SubLObject)cb_kbs_browser.UNPROVIDED);
        SubLObject supports = (SubLObject)cb_kbs_browser.NIL;
        final SubLObject title_var = (SubLObject)cb_kbs_browser.$str21$KB_subset_Info;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_kbs_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_kbs_browser.$str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_kbs_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_kbs_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_kbs_browser.$str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_kbs_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_kbs_browser.$kw24$UNINITIALIZED) ? ConsesLow.list(cb_kbs_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_kbs_browser.$kw25$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_kbs_browser.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_kbs_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_kbs_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_kbs_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_kbs_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_kbs_browser.$str28$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kbs_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_kbs_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_kbs_browser.$str29$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kbs_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_kbs_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_kbs_browser.$str30$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_kbs_browser.$str31$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_kbs_browser.$str32$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kbs_browser.UNPROVIDED);
                            if (cb_kbs_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kbs_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_kbs_browser.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_kbs_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kbs_browser.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_kbs_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kbs_browser.UNPROVIDED);
                        }
                        final SubLObject includedP = kbs_object_p(v_object);
                        cb_utilities.cb_form(v_object, (SubLObject)cb_kbs_browser.NIL, (SubLObject)cb_kbs_browser.T);
                        if (cb_kbs_browser.NIL != assertion_handles.assertion_p(v_object)) {
                            html_utilities.html_newline((SubLObject)cb_kbs_browser.UNPROVIDED);
                        }
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_kbs_browser.$str33$_is__A_in_the_KBS_because_, (SubLObject)((cb_kbs_browser.NIL != includedP) ? cb_kbs_browser.$str34$included : cb_kbs_browser.$str35$excluded));
                        if (cb_kbs_browser.NIL != includedP) {
                            if (cb_kbs_browser.NIL != forts.fort_p(v_object)) {
                                supports = kbs_identification.why_kbs_fortP(v_object);
                            }
                            else if (cb_kbs_browser.NIL != assertion_handles.assertion_p(v_object)) {
                                supports = kbs_identification.why_kbs_assertionP(v_object);
                            }
                        }
                        else if (cb_kbs_browser.NIL != forts.fort_p(v_object)) {
                            supports = kbs_identification.why_non_kbs_fortP(v_object);
                        }
                        else if (cb_kbs_browser.NIL != assertion_handles.assertion_p(v_object)) {
                            supports = kbs_identification.why_non_kbs_assertionP(v_object);
                        }
                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        SubLObject cdolist_list_var = supports;
                        SubLObject support = (SubLObject)cb_kbs_browser.NIL;
                        support = cdolist_list_var.first();
                        while (cb_kbs_browser.NIL != cdolist_list_var) {
                            if (cb_kbs_browser.NIL != arguments.hl_support_p(support)) {
                                cb_utilities.cb_show_hl_support_readably(support, (SubLObject)cb_kbs_browser.UNPROVIDED);
                            }
                            else if (support.isString()) {
                                html_utilities.html_princ(support);
                                html_utilities.html_newline((SubLObject)cb_kbs_browser.UNPROVIDED);
                            }
                            else {
                                cb_utilities.cb_form(support, (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_kbs_browser.UNPROVIDED);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            support = cdolist_list_var.first();
                        }
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_kbs_browser.THREE_INTEGER);
                        html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_kbs_browser.$str36$_kbs_definition__);
                        html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        cb_utilities.cb_form(kbs_utilities.$kbs_definition$.getDynamicValue(thread), (SubLObject)cb_kbs_browser.NIL, (SubLObject)cb_kbs_browser.T);
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_kbs_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_kbs_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_kbs_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_kbs_browser.NIL;
    }
    
    public static SubLObject declare_cb_kbs_browser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_kbs_browser", "kbs_object_p", "KBS-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_kbs_browser", "kbs_object_image", "KBS-OBJECT-IMAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_kbs_browser", "kbs_object_image_alt", "KBS-OBJECT-IMAGE-ALT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_kbs_browser", "cb_kbs_browser_activeP", "CB-KBS-BROWSER-ACTIVE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_kbs_browser", "cb_kbs_object_p", "CB-KBS-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_kbs_browser", "cb_kbs_object_p_internal", "CB-KBS-OBJECT-P-INTERNAL", 1, 0, false);
        return (SubLObject)cb_kbs_browser.NIL;
    }
    
    public static SubLObject init_cb_kbs_browser_file() {
        return (SubLObject)cb_kbs_browser.NIL;
    }
    
    public static SubLObject setup_cb_kbs_browser_file() {
        Hashtables.sethash((SubLObject)cb_kbs_browser.$kw0$KBS_POSITIVE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_kbs_browser.$str1$kbs_positive_gif, (SubLObject)cb_kbs_browser.$str2$));
        Hashtables.sethash((SubLObject)cb_kbs_browser.$kw3$KBS_NEGATIVE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_kbs_browser.$str4$kbs_negative_gif, (SubLObject)cb_kbs_browser.$str2$));
        Hashtables.sethash((SubLObject)cb_kbs_browser.$kw5$KBS_POSITIVE_TERM, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_kbs_browser.$str6$kbs_positive_term_gif, (SubLObject)cb_kbs_browser.$str2$));
        Hashtables.sethash((SubLObject)cb_kbs_browser.$kw7$KBS_POSITIVE_TERM_DEF, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_kbs_browser.$str8$kbs_positive_term_def_gif, (SubLObject)cb_kbs_browser.$str2$));
        Hashtables.sethash((SubLObject)cb_kbs_browser.$kw9$KBS_NEGATIVE_TERM, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_kbs_browser.$str10$kbs_negative_term_gif, (SubLObject)cb_kbs_browser.$str2$));
        SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        SubLObject v_new = cb_adornments.make_adornment((SubLObject)cb_kbs_browser.$list11);
        cb_adornments._csetf_adornment_name(v_new, (SubLObject)cb_kbs_browser.$sym12$KBS_FORT_P);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_kbs_browser.$sym12$KBS_FORT_P, old, Symbols.symbol_function((SubLObject)cb_kbs_browser.EQUAL), Symbols.symbol_function((SubLObject)cb_kbs_browser.$sym13$ADORNMENT_NAME), (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED)));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = cb_adornments.make_adornment((SubLObject)cb_kbs_browser.$list14);
        cb_adornments._csetf_adornment_name(v_new, (SubLObject)cb_kbs_browser.$sym15$KBS_ASSERTION_P);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_kbs_browser.$sym15$KBS_ASSERTION_P, old, Symbols.symbol_function((SubLObject)cb_kbs_browser.EQUAL), Symbols.symbol_function((SubLObject)cb_kbs_browser.$sym13$ADORNMENT_NAME), (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED)));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = cb_adornments.make_adornment((SubLObject)cb_kbs_browser.$list16);
        cb_adornments._csetf_adornment_name(v_new, (SubLObject)cb_kbs_browser.$sym17$KBS_DEDUCTION_P);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_kbs_browser.$sym17$KBS_DEDUCTION_P, old, Symbols.symbol_function((SubLObject)cb_kbs_browser.EQUAL), Symbols.symbol_function((SubLObject)cb_kbs_browser.$sym13$ADORNMENT_NAME), (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED, (SubLObject)cb_kbs_browser.UNPROVIDED)));
        html_macros.note_cgi_handler_function((SubLObject)cb_kbs_browser.$sym18$CB_KBS_OBJECT_P, (SubLObject)cb_kbs_browser.$kw19$HTML_HANDLER);
        return (SubLObject)cb_kbs_browser.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_kbs_browser_file();
    }
    
    public void initializeVariables() {
        init_cb_kbs_browser_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_kbs_browser_file();
    }
    
    static {
        me = (SubLFile)new cb_kbs_browser();
        $kw0$KBS_POSITIVE = SubLObjectFactory.makeKeyword("KBS-POSITIVE");
        $str1$kbs_positive_gif = SubLObjectFactory.makeString("kbs-positive.gif");
        $str2$ = SubLObjectFactory.makeString("");
        $kw3$KBS_NEGATIVE = SubLObjectFactory.makeKeyword("KBS-NEGATIVE");
        $str4$kbs_negative_gif = SubLObjectFactory.makeString("kbs-negative.gif");
        $kw5$KBS_POSITIVE_TERM = SubLObjectFactory.makeKeyword("KBS-POSITIVE-TERM");
        $str6$kbs_positive_term_gif = SubLObjectFactory.makeString("kbs-positive-term.gif");
        $kw7$KBS_POSITIVE_TERM_DEF = SubLObjectFactory.makeKeyword("KBS-POSITIVE-TERM-DEF");
        $str8$kbs_positive_term_def_gif = SubLObjectFactory.makeString("kbs-positive-term-def.gif");
        $kw9$KBS_NEGATIVE_TERM = SubLObjectFactory.makeKeyword("KBS-NEGATIVE-TERM");
        $str10$kbs_negative_term_gif = SubLObjectFactory.makeString("kbs-negative-term.gif");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("FORT"), SubLObjectFactory.makeKeyword("ACTIVE-P"), SubLObjectFactory.makeSymbol("KBS-FORT-STATE-VALID?"), SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeSymbol("KBS-OBJECT-IMAGE"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeSymbol("KBS-OBJECT-IMAGE-ALT"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("CB-KBS-BROWSER-ACTIVE?"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-kbs-object-p"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Links to a page justifying the inclusion or exclusion from the current KB subset.") });
        $sym12$KBS_FORT_P = SubLObjectFactory.makeSymbol("KBS-FORT-P");
        $sym13$ADORNMENT_NAME = SubLObjectFactory.makeSymbol("ADORNMENT-NAME");
        $list14 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("ACTIVE-P"), SubLObjectFactory.makeSymbol("KBS-STATE-VALID?"), SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeSymbol("KBS-OBJECT-IMAGE"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeSymbol("KBS-OBJECT-IMAGE-ALT"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("CB-KBS-BROWSER-ACTIVE?"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-kbs-object-p"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Links to a page justifying the inclusion or exclusion from the current KB subset.") });
        $sym15$KBS_ASSERTION_P = SubLObjectFactory.makeSymbol("KBS-ASSERTION-P");
        $list16 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("DEDUCTION"), SubLObjectFactory.makeKeyword("ACTIVE-P"), SubLObjectFactory.makeSymbol("KBS-STATE-VALID?"), SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeSymbol("KBS-OBJECT-IMAGE"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeSymbol("KBS-OBJECT-IMAGE-ALT"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("CB-KBS-BROWSER-ACTIVE?"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Links to a page justifying the inclusion or exclusion from the current KB subset.") });
        $sym17$KBS_DEDUCTION_P = SubLObjectFactory.makeSymbol("KBS-DEDUCTION-P");
        $sym18$CB_KBS_OBJECT_P = SubLObjectFactory.makeSymbol("CB-KBS-OBJECT-P");
        $kw19$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str20$The_KB_subset_state_is_not_valid_ = SubLObjectFactory.makeString("The KB subset state is not valid.");
        $str21$KB_subset_Info = SubLObjectFactory.makeString("KB subset Info");
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
        $str33$_is__A_in_the_KBS_because_ = SubLObjectFactory.makeString(" is ~A in the KBS because:");
        $str34$included = SubLObjectFactory.makeString("included");
        $str35$excluded = SubLObjectFactory.makeString("excluded");
        $str36$_kbs_definition__ = SubLObjectFactory.makeString("*kbs-definition*:");
    }
}

/*

	Total time: 136 ms
	
*/