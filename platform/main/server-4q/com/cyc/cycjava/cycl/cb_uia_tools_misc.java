/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-UIA-TOOLS-MISC
 *  source file: /cyc/top/cycl/cb-uia-tools-misc.lisp
 *  created:     2019/07/03 17:38:10
 */
public final class cb_uia_tools_misc extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_tools_misc() {
    }

    public static final SubLFile me = new cb_uia_tools_misc();


    // // Definitions
    public static final SubLObject cb_uiat_wff_checker_render_request(SubLObject request) {
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
                        SubLObject datum_1 = plist;
                        SubLObject current_2 = datum_1;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_2;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_1, $list_alt4);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_1, $list_alt4);
                            if (NIL == member(current_3, $list_alt5, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_1, $list_alt4);
                        }
                        {
                            SubLObject cycl_sentence_tail = property_list_member($CYCL_SENTENCE, current_2);
                            SubLObject cycl_sentence = (NIL != cycl_sentence_tail) ? ((SubLObject) (cadr(cycl_sentence_tail))) : NIL;
                            SubLObject why_not_wff_tail = property_list_member($WHY_NOT_WFF, current_2);
                            SubLObject why_not_wff = (NIL != why_not_wff_tail) ? ((SubLObject) (cadr(why_not_wff_tail))) : NIL;
                            SubLObject repairs_tail = property_list_member($REPAIRS, current_2);
                            SubLObject repairs = (NIL != repairs_tail) ? ((SubLObject) (cadr(repairs_tail))) : NIL;
                            return cb_uiat_wff_checker_guts(interaction, cycl_sentence, why_not_wff, repairs);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_wff_checker_guts(SubLObject interaction, SubLObject cycl_sentence, SubLObject why_not_wff, SubLObject repairs) {
        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
            html_script_utilities.html_js_focus_window();
        }
        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
        if (NIL != repairs) {
            cb_uiat_wff_repair_guts(interaction, cycl_sentence, why_not_wff, repairs);
        } else {
            cb_uiat_wff_unrepairable_guts(interaction, cycl_sentence, why_not_wff);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_wff_unrepairable_guts(SubLObject interaction, SubLObject cycl_sentence, SubLObject why_not_wff) {
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
                        html_utilities.html_hidden_input($str_alt10$cb_uiat_wff_handler, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_princ($str_alt12$Sorry_about_this__This_may_seem_a);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ($str_alt13$The_sentence_);
                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0_4 = pph_vars.$pph_show_type_level_violationsP$.currentBinding(thread);
                            try {
                                pph_vars.$pph_show_type_level_violationsP$.bind(T, thread);
                                cb_uia_display_primitives.cb_uia_show_sentence(cycl_sentence, UNPROVIDED);
                            } finally {
                                pph_vars.$pph_show_type_level_violationsP$.rebind(_prev_bind_0_4, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        html_utilities.html_princ($str_alt14$is_ill_formed_);
                        if (NIL != why_not_wff) {
                            html_utilities.html_princ($str_alt15$for_the_following_reasons_);
                            html_utilities.html_newline(TWO_INTEGER);
                            cb_uia_display_primitives.cb_uia_show_why_not_wff(why_not_wff);
                        } else {
                            html_utilities.html_princ($str_alt16$for_some_reason_);
                        }
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_submit_input($$$Continue, $$$continue, UNPROVIDED);
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

    public static final SubLObject cb_uiat_wff_repair_guts(SubLObject interaction, SubLObject cycl_sentence, SubLObject why_not_wff, SubLObject repairs) {
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
                        html_utilities.html_hidden_input($str_alt10$cb_uiat_wff_handler, T, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_princ($str_alt19$You_told_me_);
                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        cb_uia_display_primitives.cb_uia_show_sentence(cycl_sentence, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        html_utilities.html_princ($str_alt20$This_seems_to_rely_on_the_followi);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_uia_display_primitives.cb_uia_show_sentence(repairs.first(), UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ($str_alt21$Please_confirm_that_this_is_what_);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_submit_input($$$Confirm_Assumption, cconcatenate($str_alt23$add_fact_0, EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_submit_input($str_alt24$Assumption_Incorrect__Don_t_Add_F, $$$continue, UNPROVIDED);
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

    public static final SubLObject cb_uiat_wff_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject repairs = user_interaction_agenda.ui_state_lookup(interaction, $REPAIRS, UNPROVIDED);
            SubLObject reply = NIL;
            if (NIL != html_utilities.html_extract_input($$$continue, args)) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FAIL, $list_alt26);
            } else
                if (NIL != html_utilities.html_extract_input($str_alt27$add_all_facts, args)) {
                    reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $REPAIR, list($SENTENCES, repairs));
                } else {
                    {
                        SubLObject repairs_to_fix = NIL;
                        SubLObject list_var = NIL;
                        SubLObject repair = NIL;
                        SubLObject num = NIL;
                        for (list_var = repairs, repair = list_var.first(), num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , repair = list_var.first() , num = add(ONE_INTEGER, num)) {
                            {
                                SubLObject id = cconcatenate($str_alt30$add_fact_, write_to_string(num, EMPTY_SUBL_OBJECT_ARRAY));
                                if (NIL != html_utilities.html_extract_input(id, args)) {
                                    repairs_to_fix = cons(repair, repairs_to_fix);
                                }
                            }
                        }
                        reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $REPAIR, list($SENTENCES, repairs));
                    }
                }

            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_contradiction_finder_render_request(SubLObject request) {
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
                        SubLObject datum_5 = plist;
                        SubLObject current_6 = datum_5;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_6;
                        SubLObject bad = NIL;
                        SubLObject current_7 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_5, $list_alt34);
                            current_7 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_5, $list_alt34);
                            if (NIL == member(current_7, $list_alt35, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_7 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_5, $list_alt34);
                        }
                        {
                            SubLObject cycl_sentence_tail = property_list_member($CYCL_SENTENCE, current_6);
                            SubLObject cycl_sentence = (NIL != cycl_sentence_tail) ? ((SubLObject) (cadr(cycl_sentence_tail))) : NIL;
                            SubLObject contradiction_tail = property_list_member($CONTRADICTION, current_6);
                            SubLObject contradiction = (NIL != contradiction_tail) ? ((SubLObject) (cadr(contradiction_tail))) : NIL;
                            return cb_uiat_contradiction_finder_guts(interaction, cycl_sentence, contradiction);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_contradiction_finder_guts(SubLObject interaction, SubLObject cycl_sentence, SubLObject contradiction) {
        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
            html_script_utilities.html_js_focus_window();
        }
        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_princ($$$I_cannot_believe);
        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        cb_uia_display_primitives.cb_uia_show_sentence(cycl_sentence, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        html_utilities.html_princ($str_alt38$because_of_the_contradicting_fact);
        html_utilities.html_newline(TWO_INTEGER);
        cb_uia_display_primitives.cb_uia_show_contradiction(contradiction);
        html_utilities.html_newline(TWO_INTEGER);
        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt40$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_uiat_redundancy_detector_render_request(SubLObject request) {
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
                    user_interaction_agenda.ui_state_update(interaction, $kw43$ALREADY_SHOWN_, $TRUE);
                    {
                        SubLObject datum_8 = plist;
                        SubLObject current_9 = datum_8;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_9;
                        SubLObject bad = NIL;
                        SubLObject current_10 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_8, $list_alt45);
                            current_10 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_8, $list_alt45);
                            if (NIL == member(current_10, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_10 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_8, $list_alt45);
                        }
                        {
                            SubLObject cycl_sentence_tail = property_list_member($CYCL_SENTENCE, current_9);
                            SubLObject cycl_sentence = (NIL != cycl_sentence_tail) ? ((SubLObject) (cadr(cycl_sentence_tail))) : NIL;
                            SubLObject redundancy_tail = property_list_member($REDUNDANCY, current_9);
                            SubLObject redundancy = (NIL != redundancy_tail) ? ((SubLObject) (cadr(redundancy_tail))) : NIL;
                            return cb_uiat_redundancy_detector_guts(interaction, cycl_sentence, redundancy);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_redundancy_detector_guts(SubLObject interaction, SubLObject cycl_sentence, SubLObject redundancy) {
        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
            html_script_utilities.html_js_focus_window();
        }
        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_princ($$$I_already_know_that);
        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        cb_uia_display_primitives.cb_uia_show_sentence(cycl_sentence, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        {
            SubLObject isomorphic_support = cb_uiat_find_isomorphic_support(cycl_sentence, redundancy);
            SubLObject meta_supports = (NIL != arguments.support_p(isomorphic_support)) ? ((SubLObject) (uia_trampolines.uia_meta_supports(isomorphic_support))) : NIL;
            SubLObject isomorphic_assertion = find(cycl_sentence, meta_supports, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE), UNPROVIDED, UNPROVIDED);
            SubLObject no_further_justificationP = makeBoolean((NIL != assertion_handles.assertion_p(isomorphic_assertion)) && (NIL != list_utilities.singletonP(meta_supports)));
            if (NIL != no_further_justificationP) {
                cb_uiat_show_isomorphic_assertion(isomorphic_assertion, user_interaction_agenda.ui_agenda(interaction));
            } else
                if (NIL != meta_supports) {
                    html_utilities.html_princ($str_alt50$Here_are_my_reasons_for_believing);
                    html_utilities.html_newline(UNPROVIDED);
                    cb_uia_display_primitives.cb_uia_show_argument(meta_supports, $$$redundancy);
                } else
                    if (NIL == isomorphic_support) {
                        html_utilities.html_princ($$$because_of_the_redundant_fact);
                        if (NIL != list_utilities.lengthG(redundancy, ONE_INTEGER, UNPROVIDED)) {
                            html_utilities.html_princ($$$s);
                        }
                        html_utilities.html_princ($str_alt54$_);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_uia_display_primitives.cb_uia_show_redundancy(redundancy);
                    }


            html_utilities.html_newline(TWO_INTEGER);
            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt40$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_showXhide_sentence_justification(SubLObject v_agenda, SubLObject sentence_or_assertion, SubLObject v_arguments, SubLObject index_string) {
        if (index_string == UNPROVIDED) {
            index_string = $$$justification;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_id = index_string;
                html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt56$text_css);
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
                dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt59$);
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
                        cb_uiat_show_sentence_justification(v_agenda, sentence_or_assertion, v_arguments, index_string);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return sentence_or_assertion;
        }
    }

    public static final SubLObject cb_uiat_show_sentence_justification(SubLObject v_agenda, SubLObject sentence_or_assertion, SubLObject v_arguments, SubLObject index_string) {
        if (index_string == UNPROVIDED) {
            index_string = $$$justification;
        }
        {
            SubLObject cycl_sentence = (NIL != assertion_handles.assertion_p(sentence_or_assertion)) ? ((SubLObject) (uncanonicalizer.assertion_el_formula(sentence_or_assertion))) : sentence_or_assertion;
            SubLObject isomorphic_support = cb_uiat_find_isomorphic_support(cycl_sentence, v_arguments);
            SubLObject meta_supports = (NIL != arguments.support_p(isomorphic_support)) ? ((SubLObject) (uia_trampolines.uia_meta_supports(isomorphic_support))) : NIL;
            SubLObject isomorphic_assertion = find(cycl_sentence, meta_supports, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE), UNPROVIDED, UNPROVIDED);
            SubLObject no_further_justificationP = makeBoolean((NIL != assertion_handles.assertion_p(isomorphic_assertion)) && (NIL != list_utilities.singletonP(meta_supports)));
            if (NIL != no_further_justificationP) {
                cb_uiat_show_isomorphic_assertion(isomorphic_assertion, v_agenda);
            } else
                if (NIL != meta_supports) {
                    cb_uia_display_primitives.cb_uia_show_argument(meta_supports, index_string);
                } else {
                    cb_uia_display_primitives.cb_uia_show_arguments(v_arguments, UNPROVIDED, UNPROVIDED);
                }

        }
        return sentence_or_assertion;
    }

    /**
     * Inform the user that an isomorphic assertion to what the user is trying to
     * assert has already been asserted.
     *
     * @unknown baxter
     */
    public static final SubLObject cb_uiat_show_isomorphic_assertion(SubLObject isomorphic_assertion, SubLObject v_agenda) {
        return cb_uia_display_primitives.cb_uia_show_assert_info(isomorphic_assertion, v_agenda);
    }

    /**
     *
     *
     * @param ORIGINAL;
     * 		EL-FORMULA-P.
     * @param REDUNDANCY;
     * 		a list of lists of supports.
     * @return SUPPORT-P or NIL; A support that has the same CycL formula as ORIGINAL,
    from REDUNDANCY.
     * @unknown baxter
     */
    public static final SubLObject cb_uiat_find_isomorphic_support(SubLObject original, SubLObject redundancy) {
        if (NIL != assertion_handles.assertion_p(original)) {
            original = uncanonicalizer.assertion_el_formula(original);
        }
        {
            SubLObject ans = NIL;
            if (NIL == ans) {
                {
                    SubLObject csome_list_var = redundancy;
                    SubLObject argument = NIL;
                    for (argument = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , argument = csome_list_var.first()) {
                        if (NIL == ans) {
                            {
                                SubLObject csome_list_var_11 = argument;
                                SubLObject support = NIL;
                                for (support = csome_list_var_11.first(); !((NIL != ans) || (NIL == csome_list_var_11)); csome_list_var_11 = csome_list_var_11.rest() , support = csome_list_var_11.first()) {
                                    if (arguments.support_sentence(support).equal(original)) {
                                        ans = support;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != arguments.hl_support_p(ans)) {
                {
                    SubLObject isomorphic_assertion = cb_uiat_find_assertion_for_support(ans);
                    if (NIL != assertion_handles.assertion_p(isomorphic_assertion)) {
                        ans = isomorphic_assertion;
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject cb_uiat_find_assertion_for_support(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return support;
        } else
            if ($ASSERTION == arguments.support_module(support)) {
                return fi.sentence_assertion(arguments.support_sentence(support), arguments.support_mt(support));
            } else {
                {
                    SubLObject mt = arguments.support_mt(support);
                    SubLObject cnfs = clausifier.clausal_form(arguments.support_sentence(support), mt, UNPROVIDED);
                    SubLObject isomorphic_assertion = NIL;
                    if (NIL == isomorphic_assertion) {
                        {
                            SubLObject csome_list_var = cnfs;
                            SubLObject cnf = NIL;
                            for (cnf = csome_list_var.first(); !((NIL != isomorphic_assertion) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cnf = csome_list_var.first()) {
                                isomorphic_assertion = kb_indexing.find_assertion_genl_mts(cnf, mt);
                            }
                        }
                    }
                    return isomorphic_assertion;
                }
            }

    }

    public static final SubLObject uia_act_new_command_interaction(SubLObject v_agenda, SubLObject mode, SubLObject nl_sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $COMMAND_INTERACTION, list(nl_sentence), UNPROVIDED);
    }

    public static final SubLObject uiat_command_interaction_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt66);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt67$Command____A, sentence);
            } else {
                cdestructuring_bind_error(datum, $list_alt66);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_cmdint_solution_finder(SubLObject v_agenda, SubLObject args) {
        {
            SubLObject text = args.first();
            return cb_uia_tools_review_and_testing.uia_act_new_solution_finder(v_agenda, text, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_cycl_rkf_tools_to_commands$ = makeSymbol("*CB-UIAT-CYCL-RKF-TOOLS-TO-COMMANDS*");

    // deflexical
    private static final SubLSymbol $cb_uiat_cycl_rkf_tools_to_launchers$ = makeSymbol("*CB-UIAT-CYCL-RKF-TOOLS-TO-LAUNCHERS*");

    public static final SubLObject cb_uiat_command_interaction_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($DISAMBIGUATE_PHRASE)) {
                {
                    SubLObject result = user_interaction_agenda.ui_result(child);
                    user_interaction_agenda.ui_state_update(parent, $BEST_NL_REQUEST, result);
                }
            }
        }
        return parent;
    }

    public static final SubLObject cb_uiat_command_interaction_display(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            {
                SubLObject sentence = args.first();
                SubLObject datum = cb_uiat_cmdint_match_action(sentence, interaction);
                SubLObject current = datum;
                SubLObject handler = NIL;
                SubLObject args_12 = NIL;
                SubLObject constructor = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt85);
                handler = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt85);
                args_12 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt85);
                constructor = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ($CHILD != handler) {
                        if (handler.isFunctionSpec()) {
                            funcall(handler);
                        } else
                            if (constructor == $DEFAULT) {
                                user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, handler, args_12, UNPROVIDED);
                            } else
                                if (constructor.isFunction() || constructor.isSymbol()) {
                                    funcall(constructor, v_agenda, args_12);
                                } else {
                                    Errors.error($str_alt89$Sorry__do_not_know_how_to_call_ac, constructor);
                                }


                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, T);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt85);
                }
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    public static final SubLObject cb_uiat_cmdint_match_action(SubLObject text, SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                thread.resetMultipleValues();
                {
                    SubLObject handler = cb_uiat_cmdint_check_for_question_or_command(text, user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), user_interaction_agenda.uia_domain_interaction_mt(v_agenda), interaction);
                    SubLObject args = thread.secondMultipleValue();
                    SubLObject constructor = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != handler) {
                        return list(handler, args, constructor);
                    }
                }
                return list($ASSERTION_CREATOR, list(text), $DEFAULT);
            }
        }
    }

    /**
     *
     *
     * @param PARSES
     * 		list; a list of CycL sentences
     * @unknown stub, should really query the user if there are multiple tools
    we could launch
     */
    public static final SubLObject cb_uiat_nl_requests(SubLObject parses) {
        {
            SubLObject requests = NIL;
            SubLObject cdolist_list_var = parses;
            SubLObject constit = NIL;
            for (constit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constit = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_13 = constit.rest().first();
                    SubLObject parse = NIL;
                    for (parse = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , parse = cdolist_list_var_13.first()) {
                        if (cycl_utilities.formula_arg0(parse) == $$NLRequestFn) {
                            {
                                SubLObject item_var = parse;
                                if (NIL == member(item_var, requests, EQUALP, symbol_function(IDENTITY))) {
                                    requests = cons(item_var, requests);
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(requests);
        }
    }

    public static final SubLObject cb_uiat_cmdint_check_for_question_or_command(SubLObject text, SubLObject syntax_mt, SubLObject semantics_mt, SubLObject interaction) {
        {
            SubLObject parses = NIL;
            SubLObject constructor = $DEFAULT;
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject best_nl_request = user_interaction_agenda.ui_state_lookup(interaction, $BEST_NL_REQUEST, NIL);
            SubLObject nl_requests = NIL;
            SubLObject tool = NIL;
            SubLObject args = NIL;
            parses = rkf_text_processors.rkf_question_reader(text, syntax_mt, semantics_mt);
            if (NIL == cb_uiat_nl_requests(parses)) {
                parses = rkf_text_processors.rkf_imperative_reader(text, syntax_mt, semantics_mt);
            }
            if (NIL != parses) {
                nl_requests = (NIL != best_nl_request) ? ((SubLObject) (list(best_nl_request))) : cb_uiat_nl_requests(parses);
            }
            if (NIL != list_utilities.singletonP(nl_requests)) {
                {
                    SubLObject nl_request = nl_requests.first();
                    SubLObject tool_symbol = cycl_utilities.formula_arg2(nl_request, UNPROVIDED);
                    SubLObject v_arguments = cycl_utilities.formula_arg3(nl_request, UNPROVIDED);
                    tool = cb_uiat_map_tool_symbol_to_tool(tool_symbol);
                    if (NIL == tool) {
                        tool = cb_uiat_map_tool_symbol_to_launcher(tool_symbol);
                    }
                    if ((NIL == v_arguments) && (NIL != tool)) {
                        constructor = NIL;
                    } else
                        if ((NIL != list_utilities.singletonP(v_arguments)) && (tool == $ASSERTED_SENTENCES)) {
                            {
                                SubLObject argument = v_arguments.first();
                                if (NIL != rkf_concept_harvester.rkf_ch_parsing_surrogate_p(argument)) {
                                    {
                                        SubLObject v_term = cycl_utilities.formula_arg1(argument, UNPROVIDED);
                                        SubLObject parsing_category = cycl_utilities.formula_arg3(argument, UNPROVIDED);
                                        args = list(v_term, parsing_category);
                                    }
                                }
                            }
                        } else
                            if (v_arguments.isCons()) {
                                {
                                    SubLObject cdolist_list_var = v_arguments;
                                    SubLObject argument = NIL;
                                    for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                        if (argument.isString()) {
                                            args = cons(argument, args);
                                        }
                                        if (NIL != rkf_concept_harvester.rkf_ch_parsing_surrogate_p(argument)) {
                                            args = cons(cycl_utilities.formula_arg1(argument, UNPROVIDED), args);
                                        }
                                    }
                                }
                                args = nreverse(args);
                            }


                }
            } else
                if (NIL != list_utilities.lengthGE(nl_requests, TWO_INTEGER, UNPROVIDED)) {
                    {
                        SubLObject child = uia_tools_basic.uia_act_new_disambiguate_phrase(v_agenda, $REQUIRED, text, nl_requests, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                        return values($CHILD, $CHILD, $CHILD);
                    }
                } else
                    if (NIL != string_utilities.substringP($str_alt93$_, text, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        tool = $SOLUTION_FINDER;
                        args = list(text);
                        constructor = symbol_function(CB_UIAT_CMDINT_SOLUTION_FINDER);
                    }


            return values(tool, args, constructor);
        }
    }

    public static final SubLObject cb_uiat_map_tool_symbol_to_tool(SubLObject tool_symbol) {
        return second(assoc(tool_symbol, $cb_uiat_cycl_rkf_tools_to_commands$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_uiat_map_tool_symbol_to_launcher(SubLObject tool_symbol) {
        return second(assoc(tool_symbol, $cb_uiat_cycl_rkf_tools_to_launchers$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_link_uia_concept_killer(SubLObject v_term, SubLObject linktext) {
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
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt97$cb_uia_concept_killer, arglist);
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

    public static final SubLObject cb_uia_concept_killer(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt100);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $CONCEPT_KILLER, $LAUNCH, list($TERM, v_term));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt100);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_precision_suggestor_render_request(SubLObject request) {
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
                if (pcase_var.eql($SHOW_FACETS)) {
                    {
                        SubLObject datum_14 = plist;
                        SubLObject current_15 = datum_14;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_15;
                        SubLObject bad = NIL;
                        SubLObject current_16 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_14, $list_alt108);
                            current_16 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_14, $list_alt108);
                            if (NIL == member(current_16, $list_alt109, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_16 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_14, $list_alt108);
                        }
                        {
                            SubLObject type_collections_tail = property_list_member($TYPE_COLLECTIONS, current_15);
                            SubLObject type_collections = (NIL != type_collections_tail) ? ((SubLObject) (cadr(type_collections_tail))) : NIL;
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_15);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject argnum_tail = property_list_member($ARGNUM, current_15);
                            SubLObject argnum = (NIL != argnum_tail) ? ((SubLObject) (cadr(argnum_tail))) : NIL;
                            return cb_uiat_precision_suggestor_show_facets(interaction, type_collections, sentence, argnum);
                        }
                    }
                } else {
                    {
                        SubLObject datum_17 = plist;
                        SubLObject current_18 = datum_17;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_18;
                        SubLObject bad = NIL;
                        SubLObject current_19 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_17, $list_alt113);
                            current_19 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_17, $list_alt113);
                            if (NIL == member(current_19, $list_alt114, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_19 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_17, $list_alt113);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_18);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject generalize_tail = property_list_member($GENERALIZE, current_18);
                            SubLObject generalize = (NIL != generalize_tail) ? ((SubLObject) (cadr(generalize_tail))) : NIL;
                            SubLObject suggestions_tail = property_list_member($SUGGESTIONS, current_18);
                            SubLObject suggestions = (NIL != suggestions_tail) ? ((SubLObject) (cadr(suggestions_tail))) : NIL;
                            SubLObject faceting_type_col_tail = property_list_member($FACETING_TYPE_COL, current_18);
                            SubLObject faceting_type_col = (NIL != faceting_type_col_tail) ? ((SubLObject) (cadr(faceting_type_col_tail))) : NIL;
                            SubLObject weak_suggestions_tail = property_list_member($WEAK_SUGGESTIONS, current_18);
                            SubLObject weak_suggestions = (NIL != weak_suggestions_tail) ? ((SubLObject) (cadr(weak_suggestions_tail))) : NIL;
                            SubLObject argnum_tail = property_list_member($ARGNUM, current_18);
                            SubLObject argnum = (NIL != argnum_tail) ? ((SubLObject) (cadr(argnum_tail))) : NIL;
                            return cb_uiat_precision_suggestor_arg_guts(interaction, action_type, sentence, generalize, suggestions, weak_suggestions, argnum, faceting_type_col);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param ACTION-TYPE
     * 		keywordp; :SHOW-ARG or :SHOW-SENTENCE - Do we display just
     * 		replacements args or whole replacement sentences to the user?
     * @param SENTENCE;
     * 		The CycL sentence being strengthened/weakened.
     * @param GENERALIZE
     * 		keywordp; :TRUE or :FALSE.
     * @param SUGGESTIONS;
     * 		Candidate replacement sentences or argARGNUMs for strengthening SENTENCE.
     * @param WEAK-SUGGESTIONS;
     * 		Candidates for weakening SENTENCE.
     * @param ARGNUM
     * 		integerp; Which arg are we focusing on?
     */
    public static final SubLObject cb_uiat_precision_suggestor_arg_guts(SubLObject interaction, SubLObject action_type, SubLObject sentence, SubLObject generalize, SubLObject suggestions, SubLObject weak_suggestions, SubLObject argnum, SubLObject faceting_type_col) {
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
                        html_utilities.html_hidden_input($str_alt119$cb_uiat_precision_suggestor_form_, T, UNPROVIDED);
                        {
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                            html_utilities.html_hidden_input($$$interaction, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, interaction), UNPROVIDED);
                            html_utilities.html_hidden_input($str_alt121$action_type, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, action_type), UNPROVIDED);
                            html_utilities.html_hidden_input($$$generalize, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, generalize), UNPROVIDED);
                            html_utilities.html_hidden_input($$$argnum, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, argnum), UNPROVIDED);
                            html_utilities.html_hidden_input($str_alt124$strong_max, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, length(suggestions)), UNPROVIDED);
                            html_utilities.html_hidden_input($str_alt125$weak_max, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, length(weak_suggestions)), UNPROVIDED);
                        }
                        {
                            SubLObject focus_term = cycl_utilities.sentence_arg(sentence, argnum, UNPROVIDED);
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                            SubLObject only_weaker_optionsP = makeBoolean((NIL == suggestions) && (NIL != weak_suggestions));
                            SubLObject agr_pred = NIL;
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
                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject pcase_var = action_type;
                                        if (pcase_var.eql($SHOW_ARG)) {
                                            agr_pred = cb_uiat_precision_suggestor_show_current_sentence(v_agenda, sentence, argnum, NIL != only_weaker_optionsP ? ((SubLObject) ($WEAKER_OPTIONS)) : $STRONGER_OPTIONS, focus_term, faceting_type_col);
                                        } else
                                            if (pcase_var.eql($SHOW_SENTENCE)) {
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
                                                            html_utilities.html_markup(FIVE_INTEGER);
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
                                                                if (NIL != only_weaker_optionsP) {
                                                                    html_utilities.html_princ($str_alt132$It_s_possible__but_unlikely__that);
                                                                } else {
                                                                    html_utilities.html_princ($str_alt133$Are_any_of_the_following_more_pre);
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                                cb_uia_display_primitives.cb_uia_show_sentence(sentence, UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                                if (NIL == only_weaker_optionsP) {
                                                                    html_utilities.html_princ($str_alt134$and_still_true_);
                                                                }
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
                                            } else
                                                if (pcase_var.eql($SHOW_SENTENCE_CHANGE_REQUIRED)) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(FIVE_INTEGER);
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
                                                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt136$Which_of_the_following_more_preci);
                                                                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                                    cb_uia_display_primitives.cb_uia_show_sentence(sentence, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                                    html_utilities.html_princ($str_alt137$did_you_mean_);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
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


                                    }
                                    {
                                        SubLObject default_type = ($TRUE == generalize) ? ((SubLObject) ($GENERALIZE_EXACTLY)) : $SPECIALIZE_EXACTLY;
                                        if (action_type != $SHOW_SENTENCE_CHANGE_REQUIRED) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_utilities.cb_link($UIA_PRECISION_SUGGESTOR_NONE_HANDLER, interaction, default_type, argnum, NIL != only_weaker_optionsP ? ((SubLObject) ($str_alt141$_press_here_to_confirm_this_inter)) : $str_alt142$_No__the_original_sentence_is_fin, UNPROVIDED);
                                                            html_utilities.html_newline(TWO_INTEGER);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                        {
                                            SubLObject v_agenda_27 = user_interaction_agenda.ui_agenda(interaction);
                                            SubLObject generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda_27);
                                            SubLObject domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda_27);
                                            SubLObject one_time_shotP = NIL;
                                            SubLObject force = (action_type == $SHOW_ARG) ? ((SubLObject) ($NONE)) : $DECLARATIVE;
                                            SubLObject clarify_linksP = T;
                                            SubLObject original = (action_type == $SHOW_ARG) ? ((SubLObject) (focus_term)) : sentence;
                                            SubLObject term_phrase_pairs = uia_trampolines.uia_terms_distinguishing_phrases(v_agenda_27, cons(original, suggestions), generation_mt, domain_mt, one_time_shotP, force, clarify_linksP, NIL, agr_pred);
                                            SubLObject list_var = NIL;
                                            SubLObject suggestion = NIL;
                                            SubLObject index = NIL;
                                            for (list_var = (NIL != only_weaker_optionsP) ? ((SubLObject) (weak_suggestions)) : suggestions, suggestion = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , suggestion = list_var.first() , index = add(ONE_INTEGER, index)) {
                                                {
                                                    SubLObject phrase = second(assoc(suggestion, term_phrase_pairs, symbol_function(EQUAL), UNPROVIDED));
                                                    SubLObject basic_field_name = cconcatenate($$$strong, string_utilities.str(index));
                                                    SubLObject field_name = html_utilities.get_encoded_form_field_name(basic_field_name);
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
                                                                    html_utilities.html_checkbox_input(field_name, $$$on, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent(TWO_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
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
                                                                SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    if (NIL != phrase) {
                                                                        {
                                                                            SubLObject pcase_var = action_type;
                                                                            if (pcase_var.eql($SHOW_ARG)) {
                                                                                cb_uia_display_primitives.cb_uia_show_term_with_clarifying_link(suggestion, phrase);
                                                                            } else {
                                                                                cb_uia_display_primitives.cb_uia_show_sentence(suggestion, phrase);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        {
                                                                            SubLObject pcase_var = action_type;
                                                                            if (pcase_var.eql($SHOW_ARG)) {
                                                                                cb_uia_display_primitives.cb_uia_show_term_precise(suggestion, UNPROVIDED);
                                                                            } else {
                                                                                cb_uia_display_primitives.cb_uia_show_sentence_precise(suggestion);
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
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
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_newline(UNPROVIDED);
                            if (action_type == $SHOW_SENTENCE_CHANGE_REQUIRED) {
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt148$You_must_pick_at_least_one_of_the);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_newline(TWO_INTEGER);
                            }
                            html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_precision_suggestor_show_current_sentence(SubLObject v_agenda, SubLObject sentence, SubLObject argnum, SubLObject flavor, SubLObject focus_term, SubLObject facet) {
        if (facet == UNPROVIDED) {
            facet = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject agr_pred = NIL;
                SubLTrampolineFile.checkType(list(argnum), PPH_NESTED_ARG_LIST_P);
                SubLTrampolineFile.checkType(list(argnum), PPH_PRECISION_P);
                {
                    SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                    try {
                        pph_vars.$paraphrase_precision$.bind(list(argnum), thread);
                        {
                            SubLObject pph_output_list = uia_trampolines.uia_phrase_output_list(v_agenda, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject focus_term_position = list(argnum);
                            SubLObject focus_term_phrase = pph_main.pph_string_for_arg_position(focus_term_position, pph_output_list, UNPROVIDED);
                            SubLObject focus_term_agr_pred = pph_main.pph_agr_pred_for_arg_position(focus_term_position, pph_output_list);
                            agr_pred = focus_term_agr_pred;
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (flavor == $FACETS) {
                                                html_utilities.html_princ($str_alt153$You_just_told_me_that__);
                                            } else {
                                                html_utilities.html_princ($$$In_the_sentence);
                                            }
                                            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                            cb_uia_display_primitives.cb_uia_show_sentence_link(sentence, UNPROVIDED, UNPROVIDED);
                                            cb_uiat_precision_suggestor_show_output_list(pph_output_list, argnum);
                                            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                            {
                                                SubLObject pcase_var = flavor;
                                                if (pcase_var.eql($WEAKER_OPTIONS)) {
                                                    html_utilities.html_princ($str_alt155$would_you_like_to_replace_the_phr);
                                                    cb_uia_display_primitives.cb_uia_show_term(focus_term, focus_term_phrase);
                                                    html_utilities.html_princ($str_alt156$__with_any_of_the_following_);
                                                } else
                                                    if (pcase_var.eql($STRONGER_OPTIONS)) {
                                                        html_utilities.html_princ($str_alt157$could_you_replace_the_phrase__);
                                                        cb_uia_display_primitives.cb_uia_show_term(focus_term, focus_term_phrase);
                                                        if (NIL != forts.fort_p(facet)) {
                                                            html_utilities.html_princ($str_alt158$__with_something_that_has_);
                                                            cb_uia_display_primitives.cb_uia_show_term(facet, UNPROVIDED);
                                                            html_utilities.html_princ($str_alt54$_);
                                                        } else {
                                                            html_utilities.html_princ($str_alt156$__with_any_of_the_following_);
                                                        }
                                                    } else
                                                        if (pcase_var.eql($FACETS)) {
                                                            html_utilities.html_princ($str_alt159$I_d_like_to_know_what_more_specif);
                                                            cb_uia_display_primitives.cb_uia_show_term(focus_term, focus_term_phrase);
                                                            html_utilities.html_princ($str_alt160$_we_are_talking_about_);
                                                        }


                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    } finally {
                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
                    }
                }
                return agr_pred;
            }
        }
    }

    public static final SubLObject cb_uiat_precision_suggestor_show_facets(SubLObject interaction, SubLObject v_facets, SubLObject sentence, SubLObject argnum) {
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
                        html_utilities.html_hidden_input($str_alt161$cb_uiat_precision_suggestor_facet, T, UNPROVIDED);
                        {
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                            SubLObject focal_term = cycl_utilities.sentence_arg(sentence, argnum, UNPROVIDED);
                            html_utilities.html_hidden_input($$$interaction, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, interaction), UNPROVIDED);
                            html_utilities.html_hidden_input($$$argnum, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, argnum), UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(ZERO_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uiat_precision_suggestor_show_current_sentence(user_interaction_agenda.ui_agenda(interaction), sentence, argnum, $FACETS, focal_term, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt162$In_order_to_focus_this_part_of_th);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_utilities.cb_link($UIAT_PRECISION_SUGGESTOR_NO_FACETS, interaction, argnum, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject list_var = NIL;
                                                                SubLObject facet = NIL;
                                                                SubLObject counter = NIL;
                                                                for (list_var = v_facets, facet = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , facet = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                                                    {
                                                                        SubLObject color = (NIL != evenp(counter)) ? ((SubLObject) (html_macros.$html_color_light_blue$.getDynamicValue(thread))) : html_macros.$html_color_lighter_blue$.getDynamicValue(thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                if (NIL != color) {
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(color);
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        {
                                                                                            SubLObject value = cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, facet);
                                                                                            html_utilities.html_checkbox_input($$$facet, value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
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
                                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
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
                                                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        cb_uia_display_primitives.cb_uia_show_term_precise(facet, UNPROVIDED);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        html_utilities.html_newline(UNPROVIDED);
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
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_link_uiat_precision_suggestor_no_facets(SubLObject interaction, SubLObject argnum, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt166$_Do_not_focus_but_show_all_more_s;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, argnum);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt167$cb_uiat_precision_suggestor_no_fa, arglist);
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

    public static final SubLObject cb_uiat_precision_suggestor_no_facets_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject reply = NIL;
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject argnum = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt169);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt169);
            argnum = current.first();
            current = current.rest();
            if (NIL == current) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $CONSTRAIN_TO_FACETS, list($ARGNUM, argnum, $FACETS, NIL));
            } else {
                cdestructuring_bind_error(datum, $list_alt169);
            }
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_precision_suggestor_facet_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject reply = NIL;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.get_form_field_code(args), thread);
                        {
                            SubLObject interaction = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($$$interaction, args));
                            SubLObject argnum = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($$$argnum, args));
                            SubLObject encoded_facets = html_utilities.html_extract_input_values($$$facet, args);
                            SubLObject v_facets = NIL;
                            SubLObject cdolist_list_var = encoded_facets;
                            SubLObject encoded_facet = NIL;
                            for (encoded_facet = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , encoded_facet = cdolist_list_var.first()) {
                                {
                                    SubLObject facet = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, encoded_facet);
                                    v_facets = cons(facet, v_facets);
                                }
                            }
                            v_facets = nreverse(v_facets);
                            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $CONSTRAIN_TO_FACETS, list($ARGNUM, argnum, $FACETS, v_facets));
                        }
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_0, thread);
                    }
                }
                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            }
        }
    }

    // defconstant
    private static final SubLSymbol $cb_uiat_focus_text_highlight_color$ = makeSymbol("*CB-UIAT-FOCUS-TEXT-HIGHLIGHT-COLOR*");

    public static final SubLObject cb_uiat_precision_suggestor_show_output_list(SubLObject pph_output_list, SubLObject focus_argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject last_color = NIL;
                SubLObject list_var = NIL;
                SubLObject item = NIL;
                SubLObject i = NIL;
                for (list_var = pph_output_list, item = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , i = add(ONE_INTEGER, i)) {
                    {
                        SubLObject focusP = equal(list(focus_argnum), pph_data_structures.pph_phrase_output_item_arg_position(item));
                        SubLObject highlight_color = (NIL != focusP) ? ((SubLObject) ($cb_uiat_focus_text_highlight_color$.getGlobalValue())) : NIL;
                        SubLObject same_colorP = equal(last_color, highlight_color);
                        if (NIL == same_colorP) {
                            html_utilities.html_indent(UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_style_background_color(highlight_color);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != same_colorP) {
                                    html_utilities.html_indent(UNPROVIDED);
                                }
                                {
                                    SubLObject add_tagsP = T;
                                    SubLObject item_string = pph_phrase.pph_phrase_output_item_get_string(item, add_tagsP);
                                    if (i.isZero()) {
                                        item_string = pph_utilities.upcase_leading_smart(item_string);
                                    }
                                    format(html_macros.$html_stream$.getDynamicValue(thread), item_string);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        last_color = highlight_color;
                    }
                }
            }
            html_utilities.html_princ($str_alt174$_);
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_precision_suggestor_none_handler(SubLObject interaction, SubLObject type, SubLObject argnum, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject generalizeP = T;
                SubLObject pcase_var = type;
                if (pcase_var.eql($GENERALIZE_EXACTLY)) {
                } else
                    if (pcase_var.eql($SPECIALIZE_EXACTLY)) {
                        generalizeP = NIL;
                    } else
                        if (pcase_var.eql($WEAK_SPECIALIZE_EXACTLY)) {
                            generalizeP = NIL;
                        } else
                            if (pcase_var.eql($SPECIALIZE)) {
                                generalizeP = NIL;
                            } else
                                if (pcase_var.eql($WEAK_SPECIALIZE)) {
                                    generalizeP = NIL;
                                }




                {
                    SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    cb_parameters.cyc_cgi_url_int();
                    {
                        SubLObject arglist = list(interaction, generalizeP, argnum);
                        cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt178$cb_uiat_precision_suggestor_none_, arglist);
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_precision_suggestor_none_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject generalizeP = NIL;
            SubLObject argnum = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt180);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            generalizeP = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            argnum = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject arg_done = $YES;
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, list($GENERALIZE, misc_utilities.boolean_to_keyword(generalizeP), $CHOICES, $$$none, $ARGNUM, argnum, $ARG_DONE, arg_done));
                    if (NIL != reply) {
                        return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                    } else {
                        return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt180);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_precision_suggestor_form_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject reply = NIL;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.get_form_field_code(args), thread);
                        {
                            SubLObject interaction = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($$$interaction, args));
                            SubLObject action_type = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($str_alt121$action_type, args));
                            SubLObject sentence_or_arg = (action_type == $SHOW_ARG) ? ((SubLObject) ($ARG)) : $SENTENCE;
                            SubLObject generalize = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($$$generalize, args));
                            SubLObject argnum = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($$$argnum, args));
                            SubLObject strong_max = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($str_alt124$strong_max, args));
                            SubLObject weak_max = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($str_alt125$weak_max, args));
                            SubLObject choices = NIL;
                            {
                                SubLObject index = NIL;
                                for (index = ZERO_INTEGER; index.numL(strong_max); index = add(index, ONE_INTEGER)) {
                                    {
                                        SubLObject basic_field_name = cconcatenate($$$strong, string_utilities.str(index));
                                        SubLObject strong_field = html_utilities.get_encoded_form_field_name(basic_field_name);
                                        if (NIL != html_utilities.html_extract_input(strong_field, args)) {
                                            choices = cons(list(index, $FALSE), choices);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject index = NIL;
                                for (index = ZERO_INTEGER; index.numL(weak_max); index = add(index, ONE_INTEGER)) {
                                    {
                                        SubLObject weak_field = cconcatenate($$$weak, string_utilities.str(index));
                                        if (NIL != html_utilities.html_extract_input(weak_field, args)) {
                                            choices = cons(list(index, $TRUE), choices);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject arg_done = (NIL != choices) ? ((SubLObject) ($NO)) : $YES;
                                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, list(new SubLObject[]{ $GENERALIZE, generalize, $CHOICES, NIL != choices ? ((SubLObject) (choices)) : $$$none, $ARGNUM, argnum, $SENTENCE_OR_ARG, sentence_or_arg, $ARG_DONE, arg_done }));
                            }
                        }
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != reply) {
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                } else {
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            }
        }
    }

    public static final SubLObject cb_uiat_coa_evaluator_render_request(SubLObject request) {
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
                        SubLObject datum_46 = plist;
                        SubLObject current_47 = datum_46;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_47;
                        SubLObject bad = NIL;
                        SubLObject current_48 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_46, $list_alt194);
                            current_48 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_46, $list_alt194);
                            if (NIL == member(current_48, $list_alt195, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_48 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_46, $list_alt194);
                        }
                        {
                            SubLObject dimensions_tail = property_list_member($DIMENSIONS, current_47);
                            SubLObject dimensions = (NIL != dimensions_tail) ? ((SubLObject) (cadr(dimensions_tail))) : NIL;
                            SubLObject attributes_tail = property_list_member($ATTRIBUTES, current_47);
                            SubLObject attributes = (NIL != attributes_tail) ? ((SubLObject) (cadr(attributes_tail))) : NIL;
                            SubLObject matrix_tail = property_list_member($MATRIX, current_47);
                            SubLObject matrix = (NIL != matrix_tail) ? ((SubLObject) (cadr(matrix_tail))) : NIL;
                            SubLObject dimension_classification_tail = property_list_member($DIMENSION_CLASSIFICATION, current_47);
                            SubLObject dimension_classification = (NIL != dimension_classification_tail) ? ((SubLObject) (cadr(dimension_classification_tail))) : NIL;
                            SubLObject classification_ordering_tail = property_list_member($CLASSIFICATION_ORDERING, current_47);
                            SubLObject classification_ordering = (NIL != classification_ordering_tail) ? ((SubLObject) (cadr(classification_ordering_tail))) : NIL;
                            return cb_uiat_coa_evaluator_show_matrix(interaction, dimensions, attributes, matrix, dimension_classification, classification_ordering);
                        }
                    }
                } else
                    if (pcase_var.eql($SHOW_RESULTS)) {
                        {
                            SubLObject datum_49 = plist;
                            SubLObject current_50 = datum_49;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_50;
                            SubLObject bad = NIL;
                            SubLObject current_51 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_49, $list_alt194);
                                current_51 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_49, $list_alt194);
                                if (NIL == member(current_51, $list_alt195, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_51 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_49, $list_alt194);
                            }
                            {
                                SubLObject dimensions_tail = property_list_member($DIMENSIONS, current_50);
                                SubLObject dimensions = (NIL != dimensions_tail) ? ((SubLObject) (cadr(dimensions_tail))) : NIL;
                                SubLObject attributes_tail = property_list_member($ATTRIBUTES, current_50);
                                SubLObject attributes = (NIL != attributes_tail) ? ((SubLObject) (cadr(attributes_tail))) : NIL;
                                SubLObject matrix_tail = property_list_member($MATRIX, current_50);
                                SubLObject matrix = (NIL != matrix_tail) ? ((SubLObject) (cadr(matrix_tail))) : NIL;
                                SubLObject dimension_classification_tail = property_list_member($DIMENSION_CLASSIFICATION, current_50);
                                SubLObject dimension_classification = (NIL != dimension_classification_tail) ? ((SubLObject) (cadr(dimension_classification_tail))) : NIL;
                                SubLObject classification_ordering_tail = property_list_member($CLASSIFICATION_ORDERING, current_50);
                                SubLObject classification_ordering = (NIL != classification_ordering_tail) ? ((SubLObject) (cadr(classification_ordering_tail))) : NIL;
                                return cb_uiat_coa_evaluator_show_results_matrix(interaction, dimensions, attributes, matrix, dimension_classification, classification_ordering);
                            }
                        }
                    }

            }
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_coaeval_header_bgcolor$ = makeSymbol("*CB-UIAT-COAEVAL-HEADER-BGCOLOR*");

    public static final SubLObject cb_uiat_coa_evaluator_show_matrix(SubLObject interaction, SubLObject dimensions, SubLObject attributes, SubLObject matrix, SubLObject dimension_classification, SubLObject classification_ordering) {
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
            cb_uiat_coa_evaluator_prepare_showXhide_ids(dimensions);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            cb_uiat_coa_evaluator_identify_coa(interaction);
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            cb_uiat_coa_evaluator_show_global_actions(interaction, dimensions, attributes);
            cb_uiat_coa_evaluator_show_matrix_table(interaction, dimensions, attributes, matrix, dimension_classification, classification_ordering, CB_UIAT_CELL_RENDERER_SHOW, html_macros.$html_color_lighter_blue$.getDynamicValue(thread), CB_UIAT_ATTRIBUTE_TOOLS_SHOW, UNPROVIDED);
            cb_uiat_coa_evaluator_show_global_actions(interaction, dimensions, attributes);
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_coa_evaluator_identify_coa(SubLObject interaction) {
        {
            SubLObject coa = user_interaction_agenda.ui_args(interaction);
            if (coa.isCons()) {
                coa = coa.first();
            }
            html_utilities.html_princ($str_alt204$The_COA_under_consideration_is_);
            cb_uia_display_primitives.cb_uia_show_term(coa, UNPROVIDED);
            html_utilities.html_princ(CHAR_period);
        }
        return interaction;
    }

    public static final SubLObject cb_uiat_coa_evaluator_prepare_showXhide_ids(SubLObject dimensions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = dimensions;
                SubLObject dimension = NIL;
                for (dimension = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dimension = cdolist_list_var.first()) {
                    {
                        SubLObject object_id = kb_paths.fort_name(dimension);
                        html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                        html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt56$text_css);
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
                    }
                }
            }
            return dimensions;
        }
    }

    public static final SubLObject cb_uiat_cell_renderer_show(SubLObject interaction, SubLObject dimension, SubLObject attribute, SubLObject matrix_cell) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rules = matrix_cell;
                if (NIL != rules) {
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
                                SubLObject cdolist_list_var = rules;
                                SubLObject rule = NIL;
                                for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_uia_display_primitives.cb_uia_show_assertion(rule);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
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
                                                SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                    cb_utilities.cb_link($UIAT_COAEVAL_EDIT_RULE, interaction, rule, $str_alt206$_Edit_, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                    cb_utilities.cb_link($UIAT_COAEVAL_TEST_RULE, interaction, rule, dimension, attribute, $str_alt208$_Test_);
                                                    html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
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
                } else {
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    html_utilities.html_princ($$$no_items);
                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                }
            }
            return matrix_cell;
        }
    }

    public static final SubLObject cb_uiat_attribute_tools_show(SubLObject interaction, SubLObject dimension, SubLObject attribute) {
        cb_utilities.cb_link($UIAT_COAEVAL_ADD_RULE_TO_CELL, interaction, dimension, attribute, $str_alt211$_Add_Rule_, UNPROVIDED);
        return interaction;
    }

    public static final SubLObject cb_uiat_coa_evaluator_show_global_actions(SubLObject interaction, SubLObject dimensions, SubLObject attributes) {
        html_utilities.html_newline(TWO_INTEGER);
        cb_utilities.cb_link($UIAT_COAEVAL_RUN_ALL, interaction, $str_alt213$_Evaluate_COA_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_indent(TWO_INTEGER);
        cb_utilities.cb_link($UIAT_COAEVAL_DONE, interaction, $str_alt215$_Done_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_newline(TWO_INTEGER);
        return interaction;
    }

    public static final SubLObject cb_uiat_coa_evaluator_show_results_matrix(SubLObject interaction, SubLObject dimensions, SubLObject attributes, SubLObject matrix, SubLObject dimension_classification, SubLObject classification_ordering) {
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
            cb_uiat_coa_evaluator_prepare_showXhide_ids(dimensions);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_princ($str_alt216$The_following_table_summarizes_th);
            html_utilities.html_newline(UNPROVIDED);
            cb_uiat_coa_evaluator_identify_coa(interaction);
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            cb_uiat_coa_evaluator_show_forget_results(interaction);
            cb_uiat_coa_evaluator_show_matrix_table(interaction, dimensions, attributes, matrix, dimension_classification, classification_ordering, CB_UIAT_CELL_RENDERER_SHOW_RESULTS, html_macros.$html_color_light_purple$.getDynamicValue(thread), CB_UIAT_ATTRIBUTE_TOOLS_SHOW_RESULTS, $DIFFERENTIATE_ZEROS);
            cb_uiat_coa_evaluator_show_forget_results(interaction);
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_cell_renderer_show_results(SubLObject interaction, SubLObject dimension, SubLObject attribute, SubLObject matrix_cell) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = matrix_cell;
                if (NIL != results) {
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
                                SubLObject cdolist_list_var = results;
                                SubLObject result = NIL;
                                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = result;
                                        SubLObject current = datum;
                                        SubLObject v_bindings = NIL;
                                        SubLObject justifications = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt220);
                                        v_bindings = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt220);
                                        justifications = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject cdolist_list_var_58 = v_bindings;
                                                                        SubLObject binding = NIL;
                                                                        for (binding = cdolist_list_var_58.first(); NIL != cdolist_list_var_58; cdolist_list_var_58 = cdolist_list_var_58.rest() , binding = cdolist_list_var_58.first()) {
                                                                            {
                                                                                SubLObject datum_59 = binding;
                                                                                SubLObject current_60 = datum_59;
                                                                                SubLObject variable = NIL;
                                                                                SubLObject value = NIL;
                                                                                destructuring_bind_must_consp(current_60, datum_59, $list_alt221);
                                                                                variable = current_60.first();
                                                                                current_60 = current_60.rest();
                                                                                value = current_60;
                                                                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_princ(variable);
                                                                                        html_utilities.html_princ($str_alt222$____);
                                                                                        cb_uia_display_primitives.cb_uia_show_term(value, UNPROVIDED);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt223$because__);
                                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            cb_uia_display_primitives.cb_uia_show_arguments(list(justifications), UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt220);
                                        }
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } else {
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    html_utilities.html_princ($$$No_results);
                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                }
            }
            return matrix_cell;
        }
    }

    public static final SubLObject cb_uiat_attribute_tools_show_results(SubLObject interaction, SubLObject dimension, SubLObject attribute) {
        html_utilities.html_indent(TWO_INTEGER);
        return interaction;
    }

    public static final SubLObject cb_uiat_coa_evaluator_show_forget_results(SubLObject interaction) {
        html_utilities.html_newline(TWO_INTEGER);
        cb_utilities.cb_link($UIAT_COAEVAL_FORGET_RESULTS, interaction, $str_alt40$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_newline(TWO_INTEGER);
        return interaction;
    }

    /**
     * Given a set of dimensions and the attributes within the dimension, display the
     * content of the matrix making up this space.
     */
    public static final SubLObject cb_uiat_coa_evaluator_show_matrix_table(SubLObject interaction, SubLObject dimensions, SubLObject attributes, SubLObject matrix, SubLObject dimension_classification, SubLObject classification_ordering, SubLObject cell_renderer_fn, SubLObject classification_bg_color, SubLObject attribute_tools_fn, SubLObject differentiate_zeroP) {
        if (attribute_tools_fn == UNPROVIDED) {
            attribute_tools_fn = NIL;
        }
        if (differentiate_zeroP == UNPROVIDED) {
            differentiate_zeroP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                html_utilities.html_markup($str_alt226$98_);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject cdolist_list_var = classification_ordering;
                        SubLObject classification = NIL;
                        for (classification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , classification = cdolist_list_var.first()) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (NIL != classification_bg_color) {
                                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(classification_bg_color);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            html_utilities.html_princ(uia_trampolines.uia_term_phrase(cb_user_interaction_agenda.cb_current_uia(), classification, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject dimensions_66 = dictionary.dictionary_lookup(dimension_classification, classification, UNPROVIDED);
                                SubLObject cdolist_list_var_67 = dimensions_66;
                                SubLObject dimension = NIL;
                                for (dimension = cdolist_list_var_67.first(); NIL != cdolist_list_var_67; cdolist_list_var_67 = cdolist_list_var_67.rest() , dimension = cdolist_list_var_67.first()) {
                                    {
                                        SubLObject object_id = kb_paths.fort_name(dimension);
                                        SubLObject matrix_row = dictionary.dictionary_lookup(matrix, dimension, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != html_macros.$html_color_light_grey$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_color_light_grey$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt59$);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                        {
                                                            SubLObject _prev_bind_0_70 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
                                                            try {
                                                                pph_vars.$pph_terse_modeP$.bind(T, thread);
                                                                html_utilities.html_princ(uia_trampolines.uia_term_phrase(cb_user_interaction_agenda.cb_current_uia(), dimension, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                            } finally {
                                                                pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0_70, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                {
                                                    SubLObject totals = ZERO_INTEGER;
                                                    SubLObject cdolist_list_var_71 = attributes;
                                                    SubLObject attribute = NIL;
                                                    for (attribute = cdolist_list_var_71.first(); NIL != cdolist_list_var_71; cdolist_list_var_71 = cdolist_list_var_71.rest() , attribute = cdolist_list_var_71.first()) {
                                                        {
                                                            SubLObject matrix_cell = dictionary.dictionary_lookup(matrix_row, attribute, UNPROVIDED);
                                                            totals = add(totals, length(matrix_cell));
                                                        }
                                                    }
                                                    {
                                                        SubLObject bgcolor = (NIL != differentiate_zeroP) ? ((SubLObject) (totals.isZero() ? ((SubLObject) (html_macros.$html_color_lighter_grey$.getDynamicValue(thread))) : html_macros.$html_color_lighter_blue$.getDynamicValue(thread))) : html_macros.$html_color_light_grey$.getDynamicValue(thread);
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
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != bgcolor) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(bgcolor);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                                if (totals.isZero()) {
                                                                    html_utilities.html_princ($$$no_items);
                                                                } else
                                                                    if (totals.numE(ONE_INTEGER)) {
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt227$_D_item, totals);
                                                                    } else {
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt228$_D_items, totals);
                                                                    }

                                                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                                            SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
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
                                                                    html_utilities.html_markup($str_alt229$100_);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject cdolist_list_var_78 = attributes;
                                                                                    SubLObject attribute = NIL;
                                                                                    for (attribute = cdolist_list_var_78.first(); NIL != cdolist_list_var_78; cdolist_list_var_78 = cdolist_list_var_78.rest() , attribute = cdolist_list_var_78.first()) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                        if (true) {
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_markup(TWO_INTEGER);
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                                                if (true) {
                                                                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                }
                                                                                                if (true) {
                                                                                                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                }
                                                                                                if (true) {
                                                                                                    html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_utilities.html_markup($str_alt230$90_);
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                }
                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                if (true) {
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                }
                                                                                                                if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                    html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                }
                                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                                                        html_utilities.html_princ(uia_trampolines.uia_term_phrase(cb_user_interaction_agenda.cb_current_uia(), attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
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
                                                                                                                if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                    html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                }
                                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        if (attribute_tools_fn.isFunctionSpec()) {
                                                                                                                            funcall(attribute_tools_fn, interaction, dimension, attribute);
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject cdolist_list_var_85 = attributes;
                                                                                    SubLObject attribute = NIL;
                                                                                    for (attribute = cdolist_list_var_85.first(); NIL != cdolist_list_var_85; cdolist_list_var_85 = cdolist_list_var_85.rest() , attribute = cdolist_list_var_85.first()) {
                                                                                        {
                                                                                            SubLObject matrix_cell = dictionary.dictionary_lookup(matrix_row, attribute, UNPROVIDED);
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                            if (true) {
                                                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            }
                                                                                            if (true) {
                                                                                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_utilities.html_markup($str_alt231$45_);
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            }
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    funcall(cell_renderer_fn, interaction, dimension, attribute, matrix_cell);
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
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
            return interaction;
        }
    }

    public static final SubLObject cb_link_uiat_coaeval_add_rule_to_cell(SubLObject interaction, SubLObject dimension, SubLObject attribute, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt211$_Add_Rule_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, dimension, attribute);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt232$cb_uiat_coaeval_handle_add_rule_t, arglist);
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

    public static final SubLObject cb_uiat_coaeval_handle_add_rule_to_cell(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject dimension = NIL;
            SubLObject attribute = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt234);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt234);
            dimension = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt234);
            attribute = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ADD_RULE_TO_CELL, list($DIMENSION, dimension, $ATTRIBUTE, attribute));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt234);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uiat_coaeval_edit_rule(SubLObject interaction, SubLObject assertion, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Edit_Rule;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, assertion);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt240$cb_uiat_coaeval_handle_edit_rule, arglist);
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

    public static final SubLObject cb_uiat_coaeval_handle_edit_rule(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt242);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt242);
            assertion = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $EDIT_RULE, list($ASSERTION, assertion));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt242);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uiat_coaeval_test_rule(SubLObject interaction, SubLObject assertion, SubLObject dimension, SubLObject attribute, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Test_Rule;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, assertion, dimension, attribute);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt246$cb_uiat_coaeval_handle_test_rule, arglist);
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

    public static final SubLObject cb_uiat_coaeval_handle_test_rule(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject assertion = NIL;
            SubLObject dimension = NIL;
            SubLObject attribute = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt248);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt248);
            assertion = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt248);
            dimension = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt248);
            attribute = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $TEST_RULE, list($ASSERTION, assertion, $DIMENSION, dimension, $ATTRIBUTE, attribute));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt248);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uiat_coaeval_run_all(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt251$_Evaluate_COA_completely_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt252$cb_uiat_coaeval_handle_run_all, arglist);
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

    public static final SubLObject cb_uiat_coaeval_handle_run_all(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt254);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $EVALUATE_COA, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt254);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_coaeval_handle_done(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt254);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DONE, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt254);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uiat_coaeval_done(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt215$_Done_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt259$cb_uiat_coaeval_handle_done, arglist);
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

    public static final SubLObject cb_link_uiat_coaeval_forget_results(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt261$_Forget_Results_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt262$cb_uiat_coaeval_handle_forget_res, arglist);
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

    public static final SubLObject cb_uiat_coaeval_handle_forget_results(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt254);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FORGET_COA_RESULTS, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt254);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cb_uia_tools_misc_file() {
        declareFunction("cb_uiat_wff_checker_render_request", "CB-UIAT-WFF-CHECKER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_wff_checker_guts", "CB-UIAT-WFF-CHECKER-GUTS", 4, 0, false);
        declareFunction("cb_uiat_wff_unrepairable_guts", "CB-UIAT-WFF-UNREPAIRABLE-GUTS", 3, 0, false);
        declareFunction("cb_uiat_wff_repair_guts", "CB-UIAT-WFF-REPAIR-GUTS", 4, 0, false);
        declareFunction("cb_uiat_wff_handler", "CB-UIAT-WFF-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_contradiction_finder_render_request", "CB-UIAT-CONTRADICTION-FINDER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_contradiction_finder_guts", "CB-UIAT-CONTRADICTION-FINDER-GUTS", 3, 0, false);
        declareFunction("cb_uiat_redundancy_detector_render_request", "CB-UIAT-REDUNDANCY-DETECTOR-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_redundancy_detector_guts", "CB-UIAT-REDUNDANCY-DETECTOR-GUTS", 3, 0, false);
        declareFunction("cb_uiat_showXhide_sentence_justification", "CB-UIAT-SHOW/HIDE-SENTENCE-JUSTIFICATION", 3, 1, false);
        declareFunction("cb_uiat_show_sentence_justification", "CB-UIAT-SHOW-SENTENCE-JUSTIFICATION", 3, 1, false);
        declareFunction("cb_uiat_show_isomorphic_assertion", "CB-UIAT-SHOW-ISOMORPHIC-ASSERTION", 2, 0, false);
        declareFunction("cb_uiat_find_isomorphic_support", "CB-UIAT-FIND-ISOMORPHIC-SUPPORT", 2, 0, false);
        declareFunction("cb_uiat_find_assertion_for_support", "CB-UIAT-FIND-ASSERTION-FOR-SUPPORT", 1, 0, false);
        declareFunction("uia_act_new_command_interaction", "UIA-ACT-NEW-COMMAND-INTERACTION", 3, 0, false);
        declareFunction("uiat_command_interaction_hint", "UIAT-COMMAND-INTERACTION-HINT", 1, 0, false);
        declareFunction("cb_uiat_cmdint_solution_finder", "CB-UIAT-CMDINT-SOLUTION-FINDER", 2, 0, false);
        declareFunction("cb_uiat_command_interaction_child_completed", "CB-UIAT-COMMAND-INTERACTION-CHILD-COMPLETED", 2, 0, false);
        declareFunction("cb_uiat_command_interaction_display", "CB-UIAT-COMMAND-INTERACTION-DISPLAY", 1, 0, false);
        declareFunction("cb_uiat_cmdint_match_action", "CB-UIAT-CMDINT-MATCH-ACTION", 2, 0, false);
        declareFunction("cb_uiat_nl_requests", "CB-UIAT-NL-REQUESTS", 1, 0, false);
        declareFunction("cb_uiat_cmdint_check_for_question_or_command", "CB-UIAT-CMDINT-CHECK-FOR-QUESTION-OR-COMMAND", 4, 0, false);
        declareFunction("cb_uiat_map_tool_symbol_to_tool", "CB-UIAT-MAP-TOOL-SYMBOL-TO-TOOL", 1, 0, false);
        declareFunction("cb_uiat_map_tool_symbol_to_launcher", "CB-UIAT-MAP-TOOL-SYMBOL-TO-LAUNCHER", 1, 0, false);
        declareFunction("cb_link_uia_concept_killer", "CB-LINK-UIA-CONCEPT-KILLER", 2, 0, false);
        declareFunction("cb_uia_concept_killer", "CB-UIA-CONCEPT-KILLER", 1, 0, false);
        declareFunction("cb_uiat_precision_suggestor_render_request", "CB-UIAT-PRECISION-SUGGESTOR-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_precision_suggestor_arg_guts", "CB-UIAT-PRECISION-SUGGESTOR-ARG-GUTS", 8, 0, false);
        declareFunction("cb_uiat_precision_suggestor_show_current_sentence", "CB-UIAT-PRECISION-SUGGESTOR-SHOW-CURRENT-SENTENCE", 5, 1, false);
        declareFunction("cb_uiat_precision_suggestor_show_facets", "CB-UIAT-PRECISION-SUGGESTOR-SHOW-FACETS", 4, 0, false);
        declareFunction("cb_link_uiat_precision_suggestor_no_facets", "CB-LINK-UIAT-PRECISION-SUGGESTOR-NO-FACETS", 3, 0, false);
        declareFunction("cb_uiat_precision_suggestor_no_facets_handler", "CB-UIAT-PRECISION-SUGGESTOR-NO-FACETS-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_precision_suggestor_facet_handler", "CB-UIAT-PRECISION-SUGGESTOR-FACET-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_precision_suggestor_show_output_list", "CB-UIAT-PRECISION-SUGGESTOR-SHOW-OUTPUT-LIST", 2, 0, false);
        declareFunction("cb_link_uia_precision_suggestor_none_handler", "CB-LINK-UIA-PRECISION-SUGGESTOR-NONE-HANDLER", 4, 0, false);
        declareFunction("cb_uiat_precision_suggestor_none_handler", "CB-UIAT-PRECISION-SUGGESTOR-NONE-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_precision_suggestor_form_handler", "CB-UIAT-PRECISION-SUGGESTOR-FORM-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_coa_evaluator_render_request", "CB-UIAT-COA-EVALUATOR-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_coa_evaluator_show_matrix", "CB-UIAT-COA-EVALUATOR-SHOW-MATRIX", 6, 0, false);
        declareFunction("cb_uiat_coa_evaluator_identify_coa", "CB-UIAT-COA-EVALUATOR-IDENTIFY-COA", 1, 0, false);
        declareFunction("cb_uiat_coa_evaluator_prepare_showXhide_ids", "CB-UIAT-COA-EVALUATOR-PREPARE-SHOW/HIDE-IDS", 1, 0, false);
        declareFunction("cb_uiat_cell_renderer_show", "CB-UIAT-CELL-RENDERER-SHOW", 4, 0, false);
        declareFunction("cb_uiat_attribute_tools_show", "CB-UIAT-ATTRIBUTE-TOOLS-SHOW", 3, 0, false);
        declareFunction("cb_uiat_coa_evaluator_show_global_actions", "CB-UIAT-COA-EVALUATOR-SHOW-GLOBAL-ACTIONS", 3, 0, false);
        declareFunction("cb_uiat_coa_evaluator_show_results_matrix", "CB-UIAT-COA-EVALUATOR-SHOW-RESULTS-MATRIX", 6, 0, false);
        declareFunction("cb_uiat_cell_renderer_show_results", "CB-UIAT-CELL-RENDERER-SHOW-RESULTS", 4, 0, false);
        declareFunction("cb_uiat_attribute_tools_show_results", "CB-UIAT-ATTRIBUTE-TOOLS-SHOW-RESULTS", 3, 0, false);
        declareFunction("cb_uiat_coa_evaluator_show_forget_results", "CB-UIAT-COA-EVALUATOR-SHOW-FORGET-RESULTS", 1, 0, false);
        declareFunction("cb_uiat_coa_evaluator_show_matrix_table", "CB-UIAT-COA-EVALUATOR-SHOW-MATRIX-TABLE", 8, 2, false);
        declareFunction("cb_link_uiat_coaeval_add_rule_to_cell", "CB-LINK-UIAT-COAEVAL-ADD-RULE-TO-CELL", 4, 0, false);
        declareFunction("cb_uiat_coaeval_handle_add_rule_to_cell", "CB-UIAT-COAEVAL-HANDLE-ADD-RULE-TO-CELL", 1, 0, false);
        declareFunction("cb_link_uiat_coaeval_edit_rule", "CB-LINK-UIAT-COAEVAL-EDIT-RULE", 3, 0, false);
        declareFunction("cb_uiat_coaeval_handle_edit_rule", "CB-UIAT-COAEVAL-HANDLE-EDIT-RULE", 1, 0, false);
        declareFunction("cb_link_uiat_coaeval_test_rule", "CB-LINK-UIAT-COAEVAL-TEST-RULE", 5, 0, false);
        declareFunction("cb_uiat_coaeval_handle_test_rule", "CB-UIAT-COAEVAL-HANDLE-TEST-RULE", 1, 0, false);
        declareFunction("cb_link_uiat_coaeval_run_all", "CB-LINK-UIAT-COAEVAL-RUN-ALL", 2, 0, false);
        declareFunction("cb_uiat_coaeval_handle_run_all", "CB-UIAT-COAEVAL-HANDLE-RUN-ALL", 1, 0, false);
        declareFunction("cb_uiat_coaeval_handle_done", "CB-UIAT-COAEVAL-HANDLE-DONE", 1, 0, false);
        declareFunction("cb_link_uiat_coaeval_done", "CB-LINK-UIAT-COAEVAL-DONE", 2, 0, false);
        declareFunction("cb_link_uiat_coaeval_forget_results", "CB-LINK-UIAT-COAEVAL-FORGET-RESULTS", 2, 0, false);
        declareFunction("cb_uiat_coaeval_handle_forget_results", "CB-UIAT-COAEVAL-HANDLE-FORGET-RESULTS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_tools_misc_file() {
        deflexical("*CB-UIAT-CYCL-RKF-TOOLS-TO-COMMANDS*", $list_alt68);
        deflexical("*CB-UIAT-CYCL-RKF-TOOLS-TO-LAUNCHERS*", list(list($$CycComparatorContrastor, CB_UIA_LAUNCH_CONCEPT_COMPARATOR), list($$CycProcessDescriptor, CB_UIA_LAUNCH_PROCESS_DESCRIPTOR), list($$CycKnowledgeReviewer, CB_UIA_LAUNCH_KNOWLEDGE_REVIEWER), list($$CycRuleConstructor, CB_UIA_LAUNCH_RULE_CONSTRUCTOR), list($$CycScenarioDescriber, CB_UIA_LAUNCH_SCENARIO_CONSTRUCTOR), list($$CycSalientDescriptor, CB_UIA_LAUNCH_SALIENT_DESCRIPTOR), list($$CycSolutionFinder, CB_UIA_LAUNCH_SOLUTION_FINDER)));
        defconstant("*CB-UIAT-FOCUS-TEXT-HIGHLIGHT-COLOR*", $$$yellow);
        deflexical("*CB-UIAT-COAEVAL-HEADER-BGCOLOR*", html_macros.$html_color_light_grey$.getDynamicValue());
        return NIL;
    }

    public static final SubLObject setup_cb_uia_tools_misc_file() {
                cb_uia_tool_declaration.declare_cb_uia_tool($WFF_CHECKER, $list_alt1);
        html_macros.note_html_handler_function(CB_UIAT_WFF_HANDLER);
        cb_uia_tool_declaration.declare_cb_uia_tool($CONTRADICTION_FINDER, $list_alt33);
        cb_uia_tool_declaration.declare_cb_uia_tool($REDUNDANCY_DETECTOR, $list_alt42);
        uia_tool_declaration.declare_uia_tool($COMMAND_INTERACTION, $list_alt64);
        cb_uia_tool_declaration.declare_cb_uia_tool($COMMAND_INTERACTION, $list_alt65);
        cb_utilities.setup_cb_link_method($UIA_CONCEPT_KILLER, CB_LINK_UIA_CONCEPT_KILLER, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_CONCEPT_KILLER);
        cb_uia_tool_declaration.declare_cb_uia_tool($PRECISION_SUGGESTOR, $list_alt106);
        cb_utilities.setup_cb_link_method($UIAT_PRECISION_SUGGESTOR_NO_FACETS, CB_LINK_UIAT_PRECISION_SUGGESTOR_NO_FACETS, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_PRECISION_SUGGESTOR_NO_FACETS_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_PRECISION_SUGGESTOR_FACET_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_PRECISION_SUGGESTOR_NONE_HANDLER, CB_LINK_UIA_PRECISION_SUGGESTOR_NONE_HANDLER, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_PRECISION_SUGGESTOR_NONE_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_PRECISION_SUGGESTOR_FORM_HANDLER);
        cb_uia_tool_declaration.declare_cb_uia_tool($COA_EVALUATOR, $list_alt193);
        cb_utilities.setup_cb_link_method($UIAT_COAEVAL_ADD_RULE_TO_CELL, CB_LINK_UIAT_COAEVAL_ADD_RULE_TO_CELL, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_COAEVAL_HANDLE_ADD_RULE_TO_CELL);
        cb_utilities.setup_cb_link_method($UIAT_COAEVAL_EDIT_RULE, CB_LINK_UIAT_COAEVAL_EDIT_RULE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_COAEVAL_HANDLE_EDIT_RULE);
        cb_utilities.setup_cb_link_method($UIAT_COAEVAL_TEST_RULE, CB_LINK_UIAT_COAEVAL_TEST_RULE, FIVE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_COAEVAL_HANDLE_TEST_RULE);
        cb_utilities.setup_cb_link_method($UIAT_COAEVAL_RUN_ALL, CB_LINK_UIAT_COAEVAL_RUN_ALL, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_COAEVAL_HANDLE_RUN_ALL);
        html_macros.note_html_handler_function(CB_UIAT_COAEVAL_HANDLE_DONE);
        cb_utilities.setup_cb_link_method($UIAT_COAEVAL_DONE, CB_LINK_UIAT_COAEVAL_DONE, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_COAEVAL_FORGET_RESULTS, CB_LINK_UIAT_COAEVAL_FORGET_RESULTS, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_COAEVAL_HANDLE_FORGET_RESULTS);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $WFF_CHECKER = makeKeyword("WFF-CHECKER");

    static private final SubLList $list_alt1 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-WFF-CHECKER-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("UIAWffCheckerTool")));

    static private final SubLList $list_alt2 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("SIGNATURE"), makeSymbol("PLIST"));



    static private final SubLList $list_alt4 = list(makeSymbol("&KEY"), makeSymbol("CYCL-SENTENCE"), makeSymbol("WHY-NOT-WFF"), makeSymbol("REPAIRS"));

    static private final SubLList $list_alt5 = list(makeKeyword("CYCL-SENTENCE"), makeKeyword("WHY-NOT-WFF"), makeKeyword("REPAIRS"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $WHY_NOT_WFF = makeKeyword("WHY-NOT-WFF");

    private static final SubLSymbol $REPAIRS = makeKeyword("REPAIRS");

    static private final SubLString $str_alt10$cb_uiat_wff_handler = makeString("cb-uiat-wff-handler");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $str_alt12$Sorry_about_this__This_may_seem_a = makeString("Sorry about this. This may seem a bit silly.");

    static private final SubLString $str_alt13$The_sentence_ = makeString("The sentence:");

    static private final SubLString $str_alt14$is_ill_formed_ = makeString("is ill-formed ");

    static private final SubLString $str_alt15$for_the_following_reasons_ = makeString("for the following reasons:");

    static private final SubLString $str_alt16$for_some_reason_ = makeString("for some reason.");

    static private final SubLString $$$Continue = makeString("Continue");

    static private final SubLString $$$continue = makeString("continue");

    static private final SubLString $str_alt19$You_told_me_ = makeString("You told me:");

    static private final SubLString $str_alt20$This_seems_to_rely_on_the_followi = makeString("This seems to rely on the following implicit assumption:");

    static private final SubLString $str_alt21$Please_confirm_that_this_is_what_ = makeString("Please confirm that this is what you meant.");

    static private final SubLString $$$Confirm_Assumption = makeString("Confirm Assumption");

    static private final SubLString $str_alt23$add_fact_0 = makeString("add-fact-0");

    static private final SubLString $str_alt24$Assumption_Incorrect__Don_t_Add_F = makeString("Assumption Incorrect; Don't Add Fact");



    static private final SubLList $list_alt26 = list($DONE, T);

    static private final SubLString $str_alt27$add_all_facts = makeString("add-all-facts");

    private static final SubLSymbol $REPAIR = makeKeyword("REPAIR");



    static private final SubLString $str_alt30$add_fact_ = makeString("add-fact-");

    private static final SubLSymbol CB_UIAT_WFF_HANDLER = makeSymbol("CB-UIAT-WFF-HANDLER");

    private static final SubLSymbol $CONTRADICTION_FINDER = makeKeyword("CONTRADICTION-FINDER");

    static private final SubLList $list_alt33 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-CONTRADICTION-FINDER-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycContradictionFinderTool")));

    static private final SubLList $list_alt34 = list(makeSymbol("&KEY"), makeSymbol("CYCL-SENTENCE"), makeSymbol("CONTRADICTION"));

    static private final SubLList $list_alt35 = list(makeKeyword("CYCL-SENTENCE"), makeKeyword("CONTRADICTION"));



    static private final SubLString $$$I_cannot_believe = makeString("I cannot believe");

    static private final SubLString $str_alt38$because_of_the_contradicting_fact = makeString("because of the contradicting fact(s):");

    private static final SubLSymbol $UIA_NEXT_INTERACTION = makeKeyword("UIA-NEXT-INTERACTION");

    static private final SubLString $str_alt40$_Continue_ = makeString("[Continue]");

    private static final SubLSymbol $REDUNDANCY_DETECTOR = makeKeyword("REDUNDANCY-DETECTOR");

    static private final SubLList $list_alt42 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-REDUNDANCY-DETECTOR-RENDER-REQUEST"));

    public static final SubLSymbol $kw43$ALREADY_SHOWN_ = makeKeyword("ALREADY-SHOWN?");



    static private final SubLList $list_alt45 = list(makeSymbol("&KEY"), makeSymbol("CYCL-SENTENCE"), makeSymbol("REDUNDANCY"));

    static private final SubLList $list_alt46 = list(makeKeyword("CYCL-SENTENCE"), makeKeyword("REDUNDANCY"));



    static private final SubLString $$$I_already_know_that = makeString("I already know that");



    static private final SubLString $str_alt50$Here_are_my_reasons_for_believing = makeString("Here are my reasons for believing it:");

    static private final SubLString $$$redundancy = makeString("redundancy");

    static private final SubLString $$$because_of_the_redundant_fact = makeString("because of the redundant fact");

    static private final SubLString $$$s = makeString("s");

    static private final SubLString $str_alt54$_ = makeString(":");

    static private final SubLString $$$justification = makeString("justification");

    static private final SubLString $str_alt56$text_css = makeString("text/css");

    static private final SubLString $$$screen = makeString("screen");

    static private final SubLString $$$none = makeString("none");

    static private final SubLString $str_alt59$ = makeString("");







    private static final SubLSymbol $COMMAND_INTERACTION = makeKeyword("COMMAND-INTERACTION");

    static private final SubLList $list_alt64 = list($NAME, makeString("Command Interaction"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-COMMAND-INTERACTION-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("CB-UIAT-COMMAND-INTERACTION-CHILD-COMPLETED"));

    static private final SubLList $list_alt65 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAT-COMMAND-INTERACTION-DISPLAY"));

    static private final SubLList $list_alt66 = list(makeSymbol("SENTENCE"));

    static private final SubLString $str_alt67$Command____A = makeString("Command : ~A");

    static private final SubLList $list_alt68 = list(new SubLObject[]{ list(constant_handles.reader_make_constant_shell(makeString("CycConceptSummarizer")), makeKeyword("ASSERTED-SENTENCES")), list(constant_handles.reader_make_constant_shell(makeString("CycConceptCreator")), makeKeyword("CONCEPT-CREATOR")), list(constant_handles.reader_make_constant_shell(makeString("CycComparatorContrastor")), makeKeyword("CONCEPT-COMPARATOR")), list(constant_handles.reader_make_constant_shell(makeString("CycRelationshipSuggestor")), makeKeyword("RELATIONSHIP-SUGGESTOR")), list(constant_handles.reader_make_constant_shell(makeString("CycAnalogyTool")), makeKeyword("ANALOGY-DEVELOPER")), list(constant_handles.reader_make_constant_shell(makeString("QueryConstructor")), makeKeyword("QUERY-CONSTRUCTOR")), list(constant_handles.reader_make_constant_shell(makeString("CycLexificationWizard")), makeKeyword("LEXIFICATION-WIZARD")), list(constant_handles.reader_make_constant_shell(makeString("CycProcessDescriptor")), makeKeyword("PROCESS-DESCRIPTOR")), list(constant_handles.reader_make_constant_shell(makeString("CycCommonQueriesTool")), makeKeyword("COMMON-QUERIES")), list(constant_handles.reader_make_constant_shell(makeString("CycLexicalKnowledgeReviewer")), makeKeyword("LEX-KNOWLEDGE-REVIEWER")), list(constant_handles.reader_make_constant_shell(makeString("CycConceptClarifierTool")), makeKeyword("CONCEPT-CLARIFIER")), list(constant_handles.reader_make_constant_shell(makeString("CycConceptRecognizer")), makeKeyword("CONCEPT-RECOGNIZER")), list(constant_handles.reader_make_constant_shell(makeString("CycUIAOntologyBrowser")), makeKeyword("ONTOLOGY-BROWSER")), list(constant_handles.reader_make_constant_shell(makeString("CycSalientDescriptor")), makeKeyword("SALIENT-DESCRIPTOR")) });

    public static final SubLObject $$CycComparatorContrastor = constant_handles.reader_make_constant_shell(makeString("CycComparatorContrastor"));

    private static final SubLSymbol CB_UIA_LAUNCH_CONCEPT_COMPARATOR = makeSymbol("CB-UIA-LAUNCH-CONCEPT-COMPARATOR");

    public static final SubLObject $$CycProcessDescriptor = constant_handles.reader_make_constant_shell(makeString("CycProcessDescriptor"));

    private static final SubLSymbol CB_UIA_LAUNCH_PROCESS_DESCRIPTOR = makeSymbol("CB-UIA-LAUNCH-PROCESS-DESCRIPTOR");

    public static final SubLObject $$CycKnowledgeReviewer = constant_handles.reader_make_constant_shell(makeString("CycKnowledgeReviewer"));

    private static final SubLSymbol CB_UIA_LAUNCH_KNOWLEDGE_REVIEWER = makeSymbol("CB-UIA-LAUNCH-KNOWLEDGE-REVIEWER");

    public static final SubLObject $$CycRuleConstructor = constant_handles.reader_make_constant_shell(makeString("CycRuleConstructor"));

    private static final SubLSymbol CB_UIA_LAUNCH_RULE_CONSTRUCTOR = makeSymbol("CB-UIA-LAUNCH-RULE-CONSTRUCTOR");

    public static final SubLObject $$CycScenarioDescriber = constant_handles.reader_make_constant_shell(makeString("CycScenarioDescriber"));

    private static final SubLSymbol CB_UIA_LAUNCH_SCENARIO_CONSTRUCTOR = makeSymbol("CB-UIA-LAUNCH-SCENARIO-CONSTRUCTOR");

    public static final SubLObject $$CycSalientDescriptor = constant_handles.reader_make_constant_shell(makeString("CycSalientDescriptor"));

    private static final SubLSymbol CB_UIA_LAUNCH_SALIENT_DESCRIPTOR = makeSymbol("CB-UIA-LAUNCH-SALIENT-DESCRIPTOR");

    public static final SubLObject $$CycSolutionFinder = constant_handles.reader_make_constant_shell(makeString("CycSolutionFinder"));

    private static final SubLSymbol CB_UIA_LAUNCH_SOLUTION_FINDER = makeSymbol("CB-UIA-LAUNCH-SOLUTION-FINDER");

    private static final SubLSymbol $DISAMBIGUATE_PHRASE = makeKeyword("DISAMBIGUATE-PHRASE");

    private static final SubLSymbol $BEST_NL_REQUEST = makeKeyword("BEST-NL-REQUEST");

    static private final SubLList $list_alt85 = list(makeSymbol("HANDLER"), makeSymbol("ARGS"), makeSymbol("CONSTRUCTOR"));

    private static final SubLSymbol $CHILD = makeKeyword("CHILD");





    static private final SubLString $str_alt89$Sorry__do_not_know_how_to_call_ac = makeString("Sorry, do not know how to call action ~S.~%");

    private static final SubLSymbol $ASSERTION_CREATOR = makeKeyword("ASSERTION-CREATOR");

    public static final SubLObject $$NLRequestFn = constant_handles.reader_make_constant_shell(makeString("NLRequestFn"));

    private static final SubLSymbol $ASSERTED_SENTENCES = makeKeyword("ASSERTED-SENTENCES");

    static private final SubLString $str_alt93$_ = makeString("?");

    private static final SubLSymbol $SOLUTION_FINDER = makeKeyword("SOLUTION-FINDER");

    private static final SubLSymbol CB_UIAT_CMDINT_SOLUTION_FINDER = makeSymbol("CB-UIAT-CMDINT-SOLUTION-FINDER");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt97$cb_uia_concept_killer = makeString("cb-uia-concept-killer");

    private static final SubLSymbol $UIA_CONCEPT_KILLER = makeKeyword("UIA-CONCEPT-KILLER");

    private static final SubLSymbol CB_LINK_UIA_CONCEPT_KILLER = makeSymbol("CB-LINK-UIA-CONCEPT-KILLER");

    static private final SubLList $list_alt100 = list(makeSymbol("TERM"));

    private static final SubLSymbol $CONCEPT_KILLER = makeKeyword("CONCEPT-KILLER");

    private static final SubLSymbol $LAUNCH = makeKeyword("LAUNCH");



    private static final SubLSymbol CB_UIA_CONCEPT_KILLER = makeSymbol("CB-UIA-CONCEPT-KILLER");



    static private final SubLList $list_alt106 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-PRECISION-SUGGESTOR-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycPrecisionSuggestor")));

    private static final SubLSymbol $SHOW_FACETS = makeKeyword("SHOW-FACETS");

    static private final SubLList $list_alt108 = list(makeSymbol("&KEY"), makeSymbol("TYPE-COLLECTIONS"), makeSymbol("SENTENCE"), makeSymbol("ARGNUM"));

    static private final SubLList $list_alt109 = list(makeKeyword("TYPE-COLLECTIONS"), makeKeyword("SENTENCE"), makeKeyword("ARGNUM"));

    private static final SubLSymbol $TYPE_COLLECTIONS = makeKeyword("TYPE-COLLECTIONS");





    static private final SubLList $list_alt113 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), makeSymbol("GENERALIZE"), makeSymbol("SUGGESTIONS"), makeSymbol("FACETING-TYPE-COL"), makeSymbol("WEAK-SUGGESTIONS"), makeSymbol("ARGNUM"));

    static private final SubLList $list_alt114 = list(makeKeyword("SENTENCE"), makeKeyword("GENERALIZE"), makeKeyword("SUGGESTIONS"), makeKeyword("FACETING-TYPE-COL"), makeKeyword("WEAK-SUGGESTIONS"), makeKeyword("ARGNUM"));





    private static final SubLSymbol $FACETING_TYPE_COL = makeKeyword("FACETING-TYPE-COL");

    private static final SubLSymbol $WEAK_SUGGESTIONS = makeKeyword("WEAK-SUGGESTIONS");

    static private final SubLString $str_alt119$cb_uiat_precision_suggestor_form_ = makeString("cb-uiat-precision-suggestor-form-handler");

    static private final SubLString $$$interaction = makeString("interaction");

    static private final SubLString $str_alt121$action_type = makeString("action-type");

    static private final SubLString $$$generalize = makeString("generalize");

    static private final SubLString $$$argnum = makeString("argnum");

    static private final SubLString $str_alt124$strong_max = makeString("strong-max");

    static private final SubLString $str_alt125$weak_max = makeString("weak-max");

    private static final SubLSymbol $SHOW_ARG = makeKeyword("SHOW-ARG");

    private static final SubLSymbol $WEAKER_OPTIONS = makeKeyword("WEAKER-OPTIONS");

    private static final SubLSymbol $STRONGER_OPTIONS = makeKeyword("STRONGER-OPTIONS");

    private static final SubLSymbol $SHOW_SENTENCE = makeKeyword("SHOW-SENTENCE");





    static private final SubLString $str_alt132$It_s_possible__but_unlikely__that = makeString("It's possible, but unlikely, that you meant something more general than:");

    static private final SubLString $str_alt133$Are_any_of_the_following_more_pre = makeString("Are any of the following more precise than");

    static private final SubLString $str_alt134$and_still_true_ = makeString("and still true?");

    private static final SubLSymbol $SHOW_SENTENCE_CHANGE_REQUIRED = makeKeyword("SHOW-SENTENCE-CHANGE-REQUIRED");

    static private final SubLString $str_alt136$Which_of_the_following_more_preci = makeString("Which of the following more precise versions of");

    static private final SubLString $str_alt137$did_you_mean_ = makeString("did you mean?");

    private static final SubLSymbol $GENERALIZE_EXACTLY = makeKeyword("GENERALIZE-EXACTLY");

    private static final SubLSymbol $SPECIALIZE_EXACTLY = makeKeyword("SPECIALIZE-EXACTLY");

    private static final SubLSymbol $UIA_PRECISION_SUGGESTOR_NONE_HANDLER = makeKeyword("UIA-PRECISION-SUGGESTOR-NONE-HANDLER");

    static private final SubLString $str_alt141$_press_here_to_confirm_this_inter = makeString("[press here to confirm this interpretation]");

    static private final SubLString $str_alt142$_No__the_original_sentence_is_fin = makeString("[No, the original sentence is fine]");





    static private final SubLString $$$strong = makeString("strong");



    static private final SubLString $$$on = makeString("on");

    static private final SubLString $str_alt148$You_must_pick_at_least_one_of_the = makeString("You must pick at least one of the more precise sentences.");

    static private final SubLString $$$Submit = makeString("Submit");

    private static final SubLSymbol PPH_NESTED_ARG_LIST_P = makeSymbol("PPH-NESTED-ARG-LIST-P");



    private static final SubLSymbol $FACETS = makeKeyword("FACETS");

    static private final SubLString $str_alt153$You_just_told_me_that__ = makeString("You just told me that: ");

    static private final SubLString $$$In_the_sentence = makeString("In the sentence");

    static private final SubLString $str_alt155$would_you_like_to_replace_the_phr = makeString("would you like to replace the phrase \"");

    static private final SubLString $str_alt156$__with_any_of_the_following_ = makeString("\" with any of the following?");

    static private final SubLString $str_alt157$could_you_replace_the_phrase__ = makeString("could you replace the phrase \"");

    static private final SubLString $str_alt158$__with_something_that_has_ = makeString("\" with something that has ");

    static private final SubLString $str_alt159$I_d_like_to_know_what_more_specif = makeString("I'd like to know what more specific kinds of ");

    static private final SubLString $str_alt160$_we_are_talking_about_ = makeString(" we are talking about.");

    static private final SubLString $str_alt161$cb_uiat_precision_suggestor_facet = makeString("cb-uiat-precision-suggestor-facet-handler");

    static private final SubLString $str_alt162$In_order_to_focus_this_part_of_th = makeString("In order to focus this part of the conversation, please check the corresponding boxes if you know the :");

    private static final SubLSymbol $UIAT_PRECISION_SUGGESTOR_NO_FACETS = makeKeyword("UIAT-PRECISION-SUGGESTOR-NO-FACETS");



    static private final SubLString $$$facet = makeString("facet");

    static private final SubLString $str_alt166$_Do_not_focus_but_show_all_more_s = makeString("[Do not focus but show all more specific kinds]");

    static private final SubLString $str_alt167$cb_uiat_precision_suggestor_no_fa = makeString("cb-uiat-precision-suggestor-no-facets-handler");

    private static final SubLSymbol CB_LINK_UIAT_PRECISION_SUGGESTOR_NO_FACETS = makeSymbol("CB-LINK-UIAT-PRECISION-SUGGESTOR-NO-FACETS");

    static private final SubLList $list_alt169 = list(makeSymbol("INTERACTION"), makeSymbol("ARGNUM"));

    private static final SubLSymbol $CONSTRAIN_TO_FACETS = makeKeyword("CONSTRAIN-TO-FACETS");

    private static final SubLSymbol CB_UIAT_PRECISION_SUGGESTOR_NO_FACETS_HANDLER = makeSymbol("CB-UIAT-PRECISION-SUGGESTOR-NO-FACETS-HANDLER");

    private static final SubLSymbol CB_UIAT_PRECISION_SUGGESTOR_FACET_HANDLER = makeSymbol("CB-UIAT-PRECISION-SUGGESTOR-FACET-HANDLER");

    static private final SubLString $$$yellow = makeString("yellow");

    static private final SubLString $str_alt174$_ = makeString(".");

    private static final SubLSymbol $WEAK_SPECIALIZE_EXACTLY = makeKeyword("WEAK-SPECIALIZE-EXACTLY");



    private static final SubLSymbol $WEAK_SPECIALIZE = makeKeyword("WEAK-SPECIALIZE");

    static private final SubLString $str_alt178$cb_uiat_precision_suggestor_none_ = makeString("cb-uiat-precision-suggestor-none-handler");

    private static final SubLSymbol CB_LINK_UIA_PRECISION_SUGGESTOR_NONE_HANDLER = makeSymbol("CB-LINK-UIA-PRECISION-SUGGESTOR-NONE-HANDLER");

    static private final SubLList $list_alt180 = list(makeSymbol("INTERACTION"), makeSymbol("GENERALIZE?"), makeSymbol("ARGNUM"));







    private static final SubLSymbol $ARG_DONE = makeKeyword("ARG-DONE");

    private static final SubLSymbol CB_UIAT_PRECISION_SUGGESTOR_NONE_HANDLER = makeSymbol("CB-UIAT-PRECISION-SUGGESTOR-NONE-HANDLER");





    static private final SubLString $$$weak = makeString("weak");



    private static final SubLSymbol $SENTENCE_OR_ARG = makeKeyword("SENTENCE-OR-ARG");

    private static final SubLSymbol CB_UIAT_PRECISION_SUGGESTOR_FORM_HANDLER = makeSymbol("CB-UIAT-PRECISION-SUGGESTOR-FORM-HANDLER");

    private static final SubLSymbol $COA_EVALUATOR = makeKeyword("COA-EVALUATOR");

    static private final SubLList $list_alt193 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-COA-EVALUATOR-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("METT-TC-COACritiquingTool")));

    static private final SubLList $list_alt194 = list(makeSymbol("&KEY"), makeSymbol("DIMENSIONS"), makeSymbol("ATTRIBUTES"), makeSymbol("MATRIX"), makeSymbol("DIMENSION-CLASSIFICATION"), makeSymbol("CLASSIFICATION-ORDERING"));

    static private final SubLList $list_alt195 = list(makeKeyword("DIMENSIONS"), makeKeyword("ATTRIBUTES"), makeKeyword("MATRIX"), makeKeyword("DIMENSION-CLASSIFICATION"), makeKeyword("CLASSIFICATION-ORDERING"));





    private static final SubLSymbol $MATRIX = makeKeyword("MATRIX");

    private static final SubLSymbol $DIMENSION_CLASSIFICATION = makeKeyword("DIMENSION-CLASSIFICATION");

    private static final SubLSymbol $CLASSIFICATION_ORDERING = makeKeyword("CLASSIFICATION-ORDERING");

    private static final SubLSymbol $SHOW_RESULTS = makeKeyword("SHOW-RESULTS");

    private static final SubLSymbol CB_UIAT_CELL_RENDERER_SHOW = makeSymbol("CB-UIAT-CELL-RENDERER-SHOW");

    private static final SubLSymbol CB_UIAT_ATTRIBUTE_TOOLS_SHOW = makeSymbol("CB-UIAT-ATTRIBUTE-TOOLS-SHOW");

    static private final SubLString $str_alt204$The_COA_under_consideration_is_ = makeString("The COA under consideration is ");

    private static final SubLSymbol $UIAT_COAEVAL_EDIT_RULE = makeKeyword("UIAT-COAEVAL-EDIT-RULE");

    static private final SubLString $str_alt206$_Edit_ = makeString("[Edit]");

    private static final SubLSymbol $UIAT_COAEVAL_TEST_RULE = makeKeyword("UIAT-COAEVAL-TEST-RULE");

    static private final SubLString $str_alt208$_Test_ = makeString("[Test]");

    static private final SubLString $$$no_items = makeString("no items");

    private static final SubLSymbol $UIAT_COAEVAL_ADD_RULE_TO_CELL = makeKeyword("UIAT-COAEVAL-ADD-RULE-TO-CELL");

    static private final SubLString $str_alt211$_Add_Rule_ = makeString("[Add Rule]");

    private static final SubLSymbol $UIAT_COAEVAL_RUN_ALL = makeKeyword("UIAT-COAEVAL-RUN-ALL");

    static private final SubLString $str_alt213$_Evaluate_COA_ = makeString("[Evaluate COA]");

    private static final SubLSymbol $UIAT_COAEVAL_DONE = makeKeyword("UIAT-COAEVAL-DONE");

    static private final SubLString $str_alt215$_Done_ = makeString("[Done]");

    static private final SubLString $str_alt216$The_following_table_summarizes_th = makeString("The following table summarizes the COA evaluation results.");

    private static final SubLSymbol CB_UIAT_CELL_RENDERER_SHOW_RESULTS = makeSymbol("CB-UIAT-CELL-RENDERER-SHOW-RESULTS");

    private static final SubLSymbol CB_UIAT_ATTRIBUTE_TOOLS_SHOW_RESULTS = makeSymbol("CB-UIAT-ATTRIBUTE-TOOLS-SHOW-RESULTS");

    private static final SubLSymbol $DIFFERENTIATE_ZEROS = makeKeyword("DIFFERENTIATE-ZEROS");

    static private final SubLList $list_alt220 = list(makeSymbol("BINDINGS"), makeSymbol("JUSTIFICATIONS"));

    static private final SubLList $list_alt221 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    static private final SubLString $str_alt222$____ = makeString(" => ");

    static private final SubLString $str_alt223$because__ = makeString("because: ");

    static private final SubLString $$$No_results = makeString("No results");

    private static final SubLSymbol $UIAT_COAEVAL_FORGET_RESULTS = makeKeyword("UIAT-COAEVAL-FORGET-RESULTS");

    static private final SubLString $str_alt226$98_ = makeString("98%");

    static private final SubLString $str_alt227$_D_item = makeString("~D item");

    static private final SubLString $str_alt228$_D_items = makeString("~D items");

    static private final SubLString $str_alt229$100_ = makeString("100%");

    static private final SubLString $str_alt230$90_ = makeString("90%");

    static private final SubLString $str_alt231$45_ = makeString("45%");

    static private final SubLString $str_alt232$cb_uiat_coaeval_handle_add_rule_t = makeString("cb-uiat-coaeval-handle-add-rule-to-cell");

    private static final SubLSymbol CB_LINK_UIAT_COAEVAL_ADD_RULE_TO_CELL = makeSymbol("CB-LINK-UIAT-COAEVAL-ADD-RULE-TO-CELL");

    static private final SubLList $list_alt234 = list(makeSymbol("INTERACTION"), makeSymbol("DIMENSION"), makeSymbol("ATTRIBUTE"));

    private static final SubLSymbol $ADD_RULE_TO_CELL = makeKeyword("ADD-RULE-TO-CELL");

    private static final SubLSymbol $DIMENSION = makeKeyword("DIMENSION");

    private static final SubLSymbol $ATTRIBUTE = makeKeyword("ATTRIBUTE");

    private static final SubLSymbol CB_UIAT_COAEVAL_HANDLE_ADD_RULE_TO_CELL = makeSymbol("CB-UIAT-COAEVAL-HANDLE-ADD-RULE-TO-CELL");

    static private final SubLString $$$Edit_Rule = makeString("Edit Rule");

    static private final SubLString $str_alt240$cb_uiat_coaeval_handle_edit_rule = makeString("cb-uiat-coaeval-handle-edit-rule");

    private static final SubLSymbol CB_LINK_UIAT_COAEVAL_EDIT_RULE = makeSymbol("CB-LINK-UIAT-COAEVAL-EDIT-RULE");

    static private final SubLList $list_alt242 = list(makeSymbol("INTERACTION"), makeSymbol("ASSERTION"));

    private static final SubLSymbol $EDIT_RULE = makeKeyword("EDIT-RULE");

    private static final SubLSymbol CB_UIAT_COAEVAL_HANDLE_EDIT_RULE = makeSymbol("CB-UIAT-COAEVAL-HANDLE-EDIT-RULE");

    static private final SubLString $$$Test_Rule = makeString("Test Rule");

    static private final SubLString $str_alt246$cb_uiat_coaeval_handle_test_rule = makeString("cb-uiat-coaeval-handle-test-rule");

    private static final SubLSymbol CB_LINK_UIAT_COAEVAL_TEST_RULE = makeSymbol("CB-LINK-UIAT-COAEVAL-TEST-RULE");

    static private final SubLList $list_alt248 = list(makeSymbol("INTERACTION"), makeSymbol("ASSERTION"), makeSymbol("DIMENSION"), makeSymbol("ATTRIBUTE"));

    private static final SubLSymbol $TEST_RULE = makeKeyword("TEST-RULE");

    private static final SubLSymbol CB_UIAT_COAEVAL_HANDLE_TEST_RULE = makeSymbol("CB-UIAT-COAEVAL-HANDLE-TEST-RULE");

    static private final SubLString $str_alt251$_Evaluate_COA_completely_ = makeString("[Evaluate COA completely]");

    static private final SubLString $str_alt252$cb_uiat_coaeval_handle_run_all = makeString("cb-uiat-coaeval-handle-run-all");

    private static final SubLSymbol CB_LINK_UIAT_COAEVAL_RUN_ALL = makeSymbol("CB-LINK-UIAT-COAEVAL-RUN-ALL");

    static private final SubLList $list_alt254 = list(makeSymbol("INTERACTION"));

    private static final SubLSymbol $EVALUATE_COA = makeKeyword("EVALUATE-COA");

    private static final SubLSymbol CB_UIAT_COAEVAL_HANDLE_RUN_ALL = makeSymbol("CB-UIAT-COAEVAL-HANDLE-RUN-ALL");



    private static final SubLSymbol CB_UIAT_COAEVAL_HANDLE_DONE = makeSymbol("CB-UIAT-COAEVAL-HANDLE-DONE");

    static private final SubLString $str_alt259$cb_uiat_coaeval_handle_done = makeString("cb-uiat-coaeval-handle-done");

    private static final SubLSymbol CB_LINK_UIAT_COAEVAL_DONE = makeSymbol("CB-LINK-UIAT-COAEVAL-DONE");

    static private final SubLString $str_alt261$_Forget_Results_ = makeString("[Forget Results]");

    static private final SubLString $str_alt262$cb_uiat_coaeval_handle_forget_res = makeString("cb-uiat-coaeval-handle-forget-results");

    private static final SubLSymbol CB_LINK_UIAT_COAEVAL_FORGET_RESULTS = makeSymbol("CB-LINK-UIAT-COAEVAL-FORGET-RESULTS");

    private static final SubLSymbol $FORGET_COA_RESULTS = makeKeyword("FORGET-COA-RESULTS");

    private static final SubLSymbol CB_UIAT_COAEVAL_HANDLE_FORGET_RESULTS = makeSymbol("CB-UIAT-COAEVAL-HANDLE-FORGET-RESULTS");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_tools_misc_file();
    }

    public void initializeVariables() {
        init_cb_uia_tools_misc_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_tools_misc_file();
    }
}

