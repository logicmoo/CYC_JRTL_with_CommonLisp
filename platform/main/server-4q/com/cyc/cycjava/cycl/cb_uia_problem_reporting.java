/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-UIA-PROBLEM-REPORTING
 *  source file: /cyc/top/cycl/cb-uia-problem-reporting.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_uia_problem_reporting extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_problem_reporting() {
    }

    public static final SubLFile me = new cb_uia_problem_reporting();


    // // Definitions
    /**
     * Formats HTML link for reporting a problem with tool associated with INTERACTION-ID
     */
    public static final SubLObject cb_link_report_problem(SubLObject interaction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(interaction, USER_INTERACTION_P);
            if (NIL == linktext) {
                linktext = $str_alt1$_Report_Problem_;
            }
            {
                SubLObject id = user_interaction_agenda.ui_id(interaction);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($$$problem);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt3$cb_uia_launch_problem_window__A, id);
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
            return T;
        }
    }

    /**
     * Formats HTML link for reporting a generic problem with tool; no interaction id needed
     */
    public static final SubLObject cb_link_report_generic_problem(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt1$_Report_Problem_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($$$problem);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt6$cb_uia_launch_problem_window);
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
            return T;
        }
    }

    /**
     * Displays the entire problem reporting page, including an optional section for Bugzilla reporting (for in-house use).
     * Information about INTERACTION will be used in formatting the report.
     *
     * @unknown This is currently invoked via @xref cb-uia-launch-problem-window.
     */
    public static final SubLObject uia_show_problem_reporting_page(SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Problem_Reporting;
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
                            SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_utilities.html_markup($str_alt12$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt13$To_report_a_problem_with_the_RKF_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline(TWO_INTEGER);
                                        {
                                            SubLObject v_agenda = (NIL != user_interaction_agenda.user_interaction_p(interaction)) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : NIL;
                                            SubLObject cyclist = NIL;
                                            if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                                                cyclist = user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED);
                                            }
                                            if (NIL == cyclist) {
                                                cyclist = operation_communication.the_cyclist();
                                            }
                                            if (NIL != kb_accessors.current_cycorp_employee_p(cyclist)) {
                                                uia_format_bugzilla_link_for_context(interaction);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                html_utilities.html_princ($$$or);
                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                html_utilities.html_newline(TWO_INTEGER);
                                            }
                                        }
                                        uia_html_problem_reporting_email_form(interaction);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
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

    public static final SubLObject cb_uia_html_problem_reporting_email_form_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arghash = html_arghash.arglist_to_arghash(args);
                SubLObject interaction = cb_user_interaction_agenda.cb_uia_obtain_interaction_from_watermark(args);
                SubLObject v_agenda = (NIL != user_interaction_agenda.user_interaction_p(interaction)) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : cb_user_interaction_agenda.cb_current_uia();
                SubLObject subject_unprefixed = html_arghash.get_arghash_value($SUBJECT, arghash);
                SubLObject body = html_arghash.get_arghash_value($BODY, arghash);
                SubLObject title_var = $$$Problem_Reporting;
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
                            SubLObject _prev_bind_0_3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_utilities.html_markup($str_alt12$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject sentP = uia_problem_reporting.uia_problem_reporting_email_form_mailer(subject_unprefixed, body, interaction);
                                            SubLObject error_message = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != sentP) {
                                                html_utilities.html_princ_strong($str_alt18$Your_problem_report_has_been_sent);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_princ($str_alt19$For_your_records_the_message_was_);
                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt20$To__);
                                                html_utilities.html_princ(uia_problem_reporting.uia_problem_reporting_email_to_address(v_agenda));
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_princ($str_alt21$From__);
                                                html_utilities.html_princ(uia_problem_reporting.uia_problem_reporting_email_from_address(v_agenda));
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_princ($str_alt22$Subject__);
                                                html_utilities.html_princ(subject_unprefixed);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_princ(body);
                                                html_macros.verify_not_within_html_pre();
                                                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                {
                                                    SubLObject _prev_bind_0_5 = html_macros.$within_html_pre$.currentBinding(thread);
                                                    try {
                                                        html_macros.$within_html_pre$.bind(T, thread);
                                                        html_utilities.html_princ(uia_problem_reporting.uia_text_problem_email_data(UNPROVIDED));
                                                    } finally {
                                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                            } else {
                                                html_utilities.html_princ_strong($str_alt23$Error__Your_problem_report_could_);
                                                if (error_message.isString()) {
                                                    html_utilities.html_newline(TWO_INTEGER);
                                                    html_utilities.html_princ($str_alt24$Error_message__);
                                                    html_utilities.html_prin1(error_message);
                                                }
                                            }
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_3, thread);
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

    public static final SubLObject uia_html_problem_reporting_email_form(SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($$$cg);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_macros.$within_html_form$.bind(T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_utilities.html_hidden_input($str_alt27$cb_uia_html_problem_reporting_ema, T, UNPROVIDED);
                    if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                        cb_user_interaction_agenda.cb_uia_add_interaction_watermark(interaction);
                    }
                    html_utilities.html_princ($str_alt28$Fill_out_the_below_form_to_send_a);
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_princ($str_alt29$An_email_will_be_sent_to_);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ(uia_problem_reporting.uia_problem_reporting_email_to_address(NIL != user_interaction_agenda.user_interaction_p(interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : cb_user_interaction_agenda.cb_current_uia()));
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    html_utilities.html_princ($str_alt30$_from_);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ(uia_problem_reporting.uia_problem_reporting_email_from_address(NIL != user_interaction_agenda.user_interaction_p(interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : cb_user_interaction_agenda.cb_current_uia()));
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    html_utilities.html_princ($str_alt31$_);
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt32$What_is_a_short_description_of_th);
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_text_input($str_alt33$_subject, $str_alt34$, uia_problem_reporting.$uia_problem_reporting_form_max_width$.getGlobalValue());
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_princ($str_alt35$What_were_details_of_the_problem_);
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt36$_body);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != uia_problem_reporting.$uia_problem_reporting_form_max_width$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(uia_problem_reporting.$uia_problem_reporting_form_max_width$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$23);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_submit_input($$$Send_Problem_Report_Email, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                    html_utilities.html_princ($str_alt39$For_your_reference__this_text_wil);
                    html_macros.verify_not_within_html_pre();
                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                    {
                        SubLObject _prev_bind_0_7 = html_macros.$within_html_pre$.currentBinding(thread);
                        try {
                            html_macros.$within_html_pre$.bind(T, thread);
                            html_utilities.html_princ(uia_problem_reporting.uia_text_problem_email_data(interaction));
                        } finally {
                            html_macros.$within_html_pre$.rebind(_prev_bind_0_7, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                } finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     * Formats an HTML link to Buzilla that will invoke the bug reporting page with the description partially filled-in with the system information and UIA journal
     */
    public static final SubLObject uia_format_bugzilla_link_for_context(SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max_journal_len = round(multiply($float$0_9, bugzilla.get_max_bugzilla_url_length()), UNPROVIDED);
                SubLObject journal_info = string_utilities.string_first_n(max_journal_len, NIL != user_interaction_agenda.user_interaction_agenda_p(cb_user_interaction_agenda.cb_current_uia()) ? ((SubLObject) (uia_problem_reporting.get_uia_journal_text(UNPROVIDED, UNPROVIDED))) : $$$no_journal);
                SubLObject debug_info = (NIL != user_interaction_agenda.user_interaction_p(interaction)) ? ((SubLObject) (uia_problem_reporting.get_uia_debug_info(interaction))) : $$$no_debug_info;
                SubLObject v_system_info = uia_problem_reporting.get_system_settings();
                SubLObject kb_version_string = operation_communication.kb_version_string();
                SubLObject system_version_string = system_info.cyc_revision_string();
                SubLObject image_type = bugzilla.determine_bugzilla_image_type();
                SubLObject machine_name = Environment.get_machine_name($$$unknown);
                SubLObject summary = web_utilities.html_url_encode($str_alt44$TODO__summarize_problem, UNPROVIDED);
                SubLObject comment = web_utilities.html_url_encode(format(NIL, $str_alt45$TODO__describe_problem___________, new SubLObject[]{ debug_info, journal_info, v_system_info }), UNPROVIDED);
                SubLObject component = web_utilities.html_url_encode(uia_problem_reporting.uia_guess_bugzilla_component(interaction), UNPROVIDED);
                SubLObject bugzilla_url = format(NIL, $str_alt46$http___bugzilla_cyc_com_enter_bug, new SubLObject[]{ component, machine_name, image_type, system_version_string, kb_version_string, summary, comment });
                html_utilities.html_princ($str_alt47$Press_here_to_);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(bugzilla_url);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($$$Invoke_Bugzilla);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_princ($str_alt49$_with_information_gathered_from_t);
                html_utilities.html_newline(UNPROVIDED);
            }
            return T;
        }
    }

    public static final SubLObject declare_cb_uia_problem_reporting_file() {
        declareFunction("cb_link_report_problem", "CB-LINK-REPORT-PROBLEM", 1, 1, false);
        declareFunction("cb_link_report_generic_problem", "CB-LINK-REPORT-GENERIC-PROBLEM", 0, 1, false);
        declareFunction("uia_show_problem_reporting_page", "UIA-SHOW-PROBLEM-REPORTING-PAGE", 0, 1, false);
        declareFunction("cb_uia_html_problem_reporting_email_form_handler", "CB-UIA-HTML-PROBLEM-REPORTING-EMAIL-FORM-HANDLER", 1, 0, false);
        declareFunction("uia_html_problem_reporting_email_form", "UIA-HTML-PROBLEM-REPORTING-EMAIL-FORM", 0, 1, false);
        declareFunction("uia_format_bugzilla_link_for_context", "UIA-FORMAT-BUGZILLA-LINK-FOR-CONTEXT", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_problem_reporting_file() {
        return NIL;
    }

    public static final SubLObject setup_cb_uia_problem_reporting_file() {
                cb_utilities.setup_cb_link_method($REPORT_PROBLEM, CB_LINK_REPORT_PROBLEM, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($REPORT_GENERIC_PROBLEM, CB_LINK_REPORT_GENERIC_PROBLEM, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_HTML_PROBLEM_REPORTING_EMAIL_FORM_HANDLER);
        return NIL;
    }



    static private final SubLString $str_alt1$_Report_Problem_ = makeString("[Report Problem]");

    static private final SubLString $$$problem = makeString("problem");

    static private final SubLString $str_alt3$cb_uia_launch_problem_window__A = makeString("cb-uia-launch-problem-window&~A");

    private static final SubLSymbol $REPORT_PROBLEM = makeKeyword("REPORT-PROBLEM");

    private static final SubLSymbol CB_LINK_REPORT_PROBLEM = makeSymbol("CB-LINK-REPORT-PROBLEM");

    static private final SubLString $str_alt6$cb_uia_launch_problem_window = makeString("cb-uia-launch-problem-window");

    private static final SubLSymbol $REPORT_GENERIC_PROBLEM = makeKeyword("REPORT-GENERIC-PROBLEM");

    private static final SubLSymbol CB_LINK_REPORT_GENERIC_PROBLEM = makeSymbol("CB-LINK-REPORT-GENERIC-PROBLEM");

    static private final SubLString $$$Problem_Reporting = makeString("Problem Reporting");



    static private final SubLString $str_alt11$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt12$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt13$To_report_a_problem_with_the_RKF_ = makeString("To report a problem with the RKF Tools:");



    static private final SubLString $$$or = makeString("or");





    static private final SubLString $str_alt18$Your_problem_report_has_been_sent = makeString("Your problem report has been sent.");

    static private final SubLString $str_alt19$For_your_records_the_message_was_ = makeString("For your records the message was : ");

    static private final SubLString $str_alt20$To__ = makeString("To: ");

    static private final SubLString $str_alt21$From__ = makeString("From: ");

    static private final SubLString $str_alt22$Subject__ = makeString("Subject: ");

    static private final SubLString $str_alt23$Error__Your_problem_report_could_ = makeString("Error: Your problem report could not be sent.");

    static private final SubLString $str_alt24$Error_message__ = makeString("Error message: ");

    private static final SubLSymbol CB_UIA_HTML_PROBLEM_REPORTING_EMAIL_FORM_HANDLER = makeSymbol("CB-UIA-HTML-PROBLEM-REPORTING-EMAIL-FORM-HANDLER");

    static private final SubLString $$$cg = makeString("cg");

    static private final SubLString $str_alt27$cb_uia_html_problem_reporting_ema = makeString("cb-uia-html-problem-reporting-email-form-handler");

    static private final SubLString $str_alt28$Fill_out_the_below_form_to_send_a = makeString("Fill out the below form to send a problem report email.");

    static private final SubLString $str_alt29$An_email_will_be_sent_to_ = makeString("An email will be sent to ");

    static private final SubLString $str_alt30$_from_ = makeString(" from ");

    static private final SubLString $str_alt31$_ = makeString(".");

    static private final SubLString $str_alt32$What_is_a_short_description_of_th = makeString("What is a short description of the problem:");

    static private final SubLString $str_alt33$_subject = makeString(":subject");

    static private final SubLString $str_alt34$ = makeString("");

    static private final SubLString $str_alt35$What_were_details_of_the_problem_ = makeString("What were details of the problem.  Please include any and all relevant details about the problem so that it can be reliably reproduced.");

    static private final SubLString $str_alt36$_body = makeString(":body");

    static private final SubLString $$$23 = makeString("23");

    static private final SubLString $$$Send_Problem_Report_Email = makeString("Send Problem Report Email");

    static private final SubLString $str_alt39$For_your_reference__this_text_wil = makeString("For your reference, this text will also be included in your problem report : ");

    public static final SubLFloat $float$0_9 = makeDouble(0.9);

    static private final SubLString $$$no_journal = makeString("no journal");

    static private final SubLString $$$no_debug_info = makeString("no debug info");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $str_alt44$TODO__summarize_problem = makeString("TODO: summarize problem");

    static private final SubLString $str_alt45$TODO__describe_problem___________ = makeString("TODO: describe problem~%~%-----~%~A~%-----~%~A~%-----~%~A~%");

    static private final SubLString $str_alt46$http___bugzilla_cyc_com_enter_bug = makeString("http://bugzilla.cyc.com/enter_bug.cgi?product=RKF&component=~a&machine_name=~a&image_type=~a&system_version=~a&kb_number=~a&short_desc=~a&comment=~a");

    static private final SubLString $str_alt47$Press_here_to_ = makeString("Press here to ");

    static private final SubLString $$$Invoke_Bugzilla = makeString("Invoke Bugzilla");

    static private final SubLString $str_alt49$_with_information_gathered_from_t = makeString(" with information gathered from the current context");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_problem_reporting_file();
    }

    public void initializeVariables() {
        init_cb_uia_problem_reporting_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_problem_reporting_file();
    }
}

