/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_assertion;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_assertion_readably;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_fi_error;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_help_definitions$;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_icon_definitions$;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_doc_string;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
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
 * module:      CB-NON-WFF
 * source file: /cyc/top/cycl/cb-non-wff.lisp
 * created:     2019/07/03 17:38:08
 */
public final class cb_non_wff extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cb_non_wff();

 public static final String myName = "com.cyc.cycjava.cycl.cb_non_wff";


    static private final SubLString $str1$nonwff_gif = makeString("nonwff.gif");

    static private final SubLString $str2$_Not_WFF__ = makeString("[Not WFF!]");

    static private final SubLList $list3 = list(new SubLObject[]{ $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("NONWFF"), makeKeyword("IMAGE-ALT"), makeString("[Not WFF!]"), makeKeyword("EFFECTIVE-FN"), makeSymbol("NON-WFF-CACHED-P"), makeKeyword("HANDLER"), makeString("cb-enw"), makeKeyword("COMMENT"), makeString("Links to an explanation of why this assertion is not WFF.") });

    private static final SubLSymbol NON_WFF = makeSymbol("NON-WFF");

    private static final SubLSymbol ADORNMENT_NAME = makeSymbol("ADORNMENT-NAME");

    private static final SubLSymbol CB_ENW = makeSymbol("CB-ENW");

    private static final SubLList $list8 = list(makeSymbol("ASSERTION-ID"));

    private static final SubLString $str9$Could_not_determine_an_assertion_ = makeString("Could not determine an assertion from ~a");

    private static final SubLSymbol CB_EXPLAIN_NON_WFF = makeSymbol("CB-EXPLAIN-NON-WFF");

    private static final SubLList $list11 = list(makeSymbol("ID"));

    private static final SubLString $str12$_a_does_not_specify_an_assertion = makeString("~a does not specify an assertion");

    private static final SubLSymbol CB_WFF_ASSERTION = makeSymbol("CB-WFF-ASSERTION");

    private static final SubLString $str14$_WFF_Check_ = makeString("[WFF Check]");

    private static final SubLString $str16$cb_wff_assertion__a = makeString("cb-wff-assertion&~a");

    private static final SubLSymbol CB_LINK_WFF_ASSERTION = makeSymbol("CB-LINK-WFF-ASSERTION");

    private static final SubLSymbol WFF_CHECK_ASSERTIONS_VIA_TL = makeSymbol("WFF-CHECK-ASSERTIONS-VIA-TL");

    private static final SubLSymbol $CB_WFF_CHECK_FORMULA = makeKeyword("CB-WFF-CHECK-FORMULA");

    private static final SubLString $str22$cb_wff_check_formula_html = makeString("cb-wff-check-formula.html");

    private static final SubLString $str23$Assertion_not_Well_Formed = makeString("Assertion not Well-Formed");

    private static final SubLString $str24$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str25$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str30$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $str37$Assertion___ = makeString("Assertion : ");

    private static final SubLString $str38$Explanation___ = makeString("Explanation : ");

    private static final SubLString $str39$Assertion_is_Well_Formed = makeString("Assertion is Well-Formed");

    private static final SubLString $str40$WFF_Status___ = makeString("WFF-Status : ");

    private static final SubLString $$$OK = makeString("OK");

    // Definitions
    public static final SubLObject cb_enw_alt(SubLObject args) {
        return com.cyc.cycjava.cycl.cb_non_wff.cb_explain_non_wff(args);
    }

    // Definitions
    public static SubLObject cb_enw(final SubLObject args) {
        return cb_explain_non_wff(args);
    }

    public static final SubLObject cb_explain_non_wff_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject assertion_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            assertion_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject assertion = cb_guess_assertion(assertion_id);
                    if (NIL == assertion_handles.assertion_p(assertion)) {
                        return cb_error($str_alt8$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return com.cyc.cycjava.cycl.cb_non_wff.cb_explain_non_wff_int(assertion);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    public static SubLObject cb_explain_non_wff(final SubLObject args) {
        SubLObject assertion_id = NIL;
        destructuring_bind_must_consp(args, args, $list8);
        assertion_id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list8);
            return NIL;
        }
        final SubLObject assertion = cb_guess_assertion(assertion_id);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            return cb_error($str9$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_explain_non_wff_int(assertion);
    }

    public static final SubLObject cb_explain_non_wff_int_alt(SubLObject assertion) {
        cb_tools.cb_add_to_assertion_history(assertion);
        return com.cyc.cycjava.cycl.cb_non_wff.cb_wff_check_assertion_int(assertion);
    }

    public static SubLObject cb_explain_non_wff_int(final SubLObject assertion) {
        cb_tools.cb_add_to_assertion_history(assertion);
        return cb_wff_check_assertion_int(assertion);
    }

    public static final SubLObject cb_wff_assertion_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject assertion = cb_guess_assertion(id);
                    if (NIL == assertion_handles.assertion_p(assertion)) {
                        cb_error($str_alt11$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                    com.cyc.cycjava.cycl.cb_non_wff.cb_wff_check_assertion_int(assertion);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt10);
            }
        }
        return NIL;
    }

    public static SubLObject cb_wff_assertion(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject id = NIL;
        destructuring_bind_must_consp(current, datum, $list11);
        id = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject assertion = cb_guess_assertion(id);
            if (NIL == assertion_handles.assertion_p(assertion)) {
                cb_error($str12$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            cb_wff_check_assertion_int(assertion);
        } else {
            cdestructuring_bind_error(datum, $list11);
        }
        return NIL;
    }

    public static final SubLObject cb_link_wff_assertion_alt(SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt13$_WFF_Check_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt15$cb_wff_assertion__a, assertion_handles.assertion_id(assertion));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_wff_assertion(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str14$_WFF_Check_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str16$cb_wff_assertion__a, assertion_handles.assertion_id(assertion));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_wff_check_assertion_int_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence = canon_tl.assertion_tl_formula(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                thread.resetMultipleValues();
                {
                    SubLObject wffP = ke.ke_eval_now(list(WFF_CHECK_ASSERTIONS_VIA_TL, list(QUOTE, sentence), list(QUOTE, mt)));
                    SubLObject fi_error = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != wffP) {
                        return com.cyc.cycjava.cycl.cb_non_wff.cb_wff_check_assertion_ok(assertion);
                    } else {
                        if (NIL != fi_error) {
                            return cb_show_fi_error(fi_error);
                        } else {
                            return com.cyc.cycjava.cycl.cb_non_wff.cb_explain_why_assertion_not_wff(assertion);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cb_wff_check_assertion_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = canon_tl.assertion_tl_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        thread.resetMultipleValues();
        final SubLObject wffP = ke.ke_eval_now(canon_tl.tl_encapsulate(list(WFF_CHECK_ASSERTIONS_VIA_TL, list(QUOTE, sentence), list(QUOTE, mt))));
        final SubLObject fi_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != wffP) {
            return cb_wff_check_assertion_ok(assertion);
        }
        if (NIL != fi_error) {
            return cb_show_fi_error(fi_error);
        }
        return cb_explain_why_assertion_not_wff(assertion);
    }

    public static final SubLObject cb_explain_why_assertion_not_wff_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject title_var = $str_alt22$Assertion_not_Well_Formed;
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
                                    html_markup($str_alt25$yui_skin_sam);
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
                                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                cb_help_preamble($CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED);
                                                cb_back_button($SELF, $$$Back);
                                                html_newline(TWO_INTEGER);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_princ($str_alt28$Assertion___);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_newline(UNPROVIDED);
                                                cb_show_assertion_readably(assertion, T, T);
                                                html_macros.verify_not_within_html_pre();
                                                html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                {
                                                    SubLObject _prev_bind_0_4 = html_macros.$within_html_pre$.currentBinding(thread);
                                                    try {
                                                        html_macros.$within_html_pre$.bind(T, thread);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt29$Explanation___);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        html_princ_doc_string(wff.explanation_of_why_not_wff(sentence, mt, UNPROVIDED), UNPROVIDED);
                                                    } finally {
                                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
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

    public static SubLObject cb_explain_why_assertion_not_wff(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject title_var = $str23$Assertion_not_Well_Formed;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str24$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str25$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str30$yui_skin_sam);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED);
                            cb_back_button($SELF, $$$Back);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str37$Assertion___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_show_assertion_readably(assertion, T, T);
                            html_macros.verify_not_within_html_pre();
                            html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$6 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind(T, thread);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str38$Explanation___);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_princ_doc_string(wff.explanation_of_why_not_wff(sentence, mt, UNPROVIDED), UNPROVIDED);
                            } finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
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

    public static final SubLObject cb_wff_check_assertion_ok_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $str_alt30$Assertion_is_Well_Formed;
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
                            SubLObject _prev_bind_0_5 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt25$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                cb_help_preamble($CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED);
                                                cb_back_button($SELF, $$$Back);
                                                html_newline(TWO_INTEGER);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_princ($str_alt28$Assertion___);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_newline(UNPROVIDED);
                                                cb_show_assertion_readably(assertion, T, T);
                                                html_newline(TWO_INTEGER);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_princ($str_alt31$WFF_Status___);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_princ($$$OK);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_5, thread);
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

    public static SubLObject cb_wff_check_assertion_ok(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str39$Assertion_is_Well_Formed;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str24$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str25$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str30$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED);
                            cb_back_button($SELF, $$$Back);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str37$Assertion___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_show_assertion_readably(assertion, T, T);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str40$WFF_Status___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_princ($$$OK);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLString $str_alt1$nonwff_gif = makeString("nonwff.gif");

    static private final SubLString $str_alt2$_Not_WFF__ = makeString("[Not WFF!]");

    static private final SubLList $list_alt3 = list(new SubLObject[]{ $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("NONWFF"), makeKeyword("IMAGE-ALT"), makeString("[Not WFF!]"), makeKeyword("EFFECTIVE-FN"), makeSymbol("NON-WFF-CACHED-P"), makeKeyword("HANDLER"), makeString("cb-enw"), makeKeyword("COMMENT"), makeString("Links to an explanation of why this assertion is not WFF.") });

    static private final SubLList $list_alt7 = list(makeSymbol("ASSERTION-ID"));

    static private final SubLString $str_alt8$Could_not_determine_an_assertion_ = makeString("Could not determine an assertion from ~a");

    static private final SubLList $list_alt10 = list(makeSymbol("ID"));

    static private final SubLString $str_alt11$_a_does_not_specify_an_assertion = makeString("~a does not specify an assertion");

    public static SubLObject declare_cb_non_wff_file() {
        declareFunction("cb_enw", "CB-ENW", 1, 0, false);
        declareFunction("cb_explain_non_wff", "CB-EXPLAIN-NON-WFF", 1, 0, false);
        declareFunction("cb_explain_non_wff_int", "CB-EXPLAIN-NON-WFF-INT", 1, 0, false);
        declareFunction("cb_wff_assertion", "CB-WFF-ASSERTION", 0, 1, false);
        declareFunction("cb_link_wff_assertion", "CB-LINK-WFF-ASSERTION", 1, 1, false);
        declareFunction("cb_wff_check_assertion_int", "CB-WFF-CHECK-ASSERTION-INT", 1, 0, false);
        declareFunction("cb_explain_why_assertion_not_wff", "CB-EXPLAIN-WHY-ASSERTION-NOT-WFF", 1, 0, false);
        declareFunction("cb_wff_check_assertion_ok", "CB-WFF-CHECK-ASSERTION-OK", 1, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt13$_WFF_Check_ = makeString("[WFF Check]");

    static private final SubLString $str_alt15$cb_wff_assertion__a = makeString("cb-wff-assertion&~a");

    static private final SubLString $str_alt21$cb_wff_check_formula_html = makeString("cb-wff-check-formula.html");

    public static SubLObject init_cb_non_wff_file() {
        return NIL;
    }

    static private final SubLString $str_alt22$Assertion_not_Well_Formed = makeString("Assertion not Well-Formed");

    public static final SubLObject setup_cb_non_wff_file_alt() {
        sethash($NONWFF, $cb_icon_definitions$.getGlobalValue(), list($str_alt1$nonwff_gif, $str_alt2$_Not_WFF__));
        {
            SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
            SubLObject v_new = cb_adornments.make_adornment($list_alt3);
            cb_adornments._csetf_adornment_name(v_new, NON_WFF);
            cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(NON_WFF, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        html_macros.note_html_handler_function(CB_ENW);
        html_macros.note_html_handler_function(CB_EXPLAIN_NON_WFF);
        html_macros.note_html_handler_function(CB_WFF_ASSERTION);
        setup_cb_link_method($WFF_ASSERTION, CB_LINK_WFF_ASSERTION, TWO_INTEGER);
        sethash($CB_WFF_CHECK_FORMULA, $cb_help_definitions$.getGlobalValue(), list($str_alt21$cb_wff_check_formula_html, NIL));
        return NIL;
    }

    public static SubLObject setup_cb_non_wff_file() {
        if (SubLFiles.USE_V1) {
            sethash($NONWFF, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str1$nonwff_gif, $str2$_Not_WFF__));
            final SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
            final SubLObject v_new = cb_adornments.make_adornment($list3);
            cb_adornments._csetf_adornment_name(v_new, NON_WFF);
            cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(NON_WFF, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            html_macros.note_cgi_handler_function(CB_ENW, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_EXPLAIN_NON_WFF, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_WFF_ASSERTION, $HTML_HANDLER);
            setup_cb_link_method($WFF_ASSERTION, CB_LINK_WFF_ASSERTION, TWO_INTEGER);
            sethash($CB_WFF_CHECK_FORMULA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str22$cb_wff_check_formula_html, NIL));
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
                SubLObject v_new = cb_adornments.make_adornment($list_alt3);
                cb_adornments._csetf_adornment_name(v_new, NON_WFF);
                cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(NON_WFF, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            html_macros.note_html_handler_function(CB_ENW);
            html_macros.note_html_handler_function(CB_EXPLAIN_NON_WFF);
            html_macros.note_html_handler_function(CB_WFF_ASSERTION);
            sethash($CB_WFF_CHECK_FORMULA, $cb_help_definitions$.getGlobalValue(), list($str_alt21$cb_wff_check_formula_html, NIL));
        }
        return NIL;
    }

    public static SubLObject setup_cb_non_wff_file_Previous() {
        sethash($NONWFF, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str1$nonwff_gif, $str2$_Not_WFF__));
        final SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        final SubLObject v_new = cb_adornments.make_adornment($list3);
        cb_adornments._csetf_adornment_name(v_new, NON_WFF);
        cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(NON_WFF, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        html_macros.note_cgi_handler_function(CB_ENW, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_EXPLAIN_NON_WFF, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_WFF_ASSERTION, $HTML_HANDLER);
        setup_cb_link_method($WFF_ASSERTION, CB_LINK_WFF_ASSERTION, TWO_INTEGER);
        sethash($CB_WFF_CHECK_FORMULA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str22$cb_wff_check_formula_html, NIL));
        return NIL;
    }

    static private final SubLString $str_alt24$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt25$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt28$Assertion___ = makeString("Assertion : ");

    static private final SubLString $str_alt29$Explanation___ = makeString("Explanation : ");

    static private final SubLString $str_alt30$Assertion_is_Well_Formed = makeString("Assertion is Well-Formed");

    static private final SubLString $str_alt31$WFF_Status___ = makeString("WFF-Status : ");

    @Override
    public void declareFunctions() {
        declare_cb_non_wff_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_non_wff_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_non_wff_file();
    }

    static {
    }
}

/**
 * Total time: 137 ms
 */
