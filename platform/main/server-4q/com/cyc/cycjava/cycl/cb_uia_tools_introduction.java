/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.browser.cb_query;
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
 *  module:      CB-UIA-TOOLS-INTRODUCTION
 *  source file: /cyc/top/cycl/cb-uia-tools-introduction.lisp
 *  created:     2019/07/03 17:38:10
 */
public final class cb_uia_tools_introduction extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_tools_introduction() {
    }

    public static final SubLFile me = new cb_uia_tools_introduction();

    public static final String myName = "com.cyc.cycjava.cycl.cb_uia_tools_introduction";

    // // Definitions
    public static final SubLObject cb_uiat_sentence_relator_render_request(SubLObject request) {
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
                            SubLObject sent_a_tail = property_list_member($SENT_A, current_2);
                            SubLObject sent_a = (NIL != sent_a_tail) ? ((SubLObject) (cadr(sent_a_tail))) : NIL;
                            SubLObject sent_b_tail = property_list_member($SENT_B, current_2);
                            SubLObject sent_b = (NIL != sent_b_tail) ? ((SubLObject) (cadr(sent_b_tail))) : NIL;
                            SubLObject relations_tail = property_list_member($RELATIONS, current_2);
                            SubLObject relations = (NIL != relations_tail) ? ((SubLObject) (cadr(relations_tail))) : NIL;
                            SubLObject default_relation_tail = property_list_member($DEFAULT_RELATION, current_2);
                            SubLObject default_relation = (NIL != default_relation_tail) ? ((SubLObject) (cadr(default_relation_tail))) : NIL;
                            cb_uiat_sentence_relator_guts(interaction, sent_a, sent_b, relations, default_relation);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_sentence_relator_guts(SubLObject interaction, SubLObject sent_a, SubLObject sent_b, SubLObject relations, SubLObject default_relation) {
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
                        html_utilities.html_hidden_input($str_alt11$cb_uiat_sentence_relator_handler, T, UNPROVIDED);
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
                        html_utilities.html_hidden_input($str_alt12$ui_id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_princ($str_alt13$How_do_you_want_to_relate_the_sen);
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        cb_uia_display_primitives.cb_uia_show_sentence(sent_a, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        html_utilities.html_princ($str_alt14$to_the_following_sentence_);
                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        if (sent_b == $NONE) {
                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($$$sentence);
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
                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                        } else {
                            cb_uia_display_primitives.cb_uia_show_sentence(sent_b, UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_utilities.html_select_from_list($$$choices, default_relation, relations, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                        cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
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

    public static final SubLObject cb_uiat_sentence_relator_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($str_alt12$ui_id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject sentence = html_utilities.html_extract_input($$$sentence, args);
            SubLObject choice = html_utilities.html_extract_input($$$choices, args);
            SubLObject plist = list($RELATIONSHIP, choice);
            SubLObject reply = NIL;
            if (length(sentence).isPositive()) {
                putf(plist, $SENT_B, sentence);
            }
            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $REPLY, plist);
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_concept_creator_render_request(SubLObject request) {
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
                if (pcase_var.eql($ONTOLOGIZE)) {
                    {
                        SubLObject datum_5 = plist;
                        SubLObject current_6 = datum_5;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_6;
                        SubLObject bad = NIL;
                        SubLObject current_7 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_5, $list_alt27);
                            current_7 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_5, $list_alt27);
                            if (NIL == member(current_7, $list_alt28, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_7 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_5, $list_alt27);
                        }
                        {
                            SubLObject phrase_tail = property_list_member($PHRASE, current_6);
                            SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                            SubLObject term_tail = property_list_member($TERM, current_6);
                            SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                            SubLObject isa_tail = property_list_member($ISA, current_6);
                            SubLObject v_isa = (NIL != isa_tail) ? ((SubLObject) (cadr(isa_tail))) : NIL;
                            SubLObject genls_tail = property_list_member($GENLS, current_6);
                            SubLObject v_genls = (NIL != genls_tail) ? ((SubLObject) (cadr(genls_tail))) : NIL;
                            SubLObject similar_tail = property_list_member($SIMILAR, current_6);
                            SubLObject similar = (NIL != similar_tail) ? ((SubLObject) (cadr(similar_tail))) : NIL;
                            SubLObject isa_templates_tail = property_list_member($ISA_TEMPLATES, current_6);
                            SubLObject isa_templates = (NIL != isa_templates_tail) ? ((SubLObject) (cadr(isa_templates_tail))) : NIL;
                            SubLObject genls_templates_tail = property_list_member($GENLS_TEMPLATES, current_6);
                            SubLObject genls_templates = (NIL != genls_templates_tail) ? ((SubLObject) (cadr(genls_templates_tail))) : NIL;
                            return cb_uiat_concept_creator_ontologize(interaction, phrase, v_term, v_isa, v_genls, similar, isa_templates, genls_templates);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_concept_creator_preferred_phrase(SubLObject interaction, SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != phrase) && (NIL != uima_interface_parameter_declaration.uia_forge_aheadP(cb_user_interaction_agenda.cb_current_uia()))) {
                cb_uiat_concept_creator_preferred_phrase_forge_ahead(interaction, phrase);
                return NIL;
            }
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
                        html_utilities.html_hidden_input($str_alt36$cb_uiat_handle_concept_creator_pr, T, UNPROVIDED);
                        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                            html_script_utilities.html_js_focus_window();
                        }
                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_princ($str_alt38$How_should_we_refer_to_);
                        html_utilities.html_prin1(phrase);
                        html_utilities.html_princ($str_alt39$__);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_text_input($str_alt40$preferred_phrase, phrase, $int$40);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_handle_concept_creator_preferred_phrase(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject preferred_phrase = html_utilities.html_extract_input($str_alt40$preferred_phrase, args);
            if (NIL == string_utilities.empty_string_p(preferred_phrase)) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $PREFERRED_PHRASE, list($PREFERRED_PHRASE, preferred_phrase));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param INTERACTION
     * 		user-interaction
     * @param PHRASE
     * 		string; the string used to refer to the new concept being created
     */
    public static final SubLObject cb_uiat_concept_creator_preferred_phrase_forge_ahead(SubLObject interaction, SubLObject phrase) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $PREFERRED_PHRASE, list($PREFERRED_PHRASE, phrase));
            SubLObject message = format(NIL, $str_alt44$Assuming_that_the_string__s_is_a_, phrase, phrase);
            user_interaction_agenda.uia_act_new_comment(v_agenda, message);
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    // defparameter
    private static final SubLSymbol $cb_uiat_concept_creator_show_template_topicsP$ = makeSymbol("*CB-UIAT-CONCEPT-CREATOR-SHOW-TEMPLATE-TOPICS?*");

    public static final SubLObject cb_uiat_concept_creator_ontologize(SubLObject interaction, SubLObject phrase, SubLObject v_term, SubLObject v_isa, SubLObject v_genls, SubLObject similar, SubLObject isa_templates, SubLObject genls_templates) {
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
                        html_utilities.html_hidden_input($str_alt45$cb_uiat_handle_concept_creator_on, T, UNPROVIDED);
                        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                            html_script_utilities.html_js_focus_window();
                        }
                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                        {
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                            SubLObject highlighting = html_macros.$html_color_sat_blue$.getDynamicValue(thread);
                            SubLObject precomputedP = NIL;
                            html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_princ($str_alt46$Please_describe_the_new_concept_);
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
                                SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
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
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($$$The_best_way_to_refer_to_it_is);
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
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject preferred_field_name = html_utilities.get_encoded_form_field_name($$$preferred);
                                                        html_utilities.html_text_input(preferred_field_name, phrase, TWENTY_INTEGER);
                                                    }
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
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_newline(UNPROVIDED);
                            {
                                SubLObject help_text = user_interaction_agenda.ui_help_text_for_tool_section(interaction, $PREFERRED_PHRASE);
                                if (NIL != help_text) {
                                    html_utilities.html_markup(user_interaction_agenda.ui_help_text_for_tool_section(interaction, $PREFERRED_PHRASE));
                                }
                            }
                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_princ($str_alt51$Please_fill_in_at_least_one_of_th);
                            html_utilities.html_newline(TWO_INTEGER);
                            {
                                SubLObject similar_help_text = user_interaction_agenda.ui_help_text_for_tool_section(interaction, $SIMILAR);
                                SubLObject isa_help_text = user_interaction_agenda.ui_help_text_for_tool_section(interaction, $ISA);
                                SubLObject genls_help_text = user_interaction_agenda.ui_help_text_for_tool_section(interaction, $GENLS);
                                SubLObject defining_help_text = user_interaction_agenda.ui_help_text_for_tool_section(interaction, $DEFINITIONAL);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($$$It_is_similar_to);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
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
                                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_uiat_concept_creator_show_typein_box(v_agenda, $$$similar, similar);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != similar_help_text) {
                                                            html_utilities.html_markup(similar_help_text);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($$$It_is_an_instance_of);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                if (NIL == v_isa) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_uiat_concept_creator_show_typein_box(v_agenda, $$$isa, v_isa);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } else {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != highlighting) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(highlighting);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            precomputedP = T;
                                                            cb_uiat_concept_creator_show_typein_box(v_agenda, $$$isa, v_isa);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != isa_help_text) {
                                                            html_utilities.html_markup(isa_help_text);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        if (NIL != isa_templates) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                                        cb_query.html_princ_with_explanation($str_alt57$often_occurring_instances, $str_alt58$Instances_in_this_list_occur_so_o, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject field_name = html_utilities.get_encoded_form_field_name($str_alt59$template_isa);
                                                                SubLObject already_selectedP = NIL;
                                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(field_name);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(ONE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject list_var = NIL;
                                                                            SubLObject isa_template = NIL;
                                                                            SubLObject position = NIL;
                                                                            for (list_var = isa_templates, isa_template = list_var.first(), position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , isa_template = list_var.first() , position = add(ONE_INTEGER, position)) {
                                                                                {
                                                                                    SubLObject datum = isa_template;
                                                                                    SubLObject current = datum;
                                                                                    SubLObject template_isa = NIL;
                                                                                    SubLObject template_topic = NIL;
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt60);
                                                                                    template_isa = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt60);
                                                                                    template_topic = current.first();
                                                                                    current = current.rest();
                                                                                    if (NIL == current) {
                                                                                        {
                                                                                            SubLObject selectedP = eq(v_isa, template_isa);
                                                                                            already_selectedP = makeBoolean((NIL != selectedP) || (NIL != already_selectedP));
                                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                            if (NIL != selectedP) {
                                                                                                html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                            }
                                                                                            if (NIL != position) {
                                                                                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_utilities.html_markup(position);
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            }
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_utilities.html_princ(uia_trampolines.uia_term_phrase(cb_user_interaction_agenda.cb_current_uia(), template_isa, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                                    if (NIL != $cb_uiat_concept_creator_show_template_topicsP$.getDynamicValue(thread)) {
                                                                                                        html_utilities.html_princ($str_alt61$__);
                                                                                                        html_utilities.html_princ(uia_trampolines.uia_term_phrase(cb_user_interaction_agenda.cb_current_uia(), template_topic, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                                        html_utilities.html_princ($str_alt62$_);
                                                                                                    }
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum, $list_alt60);
                                                                                    }
                                                                                }
                                                                            }
                                                                            {
                                                                                SubLObject none_selectedP = makeBoolean(NIL == already_selectedP);
                                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                if (NIL != none_selectedP) {
                                                                                    html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                }
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(MINUS_ONE_INTEGER);
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_princ($$$None_selected);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($$$It_is_a_more_specific_kind_of);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                if (NIL == v_genls) {
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
                                                            cb_uiat_concept_creator_show_typein_box(v_agenda, $$$genls, v_genls);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } else {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != highlighting) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(highlighting);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            precomputedP = T;
                                                            cb_uiat_concept_creator_show_typein_box(v_agenda, $$$genls, v_genls);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != genls_help_text) {
                                                            html_utilities.html_markup(genls_help_text);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        if (NIL != genls_templates) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                                        cb_query.html_princ_with_explanation($str_alt66$often_occurring_kinds, $str_alt67$Kinds_in_this_list_occur_so_often, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject field_name = html_utilities.get_encoded_form_field_name($str_alt68$template_genls);
                                                                SubLObject already_selectedP = NIL;
                                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(field_name);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(ONE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject list_var = NIL;
                                                                            SubLObject genls_template = NIL;
                                                                            SubLObject position = NIL;
                                                                            for (list_var = genls_templates, genls_template = list_var.first(), position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , genls_template = list_var.first() , position = add(ONE_INTEGER, position)) {
                                                                                {
                                                                                    SubLObject datum = genls_template;
                                                                                    SubLObject current = datum;
                                                                                    SubLObject template_genls = NIL;
                                                                                    SubLObject template_topic = NIL;
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt69);
                                                                                    template_genls = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt69);
                                                                                    template_topic = current.first();
                                                                                    current = current.rest();
                                                                                    if (NIL == current) {
                                                                                        {
                                                                                            SubLObject selectedP = eq(v_genls, template_genls);
                                                                                            already_selectedP = makeBoolean((NIL != selectedP) || (NIL != already_selectedP));
                                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                            if (NIL != selectedP) {
                                                                                                html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                            }
                                                                                            if (NIL != position) {
                                                                                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_utilities.html_markup(position);
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            }
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_utilities.html_princ(uia_trampolines.uia_term_phrase(cb_user_interaction_agenda.cb_current_uia(), template_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                                    if (NIL != $cb_uiat_concept_creator_show_template_topicsP$.getDynamicValue(thread)) {
                                                                                                        html_utilities.html_princ($str_alt61$__);
                                                                                                        html_utilities.html_princ(uia_trampolines.uia_term_phrase(cb_user_interaction_agenda.cb_current_uia(), template_topic, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                                        html_utilities.html_princ($str_alt62$_);
                                                                                                    }
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum, $list_alt69);
                                                                                    }
                                                                                }
                                                                            }
                                                                            {
                                                                                SubLObject none_selectedP = makeBoolean(NIL == already_selectedP);
                                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                if (NIL != none_selectedP) {
                                                                                    html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                }
                                                                                if (true) {
                                                                                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(MINUS_ONE_INTEGER);
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_princ($$$None_selected);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                if (NIL != defining_help_text) {
                                    html_utilities.html_markup(defining_help_text);
                                }
                                if (NIL != precomputedP) {
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt70$Note__);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    html_utilities.html_princ($$$Elements_with);
                                    html_utilities.html_indent(TWO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_style_background_color(highlighting);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                    html_utilities.html_indent(TWO_INTEGER);
                                    html_utilities.html_princ($str_alt72$highlighting_contain_information_);
                                }
                            }
                            html_utilities.html_newline(TWO_INTEGER);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_concept_creator_show_typein_box(SubLObject v_agenda, SubLObject type, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject field_name = html_utilities.get_encoded_form_field_name(type);
                SubLObject default_text = (NIL != value) ? ((SubLObject) (uia_trampolines.uia_term_phrase(v_agenda, value, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                html_utilities.html_text_input(field_name, default_text, TWENTY_INTEGER);
            }
            if (NIL != value) {
                thread.resetMultipleValues();
                {
                    SubLObject value_name = cb_uiat_concept_creator_hidden_field_names(type);
                    SubLObject phrase_name = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    html_utilities.html_hidden_input(value_name, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, value), UNPROVIDED);
                    html_utilities.html_hidden_input(phrase_name, uia_trampolines.uia_term_phrase(v_agenda, value, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                }
            }
            return value;
        }
    }

    public static final SubLObject cb_uiat_concept_creator_hidden_field_names(SubLObject type) {
        {
            SubLObject value_name = cconcatenate($str_alt73$default_, new SubLObject[]{ type, $str_alt74$_value });
            SubLObject phrase_name = cconcatenate($str_alt73$default_, new SubLObject[]{ type, $str_alt75$_phrase });
            return values(value_name, phrase_name);
        }
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_concept_creator_ontologize_fields$ = makeSymbol("*CB-UIAT-CONCEPT-CREATOR-ONTOLOGIZE-FIELDS*");

    public static final SubLObject cb_uiat_handle_concept_creator_ontologize(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject id_string = html_utilities.html_extract_input($$$id, args);
                SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                SubLObject accepted_terms = NIL;
                SubLObject phrase_plist = NIL;
                SubLObject cdolist_list_var = $cb_uiat_concept_creator_ontologize_fields$.getGlobalValue();
                SubLObject field_description = NIL;
                for (field_description = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , field_description = cdolist_list_var.first()) {
                    {
                        SubLObject datum = field_description;
                        SubLObject current = datum;
                        SubLObject basic_field_name = NIL;
                        SubLObject ontologize_type = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt77);
                        basic_field_name = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt77);
                        ontologize_type = current.first();
                        current = current.rest();
                        {
                            SubLObject converter = (current.isCons()) ? ((SubLObject) (current.first())) : TO_STRING;
                            destructuring_bind_must_listp(current, datum, $list_alt77);
                            current = current.rest();
                            if (NIL == current) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject default_value_name = cb_uiat_concept_creator_hidden_field_names(basic_field_name);
                                    SubLObject default_phrase_name = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject raw_phrase = html_utilities.extract_encoded_form_field_value(basic_field_name, args);
                                        SubLObject phrase = (NIL == raw_phrase) ? ((SubLObject) (raw_phrase)) : funcall(converter, raw_phrase);
                                        SubLObject default_phrase = html_utilities.html_extract_input(default_phrase_name, args);
                                        if (NIL != string_utilities.empty_string_p(phrase)) {
                                        } else
                                            if (NIL == phrase) {
                                            } else
                                                if (phrase.isFixnum()) {
                                                    if (NIL == number_utilities.negative_number_p(phrase)) {
                                                        accepted_terms = putf(accepted_terms, ontologize_type, phrase);
                                                    }
                                                } else
                                                    if (phrase.equal(default_phrase)) {
                                                        {
                                                            SubLObject default_value = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input(default_value_name, args));
                                                            accepted_terms = putf(accepted_terms, ontologize_type, default_value);
                                                        }
                                                    } else {
                                                        phrase_plist = putf(phrase_plist, ontologize_type, phrase);
                                                    }



                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt77);
                            }
                        }
                    }
                }
                {
                    SubLObject reply_plist = list($ACCEPTED_TERMS, accepted_terms, $PHRASES, phrase_plist);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ONTOLOGIZE, reply_plist);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            }
        }
    }

    public static final SubLObject uiat_rule_constructor_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            if (NIL != args) {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject v_if = NIL;
                    SubLObject then = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt85);
                    v_if = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt85);
                    then = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return format(NIL, $str_alt86$Construct_New_Rule__If__a_then__a, v_if, then);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt85);
                    }
                }
            } else {
                return format(NIL, $$$Construct_a_New_Rule);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_rule_constructor_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($SCENARIO_CONSTRUCTOR)) {
                {
                    SubLObject v_scenario = user_interaction_agenda.ui_result(child);
                    if (user_interaction_agenda.ui_state_lookup(child, $EXCEPTIONS, $UNKNOWN) == $TRUE) {
                        user_interaction_agenda.ui_state_update(parent, $RC_ACT, $ADD_EXCEPTIONS);
                        user_interaction_agenda.ui_state_update(parent, $RC_EXCEPTION_SCENARIO, v_scenario);
                    } else
                        if (user_interaction_agenda.ui_state_lookup(child, $THEN_CLAUSE, $UNKNOWN) == $TRUE) {
                            user_interaction_agenda.ui_state_update(parent, $RC_ACT, $UPDATE_THEN_SCENARIO);
                            user_interaction_agenda.ui_state_update(parent, $RC_THEN_SCENARIO, v_scenario);
                        } else {
                            user_interaction_agenda.ui_state_update(parent, $RC_SCENARIO, v_scenario);
                            user_interaction_agenda.ui_state_update(parent, $RC_ACT, $USE_SCENARIO);
                        }

                }
            } else
                if (pcase_var.eql($ASSERTION_CREATOR)) {
                    {
                        SubLObject result_sentence = user_interaction_agenda.ui_state_lookup(child, $CYCL_SENTENCE, UNPROVIDED);
                        uiat_rule_constructor_handle_assertion_success(parent, result_sentence, UNPROVIDED);
                    }
                    user_interaction_agenda.ui_state_update(parent, $RC_ACT, $FINISH);
                } else
                    if (pcase_var.eql($SENTENCE_READER)) {
                        {
                            SubLObject cycl_sentences = user_interaction_agenda.ui_result(child);
                            SubLObject sentence = NIL;
                            if (NIL != list_utilities.singletonP(cycl_sentences)) {
                                sentence = cycl_sentences.first();
                            } else {
                                sentence = cycl_sentences.first();
                            }
                            if (NIL != cycl_utilities.expression_find_if(symbol_function(SM_INDEXICAL_P), sentence, UNPROVIDED, UNPROVIDED)) {
                                user_interaction_agenda.ui_state_update(parent, $THEN_CYCL_SENTENCE, sentence);
                            } else {
                                user_interaction_agenda.ui_state_update(parent, $THEN_CYCL_SENTENCE, $NONE);
                            }
                        }
                    } else
                        if (pcase_var.eql($SENTENCE_FINDER) || pcase_var.eql($DISAMBIGUATE_PHRASE)) {
                            {
                                SubLObject cycl_sentence = user_interaction_agenda.ui_result(child);
                                if (NIL != cycl_utilities.expression_find_if(symbol_function(SM_INDEXICAL_P), cycl_sentence, UNPROVIDED, UNPROVIDED)) {
                                    user_interaction_agenda.ui_state_update(parent, $THEN_CYCL_SENTENCE, cycl_sentence);
                                } else {
                                    user_interaction_agenda.ui_state_update(parent, $THEN_CYCL_SENTENCE, $NONE);
                                }
                            }
                        }



        }
        return parent;
    }

    public static final SubLObject uiat_rule_constructor_child_rejected(SubLObject parent, SubLObject child) {
        return uiat_rule_constructor_child_invalidated(parent, child);
    }

    public static final SubLObject uiat_rule_constructor_child_invalidated(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($ASSERTION_CREATOR)) {
                return uiat_rule_constructor_rule_not_asserted_message(parent);
            } else
                if (pcase_var.eql($SCENARIO_CONSTRUCTOR)) {
                    return parent;
                } else
                    if (pcase_var.eql($SENTENCE_FINDER) || pcase_var.eql($DISAMBIGUATE_PHRASE)) {
                        user_interaction_agenda.ui_state_update(parent, $THEN_CYCL_SENTENCE, $NONE);
                        return parent;
                    }


        }
        return NIL;
    }

    public static final SubLObject uiat_rule_constructor_handle_assertion_success(SubLObject parent, SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject state = user_interaction_agenda.ui_state_lookup(parent, $RC_STATE, $UNDETERMINED);
            SubLObject rule_cycl = sentence;
            SubLObject nl_sentence = uia_trampolines.uia_sentence_phrase(v_agenda, rule_cycl, UNPROVIDED, UNPROVIDED);
            if (NIL == hlmt.hlmt_p(mt)) {
                mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            }
            {
                SubLObject cdolist_list_var = rkf_rule_constructor.rc_state_exceptions(state);
                SubLObject exception = NIL;
                for (exception = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , exception = cdolist_list_var.first()) {
                    {
                        SubLObject exception_cycl = rkf_rule_constructor.rc_act_compute_cycl_for_exception(state, exception, rule_cycl, mt);
                        SubLObject exception_sentence = cconcatenate($str_alt110$Exceptions_to_, nl_sentence);
                        uia_tools_introduction.uia_act_new_assertion_creator(v_agenda, $REQUIRED, exception_sentence, exception_cycl, UNPROVIDED);
                    }
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_rule_constructor_rule_not_asserted_message(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject message = $$$Rule_not_added;
            SubLObject message_action = user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, message_action);
            user_interaction_agenda.ui_state_update(interaction, $RC_ACT, $UNDETERMINED);
        }
        return interaction;
    }

    public static final SubLObject uiat_rc_prepare_editing_else_clause(SubLObject interaction, SubLObject state) {
        {
            SubLObject v_scenario = rkf_rule_constructor.rc_act_ensure_then_scenario(state);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject scenario_constructor_action = uia_tools_wizards.uia_act_new_scenario_constructor(v_agenda, $$$Else_Clause, $REQUIRED, v_scenario);
            user_interaction_agenda.ui_state_update(scenario_constructor_action, $THEN_CLAUSE, $TRUE);
            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, scenario_constructor_action);
        }
        return state;
    }

    // deflexical
    private static final SubLSymbol $uiat_rc_rhs_not_understood_msg$ = makeSymbol("*UIAT-RC-RHS-NOT-UNDERSTOOD-MSG*");

    public static final SubLObject uiat_rc_ensure_rhs_not_understood_msg() {
        if (!$uiat_rc_rhs_not_understood_msg$.getGlobalValue().isString()) {
            $uiat_rc_rhs_not_understood_msg$.setGlobalValue(cconcatenate($str_alt114$Either_your_input_was_not_underst, new SubLObject[]{ $str_alt115$_or_it_did_not_contain_any_, cb_scenario_constructor.$cb_sc_default_general_term$.getGlobalValue(), $str_alt116$_, $str_alt117$_Please_retry_entering_the_else_c, uia_tool_declaration.ui_operator_name($SCENARIO_CONSTRUCTOR), $str_alt118$_which_will_launch_automatically_, $str_alt119$_this_message_ }));
        }
        return $uiat_rc_rhs_not_understood_msg$.getGlobalValue();
    }

    public static final SubLObject uiat_rule_constructor_rhs_not_understood(SubLObject interaction) {
        {
            SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $RC_STATE, UNPROVIDED);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject message_action = user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, uiat_rc_ensure_rhs_not_understood_msg());
            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, message_action);
            uiat_rc_prepare_editing_else_clause(interaction, state);
        }
        return interaction;
    }

    public static final SubLObject uiat_rule_constructor_specify_action(SubLObject rc_state, SubLObject action, SubLObject parameter) {
        if (parameter == UNPROVIDED) {
            parameter = $UNDETERMINED;
        }
        {
            SubLObject interaction = rkf_rule_constructor.rc_state_interaction(rc_state);
            user_interaction_agenda.ui_state_update(interaction, $RC_ACT, action);
            if (parameter != $UNDETERMINED) {
                user_interaction_agenda.ui_state_update(interaction, $RC_ACT_PARAMETER, parameter);
            }
        }
        return rc_state;
    }

    public static final SubLObject cb_uiat_rule_constructor_display(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject rc_state = user_interaction_agenda.ui_state_lookup(interaction, $RC_STATE, $UNDETERMINED);
            SubLObject rc_act = user_interaction_agenda.ui_state_lookup(interaction, $RC_ACT, $UNDETERMINED);
            SubLObject then_cycl = user_interaction_agenda.ui_state_lookup(interaction, $THEN_CYCL_SENTENCE, $UNDETERMINED);
            if (!then_cycl.eql($UNDETERMINED)) {
                user_interaction_agenda.ui_state_clear(interaction, $THEN_CYCL_SENTENCE);
                if (NIL != el_utilities.possibly_sentence_p(then_cycl)) {
                    {
                        SubLObject then_nl_sentence = user_interaction_agenda.ui_state_lookup(interaction, $THEN_SENTENCE, UNPROVIDED);
                        rkf_rule_constructor.rc_act_set_rhs_constraint(rc_state, then_cycl);
                        if (then_nl_sentence.isString()) {
                            rkf_rule_constructor.rc_act_set_rhs_nl_sentence(rc_state, then_nl_sentence);
                        }
                        return cb_rule_constructor.cb_rc_show_state_guts(rc_state);
                    }
                } else {
                    uiat_rule_constructor_rhs_not_understood(interaction);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else
                if ((NIL != rkf_rule_constructor.rc_state_p(rc_state)) && rc_act.eql($UNDETERMINED)) {
                    return cb_rule_constructor.cb_rc_show_state_guts(rc_state);
                } else
                    if ((NIL != rkf_rule_constructor.rc_state_p(rc_state)) && rc_act.eql($FIND_SCENARIOS)) {
                        user_interaction_agenda.ui_state_clear(interaction, $RC_ACT);
                        return cb_rule_constructor.cb_rc_find_lhs_scenario_guts(rc_state);
                    } else
                        if ((NIL != rkf_rule_constructor.rc_state_p(rc_state)) && rc_act.eql($BUILD_SCENARIO)) {
                            {
                                SubLObject if_sentence = user_interaction_agenda.ui_state_lookup(interaction, $IF_SENTENCE, UNPROVIDED);
                                SubLObject scenario_constructor_action = uia_tools_wizards.uia_act_new_scenario_constructor(v_agenda, if_sentence, $REQUIRED, UNPROVIDED);
                                user_interaction_agenda.ui_state_clear(interaction, $RC_ACT);
                                user_interaction_agenda.ui_state_clear(interaction, $IF_SENTENCE);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, scenario_constructor_action);
                                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                            }
                        } else
                            if ((NIL != rkf_rule_constructor.rc_state_p(rc_state)) && rc_act.eql($USE_SCENARIO)) {
                                {
                                    SubLObject v_scenario = user_interaction_agenda.ui_state_lookup(interaction, $RC_SCENARIO, UNPROVIDED);
                                    user_interaction_agenda.ui_state_clear(interaction, $RC_ACT);
                                    return cb_rule_constructor.cb_rc_init_lhs_from_scenario(rc_state, v_scenario);
                                }
                            } else
                                if ((NIL != rkf_rule_constructor.rc_state_p(rc_state)) && rc_act.eql($PARSE_RHS)) {
                                    {
                                        SubLObject then_sentence = user_interaction_agenda.ui_state_lookup(interaction, $THEN_SENTENCE, UNPROVIDED);
                                        user_interaction_agenda.ui_state_clear(interaction, $RC_ACT);
                                        {
                                            SubLObject v_scenario = rkf_rule_constructor.rc_state_if_scenario(rc_state);
                                            SubLObject indexical_table = rkf_scenario_manipulator.sm_act_construct_indexical_table(v_scenario);
                                            SubLObject constraint_table = rkf_scenario_manipulator.sm_act_construct_indexical_constraint_table(v_scenario);
                                            SubLObject child = cb_uiat_smart.uia_act_new_constraint_reader(v_agenda, $REQUIRED, then_sentence, indexical_table, constraint_table);
                                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                                        }
                                    }
                                } else
                                    if (rc_act.eql($PASTE_RHS)) {
                                        {
                                            SubLObject v_scenario = rkf_rule_constructor.rc_state_if_scenario(rc_state);
                                            SubLObject indexical_table = rkf_scenario_manipulator.sm_act_construct_indexical_table(v_scenario);
                                            SubLObject sentence_finder_action = uia_tools_basic.uia_act_new_sentence_finder(v_agenda, $REQUIRED, indexical_table, UNPROVIDED);
                                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, sentence_finder_action);
                                            user_interaction_agenda.ui_state_clear(interaction, $RC_ACT);
                                            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                                        }
                                    } else
                                        if (rc_act.eql($ADD_EXCEPTIONS)) {
                                            {
                                                SubLObject v_scenario = user_interaction_agenda.ui_state_lookup(interaction, $RC_EXCEPTION_SCENARIO, UNPROVIDED);
                                                rkf_rule_constructor.rc_act_add_new_exception_scenario(rc_state, v_scenario);
                                                user_interaction_agenda.ui_state_clear(interaction, $RC_EXCEPTION_SCENARIO);
                                                user_interaction_agenda.ui_state_clear(interaction, $RC_ACT);
                                                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                                            }
                                        } else
                                            if (rc_act.eql($UPDATE_THEN_SCENARIO)) {
                                                {
                                                    SubLObject v_scenario = user_interaction_agenda.ui_state_lookup(interaction, $RC_THEN_SCENARIO, UNPROVIDED);
                                                    rkf_rule_constructor.rc_act_update_then_scenario(rc_state, v_scenario);
                                                    user_interaction_agenda.ui_state_clear(interaction, $RC_THEN_SCENARIO);
                                                    user_interaction_agenda.ui_state_clear(interaction, $RC_ACT);
                                                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                                                }
                                            } else
                                                if (rc_act == $ASSERT_SENTENCE) {
                                                    {
                                                        SubLObject sentence = rkf_rule_constructor.rc_act_construct_rule_cycl(rc_state);
                                                        SubLObject nl_sentence = uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED);
                                                        SubLObject assertion_creator = NIL;
                                                        assertion_creator = uia_tools_introduction.uia_act_new_assertion_creator(v_agenda, $REQUIRED, nl_sentence, sentence, UNPROVIDED);
                                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, assertion_creator);
                                                    }
                                                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                                                } else
                                                    if (rc_act == $ASSERT_EXCEPTION) {
                                                        {
                                                            SubLObject assertion = user_interaction_agenda.ui_state_lookup(interaction, $RC_ACT_PARAMETER, UNPROVIDED);
                                                            SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
                                                            SubLObject mt = assertions_high.assertion_mt(assertion);
                                                            uiat_rule_constructor_handle_assertion_success(interaction, sentence, mt);
                                                        }
                                                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                                                        cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                                                    } else
                                                        if (rc_act == $FINISH) {
                                                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                                                            cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                                                        }











            return NIL;
        }
    }

    public static final SubLObject uia_act_new_rule_constructor_for_consequent(SubLObject v_agenda, SubLObject consequent, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $REQUIRED;
        }
        {
            SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $RULE_CONSTRUCTOR, UNPROVIDED, UNPROVIDED);
            SubLObject rc_state = rkf_rule_constructor.rc_act_new_state();
            rkf_rule_constructor.rc_act_note_state_interaction(rc_state, interaction);
            rkf_rule_constructor.rc_act_initialize_rule_for_consequent(rc_state, consequent, uia_trampolines.uia_sentence_phrase(v_agenda, consequent, UNPROVIDED, UNPROVIDED));
            user_interaction_agenda.ui_state_update(interaction, $RC_STATE, rc_state);
            return interaction;
        }
    }

    public static final SubLObject uia_act_new_rule_constructor(SubLObject v_agenda, SubLObject if_sentence, SubLObject then_sentence, SubLObject mode, SubLObject cycl_implication) {
        if (if_sentence == UNPROVIDED) {
            if_sentence = NIL;
        }
        if (then_sentence == UNPROVIDED) {
            then_sentence = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $REQUIRED;
        }
        if (cycl_implication == UNPROVIDED) {
            cycl_implication = NIL;
        }
        {
            SubLObject args = ((NIL != if_sentence) && (NIL != then_sentence)) ? ((SubLObject) (list(if_sentence, then_sentence))) : NIL != if_sentence ? ((SubLObject) (list(if_sentence))) : NIL;
            SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $RULE_CONSTRUCTOR, args, UNPROVIDED);
            SubLObject rc_state = ((NIL != if_sentence) && (NIL != then_sentence)) ? ((SubLObject) (rkf_rule_constructor.rc_act_new_state_with_if_then(if_sentence, then_sentence))) : NIL != if_sentence ? ((SubLObject) (rkf_rule_constructor.rc_act_new_state_with_text(if_sentence))) : rkf_rule_constructor.rc_act_new_state();
            rkf_rule_constructor.rc_act_note_state_interaction(rc_state, interaction);
            if (NIL != rkf_rule_constructor.rc_valid_implication(cycl_implication)) {
                rkf_rule_constructor.rc_act_initialize_rule_from_cycl(rc_state, cycl_implication);
            } else
                if ((NIL != if_sentence) && (NIL != then_sentence)) {
                    user_interaction_agenda.ui_state_update(interaction, $RC_ACT, $FIND_SCENARIOS);
                }

            user_interaction_agenda.ui_state_update(interaction, $RC_STATE, rc_state);
            return interaction;
        }
    }

    /**
     * assumes CYCL-SENTENCE is an rc-valid-implication.
     */
    public static final SubLObject cb_link_uia_rule_constructor_from_cycl(SubLObject cycl_implication, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(cycl_implication);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt131$cb_uia_rule_constructor_from_cycl, arglist);
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
     * assumes CYCL-SENTENCE is an rc-valid-implication.
     */
    public static final SubLObject cb_uia_rule_constructor_from_cycl(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
                SubLObject current = datum;
                SubLObject cycl_implication = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt134);
                cycl_implication = current.first();
                current = current.rest();
                if (NIL == current) {
                    thread.resetMultipleValues();
                    {
                        SubLObject implies = el_utilities.unmake_binary_formula(cycl_implication);
                        SubLObject antecedent = thread.secondMultipleValue();
                        SubLObject consequent = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if ($$implies != implies) {
                                Errors.error($str_alt136$Error__invalid_rule_for_Rule_Cons);
                            }
                        }
                        uia_act_new_rule_constructor(v_agenda, NIL, NIL, $REQUIRED, cycl_implication);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt134);
                }
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    public static final SubLObject cb_uiat_analogy_developer_render_request(SubLObject request) {
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
                            destructuring_bind_must_consp(rest, datum_42, $list_alt140);
                            current_44 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_42, $list_alt140);
                            if (NIL == member(current_44, $list_alt141, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_44 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_42, $list_alt140);
                        }
                        {
                            SubLObject target_term_tail = property_list_member($TARGET_TERM, current_43);
                            SubLObject target_term = (NIL != target_term_tail) ? ((SubLObject) (cadr(target_term_tail))) : NIL;
                            SubLObject source_term_tail = property_list_member($SOURCE_TERM, current_43);
                            SubLObject source_term = (NIL != source_term_tail) ? ((SubLObject) (cadr(source_term_tail))) : NIL;
                            SubLObject equals_tail = property_list_member($EQUALS, current_43);
                            SubLObject v_equals = (NIL != equals_tail) ? ((SubLObject) (cadr(equals_tail))) : NIL;
                            SubLObject candidate_sentences_tail = property_list_member($CANDIDATE_SENTENCES, current_43);
                            SubLObject candidate_sentences = (NIL != candidate_sentences_tail) ? ((SubLObject) (cadr(candidate_sentences_tail))) : NIL;
                            return cb_analogy_developer_guts(interaction, target_term, source_term, v_equals, candidate_sentences);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_analogy_developer_guts(SubLObject interaction, SubLObject target, SubLObject source, SubLObject v_equals, SubLObject candidate_sentences) {
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
                        html_utilities.html_hidden_input($str_alt146$cb_uia_analogy_developer_handler, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt147$num_candidates, length(candidate_sentences), UNPROVIDED);
                        {
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                            SubLObject source_phrase = uia_trampolines.uia_html_term_phrase_np(v_agenda, source, UNPROVIDED, UNPROVIDED);
                            SubLObject target_phrase = uia_trampolines.uia_html_term_phrase_np(v_agenda, target, UNPROVIDED, UNPROVIDED);
                            if ($TRUE == v_equals) {
                                html_utilities.html_newline(TWO_INTEGER);
                                cb_uia_display_primitives.cb_uia_show_term(target, target_phrase);
                                html_utilities.html_princ($str_alt148$_and_);
                                cb_uia_display_primitives.cb_uia_show_term(source, source_phrase);
                                html_utilities.html_princ($str_alt149$_are_exactly_the_same_);
                                html_utilities.html_newline(THREE_INTEGER);
                                html_utilities.html_submit_input($$$OK, UNPROVIDED, UNPROVIDED);
                            } else
                                if (NIL == candidate_sentences) {
                                    html_utilities.html_newline(TWO_INTEGER);
                                    html_utilities.html_princ($str_alt151$I_don_t_know_anything_about_);
                                    cb_uia_display_primitives.cb_uia_show_term(source, source_phrase);
                                    html_utilities.html_princ($str_alt152$_that_could_also_be_true_of_);
                                    cb_uia_display_primitives.cb_uia_show_term(target, target_phrase);
                                    html_utilities.html_princ($str_alt153$_but_that_I_don_t_already_know_to);
                                    cb_uia_display_primitives.cb_uia_show_term(target, target_phrase);
                                    html_utilities.html_princ($str_alt116$_);
                                    html_utilities.html_newline(TWO_INTEGER);
                                    cb_utilities.cb_link($UIA_SALIENT_DESCRIPTOR_REQUIRED, source, format(NIL, $str_alt155$_Tell_me_more_about__A__, uia_trampolines.uia_term_phrase_np(v_agenda, source, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_newline(UNPROVIDED);
                                    cb_utilities.cb_link($UIA_SALIENT_DESCRIPTOR_REQUIRED, target, format(NIL, $str_alt155$_Tell_me_more_about__A__, uia_trampolines.uia_term_phrase_np(v_agenda, target, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_submit_input($str_alt156$Forget_it_, UNPROVIDED, UNPROVIDED);
                                } else {
                                    html_utilities.html_newline(TWO_INTEGER);
                                    html_utilities.html_princ($str_alt157$Which_of_the_following_things_I_k);
                                    cb_uia_display_primitives.cb_uia_show_term(source, source_phrase);
                                    html_utilities.html_princ($str_alt158$_are_also_true_of_);
                                    cb_uia_display_primitives.cb_uia_show_term(target, target_phrase);
                                    html_utilities.html_princ($str_alt159$_);
                                    html_utilities.html_newline(TWO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(ZERO_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
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
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject boxes_enabledP = uima_interface_parameter_declaration.uia_precheck_analogy_developer_selectionsP(v_agenda);
                                                SubLObject v_switch = (NIL != boxes_enabledP) ? ((SubLObject) ($$$on)) : $$$off;
                                                SubLObject checked = (NIL != boxes_enabledP) ? ((SubLObject) (T)) : NIL;
                                                SubLObject list_var = NIL;
                                                SubLObject sub = NIL;
                                                SubLObject index = NIL;
                                                for (list_var = user_interaction_agenda.ui_sub_interactions(interaction), sub = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sub = list_var.first() , index = add(ONE_INTEGER, index)) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_checkbox_input(index, v_switch, checked, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent(FOUR_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
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
                                                                SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_uia_widgets.cb_uia_show_widget(sub);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                }

                            html_utilities.html_indent(TWO_INTEGER);
                            if (NIL != cb_uia_collaborators.uiaext_is_fire_initializedP(user_interaction_agenda.ui_agenda(interaction))) {
                                html_utilities.html_submit_input($str_alt163$Ask_FIRE_, $$$fire, UNPROVIDED);
                                html_utilities.html_indent(TWO_INTEGER);
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
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_uia_analogy_developer_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject id_string = html_utilities.html_extract_input($$$id, args);
                SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                if (NIL != html_utilities.html_extract_input($$$fire, args)) {
                    {
                        SubLObject target_term = user_interaction_agenda.ui_state_lookup(interaction, $TARGET_TERM, UNPROVIDED);
                        SubLObject source_term = user_interaction_agenda.ui_state_lookup(interaction, $SOURCE_TERM, UNPROVIDED);
                        SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FIRE, list($TARGET_TERM, target_term, $SOURCE_TERM, source_term));
                        return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                    }
                } else {
                    {
                        SubLObject num_candidates = parse_integer(html_utilities.html_extract_input($str_alt147$num_candidates, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject checked_widgets = NIL;
                        SubLObject choice = NIL;
                        for (choice = ZERO_INTEGER; choice.numL(num_candidates); choice = add(choice, ONE_INTEGER)) {
                            {
                                SubLObject choice_checked = html_utilities.html_extract_input(string_utilities.str(choice), args);
                                if ($$$on.equal(choice_checked)) {
                                    {
                                        SubLObject widget = nth(choice, user_interaction_agenda.ui_sub_interactions(interaction));
                                        checked_widgets = cons(widget, checked_widgets);
                                    }
                                }
                            }
                        }
                        if (NIL != checked_widgets) {
                            {
                                SubLObject cdolist_list_var = checked_widgets;
                                SubLObject widget = NIL;
                                for (widget = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , widget = cdolist_list_var.first()) {
                                    {
                                        SubLObject widget_result = cb_uia_widgets.cb_uia_widget_html_handler(widget, args);
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if ($PROMOTED != widget_result) {
                                                Errors.error($str_alt167$unexpected_result_from_one_of_the, widget_result);
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $WAIT, NIL);
                                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                                }
                            }
                        } else {
                            {
                                SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, NIL);
                                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject cb_link_uia_analogy_developer_guts(SubLObject target_term, SubLObject source_term, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(target_term, source_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt171$cb_uia_analogy_developer_guts, arglist);
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

    public static final SubLObject cb_uia_analogy_developer_guts(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject target_term = NIL;
            SubLObject source_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt174);
            target_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt174);
            source_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject target_phrase = uia_trampolines.uia_term_phrase(v_agenda, target_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject source_phrase = uia_trampolines.uia_term_phrase(v_agenda, source_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ANALOGY_DEVELOPER, $LAUNCH, list($TARGET_PHRASE, target_phrase, $SOURCE_PHRASE, source_phrase, $TARGET_TERM, target_term, $SOURCE_TERM, source_term));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt174);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cb_uia_tools_introduction_file() {
        declareFunction("cb_uiat_sentence_relator_render_request", "CB-UIAT-SENTENCE-RELATOR-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_sentence_relator_guts", "CB-UIAT-SENTENCE-RELATOR-GUTS", 5, 0, false);
        declareFunction("cb_uiat_sentence_relator_handler", "CB-UIAT-SENTENCE-RELATOR-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_concept_creator_render_request", "CB-UIAT-CONCEPT-CREATOR-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_concept_creator_preferred_phrase", "CB-UIAT-CONCEPT-CREATOR-PREFERRED-PHRASE", 2, 0, false);
        declareFunction("cb_uiat_handle_concept_creator_preferred_phrase", "CB-UIAT-HANDLE-CONCEPT-CREATOR-PREFERRED-PHRASE", 1, 0, false);
        declareFunction("cb_uiat_concept_creator_preferred_phrase_forge_ahead", "CB-UIAT-CONCEPT-CREATOR-PREFERRED-PHRASE-FORGE-AHEAD", 2, 0, false);
        declareFunction("cb_uiat_concept_creator_ontologize", "CB-UIAT-CONCEPT-CREATOR-ONTOLOGIZE", 8, 0, false);
        declareFunction("cb_uiat_concept_creator_show_typein_box", "CB-UIAT-CONCEPT-CREATOR-SHOW-TYPEIN-BOX", 3, 0, false);
        declareFunction("cb_uiat_concept_creator_hidden_field_names", "CB-UIAT-CONCEPT-CREATOR-HIDDEN-FIELD-NAMES", 1, 0, false);
        declareFunction("cb_uiat_handle_concept_creator_ontologize", "CB-UIAT-HANDLE-CONCEPT-CREATOR-ONTOLOGIZE", 1, 0, false);
        declareFunction("uiat_rule_constructor_hint", "UIAT-RULE-CONSTRUCTOR-HINT", 1, 0, false);
        declareFunction("uiat_rule_constructor_child_completed", "UIAT-RULE-CONSTRUCTOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_rule_constructor_child_rejected", "UIAT-RULE-CONSTRUCTOR-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_rule_constructor_child_invalidated", "UIAT-RULE-CONSTRUCTOR-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_rule_constructor_handle_assertion_success", "UIAT-RULE-CONSTRUCTOR-HANDLE-ASSERTION-SUCCESS", 2, 1, false);
        declareFunction("uiat_rule_constructor_rule_not_asserted_message", "UIAT-RULE-CONSTRUCTOR-RULE-NOT-ASSERTED-MESSAGE", 1, 0, false);
        declareFunction("uiat_rc_prepare_editing_else_clause", "UIAT-RC-PREPARE-EDITING-ELSE-CLAUSE", 2, 0, false);
        declareFunction("uiat_rc_ensure_rhs_not_understood_msg", "UIAT-RC-ENSURE-RHS-NOT-UNDERSTOOD-MSG", 0, 0, false);
        declareFunction("uiat_rule_constructor_rhs_not_understood", "UIAT-RULE-CONSTRUCTOR-RHS-NOT-UNDERSTOOD", 1, 0, false);
        declareFunction("uiat_rule_constructor_specify_action", "UIAT-RULE-CONSTRUCTOR-SPECIFY-ACTION", 2, 1, false);
        declareFunction("cb_uiat_rule_constructor_display", "CB-UIAT-RULE-CONSTRUCTOR-DISPLAY", 1, 0, false);
        declareFunction("uia_act_new_rule_constructor_for_consequent", "UIA-ACT-NEW-RULE-CONSTRUCTOR-FOR-CONSEQUENT", 2, 1, false);
        declareFunction("uia_act_new_rule_constructor", "UIA-ACT-NEW-RULE-CONSTRUCTOR", 1, 4, false);
        declareFunction("cb_link_uia_rule_constructor_from_cycl", "CB-LINK-UIA-RULE-CONSTRUCTOR-FROM-CYCL", 2, 0, false);
        declareFunction("cb_uia_rule_constructor_from_cycl", "CB-UIA-RULE-CONSTRUCTOR-FROM-CYCL", 1, 0, false);
        declareFunction("cb_uiat_analogy_developer_render_request", "CB-UIAT-ANALOGY-DEVELOPER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_analogy_developer_guts", "CB-ANALOGY-DEVELOPER-GUTS", 5, 0, false);
        declareFunction("cb_uia_analogy_developer_handler", "CB-UIA-ANALOGY-DEVELOPER-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_analogy_developer_guts", "CB-LINK-UIA-ANALOGY-DEVELOPER-GUTS", 3, 0, false);
        declareFunction("cb_uia_analogy_developer_guts", "CB-UIA-ANALOGY-DEVELOPER-GUTS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_tools_introduction_file() {
        defparameter("*CB-UIAT-CONCEPT-CREATOR-SHOW-TEMPLATE-TOPICS?*", NIL);
        deflexical("*CB-UIAT-CONCEPT-CREATOR-ONTOLOGIZE-FIELDS*", $list_alt76);
        deflexical("*UIAT-RC-RHS-NOT-UNDERSTOOD-MSG*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_tools_introduction_file() {
                cb_uia_tool_declaration.declare_cb_uia_tool($SENTENCE_RELATOR, $list_alt1);
        html_macros.note_html_handler_function(CB_UIAT_SENTENCE_RELATOR_HANDLER);
        cb_uia_tool_declaration.declare_cb_uia_tool($CONCEPT_CREATOR, $list_alt25);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_CONCEPT_CREATOR_PREFERRED_PHRASE);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_CONCEPT_CREATOR_ONTOLOGIZE);
        uia_tool_declaration.declare_uia_tool($RULE_CONSTRUCTOR, $list_alt83);
        cb_uia_tool_declaration.declare_cb_uia_tool($RULE_CONSTRUCTOR, $list_alt84);
        cb_utilities.setup_cb_link_method($UIA_RULE_CONSTRUCTOR_FROM_CYCL, CB_LINK_UIA_RULE_CONSTRUCTOR_FROM_CYCL, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_RULE_CONSTRUCTOR_FROM_CYCL);
        cb_uia_tool_declaration.declare_cb_uia_tool($ANALOGY_DEVELOPER, $list_alt139);
        html_macros.note_html_handler_function(CB_UIA_ANALOGY_DEVELOPER_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_ANALOGY_DEVELOPER_GUTS, CB_LINK_UIA_ANALOGY_DEVELOPER_GUTS, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_ANALOGY_DEVELOPER_GUTS);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $SENTENCE_RELATOR = makeKeyword("SENTENCE-RELATOR");

    static private final SubLList $list_alt1 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-SENTENCE-RELATOR-RENDER-REQUEST"));

    static private final SubLList $list_alt2 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("SIGNATURE"), makeSymbol("PLIST"));



    static private final SubLList $list_alt4 = list(makeSymbol("&KEY"), makeSymbol("SENT-A"), makeSymbol("SENT-B"), makeSymbol("RELATIONS"), makeSymbol("DEFAULT-RELATION"));

    static private final SubLList $list_alt5 = list(makeKeyword("SENT-A"), makeKeyword("SENT-B"), makeKeyword("RELATIONS"), makeKeyword("DEFAULT-RELATION"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $SENT_A = makeKeyword("SENT-A");

    private static final SubLSymbol $SENT_B = makeKeyword("SENT-B");

    private static final SubLSymbol $RELATIONS = makeKeyword("RELATIONS");

    private static final SubLSymbol $DEFAULT_RELATION = makeKeyword("DEFAULT-RELATION");

    static private final SubLString $str_alt11$cb_uiat_sentence_relator_handler = makeString("cb-uiat-sentence-relator-handler");

    static private final SubLString $str_alt12$ui_id = makeString("ui-id");

    static private final SubLString $str_alt13$How_do_you_want_to_relate_the_sen = makeString("How do you want to relate the sentence");

    static private final SubLString $str_alt14$to_the_following_sentence_ = makeString("to the following sentence:");



    static private final SubLString $$$sentence = makeString("sentence");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $$$virtual = makeString("virtual");

    static private final SubLString $$$choices = makeString("choices");

    static private final SubLString $$$Submit = makeString("Submit");

    private static final SubLSymbol $RELATIONSHIP = makeKeyword("RELATIONSHIP");

    private static final SubLSymbol $REPLY = makeKeyword("REPLY");

    private static final SubLSymbol CB_UIAT_SENTENCE_RELATOR_HANDLER = makeSymbol("CB-UIAT-SENTENCE-RELATOR-HANDLER");

    private static final SubLSymbol $CONCEPT_CREATOR = makeKeyword("CONCEPT-CREATOR");

    static private final SubLList $list_alt25 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-CONCEPT-CREATOR-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycConceptCreator")));

    private static final SubLSymbol $ONTOLOGIZE = makeKeyword("ONTOLOGIZE");

    static private final SubLList $list_alt27 = list(makeSymbol("&KEY"), makeSymbol("PHRASE"), makeSymbol("TERM"), list(makeSymbol("ISA"), NIL), list(makeSymbol("GENLS"), NIL), list(makeSymbol("SIMILAR"), NIL), list(makeSymbol("ISA-TEMPLATES")), list(makeSymbol("GENLS-TEMPLATES")));

    static private final SubLList $list_alt28 = list(makeKeyword("PHRASE"), $TERM, makeKeyword("ISA"), makeKeyword("GENLS"), makeKeyword("SIMILAR"), makeKeyword("ISA-TEMPLATES"), makeKeyword("GENLS-TEMPLATES"));











    private static final SubLSymbol $ISA_TEMPLATES = makeKeyword("ISA-TEMPLATES");

    private static final SubLSymbol $GENLS_TEMPLATES = makeKeyword("GENLS-TEMPLATES");

    static private final SubLString $str_alt36$cb_uiat_handle_concept_creator_pr = makeString("cb-uiat-handle-concept-creator-preferred-phrase");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $str_alt38$How_should_we_refer_to_ = makeString("How should we refer to ");

    static private final SubLString $str_alt39$__ = makeString(" ?");

    static private final SubLString $str_alt40$preferred_phrase = makeString("preferred-phrase");

    public static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLSymbol $PREFERRED_PHRASE = makeKeyword("PREFERRED-PHRASE");

    private static final SubLSymbol CB_UIAT_HANDLE_CONCEPT_CREATOR_PREFERRED_PHRASE = makeSymbol("CB-UIAT-HANDLE-CONCEPT-CREATOR-PREFERRED-PHRASE");

    static private final SubLString $str_alt44$Assuming_that_the_string__s_is_a_ = makeString("Assuming that the string ~s is a good way to refer to the new concept ~s.");

    static private final SubLString $str_alt45$cb_uiat_handle_concept_creator_on = makeString("cb-uiat-handle-concept-creator-ontologize");

    static private final SubLString $str_alt46$Please_describe_the_new_concept_ = makeString("Please describe the new concept:");



    static private final SubLString $$$The_best_way_to_refer_to_it_is = makeString("The best way to refer to it is");



    static private final SubLString $$$preferred = makeString("preferred");

    static private final SubLString $str_alt51$Please_fill_in_at_least_one_of_th = makeString("Please fill in at least one of the following about it:");



    static private final SubLString $$$It_is_similar_to = makeString("It is similar to");

    static private final SubLString $$$similar = makeString("similar");

    static private final SubLString $$$It_is_an_instance_of = makeString("It is an instance of");

    static private final SubLString $$$isa = makeString("isa");

    static private final SubLString $str_alt57$often_occurring_instances = makeString("often-occurring instances");

    static private final SubLString $str_alt58$Instances_in_this_list_occur_so_o = makeString("Instances in this list occur so often that they have fast form-based entry support for fleshing out.");

    static private final SubLString $str_alt59$template_isa = makeString("template_isa");

    static private final SubLList $list_alt60 = list(makeSymbol("TEMPLATE-ISA"), makeSymbol("TEMPLATE-TOPIC"));

    static private final SubLString $str_alt61$__ = makeString(" (");

    static private final SubLString $str_alt62$_ = makeString(")");

    static private final SubLString $$$None_selected = makeString("None selected");

    static private final SubLString $$$It_is_a_more_specific_kind_of = makeString("It is a more specific kind of");

    static private final SubLString $$$genls = makeString("genls");

    static private final SubLString $str_alt66$often_occurring_kinds = makeString("often-occurring kinds");

    static private final SubLString $str_alt67$Kinds_in_this_list_occur_so_often = makeString("Kinds in this list occur so often that they have fast form-based entry support for fleshing out.");

    static private final SubLString $str_alt68$template_genls = makeString("template_genls");

    static private final SubLList $list_alt69 = list(makeSymbol("TEMPLATE-GENLS"), makeSymbol("TEMPLATE-TOPIC"));

    static private final SubLString $str_alt70$Note__ = makeString("Note: ");

    static private final SubLString $$$Elements_with = makeString("Elements with");

    static private final SubLString $str_alt72$highlighting_contain_information_ = makeString("highlighting contain information suggested by the system; you must delete such information if you do not agree with it.");

    static private final SubLString $str_alt73$default_ = makeString("default-");

    static private final SubLString $str_alt74$_value = makeString("-value");

    static private final SubLString $str_alt75$_phrase = makeString("-phrase");

    static private final SubLList $list_alt76 = list(list(makeString("isa"), makeKeyword("ISA-TERM")), list(makeString("genls"), makeKeyword("GENL-TERM")), list(makeString("similar"), makeKeyword("SIMILAR-TERM")), list(makeString("preferred"), makeKeyword("PREFERRED-PHRASE")), list(makeString("template_isa"), makeKeyword("TEMPLATE-ISA"), makeSymbol("PARSE-INTEGER")), list(makeString("template_genls"), makeKeyword("TEMPLATE-GENLS"), makeSymbol("PARSE-INTEGER")));

    static private final SubLList $list_alt77 = list(makeSymbol("BASIC-FIELD-NAME"), makeSymbol("ONTOLOGIZE-TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("CONVERTER"), list(QUOTE, makeSymbol("TO-STRING"))));



    private static final SubLSymbol $ACCEPTED_TERMS = makeKeyword("ACCEPTED-TERMS");



    private static final SubLSymbol CB_UIAT_HANDLE_CONCEPT_CREATOR_ONTOLOGIZE = makeSymbol("CB-UIAT-HANDLE-CONCEPT-CREATOR-ONTOLOGIZE");

    private static final SubLSymbol $RULE_CONSTRUCTOR = makeKeyword("RULE-CONSTRUCTOR");

    static private final SubLList $list_alt83 = list(new SubLObject[]{ $NAME, makeString("Rule Constructor"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-RULE-CONSTRUCTOR-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-RULE-CONSTRUCTOR-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-RULE-CONSTRUCTOR-CHILD-INVALIDATED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-RULE-CONSTRUCTOR-CHILD-REJECTED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycRuleConstructor")) });

    static private final SubLList $list_alt84 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAT-RULE-CONSTRUCTOR-DISPLAY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycRuleConstructor")));

    static private final SubLList $list_alt85 = list(makeSymbol("IF"), makeSymbol("THEN"));

    static private final SubLString $str_alt86$Construct_New_Rule__If__a_then__a = makeString("Construct New Rule: If ~a then ~a");

    static private final SubLString $$$Construct_a_New_Rule = makeString("Construct a New Rule");

    private static final SubLSymbol $SCENARIO_CONSTRUCTOR = makeKeyword("SCENARIO-CONSTRUCTOR");







    private static final SubLSymbol $RC_ACT = makeKeyword("RC-ACT");

    private static final SubLSymbol $ADD_EXCEPTIONS = makeKeyword("ADD-EXCEPTIONS");

    private static final SubLSymbol $RC_EXCEPTION_SCENARIO = makeKeyword("RC-EXCEPTION-SCENARIO");

    private static final SubLSymbol $THEN_CLAUSE = makeKeyword("THEN-CLAUSE");

    private static final SubLSymbol $UPDATE_THEN_SCENARIO = makeKeyword("UPDATE-THEN-SCENARIO");

    private static final SubLSymbol $RC_THEN_SCENARIO = makeKeyword("RC-THEN-SCENARIO");

    private static final SubLSymbol $RC_SCENARIO = makeKeyword("RC-SCENARIO");

    private static final SubLSymbol $USE_SCENARIO = makeKeyword("USE-SCENARIO");

    private static final SubLSymbol $ASSERTION_CREATOR = makeKeyword("ASSERTION-CREATOR");





    private static final SubLSymbol $SENTENCE_READER = makeKeyword("SENTENCE-READER");

    private static final SubLSymbol SM_INDEXICAL_P = makeSymbol("SM-INDEXICAL-P");

    private static final SubLSymbol $THEN_CYCL_SENTENCE = makeKeyword("THEN-CYCL-SENTENCE");

    private static final SubLSymbol $SENTENCE_FINDER = makeKeyword("SENTENCE-FINDER");

    private static final SubLSymbol $DISAMBIGUATE_PHRASE = makeKeyword("DISAMBIGUATE-PHRASE");

    private static final SubLSymbol $RC_STATE = makeKeyword("RC-STATE");



    static private final SubLString $str_alt110$Exceptions_to_ = makeString("Exceptions to ");



    static private final SubLString $$$Rule_not_added = makeString("Rule not added");

    static private final SubLString $$$Else_Clause = makeString("Else Clause");

    static private final SubLString $str_alt114$Either_your_input_was_not_underst = makeString("Either your input was not understood,");

    static private final SubLString $str_alt115$_or_it_did_not_contain_any_ = makeString(" or it did not contain any ");

    static private final SubLString $str_alt116$_ = makeString(".");

    static private final SubLString $str_alt117$_Please_retry_entering_the_else_c = makeString(" Please retry entering the else clause in the ");

    static private final SubLString $str_alt118$_which_will_launch_automatically_ = makeString(" which will launch automatically upon acknowledgement of");

    static private final SubLString $str_alt119$_this_message_ = makeString(" this message.");

    private static final SubLSymbol $RC_ACT_PARAMETER = makeKeyword("RC-ACT-PARAMETER");

    private static final SubLSymbol $THEN_SENTENCE = makeKeyword("THEN-SENTENCE");

    private static final SubLSymbol $FIND_SCENARIOS = makeKeyword("FIND-SCENARIOS");

    private static final SubLSymbol $BUILD_SCENARIO = makeKeyword("BUILD-SCENARIO");

    private static final SubLSymbol $IF_SENTENCE = makeKeyword("IF-SENTENCE");

    private static final SubLSymbol $PARSE_RHS = makeKeyword("PARSE-RHS");

    private static final SubLSymbol $PASTE_RHS = makeKeyword("PASTE-RHS");



    private static final SubLSymbol $ASSERT_EXCEPTION = makeKeyword("ASSERT-EXCEPTION");



    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt131$cb_uia_rule_constructor_from_cycl = makeString("cb-uia-rule-constructor-from-cycl");

    private static final SubLSymbol $UIA_RULE_CONSTRUCTOR_FROM_CYCL = makeKeyword("UIA-RULE-CONSTRUCTOR-FROM-CYCL");

    private static final SubLSymbol CB_LINK_UIA_RULE_CONSTRUCTOR_FROM_CYCL = makeSymbol("CB-LINK-UIA-RULE-CONSTRUCTOR-FROM-CYCL");

    static private final SubLList $list_alt134 = list(makeSymbol("CYCL-IMPLICATION"));

    public static final SubLObject $$implies = constant_handles.reader_make_constant_shell(makeString("implies"));

    static private final SubLString $str_alt136$Error__invalid_rule_for_Rule_Cons = makeString("Error: invalid rule for Rule Constructor.");

    private static final SubLSymbol CB_UIA_RULE_CONSTRUCTOR_FROM_CYCL = makeSymbol("CB-UIA-RULE-CONSTRUCTOR-FROM-CYCL");

    private static final SubLSymbol $ANALOGY_DEVELOPER = makeKeyword("ANALOGY-DEVELOPER");

    static private final SubLList $list_alt139 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-ANALOGY-DEVELOPER-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycAnalogyTool")));

    static private final SubLList $list_alt140 = list(makeSymbol("&KEY"), makeSymbol("TARGET-TERM"), makeSymbol("SOURCE-TERM"), makeSymbol("EQUALS"), makeSymbol("CANDIDATE-SENTENCES"));

    static private final SubLList $list_alt141 = list(makeKeyword("TARGET-TERM"), makeKeyword("SOURCE-TERM"), makeKeyword("EQUALS"), makeKeyword("CANDIDATE-SENTENCES"));

    private static final SubLSymbol $TARGET_TERM = makeKeyword("TARGET-TERM");

    private static final SubLSymbol $SOURCE_TERM = makeKeyword("SOURCE-TERM");



    private static final SubLSymbol $CANDIDATE_SENTENCES = makeKeyword("CANDIDATE-SENTENCES");

    static private final SubLString $str_alt146$cb_uia_analogy_developer_handler = makeString("cb-uia-analogy-developer-handler");

    static private final SubLString $str_alt147$num_candidates = makeString("num-candidates");

    static private final SubLString $str_alt148$_and_ = makeString(" and ");

    static private final SubLString $str_alt149$_are_exactly_the_same_ = makeString(" are exactly the same.");

    static private final SubLString $$$OK = makeString("OK");

    static private final SubLString $str_alt151$I_don_t_know_anything_about_ = makeString("I don't know anything about ");

    static private final SubLString $str_alt152$_that_could_also_be_true_of_ = makeString(" that could also be true of ");

    static private final SubLString $str_alt153$_but_that_I_don_t_already_know_to = makeString(" but that I don't already know to be true of ");

    private static final SubLSymbol $UIA_SALIENT_DESCRIPTOR_REQUIRED = makeKeyword("UIA-SALIENT-DESCRIPTOR-REQUIRED");

    static private final SubLString $str_alt155$_Tell_me_more_about__A__ = makeString("[Tell me more about ~A.]");

    static private final SubLString $str_alt156$Forget_it_ = makeString("Forget it.");

    static private final SubLString $str_alt157$Which_of_the_following_things_I_k = makeString("Which of the following things I know about ");

    static private final SubLString $str_alt158$_are_also_true_of_ = makeString(" are also true of ");

    static private final SubLString $str_alt159$_ = makeString("?");

    static private final SubLString $$$on = makeString("on");

    static private final SubLString $$$off = makeString("off");



    static private final SubLString $str_alt163$Ask_FIRE_ = makeString("Ask FIRE!");

    static private final SubLString $$$fire = makeString("fire");


    private static final SubLSymbol $PROMOTED = makeKeyword("PROMOTED");

    static private final SubLString $str_alt167$unexpected_result_from_one_of_the = makeString("unexpected result from one of the Analogy Developer's widgets: ~a");




    private static final SubLSymbol CB_UIA_ANALOGY_DEVELOPER_HANDLER = makeSymbol("CB-UIA-ANALOGY-DEVELOPER-HANDLER");

    static private final SubLString $str_alt171$cb_uia_analogy_developer_guts = makeString("cb-uia-analogy-developer-guts");

    private static final SubLSymbol $UIA_ANALOGY_DEVELOPER_GUTS = makeKeyword("UIA-ANALOGY-DEVELOPER-GUTS");

    private static final SubLSymbol CB_LINK_UIA_ANALOGY_DEVELOPER_GUTS = makeSymbol("CB-LINK-UIA-ANALOGY-DEVELOPER-GUTS");

    static private final SubLList $list_alt174 = list(makeSymbol("TARGET-TERM"), makeSymbol("SOURCE-TERM"));

    private static final SubLSymbol $LAUNCH = makeKeyword("LAUNCH");

    private static final SubLSymbol $TARGET_PHRASE = makeKeyword("TARGET-PHRASE");

    private static final SubLSymbol $SOURCE_PHRASE = makeKeyword("SOURCE-PHRASE");

    private static final SubLSymbol CB_UIA_ANALOGY_DEVELOPER_GUTS = makeSymbol("CB-UIA-ANALOGY-DEVELOPER-GUTS");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cb_uia_tools_introduction_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_uia_tools_introduction_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_uia_tools_introduction_file();
    }
}

