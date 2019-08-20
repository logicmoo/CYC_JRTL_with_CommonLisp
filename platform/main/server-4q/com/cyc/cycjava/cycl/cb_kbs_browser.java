/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_assertion;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_hl_support_readably;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-KBS-BROWSER
 * source file: /cyc/top/cycl/cb-kbs-browser.lisp
 * created:     2019/07/03 17:38:14
 */
public final class cb_kbs_browser extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt2$ = makeString("");

    public static final SubLFile me = new cb_kbs_browser();



    static private final SubLString $str1$kbs_positive_gif = makeString("kbs-positive.gif");

    static private final SubLString $str2$ = makeString("");

    static private final SubLString $str4$kbs_negative_gif = makeString("kbs-negative.gif");

    private static final SubLSymbol $KBS_POSITIVE_TERM = makeKeyword("KBS-POSITIVE-TERM");

    static private final SubLString $str6$kbs_positive_term_gif = makeString("kbs-positive-term.gif");

    private static final SubLSymbol $KBS_POSITIVE_TERM_DEF = makeKeyword("KBS-POSITIVE-TERM-DEF");

    static private final SubLString $str8$kbs_positive_term_def_gif = makeString("kbs-positive-term-def.gif");

    private static final SubLSymbol $KBS_NEGATIVE_TERM = makeKeyword("KBS-NEGATIVE-TERM");

    static private final SubLString $str10$kbs_negative_term_gif = makeString("kbs-negative-term.gif");

    static private final SubLList $list11 = list(new SubLObject[]{ $TYPE, $FORT, makeKeyword("ACTIVE-P"), makeSymbol("KBS-FORT-STATE-VALID?"), makeKeyword("IMAGE"), makeSymbol("KBS-OBJECT-IMAGE"), makeKeyword("IMAGE-ALT"), makeSymbol("KBS-OBJECT-IMAGE-ALT"), makeKeyword("EFFECTIVE-FN"), makeSymbol("CB-KBS-BROWSER-ACTIVE?"), makeKeyword("HANDLER"), makeString("cb-kbs-object-p"), makeKeyword("COMMENT"), makeString("Links to a page justifying the inclusion or exclusion from the current KB subset.") });

    private static final SubLSymbol KBS_FORT_P = makeSymbol("KBS-FORT-P");

    private static final SubLSymbol ADORNMENT_NAME = makeSymbol("ADORNMENT-NAME");

    static private final SubLList $list14 = list(new SubLObject[]{ $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), makeSymbol("KBS-STATE-VALID?"), makeKeyword("IMAGE"), makeSymbol("KBS-OBJECT-IMAGE"), makeKeyword("IMAGE-ALT"), makeSymbol("KBS-OBJECT-IMAGE-ALT"), makeKeyword("EFFECTIVE-FN"), makeSymbol("CB-KBS-BROWSER-ACTIVE?"), makeKeyword("HANDLER"), makeString("cb-kbs-object-p"), makeKeyword("COMMENT"), makeString("Links to a page justifying the inclusion or exclusion from the current KB subset.") });

    private static final SubLSymbol KBS_ASSERTION_P = makeSymbol("KBS-ASSERTION-P");

    static private final SubLList $list16 = list(new SubLObject[]{ $TYPE, makeKeyword("DEDUCTION"), makeKeyword("ACTIVE-P"), makeSymbol("KBS-STATE-VALID?"), makeKeyword("IMAGE"), makeSymbol("KBS-OBJECT-IMAGE"), makeKeyword("IMAGE-ALT"), makeSymbol("KBS-OBJECT-IMAGE-ALT"), makeKeyword("EFFECTIVE-FN"), makeSymbol("CB-KBS-BROWSER-ACTIVE?"), makeKeyword("COMMENT"), makeString("Links to a page justifying the inclusion or exclusion from the current KB subset.") });

    private static final SubLSymbol KBS_DEDUCTION_P = makeSymbol("KBS-DEDUCTION-P");

    private static final SubLSymbol CB_KBS_OBJECT_P = makeSymbol("CB-KBS-OBJECT-P");

    private static final SubLString $str20$The_KB_subset_state_is_not_valid_ = makeString("The KB subset state is not valid.");

    private static final SubLString $$$KB_subset_Info = makeString("KB subset Info");

    private static final SubLString $str22$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str23$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str28$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str33$_is__A_in_the_KBS_because_ = makeString(" is ~A in the KBS because:");

    private static final SubLString $$$included = makeString("included");

    private static final SubLString $$$excluded = makeString("excluded");

    private static final SubLString $str36$_kbs_definition__ = makeString("*kbs-definition*:");

    // Definitions
    public static final SubLObject kbs_object_p_alt(SubLObject v_object) {
        if (NIL == kbs_identification.kbs_state_validP()) {
            return NIL;
        }
        if (NIL != forts.fort_p(v_object)) {
            return kbs_identification.kbs_fort_p(v_object);
        } else {
            if (NIL != assertion_handles.assertion_p(v_object)) {
                return kbs_identification.kbs_assertion_p(v_object);
            } else {
                if (NIL != deduction_handles.deduction_p(v_object)) {
                    return kbs_identification.kbs_deduction_p(v_object);
                } else {
                    return NIL;
                }
            }
        }
    }

    // Definitions
    public static SubLObject kbs_object_p(final SubLObject v_object) {
        if (NIL == kbs_identification.kbs_fort_state_validP()) {
            return NIL;
        }
        if (NIL != forts.fort_p(v_object)) {
            return kbs_identification.kbs_fort_p(v_object);
        }
        if (NIL == kbs_identification.kbs_state_validP()) {
            return NIL;
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return kbs_identification.kbs_assertion_p(v_object);
        }
        if (NIL != deduction_handles.deduction_p(v_object)) {
            return kbs_identification.kbs_deduction_p(v_object);
        }
        return NIL;
    }

    public static final SubLObject kbs_object_image_alt_alt(SubLObject v_object) {
        if (NIL != com.cyc.cycjava.cycl.cb_kbs_browser.kbs_object_p(v_object)) {
            return cyc_file_dependencies.cb_get_icon_alt_string($KBS_POSITIVE);
        } else {
            return cyc_file_dependencies.cb_get_icon_alt_string($KBS_NEGATIVE);
        }
    }


    public static SubLObject kbs_object_image_alt(final SubLObject v_object) {
        if (NIL != kbs_object_p(v_object)) {
            return cyc_file_dependencies.cb_get_icon_alt_string($KBS_POSITIVE);
        }
        return cyc_file_dependencies.cb_get_icon_alt_string($KBS_NEGATIVE);
    }
    

    public static SubLObject kbs_object_image(final SubLObject v_object) {
        if (NIL != assertion_handles.assertion_p(v_object)) {
            if (NIL != kbs_object_p(v_object)) {
                return cyc_file_dependencies.cb_icon_src($KBS_POSITIVE);
            }
            return cyc_file_dependencies.cb_icon_src($KBS_NEGATIVE);
        } else
            if (NIL != deduction_handles.deduction_p(v_object)) {
                if (NIL != kbs_object_p(v_object)) {
                    return cyc_file_dependencies.cb_icon_src($KBS_POSITIVE);
                }
                return cyc_file_dependencies.cb_icon_src($KBS_NEGATIVE);
            } else {
                if (NIL == kbs_object_p(v_object)) {
                    return cyc_file_dependencies.cb_icon_src($KBS_NEGATIVE_TERM);
                }
                if (NIL != kbs_identification.kbs_definitional_fort_p(v_object)) {
                    return cyc_file_dependencies.cb_icon_src($KBS_POSITIVE_TERM_DEF);
                }
                return cyc_file_dependencies.cb_icon_src($KBS_POSITIVE_TERM);
            }

    }


    public static final SubLObject cb_kbs_browser_activeP_alt(SubLObject v_object) {
        return v_object;
    }

    public static SubLObject cb_kbs_browser_activeP(final SubLObject v_object) {
        return v_object;
    }

    public static final SubLObject cb_kbs_object_p_alt(SubLObject args) {
        return com.cyc.cycjava.cycl.cb_kbs_browser.cb_kbs_object_p_internal(args.first());
    }

    public static SubLObject cb_kbs_object_p(final SubLObject args) {
        return cb_kbs_object_p_internal(args.first());
    }

    public static final SubLObject cb_kbs_object_p_internal_alt(SubLObject object_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == kbs_identification.kbs_state_validP()) {
                cb_error($str_alt19$The_KB_subset_state_is_not_valid_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject v_object = (NIL != string_utilities.integer_string_p(object_string)) ? ((SubLObject) (cb_guess_assertion(object_string))) : cb_guess_term(object_string, UNPROVIDED);
                SubLObject supports = NIL;
                SubLObject title_var = $$$KB_subset_Info;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt23$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            html_princ(title_var);
                                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        {
                                            SubLObject includedP = com.cyc.cycjava.cycl.cb_kbs_browser.kbs_object_p(v_object);
                                            cb_form(v_object, NIL, T);
                                            if (NIL != assertion_handles.assertion_p(v_object)) {
                                                html_newline(UNPROVIDED);
                                            }
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_is__A_in_the_KBS_because_, NIL != includedP ? ((SubLObject) ($$$included)) : $$$excluded);
                                            if (NIL != includedP) {
                                                if (NIL != forts.fort_p(v_object)) {
                                                    supports = kbs_identification.why_kbs_fortP(v_object);
                                                } else {
                                                    if (NIL != assertion_handles.assertion_p(v_object)) {
                                                        supports = kbs_identification.why_kbs_assertionP(v_object);
                                                    }
                                                }
                                            } else {
                                                if (NIL != forts.fort_p(v_object)) {
                                                    supports = kbs_identification.why_non_kbs_fortP(v_object);
                                                } else {
                                                    if (NIL != assertion_handles.assertion_p(v_object)) {
                                                        supports = kbs_identification.why_non_kbs_assertionP(v_object);
                                                    }
                                                }
                                            }
                                        }
                                        html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = supports;
                                            SubLObject support = NIL;
                                            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                                if (NIL != arguments.hl_support_p(support)) {
                                                    cb_show_hl_support_readably(support, UNPROVIDED);
                                                } else {
                                                    if (support.isString()) {
                                                        html_princ(support);
                                                        html_newline(UNPROVIDED);
                                                    } else {
                                                        cb_form(support, UNPROVIDED, UNPROVIDED);
                                                        html_newline(UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                        html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                        html_newline(THREE_INTEGER);
                                        html_markup(html_macros.$html_code_head$.getGlobalValue());
                                        html_princ($str_alt27$_kbs_definition__);
                                        html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                        cb_form(kbs_utilities.$kbs_definition$.getDynamicValue(thread), NIL, T);
                                        html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_kbs_object_p_internal(final SubLObject object_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kbs_identification.kbs_state_validP()) {
            cb_error($str20$The_KB_subset_state_is_not_valid_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject v_object = (NIL != string_utilities.integer_string_p(object_string)) ? cb_guess_assertion(object_string) : cb_guess_term(object_string, UNPROVIDED);
        SubLObject supports = NIL;
        final SubLObject title_var = $$$KB_subset_Info;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str23$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str28$yui_skin_sam);
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
                        final SubLObject includedP = kbs_object_p(v_object);
                        cb_form(v_object, NIL, T);
                        if (NIL != assertion_handles.assertion_p(v_object)) {
                            html_newline(UNPROVIDED);
                        }
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_is__A_in_the_KBS_because_, NIL != includedP ? $$$included : $$$excluded);
                        if (NIL != includedP) {
                            if (NIL != forts.fort_p(v_object)) {
                                supports = kbs_identification.why_kbs_fortP(v_object);
                            } else
                                if (NIL != assertion_handles.assertion_p(v_object)) {
                                    supports = kbs_identification.why_kbs_assertionP(v_object);
                                }

                        } else
                            if (NIL != forts.fort_p(v_object)) {
                                supports = kbs_identification.why_non_kbs_fortP(v_object);
                            } else
                                if (NIL != assertion_handles.assertion_p(v_object)) {
                                    supports = kbs_identification.why_non_kbs_assertionP(v_object);
                                }


                        html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        SubLObject cdolist_list_var = supports;
                        SubLObject support = NIL;
                        support = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != arguments.hl_support_p(support)) {
                                cb_show_hl_support_readably(support, UNPROVIDED);
                            } else
                                if (support.isString()) {
                                    html_princ(support);
                                    html_newline(UNPROVIDED);
                                } else {
                                    cb_form(support, UNPROVIDED, UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                }

                            cdolist_list_var = cdolist_list_var.rest();
                            support = cdolist_list_var.first();
                        } 
                        html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        html_newline(THREE_INTEGER);
                        html_markup(html_macros.$html_code_head$.getGlobalValue());
                        html_princ($str36$_kbs_definition__);
                        html_markup(html_macros.$html_code_tail$.getGlobalValue());
                        html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        cb_form(kbs_utilities.$kbs_definition$.getDynamicValue(thread), NIL, T);
                        html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
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

    static private final SubLString $str_alt1$kbs_positive_gif = makeString("kbs-positive.gif");

    static private final SubLString $str_alt4$kbs_negative_gif = makeString("kbs-negative.gif");

    static private final SubLString $str_alt6$kbs_positive_term_gif = makeString("kbs-positive-term.gif");

    static private final SubLString $str_alt8$kbs_positive_term_def_gif = makeString("kbs-positive-term-def.gif");

    static private final SubLString $str_alt10$kbs_negative_term_gif = makeString("kbs-negative-term.gif");

    static private final SubLList $list_alt11 = list(new SubLObject[]{ $TYPE, $FORT, makeKeyword("ACTIVE-P"), makeSymbol("KBS-STATE-VALID?"), makeKeyword("IMAGE"), makeSymbol("KBS-OBJECT-IMAGE"), makeKeyword("IMAGE-ALT"), makeSymbol("KBS-OBJECT-IMAGE-ALT"), makeKeyword("EFFECTIVE-FN"), makeSymbol("CB-KBS-BROWSER-ACTIVE?"), makeKeyword("HANDLER"), makeString("cb-kbs-object-p"), makeKeyword("COMMENT"), makeString("Links to a page justifying the inclusion or exclusion from the current KB subset.") });

    public static SubLObject declare_cb_kbs_browser_file() {
        declareFunction("kbs_object_p", "KBS-OBJECT-P", 1, 0, false);
        declareFunction("kbs_object_image", "KBS-OBJECT-IMAGE", 1, 0, false);
        declareFunction("kbs_object_image_alt", "KBS-OBJECT-IMAGE-ALT", 1, 0, false);
        declareFunction("cb_kbs_browser_activeP", "CB-KBS-BROWSER-ACTIVE?", 1, 0, false);
        declareFunction("cb_kbs_object_p", "CB-KBS-OBJECT-P", 1, 0, false);
        declareFunction("cb_kbs_object_p_internal", "CB-KBS-OBJECT-P-INTERNAL", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt14 = list(new SubLObject[]{ $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), makeSymbol("KBS-STATE-VALID?"), makeKeyword("IMAGE"), makeSymbol("KBS-OBJECT-IMAGE"), makeKeyword("IMAGE-ALT"), makeSymbol("KBS-OBJECT-IMAGE-ALT"), makeKeyword("EFFECTIVE-FN"), makeSymbol("CB-KBS-BROWSER-ACTIVE?"), makeKeyword("HANDLER"), makeString("cb-kbs-object-p"), makeKeyword("COMMENT"), makeString("Links to a page justifying the inclusion or exclusion from the current KB subset.") });

    public static SubLObject init_cb_kbs_browser_file() {
        return NIL;
    }

    static private final SubLList $list_alt16 = list(new SubLObject[]{ $TYPE, makeKeyword("DEDUCTION"), makeKeyword("ACTIVE-P"), makeSymbol("KBS-STATE-VALID?"), makeKeyword("IMAGE"), makeSymbol("KBS-OBJECT-IMAGE"), makeKeyword("IMAGE-ALT"), makeSymbol("KBS-OBJECT-IMAGE-ALT"), makeKeyword("EFFECTIVE-FN"), makeSymbol("CB-KBS-BROWSER-ACTIVE?"), makeKeyword("COMMENT"), makeString("Links to a page justifying the inclusion or exclusion from the current KB subset.") });

    public static final SubLObject setup_cb_kbs_browser_file_alt() {
        sethash($KBS_POSITIVE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt1$kbs_positive_gif, $str_alt2$));
        sethash($KBS_NEGATIVE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt4$kbs_negative_gif, $str_alt2$));
        sethash($KBS_POSITIVE_TERM, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt6$kbs_positive_term_gif, $str_alt2$));
        sethash($KBS_POSITIVE_TERM_DEF, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt8$kbs_positive_term_def_gif, $str_alt2$));
        sethash($KBS_NEGATIVE_TERM, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt10$kbs_negative_term_gif, $str_alt2$));
        {
            SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
            SubLObject v_new = cb_adornments.make_adornment($list_alt11);
            cb_adornments._csetf_adornment_name(v_new, KBS_FORT_P);
            cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_FORT_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
            SubLObject v_new = cb_adornments.make_adornment($list_alt14);
            cb_adornments._csetf_adornment_name(v_new, KBS_ASSERTION_P);
            cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_ASSERTION_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
            SubLObject v_new = cb_adornments.make_adornment($list_alt16);
            cb_adornments._csetf_adornment_name(v_new, KBS_DEDUCTION_P);
            cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_DEDUCTION_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        html_macros.note_html_handler_function(CB_KBS_OBJECT_P);
        return NIL;
    }

    public static SubLObject setup_cb_kbs_browser_file() {
        if (SubLFiles.USE_V1) {
            sethash($KBS_POSITIVE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str1$kbs_positive_gif, $str2$));
            sethash($KBS_NEGATIVE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str4$kbs_negative_gif, $str2$));
            sethash($KBS_POSITIVE_TERM, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str6$kbs_positive_term_gif, $str2$));
            sethash($KBS_POSITIVE_TERM_DEF, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str8$kbs_positive_term_def_gif, $str2$));
            sethash($KBS_NEGATIVE_TERM, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str10$kbs_negative_term_gif, $str2$));
            SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
            SubLObject v_new = cb_adornments.make_adornment($list11);
            cb_adornments._csetf_adornment_name(v_new, KBS_FORT_P);
            cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_FORT_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            old = cb_adornments.$cb_adornment_table$.getGlobalValue();
            v_new = cb_adornments.make_adornment($list14);
            cb_adornments._csetf_adornment_name(v_new, KBS_ASSERTION_P);
            cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_ASSERTION_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            old = cb_adornments.$cb_adornment_table$.getGlobalValue();
            v_new = cb_adornments.make_adornment($list16);
            cb_adornments._csetf_adornment_name(v_new, KBS_DEDUCTION_P);
            cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_DEDUCTION_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            html_macros.note_cgi_handler_function(CB_KBS_OBJECT_P, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
                SubLObject v_new = cb_adornments.make_adornment($list_alt11);
                cb_adornments._csetf_adornment_name(v_new, KBS_FORT_P);
                cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_FORT_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
                SubLObject v_new = cb_adornments.make_adornment($list_alt14);
                cb_adornments._csetf_adornment_name(v_new, KBS_ASSERTION_P);
                cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_ASSERTION_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
                SubLObject v_new = cb_adornments.make_adornment($list_alt16);
                cb_adornments._csetf_adornment_name(v_new, KBS_DEDUCTION_P);
                cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_DEDUCTION_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            html_macros.note_html_handler_function(CB_KBS_OBJECT_P);
        }
        return NIL;
    }

    public static SubLObject setup_cb_kbs_browser_file_Previous() {
        sethash($KBS_POSITIVE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str1$kbs_positive_gif, $str2$));
        sethash($KBS_NEGATIVE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str4$kbs_negative_gif, $str2$));
        sethash($KBS_POSITIVE_TERM, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str6$kbs_positive_term_gif, $str2$));
        sethash($KBS_POSITIVE_TERM_DEF, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str8$kbs_positive_term_def_gif, $str2$));
        sethash($KBS_NEGATIVE_TERM, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str10$kbs_negative_term_gif, $str2$));
        SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        SubLObject v_new = cb_adornments.make_adornment($list11);
        cb_adornments._csetf_adornment_name(v_new, KBS_FORT_P);
        cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_FORT_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = cb_adornments.make_adornment($list14);
        cb_adornments._csetf_adornment_name(v_new, KBS_ASSERTION_P);
        cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_ASSERTION_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = cb_adornments.make_adornment($list16);
        cb_adornments._csetf_adornment_name(v_new, KBS_DEDUCTION_P);
        cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(KBS_DEDUCTION_P, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        html_macros.note_cgi_handler_function(CB_KBS_OBJECT_P, $HTML_HANDLER);
        return NIL;
    }

    static private final SubLString $str_alt19$The_KB_subset_state_is_not_valid_ = makeString("The KB subset state is not valid.");

    static private final SubLString $str_alt22$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt23$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt24$_is__A_in_the_KBS_because_ = makeString(" is ~A in the KBS because:");

    static private final SubLString $str_alt27$_kbs_definition__ = makeString("*kbs-definition*:");

    @Override
    public void declareFunctions() {
        declare_cb_kbs_browser_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_kbs_browser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_kbs_browser_file();
    }

    static {
    }
}

/**
 * Total time: 136 ms
 */
