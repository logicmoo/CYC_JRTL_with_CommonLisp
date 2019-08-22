/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-PROBLEM-REPORTING
 *  source file: /cyc/top/cycl/uia-problem-reporting.lisp
 *  created:     2019/07/03 17:37:57
 */
public final class uia_problem_reporting extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_problem_reporting() {
    }

    public static final SubLFile me = new uia_problem_reporting();

    public static final String myName = "com.cyc.cycjava.cycl.uia_problem_reporting";

    // // Definitions
    /**
     * Turn on and off bug autoreporting.  Autoreporting is scattered throughout the codebase.
     */
    // defparameter
    public static final SubLSymbol $uia_problem_reporting_autoreport$ = makeSymbol("*UIA-PROBLEM-REPORTING-AUTOREPORT*");

    /**
     * Gate whether the sender is also sent the problem report.  Typically set to T when auto-reporting.
     */
    // defparameter
    public static final SubLSymbol $uia_problem_reporting_no_cc$ = makeSymbol("*UIA-PROBLEM-REPORTING-NO-CC*");

    /**
     * E-mail address where problem reports (not from SMEs) will be sent
     */
    // deflexical
    private static final SubLSymbol $uia_problem_address$ = makeSymbol("*UIA-PROBLEM-ADDRESS*");

    /**
     * E-mail address where problem reports from SMEs will be sent
     */
    // deflexical
    private static final SubLSymbol $uia_problem_address_for_smes$ = makeSymbol("*UIA-PROBLEM-ADDRESS-FOR-SMES*");

    // deflexical
    private static final SubLSymbol $uia_problem_reporting_email_subject_prefix$ = makeSymbol("*UIA-PROBLEM-REPORTING-EMAIL-SUBJECT-PREFIX*");

    // deflexical
    public static final SubLSymbol $uia_problem_reporting_form_max_width$ = makeSymbol("*UIA-PROBLEM-REPORTING-FORM-MAX-WIDTH*");

    public static final SubLObject uia_text_problem_email_form_entry(SubLObject name, SubLObject value) {
        return format(NIL, $str_alt4$_____A_____A__, name, value);
    }

    public static final SubLObject uia_problem_reporting_get_user(SubLObject v_agenda) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = NIL;
        }
        {
            SubLObject user = NIL;
            if (NIL == user) {
                if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                    if (NIL != forts.fort_p(uia_setup_state.uia_user(v_agenda))) {
                        user = uia_setup_state.uia_user(v_agenda);
                    }
                }
            }
            if (NIL == user) {
                if (NIL != user_interaction_agenda.user_interaction_agenda_p(cb_user_interaction_agenda.cb_current_uia())) {
                    if (NIL != forts.fort_p(uia_setup_state.uia_user(cb_user_interaction_agenda.cb_current_uia()))) {
                        user = uia_setup_state.uia_user(cb_user_interaction_agenda.cb_current_uia());
                    }
                }
            }
            if (NIL == user) {
                if (NIL != forts.fort_p(operation_communication.the_cyclist())) {
                    user = operation_communication.the_cyclist();
                }
            }
            return user;
        }
    }

    public static final SubLObject uia_problem_reporting_is_user_smeP(SubLObject user) {
        return isa.isa_in_any_mtP(user, $$RKFYear1SME);
    }

    public static final SubLObject uia_problem_reporting_email_to_address(SubLObject v_agenda) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = NIL;
        }
        return NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ? ((SubLObject) (NIL != forts.fort_p(uia_setup_state.uia_user(v_agenda)) ? ((SubLObject) (NIL != uia_problem_reporting_is_user_smeP(uia_setup_state.uia_user(v_agenda)) ? ((SubLObject) ($uia_problem_address_for_smes$.getGlobalValue())) : uia_tools_review_and_testing.uiat_kreview_get_supervisor_email_address(v_agenda))) : uia_tools_review_and_testing.uiat_kreview_get_supervisor_email_address(v_agenda))) : NIL != uia_problem_reporting_is_user_smeP(operation_communication.the_cyclist()) ? ((SubLObject) ($uia_problem_address_for_smes$.getGlobalValue())) : $uia_problem_address$.getGlobalValue();
    }

    public static final SubLObject uia_problem_reporting_email_from_address(SubLObject v_agenda) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = NIL;
        }
        return NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ? ((SubLObject) (uia_tools_review_and_testing.uiat_kreview_get_my_email_address(v_agenda))) : NIL != kb_mapping_utilities.fpred_value_in_any_mt(operation_communication.the_cyclist(), $$preferredEMailAddressText, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (kb_mapping_utilities.fpred_value_in_any_mt(operation_communication.the_cyclist(), $$preferredEMailAddressText, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : mail_utilities.user_email(UNPROVIDED);
    }

    public static final SubLObject uia_problem_reporting_email_autoreport_no_ccP(SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = NIL;
        }
        {
            SubLObject v_agenda = (NIL != user_interaction_agenda.user_interaction_p(interaction)) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : NIL;
            SubLObject user = uia_problem_reporting_get_user(v_agenda);
            SubLObject is_user_smeP = uia_problem_reporting_is_user_smeP(user);
            return is_user_smeP;
        }
    }

    /**
     *
     *
     * @return 0 BOOLEAN; Was the message sent?
     * @return 1 STRINGP or NIL; error message.
     */
    public static final SubLObject uia_problem_reporting_email_autoreport(SubLObject subject_unprefixed, SubLObject message_unsuffixed, SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentP = NIL;
                SubLObject error_message = NIL;
                if (NIL != $uia_problem_reporting_autoreport$.getDynamicValue(thread)) {
                    {
                        SubLObject v_agenda = (NIL != user_interaction_agenda.user_interaction_p(interaction)) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : NIL;
                        SubLObject subject = format(NIL, $str_alt7$_auto__user__A__A, uia_problem_reporting_get_user(v_agenda), subject_unprefixed);
                        {
                            SubLObject _prev_bind_0 = $uia_problem_reporting_no_cc$.currentBinding(thread);
                            try {
                                $uia_problem_reporting_no_cc$.bind(uia_problem_reporting_email_autoreport_no_ccP(interaction), thread);
                                thread.resetMultipleValues();
                                {
                                    SubLObject sentP_1 = uia_problem_reporting_email_form_mailer(subject, message_unsuffixed, interaction);
                                    SubLObject error_message_2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    sentP = sentP_1;
                                    error_message = error_message_2;
                                }
                            } finally {
                                $uia_problem_reporting_no_cc$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return values(sentP, error_message);
            }
        }
    }

    /**
     *
     *
     * @return 0 BOOLEAN; Was the message sent?
     * @return 1 STRINGP or NIL; error message.
     */
    public static final SubLObject uia_problem_reporting_email_form_mailer(SubLObject subject_unprefixed, SubLObject message_unsuffixed, SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = NIL;
        }
        {
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            uia_problem_reporting_email_form_mailer_int(subject_unprefixed, message_unsuffixed, interaction);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            return values(sublisp_null(error_message), error_message);
        }
    }

    public static final SubLObject uia_problem_reporting_email_form_mailer_int(SubLObject subject_unprefixed, SubLObject message_unsuffixed, SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = (NIL != user_interaction_agenda.user_interaction_p(interaction)) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : cb_user_interaction_agenda.cb_current_uia();
                SubLObject subject = cconcatenate($uia_problem_reporting_email_subject_prefix$.getGlobalValue(), subject_unprefixed);
                SubLObject host = uia_tools_review_and_testing.uiat_kreview_get_smtp_host(v_agenda);
                SubLObject message = cconcatenate(message_unsuffixed, uia_text_problem_email_data(interaction));
                SubLObject from = uia_problem_reporting_email_from_address(v_agenda);
                SubLObject to = (NIL != $uia_problem_reporting_no_cc$.getDynamicValue(thread)) ? ((SubLObject) (uia_problem_reporting_email_to_address(v_agenda))) : list(uia_problem_reporting_email_to_address(v_agenda), from);
                thread.resetMultipleValues();
                {
                    SubLObject sentP = mail_utilities.mail_message(from, to, message, subject, host, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject error_message = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                    } else
                        if (NIL != sentP) {
                            user_interaction_agenda.uia_act_new_comment(v_agenda, format(NIL, $str_alt9$Sent__A_the_following_problem_rep, to, subject_unprefixed));
                        } else
                            if (NIL != error_message) {
                                user_interaction_agenda.uia_act_new_comment(v_agenda, format(NIL, $str_alt10$Received_error__S_while_trying_to, new SubLObject[]{ error_message, to, subject_unprefixed }));
                            }


                }
            }
            return NIL;
        }
    }

    /**
     * Return a string containing the contents of the extra data for a UIA problem report email.
     */
    public static final SubLObject uia_text_problem_email_data(SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = NIL;
        }
        {
            SubLObject v_agenda = (NIL != user_interaction_agenda.user_interaction_p(interaction)) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : cb_user_interaction_agenda.cb_current_uia();
            SubLObject journal_info = get_uia_journal_text($int$1000, UNPROVIDED);
            SubLObject debug_info = (NIL != user_interaction_agenda.user_interaction_p(interaction)) ? ((SubLObject) (get_uia_debug_info(interaction))) : $str_alt12$____no_debug_info;
            SubLObject v_system_info = get_system_settings();
            SubLObject user_info = get_user_settings(v_agenda);
            SubLObject ke_review_info = (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) ? ((SubLObject) (uia_tools_review_and_testing.uiat_kreview_gather_up_message_from_agenda(v_agenda))) : $str_alt13$____No_ke_review_info_found;
            SubLObject component = uia_guess_bugzilla_component(interaction);
            SubLObject divider_string = Strings.make_string(subtract($uia_problem_reporting_form_max_width$.getGlobalValue(), ONE_INTEGER), CHAR_underbar);
            SubLObject newline = Strings.make_string(ONE_INTEGER, CHAR_newline);
            return cconcatenate(newline, new SubLObject[]{ newline, divider_string, newline, user_info, newline, divider_string, newline, v_system_info, newline, divider_string, newline, debug_info, newline, divider_string, newline, ke_review_info, newline, divider_string, newline, journal_info, newline, divider_string, newline, uia_text_problem_email_form_entry($$$product, $$$RKF), uia_text_problem_email_form_entry($$$component, component), uia_text_problem_email_form_entry($str_alt17$system_version, system_info.cyc_revision_string()), uia_text_problem_email_form_entry($str_alt18$kb_number, operation_communication.kb_version_string()), uia_text_problem_email_form_entry($str_alt19$op_sys, $$$Linux), uia_text_problem_email_form_entry($$$priority, $$$P3), uia_text_problem_email_form_entry($str_alt23$rep_platform, $$$PC), uia_text_problem_email_form_entry($$$severity, $$$normal) });
        }
    }

    /**
     *
     *
     * @return string : text representation of debugging info for INTERACTION
     */
    public static final SubLObject get_uia_debug_info(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction_id = string_utilities.to_string(user_interaction_agenda.ui_id(interaction));
                SubLObject answer_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            cb_uia_debugging.cb_uia_debug_interaction(list(interaction_id));
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    answer_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                answer_string = html_utilities.convert_html_to_text(answer_string);
                return answer_string;
            }
        }
    }

    /**
     * Maximum number of journal entries included in problem reports
     */
    // deflexical
    private static final SubLSymbol $max_reported_journal_entries$ = makeSymbol("*MAX-REPORTED-JOURNAL-ENTRIES*");

    /**
     *
     *
     * @return string : text representation of UIA journal (w/o HTML markup)
     * @unknown The entries are shown in reverse order (ie., latest first) and
    only the first @xref *max-reported-journal-entries* entries are used.
     */
    public static final SubLObject get_uia_journal_text(SubLObject max_entries, SubLObject reverseP) {
        if (max_entries == UNPROVIDED) {
            max_entries = $max_reported_journal_entries$.getGlobalValue();
        }
        if (reverseP == UNPROVIDED) {
            reverseP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != user_interaction_agenda.user_interaction_agenda_p(cb_user_interaction_agenda.cb_current_uia())) {
                {
                    SubLObject answer_string = NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                            try {
                                html_macros.$html_stream$.bind(stream, thread);
                                cb_uia_tools_review_and_testing.show_uia_knowledge_journal(max_entries, reverseP);
                            } finally {
                                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                        answer_string = get_output_stream_string(stream);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                close(stream, UNPROVIDED);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    answer_string = html_utilities.convert_html_to_text(answer_string);
                    return answer_string;
                }
            } else {
                return $str_alt27$____no_journal_info;
            }
        }
    }

    /**
     *
     *
     * @return string : text shown in the System settings section of System Area page
     */
    public static final SubLObject get_system_settings() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject answer_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            cb_system_tools.cb_show_system_settings();
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    answer_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                answer_string = html_utilities.convert_html_to_text(answer_string);
                return answer_string;
            }
        }
    }

    /**
     *
     *
     * @return string : text shown in the System settings section of System Area page
     */
    public static final SubLObject get_user_settings(SubLObject v_agenda) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = NIL;
        }
        return format(NIL, $str_alt28$____user____A, uia_problem_reporting_get_user(v_agenda));
    }

    /**
     *
     *
     * @return string ; name of Bugzilla component likely for a bug involving INTERACTION
     */
    public static final SubLObject uia_guess_bugzilla_component(SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = NIL;
        }
        {
            SubLObject operator_name = $str_alt29$;
            if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                {
                    SubLObject operator_keyword = user_interaction_agenda.ui_operator(interaction);
                    operator_name = uia_tool_declaration.ui_operator_name(operator_keyword);
                }
            }
            return operator_name;
        }
    }

    public static final SubLObject declare_uia_problem_reporting_file() {
        declareFunction("uia_text_problem_email_form_entry", "UIA-TEXT-PROBLEM-EMAIL-FORM-ENTRY", 2, 0, false);
        declareFunction("uia_problem_reporting_get_user", "UIA-PROBLEM-REPORTING-GET-USER", 0, 1, false);
        declareFunction("uia_problem_reporting_is_user_smeP", "UIA-PROBLEM-REPORTING-IS-USER-SME?", 1, 0, false);
        declareFunction("uia_problem_reporting_email_to_address", "UIA-PROBLEM-REPORTING-EMAIL-TO-ADDRESS", 0, 1, false);
        declareFunction("uia_problem_reporting_email_from_address", "UIA-PROBLEM-REPORTING-EMAIL-FROM-ADDRESS", 0, 1, false);
        declareFunction("uia_problem_reporting_email_autoreport_no_ccP", "UIA-PROBLEM-REPORTING-EMAIL-AUTOREPORT-NO-CC?", 0, 1, false);
        declareFunction("uia_problem_reporting_email_autoreport", "UIA-PROBLEM-REPORTING-EMAIL-AUTOREPORT", 2, 1, false);
        declareFunction("uia_problem_reporting_email_form_mailer", "UIA-PROBLEM-REPORTING-EMAIL-FORM-MAILER", 2, 1, false);
        declareFunction("uia_problem_reporting_email_form_mailer_int", "UIA-PROBLEM-REPORTING-EMAIL-FORM-MAILER-INT", 2, 1, false);
        declareFunction("uia_text_problem_email_data", "UIA-TEXT-PROBLEM-EMAIL-DATA", 0, 1, false);
        declareFunction("get_uia_debug_info", "GET-UIA-DEBUG-INFO", 1, 0, false);
        declareFunction("get_uia_journal_text", "GET-UIA-JOURNAL-TEXT", 0, 2, false);
        declareFunction("get_system_settings", "GET-SYSTEM-SETTINGS", 0, 0, false);
        declareFunction("get_user_settings", "GET-USER-SETTINGS", 0, 1, false);
        declareFunction("uia_guess_bugzilla_component", "UIA-GUESS-BUGZILLA-COMPONENT", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_uia_problem_reporting_file() {
        defparameter("*UIA-PROBLEM-REPORTING-AUTOREPORT*", T);
        defparameter("*UIA-PROBLEM-REPORTING-NO-CC*", NIL);
        deflexical("*UIA-PROBLEM-ADDRESS*", $str_alt0$rkfhelp_cyc_com);
        deflexical("*UIA-PROBLEM-ADDRESS-FOR-SMES*", $str_alt1$rkf_sme_bugs_cyc_com);
        deflexical("*UIA-PROBLEM-REPORTING-EMAIL-SUBJECT-PREFIX*", $str_alt2$_UIA_PROBLEM__);
        deflexical("*UIA-PROBLEM-REPORTING-FORM-MAX-WIDTH*", $int$75);
        deflexical("*MAX-REPORTED-JOURNAL-ENTRIES*", TWENTY_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_uia_problem_reporting_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$rkfhelp_cyc_com = makeString("rkfhelp@cyc.com");

    static private final SubLString $str_alt1$rkf_sme_bugs_cyc_com = makeString("rkf-sme-bugs@cyc.com");

    static private final SubLString $str_alt2$_UIA_PROBLEM__ = makeString("[UIA_PROBLEM] ");

    public static final SubLInteger $int$75 = makeInteger(75);

    static private final SubLString $str_alt4$_____A_____A__ = makeString("   @~A  = ~A~%");

    public static final SubLObject $$RKFYear1SME = constant_handles.reader_make_constant_shell(makeString("RKFYear1SME"));

    public static final SubLObject $$preferredEMailAddressText = constant_handles.reader_make_constant_shell(makeString("preferredEMailAddressText"));

    static private final SubLString $str_alt7$_auto__user__A__A = makeString("(auto) user=~A ~A");



    static private final SubLString $str_alt9$Sent__A_the_following_problem_rep = makeString("Sent ~A the following problem report:~%~S~%");

    static private final SubLString $str_alt10$Received_error__S_while_trying_to = makeString("Received error ~S while trying to send ~A the following problem report:~%~S~%");



    static private final SubLString $str_alt12$____no_debug_info = makeString("    no debug info");

    static private final SubLString $str_alt13$____No_ke_review_info_found = makeString("    No ke-review info found");

    static private final SubLString $$$product = makeString("product");

    static private final SubLString $$$RKF = makeString("RKF");

    static private final SubLString $$$component = makeString("component");

    static private final SubLString $str_alt17$system_version = makeString("system_version");

    static private final SubLString $str_alt18$kb_number = makeString("kb_number");

    static private final SubLString $str_alt19$op_sys = makeString("op_sys");

    static private final SubLString $$$Linux = makeString("Linux");

    static private final SubLString $$$priority = makeString("priority");

    static private final SubLString $$$P3 = makeString("P3");

    static private final SubLString $str_alt23$rep_platform = makeString("rep_platform");

    static private final SubLString $$$PC = makeString("PC");

    static private final SubLString $$$severity = makeString("severity");

    static private final SubLString $$$normal = makeString("normal");

    static private final SubLString $str_alt27$____no_journal_info = makeString("    no journal info");

    static private final SubLString $str_alt28$____user____A = makeString("    user = ~A");

    static private final SubLString $str_alt29$ = makeString("");

    // // Initializers
    public void declareFunctions() {
        declare_uia_problem_reporting_file();
    }

    public void initializeVariables() {
        init_uia_problem_reporting_file();
    }

    public void runTopLevelForms() {
        setup_uia_problem_reporting_file();
    }
}

