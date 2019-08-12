/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-QUA
 * source file: /cyc/top/cycl/cb-qua.lisp
 * created:     2019/07/03 17:38:26
 */
public final class cb_qua extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt41$ = makeString("");

    public static final SubLFile me = new cb_qua();

 public static final String myName = "com.cyc.cycjava.cycl.cb_qua";


    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $qua_supported_search_engine_strings$ = makeSymbol("*QUA-SUPPORTED-SEARCH-ENGINE-STRINGS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $qua_supported_search_engines$ = makeSymbol("*QUA-SUPPORTED-SEARCH-ENGINES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$cb_query_augmentation = makeString("cb-query-augmentation");

    private static final SubLSymbol CB_LINK_QUERY_AUGMENTATION = makeSymbol("CB-LINK-QUERY-AUGMENTATION");

    private static final SubLString $str5$qua_input = makeString("qua-input");

    private static final SubLString $str6$cb_qua_input = makeString("cb-qua-input");

    private static final SubLString $$$quaoutput = makeString("quaoutput");

    private static final SubLString $str9$cb_qua_output = makeString("cb-qua-output");

    private static final SubLSymbol $QUA_RAW_OUTPUT = makeKeyword("QUA-RAW-OUTPUT");

    private static final SubLString $$$quarawoutput = makeString("quarawoutput");

    private static final SubLString $str12$cb_qua_raw_output = makeString("cb-qua-raw-output");

    private static final SubLString $str13$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str14$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol CB_QUA_RAW_OUTPUT = makeSymbol("CB-QUA-RAW-OUTPUT");

    private static final SubLSymbol CB_QUA_OUTPUT = makeSymbol("CB-QUA-OUTPUT");

    private static final SubLString $$$Cycorp_Query_Augmentation = makeString("Cycorp Query Augmentation");

    private static final SubLString $str21$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");

    private static final SubLString $str22$90__10_ = makeString("90%,10%");

    private static final SubLString $str23$50__50_ = makeString("50%,50%");

    private static final SubLSymbol CB_QUERY_AUGMENTATION = makeSymbol("CB-QUERY-AUGMENTATION");

    private static final SubLString $str25$_id = makeString(":id");

    private static final SubLString $str26$_query_text = makeString(":query-text");

    private static final SubLString $str27$_search_engine = makeString(":search-engine");

    private static final SubLSymbol $CYC_LOGO_LARGE_VIOLET_FULL_URL = makeKeyword("CYC-LOGO-LARGE-VIOLET-FULL-URL");

    private static final SubLString $$$Cyc_Browser = makeString("Cyc Browser");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str32$Query_String__ = makeString("Query String: ");

    private static final SubLString $str33$_Run_Query_ = makeString("[Run Query]");

    private static final SubLString $str34$parent_quaoutput_location_href___ = makeString("parent.quaoutput.location.href = '");

    private static final SubLString $str35$__ = makeString("';");

    private static final SubLString $str36$parent_quarawoutput_location_href = makeString("parent.quarawoutput.location.href = '");

    private static final SubLSymbol CB_QUA_INPUT = makeSymbol("CB-QUA-INPUT");

    private static final SubLString $str39$Specializations_ = makeString("Specializations:");

    private static final SubLString $str40$Generalizations_ = makeString("Generalizations:");

    private static final SubLString $str41$Related_terms_ = makeString("Related terms:");

    private static final SubLList $list42 = list(makeString("AltaVista"), makeString("Google"));

    private static final SubLList $list43 = list(makeKeyword("ALTAVISTA"), makeKeyword("GOOGLE"));

    private static final SubLString $str44$ = makeString("");

    private static final SubLInteger $int$75 = makeInteger(75);

    private static final SubLString $$$New_Query = makeString("New Query");

    private static final SubLString $str47$Search_Engine__ = makeString("Search Engine: ");

    private static final SubLString $str48$onChange_javascript_this_form_sub = makeString("onChange=javascript:this.form.submit();");

    private static final SubLString $str49$Query_Terms__ = makeString("Query Terms: ");

    private static final SubLString $$$__ = makeString("  ");

    private static final SubLString $str51$_A = makeString("~A");

    private static final SubLString $str52$setVisibility___A___inline__ = makeString("setVisibility('~A','inline')");

    private static final SubLString $str53$setVisibility___A___none__ = makeString("setVisibility('~A','none')");

    private static final SubLList $list54 = list(makeSymbol("CHOICE-CYCL"), makeSymbol("CHOICE-STRING"));

    private static final SubLString $str57$Synonyms__ = makeString("Synonyms: ");

    private static final SubLString $str58$_raw_string = makeString("-raw-string");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str60$qua_query_term_id__A__A = makeString("qua-query-term-id-~A-~A");

    // Definitions
    /**
     * Define HTML link for invoking the Query Augmentation system
     */
    @LispMethod(comment = "Define HTML link for invoking the Query Augmentation system")
    public static final SubLObject cb_link_query_augmentation_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt0$cb_query_augmentation;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt0$cb_query_augmentation);
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

    // Definitions
    /**
     * Define HTML link for invoking the Query Augmentation system
     */
    @LispMethod(comment = "Define HTML link for invoking the Query Augmentation system")
    public static SubLObject cb_link_query_augmentation(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str0$cb_query_augmentation;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str0$cb_query_augmentation);
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

    public static final SubLObject cb_qua_raw_output_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        html_markup(html_macros.$html_html_head$.getGlobalValue());
        html_markup(html_macros.$html_html_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return args;
    }

    public static SubLObject cb_qua_raw_output(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str14$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return args;
    }

    public static final SubLObject cb_qua_output_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        html_markup(html_macros.$html_html_head$.getGlobalValue());
        html_markup(html_macros.$html_html_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return args;
    }

    public static SubLObject cb_qua_output(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str14$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return args;
    }

    public static final SubLObject cb_query_augmentation_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Cycorp_Query_Augmentation);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (NIL != html_macros.html_inside_body_p()) {
                Errors.error($str_alt19$Cannot_have_a_FRAMESET_tag_inside);
            }
            html_markup(html_macros.$html_frameset_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt20$90__10_);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_frame($QUA_INPUT, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != html_macros.html_inside_body_p()) {
                        Errors.error($str_alt19$Cannot_have_a_FRAMESET_tag_inside);
                    }
                    html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_frameset_cols$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str_alt21$50__50_);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_frame($QUA_OUTPUT, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            cb_frame($QUA_RAW_OUTPUT, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                        }
                    }
                    html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject cb_query_augmentation(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str14$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Cycorp_Query_Augmentation);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (NIL != html_macros.html_inside_body_p()) {
                Errors.error($str21$Cannot_have_a_FRAMESET_tag_inside);
            }
            html_markup(html_macros.$html_frameset_head$.getGlobalValue());
            html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str22$90__10_);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_frame($QUA_INPUT, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != html_macros.html_inside_body_p()) {
                    Errors.error($str21$Cannot_have_a_FRAMESET_tag_inside);
                }
                html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                html_markup(html_macros.$html_frameset_cols$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str23$50__50_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_frame($QUA_OUTPUT, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cb_frame($QUA_RAW_OUTPUT, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    /**
     *
     */
    public static final SubLObject cb_qua_input_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_id_string = html_extract_input($str_alt23$_id, args);
                SubLObject query_text = html_extract_input($str_alt24$_query_text, args);
                SubLObject v_search_engine = make_keyword(html_extract_input($str_alt25$_search_engine, args));
                SubLObject new_query = makeBoolean(!query_id_string.isString());
                SubLObject query_id = (NIL == new_query) ? ((SubLObject) (read_from_string_ignoring_errors(query_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : qua_query.new_augmented_query(query_text, v_search_engine);
                SubLObject query = qua_query.get_augmented_query_for_id(query_id);
                if (((NIL != qua_query.augmented_query_p(query)) && query_text.equalp(qua_query.aq_original_phrase(query))) && (v_search_engine != qua_query.get_aq_search_engine(query))) {
                    qua_query.set_aq_search_engine(query, v_search_engine);
                } else {
                    if (!((NIL != qua_query.augmented_query_p(query)) && query_text.equalp(qua_query.aq_original_phrase(query)))) {
                        query_id = qua_query.new_augmented_query(query_text, v_search_engine);
                        query = qua_query.get_augmented_query_for_id(query_id);
                        new_query = T;
                    }
                }
                if (NIL == new_query) {
                    com.cyc.cycjava.cycl.cb_qua.handle_disambiguation_info(query_id, args);
                }
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_value));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(ZERO_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($CYC_LOGO_LARGE_VIOLET_FULL_URL));
                                                                SubLObject align = $CENTER;
                                                                SubLObject alt = (true) ? ((SubLObject) ($$$Cyc_Browser)) : get_html_icon_alt_string($CYC_LOGO_LARGE_VIOLET_FULL_URL);
                                                                SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
                                                                html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                                html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(image_src);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                if (NIL != alt) {
                                                                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(alt);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != align) {
                                                                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align(align));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != border) {
                                                                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(border);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                            html_markup(TWO_INTEGER);
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            html_princ($$$Cycorp_Query_Augmentation);
                                                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                            html_markup(TWO_INTEGER);
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    {
                                        SubLObject frame_name_var = cb_frame_name(NIL);
                                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (NIL != frame_name_var) {
                                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(frame_name_var);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_hidden_input($str_alt9$cb_qua_input, T, UNPROVIDED);
                                                com.cyc.cycjava.cycl.cb_qua.print_query_guts(query_text, v_search_engine);
                                                com.cyc.cycjava.cycl.cb_qua.print_disambiguation_info(query_id);
                                                html_hidden_input($str_alt23$_id, query_id, UNPROVIDED);
                                                html_newline(UNPROVIDED);
                                                {
                                                    SubLObject query_string = qua_query.get_search_string_for_query(query);
                                                    if (NIL != string_utilities.non_empty_stringP(query_string)) {
                                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_princ($str_alt29$Query_String__);
                                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_princ(query_string);
                                                        html_newline(UNPROVIDED);
                                                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_princ(qua_query.get_augmented_query_url(query, UNPROVIDED));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        if (true) {
                                                            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup($$$quaoutput);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_princ($str_alt30$_Run_Query_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    }
                                                }
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    com.cyc.cycjava.cycl.cb_qua.print_addition_info(query_id);
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_markup(html_macros.$html_script_head$.getGlobalValue());
                                    html_markup(html_macros.$html_script_language$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_script_javascript$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                    html_princ($str_alt31$parent_quaoutput_location_href___);
                                                    html_princ(qua_query.get_augmented_query_url(query, UNPROVIDED));
                                                    html_princ($str_alt32$__);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                }
                                            }
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_script_tail$.getGlobalValue());
                                    if (NIL != new_query) {
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_markup(html_macros.$html_script_head$.getGlobalValue());
                                        html_markup(html_macros.$html_script_language$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_script_javascript$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                        html_princ($str_alt33$parent_quarawoutput_location_href);
                                                        html_princ(qua_query.get_raw_query_url(query, UNPROVIDED));
                                                        html_princ($str_alt32$__);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                    }
                                                }
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_script_tail$.getGlobalValue());
                                    }
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_qua_input(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_id_string = html_extract_input($str25$_id, args);
        final SubLObject query_text = html_extract_input($str26$_query_text, args);
        final SubLObject v_search_engine = make_keyword(html_extract_input($str27$_search_engine, args));
        SubLObject new_query = makeBoolean(!query_id_string.isString());
        SubLObject query_id = (NIL == new_query) ? read_from_string_ignoring_errors(query_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : qua_query.new_augmented_query(query_text, v_search_engine);
        SubLObject query = qua_query.get_augmented_query_for_id(query_id);
        if (((NIL != qua_query.augmented_query_p(query)) && query_text.equalp(qua_query.aq_original_phrase(query))) && (!v_search_engine.eql(qua_query.get_aq_search_engine(query)))) {
            qua_query.set_aq_search_engine(query, v_search_engine);
        } else
            if ((NIL == qua_query.augmented_query_p(query)) || (!query_text.equalp(qua_query.aq_original_phrase(query)))) {
                query_id = qua_query.new_augmented_query(query_text, v_search_engine);
                query = qua_query.get_augmented_query_for_id(query_id);
                new_query = T;
            }

        if (NIL == new_query) {
            handle_disambiguation_info(query_id, args);
        }
        html_markup($str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str14$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($CYC_LOGO_LARGE_VIOLET_FULL_URL));
                                final SubLObject align = $CENTER;
                                final SubLObject alt = $$$Cyc_Browser;
                                final SubLObject border = ZERO_INTEGER;
                                html_markup(html_macros.$html_image_head$.getGlobalValue());
                                html_markup(html_macros.$html_image_src$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(image_src);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != alt) {
                                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(alt);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != align) {
                                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align(align));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != border) {
                                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(border);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                }
                                html_markup(html_macros.$html_image_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ($$$Cycorp_Query_Augmentation);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    final SubLObject frame_name_var = cb_frame_name(NIL);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$post);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str6$cb_qua_input, T, UNPROVIDED);
                        print_query_guts(query_text, v_search_engine);
                        print_disambiguation_info(query_id);
                        html_hidden_input($str25$_id, query_id, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        final SubLObject query_string = qua_query.get_search_string_for_query(query);
                        if (NIL != string_utilities.non_empty_stringP(query_string)) {
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str32$Query_String__);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_princ(query_string);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ(qua_query.get_augmented_query_url(query, UNPROVIDED));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$quaoutput);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($str33$_Run_Query_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    print_addition_info(query_id);
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_script_head$.getGlobalValue());
                    html_markup(html_macros.$html_script_language$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_script_javascript$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(NIL, thread);
                            html_princ($str34$parent_quaoutput_location_href___);
                            html_princ(qua_query.get_augmented_query_url(query, UNPROVIDED));
                            html_princ($str35$__);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_markup(html_macros.$html_script_tail$.getGlobalValue());
                    if (NIL != new_query) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_script_head$.getGlobalValue());
                        html_markup(html_macros.$html_script_language$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_script_javascript$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(NIL, thread);
                                html_princ($str36$parent_quarawoutput_location_href);
                                html_princ(qua_query.get_raw_query_url(query, UNPROVIDED));
                                html_princ($str35$__);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                            }
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_markup(html_macros.$html_script_tail$.getGlobalValue());
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$3, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject print_addition_info_alt(SubLObject query_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query = qua_query.get_augmented_query_for_id(query_id);
                SubLObject terms = (NIL != qua_query.augmented_query_p(query)) ? ((SubLObject) (qua_query.aq_tokenizations(query).first())) : NIL;
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = terms;
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                {
                                    SubLObject specs = qua_query.aq_term_specs(v_term);
                                    SubLObject v_genls = qua_query.aq_term_genls(v_term);
                                    SubLObject related = qua_query.aq_term_related_terms(v_term);
                                    if (((NIL != specs) || (NIL != v_genls)) || (NIL != related)) {
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_markup(THREE_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                com.cyc.cycjava.cycl.cb_qua.cb_qua_show_term_in_nl(qua_query.aq_term_preferred_meaning(v_term));
                                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_markup(THREE_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                if (NIL != specs) {
                                                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(ZERO_INTEGER);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                            html_princ($str_alt36$Specializations_);
                                                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            html_newline(UNPROVIDED);
                                                                            {
                                                                                SubLObject cdolist_list_var_18 = specs;
                                                                                SubLObject spec = NIL;
                                                                                for (spec = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , spec = cdolist_list_var_18.first()) {
                                                                                    com.cyc.cycjava.cycl.cb_qua.cb_qua_show_term_in_nl(spec);
                                                                                    html_newline(UNPROVIDED);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_source_readability_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                }
                                                if (NIL != v_genls) {
                                                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(ZERO_INTEGER);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                            html_princ($str_alt37$Generalizations_);
                                                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            html_newline(UNPROVIDED);
                                                                            {
                                                                                SubLObject cdolist_list_var_22 = v_genls;
                                                                                SubLObject genl = NIL;
                                                                                for (genl = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , genl = cdolist_list_var_22.first()) {
                                                                                    com.cyc.cycjava.cycl.cb_qua.cb_qua_show_term_in_nl(genl);
                                                                                    html_newline(UNPROVIDED);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_source_readability_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                }
                                                if (NIL != related) {
                                                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(ZERO_INTEGER);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                            html_princ($str_alt38$Related_terms_);
                                                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            html_newline(UNPROVIDED);
                                                                            {
                                                                                SubLObject cdolist_list_var_26 = related;
                                                                                SubLObject related_item = NIL;
                                                                                for (related_item = cdolist_list_var_26.first(); NIL != cdolist_list_var_26; cdolist_list_var_26 = cdolist_list_var_26.rest() , related_item = cdolist_list_var_26.first()) {
                                                                                    com.cyc.cycjava.cycl.cb_qua.cb_qua_show_term_in_nl(related_item);
                                                                                    html_newline(UNPROVIDED);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_source_readability_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                return NIL;
            }
        }
    }

    public static SubLObject print_addition_info(final SubLObject query_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = qua_query.get_augmented_query_for_id(query_id);
        final SubLObject terms = (NIL != qua_query.augmented_query_p(query)) ? qua_query.aq_tokenizations(query).first() : NIL;
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject specs = qua_query.aq_term_specs(v_term);
                final SubLObject v_genls = qua_query.aq_term_genls(v_term);
                final SubLObject related = qua_query.aq_term_related_terms(v_term);
                if (((NIL != specs) || (NIL != v_genls)) || (NIL != related)) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(THREE_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        cb_qua_show_term_in_nl(qua_query.aq_term_preferred_meaning(v_term));
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(THREE_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        if (NIL != specs) {
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str39$Specializations_);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_newline(UNPROVIDED);
                                        SubLObject cdolist_list_var_$20 = specs;
                                        SubLObject spec = NIL;
                                        spec = cdolist_list_var_$20.first();
                                        while (NIL != cdolist_list_var_$20) {
                                            cb_qua_show_term_in_nl(spec);
                                            html_newline(UNPROVIDED);
                                            cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                                            spec = cdolist_list_var_$20.first();
                                        } 
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        if (NIL != v_genls) {
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str40$Generalizations_);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_newline(UNPROVIDED);
                                        SubLObject cdolist_list_var_$21 = v_genls;
                                        SubLObject genl = NIL;
                                        genl = cdolist_list_var_$21.first();
                                        while (NIL != cdolist_list_var_$21) {
                                            cb_qua_show_term_in_nl(genl);
                                            html_newline(UNPROVIDED);
                                            cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                            genl = cdolist_list_var_$21.first();
                                        } 
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        if (NIL != related) {
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str41$Related_terms_);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_newline(UNPROVIDED);
                                        SubLObject cdolist_list_var_$22 = related;
                                        SubLObject related_item = NIL;
                                        related_item = cdolist_list_var_$22.first();
                                        while (NIL != cdolist_list_var_$22) {
                                            cb_qua_show_term_in_nl(related_item);
                                            html_newline(UNPROVIDED);
                                            cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                                            related_item = cdolist_list_var_$22.first();
                                        } 
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject handle_disambiguation_info_alt(SubLObject query_id, SubLObject args) {
        {
            SubLObject options = qua_query.get_all_disambiguation_options(query_id);
            SubLObject cdolist_list_var = options;
            SubLObject option = NIL;
            for (option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , option = cdolist_list_var.first()) {
                {
                    SubLObject option_id = option.first();
                    SubLObject option_id_string = princ_to_string(option_id);
                    SubLObject value = html_extract_input(option_id_string, args);
                    SubLObject accepted_option = cb_guess_term(value, UNPROVIDED);
                    if (NIL != accepted_option) {
                        {
                            SubLObject changedP = qua_query.accept_disambiguation_option(query_id, option_id, accepted_option);
                        }
                    } else {
                        qua_query.reset_ambiguity(query_id, option_id);
                    }
                }
            }
        }
        return query_id;
    }

    public static SubLObject handle_disambiguation_info(final SubLObject query_id, final SubLObject args) {
        SubLObject cdolist_list_var;
        final SubLObject options = cdolist_list_var = qua_query.get_all_disambiguation_options(query_id);
        SubLObject option = NIL;
        option = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject option_id = option.first();
            final SubLObject option_id_string = princ_to_string(option_id);
            final SubLObject value = html_extract_input(option_id_string, args);
            final SubLObject accepted_option = cb_guess_term(value, UNPROVIDED);
            if (NIL != accepted_option) {
                final SubLObject changedP = qua_query.accept_disambiguation_option(query_id, option_id, accepted_option);
            } else {
                qua_query.reset_ambiguity(query_id, option_id);
            }
            cdolist_list_var = cdolist_list_var.rest();
            option = cdolist_list_var.first();
        } 
        return query_id;
    }

    public static final SubLObject print_query_guts_alt(SubLObject query_text, SubLObject v_search_engine) {
        if (query_text == UNPROVIDED) {
            query_text = $str_alt41$;
        }
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = NIL;
        }
        html_text_input($str_alt24$_query_text, query_text, $int$75);
        html_submit_input($$$New_Query, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        html_princ($str_alt44$Search_Engine__);
        html_create_dropdown_list($str_alt25$_search_engine, $qua_supported_search_engine_strings$.getGlobalValue(), $qua_supported_search_engines$.getGlobalValue(), ONE_INTEGER, position(v_search_engine, $qua_supported_search_engines$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str_alt45$onChange_javascript_this_form_sub);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject print_query_guts(SubLObject query_text, SubLObject v_search_engine) {
        if (query_text == UNPROVIDED) {
            query_text = $str44$;
        }
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = NIL;
        }
        html_text_input($str26$_query_text, query_text, $int$75);
        html_submit_input($$$New_Query, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        html_princ($str47$Search_Engine__);
        html_create_dropdown_list($str27$_search_engine, $qua_supported_search_engine_strings$.getGlobalValue(), $qua_supported_search_engines$.getGlobalValue(), ONE_INTEGER, position(v_search_engine, $qua_supported_search_engines$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str48$onChange_javascript_this_form_sub);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject print_disambiguation_info_alt(SubLObject query_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject disambig_options = qua_query.get_all_disambiguation_options(query_id);
                html_newline(UNPROVIDED);
                if (NIL != disambig_options) {
                    html_princ($str_alt46$Query_Terms__);
                }
                {
                    SubLObject cdolist_list_var = disambig_options;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        {
                            SubLObject term_id_string = write_to_string(v_term.first(), EMPTY_SUBL_OBJECT_ARRAY);
                            SubLObject choices = second(v_term);
                            html_princ($str_alt47$__);
                            if (NIL != list_utilities.lengthE(choices, ONE_INTEGER, UNPROVIDED)) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt48$_A, choices.first().first());
                            } else {
                                html_markup(html_macros.$html_select_head$.getGlobalValue());
                                html_markup(html_macros.$html_select_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(term_id_string);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (true) {
                                    html_markup(html_macros.$html_select_size$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(ONE_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_indent(ONE_INTEGER);
                                html_markup($str_alt45$onChange_javascript_this_form_sub);
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var_27 = choices;
                                            SubLObject choice = NIL;
                                            for (choice = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , choice = cdolist_list_var_27.first()) {
                                                {
                                                    SubLObject choice_string = second(choice);
                                                    SubLObject choice_cycl = choice.first();
                                                    SubLObject choice_identifier = cb_term_identifier(choice_cycl);
                                                    SubLObject dhtml_object_id = com.cyc.cycjava.cycl.cb_qua.cb_make_qua_query_term_object_id(term_id_string, choice_identifier);
                                                    SubLObject mouse_over = format(NIL, $str_alt49$setVisibility___A___inline__, dhtml_object_id);
                                                    SubLObject mouse_out = format(NIL, $str_alt50$setVisibility___A___none__, dhtml_object_id);
                                                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                    if (NIL != choice_identifier) {
                                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(choice_identifier);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(mouse_out);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(mouse_over);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_princ(choice_string);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_select_tail$.getGlobalValue());
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = disambig_options;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        {
                            SubLObject choice_lists = second(v_term);
                            SubLObject cdolist_list_var_29 = choice_lists;
                            SubLObject choice = NIL;
                            for (choice = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest() , choice = cdolist_list_var_29.first()) {
                                {
                                    SubLObject datum = choice;
                                    SubLObject current = datum;
                                    SubLObject choice_cycl = NIL;
                                    SubLObject choice_string = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt51);
                                    choice_cycl = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt51);
                                    choice_string = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        {
                                            SubLObject dhtml_object_id = com.cyc.cycjava.cycl.cb_qua.cb_make_qua_query_term_object_id(write_to_string(v_term.first(), EMPTY_SUBL_OBJECT_ARRAY), cb_term_identifier(choice_cycl));
                                            dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
                                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                                            if (NIL != dhtml_object_id) {
                                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(dhtml_object_id);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                    html_princ($str_alt54$Synonyms__);
                                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    html_princ(qua_query.qua_all_phrases_for_term_as_string_list(choice_cycl));
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt51);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static SubLObject print_disambiguation_info(final SubLObject query_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject disambig_options = qua_query.get_all_disambiguation_options(query_id);
        html_newline(UNPROVIDED);
        if (NIL != disambig_options) {
            html_princ($str49$Query_Terms__);
        }
        SubLObject cdolist_list_var = disambig_options;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject term_id_string = write_to_string(v_term.first(), EMPTY_SUBL_OBJECT_ARRAY);
            final SubLObject choices = v_term.rest();
            html_princ($$$__);
            if (NIL != list_utilities.lengthE(choices, ONE_INTEGER, UNPROVIDED)) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str51$_A, choices.first().first());
            } else {
                html_markup(html_macros.$html_select_head$.getGlobalValue());
                html_markup(html_macros.$html_select_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(term_id_string);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_select_size$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ONE_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_space, UNPROVIDED);
                html_markup($str48$onChange_javascript_this_form_sub);
                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var_$29 = choices;
                    SubLObject choice = NIL;
                    choice = cdolist_list_var_$29.first();
                    while (NIL != cdolist_list_var_$29) {
                        final SubLObject choice_string = second(choice);
                        final SubLObject choice_cycl = choice.first();
                        final SubLObject choice_identifier = cb_term_identifier(choice_cycl);
                        final SubLObject dhtml_object_id = cb_make_qua_query_term_object_id(term_id_string, choice_identifier);
                        final SubLObject mouse_over = format(NIL, $str52$setVisibility___A___inline__, dhtml_object_id);
                        final SubLObject mouse_out = format(NIL, $str53$setVisibility___A___none__, dhtml_object_id);
                        html_markup(html_macros.$html_option_head$.getGlobalValue());
                        if (NIL != choice_identifier) {
                            html_markup(html_macros.$html_option_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(choice_identifier);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(mouse_out);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(mouse_over);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(choice_string);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                        }
                        html_markup(html_macros.$html_option_tail$.getGlobalValue());
                        cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                        choice = cdolist_list_var_$29.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_select_tail$.getGlobalValue());
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        cdolist_list_var = disambig_options;
        v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$30;
            final SubLObject choice_lists = cdolist_list_var_$30 = v_term.rest();
            SubLObject choice2 = NIL;
            choice2 = cdolist_list_var_$30.first();
            while (NIL != cdolist_list_var_$30) {
                SubLObject current;
                final SubLObject datum = current = choice2;
                SubLObject choice_cycl2 = NIL;
                SubLObject choice_string2 = NIL;
                destructuring_bind_must_consp(current, datum, $list54);
                choice_cycl2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list54);
                choice_string2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject dhtml_object_id2 = cb_make_qua_query_term_object_id(write_to_string(v_term.first(), EMPTY_SUBL_OBJECT_ARRAY), cb_term_identifier(choice_cycl2));
                    dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id2, $INVISIBLE, $TEXT);
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (NIL != dhtml_object_id2) {
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(dhtml_object_id2);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($str57$Synonyms__);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        html_princ(qua_query.qua_all_phrases_for_term_as_string_list(choice_cycl2));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum, $list54);
                }
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                choice2 = cdolist_list_var_$30.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject cb_make_qua_query_term_object_id_alt(SubLObject query_id, SubLObject term_id) {
        {
            SubLObject modified_term_id = (term_id.isString()) ? ((SubLObject) (cconcatenate(string_utilities.trim_sides(term_id, CHAR_quotation), $str_alt55$_raw_string))) : write_to_string(term_id, EMPTY_SUBL_OBJECT_ARRAY);
            SubLObject usable_term_id = string_utilities.remove_substring(modified_term_id, $str_alt56$_);
            return format(NIL, $str_alt57$qua_query_term_id__A__A, query_id, usable_term_id);
        }
    }

    public static SubLObject cb_make_qua_query_term_object_id(final SubLObject query_id, final SubLObject term_id) {
        final SubLObject modified_term_id = (term_id.isString()) ? cconcatenate(string_utilities.trim_sides(term_id, CHAR_quotation), $str58$_raw_string) : write_to_string(term_id, EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject usable_term_id = string_utilities.remove_substring(modified_term_id, $$$_);
        return format(NIL, $str60$qua_query_term_id__A__A, query_id, usable_term_id);
    }

    public static final SubLObject cb_qua_show_term_in_nl_alt(SubLObject v_term) {
        return cb_show_term_in_nl(v_term, UNPROVIDED);
    }

    public static SubLObject cb_qua_show_term_in_nl(final SubLObject v_term) {
        return cb_show_term_in_nl(v_term, UNPROVIDED);
    }

    public static SubLObject declare_cb_qua_file() {
        declareFunction("cb_link_query_augmentation", "CB-LINK-QUERY-AUGMENTATION", 0, 1, false);
        declareFunction("cb_qua_raw_output", "CB-QUA-RAW-OUTPUT", 0, 1, false);
        declareFunction("cb_qua_output", "CB-QUA-OUTPUT", 0, 1, false);
        declareFunction("cb_query_augmentation", "CB-QUERY-AUGMENTATION", 0, 1, false);
        declareFunction("cb_qua_input", "CB-QUA-INPUT", 0, 1, false);
        declareFunction("print_addition_info", "PRINT-ADDITION-INFO", 1, 0, false);
        declareFunction("handle_disambiguation_info", "HANDLE-DISAMBIGUATION-INFO", 2, 0, false);
        declareFunction("print_query_guts", "PRINT-QUERY-GUTS", 0, 2, false);
        declareFunction("print_disambiguation_info", "PRINT-DISAMBIGUATION-INFO", 1, 0, false);
        declareFunction("cb_make_qua_query_term_object_id", "CB-MAKE-QUA-QUERY-TERM-OBJECT-ID", 2, 0, false);
        declareFunction("cb_qua_show_term_in_nl", "CB-QUA-SHOW-TERM-IN-NL", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_qua_file_alt() {
        defconstant("*QUA-SUPPORTED-SEARCH-ENGINE-STRINGS*", $list_alt39);
        defconstant("*QUA-SUPPORTED-SEARCH-ENGINES*", $list_alt40);
        return NIL;
    }

    public static SubLObject init_cb_qua_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*QUA-SUPPORTED-SEARCH-ENGINE-STRINGS*", $list42);
            defconstant("*QUA-SUPPORTED-SEARCH-ENGINES*", $list43);
        }
        if (SubLFiles.USE_V2) {
            defconstant("*QUA-SUPPORTED-SEARCH-ENGINE-STRINGS*", $list_alt39);
            defconstant("*QUA-SUPPORTED-SEARCH-ENGINES*", $list_alt40);
        }
        return NIL;
    }

    public static SubLObject init_cb_qua_file_Previous() {
        defconstant("*QUA-SUPPORTED-SEARCH-ENGINE-STRINGS*", $list42);
        defconstant("*QUA-SUPPORTED-SEARCH-ENGINES*", $list43);
        return NIL;
    }

    public static final SubLObject setup_cb_qua_file_alt() {
        setup_cb_link_method($QUERY_AUGMENTATION, CB_LINK_QUERY_AUGMENTATION, ONE_INTEGER);
        declare_cb_tool($QUERY_AUGMENTATION, $$$Query_Augmentation, $$$QuA, $$$Web_Query_Augmentation);
        register_cb_frame($QUA_INPUT, $str_alt8$qua_input, $str_alt9$cb_qua_input, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        register_cb_frame($QUA_OUTPUT, $$$quaoutput, $str_alt12$cb_qua_output, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        register_cb_frame($QUA_RAW_OUTPUT, $$$quarawoutput, $str_alt15$cb_qua_raw_output, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_macros.note_html_handler_function(CB_QUA_RAW_OUTPUT);
        html_macros.note_html_handler_function(CB_QUA_OUTPUT);
        html_macros.note_html_handler_function(CB_QUERY_AUGMENTATION);
        html_macros.note_html_handler_function(CB_QUA_INPUT);
        return NIL;
    }

    public static SubLObject setup_cb_qua_file() {
        if (SubLFiles.USE_V1) {
            setup_cb_link_method($QUERY_AUGMENTATION, CB_LINK_QUERY_AUGMENTATION, ONE_INTEGER);
            register_cb_frame($QUA_INPUT, $str5$qua_input, $str6$cb_qua_input, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            register_cb_frame($QUA_OUTPUT, $$$quaoutput, $str9$cb_qua_output, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            register_cb_frame($QUA_RAW_OUTPUT, $$$quarawoutput, $str12$cb_qua_raw_output, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_macros.note_cgi_handler_function(CB_QUA_RAW_OUTPUT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_QUA_OUTPUT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_QUERY_AUGMENTATION, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_QUA_INPUT, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            declare_cb_tool($QUERY_AUGMENTATION, $$$Query_Augmentation, $$$QuA, $$$Web_Query_Augmentation);
            register_cb_frame($QUA_INPUT, $str_alt8$qua_input, $str_alt9$cb_qua_input, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            register_cb_frame($QUA_OUTPUT, $$$quaoutput, $str_alt12$cb_qua_output, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            register_cb_frame($QUA_RAW_OUTPUT, $$$quarawoutput, $str_alt15$cb_qua_raw_output, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_macros.note_html_handler_function(CB_QUA_RAW_OUTPUT);
            html_macros.note_html_handler_function(CB_QUA_OUTPUT);
            html_macros.note_html_handler_function(CB_QUERY_AUGMENTATION);
            html_macros.note_html_handler_function(CB_QUA_INPUT);
        }
        return NIL;
    }

    public static SubLObject setup_cb_qua_file_Previous() {
        setup_cb_link_method($QUERY_AUGMENTATION, CB_LINK_QUERY_AUGMENTATION, ONE_INTEGER);
        register_cb_frame($QUA_INPUT, $str5$qua_input, $str6$cb_qua_input, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        register_cb_frame($QUA_OUTPUT, $$$quaoutput, $str9$cb_qua_output, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        register_cb_frame($QUA_RAW_OUTPUT, $$$quarawoutput, $str12$cb_qua_raw_output, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_macros.note_cgi_handler_function(CB_QUA_RAW_OUTPUT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_QUA_OUTPUT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_QUERY_AUGMENTATION, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_QUA_INPUT, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_qua_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_qua_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_qua_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$cb_query_augmentation = makeString("cb-query-augmentation");

    static private final SubLString $$$Query_Augmentation = makeString("Query Augmentation");

    static private final SubLString $$$QuA = makeString("QuA");

    static private final SubLString $$$Web_Query_Augmentation = makeString("Web Query Augmentation");

    static private final SubLString $str_alt8$qua_input = makeString("qua-input");

    static private final SubLString $str_alt9$cb_qua_input = makeString("cb-qua-input");

    static private final SubLString $str_alt12$cb_qua_output = makeString("cb-qua-output");

    static private final SubLString $str_alt15$cb_qua_raw_output = makeString("cb-qua-raw-output");

    static private final SubLString $str_alt19$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");

    static private final SubLString $str_alt20$90__10_ = makeString("90%,10%");

    static private final SubLString $str_alt21$50__50_ = makeString("50%,50%");

    static private final SubLString $str_alt23$_id = makeString(":id");

    static private final SubLString $str_alt24$_query_text = makeString(":query-text");

    static private final SubLString $str_alt25$_search_engine = makeString(":search-engine");

    static private final SubLString $str_alt29$Query_String__ = makeString("Query String: ");

    static private final SubLString $str_alt30$_Run_Query_ = makeString("[Run Query]");

    static private final SubLString $str_alt31$parent_quaoutput_location_href___ = makeString("parent.quaoutput.location.href = '");

    static private final SubLString $str_alt32$__ = makeString("';");

    static private final SubLString $str_alt33$parent_quarawoutput_location_href = makeString("parent.quarawoutput.location.href = '");

    static private final SubLString $str_alt36$Specializations_ = makeString("Specializations:");

    static private final SubLString $str_alt37$Generalizations_ = makeString("Generalizations:");

    static private final SubLString $str_alt38$Related_terms_ = makeString("Related terms:");

    static private final SubLList $list_alt39 = list(makeString("AltaVista"), makeString("Google"));

    static private final SubLList $list_alt40 = list(makeKeyword("ALTAVISTA"), makeKeyword("GOOGLE"));

    static private final SubLString $str_alt44$Search_Engine__ = makeString("Search Engine: ");

    static private final SubLString $str_alt45$onChange_javascript_this_form_sub = makeString("onChange=javascript:this.form.submit();");

    static private final SubLString $str_alt46$Query_Terms__ = makeString("Query Terms: ");

    static private final SubLString $str_alt47$__ = makeString("  ");

    static private final SubLString $str_alt48$_A = makeString("~A");

    static private final SubLString $str_alt49$setVisibility___A___inline__ = makeString("setVisibility('~A','inline')");

    static private final SubLString $str_alt50$setVisibility___A___none__ = makeString("setVisibility('~A','none')");

    static private final SubLList $list_alt51 = list(makeSymbol("CHOICE-CYCL"), makeSymbol("CHOICE-STRING"));

    static private final SubLString $str_alt54$Synonyms__ = makeString("Synonyms: ");

    static private final SubLString $str_alt55$_raw_string = makeString("-raw-string");

    static private final SubLString $str_alt56$_ = makeString(" ");

    static private final SubLString $str_alt57$qua_query_term_id__A__A = makeString("qua-query-term-id-~A-~A");
}

/**
 * Total time: 463 ms
 */
