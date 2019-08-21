/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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
 *  module:      CB-QUERY-SENTENCE-LEXIFIER
 *  source file: /cyc/top/cycl/cb-query-sentence-lexifier.lisp
 *  created:     2019/07/03 17:38:22
 */
public final class cb_query_sentence_lexifier extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_query_sentence_lexifier() {
    }

    public static final SubLFile me = new cb_query_sentence_lexifier();




    // deflexical
    private static final SubLSymbol $current_ebmt_maintainer$ = makeSymbol("*CURRENT-EBMT-MAINTAINER*");

    // defconstant
    private static final SubLSymbol $cb_qsl_invoke_lex_wiz_button_script$ = makeSymbol("*CB-QSL-INVOKE-LEX-WIZ-BUTTON-SCRIPT*");

    // defconstant
    private static final SubLSymbol $cb_qsl_invoke_lex_wiz_script$ = makeSymbol("*CB-QSL-INVOKE-LEX-WIZ-SCRIPT*");

    public static final SubLObject cb_qsl_invoke_lex_wiz_script() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $cb_qsl_invoke_lex_wiz_script$.getGlobalValue(), system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_qsl_invoke_lex_wiz_button() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_input_button$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            if (true) {
                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_princ($$$Invoke_Lexification_Assistant);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_indent(ONE_INTEGER);
            format(html_macros.$html_stream$.getDynamicValue(thread), $cb_qsl_invoke_lex_wiz_button_script$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            return NIL;
        }
    }

    /**
     * An e-mail is sent to 'daves' with the CycL, Gloss and Mt. This is being
     * done in order to gather these examples for EBMT (Example-based Machine
     * Translation).
     */
    public static final SubLObject query_sentence_lexifier_notify_maintainer(SubLObject lexification_type, SubLObject query, SubLObject gloss) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject to = $current_ebmt_maintainer$.getGlobalValue();
                SubLObject from = mail_utilities.user_email(UNPROVIDED);
                SubLObject message = format(NIL, $str_alt6$CycL_Query___S__Gloss___S__Mt___S, new SubLObject[]{ query, gloss, $query_sentence_lexifier_mt$.getGlobalValue() });
                SubLObject subject = cconcatenate(lexification_type, $str_alt7$_Query_Sentence_Lexification);
                thread.resetMultipleValues();
                {
                    SubLObject message_sent = mail_utilities.mail_message(from, to, message, subject, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject error_message = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == message_sent) {
                        Errors.warn($str_alt8$Was_not_able_to_send_mail_to__A_a, to, subject, error_message);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Returns a string that would form the description for the bug being submitted
     * to Bugzilla.
     */
    public static final SubLObject cb_qsl_bugzilla_description(SubLObject query, SubLObject gloss, SubLObject gtqs, SubLObject pph, SubLObject gtqs_used) {
        {
            SubLObject desc = cconcatenate($str_alt9$I_am_trying_to_lexify_the_followi, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), format_nil.$format_nil_percent$.getGlobalValue() });
            if (NIL != query) {
                desc = cconcatenate(format_nil.format_nil_a_no_copy(desc), new SubLObject[]{ $str_alt10$Query__, format_nil.format_nil_a_no_copy(format_cycl_expression.format_cycl_expression_to_string(query, UNPROVIDED)), $str_alt11$_, format_nil.$format_nil_percent$.getGlobalValue() });
            }
            if (NIL != gloss) {
                desc = cconcatenate(format_nil.format_nil_a_no_copy(desc), new SubLObject[]{ $str_alt12$Gloss__, format_nil.format_nil_a_no_copy(gloss), $str_alt11$_, format_nil.$format_nil_percent$.getGlobalValue() });
            }
            if (NIL != gtqs) {
                desc = cconcatenate(format_nil.format_nil_a_no_copy(desc), new SubLObject[]{ $str_alt13$genTemplate_QuerySentence__, format_nil.format_nil_a_no_copy(format_cycl_expression.format_cycl_expression_to_string(gtqs, UNPROVIDED)), $str_alt11$_, format_nil.$format_nil_percent$.getGlobalValue() });
            }
            if (NIL != pph) {
                desc = cconcatenate(format_nil.format_nil_a_no_copy(desc), new SubLObject[]{ $str_alt14$Paraphrase__, format_nil.format_nil_a_no_copy(pph), $str_alt11$_, format_nil.$format_nil_percent$.getGlobalValue(), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt15$The_genTemplate_QuerySentence_was, format_nil.format_nil_a_no_copy(gtqs_used), $str_alt16$_used_in_generating_the_paraphras });
            }
            return desc;
        }
    }

    /**
     * Creates a link to Bugzilla and passes some basic information from the QSL
     * page to fill the fields on the Bugzilla bug submission page
     */
    public static final SubLObject cb_qsl_bugzilla_link(SubLObject query, SubLObject gloss, SubLObject gtqs, SubLObject pph, SubLObject gtqs_used) {
        {
            SubLObject product = $$$NL;
            SubLObject summary = $str_alt18$Request_for_help_to_lexify_a_quer;
            SubLObject comment = cb_qsl_bugzilla_description(query, gloss, gtqs, pph, gtqs_used);
            return bugzilla.cb_bugzilla_link(product, NIL, summary, comment, UNPROVIDED);
        }
    }

    public static final SubLObject cb_qsl_show_bugzilla_link(SubLObject query, SubLObject gloss, SubLObject gtqs, SubLObject phrase, SubLObject negation) {
        html_utilities.html_newline(TWO_INTEGER);
        html_utilities.html_princ($str_alt19$For_expert_help__);
        cb_qsl_bugzilla_link(query, gloss, gtqs, phrase, negation);
        return NIL;
    }

    /**
     * Create a link to the HTML page/form that will be the interface for the
     * Query Sentence Lexifier.
     */
    public static final SubLObject cb_link_query_sentence_lexifier(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Query_Sentence_Lexifier;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt25$cb_query_sentence_lexifier);
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

    /**
     * Create the HTML page/form that will be the interface for the Query Sentence
     * Lexifier.
     */
    public static final SubLObject cb_query_sentence_lexifier(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Query_Sentence_Lexifier);
            return NIL;
        }
        create_query_sentence_lexifier_page(NIL, $str_alt28$, NIL, $INITIAL);
        return NIL;
    }

    /**
     * Process all the info extracted from the input args of the Query Sentence
     * Lexifier page to generate what is to be displayed.  Create HTML page/form.
     */
    public static final SubLObject create_query_sentence_lexifier_page(SubLObject query, SubLObject gloss, SubLObject formula, SubLObject mode) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gtqs = NIL;
                SubLObject parse_template = NIL;
                SubLObject gtqs_error = NIL;
                SubLObject assert_err_message = NIL;
                SubLObject phrase = NIL;
                SubLObject gtqs_usedP = NIL;
                if (mode != $INITIAL) {
                    if (mode == $INPUTS_CHANGED) {
                        thread.resetMultipleValues();
                        {
                            SubLObject gtqs_1 = query_sentence_lexifier.construct_gtqs_sentence_and_parse_template_for_query_sentence_from_gloss(query, gloss, UNPROVIDED);
                            SubLObject parse_template_2 = thread.secondMultipleValue();
                            SubLObject gtqs_error_3 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            gtqs = gtqs_1;
                            parse_template = parse_template_2;
                            gtqs_error = gtqs_error_3;
                        }
                    } else {
                        if (NIL == pph_templates.gen_template_recipe_p(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            assert_err_message = cconcatenate(format_nil.format_nil_s_no_copy(formula), new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $str_alt32$_is_not_a_well_formed_genTemplate });
                        }
                        gtqs = formula;
                    }
                    if (NIL == assert_err_message) {
                        {
                            SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding(thread);
                            try {
                                fi.$fi_error$.bind(NIL, thread);
                                {
                                    SubLObject assert_successP = NIL;
                                    assert_successP = makeBoolean((NIL != el_utilities.el_formula_p(gtqs)) && (NIL != fi.fi_assert_int(gtqs, $query_sentence_lexifier_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
                                    if (NIL == assert_successP) {
                                        assert_err_message = format(NIL, $str_alt33$Error___S, fi.fi_error_string(fi.$fi_error$.getDynamicValue(thread)));
                                    }
                                }
                            } finally {
                                fi.$fi_error$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    {
                        SubLObject pred = NIL;
                        SubLObject justification = NIL;
                        SubLObject assertion_used = NIL;
                        thread.resetMultipleValues();
                        {
                            SubLObject phrase_4 = gke_main.simulate_gke_query_paraphrase(query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject justification_5 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            phrase = phrase_4;
                            justification = justification_5;
                        }
                        {
                            SubLObject cdolist_list_var = justification;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                if (NIL != assertion_handles.assertion_p(item)) {
                                    assertion_used = uncanonicalizer.assertion_el_formula(item);
                                    gtqs_usedP = equal(assertion_used, gtqs);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject title_var = $$$Query_Sentence_Lexifier;
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
                            html_complete.html_complete_script();
                            html_complete.html_autocomplete_css();
                            html_complete.html_autocomplete_scripts();
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_6 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        html_utilities.html_markup($str_alt36$yui_skin_sam);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            cb_qsl_invoke_lex_wiz_script();
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
                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt37$cb_handle_query_sentence_lexifier, T, UNPROVIDED);
                                                        html_utilities.html_hidden_input($str_alt38$_old_query, prin1_to_string(query), UNPROVIDED);
                                                        html_utilities.html_hidden_input($str_alt39$_old_gloss, gloss, UNPROVIDED);
                                                        html_utilities.html_hidden_input($str_alt40$_old_formula, prin1_to_string(gtqs), UNPROVIDED);
                                                        dhtml_macros.dhtml_with_dom_script();
                                                        dhtml_macros.dhtml_with_toggle_visibility_support();
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt41$English_Query__Gloss___);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($str_alt42$_gloss);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($int$80);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(ONE_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($$$virtual);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ(gloss);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_script_utilities.html_clear_input_button($str_alt42$_gloss, $$$Clear_Gloss, UNPROVIDED_SYM);
                                                        html_utilities.html_newline(TWO_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        dhtml_macros.dhtml_switch_visibility_links_arrows($str_alt46$cycl_query, $str_alt47$CycL_Query_Sentence__);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        {
                                                            SubLObject initial_visibility = (NIL == query) ? ((SubLObject) ($VISIBLE)) : $INVISIBLE;
                                                            dhtml_macros.dhtml_set_switched_visibility($str_alt46$cycl_query, initial_visibility, $PARAGRAPH);
                                                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($str_alt46$cycl_query);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_form_widgets.cb_el_sentence_input_section(query, $list_alt51);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        if (mode != $INITIAL) {
                                                            if ((NIL != gtqs_error) && (NIL == gtqs)) {
                                                                {
                                                                    SubLObject color_val = $RED;
                                                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                    if (NIL != color_val) {
                                                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_color(color_val));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($str_alt53$A_genTemplate_QuerySentence_formu);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                }
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_princ(gtqs_error);
                                                                html_utilities.html_newline(ONE_INTEGER);
                                                            } else
                                                                if ((NIL != gtqs_error) && (NIL != gtqs)) {
                                                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                    dhtml_macros.dhtml_switch_visibility_links_arrows($$$genTemplate, $str_alt55$genTemplate_QuerySentence_);
                                                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                    dhtml_macros.dhtml_set_switched_visibility($$$genTemplate, $INVISIBLE, $PARAGRAPH);
                                                                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup($$$genTemplate);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            cb_form_widgets.cb_el_sentence_input_section(gtqs, $list_alt56);
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                            {
                                                                                SubLObject color_val = $RED;
                                                                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                                if (NIL != color_val) {
                                                                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_utilities.html_color(color_val));
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_princ($str_alt57$The_above_genTemplate_QuerySenten);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                            }
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                            html_utilities.html_princ(gtqs_error);
                                                                            html_utilities.html_newline(ONE_INTEGER);
                                                                            if (NIL != assert_err_message) {
                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                {
                                                                                    SubLObject color_val = $BLUE;
                                                                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                                    if (NIL != color_val) {
                                                                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(html_utilities.html_color(color_val));
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ($str_alt59$Note__);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                                }
                                                                                html_utilities.html_princ_formatted_string(assert_err_message);
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    html_utilities.html_newline(ONE_INTEGER);
                                                                } else
                                                                    if (NIL != gtqs) {
                                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                        dhtml_macros.dhtml_switch_visibility_links_arrows($$$genTemplate, $str_alt55$genTemplate_QuerySentence_);
                                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                        dhtml_macros.dhtml_set_switched_visibility($$$genTemplate, $INVISIBLE, $PARAGRAPH);
                                                                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup($$$genTemplate);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_form_widgets.cb_el_sentence_input_section(gtqs, $list_alt56);
                                                                                if (NIL != assert_err_message) {
                                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                                    {
                                                                                        SubLObject color_val = $BLUE;
                                                                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                                        if (NIL != color_val) {
                                                                                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_markup(html_utilities.html_color(color_val));
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ($str_alt59$Note__);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                                    }
                                                                                    html_utilities.html_princ_formatted_string(assert_err_message);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                        html_utilities.html_newline(ONE_INTEGER);
                                                                    } else {
                                                                        {
                                                                            SubLObject color_val = $RED;
                                                                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                            if (NIL != color_val) {
                                                                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt60$A_genTemplate_QuerySentence_formu);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                        }
                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                    }


                                                            if (NIL != phrase) {
                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_utilities.html_princ($str_alt14$Paraphrase__);
                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_markup(phrase);
                                                                html_utilities.html_newline(ONE_INTEGER);
                                                                {
                                                                    SubLObject color_val = $BLUE;
                                                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                    if (NIL != color_val) {
                                                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_color(color_val));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($str_alt59$Note__);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt61$The_above_genTemplate_QuerySenten, NIL != gtqs_usedP ? ((SubLObject) (string_utilities.$empty_string$.getGlobalValue())) : $str_alt62$_not);
                                                                    html_utilities.html_newline(TWO_INTEGER);
                                                                }
                                                            } else {
                                                                html_utilities.html_hidden_input($str_alt63$_no_phrase, T, UNPROVIDED);
                                                                {
                                                                    SubLObject color_val = $RED;
                                                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                    if (NIL != color_val) {
                                                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_color(color_val));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($str_alt64$A_paraphrase_could_not_be_generat);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                }
                                                                html_utilities.html_newline(TWO_INTEGER);
                                                            }
                                                        }
                                                        html_utilities.html_submit_input($$$Compute, $str_alt66$_submit, UNPROVIDED);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                        html_utilities.html_submit_input($$$Assert, $str_alt68$_assert, UNPROVIDED);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                        html_utilities.html_submit_input($$$Reset, $str_alt70$_reset, UNPROVIDED);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                        html_utilities.html_submit_input($$$Quit, $str_alt72$_quit, UNPROVIDED);
                                                        html_utilities.html_indent(FOUR_INTEGER);
                                                        cb_qsl_invoke_lex_wiz_button();
                                                        cb_qsl_show_bugzilla_link(query, gloss, gtqs, phrase, NIL != gtqs_usedP ? ((SubLObject) (string_utilities.$empty_string$.getGlobalValue())) : $str_alt62$_not);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        if (NIL != parse_template) {
                                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                            dhtml_macros.dhtml_switch_visibility_links_arrows($$$parseTemplate, $$$Parsing_Template);
                                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            dhtml_macros.dhtml_set_switched_visibility($$$parseTemplate, $INVISIBLE, $PARAGRAPH);
                                                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($$$parseTemplate);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_sentence_browser.cb_show_sentence_readably(parse_template, $query_sentence_lexifier_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                    html_utilities.html_princ($str_alt75$Note__Parsing_Templates_are_shown);
                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_6, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Process the values input to the HTML form (i.e. the interface) for the Query
     * Sentence Lexifier.
     *
     * @unknown shah
     * @unknown 2004-08-24
     * @unknown shah 2004-08-31
     */
    public static final SubLObject cb_handle_query_sentence_lexifier(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject submitP = html_utilities.html_extract_boolean($str_alt66$_submit, args, UNPROVIDED);
                SubLObject assertP = html_utilities.html_extract_boolean($str_alt68$_assert, args, UNPROVIDED);
                SubLObject resetP = html_utilities.html_extract_boolean($str_alt70$_reset, args, UNPROVIDED);
                SubLObject quitP = html_utilities.html_extract_boolean($str_alt72$_quit, args, UNPROVIDED);
                if ((NIL != submitP) || (NIL != assertP)) {
                    {
                        SubLObject old_query_string = html_utilities.html_extract_input($str_alt38$_old_query, args);
                        SubLObject old_query = (old_query_string.isString() && (NIL == string_utilities.empty_string_p(old_query_string))) ? ((SubLObject) (read_from_string(old_query_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                        SubLObject old_gloss = html_utilities.html_extract_string($str_alt39$_old_gloss, args, UNPROVIDED);
                        SubLObject old_gtqs_string = html_utilities.html_extract_input($str_alt40$_old_formula, args);
                        SubLObject old_gtqs = (old_gtqs_string.isString() && (NIL == string_utilities.empty_string_p(old_gtqs_string))) ? ((SubLObject) (read_from_string(old_gtqs_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                        SubLObject gloss = html_utilities.html_extract_string($str_alt42$_gloss, args, UNPROVIDED);
                        SubLObject no_phraseP = html_utilities.html_extract_boolean($str_alt63$_no_phrase, args, UNPROVIDED);
                        thread.resetMultipleValues();
                        {
                            SubLObject query = cb_form_widgets.cb_extract_el_sentence_input(args, $list_alt76);
                            SubLObject query_error = thread.secondMultipleValue();
                            SubLObject query_string = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != query_error) {
                                query = (query_string.isString() && (NIL == string_utilities.empty_string_p(query_string))) ? ((SubLObject) (read_from_string(query_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                            }
                            thread.resetMultipleValues();
                            {
                                SubLObject gtqs = cb_form_widgets.cb_extract_el_sentence_input(args, $list_alt77);
                                SubLObject gtqs_error = thread.secondMultipleValue();
                                SubLObject gtqs_string = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != gtqs_error) {
                                    gtqs = (gtqs_string.isString() && (NIL == string_utilities.empty_string_p(gtqs_string))) ? ((SubLObject) (read_from_string(gtqs_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                                }
                                if (!(old_query.equal(query) && old_gloss.equal(gloss))) {
                                    if (NIL != old_gtqs) {
                                        fi.fi_unassert_int(old_gtqs, $query_sentence_lexifier_mt$.getGlobalValue());
                                    }
                                    if (NIL != gtqs) {
                                        fi.fi_unassert_int(gtqs, $query_sentence_lexifier_mt$.getGlobalValue());
                                    }
                                    query_sentence_lexifier_notify_maintainer($$$Attempted, query, gloss);
                                    return create_query_sentence_lexifier_page(query, gloss, NIL, $INPUTS_CHANGED);
                                } else
                                    if (!old_gtqs.equal(gtqs)) {
                                        if (NIL != old_gtqs) {
                                            fi.fi_unassert_int(old_gtqs, $query_sentence_lexifier_mt$.getGlobalValue());
                                        }
                                        return create_query_sentence_lexifier_page(query, gloss, gtqs, $GTQS_EDITED);
                                    } else
                                        if (NIL == el_utilities.el_formula_p(gtqs)) {
                                            return create_query_sentence_lexifier_page(query, gloss, gtqs, $GTQS_INVALID);
                                        } else
                                            if (NIL != no_phraseP) {
                                                return create_query_sentence_lexifier_page(query, gloss, gtqs, $NO_PARAPHRASE);
                                            } else {
                                                if (NIL != assertP) {
                                                    fi.fi_unassert_int(gtqs, $query_sentence_lexifier_mt$.getGlobalValue());
                                                    ke.ke_assert(gtqs, $query_sentence_lexifier_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                                                    query_sentence_lexifier_notify_maintainer($$$Asserted, query, gloss);
                                                    return cb_query_sentence_lexifier(UNPROVIDED);
                                                } else {
                                                    if (NIL != old_gtqs) {
                                                        fi.fi_unassert_int(old_gtqs, $query_sentence_lexifier_mt$.getGlobalValue());
                                                    }
                                                    if (NIL != gtqs) {
                                                        fi.fi_unassert_int(gtqs, $query_sentence_lexifier_mt$.getGlobalValue());
                                                    }
                                                    return create_query_sentence_lexifier_page(query, gloss, NIL, $INPUTS_CHANGED);
                                                }
                                            }



                            }
                        }
                    }
                } else
                    if (NIL != resetP) {
                        return cb_query_sentence_lexifier(UNPROVIDED);
                    } else
                        if (NIL != quitP) {
                            {
                                SubLObject message = $str_alt83$Thank_you_for_using_the_Query_Sen;
                                cb_utilities.cb_message_page_with_history(message, T);
                            }
                        }


            }
            return NIL;
        }
    }

    public static final SubLObject declare_cb_query_sentence_lexifier_file() {
        declareFunction("cb_qsl_invoke_lex_wiz_script", "CB-QSL-INVOKE-LEX-WIZ-SCRIPT", 0, 0, false);
        declareFunction("cb_qsl_invoke_lex_wiz_button", "CB-QSL-INVOKE-LEX-WIZ-BUTTON", 0, 0, false);
        declareFunction("query_sentence_lexifier_notify_maintainer", "QUERY-SENTENCE-LEXIFIER-NOTIFY-MAINTAINER", 3, 0, false);
        declareFunction("cb_qsl_bugzilla_description", "CB-QSL-BUGZILLA-DESCRIPTION", 5, 0, false);
        declareFunction("cb_qsl_bugzilla_link", "CB-QSL-BUGZILLA-LINK", 5, 0, false);
        declareFunction("cb_qsl_show_bugzilla_link", "CB-QSL-SHOW-BUGZILLA-LINK", 5, 0, false);
        declareFunction("cb_link_query_sentence_lexifier", "CB-LINK-QUERY-SENTENCE-LEXIFIER", 0, 1, false);
        declareFunction("cb_query_sentence_lexifier", "CB-QUERY-SENTENCE-LEXIFIER", 0, 1, false);
        declareFunction("create_query_sentence_lexifier_page", "CREATE-QUERY-SENTENCE-LEXIFIER-PAGE", 4, 0, false);
        declareFunction("cb_handle_query_sentence_lexifier", "CB-HANDLE-QUERY-SENTENCE-LEXIFIER", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_query_sentence_lexifier_file() {
        deflexical("*QUERY-SENTENCE-LEXIFIER-MT*", NIL != boundp($query_sentence_lexifier_mt$) ? ((SubLObject) ($query_sentence_lexifier_mt$.getGlobalValue())) : $$EnglishParaphraseMt);
        deflexical("*CURRENT-EBMT-MAINTAINER*", $str_alt2$daves_cyc_com);
        defconstant("*CB-QSL-INVOKE-LEX-WIZ-BUTTON-SCRIPT*", $str_alt3$onClick__invoke_lex_wiz____);
        defconstant("*CB-QSL-INVOKE-LEX-WIZ-SCRIPT*", $str_alt4$__function_invoke_lex_wiz_______v);
        return NIL;
    }

    public static final SubLObject setup_cb_query_sentence_lexifier_file() {
                subl_macro_promotions.declare_defglobal($query_sentence_lexifier_mt$);
        cb_utilities.declare_cb_tool($QUERY_SENTENCE_LEXIFIER, $$$Query_Sentence_Lexifier, $$$QSL, $str_alt23$Lexify_Query_Sentences_using_genT);
        cb_utilities.setup_cb_link_method($QUERY_SENTENCE_LEXIFIER, CB_LINK_QUERY_SENTENCE_LEXIFIER, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_QUERY_SENTENCE_LEXIFIER);
        html_macros.note_html_handler_function(CB_HANDLE_QUERY_SENTENCE_LEXIFIER);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $query_sentence_lexifier_mt$ = makeSymbol("*QUERY-SENTENCE-LEXIFIER-MT*");

    public static final SubLObject $$EnglishParaphraseMt = constant_handles.reader_make_constant_shell(makeString("EnglishParaphraseMt"));

    static private final SubLString $str_alt2$daves_cyc_com = makeString("daves@cyc.com");

    static private final SubLString $str_alt3$onClick__invoke_lex_wiz____ = makeString("onClick=\"invoke_lex_wiz();\"");

    static private final SubLString $str_alt4$__function_invoke_lex_wiz_______v = makeString("\n\nfunction invoke_lex_wiz() {\n  var cgi_program = \'~A\';\n  var new_url = cgi_program + \'?invoke-lexification-wizard\';\n  var new_window = window.open(new_url, \'Lexification Assistant\', \n                          \'scrollbars=yes,resizable=yes,width=600,height=400\');\n\n  if (new_window) {\n     if (!new_window.opener) {\n        new_window.opener = self;\n     } else {\n        window.status = \'Cannot open a window for Lexification Wizard.\';\n     }\n  }\n  return new_window;\n}\n");

    static private final SubLString $$$Invoke_Lexification_Assistant = makeString("Invoke Lexification Assistant");

    static private final SubLString $str_alt6$CycL_Query___S__Gloss___S__Mt___S = makeString("CycL Query: ~S~%Gloss: ~S~%Mt: ~S");

    static private final SubLString $str_alt7$_Query_Sentence_Lexification = makeString(" Query Sentence Lexification");

    static private final SubLString $str_alt8$Was_not_able_to_send_mail_to__A_a = makeString("Was not able to send mail to ~A about ~A: error ~A prevented this.~%");

    static private final SubLString $str_alt9$I_am_trying_to_lexify_the_followi = makeString("I am trying to lexify the following: ");

    static private final SubLString $str_alt10$Query__ = makeString("Query: ");

    static private final SubLString $str_alt11$_ = makeString(" ");

    static private final SubLString $str_alt12$Gloss__ = makeString("Gloss: ");

    static private final SubLString $str_alt13$genTemplate_QuerySentence__ = makeString("genTemplate-QuerySentence: ");

    static private final SubLString $str_alt14$Paraphrase__ = makeString("Paraphrase: ");

    static private final SubLString $str_alt15$The_genTemplate_QuerySentence_was = makeString("The genTemplate-QuerySentence was");

    static private final SubLString $str_alt16$_used_in_generating_the_paraphras = makeString(" used in generating the paraphrase.");

    static private final SubLString $$$NL = makeString("NL");

    static private final SubLString $str_alt18$Request_for_help_to_lexify_a_quer = makeString("Request for help to lexify a query using QSL");

    static private final SubLString $str_alt19$For_expert_help__ = makeString("For expert help: ");

    private static final SubLSymbol $QUERY_SENTENCE_LEXIFIER = makeKeyword("QUERY-SENTENCE-LEXIFIER");

    static private final SubLString $$$Query_Sentence_Lexifier = makeString("Query Sentence Lexifier");

    static private final SubLString $$$QSL = makeString("QSL");

    static private final SubLString $str_alt23$Lexify_Query_Sentences_using_genT = makeString("Lexify Query Sentences using genTemplate-QuerySentence");



    static private final SubLString $str_alt25$cb_query_sentence_lexifier = makeString("cb-query-sentence-lexifier");

    private static final SubLSymbol CB_LINK_QUERY_SENTENCE_LEXIFIER = makeSymbol("CB-LINK-QUERY-SENTENCE-LEXIFIER");

    static private final SubLString $$$the_Query_Sentence_Lexifier = makeString("the Query Sentence Lexifier");

    static private final SubLString $str_alt28$ = makeString("");



    private static final SubLSymbol CB_QUERY_SENTENCE_LEXIFIER = makeSymbol("CB-QUERY-SENTENCE-LEXIFIER");

    private static final SubLSymbol $INPUTS_CHANGED = makeKeyword("INPUTS-CHANGED");

    static private final SubLString $str_alt32$_is_not_a_well_formed_genTemplate = makeString(" is not a well-formed genTemplate recipe.");

    static private final SubLString $str_alt33$Error___S = makeString("Error: ~S");



    static private final SubLString $str_alt35$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt36$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt37$cb_handle_query_sentence_lexifier = makeString("cb-handle-query-sentence-lexifier");

    static private final SubLString $str_alt38$_old_query = makeString(":old-query");

    static private final SubLString $str_alt39$_old_gloss = makeString(":old-gloss");

    static private final SubLString $str_alt40$_old_formula = makeString(":old-formula");

    static private final SubLString $str_alt41$English_Query__Gloss___ = makeString("English Query (Gloss): ");

    static private final SubLString $str_alt42$_gloss = makeString(":gloss");

    public static final SubLInteger $int$80 = makeInteger(80);

    static private final SubLString $$$virtual = makeString("virtual");

    static private final SubLString $$$Clear_Gloss = makeString("Clear Gloss");

    static private final SubLString $str_alt46$cycl_query = makeString("cycl-query");

    static private final SubLString $str_alt47$CycL_Query_Sentence__ = makeString("CycL Query Sentence: ");







    static private final SubLList $list_alt51 = list(makeKeyword("INPUT-NAME"), makeString(":query"), makeKeyword("PRETTY-NAME"), NIL, makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("HEIGHT"), TEN_INTEGER);



    static private final SubLString $str_alt53$A_genTemplate_QuerySentence_formu = makeString("A genTemplate-QuerySentence formula could not be generated due to the following reason(s):");

    static private final SubLString $$$genTemplate = makeString("genTemplate");

    static private final SubLString $str_alt55$genTemplate_QuerySentence_ = makeString("genTemplate-QuerySentence:");

    static private final SubLList $list_alt56 = list(makeKeyword("INPUT-NAME"), makeString(":formula"), makeKeyword("PRETTY-NAME"), NIL, makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("HEIGHT"), TEN_INTEGER);

    static private final SubLString $str_alt57$The_above_genTemplate_QuerySenten = makeString("The above genTemplate-QuerySentence was generated with the following warnings:");



    static private final SubLString $str_alt59$Note__ = makeString("Note: ");

    static private final SubLString $str_alt60$A_genTemplate_QuerySentence_formu = makeString("A genTemplate-QuerySentence formula could not be generated.");

    static private final SubLString $str_alt61$The_above_genTemplate_QuerySenten = makeString("The above genTemplate-QuerySentence was~A used.");

    static private final SubLString $str_alt62$_not = makeString(" not");

    static private final SubLString $str_alt63$_no_phrase = makeString(":no-phrase");

    static private final SubLString $str_alt64$A_paraphrase_could_not_be_generat = makeString("A paraphrase could not be generated.  Please change the CycL query, gloss or the genTemplate-QuerySentence.");

    static private final SubLString $$$Compute = makeString("Compute");

    static private final SubLString $str_alt66$_submit = makeString(":submit");

    static private final SubLString $$$Assert = makeString("Assert");

    static private final SubLString $str_alt68$_assert = makeString(":assert");

    static private final SubLString $$$Reset = makeString("Reset");

    static private final SubLString $str_alt70$_reset = makeString(":reset");

    static private final SubLString $$$Quit = makeString("Quit");

    static private final SubLString $str_alt72$_quit = makeString(":quit");

    static private final SubLString $$$parseTemplate = makeString("parseTemplate");

    static private final SubLString $$$Parsing_Template = makeString("Parsing Template");

    static private final SubLString $str_alt75$Note__Parsing_Templates_are_shown = makeString("Note: Parsing Templates are shown for viewing purposes only.  This tool will not assert them.");

    static private final SubLList $list_alt76 = list(makeKeyword("INPUT-NAME"), makeString(":query"), makeKeyword("AUTO-CYCLIFY"), T);

    static private final SubLList $list_alt77 = list(makeKeyword("INPUT-NAME"), makeString(":formula"), makeKeyword("AUTO-CYCLIFY"), T);

    static private final SubLString $$$Attempted = makeString("Attempted");

    private static final SubLSymbol $GTQS_EDITED = makeKeyword("GTQS-EDITED");

    private static final SubLSymbol $GTQS_INVALID = makeKeyword("GTQS-INVALID");

    private static final SubLSymbol $NO_PARAPHRASE = makeKeyword("NO-PARAPHRASE");

    static private final SubLString $$$Asserted = makeString("Asserted");

    static private final SubLString $str_alt83$Thank_you_for_using_the_Query_Sen = makeString("Thank you for using the Query Sentence Lexifier.");

    private static final SubLSymbol CB_HANDLE_QUERY_SENTENCE_LEXIFIER = makeSymbol("CB-HANDLE-QUERY-SENTENCE-LEXIFIER");

    // // Initializers
    public void declareFunctions() {
        declare_cb_query_sentence_lexifier_file();
    }

    public void initializeVariables() {
        init_cb_query_sentence_lexifier_file();
    }

    public void runTopLevelForms() {
        setup_cb_query_sentence_lexifier_file();
    }
}

