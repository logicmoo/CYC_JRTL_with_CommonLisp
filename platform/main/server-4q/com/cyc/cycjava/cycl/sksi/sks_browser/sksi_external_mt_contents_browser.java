/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sks_browser;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-EXTERNAL-MT-CONTENTS-BROWSER
 * source file: /cyc/top/cycl/sksi/sks-browser/sksi-external-mt-contents-browser.lisp
 * created:     2019/07/03 17:38:35
 */
public final class sksi_external_mt_contents_browser extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_external_mt_contents_browser();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_mt_contents_browser";


    static private final SubLString $str1$sksi_external_mt_contents__A = makeString("sksi-external-mt-contents&~A");

    static private final SubLString $$$External_Microtheory_Contents = makeString("External Microtheory Contents");

    static private final SubLList $list3 = list(makeSymbol("PREDICATE"), makeSymbol("COUNT"));

    static private final SubLString $str4$__a = makeString("&~a");

    static private final SubLString $str5$___a_ = makeString(" (~a)");

    static private final SubLString $str6$__N_A_ = makeString(" (N/A)");

    private static final SubLSymbol $SKSI_EXTERNAL_MT_CONTENTS = makeKeyword("SKSI-EXTERNAL-MT-CONTENTS");

    private static final SubLSymbol CB_LINK_SKSI_EXTERNAL_MT_CONTENTS = makeSymbol("CB-LINK-SKSI-EXTERNAL-MT-CONTENTS");

    static private final SubLList $list9 = list(makeSymbol("INDEX-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("PRED-SPEC"));

    static private final SubLString $str10$Could_not_determine_an_index_hook = makeString("Could not determine an index-hook from ~a");

    static private final SubLString $str11$Could_not_determine_a_term_from__ = makeString("Could not determine a term from ~a");

    static private final SubLString $$$Microthory_contents_for_ = makeString("Microthory contents for ");

    private static final SubLString $str13$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str14$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $str17$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh = makeString("Refresh");

    private static final SubLString $str22$reloadCurrentFrame__reloadFrameBu = makeString("reloadCurrentFrame('reloadFrameButton');");

    private static final SubLSymbol SKSI_EXTERNAL_MT_CONTENTS = makeSymbol("SKSI-EXTERNAL-MT-CONTENTS");

    private static final SubLString $str25$_Contents__External___ = makeString(" Contents (External) :");

    // Definitions
    public static final SubLObject cb_link_sksi_external_mt_contents_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_frame_name($CONTENT);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt1$sksi_external_mt_contents__A, cb_index_identifier(mt));
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
                        html_princ($$$External_Microtheory_Contents);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            {
                SubLObject predicate_count_pairs = sksi_external_browser_utilities.sksi_sort_pred_count_pairs(sksi_sks_mt_indexing.sksi_supported_mt_predicate_count_pairs_for_mt(mt));
                SubLObject cdolist_list_var = predicate_count_pairs;
                SubLObject predicate_count_pair = NIL;
                for (predicate_count_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate_count_pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum = predicate_count_pair;
                        SubLObject current = datum;
                        SubLObject predicate = NIL;
                        SubLObject count = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        predicate = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        count = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != sksi_external_browser_utilities.count_not_too_expensive_for_browser_supportP(count)) {
                                html_newline(UNPROVIDED);
                                html_indent(TWO_INTEGER);
                                {
                                    SubLObject frame_name_var = cb_frame_name($CONTENT);
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    cyc_cgi_url_int();
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt1$sksi_external_mt_contents__A, cb_index_identifier(mt));
                                    if (NIL != predicate) {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt4$__a, cb_fort_identifier(predicate));
                                    }
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
                                            if (NIL != predicate) {
                                                html_princ(cb_fort_display_string(predicate));
                                            } else {
                                                html_princ($$$External_Microtheory_Contents);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                if (count.isInteger()) {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt5$___a_, count);
                                } else {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt6$__N_A_);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt3);
                        }
                    }
                }
            }
            return mt;
        }
    }

    // Definitions
    public static SubLObject cb_link_sksi_external_mt_contents(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($CONTENT);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str1$sksi_external_mt_contents__A, cb_index_identifier(mt));
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
            html_princ($$$External_Microtheory_Contents);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        SubLObject cdolist_list_var;
        final SubLObject predicate_count_pairs = cdolist_list_var = sksi_external_browser_utilities.sksi_sort_pred_count_pairs(sksi_sks_mt_indexing.sksi_supported_mt_predicate_count_pairs_for_mt(mt));
        SubLObject predicate_count_pair = NIL;
        predicate_count_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = predicate_count_pair;
            SubLObject predicate = NIL;
            SubLObject count = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            count = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != sksi_external_browser_utilities.count_not_too_expensive_for_browser_supportP(count)) {
                    html_newline(UNPROVIDED);
                    html_indent(TWO_INTEGER);
                    final SubLObject frame_name_var2 = cb_frame_name($CONTENT);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str1$sksi_external_mt_contents__A, cb_index_identifier(mt));
                    if (NIL != predicate) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str4$__a, cb_fort_identifier(predicate));
                    }
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var2) {
                        html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var2);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != predicate) {
                            html_princ(cb_fort_display_string(predicate));
                        } else {
                            html_princ($$$External_Microtheory_Contents);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    if (count.isInteger()) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str5$___a_, count);
                    } else {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str6$__N_A_);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate_count_pair = cdolist_list_var.first();
        } 
        return mt;
    }

    public static final SubLObject sksi_external_mt_contents_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject index_spec = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt9);
                index_spec = current.first();
                current = current.rest();
                {
                    SubLObject pred_spec = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt9);
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject mt = cb_guess_index(index_spec);
                            SubLObject pred = NIL;
                            if (NIL == cb_index_hook_p(mt)) {
                                return cb_error($str_alt10$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != pred_spec) {
                                pred = cb_guess_fort(pred_spec, UNPROVIDED);
                                if (NIL == forts.fort_p(pred)) {
                                    return cb_error($str_alt11$Could_not_determine_a_term_from__, pred_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                            {
                                SubLObject title = cconcatenate($str_alt12$Microthory_contents_for_, format_nil.format_nil_s_no_copy(mt));
                                SubLObject title_var = title;
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
                                                    html_markup($str_alt13$yui_skin_sam);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_browser.cb_c_term_header(mt);
                                                        html_newline(TWO_INTEGER);
                                                        com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_mt_contents_browser.sksi_external_mt_contents_internal(mt, pred);
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
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt9);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sksi_external_mt_contents(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index_spec = NIL;
        destructuring_bind_must_consp(args, args, $list9);
        index_spec = args.first();
        SubLObject current = args.rest();
        final SubLObject pred_spec = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list9);
        current = current.rest();
        if (NIL == current) {
            final SubLObject mt = cb_guess_index(index_spec);
            SubLObject pred = NIL;
            if (NIL == cb_index_hook_p(mt)) {
                return cb_error($str10$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != pred_spec) {
                pred = cb_guess_fort(pred_spec, UNPROVIDED);
                if (NIL == forts.fort_p(pred)) {
                    return cb_error($str11$Could_not_determine_a_term_from__, pred_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            final SubLObject title_var;
            final SubLObject title = title_var = cconcatenate($$$Microthory_contents_for_, format_nil.format_nil_s_no_copy(mt));
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str14$_meta_http_equiv__X_UA_Compatible);
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
                    if (NIL != title_var) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_princ(title_var);
                        html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    dhtml_macros.html_basic_cb_scripts();
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
                        html_markup($str17$yui_skin_sam);
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
                                html_princ($$$Refresh);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str22$reloadCurrentFrame__reloadFrameBu);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            cb_browser.cb_c_term_header(mt);
                            html_newline(TWO_INTEGER);
                            sksi_external_mt_contents_internal(mt, pred);
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
        } else {
            cdestructuring_bind_error(args, $list9);
        }
        return NIL;
    }

    public static final SubLObject sksi_external_mt_contents_internal_alt(SubLObject mt, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
                try {
                    $assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                    cb_browser.cb_c_type(mt);
                    html_princ($str_alt15$_Contents__External___);
                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    thread.resetMultipleValues();
                    {
                        SubLObject _prev_bind_0_3 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                        try {
                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                            {
                                SubLObject reuseP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                try {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject _prev_bind_0_4 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                            {
                                                SubLObject new_or_reused = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject _prev_bind_0_5 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                        {
                                                            SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                            {
                                                                SubLObject _prev_bind_0_6 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                try {
                                                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                                                    {
                                                                        SubLObject original_memoization_process = NIL;
                                                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                            {
                                                                                SubLObject current_proc = current_process();
                                                                                if (NIL == original_memoization_process) {
                                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                                } else {
                                                                                    if (original_memoization_process != current_proc) {
                                                                                        Errors.error($str_alt16$Invalid_attempt_to_reuse_memoizat);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (NIL != pred) {
                                                                                com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_mt_contents_browser.sksi_external_mt_contents_rec_pred(mt, pred);
                                                                            } else {
                                                                                com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_mt_contents_browser.sksi_external_mt_contents_rec(mt);
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_6, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            }
                                        } finally {
                                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (NIL == reuseP) {
                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_3, thread);
                        }
                    }
                } finally {
                    $assertion_filter_hook$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject sksi_external_mt_contents_internal(final SubLObject mt, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
        try {
            $assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            cb_browser.cb_c_type(mt);
            html_princ($str25$_Contents__External___);
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
            try {
                pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$6 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$7 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                            final SubLObject new_or_reused = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$8 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        if (NIL != pred) {
                                            sksi_external_mt_contents_rec_pred(mt, pred);
                                        } else {
                                            sksi_external_mt_contents_rec(mt);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$9, thread);
                                }
                            } finally {
                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$8, thread);
                            }
                            if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                            }
                        } finally {
                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$7, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL == reuseP) {
                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                } finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$6, thread);
                }
            } finally {
                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            $assertion_filter_hook$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject sksi_external_mt_contents_rec_alt(SubLObject mt) {
        {
            SubLObject preds = sksi_external_browser_utilities.sksi_sort_preds_for_display(sksi_sks_mt_indexing.sksi_supported_mt_predicate_list_for_mt(mt));
            SubLObject cdolist_list_var = preds;
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_mt_contents_browser.sksi_external_mt_contents_rec_pred(mt, pred);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_external_mt_contents_rec(final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject preds = cdolist_list_var = sksi_external_browser_utilities.sksi_sort_preds_for_display(sksi_sks_mt_indexing.sksi_supported_mt_predicate_list_for_mt(mt));
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_external_mt_contents_rec_pred(mt, pred);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject sksi_external_mt_contents_rec_pred_alt(SubLObject mt, SubLObject pred) {
        cb_browser.cb_c_pred_header(pred);
        {
            SubLObject query_form_module_list_pairs = sksi_sks_mt_indexing.gather_query_form_module_list_pairs_from_sksi_supported_mt_cache_entries_for_mt_and_predicate(mt, pred);
            return sksi_external_browser_utilities.sksi_display_external_facts(query_form_module_list_pairs, mt);
        }
    }

    public static SubLObject sksi_external_mt_contents_rec_pred(final SubLObject mt, final SubLObject pred) {
        cb_browser.cb_c_pred_header(pred);
        final SubLObject query_form_module_list_pairs = sksi_sks_mt_indexing.gather_query_form_module_list_pairs_from_sksi_supported_mt_cache_entries_for_mt_and_predicate(mt, pred);
        return sksi_external_browser_utilities.sksi_display_external_facts(query_form_module_list_pairs, mt);
    }

    public static SubLObject declare_sksi_external_mt_contents_browser_file() {
        declareFunction("cb_link_sksi_external_mt_contents", "CB-LINK-SKSI-EXTERNAL-MT-CONTENTS", 1, 0, false);
        declareFunction("sksi_external_mt_contents", "SKSI-EXTERNAL-MT-CONTENTS", 1, 0, false);
        declareFunction("sksi_external_mt_contents_internal", "SKSI-EXTERNAL-MT-CONTENTS-INTERNAL", 2, 0, false);
        declareFunction("sksi_external_mt_contents_rec", "SKSI-EXTERNAL-MT-CONTENTS-REC", 1, 0, false);
        declareFunction("sksi_external_mt_contents_rec_pred", "SKSI-EXTERNAL-MT-CONTENTS-REC-PRED", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_external_mt_contents_browser_file() {
        return NIL;
    }

    public static final SubLObject setup_sksi_external_mt_contents_browser_file_alt() {
        setup_cb_link_method($SKSI_EXTERNAL_MT_CONTENTS, CB_LINK_SKSI_EXTERNAL_MT_CONTENTS, ONE_INTEGER);
        html_macros.note_html_handler_function(SKSI_EXTERNAL_MT_CONTENTS);
        return NIL;
    }

    public static SubLObject setup_sksi_external_mt_contents_browser_file() {
        if (SubLFiles.USE_V1) {
            setup_cb_link_method($SKSI_EXTERNAL_MT_CONTENTS, CB_LINK_SKSI_EXTERNAL_MT_CONTENTS, ONE_INTEGER);
            html_macros.note_cgi_handler_function(SKSI_EXTERNAL_MT_CONTENTS, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(SKSI_EXTERNAL_MT_CONTENTS);
        }
        return NIL;
    }

    public static SubLObject setup_sksi_external_mt_contents_browser_file_Previous() {
        setup_cb_link_method($SKSI_EXTERNAL_MT_CONTENTS, CB_LINK_SKSI_EXTERNAL_MT_CONTENTS, ONE_INTEGER);
        html_macros.note_cgi_handler_function(SKSI_EXTERNAL_MT_CONTENTS, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_external_mt_contents_browser_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_external_mt_contents_browser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_external_mt_contents_browser_file();
    }

    static {
    }

    static private final SubLString $str_alt1$sksi_external_mt_contents__A = makeString("sksi-external-mt-contents&~A");

    static private final SubLList $list_alt3 = list(makeSymbol("PREDICATE"), makeSymbol("COUNT"));

    static private final SubLString $str_alt4$__a = makeString("&~a");

    static private final SubLString $str_alt5$___a_ = makeString(" (~a)");

    static private final SubLString $str_alt6$__N_A_ = makeString(" (N/A)");

    static private final SubLList $list_alt9 = list(makeSymbol("INDEX-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("PRED-SPEC"));

    static private final SubLString $str_alt10$Could_not_determine_an_index_hook = makeString("Could not determine an index-hook from ~a");

    static private final SubLString $str_alt11$Could_not_determine_a_term_from__ = makeString("Could not determine a term from ~a");

    static private final SubLString $str_alt12$Microthory_contents_for_ = makeString("Microthory contents for ");

    static private final SubLString $str_alt13$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt15$_Contents__External___ = makeString(" Contents (External) :");

    static private final SubLString $str_alt16$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
}

/**
 * Total time: 137 ms
 */
