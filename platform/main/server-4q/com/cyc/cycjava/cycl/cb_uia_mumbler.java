/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
 *  module:      CB-UIA-MUMBLER
 *  source file: /cyc/top/cycl/cb-uia-mumbler.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_uia_mumbler extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_mumbler() {
    }

    public static final SubLFile me = new cb_uia_mumbler();

    public static final String myName = "com.cyc.cycjava.cycl.cb_uia_mumbler";

    // // Definitions
    // deflexical
    private static final SubLSymbol $cb_uia_mumble_applet_height$ = makeSymbol("*CB-UIA-MUMBLE-APPLET-HEIGHT*");

    // deflexical
    private static final SubLSymbol $cb_uia_mumble_applet_width$ = makeSymbol("*CB-UIA-MUMBLE-APPLET-WIDTH*");

    // deflexical
    private static final SubLSymbol $cb_uia_mumble_sleep_seconds$ = makeSymbol("*CB-UIA-MUMBLE-SLEEP-SECONDS*");

    // deflexical
    private static final SubLSymbol $cb_uia_mumble_sleep_duration$ = makeSymbol("*CB-UIA-MUMBLE-SLEEP-DURATION*");

    // deflexical
    private static final SubLSymbol $cb_uia_mumble_window_height$ = makeSymbol("*CB-UIA-MUMBLE-WINDOW-HEIGHT*");

    // deflexical
    private static final SubLSymbol $cb_uia_mumble_window_width$ = makeSymbol("*CB-UIA-MUMBLE-WINDOW-WIDTH*");

    // deflexical
    private static final SubLSymbol $cb_uia_mumble_class_file$ = makeSymbol("*CB-UIA-MUMBLE-CLASS-FILE*");

    // deflexical
    private static final SubLSymbol $cb_uia_mumble_class_file_for_tunnel$ = makeSymbol("*CB-UIA-MUMBLE-CLASS-FILE-FOR-TUNNEL*");

    // deflexical
    private static final SubLSymbol $cb_uia_mumble_archive$ = makeSymbol("*CB-UIA-MUMBLE-ARCHIVE*");

    // deflexical
    private static final SubLSymbol $cb_uia_mumble_archive_for_tunnel$ = makeSymbol("*CB-UIA-MUMBLE-ARCHIVE-FOR-TUNNEL*");

    public static final SubLObject cb_uia_open_mumble_window(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject uima_id = NIL;
                SubLObject uia_id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt9);
                uima_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt9);
                uia_id = current.first();
                current = current.rest();
                {
                    SubLObject height_stmt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt9);
                    current = current.rest();
                    {
                        SubLObject width_stmt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt9);
                        current = current.rest();
                        {
                            SubLObject frequency_stmt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt9);
                            current = current.rest();
                            if (NIL == current) {
                                uia_mumbler.uia_ensure_mumbling_support_externally(parse_integer(uima_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), parse_integer(uia_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                {
                                    SubLObject height = cb_uiat_mumble_interpret_window_dimension(height_stmt, $cb_uia_mumble_applet_height$.getGlobalValue());
                                    SubLObject width = cb_uiat_mumble_interpret_window_dimension(width_stmt, $cb_uia_mumble_applet_width$.getGlobalValue());
                                    SubLObject frequency = cb_uiat_mumble_interpret_frequency_statement(frequency_stmt, $cb_uia_mumble_sleep_duration$.getGlobalValue());
                                    SubLObject codebase = cb_uia_construct_mumble_codebase();
                                    SubLObject archive = (NIL != cb_java_utilities.$cb_java_applet_tunnel_active$.getDynamicValue(thread)) ? ((SubLObject) ($cb_uia_mumble_archive_for_tunnel$.getGlobalValue())) : $cb_uia_mumble_archive$.getGlobalValue();
                                    SubLObject applet_name = (NIL != cb_java_utilities.$cb_java_applet_tunnel_active$.getDynamicValue(thread)) ? ((SubLObject) ($cb_uia_mumble_class_file_for_tunnel$.getGlobalValue())) : $cb_uia_mumble_class_file$.getGlobalValue();
                                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                    {
                                        SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                            try {
                                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                                if (NIL != color_value) {
                                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_color(color_value));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt10$CYC_s_Musings);
                                                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(applet_name);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(codebase);
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
                                                            SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject port_value = string_utilities.to_string(api_kernel.api_port());
                                                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($$$command);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(symbol_name(UIA_FETCH_MUMBLING));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($$$sleep);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(frequency);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($$$trace);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($$$true);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($$$uima);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(uima_id);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($$$uia);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(uia_id);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    if (NIL == cb_java_utilities.$cb_java_applet_tunnel_active$.getDynamicValue(thread)) {
                                                                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup($$$port);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(port_value);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    } else {
                                                                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup($$$port);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(cb_java_utilities.$cb_java_applet_tunnel_exposed_port$.getDynamicValue(thread));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        cb_java_utilities.cb_java_applet_tunnel_params(Environment.get_network_name(Environment.get_machine_name($$$unknown)), port_value, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_applet_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_copyright_notice();
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt9);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_mumble_interpret_frequency_statement(SubLObject stmt, SubLObject v_default) {
        {
            SubLObject frequency = v_default;
            if (stmt.isString()) {
                frequency = parse_integer(stmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (frequency.numL($int$1000)) {
                    frequency = v_default;
                }
            }
            return frequency;
        }
    }

    public static final SubLObject cb_uiat_mumble_interpret_window_dimension(SubLObject stmt, SubLObject v_default) {
        {
            SubLObject dimension = v_default;
            if (stmt.isString()) {
                dimension = parse_integer(stmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (dimension.numL(v_default)) {
                    dimension = v_default;
                }
            }
            return dimension;
        }
    }

    public static final SubLObject cb_uia_construct_mumble_codebase() {
        {
            SubLObject machine_name = Environment.get_network_name(Environment.get_machine_name($$$unknown));
            return cconcatenate($str_alt21$_java_rkf, EMPTY_SUBL_OBJECT_ARRAY);
        }
    }

    public static final SubLObject cb_link_uia_open_mumble_window(SubLObject linktext, SubLObject v_agenda) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == v_agenda) {
                v_agenda = cb_user_interaction_agenda.cb_current_uia();
            }
            {
                SubLObject uima = user_interaction_agenda.uia_meta_agenda(v_agenda);
                SubLObject frame_name_var = NIL;
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt22$cb_uia_open_mumble_window__D__D, user_interaction_agenda.uima_id(uima), user_interaction_agenda.uia_id(v_agenda));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt23$window_open__);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt22$cb_uia_open_mumble_window__D__D, user_interaction_agenda.uima_id(uima), user_interaction_agenda.uia_id(v_agenda));
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$__);
                format(html_macros.$html_stream$.getDynamicValue(thread), $$$null);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt27$___A____, cb_uia_construct_mumble_window_options());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt28$return_false_);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_construct_mumble_window_options() {
        return cb_uia_construct_option_string(listS($list_alt31, list($HEIGHT, $cb_uia_mumble_window_height$.getGlobalValue()), list($WIDTH, $cb_uia_mumble_window_width$.getGlobalValue()), list($INNERHEIGHT, $cb_uia_mumble_window_height$.getGlobalValue()), list($INNERWIDTH, $cb_uia_mumble_window_width$.getGlobalValue()), $list_alt36));
    }

    public static final SubLObject cb_uia_construct_option_string(SubLObject options) {
        {
            SubLObject pieces = NIL;
            SubLObject cdolist_list_var = options;
            SubLObject option = NIL;
            for (option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , option = cdolist_list_var.first()) {
                pieces = cons($str_alt37$_, pieces);
                {
                    SubLObject datum = option;
                    SubLObject current = datum;
                    SubLObject command = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    command = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject command_string = cb_uia_convert_to_option_string(command);
                            SubLObject value_string = cb_uia_convert_to_option_string(value);
                            pieces = cons(command_string, pieces);
                            pieces = cons($str_alt39$_, pieces);
                            pieces = cons(value_string, pieces);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt38);
                    }
                }
            }
            pieces = nreverse(pieces);
            pieces = pieces.rest();
            return apply(CCONCATENATE, pieces);
        }
    }

    public static final SubLObject cb_uia_convert_to_option_string(SubLObject v_object) {
        {
            SubLObject rc = NIL;
            if (v_object.isNumber()) {
                rc = string_utilities.to_string(v_object);
            } else
                if (v_object.isSymbol()) {
                    rc = Strings.string_downcase(symbol_name(v_object), UNPROVIDED, UNPROVIDED);
                } else
                    if (v_object.isString()) {
                        rc = v_object;
                    } else {
                        rc = string_utilities.to_string(v_object);
                    }


            return rc;
        }
    }

    public static final SubLObject cb_uia_uimma_observer(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup(ONE_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_princ($$$User_Meta_Meta_Agenda_Display);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup(ONE_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ONE_INTEGER);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($$$center));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($$$top));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($$$UI_Meta_Agenda);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($$$center));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($$$top));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($$$Users);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject idx = user_interaction_agenda.system_uimma();
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                                SubLObject uima = NIL;
                                while (NIL != id) {
                                    uima = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, uima, $SKIP)) {
                                        {
                                            SubLObject v_agenda = user_interaction_agenda.uima_current_agenda(uima);
                                            SubLObject user = user_interaction_agenda.uima_state_lookup(uima, $USER, UNPROVIDED);
                                            if ((NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) && (NIL != forts.fort_p(user))) {
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
                                                            html_utilities.html_markup(html_utilities.html_align($$$left));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$top));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt49$___D, user_interaction_agenda.uima_id(uima));
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$center));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$top));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt50$Dialogs_with_);
                                                                {
                                                                    SubLObject generation_mt = user_interaction_agenda.uia_generation_mt(v_agenda, $$EnglishMt);
                                                                    html_utilities.html_princ(uia_trampolines.uia_term_phrase(v_agenda, user, generation_mt, $$CyclistsMt, UNPROVIDED));
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$center));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uiat_mumbler_show_uima_topics(uima);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } else {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($$$2);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$right));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                                html_utilities.html_princ($$$user_not_identified_yet);
                                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                                } 
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_mumbler_show_uima_topics(SubLObject uima) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ZERO_INTEGER);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject counter = ZERO_INTEGER;
                        SubLObject cdolist_list_var = user_interaction_agenda.uima_open_agendas_sequence(uima);
                        SubLObject v_agenda = NIL;
                        for (v_agenda = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_agenda = cdolist_list_var.first()) {
                            {
                                SubLObject _prev_bind_0_12 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                                SubLObject _prev_bind_1 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                                try {
                                    rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                                    rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (counter.isZero()) {
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($$$center));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($$$top));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt58$Topics_);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } else {
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject topic = user_interaction_agenda.uia_state_lookup(v_agenda, $TOPIC, UNPROVIDED);
                                                        if (NIL != forts.fort_p(topic)) {
                                                            {
                                                                SubLObject generation_mt = user_interaction_agenda.uia_generation_mt(v_agenda, $$EnglishMt);
                                                                cb_utilities.cb_link($UIA_OPEN_MUMBLE_WINDOW, uia_trampolines.uia_term_phrase(v_agenda, topic, generation_mt, UNPROVIDED, UNPROVIDED), v_agenda, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else {
                                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                            html_utilities.html_princ($$$no_current_topic);
                                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt61$____D_, user_interaction_agenda.uia_id(v_agenda));
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_utilities.cb_link($UIA_STEAL_OTHER_UIA, $str_alt63$_Steal_, v_agenda, uima, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    rkf_macros.$rkf_speaker$.rebind(_prev_bind_1, thread);
                                    rkf_macros.$rkf_addressee$.rebind(_prev_bind_0_12, thread);
                                }
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return uima;
        }
    }

    public static final SubLObject cb_link_uia_steal_other_uia(SubLObject linktext, SubLObject v_agenda, SubLObject meta_agenda, SubLObject target) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt64$cb_uia_steal_other_uia_UIMA__D_UI, user_interaction_agenda.uima_id(meta_agenda), user_interaction_agenda.uia_id(v_agenda));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_steal_other_uia(SubLObject args) {
        {
            SubLObject uima_id_string = html_utilities.html_extract_input($$$UIMA, args);
            SubLObject uia_id_string = html_utilities.html_extract_input($$$UIA, args);
            if (NIL != user_interaction_agenda.user_interaction_meta_agenda_p(cb_user_interaction_agenda.switch_to_specified_uima_uia_tuple(parse_integer(uima_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), parse_integer(uia_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                return cb_user_interaction_agenda.cb_uia_start(UNPROVIDED);
            } else {
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(ONE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($str_alt68$Sorry__that_session_is_no_longer_);
                html_utilities.html_newline(UNPROVIDED);
                cb_utilities.cb_link($CB_UIA_UIMMA_OBSERVER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(ONE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_cb_uia_uimma_observer(SubLObject target, SubLObject linktext) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt71$_UIMMA_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt72$cb_uia_uimma_observer);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uimma_observer(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        return cb_utilities.cb_link($CB_UIA_UIMMA_OBSERVER, $MAIN, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject declare_cb_uia_mumbler_file() {
        declareFunction("cb_uia_open_mumble_window", "CB-UIA-OPEN-MUMBLE-WINDOW", 1, 0, false);
        declareFunction("cb_uiat_mumble_interpret_frequency_statement", "CB-UIAT-MUMBLE-INTERPRET-FREQUENCY-STATEMENT", 2, 0, false);
        declareFunction("cb_uiat_mumble_interpret_window_dimension", "CB-UIAT-MUMBLE-INTERPRET-WINDOW-DIMENSION", 2, 0, false);
        declareFunction("cb_uia_construct_mumble_codebase", "CB-UIA-CONSTRUCT-MUMBLE-CODEBASE", 0, 0, false);
        declareFunction("cb_link_uia_open_mumble_window", "CB-LINK-UIA-OPEN-MUMBLE-WINDOW", 1, 1, false);
        declareFunction("cb_uia_construct_mumble_window_options", "CB-UIA-CONSTRUCT-MUMBLE-WINDOW-OPTIONS", 0, 0, false);
        declareFunction("cb_uia_construct_option_string", "CB-UIA-CONSTRUCT-OPTION-STRING", 1, 0, false);
        declareFunction("cb_uia_convert_to_option_string", "CB-UIA-CONVERT-TO-OPTION-STRING", 1, 0, false);
        declareFunction("cb_uia_uimma_observer", "CB-UIA-UIMMA-OBSERVER", 1, 0, false);
        declareFunction("cb_uiat_mumbler_show_uima_topics", "CB-UIAT-MUMBLER-SHOW-UIMA-TOPICS", 1, 0, false);
        declareFunction("cb_link_uia_steal_other_uia", "CB-LINK-UIA-STEAL-OTHER-UIA", 3, 1, false);
        declareFunction("cb_uia_steal_other_uia", "CB-UIA-STEAL-OTHER-UIA", 1, 0, false);
        declareFunction("cb_link_cb_uia_uimma_observer", "CB-LINK-CB-UIA-UIMMA-OBSERVER", 0, 2, false);
        declareFunction("cb_link_uimma_observer", "CB-LINK-UIMMA-OBSERVER", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_mumbler_file() {
        deflexical("*CB-UIA-MUMBLE-APPLET-HEIGHT*", $int$400);
        deflexical("*CB-UIA-MUMBLE-APPLET-WIDTH*", $int$550);
        deflexical("*CB-UIA-MUMBLE-SLEEP-SECONDS*", FOUR_INTEGER);
        deflexical("*CB-UIA-MUMBLE-SLEEP-DURATION*", multiply($int$1000, $cb_uia_mumble_sleep_seconds$.getGlobalValue()));
        deflexical("*CB-UIA-MUMBLE-WINDOW-HEIGHT*", add($int$50, $cb_uia_mumble_applet_height$.getGlobalValue()));
        deflexical("*CB-UIA-MUMBLE-WINDOW-WIDTH*", add($int$30, $cb_uia_mumble_applet_width$.getGlobalValue()));
        deflexical("*CB-UIA-MUMBLE-CLASS-FILE*", $str_alt5$com_cyc_rkf_mumbler_Mumbler);
        deflexical("*CB-UIA-MUMBLE-CLASS-FILE-FOR-TUNNEL*", $str_alt6$com_cyc_rkf_mumbler_MumblerTunnel);
        deflexical("*CB-UIA-MUMBLE-ARCHIVE*", $str_alt7$Mumbler_jar);
        deflexical("*CB-UIA-MUMBLE-ARCHIVE-FOR-TUNNEL*", $str_alt8$TunnelApplet_jar_Mumbler_jar);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_mumbler_file() {
                html_macros.note_html_handler_function(CB_UIA_OPEN_MUMBLE_WINDOW);
        cb_utilities.setup_cb_link_method($UIA_OPEN_MUMBLE_WINDOW, CB_LINK_UIA_OPEN_MUMBLE_WINDOW, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_UIMMA_OBSERVER);
        cb_utilities.setup_cb_link_method($UIA_STEAL_OTHER_UIA, CB_LINK_UIA_STEAL_OTHER_UIA, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_STEAL_OTHER_UIA);
        cb_utilities.setup_cb_link_method($CB_UIA_UIMMA_OBSERVER, CB_LINK_CB_UIA_UIMMA_OBSERVER, TWO_INTEGER);
        cb_utilities.declare_cb_tool($UIMMA_OBSERVER, $$$UIMMA_Observer, $$$UIMMA, $str_alt77$Observe_all_RKF_UIAs_on_this_serv);
        cb_utilities.setup_cb_link_method($UIMMA_OBSERVER, CB_LINK_UIMMA_OBSERVER, ONE_INTEGER);
        return NIL;
    }

    // // Internal Constants
    public static final SubLInteger $int$400 = makeInteger(400);

    public static final SubLInteger $int$550 = makeInteger(550);



    public static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $str_alt5$com_cyc_rkf_mumbler_Mumbler = makeString("com.cyc.rkf.mumbler.Mumbler");

    static private final SubLString $str_alt6$com_cyc_rkf_mumbler_MumblerTunnel = makeString("com.cyc.rkf.mumbler.MumblerTunnel");

    static private final SubLString $str_alt7$Mumbler_jar = makeString("Mumbler.jar");

    static private final SubLString $str_alt8$TunnelApplet_jar_Mumbler_jar = makeString("TunnelApplet.jar,Mumbler.jar");

    static private final SubLList $list_alt9 = list(makeSymbol("UIMA-ID"), makeSymbol("UIA-ID"), makeSymbol("&OPTIONAL"), makeSymbol("HEIGHT-STMT"), makeSymbol("WIDTH-STMT"), makeSymbol("FREQUENCY-STMT"));

    static private final SubLString $str_alt10$CYC_s_Musings = makeString("CYC's Musings");

    static private final SubLString $$$command = makeString("command");

    private static final SubLSymbol UIA_FETCH_MUMBLING = makeSymbol("UIA-FETCH-MUMBLING");

    static private final SubLString $$$sleep = makeString("sleep");

    static private final SubLString $$$trace = makeString("trace");

    static private final SubLString $$$true = makeString("true");

    static private final SubLString $$$uima = makeString("uima");

    static private final SubLString $$$uia = makeString("uia");

    static private final SubLString $$$port = makeString("port");

    static private final SubLString $$$unknown = makeString("unknown");

    private static final SubLSymbol CB_UIA_OPEN_MUMBLE_WINDOW = makeSymbol("CB-UIA-OPEN-MUMBLE-WINDOW");

    static private final SubLString $str_alt21$_java_rkf = makeString("/java/rkf");

    static private final SubLString $str_alt22$cb_uia_open_mumble_window__D__D = makeString("cb-uia-open-mumble-window&~D&~D");

    static private final SubLString $str_alt23$window_open__ = makeString("window.open('");

    static private final SubLString $str_alt24$__ = makeString("',");

    static private final SubLString $str_alt25$__A_ = makeString("'~A'");

    static private final SubLString $$$null = makeString("null");

    static private final SubLString $str_alt27$___A____ = makeString(",'~A'); ");

    static private final SubLString $str_alt28$return_false_ = makeString("return false;");

    private static final SubLSymbol $UIA_OPEN_MUMBLE_WINDOW = makeKeyword("UIA-OPEN-MUMBLE-WINDOW");

    private static final SubLSymbol CB_LINK_UIA_OPEN_MUMBLE_WINDOW = makeSymbol("CB-LINK-UIA-OPEN-MUMBLE-WINDOW");

    static private final SubLList $list_alt31 = list(makeKeyword("DEPENDENT"), makeKeyword("YES"));









    static private final SubLList $list_alt36 = list(list(makeKeyword("HOTKEYS"), makeKeyword("NO")), list(makeKeyword("DIRECTORIES"), makeKeyword("NO")), list(makeKeyword("MENUBAR"), makeKeyword("NO")), list(makeKeyword("RESIZABLE"), makeKeyword("YES")), list(makeKeyword("SCROLLBARS"), makeKeyword("NO")), list(makeKeyword("TOOLBAR"), makeKeyword("NO")));

    static private final SubLString $str_alt37$_ = makeString(",");

    static private final SubLList $list_alt38 = list(makeSymbol("COMMAND"), makeSymbol("VALUE"));

    static private final SubLString $str_alt39$_ = makeString("=");



    static private final SubLString $$$User_Meta_Meta_Agenda_Display = makeString("User Meta Meta Agenda Display");

    static private final SubLString $$$center = makeString("center");

    static private final SubLString $$$top = makeString("top");

    static private final SubLString $$$UI_Meta_Agenda = makeString("UI Meta Agenda");

    static private final SubLString $$$Users = makeString("Users");





    static private final SubLString $$$left = makeString("left");

    static private final SubLString $str_alt49$___D = makeString("# ~D");

    static private final SubLString $str_alt50$Dialogs_with_ = makeString("Dialogs with ");

    public static final SubLObject $$EnglishMt = constant_handles.reader_make_constant_shell(makeString("EnglishMt"));

    public static final SubLObject $$CyclistsMt = constant_handles.reader_make_constant_shell(makeString("CyclistsMt"));

    static private final SubLString $$$2 = makeString("2");

    static private final SubLString $$$right = makeString("right");

    static private final SubLString $$$user_not_identified_yet = makeString("user not identified yet");

    private static final SubLSymbol CB_UIA_UIMMA_OBSERVER = makeSymbol("CB-UIA-UIMMA-OBSERVER");

    private static final SubLSymbol $CYC_TO_USER = makeKeyword("CYC-TO-USER");

    static private final SubLString $str_alt58$Topics_ = makeString("Topics:");



    static private final SubLString $$$no_current_topic = makeString("no current topic");

    static private final SubLString $str_alt61$____D_ = makeString("(# ~D)");

    private static final SubLSymbol $UIA_STEAL_OTHER_UIA = makeKeyword("UIA-STEAL-OTHER-UIA");

    static private final SubLString $str_alt63$_Steal_ = makeString("[Steal]");

    static private final SubLString $str_alt64$cb_uia_steal_other_uia_UIMA__D_UI = makeString("cb-uia-steal-other-uia&UIMA=~D&UIA=~D");

    private static final SubLSymbol CB_LINK_UIA_STEAL_OTHER_UIA = makeSymbol("CB-LINK-UIA-STEAL-OTHER-UIA");

    static private final SubLString $$$UIMA = makeString("UIMA");

    static private final SubLString $$$UIA = makeString("UIA");

    static private final SubLString $str_alt68$Sorry__that_session_is_no_longer_ = makeString("Sorry, that session is no longer available.");

    private static final SubLSymbol $CB_UIA_UIMMA_OBSERVER = makeKeyword("CB-UIA-UIMMA-OBSERVER");

    private static final SubLSymbol CB_UIA_STEAL_OTHER_UIA = makeSymbol("CB-UIA-STEAL-OTHER-UIA");

    static private final SubLString $str_alt71$_UIMMA_ = makeString("[UIMMA]");

    static private final SubLString $str_alt72$cb_uia_uimma_observer = makeString("cb-uia-uimma-observer");

    private static final SubLSymbol CB_LINK_CB_UIA_UIMMA_OBSERVER = makeSymbol("CB-LINK-CB-UIA-UIMMA-OBSERVER");

    private static final SubLSymbol $UIMMA_OBSERVER = makeKeyword("UIMMA-OBSERVER");

    static private final SubLString $$$UIMMA_Observer = makeString("UIMMA Observer");

    static private final SubLString $$$UIMMA = makeString("UIMMA");

    static private final SubLString $str_alt77$Observe_all_RKF_UIAs_on_this_serv = makeString("Observe all RKF UIAs on this server");



    private static final SubLSymbol CB_LINK_UIMMA_OBSERVER = makeSymbol("CB-LINK-UIMMA-OBSERVER");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_mumbler_file();
    }

    public void initializeVariables() {
        init_cb_uia_mumbler_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_mumbler_file();
    }
}

