/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
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
 *  module:      CB-UIA-TOOLS-SALIENT-DESCRIPTOR
 *  source file: /cyc/top/cycl/cb-uia-tools-salient-descriptor.lisp
 *  created:     2019/07/03 17:38:11
 */
public final class cb_uia_tools_salient_descriptor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_tools_salient_descriptor() {
    }

    public static final SubLFile me = new cb_uia_tools_salient_descriptor();


    // // Definitions
    public static final SubLObject cb_uiat_salient_descriptor_render_request(SubLObject request) {
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
                if (pcase_var.eql($DISPLAY_PROMPT)) {
                    return cb_uiat_salient_descriptor_display_prompt(interaction, plist);
                } else
                    if (pcase_var.eql($YUCK)) {
                        return cb_uiat_salient_descriptor_yucky_guts(interaction);
                    } else
                        if (pcase_var.eql($LET_USER_CHOOSE_PROMPT)) {
                            return cb_uiat_salient_descriptor_get_next_prompt_from_user(interaction);
                        } else
                            if (pcase_var.eql($DISPLAY_FACETS)) {
                                return cb_uiat_salient_descriptor_display_facets(interaction);
                            } else {
                                return NIL;
                            }



            }
        }
    }

    /**
     * Display a single SD prompt.
     */
    public static final SubLObject cb_uiat_salient_descriptor_display_prompt(SubLObject interaction, SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject prompt = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT, UNPROVIDED);
                SubLObject displayedP = NIL;
                if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt)) {
                    {
                        SubLObject datum = plist;
                        SubLObject current = datum;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt8);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt8);
                            if (NIL == member(current_1, $list_alt9, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt8);
                        }
                        {
                            SubLObject single_entryP_tail = property_list_member($kw11$SINGLE_ENTRY_, current);
                            SubLObject single_entryP = (NIL != single_entryP_tail) ? ((SubLObject) (cadr(single_entryP_tail))) : NIL;
                            SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                            SubLObject prompt_formula = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_formula(prompt);
                            SubLObject couldnt_displayP = NIL;
                            uia_tools_salient_descriptor.uiat_salient_descriptor_potentially_highlight_all_entities(v_agenda, v_term, prompt_formula);
                            thread.resetMultipleValues();
                            {
                                SubLObject _prev_bind_0 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                    {
                                        SubLObject reuseP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        try {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject _prev_bind_0_2 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                    {
                                                        SubLObject new_or_reused = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject _prev_bind_0_3 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                            try {
                                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                {
                                                                    SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_4 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                        try {
                                                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                                                            {
                                                                                final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                                                                try {
                                                                                    {
                                                                                        SubLObject pcase_var = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_type(prompt);
                                                                                        if (pcase_var.eql($CONFIRM)) {
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
                                                                                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        html_macros.$within_html_form$.bind(T, thread);
                                                                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                                                        html_utilities.html_hidden_input($str_alt15$cb_uiat_salient_descriptor_confir, T, UNPROVIDED);
                                                                                                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                                                                                                        cb_salient_descriptor_guts_header(v_term, interaction);
                                                                                                        html_utilities.html_newline(UNPROVIDED);
                                                                                                        cb_salient_descriptor_confirm_guts(interaction, prompt, single_entryP);
                                                                                                        html_utilities.html_newline(UNPROVIDED);
                                                                                                        cb_salient_descriptor_show_justification(interaction);
                                                                                                        cb_salient_descriptor_maybe_show_prompt_from_user_guts(interaction);
                                                                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                                                    } finally {
                                                                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                                                            }
                                                                                            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                                                                                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                            uia_tools_salient_descriptor.ui_salient_descriptor_note_idle(interaction);
                                                                                        } else
                                                                                            if (pcase_var.eql($CHOICE)) {
                                                                                                {
                                                                                                    SubLObject choices = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_choices(prompt);
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
                                                                                                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                                                                html_utilities.html_hidden_input($str_alt18$cb_uiat_salient_descriptor_choice, T, UNPROVIDED);
                                                                                                                html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                                                                                                                cb_salient_descriptor_guts_header(v_term, interaction);
                                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                                                cb_salient_descriptor_choice_guts(interaction, choices, prompt_formula, single_entryP);
                                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                                                cb_salient_descriptor_show_justification(interaction);
                                                                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                                                            } finally {
                                                                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                                                                    }
                                                                                                    cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                                                                                                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                }
                                                                                                uia_tools_salient_descriptor.ui_salient_descriptor_note_idle(interaction);
                                                                                            } else
                                                                                                if (pcase_var.eql($SPECIFY)) {
                                                                                                    {
                                                                                                        SubLObject count = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_term_count(prompt);
                                                                                                        user_interaction_agenda.ui_state_update(interaction, $NUM_TERMS_TO_SPECIFY, count);
                                                                                                    }
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
                                                                                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                                                                html_utilities.html_hidden_input($str_alt21$cb_uiat_salient_descriptor_specif, T, UNPROVIDED);
                                                                                                                html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                                                                                                                cb_salient_descriptor_guts_header(v_term, interaction);
                                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                                                cb_salient_descriptor_specify_guts(interaction, prompt, single_entryP);
                                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                                                cb_salient_descriptor_show_justification(interaction);
                                                                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                                                            } finally {
                                                                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                                                                    }
                                                                                                    cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                                                                                                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                    uia_tools_salient_descriptor.ui_salient_descriptor_note_idle(interaction);
                                                                                                } else {
                                                                                                    couldnt_displayP = T;
                                                                                                }


                                                                                    }
                                                                                } finally {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                            }
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_4, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_3, thread);
                                                            }
                                                        }
                                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                        }
                                                    }
                                                } finally {
                                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (NIL == reuseP) {
                                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL == couldnt_displayP) {
                                displayedP = T;
                            }
                        }
                    }
                }
                return NIL != displayedP ? ((SubLObject) (NIL)) : cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    /**
     * Let the user choose among facets to interview on first.
     */
    public static final SubLObject cb_uiat_salient_descriptor_display_facets(SubLObject interaction) {
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
                        html_utilities.html_hidden_input($str_alt23$cb_uiat_salient_descriptor_facet_, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        {
                            SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, NIL);
                            SubLObject v_facets = user_interaction_agenda.ui_state_lookup(interaction, $TERM_FACETS, NIL);
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                            SubLObject term_phrase = (NIL != v_term) ? ((SubLObject) (uia_trampolines.uia_html_term_phrase_np(v_agenda, v_term, UNPROVIDED, UNPROVIDED))) : $$$your_term;
                            SubLObject submit_label = $$$Submit;
                            SubLObject skip_all_label = $$$Skip_All;
                            html_utilities.html_hidden_input($str_alt28$facet_count, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, length(v_facets)), UNPROVIDED);
                            html_utilities.html_newline(UNPROVIDED);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt29$Before_refining__A_more_generally, term_phrase);
                            html_utilities.html_newline(TWO_INTEGER);
                            html_utilities.html_princ($str_alt30$Please_deselect_any_that_you_woul);
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
                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject list_var = NIL;
                                        SubLObject facet = NIL;
                                        SubLObject index = NIL;
                                        for (list_var = v_facets, facet = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , facet = list_var.first() , index = add(ONE_INTEGER, index)) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject v_agenda_13 = user_interaction_agenda.ui_agenda(interaction);
                                                                SubLObject base_fieldname = cb_sd_basic_term_selection_field_name(index);
                                                                SubLObject encoded = html_utilities.get_encoded_form_field_name(base_fieldname);
                                                                html_utilities.html_checkbox_input(encoded, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda_13, facet), T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_uia_display_primitives.cb_uia_show_term(facet, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_submit_input(submit_label, $$$submit, UNPROVIDED);
                            html_utilities.html_indent(UNPROVIDED);
                            html_utilities.html_submit_input(skip_all_label, $str_alt34$skip_all, UNPROVIDED);
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
            return interaction;
        }
    }

    public static final SubLObject cb_salient_descriptor_show_justification(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != uia_tools_salient_descriptor.uiat_salient_descriptor_has_justification_p(interaction)) {
                {
                    SubLObject object_id = $$$justification;
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt36$text_css);
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
                    dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$Why_I_asked);
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
                            cb_uiat_salient_descriptor_show_justification(interaction);
                            if (NIL == uia_tools_salient_descriptor.show_salient_descriptor_tacticsP()) {
                                {
                                    SubLObject tactic_string = uia_tools_salient_descriptor.cb_salient_descriptor_tactic_string(interaction);
                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(ZERO_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt42$100_);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
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
                                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt43$Prompt_tactic___A, tactic_string);
                                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
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
            return interaction;
        }
    }

    public static final SubLObject cb_salient_descriptor_maybe_show_prompt_from_user_guts(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != uia_tools_salient_descriptor.uiat_salient_descriptor_has_unused_prompts_p(interaction)) {
                html_utilities.html_newline(UNPROVIDED);
                {
                    SubLObject object_id = $str_alt44$more_questions;
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt36$text_css);
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
                    dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$Select_a_new_question);
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
                            cb_uiat_salient_descriptor_prompt_from_user_guts(interaction);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return interaction;
        }
    }

    /**
     * Display a page allowing the user to choose which prompt to work on next.
     *
     * @unknown - Assumes INTERACTION has a prompter with more than one unused prompt.
     */
    public static final SubLObject cb_uiat_salient_descriptor_get_next_prompt_from_user(SubLObject interaction) {
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
                        html_utilities.html_hidden_input($str_alt46$cb_uiat_salient_descriptor_get_ne, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        {
                            SubLObject tactic_string = uia_tools_salient_descriptor.uiat_salient_descriptor_current_tactic_string(interaction);
                            if (NIL != uia_tools_salient_descriptor.show_salient_descriptor_tacticsP()) {
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt43$Prompt_tactic___A, tactic_string);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            html_utilities.html_newline(TWO_INTEGER);
                            html_utilities.html_submit_input($$$End_Interview, $str_alt48$end_interview, UNPROVIDED);
                            html_utilities.html_indent(TWO_INTEGER);
                            if (NIL != uia_tools_salient_descriptor.show_salient_descriptor_tacticsP()) {
                                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                html_utilities.html_submit_input($$$Skip_Tactic, $str_alt50$skip_tactic, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            }
                        }
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ($str_alt51$Please_select_the_interview_quest);
                        html_utilities.html_newline(UNPROVIDED);
                        cb_uiat_salient_descriptor_prompt_from_user_guts(interaction);
                        html_utilities.html_submit_input($$$Skip_All_of_These, $str_alt53$skip_all, UNPROVIDED);
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

    public static final SubLObject cb_uiat_salient_descriptor_prompt_from_user_guts(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unused_prompt_list = user_interaction_agenda.ui_state_lookup(interaction, $UNUSED_PROMPTS, UNPROVIDED);
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = unused_prompt_list;
                            SubLObject prompt = NIL;
                            for (prompt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , prompt = cdolist_list_var.first()) {
                                if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt)) {
                                    {
                                        SubLObject prompt_id = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_id(prompt);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_utilities.cb_link($UIAT_SALIENT_DESCRIPTOR_CHOOSE_PROMPT, interaction, prompt_id, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_uiat_salient_descriptor_prompt_show_confirm_question(interaction, prompt);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            }
            return interaction;
        }
    }

    public static final SubLObject cb_link_uiat_salient_descriptor_choose_prompt(SubLObject interaction, SubLObject prompt_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject linktext = $str_alt56$_Select_;
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, prompt_id);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt58$cb_uiat_salient_descriptor_choose, arglist);
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
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_salient_descriptor_choose_prompt(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject prompt_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt60);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt60);
            prompt_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject prompt_id_string = princ_to_string(prompt_id);
                    SubLObject plist = list($CHOICE, prompt_id_string);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $CHOOSE_PROMPT, plist);
                    cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt60);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_salient_descriptor_get_next_prompt_from_user_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject reply = cb_uiat_salient_descriptor_prompt_from_user_reply(args);
            cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uiat_salient_descriptor_prompt_from_user_reply(SubLObject args) {
        {
            SubLObject reply = NIL;
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject skip_allP = html_utilities.html_extract_input($str_alt53$skip_all, args);
            SubLObject choice = cb_uiat_salient_descriptor_extract_prompt_choice(args);
            SubLObject plist = list($kw64$SKIP_ALL_, skip_allP, $CHOICE, choice);
            reply = cb_uiat_salient_descriptor_common_handler(interaction, args);
            if (NIL == reply) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $CHOOSE_PROMPT, plist);
            }
            return reply;
        }
    }

    public static final SubLObject cb_uiat_salient_descriptor_extract_prompt_choice(SubLObject args) {
        return html_utilities.extract_encoded_form_field_value($$$prompt, args);
    }

    public static final SubLObject cb_salient_descriptor_guts_header(SubLObject v_term, SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tactic_string = (NIL != uia_tools_salient_descriptor.show_salient_descriptor_tacticsP()) ? ((SubLObject) (uia_tools_salient_descriptor.cb_salient_descriptor_tactic_string(interaction))) : NIL;
                if (NIL != uia_tools_salient_descriptor.show_salient_descriptor_tacticsP()) {
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt43$Prompt_tactic___A, tactic_string);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                html_utilities.html_newline(TWO_INTEGER);
                dhtml_macros.dhtml_set_switched_visibility($str_alt66$hidden_submit, $INVISIBLE, $TEXT);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt66$hidden_submit);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_submit_input($$$End_Interview, $str_alt48$end_interview, UNPROVIDED);
                if (NIL != tactic_string) {
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_indent(TWO_INTEGER);
                    html_utilities.html_submit_input($$$Skip_Tactic, $str_alt50$skip_tactic, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (NIL != uia_tools_salient_descriptor.uiat_salient_descriptor_has_unused_prompts_p(interaction)) {
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_indent(TWO_INTEGER);
                    html_utilities.html_submit_input($$$New_Question, $str_alt68$new_question, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                html_utilities.html_newline(TWO_INTEGER);
                if ((NIL != assertion_handles.assertion_p(v_term)) && (NIL != assertions_high.rule_assertionP(v_term))) {
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                            html_utilities.html_princ($str_alt69$I_would_like_to_make_this_rule_mo);
                            html_utilities.html_newline(TWO_INTEGER);
                            cb_uia_display_primitives.cb_uia_show_assertion(v_term);
                        } finally {
                            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    html_utilities.html_princ($str_alt70$Here_is_something_you_might_want_);
                    cb_uia_display_primitives.cb_uia_show_term(v_term, UNPROVIDED);
                }
                html_utilities.html_princ($str_alt71$__);
                html_utilities.html_newline(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_salient_descriptor_confirm_guts(SubLObject interaction, SubLObject prompt, SubLObject single_entryP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                SubLObject type = (NIL != assertions_high.rule_assertionP(v_term)) ? ((SubLObject) ($RULE)) : $TERM;
                SubLObject pcase_var = type;
                if (pcase_var.eql($RULE)) {
                    html_utilities.html_princ($str_alt73$The_following_might_help_me_concl);
                } else {
                    html_utilities.html_princ($str_alt74$Please_answer_the_following_quest);
                }
                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                cb_uiat_salient_descriptor_prompt_show_confirm_question(interaction, prompt);
                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
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
                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(THREE_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
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
                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_submit_input($$$Yes, $$$yes, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_submit_input($$$No, $$$no, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        cb_salient_descriptor_dont_know_button();
                                        html_utilities.html_indent(TWO_INTEGER);
                                        cb_salient_descriptor_skip_button();
                                        html_utilities.html_indent(TWO_INTEGER);
                                        cb_salient_descriptor_yuck_button();
                                        cb_salient_descriptor_maybe_show_new_rule_button();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                cb_sd_maybe_show_precedent(interaction, prompt);
                if (TWO_INTEGER.numG(rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_term_count(prompt))) {
                    {
                        SubLObject first_subprompt = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt).first();
                        SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(first_subprompt);
                        SubLObject examples = fourth(first_subprompt);
                        SubLObject type_in_mode = $ALLOWED;
                        SubLObject submit_buttonP = T;
                        SubLObject show_hide_text = $$$Specific_Answer;
                        if (NIL != cycl_variables.el_varP(var)) {
                            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                            cb_salient_descriptor_give_some_examples(interaction, var, examples, ZERO_INTEGER, type_in_mode, single_entryP, submit_buttonP, show_hide_text);
                            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sd_maybe_show_precedent(SubLObject interaction, SubLObject prompt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (ONE_INTEGER.eql(rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_term_count(prompt))) {
                {
                    SubLObject first_subprompt = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt).first();
                    SubLObject examples = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(first_subprompt);
                    SubLObject precedent = (NIL != list_utilities.proper_list_p(examples)) ? ((SubLObject) (find($PRECEDENT, examples, symbol_function(EQL), RKF_SD_EXAMPLE_TYPE, UNPROVIDED, UNPROVIDED))) : NIL;
                    SubLObject show_hide_text = $$$Analogous_example;
                    if (NIL != rkf_salient_descriptor_datastructures.rkf_sd_example_p(precedent)) {
                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        {
                            SubLObject type = rkf_salient_descriptor_datastructures.rkf_sd_example_type(precedent);
                            SubLObject precedent_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term(precedent);
                            SubLObject supports = rkf_salient_descriptor_datastructures.rkf_sd_example_supports(precedent);
                            SubLObject precedent_focal_term = rkf_salient_descriptor_datastructures.rkf_sd_example_focus_term_analog(precedent);
                            {
                                SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                                    {
                                        SubLObject object_id = $$$precedent;
                                        SubLObject sd_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt36$text_css);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$screen);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                            }
                                        }
                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                                        html_utilities.html_terpri(UNPROVIDED);
                                        dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, show_hide_text);
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
                                            SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt86$If_the_question_were_about_);
                                                                        {
                                                                            SubLObject precedent_focal_term_phrase = uia_trampolines.uia_html_term_phrase_np(user_interaction_agenda.ui_agenda(interaction), precedent_focal_term, UNPROVIDED, UNPROVIDED);
                                                                            cb_uia_display_primitives.cb_uia_show_term(precedent_focal_term, precedent_focal_term_phrase);
                                                                        }
                                                                        html_utilities.html_princ($str_alt87$_instead_of_);
                                                                        {
                                                                            SubLObject sd_term_phrase = uia_trampolines.uia_html_term_phrase_np(user_interaction_agenda.ui_agenda(interaction), sd_term, UNPROVIDED, UNPROVIDED);
                                                                            cb_uia_display_primitives.cb_uia_show_term(sd_term, sd_term_phrase);
                                                                        }
                                                                        html_utilities.html_princ($str_alt88$__a_valid_answer_would_be__);
                                                                        cb_uia_display_primitives.cb_uia_show_term(precedent_term, UNPROVIDED);
                                                                        html_utilities.html_princ($str_alt89$___because);
                                                                        cb_uia_display_primitives.cb_uia_show_argument(supports, object_id);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                } finally {
                                    pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                    }
                }
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_salient_descriptor_prompt_show_confirm_question(SubLObject interaction, SubLObject prompt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycl_sentence = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_formula(prompt);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject question_string = uia_trampolines.uia_html_query_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                        cb_uia_display_primitives.cb_uia_show_sentence(cycl_sentence, question_string);
                    } finally {
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return interaction;
        }
    }

    /**
     * The text that we put on Yuck buttons
     */
    // defparameter
    private static final SubLSymbol $yucky_button_label$ = makeSymbol("*YUCKY-BUTTON-LABEL*");

    /**
     * Temporary gating variable for whether we give user the subprompt to create
     * a new rule to conclude info prompted for by the Salient Descriptor
     */
    // defparameter
    private static final SubLSymbol $allow_new_rules_in_salient_descriptorP$ = makeSymbol("*ALLOW-NEW-RULES-IN-SALIENT-DESCRIPTOR?*");

    public static final SubLObject cb_salient_descriptor_maybe_show_new_rule_button() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $allow_new_rules_in_salient_descriptorP$.getDynamicValue(thread)) {
                html_utilities.html_indent(TWO_INTEGER);
                cb_salient_descriptor_new_rule_button();
            }
            return NIL;
        }
    }

    public static final SubLObject cb_salient_descriptor_choice_guts(SubLObject interaction, SubLObject choices, SubLObject cycl_sentence, SubLObject single_entryP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject use_blanksP = T;
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject question_string = uia_trampolines.uia_html_query_phrase(v_agenda, cycl_sentence, NIL, NIL, use_blanksP);
                SubLObject blank_count = pph_question.pph_blank_count(question_string);
                SubLObject pcase_var = blank_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    html_utilities.html_princ($str_alt91$Please_choose_something_to_answer);
                } else
                    if (pcase_var.eql(ONE_INTEGER)) {
                        html_utilities.html_princ($str_alt92$Please_choose_something_to_fill_i);
                    } else
                        if (pcase_var.eql(TWO_INTEGER)) {
                            html_utilities.html_princ($str_alt93$Please_choose_one_thing_to_fill_i);
                        } else {
                            html_utilities.html_princ($str_alt94$Please_choose_one_thing_to_fill_i);
                        }


                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                cb_uia_display_primitives.cb_uia_show_sentence(cycl_sentence, question_string);
                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                html_utilities.html_newline(UNPROVIDED);
            }
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
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
                        html_utilities.html_hidden_input($str_alt95$choice_count, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, length(choices)), UNPROVIDED);
                        {
                            SubLObject list_var = NIL;
                            SubLObject v_term = NIL;
                            SubLObject index = NIL;
                            for (list_var = choices, v_term = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , index = add(ONE_INTEGER, index)) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject base_fieldname = cb_sd_basic_term_selection_field_name(NIL != single_entryP ? ((SubLObject) (ZERO_INTEGER)) : index);
                                                    SubLObject encoded = html_utilities.get_encoded_form_field_name(base_fieldname);
                                                    if (NIL != single_entryP) {
                                                        html_utilities.html_radio_input(encoded, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, v_term), NIL);
                                                    } else {
                                                        html_utilities.html_checkbox_input(encoded, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, v_term), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                                                cb_uia_display_primitives.cb_uia_show_term_with_clarifying_link(v_term, UNPROVIDED);
                                            } finally {
                                                pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
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
                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        cb_salient_descriptor_skip_button();
                                        html_utilities.html_indent(TWO_INTEGER);
                                        cb_salient_descriptor_dont_know_button();
                                        html_utilities.html_indent(TWO_INTEGER);
                                        cb_salient_descriptor_yuck_button();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sd_basic_term_selection_field_name(SubLObject index) {
        return cb_sd_suffix_field_name($str_alt96$use_term_, index);
    }

    public static final SubLObject cb_sd_suffix_field_name(SubLObject name, SubLObject index) {
        return cconcatenate(name, string_utilities.str(index));
    }

    public static final SubLObject cb_salient_descriptor_specify_guts(SubLObject interaction, SubLObject prompt, SubLObject single_entryP) {
        if (TWO_INTEGER.numG(rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_term_count(prompt))) {
            return cb_salient_descriptor_specify_single_guts(interaction, prompt, single_entryP);
        } else {
            return cb_salient_descriptor_specify_multiple_guts(interaction, prompt);
        }
    }

    public static final SubLObject cb_salient_descriptor_specify_multiple_guts(SubLObject interaction, SubLObject prompt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_hidden_input($$$multiple, rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_term_count(prompt), UNPROVIDED);
            {
                SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
                SubLObject representative_subprompt = list_utilities.last_one(subprompts);
                SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(representative_subprompt, UNPROVIDED, UNPROVIDED);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                html_utilities.html_princ($$$In_the_sentence);
                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                        cb_uia_display_primitives.cb_uia_show_sentence(assert_sentence, UNPROVIDED);
                    } finally {
                        pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                html_utilities.html_princ($str_alt99$please_enter_values_for_the_follo);
                html_utilities.html_newline(UNPROVIDED);
                {
                    SubLObject list_var = NIL;
                    SubLObject subprompt = NIL;
                    SubLObject index = NIL;
                    for (list_var = subprompts, subprompt = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , subprompt = list_var.first() , index = add(ONE_INTEGER, index)) {
                        {
                            SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                            SubLObject var_examples = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(subprompt);
                            SubLObject raw_constraint_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_constraint_sentence(subprompt);
                            SubLObject constraint_sentence = cb_salient_descriptor_simplify_constraint_sent(v_agenda, raw_constraint_sentence);
                            html_utilities.html_newline(UNPROVIDED);
                            cb_uia_display_primitives.cb_uia_show_term(var, UNPROVIDED);
                            html_utilities.html_indent(TWO_INTEGER);
                            {
                                SubLObject submit_buttonP = NIL;
                                cb_salient_descriptor_give_some_examples(interaction, var, var_examples, index, $REQUIRED, $TRUE, submit_buttonP, UNPROVIDED);
                            }
                            html_utilities.html_newline(UNPROVIDED);
                            cb_salient_descriptor_render_constraint_sentence(constraint_sentence, UNPROVIDED);
                        }
                    }
                }
                {
                    SubLObject show_submit_buttonP = T;
                    cb_salient_descriptor_specify_buttons(show_submit_buttonP);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_salient_descriptor_specify_buttons(SubLObject show_submit_buttonP) {
        html_utilities.html_newline(UNPROVIDED);
        if (NIL != show_submit_buttonP) {
            html_utilities.html_submit_input($$$Submit, $$$submit, UNPROVIDED);
        }
        html_utilities.html_indent(TWO_INTEGER);
        cb_salient_descriptor_dont_know_button();
        html_utilities.html_indent(TWO_INTEGER);
        cb_salient_descriptor_skip_button();
        html_utilities.html_indent(TWO_INTEGER);
        cb_salient_descriptor_yuck_button();
        cb_salient_descriptor_maybe_show_new_rule_button();
        return NIL;
    }

    public static final SubLObject cb_salient_descriptor_skip_button() {
        return html_utilities.html_submit_input($$$Skip, $$$skip, UNPROVIDED);
    }

    public static final SubLObject cb_salient_descriptor_dont_know_button() {
        return html_utilities.html_submit_input($str_alt104$Don_t_Know, $str_alt105$dont_know, UNPROVIDED);
    }

    public static final SubLObject cb_salient_descriptor_yuck_button() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return html_utilities.html_submit_input($yucky_button_label$.getDynamicValue(thread), $$$yuck, UNPROVIDED);
        }
    }

    public static final SubLObject cb_salient_descriptor_new_rule_button() {
        return html_utilities.html_submit_input($$$Conclude_This, $str_alt108$new_rule, UNPROVIDED);
    }

    /**
     * Show some HTML that will allow the user to specify a value to satisfy the :SPECIFY
     * prompt PROMPT
     */
    public static final SubLObject cb_salient_descriptor_specify_single_guts(SubLObject interaction, SubLObject prompt, SubLObject single_entryP) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
            SubLObject subprompt = subprompts.first();
            SubLObject datum = subprompt.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            SubLObject raw_constraint_sentence = NIL;
            SubLObject assert_sentence = NIL;
            SubLObject var_examples = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt109);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt109);
            raw_constraint_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt109);
            assert_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt109);
            var_examples = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject constraint_sentence = cb_salient_descriptor_simplify_constraint_sent(v_agenda, raw_constraint_sentence);
                    cb_salient_descriptor_specify_single_guts_internal(interaction, var, constraint_sentence, assert_sentence, var_examples, single_entryP);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt109);
            }
        }
        return NIL;
    }

    /**
     * Show some HTML that will allow the user to specify a value for VAR in ASSERT-SENTENCE
     * that meets CONSTRAINT-SENTENCE, using VAR-EXAMPLES as examples.
     */
    public static final SubLObject cb_salient_descriptor_specify_single_guts_internal(SubLObject interaction, SubLObject var, SubLObject constraint_sentence, SubLObject assert_sentence, SubLObject var_examples, SubLObject single_entryP) {
        {
            SubLObject use_gkeP = makeBoolean((NIL != list_utilities.proper_list_p(var_examples)) && (NIL == cb_uia_display_primitives.uia_should_ignore_gkeP()));
            if (NIL != use_gkeP) {
                cb_salient_descriptor_specify_single_gke(interaction, var, constraint_sentence, assert_sentence, var_examples);
            } else {
                cb_salient_descriptor_specify_single_html(interaction, var, constraint_sentence, assert_sentence, var_examples, single_entryP);
            }
            {
                SubLObject show_submit_buttonP = NIL;
                cb_salient_descriptor_specify_buttons(show_submit_buttonP);
            }
        }
        return NIL;
    }

    /**
     * Show HTML form fields and prompts that will allow the user to specify a value for VAR
     * in ASSERT-SENTENCE that meets CONSTRAINT-SENTENCE, using VAR-EXAMPLES as examples.
     */
    public static final SubLObject cb_salient_descriptor_specify_single_html(SubLObject interaction, SubLObject var, SubLObject constraint_sentence, SubLObject assert_sentence, SubLObject var_examples, SubLObject single_entryP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ok_for_blanksP = cb_salient_descriptor_ok_for_blanksP(constraint_sentence);
                if (NIL != ok_for_blanksP) {
                    {
                        SubLObject use_blanksP = T;
                        SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                        SubLObject question_string = uia_trampolines.uia_html_query_phrase(v_agenda, assert_sentence, NIL, NIL, use_blanksP);
                        SubLObject blank_count = pph_question.pph_blank_count(question_string);
                        SubLObject pcase_var = blank_count;
                        if (pcase_var.eql(ZERO_INTEGER)) {
                            html_utilities.html_princ($str_alt110$Please_enter_something_to_answer_);
                        } else
                            if (pcase_var.eql(ONE_INTEGER)) {
                                html_utilities.html_princ($str_alt111$Please_enter_something_to_fill_in);
                            } else
                                if (pcase_var.eql(TWO_INTEGER)) {
                                    html_utilities.html_princ($str_alt112$Please_enter_one_thing_to_fill_in);
                                } else {
                                    html_utilities.html_princ($str_alt113$Please_enter_one_thing_to_fill_in);
                                }


                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        cb_uia_display_primitives.cb_uia_show_sentence(assert_sentence, question_string);
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                    }
                } else {
                    html_utilities.html_princ($$$Please_enter_something_to_replace);
                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                    cb_uia_display_primitives.cb_uia_show_term(var, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                    html_utilities.html_princ($$$in_the_sentence);
                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                            cb_uia_display_primitives.cb_uia_show_sentence(assert_sentence, UNPROVIDED);
                        } finally {
                            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                }
                {
                    SubLObject no_varsP = ok_for_blanksP;
                    cb_salient_descriptor_render_constraint_sentence(constraint_sentence, no_varsP);
                }
                html_utilities.html_newline(UNPROVIDED);
                {
                    SubLObject submit_buttonP = T;
                    cb_salient_descriptor_give_some_examples(interaction, var, var_examples, ZERO_INTEGER, $REQUIRED, single_entryP, submit_buttonP, UNPROVIDED);
                }
                html_utilities.html_newline(TWO_INTEGER);
            }
            return interaction;
        }
    }

    /**
     * Show a GKE applet that will allow the user to specify a value for VAR in ASSERT-SENTENCE
     * that meets CONSTRAINT-SENTENCE, using VAR-EXAMPLES as examples.
     */
    public static final SubLObject cb_salient_descriptor_specify_single_gke(SubLObject interaction, SubLObject var, SubLObject constraint_sentence, SubLObject assert_sentence, SubLObject var_examples) {
        {
            SubLObject appname = $$$Concept_Refinement_Interview;
            SubLObject url_properties = user_interaction_agenda.ui_signature_to_property_list(user_interaction_agenda.ui_signature(interaction));
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject is_question = NIL;
            SubLObject var_positions = cycl_utilities.arg_positions_dfs(var, assert_sentence, UNPROVIDED);
            SubLObject handler_name = Strings.string_downcase(string_utilities.to_string(CB_UIAT_SALIENT_DESCRIPTOR_GKE_SUBMIT_HANDLER), UNPROVIDED, UNPROVIDED);
            SubLObject better_sentence = subst(rkf_salient_descriptor_datastructures.rkf_sd_example_term(var_examples.first()), var, assert_sentence, UNPROVIDED, UNPROVIDED);
            html_utilities.html_newline(ONE_INTEGER);
            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
            cb_uia_display_primitives.cb_uia_gke_applet(interaction, better_sentence, mt, url_properties, handler_name, list($EDITABLE_ARG_POSITIONS, var_positions, $kw119$IS_QUESTION_, is_question, $APPNAME, appname));
            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            html_utilities.html_newline(ONE_INTEGER);
            html_utilities.html_princ($str_alt121$_Please_click_on_the_blue_text_to);
            html_utilities.html_newline(ONE_INTEGER);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            cb_uia_display_primitives.cb_uia_show_sentence_link(better_sentence, $$$Click_or_hover_here, UNPROVIDED);
            html_utilities.html_princ($str_alt123$_to_see_more_info_about_this_sent);
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        }
        cb_sd_examples_output_showXhide_stuff(interaction, NIL, NIL, ZERO_INTEGER, $$$Enter_New_Term, $ALLOWED, T, NIL);
        html_utilities.html_newline(UNPROVIDED);
        return interaction;
    }

    public static final SubLObject cb_salient_descriptor_ok_for_blanksP(SubLObject constraint_sentence) {
        if (NIL != cb_salient_descriptor_isa_sentP(constraint_sentence)) {
            return T;
        } else
            if ((NIL != el_utilities.el_conjunction_p(constraint_sentence)) && (NIL == list_utilities.find_if_not($sym125$CB_SALIENT_DESCRIPTOR_ISA_SENT_, cycl_utilities.formula_args(constraint_sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return T;
            } else {
                return NIL;
            }

    }

    public static final SubLObject cb_salient_descriptor_isa_sentP(SubLObject cycl) {
        return makeBoolean((NIL != formula_pattern_match.formula_matches_pattern(cycl, $list_alt126)) || (NIL != formula_pattern_match.formula_matches_pattern(cycl, $list_alt127)));
    }

    public static final SubLObject cb_salient_descriptor_isa_cols(SubLObject constraint_sentence) {
        {
            SubLObject cols = uia_tools_salient_descriptor.uiat_salient_descriptor_isa_cols(constraint_sentence);
            SubLObject cdolist_list_var = uia_tools_salient_descriptor.uiat_salient_descriptor_genl_cols(constraint_sentence);
            SubLObject v_genls = NIL;
            for (v_genls = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_genls = cdolist_list_var.first()) {
                cols = cons(el_utilities.make_unary_formula($$SpecsFn, v_genls), cols);
            }
            return cols;
        }
    }

    public static final SubLObject cb_salient_descriptor_render_constraint_sentence(SubLObject constraint_sentence, SubLObject no_varsP) {
        if (no_varsP == UNPROVIDED) {
            no_varsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != constraint_sentence) {
                if (NIL != no_varsP) {
                    html_utilities.html_princ($str_alt129$with_something_that_is_);
                    html_utilities.html_markup(cb_sd_term_conjunction_string(constraint_sentence));
                    html_utilities.html_princ($str_alt130$_);
                } else {
                    html_utilities.html_princ($str_alt131$such_that_the_following_is_true__);
                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                            cb_uia_display_primitives.cb_uia_show_sentence(constraint_sentence, UNPROVIDED);
                        } finally {
                            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sd_term_conjunction_string(SubLObject constraint_sentence) {
        {
            SubLObject term_conjunction = rkf_concept_communicator.make_rkf_term_conjunction(cb_salient_descriptor_isa_cols(constraint_sentence), $list_alt132, UNPROVIDED);
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            return uia_trampolines.uia_html_term_phrase(v_agenda, term_conjunction, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject cb_salient_descriptor_simplify_constraint_sent(SubLObject v_agenda, SubLObject constraint_sentence) {
        {
            SubLObject simplified_constraints = NIL;
            SubLObject simplified_sentence = NIL;
            if (NIL == constraint_sentence) {
                return NIL;
            } else
                if (NIL != el_utilities.el_conjunction_p(constraint_sentence)) {
                    {
                        SubLObject args = cycl_utilities.formula_args(constraint_sentence, $IGNORE);
                        SubLObject cdolist_list_var = args;
                        SubLObject conjunct = NIL;
                        for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                            if (NIL == is_non_informative_constraint_for_salient_description(v_agenda, conjunct)) {
                                simplified_constraints = cons(conjunct, simplified_constraints);
                            }
                        }
                    }
                    if (NIL != simplified_constraints) {
                        simplified_sentence = simplifier.nconjoin(nreverse(simplified_constraints), T);
                    }
                } else
                    if (NIL == is_non_informative_constraint_for_salient_description(v_agenda, constraint_sentence)) {
                        simplified_sentence = constraint_sentence;
                    }


            return simplified_sentence;
        }
    }

    public static final SubLObject is_non_informative_constraint_for_salient_description(SubLObject v_agenda, SubLObject conjunct) {
        {
            SubLObject constraint = cycl_utilities.formula_arg2(conjunct, UNPROVIDED);
            return uia_trampolines.uia_irrelevant_arg_constraintP(v_agenda, constraint, UNPROVIDED);
        }
    }

    public static final SubLObject cb_salient_descriptor_give_some_examples(SubLObject interaction, SubLObject var, SubLObject var_examples, SubLObject var_num, SubLObject type_in_mode, SubLObject single_entryP, SubLObject submit_buttonP, SubLObject example_text) {
        if (example_text == UNPROVIDED) {
            example_text = $$$Examples;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject single_entry_booleanP = eq($TRUE, single_entryP);
                SubLObject something_to_doP = makeBoolean((NIL != list_utilities.proper_list_p(var_examples)) || (type_in_mode != $NONE));
                if (NIL != something_to_doP) {
                    html_utilities.html_newline(UNPROVIDED);
                    {
                        SubLObject use_showXhideP = makeBoolean((NIL != list_utilities.proper_list_p(var_examples)) || (type_in_mode == $ALLOWED));
                        if (NIL != use_showXhideP) {
                            cb_sd_examples_output_showXhide_stuff(interaction, var_examples, var, var_num, example_text, type_in_mode, submit_buttonP, single_entry_booleanP);
                        }
                    }
                    if (type_in_mode == $REQUIRED) {
                        {
                            SubLObject example_status = cb_sd_example_status(var_examples);
                            SubLObject example_count = cb_sd_example_count(var_examples);
                            SubLObject box_number = example_count;
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
                                    cb_salient_descriptor_show_type_in_box(interaction, NIL, submit_buttonP, var_num, single_entry_booleanP, box_number, example_status);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sd_example_count(SubLObject var_examples) {
        return NIL != list_utilities.proper_list_p(var_examples) ? ((SubLObject) (length(var_examples))) : ZERO_INTEGER;
    }

    public static final SubLObject cb_sd_example_status(SubLObject var_examples) {
        return NIL != list_utilities.proper_list_p(var_examples) ? ((SubLObject) ($FOUND)) : var_examples;
    }

    /**
     * Output the examples or type-in box in a show/hide environment.
     */
    public static final SubLObject cb_sd_examples_output_showXhide_stuff(SubLObject interaction, SubLObject var_examples, SubLObject var, SubLObject var_num, SubLObject example_text, SubLObject type_in_mode, SubLObject submit_buttonP, SubLObject single_entry_booleanP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject enable_selectionP = makeBoolean(var_num.isInteger() && (NIL != cycl_variables.el_varP(var)));
                SubLObject basic_field_name = cb_sd_basic_term_selection_field_name(var_num);
                SubLObject object_id = cb_sd_suffix_field_name($str_alt137$var_examples_, var_num);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject initial_visibility = cb_sd_example_visiblity(interaction);
                if (NIL != enable_selectionP) {
                    cb_sd_examples_hidden_fields(single_entry_booleanP, var_num, var_examples);
                }
                html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt36$text_css);
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
                dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, example_text);
                dhtml_macros.dhtml_set_switched_visibility(object_id, initial_visibility, $TEXT);
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
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_sd_examples_output_examples(v_agenda, var_examples, enable_selectionP, single_entry_booleanP, basic_field_name);
                                {
                                    SubLObject example_status = cb_sd_example_status(var_examples);
                                    SubLObject example_count = cb_sd_example_count(var_examples);
                                    cb_sd_examples_maybe_show_footer(interaction, single_entry_booleanP, type_in_mode, basic_field_name, var_num, submit_buttonP, example_count, example_status);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return interaction;
        }
    }

    /**
     *
     *
     * @return KEYWORDP; Should we initially show or hide the examples?
     */
    public static final SubLObject cb_sd_example_visiblity(SubLObject interaction) {
        if (NIL != dictionary.dictionary_p(user_interaction_agenda.ui_state_lookup(interaction, $BAD_EXAMPLE_DICTIONARY, UNPROVIDED))) {
            return $VISIBLE;
        } else {
            return $INVISIBLE;
        }
    }

    /**
     * Encode info necessary for interpreting response.
     */
    public static final SubLObject cb_sd_examples_hidden_fields(SubLObject single_entry_booleanP, SubLObject var_num, SubLObject var_examples) {
        html_utilities.html_hidden_input($str_alt140$single_entry_, single_entry_booleanP, UNPROVIDED);
        html_utilities.html_hidden_input(cb_sd_suffix_field_name($str_alt141$example_count_, var_num), cb_sd_example_count(var_examples), UNPROVIDED);
        return var_examples;
    }

    /**
     * Output the actual examples.
     */
    public static final SubLObject cb_sd_examples_output_examples(SubLObject v_agenda, SubLObject var_examples, SubLObject enable_selectionP, SubLObject single_entry_booleanP, SubLObject basic_field_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.proper_list_p(var_examples)) {
                {
                    SubLObject list_var = NIL;
                    SubLObject example = NIL;
                    SubLObject index = NIL;
                    for (list_var = var_examples, example = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , example = list_var.first() , index = add(ONE_INTEGER, index)) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                        {
                                            SubLObject type = rkf_salient_descriptor_datastructures.rkf_sd_example_type(example);
                                            SubLObject v_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term(example);
                                            SubLObject supports = rkf_salient_descriptor_datastructures.rkf_sd_example_supports(example);
                                            SubLObject focus_term_analog = rkf_salient_descriptor_datastructures.rkf_sd_example_focus_term_analog(example);
                                            if (NIL != enable_selectionP) {
                                                cb_sd_examples_show_selection_field(v_agenda, index, single_entry_booleanP, basic_field_name, v_term);
                                            }
                                            {
                                                SubLObject _prev_bind_0_35 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                                                try {
                                                    pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                                                    {
                                                        SubLObject object_id = cb_sd_suffix_field_name(basic_field_name, index);
                                                        cb_uia_display_primitives.cb_uia_show_term_with_clarifying_link(v_term, UNPROVIDED);
                                                        cb_sd_examples_show_type(type);
                                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($str_alt36$text_css);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($$$screen);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt142$);
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
                                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uia_display_primitives.cb_uia_show_argument(supports, object_id);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    }
                                                } finally {
                                                    pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0_35, thread);
                                                }
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
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
                }
            }
            return var_examples;
        }
    }

    public static final SubLObject cb_sd_examples_show_type(SubLObject type) {
        {
            SubLObject help_text = cb_sd_examples_help_text_for_type(type);
            SubLObject anchor_text = string_utilities.substring(help_text, ZERO_INTEGER, ONE_INTEGER);
            html_utilities.html_indent(TWO_INTEGER);
            cb_query.html_princ_with_explanation(anchor_text, help_text, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return type;
    }

    public static final SubLObject cb_sd_examples_help_text_for_type(SubLObject type) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($PRECEDENT)) {
                return $str_alt143$Precedent__Something_about_which_;
            } else
                if (pcase_var.eql($CONSTRAINT_MATCHER)) {
                    return $str_alt145$Constraints_match__A_plausible_an;
                }

        }
        return NIL;
    }

    /**
     * Show a check box or radio button for an example.
     */
    public static final SubLObject cb_sd_examples_show_selection_field(SubLObject v_agenda, SubLObject index, SubLObject single_entry_booleanP, SubLObject basic_field_name, SubLObject v_term) {
        {
            SubLObject temp_basic_field_name = (NIL != single_entry_booleanP) ? ((SubLObject) (basic_field_name)) : cb_sd_suffix_field_name(basic_field_name, index);
            SubLObject field_name = html_utilities.get_encoded_form_field_name(temp_basic_field_name);
            if (NIL != single_entry_booleanP) {
                html_utilities.html_radio_input(field_name, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, v_term), NIL);
            } else {
                html_utilities.html_checkbox_input(field_name, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, v_term), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        html_utilities.html_indent(TWO_INTEGER);
        return v_term;
    }

    public static final SubLObject cb_sd_examples_maybe_show_footer(SubLObject interaction, SubLObject single_entry_booleanP, SubLObject type_in_mode, SubLObject basic_field_name, SubLObject var_num, SubLObject submit_buttonP, SubLObject example_count, SubLObject example_status) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != single_entry_booleanP) && (type_in_mode == $REQUIRED)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_sd_show_use_type_in_box_radio_button(basic_field_name);
                                html_utilities.html_indent(TWO_INTEGER);
                                html_utilities.html_princ($str_alt146$Use_type_in_box);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } else
                if (type_in_mode == $ALLOWED) {
                    {
                        SubLObject use_radio_buttonP = makeBoolean((NIL != single_entry_booleanP) && ($FOUND == example_status));
                        SubLObject radio_button_name = (NIL != use_radio_buttonP) ? ((SubLObject) (basic_field_name)) : NIL;
                        cb_salient_descriptor_show_type_in_box(interaction, radio_button_name, submit_buttonP, var_num, single_entry_booleanP, example_count, example_status);
                    }
                }

            return interaction;
        }
    }

    public static final SubLObject cb_salient_descriptor_show_type_in_box(SubLObject interaction, SubLObject radio_button_name, SubLObject submit_buttonP, SubLObject var_num, SubLObject single_entry_booleanP, SubLObject box_number, SubLObject example_status) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject basic_name = cb_sd_suffix_field_name($$$phrase, var_num);
                SubLObject phrase_field_name_stem = html_utilities.get_encoded_form_field_name(basic_name);
                SubLObject phrase_field_name = cb_sd_phrase_field_name(phrase_field_name_stem);
                SubLObject script = $str_alt142$;
                format(html_macros.$html_stream$.getDynamicValue(thread), cb_uia_macros.$cb_uiat_generate_entry_boxes_js$.getGlobalValue());
                {
                    SubLObject counter_name = cb_uia_macros.cb_uiat_generate_counters_name(phrase_field_name_stem);
                    SubLObject counter_id = cb_uia_macros.cb_uiat_generate_counters_id(phrase_field_name_stem);
                    html_utilities.html_hidden_input(counter_name, ZERO_INTEGER, counter_id);
                    html_utilities.html_hidden_input($$$StemId, phrase_field_name_stem, UNPROVIDED);
                }
                {
                    SubLObject size = $int$40;
                    SubLObject parent_id = $str_alt150$phrase_cell;
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != parent_id) {
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(parent_id);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    if (radio_button_name.isString()) {
                                        cb_sd_show_use_type_in_box_radio_button(radio_button_name);
                                        script = html_script_utilities.html_auto_select_radio_button_script(html_utilities.get_encoded_form_field_name(radio_button_name), box_number);
                                    }
                                    html_utilities.html_scripted_text_input(phrase_field_name, script, NIL, size);
                                    html_utilities.html_indent(TWO_INTEGER);
                                    cb_uia_display_primitives.cb_uia_paste_button(phrase_field_name, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
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
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != submit_buttonP) {
                                        html_utilities.html_submit_input($$$Submit, $$$submitting, UNPROVIDED);
                                    }
                                    if (NIL == single_entry_booleanP) {
                                        html_utilities.html_indent(TWO_INTEGER);
                                        cb_sd_more_answers_button(interaction, phrase_field_name_stem, parent_id, size);
                                    }
                                    {
                                        SubLObject pcase_var = example_status;
                                        if (pcase_var.eql($FOUND)) {
                                            html_utilities.html_indent(TWO_INTEGER);
                                            html_utilities.html_submit_input($$$New_Examples, cb_sd_suffix_field_name($str_alt153$new_examples, var_num), UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($NOT_TRIED)) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                html_utilities.html_submit_input($$$Get_Examples, cb_sd_suffix_field_name($str_alt153$new_examples, var_num), UNPROVIDED);
                                            }

                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
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
            }
            return interaction;
        }
    }

    public static final SubLObject cb_sd_phrase_field_name(SubLObject stem) {
        return cb_uia_macros.cb_uiat_non_generated_id(stem, UNPROVIDED);
    }

    public static final SubLObject cb_sd_more_answers_button(SubLObject interaction, SubLObject phrase_field_name, SubLObject parent_id, SubLObject size) {
        {
            SubLObject id_stem = phrase_field_name;
            SubLObject event_script = cb_uia_macros.cb_uiat_compute_generating_event_js(parent_id, id_stem, size, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($$$button);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            if (true) {
                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_princ($$$More_Answers);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != event_script) {
                html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(event_script);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
        }
        return interaction;
    }

    public static final SubLObject cb_sd_show_use_type_in_box_radio_button(SubLObject radio_button_name) {
        {
            SubLObject encoded_name = html_utilities.get_encoded_form_field_name(radio_button_name);
            html_utilities.html_radio_input(encoded_name, $str_alt158$Use_type_in_box, NIL);
            html_utilities.html_indent(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_salient_descriptor_string_from_var(SubLObject var) {
        return cycl_variables.el_var_name_without_prefix(var);
    }

    public static final SubLObject cb_uiat_salient_descriptor_gke_submit_handler(SubLObject args) {
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
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $GKE_SUBMIT, list($FORMULA, formula));
            cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uiat_salient_descriptor_specify_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject id_string = html_utilities.html_extract_input($$$id, args);
                SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                SubLObject multiple_arg = html_utilities.html_extract_input($$$multiple, args);
                SubLObject multiple = (multiple_arg.isString()) ? ((SubLObject) (parse_integer(multiple_arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                SubLObject new_example_reply = cb_uiat_sd_get_new_example_reply(interaction, args);
                SubLObject reply = (NIL != new_example_reply) ? ((SubLObject) (new_example_reply)) : cb_uiat_salient_descriptor_common_handler(interaction, args);
                if (NIL != reply) {
                } else
                    if (NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input($$$skip, args))) {
                        reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SKIP_PROMPT, NIL);
                    } else
                        if (NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt105$dont_know, args))) {
                            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DONT_KNOW, NIL);
                        } else
                            if (NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt108$new_rule, args))) {
                                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $NEW_RULE, NIL);
                            } else
                                if (multiple.isInteger()) {
                                    {
                                        SubLObject abortP = NIL;
                                        SubLObject example_plist = NIL;
                                        SubLObject phrase_plist = NIL;
                                        if (NIL == abortP) {
                                            {
                                                SubLObject end_var = multiple;
                                                SubLObject index = NIL;
                                                for (index = ZERO_INTEGER; !((NIL != abortP) || index.numGE(end_var)); index = number_utilities.f_1X(index)) {
                                                    {
                                                        SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.get_form_field_code(args), thread);
                                                            {
                                                                SubLObject basic_phrase_field_name = cb_sd_suffix_field_name($$$phrase, index);
                                                                SubLObject encoded_phrase_field_name = html_utilities.get_encoded_form_field_name(basic_phrase_field_name);
                                                                SubLObject phrases = cb_uia_macros.cb_uiat_extract_generated_input_values(args, encoded_phrase_field_name);
                                                                SubLObject phrase = find_if(STRINGP, phrases, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                SubLObject basic_example_field_name = cb_sd_basic_term_selection_field_name(index);
                                                                SubLObject accepted_example_encoded = html_utilities.extract_encoded_form_field_value(basic_example_field_name, args);
                                                                if (NIL != string_utilities.non_empty_stringP(phrase)) {
                                                                    phrase_plist = putf(phrase_plist, index, phrase);
                                                                } else
                                                                    if (NIL != accepted_example_encoded) {
                                                                        {
                                                                            SubLObject decoded_example = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, accepted_example_encoded);
                                                                            example_plist = putf(example_plist, index, decoded_example);
                                                                        }
                                                                    } else {
                                                                        abortP = T;
                                                                    }

                                                            }
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL != abortP) {
                                            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $COULDNT_PROCESS, NIL);
                                        } else {
                                            {
                                                SubLObject plist = list($PHRASES, phrase_plist, $TERMS, example_plist);
                                                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $MULTI_CONCEPT_IN_SENTENCE_DISAMBIGUATOR, plist);
                                            }
                                        }
                                    }
                                } else {
                                    reply = cb_uiat_salient_descriptor_extract_term_for_var_reply(interaction, args);
                                }




                if (NIL != reply) {
                    cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    public static final SubLObject cb_uiat_sd_get_new_example_reply(SubLObject interaction, SubLObject args) {
        {
            SubLObject multiple_arg = html_utilities.html_extract_input($$$multiple, args);
            SubLObject multiple = (multiple_arg.isString()) ? ((SubLObject) (parse_integer(multiple_arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : ONE_INTEGER;
            SubLObject new_example_nums = NIL;
            SubLObject reply = NIL;
            if (multiple.isInteger()) {
                {
                    SubLObject end_var = multiple;
                    SubLObject var_num = NIL;
                    for (var_num = ZERO_INTEGER; !var_num.numGE(end_var); var_num = number_utilities.f_1X(var_num)) {
                        {
                            SubLObject field_name = cb_sd_suffix_field_name($str_alt153$new_examples, var_num);
                            if (NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input(field_name, args))) {
                                new_example_nums = cons(var_num, new_example_nums);
                            }
                        }
                    }
                }
            }
            if (NIL != new_example_nums) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $REPLACE_EXAMPLES, list($NEW_EXAMPLE_NUMS, new_example_nums));
            }
            return reply;
        }
    }

    public static final SubLObject cb_uiat_salient_descriptor_facet_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject reply = NIL;
            if (NIL != html_utilities.html_extract_input($str_alt34$skip_all, args)) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SKIP_ALL_FACETS, NIL);
            } else {
                {
                    SubLObject facet_count = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($str_alt28$facet_count, args));
                    SubLObject accepted_facets = NIL;
                    if (facet_count.isInteger()) {
                        {
                            SubLObject n = NIL;
                            for (n = ZERO_INTEGER; n.numL(facet_count); n = add(n, ONE_INTEGER)) {
                                {
                                    SubLObject raw_field_name = cb_sd_basic_term_selection_field_name(n);
                                    SubLObject accepted_facet_encoded = html_utilities.extract_encoded_form_field_value(raw_field_name, args);
                                    SubLObject v_agenda_41 = user_interaction_agenda.ui_agenda(interaction);
                                    if (NIL != accepted_facet_encoded) {
                                        {
                                            SubLObject var = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda_41, accepted_facet_encoded);
                                            if (NIL != var) {
                                                accepted_facets = cons(var, accepted_facets);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != accepted_facets) {
                        {
                            SubLObject plist = list($FACETS, nreverse(accepted_facets));
                            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SET_FACETS, plist);
                        }
                    } else {
                        reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SKIP_ALL_FACETS, NIL);
                    }
                }
            }
            if (NIL != reply) {
                cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uiat_salient_descriptor_extract_term_for_var_reply(SubLObject interaction, SubLObject args) {
        {
            SubLObject reply = NIL;
            SubLObject phrases = cb_sd_get_typed_in_phrases(args, NIL);
            SubLObject example_count_string = html_utilities.html_extract_input($str_alt181$example_count_0, args);
            SubLObject example_count = (NIL != example_count_string) ? ((SubLObject) (parse_integer(example_count_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : ZERO_INTEGER;
            SubLObject accepted_examples = NIL;
            if (example_count.isInteger()) {
                {
                    SubLObject single_entryP = equal($$$T, html_utilities.html_extract_input($str_alt140$single_entry_, args));
                    SubLObject var_num = ZERO_INTEGER;
                    SubLObject raw_field_name = cb_sd_basic_term_selection_field_name(var_num);
                    SubLObject doneP = NIL;
                    if (NIL == doneP) {
                        {
                            SubLObject end_var = example_count;
                            SubLObject n = NIL;
                            for (n = ZERO_INTEGER; !((NIL != doneP) || n.numGE(end_var)); n = number_utilities.f_1X(n)) {
                                {
                                    SubLObject basic_field_name = (NIL != single_entryP) ? ((SubLObject) (raw_field_name)) : cb_sd_suffix_field_name(raw_field_name, n);
                                    SubLObject accepted_example_encoded = html_utilities.extract_encoded_form_field_value(basic_field_name, args);
                                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                                    if (NIL != accepted_example_encoded) {
                                        {
                                            SubLObject var = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, accepted_example_encoded);
                                            if (NIL != var) {
                                                accepted_examples = cons(var, accepted_examples);
                                            }
                                        }
                                    }
                                    doneP = single_entryP;
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != accepted_examples) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ACCEPTED_EXAMPLES, list($ACCEPTED_EXAMPLES, accepted_examples));
            } else
                if (NIL != phrases) {
                    reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $CONCEPT_IN_SENTENCE_DISAMBIGUATOR, list($PHRASES, phrases));
                }

            return reply;
        }
    }

    public static final SubLObject cb_sd_get_typed_in_phrases(SubLObject args, SubLObject include_empty_stringP) {
        if (NIL != cb_uia_macros.cb_uiat_generated_stem_id_from_args(args)) {
            {
                SubLObject raw_phrases = cb_uia_macros.cb_uiat_extract_generated_input_values(args, UNPROVIDED);
                return NIL != include_empty_stringP ? ((SubLObject) (raw_phrases)) : remove(string_utilities.$empty_string$.getGlobalValue(), raw_phrases, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_salient_descriptor_show_justification(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject justification = uia_tools_salient_descriptor.uiat_salient_descriptor_get_justification(interaction);
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
                            SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt185$I_asked_you_this_interview_questi);
                                        html_utilities.html_newline(UNPROVIDED);
                                        if (NIL != arguments.support_p(justification.first())) {
                                            cb_uia_display_primitives.cb_uia_show_argument(justification, $$$justification);
                                        } else
                                            if (NIL != rkf_salient_descriptor.rkf_salient_descriptor_rule_spec_p(justification)) {
                                                {
                                                    SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                                                    SubLObject domain_mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
                                                    SubLObject argument = rkf_salient_descriptor.rkf_rule_spec_supports(v_term, justification, domain_mt);
                                                    cb_uia_display_primitives.cb_uia_show_argument(argument, $$$justification);
                                                }
                                            } else {
                                                html_utilities.html_princ(justification);
                                            }

                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return interaction;
        }
    }

    /**
     * Display a page allowing the user to complain about a yucky subprompt.
     */
    public static final SubLObject cb_uiat_salient_descriptor_yucky_guts(SubLObject interaction) {
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
                        html_utilities.html_hidden_input($str_alt186$cb_uiat_salient_descriptor_yuck_h, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_princ_strong($$$Complaint_Form);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ($str_alt188$Please_make_any_appropriate_chang);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_submit_input($$$Email_report, $$$email, UNPROVIDED);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_submit_input($$$Never_mind, $str_alt192$never_mind, UNPROVIDED);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_submit_input($$$Disable_rule, $$$disable, UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_submit_input($$$Send_email_AND_disable_rule, $str_alt196$email_and_disable, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        {
                            SubLObject message_field_name = html_utilities.get_encoded_form_field_name($$$message);
                            SubLObject message = uia_tools_salient_descriptor.uiat_salient_descriptor_default_yuck_message(interaction);
                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(message_field_name);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($int$50);
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
                                SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ(message);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                        }
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_submit_input($$$Email_report, $$$email, UNPROVIDED);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_submit_input($$$Never_mind, $str_alt192$never_mind, UNPROVIDED);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_submit_input($$$Disable_rule, $$$disable, UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_submit_input($$$Send_email_AND_disable_rule, $str_alt196$email_and_disable, UNPROVIDED);
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

    public static final SubLObject cb_uiat_salient_descriptor_yuck_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.get_form_field_code(args), thread);
                        {
                            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
                            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                            SubLObject reportP = makeBoolean((NIL != html_utilities.html_extract_input($$$email, args)) || (NIL != html_utilities.html_extract_input($str_alt196$email_and_disable, args)));
                            SubLObject message = html_utilities.extract_encoded_form_field_value($$$message, args);
                            SubLObject smiteP = makeBoolean((NIL != html_utilities.html_extract_input($$$disable, args)) || (NIL != html_utilities.html_extract_input($str_alt196$email_and_disable, args)));
                            SubLObject plist = list($kw200$REPORT_, reportP, $kw201$SMITE_, smiteP, $MESSAGE, message);
                            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $YUCK_RESULT, plist);
                            cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                        }
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_0, thread);
                    }
                }
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    /**
     * Should we assert negations when the user clicks 'No'?
     */
    // defparameter
    private static final SubLSymbol $salient_descriptor_assertion_negationsP$ = makeSymbol("*SALIENT-DESCRIPTOR-ASSERTION-NEGATIONS?*");

    public static final SubLObject cb_uiat_salient_descriptor_confirm_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.get_form_field_code(args), thread);
                        {
                            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
                            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                            SubLObject prompt_choice = cb_uiat_salient_descriptor_extract_prompt_choice(args);
                            SubLObject new_example_reply = cb_uiat_sd_get_new_example_reply(interaction, args);
                            SubLObject reply = (NIL != new_example_reply) ? ((SubLObject) (new_example_reply)) : cb_uiat_salient_descriptor_common_handler(interaction, args);
                            if (NIL != reply) {
                            } else
                                if (((NIL == $salient_descriptor_assertion_negationsP$.getDynamicValue(thread)) && (NIL != html_utilities.html_extract_input($$$no, args))) || (NIL != html_utilities.html_extract_input($str_alt105$dont_know, args))) {
                                    reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DONT_KNOW, NIL);
                                } else
                                    if (NIL != html_utilities.html_extract_input($$$skip, args)) {
                                        reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SKIP_PROMPT, NIL);
                                    } else
                                        if (NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt108$new_rule, args))) {
                                            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $NEW_RULE, NIL);
                                        } else
                                            if ((NIL != html_utilities.html_extract_input($$$no, args)) || (NIL != html_utilities.html_extract_input($$$yes, args))) {
                                                {
                                                    SubLObject subprompts = uia_tools_salient_descriptor.uiat_salient_descriptor_get_subprompts(interaction);
                                                    SubLObject subprompt = subprompts.first();
                                                    SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED);
                                                    if (NIL != html_utilities.html_extract_input($$$no, args)) {
                                                        assert_sentence = el_utilities.make_negation(assert_sentence);
                                                    }
                                                    reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ASSERT, list($ASSERT_SENTENCE, assert_sentence));
                                                }
                                            } else
                                                if (NIL != prompt_choice) {
                                                    reply = cb_uiat_salient_descriptor_prompt_from_user_reply(args);
                                                } else {
                                                    reply = cb_uiat_salient_descriptor_extract_term_for_var_reply(interaction, args);
                                                }





                            if (NIL != reply) {
                                cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                            }
                        }
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_0, thread);
                    }
                }
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    /**
     * Handle common cases.
     */
    public static final SubLObject cb_uiat_salient_descriptor_common_handler(SubLObject interaction, SubLObject args) {
        uia_tools_salient_descriptor.ui_salient_descriptor_note_busy(interaction);
        if (NIL != cb_sd_ask_againP(args)) {
            user_interaction_agenda.ui_state_update(interaction, $kw208$ASK_AGAIN_, $TRUE);
        } else {
            user_interaction_agenda.ui_state_clear(interaction, $kw208$ASK_AGAIN_);
        }
        {
            SubLObject reply = NIL;
            if (NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt48$end_interview, args))) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $END_INTERVIEW, NIL);
            } else
                if (NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt50$skip_tactic, args))) {
                    reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SKIP_TACTIC, NIL);
                } else
                    if (NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt68$new_question, args))) {
                        reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $CHOOSE_NEW_PROMPT, NIL);
                    } else
                        if (NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input($$$yuck, args))) {
                            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $YUCK, NIL);
                        }



            return reply;
        }
    }

    public static final SubLObject cb_sd_ask_againP(SubLObject args) {
        return makeBoolean((NIL != html_utilities.extract_encoded_form_field_value($str_alt212$ask_again_, args)) || (NIL != cb_sd_user_generated_blankP(args)));
    }

    public static final SubLObject cb_sd_user_generated_blankP(SubLObject args) {
        {
            SubLObject generated_input_count = cb_uia_macros.cb_uiat_generated_input_count(args, UNPROVIDED);
            return makeBoolean((generated_input_count.isInteger() && generated_input_count.numG(ONE_INTEGER)) && (NIL != find(string_utilities.$empty_string$.getGlobalValue(), cb_sd_get_typed_in_phrases(args, T), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static final SubLObject cb_uiat_salient_descriptor_choice_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.get_form_field_code(args), thread);
                        {
                            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
                            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                            SubLObject reply = cb_uiat_salient_descriptor_common_handler(interaction, args);
                            if (NIL != reply) {
                            } else
                                if (NIL != html_utilities.html_extract_input($$$skip, args)) {
                                    reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SKIP_PROMPT, NIL);
                                } else
                                    if (NIL != html_utilities.html_extract_input($str_alt105$dont_know, args)) {
                                        reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DONT_KNOW, NIL);
                                    } else {
                                        {
                                            SubLObject choice_count_string = html_utilities.html_extract_input($str_alt95$choice_count, args);
                                            SubLObject choice_count = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, choice_count_string);
                                            SubLObject accepted_choices = NIL;
                                            SubLObject n = NIL;
                                            for (n = ZERO_INTEGER; n.numL(choice_count); n = add(n, ONE_INTEGER)) {
                                                {
                                                    SubLObject basic_field_name = cb_sd_basic_term_selection_field_name(n);
                                                    SubLObject accepted_choice_encoded = html_utilities.extract_encoded_form_field_value(basic_field_name, args);
                                                    if (NIL != accepted_choice_encoded) {
                                                        accepted_choices = cons(cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, accepted_choice_encoded), accepted_choices);
                                                    }
                                                }
                                            }
                                            if (NIL != accepted_choices) {
                                                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ASSERT_CHOICES, list($ACCEPTED_CHOICES, accepted_choices));
                                            }
                                        }
                                    }


                            if (NIL != reply) {
                                cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                            }
                        }
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_0, thread);
                    }
                }
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    public static final SubLObject cb_link_uia_salient_descriptor_choice_handler(SubLObject interaction, SubLObject choice, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, choice);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt18$cb_uiat_salient_descriptor_choice, arglist);
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

    public static final SubLObject cb_link_uia_salient_descriptor_confirm_handler(SubLObject interaction, SubLObject choice, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, choice);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt15$cb_uiat_salient_descriptor_confir, arglist);
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

    public static final SubLObject cb_uiat_salient_descriptor_required(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt220);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject phrase = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, $REQUIRED, phrase, v_term);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt220);
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_link_uia_salient_descriptor_required(SubLObject v_term, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt222$cb_uiat_salient_descriptor_requir, arglist);
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

    /**
     *
     *
     * @param TERM-PLIST
     * 		plist; of the form produced by uia-term-review-assertion-plist
     */
    public static final SubLObject cb_uia_maybe_salient_descriptor_link_for_term(SubLObject term_plist, SubLObject label) {
        if (label == UNPROVIDED) {
            label = $str_alt225$_Interview_;
        }
        {
            SubLObject launcher = uia_tools_review_and_testing.uiat_kreview_term_get_launcher(term_plist);
            SubLObject assertion = getf(term_plist, $ASSERTION, UNPROVIDED);
            SubLObject v_term = getf(term_plist, $TERM, UNPROVIDED);
            if (NIL != launcher) {
                cb_user_interaction_agenda.cb_uia_show_launcher_link(launcher, label);
            } else
                if (NIL != assertion) {
                    cb_utilities.cb_link($UIA_SALIENT_DESCRIPTOR_REQUIRED, assertion, label, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (NIL != forts.fort_p(v_term)) {
                        cb_utilities.cb_link($UIA_SALIENT_DESCRIPTOR_REQUIRED, v_term, label, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }


            return NIL;
        }
    }

    public static final SubLObject cb_uiat_fact_entry_render_request(SubLObject request) {
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
                    return cb_uiat_fet_show_current_topic(interaction, plist);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static final SubLObject cb_uiat_fet_show_current_topic(SubLObject interaction, SubLObject plist) {
        {
            SubLObject datum = plist;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_46 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt230);
                current_46 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt230);
                if (NIL == member(current_46, $list_alt231, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_46 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt230);
            }
            {
                SubLObject term_tail = property_list_member($TERM, current);
                SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                SubLObject topic_tail = property_list_member($TOPIC, current);
                SubLObject topic = (NIL != topic_tail) ? ((SubLObject) (cadr(topic_tail))) : NIL;
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                SubLObject generation_mt = user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                SubLObject parsing_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
                SubLObject user = uia_setup_state.uima_user(user_interaction_agenda.uia_meta_agenda(v_agenda));
                SubLObject focal_term_type = ask_utilities.ask_variable($TYPE, list($$templateTypeForFocalTermType, $TYPE, topic), interaction_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
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
                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                cb_fet_applet.cb_fet_applet(interaction_mt, focal_term_type, user, topic, v_term, interaction_mt, generation_mt, parsing_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                html_utilities.html_newline(UNPROVIDED);
                cb_utilities.cb_link($UIAT_FET_DONE, interaction, $str_alt236$_Done_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uiat_fet_done(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt236$_Done_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt237$cb_uiat_fact_entry_completed, arglist);
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
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_fact_entry_completed(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt239);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $NEXT, NIL);
                    cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt239);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cb_uia_tools_salient_descriptor_file() {
        declareFunction("cb_uiat_salient_descriptor_render_request", "CB-UIAT-SALIENT-DESCRIPTOR-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_display_prompt", "CB-UIAT-SALIENT-DESCRIPTOR-DISPLAY-PROMPT", 2, 0, false);
        declareFunction("cb_uiat_salient_descriptor_display_facets", "CB-UIAT-SALIENT-DESCRIPTOR-DISPLAY-FACETS", 1, 0, false);
        declareFunction("cb_salient_descriptor_show_justification", "CB-SALIENT-DESCRIPTOR-SHOW-JUSTIFICATION", 1, 0, false);
        declareFunction("cb_salient_descriptor_maybe_show_prompt_from_user_guts", "CB-SALIENT-DESCRIPTOR-MAYBE-SHOW-PROMPT-FROM-USER-GUTS", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_get_next_prompt_from_user", "CB-UIAT-SALIENT-DESCRIPTOR-GET-NEXT-PROMPT-FROM-USER", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_prompt_from_user_guts", "CB-UIAT-SALIENT-DESCRIPTOR-PROMPT-FROM-USER-GUTS", 1, 0, false);
        declareFunction("cb_link_uiat_salient_descriptor_choose_prompt", "CB-LINK-UIAT-SALIENT-DESCRIPTOR-CHOOSE-PROMPT", 2, 0, false);
        declareFunction("cb_uiat_salient_descriptor_choose_prompt", "CB-UIAT-SALIENT-DESCRIPTOR-CHOOSE-PROMPT", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_get_next_prompt_from_user_handler", "CB-UIAT-SALIENT-DESCRIPTOR-GET-NEXT-PROMPT-FROM-USER-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_prompt_from_user_reply", "CB-UIAT-SALIENT-DESCRIPTOR-PROMPT-FROM-USER-REPLY", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_extract_prompt_choice", "CB-UIAT-SALIENT-DESCRIPTOR-EXTRACT-PROMPT-CHOICE", 1, 0, false);
        declareFunction("cb_salient_descriptor_guts_header", "CB-SALIENT-DESCRIPTOR-GUTS-HEADER", 2, 0, false);
        declareFunction("cb_salient_descriptor_confirm_guts", "CB-SALIENT-DESCRIPTOR-CONFIRM-GUTS", 3, 0, false);
        declareFunction("cb_sd_maybe_show_precedent", "CB-SD-MAYBE-SHOW-PRECEDENT", 2, 0, false);
        declareFunction("cb_uiat_salient_descriptor_prompt_show_confirm_question", "CB-UIAT-SALIENT-DESCRIPTOR-PROMPT-SHOW-CONFIRM-QUESTION", 2, 0, false);
        declareFunction("cb_salient_descriptor_maybe_show_new_rule_button", "CB-SALIENT-DESCRIPTOR-MAYBE-SHOW-NEW-RULE-BUTTON", 0, 0, false);
        declareFunction("cb_salient_descriptor_choice_guts", "CB-SALIENT-DESCRIPTOR-CHOICE-GUTS", 4, 0, false);
        declareFunction("cb_sd_basic_term_selection_field_name", "CB-SD-BASIC-TERM-SELECTION-FIELD-NAME", 1, 0, false);
        declareFunction("cb_sd_suffix_field_name", "CB-SD-SUFFIX-FIELD-NAME", 2, 0, false);
        declareFunction("cb_salient_descriptor_specify_guts", "CB-SALIENT-DESCRIPTOR-SPECIFY-GUTS", 3, 0, false);
        declareFunction("cb_salient_descriptor_specify_multiple_guts", "CB-SALIENT-DESCRIPTOR-SPECIFY-MULTIPLE-GUTS", 2, 0, false);
        declareFunction("cb_salient_descriptor_specify_buttons", "CB-SALIENT-DESCRIPTOR-SPECIFY-BUTTONS", 1, 0, false);
        declareFunction("cb_salient_descriptor_skip_button", "CB-SALIENT-DESCRIPTOR-SKIP-BUTTON", 0, 0, false);
        declareFunction("cb_salient_descriptor_dont_know_button", "CB-SALIENT-DESCRIPTOR-DONT-KNOW-BUTTON", 0, 0, false);
        declareFunction("cb_salient_descriptor_yuck_button", "CB-SALIENT-DESCRIPTOR-YUCK-BUTTON", 0, 0, false);
        declareFunction("cb_salient_descriptor_new_rule_button", "CB-SALIENT-DESCRIPTOR-NEW-RULE-BUTTON", 0, 0, false);
        declareFunction("cb_salient_descriptor_specify_single_guts", "CB-SALIENT-DESCRIPTOR-SPECIFY-SINGLE-GUTS", 3, 0, false);
        declareFunction("cb_salient_descriptor_specify_single_guts_internal", "CB-SALIENT-DESCRIPTOR-SPECIFY-SINGLE-GUTS-INTERNAL", 6, 0, false);
        declareFunction("cb_salient_descriptor_specify_single_html", "CB-SALIENT-DESCRIPTOR-SPECIFY-SINGLE-HTML", 6, 0, false);
        declareFunction("cb_salient_descriptor_specify_single_gke", "CB-SALIENT-DESCRIPTOR-SPECIFY-SINGLE-GKE", 5, 0, false);
        declareFunction("cb_salient_descriptor_ok_for_blanksP", "CB-SALIENT-DESCRIPTOR-OK-FOR-BLANKS?", 1, 0, false);
        declareFunction("cb_salient_descriptor_isa_sentP", "CB-SALIENT-DESCRIPTOR-ISA-SENT?", 1, 0, false);
        declareFunction("cb_salient_descriptor_isa_cols", "CB-SALIENT-DESCRIPTOR-ISA-COLS", 1, 0, false);
        declareFunction("cb_salient_descriptor_render_constraint_sentence", "CB-SALIENT-DESCRIPTOR-RENDER-CONSTRAINT-SENTENCE", 1, 1, false);
        declareFunction("cb_sd_term_conjunction_string", "CB-SD-TERM-CONJUNCTION-STRING", 1, 0, false);
        declareFunction("cb_salient_descriptor_simplify_constraint_sent", "CB-SALIENT-DESCRIPTOR-SIMPLIFY-CONSTRAINT-SENT", 2, 0, false);
        declareFunction("is_non_informative_constraint_for_salient_description", "IS-NON-INFORMATIVE-CONSTRAINT-FOR-SALIENT-DESCRIPTION", 2, 0, false);
        declareFunction("cb_salient_descriptor_give_some_examples", "CB-SALIENT-DESCRIPTOR-GIVE-SOME-EXAMPLES", 7, 1, false);
        declareFunction("cb_sd_example_count", "CB-SD-EXAMPLE-COUNT", 1, 0, false);
        declareFunction("cb_sd_example_status", "CB-SD-EXAMPLE-STATUS", 1, 0, false);
        declareFunction("cb_sd_examples_output_showXhide_stuff", "CB-SD-EXAMPLES-OUTPUT-SHOW/HIDE-STUFF", 8, 0, false);
        declareFunction("cb_sd_example_visiblity", "CB-SD-EXAMPLE-VISIBLITY", 1, 0, false);
        declareFunction("cb_sd_examples_hidden_fields", "CB-SD-EXAMPLES-HIDDEN-FIELDS", 3, 0, false);
        declareFunction("cb_sd_examples_output_examples", "CB-SD-EXAMPLES-OUTPUT-EXAMPLES", 5, 0, false);
        declareFunction("cb_sd_examples_show_type", "CB-SD-EXAMPLES-SHOW-TYPE", 1, 0, false);
        declareFunction("cb_sd_examples_help_text_for_type", "CB-SD-EXAMPLES-HELP-TEXT-FOR-TYPE", 1, 0, false);
        declareFunction("cb_sd_examples_show_selection_field", "CB-SD-EXAMPLES-SHOW-SELECTION-FIELD", 5, 0, false);
        declareFunction("cb_sd_examples_maybe_show_footer", "CB-SD-EXAMPLES-MAYBE-SHOW-FOOTER", 8, 0, false);
        declareFunction("cb_salient_descriptor_show_type_in_box", "CB-SALIENT-DESCRIPTOR-SHOW-TYPE-IN-BOX", 7, 0, false);
        declareFunction("cb_sd_phrase_field_name", "CB-SD-PHRASE-FIELD-NAME", 1, 0, false);
        declareFunction("cb_sd_more_answers_button", "CB-SD-MORE-ANSWERS-BUTTON", 4, 0, false);
        declareFunction("cb_sd_show_use_type_in_box_radio_button", "CB-SD-SHOW-USE-TYPE-IN-BOX-RADIO-BUTTON", 1, 0, false);
        declareFunction("cb_salient_descriptor_string_from_var", "CB-SALIENT-DESCRIPTOR-STRING-FROM-VAR", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_gke_submit_handler", "CB-UIAT-SALIENT-DESCRIPTOR-GKE-SUBMIT-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_specify_handler", "CB-UIAT-SALIENT-DESCRIPTOR-SPECIFY-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_sd_get_new_example_reply", "CB-UIAT-SD-GET-NEW-EXAMPLE-REPLY", 2, 0, false);
        declareFunction("cb_uiat_salient_descriptor_facet_handler", "CB-UIAT-SALIENT-DESCRIPTOR-FACET-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_extract_term_for_var_reply", "CB-UIAT-SALIENT-DESCRIPTOR-EXTRACT-TERM-FOR-VAR-REPLY", 2, 0, false);
        declareFunction("cb_sd_get_typed_in_phrases", "CB-SD-GET-TYPED-IN-PHRASES", 2, 0, false);
        declareFunction("cb_uiat_salient_descriptor_show_justification", "CB-UIAT-SALIENT-DESCRIPTOR-SHOW-JUSTIFICATION", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_yucky_guts", "CB-UIAT-SALIENT-DESCRIPTOR-YUCKY-GUTS", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_yuck_handler", "CB-UIAT-SALIENT-DESCRIPTOR-YUCK-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_confirm_handler", "CB-UIAT-SALIENT-DESCRIPTOR-CONFIRM-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_common_handler", "CB-UIAT-SALIENT-DESCRIPTOR-COMMON-HANDLER", 2, 0, false);
        declareFunction("cb_sd_ask_againP", "CB-SD-ASK-AGAIN?", 1, 0, false);
        declareFunction("cb_sd_user_generated_blankP", "CB-SD-USER-GENERATED-BLANK?", 1, 0, false);
        declareFunction("cb_uiat_salient_descriptor_choice_handler", "CB-UIAT-SALIENT-DESCRIPTOR-CHOICE-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_salient_descriptor_choice_handler", "CB-LINK-UIA-SALIENT-DESCRIPTOR-CHOICE-HANDLER", 3, 0, false);
        declareFunction("cb_link_uia_salient_descriptor_confirm_handler", "CB-LINK-UIA-SALIENT-DESCRIPTOR-CONFIRM-HANDLER", 3, 0, false);
        declareFunction("cb_uiat_salient_descriptor_required", "CB-UIAT-SALIENT-DESCRIPTOR-REQUIRED", 1, 0, false);
        declareFunction("cb_link_uia_salient_descriptor_required", "CB-LINK-UIA-SALIENT-DESCRIPTOR-REQUIRED", 2, 0, false);
        declareFunction("cb_uia_maybe_salient_descriptor_link_for_term", "CB-UIA-MAYBE-SALIENT-DESCRIPTOR-LINK-FOR-TERM", 1, 1, false);
        declareFunction("cb_uiat_fact_entry_render_request", "CB-UIAT-FACT-ENTRY-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_fet_show_current_topic", "CB-UIAT-FET-SHOW-CURRENT-TOPIC", 2, 0, false);
        declareFunction("cb_link_uiat_fet_done", "CB-LINK-UIAT-FET-DONE", 2, 0, false);
        declareFunction("cb_uiat_fact_entry_completed", "CB-UIAT-FACT-ENTRY-COMPLETED", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_tools_salient_descriptor_file() {
        defparameter("*YUCKY-BUTTON-LABEL*", $$$Inappropriate);
        defparameter("*ALLOW-NEW-RULES-IN-SALIENT-DESCRIPTOR?*", NIL);
        defparameter("*SALIENT-DESCRIPTOR-ASSERTION-NEGATIONS?*", T);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_tools_salient_descriptor_file() {
                cb_uia_tool_declaration.declare_cb_uia_tool($SALIENT_DESCRIPTOR, $list_alt1);
        cb_utilities.setup_cb_link_method($UIAT_SALIENT_DESCRIPTOR_CHOOSE_PROMPT, CB_LINK_UIAT_SALIENT_DESCRIPTOR_CHOOSE_PROMPT, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_SALIENT_DESCRIPTOR_CHOOSE_PROMPT);
        html_macros.note_html_handler_function(CB_UIAT_SALIENT_DESCRIPTOR_GET_NEXT_PROMPT_FROM_USER_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_SALIENT_DESCRIPTOR_GKE_SUBMIT_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_SALIENT_DESCRIPTOR_SPECIFY_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_SALIENT_DESCRIPTOR_FACET_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_SALIENT_DESCRIPTOR_YUCK_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_SALIENT_DESCRIPTOR_CONFIRM_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_SALIENT_DESCRIPTOR_CHOICE_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_SALIENT_DESCRIPTOR_CHOICE_HANDLER, CB_LINK_UIA_SALIENT_DESCRIPTOR_CHOICE_HANDLER, THREE_INTEGER);
        cb_utilities.setup_cb_link_method($UIA_SALIENT_DESCRIPTOR_CONFIRM_HANDLER, CB_LINK_UIA_SALIENT_DESCRIPTOR_CONFIRM_HANDLER, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_SALIENT_DESCRIPTOR_REQUIRED);
        cb_utilities.setup_cb_link_method($UIA_SALIENT_DESCRIPTOR_REQUIRED, CB_LINK_UIA_SALIENT_DESCRIPTOR_REQUIRED, TWO_INTEGER);
        cb_uia_tool_declaration.declare_cb_uia_tool($FACT_ENTRY_TOOL, $list_alt228);
        cb_utilities.setup_cb_link_method($UIAT_FET_DONE, CB_LINK_UIAT_FET_DONE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_FACT_ENTRY_COMPLETED);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $SALIENT_DESCRIPTOR = makeKeyword("SALIENT-DESCRIPTOR");

    static private final SubLList $list_alt1 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-SALIENT-DESCRIPTOR-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSalientDescriptor")));

    static private final SubLList $list_alt2 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("SIGNATURE"), makeSymbol("PLIST"));

    private static final SubLSymbol $DISPLAY_PROMPT = makeKeyword("DISPLAY-PROMPT");

    private static final SubLSymbol $YUCK = makeKeyword("YUCK");

    private static final SubLSymbol $LET_USER_CHOOSE_PROMPT = makeKeyword("LET-USER-CHOOSE-PROMPT");

    private static final SubLSymbol $DISPLAY_FACETS = makeKeyword("DISPLAY-FACETS");



    static private final SubLList $list_alt8 = list(makeSymbol("&KEY"), makeSymbol("SINGLE-ENTRY?"));

    static private final SubLList $list_alt9 = list(makeKeyword("SINGLE-ENTRY?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol $kw11$SINGLE_ENTRY_ = makeKeyword("SINGLE-ENTRY?");



    static private final SubLString $str_alt13$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");



    static private final SubLString $str_alt15$cb_uiat_salient_descriptor_confir = makeString("cb-uiat-salient-descriptor-confirm-handler");

    static private final SubLString $$$id = makeString("id");



    static private final SubLString $str_alt18$cb_uiat_salient_descriptor_choice = makeString("cb-uiat-salient-descriptor-choice-handler");



    private static final SubLSymbol $NUM_TERMS_TO_SPECIFY = makeKeyword("NUM-TERMS-TO-SPECIFY");

    static private final SubLString $str_alt21$cb_uiat_salient_descriptor_specif = makeString("cb-uiat-salient-descriptor-specify-handler");



    static private final SubLString $str_alt23$cb_uiat_salient_descriptor_facet_ = makeString("cb-uiat-salient-descriptor-facet-handler");

    private static final SubLSymbol $TERM_FACETS = makeKeyword("TERM-FACETS");

    static private final SubLString $$$your_term = makeString("your term");

    static private final SubLString $$$Submit = makeString("Submit");

    static private final SubLString $$$Skip_All = makeString("Skip All");

    static private final SubLString $str_alt28$facet_count = makeString("facet-count");

    static private final SubLString $str_alt29$Before_refining__A_more_generally = makeString("Before refining ~A more generally, it is recommended that you refine it along the following specialized dimensions.");

    static private final SubLString $str_alt30$Please_deselect_any_that_you_woul = makeString("Please deselect any that you would like to skip.");





    static private final SubLString $$$submit = makeString("submit");

    static private final SubLString $str_alt34$skip_all = makeString("skip-all");

    static private final SubLString $$$justification = makeString("justification");

    static private final SubLString $str_alt36$text_css = makeString("text/css");

    static private final SubLString $$$screen = makeString("screen");

    static private final SubLString $$$none = makeString("none");

    static private final SubLString $$$Why_I_asked = makeString("Why I asked");





    static private final SubLString $str_alt42$100_ = makeString("100%");

    static private final SubLString $str_alt43$Prompt_tactic___A = makeString("Prompt tactic: ~A");

    static private final SubLString $str_alt44$more_questions = makeString("more_questions");

    static private final SubLString $$$Select_a_new_question = makeString("Select a new question");

    static private final SubLString $str_alt46$cb_uiat_salient_descriptor_get_ne = makeString("cb-uiat-salient-descriptor-get-next-prompt-from-user-handler");

    static private final SubLString $$$End_Interview = makeString("End Interview");

    static private final SubLString $str_alt48$end_interview = makeString("end-interview");

    static private final SubLString $$$Skip_Tactic = makeString("Skip Tactic");

    static private final SubLString $str_alt50$skip_tactic = makeString("skip-tactic");

    static private final SubLString $str_alt51$Please_select_the_interview_quest = makeString("Please select the interview question you would like to answer next.");

    static private final SubLString $$$Skip_All_of_These = makeString("Skip All of These");

    static private final SubLString $str_alt53$skip_all = makeString("skip_all");



    private static final SubLSymbol $UIAT_SALIENT_DESCRIPTOR_CHOOSE_PROMPT = makeKeyword("UIAT-SALIENT-DESCRIPTOR-CHOOSE-PROMPT");

    static private final SubLString $str_alt56$_Select_ = makeString("[Select]");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt58$cb_uiat_salient_descriptor_choose = makeString("cb-uiat-salient-descriptor-choose-prompt");

    private static final SubLSymbol CB_LINK_UIAT_SALIENT_DESCRIPTOR_CHOOSE_PROMPT = makeSymbol("CB-LINK-UIAT-SALIENT-DESCRIPTOR-CHOOSE-PROMPT");

    static private final SubLList $list_alt60 = list(makeSymbol("INTERACTION"), makeSymbol("PROMPT-ID"));

    private static final SubLSymbol $CHOOSE_PROMPT = makeKeyword("CHOOSE-PROMPT");

    private static final SubLSymbol CB_UIAT_SALIENT_DESCRIPTOR_CHOOSE_PROMPT = makeSymbol("CB-UIAT-SALIENT-DESCRIPTOR-CHOOSE-PROMPT");

    private static final SubLSymbol CB_UIAT_SALIENT_DESCRIPTOR_GET_NEXT_PROMPT_FROM_USER_HANDLER = makeSymbol("CB-UIAT-SALIENT-DESCRIPTOR-GET-NEXT-PROMPT-FROM-USER-HANDLER");

    public static final SubLSymbol $kw64$SKIP_ALL_ = makeKeyword("SKIP-ALL?");

    static private final SubLString $$$prompt = makeString("prompt");

    static private final SubLString $str_alt66$hidden_submit = makeString("hidden-submit");

    static private final SubLString $$$New_Question = makeString("New Question");

    static private final SubLString $str_alt68$new_question = makeString("new-question");

    static private final SubLString $str_alt69$I_would_like_to_make_this_rule_mo = makeString("I would like to make this rule more useful:");

    static private final SubLString $str_alt70$Here_is_something_you_might_want_ = makeString("Here is something you might want to tell me about ");

    static private final SubLString $str_alt71$__ = makeString(" :");



    static private final SubLString $str_alt73$The_following_might_help_me_concl = makeString("The following might help me conclude something from the above rule:");

    static private final SubLString $str_alt74$Please_answer_the_following_quest = makeString("Please answer the following question:");



    static private final SubLString $$$Yes = makeString("Yes");

    static private final SubLString $$$yes = makeString("yes");

    static private final SubLString $$$No = makeString("No");

    static private final SubLString $$$no = makeString("no");



    static private final SubLString $$$Specific_Answer = makeString("Specific Answer");



    private static final SubLSymbol RKF_SD_EXAMPLE_TYPE = makeSymbol("RKF-SD-EXAMPLE-TYPE");

    static private final SubLString $$$Analogous_example = makeString("Analogous example");

    static private final SubLString $$$precedent = makeString("precedent");

    static private final SubLString $str_alt86$If_the_question_were_about_ = makeString("If the question were about ");

    static private final SubLString $str_alt87$_instead_of_ = makeString(" instead of ");

    static private final SubLString $str_alt88$__a_valid_answer_would_be__ = makeString(", a valid answer would be \"");

    static private final SubLString $str_alt89$___because = makeString("\", because");

    static private final SubLString $$$Inappropriate = makeString("Inappropriate");

    static private final SubLString $str_alt91$Please_choose_something_to_answer = makeString("Please choose something to answer the following question");

    static private final SubLString $str_alt92$Please_choose_something_to_fill_i = makeString("Please choose something to fill in the blank in the sentence");

    static private final SubLString $str_alt93$Please_choose_one_thing_to_fill_i = makeString("Please choose one thing to fill in both blanks in the sentence");

    static private final SubLString $str_alt94$Please_choose_one_thing_to_fill_i = makeString("Please choose one thing to fill in all the blanks in the sentence");

    static private final SubLString $str_alt95$choice_count = makeString("choice-count");

    static private final SubLString $str_alt96$use_term_ = makeString("use_term_");

    static private final SubLString $$$multiple = makeString("multiple");

    static private final SubLString $$$In_the_sentence = makeString("In the sentence");

    static private final SubLString $str_alt99$please_enter_values_for_the_follo = makeString("please enter values for the following: ");





    static private final SubLString $$$Skip = makeString("Skip");

    static private final SubLString $$$skip = makeString("skip");

    static private final SubLString $str_alt104$Don_t_Know = makeString("Don't Know");

    static private final SubLString $str_alt105$dont_know = makeString("dont_know");

    static private final SubLString $$$yuck = makeString("yuck");

    static private final SubLString $$$Conclude_This = makeString("Conclude This");

    static private final SubLString $str_alt108$new_rule = makeString("new_rule");

    static private final SubLList $list_alt109 = list(makeSymbol("VAR"), makeSymbol("RAW-CONSTRAINT-SENTENCE"), makeSymbol("ASSERT-SENTENCE"), makeSymbol("VAR-EXAMPLES"));

    static private final SubLString $str_alt110$Please_enter_something_to_answer_ = makeString("Please enter something to answer the following question");

    static private final SubLString $str_alt111$Please_enter_something_to_fill_in = makeString("Please enter something to fill in the blank in the sentence");

    static private final SubLString $str_alt112$Please_enter_one_thing_to_fill_in = makeString("Please enter one thing to fill in both blanks in the sentence");

    static private final SubLString $str_alt113$Please_enter_one_thing_to_fill_in = makeString("Please enter one thing to fill in all the blanks in the sentence");

    static private final SubLString $$$Please_enter_something_to_replace = makeString("Please enter something to replace");

    static private final SubLString $$$in_the_sentence = makeString("in the sentence");

    static private final SubLString $$$Concept_Refinement_Interview = makeString("Concept Refinement Interview");

    private static final SubLSymbol CB_UIAT_SALIENT_DESCRIPTOR_GKE_SUBMIT_HANDLER = makeSymbol("CB-UIAT-SALIENT-DESCRIPTOR-GKE-SUBMIT-HANDLER");

    private static final SubLSymbol $EDITABLE_ARG_POSITIONS = makeKeyword("EDITABLE-ARG-POSITIONS");

    public static final SubLSymbol $kw119$IS_QUESTION_ = makeKeyword("IS-QUESTION?");



    static private final SubLString $str_alt121$_Please_click_on_the_blue_text_to = makeString("(Please click on the blue text to replace it with something appropriate.)");

    static private final SubLString $$$Click_or_hover_here = makeString("Click or hover here");

    static private final SubLString $str_alt123$_to_see_more_info_about_this_sent = makeString(" to see more info about this sentence.");

    static private final SubLString $$$Enter_New_Term = makeString("Enter New Term");

    static private final SubLSymbol $sym125$CB_SALIENT_DESCRIPTOR_ISA_SENT_ = makeSymbol("CB-SALIENT-DESCRIPTOR-ISA-SENT?");

    static private final SubLList $list_alt126 = cons(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt127 = cons(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("ANYTHING"));

    public static final SubLObject $$SpecsFn = constant_handles.reader_make_constant_shell(makeString("SpecsFn"));

    static private final SubLString $str_alt129$with_something_that_is_ = makeString("with something that is ");

    static private final SubLString $str_alt130$_ = makeString(".");

    static private final SubLString $str_alt131$such_that_the_following_is_true__ = makeString("such that the following is true :");

    static private final SubLList $list_alt132 = list(makeKeyword("A"));



    static private final SubLString $$$Examples = makeString("Examples");





    static private final SubLString $str_alt137$var_examples_ = makeString("var_examples_");

    private static final SubLSymbol $BAD_EXAMPLE_DICTIONARY = makeKeyword("BAD-EXAMPLE-DICTIONARY");



    static private final SubLString $str_alt140$single_entry_ = makeString("single-entry?");

    static private final SubLString $str_alt141$example_count_ = makeString("example-count-");

    static private final SubLString $str_alt142$ = makeString("");

    static private final SubLString $str_alt143$Precedent__Something_about_which_ = makeString("Precedent: Something about which I know something similar.");



    static private final SubLString $str_alt145$Constraints_match__A_plausible_an = makeString("Constraints match: A plausible answer.");

    static private final SubLString $str_alt146$Use_type_in_box = makeString("Use type-in box");

    static private final SubLString $$$phrase = makeString("phrase");

    static private final SubLString $$$StemId = makeString("StemId");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $str_alt150$phrase_cell = makeString("phrase_cell");

    static private final SubLString $$$submitting = makeString("submitting");

    static private final SubLString $$$New_Examples = makeString("New Examples");

    static private final SubLString $str_alt153$new_examples = makeString("new-examples");



    static private final SubLString $$$Get_Examples = makeString("Get Examples");

    static private final SubLString $$$button = makeString("button");

    static private final SubLString $$$More_Answers = makeString("More Answers");

    static private final SubLString $str_alt158$Use_type_in_box = makeString("Use-type-in-box");







    static private final SubLString $$$formula = makeString("formula");



    private static final SubLSymbol $GKE_SUBMIT = makeKeyword("GKE-SUBMIT");



    private static final SubLSymbol $SKIP_PROMPT = makeKeyword("SKIP-PROMPT");

    private static final SubLSymbol $DONT_KNOW = makeKeyword("DONT-KNOW");

    private static final SubLSymbol $NEW_RULE = makeKeyword("NEW-RULE");



    private static final SubLSymbol $COULDNT_PROCESS = makeKeyword("COULDNT-PROCESS");





    private static final SubLSymbol $MULTI_CONCEPT_IN_SENTENCE_DISAMBIGUATOR = makeKeyword("MULTI-CONCEPT-IN-SENTENCE-DISAMBIGUATOR");

    private static final SubLSymbol CB_UIAT_SALIENT_DESCRIPTOR_SPECIFY_HANDLER = makeSymbol("CB-UIAT-SALIENT-DESCRIPTOR-SPECIFY-HANDLER");

    private static final SubLSymbol $REPLACE_EXAMPLES = makeKeyword("REPLACE-EXAMPLES");

    private static final SubLSymbol $NEW_EXAMPLE_NUMS = makeKeyword("NEW-EXAMPLE-NUMS");

    private static final SubLSymbol $SKIP_ALL_FACETS = makeKeyword("SKIP-ALL-FACETS");

    private static final SubLSymbol $FACETS = makeKeyword("FACETS");

    private static final SubLSymbol $SET_FACETS = makeKeyword("SET-FACETS");

    private static final SubLSymbol CB_UIAT_SALIENT_DESCRIPTOR_FACET_HANDLER = makeSymbol("CB-UIAT-SALIENT-DESCRIPTOR-FACET-HANDLER");

    static private final SubLString $str_alt181$example_count_0 = makeString("example-count-0");

    static private final SubLString $$$T = makeString("T");

    private static final SubLSymbol $ACCEPTED_EXAMPLES = makeKeyword("ACCEPTED-EXAMPLES");

    private static final SubLSymbol $CONCEPT_IN_SENTENCE_DISAMBIGUATOR = makeKeyword("CONCEPT-IN-SENTENCE-DISAMBIGUATOR");

    static private final SubLString $str_alt185$I_asked_you_this_interview_questi = makeString("I asked you this interview question because:");

    static private final SubLString $str_alt186$cb_uiat_salient_descriptor_yuck_h = makeString("cb-uiat-salient-descriptor-yuck-handler");

    static private final SubLString $$$Complaint_Form = makeString("Complaint Form");

    static private final SubLString $str_alt188$Please_make_any_appropriate_chang = makeString("Please make any appropriate changes to this message (optional) and then click one of the buttons.");

    static private final SubLString $$$Email_report = makeString("Email report");

    static private final SubLString $$$email = makeString("email");

    static private final SubLString $$$Never_mind = makeString("Never mind");

    static private final SubLString $str_alt192$never_mind = makeString("never_mind");

    static private final SubLString $$$Disable_rule = makeString("Disable rule");

    static private final SubLString $$$disable = makeString("disable");

    static private final SubLString $$$Send_email_AND_disable_rule = makeString("Send email AND disable rule");

    static private final SubLString $str_alt196$email_and_disable = makeString("email_and_disable");

    static private final SubLString $$$message = makeString("message");

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLString $$$23 = makeString("23");

    public static final SubLSymbol $kw200$REPORT_ = makeKeyword("REPORT?");

    public static final SubLSymbol $kw201$SMITE_ = makeKeyword("SMITE?");



    private static final SubLSymbol $YUCK_RESULT = makeKeyword("YUCK-RESULT");

    private static final SubLSymbol CB_UIAT_SALIENT_DESCRIPTOR_YUCK_HANDLER = makeSymbol("CB-UIAT-SALIENT-DESCRIPTOR-YUCK-HANDLER");





    private static final SubLSymbol CB_UIAT_SALIENT_DESCRIPTOR_CONFIRM_HANDLER = makeSymbol("CB-UIAT-SALIENT-DESCRIPTOR-CONFIRM-HANDLER");

    public static final SubLSymbol $kw208$ASK_AGAIN_ = makeKeyword("ASK-AGAIN?");

    private static final SubLSymbol $END_INTERVIEW = makeKeyword("END-INTERVIEW");

    private static final SubLSymbol $SKIP_TACTIC = makeKeyword("SKIP-TACTIC");

    private static final SubLSymbol $CHOOSE_NEW_PROMPT = makeKeyword("CHOOSE-NEW-PROMPT");

    static private final SubLString $str_alt212$ask_again_ = makeString("ask-again?");

    private static final SubLSymbol $ASSERT_CHOICES = makeKeyword("ASSERT-CHOICES");

    private static final SubLSymbol $ACCEPTED_CHOICES = makeKeyword("ACCEPTED-CHOICES");

    private static final SubLSymbol CB_UIAT_SALIENT_DESCRIPTOR_CHOICE_HANDLER = makeSymbol("CB-UIAT-SALIENT-DESCRIPTOR-CHOICE-HANDLER");

    private static final SubLSymbol $UIA_SALIENT_DESCRIPTOR_CHOICE_HANDLER = makeKeyword("UIA-SALIENT-DESCRIPTOR-CHOICE-HANDLER");

    private static final SubLSymbol CB_LINK_UIA_SALIENT_DESCRIPTOR_CHOICE_HANDLER = makeSymbol("CB-LINK-UIA-SALIENT-DESCRIPTOR-CHOICE-HANDLER");

    private static final SubLSymbol $UIA_SALIENT_DESCRIPTOR_CONFIRM_HANDLER = makeKeyword("UIA-SALIENT-DESCRIPTOR-CONFIRM-HANDLER");

    private static final SubLSymbol CB_LINK_UIA_SALIENT_DESCRIPTOR_CONFIRM_HANDLER = makeSymbol("CB-LINK-UIA-SALIENT-DESCRIPTOR-CONFIRM-HANDLER");

    static private final SubLList $list_alt220 = list(makeSymbol("TERM"));

    private static final SubLSymbol CB_UIAT_SALIENT_DESCRIPTOR_REQUIRED = makeSymbol("CB-UIAT-SALIENT-DESCRIPTOR-REQUIRED");

    static private final SubLString $str_alt222$cb_uiat_salient_descriptor_requir = makeString("cb-uiat-salient-descriptor-required");

    private static final SubLSymbol $UIA_SALIENT_DESCRIPTOR_REQUIRED = makeKeyword("UIA-SALIENT-DESCRIPTOR-REQUIRED");

    private static final SubLSymbol CB_LINK_UIA_SALIENT_DESCRIPTOR_REQUIRED = makeSymbol("CB-LINK-UIA-SALIENT-DESCRIPTOR-REQUIRED");

    static private final SubLString $str_alt225$_Interview_ = makeString("[Interview]");



    private static final SubLSymbol $FACT_ENTRY_TOOL = makeKeyword("FACT-ENTRY-TOOL");

    static private final SubLList $list_alt228 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-FACT-ENTRY-RENDER-REQUEST"));



    static private final SubLList $list_alt230 = list(makeSymbol("&KEY"), makeSymbol("TERM"), makeSymbol("TOPIC"));

    static private final SubLList $list_alt231 = list($TERM, makeKeyword("TOPIC"));





    public static final SubLObject $$templateTypeForFocalTermType = constant_handles.reader_make_constant_shell(makeString("templateTypeForFocalTermType"));

    private static final SubLSymbol $UIAT_FET_DONE = makeKeyword("UIAT-FET-DONE");

    static private final SubLString $str_alt236$_Done_ = makeString("[Done]");

    static private final SubLString $str_alt237$cb_uiat_fact_entry_completed = makeString("cb-uiat-fact-entry-completed");

    private static final SubLSymbol CB_LINK_UIAT_FET_DONE = makeSymbol("CB-LINK-UIAT-FET-DONE");

    static private final SubLList $list_alt239 = list(makeSymbol("INTERACTION"));



    private static final SubLSymbol CB_UIAT_FACT_ENTRY_COMPLETED = makeSymbol("CB-UIAT-FACT-ENTRY-COMPLETED");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cb_uia_tools_salient_descriptor_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_uia_tools_salient_descriptor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_uia_tools_salient_descriptor_file();
    }
}

