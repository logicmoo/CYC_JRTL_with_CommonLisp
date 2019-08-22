/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
 *  module:      CB-UIA-TOOLS-GLOSSARY
 *  source file: /cyc/top/cycl/cb-uia-tools-glossary.lisp
 *  created:     2019/07/03 17:38:10
 */
public final class cb_uia_tools_glossary extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_tools_glossary() {
    }

    public static final SubLFile me = new cb_uia_tools_glossary();


    // // Definitions
    public static final SubLObject cb_uia_glossary_hint_method(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject glossary = user_interaction_agenda.ui_state_lookup(interaction, $GLOSSARY, UNPROVIDED);
            SubLObject glossary_name = (NIL != glossary) ? ((SubLObject) (uia_trampolines.uia_term_phrase(v_agenda, glossary, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
            if (NIL != glossary_name) {
                return format(NIL, $str_alt2$Cyc_Glossary___A, glossary_name);
            } else {
                return $$$Cyc_Glossary;
            }
        }
    }

    public static final SubLObject cb_uia_show_glossary(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = user_interaction_agenda.$uia_frameless_environmentP$.currentBinding(thread);
                try {
                    user_interaction_agenda.$uia_frameless_environmentP$.bind(T, thread);
                    {
                        SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                        uia_tools_glossary.uia_act_new_glossary(v_agenda, $REQUIRED, NIL, UNPROVIDED, UNPROVIDED);
                        cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                    }
                } finally {
                    user_interaction_agenda.$uia_frameless_environmentP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_glossary(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($TOP);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_url_princ($str_alt7$cb_uia_show_glossary);
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

    public static final SubLObject cb_uia_glossary_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt10);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt10);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_1 = plist;
                        SubLObject current_2 = datum_1;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_2;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_1, $list_alt12);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_1, $list_alt12);
                            if (NIL == member(current_3, $list_alt13, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_1, $list_alt12);
                        }
                        {
                            SubLObject glossary_tail = property_list_member($GLOSSARY, current_2);
                            SubLObject glossary = (NIL != glossary_tail) ? ((SubLObject) (cadr(glossary_tail))) : NIL;
                            SubLObject glossary_terms_tail = property_list_member($GLOSSARY_TERMS, current_2);
                            SubLObject glossary_terms = (NIL != glossary_terms_tail) ? ((SubLObject) (cadr(glossary_terms_tail))) : NIL;
                            SubLObject glossary_term_info_table_tail = property_list_member($GLOSSARY_TERM_INFO_TABLE, current_2);
                            SubLObject glossary_term_info_table = (NIL != glossary_term_info_table_tail) ? ((SubLObject) (cadr(glossary_term_info_table_tail))) : NIL;
                            return cb_uia_glossary_render_guts(interaction, glossary_terms, glossary_term_info_table);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_glossary_render_guts(SubLObject interaction, SubLObject glossary_terms, SubLObject glossary_term_info_table) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                            }
                            if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                html_script_utilities.cb_hoverover_page_init();
                            }
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
                                        html_utilities.html_hidden_input($str_alt17$cb_uia_glossary_handler, T, UNPROVIDED);
                                        html_utilities.html_hidden_input($$$id, string_utilities.to_string(user_interaction_agenda.ui_id(interaction)), UNPROVIDED);
                                        cb_uia_glossary_header(interaction, glossary_terms);
                                        cb_uia_glossary_commands(interaction);
                                        cb_uia_glossary_contents(interaction, glossary_terms, glossary_term_info_table);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return interaction;
        }
    }



    public static final SubLObject cb_uia_glossary_header(SubLObject interaction, SubLObject glossary_terms) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject glossary = user_interaction_agenda.ui_state_lookup(interaction, $GLOSSARY, NIL);
            if (NIL != glossary) {
                {
                    SubLObject glossary_name = uia_trampolines.uia_term_phrase(v_agenda, glossary, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(glossary_name);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                }
            }
            if ($cb_uia_min_glossary_terms_for_alphabet$.getGlobalValue().numL(length(glossary_terms))) {
                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                cb_uia_glossary_emit_alphabet_links(glossary_terms);
                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            }
        }
        return interaction;
    }

    /**
     * string containing the anchors that should be used in the glossary
     */
    // defconstant
    private static final SubLSymbol $cb_uia_glossary_anchors$ = makeSymbol("*CB-UIA-GLOSSARY-ANCHORS*");

    /**
     * The anchors that haven't yet been emitted
     */
    // defparameter
    private static final SubLSymbol $cb_uia_glossary_anchors_to_emit$ = makeSymbol("*CB-UIA-GLOSSARY-ANCHORS-TO-EMIT*");

    public static final SubLObject cb_uia_glossary_contents(SubLObject interaction, SubLObject glossary_terms, SubLObject glossary_term_info_table) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = $cb_uia_glossary_anchors_to_emit$.currentBinding(thread);
                try {
                    $cb_uia_glossary_anchors_to_emit$.bind($cb_uia_glossary_anchors$.getGlobalValue(), thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(ZERO_INTEGER);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = glossary_terms;
                                SubLObject v_term = NIL;
                                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                    cb_uia_glossary_show_item(interaction, v_term, glossary_term_info_table);
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    $cb_uia_glossary_anchors_to_emit$.rebind(_prev_bind_0, thread);
                }
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uia_glossary_emit_alphabet_links(SubLObject glossary_terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject links_needed = set.new_set(EQL, UNPROVIDED);
                SubLObject cdolist_list_var = glossary_terms;
                SubLObject glossary_term = NIL;
                for (glossary_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , glossary_term = cdolist_list_var.first()) {
                    {
                        SubLObject generation = getf(glossary_term, $GENERATION, UNPROVIDED);
                        SubLObject sort_key = getf(glossary_term, $SORT_KEY, UNPROVIDED);
                        if ((generation.isString() && sort_key.isString()) && (NIL != list_utilities.lengthG(sort_key, ZERO_INTEGER, UNPROVIDED))) {
                            {
                                SubLObject curr_char = char_downcase(Strings.sublisp_char(sort_key, ZERO_INTEGER));
                                set.set_add(curr_char, links_needed);
                            }
                        }
                    }
                }
                html_utilities.html_princ($str_alt23$_);
                {
                    SubLObject string_var = $cb_uia_glossary_anchors$.getGlobalValue();
                    SubLObject end_var = length(string_var);
                    SubLObject end_var_7 = end_var;
                    SubLObject char_num = NIL;
                    for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_7); char_num = number_utilities.f_1X(char_num)) {
                        {
                            SubLObject curr_char = Strings.sublisp_char(string_var, char_num);
                            html_utilities.html_princ($str_alt24$_);
                            if (NIL != set.set_memberP(curr_char, links_needed)) {
                                {
                                    SubLObject url_string = format(NIL, $str_alt25$__A, curr_char);
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(url_string);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(curr_char);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                            } else {
                                html_utilities.html_princ(curr_char);
                            }
                            html_utilities.html_princ($str_alt24$_);
                        }
                    }
                }
                html_utilities.html_princ($str_alt26$_);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_glossary_potentially_emit_alphabet_anchor(SubLObject present_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != string_utilities.non_empty_stringP($cb_uia_glossary_anchors_to_emit$.getDynamicValue(thread))) {
                {
                    SubLObject new_string = string_utilities.string_first_n(ONE_INTEGER, $cb_uia_glossary_anchors_to_emit$.getDynamicValue(thread));
                    if (NIL != Strings.string_lessp(new_string, present_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        if (NIL != new_string) {
                            html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(new_string);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        $cb_uia_glossary_anchors_to_emit$.setDynamicValue(string_utilities.substring($cb_uia_glossary_anchors_to_emit$.getDynamicValue(thread), ONE_INTEGER, UNPROVIDED), thread);
                        $cb_uia_glossary_anchors_to_emit$.setDynamicValue(cb_uia_glossary_potentially_emit_alphabet_anchor(present_string), thread);
                    }
                }
            }
            return $cb_uia_glossary_anchors_to_emit$.getDynamicValue(thread);
        }
    }

    public static final SubLObject cb_uia_glossary_show_item(SubLObject interaction, SubLObject term_info, SubLObject glossary_term_info_table) {
        {
            SubLObject datum = term_info;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_8 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt27);
                current_8 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt27);
                if (NIL == member(current_8, $list_alt28, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_8 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt27);
            }
            {
                SubLObject cycl_tail = property_list_member($CYCL, current);
                SubLObject cycl = (NIL != cycl_tail) ? ((SubLObject) (cadr(cycl_tail))) : NIL;
                SubLObject generation_tail = property_list_member($GENERATION, current);
                SubLObject generation = (NIL != generation_tail) ? ((SubLObject) (cadr(generation_tail))) : NIL;
                SubLObject main_entry_tail = property_list_member($MAIN_ENTRY, current);
                SubLObject main_entry = (NIL != main_entry_tail) ? ((SubLObject) (cadr(main_entry_tail))) : NIL;
                SubLObject sort_key_tail = property_list_member($SORT_KEY, current);
                SubLObject sort_key = (NIL != sort_key_tail) ? ((SubLObject) (cadr(sort_key_tail))) : NIL;
                if (NIL != main_entry) {
                    cb_uia_glossary_show_main_entry(interaction, cycl, sort_key, glossary_term_info_table);
                } else {
                    cb_uia_glossary_show_alternate_entry(cycl, generation, sort_key, glossary_term_info_table);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_glossary_show_main_entry(SubLObject interaction, SubLObject cycl, SubLObject sort_key, SubLObject glossary_term_info_table) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject content_item = gethash(cycl, glossary_term_info_table, UNPROVIDED);
                SubLObject datum = content_item;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_9 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt31);
                    current_9 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt31);
                    if (NIL == member(current_9, $list_alt32, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_9 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt31);
                }
                {
                    SubLObject term_tail = property_list_member($TERM, current);
                    SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                    SubLObject preferred_html_tail = property_list_member($PREFERRED_HTML, current);
                    SubLObject preferred_html = (NIL != preferred_html_tail) ? ((SubLObject) (cadr(preferred_html_tail))) : NIL;
                    SubLObject preferred_generation_tail = property_list_member($PREFERRED_GENERATION, current);
                    SubLObject preferred_generation = (NIL != preferred_generation_tail) ? ((SubLObject) (cadr(preferred_generation_tail))) : NIL;
                    SubLObject alt_phrases_tail = property_list_member($ALT_PHRASES, current);
                    SubLObject alt_phrases = (NIL != alt_phrases_tail) ? ((SubLObject) (cadr(alt_phrases_tail))) : NIL;
                    SubLObject similar_terms_tail = property_list_member($SIMILAR_TERMS, current);
                    SubLObject similar_terms = (NIL != similar_terms_tail) ? ((SubLObject) (cadr(similar_terms_tail))) : NIL;
                    SubLObject definition_tail = property_list_member($DEFINITION, current);
                    SubLObject definition = (NIL != definition_tail) ? ((SubLObject) (cadr(definition_tail))) : NIL;
                    SubLObject instances_tail = property_list_member($INSTANCES, current);
                    SubLObject v_instances = (NIL != instances_tail) ? ((SubLObject) (cadr(instances_tail))) : NIL;
                    SubLObject instance_classification_tail = property_list_member($INSTANCE_CLASSIFICATION, current);
                    SubLObject instance_classification = (NIL != instance_classification_tail) ? ((SubLObject) (cadr(instance_classification_tail))) : NIL;
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uia_glossary_potentially_emit_alphabet_anchor(sort_key);
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    if (NIL != preferred_generation) {
                                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(preferred_generation);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_markup(preferred_html);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt41$___A__, definition);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    if (NIL != alt_phrases) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_indent(THREE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
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
                                                                html_utilities.html_princ($str_alt42$Alternative_phrases__);
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
                                                                html_utilities.html_markup(string_for_list_comma_separated(alt_phrases));
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
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
                    if (NIL != similar_terms) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_indent(THREE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt43$Similar_to___S__);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ(string_for_list_comma_separated(similar_terms));
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
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
                    if (NIL != v_instances) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_uia_glossary_show_instances(v_instances, interaction);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uia_glossary_show_instances(SubLObject v_instances, SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sorted_instances = cb_uia_glossary_classify_instances(v_instances, interaction);
                SubLObject cdolist_list_var = sorted_instances;
                SubLObject list_item = NIL;
                for (list_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , list_item = cdolist_list_var.first()) {
                    {
                        SubLObject datum = list_item;
                        SubLObject current = datum;
                        SubLObject sort_key = NIL;
                        SubLObject v_instances_26 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt44);
                        sort_key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt44);
                        v_instances_26 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(THREE_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(sort_key);
                                            html_utilities.html_princ($str_alt45$__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject instance = v_instances_26.first();
                                                SubLObject generation = cb_uia_glossary_preferred_phrase_for_term(interaction, instance);
                                                SubLObject url_string = cconcatenate($str_alt46$_, generation);
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(url_string);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), generation);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            }
                                            {
                                                SubLObject cdolist_list_var_31 = v_instances_26.rest();
                                                SubLObject instance = NIL;
                                                for (instance = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , instance = cdolist_list_var_31.first()) {
                                                    {
                                                        SubLObject generation = cb_uia_glossary_preferred_phrase_for_term(interaction, instance);
                                                        SubLObject url_string = cconcatenate($str_alt46$_, generation);
                                                        html_utilities.html_princ($str_alt47$__);
                                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(url_string);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), generation);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    }
                                                }
                                            }
                                            html_utilities.html_newline(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt44);
                        }
                    }
                }
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return list; of form ((classification list-of-instances) (classification list-of-instances)...)
     */
    public static final SubLObject cb_uia_glossary_classify_instances(SubLObject v_instances, SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject classification_dict = dictionary.new_dictionary(EQUAL, THREE_INTEGER);
                SubLObject glossary_contents = user_interaction_agenda.ui_state_lookup(interaction, $GLOSSARY_TERM_INFO_TABLE, UNPROVIDED);
                SubLObject result = NIL;
                SubLObject cdolist_list_var = v_instances;
                SubLObject instance = NIL;
                for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                    {
                        SubLObject term_content = uia_tools_glossary.glossary_info_for_term(instance, glossary_contents);
                        SubLObject term_classification = getf(term_content, $INSTANCE_CLASSIFICATION, $$$Unclassified_Instances);
                        dictionary_utilities.dictionary_pushnew(classification_dict, term_classification, instance, UNPROVIDED, UNPROVIDED);
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(classification_dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject index_key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject terms = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = cons(list(index_key, terms), result);
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                result = Sort.sort(result, STRING_LESSP, FIRST);
                return result;
            }
        }
    }

    public static final SubLObject cb_uia_glossary_show_alternate_entry(SubLObject cycl, SubLObject generation, SubLObject sort_key, SubLObject glossary_term_info_table) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject content_item = gethash(cycl, glossary_term_info_table, UNPROVIDED);
                SubLObject datum = content_item;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_33 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt51);
                    current_33 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt51);
                    if (NIL == member(current_33, $list_alt52, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_33 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt51);
                }
                {
                    SubLObject preferred_generation_tail = property_list_member($PREFERRED_GENERATION, current);
                    SubLObject preferred_generation = (NIL != preferred_generation_tail) ? ((SubLObject) (cadr(preferred_generation_tail))) : NIL;
                    SubLObject preferred_html_tail = property_list_member($PREFERRED_HTML, current);
                    SubLObject preferred_html = (NIL != preferred_html_tail) ? ((SubLObject) (cadr(preferred_html_tail))) : NIL;
                    SubLObject definition_tail = property_list_member($DEFINITION, current);
                    SubLObject definition = (NIL != definition_tail) ? ((SubLObject) (cadr(definition_tail))) : NIL;
                    SubLObject instances_tail = property_list_member($INSTANCES, current);
                    SubLObject v_instances = (NIL != instances_tail) ? ((SubLObject) (cadr(instances_tail))) : NIL;
                    SubLObject similar_terms_tail = property_list_member($SIMILAR_TERMS, current);
                    SubLObject similar_terms = (NIL != similar_terms_tail) ? ((SubLObject) (cadr(similar_terms_tail))) : NIL;
                    SubLObject alt_phrases_tail = property_list_member($ALT_PHRASES, current);
                    SubLObject alt_phrases = (NIL != alt_phrases_tail) ? ((SubLObject) (cadr(alt_phrases_tail))) : NIL;
                    SubLObject term_tail = property_list_member($TERM, current);
                    SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                    SubLObject instance_classification_tail = property_list_member($INSTANCE_CLASSIFICATION, current);
                    SubLObject instance_classification = (NIL != instance_classification_tail) ? ((SubLObject) (cadr(instance_classification_tail))) : NIL;
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uia_glossary_potentially_emit_alphabet_anchor(sort_key);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    format(html_macros.$html_stream$.getDynamicValue(thread), generation);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt41$___A__, definition);
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
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(ZERO_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_indent(THREE_INTEGER);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt53$See__);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject anchor_link = cconcatenate($str_alt46$_, preferred_generation);
                                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(anchor_link);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), preferred_generation);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
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
            return NIL;
        }
    }

    public static final SubLObject string_for_list_comma_separated(SubLObject list) {
        {
            SubLObject result = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                princ(list.first(), stream);
                {
                    SubLObject cdolist_list_var = list.rest();
                    SubLObject list_item = NIL;
                    for (list_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , list_item = cdolist_list_var.first()) {
                        princ($str_alt47$__, stream);
                        princ(list_item, stream);
                    }
                }
                result = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject cb_uia_glossary_preferred_phrase_for_term(SubLObject interaction, SubLObject v_term) {
        {
            SubLObject glossary_contents = user_interaction_agenda.ui_state_lookup(interaction, $GLOSSARY_TERM_INFO_TABLE, UNPROVIDED);
            SubLObject term_content = uia_tools_glossary.glossary_info_for_term(v_term, glossary_contents);
            SubLObject preferred_phrase = getf(term_content, $PREFERRED_GENERATION, UNPROVIDED);
            return preferred_phrase;
        }
    }

    public static final SubLObject cb_uia_glossary_commands(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject possible_glossaries = user_interaction_agenda.ui_state_lookup(interaction, $POSSIBLE_GLOSSARIES, UNPROVIDED);
                SubLObject start_glossary = user_interaction_agenda.ui_state_lookup(interaction, $GLOSSARY, NIL);
                SubLObject alt_phrases_separate = user_interaction_agenda.ui_state_lookup(interaction, $ALT_PHRASES_SEPARATE, UNPROVIDED);
                html_utilities.html_newline(TWO_INTEGER);
                if (NIL != possible_glossaries) {
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
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(TWO_INTEGER);
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
                                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt57$glossary_to_use);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ONE_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject cdolist_list_var = possible_glossaries;
                                                        SubLObject possibility = NIL;
                                                        for (possibility = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , possibility = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject generation = uia_trampolines.uia_term_phrase(v_agenda, possibility, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                SubLObject value = write_to_string(possibility, EMPTY_SUBL_OBJECT_ARRAY);
                                                                SubLObject selected = eq(possibility, start_glossary);
                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                if (NIL != selected) {
                                                                    html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                }
                                                                if (NIL != value) {
                                                                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(value);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(generation);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_submit_input($$$Display, $$$continue, UNPROVIDED);
                                            html_utilities.html_submit_input($$$Recompute, $$$recompute, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_checkbox_input($str_alt62$alt_phrases_separate, T, alt_phrases_separate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_princ($str_alt63$Show_alternate_phrases_as_separat);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } else {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt64$There_are_no_glossaries_defined_f, uia_trampolines.uia_html_term_phrase_np(v_agenda, uia_setup_state.uia_topic(v_agenda), UNPROVIDED, UNPROVIDED));
                }
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uia_glossary_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject selected_glossary = html_utilities.html_extract_input($str_alt57$glossary_to_use, args);
            SubLObject alt_phrases_separate = html_utilities.html_extract_input($str_alt62$alt_phrases_separate, args);
            SubLObject display_type = (NIL != html_utilities.html_extract_input($$$continue, args)) ? ((SubLObject) ($REFRESH)) : $RECOMPUTE;
            SubLObject reply = NIL;
            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, display_type, list($GLOSSARY_NAME, selected_glossary, $ALT_PHRASES_SEPARATE, alt_phrases_separate));
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject declare_cb_uia_tools_glossary_file() {
        declareFunction("cb_uia_glossary_hint_method", "CB-UIA-GLOSSARY-HINT-METHOD", 1, 0, false);
        declareFunction("cb_uia_show_glossary", "CB-UIA-SHOW-GLOSSARY", 1, 0, false);
        declareFunction("cb_link_uia_glossary", "CB-LINK-UIA-GLOSSARY", 0, 1, false);
        declareFunction("cb_uia_glossary_render_request", "CB-UIA-GLOSSARY-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uia_glossary_render_guts", "CB-UIA-GLOSSARY-RENDER-GUTS", 3, 0, false);
        declareFunction("cb_uia_glossary_header", "CB-UIA-GLOSSARY-HEADER", 2, 0, false);
        declareFunction("cb_uia_glossary_contents", "CB-UIA-GLOSSARY-CONTENTS", 3, 0, false);
        declareFunction("cb_uia_glossary_emit_alphabet_links", "CB-UIA-GLOSSARY-EMIT-ALPHABET-LINKS", 1, 0, false);
        declareFunction("cb_uia_glossary_potentially_emit_alphabet_anchor", "CB-UIA-GLOSSARY-POTENTIALLY-EMIT-ALPHABET-ANCHOR", 1, 0, false);
        declareFunction("cb_uia_glossary_show_item", "CB-UIA-GLOSSARY-SHOW-ITEM", 3, 0, false);
        declareFunction("cb_uia_glossary_show_main_entry", "CB-UIA-GLOSSARY-SHOW-MAIN-ENTRY", 4, 0, false);
        declareFunction("cb_uia_glossary_show_instances", "CB-UIA-GLOSSARY-SHOW-INSTANCES", 2, 0, false);
        declareFunction("cb_uia_glossary_classify_instances", "CB-UIA-GLOSSARY-CLASSIFY-INSTANCES", 2, 0, false);
        declareFunction("cb_uia_glossary_show_alternate_entry", "CB-UIA-GLOSSARY-SHOW-ALTERNATE-ENTRY", 4, 0, false);
        declareFunction("string_for_list_comma_separated", "STRING-FOR-LIST-COMMA-SEPARATED", 1, 0, false);
        declareFunction("cb_uia_glossary_preferred_phrase_for_term", "CB-UIA-GLOSSARY-PREFERRED-PHRASE-FOR-TERM", 2, 0, false);
        declareFunction("cb_uia_glossary_commands", "CB-UIA-GLOSSARY-COMMANDS", 1, 0, false);
        declareFunction("cb_uia_glossary_handler", "CB-UIA-GLOSSARY-HANDLER", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_tools_glossary_file() {
        deflexical("*CB-UIA-MIN-GLOSSARY-TERMS-FOR-ALPHABET*", NIL != boundp($cb_uia_min_glossary_terms_for_alphabet$) ? ((SubLObject) ($cb_uia_min_glossary_terms_for_alphabet$.getGlobalValue())) : TWENTY_INTEGER);
        defconstant("*CB-UIA-GLOSSARY-ANCHORS*", $str_alt20$0123456789abcdefghijklmnopqrstuvw);
        defparameter("*CB-UIA-GLOSSARY-ANCHORS-TO-EMIT*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_tools_glossary_file() {
                cb_uia_tool_declaration.declare_cb_uia_tool($GLOSSARY, $list_alt1);
        html_macros.note_html_handler_function(CB_UIA_SHOW_GLOSSARY);
        cb_utilities.setup_cb_link_method($UIA_GLOSSARY, CB_LINK_UIA_GLOSSARY, ONE_INTEGER);
        subl_macro_promotions.declare_defglobal($cb_uia_min_glossary_terms_for_alphabet$);
        html_macros.note_html_handler_function(CB_UIA_GLOSSARY_HANDLER);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $GLOSSARY = makeKeyword("GLOSSARY");

    static private final SubLList $list_alt1 = list(makeKeyword("HINT-METHOD"), makeSymbol("CB-UIA-GLOSSARY-HINT-METHOD"), makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIA-GLOSSARY-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("Glossary")));

    static private final SubLString $str_alt2$Cyc_Glossary___A = makeString("Cyc Glossary: ~A");

    static private final SubLString $$$Cyc_Glossary = makeString("Cyc Glossary");



    private static final SubLSymbol CB_UIA_SHOW_GLOSSARY = makeSymbol("CB-UIA-SHOW-GLOSSARY");



    static private final SubLString $str_alt7$cb_uia_show_glossary = makeString("cb-uia-show-glossary");

    private static final SubLSymbol $UIA_GLOSSARY = makeKeyword("UIA-GLOSSARY");

    private static final SubLSymbol CB_LINK_UIA_GLOSSARY = makeSymbol("CB-LINK-UIA-GLOSSARY");

    static private final SubLList $list_alt10 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("SIGNATURE"), makeSymbol("PLIST"));



    static private final SubLList $list_alt12 = list(makeSymbol("&KEY"), makeSymbol("GLOSSARY"), makeSymbol("GLOSSARY-TERMS"), makeSymbol("GLOSSARY-TERM-INFO-TABLE"));

    static private final SubLList $list_alt13 = list(makeKeyword("GLOSSARY"), makeKeyword("GLOSSARY-TERMS"), makeKeyword("GLOSSARY-TERM-INFO-TABLE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $GLOSSARY_TERMS = makeKeyword("GLOSSARY-TERMS");

    private static final SubLSymbol $GLOSSARY_TERM_INFO_TABLE = makeKeyword("GLOSSARY-TERM-INFO-TABLE");

    static private final SubLString $str_alt17$cb_uia_glossary_handler = makeString("cb-uia-glossary-handler");

    static private final SubLString $$$id = makeString("id");

    public static final SubLSymbol $cb_uia_min_glossary_terms_for_alphabet$ = makeSymbol("*CB-UIA-MIN-GLOSSARY-TERMS-FOR-ALPHABET*");

    static private final SubLString $str_alt20$0123456789abcdefghijklmnopqrstuvw = makeString("0123456789abcdefghijklmnopqrstuvwxyz");



    private static final SubLSymbol $SORT_KEY = makeKeyword("SORT-KEY");

    static private final SubLString $str_alt23$_ = makeString("[");

    static private final SubLString $str_alt24$_ = makeString(" ");

    static private final SubLString $str_alt25$__A = makeString("#~A");

    static private final SubLString $str_alt26$_ = makeString("]");

    static private final SubLList $list_alt27 = list(makeSymbol("&KEY"), makeSymbol("CYCL"), makeSymbol("GENERATION"), makeSymbol("MAIN-ENTRY"), makeSymbol("SORT-KEY"));

    static private final SubLList $list_alt28 = list($CYCL, makeKeyword("GENERATION"), makeKeyword("MAIN-ENTRY"), makeKeyword("SORT-KEY"));



    private static final SubLSymbol $MAIN_ENTRY = makeKeyword("MAIN-ENTRY");

    static private final SubLList $list_alt31 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("TERM"), makeSymbol("PREFERRED-HTML"), makeSymbol("PREFERRED-GENERATION"), makeSymbol("ALT-PHRASES"), makeSymbol("SIMILAR-TERMS"), makeSymbol("DEFINITION"), makeSymbol("INSTANCES"), makeSymbol("INSTANCE-CLASSIFICATION") });

    static private final SubLList $list_alt32 = list($TERM, makeKeyword("PREFERRED-HTML"), makeKeyword("PREFERRED-GENERATION"), makeKeyword("ALT-PHRASES"), makeKeyword("SIMILAR-TERMS"), makeKeyword("DEFINITION"), makeKeyword("INSTANCES"), makeKeyword("INSTANCE-CLASSIFICATION"));



    private static final SubLSymbol $PREFERRED_HTML = makeKeyword("PREFERRED-HTML");

    private static final SubLSymbol $PREFERRED_GENERATION = makeKeyword("PREFERRED-GENERATION");

    private static final SubLSymbol $ALT_PHRASES = makeKeyword("ALT-PHRASES");

    private static final SubLSymbol $SIMILAR_TERMS = makeKeyword("SIMILAR-TERMS");



    private static final SubLSymbol $INSTANCES = makeKeyword("INSTANCES");

    private static final SubLSymbol $INSTANCE_CLASSIFICATION = makeKeyword("INSTANCE-CLASSIFICATION");

    static private final SubLString $str_alt41$___A__ = makeString(": ~A~%");

    static private final SubLString $str_alt42$Alternative_phrases__ = makeString("Alternative phrases: ");

    static private final SubLString $str_alt43$Similar_to___S__ = makeString("Similar to: ~S~%");

    static private final SubLList $list_alt44 = list(makeSymbol("SORT-KEY"), makeSymbol("INSTANCES"));

    static private final SubLString $str_alt45$__ = makeString(": ");

    static private final SubLString $str_alt46$_ = makeString("#");

    static private final SubLString $str_alt47$__ = makeString(", ");

    static private final SubLString $$$Unclassified_Instances = makeString("Unclassified Instances");





    static private final SubLList $list_alt51 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("PREFERRED-GENERATION"), makeSymbol("PREFERRED-HTML"), makeSymbol("DEFINITION"), makeSymbol("INSTANCES"), makeSymbol("SIMILAR-TERMS"), makeSymbol("ALT-PHRASES"), makeSymbol("TERM"), makeSymbol("INSTANCE-CLASSIFICATION") });

    static private final SubLList $list_alt52 = list(makeKeyword("PREFERRED-GENERATION"), makeKeyword("PREFERRED-HTML"), makeKeyword("DEFINITION"), makeKeyword("INSTANCES"), makeKeyword("SIMILAR-TERMS"), makeKeyword("ALT-PHRASES"), $TERM, makeKeyword("INSTANCE-CLASSIFICATION"));

    static private final SubLString $str_alt53$See__ = makeString("See: ");

    private static final SubLSymbol $POSSIBLE_GLOSSARIES = makeKeyword("POSSIBLE-GLOSSARIES");

    private static final SubLSymbol $ALT_PHRASES_SEPARATE = makeKeyword("ALT-PHRASES-SEPARATE");



    static private final SubLString $str_alt57$glossary_to_use = makeString("glossary-to-use");

    static private final SubLString $$$Display = makeString("Display");

    static private final SubLString $$$continue = makeString("continue");

    static private final SubLString $$$Recompute = makeString("Recompute");

    static private final SubLString $$$recompute = makeString("recompute");

    static private final SubLString $str_alt62$alt_phrases_separate = makeString("alt-phrases-separate");

    static private final SubLString $str_alt63$Show_alternate_phrases_as_separat = makeString("Show alternate phrases as separate entries");

    static private final SubLString $str_alt64$There_are_no_glossaries_defined_f = makeString("There are no glossaries defined for the topic: ~S~%");





    private static final SubLSymbol $GLOSSARY_NAME = makeKeyword("GLOSSARY-NAME");

    private static final SubLSymbol CB_UIA_GLOSSARY_HANDLER = makeSymbol("CB-UIA-GLOSSARY-HANDLER");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_tools_glossary_file();
    }

    public void initializeVariables() {
        init_cb_uia_tools_glossary_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_tools_glossary_file();
    }
}

