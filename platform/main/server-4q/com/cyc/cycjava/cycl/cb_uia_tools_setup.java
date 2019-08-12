/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
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
 *  module:      CB-UIA-TOOLS-SETUP
 *  source file: /cyc/top/cycl/cb-uia-tools-setup.lisp
 *  created:     2019/07/03 17:38:10
 */
public final class cb_uia_tools_setup extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_tools_setup() {
    }

    public static final SubLFile me = new cb_uia_tools_setup();

    public static final String myName = "com.cyc.cycjava.cycl.cb_uia_tools_setup";

    // // Definitions
    public static final SubLObject cb_uiat_configure_interface_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    return cb_uiat_configure_interface_guts(interaction);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_configure_interface_guts(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input($str_alt4$cb_uiat_handle_configure_interfac, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_indent(TWO_INTEGER);
                        cb_utilities.cb_link($UIA_REJECT_INTERACTION, interaction, $str_alt8$_Forget_it_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = uima_interface_parameter_declaration.uima_interface_parameters();
                                    SubLObject parameter = NIL;
                                    for (parameter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parameter = cdolist_list_var.first()) {
                                        {
                                            SubLObject ignore_me1 = uima_interface_parameter_declaration.uima_interface_parameter_type(parameter);
                                            SubLObject ignore_me = uima_interface_parameter_declaration.uima_interface_parameter_locked_method(parameter);
                                            SubLObject ignore_me2 = uima_interface_parameter_declaration.uima_interface_parameter_prompt_method(parameter);
                                            SubLObject ignore_me3 = uima_interface_parameter_declaration.uima_interface_parameter_html_answer_interpreter_method(parameter);
                                            if (NIL == uima_interface_parameter_declaration.ui_interface_parameter_locked_p(interaction, parameter)) {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                uima_interface_parameter_declaration.ui_interface_parameter_show_field(interaction, parameter);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                uima_interface_parameter_declaration.ui_interface_parameter_show_prompt(interaction, parameter);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt9$Launchers_to_start_in_separate_wi);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_princ($str_alt10$Note__To_start_these_in_a_separat);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($UIA_SEPARATE_KNOWLEDGE_REVIEWER, $$$New_Knowledge_Reviewer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($UIA_GLOSSARY, $$$Glossary_Viewer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_handle_configure_interface(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject answer_plist = NIL;
            SubLObject cdolist_list_var = uima_interface_parameter_declaration.uima_interface_parameters();
            SubLObject parameter = NIL;
            for (parameter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parameter = cdolist_list_var.first()) {
                {
                    SubLObject ignore_me1 = uima_interface_parameter_declaration.uima_interface_parameter_type(parameter);
                    SubLObject ignore_me = uima_interface_parameter_declaration.uima_interface_parameter_locked_method(parameter);
                    SubLObject ignore_me2 = uima_interface_parameter_declaration.uima_interface_parameter_prompt_method(parameter);
                    SubLObject ignore_me3 = uima_interface_parameter_declaration.uima_interface_parameter_html_answer_interpreter_method(parameter);
                    if (NIL == uima_interface_parameter_declaration.ui_interface_parameter_locked_p(interaction, parameter)) {
                        {
                            SubLObject field_name = princ_to_string(parameter);
                            SubLObject html_field_result = html_utilities.html_extract_input(field_name, args);
                            SubLObject value = uima_interface_parameter_declaration.interpret_interface_parameter(parameter, html_field_result);
                            answer_plist = nconc(list(parameter, value), answer_plist);
                        }
                    }
                }
            }
            {
                SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, answer_plist);
                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            }
        }
    }

    public static final SubLObject cb_uiat_user_modeler_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SPECIFY_LANGUAGE)) {
                    {
                        SubLObject datum_5 = plist;
                        SubLObject current_6 = datum_5;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_6;
                        SubLObject bad = NIL;
                        SubLObject current_7 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_5, $list_alt20);
                            current_7 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_5, $list_alt20);
                            if (NIL == member(current_7, $list_alt21, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_7 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_5, $list_alt20);
                        }
                        {
                            SubLObject language_prompts_tail = property_list_member($LANGUAGE_PROMPTS, current_6);
                            SubLObject language_prompts = (NIL != language_prompts_tail) ? ((SubLObject) (cadr(language_prompts_tail))) : NIL;
                            return cb_uiat_user_modeler_specify_language(interaction, language_prompts);
                        }
                    }
                } else
                    if (pcase_var.eql($SPECIFY_USER)) {
                        {
                            SubLObject datum_8 = plist;
                            SubLObject current_9 = datum_8;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_9;
                            SubLObject bad = NIL;
                            SubLObject current_10 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_8, $list_alt25);
                                current_10 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_8, $list_alt25);
                                if (NIL == member(current_10, $list_alt26, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_10 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_8, $list_alt25);
                            }
                            {
                                SubLObject cb_user_tail = property_list_member($CB_USER, current_9);
                                SubLObject cb_user = (NIL != cb_user_tail) ? ((SubLObject) (cadr(cb_user_tail))) : NIL;
                                return cb_uiat_user_modeler_specify_user(interaction, cb_user);
                            }
                        }
                    } else
                        if (pcase_var.eql($MODIFY)) {
                            {
                                SubLObject datum_11 = plist;
                                SubLObject current_12 = datum_11;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_12;
                                SubLObject bad = NIL;
                                SubLObject current_13 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_11, $list_alt29);
                                    current_13 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_11, $list_alt29);
                                    if (NIL == member(current_13, $list_alt30, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_13 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_11, $list_alt29);
                                }
                                {
                                    SubLObject language_tail = property_list_member($LANGUAGE, current_12);
                                    SubLObject language = (NIL != language_tail) ? ((SubLObject) (cadr(language_tail))) : NIL;
                                    SubLObject user_tail = property_list_member($USER, current_12);
                                    SubLObject user = (NIL != user_tail) ? ((SubLObject) (cadr(user_tail))) : NIL;
                                    SubLObject can_change_language_tail = property_list_member($CAN_CHANGE_LANGUAGE, current_12);
                                    SubLObject can_change_language = (NIL != can_change_language_tail) ? ((SubLObject) (cadr(can_change_language_tail))) : NIL;
                                    SubLObject can_change_user_tail = property_list_member($CAN_CHANGE_USER, current_12);
                                    SubLObject can_change_user = (NIL != can_change_user_tail) ? ((SubLObject) (cadr(can_change_user_tail))) : NIL;
                                    return cb_uiat_user_modeler_modify(interaction, language, user, can_change_language, can_change_user);
                                }
                            }
                        }


            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_user_modeler_specify_language(SubLObject interaction, SubLObject language_prompts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
            html_utilities.html_newline(UNPROVIDED);
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
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt35$Choose_Language__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject index = ZERO_INTEGER;
                        SubLObject cdolist_list_var = language_prompts;
                        SubLObject language_info = NIL;
                        for (language_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , language_info = cdolist_list_var.first()) {
                            {
                                SubLObject datum = language_info;
                                SubLObject current = datum;
                                SubLObject language = NIL;
                                SubLObject prompt = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt36);
                                language = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt36);
                                prompt = current.first();
                                current = current.rest();
                                {
                                    SubLObject supported = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                    destructuring_bind_must_listp(current, datum, $list_alt36);
                                    current = current.rest();
                                    if (NIL == current) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_utilities.cb_link($UIA_HANDLE_USER_MODELER_SPECIFY_LANGUAGE, interaction, index, language, supported, UNPROVIDED);
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
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ(prompt);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt36);
                                    }
                                }
                            }
                            index = add(index, ONE_INTEGER);
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_handle_user_modeler_specify_language(SubLObject interaction, SubLObject index, SubLObject language, SubLObject supported) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject language_string = uia_trampolines.uia_term_phrase(user_interaction_agenda.ui_agenda(interaction), language, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), UNPROVIDED);
                if (NIL == supported) {
                    html_utilities.html_princ($str_alt39$_);
                    html_utilities.html_princ(language_string);
                    html_utilities.html_princ($str_alt40$_);
                    return NIL;
                }
                {
                    SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    cb_parameters.cyc_cgi_url_int();
                    {
                        SubLObject arglist = list(interaction, index);
                        cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt42$cb_uiat_handle_user_modeler_speci, arglist);
                    }
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
                            html_utilities.html_princ($str_alt39$_);
                            html_utilities.html_princ(language_string);
                            html_utilities.html_princ($str_alt40$_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cb_uiat_handle_user_modeler_specify_language(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject choice = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            choice = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject language_prompts = uia_tools_setup.uiat_user_modeler_user_applicable_language_prompts(v_agenda);
                    SubLObject language_prompt = nth(choice, language_prompts);
                    SubLObject datum_20 = language_prompt;
                    SubLObject current_21 = datum_20;
                    SubLObject language_name = NIL;
                    SubLObject prompt = NIL;
                    destructuring_bind_must_consp(current_21, datum_20, $list_alt45);
                    language_name = current_21.first();
                    current_21 = current_21.rest();
                    destructuring_bind_must_consp(current_21, datum_20, $list_alt45);
                    prompt = current_21.first();
                    current_21 = current_21.rest();
                    {
                        SubLObject supported = (current_21.isCons()) ? ((SubLObject) (current_21.first())) : NIL;
                        destructuring_bind_must_listp(current_21, datum_20, $list_alt45);
                        current_21 = current_21.rest();
                        if (NIL == current_21) {
                            {
                                SubLObject language = uia_tools_setup.uiat_user_modeler_determine_language(language_name);
                                SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SPECIFY_LANGUAGE, list($LANGUAGE, language));
                                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                            }
                        } else {
                            cdestructuring_bind_error(datum_20, $list_alt45);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt44);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_user_modeler_specify_user(SubLObject interaction, SubLObject cb_user) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject generation_mt = user_interaction_agenda.ui_generation_language_mt(interaction);
                SubLObject domain_mt = $$CyclistsMt;
                cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                    html_script_utilities.html_js_focus_window();
                }
                cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
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
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input($str_alt48$cb_uiat_handle_user_modeler_speci, T, UNPROVIDED);
                            html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                            html_utilities.html_newline(TWO_INTEGER);
                            html_utilities.html_princ($$$I_am);
                            {
                                SubLObject _prev_bind_0_22 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                                SubLObject _prev_bind_1_23 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                                try {
                                    rkf_macros.$rkf_addressee$.bind($NONE, thread);
                                    rkf_macros.$rkf_speaker$.bind(NIL, thread);
                                    html_utilities.html_indent(TWO_INTEGER);
                                    html_utilities.html_text_input($$$user, cb_user == constants_high.find_constant(system_parameters.$default_cyclist_name$.getDynamicValue(thread)) ? ((SubLObject) ($str_alt52$)) : uia_trampolines.uia_term_phrase(v_agenda, cb_user, generation_mt, domain_mt, UNPROVIDED), $int$40);
                                } finally {
                                    rkf_macros.$rkf_speaker$.rebind(_prev_bind_1_23, thread);
                                    rkf_macros.$rkf_addressee$.rebind(_prev_bind_0_22, thread);
                                }
                            }
                            html_utilities.html_indent(TWO_INTEGER);
                            html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_handle_user_modeler_specify_user(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject user = html_utilities.html_extract_input($$$user, args);
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SPECIFY_USER, list($USER, user));
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_user_modeler_modify(SubLObject interaction, SubLObject language, SubLObject user, SubLObject can_change_language, SubLObject can_change_user) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!user.equal(operation_communication.the_cyclist())) {
                cb_system_tools.cb_set_the_cyclist(user);
                cb_tools.html_update_cb_toolbar_script();
            }
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
            html_utilities.html_newline(UNPROVIDED);
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
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($$$We_are_communicating_in);
                                    html_utilities.html_indent(UNPROVIDED);
                                    cb_uiat_user_modeler_show_term(language, interaction);
                                    html_utilities.html_princ($str_alt56$__);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_indent(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != can_change_language) {
                                        cb_utilities.cb_link($UIA_HANDLE_USER_MODELER_MODIFY, interaction, $str_alt58$change_language, $str_alt59$_Change_language_, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($$$I_think_you_are);
                                    html_utilities.html_indent(UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_30 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                                        try {
                                            rkf_macros.$rkf_addressee$.bind($NONE, thread);
                                            rkf_macros.$rkf_speaker$.bind(NIL, thread);
                                            cb_uiat_user_modeler_show_term(user, interaction);
                                        } finally {
                                            rkf_macros.$rkf_speaker$.rebind(_prev_bind_1, thread);
                                            rkf_macros.$rkf_addressee$.rebind(_prev_bind_0_30, thread);
                                        }
                                    }
                                    html_utilities.html_princ($str_alt56$__);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_indent(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != can_change_user) {
                                        cb_utilities.cb_link($UIA_HANDLE_USER_MODELER_MODIFY, interaction, $str_alt61$change_user, $str_alt62$_Change_user_, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_newline(UNPROVIDED);
                                    cb_utilities.cb_link($UIA_COMPLETE_INTERACTION, interaction, $str_alt64$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_indent(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_handle_user_modeler_modify(SubLObject interaction, SubLObject command, SubLObject linktext) {
        html_utilities.html_princ(linktext);
        return NIL;
    }

    public static final SubLObject cb_uiat_handle_user_modeler_modify(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject command = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt66);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt66);
            command = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject change = NIL;
                    if ($str_alt61$change_user.equal(command)) {
                        change = $USER;
                    } else
                        if ($str_alt58$change_language.equal(command)) {
                            change = $LANGUAGE;
                        }

                    {
                        SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $MODIFY, list($CHANGE, change));
                        return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt66);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_user_modeler_show_term(SubLObject v_term, SubLObject interaction) {
        cb_uia_display_primitives.cb_uia_fancy_show_term(v_term, list($INTERACTION, interaction, $LINK, $NONE));
        return v_term;
    }

    public static final SubLObject cb_uiat_topic_specifier_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_35 = plist;
                        SubLObject current_36 = datum_35;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_36;
                        SubLObject bad = NIL;
                        SubLObject current_37 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_35, $list_alt73);
                            current_37 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_35, $list_alt73);
                            if (NIL == member(current_37, $list_alt74, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_37 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_35, $list_alt73);
                        }
                        {
                            SubLObject default_topic_tail = property_list_member($DEFAULT_TOPIC, current_36);
                            SubLObject default_topic = (NIL != default_topic_tail) ? ((SubLObject) (cadr(default_topic_tail))) : NIL;
                            SubLObject current_topic_tail = property_list_member($CURRENT_TOPIC, current_36);
                            SubLObject current_topic = (NIL != current_topic_tail) ? ((SubLObject) (cadr(current_topic_tail))) : NIL;
                            SubLObject current_topic_name_tail = property_list_member($CURRENT_TOPIC_NAME, current_36);
                            SubLObject current_topic_name = (NIL != current_topic_name_tail) ? ((SubLObject) (cadr(current_topic_name_tail))) : NIL;
                            SubLObject cool_topics_tail = property_list_member($COOL_TOPICS, current_36);
                            SubLObject cool_topics = (NIL != cool_topics_tail) ? ((SubLObject) (cadr(cool_topics_tail))) : NIL;
                            SubLObject other_topics_tail = property_list_member($OTHER_TOPICS, current_36);
                            SubLObject other_topics = (NIL != other_topics_tail) ? ((SubLObject) (cadr(other_topics_tail))) : NIL;
                            SubLObject old_topic_list_tail = property_list_member($OLD_TOPIC_LIST, current_36);
                            SubLObject old_topic_list = (NIL != old_topic_list_tail) ? ((SubLObject) (cadr(old_topic_list_tail))) : NIL;
                            return cb_uiat_topic_specifier_guts(interaction, default_topic, current_topic, current_topic_name, cool_topics, other_topics, old_topic_list);
                        }
                    }
                } else
                    if (pcase_var.eql($OFFER_RESTART)) {
                        {
                            SubLObject datum_38 = plist;
                            SubLObject current_39 = datum_38;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_39;
                            SubLObject bad = NIL;
                            SubLObject current_40 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_38, $list_alt82);
                                current_40 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_38, $list_alt82);
                                if (NIL == member(current_40, $list_alt83, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_40 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_38, $list_alt82);
                            }
                            {
                                SubLObject old_topic_list_tail = property_list_member($OLD_TOPIC_LIST, current_39);
                                SubLObject old_topic_list = (NIL != old_topic_list_tail) ? ((SubLObject) (cadr(old_topic_list_tail))) : NIL;
                                return cb_uiat_topic_specifier_offer_restart(interaction, old_topic_list);
                            }
                        }
                    }

            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_topic_specifier_offer_restart(SubLObject interaction, SubLObject old_topic_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt84$_1);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color($BLUE));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ($str_alt86$It_appears_we_were_interrupted_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_princ($str_alt87$It_is_highly_recommended_that_we_);
            html_utilities.html_newline(TWO_INTEGER);
            cb_uiat_topic_specifier_resume_old_topic(interaction, old_topic_list);
            html_utilities.html_newline(TWO_INTEGER);
            cb_utilities.cb_link($DONT_RESUME_OLD_TOPIC, interaction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_topic_specifier_guts(SubLObject interaction, SubLObject default_topic, SubLObject current_topic, SubLObject current_topic_name, SubLObject cool_topics, SubLObject other_topics, SubLObject old_topic_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input($str_alt89$cb_uiat_handle_topic_specifier, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_41 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                            SubLObject _prev_bind_1_42 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                            try {
                                rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(user_interaction_agenda.ui_agenda(interaction), $CYC_TO_USER), thread);
                                rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(user_interaction_agenda.ui_agenda(interaction), $CYC_TO_USER), thread);
                                if (NIL != forts.fort_p(current_topic)) {
                                    html_utilities.html_princ($str_alt91$We_are_currently_talking_about_);
                                    cb_uia_display_primitives.cb_uia_show_term(current_topic, current_topic_name);
                                    html_utilities.html_indent(TWO_INTEGER);
                                    html_utilities.html_submit_input($$$Stay_on_Topic, $$$stay, UNPROVIDED);
                                    html_utilities.html_newline(TWO_INTEGER);
                                }
                                if (NIL != other_topics) {
                                    html_utilities.html_princ($str_alt94$We_could_revisit_);
                                    if (ONE_INTEGER.numE(length(other_topics))) {
                                        html_utilities.html_princ($str_alt95$the_following_topic_);
                                    } else {
                                        html_utilities.html_princ($str_alt96$one_of_the_following_topics_);
                                    }
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($$$center));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(ZERO_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject cdolist_list_var = other_topics;
                                                SubLObject topic_description = NIL;
                                                for (topic_description = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , topic_description = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum = topic_description;
                                                        SubLObject current = datum;
                                                        SubLObject allow_other_keys_p = NIL;
                                                        SubLObject rest = current;
                                                        SubLObject bad = NIL;
                                                        SubLObject current_44 = NIL;
                                                        for (; NIL != rest;) {
                                                            destructuring_bind_must_consp(rest, datum, $list_alt98);
                                                            current_44 = rest.first();
                                                            rest = rest.rest();
                                                            destructuring_bind_must_consp(rest, datum, $list_alt98);
                                                            if (NIL == member(current_44, $list_alt99, UNPROVIDED, UNPROVIDED)) {
                                                                bad = T;
                                                            }
                                                            if (current_44 == $ALLOW_OTHER_KEYS) {
                                                                allow_other_keys_p = rest.first();
                                                            }
                                                            rest = rest.rest();
                                                        }
                                                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                            cdestructuring_bind_error(datum, $list_alt98);
                                                        }
                                                        {
                                                            SubLObject agenda_id_tail = property_list_member($AGENDA_ID, current);
                                                            SubLObject agenda_id = (NIL != agenda_id_tail) ? ((SubLObject) (cadr(agenda_id_tail))) : NIL;
                                                            SubLObject topic_tail = property_list_member($TOPIC, current);
                                                            SubLObject topic = (NIL != topic_tail) ? ((SubLObject) (cadr(topic_tail))) : NIL;
                                                            SubLObject topic_name_tail = property_list_member($TOPIC_NAME, current);
                                                            SubLObject topic_name = (NIL != topic_name_tail) ? ((SubLObject) (cadr(topic_name_tail))) : NIL;
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($$$left));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            cb_utilities.cb_link($UIAT_RESUME_TOPIC, interaction, agenda_id, $str_alt105$_Revisit_, UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_indent(UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            cb_uia_display_primitives.cb_uia_show_term(topic, topic_name);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    html_utilities.html_newline(TWO_INTEGER);
                                }
                                cb_uiat_topic_specifier_resume_old_topic(interaction, old_topic_list);
                                html_utilities.html_newline(TWO_INTEGER);
                                if (NIL != current_topic) {
                                    html_utilities.html_princ($str_alt106$Or_we_could_talk_about_a_new_topi);
                                } else
                                    if (NIL != old_topic_list) {
                                        html_utilities.html_princ($$$Or_we_could_start_a_new_topic);
                                    } else {
                                        html_utilities.html_princ($str_alt108$What_topic_would_you_like_to_talk);
                                    }

                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_text_input($$$topic, default_topic, $int$40);
                                html_utilities.html_indent(TWO_INTEGER);
                                html_utilities.html_submit_input($$$Start_This_Topic, $$$new, UNPROVIDED);
                                if (NIL != cool_topics) {
                                    html_utilities.html_newline(TWO_INTEGER);
                                    {
                                        SubLObject object_id = $str_alt112$topic_ideas;
                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt113$text_css);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$screen);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_terpri(UNPROVIDED);
                                                dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                                                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                                                html_utilities.html_markup($$$none);
                                                dhtml_macros.dhtml_dom_attribute_postamble();
                                                dhtml_macros.dhtml_dom_wrapper_postamble();
                                                html_utilities.html_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                            }
                                        }
                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                                        html_utilities.html_terpri(UNPROVIDED);
                                        dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$Available_Topics);
                                        dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                        if (NIL != object_id) {
                                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(object_id);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                                                            SubLObject cdolist_list_var = cool_topics;
                                                            SubLObject topic_tuple = NIL;
                                                            for (topic_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , topic_tuple = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject datum = topic_tuple;
                                                                    SubLObject current = datum;
                                                                    SubLObject topic_term = NIL;
                                                                    SubLObject topic_name = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt120);
                                                                    topic_term = current.first();
                                                                    current = current.rest();
                                                                    topic_name = current;
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    {
                                                                                        SubLObject id = user_interaction_agenda.uia_glob_add(v_agenda, topic_term);
                                                                                        cb_utilities.cb_link($UIAT_PICK_TOPIC, interaction, id, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ(topic_name);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                                html_utilities.html_newline(TWO_INTEGER);
                                html_utilities.html_princ($str_alt122$Or_we_could_load_and_resume_a_top);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_submit_input($$$Load_and_Resume, $$$load, UNPROVIDED);
                            } finally {
                                rkf_macros.$rkf_speaker$.rebind(_prev_bind_1_42, thread);
                                rkf_macros.$rkf_addressee$.rebind(_prev_bind_0_41, thread);
                            }
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_topic_specifier_resume_old_topic(SubLObject interaction, SubLObject old_topic_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != old_topic_list) {
                html_utilities.html_princ($str_alt125$We_appear_to_have_been_interrupte);
                if (NIL == list_utilities.singletonP(old_topic_list)) {
                    html_utilities.html_princ($str_alt126$one_of_);
                }
                html_utilities.html_princ($$$the_following_conversation);
                if (NIL == list_utilities.singletonP(old_topic_list)) {
                    html_utilities.html_princ(CHAR_s);
                }
                html_utilities.html_princ($str_alt128$__);
                html_utilities.html_newline(TWO_INTEGER);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
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
                            SubLObject cdolist_list_var = old_topic_list;
                            SubLObject old_topic = NIL;
                            for (old_topic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , old_topic = cdolist_list_var.first()) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject datum = old_topic;
                                            SubLObject current = datum;
                                            SubLObject topic_name = NIL;
                                            SubLObject interaction_mt = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt129);
                                            topic_name = current.first();
                                            current = current.rest();
                                            interaction_mt = current;
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_utilities.cb_link($UIAT_PICK_OLD_TOPIC, interaction, interaction_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ(topic_name);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject size_val = $str_alt131$_1;
                                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                        if (NIL != size_val) {
                                                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(size_val);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt132$_Begun_);
                                                                cb_uiat_topic_specifier_show_date(interaction_mt);
                                                                html_utilities.html_princ(CHAR_rparen);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_topic_specifier_show_date(SubLObject interaction_mt) {
        {
            SubLObject date = bookkeeping_store.creation_date_cycl(interaction_mt);
            SubLObject rendition = uia_trampolines.uia_bootstrapping_generate_phrase(date);
            html_utilities.html_princ(rendition);
        }
        return interaction_mt;
    }

    public static final SubLObject cb_link_uiat_resume_topic(SubLObject interaction, SubLObject agenda_id, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt133$_Resume_Topic_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, agenda_id);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt135$cb_uiat_handle_resume_topic, arglist);
                }
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

    public static final SubLObject cb_link_dont_resume_old_topic(SubLObject interaction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt137$_No_thank_you__let_s_talk_about_s;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt138$cb_uiat_handle_dont_resume_old_to, arglist);
                }
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

    public static final SubLObject cb_link_uiat_pick_old_topic(SubLObject interaction, SubLObject interaction_mt, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt140$_Resume_Interrupted_Topic_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, interaction_mt);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt141$cb_uiat_handle_pick_old_topic, arglist);
                }
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

    public static final SubLObject cb_link_uiat_pick_topic(SubLObject interaction, SubLObject globid, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt143$_Select_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, globid);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt144$cb_uiat_handle_pick_topic, arglist);
                }
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

    public static final SubLObject cb_uiat_handle_resume_topic(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject reply = NIL;
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject agenda_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt146);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt146);
            agenda_id = current.first();
            current = current.rest();
            if (NIL == current) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $RESUME_TOPIC, list($AGENDA_ID, agenda_id));
            } else {
                cdestructuring_bind_error(datum, $list_alt146);
            }
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_handle_dont_resume_old_topic(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject reply = NIL;
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt149);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $IGNORE_OLD_TOPIC, NIL);
            } else {
                cdestructuring_bind_error(datum, $list_alt149);
            }
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_handle_pick_topic(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject reply = NIL;
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject globid = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt152);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt152);
            globid = current.first();
            current = current.rest();
            if (NIL == current) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, list($TOPIC, user_interaction_agenda.uia_glob_lookup(v_agenda, globid, UNPROVIDED)));
            } else {
                cdestructuring_bind_error(datum, $list_alt152);
            }
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_handle_pick_old_topic(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject reply = NIL;
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject interaction_mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt154);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt154);
            interaction_mt = current.first();
            current = current.rest();
            if (NIL == current) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $RESUME_OLD_TOPIC, list($INTERACTION_MT, interaction_mt));
            } else {
                cdestructuring_bind_error(datum, $list_alt154);
            }
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_handle_topic_specifier(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject reply = NIL;
            if (NIL != html_utilities.html_extract_input($$$stay, args)) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $STAY_ON_TOPIC, NIL);
            } else
                if (NIL != html_utilities.html_extract_input($$$load, args)) {
                    reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $LOAD_REQUEST, NIL);
                } else {
                    {
                        SubLObject topic = html_utilities.html_extract_input($$$topic, args);
                        reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, list($TOPIC, topic));
                    }
                }

            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_initializer_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_59 = plist;
                        SubLObject current_60 = datum_59;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_60;
                        SubLObject bad = NIL;
                        SubLObject current_61 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_59, $list_alt163);
                            current_61 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_59, $list_alt163);
                            if (NIL == member(current_61, $list_alt164, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_61 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_59, $list_alt163);
                        }
                        {
                            SubLObject message_tail = property_list_member($MESSAGE, current_60);
                            SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
                            cb_user_interaction_agenda.cb_uia_launchers_refresh_script();
                            cb_user_interaction_agenda.cb_uia_command_interpreter_refresh_script();
                            cb_uia_tools_basic.cb_uiat_message_guts(interaction, message, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cb_uia_tools_setup_file() {
        declareFunction("cb_uiat_configure_interface_render_request", "CB-UIAT-CONFIGURE-INTERFACE-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_configure_interface_guts", "CB-UIAT-CONFIGURE-INTERFACE-GUTS", 1, 0, false);
        declareFunction("cb_uiat_handle_configure_interface", "CB-UIAT-HANDLE-CONFIGURE-INTERFACE", 1, 0, false);
        declareFunction("cb_uiat_user_modeler_render_request", "CB-UIAT-USER-MODELER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_user_modeler_specify_language", "CB-UIAT-USER-MODELER-SPECIFY-LANGUAGE", 2, 0, false);
        declareFunction("cb_link_uia_handle_user_modeler_specify_language", "CB-LINK-UIA-HANDLE-USER-MODELER-SPECIFY-LANGUAGE", 4, 0, false);
        declareFunction("cb_uiat_handle_user_modeler_specify_language", "CB-UIAT-HANDLE-USER-MODELER-SPECIFY-LANGUAGE", 1, 0, false);
        declareFunction("cb_uiat_user_modeler_specify_user", "CB-UIAT-USER-MODELER-SPECIFY-USER", 2, 0, false);
        declareFunction("cb_uiat_handle_user_modeler_specify_user", "CB-UIAT-HANDLE-USER-MODELER-SPECIFY-USER", 1, 0, false);
        declareFunction("cb_uiat_user_modeler_modify", "CB-UIAT-USER-MODELER-MODIFY", 5, 0, false);
        declareFunction("cb_link_uia_handle_user_modeler_modify", "CB-LINK-UIA-HANDLE-USER-MODELER-MODIFY", 3, 0, false);
        declareFunction("cb_uiat_handle_user_modeler_modify", "CB-UIAT-HANDLE-USER-MODELER-MODIFY", 1, 0, false);
        declareFunction("cb_uiat_user_modeler_show_term", "CB-UIAT-USER-MODELER-SHOW-TERM", 2, 0, false);
        declareFunction("cb_uiat_topic_specifier_render_request", "CB-UIAT-TOPIC-SPECIFIER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_topic_specifier_offer_restart", "CB-UIAT-TOPIC-SPECIFIER-OFFER-RESTART", 2, 0, false);
        declareFunction("cb_uiat_topic_specifier_guts", "CB-UIAT-TOPIC-SPECIFIER-GUTS", 7, 0, false);
        declareFunction("cb_uiat_topic_specifier_resume_old_topic", "CB-UIAT-TOPIC-SPECIFIER-RESUME-OLD-TOPIC", 2, 0, false);
        declareFunction("cb_uiat_topic_specifier_show_date", "CB-UIAT-TOPIC-SPECIFIER-SHOW-DATE", 1, 0, false);
        declareFunction("cb_link_uiat_resume_topic", "CB-LINK-UIAT-RESUME-TOPIC", 2, 1, false);
        declareFunction("cb_link_dont_resume_old_topic", "CB-LINK-DONT-RESUME-OLD-TOPIC", 1, 1, false);
        declareFunction("cb_link_uiat_pick_old_topic", "CB-LINK-UIAT-PICK-OLD-TOPIC", 2, 1, false);
        declareFunction("cb_link_uiat_pick_topic", "CB-LINK-UIAT-PICK-TOPIC", 2, 1, false);
        declareFunction("cb_uiat_handle_resume_topic", "CB-UIAT-HANDLE-RESUME-TOPIC", 1, 0, false);
        declareFunction("cb_uiat_handle_dont_resume_old_topic", "CB-UIAT-HANDLE-DONT-RESUME-OLD-TOPIC", 1, 0, false);
        declareFunction("cb_uiat_handle_pick_topic", "CB-UIAT-HANDLE-PICK-TOPIC", 1, 0, false);
        declareFunction("cb_uiat_handle_pick_old_topic", "CB-UIAT-HANDLE-PICK-OLD-TOPIC", 1, 0, false);
        declareFunction("cb_uiat_handle_topic_specifier", "CB-UIAT-HANDLE-TOPIC-SPECIFIER", 1, 0, false);
        declareFunction("cb_uiat_initializer_render_request", "CB-UIAT-INITIALIZER-RENDER-REQUEST", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_tools_setup_file() {
        return NIL;
    }

    public static final SubLObject setup_cb_uia_tools_setup_file() {
                cb_uia_tool_declaration.declare_cb_uia_tool($CONFIGURE_INTERFACE, $list_alt1);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_CONFIGURE_INTERFACE);
        cb_uia_tool_declaration.declare_cb_uia_tool($USER_MODELER, $list_alt18);
        cb_utilities.setup_cb_link_method($UIA_HANDLE_USER_MODELER_SPECIFY_LANGUAGE, CB_LINK_UIA_HANDLE_USER_MODELER_SPECIFY_LANGUAGE, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_USER_MODELER_SPECIFY_LANGUAGE);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_USER_MODELER_SPECIFY_USER);
        cb_utilities.setup_cb_link_method($UIA_HANDLE_USER_MODELER_MODIFY, CB_LINK_UIA_HANDLE_USER_MODELER_MODIFY, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_USER_MODELER_MODIFY);
        cb_uia_tool_declaration.declare_cb_uia_tool($TOPIC_SPECIFIER, $list_alt72);
        cb_utilities.setup_cb_link_method($UIAT_RESUME_TOPIC, CB_LINK_UIAT_RESUME_TOPIC, THREE_INTEGER);
        cb_utilities.setup_cb_link_method($DONT_RESUME_OLD_TOPIC, CB_LINK_DONT_RESUME_OLD_TOPIC, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_PICK_OLD_TOPIC, CB_LINK_UIAT_PICK_OLD_TOPIC, THREE_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_PICK_TOPIC, CB_LINK_UIAT_PICK_TOPIC, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_RESUME_TOPIC);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_DONT_RESUME_OLD_TOPIC);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_PICK_TOPIC);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_PICK_OLD_TOPIC);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_TOPIC_SPECIFIER);
        cb_uia_tool_declaration.declare_cb_uia_tool($INITIALIZER, $list_alt162);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $CONFIGURE_INTERFACE = makeKeyword("CONFIGURE-INTERFACE");

    static private final SubLList $list_alt1 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-CONFIGURE-INTERFACE-RENDER-REQUEST"));

    static private final SubLList $list_alt2 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("SIGNATURE"), makeSymbol("PLIST"));



    static private final SubLString $str_alt4$cb_uiat_handle_configure_interfac = makeString("cb-uiat-handle-configure-interface");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $$$Submit = makeString("Submit");

    private static final SubLSymbol $UIA_REJECT_INTERACTION = makeKeyword("UIA-REJECT-INTERACTION");

    static private final SubLString $str_alt8$_Forget_it_ = makeString("[Forget it]");

    static private final SubLString $str_alt9$Launchers_to_start_in_separate_wi = makeString("Launchers to start in separate windows/tabs");

    static private final SubLString $str_alt10$Note__To_start_these_in_a_separat = makeString("Note: To start these in a separate tab, right-click and choose 'Open Link in New Tab'");

    private static final SubLSymbol $UIA_SEPARATE_KNOWLEDGE_REVIEWER = makeKeyword("UIA-SEPARATE-KNOWLEDGE-REVIEWER");

    static private final SubLString $$$New_Knowledge_Reviewer = makeString("New Knowledge Reviewer");

    private static final SubLSymbol $UIA_GLOSSARY = makeKeyword("UIA-GLOSSARY");

    static private final SubLString $$$Glossary_Viewer = makeString("Glossary Viewer");



    private static final SubLSymbol CB_UIAT_HANDLE_CONFIGURE_INTERFACE = makeSymbol("CB-UIAT-HANDLE-CONFIGURE-INTERFACE");

    private static final SubLSymbol $USER_MODELER = makeKeyword("USER-MODELER");

    static private final SubLList $list_alt18 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-USER-MODELER-RENDER-REQUEST"), makeKeyword("HINT-NAME"), makeString("Get user information"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycUserModeler")));

    private static final SubLSymbol $SPECIFY_LANGUAGE = makeKeyword("SPECIFY-LANGUAGE");

    static private final SubLList $list_alt20 = list(makeSymbol("&KEY"), makeSymbol("LANGUAGE-PROMPTS"));

    static private final SubLList $list_alt21 = list(makeKeyword("LANGUAGE-PROMPTS"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $LANGUAGE_PROMPTS = makeKeyword("LANGUAGE-PROMPTS");

    private static final SubLSymbol $SPECIFY_USER = makeKeyword("SPECIFY-USER");

    static private final SubLList $list_alt25 = list(makeSymbol("&KEY"), makeSymbol("CB-USER"));

    static private final SubLList $list_alt26 = list(makeKeyword("CB-USER"));

    private static final SubLSymbol $CB_USER = makeKeyword("CB-USER");

    private static final SubLSymbol $MODIFY = makeKeyword("MODIFY");

    static private final SubLList $list_alt29 = list(makeSymbol("&KEY"), makeSymbol("LANGUAGE"), makeSymbol("USER"), list(makeSymbol("CAN-CHANGE-LANGUAGE"), NIL), list(makeSymbol("CAN-CHANGE-USER"), NIL));

    static private final SubLList $list_alt30 = list(makeKeyword("LANGUAGE"), $USER, makeKeyword("CAN-CHANGE-LANGUAGE"), makeKeyword("CAN-CHANGE-USER"));





    private static final SubLSymbol $CAN_CHANGE_LANGUAGE = makeKeyword("CAN-CHANGE-LANGUAGE");

    private static final SubLSymbol $CAN_CHANGE_USER = makeKeyword("CAN-CHANGE-USER");

    static private final SubLString $str_alt35$Choose_Language__ = makeString("Choose Language :");

    static private final SubLList $list_alt36 = list(makeSymbol("LANGUAGE"), makeSymbol("PROMPT"), makeSymbol("&OPTIONAL"), makeSymbol("SUPPORTED"));



    private static final SubLSymbol $UIA_HANDLE_USER_MODELER_SPECIFY_LANGUAGE = makeKeyword("UIA-HANDLE-USER-MODELER-SPECIFY-LANGUAGE");

    static private final SubLString $str_alt39$_ = makeString("[");

    static private final SubLString $str_alt40$_ = makeString("]");



    static private final SubLString $str_alt42$cb_uiat_handle_user_modeler_speci = makeString("cb-uiat-handle-user-modeler-specify-language");

    private static final SubLSymbol CB_LINK_UIA_HANDLE_USER_MODELER_SPECIFY_LANGUAGE = makeSymbol("CB-LINK-UIA-HANDLE-USER-MODELER-SPECIFY-LANGUAGE");

    static private final SubLList $list_alt44 = list(makeSymbol("INTERACTION"), makeSymbol("CHOICE"));

    static private final SubLList $list_alt45 = list(makeSymbol("LANGUAGE-NAME"), makeSymbol("PROMPT"), makeSymbol("&OPTIONAL"), makeSymbol("SUPPORTED"));

    private static final SubLSymbol CB_UIAT_HANDLE_USER_MODELER_SPECIFY_LANGUAGE = makeSymbol("CB-UIAT-HANDLE-USER-MODELER-SPECIFY-LANGUAGE");

    public static final SubLObject $$CyclistsMt = constant_handles.reader_make_constant_shell(makeString("CyclistsMt"));

    static private final SubLString $str_alt48$cb_uiat_handle_user_modeler_speci = makeString("cb-uiat-handle-user-modeler-specify-user");

    static private final SubLString $$$I_am = makeString("I am");



    static private final SubLString $$$user = makeString("user");

    static private final SubLString $str_alt52$ = makeString("");

    public static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLSymbol CB_UIAT_HANDLE_USER_MODELER_SPECIFY_USER = makeSymbol("CB-UIAT-HANDLE-USER-MODELER-SPECIFY-USER");

    static private final SubLString $$$We_are_communicating_in = makeString("We are communicating in");

    static private final SubLString $str_alt56$__ = makeString(" .");

    private static final SubLSymbol $UIA_HANDLE_USER_MODELER_MODIFY = makeKeyword("UIA-HANDLE-USER-MODELER-MODIFY");

    static private final SubLString $str_alt58$change_language = makeString("change-language");

    static private final SubLString $str_alt59$_Change_language_ = makeString("[Change language]");

    static private final SubLString $$$I_think_you_are = makeString("I think you are");

    static private final SubLString $str_alt61$change_user = makeString("change-user");

    static private final SubLString $str_alt62$_Change_user_ = makeString("[Change user]");

    private static final SubLSymbol $UIA_COMPLETE_INTERACTION = makeKeyword("UIA-COMPLETE-INTERACTION");

    static private final SubLString $str_alt64$_Continue_ = makeString("[Continue]");

    private static final SubLSymbol CB_LINK_UIA_HANDLE_USER_MODELER_MODIFY = makeSymbol("CB-LINK-UIA-HANDLE-USER-MODELER-MODIFY");

    static private final SubLList $list_alt66 = list(makeSymbol("INTERACTION"), makeSymbol("COMMAND"));



    private static final SubLSymbol CB_UIAT_HANDLE_USER_MODELER_MODIFY = makeSymbol("CB-UIAT-HANDLE-USER-MODELER-MODIFY");





    private static final SubLSymbol $TOPIC_SPECIFIER = makeKeyword("TOPIC-SPECIFIER");

    static private final SubLList $list_alt72 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-TOPIC-SPECIFIER-RENDER-REQUEST"), makeKeyword("HINT-NAME"), makeString("Specify topic"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycTopicSpecifier")));

    static private final SubLList $list_alt73 = list(makeSymbol("&KEY"), makeSymbol("DEFAULT-TOPIC"), makeSymbol("CURRENT-TOPIC"), makeSymbol("CURRENT-TOPIC-NAME"), makeSymbol("COOL-TOPICS"), makeSymbol("OTHER-TOPICS"), makeSymbol("OLD-TOPIC-LIST"));

    static private final SubLList $list_alt74 = list(makeKeyword("DEFAULT-TOPIC"), makeKeyword("CURRENT-TOPIC"), makeKeyword("CURRENT-TOPIC-NAME"), makeKeyword("COOL-TOPICS"), makeKeyword("OTHER-TOPICS"), makeKeyword("OLD-TOPIC-LIST"));

    private static final SubLSymbol $DEFAULT_TOPIC = makeKeyword("DEFAULT-TOPIC");

    private static final SubLSymbol $CURRENT_TOPIC = makeKeyword("CURRENT-TOPIC");

    private static final SubLSymbol $CURRENT_TOPIC_NAME = makeKeyword("CURRENT-TOPIC-NAME");

    private static final SubLSymbol $COOL_TOPICS = makeKeyword("COOL-TOPICS");

    private static final SubLSymbol $OTHER_TOPICS = makeKeyword("OTHER-TOPICS");

    private static final SubLSymbol $OLD_TOPIC_LIST = makeKeyword("OLD-TOPIC-LIST");

    private static final SubLSymbol $OFFER_RESTART = makeKeyword("OFFER-RESTART");

    static private final SubLList $list_alt82 = list(makeSymbol("&KEY"), makeSymbol("OLD-TOPIC-LIST"));

    static private final SubLList $list_alt83 = list(makeKeyword("OLD-TOPIC-LIST"));

    static private final SubLString $str_alt84$_1 = makeString("+1");



    static private final SubLString $str_alt86$It_appears_we_were_interrupted_ = makeString("It appears we were interrupted!");

    static private final SubLString $str_alt87$It_is_highly_recommended_that_we_ = makeString("It is highly recommended that we continue this conversation instead of pursuing any other.");

    private static final SubLSymbol $DONT_RESUME_OLD_TOPIC = makeKeyword("DONT-RESUME-OLD-TOPIC");

    static private final SubLString $str_alt89$cb_uiat_handle_topic_specifier = makeString("cb-uiat-handle-topic-specifier");

    private static final SubLSymbol $CYC_TO_USER = makeKeyword("CYC-TO-USER");

    static private final SubLString $str_alt91$We_are_currently_talking_about_ = makeString("We are currently talking about ");

    static private final SubLString $$$Stay_on_Topic = makeString("Stay on Topic");

    static private final SubLString $$$stay = makeString("stay");

    static private final SubLString $str_alt94$We_could_revisit_ = makeString("We could revisit ");

    static private final SubLString $str_alt95$the_following_topic_ = makeString("the following topic:");

    static private final SubLString $str_alt96$one_of_the_following_topics_ = makeString("one of the following topics:");

    static private final SubLString $$$center = makeString("center");

    static private final SubLList $list_alt98 = list(makeSymbol("&KEY"), makeSymbol("AGENDA-ID"), makeSymbol("TOPIC"), makeSymbol("TOPIC-NAME"));

    static private final SubLList $list_alt99 = list(makeKeyword("AGENDA-ID"), makeKeyword("TOPIC"), makeKeyword("TOPIC-NAME"));

    private static final SubLSymbol $AGENDA_ID = makeKeyword("AGENDA-ID");



    private static final SubLSymbol $TOPIC_NAME = makeKeyword("TOPIC-NAME");

    static private final SubLString $$$left = makeString("left");

    private static final SubLSymbol $UIAT_RESUME_TOPIC = makeKeyword("UIAT-RESUME-TOPIC");

    static private final SubLString $str_alt105$_Revisit_ = makeString("[Revisit]");

    static private final SubLString $str_alt106$Or_we_could_talk_about_a_new_topi = makeString("Or we could talk about a new topic");

    static private final SubLString $$$Or_we_could_start_a_new_topic = makeString("Or we could start a new topic");

    static private final SubLString $str_alt108$What_topic_would_you_like_to_talk = makeString("What topic would you like to talk about?");

    static private final SubLString $$$topic = makeString("topic");

    static private final SubLString $$$Start_This_Topic = makeString("Start This Topic");

    static private final SubLString $$$new = makeString("new");

    static private final SubLString $str_alt112$topic_ideas = makeString("topic_ideas");

    static private final SubLString $str_alt113$text_css = makeString("text/css");

    static private final SubLString $$$screen = makeString("screen");

    static private final SubLString $$$none = makeString("none");

    static private final SubLString $$$Available_Topics = makeString("Available Topics");







    static private final SubLList $list_alt120 = cons(makeSymbol("TOPIC-TERM"), makeSymbol("TOPIC-NAME"));

    private static final SubLSymbol $UIAT_PICK_TOPIC = makeKeyword("UIAT-PICK-TOPIC");

    static private final SubLString $str_alt122$Or_we_could_load_and_resume_a_top = makeString("Or we could load and resume a topic that was saved out");

    static private final SubLString $$$Load_and_Resume = makeString("Load and Resume");

    static private final SubLString $$$load = makeString("load");

    static private final SubLString $str_alt125$We_appear_to_have_been_interrupte = makeString("We appear to have been interrupted during ");

    static private final SubLString $str_alt126$one_of_ = makeString("one of ");

    static private final SubLString $$$the_following_conversation = makeString("the following conversation");

    static private final SubLString $str_alt128$__ = makeString(" :");

    static private final SubLList $list_alt129 = cons(makeSymbol("TOPIC-NAME"), makeSymbol("INTERACTION-MT"));

    private static final SubLSymbol $UIAT_PICK_OLD_TOPIC = makeKeyword("UIAT-PICK-OLD-TOPIC");

    static private final SubLString $str_alt131$_1 = makeString("-1");

    static private final SubLString $str_alt132$_Begun_ = makeString("(Begun ");

    static private final SubLString $str_alt133$_Resume_Topic_ = makeString("[Resume Topic]");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt135$cb_uiat_handle_resume_topic = makeString("cb-uiat-handle-resume-topic");

    private static final SubLSymbol CB_LINK_UIAT_RESUME_TOPIC = makeSymbol("CB-LINK-UIAT-RESUME-TOPIC");

    static private final SubLString $str_alt137$_No_thank_you__let_s_talk_about_s = makeString("[No thank you, let's talk about something else]");

    static private final SubLString $str_alt138$cb_uiat_handle_dont_resume_old_to = makeString("cb-uiat-handle-dont-resume-old-topic");

    private static final SubLSymbol CB_LINK_DONT_RESUME_OLD_TOPIC = makeSymbol("CB-LINK-DONT-RESUME-OLD-TOPIC");

    static private final SubLString $str_alt140$_Resume_Interrupted_Topic_ = makeString("[Resume Interrupted Topic]");

    static private final SubLString $str_alt141$cb_uiat_handle_pick_old_topic = makeString("cb-uiat-handle-pick-old-topic");

    private static final SubLSymbol CB_LINK_UIAT_PICK_OLD_TOPIC = makeSymbol("CB-LINK-UIAT-PICK-OLD-TOPIC");

    static private final SubLString $str_alt143$_Select_ = makeString("[Select]");

    static private final SubLString $str_alt144$cb_uiat_handle_pick_topic = makeString("cb-uiat-handle-pick-topic");

    private static final SubLSymbol CB_LINK_UIAT_PICK_TOPIC = makeSymbol("CB-LINK-UIAT-PICK-TOPIC");

    static private final SubLList $list_alt146 = list(makeSymbol("INTERACTION"), makeSymbol("AGENDA-ID"));

    private static final SubLSymbol $RESUME_TOPIC = makeKeyword("RESUME-TOPIC");

    private static final SubLSymbol CB_UIAT_HANDLE_RESUME_TOPIC = makeSymbol("CB-UIAT-HANDLE-RESUME-TOPIC");

    static private final SubLList $list_alt149 = list(makeSymbol("INTERACTION"));

    private static final SubLSymbol $IGNORE_OLD_TOPIC = makeKeyword("IGNORE-OLD-TOPIC");

    private static final SubLSymbol CB_UIAT_HANDLE_DONT_RESUME_OLD_TOPIC = makeSymbol("CB-UIAT-HANDLE-DONT-RESUME-OLD-TOPIC");

    static private final SubLList $list_alt152 = list(makeSymbol("INTERACTION"), makeSymbol("GLOBID"));

    private static final SubLSymbol CB_UIAT_HANDLE_PICK_TOPIC = makeSymbol("CB-UIAT-HANDLE-PICK-TOPIC");

    static private final SubLList $list_alt154 = list(makeSymbol("INTERACTION"), makeSymbol("INTERACTION-MT"));

    private static final SubLSymbol $RESUME_OLD_TOPIC = makeKeyword("RESUME-OLD-TOPIC");



    private static final SubLSymbol CB_UIAT_HANDLE_PICK_OLD_TOPIC = makeSymbol("CB-UIAT-HANDLE-PICK-OLD-TOPIC");

    private static final SubLSymbol $STAY_ON_TOPIC = makeKeyword("STAY-ON-TOPIC");

    private static final SubLSymbol $LOAD_REQUEST = makeKeyword("LOAD-REQUEST");

    private static final SubLSymbol CB_UIAT_HANDLE_TOPIC_SPECIFIER = makeSymbol("CB-UIAT-HANDLE-TOPIC-SPECIFIER");



    static private final SubLList $list_alt162 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-INITIALIZER-RENDER-REQUEST"), makeKeyword("HINT-NAME"), makeString("Initialize Kraken for user and domain"));

    static private final SubLList $list_alt163 = list(makeSymbol("&KEY"), makeSymbol("MESSAGE"));

    static private final SubLList $list_alt164 = list(makeKeyword("MESSAGE"));



    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_tools_setup_file();
    }

    public void initializeVariables() {
        init_cb_uia_tools_setup_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_tools_setup_file();
    }
}

