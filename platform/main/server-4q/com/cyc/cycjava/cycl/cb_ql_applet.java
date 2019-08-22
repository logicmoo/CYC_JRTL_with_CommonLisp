/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
 *  module:      CB-QL-APPLET
 *  source file: /cyc/top/cycl/cb-ql-applet.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_ql_applet extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_ql_applet() {
    }

    public static final SubLFile me = new cb_ql_applet();


    // // Definitions
    // deflexical
    public static final SubLSymbol $cb_ql_codebase$ = makeSymbol("*CB-QL-CODEBASE*");

    // deflexical
    public static final SubLSymbol $cb_ql_class_file$ = makeSymbol("*CB-QL-CLASS-FILE*");

    // deflexical
    public static final SubLSymbol $cb_ql_default_height$ = makeSymbol("*CB-QL-DEFAULT-HEIGHT*");

    // deflexical
    public static final SubLSymbol $cb_ql_default_width$ = makeSymbol("*CB-QL-DEFAULT-WIDTH*");

    // deflexical
    private static final SubLSymbol $cb_ql_default_plist$ = makeSymbol("*CB-QL-DEFAULT-PLIST*");

    public static final SubLObject cb_ql_get_current_project() {
        {
            SubLObject project = fi.ke_purpose();
            return NIL != forts.fort_p(project) ? ((SubLObject) (project)) : $$GeneralCycKE;
        }
    }

    public static final SubLObject cb_ql_applet(SubLObject query_library_id, SubLObject query_library_constant_prefix, SubLObject generation_mt, SubLObject parsing_mt, SubLObject user, SubLObject project, SubLObject plist) {
        if (generation_mt == UNPROVIDED) {
            generation_mt = NIL;
        }
        if (parsing_mt == UNPROVIDED) {
            parsing_mt = NIL;
        }
        if (user == UNPROVIDED) {
            user = NIL;
        }
        if (project == UNPROVIDED) {
            project = NIL;
        }
        if (plist == UNPROVIDED) {
            plist = $cb_ql_default_plist$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == project) {
                project = cb_ql_get_current_project();
            }
            if (NIL == user) {
                user = operation_communication.the_cyclist();
            }
            {
                SubLObject datum = plist;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_1 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt9);
                    current_1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt9);
                    if (NIL == member(current_1, $list_alt10, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt9);
                }
                {
                    SubLObject title_tail = property_list_member($TITLE, current);
                    SubLObject title = (NIL != title_tail) ? ((SubLObject) (cadr(title_tail))) : $$$Query_Library_Tool;
                    SubLObject height_tail = property_list_member($HEIGHT, current);
                    SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : $cb_ql_default_height$.getGlobalValue();
                    SubLObject width_tail = property_list_member($WIDTH, current);
                    SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : $cb_ql_default_width$.getGlobalValue();
                    SubLObject archive = cyc_file_dependencies.java_applet_archive_string($$$ql);
                    html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($cb_ql_class_file$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($cb_ql_codebase$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(archive);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_height$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(height);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(width);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject port_string = string_utilities.to_string(cb_uia_forwarding.get_forwarding_base_port());
                                SubLObject host_name_string = cb_uia_forwarding.get_forwarding_machine_name();
                                SubLObject user_string = string_utilities.to_string(user);
                                SubLObject project_string = string_utilities.to_string(project);
                                SubLObject query_library_id_string = string_utilities.to_string(forts.fort_el_formula(query_library_id));
                                SubLObject query_library_constant_prefix_string = string_utilities.to_string(query_library_constant_prefix);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$queryLibraryId);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(query_library_id_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$queryLibraryConstantPrefix);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(query_library_constant_prefix_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if (NIL != forts.fort_p(generation_mt)) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$generationMt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(generation_mt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                                if (NIL != forts.fort_p(parsing_mt)) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$parsingMt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(parsing_mt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$user);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(user_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$project);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(project_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$cycMachine);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(host_name_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$cycPort);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(port_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$title);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(title);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$width);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(width);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$height);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(height);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(string_utilities.to_string($$$httpState));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                if (html_kernel.http_state_key_for_request().isString()) {
                                    html_utilities.html_princ(html_kernel.http_state_key_for_request());
                                } else {
                                    html_utilities.html_prin1(html_kernel.http_state_key_for_request());
                                }
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_applet_tail$.getGlobalValue());
                }
            }
            return query_library_id;
        }
    }





    public static final SubLObject cb_query_library_tool(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_library_id = cb_utilities.cb_decode_fort_list_selector_result($$$queryLibraryId, args);
                SubLObject query_library_constant_prefix = html_utilities.html_extract_input($$$queryLibraryConstantPrefix, args);
                SubLObject loading_mode_string = html_utilities.html_extract_input($str_alt29$loading_mode, args);
                SubLObject loading_mode = (NIL != number_utilities.number_string_p(loading_mode_string)) ? ((SubLObject) (ONE_INTEGER.numE(parse_integer(loading_mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($LOAD_FROM_KB)) : $USE_CACHES)) : $UNKNOWN;
                SubLObject title_var = $$$Query_Library_Tool;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt35$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                        html_utilities.html_princ(cb_query_library_tool_get_introduction_text());
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        if ((NIL == forts.fort_p(query_library_id)) || (!query_library_constant_prefix.isString())) {
                                            {
                                                SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != frame_name_var) {
                                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(frame_name_var);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt36$cb_query_library_tool, T, UNPROVIDED);
                                                        if (NIL == forts.fort_p(query_library_id)) {
                                                            query_library_id = $cb_ql_last_query_library_id$.getDynamicValue(thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(ZERO_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (NIL != html_macros.$html_color_lighter_blue$.getDynamicValue(thread)) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_macros.$html_color_lighter_blue$.getDynamicValue(thread));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt39$Query_Library_ID__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_fort_list_selector($$$queryLibraryId, ke_interaction_folder.remove_non_cyclist_query_libraries(ke_interaction_folder.remove_task_query_libraries(ke_interaction_folder.get_all_query_libraries())), NIL != query_library_id ? ((SubLObject) (query_library_id)) : $cb_ql_default_start_query_library_id$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (NIL != html_macros.$html_color_lighter_blue$.getDynamicValue(thread)) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_macros.$html_color_lighter_blue$.getDynamicValue(thread));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt41$Query_Library_Loading_Mode__);
                                                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup($str_alt29$loading_mode);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(ONE_INTEGER);
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                        if (true) {
                                                                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_markup(ONE_INTEGER);
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ($str_alt42$Load_afresh_from_KB__slower_);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                        if (true) {
                                                                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_markup(ZERO_INTEGER);
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ($str_alt43$Reuse_previously_loaded_values__f);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                                                html_utilities.html_princ($$$Advanced_Settings);
                                                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject size_val = MINUS_ONE_INTEGER;
                                                                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                                    if (NIL != size_val) {
                                                                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(size_val);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ($str_alt45$_If_you_are_unsure_about_these__l);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                                                html_utilities.html_princ($str_alt46$Query_Library_Constant_Prefix__);
                                                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject v_default = (query_library_constant_prefix.isString()) ? ((SubLObject) (query_library_constant_prefix)) : kb_paths.fort_name(operation_communication.the_cyclist());
                                                                                    html_utilities.html_text_input($$$queryLibraryConstantPrefix, v_default, $int$60);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                        html_utilities.html_newline(TWO_INTEGER);
                                                        html_utilities.html_submit_input($$$Launch_QL, $$$launch, UNPROVIDED);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                        } else {
                                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                            if (loading_mode == $LOAD_FROM_KB) {
                                                api_widgets.clear_all_api_widgets_caches();
                                            }
                                            cb_ql_applet(query_library_id, query_library_constant_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (loading_mode != $UNKNOWN) {
                                                html_utilities.html_newline(TWO_INTEGER);
                                                {
                                                    SubLObject size_val = MINUS_ONE_INTEGER;
                                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                    if (NIL != size_val) {
                                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(size_val);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            if (loading_mode == $LOAD_FROM_KB) {
                                                                html_utilities.html_princ($str_alt50$Query_Library_and_queries_are_loa);
                                                            } else {
                                                                html_utilities.html_princ($str_alt51$Previously_loaded_query_library_a);
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                }
                                            }
                                            $cb_ql_last_query_library_id$.setDynamicValue(query_library_id, thread);
                                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $cb_ql_introduction_text$ = makeSymbol("*CB-QL-INTRODUCTION-TEXT*");

    public static final SubLObject cb_query_library_tool_get_introduction_text() {
        return $cb_ql_introduction_text$.getGlobalValue();
    }

    public static final SubLObject declare_cb_ql_applet_file() {
        declareFunction("cb_ql_get_current_project", "CB-QL-GET-CURRENT-PROJECT", 0, 0, false);
        declareFunction("cb_ql_applet", "CB-QL-APPLET", 2, 5, false);
        declareFunction("cb_query_library_tool", "CB-QUERY-LIBRARY-TOOL", 0, 1, false);
        declareFunction("cb_query_library_tool_get_introduction_text", "CB-QUERY-LIBRARY-TOOL-GET-INTRODUCTION-TEXT", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_ql_applet_file() {
        deflexical("*CB-QL-CODEBASE*", $str_alt0$_java_ql);
        deflexical("*CB-QL-CLASS-FILE*", $str_alt1$com_cyc_framework_ui_ql_CycQueryL);
        deflexical("*CB-QL-DEFAULT-HEIGHT*", $int$480);
        deflexical("*CB-QL-DEFAULT-WIDTH*", $int$800);
        deflexical("*CB-QL-DEFAULT-PLIST*", list($TITLE, $$$Query_Library, $HEIGHT, $cb_ql_default_height$.getGlobalValue(), $WIDTH, $cb_ql_default_width$.getGlobalValue()));
        defparameter("*CB-QL-LAST-QUERY-LIBRARY-ID*", NIL);
        defparameter("*CB-QL-DEFAULT-START-QUERY-LIBRARY-ID*", $$Cyc_TestQueryFolder);
        deflexical("*CB-QL-INTRODUCTION-TEXT*", $str_alt53$Hi__This_is_the_Query_Library_Too);
        return NIL;
    }

    public static final SubLObject setup_cb_ql_applet_file() {
                utilities_macros.register_html_state_variable($cb_ql_last_query_library_id$);
        utilities_macros.register_html_state_variable($cb_ql_default_start_query_library_id$);
        html_macros.note_html_handler_function(CB_QUERY_LIBRARY_TOOL);
        sethash($QUERY_LIBRARY_TOOL, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt55$query_library_tool_gif, NIL));
        cb_utilities.declare_cb_tool($QUERY_LIBRARY_TOOL, $$$Query_Library, $$$QL, $str_alt57$Create_and_edit_queries_using_the);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_java_ql = makeString("/java/ql");

    static private final SubLString $str_alt1$com_cyc_framework_ui_ql_CycQueryL = makeString("com.cyc.framework.ui.ql.CycQueryLibraryApplet");

    public static final SubLInteger $int$480 = makeInteger(480);

    public static final SubLInteger $int$800 = makeInteger(800);



    static private final SubLString $$$Query_Library = makeString("Query Library");





    public static final SubLObject $$GeneralCycKE = constant_handles.reader_make_constant_shell(makeString("GeneralCycKE"));

    static private final SubLList $list_alt9 = list(makeSymbol("&KEY"), list(makeSymbol("TITLE"), makeString("Query Library Tool")), list(makeSymbol("HEIGHT"), makeSymbol("*CB-QL-DEFAULT-HEIGHT*")), list(makeSymbol("WIDTH"), makeSymbol("*CB-QL-DEFAULT-WIDTH*")));

    static private final SubLList $list_alt10 = list(makeKeyword("TITLE"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $$$Query_Library_Tool = makeString("Query Library Tool");

    static private final SubLString $$$ql = makeString("ql");

    static private final SubLString $$$queryLibraryId = makeString("queryLibraryId");

    static private final SubLString $$$queryLibraryConstantPrefix = makeString("queryLibraryConstantPrefix");

    static private final SubLString $$$generationMt = makeString("generationMt");

    static private final SubLString $$$parsingMt = makeString("parsingMt");

    static private final SubLString $$$user = makeString("user");

    static private final SubLString $$$project = makeString("project");

    static private final SubLString $$$cycMachine = makeString("cycMachine");

    static private final SubLString $$$cycPort = makeString("cycPort");

    static private final SubLString $$$title = makeString("title");

    static private final SubLString $$$width = makeString("width");

    static private final SubLString $$$height = makeString("height");

    static private final SubLString $$$httpState = makeString("httpState");

    public static final SubLSymbol $cb_ql_last_query_library_id$ = makeSymbol("*CB-QL-LAST-QUERY-LIBRARY-ID*");

    public static final SubLObject $$Cyc_TestQueryFolder = constant_handles.reader_make_constant_shell(makeString("Cyc-TestQueryFolder"));

    public static final SubLSymbol $cb_ql_default_start_query_library_id$ = makeSymbol("*CB-QL-DEFAULT-START-QUERY-LIBRARY-ID*");

    static private final SubLString $str_alt29$loading_mode = makeString("loading_mode");

    private static final SubLSymbol $LOAD_FROM_KB = makeKeyword("LOAD-FROM-KB");

    private static final SubLSymbol $USE_CACHES = makeKeyword("USE-CACHES");





    static private final SubLString $str_alt34$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt35$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt36$cb_query_library_tool = makeString("cb-query-library-tool");





    static private final SubLString $str_alt39$Query_Library_ID__ = makeString("Query Library ID: ");



    static private final SubLString $str_alt41$Query_Library_Loading_Mode__ = makeString("Query Library Loading Mode: ");

    static private final SubLString $str_alt42$Load_afresh_from_KB__slower_ = makeString("Load afresh from KB (slower)");

    static private final SubLString $str_alt43$Reuse_previously_loaded_values__f = makeString("Reuse previously loaded values (faster)");

    static private final SubLString $$$Advanced_Settings = makeString("Advanced Settings");

    static private final SubLString $str_alt45$_If_you_are_unsure_about_these__l = makeString("(If you are unsure about these, leave the defaults.)");

    static private final SubLString $str_alt46$Query_Library_Constant_Prefix__ = makeString("Query Library Constant Prefix: ");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $$$Launch_QL = makeString("Launch QL");

    static private final SubLString $$$launch = makeString("launch");

    static private final SubLString $str_alt50$Query_Library_and_queries_are_loa = makeString("Query Library and queries are loaded from KB.");

    static private final SubLString $str_alt51$Previously_loaded_query_library_a = makeString("Previously loaded query library and queries are being reused.");

    private static final SubLSymbol CB_QUERY_LIBRARY_TOOL = makeSymbol("CB-QUERY-LIBRARY-TOOL");

    static private final SubLString $str_alt53$Hi__This_is_the_Query_Library_Too = makeString("Hi! This is the Query Library Tool, which requires Java to be running. If you are having problems running this Applet, check the Java Console of your browser. Typically, the problem is the setup of your policy file. Contact support if you are having problems.");

    private static final SubLSymbol $QUERY_LIBRARY_TOOL = makeKeyword("QUERY-LIBRARY-TOOL");

    static private final SubLString $str_alt55$query_library_tool_gif = makeString("query-library-tool.gif");

    static private final SubLString $$$QL = makeString("QL");

    static private final SubLString $str_alt57$Create_and_edit_queries_using_the = makeString("Create and edit queries using the template-based suite of Java tools.");

    // // Initializers
    public void declareFunctions() {
        declare_cb_ql_applet_file();
    }

    public void initializeVariables() {
        init_cb_ql_applet_file();
    }

    public void runTopLevelForms() {
        setup_cb_ql_applet_file();
    }
}

