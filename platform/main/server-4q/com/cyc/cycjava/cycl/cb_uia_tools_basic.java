/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
 *  module:      CB-UIA-TOOLS-BASIC
 *  source file: /cyc/top/cycl/cb-uia-tools-basic.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_uia_tools_basic extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_tools_basic() {
    }

    public static final SubLFile me = new cb_uia_tools_basic();


    // // Definitions
    public static final SubLObject cb_uiat_reset_agenda_render_request(SubLObject request) {
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
                    return cb_uiat_reset_agenda_guts(interaction);
                }
            }
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_reset_agenda_prompt_map$ = makeSymbol("*CB-UIAT-RESET-AGENDA-PROMPT-MAP*");

    public static final SubLObject cb_uiat_reset_agenda_guts(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_princ($str_alt5$Which_reset_option_do_you_want__);
            html_utilities.html_newline(TWO_INTEGER);
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
                        SubLObject cdolist_list_var = $cb_uiat_reset_agenda_prompt_map$.getGlobalValue();
                        SubLObject prompt_info = NIL;
                        for (prompt_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , prompt_info = cdolist_list_var.first()) {
                            {
                                SubLObject datum = prompt_info;
                                SubLObject current = datum;
                                SubLObject action_type = NIL;
                                SubLObject link_data = NIL;
                                SubLObject prompt = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt6);
                                action_type = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt6);
                                link_data = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt6);
                                prompt = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_utilities.cb_link($RESET_AGENDA_HANDLER, interaction, link_data, $str_alt10$_Yes_, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_indent(TWO_INTEGER);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
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
                                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ(prompt);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt6);
                                }
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            cb_utilities.cb_link($UIA_REJECT_INTERACTION, interaction, $str_alt13$_No__continue_our_conversation_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_reset_agenda_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            SubLObject link_data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            link_data = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                    SubLObject action_type = find(link_data, $cb_uiat_reset_agenda_prompt_map$.getGlobalValue(), symbol_function(EQUAL), symbol_function(SECOND), UNPROVIDED, UNPROVIDED).first();
                    SubLObject pcase_var = action_type;
                    if (pcase_var.eql($COMPLETE_RESTART)) {
                        v_agenda = cb_user_interaction_agenda.cb_uia_complete_restart(v_agenda);
                    }
                    {
                        SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, action_type, NIL);
                        return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt14);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_reset_agenda_handler(SubLObject interaction, SubLObject link_data, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = user_interaction_agenda.ui_id(interaction);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$cb_uiat_reset_agenda_handler__A__, id, link_data);
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

    public static final SubLObject cb_uiat_empty_agenda_render_request(SubLObject request) {
        return cb_uiat_empty_agenda_guts();
    }

    public static final SubLObject cb_uiat_empty_agenda_guts() {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(v_agenda);
            }
            cb_user_interaction_agenda.cb_uia_show_title_line($EMPTY_AGENDA);
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_princ($str_alt23$Please_give_me_a_new_task_);
            html_utilities.html_newline(TWO_INTEGER);
            if (NIL != user_interaction_agenda.uia_anything_on_crumb_trailP(v_agenda)) {
                cb_uia_display_crumb_trail(v_agenda);
                html_utilities.html_newline(TWO_INTEGER);
            }
            cb_uia_suggest_some_things_to_say(v_agenda);
        }
        return NIL;
    }



    public static final SubLObject cb_uia_display_crumb_trail(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject terms = user_interaction_agenda.uia_get_terms_on_crumb_trail(v_agenda);
                SubLObject facts = user_interaction_agenda.uia_get_facts_on_crumb_trail(v_agenda);
                SubLObject questions = user_interaction_agenda.uia_get_questions_on_crumb_trail(v_agenda);
                SubLObject term_count = NIL;
                SubLObject fact_count = NIL;
                SubLObject question_count = NIL;
                {
                    SubLObject _prev_bind_0 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                    try {
                        rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                        rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                        if (NIL != terms) {
                            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt26$Recently__we_mentioned__);
                            html_utilities.html_newline(UNPROVIDED);
                            {
                                SubLObject list_var = NIL;
                                SubLObject v_term = NIL;
                                SubLObject counter = NIL;
                                for (list_var = terms, v_term = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                    if (!counter.isZero()) {
                                        html_utilities.html_indent(TWO_INTEGER);
                                    }
                                    term_count = counter;
                                    cb_uia_display_primitives.cb_uia_show_term_with_clarifying_link(v_term, UNPROVIDED);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        }
                        if (NIL != facts) {
                            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt27$And_we_mentioned_the_following_fa);
                            {
                                SubLObject list_var = NIL;
                                SubLObject fact = NIL;
                                SubLObject counter = NIL;
                                for (list_var = facts, fact = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , fact = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                    html_utilities.html_newline(UNPROVIDED);
                                    cb_uia_crumb_trail_show_fact(fact);
                                    fact_count = counter;
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        }
                        if (NIL != questions) {
                            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt28$And_we_mentioned_the_following_qu);
                            {
                                SubLObject list_var = NIL;
                                SubLObject v_question = NIL;
                                SubLObject counter = NIL;
                                for (list_var = questions, v_question = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_question = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                    html_utilities.html_newline(UNPROVIDED);
                                    cb_uia_crumb_trail_show_question(v_question);
                                    question_count = counter;
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        if (((fact_count.isFixnum() && $default_crumb_trail_size$.getDynamicValue(thread).numL(fact_count)) || (question_count.isFixnum() && $default_crumb_trail_size$.getDynamicValue(thread).numL(question_count))) || (term_count.isFixnum() && $default_crumb_trail_size$.getDynamicValue(thread).numL(term_count))) {
                            cb_utilities.cb_link($UIA_PRUNE_CRUMB_TRAIL, v_agenda, $str_alt30$_Shorten_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                    } finally {
                        rkf_macros.$rkf_speaker$.rebind(_prev_bind_1, thread);
                        rkf_macros.$rkf_addressee$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return v_agenda;
        }
    }

    /**
     *
     *
     * @unknown eventually, move this elsewhere; this is also used by the
    knowledge scrapbook
     */
    public static final SubLObject cb_uia_crumb_trail_show_fact(SubLObject fact) {
        {
            SubLObject datum = fact;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_5 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt31);
                current_5 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt31);
                if (NIL == member(current_5, $list_alt32, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_5 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt31);
            }
            {
                SubLObject assertion_tail = property_list_member($ASSERTION, current);
                SubLObject assertion = (NIL != assertion_tail) ? ((SubLObject) (cadr(assertion_tail))) : NIL;
                SubLObject sentence_tail = property_list_member($SENTENCE, current);
                SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                SubLObject mt_tail = property_list_member($MT, current);
                SubLObject mt = (NIL != mt_tail) ? ((SubLObject) (cadr(mt_tail))) : NIL;
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    cb_uia_display_primitives.cb_uia_show_assertion(assertion);
                } else
                    if (NIL != assertion_handles.assertion_p(assertion)) {
                        html_utilities.html_markup(html_macros.$html_strikethrough_head$.getGlobalValue());
                        cb_uia_display_primitives.cb_uia_show_sentence(sentence, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strikethrough_tail$.getGlobalValue());
                    } else {
                        cb_uia_display_primitives.cb_uia_show_sentence(sentence, UNPROVIDED);
                    }

            }
        }
        return fact;
    }

    /**
     *
     *
     * @unknown eventually, move this elsewhere; this is also used by the
    knowledge scrapbook
     */
    public static final SubLObject cb_uia_crumb_trail_show_question(SubLObject v_question) {
        {
            SubLObject datum = v_question;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_6 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt37);
                current_6 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt37);
                if (NIL == member(current_6, $list_alt38, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_6 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt37);
            }
            {
                SubLObject sentence_tail = property_list_member($SENTENCE, current);
                SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                SubLObject mt_tail = property_list_member($MT, current);
                SubLObject mt = (NIL != mt_tail) ? ((SubLObject) (cadr(mt_tail))) : NIL;
                cb_uia_display_primitives.cb_uia_show_query_with_clarifying_link(sentence, UNPROVIDED);
            }
        }
        return v_question;
    }

    public static final SubLObject cb_uia_suggest_some_things_to_say(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject present_topic = uia_setup_state.uia_topic(v_agenda);
                SubLObject topics = list($$CycProgram, present_topic);
                SubLObject message_start = $str_alt40$You_might_try_typing_one_of_the_f;
                if (NIL != uima_interface_parameter_declaration.uia_internal_use_assumptionsP(v_agenda)) {
                    topics = cons(uia_arbitrary_topic(v_agenda), topics);
                }
                {
                    SubLObject _prev_bind_0 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                    try {
                        rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                        rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                        html_utilities.html_princ(message_start);
                        html_utilities.html_princ_strong($$$Say_This);
                        html_utilities.html_princ($str_alt42$_box_below_);
                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = topics;
                                    SubLObject topic = NIL;
                                    for (topic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , topic = cdolist_list_var.first()) {
                                        {
                                            SubLObject _prev_bind_0_8 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                                            SubLObject _prev_bind_1_9 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                                            try {
                                                rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(v_agenda, $USER_TO_CYC), thread);
                                                rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(v_agenda, $USER_TO_CYC), thread);
                                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt44$What_do_you_know_about__A_, uia_trampolines.uia_term_phrase_np(v_agenda, topic, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                        html_utilities.html_newline(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                            } finally {
                                                rkf_macros.$rkf_speaker$.rebind(_prev_bind_1_9, thread);
                                                rkf_macros.$rkf_addressee$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    } finally {
                        rkf_macros.$rkf_speaker$.rebind(_prev_bind_1, thread);
                        rkf_macros.$rkf_addressee$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return v_agenda;
        }
    }

    /**
     * Return an arbitrarily picked topic to suggest for AGENDA.
     */
    public static final SubLObject uia_arbitrary_topic(SubLObject v_agenda) {
        {
            SubLObject topic = constants_high.random_constant(UNPROVIDED);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL($int$100); i = add(i, ONE_INTEGER)) {
                if (NIL != uia_topic_appropriateP(topic, v_agenda)) {
                    return topic;
                }
                topic = constants_high.random_constant(UNPROVIDED);
            }
            return topic;
        }
    }

    public static final SubLObject uia_topic_appropriateP(SubLObject topic, SubLObject v_agenda) {
        if (NIL != fort_types_interface.predicate_in_any_mtP(topic)) {
            return NIL;
        } else
            if (NIL == lexicon_utilities.lexifications_for_term(topic, NIL, ONE_INTEGER, UNPROVIDED_SYM)) {
                return NIL;
            } else {
                return T;
            }

    }

    public static final SubLObject cb_link_uia_prune_crumb_trail(SubLObject v_agenda, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt46$_Prune_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(v_agenda);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt48$cb_uia_prune_crumb_trail, arglist);
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

    public static final SubLObject cb_uia_prune_crumb_trail(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            user_interaction_agenda.uia_shorten_crumb_trail_to(cb_user_interaction_agenda.cb_current_uia(), $default_crumb_trail_size$.getDynamicValue(thread));
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(cb_user_interaction_agenda.cb_current_uia());
        }
    }

    public static final SubLObject cb_uiat_unknown_interaction_render_request(SubLObject request) {
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
                SubLObject display_method = (NIL != interaction) ? ((SubLObject) (cb_user_interaction_agenda.cb_uia_display_method(interaction))) : NIL;
                if (NIL != display_method) {
                    funcall(display_method, interaction);
                } else {
                    {
                        SubLObject pcase_var = action_type;
                        if (pcase_var.eql($SHOW)) {
                            {
                                SubLObject datum_11 = plist;
                                SubLObject current_12 = datum_11;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_12;
                                SubLObject bad = NIL;
                                SubLObject current_13 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_11, $list_alt53);
                                    current_13 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_11, $list_alt53);
                                    if (NIL == member(current_13, $list_alt54, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_13 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_11, $list_alt53);
                                }
                                {
                                    SubLObject operator_tail = property_list_member($OPERATOR, current_12);
                                    SubLObject operator_14 = (NIL != operator_tail) ? ((SubLObject) (cadr(operator_tail))) : NIL;
                                    SubLObject args_tail = property_list_member($ARGS, current_12);
                                    SubLObject args = (NIL != args_tail) ? ((SubLObject) (cadr(args_tail))) : NIL;
                                    SubLObject state_tail = property_list_member($STATE, current_12);
                                    SubLObject state = (NIL != state_tail) ? ((SubLObject) (cadr(state_tail))) : NIL;
                                    return cb_uiat_unknown_interaction_guts(interaction, operator_14, args, state);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_unknown_interaction_guts(SubLObject interaction, SubLObject operator, SubLObject args, SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            cb_user_interaction_agenda.cb_uia_show_title_line($UNKNOWN_INTERACTION);
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_princ($str_alt58$I_don_t_understand_this__);
            html_utilities.html_newline(TWO_INTEGER);
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
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt59$Operator__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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
                                    html_utilities.html_indent(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
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
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                    html_utilities.html_prin1(operator);
                                    html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
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
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt60$Args__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_indent(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
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
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                    cb_utilities.cb_form(args, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    if (NIL != state) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt61$State__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
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
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                        cb_utilities.cb_form(state, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            cb_utilities.cb_link($UIA_REJECT_INTERACTION, interaction, $str_alt62$_Forget_it_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_indent(UNPROVIDED);
            cb_utilities.cb_link($UIA_DEBUG_INTERACTION, interaction, $str_alt64$_Debug_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_indent(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_message_render_request(SubLObject request) {
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
                        SubLObject datum_27 = plist;
                        SubLObject current_28 = datum_27;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_28;
                        SubLObject bad = NIL;
                        SubLObject current_29 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_27, $list_alt67);
                            current_29 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_27, $list_alt67);
                            if (NIL == member(current_29, $list_alt68, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_29 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_27, $list_alt67);
                        }
                        {
                            SubLObject message_tail = property_list_member($MESSAGE, current_28);
                            SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
                            SubLObject refresh_tail = property_list_member($REFRESH, current_28);
                            SubLObject refresh = (NIL != refresh_tail) ? ((SubLObject) (cadr(refresh_tail))) : NIL;
                            return cb_uiat_message_guts(interaction, message, refresh);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_message_guts(SubLObject interaction, SubLObject message, SubLObject refresh) {
        if (refresh == UNPROVIDED) {
            refresh = NIL;
        }
        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
            html_script_utilities.html_js_focus_window();
        }
        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
        html_utilities.html_newline(UNPROVIDED);
        cb_uiat_show_message_string(message);
        html_utilities.html_newline(TWO_INTEGER);
        if (refresh.isFixnum()) {
            cb_uia_display_primitives.cb_uia_refresh_script(refresh, cb_user_interaction_agenda.get_uia_next_interaction_function());
        } else {
            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt71$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_show_message_string(SubLObject string) {
        html_utilities.html_markup(string);
        return string;
    }

    public static final SubLObject cb_uiat_acknowledge_message_render_request(SubLObject request) {
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
                        SubLObject datum_30 = plist;
                        SubLObject current_31 = datum_30;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_31;
                        SubLObject bad = NIL;
                        SubLObject current_32 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_30, $list_alt67);
                            current_32 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_30, $list_alt67);
                            if (NIL == member(current_32, $list_alt68, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_32 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_30, $list_alt67);
                        }
                        {
                            SubLObject message_tail = property_list_member($MESSAGE, current_31);
                            SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
                            SubLObject refresh_tail = property_list_member($REFRESH, current_31);
                            SubLObject refresh = (NIL != refresh_tail) ? ((SubLObject) (cadr(refresh_tail))) : NIL;
                            return cb_uiat_acknowledge_structured_message_guts(interaction, list($TEXT, message), refresh);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_acknowledge_structured_message_render_request(SubLObject request) {
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
                        SubLObject datum_33 = plist;
                        SubLObject current_34 = datum_33;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_34;
                        SubLObject bad = NIL;
                        SubLObject current_35 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_33, $list_alt77);
                            current_35 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_33, $list_alt77);
                            if (NIL == member(current_35, $list_alt78, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_35 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_33, $list_alt77);
                        }
                        {
                            SubLObject message_struct_tail = property_list_member($MESSAGE_STRUCT, current_34);
                            SubLObject message_struct = (NIL != message_struct_tail) ? ((SubLObject) (cadr(message_struct_tail))) : NIL;
                            SubLObject refresh_tail = property_list_member($REFRESH, current_34);
                            SubLObject refresh = (NIL != refresh_tail) ? ((SubLObject) (cadr(refresh_tail))) : NIL;
                            return cb_uiat_acknowledge_structured_message_guts(interaction, message_struct, refresh);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_acknowledge_structured_message_guts(SubLObject interaction, SubLObject message_struct, SubLObject refresh) {
        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
            html_script_utilities.html_js_focus_window();
        }
        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
        html_utilities.html_newline(UNPROVIDED);
        cb_uiat_interpret_structured_message(message_struct);
        html_utilities.html_newline(TWO_INTEGER);
        cb_utilities.cb_link($UIA_COMPLETE_INTERACTION, interaction, $str_alt71$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (refresh.isFixnum()) {
            cb_uia_display_primitives.cb_uia_refresh_script(refresh, cb_user_interaction_agenda.get_uia_next_interaction_function());
        }
        return refresh;
    }

    public static final SubLObject cb_uiat_interpret_structured_message(SubLObject message_struct) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject command = message_struct.first();
                SubLObject v_arguments = message_struct.rest();
                thread.resetMultipleValues();
                {
                    SubLObject head = cb_uiat_interpret_structured_command(command);
                    SubLObject tail = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    html_utilities.html_markup(head);
                    cb_uiat_interpret_structured_arguments(v_arguments);
                    html_utilities.html_markup(tail);
                }
            }
            return message_struct;
        }
    }

    public static final SubLObject cb_uiat_interpret_structured_arguments(SubLObject v_arguments) {
        {
            SubLObject cdolist_list_var = v_arguments;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (item.isList()) {
                    cb_uiat_interpret_structured_message(item);
                } else {
                    html_utilities.html_princ(item);
                }
            }
        }
        return v_arguments;
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_ackstructmsg_commands$ = makeSymbol("*CB-UIAT-ACKSTRUCTMSG-COMMANDS*");

    public static final SubLObject cb_uiat_interpret_structured_command(SubLObject item) {
        {
            SubLObject format_rule = assoc(item, $cb_uiat_ackstructmsg_commands$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != format_rule) {
                return values(second(format_rule), third(format_rule));
            } else {
                return values($str_alt89$, $str_alt89$);
            }
        }
    }

    public static final SubLObject cb_uiat_yes_no_question_render_request(SubLObject request) {
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
                        SubLObject datum_36 = plist;
                        SubLObject current_37 = datum_36;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_37;
                        SubLObject bad = NIL;
                        SubLObject current_38 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_36, $list_alt92);
                            current_38 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_36, $list_alt92);
                            if (NIL == member(current_38, $list_alt93, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_38 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_36, $list_alt92);
                        }
                        {
                            SubLObject question_tail = property_list_member($QUESTION, current_37);
                            SubLObject v_question = (NIL != question_tail) ? ((SubLObject) (cadr(question_tail))) : NIL;
                            SubLObject callback_tail = property_list_member($CALLBACK, current_37);
                            SubLObject callback = (NIL != callback_tail) ? ((SubLObject) (cadr(callback_tail))) : NIL;
                            SubLObject unknown_allowed_tail = property_list_member($UNKNOWN_ALLOWED, current_37);
                            SubLObject unknown_allowed = (NIL != unknown_allowed_tail) ? ((SubLObject) (cadr(unknown_allowed_tail))) : NIL;
                            SubLObject indexical_table_tail = property_list_member($INDEXICAL_TABLE, current_37);
                            SubLObject indexical_table = (NIL != indexical_table_tail) ? ((SubLObject) (cadr(indexical_table_tail))) : NIL;
                            SubLObject cycl_tail = property_list_member($CYCL, current_37);
                            SubLObject cycl = (NIL != cycl_tail) ? ((SubLObject) (cadr(cycl_tail))) : NIL;
                            return cb_uiat_yes_no_question_guts(interaction, v_question, callback, unknown_allowed, indexical_table, cycl);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_yes_no_question_guts(SubLObject interaction, SubLObject v_question, SubLObject callback, SubLObject unknown_allowedP, SubLObject indexical_table, SubLObject cycl) {
        if (unknown_allowedP == UNPROVIDED) {
            unknown_allowedP = NIL;
        }
        if (indexical_table == UNPROVIDED) {
            indexical_table = NIL;
        }
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
            html_utilities.html_newline(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                try {
                    pph_vars.$pph_term_paraphrase_map$.bind(indexical_table, thread);
                    cb_uiat_show_message_string(v_question);
                    if (callback.isFunctionSpec()) {
                        funcall(callback, interaction);
                    }
                } finally {
                    pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                }
            }
            if (NIL != cycl) {
                html_utilities.html_newline(TWO_INTEGER);
                html_utilities.html_indent(FIVE_INTEGER);
                cb_uia_display_primitives.cb_uia_show_sentence(cycl, UNPROVIDED);
            }
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_indent(FIVE_INTEGER);
            cb_utilities.cb_link($UIA_YES_NO_QUESTION_HANDLER, interaction, $$$yes, $str_alt10$_Yes_, UNPROVIDED, UNPROVIDED);
            html_utilities.html_indent(FIVE_INTEGER);
            cb_utilities.cb_link($UIA_YES_NO_QUESTION_HANDLER, interaction, $$$no, $str_alt102$_No_, UNPROVIDED, UNPROVIDED);
            if (NIL != unknown_allowedP) {
                html_utilities.html_indent(FIVE_INTEGER);
                cb_utilities.cb_link($UIA_YES_NO_QUESTION_HANDLER, interaction, $$$unknown, $str_alt104$_Don_t_Know_, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_yes_no_question_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject user_choice = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt105);
            user_choice = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_answer = ($$$yes.equal(user_choice)) ? ((SubLObject) ($YES)) : $$$unknown.equal(user_choice) ? ((SubLObject) ($UNKNOWN)) : $NO;
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, list($ANSWER, v_answer));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt105);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_yes_no_question_handler(SubLObject interaction, SubLObject choice, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, choice);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt111$cb_uiat_yes_no_question_handler, arglist);
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

    public static final SubLObject cb_uiat_input_box_render_request(SubLObject request) {
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
                        SubLObject datum_39 = plist;
                        SubLObject current_40 = datum_39;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_40;
                        SubLObject bad = NIL;
                        SubLObject current_41 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_39, $list_alt115);
                            current_41 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_39, $list_alt115);
                            if (NIL == member(current_41, $list_alt116, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_41 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_39, $list_alt115);
                        }
                        {
                            SubLObject prompt_tail = property_list_member($PROMPT, current_40);
                            SubLObject prompt = (NIL != prompt_tail) ? ((SubLObject) (cadr(prompt_tail))) : NIL;
                            SubLObject default_tail = property_list_member($DEFAULT, current_40);
                            SubLObject v_default = (NIL != default_tail) ? ((SubLObject) (cadr(default_tail))) : NIL;
                            return cb_uiat_input_box_show(interaction, prompt, v_default);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_input_box_show(SubLObject interaction, SubLObject prompt, SubLObject v_default) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        html_utilities.html_hidden_input($str_alt119$cb_uiat_input_box_handler, T, UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt120$ui_id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                            html_script_utilities.html_js_focus_window();
                        }
                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_princ(prompt);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_text_input($$$input, v_default, $int$50);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_submit_input($$$Submit, $$$submit, UNPROVIDED);
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

    public static final SubLObject cb_uiat_input_box_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject input = html_utilities.html_extract_input($$$input, args);
            SubLObject id_string = html_utilities.html_extract_input($str_alt120$ui_id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, list($ANSWER, input));
            cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_thinking_render_request(SubLObject request) {
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
                        SubLObject datum_42 = plist;
                        SubLObject current_43 = datum_42;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_43;
                        SubLObject bad = NIL;
                        SubLObject current_44 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_42, $list_alt128);
                            current_44 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_42, $list_alt128);
                            if (NIL == member(current_44, $list_alt129, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_44 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_42, $list_alt128);
                        }
                        {
                            SubLObject message_tail = property_list_member($MESSAGE, current_43);
                            SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_43);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : NIL;
                            SubLObject sofar_tail = property_list_member($SOFAR, current_43);
                            SubLObject sofar = (NIL != sofar_tail) ? ((SubLObject) (cadr(sofar_tail))) : NIL;
                            SubLObject total_tail = property_list_member($TOTAL, current_43);
                            SubLObject total = (NIL != total_tail) ? ((SubLObject) (cadr(total_tail))) : NIL;
                            SubLObject run_time_tail = property_list_member($RUN_TIME, current_43);
                            SubLObject run_time = (NIL != run_time_tail) ? ((SubLObject) (cadr(run_time_tail))) : NIL;
                            SubLObject finish_time_tail = property_list_member($FINISH_TIME, current_43);
                            SubLObject finish_time = (NIL != finish_time_tail) ? ((SubLObject) (cadr(finish_time_tail))) : NIL;
                            return cb_uiat_thinking_show(interaction, message, mode, sofar, total, run_time, finish_time);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_thinking_show(SubLObject interaction, SubLObject message, SubLObject mode, SubLObject sofar, SubLObject total, SubLObject run_time, SubLObject finish_time) {
        cb_uiat_thinking_progress_guts(interaction, message, mode, sofar, total, run_time, finish_time, T);
        return NIL;
    }

    /**
     * Refresh rate for a thinking progress display, in seconds, or NIL if no refresh.
     */
    // defparameter
    private static final SubLSymbol $cb_uiat_thinking_progress_refresh_rate$ = makeSymbol("*CB-UIAT-THINKING-PROGRESS-REFRESH-RATE*");

    public static final SubLObject cb_uiat_thinking_progress(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt135);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                        if ((user_interaction_agenda.ui_status(interaction) == $PENDING) && (interaction == user_interaction_agenda.uia_next_action(v_agenda))) {
                            {
                                SubLObject progress_summary = uia_tools_basic.uiat_thinking_progress_summary(interaction);
                                SubLObject datum_45 = progress_summary;
                                SubLObject current_46 = datum_45;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_46;
                                SubLObject bad = NIL;
                                SubLObject current_47 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_45, $list_alt128);
                                    current_47 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_45, $list_alt128);
                                    if (NIL == member(current_47, $list_alt129, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_47 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_45, $list_alt128);
                                }
                                {
                                    SubLObject message_tail = property_list_member($MESSAGE, current_46);
                                    SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
                                    SubLObject mode_tail = property_list_member($MODE, current_46);
                                    SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : NIL;
                                    SubLObject sofar_tail = property_list_member($SOFAR, current_46);
                                    SubLObject sofar = (NIL != sofar_tail) ? ((SubLObject) (cadr(sofar_tail))) : NIL;
                                    SubLObject total_tail = property_list_member($TOTAL, current_46);
                                    SubLObject total = (NIL != total_tail) ? ((SubLObject) (cadr(total_tail))) : NIL;
                                    SubLObject run_time_tail = property_list_member($RUN_TIME, current_46);
                                    SubLObject run_time = (NIL != run_time_tail) ? ((SubLObject) (cadr(run_time_tail))) : NIL;
                                    SubLObject finish_time_tail = property_list_member($FINISH_TIME, current_46);
                                    SubLObject finish_time = (NIL != finish_time_tail) ? ((SubLObject) (cadr(finish_time_tail))) : NIL;
                                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                    if (NIL != $cb_uiat_thinking_progress_refresh_rate$.getDynamicValue(thread)) {
                                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                        html_macros.html_head_content_type();
                                        html_utilities.html_refresh($cb_uiat_thinking_progress_refresh_rate$.getDynamicValue(thread), UNPROVIDED_SYM);
                                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                    cb_uiat_thinking_progress_guts(interaction, message, mode, sofar, total, run_time, finish_time, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                            }
                        } else {
                            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt135);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_thinking_progress_guts(SubLObject interaction, SubLObject message, SubLObject mode, SubLObject sofar, SubLObject total, SubLObject run_time, SubLObject finish_time, SubLObject switch_to_progress) {
        if (switch_to_progress == UNPROVIDED) {
            switch_to_progress = NIL;
        }
        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
            html_script_utilities.html_js_focus_window();
        }
        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
        {
            SubLObject pcase_var = mode;
            if (pcase_var.eql($RUNNING)) {
                html_utilities.html_progress_section(message, sofar, total, run_time, finish_time);
            } else {
                {
                    SubLObject mode_message = uait_thinking_mode_message(mode);
                    html_utilities.html_princ(mode_message);
                }
            }
        }
        if (NIL != switch_to_progress) {
            cb_uiat_thinking_progress_script(interaction);
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $uiat_thinking_mode_message_table$ = makeSymbol("*UIAT-THINKING-MODE-MESSAGE-TABLE*");

    public static final SubLObject uait_thinking_mode_message(SubLObject mode) {
        return second(assoc(mode, $uiat_thinking_mode_message_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_thinking_progress_script$ = makeSymbol("*CB-UIAT-THINKING-PROGRESS-SCRIPT*");

    public static final SubLObject cb_uiat_thinking_progress_script(SubLObject interaction) {
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
                    format(html_macros.$html_stream$.getDynamicValue(thread), $cb_uiat_thinking_progress_script$.getGlobalValue(), user_interaction_agenda.ui_id(interaction));
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_unknown_term_render_request(SubLObject request) {
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
                        SubLObject datum_48 = plist;
                        SubLObject current_49 = datum_48;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_49;
                        SubLObject bad = NIL;
                        SubLObject current_50 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_48, $list_alt143);
                            current_50 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_48, $list_alt143);
                            if (NIL == member(current_50, $list_alt144, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_50 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_48, $list_alt143);
                        }
                        {
                            SubLObject phrase_tail = property_list_member($PHRASE, current_49);
                            SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                            SubLObject nl_tags_tail = property_list_member($NL_TAGS, current_49);
                            SubLObject nl_tags = (NIL != nl_tags_tail) ? ((SubLObject) (cadr(nl_tags_tail))) : NIL;
                            SubLObject context_tail = property_list_member($CONTEXT, current_49);
                            SubLObject v_context = (NIL != context_tail) ? ((SubLObject) (cadr(context_tail))) : NIL;
                            SubLObject suppressors_tail = property_list_member($SUPPRESSORS, current_49);
                            SubLObject suppressors = (NIL != suppressors_tail) ? ((SubLObject) (cadr(suppressors_tail))) : NIL;
                            SubLObject isa_constraints_tail = property_list_member($ISA_CONSTRAINTS, current_49);
                            SubLObject isa_constraints = (NIL != isa_constraints_tail) ? ((SubLObject) (cadr(isa_constraints_tail))) : NIL;
                            SubLObject genls_constraints_tail = property_list_member($GENLS_CONSTRAINTS, current_49);
                            SubLObject genls_constraints = (NIL != genls_constraints_tail) ? ((SubLObject) (cadr(genls_constraints_tail))) : NIL;
                            return cb_uiat_unknown_term_guts(interaction, phrase, v_context, suppressors, isa_constraints, genls_constraints);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_unknown_term_guts(SubLObject interaction, SubLObject phrase, SubLObject v_context, SubLObject suppressors, SubLObject isas, SubLObject v_genls) {
        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
            html_script_utilities.html_js_focus_window();
        }
        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
        if (NIL != v_context) {
            html_utilities.html_princ(v_context);
            html_utilities.html_newline(UNPROVIDED);
        }
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_princ($$$I_do_not_know_what);
        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(phrase);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        html_utilities.html_princ($str_alt152$means_in_this_context_);
        cb_uiat_unknown_term_render_constraints(interaction, isas, v_genls);
        {
            SubLObject defining_infoP = makeBoolean((NIL != isas) || (NIL != v_genls));
            cb_uiat_unknown_term_render_actions(interaction, suppressors, defining_infoP);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_unknown_term_render_constraints(SubLObject interaction, SubLObject isas, SubLObject v_genls) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != isas) || (NIL != v_genls)) {
                html_utilities.html_indent(UNPROVIDED);
                html_utilities.html_princ($str_alt153$From_context__it_would_have_to_be);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = isas;
                            SubLObject isa_sentence = NIL;
                            for (isa_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_sentence = cdolist_list_var.first()) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_uia_display_primitives.cb_uia_show_sentence(isa_sentence, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                        }
                        {
                            SubLObject cdolist_list_var = v_genls;
                            SubLObject genls_sentence = NIL;
                            for (genls_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genls_sentence = cdolist_list_var.first()) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_uia_display_primitives.cb_uia_show_sentence(genls_sentence, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                html_utilities.html_princ($str_alt154$Would_you_like_me_to_create_it_as);
            }
            return interaction;
        }
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_unknown_term_info_actions$ = makeSymbol("*CB-UIAT-UNKNOWN-TERM-INFO-ACTIONS*");

    // deflexical
    private static final SubLSymbol $cb_uiat_unknown_term_no_info_actions$ = makeSymbol("*CB-UIAT-UNKNOWN-TERM-NO-INFO-ACTIONS*");

    // deflexical
    private static final SubLSymbol $cb_uiat_unknown_term_common_actions$ = makeSymbol("*CB-UIAT-UNKNOWN-TERM-COMMON-ACTIONS*");

    /**
     *
     *
     * @return ALIST-P; ACTION-KEYWORD -> (value label)
     */
    public static final SubLObject cb_uiat_unknown_term_get_actions(SubLObject interaction, SubLObject defining_infoP) {
        {
            SubLObject actions = (NIL != defining_infoP) ? ((SubLObject) ($cb_uiat_unknown_term_info_actions$.getGlobalValue())) : $cb_uiat_unknown_term_no_info_actions$.getGlobalValue();
            return append(actions, $cb_uiat_unknown_term_common_actions$.getGlobalValue());
        }
    }

    public static final SubLObject cb_uiat_unknown_term_render_actions(SubLObject interaction, SubLObject suppressors, SubLObject defining_infoP) {
        html_utilities.html_newline(TWO_INTEGER);
        {
            SubLObject cdolist_list_var = cb_uiat_unknown_term_get_actions(interaction, defining_infoP);
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject text = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt158);
                    key = current.first();
                    current = current.rest();
                    text = current;
                    cb_uiat_unknown_term_button(interaction, key, text, suppressors);
                }
            }
        }
        return interaction;
    }

    public static final SubLObject cb_uiat_unknown_term_button(SubLObject interaction, SubLObject key, SubLObject text, SubLObject suppressors) {
        {
            SubLObject datum = text;
            SubLObject current = datum;
            SubLObject value = NIL;
            SubLObject label = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt159);
            value = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt159);
            label = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != subl_promotions.memberP(key, suppressors, UNPROVIDED, UNPROVIDED)) {
                    html_utilities.html_princ(label);
                } else {
                    cb_utilities.cb_link($UIA_UNKNOWN_TERM_HANDLER, interaction, value, label, UNPROVIDED, UNPROVIDED);
                }
                html_utilities.html_indent(UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list_alt159);
            }
        }
        return key;
    }

    public static final SubLObject cb_uiat_unknown_term_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject mode = NIL;
            SubLObject action = NIL;
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject v_answer = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt161);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt161);
            v_answer = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_53 = user_interaction_agenda.ui_args(interaction);
                    SubLObject current_54 = datum_53;
                    SubLObject phrase = NIL;
                    destructuring_bind_must_consp(current_54, datum_53, $list_alt162);
                    phrase = current_54.first();
                    current_54 = current_54.rest();
                    {
                        SubLObject skip = current_54;
                        if (v_answer.equal($$$reject)) {
                            action = $REJECT;
                        } else
                            if (v_answer.equal($$$auto)) {
                                action = $AUTO_CREATE;
                                mode = $REQUIRED;
                            } else
                                if (v_answer.equal($$$later)) {
                                    action = $CREATE;
                                    mode = $RELEVANT;
                                } else
                                    if (v_answer.equal($$$manual)) {
                                        action = $CREATE;
                                        mode = $REQUIRED;
                                    } else
                                        if (v_answer.equal($$$find)) {
                                            action = $FIND;
                                            mode = $REQUIRED;
                                        }




                        {
                            SubLObject plist = list($PHRASE, phrase, $MODE, mode);
                            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, action, plist);
                            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt161);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_unknown_term_handler(SubLObject interaction, SubLObject v_answer, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, v_answer);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt175$cb_uiat_unknown_term_handler, arglist);
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

    public static final SubLObject cb_uiat_disambiguate_phrase_render_request(SubLObject request) {
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
                        SubLObject datum_55 = plist;
                        SubLObject current_56 = datum_55;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_56;
                        SubLObject bad = NIL;
                        SubLObject current_57 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_55, $list_alt179);
                            current_57 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_55, $list_alt179);
                            if (NIL == member(current_57, $list_alt180, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_57 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_55, $list_alt179);
                        }
                        {
                            SubLObject phrase_tail = property_list_member($PHRASE, current_56);
                            SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                            SubLObject candidate_terms_tail = property_list_member($CANDIDATE_TERMS, current_56);
                            SubLObject candidate_terms = (NIL != candidate_terms_tail) ? ((SubLObject) (cadr(candidate_terms_tail))) : NIL;
                            SubLObject rejected_terms_tail = property_list_member($REJECTED_TERMS, current_56);
                            SubLObject rejected_terms = (NIL != rejected_terms_tail) ? ((SubLObject) (cadr(rejected_terms_tail))) : NIL;
                            SubLObject term_info_table_tail = property_list_member($TERM_INFO_TABLE, current_56);
                            SubLObject term_info_table = (NIL != term_info_table_tail) ? ((SubLObject) (cadr(term_info_table_tail))) : NIL;
                            SubLObject show_clarify_links_tail = property_list_member($SHOW_CLARIFY_LINKS, current_56);
                            SubLObject show_clarify_links = (NIL != show_clarify_links_tail) ? ((SubLObject) (cadr(show_clarify_links_tail))) : NIL;
                            SubLObject show_comparison_links_tail = property_list_member($SHOW_COMPARISON_LINKS, current_56);
                            SubLObject show_comparison_links = (NIL != show_comparison_links_tail) ? ((SubLObject) (cadr(show_comparison_links_tail))) : NIL;
                            return cb_uiat_disambiguate_phrase_guts(interaction, phrase, candidate_terms, rejected_terms, term_info_table, show_clarify_links, show_comparison_links);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param TERM-INFO-TABLE;
     * 		a list of tuples of the form (term distinguishing-phrase type type-phrase image)
     */
    public static final SubLObject cb_uiat_disambiguate_phrase_guts(SubLObject interaction, SubLObject phrase, SubLObject candidate_terms, SubLObject rejected_terms, SubLObject term_info_table, SubLObject show_clarify_links, SubLObject show_comparison_links) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
            html_utilities.html_newline(UNPROVIDED);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt186$What_was_meant_by__S_, phrase);
            cb_uiat_show_phrase_meanings(interaction, term_info_table, show_clarify_links, $UIA_DISAMBIGUATE_PHRASE_HANDLER, $str_alt10$_Yes_, ZERO_INTEGER, candidate_terms);
            html_utilities.html_newline(UNPROVIDED);
            if (NIL != rejected_terms) {
                {
                    SubLObject object_id = $str_alt188$phrase_meanings;
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt189$text_css);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($$$screen);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                    html_utilities.html_terpri(UNPROVIDED);
                    dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$Less_Likely_Meanings);
                    html_utilities.html_newline(UNPROVIDED);
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
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject candidate_count = length(candidate_terms);
                                cb_uiat_show_phrase_meanings(interaction, term_info_table, show_clarify_links, $UIA_DISAMBIGUATE_PHRASE_HANDLER, $str_alt194$_Select_, candidate_count, rejected_terms);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
                html_utilities.html_newline(UNPROVIDED);
            }
            cb_utilities.cb_link($UIA_DISAMBIGUATE_PHRASE_HANDLER, interaction, $$$new, format(NIL, $str_alt196$_Click_here_to_add_a_new_meaning_, phrase), UNPROVIDED, UNPROVIDED);
            html_utilities.html_indent(TWO_INTEGER);
            cb_utilities.cb_link($UIA_DISAMBIGUATE_PHRASE_HANDLER, interaction, $$$none, $str_alt197$_Click_here_to_skip_this_phrase__, UNPROVIDED, UNPROVIDED);
            html_utilities.html_newline(TWO_INTEGER);
            if (NIL != show_comparison_links) {
                {
                    SubLObject link_string = (NIL != list_utilities.lengthG(candidate_terms, ONE_INTEGER, UNPROVIDED)) ? ((SubLObject) ($str_alt198$_Visualize_Candidates_)) : $str_alt199$_Visualize_Candidate_;
                    SubLObject bare_terms = parsing_utilities.strip_nl_tags(candidate_terms, UNPROVIDED);
                    cb_utilities.cb_link($UIA_BLUE_CONCEPT_COMPARATOR_EVENT, user_interaction_agenda.ui_agenda(interaction), link_string, bare_terms, ONE_INTEGER, $list_alt201);
                }
                html_utilities.html_newline(UNPROVIDED);
                {
                    SubLObject terms = list_utilities.pick_two(candidate_terms);
                    SubLObject first_pair = terms.first();
                    SubLObject hidden_pairs = terms.rest();
                    if (NIL != first_pair) {
                        cb_utilities.cb_link($UIA_DISAMBIGUATE_PHRASE_HANDLER, interaction, cons($COMPARE, first_pair), format(NIL, $str_alt203$_Compare__S_and__S_, string_for_term_from_info_table(term_info_table, first_pair.first()), string_for_term_from_info_table(term_info_table, second(first_pair))), UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                    }
                    if (NIL != hidden_pairs) {
                        {
                            SubLObject object_id = $$$comparisons;
                            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt189$text_css);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($$$screen);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                            html_utilities.html_terpri(UNPROVIDED);
                            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$More_Comparisons);
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
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject cdolist_list_var = hidden_pairs;
                                        SubLObject terms_58 = NIL;
                                        for (terms_58 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , terms_58 = cdolist_list_var.first()) {
                                            html_utilities.html_newline(UNPROVIDED);
                                            cb_utilities.cb_link($UIA_DISAMBIGUATE_PHRASE_HANDLER, interaction, cons($COMPARE, terms_58), format(NIL, $str_alt203$_Compare__S_and__S_, string_for_term_from_info_table(term_info_table, terms_58.first()), string_for_term_from_info_table(term_info_table, second(terms_58))), UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    // defparameter
    public static final SubLSymbol $cb_uiat_default_image_height$ = makeSymbol("*CB-UIAT-DEFAULT-IMAGE-HEIGHT*");

    /**
     * Display an HTML table showing the phrase meanings of TERMS
     */
    public static final SubLObject cb_uiat_show_phrase_meanings(SubLObject interaction, SubLObject term_info_table, SubLObject show_clarify_links, SubLObject link_type, SubLObject link_text, SubLObject offset, SubLObject terms) {
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
                    cb_uiat_phrase_meanings_header(term_info_table);
                    {
                        SubLObject list_var = NIL;
                        SubLObject v_term = NIL;
                        SubLObject index = NIL;
                        for (list_var = terms, v_term = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , index = add(ONE_INTEGER, index)) {
                            {
                                SubLObject info = list_utilities.alist_lookup(term_info_table, v_term, symbol_function(EQUAL), UNPROVIDED);
                                SubLObject force = user_interaction_agenda.ui_state_lookup(interaction, $FORCE, $NONE);
                                SubLObject datum = info;
                                SubLObject current = datum;
                                SubLObject phrase = NIL;
                                SubLObject type = NIL;
                                SubLObject type_phrase = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt208);
                                phrase = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt208);
                                type = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt208);
                                type_phrase = current.first();
                                current = current.rest();
                                {
                                    SubLObject image = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                    destructuring_bind_must_listp(current, datum, $list_alt208);
                                    current = current.rest();
                                    if (NIL == current) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != link_type) {
                                                            cb_utilities.cb_link(link_type, interaction, add(index, offset), link_text, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                if (NIL != subl_promotions.memberP(force, $list_alt209, UNPROVIDED, UNPROVIDED)) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_indent(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
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
                                                        SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            if (NIL != link_type) {
                                                                cb_utilities.cb_link($UIA_DISAMBIGUATE_PHRASE_SIMILAR_HANDLER, interaction, add(index, offset), $str_alt211$_Edit_, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
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
                                                    SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (!((show_clarify_links == $TRUE) && (NIL != user_interaction_agenda.uia_initialized_p(user_interaction_agenda.ui_agenda(interaction))))) {
                                                            cb_uia_display_primitives.cb_uia_show_term_without_link(v_term, phrase);
                                                        } else
                                                            if (force == $NONE) {
                                                                cb_uia_display_primitives.cb_uia_show_term_with_clarifying_link(v_term, phrase);
                                                            } else
                                                                if (NIL != member(force, $list_alt213, UNPROVIDED, UNPROVIDED)) {
                                                                    cb_uia_display_primitives.cb_uia_show_query_with_clarifying_link(v_term, phrase);
                                                                } else {
                                                                    cb_uia_display_primitives.cb_uia_show_sentence_with_clarifying_link(v_term, phrase);
                                                                }


                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != image) {
                                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(image);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            if (NIL != $cb_uiat_default_image_height$.getDynamicValue(thread)) {
                                                                html_utilities.html_markup(html_macros.$html_image_height$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($cb_uiat_default_image_height$.getDynamicValue(thread));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                if (NIL != type) {
                                                    if (cardinality_estimates.generality_estimate($$Individual).numLE(cardinality_estimates.generality_estimate(v_term))) {
                                                        uia_problem_reporting.uia_problem_reporting_email_form_mailer($str_alt215$Clarified_a_term_with_too_general, format(NIL, $str_alt216$While_showing_meaning_for_a_phras, new SubLObject[]{ phrase, v_term, type_phrase, type }), interaction);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_uia_display_primitives.cb_uia_show_term(type, type_phrase.isString() ? ((SubLObject) (type_phrase)) : NIL);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt208);
                                    }
                                }
                            }
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

    /**
     *
     *
     * @param TABLE
     * 		term-info-table
     * @param TERM
     * 		cycl term
     * @return string; the string corresponding to TERM in TABLE
     */
    public static final SubLObject string_for_term_from_info_table(SubLObject table, SubLObject v_term) {
        {
            SubLObject info = assoc(v_term, table, symbol_function(EQUAL), UNPROVIDED);
            SubLObject string = pph_utilities.pph_remove_html_tags(second(info), UNPROVIDED);
            return string;
        }
    }

    public static final SubLObject cb_uiat_phrase_meanings_header(SubLObject term_info_table) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_newline(ONE_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject typesP = list_utilities.find_if_not(NULL, term_info_table, THIRD, UNPROVIDED, UNPROVIDED);
                SubLObject picturesP = list_utilities.find_if_not(NULL, term_info_table, FIFTH, UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
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
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($$$Meaning);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != picturesP) {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($$$Image);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
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
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != typesP) {
                                    html_utilities.html_indent(TWO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($$$Category);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(FIVE_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_disambiguate_phrase_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject reply = NIL;
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject choice = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt224);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt224);
            choice = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject candidate_terms = user_interaction_agenda.ui_state_lookup(interaction, $CANDIDATE_TERMS, UNPROVIDED);
                    SubLObject datum_75 = user_interaction_agenda.ui_args(interaction);
                    SubLObject current_76 = datum_75;
                    SubLObject phrase = NIL;
                    destructuring_bind_must_consp(current_76, datum_75, $list_alt225);
                    phrase = current_76.first();
                    current_76 = current_76.rest();
                    if (NIL == current_76) {
                        {
                            SubLObject chosen_term = NIL;
                            if ($$$none.equal(choice)) {
                                chosen_term = $NONE;
                                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, list($CHOSEN_TERM, chosen_term));
                            } else
                                if ($$$new.equal(choice)) {
                                    chosen_term = $NONE;
                                    reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $NEW, list($PHRASE, phrase));
                                } else
                                    if (choice.isList() && (choice.first() == $COMPARE)) {
                                        reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $COMPARE, list($TERM1, second(choice), $TERM2, third(choice)));
                                    } else
                                        if (choice.isInteger()) {
                                            {
                                                SubLObject candidate_count = length(candidate_terms);
                                                if (choice.numL(candidate_count)) {
                                                    chosen_term = nth(choice, candidate_terms);
                                                } else {
                                                    {
                                                        SubLObject rejects = user_interaction_agenda.ui_state_lookup(interaction, $REJECTS, UNPROVIDED);
                                                        choice = subtract(choice, candidate_count);
                                                        chosen_term = nth(choice, rejects);
                                                    }
                                                }
                                            }
                                            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, list($CHOSEN_TERM, chosen_term));
                                        }



                        }
                    } else {
                        cdestructuring_bind_error(datum_75, $list_alt225);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt224);
            }
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_link_uia_disambiguate_phrase_handler(SubLObject interaction, SubLObject choice, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, choice);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt232$cb_uiat_disambiguate_phrase_handl, arglist);
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

    public static final SubLObject cb_uiat_disambiguate_phrase_similar_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject reply = NIL;
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject choice = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt224);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt224);
            choice = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject candidate_terms = user_interaction_agenda.ui_state_lookup(interaction, $CANDIDATE_TERMS, UNPROVIDED);
                    SubLObject chosen_term = NIL;
                    if (choice.isInteger()) {
                        {
                            SubLObject candidate_count = length(candidate_terms);
                            if (choice.numL(candidate_count)) {
                                chosen_term = nth(choice, candidate_terms);
                            } else {
                                {
                                    SubLObject rejects = user_interaction_agenda.ui_state_lookup(interaction, $REJECTS, UNPROVIDED);
                                    choice = subtract(choice, candidate_count);
                                    chosen_term = nth(choice, rejects);
                                }
                            }
                        }
                        reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $MAKE_SIMILAR, list($CHOSEN_TERM, chosen_term));
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt224);
            }
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_link_uia_disambiguate_phrase_similar_handler(SubLObject interaction, SubLObject choice, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, choice);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt236$cb_uiat_disambiguate_phrase_simil, arglist);
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

    public static final SubLObject cb_uiat_concept_finder_render_request(SubLObject request) {
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
                        SubLObject datum_77 = plist;
                        SubLObject current_78 = datum_77;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_78;
                        SubLObject bad = NIL;
                        SubLObject current_79 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_77, $list_alt240);
                            current_79 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_77, $list_alt240);
                            if (NIL == member(current_79, $list_alt241, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_79 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_77, $list_alt240);
                        }
                        {
                            SubLObject nusketch_tail = property_list_member($NUSKETCH, current_78);
                            SubLObject nusketch = (NIL != nusketch_tail) ? ((SubLObject) (cadr(nusketch_tail))) : NIL;
                            return cb_uiat_concept_finder_guts(interaction, nusketch);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_concept_finder_guts(SubLObject interaction, SubLObject nusketchP) {
        if (nusketchP == UNPROVIDED) {
            nusketchP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        html_utilities.html_hidden_input($str_alt243$cb_uiat_concept_finder_handler, T, UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt120$ui_id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                            html_script_utilities.html_js_focus_window();
                        }
                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_princ($str_alt244$Find_the_desired_concept_by_any_o);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ($str_alt245$Enter_a_phrase_that_denotes_the_c);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_submit_input($$$Find, $str_alt247$find_by_phrase, UNPROVIDED);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_text_input($str_alt248$find_phrase, NIL, TWENTY_INTEGER);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($UIA_KNOWLEDGE_SCRAPBOOK_LAUNCH, $str_alt250$_Paste_from_Scrapbook_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($UIA_DOMAIN_EXAMPLES_LAUNCH, $str_alt252$_Paste_from_Examples_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($UIA_ONTOLOGY_BROWSER_START, NIL, NIL, $str_alt254$_Browse_Ontology_, UNPROVIDED, UNPROVIDED);
                        if (NIL != nusketchP) {
                            html_utilities.html_newline(TWO_INTEGER);
                            cb_utilities.cb_link($UIA_WAIT_FOR_NUSKETCH_SELECTION, interaction, $str_alt256$_Get_from_Sketch_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ($str_alt257$Or__use_any_of_the_other_Browsing);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($UIA_REJECT_INTERACTION, interaction, $str_alt62$_Forget_it_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

    public static final SubLObject cb_uia_wait_for_nusketch(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt258);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $WAIT_FOR_NUSKETCH, NIL);
                    cb_user_interaction_agenda.cb_uia_handle_reply(user_interaction_agenda.ui_agenda(interaction), reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt258);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_wait_for_nusketch_selection(SubLObject interaction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt256$_Get_from_Sketch_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt261$cb_uia_wait_for_nusketch, arglist);
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

    public static final SubLObject cb_uiat_concept_finder_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject phrase = html_utilities.html_extract_input($str_alt248$find_phrase, args);
            SubLObject id_string = html_utilities.html_extract_input($str_alt120$ui_id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $CONCEPT_DISAMBIGUATOR, list($PHRASE, phrase));
            cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_concept_finder_throw(SubLObject v_term, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt194$_Select_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt265$cb_uia_concept_finder_catch, arglist);
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

    public static final SubLObject cb_uia_concept_finder_catch(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt268);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $CONCEPT_FINDER, $CATCH, list($TERM, v_term));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt268);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_concept_finder(SubLObject cycl_sentence, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_url_princ($str_alt272$cb_uia_concept_finder_launch);
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

    public static final SubLObject cb_uia_concept_finder_launch(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $CONCEPT_FINDER, $LAUNCH, NIL);
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_sentence_finder_render_request(SubLObject request) {
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
                    return cb_uiat_sentence_finder_guts(interaction);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_sentence_finder_guts(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        html_utilities.html_hidden_input($str_alt279$cb_uiat_sentence_finder_handler, T, UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt120$ui_id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                            html_script_utilities.html_js_focus_window();
                        }
                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_princ($str_alt280$Find_the_desired_sentence_by_any_);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ($str_alt281$Type_in_a_sentence_);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_submit_input($$$Find, $str_alt282$find_by_text, UNPROVIDED);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt283$find_text);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($int$60);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(FIVE_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$virtual);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($UIA_KNOWLEDGE_SCRAPBOOK_LAUNCH, $str_alt250$_Paste_from_Scrapbook_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($UIA_DOMAIN_EXAMPLES_LAUNCH, $str_alt252$_Paste_from_Examples_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($UIA_KNOWLEDGE_REVIEWER_LAUNCH, $str_alt287$_Paste_from_this_Conversation_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ($str_alt288$Or__use_any_of_the_other_Browsing);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($UIA_REJECT_INTERACTION, interaction, $str_alt62$_Forget_it_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

    public static final SubLObject cb_uiat_sentence_finder_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject text = html_utilities.html_extract_input($str_alt283$find_text, args);
            SubLObject id_string = html_utilities.html_extract_input($str_alt120$ui_id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SENTENCE_READER, list($TEXT, text));
            cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_sentence_finder_throw(SubLObject sentence, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt194$_Select_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(sentence);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt291$cb_uia_sentence_finder_catch, arglist);
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

    public static final SubLObject cb_uia_sentence_finder_catch(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt294);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $SENTENCE_FINDER, $CATCH, list($SENTENCE, sentence));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt294);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_file_browser_render_request(SubLObject request) {
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
                        SubLObject datum_81 = plist;
                        SubLObject current_82 = datum_81;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_82;
                        SubLObject bad = NIL;
                        SubLObject current_83 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_81, $list_alt298);
                            current_83 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_81, $list_alt298);
                            if (NIL == member(current_83, $list_alt299, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_83 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_81, $list_alt298);
                        }
                        {
                            SubLObject directory_tail = property_list_member($DIRECTORY, current_82);
                            SubLObject directory = (NIL != directory_tail) ? ((SubLObject) (cadr(directory_tail))) : NIL;
                            SubLObject type_tail = property_list_member($TYPE, current_82);
                            SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : NIL;
                            SubLObject dirs_tail = property_list_member($DIRS, current_82);
                            SubLObject dirs = (NIL != dirs_tail) ? ((SubLObject) (cadr(dirs_tail))) : NIL;
                            SubLObject files_tail = property_list_member($FILES, current_82);
                            SubLObject files = (NIL != files_tail) ? ((SubLObject) (cadr(files_tail))) : NIL;
                            SubLObject has_parentP_tail = property_list_member($kw304$HAS_PARENT_, current_82);
                            SubLObject has_parentP = (NIL != has_parentP_tail) ? ((SubLObject) (cadr(has_parentP_tail))) : NIL;
                            return cb_uiat_fb_render_guts(interaction, directory, type, dirs, files, has_parentP);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Render the file listing itself.
     */
    public static final SubLObject cb_uiat_fb_render_guts(SubLObject interaction, SubLObject directory, SubLObject type, SubLObject dirs, SubLObject files, SubLObject has_parentP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
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
                        html_utilities.html_hidden_input($str_alt305$cb_uia_fb_file_entered, T, UNPROVIDED);
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt306$Directory_of__A__, directory);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ($str_alt307$Specify_different_directory__);
                        html_utilities.html_hidden_input($str_alt308$curr_dir, directory, UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt120$ui_id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_submit_input($$$Change_Dir, $$$chdir, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_text_input(html_utilities.get_encoded_form_field_name($str_alt311$new_directory_name), NIL, $int$60);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_newline(ONE_INTEGER);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt312$Select_file_to__A___, type == $LOAD ? ((SubLObject) ($$$load)) : $$$save_or_enter_one);
                        html_utilities.html_newline(ONE_INTEGER);
                        if (type == $SAVE) {
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(ZERO_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_submit_input($$$Save, $$$save, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_text_input(html_utilities.get_encoded_form_field_name($str_alt319$save_file_name), NIL, $int$60);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_newline(ONE_INTEGER);
                        }
                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != has_parentP) {
                                                    cb_uia_place_dirlink(interaction, directory, $str_alt320$__, $str_alt321$_Parent_);
                                                } else {
                                                    html_utilities.html_princ($str_alt321$_Parent_);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var = dirs;
                                    SubLObject dir = NIL;
                                    for (dir = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dir = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_uia_place_dirlink(interaction, directory, dir, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var = files;
                                    SubLObject file = NIL;
                                    for (file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_uia_place_filelink(interaction, directory, file, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_fb_filelink_handler(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject path = NIL;
            SubLObject file = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt322);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt322);
            path = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt322);
            file = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject filename = cconcatenate(path, file);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FILE_CHOICE, list($FILE, filename));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt322);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_fb_dirlink_handler(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject path = NIL;
            SubLObject dir = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt326);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt326);
            path = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt326);
            dir = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject dirname = cconcatenate(path, dir);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DIR_CHOICE, list($DIRECTORY, dirname));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt326);
            }
        }
        return NIL;
    }

    /**
     * Handle entry into one of the text boxes
     */
    public static final SubLObject cb_uia_fb_file_entered(SubLObject args) {
        {
            SubLObject filename = html_utilities.extract_encoded_form_field_value($str_alt319$save_file_name, args);
            SubLObject directory = html_utilities.extract_encoded_form_field_value($str_alt311$new_directory_name, args);
            SubLObject currdir = html_utilities.html_extract_input($str_alt308$curr_dir, args);
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject ui_id = html_utilities.html_extract_input($str_alt120$ui_id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id);
            SubLObject reply = NIL;
            if (directory.isString() && length(directory).isPositive()) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DIR_CHOICE, list($DIRECTORY, string_utilities.trim_whitespace(directory)));
            } else
                if ((NIL != Strings.string(filename)) && length(filename).isPositive()) {
                    reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FILE_CHOICE, list($FILE, cconcatenate(currdir, filename)));
                }

            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    /**
     * Place the link for the rendering
     */
    public static final SubLObject cb_link_cb_uia_fb_filelink(SubLObject interaction, SubLObject path, SubLObject file, SubLObject link) {
        if (link == UNPROVIDED) {
            link = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == link) {
                link = file;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, path, file);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt330$cb_uiat_fb_filelink_handler, arglist);
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
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(link);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return path;
        }
    }

    /**
     * Place the link for the rendering
     */
    public static final SubLObject cb_link_cb_uia_fb_dirlink(SubLObject interaction, SubLObject path, SubLObject dir, SubLObject link) {
        if (link == UNPROVIDED) {
            link = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == link) {
                link = dir;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, path, dir);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt333$cb_uiat_fb_dirlink_handler, arglist);
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
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(link);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return path;
        }
    }

    /**
     * Functional wrapper for link
     */
    public static final SubLObject cb_uia_place_filelink(SubLObject interaction, SubLObject path, SubLObject file, SubLObject link) {
        if (link == UNPROVIDED) {
            link = NIL;
        }
        cb_utilities.cb_link($CB_UIA_FB_FILELINK, interaction, path, file, link, UNPROVIDED);
        return NIL;
    }

    /**
     * Functional wrapper for link
     */
    public static final SubLObject cb_uia_place_dirlink(SubLObject interaction, SubLObject path, SubLObject dir, SubLObject link) {
        if (link == UNPROVIDED) {
            link = NIL;
        }
        cb_utilities.cb_link($CB_UIA_FB_DIRLINK, interaction, path, dir, link, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_uiat_sentence_cloner_render_request(SubLObject request) {
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
                        SubLObject datum_101 = plist;
                        SubLObject current_102 = datum_101;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_102;
                        SubLObject bad = NIL;
                        SubLObject current_103 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_101, $list_alt338);
                            current_103 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_101, $list_alt338);
                            if (NIL == member(current_103, $list_alt339, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_103 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_101, $list_alt338);
                        }
                        {
                            SubLObject original_sentence_tail = property_list_member($ORIGINAL_SENTENCE, current_102);
                            SubLObject original_sentence = (NIL != original_sentence_tail) ? ((SubLObject) (cadr(original_sentence_tail))) : NIL;
                            SubLObject modified_sentence_tail = property_list_member($MODIFIED_SENTENCE, current_102);
                            SubLObject modified_sentence = (NIL != modified_sentence_tail) ? ((SubLObject) (cadr(modified_sentence_tail))) : NIL;
                            SubLObject clone_type_tail = property_list_member($CLONE_TYPE, current_102);
                            SubLObject clone_type = (NIL != clone_type_tail) ? ((SubLObject) (cadr(clone_type_tail))) : NIL;
                            SubLObject header_string_tail = property_list_member($HEADER_STRING, current_102);
                            SubLObject header_string = (NIL != header_string_tail) ? ((SubLObject) (cadr(header_string_tail))) : NIL;
                            SubLObject button_text_tail = property_list_member($BUTTON_TEXT, current_102);
                            SubLObject button_text = (NIL != button_text_tail) ? ((SubLObject) (cadr(button_text_tail))) : NIL;
                            SubLObject indexical_strings_tail = property_list_member($INDEXICAL_STRINGS, current_102);
                            SubLObject indexical_strings = (NIL != indexical_strings_tail) ? ((SubLObject) (cadr(indexical_strings_tail))) : NIL;
                            SubLObject editable_arg_info_tail = property_list_member($EDITABLE_ARG_INFO, current_102);
                            SubLObject editable_arg_info = (NIL != editable_arg_info_tail) ? ((SubLObject) (cadr(editable_arg_info_tail))) : NIL;
                            SubLObject sentence_paraphrase_tail = property_list_member($SENTENCE_PARAPHRASE, current_102);
                            SubLObject sentence_paraphrase = (NIL != sentence_paraphrase_tail) ? ((SubLObject) (cadr(sentence_paraphrase_tail))) : NIL;
                            cb_sentence_cloner_guts(user_interaction_agenda.ui_agenda(interaction), interaction, original_sentence, modified_sentence, clone_type, header_string, button_text, indexical_strings, editable_arg_info, sentence_paraphrase);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sentence_cloner_arg_phrase(SubLObject v_agenda, SubLObject arg, SubLObject type) {
        if ((NIL != el_utilities.el_formula_p(arg)) && (NIL != member(cycl_utilities.formula_operator(arg), $list_alt348, UNPROVIDED, UNPROVIDED))) {
            return $str_alt89$;
        } else
            if ($SENTENCE == type) {
                return uia_trampolines.uia_sentence_phrase(v_agenda, arg, UNPROVIDED, UNPROVIDED);
            } else {
                return uia_trampolines.uia_term_phrase(v_agenda, arg, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

    }

    public static final SubLObject cb_sentence_cloner_guts(SubLObject v_agenda, SubLObject interaction, SubLObject original_sentence, SubLObject modified_sentence, SubLObject clone_type, SubLObject header_string, SubLObject button_text, SubLObject indexical_strings, SubLObject editable_arg_info, SubLObject sentence_paraphrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred_seen = NIL;
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                cb_uia_macros.cb_uiat_document_expiration();
                cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
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
                            html_utilities.html_hidden_input($str_alt349$cb_uiat_sentence_cloner_handler, T, UNPROVIDED);
                            html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                            html_utilities.html_hidden_input($str_alt351$clone_type, princ_to_string(clone_type), UNPROVIDED);
                            {
                                SubLObject editable_arg_positions = Mapping.mapcar(symbol_function(SECOND), editable_arg_info);
                                html_utilities.html_hidden_input($str_alt352$argpos_list, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, editable_arg_positions), UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                            cb_uia_display_primitives.cb_uia_show_sentence(original_sentence, sentence_paraphrase);
                            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                            html_utilities.html_princ(header_string);
                            html_utilities.html_newline(TWO_INTEGER);
                            if (NIL != indexical_strings) {
                                html_utilities.html_princ($str_alt353$The_following_General_Terms_are_a);
                                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = indexical_strings;
                                            SubLObject string = NIL;
                                            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ(string);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
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
                                SubLObject _prev_bind_0_106 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_107 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_108 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($$$Original_Term);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_108, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_indent(TWO_INTEGER);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_109, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_110 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($$$New_Term);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_107, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    {
                                        SubLObject list_var = NIL;
                                        SubLObject arg_info = NIL;
                                        SubLObject index = NIL;
                                        for (list_var = editable_arg_info, arg_info = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg_info = list_var.first() , index = add(ONE_INTEGER, index)) {
                                            {
                                                SubLObject datum = arg_info;
                                                SubLObject current = datum;
                                                SubLObject type = NIL;
                                                SubLObject arg_position = NIL;
                                                SubLObject old_arg_paraphrase = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt356);
                                                type = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt356);
                                                arg_position = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt356);
                                                old_arg_paraphrase = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    {
                                                        SubLObject original_arg = cycl_utilities.get_nested_nth_arg(original_sentence, arg_position, UNPROVIDED);
                                                        SubLObject cleared_arg_positions = user_interaction_agenda.ui_state_lookup(interaction, $CLEARED_ARG_POSITIONS, NIL);
                                                        SubLObject clearedP = member(arg_position, cleared_arg_positions, symbol_function(EQUAL), UNPROVIDED);
                                                        SubLObject new_arg = (NIL != clearedP) ? ((SubLObject) (NIL)) : cycl_utilities.get_nested_nth_arg(modified_sentence, arg_position, UNPROVIDED);
                                                        SubLObject default_phrase = cb_sentence_cloner_arg_phrase(v_agenda, new_arg, type);
                                                        SubLObject phrase = (NIL != clearedP) ? ((SubLObject) ($str_alt358$_NEW_TERM)) : default_phrase;
                                                        SubLObject input_field_name = cconcatenate($$$input, string_utilities.str(index));
                                                        SubLObject encoded_field_name = html_utilities.get_encoded_form_field_name(input_field_name);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_111 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                    html_utilities.html_markup(html_utilities.html_align($BOTTOM));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_112 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject pcase_var = type;
                                                                            if (pcase_var.eql($TERM)) {
                                                                                cb_uia_display_primitives.cb_uia_show_term(original_arg, old_arg_paraphrase);
                                                                            } else
                                                                                if (pcase_var.eql($PREDICATE)) {
                                                                                    cb_uia_display_primitives.cb_uia_show_predicate(original_arg);
                                                                                    html_utilities.html_princ($str_alt361$__);
                                                                                    pred_seen = T;
                                                                                } else
                                                                                    if (pcase_var.eql($SENTENCE)) {
                                                                                        cb_uia_display_primitives.cb_uia_show_sentence(original_arg, UNPROVIDED);
                                                                                    }


                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_112, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_113 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_113, thread);
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
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_114 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_hidden_input(cconcatenate($$$default, string_utilities.str(index)), phrase, UNPROVIDED);
                                                                        html_utilities.html_newline(UNPROVIDED);
                                                                        {
                                                                            SubLObject pcase_var = type;
                                                                            if (pcase_var.eql($TERM)) {
                                                                                html_utilities.html_text_input(encoded_field_name, phrase, TWENTY_INTEGER);
                                                                            } else
                                                                                if (pcase_var.eql($PREDICATE)) {
                                                                                    html_utilities.html_text_input(encoded_field_name, phrase, FIFTEEN_INTEGER);
                                                                                } else
                                                                                    if (pcase_var.eql($SENTENCE)) {
                                                                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(encoded_field_name);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        if (true) {
                                                                                            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_markup($int$40);
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        if (true) {
                                                                                            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_markup(FIVE_INTEGER);
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup($$$virtual);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_115 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ(phrase);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_115, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                                    }


                                                                        }
                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                        cb_uia_display_primitives.cb_uia_paste_button(encoded_field_name, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_114, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_111, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt356);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_106, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            if (NIL != pred_seen) {
                                html_utilities.html_princ($str_alt364$___Although_it_is_possible_to_cha);
                                html_utilities.html_newline(TWO_INTEGER);
                            }
                            html_utilities.html_submit_input(button_text, $$$clone, UNPROVIDED);
                            if ($QUESTION != clone_type) {
                                html_utilities.html_indent(TWO_INTEGER);
                                html_utilities.html_submit_input(cconcatenate($str_alt366$Negated_, button_text), $str_alt367$negated_clone, UNPROVIDED);
                            }
                            html_utilities.html_newline(TWO_INTEGER);
                            html_utilities.html_submit_input($$$Forget_it, $$$abort, UNPROVIDED);
                            html_utilities.html_newline(TWO_INTEGER);
                            {
                                SubLObject appname = ($QUESTION == clone_type) ? ((SubLObject) ($$$Query_Cloner)) : $$$Sentence_Cloner;
                                SubLObject url_properties = user_interaction_agenda.ui_signature_to_property_list(user_interaction_agenda.ui_signature(interaction));
                                SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                                SubLObject is_question = eq($QUESTION, clone_type);
                                SubLObject handler_name = Strings.string_downcase(string_utilities.to_string(CB_UIAT_SENTENCE_CLONER_GKE_SUBMIT_HANDLER), UNPROVIDED, UNPROVIDED);
                                cb_uia_display_primitives.cb_uia_gke_applet(interaction, modified_sentence, mt, url_properties, handler_name, list($kw373$IS_QUESTION_, is_question, $APPNAME, appname, $EDITABLE_ARG_POSITIONS, NIL));
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
                cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_sentence_cloner_gke_submit_handler(SubLObject args) {
        {
            SubLObject uima_id_string = html_utilities.html_extract_input(symbol_name($UIMA), args);
            SubLObject uima_id = parse_integer(uima_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject uia_id_string = html_utilities.html_extract_input(symbol_name($UIA), args);
            SubLObject uia_id = parse_integer(uia_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject ui_id_string = html_utilities.html_extract_input(symbol_name($UI), args);
            SubLObject ui_id = parse_integer(ui_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject formula_string = html_utilities.html_extract_input($$$formula, args);
            SubLObject formula = read_from_string_ignoring_errors(formula_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
            SubLObject uima = user_interaction_agenda.uimma_find_by_id(uima_id);
            SubLObject v_agenda = user_interaction_agenda.uima_find_by_id(uima, uia_id);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id(v_agenda, ui_id);
            SubLObject plist = list($FORMULA, formula);
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FORMULA_ANSWER, plist);
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_sentence_cloner_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject question_cloneP = equalp($$$question, html_utilities.html_extract_input($str_alt351$clone_type, args));
            SubLObject arg_positions = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($str_alt352$argpos_list, args));
            SubLObject abortP = stringp(html_utilities.html_extract_input($$$abort, args));
            SubLObject negatedP = stringp(html_utilities.html_extract_input($str_alt367$negated_clone, args));
            SubLObject arg_position_phrase_pairs = NIL;
            if (NIL != abortP) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ABORT, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            }
            {
                SubLObject list_var = NIL;
                SubLObject arg_position = NIL;
                SubLObject index = NIL;
                for (list_var = arg_positions, arg_position = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg_position = list_var.first() , index = add(ONE_INTEGER, index)) {
                    {
                        SubLObject default_field = cconcatenate($$$default, string_utilities.str(index));
                        SubLObject input_field = cconcatenate($$$input, string_utilities.str(index));
                        SubLObject old_term_string = html_utilities.html_extract_input(default_field, args);
                        SubLObject new_term_string = html_utilities.extract_encoded_form_field_value(input_field, args);
                        if (!old_term_string.equalp(new_term_string)) {
                            arg_position_phrase_pairs = cons(list(arg_position, new_term_string), arg_position_phrase_pairs);
                        }
                    }
                }
            }
            arg_position_phrase_pairs = nreverse(arg_position_phrase_pairs);
            {
                SubLObject negated_gafP = makeBoolean((NIL != negatedP) && (NIL == question_cloneP));
                SubLObject plist = list($ARG_POSITION_PHRASE_PAIRS, arg_position_phrase_pairs, $NEGATED, NIL != negated_gafP ? ((SubLObject) ($TRUE)) : $FALSE);
                SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, plist);
                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            }
        }
    }

    public static final SubLObject cb_link_uia_similar_sentence(SubLObject cycl_sentence, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(cycl_sentence);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt389$cb_uia_similar_sentence_launch, arglist);
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

    public static final SubLObject cb_uia_similar_sentence_launch(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt392);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $SIMILAR_SENTENCE, $LAUNCH, list($SENTENCE, cycl_sentence));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt392);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_similar_assertion(SubLObject cycl_sentence, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(cycl_sentence);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt395$cb_uia_similar_assertion_launch, arglist);
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

    public static final SubLObject cb_uia_similar_assertion_launch(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt392);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $SIMILAR_ASSERTION, $LAUNCH, list($SENTENCE, cycl_sentence));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt392);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_similar_question(SubLObject cycl_sentence, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(cycl_sentence);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt400$cb_uia_similar_question_launch, arglist);
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

    public static final SubLObject cb_uia_similar_question_launch(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt392);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $SIMILAR_QUESTION, $LAUNCH, list($SENTENCE, cycl_sentence));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt392);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cb_uia_tools_basic_file() {
        declareFunction("cb_uiat_reset_agenda_render_request", "CB-UIAT-RESET-AGENDA-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_reset_agenda_guts", "CB-UIAT-RESET-AGENDA-GUTS", 1, 0, false);
        declareFunction("cb_uiat_reset_agenda_handler", "CB-UIAT-RESET-AGENDA-HANDLER", 1, 0, false);
        declareFunction("cb_link_reset_agenda_handler", "CB-LINK-RESET-AGENDA-HANDLER", 3, 0, false);
        declareFunction("cb_uiat_empty_agenda_render_request", "CB-UIAT-EMPTY-AGENDA-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_empty_agenda_guts", "CB-UIAT-EMPTY-AGENDA-GUTS", 0, 0, false);
        declareFunction("cb_uia_display_crumb_trail", "CB-UIA-DISPLAY-CRUMB-TRAIL", 1, 0, false);
        declareFunction("cb_uia_crumb_trail_show_fact", "CB-UIA-CRUMB-TRAIL-SHOW-FACT", 1, 0, false);
        declareFunction("cb_uia_crumb_trail_show_question", "CB-UIA-CRUMB-TRAIL-SHOW-QUESTION", 1, 0, false);
        declareFunction("cb_uia_suggest_some_things_to_say", "CB-UIA-SUGGEST-SOME-THINGS-TO-SAY", 1, 0, false);
        declareFunction("uia_arbitrary_topic", "UIA-ARBITRARY-TOPIC", 1, 0, false);
        declareFunction("uia_topic_appropriateP", "UIA-TOPIC-APPROPRIATE?", 2, 0, false);
        declareFunction("cb_link_uia_prune_crumb_trail", "CB-LINK-UIA-PRUNE-CRUMB-TRAIL", 1, 1, false);
        declareFunction("cb_uia_prune_crumb_trail", "CB-UIA-PRUNE-CRUMB-TRAIL", 1, 0, false);
        declareFunction("cb_uiat_unknown_interaction_render_request", "CB-UIAT-UNKNOWN-INTERACTION-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_unknown_interaction_guts", "CB-UIAT-UNKNOWN-INTERACTION-GUTS", 4, 0, false);
        declareFunction("cb_uiat_message_render_request", "CB-UIAT-MESSAGE-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_message_guts", "CB-UIAT-MESSAGE-GUTS", 2, 1, false);
        declareFunction("cb_uiat_show_message_string", "CB-UIAT-SHOW-MESSAGE-STRING", 1, 0, false);
        declareFunction("cb_uiat_acknowledge_message_render_request", "CB-UIAT-ACKNOWLEDGE-MESSAGE-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_acknowledge_structured_message_render_request", "CB-UIAT-ACKNOWLEDGE-STRUCTURED-MESSAGE-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_acknowledge_structured_message_guts", "CB-UIAT-ACKNOWLEDGE-STRUCTURED-MESSAGE-GUTS", 3, 0, false);
        declareFunction("cb_uiat_interpret_structured_message", "CB-UIAT-INTERPRET-STRUCTURED-MESSAGE", 1, 0, false);
        declareFunction("cb_uiat_interpret_structured_arguments", "CB-UIAT-INTERPRET-STRUCTURED-ARGUMENTS", 1, 0, false);
        declareFunction("cb_uiat_interpret_structured_command", "CB-UIAT-INTERPRET-STRUCTURED-COMMAND", 1, 0, false);
        declareFunction("cb_uiat_yes_no_question_render_request", "CB-UIAT-YES-NO-QUESTION-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_yes_no_question_guts", "CB-UIAT-YES-NO-QUESTION-GUTS", 3, 3, false);
        declareFunction("cb_uiat_yes_no_question_handler", "CB-UIAT-YES-NO-QUESTION-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_yes_no_question_handler", "CB-LINK-UIA-YES-NO-QUESTION-HANDLER", 3, 0, false);
        declareFunction("cb_uiat_input_box_render_request", "CB-UIAT-INPUT-BOX-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_input_box_show", "CB-UIAT-INPUT-BOX-SHOW", 3, 0, false);
        declareFunction("cb_uiat_input_box_handler", "CB-UIAT-INPUT-BOX-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_thinking_render_request", "CB-UIAT-THINKING-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_thinking_show", "CB-UIAT-THINKING-SHOW", 7, 0, false);
        declareFunction("cb_uiat_thinking_progress", "CB-UIAT-THINKING-PROGRESS", 1, 0, false);
        declareFunction("cb_uiat_thinking_progress_guts", "CB-UIAT-THINKING-PROGRESS-GUTS", 7, 1, false);
        declareFunction("uait_thinking_mode_message", "UAIT-THINKING-MODE-MESSAGE", 1, 0, false);
        declareFunction("cb_uiat_thinking_progress_script", "CB-UIAT-THINKING-PROGRESS-SCRIPT", 1, 0, false);
        declareFunction("cb_uiat_unknown_term_render_request", "CB-UIAT-UNKNOWN-TERM-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_unknown_term_guts", "CB-UIAT-UNKNOWN-TERM-GUTS", 6, 0, false);
        declareFunction("cb_uiat_unknown_term_render_constraints", "CB-UIAT-UNKNOWN-TERM-RENDER-CONSTRAINTS", 3, 0, false);
        declareFunction("cb_uiat_unknown_term_get_actions", "CB-UIAT-UNKNOWN-TERM-GET-ACTIONS", 2, 0, false);
        declareFunction("cb_uiat_unknown_term_render_actions", "CB-UIAT-UNKNOWN-TERM-RENDER-ACTIONS", 3, 0, false);
        declareFunction("cb_uiat_unknown_term_button", "CB-UIAT-UNKNOWN-TERM-BUTTON", 4, 0, false);
        declareFunction("cb_uiat_unknown_term_handler", "CB-UIAT-UNKNOWN-TERM-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_unknown_term_handler", "CB-LINK-UIA-UNKNOWN-TERM-HANDLER", 3, 0, false);
        declareFunction("cb_uiat_disambiguate_phrase_render_request", "CB-UIAT-DISAMBIGUATE-PHRASE-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_disambiguate_phrase_guts", "CB-UIAT-DISAMBIGUATE-PHRASE-GUTS", 7, 0, false);
        declareFunction("cb_uiat_show_phrase_meanings", "CB-UIAT-SHOW-PHRASE-MEANINGS", 7, 0, false);
        declareFunction("string_for_term_from_info_table", "STRING-FOR-TERM-FROM-INFO-TABLE", 2, 0, false);
        declareFunction("cb_uiat_phrase_meanings_header", "CB-UIAT-PHRASE-MEANINGS-HEADER", 1, 0, false);
        declareFunction("cb_uiat_disambiguate_phrase_handler", "CB-UIAT-DISAMBIGUATE-PHRASE-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_disambiguate_phrase_handler", "CB-LINK-UIA-DISAMBIGUATE-PHRASE-HANDLER", 3, 0, false);
        declareFunction("cb_uiat_disambiguate_phrase_similar_handler", "CB-UIAT-DISAMBIGUATE-PHRASE-SIMILAR-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_disambiguate_phrase_similar_handler", "CB-LINK-UIA-DISAMBIGUATE-PHRASE-SIMILAR-HANDLER", 3, 0, false);
        declareFunction("cb_uiat_concept_finder_render_request", "CB-UIAT-CONCEPT-FINDER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_concept_finder_guts", "CB-UIAT-CONCEPT-FINDER-GUTS", 1, 1, false);
        declareFunction("cb_uia_wait_for_nusketch", "CB-UIA-WAIT-FOR-NUSKETCH", 1, 0, false);
        declareFunction("cb_link_uia_wait_for_nusketch_selection", "CB-LINK-UIA-WAIT-FOR-NUSKETCH-SELECTION", 1, 1, false);
        declareFunction("cb_uiat_concept_finder_handler", "CB-UIAT-CONCEPT-FINDER-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_concept_finder_throw", "CB-LINK-UIA-CONCEPT-FINDER-THROW", 1, 1, false);
        declareFunction("cb_uia_concept_finder_catch", "CB-UIA-CONCEPT-FINDER-CATCH", 1, 0, false);
        declareFunction("cb_link_uia_concept_finder", "CB-LINK-UIA-CONCEPT-FINDER", 2, 0, false);
        declareFunction("cb_uia_concept_finder_launch", "CB-UIA-CONCEPT-FINDER-LAUNCH", 1, 0, false);
        declareFunction("cb_uiat_sentence_finder_render_request", "CB-UIAT-SENTENCE-FINDER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_sentence_finder_guts", "CB-UIAT-SENTENCE-FINDER-GUTS", 1, 0, false);
        declareFunction("cb_uiat_sentence_finder_handler", "CB-UIAT-SENTENCE-FINDER-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_sentence_finder_throw", "CB-LINK-UIA-SENTENCE-FINDER-THROW", 1, 1, false);
        declareFunction("cb_uia_sentence_finder_catch", "CB-UIA-SENTENCE-FINDER-CATCH", 1, 0, false);
        declareFunction("cb_uiat_file_browser_render_request", "CB-UIAT-FILE-BROWSER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_fb_render_guts", "CB-UIAT-FB-RENDER-GUTS", 6, 0, false);
        declareFunction("cb_uiat_fb_filelink_handler", "CB-UIAT-FB-FILELINK-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_fb_dirlink_handler", "CB-UIAT-FB-DIRLINK-HANDLER", 1, 0, false);
        declareFunction("cb_uia_fb_file_entered", "CB-UIA-FB-FILE-ENTERED", 1, 0, false);
        declareFunction("cb_link_cb_uia_fb_filelink", "CB-LINK-CB-UIA-FB-FILELINK", 3, 1, false);
        declareFunction("cb_link_cb_uia_fb_dirlink", "CB-LINK-CB-UIA-FB-DIRLINK", 3, 1, false);
        declareFunction("cb_uia_place_filelink", "CB-UIA-PLACE-FILELINK", 3, 1, false);
        declareFunction("cb_uia_place_dirlink", "CB-UIA-PLACE-DIRLINK", 3, 1, false);
        declareFunction("cb_uiat_sentence_cloner_render_request", "CB-UIAT-SENTENCE-CLONER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_sentence_cloner_arg_phrase", "CB-SENTENCE-CLONER-ARG-PHRASE", 3, 0, false);
        declareFunction("cb_sentence_cloner_guts", "CB-SENTENCE-CLONER-GUTS", 10, 0, false);
        declareFunction("cb_uiat_sentence_cloner_gke_submit_handler", "CB-UIAT-SENTENCE-CLONER-GKE-SUBMIT-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_sentence_cloner_handler", "CB-UIAT-SENTENCE-CLONER-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_similar_sentence", "CB-LINK-UIA-SIMILAR-SENTENCE", 2, 0, false);
        declareFunction("cb_uia_similar_sentence_launch", "CB-UIA-SIMILAR-SENTENCE-LAUNCH", 1, 0, false);
        declareFunction("cb_link_uia_similar_assertion", "CB-LINK-UIA-SIMILAR-ASSERTION", 2, 0, false);
        declareFunction("cb_uia_similar_assertion_launch", "CB-UIA-SIMILAR-ASSERTION-LAUNCH", 1, 0, false);
        declareFunction("cb_link_uia_similar_question", "CB-LINK-UIA-SIMILAR-QUESTION", 2, 0, false);
        declareFunction("cb_uia_similar_question_launch", "CB-UIA-SIMILAR-QUESTION-LAUNCH", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_tools_basic_file() {
        deflexical("*CB-UIAT-RESET-AGENDA-PROMPT-MAP*", $list_alt4);
        defparameter("*DEFAULT-CRUMB-TRAIL-SIZE*", TWELVE_INTEGER);
        deflexical("*CB-UIAT-ACKSTRUCTMSG-COMMANDS*", list(list($BLOCKQUOTE, html_macros.$html_blockquote_head$.getGlobalValue(), html_macros.$html_blockquote_tail$.getGlobalValue()), list($BOLD, html_macros.$html_bold_head$.getGlobalValue(), html_macros.$html_bold_tail$.getGlobalValue()), listS($BREAK, html_macros.$html_line_break$.getGlobalValue(), $list_alt84), list($ITALIC, html_macros.$html_italic_head$.getGlobalValue(), html_macros.$html_italic_tail$.getGlobalValue()), list($PARAGRAPH, html_macros.$html_paragraph_head$.getGlobalValue(), html_macros.$html_paragraph_tail$.getGlobalValue()), $list_alt87, list($TT, html_macros.$html_teletype_head$.getGlobalValue(), html_macros.$html_teletype_tail$.getGlobalValue())));
        defparameter("*CB-UIAT-THINKING-PROGRESS-REFRESH-RATE*", FOUR_INTEGER);
        deflexical("*UIAT-THINKING-MODE-MESSAGE-TABLE*", $list_alt139);
        deflexical("*CB-UIAT-THINKING-PROGRESS-SCRIPT*", $str_alt140$self_location_search_____cb_uiat_);
        deflexical("*CB-UIAT-UNKNOWN-TERM-INFO-ACTIONS*", $list_alt155);
        deflexical("*CB-UIAT-UNKNOWN-TERM-NO-INFO-ACTIONS*", $list_alt156);
        deflexical("*CB-UIAT-UNKNOWN-TERM-COMMON-ACTIONS*", $list_alt157);
        defparameter("*CB-UIAT-DEFAULT-IMAGE-HEIGHT*", $int$100);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_tools_basic_file() {
                cb_uia_tool_declaration.declare_cb_uia_tool($RESET_AGENDA, $list_alt1);
        html_macros.note_html_handler_function(CB_UIAT_RESET_AGENDA_HANDLER);
        cb_utilities.setup_cb_link_method($RESET_AGENDA_HANDLER, CB_LINK_RESET_AGENDA_HANDLER, THREE_INTEGER);
        cb_uia_tool_declaration.declare_cb_uia_tool($EMPTY_AGENDA, $list_alt22);
        utilities_macros.register_html_state_variable($default_crumb_trail_size$);
        cb_utilities.setup_cb_link_method($UIA_PRUNE_CRUMB_TRAIL, CB_LINK_UIA_PRUNE_CRUMB_TRAIL, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_PRUNE_CRUMB_TRAIL);
        cb_uia_tool_declaration.declare_cb_uia_tool($UNKNOWN_INTERACTION, $list_alt52);
        cb_uia_tool_declaration.declare_cb_uia_tool($MESSAGE, $list_alt66);
        cb_uia_tool_declaration.declare_cb_uia_tool($ACKNOWLEDGE_MESSAGE, $list_alt73);
        cb_uia_tool_declaration.declare_cb_uia_tool($ACKNOWLEDGE_STRUCTURED_MESSAGE, $list_alt76);
        cb_uia_tool_declaration.declare_cb_uia_tool($YES_NO_QUESTION, $list_alt91);
        html_macros.note_html_handler_function(CB_UIAT_YES_NO_QUESTION_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_YES_NO_QUESTION_HANDLER, CB_LINK_UIA_YES_NO_QUESTION_HANDLER, THREE_INTEGER);
        cb_uia_tool_declaration.declare_cb_uia_tool($INPUT_BOX, $list_alt114);
        html_macros.note_html_handler_function(CB_UIAT_INPUT_BOX_HANDLER);
        cb_uia_tool_declaration.declare_cb_uia_tool($THINKING, $list_alt127);
        html_macros.note_html_handler_function(CB_UIAT_THINKING_PROGRESS);
        cb_uia_tool_declaration.declare_cb_uia_tool($UNKNOWN_TERM, $list_alt142);
        html_macros.note_html_handler_function(CB_UIAT_UNKNOWN_TERM_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_UNKNOWN_TERM_HANDLER, CB_LINK_UIA_UNKNOWN_TERM_HANDLER, THREE_INTEGER);
        cb_uia_tool_declaration.declare_cb_uia_tool($DISAMBIGUATE_PHRASE, $list_alt178);
        html_macros.note_html_handler_function(CB_UIAT_DISAMBIGUATE_PHRASE_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_DISAMBIGUATE_PHRASE_HANDLER, CB_LINK_UIA_DISAMBIGUATE_PHRASE_HANDLER, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_DISAMBIGUATE_PHRASE_SIMILAR_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_DISAMBIGUATE_PHRASE_SIMILAR_HANDLER, CB_LINK_UIA_DISAMBIGUATE_PHRASE_SIMILAR_HANDLER, THREE_INTEGER);
        cb_uia_tool_declaration.declare_cb_uia_tool($CONCEPT_FINDER, $list_alt239);
        html_macros.note_html_handler_function(CB_UIA_WAIT_FOR_NUSKETCH);
        cb_utilities.setup_cb_link_method($UIA_WAIT_FOR_NUSKETCH_SELECTION, CB_LINK_UIA_WAIT_FOR_NUSKETCH_SELECTION, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_CONCEPT_FINDER_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_CONCEPT_FINDER_THROW, CB_LINK_UIA_CONCEPT_FINDER_THROW, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_CONCEPT_FINDER_CATCH);
        cb_utilities.setup_cb_link_method($UIA_CONCEPT_FINDER, CB_LINK_UIA_CONCEPT_FINDER, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_CONCEPT_FINDER_LAUNCH);
        cb_uia_tool_declaration.declare_cb_uia_tool($SENTENCE_FINDER, $list_alt278);
        html_macros.note_html_handler_function(CB_UIAT_SENTENCE_FINDER_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_SENTENCE_FINDER_THROW, CB_LINK_UIA_SENTENCE_FINDER_THROW, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_SENTENCE_FINDER_CATCH);
        cb_uia_tool_declaration.declare_cb_uia_tool($FILE_BROWSER, $list_alt297);
        html_macros.note_html_handler_function(CB_UIAT_FB_FILELINK_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_FB_DIRLINK_HANDLER);
        html_macros.note_html_handler_function(CB_UIA_FB_FILE_ENTERED);
        cb_utilities.setup_cb_link_method($CB_UIA_FB_FILELINK, CB_LINK_CB_UIA_FB_FILELINK, FOUR_INTEGER);
        cb_utilities.setup_cb_link_method($CB_UIA_FB_DIRLINK, CB_LINK_CB_UIA_FB_DIRLINK, FOUR_INTEGER);
        cb_uia_tool_declaration.declare_cb_uia_tool($SENTENCE_CLONER, $list_alt337);
        html_macros.note_html_handler_function(CB_UIAT_SENTENCE_CLONER_GKE_SUBMIT_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_SENTENCE_CLONER_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_SIMILAR_SENTENCE, CB_LINK_UIA_SIMILAR_SENTENCE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_SIMILAR_SENTENCE_LAUNCH);
        cb_utilities.setup_cb_link_method($UIA_SIMILAR_ASSERTION, CB_LINK_UIA_SIMILAR_ASSERTION, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_SIMILAR_ASSERTION_LAUNCH);
        cb_utilities.setup_cb_link_method($UIA_SIMILAR_QUESTION, CB_LINK_UIA_SIMILAR_QUESTION, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_SIMILAR_QUESTION_LAUNCH);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $RESET_AGENDA = makeKeyword("RESET-AGENDA");

    static private final SubLList $list_alt1 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-RESET-AGENDA-RENDER-REQUEST"), makeKeyword("HINT-NAME"), makeString("Options for resetting knowledge"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycResetAgendaTool")));

    static private final SubLList $list_alt2 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("SIGNATURE"), makeSymbol("PLIST"));



    static private final SubLList $list_alt4 = list(list(makeKeyword("CLEAR-MEMOIZATION"), makeString("clear-memoization"), makeString("Forget any cached computations.")), list(makeKeyword("RESET-NL-TRIE"), makeString("reset-nl-trie"), makeString("Reinitialize the lexification store.")), list(makeKeyword("REJECT-ALL"), makeString("reject-all"), makeString("Reject all unfinished interactions.")), list(makeKeyword("RESTART-TOPIC"), makeString("restart-topic"), makeString("Abandon this topic and start a new topic.")), list(makeKeyword("RESTART-N-FORGET"), makeString("restart-n-forget"), makeString("Abandon and forget this topic and start a new topic.")), list(makeKeyword("COMPLETE-RESTART"), makeString("complete-restart"), makeString("Abandon all topics and restart our entire conversation.")));

    static private final SubLString $str_alt5$Which_reset_option_do_you_want__ = makeString("Which reset option do you want :");

    static private final SubLList $list_alt6 = list(makeSymbol("ACTION-TYPE"), makeSymbol("LINK-DATA"), makeSymbol("PROMPT"));





    private static final SubLSymbol $RESET_AGENDA_HANDLER = makeKeyword("RESET-AGENDA-HANDLER");

    static private final SubLString $str_alt10$_Yes_ = makeString("[Yes]");



    private static final SubLSymbol $UIA_REJECT_INTERACTION = makeKeyword("UIA-REJECT-INTERACTION");

    static private final SubLString $str_alt13$_No__continue_our_conversation_ = makeString("[No, continue our conversation]");

    static private final SubLList $list_alt14 = list(makeSymbol("ID-STRING"), makeSymbol("LINK-DATA"));



    private static final SubLSymbol $COMPLETE_RESTART = makeKeyword("COMPLETE-RESTART");

    private static final SubLSymbol CB_UIAT_RESET_AGENDA_HANDLER = makeSymbol("CB-UIAT-RESET-AGENDA-HANDLER");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt19$cb_uiat_reset_agenda_handler__A__ = makeString("cb-uiat-reset-agenda-handler&~A&~A");

    private static final SubLSymbol CB_LINK_RESET_AGENDA_HANDLER = makeSymbol("CB-LINK-RESET-AGENDA-HANDLER");



    static private final SubLList $list_alt22 = list(makeKeyword("HINT-NAME"), makeString("Empty Agenda"), makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-EMPTY-AGENDA-RENDER-REQUEST"));

    static private final SubLString $str_alt23$Please_give_me_a_new_task_ = makeString("Please give me a new task.");

    public static final SubLSymbol $default_crumb_trail_size$ = makeSymbol("*DEFAULT-CRUMB-TRAIL-SIZE*");

    private static final SubLSymbol $CYC_TO_USER = makeKeyword("CYC-TO-USER");

    static private final SubLString $str_alt26$Recently__we_mentioned__ = makeString("Recently, we mentioned: ");

    static private final SubLString $str_alt27$And_we_mentioned_the_following_fa = makeString("And we mentioned the following facts: ");

    static private final SubLString $str_alt28$And_we_mentioned_the_following_qu = makeString("And we mentioned the following questions: ");

    private static final SubLSymbol $UIA_PRUNE_CRUMB_TRAIL = makeKeyword("UIA-PRUNE-CRUMB-TRAIL");

    static private final SubLString $str_alt30$_Shorten_ = makeString("[Shorten]");

    static private final SubLList $list_alt31 = list(makeSymbol("&KEY"), makeSymbol("ASSERTION"), makeSymbol("SENTENCE"), makeSymbol("MT"));

    static private final SubLList $list_alt32 = list(makeKeyword("ASSERTION"), makeKeyword("SENTENCE"), makeKeyword("MT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    static private final SubLList $list_alt37 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), makeSymbol("MT"));

    static private final SubLList $list_alt38 = list(makeKeyword("SENTENCE"), makeKeyword("MT"));

    public static final SubLObject $$CycProgram = constant_handles.reader_make_constant_shell(makeString("CycProgram"));

    static private final SubLString $str_alt40$You_might_try_typing_one_of_the_f = makeString("You might try typing one of the following into the ");

    static private final SubLString $$$Say_This = makeString("Say This");

    static private final SubLString $str_alt42$_box_below_ = makeString(" box below:");

    private static final SubLSymbol $USER_TO_CYC = makeKeyword("USER-TO-CYC");

    static private final SubLString $str_alt44$What_do_you_know_about__A_ = makeString("What do you know about ~A?");



    static private final SubLString $str_alt46$_Prune_ = makeString("[Prune]");



    static private final SubLString $str_alt48$cb_uia_prune_crumb_trail = makeString("cb-uia-prune-crumb-trail");

    private static final SubLSymbol CB_LINK_UIA_PRUNE_CRUMB_TRAIL = makeSymbol("CB-LINK-UIA-PRUNE-CRUMB-TRAIL");

    private static final SubLSymbol CB_UIA_PRUNE_CRUMB_TRAIL = makeSymbol("CB-UIA-PRUNE-CRUMB-TRAIL");



    static private final SubLList $list_alt52 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-UNKNOWN-INTERACTION-RENDER-REQUEST"));

    static private final SubLList $list_alt53 = list(makeSymbol("&KEY"), makeSymbol("OPERATOR"), makeSymbol("ARGS"), makeSymbol("STATE"));

    static private final SubLList $list_alt54 = list(makeKeyword("OPERATOR"), $ARGS, makeKeyword("STATE"));







    static private final SubLString $str_alt58$I_don_t_understand_this__ = makeString("I don't understand this :");

    static private final SubLString $str_alt59$Operator__ = makeString("Operator :");

    static private final SubLString $str_alt60$Args__ = makeString("Args :");

    static private final SubLString $str_alt61$State__ = makeString("State :");

    static private final SubLString $str_alt62$_Forget_it_ = makeString("[Forget it]");

    private static final SubLSymbol $UIA_DEBUG_INTERACTION = makeKeyword("UIA-DEBUG-INTERACTION");

    static private final SubLString $str_alt64$_Debug_ = makeString("[Debug]");



    static private final SubLList $list_alt66 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-MESSAGE-RENDER-REQUEST"));

    static private final SubLList $list_alt67 = list(makeSymbol("&KEY"), makeSymbol("MESSAGE"), makeSymbol("REFRESH"));

    static private final SubLList $list_alt68 = list(makeKeyword("MESSAGE"), makeKeyword("REFRESH"));



    private static final SubLSymbol $UIA_NEXT_INTERACTION = makeKeyword("UIA-NEXT-INTERACTION");

    static private final SubLString $str_alt71$_Continue_ = makeString("[Continue]");



    static private final SubLList $list_alt73 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-ACKNOWLEDGE-MESSAGE-RENDER-REQUEST"));



    private static final SubLSymbol $ACKNOWLEDGE_STRUCTURED_MESSAGE = makeKeyword("ACKNOWLEDGE-STRUCTURED-MESSAGE");

    static private final SubLList $list_alt76 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-ACKNOWLEDGE-STRUCTURED-MESSAGE-RENDER-REQUEST"));

    static private final SubLList $list_alt77 = list(makeSymbol("&KEY"), makeSymbol("MESSAGE-STRUCT"), makeSymbol("REFRESH"));

    static private final SubLList $list_alt78 = list(makeKeyword("MESSAGE-STRUCT"), makeKeyword("REFRESH"));

    private static final SubLSymbol $MESSAGE_STRUCT = makeKeyword("MESSAGE-STRUCT");

    private static final SubLSymbol $UIA_COMPLETE_INTERACTION = makeKeyword("UIA-COMPLETE-INTERACTION");

    private static final SubLSymbol $BLOCKQUOTE = makeKeyword("BLOCKQUOTE");





    static private final SubLList $list_alt84 = list(makeString(""));

    private static final SubLSymbol $ITALIC = makeKeyword("ITALIC");



    static private final SubLList $list_alt87 = list($TEXT, makeString(""), makeString(""));

    private static final SubLSymbol $TT = makeKeyword("TT");

    static private final SubLString $str_alt89$ = makeString("");

    private static final SubLSymbol $YES_NO_QUESTION = makeKeyword("YES-NO-QUESTION");

    static private final SubLList $list_alt91 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-YES-NO-QUESTION-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycYesNoQuestionTool")));

    static private final SubLList $list_alt92 = list(makeSymbol("&KEY"), makeSymbol("QUESTION"), makeSymbol("CALLBACK"), makeSymbol("UNKNOWN-ALLOWED"), makeSymbol("INDEXICAL-TABLE"), makeSymbol("CYCL"));

    static private final SubLList $list_alt93 = list(makeKeyword("QUESTION"), makeKeyword("CALLBACK"), makeKeyword("UNKNOWN-ALLOWED"), makeKeyword("INDEXICAL-TABLE"), $CYCL);



    private static final SubLSymbol $CALLBACK = makeKeyword("CALLBACK");

    private static final SubLSymbol $UNKNOWN_ALLOWED = makeKeyword("UNKNOWN-ALLOWED");





    private static final SubLSymbol $UIA_YES_NO_QUESTION_HANDLER = makeKeyword("UIA-YES-NO-QUESTION-HANDLER");

    static private final SubLString $$$yes = makeString("yes");

    static private final SubLString $$$no = makeString("no");

    static private final SubLString $str_alt102$_No_ = makeString("[No]");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $str_alt104$_Don_t_Know_ = makeString("[Don't Know]");

    static private final SubLList $list_alt105 = list(makeSymbol("INTERACTION"), makeSymbol("USER-CHOICE"));









    private static final SubLSymbol CB_UIAT_YES_NO_QUESTION_HANDLER = makeSymbol("CB-UIAT-YES-NO-QUESTION-HANDLER");

    static private final SubLString $str_alt111$cb_uiat_yes_no_question_handler = makeString("cb-uiat-yes-no-question-handler");

    private static final SubLSymbol CB_LINK_UIA_YES_NO_QUESTION_HANDLER = makeSymbol("CB-LINK-UIA-YES-NO-QUESTION-HANDLER");

    private static final SubLSymbol $INPUT_BOX = makeKeyword("INPUT-BOX");

    static private final SubLList $list_alt114 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-INPUT-BOX-RENDER-REQUEST"));

    static private final SubLList $list_alt115 = list(makeSymbol("&KEY"), makeSymbol("PROMPT"), makeSymbol("DEFAULT"));

    static private final SubLList $list_alt116 = list(makeKeyword("PROMPT"), makeKeyword("DEFAULT"));





    static private final SubLString $str_alt119$cb_uiat_input_box_handler = makeString("cb-uiat-input-box-handler");

    static private final SubLString $str_alt120$ui_id = makeString("ui-id");

    static private final SubLString $$$input = makeString("input");

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLString $$$Submit = makeString("Submit");

    static private final SubLString $$$submit = makeString("submit");

    private static final SubLSymbol CB_UIAT_INPUT_BOX_HANDLER = makeSymbol("CB-UIAT-INPUT-BOX-HANDLER");



    static private final SubLList $list_alt127 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-THINKING-RENDER-REQUEST"));

    static private final SubLList $list_alt128 = list(makeSymbol("&KEY"), makeSymbol("MESSAGE"), makeSymbol("MODE"), makeSymbol("SOFAR"), makeSymbol("TOTAL"), makeSymbol("RUN-TIME"), makeSymbol("FINISH-TIME"));

    static private final SubLList $list_alt129 = list(makeKeyword("MESSAGE"), $MODE, makeKeyword("SOFAR"), makeKeyword("TOTAL"), makeKeyword("RUN-TIME"), makeKeyword("FINISH-TIME"));







    private static final SubLSymbol $RUN_TIME = makeKeyword("RUN-TIME");



    static private final SubLList $list_alt135 = list(makeSymbol("ID-STRING"));



    private static final SubLSymbol CB_UIAT_THINKING_PROGRESS = makeSymbol("CB-UIAT-THINKING-PROGRESS");



    static private final SubLList $list_alt139 = list(list($NONE, makeString("Processing has not yet been started.")), list(makeKeyword("STARTED"), makeString("Processing has been started.")), list(makeKeyword("RUNNING"), makeString("Processing is underway.")), list(makeKeyword("FINISHED"), makeString("Processing has been completed.")), list(makeKeyword("STOPPED"), makeString("Processing was halted before completion.")));

    static private final SubLString $str_alt140$self_location_search_____cb_uiat_ = makeString("self.location.search = '?cb-uiat-thinking-progress&~A';");

    private static final SubLSymbol $UNKNOWN_TERM = makeKeyword("UNKNOWN-TERM");

    static private final SubLList $list_alt142 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-UNKNOWN-TERM-RENDER-REQUEST"));

    static private final SubLList $list_alt143 = list(makeSymbol("&KEY"), makeSymbol("PHRASE"), makeSymbol("NL-TAGS"), makeSymbol("CONTEXT"), makeSymbol("SUPPRESSORS"), makeSymbol("ISA-CONSTRAINTS"), makeSymbol("GENLS-CONSTRAINTS"));

    static private final SubLList $list_alt144 = list(makeKeyword("PHRASE"), makeKeyword("NL-TAGS"), makeKeyword("CONTEXT"), makeKeyword("SUPPRESSORS"), makeKeyword("ISA-CONSTRAINTS"), makeKeyword("GENLS-CONSTRAINTS"));



    private static final SubLSymbol $NL_TAGS = makeKeyword("NL-TAGS");



    private static final SubLSymbol $SUPPRESSORS = makeKeyword("SUPPRESSORS");





    static private final SubLString $$$I_do_not_know_what = makeString("I do not know what");

    static private final SubLString $str_alt152$means_in_this_context_ = makeString("means in this context.");

    static private final SubLString $str_alt153$From_context__it_would_have_to_be = makeString("From context, it would have to be the case that: ");

    static private final SubLString $str_alt154$Would_you_like_me_to_create_it_as = makeString("Would you like me to create it as such, or would you prefer to enter the\ndefining information yourself?");

    static private final SubLList $list_alt155 = list(list(makeKeyword("AUTO-CREATE"), makeString("auto"), makeString("[Yes, create automatically]")), list(makeKeyword("MANUAL-CREATE"), makeString("manual"), makeString("[Create manually]")));

    static private final SubLList $list_alt156 = list(list(makeKeyword("NOW"), makeString("manual"), makeString("[Describe now]")));

    static private final SubLList $list_alt157 = list(list($FIND, makeString("find"), makeString("[Search KB]")), list(makeKeyword("LATER"), makeString("later"), makeString("[Describe later]")), list(makeKeyword("FORGET-IT"), makeString("reject"), makeString("[Forget it]")));

    static private final SubLList $list_alt158 = cons(makeSymbol("KEY"), makeSymbol("TEXT"));

    static private final SubLList $list_alt159 = list(makeSymbol("VALUE"), makeSymbol("LABEL"));

    private static final SubLSymbol $UIA_UNKNOWN_TERM_HANDLER = makeKeyword("UIA-UNKNOWN-TERM-HANDLER");

    static private final SubLList $list_alt161 = list(makeSymbol("INTERACTION"), makeSymbol("ANSWER"));

    static private final SubLList $list_alt162 = list(makeSymbol("PHRASE"), makeSymbol("&REST"), makeSymbol("SKIP"));

    static private final SubLString $$$reject = makeString("reject");



    static private final SubLString $$$auto = makeString("auto");

    private static final SubLSymbol $AUTO_CREATE = makeKeyword("AUTO-CREATE");



    static private final SubLString $$$later = makeString("later");





    static private final SubLString $$$manual = makeString("manual");

    static private final SubLString $$$find = makeString("find");



    private static final SubLSymbol CB_UIAT_UNKNOWN_TERM_HANDLER = makeSymbol("CB-UIAT-UNKNOWN-TERM-HANDLER");

    static private final SubLString $str_alt175$cb_uiat_unknown_term_handler = makeString("cb-uiat-unknown-term-handler");

    private static final SubLSymbol CB_LINK_UIA_UNKNOWN_TERM_HANDLER = makeSymbol("CB-LINK-UIA-UNKNOWN-TERM-HANDLER");

    private static final SubLSymbol $DISAMBIGUATE_PHRASE = makeKeyword("DISAMBIGUATE-PHRASE");

    static private final SubLList $list_alt178 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-DISAMBIGUATE-PHRASE-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycPhraseDisambiguator")));

    static private final SubLList $list_alt179 = list(makeSymbol("&KEY"), makeSymbol("PHRASE"), makeSymbol("CANDIDATE-TERMS"), makeSymbol("REJECTED-TERMS"), makeSymbol("TERM-INFO-TABLE"), makeSymbol("SHOW-CLARIFY-LINKS"), makeSymbol("SHOW-COMPARISON-LINKS"));

    static private final SubLList $list_alt180 = list(makeKeyword("PHRASE"), makeKeyword("CANDIDATE-TERMS"), makeKeyword("REJECTED-TERMS"), makeKeyword("TERM-INFO-TABLE"), makeKeyword("SHOW-CLARIFY-LINKS"), makeKeyword("SHOW-COMPARISON-LINKS"));



    private static final SubLSymbol $REJECTED_TERMS = makeKeyword("REJECTED-TERMS");

    private static final SubLSymbol $TERM_INFO_TABLE = makeKeyword("TERM-INFO-TABLE");

    private static final SubLSymbol $SHOW_CLARIFY_LINKS = makeKeyword("SHOW-CLARIFY-LINKS");

    private static final SubLSymbol $SHOW_COMPARISON_LINKS = makeKeyword("SHOW-COMPARISON-LINKS");

    static private final SubLString $str_alt186$What_was_meant_by__S_ = makeString("What was meant by ~S?");

    private static final SubLSymbol $UIA_DISAMBIGUATE_PHRASE_HANDLER = makeKeyword("UIA-DISAMBIGUATE-PHRASE-HANDLER");

    static private final SubLString $str_alt188$phrase_meanings = makeString("phrase_meanings");

    static private final SubLString $str_alt189$text_css = makeString("text/css");

    static private final SubLString $$$screen = makeString("screen");

    static private final SubLString $$$none = makeString("none");

    static private final SubLString $$$Less_Likely_Meanings = makeString("Less Likely Meanings");



    static private final SubLString $str_alt194$_Select_ = makeString("[Select]");

    static private final SubLString $$$new = makeString("new");

    static private final SubLString $str_alt196$_Click_here_to_add_a_new_meaning_ = makeString("[Click here to add a new meaning for ~S]");

    static private final SubLString $str_alt197$_Click_here_to_skip_this_phrase__ = makeString("[Click here to skip this phrase, possibly dooming the parse.]");

    static private final SubLString $str_alt198$_Visualize_Candidates_ = makeString("[Visualize Candidates]");

    static private final SubLString $str_alt199$_Visualize_Candidate_ = makeString("[Visualize Candidate]");

    private static final SubLSymbol $UIA_BLUE_CONCEPT_COMPARATOR_EVENT = makeKeyword("UIA-BLUE-CONCEPT-COMPARATOR-EVENT");

    static private final SubLList $list_alt201 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")));



    static private final SubLString $str_alt203$_Compare__S_and__S_ = makeString("[Compare ~S and ~S]");

    static private final SubLString $$$comparisons = makeString("comparisons");

    static private final SubLString $$$More_Comparisons = makeString("More Comparisons");





    static private final SubLList $list_alt208 = list(makeSymbol("PHRASE"), makeSymbol("TYPE"), makeSymbol("TYPE-PHRASE"), makeSymbol("&OPTIONAL"), makeSymbol("IMAGE"));

    static private final SubLList $list_alt209 = list(makeKeyword("DECLARATIVE"));

    private static final SubLSymbol $UIA_DISAMBIGUATE_PHRASE_SIMILAR_HANDLER = makeKeyword("UIA-DISAMBIGUATE-PHRASE-SIMILAR-HANDLER");

    static private final SubLString $str_alt211$_Edit_ = makeString("[Edit]");



    static private final SubLList $list_alt213 = list(makeKeyword("QUESTION"), makeKeyword("INTERROGATIVE"));

    public static final SubLObject $$Individual = constant_handles.reader_make_constant_shell(makeString("Individual"));

    static private final SubLString $str_alt215$Clarified_a_term_with_too_general = makeString("Clarified a term with too general a type");

    static private final SubLString $str_alt216$While_showing_meaning_for_a_phras = makeString("While showing meaning for a phrase ~S (~A) was shown with the clarifying phase ~S (~A), which is too general.");







    static private final SubLString $$$Meaning = makeString("Meaning");



    static private final SubLString $$$Image = makeString("Image");

    static private final SubLString $$$Category = makeString("Category");

    static private final SubLList $list_alt224 = list(makeSymbol("INTERACTION"), makeSymbol("CHOICE"));

    static private final SubLList $list_alt225 = list(makeSymbol("PHRASE"));

    private static final SubLSymbol $CHOSEN_TERM = makeKeyword("CHOSEN-TERM");







    private static final SubLSymbol $REJECTS = makeKeyword("REJECTS");

    private static final SubLSymbol CB_UIAT_DISAMBIGUATE_PHRASE_HANDLER = makeSymbol("CB-UIAT-DISAMBIGUATE-PHRASE-HANDLER");

    static private final SubLString $str_alt232$cb_uiat_disambiguate_phrase_handl = makeString("cb-uiat-disambiguate-phrase-handler");

    private static final SubLSymbol CB_LINK_UIA_DISAMBIGUATE_PHRASE_HANDLER = makeSymbol("CB-LINK-UIA-DISAMBIGUATE-PHRASE-HANDLER");

    private static final SubLSymbol $MAKE_SIMILAR = makeKeyword("MAKE-SIMILAR");

    private static final SubLSymbol CB_UIAT_DISAMBIGUATE_PHRASE_SIMILAR_HANDLER = makeSymbol("CB-UIAT-DISAMBIGUATE-PHRASE-SIMILAR-HANDLER");

    static private final SubLString $str_alt236$cb_uiat_disambiguate_phrase_simil = makeString("cb-uiat-disambiguate-phrase-similar-handler");

    private static final SubLSymbol CB_LINK_UIA_DISAMBIGUATE_PHRASE_SIMILAR_HANDLER = makeSymbol("CB-LINK-UIA-DISAMBIGUATE-PHRASE-SIMILAR-HANDLER");

    private static final SubLSymbol $CONCEPT_FINDER = makeKeyword("CONCEPT-FINDER");

    static private final SubLList $list_alt239 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-CONCEPT-FINDER-RENDER-REQUEST"));

    static private final SubLList $list_alt240 = list(makeSymbol("&KEY"), makeSymbol("NUSKETCH"));

    static private final SubLList $list_alt241 = list(makeKeyword("NUSKETCH"));

    private static final SubLSymbol $NUSKETCH = makeKeyword("NUSKETCH");

    static private final SubLString $str_alt243$cb_uiat_concept_finder_handler = makeString("cb-uiat-concept-finder-handler");

    static private final SubLString $str_alt244$Find_the_desired_concept_by_any_o = makeString("Find the desired concept by any of the following methods:");

    static private final SubLString $str_alt245$Enter_a_phrase_that_denotes_the_c = makeString("Enter a phrase that denotes the concept:");

    static private final SubLString $$$Find = makeString("Find");

    static private final SubLString $str_alt247$find_by_phrase = makeString("find-by-phrase");

    static private final SubLString $str_alt248$find_phrase = makeString("find-phrase");

    private static final SubLSymbol $UIA_KNOWLEDGE_SCRAPBOOK_LAUNCH = makeKeyword("UIA-KNOWLEDGE-SCRAPBOOK-LAUNCH");

    static private final SubLString $str_alt250$_Paste_from_Scrapbook_ = makeString("[Paste from Scrapbook]");

    private static final SubLSymbol $UIA_DOMAIN_EXAMPLES_LAUNCH = makeKeyword("UIA-DOMAIN-EXAMPLES-LAUNCH");

    static private final SubLString $str_alt252$_Paste_from_Examples_ = makeString("[Paste from Examples]");

    private static final SubLSymbol $UIA_ONTOLOGY_BROWSER_START = makeKeyword("UIA-ONTOLOGY-BROWSER-START");

    static private final SubLString $str_alt254$_Browse_Ontology_ = makeString("[Browse Ontology]");

    private static final SubLSymbol $UIA_WAIT_FOR_NUSKETCH_SELECTION = makeKeyword("UIA-WAIT-FOR-NUSKETCH-SELECTION");

    static private final SubLString $str_alt256$_Get_from_Sketch_ = makeString("[Get from Sketch]");

    static private final SubLString $str_alt257$Or__use_any_of_the_other_Browsing = makeString("Or, use any of the other Browsing tools to find the concept.");

    static private final SubLList $list_alt258 = list(makeSymbol("INTERACTION"));

    private static final SubLSymbol $WAIT_FOR_NUSKETCH = makeKeyword("WAIT-FOR-NUSKETCH");

    private static final SubLSymbol CB_UIA_WAIT_FOR_NUSKETCH = makeSymbol("CB-UIA-WAIT-FOR-NUSKETCH");

    static private final SubLString $str_alt261$cb_uia_wait_for_nusketch = makeString("cb-uia-wait-for-nusketch");

    private static final SubLSymbol CB_LINK_UIA_WAIT_FOR_NUSKETCH_SELECTION = makeSymbol("CB-LINK-UIA-WAIT-FOR-NUSKETCH-SELECTION");

    private static final SubLSymbol $CONCEPT_DISAMBIGUATOR = makeKeyword("CONCEPT-DISAMBIGUATOR");

    private static final SubLSymbol CB_UIAT_CONCEPT_FINDER_HANDLER = makeSymbol("CB-UIAT-CONCEPT-FINDER-HANDLER");

    static private final SubLString $str_alt265$cb_uia_concept_finder_catch = makeString("cb-uia-concept-finder-catch");

    private static final SubLSymbol $UIA_CONCEPT_FINDER_THROW = makeKeyword("UIA-CONCEPT-FINDER-THROW");

    private static final SubLSymbol CB_LINK_UIA_CONCEPT_FINDER_THROW = makeSymbol("CB-LINK-UIA-CONCEPT-FINDER-THROW");

    static private final SubLList $list_alt268 = list(makeSymbol("TERM"));

    private static final SubLSymbol $CATCH = makeKeyword("CATCH");



    private static final SubLSymbol CB_UIA_CONCEPT_FINDER_CATCH = makeSymbol("CB-UIA-CONCEPT-FINDER-CATCH");

    static private final SubLString $str_alt272$cb_uia_concept_finder_launch = makeString("cb-uia-concept-finder-launch");

    private static final SubLSymbol $UIA_CONCEPT_FINDER = makeKeyword("UIA-CONCEPT-FINDER");

    private static final SubLSymbol CB_LINK_UIA_CONCEPT_FINDER = makeSymbol("CB-LINK-UIA-CONCEPT-FINDER");

    private static final SubLSymbol $LAUNCH = makeKeyword("LAUNCH");

    private static final SubLSymbol CB_UIA_CONCEPT_FINDER_LAUNCH = makeSymbol("CB-UIA-CONCEPT-FINDER-LAUNCH");

    private static final SubLSymbol $SENTENCE_FINDER = makeKeyword("SENTENCE-FINDER");

    static private final SubLList $list_alt278 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-SENTENCE-FINDER-RENDER-REQUEST"));

    static private final SubLString $str_alt279$cb_uiat_sentence_finder_handler = makeString("cb-uiat-sentence-finder-handler");

    static private final SubLString $str_alt280$Find_the_desired_sentence_by_any_ = makeString("Find the desired sentence by any of the following methods:");

    static private final SubLString $str_alt281$Type_in_a_sentence_ = makeString("Type in a sentence:");

    static private final SubLString $str_alt282$find_by_text = makeString("find-by-text");

    static private final SubLString $str_alt283$find_text = makeString("find-text");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $$$virtual = makeString("virtual");

    private static final SubLSymbol $UIA_KNOWLEDGE_REVIEWER_LAUNCH = makeKeyword("UIA-KNOWLEDGE-REVIEWER-LAUNCH");

    static private final SubLString $str_alt287$_Paste_from_this_Conversation_ = makeString("[Paste from this Conversation]");

    static private final SubLString $str_alt288$Or__use_any_of_the_other_Browsing = makeString("Or, use any of the other Browsing tools to find the sentence.");

    private static final SubLSymbol $SENTENCE_READER = makeKeyword("SENTENCE-READER");

    private static final SubLSymbol CB_UIAT_SENTENCE_FINDER_HANDLER = makeSymbol("CB-UIAT-SENTENCE-FINDER-HANDLER");

    static private final SubLString $str_alt291$cb_uia_sentence_finder_catch = makeString("cb-uia-sentence-finder-catch");

    private static final SubLSymbol $UIA_SENTENCE_FINDER_THROW = makeKeyword("UIA-SENTENCE-FINDER-THROW");

    private static final SubLSymbol CB_LINK_UIA_SENTENCE_FINDER_THROW = makeSymbol("CB-LINK-UIA-SENTENCE-FINDER-THROW");

    static private final SubLList $list_alt294 = list(makeSymbol("SENTENCE"));

    private static final SubLSymbol CB_UIA_SENTENCE_FINDER_CATCH = makeSymbol("CB-UIA-SENTENCE-FINDER-CATCH");

    private static final SubLSymbol $FILE_BROWSER = makeKeyword("FILE-BROWSER");

    static private final SubLList $list_alt297 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-FILE-BROWSER-RENDER-REQUEST"));

    static private final SubLList $list_alt298 = list(makeSymbol("&KEY"), makeSymbol("DIRECTORY"), makeSymbol("TYPE"), makeSymbol("DIRS"), makeSymbol("FILES"), makeSymbol("HAS-PARENT?"));

    static private final SubLList $list_alt299 = list(makeKeyword("DIRECTORY"), $TYPE, $DIRS, makeKeyword("FILES"), makeKeyword("HAS-PARENT?"));





    private static final SubLSymbol $FILES = makeKeyword("FILES");

    public static final SubLSymbol $kw304$HAS_PARENT_ = makeKeyword("HAS-PARENT?");

    static private final SubLString $str_alt305$cb_uia_fb_file_entered = makeString("cb-uia-fb-file-entered");

    static private final SubLString $str_alt306$Directory_of__A__ = makeString("Directory of ~A~%");

    static private final SubLString $str_alt307$Specify_different_directory__ = makeString("Specify different directory: ");

    static private final SubLString $str_alt308$curr_dir = makeString("curr-dir");

    static private final SubLString $$$Change_Dir = makeString("Change Dir");

    static private final SubLString $$$chdir = makeString("chdir");

    static private final SubLString $str_alt311$new_directory_name = makeString("new-directory-name");

    static private final SubLString $str_alt312$Select_file_to__A___ = makeString("Select file to ~A:~%");


    static private final SubLString $$$load = makeString("load");

    static private final SubLString $$$save_or_enter_one = makeString("save or enter one");



    static private final SubLString $$$Save = makeString("Save");

    static private final SubLString $$$save = makeString("save");

    static private final SubLString $str_alt319$save_file_name = makeString("save-file-name");

    static private final SubLString $str_alt320$__ = makeString("..");

    static private final SubLString $str_alt321$_Parent_ = makeString("[Parent]");

    static private final SubLList $list_alt322 = list(makeSymbol("INTERACTION"), makeSymbol("PATH"), makeSymbol("FILE"));

    private static final SubLSymbol $FILE_CHOICE = makeKeyword("FILE-CHOICE");



    private static final SubLSymbol CB_UIAT_FB_FILELINK_HANDLER = makeSymbol("CB-UIAT-FB-FILELINK-HANDLER");

    static private final SubLList $list_alt326 = list(makeSymbol("INTERACTION"), makeSymbol("PATH"), makeSymbol("DIR"));

    private static final SubLSymbol $DIR_CHOICE = makeKeyword("DIR-CHOICE");

    private static final SubLSymbol CB_UIAT_FB_DIRLINK_HANDLER = makeSymbol("CB-UIAT-FB-DIRLINK-HANDLER");

    private static final SubLSymbol CB_UIA_FB_FILE_ENTERED = makeSymbol("CB-UIA-FB-FILE-ENTERED");

    static private final SubLString $str_alt330$cb_uiat_fb_filelink_handler = makeString("cb-uiat-fb-filelink-handler");

    private static final SubLSymbol $CB_UIA_FB_FILELINK = makeKeyword("CB-UIA-FB-FILELINK");

    private static final SubLSymbol CB_LINK_CB_UIA_FB_FILELINK = makeSymbol("CB-LINK-CB-UIA-FB-FILELINK");

    static private final SubLString $str_alt333$cb_uiat_fb_dirlink_handler = makeString("cb-uiat-fb-dirlink-handler");

    private static final SubLSymbol $CB_UIA_FB_DIRLINK = makeKeyword("CB-UIA-FB-DIRLINK");

    private static final SubLSymbol CB_LINK_CB_UIA_FB_DIRLINK = makeSymbol("CB-LINK-CB-UIA-FB-DIRLINK");

    private static final SubLSymbol $SENTENCE_CLONER = makeKeyword("SENTENCE-CLONER");

    static private final SubLList $list_alt337 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-SENTENCE-CLONER-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSentenceCloner")));

    static private final SubLList $list_alt338 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("ORIGINAL-SENTENCE"), makeSymbol("MODIFIED-SENTENCE"), makeSymbol("CLONE-TYPE"), makeSymbol("HEADER-STRING"), makeSymbol("BUTTON-TEXT"), makeSymbol("INDEXICAL-STRINGS"), makeSymbol("EDITABLE-ARG-INFO"), makeSymbol("SENTENCE-PARAPHRASE") });

    static private final SubLList $list_alt339 = list(makeKeyword("ORIGINAL-SENTENCE"), makeKeyword("MODIFIED-SENTENCE"), makeKeyword("CLONE-TYPE"), makeKeyword("HEADER-STRING"), makeKeyword("BUTTON-TEXT"), makeKeyword("INDEXICAL-STRINGS"), makeKeyword("EDITABLE-ARG-INFO"), makeKeyword("SENTENCE-PARAPHRASE"));



    private static final SubLSymbol $MODIFIED_SENTENCE = makeKeyword("MODIFIED-SENTENCE");

    private static final SubLSymbol $CLONE_TYPE = makeKeyword("CLONE-TYPE");

    private static final SubLSymbol $HEADER_STRING = makeKeyword("HEADER-STRING");

    private static final SubLSymbol $BUTTON_TEXT = makeKeyword("BUTTON-TEXT");

    private static final SubLSymbol $INDEXICAL_STRINGS = makeKeyword("INDEXICAL-STRINGS");

    private static final SubLSymbol $EDITABLE_ARG_INFO = makeKeyword("EDITABLE-ARG-INFO");

    private static final SubLSymbol $SENTENCE_PARAPHRASE = makeKeyword("SENTENCE-PARAPHRASE");

    static private final SubLList $list_alt348 = list(constant_handles.reader_make_constant_shell(makeString("SomeExampleFn")), constant_handles.reader_make_constant_shell(makeString("SomeExampleSpecFn")));

    static private final SubLString $str_alt349$cb_uiat_sentence_cloner_handler = makeString("cb-uiat-sentence-cloner-handler");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $str_alt351$clone_type = makeString("clone-type");

    static private final SubLString $str_alt352$argpos_list = makeString("argpos-list");

    static private final SubLString $str_alt353$The_following_General_Terms_are_a = makeString("The following General Terms are available:");

    static private final SubLString $$$Original_Term = makeString("Original Term");

    static private final SubLString $$$New_Term = makeString("New Term");

    static private final SubLList $list_alt356 = list(makeSymbol("TYPE"), makeSymbol("ARG-POSITION"), makeSymbol("OLD-ARG-PARAPHRASE"));

    private static final SubLSymbol $CLEARED_ARG_POSITIONS = makeKeyword("CLEARED-ARG-POSITIONS");

    static private final SubLString $str_alt358$_NEW_TERM = makeString("<NEW TERM");





    static private final SubLString $str_alt361$__ = makeString("**");

    static private final SubLString $$$default = makeString("default");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $str_alt364$___Although_it_is_possible_to_cha = makeString("** Although it is possible to change the relationship that is being talked about, and just keep the basic skeleton of the sentence the same, this is not recommended, since the meaning of the overall sentence could change in unpredictable ways. You may want to search for a sentence that uses the predicate you want, and use the variations to adjust the skeleton of the sentence.");

    static private final SubLString $$$clone = makeString("clone");

    static private final SubLString $str_alt366$Negated_ = makeString("Negated ");

    static private final SubLString $str_alt367$negated_clone = makeString("negated-clone");

    static private final SubLString $$$Forget_it = makeString("Forget it");

    static private final SubLString $$$abort = makeString("abort");

    static private final SubLString $$$Query_Cloner = makeString("Query Cloner");

    static private final SubLString $$$Sentence_Cloner = makeString("Sentence Cloner");

    private static final SubLSymbol CB_UIAT_SENTENCE_CLONER_GKE_SUBMIT_HANDLER = makeSymbol("CB-UIAT-SENTENCE-CLONER-GKE-SUBMIT-HANDLER");

    public static final SubLSymbol $kw373$IS_QUESTION_ = makeKeyword("IS-QUESTION?");



    private static final SubLSymbol $EDITABLE_ARG_POSITIONS = makeKeyword("EDITABLE-ARG-POSITIONS");







    static private final SubLString $$$formula = makeString("formula");





    private static final SubLSymbol $FORMULA_ANSWER = makeKeyword("FORMULA-ANSWER");

    static private final SubLString $$$question = makeString("question");



    private static final SubLSymbol $ARG_POSITION_PHRASE_PAIRS = makeKeyword("ARG-POSITION-PHRASE-PAIRS");

    private static final SubLSymbol $NEGATED = makeKeyword("NEGATED");



    private static final SubLSymbol CB_UIAT_SENTENCE_CLONER_HANDLER = makeSymbol("CB-UIAT-SENTENCE-CLONER-HANDLER");

    static private final SubLString $str_alt389$cb_uia_similar_sentence_launch = makeString("cb-uia-similar-sentence-launch");

    private static final SubLSymbol $UIA_SIMILAR_SENTENCE = makeKeyword("UIA-SIMILAR-SENTENCE");

    private static final SubLSymbol CB_LINK_UIA_SIMILAR_SENTENCE = makeSymbol("CB-LINK-UIA-SIMILAR-SENTENCE");

    static private final SubLList $list_alt392 = list(makeSymbol("CYCL-SENTENCE"));

    private static final SubLSymbol $SIMILAR_SENTENCE = makeKeyword("SIMILAR-SENTENCE");

    private static final SubLSymbol CB_UIA_SIMILAR_SENTENCE_LAUNCH = makeSymbol("CB-UIA-SIMILAR-SENTENCE-LAUNCH");

    static private final SubLString $str_alt395$cb_uia_similar_assertion_launch = makeString("cb-uia-similar-assertion-launch");

    private static final SubLSymbol $UIA_SIMILAR_ASSERTION = makeKeyword("UIA-SIMILAR-ASSERTION");

    private static final SubLSymbol CB_LINK_UIA_SIMILAR_ASSERTION = makeSymbol("CB-LINK-UIA-SIMILAR-ASSERTION");

    private static final SubLSymbol $SIMILAR_ASSERTION = makeKeyword("SIMILAR-ASSERTION");

    private static final SubLSymbol CB_UIA_SIMILAR_ASSERTION_LAUNCH = makeSymbol("CB-UIA-SIMILAR-ASSERTION-LAUNCH");

    static private final SubLString $str_alt400$cb_uia_similar_question_launch = makeString("cb-uia-similar-question-launch");

    private static final SubLSymbol $UIA_SIMILAR_QUESTION = makeKeyword("UIA-SIMILAR-QUESTION");

    private static final SubLSymbol CB_LINK_UIA_SIMILAR_QUESTION = makeSymbol("CB-LINK-UIA-SIMILAR-QUESTION");

    private static final SubLSymbol $SIMILAR_QUESTION = makeKeyword("SIMILAR-QUESTION");

    private static final SubLSymbol CB_UIA_SIMILAR_QUESTION_LAUNCH = makeSymbol("CB-UIA-SIMILAR-QUESTION-LAUNCH");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cb_uia_tools_basic_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_uia_tools_basic_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_uia_tools_basic_file();
    }
}

